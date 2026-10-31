# Fault tests (2026-10-31T17:21:53Z, 8d71ec1, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673569030",
  "device_ref": "sandbox-2088"
}
```

```json
{
  "challenge_id": "5784074d-4998-4af0-bc3b-208c63085b1e",
  "expires_at": "2026-10-31T17:27:05.156128381Z",
  "resend_available_at": "2026-10-31T17:22:06.156128381Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673569030` → **200**

```json
{
  "phone": "+380673569030",
  "audience": "CLIENT",
  "code": "671967",
  "sent_at": "2026-10-31T17:22:05.173479041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5784074d-4998-4af0-bc3b-208c63085b1e",
  "code": "671967",
  "device_ref": "sandbox-2088"
}
```

```json
{
  "session_id": "8cb6bb69-0c46-4961-8424-de3dfc7da1a8",
  "subject": {
    "type": "CLIENT",
    "id": "a66a9db1-3292-4689-8f1d-396dcfad78c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjZhOWRiMS0zMjkyLTQ2ODktOGYxZC0zOTZkY2ZhZDc4YzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY4MjMyLCJpYXQiOjE3OTM0NjczMzIsImp0aSI6ImYwZDJjZDUzLWFkYWQtNGU0NC1iODQ1LTE1ZjM0OTNjMDdkNSIsInNpZCI6IjhjYjZiYjY5LTBjNDYtNDk2MS04NDI0LWRlM2RmYzdkYTFhOCJ9.HIoY-TPg9Wh4XdXxLAWRCisa380TLkKb2juPLBZdhDM",
  "access_expires_at": "2026-10-31T17:37:12.485014421Z",
  "refresh_token": "DMZCpwPnx8HlcvlX_dFVaxR4Md4h9m_EKIJkh18WCUQ",
  "refresh_expires_at": "2026-11-30T17:22:12.483022974Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11693"
}
```

```json
{
  "challenge_id": "a27c7ad6-51eb-4edf-975c-dd1c46a6df22",
  "expires_at": "2026-10-31T17:27:12.892487728Z",
  "resend_available_at": "2026-10-31T17:22:13.892487728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "746137",
  "sent_at": "2026-10-31T17:22:12.897741871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a27c7ad6-51eb-4edf-975c-dd1c46a6df22",
  "code": "746137",
  "device_ref": "sandbox-11693"
}
```

```json
{
  "session_id": "cfed7747-7b8c-4071-9aa8-05f14713fe4c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2ODIzMywiaWF0IjoxNzkzNDY3MzMzLCJqdGkiOiI0YWZiOTY1MC04ZTEzLTRmM2MtOTFjNS1mMWM3MWYyYWRhYTUiLCJzaWQiOiJjZmVkNzc0Ny03YjhjLTQwNzEtOWFhOC0wNWYxNDcxM2ZlNGMifQ.Xka92iaTmLGzK9SXxuSqGPfg2lHJbtbnC4f4MeL1NnY",
  "access_expires_at": "2026-10-31T17:37:13.240064885Z",
  "refresh_token": "zs028As3PPMXRWXiPOolZRbam658rbKUxGp5qk9x8lI",
  "refresh_expires_at": "2026-11-30T17:22:13.239015651Z",
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
  "command_id": "85ffd47b-4c02-48a2-8e5d-141df992582f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:22:13Z",
    "sequence": 1793467333914
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3477b14d-cf88-4e07-9ebe-9174fd4fdd49",
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
  "last_heartbeat_at": "2026-10-31T17:22:13.991839Z",
  "last_location_at": "2026-10-31T17:22:13.991839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "88c384b0-3e11-4bbf-9b07-06088015bcad",
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
  "id": "6a000efa-6d6e-478a-8439-f183bad3d6a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:27:14.366560Z",
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
  "command_id": "51cb4469-3344-4f94-a4ad-8aceb7874393",
  "quote_id": "6a000efa-6d6e-478a-8439-f183bad3d6a3",
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
  "id": "daf08597-194a-41e5-b216-02ce6d260e9f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a66a9db1-3292-4689-8f1d-396dcfad78c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T17:22:14.776157Z",
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
    "id": "2a6cfa66-a48d-4afe-975f-fe4d5c05022a",
    "order_id": "daf08597-194a-41e5-b216-02ce6d260e9f",
    "expires_at": "2026-10-31T17:22:29.786388Z",
    "server_time": "2026-10-31T17:22:15.228555596Z",
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

`POST /api/driver/v1/offers/2a6cfa66-a48d-4afe-975f-fe4d5c05022a/accept` → **200**

```json
{
  "command_id": "7e7b0f09-1870-4e6a-8347-66265dc9a6db"
}
```

```json
{
  "id": "5df6ebb2-8f2e-46d9-81d3-a49b85f05e4a",
  "order_id": "daf08597-194a-41e5-b216-02ce6d260e9f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cd92ef48-d08a-4d27-978d-c52fad9754c0",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cd92ef48-d08a-4d27-978d-c52fad9754c0",
  "order_id": "daf08597-194a-41e5-b216-02ce6d260e9f",
  "assignment_id": "5df6ebb2-8f2e-46d9-81d3-a49b85f05e4a",
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

`POST /api/driver/v1/work-sessions/3477b14d-cf88-4e07-9ebe-9174fd4fdd49/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:22:26Z",
    "sequence": 1793467346118
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3477b14d-cf88-4e07-9ebe-9174fd4fdd49",
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
  "last_heartbeat_at": "2026-10-31T17:22:26.213171Z",
  "last_location_at": "2026-10-31T17:22:26.213171Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/cd92ef48-d08a-4d27-978d-c52fad9754c0/arrive` → **200**

```json
{
  "command_id": "349d012d-c2fb-4272-845b-e711fd598421",
  "expected_version": 0
}
```

```json
{
  "id": "cd92ef48-d08a-4d27-978d-c52fad9754c0",
  "order_id": "daf08597-194a-41e5-b216-02ce6d260e9f",
  "assignment_id": "5df6ebb2-8f2e-46d9-81d3-a49b85f05e4a",
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
  "arrived_at": "2026-10-31T17:22:26.59537Z",
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

`POST /api/driver/v1/trips/cd92ef48-d08a-4d27-978d-c52fad9754c0/start` → **200**

```json
{
  "command_id": "0e9f5f9f-1450-4bdf-85aa-ae28c58a6b49",
  "expected_version": 1
}
```

```json
{
  "id": "cd92ef48-d08a-4d27-978d-c52fad9754c0",
  "order_id": "daf08597-194a-41e5-b216-02ce6d260e9f",
  "assignment_id": "5df6ebb2-8f2e-46d9-81d3-a49b85f05e4a",
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
  "arrived_at": "2026-10-31T17:22:26.59537Z",
  "started_at": "2026-10-31T17:22:26.943672Z",
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
  "session_id": "3477b14d-cf88-4e07-9ebe-9174fd4fdd49",
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
  "last_heartbeat_at": "2026-10-31T17:22:26.213171Z",
  "last_location_at": "2026-10-31T17:22:26.213171Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3477b14d-cf88-4e07-9ebe-9174fd4fdd49/close` → **200**

```json
{
  "command_id": "580461ac-c266-4d47-a3f4-9cf3e38397c0",
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
  "phone": "+380673652808",
  "device_ref": "sandbox-14206"
}
```

```json
{
  "challenge_id": "125440db-c259-4835-a922-254bd7bcdce4",
  "expires_at": "2026-10-31T17:27:39.873202044Z",
  "resend_available_at": "2026-10-31T17:22:40.873202044Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673652808` → **200**

```json
{
  "phone": "+380673652808",
  "audience": "CLIENT",
  "code": "221356",
  "sent_at": "2026-10-31T17:22:39.892312354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "125440db-c259-4835-a922-254bd7bcdce4",
  "code": "221356",
  "device_ref": "sandbox-14206"
}
```

```json
{
  "session_id": "c2d182b5-2da7-4e15-9360-06a71e370451",
  "subject": {
    "type": "CLIENT",
    "id": "89762010-2876-46c6-b4d2-678618d04246"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTc2MjAxMC0yODc2LTQ2YzYtYjRkMi02Nzg2MThkMDQyNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY4MjYwLCJpYXQiOjE3OTM0NjczNjAsImp0aSI6ImZkYzAyZTZkLTQ1NWItNDEwZC04ZjI2LTk4MmNiMTVmMGViOSIsInNpZCI6ImMyZDE4MmI1LTJkYTctNGUxNS05MzYwLTA2YTcxZTM3MDQ1MSJ9.wgVVsZpTNlTTtN3W6NN3sI3je4lqN_EUk2K72RnZ9DE",
  "access_expires_at": "2026-10-31T17:37:40.269533601Z",
  "refresh_token": "Ale7r6WPbkX2aqBUz0WiY-oRMEshvSIJHqkglaR7Tp0",
  "refresh_expires_at": "2026-11-30T17:22:40.266985004Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6130"
}
```

```json
{
  "challenge_id": "25e1159c-5607-48ec-95f9-c34953ea047e",
  "expires_at": "2026-10-31T17:27:40.638126857Z",
  "resend_available_at": "2026-10-31T17:22:41.638126857Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "420845",
  "sent_at": "2026-10-31T17:22:40.644082651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25e1159c-5607-48ec-95f9-c34953ea047e",
  "code": "420845",
  "device_ref": "sandbox-6130"
}
```

```json
{
  "session_id": "3d9e3f72-828f-4920-b8d1-67d9f63851f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2ODI2MSwiaWF0IjoxNzkzNDY3MzYxLCJqdGkiOiI4NjU5ODkwZC0wMTNlLTQ1YjUtYTI5OS0zZmRmYWJmNTQzOGUiLCJzaWQiOiIzZDllM2Y3Mi04MjhmLTQ5MjAtYjhkMS02N2Q5ZjYzODUxZjMifQ.QwswpuUOwVfaRYmR82zrjmOeOGr4Fv1lO4qwJ3J1qrs",
  "access_expires_at": "2026-10-31T17:37:41.035550991Z",
  "refresh_token": "7Kft7LoNBB1WJNU3Cy9V7V1cU06NdXRzYbgi2XAztfs",
  "refresh_expires_at": "2026-11-30T17:22:41.034280134Z",
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
  "command_id": "78396bfd-4042-47e0-a3ac-9d04cb48e280",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:22:41Z",
    "sequence": 1793467361747
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbb6e8b6-3bc4-4e20-98f4-8fc62fa7dd2a",
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
  "last_heartbeat_at": "2026-10-31T17:22:41.828821Z",
  "last_location_at": "2026-10-31T17:22:41.828821Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "52d50d5d-2a23-4929-823d-ba73677ea29a",
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
  "id": "21b6457b-fee7-46f9-a1f4-3033a78777b1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:27:42.239337Z",
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
  "command_id": "b08c9400-1340-406e-9a46-9e731a2f75ff",
  "quote_id": "21b6457b-fee7-46f9-a1f4-3033a78777b1",
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
  "id": "522aeb42-1c9f-4d6e-b01b-f6eb6ef887b5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89762010-2876-46c6-b4d2-678618d04246",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T17:22:42.654414Z",
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
    "id": "1a10f329-bc48-40c1-8a9b-64500b9f3937",
    "order_id": "522aeb42-1c9f-4d6e-b01b-f6eb6ef887b5",
    "expires_at": "2026-10-31T17:22:57.666512Z",
    "server_time": "2026-10-31T17:22:43.045014331Z",
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

`POST /api/driver/v1/offers/1a10f329-bc48-40c1-8a9b-64500b9f3937/accept` → **200**

```json
{
  "command_id": "a34dd135-ea8e-43c6-97ea-54eafd09a48a"
}
```

```json
{
  "id": "65b9fd79-bdd1-4de2-9e4c-a65b62eec910",
  "order_id": "522aeb42-1c9f-4d6e-b01b-f6eb6ef887b5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d6a4ba11-df6c-4584-867b-060741695a9f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d6a4ba11-df6c-4584-867b-060741695a9f",
  "order_id": "522aeb42-1c9f-4d6e-b01b-f6eb6ef887b5",
  "assignment_id": "65b9fd79-bdd1-4de2-9e4c-a65b62eec910",
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

`POST /api/driver/v1/work-sessions/fbb6e8b6-3bc4-4e20-98f4-8fc62fa7dd2a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:22:44Z",
    "sequence": 1793467364440
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fbb6e8b6-3bc4-4e20-98f4-8fc62fa7dd2a",
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
  "last_heartbeat_at": "2026-10-31T17:22:44.072352Z",
  "last_location_at": "2026-10-31T17:22:44.072352Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d6a4ba11-df6c-4584-867b-060741695a9f/arrive` → **200**

```json
{
  "command_id": "16b7b6e5-4569-418b-9af4-522baf1a8e3c",
  "expected_version": 0
}
```

```json
{
  "id": "d6a4ba11-df6c-4584-867b-060741695a9f",
  "order_id": "522aeb42-1c9f-4d6e-b01b-f6eb6ef887b5",
  "assignment_id": "65b9fd79-bdd1-4de2-9e4c-a65b62eec910",
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
  "arrived_at": "2026-10-31T17:22:44.405089Z",
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

`POST /api/driver/v1/trips/d6a4ba11-df6c-4584-867b-060741695a9f/start` → **200**

```json
{
  "command_id": "eeceeb31-8414-4ef2-9cb6-e83a5bf2aeb4",
  "expected_version": 1
}
```

```json
{
  "id": "d6a4ba11-df6c-4584-867b-060741695a9f",
  "order_id": "522aeb42-1c9f-4d6e-b01b-f6eb6ef887b5",
  "assignment_id": "65b9fd79-bdd1-4de2-9e4c-a65b62eec910",
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
  "arrived_at": "2026-10-31T17:22:44.405089Z",
  "started_at": "2026-10-31T17:22:44.764173Z",
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

TripCompleted 11202599-53e3-49a9-ad69-e5889dc468d5: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **2** (sent before the crash, not again after it).

**The live message went out 2 times.**
