# Fault tests (2026-10-31T19:25:52Z, 1e26c2d, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674414676",
  "device_ref": "sandbox-5338"
}
```

```json
{
  "challenge_id": "6f81d69a-eaa7-4244-9a29-01d488669f21",
  "expires_at": "2026-10-31T19:31:05.375940548Z",
  "resend_available_at": "2026-10-31T19:26:06.375940548Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674414676` → **200**

```json
{
  "phone": "+380674414676",
  "audience": "CLIENT",
  "code": "906306",
  "sent_at": "2026-10-31T19:26:05.390677041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f81d69a-eaa7-4244-9a29-01d488669f21",
  "code": "906306",
  "device_ref": "sandbox-5338"
}
```

```json
{
  "session_id": "60dafb65-6262-4323-9a19-0809af73acb7",
  "subject": {
    "type": "CLIENT",
    "id": "1e3517a7-8c2e-4746-9fb9-e6ecf697871b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTM1MTdhNy04YzJlLTQ3NDYtOWZiOS1lNmVjZjY5Nzg3MWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDc1NjcyLCJpYXQiOjE3OTM0NzQ3NzIsImp0aSI6IjQwMmZkZjgzLTM4MTAtNGY5Ny1iZGRkLTQ1YjIxN2MxZTdlYiIsInNpZCI6IjYwZGFmYjY1LTYyNjItNDMyMy05YTE5LTA4MDlhZjczYWNiNyJ9.VPrIT-cg9TcO7rEWshw81cclHzTDEK9Qs4QLPlmUdBc",
  "access_expires_at": "2026-10-31T19:41:12.346792834Z",
  "refresh_token": "O3ehbZ6x_DE26-Hs6BH152GE3vpzZ070Mv48buoC2KM",
  "refresh_expires_at": "2026-11-30T19:26:12.344705772Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18920"
}
```

```json
{
  "challenge_id": "d358e0c0-6020-4d10-ae52-f48d511bce0a",
  "expires_at": "2026-10-31T19:31:12.712669267Z",
  "resend_available_at": "2026-10-31T19:26:13.712669267Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "733978",
  "sent_at": "2026-10-31T19:26:12.71919808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d358e0c0-6020-4d10-ae52-f48d511bce0a",
  "code": "733978",
  "device_ref": "sandbox-18920"
}
```

```json
{
  "session_id": "0e286b1e-b39b-4d41-b382-c97d1bc105f9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3NTY3MywiaWF0IjoxNzkzNDc0NzczLCJqdGkiOiIwNjUxMTZhOS1lZmMzLTQ2ZTItODZmZS0zMDA4YzFlMzc4ZjUiLCJzaWQiOiIwZTI4NmIxZS1iMzliLTRkNDEtYjM4Mi1jOTdkMWJjMTA1ZjkifQ.Q1AJUMi3RW51wFRVQBCdjV_w2xTp0siYTPuMUi44H9Y",
  "access_expires_at": "2026-10-31T19:41:13.073223566Z",
  "refresh_token": "LDUvOMIk8W1EjTgG6Laqw0d5x4xJAPu3IxdGGlQC7dc",
  "refresh_expires_at": "2026-11-30T19:26:13.072236673Z",
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
  "command_id": "b7465904-d177-4bb0-aeec-7ca038de2380",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:13Z",
    "sequence": 1793474773733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93e2c6e5-7a7b-44d6-a8ef-fd82a0cf671e",
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
  "last_heartbeat_at": "2026-10-31T19:26:13.835175Z",
  "last_location_at": "2026-10-31T19:26:13.835175Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1abf8ac6-9b4a-4588-8a3a-a184f07810cf",
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
  "id": "ad5b0531-5a46-4368-beb6-87be6b6c80a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T19:31:14.231653Z",
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
  "command_id": "2ec2db6d-c42a-4113-9a53-71b4eae6a618",
  "quote_id": "ad5b0531-5a46-4368-beb6-87be6b6c80a5",
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
  "id": "18176314-eed8-4943-8b80-23bad66f366b",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e3517a7-8c2e-4746-9fb9-e6ecf697871b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T19:26:14.666872Z",
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
    "id": "cb5e32e5-425d-4225-af2f-4145ab91f484",
    "order_id": "18176314-eed8-4943-8b80-23bad66f366b",
    "expires_at": "2026-10-31T19:26:29.677399Z",
    "server_time": "2026-10-31T19:26:15.087812926Z",
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

`POST /api/driver/v1/offers/cb5e32e5-425d-4225-af2f-4145ab91f484/accept` → **200**

```json
{
  "command_id": "b56747b8-a7a9-4c4c-9e01-62964fd9284e"
}
```

```json
{
  "id": "2f369b9e-395f-4cec-b3db-07096aa32ec1",
  "order_id": "18176314-eed8-4943-8b80-23bad66f366b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "50e047d5-145c-4994-b1cb-d9244221e725",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "50e047d5-145c-4994-b1cb-d9244221e725",
  "order_id": "18176314-eed8-4943-8b80-23bad66f366b",
  "assignment_id": "2f369b9e-395f-4cec-b3db-07096aa32ec1",
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

`POST /api/driver/v1/work-sessions/93e2c6e5-7a7b-44d6-a8ef-fd82a0cf671e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:27Z",
    "sequence": 1793474787195
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93e2c6e5-7a7b-44d6-a8ef-fd82a0cf671e",
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
  "last_heartbeat_at": "2026-10-31T19:26:27.28283Z",
  "last_location_at": "2026-10-31T19:26:27.28283Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/50e047d5-145c-4994-b1cb-d9244221e725/arrive` → **200**

```json
{
  "command_id": "5c028512-3622-4d1b-804a-232358a8605a",
  "expected_version": 0
}
```

```json
{
  "id": "50e047d5-145c-4994-b1cb-d9244221e725",
  "order_id": "18176314-eed8-4943-8b80-23bad66f366b",
  "assignment_id": "2f369b9e-395f-4cec-b3db-07096aa32ec1",
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
  "arrived_at": "2026-10-31T19:26:27.642844Z",
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

`POST /api/driver/v1/trips/50e047d5-145c-4994-b1cb-d9244221e725/start` → **200**

```json
{
  "command_id": "05329152-3832-4346-b24b-9e823361f408",
  "expected_version": 1
}
```

```json
{
  "id": "50e047d5-145c-4994-b1cb-d9244221e725",
  "order_id": "18176314-eed8-4943-8b80-23bad66f366b",
  "assignment_id": "2f369b9e-395f-4cec-b3db-07096aa32ec1",
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
  "arrived_at": "2026-10-31T19:26:27.642844Z",
  "started_at": "2026-10-31T19:26:27.993807Z",
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
  "session_id": "93e2c6e5-7a7b-44d6-a8ef-fd82a0cf671e",
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
  "last_heartbeat_at": "2026-10-31T19:26:27.28283Z",
  "last_location_at": "2026-10-31T19:26:27.28283Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/93e2c6e5-7a7b-44d6-a8ef-fd82a0cf671e/close` → **200**

```json
{
  "command_id": "c805918a-0d64-4ab6-bf8b-1afd400f725c",
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
  "phone": "+380671407668",
  "device_ref": "sandbox-19596"
}
```

```json
{
  "challenge_id": "49a9eab6-60f4-4b67-9c49-72e9850402c6",
  "expires_at": "2026-10-31T19:31:43.115048145Z",
  "resend_available_at": "2026-10-31T19:26:44.115048145Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671407668` → **200**

```json
{
  "phone": "+380671407668",
  "audience": "CLIENT",
  "code": "272704",
  "sent_at": "2026-10-31T19:26:43.134206944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49a9eab6-60f4-4b67-9c49-72e9850402c6",
  "code": "272704",
  "device_ref": "sandbox-19596"
}
```

```json
{
  "session_id": "1f61ec80-c708-48ca-acf9-cdbbaccc06fe",
  "subject": {
    "type": "CLIENT",
    "id": "9d06b6a9-35e3-48f3-a8fa-f834909d481e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDA2YjZhOS0zNWUzLTQ4ZjMtYThmYS1mODM0OTA5ZDQ4MWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDc1NzAzLCJpYXQiOjE3OTM0NzQ4MDMsImp0aSI6ImU2MDAzZDY0LTEwNjAtNDk1ZC1iNDk1LTQzZWNjNGQ0M2NiOSIsInNpZCI6IjFmNjFlYzgwLWM3MDgtNDhjYS1hY2Y5LWNkYmJhY2NjMDZmZSJ9.rbubVMuQPaURgw292qvYBrUU6R623CVLl5PCc-zoASQ",
  "access_expires_at": "2026-10-31T19:41:43.532635696Z",
  "refresh_token": "1nKIVE7-B1uG8kC2IvCmDEjzvNOCJqfTWW1o0qp0Gps",
  "refresh_expires_at": "2026-11-30T19:26:43.529876817Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5371"
}
```

```json
{
  "challenge_id": "cb692bd3-6a9b-43bd-9e1a-d909801248a4",
  "expires_at": "2026-10-31T19:31:43.904280232Z",
  "resend_available_at": "2026-10-31T19:26:44.904280232Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "017758",
  "sent_at": "2026-10-31T19:26:43.91141066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb692bd3-6a9b-43bd-9e1a-d909801248a4",
  "code": "017758",
  "device_ref": "sandbox-5371"
}
```

```json
{
  "session_id": "a6d8b975-bdf5-4bd7-a3ec-ac5c9881cbf9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3NTcwNCwiaWF0IjoxNzkzNDc0ODA0LCJqdGkiOiIwNmNkMzhmZS04YzE2LTQ1OTUtYmE3Mi0zOTEwZjQwMjQ3NTIiLCJzaWQiOiJhNmQ4Yjk3NS1iZGY1LTRiZDctYTNlYy1hYzVjOTg4MWNiZjkifQ.k4XMLgPvlvG-Jtgsd2GfsJtgT_KFU5WG0u6zfLzA8ow",
  "access_expires_at": "2026-10-31T19:41:44.253973549Z",
  "refresh_token": "T-NKiZC68xIeTf418mHJqY2upq7q7P8sxcPJNV-RKzQ",
  "refresh_expires_at": "2026-11-30T19:26:44.252614643Z",
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
  "command_id": "5c25d5be-fe05-4b37-93de-8610cf66f45f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:44Z",
    "sequence": 1793474804921
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "329a36fa-5a7d-4bba-b238-93d83478b935",
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
  "last_heartbeat_at": "2026-10-31T19:26:44.994667Z",
  "last_location_at": "2026-10-31T19:26:44.994667Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d8f6c626-829b-4a34-ae9a-032cce1a0edc",
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
  "id": "d33a6b3c-d321-4d7f-8752-bf4cff112047",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T19:31:45.387109Z",
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
  "command_id": "d3098be5-ebdc-48d9-8b98-cdcb5b231ff6",
  "quote_id": "d33a6b3c-d321-4d7f-8752-bf4cff112047",
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
  "id": "129192f8-7f4b-44d3-9c50-2458fa3ba353",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d06b6a9-35e3-48f3-a8fa-f834909d481e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-31T19:26:45.805605Z",
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
    "id": "da923c4d-168d-4b7d-9fe5-13d0e7d11ca1",
    "order_id": "129192f8-7f4b-44d3-9c50-2458fa3ba353",
    "expires_at": "2026-10-31T19:27:00.8179Z",
    "server_time": "2026-10-31T19:26:46.266130356Z",
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

`POST /api/driver/v1/offers/da923c4d-168d-4b7d-9fe5-13d0e7d11ca1/accept` → **200**

```json
{
  "command_id": "b6b219f0-08db-4c1e-8a85-31b38f420587"
}
```

```json
{
  "id": "2953f164-5078-453c-92af-d3578e495fd5",
  "order_id": "129192f8-7f4b-44d3-9c50-2458fa3ba353",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "83ad628c-c660-4bc4-89cb-dcb36b9f08be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "83ad628c-c660-4bc4-89cb-dcb36b9f08be",
  "order_id": "129192f8-7f4b-44d3-9c50-2458fa3ba353",
  "assignment_id": "2953f164-5078-453c-92af-d3578e495fd5",
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

`POST /api/driver/v1/work-sessions/329a36fa-5a7d-4bba-b238-93d83478b935/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T19:26:47Z",
    "sequence": 1793474807278
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "329a36fa-5a7d-4bba-b238-93d83478b935",
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
  "last_heartbeat_at": "2026-10-31T19:26:47.308873Z",
  "last_location_at": "2026-10-31T19:26:47.308873Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/83ad628c-c660-4bc4-89cb-dcb36b9f08be/arrive` → **200**

```json
{
  "command_id": "55f39e27-4f78-45da-b8ee-70ba485accaa",
  "expected_version": 0
}
```

```json
{
  "id": "83ad628c-c660-4bc4-89cb-dcb36b9f08be",
  "order_id": "129192f8-7f4b-44d3-9c50-2458fa3ba353",
  "assignment_id": "2953f164-5078-453c-92af-d3578e495fd5",
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
  "arrived_at": "2026-10-31T19:26:47.645211Z",
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

`POST /api/driver/v1/trips/83ad628c-c660-4bc4-89cb-dcb36b9f08be/start` → **200**

```json
{
  "command_id": "a32f020c-9eee-4606-9c90-af50098d367a",
  "expected_version": 1
}
```

```json
{
  "id": "83ad628c-c660-4bc4-89cb-dcb36b9f08be",
  "order_id": "129192f8-7f4b-44d3-9c50-2458fa3ba353",
  "assignment_id": "2953f164-5078-453c-92af-d3578e495fd5",
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
  "arrived_at": "2026-10-31T19:26:47.645211Z",
  "started_at": "2026-10-31T19:26:47.98793Z",
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

TripCompleted 7a71010e-a3a3-409c-82ce-de5bbdefec77: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **2** (sent before the crash, not again after it).

**The live message went out 2 times.**
