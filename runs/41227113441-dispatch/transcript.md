# Fault tests (2026-10-31T17:59:22Z, b70f5cf, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679855918",
  "device_ref": "sandbox-25789"
}
```

```json
{
  "challenge_id": "30aeca92-06a7-49bd-8fcd-b71bb89036e0",
  "expires_at": "2026-10-31T18:04:34.774229655Z",
  "resend_available_at": "2026-10-31T17:59:35.774229655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679855918` → **200**

```json
{
  "phone": "+380679855918",
  "audience": "CLIENT",
  "code": "340479",
  "sent_at": "2026-10-31T17:59:34.788426029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30aeca92-06a7-49bd-8fcd-b71bb89036e0",
  "code": "340479",
  "device_ref": "sandbox-25789"
}
```

```json
{
  "session_id": "e8567746-8ed4-4812-befd-a46d16a86e92",
  "subject": {
    "type": "CLIENT",
    "id": "4a4f1b43-2755-4343-9b4b-3be0db6a07d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTRmMWI0My0yNzU1LTQzNDMtOWI0Yi0zYmUwZGI2YTA3ZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwNDgxLCJpYXQiOjE3OTM0Njk1ODEsImp0aSI6ImVhYzQzMjg2LThhMjMtNDMwNi1iMTZlLWUxOTJiODg3Njc4YiIsInNpZCI6ImU4NTY3NzQ2LThlZDQtNDgxMi1iZWZkLWE0NmQxNmE4NmU5MiJ9.amvTKgYFbl_NcuDEtNmWSWLVR_G7F038-wwKkrFzF2k",
  "access_expires_at": "2026-10-31T18:14:41.318070429Z",
  "refresh_token": "cg6zKeZHAnDxqLLlFjHpw0E6uj-CB46TIwdt_8qqp0k",
  "refresh_expires_at": "2026-11-30T17:59:41.315923267Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25282"
}
```

```json
{
  "challenge_id": "878ed483-a7dc-4a9e-9e74-19df7bdc64b5",
  "expires_at": "2026-10-31T18:04:41.680452491Z",
  "resend_available_at": "2026-10-31T17:59:42.680452491Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "186505",
  "sent_at": "2026-10-31T17:59:41.685880102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "878ed483-a7dc-4a9e-9e74-19df7bdc64b5",
  "code": "186505",
  "device_ref": "sandbox-25282"
}
```

```json
{
  "session_id": "323bc818-7d91-4c8f-9f95-a8264dad2256",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDQ4MiwiaWF0IjoxNzkzNDY5NTgyLCJqdGkiOiJhNjkxNzVkYy1kMWFkLTRjYWUtOGE4ZS05Y2I0N2Y2MzJmNDQiLCJzaWQiOiIzMjNiYzgxOC03ZDkxLTRjOGYtOWY5NS1hODI2NGRhZDIyNTYifQ.pJd4WjYfM5UZCLjCI0JJeGlX7dzK7yPY8KFWF21ICGA",
  "access_expires_at": "2026-10-31T18:14:42.029926843Z",
  "refresh_token": "mlmebYp_0E20MP2Q9ksRMFcRtViBwaaKGeIoRY2-9p8",
  "refresh_expires_at": "2026-11-30T17:59:42.028854311Z",
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
  "command_id": "5087ffc8-aea2-45a5-ad8d-94b83bf20d8a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:59:42Z",
    "sequence": 1793469582673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d0de7758-d0c6-4b59-b294-83c6c1c6c60b",
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
  "last_heartbeat_at": "2026-10-31T17:59:42.770622Z",
  "last_location_at": "2026-10-31T17:59:42.770622Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "614c0011-bce0-465b-bacd-3044a45f3f1f",
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
  "id": "57f421dc-25aa-462d-8055-840c0a95933e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T18:04:43.171749Z",
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
  "command_id": "df38ae18-f944-408d-9750-7f564b049142",
  "quote_id": "57f421dc-25aa-462d-8055-840c0a95933e",
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
  "id": "7e96adeb-f512-44bd-957f-55666185df70",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4a4f1b43-2755-4343-9b4b-3be0db6a07d7",
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
  "created_at": "2026-10-31T17:59:43.601041Z",
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
    "id": "17cebd84-5ce0-4547-9435-662e4934daec",
    "order_id": "7e96adeb-f512-44bd-957f-55666185df70",
    "expires_at": "2026-10-31T17:59:58.611085Z",
    "server_time": "2026-10-31T17:59:43.989286259Z",
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

`POST /api/driver/v1/offers/17cebd84-5ce0-4547-9435-662e4934daec/accept` → **409**

```json
{
  "command_id": "2ff6fae5-3f9e-449d-bef8-428858d411d3"
}
```

```json
{
  "instance": "/api/driver/v1/offers/17cebd84-5ce0-4547-9435-662e4934daec/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "77b2483c-4ea0-45f5-b240-4fee171ecb58"
}
```

The retry with the same command: HTTP 409.

**The retry was not answered with the first result.**
