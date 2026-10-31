# Fault tests (2026-10-31T17:04:35Z, 5648cb8, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672403376",
  "device_ref": "sandbox-7001"
}
```

```json
{
  "challenge_id": "d1bc6b9a-eb84-4e09-827d-aa3b18944bd1",
  "expires_at": "2026-10-31T17:09:50.697594993Z",
  "resend_available_at": "2026-10-31T17:04:51.697594993Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672403376` → **200**

```json
{
  "phone": "+380672403376",
  "audience": "CLIENT",
  "code": "822439",
  "sent_at": "2026-10-31T17:04:50.711922579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1bc6b9a-eb84-4e09-827d-aa3b18944bd1",
  "code": "822439",
  "device_ref": "sandbox-7001"
}
```

```json
{
  "session_id": "076c613d-99cb-48f0-80b9-56070c955cf2",
  "subject": {
    "type": "CLIENT",
    "id": "e19112da-eceb-463b-9322-d85474b9e09b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTkxMTJkYS1lY2ViLTQ2M2ItOTMyMi1kODU0NzRiOWUwOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDY3MTk5LCJpYXQiOjE3OTM0NjYyOTksImp0aSI6ImE4MWE1NGNkLTAwNWItNDhhMi04ODE0LTgwNWQ1ZDc1ZDE1NSIsInNpZCI6IjA3NmM2MTNkLTk5Y2ItNDhmMC04MGI5LTU2MDcwYzk1NWNmMiJ9.xR7uhVb0lFNwB1AwDXwhul9ZDMkArAgeoXXJuo_J4_U",
  "access_expires_at": "2026-10-31T17:19:59.609527324Z",
  "refresh_token": "gdsoFoAr_YWm0m_UDyekf1rPDB_tCPj4ACxi0u8ltOQ",
  "refresh_expires_at": "2026-11-30T17:04:59.606929697Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15502"
}
```

```json
{
  "challenge_id": "683fbdfc-f85d-4b63-8135-ead0311c2f5c",
  "expires_at": "2026-10-31T17:10:00.039513496Z",
  "resend_available_at": "2026-10-31T17:05:01.039513496Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "764819",
  "sent_at": "2026-10-31T17:05:00.04546668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "683fbdfc-f85d-4b63-8135-ead0311c2f5c",
  "code": "764819",
  "device_ref": "sandbox-15502"
}
```

```json
{
  "session_id": "e05f206b-07ac-4c16-a38c-a4051400a02a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ2NzIwMCwiaWF0IjoxNzkzNDY2MzAwLCJqdGkiOiIwYzlkMGU5NS04ZWU2LTQ1YzQtODRhOS0xYTFmNmVkZjMwZTAiLCJzaWQiOiJlMDVmMjA2Yi0wN2FjLTRjMTYtYTM4Yy1hNDA1MTQwMGEwMmEifQ.wtb-DDlVdOD2n3IcVtSo9vgeTX-xOrpelvd_EYgzuAM",
  "access_expires_at": "2026-10-31T17:20:00.406999274Z",
  "refresh_token": "zH5DR0sOlnbOGrUgKL4lalrXZJQ_T4UM33NZQD2aDoE",
  "refresh_expires_at": "2026-11-30T17:05:00.405562825Z",
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
  "command_id": "1ad4304a-accb-4593-96f6-860b7fbdaff5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T17:05:01Z",
    "sequence": 1793466301817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "744de93f-6b2a-4dd5-9a43-540c3859b8b6",
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
  "last_heartbeat_at": "2026-10-31T17:05:01.35348Z",
  "last_location_at": "2026-10-31T17:05:01.35348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c3f05768-e80f-44a2-a6d0-e0b0bfd51264",
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
  "id": "5d4087fe-8271-41d9-8b9e-aefc48f87524",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T17:10:01.732003Z",
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
  "command_id": "6ff9acf0-9cb2-4827-a3df-f7fd54ddcbb2",
  "quote_id": "5d4087fe-8271-41d9-8b9e-aefc48f87524",
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
  "id": "fa5466fa-4596-4db0-989d-0f1283eadaef",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e19112da-eceb-463b-9322-d85474b9e09b",
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
  "created_at": "2026-10-31T17:05:02.172368Z",
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
    "id": "108a6d8a-ce62-40d2-b433-1bd449f9a26c",
    "order_id": "fa5466fa-4596-4db0-989d-0f1283eadaef",
    "expires_at": "2026-10-31T17:05:17.182291Z",
    "server_time": "2026-10-31T17:05:02.572782761Z",
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

`POST /api/driver/v1/offers/108a6d8a-ce62-40d2-b433-1bd449f9a26c/accept` → **409**

```json
{
  "command_id": "3f402f8f-3748-4392-b1bd-b75c9c11bbf0"
}
```

```json
{
  "instance": "/api/driver/v1/offers/108a6d8a-ce62-40d2-b433-1bd449f9a26c/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "0345185d-df1f-48cd-8170-1cc2774bee5b"
}
```

The retry with the same command: HTTP .

**The retry was not answered with the first result.**
