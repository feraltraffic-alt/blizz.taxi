# Sandbox transcript (2026-11-01T08:17:02Z, 1e8f147)

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
  "correlation_id": "3acc4373-7250-4fd6-8aca-9ce4bdd0d645"
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
  "session_id": "a98c815e-5d0f-4e37-8a6a-b26daa1560d1",
  "subject": {
    "type": "STAFF",
    "id": "2f23c194-fd4b-4713-b91d-ad911f02bd36"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjIzYzE5NC1mZDRiLTQ3MTMtYjkxZC1hZDkxMWYwMmJkMzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1MjE5MzEsImlhdCI6MTc5MzUyMTAzMSwianRpIjoiYTRiZjQwNWEtYTNjMS00NWQwLTk0MTctYzYyODA3YjE3ZGNmIiwic2lkIjoiYTk4YzgxNWUtNWQwZi00ZTM3LThhNmEtYjI2ZGFhMTU2MGQxIn0.jO6AyRONGw7oysQ4F17EebxFTJ2QA-nYFrLYrYACG1s",
  "access_expires_at": "2026-11-01T08:32:11.694051203Z",
  "refresh_token": "uiL6m_ozOMs1NB1xmn0nxfGWQ_aAKMwnwU3UV79uxAU",
  "refresh_expires_at": "2026-11-01T20:17:11.689585245Z",
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
  "session_id": "2c344b78-c46b-4881-8f49-25e00a90e968",
  "subject": {
    "type": "STAFF",
    "id": "2f23c194-fd4b-4713-b91d-ad911f02bd36"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjIzYzE5NC1mZDRiLTQ3MTMtYjkxZC1hZDkxMWYwMmJkMzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1MjE5MzMsImlhdCI6MTc5MzUyMTAzMywianRpIjoiNjBiOWVhZDMtM2FiOC00NGQxLThiZDQtYWNkNWE1NjM3MTc1Iiwic2lkIjoiMmMzNDRiNzgtYzQ2Yi00ODgxLThmNDktMjVlMDBhOTBlOTY4In0.tNKZWvtxGU1GlkR08B_SoEJ4nxLeVzaAJS44W2v796c",
  "access_expires_at": "2026-11-01T08:32:13.487255905Z",
  "refresh_token": "sm9TWsLpMG87WAynu-hLhT_jQBGo5_G0hu87Og7n28E",
  "refresh_expires_at": "2026-11-01T20:17:13.486034519Z",
  "password_change_required": false
}
```

## The admin creates a new city in the Southern Ocean and publishes it

`POST /api/admin/v1/cities` → **201**

```json
{
  "command_id": "fa9105b4-927b-48db-ac1d-a7ed041c4843",
  "code": "sandbox-first-117-27103",
  "name": "Sandbox first city",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "polygon": {
    "type": "MultiPolygon",
    "coordinates": [
      [
        [
          [
            117,
            -61
          ],
          [
            118,
            -61
          ],
          [
            118,
            -60
          ],
          [
            117,
            -60
          ],
          [
            117,
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
  "id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/cities/483990c8-3331-4721-9fa4-f8c02515b595/publish` → **200**

```json
{
  "command_id": "f02798c4-b6e2-4889-891d-a8252cf808c7",
  "expected_version": 0,
  "reason": "Sandbox: open"
}
```

```json
{
  "id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/admin/v1/cities/483990c8-3331-4721-9fa4-f8c02515b595/operations` → **200**

```json
{
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
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

`POST /api/admin/v1/cities/483990c8-3331-4721-9fa4-f8c02515b595/operations` → **200**

```json
{
  "command_id": "e067e5bf-5a25-4c09-94ef-c2868f68b10a",
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
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
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

Inserted one vehicle class STANDARD and one published tariff for city `483990c8-3331-4721-9fa4-f8c02515b595` (#30).

## A new driver signs in, adds a car and the documents, and asks for the check

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380502512563",
  "device_ref": "sandbox-8792"
}
```

```json
{
  "challenge_id": "7f8c74f0-c7fc-4318-9ded-2069e76cfd17",
  "expires_at": "2026-11-01T08:22:15.400127595Z",
  "resend_available_at": "2026-11-01T08:17:16.400127595Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380502512563` → **200**

```json
{
  "phone": "+380502512563",
  "audience": "DRIVER",
  "code": "423632",
  "sent_at": "2026-11-01T08:17:15.414270754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f8c74f0-c7fc-4318-9ded-2069e76cfd17",
  "code": "423632",
  "device_ref": "sandbox-8792"
}
```

```json
{
  "session_id": "a9e4f7b6-b375-4a93-a9d5-6f32790cb33b",
  "subject": {
    "type": "DRIVER",
    "id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmVmMGVmMS0xYTU1LTRhNDQtYTA3ZC1mYmRhYmJmMDU2MjAiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUyMTkzNSwiaWF0IjoxNzkzNTIxMDM1LCJqdGkiOiIzMWE1YmRmYy1iMzU4LTQ5YWItODdlNy00N2NmZDI5NzRiODAiLCJzaWQiOiJhOWU0ZjdiNi1iMzc1LTRhOTMtYTlkNS02ZjMyNzkwY2IzM2IifQ.3ZXFlCxgOVr1VqMk3l-R3Tv1zYnHynQ65TQ7_lNlOeg",
  "access_expires_at": "2026-11-01T08:32:15.762442083Z",
  "refresh_token": "0NHEmKemsTA5bGnvRFTBm6Y43WiW-B7WojGkc0TuMRk",
  "refresh_expires_at": "2026-12-01T08:17:15.761218944Z",
  "account_created": true
}
```

`PATCH /api/driver/v1/profile` → **200**

```json
{
  "command_id": "84586649-e541-42aa-8017-201f41d630d2",
  "name": "Taras (sandbox)",
  "language": "uk"
}
```

```json
{
  "id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
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
  "command_id": "5ccb8f4b-3089-4098-9e41-29fc61ea04ed",
  "registration_number": "AA4683AA",
  "make": "Skoda",
  "model": "Octavia",
  "color": "white",
  "production_year": 2021
}
```

```json
{
  "id": "2390d208-00a4-48ff-bf41-ff89fabe7cca"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "9f5a6ebc-f60c-4f23-ad26-11871af6cc2e",
  "content_type": "application/pdf",
  "size_bytes": 81
}
```

```json
{
  "file_id": "00dfdc77-753d-489c-bcbf-83791f617d11",
  "upload_path": "/api/driver/v1/uploads/00dfdc77-753d-489c-bcbf-83791f617d11",
  "expires_at": "2026-11-01T08:32:16.77101951Z",
  "max_bytes": 81
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "247f79fe-df0c-4de2-8ed2-61bffde60cb7",
  "type": "DRIVER_LICENSE",
  "file_id": "00dfdc77-753d-489c-bcbf-83791f617d11",
  "number": "SANDBOX-DRIVER_LICENSE-29997",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "938edc69-8639-4f28-a085-b74390497408"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "c445fb88-6c74-4425-a119-32f3fc3539e0",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "9792ef26-edda-4ca1-82af-9e5529899e9a",
  "upload_path": "/api/driver/v1/uploads/9792ef26-edda-4ca1-82af-9e5529899e9a",
  "expires_at": "2026-11-01T08:32:17.463926011Z",
  "max_bytes": 87
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "50a1ade6-570b-4892-acc2-dfc78e50478a",
  "type": "VEHICLE_REGISTRATION",
  "file_id": "9792ef26-edda-4ca1-82af-9e5529899e9a",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "number": "SANDBOX-VEHICLE_REGISTRATION-20831",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "15aca101-8a27-4de5-806d-a9f93813ad4e"
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "c38f637b-87d3-4b99-97a9-c4238e568939",
  "content_type": "application/pdf",
  "size_bytes": 76
}
```

```json
{
  "file_id": "e5987f5c-5e7e-41a8-8205-1041125b86c1",
  "upload_path": "/api/driver/v1/uploads/e5987f5c-5e7e-41a8-8205-1041125b86c1",
  "expires_at": "2026-11-01T08:32:18.102457331Z",
  "max_bytes": 76
}
```

`POST /api/driver/v1/documents` → **201**

```json
{
  "command_id": "322a1b42-6f42-429b-99a5-17dfacdcac4f",
  "type": "INSURANCE",
  "file_id": "e5987f5c-5e7e-41a8-8205-1041125b86c1",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "number": "SANDBOX-INSURANCE-13346",
  "valid_from": "2025-11-01",
  "valid_to": "2027-11-01"
}
```

```json
{
  "id": "cae32e85-96ce-4961-897c-aa8f6eba71be"
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "NOT_SUBMITTED",
  "version": 1,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "registration_number": "AA4683AA",
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
      "id": "938edc69-8639-4f28-a085-b74390497408",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "00dfdc77-753d-489c-bcbf-83791f617d11",
      "number": "SANDBOX-DRIVER_LICENSE-29997",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "cae32e85-96ce-4961-897c-aa8f6eba71be",
      "type": "INSURANCE",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "e5987f5c-5e7e-41a8-8205-1041125b86c1",
      "number": "SANDBOX-INSURANCE-13346",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "15aca101-8a27-4de5-806d-a9f93813ad4e",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "9792ef26-edda-4ca1-82af-9e5529899e9a",
      "number": "SANDBOX-VEHICLE_REGISTRATION-20831",
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
  "command_id": "ce4d62aa-177a-4ec4-adc6-2a6bc1a57358",
  "expected_version": 1
}
```

```json
{
  "id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "IN_REVIEW",
  "version": 2,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "registration_number": "AA4683AA",
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
      "id": "938edc69-8639-4f28-a085-b74390497408",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "00dfdc77-753d-489c-bcbf-83791f617d11",
      "number": "SANDBOX-DRIVER_LICENSE-29997",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "cae32e85-96ce-4961-897c-aa8f6eba71be",
      "type": "INSURANCE",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "e5987f5c-5e7e-41a8-8205-1041125b86c1",
      "number": "SANDBOX-INSURANCE-13346",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "PENDING",
      "decision_reason": null
    },
    {
      "id": "15aca101-8a27-4de5-806d-a9f93813ad4e",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "9792ef26-edda-4ca1-82af-9e5529899e9a",
      "number": "SANDBOX-VEHICLE_REGISTRATION-20831",
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

`POST /api/admin/v1/drivers/02ef0ef1-1a55-4a44-a07d-fbdabbf05620/decision` → **200**

```json
{
  "command_id": "7aece2e9-17fc-4ad5-bb15-7c8b093dec88",
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
  "id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "APPROVED",
  "version": 3,
  "has_payment_terminal": false,
  "admission_city_ids": [],
  "vehicles": [
    {
      "id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "registration_number": "AA4683AA",
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
      "id": "938edc69-8639-4f28-a085-b74390497408",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "00dfdc77-753d-489c-bcbf-83791f617d11",
      "number": "SANDBOX-DRIVER_LICENSE-29997",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "cae32e85-96ce-4961-897c-aa8f6eba71be",
      "type": "INSURANCE",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "e5987f5c-5e7e-41a8-8205-1041125b86c1",
      "number": "SANDBOX-INSURANCE-13346",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "15aca101-8a27-4de5-806d-a9f93813ad4e",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "9792ef26-edda-4ca1-82af-9e5529899e9a",
      "number": "SANDBOX-VEHICLE_REGISTRATION-20831",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    }
  ]
}
```

After the decision: `APPROVED`.

`PUT /api/admin/v1/drivers/02ef0ef1-1a55-4a44-a07d-fbdabbf05620/admission-cities` → **200**

```json
{
  "command_id": "de04be5b-6067-46de-b9b4-a8f33b8a64f4",
  "expected_version": 3,
  "city_ids": [
    "483990c8-3331-4721-9fa4-f8c02515b595"
  ],
  "reason": "Sandbox: the new city"
}
```

```json
{
  "id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "account_state": "ACTIVE",
  "name": "Taras (sandbox)",
  "language": "uk",
  "review_status": "APPROVED",
  "version": 4,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "483990c8-3331-4721-9fa4-f8c02515b595"
  ],
  "vehicles": [
    {
      "id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "registration_number": "AA4683AA",
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
      "id": "938edc69-8639-4f28-a085-b74390497408",
      "type": "DRIVER_LICENSE",
      "vehicle_id": null,
      "file_id": "00dfdc77-753d-489c-bcbf-83791f617d11",
      "number": "SANDBOX-DRIVER_LICENSE-29997",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "cae32e85-96ce-4961-897c-aa8f6eba71be",
      "type": "INSURANCE",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "e5987f5c-5e7e-41a8-8205-1041125b86c1",
      "number": "SANDBOX-INSURANCE-13346",
      "valid_from": "2025-11-01",
      "valid_to": "2027-11-01",
      "decision": "ACCEPTED",
      "decision_reason": null
    },
    {
      "id": "15aca101-8a27-4de5-806d-a9f93813ad4e",
      "type": "VEHICLE_REGISTRATION",
      "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
      "file_id": "9792ef26-edda-4ca1-82af-9e5529899e9a",
      "number": "SANDBOX-VEHICLE_REGISTRATION-20831",
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
  "command_id": "f859c5fd-d83f-4483-9e50-2b8dee046953",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "location": {
    "lat": -60.49,
    "lon": 117.5,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T08:17:20Z",
    "sequence": 1793521040330
  }
}
```

```json
{
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "session_id": "06908b3b-c630-4e8a-8f29-bcf77818e525",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "last_heartbeat_at": "2026-11-01T08:17:20.078437Z",
  "last_location_at": "2026-11-01T08:17:20.078437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders in the app (cash) and the new driver drives it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677790427",
  "device_ref": "sandbox-20863"
}
```

```json
{
  "challenge_id": "5ff6263f-de62-4820-91fc-683ae5b84b1f",
  "expires_at": "2026-11-01T08:22:20.400635718Z",
  "resend_available_at": "2026-11-01T08:17:21.400635718Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677790427` → **200**

```json
{
  "phone": "+380677790427",
  "audience": "CLIENT",
  "code": "489017",
  "sent_at": "2026-11-01T08:17:20.405637473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ff6263f-de62-4820-91fc-683ae5b84b1f",
  "code": "489017",
  "device_ref": "sandbox-20863"
}
```

```json
{
  "session_id": "4aa26781-6a99-4e3b-a65c-35fd2dd4153c",
  "subject": {
    "type": "CLIENT",
    "id": "a3ca3efd-7708-46e4-ac90-18e5ec037bd5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2NhM2VmZC03NzA4LTQ2ZTQtYWM5MC0xOGU1ZWMwMzdiZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTIxOTQwLCJpYXQiOjE3OTM1MjEwNDAsImp0aSI6IjgxMWY3M2Y2LTMwMTEtNDMyZi1iOTA3LTRkMmIwYzRjZWMxZCIsInNpZCI6IjRhYTI2NzgxLTZhOTktNGUzYi1hNjVjLTM1ZmQyZGQ0MTUzYyJ9.MVUFXkJWx8ODFxVqbUMYCh7j4nJmar4Svt1DOfHfJmY",
  "access_expires_at": "2026-11-01T08:32:20.737582041Z",
  "refresh_token": "UJyJKA90vTLjw3Hip7aRKYmCoW3y2jChJLSihxWNmig",
  "refresh_expires_at": "2026-12-01T08:17:20.736585982Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a4ef6d69-20b1-46df-9a46-ce85cf7ace52",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  }
}
```

```json
{
  "id": "3d56f881-9d81-4114-b58a-8bb471971d7d",
  "vehicle_class": "STANDARD",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "amount_minor": 21931,
  "currency": "UAH",
  "distance_m": 8077,
  "duration_s": 1163,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T08:22:21.089158Z",
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
  "command_id": "11667ca4-3f68-4ec9-9516-0229453bf82d",
  "quote_id": "3d56f881-9d81-4114-b58a-8bb471971d7d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH"
}
```

```json
{
  "id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3ca3efd-7708-46e4-ac90-18e5ec037bd5",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21931,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-11-01T08:17:21.48161Z",
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
    "id": "90d8b9db-126f-4f89-bdfd-ffb352a4a530",
    "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
    "expires_at": "2026-11-01T08:17:36.489853Z",
    "server_time": "2026-11-01T08:17:21.888645767Z",
    "seconds_left": 14,
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": -60.5,
      "lon": 117.5
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

`POST /api/driver/v1/offers/90d8b9db-126f-4f89-bdfd-ffb352a4a530/accept` → **200**

```json
{
  "command_id": "4552e9cc-abe2-4812-afcf-640b645402a9"
}
```

```json
{
  "id": "75c80967-8f86-4ec7-94f1-f99084efa3ef",
  "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3d0693e-1d2a-4513-a0a8-5b710fccb5bd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3d0693e-1d2a-4513-a0a8-5b710fccb5bd",
  "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "assignment_id": "75c80967-8f86-4ec7-94f1-f99084efa3ef",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
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

`POST /api/driver/v1/work-sessions/06908b3b-c630-4e8a-8f29-bcf77818e525/heartbeat` → **200**

```json
{
  "location": {
    "lat": -60.4998,
    "lon": 117.5,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T08:17:40Z",
    "sequence": 1793521060854
  }
}
```

```json
{
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "session_id": "06908b3b-c630-4e8a-8f29-bcf77818e525",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "last_heartbeat_at": "2026-11-01T08:17:40.924019Z",
  "last_location_at": "2026-11-01T08:17:40.924019Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b3d0693e-1d2a-4513-a0a8-5b710fccb5bd/arrive` → **200**

```json
{
  "command_id": "5cb5cdf2-5d57-419c-998f-5225a541f19a",
  "expected_version": 0
}
```

```json
{
  "id": "b3d0693e-1d2a-4513-a0a8-5b710fccb5bd",
  "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "assignment_id": "75c80967-8f86-4ec7-94f1-f99084efa3ef",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T08:17:41.245114Z",
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

`POST /api/driver/v1/trips/b3d0693e-1d2a-4513-a0a8-5b710fccb5bd/start` → **200**

```json
{
  "command_id": "f06cd092-6c6c-4c38-ae2e-1f994ba99f0d",
  "expected_version": 1
}
```

```json
{
  "id": "b3d0693e-1d2a-4513-a0a8-5b710fccb5bd",
  "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "assignment_id": "75c80967-8f86-4ec7-94f1-f99084efa3ef",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T08:17:41.245114Z",
  "started_at": "2026-11-01T08:17:41.576085Z",
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

`POST /api/driver/v1/trips/b3d0693e-1d2a-4513-a0a8-5b710fccb5bd/complete` → **200**

```json
{
  "command_id": "46e8313f-2f27-47d9-b8d6-1b48e77e26b7",
  "expected_version": 2,
  "reported_at": "2026-11-01T08:17:41Z",
  "cash_received": true
}
```

```json
{
  "id": "b3d0693e-1d2a-4513-a0a8-5b710fccb5bd",
  "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "assignment_id": "75c80967-8f86-4ec7-94f1-f99084efa3ef",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T08:17:41.245114Z",
  "started_at": "2026-11-01T08:17:41.576085Z",
  "completed_at": "2026-11-01T08:17:41.914995Z",
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
  "session_id": "bc225bf2-0f80-4e9f-920f-dadbc3e1df1d",
  "subject": {
    "type": "STAFF",
    "id": "2f23c194-fd4b-4713-b91d-ad911f02bd36"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjIzYzE5NC1mZDRiLTQ3MTMtYjkxZC1hZDkxMWYwMmJkMzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1MjE5NjIsImlhdCI6MTc5MzUyMTA2MiwianRpIjoiOTMyNDNjMjItYzY1Yi00ODg1LTkxZDEtMDVlZGFjNGZlNTViIiwic2lkIjoiYmMyMjViZjItMGY4MC00ZTlmLTkyMGYtZGFkYmMzZTFkZjFkIn0.eK0_709GCxSPiykr9np9n_79OCCgweVtaEii8LfrxR4",
  "access_expires_at": "2026-11-01T08:32:42.544362272Z",
  "refresh_token": "-wUKsP0AiKGEKAUy9yDqswbDX5_ggGieqnlqVNvynNA",
  "refresh_expires_at": "2026-11-01T20:17:42.542845962Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "06c1eb26-5f64-4b13-ad79-a52c5f9287e5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  }
}
```

```json
{
  "id": "72042a78-6874-4ac0-bb43-49ae36a13ddf",
  "vehicle_class": "STANDARD",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "amount_minor": 21931,
  "currency": "UAH",
  "distance_m": 8077,
  "duration_s": 1163,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T08:22:42.859726Z",
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
  "command_id": "1403b35d-c15d-4d87-845a-5e34dc0e296e",
  "quote_id": "72042a78-6874-4ac0-bb43-49ae36a13ddf",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "caller": {
    "name": "Olena",
    "phone": "+380675701952"
  }
}
```

```json
{
  "id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21931,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-11-01T08:17:43.198521Z",
  "caller": {
    "name": "Olena",
    "phone": "+380675701952"
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
    "id": "00c3ec12-bae4-495d-9fda-e213d359d462",
    "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
    "expires_at": "2026-11-01T08:17:58.205569Z",
    "server_time": "2026-11-01T08:17:43.554460777Z",
    "seconds_left": 14,
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": -60.5,
      "lon": 117.5
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

`POST /api/driver/v1/offers/00c3ec12-bae4-495d-9fda-e213d359d462/accept` → **200**

```json
{
  "command_id": "385d4434-009b-4434-a6e9-bff0f738fcbc"
}
```

```json
{
  "id": "11885a0c-35dd-441d-8282-bdeaa0d8d845",
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6d11ffe5-9d3e-4afe-879e-98c0a0965ca1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6d11ffe5-9d3e-4afe-879e-98c0a0965ca1",
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "assignment_id": "11885a0c-35dd-441d-8282-bdeaa0d8d845",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
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
    "phone": "+380675701952"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/work-sessions/06908b3b-c630-4e8a-8f29-bcf77818e525/heartbeat` → **200**

```json
{
  "location": {
    "lat": -60.4998,
    "lon": 117.5,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T08:17:44Z",
    "sequence": 1793521064476
  }
}
```

```json
{
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "session_id": "06908b3b-c630-4e8a-8f29-bcf77818e525",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "last_heartbeat_at": "2026-11-01T08:17:44.495252Z",
  "last_location_at": "2026-11-01T08:17:44.495252Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6d11ffe5-9d3e-4afe-879e-98c0a0965ca1/arrive` → **200**

```json
{
  "command_id": "46dc6f6d-160f-4b87-a9bd-66d63228c8c9",
  "expected_version": 0
}
```

```json
{
  "id": "6d11ffe5-9d3e-4afe-879e-98c0a0965ca1",
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "assignment_id": "11885a0c-35dd-441d-8282-bdeaa0d8d845",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T08:17:44.807791Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Olena",
    "phone": "+380675701952"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/6d11ffe5-9d3e-4afe-879e-98c0a0965ca1/start` → **200**

```json
{
  "command_id": "b7a8bdf4-b45a-4e74-a4a9-09e55e1f6df6",
  "expected_version": 1
}
```

```json
{
  "id": "6d11ffe5-9d3e-4afe-879e-98c0a0965ca1",
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "assignment_id": "11885a0c-35dd-441d-8282-bdeaa0d8d845",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T08:17:44.807791Z",
  "started_at": "2026-11-01T08:17:45.132216Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Olena",
    "phone": "+380675701952"
  },
  "comment": null,
  "entrance": null,
  "contact_attempts": []
}
```

`POST /api/driver/v1/trips/6d11ffe5-9d3e-4afe-879e-98c0a0965ca1/complete` → **200**

```json
{
  "command_id": "3aee2fc5-29be-485a-ae93-ae71c2b4b526",
  "expected_version": 2,
  "reported_at": "2026-11-01T08:17:45Z",
  "cash_received": true
}
```

```json
{
  "id": "6d11ffe5-9d3e-4afe-879e-98c0a0965ca1",
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "assignment_id": "11885a0c-35dd-441d-8282-bdeaa0d8d845",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": -60.5,
    "lon": 117.5
  },
  "pickup_label": "Pier",
  "dropoff": {
    "lat": -60.45,
    "lon": 117.55
  },
  "dropoff_label": "Station",
  "payment_method": "CASH",
  "price_minor": 21931,
  "currency": "UAH",
  "arrived_at": "2026-11-01T08:17:44.807791Z",
  "started_at": "2026-11-01T08:17:45.132216Z",
  "completed_at": "2026-11-01T08:17:45.458767Z",
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

`GET /api/admin/v1/orders/cfb035f2-f731-40c4-aa47-af5f520234c8/fare` → **200**

```json
{
  "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "7942934e-043f-4364-a2af-7efab6b1e1f2",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T08:17:41.921339Z",
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

Order cfb035f2-f731-40c4-aa47-af5f520234c8: accounting `POSTED`.

`GET /api/admin/v1/orders/36edb94b-ef9b-4126-af6e-7beaef4663cf/fare` → **200**

```json
{
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "37bfe56a-5acb-449a-98a1-b3b160f857a8",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T08:17:45.461776Z",
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

`GET /api/admin/v1/orders/36edb94b-ef9b-4126-af6e-7beaef4663cf/fare` → **200**

```json
{
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "37bfe56a-5acb-449a-98a1-b3b160f857a8",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T08:17:45.461776Z",
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

Order 36edb94b-ef9b-4126-af6e-7beaef4663cf: accounting `POSTED`.

`GET /api/admin/v1/orders/cfb035f2-f731-40c4-aa47-af5f520234c8/fare` → **200**

```json
{
  "order_id": "cfb035f2-f731-40c4-aa47-af5f520234c8",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "7942934e-043f-4364-a2af-7efab6b1e1f2",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T08:17:41.921339Z",
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

`GET /api/admin/v1/orders/36edb94b-ef9b-4126-af6e-7beaef4663cf/fare` → **200**

```json
{
  "order_id": "36edb94b-ef9b-4126-af6e-7beaef4663cf",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "37bfe56a-5acb-449a-98a1-b3b160f857a8",
      "version": 1,
      "amount_minor": 21931,
      "commission_minor": 3290,
      "driver_share_minor": 18641,
      "created_at": "2026-11-01T08:17:45.461776Z",
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

`GET /api/driver/v1/earnings?city_id=483990c8-3331-4721-9fa4-f8c02515b595&from=2026-11-01&to=2026-11-01` → **200**

```json
{
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-11-01",
  "to": "2026-11-01",
  "days": [
    {
      "date": "2026-11-01",
      "figures": {
        "trips": 2,
        "fare_minor": 43862,
        "commission_minor": 6580,
        "driver_share_minor": 37282,
        "held_minor": 0,
        "cash_minor": 43862,
        "cashless_minor": 0,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -6580
      }
    }
  ],
  "total": {
    "trips": 2,
    "fare_minor": 43862,
    "commission_minor": 6580,
    "driver_share_minor": 37282,
    "held_minor": 0,
    "cash_minor": 43862,
    "cashless_minor": 0,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -6580
  },
  "balance_minor": -6580,
  "pending": {
    "trips": 0,
    "fare_minor": 0
  }
}
```

Earnings today: {"trips":2,"fares":43862,"commission":6580,"balance":-6580}.

`GET /api/admin/v1/reports/finance?city_id=483990c8-3331-4721-9fa4-f8c02515b595&from=2026-11-01&to=2026-11-01` → **200**

```json
{
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-11-01",
  "to": "2026-11-01",
  "from_utc": "2026-10-31T22:00:00Z",
  "to_utc": "2026-11-01T22:00:00Z",
  "days": [
    {
      "date": "2026-11-01",
      "from_utc": "2026-10-31T22:00:00Z",
      "to_utc": "2026-11-01T22:00:00Z",
      "figures": {
        "trips": 2,
        "fares_minor": 43862,
        "service_rides_minor": 0,
        "commission_minor": 6580,
        "driver_share_minor": 37282,
        "discounts_minor": 0,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 0,
        "paid_with_bonuses_minor": 0,
        "collected_by_drivers_minor": 43862,
        "tips_minor": 0,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 2,
    "fares_minor": 43862,
    "service_rides_minor": 0,
    "commission_minor": 6580,
    "driver_share_minor": 37282,
    "discounts_minor": 0,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 0,
    "paid_with_bonuses_minor": 0,
    "collected_by_drivers_minor": 43862,
    "tips_minor": 0,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-11-01T08:17:48.645727733Z"
}
```

The city's money report today: {"trips":2,"fares":43862,"commission":6580}.

Done: city 483990c8-3331-4721-9fa4-f8c02515b595, driver 02ef0ef1-1a55-4a44-a07d-fbdabbf05620 approved through the API; app order cfb035f2-f731-40c4-aa47-af5f520234c8 and phone order 36edb94b-ef9b-4126-af6e-7beaef4663cf posted.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "session_id": "06908b3b-c630-4e8a-8f29-bcf77818e525",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "vehicle_id": "2390d208-00a4-48ff-bf41-ff89fabe7cca",
  "last_heartbeat_at": "2026-11-01T08:17:44.495252Z",
  "last_location_at": "2026-11-01T08:17:44.495252Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06908b3b-c630-4e8a-8f29-bcf77818e525/close` → **200**

```json
{
  "command_id": "ff3be8da-12c7-45cf-bb17-4fb42169f323",
  "expected_version": 0
}
```

```json
{
  "driver_id": "02ef0ef1-1a55-4a44-a07d-fbdabbf05620",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
      "id": "483990c8-3331-4721-9fa4-f8c02515b595",
      "code": "sandbox-first-117-27103",
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
                117,
                -61
              ],
              [
                118,
                -61
              ],
              [
                118,
                -60
              ],
              [
                117,
                -60
              ],
              [
                117,
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

`POST /api/admin/v1/cities/483990c8-3331-4721-9fa4-f8c02515b595/archive` → **200**

```json
{
  "command_id": "ae4f1ee3-4b24-4b57-b892-93c6af60ee2f",
  "expected_version": 1,
  "reason": "Sandbox: first city done"
}
```

```json
{
  "id": "483990c8-3331-4721-9fa4-f8c02515b595",
  "state": "ARCHIVED",
  "version": 2
}
```
