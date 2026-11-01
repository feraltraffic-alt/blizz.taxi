# Fault tests (2026-11-01T06:37:12Z, 20b07af, break: outbox)

## Dispatch: the driver's accept is committed, the server dies before it answers; the app retries

Server start 1, armed at `dispatch.after-accept`.

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674529746",
  "device_ref": "sandbox-23292"
}
```

```json
{
  "challenge_id": "21edac0e-ab04-47bf-a53a-d7f9b7834f98",
  "expires_at": "2026-11-01T06:42:21.464124975Z",
  "resend_available_at": "2026-11-01T06:37:22.464124975Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674529746` → **200**

```json
{
  "phone": "+380674529746",
  "audience": "CLIENT",
  "code": "317402",
  "sent_at": "2026-11-01T06:37:21.473614321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21edac0e-ab04-47bf-a53a-d7f9b7834f98",
  "code": "317402",
  "device_ref": "sandbox-23292"
}
```

```json
{
  "session_id": "abc813aa-ff71-4b6a-95cb-c7bace859446",
  "subject": {
    "type": "CLIENT",
    "id": "881722e2-32fb-4289-afac-9654c9ec0b75"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE3MjJlMi0zMmZiLTQyODktYWZhYy05NjU0YzllYzBiNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE1OTQ5LCJpYXQiOjE3OTM1MTUwNDksImp0aSI6IjRmMWU0ODExLTJjYWMtNDZjYi05ZTU1LWVjNzRjMTZkMmQ3MiIsInNpZCI6ImFiYzgxM2FhLWZmNzEtNGI2YS05NWNiLWM3YmFjZTg1OTQ0NiJ9.gcxpOT0FosJEooBng5AaDKYSgthGhsRdkAUX8BxaTKc",
  "access_expires_at": "2026-11-01T06:52:29.13774205Z",
  "refresh_token": "YVP2PKgmuU974CVPYeln_whE9dDA9FkZemqVtVk2mqQ",
  "refresh_expires_at": "2026-12-01T06:37:29.135668988Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26579"
}
```

```json
{
  "challenge_id": "1143474e-b21b-44a5-995e-12b37ad26638",
  "expires_at": "2026-11-01T06:42:29.387365658Z",
  "resend_available_at": "2026-11-01T06:37:30.387365658Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "982142",
  "sent_at": "2026-11-01T06:37:29.39204916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1143474e-b21b-44a5-995e-12b37ad26638",
  "code": "982142",
  "device_ref": "sandbox-26579"
}
```

```json
{
  "session_id": "9f36c498-1bc9-4cd9-9192-45e4da5ae966",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNTk0OSwiaWF0IjoxNzkzNTE1MDQ5LCJqdGkiOiI4N2M1YzViYy0wNjgzLTRlOTQtOTE1Yi0xOTZhYzNlMmVmMzciLCJzaWQiOiI5ZjM2YzQ5OC0xYmM5LTRjZDktOTE5Mi00NWU0ZGE1YWU5NjYifQ.VA7-oTGWI9ILd0AqVNM-1g7To59nUGUhwgKJ3v7aJuk",
  "access_expires_at": "2026-11-01T06:52:29.626909165Z",
  "refresh_token": "y_IL00lVa7yuZEZA7c1bMV8nqcL8-upsXK8hZxW_hGU",
  "refresh_expires_at": "2026-12-01T06:37:29.626257033Z",
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
  "command_id": "d2ef332e-61fe-44b8-93f4-cc777b46c45c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:30Z",
    "sequence": 1793515050119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad6bb413-a574-47c4-9d7d-92b9969a5dce",
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
  "last_heartbeat_at": "2026-11-01T06:37:30.327634Z",
  "last_location_at": "2026-11-01T06:37:30.327634Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c7ed6b7-1355-4e30-acae-2b5799592441",
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
  "id": "fdc9de04-468c-40c8-9811-dbde4eb16729",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:42:30.770902Z",
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
  "command_id": "bdfd3474-2466-49c0-9cf5-0a5247ffe27a",
  "quote_id": "fdc9de04-468c-40c8-9811-dbde4eb16729",
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
  "id": "0a3d9b62-4de2-4d8c-a1e6-a1d6749d9dc8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "881722e2-32fb-4289-afac-9654c9ec0b75",
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
  "created_at": "2026-11-01T06:37:31.106811Z",
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
    "id": "5663d236-4a45-47e6-b074-0b8c83a32ad3",
    "order_id": "0a3d9b62-4de2-4d8c-a1e6-a1d6749d9dc8",
    "expires_at": "2026-11-01T06:37:46.115246Z",
    "server_time": "2026-11-01T06:37:31.365337235Z",
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

`POST /api/driver/v1/offers/5663d236-4a45-47e6-b074-0b8c83a32ad3/accept` → **200**

```json
{
  "command_id": "0bfa331e-422d-4a39-9591-f39e33761ce0"
}
```

```json
{
  "id": "01d7d035-334e-4296-bbff-49a0211b7f8e",
  "order_id": "0a3d9b62-4de2-4d8c-a1e6-a1d6749d9dc8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1966395a-fb35-42b5-b4f1-97f508dbe092",
  "trip_phase": "TO_PICKUP"
}
```

The retry with the same command: HTTP 200.

One assignment, and the retry returned it.

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1966395a-fb35-42b5-b4f1-97f508dbe092",
  "order_id": "0a3d9b62-4de2-4d8c-a1e6-a1d6749d9dc8",
  "assignment_id": "01d7d035-334e-4296-bbff-49a0211b7f8e",
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

`POST /api/driver/v1/work-sessions/ad6bb413-a574-47c4-9d7d-92b9969a5dce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:38Z",
    "sequence": 1793515058734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad6bb413-a574-47c4-9d7d-92b9969a5dce",
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
  "last_heartbeat_at": "2026-11-01T06:37:38.795996Z",
  "last_location_at": "2026-11-01T06:37:38.795996Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1966395a-fb35-42b5-b4f1-97f508dbe092/arrive` → **200**

```json
{
  "command_id": "bd92da3e-6d58-40ea-b8fd-8b23f02339af",
  "expected_version": 0
}
```

```json
{
  "id": "1966395a-fb35-42b5-b4f1-97f508dbe092",
  "order_id": "0a3d9b62-4de2-4d8c-a1e6-a1d6749d9dc8",
  "assignment_id": "01d7d035-334e-4296-bbff-49a0211b7f8e",
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
  "arrived_at": "2026-11-01T06:37:39.029707Z",
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

`POST /api/driver/v1/trips/1966395a-fb35-42b5-b4f1-97f508dbe092/start` → **200**

```json
{
  "command_id": "9432a341-bf1e-4486-b768-3bb4fd0bb72b",
  "expected_version": 1
}
```

```json
{
  "id": "1966395a-fb35-42b5-b4f1-97f508dbe092",
  "order_id": "0a3d9b62-4de2-4d8c-a1e6-a1d6749d9dc8",
  "assignment_id": "01d7d035-334e-4296-bbff-49a0211b7f8e",
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
  "arrived_at": "2026-11-01T06:37:39.029707Z",
  "started_at": "2026-11-01T06:37:39.255363Z",
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
  "session_id": "ad6bb413-a574-47c4-9d7d-92b9969a5dce",
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
  "last_heartbeat_at": "2026-11-01T06:37:38.795996Z",
  "last_location_at": "2026-11-01T06:37:38.795996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad6bb413-a574-47c4-9d7d-92b9969a5dce/close` → **200**

```json
{
  "command_id": "721bea6e-97b4-493f-8d58-24c2cfd85dc6",
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
  "phone": "+380673848833",
  "device_ref": "sandbox-7220"
}
```

```json
{
  "challenge_id": "c9f0f18c-cc51-4106-8190-3345b056565e",
  "expires_at": "2026-11-01T06:42:49.659799833Z",
  "resend_available_at": "2026-11-01T06:37:50.659799833Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673848833` → **200**

```json
{
  "phone": "+380673848833",
  "audience": "CLIENT",
  "code": "797280",
  "sent_at": "2026-11-01T06:37:49.673475965Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9f0f18c-cc51-4106-8190-3345b056565e",
  "code": "797280",
  "device_ref": "sandbox-7220"
}
```

```json
{
  "session_id": "fd35a22f-0982-42a3-81d5-9a91e5e2bff2",
  "subject": {
    "type": "CLIENT",
    "id": "f201a743-7443-44e1-b1cf-0da8991b11dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjAxYTc0My03NDQzLTQ0ZTEtYjFjZi0wZGE4OTkxYjExZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzNTE1OTY5LCJpYXQiOjE3OTM1MTUwNjksImp0aSI6IjA5NTU0ZDNhLTI3ZjItNGJiYS04ZDUwLWFkNmJiMzE4ZGQ5OCIsInNpZCI6ImZkMzVhMjJmLTA5ODItNDJhMy04MWQ1LTlhOTFlNWUyYmZmMiJ9.YCH5rcg-GBC0q29oL1IT4k5wNxgbj9mLSGmZvjqsWMM",
  "access_expires_at": "2026-11-01T06:52:49.931206366Z",
  "refresh_token": "F523VK-ejywo5wemJ9JSWo2tTX-laq4jOQC1j4eKll0",
  "refresh_expires_at": "2026-12-01T06:37:49.929124701Z",
  "account_created": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24932"
}
```

```json
{
  "challenge_id": "e9549487-9ee7-4fd5-a34d-f46dcc622199",
  "expires_at": "2026-11-01T06:42:50.178573242Z",
  "resend_available_at": "2026-11-01T06:37:51.178573242Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "950846",
  "sent_at": "2026-11-01T06:37:50.185376165Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9549487-9ee7-4fd5-a34d-f46dcc622199",
  "code": "950846",
  "device_ref": "sandbox-24932"
}
```

```json
{
  "session_id": "7ae0e80f-9313-47f3-be36-63d07c627e67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzUxNTk3MCwiaWF0IjoxNzkzNTE1MDcwLCJqdGkiOiI4M2Q1ZTFmNS1hNTk3LTQ2NDgtYTU4YS05NjM2MDE1OGU3NjAiLCJzaWQiOiI3YWUwZTgwZi05MzEzLTQ3ZjMtYmUzNi02M2QwN2M2MjdlNjcifQ.1clyPWjvTwhrfagz3uGSroLlnMvX-6D2UhYFRtHjMko",
  "access_expires_at": "2026-11-01T06:52:50.41911095Z",
  "refresh_token": "CM5j9CSSCeTVcH0JU8-mfKKSwFuaE0fYq414aPJV3tw",
  "refresh_expires_at": "2026-12-01T06:37:50.418351847Z",
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
  "command_id": "14fb0eaf-2cb9-4d4a-a81c-8e948bdf1b1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:50Z",
    "sequence": 1793515070853
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "27f3cb27-c783-4e45-8f5d-33a589c0578a",
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
  "last_heartbeat_at": "2026-11-01T06:37:50.90788Z",
  "last_location_at": "2026-11-01T06:37:50.90788Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c606454-a6a2-443a-bc9b-92af73387a32",
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
  "id": "5963839f-1683-4e4b-8b9d-091c28e17ee9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-11-01T06:42:51.161786Z",
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
  "command_id": "2be8b2a9-bb15-4ef3-bfab-aa1eeaa30bda",
  "quote_id": "5963839f-1683-4e4b-8b9d-091c28e17ee9",
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
  "id": "13ee40b3-4e77-42d8-a47f-279cfa532ef1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f201a743-7443-44e1-b1cf-0da8991b11dd",
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
  "created_at": "2026-11-01T06:37:51.448069Z",
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
    "id": "793f93f3-641b-4c5d-b1df-1fd787ee0036",
    "order_id": "13ee40b3-4e77-42d8-a47f-279cfa532ef1",
    "expires_at": "2026-11-01T06:38:06.45618Z",
    "server_time": "2026-11-01T06:37:51.70674918Z",
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

`POST /api/driver/v1/offers/793f93f3-641b-4c5d-b1df-1fd787ee0036/accept` → **200**

```json
{
  "command_id": "24fcdd3c-9f56-4b11-a3d2-41d5b4773115"
}
```

```json
{
  "id": "299c9814-2ef3-47cf-8525-c1b4e233f772",
  "order_id": "13ee40b3-4e77-42d8-a47f-279cfa532ef1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eb2be8e5-a2ea-4743-8af6-fb946ee4bda0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eb2be8e5-a2ea-4743-8af6-fb946ee4bda0",
  "order_id": "13ee40b3-4e77-42d8-a47f-279cfa532ef1",
  "assignment_id": "299c9814-2ef3-47cf-8525-c1b4e233f772",
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

`POST /api/driver/v1/work-sessions/27f3cb27-c783-4e45-8f5d-33a589c0578a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-11-01T06:37:52Z",
    "sequence": 1793515072405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "27f3cb27-c783-4e45-8f5d-33a589c0578a",
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
  "last_heartbeat_at": "2026-11-01T06:37:52.460618Z",
  "last_location_at": "2026-11-01T06:37:52.460618Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/eb2be8e5-a2ea-4743-8af6-fb946ee4bda0/arrive` → **200**

```json
{
  "command_id": "76e110e7-2c84-4e0b-976f-17bd4cea928c",
  "expected_version": 0
}
```

```json
{
  "id": "eb2be8e5-a2ea-4743-8af6-fb946ee4bda0",
  "order_id": "13ee40b3-4e77-42d8-a47f-279cfa532ef1",
  "assignment_id": "299c9814-2ef3-47cf-8525-c1b4e233f772",
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
  "arrived_at": "2026-11-01T06:37:52.698428Z",
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

`POST /api/driver/v1/trips/eb2be8e5-a2ea-4743-8af6-fb946ee4bda0/start` → **200**

```json
{
  "command_id": "4eb6fd52-1332-425f-8705-98e29d323a3a",
  "expected_version": 1
}
```

```json
{
  "id": "eb2be8e5-a2ea-4743-8af6-fb946ee4bda0",
  "order_id": "13ee40b3-4e77-42d8-a47f-279cfa532ef1",
  "assignment_id": "299c9814-2ef3-47cf-8525-c1b4e233f772",
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
  "arrived_at": "2026-11-01T06:37:52.698428Z",
  "started_at": "2026-11-01T06:37:52.9323Z",
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

TripCompleted 81955711-17b3-4395-91c4-06d0430403ea: PENDING after the crash.

Server start 4.

Consumers of the crashed event: `backoffice.problem-queues finance.trip-fare-posting finance.wallet-order-settlement notification.order-live-feed notification.push-feed operator-bonuses payments.trip-capture promotions.driver-trips promotions.trip-rewards`.

Live messages of the crashed event: **2** (sent before the crash, not again after it).

**The live message went out 2 times.**
