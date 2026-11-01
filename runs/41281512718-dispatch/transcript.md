# Fault tests (2026-11-01T06:37:15Z, 20b07af, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671028578",
  "device_ref": "sandbox-8837"
}
```

```json
{
  "challenge_id": "44966139-4e38-4f80-9fd0-e050aa03307e",
  "expires_at": "2026-11-01T06:42:25.682317973Z",
  "resend_available_at": "2026-11-01T06:37:26.682317973Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671028578` → **200**

```json
{
  "phone": "+380671028578",
  "audience": "CLIENT",
  "code": "897088",
  "sent_at": "2026-11-01T06:37:25.693915657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44966139-4e38-4f80-9fd0-e050aa03307e",
  "code": "897088",
  "device_ref": "sandbox-8837"
}
```

```json
{
  "session_id": "3913a788-9240-405d-9898-2d3342cac662",
  "subject": {
    "type": "CLIENT",
    "id": "5332fb78-3105-4593-978d-278b0e40f4fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzMyZmI3OC0zMTA1LTQ1OTMtOTc4ZC0yNzhiMGU0MGY0ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE1OTUyLCJpYXQiOjE3OTM1MTUwNTIsImp0aSI6IjYyYTE5ZjNhLWZlN2QtNGMxNy05MWJlLTU2ZTc4MGI5MzZmNCIsInNpZCI6IjM5MTNhNzg4LTkyNDAtNDA1ZC05ODk4LTJkMzM0MmNhYzY2MiJ9.JEKJeqrdK1MYrEFG_yOpRMsZI7hxqbZSgI-lUpMA4Us",
  "access_expires_at": "2026-11-01T06:52:32.818259982Z",
  "refresh_token": "rSyD0VcRSbWGeTcMizoz6VMweoYE629htv3EwOM-vxI",
  "refresh_expires_at": "2026-12-01T06:37:32.816346397Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2404"
}
```

```json
{
  "challenge_id": "2d542351-9b7d-4463-bfb3-1c5bf195853d",
  "expires_at": "2026-11-01T06:42:33.127778758Z",
  "resend_available_at": "2026-11-01T06:37:34.127778758Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "519034",
  "sent_at": "2026-11-01T06:37:33.143344485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d542351-9b7d-4463-bfb3-1c5bf195853d",
  "code": "519034",
  "device_ref": "sandbox-2404"
}
```

```json
{
  "session_id": "5a251eb2-0a79-44b0-9f44-a787468f1a9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNTk1MywiaWF0IjoxNzkzNTE1MDUzLCJqdGkiOiIxN2M2NjY1Zi1jMGE0LTQ0MTYtYjE2YS0yMzM3MjI1OGU0MzIiLCJzaWQiOiI1YTI1MWViMi0wYTc5LTQ0YjAtOWY0NC1hNzg3NDY4ZjFhOWQifQ.R9-gDUhqf7xcQmHZGueahvd40YC2nId0A27ZwVS_3WM",
  "access_expires_at": "2026-11-01T06:52:33.423515099Z",
  "refresh_token": "g9_pX5nTBcb17MXgezyWkElG4pP3hNpKYF6HWsbzIhY",
  "refresh_expires_at": "2026-12-01T06:37:33.422642314Z",
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
  "command_id": "c07e5792-80fc-4e96-8ee7-ce565864f042",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:33Z",
    "sequence": 1793515053948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f7904623-bc13-445d-9aca-919f19a13289",
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
  "last_heartbeat_at": "2026-11-01T06:37:34.011893Z",
  "last_location_at": "2026-11-01T06:37:34.011893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9e52cd31-0f03-4d9a-a47a-91a1f054054e",
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
  "id": "23ffc550-464e-41b6-b997-12045d9ebebb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:42:34.325537Z",
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
  "command_id": "1c356af5-4a53-4dc6-aac3-5adef2553085",
  "quote_id": "23ffc550-464e-41b6-b997-12045d9ebebb",
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
  "id": "c16d4eff-3fa7-4a3f-b13e-63dc474c4d82",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5332fb78-3105-4593-978d-278b0e40f4fe",
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
  "created_at": "2026-11-01T06:37:34.689713Z",
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
    "id": "473f59cd-6fec-4195-a048-0150a6b411ca",
    "order_id": "c16d4eff-3fa7-4a3f-b13e-63dc474c4d82",
    "expires_at": "2026-11-01T06:37:49.701106Z",
    "server_time": "2026-11-01T06:37:35.070912875Z",
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

`POST /api/driver/v1/offers/473f59cd-6fec-4195-a048-0150a6b411ca/accept` → **409**

```json
{
  "command_id": "5c29c127-6cdf-490b-bef7-702e213b0bc7"
}
```

```json
{
  "instance": "/api/driver/v1/offers/473f59cd-6fec-4195-a048-0150a6b411ca/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "71648bb7-2e0c-4327-8732-db7910bb5fa8"
}
```

The retry with the same command: HTTP 409.

**The retry was not answered with the first result.**
