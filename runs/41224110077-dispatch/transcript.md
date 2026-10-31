# Fault tests (2026-10-31T17:22:03Z, 8d71ec1, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674051192",
  "device_ref": "sandbox-16532"
}
```

```json
{
  "challenge_id": "7f6df116-8e2b-4990-81fa-a18886ee048a",
  "expires_at": "2026-10-31T17:27:16.683041125Z",
  "resend_available_at": "2026-10-31T17:22:17.683041125Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674051192` → **200**

```json
{
  "phone": "+380674051192",
  "audience": "CLIENT",
  "code": "533409",
  "sent_at": "2026-10-31T17:22:16.70366522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f6df116-8e2b-4990-81fa-a18886ee048a",
  "code": "533409",
  "device_ref": "sandbox-16532"
}
```

```json
{
  "session_id": "3b35650a-27bc-46e2-828c-5747a33c8087",
  "subject": {
    "type": "CLIENT",
    "id": "0398a0f8-aefb-4245-b516-ecd1d7ab4d40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzk4YTBmOC1hZWZiLTQyNDUtYjUxNi1lY2QxZDdhYjRkNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY4MjQ2LCJpYXQiOjE3OTM0NjczNDYsImp0aSI6ImViY2M1M2VhLWUyNmItNDY0ZC05NjUyLTJlNGU3NTI2NmFhZCIsInNpZCI6IjNiMzU2NTBhLTI3YmMtNDZlMi04MjhjLTU3NDdhMzNjODA4NyJ9.DP06etOBomlVmrIGBnPfBsanLZOsXkf2AGz7-wcpIaI",
  "access_expires_at": "2026-10-31T17:37:26.941162596Z",
  "refresh_token": "EOCYfI1xdhbGLoxfK2WN92Zs8yw4mI9GI76-Y7Iy-2Y",
  "refresh_expires_at": "2026-11-30T17:22:26.938267696Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32649"
}
```

```json
{
  "challenge_id": "6a771138-d38a-470a-b994-74f197b9b43a",
  "expires_at": "2026-10-31T17:27:27.311231693Z",
  "resend_available_at": "2026-10-31T17:22:28.311231693Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "606815",
  "sent_at": "2026-10-31T17:22:27.31803178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a771138-d38a-470a-b994-74f197b9b43a",
  "code": "606815",
  "device_ref": "sandbox-32649"
}
```

```json
{
  "session_id": "6ffafc62-94d9-4818-967e-0d659c1002c6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2ODI0NywiaWF0IjoxNzkzNDY3MzQ3LCJqdGkiOiI0YzJiZTU0ZS01NDA5LTQ5OWEtODU0Mi02NDgxN2NkZDk2NDYiLCJzaWQiOiI2ZmZhZmM2Mi05NGQ5LTQ4MTgtOTY3ZS0wZDY1OWMxMDAyYzYifQ.F9KVxlJ873rX_txOzftIkjl84AdJ0B3rCGwR2u762Io",
  "access_expires_at": "2026-10-31T17:37:27.670349814Z",
  "refresh_token": "g2ylpr-6Tk0mfIpoUo2ECGT9PqimV9otvSvBAdoatl0",
  "refresh_expires_at": "2026-11-30T17:22:27.667861754Z",
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
  "command_id": "4ff6b15c-7bc5-4364-8c89-984009ac51c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:22:28Z",
    "sequence": 1793467348361
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b1e8b663-d506-471b-9606-fd6b7bc9652b",
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
  "last_heartbeat_at": "2026-10-31T17:22:28.477887Z",
  "last_location_at": "2026-10-31T17:22:28.477887Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "60f054e5-ad3e-4997-a1e3-f3094f119781",
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
  "id": "213411b2-f42f-4059-b477-9ae5b81fae34",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:27:28.884942Z",
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
  "command_id": "c30c9ba6-7344-4907-a9b3-fbd3f34318bb",
  "quote_id": "213411b2-f42f-4059-b477-9ae5b81fae34",
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
  "id": "332035c5-647d-4691-8e9f-21d45433e18b",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0398a0f8-aefb-4245-b516-ecd1d7ab4d40",
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
  "created_at": "2026-10-31T17:22:29.304504Z",
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
    "id": "7bc05bad-a4c0-412d-a368-233abe77f60e",
    "order_id": "332035c5-647d-4691-8e9f-21d45433e18b",
    "expires_at": "2026-10-31T17:22:44.317641Z",
    "server_time": "2026-10-31T17:22:29.737921196Z",
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

`POST /api/driver/v1/offers/7bc05bad-a4c0-412d-a368-233abe77f60e/accept` → **409**

```json
{
  "command_id": "35e1a5e3-b8b3-4352-96e1-b082f33a8322"
}
```

```json
{
  "instance": "/api/driver/v1/offers/7bc05bad-a4c0-412d-a368-233abe77f60e/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "fa936c0b-155d-4bb7-a2f5-25d0ac0c370d"
}
```

The retry with the same command: HTTP 409.

**The retry was not answered with the first result.**
