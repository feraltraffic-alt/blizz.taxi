# Fault tests (2026-10-31T21:54:10Z, 234f73b, break: dispatch)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679686915",
  "device_ref": "sandbox-17693"
}
```

```json
{
  "challenge_id": "b5fc87aa-8320-4188-90bc-977d3fb46a19",
  "expires_at": "2026-10-31T21:59:23.207054013Z",
  "resend_available_at": "2026-10-31T21:54:24.207054013Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679686915` → **200**

```json
{
  "phone": "+380679686915",
  "audience": "CLIENT",
  "code": "138870",
  "sent_at": "2026-10-31T21:54:23.22342925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5fc87aa-8320-4188-90bc-977d3fb46a19",
  "code": "138870",
  "device_ref": "sandbox-17693"
}
```

```json
{
  "session_id": "c6715d7a-8942-4d76-9e2e-d6abc98cb7ad",
  "subject": {
    "type": "CLIENT",
    "id": "74005766-ad80-4654-9c54-a1c5d5da4485"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDAwNTc2Ni1hZDgwLTQ2NTQtOWM1NC1hMWM1ZDVkYTQ0ODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNDg0NTcwLCJpYXQiOjE3OTM0ODM2NzAsImp0aSI6IjBmZTI4NzNiLWU0MmYtNGFkMy05MjU1LWYzMTg4MmZhNGE0MSIsInNpZCI6ImM2NzE1ZDdhLTg5NDItNGQ3Ni05ZTJlLWQ2YWJjOThjYjdhZCJ9.5Z5fvwaDekU3umUUWEjO900d7cuE3DJ8pEVOOi2BwZA",
  "access_expires_at": "2026-10-31T22:09:30.761901474Z",
  "refresh_token": "IAxRUmzVU7wpChIbUD9_TxE6NTFgi-xXWpBxnSCH0l4",
  "refresh_expires_at": "2026-11-30T21:54:30.759838145Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10537"
}
```

```json
{
  "challenge_id": "111befa9-39de-4eb1-86ed-ec79d88c8762",
  "expires_at": "2026-10-31T21:59:31.130015627Z",
  "resend_available_at": "2026-10-31T21:54:32.130015627Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "437301",
  "sent_at": "2026-10-31T21:54:31.135331405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "111befa9-39de-4eb1-86ed-ec79d88c8762",
  "code": "437301",
  "device_ref": "sandbox-10537"
}
```

```json
{
  "session_id": "ba0f373b-5004-400e-a560-1e2749b5b444",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzQ4NDU3MSwiaWF0IjoxNzkzNDgzNjcxLCJqdGkiOiI2NmNhZmFmZS1hNTNkLTQzNDItODYxZC01ZjQyZDEwZjdjMzUiLCJzaWQiOiJiYTBmMzczYi01MDA0LTQwMGUtYTU2MC0xZTI3NDliNWI0NDQifQ.-BYEc_DRG7fsvhn8GKFms-RyNQBbShnU4zgdiPL-olo",
  "access_expires_at": "2026-10-31T22:09:31.472984653Z",
  "refresh_token": "Ktztkckdm5LxFC4cZQ858YDwowrlY8sOVFGtvYG5PtQ",
  "refresh_expires_at": "2026-11-30T21:54:31.472050084Z",
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
  "command_id": "74903971-ebc1-4e55-918c-e76da8efe776",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-31T21:54:32Z",
    "sequence": 1793483672160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d485a64-03a1-43ff-8543-100ea73413e9",
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
  "last_heartbeat_at": "2026-10-31T21:54:32.260008Z",
  "last_location_at": "2026-10-31T21:54:32.260008Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cbcb10e3-164e-480d-8500-3449855bc438",
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
  "id": "f0413282-0b24-4ea1-8ce5-077496f35c26",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-31T21:59:32.639535Z",
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
  "command_id": "cf8bb513-2f2a-4b25-8846-a8f45573f341",
  "quote_id": "f0413282-0b24-4ea1-8ce5-077496f35c26",
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
  "id": "f13b1ea6-9aae-4e38-9e71-65e15619c24f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74005766-ad80-4654-9c54-a1c5d5da4485",
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
  "created_at": "2026-10-31T21:54:33.034809Z",
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
    "id": "f64f00ee-39b3-4a53-8d88-ea1db8702564",
    "order_id": "f13b1ea6-9aae-4e38-9e71-65e15619c24f",
    "expires_at": "2026-10-31T21:54:48.045734Z",
    "server_time": "2026-10-31T21:54:33.476016931Z",
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

`POST /api/driver/v1/offers/f64f00ee-39b3-4a53-8d88-ea1db8702564/accept` → **409**

```json
{
  "command_id": "7365ec89-37fb-43b3-b673-a43ac22cea1f"
}
```

```json
{
  "instance": "/api/driver/v1/offers/f64f00ee-39b3-4a53-8d88-ea1db8702564/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "bf6673c0-f72a-42b3-8afb-01809660bcdb"
}
```

The retry with the same command: HTTP 409.

**The retry was not answered with the first result.**
