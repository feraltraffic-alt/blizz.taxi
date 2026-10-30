# Sandbox transcript (2026-10-30T22:09:50Z, d1ff217)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20503"
}
```

```json
{
  "challenge_id": "2a0ebe74-c2f8-4139-9dc6-5ace5616a714",
  "expires_at": "2026-10-30T22:14:50.524470729Z",
  "resend_available_at": "2026-10-30T22:09:51.524470729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "154149",
  "sent_at": "2026-10-30T22:09:50.53404009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a0ebe74-c2f8-4139-9dc6-5ace5616a714",
  "code": "154149",
  "device_ref": "sandbox-20503"
}
```

```json
{
  "session_id": "8b7962ba-49a6-45e8-bd3a-8665f9b4cc21",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTA5NSwiaWF0IjoxNzkzMzk4MTk1LCJqdGkiOiJlNjFhZTk5Zi1iNTI0LTRlODYtYmI3OS0zMGIyN2NkYjA5MzciLCJzaWQiOiI4Yjc5NjJiYS00OWE2LTQ1ZTgtYmQzYS04NjY1ZjliNGNjMjEifQ.zHKc_0onoEfRtJbyoxntSPJpkDc45IdS8J3tk00YAew",
  "access_expires_at": "2026-10-30T22:24:55.614474709Z",
  "refresh_token": "IAS2MxibDO0szLPc8ZQfyIqh79PEKlr72xw4NlkauM0",
  "refresh_expires_at": "2026-11-29T22:09:55.612848482Z",
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
  "device_ref": "sandbox-16488"
}
```

```json
{
  "challenge_id": "0c919e70-2a6b-411d-9994-d41e9b72a502",
  "expires_at": "2026-10-30T22:14:56.097965625Z",
  "resend_available_at": "2026-10-30T22:09:57.097965625Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "582890",
  "sent_at": "2026-10-30T22:09:56.101611199Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c919e70-2a6b-411d-9994-d41e9b72a502",
  "code": "582890",
  "device_ref": "sandbox-16488"
}
```

```json
{
  "session_id": "5fb160b7-2d09-4a14-8f6c-6acaee3d73d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTA5NiwiaWF0IjoxNzkzMzk4MTk2LCJqdGkiOiI3ZmEyNGEyYS01YTU0LTQ1ODAtYTBhYi00MzNmOTAwZWIwNjUiLCJzaWQiOiI1ZmIxNjBiNy0yZDA5LTRhMTQtOGY2Yy02YWNhZWUzZDczZDgifQ.dq_3Le79I3scF8_G-MDYJ90VuZjDUnqeCmDqV7Wae-I",
  "access_expires_at": "2026-10-30T22:24:56.316351527Z",
  "refresh_token": "S9GLCS9Oo4U9xb23p5QqbOlvHvhHi-wvh3Za2tNAC1E",
  "refresh_expires_at": "2026-11-29T22:09:56.315409619Z",
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
  "correlation_id": "d2d315c0-aa5e-4667-a189-7a54ac8cd024"
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
  "session_id": "31816a96-4d6f-469b-851b-8371e6ee0157",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkwOTcsImlhdCI6MTc5MzM5ODE5NywianRpIjoiMzAwMTNmZWItMDRkNy00MzM4LWI2ZWItODFhYmRiMGQ3MjQ4Iiwic2lkIjoiMzE4MTZhOTYtNGQ2Zi00NjliLTg1MWItODM3MWU2ZWUwMTU3In0.P0fmaE_cG4IiG9QDTYfKRNVsedgx4vkZirZnWZMrlbY",
  "access_expires_at": "2026-10-30T22:24:57.303288991Z",
  "refresh_token": "IBZWYDIifZJBvyu8R8s4XVHJQq2deJQG1t4z3p8UDB0",
  "refresh_expires_at": "2026-10-31T10:09:57.302489346Z",
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
  "session_id": "67ad4287-da16-4740-a156-c83454f3578a",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkwOTgsImlhdCI6MTc5MzM5ODE5OCwianRpIjoiZmExMTAwMDEtMmY2Yi00ZWEyLTg5YzEtOWVhYTYxODQ0NzM1Iiwic2lkIjoiNjdhZDQyODctZGExNi00NzQwLWExNTYtYzgzNDU0ZjM1NzhhIn0.J5hQQ27PK3dcYenN7bx6G16mv6jNfcWCHF7ncNAqJQk",
  "access_expires_at": "2026-10-30T22:24:58.541340262Z",
  "refresh_token": "GtUDTDfd_Cd5r7nx2FmNlHBGWUgzLkjLyj3Gxu1oojQ",
  "refresh_expires_at": "2026-10-31T10:09:58.540717493Z",
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
  "session_id": "f943868c-b26e-4470-ba2a-7b8ef8c45474",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkwOTgsImlhdCI6MTc5MzM5ODE5OCwianRpIjoiNjBiOGNkZDItOGUzOC00MDkwLWE2N2ItYzY3ZjQ1MjgzMDNlIiwic2lkIjoiZjk0Mzg2OGMtYjI2ZS00NDcwLWJhMmEtN2I4ZWY4YzQ1NDc0In0.DwViA0Cy0mlMQuOn22eCnpwHjwurGQfpAp1FZ6UDdqg",
  "access_expires_at": "2026-10-30T22:24:58.949966996Z",
  "refresh_token": "YLgIX8UlXeAd97WpvsHn5YLCbXDNbLzKispx0uRzQ5g",
  "refresh_expires_at": "2026-10-31T10:09:58.949212639Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6102"
}
```

```json
{
  "challenge_id": "72796326-2e72-4913-8496-1d0c53297290",
  "expires_at": "2026-10-30T22:14:59.142121022Z",
  "resend_available_at": "2026-10-30T22:10:00.142121022Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "237260",
  "sent_at": "2026-10-30T22:09:59.145631999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72796326-2e72-4913-8496-1d0c53297290",
  "code": "237260",
  "device_ref": "sandbox-6102"
}
```

```json
{
  "session_id": "31cbe7df-2084-486d-bcc0-0fd06f23bc6e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTA5OSwiaWF0IjoxNzkzMzk4MTk5LCJqdGkiOiJkYWEyMjAwYy1jYmQ1LTRhNDEtYTc2OS00M2M0MzhlZjQ2ZTQiLCJzaWQiOiIzMWNiZTdkZi0yMDg0LTQ4NmQtYmNjMC0wZmQwNmYyM2JjNmUifQ.CAiqikdd8k3vRnmkeR6n-Qgg9-9mwCD6xicccsEp-B0",
  "access_expires_at": "2026-10-30T22:24:59.358835176Z",
  "refresh_token": "t3UU709FdTmHCnYu9OKp3T2DTOXwolLkk7pyPC9a16k",
  "refresh_expires_at": "2026-11-29T22:09:59.358172081Z",
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
  "command_id": "d48725a3-fb7d-4288-9270-4fc0af0df1ec",
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
  "command_id": "d8157fe2-ec23-43a3-808d-cd7195b426c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:00Z",
    "sequence": 1793398200177
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
  "correlation_id": "fd7c6f05-44bb-466f-b0c4-36d2b5dcde57"
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
  "command_id": "122e3fe2-fe3c-494d-8265-b55987f0a376",
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
  "command_id": "34e6ab3f-764a-41df-ae0c-42d4b9da24cc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:01Z",
    "sequence": 1793398201125
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6a219f31-dac0-4442-b084-2042c342bf61",
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
  "last_heartbeat_at": "2026-10-30T22:10:01.144691Z",
  "last_location_at": "2026-10-30T22:10:01.144691Z",
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
  "command_id": "9e84761b-d2a3-4182-b1ed-1edd30076ebb",
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
  "session_id": "6a219f31-dac0-4442-b084-2042c342bf61",
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
  "last_heartbeat_at": "2026-10-30T22:10:01.144691Z",
  "last_location_at": "2026-10-30T22:10:01.144691Z",
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
  "phone": "+380687386482",
  "device_ref": "sandbox-2727"
}
```

```json
{
  "challenge_id": "99610581-c61d-414b-ab29-e5956bdb726a",
  "expires_at": "2026-10-30T22:15:01.970940164Z",
  "resend_available_at": "2026-10-30T22:10:02.970940164Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687386482` → **200**

```json
{
  "phone": "+380687386482",
  "audience": "CLIENT",
  "code": "517776",
  "sent_at": "2026-10-30T22:10:01.97461227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99610581-c61d-414b-ab29-e5956bdb726a",
  "code": "517776",
  "device_ref": "sandbox-2727"
}
```

```json
{
  "session_id": "6b1cf64d-f8da-43eb-93b7-ec8b146984d0",
  "subject": {
    "type": "CLIENT",
    "id": "74a07c29-1265-4731-8ad9-fdafaf8b3017"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NGEwN2MyOS0xMjY1LTQ3MzEtOGFkOS1mZGFmYWY4YjMwMTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5MTAyLCJpYXQiOjE3OTMzOTgyMDIsImp0aSI6IjQ1YTFkNDM0LWRhMjUtNDNjYy1iY2NmLTg0MTk2MTk0YjdjYiIsInNpZCI6IjZiMWNmNjRkLWY4ZGEtNDNlYi05M2I3LWVjOGIxNDY5ODRkMCJ9.ND3SN6fEOHKdY0AjGA9MbDQ1aNtgKabb6c78XRwsDXQ",
  "access_expires_at": "2026-10-30T22:25:02.209018024Z",
  "refresh_token": "RdIYGsbHEMqAjEGOi5khuIVHN38Gn-amc_5nvS_wk64",
  "refresh_expires_at": "2026-11-29T22:10:02.208480125Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0321188a-778d-4a16-bb51-1d9427efdbc5",
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
  "id": "a31af67c-222f-4e98-a152-da60a3edaaef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:15:02.429091Z",
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
  "command_id": "cae193f5-d053-45ba-bde4-d3b0f523c38a",
  "quote_id": "a31af67c-222f-4e98-a152-da60a3edaaef",
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
  "id": "337026c9-1669-4f4a-8471-a39da81b0a2c",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74a07c29-1265-4731-8ad9-fdafaf8b3017",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:10:02.695455Z",
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

`POST /api/driver/v1/orders/337026c9-1669-4f4a-8471-a39da81b0a2c/claim` → **409**

```json
{
  "command_id": "7698446e-80eb-4fc3-b8e4-8dc6694022c8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/337026c9-1669-4f4a-8471-a39da81b0a2c/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "5a2e961e-e804-4e8a-a839-660a325a47b7"
}
```

`GET /api/operator/v1/orders/337026c9-1669-4f4a-8471-a39da81b0a2c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:10:02.697677Z",
      "actor": {
        "type": "CLIENT",
        "id": "74a07c29-1265-4731-8ad9-fdafaf8b3017",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "337026c9-1669-4f4a-8471-a39da81b0a2c",
        "quote_id": "a31af67c-222f-4e98-a152-da60a3edaaef",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "303212a3-a50c-4c75-8f96-1ed332d9ba26"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:10:02.702016Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "337026c9-1669-4f4a-8471-a39da81b0a2c",
        "attempt_id": "a7fac91b-2ecd-4b11-8bfe-56a0d05edd57",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "303212a3-a50c-4c75-8f96-1ed332d9ba26"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T22:10:02.740143Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "337026c9-1669-4f4a-8471-a39da81b0a2c",
        "attempt_id": "a7fac91b-2ecd-4b11-8bfe-56a0d05edd57"
      },
      "correlation_id": "303212a3-a50c-4c75-8f96-1ed332d9ba26"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "a7fac91b-2ecd-4b11-8bfe-56a0d05edd57",
        "generation": 1,
        "started_at": "2026-10-30T22:10:02.700433Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T22:10:02.740143Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T22:10:02.703349Z",
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
  "command_id": "e7e1673a-a59c-4980-aea0-bfcffa278cdc",
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

`POST /api/driver/v1/work-sessions/6a219f31-dac0-4442-b084-2042c342bf61/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:04Z",
    "sequence": 1793398204174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6a219f31-dac0-4442-b084-2042c342bf61",
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
  "last_heartbeat_at": "2026-10-30T22:10:04.194771Z",
  "last_location_at": "2026-10-30T22:10:04.194771Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "cdc2b4c7-eabb-457b-bcb3-5f3a6f010fff",
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
  "id": "daf8dc05-2721-499b-86f8-f248770f0802",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/daf8dc05-2721-499b-86f8-f248770f0802/publish` → **200**

```json
{
  "command_id": "a89b3053-032b-49c4-a41b-aa648254fc8a",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "daf8dc05-2721-499b-86f8-f248770f0802",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "ba2f4e76-9a17-4c88-99fa-99287d273db7",
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
  "id": "59514b75-2776-4839-a5aa-c3c6d18fe16f",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/59514b75-2776-4839-a5aa-c3c6d18fe16f/publish` → **200**

```json
{
  "command_id": "408c94a5-b50d-49ff-b7a6-011966337749",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "59514b75-2776-4839-a5aa-c3c6d18fe16f",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "565c147f-f1e8-4b73-9d3b-bdc124cb4c67",
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
  "id": "89623b1c-1aed-4b3e-a48d-9ab03225df6c",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/89623b1c-1aed-4b3e-a48d-9ab03225df6c/publish` → **200**

```json
{
  "command_id": "83151759-1391-4ead-9946-a4a84ecdce59",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "89623b1c-1aed-4b3e-a48d-9ab03225df6c",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=daf8dc05-2721-499b-86f8-f248770f0802` → **200**

```json
[
  {
    "order_id": "337026c9-1669-4f4a-8471-a39da81b0a2c",
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

`GET /api/driver/v1/broadcast-orders?zone_id=59514b75-2776-4839-a5aa-c3c6d18fe16f` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=89623b1c-1aed-4b3e-a48d-9ab03225df6c` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bcfe361a-c436-46ed-8a1e-ec460e96ae4e"
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
  "command_id": "ea7389a1-b01f-43c4-b733-86b3ffd58988",
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

`GET /api/operator/v1/orders/337026c9-1669-4f4a-8471-a39da81b0a2c` → **200**

```json
{
  "id": "337026c9-1669-4f4a-8471-a39da81b0a2c",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74a07c29-1265-4731-8ad9-fdafaf8b3017",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:10:02.695455Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/337026c9-1669-4f4a-8471-a39da81b0a2c/cancel` → **200**

```json
{
  "command_id": "f68cd329-3f72-400c-8934-b07d8338116f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "337026c9-1669-4f4a-8471-a39da81b0a2c",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "74a07c29-1265-4731-8ad9-fdafaf8b3017",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:10:02.695455Z",
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
  "session_id": "6a219f31-dac0-4442-b084-2042c342bf61",
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
  "last_heartbeat_at": "2026-10-30T22:10:04.194771Z",
  "last_location_at": "2026-10-30T22:10:04.194771Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a219f31-dac0-4442-b084-2042c342bf61/close` → **200**

```json
{
  "command_id": "5c3e69af-ccfe-4fd3-b015-2337af18d467",
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
  "session_id": "1c53f9ee-47b7-45ad-8c8f-6d075660fb32",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkxMDcsImlhdCI6MTc5MzM5ODIwNywianRpIjoiYTJmNmEyYmMtNzkyZi00NmVkLThjZjQtMDhiZDE5NmE1NTJmIiwic2lkIjoiMWM1M2Y5ZWUtNDdiNy00NWFkLThjOGYtNmQwNzU2NjBmYjMyIn0.GGpyGGxWzxMi8H1mqaOV_YHL8fVCSJxYYwu5zFqFaNo",
  "access_expires_at": "2026-10-30T22:25:07.707139082Z",
  "refresh_token": "qvluWMJKCDFgkxlb27AQsEIFxvnztkFepsfr7nilOvA",
  "refresh_expires_at": "2026-10-31T10:10:07.706522629Z",
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
  "device_ref": "sandbox-6037"
}
```

```json
{
  "challenge_id": "3f483ff2-7c2c-46ef-914c-e0faacec1e77",
  "expires_at": "2026-10-30T22:15:08.122554533Z",
  "resend_available_at": "2026-10-30T22:10:09.122554533Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "149039",
  "sent_at": "2026-10-30T22:10:08.125594949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f483ff2-7c2c-46ef-914c-e0faacec1e77",
  "code": "149039",
  "device_ref": "sandbox-6037"
}
```

```json
{
  "session_id": "4f5379df-99e5-42e6-8574-180fa13a3060",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTEwOCwiaWF0IjoxNzkzMzk4MjA4LCJqdGkiOiJmMzQwZWIyOS1hYTZiLTQ4NDItYjg0OS02MzM4ZDc1ZWRiOTgiLCJzaWQiOiI0ZjUzNzlkZi05OWU1LTQyZTYtODU3NC0xODBmYTEzYTMwNjAifQ.Rm8W3ayXS_abQZ77tG_Xr-jcCv0SEs0FTSr4bPJ1rJw",
  "access_expires_at": "2026-10-30T22:25:08.327441397Z",
  "refresh_token": "SteUFrXiTW9kXd5sL8ACtJeb1lshbJe4IHEF2VCjmaI",
  "refresh_expires_at": "2026-11-29T22:10:08.327017589Z",
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
  "command_id": "27ae827e-77bf-4143-8014-a660a44f7e5c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:08Z",
    "sequence": 1793398208712
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7b37cf5-04fc-47c3-901f-6237b8378059",
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
  "last_heartbeat_at": "2026-10-30T22:10:08.72978Z",
  "last_location_at": "2026-10-30T22:10:08.72978Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632721891",
  "device_ref": "sandbox-7311"
}
```

```json
{
  "challenge_id": "c3cdd4c9-b7a6-4771-92fb-7334b0ec6605",
  "expires_at": "2026-10-30T22:15:08.922252273Z",
  "resend_available_at": "2026-10-30T22:10:09.922252273Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632721891` → **200**

```json
{
  "phone": "+380632721891",
  "audience": "CLIENT",
  "code": "013627",
  "sent_at": "2026-10-30T22:10:08.925218276Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3cdd4c9-b7a6-4771-92fb-7334b0ec6605",
  "code": "013627",
  "device_ref": "sandbox-7311"
}
```

```json
{
  "session_id": "a45f0925-5854-43a5-ab23-4e08306c0012",
  "subject": {
    "type": "CLIENT",
    "id": "5af262be-0ed1-46c5-9928-c4e63cfe7f6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWYyNjJiZS0wZWQxLTQ2YzUtOTkyOC1jNGU2M2NmZTdmNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5MTA5LCJpYXQiOjE3OTMzOTgyMDksImp0aSI6ImE1NmYxODZjLTcyOTQtNDQ1Zi05MTk4LWQ4YWU5OTVkZTJkMCIsInNpZCI6ImE0NWYwOTI1LTU4NTQtNDNhNS1hYjIzLTRlMDgzMDZjMDAxMiJ9.uAv8_rojyi5q6234hhm_k7KAZ4dFCKXSvBqbmkcyxeE",
  "access_expires_at": "2026-10-30T22:25:09.129823797Z",
  "refresh_token": "F312Pa0-phUBR-BGTzr-s49dowUQtdb-i4v1vV4G0XM",
  "refresh_expires_at": "2026-11-29T22:10:09.129417786Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "22bcb0ef-cf8a-4234-8f33-a7094f081513",
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
  "id": "c849f82a-73af-4f96-9cd8-677447cf81c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:15:09.330550Z",
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
  "command_id": "4a6e1d37-4e8e-4e1a-a98f-47396e51379a",
  "quote_id": "c849f82a-73af-4f96-9cd8-677447cf81c5",
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
  "id": "fd86ebff-4f35-470e-8825-019dfe1f81b0",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5af262be-0ed1-46c5-9928-c4e63cfe7f6e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:10:09.533748Z",
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
    "id": "3dd402af-5ded-4ca2-8c01-1dc214569f59",
    "order_id": "fd86ebff-4f35-470e-8825-019dfe1f81b0",
    "expires_at": "2026-10-30T22:10:24.536809Z",
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

`POST /api/driver/v1/offers/3dd402af-5ded-4ca2-8c01-1dc214569f59/accept` → **200**

```json
{
  "command_id": "b587ffc4-1a2c-49e4-abb2-35eccddbea4a"
}
```

```json
{
  "id": "a50b4ef8-3cdf-4e78-8399-222650e44e0d",
  "order_id": "fd86ebff-4f35-470e-8825-019dfe1f81b0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c729af21-0479-4363-97f1-0e99a07a2467",
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
  "command_id": "17a1c062-67c2-4073-8356-2160550caead",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T22:10:10.383438333Z"
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
  "id": "c729af21-0479-4363-97f1-0e99a07a2467",
  "order_id": "fd86ebff-4f35-470e-8825-019dfe1f81b0",
  "assignment_id": "a50b4ef8-3cdf-4e78-8399-222650e44e0d",
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

`POST /api/driver/v1/work-sessions/d7b37cf5-04fc-47c3-901f-6237b8378059/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:10Z",
    "sequence": 1793398210996
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7b37cf5-04fc-47c3-901f-6237b8378059",
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
  "last_heartbeat_at": "2026-10-30T22:10:11.014024Z",
  "last_location_at": "2026-10-30T22:10:11.014024Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c729af21-0479-4363-97f1-0e99a07a2467/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "71e9a06f-45ef-4e26-bac0-03d66a66d639",
  "expected_version": 0
}
```

```json
{
  "id": "c729af21-0479-4363-97f1-0e99a07a2467",
  "order_id": "fd86ebff-4f35-470e-8825-019dfe1f81b0",
  "assignment_id": "a50b4ef8-3cdf-4e78-8399-222650e44e0d",
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
  "arrived_at": "2026-10-30T22:10:11.218096Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c729af21-0479-4363-97f1-0e99a07a2467/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c32b8542-3241-46ac-842f-38ee5aa8ebce",
  "expected_version": 1
}
```

```json
{
  "id": "c729af21-0479-4363-97f1-0e99a07a2467",
  "order_id": "fd86ebff-4f35-470e-8825-019dfe1f81b0",
  "assignment_id": "a50b4ef8-3cdf-4e78-8399-222650e44e0d",
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
  "arrived_at": "2026-10-30T22:10:11.218096Z",
  "started_at": "2026-10-30T22:10:11.421801Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c729af21-0479-4363-97f1-0e99a07a2467/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "eb83904c-0ad1-46b6-8beb-1f60bb2ee0c0",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:10:11Z",
  "cash_received": true
}
```

```json
{
  "id": "c729af21-0479-4363-97f1-0e99a07a2467",
  "order_id": "fd86ebff-4f35-470e-8825-019dfe1f81b0",
  "assignment_id": "a50b4ef8-3cdf-4e78-8399-222650e44e0d",
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
  "arrived_at": "2026-10-30T22:10:11.218096Z",
  "started_at": "2026-10-30T22:10:11.421801Z",
  "completed_at": "2026-10-30T22:10:11.633045Z",
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
  "session_id": "d7b37cf5-04fc-47c3-901f-6237b8378059",
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
  "last_heartbeat_at": "2026-10-30T22:10:11.014024Z",
  "last_location_at": "2026-10-30T22:10:11.014024Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7b37cf5-04fc-47c3-901f-6237b8378059/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "60897348-054c-47b8-975d-68702270879b",
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
  "command_id": "85319609-115e-496c-b594-1deceb6d5953",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:12Z",
    "sequence": 1793398212247
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
  "correlation_id": "da78a2df-88a8-4716-aec7-43fd697cb3ea",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "879b70c9-59c8-4054-8b7c-3fb0ad146c78",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:12Z",
    "sequence": 1793398212462
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29c57241-a90f-4cde-94fb-6000196c2e6c",
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
  "last_heartbeat_at": "2026-10-30T22:10:12.480875Z",
  "last_location_at": "2026-10-30T22:10:12.480875Z",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T22:10:10.383438Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "899e8013-d666-4ea0-9323-98c79571e73b",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T22:10:12.885879131Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29c57241-a90f-4cde-94fb-6000196c2e6c",
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
  "last_heartbeat_at": "2026-10-30T22:10:12.480875Z",
  "last_location_at": "2026-10-30T22:10:12.480875Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29c57241-a90f-4cde-94fb-6000196c2e6c/close` → **200**

```json
{
  "command_id": "84ad3205-3842-4f5c-8803-675df9a377cc",
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
  "session_id": "e3ef4f30-36fd-4b92-bf4f-2159796c8ff0",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkxMTMsImlhdCI6MTc5MzM5ODIxMywianRpIjoiY2IyNzNhZTMtMmRjNC00ZmM0LTkxZmEtYmQ1MTUxMzk3ZWIyIiwic2lkIjoiZTNlZjRmMzAtMzZmZC00YjkyLWJmNGYtMjE1OTc5NmM4ZmYwIn0.9PsIuqEX2gFlESZ8e6OfrQ9bWObV-mF_dXnClFaib80",
  "access_expires_at": "2026-10-30T22:25:13.69367465Z",
  "refresh_token": "W8EpZFhjOKVnRQZV97R-q46a85wJmcYku0bdqm_WzvA",
  "refresh_expires_at": "2026-10-31T10:10:13.693135468Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "3c935240-c9a8-4c6c-b468-318374fcb4af",
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
  "id": "50db2711-b983-48cf-87d6-9470da54844a",
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
  "created_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "created_at": "2026-10-30T22:10:13.900355Z",
  "updated_at": "2026-10-30T22:10:13.900355Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631259949",
  "device_ref": "sandbox-20332"
}
```

```json
{
  "challenge_id": "1da7cdc8-4245-4ee6-a030-bd538c53a627",
  "expires_at": "2026-10-30T22:15:14.107195076Z",
  "resend_available_at": "2026-10-30T22:10:15.107195076Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631259949` → **200**

```json
{
  "phone": "+380631259949",
  "audience": "CLIENT",
  "code": "449346",
  "sent_at": "2026-10-30T22:10:14.109954721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1da7cdc8-4245-4ee6-a030-bd538c53a627",
  "code": "449346",
  "device_ref": "sandbox-20332"
}
```

```json
{
  "session_id": "e909f3b9-8430-4b0b-86a5-e268587e7269",
  "subject": {
    "type": "CLIENT",
    "id": "f38ea038-896c-40eb-a9fe-b05caf3ca4c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzhlYTAzOC04OTZjLTQwZWItYTlmZS1iMDVjYWYzY2E0YzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5MTE0LCJpYXQiOjE3OTMzOTgyMTQsImp0aSI6ImUwNTVhMzE1LTQ2YjEtNDY1Ny1hMjYzLTQ0OGZmOGEwOTM0YyIsInNpZCI6ImU5MDlmM2I5LTg0MzAtNGIwYi04NmE1LWUyNjg1ODdlNzI2OSJ9.5WhiPOhabGncQYlcC94Ia90ts95UXQdH1KqYJpN-xCk",
  "access_expires_at": "2026-10-30T22:25:14.315027663Z",
  "refresh_token": "L6PDiV-7V1Z9wdfbsPA8qExPcuB_y_IwoueTtf_5Puk",
  "refresh_expires_at": "2026-11-29T22:10:14.314535797Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631259949` → **200**

```json
{
  "client_id": "f38ea038-896c-40eb-a9fe-b05caf3ca4c5"
}
```

`POST /api/admin/v1/rider-wallets/f38ea038-896c-40eb-a9fe-b05caf3ca4c5/top-ups` → **201**

```json
{
  "command_id": "8beec990-2bd4-4c11-8b4e-7004f134d415",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f38ea038-896c-40eb-a9fe-b05caf3ca4c5",
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
      "id": "1967f9a3-d33b-40e4-a2db-4f738d8bfe69",
      "at": "2026-10-30T22:10:14.701815Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e43068f5-8425-4bce-b6f7-2fd23ed2a026",
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
  "id": "eced0f00-c238-40ad-abe1-e962daecf0d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:15:14.916600Z",
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
      "id": "50db2711-b983-48cf-87d6-9470da54844a",
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
  "device_ref": "sandbox-14499"
}
```

```json
{
  "challenge_id": "ba8a5573-e7ce-4bef-9447-63160aeeb255",
  "expires_at": "2026-10-30T22:15:15.12164073Z",
  "resend_available_at": "2026-10-30T22:10:16.12164073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "261746",
  "sent_at": "2026-10-30T22:10:15.167249976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba8a5573-e7ce-4bef-9447-63160aeeb255",
  "code": "261746",
  "device_ref": "sandbox-14499"
}
```

```json
{
  "session_id": "e5b0dce6-d1dc-4ad6-9818-0ccd0bdcc6e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTExNSwiaWF0IjoxNzkzMzk4MjE1LCJqdGkiOiJkZWU0N2FkNy1lY2Y5LTRkMjQtYmZjOC1iZTE1NjAxMGJhMmYiLCJzaWQiOiJlNWIwZGNlNi1kMWRjLTRhZDYtOTgxOC0wY2NkMGJkY2M2ZTkifQ._M8vThvQVeHaX2Jr62EXGGqy1oDwXw-rQpszmeM4agk",
  "access_expires_at": "2026-10-30T22:25:15.493857869Z",
  "refresh_token": "WoY3Ii5GMxh76e5j0W4Xbj0YwtnbbfI51EQaAv0Pd6E",
  "refresh_expires_at": "2026-11-29T22:10:15.493359558Z",
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
  "command_id": "2bebcbe1-fc68-4e67-ba8d-529aa2e62e1d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:15Z",
    "sequence": 1793398215916
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a06444c2-4b55-4469-b3ec-cb7bdebcbfcc",
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
  "last_heartbeat_at": "2026-10-30T22:10:15.943697Z",
  "last_location_at": "2026-10-30T22:10:15.943697Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "54f2da33-33fb-43d8-8a6c-2182dcda59df",
  "quote_id": "eced0f00-c238-40ad-abe1-e962daecf0d3",
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
  "id": "198722bf-1b6b-42f5-8767-9a5a2db879b1",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f38ea038-896c-40eb-a9fe-b05caf3ca4c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:10:16.183262Z",
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
  "client_id": "f38ea038-896c-40eb-a9fe-b05caf3ca4c5",
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
      "id": "1967f9a3-d33b-40e4-a2db-4f738d8bfe69",
      "at": "2026-10-30T22:10:14.701815Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
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
    "id": "c204a8b7-70dd-4164-b0f4-eed1b52cb2ad",
    "order_id": "198722bf-1b6b-42f5-8767-9a5a2db879b1",
    "expires_at": "2026-10-30T22:10:31.18923Z",
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

`POST /api/driver/v1/offers/c204a8b7-70dd-4164-b0f4-eed1b52cb2ad/accept` → **200**

```json
{
  "command_id": "929ae9af-d78a-4e4b-9daa-02883b174a9a"
}
```

```json
{
  "id": "891c8bad-3ee2-475f-a6ef-4f6d4e9779f3",
  "order_id": "198722bf-1b6b-42f5-8767-9a5a2db879b1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c6cb9f8-2508-4217-a658-ede564b342ae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1c6cb9f8-2508-4217-a658-ede564b342ae",
  "order_id": "198722bf-1b6b-42f5-8767-9a5a2db879b1",
  "assignment_id": "891c8bad-3ee2-475f-a6ef-4f6d4e9779f3",
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

`POST /api/driver/v1/work-sessions/a06444c2-4b55-4469-b3ec-cb7bdebcbfcc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:19Z",
    "sequence": 1793398219205
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a06444c2-4b55-4469-b3ec-cb7bdebcbfcc",
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
  "last_heartbeat_at": "2026-10-30T22:10:19.222382Z",
  "last_location_at": "2026-10-30T22:10:19.222382Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1c6cb9f8-2508-4217-a658-ede564b342ae/arrive` → **200**

```json
{
  "command_id": "9cc64d1b-c7c8-4f26-bf85-92155cfe9eb7",
  "expected_version": 0
}
```

```json
{
  "id": "1c6cb9f8-2508-4217-a658-ede564b342ae",
  "order_id": "198722bf-1b6b-42f5-8767-9a5a2db879b1",
  "assignment_id": "891c8bad-3ee2-475f-a6ef-4f6d4e9779f3",
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
  "arrived_at": "2026-10-30T22:10:19.421252Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1c6cb9f8-2508-4217-a658-ede564b342ae/start` → **200**

```json
{
  "command_id": "a18b743b-3a31-4519-9437-e774620aaea6",
  "expected_version": 1
}
```

```json
{
  "id": "1c6cb9f8-2508-4217-a658-ede564b342ae",
  "order_id": "198722bf-1b6b-42f5-8767-9a5a2db879b1",
  "assignment_id": "891c8bad-3ee2-475f-a6ef-4f6d4e9779f3",
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
  "arrived_at": "2026-10-30T22:10:19.421252Z",
  "started_at": "2026-10-30T22:10:19.62416Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1c6cb9f8-2508-4217-a658-ede564b342ae/complete` → **200**

```json
{
  "command_id": "b00fe3d9-b12f-42eb-bc9e-8ee32d5c8671",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:10:19Z",
  "cash_received": true
}
```

```json
{
  "id": "1c6cb9f8-2508-4217-a658-ede564b342ae",
  "order_id": "198722bf-1b6b-42f5-8767-9a5a2db879b1",
  "assignment_id": "891c8bad-3ee2-475f-a6ef-4f6d4e9779f3",
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
  "arrived_at": "2026-10-30T22:10:19.421252Z",
  "started_at": "2026-10-30T22:10:19.62416Z",
  "completed_at": "2026-10-30T22:10:19.852116Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f38ea038-896c-40eb-a9fe-b05caf3ca4c5",
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
      "id": "7200084f-f2ba-4068-af09-b52c5621f00d",
      "at": "2026-10-30T22:10:20.038948Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "198722bf-1b6b-42f5-8767-9a5a2db879b1"
    },
    {
      "id": "1967f9a3-d33b-40e4-a2db-4f738d8bfe69",
      "at": "2026-10-30T22:10:14.701815Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
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

`POST /api/admin/v1/promotions/50db2711-b983-48cf-87d6-9470da54844a/archive` → **200**

```json
{
  "command_id": "c093f6c0-4958-4b78-a606-08ff9f9c9adf",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "50db2711-b983-48cf-87d6-9470da54844a",
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
  "created_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "created_at": "2026-10-30T22:10:13.900355Z",
  "updated_at": "2026-10-30T22:10:23.280052Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a06444c2-4b55-4469-b3ec-cb7bdebcbfcc",
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
  "last_heartbeat_at": "2026-10-30T22:10:19.222382Z",
  "last_location_at": "2026-10-30T22:10:19.222382Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a06444c2-4b55-4469-b3ec-cb7bdebcbfcc/close` → **200**

```json
{
  "command_id": "6d3861e3-1e1b-42df-b5fe-27ec2eacbc80",
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

Done: order 198722bf-1b6b-42f5-8767-9a5a2db879b1.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-21220"
}
```

```json
{
  "challenge_id": "71261f46-55e9-4cd7-a713-bfafd66da2ca",
  "expires_at": "2026-10-30T22:15:23.888842799Z",
  "resend_available_at": "2026-10-30T22:10:24.888842799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "043578",
  "sent_at": "2026-10-30T22:10:23.891481241Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71261f46-55e9-4cd7-a713-bfafd66da2ca",
  "code": "043578",
  "device_ref": "sandbox-21220"
}
```

```json
{
  "session_id": "6dfc91d1-d2a4-47d3-b79e-0c44468dd526",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTEyNCwiaWF0IjoxNzkzMzk4MjI0LCJqdGkiOiI2NzllOTE1Ny05ODU3LTRlOGYtOTQxOC03ZGQzZGM0ZDI3N2YiLCJzaWQiOiI2ZGZjOTFkMS1kMmE0LTQ3ZDMtYjc5ZS0wYzQ0NDY4ZGQ1MjYifQ.DQdqzLCdkWFlIP08uXz4HIXuTLNDijncmNIMvmLjxgs",
  "access_expires_at": "2026-10-30T22:25:24.106096906Z",
  "refresh_token": "ZIVuiH2f2KpVx2pzaMq3npSlGccyRm5EnI4aRf_LU0Q",
  "refresh_expires_at": "2026-11-29T22:10:24.105667139Z",
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
  "command_id": "6cc33208-4542-4b12-9ca7-a852978185eb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:24Z",
    "sequence": 1793398224732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "7f764489-d9c4-4e4c-9f16-f53a77bbe547",
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
  "last_heartbeat_at": "2026-10-30T22:10:24.750359Z",
  "last_location_at": "2026-10-30T22:10:24.750359Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/7f764489-d9c4-4e4c-9f16-f53a77bbe547/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:29Z",
    "sequence": 1793398229941
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "7f764489-d9c4-4e4c-9f16-f53a77bbe547",
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
  "last_heartbeat_at": "2026-10-30T22:10:29.957963Z",
  "last_location_at": "2026-10-30T22:10:24.750359Z",
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
  "session_id": "11008017-d26e-4ba2-b0ba-7d7bc4b827d7",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkxMzAsImlhdCI6MTc5MzM5ODIzMCwianRpIjoiZTYwYTNlOTItZmZmNC00YzQ0LThhZjgtMTJkYzQ0MzM5ODMwIiwic2lkIjoiMTEwMDgwMTctZDI2ZS00YmEyLWIwYmEtN2Q3YmM0YjgyN2Q3In0.DRlcO6qHu0vJ2IhtT_MERtMuAusU1P3_Cr2DgxiOwrQ",
  "access_expires_at": "2026-10-30T22:25:30.36451585Z",
  "refresh_token": "a5frEsYoT8FJvqlNRobuJ-69Vo_P8sHBkTJByWrXX6E",
  "refresh_expires_at": "2026-10-31T10:10:30.364132082Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T22:10:30.551149216Z",
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
      "last_location_at": "2026-10-30T22:10:24.750359Z",
      "last_heartbeat_at": "2026-10-30T22:10:29.957963Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/7f764489-d9c4-4e4c-9f16-f53a77bbe547/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:10:30Z",
    "sequence": 1793398230752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "7f764489-d9c4-4e4c-9f16-f53a77bbe547",
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
  "last_heartbeat_at": "2026-10-30T22:10:30.769637Z",
  "last_location_at": "2026-10-30T22:10:30.769637Z",
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
  "session_id": "7f764489-d9c4-4e4c-9f16-f53a77bbe547",
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
  "last_heartbeat_at": "2026-10-30T22:10:30.769637Z",
  "last_location_at": "2026-10-30T22:10:30.769637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f764489-d9c4-4e4c-9f16-f53a77bbe547/close` → **200**

```json
{
  "command_id": "ac67ca64-c27d-4fae-8af9-8d6d76c9e582",
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
  "device_ref": "sandbox-23592"
}
```

```json
{
  "challenge_id": "64403624-49f9-463a-897d-27dd2d901392",
  "expires_at": "2026-10-30T22:15:31.362153399Z",
  "resend_available_at": "2026-10-30T22:10:32.362153399Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "236397",
  "sent_at": "2026-10-30T22:10:31.365041125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64403624-49f9-463a-897d-27dd2d901392",
  "code": "236397",
  "device_ref": "sandbox-23592"
}
```

```json
{
  "session_id": "9d0864f8-6523-4abc-b932-10708890aa36",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTEzMSwiaWF0IjoxNzkzMzk4MjMxLCJqdGkiOiJhNzIxZjczNi1jMjZmLTQ2OGItODQ3Yy1jZDZlYTRlZWZjMDIiLCJzaWQiOiI5ZDA4NjRmOC02NTIzLTRhYmMtYjkzMi0xMDcwODg5MGFhMzYifQ.X2tEcFbnnrt6HuSs3YehORHuegozmSu6Mm0aCHoCmcE",
  "access_expires_at": "2026-10-30T22:25:31.584979684Z",
  "refresh_token": "_8babi9A2BdDyV1MLYw_a30k1ArPJvFvymh4asZmNZo",
  "refresh_expires_at": "2026-11-29T22:10:31.584580814Z",
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
  "device_ref": "sandbox-11760"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "21fa8a85-763c-4a92-b16a-7d5c827a5b20",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-11760"
}
```

```json
{
  "challenge_id": "859aadaf-01f5-4cb0-9b9c-45eac734ef27",
  "expires_at": "2026-10-30T22:15:33.176306718Z",
  "resend_available_at": "2026-10-30T22:10:34.176306718Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "078073",
  "sent_at": "2026-10-30T22:10:33.17839424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "859aadaf-01f5-4cb0-9b9c-45eac734ef27",
  "code": "078073",
  "device_ref": "sandbox-11760"
}
```

```json
{
  "session_id": "71f7492c-591d-4ddb-8b3f-e5ea7e836ad9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTEzMywiaWF0IjoxNzkzMzk4MjMzLCJqdGkiOiJkY2JiNWM3YS1iNTVlLTQ1YWUtODcyOS0yODQ0ODk5ODdjYmIiLCJzaWQiOiI3MWY3NDkyYy01OTFkLTRkZGItOGIzZi1lNWVhN2U4MzZhZDkifQ.GmNM7OFG6PCLgOSVWDC7PdLPaKdgNhzXAEfHfgClHcs",
  "access_expires_at": "2026-10-30T22:25:33.388276698Z",
  "refresh_token": "MpkThbVGkT0CfXbRV5v4wmozjjxTeKTb-Vp5wDjJtxA",
  "refresh_expires_at": "2026-11-29T22:10:33.387855419Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-19173"
}
```

```json
{
  "challenge_id": "e80fa534-ac24-4490-ba2c-2d73c84b84b5",
  "expires_at": "2026-10-30T22:15:33.572838783Z",
  "resend_available_at": "2026-10-30T22:10:34.572838783Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "102351",
  "sent_at": "2026-10-30T22:10:33.575002155Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e80fa534-ac24-4490-ba2c-2d73c84b84b5",
  "code": "102351",
  "device_ref": "sandbox-19173"
}
```

```json
{
  "session_id": "92156c5a-6ff3-4618-941f-884a8dd44b70",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTEzMywiaWF0IjoxNzkzMzk4MjMzLCJqdGkiOiIyMjA0ODM4OC1iYTJhLTRkNjItOTA2NC02ZTI4NjE2MzRlMTYiLCJzaWQiOiI5MjE1NmM1YS02ZmYzLTQ2MTgtOTQxZi04ODRhOGRkNDRiNzAifQ.NQhmz1hAp_5YTHaG80B24iIOzrYuHY2r4vTnvJ9l0LA",
  "access_expires_at": "2026-10-30T22:25:33.782811503Z",
  "refresh_token": "4hDa8miHn5RCeI66qX1kxNTFfoYZQ7rcR54hqXbxU7g",
  "refresh_expires_at": "2026-11-29T22:10:33.782429398Z",
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
  "command_id": "c854d2c5-fe36-4681-bd86-27f0642eff5d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:13:38Z",
    "sequence": 1793398418362
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "acef355c-47e3-4318-95d7-3fb9e7bdc15b",
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
  "last_heartbeat_at": "2026-10-30T22:13:38.37843Z",
  "last_location_at": "2026-10-30T22:13:38.37843Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600783995",
  "device_ref": "sandbox-19450"
}
```

```json
{
  "challenge_id": "52d05298-9101-4a51-9865-e846dc48be89",
  "expires_at": "2026-10-30T22:18:38.588450026Z",
  "resend_available_at": "2026-10-30T22:13:39.588450026Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600783995` → **200**

```json
{
  "phone": "+48600783995",
  "audience": "CLIENT",
  "code": "904405",
  "sent_at": "2026-10-30T22:13:38.590812184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52d05298-9101-4a51-9865-e846dc48be89",
  "code": "904405",
  "device_ref": "sandbox-19450"
}
```

```json
{
  "session_id": "8bf66470-fe76-435d-bec3-33896ddc7943",
  "subject": {
    "type": "CLIENT",
    "id": "bdb03df3-d9d6-4211-b988-ab7f380adc1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZGIwM2RmMy1kOWQ2LTQyMTEtYjk4OC1hYjdmMzgwYWRjMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5MzE4LCJpYXQiOjE3OTMzOTg0MTgsImp0aSI6IjE0MTE3ZDQ4LTA2NTAtNDkxYi1hOWI4LTRkMTBiMmRmYTM5MiIsInNpZCI6IjhiZjY2NDcwLWZlNzYtNDM1ZC1iZWMzLTMzODk2ZGRjNzk0MyJ9.Vh3icalnv6DTwCnZenlggjuiy9HKjEkm-av25xUAVIM",
  "access_expires_at": "2026-10-30T22:28:38.811455664Z",
  "refresh_token": "eOebfS2sJZCq8qodPFWrp0Y4f71hP8ICWQM3Yz8RDW0",
  "refresh_expires_at": "2026-11-29T22:13:38.810971742Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a4b0061e-4108-4de2-ad5e-36078751ea63",
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
  "id": "718468f2-f71b-4c52-b4f6-5845757db54d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:18:39.012572Z",
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
  "command_id": "7c4dfccd-1f05-438c-8f81-686d8ddc44ab",
  "quote_id": "718468f2-f71b-4c52-b4f6-5845757db54d",
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
  "id": "f8f6e97f-995c-4608-8e77-5043478368c4",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bdb03df3-d9d6-4211-b988-ab7f380adc1e",
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
  "created_at": "2026-10-30T22:13:39.233224Z",
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

`GET /api/rider/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4` → **200**

```json
{
  "id": "f8f6e97f-995c-4608-8e77-5043478368c4",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bdb03df3-d9d6-4211-b988-ab7f380adc1e",
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
  "created_at": "2026-10-30T22:13:39.233224Z",
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

`POST /api/driver/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4/claim` → **422**

```json
{
  "command_id": "79cebf57-483d-4594-9943-b6112fcdf96f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "b9c89653-862a-48a9-82ec-59e0f6b34667"
}
```

`GET /api/rider/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4` → **200**

```json
{
  "id": "f8f6e97f-995c-4608-8e77-5043478368c4",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bdb03df3-d9d6-4211-b988-ab7f380adc1e",
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
  "created_at": "2026-10-30T22:13:39.233224Z",
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

`POST /api/driver/v1/orders/4f8b58f1-00a1-4523-8c82-05f0c4c911e6/claim` → **404**

```json
{
  "command_id": "0ca415bb-60d2-4a3d-9daf-fb72ac5955ea"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4f8b58f1-00a1-4523-8c82-05f0c4c911e6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6beb0543-d80f-4823-b07b-53ef4e9147d4"
}
```

`POST /api/driver/v1/orders/dbce02ad-e789-4d5d-985a-c1948ed159d5/claim` → **404**

```json
{
  "command_id": "f1e9f96b-250f-4318-85db-258c61c03b34"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dbce02ad-e789-4d5d-985a-c1948ed159d5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d7a4d75b-5153-4e56-b0cd-5a45a446c6e9"
}
```

`POST /api/driver/v1/orders/67de32b8-dcbd-4649-97c1-9afa80596e4a/claim` → **404**

```json
{
  "command_id": "b9f426ba-b637-4deb-892b-c4e13a901352"
}
```

```json
{
  "instance": "/api/driver/v1/orders/67de32b8-dcbd-4649-97c1-9afa80596e4a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "89c3cde8-979c-4f12-92fe-9b9ada371d5c"
}
```

`POST /api/driver/v1/orders/9e3ea601-6e84-4c0f-960f-a51a2095090f/claim` → **404**

```json
{
  "command_id": "e34fb725-51cf-43b2-9af4-050d8af564ec"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9e3ea601-6e84-4c0f-960f-a51a2095090f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9cc2f5f5-7259-4679-b56d-4a8e5c3acecd"
}
```

`POST /api/driver/v1/orders/d30a7098-3955-43e6-9b8d-dae8fdf4495a/claim` → **404**

```json
{
  "command_id": "54a34b12-f196-4816-8d8b-263e74db25f4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d30a7098-3955-43e6-9b8d-dae8fdf4495a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "601fefc6-f147-4b13-bc1c-00b647dc9101"
}
```

`POST /api/driver/v1/orders/5532b127-4e6b-4f96-97bc-2456be16fe5e/claim` → **404**

```json
{
  "command_id": "58c7938b-feb9-44fe-9d8c-bcb1c4988711"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5532b127-4e6b-4f96-97bc-2456be16fe5e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9834c888-3f65-42a7-8cb0-98f755d8171d"
}
```

`POST /api/driver/v1/orders/00443e57-ba78-4096-b600-c5479fdd0a98/claim` → **404**

```json
{
  "command_id": "3386710b-2516-487f-b082-09d654bed846"
}
```

```json
{
  "instance": "/api/driver/v1/orders/00443e57-ba78-4096-b600-c5479fdd0a98/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9c65add8-4d02-43dc-b75a-77f9f01e30f6"
}
```

`POST /api/driver/v1/orders/9e25a564-6cac-45fb-9784-877df5df9321/claim` → **404**

```json
{
  "command_id": "82765eea-3481-4215-a835-ddddffaf770c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9e25a564-6cac-45fb-9784-877df5df9321/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "017a9dc0-5712-4157-b2c9-35dbd44ab824"
}
```

`POST /api/driver/v1/orders/27a6a394-ce45-4b6f-97a4-078b08dc7f79/claim` → **404**

```json
{
  "command_id": "581e49ce-7148-4f10-8907-226b77f2ba3a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/27a6a394-ce45-4b6f-97a4-078b08dc7f79/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e8366fa1-9348-46c9-81f5-940bd950d5cb"
}
```

`POST /api/driver/v1/orders/9e8cbc22-5dea-4255-983a-7997552f9147/claim` → **404**

```json
{
  "command_id": "712ebd7d-e7c2-4d44-b434-9e04994d70cd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9e8cbc22-5dea-4255-983a-7997552f9147/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1a70c922-31f8-48f6-98f0-3fe33ab1c7b2"
}
```

`POST /api/driver/v1/orders/2272a3ac-5934-4f5d-a81d-2425486c4bab/claim` → **404**

```json
{
  "command_id": "b2c692b5-0cd3-401e-ab9b-27549ff15911"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2272a3ac-5934-4f5d-a81d-2425486c4bab/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "40fbee28-e83b-4126-9cb6-cc601a4cfcc3"
}
```

`POST /api/driver/v1/orders/8e8b6090-fdef-4a9c-9e23-0be6145689da/claim` → **404**

```json
{
  "command_id": "78aef65a-7255-4b3e-8110-01d265007a43"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8e8b6090-fdef-4a9c-9e23-0be6145689da/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6c136209-fd5c-46dc-a550-d8af070c4d5d"
}
```

`POST /api/driver/v1/orders/338bf7f4-25e7-4951-a241-8b9a24da2f23/claim` → **404**

```json
{
  "command_id": "3ecb2759-430d-4fac-853a-818d28bbf7d9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/338bf7f4-25e7-4951-a241-8b9a24da2f23/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "813d4099-ccf1-44e6-aede-e51f3fa35470"
}
```

`POST /api/driver/v1/orders/d6b658e2-76d2-4c8e-b24c-eeaf3191c75e/claim` → **404**

```json
{
  "command_id": "21915f03-2cdb-45cf-902f-72b01dd313f9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d6b658e2-76d2-4c8e-b24c-eeaf3191c75e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5769d3b6-af20-4bd6-96c8-85e7b02b9b42"
}
```

`POST /api/driver/v1/orders/53e6f115-2c0d-4fb1-ae8a-6a11a2d8826d/claim` → **404**

```json
{
  "command_id": "5f8db33f-73b3-482a-a1bb-f632339de5d7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/53e6f115-2c0d-4fb1-ae8a-6a11a2d8826d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8d3b0c1b-15a9-4a9f-920e-fed7931207a1"
}
```

`POST /api/driver/v1/orders/0661d698-8304-495c-aa0a-ea5c0da7e2f1/claim` → **404**

```json
{
  "command_id": "873bf81f-c317-466f-8438-7f8936a93b35"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0661d698-8304-495c-aa0a-ea5c0da7e2f1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3f297134-c03a-4349-8667-8545117def4e"
}
```

`POST /api/driver/v1/orders/b735e20b-972b-426c-9297-d31dd7a73a3f/claim` → **404**

```json
{
  "command_id": "3ddbdead-4481-4fe6-a15a-ba681690c5ba"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b735e20b-972b-426c-9297-d31dd7a73a3f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a92d476d-7f09-4b7e-a913-219e3f4c6f75"
}
```

`POST /api/driver/v1/orders/ef693c6c-ecd7-4685-80b7-ef28d119ddfb/claim` → **404**

```json
{
  "command_id": "38b59fc7-9b34-4f33-8ef9-0a4322b9a7e1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ef693c6c-ecd7-4685-80b7-ef28d119ddfb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f0626596-747c-4637-a368-c649089359e0"
}
```

`POST /api/driver/v1/orders/d9edc611-3aa5-4590-8cae-263247227d96/claim` → **404**

```json
{
  "command_id": "6ef18a98-fd4c-4611-bf51-ebf3ee0f3d13"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d9edc611-3aa5-4590-8cae-263247227d96/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "47d8d0dd-bd04-4ee5-b9b8-b44c9ec18b8e"
}
```

`POST /api/driver/v1/orders/307abd5f-4531-45ec-9020-fa5b650fa0dc/claim` → **404**

```json
{
  "command_id": "72b327bd-20f2-41f8-ae88-0bdc1dc0a3f4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/307abd5f-4531-45ec-9020-fa5b650fa0dc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "aecaff6c-d0b4-45e3-b095-6b697609a898"
}
```

`POST /api/driver/v1/orders/4ae86b0e-992d-49d2-8eec-c14eceb5064b/claim` → **404**

```json
{
  "command_id": "9bbf06be-91b8-4a16-94cb-6d9384afbcb5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4ae86b0e-992d-49d2-8eec-c14eceb5064b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3d4184d8-48af-4206-9261-9a29abeff6ff"
}
```

`POST /api/driver/v1/orders/10accc26-624f-4905-9364-15d3221b37fe/claim` → **404**

```json
{
  "command_id": "04304bba-846f-46eb-823b-90a10f184fb7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/10accc26-624f-4905-9364-15d3221b37fe/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6707b92f-ff0c-4567-95b4-0a3f3ffc4167"
}
```

`POST /api/driver/v1/orders/fdeb9baa-8c7c-4fa0-9d59-fd81dc5497f6/claim` → **404**

```json
{
  "command_id": "25e158cf-1ba4-4709-aa9b-05c0b5db6fe6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fdeb9baa-8c7c-4fa0-9d59-fd81dc5497f6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5f5aaecf-75b8-45eb-9d83-9fc59699a1dd"
}
```

`POST /api/driver/v1/orders/a07b7ed4-da02-43df-8b7e-e092b22b9a8b/claim` → **404**

```json
{
  "command_id": "abe4bc1e-ca4c-4302-be22-7ecd6a8d65f1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a07b7ed4-da02-43df-8b7e-e092b22b9a8b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "db92f1b3-1c6e-467c-abe3-fa7756ec955f"
}
```

`POST /api/driver/v1/orders/757bc3a8-3bf4-4fa0-9777-e664ea61d661/claim` → **404**

```json
{
  "command_id": "6b547001-00ff-4e1f-b1c8-d1ab05c74b83"
}
```

```json
{
  "instance": "/api/driver/v1/orders/757bc3a8-3bf4-4fa0-9777-e664ea61d661/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "17a30b71-91b1-4af5-b8c3-41669ee09367"
}
```

`POST /api/driver/v1/orders/494c14a3-4e1a-41f9-9754-67980b431e6d/claim` → **404**

```json
{
  "command_id": "0a33b39b-759a-480d-8950-67222b0e236c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/494c14a3-4e1a-41f9-9754-67980b431e6d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "25820292-c7b7-45ca-a6a7-5e29e874e45a"
}
```

`POST /api/driver/v1/orders/d9802ec4-3ded-4aef-b7fe-a1cc8457b0d3/claim` → **404**

```json
{
  "command_id": "21f27b2e-5515-4d08-a402-a7a82c3a81c6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d9802ec4-3ded-4aef-b7fe-a1cc8457b0d3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bc43bef0-7305-41af-9156-3ad204ea9239"
}
```

`POST /api/driver/v1/orders/e8d03d81-b4bb-4971-b179-dee5b94a0877/claim` → **404**

```json
{
  "command_id": "083da875-3a75-449b-89f0-632d13961dc9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8d03d81-b4bb-4971-b179-dee5b94a0877/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "676cb529-0ab1-44fa-8605-8b7129afe4d0"
}
```

`POST /api/driver/v1/orders/849b9ab2-b1a2-410e-a656-b7f5e37e29f4/claim` → **404**

```json
{
  "command_id": "0dc82536-92be-4601-8164-cb48f6f79236"
}
```

```json
{
  "instance": "/api/driver/v1/orders/849b9ab2-b1a2-410e-a656-b7f5e37e29f4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4e2a100b-cf65-4f8d-9b56-49a5c8b5d15b"
}
```

`POST /api/driver/v1/orders/676e95b1-2fbd-4089-9676-ba122527bbb3/claim` → **429**

```json
{
  "command_id": "14b12e0e-3f62-47d4-9743-2ecd39101221"
}
```

```json
{
  "instance": "/api/driver/v1/orders/676e95b1-2fbd-4089-9676-ba122527bbb3/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "6d84eba8-6902-4d6c-add7-0b14737bb338",
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
  "command_id": "3e8cb56a-a1df-49ce-8f4b-b78e2b979297",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:13:46Z",
    "sequence": 1793398426802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "410160f5-2b75-4995-a98f-a131371ead3b",
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
  "last_heartbeat_at": "2026-10-30T22:13:46.819266Z",
  "last_location_at": "2026-10-30T22:13:46.819266Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "f8f6e97f-995c-4608-8e77-5043478368c4",
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

`POST /api/driver/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4/claim` → **409**

```json
{
  "command_id": "16e87151-d656-42cf-8e86-3eef023eed3e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d131883e-92a0-4139-b712-428d768f0143"
}
```

`POST /api/driver/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4/claim` → **200**

```json
{
  "command_id": "dd27d913-4fa4-4bfe-b726-e57223432522"
}
```

```json
{
  "id": "e4130116-9ea3-4623-8b7e-788abb634a12",
  "order_id": "f8f6e97f-995c-4608-8e77-5043478368c4",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "1421da0a-b68b-4aa0-b9dd-9ec7d1675801",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1421da0a-b68b-4aa0-b9dd-9ec7d1675801",
  "order_id": "f8f6e97f-995c-4608-8e77-5043478368c4",
  "assignment_id": "e4130116-9ea3-4623-8b7e-788abb634a12",
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

`POST /api/driver/v1/trips/1421da0a-b68b-4aa0-b9dd-9ec7d1675801/cancel` → **200**

```json
{
  "command_id": "18e919c1-ec69-4642-80a4-a0c691aca1c2",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1421da0a-b68b-4aa0-b9dd-9ec7d1675801",
  "order_id": "f8f6e97f-995c-4608-8e77-5043478368c4",
  "assignment_id": "e4130116-9ea3-4623-8b7e-788abb634a12",
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

`GET /api/rider/v1/orders/f8f6e97f-995c-4608-8e77-5043478368c4` → **200**

```json
{
  "id": "f8f6e97f-995c-4608-8e77-5043478368c4",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "bdb03df3-d9d6-4211-b988-ab7f380adc1e",
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
    "id": "e4130116-9ea3-4623-8b7e-788abb634a12",
    "order_id": "f8f6e97f-995c-4608-8e77-5043478368c4",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "1421da0a-b68b-4aa0-b9dd-9ec7d1675801",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:13:39.233224Z",
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
  "session_id": "acef355c-47e3-4318-95d7-3fb9e7bdc15b",
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
  "last_heartbeat_at": "2026-10-30T22:13:38.37843Z",
  "last_location_at": "2026-10-30T22:13:38.37843Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acef355c-47e3-4318-95d7-3fb9e7bdc15b/close` → **200**

```json
{
  "command_id": "929389e2-b1be-404b-a64f-8839ccb2ff8a",
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
  "session_id": "410160f5-2b75-4995-a98f-a131371ead3b",
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
  "last_heartbeat_at": "2026-10-30T22:13:46.819266Z",
  "last_location_at": "2026-10-30T22:13:46.819266Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/410160f5-2b75-4995-a98f-a131371ead3b/close` → **200**

```json
{
  "command_id": "710e2cd7-a41c-4ad1-9a1c-7525c0a8a2eb",
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
  "session_id": "83531119-bba8-41e4-b413-0a1180f75218",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkzMjksImlhdCI6MTc5MzM5ODQyOSwianRpIjoiMWM5ZjU5NDQtNGI5ZC00OTI4LTg3ZjAtMTYwZjYyNWVjMzE5Iiwic2lkIjoiODM1MzExMTktYmJhOC00MWU0LWI0MTMtMGExMTgwZjc1MjE4In0.t06YX65eO87DK-S1y1n5MTTIU9ng1fdApY-u99Yy98U",
  "access_expires_at": "2026-10-30T22:28:49.284822346Z",
  "refresh_token": "Rp0gYx79wm_Ewk__JDbmZ0wFSS4WA_6uDb9XzePNxAM",
  "refresh_expires_at": "2026-10-31T10:13:49.284338264Z",
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
  "command_id": "e12c8649-b7f4-4dd2-a325-845b23433223",
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
  "session_id": "eba2bbe8-82b3-465f-9449-5090299c96b4",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkzMzAsImlhdCI6MTc5MzM5ODQzMCwianRpIjoiNDk2NTllZmItMTU0ZC00ZDM1LThiYTktY2Q4NmI0NmYwODI2Iiwic2lkIjoiZWJhMmJiZTgtODJiMy00NjVmLTk0NDktNTA5MDI5OWM5NmI0In0.Yrmjo1kVp_xaYG_bNo3KOxqrpm-71EULaSE6mL90vV8",
  "access_expires_at": "2026-10-30T22:28:50.122134006Z",
  "refresh_token": "Rh9vzerO2IHc6tSgWRJOlQTahONO38xPPUMV6rFb1ec",
  "refresh_expires_at": "2026-10-31T10:13:50.121675892Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.58713739",
    "linkedid": "1730052700.58713739",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679574165"
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
    "id": "1730052700.58713739",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "867ddd20-28f1-486d-b9f0-e087016f8a36",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.324793Z",
      "answered_at": null,
      "ended_at": "2026-10-30T22:13:50.347436Z",
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
    "id": "1730052600.264021545",
    "linkedid": "1730052600.264021545",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679574165"
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
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
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

`POST /api/operator/v1/calls/13d5d346-9a7c-4660-97a6-83421b07638a/answer` → **200**

```json
{
  "command_id": "ef2ec2dd-0614-42f3-a1b5-6ff8c104ba45"
}
```

```json
{
  "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679574165",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "order_ids": [],
  "started_at": "2026-10-30T22:13:50.581779Z",
  "answered_at": "2026-10-30T22:13:50.827818Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.264021545",
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
    "id": "1730052600.264021545",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
      "answered_at": "2026-10-30T22:13:50.827818Z",
      "ended_at": "2026-10-30T22:13:51.042872Z",
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
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
      "answered_at": "2026-10-30T22:13:50.827818Z",
      "ended_at": "2026-10-30T22:13:51.042872Z",
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
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
      "answered_at": "2026-10-30T22:13:50.827818Z",
      "ended_at": "2026-10-30T22:13:51.042872Z",
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
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
      "answered_at": "2026-10-30T22:13:50.827818Z",
      "ended_at": "2026-10-30T22:13:51.042872Z",
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
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
      "answered_at": "2026-10-30T22:13:50.827818Z",
      "ended_at": "2026-10-30T22:13:51.042872Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:13:59.710508Z"
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
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
      "answered_at": "2026-10-30T22:13:50.827818Z",
      "ended_at": "2026-10-30T22:13:51.042872Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:13:59.710508Z"
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

`GET /api/operator/v1/calls/13d5d346-9a7c-4660-97a6-83421b07638a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/13d5d346-9a7c-4660-97a6-83421b07638a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=13d5d346-9a7c-4660-97a6-83421b07638a` → **200**

```json
{
  "changes": [
    {
      "id": "dd505fd8-184e-478e-b9d8-f36ef5a8b127",
      "occurred_at": "2026-10-30T22:14:00.320154Z",
      "actor_type": "STAFF",
      "actor_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"12507105-6188-4118-a6e6-2365e8600fcd\", \"order_ids\": []}",
      "correlation_id": "5a124a2a-e1c2-4f95-84a8-3c0fb624b76e"
    },
    {
      "id": "d2b7b2e5-104b-4ef4-aa13-531c0a087a8d",
      "occurred_at": "2026-10-30T22:14:00.295419Z",
      "actor_type": "STAFF",
      "actor_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"12507105-6188-4118-a6e6-2365e8600fcd\", \"order_ids\": []}",
      "correlation_id": "1b45d047-73d3-4571-8bc6-23393db8ef72"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 13d5d346-9a7c-4660-97a6-83421b07638a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11623"
}
```

```json
{
  "challenge_id": "a7448b82-c95b-431b-b092-c214189a5c38",
  "expires_at": "2026-10-30T22:19:00.558535196Z",
  "resend_available_at": "2026-10-30T22:14:01.558535196Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "282388",
  "sent_at": "2026-10-30T22:14:00.560628974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7448b82-c95b-431b-b092-c214189a5c38",
  "code": "282388",
  "device_ref": "sandbox-11623"
}
```

```json
{
  "session_id": "5e47cacd-1901-4434-bc81-32deabdaecf3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTM0MCwiaWF0IjoxNzkzMzk4NDQwLCJqdGkiOiI2MGJmOWQ0MC00MTA5LTQxZjItYTliOS1mZmMwY2Q0YTMzZGQiLCJzaWQiOiI1ZTQ3Y2FjZC0xOTAxLTQ0MzQtYmM4MS0zMmRlYWJkYWVjZjMifQ.OZsyNmMjpzj5WJrjam7-7S5xGqD_shOxpU-z2KuTd-c",
  "access_expires_at": "2026-10-30T22:29:00.827024812Z",
  "refresh_token": "WsQT_oihRjuyA2I3sME1UNWbgxDycvSUR_iOWk-PEE8",
  "refresh_expires_at": "2026-11-29T22:14:00.826502332Z",
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
  "command_id": "26dffc82-fba6-490c-8468-5f20216393f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:14:01Z",
    "sequence": 1793398441226
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fc030c9-ab3c-4d7e-92bb-1639455f9fca",
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
  "last_heartbeat_at": "2026-10-30T22:14:01.243152Z",
  "last_location_at": "2026-10-30T22:14:01.243152Z",
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
  "session_id": "0959dc7a-e95f-4a8a-8dca-4767c3613511",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkzNDEsImlhdCI6MTc5MzM5ODQ0MSwianRpIjoiMjQ0MWJlNWEtODEzNi00OGVkLWI0NTUtOWM2ZDEzNDk3NzIxIiwic2lkIjoiMDk1OWRjN2EtZTk1Zi00YThhLThkY2EtNDc2N2MzNjEzNTExIn0.XiOTf1tHXC89bS-VsXODMHmNVv7vXqwQap1fGZd_czY",
  "access_expires_at": "2026-10-30T22:29:01.645318719Z",
  "refresh_token": "zJkHRwez2Q8w0zi0cyhVC6Q5hgq5R67CfzYh3HS4Fdw",
  "refresh_expires_at": "2026-10-31T10:14:01.644855873Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "198cb2c3-e0ed-4caa-ba70-a93e71d34fbe",
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
  "id": "feddb2b2-3d64-4a76-bc61-ffa7efdec2ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:19:01.845778Z",
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
  "command_id": "f21b367a-72b8-4fa0-aa03-78c399d72997",
  "quote_id": "feddb2b2-3d64-4a76-bc61-ffa7efdec2ca",
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
    "phone": "+380670880983"
  }
}
```

```json
{
  "id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
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
  "created_at": "2026-10-30T22:14:02.071513Z",
  "caller": {
    "name": "Олена",
    "phone": "+380670880983"
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
    "id": "2952344a-ea99-4234-aada-580284b83159",
    "order_id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
    "expires_at": "2026-10-30T22:14:17.074979Z",
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

`POST /api/driver/v1/offers/2952344a-ea99-4234-aada-580284b83159/accept` → **200**

```json
{
  "command_id": "c6ff16b7-dbde-46ae-9249-de82b17d8d4b"
}
```

```json
{
  "id": "8fb28ff1-2d5b-4cde-8a65-33111ce86e3c",
  "order_id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "363dddbf-f43e-4267-a2a1-7b740a946fba",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[
  {
    "phone": "+380670880983",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:04.147491852Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[
  {
    "phone": "+380670880983",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:04.147491852Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[
  {
    "phone": "+380670880983",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:04.147491852Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "363dddbf-f43e-4267-a2a1-7b740a946fba",
  "order_id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
  "assignment_id": "8fb28ff1-2d5b-4cde-8a65-33111ce86e3c",
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
    "phone": "+380670880983"
  }
}
```

`POST /api/driver/v1/work-sessions/2fc030c9-ab3c-4d7e-92bb-1639455f9fca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:14:05Z",
    "sequence": 1793398445455
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fc030c9-ab3c-4d7e-92bb-1639455f9fca",
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
  "last_heartbeat_at": "2026-10-30T22:14:05.061729Z",
  "last_location_at": "2026-10-30T22:14:05.061729Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/363dddbf-f43e-4267-a2a1-7b740a946fba/arrive` → **200**

```json
{
  "command_id": "50b67f30-9712-4c72-b5a2-f191a12613a4",
  "expected_version": 0
}
```

```json
{
  "id": "363dddbf-f43e-4267-a2a1-7b740a946fba",
  "order_id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
  "assignment_id": "8fb28ff1-2d5b-4cde-8a65-33111ce86e3c",
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
  "arrived_at": "2026-10-30T22:14:05.335801Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670880983"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[
  {
    "phone": "+380670880983",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:04.147491852Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[
  {
    "phone": "+380670880983",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:04.147491852Z"
  },
  {
    "phone": "+380670880983",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:06.159315291Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[
  {
    "phone": "+380670880983",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:04.147491852Z"
  },
  {
    "phone": "+380670880983",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:06.159315291Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670880983` → **200**

```json
[
  {
    "phone": "+380670880983",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:04.147491852Z"
  },
  {
    "phone": "+380670880983",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T22:14:06.159315291Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/363dddbf-f43e-4267-a2a1-7b740a946fba/start` → **200**

```json
{
  "command_id": "85c6a072-9133-420a-b885-d347a7017015",
  "expected_version": 1
}
```

```json
{
  "id": "363dddbf-f43e-4267-a2a1-7b740a946fba",
  "order_id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
  "assignment_id": "8fb28ff1-2d5b-4cde-8a65-33111ce86e3c",
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
  "arrived_at": "2026-10-30T22:14:05.335801Z",
  "started_at": "2026-10-30T22:14:06.68858Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670880983"
  }
}
```

`POST /api/driver/v1/trips/363dddbf-f43e-4267-a2a1-7b740a946fba/complete` → **200**

```json
{
  "command_id": "b7ace3ac-1376-4bb0-b3c4-4b44abb0cf3a",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:14:06Z",
  "cash_received": true
}
```

```json
{
  "id": "363dddbf-f43e-4267-a2a1-7b740a946fba",
  "order_id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
  "assignment_id": "8fb28ff1-2d5b-4cde-8a65-33111ce86e3c",
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
  "arrived_at": "2026-10-30T22:14:05.335801Z",
  "started_at": "2026-10-30T22:14:06.68858Z",
  "completed_at": "2026-10-30T22:14:06.89938Z",
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
  "session_id": "2fc030c9-ab3c-4d7e-92bb-1639455f9fca",
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
  "last_heartbeat_at": "2026-10-30T22:14:05.061729Z",
  "last_location_at": "2026-10-30T22:14:05.061729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2fc030c9-ab3c-4d7e-92bb-1639455f9fca/close` → **200**

```json
{
  "command_id": "be9e39df-943e-48d1-b4a5-76545271172c",
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
  "phone": "+380637897409",
  "device_ref": "sandbox-7697"
}
```

```json
{
  "challenge_id": "6b524c26-8167-4093-bd57-826c6c980165",
  "expires_at": "2026-10-30T22:19:07.516827946Z",
  "resend_available_at": "2026-10-30T22:14:08.516827946Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637897409` → **200**

```json
{
  "phone": "+380637897409",
  "audience": "CLIENT",
  "code": "966065",
  "sent_at": "2026-10-30T22:14:07.518856775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b524c26-8167-4093-bd57-826c6c980165",
  "code": "966065",
  "device_ref": "sandbox-7697"
}
```

```json
{
  "session_id": "3921b089-ac2f-4569-871d-ebbb6df14696",
  "subject": {
    "type": "CLIENT",
    "id": "77f11461-e44c-48da-acd5-1371e171da46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2YxMTQ2MS1lNDRjLTQ4ZGEtYWNkNS0xMzcxZTE3MWRhNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5MzQ3LCJpYXQiOjE3OTMzOTg0NDcsImp0aSI6IjQ3YzhjYWI1LTkwMmQtNDYwNS1hZTU0LWUwMzliZDg2NWZlZiIsInNpZCI6IjM5MjFiMDg5LWFjMmYtNDU2OS04NzFkLWViYmI2ZGYxNDY5NiJ9.dhlWRV40ffoZ5QlkZZ2firauR4wmmxDpGY0vYcWGxSk",
  "access_expires_at": "2026-10-30T22:29:07.732800515Z",
  "refresh_token": "dOLZV2PIZ-kw9fPcwwrXLAorTdcKObjjBLOVYHno0mw",
  "refresh_expires_at": "2026-11-29T22:14:07.732437809Z",
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
  "device_ref": "sandbox-4213"
}
```

```json
{
  "challenge_id": "ebfe4bf2-a385-4dff-9885-83e40635577b",
  "expires_at": "2026-10-30T22:19:08.128292438Z",
  "resend_available_at": "2026-10-30T22:14:09.128292438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "889746",
  "sent_at": "2026-10-30T22:14:08.130459687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebfe4bf2-a385-4dff-9885-83e40635577b",
  "code": "889746",
  "device_ref": "sandbox-4213"
}
```

```json
{
  "session_id": "a4a213d3-a938-4eb2-a061-f836304916f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTM0OCwiaWF0IjoxNzkzMzk4NDQ4LCJqdGkiOiIxMGI4MmNiNy0yMWU0LTQzOTEtYjc5Ni02ZmYyY2ZiNWIwY2IiLCJzaWQiOiJhNGEyMTNkMy1hOTM4LTRlYjItYTA2MS1mODM2MzA0OTE2ZjMifQ.0l7E3oBES9nRVxhUnsCQk4Rbm3aaRvPROpTaqmOJdzY",
  "access_expires_at": "2026-10-30T22:29:08.347622811Z",
  "refresh_token": "9CGyH2AmhCpfYPxO8TWrShzMTVZE58OI0P_HlQRQDKs",
  "refresh_expires_at": "2026-11-29T22:14:08.347210556Z",
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
  "session_id": "7ac66e8f-64c5-4098-99fb-9d83e89fe458",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkzNDgsImlhdCI6MTc5MzM5ODQ0OCwianRpIjoiODgzMjM5MWMtMzVmZS00NGExLTgyZmItZjdlMTgzNzQ5NTZjIiwic2lkIjoiN2FjNjZlOGYtNjRjNS00MDk4LTk5ZmItOWQ4M2U4OWZlNDU4In0.sxxPr1qMRv9YCojSBNbJRvKqk110FRzld5n524aHgiM",
  "access_expires_at": "2026-10-30T22:29:08.924484365Z",
  "refresh_token": "vkVB-LCFuqqjhegiMr9s5dvoy0MyLG-XCL1Dt4WdHLU",
  "refresh_expires_at": "2026-10-31T10:14:08.92410857Z",
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
  "session_id": "e3d2ebf7-c52b-4f38-b97d-a12df76dd704",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTkzNDksImlhdCI6MTc5MzM5ODQ0OSwianRpIjoiNjg3NzUxYzAtMjgwMC00YjE1LWFhYTktMmJmNjE5ZjhkZjY5Iiwic2lkIjoiZTNkMmViZjctYzUyYi00ZjM4LWI5N2QtYTEyZGY3NmRkNzA0In0.HmcaxL9_EsU885Df1zsT2gPnB_RbVf7idKLvBI-jp4k",
  "access_expires_at": "2026-10-30T22:29:09.338821168Z",
  "refresh_token": "1LpM-X4QB4I4aicfR-4MIwNOXoDzMzUe9zaRf2wvaTc",
  "refresh_expires_at": "2026-10-31T10:14:09.338454757Z",
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
  "command_id": "3ca88890-afa3-47bf-9210-c9099702cb19",
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
  "id": "20f3a84d-091c-4992-8a8c-1f359cbe32f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:19:09.729772Z",
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
  "command_id": "30357bcc-1bf2-4151-b485-80f7b0cc05a1",
  "quote_id": "20f3a84d-091c-4992-8a8c-1f359cbe32f0",
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
  "id": "ef451789-4f36-4bcc-9e12-840ec23f7a9d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77f11461-e44c-48da-acd5-1371e171da46",
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
  "created_at": "2026-10-30T22:14:09.94079Z",
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

`GET /api/rider/v1/orders/ef451789-4f36-4bcc-9e12-840ec23f7a9d` → **200**

```json
{
  "id": "ef451789-4f36-4bcc-9e12-840ec23f7a9d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77f11461-e44c-48da-acd5-1371e171da46",
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
  "created_at": "2026-10-30T22:14:09.94079Z",
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

`POST /api/rider/v1/orders/ef451789-4f36-4bcc-9e12-840ec23f7a9d/cancel` → **200**

```json
{
  "command_id": "f3f0c3c6-5f01-481f-8841-43ffca470065",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ef451789-4f36-4bcc-9e12-840ec23f7a9d",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "77f11461-e44c-48da-acd5-1371e171da46",
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
  "created_at": "2026-10-30T22:14:09.94079Z",
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
  "command_id": "1a43fea8-b3e1-4c4c-b498-c0f5d0d60ecb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:14:10Z",
    "sequence": 1793398450801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab26b25c-b088-4221-bcc4-a53d6c34416e",
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
  "last_heartbeat_at": "2026-10-30T22:14:10.817483Z",
  "last_location_at": "2026-10-30T22:14:10.817483Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29307"
}
```

```json
{
  "challenge_id": "a94bba0e-8c60-4544-bf7e-342576b621b1",
  "expires_at": "2026-10-30T22:19:11.012933736Z",
  "resend_available_at": "2026-10-30T22:14:12.012933736Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "016950",
  "sent_at": "2026-10-30T22:14:11.015266513Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a94bba0e-8c60-4544-bf7e-342576b621b1",
  "code": "016950",
  "device_ref": "sandbox-29307"
}
```

```json
{
  "session_id": "e66ea4aa-f1db-48be-8615-eee9f953d44e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTM1MSwiaWF0IjoxNzkzMzk4NDUxLCJqdGkiOiI5NDhkY2VhOC01OTZkLTRlNjQtOGFiZC1lYTQwYmNkZDBlYzEiLCJzaWQiOiJlNjZlYTRhYS1mMWRiLTQ4YmUtODYxNS1lZWU5Zjk1M2Q0NGUifQ.U2nFabwumkr7Bv0YTxcf70T93nzhWa5kZKuFKO51dUg",
  "access_expires_at": "2026-10-30T22:29:11.234230972Z",
  "refresh_token": "SJx7pkNbOAU_M_Yn7S6sHoPotQZmQQHj_Sy17rt_hCo",
  "refresh_expires_at": "2026-11-29T22:14:11.233751501Z",
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
  "command_id": "98d8242a-1a05-4c3b-9a85-dcef999c9807",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:14:11Z",
    "sequence": 1793398451639
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9bd240a4-accd-469d-bb28-3d0c189ee1b5",
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
  "last_heartbeat_at": "2026-10-30T22:14:11.65677Z",
  "last_location_at": "2026-10-30T22:14:11.65677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "044e337a-8740-453d-a107-17f237d44933",
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
  "id": "450abd6b-f1cf-42b6-b1ef-dc04739f8797",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:19:11.859364Z",
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
  "command_id": "6250eaf0-81cd-4a4d-bce7-800eca0c9517",
  "quote_id": "450abd6b-f1cf-42b6-b1ef-dc04739f8797",
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
  "id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77f11461-e44c-48da-acd5-1371e171da46",
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
  "created_at": "2026-10-30T22:14:12.065601Z",
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
    "id": "f590137b-07e7-498b-af32-c29837f03bf1",
    "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
    "expires_at": "2026-10-30T22:14:27.067639Z",
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

`POST /api/driver/v1/offers/f590137b-07e7-498b-af32-c29837f03bf1/accept` → **200**

```json
{
  "command_id": "088b767d-1c6c-4401-bb69-5c2b97cc02cf"
}
```

```json
{
  "id": "56c0bef6-91a4-491d-8dfb-825c32b14938",
  "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "afa774dd-e373-4d5b-8a43-b90204a3476e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "afa774dd-e373-4d5b-8a43-b90204a3476e",
  "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "assignment_id": "56c0bef6-91a4-491d-8dfb-825c32b14938",
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

`POST /api/driver/v1/trips/afa774dd-e373-4d5b-8a43-b90204a3476e/cancel` → **200**

```json
{
  "command_id": "47ab447b-8d3c-4292-9d22-4bd7933835dd",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "afa774dd-e373-4d5b-8a43-b90204a3476e",
  "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "assignment_id": "56c0bef6-91a4-491d-8dfb-825c32b14938",
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

`GET /api/rider/v1/orders/4b7001c1-e0dc-4ed6-9947-bd2150f59a25` → **200**

```json
{
  "id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "77f11461-e44c-48da-acd5-1371e171da46",
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
  "created_at": "2026-10-30T22:14:12.065601Z",
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
    "at": "2026-10-30T22:14:12.893877Z"
  }
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "cbcf990d-4a97-4dce-9178-b0a986a37c9f",
    "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
    "expires_at": "2026-10-30T22:14:27.896214Z",
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

`POST /api/driver/v1/offers/cbcf990d-4a97-4dce-9178-b0a986a37c9f/accept` → **200**

```json
{
  "command_id": "39780753-33a8-4272-8d66-6958f55fd541"
}
```

```json
{
  "id": "ace5f106-7409-4739-acb3-6ea0ede248f7",
  "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7077abc1-00fc-4642-ac22-584097fc17ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7077abc1-00fc-4642-ac22-584097fc17ed",
  "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "assignment_id": "ace5f106-7409-4739-acb3-6ea0ede248f7",
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

`POST /api/driver/v1/trips/7077abc1-00fc-4642-ac22-584097fc17ed/cancel` → **200**

```json
{
  "command_id": "ad2d5e53-13d8-4e0e-8c66-632434c1a0fc",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7077abc1-00fc-4642-ac22-584097fc17ed",
  "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
  "assignment_id": "ace5f106-7409-4739-acb3-6ea0ede248f7",
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
      "id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T22:14:12.065601Z",
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
      "id": "ef451789-4f36-4bcc-9e12-840ec23f7a9d",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T22:14:09.94079Z",
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

`GET /api/operator/v1/orders/4b7001c1-e0dc-4ed6-9947-bd2150f59a25/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:14:12.065955Z",
      "actor": {
        "type": "CLIENT",
        "id": "77f11461-e44c-48da-acd5-1371e171da46",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
        "quote_id": "450abd6b-f1cf-42b6-b1ef-dc04739f8797",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "8116bed0-b3b1-41e9-a872-2bb445732959"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:14:12.067137Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
        "attempt_id": "30ae406a-9055-468a-a26a-e713f88a6483",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8116bed0-b3b1-41e9-a872-2bb445732959"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:14:12.083779Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f590137b-07e7-498b-af32-c29837f03bf1",
        "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478,
        "expires_at": "2026-10-30T22:14:27.067638928Z"
      },
      "correlation_id": "8116bed0-b3b1-41e9-a872-2bb445732959"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T22:14:12.492474Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f590137b-07e7-498b-af32-c29837f03bf1",
        "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "56c0bef6-91a4-491d-8dfb-825c32b14938"
      },
```

Done: orders ef451789-4f36-4bcc-9e12-840ec23f7a9d, 4b7001c1-e0dc-4ed6-9947-bd2150f59a25.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733257180",
  "device_ref": "sandbox-1784"
}
```

```json
{
  "challenge_id": "4c6532cd-5fee-4225-9205-13f039a51bee",
  "expires_at": "2026-10-30T22:19:14.512774618Z",
  "resend_available_at": "2026-10-30T22:14:15.512774618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733257180` → **200**

```json
{
  "phone": "+380733257180",
  "audience": "CLIENT",
  "code": "211065",
  "sent_at": "2026-10-30T22:14:14.514562847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c6532cd-5fee-4225-9205-13f039a51bee",
  "code": "211065",
  "device_ref": "sandbox-1784"
}
```

```json
{
  "session_id": "bb975658-4912-41b6-823a-92248202f29f",
  "subject": {
    "type": "CLIENT",
    "id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOGEwNGQ2Zi1lNzAyLTRkZmMtODlkNC0yM2Y0Yzg0MmU3YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5MzU0LCJpYXQiOjE3OTMzOTg0NTQsImp0aSI6ImU2OWVjYTkzLTU0ODQtNGE4Zi1hZjM1LWYxN2Q3MTVhZjhhZCIsInNpZCI6ImJiOTc1NjU4LTQ5MTItNDFiNi04MjNhLTkyMjQ4MjAyZjI5ZiJ9.T2XPF1cqiU0f9EhkLHPIHg9MDcqZRzh77pIdYFXx4dc",
  "access_expires_at": "2026-10-30T22:29:14.736407236Z",
  "refresh_token": "SB01QPqccFEkOe_hOFzdDq4REhBaNAxZLY6OSMrH5Vk",
  "refresh_expires_at": "2026-11-29T22:14:14.735996919Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d874bb7c-b550-4527-bf5d-03935d5ca410",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "bb6dae8b-c0f0-4db2-912c-223fbb95a364",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-bb6dae8b-c0f0-4db2-912c-223fbb95a364",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4029fae620b25ef458045121ceac7c27",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=bb6dae8b-c0f0-4db2-912c-223fbb95a364",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733257180"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=bb6dae8b-c0f0-4db2-912c-223fbb95a364",
  "expires_at": "2026-10-30T22:44:14.928614Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/bb6dae8b-c0f0-4db2-912c-223fbb95a364` → **200**

```json
{
  "id": "bb6dae8b-c0f0-4db2-912c-223fbb95a364",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T22:44:14.928614Z",
  "card": {
    "id": "3ba07bc2-1c84-449b-b0e8-d429d3dff4bf",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5272",
    "card_type": "Visa",
    "created_at": "2026-10-30T22:14:15.140167Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3ba07bc2-1c84-449b-b0e8-d429d3dff4bf",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5272",
      "card_type": "Visa",
      "created_at": "2026-10-30T22:14:15.140167Z"
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
  "device_ref": "sandbox-17435"
}
```

```json
{
  "challenge_id": "87eed349-f1e9-4c5d-b07f-3734afcb047b",
  "expires_at": "2026-10-30T22:19:15.557771498Z",
  "resend_available_at": "2026-10-30T22:14:16.557771498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "340170",
  "sent_at": "2026-10-30T22:14:15.559802002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87eed349-f1e9-4c5d-b07f-3734afcb047b",
  "code": "340170",
  "device_ref": "sandbox-17435"
}
```

```json
{
  "session_id": "355c6935-dfa5-47c9-a28e-5d9fc9e43f44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTM1NSwiaWF0IjoxNzkzMzk4NDU1LCJqdGkiOiJlYzkzYmQ2ZC00MWUxLTRiOWYtOGUyMy1lNmViMjcyNmNlNjIiLCJzaWQiOiIzNTVjNjkzNS1kZmE1LTQ3YzktYTI4ZS01ZDlmYzllNDNmNDQifQ.oCHQBWFIaBLOyRANEw5eSi_PdJ8swD01Ezi-ZOYQo6A",
  "access_expires_at": "2026-10-30T22:29:15.768484607Z",
  "refresh_token": "-i3hQGPP6x9_H3l6vl7gbsQVOJS0lrbOgkClo83_alA",
  "refresh_expires_at": "2026-11-29T22:14:15.768039873Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9bd240a4-accd-469d-bb28-3d0c189ee1b5",
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
  "last_heartbeat_at": "2026-10-30T22:14:11.65677Z",
  "last_location_at": "2026-10-30T22:14:11.65677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9bd240a4-accd-469d-bb28-3d0c189ee1b5/handover` → **200**

```json
{
  "command_id": "e88bf8c0-08d6-4177-a5ee-443137b4b8a6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9bd240a4-accd-469d-bb28-3d0c189ee1b5",
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
  "last_heartbeat_at": "2026-10-30T22:14:11.65677Z",
  "last_location_at": "2026-10-30T22:14:11.65677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 44 s to the next point)

`POST /api/driver/v1/work-sessions/9bd240a4-accd-469d-bb28-3d0c189ee1b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:15:00Z",
    "sequence": 1793398500381
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9bd240a4-accd-469d-bb28-3d0c189ee1b5",
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
  "last_heartbeat_at": "2026-10-30T22:15:00.398222Z",
  "last_location_at": "2026-10-30T22:15:00.398222Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9a9fb66c-41e8-469f-bca0-afb5a8994110",
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
  "id": "405f465d-7aff-4a82-8be9-7a40efb427c6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:20:00.602203Z",
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
  "command_id": "668609d1-1463-4f47-881e-517abff607f2",
  "quote_id": "405f465d-7aff-4a82-8be9-7a40efb427c6",
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
  "id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
  "created_at": "2026-10-30T22:15:00.888813Z",
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

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18` → **200**

```json
{
  "id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
  "created_at": "2026-10-30T22:15:00.888813Z",
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

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18` → **200**

```json
{
  "id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
  "created_at": "2026-10-30T22:15:00.888813Z",
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
    "id": "e6204716-0323-4d3f-89f2-0847caeaf815",
    "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
    "expires_at": "2026-10-30T22:15:16.564922Z",
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

`POST /api/driver/v1/offers/e6204716-0323-4d3f-89f2-0847caeaf815/accept` → **200**

```json
{
  "command_id": "7e62d7d6-6677-4e17-bb79-d1b2b22dc6cf"
}
```

```json
{
  "id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e66edd35-378b-41c5-880e-102f997fc206",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e66edd35-378b-41c5-880e-102f997fc206",
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "assignment_id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
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

`POST /api/driver/v1/work-sessions/9bd240a4-accd-469d-bb28-3d0c189ee1b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:15:09Z",
    "sequence": 1793398509149
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9bd240a4-accd-469d-bb28-3d0c189ee1b5",
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
  "last_heartbeat_at": "2026-10-30T22:15:09.165807Z",
  "last_location_at": "2026-10-30T22:15:09.165807Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e66edd35-378b-41c5-880e-102f997fc206/arrive` → **200**

```json
{
  "command_id": "a7ae157b-d4ae-44d3-a9f7-17ea12cf87cc",
  "expected_version": 0
}
```

```json
{
  "id": "e66edd35-378b-41c5-880e-102f997fc206",
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "assignment_id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
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
  "arrived_at": "2026-10-30T22:15:09.415769Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e66edd35-378b-41c5-880e-102f997fc206/start` → **200**

```json
{
  "command_id": "06a1e289-0826-4acf-9085-08801bff623f",
  "expected_version": 1
}
```

```json
{
  "id": "e66edd35-378b-41c5-880e-102f997fc206",
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "assignment_id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
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
  "arrived_at": "2026-10-30T22:15:09.415769Z",
  "started_at": "2026-10-30T22:15:09.630891Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e66edd35-378b-41c5-880e-102f997fc206/complete` → **200**

```json
{
  "command_id": "3d82d668-078a-458a-9ce1-f64105e78861",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:15:09Z",
  "cash_received": true
}
```

```json
{
  "id": "e66edd35-378b-41c5-880e-102f997fc206",
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "assignment_id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
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
  "arrived_at": "2026-10-30T22:15:09.415769Z",
  "started_at": "2026-10-30T22:15:09.630891Z",
  "completed_at": "2026-10-30T22:15:09.854852Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18` → **200**

```json
{
  "id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
    "id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
    "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e66edd35-378b-41c5-880e-102f997fc206",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:15:00.888813Z",
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

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18` → **200**

```json
{
  "id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
    "id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
    "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e66edd35-378b-41c5-880e-102f997fc206",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:15:00.888813Z",
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

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18` → **200**

```json
{
  "id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
    "id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
    "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e66edd35-378b-41c5-880e-102f997fc206",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:15:00.888813Z",
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

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18` → **200**

```json
{
  "id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
    "id": "05d3ac64-cf4d-4a0a-ad80-4ca926e735d1",
    "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e66edd35-378b-41c5-880e-102f997fc206",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:15:00.888813Z",
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

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18/tip` → **200**

```json
{
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
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
  "available_until": "2026-10-31T22:15:09.854852Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18/tip` → **201**

```json
{
  "command_id": "eafee03c-05cd-457c-b1f5-f9004ff93782",
  "amount_minor": 2500
}
```

```json
{
  "id": "3a98f6bc-a86b-4d2a-8552-77dc890b86d8",
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T22:15:14.361Z"
}
```

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18/tip` → **200**

```json
{
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
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
  "available_until": "2026-10-31T22:15:09.854852Z",
  "open": false,
  "tip": {
    "id": "3a98f6bc-a86b-4d2a-8552-77dc890b86d8",
    "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T22:15:14.361Z"
  }
}
```

`GET /api/rider/v1/orders/3554c8cd-a941-42bb-b87e-4eec07ca6c18/tip` → **200**

```json
{
  "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
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
  "available_until": "2026-10-31T22:15:09.854852Z",
  "open": false,
  "tip": {
    "id": "3a98f6bc-a86b-4d2a-8552-77dc890b86d8",
    "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T22:15:14.361Z"
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
      "id": "922d3ab7-c908-49b6-a74c-f08a40746762",
      "at": "2026-10-30T22:15:15.666074Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
      "counterpart_id": null
    },
    {
      "id": "7c3a9467-943a-471c-8715-ffbe0cbccac7",
      "at": "2026-10-30T22:15:10.616828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
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
  "command_id": "439074f4-876a-4434-8c45-c1d3942d6a71",
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
  "id": "5e39fb0e-b0fb-4c49-a364-3b536afd06b1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:20:16.211384Z",
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
  "session_id": "9e21b6c4-28ef-4f44-8b46-4bf270a0f92e",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk0MTYsImlhdCI6MTc5MzM5ODUxNiwianRpIjoiZmE1ZWVhYTUtMGRiNC00M2E4LWE1MTMtNGQ4ZWExN2E1NTY4Iiwic2lkIjoiOWUyMWI2YzQtMjhlZi00ZjQ0LThiNDYtNGJmMjcwYTBmOTJlIn0.0mYJEfXe7p-bZ0Nf5gUjQdtVOJDIkR3fQ1X0wrayCpM",
  "access_expires_at": "2026-10-30T22:30:16.639002755Z",
  "refresh_token": "CMWIi_Np1-dL1KrBfImax9OC3X9MJ2lbMRI7GktDj3E",
  "refresh_expires_at": "2026-10-31T10:15:16.638622023Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733257180` → **200**

```json
{
  "client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2"
}
```

`POST /api/admin/v1/rider-wallets/08a04d6f-e702-4dfc-89d4-23f4c842e7b2/top-ups` → **201**

```json
{
  "command_id": "14721c60-f4ce-4ec4-bf7f-cf0ab3c81b84",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
      "id": "364141ec-d1f5-4d9c-a09b-97abbcc50ed0",
      "at": "2026-10-30T22:15:17.045529Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "28db4e81-88b8-4bb0-b07a-df093b242a72",
  "quote_id": "5e39fb0e-b0fb-4c49-a364-3b536afd06b1",
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
  "id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
  "created_at": "2026-10-30T22:15:17.260453Z",
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

`GET /api/rider/v1/orders/38699775-576a-40ed-9d7a-c0e827970e70` → **200**

```json
{
  "id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
  "created_at": "2026-10-30T22:15:17.260453Z",
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
    "id": "47873299-00e8-48f9-bf8d-412e042b72a0",
    "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
    "expires_at": "2026-10-30T22:15:32.263543Z",
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

`POST /api/driver/v1/offers/47873299-00e8-48f9-bf8d-412e042b72a0/accept` → **200**

```json
{
  "command_id": "5e307d77-26a9-4aa0-b829-8ea313def57b"
}
```

```json
{
  "id": "c5544604-9d5a-4462-aff0-dcbb4fc4d78a",
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9da1286f-bdb5-4b20-8937-aaac32ea96a4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9da1286f-bdb5-4b20-8937-aaac32ea96a4",
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "assignment_id": "c5544604-9d5a-4462-aff0-dcbb4fc4d78a",
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

`POST /api/driver/v1/work-sessions/9bd240a4-accd-469d-bb28-3d0c189ee1b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:15:18Z",
    "sequence": 1793398518340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9bd240a4-accd-469d-bb28-3d0c189ee1b5",
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
  "last_heartbeat_at": "2026-10-30T22:15:18.356422Z",
  "last_location_at": "2026-10-30T22:15:18.356422Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9da1286f-bdb5-4b20-8937-aaac32ea96a4/arrive` → **200**

```json
{
  "command_id": "e0349b64-d923-46fc-9893-666699bb5793",
  "expected_version": 0
}
```

```json
{
  "id": "9da1286f-bdb5-4b20-8937-aaac32ea96a4",
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "assignment_id": "c5544604-9d5a-4462-aff0-dcbb4fc4d78a",
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
  "arrived_at": "2026-10-30T22:15:18.563908Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9da1286f-bdb5-4b20-8937-aaac32ea96a4/start` → **200**

```json
{
  "command_id": "7f335f89-b466-430f-85a0-c13e614fff8c",
  "expected_version": 1
}
```

```json
{
  "id": "9da1286f-bdb5-4b20-8937-aaac32ea96a4",
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "assignment_id": "c5544604-9d5a-4462-aff0-dcbb4fc4d78a",
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
  "arrived_at": "2026-10-30T22:15:18.563908Z",
  "started_at": "2026-10-30T22:15:18.787053Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9da1286f-bdb5-4b20-8937-aaac32ea96a4/complete` → **200**

```json
{
  "command_id": "75e0bb91-b297-48ac-bd32-4941bb2aadc7",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:15:18Z",
  "cash_received": true
}
```

```json
{
  "id": "9da1286f-bdb5-4b20-8937-aaac32ea96a4",
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "assignment_id": "c5544604-9d5a-4462-aff0-dcbb4fc4d78a",
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
  "arrived_at": "2026-10-30T22:15:18.563908Z",
  "started_at": "2026-10-30T22:15:18.787053Z",
  "completed_at": "2026-10-30T22:15:19.00843Z",
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
  "client_id": "08a04d6f-e702-4dfc-89d4-23f4c842e7b2",
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
      "id": "364141ec-d1f5-4d9c-a09b-97abbcc50ed0",
      "at": "2026-10-30T22:15:17.045529Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
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

`GET /api/rider/v1/orders/38699775-576a-40ed-9d7a-c0e827970e70/tip` → **200**

```json
{
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
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
  "available_until": "2026-10-31T22:15:19.00843Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/38699775-576a-40ed-9d7a-c0e827970e70/tip` → **201**

```json
{
  "command_id": "56a174ab-49f2-44db-9b62-44415277594f",
  "amount_minor": 2500
}
```

```json
{
  "id": "891503d9-8f31-40b7-b7fb-1d288b605bce",
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T22:15:19.841451Z"
}
```

`GET /api/rider/v1/orders/38699775-576a-40ed-9d7a-c0e827970e70/tip` → **200**

```json
{
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
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
  "available_until": "2026-10-31T22:15:19.00843Z",
  "open": false,
  "tip": {
    "id": "891503d9-8f31-40b7-b7fb-1d288b605bce",
    "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T22:15:19.841451Z"
  }
}
```

`GET /api/rider/v1/orders/38699775-576a-40ed-9d7a-c0e827970e70/tip` → **200**

```json
{
  "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
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
  "available_until": "2026-10-31T22:15:19.00843Z",
  "open": false,
  "tip": {
    "id": "891503d9-8f31-40b7-b7fb-1d288b605bce",
    "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T22:15:19.841451Z"
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
      "id": "3c5c8e51-84c7-43a5-aca0-f5fbabc78a47",
      "at": "2026-10-30T22:15:19.710611Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
      "counterpart_id": null
    },
    {
      "id": "922d3ab7-c908-49b6-a74c-f08a40746762",
      "at": "2026-10-30T22:15:15.666074Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
      "counterpart_id": null
    },
    {
      "id": "7c3a9467-943a-471c-8715-ffbe0cbccac7",
      "at": "2026-10-30T22:15:10.616828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
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
      "id": "d2268f38-ea7d-4904-b080-9f684e59c06d",
      "at": "2026-10-30T22:15:21.731837Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
      "counterpart_id": null
    },
    {
      "id": "3c5c8e51-84c7-43a5-aca0-f5fbabc78a47",
      "at": "2026-10-30T22:15:19.710611Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
      "counterpart_id": null
    },
    {
      "id": "922d3ab7-c908-49b6-a74c-f08a40746762",
      "at": "2026-10-30T22:15:15.666074Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
      "counterpart_id": null
    },
    {
      "id": "7c3a9467-943a-471c-8715-ffbe0cbccac7",
      "at": "2026-10-30T22:15:10.616828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
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
  "session_id": "9bd240a4-accd-469d-bb28-3d0c189ee1b5",
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
  "last_heartbeat_at": "2026-10-30T22:15:18.356422Z",
  "last_location_at": "2026-10-30T22:15:18.356422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9bd240a4-accd-469d-bb28-3d0c189ee1b5/close` → **200**

```json
{
  "command_id": "4a64954f-bf17-4018-b43f-189d0770f3f8",
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

Done: card order 38699775-576a-40ed-9d7a-c0e827970e70.

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
  "phone": "+380730082648",
  "device_ref": "sandbox-17764"
}
```

```json
{
  "challenge_id": "1f25fe68-09db-43d8-b429-ae4c4fd103ff",
  "expires_at": "2026-10-30T22:20:23.52099769Z",
  "resend_available_at": "2026-10-30T22:15:24.52099769Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730082648` → **200**

```json
{
  "phone": "+380730082648",
  "audience": "CLIENT",
  "code": "416890",
  "sent_at": "2026-10-30T22:15:23.530313463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f25fe68-09db-43d8-b429-ae4c4fd103ff",
  "code": "416890",
  "device_ref": "sandbox-17764"
}
```

```json
{
  "session_id": "c9c79b47-727e-452b-9d2b-c20a0271c133",
  "subject": {
    "type": "CLIENT",
    "id": "5a5aae6f-aedd-4f80-bcb8-8e52a9d45d3a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTVhYWU2Zi1hZWRkLTRmODAtYmNiOC04ZTUyYTlkNDVkM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NDIzLCJpYXQiOjE3OTMzOTg1MjMsImp0aSI6IjZhYzI2ZWRmLWNlZDQtNGVlMS05OGI0LWQ1ZWE4ZWQ3N2RjYSIsInNpZCI6ImM5Yzc5YjQ3LTcyN2UtNDUyYi05ZDJiLWMyMGEwMjcxYzEzMyJ9.O39VTG4nL5VFwMcMHSMWwU6eF_ftm0m3r-ATj9Umb9E",
  "access_expires_at": "2026-10-30T22:30:23.773752087Z",
  "refresh_token": "GnVvwRpFeLx_cvDx8HA_Z_B8_WJuM8C5wTCOhuptIVQ",
  "refresh_expires_at": "2026-11-29T22:15:23.773289412Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "970defaf-37ba-430a-96d0-894b8b815fd6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "81565b4c-d15f-46b5-b032-fe03707ae165",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-81565b4c-d15f-46b5-b032-fe03707ae165",
    "orderDate": "1793398523",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "77399a80e78c6fe482f4d8a09cc8926a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=81565b4c-d15f-46b5-b032-fe03707ae165",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730082648"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=81565b4c-d15f-46b5-b032-fe03707ae165",
  "created_at": "2026-10-30T22:15:23.984437Z",
  "expires_at": "2026-10-30T22:45:23.984437Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/81565b4c-d15f-46b5-b032-fe03707ae165` → **200**

```json
{
  "id": "81565b4c-d15f-46b5-b032-fe03707ae165",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T22:15:23.984437Z",
  "expires_at": "2026-10-30T22:45:23.984437Z",
  "completed_at": "2026-10-30T22:15:24.19934Z",
  "masked_pan": "41****5533",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5a5aae6f-aedd-4f80-bcb8-8e52a9d45d3a",
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
  "client_id": "5a5aae6f-aedd-4f80-bcb8-8e52a9d45d3a",
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
      "id": "d92ffcd6-7200-48e3-b7ed-9b8123d87931",
      "at": "2026-10-30T22:15:24.743609Z",
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
  "client_id": "5a5aae6f-aedd-4f80-bcb8-8e52a9d45d3a",
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
      "id": "d92ffcd6-7200-48e3-b7ed-9b8123d87931",
      "at": "2026-10-30T22:15:24.743609Z",
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
  "device_ref": "sandbox-20862"
}
```

```json
{
  "challenge_id": "d5324960-5e1e-4898-9df5-3111f9831f01",
  "expires_at": "2026-10-30T22:20:26.038741357Z",
  "resend_available_at": "2026-10-30T22:15:27.038741357Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "155728",
  "sent_at": "2026-10-30T22:15:26.040781974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5324960-5e1e-4898-9df5-3111f9831f01",
  "code": "155728",
  "device_ref": "sandbox-20862"
}
```

```json
{
  "session_id": "0b98fcf0-9977-49f8-a675-feada105914a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTQyNiwiaWF0IjoxNzkzMzk4NTI2LCJqdGkiOiI2ZGU5OWM5Yi0xYmQxLTQ0NWUtOGI2Zi1iODFjMzg1YWY0MWMiLCJzaWQiOiIwYjk4ZmNmMC05OTc3LTQ5ZjgtYTY3NS1mZWFkYTEwNTkxNGEifQ.MTMlj5W3TKIo4BfoRcRIHq9-ck-Dohl-X9p-FGDvArA",
  "access_expires_at": "2026-10-30T22:30:26.262542014Z",
  "refresh_token": "hrJRgrfpKm6xgLKR4-xiAgR_Uww3sRZIHUxiH2Qti2A",
  "refresh_expires_at": "2026-11-29T22:15:26.262113755Z",
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
  "command_id": "d4092c13-e3a4-4066-9d31-2f8e742c4599",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "698e0ce2-3839-4ee1-9c1b-e84938c1cf15",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-698e0ce2-3839-4ee1-9c1b-e84938c1cf15",
    "orderDate": "1793398526",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "87528335e54c08b7a48eca1dea3a3028",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=698e0ce2-3839-4ee1-9c1b-e84938c1cf15",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=698e0ce2-3839-4ee1-9c1b-e84938c1cf15",
  "created_at": "2026-10-30T22:15:26.65181Z",
  "expires_at": "2026-10-30T22:45:26.65181Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/698e0ce2-3839-4ee1-9c1b-e84938c1cf15` → **200**

```json
{
  "id": "698e0ce2-3839-4ee1-9c1b-e84938c1cf15",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T22:15:26.65181Z",
  "expires_at": "2026-10-30T22:45:26.65181Z",
  "completed_at": "2026-10-30T22:15:26.849784Z",
  "masked_pan": "41****9734",
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
      "id": "e94387b7-3722-4029-b24e-9d274c00c32c",
      "at": "2026-10-30T22:15:27.751247Z",
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
  "command_id": "942efb61-3d48-491e-aeeb-9510ce02f2a5",
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
  "correlation_id": "37ed42ec-8bba-4de9-ae21-61eff14c53f1"
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
  "device_ref": "sandbox-17525"
}
```

```json
{
  "challenge_id": "1a32b029-7718-4ba4-a44b-176cc7e1e874",
  "expires_at": "2026-10-30T22:20:28.663567038Z",
  "resend_available_at": "2026-10-30T22:15:29.663567038Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "832933",
  "sent_at": "2026-10-30T22:15:28.665780235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a32b029-7718-4ba4-a44b-176cc7e1e874",
  "code": "832933",
  "device_ref": "sandbox-17525"
}
```

```json
{
  "session_id": "2634b1b8-9478-4cb5-9d4f-5bda20129d46",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTQyOCwiaWF0IjoxNzkzMzk4NTI4LCJqdGkiOiI2NzYyNGFmZi1iZTZkLTRlNzEtOGRhNS02NDAxOWM3YmRjZDIiLCJzaWQiOiIyNjM0YjFiOC05NDc4LTRjYjUtOWQ0Zi01YmRhMjAxMjlkNDYifQ.-xwjw8ltvNAKqMtDfiwGCtV6wYrOr44dCi12mUNayAI",
  "access_expires_at": "2026-10-30T22:30:28.885206267Z",
  "refresh_token": "usqSlalinpyxlGdNKV-w9aSWZpkJsdJcCRa7vPDZ39Y",
  "refresh_expires_at": "2026-11-29T22:15:28.884833587Z",
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
  "command_id": "0641d358-e414-4218-ae0d-324e456b3ce6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:15:29Z",
    "sequence": 1793398529283
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d53324a6-289f-421e-a75d-7b6cbb38573c",
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
  "last_heartbeat_at": "2026-10-30T22:15:29.299454Z",
  "last_location_at": "2026-10-30T22:15:29.299454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636460938",
  "device_ref": "sandbox-28027"
}
```

```json
{
  "challenge_id": "2e98f21f-0249-497c-9dd6-e75c0a26e0ac",
  "expires_at": "2026-10-30T22:20:29.495535419Z",
  "resend_available_at": "2026-10-30T22:15:30.495535419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636460938` → **200**

```json
{
  "phone": "+380636460938",
  "audience": "CLIENT",
  "code": "437708",
  "sent_at": "2026-10-30T22:15:29.497381083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e98f21f-0249-497c-9dd6-e75c0a26e0ac",
  "code": "437708",
  "device_ref": "sandbox-28027"
}
```

```json
{
  "session_id": "a0ef7cd9-8a1d-4223-8bf9-1a4855be5f49",
  "subject": {
    "type": "CLIENT",
    "id": "53d26f4d-3c93-4c1b-96e6-bd014e8099e1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2QyNmY0ZC0zYzkzLTRjMWItOTZlNi1iZDAxNGU4MDk5ZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NDI5LCJpYXQiOjE3OTMzOTg1MjksImp0aSI6ImNmNDUyYjIwLTVkNWItNGY0NS04ODU3LTZmNTBiMWMwNTNiNiIsInNpZCI6ImEwZWY3Y2Q5LThhMWQtNDIyMy04YmY5LTFhNDg1NWJlNWY0OSJ9.3i_m_dR8OnOWPcY24dhocnoVn07_BM3firEZheftaRo",
  "access_expires_at": "2026-10-30T22:30:29.711825727Z",
  "refresh_token": "lyUCqREYbFC-P7qvRijy5zY8bqGJlIzEj0ECdeqcEUw",
  "refresh_expires_at": "2026-11-29T22:15:29.71142816Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "14be0f72-010d-4f7b-8f6e-a1578beeb6b0",
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
  "id": "ca679cee-78d6-45ad-8593-9eb18f1021e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:20:29.915118Z",
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
  "command_id": "3444f086-9d63-43f5-a6c2-6650f52b0823",
  "quote_id": "ca679cee-78d6-45ad-8593-9eb18f1021e8",
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
  "id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53d26f4d-3c93-4c1b-96e6-bd014e8099e1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:15:30.126827Z",
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
    "id": "3a117c57-bae0-4791-8a5b-d0409fcb11df",
    "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
    "expires_at": "2026-10-30T22:15:45.128585Z",
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

`POST /api/driver/v1/offers/3a117c57-bae0-4791-8a5b-d0409fcb11df/accept` → **200**

```json
{
  "command_id": "971bd2f7-6684-4049-a245-de5e75f37558"
}
```

```json
{
  "id": "0c86dc46-5447-4165-bec1-b0404eb4da2b",
  "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6bbf7502-8634-40a6-bd8e-fe94beee3571",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6bbf7502-8634-40a6-bd8e-fe94beee3571",
  "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "assignment_id": "0c86dc46-5447-4165-bec1-b0404eb4da2b",
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

`POST /api/driver/v1/work-sessions/d53324a6-289f-421e-a75d-7b6cbb38573c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:15:31Z",
    "sequence": 1793398531939
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d53324a6-289f-421e-a75d-7b6cbb38573c",
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
  "last_heartbeat_at": "2026-10-30T22:15:31.955659Z",
  "last_location_at": "2026-10-30T22:15:31.955659Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6bbf7502-8634-40a6-bd8e-fe94beee3571/arrive` → **200**

```json
{
  "command_id": "98d8f6e2-e4dd-450e-948c-08aca8b285c0",
  "expected_version": 0
}
```

```json
{
  "id": "6bbf7502-8634-40a6-bd8e-fe94beee3571",
  "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "assignment_id": "0c86dc46-5447-4165-bec1-b0404eb4da2b",
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
  "arrived_at": "2026-10-30T22:15:32.163746Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6bbf7502-8634-40a6-bd8e-fe94beee3571/start` → **200**

```json
{
  "command_id": "90d5dc58-2ca1-466f-9244-93b109fbf078",
  "expected_version": 1
}
```

```json
{
  "id": "6bbf7502-8634-40a6-bd8e-fe94beee3571",
  "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "assignment_id": "0c86dc46-5447-4165-bec1-b0404eb4da2b",
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
  "arrived_at": "2026-10-30T22:15:32.163746Z",
  "started_at": "2026-10-30T22:15:32.373489Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6bbf7502-8634-40a6-bd8e-fe94beee3571/complete` → **200**

```json
{
  "command_id": "65cc5e8f-c4a0-438b-bbc8-62859b66a946",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:15:32Z",
  "cash_received": false
}
```

```json
{
  "id": "6bbf7502-8634-40a6-bd8e-fe94beee3571",
  "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "assignment_id": "0c86dc46-5447-4165-bec1-b0404eb4da2b",
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
  "arrived_at": "2026-10-30T22:15:32.163746Z",
  "started_at": "2026-10-30T22:15:32.373489Z",
  "completed_at": "2026-10-30T22:15:32.580679Z",
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
  "session_id": "043afd7a-3eb8-4c1f-9671-e5a92ba2e639",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk0MzIsImlhdCI6MTc5MzM5ODUzMiwianRpIjoiM2VjMzE0MGMtNGEwZS00YTY4LWIxYmEtMWVjY2M4NTM2ZDc0Iiwic2lkIjoiMDQzYWZkN2EtM2ViOC00YzFmLTk2NzEtZTVhOTJiYTJlNjM5In0.O8AVmUa9bWraA2qEvOzJUlRJF4_538bQ0QtAuGMb38A",
  "access_expires_at": "2026-10-30T22:30:32.979480899Z",
  "refresh_token": "dbMPFSWwujaBaUWy1guAw8I0MrovI-ST7sW-61Jh4UQ",
  "refresh_expires_at": "2026-10-31T10:15:32.97910303Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/d1f7a9b0-4172-4608-901e-aafd3b2b59b7/cash-dispute` → **200**

```json
{
  "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "53d26f4d-3c93-4c1b-96e6-bd014e8099e1",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T22:15:32.791243Z",
  "decide_by": "2026-11-13T22:15:32.791243Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T22:15:32.791243Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "53d26f4d-3c93-4c1b-96e6-bd014e8099e1",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T22:15:32.791243Z",
      "decide_by": "2026-11-13T22:15:32.791243Z",
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

`POST /api/admin/v1/orders/d1f7a9b0-4172-4608-901e-aafd3b2b59b7/cash-dispute/decide` → **400**

```json
{
  "command_id": "92267ed3-7cf2-40b4-8729-d588dc9eb021",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/d1f7a9b0-4172-4608-901e-aafd3b2b59b7/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0c31f318-4efd-4b90-9ce6-1d4476945146",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/d1f7a9b0-4172-4608-901e-aafd3b2b59b7/cash-dispute/decide` → **200**

```json
{
  "command_id": "db5fbba9-a779-4899-94a3-bc1758b1568f",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "d1f7a9b0-4172-4608-901e-aafd3b2b59b7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "53d26f4d-3c93-4c1b-96e6-bd014e8099e1",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T22:15:32.791243Z",
  "decide_by": "2026-11-13T22:15:32.791243Z",
  "decision": "PAY_DRIVER",
  "decided_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T22:15:33.810466Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/d1f7a9b0-4172-4608-901e-aafd3b2b59b7/cash-dispute/decide` → **409**

```json
{
  "command_id": "b79e1222-6984-4914-8011-372d6f5a5ce0",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/d1f7a9b0-4172-4608-901e-aafd3b2b59b7/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bfd9da00-77db-4931-94de-b565419810bd"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d53324a6-289f-421e-a75d-7b6cbb38573c",
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
  "last_heartbeat_at": "2026-10-30T22:15:31.955659Z",
  "last_location_at": "2026-10-30T22:15:31.955659Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d53324a6-289f-421e-a75d-7b6cbb38573c/close` → **200**

```json
{
  "command_id": "ed8ea4bb-1d0d-47c7-8849-60f5c7f89e61",
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
  "phone": "+380731597063",
  "device_ref": "sandbox-24238"
}
```

```json
{
  "challenge_id": "c16bfc2f-a95c-403c-be03-7f5ff909df1f",
  "expires_at": "2026-10-30T22:20:34.626797934Z",
  "resend_available_at": "2026-10-30T22:15:35.626797934Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731597063` → **200**

```json
{
  "phone": "+380731597063",
  "audience": "CLIENT",
  "code": "418517",
  "sent_at": "2026-10-30T22:15:34.628857381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c16bfc2f-a95c-403c-be03-7f5ff909df1f",
  "code": "418517",
  "device_ref": "sandbox-24238"
}
```

```json
{
  "session_id": "bd0f0537-d76d-472a-b610-c6c12f6f31a1",
  "subject": {
    "type": "CLIENT",
    "id": "0754c880-31b4-4235-80f3-477b45666fc8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzU0Yzg4MC0zMWI0LTQyMzUtODBmMy00NzdiNDU2NjZmYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NDM0LCJpYXQiOjE3OTMzOTg1MzQsImp0aSI6ImNmMDcxMzdlLTk5MWQtNDUwMy1iOWQ2LWM4NjM4ZjRmYmJjYyIsInNpZCI6ImJkMGYwNTM3LWQ3NmQtNDcyYS1iNjEwLWM2YzEyZjZmMzFhMSJ9.16fGWdjWHmJE3s6n5UDprg1fQ7JIxnmVo84Ph2lOO2k",
  "access_expires_at": "2026-10-30T22:30:34.858415997Z",
  "refresh_token": "5vaDO5C6XWB6v140mRjiSQaMbDLXC8oKBQxbH4yUPWk",
  "refresh_expires_at": "2026-11-29T22:15:34.857991148Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "53685823-74cf-4935-81d2-afb401394522",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "5aaecc1e-264e-4a02-8109-ad296b17f9cc",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-5aaecc1e-264e-4a02-8109-ad296b17f9cc",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ab2e4b9287112a9940a62c9db876a1bc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=5aaecc1e-264e-4a02-8109-ad296b17f9cc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731597063"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=5aaecc1e-264e-4a02-8109-ad296b17f9cc",
  "expires_at": "2026-10-30T22:45:35.061458Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/5aaecc1e-264e-4a02-8109-ad296b17f9cc` → **200**

```json
{
  "id": "5aaecc1e-264e-4a02-8109-ad296b17f9cc",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T22:45:35.061458Z",
  "card": {
    "id": "c0ba3d05-cac4-4ebb-95d7-65efbb144152",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0376",
    "card_type": "Visa",
    "created_at": "2026-10-30T22:15:35.323375Z"
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
  "device_ref": "sandbox-14739"
}
```

```json
{
  "challenge_id": "f525f8c7-7e9b-430d-bd26-204e89ad4095",
  "expires_at": "2026-10-30T22:20:35.536686847Z",
  "resend_available_at": "2026-10-30T22:15:36.536686847Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "861821",
  "sent_at": "2026-10-30T22:15:35.538700194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f525f8c7-7e9b-430d-bd26-204e89ad4095",
  "code": "861821",
  "device_ref": "sandbox-14739"
}
```

```json
{
  "session_id": "83b06a3e-4bf6-4a4a-8f72-a652c2efa7ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTQzNSwiaWF0IjoxNzkzMzk4NTM1LCJqdGkiOiJjNWNjNDY0Yi1kNGY5LTQ5ZGUtYWUyZi1iNDEwNjBiMTkwNmEiLCJzaWQiOiI4M2IwNmEzZS00YmY2LTRhNGEtOGY3Mi1hNjUyYzJlZmE3ZWYifQ.ZZhUzIRJOgjjxvRJlu1JqZiSJab0k4KNTBcjTpHUKSA",
  "access_expires_at": "2026-10-30T22:30:35.765730027Z",
  "refresh_token": "MS8z-wptlT-TM_IWPwqGZV-C6cuymSaLzXjCJkPXkI4",
  "refresh_expires_at": "2026-11-29T22:15:35.765325078Z",
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
  "command_id": "7b45e2b1-e4e2-45a8-9eae-8f5790bf4698",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:15:36Z",
    "sequence": 1793398536185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63f5bb22-7d7a-48fd-b747-99c312b2b082",
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
  "last_heartbeat_at": "2026-10-30T22:15:36.201435Z",
  "last_location_at": "2026-10-30T22:15:36.201435Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2515808c-1342-4bb9-9bdf-9ae963219fce",
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
  "id": "fe67e777-780e-4459-aedd-564108bddb88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:20:36.414363Z",
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
  "command_id": "48ceb18c-590f-465d-8eae-b77a16480edb",
  "quote_id": "fe67e777-780e-4459-aedd-564108bddb88",
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
  "id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0754c880-31b4-4235-80f3-477b45666fc8",
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
  "created_at": "2026-10-30T22:15:36.624035Z",
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

`GET /api/rider/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22` → **200**

```json
{
  "id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0754c880-31b4-4235-80f3-477b45666fc8",
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
  "created_at": "2026-10-30T22:15:36.624035Z",
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
    "id": "f0effae6-3296-40c1-b06c-ff8deb6fdabd",
    "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
    "expires_at": "2026-10-30T22:15:51.845143Z",
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

`POST /api/driver/v1/offers/f0effae6-3296-40c1-b06c-ff8deb6fdabd/accept` → **200**

```json
{
  "command_id": "247910be-677a-4ac7-bfcf-3c9490ba7ac2"
}
```

```json
{
  "id": "29bda10b-8f88-4555-88ad-200aaaffa657",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "assignment_id": "29bda10b-8f88-4555-88ad-200aaaffa657",
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

`POST /api/rider/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/messages` → **201**

```json
{
  "command_id": "f2b9cfd0-2788-49c5-ac65-3320c08233dd",
  "body": "Я біля входу, мій номер +380731597063, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "6676395a-4e29-451c-8c4b-08dc8c3ad604",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731597063, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T22:15:37.707952911Z"
}
```

`POST /api/driver/v1/trips/884b9de5-b6ff-4ddb-98f3-95b9590649be/messages` → **201**

```json
{
  "command_id": "ffe8b695-ee3e-4bf0-ba81-e85baa105f95",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "3bdff0d2-1abe-475b-8b35-8700c6c0e05f",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T22:15:37.915564042Z"
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/63f5bb22-7d7a-48fd-b747-99c312b2b082/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:15:45Z",
    "sequence": 1793398545130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63f5bb22-7d7a-48fd-b747-99c312b2b082",
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
  "last_heartbeat_at": "2026-10-30T22:15:45.146334Z",
  "last_location_at": "2026-10-30T22:15:45.146334Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/884b9de5-b6ff-4ddb-98f3-95b9590649be/arrive` → **200**

```json
{
  "command_id": "1f1c92f0-1f01-46f3-a65b-5e3c63157735",
  "expected_version": 0
}
```

```json
{
  "id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "assignment_id": "29bda10b-8f88-4555-88ad-200aaaffa657",
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
  "arrived_at": "2026-10-30T22:15:45.349127Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/884b9de5-b6ff-4ddb-98f3-95b9590649be/start` → **200**

```json
{
  "command_id": "54ac6fc4-8e7b-4496-acea-f3b7dfe5baa6",
  "expected_version": 1
}
```

```json
{
  "id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "assignment_id": "29bda10b-8f88-4555-88ad-200aaaffa657",
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
  "arrived_at": "2026-10-30T22:15:45.349127Z",
  "started_at": "2026-10-30T22:15:45.557331Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 91 s to the next point)

`POST /api/driver/v1/work-sessions/63f5bb22-7d7a-48fd-b747-99c312b2b082/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:17:16Z",
    "sequence": 1793398636773
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63f5bb22-7d7a-48fd-b747-99c312b2b082",
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
  "last_heartbeat_at": "2026-10-30T22:17:16.790248Z",
  "last_location_at": "2026-10-30T22:17:16.790248Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/884b9de5-b6ff-4ddb-98f3-95b9590649be/complete` → **200**

```json
{
  "command_id": "682c3fc1-ad34-4861-b7c3-b736bcfa4133",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:17:16Z",
  "cash_received": false
}
```

```json
{
  "id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "assignment_id": "29bda10b-8f88-4555-88ad-200aaaffa657",
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
  "arrived_at": "2026-10-30T22:15:45.349127Z",
  "started_at": "2026-10-30T22:15:45.557331Z",
  "completed_at": "2026-10-30T22:17:16.995852Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22` → **200**

```json
{
  "id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0754c880-31b4-4235-80f3-477b45666fc8",
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
    "id": "29bda10b-8f88-4555-88ad-200aaaffa657",
    "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:15:36.624035Z",
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

`GET /api/rider/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22` → **200**

```json
{
  "id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0754c880-31b4-4235-80f3-477b45666fc8",
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
    "id": "29bda10b-8f88-4555-88ad-200aaaffa657",
    "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:15:36.624035Z",
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

`GET /api/rider/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22` → **200**

```json
{
  "id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0754c880-31b4-4235-80f3-477b45666fc8",
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
    "id": "29bda10b-8f88-4555-88ad-200aaaffa657",
    "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:15:36.624035Z",
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
  "session_id": "63f5bb22-7d7a-48fd-b747-99c312b2b082",
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
  "last_heartbeat_at": "2026-10-30T22:17:16.790248Z",
  "last_location_at": "2026-10-30T22:17:16.790248Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63f5bb22-7d7a-48fd-b747-99c312b2b082/close` → **200**

```json
{
  "command_id": "a4aa1e3f-91f3-448b-8397-a40efa27a75e",
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
  "session_id": "1573a266-5aa1-4af6-9f2d-26f5bab8c8f0",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NDAsImlhdCI6MTc5MzM5ODY0MCwianRpIjoiNmI5MTA5NjgtYjUyNy00NmExLTg2ZjYtZDIwY2Q4ZjJhNTZiIiwic2lkIjoiMTU3M2EyNjYtNWFhMS00YWY2LTlmMmQtMjZmNWJhYjhjOGYwIn0.8p6bBD7B8qS6W9MOyWmXSybvbKWccnCjFI_iGldpd1c",
  "access_expires_at": "2026-10-30T22:32:20.413115293Z",
  "refresh_token": "kjFc0ZI0E-iWGHnA_4QI_WKmILVTPiPg64-9hq1AYlY",
  "refresh_expires_at": "2026-10-31T10:17:20.412730681Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "89f700f9-49e8-4585-89c4-76c03c05da86"
}
```

`GET /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T22:17:20.805474234Z",
  "order": {
    "id": "8b260855-9910-4290-8cc9-02b555c65d22",
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
    "created_at": "2026-10-30T22:15:36.624035Z",
    "assigned_at": "2026-10-30T22:15:37.303944Z",
    "arrived_at": "2026-10-30T22:15:45.349127Z",
    "started_at": "2026-10-30T22:15:45.557331Z",
    "completed_at": "2026-10-30T22:17:16.995852Z"
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
    "id": "0754c880-31b4-4235-80f3-477b45666fc8",
    "registered_at": "2026-10-30T22:15:34.856463Z",
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
      "created_at": "2026-10-30T22:15:36.625541Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T22:17:17.033026Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks` → **422**

```json
{
  "command_id": "6606a13c-7112-4854-83d7-2e9f47590805",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "0550273f-8dbb-41bc-a532-d5d13279a852"
}
```

`POST /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks` → **201**

```json
{
  "command_id": "54a9d55c-20f6-45ac-9ed3-6f52b2abcbd1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "dea81e95-0020-4b59-a29c-7c5b85c250ac",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T22:17:21.254027Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks` → **201**

```json
{
  "command_id": "54a9d55c-20f6-45ac-9ed3-6f52b2abcbd1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "dea81e95-0020-4b59-a29c-7c5b85c250ac",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T22:17:21.254027Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/0754c880-31b4-4235-80f3-477b45666fc8` → **200**

```json
{
  "client": {
    "id": "0754c880-31b4-4235-80f3-477b45666fc8",
    "phone": "+380731597063",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:15:34.856463Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "8b260855-9910-4290-8cc9-02b555c65d22",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:15:36.624035Z",
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

`GET /api/admin/v1/clients/0754c880-31b4-4235-80f3-477b45666fc8` → **200**

```json
{
  "client": {
    "id": "0754c880-31b4-4235-80f3-477b45666fc8",
    "phone": "+380731597063",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:15:34.856463Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "8b260855-9910-4290-8cc9-02b555c65d22",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:15:36.624035Z",
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

`POST /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks/dea81e95-0020-4b59-a29c-7c5b85c250ac/resolve` → **200**

```json
{
  "command_id": "9c0f4cca-768c-4476-858e-4472d4bc0467",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "dea81e95-0020-4b59-a29c-7c5b85c250ac",
  "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T22:17:21.254027Z",
  "resolved_at": "2026-10-30T22:17:23.089087Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/0754c880-31b4-4235-80f3-477b45666fc8` → **200**

```json
{
  "client": {
    "id": "0754c880-31b4-4235-80f3-477b45666fc8",
    "phone": "+380731597063",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:15:34.856463Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "8b260855-9910-4290-8cc9-02b555c65d22",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:15:36.624035Z",
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

`GET /api/admin/v1/clients/0754c880-31b4-4235-80f3-477b45666fc8` → **200**

```json
{
  "client": {
    "id": "0754c880-31b4-4235-80f3-477b45666fc8",
    "phone": "+380731597063",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:15:34.856463Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "8b260855-9910-4290-8cc9-02b555c65d22",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T22:15:36.624035Z",
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

`POST /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks/dea81e95-0020-4b59-a29c-7c5b85c250ac/resolve` → **409**

```json
{
  "command_id": "b635c350-ff20-47e7-92a4-dc4b343fd68d",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks/dea81e95-0020-4b59-a29c-7c5b85c250ac/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3cebe876-b98e-4160-9a25-c841a255b12c"
}
```

`GET /api/admin/v1/orders/8b260855-9910-4290-8cc9-02b555c65d22/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "dea81e95-0020-4b59-a29c-7c5b85c250ac",
      "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T22:17:21.254027Z",
      "resolved_at": "2026-10-30T22:17:23.089087Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 8b260855-9910-4290-8cc9-02b555c65d22 without phone or card digits; chargeback dea81e95-0020-4b59-a29c-7c5b85c250ac recorded and won.

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
  "session_id": "c66ea495-2ed9-4a2b-b6a2-a48ea7911df3",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NDUsImlhdCI6MTc5MzM5ODY0NSwianRpIjoiYjQ3ZTUxNjUtZjczMS00MWFmLTk5MmQtMDhlMTUxMjczMmRhIiwic2lkIjoiYzY2ZWE0OTUtMmVkOS00YTJiLWI2YTItYTQ4ZWE3OTExZGYzIn0.WNn3CNJyqYju-ELLaZwYE40wMirHLCUBjRCRBonmEOo",
  "access_expires_at": "2026-10-30T22:32:25.517608434Z",
  "refresh_token": "RjPf77IuerEbKOQCzxVgQcvNzv9SI-PuJO1N8gwKlEA",
  "refresh_expires_at": "2026-10-31T10:17:25.517119705Z",
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
  "phone": "+48600263020",
  "device_ref": "sandbox-10609"
}
```

```json
{
  "challenge_id": "9b6f17d4-b28b-4cc9-a0d2-6717db18cc35",
  "expires_at": "2026-10-30T22:22:26.107609222Z",
  "resend_available_at": "2026-10-30T22:17:27.107609222Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600263020` → **200**

```json
{
  "phone": "+48600263020",
  "audience": "CLIENT",
  "code": "399663",
  "sent_at": "2026-10-30T22:17:26.109511073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b6f17d4-b28b-4cc9-a0d2-6717db18cc35",
  "code": "399663",
  "device_ref": "sandbox-10609"
}
```

```json
{
  "session_id": "5a57f8d5-1688-403c-817a-9f8692aa36a9",
  "subject": {
    "type": "CLIENT",
    "id": "c34ca307-6f05-4996-940d-6e008a27742f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzRjYTMwNy02ZjA1LTQ5OTYtOTQwZC02ZTAwOGEyNzc0MmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTQ2LCJpYXQiOjE3OTMzOTg2NDYsImp0aSI6ImExYzc3NGU0LTBiNjMtNDQ3ZS1hOTc0LTM4NDFjNzZiMjVkMCIsInNpZCI6IjVhNTdmOGQ1LTE2ODgtNDAzYy04MTdhLTlmODY5MmFhMzZhOSJ9.QcG0KubDgYwygfxJ6Lnv8mVa4KJw5dkWA7GFk7UBlyg",
  "access_expires_at": "2026-10-30T22:32:26.321257637Z",
  "refresh_token": "lolAfvxRRLrT1HeXjAr3o3qnP22zBcxh0rr4xKRgLNM",
  "refresh_expires_at": "2026-11-29T22:17:26.320814136Z",
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
  "command_id": "10b18f7d-740a-4639-803a-53b49fed9605",
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
  "correlation_id": "07fcf409-b8e1-4aaa-9009-fab4a857cae2",
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
  "command_id": "69faadf5-4eb1-4658-85f9-5e1bb8b32649",
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
  "paused_at": "2026-10-30T22:17:27.123975766Z",
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
  "command_id": "e2a33963-b3f7-4a82-b331-75ff5e620c99",
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
  "id": "3414ca70-f7ca-44b7-86b8-b4ae22bb57b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:22:27.535049Z",
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
  "command_id": "d7c5521d-6289-491d-bd88-926fdf964f11",
  "quote_id": "3414ca70-f7ca-44b7-86b8-b4ae22bb57b2",
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
  "correlation_id": "01a29525-cc8a-4f37-869b-b266a283142b"
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
  "paused_at": "2026-10-30T22:17:27.123976Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "8c630354-ec21-4d3f-bb83-c9f9a7517200",
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
  "command_id": "a5c5a49b-25c9-41d0-bede-20841d95a800",
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
  "command_id": "708a23d1-3f87-4bb1-b833-b63c174953d6",
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
  "id": "62742480-147c-4491-b185-ea1c9a8c5fda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:22:28.768106Z",
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
  "command_id": "0f9032c8-da05-46dd-ab66-5471db19df6b",
  "quote_id": "62742480-147c-4491-b185-ea1c9a8c5fda",
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
  "correlation_id": "6eadba66-d767-4b5d-9630-aeae4c0e1d71"
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
  "command_id": "cfe28a52-bca7-4838-bf4c-a30befbad40e",
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
  "command_id": "1b412d69-58dd-4226-8619-e8224f480e08",
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
  "id": "b675939e-a422-4d72-a752-24949f876564",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:22:29.558245Z",
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
  "command_id": "8b0688a6-68e6-4cfb-a87c-269b964e9852",
  "quote_id": "b675939e-a422-4d72-a752-24949f876564",
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
  "correlation_id": "7fbe90d5-ef3d-48f7-9ed9-5aa27b9ef5ed"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "1473f267-34e5-4dd8-a583-fa0bc1b72dbd",
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
  "correlation_id": "9887794b-f51a-4911-aac2-d9d97f11bd4f",
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
  "command_id": "ff91bde6-bc29-4bfd-bac3-7d0bef5f5cc8",
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
  "phone": "+380674081630",
  "device_ref": "sandbox-23368"
}
```

```json
{
  "challenge_id": "d59efcab-3892-419e-875a-69bd93b2c950",
  "expires_at": "2026-10-30T22:22:30.581903285Z",
  "resend_available_at": "2026-10-30T22:17:31.581903285Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674081630` → **200**

```json
{
  "phone": "+380674081630",
  "audience": "CLIENT",
  "code": "755323",
  "sent_at": "2026-10-30T22:17:30.583775074Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d59efcab-3892-419e-875a-69bd93b2c950",
  "code": "755323",
  "device_ref": "sandbox-23368"
}
```

```json
{
  "session_id": "6c04abde-5944-4332-88c3-85f6a44ec32b",
  "subject": {
    "type": "CLIENT",
    "id": "9f3b7cb8-ef81-4492-846e-3683df3969ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjNiN2NiOC1lZjgxLTQ0OTItODQ2ZS0zNjgzZGYzOTY5Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTUwLCJpYXQiOjE3OTMzOTg2NTAsImp0aSI6ImNiNWVjZmM4LTliYzktNDU4YS1iYWJmLWYxYjg2OGFkM2JlZiIsInNpZCI6IjZjMDRhYmRlLTU5NDQtNDMzMi04OGMzLTg1ZjZhNDRlYzMyYiJ9.fXjB0HrJoUKUUpuZttQG0UqzU9zuuQIcXdLxYFrwkS8",
  "access_expires_at": "2026-10-30T22:32:30.835682068Z",
  "refresh_token": "Fj9z2UUh13CDMVmkV8MlEMp1Mmga2dE2acOCDDGV0fo",
  "refresh_expires_at": "2026-11-29T22:17:30.835317096Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9f3b7cb8-ef81-4492-846e-3683df3969ca",
  "session_id": "6c04abde-5944-4332-88c3-85f6a44ec32b",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fac6ba75-c739-46e2-a348-f08c89ff2c11",
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
  "id": "b47141e5-c8ba-475c-bdf9-f0ec7a0ac41a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:22:31.223988Z",
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
  "challenge_id": "de83185e-a0ad-47d1-a218-c357cc938ed0",
  "expires_at": "2026-10-30T22:22:33.422848394Z",
  "resend_available_at": "2026-10-30T22:17:34.422848394Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674081630` → **200**

```json
{
  "phone": "+380674081630",
  "audience": "CLIENT",
  "code": "681286",
  "sent_at": "2026-10-30T22:17:33.42465857Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "e569adc7-1eb9-42bf-bb7c-9a9702fa4f5c",
  "challenge_id": "de83185e-a0ad-47d1-a218-c357cc938ed0",
  "otp_code": "681286"
}
```

```json
{
  "client_id": "9f3b7cb8-ef81-4492-846e-3683df3969ca",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T22:17:33.644797548Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "77eb239a-2432-4e3a-87ed-68c47f7600c9",
  "quote_id": "b47141e5-c8ba-475c-bdf9-f0ec7a0ac41a",
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
  "correlation_id": "ee68fd00-5842-4b37-bcbd-edad08575969"
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
  "session_id": "a7265ba7-1081-4343-a566-93cb7ac5259e",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NTQsImlhdCI6MTc5MzM5ODY1NCwianRpIjoiMTM5ZmMxZmUtZmNhMy00ZGViLWFjNWQtNDkxM2I3Y2I1MTZmIiwic2lkIjoiYTcyNjViYTctMTA4MS00MzQzLWE1NjYtOTNjYjdhYzUyNTllIn0.ytd5Hop7Fz9KcwYQ6Jihydo-5nG4ebsajzHwZqhV07w",
  "access_expires_at": "2026-10-30T22:32:34.241187368Z",
  "refresh_token": "WC-nJsHAk0YCAh12HSI90ub_nP0a9goVFntppg03PAc",
  "refresh_expires_at": "2026-10-31T10:17:34.240781084Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9f3b7cb8-ef81-4492-846e-3683df3969ca",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T22:17:33.644798Z",
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

`POST /api/admin/v1/client-deletions/9f3b7cb8-ef81-4492-846e-3683df3969ca/complete` → **200**

```json
{
  "command_id": "0cf48156-91a6-48da-8907-6eb740ed7760",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9f3b7cb8-ef81-4492-846e-3683df3969ca",
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
  "correlation_id": "bee5fa7e-bb08-422c-b381-bfa46b845a02"
}
```

Done: client 9f3b7cb8-ef81-4492-846e-3683df3969ca anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664390161",
  "device_ref": "sandbox-24586"
}
```

```json
{
  "challenge_id": "db48ff09-7e3b-4b21-b190-2c12071277e5",
  "expires_at": "2026-10-30T22:22:35.058596526Z",
  "resend_available_at": "2026-10-30T22:17:36.058596526Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664390161` → **200**

```json
{
  "phone": "+380664390161",
  "audience": "CLIENT",
  "code": "424572",
  "sent_at": "2026-10-30T22:17:35.060625934Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db48ff09-7e3b-4b21-b190-2c12071277e5",
  "code": "424572",
  "device_ref": "sandbox-24586"
}
```

```json
{
  "session_id": "684f548f-1d4c-4c54-b286-b7686186bc8d",
  "subject": {
    "type": "CLIENT",
    "id": "b72d5876-e75b-44a1-980d-0b5cf08853eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzJkNTg3Ni1lNzViLTQ0YTEtOTgwZC0wYjVjZjA4ODUzZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTU1LCJpYXQiOjE3OTMzOTg2NTUsImp0aSI6ImQzN2QyYTQ5LTExNDMtNGU4Yy05MGNhLWQyN2U3YTA1ODY5YSIsInNpZCI6IjY4NGY1NDhmLTFkNGMtNGM1NC1iMjg2LWI3Njg2MTg2YmM4ZCJ9.HJcB3J4TXLxf8mz-8OpACejcLJwtE7CfN6w0ZZuC-to",
  "access_expires_at": "2026-10-30T22:32:35.276403888Z",
  "refresh_token": "4YZmkQ7SB3OwuUV8o0ITrEDXPYTU-Wjc0k7CR09Nuck",
  "refresh_expires_at": "2026-11-29T22:17:35.276001284Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b72d5876-e75b-44a1-980d-0b5cf08853eb",
  "session_id": "684f548f-1d4c-4c54-b286-b7686186bc8d",
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
  "session_id": "ef825ce9-8404-4b96-ad23-5041a98747f0",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NTUsImlhdCI6MTc5MzM5ODY1NSwianRpIjoiYzhkZWMyOTMtOWMxNC00MTk4LTljNTktNDBmZDg5Yjg2MTQzIiwic2lkIjoiZWY4MjVjZTktODQwNC00Yjk2LWFkMjMtNTA0MWE5ODc0N2YwIn0.VIwdf2b-l53FpJK646TJH020Y2uIOaG0P7HtQ9NWFsU",
  "access_expires_at": "2026-10-30T22:32:35.844607316Z",
  "refresh_token": "dtCBtDFYN3mllrjNDk4-Y2nRygCGO8Y--X3lXJCiJvw",
  "refresh_expires_at": "2026-10-31T10:17:35.844164176Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4390161&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "b72d5876-e75b-44a1-980d-0b5cf08853eb",
      "phone": "+380664390161",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T22:17:35.274728Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/b72d5876-e75b-44a1-980d-0b5cf08853eb` → **200**

```json
{
  "client": {
    "id": "b72d5876-e75b-44a1-980d-0b5cf08853eb",
    "phone": "+380664390161",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:17:35.274728Z",
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

`POST /api/admin/v1/clients/b72d5876-e75b-44a1-980d-0b5cf08853eb/block` → **400**

```json
{
  "command_id": "788b04ba-f6e2-4f38-a6be-d3f6338020e1",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b72d5876-e75b-44a1-980d-0b5cf08853eb/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f866b713-bc10-4fa6-a7c1-6489b1da2b0b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/b72d5876-e75b-44a1-980d-0b5cf08853eb/block` → **200**

```json
{
  "command_id": "dd081ba1-94b4-40bf-8453-c17f11bacc36",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "b72d5876-e75b-44a1-980d-0b5cf08853eb",
  "phone": "+380664390161",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T22:17:35.274728Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T22:17:36.645978Z",
    "by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
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
  "correlation_id": "7356e3aa-8cf0-4591-b0a9-20c37c66bd84"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664390161",
  "device_ref": "sandbox-4340"
}
```

```json
{
  "challenge_id": "acbdc7a3-1e8b-4251-863f-61db110cce98",
  "expires_at": "2026-10-30T22:22:39.02596341Z",
  "resend_available_at": "2026-10-30T22:17:40.02596341Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664390161` → **200**

```json
{
  "phone": "+380664390161",
  "audience": "CLIENT",
  "code": "370863",
  "sent_at": "2026-10-30T22:17:39.027735489Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "acbdc7a3-1e8b-4251-863f-61db110cce98",
  "code": "370863",
  "device_ref": "sandbox-4340"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "7d75b4dd-4cf0-492d-86a3-310ba5f2df86"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/b72d5876-e75b-44a1-980d-0b5cf08853eb` → **200**

```json
{
  "client": {
    "id": "b72d5876-e75b-44a1-980d-0b5cf08853eb",
    "phone": "+380664390161",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T22:17:35.274728Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T22:17:36.645978Z",
      "by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
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

`POST /api/admin/v1/clients/b72d5876-e75b-44a1-980d-0b5cf08853eb/unblock` → **200**

```json
{
  "command_id": "bea5f53f-175c-4f37-88d6-db0960eeb4ff",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "b72d5876-e75b-44a1-980d-0b5cf08853eb",
  "phone": "+380664390161",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T22:17:35.274728Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664390161",
  "device_ref": "sandbox-3228"
}
```

```json
{
  "challenge_id": "437fef16-4363-4f45-bf5c-23ef49dbc99d",
  "expires_at": "2026-10-30T22:22:41.855855471Z",
  "resend_available_at": "2026-10-30T22:17:42.855855471Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664390161` → **200**

```json
{
  "phone": "+380664390161",
  "audience": "CLIENT",
  "code": "916544",
  "sent_at": "2026-10-30T22:17:41.857730806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "437fef16-4363-4f45-bf5c-23ef49dbc99d",
  "code": "916544",
  "device_ref": "sandbox-3228"
}
```

```json
{
  "session_id": "9efa5489-01d0-4c93-950e-3e4f8f9631de",
  "subject": {
    "type": "CLIENT",
    "id": "b72d5876-e75b-44a1-980d-0b5cf08853eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzJkNTg3Ni1lNzViLTQ0YTEtOTgwZC0wYjVjZjA4ODUzZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTYyLCJpYXQiOjE3OTMzOTg2NjIsImp0aSI6IjRkZGY5MzgzLTFkOGQtNDYwNi05N2ViLTY5YjZlMTdhZGM1YSIsInNpZCI6IjllZmE1NDg5LTAxZDAtNGM5My05NTBlLTNlNGY4Zjk2MzFkZSJ9.FIiVxouu-XeTqYDuLzXb5WFKYYKwyyZR_YcskD3YqXA",
  "access_expires_at": "2026-10-30T22:32:42.068089637Z",
  "refresh_token": "8MT8_ii4DJmyfSXZX6BBwPV311SNrbDcz4lVzE-zAvs",
  "refresh_expires_at": "2026-11-29T22:17:42.06774083Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b72d5876-e75b-44a1-980d-0b5cf08853eb",
  "session_id": "9efa5489-01d0-4c93-950e-3e4f8f9631de",
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
  "phone": "+380665034283",
  "device_ref": "sandbox-13993"
}
```

```json
{
  "challenge_id": "b25dfd73-dae1-4329-9abf-6fc43c191cf6",
  "expires_at": "2026-10-30T22:22:42.457788849Z",
  "resend_available_at": "2026-10-30T22:17:43.457788849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665034283` → **200**

```json
{
  "phone": "+380665034283",
  "audience": "CLIENT",
  "code": "267661",
  "sent_at": "2026-10-30T22:17:42.459720674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b25dfd73-dae1-4329-9abf-6fc43c191cf6",
  "code": "267661",
  "device_ref": "sandbox-13993"
}
```

```json
{
  "session_id": "eb14e18e-04ba-4b23-b501-eb61c66e5e8d",
  "subject": {
    "type": "CLIENT",
    "id": "6973d39c-75a7-4e6d-a020-08dc119755e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTczZDM5Yy03NWE3LTRlNmQtYTAyMC0wOGRjMTE5NzU1ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTYyLCJpYXQiOjE3OTMzOTg2NjIsImp0aSI6IjQwYTg5M2EwLTFiNzAtNDBkZi04ZTM2LWYzZWVjZjA1MzIxZSIsInNpZCI6ImViMTRlMThlLTA0YmEtNGIyMy1iNTAxLWViNjFjNjZlNWU4ZCJ9.W2Wa_vbOXQvDez9mt7WgtzgYDJf7Hm-1xFd0RlGYemY",
  "access_expires_at": "2026-10-30T22:32:42.666202465Z",
  "refresh_token": "rG_-fKl3d2MsWMCriSTudGhjo_FT7JvZGYMWMJPWuzg",
  "refresh_expires_at": "2026-11-29T22:17:42.665792676Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ac2ea720-5fde-422d-a2f4-9f9747359b85",
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
  "id": "7becf578-d4f4-4f6a-b960-4083933bac45",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:22:42.852620Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 0f5723fe-fe00-4e34-8516-e1f40660cac9) → **201**

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
  "session_id": "4279245c-bcfa-4362-8a8b-46fef4333335",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NjMsImlhdCI6MTc5MzM5ODY2MywianRpIjoiZjZkMzIyYjctNWIxNy00ODAwLTg3OGYtZDQwYjY0OTQ2OGIyIiwic2lkIjoiNDI3OTI0NWMtYmNmYS00MzYyLThhOGItNDZmZWY0MzMzMzM1In0.YdGH1HmR5AArMt1O7SgEbeDppsRIw-AgVqEcZxLr6BQ",
  "access_expires_at": "2026-10-30T22:32:43.295667198Z",
  "refresh_token": "YlhuX-34E2OSm24fV6z-agK5xSV22W7JKksX3YBMK2c",
  "refresh_expires_at": "2026-10-31T10:17:43.295326162Z",
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
  "session_id": "af4af2af-a326-44fe-9903-025e8f66a250",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NjMsImlhdCI6MTc5MzM5ODY2MywianRpIjoiZGU0ZjYzNDgtZGNmMC00Zjk4LTgzZjQtMWQwMjUyMTZmZWFiIiwic2lkIjoiYWY0YWYyYWYtYTMyNi00NGZlLTk5MDMtMDI1ZThmNjZhMjUwIn0.l_AuFRveXtSqvC9hU_jBTcoNbYIVn37_xu4JbIVcic0",
  "access_expires_at": "2026-10-30T22:32:43.672018683Z",
  "refresh_token": "UrS6wEcHAMqWJd8-2BWD52Ds5Sqv8ezK7p3TxeicKLA",
  "refresh_expires_at": "2026-10-31T10:17:43.671683026Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c8930340-aa79-4bcd-aee4-3bd4e20dcbf6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:17:43.044769Z",
      "actor": {
        "type": "CLIENT",
        "id": "6973d39c-75a7-4e6d-a020-08dc119755e8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
        "quote_id": "7becf578-d4f4-4f6a-b960-4083933bac45",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0f5723fe-fe00-4e34-8516-e1f40660cac9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:17:43.046025Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
        "attempt_id": "05fc73dd-e147-4560-96da-ba3c95cdc07f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0f5723fe-fe00-4e34-8516-e1f40660cac9"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T22:17:43.076235Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
        "attempt_id": "05fc73dd-e147-4560-96da-ba3c95cdc07f"
      },
      "correlation_id": "0f5723fe-fe00-4e34-8516-e1f40660cac9"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "05fc73dd-e147-4560-96da-ba3c95cdc07f",
        "generation": 1,
        "started_at": "2026-10-30T22:17:43.045259Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T22:17:43.076235Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T22:17:43.046489Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/0f5723fe-fe00-4e34-8516-e1f40660cac9` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6:0",
      "order_id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
      "at": "2026-10-30T22:17:43.044769Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6:1",
      "order_id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
      "at": "2026-10-30T22:17:43.046025Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6:2",
      "order_id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
      "at": "2026-10-30T22:17:43.076235Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/85be6194-008a-45c5-8fe2-b56a13a91987` → **200**

```json
{
  "found": []
}
```

Done: request 0f5723fe-fe00-4e34-8516-e1f40660cac9 — order c8930340-aa79-4bcd-aee4-3bd4e20dcbf6 found by its id.

`GET /api/rider/v1/orders/c8930340-aa79-4bcd-aee4-3bd4e20dcbf6` → **200**

```json
{
  "id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6973d39c-75a7-4e6d-a020-08dc119755e8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:17:43.044442Z",
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

`POST /api/rider/v1/orders/c8930340-aa79-4bcd-aee4-3bd4e20dcbf6/cancel` → **200**

```json
{
  "command_id": "67acf03c-28eb-480b-8ca6-7a654ec5b426",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c8930340-aa79-4bcd-aee4-3bd4e20dcbf6",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6973d39c-75a7-4e6d-a020-08dc119755e8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:17:43.044442Z",
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
  "phone": "+380634046977",
  "device_ref": "sandbox-20426"
}
```

```json
{
  "challenge_id": "f495f389-8e19-47fb-96af-d373addd75c2",
  "expires_at": "2026-10-30T22:22:44.839313706Z",
  "resend_available_at": "2026-10-30T22:17:45.839313706Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634046977` → **200**

```json
{
  "phone": "+380634046977",
  "audience": "CLIENT",
  "code": "944823",
  "sent_at": "2026-10-30T22:17:44.841407092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f495f389-8e19-47fb-96af-d373addd75c2",
  "code": "944823",
  "device_ref": "sandbox-20426"
}
```

```json
{
  "session_id": "1eadb486-c2ce-499f-935a-c184b5a26a33",
  "subject": {
    "type": "CLIENT",
    "id": "bc00fff7-b6d2-456b-9c56-dd6194103c71"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzAwZmZmNy1iNmQyLTQ1NmItOWM1Ni1kZDYxOTQxMDNjNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTY1LCJpYXQiOjE3OTMzOTg2NjUsImp0aSI6IjIzZTNmOTMyLTQxMWItNGY4Ni1hNmY2LTdhMzE4YzY3NGQzZiIsInNpZCI6IjFlYWRiNDg2LWMyY2UtNDk5Zi05MzVhLWMxODRiNWEyNmEzMyJ9.0J1WCPekk3-Dp0ofBHPRNLwUlfCmgGWTOA_-kz3c32c",
  "access_expires_at": "2026-10-30T22:32:45.056687807Z",
  "refresh_token": "oNatCJQW_cHexqoGnY7G7NA_nZy1qMa9NZr4p6QP9vk",
  "refresh_expires_at": "2026-11-29T22:17:45.05623295Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ff7197ed-f497-4545-9adb-d8682b7b6e3f",
  "expires_at": "2026-10-30T22:22:47.257152218Z",
  "resend_available_at": "2026-10-30T22:17:48.257152218Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634046977` → **200**

```json
{
  "phone": "+380634046977",
  "audience": "CLIENT",
  "code": "645422",
  "sent_at": "2026-10-30T22:17:47.258831867Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "0eadae06-f193-4781-b42a-aa0476b6879c",
  "challenge_id": "ff7197ed-f497-4545-9adb-d8682b7b6e3f",
  "otp_code": "645422"
}
```

```json
{
  "id": "e32577e9-f43c-4856-885f-8146cc52cbfd",
  "state": "PENDING",
  "created_at": "2026-10-30T22:17:47.514074Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/e32577e9-f43c-4856-885f-8146cc52cbfd` → **200**

```json
{
  "id": "e32577e9-f43c-4856-885f-8146cc52cbfd",
  "state": "PENDING",
  "created_at": "2026-10-30T22:17:47.514074Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e32577e9-f43c-4856-885f-8146cc52cbfd` → **200**

```json
{
  "id": "e32577e9-f43c-4856-885f-8146cc52cbfd",
  "state": "PENDING",
  "created_at": "2026-10-30T22:17:47.514074Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e32577e9-f43c-4856-885f-8146cc52cbfd` → **200**

```json
{
  "id": "e32577e9-f43c-4856-885f-8146cc52cbfd",
  "state": "READY",
  "created_at": "2026-10-30T22:17:47.514074Z",
  "ready_at": "2026-10-30T22:17:49.739888Z",
  "expires_at": "2026-11-06T22:17:49.739888Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/e32577e9-f43c-4856-885f-8146cc52cbfd/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639440749",
  "device_ref": "sandbox-28915"
}
```

```json
{
  "challenge_id": "8c711798-d3ef-4171-b89b-82f1d578f4b0",
  "expires_at": "2026-10-30T22:22:50.343898019Z",
  "resend_available_at": "2026-10-30T22:17:51.343898019Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639440749` → **200**

```json
{
  "phone": "+380639440749",
  "audience": "CLIENT",
  "code": "478871",
  "sent_at": "2026-10-30T22:17:50.34569797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c711798-d3ef-4171-b89b-82f1d578f4b0",
  "code": "478871",
  "device_ref": "sandbox-28915"
}
```

```json
{
  "session_id": "2ab187ea-ad9a-4442-afbd-42eed21fcaa0",
  "subject": {
    "type": "CLIENT",
    "id": "dd7c4cbd-de70-400f-bda6-c7b8c6a29452"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZDdjNGNiZC1kZTcwLTQwMGYtYmRhNi1jN2I4YzZhMjk0NTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTcwLCJpYXQiOjE3OTMzOTg2NzAsImp0aSI6ImIzNGY5ZjI4LTgzMjYtNGNlMS1hYWQ1LTQ4ODE2NzE4YjAwYSIsInNpZCI6IjJhYjE4N2VhLWFkOWEtNDQ0Mi1hZmJkLTQyZWVkMjFmY2FhMCJ9._EipRT3noMUH8JK8XLIkgN-2BI66wmb-6FLcpLY54Uk",
  "access_expires_at": "2026-10-30T22:32:50.55800295Z",
  "refresh_token": "a6tkTbB6kQAa0AAuYfCd9UvVPumbVtbKGVbrkhxRUzM",
  "refresh_expires_at": "2026-11-29T22:17:50.557628645Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/e32577e9-f43c-4856-885f-8146cc52cbfd/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/e32577e9-f43c-4856-885f-8146cc52cbfd/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "becce2e7-356e-4755-8e24-8679fed2453a"
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
  "session_id": "773e9382-152a-44b1-8c73-bb0c9322e798",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NzEsImlhdCI6MTc5MzM5ODY3MSwianRpIjoiODkzYWJmY2EtZWRhOS00MmVlLWEyYzItMTg0MmYxZDFlODMyIiwic2lkIjoiNzczZTkzODItMTUyYS00NGIxLThjNzMtYmIwYzkzMjJlNzk4In0.umrzjDOvSFQRiTp0G_VT_fMi8o8WFT2rTgWHuJILlVY",
  "access_expires_at": "2026-10-30T22:32:51.142853869Z",
  "refresh_token": "xXg11ymXxtXZHf6ASZnZQIAyM2xx7gc6s7Sodt62ISg",
  "refresh_expires_at": "2026-10-31T10:17:51.142433123Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bc00fff7-b6d2-456b-9c56-dd6194103c71",
  "session_id": "1eadb486-c2ce-499f-935a-c184b5a26a33",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/bc00fff7-b6d2-456b-9c56-dd6194103c71/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "e32577e9-f43c-4856-885f-8146cc52cbfd",
      "state": "READY",
      "created_at": "2026-10-30T22:17:47.514074Z",
      "ready_at": "2026-10-30T22:17:49.739888Z",
      "expires_at": "2026-11-06T22:17:49.739888Z",
      "size_bytes": 1029
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
  "device_ref": "sandbox-30681"
}
```

```json
{
  "challenge_id": "5137c6e7-e2ed-440e-8e55-ea10d1dd103a",
  "expires_at": "2026-10-30T22:22:51.705208447Z",
  "resend_available_at": "2026-10-30T22:17:52.705208447Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "693285",
  "sent_at": "2026-10-30T22:17:51.707982745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5137c6e7-e2ed-440e-8e55-ea10d1dd103a",
  "code": "693285",
  "device_ref": "sandbox-30681"
}
```

```json
{
  "session_id": "ab9357f4-6c94-4eb2-af3e-e9296deba7c6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTU3MSwiaWF0IjoxNzkzMzk4NjcxLCJqdGkiOiI5NDRjOTZhMS02NjYzLTQ2OTctYjcwYi04YzIzMTc0N2NmMGMiLCJzaWQiOiJhYjkzNTdmNC02Yzk0LTRlYjItYWYzZS1lOTI5NmRlYmE3YzYifQ.eFMB925Xy_3X_OVGbJaVZNNOxZ1yDoKLgPwVnoBuR4g",
  "access_expires_at": "2026-10-30T22:32:51.918745064Z",
  "refresh_token": "1UIOg7ACO9Tmp5tvkVQ1QSjIpDh_VRbxz98VAGni8Rs",
  "refresh_expires_at": "2026-11-29T22:17:51.918372541Z",
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
  "device_ref": "sandbox-28784"
}
```

```json
{
  "challenge_id": "b1c62462-9bef-4d84-a94e-dc30fda47c84",
  "expires_at": "2026-10-30T22:22:52.288436068Z",
  "resend_available_at": "2026-10-30T22:17:53.288436068Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "419055",
  "sent_at": "2026-10-30T22:17:52.291118872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1c62462-9bef-4d84-a94e-dc30fda47c84",
  "code": "419055",
  "device_ref": "sandbox-28784"
}
```

```json
{
  "session_id": "c632b53a-c73e-4054-8441-b7e575e82d8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTU3MiwiaWF0IjoxNzkzMzk4NjcyLCJqdGkiOiI3OTIzMGE3NS04NWRhLTRmYjEtOTlmYy1hMjU2NjFkMmE5OWEiLCJzaWQiOiJjNjMyYjUzYS1jNzNlLTQwNTQtODQ0MS1iN2U1NzVlODJkOGQifQ.tBLfby0Hmc34meS70PplRiQ4e_gPQT__JNcIBnCbMCo",
  "access_expires_at": "2026-10-30T22:32:52.508782447Z",
  "refresh_token": "4AGj4vBURmi9QT2UKbrrafbYaN8Tvz0mmXaXXYfK-1w",
  "refresh_expires_at": "2026-11-29T22:17:52.508358376Z",
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
  "command_id": "1baced82-5453-4a6b-9fa2-d257e63b6ad3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:17:52Z",
    "sequence": 1793398672904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c6e5c6e-2b99-4529-b1b6-f3f2663fd414",
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
  "last_heartbeat_at": "2026-10-30T22:17:52.919878Z",
  "last_location_at": "2026-10-30T22:17:52.919878Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10533"
}
```

```json
{
  "challenge_id": "91758282-d32b-4e6f-bfc4-6cdfa61c6f1d",
  "expires_at": "2026-10-30T22:22:53.11723694Z",
  "resend_available_at": "2026-10-30T22:17:54.11723694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "444651",
  "sent_at": "2026-10-30T22:17:53.119743548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91758282-d32b-4e6f-bfc4-6cdfa61c6f1d",
  "code": "444651",
  "device_ref": "sandbox-10533"
}
```

```json
{
  "session_id": "688e1ec2-4f8d-44ac-95c4-82e264319a0a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTU3MywiaWF0IjoxNzkzMzk4NjczLCJqdGkiOiIzZWE2NWE3OC1iZGFhLTQxNWYtYjM5ZS1kMDUxYThjZmQ0YjYiLCJzaWQiOiI2ODhlMWVjMi00ZjhkLTQ0YWMtOTVjNC04MmUyNjQzMTlhMGEifQ.yfGKrWEetIC3fLO0SFTMm2Y58c_inFFhkH2bHMrnNKo",
  "access_expires_at": "2026-10-30T22:32:53.349389469Z",
  "refresh_token": "95pAR80ZUzeuc6bYC1wmoqKNn2U55qveda6wuRC8AUE",
  "refresh_expires_at": "2026-11-29T22:17:53.348968452Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab26b25c-b088-4221-bcc4-a53d6c34416e",
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
  "last_heartbeat_at": "2026-10-30T22:14:10.817483Z",
  "last_location_at": "2026-10-30T22:14:10.817483Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ab26b25c-b088-4221-bcc4-a53d6c34416e/handover` → **200**

```json
{
  "command_id": "ab7bf0db-5ccd-4af4-959c-10ce02e4aff0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab26b25c-b088-4221-bcc4-a53d6c34416e",
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
  "last_heartbeat_at": "2026-10-30T22:14:10.817483Z",
  "last_location_at": "2026-10-30T22:14:10.817483Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ab26b25c-b088-4221-bcc4-a53d6c34416e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:17:53Z",
    "sequence": 1793398673934
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab26b25c-b088-4221-bcc4-a53d6c34416e",
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
  "last_heartbeat_at": "2026-10-30T22:17:53.957209Z",
  "last_location_at": "2026-10-30T22:17:53.957209Z",
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
  "session_id": "277dcd67-9169-4a0a-b4d8-488b779313a0",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NzQsImlhdCI6MTc5MzM5ODY3NCwianRpIjoiY2FmNDcyYzktMzA3OS00NzYyLTk3ZWItMDBmMWM4ZTQxNWU5Iiwic2lkIjoiMjc3ZGNkNjctOTE2OS00YTBhLWI0ZDgtNDg4Yjc3OTMxM2EwIn0.pTka9kS2F2cvyefyXy0Q89y8vEZz2IFP2z9AXPlvVZc",
  "access_expires_at": "2026-10-30T22:32:54.334795963Z",
  "refresh_token": "5a2FZqliIWupWnCmfG5RIiQAtuoDdMpCs8pyLEaxweo",
  "refresh_expires_at": "2026-10-31T10:17:54.334447576Z",
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
  "session_id": "c6dffabd-012b-42cb-ade3-5a8c2e31284c",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NzQsImlhdCI6MTc5MzM5ODY3NCwianRpIjoiY2VlNDY4MTAtMDIyMy00NTNjLTgxOGItM2Y2ZTBmYTE3NmZiIiwic2lkIjoiYzZkZmZhYmQtMDEyYi00MmNiLWFkZTMtNWE4YzJlMzEyODRjIn0.HAMF3mc4PazYRHU2iogymPZ-oJEXyf-iVTfmBJP0zfA",
  "access_expires_at": "2026-10-30T22:32:54.72300549Z",
  "refresh_token": "Lg6DK9q1AmG6c1nxh-iNzonGLSDyYnoY6Jebueyf1ng",
  "refresh_expires_at": "2026-10-31T10:17:54.72259504Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682462603",
  "device_ref": "sandbox-23003"
}
```

```json
{
  "challenge_id": "6934d663-67e8-4ef7-adbb-2abedea8c253",
  "expires_at": "2026-10-30T22:22:54.914746828Z",
  "resend_available_at": "2026-10-30T22:17:55.914746828Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682462603` → **200**

```json
{
  "phone": "+380682462603",
  "audience": "CLIENT",
  "code": "460427",
  "sent_at": "2026-10-30T22:17:54.916671805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6934d663-67e8-4ef7-adbb-2abedea8c253",
  "code": "460427",
  "device_ref": "sandbox-23003"
}
```

```json
{
  "session_id": "2a12846b-2dfe-46ad-a8cc-5b943f79861a",
  "subject": {
    "type": "CLIENT",
    "id": "46c99a66-0192-4cff-9787-b1120263be25"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NmM5OWE2Ni0wMTkyLTRjZmYtOTc4Ny1iMTEyMDI2M2JlMjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NTc1LCJpYXQiOjE3OTMzOTg2NzUsImp0aSI6ImY1ZmE3YTMwLWRkNWYtNGZkYi1iNmU5LTVkOTYwYWNkNzZkMyIsInNpZCI6IjJhMTI4NDZiLTJkZmUtNDZhZC1hOGNjLTViOTQzZjc5ODYxYSJ9.YcfxZpQzON9MkFrWpeYBPQzFUadiihFbtbP1u9OIIq4",
  "access_expires_at": "2026-10-30T22:32:55.132758216Z",
  "refresh_token": "lEyTEQ7qcQEOBzV-9t_iE2jjb3K9V02Ay8mUtWm3M2o",
  "refresh_expires_at": "2026-11-29T22:17:55.132023466Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "41d2cf74-2874-4326-90bd-cc5128f1b36d",
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
  "id": "7e64b113-a1ed-4eb2-b57f-e6a00af68ad0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:22:55.324355Z",
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
  "command_id": "9d0cbd90-c216-409b-ad7c-1299606f82d8",
  "quote_id": "7e64b113-a1ed-4eb2-b57f-e6a00af68ad0",
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
  "id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "46c99a66-0192-4cff-9787-b1120263be25",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:17:55.524353Z",
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
    "id": "75705b97-228d-485d-8aa7-c60a3a90bb20",
    "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
    "expires_at": "2026-10-30T22:18:10.526678Z",
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

`POST /api/driver/v1/offers/75705b97-228d-485d-8aa7-c60a3a90bb20/reject` → **204**

```json
{
  "command_id": "fc82c8f8-fce8-4fae-9442-5ef49ed98776"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "14b3857d-0b19-4c90-bd56-5f7d15800dfa",
    "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
    "expires_at": "2026-10-30T22:18:10.933098Z",
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

`POST /api/driver/v1/offers/14b3857d-0b19-4c90-bd56-5f7d15800dfa/accept` → **200**

```json
{
  "command_id": "e475bab1-f446-4bb0-84b4-87b80ab3e416"
}
```

```json
{
  "id": "81e04df1-a253-467a-8735-a785a328939b",
  "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "963898fe-e3f8-496c-a74f-c96f20e5e7df",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c7063e51-69fe-4e9e-ac7b-9bb95a394063/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:17:55.524732Z",
      "actor": {
        "type": "CLIENT",
        "id": "46c99a66-0192-4cff-9787-b1120263be25",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
        "quote_id": "7e64b113-a1ed-4eb2-b57f-e6a00af68ad0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c05e4a43-042f-4e27-a7fe-217ac33158bf"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:17:55.52615Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
        "attempt_id": "6ac050b6-a6ab-4aa3-879d-7a45a7dc9d2f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c05e4a43-042f-4e27-a7fe-217ac33158bf"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:17:55.544729Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "75705b97-228d-485d-8aa7-c60a3a90bb20",
        "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-30T22:18:10.526677676Z"
      },
      "correlation_id": "c05e4a43-042f-4e27-a7fe-217ac33158bf"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T22:17:55.932358Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "75705b97-228d-485d-8aa7-c60a3a90bb20",
        "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063"
      },
      "correlation_id": "9e5d6583-6598-4532-90f4-f648c395ef41"
    },
    {
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c7063e51-69fe-4e9e-ac7b-9bb95a394063 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c7063e51-69fe-4e9e-ac7b-9bb95a394063` → **200**

```json
{
  "id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "46c99a66-0192-4cff-9787-b1120263be25",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "81e04df1-a253-467a-8735-a785a328939b",
    "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "963898fe-e3f8-496c-a74f-c96f20e5e7df",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:17:55.524353Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c7063e51-69fe-4e9e-ac7b-9bb95a394063/cancel` → **200**

```json
{
  "command_id": "72fc026c-12e9-4363-bc67-b9cd8b835c36",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "46c99a66-0192-4cff-9787-b1120263be25",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "81e04df1-a253-467a-8735-a785a328939b",
    "order_id": "c7063e51-69fe-4e9e-ac7b-9bb95a394063",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "963898fe-e3f8-496c-a74f-c96f20e5e7df",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:17:55.524353Z",
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
  "session_id": "2c6e5c6e-2b99-4529-b1b6-f3f2663fd414",
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
  "last_heartbeat_at": "2026-10-30T22:17:52.919878Z",
  "last_location_at": "2026-10-30T22:17:52.919878Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c6e5c6e-2b99-4529-b1b6-f3f2663fd414/close` → **200**

```json
{
  "command_id": "d3a28e63-7ba6-4572-9536-98abacb4fe5d",
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
  "session_id": "ab26b25c-b088-4221-bcc4-a53d6c34416e",
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
  "last_heartbeat_at": "2026-10-30T22:17:53.957209Z",
  "last_location_at": "2026-10-30T22:17:53.957209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab26b25c-b088-4221-bcc4-a53d6c34416e/close` → **200**

```json
{
  "command_id": "9920daca-0704-4cc3-a913-ec345fd5dcca",
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
  "device_ref": "sandbox-13016"
}
```

```json
{
  "challenge_id": "aae4903e-0f75-44f9-a5d6-c70ebda41aba",
  "expires_at": "2026-10-30T22:22:57.774585199Z",
  "resend_available_at": "2026-10-30T22:17:58.774585199Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "444625",
  "sent_at": "2026-10-30T22:17:57.776779397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aae4903e-0f75-44f9-a5d6-c70ebda41aba",
  "code": "444625",
  "device_ref": "sandbox-13016"
}
```

```json
{
  "session_id": "430ceb76-742e-40f5-8f64-a87eb32742ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTU3NywiaWF0IjoxNzkzMzk4Njc3LCJqdGkiOiIxZWI5YzRlMS1iYjMwLTRjMWQtOWFjYy1hMDM2ZTU4Yzg2MDEiLCJzaWQiOiI0MzBjZWI3Ni03NDJlLTQwZjUtOGY2NC1hODdlYjMyNzQyZWYifQ.RB5Ttv3MUuRSrnJ5IICK-ENHl3oJS-jlxdAKhrKESag",
  "access_expires_at": "2026-10-30T22:32:57.983187606Z",
  "refresh_token": "cOuwd1VcrJaaZY7pKR0dHZZpkWj_zdvWFJ01YcPFc3A",
  "refresh_expires_at": "2026-11-29T22:17:57.982759761Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "5a0d5043-37d5-43b7-b456-20b7eac6bdef",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "62a61e53-51f3-4694-a3a6-29580042b7dc",
  "upload_path": "/api/driver/v1/uploads/62a61e53-51f3-4694-a3a6-29580042b7dc",
  "expires_at": "2026-10-30T22:32:58.168778993Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/62a61e53-51f3-4694-a3a6-29580042b7dc` → **200**

```json
{
  "file_id": "62a61e53-51f3-4694-a3a6-29580042b7dc",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/62a61e53-51f3-4694-a3a6-29580042b7dc`, first bytes `425a4631b4c55389` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/62a61e53-51f3-4694-a3a6-29580042b7dc` → **200**

SHA-256 uploaded `f1a75fe609d881cab559dd6e5dcb74eebf2b46c910dbde82e698ae01facb2aae`, downloaded `f1a75fe609d881cab559dd6e5dcb74eebf2b46c910dbde82e698ae01facb2aae`.

Done: document 62a61e53-51f3-4694-a3a6-29580042b7dc is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25900"
}
```

```json
{
  "challenge_id": "bf287267-6d09-4353-aaa6-579d0f20dbc0",
  "expires_at": "2026-10-30T22:22:58.426347093Z",
  "resend_available_at": "2026-10-30T22:17:59.426347093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "842025",
  "sent_at": "2026-10-30T22:17:58.428152198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf287267-6d09-4353-aaa6-579d0f20dbc0",
  "code": "842025",
  "device_ref": "sandbox-25900"
}
```

```json
{
  "session_id": "4d3cfde6-7632-4712-8da2-e9501c985b32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTU3OCwiaWF0IjoxNzkzMzk4Njc4LCJqdGkiOiJjMWQ4NGZjYy03YTRmLTRlOTAtYjA4ZS1iMzZlM2QxYjgyNmIiLCJzaWQiOiI0ZDNjZmRlNi03NjMyLTQ3MTItOGRhMi1lOTUwMWM5ODViMzIifQ.zAfRtuy-12xi_4WdsFqBKg2iX6z-HZKVWvthGpoxZ9U",
  "access_expires_at": "2026-10-30T22:32:58.637517597Z",
  "refresh_token": "7n8j_wH-rbIrD2hGGb1PKBRH0WZNpTByfp7c7JIubes",
  "refresh_expires_at": "2026-11-29T22:17:58.637130948Z",
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
  "device_ref": "sandbox-12590"
}
```

```json
{
  "challenge_id": "31cebe1d-e2a5-430c-8470-cb43ee993314",
  "expires_at": "2026-10-30T22:22:59.005722452Z",
  "resend_available_at": "2026-10-30T22:18:00.005722452Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "033142",
  "sent_at": "2026-10-30T22:17:59.00763606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31cebe1d-e2a5-430c-8470-cb43ee993314",
  "code": "033142",
  "device_ref": "sandbox-12590"
}
```

```json
{
  "session_id": "e85a9b89-819d-4e13-bd26-1b6d0a6e2e2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTU3OSwiaWF0IjoxNzkzMzk4Njc5LCJqdGkiOiJlNzg2NzExYS05YmZlLTRjZTEtYWM4YS1mYmQxYTcwZDZjNjgiLCJzaWQiOiJlODVhOWI4OS04MTlkLTRlMTMtYmQyNi0xYjZkMGE2ZTJlMmYifQ.sop7SqUCOAqFmyH6dwnUe6JG-ErpE8QiGgje6Rkdy_E",
  "access_expires_at": "2026-10-30T22:32:59.214844732Z",
  "refresh_token": "Z_eeC8J6xhivDNELC8FJ2GYJe-h4jAfue8f_HPHW3zg",
  "refresh_expires_at": "2026-11-29T22:17:59.214510588Z",
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
  "session_id": "8b950165-09df-454a-b5df-6412911da268",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1NzksImlhdCI6MTc5MzM5ODY3OSwianRpIjoiNjI0MDM5N2YtOGZjMi00MmUyLTg0ZmYtZmYwNDMxMjkyMGZhIiwic2lkIjoiOGI5NTAxNjUtMDlkZi00NTRhLWI1ZGYtNjQxMjkxMWRhMjY4In0.Qf2o_tqNWCwwmbJqyRgcmE9cDKMYFaFHFwVonG3oR8g",
  "access_expires_at": "2026-10-30T22:32:59.764340072Z",
  "refresh_token": "RnpW1CySS1nK8N6wnNq6IldKvrCIu4DX_OjLmor_hW4",
  "refresh_expires_at": "2026-10-31T10:17:59.763972963Z",
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
  "session_id": "266f5159-000a-44d3-bcc4-5f9c5ef96116",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk1ODAsImlhdCI6MTc5MzM5ODY4MCwianRpIjoiYjAwMGVlMWUtM2ZlMC00N2ZhLWIwMGUtZjM2NTA2N2FjNDc4Iiwic2lkIjoiMjY2ZjUxNTktMDAwYS00NGQzLWJjYzQtNWY5YzVlZjk2MTE2In0.UfiIss1NmQ0wOPVMg7deZzNIQY_6q2BjDjVPuKGydjk",
  "access_expires_at": "2026-10-30T22:33:00.157420971Z",
  "refresh_token": "EILHRrbHX1vhR3TcJB28M1bQyn4YDxE6YAZB2Hi9-KA",
  "refresh_expires_at": "2026-10-31T10:18:00.15706258Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2251"
}
```

```json
{
  "challenge_id": "29bd0264-e7a7-4f6a-b277-03ec91103ba7",
  "expires_at": "2026-10-30T22:23:00.337689332Z",
  "resend_available_at": "2026-10-30T22:18:01.337689332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "602524",
  "sent_at": "2026-10-30T22:18:00.339673759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29bd0264-e7a7-4f6a-b277-03ec91103ba7",
  "code": "602524",
  "device_ref": "sandbox-2251"
}
```

```json
{
  "session_id": "8d062feb-a76e-48d5-88b8-72bec414ac7b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTU4MCwiaWF0IjoxNzkzMzk4NjgwLCJqdGkiOiIwMTA3Mzk2MC00ZGZiLTRjNDUtOGU0MS0yYjUxZWUwZjViYWUiLCJzaWQiOiI4ZDA2MmZlYi1hNzZlLTQ4ZDUtODhiOC03MmJlYzQxNGFjN2IifQ.uvqO9syQG1RvhjiTzMDy4aLXg7pF5DPhfbzr_pstUP8",
  "access_expires_at": "2026-10-30T22:33:00.545863163Z",
  "refresh_token": "nraRrtnbfG1VBcY_7ONjQYgxFvdYnVwBJ-O7MrSs1pI",
  "refresh_expires_at": "2026-11-29T22:18:00.545487761Z",
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

(the car drives 76 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "b0e885e7-f0ec-401d-a2fd-2ca6ad65896e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:19:16Z",
    "sequence": 1793398756929
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "43f6e519-cc3c-4390-97da-4410901a493a",
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
  "last_heartbeat_at": "2026-10-30T22:19:16.945128Z",
  "last_location_at": "2026-10-30T22:19:16.945128Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681473219",
  "device_ref": "sandbox-23830"
}
```

```json
{
  "challenge_id": "df893139-4ab5-47f8-af44-e02c9c7d4e19",
  "expires_at": "2026-10-30T22:24:17.140862727Z",
  "resend_available_at": "2026-10-30T22:19:18.140862727Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681473219` → **200**

```json
{
  "phone": "+380681473219",
  "audience": "CLIENT",
  "code": "075798",
  "sent_at": "2026-10-30T22:19:17.143568632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df893139-4ab5-47f8-af44-e02c9c7d4e19",
  "code": "075798",
  "device_ref": "sandbox-23830"
}
```

```json
{
  "session_id": "66f48095-157a-4f5a-81af-e44e93939950",
  "subject": {
    "type": "CLIENT",
    "id": "fa66352a-57b6-42ae-89ad-4a0e851c68b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTY2MzUyYS01N2I2LTQyYWUtODlhZC00YTBlODUxYzY4YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NjU3LCJpYXQiOjE3OTMzOTg3NTcsImp0aSI6IjdkY2UwMzM2LTc0ZmUtNGFlOS04MzM1LTJjYmY0OTg2YzMwZiIsInNpZCI6IjY2ZjQ4MDk1LTE1N2EtNGY1YS04MWFmLWU0NGU5MzkzOTk1MCJ9.-0nrP-lnho__XDZC7WiOGsIszQiou-A9BL7eAApW-_k",
  "access_expires_at": "2026-10-30T22:34:17.359668787Z",
  "refresh_token": "gZrKbGESWvhI6dPtVn33LGVP0Vb_naPpAVlnY6tz3AQ",
  "refresh_expires_at": "2026-11-29T22:19:17.359051441Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7bca2f0-d0f8-4242-b22e-e9b65c761780",
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
  "id": "c4132c69-407d-4fae-989e-10b39b30360d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:24:17.561460Z",
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
  "command_id": "cc8375e1-da3a-4ca9-8430-1f710fcc7fc0",
  "quote_id": "c4132c69-407d-4fae-989e-10b39b30360d",
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
  "id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa66352a-57b6-42ae-89ad-4a0e851c68b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:19:17.778832Z",
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
    "id": "e5479c37-2365-49e6-9244-9405c92a77fd",
    "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
    "expires_at": "2026-10-30T22:19:32.781527Z",
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

`POST /api/driver/v1/offers/e5479c37-2365-49e6-9244-9405c92a77fd/accept` → **200**

```json
{
  "command_id": "68009181-b8e5-451f-a01b-ad64fa786909"
}
```

```json
{
  "id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
  "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
  "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "assignment_id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
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

`POST /api/driver/v1/work-sessions/43f6e519-cc3c-4390-97da-4410901a493a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:19:22Z",
    "sequence": 1793398762605
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "43f6e519-cc3c-4390-97da-4410901a493a",
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
  "last_heartbeat_at": "2026-10-30T22:19:22.620541Z",
  "last_location_at": "2026-10-30T22:19:22.620541Z",
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
  "id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
  "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "assignment_id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
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

`POST /api/driver/v1/trips/dd835b64-ab26-4e06-8d80-0ade039590a2/arrive` → **200**

```json
{
  "command_id": "6f01554b-83c0-4f68-a17c-5ae89125a21b",
  "expected_version": 0
}
```

```json
{
  "id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
  "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "assignment_id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
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
  "arrived_at": "2026-10-30T22:19:22.990746Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dd835b64-ab26-4e06-8d80-0ade039590a2/start` → **200**

```json
{
  "command_id": "c9e0dede-c39c-4e39-bce0-90af9477a8ff",
  "expected_version": 1
}
```

```json
{
  "id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
  "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "assignment_id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
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
  "arrived_at": "2026-10-30T22:19:22.990746Z",
  "started_at": "2026-10-30T22:19:23.196237Z",
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
  "command_id": "b7cec5f6-bb3d-413a-aafe-d714a5b41f12",
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
  "session_id": "43f6e519-cc3c-4390-97da-4410901a493a",
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
  "last_heartbeat_at": "2026-10-30T22:19:22.620541Z",
  "last_location_at": "2026-10-30T22:19:22.620541Z",
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
  "id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
  "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "assignment_id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
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
  "arrived_at": "2026-10-30T22:19:22.990746Z",
  "started_at": "2026-10-30T22:19:23.196237Z",
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
  "command_id": "3d256ce3-66c6-4216-9355-40fc86ee9d11",
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
  "correlation_id": "cda5d2c0-ee1c-4121-9400-903291466bf7"
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
  "correlation_id": "dd2c4bec-7ce9-494a-94f2-6e212ca4e6ce"
}
```

## He completes the trip and writes to support

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/43f6e519-cc3c-4390-97da-4410901a493a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:20:11Z",
    "sequence": 1793398811787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "43f6e519-cc3c-4390-97da-4410901a493a",
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
  "last_heartbeat_at": "2026-10-30T22:20:11.802905Z",
  "last_location_at": "2026-10-30T22:20:11.802905Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/dd835b64-ab26-4e06-8d80-0ade039590a2/complete` → **200**

```json
{
  "command_id": "27c21968-f9e6-4e2e-88bd-5f1c072e948f",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:20:11Z",
  "cash_received": true
}
```

```json
{
  "id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
  "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "assignment_id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
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
  "arrived_at": "2026-10-30T22:19:22.990746Z",
  "started_at": "2026-10-30T22:19:23.196237Z",
  "completed_at": "2026-10-30T22:20:11.99834Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/support/cases` → **201**

```json
{
  "command_id": "0a3a4405-28f2-4b64-a760-cfa3d0ceca91",
  "category": "OTHER",
  "subject": "Why is my account blocked?",
  "message": "Please explain."
}
```

```json
{
  "id": "7f1dc2ab-d664-4f13-bff5-b864ef4c046e",
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
  "created_at": "2026-10-30T22:20:12.206282Z",
  "updated_at": "2026-10-30T22:20:12.206282Z",
  "respond_by": "2026-10-31T02:20:12.206282Z",
  "messages": [
    {
      "id": "2cafddf1-237a-44db-92dc-cfc8ee58d608",
      "sequence": 1,
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000403",
      "visibility": "PUBLIC",
      "body": "Please explain.",
      "created_at": "2026-10-30T22:20:12.207232Z",
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
      "id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
      "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
      "order_short_number": 14,
      "created_at": "2026-10-30T22:19:18.208524Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "884b9de5-b6ff-4ddb-98f3-95b9590649be",
      "order_id": "8b260855-9910-4290-8cc9-02b555c65d22",
      "order_short_number": 11,
      "created_at": "2026-10-30T22:15:37.303944Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "9da1286f-bdb5-4b20-8937-aaac32ea96a4",
      "order_id": "38699775-576a-40ed-9d7a-c0e827970e70",
      "order_short_number": 9,
      "created_at": "2026-10-30T22:15:17.922464Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "e66edd35-378b-41c5-880e-102f997fc206",
      "order_id": "3554c8cd-a941-42bb-b87e-4eec07ca6c18",
      "order_short_number": 8,
      "created_at": "2026-10-30T22:15:02.724618Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "7077abc1-00fc-4642-ac22-584097fc17ed",
      "order_id": "4b7001c1-e0dc-4ed6-9947-bd2150f59a25",
      "order_short_number": 7,
      "created_at": "2026-10-30T22:14:13.496473Z",
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
  "session_id": "43f6e519-cc3c-4390-97da-4410901a493a",
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
  "last_heartbeat_at": "2026-10-30T22:20:11.802905Z",
  "last_location_at": "2026-10-30T22:20:11.802905Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/43f6e519-cc3c-4390-97da-4410901a493a/resume` → **403**

```json
{
  "command_id": "893aa13a-579f-4316-b4d3-645f6c40c3ae",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/43f6e519-cc3c-4390-97da-4410901a493a/resume",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "64ea17e3-3589-4ad0-9a61-770b617392e3"
}
```

(the car drives 46 s to the next point)

`POST /api/driver/v1/work-sessions/43f6e519-cc3c-4390-97da-4410901a493a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:02Z",
    "sequence": 1793398862364
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "43f6e519-cc3c-4390-97da-4410901a493a",
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
  "last_heartbeat_at": "2026-10-30T22:21:02.051381Z",
  "last_location_at": "2026-10-30T22:21:02.051381Z",
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
  "command_id": "b7b6e096-c42a-4ec8-88fe-6af46f34694e",
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
  "id": "030c5d10-d1e9-4ca4-957a-9d6fdceab9b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:02.246152Z",
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
  "command_id": "cb7d02fd-be2f-4fe3-ac3e-1548e7e84961",
  "quote_id": "030c5d10-d1e9-4ca4-957a-9d6fdceab9b9",
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
  "id": "afe8bf37-3956-4cca-b976-5fceaa4f1a75",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa66352a-57b6-42ae-89ad-4a0e851c68b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:21:02.448806Z",
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
  "correlation_id": "5e2fcb52-82dd-4911-93fc-0015233d679f"
}
```

`GET /api/operator/v1/orders/afe8bf37-3956-4cca-b976-5fceaa4f1a75` → **200**

```json
{
  "id": "afe8bf37-3956-4cca-b976-5fceaa4f1a75",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa66352a-57b6-42ae-89ad-4a0e851c68b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:21:02.448806Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: blocked on trip dd835b64-ab26-4e06-8d80-0ade039590a2, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED.

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
  "command_id": "1a5c8e1d-8060-483a-940b-091f09d019c9",
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

`GET /api/operator/v1/orders/1ac11450-163e-4180-82ea-09e2c4180b92` → **200**

```json
{
  "id": "1ac11450-163e-4180-82ea-09e2c4180b92",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fa66352a-57b6-42ae-89ad-4a0e851c68b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
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
    "id": "17c47cd0-008a-485c-924b-b43ce44bcd00",
    "order_id": "1ac11450-163e-4180-82ea-09e2c4180b92",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dd835b64-ab26-4e06-8d80-0ade039590a2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:19:17.778832Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/afe8bf37-3956-4cca-b976-5fceaa4f1a75` → **200**

```json
{
  "id": "afe8bf37-3956-4cca-b976-5fceaa4f1a75",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fa66352a-57b6-42ae-89ad-4a0e851c68b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:21:02.448806Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/afe8bf37-3956-4cca-b976-5fceaa4f1a75/cancel` → **200**

```json
{
  "command_id": "263e7961-48fb-4305-ba68-7de5d474c89b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "afe8bf37-3956-4cca-b976-5fceaa4f1a75",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fa66352a-57b6-42ae-89ad-4a0e851c68b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:02.448806Z",
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
  "session_id": "43f6e519-cc3c-4390-97da-4410901a493a",
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
  "last_heartbeat_at": "2026-10-30T22:21:02.051381Z",
  "last_location_at": "2026-10-30T22:21:02.051381Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/43f6e519-cc3c-4390-97da-4410901a493a/close` → **200**

```json
{
  "command_id": "005416a9-c57a-4173-91f1-c7dc90a8237b",
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
  "device_ref": "sandbox-26320"
}
```

```json
{
  "challenge_id": "e584ec08-484c-46cd-9383-c986f93543b7",
  "expires_at": "2026-10-30T22:26:04.492090012Z",
  "resend_available_at": "2026-10-30T22:21:05.492090012Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "477735",
  "sent_at": "2026-10-30T22:21:04.493935342Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e584ec08-484c-46cd-9383-c986f93543b7",
  "code": "477735",
  "device_ref": "sandbox-26320"
}
```

```json
{
  "session_id": "f4f51aac-8218-4ff9-994f-3b47663cafa4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTc2NCwiaWF0IjoxNzkzMzk4ODY0LCJqdGkiOiIxZTAwYzI4YS04ZGU4LTRmZjctYjJkNC04ODBiOGMxYmVlZmYiLCJzaWQiOiJmNGY1MWFhYy04MjE4LTRmZjktOTk0Zi0zYjQ3NjYzY2FmYTQifQ.S2JatOD4E5ThzuaYHEymNyI1RLYZ5I6jDTConv_RfUA",
  "access_expires_at": "2026-10-30T22:36:04.714069646Z",
  "refresh_token": "RB8iBBvPKZL8kovMjl2S5S7TaMtrPpQPLtRDyrkFXo8",
  "refresh_expires_at": "2026-11-29T22:21:04.713700149Z",
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
  "device_ref": "sandbox-23819"
}
```

```json
{
  "challenge_id": "df4df099-2bc6-47ce-9a70-cbe817e40e8e",
  "expires_at": "2026-10-30T22:26:05.107987315Z",
  "resend_available_at": "2026-10-30T22:21:06.107987315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "078171",
  "sent_at": "2026-10-30T22:21:05.109974728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df4df099-2bc6-47ce-9a70-cbe817e40e8e",
  "code": "078171",
  "device_ref": "sandbox-23819"
}
```

```json
{
  "session_id": "7f05b475-fa2e-4144-994e-d05845c508db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTc2NSwiaWF0IjoxNzkzMzk4ODY1LCJqdGkiOiJiNWI5NzkxOC0wY2YxLTQxMWEtYjQzMy1kN2NkNGVmZDcxNTgiLCJzaWQiOiI3ZjA1YjQ3NS1mYTJlLTQxNDQtOTk0ZS1kMDU4NDVjNTA4ZGIifQ.6KC_AobGmnk3BKnIe0h4iE2QGwJHTmc0SgB6CLl7RJY",
  "access_expires_at": "2026-10-30T22:36:05.325238097Z",
  "refresh_token": "3yPIZQkSR5oBc-t6v6O0xuNDXJUvwUjlgxEebK-tPlw",
  "refresh_expires_at": "2026-11-29T22:21:05.324813617Z",
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
  "command_id": "3d56d0a2-dce4-420f-a6b7-5684e9e0ae22",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:05Z",
    "sequence": 1793398865716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:05.732519Z",
  "last_location_at": "2026-10-30T22:21:05.732519Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9019"
}
```

```json
{
  "challenge_id": "70ee813e-c263-45d7-942a-11082219ab27",
  "expires_at": "2026-10-30T22:26:05.924274525Z",
  "resend_available_at": "2026-10-30T22:21:06.924274525Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "932979",
  "sent_at": "2026-10-30T22:21:05.926226321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70ee813e-c263-45d7-942a-11082219ab27",
  "code": "932979",
  "device_ref": "sandbox-9019"
}
```

```json
{
  "session_id": "f2df5f28-fb9f-4d29-932a-8d960636112f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTc2NiwiaWF0IjoxNzkzMzk4ODY2LCJqdGkiOiIyOWY0NTZiOC0xMDhlLTRkMDItOWIwNy0wMTEzNDhlYTQ5MmYiLCJzaWQiOiJmMmRmNWYyOC1mYjlmLTRkMjktOTMyYS04ZDk2MDYzNjExMmYifQ.QTdCml8f3x9iq1mePQnSY9ecWZuyYdDpX_5KE2GrRPw",
  "access_expires_at": "2026-10-30T22:36:06.139737895Z",
  "refresh_token": "_DtZ_ti-Ff4VjWD_tbviACQlrf9OnSIIZOXUc-Qf63M",
  "refresh_expires_at": "2026-11-29T22:21:06.13913729Z",
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
  "command_id": "3d8b46a3-f765-4c4d-91cb-8e8bf3dd456e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:06Z",
    "sequence": 1793398866527
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b58175e4-5197-4d3d-bd49-15c02dc353b9",
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
  "last_heartbeat_at": "2026-10-30T22:21:06.544458Z",
  "last_location_at": "2026-10-30T22:21:06.544458Z",
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
  "session_id": "865a6cdf-a251-4c32-90c1-2ba46c99de2d",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk3NjYsImlhdCI6MTc5MzM5ODg2NiwianRpIjoiOTIyZWE4MjktMmIwOS00OGUwLThlNjItNTMxNGI1NDQ1MzNhIiwic2lkIjoiODY1YTZjZGYtYTI1MS00YzMyLTkwYzEtMmJhNDZjOTlkZTJkIn0.DhLltPHgo0pSZGqsvWms__azc-NsbhxLcI6cPf6wYtw",
  "access_expires_at": "2026-10-30T22:36:06.971951902Z",
  "refresh_token": "uCv53YP3RyF2RDYUuPaZdVo0t_RIdKVeBjuoZIbXbeM",
  "refresh_expires_at": "2026-10-31T10:21:06.971564388Z",
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
  "session_id": "b706a833-7616-49cd-9e28-264d6b5b7379",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk3NjcsImlhdCI6MTc5MzM5ODg2NywianRpIjoiMWYyMWRkZmUtYzgzNi00ZDhlLThiM2YtZjAwNTQwYjBjZDU3Iiwic2lkIjoiYjcwNmE4MzMtNzYxNi00OWNkLTllMjgtMjY0ZDZiNWI3Mzc5In0.UEdBbjYQbhF6YEQz0WR3mqIFASLX2bRSOeDWOMXuWLU",
  "access_expires_at": "2026-10-30T22:36:07.366237698Z",
  "refresh_token": "ifG4BlbLb8xZ0rKbv3ds4r2OeNrN3niAK2H0PlyvZ0s",
  "refresh_expires_at": "2026-10-31T10:21:07.365819088Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686343115",
  "device_ref": "sandbox-4876"
}
```

```json
{
  "challenge_id": "5242e00a-1f38-4c82-a28f-ecd3ceb490d7",
  "expires_at": "2026-10-30T22:26:07.55109545Z",
  "resend_available_at": "2026-10-30T22:21:08.55109545Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686343115` → **200**

```json
{
  "phone": "+380686343115",
  "audience": "CLIENT",
  "code": "351742",
  "sent_at": "2026-10-30T22:21:07.553059018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5242e00a-1f38-4c82-a28f-ecd3ceb490d7",
  "code": "351742",
  "device_ref": "sandbox-4876"
}
```

```json
{
  "session_id": "4809dfb5-7709-4162-97b9-318d1d2156f6",
  "subject": {
    "type": "CLIENT",
    "id": "c99e7154-ce87-4202-b434-84ae0245ebb5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTllNzE1NC1jZTg3LTQyMDItYjQzNC04NGFlMDI0NWViYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5NzY3LCJpYXQiOjE3OTMzOTg4NjcsImp0aSI6IjliNDIwM2RlLTA1MDktNDRiNC05Y2I3LTliODI2MjBhZjdhZiIsInNpZCI6IjQ4MDlkZmI1LTc3MDktNDE2Mi05N2I5LTMxOGQxZDIxNTZmNiJ9.tKxJUntyHOzpf7s6o0PdePCxJKLwmJh2x4qlGuTakWw",
  "access_expires_at": "2026-10-30T22:36:07.762318556Z",
  "refresh_token": "7OkPwrI36Vyu_TKVfsa0B8-inS-1GM9Va9m4hT8rGuE",
  "refresh_expires_at": "2026-11-29T22:21:07.761911979Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "857d496f-c347-4da9-9ef9-4cc5fc426974",
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
  "id": "a3367bb8-b768-40fc-b9ce-ef67e5e3310f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:07.955818Z",
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
  "command_id": "aa969e6f-936b-4231-b0b3-0a0b32e35646",
  "quote_id": "a3367bb8-b768-40fc-b9ce-ef67e5e3310f",
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
  "id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:08.158806Z",
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
    "id": "fb3459fc-9e01-49cf-a25c-484919f2047e",
    "order_id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
    "expires_at": "2026-10-30T22:21:23.161039Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:05.732519Z",
  "last_location_at": "2026-10-30T22:21:05.732519Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/pause` → **200**

```json
{
  "command_id": "3f281a56-8610-4e20-affd-b57b54d9bd4b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:05.732519Z",
  "last_location_at": "2026-10-30T22:21:05.732519Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/fb3459fc-9e01-49cf-a25c-484919f2047e/accept` → **409**

```json
{
  "command_id": "442cbbe5-0176-4729-b128-9e204dfeb885"
}
```

```json
{
  "instance": "/api/driver/v1/offers/fb3459fc-9e01-49cf-a25c-484919f2047e/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "1db25f1e-037f-4478-8479-78e871ffb987"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3c1f0d39-b495-40f3-8b98-f21c07b57fc0",
    "order_id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
    "expires_at": "2026-10-30T22:21:23.757634Z",
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

`POST /api/driver/v1/offers/3c1f0d39-b495-40f3-8b98-f21c07b57fc0/reject` → **204**

```json
{
  "command_id": "5aed7ef3-bb2c-481c-b129-841602eaeb54"
}
```

`GET /api/operator/v1/orders/55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T22:21:08.159147Z",
      "actor": {
        "type": "CLIENT",
        "id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
        "quote_id": "a3367bb8-b768-40fc-b9ce-ef67e5e3310f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b10084e2-4a5c-4854-bdec-49fde6ec85c7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T22:21:08.160581Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
        "attempt_id": "b1b6e90f-41b5-4d9c-9a05-6c1d26fce6c9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b10084e2-4a5c-4854-bdec-49fde6ec85c7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T22:21:08.174568Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fb3459fc-9e01-49cf-a25c-484919f2047e",
        "order_id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200,
        "expires_at": "2026-10-30T22:21:23.161039331Z"
      },
      "correlation_id": "b10084e2-4a5c-4854-bdec-49fde6ec85c7"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T22:21:08.757002Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "fb3459fc-9e01-49cf-a25c-484919f2047e",
        "order_id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "1d9e3b2c-a252-45b6-8988-0d74b7044b40"
```

`GET /api/operator/v1/orders/55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae` → **200**

```json
{
  "id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:21:08.158806Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae/cancel` → **200**

```json
{
  "command_id": "d2d55ece-cb97-4c2c-818c-d7e1058f9e71",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "55998b3c-43d7-43dd-bcb1-b26c8bb2b4ae",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:08.158806Z",
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

E2: offer fb3459fc-9e01-49cf-a25c-484919f2047e revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b58175e4-5197-4d3d-bd49-15c02dc353b9",
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
  "last_heartbeat_at": "2026-10-30T22:21:06.544458Z",
  "last_location_at": "2026-10-30T22:21:06.544458Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b58175e4-5197-4d3d-bd49-15c02dc353b9/close` → **200**

```json
{
  "command_id": "f3a8df90-e0b4-47cf-b683-0b276f22fc7d",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:05.732519Z",
  "last_location_at": "2026-10-30T22:21:05.732519Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/resume` → **200**

```json
{
  "command_id": "035b82ba-55ee-4ecd-b881-850cbd1e5af5",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:05.732519Z",
  "last_location_at": "2026-10-30T22:21:05.732519Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:10Z",
    "sequence": 1793398870804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:10.820038Z",
  "last_location_at": "2026-10-30T22:21:10.820038Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "985bbd2a-ef47-4ae0-8a16-04ce24b229d1",
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
  "id": "4e4828ab-5c28-46e7-b14f-1a4fb54d6d67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:11.018495Z",
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
  "command_id": "b1b098cf-cd35-419b-89aa-a99c0a5100a3",
  "quote_id": "4e4828ab-5c28-46e7-b14f-1a4fb54d6d67",
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
  "id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:11.217781Z",
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
    "id": "c8f37ff4-2bcc-4d5d-a072-6c9de165eece",
    "order_id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
    "expires_at": "2026-10-30T22:21:26.219648Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:10.820038Z",
  "last_location_at": "2026-10-30T22:21:10.820038Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/c8f37ff4-2bcc-4d5d-a072-6c9de165eece/accept` → **200**

```json
{
  "id": "05126022-161a-4d6e-bda3-2626241a3f49",
  "order_id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "39f40886-d449-4058-ba13-33db4d355c6b",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:10.820038Z",
  "last_location_at": "2026-10-30T22:21:10.820038Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 1: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/333a786a-4fc4-4bf2-84d9-7f247b929a2e` → **200**

```json
{
  "id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "05126022-161a-4d6e-bda3-2626241a3f49",
    "order_id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "39f40886-d449-4058-ba13-33db4d355c6b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:11.217781Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/333a786a-4fc4-4bf2-84d9-7f247b929a2e` → **200**

```json
{
  "id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "05126022-161a-4d6e-bda3-2626241a3f49",
    "order_id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "39f40886-d449-4058-ba13-33db4d355c6b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:11.217781Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/333a786a-4fc4-4bf2-84d9-7f247b929a2e/cancel` → **200**

```json
{
  "command_id": "3126c7c4-a1a7-4ee9-bf7b-2734faa068fc",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "05126022-161a-4d6e-bda3-2626241a3f49",
    "order_id": "333a786a-4fc4-4bf2-84d9-7f247b929a2e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "39f40886-d449-4058-ba13-33db4d355c6b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:21:11.217781Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:10.820038Z",
  "last_location_at": "2026-10-30T22:21:10.820038Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/resume` → **200**

```json
{
  "command_id": "9f10ed75-f876-4937-aee4-7279e42a2007",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:10.820038Z",
  "last_location_at": "2026-10-30T22:21:10.820038Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:12Z",
    "sequence": 1793398872892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:12.907738Z",
  "last_location_at": "2026-10-30T22:21:12.907738Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "49c450cb-dd76-4cbe-8f56-8f903f30b81a",
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
  "id": "148cd877-ab10-4663-b519-408bc34ac859",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:13.109659Z",
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
  "command_id": "c3181ee4-0637-4634-ad88-31e5f837f120",
  "quote_id": "148cd877-ab10-4663-b519-408bc34ac859",
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
  "id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:13.307002Z",
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
    "id": "1729a1a2-55fd-407c-8d53-812419cb02a5",
    "order_id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
    "expires_at": "2026-10-30T22:21:28.309124Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:12.907738Z",
  "last_location_at": "2026-10-30T22:21:12.907738Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/1729a1a2-55fd-407c-8d53-812419cb02a5/accept` → **200**

```json
{
  "id": "cc312a50-1b59-4073-8c06-1552eb864bc6",
  "order_id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f4ffc66-e97d-4a66-b224-261c50e18f8c",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:12.907738Z",
  "last_location_at": "2026-10-30T22:21:12.907738Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/aff3b606-bc29-4290-ac57-6c0e8f7f38a9` → **200**

```json
{
  "id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cc312a50-1b59-4073-8c06-1552eb864bc6",
    "order_id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6f4ffc66-e97d-4a66-b224-261c50e18f8c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:13.307002Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/aff3b606-bc29-4290-ac57-6c0e8f7f38a9` → **200**

```json
{
  "id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cc312a50-1b59-4073-8c06-1552eb864bc6",
    "order_id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6f4ffc66-e97d-4a66-b224-261c50e18f8c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:13.307002Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/aff3b606-bc29-4290-ac57-6c0e8f7f38a9/cancel` → **200**

```json
{
  "command_id": "fe2327ec-dd10-4468-9473-9c0e99b704b2",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cc312a50-1b59-4073-8c06-1552eb864bc6",
    "order_id": "aff3b606-bc29-4290-ac57-6c0e8f7f38a9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6f4ffc66-e97d-4a66-b224-261c50e18f8c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:21:13.307002Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:12.907738Z",
  "last_location_at": "2026-10-30T22:21:12.907738Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/resume` → **200**

```json
{
  "command_id": "af0fe795-e413-4594-9fab-818039d48b3a",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:12.907738Z",
  "last_location_at": "2026-10-30T22:21:12.907738Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:14Z",
    "sequence": 1793398874929
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:14.944647Z",
  "last_location_at": "2026-10-30T22:21:14.944647Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bf075292-cea4-4057-86a0-a5e1f0a6cfac",
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
  "id": "c30a2199-6d46-4294-ad64-0609c0dcdaaa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:15.141529Z",
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
  "command_id": "e568ec99-3c02-4d0f-aa72-f11afee64a66",
  "quote_id": "c30a2199-6d46-4294-ad64-0609c0dcdaaa",
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
  "id": "19296e60-99d1-440c-9325-3a75848a60db",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:15.350954Z",
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
    "id": "72d0406e-c584-43e3-a714-116442a4c564",
    "order_id": "19296e60-99d1-440c-9325-3a75848a60db",
    "expires_at": "2026-10-30T22:21:30.353428Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:14.944647Z",
  "last_location_at": "2026-10-30T22:21:14.944647Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/72d0406e-c584-43e3-a714-116442a4c564/accept` → **200**

```json
{
  "id": "6aebe123-8493-4bf2-aad6-641c1db88265",
  "order_id": "19296e60-99d1-440c-9325-3a75848a60db",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "399710f6-a9a8-4dc3-bb33-e34c161f8a51",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:14.944647Z",
  "last_location_at": "2026-10-30T22:21:14.944647Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/19296e60-99d1-440c-9325-3a75848a60db` → **200**

```json
{
  "id": "19296e60-99d1-440c-9325-3a75848a60db",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6aebe123-8493-4bf2-aad6-641c1db88265",
    "order_id": "19296e60-99d1-440c-9325-3a75848a60db",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "399710f6-a9a8-4dc3-bb33-e34c161f8a51",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:15.350954Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/19296e60-99d1-440c-9325-3a75848a60db` → **200**

```json
{
  "id": "19296e60-99d1-440c-9325-3a75848a60db",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6aebe123-8493-4bf2-aad6-641c1db88265",
    "order_id": "19296e60-99d1-440c-9325-3a75848a60db",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "399710f6-a9a8-4dc3-bb33-e34c161f8a51",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:15.350954Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/19296e60-99d1-440c-9325-3a75848a60db/cancel` → **200**

```json
{
  "command_id": "d1975682-e712-41bb-a425-e95223d0b88a",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "19296e60-99d1-440c-9325-3a75848a60db",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6aebe123-8493-4bf2-aad6-641c1db88265",
    "order_id": "19296e60-99d1-440c-9325-3a75848a60db",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "399710f6-a9a8-4dc3-bb33-e34c161f8a51",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:21:15.350954Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:14.944647Z",
  "last_location_at": "2026-10-30T22:21:14.944647Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/resume` → **200**

```json
{
  "command_id": "a322e3e5-88cf-4d88-a2b1-324c3397bfdd",
  "expected_version": 10
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:14.944647Z",
  "last_location_at": "2026-10-30T22:21:14.944647Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:17Z",
    "sequence": 1793398877480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:17.063492Z",
  "last_location_at": "2026-10-30T22:21:17.063492Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3286cbcb-23ab-4286-bbc5-1872a0431a99",
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
  "id": "f1b38020-1b05-49b1-a8a4-60108f691d17",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:17.265466Z",
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
  "command_id": "f10a4b70-2f54-4f91-9e3f-db150d0a269e",
  "quote_id": "f1b38020-1b05-49b1-a8a4-60108f691d17",
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
  "id": "f51452a2-5cbd-4313-b407-23e66c5e7240",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:17.477061Z",
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
    "id": "45fc8c82-2b53-4eb3-8f35-a12ef20eba75",
    "order_id": "f51452a2-5cbd-4313-b407-23e66c5e7240",
    "expires_at": "2026-10-30T22:21:32.479355Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:17.063492Z",
  "last_location_at": "2026-10-30T22:21:17.063492Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/45fc8c82-2b53-4eb3-8f35-a12ef20eba75/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/45fc8c82-2b53-4eb3-8f35-a12ef20eba75/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "03da0ecb-176e-4743-b92a-fe94fb8ca29c"
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:17.063492Z",
  "last_location_at": "2026-10-30T22:21:17.063492Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/f51452a2-5cbd-4313-b407-23e66c5e7240` → **200**

```json
{
  "id": "f51452a2-5cbd-4313-b407-23e66c5e7240",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:21:17.477061Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f51452a2-5cbd-4313-b407-23e66c5e7240` → **200**

```json
{
  "id": "f51452a2-5cbd-4313-b407-23e66c5e7240",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:21:17.477061Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f51452a2-5cbd-4313-b407-23e66c5e7240/cancel` → **200**

```json
{
  "command_id": "9dd8207c-50d1-4a89-9284-17bb3ca81a6b",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f51452a2-5cbd-4313-b407-23e66c5e7240",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:17.477061Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:17.063492Z",
  "last_location_at": "2026-10-30T22:21:17.063492Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/resume` → **200**

```json
{
  "command_id": "ed0c06f2-95e9-42f0-bdf8-5a98f1cc9b9f",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:17.063492Z",
  "last_location_at": "2026-10-30T22:21:17.063492Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:19Z",
    "sequence": 1793398879209
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:19.224241Z",
  "last_location_at": "2026-10-30T22:21:19.224241Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b501d5c6-a90c-4e44-a145-6dc8c2137817",
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
  "id": "2fd0e63e-a3cb-43d1-a49e-b1df715dda6d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:19.445894Z",
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
  "command_id": "183feb46-a91a-4ccd-a4bc-0998ec86b0c3",
  "quote_id": "2fd0e63e-a3cb-43d1-a49e-b1df715dda6d",
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
  "id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:19.658165Z",
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
    "id": "b26113f6-f686-46ae-9e5d-97ce8fa1cc0f",
    "order_id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
    "expires_at": "2026-10-30T22:21:34.660311Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:19.224241Z",
  "last_location_at": "2026-10-30T22:21:19.224241Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/b26113f6-f686-46ae-9e5d-97ce8fa1cc0f/accept` → **200**

```json
{
  "id": "8ee72104-f7c1-400a-b265-67da12060efc",
  "order_id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5707d21e-bea7-481c-bd32-7908fb703628",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:19.224241Z",
  "last_location_at": "2026-10-30T22:21:19.224241Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/4bfb83d1-5320-42ca-ace1-a8b4cb20fb43` → **200**

```json
{
  "id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8ee72104-f7c1-400a-b265-67da12060efc",
    "order_id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5707d21e-bea7-481c-bd32-7908fb703628",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:19.658165Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4bfb83d1-5320-42ca-ace1-a8b4cb20fb43` → **200**

```json
{
  "id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
  "short_number": 21,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8ee72104-f7c1-400a-b265-67da12060efc",
    "order_id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5707d21e-bea7-481c-bd32-7908fb703628",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:21:19.658165Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4bfb83d1-5320-42ca-ace1-a8b4cb20fb43/cancel` → **200**

```json
{
  "command_id": "98bb55f1-9663-4e8f-b411-0fe687d7c24a",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c99e7154-ce87-4202-b434-84ae0245ebb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "8ee72104-f7c1-400a-b265-67da12060efc",
    "order_id": "4bfb83d1-5320-42ca-ace1-a8b4cb20fb43",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5707d21e-bea7-481c-bd32-7908fb703628",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:21:19.658165Z",
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
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:19.224241Z",
  "last_location_at": "2026-10-30T22:21:19.224241Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/resume` → **200**

```json
{
  "command_id": "0ff30af8-9d88-47bd-97ad-9b76a5bfcf8c",
  "expected_version": 15
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:19.224241Z",
  "last_location_at": "2026-10-30T22:21:19.224241Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T22:21:21Z",
    "sequence": 1793398881326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:21.342576Z",
  "last_location_at": "2026-10-30T22:21:21.342576Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:21Z",
    "sequence": 1793398881536
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:21.552146Z",
  "last_location_at": "2026-10-30T22:21:21.552146Z",
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
  "at": "2026-10-30T22:21:21.749427039Z",
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
      "last_location_at": "2026-10-30T22:21:21.552146Z",
      "last_heartbeat_at": "2026-10-30T22:21:21.552146Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (4/1), E4 and last_heartbeat_at 2026-10-30T22:21:21.552146Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8899c2a-5c20-4b78-a403-2b2ffc9e2115",
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
  "last_heartbeat_at": "2026-10-30T22:21:21.552146Z",
  "last_location_at": "2026-10-30T22:21:21.552146Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8899c2a-5c20-4b78-a403-2b2ffc9e2115/close` → **200**

```json
{
  "command_id": "6b7930e0-4a79-4d99-a41a-2863da50f6f8",
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
  "session_id": "552c7139-4fd0-493f-a925-709a853b2321",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk3ODIsImlhdCI6MTc5MzM5ODg4MiwianRpIjoiNjM1ZjgxNzgtZTUyMC00NzUwLTg1YzEtMzY5NDgwOTdkZWJiIiwic2lkIjoiNTUyYzcxMzktNGZkMC00OTNmLWE5MjUtNzA5YTg1M2IyMzIxIn0.H90ZeTic-EYyzm6pSCT088XYby3aQR_IlKugxk06Cqs",
  "access_expires_at": "2026-10-30T22:36:22.805007291Z",
  "refresh_token": "Q1g82g1H-Q3TDbGnhAZrW6gV7CyaNsFjbmUsSaNm9pE",
  "refresh_expires_at": "2026-10-31T10:21:22.804448649Z",
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
  "command_id": "5645dc9b-2134-4707-901a-e1f38dfe729a",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T22:21:23.208013Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "84474521-ad7b-45cd-abe1-0e43cb1ac382",
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
  "correlation_id": "5f19e871-06f1-484d-9b80-1177d5637d62",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "24b55059-651b-4a64-aa3c-9a59a0c3df7a",
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
  "correlation_id": "37fb2c1e-06ae-418e-9ff4-f50719b322f9"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637019073",
  "device_ref": "sandbox-69"
}
```

```json
{
  "challenge_id": "a9e365e7-f674-470f-ad11-28ecd0a15a59",
  "expires_at": "2026-10-30T22:26:23.802900051Z",
  "resend_available_at": "2026-10-30T22:21:24.802900051Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637019073` → **200**

```json
{
  "phone": "+380637019073",
  "audience": "CLIENT",
  "code": "783084",
  "sent_at": "2026-10-30T22:21:23.805804201Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9e365e7-f674-470f-ad11-28ecd0a15a59",
  "code": "783084",
  "device_ref": "sandbox-69"
}
```

```json
{
  "session_id": "f3e844fa-33ff-49cc-bfff-7d776b1bc7e6",
  "subject": {
    "type": "CLIENT",
    "id": "623fcf62-8dd0-4140-a4b2-443b045393c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjNmY2Y2Mi04ZGQwLTQxNDAtYTRiMi00NDNiMDQ1MzkzYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5Nzg0LCJpYXQiOjE3OTMzOTg4ODQsImp0aSI6IjI3NjY1Zjk1LTNkMDktNGEzNS04ZjFiLWZmMzA4MGI2NTdhMiIsInNpZCI6ImYzZTg0NGZhLTMzZmYtNDljYy1iZmZmLTdkNzc2YjFiYzdlNiJ9.Ka6ZpQTRA2xe3yCfDujRg6AdSqhNNxZrmZeJmd-CVRY",
  "access_expires_at": "2026-10-30T22:36:24.014143706Z",
  "refresh_token": "4CJWtcoUDeAOFg6Ltvv-MklmJD6NbV89eNjGrn6zhGM",
  "refresh_expires_at": "2026-11-29T22:21:24.013694602Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "148f6203-8bf8-4916-b7ff-89aba3723a5f",
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
  "id": "f4356468-14aa-4338-aa93-e264290d61c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:24.206439Z",
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
  "command_id": "cf420912-4051-4490-91fd-d7d6c5fe8471",
  "quote_id": "f4356468-14aa-4338-aa93-e264290d61c7",
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
  "correlation_id": "36d7342a-873a-4399-9d03-a94cdf6bd6f8"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d02c75b7-fa09-4f32-a6b1-44665a142041",
  "quote_id": "f4356468-14aa-4338-aa93-e264290d61c7",
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
  "id": "27ba6ff2-f62b-47a3-a8b3-fedb89fd022e",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "623fcf62-8dd0-4140-a4b2-443b045393c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:21:24.621895Z",
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

`POST /api/rider/v1/orders/27ba6ff2-f62b-47a3-a8b3-fedb89fd022e/cancel` → **200**

```json
{
  "command_id": "0572765e-1faf-435a-9ab0-3be63a14c2dc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "27ba6ff2-f62b-47a3-a8b3-fedb89fd022e",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "623fcf62-8dd0-4140-a4b2-443b045393c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:21:24.621895Z",
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
  "command_id": "9a027176-2f02-40d5-a4f2-358dd0a673a4",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T22:21:25.068293Z"
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
      "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T22:21:25.068293Z"
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
  "device_ref": "sandbox-30540"
}
```

```json
{
  "challenge_id": "8c5cd6b1-e2e9-40c4-b8b6-106e1d50a088",
  "expires_at": "2026-10-30T22:26:25.658776682Z",
  "resend_available_at": "2026-10-30T22:21:26.658776682Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "383429",
  "sent_at": "2026-10-30T22:21:25.661332397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c5cd6b1-e2e9-40c4-b8b6-106e1d50a088",
  "code": "383429",
  "device_ref": "sandbox-30540"
}
```

```json
{
  "session_id": "1f48a007-ccf2-4feb-bda1-4dc6cc3d4b42",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTc4NSwiaWF0IjoxNzkzMzk4ODg1LCJqdGkiOiI0ODAyOWNhMy1mNjRhLTQ2NmEtODk1Zi01ZDU0ODJjODUxNDciLCJzaWQiOiIxZjQ4YTAwNy1jY2YyLTRmZWItYmRhMS00ZGM2Y2MzZDRiNDIifQ.qrgMT4ZfCj7Kr9pk89zw_2kJb_T86UuTcZ2FUIlOUsc",
  "access_expires_at": "2026-10-30T22:36:25.872951105Z",
  "refresh_token": "_YPem1DPXSRLtj79xCAQriZXMRJDKGcE-4jrCC7LT7Y",
  "refresh_expires_at": "2026-11-29T22:21:25.872370412Z",
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
  "command_id": "7899d9a1-6455-46ec-aaa4-e24015457d01",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:21:26Z",
    "sequence": 1793398886262
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
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
  "last_heartbeat_at": "2026-10-30T22:21:26.277103Z",
  "last_location_at": "2026-10-30T22:21:26.277103Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670251599",
  "device_ref": "sandbox-11451"
}
```

```json
{
  "challenge_id": "8ff6d47e-94a4-4408-b6fa-c08cf83f1939",
  "expires_at": "2026-10-30T22:26:26.481606829Z",
  "resend_available_at": "2026-10-30T22:21:27.481606829Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670251599` → **200**

```json
{
  "phone": "+380670251599",
  "audience": "CLIENT",
  "code": "567843",
  "sent_at": "2026-10-30T22:21:26.484154377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ff6d47e-94a4-4408-b6fa-c08cf83f1939",
  "code": "567843",
  "device_ref": "sandbox-11451"
}
```

```json
{
  "session_id": "d0e68100-af0c-4594-bae5-25bb283abeeb",
  "subject": {
    "type": "CLIENT",
    "id": "34fea36b-4f85-4021-836d-1d3753c21189"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGZlYTM2Yi00Zjg1LTQwMjEtODM2ZC0xZDM3NTNjMjExODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5Nzg2LCJpYXQiOjE3OTMzOTg4ODYsImp0aSI6IjgxMWQ2YWMyLTQxNzAtNDRkNC05MTRjLTZmOTAxN2FiZTNkZSIsInNpZCI6ImQwZTY4MTAwLWFmMGMtNDU5NC1iYWU1LTI1YmIyODNhYmVlYiJ9.2Zrlw-uT0LrFBIH12WgvKwxnRmzQuDdZQOEGsskQ6ng",
  "access_expires_at": "2026-10-30T22:36:26.698743477Z",
  "refresh_token": "bHPfaVmVrvKwC_yGSm95uuSfSpW4UyL3Bn3Qfr2sScg",
  "refresh_expires_at": "2026-11-29T22:21:26.698312519Z",
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
  "command_id": "1ba206b6-2dbb-422e-8148-623657730b1d",
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
  "id": "b73195bc-5e81-488f-97cb-e008cf574ef5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:27.090218Z",
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
  "command_id": "57bf22ad-3ded-492f-98e5-da157bbec06a",
  "platform": "ANDROID",
  "token": "sandbox-driver-6b60d48b-4875-405b-956a-cbacc9027ed0"
}
```

```json
{
  "id": "ea99b746-6c38-4247-b052-fc71ee45fde6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T22:21:27.295991Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "2c55ddd8-26a5-4d12-83a4-23e66419c3df",
  "platform": "ANDROID",
  "token": "sandbox-rider-a9a958a4-b021-42f5-8156-782296dea363"
}
```

```json
{
  "id": "cf42f5c7-4941-487b-afc2-d3a50a3f5d4f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T22:21:27.491055Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0df4127f-01b4-435f-bf46-ca9265bd5205",
  "quote_id": "b73195bc-5e81-488f-97cb-e008cf574ef5",
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
  "id": "74e1a0c9-656c-4d7a-91f6-de09d5b4080f",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34fea36b-4f85-4021-836d-1d3753c21189",
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
  "created_at": "2026-10-30T22:21:27.697625Z",
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

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "754a1102-90e7-46e0-8764-86ffcf8c92aa",
    "order_id": "74e1a0c9-656c-4d7a-91f6-de09d5b4080f",
    "expires_at": "2026-10-30T22:21:42.699873Z",
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

`POST /api/driver/v1/offers/754a1102-90e7-46e0-8764-86ffcf8c92aa/accept` → **200**

```json
{
  "command_id": "5fcb6ffd-d012-40f3-8bed-6e2873928849"
}
```

```json
{
  "id": "45ccf34e-22a4-420e-bbc7-d120f3a949eb",
  "order_id": "74e1a0c9-656c-4d7a-91f6-de09d5b4080f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c403d95e-49e5-4f7a-aea6-6ef035adeadc",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T22:21:27.677Z` → **200**

```json
[]
```

**No driver.offer push for +380500000001 — scenario stopped.**

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
  "session_id": "e23ad2ff-b256-43a4-96fc-d399b79d6c6f",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk3OTgsImlhdCI6MTc5MzM5ODg5OCwianRpIjoiMWU0MzkwODctYzBmOS00ODgzLWJkOGYtYjVjM2M4ZDM0ODliIiwic2lkIjoiZTIzYWQyZmYtYjI1Ni00M2E0LTk2ZmMtZDM5OWI3OWQ2YzZmIn0.xObvc2odQdJl8wHRtK5fn-dDqc1dyqginMq8jHlzi7c",
  "access_expires_at": "2026-10-30T22:36:38.753270546Z",
  "refresh_token": "dFPrLo3zNWukhFH2dao4jm3KIN_W0S02vQY_QFSkj84",
  "refresh_expires_at": "2026-10-31T10:21:38.752813618Z",
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
  "command_id": "dd232bcb-765c-4d21-bd35-02474946cf27",
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
  "timestamp": "2026-10-30T22:21:39.000+0000",
  "channel": {
    "id": "1730052000.2704026390",
    "linkedid": "1730052000.2704026390",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677132756"
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
  "timestamp": "2026-10-30T22:21:39.000+0000",
  "channel": {
    "id": "1730052000.2704026390",
    "linkedid": "1730052000.2704026390",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677132756"
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
  "session_id": "0f1f7c6b-bf2b-47b6-9031-b430bd3ffedc",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk3OTksImlhdCI6MTc5MzM5ODg5OSwianRpIjoiMGJiNDcyNzItYzRjOS00OTc0LThjYjQtMjQ1ZWU3ODBkM2YxIiwic2lkIjoiMGYxZjdjNmItYmYyYi00N2I2LTkwMzEtYjQzMGJkM2ZmZWRjIn0.pyqaeFOn4q2HICwo3ZVKvqR3gthgcfdSrwxgkTdcMWs",
  "access_expires_at": "2026-10-30T22:36:39.604877502Z",
  "refresh_token": "6woKXtyFFRy-fdHOUxt6HP4QPcnNbiVfvngc36-jgFQ",
  "refresh_expires_at": "2026-10-31T10:21:39.604473353Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "0872eeb8-08e5-4a21-a59b-8bb90a3f1627",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677132756",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T22:21:39Z",
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

`POST /api/operator/v1/calls/0872eeb8-08e5-4a21-a59b-8bb90a3f1627/answer` → **200**

```json
{
  "command_id": "836e53a8-423f-4c3b-be53-47a4941b4eb0"
}
```

```json
{
  "id": "0872eeb8-08e5-4a21-a59b-8bb90a3f1627",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677132756",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "order_ids": [],
  "started_at": "2026-10-30T22:21:39Z",
  "answered_at": "2026-10-30T22:21:40.021606Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2704026390",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9516a858-2579-4195-9661-81a4caa5af26",
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
  "id": "ff650086-5dd5-446f-9829-ad94ee9c5892",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:26:40.262204Z",
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
  "command_id": "6df9841c-b877-439d-9ee2-966450bc0fa3",
  "quote_id": "ff650086-5dd5-446f-9829-ad94ee9c5892",
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
    "phone": "+380677132756"
  },
  "call_id": "0872eeb8-08e5-4a21-a59b-8bb90a3f1627"
}
```

```json
{
  "id": "bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7",
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
  "created_at": "2026-10-30T22:21:40.474892Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677132756"
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
    "id": "1730052000.2704026390",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0872eeb8-08e5-4a21-a59b-8bb90a3f1627",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677132756",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [
        "bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7"
      ],
      "started_at": "2026-10-30T22:21:39Z",
      "answered_at": "2026-10-30T22:21:40.021606Z",
      "ended_at": "2026-10-30T22:21:40.729233Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "13d5d346-9a7c-4660-97a6-83421b07638a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679574165",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [],
      "started_at": "2026-10-30T22:13:50.581779Z",
      "answered_at": "2026-10-30T22:13:50.827818Z",
      "ended_at": "2026-10-30T22:13:51.042872Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:13:59.710508Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7` → **200**

```json
{
  "id": "bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7",
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
  "created_at": "2026-10-30T22:21:40.474892Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677132756"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7` → **200**

```json
{
  "id": "bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7",
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
  "created_at": "2026-10-30T22:21:40.474892Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677132756"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7/cancel` → **200**

```json
{
  "command_id": "f73d4e1f-a56b-4b79-9555-f38c2d503ebe",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7",
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
  "created_at": "2026-10-30T22:21:40.474892Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677132756"
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

Done: call 0872eeb8-08e5-4a21-a59b-8bb90a3f1627 with order bcbf4ee8-eb1c-4b4e-9d6b-857afe9be8b7.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1900"
}
```

```json
{
  "challenge_id": "f61004d2-d5ed-46f9-afcd-a49a90fd5f48",
  "expires_at": "2026-10-30T22:26:41.62196615Z",
  "resend_available_at": "2026-10-30T22:21:42.62196615Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "947908",
  "sent_at": "2026-10-30T22:21:41.623892486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f61004d2-d5ed-46f9-afcd-a49a90fd5f48",
  "code": "947908",
  "device_ref": "sandbox-1900"
}
```

```json
{
  "session_id": "0257e0e1-67b8-47d7-bd75-2b24574f329f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTgwMSwiaWF0IjoxNzkzMzk4OTAxLCJqdGkiOiJkMTJlMjU3Zi02Y2U0LTQ4ZmEtYjFiMS00ZmUwNzgzZTI1NDQiLCJzaWQiOiIwMjU3ZTBlMS02N2I4LTQ3ZDctYmQ3NS0yYjI0NTc0ZjMyOWYifQ.GQB5uiaH13ObodMb7mj1QuGOewOWHvRqwz8EoDwYbNQ",
  "access_expires_at": "2026-10-30T22:36:41.849007191Z",
  "refresh_token": "G8P0mx31L7bd7SLmgFqg-e7bjOhHxh_uSxF9Iki4Yec",
  "refresh_expires_at": "2026-11-29T22:21:41.848456852Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:21:26.277103Z",
  "last_location_at": "2026-10-30T22:21:26.277103Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/handover` → **200**

```json
{
  "command_id": "17559a09-1b6e-40d1-888e-dad0469e2298",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:21:26.277103Z",
  "last_location_at": "2026-10-30T22:21:26.277103Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

(the car drives 53 s to the next point)

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:22:35Z",
    "sequence": 1793398955476
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
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
  "last_heartbeat_at": "2026-10-30T22:22:35.490699Z",
  "last_location_at": "2026-10-30T22:22:35.490699Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667568794",
  "device_ref": "sandbox-25821"
}
```

```json
{
  "challenge_id": "a3665311-5872-4e6b-9847-2c53a88c802f",
  "expires_at": "2026-10-30T22:27:35.684962827Z",
  "resend_available_at": "2026-10-30T22:22:36.684962827Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667568794` → **200**

```json
{
  "phone": "+380667568794",
  "audience": "CLIENT",
  "code": "144691",
  "sent_at": "2026-10-30T22:22:35.688397853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3665311-5872-4e6b-9847-2c53a88c802f",
  "code": "144691",
  "device_ref": "sandbox-25821"
}
```

```json
{
  "session_id": "048f16d2-0c83-44a0-be8f-777aeee4adde",
  "subject": {
    "type": "CLIENT",
    "id": "38772d85-c21f-49e8-be14-82acc4d9637f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODc3MmQ4NS1jMjFmLTQ5ZTgtYmUxNC04MmFjYzRkOTYzN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5ODU1LCJpYXQiOjE3OTMzOTg5NTUsImp0aSI6IjU1MGE1MWM2LTRjNTUtNGM5Mi1hOTNjLTc1ZDM2NTVkMGVhNiIsInNpZCI6IjA0OGYxNmQyLTBjODMtNDRhMC1iZThmLTc3N2FlZWU0YWRkZSJ9.yfPx_ePmjLvN2V8N9p6q9kUTyH-zJwDI1kW-eneM724",
  "access_expires_at": "2026-10-30T22:37:35.904370759Z",
  "refresh_token": "dp_57GP2ZnONbai3rS0VJu_rxJQ9dncO9gtFHtNpcPI",
  "refresh_expires_at": "2026-11-29T22:22:35.904002213Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c92558b-e18e-40c2-bd42-4f0de7a30669",
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
  "id": "94cf7735-296d-48dc-9f40-f34620f18ba1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:27:36.103814Z",
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
  "command_id": "2f897115-6209-4e7b-be22-e50a67ff6565",
  "quote_id": "94cf7735-296d-48dc-9f40-f34620f18ba1",
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
  "id": "c6417f39-4ab0-4fa9-a64c-0682989700a0",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38772d85-c21f-49e8-be14-82acc4d9637f",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:22:36.314369Z",
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

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "00b98328-d744-46dd-9fb0-2bad28355cd9"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1890b162-f991-41ba-a995-46a4a05421f3"
}
```

**Expected 200, got 400 — scenario stopped.**

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
  "session_id": "d135d4f8-10b3-4406-8dd5-673fdb82653c",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk4NTcsImlhdCI6MTc5MzM5ODk1NywianRpIjoiZTE3OTJkZWYtNjY1NC00NDhjLWIwNzktZjA5MWM2MWM2MDg0Iiwic2lkIjoiZDEzNWQ0ZjgtMTBiMy00NDA2LThkZDUtNjczZmRiODI2NTNjIn0.eXJ8_Q4yx-Nn0iTGSnhMR89puEgjkw2sq43qHhv7YxE",
  "access_expires_at": "2026-10-30T22:37:37.131163892Z",
  "refresh_token": "RlywXBBXtx8LcahnVhwVZMiOE1YawoWGcQCHCYgqQxQ",
  "refresh_expires_at": "2026-10-31T10:22:37.130801366Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "dbfcfd69-e5a0-4204-90ec-eeed6e960958",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:22:37Z"
}
```

```json
{
  "id": "49f69e52-24eb-40d4-ac9f-696c67fef0bb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:22:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/49f69e52-24eb-40d4-ac9f-696c67fef0bb/publish` → **200**

```json
{
  "command_id": "5ef78abd-6e28-4b4c-812c-1a2c9e79bb12",
  "expected_version": 0
}
```

```json
{
  "id": "49f69e52-24eb-40d4-ac9f-696c67fef0bb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:22:37.541704Z",
  "published_at": "2026-10-30T22:22:37.541704Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "49f69e52-24eb-40d4-ac9f-696c67fef0bb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T22:22:37.541704Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634843613",
  "device_ref": "sandbox-29179"
}
```

```json
{
  "challenge_id": "330fa425-4929-40fd-8528-3645c925e54c",
  "expires_at": "2026-10-30T22:27:37.921522005Z",
  "resend_available_at": "2026-10-30T22:22:38.921522005Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634843613` → **200**

```json
{
  "phone": "+380634843613",
  "audience": "CLIENT",
  "code": "991753",
  "sent_at": "2026-10-30T22:22:37.923738122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "330fa425-4929-40fd-8528-3645c925e54c",
  "code": "991753",
  "device_ref": "sandbox-29179"
}
```

```json
{
  "session_id": "6f486164-9b1b-4c6f-9f68-dc958780c292",
  "subject": {
    "type": "CLIENT",
    "id": "a11078de-9cd8-48a3-b05f-e679f228a797"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTEwNzhkZS05Y2Q4LTQ4YTMtYjA1Zi1lNjc5ZjIyOGE3OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5ODU4LCJpYXQiOjE3OTMzOTg5NTgsImp0aSI6ImNiMjM3YjA1LWE0NjEtNDRlOC1iZWJmLTBkYWFhNDY3YjBiMiIsInNpZCI6IjZmNDg2MTY0LTliMWItNGM2Zi05ZjY4LWRjOTU4NzgwYzI5MiJ9.1IOjREJsGPLhSXMHH846hG8N213OPdUE5VMDUEHG_ew",
  "access_expires_at": "2026-10-30T22:37:38.135513905Z",
  "refresh_token": "7KZzoRQouL1HT5uJNJ_1I5nIm4uv0WgLYrjqIbDCS64",
  "refresh_expires_at": "2026-11-29T22:22:38.135063302Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "49f69e52-24eb-40d4-ac9f-696c67fef0bb",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T22:22:37.541704Z",
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
  "command_id": "ebdf2987-f78c-40ae-84f8-e13efe5bd56d",
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
  "id": "7ea2e273-8704-4485-927f-416dbf6cce5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:27:38.517570Z",
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
  "command_id": "875423b1-f50a-474b-9e32-e092c61c40f6",
  "quote_id": "7ea2e273-8704-4485-927f-416dbf6cce5e",
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
  "correlation_id": "ced6f5a4-f763-44b8-8b4b-93dcf56ed905"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "9de5eab3-a794-4d64-adea-a1aa53a01cfd",
  "version_id": "49f69e52-24eb-40d4-ac9f-696c67fef0bb",
  "language": "uk"
}
```

```json
{
  "version_id": "49f69e52-24eb-40d4-ac9f-696c67fef0bb",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T22:22:38.921687Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e90d81c-dfac-4286-8f63-846749298308",
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
  "id": "059a62d3-3b7d-423e-9a89-152d21491c03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:27:39.119435Z",
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
  "command_id": "74fffb8b-f465-41a6-a404-d180321b1611",
  "quote_id": "059a62d3-3b7d-423e-9a89-152d21491c03",
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
  "id": "3054368a-2e80-4260-886c-77269fdf047d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a11078de-9cd8-48a3-b05f-e679f228a797",
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
  "created_at": "2026-10-30T22:22:39.316078Z",
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

`GET /api/rider/v1/orders/3054368a-2e80-4260-886c-77269fdf047d` → **200**

```json
{
  "id": "3054368a-2e80-4260-886c-77269fdf047d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a11078de-9cd8-48a3-b05f-e679f228a797",
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
  "created_at": "2026-10-30T22:22:39.316078Z",
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

`POST /api/rider/v1/orders/3054368a-2e80-4260-886c-77269fdf047d/cancel` → **200**

```json
{
  "command_id": "b3e35f56-6add-4a09-b38d-9823511993b1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3054368a-2e80-4260-886c-77269fdf047d",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a11078de-9cd8-48a3-b05f-e679f228a797",
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
  "created_at": "2026-10-30T22:22:39.316078Z",
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

`POST /api/admin/v1/legal-documents/49f69e52-24eb-40d4-ac9f-696c67fef0bb` → **409**

```json
{
  "command_id": "a01d770f-c791-4aaf-b231-0bd74227d08e",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T22:22:39Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/49f69e52-24eb-40d4-ac9f-696c67fef0bb",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6eeec636-9d0c-4768-8aec-22019ffca436"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "4feeb95a-4415-49fb-9645-88ef16544058",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T22:22:40Z"
}
```

```json
{
  "id": "2aa9dd49-486c-41dd-8b2e-da177e83f274",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T22:22:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2aa9dd49-486c-41dd-8b2e-da177e83f274/publish` → **200**

```json
{
  "command_id": "f3e2d290-a05a-42d8-bead-ab2019727f3c",
  "expected_version": 0
}
```

```json
{
  "id": "2aa9dd49-486c-41dd-8b2e-da177e83f274",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T22:22:40.33816Z",
  "published_at": "2026-10-30T22:22:40.33816Z",
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
  "device_ref": "sandbox-19224"
}
```

```json
{
  "challenge_id": "47440b7a-d105-4cc8-a7e2-4398b3a00a47",
  "expires_at": "2026-10-30T22:27:40.537545964Z",
  "resend_available_at": "2026-10-30T22:22:41.537545964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "487293",
  "sent_at": "2026-10-30T22:22:40.539381558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47440b7a-d105-4cc8-a7e2-4398b3a00a47",
  "code": "487293",
  "device_ref": "sandbox-19224"
}
```

```json
{
  "session_id": "06edc528-5a3d-466e-9e3b-fb0e2e02fa43",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTg2MCwiaWF0IjoxNzkzMzk4OTYwLCJqdGkiOiIzZTBhZWVjZS00ZDE0LTQ0ZDctODVhOC1hNmVhYjg1ZjVhYTEiLCJzaWQiOiIwNmVkYzUyOC01YTNkLTQ2NmUtOWUzYi1mYjBlMmUwMmZhNDMifQ.4zftQ4EEoFbTUO6hkMPB06jGylT_HE2IuQ2SJ0X3Up8",
  "access_expires_at": "2026-10-30T22:37:40.753257765Z",
  "refresh_token": "aTf-dV6eKjV_LfQpSE9qH601KBXuFOhy0lleOZDWX-g",
  "refresh_expires_at": "2026-11-29T22:22:40.75288256Z",
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
  "command_id": "c575be0d-4fe2-47d5-b2d5-79df2e0c130e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:22:41Z",
    "sequence": 1793398961187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8ecb3c57-702f-464c-aed9-97c7d27c348a",
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
  "last_heartbeat_at": "2026-10-30T22:22:41.20246Z",
  "last_location_at": "2026-10-30T22:22:41.20246Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677056875",
  "device_ref": "sandbox-25936"
}
```

```json
{
  "challenge_id": "418068e1-4183-465a-863f-211963ca8618",
  "expires_at": "2026-10-30T22:27:41.394261163Z",
  "resend_available_at": "2026-10-30T22:22:42.394261163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677056875` → **200**

```json
{
  "phone": "+380677056875",
  "audience": "CLIENT",
  "code": "505894",
  "sent_at": "2026-10-30T22:22:41.396110248Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "418068e1-4183-465a-863f-211963ca8618",
  "code": "505894",
  "device_ref": "sandbox-25936"
}
```

```json
{
  "session_id": "64f33688-fe50-4be4-9fae-d666f9fb176f",
  "subject": {
    "type": "CLIENT",
    "id": "217756e3-527f-4100-927b-025b8b2fdf24"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTc3NTZlMy01MjdmLTQxMDAtOTI3Yi0wMjViOGIyZmRmMjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5ODYxLCJpYXQiOjE3OTMzOTg5NjEsImp0aSI6IjJlNjE1N2JmLWRlYjEtNDY2OS1hZTU5LTU4ODc3YTg4MjhjNSIsInNpZCI6IjY0ZjMzNjg4LWZlNTAtNGJlNC05ZmFlLWQ2NjZmOWZiMTc2ZiJ9.Iw5fIhkKksoOnuk1tMPoOGxL5cHwcsWusuoLJu2ZVOI",
  "access_expires_at": "2026-10-30T22:37:41.601949957Z",
  "refresh_token": "JbNsoDXEY1qOJ4JihKxErYeRBbUYir6yuJ_MEc-3Brk",
  "refresh_expires_at": "2026-11-29T22:22:41.601632038Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "03053aeb-f810-41cb-9d08-f61dcb9b6aa8",
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
  "id": "f1e6dbca-5352-44f1-b00c-e77069bb8f8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:27:41.795106Z",
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
  "command_id": "3a5f9a97-c2b2-45fa-9a75-58872530f1f3",
  "quote_id": "f1e6dbca-5352-44f1-b00c-e77069bb8f8b",
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
    "phone": "+380671613455"
  }
}
```

```json
{
  "id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:22:41.995516Z",
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
    "id": "f228ef5a-0b0f-4a34-87d4-10bc20a4255d",
    "order_id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
    "expires_at": "2026-10-30T22:22:56.997613Z",
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

`POST /api/driver/v1/offers/f228ef5a-0b0f-4a34-87d4-10bc20a4255d/accept` → **200**

```json
{
  "command_id": "2d5b1331-a4d3-446c-8969-66e5c38149a8"
}
```

```json
{
  "id": "abca90c9-dc90-4100-9f9d-de88dab0920d",
  "order_id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "45f67d0b-c21a-401f-aa2f-be701f4c8eed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "45f67d0b-c21a-401f-aa2f-be701f4c8eed",
  "order_id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
  "assignment_id": "abca90c9-dc90-4100-9f9d-de88dab0920d",
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
    "phone": "+380671613455"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "97fae572-e727-4ca0-8f72-7837c6540243",
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
  "id": "57e2ad59-e41a-4a92-b42b-6ccf8092e6de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:27:42.788376Z",
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
  "command_id": "9a8346a1-349c-45db-a013-f499e9323011",
  "quote_id": "57e2ad59-e41a-4a92-b42b-6ccf8092e6de",
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
  "id": "4f322fd7-8326-4499-9be8-b6597f14ffaa",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:22:42.993406Z",
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
  "command_id": "16e34817-faa6-497d-8a77-a4315974e8a1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-31T01:22:43Z"
}
```

```json
{
  "id": "a40e4740-787a-468c-b896-c094d239323d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:27:43.209667Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T01:22:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "33cd7099-d96f-4fba-a758-fb1d531e87f0",
  "quote_id": "a40e4740-787a-468c-b896-c094d239323d",
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
  "pickup_at": "2026-10-31T01:22:43Z"
}
```

```json
{
  "id": "9199aff3-2aa9-4627-b59f-1683959098d4",
  "short_number": 29,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T22:22:43.410846Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T01:22:43Z",
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
  "command_id": "0e9a1716-2216-4ec2-95cc-ce7f8efcf596",
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
  "id": "86d1eced-182c-461b-8076-ce813f721d10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:27:43.622203Z",
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
  "command_id": "0f20f912-390c-4190-ae57-38f278a0ba90",
  "quote_id": "86d1eced-182c-461b-8076-ce813f721d10",
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
  "correlation_id": "e326f5ac-ded2-40ec-bd02-096d42f9e78b"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9199aff3-2aa9-4627-b59f-1683959098d4",
      "short_number": 29,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T22:22:43.410846Z",
      "cancellation": null,
      "pickup_at": "2026-10-31T01:22:43Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null,
      "driver": null,
      "driver_change": null
    },
    {
      "id": "4f322fd7-8326-4499-9be8-b6597f14ffaa",
      "short_number": 28,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T22:22:42.993406Z",
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
      "id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "4f322fd7-8326-4499-9be8-b6597f14ffaa",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:22:42.993406Z",
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

`GET /api/rider/v1/orders/56608c74-f192-413a-a3b5-ed1d5a8be514` → **200**

```json
{
  "id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
  "short_number": 27,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "abca90c9-dc90-4100-9f9d-de88dab0920d",
    "order_id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "45f67d0b-c21a-401f-aa2f-be701f4c8eed",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T22:22:41.995516Z",
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
    "location_at": "2026-10-30T22:22:41.20246Z",
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

`POST /api/rider/v1/orders/56608c74-f192-413a-a3b5-ed1d5a8be514/cancel` → **200**

```json
{
  "command_id": "25929035-9873-4d36-a97d-b1a8f1a1b715",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "abca90c9-dc90-4100-9f9d-de88dab0920d",
    "order_id": "56608c74-f192-413a-a3b5-ed1d5a8be514",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "45f67d0b-c21a-401f-aa2f-be701f4c8eed",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T22:22:41.995516Z",
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

`GET /api/rider/v1/orders/4f322fd7-8326-4499-9be8-b6597f14ffaa` → **200**

```json
{
  "id": "4f322fd7-8326-4499-9be8-b6597f14ffaa",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:22:42.993406Z",
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

`POST /api/rider/v1/orders/4f322fd7-8326-4499-9be8-b6597f14ffaa/cancel` → **200**

```json
{
  "command_id": "c09a7d46-a563-4ba6-aa6a-fe70d8adb4f2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4f322fd7-8326-4499-9be8-b6597f14ffaa",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T22:22:42.993406Z",
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

`GET /api/rider/v1/orders/9199aff3-2aa9-4627-b59f-1683959098d4` → **200**

```json
{
  "id": "9199aff3-2aa9-4627-b59f-1683959098d4",
  "short_number": 29,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T22:22:43.410846Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T01:22:43Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null,
  "driver": null,
  "driver_change": null
}
```

`POST /api/rider/v1/orders/9199aff3-2aa9-4627-b59f-1683959098d4/cancel` → **200**

```json
{
  "command_id": "dfca0ab7-a6b8-419a-8c4f-890b0ee45038",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9199aff3-2aa9-4627-b59f-1683959098d4",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "217756e3-527f-4100-927b-025b8b2fdf24",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T22:22:43.410846Z",
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
  "pickup_at": "2026-10-31T01:22:43Z",
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
  "session_id": "8ecb3c57-702f-464c-aed9-97c7d27c348a",
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
  "last_heartbeat_at": "2026-10-30T22:22:41.20246Z",
  "last_location_at": "2026-10-30T22:22:41.20246Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8ecb3c57-702f-464c-aed9-97c7d27c348a/close` → **200**

```json
{
  "command_id": "21e282e2-e3c9-44e2-8d7c-07ede615db58",
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

Done: orders 56608c74-f192-413a-a3b5-ed1d5a8be514, 4f322fd7-8326-4499-9be8-b6597f14ffaa, 9199aff3-2aa9-4627-b59f-1683959098d4.

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
  "session_id": "27645952-91f5-4c1d-b6f8-74648246fee7",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk4NjYsImlhdCI6MTc5MzM5ODk2NiwianRpIjoiNTMyOGVlZTAtOTZjOC00YmNlLTkzZjMtNDhkMmZlMzgwZWI0Iiwic2lkIjoiMjc2NDU5NTItOTFmNS00YzFkLWI2ZjgtNzQ2NDgyNDZmZWU3In0.TxsYPOCdpnIn2TZBjzo2aFf7q9Ap9hQBdhmqYaiX-1c",
  "access_expires_at": "2026-10-30T22:37:46.223024794Z",
  "refresh_token": "L7dCymZBKqjQkeJ4gOME49m_5DkkkcqOs1OcFASjTeo",
  "refresh_expires_at": "2026-10-31T10:22:46.222671551Z",
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
  "session_id": "69f156c5-db76-4cb2-ac67-ca4f03dcc03f",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk4NjYsImlhdCI6MTc5MzM5ODk2NiwianRpIjoiODAyYjU3ZmYtOTZmMC00MWNiLWIxZmYtZTA3ZWNkNTRlZTlkIiwic2lkIjoiNjlmMTU2YzUtZGI3Ni00Y2IyLWFjNjctY2E0ZjAzZGNjMDNmIn0.J8lvazX2C2rDAZ0KjXmVEyVac_7nRMV6J-s5sZVw8D8",
  "access_expires_at": "2026-10-30T22:37:46.613997973Z",
  "refresh_token": "ytJimOc0sOWpbK_QH3dSuDe9W9q1AtNU2kKYGhrUCDU",
  "refresh_expires_at": "2026-10-31T10:22:46.613620564Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26979"
}
```

```json
{
  "challenge_id": "b1babce6-4640-4369-8879-d64221b545b7",
  "expires_at": "2026-10-30T22:27:46.799401976Z",
  "resend_available_at": "2026-10-30T22:22:47.799401976Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "474193",
  "sent_at": "2026-10-30T22:22:46.80131869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1babce6-4640-4369-8879-d64221b545b7",
  "code": "474193",
  "device_ref": "sandbox-26979"
}
```

```json
{
  "session_id": "bd6e1aeb-9162-45fa-a9f5-6e0d060a7ec0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTg2NywiaWF0IjoxNzkzMzk4OTY3LCJqdGkiOiI3NDAwNTU5My00MWVkLTRkZDAtYmQ1Mi04ZjEwNWZkNzM5MWEiLCJzaWQiOiJiZDZlMWFlYi05MTYyLTQ1ZmEtYTlmNS02ZTBkMDYwYTdlYzAifQ.fmYg7cst_xfVJ8n-dLot4Z12TyKF3XEOdLD-_jRBnwk",
  "access_expires_at": "2026-10-30T22:37:47.012491697Z",
  "refresh_token": "YwMzwdG8TaIcaF_gJ3RXfCE1DPJfTkGOfdtp8o29gTA",
  "refresh_expires_at": "2026-11-29T22:22:47.011953956Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
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
  "last_heartbeat_at": "2026-10-30T22:22:35.490699Z",
  "last_location_at": "2026-10-30T22:22:35.490699Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/handover` → **200**

```json
{
  "command_id": "682bda3a-c5a6-4f82-b7a2-5783373b257b",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:22:35.490699Z",
  "last_location_at": "2026-10-30T22:22:35.490699Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

(the car drives 58 s to the next point)

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:23:45Z",
    "sequence": 1793399025607
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:23:45.623809Z",
  "last_location_at": "2026-10-30T22:23:45.623809Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
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
  "command_id": "4a18e676-db05-4e42-9209-f58c02229275",
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
  "effective_at": "2026-10-30T22:23:46.023883Z",
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T22:14:06.903237Z",
  "last_entries": [
    {
      "order_id": "20da47a9-4809-4a0f-98ac-b93f7562fe01",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T22:14:06.903237Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "020dfcdd-01fa-4884-a11c-2fdf87c71e4c",
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
  "id": "4f3eee56-3493-454c-aee2-fa5d54742533",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:28:46.410728Z",
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
  "command_id": "fa9e8225-eb86-4719-88ef-435bc570c1ec",
  "quote_id": "4f3eee56-3493-454c-aee2-fa5d54742533",
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
    "phone": "+380671115679"
  }
}
```

```json
{
  "id": "6714e1fe-4507-42e5-ab51-7fabf7ae824d",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:23:46.611045Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115679"
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

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "d666159f-6bda-4bea-a1c0-30a7fff1202e"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b1215122-4879-4f91-b94a-42553cdde6ee"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673497845",
  "device_ref": "sandbox-3899"
}
```

```json
{
  "challenge_id": "f05a65a8-2e13-4c37-bd8e-68a6f6beda4b",
  "expires_at": "2026-10-30T22:28:48.416856666Z",
  "resend_available_at": "2026-10-30T22:23:49.416856666Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673497845` → **200**

```json
{
  "phone": "+380673497845",
  "audience": "CLIENT",
  "code": "658040",
  "sent_at": "2026-10-30T22:23:48.419163239Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673877525",
  "device_ref": "sandbox-19205",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d636e285-0a48-4b00-a953-67d4250a31e0",
  "expires_at": "2026-10-30T22:28:49.842664167Z",
  "resend_available_at": "2026-10-30T22:23:50.842664167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673877525` → **200**

```json
{
  "phone": "+380673877525",
  "audience": "CLIENT",
  "code": "242721",
  "sent_at": "2026-10-30T22:23:49.844992776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673877525",
  "device_ref": "sandbox-10412",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "89e278b6-5697-4f07-b2dd-703c0a675b76",
  "expires_at": "2026-10-30T22:28:51.259928675Z",
  "resend_available_at": "2026-10-30T22:23:52.259928675Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673877525` → **200**

```json
{
  "phone": "+380673877525",
  "audience": "CLIENT",
  "code": "807749",
  "sent_at": "2026-10-30T22:23:51.262197513Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677170000",
  "device_ref": "sandbox-769"
}
```

```json
{
  "challenge_id": "29860c99-2e50-4983-afc7-186e502c21ac",
  "expires_at": "2026-10-30T22:28:52.671927616Z",
  "resend_available_at": "2026-10-30T22:23:53.671927616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677170000",
  "device_ref": "sandbox-13881"
}
```

```json
{
  "challenge_id": "19e4fa42-19e4-4fae-bf5e-8012925f49e3",
  "expires_at": "2026-10-30T22:28:54.06758831Z",
  "resend_available_at": "2026-10-30T22:23:55.06758831Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677170000` → **200**

```json
{
  "phone": "+380677170000",
  "audience": "CLIENT",
  "code": "548750",
  "sent_at": "2026-10-30T22:23:54.07013665Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677170000",
  "device_ref": "sandbox-22292",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "82cb5001-7458-4867-aabb-87e9856e7204",
  "expires_at": "2026-10-30T22:28:55.478252261Z",
  "resend_available_at": "2026-10-30T22:23:56.478252261Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677170000` → **200**

```json
{
  "phone": "+380677170000",
  "audience": "CLIENT",
  "code": "702687",
  "sent_at": "2026-10-30T22:23:55.480674895Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677170000",
  "device_ref": "sandbox-28116",
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
  "correlation_id": "f4b04eb6-de4d-48bc-9ba8-888187f64f4c",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000005657"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "9b1ee4ca-4d17-4fb5-838e-5ea707b2eba4"
}
```

`GET /sandbox/v1/otp?phone=%2B442000005657` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120014276"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "0adcfbe9-182e-4c5d-bfa0-df0c3e992a4c"
}
```

`GET /sandbox/v1/otp?phone=%2B37120014276` → **404**

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
  "session_id": "0d277ebc-aea3-4b9f-b18f-eb1d4da053cd",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5MzcsImlhdCI6MTc5MzM5OTAzNywianRpIjoiMGFmODBkMzUtYjgwMC00ZWMxLTlhYWUtZWZhMWUwNzdlYmFiIiwic2lkIjoiMGQyNzdlYmMtYWVhMy00YjlmLWIxOGYtZWIxZDRkYTA1M2NkIn0.pBBc8wpMN81eOj-3SEwbp1AyS2RsYL0T8Sa4sKQIpbQ",
  "access_expires_at": "2026-10-30T22:38:57.791931189Z",
  "refresh_token": "7I_q-6B1_80Ma7REkzQbgqBFp5lJXF8buUzeacrUpeA",
  "refresh_expires_at": "2026-10-31T10:23:57.791547081Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677170000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8962a947-2dab-4bea-9061-72fe11e380d9",
      "challenge_id": "82cb5001-7458-4867-aabb-87e9856e7204",
      "phone": "+380677170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-79fe4cd3-b45c-404a-8890-491f3622a05e",
      "error": null,
      "attempted_at": "2026-10-30T22:23:55.480962Z"
    },
    {
      "id": "ad58e8d6-c357-4d03-a962-309360e2465f",
      "challenge_id": "19e4fa42-19e4-4fae-bf5e-8012925f49e3",
      "phone": "+380677170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-982f84a1-efff-4cc0-ad09-dfb7bd0efeff",
      "error": null,
      "attempted_at": "2026-10-30T22:23:54.070485Z"
    },
    {
      "id": "b8afcad8-dd1b-4232-bf74-b3df46e8adbe",
      "challenge_id": "29860c99-2e50-4983-afc7-186e502c21ac",
      "phone": "+380677170000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T22:23:52.674003Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677170000` → **200**

```json
{
  "phone": "+380677170000",
  "audience": "CLIENT",
  "code": "702687",
  "sent_at": "2026-10-30T22:23:55.480674895Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673877525` → **200**

```json
{
  "deliveries": [
    {
      "id": "7cac1673-e928-4342-9489-3f8df6f3ffce",
      "challenge_id": "89e278b6-5697-4f07-b2dd-703c0a675b76",
      "phone": "+380673877525",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c458b74a-2cba-4f86-92a6-d51faca63d44",
      "error": null,
      "attempted_at": "2026-10-30T22:23:51.262548Z"
    },
    {
      "id": "ea355710-1c0e-447d-80d6-8ed9ac6e65e9",
      "challenge_id": "d636e285-0a48-4b00-a953-67d4250a31e0",
      "phone": "+380673877525",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8d22a4d3-3bea-445a-9772-47e6d287621a",
      "error": null,
      "attempted_at": "2026-10-30T22:23:49.845249Z"
    }
  ]
}
```

Done: SMS to +380673497845; SMS then a call to +380673877525; a failed SMS, two calls and a refused third to +380677170000; +44 and +371 refused.

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
  "session_id": "6df7a7d7-e996-4e62-9288-d37f3b7306e2",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5MzgsImlhdCI6MTc5MzM5OTAzOCwianRpIjoiNGJmNDhlMTMtY2Y3NC00NTdmLThiZDctZGM2ZTAyOTk0Mjk5Iiwic2lkIjoiNmRmN2E3ZDctZTk5Ni00ZTYyLTkyODgtZDM3ZjNiNzMwNmUyIn0.xP5XSTawU1ZqI-VUJkOo6K1uU4xUzvClk6BptiXIr4A",
  "access_expires_at": "2026-10-30T22:38:58.612395572Z",
  "refresh_token": "8rmxFpxFm-EhzZj11kwG3mOJWPl-kXm4IsQISHXd4lM",
  "refresh_expires_at": "2026-10-31T10:23:58.611991563Z",
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
  "session_id": "f5065fb8-125a-43b8-8b98-bd259c0c2bcf",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5MzksImlhdCI6MTc5MzM5OTAzOSwianRpIjoiY2U5ODdiMjQtMzQ1OS00NDhhLTliMjUtMTQ2OTkzZTA3YTg3Iiwic2lkIjoiZjUwNjVmYjgtMTI1YS00M2I4LThiOTgtYmQyNTljMGMyYmNmIn0.c3ajDZdaYjo8lp8lfTfQYCZx-DhbkvqWbeEIde9Aq9s",
  "access_expires_at": "2026-10-30T22:38:59.001056572Z",
  "refresh_token": "ClEAde_xLOcMbbzJVvOmG6NcgGYrrZzA5YG4d4frnis",
  "refresh_expires_at": "2026-10-31T10:23:59.000715738Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
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

`POST /api/admin/v1/staff-extensions/e4e1ad2b-0001-47d7-9e99-3ae4c92e8380` → **200**

```json
{
  "command_id": "05543589-0d6a-4751-8026-564ee68c079e",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "dfc40cb5-9a3e-41ad-91bf-1baeb2c46fe1",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T22:23:59.771978Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T22:23:59.771978Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8db28a5c-df28-4629-ae52-3c0c413f416c",
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
  "id": "887dac74-c4a6-4f2e-963b-8f942b15b583",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:29:00.161684Z",
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
  "command_id": "83e9ab95-65e8-454a-a509-64b8d790b4b6",
  "quote_id": "887dac74-c4a6-4f2e-963b-8f942b15b583",
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
    "phone": "+380675069493"
  }
}
```

```json
{
  "id": "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7",
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
  "created_at": "2026-10-30T22:24:00.362501Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675069493"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4b5372ba-38ef-4a69-a2b4-b035cd6cbef7/calls` → **201**

```json
{
  "command_id": "2bcc9c02-839f-476b-83bd-0701b58ba6e3",
  "to": "CALLER"
}
```

```json
{
  "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "order_ids": [
    "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7"
  ],
  "started_at": "2026-10-30T22:24:00.593042Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4b5372ba-38ef-4a69-a2b4-b035cd6cbef7/calls` → **201**

```json
{
  "command_id": "2bcc9c02-839f-476b-83bd-0701b58ba6e3",
  "to": "CALLER"
}
```

```json
{
  "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "order_ids": [
    "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7"
  ],
  "started_at": "2026-10-30T22:24:00.593042Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675069493",
    "at": "2026-10-30T22:24:00.595375457Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.10050",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "0b8f76b5-12a8-49e7-8c96-19e4292be399"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4b5372ba-38ef-4a69-a2b4-b035cd6cbef7` → **200**

```json
{
  "calls": [
    {
      "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [
        "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7"
      ],
      "started_at": "2026-10-30T22:24:00.593042Z",
      "answered_at": "2026-10-30T22:24:01.057103Z",
      "ended_at": "2026-10-30T22:24:01.075226Z",
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

`GET /api/operator/v1/calls?order_id=4b5372ba-38ef-4a69-a2b4-b035cd6cbef7` → **200**

```json
{
  "calls": [
    {
      "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [
        "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7"
      ],
      "started_at": "2026-10-30T22:24:00.593042Z",
      "answered_at": "2026-10-30T22:24:01.057103Z",
      "ended_at": "2026-10-30T22:24:01.075226Z",
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

`GET /api/operator/v1/calls?order_id=4b5372ba-38ef-4a69-a2b4-b035cd6cbef7` → **200**

```json
{
  "calls": [
    {
      "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [
        "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7"
      ],
      "started_at": "2026-10-30T22:24:00.593042Z",
      "answered_at": "2026-10-30T22:24:01.057103Z",
      "ended_at": "2026-10-30T22:24:01.075226Z",
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

`GET /api/operator/v1/calls?order_id=4b5372ba-38ef-4a69-a2b4-b035cd6cbef7` → **200**

```json
{
  "calls": [
    {
      "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [
        "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7"
      ],
      "started_at": "2026-10-30T22:24:00.593042Z",
      "answered_at": "2026-10-30T22:24:01.057103Z",
      "ended_at": "2026-10-30T22:24:01.075226Z",
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

`GET /api/operator/v1/calls?order_id=4b5372ba-38ef-4a69-a2b4-b035cd6cbef7` → **200**

```json
{
  "calls": [
    {
      "id": "0b8f76b5-12a8-49e7-8c96-19e4292be399",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "order_ids": [
        "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7"
      ],
      "started_at": "2026-10-30T22:24:00.593042Z",
      "answered_at": "2026-10-30T22:24:01.057103Z",
      "ended_at": "2026-10-30T22:24:01.075226Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T22:24:09.775691Z"
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

`GET /api/operator/v1/orders/4b5372ba-38ef-4a69-a2b4-b035cd6cbef7` → **200**

```json
{
  "id": "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7",
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
  "created_at": "2026-10-30T22:24:00.362501Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675069493"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4b5372ba-38ef-4a69-a2b4-b035cd6cbef7/cancel` → **200**

```json
{
  "command_id": "019e176a-cf94-4c0b-95ec-397cea2c3cae",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4b5372ba-38ef-4a69-a2b4-b035cd6cbef7",
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
  "created_at": "2026-10-30T22:24:00.362501Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675069493"
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
  "command_id": "e7af4779-f5be-452c-8804-7ea7e8a61de9",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T22:24:10.481759Z",
  "extension": "101"
}
```

Done: outgoing call 0b8f76b5-12a8-49e7-8c96-19e4292be399 from order 4b5372ba-38ef-4a69-a2b4-b035cd6cbef7, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631257120",
  "device_ref": "sandbox-11512"
}
```

```json
{
  "challenge_id": "2e1a9b63-2a24-4c71-9110-c19f0b930f4b",
  "expires_at": "2026-10-30T22:29:10.682412292Z",
  "resend_available_at": "2026-10-30T22:24:11.682412292Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631257120` → **200**

```json
{
  "phone": "+380631257120",
  "audience": "CLIENT",
  "code": "518502",
  "sent_at": "2026-10-30T22:24:10.684600975Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e1a9b63-2a24-4c71-9110-c19f0b930f4b",
  "code": "518502",
  "device_ref": "sandbox-11512"
}
```

```json
{
  "session_id": "70915bcb-b5fe-4ad9-8cb8-fc861349ce8b",
  "subject": {
    "type": "CLIENT",
    "id": "7317f0f2-8e88-4d0b-8f51-21783aad3681"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzE3ZjBmMi04ZTg4LTRkMGItOGY1MS0yMTc4M2FhZDM2ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTUwLCJpYXQiOjE3OTMzOTkwNTAsImp0aSI6IjgzMmVjNGI1LTM1MWQtNGIzNS1hYmJlLTQ2ODFiNjFmYThjZCIsInNpZCI6IjcwOTE1YmNiLWI1ZmUtNGFkOS04Y2I4LWZjODYxMzQ5Y2U4YiJ9.oOp-vR8yCKcZvMCjcIpY8AbDN1oiXtkr_jfHLLUtbdc",
  "access_expires_at": "2026-10-30T22:39:10.902873848Z",
  "refresh_token": "xuELxGhSV4xDEd1IwZ_5X6w6P4VAG7I_Rpp89SDLRaA",
  "refresh_expires_at": "2026-11-29T22:24:10.902551492Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7317f0f2-8e88-4d0b-8f51-21783aad3681",
  "session_id": "70915bcb-b5fe-4ad9-8cb8-fc861349ce8b",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631257120",
  "device_ref": "sandbox-9757"
}
```

```json
{
  "challenge_id": "7c112f50-772b-40ae-9e67-e152f3a890d3",
  "expires_at": "2026-10-30T22:29:13.269347053Z",
  "resend_available_at": "2026-10-30T22:24:14.269347053Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631257120` → **200**

```json
{
  "phone": "+380631257120",
  "audience": "CLIENT",
  "code": "618456",
  "sent_at": "2026-10-30T22:24:13.271690519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c112f50-772b-40ae-9e67-e152f3a890d3",
  "code": "618456",
  "device_ref": "sandbox-9757"
}
```

```json
{
  "session_id": "e2e42719-2137-4ffe-bb93-3949f91352c9",
  "subject": {
    "type": "CLIENT",
    "id": "7317f0f2-8e88-4d0b-8f51-21783aad3681"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzE3ZjBmMi04ZTg4LTRkMGItOGY1MS0yMTc4M2FhZDM2ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTUzLCJpYXQiOjE3OTMzOTkwNTMsImp0aSI6IjVlNzM2NjlmLTM1YTAtNGRmNi04MGE4LTRkMTYyZjRhNTIwMSIsInNpZCI6ImUyZTQyNzE5LTIxMzctNGZmZS1iYjkzLTM5NDlmOTEzNTJjOSJ9.ogAUUe92INJg2QpnClOV3Vt2O3-lXJL13Zau-dkwKSQ",
  "access_expires_at": "2026-10-30T22:39:13.480118521Z",
  "refresh_token": "M0zz6PcwflR8B8VgaBgzWJ5Yn4KWUaXmfKThrX7uVWk",
  "refresh_expires_at": "2026-11-29T22:24:13.479757376Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "003ec75f-1d76-48e6-89b1-dd296e0dac13",
  "expires_at": "2026-10-30T22:29:15.669586778Z",
  "resend_available_at": "2026-10-30T22:24:16.669586778Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631257120` → **200**

```json
{
  "phone": "+380631257120",
  "audience": "CLIENT",
  "code": "827986",
  "sent_at": "2026-10-30T22:24:15.671160933Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638190643"
}
```

```json
{
  "challenge_id": "c24be556-03b9-4f22-921f-b361dd9cddb9",
  "expires_at": "2026-10-30T22:29:15.873645217Z",
  "resend_available_at": "2026-10-30T22:24:16.873645217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638190643` → **200**

```json
{
  "phone": "+380638190643",
  "audience": "CLIENT",
  "code": "149937",
  "sent_at": "2026-10-30T22:24:15.87584824Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "5bb74a83-ae52-466b-9133-89441413227d",
  "current_challenge_id": "003ec75f-1d76-48e6-89b1-dd296e0dac13",
  "current_code": "000000",
  "new_challenge_id": "c24be556-03b9-4f22-921f-b361dd9cddb9",
  "new_code": "149937"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "9cd5d29f-fe6c-403e-863d-11ce9447628d"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "331de394-4249-4ec6-a03a-d2722cd04c78",
  "current_challenge_id": "003ec75f-1d76-48e6-89b1-dd296e0dac13",
  "current_code": "827986",
  "new_challenge_id": "c24be556-03b9-4f22-921f-b361dd9cddb9",
  "new_code": "149937"
}
```

```json
{
  "subject_id": "7317f0f2-8e88-4d0b-8f51-21783aad3681",
  "phone": "+380638190643",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7317f0f2-8e88-4d0b-8f51-21783aad3681",
  "session_id": "70915bcb-b5fe-4ad9-8cb8-fc861349ce8b",
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
  "correlation_id": "24f80d5c-3772-4857-b0f4-4060259811e2"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638190643",
  "device_ref": "sandbox-28151"
}
```

```json
{
  "challenge_id": "72ba4a5c-5401-4d93-bd27-baeefd68c385",
  "expires_at": "2026-10-30T22:29:18.874772697Z",
  "resend_available_at": "2026-10-30T22:24:19.874772697Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638190643` → **200**

```json
{
  "phone": "+380638190643",
  "audience": "CLIENT",
  "code": "307715",
  "sent_at": "2026-10-30T22:24:18.876515201Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72ba4a5c-5401-4d93-bd27-baeefd68c385",
  "code": "307715",
  "device_ref": "sandbox-28151"
}
```

```json
{
  "session_id": "6bc36d27-b012-4ea7-93e5-e98baa39e7ba",
  "subject": {
    "type": "CLIENT",
    "id": "7317f0f2-8e88-4d0b-8f51-21783aad3681"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzE3ZjBmMi04ZTg4LTRkMGItOGY1MS0yMTc4M2FhZDM2ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTU5LCJpYXQiOjE3OTMzOTkwNTksImp0aSI6IjFhYTQ4ZDkwLTRlMGEtNDg3NC05YmFlLWRjZDUyMDJkNThiMiIsInNpZCI6IjZiYzM2ZDI3LWIwMTItNGVhNy05M2U1LWU5OGJhYTM5ZTdiYSJ9.A-5R43hQUe0K6rT1jZ5qYIKRacYDkQpSBtQY17CY-q0",
  "access_expires_at": "2026-10-30T22:39:19.083460961Z",
  "refresh_token": "4-JAYzrnVq6KIHbLojbcqNfPBavjLqFEnM2i8Gzf3rM",
  "refresh_expires_at": "2026-11-29T22:24:19.083031313Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7317f0f2-8e88-4d0b-8f51-21783aad3681",
  "session_id": "6bc36d27-b012-4ea7-93e5-e98baa39e7ba",
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
  "session_id": "ed66a2b4-289d-4a15-ba5d-b115d08b9607",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5NTksImlhdCI6MTc5MzM5OTA1OSwianRpIjoiYTc2MThhMzEtYjJlMS00NjM4LTgyN2YtNDZkNjZlZGYwZDFkIiwic2lkIjoiZWQ2NmEyYjQtMjg5ZC00YTE1LWJhNWQtYjExNWQwOGI5NjA3In0.1MoIrvh7tiMuBnzpIaR5DEe7WOcity_F3K6YkhOLKvY",
  "access_expires_at": "2026-10-30T22:39:19.658199319Z",
  "refresh_token": "WURgqtoX6HOyOZw7RtjxzW04516-sR4A-Eka-RBV0Mk",
  "refresh_expires_at": "2026-10-31T10:24:19.657489588Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/7317f0f2-8e88-4d0b-8f51-21783aad3681` → **200**

```json
{
  "client": {
    "id": "7317f0f2-8e88-4d0b-8f51-21783aad3681",
    "phone": "+380638190643",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T22:24:10.901394Z",
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

`POST /api/admin/v1/clients/7317f0f2-8e88-4d0b-8f51-21783aad3681/phone/new-code` → **201**

```json
{
  "phone": "+380631983815"
}
```

```json
{
  "challenge_id": "851e1393-0675-4cc6-8ddb-2d6f82e05480",
  "expires_at": "2026-10-30T22:29:20.063290172Z",
  "resend_available_at": "2026-10-30T22:24:21.063290172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631983815` → **200**

```json
{
  "phone": "+380631983815",
  "audience": "CLIENT",
  "code": "646115",
  "sent_at": "2026-10-30T22:24:20.06505239Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/7317f0f2-8e88-4d0b-8f51-21783aad3681/phone` → **422**

```json
{
  "command_id": "927c7917-2217-4a1a-bd25-6afe915a47fd",
  "expected_version": 3,
  "new_challenge_id": "851e1393-0675-4cc6-8ddb-2d6f82e05480",
  "new_code": "646116",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/7317f0f2-8e88-4d0b-8f51-21783aad3681/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "92b5e192-9510-4c87-a363-dcf707f93066"
}
```

`POST /api/admin/v1/clients/7317f0f2-8e88-4d0b-8f51-21783aad3681/phone` → **400**

```json
{
  "command_id": "8d815d4f-fb5d-462b-99bd-56d2674098c2",
  "expected_version": 3,
  "new_challenge_id": "851e1393-0675-4cc6-8ddb-2d6f82e05480",
  "new_code": "646115",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7317f0f2-8e88-4d0b-8f51-21783aad3681/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c3ada7b9-3baa-4aaa-bcc6-6ee32ffdcd1c",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/7317f0f2-8e88-4d0b-8f51-21783aad3681/phone` → **200**

```json
{
  "command_id": "1137d82a-bf86-4b54-923d-27e1ec7babae",
  "expected_version": 3,
  "new_challenge_id": "851e1393-0675-4cc6-8ddb-2d6f82e05480",
  "new_code": "646115",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "7317f0f2-8e88-4d0b-8f51-21783aad3681",
  "phone": "+380631983815",
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
  "correlation_id": "274582d9-879c-4782-b23e-cc12311f619d"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380631983815",
  "device_ref": "sandbox-17361"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "416678c5-d0d1-4051-aea0-9fad6439f2cc",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631983815",
  "device_ref": "sandbox-17361"
}
```

```json
{
  "challenge_id": "6b5f3930-1af9-4ea5-b676-c555c33a5e08",
  "expires_at": "2026-10-30T22:29:22.248439703Z",
  "resend_available_at": "2026-10-30T22:24:23.248439703Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631983815` → **200**

```json
{
  "phone": "+380631983815",
  "audience": "CLIENT",
  "code": "835329",
  "sent_at": "2026-10-30T22:24:22.250358266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b5f3930-1af9-4ea5-b676-c555c33a5e08",
  "code": "835329",
  "device_ref": "sandbox-17361"
}
```

```json
{
  "session_id": "a2a3c811-2467-4567-a56c-6ab586313c13",
  "subject": {
    "type": "CLIENT",
    "id": "7317f0f2-8e88-4d0b-8f51-21783aad3681"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzE3ZjBmMi04ZTg4LTRkMGItOGY1MS0yMTc4M2FhZDM2ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTYyLCJpYXQiOjE3OTMzOTkwNjIsImp0aSI6IjRmM2U1NjliLWJhNGMtNDk4ZS05YWI3LTc1ZmUzNmI1ZmZlMyIsInNpZCI6ImEyYTNjODExLTI0NjctNDU2Ny1hNTZjLTZhYjU4NjMxM2MxMyJ9.jdSL_jdBCynyfIpP0KGO3nqYggPFMUVHdsM7cZAyFFw",
  "access_expires_at": "2026-10-30T22:39:22.461242407Z",
  "refresh_token": "8_yFrhNPAWNDC-I0QiRPe0paLG8uN-Q3a-fxC133yeE",
  "refresh_expires_at": "2026-11-29T22:24:22.460841432Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7317f0f2-8e88-4d0b-8f51-21783aad3681",
  "session_id": "a2a3c811-2467-4567-a56c-6ab586313c13",
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
  "phone": "+380635967355",
  "device_ref": "sandbox-22944"
}
```

```json
{
  "challenge_id": "3954ac81-ec20-49a0-8bb8-a6e9bea6277c",
  "expires_at": "2026-10-30T22:29:22.897704604Z",
  "resend_available_at": "2026-10-30T22:24:23.897704604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635967355` → **200**

```json
{
  "phone": "+380635967355",
  "audience": "CLIENT",
  "code": "709519",
  "sent_at": "2026-10-30T22:24:22.899728331Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3954ac81-ec20-49a0-8bb8-a6e9bea6277c",
  "code": "709519",
  "device_ref": "sandbox-22944"
}
```

```json
{
  "session_id": "1bb29f5c-eac3-4585-8f73-3f3957977cd8",
  "subject": {
    "type": "CLIENT",
    "id": "45e87113-52c5-46b9-9694-eceb7c33ac54"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NWU4NzExMy01MmM1LTQ2YjktOTY5NC1lY2ViN2MzM2FjNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTYzLCJpYXQiOjE3OTMzOTkwNjMsImp0aSI6IjdlNmVkMjhhLTQ1Y2YtNDQwMy1hMzYzLTI0MjhhODNmYWEyZiIsInNpZCI6IjFiYjI5ZjVjLWVhYzMtNDU4NS04ZjczLTNmMzk1Nzk3N2NkOCJ9.feBNFfwm8LMkAqrNdhSzYxat5HUHxBIjPGbmNFIdkhM",
  "access_expires_at": "2026-10-30T22:39:23.11586464Z",
  "refresh_token": "OvvKnp9JCKjyvU2oHUATevSljVk70wQ8tBvHBLulo4s",
  "refresh_expires_at": "2026-11-29T22:24:23.115492599Z",
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
  "session_id": "671dbba5-0e5d-4cf3-af0e-8bfcee230016",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5NjMsImlhdCI6MTc5MzM5OTA2MywianRpIjoiYmIwNGYxN2MtYmQ5ZS00NjNjLTkzMWQtYjZiN2JkOTM5NWIzIiwic2lkIjoiNjcxZGJiYTUtMGU1ZC00Y2YzLWFmMGUtOGJmY2VlMjMwMDE2In0.dsCnN_RC2RxbpQuSnXP1nsr6feOQasHn_mg1LSkU9sY",
  "access_expires_at": "2026-10-30T22:39:23.91155158Z",
  "refresh_token": "dEweiTWcyYOOXpR8HFnw9pEhVyjkWLzM0gDx5U_ypzw",
  "refresh_expires_at": "2026-10-31T10:24:23.911192398Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635967355` → **200**

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
  "correlation_id": "d194467c-d58a-486e-8d1b-7bfdaeb2bb78"
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
  "session_id": "4f380f4f-1cb3-4bf2-94e6-41a98013bdaa",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5NjQsImlhdCI6MTc5MzM5OTA2NCwianRpIjoiZDJiNjI0MzktNzg0MC00NDkwLWE5YTctNGNhYWM0OTUwNjhkIiwic2lkIjoiNGYzODBmNGYtMWNiMy00YmYyLTk0ZTYtNDFhOTgwMTNiZGFhIn0.-Phe1iB16_xTdVNzfa_bUxJEJblDsfYtHTO-gLyjvFg",
  "access_expires_at": "2026-10-30T22:39:24.705800326Z",
  "refresh_token": "R19dOmKMlbziicYJM7pdqkURaDvLAYCuP7i-BFvB2CE",
  "refresh_expires_at": "2026-10-31T10:24:24.705409086Z",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T22:10:12.885879Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "df87d72b-cf37-4c79-96f2-891610dd7d66",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T22:24:25.09538068Z"
}
```

## The rider books the airport for 2026-10-31T01:24:24Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600405730",
  "device_ref": "sandbox-21970"
}
```

```json
{
  "challenge_id": "62042d62-5b21-469f-a27e-ef520d937df6",
  "expires_at": "2026-10-30T22:29:25.291157408Z",
  "resend_available_at": "2026-10-30T22:24:26.291157408Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600405730` → **200**

```json
{
  "phone": "+48600405730",
  "audience": "CLIENT",
  "code": "627698",
  "sent_at": "2026-10-30T22:24:25.293033057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62042d62-5b21-469f-a27e-ef520d937df6",
  "code": "627698",
  "device_ref": "sandbox-21970"
}
```

```json
{
  "session_id": "794a8ab3-071d-4b46-912f-4e933d96b755",
  "subject": {
    "type": "CLIENT",
    "id": "9801ae03-2c1b-45bf-8c4c-2064733bdb43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODAxYWUwMy0yYzFiLTQ1YmYtOGM0Yy0yMDY0NzMzYmRiNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTY1LCJpYXQiOjE3OTMzOTkwNjUsImp0aSI6IjA0NjA0ZDFhLTI5ZDktNDg2MS05OGY0LTBiODIyZmYyYmYwNiIsInNpZCI6Ijc5NGE4YWIzLTA3MWQtNGI0Ni05MTJmLTRlOTMzZDk2Yjc1NSJ9.g7oRFrWrUFMGOk-fDnan8ocOrsp_213yemR-CtKynLs",
  "access_expires_at": "2026-10-30T22:39:25.498967895Z",
  "refresh_token": "ZLSfbXsn11i634mtTaWFMZBzfZ39SSHg1Jw7eHjv8HY",
  "refresh_expires_at": "2026-11-29T22:24:25.498617262Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fe8aa0c6-8126-4d17-8b5d-986f45e0c822",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-31T01:24:24Z"
}
```

```json
{
  "id": "e98e3799-e347-426e-a598-25424fa55f03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:29:25.695857Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T01:24:24Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "60768404-f521-4f1c-bcac-53289e4bfe5e",
  "quote_id": "e98e3799-e347-426e-a598-25424fa55f03",
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
  "pickup_at": "2026-10-31T01:24:24Z"
}
```

```json
{
  "id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9801ae03-2c1b-45bf-8c4c-2064733bdb43",
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
  "created_at": "2026-10-30T22:24:25.895516Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T01:24:24Z",
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
  "device_ref": "sandbox-4624"
}
```

```json
{
  "challenge_id": "5893427f-f53a-44f4-b184-c909f66ec8a7",
  "expires_at": "2026-10-30T22:29:26.104275202Z",
  "resend_available_at": "2026-10-30T22:24:27.104275202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "600669",
  "sent_at": "2026-10-30T22:24:26.106040329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5893427f-f53a-44f4-b184-c909f66ec8a7",
  "code": "600669",
  "device_ref": "sandbox-4624"
}
```

```json
{
  "session_id": "07a148d1-6bf9-4682-93e5-3ec9f0300714",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTk2NiwiaWF0IjoxNzkzMzk5MDY2LCJqdGkiOiI3N2YzNDE3ZS1hZDFjLTQzYmEtODA3MS1jNjQxMjM0MzQ0MWMiLCJzaWQiOiIwN2ExNDhkMS02YmY5LTQ2ODItOTNlNS0zZWM5ZjAzMDA3MTQifQ.priqpA8rrthagc-ONApDWM_U_82CfgFGIDZGe3qglS4",
  "access_expires_at": "2026-10-30T22:39:26.318615523Z",
  "refresh_token": "Co-hrdLHHGEJMry50LKqmmRzOx4rrvwMLaBTc9gqKGg",
  "refresh_expires_at": "2026-11-29T22:24:26.318243646Z",
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
  "command_id": "6f9e0f15-138d-4c5f-a315-634e465cbec4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:24:26Z",
    "sequence": 1793399066704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c971b96-d3a2-4b4e-b476-8be3d4b147a1",
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
  "last_heartbeat_at": "2026-10-30T22:24:26.719554Z",
  "last_location_at": "2026-10-30T22:24:26.719554Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
      "short_number": 32,
      "pickup_at": "2026-10-31T01:24:24Z",
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

`POST /api/driver/v1/preorders/3a2c4aac-a203-49f3-9877-1b7fd157d179/reserve` → **200**

```json
{
  "command_id": "e2111873-5e29-4f86-8d72-7361bee6cd66"
}
```

```json
{
  "id": "e9941be2-f0d0-49a7-9a9f-5bdac7fbd684",
  "state": "RESERVED",
  "order": {
    "order_id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
    "short_number": 32,
    "pickup_at": "2026-10-31T01:24:24Z",
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
  "reserved_at": "2026-10-30T22:24:27.105993Z",
  "confirm_from": "2026-10-31T00:54:24Z",
  "confirm_until": "2026-10-31T01:04:24Z",
  "drop_until": "2026-10-31T00:24:24Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "e9941be2-f0d0-49a7-9a9f-5bdac7fbd684",
      "state": "RESERVED",
      "order": {
        "order_id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
        "short_number": 32,
        "pickup_at": "2026-10-31T01:24:24Z",
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
      "reserved_at": "2026-10-30T22:24:27.105993Z",
      "confirm_from": "2026-10-31T00:54:24Z",
      "confirm_until": "2026-10-31T01:04:24Z",
      "drop_until": "2026-10-31T00:24:24Z"
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
      "id": "e9941be2-f0d0-49a7-9a9f-5bdac7fbd684",
      "state": "RESERVED",
      "order": {
        "order_id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
        "short_number": 32,
        "pickup_at": "2026-10-31T01:24:24Z",
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
      "reserved_at": "2026-10-30T22:24:27.105993Z",
      "confirm_from": "2026-10-31T00:54:24Z",
      "confirm_until": "2026-10-31T01:04:24Z",
      "drop_until": "2026-10-31T00:24:24Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/e9941be2-f0d0-49a7-9a9f-5bdac7fbd684/confirm` → **409**

```json
{
  "command_id": "fbd18401-6391-4e6d-bc93-f3cffc8f4933"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/e9941be2-f0d0-49a7-9a9f-5bdac7fbd684/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9f56e0c5-0913-45a2-a5a8-74c4bcbfe4a9"
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
  "session_id": "f30d7de7-f8bb-4760-a93e-ec6e2c26b6bd",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5NjgsImlhdCI6MTc5MzM5OTA2OCwianRpIjoiNTdkY2U2YzEtZmNkYi00NjQ2LTgxMmItZGRiODI4YWUyN2MxIiwic2lkIjoiZjMwZDdkZTctZjhiYi00NzYwLWE5M2UtZWM2ZTJjMjZiNmJkIn0.VUHDdod_VSvOBD0EORsxDteG5bnDiG4az3bajThqyd4",
  "access_expires_at": "2026-10-30T22:39:28.084292337Z",
  "refresh_token": "dLK0BkbYkoqCngBWjUMLhq_X6f6HlqAXdTbwNgz-Eoo",
  "refresh_expires_at": "2026-10-31T10:24:28.083916591Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3a2c4aac-a203-49f3-9877-1b7fd157d179` → **200**

```json
{
  "id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9801ae03-2c1b-45bf-8c4c-2064733bdb43",
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
  "created_at": "2026-10-30T22:24:25.895516Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-31T01:24:24Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "e9941be2-f0d0-49a7-9a9f-5bdac7fbd684",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T22:24:27.105993Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3a2c4aac-a203-49f3-9877-1b7fd157d179/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T22:24:25.896284Z",
      "actor": {
        "type": "CLIENT",
        "id": "9801ae03-2c1b-45bf-8c4c-2064733bdb43",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
        "preorder": true,
        "quote_id": "e98e3799-e347-426e-a598-25424fa55f03",
        "pickup_at": "2026-10-31T01:24:24Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "8ad6391b-456b-431c-97fd-a30746a6455e"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T22:24:27.106812Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3a2c4aac-a203-49f3-9877-1b7fd157d179",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "e9941be2-f0d0-49a7-9a9f-5bdac7fbd684"
      },
      "correlation_id": "d1dfc818-f023-4541-9138-5df531c2bfe3"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 3a2c4aac-a203-49f3-9877-1b7fd157d179, reservation e9941be2-f0d0-49a7-9a9f-5bdac7fbd684.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17357"
}
```

```json
{
  "challenge_id": "d8f981a8-1046-4213-a2b5-c8cfa3e28168",
  "expires_at": "2026-10-30T22:29:28.688703301Z",
  "resend_available_at": "2026-10-30T22:24:29.688703301Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "121837",
  "sent_at": "2026-10-30T22:24:28.690724584Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8f981a8-1046-4213-a2b5-c8cfa3e28168",
  "code": "121837",
  "device_ref": "sandbox-17357"
}
```

```json
{
  "session_id": "a2ad9e7c-157a-4258-83f5-a6f6071182da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTk2OCwiaWF0IjoxNzkzMzk5MDY4LCJqdGkiOiJkYWNlZTc1ZC0wNmU2LTRhNzItYmUxZC1mMTNkNzRmNmQ3NjMiLCJzaWQiOiJhMmFkOWU3Yy0xNTdhLTQyNTgtODNmNS1hNmY2MDcxMTgyZGEifQ.n1o5zdwE4UdglrpJMzCmVKjprPpE0u-F7bai6wBwkNc",
  "access_expires_at": "2026-10-30T22:39:28.902914276Z",
  "refresh_token": "4Gop7lDEphcDHedDSpL8EpHaw6Zg2Sc-k84qyndpoYg",
  "refresh_expires_at": "2026-11-29T22:24:28.902516255Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:23:45.623809Z",
  "last_location_at": "2026-10-30T22:23:45.623809Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/handover` → **200**

```json
{
  "command_id": "bb4f74ba-05a6-4422-9906-040d99d804d5",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:23:45.623809Z",
  "last_location_at": "2026-10-30T22:23:45.623809Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:24:29Z",
    "sequence": 1793399069484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:24:29.499794Z",
  "last_location_at": "2026-10-30T22:24:29.499794Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672132899",
  "device_ref": "sandbox-9188"
}
```

```json
{
  "challenge_id": "0a50a6dd-2b41-4c0d-8dd4-b0b51ce63d6a",
  "expires_at": "2026-10-30T22:29:29.685700377Z",
  "resend_available_at": "2026-10-30T22:24:30.685700377Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672132899` → **200**

```json
{
  "phone": "+380672132899",
  "audience": "CLIENT",
  "code": "129863",
  "sent_at": "2026-10-30T22:24:29.687929739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a50a6dd-2b41-4c0d-8dd4-b0b51ce63d6a",
  "code": "129863",
  "device_ref": "sandbox-9188"
}
```

```json
{
  "session_id": "f8257d49-6b1e-4b87-abc6-864bd1bf1876",
  "subject": {
    "type": "CLIENT",
    "id": "13c72b92-3835-44f3-9691-b4a14c9fecc3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxM2M3MmI5Mi0zODM1LTQ0ZjMtOTY5MS1iNGExNGM5ZmVjYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTY5LCJpYXQiOjE3OTMzOTkwNjksImp0aSI6IjZkNzc4YTA5LTg1NzEtNDkzZC1iZjNhLWNjOWNkM2VhMzY4MyIsInNpZCI6ImY4MjU3ZDQ5LTZiMWUtNGI4Ny1hYmM2LTg2NGJkMWJmMTg3NiJ9.QKJ8uJKjJUkkAQn3sLuPMGIpKJ_wtQPYUztZc49DcqQ",
  "access_expires_at": "2026-10-30T22:39:29.897234449Z",
  "refresh_token": "wME_osZsVoLWc2NS2GVSprUcey8QsMfsmUPRAhQrHP8",
  "refresh_expires_at": "2026-11-29T22:24:29.896804587Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9c7e0e5-00b8-492e-93b8-e511dfa44793",
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
  "id": "b174690e-dd71-4e7b-bf9b-c18c1c2474d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:29:30.097254Z",
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
  "command_id": "846ec175-b284-4eeb-b026-440f4f2f2624",
  "quote_id": "b174690e-dd71-4e7b-bf9b-c18c1c2474d3",
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
  "id": "53fcaa32-e060-49c6-978f-2a40249c7f60",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13c72b92-3835-44f3-9691-b4a14c9fecc3",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T22:24:30.29655Z",
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
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "663f8856-7985-4e47-9db6-5878e59cd0a1"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b2c250c7-45e3-4e28-855b-9f8acfc311c9"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: reassignment-push

## Andrii (200 m) and Oleh (600 m) are online; a rider with the app orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20741"
}
```

```json
{
  "challenge_id": "85373e65-6da4-4af1-bb49-46b64f2ff057",
  "expires_at": "2026-10-30T22:29:30.902018917Z",
  "resend_available_at": "2026-10-30T22:24:31.902018917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "298579",
  "sent_at": "2026-10-30T22:24:30.903896679Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85373e65-6da4-4af1-bb49-46b64f2ff057",
  "code": "298579",
  "device_ref": "sandbox-20741"
}
```

```json
{
  "session_id": "2bfd334a-d629-44b7-93b8-538aebafa916",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTk3MSwiaWF0IjoxNzkzMzk5MDcxLCJqdGkiOiJlODMzMjkwYi02Nzk4LTQzNjgtOGRmNi01MmNhNTc2YTIzYmEiLCJzaWQiOiIyYmZkMzM0YS1kNjI5LTQ0YjctOTNiOC01MzhhZWJhZmE5MTYifQ.hKd1nLHjeO2Wn9Mv_Yfz_h1Q3XRoL1DYUlRQu8kv1os",
  "access_expires_at": "2026-10-30T22:39:31.130301819Z",
  "refresh_token": "Imy8lgo2WeLgTuWpF6kAzlLNyJ8E5E64Y5hWMyYPqek",
  "refresh_expires_at": "2026-11-29T22:24:31.129939002Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:24:29.499794Z",
  "last_location_at": "2026-10-30T22:24:29.499794Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/close` → **409**

```json
{
  "command_id": "0617d013-0af6-4622-ab40-c48e8236b9ec",
  "expected_version": 3
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "324ea575-105b-4ee7-b9bc-40011a2586bf"
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
  "session_id": "9d6fb229-d140-4eac-a98b-6370425a9484",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5NzEsImlhdCI6MTc5MzM5OTA3MSwianRpIjoiNjIxODBlZjQtYzdkYi00MGQ0LThmNWQtNGU4MTZiMGNmMWVjIiwic2lkIjoiOWQ2ZmIyMjktZDE0MC00ZWFjLWE5OGItNjM3MDQyNWE5NDg0In0.0oO2NXH_Wpc4QU0rJw_0QrzOiwEq_ztmR8S8JiThaoo",
  "access_expires_at": "2026-10-30T22:39:31.935748933Z",
  "refresh_token": "m5HMyL8pSB4ZM-Rs9ZdoshXElSNu2F3j7mQzDb6cNCY",
  "refresh_expires_at": "2026-10-31T10:24:31.935400818Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a9a6d3ae-afab-4764-90cf-bf9847157d99",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "43d0d7b7-6521-4604-97c4-15df9a47f94c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:32.141741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43d0d7b7-6521-4604-97c4-15df9a47f94c` → **200**

```json
{
  "id": "43d0d7b7-6521-4604-97c4-15df9a47f94c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:32.141741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43d0d7b7-6521-4604-97c4-15df9a47f94c` → **200**

```json
{
  "id": "43d0d7b7-6521-4604-97c4-15df9a47f94c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:32.141741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43d0d7b7-6521-4604-97c4-15df9a47f94c` → **200**

```json
{
  "id": "43d0d7b7-6521-4604-97c4-15df9a47f94c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:32.141741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43d0d7b7-6521-4604-97c4-15df9a47f94c` → **200**

```json
{
  "id": "43d0d7b7-6521-4604-97c4-15df9a47f94c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 1,
  "error": null,
  "created_at": "2026-10-30T22:24:32.141741Z",
  "ready_at": "2026-10-30T22:24:34.87673Z",
  "expires_at": "2026-10-31T22:24:34.87673Z"
}
```

`GET /api/admin/v1/reports/exports/43d0d7b7-6521-4604-97c4-15df9a47f94c/file` → **200**, 2 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
total,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1b863821-dfb2-44be-9b8d-d1b5c6ab232c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "43fcdc89-8269-440e-8cc9-97541e8800bc",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:36.123526Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43fcdc89-8269-440e-8cc9-97541e8800bc` → **200**

```json
{
  "id": "43fcdc89-8269-440e-8cc9-97541e8800bc",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:36.123526Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43fcdc89-8269-440e-8cc9-97541e8800bc` → **200**

```json
{
  "id": "43fcdc89-8269-440e-8cc9-97541e8800bc",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:36.123526Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43fcdc89-8269-440e-8cc9-97541e8800bc` → **200**

```json
{
  "id": "43fcdc89-8269-440e-8cc9-97541e8800bc",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T22:24:36.123526Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/43fcdc89-8269-440e-8cc9-97541e8800bc` → **200**

```json
{
  "id": "43fcdc89-8269-440e-8cc9-97541e8800bc",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 1,
  "error": null,
  "created_at": "2026-10-30T22:24:36.123526Z",
  "ready_at": "2026-10-30T22:24:39.882903Z",
  "expires_at": "2026-10-31T22:24:39.882903Z"
}
```

`GET /api/admin/v1/reports/exports/43fcdc89-8269-440e-8cc9-97541e8800bc/file` → **200**, 2 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
total,UAH,0,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/76533121-d8bc-48e5-903f-04143c543416` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/76533121-d8bc-48e5-903f-04143c543416",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f7e91cec-152d-49c5-b6f4-8006fe75151f"
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
  "session_id": "0518934e-bd3a-40b5-be8f-48d393bcbbee",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5ODAsImlhdCI6MTc5MzM5OTA4MCwianRpIjoiNDg3Y2FhY2YtMDZlNS00NjIwLWExOWQtMjMxYjg3ZDEzZjIyIiwic2lkIjoiMDUxODkzNGUtYmQzYS00MGI1LWJlOGYtNDhkMzkzYmNiYmVlIn0.SejWAp8IB7-3SPdp0ufksmLs6PfXe-U5xNW5dcd1WT0",
  "access_expires_at": "2026-10-30T22:39:40.55261467Z",
  "refresh_token": "yJujsUUo3UcYuStmEM1EANepIyXw6LoscIcwftogqdk",
  "refresh_expires_at": "2026-10-31T10:24:40.552258292Z",
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
  "command_id": "4ee29c62-571a-4d2b-b7f6-160993b4a8eb",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T22:24:40.948224337Z"
}
```

`POST /sandbox/v1/retention/fixtures/dad14d87-42b8-4bc2-9fc8-4b9ef3dc0567` → **200**

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

`GET /sandbox/v1/retention/fixtures/dad14d87-42b8-4bc2-9fc8-4b9ef3dc0567` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/dad14d87-42b8-4bc2-9fc8-4b9ef3dc0567` → **204**

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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T22:24:40.948224Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "bd24c2e6-b679-4cba-9d2c-76e6788aa22a",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T22:24:41.432268227Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8549"
}
```

```json
{
  "challenge_id": "b973386e-2dde-4887-beb3-dcf5c1aa22eb",
  "expires_at": "2026-10-30T22:29:41.632643618Z",
  "resend_available_at": "2026-10-30T22:24:42.632643618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "423657",
  "sent_at": "2026-10-30T22:24:41.634509146Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b973386e-2dde-4887-beb3-dcf5c1aa22eb",
  "code": "423657",
  "device_ref": "sandbox-8549"
}
```

```json
{
  "session_id": "67f0fe2f-0133-4b88-b622-cfa25477107d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTk4MSwiaWF0IjoxNzkzMzk5MDgxLCJqdGkiOiI1MzY3Yjk2ZC02MjAzLTRmNGYtOWQ3OS1jNzk0YTgzZjBkZjIiLCJzaWQiOiI2N2YwZmUyZi0wMTMzLTRiODgtYjYyMi1jZmEyNTQ3NzEwN2QifQ.tmyF3jVySrRT-mlcH8iZpjXUNhbI_8N8AvY0Fq8uMaY",
  "access_expires_at": "2026-10-30T22:39:41.841652723Z",
  "refresh_token": "47APoLv3XtpLmJgvBK-X1MButLcAE6UY5oUPhrSCMkA",
  "refresh_expires_at": "2026-11-29T22:24:41.841236961Z",
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
  "command_id": "6d5cacc4-01a7-460d-8518-f9f0724e12b5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:24:42Z",
    "sequence": 1793399082417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df138355-f72c-42ec-8239-b8c6da3290ef",
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
  "last_heartbeat_at": "2026-10-30T22:24:42.431438Z",
  "last_location_at": "2026-10-30T22:24:42.431438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "449e0916-faf3-4b86-8035-6deb5af53760",
  "points": [
    {
      "sequence": 1793399084629,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T22:23:44Z"
    },
    {
      "sequence": 1793399084635,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T22:24:44Z"
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
  "session_id": "042aa606-1c26-46db-9392-b5f1f75fbafa",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5ODUsImlhdCI6MTc5MzM5OTA4NSwianRpIjoiMDg5Zjg5YzktODE2ZS00NjViLTkxMTYtNGU0ZmIxMjVmMWU4Iiwic2lkIjoiMDQyYWE2MDYtMWMyNi00NmRiLTkzOTItYjVmMWY3NWZiYWZhIn0.0Dtp5nQOnZ77xFWaJQmooybgEXvEFXIJ0Sq4mt4C240",
  "access_expires_at": "2026-10-30T22:39:45.064311648Z",
  "refresh_token": "28WCdpDYCyEhB-DTjhKcP7A-TGEdRLvKZUiVjVKdR3I",
  "refresh_expires_at": "2026-10-31T10:24:45.063939882Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "51e2a63b-e5ea-47dc-8bf2-b754c68e4a92",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T22:24:44Z",
        "track_point_id": "691c40f5-9a9d-4690-9798-863e4c12b32a",
        "work_session_id": "df138355-f72c-42ec-8239-b8c6da3290ef"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T22:24:44Z",
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

`POST /api/admin/v1/driver-risk-flags/51e2a63b-e5ea-47dc-8bf2-b754c68e4a92/confirm` → **200**

```json
{
  "command_id": "baf64a01-714e-41c5-aebc-648952961500",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "51e2a63b-e5ea-47dc-8bf2-b754c68e4a92",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T22:24:44Z",
    "track_point_id": "691c40f5-9a9d-4690-9798-863e4c12b32a",
    "work_session_id": "df138355-f72c-42ec-8239-b8c6da3290ef"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T22:24:44Z",
  "reason": null,
  "reviewed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reviewed_at": "2026-10-30T22:24:45.661584Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/51e2a63b-e5ea-47dc-8bf2-b754c68e4a92/dismiss` → **409**

```json
{
  "command_id": "674f578e-994a-4296-991c-c81fb0fe22ba",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/51e2a63b-e5ea-47dc-8bf2-b754c68e4a92/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ff1c469b-89ff-4255-a43a-519f06413c65"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "02d8544e-16ac-444f-965f-a7b78d311727",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "06dc1e01-7889-473a-b30e-257349264abc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "raised_at": "2026-10-30T22:24:46.063571Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/06dc1e01-7889-473a-b30e-257349264abc/dismiss` → **200**

```json
{
  "command_id": "146c6546-7e6d-4a9d-bcd7-627a278ca750",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "06dc1e01-7889-473a-b30e-257349264abc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "raised_at": "2026-10-30T22:24:46.063571Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reviewed_at": "2026-10-30T22:24:46.270132Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "7d7bee57-b49f-4802-b70d-41e20016137d",
  "expected_version": 15,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "51e2a63b-e5ea-47dc-8bf2-b754c68e4a92"
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
      "actor_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T22:24:46.47608Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 51e2a63b-e5ea-47dc-8bf2-b754c68e4a92 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b37ef19f-7eba-4e67-ad0e-98ae0d392e10",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5ODcsImlhdCI6MTc5MzM5OTA4NywianRpIjoiZGQzZmMxOGEtNjMwMi00Y2RlLTk3MjUtODBhNDRlNjI0NTcyIiwic2lkIjoiYjM3ZWYxOWYtN2ViYS00ZTY3LWFkMGUtOThhZTBkMzkyZTEwIn0.X6i_FbZac3PGMv5E8C6DQmkDU8xoaoVNMjty0YWv6e0",
  "access_expires_at": "2026-10-30T22:39:47.071960369Z",
  "refresh_token": "jfEwj4oCwgek90zryvNp93uLUEm9V2heUNL1z5weFvQ",
  "refresh_expires_at": "2026-10-31T10:24:47.071579304Z",
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
      "actor_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T22:24:46.47608Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f1129b07-06e5-49a3-94d6-6bf3d06ca946",
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
  "session_id": "df138355-f72c-42ec-8239-b8c6da3290ef",
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
  "last_heartbeat_at": "2026-10-30T22:24:42.431438Z",
  "last_location_at": "2026-10-30T22:24:42.431438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df138355-f72c-42ec-8239-b8c6da3290ef/close` → **200**

```json
{
  "command_id": "293c589a-9076-41de-8594-542b3e901863",
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
  "session_id": "25576f0e-056b-4d96-bd04-83672df93c55",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5ODgsImlhdCI6MTc5MzM5OTA4OCwianRpIjoiMDI5MjhlZjgtMGFjNC00MGNmLThhZjAtMmJkOGUwNjU5YjAzIiwic2lkIjoiMjU1NzZmMGUtMDU2Yi00ZDk2LWJkMDQtODM2NzJkZjkzYzU1In0.agydOgnjqqUmqp0DfIlTN24Xhg-uOfX-Y3Oyd1j1lmc",
  "access_expires_at": "2026-10-30T22:39:48.254128281Z",
  "refresh_token": "ztDKCmug4q82pRiUzGsVAZOLdNNlIAT_djZ-hDSfPO4",
  "refresh_expires_at": "2026-10-31T10:24:48.253750781Z",
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
  "command_id": "37b8c6e8-94c0-4877-9f4d-48fb459d2015",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T22:24:48.647487Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "37b8c6e8-94c0-4877-9f4d-48fb459d2015",
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
  "changed_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T22:24:48.647487Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48629582468",
  "device_ref": "sandbox-32396"
}
```

```json
{
  "challenge_id": "e9d4807b-a965-49dc-b363-6fc5a1ae4b70",
  "expires_at": "2026-10-30T22:29:49.047216903Z",
  "resend_available_at": "2026-10-30T22:24:50.047216903Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48629582468` → **200**

```json
{
  "phone": "+48629582468",
  "audience": "CLIENT",
  "code": "979210",
  "sent_at": "2026-10-30T22:24:49.049083478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9d4807b-a965-49dc-b363-6fc5a1ae4b70",
  "code": "979210",
  "device_ref": "sandbox-32396"
}
```

```json
{
  "session_id": "20996334-6864-4f8c-8278-523c4aed25dc",
  "subject": {
    "type": "CLIENT",
    "id": "1abff0f7-8125-4181-a434-7bea4f6c96e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYWJmZjBmNy04MTI1LTQxODEtYTQzNC03YmVhNGY2Yzk2ZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTg5LCJpYXQiOjE3OTMzOTkwODksImp0aSI6IjE2OWU1YjcxLWYyNTItNGY0Yi1iZmE1LTA3ZjBlOTRjYzE5OSIsInNpZCI6IjIwOTk2MzM0LTY4NjQtNGY4Yy04Mjc4LTUyM2M0YWVkMjVkYyJ9.Y22Nt0zwpkXJ0NbeYXfAMrI-KW2wZOMd2yHe9E8VvQM",
  "access_expires_at": "2026-10-30T22:39:49.254960817Z",
  "refresh_token": "vEBmmOW0dv9RBJS3218MapSqBhsVT-r_c2oO0ZFMBg4",
  "refresh_expires_at": "2026-11-29T22:24:49.254572557Z",
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
  "correlation_id": "a85e6403-7082-4a26-a34e-93b169c6f13f"
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
  "device_ref": "sandbox-25819"
}
```

```json
{
  "challenge_id": "a7420876-8bb0-4dc4-beba-dc8e040c2e91",
  "expires_at": "2026-10-30T22:29:49.812667568Z",
  "resend_available_at": "2026-10-30T22:24:50.812667568Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "952042",
  "sent_at": "2026-10-30T22:24:49.814348323Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7420876-8bb0-4dc4-beba-dc8e040c2e91",
  "code": "952042",
  "device_ref": "sandbox-25819"
}
```

```json
{
  "session_id": "b7f0b043-e615-4c0f-8366-e23c0df552d4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTk5MCwiaWF0IjoxNzkzMzk5MDkwLCJqdGkiOiIzZTEwOTVkNy1iMDFlLTQxZDUtYjkwZi1kYjEzMzUyY2M0Y2MiLCJzaWQiOiJiN2YwYjA0My1lNjE1LTRjMGYtODM2Ni1lMjNjMGRmNTUyZDQifQ.YrhPwfwpAVAiL8U4prHInOkvVfP76cKUp5Ag3GCbND8",
  "access_expires_at": "2026-10-30T22:39:50.025595423Z",
  "refresh_token": "y8Ax185jHZbOJjUD2bZ7VBlt0VirDsuTuUwDSjT4Hv4",
  "refresh_expires_at": "2026-11-29T22:24:50.025203662Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c971b96-d3a2-4b4e-b476-8be3d4b147a1",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T22:24:26.719554Z",
  "last_location_at": "2026-10-30T22:24:26.719554Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6c971b96-d3a2-4b4e-b476-8be3d4b147a1/handover` → **200**

```json
{
  "command_id": "9b659211-e813-475c-ba39-28ac4e8a263a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c971b96-d3a2-4b4e-b476-8be3d4b147a1",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T22:24:26.719554Z",
  "last_location_at": "2026-10-30T22:24:26.719554Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6c971b96-d3a2-4b4e-b476-8be3d4b147a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:24:50Z",
    "sequence": 1793399090620
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c971b96-d3a2-4b4e-b476-8be3d4b147a1",
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
  "last_heartbeat_at": "2026-10-30T22:24:50.635724Z",
  "last_location_at": "2026-10-30T22:24:50.635724Z",
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
  "session_id": "6c971b96-d3a2-4b4e-b476-8be3d4b147a1",
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
  "last_heartbeat_at": "2026-10-30T22:24:50.635724Z",
  "last_location_at": "2026-10-30T22:24:50.635724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c971b96-d3a2-4b4e-b476-8be3d4b147a1/close` → **200**

```json
{
  "command_id": "6119f02d-6f17-4ce9-b35f-5c1cebb0dfd0",
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
  "correlation_id": "ad4b90b1-631e-4f60-b57a-72f427a7ef7a"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672096073",
  "device_ref": "sandbox-7551"
}
```

```json
{
  "challenge_id": "7fa87b04-7435-4713-bc38-315de0ae08a2",
  "expires_at": "2026-10-30T22:29:51.651606991Z",
  "resend_available_at": "2026-10-30T22:24:52.651606991Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672096073` → **200**

```json
{
  "phone": "+380672096073",
  "audience": "CLIENT",
  "code": "453965",
  "sent_at": "2026-10-30T22:24:51.653537077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fa87b04-7435-4713-bc38-315de0ae08a2",
  "code": "453965",
  "device_ref": "sandbox-7551"
}
```

```json
{
  "session_id": "bdfb4064-667c-48c5-b566-4b1c7eb9ec0f",
  "subject": {
    "type": "CLIENT",
    "id": "f617814c-5abf-42b3-bec7-6753971987ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjE3ODE0Yy01YWJmLTQyYjMtYmVjNy02NzUzOTcxOTg3ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTkxLCJpYXQiOjE3OTMzOTkwOTEsImp0aSI6IjI5Y2NlMWNjLWUzNWQtNDBiNS1iNmY0LTRkOTgzMTMzYjU2YyIsInNpZCI6ImJkZmI0MDY0LTY2N2MtNDhjNS1iNTY2LTRiMWM3ZWI5ZWMwZiJ9.CmiqVLqtmyL4_rzKHZE93WV1EWpI5dkaKe9bu6Rt6dY",
  "access_expires_at": "2026-10-30T22:39:51.865067319Z",
  "refresh_token": "xe4jC3dCtO87QDaKl4T4-ZM-OY0HjoGmxbhmmRx4Otk",
  "refresh_expires_at": "2026-11-29T22:24:51.864698253Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "cf399aae-9d6d-4bca-b6fd-2ce16a3b1fe4",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "d8ed5794-5bba-4db7-ab56-a57b79419714",
  "upload_path": "/api/rider/v1/uploads/d8ed5794-5bba-4db7-ab56-a57b79419714",
  "expires_at": "2026-10-30T22:39:52.061433546Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/d8ed5794-5bba-4db7-ab56-a57b79419714` → **200**

```json
{
  "file_id": "d8ed5794-5bba-4db7-ab56-a57b79419714",
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
  "command_id": "ddd94691-ad47-4fa4-b7c7-44a5a06b8e4c",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "deebdc63-d7e7-4288-90dd-733b499d9d22",
  "upload_path": "/api/rider/v1/uploads/deebdc63-d7e7-4288-90dd-733b499d9d22",
  "expires_at": "2026-10-30T22:39:52.279597386Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/deebdc63-d7e7-4288-90dd-733b499d9d22` → **200**

```json
{
  "file_id": "deebdc63-d7e7-4288-90dd-733b499d9d22",
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
  "command_id": "c7982fe9-7f7a-4188-b83d-bd17d2c977db",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4c297492-7edc-448c-872d-0a60da6f7aa9",
  "upload_path": "/api/rider/v1/uploads/4c297492-7edc-448c-872d-0a60da6f7aa9",
  "expires_at": "2026-10-30T22:39:52.495515576Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/4c297492-7edc-448c-872d-0a60da6f7aa9` → **200**

```json
{
  "file_id": "4c297492-7edc-448c-872d-0a60da6f7aa9",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3d97fb13-9e8c-4e90-885d-c65ca596e890",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "4c297492-7edc-448c-872d-0a60da6f7aa9"
  ]
}
```

```json
{
  "id": "329539c1-6eae-4cf2-afea-fbf9e35aeebe",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f617814c-5abf-42b3-bec7-6753971987ea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T22:24:52.712645Z",
  "updated_at": "2026-10-30T22:24:52.712645Z",
  "respond_by": "2026-10-31T02:24:52.712645Z",
  "messages": [
    {
      "id": "75382f16-b43d-4ca9-b6b4-b161924f0078",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f617814c-5abf-42b3-bec7-6753971987ea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:24:52.713226Z",
      "attachments": [
        {
          "file_id": "4c297492-7edc-448c-872d-0a60da6f7aa9",
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
  "session_id": "84229425-c48a-44c5-b83a-7621ed70a9b1",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5OTMsImlhdCI6MTc5MzM5OTA5MywianRpIjoiMzg2ODdhN2UtY2U0My00YjE4LWFjNmQtMjMzNGUxZTZiNzA2Iiwic2lkIjoiODQyMjk0MjUtYzQ4YS00NGM1LWI4M2EtNzYyMWVkNzBhOWIxIn0.C6dMvNRJKDuFcNrHAtsEbDXFKSbsBzQ6hOkm2nRJA-0",
  "access_expires_at": "2026-10-30T22:39:53.121760809Z",
  "refresh_token": "gQB97KuqwSvR83LNnf2UTtazAmGZktlen1cKRJez1Gg",
  "refresh_expires_at": "2026-10-31T10:24:53.121381807Z",
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
  "session_id": "7d5001c0-c4f1-4c95-b7ec-ef38e58e2654",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5OTMsImlhdCI6MTc5MzM5OTA5MywianRpIjoiMmUxM2FhYzYtOWE4My00YzY4LTk3MmQtZTgyYmQ1YWU0M2YyIiwic2lkIjoiN2Q1MDAxYzAtYzRmMS00Yzk1LWI3ZWMtZWYzOGU1OGUyNjU0In0.kazg59QgTkq8AAmjzjBVKu-3D3uOgL3DWvP01pJxOVg",
  "access_expires_at": "2026-10-30T22:39:53.513075262Z",
  "refresh_token": "X-dyHNr3y_tkOImItKbRMvnGLtkCkQylzt4-90VG6io",
  "refresh_expires_at": "2026-10-31T10:24:53.512714738Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/329539c1-6eae-4cf2-afea-fbf9e35aeebe/attachments/4c297492-7edc-448c-872d-0a60da6f7aa9` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d5b80b79-e32d-44c9-97bc-d407389ee0c6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "945e8793-56eb-44f0-8be6-0855c95a2403",
  "upload_path": "/api/operator/v1/uploads/945e8793-56eb-44f0-8be6-0855c95a2403",
  "expires_at": "2026-10-30T22:39:53.715816142Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/945e8793-56eb-44f0-8be6-0855c95a2403` → **200**

```json
{
  "file_id": "945e8793-56eb-44f0-8be6-0855c95a2403",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/329539c1-6eae-4cf2-afea-fbf9e35aeebe` → **200**

```json
{
  "id": "329539c1-6eae-4cf2-afea-fbf9e35aeebe",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f617814c-5abf-42b3-bec7-6753971987ea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T22:24:52.712645Z",
  "updated_at": "2026-10-30T22:24:52.712645Z",
  "respond_by": "2026-10-31T02:24:52.712645Z",
  "messages": [
    {
      "id": "75382f16-b43d-4ca9-b6b4-b161924f0078",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f617814c-5abf-42b3-bec7-6753971987ea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:24:52.713226Z",
      "attachments": [
        {
          "file_id": "4c297492-7edc-448c-872d-0a60da6f7aa9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/329539c1-6eae-4cf2-afea-fbf9e35aeebe/comments` → **200**

```json
{
  "command_id": "77168ab4-404f-4767-a86f-b93d00351f97",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "945e8793-56eb-44f0-8be6-0855c95a2403"
  ]
}
```

```json
{
  "id": "329539c1-6eae-4cf2-afea-fbf9e35aeebe",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f617814c-5abf-42b3-bec7-6753971987ea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T22:24:52.712645Z",
  "updated_at": "2026-10-30T22:24:54.131378Z",
  "respond_by": "2026-10-31T02:24:52.712645Z",
  "messages": [
    {
      "id": "75382f16-b43d-4ca9-b6b4-b161924f0078",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f617814c-5abf-42b3-bec7-6753971987ea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:24:52.713226Z",
      "attachments": [
        {
          "file_id": "4c297492-7edc-448c-872d-0a60da6f7aa9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "fcca3054-7798-45f6-b007-af6c50bad184",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T22:24:54.13101Z",
      "attachments": [
        {
          "file_id": "945e8793-56eb-44f0-8be6-0855c95a2403",
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

`GET /api/rider/v1/support/cases/329539c1-6eae-4cf2-afea-fbf9e35aeebe` → **200**

```json
{
  "id": "329539c1-6eae-4cf2-afea-fbf9e35aeebe",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f617814c-5abf-42b3-bec7-6753971987ea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T22:24:52.712645Z",
  "updated_at": "2026-10-30T22:24:54.131378Z",
  "respond_by": "2026-10-31T02:24:52.712645Z",
  "messages": [
    {
      "id": "75382f16-b43d-4ca9-b6b4-b161924f0078",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f617814c-5abf-42b3-bec7-6753971987ea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T22:24:52.713226Z",
      "attachments": [
        {
          "file_id": "4c297492-7edc-448c-872d-0a60da6f7aa9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "fcca3054-7798-45f6-b007-af6c50bad184",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T22:24:54.13101Z",
      "attachments": [
        {
          "file_id": "945e8793-56eb-44f0-8be6-0855c95a2403",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/329539c1-6eae-4cf2-afea-fbf9e35aeebe/attachments/945e8793-56eb-44f0-8be6-0855c95a2403` → **200**

Done: support case 329539c1-6eae-4cf2-afea-fbf9e35aeebe, rider attachment 4c297492-7edc-448c-872d-0a60da6f7aa9, operator attachment 945e8793-56eb-44f0-8be6-0855c95a2403.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735733682",
  "device_ref": "sandbox-14990"
}
```

```json
{
  "challenge_id": "5093bc10-8274-4098-87cb-fb3dd3a9532e",
  "expires_at": "2026-10-30T22:29:54.553390941Z",
  "resend_available_at": "2026-10-30T22:24:55.553390941Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735733682` → **200**

```json
{
  "phone": "+380735733682",
  "audience": "CLIENT",
  "code": "653353",
  "sent_at": "2026-10-30T22:24:54.555367741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5093bc10-8274-4098-87cb-fb3dd3a9532e",
  "code": "653353",
  "device_ref": "sandbox-14990"
}
```

```json
{
  "session_id": "302aaf44-88c2-4294-a2af-0eef7015e545",
  "subject": {
    "type": "CLIENT",
    "id": "68edb8af-1f6f-49f2-aba8-42415d257267"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGVkYjhhZi0xZjZmLTQ5ZjItYWJhOC00MjQxNWQyNTcyNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk5OTk0LCJpYXQiOjE3OTMzOTkwOTQsImp0aSI6Ijg5ZWQzOThhLTJiM2MtNGMyZS05YTQ5LTVhZTIwMmJjYjEzNSIsInNpZCI6IjMwMmFhZjQ0LTg4YzItNDI5NC1hMmFmLTBlZWY3MDE1ZTU0NSJ9.YxHBFuW1WItWB6Zv4RvcEKI5kArMHuvkmdV5JqWSptE",
  "access_expires_at": "2026-10-30T22:39:54.767255619Z",
  "refresh_token": "5efm7SPPYFvmRyw1mTDB18ESfmwkmE6jsrd6_fgAuXs",
  "refresh_expires_at": "2026-11-29T22:24:54.766906593Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "0d4676d6-e69a-4557-b8be-2e6fce51ac11",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "37a40c37-f3f5-4162-9611-0d903c864576",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-37a40c37-f3f5-4162-9611-0d903c864576",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8b3d8844b74f0a8e0fa27f9ba6f73a41",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=37a40c37-f3f5-4162-9611-0d903c864576",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735733682"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=37a40c37-f3f5-4162-9611-0d903c864576",
  "expires_at": "2026-10-30T22:54:54.961779Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/37a40c37-f3f5-4162-9611-0d903c864576` → **200**

```json
{
  "id": "37a40c37-f3f5-4162-9611-0d903c864576",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T22:54:54.961779Z",
  "card": {
    "id": "87549876-0354-48c2-9d9b-ee6ccab04f02",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9156",
    "card_type": "Visa",
    "created_at": "2026-10-30T22:24:55.158022Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e572b5d-5737-46e9-b44a-407b0c63adb7",
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
  "id": "c2a64e47-a06f-40aa-9265-69f8653e0f70",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:29:55.365908Z",
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
  "command_id": "bf7c2b86-be19-43d6-9544-10284377e584",
  "quote_id": "c2a64e47-a06f-40aa-9265-69f8653e0f70",
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
  "id": "813fe254-c0af-4a37-8403-3e18f4333613",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "68edb8af-1f6f-49f2-aba8-42415d257267",
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
  "created_at": "2026-10-30T22:24:55.571658Z",
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

`GET /api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613` → **200**

```json
{
  "id": "813fe254-c0af-4a37-8403-3e18f4333613",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "68edb8af-1f6f-49f2-aba8-42415d257267",
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
  "created_at": "2026-10-30T22:24:55.571658Z",
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

`GET /api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613` → **200**

```json
{
  "id": "813fe254-c0af-4a37-8403-3e18f4333613",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "68edb8af-1f6f-49f2-aba8-42415d257267",
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
  "created_at": "2026-10-30T22:24:55.571658Z",
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

`GET /api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613` → **200**

```json
{
  "id": "813fe254-c0af-4a37-8403-3e18f4333613",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "68edb8af-1f6f-49f2-aba8-42415d257267",
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
  "created_at": "2026-10-30T22:24:55.571658Z",
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

`POST /api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613/switch-to-cash` → **200**

```json
{
  "command_id": "da1c97af-de94-4aab-b544-83b49e6ba099",
  "expected_version": 3
}
```

```json
{
  "id": "813fe254-c0af-4a37-8403-3e18f4333613",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "68edb8af-1f6f-49f2-aba8-42415d257267",
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
  "created_at": "2026-10-30T22:24:55.571658Z",
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

`POST /api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613/switch-to-cash` → **409**

```json
{
  "command_id": "b5516f7d-702b-497a-8ef9-fc07eba32164",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fc740b47-c347-4755-8730-b0c078dbf255"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613` → **200**

```json
{
  "id": "813fe254-c0af-4a37-8403-3e18f4333613",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "68edb8af-1f6f-49f2-aba8-42415d257267",
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
  "created_at": "2026-10-30T22:24:55.571658Z",
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

`POST /api/rider/v1/orders/813fe254-c0af-4a37-8403-3e18f4333613/cancel` → **200**

```json
{
  "command_id": "4a79048f-83fe-460e-8064-917c5fb9b3f2",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "813fe254-c0af-4a37-8403-3e18f4333613",
  "short_number": 34,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "68edb8af-1f6f-49f2-aba8-42415d257267",
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
  "created_at": "2026-10-30T22:24:55.571658Z",
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
  "session_id": "8cf4e4bb-185b-47a6-8686-217969da893e",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTk5OTgsImlhdCI6MTc5MzM5OTA5OCwianRpIjoiNzM0MGIxMzUtM2FjYi00NTczLWE5ZWUtOTIwNWFlODkyNDg5Iiwic2lkIjoiOGNmNGU0YmItMTg1Yi00N2E2LTg2ODYtMjE3OTY5ZGE4OTNlIn0.hkUvokY2Ysknl5svvnweaAIJzMBfv9tIWh5SDIXhylU",
  "access_expires_at": "2026-10-30T22:39:58.447578027Z",
  "refresh_token": "fwrV3TvRc5tULNj0P_QCo6JOkyplxnEX1tf6RwTfqbQ",
  "refresh_expires_at": "2026-10-31T10:24:58.447228319Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20896"
}
```

```json
{
  "challenge_id": "0bb5c096-794e-4a7b-8113-59eec40e4915",
  "expires_at": "2026-10-30T22:29:58.636104298Z",
  "resend_available_at": "2026-10-30T22:24:59.636104298Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "953903",
  "sent_at": "2026-10-30T22:24:58.637924983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bb5c096-794e-4a7b-8113-59eec40e4915",
  "code": "953903",
  "device_ref": "sandbox-20896"
}
```

```json
{
  "session_id": "7ed6ad38-c288-4736-a8a1-9d3f87e39a7b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTk5OCwiaWF0IjoxNzkzMzk5MDk4LCJqdGkiOiI5MGIwMzdlMi1mMmQyLTQ1YTItYjA5Zi03MTdkMTM1MTA5M2EiLCJzaWQiOiI3ZWQ2YWQzOC1jMjg4LTQ3MzYtYThhMS05ZDNmODdlMzlhN2IifQ.3TGBXMTzh5d3tK7VkcWCwASyxvXE3GEbLJaJbPFSCq4",
  "access_expires_at": "2026-10-30T22:39:58.844628768Z",
  "refresh_token": "zeFFlw4CyPgj1o3FY2fZ7H-EQ8bUDJGR_qeYX26d4io",
  "refresh_expires_at": "2026-11-29T22:24:58.844255465Z",
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
      "actor_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T22:24:46.47608Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T22:24:47.466371Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "6cc95e4b-9fa0-4914-aa13-8277d08cbd4e",
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
  "device_ref": "sandbox-2302"
}
```

```json
{
  "challenge_id": "7ea47f0f-bdb9-474f-82b6-52ff0d1eded0",
  "expires_at": "2026-10-30T22:29:59.646133132Z",
  "resend_available_at": "2026-10-30T22:25:00.646133132Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "657948",
  "sent_at": "2026-10-30T22:24:59.648190453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ea47f0f-bdb9-474f-82b6-52ff0d1eded0",
  "code": "657948",
  "device_ref": "sandbox-2302"
}
```

```json
{
  "session_id": "dc508bd7-d1f8-4095-9340-36c358fe9652",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5OTk5OSwiaWF0IjoxNzkzMzk5MDk5LCJqdGkiOiI2YzRmZDA1YS01OTAyLTRlZTMtOTliNS00ZDk1OWY1ZGJhODIiLCJzaWQiOiJkYzUwOGJkNy1kMWY4LTQwOTUtOTM0MC0zNmMzNThmZTk2NTIifQ.5ERa_pDW-8pqb3LbIPMJkUlDrjgk906INKdjf2xjad4",
  "access_expires_at": "2026-10-30T22:39:59.857794528Z",
  "refresh_token": "RaOqMXSlNF8RfT24MvVhMt7HkDdI3rV32zXU6nRHUAI",
  "refresh_expires_at": "2026-11-29T22:24:59.857443379Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:24:29.499794Z",
  "last_location_at": "2026-10-30T22:24:29.499794Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/handover` → **200**

```json
{
  "command_id": "e48f8b39-b027-4656-8db4-f71953248a9b",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:24:29.499794Z",
  "last_location_at": "2026-10-30T22:24:29.499794Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:25:00Z",
    "sequence": 1793399100453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:25:00.469089Z",
  "last_location_at": "2026-10-30T22:25:00.469089Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
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
  "command_id": "bb17aa7c-712c-4b86-8a76-a183c988204f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:25:00Z",
    "sequence": 1793399100859
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8cb91f8c-e55b-4484-8a31-c1ce8b374b28",
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
  "last_heartbeat_at": "2026-10-30T22:25:00.873409Z",
  "last_location_at": "2026-10-30T22:25:00.873409Z",
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
  "session_id": "4f534c94-28e7-45bb-af3f-21570875610f",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAwMDEsImlhdCI6MTc5MzM5OTEwMSwianRpIjoiNGMwM2Q1YmQtMDA1MC00M2Y1LWJlYzQtNzJmNjQ3ZjUyNmM0Iiwic2lkIjoiNGY1MzRjOTQtMjhlNy00NWJiLWFmM2YtMjE1NzA4NzU2MTBmIn0.aiAWj6bCRR0cOw-aHODlJB5WZ19ox5SZLw_aUgcsoxs",
  "access_expires_at": "2026-10-30T22:40:01.274516545Z",
  "refresh_token": "9QQE8jQ6Q65tmMnSpkBMxnQr9P9EG_o2sV6sBfEt5pE",
  "refresh_expires_at": "2026-10-31T10:25:01.274129741Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ad3e5e9b-9557-4baf-a93a-94979b94bdf7",
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
  "id": "09662426-2e74-466b-9c49-7fc05adfafee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T22:30:01.474841Z",
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
  "command_id": "6225e97d-d60b-4236-bd7e-0f76cbe404ba",
  "quote_id": "09662426-2e74-466b-9c49-7fc05adfafee",
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
  "id": "d032f289-7486-438f-b757-e9c79ed96f1d",
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
  "created_at": "2026-10-30T22:25:01.675636Z",
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
    "id": "d61ad937-a236-43bc-8f95-fcbc0adb559a",
    "order_id": "d032f289-7486-438f-b757-e9c79ed96f1d",
    "expires_at": "2026-10-30T22:25:16.678029Z",
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

`POST /api/driver/v1/offers/d61ad937-a236-43bc-8f95-fcbc0adb559a/accept` → **200**

```json
{
  "command_id": "69c774b6-7643-4d8a-98ba-31a2019dafc2"
}
```

```json
{
  "id": "6dbb3157-83fb-44c9-86d8-efb509d7a5b9",
  "order_id": "d032f289-7486-438f-b757-e9c79ed96f1d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "02a424c0-d480-4644-a824-4ebc81bce80d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "02a424c0-d480-4644-a824-4ebc81bce80d",
  "order_id": "d032f289-7486-438f-b757-e9c79ed96f1d",
  "assignment_id": "6dbb3157-83fb-44c9-86d8-efb509d7a5b9",
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

`POST /api/driver/v1/work-sessions/8cb91f8c-e55b-4484-8a31-c1ce8b374b28/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T22:25:12Z",
    "sequence": 1793399112648
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8cb91f8c-e55b-4484-8a31-c1ce8b374b28",
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
  "last_heartbeat_at": "2026-10-30T22:25:12.666883Z",
  "last_location_at": "2026-10-30T22:25:12.666883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/02a424c0-d480-4644-a824-4ebc81bce80d/arrive` → **200**

```json
{
  "command_id": "49023cdc-37ce-406f-af75-90f088ad3319",
  "expected_version": 0
}
```

```json
{
  "id": "02a424c0-d480-4644-a824-4ebc81bce80d",
  "order_id": "d032f289-7486-438f-b757-e9c79ed96f1d",
  "assignment_id": "6dbb3157-83fb-44c9-86d8-efb509d7a5b9",
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
  "arrived_at": "2026-10-30T22:25:12.867588Z",
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

`POST /api/driver/v1/trips/02a424c0-d480-4644-a824-4ebc81bce80d/start` → **200**

```json
{
  "command_id": "e1726464-9da6-40e3-9ec9-7993ebc4f511",
  "expected_version": 1
}
```

```json
{
  "id": "02a424c0-d480-4644-a824-4ebc81bce80d",
  "order_id": "d032f289-7486-438f-b757-e9c79ed96f1d",
  "assignment_id": "6dbb3157-83fb-44c9-86d8-efb509d7a5b9",
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
  "arrived_at": "2026-10-30T22:25:12.867588Z",
  "started_at": "2026-10-30T22:25:13.075441Z",
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

`POST /api/driver/v1/trips/02a424c0-d480-4644-a824-4ebc81bce80d/complete` → **200**

```json
{
  "command_id": "b8321f94-f12b-4c34-baa2-c49e0c106e8e",
  "expected_version": 2,
  "reported_at": "2026-10-30T22:25:13Z",
  "cash_received": true
}
```

```json
{
  "id": "02a424c0-d480-4644-a824-4ebc81bce80d",
  "order_id": "d032f289-7486-438f-b757-e9c79ed96f1d",
  "assignment_id": "6dbb3157-83fb-44c9-86d8-efb509d7a5b9",
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
  "arrived_at": "2026-10-30T22:25:12.867588Z",
  "started_at": "2026-10-30T22:25:13.075441Z",
  "completed_at": "2026-10-30T22:25:13.280013Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d032f289-7486-438f-b757-e9c79ed96f1d` → **200**

```json
{
  "id": "d032f289-7486-438f-b757-e9c79ed96f1d",
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
    "id": "6dbb3157-83fb-44c9-86d8-efb509d7a5b9",
    "order_id": "d032f289-7486-438f-b757-e9c79ed96f1d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "02a424c0-d480-4644-a824-4ebc81bce80d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T22:25:01.675636Z",
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
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:25:00.469089Z",
  "last_location_at": "2026-10-30T22:25:00.469089Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/close` → **200**

```json
{
  "command_id": "fca1612a-9538-41cc-bf50-836a519ff244",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 5,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:25:00.469089Z",
  "last_location_at": "2026-10-30T22:25:00.469089Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8cb91f8c-e55b-4484-8a31-c1ce8b374b28",
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
  "last_heartbeat_at": "2026-10-30T22:25:12.666883Z",
  "last_location_at": "2026-10-30T22:25:12.666883Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8cb91f8c-e55b-4484-8a31-c1ce8b374b28/close` → **200**

```json
{
  "command_id": "e626fb95-d30d-4cbb-b5b0-28e0e7f3b5fa",
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

Done: terminal order d032f289-7486-438f-b757-e9c79ed96f1d by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19493"
}
```

```json
{
  "challenge_id": "f767247a-7595-4217-a189-064e106a77a4",
  "expires_at": "2026-10-30T22:30:17.674107386Z",
  "resend_available_at": "2026-10-30T22:25:18.674107386Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "019597",
  "sent_at": "2026-10-30T22:25:17.676828303Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f767247a-7595-4217-a189-064e106a77a4",
  "code": "019597",
  "device_ref": "sandbox-19493"
}
```

```json
{
  "session_id": "c20280b2-23d3-4ca3-bd50-719a9bc251bf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQwMDAxNywiaWF0IjoxNzkzMzk5MTE3LCJqdGkiOiI4MTFlNDk2MS0wMDAwLTQ1ZGYtOWVkOS04ZjIyMTdjYjJlOWMiLCJzaWQiOiJjMjAyODBiMi0yM2QzLTRjYTMtYmQ1MC03MTlhOWJjMjUxYmYifQ.o0JIjYteZsqZwx216ti0MyWQ13h_vYt1qpHnmu62LqU",
  "access_expires_at": "2026-10-30T22:40:17.891754868Z",
  "refresh_token": "qkoYq3gEIPTRJs9u8LWMZLO68Xq-N30fT0cWq7zskpc",
  "refresh_expires_at": "2026-11-29T22:25:17.891064228Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34fe7be3-b698-4e66-a987-d3da87ea0840",
  "session_version": 5,
  "session_state": "CLOSING",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T22:25:00.469089Z",
  "last_location_at": "2026-10-30T22:25:00.469089Z",
  "eligible": false,
  "ineligible_reasons": [
    "SESSION_CLOSING",
    "INTENT_PAUSE_AFTER_CURRENT",
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/close` → **409**

```json
{
  "command_id": "545812d4-4a64-4dbc-bd26-7e3481a4f8e9",
  "expected_version": 5
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/34fe7be3-b698-4e66-a987-d3da87ea0840/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "590a601d-c7a2-441b-ac46-9824e0d84579"
}
```

**Expected 200, got 409 — scenario stopped.**

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
  "session_id": "15552d85-efb6-4ad1-a20c-670b31cf48e8",
  "subject": {
    "type": "STAFF",
    "id": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGUxYWQyYi0wMDAxLTQ3ZDctOWU5OS0zYWU0YzkyZTgzODAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM0MDAwMTgsImlhdCI6MTc5MzM5OTExOCwianRpIjoiOGRiMGJlZTctM2EwOS00NWIwLThiNzAtODkwOTRhMGMxNTMwIiwic2lkIjoiMTU1NTJkODUtZWZiNi00YWQxLWEyMGMtNjcwYjMxY2Y0OGU4In0.TBqCKdYVcHAgrpft-neNyxqOOCbOfNF1L0Za31G2GB8",
  "access_expires_at": "2026-10-30T22:40:18.697089316Z",
  "refresh_token": "bTY9BYihP0VkkFB71vZFdXAWJlZ_NBklNUgSsRIufcc",
  "refresh_expires_at": "2026-10-31T10:25:18.696656314Z",
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
  "id": "3ea74ca2-a332-455e-8dd4-f6be42796ebb",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:25:18.89962Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:25:18.89966Z",
  "updated_at": "2026-10-30T22:25:18.911526Z",
  "finished_at": "2026-10-30T22:25:18.911526Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/3ea74ca2-a332-455e-8dd4-f6be42796ebb` → **200**

```json
{
  "run": {
    "id": "3ea74ca2-a332-455e-8dd4-f6be42796ebb",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T22:25:18.89962Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T22:25:18.89966Z",
    "updated_at": "2026-10-30T22:25:18.911526Z",
    "finished_at": "2026-10-30T22:25:18.911526Z",
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
  "id": "3ea74ca2-a332-455e-8dd4-f6be42796ebb",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:25:18.89962Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:25:18.89966Z",
  "updated_at": "2026-10-30T22:25:18.911526Z",
  "finished_at": "2026-10-30T22:25:18.911526Z",
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
  "id": "3ea74ca2-a332-455e-8dd4-f6be42796ebb",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:25:18.89962Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:25:18.89966Z",
  "updated_at": "2026-10-30T22:25:18.911526Z",
  "finished_at": "2026-10-30T22:25:18.911526Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ec86b365-4e97-4ccd-869b-c72a5cd70f46` → **204**

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
  "id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:25:19.2269Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:25:19.22694Z",
  "updated_at": "2026-10-30T22:25:19.232087Z",
  "finished_at": "2026-10-30T22:25:19.232087Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/f0befb08-f4ae-45ed-bfa6-d58384193f29` → **200**

```json
{
  "run": {
    "id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T22:25:19.2269Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T22:25:19.22694Z",
    "updated_at": "2026-10-30T22:25:19.232087Z",
    "finished_at": "2026-10-30T22:25:19.232087Z",
    "version": 1
  },
  "items": [
    {
      "id": "e6542063-d993-4a5f-b04d-37b1a8788c3c",
      "run_id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6be4c7a6c812603367ee2e4f74d934a4035696326805405576a53fb8d28f226a",
      "reference_display": "sandbox-reconciliation-ec86b365-4e97-4ccd-869b-c72a5cd70f46",
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
      "provider_at": "2026-10-30T22:25:19Z",
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
  "id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:25:19.2269Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:25:19.22694Z",
  "updated_at": "2026-10-30T22:25:19.232087Z",
  "finished_at": "2026-10-30T22:25:19.232087Z",
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
  "id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:25:19.2269Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:25:19.22694Z",
  "updated_at": "2026-10-30T22:25:19.232087Z",
  "finished_at": "2026-10-30T22:25:19.232087Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/e6542063-d993-4a5f-b04d-37b1a8788c3c/resolve` → **200**

```json
{
  "command_id": "b26b489e-e057-4381-85af-d09d8f80b230",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "e6542063-d993-4a5f-b04d-37b1a8788c3c",
  "run_id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6be4c7a6c812603367ee2e4f74d934a4035696326805405576a53fb8d28f226a",
  "reference_display": "sandbox-reconciliation-ec86b365-4e97-4ccd-869b-c72a5cd70f46",
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
  "provider_at": "2026-10-30T22:25:19Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "resolved_at": "2026-10-30T22:25:19.540066Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/e6542063-d993-4a5f-b04d-37b1a8788c3c/resolve` → **200**

```json
{
  "command_id": "b26b489e-e057-4381-85af-d09d8f80b230",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "e6542063-d993-4a5f-b04d-37b1a8788c3c",
  "run_id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6be4c7a6c812603367ee2e4f74d934a4035696326805405576a53fb8d28f226a",
  "reference_display": "sandbox-reconciliation-ec86b365-4e97-4ccd-869b-c72a5cd70f46",
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
  "provider_at": "2026-10-30T22:25:19Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
  "resolved_at": "2026-10-30T22:25:19.540066Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/e6542063-d993-4a5f-b04d-37b1a8788c3c/resolve` → **409**

```json
{
  "command_id": "483efc45-5078-4824-bfb3-9e04d8401833",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/e6542063-d993-4a5f-b04d-37b1a8788c3c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "854fb28d-2709-419c-8822-a505abb33e51"
}
```

`GET /api/admin/v1/payment-reconciliations/f0befb08-f4ae-45ed-bfa6-d58384193f29` → **200**

```json
{
  "run": {
    "id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T22:25:19.2269Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T22:25:19.22694Z",
    "updated_at": "2026-10-30T22:25:19.540066Z",
    "finished_at": "2026-10-30T22:25:19.232087Z",
    "version": 2
  },
  "items": [
    {
      "id": "e6542063-d993-4a5f-b04d-37b1a8788c3c",
      "run_id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6be4c7a6c812603367ee2e4f74d934a4035696326805405576a53fb8d28f226a",
      "reference_display": "sandbox-reconciliation-ec86b365-4e97-4ccd-869b-c72a5cd70f46",
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
      "provider_at": "2026-10-30T22:25:19Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "e4e1ad2b-0001-47d7-9e99-3ae4c92e8380",
      "resolved_at": "2026-10-30T22:25:19.540066Z",
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
      "id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T22:25:19.2269Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T22:25:19.22694Z",
      "updated_at": "2026-10-30T22:25:19.540066Z",
      "finished_at": "2026-10-30T22:25:19.232087Z",
      "version": 2
    },
    {
      "id": "2630f8de-83f8-418e-b138-6dae56141870",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T22:10:19.682791Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T22:10:19.682908Z",
      "updated_at": "2026-10-30T22:10:19.690328Z",
      "finished_at": "2026-10-30T22:10:19.690328Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ec86b365-4e97-4ccd-869b-c72a5cd70f46` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "f0befb08-f4ae-45ed-bfa6-d58384193f29",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T22:25:19.2269Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T22:25:19.22694Z",
  "updated_at": "2026-10-30T22:25:19.540066Z",
  "finished_at": "2026-10-30T22:25:19.232087Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793399244903E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793399245141E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793399245141E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793399244903E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793399245141E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
