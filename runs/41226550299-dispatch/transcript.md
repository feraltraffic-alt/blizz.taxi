# Fault tests (2026-10-31T17:53:26Z, 4796389, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672148728",
  "device_ref": "sandbox-31094"
}
```

```json
{
  "challenge_id": "7548ab31-05d7-42ea-a648-095605c4a41c",
  "expires_at": "2026-10-31T17:58:37.035218242Z",
  "resend_available_at": "2026-10-31T17:53:38.035218242Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672148728` → **200**

```json
{
  "phone": "+380672148728",
  "audience": "CLIENT",
  "code": "337220",
  "sent_at": "2026-10-31T17:53:37.045708085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7548ab31-05d7-42ea-a648-095605c4a41c",
  "code": "337220",
  "device_ref": "sandbox-31094"
}
```

```json
{
  "session_id": "457360dc-ad59-4a2e-98cd-fd205384b22d",
  "subject": {
    "type": "CLIENT",
    "id": "a4c0f9a1-db60-4a80-828a-59bbb78ce00b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGMwZjlhMS1kYjYwLTRhODAtODI4YS01OWJiYjc4Y2UwMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDcwMTIyLCJpYXQiOjE3OTM0NjkyMjIsImp0aSI6ImZhNzA3OGEyLTBkNTgtNDg1Mi05NmM4LTg4ZTlkYWQzOGMwNSIsInNpZCI6IjQ1NzM2MGRjLWFkNTktNGEyZS05OGNkLWZkMjA1Mzg0YjIyZCJ9.C7CLNHilQNwa2uOGf5roopp0A9kRenKntYeGD8A16TA",
  "access_expires_at": "2026-10-31T18:08:42.189361641Z",
  "refresh_token": "v0fim4bKP1UL7bboUKfhN5XTspGE18kNOzIC0rntx9I",
  "refresh_expires_at": "2026-11-30T17:53:42.187899718Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18942"
}
```

```json
{
  "challenge_id": "ddc348b5-c467-4ec2-8f00-38d9539d7a00",
  "expires_at": "2026-10-31T17:58:42.427380423Z",
  "resend_available_at": "2026-10-31T17:53:43.427380423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "092790",
  "sent_at": "2026-10-31T17:53:42.431999034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddc348b5-c467-4ec2-8f00-38d9539d7a00",
  "code": "092790",
  "device_ref": "sandbox-18942"
}
```

```json
{
  "session_id": "3e49959e-2534-42e1-9901-828e9f982426",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ3MDEyMiwiaWF0IjoxNzkzNDY5MjIyLCJqdGkiOiJjMmQ3YzljMy03M2I5LTQxMWEtODA4Ny00YWJhZDhlZDkxYWYiLCJzaWQiOiIzZTQ5OTU5ZS0yNTM0LTQyZTEtOTkwMS04MjhlOWY5ODI0MjYifQ.gPF3Nnwcuzv1vs1Yd_p7e_zb1aixcXcRRk49v7eaTHk",
  "access_expires_at": "2026-10-31T18:08:42.662300109Z",
  "refresh_token": "YX3CjjArgB4_zucX57ZKpO2Q-qm1Hrh5JgeEOciQnVw",
  "refresh_expires_at": "2026-11-30T17:53:42.661507485Z",
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
  "command_id": "4c648e6e-8f6a-4848-adc6-7876974a333b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:53:43Z",
    "sequence": 1793469223108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85853f3b-86e5-4c94-ab44-80377c2860e6",
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
  "last_heartbeat_at": "2026-10-31T17:53:43.244758Z",
  "last_location_at": "2026-10-31T17:53:43.244758Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bccf5a41-140c-4ece-b7c0-ba8a1a7cbeed",
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
  "id": "1a27d951-31cd-4d27-a0df-412ffd974b83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:58:43.503068Z",
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
  "command_id": "9ef1a30c-a005-4683-8198-5a5a8c77c8a0",
  "quote_id": "1a27d951-31cd-4d27-a0df-412ffd974b83",
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
  "id": "f16c2c22-94f8-4b3d-9466-d41bd5416945",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a4c0f9a1-db60-4a80-828a-59bbb78ce00b",
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
  "created_at": "2026-10-31T17:53:43.793802Z",
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
    "id": "5af76613-7d3a-47e5-9f79-6db7410b76fe",
    "order_id": "f16c2c22-94f8-4b3d-9466-d41bd5416945",
    "expires_at": "2026-10-31T17:53:58.800891Z",
    "server_time": "2026-10-31T17:53:44.055876377Z",
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

`POST /api/driver/v1/offers/5af76613-7d3a-47e5-9f79-6db7410b76fe/accept` → **409**

```json
{
  "command_id": "a27ccbdd-1e73-40fc-afe1-260e2f308c46"
}
```

```json
{
  "instance": "/api/driver/v1/offers/5af76613-7d3a-47e5-9f79-6db7410b76fe/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "e051ef41-e944-4232-bce2-acd723ce44ab"
}
```

The retry with the same command: HTTP 409.

**The retry was not answered with the first result.**
