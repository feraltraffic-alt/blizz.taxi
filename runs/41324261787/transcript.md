# Sandbox transcript (2026-11-01T16:03:36Z, 4e62c6c)

# Scenario: rider-repayment

## Ivan drives a rider who pays cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30451"
}
```

```json
{
  "challenge_id": "c348e6fc-d8e8-4a51-885c-c2d2538b7fad",
  "expires_at": "2026-11-01T16:08:36.807259974Z",
  "resend_available_at": "2026-11-01T16:03:37.807259974Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "671646",
  "sent_at": "2026-11-01T16:03:36.825638065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c348e6fc-d8e8-4a51-885c-c2d2538b7fad",
  "code": "671646",
  "device_ref": "sandbox-30451"
}
```

```json
{
  "session_id": "11a4d4bd-e3aa-4060-b9e2-63691b47660f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzU0OTkyMywiaWF0IjoxNzkzNTQ5MDIzLCJqdGkiOiI2NGE3Y2Q2My0wMzJkLTRkNDktODI4ZC0xZDkzMGY1NjEzNDQiLCJzaWQiOiIxMWE0ZDRiZC1lM2FhLTQwNjAtYjllMi02MzY5MWI0NzY2MGYifQ.svTODwFvJ1YnB1IZwPTJ3Rx0SwrOr_Ihzo-xN_C1IGM",
  "access_expires_at": "2026-11-01T16:18:43.905753557Z",
  "refresh_token": "9gEqg3sTF2RRKZm3SXK7a9AqyW2D4Col0i04X1FRsso",
  "refresh_expires_at": "2026-12-01T16:03:43.903659159Z",
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
  "device_ref": "sandbox-11458"
}
```

```json
{
  "challenge_id": "da1fc261-936a-4c46-a3e7-5d279af4295a",
  "expires_at": "2026-11-01T16:08:44.571642389Z",
  "resend_available_at": "2026-11-01T16:03:45.571642389Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "256663",
  "sent_at": "2026-11-01T16:03:44.577237843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da1fc261-936a-4c46-a3e7-5d279af4295a",
  "code": "256663",
  "device_ref": "sandbox-11458"
}
```

```json
{
  "session_id": "dd6cd6d1-9490-4ddb-b64d-5b9b083359b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzU0OTkyNCwiaWF0IjoxNzkzNTQ5MDI0LCJqdGkiOiI5YWIxZDc4ZS01MjdmLTQ2ZmItYjcyMC1mY2UyM2ZhOGVmMGYiLCJzaWQiOiJkZDZjZDZkMS05NDkwLTRkZGItYjY0ZC01YjliMDgzMzU5YjUifQ.nV7R1K2be5FMb8tdfpTFOPPBUtRGrARcRjhl9T2uBOA",
  "access_expires_at": "2026-11-01T16:18:44.907774495Z",
  "refresh_token": "88XVGgBbuZZx0q_1BAvp5XOoYLKltVA2QIR0GG-KQb0",
  "refresh_expires_at": "2026-12-01T16:03:44.906698884Z",
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
  "device_ref": "sandbox-15263"
}
```

```json
{
  "challenge_id": "1b27076a-3bc4-4445-b92e-d45f3501d598",
  "expires_at": "2026-11-01T16:08:45.524858812Z",
  "resend_available_at": "2026-11-01T16:03:46.524858812Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "173299",
  "sent_at": "2026-11-01T16:03:45.530031851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b27076a-3bc4-4445-b92e-d45f3501d598",
  "code": "173299",
  "device_ref": "sandbox-15263"
}
```

```json
{
  "session_id": "897589f9-ab8f-4586-a796-a709e1c338b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzU0OTkyNSwiaWF0IjoxNzkzNTQ5MDI1LCJqdGkiOiJiZTY2NGZmMC1hOTliLTQ4ZGUtOWU1NC0zMGUzNTEwM2VmODIiLCJzaWQiOiI4OTc1ODlmOS1hYjhmLTQ1ODYtYTc5Ni1hNzA5ZTFjMzM4YjgifQ.l7cF-oNIZdEL_B-dseOdyG-dEZvfgI3YneXVO4zBkzg",
  "access_expires_at": "2026-11-01T16:18:45.857285528Z",
  "refresh_token": "0pmPra3mphne3hpJVI-gJyEEra9R0rj50jY8Vfh7ZJc",
  "refresh_expires_at": "2026-12-01T16:03:45.856221554Z",
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
  "device_ref": "sandbox-22853"
}
```

```json
{
  "challenge_id": "ac84b109-5094-462b-9593-dcb0282786d6",
  "expires_at": "2026-11-01T16:08:46.453402894Z",
  "resend_available_at": "2026-11-01T16:03:47.453402894Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "939811",
  "sent_at": "2026-11-01T16:03:46.458224191Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac84b109-5094-462b-9593-dcb0282786d6",
  "code": "939811",
  "device_ref": "sandbox-22853"
}
```

```json
{
  "session_id": "0a7d17e2-263c-4568-84c6-35af60cee654",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzU0OTkyNiwiaWF0IjoxNzkzNTQ5MDI2LCJqdGkiOiI4MjlkY2QwNy0xNTg4LTQ4YjQtYWQzZC05ZmQ2MWFmYmViMTAiLCJzaWQiOiIwYTdkMTdlMi0yNjNjLTQ1NjgtODRjNi0zNWFmNjBjZWU2NTQifQ.EBRowY92yKJjkxlX-11i1zkYjsXxmv_yDCnFy4a7dao",
  "access_expires_at": "2026-11-01T16:18:46.78102309Z",
  "refresh_token": "LsSANqMz67uLUIKcaYqYZfwUful1S_mGwf3Qmeq_xns",
  "refresh_expires_at": "2026-12-01T16:03:46.780011238Z",
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
  "command_id": "a11b2572-7fe0-4a8f-b539-16e9421a5775",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T16:03:47Z",
    "sequence": 1793549027392
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "876625be-f9a6-408c-b176-7ebbace9eeac",
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
  "last_heartbeat_at": "2026-11-01T16:03:47.519613Z",
  "last_location_at": "2026-11-01T16:03:47.519613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664489370",
  "device_ref": "sandbox-27448"
}
```

```json
{
  "challenge_id": "9c7b46d5-b031-4f1a-b73c-f7456ab0a428",
  "expires_at": "2026-11-01T16:08:47.848222322Z",
  "resend_available_at": "2026-11-01T16:03:48.848222322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664489370` → **200**

```json
{
  "phone": "+380664489370",
  "audience": "CLIENT",
  "code": "780581",
  "sent_at": "2026-11-01T16:03:47.853238436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c7b46d5-b031-4f1a-b73c-f7456ab0a428",
  "code": "780581",
  "device_ref": "sandbox-27448"
}
```

```json
{
  "session_id": "6da99624-5322-46bd-ac89-0a51d681d601",
  "subject": {
    "type": "CLIENT",
    "id": "5f528c07-d605-44cb-9de2-2eda6cd39651"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjUyOGMwNy1kNjA1LTQ0Y2ItOWRlMi0yZWRhNmNkMzk2NTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTQ5OTI4LCJpYXQiOjE3OTM1NDkwMjgsImp0aSI6IjI0ZDYwYzRlLTdhMjEtNDM2YS1iYjA1LTdkNzE4MWU2YTgxNCIsInNpZCI6IjZkYTk5NjI0LTUzMjItNDZiZC1hYzg5LTBhNTFkNjgxZDYwMSJ9.gLOmMd5xf4yufNrnBwCefa74UbNpJd_cOt230BL0y3w",
  "access_expires_at": "2026-11-01T16:18:48.180136068Z",
  "refresh_token": "ADCxKvIfAgZPmgMmq-OfraLeB1l40ZP4shd5DawUM3U",
  "refresh_expires_at": "2026-12-01T16:03:48.179110694Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "91dbe946-94f6-40da-8d8e-d645be2d2d30",
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
  "id": "641a2b64-bc49-45e5-8eab-ebcdc8cf072a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T16:08:48.502873Z",
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
  "promotions": [],
  "payment_methods": [
    "CARD",
    "CASH"
  ],
  "card_hold_minor": 10517
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6ad82955-d955-4378-a8ad-b7fa2a41a835",
  "quote_id": "641a2b64-bc49-45e5-8eab-ebcdc8cf072a",
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
  "id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f528c07-d605-44cb-9de2-2eda6cd39651",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-11-01T16:03:48.912552Z",
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
    "id": "e820e4ac-3f48-4370-a6fc-06eb43336737",
    "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
    "expires_at": "2026-11-01T16:04:03.924553Z",
    "server_time": "2026-11-01T16:03:49.302275063Z",
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
    "distance_m": 22,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/e820e4ac-3f48-4370-a6fc-06eb43336737/accept` → **200**

```json
{
  "command_id": "04ba7ed0-b01b-4980-87e5-e74db57348f5"
}
```

```json
{
  "id": "5ece1aae-fe36-4104-a793-4e41ab31f87f",
  "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5e5ae4ab-63cf-4620-ba63-3b4192d552b5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e5ae4ab-63cf-4620-ba63-3b4192d552b5",
  "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "assignment_id": "5ece1aae-fe36-4104-a793-4e41ab31f87f",
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

`POST /api/driver/v1/work-sessions/876625be-f9a6-408c-b176-7ebbace9eeac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T16:03:50Z",
    "sequence": 1793549030290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "876625be-f9a6-408c-b176-7ebbace9eeac",
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
  "last_heartbeat_at": "2026-11-01T16:03:50.314002Z",
  "last_location_at": "2026-11-01T16:03:50.314002Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5e5ae4ab-63cf-4620-ba63-3b4192d552b5/arrive` → **200**

```json
{
  "command_id": "b1288a9c-a7d1-4de7-b9e2-e71dfd8996c3",
  "expected_version": 0
}
```

```json
{
  "id": "5e5ae4ab-63cf-4620-ba63-3b4192d552b5",
  "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "assignment_id": "5ece1aae-fe36-4104-a793-4e41ab31f87f",
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
  "arrived_at": "2026-11-01T16:03:50.648282Z",
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

`POST /api/driver/v1/trips/5e5ae4ab-63cf-4620-ba63-3b4192d552b5/start` → **200**

```json
{
  "command_id": "a4b5342f-fe49-4b65-9f9f-39baf058df4a",
  "expected_version": 1
}
```

```json
{
  "id": "5e5ae4ab-63cf-4620-ba63-3b4192d552b5",
  "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "assignment_id": "5ece1aae-fe36-4104-a793-4e41ab31f87f",
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
  "arrived_at": "2026-11-01T16:03:50.648282Z",
  "started_at": "2026-11-01T16:03:50.977324Z",
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

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/876625be-f9a6-408c-b176-7ebbace9eeac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T16:04:39Z",
    "sequence": 1793549079304
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "876625be-f9a6-408c-b176-7ebbace9eeac",
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
  "last_heartbeat_at": "2026-11-01T16:04:39.324634Z",
  "last_location_at": "2026-11-01T16:04:39.324634Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5e5ae4ab-63cf-4620-ba63-3b4192d552b5/complete` → **200**

```json
{
  "command_id": "e6fca36a-6796-43f1-bbff-64698ba39e2a",
  "expected_version": 2,
  "reported_at": "2026-11-01T16:04:39Z",
  "cash_received": true
}
```

```json
{
  "id": "5e5ae4ab-63cf-4620-ba63-3b4192d552b5",
  "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "assignment_id": "5ece1aae-fe36-4104-a793-4e41ab31f87f",
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
  "arrived_at": "2026-11-01T16:03:50.648282Z",
  "started_at": "2026-11-01T16:03:50.977324Z",
  "completed_at": "2026-11-01T16:04:39.646317Z",
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
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "876625be-f9a6-408c-b176-7ebbace9eeac",
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
  "last_heartbeat_at": "2026-11-01T16:04:39.324634Z",
  "last_location_at": "2026-11-01T16:04:39.324634Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/876625be-f9a6-408c-b176-7ebbace9eeac/close` → **200**

```json
{
  "command_id": "005c9bf6-8a1b-499e-9417-feb4a4e742cf",
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

## Staff raise the final fare by 42.00: the rider owes it

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
  "correlation_id": "8db4c4cb-e711-48dc-b34c-4ed461657d09"
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
  "session_id": "bde0829a-e978-4c86-8571-f48a7cefca14",
  "subject": {
    "type": "STAFF",
    "id": "664be2d5-09eb-4957-9952-f6764964977c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjRiZTJkNS0wOWViLTQ5NTctOTk1Mi1mNjc2NDk2NDk3N2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1NDk5ODEsImlhdCI6MTc5MzU0OTA4MSwianRpIjoiNWEyNzJhOGItMmMwYy00NzJiLTk3OTAtYmJiNDJjMjhkMWJhIiwic2lkIjoiYmRlMDgyOWEtZTk3OC00Yzg2LTg1NzEtZjQ4YTdjZWZjYTE0In0.zhggOUdK5qbLJ41uVDBLJrcLMxzfjZ6yzUeBkwao448",
  "access_expires_at": "2026-11-01T16:19:41.494512372Z",
  "refresh_token": "gADixh0aAE46fwX6zC_AOsS9NlnHtPLkvHYBDDYKcas",
  "refresh_expires_at": "2026-11-02T04:04:41.493789307Z",
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
  "session_id": "eb00343a-a0c3-4634-9410-a110912ce7ad",
  "subject": {
    "type": "STAFF",
    "id": "664be2d5-09eb-4957-9952-f6764964977c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjRiZTJkNS0wOWViLTQ5NTctOTk1Mi1mNjc2NDk2NDk3N2MiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1NDk5ODMsImlhdCI6MTc5MzU0OTA4MywianRpIjoiYjVmZjgxNzctYjA4OC00ZjljLWIwNWYtMGU0MDZiNzUzOWY0Iiwic2lkIjoiZWIwMDM0M2EtYTBjMy00NjM0LTk0MTAtYTExMDkxMmNlN2FkIn0.97IAbWpNViIdW37tOGTuJkWeu1snbXQMKmCaUR3giCM",
  "access_expires_at": "2026-11-01T16:19:43.203425768Z",
  "refresh_token": "5iIsLwF5hSKMjZPgxepu4JIDtG7sdaaGCVy_BH0oztA",
  "refresh_expires_at": "2026-11-02T04:04:43.201344537Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8d46fe5e-7740-4e31-b97e-0a36d0b1c536/fare` → **200**

```json
{
  "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "currency": "UAH",
  "current_version": 1,
  "versions": [
    {
      "id": "39fd911b-0105-4314-bb2f-0055e7ec5b29",
      "version": 1,
      "amount_minor": 10517,
      "commission_minor": 1578,
      "driver_share_minor": 8939,
      "created_at": "2026-11-01T16:04:39.653237Z",
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

`POST /api/admin/v1/orders/8d46fe5e-7740-4e31-b97e-0a36d0b1c536/fare-corrections` → **200**

```json
{
  "command_id": "84f074eb-1315-4eb4-a210-716f45263eb9",
  "expected_version": 1,
  "amount_minor": 14717,
  "reason": "Sandbox: the waiting time was not counted",
  "password": "Sandbox-Admin-2026-ok"
}
```

```json
{
  "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
  "currency": "UAH",
  "current_version": 2,
  "versions": [
    {
      "id": "39fd911b-0105-4314-bb2f-0055e7ec5b29",
      "version": 1,
      "amount_minor": 10517,
      "commission_minor": 1578,
      "driver_share_minor": 8939,
      "created_at": "2026-11-01T16:04:39.653237Z",
      "corrects_id": null,
      "reason": null,
      "author_id": null
    },
    {
      "id": "fc7dc340-d7f9-48a1-a76f-5179b44d8e56",
      "version": 2,
      "amount_minor": 14717,
      "commission_minor": 2208,
      "driver_share_minor": 12509,
      "created_at": "2026-11-01T16:04:44.134658Z",
      "corrects_id": "39fd911b-0105-4314-bb2f-0055e7ec5b29",
      "reason": "Sandbox: the waiting time was not counted",
      "author_id": "664be2d5-09eb-4957-9952-f6764964977c"
    }
  ],
  "refund_obligation_minor": 0,
  "refund_state": "NONE",
  "accounting": "POSTED"
}
```

## The rider sees what is owed on the order

`GET /api/rider/v1/obligations` → **200**

```json
{
  "items": [
    {
      "order_id": "8d46fe5e-7740-4e31-b97e-0a36d0b1c536",
      "currency": "UAH",
      "owed_minor": 14717,
      "paid_minor": 10517,
      "remainder_minor": 4200,
      "repayments": []
    }
  ]
}
```

## While the rider owes, a new order is refused at once (owner decision 01.11.2026, ADR 0014)

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4281ded4-2813-4179-a32a-9a675a3bb6b9",
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
  "id": "8191cd53-dd40-4937-82c0-c9af569c23cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T16:09:44.778530Z",
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
  "promotions": [],
  "payment_methods": [
    "CARD",
    "CASH"
  ],
  "card_hold_minor": 10517
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b4917524-f19f-41b4-93a6-0a07fe83da79",
  "quote_id": "8191cd53-dd40-4937-82c0-c9af569c23cf",
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
  "id": "957434ac-fc18-42c5-9d04-f35da0232a40",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f528c07-d605-44cb-9de2-2eda6cd39651",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-11-01T16:04:45.108474Z",
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

**Expected 403, got 201 — scenario stopped.**
