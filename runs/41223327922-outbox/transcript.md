# Fault tests (2026-10-31T17:12:17Z, 8b135d5, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671011326",
  "device_ref": "sandbox-28881"
}
```

```json
{
  "challenge_id": "9c20c355-7d2e-4bc5-b265-a89566a20d46",
  "expires_at": "2026-10-31T17:17:29.302831365Z",
  "resend_available_at": "2026-10-31T17:12:30.302831365Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671011326` → **200**

```json
{
  "phone": "+380671011326",
  "audience": "CLIENT",
  "code": "311115",
  "sent_at": "2026-10-31T17:12:29.317569172Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c20c355-7d2e-4bc5-b265-a89566a20d46",
  "code": "311115",
  "device_ref": "sandbox-28881"
}
```

```json
{
  "session_id": "97f47ac1-bd1d-47a2-bfa5-8d8b7217d8cf",
  "subject": {
    "type": "CLIENT",
    "id": "9d61aa67-c6aa-4d0a-bdcc-c44c10d88d03"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDYxYWE2Ny1jNmFhLTRkMGEtYmRjYy1jNDRjMTBkODhkMDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3NjU0LCJpYXQiOjE3OTM0NjY3NTQsImp0aSI6IjZjZjk0NGE1LThlNDYtNDM2Ny1iMDc4LWI1YjI1ZTgwNTdhNCIsInNpZCI6Ijk3ZjQ3YWMxLWJkMWQtNDdhMi1iZmE1LThkOGI3MjE3ZDhjZiJ9.rUO02hupX4kdEag3v3_oL8kIR35UHVzS4imr7Ic5Id4",
  "access_expires_at": "2026-10-31T17:27:34.740189546Z",
  "refresh_token": "jZmCuJ8rCLF0h8QIXdvpEFUwP8-oEWFaQJ33x1lyUaY",
  "refresh_expires_at": "2026-11-30T17:12:34.738253097Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10454"
}
```

```json
{
  "challenge_id": "5ba29ae6-a47b-403e-ad8b-5434ad65297e",
  "expires_at": "2026-10-31T17:17:35.039883746Z",
  "resend_available_at": "2026-10-31T17:12:36.039883746Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "634632",
  "sent_at": "2026-10-31T17:12:35.044733275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ba29ae6-a47b-403e-ad8b-5434ad65297e",
  "code": "634632",
  "device_ref": "sandbox-10454"
}
```

```json
{
  "session_id": "68d259b0-957e-463b-b1ca-68d91e6e3f96",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzY1NSwiaWF0IjoxNzkzNDY2NzU1LCJqdGkiOiIzN2JkZTM2NS1hNDk4LTQ2OGMtYTllZi1hN2NhOGJiMDcwYjIiLCJzaWQiOiI2OGQyNTliMC05NTdlLTQ2M2ItYjFjYS02OGQ5MWU2ZTNmOTYifQ.XCBjnUDcc_coMhRBaFMH8IGzca43CO8VUB62xCKYPkI",
  "access_expires_at": "2026-10-31T17:27:35.328259068Z",
  "refresh_token": "DzCPAxH77EX8dujhnc4-r1wJ4sK_KwBWwaiqcxDDoA8",
  "refresh_expires_at": "2026-11-30T17:12:35.327350709Z",
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
  "command_id": "813eb48a-8824-4bac-8b31-0bad78c02a6c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:12:35Z",
    "sequence": 1793466755877
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "154948ed-b344-46ad-a7b7-543e81c2501c",
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
  "last_heartbeat_at": "2026-10-31T17:12:36.074698Z",
  "last_location_at": "2026-10-31T17:12:36.074698Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2f9aa274-7ee7-4c5f-b508-7e788abbf4d0",
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
  "id": "71d461b2-7403-4136-b96b-a1b199f66a6e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:17:36.399909Z",
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
  "command_id": "0d4a85a7-5352-4cab-b52a-5f29e5288531",
  "quote_id": "71d461b2-7403-4136-b96b-a1b199f66a6e",
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
  "id": "ba422ddf-935d-4f93-b6e0-9d01925bb231",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d61aa67-c6aa-4d0a-bdcc-c44c10d88d03",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T17:12:36.760062Z",
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
    "id": "b4ffbeb0-3d63-4028-98d3-d57b8583f65a",
    "order_id": "ba422ddf-935d-4f93-b6e0-9d01925bb231",
    "expires_at": "2026-10-31T17:12:51.769295Z",
    "server_time": "2026-10-31T17:12:37.079303616Z",
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
    "distance_m": 44,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

The first accept: HTTP 000 (000: the connection was cut).
Crash point dispatch.after-accept reached: halting as kill -9 would

The server halted at its crash point (exit 137).

Server start 2.

`POST /api/driver/v1/offers/b4ffbeb0-3d63-4028-98d3-d57b8583f65a/accept` → **200**

```json
{
  "command_id": "375c3021-0ff3-4856-ad2a-9f46183cec0e"
}
```

```json
{
  "id": "4b9fd3e8-8387-48f7-94cc-62b09c3b54b6",
  "order_id": "ba422ddf-935d-4f93-b6e0-9d01925bb231",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b40a9653-0e1d-4069-a333-128a13aa99fa",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b40a9653-0e1d-4069-a333-128a13aa99fa",
  "order_id": "ba422ddf-935d-4f93-b6e0-9d01925bb231",
  "assignment_id": "4b9fd3e8-8387-48f7-94cc-62b09c3b54b6",
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

`POST /api/driver/v1/work-sessions/154948ed-b344-46ad-a7b7-543e81c2501c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:12:46Z",
    "sequence": 1793466766755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "154948ed-b344-46ad-a7b7-543e81c2501c",
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
  "last_heartbeat_at": "2026-10-31T17:12:46.841835Z",
  "last_location_at": "2026-10-31T17:12:46.841835Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b40a9653-0e1d-4069-a333-128a13aa99fa/arrive` → **200**

```json
{
  "command_id": "d081f6ce-a5a1-4940-8593-cce1ba1a3aa4",
  "expected_version": 0
}
```

```json
{
  "id": "b40a9653-0e1d-4069-a333-128a13aa99fa",
  "order_id": "ba422ddf-935d-4f93-b6e0-9d01925bb231",
  "assignment_id": "4b9fd3e8-8387-48f7-94cc-62b09c3b54b6",
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
  "arrived_at": "2026-10-31T17:12:47.154058Z",
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

`POST /api/driver/v1/trips/b40a9653-0e1d-4069-a333-128a13aa99fa/start` → **200**

```json
{
  "command_id": "6e2907ea-1b06-420d-8c30-bd26c85c48a1",
  "expected_version": 1
}
```

```json
{
  "id": "b40a9653-0e1d-4069-a333-128a13aa99fa",
  "order_id": "ba422ddf-935d-4f93-b6e0-9d01925bb231",
  "assignment_id": "4b9fd3e8-8387-48f7-94cc-62b09c3b54b6",
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
  "arrived_at": "2026-10-31T17:12:47.154058Z",
  "started_at": "2026-10-31T17:12:47.449143Z",
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
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "154948ed-b344-46ad-a7b7-543e81c2501c",
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
  "last_heartbeat_at": "2026-10-31T17:12:46.841835Z",
  "last_location_at": "2026-10-31T17:12:46.841835Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/154948ed-b344-46ad-a7b7-543e81c2501c/close` → **200**

```json
{
  "command_id": "66c188b5-7fdb-4db1-9c79-91ca5a803352",
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

## Outbox: one consumer handled TripCompleted, the server dies before the others and the DONE mark

Server start 3, armed at `outbox.after-handler:TripCompleted/notification.order-live-feed`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677993980",
  "device_ref": "sandbox-18296"
}
```

```json
{
  "challenge_id": "73626f75-1ff8-4ceb-93be-b7e62bd8a488",
  "expires_at": "2026-10-31T17:17:58.347907794Z",
  "resend_available_at": "2026-10-31T17:12:59.347907794Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677993980` → **200**

```json
{
  "phone": "+380677993980",
  "audience": "CLIENT",
  "code": "560691",
  "sent_at": "2026-10-31T17:12:58.361113262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73626f75-1ff8-4ceb-93be-b7e62bd8a488",
  "code": "560691",
  "device_ref": "sandbox-18296"
}
```

```json
{
  "session_id": "97e06b1e-1475-4614-b4b1-b84eee4ab14b",
  "subject": {
    "type": "CLIENT",
    "id": "00184c67-d913-45c6-82d7-2bc775ef3654"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMDE4NGM2Ny1kOTEzLTQ1YzYtODJkNy0yYmM3NzVlZjM2NTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3Njc4LCJpYXQiOjE3OTM0NjY3NzgsImp0aSI6ImI1N2E5NzIwLTViNmUtNDNhNS1iYzM4LWQwYzBhZGUxNzEwOCIsInNpZCI6Ijk3ZTA2YjFlLTE0NzUtNDYxNC1iNGIxLWI4NGVlZTRhYjE0YiJ9.p4O7ZWAFHbykh7mo_9Bcd3771HeU7aJrkHdcTusPWC4",
  "access_expires_at": "2026-10-31T17:27:58.689941512Z",
  "refresh_token": "ZoRIQ_L9uHa3WVwqBwSWF5tNnEgWsPFyyUKUzZkhqQk",
  "refresh_expires_at": "2026-11-30T17:12:58.687687756Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30780"
}
```

```json
{
  "challenge_id": "3f291ec4-f9b0-4c44-b8f4-e5a86ef0626c",
  "expires_at": "2026-10-31T17:17:58.994303936Z",
  "resend_available_at": "2026-10-31T17:12:59.994303936Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "195350",
  "sent_at": "2026-10-31T17:12:58.999481027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f291ec4-f9b0-4c44-b8f4-e5a86ef0626c",
  "code": "195350",
  "device_ref": "sandbox-30780"
}
```

```json
{
  "session_id": "eb52845f-b61b-4df5-b664-f8ff6b352823",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzY3OSwiaWF0IjoxNzkzNDY2Nzc5LCJqdGkiOiI2Yjk0MDYyZS00N2YwLTRmZmUtYTlhOS03MDk3MTQ5MjVhNjAiLCJzaWQiOiJlYjUyODQ1Zi1iNjFiLTRkZjUtYjY2NC1mOGZmNmIzNTI4MjMifQ.AytnwfbY0FhqMFAGPwkB4lZaJ6maxX4MMzElMPlOK7I",
  "access_expires_at": "2026-10-31T17:27:59.282946171Z",
  "refresh_token": "8fI0seGv-z_J4Rib_YoppBebjE1LTiSZ899VbrUzZN0",
  "refresh_expires_at": "2026-11-30T17:12:59.282034261Z",
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
  "command_id": "a890353f-3f0a-4cdb-98da-e6e3b7b11989",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:12:59Z",
    "sequence": 1793466779827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9959d17e-604d-482f-8b27-42bef7007b54",
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
  "last_heartbeat_at": "2026-10-31T17:12:59.884236Z",
  "last_location_at": "2026-10-31T17:12:59.884236Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1697d929-25ea-4b97-a3a3-cf6902443726",
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
  "id": "b470f012-e64f-4239-b815-4f90ae681495",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:18:00.232732Z",
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
  "command_id": "a19e2d34-c934-42aa-aecd-dda73690c979",
  "quote_id": "b470f012-e64f-4239-b815-4f90ae681495",
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
  "id": "6d68f26c-3509-4271-abe1-86c19db52ed2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00184c67-d913-45c6-82d7-2bc775ef3654",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T17:13:00.57953Z",
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
    "id": "57a4dbd3-7400-404c-810a-fce2437ed0c1",
    "order_id": "6d68f26c-3509-4271-abe1-86c19db52ed2",
    "expires_at": "2026-10-31T17:13:15.590203Z",
    "server_time": "2026-10-31T17:13:00.914543273Z",
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
    "distance_m": 44,
    "price_kind": "FIXED",
    "expected_earnings_minor": 8939,
    "comment": null,
    "entrance": null
  }
]
```

`POST /api/driver/v1/offers/57a4dbd3-7400-404c-810a-fce2437ed0c1/accept` → **200**

```json
{
  "command_id": "55284c7e-708f-4343-83f1-7db0a808a0d2"
}
```

```json
{
  "id": "e2fcf31a-0187-41d2-8505-1c1c62cc1889",
  "order_id": "6d68f26c-3509-4271-abe1-86c19db52ed2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b629fea4-2dee-4495-8114-98dd93a21287",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b629fea4-2dee-4495-8114-98dd93a21287",
  "order_id": "6d68f26c-3509-4271-abe1-86c19db52ed2",
  "assignment_id": "e2fcf31a-0187-41d2-8505-1c1c62cc1889",
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

`POST /api/driver/v1/work-sessions/9959d17e-604d-482f-8b27-42bef7007b54/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:13:01Z",
    "sequence": 1793466781746
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9959d17e-604d-482f-8b27-42bef7007b54",
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
  "last_heartbeat_at": "2026-10-31T17:13:01.774926Z",
  "last_location_at": "2026-10-31T17:13:01.774926Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b629fea4-2dee-4495-8114-98dd93a21287/arrive` → **200**

```json
{
  "command_id": "41b2776b-ec0c-4ce0-9bd2-483e3d0b20a4",
  "expected_version": 0
}
```

```json
{
  "id": "b629fea4-2dee-4495-8114-98dd93a21287",
  "order_id": "6d68f26c-3509-4271-abe1-86c19db52ed2",
  "assignment_id": "e2fcf31a-0187-41d2-8505-1c1c62cc1889",
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
  "arrived_at": "2026-10-31T17:13:02.057607Z",
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

`POST /api/driver/v1/trips/b629fea4-2dee-4495-8114-98dd93a21287/start` → **200**

```json
{
  "command_id": "f62352d7-24a6-4c42-9901-c94b871532c2",
  "expected_version": 1
}
```

```json
{
  "id": "b629fea4-2dee-4495-8114-98dd93a21287",
  "order_id": "6d68f26c-3509-4271-abe1-86c19db52ed2",
  "assignment_id": "e2fcf31a-0187-41d2-8505-1c1c62cc1889",
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
  "arrived_at": "2026-10-31T17:13:02.057607Z",
  "started_at": "2026-10-31T17:13:02.36107Z",
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
Crash point outbox.after-handler:TripCompleted/notification.order-live-feed reached: halting as kill -9 would

The server halted at its crash point (exit 137).

TripCompleted 4129edb6-f616-4ca0-a790-b4f2a8894889: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **2** (sent before the crash, not again after it).

**The live message went out 2 times.**
