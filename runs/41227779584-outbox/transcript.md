# Fault tests (2026-10-31T18:07:30Z, b6b39a4, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679191550",
  "device_ref": "sandbox-30109"
}
```

```json
{
  "challenge_id": "7578a2a1-fcf7-4d0a-bf9a-e08650f80fc4",
  "expires_at": "2026-10-31T18:12:43.085804979Z",
  "resend_available_at": "2026-10-31T18:07:44.085804979Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679191550` → **200**

```json
{
  "phone": "+380679191550",
  "audience": "CLIENT",
  "code": "991992",
  "sent_at": "2026-10-31T18:07:43.102321699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7578a2a1-fcf7-4d0a-bf9a-e08650f80fc4",
  "code": "991992",
  "device_ref": "sandbox-30109"
}
```

```json
{
  "session_id": "dd2c86c3-f98d-490c-9823-ea6bc1b2bc92",
  "subject": {
    "type": "CLIENT",
    "id": "6c2c9d23-ff27-4812-8933-fdf034521d0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzJjOWQyMy1mZjI3LTQ4MTItODkzMy1mZGYwMzQ1MjFkMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwOTcwLCJpYXQiOjE3OTM0NzAwNzAsImp0aSI6IjBlMjExMDJhLTcwZTEtNDZkYi1hMTM0LWI5MmRhM2NmOGYyYyIsInNpZCI6ImRkMmM4NmMzLWY5OGQtNDkwYy05ODIzLWVhNmJjMWIyYmM5MiJ9.Du736ZZFgVw_SdOS5jUVa5044wXpfddvmp0KPuOQPn8",
  "access_expires_at": "2026-10-31T18:22:50.886126405Z",
  "refresh_token": "hDI10qUroLxpJ73ZVt_T7hepJI457r0HIHAYOSej9sw",
  "refresh_expires_at": "2026-11-30T18:07:50.883655262Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31021"
}
```

```json
{
  "challenge_id": "cb90a913-93d9-454c-94f9-cddbd47cddfc",
  "expires_at": "2026-10-31T18:12:51.253812538Z",
  "resend_available_at": "2026-10-31T18:07:52.253812538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "786561",
  "sent_at": "2026-10-31T18:07:51.259376785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb90a913-93d9-454c-94f9-cddbd47cddfc",
  "code": "786561",
  "device_ref": "sandbox-31021"
}
```

```json
{
  "session_id": "82acd3f2-3a56-4d51-8626-dcf9da1dda45",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDk3MSwiaWF0IjoxNzkzNDcwMDcxLCJqdGkiOiI1OWNhMjg2MS1hYTc0LTRiYTgtYmQyZi00ZWIxODM4NzRkOTYiLCJzaWQiOiI4MmFjZDNmMi0zYTU2LTRkNTEtODYyNi1kY2Y5ZGExZGRhNDUifQ.JK2xBaMmYuDHj71q0KZ9NUuwVXDnWiYEpF1k-XpyU-g",
  "access_expires_at": "2026-10-31T18:22:51.606985317Z",
  "refresh_token": "T7jNbNEV-MZlHHjDsA-uGvUSG5z28AnFzSOL9CzmQ9M",
  "refresh_expires_at": "2026-11-30T18:07:51.606022087Z",
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
  "command_id": "272a0b07-e3a1-40e1-bbdb-de7ee26d40b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:07:52Z",
    "sequence": 1793470072287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "607d49b1-bc55-43dc-a5fa-0e79b593327d",
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
  "last_heartbeat_at": "2026-10-31T18:07:52.355611Z",
  "last_location_at": "2026-10-31T18:07:52.355611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "51da9f1a-4398-41f8-9932-a9cf07f86593",
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
  "id": "72037c5a-0d95-4186-9aba-aee5ca0b72a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:12:52.755752Z",
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
  "command_id": "8c5bdb52-bc4a-4ab5-a45f-36a6e1d68245",
  "quote_id": "72037c5a-0d95-4186-9aba-aee5ca0b72a7",
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
  "id": "b50d1137-3bfc-4c19-ae03-685f83274798",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c2c9d23-ff27-4812-8933-fdf034521d0a",
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
  "created_at": "2026-10-31T18:07:53.276681Z",
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
    "id": "b3e3aa27-109b-446e-b86c-09b47877396c",
    "order_id": "b50d1137-3bfc-4c19-ae03-685f83274798",
    "expires_at": "2026-10-31T18:08:08.28985Z",
    "server_time": "2026-10-31T18:07:53.673677873Z",
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

`POST /api/driver/v1/offers/b3e3aa27-109b-446e-b86c-09b47877396c/accept` → **200**

```json
{
  "command_id": "5a278044-a183-41a3-a47c-dc25b1736d29"
}
```

```json
{
  "id": "6d03d5e7-10eb-4ba3-ada4-05dfa7f3b0e7",
  "order_id": "b50d1137-3bfc-4c19-ae03-685f83274798",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ddbce395-ff7e-42d0-9bfc-163a1043da7b",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ddbce395-ff7e-42d0-9bfc-163a1043da7b",
  "order_id": "b50d1137-3bfc-4c19-ae03-685f83274798",
  "assignment_id": "6d03d5e7-10eb-4ba3-ada4-05dfa7f3b0e7",
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

`POST /api/driver/v1/work-sessions/607d49b1-bc55-43dc-a5fa-0e79b593327d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:08:05Z",
    "sequence": 1793470085777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "607d49b1-bc55-43dc-a5fa-0e79b593327d",
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
  "last_heartbeat_at": "2026-10-31T18:08:05.880374Z",
  "last_location_at": "2026-10-31T18:08:05.880374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ddbce395-ff7e-42d0-9bfc-163a1043da7b/arrive` → **200**

```json
{
  "command_id": "c5af63d2-8887-4e3f-95db-1b13798030d7",
  "expected_version": 0
}
```

```json
{
  "id": "ddbce395-ff7e-42d0-9bfc-163a1043da7b",
  "order_id": "b50d1137-3bfc-4c19-ae03-685f83274798",
  "assignment_id": "6d03d5e7-10eb-4ba3-ada4-05dfa7f3b0e7",
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
  "arrived_at": "2026-10-31T18:08:06.236386Z",
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

`POST /api/driver/v1/trips/ddbce395-ff7e-42d0-9bfc-163a1043da7b/start` → **200**

```json
{
  "command_id": "565fbce9-a4a0-4988-b297-5207f82066a9",
  "expected_version": 1
}
```

```json
{
  "id": "ddbce395-ff7e-42d0-9bfc-163a1043da7b",
  "order_id": "b50d1137-3bfc-4c19-ae03-685f83274798",
  "assignment_id": "6d03d5e7-10eb-4ba3-ada4-05dfa7f3b0e7",
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
  "arrived_at": "2026-10-31T18:08:06.236386Z",
  "started_at": "2026-10-31T18:08:06.57638Z",
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
  "session_id": "607d49b1-bc55-43dc-a5fa-0e79b593327d",
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
  "last_heartbeat_at": "2026-10-31T18:08:05.880374Z",
  "last_location_at": "2026-10-31T18:08:05.880374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/607d49b1-bc55-43dc-a5fa-0e79b593327d/close` → **200**

```json
{
  "command_id": "2cfdf956-8c7e-43e1-abd1-a6402d66a28f",
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
  "phone": "+380674428131",
  "device_ref": "sandbox-19170"
}
```

```json
{
  "challenge_id": "59508481-e470-42b7-9533-fa7fa277fb79",
  "expires_at": "2026-10-31T18:13:21.520743918Z",
  "resend_available_at": "2026-10-31T18:08:22.520743918Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674428131` → **200**

```json
{
  "phone": "+380674428131",
  "audience": "CLIENT",
  "code": "489494",
  "sent_at": "2026-10-31T18:08:21.536865275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59508481-e470-42b7-9533-fa7fa277fb79",
  "code": "489494",
  "device_ref": "sandbox-19170"
}
```

```json
{
  "session_id": "9edc1a74-861f-4a76-a0ae-c67a75a6630a",
  "subject": {
    "type": "CLIENT",
    "id": "937194f8-b55f-40db-acf4-3a5c9d5bbf2e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzcxOTRmOC1iNTVmLTQwZGItYWNmNC0zYTVjOWQ1YmJmMmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcxMDAxLCJpYXQiOjE3OTM0NzAxMDEsImp0aSI6IjUxMzk0OTRiLTljMjEtNDZmNC05YWIwLTdhOTVhZmIzNmI1NCIsInNpZCI6IjllZGMxYTc0LTg2MWYtNGE3Ni1hMGFlLWM2N2E3NWE2NjMwYSJ9.tletsulMzXhmrFCtk-tqqQyrUQHfYKWFpMBRIqJZqpE",
  "access_expires_at": "2026-10-31T18:23:21.942057319Z",
  "refresh_token": "TAaPcuzQT0I3_Eq7jLMPOmSZeWRR07h-yEksqfIZekk",
  "refresh_expires_at": "2026-11-30T18:08:21.939492019Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18365"
}
```

```json
{
  "challenge_id": "0b8889b4-034d-4140-a3f3-8301c7fbc562",
  "expires_at": "2026-10-31T18:13:22.320379434Z",
  "resend_available_at": "2026-10-31T18:08:23.320379434Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "860055",
  "sent_at": "2026-10-31T18:08:22.326584824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b8889b4-034d-4140-a3f3-8301c7fbc562",
  "code": "860055",
  "device_ref": "sandbox-18365"
}
```

```json
{
  "session_id": "a4930030-ea0e-4fca-b14e-158dd32aa31e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MTAwMiwiaWF0IjoxNzkzNDcwMTAyLCJqdGkiOiJjZmQwNGNlMi00MTI0LTRhMDMtOTVlMy03YmMyMTVlMjYyNGUiLCJzaWQiOiJhNDkzMDAzMC1lYTBlLTRmY2EtYjE0ZS0xNThkZDMyYWEzMWUifQ.xlw25F8oRZqofodrBjgAlE6lud05XOszgyC2cKqGcf4",
  "access_expires_at": "2026-10-31T18:23:22.680613955Z",
  "refresh_token": "bdXaN28iJFM7rhmaYp8r0cJHa-4q3dQAYn4rDwQn47c",
  "refresh_expires_at": "2026-11-30T18:08:22.679461641Z",
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
  "command_id": "10c74bb1-7456-4265-8730-018d64d1c73d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:08:23Z",
    "sequence": 1793470103377
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4e70f876-c158-4151-b9a5-1ba8c685ed6f",
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
  "last_heartbeat_at": "2026-10-31T18:08:23.451118Z",
  "last_location_at": "2026-10-31T18:08:23.451118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2681b29-902a-4d9a-a222-8e6ed042cbb1",
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
  "id": "f9f024f5-6e7d-41a3-9dee-8b2193b0cc78",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:13:23.856980Z",
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
  "command_id": "041cc5b9-58d5-4275-98f1-6349276fb362",
  "quote_id": "f9f024f5-6e7d-41a3-9dee-8b2193b0cc78",
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
  "id": "f83b77cd-b2d4-4eff-8572-c7ebd34f17f2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "937194f8-b55f-40db-acf4-3a5c9d5bbf2e",
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
  "created_at": "2026-10-31T18:08:24.284911Z",
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
    "id": "c166af47-e4d5-4fea-89d2-b85800907ee4",
    "order_id": "f83b77cd-b2d4-4eff-8572-c7ebd34f17f2",
    "expires_at": "2026-10-31T18:08:39.296183Z",
    "server_time": "2026-10-31T18:08:24.697787762Z",
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

`POST /api/driver/v1/offers/c166af47-e4d5-4fea-89d2-b85800907ee4/accept` → **200**

```json
{
  "command_id": "ac92a8be-f6e8-41de-83ab-f47e29457a3a"
}
```

```json
{
  "id": "f9f84b3b-22f5-4453-9134-c5b377ae2f7e",
  "order_id": "f83b77cd-b2d4-4eff-8572-c7ebd34f17f2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c6b76ac6-7540-490d-bb96-9ba83a6f5fab",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c6b76ac6-7540-490d-bb96-9ba83a6f5fab",
  "order_id": "f83b77cd-b2d4-4eff-8572-c7ebd34f17f2",
  "assignment_id": "f9f84b3b-22f5-4453-9134-c5b377ae2f7e",
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

`POST /api/driver/v1/work-sessions/4e70f876-c158-4151-b9a5-1ba8c685ed6f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:08:25Z",
    "sequence": 1793470105739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4e70f876-c158-4151-b9a5-1ba8c685ed6f",
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
  "last_heartbeat_at": "2026-10-31T18:08:25.795369Z",
  "last_location_at": "2026-10-31T18:08:25.795369Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c6b76ac6-7540-490d-bb96-9ba83a6f5fab/arrive` → **200**

```json
{
  "command_id": "6d1a2f4e-4991-44f6-b3d5-9a3198057a7f",
  "expected_version": 0
}
```

```json
{
  "id": "c6b76ac6-7540-490d-bb96-9ba83a6f5fab",
  "order_id": "f83b77cd-b2d4-4eff-8572-c7ebd34f17f2",
  "assignment_id": "f9f84b3b-22f5-4453-9134-c5b377ae2f7e",
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
  "arrived_at": "2026-10-31T18:08:26.153823Z",
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

`POST /api/driver/v1/trips/c6b76ac6-7540-490d-bb96-9ba83a6f5fab/start` → **200**

```json
{
  "command_id": "0db227df-1336-4d4a-aeab-a3aae3257cd6",
  "expected_version": 1
}
```

```json
{
  "id": "c6b76ac6-7540-490d-bb96-9ba83a6f5fab",
  "order_id": "f83b77cd-b2d4-4eff-8572-c7ebd34f17f2",
  "assignment_id": "f9f84b3b-22f5-4453-9134-c5b377ae2f7e",
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
  "arrived_at": "2026-10-31T18:08:26.153823Z",
  "started_at": "2026-10-31T18:08:26.496959Z",
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

TripCompleted cbe89f88-408a-4204-8396-ca63027d1154: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **2** (sent before the crash, not again after it).

**The live message went out 2 times.**
