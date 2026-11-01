# Sandbox transcript (2026-11-01T08:19:34Z, 4f8ed43)

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
  "correlation_id": "e714140e-ba9c-4782-ac53-08e754908749"
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
  "session_id": "17285360-aad3-4f51-8dd1-5414f0ff2f90",
  "subject": {
    "type": "STAFF",
    "id": "222c31a7-4859-40a8-a999-2ce43235b715"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMjJjMzFhNy00ODU5LTQwYTgtYTk5OS0yY2U0MzIzNWI3MTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1MjIwODMsImlhdCI6MTc5MzUyMTE4MywianRpIjoiMDZmYmMyZjMtOWU4My00YjhiLTk1YjctY2JiMmYxOGQwYzcwIiwic2lkIjoiMTcyODUzNjAtYWFkMy00ZjUxLThkZDEtNTQxNGYwZmYyZjkwIn0.sEpB7myKReiZsI2N3CYj8X5xqT_Wg4iGGtXSC19r8s0",
  "access_expires_at": "2026-11-01T08:34:43.58346279Z",
  "refresh_token": "yDORb8-b5KJvGZZxDv12eCk3CTq4PLt1Sem3go5z16E",
  "refresh_expires_at": "2026-11-01T20:19:43.580744346Z",
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
  "session_id": "21ff7864-1274-4243-8dcb-a3bbb16a3e9f",
  "subject": {
    "type": "STAFF",
    "id": "222c31a7-4859-40a8-a999-2ce43235b715"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMjJjMzFhNy00ODU5LTQwYTgtYTk5OS0yY2U0MzIzNWI3MTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1MjIwODUsImlhdCI6MTc5MzUyMTE4NSwianRpIjoiZmU0MzFmYjMtZjAxMi00YjY1LWE1YmEtNGVlYmEyMDM2MTQwIiwic2lkIjoiMjFmZjc4NjQtMTI3NC00MjQzLThkY2ItYTNiYmIxNmEzZTlmIn0.ZFPMtI4DDuO-m44OVXpwIi2ahglhO5Yy3UfPv4QGZwE",
  "access_expires_at": "2026-11-01T08:34:45.481434077Z",
  "refresh_token": "4eI8yq3dUS9FjWvq3_uTo1w1QHFQyAjcgBoWg0o7CYU",
  "refresh_expires_at": "2026-11-01T20:19:45.480237488Z",
  "password_change_required": false
}
```

## The admin creates a new city in the Southern Ocean and publishes it

`POST /api/admin/v1/cities` → **201**

```json
{
  "command_id": "4a103244-b778-49c7-bb72-2d1a18200d56",
  "code": "sandbox-first-127-4578",
  "name": "Sandbox first city",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "polygon": {
    "type": "MultiPolygon",
    "coordinates": [
      [
        [
          [
            127,
            -61
          ],
          [
            128,
            -61
          ],
          [
            128,
            -60
          ],
          [
            127,
            -60
          ],
          [
            127,
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
  "id": "545ea444-46cd-4f0d-8d8b-9bba131b3cbd",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/cities/545ea444-46cd-4f0d-8d8b-9bba131b3cbd/publish` → **200**

```json
{
  "command_id": "a1350e21-7a4f-4f1f-ad39-af17d64acddd",
  "expected_version": 0,
  "reason": "Sandbox: open"
}
```

```json
{
  "id": "545ea444-46cd-4f0d-8d8b-9bba131b3cbd",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/admin/v1/cities/545ea444-46cd-4f0d-8d8b-9bba131b3cbd/operations` → **200**

```json
{
  "city_id": "545ea444-46cd-4f0d-8d8b-9bba131b3cbd",
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

`POST /api/admin/v1/cities/545ea444-46cd-4f0d-8d8b-9bba131b3cbd/operations` → **200**

```json
{
  "command_id": "86a671bf-748e-4545-88c5-75b656786c4e",
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
  "city_id": "545ea444-46cd-4f0d-8d8b-9bba131b3cbd",
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

Inserted one vehicle class STANDARD and one published tariff for city `545ea444-46cd-4f0d-8d8b-9bba131b3cbd` (#30).

## A new driver signs in, adds a car and the documents, and asks for the check

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380509728498",
  "device_ref": "sandbox-13878"
}
```

```json
{
  "challenge_id": "42362a6d-b6c1-4e3d-a217-d29ba7ee9411",
  "expires_at": "2026-11-01T08:24:47.600936181Z",
  "resend_available_at": "2026-11-01T08:19:48.600936181Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380509728498` → **200**

```json
{
  "phone": "+380509728498",
  "audience": "DRIVER",
  "code": "413345",
  "sent_at": "2026-11-01T08:19:47.614021453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42362a6d-b6c1-4e3d-a217-d29ba7ee9411",
  "code": "413345",
  "device_ref": "sandbox-13878"
}
```

```json
{
  "session_id": "fca8c8a2-e4f4-4414-8549-7fa583e97785",
  "subject": {
    "type": "DRIVER",
    "id": "d728e211-9e11-4409-86d6-dce59a7c710d"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzI4ZTIxMS05ZTExLTQ0MDktODZkNi1kY2U1OWE3YzcxMGQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUyMjA4OCwiaWF0IjoxNzkzNTIxMTg4LCJqdGkiOiIyNWFhMDVhYS02NWEzLTRiYmEtYjVlNy0wN2NlMGFjMjgwMzUiLCJzaWQiOiJmY2E4YzhhMi1lNGY0LTQ0MTQtODU0OS03ZmE1ODNlOTc3ODUifQ.p65m9B7hn7IwMARPsAcIeIiFSN51dawGwHmEOwb6fS4",
  "access_expires_at": "2026-11-01T08:34:48.011361263Z",
  "refresh_token": "biTcX2TxpAQGWNxlFkHKWiSE7F2wheCIaQM1HziGniU",
  "refresh_expires_at": "2026-12-01T08:19:48.010228393Z",
  "account_created": true
}
```

`PATCH /api/driver/v1/profile` → **200**

```json
{
  "command_id": "8b5e82e8-348d-4d21-bbac-91cacbc0c9fc",
  "name": "Taras (sandbox)",
  "language": "uk"
}
```

```json
{
  "id": "d728e211-9e11-4409-86d6-dce59a7c710d",
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
  "command_id": "1a7f321b-81ce-4ef8-992e-cfb2bc5c5bd1",
  "registration_number": "AA3208AA",
  "make": "Skoda",
  "model": "Octavia",
  "color": "white",
  "production_year": 2021
}
```

```json
{
  "id": "1ef2f961-2c93-4472-98bf-3b3c609b193f"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "2843bc39-e1a5-488a-87ee-0e2424ba44bb",
  "content_type": "application/pdf",
  "size_bytes": 81
}
```

```json
{
  "file_id": "6e77aa39-ff5b-4ce4-8374-39f3a7fb2eb6",
  "upload_path": "/api/driver/v1/uploads/6e77aa39-ff5b-4ce4-8374-39f3a7fb2eb6",
  "expires_at": "2026-11-01T08:34:49.071989161Z",
  "max_bytes": 81
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "30c865d5-1e31-4bea-9438-8ada16165522",
  "type": "DRIVER_LICENSE",
  "file_id": "6e77aa39-ff5b-4ce4-8374-39f3a7fb2eb6",
  "number": "SANDBOX-DRIVER_LICENSE-15577",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "a49c833d-eb56-4c03-8263-180e726b5cac"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "ad809277-f850-4772-8520-45026ac3d1bf",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "cf5038be-5053-4cb6-b219-66a4d00f37be",
  "upload_path": "/api/driver/v1/uploads/cf5038be-5053-4cb6-b219-66a4d00f37be",
  "expires_at": "2026-11-01T08:34:49.833110359Z",
  "max_bytes": 87
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "b32f781f-ba20-4252-b2b5-e30f14c73200",
  "type": "VEHICLE_REGISTRATION",
  "file_id": "cf5038be-5053-4cb6-b219-66a4d00f37be",
  "vehicle_id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
  "number": "SANDBOX-VEHICLE_REGISTRATION-29653",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "e91faaeb-87b7-40d5-9f8a-c27fe8d55f84"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "4732afa1-a285-4ea5-8b99-a57abfaaf85e",
  "content_type": "application/pdf",
  "size_bytes": 74
}
```

```json
{
  "file_id": "f5baf90f-a95e-4229-9811-ca496a308885",
  "upload_path": "/api/driver/v1/uploads/f5baf90f-a95e-4229-9811-ca496a308885",
  "expires_at": "2026-11-01T08:34:50.550485762Z",
  "max_bytes": 74
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "e38cddaf-ab90-4c6f-8e28-0d648dc830d0",
  "type": "INSURANCE",
  "file_id": "f5baf90f-a95e-4229-9811-ca496a308885",
  "vehicle_id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
  "number": "SANDBOX-INSURANCE-30494",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "7a79dfa5-cd80-4cc6-b9af-4fa157172a43"
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "d728e211-9e11-4409-86d6-dce59a7c710d",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "NOT_SUBMITTED",
  "version": 1,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
      "registration_number": "AA3208AA",
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
      "id": "a49c833d-eb56-4c03-8263-180e726b5cac",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "6e77aa39-ff5b-4ce4-8374-39f3a7fb2eb6",
      "number": "SANDBOX-DRIVER_LICENSE-15577",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "7a79dfa5-cd80-4cc6-b9af-4fa157172a43",
      "type": "INSURANCE",
      "vehicle_id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
      "file_id": "f5baf90f-a95e-4229-9811-ca496a308885",
      "number": "SANDBOX-INSURANCE-30494",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "e91faaeb-87b7-40d5-9f8a-c27fe8d55f84",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
      "file_id": "cf5038be-5053-4cb6-b219-66a4d00f37be",
      "number": "SANDBOX-VEHICLE_REGISTRATION-29653",
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
  "command_id": "f4a7e1a2-c9f5-4b6e-a58d-eb34acb102d2",
  "expected_version": 1
}
```

```json
{
  "id": "d728e211-9e11-4409-86d6-dce59a7c710d",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "IN_REVIEW",
  "version": 2,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
      "registration_number": "AA3208AA",
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
      "id": "a49c833d-eb56-4c03-8263-180e726b5cac",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "6e77aa39-ff5b-4ce4-8374-39f3a7fb2eb6",
      "number": "SANDBOX-DRIVER_LICENSE-15577",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "7a79dfa5-cd80-4cc6-b9af-4fa157172a43",
      "type": "INSURANCE",
      "vehicle_id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
      "file_id": "f5baf90f-a95e-4229-9811-ca496a308885",
      "number": "SANDBOX-INSURANCE-30494",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "e91faaeb-87b7-40d5-9f8a-c27fe8d55f84",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
      "file_id": "cf5038be-5053-4cb6-b219-66a4d00f37be",
      "number": "SANDBOX-VEHICLE_REGISTRATION-29653",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    }
  ]
}
```

After submitting: `IN_REVIEW`.

## Negative control: the driver is not approved, so going online is refused

## The driver goes online in the new city

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "a5b44d50-ea93-4a3d-b3c4-11e2c6de363e",
  "vehicle_id": "1ef2f961-2c93-4472-98bf-3b3c609b193f",
  "location": {
    "lat": -60.49,
    "lon": 127.5,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T08:19:51Z",
    "sequence": 1793521191946
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
  "correlation_id": "cea5cad5-ebfb-4f41-bf5f-13ebe1c98951"
}
```

Going online without approval: **409** `DRIVER_NOT_ELIGIBLE`.

**Negative control: the scenario stops here, as it must without the approval.**

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "d728e211-9e11-4409-86d6-dce59a7c710d",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "IN_REVIEW",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "ADMISSION_IN_REVIEW",
    "NO_OPEN_SESSION"
  ]
}
```

`GET /api/admin/v1/cities?state=PUBLISHED` → **200**

```json
{
  "cities": [
    {
      "id": "545ea444-46cd-4f0d-8d8b-9bba131b3cbd",
      "code": "sandbox-first-127-4578",
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
                127,
                -61
              ],
              [
                128,
                -61
              ],
              [
                128,
                -60
              ],
              [
                127,
                -60
              ],
              [
                127,
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

`POST /api/admin/v1/cities/545ea444-46cd-4f0d-8d8b-9bba131b3cbd/archive` → **200**

```json
{
  "command_id": "540e1030-6b36-4f1b-af99-27beb09f0fa1",
  "expected_version": 1,
  "reason": "Sandbox: first city done"
}
```

```json
{
  "id": "545ea444-46cd-4f0d-8d8b-9bba131b3cbd",
  "state": "ARCHIVED",
  "version": 2
}
```
