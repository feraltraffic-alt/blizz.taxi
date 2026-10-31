# Fault tests (2026-10-31T17:53:30Z, 4796389, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670532737",
  "device_ref": "sandbox-27081"
}
```

```json
{
  "challenge_id": "e11a2e8d-6f35-4a19-bb05-d468f512e1fd",
  "expires_at": "2026-10-31T17:58:41.231487137Z",
  "resend_available_at": "2026-10-31T17:53:42.231487137Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670532737` → **200**

```json
{
  "phone": "+380670532737",
  "audience": "CLIENT",
  "code": "893869",
  "sent_at": "2026-10-31T17:53:41.24497823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e11a2e8d-6f35-4a19-bb05-d468f512e1fd",
  "code": "893869",
  "device_ref": "sandbox-27081"
}
```

```json
{
  "session_id": "eba848fe-d5af-49a3-b5d8-02ec3ce6d8b1",
  "subject": {
    "type": "CLIENT",
    "id": "04e1f368-ce58-463b-bc59-4f5d7e03803f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGUxZjM2OC1jZTU4LTQ2M2ItYmM1OS00ZjVkN2UwMzgwM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwMTI5LCJpYXQiOjE3OTM0NjkyMjksImp0aSI6ImNjMzkxNzExLWY0NGYtNGU3NC1iZDI4LWUwYTg1NzRiMTcxNCIsInNpZCI6ImViYTg0OGZlLWQ1YWYtNDlhMy1iNWQ4LTAyZWMzY2U2ZDhiMSJ9.3y_e6zP6jBGNV1fNGWTCaSWDMjkXd9Nt80vGJfc5dHs",
  "access_expires_at": "2026-10-31T18:08:49.137888706Z",
  "refresh_token": "MkF4nFR6lF1wI76knQoal7JUC0Z-Wi6WjbHcuMDbs1k",
  "refresh_expires_at": "2026-11-30T17:53:49.13632339Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29725"
}
```

```json
{
  "challenge_id": "2fae1426-f7f5-4883-a544-c8bda7c9ef1d",
  "expires_at": "2026-10-31T17:58:49.426157085Z",
  "resend_available_at": "2026-10-31T17:53:50.426157085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "871850",
  "sent_at": "2026-10-31T17:53:49.430476202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fae1426-f7f5-4883-a544-c8bda7c9ef1d",
  "code": "871850",
  "device_ref": "sandbox-29725"
}
```

```json
{
  "session_id": "97d7db1b-d636-4497-a2f8-4b4dd43a5240",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDEyOSwiaWF0IjoxNzkzNDY5MjI5LCJqdGkiOiI2NzdlYmMzMy01NjFlLTQxNTQtYmFiOS0yOTA0Y2Y2MDBmMTEiLCJzaWQiOiI5N2Q3ZGIxYi1kNjM2LTQ0OTctYTJmOC00YjRkZDQzYTUyNDAifQ.BPNAIMtsbAqdZspsxG-HhXDmFPaR871C2p1N_8vY7O4",
  "access_expires_at": "2026-10-31T18:08:49.694901181Z",
  "refresh_token": "v-ReMlvNG_VG-G2wUkW8OLM1LH4T-QsTIPHMZktSppw",
  "refresh_expires_at": "2026-11-30T17:53:49.694163035Z",
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
  "command_id": "6e21be36-759a-4ecb-8dfe-3a475e0c7c09",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:53:50Z",
    "sequence": 1793469230205
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e276427-677d-4898-8336-5bd00270e9b5",
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
  "last_heartbeat_at": "2026-10-31T17:53:50.317821Z",
  "last_location_at": "2026-10-31T17:53:50.317821Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6de36e9e-4e2e-46ee-8675-acd36898d808",
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
  "id": "04708504-3c9c-44ad-bf7c-c45e1b79dfa0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:58:50.625898Z",
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
  "command_id": "1b1726e4-72c1-475d-af44-39206bb4c6d3",
  "quote_id": "04708504-3c9c-44ad-bf7c-c45e1b79dfa0",
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
  "id": "58497572-f9ea-4d5b-9978-d93ccadd4541",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "04e1f368-ce58-463b-bc59-4f5d7e03803f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T17:53:50.957677Z",
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
    "id": "cfbfa85e-a4e8-4cf1-bce3-18187c2d2b26",
    "order_id": "58497572-f9ea-4d5b-9978-d93ccadd4541",
    "expires_at": "2026-10-31T17:54:05.966169Z",
    "server_time": "2026-10-31T17:53:51.311279868Z",
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

`POST /api/driver/v1/offers/cfbfa85e-a4e8-4cf1-bce3-18187c2d2b26/accept` → **200**

```json
{
  "command_id": "925f2825-5f34-4ef1-bfa8-0289d59517b8"
}
```

```json
{
  "id": "3a7cc137-dcff-4feb-9ad4-98056f537ff5",
  "order_id": "58497572-f9ea-4d5b-9978-d93ccadd4541",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5f08003-a35d-4285-acd5-fb29144bd714",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d5f08003-a35d-4285-acd5-fb29144bd714",
  "order_id": "58497572-f9ea-4d5b-9978-d93ccadd4541",
  "assignment_id": "3a7cc137-dcff-4feb-9ad4-98056f537ff5",
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

`POST /api/driver/v1/work-sessions/7e276427-677d-4898-8336-5bd00270e9b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:53:59Z",
    "sequence": 1793469239913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e276427-677d-4898-8336-5bd00270e9b5",
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
  "last_heartbeat_at": "2026-10-31T17:53:59.992006Z",
  "last_location_at": "2026-10-31T17:53:59.992006Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d5f08003-a35d-4285-acd5-fb29144bd714/arrive` → **200**

```json
{
  "command_id": "dc32f4d6-b813-44d5-b53d-2249b97f9e62",
  "expected_version": 0
}
```

```json
{
  "id": "d5f08003-a35d-4285-acd5-fb29144bd714",
  "order_id": "58497572-f9ea-4d5b-9978-d93ccadd4541",
  "assignment_id": "3a7cc137-dcff-4feb-9ad4-98056f537ff5",
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
  "arrived_at": "2026-10-31T17:54:00.284716Z",
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

`POST /api/driver/v1/trips/d5f08003-a35d-4285-acd5-fb29144bd714/start` → **200**

```json
{
  "command_id": "b71c53c9-5c3e-43db-a3ce-95235aaf96cf",
  "expected_version": 1
}
```

```json
{
  "id": "d5f08003-a35d-4285-acd5-fb29144bd714",
  "order_id": "58497572-f9ea-4d5b-9978-d93ccadd4541",
  "assignment_id": "3a7cc137-dcff-4feb-9ad4-98056f537ff5",
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
  "arrived_at": "2026-10-31T17:54:00.284716Z",
  "started_at": "2026-10-31T17:54:00.54734Z",
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
  "session_id": "7e276427-677d-4898-8336-5bd00270e9b5",
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
  "last_heartbeat_at": "2026-10-31T17:53:59.992006Z",
  "last_location_at": "2026-10-31T17:53:59.992006Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e276427-677d-4898-8336-5bd00270e9b5/close` → **200**

```json
{
  "command_id": "bb2b63aa-fc19-4ce9-8cf0-6583e5b9ccfb",
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
  "phone": "+380675556604",
  "device_ref": "sandbox-11301"
}
```

```json
{
  "challenge_id": "6d24c6d3-682e-404c-88df-b11f0428d66b",
  "expires_at": "2026-10-31T17:59:11.145547979Z",
  "resend_available_at": "2026-10-31T17:54:12.145547979Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675556604` → **200**

```json
{
  "phone": "+380675556604",
  "audience": "CLIENT",
  "code": "793206",
  "sent_at": "2026-10-31T17:54:11.163606666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d24c6d3-682e-404c-88df-b11f0428d66b",
  "code": "793206",
  "device_ref": "sandbox-11301"
}
```

```json
{
  "session_id": "fab5e220-eea8-44bb-8db5-24d0604e19ae",
  "subject": {
    "type": "CLIENT",
    "id": "0dddb359-c3e8-451c-999a-60cc291ea78b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGRkYjM1OS1jM2U4LTQ1MWMtOTk5YS02MGNjMjkxZWE3OGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwMTUxLCJpYXQiOjE3OTM0NjkyNTEsImp0aSI6IjIyYTczYmQxLWJkMzktNDY4NS04NzdiLTZjMTIyMGI3Zjc2NSIsInNpZCI6ImZhYjVlMjIwLWVlYTgtNDRiYi04ZGI1LTI0ZDA2MDRlMTlhZSJ9.PqO9K_HFF23Uqc-4UiWZpl8WqYjlSVuKJFLfCbFgQYA",
  "access_expires_at": "2026-10-31T18:09:11.473009123Z",
  "refresh_token": "MNAA0Fo47QMrTQE7kuzNQ7Hr7EHIZsA-H79w-zUd1vw",
  "refresh_expires_at": "2026-11-30T17:54:11.470709976Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27345"
}
```

```json
{
  "challenge_id": "1e0834b8-09c6-4c81-8e44-919b2644c3c5",
  "expires_at": "2026-10-31T17:59:11.773736538Z",
  "resend_available_at": "2026-10-31T17:54:12.773736538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "786968",
  "sent_at": "2026-10-31T17:54:11.778634287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e0834b8-09c6-4c81-8e44-919b2644c3c5",
  "code": "786968",
  "device_ref": "sandbox-27345"
}
```

```json
{
  "session_id": "92577b8b-3549-48c0-9277-0ad3289518b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDE1MiwiaWF0IjoxNzkzNDY5MjUyLCJqdGkiOiIzODJjOTE4Yy05NWEzLTRiN2ItYTc0ZC1mMDkzNTNkYTgwODQiLCJzaWQiOiI5MjU3N2I4Yi0zNTQ5LTQ4YzAtOTI3Ny0wYWQzMjg5NTE4YjgifQ.z6Dh_hOmhQVF1dD0kxJohIGDFVkPEe9DCJLG615iKz0",
  "access_expires_at": "2026-10-31T18:09:12.047240343Z",
  "refresh_token": "TAhH5uxWiEzV4hMtdbyuCNJH3nVoVWsVVjl0zv9cn3c",
  "refresh_expires_at": "2026-11-30T17:54:12.046135722Z",
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
  "command_id": "e61e2add-41c0-4706-b77c-43f508a6da7b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:54:12Z",
    "sequence": 1793469252561
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "446dd6fb-beef-4448-b657-844b9a688503",
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
  "last_heartbeat_at": "2026-10-31T17:54:12.621914Z",
  "last_location_at": "2026-10-31T17:54:12.621914Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "46af426b-893f-4607-9bef-ff8b14da3aa5",
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
  "id": "9b692b21-904b-4d65-95f6-d809ee349007",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:59:12.920405Z",
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
  "command_id": "c56e8e16-82c2-4b61-b77f-fcb295cc965b",
  "quote_id": "9b692b21-904b-4d65-95f6-d809ee349007",
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
  "id": "557d94bd-4edd-4551-be35-1a7be33aaedc",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0dddb359-c3e8-451c-999a-60cc291ea78b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T17:54:13.23906Z",
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
    "id": "de41d9e7-9998-4d55-afb0-a9eb1f196f73",
    "order_id": "557d94bd-4edd-4551-be35-1a7be33aaedc",
    "expires_at": "2026-10-31T17:54:28.248455Z",
    "server_time": "2026-10-31T17:54:13.554017504Z",
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

`POST /api/driver/v1/offers/de41d9e7-9998-4d55-afb0-a9eb1f196f73/accept` → **200**

```json
{
  "command_id": "3989b0fd-c126-472a-97d1-60164fbd7592"
}
```

```json
{
  "id": "f5ed40b3-8b36-4c5a-8696-4eedb4059587",
  "order_id": "557d94bd-4edd-4551-be35-1a7be33aaedc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "df4ad959-eacc-4072-9174-263d07a75d53",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "df4ad959-eacc-4072-9174-263d07a75d53",
  "order_id": "557d94bd-4edd-4551-be35-1a7be33aaedc",
  "assignment_id": "f5ed40b3-8b36-4c5a-8696-4eedb4059587",
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

`POST /api/driver/v1/work-sessions/446dd6fb-beef-4448-b657-844b9a688503/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:54:14Z",
    "sequence": 1793469254333
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "446dd6fb-beef-4448-b657-844b9a688503",
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
  "last_heartbeat_at": "2026-10-31T17:54:14.357182Z",
  "last_location_at": "2026-10-31T17:54:14.357182Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/df4ad959-eacc-4072-9174-263d07a75d53/arrive` → **200**

```json
{
  "command_id": "b953e976-c9f1-4e99-91ea-bcfde4edfe5a",
  "expected_version": 0
}
```

```json
{
  "id": "df4ad959-eacc-4072-9174-263d07a75d53",
  "order_id": "557d94bd-4edd-4551-be35-1a7be33aaedc",
  "assignment_id": "f5ed40b3-8b36-4c5a-8696-4eedb4059587",
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
  "arrived_at": "2026-10-31T17:54:14.647502Z",
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

`POST /api/driver/v1/trips/df4ad959-eacc-4072-9174-263d07a75d53/start` → **200**

```json
{
  "command_id": "58803c6c-12ba-421b-990c-4037e908b6c8",
  "expected_version": 1
}
```

```json
{
  "id": "df4ad959-eacc-4072-9174-263d07a75d53",
  "order_id": "557d94bd-4edd-4551-be35-1a7be33aaedc",
  "assignment_id": "f5ed40b3-8b36-4c5a-8696-4eedb4059587",
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
  "arrived_at": "2026-10-31T17:54:14.647502Z",
  "started_at": "2026-10-31T17:54:14.907758Z",
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

TripCompleted 3529ad71-f123-4b02-9667-62dd3c664426: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **2** (sent before the crash, not again after it).

**The live message went out 2 times.**
