# Fault tests (2026-10-31T18:07:28Z, b6b39a4, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671579837",
  "device_ref": "sandbox-7164"
}
```

```json
{
  "challenge_id": "988761c3-1718-4201-9069-b604fb02b3b9",
  "expires_at": "2026-10-31T18:12:41.697923904Z",
  "resend_available_at": "2026-10-31T18:07:42.697923904Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671579837` → **200**

```json
{
  "phone": "+380671579837",
  "audience": "CLIENT",
  "code": "974144",
  "sent_at": "2026-10-31T18:07:41.716521774Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "988761c3-1718-4201-9069-b604fb02b3b9",
  "code": "974144",
  "device_ref": "sandbox-7164"
}
```

```json
{
  "session_id": "152467bb-f73a-4799-9a1a-b169c1acb4aa",
  "subject": {
    "type": "CLIENT",
    "id": "f91269ee-6737-43d6-8984-faab5b59b487"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOTEyNjllZS02NzM3LTQzZDYtODk4NC1mYWFiNWI1OWI0ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwOTY5LCJpYXQiOjE3OTM0NzAwNjksImp0aSI6IjRlYTFmOTJhLTU4YjAtNDJjNy1hMzUwLWFhNmVjMjQ1OGJhZSIsInNpZCI6IjE1MjQ2N2JiLWY3M2EtNDc5OS05YTFhLWIxNjljMWFjYjRhYSJ9.IQXmdeUmzC9fPRuYIpUF1IfsJgYVNkB8v87FdOZz79s",
  "access_expires_at": "2026-10-31T18:22:49.209169073Z",
  "refresh_token": "kgkSHePRXIlHWNeH5uRjI_gKtrz1kJ2xk2CJve-NdGs",
  "refresh_expires_at": "2026-11-30T18:07:49.206748053Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10352"
}
```

```json
{
  "challenge_id": "95f01688-6ddb-4c3e-9a7a-e1e3a2c3207d",
  "expires_at": "2026-10-31T18:12:49.587474432Z",
  "resend_available_at": "2026-10-31T18:07:50.587474432Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "516474",
  "sent_at": "2026-10-31T18:07:49.59322198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95f01688-6ddb-4c3e-9a7a-e1e3a2c3207d",
  "code": "516474",
  "device_ref": "sandbox-10352"
}
```

```json
{
  "session_id": "79611bb0-6778-48c7-bead-0aaeaa8263b6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDk2OSwiaWF0IjoxNzkzNDcwMDY5LCJqdGkiOiJmODA2OTA4ZS1jYTZiLTQ0NDYtYWRkOS0xZjg2M2Q5MzM1ZTYiLCJzaWQiOiI3OTYxMWJiMC02Nzc4LTQ4YzctYmVhZC0wYWFlYWE4MjYzYjYifQ.BiZiqssOXtV44dpIXtlB__toRWsevZUTJJTPTb_jUE8",
  "access_expires_at": "2026-10-31T18:22:49.94911724Z",
  "refresh_token": "ndluCvQS-xWm0AANc0Tsq4yjytIn6RzHF02uNe8Rdfk",
  "refresh_expires_at": "2026-11-30T18:07:49.948078576Z",
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
  "command_id": "cf5615b5-65e2-4512-9944-7eba0e5288bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T18:07:50Z",
    "sequence": 1793470070627
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f67490c4-702f-4b29-945e-a14017e05aeb",
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
  "last_heartbeat_at": "2026-10-31T18:07:50.735732Z",
  "last_location_at": "2026-10-31T18:07:50.735732Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1396be2a-b456-4319-ab91-2ff8f633cdc7",
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
  "id": "65cf4466-6861-4d90-b1a3-c5e1b28b1fc8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:12:51.123026Z",
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
  "command_id": "5cc4a709-4fa3-4cd1-9808-e0733969ffab",
  "quote_id": "65cf4466-6861-4d90-b1a3-c5e1b28b1fc8",
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
  "id": "e71c7628-bfe3-438c-b52d-00e7380661fa",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f91269ee-6737-43d6-8984-faab5b59b487",
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
  "created_at": "2026-10-31T18:07:51.584489Z",
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
    "id": "17049dc3-1431-4800-a610-60d30e3b07f9",
    "order_id": "e71c7628-bfe3-438c-b52d-00e7380661fa",
    "expires_at": "2026-10-31T18:08:06.59826Z",
    "server_time": "2026-10-31T18:07:52.020241449Z",
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

`POST /api/driver/v1/offers/17049dc3-1431-4800-a610-60d30e3b07f9/accept` → **409**

```json
{
  "command_id": "623b3a50-c9ad-4c09-9d74-ef8d0fb1fdb8"
}
```

```json
{
  "instance": "/api/driver/v1/offers/17049dc3-1431-4800-a610-60d30e3b07f9/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "5e0036a8-e5cc-4fac-8a05-8a01932864d8"
}
```

The retry with the same command: HTTP 409.

**The retry was not answered with the first result.**
