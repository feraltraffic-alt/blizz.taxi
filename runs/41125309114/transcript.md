# Sandbox transcript (2026-10-30T20:43:18Z, 82063f9)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10268"
}
```

```json
{
  "challenge_id": "f246a3bd-1388-4462-b759-aa8f6310fd14",
  "expires_at": "2026-10-30T20:48:18.34757127Z",
  "resend_available_at": "2026-10-30T20:43:19.34757127Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "857558",
  "sent_at": "2026-10-30T20:43:18.366022726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f246a3bd-1388-4462-b759-aa8f6310fd14",
  "code": "857558",
  "device_ref": "sandbox-10268"
}
```

```json
{
  "session_id": "84f663f3-9b72-400b-b5e7-c8976ed153dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MzkwNCwiaWF0IjoxNzkzMzkzMDA0LCJqdGkiOiJkYzIwYjM0OS00MTZlLTQ0YzQtOWE2Yy00YTZmYmJmNTlhMTciLCJzaWQiOiI4NGY2NjNmMy05YjcyLTQwMGItYjVlNy1jODk3NmVkMTUzZGQifQ.SNUCrfncmMuDngH1gAnfaSig3XkBmjve3kYoGJbBmAA",
  "access_expires_at": "2026-10-30T20:58:24.410517773Z",
  "refresh_token": "UGsnYqZTPV2rzDCio-m7ZtqjXZ0UoHZ5-MA1SVo-qPc",
  "refresh_expires_at": "2026-11-29T20:43:24.408420202Z",
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
  "device_ref": "sandbox-1516"
}
```

```json
{
  "challenge_id": "94cd5bb4-1a74-480d-ac20-ad1d3f03a511",
  "expires_at": "2026-10-30T20:48:24.920893465Z",
  "resend_available_at": "2026-10-30T20:43:25.920893465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "493673",
  "sent_at": "2026-10-30T20:43:24.926038194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94cd5bb4-1a74-480d-ac20-ad1d3f03a511",
  "code": "493673",
  "device_ref": "sandbox-1516"
}
```

```json
{
  "session_id": "c1f83115-4d93-46a4-a994-17e17a817317",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MzkwNSwiaWF0IjoxNzkzMzkzMDA1LCJqdGkiOiI1MjkzM2Q2OC1lODI5LTRhNWUtODUyMS03M2U4NTdjZDQ1NDEiLCJzaWQiOiJjMWY4MzExNS00ZDkzLTQ2YTQtYTk5NC0xN2UxN2E4MTczMTcifQ.zhzyoXsJZQomBM8sGJamsFdq-3eQGBOK-OuV_StuZUY",
  "access_expires_at": "2026-10-30T20:58:25.175536409Z",
  "refresh_token": "ni9aJkPm2YCfi7ylEiMDx5trKvxP-R5H2QBmdioQzO4",
  "refresh_expires_at": "2026-11-29T20:43:25.174583244Z",
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
  "correlation_id": "76b7dfa7-b92b-4b77-b117-1ef74491d62b"
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
  "session_id": "0a4be7e5-47ef-4e16-bab2-0e25d677dac9",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTM5MDYsImlhdCI6MTc5MzM5MzAwNiwianRpIjoiN2M1NDk4MzktYzU2MC00ZjA4LWE1YTEtYzg0NTM3ZmMyYmFjIiwic2lkIjoiMGE0YmU3ZTUtNDdlZi00ZTE2LWJhYjItMGUyNWQ2NzdkYWM5In0.5ml2fiLJ3qri7y2buTUZt5Ilt6Dqlcub7si_nPvkW_0",
  "access_expires_at": "2026-10-30T20:58:26.299509367Z",
  "refresh_token": "ixVoEfX-vGd2AB0HOevOKOtCutIaKY1QmcOyhhrQms4",
  "refresh_expires_at": "2026-10-31T08:43:26.298613228Z",
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
  "session_id": "fbd9ef1b-63b5-43bf-b9bf-18f1bb04b079",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTM5MDcsImlhdCI6MTc5MzM5MzAwNywianRpIjoiZTEzZDFmMDYtMDljZS00ZjU2LWI2ZDYtZTg4MDRiODQwMDhkIiwic2lkIjoiZmJkOWVmMWItNjNiNS00M2JmLWI5YmYtMThmMWJiMDRiMDc5In0.dQbBFmyVoa5yVw-N1oqDY8w0itK_WuvhW2KONV98QDs",
  "access_expires_at": "2026-10-30T20:58:27.628487783Z",
  "refresh_token": "ZeNpJ2ObOdFB7s1TQV8wnp1Dmaoq7OZ2jPo7J_xkDh0",
  "refresh_expires_at": "2026-10-31T08:43:27.627687081Z",
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
  "session_id": "3d6ced7c-f3e4-4ecd-b317-3d717a0933db",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTM5MDgsImlhdCI6MTc5MzM5MzAwOCwianRpIjoiZWU1MDEwMzEtNWE4Ni00ZDBkLWE2Y2EtZmEzOTA0ZDU2NTFmIiwic2lkIjoiM2Q2Y2VkN2MtZjNlNC00ZWNkLWIzMTctM2Q3MTdhMDkzM2RiIn0.J_nQeOSaGzCkmEOgpnmVg0uqhO6gu_ILK0SdO3CLqWk",
  "access_expires_at": "2026-10-30T20:58:28.072644182Z",
  "refresh_token": "e6BAhGkA7iCvS8YYPD2f4_GDsjA_QsocQD38W-aOjAo",
  "refresh_expires_at": "2026-10-31T08:43:28.072000199Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14682"
}
```

```json
{
  "challenge_id": "de0a1a55-460c-43fa-91c2-0d986fabfeed",
  "expires_at": "2026-10-30T20:48:28.287446775Z",
  "resend_available_at": "2026-10-30T20:43:29.287446775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "689778",
  "sent_at": "2026-10-30T20:43:28.292202472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de0a1a55-460c-43fa-91c2-0d986fabfeed",
  "code": "689778",
  "device_ref": "sandbox-14682"
}
```

```json
{
  "session_id": "e3c87eaf-aa8a-4693-a9b3-1c124bba72f9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MzkwOCwiaWF0IjoxNzkzMzkzMDA4LCJqdGkiOiJlNzFjNzJkZS1iZDVkLTQzYjktOTczZS03MmUzMjEzN2M0ZTIiLCJzaWQiOiJlM2M4N2VhZi1hYThhLTQ2OTMtYTliMy0xYzEyNGJiYTcyZjkifQ.X4O9gfKoXBapKEAcLotEmyinCfoUOwJWG-K_YzKrW2o",
  "access_expires_at": "2026-10-30T20:58:28.556287185Z",
  "refresh_token": "OmaOlFpwR9I0AufR9-MbwuveyvXYJwwGg5Q9NnmOJQQ",
  "refresh_expires_at": "2026-11-29T20:43:28.554846658Z",
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
  "command_id": "589cdb99-8884-4315-b4a6-890cc7a50291",
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
  "command_id": "8a25ff98-a3be-49d8-949b-ece4370e6ea3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:29Z",
    "sequence": 1793393009574
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
  "correlation_id": "00d4386f-484a-4ca8-acd9-4b1b6cc58ff8"
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
  "command_id": "bab519d1-6ade-4b48-a51a-897cf1ff3765",
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
  "command_id": "15768218-7167-4d9c-8295-1d6862c9af23",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:30Z",
    "sequence": 1793393010587
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e0bd551d-5c12-4d88-b1ad-600bb34ffeaf",
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
  "last_heartbeat_at": "2026-10-30T20:43:30.60884Z",
  "last_location_at": "2026-10-30T20:43:30.60884Z",
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
  "command_id": "5967a982-6ad3-4814-bfd6-ca1d802adf52",
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
  "session_id": "e0bd551d-5c12-4d88-b1ad-600bb34ffeaf",
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
  "last_heartbeat_at": "2026-10-30T20:43:30.60884Z",
  "last_location_at": "2026-10-30T20:43:30.60884Z",
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
  "phone": "+380681293136",
  "device_ref": "sandbox-25123"
}
```

```json
{
  "challenge_id": "a9be68e0-e1e2-4593-bc9a-0ede6ed026fc",
  "expires_at": "2026-10-30T20:48:31.537955865Z",
  "resend_available_at": "2026-10-30T20:43:32.537955865Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681293136` → **200**

```json
{
  "phone": "+380681293136",
  "audience": "CLIENT",
  "code": "059890",
  "sent_at": "2026-10-30T20:43:31.541790662Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9be68e0-e1e2-4593-bc9a-0ede6ed026fc",
  "code": "059890",
  "device_ref": "sandbox-25123"
}
```

```json
{
  "session_id": "d4a15b3a-0d10-43bb-8b9f-873cba2bc4ef",
  "subject": {
    "type": "CLIENT",
    "id": "7c9ba5bb-b0b9-4ec1-a029-dac4687ad67c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzliYTViYi1iMGI5LTRlYzEtYTAyOS1kYWM0Njg3YWQ2N2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkzOTExLCJpYXQiOjE3OTMzOTMwMTEsImp0aSI6ImFlMTczM2I5LTM2NGQtNDZiMC1hZjcxLWY4OGJkZDVjZWEwZSIsInNpZCI6ImQ0YTE1YjNhLTBkMTAtNDNiYi04YjlmLTg3M2NiYTJiYzRlZiJ9.s5r3OLAlTMxD2bVnnHiP9jFedOrtfnXiQwlO09c7H7k",
  "access_expires_at": "2026-10-30T20:58:31.798666746Z",
  "refresh_token": "RPX9Lss0xBuvSkMv2JVl9Z_QF40G_JSG4SrPMJ9ky1w",
  "refresh_expires_at": "2026-11-29T20:43:31.798042046Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9893d4ab-79a8-4120-8d34-4897d51224ee",
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
  "id": "584b2d04-5e5e-48eb-bde2-a6bdb2bac98a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:48:32.050560Z",
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
  "command_id": "21360d25-693a-4afa-9021-1fc11cdaf334",
  "quote_id": "584b2d04-5e5e-48eb-bde2-a6bdb2bac98a",
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
  "id": "5f34f15c-c90f-45e8-949f-862fbb86900d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c9ba5bb-b0b9-4ec1-a029-dac4687ad67c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:43:32.345437Z",
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

`POST /api/driver/v1/orders/5f34f15c-c90f-45e8-949f-862fbb86900d/claim` → **409**

```json
{
  "command_id": "2ad36d52-49d2-4585-8877-19e6e3f38872"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5f34f15c-c90f-45e8-949f-862fbb86900d/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "2b7f6401-55d7-4b5d-bbcf-29b3e7f08ff2"
}
```

`GET /api/operator/v1/orders/5f34f15c-c90f-45e8-949f-862fbb86900d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T20:43:32.347529Z",
      "actor": {
        "type": "CLIENT",
        "id": "7c9ba5bb-b0b9-4ec1-a029-dac4687ad67c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5f34f15c-c90f-45e8-949f-862fbb86900d",
        "quote_id": "584b2d04-5e5e-48eb-bde2-a6bdb2bac98a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "13e65f5a-8bc8-4030-9af1-d4a5de34cba7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T20:43:32.352935Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5f34f15c-c90f-45e8-949f-862fbb86900d",
        "attempt_id": "1f51107a-546e-42f1-af68-c615a9ece7be",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "13e65f5a-8bc8-4030-9af1-d4a5de34cba7"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T20:43:32.40492Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5f34f15c-c90f-45e8-949f-862fbb86900d",
        "attempt_id": "1f51107a-546e-42f1-af68-c615a9ece7be"
      },
      "correlation_id": "13e65f5a-8bc8-4030-9af1-d4a5de34cba7"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "1f51107a-546e-42f1-af68-c615a9ece7be",
        "generation": 1,
        "started_at": "2026-10-30T20:43:32.350631Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T20:43:32.40492Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T20:43:32.354688Z",
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
  "command_id": "699e26bf-9630-4a3a-b3d2-776a69313197",
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

`POST /api/driver/v1/work-sessions/e0bd551d-5c12-4d88-b1ad-600bb34ffeaf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:34Z",
    "sequence": 1793393014127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e0bd551d-5c12-4d88-b1ad-600bb34ffeaf",
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
  "last_heartbeat_at": "2026-10-30T20:43:34.151828Z",
  "last_location_at": "2026-10-30T20:43:34.151828Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "53f4ec94-f537-43b2-bfd6-26e95b6d6abf",
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
  "id": "8e89b4d5-b38a-4b42-b7e1-d69a22a7779b",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/8e89b4d5-b38a-4b42-b7e1-d69a22a7779b/publish` → **200**

```json
{
  "command_id": "6012d6c0-c974-48b5-8846-bfda1f447ad8",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "8e89b4d5-b38a-4b42-b7e1-d69a22a7779b",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "85545bd8-470e-4ad9-81c2-e722bed9d04c",
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
  "id": "02b098c0-cdaa-48a4-a7ea-3fbded62a6e5",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/02b098c0-cdaa-48a4-a7ea-3fbded62a6e5/publish` → **200**

```json
{
  "command_id": "5f4c5df0-4f3f-45a2-a01b-a81ea40b1dfd",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "02b098c0-cdaa-48a4-a7ea-3fbded62a6e5",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "d9cbd834-0f7d-4242-ac96-107aa031faad",
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
  "id": "13c706b0-2c7e-42b6-9810-824f8bace997",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/13c706b0-2c7e-42b6-9810-824f8bace997/publish` → **200**

```json
{
  "command_id": "cc478b15-4ea1-4399-9617-11538844ca2d",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "13c706b0-2c7e-42b6-9810-824f8bace997",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=8e89b4d5-b38a-4b42-b7e1-d69a22a7779b` → **200**

```json
[
  {
    "order_id": "5f34f15c-c90f-45e8-949f-862fbb86900d",
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

`GET /api/driver/v1/broadcast-orders?zone_id=02b098c0-cdaa-48a4-a7ea-3fbded62a6e5` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=13c706b0-2c7e-42b6-9810-824f8bace997` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7de71919-371f-4277-af3c-22bb3ee6674e"
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
  "command_id": "b705a277-f288-4488-978a-0695fb8e2ad3",
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

`GET /api/operator/v1/orders/5f34f15c-c90f-45e8-949f-862fbb86900d` → **200**

```json
{
  "id": "5f34f15c-c90f-45e8-949f-862fbb86900d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c9ba5bb-b0b9-4ec1-a029-dac4687ad67c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:43:32.345437Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5f34f15c-c90f-45e8-949f-862fbb86900d/cancel` → **200**

```json
{
  "command_id": "d6b1ca38-27f4-402f-9b9e-5965f5fadac6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5f34f15c-c90f-45e8-949f-862fbb86900d",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7c9ba5bb-b0b9-4ec1-a029-dac4687ad67c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:43:32.345437Z",
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
  "session_id": "e0bd551d-5c12-4d88-b1ad-600bb34ffeaf",
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
  "last_heartbeat_at": "2026-10-30T20:43:34.151828Z",
  "last_location_at": "2026-10-30T20:43:34.151828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0bd551d-5c12-4d88-b1ad-600bb34ffeaf/close` → **200**

```json
{
  "command_id": "5775205e-69d9-4960-abc0-860f316409b3",
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
  "session_id": "4763c6a6-4d5a-4e72-9656-45870c52cdc1",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTM5MTgsImlhdCI6MTc5MzM5MzAxOCwianRpIjoiNmJjMGEyMWItNjZiZC00NDUwLTkxYmYtZTI5OGE0MjNiNTI5Iiwic2lkIjoiNDc2M2M2YTYtNGQ1YS00ZTcyLTk2NTYtNDU4NzBjNTJjZGMxIn0.V-9DDzLJp2xdXlrxzBIY5XZ56l8WH9q3eF8z7zpr3iM",
  "access_expires_at": "2026-10-30T20:58:38.412739552Z",
  "refresh_token": "AUph1I13TiiJp3TrTVoXeS3VW2DZGVL8VUpmho8cLec",
  "refresh_expires_at": "2026-10-31T08:43:38.411682945Z",
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
  "device_ref": "sandbox-29107"
}
```

```json
{
  "challenge_id": "e52415a4-a2e1-4531-8372-a07107a85630",
  "expires_at": "2026-10-30T20:48:38.883332478Z",
  "resend_available_at": "2026-10-30T20:43:39.883332478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "472576",
  "sent_at": "2026-10-30T20:43:38.887211111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e52415a4-a2e1-4531-8372-a07107a85630",
  "code": "472576",
  "device_ref": "sandbox-29107"
}
```

```json
{
  "session_id": "0c9175b4-ea1a-4972-bc70-7482bff57095",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MzkxOSwiaWF0IjoxNzkzMzkzMDE5LCJqdGkiOiIxNDI5MDIyNS05NmMzLTQyMDItODk0Ni0yYzZhODdhMjU1NjMiLCJzaWQiOiIwYzkxNzViNC1lYTFhLTQ5NzItYmM3MC03NDgyYmZmNTcwOTUifQ.GGgFfiAp8uqkKV250XEC55MTk9IKezDSqbZ1m0I06IQ",
  "access_expires_at": "2026-10-30T20:58:39.142098351Z",
  "refresh_token": "sx5cIRSJy0meonRzxt9OkQ_BBTbYorStuu0Zp2aHBT0",
  "refresh_expires_at": "2026-11-29T20:43:39.141463911Z",
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
  "command_id": "746edbeb-2948-472b-9d65-3d9eb8fdf0af",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:39Z",
    "sequence": 1793393019596
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa5d55c2-e251-4056-84a9-7e0be4117ef1",
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
  "last_heartbeat_at": "2026-10-30T20:43:39.618984Z",
  "last_location_at": "2026-10-30T20:43:39.618984Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631760464",
  "device_ref": "sandbox-30290"
}
```

```json
{
  "challenge_id": "9feda48d-a9da-4830-9bb3-7d5f01e7bb9f",
  "expires_at": "2026-10-30T20:48:39.87551379Z",
  "resend_available_at": "2026-10-30T20:43:40.87551379Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631760464` → **200**

```json
{
  "phone": "+380631760464",
  "audience": "CLIENT",
  "code": "262289",
  "sent_at": "2026-10-30T20:43:39.878875653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9feda48d-a9da-4830-9bb3-7d5f01e7bb9f",
  "code": "262289",
  "device_ref": "sandbox-30290"
}
```

```json
{
  "session_id": "1d76df93-f7c7-43a5-8450-327f8a77f45d",
  "subject": {
    "type": "CLIENT",
    "id": "dce0d566-3c87-4eb7-b0cb-afd7a809a6ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2UwZDU2Ni0zYzg3LTRlYjctYjBjYi1hZmQ3YTgwOWE2YWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkzOTIwLCJpYXQiOjE3OTMzOTMwMjAsImp0aSI6ImE3MDZlYjE3LTA2NDUtNDI4YS05YTQ2LTY2ZTRiMGQxOWU4MyIsInNpZCI6IjFkNzZkZjkzLWY3YzctNDNhNS04NDUwLTMyN2Y4YTc3ZjQ1ZCJ9.Sieg2nYYuDsYU3l8W1JSVFA2sw-TGroczOHh-U_tgV0",
  "access_expires_at": "2026-10-30T20:58:40.131163769Z",
  "refresh_token": "wLC6ZUZYdlnfF-2T-CW-BQxz2gj6ZOSOahk2Vi6uzhA",
  "refresh_expires_at": "2026-11-29T20:43:40.130638402Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04cf6400-899a-48ed-8568-70d4c198d6a5",
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
  "id": "5b813da4-14cd-419c-9271-ca154ef47371",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:48:40.362095Z",
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
  "command_id": "b8f2bab6-34b4-43e3-a031-64dc3e5691f7",
  "quote_id": "5b813da4-14cd-419c-9271-ca154ef47371",
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
  "id": "23466afd-0069-4139-94ce-064569db09eb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dce0d566-3c87-4eb7-b0cb-afd7a809a6ac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:43:40.600525Z",
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
    "id": "edbab671-177a-44b5-8a71-1dca3b621177",
    "order_id": "23466afd-0069-4139-94ce-064569db09eb",
    "expires_at": "2026-10-30T20:43:55.604472Z",
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

`POST /api/driver/v1/offers/edbab671-177a-44b5-8a71-1dca3b621177/accept` → **200**

```json
{
  "command_id": "6bced253-ee14-4358-96bb-b144c9cfa8c1"
}
```

```json
{
  "id": "1a03c9e2-ef15-4277-90b0-2d6ee4d477e4",
  "order_id": "23466afd-0069-4139-94ce-064569db09eb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "acd68404-4a16-4020-aabd-566a136a642d",
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
  "command_id": "7a35ccce-6ba5-47b1-825f-76d994e3ac33",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T20:43:41.58520217Z"
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
  "id": "acd68404-4a16-4020-aabd-566a136a642d",
  "order_id": "23466afd-0069-4139-94ce-064569db09eb",
  "assignment_id": "1a03c9e2-ef15-4277-90b0-2d6ee4d477e4",
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

`POST /api/driver/v1/work-sessions/fa5d55c2-e251-4056-84a9-7e0be4117ef1/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:42Z",
    "sequence": 1793393022312
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa5d55c2-e251-4056-84a9-7e0be4117ef1",
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
  "last_heartbeat_at": "2026-10-30T20:43:42.332207Z",
  "last_location_at": "2026-10-30T20:43:42.332207Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/acd68404-4a16-4020-aabd-566a136a642d/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3c310f97-80b7-4fee-9001-2f1db2e54899",
  "expected_version": 0
}
```

```json
{
  "id": "acd68404-4a16-4020-aabd-566a136a642d",
  "order_id": "23466afd-0069-4139-94ce-064569db09eb",
  "assignment_id": "1a03c9e2-ef15-4277-90b0-2d6ee4d477e4",
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
  "arrived_at": "2026-10-30T20:43:42.572613Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/acd68404-4a16-4020-aabd-566a136a642d/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3e8dd19a-fd4a-4e6b-989b-886dc416e8c8",
  "expected_version": 1
}
```

```json
{
  "id": "acd68404-4a16-4020-aabd-566a136a642d",
  "order_id": "23466afd-0069-4139-94ce-064569db09eb",
  "assignment_id": "1a03c9e2-ef15-4277-90b0-2d6ee4d477e4",
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
  "arrived_at": "2026-10-30T20:43:42.572613Z",
  "started_at": "2026-10-30T20:43:42.821252Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/acd68404-4a16-4020-aabd-566a136a642d/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d8f3d57f-ecf2-4383-a79e-be80de0d7ce2",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:43:43Z",
  "cash_received": true
}
```

```json
{
  "id": "acd68404-4a16-4020-aabd-566a136a642d",
  "order_id": "23466afd-0069-4139-94ce-064569db09eb",
  "assignment_id": "1a03c9e2-ef15-4277-90b0-2d6ee4d477e4",
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
  "arrived_at": "2026-10-30T20:43:42.572613Z",
  "started_at": "2026-10-30T20:43:42.821252Z",
  "completed_at": "2026-10-30T20:43:43.075769Z",
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
  "session_id": "fa5d55c2-e251-4056-84a9-7e0be4117ef1",
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
  "last_heartbeat_at": "2026-10-30T20:43:42.332207Z",
  "last_location_at": "2026-10-30T20:43:42.332207Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa5d55c2-e251-4056-84a9-7e0be4117ef1/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5b04bbab-2dce-4f2f-8c6d-28cc0cddb40d",
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
  "command_id": "2b1374fb-a6a4-4d91-a7ee-687baba3bce0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:43Z",
    "sequence": 1793393023781
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
  "correlation_id": "a37ef10a-8ee0-498a-be57-f655334dd165",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "8deb223f-c920-4162-9df9-77bd5a3eadca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:44Z",
    "sequence": 1793393024274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "57eb05d8-4818-4f6c-b931-d5ca3c06d108",
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
  "last_heartbeat_at": "2026-10-30T20:43:44.048984Z",
  "last_location_at": "2026-10-30T20:43:44.048984Z",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T20:43:41.585202Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "375567f7-4277-485c-894a-b0916bff1ad5",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T20:43:44.524046875Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "57eb05d8-4818-4f6c-b931-d5ca3c06d108",
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
  "last_heartbeat_at": "2026-10-30T20:43:44.048984Z",
  "last_location_at": "2026-10-30T20:43:44.048984Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/57eb05d8-4818-4f6c-b931-d5ca3c06d108/close` → **200**

```json
{
  "command_id": "ea702866-0bff-4869-92af-b2cc000ef373",
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
  "session_id": "fa577e7d-eb7d-4fcd-891a-cc01c1dad07b",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTM5MjUsImlhdCI6MTc5MzM5MzAyNSwianRpIjoiNDRiMjA5MTUtYjk0NS00OTU1LTk0NzYtZDE4NGMzZGVjOTI2Iiwic2lkIjoiZmE1NzdlN2QtZWI3ZC00ZmNkLTg5MWEtY2MwMWMxZGFkMDdiIn0.AOeOwCX0Yp3Z-0IUCTKa8ckq7_xIsliBdqUjBj69tqQ",
  "access_expires_at": "2026-10-30T20:58:45.442225382Z",
  "refresh_token": "NHC47Uwtacjpj_ScnPB5lyutRQcGU2Urj5ZiY6rBISo",
  "refresh_expires_at": "2026-10-31T08:43:45.441688739Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "b8242504-cf3e-4ac5-b73d-ba8def252ec3",
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
  "id": "59b83bdb-70b4-4ee5-9d5a-539a12a9f152",
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
  "created_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "created_at": "2026-10-30T20:43:45.671364Z",
  "updated_at": "2026-10-30T20:43:45.671364Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631563538",
  "device_ref": "sandbox-7556"
}
```

```json
{
  "challenge_id": "78d4ebba-3e93-4cc0-8ae1-632fd7fa1bae",
  "expires_at": "2026-10-30T20:48:45.898283674Z",
  "resend_available_at": "2026-10-30T20:43:46.898283674Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631563538` → **200**

```json
{
  "phone": "+380631563538",
  "audience": "CLIENT",
  "code": "441795",
  "sent_at": "2026-10-30T20:43:45.901350669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78d4ebba-3e93-4cc0-8ae1-632fd7fa1bae",
  "code": "441795",
  "device_ref": "sandbox-7556"
}
```

```json
{
  "session_id": "7ba89983-b985-4144-98ef-0e4b93e5b1f3",
  "subject": {
    "type": "CLIENT",
    "id": "1a3f4181-7b90-45b1-9892-2bc17bd8eeac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTNmNDE4MS03YjkwLTQ1YjEtOTg5Mi0yYmMxN2JkOGVlYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzkzOTI2LCJpYXQiOjE3OTMzOTMwMjYsImp0aSI6Ijg4ZjUxM2RlLTdkMmMtNDY4ZC1iM2RmLTM5ZGRkMTY3ZDc4ZCIsInNpZCI6IjdiYTg5OTgzLWI5ODUtNDE0NC05OGVmLTBlNGI5M2U1YjFmMyJ9.UzqLJK1STT19SRyP4oqClK5bbCd0imNuyLa6rXTXJPQ",
  "access_expires_at": "2026-10-30T20:58:46.151926719Z",
  "refresh_token": "Z9ohudAFjjThBhCz1HAVhXcNzLhPBeJaSPZQVHGQOo4",
  "refresh_expires_at": "2026-11-29T20:43:46.151280862Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631563538` → **200**

```json
{
  "client_id": "1a3f4181-7b90-45b1-9892-2bc17bd8eeac"
}
```

`POST /api/admin/v1/rider-wallets/1a3f4181-7b90-45b1-9892-2bc17bd8eeac/top-ups` → **201**

```json
{
  "command_id": "9249700a-69c3-4d52-be11-8fe5138ff096",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1a3f4181-7b90-45b1-9892-2bc17bd8eeac",
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
      "id": "0de0ffee-a7b7-42dd-97e4-cb8f778dbba6",
      "at": "2026-10-30T20:43:46.613149Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0cd9d864-d606-4ffb-b244-9e7a017fae4e",
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
  "id": "26a11c1f-6ac2-4325-b3b3-ba61ff5f925d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:48:46.864326Z",
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
      "id": "59b83bdb-70b4-4ee5-9d5a-539a12a9f152",
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
  "device_ref": "sandbox-28119"
}
```

```json
{
  "challenge_id": "e3eaf9d4-300f-4ab5-a9e8-8ef669aebb77",
  "expires_at": "2026-10-30T20:48:47.1013372Z",
  "resend_available_at": "2026-10-30T20:43:48.1013372Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "693517",
  "sent_at": "2026-10-30T20:43:47.104241948Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3eaf9d4-300f-4ab5-a9e8-8ef669aebb77",
  "code": "693517",
  "device_ref": "sandbox-28119"
}
```

```json
{
  "session_id": "5c034851-7f5f-4c8a-99d7-4284677bd0d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MzkyNywiaWF0IjoxNzkzMzkzMDI3LCJqdGkiOiI2NDM4YjE3Mi00NTkzLTRjNzAtYWQ0Ny1lNDc5MmI3OTAzMjUiLCJzaWQiOiI1YzAzNDg1MS03ZjVmLTRjOGEtOTlkNy00Mjg0Njc3YmQwZDIifQ.sUv_P9oDsI1w13r25OVhgd4bEuIURfslZ2NPwD9vckg",
  "access_expires_at": "2026-10-30T20:58:47.365832003Z",
  "refresh_token": "_46pzUS4FxdqBRb3rYA0bLDodrYLdFZ0cCKAqZdB7og",
  "refresh_expires_at": "2026-11-29T20:43:47.365340277Z",
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
  "command_id": "4e0605a0-38f7-4336-8fb1-6c7d0fad2016",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:47Z",
    "sequence": 1793393027860
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2053b7e-8883-4165-be39-bca1b117927a",
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
  "last_heartbeat_at": "2026-10-30T20:43:47.882169Z",
  "last_location_at": "2026-10-30T20:43:47.882169Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9dc6e7c1-6bcf-4cbb-8514-766205e7360f",
  "quote_id": "26a11c1f-6ac2-4325-b3b3-ba61ff5f925d",
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
  "id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a3f4181-7b90-45b1-9892-2bc17bd8eeac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:43:48.153176Z",
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
  "client_id": "1a3f4181-7b90-45b1-9892-2bc17bd8eeac",
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
      "id": "0de0ffee-a7b7-42dd-97e4-cb8f778dbba6",
      "at": "2026-10-30T20:43:46.613149Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
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
    "id": "c4a353a5-1f2c-446a-9a9e-56ac44f94e7f",
    "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
    "expires_at": "2026-10-30T20:44:03.161428Z",
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

`POST /api/driver/v1/offers/c4a353a5-1f2c-446a-9a9e-56ac44f94e7f/accept` → **200**

```json
{
  "command_id": "5ee72da0-9e4e-46cd-b36b-e2e799786363"
}
```

```json
{
  "id": "3f826a54-6583-41c2-8bcd-a66ff8a2aea0",
  "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a1b4b269-dbee-40d5-984f-6cb9b688dd59",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a1b4b269-dbee-40d5-984f-6cb9b688dd59",
  "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
  "assignment_id": "3f826a54-6583-41c2-8bcd-a66ff8a2aea0",
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

`POST /api/driver/v1/work-sessions/c2053b7e-8883-4165-be39-bca1b117927a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:51Z",
    "sequence": 1793393031333
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2053b7e-8883-4165-be39-bca1b117927a",
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
  "last_heartbeat_at": "2026-10-30T20:43:51.352749Z",
  "last_location_at": "2026-10-30T20:43:51.352749Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a1b4b269-dbee-40d5-984f-6cb9b688dd59/arrive` → **200**

```json
{
  "command_id": "bc75c07b-b83f-48a6-8363-97110431fa45",
  "expected_version": 0
}
```

```json
{
  "id": "a1b4b269-dbee-40d5-984f-6cb9b688dd59",
  "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
  "assignment_id": "3f826a54-6583-41c2-8bcd-a66ff8a2aea0",
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
  "arrived_at": "2026-10-30T20:43:51.59047Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a1b4b269-dbee-40d5-984f-6cb9b688dd59/start` → **200**

```json
{
  "command_id": "820876f1-48c6-498e-a83a-1ca1aaca6c51",
  "expected_version": 1
}
```

```json
{
  "id": "a1b4b269-dbee-40d5-984f-6cb9b688dd59",
  "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
  "assignment_id": "3f826a54-6583-41c2-8bcd-a66ff8a2aea0",
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
  "arrived_at": "2026-10-30T20:43:51.59047Z",
  "started_at": "2026-10-30T20:43:51.824485Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a1b4b269-dbee-40d5-984f-6cb9b688dd59/complete` → **200**

```json
{
  "command_id": "31212bf5-f9a9-4779-8706-37f6fa0e9445",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:43:52Z",
  "cash_received": true
}
```

```json
{
  "id": "a1b4b269-dbee-40d5-984f-6cb9b688dd59",
  "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
  "assignment_id": "3f826a54-6583-41c2-8bcd-a66ff8a2aea0",
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
  "arrived_at": "2026-10-30T20:43:51.59047Z",
  "started_at": "2026-10-30T20:43:51.824485Z",
  "completed_at": "2026-10-30T20:43:52.080116Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1a3f4181-7b90-45b1-9892-2bc17bd8eeac",
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
      "id": "dd7ffa0e-6682-4e0d-a581-64fe97b5bff2",
      "at": "2026-10-30T20:43:52.883289Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe"
    },
    {
      "id": "0de0ffee-a7b7-42dd-97e4-cb8f778dbba6",
      "at": "2026-10-30T20:43:46.613149Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
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

`POST /api/admin/v1/promotions/59b83bdb-70b4-4ee5-9d5a-539a12a9f152/archive` → **200**

```json
{
  "command_id": "ec00f05d-52e8-4d44-ab13-7d4d85ab0211",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "59b83bdb-70b4-4ee5-9d5a-539a12a9f152",
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
  "created_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "created_at": "2026-10-30T20:43:45.671364Z",
  "updated_at": "2026-10-30T20:43:55.543206Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c2053b7e-8883-4165-be39-bca1b117927a",
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
  "last_heartbeat_at": "2026-10-30T20:43:51.352749Z",
  "last_location_at": "2026-10-30T20:43:51.352749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c2053b7e-8883-4165-be39-bca1b117927a/close` → **200**

```json
{
  "command_id": "8d6f7477-12d4-4aa1-a6fd-4df1ca8eddf4",
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

Done: order 64b9d3cb-fb48-4450-9ed5-37425982cbbe.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-31171"
}
```

```json
{
  "challenge_id": "d2b196ed-9a73-45c9-bcf0-9cd0e5975f09",
  "expires_at": "2026-10-30T20:48:56.232250818Z",
  "resend_available_at": "2026-10-30T20:43:57.232250818Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "214232",
  "sent_at": "2026-10-30T20:43:56.235014976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2b196ed-9a73-45c9-bcf0-9cd0e5975f09",
  "code": "214232",
  "device_ref": "sandbox-31171"
}
```

```json
{
  "session_id": "1a5930a1-7797-445b-a596-7ec512fe0e82",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5MzkzNiwiaWF0IjoxNzkzMzkzMDM2LCJqdGkiOiIzNDgzZDRkYi0wYWJiLTRhMGUtODU3OS0yYWM0OGEzZTZhMzIiLCJzaWQiOiIxYTU5MzBhMS03Nzk3LTQ0NWItYTU5Ni03ZWM1MTJmZTBlODIifQ.KXieZP4fpB7WTUwpKhIrF8NSxF-pM8K7Vv5eG3F2Oqk",
  "access_expires_at": "2026-10-30T20:58:56.480651211Z",
  "refresh_token": "UWkf6qtCN2gZD4HqaEGRJaqXdcauo47yBQZ7qAWrJzU",
  "refresh_expires_at": "2026-11-29T20:43:56.479131236Z",
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
  "command_id": "60f1e33b-5c34-4c16-8c5a-03532e10463e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:43:57Z",
    "sequence": 1793393037151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "697eff6b-d215-4c42-9a33-76903dd50443",
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
  "last_heartbeat_at": "2026-10-30T20:43:57.170404Z",
  "last_location_at": "2026-10-30T20:43:57.170404Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/697eff6b-d215-4c42-9a33-76903dd50443/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:44:02Z",
    "sequence": 1793393042396
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "697eff6b-d215-4c42-9a33-76903dd50443",
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
  "last_heartbeat_at": "2026-10-30T20:44:02.416196Z",
  "last_location_at": "2026-10-30T20:43:57.170404Z",
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
  "session_id": "78ff24bf-1da3-4a68-978d-cff8f2a1f038",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTM5NDIsImlhdCI6MTc5MzM5MzA0MiwianRpIjoiOWQxNDhmMjEtYmMwOS00NjhhLTg4NTUtZGZmOTI5YzY0NjU3Iiwic2lkIjoiNzhmZjI0YmYtMWRhMy00YTY4LTk3OGQtY2ZmOGYyYTFmMDM4In0.z6cVALqPXN6BaEFTWpOgmk3rM0BskGg6S_NNuUJDP8c",
  "access_expires_at": "2026-10-30T20:59:02.875257465Z",
  "refresh_token": "MJgSfAP1bnRiU-cN1e0kkQqA9ENx1odW6WFPVt2KgoQ",
  "refresh_expires_at": "2026-10-31T08:44:02.874836965Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T20:44:03.084988063Z",
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
      "last_location_at": "2026-10-30T20:43:57.170404Z",
      "last_heartbeat_at": "2026-10-30T20:44:02.416196Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/697eff6b-d215-4c42-9a33-76903dd50443/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:44:03Z",
    "sequence": 1793393043315
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "697eff6b-d215-4c42-9a33-76903dd50443",
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
  "last_heartbeat_at": "2026-10-30T20:44:03.335618Z",
  "last_location_at": "2026-10-30T20:44:03.335618Z",
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
  "session_id": "697eff6b-d215-4c42-9a33-76903dd50443",
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
  "last_heartbeat_at": "2026-10-30T20:44:03.335618Z",
  "last_location_at": "2026-10-30T20:44:03.335618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/697eff6b-d215-4c42-9a33-76903dd50443/close` → **200**

```json
{
  "command_id": "dba18865-4555-41a6-a6d0-62e612266374",
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
  "device_ref": "sandbox-18362"
}
```

```json
{
  "challenge_id": "aa500502-6619-48bb-be8b-2266b5e2b5ab",
  "expires_at": "2026-10-30T20:49:04.028910269Z",
  "resend_available_at": "2026-10-30T20:44:05.028910269Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "889106",
  "sent_at": "2026-10-30T20:44:04.032554148Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa500502-6619-48bb-be8b-2266b5e2b5ab",
  "code": "889106",
  "device_ref": "sandbox-18362"
}
```

```json
{
  "session_id": "39ac1730-5ffb-4f6b-be04-a4600a1059e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5Mzk0NCwiaWF0IjoxNzkzMzkzMDQ0LCJqdGkiOiI3YzU0OWUzZi1iMDllLTQ3MzgtOGViMy04MzZkOWQ0NTRjOWYiLCJzaWQiOiIzOWFjMTczMC01ZmZiLTRmNmItYmUwNC1hNDYwMGExMDU5ZTUifQ.1PJQC1s2vs5Gxb6LHv6XQ8uk8cvSJ10Oz0Etybj4Ww4",
  "access_expires_at": "2026-10-30T20:59:04.278733767Z",
  "refresh_token": "-PYDJ5yRFElAAFAlqZaHClDDCPscFOxG5-4brHT2lCQ",
  "refresh_expires_at": "2026-11-29T20:44:04.278309783Z",
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
  "device_ref": "sandbox-2283"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "8ef77e39-a22d-4a6f-bad1-8354f7fd7abf",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-2283"
}
```

```json
{
  "challenge_id": "7d4f0f73-a05f-4b56-a72c-58ba0702c1d3",
  "expires_at": "2026-10-30T20:49:05.960189632Z",
  "resend_available_at": "2026-10-30T20:44:06.960189632Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "867518",
  "sent_at": "2026-10-30T20:44:05.962345027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d4f0f73-a05f-4b56-a72c-58ba0702c1d3",
  "code": "867518",
  "device_ref": "sandbox-2283"
}
```

```json
{
  "session_id": "d59bcbec-055e-4657-9563-714c8b47145d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5Mzk0NiwiaWF0IjoxNzkzMzkzMDQ2LCJqdGkiOiI2ZjNjMzg1NC1lMTQ1LTRjZGEtOTFmNS01YzJiNTZhNzM1NjYiLCJzaWQiOiJkNTliY2JlYy0wNTVlLTQ2NTctOTU2My03MTRjOGI0NzE0NWQifQ.qwi8-tY_-8u0ACRoeTRAzk9u4NeC9kmsvJkGnKpcfrM",
  "access_expires_at": "2026-10-30T20:59:06.200873897Z",
  "refresh_token": "-DrSS17YQYV11Et5V99zYdfo9NFqi8FQtb7qIVQBQKA",
  "refresh_expires_at": "2026-11-29T20:44:06.200419217Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-29342"
}
```

```json
{
  "challenge_id": "2f55d618-1171-4856-afa7-2984714b8727",
  "expires_at": "2026-10-30T20:49:06.418761691Z",
  "resend_available_at": "2026-10-30T20:44:07.418761691Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "632720",
  "sent_at": "2026-10-30T20:44:06.42104041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f55d618-1171-4856-afa7-2984714b8727",
  "code": "632720",
  "device_ref": "sandbox-29342"
}
```

```json
{
  "session_id": "fe1627bf-250a-4024-85ff-6455eb587389",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5Mzk0NiwiaWF0IjoxNzkzMzkzMDQ2LCJqdGkiOiJjYzM4ZTMyZi1lZDZlLTRjNGUtOTQ1Yy1hOWNjY2JjNTQzMWEiLCJzaWQiOiJmZTE2MjdiZi0yNTBhLTQwMjQtODVmZi02NDU1ZWI1ODczODkifQ.lceVFSaG_2btUi_C4MFeIPX0ArrU2lKaJO7aFI0VRXY",
  "access_expires_at": "2026-10-30T20:59:06.678974032Z",
  "refresh_token": "zF-4C68XhJXBlv-knnHcU48fhaPbSd54AfMuf-rAF4w",
  "refresh_expires_at": "2026-11-29T20:44:06.678374935Z",
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
  "command_id": "469f86d5-75b3-417c-acef-81f448e577cf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:47:11Z",
    "sequence": 1793393231341
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2ab1b033-2000-4233-bc0a-a3bce81ba827",
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
  "last_heartbeat_at": "2026-10-30T20:47:11.361478Z",
  "last_location_at": "2026-10-30T20:47:11.361478Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600160295",
  "device_ref": "sandbox-13876"
}
```

```json
{
  "challenge_id": "88297928-521c-4643-9838-c2dc8bc6edc6",
  "expires_at": "2026-10-30T20:52:11.592015137Z",
  "resend_available_at": "2026-10-30T20:47:12.592015137Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600160295` → **200**

```json
{
  "phone": "+48600160295",
  "audience": "CLIENT",
  "code": "708274",
  "sent_at": "2026-10-30T20:47:11.594893241Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88297928-521c-4643-9838-c2dc8bc6edc6",
  "code": "708274",
  "device_ref": "sandbox-13876"
}
```

```json
{
  "session_id": "c297e0e4-3fd8-4a09-8e7e-4efe5c03bc22",
  "subject": {
    "type": "CLIENT",
    "id": "65985d5b-660a-44d4-a085-c87f1b85592b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTk4NWQ1Yi02NjBhLTQ0ZDQtYTA4NS1jODdmMWI4NTU5MmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MTMxLCJpYXQiOjE3OTMzOTMyMzEsImp0aSI6IjBhODhkNjUzLWQ5ZGEtNDc5OS1iNjU0LWVmMmQwZjdlYjgyZCIsInNpZCI6ImMyOTdlMGU0LTNmZDgtNGEwOS04ZTdlLTRlZmU1YzAzYmMyMiJ9.5ExnzUBgntf9EO7KwwwLj1eefCkRPBuEXJ9OOsRHYts",
  "access_expires_at": "2026-10-30T21:02:11.848064787Z",
  "refresh_token": "oZEr3SyMqQQAapq8FMACPt6FCUlVmUh54f6-woNPxbY",
  "refresh_expires_at": "2026-11-29T20:47:11.847514872Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1b3e2afe-c199-4372-ba63-a13db162fb7e",
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
  "id": "8492bba2-cbd3-443a-b7d5-7b0074527eed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:52:12.082962Z",
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
  "command_id": "d1d5c439-469e-44d8-9a9a-f4644a24661b",
  "quote_id": "8492bba2-cbd3-443a-b7d5-7b0074527eed",
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
  "id": "a8796da2-be1e-4912-a516-339fb89108cf",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65985d5b-660a-44d4-a085-c87f1b85592b",
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
  "created_at": "2026-10-30T20:47:12.328425Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf` → **200**

```json
{
  "id": "a8796da2-be1e-4912-a516-339fb89108cf",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65985d5b-660a-44d4-a085-c87f1b85592b",
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
  "created_at": "2026-10-30T20:47:12.328425Z",
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

`POST /api/driver/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf/claim` → **422**

```json
{
  "command_id": "2e34c567-7421-435f-a3b9-0ebe816d7bf3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "b20e7785-5fb2-4ff8-804f-e0340b9ca6a4"
}
```

`GET /api/rider/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf` → **200**

```json
{
  "id": "a8796da2-be1e-4912-a516-339fb89108cf",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65985d5b-660a-44d4-a085-c87f1b85592b",
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
  "created_at": "2026-10-30T20:47:12.328425Z",
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

`POST /api/driver/v1/orders/cced03c2-0ca6-4d10-a138-937f23e95d5c/claim` → **404**

```json
{
  "command_id": "d108c015-5c0d-4bc7-89a7-217646b67113"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cced03c2-0ca6-4d10-a138-937f23e95d5c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9e3558bd-c2eb-4626-a76d-ee0b0aa9199e"
}
```

`POST /api/driver/v1/orders/a87e3cb8-9efe-42b9-80cb-43ca4dacbdf2/claim` → **404**

```json
{
  "command_id": "3c04059b-59f0-4b40-a96f-b01d3d618443"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a87e3cb8-9efe-42b9-80cb-43ca4dacbdf2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "06d9836e-edb7-470f-8e9b-57e46f60b4bb"
}
```

`POST /api/driver/v1/orders/e4457230-b93f-4173-a906-8e563069ddfc/claim` → **404**

```json
{
  "command_id": "ccf9e050-6653-48d3-954c-f38e26473181"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e4457230-b93f-4173-a906-8e563069ddfc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ce981174-d7f0-4270-973c-54e1145a5295"
}
```

`POST /api/driver/v1/orders/c4664a4d-6ac1-4e5a-83d3-29958b81b6d1/claim` → **404**

```json
{
  "command_id": "c8dbc175-b0f8-487e-a8d7-50d6a6bc1962"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c4664a4d-6ac1-4e5a-83d3-29958b81b6d1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5f0b8ff3-d296-4e80-83a7-88da2a6166a5"
}
```

`POST /api/driver/v1/orders/f43f1a15-9fd3-48b8-87b5-0b298b8fdc57/claim` → **404**

```json
{
  "command_id": "4716133b-11d5-4ca8-bef8-aa03211921c6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f43f1a15-9fd3-48b8-87b5-0b298b8fdc57/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "64985bd4-cebd-4d1d-97d5-998e173bb549"
}
```

`POST /api/driver/v1/orders/300dbaea-ebc4-43c5-a843-526c5bcb3e6e/claim` → **404**

```json
{
  "command_id": "d93a9d05-7a1a-4ca4-9793-c791ebdf7621"
}
```

```json
{
  "instance": "/api/driver/v1/orders/300dbaea-ebc4-43c5-a843-526c5bcb3e6e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6cdb5479-be0a-4ad9-b99f-5fe8f3fb085c"
}
```

`POST /api/driver/v1/orders/a983f2a5-2093-492a-9668-ffdee7e2b62e/claim` → **404**

```json
{
  "command_id": "31f27c53-05d5-4cbc-9bf9-72339c97f21a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a983f2a5-2093-492a-9668-ffdee7e2b62e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8b805ec9-1f53-469a-923b-859827dbb579"
}
```

`POST /api/driver/v1/orders/4edf0c83-c93c-41e5-9734-650e9fc24ce7/claim` → **404**

```json
{
  "command_id": "67f8fd46-76ad-4cb1-b692-0e55e86cf976"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4edf0c83-c93c-41e5-9734-650e9fc24ce7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8597ac73-aa69-4a06-9570-46e321f6d44f"
}
```

`POST /api/driver/v1/orders/0b93baf2-7bf0-4af3-8049-b60b112ba0a5/claim` → **404**

```json
{
  "command_id": "2e3def04-f057-44d2-9470-1a372ca75754"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0b93baf2-7bf0-4af3-8049-b60b112ba0a5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a28d56d9-16f9-4ba1-8f48-3d955fe541c2"
}
```

`POST /api/driver/v1/orders/753ffa7f-846b-4c39-8135-c9707d29857e/claim` → **404**

```json
{
  "command_id": "44d96a39-d0ed-44b3-9690-69ee6195bca5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/753ffa7f-846b-4c39-8135-c9707d29857e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e0f5bf24-acd5-45a4-8a3f-8ee8c17c45bb"
}
```

`POST /api/driver/v1/orders/f4eaee2f-0efa-4439-b5c6-067a9bb0fbe3/claim` → **404**

```json
{
  "command_id": "728a28f2-a45a-4c6f-b63a-64c5bf27084f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f4eaee2f-0efa-4439-b5c6-067a9bb0fbe3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fa00f454-e26e-4894-8256-7ea5ebdc21cb"
}
```

`POST /api/driver/v1/orders/b089c671-ec06-4ef8-8e6a-361c82bd8936/claim` → **404**

```json
{
  "command_id": "9df9bf16-6f72-4816-9a9d-410b463bb744"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b089c671-ec06-4ef8-8e6a-361c82bd8936/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "13b631a0-2129-4146-a92f-5d29a15c6920"
}
```

`POST /api/driver/v1/orders/268872a9-ce76-4fcd-9ab4-c4285d3ba7a0/claim` → **404**

```json
{
  "command_id": "a836c0e2-be53-49d2-8775-d1c366091dab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/268872a9-ce76-4fcd-9ab4-c4285d3ba7a0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b5d6917d-0633-4f66-8e47-a7def5ad996a"
}
```

`POST /api/driver/v1/orders/14f80654-b7f5-4128-bfd7-258f16ade22a/claim` → **404**

```json
{
  "command_id": "b747ad7f-75e9-4d27-a6da-fcdc35848121"
}
```

```json
{
  "instance": "/api/driver/v1/orders/14f80654-b7f5-4128-bfd7-258f16ade22a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fba426a8-b0bb-4d5a-8917-365ef95686d4"
}
```

`POST /api/driver/v1/orders/112b77c2-cdde-495d-a315-c1e6306721df/claim` → **404**

```json
{
  "command_id": "6cde0a3c-20e6-4034-b1ac-f7bae8063c4e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/112b77c2-cdde-495d-a315-c1e6306721df/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "550814c1-46b1-47fb-bd7f-c9a98153a63e"
}
```

`POST /api/driver/v1/orders/55217651-6c60-4a63-85bb-83db27982228/claim` → **404**

```json
{
  "command_id": "6f546937-41fd-4caf-8554-82ed75ce7732"
}
```

```json
{
  "instance": "/api/driver/v1/orders/55217651-6c60-4a63-85bb-83db27982228/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a369cd5a-4b8c-470f-a7e5-f61f49957afb"
}
```

`POST /api/driver/v1/orders/3f8c2d74-785c-49ba-962b-4a71ded251ac/claim` → **404**

```json
{
  "command_id": "3e355229-bbd5-48f0-8774-87775a440af6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3f8c2d74-785c-49ba-962b-4a71ded251ac/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "36aee5f4-ff35-4df3-835a-119329141648"
}
```

`POST /api/driver/v1/orders/7ea440a9-274f-4058-932a-e3ae6bb7a950/claim` → **404**

```json
{
  "command_id": "b0c634dc-aab5-46b3-b839-ae02ce82e40f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7ea440a9-274f-4058-932a-e3ae6bb7a950/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fad07320-d566-42d1-a960-5227759eb40d"
}
```

`POST /api/driver/v1/orders/a2706773-7338-4167-8674-1f7667fd9c24/claim` → **404**

```json
{
  "command_id": "7a4266c5-f832-432b-a4b3-e06e5e3ad761"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a2706773-7338-4167-8674-1f7667fd9c24/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f10a58f4-17f7-478d-95f4-04a27b1014ee"
}
```

`POST /api/driver/v1/orders/68987762-64d0-419f-a550-f2dc77c88c9c/claim` → **404**

```json
{
  "command_id": "c5f2797b-7c55-4f0c-934f-a87419c86071"
}
```

```json
{
  "instance": "/api/driver/v1/orders/68987762-64d0-419f-a550-f2dc77c88c9c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9bc9388a-fd37-4d3c-a50b-50f1ca5243b5"
}
```

`POST /api/driver/v1/orders/2326e48f-be71-482e-8ce1-c4de55d780fd/claim` → **404**

```json
{
  "command_id": "e0a0843d-b708-4fb6-8f8e-9e4e1e0648f5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2326e48f-be71-482e-8ce1-c4de55d780fd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "16bc6a8f-ba6f-4f20-9514-96378bd8568d"
}
```

`POST /api/driver/v1/orders/fe9c38c6-51f0-455b-a691-7fb2ae23eb0f/claim` → **404**

```json
{
  "command_id": "20f817aa-d1b9-4bf6-a1d2-aacd4614dcde"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fe9c38c6-51f0-455b-a691-7fb2ae23eb0f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4cac4f18-30dd-477b-a0f4-235828f2ce7d"
}
```

`POST /api/driver/v1/orders/9c28947b-bfe0-400e-9a8a-8e752d7adfef/claim` → **404**

```json
{
  "command_id": "753b4287-25e3-4be6-8632-f4cb88ce05e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9c28947b-bfe0-400e-9a8a-8e752d7adfef/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e757b747-c167-459b-9073-30a051d0939d"
}
```

`POST /api/driver/v1/orders/293f7869-a805-4424-abdd-c43f1b384f40/claim` → **404**

```json
{
  "command_id": "f5b55d35-3dc9-4ff3-9358-29887f50e309"
}
```

```json
{
  "instance": "/api/driver/v1/orders/293f7869-a805-4424-abdd-c43f1b384f40/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "80f49fda-6a9e-448a-9936-c0971ea02a5d"
}
```

`POST /api/driver/v1/orders/c95cc3f5-4333-4e76-ba2c-2dcafb40bca0/claim` → **404**

```json
{
  "command_id": "1c44bc67-3bf6-4cdb-9e7d-42aa003ad86f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c95cc3f5-4333-4e76-ba2c-2dcafb40bca0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6a6b9a35-9b84-4956-8565-2c91ec127d0a"
}
```

`POST /api/driver/v1/orders/c9bf4157-88c7-4725-8598-7c62b145f66a/claim` → **404**

```json
{
  "command_id": "9cac7c52-d6ae-4501-9aa3-d2ff14795edc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c9bf4157-88c7-4725-8598-7c62b145f66a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "311ad6c9-2575-431f-8300-4422596cb426"
}
```

`POST /api/driver/v1/orders/d9bd746e-4dee-49fe-bd9b-aede69640698/claim` → **404**

```json
{
  "command_id": "12f66497-af8a-49ac-bc49-dc81f9b4a6de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d9bd746e-4dee-49fe-bd9b-aede69640698/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6ca52bc5-911d-4784-a3e9-0b2bb3386a9f"
}
```

`POST /api/driver/v1/orders/b5a4fd7b-6d40-4637-886d-3beae90f289f/claim` → **404**

```json
{
  "command_id": "a80b8afb-06fa-4097-b66f-619d968bdd18"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b5a4fd7b-6d40-4637-886d-3beae90f289f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "102cf48a-a35e-4958-8b18-9ee245285acb"
}
```

`POST /api/driver/v1/orders/89dc404c-db09-4a0a-9e82-35aeb7692756/claim` → **404**

```json
{
  "command_id": "c65c76db-99a7-424b-8e62-a06aea36fd7a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/89dc404c-db09-4a0a-9e82-35aeb7692756/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cf5e6e71-847c-427d-b222-69cfb1de227d"
}
```

`POST /api/driver/v1/orders/3a31e7b7-310b-4ed9-ba3a-d23404fb1b24/claim` → **429**

```json
{
  "command_id": "5bb36661-1ff2-4b0c-8330-2830fb1add65"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3a31e7b7-310b-4ed9-ba3a-d23404fb1b24/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "982aa2c9-87f5-46c3-86cf-3c493e5aec6d",
  "retryable": true,
  "retry_after_seconds": 593
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
  "command_id": "b37ad993-04ab-4fed-ae51-2c81db7d8955",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:47:20Z",
    "sequence": 1793393240856
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3a06e125-bcd9-46bd-a800-7ae4264cc44b",
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
  "last_heartbeat_at": "2026-10-30T20:47:20.87678Z",
  "last_location_at": "2026-10-30T20:47:20.87678Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "a8796da2-be1e-4912-a516-339fb89108cf",
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

`POST /api/driver/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf/claim` → **409**

```json
{
  "command_id": "7b3ff64d-f848-4dc3-9622-ee0c32045b1c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ff2675d2-e28f-4738-afab-359b4bcfbe8a"
}
```

`POST /api/driver/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf/claim` → **200**

```json
{
  "command_id": "2e83f9a1-41f9-40d7-bfd0-b2a35fa5bd2c"
}
```

```json
{
  "id": "ea64627f-ebda-4abf-b682-4f443602e50a",
  "order_id": "a8796da2-be1e-4912-a516-339fb89108cf",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "1dcda438-e65f-46dc-b053-222d5a901d1d",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1dcda438-e65f-46dc-b053-222d5a901d1d",
  "order_id": "a8796da2-be1e-4912-a516-339fb89108cf",
  "assignment_id": "ea64627f-ebda-4abf-b682-4f443602e50a",
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

`POST /api/driver/v1/trips/1dcda438-e65f-46dc-b053-222d5a901d1d/cancel` → **200**

```json
{
  "command_id": "8ab6d32c-3c71-4152-9a6d-fbfe6bc58dd6",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1dcda438-e65f-46dc-b053-222d5a901d1d",
  "order_id": "a8796da2-be1e-4912-a516-339fb89108cf",
  "assignment_id": "ea64627f-ebda-4abf-b682-4f443602e50a",
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

`GET /api/rider/v1/orders/a8796da2-be1e-4912-a516-339fb89108cf` → **200**

```json
{
  "id": "a8796da2-be1e-4912-a516-339fb89108cf",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "65985d5b-660a-44d4-a085-c87f1b85592b",
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
    "id": "ea64627f-ebda-4abf-b682-4f443602e50a",
    "order_id": "a8796da2-be1e-4912-a516-339fb89108cf",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "1dcda438-e65f-46dc-b053-222d5a901d1d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T20:47:12.328425Z",
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
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2ab1b033-2000-4233-bc0a-a3bce81ba827",
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
  "last_heartbeat_at": "2026-10-30T20:47:11.361478Z",
  "last_location_at": "2026-10-30T20:47:11.361478Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ab1b033-2000-4233-bc0a-a3bce81ba827/close` → **200**

```json
{
  "command_id": "b93bbe7a-8aeb-45b1-87cf-2af786de4991",
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
  "session_id": "3a06e125-bcd9-46bd-a800-7ae4264cc44b",
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
  "last_heartbeat_at": "2026-10-30T20:47:20.87678Z",
  "last_location_at": "2026-10-30T20:47:20.87678Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a06e125-bcd9-46bd-a800-7ae4264cc44b/close` → **200**

```json
{
  "command_id": "7435c9f4-c28f-4f9b-b897-2ddafeb6fe08",
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
  "session_id": "6bf7d59e-2c11-4e93-b3fe-268a134fad43",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQxNDMsImlhdCI6MTc5MzM5MzI0MywianRpIjoiOWQxODU2MzQtNTMzMy00ZWMwLTgwNzAtMjg5ODFiNGIzM2VkIiwic2lkIjoiNmJmN2Q1OWUtMmMxMS00ZTkzLWIzZmUtMjY4YTEzNGZhZDQzIn0.kNT3t1fYPZMd7N6SWNIr8KLhK6icPHQ0Vhvmg7niKxU",
  "access_expires_at": "2026-10-30T21:02:23.665215795Z",
  "refresh_token": "B_sYX6zvHe6XinxFGRZzDOvYDswZ7rlZnhs6vTiu_X0",
  "refresh_expires_at": "2026-10-31T08:47:23.664647514Z",
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
  "command_id": "653d9240-6252-4c3e-b8d0-a190bb5c6ae3",
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
  "session_id": "da82abbe-8a4b-4659-b6ad-0d78422c6ea9",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQxNDQsImlhdCI6MTc5MzM5MzI0NCwianRpIjoiYjY0MDYxNzctZGZlMy00NjRjLWFjYmEtOGE4YzgwNjE3MWMwIiwic2lkIjoiZGE4MmFiYmUtOGE0Yi00NjU5LWI2YWQtMGQ3ODQyMmM2ZWE5In0.ZXZ6s4eiKsHNVsSBmk5YJDuq9VxoUxDTEnWtzkJK6Fg",
  "access_expires_at": "2026-10-30T21:02:24.582044537Z",
  "refresh_token": "P1b1aJoa3_hsHCZ8NlLaZMFIy5y35hzTGaOmI0LQD90",
  "refresh_expires_at": "2026-10-31T08:47:24.581427966Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.100711209",
    "linkedid": "1730052700.100711209",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671158841"
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
    "id": "1730052700.100711209",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "102131d8-cce4-4c86-8e36-d776da6d8631",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671158841",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T20:47:24.806679Z",
      "answered_at": null,
      "ended_at": "2026-10-30T20:47:24.833616Z",
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
    "id": "1730052600.2620915694",
    "linkedid": "1730052600.2620915694",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671158841"
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
      "id": "086ad18c-d369-4516-846f-fdd44ff38152",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671158841",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T20:47:25.116149Z",
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

`POST /api/operator/v1/calls/086ad18c-d369-4516-846f-fdd44ff38152/answer` → **200**

```json
{
  "command_id": "6cd94135-ac45-40db-b723-b71987892aa5"
}
```

```json
{
  "id": "086ad18c-d369-4516-846f-fdd44ff38152",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671158841",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "order_ids": [],
  "started_at": "2026-10-30T20:47:25.116149Z",
  "answered_at": "2026-10-30T20:47:25.368167Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2620915694",
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
    "id": "1730052600.2620915694",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "086ad18c-d369-4516-846f-fdd44ff38152",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671158841",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [],
      "started_at": "2026-10-30T20:47:25.116149Z",
      "answered_at": "2026-10-30T20:47:25.368167Z",
      "ended_at": "2026-10-30T20:47:25.616562Z",
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
      "id": "086ad18c-d369-4516-846f-fdd44ff38152",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671158841",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [],
      "started_at": "2026-10-30T20:47:25.116149Z",
      "answered_at": "2026-10-30T20:47:25.368167Z",
      "ended_at": "2026-10-30T20:47:25.616562Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T20:47:27.505891Z"
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
      "id": "086ad18c-d369-4516-846f-fdd44ff38152",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671158841",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [],
      "started_at": "2026-10-30T20:47:25.116149Z",
      "answered_at": "2026-10-30T20:47:25.368167Z",
      "ended_at": "2026-10-30T20:47:25.616562Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T20:47:27.505891Z"
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

`GET /api/operator/v1/calls/086ad18c-d369-4516-846f-fdd44ff38152/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/086ad18c-d369-4516-846f-fdd44ff38152/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=086ad18c-d369-4516-846f-fdd44ff38152` → **200**

```json
{
  "changes": [
    {
      "id": "a316ab26-197e-46c2-b047-ebdc3ca704b8",
      "occurred_at": "2026-10-30T20:47:28.371798Z",
      "actor_type": "STAFF",
      "actor_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "086ad18c-d369-4516-846f-fdd44ff38152",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0c2f5caa-6451-46ac-8428-3e849c707b85\", \"order_ids\": []}",
      "correlation_id": "2ef21a29-b768-4b3e-bed9-47efc58f003c"
    },
    {
      "id": "e98a1e1c-9659-43b2-b871-daf16f54eb32",
      "occurred_at": "2026-10-30T20:47:28.342068Z",
      "actor_type": "STAFF",
      "actor_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "086ad18c-d369-4516-846f-fdd44ff38152",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0c2f5caa-6451-46ac-8428-3e849c707b85\", \"order_ids\": []}",
      "correlation_id": "56da8ce8-2d5f-4881-80c3-4b57bedc8c1f"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 086ad18c-d369-4516-846f-fdd44ff38152 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29149"
}
```

```json
{
  "challenge_id": "f243347c-8baf-4a7a-874f-88af23934b32",
  "expires_at": "2026-10-30T20:52:28.645885221Z",
  "resend_available_at": "2026-10-30T20:47:29.645885221Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "055697",
  "sent_at": "2026-10-30T20:47:28.649938329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f243347c-8baf-4a7a-874f-88af23934b32",
  "code": "055697",
  "device_ref": "sandbox-29149"
}
```

```json
{
  "session_id": "c577a2e1-457d-45d8-b931-56ad26357d03",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDE0OCwiaWF0IjoxNzkzMzkzMjQ4LCJqdGkiOiJmZDljZDczMC1mZGE2LTQ4NjItYjYyMS0yYjgxNzYxMTVmYTkiLCJzaWQiOiJjNTc3YTJlMS00NTdkLTQ1ZDgtYjkzMS01NmFkMjYzNTdkMDMifQ.OTlpfs6m1YayFRyT_COzHSjMXTTad91SzF_voDbrmzU",
  "access_expires_at": "2026-10-30T21:02:28.908515627Z",
  "refresh_token": "40KYLg5CadY8vk8ruBPP8oQvg3u5EqRjGySk2p1SHo8",
  "refresh_expires_at": "2026-11-29T20:47:28.908042167Z",
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
  "command_id": "49d2b09f-efb7-43b2-a067-39e57ba34c9b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:47:29Z",
    "sequence": 1793393249363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f4c06a8-a751-4d58-8533-26b4d5863d3e",
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
  "last_heartbeat_at": "2026-10-30T20:47:29.382135Z",
  "last_location_at": "2026-10-30T20:47:29.382135Z",
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
  "session_id": "49516445-3ef6-4f21-b990-ab4a63dfdb20",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQxNDksImlhdCI6MTc5MzM5MzI0OSwianRpIjoiODMwYmIwNjEtMmI5MS00YTk3LTkzMWMtMmM0ODY3YzdjNTA2Iiwic2lkIjoiNDk1MTY0NDUtM2VmNi00ZjIxLWI5OTAtYWI0YTYzZGZkYjIwIn0.iicZC83PnHwwHrEbEehHJ0M4LIxiQfFcmcoe4OgDFJI",
  "access_expires_at": "2026-10-30T21:02:29.83258366Z",
  "refresh_token": "9iKmjHeOlxfI9R5NM4JoMlWeSjM93QTT-5KhQCsHr0M",
  "refresh_expires_at": "2026-10-31T08:47:29.832052476Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "40e61a5e-2874-4b2a-a797-e4cfecbbe662",
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
  "id": "3a17f112-4974-4d42-bc50-468106f4f123",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:52:30.060160Z",
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
  "command_id": "a8480e09-30e4-4c56-bfd0-6ca4a3862c30",
  "quote_id": "3a17f112-4974-4d42-bc50-468106f4f123",
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
    "phone": "+380675826402"
  }
}
```

```json
{
  "id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
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
  "created_at": "2026-10-30T20:47:30.306267Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675826402"
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
    "id": "71f4f870-0448-41b2-af24-a05c8ee9e7b5",
    "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
    "expires_at": "2026-10-30T20:47:45.310687Z",
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

`POST /api/driver/v1/offers/71f4f870-0448-41b2-af24-a05c8ee9e7b5/accept` → **200**

```json
{
  "command_id": "abf3790a-4d4b-4c3b-b729-5f6739bdd76d"
}
```

```json
{
  "id": "5f7baf48-2b84-4d60-ab8c-49929b2d9964",
  "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "691259cc-8881-417b-a3a9-23ac4a61e68d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "691259cc-8881-417b-a3a9-23ac4a61e68d",
  "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
  "assignment_id": "5f7baf48-2b84-4d60-ab8c-49929b2d9964",
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
    "phone": "+380675826402"
  }
}
```

`POST /api/driver/v1/work-sessions/1f4c06a8-a751-4d58-8533-26b4d5863d3e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:47:32Z",
    "sequence": 1793393252381
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f4c06a8-a751-4d58-8533-26b4d5863d3e",
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
  "last_heartbeat_at": "2026-10-30T20:47:32.400324Z",
  "last_location_at": "2026-10-30T20:47:32.400324Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/691259cc-8881-417b-a3a9-23ac4a61e68d/arrive` → **200**

```json
{
  "command_id": "4e2c6b82-9663-46cb-af61-468d7c635e59",
  "expected_version": 0
}
```

```json
{
  "id": "691259cc-8881-417b-a3a9-23ac4a61e68d",
  "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
  "assignment_id": "5f7baf48-2b84-4d60-ab8c-49929b2d9964",
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
  "arrived_at": "2026-10-30T20:47:32.638763Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675826402"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  },
  {
    "phone": "+380675826402",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:34.063502177Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  },
  {
    "phone": "+380675826402",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:34.063502177Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675826402` → **200**

```json
[
  {
    "phone": "+380675826402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:32.056715876Z"
  },
  {
    "phone": "+380675826402",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T20:47:34.063502177Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/691259cc-8881-417b-a3a9-23ac4a61e68d/start` → **200**

```json
{
  "command_id": "bb552506-9478-42fb-bd6c-0765819fc56b",
  "expected_version": 1
}
```

```json
{
  "id": "691259cc-8881-417b-a3a9-23ac4a61e68d",
  "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
  "assignment_id": "5f7baf48-2b84-4d60-ab8c-49929b2d9964",
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
  "arrived_at": "2026-10-30T20:47:32.638763Z",
  "started_at": "2026-10-30T20:47:34.997099Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675826402"
  }
}
```

`POST /api/driver/v1/trips/691259cc-8881-417b-a3a9-23ac4a61e68d/complete` → **200**

```json
{
  "command_id": "a6dc7e81-d5a9-4614-9463-67a996b7ba15",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:47:35Z",
  "cash_received": true
}
```

```json
{
  "id": "691259cc-8881-417b-a3a9-23ac4a61e68d",
  "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
  "assignment_id": "5f7baf48-2b84-4d60-ab8c-49929b2d9964",
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
  "arrived_at": "2026-10-30T20:47:32.638763Z",
  "started_at": "2026-10-30T20:47:34.997099Z",
  "completed_at": "2026-10-30T20:47:35.249384Z",
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
  "session_id": "1f4c06a8-a751-4d58-8533-26b4d5863d3e",
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
  "last_heartbeat_at": "2026-10-30T20:47:32.400324Z",
  "last_location_at": "2026-10-30T20:47:32.400324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f4c06a8-a751-4d58-8533-26b4d5863d3e/close` → **200**

```json
{
  "command_id": "45c6b4af-4e90-403d-bb2a-4767a7772830",
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
  "phone": "+380632127173",
  "device_ref": "sandbox-5842"
}
```

```json
{
  "challenge_id": "0654a839-31ba-4524-b314-d70655909d2a",
  "expires_at": "2026-10-30T20:52:35.961652233Z",
  "resend_available_at": "2026-10-30T20:47:36.961652233Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632127173` → **200**

```json
{
  "phone": "+380632127173",
  "audience": "CLIENT",
  "code": "900514",
  "sent_at": "2026-10-30T20:47:35.96392681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0654a839-31ba-4524-b314-d70655909d2a",
  "code": "900514",
  "device_ref": "sandbox-5842"
}
```

```json
{
  "session_id": "39c4ea1b-2f2c-405e-98c6-b208289a6f8a",
  "subject": {
    "type": "CLIENT",
    "id": "617399d5-915c-4369-b343-d510519368a1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTczOTlkNS05MTVjLTQzNjktYjM0My1kNTEwNTE5MzY4YTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MTU2LCJpYXQiOjE3OTMzOTMyNTYsImp0aSI6IjdjZGU1ZDQxLTFmZjUtNGVjZS1hZDA2LTUzOGZjMTA1OWUwMyIsInNpZCI6IjM5YzRlYTFiLTJmMmMtNDA1ZS05OGM2LWIyMDgyODlhNmY4YSJ9.tFkPd5ceyu9rpCr24361NMK9cOKElrPxWKQkKSLxwrg",
  "access_expires_at": "2026-10-30T21:02:36.214272599Z",
  "refresh_token": "lIXld_yBIO3nsjB1iNSQtceRzwxWRGpEqrX9YT4YxDw",
  "refresh_expires_at": "2026-11-29T20:47:36.21370513Z",
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
  "device_ref": "sandbox-30595"
}
```

```json
{
  "challenge_id": "f47fa60b-e2ae-458e-8db5-f59bb21075ce",
  "expires_at": "2026-10-30T20:52:36.660658489Z",
  "resend_available_at": "2026-10-30T20:47:37.660658489Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "501783",
  "sent_at": "2026-10-30T20:47:36.662969819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f47fa60b-e2ae-458e-8db5-f59bb21075ce",
  "code": "501783",
  "device_ref": "sandbox-30595"
}
```

```json
{
  "session_id": "491c34eb-efab-44be-a285-22d110b59788",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDE1NiwiaWF0IjoxNzkzMzkzMjU2LCJqdGkiOiI3NTJiMGU0OC0wMTE0LTRjNTUtOTQwYy03YmY3OGE2NWI1NWMiLCJzaWQiOiI0OTFjMzRlYi1lZmFiLTQ0YmUtYTI4NS0yMmQxMTBiNTk3ODgifQ.e3S4NuToERF9yUuqxu37rg5BUQBcRwGakilpVJY9sk0",
  "access_expires_at": "2026-10-30T21:02:36.917442116Z",
  "refresh_token": "Hi2eNNaTbhsKCYRr_o358egw0hbBO5WYO9e5Tucq3Mw",
  "refresh_expires_at": "2026-11-29T20:47:36.916966179Z",
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
  "session_id": "83f5cde6-9351-4e1f-92a9-4193ab5b4b24",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQxNTcsImlhdCI6MTc5MzM5MzI1NywianRpIjoiNzZjNmExMjktZmIzNi00ZWE0LTg5NzQtY2EwMTU3MTEyYjU1Iiwic2lkIjoiODNmNWNkZTYtOTM1MS00ZTFmLTkyYTktNDE5M2FiNWI0YjI0In0.F01eCq3kZVGE38bflrXJMBYM043zOSuN04-rhwIvPAI",
  "access_expires_at": "2026-10-30T21:02:37.576401915Z",
  "refresh_token": "HZtI-XJBMblBpmGexz1qLz98CdJOrvlK9bBep4PQ8I0",
  "refresh_expires_at": "2026-10-31T08:47:37.575900154Z",
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
  "session_id": "04a4288e-4dfb-4b96-ab55-ce98a0cd6a15",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQxNTgsImlhdCI6MTc5MzM5MzI1OCwianRpIjoiMGU0YzYzNzItOTA3MC00N2VlLTg4ZTctOWM1NzEzNGI3OTcwIiwic2lkIjoiMDRhNDI4OGUtNGRmYi00Yjk2LWFiNTUtY2U5OGEwY2Q2YTE1In0.JPbtdh-rQrWVFyW_GvTO1oPVfP-xrB_k4Opx3MHNNHw",
  "access_expires_at": "2026-10-30T21:02:38.020577173Z",
  "refresh_token": "xBscesNMv9M3dGKn9-eWgF23KhVuA7gTg_dmOYICDF0",
  "refresh_expires_at": "2026-10-31T08:47:38.020072127Z",
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
  "command_id": "3918efd6-5275-4b7c-95f3-d00ff17fabe8",
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
  "id": "79895a4d-bbb7-4fe0-a11a-e2ccad718e20",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:52:38.472137Z",
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
  "command_id": "d2a258a2-490e-42b9-bd9a-de1dd18d4b51",
  "quote_id": "79895a4d-bbb7-4fe0-a11a-e2ccad718e20",
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
  "id": "3a03ce36-c032-40b2-bd12-6d36cd4fa0a3",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "617399d5-915c-4369-b343-d510519368a1",
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
  "created_at": "2026-10-30T20:47:38.719447Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a03ce36-c032-40b2-bd12-6d36cd4fa0a3` → **200**

```json
{
  "id": "3a03ce36-c032-40b2-bd12-6d36cd4fa0a3",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "617399d5-915c-4369-b343-d510519368a1",
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
  "created_at": "2026-10-30T20:47:38.719447Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3a03ce36-c032-40b2-bd12-6d36cd4fa0a3/cancel` → **200**

```json
{
  "command_id": "89c9486c-43d0-4c7e-9d94-5edeecb64c3a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "3a03ce36-c032-40b2-bd12-6d36cd4fa0a3",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "617399d5-915c-4369-b343-d510519368a1",
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
  "created_at": "2026-10-30T20:47:38.719447Z",
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
  "command_id": "489b4592-3ae7-4978-a547-258bfafb1a70",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:47:39Z",
    "sequence": 1793393259718
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc",
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
  "last_heartbeat_at": "2026-10-30T20:47:39.737109Z",
  "last_location_at": "2026-10-30T20:47:39.737109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19469"
}
```

```json
{
  "challenge_id": "53cf38e3-75f7-46c7-b5bb-5e81700ac025",
  "expires_at": "2026-10-30T20:52:39.965946444Z",
  "resend_available_at": "2026-10-30T20:47:40.965946444Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "210847",
  "sent_at": "2026-10-30T20:47:39.968132554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53cf38e3-75f7-46c7-b5bb-5e81700ac025",
  "code": "210847",
  "device_ref": "sandbox-19469"
}
```

```json
{
  "session_id": "2d30d43c-27c4-49e5-acf1-2973400bb564",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDE2MCwiaWF0IjoxNzkzMzkzMjYwLCJqdGkiOiJkMmNhNTFjMS1lYmM3LTQ5ZDgtOGUxOC0wOTg1Y2NjZTBiZjMiLCJzaWQiOiIyZDMwZDQzYy0yN2M0LTQ5ZTUtYWNmMS0yOTczNDAwYmI1NjQifQ.iYCbUiU_KYfgoaktBt3UDPXWQ-u2uDUSj4mSCUu0_HU",
  "access_expires_at": "2026-10-30T21:02:40.219897138Z",
  "refresh_token": "sPEouzzhzjZrrw9IgfK-of_jgb3wP5j42SXDtaDaVtY",
  "refresh_expires_at": "2026-11-29T20:47:40.219369288Z",
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
  "command_id": "5bc5cd6c-4b94-42d7-95f3-7a0a87ad5921",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:47:40Z",
    "sequence": 1793393260686
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "968ff9b0-33ca-4b08-832c-16e3a01add20",
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
  "last_heartbeat_at": "2026-10-30T20:47:40.704784Z",
  "last_location_at": "2026-10-30T20:47:40.704784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96512140-1245-4ae6-9a29-e12148450dd2",
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
  "id": "536572d9-a1d4-4437-916e-ff533f1b5cb9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:52:40.946010Z",
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
  "command_id": "e5fdfc04-1930-400e-bc5e-17b097170ea4",
  "quote_id": "536572d9-a1d4-4437-916e-ff533f1b5cb9",
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
  "id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "617399d5-915c-4369-b343-d510519368a1",
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
  "created_at": "2026-10-30T20:47:41.196758Z",
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
    "id": "24d0fe9a-f1a4-41f3-b398-a0a2833d4359",
    "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
    "expires_at": "2026-10-30T20:47:56.199916Z",
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

`POST /api/driver/v1/offers/24d0fe9a-f1a4-41f3-b398-a0a2833d4359/accept` → **200**

```json
{
  "command_id": "c94fbec4-7c7f-487b-9835-13b1835c55e9"
}
```

```json
{
  "id": "e959651f-1ad1-4828-a7fb-0c6884266219",
  "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "19798431-e5cc-43eb-82a0-9712c374096e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "19798431-e5cc-43eb-82a0-9712c374096e",
  "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "assignment_id": "e959651f-1ad1-4828-a7fb-0c6884266219",
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

`POST /api/driver/v1/trips/19798431-e5cc-43eb-82a0-9712c374096e/cancel` → **200**

```json
{
  "command_id": "b8c32a7b-477e-4778-adc6-cd0dfee0da8c",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "19798431-e5cc-43eb-82a0-9712c374096e",
  "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "assignment_id": "e959651f-1ad1-4828-a7fb-0c6884266219",
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

`GET /api/rider/v1/orders/fed459ad-0b44-440b-bec6-6b0e32342f3d` → **200**

```json
{
  "id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "617399d5-915c-4369-b343-d510519368a1",
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
    "id": "e959651f-1ad1-4828-a7fb-0c6884266219",
    "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "19798431-e5cc-43eb-82a0-9712c374096e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T20:47:41.196758Z",
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
    "id": "b1589cd9-45a4-436e-89b0-2c082fd231c7",
    "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
    "expires_at": "2026-10-30T20:47:57.142667Z",
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

`POST /api/driver/v1/offers/b1589cd9-45a4-436e-89b0-2c082fd231c7/accept` → **200**

```json
{
  "command_id": "f051d681-3fe7-48d0-b945-4e258f00ca5d"
}
```

```json
{
  "id": "0e3f6e0d-3663-484a-aaf8-c9d79606eeea",
  "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9172373f-4825-4324-b5a9-e45cba0c25cf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9172373f-4825-4324-b5a9-e45cba0c25cf",
  "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "assignment_id": "0e3f6e0d-3663-484a-aaf8-c9d79606eeea",
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

`POST /api/driver/v1/trips/9172373f-4825-4324-b5a9-e45cba0c25cf/cancel` → **200**

```json
{
  "command_id": "13fa1b5d-4fd6-40c8-9d81-3ed136c29f55",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "9172373f-4825-4324-b5a9-e45cba0c25cf",
  "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
  "assignment_id": "0e3f6e0d-3663-484a-aaf8-c9d79606eeea",
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
      "id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T20:47:41.196758Z",
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
      "id": "3a03ce36-c032-40b2-bd12-6d36cd4fa0a3",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T20:47:38.719447Z",
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

`GET /api/operator/v1/orders/fed459ad-0b44-440b-bec6-6b0e32342f3d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T20:47:41.19725Z",
      "actor": {
        "type": "CLIENT",
        "id": "617399d5-915c-4369-b343-d510519368a1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
        "quote_id": "536572d9-a1d4-4437-916e-ff533f1b5cb9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "307b6fda-bcf2-4503-9f01-4b7c2393b9d5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T20:47:41.199201Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
        "attempt_id": "f4711efd-d62c-4678-82af-877ad1385032",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "307b6fda-bcf2-4503-9f01-4b7c2393b9d5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T20:47:41.2185Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "24d0fe9a-f1a4-41f3-b398-a0a2833d4359",
        "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "307b6fda-bcf2-4503-9f01-4b7c2393b9d5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T20:47:41.68374Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "24d0fe9a-f1a4-41f3-b398-a0a2833d4359",
        "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "e959651f-1ad1-4828-a7fb-0c6884266219"
      },
      "correlation_id": "64df538c-c758-41da-94f7-e977e81c49a2"
```

Done: orders 3a03ce36-c032-40b2-bd12-6d36cd4fa0a3, fed459ad-0b44-440b-bec6-6b0e32342f3d.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739769780",
  "device_ref": "sandbox-4956"
}
```

```json
{
  "challenge_id": "88057479-ab9b-4737-a48d-e8f2f807a361",
  "expires_at": "2026-10-30T20:52:44.032402553Z",
  "resend_available_at": "2026-10-30T20:47:45.032402553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739769780` → **200**

```json
{
  "phone": "+380739769780",
  "audience": "CLIENT",
  "code": "263307",
  "sent_at": "2026-10-30T20:47:44.035206264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88057479-ab9b-4737-a48d-e8f2f807a361",
  "code": "263307",
  "device_ref": "sandbox-4956"
}
```

```json
{
  "session_id": "97e1954b-ab0f-4572-a80b-a1c3e9f01e3a",
  "subject": {
    "type": "CLIENT",
    "id": "02409a5f-91f6-456a-b042-0e19108d4b8b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjQwOWE1Zi05MWY2LTQ1NmEtYjA0Mi0wZTE5MTA4ZDRiOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MTY0LCJpYXQiOjE3OTMzOTMyNjQsImp0aSI6ImJkNWNmZDEzLWQzZjAtNDg3Zi05ODFhLTRlZThhZWMzYmU4MiIsInNpZCI6Ijk3ZTE5NTRiLWFiMGYtNDU3Mi1hODBiLWExYzNlOWYwMWUzYSJ9.mg640E-ITC5V6U7NjgLOzDuIVBSmbfmRYj2hQ_fCuxE",
  "access_expires_at": "2026-10-30T21:02:44.303700919Z",
  "refresh_token": "oS43gaQNr7BYFkOUe5EdlbMzbvGyZ2IjfkMryaUaNHE",
  "refresh_expires_at": "2026-11-29T20:47:44.303280983Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9570925b-f7db-46b7-9489-89c98fac08de",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b8cfcfa7-0bdc-433a-bc2e-460450d40473",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b8cfcfa7-0bdc-433a-bc2e-460450d40473",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7e53e1497ae366da2f7bdb9efb9d957b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b8cfcfa7-0bdc-433a-bc2e-460450d40473",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739769780"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b8cfcfa7-0bdc-433a-bc2e-460450d40473",
  "expires_at": "2026-10-30T21:17:44.5337Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b8cfcfa7-0bdc-433a-bc2e-460450d40473` → **200**

```json
{
  "id": "b8cfcfa7-0bdc-433a-bc2e-460450d40473",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T21:17:44.5337Z",
  "card": {
    "id": "52dedde3-64ac-4b39-ba1d-361d390e6899",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2440",
    "card_type": "Visa",
    "created_at": "2026-10-30T20:47:44.774306Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "52dedde3-64ac-4b39-ba1d-361d390e6899",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2440",
      "card_type": "Visa",
      "created_at": "2026-10-30T20:47:44.774306Z"
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
  "device_ref": "sandbox-27989"
}
```

```json
{
  "challenge_id": "626c21ca-e518-4d60-86f9-d26b400820c9",
  "expires_at": "2026-10-30T20:52:45.242565564Z",
  "resend_available_at": "2026-10-30T20:47:46.242565564Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "189783",
  "sent_at": "2026-10-30T20:47:45.244672718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "626c21ca-e518-4d60-86f9-d26b400820c9",
  "code": "189783",
  "device_ref": "sandbox-27989"
}
```

```json
{
  "session_id": "30e239d0-6872-42c8-9db7-12aa03ef58df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDE2NSwiaWF0IjoxNzkzMzkzMjY1LCJqdGkiOiI2OGY3MzY2Yy0xOTJjLTRkZGMtYjVlYi02MTE1YWFjMWE1N2QiLCJzaWQiOiIzMGUyMzlkMC02ODcyLTQyYzgtOWRiNy0xMmFhMDNlZjU4ZGYifQ.-OZYvREUNTN6ZflRR6GiImsDJj4de63Bd0zfuXSbGP4",
  "access_expires_at": "2026-10-30T21:02:45.495680458Z",
  "refresh_token": "_o3TxjFsUV2u8oxawMXDUmxVZHNxEpz_l0ApUUOigEA",
  "refresh_expires_at": "2026-11-29T20:47:45.495165104Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "968ff9b0-33ca-4b08-832c-16e3a01add20",
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
  "last_heartbeat_at": "2026-10-30T20:47:40.704784Z",
  "last_location_at": "2026-10-30T20:47:40.704784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/968ff9b0-33ca-4b08-832c-16e3a01add20/handover` → **200**

```json
{
  "command_id": "553e893d-34cb-4f09-a703-3677239a1f21",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "968ff9b0-33ca-4b08-832c-16e3a01add20",
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
  "last_heartbeat_at": "2026-10-30T20:47:40.704784Z",
  "last_location_at": "2026-10-30T20:47:40.704784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 43 s to the next point)

`POST /api/driver/v1/work-sessions/968ff9b0-33ca-4b08-832c-16e3a01add20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:48:29Z",
    "sequence": 1793393309206
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "968ff9b0-33ca-4b08-832c-16e3a01add20",
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
  "last_heartbeat_at": "2026-10-30T20:48:29.225291Z",
  "last_location_at": "2026-10-30T20:48:29.225291Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fb26dcbf-2fba-4374-b9b9-0f0f52e0fd23",
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
  "id": "d03fe3a2-7d98-408b-bbda-20845035e9ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:53:29.470057Z",
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
  "command_id": "a6093e60-bf02-464d-bbe6-4e4ed979eb68",
  "quote_id": "d03fe3a2-7d98-408b-bbda-20845035e9ef",
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
  "id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
  "created_at": "2026-10-30T20:48:29.724006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32` → **200**

```json
{
  "id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
  "created_at": "2026-10-30T20:48:29.724006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32` → **200**

```json
{
  "id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
  "created_at": "2026-10-30T20:48:29.724006Z",
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
    "id": "3cca517c-f870-4452-8df1-b63765751da2",
    "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
    "expires_at": "2026-10-30T20:48:45.496794Z",
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

`POST /api/driver/v1/offers/3cca517c-f870-4452-8df1-b63765751da2/accept` → **200**

```json
{
  "command_id": "111543d7-7f27-4d85-98b5-00d6bc0997f8"
}
```

```json
{
  "id": "432f8982-aca7-42c5-a265-15905560bd4c",
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "assignment_id": "432f8982-aca7-42c5-a265-15905560bd4c",
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

`POST /api/driver/v1/work-sessions/968ff9b0-33ca-4b08-832c-16e3a01add20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:48:38Z",
    "sequence": 1793393318173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "968ff9b0-33ca-4b08-832c-16e3a01add20",
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
  "last_heartbeat_at": "2026-10-30T20:48:38.19198Z",
  "last_location_at": "2026-10-30T20:48:38.19198Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e2571dc2-6363-4419-af42-5fdc4aa2385d/arrive` → **200**

```json
{
  "command_id": "03b295a6-d482-4dd7-8ab9-768729f838f3",
  "expected_version": 0
}
```

```json
{
  "id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "assignment_id": "432f8982-aca7-42c5-a265-15905560bd4c",
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
  "arrived_at": "2026-10-30T20:48:38.432858Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e2571dc2-6363-4419-af42-5fdc4aa2385d/start` → **200**

```json
{
  "command_id": "d57a7fdf-2e5d-4d63-8974-4f9437d31c5e",
  "expected_version": 1
}
```

```json
{
  "id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "assignment_id": "432f8982-aca7-42c5-a265-15905560bd4c",
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
  "arrived_at": "2026-10-30T20:48:38.432858Z",
  "started_at": "2026-10-30T20:48:38.674378Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e2571dc2-6363-4419-af42-5fdc4aa2385d/complete` → **200**

```json
{
  "command_id": "97d1967c-d30b-4d07-9d8c-6a198cff26b5",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:48:38Z",
  "cash_received": true
}
```

```json
{
  "id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "assignment_id": "432f8982-aca7-42c5-a265-15905560bd4c",
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
  "arrived_at": "2026-10-30T20:48:38.432858Z",
  "started_at": "2026-10-30T20:48:38.674378Z",
  "completed_at": "2026-10-30T20:48:38.910934Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32` → **200**

```json
{
  "id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
    "id": "432f8982-aca7-42c5-a265-15905560bd4c",
    "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:48:29.724006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32` → **200**

```json
{
  "id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
    "id": "432f8982-aca7-42c5-a265-15905560bd4c",
    "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:48:29.724006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32` → **200**

```json
{
  "id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
    "id": "432f8982-aca7-42c5-a265-15905560bd4c",
    "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:48:29.724006Z",
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

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32/tip` → **200**

```json
{
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
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
  "available_until": "2026-10-31T20:48:38.910934Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32/tip` → **201**

```json
{
  "command_id": "7baf1b57-79c6-4bfd-9984-72a6d3234b22",
  "amount_minor": 2500
}
```

```json
{
  "id": "4338ee0a-5ecd-402c-9b86-ca2e92dc4022",
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T20:48:42.229545Z"
}
```

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32/tip` → **200**

```json
{
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
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
  "available_until": "2026-10-31T20:48:38.910934Z",
  "open": false,
  "tip": {
    "id": "4338ee0a-5ecd-402c-9b86-ca2e92dc4022",
    "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T20:48:42.229545Z"
  }
}
```

`GET /api/rider/v1/orders/a51e8486-3748-47de-b1fa-0cafaae4ed32/tip` → **200**

```json
{
  "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
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
  "available_until": "2026-10-31T20:48:38.910934Z",
  "open": false,
  "tip": {
    "id": "4338ee0a-5ecd-402c-9b86-ca2e92dc4022",
    "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T20:48:42.229545Z"
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
      "id": "408d42a8-471a-4c0d-af87-eddb5c210814",
      "at": "2026-10-30T20:48:43.624345Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
      "counterpart_id": null
    },
    {
      "id": "a48abdc5-1476-4183-af8f-6d6b928fabc5",
      "at": "2026-10-30T20:48:39.583315Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
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
  "command_id": "3fc5fc2b-d4cc-44e2-a811-d6bca7b6e64b",
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
  "id": "28714050-a062-44e9-ad85-bdb95cf5b00b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:53:44.093641Z",
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
  "session_id": "7d84d403-8a0b-491f-b2dd-e39bb9970268",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQyMjQsImlhdCI6MTc5MzM5MzMyNCwianRpIjoiZTk0NmI1ZDItODFhNC00NjBhLTk4YjYtMTQ3YjlhYzQwNzIwIiwic2lkIjoiN2Q4NGQ0MDMtOGEwYi00OTFmLWIyZGQtZTM5YmI5OTcwMjY4In0.79wX1lIj-PFE9tEWBADEESssPQ150t0Te_celgf1uAU",
  "access_expires_at": "2026-10-30T21:03:44.550331614Z",
  "refresh_token": "8Pxsz4byr99MUkjFFOANea4g9C0w_VIqHTn0gEddM1E",
  "refresh_expires_at": "2026-10-31T08:48:44.54993693Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739769780` → **200**

```json
{
  "client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b"
}
```

`POST /api/admin/v1/rider-wallets/02409a5f-91f6-456a-b042-0e19108d4b8b/top-ups` → **201**

```json
{
  "command_id": "cd434cd9-14d4-48bf-a2b0-1b443df6928c",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
      "id": "7b92ef42-d9b3-4fd7-bda3-d559dbeb0486",
      "at": "2026-10-30T20:48:44.981827Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d986ff87-70f0-4b72-a1a8-8d1b376bac5f",
  "quote_id": "28714050-a062-44e9-ad85-bdb95cf5b00b",
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
  "id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
  "created_at": "2026-10-30T20:48:45.225668Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9aae904d-09e6-4bdb-9155-62d1d5fcf4c5` → **200**

```json
{
  "id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
  "created_at": "2026-10-30T20:48:45.225668Z",
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
    "id": "5db7946e-bf14-4beb-8df5-47986dc1e0c8",
    "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
    "expires_at": "2026-10-30T20:49:00.229083Z",
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

`POST /api/driver/v1/offers/5db7946e-bf14-4beb-8df5-47986dc1e0c8/accept` → **200**

```json
{
  "command_id": "d6f75aee-f85c-49a4-9f02-cdbc46e7c944"
}
```

```json
{
  "id": "9b6fcad0-12ad-4886-bb5b-ea9f60a9234b",
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d90f3213-dcf5-476d-91b6-68bf63f0bbcd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d90f3213-dcf5-476d-91b6-68bf63f0bbcd",
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "assignment_id": "9b6fcad0-12ad-4886-bb5b-ea9f60a9234b",
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

`POST /api/driver/v1/work-sessions/968ff9b0-33ca-4b08-832c-16e3a01add20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:48:46Z",
    "sequence": 1793393326370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "968ff9b0-33ca-4b08-832c-16e3a01add20",
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
  "last_heartbeat_at": "2026-10-30T20:48:46.389399Z",
  "last_location_at": "2026-10-30T20:48:46.389399Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d90f3213-dcf5-476d-91b6-68bf63f0bbcd/arrive` → **200**

```json
{
  "command_id": "1cb6caf3-6b08-44f4-b914-0e1baac5ab6e",
  "expected_version": 0
}
```

```json
{
  "id": "d90f3213-dcf5-476d-91b6-68bf63f0bbcd",
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "assignment_id": "9b6fcad0-12ad-4886-bb5b-ea9f60a9234b",
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
  "arrived_at": "2026-10-30T20:48:46.623967Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d90f3213-dcf5-476d-91b6-68bf63f0bbcd/start` → **200**

```json
{
  "command_id": "294fb3ed-a00b-4cb6-8bf9-48ee7607aed7",
  "expected_version": 1
}
```

```json
{
  "id": "d90f3213-dcf5-476d-91b6-68bf63f0bbcd",
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "assignment_id": "9b6fcad0-12ad-4886-bb5b-ea9f60a9234b",
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
  "arrived_at": "2026-10-30T20:48:46.623967Z",
  "started_at": "2026-10-30T20:48:46.856927Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d90f3213-dcf5-476d-91b6-68bf63f0bbcd/complete` → **200**

```json
{
  "command_id": "ddb01e1b-ed73-47f2-a626-280087d19339",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:48:47Z",
  "cash_received": true
}
```

```json
{
  "id": "d90f3213-dcf5-476d-91b6-68bf63f0bbcd",
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "assignment_id": "9b6fcad0-12ad-4886-bb5b-ea9f60a9234b",
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
  "arrived_at": "2026-10-30T20:48:46.623967Z",
  "started_at": "2026-10-30T20:48:46.856927Z",
  "completed_at": "2026-10-30T20:48:47.094261Z",
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
  "client_id": "02409a5f-91f6-456a-b042-0e19108d4b8b",
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
      "id": "7b92ef42-d9b3-4fd7-bda3-d559dbeb0486",
      "at": "2026-10-30T20:48:44.981827Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
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

`GET /api/rider/v1/orders/9aae904d-09e6-4bdb-9155-62d1d5fcf4c5/tip` → **200**

```json
{
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
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
  "available_until": "2026-10-31T20:48:47.094261Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9aae904d-09e6-4bdb-9155-62d1d5fcf4c5/tip` → **201**

```json
{
  "command_id": "cf6ec8bf-63aa-4935-bcbe-76388dd84665",
  "amount_minor": 2500
}
```

```json
{
  "id": "ddee09ce-40a0-4d89-9054-c94b09995c81",
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T20:48:48.045298Z"
}
```

`GET /api/rider/v1/orders/9aae904d-09e6-4bdb-9155-62d1d5fcf4c5/tip` → **200**

```json
{
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
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
  "available_until": "2026-10-31T20:48:47.094261Z",
  "open": false,
  "tip": {
    "id": "ddee09ce-40a0-4d89-9054-c94b09995c81",
    "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T20:48:48.045298Z"
  }
}
```

`GET /api/rider/v1/orders/9aae904d-09e6-4bdb-9155-62d1d5fcf4c5/tip` → **200**

```json
{
  "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
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
  "available_until": "2026-10-31T20:48:47.094261Z",
  "open": false,
  "tip": {
    "id": "ddee09ce-40a0-4d89-9054-c94b09995c81",
    "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T20:48:48.045298Z"
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
      "id": "91d77746-4d56-4241-a357-f2996d6429a3",
      "at": "2026-10-30T20:48:49.688312Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
      "counterpart_id": null
    },
    {
      "id": "197debe8-5b68-4cde-86c2-f8aa66b6d557",
      "at": "2026-10-30T20:48:47.659664Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
      "counterpart_id": null
    },
    {
      "id": "408d42a8-471a-4c0d-af87-eddb5c210814",
      "at": "2026-10-30T20:48:43.624345Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
      "counterpart_id": null
    },
    {
      "id": "a48abdc5-1476-4183-af8f-6d6b928fabc5",
      "at": "2026-10-30T20:48:39.583315Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
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
  "session_id": "968ff9b0-33ca-4b08-832c-16e3a01add20",
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
  "last_heartbeat_at": "2026-10-30T20:48:46.389399Z",
  "last_location_at": "2026-10-30T20:48:46.389399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/968ff9b0-33ca-4b08-832c-16e3a01add20/close` → **200**

```json
{
  "command_id": "5fe86bd2-e7e7-4a36-9a56-e3f023f02054",
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

Done: card order 9aae904d-09e6-4bdb-9155-62d1d5fcf4c5.

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
  "phone": "+380734652188",
  "device_ref": "sandbox-6518"
}
```

```json
{
  "challenge_id": "c2eb1b62-c9c6-4d8e-892a-6d037e68a773",
  "expires_at": "2026-10-30T20:53:50.570378105Z",
  "resend_available_at": "2026-10-30T20:48:51.570378105Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734652188` → **200**

```json
{
  "phone": "+380734652188",
  "audience": "CLIENT",
  "code": "468928",
  "sent_at": "2026-10-30T20:48:50.572521913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2eb1b62-c9c6-4d8e-892a-6d037e68a773",
  "code": "468928",
  "device_ref": "sandbox-6518"
}
```

```json
{
  "session_id": "29f39a91-513e-4cf1-a425-cd0cf7b435ad",
  "subject": {
    "type": "CLIENT",
    "id": "6d9d9884-d154-43c9-aed2-8ef5ad67a8e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZDlkOTg4NC1kMTU0LTQzYzktYWVkMi04ZWY1YWQ2N2E4ZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MjMwLCJpYXQiOjE3OTMzOTMzMzAsImp0aSI6Ijg2NDU1NjJjLWU0NDktNDI3ZC1hMjJjLTdkNDM5YmY2MDI2MiIsInNpZCI6IjI5ZjM5YTkxLTUxM2UtNGNmMS1hNDI1LWNkMGNmN2I0MzVhZCJ9.-riyb1qVu3qcpt9jNiQ1EVtTB3c_sWDB-nuRjMmXdU0",
  "access_expires_at": "2026-10-30T21:03:50.810919253Z",
  "refresh_token": "9CfAZ-8SzbvgRhWOONkgFC8VDw-hlRyaXws6SuZEXY0",
  "refresh_expires_at": "2026-11-29T20:48:50.810483157Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c38fae87-18f1-4081-8a73-9efe89454d43",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "6c44e71b-048f-4cf9-ba92-264dbc622d51",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6c44e71b-048f-4cf9-ba92-264dbc622d51",
    "orderDate": "1793393331",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "d8f2bfa1ec7c5389b6a21b10f845ad1b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6c44e71b-048f-4cf9-ba92-264dbc622d51",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734652188"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6c44e71b-048f-4cf9-ba92-264dbc622d51",
  "created_at": "2026-10-30T20:48:51.036356Z",
  "expires_at": "2026-10-30T21:18:51.036356Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/6c44e71b-048f-4cf9-ba92-264dbc622d51` → **200**

```json
{
  "id": "6c44e71b-048f-4cf9-ba92-264dbc622d51",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T20:48:51.036356Z",
  "expires_at": "2026-10-30T21:18:51.036356Z",
  "completed_at": "2026-10-30T20:48:51.262991Z",
  "masked_pan": "41****0404",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6d9d9884-d154-43c9-aed2-8ef5ad67a8e0",
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
  "client_id": "6d9d9884-d154-43c9-aed2-8ef5ad67a8e0",
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
      "id": "33081923-87a0-47a0-a66e-817ad3248389",
      "at": "2026-10-30T20:48:51.700621Z",
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
  "client_id": "6d9d9884-d154-43c9-aed2-8ef5ad67a8e0",
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
      "id": "33081923-87a0-47a0-a66e-817ad3248389",
      "at": "2026-10-30T20:48:51.700621Z",
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
  "device_ref": "sandbox-28727"
}
```

```json
{
  "challenge_id": "c70c4ad4-59e8-4e64-bc82-5e16aaa83ea8",
  "expires_at": "2026-10-30T20:53:53.150639621Z",
  "resend_available_at": "2026-10-30T20:48:54.150639621Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "802891",
  "sent_at": "2026-10-30T20:48:53.152860597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c70c4ad4-59e8-4e64-bc82-5e16aaa83ea8",
  "code": "802891",
  "device_ref": "sandbox-28727"
}
```

```json
{
  "session_id": "1c78cf9e-671a-41c1-a9ff-88fa73b964f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDIzMywiaWF0IjoxNzkzMzkzMzMzLCJqdGkiOiJjZjhiZDQwOS0zZDQwLTRjYjktOWQ2ZC0wZDEzNjY4ZDM1MzgiLCJzaWQiOiIxYzc4Y2Y5ZS02NzFhLTQxYzEtYTlmZi04OGZhNzNiOTY0ZjEifQ.sHMVRwCpcOmbI0DqdRXh3wPC2lSs76E4fdcA4UCR1ws",
  "access_expires_at": "2026-10-30T21:03:53.395790145Z",
  "refresh_token": "eM_EILk2aPExN8-XawFGQ_pdj1cuCl_RsS0F19oH3Ow",
  "refresh_expires_at": "2026-11-29T20:48:53.39537354Z",
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
  "command_id": "b755779f-1891-4081-8143-25ab73a1bcc2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b7f3c843-b250-4c82-bc4a-821c3ff7f5a9",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b7f3c843-b250-4c82-bc4a-821c3ff7f5a9",
    "orderDate": "1793393333",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "2be734e50a03805b09d9255ba049d34c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b7f3c843-b250-4c82-bc4a-821c3ff7f5a9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b7f3c843-b250-4c82-bc4a-821c3ff7f5a9",
  "created_at": "2026-10-30T20:48:53.82631Z",
  "expires_at": "2026-10-30T21:18:53.82631Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b7f3c843-b250-4c82-bc4a-821c3ff7f5a9` → **200**

```json
{
  "id": "b7f3c843-b250-4c82-bc4a-821c3ff7f5a9",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T20:48:53.82631Z",
  "expires_at": "2026-10-30T21:18:53.82631Z",
  "completed_at": "2026-10-30T20:48:54.04373Z",
  "masked_pan": "41****8906",
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
      "id": "7520b2f1-5fa9-4450-b903-7a977e104e36",
      "at": "2026-10-30T20:48:54.715524Z",
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
  "command_id": "21cea4ba-e9dc-4145-bc66-f7ac2d23b423",
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
  "correlation_id": "e903f7e9-5125-44d4-bee7-0645980495b6"
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
  "device_ref": "sandbox-26624"
}
```

```json
{
  "challenge_id": "9e95ced5-76a3-49ef-b762-c9d5724d8d0d",
  "expires_at": "2026-10-30T20:53:55.943706638Z",
  "resend_available_at": "2026-10-30T20:48:56.943706638Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "005789",
  "sent_at": "2026-10-30T20:48:55.946000289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e95ced5-76a3-49ef-b762-c9d5724d8d0d",
  "code": "005789",
  "device_ref": "sandbox-26624"
}
```

```json
{
  "session_id": "1748ffa1-6b46-4001-bba0-3f630fb51411",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDIzNiwiaWF0IjoxNzkzMzkzMzM2LCJqdGkiOiJiYmU5YzkyNC0yZDYzLTRlYzYtYWI3My01MzgyZmI2ZmQ4ZTgiLCJzaWQiOiIxNzQ4ZmZhMS02YjQ2LTQwMDEtYmJhMC0zZjYzMGZiNTE0MTEifQ.OBBcHrSJHO3FZX1ahykXQv7oM0rbqmYN-LyLyHC8o7Y",
  "access_expires_at": "2026-10-30T21:03:56.186442414Z",
  "refresh_token": "Yf0lyzG9X0w_9HBcX4LflFLQHA99h-5Ec0IOiqNmnCo",
  "refresh_expires_at": "2026-11-29T20:48:56.18602278Z",
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
  "command_id": "dba66653-9dfd-430e-9a84-90196b09d8dd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:48:56Z",
    "sequence": 1793393336608
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbb3aaab-0c57-4b2d-b083-843cdab015d3",
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
  "last_heartbeat_at": "2026-10-30T20:48:56.625811Z",
  "last_location_at": "2026-10-30T20:48:56.625811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637437845",
  "device_ref": "sandbox-6652"
}
```

```json
{
  "challenge_id": "dc77689c-0fa0-4ed3-9604-43d6304ccd77",
  "expires_at": "2026-10-30T20:53:56.836766655Z",
  "resend_available_at": "2026-10-30T20:48:57.836766655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637437845` → **200**

```json
{
  "phone": "+380637437845",
  "audience": "CLIENT",
  "code": "304358",
  "sent_at": "2026-10-30T20:48:56.838763297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc77689c-0fa0-4ed3-9604-43d6304ccd77",
  "code": "304358",
  "device_ref": "sandbox-6652"
}
```

```json
{
  "session_id": "0f7ef93d-85bf-45f2-9ff2-181022712288",
  "subject": {
    "type": "CLIENT",
    "id": "cfb59c74-31c5-4827-b253-a005f8a240cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZmI1OWM3NC0zMWM1LTQ4MjctYjI1My1hMDA1ZjhhMjQwY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MjM3LCJpYXQiOjE3OTMzOTMzMzcsImp0aSI6IjY2YjZhNDViLWZiYzMtNGJiMi04Y2E2LWE5N2JlOWNhM2I2OCIsInNpZCI6IjBmN2VmOTNkLTg1YmYtNDVmMi05ZmYyLTE4MTAyMjcxMjI4OCJ9.yFzOJTmX3VrYyVzy4flloJ9R9wzjII8R4RM6vE1JPq0",
  "access_expires_at": "2026-10-30T21:03:57.069702479Z",
  "refresh_token": "nUhuflhLn9KAC7o7hiZo-VPn-6155kbUYX333J1VIT4",
  "refresh_expires_at": "2026-11-29T20:48:57.069287297Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "87c6ad55-a4d8-4ccb-bf98-b22e223839a1",
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
  "id": "504e0a50-c34b-46f2-96b9-a842ebfb9884",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:53:57.283090Z",
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
  "command_id": "64d08246-84c5-4138-9a2b-016eaecbaf2c",
  "quote_id": "504e0a50-c34b-46f2-96b9-a842ebfb9884",
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
  "id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cfb59c74-31c5-4827-b253-a005f8a240cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:48:57.50451Z",
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
    "id": "4241af28-fa1b-4cf9-b628-37e95df22b3d",
    "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
    "expires_at": "2026-10-30T20:49:12.506245Z",
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

`POST /api/driver/v1/offers/4241af28-fa1b-4cf9-b628-37e95df22b3d/accept` → **200**

```json
{
  "command_id": "8d5fd759-012d-4581-96a3-dfa4b7379415"
}
```

```json
{
  "id": "269c0fd5-6bc7-4fdd-8cad-5c51fd797a61",
  "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "61e031b6-d6e1-4b12-bcf9-9df45c653a2d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "61e031b6-d6e1-4b12-bcf9-9df45c653a2d",
  "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "assignment_id": "269c0fd5-6bc7-4fdd-8cad-5c51fd797a61",
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

`POST /api/driver/v1/work-sessions/dbb3aaab-0c57-4b2d-b083-843cdab015d3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:48:58Z",
    "sequence": 1793393338363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbb3aaab-0c57-4b2d-b083-843cdab015d3",
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
  "last_heartbeat_at": "2026-10-30T20:48:58.380225Z",
  "last_location_at": "2026-10-30T20:48:58.380225Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/61e031b6-d6e1-4b12-bcf9-9df45c653a2d/arrive` → **200**

```json
{
  "command_id": "9315bc78-d379-44f4-95ce-e87155a012a8",
  "expected_version": 0
}
```

```json
{
  "id": "61e031b6-d6e1-4b12-bcf9-9df45c653a2d",
  "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "assignment_id": "269c0fd5-6bc7-4fdd-8cad-5c51fd797a61",
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
  "arrived_at": "2026-10-30T20:48:58.596353Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/61e031b6-d6e1-4b12-bcf9-9df45c653a2d/start` → **200**

```json
{
  "command_id": "601c9b34-6188-41e6-b39e-f185f3343a52",
  "expected_version": 1
}
```

```json
{
  "id": "61e031b6-d6e1-4b12-bcf9-9df45c653a2d",
  "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "assignment_id": "269c0fd5-6bc7-4fdd-8cad-5c51fd797a61",
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
  "arrived_at": "2026-10-30T20:48:58.596353Z",
  "started_at": "2026-10-30T20:48:58.811828Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/61e031b6-d6e1-4b12-bcf9-9df45c653a2d/complete` → **200**

```json
{
  "command_id": "0623452d-105e-434d-a0aa-54f534120143",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:48:59Z",
  "cash_received": false
}
```

```json
{
  "id": "61e031b6-d6e1-4b12-bcf9-9df45c653a2d",
  "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "assignment_id": "269c0fd5-6bc7-4fdd-8cad-5c51fd797a61",
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
  "arrived_at": "2026-10-30T20:48:58.596353Z",
  "started_at": "2026-10-30T20:48:58.811828Z",
  "completed_at": "2026-10-30T20:48:59.031404Z",
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
  "session_id": "62d0bbcc-56af-40e2-b0bd-6a8d68ae6676",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQyMzksImlhdCI6MTc5MzM5MzMzOSwianRpIjoiYmU0ODE4YmMtZmRhMy00NTZmLTg3YzctNDg3NjY2ZDg1NWViIiwic2lkIjoiNjJkMGJiY2MtNTZhZi00MGUyLWIwYmQtNmE4ZDY4YWU2Njc2In0.Z8rdw0LW1wSPxHzcaHnBhikBWum3mS5WWBT2pKoGzrQ",
  "access_expires_at": "2026-10-30T21:03:59.456189971Z",
  "refresh_token": "oahoGNb-WM30st97RnqiFbniObBxjNo09d4ycwlyM6k",
  "refresh_expires_at": "2026-10-31T08:48:59.455758002Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0f2ccd2b-4fcf-4712-8a70-eba3fd051bfa"
}
```

`GET /api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute` → **200**

```json
{
  "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "cfb59c74-31c5-4827-b253-a005f8a240cf",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T20:48:59.775115Z",
  "decide_by": "2026-11-13T20:48:59.775115Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T20:48:59.775115Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "cfb59c74-31c5-4827-b253-a005f8a240cf",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T20:48:59.775115Z",
      "decide_by": "2026-11-13T20:48:59.775115Z",
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

`POST /api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute/decide` → **400**

```json
{
  "command_id": "fd397365-26f5-4675-a0dc-5f54240fd235",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "83a6d124-2e41-4657-89d5-2c4a47f40dfe",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute/decide` → **200**

```json
{
  "command_id": "36e8e7f2-2787-4cb2-9540-b2e9554bd860",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "cfb59c74-31c5-4827-b253-a005f8a240cf",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T20:48:59.775115Z",
  "decide_by": "2026-11-13T20:48:59.775115Z",
  "decision": "PAY_DRIVER",
  "decided_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T20:49:01.558957Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute/decide` → **409**

```json
{
  "command_id": "ddae6384-4779-4946-8eb0-3a96264fd7d1",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a29c091d-41de-4a71-9f30-55ca810c8f43/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "710bd933-1ff9-4ee9-b00d-1d9df479577c"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbb3aaab-0c57-4b2d-b083-843cdab015d3",
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
  "last_heartbeat_at": "2026-10-30T20:48:58.380225Z",
  "last_location_at": "2026-10-30T20:48:58.380225Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dbb3aaab-0c57-4b2d-b083-843cdab015d3/close` → **200**

```json
{
  "command_id": "e580c78d-8cd4-4699-8adf-0463252c2a5b",
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
  "phone": "+380732818106",
  "device_ref": "sandbox-30976"
}
```

```json
{
  "challenge_id": "835bb955-d2cf-419f-a1f1-badeb509565a",
  "expires_at": "2026-10-30T20:54:02.433546831Z",
  "resend_available_at": "2026-10-30T20:49:03.433546831Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732818106` → **200**

```json
{
  "phone": "+380732818106",
  "audience": "CLIENT",
  "code": "171130",
  "sent_at": "2026-10-30T20:49:02.43888642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "835bb955-d2cf-419f-a1f1-badeb509565a",
  "code": "171130",
  "device_ref": "sandbox-30976"
}
```

```json
{
  "session_id": "5ff1c739-ae98-480d-9445-100b852a5a47",
  "subject": {
    "type": "CLIENT",
    "id": "4b734508-6bc7-4405-af97-f436ebd194b1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjczNDUwOC02YmM3LTQ0MDUtYWY5Ny1mNDM2ZWJkMTk0YjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MjQyLCJpYXQiOjE3OTMzOTMzNDIsImp0aSI6ImE0ZWVhYzhiLTI5NDAtNDczNi1hZWU5LWI0M2JiNzBiYzM4NCIsInNpZCI6IjVmZjFjNzM5LWFlOTgtNDgwZC05NDQ1LTEwMGI4NTJhNWE0NyJ9.tPN_OyawxzhNuDThXepXNPSWC54iTnMZ53j1LWmiWOY",
  "access_expires_at": "2026-10-30T21:04:02.666316765Z",
  "refresh_token": "YApAWv_CMwmincXBohVPBaTGGoiD9LVAc0Apg78dw1k",
  "refresh_expires_at": "2026-11-29T20:49:02.665940454Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5f4a616b-8161-4953-9d61-50f73552e884",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "404c19b6-161f-4fa2-ba50-7ee8f1cd24ef",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-404c19b6-161f-4fa2-ba50-7ee8f1cd24ef",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5014f0676ab34dd254d48eec37f1d224",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=404c19b6-161f-4fa2-ba50-7ee8f1cd24ef",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732818106"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=404c19b6-161f-4fa2-ba50-7ee8f1cd24ef",
  "expires_at": "2026-10-30T21:19:02.872306Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/404c19b6-161f-4fa2-ba50-7ee8f1cd24ef` → **200**

```json
{
  "id": "404c19b6-161f-4fa2-ba50-7ee8f1cd24ef",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T21:19:02.872306Z",
  "card": {
    "id": "84207b6f-9e11-46f8-aeb2-b8fdc5f7ce1d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0643",
    "card_type": "Visa",
    "created_at": "2026-10-30T20:49:03.079433Z"
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
  "device_ref": "sandbox-14654"
}
```

```json
{
  "challenge_id": "c278c466-32a5-40c9-95b4-4e539ef33e47",
  "expires_at": "2026-10-30T20:54:03.308620872Z",
  "resend_available_at": "2026-10-30T20:49:04.308620872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "419040",
  "sent_at": "2026-10-30T20:49:03.310786036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c278c466-32a5-40c9-95b4-4e539ef33e47",
  "code": "419040",
  "device_ref": "sandbox-14654"
}
```

```json
{
  "session_id": "b9772a89-5240-477e-a407-a1ad6cbcc639",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDI0MywiaWF0IjoxNzkzMzkzMzQzLCJqdGkiOiI1YTllNDNhOC1kNzdlLTQ3YmMtYjQ4My1hMjFjOWRmZWYyZDciLCJzaWQiOiJiOTc3MmE4OS01MjQwLTQ3N2UtYTQwNy1hMWFkNmNiY2M2MzkifQ.VbmGwphm4qK1AODGcOkpvQPrsZW6w_VWh7xG3ZSCr1k",
  "access_expires_at": "2026-10-30T21:04:03.536547499Z",
  "refresh_token": "i77st1MEjF_O3d2z-3q-FDxAdtwpwjcOOxMk1jUOCP4",
  "refresh_expires_at": "2026-11-29T20:49:03.536116912Z",
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
  "command_id": "bc7582cc-1350-4475-8068-ef3569893ee0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:49:03Z",
    "sequence": 1793393343956
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "779d6540-89f2-4cd0-9d7e-221549d0db16",
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
  "last_heartbeat_at": "2026-10-30T20:49:03.972804Z",
  "last_location_at": "2026-10-30T20:49:03.972804Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a838548d-2fbc-409b-b99e-5fa2641f23f4",
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
  "id": "f7412b0e-b86e-46b1-b071-e48483e30c4c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:54:04.192446Z",
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
  "command_id": "e24ed0d1-496b-4219-a6ec-6686a6ea0105",
  "quote_id": "f7412b0e-b86e-46b1-b071-e48483e30c4c",
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
  "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4b734508-6bc7-4405-af97-f436ebd194b1",
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
  "created_at": "2026-10-30T20:49:04.41535Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91` → **200**

```json
{
  "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4b734508-6bc7-4405-af97-f436ebd194b1",
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
  "created_at": "2026-10-30T20:49:04.41535Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91` → **200**

```json
{
  "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4b734508-6bc7-4405-af97-f436ebd194b1",
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
  "created_at": "2026-10-30T20:49:04.41535Z",
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
    "id": "0ed0b703-0e33-4e71-9a0f-a78bc6ff97da",
    "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
    "expires_at": "2026-10-30T20:49:19.812321Z",
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

`POST /api/driver/v1/offers/0ed0b703-0e33-4e71-9a0f-a78bc6ff97da/accept` → **200**

```json
{
  "command_id": "83cac4a2-da9b-4e5a-ac59-b719416069ea"
}
```

```json
{
  "id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "81af17c7-0828-42fa-b903-d141094ee10b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "81af17c7-0828-42fa-b903-d141094ee10b",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "assignment_id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
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

`POST /api/rider/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/messages` → **201**

```json
{
  "command_id": "916e42eb-2c9a-4c1c-a475-981457cfee08",
  "body": "Я біля входу, мій номер +380732818106, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "c487c6d6-dafb-49dd-9c7c-a44a06ae174f",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380732818106, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T20:49:06.72470005Z"
}
```

`POST /api/driver/v1/trips/81af17c7-0828-42fa-b903-d141094ee10b/messages` → **201**

```json
{
  "command_id": "fa367be1-13bb-4ab6-bec6-a0eee1fce3c2",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "7369fe96-0f7f-4cd8-98f8-7421b11065e1",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T20:49:06.951439106Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/779d6540-89f2-4cd0-9d7e-221549d0db16/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:49:12Z",
    "sequence": 1793393352190
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "779d6540-89f2-4cd0-9d7e-221549d0db16",
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
  "last_heartbeat_at": "2026-10-30T20:49:12.207591Z",
  "last_location_at": "2026-10-30T20:49:12.207591Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/81af17c7-0828-42fa-b903-d141094ee10b/arrive` → **200**

```json
{
  "command_id": "538434f2-9631-4d60-ae80-21223bd2309c",
  "expected_version": 0
}
```

```json
{
  "id": "81af17c7-0828-42fa-b903-d141094ee10b",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "assignment_id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
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
  "arrived_at": "2026-10-30T20:49:12.418772Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/81af17c7-0828-42fa-b903-d141094ee10b/start` → **200**

```json
{
  "command_id": "2babab15-651e-4c52-8d2a-a49abf428ddf",
  "expected_version": 1
}
```

```json
{
  "id": "81af17c7-0828-42fa-b903-d141094ee10b",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "assignment_id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
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
  "arrived_at": "2026-10-30T20:49:12.418772Z",
  "started_at": "2026-10-30T20:49:12.638668Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 91 s to the next point)

`POST /api/driver/v1/work-sessions/779d6540-89f2-4cd0-9d7e-221549d0db16/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:50:43Z",
    "sequence": 1793393443875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "779d6540-89f2-4cd0-9d7e-221549d0db16",
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
  "last_heartbeat_at": "2026-10-30T20:50:43.892905Z",
  "last_location_at": "2026-10-30T20:50:43.892905Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/81af17c7-0828-42fa-b903-d141094ee10b/complete` → **200**

```json
{
  "command_id": "0e357f83-9c0d-40c6-a1bf-800c41371322",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:50:44Z",
  "cash_received": false
}
```

```json
{
  "id": "81af17c7-0828-42fa-b903-d141094ee10b",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "assignment_id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
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
  "arrived_at": "2026-10-30T20:49:12.418772Z",
  "started_at": "2026-10-30T20:49:12.638668Z",
  "completed_at": "2026-10-30T20:50:44.109376Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91` → **200**

```json
{
  "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4b734508-6bc7-4405-af97-f436ebd194b1",
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
    "id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
    "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "81af17c7-0828-42fa-b903-d141094ee10b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:49:04.41535Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91` → **200**

```json
{
  "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4b734508-6bc7-4405-af97-f436ebd194b1",
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
    "id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
    "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "81af17c7-0828-42fa-b903-d141094ee10b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:49:04.41535Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91` → **200**

```json
{
  "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4b734508-6bc7-4405-af97-f436ebd194b1",
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
    "id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
    "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "81af17c7-0828-42fa-b903-d141094ee10b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:49:04.41535Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91` → **200**

```json
{
  "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4b734508-6bc7-4405-af97-f436ebd194b1",
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
    "id": "a11c9fe5-0cf4-4055-b48a-0fd5b0986a26",
    "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "81af17c7-0828-42fa-b903-d141094ee10b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:49:04.41535Z",
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
  "session_id": "779d6540-89f2-4cd0-9d7e-221549d0db16",
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
  "last_heartbeat_at": "2026-10-30T20:50:43.892905Z",
  "last_location_at": "2026-10-30T20:50:43.892905Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/779d6540-89f2-4cd0-9d7e-221549d0db16/close` → **200**

```json
{
  "command_id": "fa3b1671-0c3b-4624-9921-7c55654e834f",
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
  "session_id": "8d3ce551-bb0c-4596-8dc9-b72adc9956bb",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzNDgsImlhdCI6MTc5MzM5MzQ0OCwianRpIjoiZTY3ZjlkOGQtNjkyMS00ZjAwLWJjNGYtOTEyMDkzMmI5ZjA2Iiwic2lkIjoiOGQzY2U1NTEtYmIwYy00NTk2LThkYzktYjcyYWRjOTk1NmJiIn0.kmVyDSmHkIb0E-lnQDHsF4NjNCQN7X1EqWIuaFr_F50",
  "access_expires_at": "2026-10-30T21:05:48.838232813Z",
  "refresh_token": "4u0kxTrgrNg6x8pFoK5WeLq4pNkafJ6nqLjH4JXmNtA",
  "refresh_expires_at": "2026-10-31T08:50:48.837832006Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8b622dc0-173a-4c3c-9f05-9d5789c3ca1a"
}
```

`GET /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T20:50:49.264072948Z",
  "order": {
    "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
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
    "created_at": "2026-10-30T20:49:04.41535Z",
    "assigned_at": "2026-10-30T20:49:06.291389Z",
    "arrived_at": "2026-10-30T20:49:12.418772Z",
    "started_at": "2026-10-30T20:49:12.638668Z",
    "completed_at": "2026-10-30T20:50:44.109376Z"
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
    "id": "4b734508-6bc7-4405-af97-f436ebd194b1",
    "registered_at": "2026-10-30T20:49:02.664398Z",
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
      "created_at": "2026-10-30T20:49:04.416909Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T20:50:44.963774Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks` → **422**

```json
{
  "command_id": "a7e5a42a-1777-4638-b190-869770e9f99a",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "c34c8f2d-083a-495e-bf95-7a26706d3dee"
}
```

`POST /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks` → **201**

```json
{
  "command_id": "7e20b97b-e070-4d7e-bbef-a768de7a60bf",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "8073255a-8bf9-4b37-ad76-c077028ecd0d",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T20:50:49.76011Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks` → **201**

```json
{
  "command_id": "7e20b97b-e070-4d7e-bbef-a768de7a60bf",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "8073255a-8bf9-4b37-ad76-c077028ecd0d",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T20:50:49.76011Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/4b734508-6bc7-4405-af97-f436ebd194b1` → **200**

```json
{
  "client": {
    "id": "4b734508-6bc7-4405-af97-f436ebd194b1",
    "phone": "+380732818106",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T20:49:02.664398Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T20:49:04.41535Z",
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

`POST /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks/8073255a-8bf9-4b37-ad76-c077028ecd0d/resolve` → **200**

```json
{
  "command_id": "cc66fee8-b5bb-478f-a808-1f554582b266",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "8073255a-8bf9-4b37-ad76-c077028ecd0d",
  "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T20:50:49.76011Z",
  "resolved_at": "2026-10-30T20:50:50.446397Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/4b734508-6bc7-4405-af97-f436ebd194b1` → **200**

```json
{
  "client": {
    "id": "4b734508-6bc7-4405-af97-f436ebd194b1",
    "phone": "+380732818106",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T20:49:02.664398Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T20:49:04.41535Z",
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

`GET /api/admin/v1/clients/4b734508-6bc7-4405-af97-f436ebd194b1` → **200**

```json
{
  "client": {
    "id": "4b734508-6bc7-4405-af97-f436ebd194b1",
    "phone": "+380732818106",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T20:49:02.664398Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T20:49:04.41535Z",
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

`POST /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks/8073255a-8bf9-4b37-ad76-c077028ecd0d/resolve` → **409**

```json
{
  "command_id": "9cc5c17f-247c-4037-938c-8c8aa6cb6c15",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks/8073255a-8bf9-4b37-ad76-c077028ecd0d/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ae751c87-b577-4150-8b26-e593db49de6b"
}
```

`GET /api/admin/v1/orders/751d4bc7-60f2-4230-8677-e345e0cb8f91/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "8073255a-8bf9-4b37-ad76-c077028ecd0d",
      "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T20:50:49.76011Z",
      "resolved_at": "2026-10-30T20:50:50.446397Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 751d4bc7-60f2-4230-8677-e345e0cb8f91 without phone or card digits; chargeback 8073255a-8bf9-4b37-ad76-c077028ecd0d recorded and won.

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
  "session_id": "f96703f8-93e4-43a3-a3a8-d3d9f932704f",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzNTIsImlhdCI6MTc5MzM5MzQ1MiwianRpIjoiYjFkYWUwODgtNDEzNC00MzRjLWJjZGMtYzNmOTY0ODVmMjE2Iiwic2lkIjoiZjk2NzAzZjgtOTNlNC00M2EzLWEzYTgtZDNkOWY5MzI3MDRmIn0.xhX1fqEi6QHzXdJ1cgzX4G-TQdGUmYuQhDDWcDKl94Y",
  "access_expires_at": "2026-10-30T21:05:52.98511438Z",
  "refresh_token": "iMISeraPtczB-bcKNoU4PMb71Tob5OVQii0tnD6yc0A",
  "refresh_expires_at": "2026-10-31T08:50:52.984719391Z",
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
  "phone": "+48600540001",
  "device_ref": "sandbox-31409"
}
```

```json
{
  "challenge_id": "746a0c7b-7073-4e00-9115-9a13d0c2b48a",
  "expires_at": "2026-10-30T20:55:53.614786707Z",
  "resend_available_at": "2026-10-30T20:50:54.614786707Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600540001` → **200**

```json
{
  "phone": "+48600540001",
  "audience": "CLIENT",
  "code": "535247",
  "sent_at": "2026-10-30T20:50:53.616856444Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "746a0c7b-7073-4e00-9115-9a13d0c2b48a",
  "code": "535247",
  "device_ref": "sandbox-31409"
}
```

```json
{
  "session_id": "ce7e3e26-7d55-4bfa-aaa7-48f04aeda5d8",
  "subject": {
    "type": "CLIENT",
    "id": "6e84d6f9-9f92-464b-bf64-b59a8e6ba31d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTg0ZDZmOS05ZjkyLTQ2NGItYmY2NC1iNTlhOGU2YmEzMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MzUzLCJpYXQiOjE3OTMzOTM0NTMsImp0aSI6IjEwOGIxMDNhLWUwOGYtNGNmZS04ZjFmLWMxMWM5YThkODYwMCIsInNpZCI6ImNlN2UzZTI2LTdkNTUtNGJmYS1hYWE3LTQ4ZjA0YWVkYTVkOCJ9.iym0j0s4lm75pi2HqSQ73zN6Jzeo4V6UAut4POYWoBA",
  "access_expires_at": "2026-10-30T21:05:53.870007947Z",
  "refresh_token": "fHE2aNsFAPNOx_pNbLJjbVyBQ3wCrPFkbxpieGRq-CA",
  "refresh_expires_at": "2026-11-29T20:50:53.869589073Z",
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
  "command_id": "a36cacb9-53c6-49c5-bdb6-ab93ae5bc581",
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
  "correlation_id": "65b104ec-d8dc-4c42-9906-12e471b53a2f",
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
  "command_id": "639587fc-d684-4f56-b301-ad2d651d29ee",
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
  "paused_at": "2026-10-30T20:50:54.702862512Z",
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
  "command_id": "1c01e40c-5e17-4390-9bca-23dded366861",
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
  "id": "43807968-6a79-4b75-9183-0cdb6bffe337",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:55:55.143108Z",
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
  "command_id": "4a58e09c-febc-44aa-924a-7e903b24c74f",
  "quote_id": "43807968-6a79-4b75-9183-0cdb6bffe337",
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
  "correlation_id": "c51f569c-76c8-4182-9093-d5135e27c130"
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
  "paused_at": "2026-10-30T20:50:54.702863Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "026fb7c3-8bf8-4e35-8b73-6f8059073f8a",
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
  "command_id": "f81f6281-50ff-45d7-92cf-1a83e1e85f15",
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
  "command_id": "8c386bbb-2db0-4694-a391-87a78fe4732e",
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
  "id": "0081c563-889f-4b35-a80b-4c1b99d88183",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:55:56.412342Z",
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
  "command_id": "65a0ab86-b6bd-4d1c-b811-1c0323b42349",
  "quote_id": "0081c563-889f-4b35-a80b-4c1b99d88183",
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
  "correlation_id": "eed34bb3-f555-41b6-b1e9-e9e786848a46"
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
  "command_id": "c90be429-4236-4554-8486-9c675ecd6329",
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
      "from": "23:00",
      "to": "00:00"
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
      "from": "23:00",
      "to": "00:00"
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
  "command_id": "63c4432e-4e16-4798-8be8-0e91b8dce819",
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
  "id": "7fd7af06-9e0d-4653-a886-6d63cf7231c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:55:57.260894Z",
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
  "command_id": "423a3246-7113-49f1-9701-c800459cad19",
  "quote_id": "7fd7af06-9e0d-4653-a886-6d63cf7231c5",
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
  "correlation_id": "9697596f-203d-436c-acbc-e498064ee8a7"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "7e00cf32-31b0-4780-b6a6-82384537445f",
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
  "correlation_id": "666199d1-9506-47b2-adb6-72fbff995458",
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
      "from": "23:00",
      "to": "00:00"
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
  "command_id": "2660f301-0c60-4489-8abf-bec5688a18bd",
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
  "phone": "+380678201498",
  "device_ref": "sandbox-13666"
}
```

```json
{
  "challenge_id": "cbd34ae2-2868-4c69-bd86-89290f59a1df",
  "expires_at": "2026-10-30T20:55:58.348252649Z",
  "resend_available_at": "2026-10-30T20:50:59.348252649Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678201498` → **200**

```json
{
  "phone": "+380678201498",
  "audience": "CLIENT",
  "code": "281750",
  "sent_at": "2026-10-30T20:50:58.350360258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbd34ae2-2868-4c69-bd86-89290f59a1df",
  "code": "281750",
  "device_ref": "sandbox-13666"
}
```

```json
{
  "session_id": "e24371ac-c5da-4fdf-a1d0-6c7e8a63036a",
  "subject": {
    "type": "CLIENT",
    "id": "425fdb24-1a00-4bb8-8411-cddd1b41c497"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjVmZGIyNC0xYTAwLTRiYjgtODQxMS1jZGRkMWI0MWM0OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MzU4LCJpYXQiOjE3OTMzOTM0NTgsImp0aSI6ImRiZmRiNmNiLTI5YjEtNGM1NC1iMDVmLTZlZmFlNGIzYzYxNCIsInNpZCI6ImUyNDM3MWFjLWM1ZGEtNGZkZi1hMWQwLTZjN2U4YTYzMDM2YSJ9.pJqKg9JrodarGMMo8qw1fWo4zXLvItdO0DeMHgHGFbY",
  "access_expires_at": "2026-10-30T21:05:58.580568338Z",
  "refresh_token": "Qvx1WHtvM4c1HJVLTGn6jWJzf4Ia9qqDZdGmrb6rcA4",
  "refresh_expires_at": "2026-11-29T20:50:58.580123804Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "425fdb24-1a00-4bb8-8411-cddd1b41c497",
  "session_id": "e24371ac-c5da-4fdf-a1d0-6c7e8a63036a",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2f2178a3-a876-4589-bfc2-98b223e6d3cc",
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
  "id": "05abc36c-e2dd-4b62-b77c-9e9a55a54977",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:55:58.992092Z",
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
  "challenge_id": "637e5ee4-20e2-44fb-89a9-ed8b26be99dd",
  "expires_at": "2026-10-30T20:56:01.207917633Z",
  "resend_available_at": "2026-10-30T20:51:02.207917633Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678201498` → **200**

```json
{
  "phone": "+380678201498",
  "audience": "CLIENT",
  "code": "564854",
  "sent_at": "2026-10-30T20:51:01.209577889Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "40450231-7eea-46c0-836b-2724787debd8",
  "challenge_id": "637e5ee4-20e2-44fb-89a9-ed8b26be99dd",
  "otp_code": "564854"
}
```

```json
{
  "client_id": "425fdb24-1a00-4bb8-8411-cddd1b41c497",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T20:51:01.441018129Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "9ecf0639-0059-4ffa-b6cc-d4b7447fd989",
  "quote_id": "05abc36c-e2dd-4b62-b77c-9e9a55a54977",
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
  "correlation_id": "6b86efea-59ff-4aed-9299-6be31041ac38"
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
  "session_id": "6ccef693-a037-497d-ab43-f26766ae1d7e",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzNjIsImlhdCI6MTc5MzM5MzQ2MiwianRpIjoiMjBkNjVlOGItM2MyZS00ZDg3LTg3ZjYtMTZkM2M5Y2U0NjVhIiwic2lkIjoiNmNjZWY2OTMtYTAzNy00OTdkLWFiNDMtZjI2NzY2YWUxZDdlIn0.ZpyTY3fYP9PQAW5xPqFUrFJNuaJVLYzP7IYHNHu3pPk",
  "access_expires_at": "2026-10-30T21:06:02.066676255Z",
  "refresh_token": "fKRNZY-OqySTz2qYlq2peizMQ2754MR9AeoqwfIvBaQ",
  "refresh_expires_at": "2026-10-31T08:51:02.066231603Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "425fdb24-1a00-4bb8-8411-cddd1b41c497",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T20:51:01.441018Z",
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

`POST /api/admin/v1/client-deletions/425fdb24-1a00-4bb8-8411-cddd1b41c497/complete` → **200**

```json
{
  "command_id": "3263df50-3fe8-4c36-9061-06205a9caa9f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "425fdb24-1a00-4bb8-8411-cddd1b41c497",
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
  "correlation_id": "2ea10ef1-362a-4b19-8ebc-1a1128f22dd8"
}
```

Done: client 425fdb24-1a00-4bb8-8411-cddd1b41c497 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661973659",
  "device_ref": "sandbox-2621"
}
```

```json
{
  "challenge_id": "88135e02-7cad-4b9f-a880-0a7a3af33b03",
  "expires_at": "2026-10-30T20:56:02.906237197Z",
  "resend_available_at": "2026-10-30T20:51:03.906237197Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661973659` → **200**

```json
{
  "phone": "+380661973659",
  "audience": "CLIENT",
  "code": "703273",
  "sent_at": "2026-10-30T20:51:02.908391318Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88135e02-7cad-4b9f-a880-0a7a3af33b03",
  "code": "703273",
  "device_ref": "sandbox-2621"
}
```

```json
{
  "session_id": "b931d6df-b015-4e1a-8588-15416b276189",
  "subject": {
    "type": "CLIENT",
    "id": "13e90bc5-612c-4436-9301-72325ca1cebc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxM2U5MGJjNS02MTJjLTQ0MzYtOTMwMS03MjMyNWNhMWNlYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MzYzLCJpYXQiOjE3OTMzOTM0NjMsImp0aSI6IjdhZDhhMjZkLTUyNDYtNDlhZS04YjFkLTVjNjA0MWU0ZThlNCIsInNpZCI6ImI5MzFkNmRmLWIwMTUtNGUxYS04NTg4LTE1NDE2YjI3NjE4OSJ9.GzYVhqksorxqDetNTS4M-Jk099PN5KQ-k6oqXYocF0M",
  "access_expires_at": "2026-10-30T21:06:03.141820619Z",
  "refresh_token": "AmQqZ0jQgVzXHu7yhxcWfzqqDk_r4lZ1axr1ed9Ndfc",
  "refresh_expires_at": "2026-11-29T20:51:03.141371997Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "13e90bc5-612c-4436-9301-72325ca1cebc",
  "session_id": "b931d6df-b015-4e1a-8588-15416b276189",
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
  "session_id": "843ea0d5-5ae7-4918-bab1-9f0bb2e1950e",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzNjMsImlhdCI6MTc5MzM5MzQ2MywianRpIjoiZDdjOWQzZDMtMDQyZi00ZmU5LTliZTEtMTQ4ZmM3MDNkMmYxIiwic2lkIjoiODQzZWEwZDUtNWFlNy00OTE4LWJhYjEtOWYwYmIyZTE5NTBlIn0.BjzkZdKX_fSuaEMcM94kGvx7DUBhyflci9CBIKaUx2s",
  "access_expires_at": "2026-10-30T21:06:03.771525116Z",
  "refresh_token": "hoR3g5qOF_aTe48cha_USAG9lYTcaVehlb6QXkqK-JI",
  "refresh_expires_at": "2026-10-31T08:51:03.771107765Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1973659&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "13e90bc5-612c-4436-9301-72325ca1cebc",
      "phone": "+380661973659",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T20:51:03.139952Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/13e90bc5-612c-4436-9301-72325ca1cebc` → **200**

```json
{
  "client": {
    "id": "13e90bc5-612c-4436-9301-72325ca1cebc",
    "phone": "+380661973659",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T20:51:03.139952Z",
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

`POST /api/admin/v1/clients/13e90bc5-612c-4436-9301-72325ca1cebc/block` → **400**

```json
{
  "command_id": "43932330-3adb-4f19-ab1e-8975af974cfd",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/13e90bc5-612c-4436-9301-72325ca1cebc/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "339151e8-a41b-4904-b05d-70361f2191aa",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/13e90bc5-612c-4436-9301-72325ca1cebc/block` → **200**

```json
{
  "command_id": "82ad07a8-6608-41ae-b5e6-7413233f8288",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "13e90bc5-612c-4436-9301-72325ca1cebc",
  "phone": "+380661973659",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T20:51:03.139952Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T20:51:04.653027Z",
    "by": "188b6db1-901f-476e-b592-dea8cdf876d3"
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
  "correlation_id": "02f4e1a6-68ae-4b42-a9c6-6979238c863f"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661973659",
  "device_ref": "sandbox-15225"
}
```

```json
{
  "challenge_id": "1e4d8c1c-7425-4990-b825-d9a1fc3b9752",
  "expires_at": "2026-10-30T20:56:07.073846957Z",
  "resend_available_at": "2026-10-30T20:51:08.073846957Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661973659` → **200**

```json
{
  "phone": "+380661973659",
  "audience": "CLIENT",
  "code": "833363",
  "sent_at": "2026-10-30T20:51:07.075857065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1e4d8c1c-7425-4990-b825-d9a1fc3b9752",
  "code": "833363",
  "device_ref": "sandbox-15225"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "134a7511-ccf0-4e2c-9b24-f3807829ca80"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/13e90bc5-612c-4436-9301-72325ca1cebc` → **200**

```json
{
  "client": {
    "id": "13e90bc5-612c-4436-9301-72325ca1cebc",
    "phone": "+380661973659",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T20:51:03.139952Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T20:51:04.653027Z",
      "by": "188b6db1-901f-476e-b592-dea8cdf876d3"
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

`POST /api/admin/v1/clients/13e90bc5-612c-4436-9301-72325ca1cebc/unblock` → **200**

```json
{
  "command_id": "39304fa8-1733-45a2-869c-7c5d7ccb9bc5",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "13e90bc5-612c-4436-9301-72325ca1cebc",
  "phone": "+380661973659",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T20:51:03.139952Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661973659",
  "device_ref": "sandbox-2075"
}
```

```json
{
  "challenge_id": "199ac777-3d9a-4e8c-8e0c-efae2c0d8149",
  "expires_at": "2026-10-30T20:56:09.948809474Z",
  "resend_available_at": "2026-10-30T20:51:10.948809474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661973659` → **200**

```json
{
  "phone": "+380661973659",
  "audience": "CLIENT",
  "code": "234184",
  "sent_at": "2026-10-30T20:51:09.950753384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "199ac777-3d9a-4e8c-8e0c-efae2c0d8149",
  "code": "234184",
  "device_ref": "sandbox-2075"
}
```

```json
{
  "session_id": "56c68cb6-6151-4dcf-a8d1-702f6553ed79",
  "subject": {
    "type": "CLIENT",
    "id": "13e90bc5-612c-4436-9301-72325ca1cebc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxM2U5MGJjNS02MTJjLTQ0MzYtOTMwMS03MjMyNWNhMWNlYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MzcwLCJpYXQiOjE3OTMzOTM0NzAsImp0aSI6IjBiMTY2YWVmLWI5NGMtNDdmZC04NWI4LTgyNTAyZGY3NjcyZiIsInNpZCI6IjU2YzY4Y2I2LTYxNTEtNGRjZi1hOGQxLTcwMmY2NTUzZWQ3OSJ9.Xj9dXvlrOwI9TYZi2xmf1xW1tKGT7tx1uQFjNdV32-w",
  "access_expires_at": "2026-10-30T21:06:10.182695539Z",
  "refresh_token": "iblUg1ywEtsjMvWEm9-Mz8Zio21VHx19hWwG7tKonrE",
  "refresh_expires_at": "2026-11-29T20:51:10.182261122Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "13e90bc5-612c-4436-9301-72325ca1cebc",
  "session_id": "56c68cb6-6151-4dcf-a8d1-702f6553ed79",
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
  "phone": "+380668636956",
  "device_ref": "sandbox-21635"
}
```

```json
{
  "challenge_id": "8f0806d8-e31b-4ef8-82fb-a561300eb7c0",
  "expires_at": "2026-10-30T20:56:10.62490376Z",
  "resend_available_at": "2026-10-30T20:51:11.62490376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668636956` → **200**

```json
{
  "phone": "+380668636956",
  "audience": "CLIENT",
  "code": "806466",
  "sent_at": "2026-10-30T20:51:10.627045184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f0806d8-e31b-4ef8-82fb-a561300eb7c0",
  "code": "806466",
  "device_ref": "sandbox-21635"
}
```

```json
{
  "session_id": "6568aed3-aa0b-4b99-bd34-0d5d473def9f",
  "subject": {
    "type": "CLIENT",
    "id": "6f9ddc36-b4f6-4950-86e9-1042bdaa93e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjlkZGMzNi1iNGY2LTQ5NTAtODZlOS0xMDQyYmRhYTkzZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MzcwLCJpYXQiOjE3OTMzOTM0NzAsImp0aSI6IjUyMDhlMGVlLWQwZDAtNDE0OS04MTExLWFmODI2NTQ2NjkxZCIsInNpZCI6IjY1NjhhZWQzLWFhMGItNGI5OS1iZDM0LTBkNWQ0NzNkZWY5ZiJ9.LCnVe3E4NBc9CHbpNSBgZk0jijwc7b32Nw0xq0nU0q0",
  "access_expires_at": "2026-10-30T21:06:10.852680735Z",
  "refresh_token": "irmbj07wCSa_k6SeGB-yxJpmiDEiouCKe_BDdfMxSkI",
  "refresh_expires_at": "2026-11-29T20:51:10.8522739Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e710dd3-7669-48f1-ba28-e3ba8abcbd29",
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
  "id": "fec413f9-bd4a-459a-93b5-febc699487ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:56:11.071402Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 90aaba94-5dd7-4abb-80d3-0fccc9656d99) → **201**

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
  "session_id": "b61915f0-eabb-4607-851f-ecb7fb082e24",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzNzEsImlhdCI6MTc5MzM5MzQ3MSwianRpIjoiYzVlYjRmMGQtMTMzMC00OTIxLTkyMzItYmMzYTY3MDNkYWI1Iiwic2lkIjoiYjYxOTE1ZjAtZWFiYi00NjA3LTg1MWYtZWNiN2ZiMDgyZTI0In0.89_p5dcCkP0SHukmo5XnZSP8BEbbvbOd8hEgzQicUO4",
  "access_expires_at": "2026-10-30T21:06:11.526522906Z",
  "refresh_token": "KERUV5gbQ-T_2TxXJYAJTjQPaahyz8ZfKQMez7r9lzo",
  "refresh_expires_at": "2026-10-31T08:51:11.526031663Z",
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
  "session_id": "5806b8ee-2477-410f-a9ad-97bf5876ee59",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzNzEsImlhdCI6MTc5MzM5MzQ3MSwianRpIjoiODBjYjMxOTEtOTNjMy00NTY0LTg2YWItMWNlYmZiYmYyZDE2Iiwic2lkIjoiNTgwNmI4ZWUtMjQ3Ny00MTBmLWE5YWQtOTdiZjU4NzZlZTU5In0.V3TIkNrcpCWHBeU6XdYpOP4RPlqD_a289hhsdSzYTW8",
  "access_expires_at": "2026-10-30T21:06:11.947734664Z",
  "refresh_token": "kJs61kXVROY-dhmi-LF3757HVJZ1tK-RWoLOxe9GJm0",
  "refresh_expires_at": "2026-10-31T08:51:11.947338245Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/076ddbe0-96fb-4ce0-a753-1818982a9e5b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T20:51:11.282824Z",
      "actor": {
        "type": "CLIENT",
        "id": "6f9ddc36-b4f6-4950-86e9-1042bdaa93e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
        "quote_id": "fec413f9-bd4a-459a-93b5-febc699487ea",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "90aaba94-5dd7-4abb-80d3-0fccc9656d99"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T20:51:11.283679Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
        "attempt_id": "ef971edf-b5a8-4985-a0eb-d62d27b43960",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "90aaba94-5dd7-4abb-80d3-0fccc9656d99"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T20:51:11.28579Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
        "attempt_id": "ef971edf-b5a8-4985-a0eb-d62d27b43960"
      },
      "correlation_id": "90aaba94-5dd7-4abb-80d3-0fccc9656d99"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "ef971edf-b5a8-4985-a0eb-d62d27b43960",
        "generation": 1,
        "started_at": "2026-10-30T20:51:11.283271Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T20:51:11.28579Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T20:51:11.283973Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/90aaba94-5dd7-4abb-80d3-0fccc9656d99` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b:0",
      "order_id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
      "at": "2026-10-30T20:51:11.282824Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b:1",
      "order_id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
      "at": "2026-10-30T20:51:11.283679Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b:2",
      "order_id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
      "at": "2026-10-30T20:51:11.28579Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/6d9f14f1-50c5-449c-81b6-692f418e9e70` → **200**

```json
{
  "found": []
}
```

Done: request 90aaba94-5dd7-4abb-80d3-0fccc9656d99 — order 076ddbe0-96fb-4ce0-a753-1818982a9e5b found by its id.

`GET /api/rider/v1/orders/076ddbe0-96fb-4ce0-a753-1818982a9e5b` → **200**

```json
{
  "id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f9ddc36-b4f6-4950-86e9-1042bdaa93e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:51:11.282491Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/076ddbe0-96fb-4ce0-a753-1818982a9e5b/cancel` → **200**

```json
{
  "command_id": "e8806aac-b409-40d9-89a5-efa72cd6153e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "076ddbe0-96fb-4ce0-a753-1818982a9e5b",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f9ddc36-b4f6-4950-86e9-1042bdaa93e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:51:11.282491Z",
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
  "pickup_eta": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632796957",
  "device_ref": "sandbox-17947"
}
```

```json
{
  "challenge_id": "7bd2d51d-8b09-48ef-ac48-f4c9ba848c97",
  "expires_at": "2026-10-30T20:56:13.257159395Z",
  "resend_available_at": "2026-10-30T20:51:14.257159395Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632796957` → **200**

```json
{
  "phone": "+380632796957",
  "audience": "CLIENT",
  "code": "598067",
  "sent_at": "2026-10-30T20:51:13.25982697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bd2d51d-8b09-48ef-ac48-f4c9ba848c97",
  "code": "598067",
  "device_ref": "sandbox-17947"
}
```

```json
{
  "session_id": "9c1495d4-1531-484e-801c-67bd26a88cf6",
  "subject": {
    "type": "CLIENT",
    "id": "00b7a64e-0bdb-4df8-92a6-dd479b00b587"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGI3YTY0ZS0wYmRiLTRkZjgtOTJhNi1kZDQ3OWIwMGI1ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0MzczLCJpYXQiOjE3OTMzOTM0NzMsImp0aSI6IjhhODYyODZjLTdlNDItNDM5My05YWI3LTZjNTM5YjI0MGU2YyIsInNpZCI6IjljMTQ5NWQ0LTE1MzEtNDg0ZS04MDFjLTY3YmQyNmE4OGNmNiJ9.vIS0PfunwUd2xeqhfHivfPcYETPkepjOfxYb1eom250",
  "access_expires_at": "2026-10-30T21:06:13.508481833Z",
  "refresh_token": "ajBMSaGFBGtT7c8pgadNgGaB9xgbBRv1UvnZTlJUsUs",
  "refresh_expires_at": "2026-11-29T20:51:13.508049329Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b03c9524-0da9-4cf3-8c3e-731553d4ac7c",
  "expires_at": "2026-10-30T20:56:15.720453597Z",
  "resend_available_at": "2026-10-30T20:51:16.720453597Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632796957` → **200**

```json
{
  "phone": "+380632796957",
  "audience": "CLIENT",
  "code": "917506",
  "sent_at": "2026-10-30T20:51:15.722985602Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "17e344cf-face-4029-91b1-4d15dbd585da",
  "challenge_id": "b03c9524-0da9-4cf3-8c3e-731553d4ac7c",
  "otp_code": "917506"
}
```

```json
{
  "id": "a66c0e72-9423-4edc-bb12-87b72744d8d2",
  "state": "PENDING",
  "created_at": "2026-10-30T20:51:15.967076Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/a66c0e72-9423-4edc-bb12-87b72744d8d2` → **200**

```json
{
  "id": "a66c0e72-9423-4edc-bb12-87b72744d8d2",
  "state": "PENDING",
  "created_at": "2026-10-30T20:51:15.967076Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a66c0e72-9423-4edc-bb12-87b72744d8d2` → **200**

```json
{
  "id": "a66c0e72-9423-4edc-bb12-87b72744d8d2",
  "state": "PENDING",
  "created_at": "2026-10-30T20:51:15.967076Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a66c0e72-9423-4edc-bb12-87b72744d8d2` → **200**

```json
{
  "id": "a66c0e72-9423-4edc-bb12-87b72744d8d2",
  "state": "READY",
  "created_at": "2026-10-30T20:51:15.967076Z",
  "ready_at": "2026-10-30T20:51:17.547312Z",
  "expires_at": "2026-11-06T20:51:17.547312Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/a66c0e72-9423-4edc-bb12-87b72744d8d2/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632437508",
  "device_ref": "sandbox-30380"
}
```

```json
{
  "challenge_id": "3029ddd6-1999-40a2-bb37-398d649a2a5a",
  "expires_at": "2026-10-30T20:56:18.820757651Z",
  "resend_available_at": "2026-10-30T20:51:19.820757651Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632437508` → **200**

```json
{
  "phone": "+380632437508",
  "audience": "CLIENT",
  "code": "951093",
  "sent_at": "2026-10-30T20:51:18.822788113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3029ddd6-1999-40a2-bb37-398d649a2a5a",
  "code": "951093",
  "device_ref": "sandbox-30380"
}
```

```json
{
  "session_id": "60a50f46-18aa-4e90-978f-27df7da3a07c",
  "subject": {
    "type": "CLIENT",
    "id": "10409d48-2260-4545-9caa-65e9aa13b124"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDQwOWQ0OC0yMjYwLTQ1NDUtOWNhYS02NWU5YWExM2IxMjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0Mzc5LCJpYXQiOjE3OTMzOTM0NzksImp0aSI6IjlhMzRhZWY3LTc1MzYtNDYyZS1hMjBiLWNiOTI4MmZmYjJlYyIsInNpZCI6IjYwYTUwZjQ2LTE4YWEtNGU5MC05NzhmLTI3ZGY3ZGEzYTA3YyJ9.wyiDO7ZZV2GXc2S6Xgt0aEOnOqcwDuKfLkB-pAHiTBg",
  "access_expires_at": "2026-10-30T21:06:19.052570268Z",
  "refresh_token": "xQ5OQciVaJKPUEfg_9PyIlmvih8Fk-s_N5PqmJDF5c4",
  "refresh_expires_at": "2026-11-29T20:51:19.052069546Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/a66c0e72-9423-4edc-bb12-87b72744d8d2/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/a66c0e72-9423-4edc-bb12-87b72744d8d2/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9a0e78bb-7b32-4ac6-b1ef-3570c71e9704"
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
  "session_id": "30a6a428-c3b3-4bb9-ad81-237f17eef854",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzNzksImlhdCI6MTc5MzM5MzQ3OSwianRpIjoiYTQ3OGE0MWEtN2Y4My00MzYwLWJkZmQtYzU1YjBlMTk1ZmRlIiwic2lkIjoiMzBhNmE0MjgtYzNiMy00YmI5LWFkODEtMjM3ZjE3ZWVmODU0In0.20vnekQu7obEW4MPzu5VYTg8QN8lxiB9ZKTPoqoLiJg",
  "access_expires_at": "2026-10-30T21:06:19.678134161Z",
  "refresh_token": "GVHMz2L-2Vx219vYK0ABy5m1lWRXWaAySSlXv_wTdz0",
  "refresh_expires_at": "2026-10-31T08:51:19.677695322Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "00b7a64e-0bdb-4df8-92a6-dd479b00b587",
  "session_id": "9c1495d4-1531-484e-801c-67bd26a88cf6",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/00b7a64e-0bdb-4df8-92a6-dd479b00b587/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "a66c0e72-9423-4edc-bb12-87b72744d8d2",
      "state": "READY",
      "created_at": "2026-10-30T20:51:15.967076Z",
      "ready_at": "2026-10-30T20:51:17.547312Z",
      "expires_at": "2026-11-06T20:51:17.547312Z",
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
  "device_ref": "sandbox-13744"
}
```

```json
{
  "challenge_id": "8d8bedfc-a22b-44ab-8ddf-3093c278a121",
  "expires_at": "2026-10-30T20:56:20.302027218Z",
  "resend_available_at": "2026-10-30T20:51:21.302027218Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "222848",
  "sent_at": "2026-10-30T20:51:20.304234255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d8bedfc-a22b-44ab-8ddf-3093c278a121",
  "code": "222848",
  "device_ref": "sandbox-13744"
}
```

```json
{
  "session_id": "463afdee-58b2-4003-946f-02756f1cf60a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDM4MCwiaWF0IjoxNzkzMzkzNDgwLCJqdGkiOiI4NjY5MTFmZi05NmVjLTQ1ZWUtYTY3ZC1lNDU5YjlhYjJjNDYiLCJzaWQiOiI0NjNhZmRlZS01OGIyLTQwMDMtOTQ2Zi0wMjc1NmYxY2Y2MGEifQ.4F2jxxXw1_aHwaoUdMyeJkrI6TE1UOiWsDRKjf85jV0",
  "access_expires_at": "2026-10-30T21:06:20.536336992Z",
  "refresh_token": "lZvCiycuxclNfF8iOCD1_3ev5UzyUtEMnaz2o7-RJaM",
  "refresh_expires_at": "2026-11-29T20:51:20.53594927Z",
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
  "device_ref": "sandbox-19163"
}
```

```json
{
  "challenge_id": "ea043981-f598-475a-88d2-73f21c1255b2",
  "expires_at": "2026-10-30T20:56:20.970375856Z",
  "resend_available_at": "2026-10-30T20:51:21.970375856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "606741",
  "sent_at": "2026-10-30T20:51:20.972634199Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea043981-f598-475a-88d2-73f21c1255b2",
  "code": "606741",
  "device_ref": "sandbox-19163"
}
```

```json
{
  "session_id": "fd41afaf-af17-4ffb-8366-83e5df67020f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDM4MSwiaWF0IjoxNzkzMzkzNDgxLCJqdGkiOiJlNGNhYTUyMC1hNjZiLTRiOTMtODA2NC04NzM3MDc4ZDllY2EiLCJzaWQiOiJmZDQxYWZhZi1hZjE3LTRmZmItODM2Ni04M2U1ZGY2NzAyMGYifQ.ueJ-3Yc0Guo1S6nOtaZbm_9IdAvQeYCNGwDT_jyiWk0",
  "access_expires_at": "2026-10-30T21:06:21.221443806Z",
  "refresh_token": "V_4XzYZXgeEebi9O-MgBcuYKXMxo7wzTRyz0haig4Wg",
  "refresh_expires_at": "2026-11-29T20:51:21.22095442Z",
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
  "command_id": "ece10615-c33a-4a4f-9895-ea274a356373",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:51:21Z",
    "sequence": 1793393481651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec9401ee-ea7f-448c-b95d-eff1df714418",
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
  "last_heartbeat_at": "2026-10-30T20:51:21.667736Z",
  "last_location_at": "2026-10-30T20:51:21.667736Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-7707"
}
```

```json
{
  "challenge_id": "eeef4bd6-a331-48ed-b96c-2d6786f297a0",
  "expires_at": "2026-10-30T20:56:21.876175304Z",
  "resend_available_at": "2026-10-30T20:51:22.876175304Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "259264",
  "sent_at": "2026-10-30T20:51:21.878255833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eeef4bd6-a331-48ed-b96c-2d6786f297a0",
  "code": "259264",
  "device_ref": "sandbox-7707"
}
```

```json
{
  "session_id": "123c7ff2-2a94-4b2a-b678-cfd02d2e0048",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDM4MiwiaWF0IjoxNzkzMzkzNDgyLCJqdGkiOiJhMjY2YjMxYS1iZmJhLTRhYWMtODAxZi1lM2ViYzEyN2Q4NmMiLCJzaWQiOiIxMjNjN2ZmMi0yYTk0LTRiMmEtYjY3OC1jZmQwMmQyZTAwNDgifQ.dqv4hV47WGckExXSsgoNssR_LUrE6XYMz61Noorp50M",
  "access_expires_at": "2026-10-30T21:06:22.108806852Z",
  "refresh_token": "otpnjMBzR6kJDVMbDjYG4v2VnPBXEsNcICxLWfQJClc",
  "refresh_expires_at": "2026-11-29T20:51:22.108318478Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc",
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
  "last_heartbeat_at": "2026-10-30T20:47:39.737109Z",
  "last_location_at": "2026-10-30T20:47:39.737109Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc/handover` → **200**

```json
{
  "command_id": "14da8c00-c61a-44a3-bfc0-e8d83afdd8c6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc",
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
  "last_heartbeat_at": "2026-10-30T20:47:39.737109Z",
  "last_location_at": "2026-10-30T20:47:39.737109Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:51:22Z",
    "sequence": 1793393482776
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc",
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
  "last_heartbeat_at": "2026-10-30T20:51:22.792805Z",
  "last_location_at": "2026-10-30T20:51:22.792805Z",
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
  "session_id": "9226e3c6-3944-4cd5-b507-f73cc3a3a2c0",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzODMsImlhdCI6MTc5MzM5MzQ4MywianRpIjoiNWE2NmVlMjQtYTgzNy00OTI2LTg1MzEtODVhODllMGM3MDQ3Iiwic2lkIjoiOTIyNmUzYzYtMzk0NC00Y2Q1LWI1MDctZjczY2MzYTNhMmMwIn0.s-d8ZFMeaStMYIFwypr8kB2BBYRn-ux_29MKUMFbMKc",
  "access_expires_at": "2026-10-30T21:06:23.208051768Z",
  "refresh_token": "Kol_cxyfq_EbwmttGagXP_snvxDfQKwUVN4_d4EkEGw",
  "refresh_expires_at": "2026-10-31T08:51:23.207667867Z",
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
  "session_id": "c8eaab46-f3ec-4fb8-96e7-ff8cfcac706f",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzODMsImlhdCI6MTc5MzM5MzQ4MywianRpIjoiZWMxODdmZjctOGU0Yi00ZTUyLTkxMWQtMjhmN2RjZGUxNjBiIiwic2lkIjoiYzhlYWFiNDYtZjNlYy00ZmI4LTk2ZTctZmY4Y2ZjYWM3MDZmIn0.o4uyT7SZ6IJXVV2Au6YTjP3A3zaE_xIpc71ntxz73rM",
  "access_expires_at": "2026-10-30T21:06:23.623456772Z",
  "refresh_token": "nN026UexSGUCxyBXQhC7ShLgWXsj45zCYTucGcZEmm8",
  "refresh_expires_at": "2026-10-31T08:51:23.623044424Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683984283",
  "device_ref": "sandbox-4316"
}
```

```json
{
  "challenge_id": "b7ec3d93-b375-4c1f-bcc9-d94b3fe27554",
  "expires_at": "2026-10-30T20:56:23.825898168Z",
  "resend_available_at": "2026-10-30T20:51:24.825898168Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683984283` → **200**

```json
{
  "phone": "+380683984283",
  "audience": "CLIENT",
  "code": "076549",
  "sent_at": "2026-10-30T20:51:23.828121994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7ec3d93-b375-4c1f-bcc9-d94b3fe27554",
  "code": "076549",
  "device_ref": "sandbox-4316"
}
```

```json
{
  "session_id": "161f492d-edc1-4b3f-aedb-32cdca2c4f94",
  "subject": {
    "type": "CLIENT",
    "id": "a3e981eb-f697-4535-a36e-c41e55c8942b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2U5ODFlYi1mNjk3LTQ1MzUtYTM2ZS1jNDFlNTVjODk0MmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0Mzg0LCJpYXQiOjE3OTMzOTM0ODQsImp0aSI6Ijk0ZjIzMzFhLTg0ZmQtNDQ0ZS05ZmQzLTA4MjczZjQ3MzMzYSIsInNpZCI6IjE2MWY0OTJkLWVkYzEtNGIzZi1hZWRiLTMyY2RjYTJjNGY5NCJ9.96q5iGCtRKhfvzc--2bmVdXcVCWc5hE0AVl10sXVO-k",
  "access_expires_at": "2026-10-30T21:06:24.052695651Z",
  "refresh_token": "TyZtSHLtjn2Zd7A08OHPhSwiqi9M-VoNXG39Jttu1iE",
  "refresh_expires_at": "2026-11-29T20:51:24.052319742Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "95f030d1-1613-4963-961d-bb4ae7133506",
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
  "id": "abf7fb11-9787-4c04-94d2-f1a829bacc0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:56:24.267671Z",
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
  "command_id": "a7cc2c09-24e2-49e0-82ad-e81485c60fe4",
  "quote_id": "abf7fb11-9787-4c04-94d2-f1a829bacc0f",
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
  "id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3e981eb-f697-4535-a36e-c41e55c8942b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:51:24.495632Z",
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
    "id": "7c4f5b65-3ea5-40a7-b8d2-166c10d3a576",
    "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
    "expires_at": "2026-10-30T20:51:39.498461Z",
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

`POST /api/driver/v1/offers/7c4f5b65-3ea5-40a7-b8d2-166c10d3a576/reject` → **204**

```json
{
  "command_id": "241af270-4a90-4b27-bbad-911002529cd4"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c37a041f-ac5d-4800-bee0-39cd4b3c91ad",
    "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
    "expires_at": "2026-10-30T20:51:39.929863Z",
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

`POST /api/driver/v1/offers/c37a041f-ac5d-4800-bee0-39cd4b3c91ad/accept` → **200**

```json
{
  "command_id": "ac5b7a71-e1dd-4f85-9c9b-b68b18495812"
}
```

```json
{
  "id": "84334c8f-9b65-4531-8c64-cb4bea5c5f01",
  "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ad80a46-5490-40dd-a732-371b58bbb533",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/f044a124-f4c8-4153-9ab4-aafb301bb732/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T20:51:24.496215Z",
      "actor": {
        "type": "CLIENT",
        "id": "a3e981eb-f697-4535-a36e-c41e55c8942b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
        "quote_id": "abf7fb11-9787-4c04-94d2-f1a829bacc0f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f8e96cc5-34bc-40d9-a437-e394bc6961b8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T20:51:24.497888Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
        "attempt_id": "38d6c536-e344-4f28-88df-d5881ddd5b0b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f8e96cc5-34bc-40d9-a437-e394bc6961b8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T20:51:24.501064Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7c4f5b65-3ea5-40a7-b8d2-166c10d3a576",
        "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "f8e96cc5-34bc-40d9-a437-e394bc6961b8"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T20:51:24.92917Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7c4f5b65-3ea5-40a7-b8d2-166c10d3a576",
        "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732"
      },
      "correlation_id": "2cb08f41-a76c-4f6a-a77a-66f7c4d06c35"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order f044a124-f4c8-4153-9ab4-aafb301bb732 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/f044a124-f4c8-4153-9ab4-aafb301bb732` → **200**

```json
{
  "id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a3e981eb-f697-4535-a36e-c41e55c8942b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "84334c8f-9b65-4531-8c64-cb4bea5c5f01",
    "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8ad80a46-5490-40dd-a732-371b58bbb533",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:51:24.495632Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f044a124-f4c8-4153-9ab4-aafb301bb732/cancel` → **200**

```json
{
  "command_id": "090b7788-b418-478b-8fcd-031008f9d9d6",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a3e981eb-f697-4535-a36e-c41e55c8942b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "84334c8f-9b65-4531-8c64-cb4bea5c5f01",
    "order_id": "f044a124-f4c8-4153-9ab4-aafb301bb732",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8ad80a46-5490-40dd-a732-371b58bbb533",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T20:51:24.495632Z",
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
  "session_id": "ec9401ee-ea7f-448c-b95d-eff1df714418",
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
  "last_heartbeat_at": "2026-10-30T20:51:21.667736Z",
  "last_location_at": "2026-10-30T20:51:21.667736Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec9401ee-ea7f-448c-b95d-eff1df714418/close` → **200**

```json
{
  "command_id": "f8e51ca1-42e6-4c5d-8c3a-7c3bb04ba2d0",
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
  "session_id": "0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc",
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
  "last_heartbeat_at": "2026-10-30T20:51:22.792805Z",
  "last_location_at": "2026-10-30T20:51:22.792805Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0d920ba9-c4b0-4f4b-a1eb-3f663a38edbc/close` → **200**

```json
{
  "command_id": "3916e717-76ac-4f02-a954-add7b2a90824",
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
  "device_ref": "sandbox-15445"
}
```

```json
{
  "challenge_id": "60897b6a-657a-49c6-9259-302fa5d67fdb",
  "expires_at": "2026-10-30T20:56:26.96524137Z",
  "resend_available_at": "2026-10-30T20:51:27.96524137Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "299664",
  "sent_at": "2026-10-30T20:51:26.967314391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60897b6a-657a-49c6-9259-302fa5d67fdb",
  "code": "299664",
  "device_ref": "sandbox-15445"
}
```

```json
{
  "session_id": "264d101e-0b7a-44e7-adde-fcf29664cd0e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDM4NywiaWF0IjoxNzkzMzkzNDg3LCJqdGkiOiJiODMyMjg2Ny1iNTgzLTQ3NTMtOTc5Zi0xOGY4OTRiMmE5MDEiLCJzaWQiOiIyNjRkMTAxZS0wYjdhLTQ0ZTctYWRkZS1mY2YyOTY2NGNkMGUifQ.WEvFnmsVz7517i58qLhmJu9wnzHjaCHETWAQ_UixU8I",
  "access_expires_at": "2026-10-30T21:06:27.20281609Z",
  "refresh_token": "B8if-NuTC1PgWwfQtXZVbPtC2F3tZts5FcIqYGtiUoY",
  "refresh_expires_at": "2026-11-29T20:51:27.202381464Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "78e0717e-1d62-4c46-9aa0-8d0b03e3f77f",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "03a0b379-2fde-44d4-82fa-0ffaaf48249b",
  "upload_path": "/api/driver/v1/uploads/03a0b379-2fde-44d4-82fa-0ffaaf48249b",
  "expires_at": "2026-10-30T21:06:27.415534542Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/03a0b379-2fde-44d4-82fa-0ffaaf48249b` → **200**

```json
{
  "file_id": "03a0b379-2fde-44d4-82fa-0ffaaf48249b",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/03a0b379-2fde-44d4-82fa-0ffaaf48249b`, first bytes `425a4631c53f1035` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/03a0b379-2fde-44d4-82fa-0ffaaf48249b` → **200**

SHA-256 uploaded `57ca7f8665496701c4f3530478e85aa345d7549ed08b79cd391b228b549a687c`, downloaded `57ca7f8665496701c4f3530478e85aa345d7549ed08b79cd391b228b549a687c`.

Done: document 03a0b379-2fde-44d4-82fa-0ffaaf48249b is encrypted on disk and downloads unchanged.

# Scenario: driver-block

## Only Andrii is online; he takes an order and starts the trip

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25778"
}
```

```json
{
  "challenge_id": "82826882-bac3-4f25-89cd-f34716583254",
  "expires_at": "2026-10-30T20:56:27.703395595Z",
  "resend_available_at": "2026-10-30T20:51:28.703395595Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "096010",
  "sent_at": "2026-10-30T20:51:27.705480129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82826882-bac3-4f25-89cd-f34716583254",
  "code": "096010",
  "device_ref": "sandbox-25778"
}
```

```json
{
  "session_id": "f43b15b8-8e1c-44e5-ad6d-87482964b8b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDM4NywiaWF0IjoxNzkzMzkzNDg3LCJqdGkiOiJlYzJjNmFiNS01MzBhLTQxYjUtOGFiMC1kODEyYzlhYTYzYTciLCJzaWQiOiJmNDNiMTViOC04ZTFjLTQ0ZTUtYWQ2ZC04NzQ4Mjk2NGI4YjMifQ.WvveJc9uZQsEYyIIdtJtq-pbvUo1wnkW_BLKJl36p8w",
  "access_expires_at": "2026-10-30T21:06:27.940907631Z",
  "refresh_token": "CiDhacKIstY1gTZGRzYtX_KYjFjaKcpTEwg8Ok-L4U4",
  "refresh_expires_at": "2026-11-29T20:51:27.940412649Z",
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
  "device_ref": "sandbox-27272"
}
```

```json
{
  "challenge_id": "0f0f4614-0f45-4d18-911d-5400d51783a2",
  "expires_at": "2026-10-30T20:56:28.387052623Z",
  "resend_available_at": "2026-10-30T20:51:29.387052623Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "418863",
  "sent_at": "2026-10-30T20:51:28.390095251Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f0f4614-0f45-4d18-911d-5400d51783a2",
  "code": "418863",
  "device_ref": "sandbox-27272"
}
```

```json
{
  "session_id": "b4781c7e-edc2-4f32-acc3-5bab5e207903",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDM4OCwiaWF0IjoxNzkzMzkzNDg4LCJqdGkiOiJjNzIwYTNkYS1kZTYzLTQ2YjAtOWE5Mi1hYjBjYTJjMDQxNDMiLCJzaWQiOiJiNDc4MWM3ZS1lZGMyLTRmMzItYWNjMy01YmFiNWUyMDc5MDMifQ.FN37HzU-D6O-GRE-dwOVLWXyJlk7T1P5atekeckU4EU",
  "access_expires_at": "2026-10-30T21:06:28.617494091Z",
  "refresh_token": "r2nX2QHuF_tSW2PLfd_lSdOw4qJ_6Rh_eRanjPlC6TU",
  "refresh_expires_at": "2026-11-29T20:51:28.61677764Z",
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
  "session_id": "ceac6343-3ee4-4a3e-a00b-50b16fafa35f",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzODksImlhdCI6MTc5MzM5MzQ4OSwianRpIjoiMDllOTI2ZmUtNTI2ZC00ZDIzLTg1ZGItNjhjOWQwYzEyOGI1Iiwic2lkIjoiY2VhYzYzNDMtM2VlNC00YTNlLWEwMGItNTBiMTZmYWZhMzVmIn0.xLWCsUcn8Bv37-2hcEbA_HvYD4qRxx3TOcsk91l7_LU",
  "access_expires_at": "2026-10-30T21:06:29.246979357Z",
  "refresh_token": "LqxcC1u_HDBoYPf1xidj10YlQ7yXerrOGM6F1mV8I3c",
  "refresh_expires_at": "2026-10-31T08:51:29.246463587Z",
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
  "session_id": "e580462b-1d4e-48bb-b35f-a37edbf1532e",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQzODksImlhdCI6MTc5MzM5MzQ4OSwianRpIjoiMDdiYjY3NWItNTExOS00MTAzLTg4OGMtMGI3YmVhMGE1MGEzIiwic2lkIjoiZTU4MDQ2MmItMWQ0ZS00OGJiLWIzNWYtYTM3ZWRiZjE1MzJlIn0.6nBnMu2yHSxZDzvJ9b5hgZCo5HChrcH-YgOKew3Xe1Y",
  "access_expires_at": "2026-10-30T21:06:29.74631726Z",
  "refresh_token": "E9c6EVo1Uy1tqUCxw2BHtPPI-Z2NS6-LuBvGOC1PBGc",
  "refresh_expires_at": "2026-10-31T08:51:29.745887049Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11073"
}
```

```json
{
  "challenge_id": "b2854f65-8149-4f2c-b9e7-ecf81f8b4f7c",
  "expires_at": "2026-10-30T20:56:29.95514917Z",
  "resend_available_at": "2026-10-30T20:51:30.95514917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "725260",
  "sent_at": "2026-10-30T20:51:29.957375404Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2854f65-8149-4f2c-b9e7-ecf81f8b4f7c",
  "code": "725260",
  "device_ref": "sandbox-11073"
}
```

```json
{
  "session_id": "24bfd4d3-dadd-47d8-9835-ee868b124b1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDM5MCwiaWF0IjoxNzkzMzkzNDkwLCJqdGkiOiI1Y2FkMTNiZi05ZmNiLTQ4NTctYjUzZC1lMGZkMThmNzUzNzYiLCJzaWQiOiIyNGJmZDRkMy1kYWRkLTQ3ZDgtOTgzNS1lZTg2OGIxMjRiMWQifQ.aXIhXdJ93bzee-wCrP2soU75zOQ1TJ4GyiSI4h_sLPc",
  "access_expires_at": "2026-10-30T21:06:30.187870998Z",
  "refresh_token": "f5BFlznNPnqXnwIblpUU_haewATUWgARhY078ntsx9s",
  "refresh_expires_at": "2026-11-29T20:51:30.187365027Z",
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

(the car drives 73 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "cd3835e3-3b25-4a2f-ac76-d6cd3a4d4819",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:52:43Z",
    "sequence": 1793393563634
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9d26a3a6-9c84-4984-918d-b6d0509e8110",
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
  "last_heartbeat_at": "2026-10-30T20:52:43.651235Z",
  "last_location_at": "2026-10-30T20:52:43.651235Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684826504",
  "device_ref": "sandbox-20642"
}
```

```json
{
  "challenge_id": "94e091b0-1004-45c6-a220-08b1d42307fa",
  "expires_at": "2026-10-30T20:57:43.867768058Z",
  "resend_available_at": "2026-10-30T20:52:44.867768058Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684826504` → **200**

```json
{
  "phone": "+380684826504",
  "audience": "CLIENT",
  "code": "114532",
  "sent_at": "2026-10-30T20:52:43.869841519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94e091b0-1004-45c6-a220-08b1d42307fa",
  "code": "114532",
  "device_ref": "sandbox-20642"
}
```

```json
{
  "session_id": "0952e81b-066f-4486-a6b5-b6a14679970d",
  "subject": {
    "type": "CLIENT",
    "id": "3ffa4bf8-05cd-4acd-9f84-8f0768d52be5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmZhNGJmOC0wNWNkLTRhY2QtOWY4NC04ZjA3NjhkNTJiZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0NDY0LCJpYXQiOjE3OTMzOTM1NjQsImp0aSI6ImNhNTlhNWRmLTNmNjMtNDk2ZC1iNDRhLTdiZjUxYTAzNDM3MyIsInNpZCI6IjA5NTJlODFiLTA2NmYtNDQ4Ni1hNmI1LWI2YTE0Njc5OTcwZCJ9.YYiLGy8ZxJdThwtMQ2Aecl7ez_y-WdwfS0KamZZ9GPs",
  "access_expires_at": "2026-10-30T21:07:44.100186226Z",
  "refresh_token": "vvzrZQmTwfVfLPqZWPs5-56bpI56AuSaCG2CXq_d6ek",
  "refresh_expires_at": "2026-11-29T20:52:44.099728657Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a81fd760-b2b1-41c8-a841-ec90b7c7428b",
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
  "id": "ac8a0757-7f9f-430e-8e32-275f2f11dd12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:57:44.337483Z",
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
  "command_id": "a264b891-40f3-4a36-b043-ac4f73270125",
  "quote_id": "ac8a0757-7f9f-430e-8e32-275f2f11dd12",
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
  "id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3ffa4bf8-05cd-4acd-9f84-8f0768d52be5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:52:44.575067Z",
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
    "id": "2dfa73b8-17e8-47ee-a076-bfc83998425f",
    "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
    "expires_at": "2026-10-30T20:52:59.577785Z",
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

`POST /api/driver/v1/offers/2dfa73b8-17e8-47ee-a076-bfc83998425f/accept` → **200**

```json
{
  "command_id": "65d0a744-7740-4931-9c5a-5c807b593209"
}
```

```json
{
  "id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
  "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
  "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "assignment_id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
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

`POST /api/driver/v1/work-sessions/9d26a3a6-9c84-4984-918d-b6d0509e8110/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:52:49Z",
    "sequence": 1793393569452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9d26a3a6-9c84-4984-918d-b6d0509e8110",
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
  "last_heartbeat_at": "2026-10-30T20:52:49.469095Z",
  "last_location_at": "2026-10-30T20:52:49.469095Z",
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
  "id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
  "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "assignment_id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
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

`POST /api/driver/v1/trips/d25ce929-5f9b-4871-ad1a-d403426e0f3c/arrive` → **200**

```json
{
  "command_id": "2d826b33-d0b8-4184-83cc-ee72aa941729",
  "expected_version": 0
}
```

```json
{
  "id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
  "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "assignment_id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
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
  "arrived_at": "2026-10-30T20:52:49.883754Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d25ce929-5f9b-4871-ad1a-d403426e0f3c/start` → **200**

```json
{
  "command_id": "1912d77f-b5b5-4b08-99ab-85afb6a7e129",
  "expected_version": 1
}
```

```json
{
  "id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
  "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "assignment_id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
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
  "arrived_at": "2026-10-30T20:52:49.883754Z",
  "started_at": "2026-10-30T20:52:50.101528Z",
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
  "command_id": "af0d8523-fac9-4c13-8f4f-f87c6963789d",
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
  "session_id": "9d26a3a6-9c84-4984-918d-b6d0509e8110",
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
  "last_heartbeat_at": "2026-10-30T20:52:49.469095Z",
  "last_location_at": "2026-10-30T20:52:49.469095Z",
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
  "id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
  "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "assignment_id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
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
  "arrived_at": "2026-10-30T20:52:49.883754Z",
  "started_at": "2026-10-30T20:52:50.101528Z",
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
  "command_id": "2d45f31c-7332-4891-a6f3-1139192338b1",
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
  "correlation_id": "44e740e7-b9e5-4746-b32a-2c7c4ed47457"
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
  "correlation_id": "a9f6ea85-05d3-4a3c-b546-e8c724a1124e"
}
```

## He completes the trip and writes to support

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/9d26a3a6-9c84-4984-918d-b6d0509e8110/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:53:38Z",
    "sequence": 1793393618820
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9d26a3a6-9c84-4984-918d-b6d0509e8110",
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
  "last_heartbeat_at": "2026-10-30T20:53:38.838293Z",
  "last_location_at": "2026-10-30T20:53:38.838293Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d25ce929-5f9b-4871-ad1a-d403426e0f3c/complete` → **200**

```json
{
  "command_id": "27c74b89-77a3-40a0-bc6e-7d912397b812",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:53:39Z",
  "cash_received": true
}
```

```json
{
  "id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
  "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "assignment_id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
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
  "arrived_at": "2026-10-30T20:52:49.883754Z",
  "started_at": "2026-10-30T20:52:50.101528Z",
  "completed_at": "2026-10-30T20:53:39.054557Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/support/cases` → **201**

```json
{
  "command_id": "75fa7dca-f892-4d23-aedb-5e4d0f906fd0",
  "category": "OTHER",
  "subject": "Why is my account blocked?",
  "message": "Please explain."
}
```

```json
{
  "id": "8f072da3-cf55-47f4-8676-b3c558fc6986",
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
  "created_at": "2026-10-30T20:53:39.286011Z",
  "updated_at": "2026-10-30T20:53:39.286011Z",
  "respond_by": "2026-10-31T00:53:39.286011Z",
  "messages": [
    {
      "id": "e81941cd-b71a-45d8-b086-b6b7e609ef30",
      "sequence": 1,
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000403",
      "visibility": "PUBLIC",
      "body": "Please explain.",
      "created_at": "2026-10-30T20:53:39.287102Z",
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
      "id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
      "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
      "order_short_number": 14,
      "created_at": "2026-10-30T20:52:45.020981Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "81af17c7-0828-42fa-b903-d141094ee10b",
      "order_id": "751d4bc7-60f2-4230-8677-e345e0cb8f91",
      "order_short_number": 11,
      "created_at": "2026-10-30T20:49:06.291389Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "d90f3213-dcf5-476d-91b6-68bf63f0bbcd",
      "order_id": "9aae904d-09e6-4bdb-9155-62d1d5fcf4c5",
      "order_short_number": 9,
      "created_at": "2026-10-30T20:48:45.927911Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "e2571dc2-6363-4419-af42-5fdc4aa2385d",
      "order_id": "a51e8486-3748-47de-b1fa-0cafaae4ed32",
      "order_short_number": 8,
      "created_at": "2026-10-30T20:48:31.690362Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
      "phase": "COMPLETED"
    },
    {
      "id": "9172373f-4825-4324-b5a9-e45cba0c25cf",
      "order_id": "fed459ad-0b44-440b-bec6-6b0e32342f3d",
      "order_short_number": 7,
      "created_at": "2026-10-30T20:47:42.842453Z",
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
  "session_id": "9d26a3a6-9c84-4984-918d-b6d0509e8110",
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
  "last_heartbeat_at": "2026-10-30T20:53:38.838293Z",
  "last_location_at": "2026-10-30T20:53:38.838293Z",
  "eligible": false,
  "ineligible_reasons": [
    "ACCOUNT_BLOCKED",
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9d26a3a6-9c84-4984-918d-b6d0509e8110/resume` → **403**

```json
{
  "command_id": "f1b644d0-0d86-46b5-adbb-91f6f4d3fae5",
  "expected_version": 2
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/9d26a3a6-9c84-4984-918d-b6d0509e8110/resume",
  "status": 403,
  "title": "Account blocked",
  "type": "https://errors.blizz.taxi/account-blocked",
  "code": "ACCOUNT_BLOCKED",
  "correlation_id": "d7f2df5b-6323-4dc0-8086-99856101ae38"
}
```

(the car drives 46 s to the next point)

`POST /api/driver/v1/work-sessions/9d26a3a6-9c84-4984-918d-b6d0509e8110/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:29Z",
    "sequence": 1793393669177
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9d26a3a6-9c84-4984-918d-b6d0509e8110",
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
  "last_heartbeat_at": "2026-10-30T20:54:29.193809Z",
  "last_location_at": "2026-10-30T20:54:29.193809Z",
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
  "command_id": "0799103f-2e90-4cc0-ab34-e675d380aeb7",
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
  "id": "da166157-1491-4eb1-b49d-0859baf83629",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:29.407529Z",
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
  "command_id": "1f1687a6-b489-46c2-8ed3-12616c1b7622",
  "quote_id": "da166157-1491-4eb1-b49d-0859baf83629",
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
  "id": "af5139c3-c16c-4d65-8762-bf59ff915042",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3ffa4bf8-05cd-4acd-9f84-8f0768d52be5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:29.631561Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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
  "correlation_id": "0aceb603-19c8-40d8-9743-d0c2d1f2ef4d"
}
```

`GET /api/operator/v1/orders/af5139c3-c16c-4d65-8762-bf59ff915042` → **200**

```json
{
  "id": "af5139c3-c16c-4d65-8762-bf59ff915042",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3ffa4bf8-05cd-4acd-9f84-8f0768d52be5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:29.631561Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: blocked on trip d25ce929-5f9b-4871-ad1a-d403426e0f3c, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED.

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
  "command_id": "9df14bc0-1bfb-441b-90f0-69e18a82e238",
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

`GET /api/operator/v1/orders/23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8` → **200**

```json
{
  "id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3ffa4bf8-05cd-4acd-9f84-8f0768d52be5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
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
    "id": "ffb7af1e-6547-4259-be68-e80a5dc21b44",
    "order_id": "23ff09a8-c936-46ed-b27d-2a7fdcc9a2b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d25ce929-5f9b-4871-ad1a-d403426e0f3c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:52:44.575067Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/af5139c3-c16c-4d65-8762-bf59ff915042` → **200**

```json
{
  "id": "af5139c3-c16c-4d65-8762-bf59ff915042",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3ffa4bf8-05cd-4acd-9f84-8f0768d52be5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:29.631561Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/af5139c3-c16c-4d65-8762-bf59ff915042/cancel` → **200**

```json
{
  "command_id": "3c0db26c-0031-47c1-8798-8f8fefb8fa51",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "af5139c3-c16c-4d65-8762-bf59ff915042",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3ffa4bf8-05cd-4acd-9f84-8f0768d52be5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:29.631561Z",
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
  "session_id": "9d26a3a6-9c84-4984-918d-b6d0509e8110",
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
  "last_heartbeat_at": "2026-10-30T20:54:29.193809Z",
  "last_location_at": "2026-10-30T20:54:29.193809Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9d26a3a6-9c84-4984-918d-b6d0509e8110/close` → **200**

```json
{
  "command_id": "4c8bd547-3fcf-478d-8084-8bf5e2c2cb3e",
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
  "device_ref": "sandbox-23149"
}
```

```json
{
  "challenge_id": "fee19357-ee57-4ebc-8a4b-d8c112f009a5",
  "expires_at": "2026-10-30T20:59:31.85384059Z",
  "resend_available_at": "2026-10-30T20:54:32.85384059Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "345825",
  "sent_at": "2026-10-30T20:54:31.855889987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fee19357-ee57-4ebc-8a4b-d8c112f009a5",
  "code": "345825",
  "device_ref": "sandbox-23149"
}
```

```json
{
  "session_id": "e19c1bd8-7f6f-4ba0-8db8-06f63c122170",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDU3MiwiaWF0IjoxNzkzMzkzNjcyLCJqdGkiOiJlZmJhOGMxZC05NmE0LTQ0ZGYtYTc1ZC0yMWM1ZTNkN2I0ZmUiLCJzaWQiOiJlMTljMWJkOC03ZjZmLTRiYTAtOGRiOC0wNmY2M2MxMjIxNzAifQ.B55YEqa843i_ewzTppT8BQH2a60uc_nho7fRANrzSdE",
  "access_expires_at": "2026-10-30T21:09:32.085033746Z",
  "refresh_token": "BfQLwNVVCr7k18EA239W6QxABIMdfbJK24aMRFwBVHg",
  "refresh_expires_at": "2026-11-29T20:54:32.084500761Z",
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
  "device_ref": "sandbox-3967"
}
```

```json
{
  "challenge_id": "6c9fac41-7635-488a-867c-687e2c8416ad",
  "expires_at": "2026-10-30T20:59:32.497321239Z",
  "resend_available_at": "2026-10-30T20:54:33.497321239Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "729180",
  "sent_at": "2026-10-30T20:54:32.499323844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c9fac41-7635-488a-867c-687e2c8416ad",
  "code": "729180",
  "device_ref": "sandbox-3967"
}
```

```json
{
  "session_id": "7a30024b-0e64-44df-b663-29a84e35dce5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDU3MiwiaWF0IjoxNzkzMzkzNjcyLCJqdGkiOiI5YzE1NTg1Yy03MDI5LTRmMmYtYjU2MC1hZjAyNjZjNDE3NzAiLCJzaWQiOiI3YTMwMDI0Yi0wZTY0LTQ0ZGYtYjY2My0yOWE4NGUzNWRjZTUifQ.77umEw-r9el980AXLceGG7pSK3pigip8MStD2bBhTAc",
  "access_expires_at": "2026-10-30T21:09:32.723096696Z",
  "refresh_token": "cGk-qTcI1qtPfChM3I97grLAhLDgIUuGitjR-ZUua-M",
  "refresh_expires_at": "2026-11-29T20:54:32.722684361Z",
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
  "command_id": "0f540564-c15f-4f3c-b51d-35bcb5c91952",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:33Z",
    "sequence": 1793393673158
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:33.175187Z",
  "last_location_at": "2026-10-30T20:54:33.175187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27654"
}
```

```json
{
  "challenge_id": "ab3b423a-06d8-4b96-ab6c-98150429a2c8",
  "expires_at": "2026-10-30T20:59:33.383635487Z",
  "resend_available_at": "2026-10-30T20:54:34.383635487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "233188",
  "sent_at": "2026-10-30T20:54:33.385610764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab3b423a-06d8-4b96-ab6c-98150429a2c8",
  "code": "233188",
  "device_ref": "sandbox-27654"
}
```

```json
{
  "session_id": "34069f4b-4f6b-40c6-87bc-d1289bc73977",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDU3MywiaWF0IjoxNzkzMzkzNjczLCJqdGkiOiI2ZDUzMzgzMC05Yzg3LTQ1NDItYjk5Zi01ZmIzYmQyNzliOTkiLCJzaWQiOiIzNDA2OWY0Yi00ZjZiLTQwYzYtODdiYy1kMTI4OWJjNzM5NzcifQ.nSojlEqZ-JmMlqwZHPhSLEnPFwe0qkhvt0vvSf8BhNM",
  "access_expires_at": "2026-10-30T21:09:33.613653251Z",
  "refresh_token": "BA1POdBAEeusDjpL8p5PPGqVEES-Fi3cLVuRwbFmIDQ",
  "refresh_expires_at": "2026-11-29T20:54:33.613080292Z",
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
  "command_id": "9d850594-f5bc-4d0a-8e88-9cba44fe1b6f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:34Z",
    "sequence": 1793393674353
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "22705317-b3a6-4e6a-a989-979e100c84cd",
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
  "last_heartbeat_at": "2026-10-30T20:54:34.051774Z",
  "last_location_at": "2026-10-30T20:54:34.051774Z",
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
  "session_id": "93a186f9-bd7a-48ca-811b-cc1e7a900182",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ1NzQsImlhdCI6MTc5MzM5MzY3NCwianRpIjoiMTg3OTJhZTQtNDk2Yi00MjcwLTg3YWItYjU3ODVmNzRjZTU3Iiwic2lkIjoiOTNhMTg2ZjktYmQ3YS00OGNhLTgxMWItY2MxZTdhOTAwMTgyIn0.SSroyJQv1a6kNi6C3QPiCeAAathhg3rqTarGVKXBmH4",
  "access_expires_at": "2026-10-30T21:09:34.477611431Z",
  "refresh_token": "DLAeBuBqO4YONpckFDl2CjhSUvHxXPR_ytP4hr6bHt0",
  "refresh_expires_at": "2026-10-31T08:54:34.477188955Z",
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
  "session_id": "1c1e2c55-6209-4fca-9b88-fb8dfa89bb9a",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ1NzQsImlhdCI6MTc5MzM5MzY3NCwianRpIjoiY2YwYjM3MWQtODgzOC00YmZjLWJkODctODRlMGI3Y2IyOTY1Iiwic2lkIjoiMWMxZTJjNTUtNjIwOS00ZmNhLTliODgtZmI4ZGZhODliYjlhIn0.5uWzWlfKRQ_UBR7B6uXjQBK9GdrNaXhkBjcuTlTIfmc",
  "access_expires_at": "2026-10-30T21:09:34.897676488Z",
  "refresh_token": "sTLZP4SwdI4MjqUCKiX7FjeO-G6xe-V7emyA1gykM-E",
  "refresh_expires_at": "2026-10-31T08:54:34.897232084Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680345137",
  "device_ref": "sandbox-5966"
}
```

```json
{
  "challenge_id": "d1495c14-3894-4100-961a-0d7f1263d358",
  "expires_at": "2026-10-30T20:59:35.098792333Z",
  "resend_available_at": "2026-10-30T20:54:36.098792333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680345137` → **200**

```json
{
  "phone": "+380680345137",
  "audience": "CLIENT",
  "code": "967014",
  "sent_at": "2026-10-30T20:54:35.100937815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1495c14-3894-4100-961a-0d7f1263d358",
  "code": "967014",
  "device_ref": "sandbox-5966"
}
```

```json
{
  "session_id": "098e7757-a842-484a-a92a-44ad19d44801",
  "subject": {
    "type": "CLIENT",
    "id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2Y2NmZkYy1iZjI0LTRmOGQtYTAwOC1kNDM1MmExZmZhZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0NTc1LCJpYXQiOjE3OTMzOTM2NzUsImp0aSI6IjBiNDZhNzcxLTY2ZGItNDViOS04N2RjLTVjMDhkYmIyYzMzMSIsInNpZCI6IjA5OGU3NzU3LWE4NDItNDg0YS1hOTJhLTQ0YWQxOWQ0NDgwMSJ9.DYOeEQWpZChlzzQnXIMAL71iK4-3Km_cUHW3lATyjDM",
  "access_expires_at": "2026-10-30T21:09:35.323679637Z",
  "refresh_token": "QDAdOCB9m0Nq3Sxe-WTcHQnpTOFAtuQCxkvMr0qO6mw",
  "refresh_expires_at": "2026-11-29T20:54:35.323311038Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc3994c9-9ead-4b1d-ad45-482306917de5",
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
  "id": "e4fc9efa-4679-4584-b087-6b603b2e48d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:35.532902Z",
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
  "command_id": "df175378-a566-4284-a643-55d443a3b0a9",
  "quote_id": "e4fc9efa-4679-4584-b087-6b603b2e48d4",
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
  "id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:35.745366Z",
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
    "id": "28b85cc8-c4e7-457b-a40c-54504a350640",
    "order_id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
    "expires_at": "2026-10-30T20:54:50.747623Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:33.175187Z",
  "last_location_at": "2026-10-30T20:54:33.175187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/pause` → **200**

```json
{
  "command_id": "c2500c0a-f282-4c5d-aba8-e78ae32e1f11",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:33.175187Z",
  "last_location_at": "2026-10-30T20:54:33.175187Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/28b85cc8-c4e7-457b-a40c-54504a350640/accept` → **409**

```json
{
  "command_id": "73cac341-370b-4315-b3a0-e8511809e58d"
}
```

```json
{
  "instance": "/api/driver/v1/offers/28b85cc8-c4e7-457b-a40c-54504a350640/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "768a48e5-b2b6-48ad-81d9-2d4db2c65d60"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "02196408-9ccb-4281-837d-c6e7cc5033e0",
    "order_id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
    "expires_at": "2026-10-30T20:54:51.372476Z",
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

`POST /api/driver/v1/offers/02196408-9ccb-4281-837d-c6e7cc5033e0/reject` → **204**

```json
{
  "command_id": "4d7a21ae-ed6f-4ffb-a050-1165feebc991"
}
```

`GET /api/operator/v1/orders/2e77c3c2-9518-41fb-a317-71559cce6c3f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T20:54:35.745734Z",
      "actor": {
        "type": "CLIENT",
        "id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
        "quote_id": "e4fc9efa-4679-4584-b087-6b603b2e48d4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "089c2f0e-fb76-4918-b32a-5d330e4d70bb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T20:54:35.747151Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
        "attempt_id": "5526d210-0f87-43f3-9857-dd5ad479a6fc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "089c2f0e-fb76-4918-b32a-5d330e4d70bb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T20:54:35.7495Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "28b85cc8-c4e7-457b-a40c-54504a350640",
        "order_id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "089c2f0e-fb76-4918-b32a-5d330e4d70bb"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T20:54:36.371829Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "28b85cc8-c4e7-457b-a40c-54504a350640",
        "order_id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "c1218203-53f2-4114-9eb3-504a4db41bef"
    },
```

`GET /api/operator/v1/orders/2e77c3c2-9518-41fb-a317-71559cce6c3f` → **200**

```json
{
  "id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:35.745366Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2e77c3c2-9518-41fb-a317-71559cce6c3f/cancel` → **200**

```json
{
  "command_id": "d37bedb5-cb17-41bb-8f55-a390a685f3bc",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2e77c3c2-9518-41fb-a317-71559cce6c3f",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:35.745366Z",
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

E2: offer 28b85cc8-c4e7-457b-a40c-54504a350640 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "22705317-b3a6-4e6a-a989-979e100c84cd",
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
  "last_heartbeat_at": "2026-10-30T20:54:34.051774Z",
  "last_location_at": "2026-10-30T20:54:34.051774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22705317-b3a6-4e6a-a989-979e100c84cd/close` → **200**

```json
{
  "command_id": "351695f2-af89-4cb5-a9c4-11f4ca0b38e5",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:33.175187Z",
  "last_location_at": "2026-10-30T20:54:33.175187Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/resume` → **200**

```json
{
  "command_id": "efe4de82-53d2-44cb-bc37-9c13e48c3261",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:33.175187Z",
  "last_location_at": "2026-10-30T20:54:33.175187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:38Z",
    "sequence": 1793393678539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:38.555677Z",
  "last_location_at": "2026-10-30T20:54:38.555677Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76026714-a1fb-4338-8699-eb0d493fdf90",
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
  "id": "94c02916-113c-4901-a87c-7d307cdefef1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:38.775894Z",
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
  "command_id": "dfbba8e3-0372-41fb-bae5-2f65c558f1e0",
  "quote_id": "94c02916-113c-4901-a87c-7d307cdefef1",
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
  "id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:38.990979Z",
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
    "id": "55b76d36-904a-43c5-8482-fc4c5b9e4890",
    "order_id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
    "expires_at": "2026-10-30T20:54:53.993158Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:38.555677Z",
  "last_location_at": "2026-10-30T20:54:38.555677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/55b76d36-904a-43c5-8482-fc4c5b9e4890/accept` → **200**

```json
{
  "id": "a3f8f03d-dd6f-4b89-9191-a60b542ed98b",
  "order_id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c5dc4892-d558-478f-8073-b1fe8e381141",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:38.555677Z",
  "last_location_at": "2026-10-30T20:54:38.555677Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 1: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/9794d3af-0e26-41c2-8d76-8807f47ee205` → **200**

```json
{
  "id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a3f8f03d-dd6f-4b89-9191-a60b542ed98b",
    "order_id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c5dc4892-d558-478f-8073-b1fe8e381141",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:54:38.990979Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9794d3af-0e26-41c2-8d76-8807f47ee205` → **200**

```json
{
  "id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a3f8f03d-dd6f-4b89-9191-a60b542ed98b",
    "order_id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c5dc4892-d558-478f-8073-b1fe8e381141",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:54:38.990979Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9794d3af-0e26-41c2-8d76-8807f47ee205/cancel` → **200**

```json
{
  "command_id": "221f6359-14e9-4ed5-93ea-b056ea0cde93",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a3f8f03d-dd6f-4b89-9191-a60b542ed98b",
    "order_id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c5dc4892-d558-478f-8073-b1fe8e381141",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T20:54:38.990979Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:38.555677Z",
  "last_location_at": "2026-10-30T20:54:38.555677Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/resume` → **200**

```json
{
  "command_id": "9fbf1574-4d31-4c46-9895-57c5be9cb390",
  "expected_version": 4
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:38.555677Z",
  "last_location_at": "2026-10-30T20:54:38.555677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:40Z",
    "sequence": 1793393680734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:40.753232Z",
  "last_location_at": "2026-10-30T20:54:40.753232Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3bbe989-1b85-4a89-8c38-40e434a9144b",
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
  "id": "ac1458c2-2911-4e6b-9d8a-552cb3ce599b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:40.965396Z",
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
  "command_id": "047a1215-1ff8-4663-b6f6-1fe6f6d39944",
  "quote_id": "ac1458c2-2911-4e6b-9d8a-552cb3ce599b",
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
  "id": "45e9dc08-51e5-4866-a635-0f589771dccc",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:41.184232Z",
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
    "id": "1add5c5e-3052-4559-afa6-bb4cda81455e",
    "order_id": "45e9dc08-51e5-4866-a635-0f589771dccc",
    "expires_at": "2026-10-30T20:54:56.186395Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:40.753232Z",
  "last_location_at": "2026-10-30T20:54:40.753232Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/1add5c5e-3052-4559-afa6-bb4cda81455e/accept` → **200**

```json
{
  "id": "bdc3f444-a349-42db-a02a-3b6c14b30eb7",
  "order_id": "45e9dc08-51e5-4866-a635-0f589771dccc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93e9fe53-d4d6-4cc3-ba7e-fc6f4426bc4c",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:40.753232Z",
  "last_location_at": "2026-10-30T20:54:40.753232Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/45e9dc08-51e5-4866-a635-0f589771dccc` → **200**

```json
{
  "id": "45e9dc08-51e5-4866-a635-0f589771dccc",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "bdc3f444-a349-42db-a02a-3b6c14b30eb7",
    "order_id": "45e9dc08-51e5-4866-a635-0f589771dccc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "93e9fe53-d4d6-4cc3-ba7e-fc6f4426bc4c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:54:41.184232Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/45e9dc08-51e5-4866-a635-0f589771dccc` → **200**

```json
{
  "id": "45e9dc08-51e5-4866-a635-0f589771dccc",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "bdc3f444-a349-42db-a02a-3b6c14b30eb7",
    "order_id": "45e9dc08-51e5-4866-a635-0f589771dccc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "93e9fe53-d4d6-4cc3-ba7e-fc6f4426bc4c",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:54:41.184232Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/45e9dc08-51e5-4866-a635-0f589771dccc/cancel` → **200**

```json
{
  "command_id": "651e50fa-951f-4a60-b8c2-09ab684a74d2",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "45e9dc08-51e5-4866-a635-0f589771dccc",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "bdc3f444-a349-42db-a02a-3b6c14b30eb7",
    "order_id": "45e9dc08-51e5-4866-a635-0f589771dccc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "93e9fe53-d4d6-4cc3-ba7e-fc6f4426bc4c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T20:54:41.184232Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:40.753232Z",
  "last_location_at": "2026-10-30T20:54:40.753232Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/resume` → **200**

```json
{
  "command_id": "6aef2783-e292-43e8-b9b8-2b5bb90781ed",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:40.753232Z",
  "last_location_at": "2026-10-30T20:54:40.753232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:42Z",
    "sequence": 1793393682949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:42.966461Z",
  "last_location_at": "2026-10-30T20:54:42.966461Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e0eb87c-34ac-4dae-a9c0-03b5f2b95fb1",
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
  "id": "5635d732-7a24-418b-b72d-6cf94bc68352",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:43.176668Z",
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
  "command_id": "f84fcb04-0184-4da4-9217-7d11163f5004",
  "quote_id": "5635d732-7a24-418b-b72d-6cf94bc68352",
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
  "id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:43.38896Z",
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
    "id": "7896e89a-09ca-4192-b3eb-e4705f06d305",
    "order_id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
    "expires_at": "2026-10-30T20:54:58.391677Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:42.966461Z",
  "last_location_at": "2026-10-30T20:54:42.966461Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/7896e89a-09ca-4192-b3eb-e4705f06d305/accept` → **200**

```json
{
  "id": "67dfaea3-3718-4c0c-8b3c-7cfb8f493f1d",
  "order_id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a65769b-404a-4467-873a-efdc8ebdbcba",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:42.966461Z",
  "last_location_at": "2026-10-30T20:54:42.966461Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/3b131904-c9ab-4b2c-bbf2-49c500873198` → **200**

```json
{
  "id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "67dfaea3-3718-4c0c-8b3c-7cfb8f493f1d",
    "order_id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9a65769b-404a-4467-873a-efdc8ebdbcba",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:54:43.38896Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3b131904-c9ab-4b2c-bbf2-49c500873198` → **200**

```json
{
  "id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "67dfaea3-3718-4c0c-8b3c-7cfb8f493f1d",
    "order_id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9a65769b-404a-4467-873a-efdc8ebdbcba",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:54:43.38896Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3b131904-c9ab-4b2c-bbf2-49c500873198/cancel` → **200**

```json
{
  "command_id": "067dd7e2-f5c2-41a0-bd9e-aa9fcf896298",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "67dfaea3-3718-4c0c-8b3c-7cfb8f493f1d",
    "order_id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9a65769b-404a-4467-873a-efdc8ebdbcba",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T20:54:43.38896Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:42.966461Z",
  "last_location_at": "2026-10-30T20:54:42.966461Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/resume` → **200**

```json
{
  "command_id": "e876e21a-a1a9-4e4a-a151-cb205d31854e",
  "expected_version": 10
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:42.966461Z",
  "last_location_at": "2026-10-30T20:54:42.966461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:45Z",
    "sequence": 1793393685143
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:45.161239Z",
  "last_location_at": "2026-10-30T20:54:45.161239Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d854c6f8-fdc3-4964-8793-eaebbe5a5634",
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
  "id": "c415ca2c-08ff-432d-a6f8-b2868069600a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:45.399149Z",
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
  "command_id": "2f1bb0f6-b219-4f19-96ec-7e4798b339fa",
  "quote_id": "c415ca2c-08ff-432d-a6f8-b2868069600a",
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
  "id": "d257600c-e08d-4a8c-8402-7b90ca2b9caf",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:45.63573Z",
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
    "id": "bdd352af-cd3c-492c-b3a5-3a4883532ce0",
    "order_id": "d257600c-e08d-4a8c-8402-7b90ca2b9caf",
    "expires_at": "2026-10-30T20:55:00.638241Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:45.161239Z",
  "last_location_at": "2026-10-30T20:54:45.161239Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/bdd352af-cd3c-492c-b3a5-3a4883532ce0/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/bdd352af-cd3c-492c-b3a5-3a4883532ce0/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "9081b6f6-3374-46aa-936c-75c289555ffd"
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:45.161239Z",
  "last_location_at": "2026-10-30T20:54:45.161239Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/d257600c-e08d-4a8c-8402-7b90ca2b9caf` → **200**

```json
{
  "id": "d257600c-e08d-4a8c-8402-7b90ca2b9caf",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:45.63573Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d257600c-e08d-4a8c-8402-7b90ca2b9caf` → **200**

```json
{
  "id": "d257600c-e08d-4a8c-8402-7b90ca2b9caf",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:45.63573Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d257600c-e08d-4a8c-8402-7b90ca2b9caf/cancel` → **200**

```json
{
  "command_id": "3812a680-186b-4b07-a978-729478674573",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d257600c-e08d-4a8c-8402-7b90ca2b9caf",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:45.63573Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:45.161239Z",
  "last_location_at": "2026-10-30T20:54:45.161239Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/resume` → **200**

```json
{
  "command_id": "af297d9b-961d-4252-95cf-740389e66d8b",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:45.161239Z",
  "last_location_at": "2026-10-30T20:54:45.161239Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:47Z",
    "sequence": 1793393687391
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:47.408795Z",
  "last_location_at": "2026-10-30T20:54:47.408795Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "acb1380f-a49e-464f-9a26-00b272f22d23",
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
  "id": "9e3ff6b1-6f75-4787-8d49-c2b3ff4aff29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:47.624153Z",
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
  "command_id": "b005f54d-0bd9-40cf-8659-aefce5a41189",
  "quote_id": "9e3ff6b1-6f75-4787-8d49-c2b3ff4aff29",
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
  "id": "224d2e85-618e-4569-ab76-cba76b905333",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:47.843104Z",
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
    "id": "6f02b055-610b-4073-9326-310384d07ea1",
    "order_id": "224d2e85-618e-4569-ab76-cba76b905333",
    "expires_at": "2026-10-30T20:55:02.845681Z",
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
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:47.408795Z",
  "last_location_at": "2026-10-30T20:54:47.408795Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/6f02b055-610b-4073-9326-310384d07ea1/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/6f02b055-610b-4073-9326-310384d07ea1/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "302cc3f3-db6b-4c28-8eb3-bd6815316968"
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:47.408795Z",
  "last_location_at": "2026-10-30T20:54:47.408795Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 5: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/224d2e85-618e-4569-ab76-cba76b905333` → **200**

```json
{
  "id": "224d2e85-618e-4569-ab76-cba76b905333",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:47.843104Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/224d2e85-618e-4569-ab76-cba76b905333` → **200**

```json
{
  "id": "224d2e85-618e-4569-ab76-cba76b905333",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:47.843104Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/224d2e85-618e-4569-ab76-cba76b905333/cancel` → **200**

```json
{
  "command_id": "20725f87-edc3-4534-8f56-95acdae6f7c9",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "224d2e85-618e-4569-ab76-cba76b905333",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "83f66fdc-bf24-4f8d-a008-d4352a1ffadd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:47.843104Z",
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

E5: 3 rounds won by the accept, 2 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:47.408795Z",
  "last_location_at": "2026-10-30T20:54:47.408795Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/resume` → **200**

```json
{
  "command_id": "0c5ea760-bb34-4896-9838-81ceb2ef0b2d",
  "expected_version": 14
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:47.408795Z",
  "last_location_at": "2026-10-30T20:54:47.408795Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T20:54:49Z",
    "sequence": 1793393689617
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:49.634912Z",
  "last_location_at": "2026-10-30T20:54:49.634912Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:49Z",
    "sequence": 1793393689840
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:49.857317Z",
  "last_location_at": "2026-10-30T20:54:49.857317Z",
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
  "at": "2026-10-30T20:54:50.061245216Z",
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
      "last_location_at": "2026-10-30T20:54:49.857317Z",
      "last_heartbeat_at": "2026-10-30T20:54:49.857317Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (3/2), E4 and last_heartbeat_at 2026-10-30T20:54:49.857317Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51cb9593-219c-4540-9fd5-47969038d530",
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
  "last_heartbeat_at": "2026-10-30T20:54:49.857317Z",
  "last_location_at": "2026-10-30T20:54:49.857317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51cb9593-219c-4540-9fd5-47969038d530/close` → **200**

```json
{
  "command_id": "25121766-6b57-4b00-9c8c-9b858aa93376",
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
  "session_id": "6d033607-3c52-48d8-a0c4-3222c4293063",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ1OTEsImlhdCI6MTc5MzM5MzY5MSwianRpIjoiNWU5NmFkYjYtYTc5Mi00NmZhLWEyMzYtNzMwMmYxOTU0MjE4Iiwic2lkIjoiNmQwMzM2MDctM2M1Mi00OGQ4LWEwYzQtMzIyMmM0MjkzMDYzIn0.rvLbaUIDAuQLabPXr2DaL0UjlCAHoxN3E-emlyK1dH0",
  "access_expires_at": "2026-10-30T21:09:51.113546173Z",
  "refresh_token": "kHBb633XIOYIjltBPiBhfvTHO-kPQSjyVGXlNvoMhRE",
  "refresh_expires_at": "2026-10-31T08:54:51.11312388Z",
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
  "command_id": "b1594a2c-b16d-4e6e-8070-a849df311017",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T20:54:51.538255Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "850ad70a-3543-4f30-896d-c18be86ceeda",
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
  "correlation_id": "f6f10f5e-a6c7-4d58-9724-a98a96e2aee9",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "d6e42a9d-5b86-4393-a05d-1c9d7604a7aa",
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
  "correlation_id": "e059fb62-eb06-4d69-aa94-3d2e483b91df"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636213573",
  "device_ref": "sandbox-4826"
}
```

```json
{
  "challenge_id": "f134f9ab-8326-46bb-a590-37b066eafd72",
  "expires_at": "2026-10-30T20:59:52.184100327Z",
  "resend_available_at": "2026-10-30T20:54:53.184100327Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636213573` → **200**

```json
{
  "phone": "+380636213573",
  "audience": "CLIENT",
  "code": "403746",
  "sent_at": "2026-10-30T20:54:52.18601838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f134f9ab-8326-46bb-a590-37b066eafd72",
  "code": "403746",
  "device_ref": "sandbox-4826"
}
```

```json
{
  "session_id": "40261a21-1979-4399-a738-320c64efc718",
  "subject": {
    "type": "CLIENT",
    "id": "452ad18d-e6f6-44d6-8bcc-541df8fa5798"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTJhZDE4ZC1lNmY2LTQ0ZDYtOGJjYy01NDFkZjhmYTU3OTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0NTkyLCJpYXQiOjE3OTMzOTM2OTIsImp0aSI6IjhkYWNlYzE0LWI4ZDEtNGUzYy04MjdjLWNkYmU1ODllODUxYSIsInNpZCI6IjQwMjYxYTIxLTE5NzktNDM5OS1hNzM4LTMyMGM2NGVmYzcxOCJ9.Dgry1S8e3WFLNIVWaSU_pL9LyvSKYNwXNprIb42dRtg",
  "access_expires_at": "2026-10-30T21:09:52.415742234Z",
  "refresh_token": "JMNl4ObucCtxV-C7ZCvvcpFwKNKDoht5iU0YzrGireA",
  "refresh_expires_at": "2026-11-29T20:54:52.41533376Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba20ec56-41d5-467b-ab3a-d79f895d591b",
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
  "id": "f59064f9-177b-45d1-a822-ea2d281edce7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:52.625617Z",
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
  "command_id": "26bab567-0ba6-4b05-b494-e652ed59b8ed",
  "quote_id": "f59064f9-177b-45d1-a822-ea2d281edce7",
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
  "correlation_id": "21c5aa97-c294-4925-8e16-1c01dd2d158f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0f1663b4-d7ae-49a7-8132-1319d435bd39",
  "quote_id": "f59064f9-177b-45d1-a822-ea2d281edce7",
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
  "id": "05b39054-5e62-4048-ac02-c155ac5101da",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "452ad18d-e6f6-44d6-8bcc-541df8fa5798",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:54:53.063767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/05b39054-5e62-4048-ac02-c155ac5101da/cancel` → **200**

```json
{
  "command_id": "c4131317-1f3d-4b11-bc84-f9f06c766499",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "05b39054-5e62-4048-ac02-c155ac5101da",
  "short_number": 22,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "452ad18d-e6f6-44d6-8bcc-541df8fa5798",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:54:53.063767Z",
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
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "62ebb289-26cd-4ee3-b4eb-530c71aa9b59",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T20:54:53.522195Z"
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
      "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T20:54:53.522195Z"
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
  "device_ref": "sandbox-10116"
}
```

```json
{
  "challenge_id": "992f8de3-a199-4938-9ef2-2c8b98a533ea",
  "expires_at": "2026-10-30T20:59:54.180458241Z",
  "resend_available_at": "2026-10-30T20:54:55.180458241Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "623740",
  "sent_at": "2026-10-30T20:54:54.182322446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "992f8de3-a199-4938-9ef2-2c8b98a533ea",
  "code": "623740",
  "device_ref": "sandbox-10116"
}
```

```json
{
  "session_id": "15c819d6-a232-4121-9f91-d7b66a2a2242",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDU5NCwiaWF0IjoxNzkzMzkzNjk0LCJqdGkiOiJlZTI5ZTNlOS05M2VmLTRjNWYtYTUyOS03ZTU1MWMyMDUyOTQiLCJzaWQiOiIxNWM4MTlkNi1hMjMyLTQxMjEtOWY5MS1kN2I2NmEyYTIyNDIifQ.2Erz7xcuU2jjCL66RrWAeWyUPM7LfQlnwBIZFemj9JM",
  "access_expires_at": "2026-10-30T21:09:54.411100044Z",
  "refresh_token": "SD6S_Ig9oWsJVv217t0M3JZMZO27DDVMyeqOQqWT9-s",
  "refresh_expires_at": "2026-11-29T20:54:54.41047488Z",
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
  "command_id": "adca9464-babf-45aa-ad29-166cfc912e57",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:54Z",
    "sequence": 1793393694828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:54:54.845149Z",
  "last_location_at": "2026-10-30T20:54:54.845149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677068604",
  "device_ref": "sandbox-3528"
}
```

```json
{
  "challenge_id": "f6f84a73-5428-4cc4-8a5d-9306317bee31",
  "expires_at": "2026-10-30T20:59:55.055050552Z",
  "resend_available_at": "2026-10-30T20:54:56.055050552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677068604` → **200**

```json
{
  "phone": "+380677068604",
  "audience": "CLIENT",
  "code": "131247",
  "sent_at": "2026-10-30T20:54:55.056921427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6f84a73-5428-4cc4-8a5d-9306317bee31",
  "code": "131247",
  "device_ref": "sandbox-3528"
}
```

```json
{
  "session_id": "a1365882-b34e-4735-904e-a7bc0525934f",
  "subject": {
    "type": "CLIENT",
    "id": "1f84a1ad-c814-4b83-a783-2040b3e616c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjg0YTFhZC1jODE0LTRiODMtYTc4My0yMDQwYjNlNjE2YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0NTk1LCJpYXQiOjE3OTMzOTM2OTUsImp0aSI6ImY0NjhlYWNiLTU5ZGQtNDBlYy1iMGZjLTlhYTkxZGU5N2U4MCIsInNpZCI6ImExMzY1ODgyLWIzNGUtNDczNS05MDRlLWE3YmMwNTI1OTM0ZiJ9.OK0Fp8zpKzOT4yBd4jEuAi4xiP1TyFuA6jxNWuiQAzE",
  "access_expires_at": "2026-10-30T21:09:55.287890784Z",
  "refresh_token": "7X_oLmAG_j1hKieMmUJnTZkkNghqlD6mI9wT4XRidt0",
  "refresh_expires_at": "2026-11-29T20:54:55.287493233Z",
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
  "command_id": "01da7546-91c9-4fbb-bd0b-6da4d4958e98",
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
  "id": "3f18acb8-ab76-4422-b2cf-53fdcb3daad1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T20:59:55.694371Z",
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
  "command_id": "43ed7c02-26f2-437f-b6c0-e450400c25c2",
  "platform": "ANDROID",
  "token": "sandbox-driver-3b9a7128-c995-49d4-be1b-688639a1e3ad"
}
```

```json
{
  "id": "5e6f8965-211e-49db-80f6-510a8688548e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T20:54:55.917773Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "cbd85e00-2dbc-4bbd-a719-0312a2d6da7c",
  "platform": "ANDROID",
  "token": "sandbox-rider-e60ab411-645f-4c65-bf7f-044b2e55a05b"
}
```

```json
{
  "id": "63230a86-5bb5-4045-9865-0ac1ac75a499",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T20:54:56.12213Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f1452ec6-ddc4-4468-aa05-22a402e4a874",
  "quote_id": "3f18acb8-ab76-4422-b2cf-53fdcb3daad1",
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
  "id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f84a1ad-c814-4b83-a783-2040b3e616c6",
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
  "created_at": "2026-10-30T20:54:56.331975Z",
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
    "id": "1c1f05c7-dc3f-4baf-86ca-ef0c92ff4cb5",
    "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
    "expires_at": "2026-10-30T20:55:11.334154Z",
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

`POST /api/driver/v1/offers/1c1f05c7-dc3f-4baf-86ca-ef0c92ff4cb5/accept` → **200**

```json
{
  "command_id": "c93149bb-61a1-4eae-952c-f117609821f7"
}
```

```json
{
  "id": "70053182-5ab7-42e4-96ff-209f410fca6f",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T20:54:56.312Z` → **200**

```json
[
  {
    "at": "2026-10-30T20:54:56.749898826Z",
    "token_suffix": "a1e3ad",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "ae3da2ae-b663-4735-abac-e51bc4058382",
      "order_version": "2",
      "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677068604&after=2026-10-30T20:54:56.312Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677068604&after=2026-10-30T20:54:56.312Z` → **200**

```json
[
  {
    "at": "2026-10-30T20:54:57.753900296Z",
    "token_suffix": "55a05b",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "222cfada-6e47-457d-9d8f-29323a27c05e",
      "order_version": "3",
      "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a855fae5-29b7-47d9-aab0-f0fd49eadf90/messages` → **201**

```json
{
  "command_id": "68953cde-a7e7-4972-9f12-db8a82c1c24c",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "68d6a6c2-9fcb-4989-b846-3ddd78b97031",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T20:54:58.042949968Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "assignment_id": "70053182-5ab7-42e4-96ff-209f410fca6f",
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

`POST /api/driver/v1/trips/4d78fbb2-50b8-4eff-8fd4-bb6904ca98da/messages` → **201**

```json
{
  "command_id": "76c46086-4c2d-4b6c-ac5f-1166d603ad51",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "71b42d59-2e3f-4a7b-b791-f1f3ed952ef3",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T20:54:58.481261396Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a855fae5-29b7-47d9-aab0-f0fd49eadf90/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/4d78fbb2-50b8-4eff-8fd4-bb6904ca98da/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677068604"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/4a07863e-728f-4f77-9088-9e1e5af9b368/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:54:59Z",
    "sequence": 1793393699107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:54:59.123291Z",
  "last_location_at": "2026-10-30T20:54:59.123291Z",
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
  "id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "assignment_id": "70053182-5ab7-42e4-96ff-209f410fca6f",
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

`POST /api/driver/v1/trips/4d78fbb2-50b8-4eff-8fd4-bb6904ca98da/arrive` → **200**

```json
{
  "command_id": "6ab1c479-dd72-4a51-b8fe-71096076d81c",
  "expected_version": 0
}
```

```json
{
  "id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "assignment_id": "70053182-5ab7-42e4-96ff-209f410fca6f",
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
  "arrived_at": "2026-10-30T20:54:59.519118Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d78fbb2-50b8-4eff-8fd4-bb6904ca98da/start` → **200**

```json
{
  "command_id": "ca40b080-e47e-4fa6-b884-207f2ce3cc9f",
  "expected_version": 1
}
```

```json
{
  "id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "assignment_id": "70053182-5ab7-42e4-96ff-209f410fca6f",
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
  "arrived_at": "2026-10-30T20:54:59.519118Z",
  "started_at": "2026-10-30T20:54:59.727839Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 49 s to the next point)

`POST /api/driver/v1/work-sessions/4a07863e-728f-4f77-9088-9e1e5af9b368/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:55:48Z",
    "sequence": 1793393748956
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:55:48.972872Z",
  "last_location_at": "2026-10-30T20:55:48.972872Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/4d78fbb2-50b8-4eff-8fd4-bb6904ca98da/complete` → **200**

```json
{
  "command_id": "19fb287e-1fce-443b-a4df-6afc38a54fad",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:55:49Z",
  "cash_received": true
}
```

```json
{
  "id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "assignment_id": "70053182-5ab7-42e4-96ff-209f410fca6f",
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
  "arrived_at": "2026-10-30T20:54:59.519118Z",
  "started_at": "2026-10-30T20:54:59.727839Z",
  "completed_at": "2026-10-30T20:55:49.198839Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a855fae5-29b7-47d9-aab0-f0fd49eadf90` → **200**

```json
{
  "id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "short_number": 23,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1f84a1ad-c814-4b83-a783-2040b3e616c6",
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
    "id": "70053182-5ab7-42e4-96ff-209f410fca6f",
    "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T20:54:56.331975Z",
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
      "id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
      "short_number": 23,
      "status": "FULFILLED",
      "created_at": "2026-10-30T20:54:56.331975Z",
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
      "id": "4d78fbb2-50b8-4eff-8fd4-bb6904ca98da",
      "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
      "order_short_number": 23,
      "created_at": "2026-10-30T20:54:56.764504Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "9a65769b-404a-4467-873a-efdc8ebdbcba",
      "order_id": "3b131904-c9ab-4b2c-bbf2-49c500873198",
      "order_short_number": 19,
      "created_at": "2026-10-30T20:54:44.029471Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "93e9fe53-d4d6-4cc3-ba7e-fc6f4426bc4c",
      "order_id": "45e9dc08-51e5-4866-a635-0f589771dccc",
      "order_short_number": 18,
      "created_at": "2026-10-30T20:54:41.808683Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "c5dc4892-d558-478f-8073-b1fe8e381141",
      "order_id": "9794d3af-0e26-41c2-8d76-8807f47ee205",
      "order_short_number": 17,
      "created_at": "2026-10-30T20:54:39.608189Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "61e031b6-d6e1-4b12-bcf9-9df45c653a2d",
      "order_id": "a29c091d-41de-4a71-9f30-55ca810c8f43",
      "order_short_number": 10,
      "created_at": "2026-10-30T20:48:57.940915Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "691259cc-8881-417b-a3a9-23ac4a61e68d",
      "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
      "order_short_number": 5,
      "created_at": "2026-10-30T20:47:30.822774Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "a1b4b269-dbee-40d5-984f-6cb9b688dd59",
      "order_id": "64b9d3cb-fb48-4450-9ed5-37425982cbbe",
      "order_short_number": 3,
      "created_at": "2026-10-30T20:43:48.890648Z",
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

`GET /api/rider/v1/orders/a855fae5-29b7-47d9-aab0-f0fd49eadf90/tip` → **200**

```json
{
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
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
  "available_until": "2026-10-31T20:55:49.198839Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a855fae5-29b7-47d9-aab0-f0fd49eadf90/tip` → **201**

```json
{
  "command_id": "588c79cf-ebc4-47a9-92cf-3075e45cf2ac",
  "amount_minor": 1100
}
```

```json
{
  "id": "2b5599b9-dd44-40d6-95b5-baa450c681ef",
  "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T20:55:53.755736Z"
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
  "session_id": "89156372-71f0-48fb-bdc7-4ddcc7aa4c0e",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ2NTQsImlhdCI6MTc5MzM5Mzc1NCwianRpIjoiZjk5ZTA4OWMtYjAzMy00ZDhiLTljMmItZDlhMzk4ZDkwMTFlIiwic2lkIjoiODkxNTYzNzItNzFmMC00OGZiLWJkYzctNGRkY2M3YWE0YzBlIn0.aEb-YopGVTwYgsD6UZzWafUg9mXGI0BPell_RzG0h6E",
  "access_expires_at": "2026-10-30T21:10:54.190704789Z",
  "refresh_token": "T90ov5Tgl1i2abOwcnfh4PDjwqGnlfGhGfX3ebFL3hg",
  "refresh_expires_at": "2026-10-31T08:55:54.190264774Z",
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
          "APP": 21,
          "PHONE": 1
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
      "APP": 21,
      "PHONE": 1
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
  "generated_at": "2026-10-30T20:55:54.397101086Z"
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
  "generated_at": "2026-10-30T20:55:54.608817175Z"
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
  "session_id": "4be35785-c677-46b8-b06d-73b713e04ecf",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ2NTUsImlhdCI6MTc5MzM5Mzc1NSwianRpIjoiNTZlYTNjOTctNDNiOC00ZmRlLWJjYzgtOWUyMjVmMzdiYTBmIiwic2lkIjoiNGJlMzU3ODUtYzY3Ny00NmI4LWIwNmQtNzNiNzEzZTA0ZWNmIn0.SPVHW4IRHnnUBcXEXee8gfbLRPZjJFlugcZGIcu9DN4",
  "access_expires_at": "2026-10-30T21:10:55.054864959Z",
  "refresh_token": "IFs1ScNFteTyCBYtvwyQVYu9c0KKgXeV0TdrgiddUN0",
  "refresh_expires_at": "2026-10-31T08:55:55.053859471Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a855fae5-29b7-47d9-aab0-f0fd49eadf90/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T20:54:56.332344Z",
      "actor": {
        "type": "CLIENT",
        "id": "1f84a1ad-c814-4b83-a783-2040b3e616c6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
        "quote_id": "3f18acb8-ab76-4422-b2cf-53fdcb3daad1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d9bf5b26-7522-4eda-af1a-599f13e7ded1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T20:54:56.333682Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
        "attempt_id": "5e04badf-4b17-42c1-bb45-855abe38a54e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d9bf5b26-7522-4eda-af1a-599f13e7ded1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T20:54:56.336Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1c1f05c7-dc3f-4baf-86ca-ef0c92ff4cb5",
        "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "d9bf5b26-7522-4eda-af1a-599f13e7ded1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T20:54:56.765836Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1c1f05c7-dc3f-4baf-86ca-ef0c92ff4cb5",
        "order_id": "a855fae5-29b7-47d9-aab0-f0fd49eadf90",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "70053182-5ab7-42e4-96ff-209f410fca6f"
      },
      "correlation_id": "7c285bcc-17ec-458d-8379-0370e7324298"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T20:55:55.483720429Z",
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
      "last_location_at": "2026-10-30T20:55:48.972872Z",
      "last_heartbeat_at": "2026-10-30T20:55:48.972872Z",
      "order_id": null
    }
  ]
}
```

Done: order a855fae5-29b7-47d9-aab0-f0fd49eadf90.

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
  "session_id": "948e16c6-cc75-42ad-8b35-f3867b347ced",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ2NTUsImlhdCI6MTc5MzM5Mzc1NSwianRpIjoiOTU4NzU5MWUtN2E1ZC00ODcxLTgyMTktMmZlNTE3Mjg1NTVhIiwic2lkIjoiOTQ4ZTE2YzYtY2M3NS00MmFkLThiMzUtZjM4NjdiMzQ3Y2VkIn0.9GRwEO_XfZDVZBH8IE7-QQEfhZ6x0VKszpZyrNg78jI",
  "access_expires_at": "2026-10-30T21:10:55.937066518Z",
  "refresh_token": "QEXX6i0434o0Z_EU9EwBR-xd5Xk0OoRUPJex3aY2i0U",
  "refresh_expires_at": "2026-10-31T08:55:55.936687185Z",
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
  "command_id": "3bf442e6-f743-4b53-8949-c37d2213b278",
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
  "timestamp": "2026-10-30T20:55:56.000+0000",
  "channel": {
    "id": "1730052000.1148310124",
    "linkedid": "1730052000.1148310124",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675093888"
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
  "timestamp": "2026-10-30T20:55:56.000+0000",
  "channel": {
    "id": "1730052000.1148310124",
    "linkedid": "1730052000.1148310124",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675093888"
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
  "session_id": "da5d5b34-3fbe-446d-bc54-4be724a887be",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ2NTYsImlhdCI6MTc5MzM5Mzc1NiwianRpIjoiMWQ3ZWVkZjYtN2M2YS00NGY2LTkwMzktOTk5ODBiZWIwMGU3Iiwic2lkIjoiZGE1ZDViMzQtM2ZiZS00NDZkLWJjNTQtNGJlNzI0YTg4N2JlIn0.ddQ7EUyJQKmnc-Nhqoqv9g7KQGGa-AXitOHXNNY6EOM",
  "access_expires_at": "2026-10-30T21:10:56.864111752Z",
  "refresh_token": "zHU_Ifq3-6L4jbM4MepOxjcN6zjwJbWWZZ8gpY9HmNQ",
  "refresh_expires_at": "2026-10-31T08:55:56.863648472Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "9a5d9e69-f103-4e41-8aa2-d90b998c2ba4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675093888",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T20:55:56Z",
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

`POST /api/operator/v1/calls/9a5d9e69-f103-4e41-8aa2-d90b998c2ba4/answer` → **200**

```json
{
  "command_id": "ac5eb413-b72c-4175-a27f-bf730b9e13ac"
}
```

```json
{
  "id": "9a5d9e69-f103-4e41-8aa2-d90b998c2ba4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675093888",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "order_ids": [],
  "started_at": "2026-10-30T20:55:56Z",
  "answered_at": "2026-10-30T20:55:57.296899Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1148310124",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c421ae72-acfe-4cbc-b65e-81761210811c",
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
  "id": "6079612d-578d-47e0-a87b-7633d555a562",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:00:57.563086Z",
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
  "command_id": "af185218-b8b0-418c-a58a-cd11cec7eba0",
  "quote_id": "6079612d-578d-47e0-a87b-7633d555a562",
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
    "phone": "+380675093888"
  },
  "call_id": "9a5d9e69-f103-4e41-8aa2-d90b998c2ba4"
}
```

```json
{
  "id": "8578c4c9-7059-4891-9f31-05798d1d6806",
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
  "created_at": "2026-10-30T20:55:57.80813Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675093888"
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
    "id": "1730052000.1148310124",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9a5d9e69-f103-4e41-8aa2-d90b998c2ba4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675093888",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [
        "8578c4c9-7059-4891-9f31-05798d1d6806"
      ],
      "started_at": "2026-10-30T20:55:56Z",
      "answered_at": "2026-10-30T20:55:57.296899Z",
      "ended_at": "2026-10-30T20:55:58.072226Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "086ad18c-d369-4516-846f-fdd44ff38152",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671158841",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [],
      "started_at": "2026-10-30T20:47:25.116149Z",
      "answered_at": "2026-10-30T20:47:25.368167Z",
      "ended_at": "2026-10-30T20:47:25.616562Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T20:47:27.505891Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/8578c4c9-7059-4891-9f31-05798d1d6806` → **200**

```json
{
  "id": "8578c4c9-7059-4891-9f31-05798d1d6806",
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
  "created_at": "2026-10-30T20:55:57.80813Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675093888"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/8578c4c9-7059-4891-9f31-05798d1d6806` → **200**

```json
{
  "id": "8578c4c9-7059-4891-9f31-05798d1d6806",
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
  "created_at": "2026-10-30T20:55:57.80813Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675093888"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8578c4c9-7059-4891-9f31-05798d1d6806/cancel` → **200**

```json
{
  "command_id": "3d693eb4-b7ac-48cf-a7fc-ff528ce4f2a2",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8578c4c9-7059-4891-9f31-05798d1d6806",
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
  "created_at": "2026-10-30T20:55:57.80813Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675093888"
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

Done: call 9a5d9e69-f103-4e41-8aa2-d90b998c2ba4 with order 8578c4c9-7059-4891-9f31-05798d1d6806.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28799"
}
```

```json
{
  "challenge_id": "10e80a41-c30d-40a6-bd4b-6c4bf0da8a16",
  "expires_at": "2026-10-30T21:00:58.999036623Z",
  "resend_available_at": "2026-10-30T20:55:59.999036623Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "183557",
  "sent_at": "2026-10-30T20:55:59.002344797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10e80a41-c30d-40a6-bd4b-6c4bf0da8a16",
  "code": "183557",
  "device_ref": "sandbox-28799"
}
```

```json
{
  "session_id": "033bdcdf-5007-47ac-bcc7-5ec3c6f279a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDY1OSwiaWF0IjoxNzkzMzkzNzU5LCJqdGkiOiJlNzgzYWE3OC1iOWNjLTQwOTMtOTk3MS1kYmM2MjRiNjEyYWQiLCJzaWQiOiIwMzNiZGNkZi01MDA3LTQ3YWMtYmNjNy01ZWMzYzZmMjc5YTkifQ.WJKLwtyntdhy-iWmvtaohRCFPTZjPgeqdk5ZcXuta80",
  "access_expires_at": "2026-10-30T21:10:59.238881244Z",
  "refresh_token": "_aaMp32EjgF09QNw6CgUxSqs-Y9hzQmbNfAwFx8N3rU",
  "refresh_expires_at": "2026-11-29T20:55:59.238332073Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:55:48.972872Z",
  "last_location_at": "2026-10-30T20:55:48.972872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a07863e-728f-4f77-9088-9e1e5af9b368/handover` → **200**

```json
{
  "command_id": "aec13f1b-88c0-4f85-b2af-ac0bc7d0b35d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:55:48.972872Z",
  "last_location_at": "2026-10-30T20:55:48.972872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 88 s to the next point)

`POST /api/driver/v1/work-sessions/4a07863e-728f-4f77-9088-9e1e5af9b368/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:57:27Z",
    "sequence": 1793393847926
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:57:27.944526Z",
  "last_location_at": "2026-10-30T20:57:27.944526Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666155956",
  "device_ref": "sandbox-8182"
}
```

```json
{
  "challenge_id": "0c4e8be5-2704-4595-8b8e-82880b40ee61",
  "expires_at": "2026-10-30T21:02:28.150416705Z",
  "resend_available_at": "2026-10-30T20:57:29.150416705Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666155956` → **200**

```json
{
  "phone": "+380666155956",
  "audience": "CLIENT",
  "code": "192908",
  "sent_at": "2026-10-30T20:57:28.153269036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c4e8be5-2704-4595-8b8e-82880b40ee61",
  "code": "192908",
  "device_ref": "sandbox-8182"
}
```

```json
{
  "session_id": "45e9ad61-55bf-4125-a649-260434eceaa6",
  "subject": {
    "type": "CLIENT",
    "id": "4d87cc9c-6870-4969-a756-1425dfb65b1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDg3Y2M5Yy02ODcwLTQ5NjktYTc1Ni0xNDI1ZGZiNjViMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0NzQ4LCJpYXQiOjE3OTMzOTM4NDgsImp0aSI6IjM2NzFlZTY4LTNlY2EtNDdlNy04OTkxLWY0MWJlYzdlOGM4MyIsInNpZCI6IjQ1ZTlhZDYxLTU1YmYtNDEyNS1hNjQ5LTI2MDQzNGVjZWFhNiJ9.DuhKBEwY3cMrCtH6Sqg0IG61glng5Atgsf_t-c8NdkQ",
  "access_expires_at": "2026-10-30T21:12:28.385620289Z",
  "refresh_token": "qYLGiCCANax2D6zYs4o8-0aj54N6o38rAgaEmtrBmq4",
  "refresh_expires_at": "2026-11-29T20:57:28.385161459Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "12b5a5cc-67d4-413a-8d0b-d51ec3cb683d",
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
  "id": "930bf0db-6aee-44b9-9240-c6cb04a8dd01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:02:28.598682Z",
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
  "command_id": "a3a42797-031c-4460-b48f-b4bb43676d88",
  "quote_id": "930bf0db-6aee-44b9-9240-c6cb04a8dd01",
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
  "id": "0ddf1426-271d-4711-8326-e1d784072628",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d87cc9c-6870-4969-a756-1425dfb65b1e",
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
  "created_at": "2026-10-30T20:57:28.821845Z",
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
    "id": "6319952c-874c-48d6-8549-e3b3b8b59606",
    "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
    "expires_at": "2026-10-30T20:57:43.825129Z",
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

`POST /api/driver/v1/offers/6319952c-874c-48d6-8549-e3b3b8b59606/accept` → **200**

```json
{
  "command_id": "0db389ab-047e-427b-9c89-c6aac3e8d7ed"
}
```

```json
{
  "id": "d0e0844e-b1f8-46d1-ad3f-7f90c2abcc77",
  "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "91e5cc73-05d3-46a5-b3b9-1cf233cce820",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "91e5cc73-05d3-46a5-b3b9-1cf233cce820",
  "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
  "assignment_id": "d0e0844e-b1f8-46d1-ad3f-7f90c2abcc77",
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

`POST /api/driver/v1/work-sessions/4a07863e-728f-4f77-9088-9e1e5af9b368/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:57:29Z",
    "sequence": 1793393849731
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:57:29.747373Z",
  "last_location_at": "2026-10-30T20:57:29.747373Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/91e5cc73-05d3-46a5-b3b9-1cf233cce820/arrive` → **200**

```json
{
  "command_id": "37e6c05c-9b1c-4b58-8793-90c34497eb19",
  "expected_version": 0
}
```

```json
{
  "id": "91e5cc73-05d3-46a5-b3b9-1cf233cce820",
  "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
  "assignment_id": "d0e0844e-b1f8-46d1-ad3f-7f90c2abcc77",
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
  "arrived_at": "2026-10-30T20:57:29.959715Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/91e5cc73-05d3-46a5-b3b9-1cf233cce820/start` → **200**

```json
{
  "command_id": "7b57459a-276a-42f4-a756-51815166586c",
  "expected_version": 1
}
```

```json
{
  "id": "91e5cc73-05d3-46a5-b3b9-1cf233cce820",
  "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
  "assignment_id": "d0e0844e-b1f8-46d1-ad3f-7f90c2abcc77",
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
  "arrived_at": "2026-10-30T20:57:29.959715Z",
  "started_at": "2026-10-30T20:57:30.198901Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/4a07863e-728f-4f77-9088-9e1e5af9b368/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:58:29Z",
    "sequence": 1793393909439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:58:29.455707Z",
  "last_location_at": "2026-10-30T20:58:29.455707Z",
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
  "device_ref": "sandbox-7697"
}
```

```json
{
  "challenge_id": "eb0064dc-1be6-4e96-9b0b-adfcc3952315",
  "expires_at": "2026-10-30T21:03:29.705226886Z",
  "resend_available_at": "2026-10-30T20:58:30.705226886Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "173452",
  "sent_at": "2026-10-30T20:58:29.708296521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb0064dc-1be6-4e96-9b0b-adfcc3952315",
  "code": "173452",
  "device_ref": "sandbox-7697"
}
```

```json
{
  "session_id": "ba509a4c-5f38-4886-8b9a-80be04056a4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDgwOSwiaWF0IjoxNzkzMzkzOTA5LCJqdGkiOiI0ZDQzNDczNy0zNmVkLTQ0MTktYWU2NS00YTFlNGI3ODgwZDkiLCJzaWQiOiJiYTUwOWE0Yy01ZjM4LTQ4ODYtOGI5YS04MGJlMDQwNTZhNGEifQ.n9zJLpqoVUVbJmyluO1RKztQH8ofog-Z9ZWhG7zDW2U",
  "access_expires_at": "2026-10-30T21:13:29.93227985Z",
  "refresh_token": "c1DSkSDM8fM03IKl9Ij5TbkjEThyBWHJW_2djdr_OZo",
  "refresh_expires_at": "2026-11-29T20:58:29.931581731Z",
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
  "command_id": "c88afba9-babe-47ec-89dd-08853bcbe0bb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:58:30Z",
    "sequence": 1793393910382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e8636ea3-b26e-4e76-90d5-d87ca08f3170",
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
  "last_heartbeat_at": "2026-10-30T20:58:30.400995Z",
  "last_location_at": "2026-10-30T20:58:30.400995Z",
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
  "session_id": "fb904c25-ab3f-4348-aa0e-71c6c6be95f8",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ4MTAsImlhdCI6MTc5MzM5MzkxMCwianRpIjoiOTY1NTdmNjUtNzk3NS00OTUzLWE1YzYtNDk1M2ZhMTIxOTM5Iiwic2lkIjoiZmI5MDRjMjUtYWIzZi00MzQ4LWFhMGUtNzFjNmM2YmU5NWY4In0.DclpL9K4Iy9bnitrLw_UwaMUhNDaUWQoHJ4A3vyVfzo",
  "access_expires_at": "2026-10-30T21:13:30.815223935Z",
  "refresh_token": "1TNuHwevbzNMq2uuzoCB8OY6Y6zcFXb9skg5Jn-rnkI",
  "refresh_expires_at": "2026-10-31T08:58:30.814726563Z",
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
  "session_id": "7c65380a-2c9c-4814-ae91-f927378ea309",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ4MTEsImlhdCI6MTc5MzM5MzkxMSwianRpIjoiMzQwMmNjYjEtZWY4Yy00ZTg2LWExYjUtZDUwOWRlMzA0ODUyIiwic2lkIjoiN2M2NTM4MGEtMmM5Yy00ODE0LWFlOTEtZjkyNzM3OGVhMzA5In0.aWo8Jpdeax1rOg-PeKwN2P5DLPSA7G9kwl-QQxFlXW8",
  "access_expires_at": "2026-10-30T21:13:31.253213929Z",
  "refresh_token": "RC6uVae96Y0qEOpnZK9EREGPxMxApHgn2LZSb1bCVuc",
  "refresh_expires_at": "2026-10-31T08:58:31.252812355Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0ddf1426-271d-4711-8326-e1d784072628` → **200**

```json
{
  "id": "0ddf1426-271d-4711-8326-e1d784072628",
  "short_number": 25,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4d87cc9c-6870-4969-a756-1425dfb65b1e",
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
    "id": "d0e0844e-b1f8-46d1-ad3f-7f90c2abcc77",
    "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "91e5cc73-05d3-46a5-b3b9-1cf233cce820",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T20:57:28.821845Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0ddf1426-271d-4711-8326-e1d784072628/interrupt` → **200**

```json
{
  "command_id": "1addf1bf-7441-4a51-bbdf-3b7089e4fda2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "0ddf1426-271d-4711-8326-e1d784072628",
    "short_number": 25,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "4d87cc9c-6870-4969-a756-1425dfb65b1e",
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
      "id": "d0e0844e-b1f8-46d1-ad3f-7f90c2abcc77",
      "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "91e5cc73-05d3-46a5-b3b9-1cf233cce820",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T20:57:28.821845Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
    "short_number": 26,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "4d87cc9c-6870-4969-a756-1425dfb65b1e",
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
    "id": "fa04a260-2744-4fc5-aa73-b0f906cac2fd",
    "order_id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
    "expires_at": "2026-10-30T20:58:46.698109Z",
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

`POST /api/driver/v1/offers/fa04a260-2744-4fc5-aa73-b0f906cac2fd/accept` → **200**

```json
{
  "command_id": "13df530a-1f30-4ea5-b07a-218ec4edd68a"
}
```

```json
{
  "id": "49eb7d2f-fd32-4bf9-b6d1-a402920c0524",
  "order_id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2d18a82a-b998-4f23-ae7a-81b1cfd07e56",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2d18a82a-b998-4f23-ae7a-81b1cfd07e56",
  "order_id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
  "assignment_id": "49eb7d2f-fd32-4bf9-b6d1-a402920c0524",
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
  "session_id": "e8636ea3-b26e-4e76-90d5-d87ca08f3170",
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
  "last_heartbeat_at": "2026-10-30T20:58:30.400995Z",
  "last_location_at": "2026-10-30T20:58:30.400995Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/e8636ea3-b26e-4e76-90d5-d87ca08f3170/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:58:32Z",
    "sequence": 1793393912800
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e8636ea3-b26e-4e76-90d5-d87ca08f3170",
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
  "last_heartbeat_at": "2026-10-30T20:58:32.818481Z",
  "last_location_at": "2026-10-30T20:58:32.818481Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2d18a82a-b998-4f23-ae7a-81b1cfd07e56/arrive` → **200**

```json
{
  "command_id": "42a770b3-987d-424c-9e5f-8c5d617a855f",
  "expected_version": 0
}
```

```json
{
  "id": "2d18a82a-b998-4f23-ae7a-81b1cfd07e56",
  "order_id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
  "assignment_id": "49eb7d2f-fd32-4bf9-b6d1-a402920c0524",
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
  "arrived_at": "2026-10-30T20:58:33.037164Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2d18a82a-b998-4f23-ae7a-81b1cfd07e56/start` → **200**

```json
{
  "command_id": "96f26056-eafb-45e4-91f9-cba17829c474",
  "expected_version": 1
}
```

```json
{
  "id": "2d18a82a-b998-4f23-ae7a-81b1cfd07e56",
  "order_id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
  "assignment_id": "49eb7d2f-fd32-4bf9-b6d1-a402920c0524",
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
  "arrived_at": "2026-10-30T20:58:33.037164Z",
  "started_at": "2026-10-30T20:58:33.247764Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2d18a82a-b998-4f23-ae7a-81b1cfd07e56/complete` → **200**

```json
{
  "command_id": "ff4bd38e-d114-4c7c-a340-e04e37d10307",
  "expected_version": 2,
  "reported_at": "2026-10-30T20:58:33Z"
}
```

```json
{
  "id": "2d18a82a-b998-4f23-ae7a-81b1cfd07e56",
  "order_id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
  "assignment_id": "49eb7d2f-fd32-4bf9-b6d1-a402920c0524",
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
  "arrived_at": "2026-10-30T20:58:33.037164Z",
  "started_at": "2026-10-30T20:58:33.247764Z",
  "completed_at": "2026-10-30T20:58:33.461398Z",
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
      "id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
      "short_number": 26,
      "status": "FULFILLED",
      "created_at": "2026-10-30T20:58:31.6915Z",
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
      "id": "0ddf1426-271d-4711-8326-e1d784072628",
      "short_number": 25,
      "status": "CANCELLED",
      "created_at": "2026-10-30T20:57:28.821845Z",
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
          "en": "Vehicle broke down on the way",
          "uk": "Поломка автомобіля в дорозі",
          "pl": "Awaria auta w trasie"
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

`GET /api/operator/v1/orders/0ddf1426-271d-4711-8326-e1d784072628/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T20:57:28.822456Z",
      "actor": {
        "type": "CLIENT",
        "id": "4d87cc9c-6870-4969-a756-1425dfb65b1e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
        "quote_id": "930bf0db-6aee-44b9-9240-c6cb04a8dd01",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "33665045-fad8-4872-b5d4-22112ea96b44"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T20:57:28.82437Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
        "attempt_id": "4049930a-b850-4dcd-b87a-a1eadb10fede",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "33665045-fad8-4872-b5d4-22112ea96b44"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T20:57:28.844636Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6319952c-874c-48d6-8549-e3b3b8b59606",
        "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "33665045-fad8-4872-b5d4-22112ea96b44"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T20:57:29.28305Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6319952c-874c-48d6-8549-e3b3b8b59606",
        "order_id": "0ddf1426-271d-4711-8326-e1d784072628",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d0e0844e-b1f8-46d1-ad3f-7f90c2abcc77"
      },
      "correlation_id": "a9a7bebe-4067-4cb4-8c30-784d755006e3"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/bf2bb1f6-9b89-499d-a803-4a99fa44210f/tip` → **200**

```json
{
  "order_id": "bf2bb1f6-9b89-499d-a803-4a99fa44210f",
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
  "available_until": "2026-10-31T20:58:33.461398Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/bf2bb1f6-9b89-499d-a803-4a99fa44210f/tip` → **409**

```json
{
  "command_id": "93e6eb41-44c5-4bad-b0ed-d8d68e776548",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/bf2bb1f6-9b89-499d-a803-4a99fa44210f/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5aa41c95-36fd-49ba-8434-29a50650fa75"
}
```

Done: interrupted 0ddf1426-271d-4711-8326-e1d784072628, follow-up bf2bb1f6-9b89-499d-a803-4a99fa44210f.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a07863e-728f-4f77-9088-9e1e5af9b368",
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
  "last_heartbeat_at": "2026-10-30T20:58:29.455707Z",
  "last_location_at": "2026-10-30T20:58:29.455707Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a07863e-728f-4f77-9088-9e1e5af9b368/close` → **200**

```json
{
  "command_id": "a0e9d1b1-0eeb-4afd-90c6-c7da7b0003d5",
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
  "session_id": "e8636ea3-b26e-4e76-90d5-d87ca08f3170",
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
  "last_heartbeat_at": "2026-10-30T20:58:32.818481Z",
  "last_location_at": "2026-10-30T20:58:32.818481Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8636ea3-b26e-4e76-90d5-d87ca08f3170/close` → **200**

```json
{
  "command_id": "a42d954a-0300-4bdb-bb19-e3c117612d30",
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
  "session_id": "6d642bd8-e9e5-408d-bb35-e6791218b6a7",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ4MTgsImlhdCI6MTc5MzM5MzkxOCwianRpIjoiYjIwN2U3YmItZGE0OS00ODA2LWFjYmMtNWNiOTUwYmVkYWMxIiwic2lkIjoiNmQ2NDJiZDgtZTllNS00MDhkLWJiMzUtZTY3OTEyMThiNmE3In0.JKHnjuVBBKbDhJYMgZ-HGG9yS8Hg82APLulsx0UvUcQ",
  "access_expires_at": "2026-10-30T21:13:38.72774436Z",
  "refresh_token": "UBTQ4lMLhDva_E3BknXjNpks33kHheZdy-_RiqBR9WU",
  "refresh_expires_at": "2026-10-31T08:58:38.727347964Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2267830d-3d58-453f-b90b-648295f956e4",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T20:58:38Z"
}
```

```json
{
  "id": "5186b0c6-41e0-40d5-be6a-6ff38757d84a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T20:58:38Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5186b0c6-41e0-40d5-be6a-6ff38757d84a/publish` → **200**

```json
{
  "command_id": "4e469774-afac-4a9c-9706-4c1943485a03",
  "expected_version": 0
}
```

```json
{
  "id": "5186b0c6-41e0-40d5-be6a-6ff38757d84a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T20:58:39.193798Z",
  "published_at": "2026-10-30T20:58:39.193798Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "5186b0c6-41e0-40d5-be6a-6ff38757d84a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T20:58:39.193798Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638556739",
  "device_ref": "sandbox-8608"
}
```

```json
{
  "challenge_id": "88aca7e8-6868-4853-a4c0-d6c1be700b6c",
  "expires_at": "2026-10-30T21:03:39.600379254Z",
  "resend_available_at": "2026-10-30T20:58:40.600379254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638556739` → **200**

```json
{
  "phone": "+380638556739",
  "audience": "CLIENT",
  "code": "355238",
  "sent_at": "2026-10-30T20:58:39.603119108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88aca7e8-6868-4853-a4c0-d6c1be700b6c",
  "code": "355238",
  "device_ref": "sandbox-8608"
}
```

```json
{
  "session_id": "a072fe1e-3873-4158-bdc1-70530f8890bd",
  "subject": {
    "type": "CLIENT",
    "id": "2752a494-4b9f-4a28-9648-744ee9317c48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzUyYTQ5NC00YjlmLTRhMjgtOTY0OC03NDRlZTkzMTdjNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0ODE5LCJpYXQiOjE3OTMzOTM5MTksImp0aSI6ImRhMTg1OGUyLTdhNDQtNDMzMS05OWRkLTI1YzNhOTIyYWZlYiIsInNpZCI6ImEwNzJmZTFlLTM4NzMtNDE1OC1iZGMxLTcwNTMwZjg4OTBiZCJ9.jlT7ODWrwikP1doByWll3hKgbD_MdtQUtAb4_Guuy78",
  "access_expires_at": "2026-10-30T21:13:39.827018192Z",
  "refresh_token": "8LzNPjkCT3tw_eaAxU9hIfmgJNa-rGdZf3wfFCaOOIs",
  "refresh_expires_at": "2026-11-29T20:58:39.826524151Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "5186b0c6-41e0-40d5-be6a-6ff38757d84a",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T20:58:39.193798Z",
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
  "command_id": "a0cf82c2-f490-4742-86ca-6f5bcbeacd2f",
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
  "id": "4a82e0d6-b797-4df0-8b8b-98ef1b12c2de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:03:40.224457Z",
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
  "command_id": "e45f8d4d-bceb-4ed8-960c-3dfb7595f566",
  "quote_id": "4a82e0d6-b797-4df0-8b8b-98ef1b12c2de",
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
  "correlation_id": "c8793fc5-bef6-46cd-b9e6-bb7794c10ee0"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "522f03e7-bb71-4163-a23e-928dacc21c20",
  "version_id": "5186b0c6-41e0-40d5-be6a-6ff38757d84a",
  "language": "uk"
}
```

```json
{
  "version_id": "5186b0c6-41e0-40d5-be6a-6ff38757d84a",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T20:58:40.653141Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7e0a73f2-c246-478f-bc40-034874080bfc",
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
  "id": "9bcf2070-fe6f-4486-b237-3c63b8d763ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:03:40.856759Z",
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
  "command_id": "aa647da4-bb89-4d70-adda-e529d3908878",
  "quote_id": "9bcf2070-fe6f-4486-b237-3c63b8d763ea",
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
  "id": "958dbc57-e26f-4618-b846-fd9aa0b025eb",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2752a494-4b9f-4a28-9648-744ee9317c48",
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
  "created_at": "2026-10-30T20:58:41.06293Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/958dbc57-e26f-4618-b846-fd9aa0b025eb` → **200**

```json
{
  "id": "958dbc57-e26f-4618-b846-fd9aa0b025eb",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2752a494-4b9f-4a28-9648-744ee9317c48",
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
  "created_at": "2026-10-30T20:58:41.06293Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/958dbc57-e26f-4618-b846-fd9aa0b025eb/cancel` → **200**

```json
{
  "command_id": "9ab0aab6-cca1-4a30-ad73-5d0a0fadc15c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "958dbc57-e26f-4618-b846-fd9aa0b025eb",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2752a494-4b9f-4a28-9648-744ee9317c48",
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
  "created_at": "2026-10-30T20:58:41.06293Z",
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
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/5186b0c6-41e0-40d5-be6a-6ff38757d84a` → **409**

```json
{
  "command_id": "e89ec481-bf5e-4c57-be72-9ce8f34653fd",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T20:58:41Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/5186b0c6-41e0-40d5-be6a-6ff38757d84a",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6b6c940e-8051-4999-b036-edffacc926a1"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "cf628548-7070-46d8-b932-72a6c0398beb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T20:58:41Z"
}
```

```json
{
  "id": "348f26f7-9149-4dc8-98f8-42d5008badc7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T20:58:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/348f26f7-9149-4dc8-98f8-42d5008badc7/publish` → **200**

```json
{
  "command_id": "d00b6835-4267-4df4-84f2-28935ffd7b36",
  "expected_version": 0
}
```

```json
{
  "id": "348f26f7-9149-4dc8-98f8-42d5008badc7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T20:58:42.191331Z",
  "published_at": "2026-10-30T20:58:42.191331Z",
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
  "device_ref": "sandbox-13280"
}
```

```json
{
  "challenge_id": "eff886dc-e952-4c77-babe-3bd205eb3031",
  "expires_at": "2026-10-30T21:03:42.395662629Z",
  "resend_available_at": "2026-10-30T20:58:43.395662629Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "186386",
  "sent_at": "2026-10-30T20:58:42.397673058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eff886dc-e952-4c77-babe-3bd205eb3031",
  "code": "186386",
  "device_ref": "sandbox-13280"
}
```

```json
{
  "session_id": "281f4857-410a-4180-8194-fc854f60983b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDgyMiwiaWF0IjoxNzkzMzkzOTIyLCJqdGkiOiI5YjY3ZDMyMS0wNjdmLTRlMDItYTA1ZS1kM2ZkNWFmMDBhZDkiLCJzaWQiOiIyODFmNDg1Ny00MTBhLTQxODAtODE5NC1mYzg1NGY2MDk4M2IifQ.y-hUmImmlTWVmTxzixktJ8jA4KFVnJoTRRXLTIqMMeQ",
  "access_expires_at": "2026-10-30T21:13:42.61579216Z",
  "refresh_token": "eCGa-PuIILh9C-Y2sjq4jLwcvhcb0bNlleK9Qg1861A",
  "refresh_expires_at": "2026-11-29T20:58:42.615371368Z",
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

(the car drives 73 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "56e897ca-05ff-4b70-8487-067585fd9546",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T20:59:56Z",
    "sequence": 1793393996385
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "94d19afd-a819-456d-bfc2-5f430d161d4c",
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
  "last_heartbeat_at": "2026-10-30T20:59:56.053444Z",
  "last_location_at": "2026-10-30T20:59:56.053444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674153119",
  "device_ref": "sandbox-17513"
}
```

```json
{
  "challenge_id": "3ea99097-6d9a-496b-b629-eaff4c7370fb",
  "expires_at": "2026-10-30T21:04:56.248569878Z",
  "resend_available_at": "2026-10-30T20:59:57.248569878Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674153119` → **200**

```json
{
  "phone": "+380674153119",
  "audience": "CLIENT",
  "code": "322921",
  "sent_at": "2026-10-30T20:59:56.250304198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ea99097-6d9a-496b-b629-eaff4c7370fb",
  "code": "322921",
  "device_ref": "sandbox-17513"
}
```

```json
{
  "session_id": "20ce2926-b751-42f7-a43d-2f57f044c181",
  "subject": {
    "type": "CLIENT",
    "id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YThhNGY5ZS1kY2RjLTQwMTYtYjU2MS05NGM3MzBjYWU2ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0ODk2LCJpYXQiOjE3OTMzOTM5OTYsImp0aSI6ImNlZWUyOWRlLTJmNTQtNDM1My04MWU4LWEzNzc1MTIxNzUyNiIsInNpZCI6IjIwY2UyOTI2LWI3NTEtNDJmNy1hNDNkLTJmNTdmMDQ0YzE4MSJ9.pyMuIkaGOC9jcTeHbRfwT-6eJ5aQ8LXTNMiGEWCTsDM",
  "access_expires_at": "2026-10-30T21:14:56.461792804Z",
  "refresh_token": "hSftwTHo4cZ3NO2b4VK3y51fxt1-31F3uDmOxRuN4kM",
  "refresh_expires_at": "2026-11-29T20:59:56.461454046Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76cb2cc0-fe4f-464f-ac3f-26bef1eaedb9",
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
  "id": "368120d1-5534-4df8-a6ec-47365ce48e17",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:04:56.652282Z",
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
  "command_id": "720c7905-49d8-4114-91b1-85dad1a07a41",
  "quote_id": "368120d1-5534-4df8-a6ec-47365ce48e17",
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
    "phone": "+380671192865"
  }
}
```

```json
{
  "id": "6935016d-de92-4f4d-a1dc-b381442049e4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:59:56.850452Z",
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
    "id": "a0e4334f-a7a2-46f7-9f32-13899dfd168b",
    "order_id": "6935016d-de92-4f4d-a1dc-b381442049e4",
    "expires_at": "2026-10-30T21:00:11.852548Z",
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

`POST /api/driver/v1/offers/a0e4334f-a7a2-46f7-9f32-13899dfd168b/accept` → **200**

```json
{
  "command_id": "44f89d30-0a6c-4e45-b566-719d186b4edd"
}
```

```json
{
  "id": "b776cb19-af6a-46ae-ba62-c3c1d72ca18f",
  "order_id": "6935016d-de92-4f4d-a1dc-b381442049e4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84490b31-c8b4-467d-8711-be9d4866ade1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "84490b31-c8b4-467d-8711-be9d4866ade1",
  "order_id": "6935016d-de92-4f4d-a1dc-b381442049e4",
  "assignment_id": "b776cb19-af6a-46ae-ba62-c3c1d72ca18f",
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
    "phone": "+380671192865"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d1a37cea-e0bf-4227-92c0-4e6b3212f05d",
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
  "id": "f6b721e7-fbec-4fbb-84c5-cafea73de229",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:04:57.659224Z",
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
  "command_id": "8ef3b2cf-2a4e-4018-96fd-b4170d6eb55f",
  "quote_id": "f6b721e7-fbec-4fbb-84c5-cafea73de229",
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
  "id": "df1396d1-9fb5-4d96-8b8a-e19041aa0e76",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:59:57.862957Z",
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
  "command_id": "37706311-64f7-468c-a84f-004efd800cb4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T23:59:58Z"
}
```

```json
{
  "id": "09ef0ad1-7808-44ba-873b-c28f95a824d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:04:58.105326Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T23:59:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d4e9a4e8-3180-428b-b447-c16644880f23",
  "quote_id": "09ef0ad1-7808-44ba-873b-c28f95a824d0",
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
  "pickup_at": "2026-10-30T23:59:58Z"
}
```

```json
{
  "id": "0a5dc4ae-17c7-4d1e-b114-80c714c85268",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T20:59:58.311089Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T23:59:58Z",
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
  "command_id": "34d9dcf9-ff14-442c-b4ab-220284dea461",
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
  "id": "ffdbdeb7-ec82-4aaf-802a-66e551b664bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:04:58.519528Z",
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
  "command_id": "c12050a7-8b5e-436e-8811-778e4f86169b",
  "quote_id": "ffdbdeb7-ec82-4aaf-802a-66e551b664bb",
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
  "correlation_id": "2112e0e8-56b5-4711-b2bd-00ed7e27e0c6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "0a5dc4ae-17c7-4d1e-b114-80c714c85268",
      "short_number": 30,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T20:59:58.311089Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T23:59:58Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "df1396d1-9fb5-4d96-8b8a-e19041aa0e76",
      "short_number": 29,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T20:59:57.862957Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6935016d-de92-4f4d-a1dc-b381442049e4",
      "short_number": 28,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "df1396d1-9fb5-4d96-8b8a-e19041aa0e76",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:59:57.862957Z",
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

`GET /api/rider/v1/orders/6935016d-de92-4f4d-a1dc-b381442049e4` → **200**

```json
{
  "id": "6935016d-de92-4f4d-a1dc-b381442049e4",
  "short_number": 28,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b776cb19-af6a-46ae-ba62-c3c1d72ca18f",
    "order_id": "6935016d-de92-4f4d-a1dc-b381442049e4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "84490b31-c8b4-467d-8711-be9d4866ade1",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T20:59:56.850452Z",
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
    "location_at": "2026-10-30T20:59:56.053444Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/6935016d-de92-4f4d-a1dc-b381442049e4/cancel` → **200**

```json
{
  "command_id": "5567c1e9-b3c4-4239-9a60-f0f84f6e642b",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6935016d-de92-4f4d-a1dc-b381442049e4",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b776cb19-af6a-46ae-ba62-c3c1d72ca18f",
    "order_id": "6935016d-de92-4f4d-a1dc-b381442049e4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "84490b31-c8b4-467d-8711-be9d4866ade1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T20:59:56.850452Z",
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
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/df1396d1-9fb5-4d96-8b8a-e19041aa0e76` → **200**

```json
{
  "id": "df1396d1-9fb5-4d96-8b8a-e19041aa0e76",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T20:59:57.862957Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/df1396d1-9fb5-4d96-8b8a-e19041aa0e76/cancel` → **200**

```json
{
  "command_id": "f87c16c7-59ed-4c50-81b0-772b312dec3f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "df1396d1-9fb5-4d96-8b8a-e19041aa0e76",
  "short_number": 29,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T20:59:57.862957Z",
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
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0a5dc4ae-17c7-4d1e-b114-80c714c85268` → **200**

```json
{
  "id": "0a5dc4ae-17c7-4d1e-b114-80c714c85268",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T20:59:58.311089Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T23:59:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0a5dc4ae-17c7-4d1e-b114-80c714c85268/cancel` → **200**

```json
{
  "command_id": "5372782d-684d-4274-a03b-98c45720fe77",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0a5dc4ae-17c7-4d1e-b114-80c714c85268",
  "short_number": 30,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9a8a4f9e-dcdc-4016-b561-94c730cae6ea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T20:59:58.311089Z",
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
  "pickup_at": "2026-10-30T23:59:58Z",
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
  "session_id": "94d19afd-a819-456d-bfc2-5f430d161d4c",
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
  "last_heartbeat_at": "2026-10-30T20:59:56.053444Z",
  "last_location_at": "2026-10-30T20:59:56.053444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/94d19afd-a819-456d-bfc2-5f430d161d4c/close` → **200**

```json
{
  "command_id": "f326f411-d6d3-487c-a428-d0499ac95c8f",
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

Done: orders 6935016d-de92-4f4d-a1dc-b381442049e4, df1396d1-9fb5-4d96-8b8a-e19041aa0e76, 0a5dc4ae-17c7-4d1e-b114-80c714c85268.

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
  "session_id": "2e14d4ee-1e56-47bc-b38e-720a8be1be5f",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5MDEsImlhdCI6MTc5MzM5NDAwMSwianRpIjoiMmFjY2JjZjItMTNmZS00NjkxLWIwNTMtZTYwNDcwYjYzNjA3Iiwic2lkIjoiMmUxNGQ0ZWUtMWU1Ni00N2JjLWIzOGUtNzIwYThiZTFiZTVmIn0.OUKB7QfZYwlaq4AR4knbJstlzHIoJFyiYZaGbWumkPc",
  "access_expires_at": "2026-10-30T21:15:01.141542103Z",
  "refresh_token": "r95yUrPpAmVV4oalyuAeYRbw9yL_jCgjdVQ1S2wAA3o",
  "refresh_expires_at": "2026-10-31T09:00:01.14111837Z",
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
  "session_id": "6a98f15d-0acd-438f-972a-28893a9d5370",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5MDEsImlhdCI6MTc5MzM5NDAwMSwianRpIjoiMjQ5YjNhZDUtOGVlOC00MDA4LTkyMzUtZTI0ODI0MTI0ODFhIiwic2lkIjoiNmE5OGYxNWQtMGFjZC00MzhmLTk3MmEtMjg4OTNhOWQ1MzcwIn0.Xpqz-ZJvGfEndqN8q75KNKhIehpkt-lS2AwBuWhDVSk",
  "access_expires_at": "2026-10-30T21:15:01.54398477Z",
  "refresh_token": "VQThJ4ujHtLYgUyfWsZLVoSZFAVTBEN-Q5w8ttvy2l4",
  "refresh_expires_at": "2026-10-31T09:00:01.54357152Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3725"
}
```

```json
{
  "challenge_id": "826ad48a-c8e0-4cc0-8224-5b5ddaf28e40",
  "expires_at": "2026-10-30T21:05:01.732689505Z",
  "resend_available_at": "2026-10-30T21:00:02.732689505Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "999384",
  "sent_at": "2026-10-30T21:00:01.735294055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "826ad48a-c8e0-4cc0-8224-5b5ddaf28e40",
  "code": "999384",
  "device_ref": "sandbox-3725"
}
```

```json
{
  "session_id": "30136824-cba2-43e6-b48f-29596ab72a08",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDkwMSwiaWF0IjoxNzkzMzk0MDAxLCJqdGkiOiJiOGY5MjNmNi01NjE5LTQ2NzgtOWJkMS0wZjI5YjkzZmU4NDUiLCJzaWQiOiIzMDEzNjgyNC1jYmEyLTQzZTYtYjQ4Zi0yOTU5NmFiNzJhMDgifQ.TUaizrnLzxqWRsBjSQYJaq4CwQcmFFCQ77CPa-qtigs",
  "access_expires_at": "2026-10-30T21:15:01.947874498Z",
  "refresh_token": "g56ommHXWzz_ZcTle8LAxcMzfeU8ANf4d0fCUAXHi6s",
  "refresh_expires_at": "2026-11-29T21:00:01.947368245Z",
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
  "command_id": "f2e15766-aa52-49fc-8e5b-fe6eff127b6f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:00:02Z",
    "sequence": 1793394002339
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a58adfd1-340f-4425-aec6-1c20a47180e0",
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
  "last_heartbeat_at": "2026-10-30T21:00:02.354188Z",
  "last_location_at": "2026-10-30T21:00:02.354188Z",
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
  "command_id": "f7d93917-6efe-49f2-8298-7b228a1ee36c",
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
  "effective_at": "2026-10-30T21:00:02.746901Z",
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T20:47:35.254319Z",
  "last_entries": [
    {
      "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T20:47:35.254319Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8b5b6db4-6598-4fd3-85b3-0da58bdd45b3",
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
  "id": "6c4711ff-88be-4f7b-89dc-b43f73d7a858",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:05:03.131676Z",
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
  "command_id": "77e4d62c-f15f-45fb-9c7a-ef091c19e106",
  "quote_id": "6c4711ff-88be-4f7b-89dc-b43f73d7a858",
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
    "phone": "+380671114612"
  }
}
```

```json
{
  "id": "6d39115b-beed-4604-9909-e2f13ae4a357",
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
  "created_at": "2026-10-30T21:00:03.331177Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114612"
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
    "id": "426db82e-1823-4b07-b68e-7d74836c1785",
    "order_id": "6d39115b-beed-4604-9909-e2f13ae4a357",
    "expires_at": "2026-10-30T21:00:18.333426Z",
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

`POST /api/driver/v1/offers/426db82e-1823-4b07-b68e-7d74836c1785/accept` → **200**

```json
{
  "command_id": "56f3d1f6-fb38-460e-98f7-9567725b26f3"
}
```

```json
{
  "id": "e98e6634-7bb2-4f38-9897-03a30d101948",
  "order_id": "6d39115b-beed-4604-9909-e2f13ae4a357",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2c15a5b0-4815-4d00-ab63-c7b14e37e8bc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2c15a5b0-4815-4d00-ab63-c7b14e37e8bc",
  "order_id": "6d39115b-beed-4604-9909-e2f13ae4a357",
  "assignment_id": "e98e6634-7bb2-4f38-9897-03a30d101948",
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
    "phone": "+380671114612"
  }
}
```

`POST /api/driver/v1/work-sessions/a58adfd1-340f-4425-aec6-1c20a47180e0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:00:04Z",
    "sequence": 1793394004193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a58adfd1-340f-4425-aec6-1c20a47180e0",
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
  "last_heartbeat_at": "2026-10-30T21:00:04.208055Z",
  "last_location_at": "2026-10-30T21:00:04.208055Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2c15a5b0-4815-4d00-ab63-c7b14e37e8bc/arrive` → **200**

```json
{
  "command_id": "c6f587fb-eeab-4409-b959-64a327729488",
  "expected_version": 0
}
```

```json
{
  "id": "2c15a5b0-4815-4d00-ab63-c7b14e37e8bc",
  "order_id": "6d39115b-beed-4604-9909-e2f13ae4a357",
  "assignment_id": "e98e6634-7bb2-4f38-9897-03a30d101948",
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
  "arrived_at": "2026-10-30T21:00:04.406669Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114612"
  }
}
```

`POST /api/driver/v1/trips/2c15a5b0-4815-4d00-ab63-c7b14e37e8bc/start` → **200**

```json
{
  "command_id": "faac9274-2915-4cb2-bafe-2e85a80d7762",
  "expected_version": 1
}
```

```json
{
  "id": "2c15a5b0-4815-4d00-ab63-c7b14e37e8bc",
  "order_id": "6d39115b-beed-4604-9909-e2f13ae4a357",
  "assignment_id": "e98e6634-7bb2-4f38-9897-03a30d101948",
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
  "arrived_at": "2026-10-30T21:00:04.406669Z",
  "started_at": "2026-10-30T21:00:04.651033Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114612"
  }
}
```

`POST /api/driver/v1/trips/2c15a5b0-4815-4d00-ab63-c7b14e37e8bc/complete` → **200**

```json
{
  "command_id": "f8cbf3cf-3423-4d72-8a16-38e9ef747d46",
  "expected_version": 2,
  "reported_at": "2026-10-30T21:00:04Z",
  "cash_received": true
}
```

```json
{
  "id": "2c15a5b0-4815-4d00-ab63-c7b14e37e8bc",
  "order_id": "6d39115b-beed-4604-9909-e2f13ae4a357",
  "assignment_id": "e98e6634-7bb2-4f38-9897-03a30d101948",
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
  "arrived_at": "2026-10-30T21:00:04.406669Z",
  "started_at": "2026-10-30T21:00:04.651033Z",
  "completed_at": "2026-10-30T21:00:04.856079Z",
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
  "command_id": "b6c87d14-4d34-4639-b879-96fbfa0213d5",
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
  "id": "7b54f630-7b31-4d47-aa01-356712058c12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:05:05.063450Z",
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
  "command_id": "1aae4255-ca58-4f29-9c88-1d589e328c41",
  "quote_id": "7b54f630-7b31-4d47-aa01-356712058c12",
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
    "phone": "+380671112891"
  }
}
```

```json
{
  "id": "bbcc228f-1ad4-44f2-a842-5e3417f5e588",
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
  "created_at": "2026-10-30T21:00:05.263344Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112891"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/bbcc228f-1ad4-44f2-a842-5e3417f5e588` → **200**

```json
{
  "id": "bbcc228f-1ad4-44f2-a842-5e3417f5e588",
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
  "created_at": "2026-10-30T21:00:05.263344Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112891"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bbcc228f-1ad4-44f2-a842-5e3417f5e588/cancel` → **200**

```json
{
  "command_id": "24be56e5-d874-4776-8bc5-f6167bb1ed54",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "bbcc228f-1ad4-44f2-a842-5e3417f5e588",
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
  "created_at": "2026-10-30T21:00:05.263344Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112891"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора",
      "pl": "Błąd operatora"
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
  "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T20:47:35.254319Z",
  "last_entries": [
    {
      "order_id": "bbcc228f-1ad4-44f2-a842-5e3417f5e588",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T21:00:05.672326Z"
    },
    {
      "order_id": "6d39115b-beed-4604-9909-e2f13ae4a357",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T21:00:04.859866Z"
    },
    {
      "order_id": "28e748e0-a737-4e2f-a2e3-d1d92f685120",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T20:47:35.254319Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a58adfd1-340f-4425-aec6-1c20a47180e0",
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
  "last_heartbeat_at": "2026-10-30T21:00:04.208055Z",
  "last_location_at": "2026-10-30T21:00:04.208055Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a58adfd1-340f-4425-aec6-1c20a47180e0/close` → **200**

```json
{
  "command_id": "c1a38d07-91a3-40b3-aeb1-bf13dae17efe",
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

Done: operator bonus for fulfilled 6d39115b-beed-4604-9909-e2f13ae4a357 and operator-fault cancellation bbcc228f-1ad4-44f2-a842-5e3417f5e588.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672006297",
  "device_ref": "sandbox-17969"
}
```

```json
{
  "challenge_id": "7cb28dfa-9b41-40dc-89dd-a985d86ec712",
  "expires_at": "2026-10-30T21:05:09.696024248Z",
  "resend_available_at": "2026-10-30T21:00:10.696024248Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672006297` → **200**

```json
{
  "phone": "+380672006297",
  "audience": "CLIENT",
  "code": "821875",
  "sent_at": "2026-10-30T21:00:09.697756032Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677071125",
  "device_ref": "sandbox-17939",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "4311c282-cdea-410b-8f34-d5a82bd3f524",
  "expires_at": "2026-10-30T21:05:11.12848698Z",
  "resend_available_at": "2026-10-30T21:00:12.12848698Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677071125` → **200**

```json
{
  "phone": "+380677071125",
  "audience": "CLIENT",
  "code": "204116",
  "sent_at": "2026-10-30T21:00:11.130433069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677071125",
  "device_ref": "sandbox-21891",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ad7d5deb-9f1e-4c2a-af1c-c9b116046ae4",
  "expires_at": "2026-10-30T21:05:12.57847201Z",
  "resend_available_at": "2026-10-30T21:00:13.57847201Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677071125` → **200**

```json
{
  "phone": "+380677071125",
  "audience": "CLIENT",
  "code": "048981",
  "sent_at": "2026-10-30T21:00:12.580983351Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674820000",
  "device_ref": "sandbox-2301"
}
```

```json
{
  "challenge_id": "2f8e4814-323a-41a0-9036-b775141471fd",
  "expires_at": "2026-10-30T21:05:14.024677852Z",
  "resend_available_at": "2026-10-30T21:00:15.024677852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674820000",
  "device_ref": "sandbox-27716"
}
```

```json
{
  "challenge_id": "c672b501-9a6f-426d-a45f-a4d528e29f3c",
  "expires_at": "2026-10-30T21:05:15.420898297Z",
  "resend_available_at": "2026-10-30T21:00:16.420898297Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674820000` → **200**

```json
{
  "phone": "+380674820000",
  "audience": "CLIENT",
  "code": "098368",
  "sent_at": "2026-10-30T21:00:15.423149743Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674820000",
  "device_ref": "sandbox-31444",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "978ca08f-026b-4d81-95b3-dcdd73e9e94a",
  "expires_at": "2026-10-30T21:05:16.843166054Z",
  "resend_available_at": "2026-10-30T21:00:17.843166054Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674820000` → **200**

```json
{
  "phone": "+380674820000",
  "audience": "CLIENT",
  "code": "626435",
  "sent_at": "2026-10-30T21:00:16.845307095Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380674820000",
  "device_ref": "sandbox-26860",
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
  "correlation_id": "3f637441-601c-42ba-ab91-0a9af5a6cc14",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000018427"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "125ff1f4-cc06-4a2c-8356-cb6dc8caf4ce"
}
```

`GET /sandbox/v1/otp?phone=%2B442000018427` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120029922"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b66c55a8-e03d-400a-af4c-14707919c8e9"
}
```

`GET /sandbox/v1/otp?phone=%2B37120029922` → **404**

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
  "session_id": "08cc4b24-ef9f-45ef-979c-39a199f0dda9",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5MTksImlhdCI6MTc5MzM5NDAxOSwianRpIjoiNWNiM2ZjNzItYjE0Yy00ZmE4LTgzZDgtYzZiNTAwZjQ2ZjNmIiwic2lkIjoiMDhjYzRiMjQtZWY5Zi00NWVmLTk3OWMtMzlhMTk5ZjBkZGE5In0.qjYZBHK4Q2EKcfrcitpcCZT33driL_E29Mqc9aMN2yk",
  "access_expires_at": "2026-10-30T21:15:19.121030811Z",
  "refresh_token": "R-ilx3JlD-rG2jDPCGZX9gXNSeQfexnjPC_P4meTXAE",
  "refresh_expires_at": "2026-10-31T09:00:19.120586845Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674820000` → **200**

```json
{
  "deliveries": [
    {
      "id": "001db2ea-f47a-4140-b22c-2b9fe3fbbec8",
      "challenge_id": "978ca08f-026b-4d81-95b3-dcdd73e9e94a",
      "phone": "+380674820000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-25c39f4d-7cd5-4a8c-b621-d777a7245cde",
      "error": null,
      "attempted_at": "2026-10-30T21:00:16.845545Z"
    },
    {
      "id": "84d55617-cf61-4d39-98aa-7c4f2193125d",
      "challenge_id": "c672b501-9a6f-426d-a45f-a4d528e29f3c",
      "phone": "+380674820000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-687a83b3-477f-4af9-9bac-925819d6812b",
      "error": null,
      "attempted_at": "2026-10-30T21:00:15.423506Z"
    },
    {
      "id": "64a77826-4feb-40a3-b960-087448833bf1",
      "challenge_id": "2f8e4814-323a-41a0-9036-b775141471fd",
      "phone": "+380674820000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T21:00:14.026941Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674820000` → **200**

```json
{
  "phone": "+380674820000",
  "audience": "CLIENT",
  "code": "626435",
  "sent_at": "2026-10-30T21:00:16.845307095Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677071125` → **200**

```json
{
  "deliveries": [
    {
      "id": "67d0ef39-72e0-48c4-82cd-3f0de20146ca",
      "challenge_id": "ad7d5deb-9f1e-4c2a-af1c-c9b116046ae4",
      "phone": "+380677071125",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-48dbfb26-0c59-4eb3-9891-7fdebeda750b",
      "error": null,
      "attempted_at": "2026-10-30T21:00:12.581363Z"
    },
    {
      "id": "798b4602-ed4e-4f73-871e-5f2f0276c624",
      "challenge_id": "4311c282-cdea-410b-8f34-d5a82bd3f524",
      "phone": "+380677071125",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e4ffebee-f3e9-4ec4-b4bf-0230a9549ebc",
      "error": null,
      "attempted_at": "2026-10-30T21:00:11.130897Z"
    }
  ]
}
```

Done: SMS to +380672006297; SMS then a call to +380677071125; a failed SMS, two calls and a refused third to +380674820000; +44 and +371 refused.

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
  "session_id": "1ae18685-d7d6-4c1f-a259-4c5cbcb43f57",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5MTksImlhdCI6MTc5MzM5NDAxOSwianRpIjoiODM4M2FmYzYtMWZmOS00NWI2LTkyMjktNWRiZWVmZDU0OWM3Iiwic2lkIjoiMWFlMTg2ODUtZDdkNi00YzFmLWEyNTktNGM1Y2JjYjQzZjU3In0.O4YHOD7ui9en2j1SnXDLFoXaZ47AF359_FzfoMq7zoY",
  "access_expires_at": "2026-10-30T21:15:19.975943716Z",
  "refresh_token": "V5u_f5UUIwNCtL4jY0bJTaU77BM6HdXv7FybD-zBKs4",
  "refresh_expires_at": "2026-10-31T09:00:19.975524862Z",
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
  "session_id": "86272c02-a1d3-48bf-84d7-14a458bd6f1e",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5MjAsImlhdCI6MTc5MzM5NDAyMCwianRpIjoiZjg2MjE5MTktMGI0NC00NTY2LWExNWYtZDNhZjVjMjIzODQ0Iiwic2lkIjoiODYyNzJjMDItYTFkMy00OGJmLTg0ZDctMTRhNDU4YmQ2ZjFlIn0.T2RgWs0DTVO7j17KJW54FJCfYz05wrRgDCOYPafm1BM",
  "access_expires_at": "2026-10-30T21:15:20.400087971Z",
  "refresh_token": "78xvOrhMGMdPADlyjYC6UaAwSmRp2wkN-Cl8E_-1D8k",
  "refresh_expires_at": "2026-10-31T09:00:20.399583634Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3",
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

`POST /api/admin/v1/staff-extensions/188b6db1-901f-476e-b592-dea8cdf876d3` → **200**

```json
{
  "command_id": "3a8eebe1-7d69-43f1-a988-0df53ef8a004",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "9e3315e7-1464-4a11-920b-ad51e903595d",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T21:00:21.25259Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T21:00:21.25259Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5ce4b7c3-7b10-429c-bf94-c39a77989c47",
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
  "id": "3d306ad4-55c9-44c3-aa37-eafe24d300bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:05:21.670069Z",
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
  "command_id": "597c330a-c1ee-4685-ae71-53aac1d06e63",
  "quote_id": "3d306ad4-55c9-44c3-aa37-eafe24d300bf",
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
    "phone": "+380675304963"
  }
}
```

```json
{
  "id": "f7e576c5-fadc-45df-ab8b-0c955a60f5a4",
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
  "created_at": "2026-10-30T21:00:21.869289Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675304963"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/f7e576c5-fadc-45df-ab8b-0c955a60f5a4/calls` → **201**

```json
{
  "command_id": "408e0744-7106-41e8-bfdb-8ebf4a91f4cb",
  "to": "CALLER"
}
```

```json
{
  "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "order_ids": [
    "f7e576c5-fadc-45df-ab8b-0c955a60f5a4"
  ],
  "started_at": "2026-10-30T21:00:22.096537Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/f7e576c5-fadc-45df-ab8b-0c955a60f5a4/calls` → **201**

```json
{
  "command_id": "408e0744-7106-41e8-bfdb-8ebf4a91f4cb",
  "to": "CALLER"
}
```

```json
{
  "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "order_ids": [
    "f7e576c5-fadc-45df-ab8b-0c955a60f5a4"
  ],
  "started_at": "2026-10-30T21:00:22.096537Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675304963",
    "at": "2026-10-30T21:00:22.099151969Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11210",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=f7e576c5-fadc-45df-ab8b-0c955a60f5a4` → **200**

```json
{
  "calls": [
    {
      "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [
        "f7e576c5-fadc-45df-ab8b-0c955a60f5a4"
      ],
      "started_at": "2026-10-30T21:00:22.096537Z",
      "answered_at": "2026-10-30T21:00:22.57651Z",
      "ended_at": "2026-10-30T21:00:22.596118Z",
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

`GET /api/operator/v1/calls?order_id=f7e576c5-fadc-45df-ab8b-0c955a60f5a4` → **200**

```json
{
  "calls": [
    {
      "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [
        "f7e576c5-fadc-45df-ab8b-0c955a60f5a4"
      ],
      "started_at": "2026-10-30T21:00:22.096537Z",
      "answered_at": "2026-10-30T21:00:22.57651Z",
      "ended_at": "2026-10-30T21:00:22.596118Z",
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

`GET /api/operator/v1/calls?order_id=f7e576c5-fadc-45df-ab8b-0c955a60f5a4` → **200**

```json
{
  "calls": [
    {
      "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [
        "f7e576c5-fadc-45df-ab8b-0c955a60f5a4"
      ],
      "started_at": "2026-10-30T21:00:22.096537Z",
      "answered_at": "2026-10-30T21:00:22.57651Z",
      "ended_at": "2026-10-30T21:00:22.596118Z",
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

`GET /api/operator/v1/calls?order_id=f7e576c5-fadc-45df-ab8b-0c955a60f5a4` → **200**

```json
{
  "calls": [
    {
      "id": "76b33c70-5bb6-44bc-9d5c-daca32cc22c5",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "order_ids": [
        "f7e576c5-fadc-45df-ab8b-0c955a60f5a4"
      ],
      "started_at": "2026-10-30T21:00:22.096537Z",
      "answered_at": "2026-10-30T21:00:22.57651Z",
      "ended_at": "2026-10-30T21:00:22.596118Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T21:00:27.59793Z"
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

`GET /api/operator/v1/orders/f7e576c5-fadc-45df-ab8b-0c955a60f5a4` → **200**

```json
{
  "id": "f7e576c5-fadc-45df-ab8b-0c955a60f5a4",
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
  "created_at": "2026-10-30T21:00:21.869289Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675304963"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f7e576c5-fadc-45df-ab8b-0c955a60f5a4/cancel` → **200**

```json
{
  "command_id": "da2c335e-264f-42d2-bd00-715f32118408",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f7e576c5-fadc-45df-ab8b-0c955a60f5a4",
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
  "created_at": "2026-10-30T21:00:21.869289Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675304963"
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
  "command_id": "118e614d-d9ee-401f-83de-ce30a1e1745a",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T21:00:29.875427Z",
  "extension": "101"
}
```

Done: outgoing call 76b33c70-5bb6-44bc-9d5c-daca32cc22c5 from order f7e576c5-fadc-45df-ab8b-0c955a60f5a4, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630800151",
  "device_ref": "sandbox-29451"
}
```

```json
{
  "challenge_id": "7aff3859-5f37-4568-b8fc-371f407f839e",
  "expires_at": "2026-10-30T21:05:30.078782628Z",
  "resend_available_at": "2026-10-30T21:00:31.078782628Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630800151` → **200**

```json
{
  "phone": "+380630800151",
  "audience": "CLIENT",
  "code": "546158",
  "sent_at": "2026-10-30T21:00:30.080819374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7aff3859-5f37-4568-b8fc-371f407f839e",
  "code": "546158",
  "device_ref": "sandbox-29451"
}
```

```json
{
  "session_id": "bd87cdf2-ac2c-4067-abab-694543c3e730",
  "subject": {
    "type": "CLIENT",
    "id": "da790188-6420-43fe-ba50-b9d6742bd0cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTc5MDE4OC02NDIwLTQzZmUtYmE1MC1iOWQ2NzQyYmQwY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0OTMwLCJpYXQiOjE3OTMzOTQwMzAsImp0aSI6ImE0ZGQ4Mjk3LWY2NzctNDQyYy1hOWVhLWJiZTk3YjI4NWI4MiIsInNpZCI6ImJkODdjZGYyLWFjMmMtNDA2Ny1hYmFiLTY5NDU0M2MzZTczMCJ9.ui6zR12EjKmPJBvPCgcSOUIxgqN1I7SOiSCOn0ZsFpk",
  "access_expires_at": "2026-10-30T21:15:30.295155488Z",
  "refresh_token": "tdCSrCxULrC1rj5CpEvJwUuTX1VNb3gR7Wg32YgkaNU",
  "refresh_expires_at": "2026-11-29T21:00:30.294762319Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "da790188-6420-43fe-ba50-b9d6742bd0cc",
  "session_id": "bd87cdf2-ac2c-4067-abab-694543c3e730",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630800151",
  "device_ref": "sandbox-32399"
}
```

```json
{
  "challenge_id": "1d3f2af5-5fb0-4708-9c73-cf2b01e66cf9",
  "expires_at": "2026-10-30T21:05:32.687545413Z",
  "resend_available_at": "2026-10-30T21:00:33.687545413Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630800151` → **200**

```json
{
  "phone": "+380630800151",
  "audience": "CLIENT",
  "code": "637443",
  "sent_at": "2026-10-30T21:00:32.689871132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d3f2af5-5fb0-4708-9c73-cf2b01e66cf9",
  "code": "637443",
  "device_ref": "sandbox-32399"
}
```

```json
{
  "session_id": "318bb621-62bb-4a63-90d3-b899f4f0758d",
  "subject": {
    "type": "CLIENT",
    "id": "da790188-6420-43fe-ba50-b9d6742bd0cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTc5MDE4OC02NDIwLTQzZmUtYmE1MC1iOWQ2NzQyYmQwY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0OTMyLCJpYXQiOjE3OTMzOTQwMzIsImp0aSI6ImUwMjQ3ZTBmLTZlMDktNDIyYi1iNWY2LWJlODNmYTRmZjk1MSIsInNpZCI6IjMxOGJiNjIxLTYyYmItNGE2My05MGQzLWI4OTlmNGYwNzU4ZCJ9.c5OFENAGoS2EcVx69lss7nyU8kAtvWZkBoUGsrUHAgs",
  "access_expires_at": "2026-10-30T21:15:32.903570994Z",
  "refresh_token": "TtFX9iI_Zg6jTx2NY25CGyuhVZ1FDENO-mixVB-Uv1k",
  "refresh_expires_at": "2026-11-29T21:00:32.903196282Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "e60723ab-d6ef-48a4-9dd4-a305cf3cbff3",
  "expires_at": "2026-10-30T21:05:35.106793643Z",
  "resend_available_at": "2026-10-30T21:00:36.106793643Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630800151` → **200**

```json
{
  "phone": "+380630800151",
  "audience": "CLIENT",
  "code": "482367",
  "sent_at": "2026-10-30T21:00:35.108489666Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637819749"
}
```

```json
{
  "challenge_id": "01cf6dea-f46d-4e26-80ec-7a271be1303b",
  "expires_at": "2026-10-30T21:05:35.313071726Z",
  "resend_available_at": "2026-10-30T21:00:36.313071726Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637819749` → **200**

```json
{
  "phone": "+380637819749",
  "audience": "CLIENT",
  "code": "538115",
  "sent_at": "2026-10-30T21:00:35.314698118Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "a08d8d8f-2c5f-471c-b4be-adcc9fddc0e7",
  "current_challenge_id": "e60723ab-d6ef-48a4-9dd4-a305cf3cbff3",
  "current_code": "000000",
  "new_challenge_id": "01cf6dea-f46d-4e26-80ec-7a271be1303b",
  "new_code": "538115"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b30be5b8-7d6c-449b-8a7f-59633564b373"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "1c7d46ad-c2ce-4d23-b99e-4ede77875940",
  "current_challenge_id": "e60723ab-d6ef-48a4-9dd4-a305cf3cbff3",
  "current_code": "482367",
  "new_challenge_id": "01cf6dea-f46d-4e26-80ec-7a271be1303b",
  "new_code": "538115"
}
```

```json
{
  "subject_id": "da790188-6420-43fe-ba50-b9d6742bd0cc",
  "phone": "+380637819749",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "da790188-6420-43fe-ba50-b9d6742bd0cc",
  "session_id": "bd87cdf2-ac2c-4067-abab-694543c3e730",
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
  "correlation_id": "f4d35cd0-6c96-4640-bc82-b1058501414f"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637819749",
  "device_ref": "sandbox-7834"
}
```

```json
{
  "challenge_id": "304375f8-6adc-47eb-9b50-c896f3398c3f",
  "expires_at": "2026-10-30T21:05:38.301430243Z",
  "resend_available_at": "2026-10-30T21:00:39.301430243Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637819749` → **200**

```json
{
  "phone": "+380637819749",
  "audience": "CLIENT",
  "code": "111965",
  "sent_at": "2026-10-30T21:00:38.303137925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "304375f8-6adc-47eb-9b50-c896f3398c3f",
  "code": "111965",
  "device_ref": "sandbox-7834"
}
```

```json
{
  "session_id": "b4bf5614-a72a-41f6-b0b1-ba5f4511d17f",
  "subject": {
    "type": "CLIENT",
    "id": "da790188-6420-43fe-ba50-b9d6742bd0cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTc5MDE4OC02NDIwLTQzZmUtYmE1MC1iOWQ2NzQyYmQwY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0OTM4LCJpYXQiOjE3OTMzOTQwMzgsImp0aSI6IjI0MmM2ZjcxLWUxZjUtNGQ5ZC1hNTU1LTE3N2FjN2Q2YjNkYiIsInNpZCI6ImI0YmY1NjE0LWE3MmEtNDFmNi1iMGIxLWJhNWY0NTExZDE3ZiJ9.HRC8fk3s_sERU_xX91mrhDEuUW_3gLnqvC53BwpwVEc",
  "access_expires_at": "2026-10-30T21:15:38.528990571Z",
  "refresh_token": "XN3rWoHHiTf3AaiFh2qi6cvC63_T0NT1Sxp621GsJjk",
  "refresh_expires_at": "2026-11-29T21:00:38.528284547Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "da790188-6420-43fe-ba50-b9d6742bd0cc",
  "session_id": "b4bf5614-a72a-41f6-b0b1-ba5f4511d17f",
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
  "session_id": "888397da-2875-47e7-92cf-ae1b4ce5a744",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5MzksImlhdCI6MTc5MzM5NDAzOSwianRpIjoiNzE5MzFkMjMtNDEyNS00MTkzLWIxNzMtODdiYjU3MDhkZTQ1Iiwic2lkIjoiODg4Mzk3ZGEtMjg3NS00N2U3LTkyY2YtYWUxYjRjZTVhNzQ0In0.Yqo-fzgccKDzwW2M4Uq6MTw8OnJu4_LHU6QNaCKr10E",
  "access_expires_at": "2026-10-30T21:15:39.134224026Z",
  "refresh_token": "KHK1UUTi9u2kUJ5FpnrDhrrsnG5tOeaD4X4PibHaNX8",
  "refresh_expires_at": "2026-10-31T09:00:39.133860621Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/da790188-6420-43fe-ba50-b9d6742bd0cc` → **200**

```json
{
  "client": {
    "id": "da790188-6420-43fe-ba50-b9d6742bd0cc",
    "phone": "+380637819749",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T21:00:30.293137Z",
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

`POST /api/admin/v1/clients/da790188-6420-43fe-ba50-b9d6742bd0cc/phone/new-code` → **201**

```json
{
  "phone": "+380636441686"
}
```

```json
{
  "challenge_id": "e449fdc9-a299-43d1-b14f-9fe877022e87",
  "expires_at": "2026-10-30T21:05:39.530633337Z",
  "resend_available_at": "2026-10-30T21:00:40.530633337Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636441686` → **200**

```json
{
  "phone": "+380636441686",
  "audience": "CLIENT",
  "code": "651131",
  "sent_at": "2026-10-30T21:00:39.532279886Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/da790188-6420-43fe-ba50-b9d6742bd0cc/phone` → **422**

```json
{
  "command_id": "9b3b7c8b-a906-4115-95f4-13be7b2fee35",
  "expected_version": 3,
  "new_challenge_id": "e449fdc9-a299-43d1-b14f-9fe877022e87",
  "new_code": "651132",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/da790188-6420-43fe-ba50-b9d6742bd0cc/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "ca2c8f45-30da-4625-9c8c-b33473960fb1"
}
```

`POST /api/admin/v1/clients/da790188-6420-43fe-ba50-b9d6742bd0cc/phone` → **400**

```json
{
  "command_id": "4a0db237-487a-43ef-a929-e9d2d6d4fd14",
  "expected_version": 3,
  "new_challenge_id": "e449fdc9-a299-43d1-b14f-9fe877022e87",
  "new_code": "651131",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/da790188-6420-43fe-ba50-b9d6742bd0cc/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1a374c59-67bd-40a2-91e4-796736051031",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/da790188-6420-43fe-ba50-b9d6742bd0cc/phone` → **200**

```json
{
  "command_id": "3a95ca74-381f-43c7-a3e1-66445813348a",
  "expected_version": 3,
  "new_challenge_id": "e449fdc9-a299-43d1-b14f-9fe877022e87",
  "new_code": "651131",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "da790188-6420-43fe-ba50-b9d6742bd0cc",
  "phone": "+380636441686",
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
  "correlation_id": "bee3a738-606f-4a75-a2b7-3050f663785a"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636441686",
  "device_ref": "sandbox-16288"
}
```

```json
{
  "challenge_id": "48fdd968-0e10-41d2-adfe-ca38b40ca9c0",
  "expires_at": "2026-10-30T21:05:40.538930298Z",
  "resend_available_at": "2026-10-30T21:00:41.538930298Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636441686` → **200**

```json
{
  "phone": "+380636441686",
  "audience": "CLIENT",
  "code": "406481",
  "sent_at": "2026-10-30T21:00:40.541157123Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48fdd968-0e10-41d2-adfe-ca38b40ca9c0",
  "code": "406481",
  "device_ref": "sandbox-16288"
}
```

```json
{
  "session_id": "794286fc-b1dd-4b8f-96b8-cf1fef4cd893",
  "subject": {
    "type": "CLIENT",
    "id": "da790188-6420-43fe-ba50-b9d6742bd0cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTc5MDE4OC02NDIwLTQzZmUtYmE1MC1iOWQ2NzQyYmQwY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0OTQwLCJpYXQiOjE3OTMzOTQwNDAsImp0aSI6ImVmNTg4OGQ5LTdiN2MtNGI2YS04ZGQ1LTVmZmZkZjliNGNiZCIsInNpZCI6Ijc5NDI4NmZjLWIxZGQtNGI4Zi05NmI4LWNmMWZlZjRjZDg5MyJ9.UZ86ASnIS4sYhTFyHLzj00a7nK62oNhBRZUJGxPDEb8",
  "access_expires_at": "2026-10-30T21:15:40.756650707Z",
  "refresh_token": "MRbzGcmKIh4yH-xlj8PlMrzuHJvwyVEW3noIBviuth8",
  "refresh_expires_at": "2026-11-29T21:00:40.756256035Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "da790188-6420-43fe-ba50-b9d6742bd0cc",
  "session_id": "794286fc-b1dd-4b8f-96b8-cf1fef4cd893",
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
  "phone": "+380639200376",
  "device_ref": "sandbox-19837"
}
```

```json
{
  "challenge_id": "1b4a57bd-b5f2-4bd5-ad71-b89db75667ac",
  "expires_at": "2026-10-30T21:05:41.172871879Z",
  "resend_available_at": "2026-10-30T21:00:42.172871879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639200376` → **200**

```json
{
  "phone": "+380639200376",
  "audience": "CLIENT",
  "code": "597051",
  "sent_at": "2026-10-30T21:00:41.174875488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b4a57bd-b5f2-4bd5-ad71-b89db75667ac",
  "code": "597051",
  "device_ref": "sandbox-19837"
}
```

```json
{
  "session_id": "3972420c-014b-45d4-9dee-4efeec41d5fb",
  "subject": {
    "type": "CLIENT",
    "id": "830befcf-a750-46ac-8eea-36e1499703ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzBiZWZjZi1hNzUwLTQ2YWMtOGVlYS0zNmUxNDk5NzAzYWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0OTQxLCJpYXQiOjE3OTMzOTQwNDEsImp0aSI6ImVmY2QwMmM5LTlhN2UtNGMxZC04MWI1LTdjOWRlYjYzY2ZhMSIsInNpZCI6IjM5NzI0MjBjLTAxNGItNDVkNC05ZGVlLTRlZmVlYzQxZDVmYiJ9.xyHtfuC-HgrTr2Onvh8n34WrelJGASNsFzdfn1YFCII",
  "access_expires_at": "2026-10-30T21:15:41.39061352Z",
  "refresh_token": "qxh-w_quuqjG2-rWjLgJ0rXPDLYwwYRe-SwGLXnaX1Y",
  "refresh_expires_at": "2026-11-29T21:00:41.390227461Z",
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
  "session_id": "c54e6282-7e36-4183-9aa9-72bd070f4c51",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5NDIsImlhdCI6MTc5MzM5NDA0MiwianRpIjoiOWMxNjRiMzYtZjQ1NS00OTRjLWFmYWYtMzRjNjlmYmZmMWQ4Iiwic2lkIjoiYzU0ZTYyODItN2UzNi00MTgzLTlhYTktNzJiZDA3MGY0YzUxIn0.RNpOSc1V_Mu-wZ3roVZDYbAjnGG9n68pz3R1wYCy2O0",
  "access_expires_at": "2026-10-30T21:15:42.225255537Z",
  "refresh_token": "XwULH8OQmXXOIE6xn4f_JffE_5fauYqs-7GjR6e2Kn8",
  "refresh_expires_at": "2026-10-31T09:00:42.224893224Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639200376` → **200**

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
  "correlation_id": "eec40c8e-2b06-404a-9e05-0cb4ab97506a"
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
  "session_id": "bb6b1e17-daed-4a8c-a6d4-2bfaca4dd201",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5NDMsImlhdCI6MTc5MzM5NDA0MywianRpIjoiMDE0MGQ1YzAtZjNhMS00YmNjLTk4ZjAtOWRmOTViZGNhZTViIiwic2lkIjoiYmI2YjFlMTctZGFlZC00YThjLWE2ZDQtMmJmYWNhNGRkMjAxIn0.W3ez8Y9AJmXNJvpUviPnUmIib23GfQ-F4u6viq6_vzk",
  "access_expires_at": "2026-10-30T21:15:43.060661881Z",
  "refresh_token": "-T1CbTyCnl77pdzEf33ydn4LvlQ779TjKBZ3YQ9Tm-I",
  "refresh_expires_at": "2026-10-31T09:00:43.060253028Z",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T20:43:44.524047Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "4c758177-4b09-43e0-b300-f61cf154000c",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T21:00:43.457062764Z"
}
```

## The rider books the airport for 2026-10-31T00:00:42Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600193346",
  "device_ref": "sandbox-3983"
}
```

```json
{
  "challenge_id": "f9e3879f-7b1a-409e-af01-5c178468f954",
  "expires_at": "2026-10-30T21:05:43.664298071Z",
  "resend_available_at": "2026-10-30T21:00:44.664298071Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600193346` → **200**

```json
{
  "phone": "+48600193346",
  "audience": "CLIENT",
  "code": "599339",
  "sent_at": "2026-10-30T21:00:43.666063563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9e3879f-7b1a-409e-af01-5c178468f954",
  "code": "599339",
  "device_ref": "sandbox-3983"
}
```

```json
{
  "session_id": "9c6154ad-6269-4ee1-bc6b-5f23bce55149",
  "subject": {
    "type": "CLIENT",
    "id": "09183281-fbbc-4fdd-a018-00b8f4f2bdb7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTE4MzI4MS1mYmJjLTRmZGQtYTAxOC0wMGI4ZjRmMmJkYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0OTQzLCJpYXQiOjE3OTMzOTQwNDMsImp0aSI6ImRiMWYwMGZmLWY4YzQtNDJhOS05NWUwLWQ2MzQxZWIyNmVlNSIsInNpZCI6IjljNjE1NGFkLTYyNjktNGVlMS1iYzZiLTVmMjNiY2U1NTE0OSJ9.Nqf1YcpyonUNwDf_pFTrfeSFiy33zusGp_c0z1NAqIM",
  "access_expires_at": "2026-10-30T21:15:43.883703861Z",
  "refresh_token": "oARl2L6Jt9e0miNEsGBKlEHEHqxnwA5i6P5crNtQkTI",
  "refresh_expires_at": "2026-11-29T21:00:43.883313215Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c09fff5-c549-4067-b141-c56b594233d9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-31T00:00:42Z"
}
```

```json
{
  "id": "983b39a4-f86f-480f-8869-eec217a2f863",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:05:44.106638Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-31T00:00:42Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "43b27fb5-4f37-4cc2-83f1-1e78ce35195e",
  "quote_id": "983b39a4-f86f-480f-8869-eec217a2f863",
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
  "pickup_at": "2026-10-31T00:00:42Z"
}
```

```json
{
  "id": "882e3023-3c20-44b3-823e-82caf2d5160f",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "09183281-fbbc-4fdd-a018-00b8f4f2bdb7",
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
  "created_at": "2026-10-30T21:00:44.313944Z",
  "cancellation": null,
  "pickup_at": "2026-10-31T00:00:42Z",
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
  "device_ref": "sandbox-3177"
}
```

```json
{
  "challenge_id": "cbdd4291-2a99-45c0-8343-1eed7cb544b6",
  "expires_at": "2026-10-30T21:05:44.520405149Z",
  "resend_available_at": "2026-10-30T21:00:45.520405149Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "166513",
  "sent_at": "2026-10-30T21:00:44.522145569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbdd4291-2a99-45c0-8343-1eed7cb544b6",
  "code": "166513",
  "device_ref": "sandbox-3177"
}
```

```json
{
  "session_id": "0f2e4a1d-b423-4a75-a493-eb44c1047d5b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDk0NCwiaWF0IjoxNzkzMzk0MDQ0LCJqdGkiOiIyNjQ5YmUxMi04NDkxLTQ3NTEtOTJjZC0zMzBhYTUyZDk4ZmEiLCJzaWQiOiIwZjJlNGExZC1iNDIzLTRhNzUtYTQ5My1lYjQ0YzEwNDdkNWIifQ.ahHaezvz7ffyPeoX5R1nJwycW6sPBv3KnP49vRIASq8",
  "access_expires_at": "2026-10-30T21:15:44.737358998Z",
  "refresh_token": "vR3HuRCikZcLjeqylPGu2eV0BEST-2Pb1O-q96wExqI",
  "refresh_expires_at": "2026-11-29T21:00:44.736968727Z",
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
  "command_id": "3565a67d-e53a-4d13-9f77-6236b4be8bea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:00:45Z",
    "sequence": 1793394045135
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ef3fa698-0f27-4d48-a6e4-fd44e91df953",
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
  "last_heartbeat_at": "2026-10-30T21:00:45.150462Z",
  "last_location_at": "2026-10-30T21:00:45.150462Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "882e3023-3c20-44b3-823e-82caf2d5160f",
      "short_number": 34,
      "pickup_at": "2026-10-31T00:00:42Z",
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

`POST /api/driver/v1/preorders/882e3023-3c20-44b3-823e-82caf2d5160f/reserve` → **200**

```json
{
  "command_id": "20e3ede9-ba34-4b81-8f83-42a850a771e4"
}
```

```json
{
  "id": "ba3a0be1-5122-4c74-890c-eff8032493ac",
  "state": "RESERVED",
  "order": {
    "order_id": "882e3023-3c20-44b3-823e-82caf2d5160f",
    "short_number": 34,
    "pickup_at": "2026-10-31T00:00:42Z",
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
  "reserved_at": "2026-10-30T21:00:45.54739Z",
  "confirm_from": "2026-10-30T23:30:42Z",
  "confirm_until": "2026-10-30T23:40:42Z",
  "drop_until": "2026-10-30T23:00:42Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ba3a0be1-5122-4c74-890c-eff8032493ac",
      "state": "RESERVED",
      "order": {
        "order_id": "882e3023-3c20-44b3-823e-82caf2d5160f",
        "short_number": 34,
        "pickup_at": "2026-10-31T00:00:42Z",
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
      "reserved_at": "2026-10-30T21:00:45.54739Z",
      "confirm_from": "2026-10-30T23:30:42Z",
      "confirm_until": "2026-10-30T23:40:42Z",
      "drop_until": "2026-10-30T23:00:42Z"
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
      "id": "ba3a0be1-5122-4c74-890c-eff8032493ac",
      "state": "RESERVED",
      "order": {
        "order_id": "882e3023-3c20-44b3-823e-82caf2d5160f",
        "short_number": 34,
        "pickup_at": "2026-10-31T00:00:42Z",
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
      "reserved_at": "2026-10-30T21:00:45.54739Z",
      "confirm_from": "2026-10-30T23:30:42Z",
      "confirm_until": "2026-10-30T23:40:42Z",
      "drop_until": "2026-10-30T23:00:42Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ba3a0be1-5122-4c74-890c-eff8032493ac/confirm` → **409**

```json
{
  "command_id": "4f7c328e-f447-4d4f-9c9a-1d42095e113d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ba3a0be1-5122-4c74-890c-eff8032493ac/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d34b4925-99cd-4236-b556-53e6414bd8e7"
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
  "session_id": "6bc67e9f-08fc-4d18-9e45-7b27b498b0a9",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5NDYsImlhdCI6MTc5MzM5NDA0NiwianRpIjoiMzdiOWE1ZjYtMjIwMi00MTc3LTljZTMtYjVkMGMzOWRlYTM0Iiwic2lkIjoiNmJjNjdlOWYtMDhmYy00ZDE4LTllNDUtN2IyN2I0OThiMGE5In0.scb6F_bweST0OwjI8wKSqHgXgh339zpbYp17t3md-IE",
  "access_expires_at": "2026-10-30T21:15:46.527376393Z",
  "refresh_token": "WI9MMAWCcJ7Scg6gUC5g8V72SLHQbp7oiVHhoNbiyko",
  "refresh_expires_at": "2026-10-31T09:00:46.526930848Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/882e3023-3c20-44b3-823e-82caf2d5160f` → **200**

```json
{
  "id": "882e3023-3c20-44b3-823e-82caf2d5160f",
  "short_number": 34,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "09183281-fbbc-4fdd-a018-00b8f4f2bdb7",
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
  "created_at": "2026-10-30T21:00:44.313944Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-31T00:00:42Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ba3a0be1-5122-4c74-890c-eff8032493ac",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T21:00:45.54739Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/882e3023-3c20-44b3-823e-82caf2d5160f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T21:00:44.314741Z",
      "actor": {
        "type": "CLIENT",
        "id": "09183281-fbbc-4fdd-a018-00b8f4f2bdb7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "882e3023-3c20-44b3-823e-82caf2d5160f",
        "preorder": true,
        "quote_id": "983b39a4-f86f-480f-8869-eec217a2f863",
        "pickup_at": "2026-10-31T00:00:42Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "2ce7680d-59c3-4dd0-bd0b-b37ad678f9af"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T21:00:45.548527Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "882e3023-3c20-44b3-823e-82caf2d5160f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ba3a0be1-5122-4c74-890c-eff8032493ac"
      },
      "correlation_id": "e3ca296f-a3d7-4de7-9a78-f6ec179e5730"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 882e3023-3c20-44b3-823e-82caf2d5160f, reservation ba3a0be1-5122-4c74-890c-eff8032493ac.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15347"
}
```

```json
{
  "challenge_id": "55dd14d9-032d-4e19-b585-b50f880f144c",
  "expires_at": "2026-10-30T21:05:47.125630522Z",
  "resend_available_at": "2026-10-30T21:00:48.125630522Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "597085",
  "sent_at": "2026-10-30T21:00:47.127551029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55dd14d9-032d-4e19-b585-b50f880f144c",
  "code": "597085",
  "device_ref": "sandbox-15347"
}
```

```json
{
  "session_id": "f876d838-83a7-4ee5-87fb-f0b6fbcf61ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NDk0NywiaWF0IjoxNzkzMzk0MDQ3LCJqdGkiOiI5NGVjODk5OS0xNzkxLTRkZjgtOTEzOS1jZjJjNzUxMTI1MjUiLCJzaWQiOiJmODc2ZDgzOC04M2E3LTRlZTUtODdmYi1mMGI2ZmJjZjYxZWUifQ.k3zAgEtP8chwS9ApxqE3ONi9Mou4JULyVWrCpNmrogo",
  "access_expires_at": "2026-10-30T21:15:47.342392048Z",
  "refresh_token": "hM890jQVyaTXxSPNjP0VAt74qOcNYXPvcd-B4E_Hx8k",
  "refresh_expires_at": "2026-11-29T21:00:47.341969642Z",
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
  "command_id": "7ee260a4-d9dc-4394-8f93-7da35ea24263",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:00:47Z",
    "sequence": 1793394047752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "264d5a49-d5f3-4db2-890e-1a672e3fcfba",
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
  "last_heartbeat_at": "2026-10-30T21:00:47.767466Z",
  "last_location_at": "2026-10-30T21:00:47.767466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670794032",
  "device_ref": "sandbox-20350"
}
```

```json
{
  "challenge_id": "b4b8c1d3-5346-4ae2-9ce8-a9449ec08865",
  "expires_at": "2026-10-30T21:05:47.964991504Z",
  "resend_available_at": "2026-10-30T21:00:48.964991504Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670794032` → **200**

```json
{
  "phone": "+380670794032",
  "audience": "CLIENT",
  "code": "387988",
  "sent_at": "2026-10-30T21:00:47.966893183Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4b8c1d3-5346-4ae2-9ce8-a9449ec08865",
  "code": "387988",
  "device_ref": "sandbox-20350"
}
```

```json
{
  "session_id": "7050d42a-2aa8-47e1-a815-5cdc87c93299",
  "subject": {
    "type": "CLIENT",
    "id": "2a179104-9681-4d6b-87ba-411c6b2bb47f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTE3OTEwNC05NjgxLTRkNmItODdiYS00MTFjNmIyYmI0N2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk0OTQ4LCJpYXQiOjE3OTMzOTQwNDgsImp0aSI6IjU0NWUzYTFkLTBiNDMtNGEwYS04NGM0LTZjZDgwMjJmMmQ5YSIsInNpZCI6IjcwNTBkNDJhLTJhYTgtNDdlMS1hODE1LTVjZGM4N2M5MzI5OSJ9.nEuHSErhNkH2e6j_iGpFdvy0fRAXDQDx-I2sM8kSNZA",
  "access_expires_at": "2026-10-30T21:15:48.176496693Z",
  "refresh_token": "26i20_1Wfglq84NHJRITrzkf4yt8Kp785Wc2XNN1MGM",
  "refresh_expires_at": "2026-11-29T21:00:48.176139544Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba6efea3-6266-4578-9ca2-28c0a3c0183d",
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
  "id": "8306ae10-6960-4a21-8c3c-c0b7900011c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:05:48.380282Z",
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
  "command_id": "08df635a-9085-40b0-8e7a-ef4f6a8a826c",
  "quote_id": "8306ae10-6960-4a21-8c3c-c0b7900011c7",
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
  "id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a179104-9681-4d6b-87ba-411c6b2bb47f",
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
  "created_at": "2026-10-30T21:00:48.582494Z",
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
    "id": "698ea421-686c-4cf0-b053-61ed653db424",
    "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
    "expires_at": "2026-10-30T21:01:03.584715Z",
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

`POST /api/driver/v1/offers/698ea421-686c-4cf0-b053-61ed653db424/accept` → **200**

```json
{
  "command_id": "7877d1d4-78a8-4f5c-8235-2db422de89ef"
}
```

```json
{
  "id": "2454d383-c6af-4ad2-a7bc-6a11cb04084b",
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "77eb98ec-9c6c-4143-b4fb-912f3c311cf2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "77eb98ec-9c6c-4143-b4fb-912f3c311cf2",
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "assignment_id": "2454d383-c6af-4ad2-a7bc-6a11cb04084b",
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

`POST /api/driver/v1/work-sessions/264d5a49-d5f3-4db2-890e-1a672e3fcfba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:00:49Z",
    "sequence": 1793394049415
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "264d5a49-d5f3-4db2-890e-1a672e3fcfba",
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
  "last_heartbeat_at": "2026-10-30T21:00:49.430556Z",
  "last_location_at": "2026-10-30T21:00:49.430556Z",
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
  "id": "77eb98ec-9c6c-4143-b4fb-912f3c311cf2",
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "assignment_id": "2454d383-c6af-4ad2-a7bc-6a11cb04084b",
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

`POST /api/driver/v1/trips/77eb98ec-9c6c-4143-b4fb-912f3c311cf2/arrive` → **200**

```json
{
  "command_id": "90536132-00f9-429d-9b0d-a2940dae9e58",
  "expected_version": 0
}
```

```json
{
  "id": "77eb98ec-9c6c-4143-b4fb-912f3c311cf2",
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "assignment_id": "2454d383-c6af-4ad2-a7bc-6a11cb04084b",
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
  "arrived_at": "2026-10-30T21:00:49.840506Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/77eb98ec-9c6c-4143-b4fb-912f3c311cf2/start` → **200**

```json
{
  "command_id": "732ac6c0-dbd7-4875-8d56-bb5a356c7746",
  "expected_version": 1
}
```

```json
{
  "id": "77eb98ec-9c6c-4143-b4fb-912f3c311cf2",
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "assignment_id": "2454d383-c6af-4ad2-a7bc-6a11cb04084b",
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
  "arrived_at": "2026-10-30T21:00:49.840506Z",
  "started_at": "2026-10-30T21:00:50.036424Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/264d5a49-d5f3-4db2-890e-1a672e3fcfba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:01:38Z",
    "sequence": 1793394098248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "264d5a49-d5f3-4db2-890e-1a672e3fcfba",
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
  "last_heartbeat_at": "2026-10-30T21:01:38.263291Z",
  "last_location_at": "2026-10-30T21:01:38.263291Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/77eb98ec-9c6c-4143-b4fb-912f3c311cf2/complete` → **200**

```json
{
  "command_id": "6416fd4b-1b9b-4ded-9b17-4be1053d4c2e",
  "expected_version": 2,
  "reported_at": "2026-10-30T21:01:38Z",
  "cash_received": true
}
```

```json
{
  "id": "77eb98ec-9c6c-4143-b4fb-912f3c311cf2",
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "assignment_id": "2454d383-c6af-4ad2-a7bc-6a11cb04084b",
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
  "arrived_at": "2026-10-30T21:00:49.840506Z",
  "started_at": "2026-10-30T21:00:50.036424Z",
  "completed_at": "2026-10-30T21:01:38.462192Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/89f2866f-ceb0-4301-9740-fe9dc98e4265/rating` → **200**

```json
{
  "command_id": "bd1dd308-fa76-4e48-8172-7c712df564b6",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "score": 5,
  "created_at": "2026-10-30T21:01:38.666520778Z"
}
```

`POST /api/driver/v1/orders/89f2866f-ceb0-4301-9740-fe9dc98e4265/rating` → **200**

```json
{
  "command_id": "b9ab7e76-4e15-4a5a-9f08-716126975d9c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
  "score": 4,
  "created_at": "2026-10-30T21:01:38.862045724Z"
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
  "session_id": "cef98abc-766f-43a9-91b9-6966ce8930ad",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5OTksImlhdCI6MTc5MzM5NDA5OSwianRpIjoiNzQzZjNjZjYtOWQyYS00ZDY0LTg2NDMtZmEwNjZjYWI2MzVjIiwic2lkIjoiY2VmOThhYmMtNzY2Zi00M2E5LTkxYjktNjk2NmNlODkzMGFkIn0.d5UUV8v74cnT7ngoA7OHKGp9RDfb605LgHIcHOr47Vo",
  "access_expires_at": "2026-10-30T21:16:39.458471675Z",
  "refresh_token": "dITd7OluL7nt1jUQyCjUMnefAFVVWSTF9EGCRK9z_Xw",
  "refresh_expires_at": "2026-10-31T09:01:39.45811419Z",
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
  "session_id": "1654e74e-4eda-44b5-a94b-3f31f23bfec4",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTQ5OTksImlhdCI6MTc5MzM5NDA5OSwianRpIjoiMTBkZjUyYTItZDkzYi00NjhiLTlhOTAtOTIyN2Q2N2Y2MzkyIiwic2lkIjoiMTY1NGU3NGUtNGVkYS00NGI1LWE5NGItM2YzMWYyM2JmZWM0In0.ki1zfBSoRqot-wc9TAruOZFqo36Q_BTFT3N4gSZbC1o",
  "access_expires_at": "2026-10-30T21:16:39.853924364Z",
  "refresh_token": "DeJn3ZGDiBszt2T-UVUf8J8DdbsHsp2R_y0S-3_MXKo",
  "refresh_expires_at": "2026-10-31T09:01:39.853554901Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/89f2866f-ceb0-4301-9740-fe9dc98e4265/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
      "author_type": "RIDER",
      "author_id": "2a179104-9681-4d6b-87ba-411c6b2bb47f",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T21:01:38.666521Z"
    },
    {
      "order_id": "89f2866f-ceb0-4301-9740-fe9dc98e4265",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2a179104-9681-4d6b-87ba-411c6b2bb47f",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T21:01:38.862046Z"
    }
  ]
}
```

Done: ratings for order 89f2866f-ceb0-4301-9740-fe9dc98e4265.

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
  "session_id": "8210e96f-d21f-4c1e-bb66-f62b9ec0ae7c",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMDAsImlhdCI6MTc5MzM5NDEwMCwianRpIjoiNjMyNzA5ZjMtYjFhOS00NWU2LWE1ZDItYWU3MmYyODhiNzcyIiwic2lkIjoiODIxMGU5NmYtZDIxZi00YzFlLWJiNjYtZjYyYjllYzBhZTdjIn0.U38oCtP24_s4rfCw4WVqrijYbyrNtKkphRgtc5G1_sU",
  "access_expires_at": "2026-10-30T21:16:40.458275265Z",
  "refresh_token": "--SH-YJ9duMZaUcsh1Rw_FZZTW8htbuKHLH4kI7CYMo",
  "refresh_expires_at": "2026-10-31T09:01:40.4579113Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "18c9eae3-f453-4d36-a7b0-110fe48f0af4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "614028b1-545c-4832-943d-e38f87b84855",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:40.667863Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/614028b1-545c-4832-943d-e38f87b84855` → **200**

```json
{
  "id": "614028b1-545c-4832-943d-e38f87b84855",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:40.667863Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/614028b1-545c-4832-943d-e38f87b84855` → **200**

```json
{
  "id": "614028b1-545c-4832-943d-e38f87b84855",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:40.667863Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/614028b1-545c-4832-943d-e38f87b84855` → **200**

```json
{
  "id": "614028b1-545c-4832-943d-e38f87b84855",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T21:01:40.667863Z",
  "ready_at": "2026-10-30T21:01:42.728276Z",
  "expires_at": "2026-10-31T21:01:42.728276Z"
}
```

`GET /api/admin/v1/reports/exports/614028b1-545c-4832-943d-e38f87b84855/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,33,12,21,0,0,28,5,0,30,2,0,1,7,1,13
total,33,12,21,0,0,28,5,0,30,2,0,1,7,1,13
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "90765eeb-80e2-4115-85fe-3cde6bea7f58",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "d431f3d8-3c65-46c5-85d7-e8de162dcc2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:43.516115Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d431f3d8-3c65-46c5-85d7-e8de162dcc2c` → **200**

```json
{
  "id": "d431f3d8-3c65-46c5-85d7-e8de162dcc2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:43.516115Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d431f3d8-3c65-46c5-85d7-e8de162dcc2c` → **200**

```json
{
  "id": "d431f3d8-3c65-46c5-85d7-e8de162dcc2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:43.516115Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d431f3d8-3c65-46c5-85d7-e8de162dcc2c` → **200**

```json
{
  "id": "d431f3d8-3c65-46c5-85d7-e8de162dcc2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:43.516115Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d431f3d8-3c65-46c5-85d7-e8de162dcc2c` → **200**

```json
{
  "id": "d431f3d8-3c65-46c5-85d7-e8de162dcc2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T21:01:43.516115Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d431f3d8-3c65-46c5-85d7-e8de162dcc2c` → **200**

```json
{
  "id": "d431f3d8-3c65-46c5-85d7-e8de162dcc2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T21:01:43.516115Z",
  "ready_at": "2026-10-30T21:01:47.734833Z",
  "expires_at": "2026-10-31T21:01:47.734833Z"
}
```

`GET /api/admin/v1/reports/exports/d431f3d8-3c65-46c5-85d7-e8de162dcc2c/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
total,UAH,12,1655.51,130.74,248.37,1407.14,10.52,0.00,325.94,182.97,900.17,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9c8c523f-d947-4239-9d1c-f3f1bb8291a7` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9c8c523f-d947-4239-9d1c-f3f1bb8291a7",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1cb18e9a-2608-476b-8236-1269193a0c76"
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
  "session_id": "69e8beec-252e-4d86-9b9b-0a393a3e4b3e",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMDksImlhdCI6MTc5MzM5NDEwOSwianRpIjoiNTdlOWE0NDYtMGY1My00MjA0LWFlNWItMzZlYjNlOTY0Y2UzIiwic2lkIjoiNjllOGJlZWMtMjUyZS00ZDg2LTliOWItMGEzOTNhM2U0YjNlIn0.T6SEw2dLdyDKqWfvjbqRtEPQb06g67y1nbHHmCuFfos",
  "access_expires_at": "2026-10-30T21:16:49.188182752Z",
  "refresh_token": "Pi9G2_CK1e5EU_3GO5s7RAmDvs_8rS85hZo0XL9BGF4",
  "refresh_expires_at": "2026-10-31T09:01:49.187759679Z",
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
  "command_id": "817b818e-f868-4a62-87a3-f448fa48b515",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T21:01:49.598537005Z"
}
```

`POST /sandbox/v1/retention/fixtures/04065d76-5151-46b2-8466-1a6451c2952f` → **200**

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

`GET /sandbox/v1/retention/fixtures/04065d76-5151-46b2-8466-1a6451c2952f` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/04065d76-5151-46b2-8466-1a6451c2952f` → **204**

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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T21:01:49.598537Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "b1d42e4f-3e4f-409c-8be8-7c9f104e1eba",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T21:01:50.106334269Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3684"
}
```

```json
{
  "challenge_id": "5762ac71-12e3-44d8-966a-28d2044a63dc",
  "expires_at": "2026-10-30T21:06:50.314199265Z",
  "resend_available_at": "2026-10-30T21:01:51.314199265Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "431786",
  "sent_at": "2026-10-30T21:01:50.316712186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5762ac71-12e3-44d8-966a-28d2044a63dc",
  "code": "431786",
  "device_ref": "sandbox-3684"
}
```

```json
{
  "session_id": "a3122140-7b72-461a-a4b3-0baee3f9ebba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NTAxMCwiaWF0IjoxNzkzMzk0MTEwLCJqdGkiOiI3Y2ZmODU3ZC1lM2Q1LTQyOTItYjcxNS1hMTZhOWJmNTUxNTUiLCJzaWQiOiJhMzEyMjE0MC03YjcyLTQ2MWEtYTRiMy0wYmFlZTNmOWViYmEifQ.hF-3pzfd4kznx2viUjFS4ZHM2sAiucLkTR7H8uSGxqQ",
  "access_expires_at": "2026-10-30T21:16:50.539074427Z",
  "refresh_token": "B5stS0EGt3xqMHDRaQbrXncqrHnanFsCNabHZjXRrP0",
  "refresh_expires_at": "2026-11-29T21:01:50.538628903Z",
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
  "command_id": "6cab41c9-ce78-410e-984a-dc383157031e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:01:51Z",
    "sequence": 1793394111151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "285c6426-ce96-4431-9635-3a170281624e",
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
  "last_heartbeat_at": "2026-10-30T21:01:51.166362Z",
  "last_location_at": "2026-10-30T21:01:51.166362Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "da01cd89-9143-49e9-bab7-4f86cdb07e94",
  "points": [
    {
      "sequence": 1793394113369,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T21:00:53Z"
    },
    {
      "sequence": 1793394113376,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T21:01:53Z"
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
  "session_id": "9b57dc59-32d4-44dc-83f9-68ab75d09659",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMTMsImlhdCI6MTc5MzM5NDExMywianRpIjoiZDRhZDkwNjgtNmU4MC00OGZmLWIwMWItZWFkZmEwYWM3NjY1Iiwic2lkIjoiOWI1N2RjNTktMzJkNC00NGRjLTgzZjktNjhhYjc1ZDA5NjU5In0.61jUmtfqD3X0kMxU7-D2_-huMeCYeOxlaZWp7BxpQZE",
  "access_expires_at": "2026-10-30T21:16:53.851755253Z",
  "refresh_token": "8bQ4ZFSxY-PxyE4bmfscbRvFLzvbX0N4tFDZZ6SF80I",
  "refresh_expires_at": "2026-10-31T09:01:53.851341813Z",
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
      "id": "cabbd74c-d3a8-46b0-8fc8-a08d26d1a5e5",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T21:01:53Z",
        "track_point_id": "60c3b80c-ab56-462e-b0b4-2856f9478b8a",
        "work_session_id": "285c6426-ce96-4431-9635-3a170281624e"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T21:01:53Z",
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

`POST /api/admin/v1/driver-risk-flags/cabbd74c-d3a8-46b0-8fc8-a08d26d1a5e5/confirm` → **200**

```json
{
  "command_id": "454503fb-93b7-412f-8af1-a505c2d80d42",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "cabbd74c-d3a8-46b0-8fc8-a08d26d1a5e5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T21:01:53Z",
    "track_point_id": "60c3b80c-ab56-462e-b0b4-2856f9478b8a",
    "work_session_id": "285c6426-ce96-4431-9635-3a170281624e"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T21:01:53Z",
  "reason": null,
  "reviewed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reviewed_at": "2026-10-30T21:01:55.692731Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/cabbd74c-d3a8-46b0-8fc8-a08d26d1a5e5/dismiss` → **409**

```json
{
  "command_id": "e5eeabbc-9d03-4bf4-a88b-4d235073c23d",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/cabbd74c-d3a8-46b0-8fc8-a08d26d1a5e5/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "390f29d0-5a79-4a20-aa5a-0ae78b3d35f9"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "f1eed98f-929a-47c8-9ab8-328bfd04e8d5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "55e9ae77-ce46-492a-9f32-a3b9295e654c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "raised_at": "2026-10-30T21:01:56.106004Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/55e9ae77-ce46-492a-9f32-a3b9295e654c/dismiss` → **200**

```json
{
  "command_id": "c80168b3-b5a4-4740-bda5-fea374ec2aff",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "55e9ae77-ce46-492a-9f32-a3b9295e654c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "raised_at": "2026-10-30T21:01:56.106004Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reviewed_at": "2026-10-30T21:01:56.315287Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "781fab1d-bc10-41bd-a1d2-23956f5262f1",
  "expected_version": 15,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "cabbd74c-d3a8-46b0-8fc8-a08d26d1a5e5"
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
      "actor_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T21:01:56.536278Z"
    }
  ],
  "duplicates": []
}
```

Done: flag cabbd74c-d3a8-46b0-8fc8-a08d26d1a5e5 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "00b41bc0-40c6-4712-b296-01170f13b67c",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMTcsImlhdCI6MTc5MzM5NDExNywianRpIjoiZDA5YWM2N2UtNWQ5MS00YTJiLWE2MmMtMTJiZTI0MWVjZjVhIiwic2lkIjoiMDBiNDFiYzAtNDBjNi00NzEyLWIyOTYtMDExNzBmMTNiNjdjIn0.wUeGrLr1nATeLLYDg6Jksc3jMhwu7ZIiQDjXPbey-98",
  "access_expires_at": "2026-10-30T21:16:57.161720895Z",
  "refresh_token": "vtVdqF_hOMLNRP9XjQBTufNPaEPthoF19WrVnzK7Ib4",
  "refresh_expires_at": "2026-10-31T09:01:57.161251742Z",
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
      "actor_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T21:01:56.536278Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "23cbe0d7-1251-4774-849d-c228be223d4c",
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
  "session_id": "285c6426-ce96-4431-9635-3a170281624e",
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
  "last_heartbeat_at": "2026-10-30T21:01:51.166362Z",
  "last_location_at": "2026-10-30T21:01:51.166362Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/285c6426-ce96-4431-9635-3a170281624e/close` → **200**

```json
{
  "command_id": "6c2f233a-69c0-49f9-bcae-d124b0407dca",
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
  "session_id": "c80999db-38e8-49e0-993e-27a1ab241ba5",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMTgsImlhdCI6MTc5MzM5NDExOCwianRpIjoiYzU1Yjc4MzYtYWJjMC00MmRjLTkzNjktZjBiODljYTZiMmVlIiwic2lkIjoiYzgwOTk5ZGItMzhlOC00OWUwLTk5M2UtMjdhMWFiMjQxYmE1In0.8Buxe3ZoD0jzTS1TSU3v9UHzZicow0Lt2FYJiKZPmqk",
  "access_expires_at": "2026-10-30T21:16:58.406911836Z",
  "refresh_token": "H_Cz0P1MIuUuGjKG3D5V6k79pQYVaQVHTl8LXW006pc",
  "refresh_expires_at": "2026-10-31T09:01:58.406522493Z",
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
  "command_id": "b966e9b4-a2cf-442b-b8df-b43713639857",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T21:01:58.817092Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "b966e9b4-a2cf-442b-b8df-b43713639857",
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
  "changed_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T21:01:58.817092Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48368523902",
  "device_ref": "sandbox-28573"
}
```

```json
{
  "challenge_id": "686cf407-99ea-48d0-8652-2bbe36122ea0",
  "expires_at": "2026-10-30T21:06:59.241790322Z",
  "resend_available_at": "2026-10-30T21:02:00.241790322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48368523902` → **200**

```json
{
  "phone": "+48368523902",
  "audience": "CLIENT",
  "code": "495396",
  "sent_at": "2026-10-30T21:01:59.244540004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "686cf407-99ea-48d0-8652-2bbe36122ea0",
  "code": "495396",
  "device_ref": "sandbox-28573"
}
```

```json
{
  "session_id": "4ffea55b-82fc-4528-b807-fe798f7cf334",
  "subject": {
    "type": "CLIENT",
    "id": "dc17e556-f3ca-4929-8a44-47dc745a99f3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzE3ZTU1Ni1mM2NhLTQ5MjktOGE0NC00N2RjNzQ1YTk5ZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk1MDE5LCJpYXQiOjE3OTMzOTQxMTksImp0aSI6IjEzMGI2YTE0LWU0MTgtNDc2NS05ODRiLTYxMDNjYTQ1NjE4YiIsInNpZCI6IjRmZmVhNTViLTgyZmMtNDUyOC1iODA3LWZlNzk4ZjdjZjMzNCJ9.gDhCerTYF29tVnLXR4iC9fxSY1YPQDBM96mOg2WuG_U",
  "access_expires_at": "2026-10-30T21:16:59.476518505Z",
  "refresh_token": "W4aD8k8yOd1ME2xMtnHjIgVv5MbILEpUAK78TVsKRJ0",
  "refresh_expires_at": "2026-11-29T21:01:59.47618786Z",
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
  "correlation_id": "b16f5053-de58-428c-b6ad-dcf6555763b9"
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
  "device_ref": "sandbox-23401"
}
```

```json
{
  "challenge_id": "ca9f68b7-3c59-478d-a5ac-8be5b8350416",
  "expires_at": "2026-10-30T21:07:00.069280401Z",
  "resend_available_at": "2026-10-30T21:02:01.069280401Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "271406",
  "sent_at": "2026-10-30T21:02:00.071185643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca9f68b7-3c59-478d-a5ac-8be5b8350416",
  "code": "271406",
  "device_ref": "sandbox-23401"
}
```

```json
{
  "session_id": "f0bfca7f-7ad7-4c0b-8196-b9df2706a6dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NTAyMCwiaWF0IjoxNzkzMzk0MTIwLCJqdGkiOiJmNTNjMDhhOS1hZmI0LTQyMmYtYWJlMS1lOTFiMjVjZjkyMmEiLCJzaWQiOiJmMGJmY2E3Zi03YWQ3LTRjMGItODE5Ni1iOWRmMjcwNmE2ZGQifQ.a8r7OWswPALKQx6Nd62ZWZYuJNKG-lnyQ7ZjDViTAh8",
  "access_expires_at": "2026-10-30T21:17:00.286692177Z",
  "refresh_token": "mVftzCcu8Nggk6lSeRIHH-vZ4LkI5UrTaTti6uRA8HA",
  "refresh_expires_at": "2026-11-29T21:02:00.286315112Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ef3fa698-0f27-4d48-a6e4-fd44e91df953",
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
  "last_heartbeat_at": "2026-10-30T21:00:45.150462Z",
  "last_location_at": "2026-10-30T21:00:45.150462Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ef3fa698-0f27-4d48-a6e4-fd44e91df953/handover` → **200**

```json
{
  "command_id": "a374050e-8a02-4824-af71-cb9bc0476f66",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ef3fa698-0f27-4d48-a6e4-fd44e91df953",
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
  "last_heartbeat_at": "2026-10-30T21:00:45.150462Z",
  "last_location_at": "2026-10-30T21:00:45.150462Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ef3fa698-0f27-4d48-a6e4-fd44e91df953/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:02:00Z",
    "sequence": 1793394120899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ef3fa698-0f27-4d48-a6e4-fd44e91df953",
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
  "last_heartbeat_at": "2026-10-30T21:02:00.915009Z",
  "last_location_at": "2026-10-30T21:02:00.915009Z",
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
  "session_id": "ef3fa698-0f27-4d48-a6e4-fd44e91df953",
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
  "last_heartbeat_at": "2026-10-30T21:02:00.915009Z",
  "last_location_at": "2026-10-30T21:02:00.915009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ef3fa698-0f27-4d48-a6e4-fd44e91df953/close` → **200**

```json
{
  "command_id": "04eee4a3-a214-47c9-a2f2-f5821467fdb9",
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
  "correlation_id": "6ea1a4d3-410c-4840-b07a-a6e00f0620e1"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674400221",
  "device_ref": "sandbox-1045"
}
```

```json
{
  "challenge_id": "569f85b0-6597-4552-b9e9-770012ee8d01",
  "expires_at": "2026-10-30T21:07:01.946411223Z",
  "resend_available_at": "2026-10-30T21:02:02.946411223Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674400221` → **200**

```json
{
  "phone": "+380674400221",
  "audience": "CLIENT",
  "code": "263870",
  "sent_at": "2026-10-30T21:02:01.948483816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "569f85b0-6597-4552-b9e9-770012ee8d01",
  "code": "263870",
  "device_ref": "sandbox-1045"
}
```

```json
{
  "session_id": "fe44a70d-3d63-41cb-86bc-0c6b7da68f2d",
  "subject": {
    "type": "CLIENT",
    "id": "e3578037-d162-48c9-870a-3e43d2f3c0e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzU3ODAzNy1kMTYyLTQ4YzktODcwYS0zZTQzZDJmM2MwZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk1MDIyLCJpYXQiOjE3OTMzOTQxMjIsImp0aSI6ImJhN2JiZWI5LWZkOWUtNDM4ZS04ZmQ2LTIzMzRjM2Y4NTY5NiIsInNpZCI6ImZlNDRhNzBkLTNkNjMtNDFjYi04NmJjLTBjNmI3ZGE2OGYyZCJ9.F1feAWb99f7vkinbo205lry1XSA6pNniTQlwqBU4yOI",
  "access_expires_at": "2026-10-30T21:17:02.206974549Z",
  "refresh_token": "VbcwJN1Fo_NdMPWLFQDxx01tBt-GSZnzScYSZSEwaog",
  "refresh_expires_at": "2026-11-29T21:02:02.206494901Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "a4689f1b-de40-4c11-9465-2a59ff935b24",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "1aa02ad1-0f74-4488-b017-26d24be902d3",
  "upload_path": "/api/rider/v1/uploads/1aa02ad1-0f74-4488-b017-26d24be902d3",
  "expires_at": "2026-10-30T21:17:02.422662236Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/1aa02ad1-0f74-4488-b017-26d24be902d3` → **200**

```json
{
  "file_id": "1aa02ad1-0f74-4488-b017-26d24be902d3",
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
  "command_id": "b322378f-6144-48de-9cc9-1347d7532117",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "ea496ef8-669c-4307-88a3-d3a975613178",
  "upload_path": "/api/rider/v1/uploads/ea496ef8-669c-4307-88a3-d3a975613178",
  "expires_at": "2026-10-30T21:17:02.658793007Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/ea496ef8-669c-4307-88a3-d3a975613178` → **200**

```json
{
  "file_id": "ea496ef8-669c-4307-88a3-d3a975613178",
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
  "command_id": "458fa8a9-2086-4116-9731-cceee7ef2438",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "deb4c179-7a85-4dec-aaf5-d0443748b6c2",
  "upload_path": "/api/rider/v1/uploads/deb4c179-7a85-4dec-aaf5-d0443748b6c2",
  "expires_at": "2026-10-30T21:17:02.881715892Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/deb4c179-7a85-4dec-aaf5-d0443748b6c2` → **200**

```json
{
  "file_id": "deb4c179-7a85-4dec-aaf5-d0443748b6c2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "5938b2ec-d8fd-476a-b427-1bcc1b54596a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "deb4c179-7a85-4dec-aaf5-d0443748b6c2"
  ]
}
```

```json
{
  "id": "ec5a8b5e-756b-4c6d-bd75-270fe62ecef5",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T21:02:03.105906Z",
  "updated_at": "2026-10-30T21:02:03.105906Z",
  "respond_by": "2026-10-31T01:02:03.105906Z",
  "messages": [
    {
      "id": "06507378-807b-4a7a-b855-79d06e3c4fca",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T21:02:03.106476Z",
      "attachments": [
        {
          "file_id": "deb4c179-7a85-4dec-aaf5-d0443748b6c2",
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
  "session_id": "254520dd-1c52-4d06-953f-e999dff68ff8",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMjMsImlhdCI6MTc5MzM5NDEyMywianRpIjoiM2FjN2NmZTQtNTM2Mi00ZmZhLThhZjUtZWRkZjhlZmQ5NjZiIiwic2lkIjoiMjU0NTIwZGQtMWM1Mi00ZDA2LTk1M2YtZTk5OWRmZjY4ZmY4In0.m1mgpjFlQ069jLAVQE-LaVSAFYzZut7XLAJmx5QSGB0",
  "access_expires_at": "2026-10-30T21:17:03.523523463Z",
  "refresh_token": "vnmM44u-rO1cul8nR670lHCG7GLHIZDjbBC8Uq_NjXY",
  "refresh_expires_at": "2026-10-31T09:02:03.52304052Z",
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
  "session_id": "b9259f65-f0ff-4d9c-ae2b-adc68f00cb64",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMjMsImlhdCI6MTc5MzM5NDEyMywianRpIjoiMmUwMDYxZTgtN2NlMS00ZTQwLTgyOTctYzM0YjQwYjA2MTNlIiwic2lkIjoiYjkyNTlmNjUtZjBmZi00ZDljLWFlMmItYWRjNjhmMDBjYjY0In0.aH40KrKDE9pflFgUoH86cXKFk283WtzDXMkGLKXqwYo",
  "access_expires_at": "2026-10-30T21:17:03.925660631Z",
  "refresh_token": "JDx-y-DS38HYSdBrsMUo8kxt1yjkL88DfuRl-tZrm8A",
  "refresh_expires_at": "2026-10-31T09:02:03.925243246Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/ec5a8b5e-756b-4c6d-bd75-270fe62ecef5/attachments/deb4c179-7a85-4dec-aaf5-d0443748b6c2` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "f43d6832-72a4-4f02-af58-6d7af41584e3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2f29fcdf-7370-4372-b7a2-8738e416d011",
  "upload_path": "/api/operator/v1/uploads/2f29fcdf-7370-4372-b7a2-8738e416d011",
  "expires_at": "2026-10-30T21:17:04.141819942Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/2f29fcdf-7370-4372-b7a2-8738e416d011` → **200**

```json
{
  "file_id": "2f29fcdf-7370-4372-b7a2-8738e416d011",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/ec5a8b5e-756b-4c6d-bd75-270fe62ecef5` → **200**

```json
{
  "id": "ec5a8b5e-756b-4c6d-bd75-270fe62ecef5",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T21:02:03.105906Z",
  "updated_at": "2026-10-30T21:02:03.105906Z",
  "respond_by": "2026-10-31T01:02:03.105906Z",
  "messages": [
    {
      "id": "06507378-807b-4a7a-b855-79d06e3c4fca",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T21:02:03.106476Z",
      "attachments": [
        {
          "file_id": "deb4c179-7a85-4dec-aaf5-d0443748b6c2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/ec5a8b5e-756b-4c6d-bd75-270fe62ecef5/comments` → **200**

```json
{
  "command_id": "b6e8462e-58b8-465a-aa5b-f922669949de",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "2f29fcdf-7370-4372-b7a2-8738e416d011"
  ]
}
```

```json
{
  "id": "ec5a8b5e-756b-4c6d-bd75-270fe62ecef5",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T21:02:03.105906Z",
  "updated_at": "2026-10-30T21:02:04.610394Z",
  "respond_by": "2026-10-31T01:02:03.105906Z",
  "messages": [
    {
      "id": "06507378-807b-4a7a-b855-79d06e3c4fca",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T21:02:03.106476Z",
      "attachments": [
        {
          "file_id": "deb4c179-7a85-4dec-aaf5-d0443748b6c2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b6403a05-3c55-4125-b6a4-8cd4f5660a61",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T21:02:04.610054Z",
      "attachments": [
        {
          "file_id": "2f29fcdf-7370-4372-b7a2-8738e416d011",
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

`GET /api/rider/v1/support/cases/ec5a8b5e-756b-4c6d-bd75-270fe62ecef5` → **200**

```json
{
  "id": "ec5a8b5e-756b-4c6d-bd75-270fe62ecef5",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T21:02:03.105906Z",
  "updated_at": "2026-10-30T21:02:04.610394Z",
  "respond_by": "2026-10-31T01:02:03.105906Z",
  "messages": [
    {
      "id": "06507378-807b-4a7a-b855-79d06e3c4fca",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3578037-d162-48c9-870a-3e43d2f3c0e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T21:02:03.106476Z",
      "attachments": [
        {
          "file_id": "deb4c179-7a85-4dec-aaf5-d0443748b6c2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b6403a05-3c55-4125-b6a4-8cd4f5660a61",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T21:02:04.610054Z",
      "attachments": [
        {
          "file_id": "2f29fcdf-7370-4372-b7a2-8738e416d011",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/ec5a8b5e-756b-4c6d-bd75-270fe62ecef5/attachments/2f29fcdf-7370-4372-b7a2-8738e416d011` → **200**

Done: support case ec5a8b5e-756b-4c6d-bd75-270fe62ecef5, rider attachment deb4c179-7a85-4dec-aaf5-d0443748b6c2, operator attachment 2f29fcdf-7370-4372-b7a2-8738e416d011.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732235621",
  "device_ref": "sandbox-14585"
}
```

```json
{
  "challenge_id": "39d916d4-d3a0-4f10-92a7-108ae7e91352",
  "expires_at": "2026-10-30T21:07:05.062170578Z",
  "resend_available_at": "2026-10-30T21:02:06.062170578Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732235621` → **200**

```json
{
  "phone": "+380732235621",
  "audience": "CLIENT",
  "code": "314049",
  "sent_at": "2026-10-30T21:02:05.064260247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39d916d4-d3a0-4f10-92a7-108ae7e91352",
  "code": "314049",
  "device_ref": "sandbox-14585"
}
```

```json
{
  "session_id": "184dffd2-11ea-4331-8f42-be4e9dcdf376",
  "subject": {
    "type": "CLIENT",
    "id": "fb125a6f-a92e-40b8-8528-32e3cdc20649"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjEyNWE2Zi1hOTJlLTQwYjgtODUyOC0zMmUzY2RjMjA2NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk1MDI1LCJpYXQiOjE3OTMzOTQxMjUsImp0aSI6IjM1ZjA3MjhmLTM3ZTQtNGRmMy05NDAzLWQ4M2Y2MDk3ZTkzNSIsInNpZCI6IjE4NGRmZmQyLTExZWEtNDMzMS04ZjQyLWJlNGU5ZGNkZjM3NiJ9.U9t-En6QswFddwszZHUYib8Oub-kFrEWPdCOOIB-VzU",
  "access_expires_at": "2026-10-30T21:17:05.293787011Z",
  "refresh_token": "TH9AykNYNXpZLTnLtOgFkmd81Dg7jRxyfewj-p7fx8c",
  "refresh_expires_at": "2026-11-29T21:02:05.293407052Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c6f9eaee-61d1-4e32-999b-e1bfb3c8a440",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "77adc351-c7eb-4658-bfe8-b52bfa6b743e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-77adc351-c7eb-4658-bfe8-b52bfa6b743e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a431ce73ea2327b85f35abe17b3c5257",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=77adc351-c7eb-4658-bfe8-b52bfa6b743e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732235621"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=77adc351-c7eb-4658-bfe8-b52bfa6b743e",
  "expires_at": "2026-10-30T21:32:05.501246Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/77adc351-c7eb-4658-bfe8-b52bfa6b743e` → **200**

```json
{
  "id": "77adc351-c7eb-4658-bfe8-b52bfa6b743e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T21:32:05.501246Z",
  "card": {
    "id": "88173775-9501-40fd-9d57-9e8c945ce4d1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2114",
    "card_type": "Visa",
    "created_at": "2026-10-30T21:02:05.707507Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b58039fe-d11e-4465-a732-84bc3dbe7c0a",
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
  "id": "0b882201-4d43-4f6e-993d-0db3a1caa8d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:07:05.931855Z",
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
  "command_id": "c60a6baa-e423-4135-b98f-aec16395f828",
  "quote_id": "0b882201-4d43-4f6e-993d-0db3a1caa8d9",
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
  "id": "d67d65dd-da36-4832-933c-c9c263c69e1a",
  "short_number": 36,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fb125a6f-a92e-40b8-8528-32e3cdc20649",
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
  "created_at": "2026-10-30T21:02:06.155922Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a` → **200**

```json
{
  "id": "d67d65dd-da36-4832-933c-c9c263c69e1a",
  "short_number": 36,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fb125a6f-a92e-40b8-8528-32e3cdc20649",
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
  "created_at": "2026-10-30T21:02:06.155922Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a` → **200**

```json
{
  "id": "d67d65dd-da36-4832-933c-c9c263c69e1a",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fb125a6f-a92e-40b8-8528-32e3cdc20649",
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
  "created_at": "2026-10-30T21:02:06.155922Z",
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

`GET /api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a` → **200**

```json
{
  "id": "d67d65dd-da36-4832-933c-c9c263c69e1a",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fb125a6f-a92e-40b8-8528-32e3cdc20649",
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
  "created_at": "2026-10-30T21:02:06.155922Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a/switch-to-cash` → **200**

```json
{
  "command_id": "d4c4d9c0-0016-40b4-9dcd-b90fba623480",
  "expected_version": 3
}
```

```json
{
  "id": "d67d65dd-da36-4832-933c-c9c263c69e1a",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fb125a6f-a92e-40b8-8528-32e3cdc20649",
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
  "created_at": "2026-10-30T21:02:06.155922Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a/switch-to-cash` → **409**

```json
{
  "command_id": "4788b8b8-3da2-4334-b08f-7e4cb46db410",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "601ba166-932a-481a-9cee-2594081c160a"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a` → **200**

```json
{
  "id": "d67d65dd-da36-4832-933c-c9c263c69e1a",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fb125a6f-a92e-40b8-8528-32e3cdc20649",
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
  "created_at": "2026-10-30T21:02:06.155922Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d67d65dd-da36-4832-933c-c9c263c69e1a/cancel` → **200**

```json
{
  "command_id": "aff971b1-c8ec-446c-9474-0ad1a80df8bd",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d67d65dd-da36-4832-933c-c9c263c69e1a",
  "short_number": 36,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "fb125a6f-a92e-40b8-8528-32e3cdc20649",
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
  "created_at": "2026-10-30T21:02:06.155922Z",
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
  "session_id": "0b200957-c9f7-4e21-863f-549e484ec436",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwMjksImlhdCI6MTc5MzM5NDEyOSwianRpIjoiODAyNjJmYTYtZTZiYi00NzlhLWI3YzgtODMyZjU1YjE0MzZjIiwic2lkIjoiMGIyMDA5NTctYzlmNy00ZTIxLTg2M2YtNTQ5ZTQ4NGVjNDM2In0.riJmj4GwfOs1VF2RlD5DB9aLwrzv9p2cple8jRyyvPc",
  "access_expires_at": "2026-10-30T21:17:09.152524664Z",
  "refresh_token": "q3HDx0XTNUIUPyr7jIwRSF4MH_l4wgSQDUKdbaMCByw",
  "refresh_expires_at": "2026-10-31T09:02:09.152071755Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2889"
}
```

```json
{
  "challenge_id": "374031d8-e204-4a97-a1ed-ae001cec3a8c",
  "expires_at": "2026-10-30T21:07:09.350137544Z",
  "resend_available_at": "2026-10-30T21:02:10.350137544Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "236706",
  "sent_at": "2026-10-30T21:02:09.351894555Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "374031d8-e204-4a97-a1ed-ae001cec3a8c",
  "code": "236706",
  "device_ref": "sandbox-2889"
}
```

```json
{
  "session_id": "a8f9c476-612f-4f5a-affc-62c217172330",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NTAyOSwiaWF0IjoxNzkzMzk0MTI5LCJqdGkiOiIzZWRiZDBmNy00NWU4LTQxMmEtYjVjOC00MDZmMWE0ZjRhNWUiLCJzaWQiOiJhOGY5YzQ3Ni02MTJmLTRmNWEtYWZmYy02MmMyMTcxNzIzMzAifQ.JAYcgn6yjGv2SOpkXSe4M1XRJ_Vid13iHNB09tQcDzU",
  "access_expires_at": "2026-10-30T21:17:09.644931124Z",
  "refresh_token": "opRzDALVbETFakHGgH5ke6AE_VCrnNjmIZp5IpJjNqI",
  "refresh_expires_at": "2026-11-29T21:02:09.644428126Z",
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
      "actor_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T21:01:56.536278Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T21:01:57.57457Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "322b23d5-5f7f-45e1-a060-65ec2bbb9b2f",
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
  "device_ref": "sandbox-14011"
}
```

```json
{
  "challenge_id": "88bcfe48-16d7-414a-8248-f26051c5bb02",
  "expires_at": "2026-10-30T21:07:10.510770559Z",
  "resend_available_at": "2026-10-30T21:02:11.510770559Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "496727",
  "sent_at": "2026-10-30T21:02:10.512852851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88bcfe48-16d7-414a-8248-f26051c5bb02",
  "code": "496727",
  "device_ref": "sandbox-14011"
}
```

```json
{
  "session_id": "bb2bed51-a755-42d7-ab08-b8c24082cfee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NTAzMCwiaWF0IjoxNzkzMzk0MTMwLCJqdGkiOiJkNGFkZTdjYy1iNWE5LTQyOWQtYTlhZS1iMGU5ZWNiMTU2OGIiLCJzaWQiOiJiYjJiZWQ1MS1hNzU1LTQyZDctYWIwOC1iOGMyNDA4MmNmZWUifQ.LeBbieHz9lpZNMhI2SSt_FVR-Ri9oJQJmlf-bu-R4yI",
  "access_expires_at": "2026-10-30T21:17:10.73237209Z",
  "refresh_token": "9ErvLeWp0xB9jT-lQkgyYm0O9f7RXNS6PLkrBygaJaQ",
  "refresh_expires_at": "2026-11-29T21:02:10.731949827Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "264d5a49-d5f3-4db2-890e-1a672e3fcfba",
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
  "last_heartbeat_at": "2026-10-30T21:01:38.263291Z",
  "last_location_at": "2026-10-30T21:01:38.263291Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/264d5a49-d5f3-4db2-890e-1a672e3fcfba/handover` → **200**

```json
{
  "command_id": "375b9acb-bd30-419d-9563-66930d0e45ff",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "264d5a49-d5f3-4db2-890e-1a672e3fcfba",
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
  "last_heartbeat_at": "2026-10-30T21:01:38.263291Z",
  "last_location_at": "2026-10-30T21:01:38.263291Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 16 s to the next point)

`POST /api/driver/v1/work-sessions/264d5a49-d5f3-4db2-890e-1a672e3fcfba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:02:27Z",
    "sequence": 1793394147391
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "264d5a49-d5f3-4db2-890e-1a672e3fcfba",
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
  "last_heartbeat_at": "2026-10-30T21:02:27.407187Z",
  "last_location_at": "2026-10-30T21:02:27.407187Z",
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
  "command_id": "a401ba73-8cf4-464c-9581-d8324a8f858d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:02:27Z",
    "sequence": 1793394147838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d1450b7b-9ceb-4425-bbba-61078ec07610",
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
  "last_heartbeat_at": "2026-10-30T21:02:27.854565Z",
  "last_location_at": "2026-10-30T21:02:27.854565Z",
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
  "session_id": "d0d00e67-9496-49f9-9aca-3e160a88f688",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUwNDgsImlhdCI6MTc5MzM5NDE0OCwianRpIjoiMTgyYjNkNzMtMzA0OS00NzFlLTlmYzItYzFhOGI4Y2E3ZmI4Iiwic2lkIjoiZDBkMDBlNjctOTQ5Ni00OWY5LTlhY2EtM2UxNjBhODhmNjg4In0.d9BZVAm4HLJXUXAVTMop-nIHTfv7nuYlE6i4yGeUcp8",
  "access_expires_at": "2026-10-30T21:17:28.272825998Z",
  "refresh_token": "yrPHe5KwdqjEuG2bFtjMhktG-Kv7u60j-Ck3yQMwQyI",
  "refresh_expires_at": "2026-10-31T09:02:28.272433651Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "211c3a59-c002-4987-b683-264b526fa46b",
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
  "id": "ec32ad21-8b59-4688-9d67-a650f2a92660",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:07:28.479695Z",
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
  "command_id": "bf895e05-11cf-4ba8-8d61-eea22d07f238",
  "quote_id": "ec32ad21-8b59-4688-9d67-a650f2a92660",
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
  "id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
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
  "created_at": "2026-10-30T21:02:28.695002Z",
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
    "id": "250d9f76-a00b-42a6-9e92-a9da9f22a93b",
    "order_id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
    "expires_at": "2026-10-30T21:02:43.69797Z",
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

`POST /api/driver/v1/offers/250d9f76-a00b-42a6-9e92-a9da9f22a93b/accept` → **200**

```json
{
  "command_id": "278ceb88-e549-426c-bb69-ccbc985fcbd2"
}
```

```json
{
  "id": "07a601d8-6550-4497-93d9-44d2f0259d48",
  "order_id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5f151b63-ee4f-41ff-a01c-d7c6640d00a8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5f151b63-ee4f-41ff-a01c-d7c6640d00a8",
  "order_id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
  "assignment_id": "07a601d8-6550-4497-93d9-44d2f0259d48",
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

`POST /api/driver/v1/work-sessions/d1450b7b-9ceb-4425-bbba-61078ec07610/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T21:02:39Z",
    "sequence": 1793394159823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d1450b7b-9ceb-4425-bbba-61078ec07610",
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
  "last_heartbeat_at": "2026-10-30T21:02:39.839263Z",
  "last_location_at": "2026-10-30T21:02:39.839263Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5f151b63-ee4f-41ff-a01c-d7c6640d00a8/arrive` → **200**

```json
{
  "command_id": "99e3299e-3915-462c-9d2b-e7759d2910a8",
  "expected_version": 0
}
```

```json
{
  "id": "5f151b63-ee4f-41ff-a01c-d7c6640d00a8",
  "order_id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
  "assignment_id": "07a601d8-6550-4497-93d9-44d2f0259d48",
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
  "arrived_at": "2026-10-30T21:02:40.050514Z",
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

`POST /api/driver/v1/trips/5f151b63-ee4f-41ff-a01c-d7c6640d00a8/start` → **200**

```json
{
  "command_id": "24ea5bea-3247-42f3-9bd1-3dd538a1735b",
  "expected_version": 1
}
```

```json
{
  "id": "5f151b63-ee4f-41ff-a01c-d7c6640d00a8",
  "order_id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
  "assignment_id": "07a601d8-6550-4497-93d9-44d2f0259d48",
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
  "arrived_at": "2026-10-30T21:02:40.050514Z",
  "started_at": "2026-10-30T21:02:40.266901Z",
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

`POST /api/driver/v1/trips/5f151b63-ee4f-41ff-a01c-d7c6640d00a8/complete` → **200**

```json
{
  "command_id": "b054de4d-a2b8-4850-9699-b900bb48961d",
  "expected_version": 2,
  "reported_at": "2026-10-30T21:02:40Z",
  "cash_received": true
}
```

```json
{
  "id": "5f151b63-ee4f-41ff-a01c-d7c6640d00a8",
  "order_id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
  "assignment_id": "07a601d8-6550-4497-93d9-44d2f0259d48",
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
  "arrived_at": "2026-10-30T21:02:40.050514Z",
  "started_at": "2026-10-30T21:02:40.266901Z",
  "completed_at": "2026-10-30T21:02:40.48015Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/4b0c3d10-2272-4edf-a15a-7acd0d187313` → **200**

```json
{
  "id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
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
    "id": "07a601d8-6550-4497-93d9-44d2f0259d48",
    "order_id": "4b0c3d10-2272-4edf-a15a-7acd0d187313",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5f151b63-ee4f-41ff-a01c-d7c6640d00a8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T21:02:28.695002Z",
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
  "session_id": "264d5a49-d5f3-4db2-890e-1a672e3fcfba",
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
  "last_heartbeat_at": "2026-10-30T21:02:27.407187Z",
  "last_location_at": "2026-10-30T21:02:27.407187Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/264d5a49-d5f3-4db2-890e-1a672e3fcfba/close` → **200**

```json
{
  "command_id": "021d59b7-506c-4510-a167-d0e51e03fb25",
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
  "session_id": "d1450b7b-9ceb-4425-bbba-61078ec07610",
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
  "last_heartbeat_at": "2026-10-30T21:02:39.839263Z",
  "last_location_at": "2026-10-30T21:02:39.839263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d1450b7b-9ceb-4425-bbba-61078ec07610/close` → **200**

```json
{
  "command_id": "4d0325a4-d63c-49f3-a14a-034de085471b",
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

Done: terminal order 4b0c3d10-2272-4edf-a15a-7acd0d187313 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24800"
}
```

```json
{
  "challenge_id": "40cabc55-ab0f-42e1-9e2e-fb452ca0505a",
  "expires_at": "2026-10-30T21:07:44.9051891Z",
  "resend_available_at": "2026-10-30T21:02:45.9051891Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "684304",
  "sent_at": "2026-10-30T21:02:44.907198037Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40cabc55-ab0f-42e1-9e2e-fb452ca0505a",
  "code": "684304",
  "device_ref": "sandbox-24800"
}
```

```json
{
  "session_id": "a381d9d1-466e-49f5-8a07-94e4b9306d47",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NTA2NSwiaWF0IjoxNzkzMzk0MTY1LCJqdGkiOiJhZWVjMDM2My1hMDYzLTQ4YjEtYjQzOS0wNTg0MzM0YjI3MmQiLCJzaWQiOiJhMzgxZDlkMS00NjZlLTQ5ZjUtOGEwNy05NGU0YjkzMDZkNDcifQ.V1sn_T59nhvm_Y7A8LqSIOrPVUalEYAQ8SsctXAehw0",
  "access_expires_at": "2026-10-30T21:17:45.132729369Z",
  "refresh_token": "ADiYZYQyED9AXmCweNWa7QhQxa0U6DA2FUhhp4tylWk",
  "refresh_expires_at": "2026-11-29T21:02:45.132011344Z",
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
  "device_ref": "sandbox-16532"
}
```

```json
{
  "challenge_id": "d8894187-4f04-4a5b-82f9-7233e746c266",
  "expires_at": "2026-10-30T21:07:45.529275488Z",
  "resend_available_at": "2026-10-30T21:02:46.529275488Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "095624",
  "sent_at": "2026-10-30T21:02:45.531229553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8894187-4f04-4a5b-82f9-7233e746c266",
  "code": "095624",
  "device_ref": "sandbox-16532"
}
```

```json
{
  "session_id": "5d55edc4-7d01-4495-8efb-cb454cf73cef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NTA2NSwiaWF0IjoxNzkzMzk0MTY1LCJqdGkiOiJkZGFjNjFkZS05ZWU4LTQyMDEtOTc5Ni1hOGNmNmIwNjNjMTkiLCJzaWQiOiI1ZDU1ZWRjNC03ZDAxLTQ0OTUtOGVmYi1jYjQ1NGNmNzNjZWYifQ.efa18bUj31eA1MoJ7F51cDjoXgx0T63SHtzVCeRKq9Y",
  "access_expires_at": "2026-10-30T21:17:45.760038659Z",
  "refresh_token": "Yijq4Mr1_T2kROicYqijbJbSjmzvkX8_wpSgkus3G6w",
  "refresh_expires_at": "2026-11-29T21:02:45.759304406Z",
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
  "device_ref": "sandbox-3744"
}
```

```json
{
  "challenge_id": "809218f9-e694-45e3-ac54-de16bd26e5b7",
  "expires_at": "2026-10-30T21:07:46.157215874Z",
  "resend_available_at": "2026-10-30T21:02:47.157215874Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "462292",
  "sent_at": "2026-10-30T21:02:46.159065322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "809218f9-e694-45e3-ac54-de16bd26e5b7",
  "code": "462292",
  "device_ref": "sandbox-3744"
}
```

```json
{
  "session_id": "ae26d7bd-ce3c-4df3-a123-215aaa750a30",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM5NTA2NiwiaWF0IjoxNzkzMzk0MTY2LCJqdGkiOiIyNzkxMTE1OC01YTJmLTRmNGQtOGRlZi0xNDBhYTkzZjFhODciLCJzaWQiOiJhZTI2ZDdiZC1jZTNjLTRkZjMtYTEyMy0yMTVhYWE3NTBhMzAifQ.CveahRfaUXgx-weDfLSCCFxkGH4gmm4zLe1PgZYveF4",
  "access_expires_at": "2026-10-30T21:17:46.394588886Z",
  "refresh_token": "G2D8M9mDPTUD4Gj-pn4Hq2Uu7QqIgBlikzcc-f4snkI",
  "refresh_expires_at": "2026-11-29T21:02:46.394123761Z",
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
  "phone": "+380694436770",
  "device_ref": "sandbox-17996"
}
```

```json
{
  "challenge_id": "b29453bc-d1a3-4ff1-96ee-f67b951af664",
  "expires_at": "2026-10-30T21:07:46.79734653Z",
  "resend_available_at": "2026-10-30T21:02:47.79734653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694436770` → **200**

```json
{
  "phone": "+380694436770",
  "audience": "CLIENT",
  "code": "370634",
  "sent_at": "2026-10-30T21:02:46.799201325Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b29453bc-d1a3-4ff1-96ee-f67b951af664",
  "code": "370634",
  "device_ref": "sandbox-17996"
}
```

```json
{
  "session_id": "02ad9284-3297-4c98-a4f1-df7ce64db327",
  "subject": {
    "type": "CLIENT",
    "id": "5142fd2d-6675-47c0-8d08-d9f40feedd60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTQyZmQyZC02Njc1LTQ3YzAtOGQwOC1kOWY0MGZlZWRkNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk1MDY3LCJpYXQiOjE3OTMzOTQxNjcsImp0aSI6ImVlYWQ3YTI4LTVmNDMtNGNmMS1hMjI3LTY0YjYwOWZkY2U2NCIsInNpZCI6IjAyYWQ5Mjg0LTMyOTctNGM5OC1hNGYxLWRmN2NlNjRkYjMyNyJ9.ocXOPuIAVEPFFtmAHJ2e_3tlGvi3riJzdyZ3Vl3AeeI",
  "access_expires_at": "2026-10-30T21:17:47.024211764Z",
  "refresh_token": "Nk0HryOO1Hn_8ZSsyCWfPx3NAsoSN6Q1DGrJRizLpos",
  "refresh_expires_at": "2026-11-29T21:02:47.023705235Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc5ec76d-7727-43bf-a95a-3ac9ad38dbc7",
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
  "id": "e2ce9466-671e-4dc1-a4e5-ac623471ca91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T21:07:47.237951Z",
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
  "command_id": "4117ae74-6653-40bc-a07a-f4e2389d6891",
  "quote_id": "e2ce9466-671e-4dc1-a4e5-ac623471ca91",
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
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T21:02:47.457082Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T21:02:47.457082Z",
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
  "blizz_dispatch_assigned_seconds_count": 22,
  "blizz_offers_total": 28,
  "blizz_dispatch_excluded_total": 19,
  "blizz_sms_sent_total": 90
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 9.232707791
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 21
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.062497042
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="CITY_NOT_ADMITTED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 25
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.394903894
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 21.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 5.0
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

`GET /api/rider/v1/orders/9b165e67-63b7-4648-bc04-c74cca1c0eaf` → **200**

```json
{
  "id": "9b165e67-63b7-4648-bc04-c74cca1c0eaf",
  "short_number": 38,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5142fd2d-6675-47c0-8d08-d9f40feedd60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T21:02:47.457082Z",
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
  "session_id": "c9e2284b-5177-4b4c-8c16-76f2cdf18e54",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUyNTEsImlhdCI6MTc5MzM5NDM1MSwianRpIjoiZWEzZGZhOWItOTIwZS00OGNlLWE4ZWQtMWE5ZGY3NTliOWY3Iiwic2lkIjoiYzllMjI4NGItNTE3Ny00YjRjLThjMTYtNzZmMmNkZjE4ZTU0In0.lPJ-HF6QHhhfplg-5Ut9_fZZmLEdXq56dvXgBLi_a1g",
  "access_expires_at": "2026-10-30T21:20:51.285807941Z",
  "refresh_token": "Pb-wG3ceXcV3pfwryxPtaAAeUJNx3cjmxqCR5mkDayk",
  "refresh_expires_at": "2026-10-31T09:05:51.285266641Z",
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
  "id": "bd53f93b-6860-429a-aafc-d2f6829e2698",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T21:05:51.502321Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T21:05:51.502394Z",
  "updated_at": "2026-10-30T21:05:51.516996Z",
  "finished_at": "2026-10-30T21:05:51.516996Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/bd53f93b-6860-429a-aafc-d2f6829e2698` → **200**

```json
{
  "run": {
    "id": "bd53f93b-6860-429a-aafc-d2f6829e2698",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T21:05:51.502321Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T21:05:51.502394Z",
    "updated_at": "2026-10-30T21:05:51.516996Z",
    "finished_at": "2026-10-30T21:05:51.516996Z",
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
  "id": "bd53f93b-6860-429a-aafc-d2f6829e2698",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T21:05:51.502321Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T21:05:51.502394Z",
  "updated_at": "2026-10-30T21:05:51.516996Z",
  "finished_at": "2026-10-30T21:05:51.516996Z",
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
  "id": "bd53f93b-6860-429a-aafc-d2f6829e2698",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T21:05:51.502321Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T21:05:51.502394Z",
  "updated_at": "2026-10-30T21:05:51.516996Z",
  "finished_at": "2026-10-30T21:05:51.516996Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ab5da716-7faf-4b86-b7ec-68c4acb59101` → **204**

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
  "id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T21:05:51.864998Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T21:05:51.865044Z",
  "updated_at": "2026-10-30T21:05:51.87099Z",
  "finished_at": "2026-10-30T21:05:51.87099Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/992c2b76-1562-40d2-9063-4efb24bc8cd7` → **200**

```json
{
  "run": {
    "id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T21:05:51.864998Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T21:05:51.865044Z",
    "updated_at": "2026-10-30T21:05:51.87099Z",
    "finished_at": "2026-10-30T21:05:51.87099Z",
    "version": 1
  },
  "items": [
    {
      "id": "acdf7a73-7c65-447a-b883-ed1e990542de",
      "run_id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "4644634fd7965e58b5d8ddd10e15bbf0a33bf29c9049894549fd5c27e0f3c556",
      "reference_display": "sandbox-reconciliation-ab5da716-7faf-4b86-b7ec-68c4acb#####",
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
      "provider_at": "2026-10-30T21:05:51Z",
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
  "id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T21:05:51.864998Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T21:05:51.865044Z",
  "updated_at": "2026-10-30T21:05:51.87099Z",
  "finished_at": "2026-10-30T21:05:51.87099Z",
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
  "id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T21:05:51.864998Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T21:05:51.865044Z",
  "updated_at": "2026-10-30T21:05:51.87099Z",
  "finished_at": "2026-10-30T21:05:51.87099Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/acdf7a73-7c65-447a-b883-ed1e990542de/resolve` → **200**

```json
{
  "command_id": "f56a15d0-7153-4eac-84de-a09c039a5055",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "acdf7a73-7c65-447a-b883-ed1e990542de",
  "run_id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "4644634fd7965e58b5d8ddd10e15bbf0a33bf29c9049894549fd5c27e0f3c556",
  "reference_display": "sandbox-reconciliation-ab5da716-7faf-4b86-b7ec-68c4acb#####",
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
  "provider_at": "2026-10-30T21:05:51Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "resolved_at": "2026-10-30T21:05:52.189199Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/acdf7a73-7c65-447a-b883-ed1e990542de/resolve` → **200**

```json
{
  "command_id": "f56a15d0-7153-4eac-84de-a09c039a5055",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "acdf7a73-7c65-447a-b883-ed1e990542de",
  "run_id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "4644634fd7965e58b5d8ddd10e15bbf0a33bf29c9049894549fd5c27e0f3c556",
  "reference_display": "sandbox-reconciliation-ab5da716-7faf-4b86-b7ec-68c4acb#####",
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
  "provider_at": "2026-10-30T21:05:51Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
  "resolved_at": "2026-10-30T21:05:52.189199Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/acdf7a73-7c65-447a-b883-ed1e990542de/resolve` → **409**

```json
{
  "command_id": "0efca389-aa2e-4a89-aa3d-8c698ffaf6fb",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/acdf7a73-7c65-447a-b883-ed1e990542de/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4920a60c-eda6-4bdb-8cce-82c94baaa414"
}
```

`GET /api/admin/v1/payment-reconciliations/992c2b76-1562-40d2-9063-4efb24bc8cd7` → **200**

```json
{
  "run": {
    "id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T21:05:51.864998Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T21:05:51.865044Z",
    "updated_at": "2026-10-30T21:05:52.189199Z",
    "finished_at": "2026-10-30T21:05:51.87099Z",
    "version": 2
  },
  "items": [
    {
      "id": "acdf7a73-7c65-447a-b883-ed1e990542de",
      "run_id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "4644634fd7965e58b5d8ddd10e15bbf0a33bf29c9049894549fd5c27e0f3c556",
      "reference_display": "sandbox-reconciliation-ab5da716-7faf-4b86-b7ec-68c4acb#####",
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
      "provider_at": "2026-10-30T21:05:51Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "188b6db1-901f-476e-b592-dea8cdf876d3",
      "resolved_at": "2026-10-30T21:05:52.189199Z",
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
      "id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T21:05:51.864998Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T21:05:51.865044Z",
      "updated_at": "2026-10-30T21:05:52.189199Z",
      "finished_at": "2026-10-30T21:05:51.87099Z",
      "version": 2
    },
    {
      "id": "f842013c-71e3-4031-9d6a-b79488ea8d1b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T20:43:47.470904Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T20:43:47.47107Z",
      "updated_at": "2026-10-30T20:43:47.479302Z",
      "finished_at": "2026-10-30T20:43:47.479302Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ab5da716-7faf-4b86-b7ec-68c4acb59101` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "992c2b76-1562-40d2-9063-4efb24bc8cd7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T21:05:51.864998Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T21:05:51.865044Z",
  "updated_at": "2026-10-30T21:05:52.189199Z",
  "finished_at": "2026-10-30T21:05:51.87099Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793394477807E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793394478139E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793394478139E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793394477807E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79339447814E9
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
  "phone": "+380683795630",
  "device_ref": "sandbox-24340"
}
```

```json
{
  "challenge_id": "01b449ba-8e53-4793-928d-48cad543e01a",
  "expires_at": "2026-10-30T21:13:00.060375971Z",
  "resend_available_at": "2026-10-30T21:08:01.060375971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683795630` → **200**

```json
{
  "phone": "+380683795630",
  "audience": "CLIENT",
  "code": "168486",
  "sent_at": "2026-10-30T21:08:00.062778178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01b449ba-8e53-4793-928d-48cad543e01a",
  "code": "168486",
  "device_ref": "sandbox-24340"
}
```

```json
{
  "session_id": "4ace0ea3-a21f-4206-a936-11c36e2983d4",
  "subject": {
    "type": "CLIENT",
    "id": "ad3d3193-9a9e-443f-92db-ecf7cab9c096"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDNkMzE5My05YTllLTQ0M2YtOTJkYi1lY2Y3Y2FiOWMwOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzk1MzgwLCJpYXQiOjE3OTMzOTQ0ODAsImp0aSI6IjBmZmEyYzIxLWRmNjAtNDU1NS1hZmEzLTBiY2IzYThkYTE2YyIsInNpZCI6IjRhY2UwZWEzLWEyMWYtNDIwNi1hOTM2LTExYzM2ZTI5ODNkNCJ9.T1z-4DvEpPsknIOoPZcHnAQQLI2a1zDN3y198ku48v8",
  "access_expires_at": "2026-10-30T21:23:00.301724066Z",
  "refresh_token": "wwrXrSS1UO9xYzwibX-MTrdScuWuNBnAphbe4N3Yyg0",
  "refresh_expires_at": "2026-11-29T21:08:00.300950645Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ad3d3193-9a9e-443f-92db-ecf7cab9c096",
  "session_id": "4ace0ea3-a21f-4206-a936-11c36e2983d4",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (560K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "da071880-f063-491b-bcfc-6b42c5186e56",
  "expires_at": "2026-10-30T21:13:03.123165191Z",
  "resend_available_at": "2026-10-30T21:08:04.123165191Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683795630` → **200**

```json
{
  "phone": "+380683795630",
  "audience": "CLIENT",
  "code": "623941",
  "sent_at": "2026-10-30T21:08:03.124934256Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2a06b51d-5f41-43be-921a-b70a981fd82d",
  "challenge_id": "da071880-f063-491b-bcfc-6b42c5186e56",
  "otp_code": "623941"
}
```

```json
{
  "client_id": "ad3d3193-9a9e-443f-92db-ecf7cab9c096",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T21:08:03.369096916Z"
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
  "session_id": "4860fb43-044f-46ff-8915-553db6bd9b3b",
  "subject": {
    "type": "STAFF",
    "id": "188b6db1-901f-476e-b592-dea8cdf876d3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODhiNmRiMS05MDFmLTQ3NmUtYjU5Mi1kZWE4Y2RmODc2ZDMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzOTUzODMsImlhdCI6MTc5MzM5NDQ4MywianRpIjoiNGU2NmI4ZDgtMDk0My00MGUxLTk5YzEtYjQ1YzY2ZTM4YjFmIiwic2lkIjoiNDg2MGZiNDMtMDQ0Zi00NmZmLTg5MTUtNTUzZGI2YmQ5YjNiIn0.EE-1Cnzg07v-rKdAJ_zRqPMYgRgf2qcRCzeRIKt0tF0",
  "access_expires_at": "2026-10-30T21:23:03.784389791Z",
  "refresh_token": "CsQlhUt01v1YzGenVaPVEPUhkKr5x1ROy4vgpS6ikF0",
  "refresh_expires_at": "2026-10-31T09:08:03.783935662Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/ad3d3193-9a9e-443f-92db-ecf7cab9c096/complete` → **200**

```json
{
  "command_id": "e84c0e93-8fb5-4e95-ade7-04c3a51a9093",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "ad3d3193-9a9e-443f-92db-ecf7cab9c096",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 102 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (113 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380683795630` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
