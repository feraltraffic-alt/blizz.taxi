# Fault tests (2026-10-31T17:04:17Z, 5648cb8, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677294566",
  "device_ref": "sandbox-14330"
}
```

```json
{
  "challenge_id": "033ac398-e6da-496d-988e-9ff992fba63e",
  "expires_at": "2026-10-31T17:09:28.059315322Z",
  "resend_available_at": "2026-10-31T17:04:29.059315322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677294566` → **200**

```json
{
  "phone": "+380677294566",
  "audience": "CLIENT",
  "code": "005490",
  "sent_at": "2026-10-31T17:04:28.069987797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "033ac398-e6da-496d-988e-9ff992fba63e",
  "code": "005490",
  "device_ref": "sandbox-14330"
}
```

```json
{
  "session_id": "c577ff1f-ed7f-4ad5-8fc5-d15888dff909",
  "subject": {
    "type": "CLIENT",
    "id": "e6970549-719c-4ece-b560-6c33ad330be5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjk3MDU0OS03MTljLTRlY2UtYjU2MC02YzMzYWQzMzBiZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3MTczLCJpYXQiOjE3OTM0NjYyNzMsImp0aSI6IjMzZTRhYzI5LWMzNjYtNDYzNy04ZDE5LTAwMGVkMTc1NGEyYyIsInNpZCI6ImM1NzdmZjFmLWVkN2YtNGFkNS04ZmM1LWQxNTg4OGRmZjkwOSJ9.mzlTwklojYZnTcZuW2fP7aklQtZoZF7tDdDJYXVLOfs",
  "access_expires_at": "2026-10-31T17:19:33.451203238Z",
  "refresh_token": "O-n1sUsO-8e0COt20JeEXUTB63YU9Md7Gzg0ZKH_BaE",
  "refresh_expires_at": "2026-11-30T17:04:33.449583798Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6371"
}
```

```json
{
  "challenge_id": "9791ece9-334d-4023-a0bb-428a6fcb6082",
  "expires_at": "2026-10-31T17:09:33.70092033Z",
  "resend_available_at": "2026-10-31T17:04:34.70092033Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "674735",
  "sent_at": "2026-10-31T17:04:33.705226961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9791ece9-334d-4023-a0bb-428a6fcb6082",
  "code": "674735",
  "device_ref": "sandbox-6371"
}
```

```json
{
  "session_id": "79496ace-cf88-43a5-b1d4-e251ea4e6e45",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzE3MywiaWF0IjoxNzkzNDY2MjczLCJqdGkiOiIzM2UxYWZiOC01YjlkLTQ1ZjktYjE2Yy1lNmE2ZDJjYWZiNzciLCJzaWQiOiI3OTQ5NmFjZS1jZjg4LTQzYTUtYjFkNC1lMjUxZWE0ZTZlNDUifQ.NmCqjeYaE_gV9d-IkhKikyyONpuoOGxkdhlT6VvbQic",
  "access_expires_at": "2026-10-31T17:19:33.947559086Z",
  "refresh_token": "YoOpAgErMEaWlPHhsA3iL2Y0SVwUrG6dV4iTq6H9Gco",
  "refresh_expires_at": "2026-11-30T17:04:33.946887414Z",
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
  "command_id": "5d312850-db33-4a10-b926-1bee9b508dcb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:04:34Z",
    "sequence": 1793466274409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa40fcb4-d6c5-4489-8c60-7f64b0d0062b",
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
  "last_heartbeat_at": "2026-10-31T17:04:34.516327Z",
  "last_location_at": "2026-10-31T17:04:34.516327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7e9ea713-59bd-466a-a1a0-987b6334ce61",
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
  "id": "b29a0c92-6916-4583-a354-20b2477cb83e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:09:34.795574Z",
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
  "command_id": "48791cea-3f53-409a-a36c-a62a8ff99f88",
  "quote_id": "b29a0c92-6916-4583-a354-20b2477cb83e",
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
  "id": "c3f4a5fd-5130-4cc3-ae0b-63ee51294b88",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6970549-719c-4ece-b560-6c33ad330be5",
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
  "created_at": "2026-10-31T17:04:35.109858Z",
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
    "id": "03f4da4a-bfb1-435c-8083-7fcf3b4fe821",
    "order_id": "c3f4a5fd-5130-4cc3-ae0b-63ee51294b88",
    "expires_at": "2026-10-31T17:04:50.118716Z",
    "server_time": "2026-10-31T17:04:35.383558995Z",
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

`POST /api/driver/v1/offers/03f4da4a-bfb1-435c-8083-7fcf3b4fe821/accept` → **200**

```json
{
  "command_id": "11315774-a36a-496f-9073-38c86044f6cb"
}
```

```json
{
  "id": "976342cf-024d-4551-93f4-0194b4299b1d",
  "order_id": "c3f4a5fd-5130-4cc3-ae0b-63ee51294b88",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c763d5e3-2be3-41ee-9bad-e5a67b42cef6",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP .

**The retry was not answered with the first result.**
