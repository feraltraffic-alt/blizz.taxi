# Fault tests (2026-10-31T17:12:21Z, 8b135d5, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677508684",
  "device_ref": "sandbox-18346"
}
```

```json
{
  "challenge_id": "d29c3227-62a3-4739-ab45-e247f232d62a",
  "expires_at": "2026-10-31T17:17:33.686702073Z",
  "resend_available_at": "2026-10-31T17:12:34.686702073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677508684` → **200**

```json
{
  "phone": "+380677508684",
  "audience": "CLIENT",
  "code": "211331",
  "sent_at": "2026-10-31T17:12:33.702085357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d29c3227-62a3-4739-ab45-e247f232d62a",
  "code": "211331",
  "device_ref": "sandbox-18346"
}
```

```json
{
  "session_id": "c84914d3-5eb9-4bf9-9f59-5b7e806fecad",
  "subject": {
    "type": "CLIENT",
    "id": "664f3b69-4fa4-4a84-9098-c1f4530fcdda"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjRmM2I2OS00ZmE0LTRhODQtOTA5OC1jMWY0NTMwZmNkZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3NjYwLCJpYXQiOjE3OTM0NjY3NjAsImp0aSI6IjZlMWJjMGE3LTYxOTgtNDE4NC1hNjliLTc4MTM4ZDRhOTQyNSIsInNpZCI6ImM4NDkxNGQzLTVlYjktNGJmOS05ZjU5LTViN2U4MDZmZWNhZCJ9.OhlGbyWZLx7aL3-0pWfQ_iXHMg4SNEhgvYv_TkpvKzE",
  "access_expires_at": "2026-10-31T17:27:40.821234654Z",
  "refresh_token": "cqXhDqN5yCQEWesTpz6-jB0iB8W3nCmHOpe-HivBGAY",
  "refresh_expires_at": "2026-11-30T17:12:40.819219759Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27191"
}
```

```json
{
  "challenge_id": "bc2b7dad-28fc-4201-854e-ec5fb5c89e4c",
  "expires_at": "2026-10-31T17:17:41.18805017Z",
  "resend_available_at": "2026-10-31T17:12:42.18805017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "514927",
  "sent_at": "2026-10-31T17:12:41.193729303Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc2b7dad-28fc-4201-854e-ec5fb5c89e4c",
  "code": "514927",
  "device_ref": "sandbox-27191"
}
```

```json
{
  "session_id": "00892e5a-b9fd-4ce5-bdb1-1a6c9317ba67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzY2MSwiaWF0IjoxNzkzNDY2NzYxLCJqdGkiOiJjYmI5N2ZmNi1kZWU4LTQ3NjItYWY0MS01NTdiYzJiNWEyNzAiLCJzaWQiOiIwMDg5MmU1YS1iOWZkLTRjZTUtYmRiMS0xYTZjOTMxN2JhNjcifQ.o12_SE2k98vhczRp8Fv6f4uhLdFwsbGXcnW8JKjwIYw",
  "access_expires_at": "2026-10-31T17:27:41.538222354Z",
  "refresh_token": "NcC3ud_iqrcW2eAy7hqtuVGELcrySkFtvG052Ua8SCg",
  "refresh_expires_at": "2026-11-30T17:12:41.537200286Z",
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
  "command_id": "f285594e-76c5-4932-b0cd-91ded89866ab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:12:42Z",
    "sequence": 1793466762211
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "98269df0-46ce-4ce0-b989-cddbf29f9ccf",
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
  "last_heartbeat_at": "2026-10-31T17:12:42.324449Z",
  "last_location_at": "2026-10-31T17:12:42.324449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55cdcf71-7d6b-433b-9c2a-aacc5d29e7e8",
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
  "id": "199ee7d3-f642-4b3e-9ba8-5edd74215a50",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:17:42.740416Z",
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
  "command_id": "af8bc396-b410-44d2-b972-665236a5fa15",
  "quote_id": "199ee7d3-f642-4b3e-9ba8-5edd74215a50",
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
  "id": "295ff3b7-626c-473f-b91a-c1b5afc639b2",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "664f3b69-4fa4-4a84-9098-c1f4530fcdda",
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
  "created_at": "2026-10-31T17:12:43.186269Z",
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
    "id": "23e5691e-5907-40b8-b788-fc77e642da71",
    "order_id": "295ff3b7-626c-473f-b91a-c1b5afc639b2",
    "expires_at": "2026-10-31T17:12:58.199737Z",
    "server_time": "2026-10-31T17:12:43.631947245Z",
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

`POST /api/driver/v1/offers/23e5691e-5907-40b8-b788-fc77e642da71/accept` → **409**

```json
{
  "command_id": "dd204685-c5c7-419f-905c-cbb62187123b"
}
```

```json
{
  "instance": "/api/driver/v1/offers/23e5691e-5907-40b8-b788-fc77e642da71/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "9c560c24-a2f9-4976-831b-0c7b21fc9608"
}
```

The retry with the same command: HTTP 409.

**The retry was not answered with the first result.**
