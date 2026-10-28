# Sandbox transcript (2026-10-28T13:42:31Z, 44b9115)

# Scenario: bonuses

## The admin starts «Осінь −10 %» in Kyiv

`POST /auth/v1/staff/sign-in` → **401**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "instance": "/auth/v1/staff/sign-in",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "ca9ab2c3-b210-47b3-b112-9ceec0ff8e17"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ef9a0129-ab5a-4a5d-b5b9-9f0e2ed6d853",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4NTcsImlhdCI6MTc5MzE5NDk1NywianRpIjoiNzIwM2I3NmUtMDdhOS00ZGJjLTk1MmUtYjU1NmMwODhlYzFkIiwic2lkIjoiZWY5YTAxMjktYWI1YS00YTVkLWI1YjktOWYwZTJlZDZkODUzIn0.ITffKbEKgBMIqfY5eyuTepW9GeGHKVW7unqDpoaCc6M",
  "access_expires_at": "2026-10-28T13:57:37.567204439Z",
  "refresh_token": "_ivlZodguS6Cb4ErtwbqXYC6vldCAakx0kOchdwEVpA",
  "refresh_expires_at": "2026-10-29T01:42:37.565504719Z",
  "password_change_required": true
}
```

`POST /api/admin/v1/me/password` → **204**

```json
{
  "current_password": "Sandbox-Admin-2026",
  "new_password": "Sandbox-Admin-2026-ok"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "89dd12af-fcbf-4fde-a9e1-b85ac9f798ec",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4NTgsImlhdCI6MTc5MzE5NDk1OCwianRpIjoiZGUwOTVhYmMtMjg5Ny00OGQwLTg4OGQtYTI4YWMxNThlYWFhIiwic2lkIjoiODlkZDEyYWYtZmNiZi00ZmRlLWE5ZTEtYjg1YWM5Zjc5OGVjIn0.mDTBw-uvH0f79sutW7aewuJ1gu-2IddpyMO1U7Vs6WY",
  "access_expires_at": "2026-10-28T13:57:38.929718344Z",
  "refresh_token": "aR078cl8b3gMs0MyDEwwMFazJ-gvzMnG29VLVWUXiws",
  "refresh_expires_at": "2026-10-29T01:42:38.92891202Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "e3674265-c403-4172-a53d-815ffa0cd230",
  "reason": "Осіння акція",
  "promotion": {
    "name": "Осінь −10 %",
    "kind": "DISCOUNT",
    "value_type": "PERCENT",
    "value": 1000,
    "conditions": {
      "city_id": "5a000000-0000-4000-8000-000000000001"
    }
  }
}
```

```json
{
  "id": "c468e71a-a5c6-4513-85d9-4c4fc9378d00",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ACTIVE",
  "version": 1,
  "created_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "created_at": "2026-10-28T13:42:39.164628Z",
  "updated_at": "2026-10-28T13:42:39.164628Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638632534",
  "device_ref": "sandbox-30244"
}
```

```json
{
  "challenge_id": "b258775e-46c4-49a3-b193-33b93bd64010",
  "expires_at": "2026-10-28T13:47:39.415860208Z",
  "resend_available_at": "2026-10-28T13:42:40.415860208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638632534` → **200**

```json
{
  "phone": "+380638632534",
  "audience": "CLIENT",
  "code": "952996",
  "sent_at": "2026-10-28T13:42:39.422415709Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b258775e-46c4-49a3-b193-33b93bd64010",
  "code": "952996",
  "device_ref": "sandbox-30244"
}
```

```json
{
  "session_id": "0c0057ad-12c0-4bf9-b140-06f70cad2b38",
  "subject": {
    "type": "CLIENT",
    "id": "4c50fcce-6660-4897-a722-9901fff304f0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YzUwZmNjZS02NjYwLTQ4OTctYTcyMi05OTAxZmZmMzA0ZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1ODU5LCJpYXQiOjE3OTMxOTQ5NTksImp0aSI6IjYwM2Q3NjUyLWM3ZmYtNDVjMi05NjRlLWQ4NTk4YTM2ZjlmMyIsInNpZCI6IjBjMDA1N2FkLTEyYzAtNGJmOS1iMTQwLTA2ZjcwY2FkMmIzOCJ9.pZP0dHSsW1vtd3VgSVyGBpnx9_viHCiJ5Ibrfh6i-zw",
  "access_expires_at": "2026-10-28T13:57:39.678751603Z",
  "refresh_token": "ZlwMuNvws0qq9-2LlLjl52GUhbiTNOQqfi96-Q1B8Us",
  "refresh_expires_at": "2026-11-27T13:42:39.677919365Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638632534` → **200**

```json
{
  "client_id": "4c50fcce-6660-4897-a722-9901fff304f0"
}
```

`POST /api/admin/v1/rider-wallets/4c50fcce-6660-4897-a722-9901fff304f0/top-ups` → **201**

```json
{
  "command_id": "e5fce30a-a4b0-440b-bdae-026578b42730",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "4c50fcce-6660-4897-a722-9901fff304f0",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 0,
      "available_minor": 5000
    }
  ],
  "entries": [
    {
      "id": "df1a36d8-5e1d-46fa-8bae-aaf6741af88a",
      "at": "2026-10-28T13:42:40.118672Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "243257b5-f454-49fd-b71e-746604e923a5",
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
  "id": "6ac3dd5c-2d7b-4fe0-9f7e-c72921ddd434",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:47:40.412460Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 1052,
  "to_pay_minor": 9465,
  "promotions": [
    {
      "id": "c468e71a-a5c6-4513-85d9-4c4fc9378d00",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11198"
}
```

```json
{
  "challenge_id": "a22d13f3-ba4c-411b-b328-6cb34a4755fb",
  "expires_at": "2026-10-28T13:47:40.655790982Z",
  "resend_available_at": "2026-10-28T13:42:41.655790982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "864518",
  "sent_at": "2026-10-28T13:42:40.659343366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a22d13f3-ba4c-411b-b328-6cb34a4755fb",
  "code": "864518",
  "device_ref": "sandbox-11198"
}
```

```json
{
  "session_id": "c245125e-8808-40be-a3b2-b77cf42aae61",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTg2MCwiaWF0IjoxNzkzMTk0OTYwLCJqdGkiOiIwYWM2NTNmNi05NDY0LTQwYTQtOWU3My04NDUyMTY4MzNlY2EiLCJzaWQiOiJjMjQ1MTI1ZS04ODA4LTQwYmUtYTNiMi1iNzdjZjQyYWFlNjEifQ.n_LpUCdqs4xeEtY5uKfFzqTWcUB8akSSNoXhD3pgho4",
  "access_expires_at": "2026-10-28T13:57:40.898761205Z",
  "refresh_token": "g1qHe2nIle84Le8pOrzR9OeytGgwGMWH43-oM7Tth8M",
  "refresh_expires_at": "2026-11-27T13:42:40.897833503Z",
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
  "command_id": "9153cbda-d516-47f0-b77b-2cf2b44f7cc9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:42:41Z",
    "sequence": 1793194961324
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc968d40-1758-4837-b26a-8c7169846993",
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
  "last_heartbeat_at": "2026-10-28T13:42:41.361898Z",
  "last_location_at": "2026-10-28T13:42:41.361898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0575ccc3-1af2-480f-98c4-436ba6776c6a",
  "quote_id": "6ac3dd5c-2d7b-4fe0-9f7e-c72921ddd434",
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
  "payment_method": "CASH",
  "wallet_minor": 2000
}
```

```json
{
  "id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c50fcce-6660-4897-a722-9901fff304f0",
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
  "created_at": "2026-10-28T13:42:41.627144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "pickup_eta": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4c50fcce-6660-4897-a722-9901fff304f0",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 2000,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "df1a36d8-5e1d-46fa-8bae-aaf6741af88a",
      "at": "2026-10-28T13:42:40.118672Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_id": null
    }
  ]
}
```

## Ivan drives; he collects the price minus the discount and the bonuses

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "45d22f20-b591-4f12-8707-22a77ff23afd",
    "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
    "expires_at": "2026-10-28T13:42:56.637133Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/45d22f20-b591-4f12-8707-22a77ff23afd/accept` → **200**

```json
{
  "command_id": "340d59c6-ef14-4d1d-a1b1-fcc6436b8c17"
}
```

```json
{
  "id": "1418df1d-f5bc-416f-9d41-c5174bee7f37",
  "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aed61a22-a8bc-4dde-89cd-eeb4be7c53f5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aed61a22-a8bc-4dde-89cd-eeb4be7c53f5",
  "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
  "assignment_id": "1418df1d-f5bc-416f-9d41-c5174bee7f37",
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
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/bc968d40-1758-4837-b26a-8c7169846993/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:42:42Z",
    "sequence": 1793194962755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc968d40-1758-4837-b26a-8c7169846993",
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
  "last_heartbeat_at": "2026-10-28T13:42:42.775962Z",
  "last_location_at": "2026-10-28T13:42:42.775962Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/aed61a22-a8bc-4dde-89cd-eeb4be7c53f5/arrive` → **200**

```json
{
  "command_id": "b72ee534-9953-4f55-ae36-b11ff850ce81",
  "expected_version": 0
}
```

```json
{
  "id": "aed61a22-a8bc-4dde-89cd-eeb4be7c53f5",
  "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
  "assignment_id": "1418df1d-f5bc-416f-9d41-c5174bee7f37",
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
  "arrived_at": "2026-10-28T13:42:43.009327Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aed61a22-a8bc-4dde-89cd-eeb4be7c53f5/start` → **200**

```json
{
  "command_id": "1888e57b-6807-4a27-b13d-7a018b40fa7a",
  "expected_version": 1
}
```

```json
{
  "id": "aed61a22-a8bc-4dde-89cd-eeb4be7c53f5",
  "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
  "assignment_id": "1418df1d-f5bc-416f-9d41-c5174bee7f37",
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
  "arrived_at": "2026-10-28T13:42:43.009327Z",
  "started_at": "2026-10-28T13:42:43.232144Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/aed61a22-a8bc-4dde-89cd-eeb4be7c53f5/complete` → **200**

```json
{
  "command_id": "f773567e-ff8e-4d1f-b553-ff6a0be489dd",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:42:43Z",
  "cash_received": true
}
```

```json
{
  "id": "aed61a22-a8bc-4dde-89cd-eeb4be7c53f5",
  "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
  "assignment_id": "1418df1d-f5bc-416f-9d41-c5174bee7f37",
  "phase": "COMPLETED",
  "version": 3,
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
  "arrived_at": "2026-10-28T13:42:43.009327Z",
  "started_at": "2026-10-28T13:42:43.232144Z",
  "completed_at": "2026-10-28T13:42:43.477982Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4c50fcce-6660-4897-a722-9901fff304f0",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 3000,
      "reserved_minor": 0,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "689460b5-4788-49cc-b2a5-2c9d8e3eb0eb",
      "at": "2026-10-28T13:42:43.949722Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76"
    },
    {
      "id": "df1a36d8-5e1d-46fa-8bae-aaf6741af88a",
      "at": "2026-10-28T13:42:40.118672Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c468e71a-a5c6-4513-85d9-4c4fc9378d00/archive` → **200**

```json
{
  "command_id": "e36e4f45-c299-4099-ab19-ab9649a0c92b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c468e71a-a5c6-4513-85d9-4c4fc9378d00",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ARCHIVED",
  "version": 2,
  "created_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "created_at": "2026-10-28T13:42:39.164628Z",
  "updated_at": "2026-10-28T13:42:46.936297Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc968d40-1758-4837-b26a-8c7169846993",
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
  "last_heartbeat_at": "2026-10-28T13:42:42.775962Z",
  "last_location_at": "2026-10-28T13:42:42.775962Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc968d40-1758-4837-b26a-8c7169846993/close` → **200**

```json
{
  "command_id": "d7dfc9a6-e64f-44ed-ab4f-ccbeb097a1eb",
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

Done: order fc81bba0-95b4-4af5-9450-4e0d92520c76.

# Scenario: call-recording

## The admin says which city the service number belongs to

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d39bef92-16dd-4a50-8afd-79170fa12b70",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4NjcsImlhdCI6MTc5MzE5NDk2NywianRpIjoiMGQyYTY4NGEtZTFhMS00NmU0LTgxMjktZDBjZDlhOGQ1ZWZmIiwic2lkIjoiZDM5YmVmOTItMTZkZC00YTUwLThhZmQtNzkxNzBmYTEyYjcwIn0.Vs2lexp9AT-q2G9fna5c9sPMYOHnK-ZgtFFQcVOwOSQ",
  "access_expires_at": "2026-10-28T13:57:47.87793042Z",
  "refresh_token": "a5rWRvRl3zvrGOtOcSa5J3rwqOngjPYv5UY5i6HdDfw",
  "refresh_expires_at": "2026-10-29T01:42:47.877354273Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": []
}
```

`POST /api/admin/v1/call-lines/%2B380441110060` → **200**

```json
{
  "command_id": "5202ec71-946e-4335-8c35-3ac8351ba2b7",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox call-recording scenario"
}
```

```json
{
  "number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "aee4a7a8-4743-4b63-8283-61ba5c8030d6",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4NjgsImlhdCI6MTc5MzE5NDk2OCwianRpIjoiYzQ1Y2E4ZjEtZDM2Ni00ZWE1LTg2ZTQtYmExMWViMzkxZWNhIiwic2lkIjoiYWVlNGE3YTgtNDc0My00YjYzLTgyODMtNjFiYTVjODAzMGQ2In0.zq9rsO1zCWjzTvb-MWqEBwQTK2kNicDhBRRXfZhebik",
  "access_expires_at": "2026-10-28T13:57:48.774368691Z",
  "refresh_token": "gRJtcFmcCM0mSDjs0n9Z-effilmhkZJ696JpKPbl1QM",
  "refresh_expires_at": "2026-10-29T01:42:48.773739825Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2987612997",
    "linkedid": "1730052700.2987612997",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674449257"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052700.2987612997",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "584d6fd5-5a98-46d1-be33-a6d1ec05c3b7",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674449257",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:42:48.986279Z",
      "answered_at": null,
      "ended_at": "2026-10-28T13:42:49.0065Z",
      "recording": null
    }
  ]
}
```

## A call is taken and ends: its recording is fetched from Asterisk

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052600.171929823",
    "linkedid": "1730052600.171929823",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674449257"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5bf61521-9270-4e64-9335-cbf94113f15a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674449257",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:42:49.253308Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/5bf61521-9270-4e64-9335-cbf94113f15a/answer` → **200**

```json
{
  "command_id": "60fdebf0-4443-4a75-91eb-0eeaa9f467de"
}
```

```json
{
  "id": "5bf61521-9270-4e64-9335-cbf94113f15a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674449257",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "order_ids": [],
  "started_at": "2026-10-28T13:42:49.253308Z",
  "answered_at": "2026-10-28T13:42:49.496598Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.171929823",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052600.171929823",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5bf61521-9270-4e64-9335-cbf94113f15a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674449257",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [],
      "started_at": "2026-10-28T13:42:49.253308Z",
      "answered_at": "2026-10-28T13:42:49.496598Z",
      "ended_at": "2026-10-28T13:42:49.751231Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5bf61521-9270-4e64-9335-cbf94113f15a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674449257",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [],
      "started_at": "2026-10-28T13:42:49.253308Z",
      "answered_at": "2026-10-28T13:42:49.496598Z",
      "ended_at": "2026-10-28T13:42:49.751231Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:42:50.748887Z"
      }
    }
  ]
}
```

Recording: STORED

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5bf61521-9270-4e64-9335-cbf94113f15a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674449257",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [],
      "started_at": "2026-10-28T13:42:49.253308Z",
      "answered_at": "2026-10-28T13:42:49.496598Z",
      "ended_at": "2026-10-28T13:42:49.751231Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:42:50.748887Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/5bf61521-9270-4e64-9335-cbf94113f15a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/5bf61521-9270-4e64-9335-cbf94113f15a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=5bf61521-9270-4e64-9335-cbf94113f15a` → **200**

```json
{
  "changes": [
    {
      "id": "912a7ab4-7072-401c-b87d-e5cee78c1ac0",
      "occurred_at": "2026-10-28T13:42:52.455669Z",
      "actor_type": "STAFF",
      "actor_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5bf61521-9270-4e64-9335-cbf94113f15a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c2d983de-0445-4e7b-b647-48a667dc3211\", \"order_ids\": []}",
      "correlation_id": "22852036-9b7e-4997-b573-9e2535ba9831"
    },
    {
      "id": "4db019b0-6b25-4c3b-8e67-d7f4ba4bd6c5",
      "occurred_at": "2026-10-28T13:42:52.427272Z",
      "actor_type": "STAFF",
      "actor_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5bf61521-9270-4e64-9335-cbf94113f15a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c2d983de-0445-4e7b-b647-48a667dc3211\", \"order_ids\": []}",
      "correlation_id": "16722193-487a-40c8-93a8-e6d1bc7b2b0a"
    }
  ]
}
```

Done: call 5bf61521-9270-4e64-9335-cbf94113f15a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15023"
}
```

```json
{
  "challenge_id": "a519f354-b184-453a-a690-dc66bd47551d",
  "expires_at": "2026-10-28T13:47:52.713340575Z",
  "resend_available_at": "2026-10-28T13:42:53.713340575Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "875367",
  "sent_at": "2026-10-28T13:42:52.716208324Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a519f354-b184-453a-a690-dc66bd47551d",
  "code": "875367",
  "device_ref": "sandbox-15023"
}
```

```json
{
  "session_id": "18a44661-a631-440a-b45b-2432df61657d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTg3MiwiaWF0IjoxNzkzMTk0OTcyLCJqdGkiOiJlMTliMWVkNy02ZDgzLTRiMmUtYTRlYS1kZTE3MWM0NzE0NWEiLCJzaWQiOiIxOGE0NDY2MS1hNjMxLTQ0MGEtYjQ1Yi0yNDMyZGY2MTY1N2QifQ.StfB32gAP49IlUbg6eb4bL9J27wlz7SLswsTZBT-kgY",
  "access_expires_at": "2026-10-28T13:57:52.945810254Z",
  "refresh_token": "YMkpzMWsBYo2yqFtL8rrAx361TpgRKPW96h5SW__smc",
  "refresh_expires_at": "2026-11-27T13:42:52.94525614Z",
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
  "command_id": "7efd7531-8713-480d-b2b3-b7324e935c67",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:42:53Z",
    "sequence": 1793194973355
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fc16cd2-1719-4b81-a442-fedf57cf62d0",
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
  "last_heartbeat_at": "2026-10-28T13:42:53.372598Z",
  "last_location_at": "2026-10-28T13:42:53.372598Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator takes a phone order for a caller without the app

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3dde4574-dca6-42cf-b174-50d614ed95d9",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4NzMsImlhdCI6MTc5MzE5NDk3MywianRpIjoiYThiOGU0OGUtYmI5NC00NTEwLWE3YTQtOGNhMzRjMzFmMjdmIiwic2lkIjoiM2RkZTQ1NzQtZGNhNi00MmNmLWIxNzQtNTBkNjE0ZWQ5NWQ5In0.3xEhlslASs5cOSiA7vfUuj22yPXd_lD3PfKR28Pmyss",
  "access_expires_at": "2026-10-28T13:57:53.844463676Z",
  "refresh_token": "tM8tRV8Pg7WIXiVlA0scRFIt5sQuCxi66Msrdrfi_bk",
  "refresh_expires_at": "2026-10-29T01:42:53.843841114Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "13c6d64e-dcdd-433f-a6e6-95149eb8ef6d",
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
  "id": "340f3764-28d9-4885-afff-68e4a5f84682",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:47:54.069738Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "3ab17f64-81ff-421f-8c98-a371e60bcbea",
  "quote_id": "340f3764-28d9-4885-afff-68e4a5f84682",
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
  "payment_method": "CASH",
  "caller": {
    "name": "Олена",
    "phone": "+380679343389"
  }
}
```

```json
{
  "id": "f03b279b-76da-424e-b679-3f123cd551c2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "created_at": "2026-10-28T13:42:54.306535Z",
  "caller": {
    "name": "Олена",
    "phone": "+380679343389"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Ivan accepts: the caller gets the car and the plate by SMS

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4bdccb50-d09a-47f8-a1b8-bef8428c20b8",
    "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
    "expires_at": "2026-10-28T13:43:09.310763Z",
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
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/4bdccb50-d09a-47f8-a1b8-bef8428c20b8/accept` → **200**

```json
{
  "command_id": "879d6b49-bdc6-4e42-ab7f-c9b1880a567c"
}
```

```json
{
  "id": "59c5dd14-2595-4586-84c0-d67f655670b0",
  "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0316f9b8-bde2-4d32-8ae0-f638d12b7eef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[
  {
    "phone": "+380679343389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:55.912750722Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[
  {
    "phone": "+380679343389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:55.912750722Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[
  {
    "phone": "+380679343389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:55.912750722Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0316f9b8-bde2-4d32-8ae0-f638d12b7eef",
  "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
  "assignment_id": "59c5dd14-2595-4586-84c0-d67f655670b0",
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
  "recipient": {
    "name": "Олена",
    "phone": "+380679343389"
  }
}
```

`POST /api/driver/v1/work-sessions/8fc16cd2-1719-4b81-a442-fedf57cf62d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:42:56Z",
    "sequence": 1793194976468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fc16cd2-1719-4b81-a442-fedf57cf62d0",
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
  "last_heartbeat_at": "2026-10-28T13:42:56.486076Z",
  "last_location_at": "2026-10-28T13:42:56.486076Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0316f9b8-bde2-4d32-8ae0-f638d12b7eef/arrive` → **200**

```json
{
  "command_id": "e34c99da-f3de-49fa-b54b-ef3ed25bc613",
  "expected_version": 0
}
```

```json
{
  "id": "0316f9b8-bde2-4d32-8ae0-f638d12b7eef",
  "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
  "assignment_id": "59c5dd14-2595-4586-84c0-d67f655670b0",
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
  "arrived_at": "2026-10-28T13:42:56.703181Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679343389"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[
  {
    "phone": "+380679343389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:55.912750722Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[
  {
    "phone": "+380679343389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:55.912750722Z"
  },
  {
    "phone": "+380679343389",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:57.918500836Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[
  {
    "phone": "+380679343389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:55.912750722Z"
  },
  {
    "phone": "+380679343389",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:57.918500836Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679343389` → **200**

```json
[
  {
    "phone": "+380679343389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:55.912750722Z"
  },
  {
    "phone": "+380679343389",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:42:57.918500836Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/0316f9b8-bde2-4d32-8ae0-f638d12b7eef/start` → **200**

```json
{
  "command_id": "c332b0fd-3bb3-423b-9d9d-2d72fb43b44d",
  "expected_version": 1
}
```

```json
{
  "id": "0316f9b8-bde2-4d32-8ae0-f638d12b7eef",
  "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
  "assignment_id": "59c5dd14-2595-4586-84c0-d67f655670b0",
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
  "arrived_at": "2026-10-28T13:42:56.703181Z",
  "started_at": "2026-10-28T13:42:58.00406Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679343389"
  }
}
```

`POST /api/driver/v1/trips/0316f9b8-bde2-4d32-8ae0-f638d12b7eef/complete` → **200**

```json
{
  "command_id": "707b242b-29fa-4041-ac54-67b2b3ca2e3b",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:42:58Z",
  "cash_received": true
}
```

```json
{
  "id": "0316f9b8-bde2-4d32-8ae0-f638d12b7eef",
  "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
  "assignment_id": "59c5dd14-2595-4586-84c0-d67f655670b0",
  "phase": "COMPLETED",
  "version": 3,
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
  "arrived_at": "2026-10-28T13:42:56.703181Z",
  "started_at": "2026-10-28T13:42:58.00406Z",
  "completed_at": "2026-10-28T13:42:58.231026Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: two SMS to the caller of a phone order.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8fc16cd2-1719-4b81-a442-fedf57cf62d0",
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
  "last_heartbeat_at": "2026-10-28T13:42:56.486076Z",
  "last_location_at": "2026-10-28T13:42:56.486076Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8fc16cd2-1719-4b81-a442-fedf57cf62d0/close` → **200**

```json
{
  "command_id": "2633b422-bac5-4163-b39b-6967144eef30",
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

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637640190",
  "device_ref": "sandbox-9534"
}
```

```json
{
  "challenge_id": "75fba441-5576-46ba-b134-fbf684acff10",
  "expires_at": "2026-10-28T13:47:58.890530924Z",
  "resend_available_at": "2026-10-28T13:42:59.890530924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637640190` → **200**

```json
{
  "phone": "+380637640190",
  "audience": "CLIENT",
  "code": "214396",
  "sent_at": "2026-10-28T13:42:58.907748861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75fba441-5576-46ba-b134-fbf684acff10",
  "code": "214396",
  "device_ref": "sandbox-9534"
}
```

```json
{
  "session_id": "b952c3fc-52a8-4b0a-965d-2c8f64c1e712",
  "subject": {
    "type": "CLIENT",
    "id": "d2460ab6-9b89-4b2d-8fb3-57b738a53408"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjQ2MGFiNi05Yjg5LTRiMmQtOGZiMy01N2I3MzhhNTM0MDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1ODc5LCJpYXQiOjE3OTMxOTQ5NzksImp0aSI6IjhjMzZmNzUwLWNmNGItNGNkYi04OGI0LTRmMWQ4ZDk1YTNmYSIsInNpZCI6ImI5NTJjM2ZjLTUyYTgtNGIwYS05NjVkLTJjOGY2NGMxZTcxMiJ9.dTB031Ra2UN0rCFhV44H8iRXZUfwpWkSgVezS-fonBA",
  "access_expires_at": "2026-10-28T13:57:59.136103972Z",
  "refresh_token": "6SQWg-Sz0O0AnRnW79iqq_ELnnEynPwJKqTL8-r6QCY",
  "refresh_expires_at": "2026-11-27T13:42:59.135605301Z",
  "account_created": true
}
```

`GET /api/rider/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "CHANGED_MIND",
      "labels": {
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом"
      },
      "driver_outcome": null
    }
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-18253"
}
```

```json
{
  "challenge_id": "dfffca45-fad0-446b-96d9-c1b023efbc69",
  "expires_at": "2026-10-28T13:47:59.555189975Z",
  "resend_available_at": "2026-10-28T13:43:00.555189975Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "657661",
  "sent_at": "2026-10-28T13:42:59.557742036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfffca45-fad0-446b-96d9-c1b023efbc69",
  "code": "657661",
  "device_ref": "sandbox-18253"
}
```

```json
{
  "session_id": "a5159961-0e04-4f99-a5b6-5381f84b8557",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTg3OSwiaWF0IjoxNzkzMTk0OTc5LCJqdGkiOiI5NTU1NDRmMi0xOWI0LTRhYzAtYjNlZC1jN2Q0NmFlMzA1ODAiLCJzaWQiOiJhNTE1OTk2MS0wZTA0LTRmOTktYTViNi01MzgxZjg0Yjg1NTcifQ.xT6L_NXxefcEYnwDEVVIfrYQICGj-0Cvwbm0jJfai_A",
  "access_expires_at": "2026-10-28T13:57:59.791592914Z",
  "refresh_token": "p4crvM9e-PqiP1Srnu1sEP4UCMvkp3RUIyc8QfEC_Ps",
  "refresh_expires_at": "2026-11-27T13:42:59.791008044Z",
  "account_created": false
}
```

`GET /api/driver/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "NO_SHOW",
      "labels": {
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    }
  ]
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "226c4694-9d31-447e-b292-361a6f53014a",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4ODAsImlhdCI6MTc5MzE5NDk4MCwianRpIjoiYjllZTUwZGQtOWVlNy00YzQ5LWE5N2EtZjlmMmJmZmFjYmE0Iiwic2lkIjoiMjI2YzQ2OTQtOWQzMS00NDdlLWIyOTItMzYxYTZmNTMwMTRhIn0.hHaC3igYsyrmG_YgLot4hEMAGIzk3SG8_r_E7FDsG4E",
  "access_expires_at": "2026-10-28T13:58:00.472320027Z",
  "refresh_token": "KU4U2K4nrtZeHfkvGIjvHzKIrdVyRCtpU-oZX4DGanE",
  "refresh_expires_at": "2026-10-29T01:43:00.471726519Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d8307f5d-84c9-4ba4-b2ac-f31bf7e4273b",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4ODAsImlhdCI6MTc5MzE5NDk4MCwianRpIjoiYjQ0MDZmM2MtOGY2NC00ZTU4LWJhYzEtMjk4MTM4MGM4ODA2Iiwic2lkIjoiZDgzMDdmNWQtODRjOS00YmE0LWIyYWMtZjMxYmY3ZTQyNzNiIn0.yy8Rrv4_KaD7i9TNbkbzvfOo_yv69UV3xOQ8xS8j5y0",
  "access_expires_at": "2026-10-28T13:58:00.935391544Z",
  "refresh_token": "z-dCpGUjc5uRjEnm8C2P4g5WZn-PvEojOXV8xL4qXms",
  "refresh_expires_at": "2026-10-29T01:43:00.934976349Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/cancel-reasons` → **200**

```json
{
  "reasons": [
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
        "uk": "ДТП"
      },
      "driver_outcome": null
    }
  ]
}
```

## The rider orders and cancels: «Долго ждать машину»

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cf2bcf59-2238-4d47-aeea-37a0723d2971",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "d41c3a7a-c42d-4740-8e99-ada2151ceb0b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:01.356542Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "099cf73f-780e-40a8-88a7-4b8b745f298b",
  "quote_id": "d41c3a7a-c42d-4740-8e99-ada2151ceb0b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "9d620cb6-ad98-46e8-a8e7-068597d9d4dd",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2460ab6-9b89-4b2d-8fb3-57b738a53408",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:43:01.581588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9d620cb6-ad98-46e8-a8e7-068597d9d4dd` → **200**

```json
{
  "id": "9d620cb6-ad98-46e8-a8e7-068597d9d4dd",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2460ab6-9b89-4b2d-8fb3-57b738a53408",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:43:01.581588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9d620cb6-ad98-46e8-a8e7-068597d9d4dd/cancel` → **200**

```json
{
  "command_id": "0cf1cd6e-f24d-4577-8256-116d2624fb03",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9d620cb6-ad98-46e8-a8e7-068597d9d4dd",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d2460ab6-9b89-4b2d-8fb3-57b738a53408",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T13:43:01.581588Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
      "uk": "Довго чекати авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Two drivers online; the order goes to the nearest one

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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
  "command_id": "9b997a4a-9f90-4f4e-be7e-8b34dc2157bb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:43:02Z",
    "sequence": 1793194982477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4af5a8e5-9da2-4cec-a410-b6c4e5564713",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:43:02.494028Z",
  "last_location_at": "2026-10-28T13:43:02.494028Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8071"
}
```

```json
{
  "challenge_id": "3e1274ce-9dff-4764-b023-ee8c66cc5f89",
  "expires_at": "2026-10-28T13:48:02.717889032Z",
  "resend_available_at": "2026-10-28T13:43:03.717889032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "585280",
  "sent_at": "2026-10-28T13:43:02.720603728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e1274ce-9dff-4764-b023-ee8c66cc5f89",
  "code": "585280",
  "device_ref": "sandbox-8071"
}
```

```json
{
  "session_id": "bc9e0bdc-7b9b-4d82-b1bd-e64c8ddd9aac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTg4MiwiaWF0IjoxNzkzMTk0OTgyLCJqdGkiOiJlNWQ3ODJjMi1kMjA2LTRhOTYtOTU0OS0yZDdkYmQ5YzExMzEiLCJzaWQiOiJiYzllMGJkYy03YjliLTRkODItYjFiZC1lNjRjOGRkZDlhYWMifQ.qUl5x2v-MTXzIy7VNw4tNq_MQ-BVcNPJ12215L79QT0",
  "access_expires_at": "2026-10-28T13:58:02.949496724Z",
  "refresh_token": "2v4CZBLcPyVkYYsVNuraFV5mSZi-CFNQTsvplKbLCrA",
  "refresh_expires_at": "2026-11-27T13:43:02.949000918Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "160f5f1d-38ac-403c-a571-73c36cc08150",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:43:03Z",
    "sequence": 1793194983369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e994f000-cc5f-45f2-acfc-5f5d02f9696d",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:43:03.385937Z",
  "last_location_at": "2026-10-28T13:43:03.385937Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08ca6c19-969c-4615-a5e7-bebf4d388438",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "49fd89f4-bd20-48fc-bafd-db85058c43a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:03.605459Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e1a37df0-d056-462c-abf3-f22e8e20fe44",
  "quote_id": "49fd89f4-bd20-48fc-bafd-db85058c43a9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2460ab6-9b89-4b2d-8fb3-57b738a53408",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:43:03.832091Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "69060330-b753-4678-960c-119460d13c9b",
    "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
    "expires_at": "2026-10-28T13:43:18.835095Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4547,
      "lon": 30.5238
    },
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "payment_method": "CASH",
    "price_minor": 30533,
    "currency": "UAH",
    "distance_m": 478
  }
]
```

`POST /api/driver/v1/offers/69060330-b753-4678-960c-119460d13c9b/accept` → **200**

```json
{
  "command_id": "37328a2a-e459-463a-92e5-34af9ac1fc52"
}
```

```json
{
  "id": "d17e159b-e402-430e-adba-dc8290fe2002",
  "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b0cf2f4d-8a4a-4a26-b78b-f1ade0f3c801",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b0cf2f4d-8a4a-4a26-b78b-f1ade0f3c801",
  "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "assignment_id": "d17e159b-e402-430e-adba-dc8290fe2002",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b0cf2f4d-8a4a-4a26-b78b-f1ade0f3c801/cancel` → **200**

```json
{
  "command_id": "4d18f206-1854-41d9-9d1c-86dc11dc094b",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "b0cf2f4d-8a4a-4a26-b78b-f1ade0f3c801",
  "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "assignment_id": "d17e159b-e402-430e-adba-dc8290fe2002",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/3ffbd429-3579-401a-99a2-eeb5bddfdba1` → **200**

```json
{
  "id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d2460ab6-9b89-4b2d-8fb3-57b738a53408",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": {
    "id": "d17e159b-e402-430e-adba-dc8290fe2002",
    "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b0cf2f4d-8a4a-4a26-b78b-f1ade0f3c801",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:43:03.832091Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "948531a9-c735-456f-98e8-274905105638",
    "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
    "expires_at": "2026-10-28T13:43:19.718325Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4547,
      "lon": 30.5238
    },
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "payment_method": "CASH",
    "price_minor": 30533,
    "currency": "UAH",
    "distance_m": 1146
  }
]
```

`POST /api/driver/v1/offers/948531a9-c735-456f-98e8-274905105638/accept` → **200**

```json
{
  "command_id": "0ac0e551-bec2-49a4-b66c-c870bd36d26b"
}
```

```json
{
  "id": "efae215e-8d27-4922-bc3c-59d7546a9f97",
  "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "80585909-d977-49cb-b16b-cdf7d348be2f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "80585909-d977-49cb-b16b-cdf7d348be2f",
  "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "assignment_id": "efae215e-8d27-4922-bc3c-59d7546a9f97",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/80585909-d977-49cb-b16b-cdf7d348be2f/cancel` → **200**

```json
{
  "command_id": "eee66704-5f71-41a5-90bc-d7f36f6ce487",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "80585909-d977-49cb-b16b-cdf7d348be2f",
  "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
  "assignment_id": "efae215e-8d27-4922-bc3c-59d7546a9f97",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "price_minor": 30533,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:43:03.832091Z",
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "vehicle_class": "STANDARD",
    "price_minor": 30533,
    "final_price_minor": null,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": {
      "name": "Андрій Шевчук",
      "vehicle": {
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "registration_number": "AA0003TX"
      }
    },
    "chat_available": true,
    "cancellation": {
      "by": "DRIVER",
      "reason_code": "PASSENGER_ASKED",
      "reason_labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "9d620cb6-ad98-46e8-a8e7-068597d9d4dd",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:43:01.581588Z",
    "pickup_label": "Хрещатик, 22",
    "dropoff_label": "Позняки",
    "vehicle_class": "STANDARD",
    "price_minor": 30533,
    "final_price_minor": null,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": null,
    "chat_available": false,
    "cancellation": {
      "by": "RIDER",
      "reason_code": "WAIT_TOO_LONG",
      "reason_labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/3ffbd429-3579-401a-99a2-eeb5bddfdba1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:43:03.832747Z",
      "actor": {
        "type": "CLIENT",
        "id": "d2460ab6-9b89-4b2d-8fb3-57b738a53408",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
        "quote_id": "49fd89f4-bd20-48fc-bafd-db85058c43a9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "e1b5ef37-ed86-4cee-87fb-15df560ed7f5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:43:03.834275Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
        "attempt_id": "2f8fd05e-c8a8-415e-99b0-a7ad3c4cb082",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e1b5ef37-ed86-4cee-87fb-15df560ed7f5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:43:03.840309Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "69060330-b753-4678-960c-119460d13c9b",
        "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "e1b5ef37-ed86-4cee-87fb-15df560ed7f5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:43:04.281842Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "69060330-b753-4678-960c-119460d13c9b",
        "order_id": "3ffbd429-3579-401a-99a2-eeb5bddfdba1",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d17e159b-e402-430e-adba-dc8290fe2002"
      },
      "correlation_id": "19dd463c-0cb4-4437-b6e1-9e1c273bac69"
```

Done: orders 9d620cb6-ad98-46e8-a8e7-068597d9d4dd, 3ffbd429-3579-401a-99a2-eeb5bddfdba1.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730655576",
  "device_ref": "sandbox-21620"
}
```

```json
{
  "challenge_id": "ccd8744d-8487-49ac-a6e4-0e3a33a38c31",
  "expires_at": "2026-10-28T13:48:06.476628393Z",
  "resend_available_at": "2026-10-28T13:43:07.476628393Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730655576` → **200**

```json
{
  "phone": "+380730655576",
  "audience": "CLIENT",
  "code": "530613",
  "sent_at": "2026-10-28T13:43:06.47926389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccd8744d-8487-49ac-a6e4-0e3a33a38c31",
  "code": "530613",
  "device_ref": "sandbox-21620"
}
```

```json
{
  "session_id": "51aa897c-24dd-47b7-b5ab-2b0a8f1e5994",
  "subject": {
    "type": "CLIENT",
    "id": "34c15eae-524c-42d1-a877-15d18045c815"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGMxNWVhZS01MjRjLTQyZDEtYTg3Ny0xNWQxODA0NWM4MTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1ODg2LCJpYXQiOjE3OTMxOTQ5ODYsImp0aSI6IjJlZDhmODJkLTIwNGMtNDJmZi05NGNhLTI1YWI4NTdkNjQ2NiIsInNpZCI6IjUxYWE4OTdjLTI0ZGQtNDdiNy1iNWFiLTJiMGE4ZjFlNTk5NCJ9.za-kuavUfHcvh5Vva7Uor_UGDaHNoEmUJ1U2NdeEGIU",
  "access_expires_at": "2026-10-28T13:58:06.723402694Z",
  "refresh_token": "D4B5n0sbiL1rTRA259TphaCz1yovb7vP5Ts-tvC4AE4",
  "refresh_expires_at": "2026-11-27T13:43:06.72295823Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2ec496f1-818c-42eb-8008-2a03a7916a4c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b23b6119-7f66-4fe1-8166-301c96975230",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b23b6119-7f66-4fe1-8166-301c96975230",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "196a3b366d46dc3c742640b165cc8a2c",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b23b6119-7f66-4fe1-8166-301c96975230",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730655576"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b23b6119-7f66-4fe1-8166-301c96975230",
  "expires_at": "2026-10-28T14:13:06.937833Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b23b6119-7f66-4fe1-8166-301c96975230` → **200**

```json
{
  "id": "b23b6119-7f66-4fe1-8166-301c96975230",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:13:06.937833Z",
  "card": {
    "id": "f5736778-0573-4dac-80c5-6617cfb2be74",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3673",
    "card_type": "Visa",
    "created_at": "2026-10-28T13:43:07.160283Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "f5736778-0573-4dac-80c5-6617cfb2be74",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3673",
      "card_type": "Visa",
      "created_at": "2026-10-28T13:43:07.160283Z"
    }
  ]
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16410"
}
```

```json
{
  "challenge_id": "edf09627-6c90-465d-8c95-192545b943a8",
  "expires_at": "2026-10-28T13:48:07.608918324Z",
  "resend_available_at": "2026-10-28T13:43:08.608918324Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "410619",
  "sent_at": "2026-10-28T13:43:07.611455232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edf09627-6c90-465d-8c95-192545b943a8",
  "code": "410619",
  "device_ref": "sandbox-16410"
}
```

```json
{
  "session_id": "636f97b9-1ecd-41d1-b93e-7c2e3c50345b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTg4NywiaWF0IjoxNzkzMTk0OTg3LCJqdGkiOiJiNTNjYWY2Mi01NjczLTRiYmQtYWM5ZS03NGJhNGVkNjMyMzciLCJzaWQiOiI2MzZmOTdiOS0xZWNkLTQxZDEtYjkzZS03YzJlM2M1MDM0NWIifQ.YropULYT8BffgK8T89a0Ife9ddEJ_a29pWjtnbDquYo",
  "access_expires_at": "2026-10-28T13:58:07.858109884Z",
  "refresh_token": "-7EamC-LXmBlXIY_li1DoAF7hVl0XB7UW0M3Vi5DB7I",
  "refresh_expires_at": "2026-11-27T13:43:07.857634568Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e994f000-cc5f-45f2-acfc-5f5d02f9696d",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:43:03.385937Z",
  "last_location_at": "2026-10-28T13:43:03.385937Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e994f000-cc5f-45f2-acfc-5f5d02f9696d/handover` → **200**

```json
{
  "command_id": "ef0632df-0ffa-485d-90b4-642d22afe15a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e994f000-cc5f-45f2-acfc-5f5d02f9696d",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:43:03.385937Z",
  "last_location_at": "2026-10-28T13:43:03.385937Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e994f000-cc5f-45f2-acfc-5f5d02f9696d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:43:08Z",
    "sequence": 1793194988490
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e994f000-cc5f-45f2-acfc-5f5d02f9696d",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:43:08.506863Z",
  "last_location_at": "2026-10-28T13:43:08.506863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "94465e37-ba2e-46f1-94fc-a8c2cefc2667",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  }
}
```

```json
{
  "id": "483942ec-853e-4262-becf-d2d9b16c94fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:08.724257Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "233800ac-394d-45f6-9faa-f48eb4377fab",
  "quote_id": "483942ec-853e-4262-becf-d2d9b16c94fb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "wallet_minor": 0
}
```

```json
{
  "id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-28T13:43:08.950584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/de418c19-3459-4658-ac6b-877aa1b414e8` → **200**

```json
{
  "id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTH_PENDING",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-28T13:43:08.950584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/de418c19-3459-4658-ac6b-877aa1b414e8` → **200**

```json
{
  "id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "AUTHORIZED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:43:08.950584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b387bc01-c526-41b5-915e-4bd3036d1b4a",
    "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
    "expires_at": "2026-10-28T13:43:24.242868Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CARD",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 478
  }
]
```

`POST /api/driver/v1/offers/b387bc01-c526-41b5-915e-4bd3036d1b4a/accept` → **200**

```json
{
  "command_id": "d3e8e148-56b5-4f52-bff6-e884ac2dccc6"
}
```

```json
{
  "id": "34d4ea3e-cf94-481e-be76-2996b6f05c98",
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "858d6280-7dc3-4140-a435-f8a44caa53dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "858d6280-7dc3-4140-a435-f8a44caa53dc",
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "assignment_id": "34d4ea3e-cf94-481e-be76-2996b6f05c98",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e994f000-cc5f-45f2-acfc-5f5d02f9696d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:43:11Z",
    "sequence": 1793194991258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e994f000-cc5f-45f2-acfc-5f5d02f9696d",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:43:11.275985Z",
  "last_location_at": "2026-10-28T13:43:11.275985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/858d6280-7dc3-4140-a435-f8a44caa53dc/arrive` → **200**

```json
{
  "command_id": "3431dd30-7a0d-4142-8bb3-93b734921cd4",
  "expected_version": 0
}
```

```json
{
  "id": "858d6280-7dc3-4140-a435-f8a44caa53dc",
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "assignment_id": "34d4ea3e-cf94-481e-be76-2996b6f05c98",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:43:11.491887Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/858d6280-7dc3-4140-a435-f8a44caa53dc/start` → **200**

```json
{
  "command_id": "1b180583-5617-4f83-8e32-c47be95fb787",
  "expected_version": 1
}
```

```json
{
  "id": "858d6280-7dc3-4140-a435-f8a44caa53dc",
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "assignment_id": "34d4ea3e-cf94-481e-be76-2996b6f05c98",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:43:11.491887Z",
  "started_at": "2026-10-28T13:43:11.71451Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/858d6280-7dc3-4140-a435-f8a44caa53dc/complete` → **200**

```json
{
  "command_id": "c89c7a1b-de92-4735-abaa-22728be6707b",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:43:11Z",
  "cash_received": true
}
```

```json
{
  "id": "858d6280-7dc3-4140-a435-f8a44caa53dc",
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "assignment_id": "34d4ea3e-cf94-481e-be76-2996b6f05c98",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:43:11.491887Z",
  "started_at": "2026-10-28T13:43:11.71451Z",
  "completed_at": "2026-10-28T13:43:11.93847Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/de418c19-3459-4658-ac6b-877aa1b414e8` → **200**

```json
{
  "id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "CAPTURE_PENDING",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "34d4ea3e-cf94-481e-be76-2996b6f05c98",
    "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "858d6280-7dc3-4140-a435-f8a44caa53dc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:43:08.950584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/de418c19-3459-4658-ac6b-877aa1b414e8` → **200**

```json
{
  "id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "payment_state": "PAID",
  "price_minor": 16297,
  "final_price_minor": 16297,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "34d4ea3e-cf94-481e-be76-2996b6f05c98",
    "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "858d6280-7dc3-4140-a435-f8a44caa53dc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:43:08.950584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852
    }
  ],
  "entries": [
    {
      "id": "9eb3d0ae-04a5-4a21-92ea-4d4776b3e08e",
      "at": "2026-10-28T13:43:12.286161Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/de418c19-3459-4658-ac6b-877aa1b414e8/tip` → **200**

```json
{
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-29T13:43:11.93847Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/de418c19-3459-4658-ac6b-877aa1b414e8/tip` → **201**

```json
{
  "command_id": "59486c57-30b5-4efd-8453-c17101e851e9",
  "amount_minor": 2500
}
```

```json
{
  "id": "fb5146f3-d069-4d01-904a-e0009de54d35",
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:43:14.264293Z"
}
```

`GET /api/rider/v1/orders/de418c19-3459-4658-ac6b-877aa1b414e8/tip` → **200**

```json
{
  "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-29T13:43:11.93847Z",
  "open": false,
  "tip": {
    "id": "fb5146f3-d069-4d01-904a-e0009de54d35",
    "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:43:14.264293Z"
  }
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852
    }
  ],
  "entries": [
    {
      "id": "9eb3d0ae-04a5-4a21-92ea-4d4776b3e08e",
      "at": "2026-10-28T13:43:12.286161Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "0459a9b1-1fc8-4ec9-9d1c-ddf801e795ee",
      "at": "2026-10-28T13:43:15.349276Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    },
    {
      "id": "9eb3d0ae-04a5-4a21-92ea-4d4776b3e08e",
      "at": "2026-10-28T13:43:12.286161Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b18f5b45-c31d-493e-aaaa-4f188df3beec",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  }
}
```

```json
{
  "id": "5785650c-67e8-49f5-9ae8-ff168424be56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:16.151513Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

## Bonuses cover the fare; 300 minor units remain for a larger card tip

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "48538e98-2c19-47b0-864b-5873cd9bc9b6",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU4OTYsImlhdCI6MTc5MzE5NDk5NiwianRpIjoiODJmOWFlY2QtNDYzZC00M2E0LWI5NzEtZWQzMjA3YTg1MDUyIiwic2lkIjoiNDg1MzhlOTgtMmMxOS00N2IwLTg2NGItNTg3M2NkOWJjOWI2In0.US-UMF5sdQUIamgrwyH4C1K1GvcAKKGG9nnaypmtIpw",
  "access_expires_at": "2026-10-28T13:58:16.642030614Z",
  "refresh_token": "6k8HE3MRf-NHJarcYZi3Y_PTXHZ5DelcmcL6UoDT9eg",
  "refresh_expires_at": "2026-10-29T01:43:16.641584373Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380730655576` → **200**

```json
{
  "client_id": "34c15eae-524c-42d1-a877-15d18045c815"
}
```

`POST /api/admin/v1/rider-wallets/34c15eae-524c-42d1-a877-15d18045c815/top-ups` → **201**

```json
{
  "command_id": "548db42f-f5c0-4ca4-be01-a5ca0cc6597d",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 0,
      "available_minor": 16597
    }
  ],
  "entries": [
    {
      "id": "12222bd8-31f4-4282-a05b-89efcc2bd123",
      "at": "2026-10-28T13:43:17.058159Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ea9115dc-66a2-4ec9-a86e-93f030baa544",
  "quote_id": "5785650c-67e8-49f5-9ae8-ff168424be56",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.4970
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.4300
  },
  "dropoff_label": "Нивки",
  "payment_method": "CARD",
  "wallet_minor": 16297
}
```

```json
{
  "id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:43:17.285463Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c98f9397-b6cb-4cad-b377-06af5828504c` → **200**

```json
{
  "id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:43:17.285463Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "893f836d-2e56-4925-ad1f-2c81ec0c789b",
    "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
    "expires_at": "2026-10-28T13:43:32.289307Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CASH",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 11
  }
]
```

`POST /api/driver/v1/offers/893f836d-2e56-4925-ad1f-2c81ec0c789b/accept` → **200**

```json
{
  "command_id": "be6b4d12-d8f2-4dbd-8b16-7b5f44626a6b"
}
```

```json
{
  "id": "3d790b0a-62a6-4c73-8a4b-53a827b43ea8",
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb0ba281-6cac-491c-a5b4-380fc1251ce5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb0ba281-6cac-491c-a5b4-380fc1251ce5",
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "assignment_id": "3d790b0a-62a6-4c73-8a4b-53a827b43ea8",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e994f000-cc5f-45f2-acfc-5f5d02f9696d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:43:18Z",
    "sequence": 1793194998375
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e994f000-cc5f-45f2-acfc-5f5d02f9696d",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:43:18.392059Z",
  "last_location_at": "2026-10-28T13:43:18.392059Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fb0ba281-6cac-491c-a5b4-380fc1251ce5/arrive` → **200**

```json
{
  "command_id": "2a498b85-0580-4a8e-9e18-2963dfed6851",
  "expected_version": 0
}
```

```json
{
  "id": "fb0ba281-6cac-491c-a5b4-380fc1251ce5",
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "assignment_id": "3d790b0a-62a6-4c73-8a4b-53a827b43ea8",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:43:18.60458Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fb0ba281-6cac-491c-a5b4-380fc1251ce5/start` → **200**

```json
{
  "command_id": "f7e8837b-29f2-4e77-88e9-89818d8d97a3",
  "expected_version": 1
}
```

```json
{
  "id": "fb0ba281-6cac-491c-a5b4-380fc1251ce5",
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "assignment_id": "3d790b0a-62a6-4c73-8a4b-53a827b43ea8",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:43:18.60458Z",
  "started_at": "2026-10-28T13:43:18.828202Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fb0ba281-6cac-491c-a5b4-380fc1251ce5/complete` → **200**

```json
{
  "command_id": "d14d2ee3-be71-4dc4-8113-d358e15af5b6",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:43:19Z",
  "cash_received": true
}
```

```json
{
  "id": "fb0ba281-6cac-491c-a5b4-380fc1251ce5",
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "assignment_id": "3d790b0a-62a6-4c73-8a4b-53a827b43ea8",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4437,
    "lon": 30.497
  },
  "pickup_label": "вул. Дмитрівська",
  "dropoff": {
    "lat": 50.4584,
    "lon": 30.43
  },
  "dropoff_label": "Нивки",
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:43:18.60458Z",
  "started_at": "2026-10-28T13:43:18.828202Z",
  "completed_at": "2026-10-28T13:43:19.055339Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "34c15eae-524c-42d1-a877-15d18045c815",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 16297,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "12222bd8-31f4-4282-a05b-89efcc2bd123",
      "at": "2026-10-28T13:43:17.058159Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 30204,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "e12792ff-813f-4f09-ac0d-474cd56af609",
      "at": "2026-10-28T13:43:19.383783Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
      "counterpart_id": null
    },
    {
      "id": "0459a9b1-1fc8-4ec9-9d1c-ddf801e795ee",
      "at": "2026-10-28T13:43:15.349276Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    },
    {
      "id": "9eb3d0ae-04a5-4a21-92ea-4d4776b3e08e",
      "at": "2026-10-28T13:43:12.286161Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/c98f9397-b6cb-4cad-b377-06af5828504c/tip` → **200**

```json
{
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-29T13:43:19.055339Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c98f9397-b6cb-4cad-b377-06af5828504c/tip` → **201**

```json
{
  "command_id": "8e54e606-9610-4a18-a5db-c6de1ef79431",
  "amount_minor": 2500
}
```

```json
{
  "id": "729fcda1-d416-4722-ac65-68e4f4b4bea5",
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:43:20.123785Z"
}
```

`GET /api/rider/v1/orders/c98f9397-b6cb-4cad-b377-06af5828504c/tip` → **200**

```json
{
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-29T13:43:19.055339Z",
  "open": false,
  "tip": {
    "id": "729fcda1-d416-4722-ac65-68e4f4b4bea5",
    "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T13:43:20.123785Z"
  }
}
```

`GET /api/rider/v1/orders/c98f9397-b6cb-4cad-b377-06af5828504c/tip` → **200**

```json
{
  "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "WALLET",
  "available_until": "2026-10-29T13:43:19.055339Z",
  "open": false,
  "tip": {
    "id": "729fcda1-d416-4722-ac65-68e4f4b4bea5",
    "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:43:20.123785Z"
  }
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "feeceb64-9cc8-4ed6-9483-a7b324206be1",
      "at": "2026-10-28T13:43:21.430706Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
      "counterpart_id": null
    },
    {
      "id": "e12792ff-813f-4f09-ac0d-474cd56af609",
      "at": "2026-10-28T13:43:19.383783Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c98f9397-b6cb-4cad-b377-06af5828504c",
      "counterpart_id": null
    },
    {
      "id": "0459a9b1-1fc8-4ec9-9d1c-ddf801e795ee",
      "at": "2026-10-28T13:43:15.349276Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    },
    {
      "id": "9eb3d0ae-04a5-4a21-92ea-4d4776b3e08e",
      "at": "2026-10-28T13:43:12.286161Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "de418c19-3459-4658-ac6b-877aa1b414e8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e994f000-cc5f-45f2-acfc-5f5d02f9696d",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:43:18.392059Z",
  "last_location_at": "2026-10-28T13:43:18.392059Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e994f000-cc5f-45f2-acfc-5f5d02f9696d/close` → **200**

```json
{
  "command_id": "4af1623e-39a6-4da6-9c38-b3e8dd78838d",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

Done: card order c98f9397-b6cb-4cad-b377-06af5828504c.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731513247",
  "device_ref": "sandbox-11495"
}
```

```json
{
  "challenge_id": "443bf277-d40c-4e49-86a0-d2dee25c1b65",
  "expires_at": "2026-10-28T13:48:22.628540377Z",
  "resend_available_at": "2026-10-28T13:43:23.628540377Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731513247` → **200**

```json
{
  "phone": "+380731513247",
  "audience": "CLIENT",
  "code": "048020",
  "sent_at": "2026-10-28T13:43:22.630999762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "443bf277-d40c-4e49-86a0-d2dee25c1b65",
  "code": "048020",
  "device_ref": "sandbox-11495"
}
```

```json
{
  "session_id": "a40491f7-a759-4b8c-8f35-97661b350607",
  "subject": {
    "type": "CLIENT",
    "id": "79b65964-c8a4-4b37-919d-63016ca501ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OWI2NTk2NC1jOGE0LTRiMzctOTE5ZC02MzAxNmNhNTAxY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTAyLCJpYXQiOjE3OTMxOTUwMDIsImp0aSI6IjNkOTg4YWRlLWQ2ZjEtNDkwZi1iODk4LThmYWNlN2IzNGFhNyIsInNpZCI6ImE0MDQ5MWY3LWE3NTktNGI4Yy04ZjM1LTk3NjYxYjM1MDYwNyJ9.hPftuN06GoW1PAz-2sSrLp8DMvI5g8G7eoU0wau0T8Q",
  "access_expires_at": "2026-10-28T13:58:22.874205761Z",
  "refresh_token": "PAGp4QH5N11MLRcWcwVDdpsCZqT2ZdAM8dYPH_27SyA",
  "refresh_expires_at": "2026-11-27T13:43:22.873705207Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "4e7f2369-58f1-4efd-a0a2-fa62bb4e229c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "fcd6d875-c267-4ce8-ba5a-53bee86c9a97",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-fcd6d875-c267-4ce8-ba5a-53bee86c9a97",
    "orderDate": "1793195003",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "78793a4de207ddc48b772b5ef3f3d748",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=fcd6d875-c267-4ce8-ba5a-53bee86c9a97",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731513247"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=fcd6d875-c267-4ce8-ba5a-53bee86c9a97",
  "created_at": "2026-10-28T13:43:23.092992Z",
  "expires_at": "2026-10-28T14:13:23.092992Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/fcd6d875-c267-4ce8-ba5a-53bee86c9a97` → **200**

```json
{
  "id": "fcd6d875-c267-4ce8-ba5a-53bee86c9a97",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:43:23.092992Z",
  "expires_at": "2026-10-28T14:13:23.092992Z",
  "completed_at": "2026-10-28T13:43:23.312147Z",
  "masked_pan": "41****3500",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "79b65964-c8a4-4b37-919d-63016ca501ca",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "431f5742-4cf7-4ba5-98a3-0a637c0897dc",
      "at": "2026-10-28T13:43:23.441711Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "79b65964-c8a4-4b37-919d-63016ca501ca",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "431f5742-4cf7-4ba5-98a3-0a637c0897dc",
      "at": "2026-10-28T13:43:23.441711Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

## The driver tops up the balance by 500.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13945"
}
```

```json
{
  "challenge_id": "48425e8e-8b02-4475-b9d5-1c526451a83c",
  "expires_at": "2026-10-28T13:48:23.958810695Z",
  "resend_available_at": "2026-10-28T13:43:24.958810695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "804247",
  "sent_at": "2026-10-28T13:43:23.961218678Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48425e8e-8b02-4475-b9d5-1c526451a83c",
  "code": "804247",
  "device_ref": "sandbox-13945"
}
```

```json
{
  "session_id": "5d609599-2a52-4f03-95f0-b6bd6b6c65e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTkwNCwiaWF0IjoxNzkzMTk1MDA0LCJqdGkiOiJmY2JkMjRkNi0zYzFmLTRjOTktODk3My0zYTNhMDE0YjU2NjQiLCJzaWQiOiI1ZDYwOTU5OS0yYTUyLTRmMDMtOTVmMC1iNmJkNmI2YzY1ZTQifQ.37qAHEuDvRleQTN7khOrHZgGJrkzihOmCMo75DNZIgM",
  "access_expires_at": "2026-10-28T13:58:24.190407875Z",
  "refresh_token": "ctWF_YsWCCyT6iCu2o3yDLgucB3IIY-JRe7yWFox_pI",
  "refresh_expires_at": "2026-11-27T13:43:24.189931472Z",
  "account_created": false
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
}
```

`POST /api/driver/v1/balance/card-top-ups` → **201**

```json
{
  "command_id": "dfcc075a-eefe-4c3d-9864-7ab70fb025e4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b44a16c9-d9e9-4757-b71e-14caa4700a3b",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b44a16c9-d9e9-4757-b71e-14caa4700a3b",
    "orderDate": "1793195004",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "3932995cda16822e9e7286230e67b369",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b44a16c9-d9e9-4757-b71e-14caa4700a3b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b44a16c9-d9e9-4757-b71e-14caa4700a3b",
  "created_at": "2026-10-28T13:43:24.604684Z",
  "expires_at": "2026-10-28T14:13:24.604684Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b44a16c9-d9e9-4757-b71e-14caa4700a3b` → **200**

```json
{
  "id": "b44a16c9-d9e9-4757-b71e-14caa4700a3b",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:43:24.604684Z",
  "expires_at": "2026-10-28T14:13:24.604684Z",
  "completed_at": "2026-10-28T13:43:24.819724Z",
  "masked_pan": "41****4711",
  "failure_reason": null
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 50000
    }
  ],
  "entries": [
    {
      "id": "a8699b72-bf8e-49aa-bd5e-efcfe7f9dbb3",
      "at": "2026-10-28T13:43:25.463548Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 50000,
      "reason": "Top-up by card",
      "order_id": null,
      "counterpart_id": null
    }
  ]
}
```

## A rider's token does not open the driver's path

`POST /api/driver/v1/balance/card-top-ups` → **401**

```json
{
  "command_id": "b2ed2b98-ffd9-4598-9adb-2b53bff6922b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "instance": "/api/driver/v1/balance/card-top-ups",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "cdee9f24-7107-4c1b-8d52-8a6ed52da6ec"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: city-operations

## Staff open Warsaw's operations (version 0 until the first change: around the clock, every method)

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b8030a8b-6617-42be-af9a-956ac1c3dcde",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MDYsImlhdCI6MTc5MzE5NTAwNiwianRpIjoiNzdmYzM4NjQtYzk3My00NmQyLWJmNjUtMGQwY2U0ZDk1MzUxIiwic2lkIjoiYjgwMzBhOGItNjYxNy00MmJlLWFmOWEtOTU2YWMxYzNkY2RlIn0.3k6HPucJydZARzXI7kGSLBtuK-gYU8DMbXrJ2KkPHwg",
  "access_expires_at": "2026-10-28T13:58:26.962050251Z",
  "refresh_token": "uv8nDoSaQ5ZmLMEgik9lkLw3k_89QUIRx512u9WWppA",
  "refresh_expires_at": "2026-10-29T01:43:26.96163093Z",
  "password_change_required": false
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 0,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600481413",
  "device_ref": "sandbox-11578"
}
```

```json
{
  "challenge_id": "26cd4bb8-9b7c-46ab-af3b-139ab3d80fe1",
  "expires_at": "2026-10-28T13:48:27.601840378Z",
  "resend_available_at": "2026-10-28T13:43:28.601840378Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600481413` → **200**

```json
{
  "phone": "+48600481413",
  "audience": "CLIENT",
  "code": "517981",
  "sent_at": "2026-10-28T13:43:27.603909397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26cd4bb8-9b7c-46ab-af3b-139ab3d80fe1",
  "code": "517981",
  "device_ref": "sandbox-11578"
}
```

```json
{
  "session_id": "54d82036-b0dd-4211-9709-c9592e41ceee",
  "subject": {
    "type": "CLIENT",
    "id": "311af49c-4bb9-452a-9918-f2ddc9c84c60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTFhZjQ5Yy00YmI5LTQ1MmEtOTkxOC1mMmRkYzljODRjNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTA3LCJpYXQiOjE3OTMxOTUwMDcsImp0aSI6IjliNzdlYTViLTNiM2QtNDk3Zi1iMGRhLTU3MzFkZDlhYjE3OSIsInNpZCI6IjU0ZDgyMDM2LWIwZGQtNDIxMS05NzA5LWM5NTkyZTQxY2VlZSJ9.vE57xEDKEWFc7LkS4DeyOpo79Nf8YvH3jVjTrSQswOk",
  "access_expires_at": "2026-10-28T13:58:27.832414313Z",
  "refresh_token": "sBmYCMGIXdTJuWbbNH4rv8a-G5O432CilqmxYn79j6I",
  "refresh_expires_at": "2026-11-27T13:43:27.831964501Z",
  "account_created": true
}
```

## Staff pause new orders: a reason is required

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **400**

```json
{
  "command_id": "0d54c2e5-2ab6-4ffd-bf99-314fa4cfbb8d",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "da74e91c-1071-4c7b-bb6c-e02856d1e73e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **200**

```json
{
  "command_id": "6cc1fce3-b597-4423-8458-692c1692c838",
  "expected_version": 0,
  "reason": "Storm warning"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T13:43:28.707995663Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 0,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": true
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d7c600f-e7e4-482f-a66d-4efb3c602022",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "05657646-9d6b-4416-b9b8-edcbe1bda3af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:29.148427Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "99534759-657d-4583-bd29-cf5bb9b75ff8",
  "quote_id": "05657646-9d6b-4416-b9b8-edcbe1bda3af",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City paused",
  "type": "https://errors.blizz.taxi/city-paused",
  "code": "CITY_PAUSED",
  "correlation_id": "3bff1112-44ac-4432-85dc-feb7830cb21f"
}
```

## Staff lift the pause

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T13:43:28.707996Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "d4db6ec6-ebdf-4db8-8dff-c429a47d3362",
  "expected_version": 1,
  "reason": "Storm over"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

## Warsaw offers only cards for now: a cash order is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "e3f4188e-2b7f-4878-a2b6-912ec5a45c40",
  "expected_version": 2,
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "reason": "Cash collection paused"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bfb1971e-cda4-4e4f-87f4-63133888b4c0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "9ca28982-da9f-4075-8059-39fc808cace4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:30.438889Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "fdd69a11-7beb-4151-8efe-5f5888eadbce",
  "quote_id": "9ca28982-da9f-4075-8059-39fc808cace4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "a8926fbb-2ddb-4375-b391-73a31ed9f837"
}
```

## Working hours that do not include now: an order for now is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "ba4977fd-0390-43b6-808a-af1292e3bc16",
  "expected_version": 3,
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "16:00",
      "to": "17:00"
    }
  ],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "One hour a day"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "16:00",
      "to": "17:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "06eea62f-e986-4722-b94f-d097b2644456",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "576f9fa2-5d74-4ed7-95a3-248f8942c60f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:31.297886Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "8c4875b0-71f4-4b73-934e-346da8d1abd8",
  "quote_id": "576f9fa2-5d74-4ed7-95a3-248f8942c60f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City closed",
  "type": "https://errors.blizz.taxi/city-closed",
  "code": "CITY_CLOSED",
  "correlation_id": "6564b095-b51c-462b-9a08-80daa7caf5f7"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5b48452d-c0c1-4ac5-bc61-02d70ffba500",
  "expected_version": 0,
  "reason": "stale"
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "ab4d0982-a9ce-4c37-81dd-b914fdacaa17"
}
```

Done: paused and resumed, a method not offered and closed hours refused orders; Warsaw is restored on exit.

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "16:00",
      "to": "17:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "7f1372e4-d0df-4134-84e5-ddb18ca080b6",
  "expected_version": 4,
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "Sandbox clean-up"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 5
}
```

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673574775",
  "device_ref": "sandbox-6839"
}
```

```json
{
  "challenge_id": "128be1d3-a921-43db-b750-06ab5f530b41",
  "expires_at": "2026-10-28T13:48:32.405942224Z",
  "resend_available_at": "2026-10-28T13:43:33.405942224Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673574775` → **200**

```json
{
  "phone": "+380673574775",
  "audience": "CLIENT",
  "code": "806492",
  "sent_at": "2026-10-28T13:43:32.408261582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "128be1d3-a921-43db-b750-06ab5f530b41",
  "code": "806492",
  "device_ref": "sandbox-6839"
}
```

```json
{
  "session_id": "cdb3e48b-01e1-46d7-a4f9-4e004bbd7f5c",
  "subject": {
    "type": "CLIENT",
    "id": "3a00fa8e-0214-4562-8f7a-c73308148f0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTAwZmE4ZS0wMjE0LTQ1NjItOGY3YS1jNzMzMDgxNDhmMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTEyLCJpYXQiOjE3OTMxOTUwMTIsImp0aSI6ImFlNTQyZWVjLWM4YzUtNGNmYy1iY2E3LTViZTZmMzBhZGU2MyIsInNpZCI6ImNkYjNlNDhiLTAxZTEtNDZkNy1hNGY5LTRlMDA0YmJkN2Y1YyJ9.KHyQrDu1loASINboScE996BDIzSfYaeIIO82uag1Dlg",
  "access_expires_at": "2026-10-28T13:58:32.640099588Z",
  "refresh_token": "AtDL5odzWZfcfkJuaGSaaZUwWtRDXezmP9a-h47baZA",
  "refresh_expires_at": "2026-11-27T13:43:32.639711729Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3a00fa8e-0214-4562-8f7a-c73308148f0b",
  "session_id": "cdb3e48b-01e1-46d7-a4f9-4e004bbd7f5c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d0dd3f39-e58d-4141-80f2-c1263e1a9af4",
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
  "id": "e351ce7b-cd6e-4823-bd57-f973315a0ced",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:33.068997Z",
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

## Step one: a code to confirm the deletion (a sign-in code would not do)

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "1aeaf6b0-cf69-4197-a38b-3f47b8188b06",
  "expires_at": "2026-10-28T13:48:35.29096817Z",
  "resend_available_at": "2026-10-28T13:43:36.29096817Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673574775` → **200**

```json
{
  "phone": "+380673574775",
  "audience": "CLIENT",
  "code": "201887",
  "sent_at": "2026-10-28T13:43:35.29272299Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "d7ded1b1-4508-4b32-be03-44239363b535",
  "challenge_id": "1aeaf6b0-cf69-4197-a38b-3f47b8188b06",
  "otp_code": "201887"
}
```

```json
{
  "client_id": "3a00fa8e-0214-4562-8f7a-c73308148f0b",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T13:43:35.530402811Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0ec2a3d6-61fd-4940-9f88-2de91ce6af84",
  "quote_id": "e351ce7b-cd6e-4823-bd57-f973315a0ced",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Account not active",
  "type": "https://errors.blizz.taxi/account-not-active",
  "code": "ACCOUNT_NOT_ACTIVE",
  "correlation_id": "439e0dfe-30f3-469c-967e-1d5a527f57e4"
}
```

## Staff see the request with nothing blocking it and complete it

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "c3a154bd-965c-4f0c-bd0f-dc123982008c",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MTYsImlhdCI6MTc5MzE5NTAxNiwianRpIjoiZTI4NmUwNTQtZjlkNi00MWM5LWFlYTgtMmFjMjAwOWYyZGEwIiwic2lkIjoiYzNhMTU0YmQtOTY1Yy00ZjBjLWJkMGYtZGMxMjM5ODIwMDhjIn0.24C0DlsE3crvp8fNbqFyJUlmL-MpNNk_181Nc3Hu_Z0",
  "access_expires_at": "2026-10-28T13:58:36.218408992Z",
  "refresh_token": "NRqE9NzVxBHfYBmQQIrMZzF33RMpaC3UIliEJjB70ig",
  "refresh_expires_at": "2026-10-29T01:43:36.218001729Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "3a00fa8e-0214-4562-8f7a-c73308148f0b",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T13:43:35.530403Z",
      "blockers": {
        "active_order_id": null,
        "debt": [],
        "open_support_cases": 0,
        "bonuses_to_burn": [],
        "blocked": false
      }
    }
  ]
}
```

`POST /api/admin/v1/client-deletions/3a00fa8e-0214-4562-8f7a-c73308148f0b/complete` → **200**

```json
{
  "command_id": "bc4c1e45-826a-4dbc-8f13-cec6c979306b",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "3a00fa8e-0214-4562-8f7a-c73308148f0b",
  "account_state": "ANONYMIZED"
}
```

## The old token no longer works

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "2a49586d-1627-4ba4-81bf-62b7b669757f"
}
```

Done: client 3a00fa8e-0214-4562-8f7a-c73308148f0b anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664989867",
  "device_ref": "sandbox-23968"
}
```

```json
{
  "challenge_id": "b6dde284-606c-49eb-a2f8-1afe7e1561e2",
  "expires_at": "2026-10-28T13:48:37.094476093Z",
  "resend_available_at": "2026-10-28T13:43:38.094476093Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664989867` → **200**

```json
{
  "phone": "+380664989867",
  "audience": "CLIENT",
  "code": "092218",
  "sent_at": "2026-10-28T13:43:37.103612547Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6dde284-606c-49eb-a2f8-1afe7e1561e2",
  "code": "092218",
  "device_ref": "sandbox-23968"
}
```

```json
{
  "session_id": "fa3dd132-8b1d-44d5-9c72-7d5c253a507e",
  "subject": {
    "type": "CLIENT",
    "id": "872ce71c-e6d6-4b05-be2e-cb513b694fff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzJjZTcxYy1lNmQ2LTRiMDUtYmUyZS1jYjUxM2I2OTRmZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTE3LCJpYXQiOjE3OTMxOTUwMTcsImp0aSI6IjIxNWJmMjUyLWI3YWMtNDk1Yy05OTVhLWQ5MjA1MDgzN2RhMCIsInNpZCI6ImZhM2RkMTMyLThiMWQtNDRkNS05YzcyLTdkNWMyNTNhNTA3ZSJ9.9ze3pFyBQg975Hvd_TrUOKmi-t4EJ4NqPMwGGayMdeA",
  "access_expires_at": "2026-10-28T13:58:37.344916825Z",
  "refresh_token": "r5Vt-Nq3dTzmRrA28y1_61iS3oNOyFI0YcYXxf82adY",
  "refresh_expires_at": "2026-11-27T13:43:37.344475581Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "872ce71c-e6d6-4b05-be2e-cb513b694fff",
  "session_id": "fa3dd132-8b1d-44d5-9c72-7d5c253a507e",
  "account_state": "ACTIVE"
}
```

## Staff find the rider by the last 7 digits of the phone and open the card

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "073ce157-9b7b-4533-8cfa-90f430f0149b",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MTgsImlhdCI6MTc5MzE5NTAxOCwianRpIjoiYmRhNDdmNTEtYTUwZC00YmNkLTg2NDUtNzY3MzhhNTQ0ZDQ5Iiwic2lkIjoiMDczY2UxNTctOWI3Yi00NTMzLThjZmEtOTBmNDMwZjAxNDliIn0.hdJC5PPftuwWA11OJd1tw1JVzUSxmjZcDrqduMKkKDY",
  "access_expires_at": "2026-10-28T13:58:38.021098273Z",
  "refresh_token": "6Fl8IWyf3bVcwlDcYEo5laNcibkUGbxrUFRlxcRgxqI",
  "refresh_expires_at": "2026-10-29T01:43:38.020488225Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4989867&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "872ce71c-e6d6-4b05-be2e-cb513b694fff",
      "phone": "+380664989867",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T13:43:37.342898Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/872ce71c-e6d6-4b05-be2e-cb513b694fff` → **200**

```json
{
  "client": {
    "id": "872ce71c-e6d6-4b05-be2e-cb513b694fff",
    "phone": "+380664989867",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:43:37.342898Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

## A block needs a reason

`POST /api/admin/v1/clients/872ce71c-e6d6-4b05-be2e-cb513b694fff/block` → **400**

```json
{
  "command_id": "2dbc3f59-0d6d-4650-806c-21d73d1f23d0",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/872ce71c-e6d6-4b05-be2e-cb513b694fff/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1085e901-060d-4f49-8cb3-d44a44f5126e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/872ce71c-e6d6-4b05-be2e-cb513b694fff/block` → **200**

```json
{
  "command_id": "46cbaae0-8fd0-4a04-8975-39d6287402de",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "872ce71c-e6d6-4b05-be2e-cb513b694fff",
  "phone": "+380664989867",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T13:43:37.342898Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T13:43:38.922134Z",
    "by": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "deletion_requested_at": null
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "b6b08e9c-22e4-4f41-b11c-c3deb771b4f3"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664989867",
  "device_ref": "sandbox-136"
}
```

```json
{
  "challenge_id": "b5c7c3d5-88ed-49bf-98e1-8a606c3846b5",
  "expires_at": "2026-10-28T13:48:41.349926958Z",
  "resend_available_at": "2026-10-28T13:43:42.349926958Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664989867` → **200**

```json
{
  "phone": "+380664989867",
  "audience": "CLIENT",
  "code": "318568",
  "sent_at": "2026-10-28T13:43:41.351731859Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "b5c7c3d5-88ed-49bf-98e1-8a606c3846b5",
  "code": "318568",
  "device_ref": "sandbox-136"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "dad8f209-5661-445b-b9dd-58d79ea922bf"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/872ce71c-e6d6-4b05-be2e-cb513b694fff` → **200**

```json
{
  "client": {
    "id": "872ce71c-e6d6-4b05-be2e-cb513b694fff",
    "phone": "+380664989867",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T13:43:37.342898Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T13:43:38.922134Z",
      "by": "54476750-8d4c-4def-bcc5-b00c809a62c0"
    },
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/clients/872ce71c-e6d6-4b05-be2e-cb513b694fff/unblock` → **200**

```json
{
  "command_id": "cba54fff-fd21-4ccf-8366-7a34c5a12506",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "872ce71c-e6d6-4b05-be2e-cb513b694fff",
  "phone": "+380664989867",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T13:43:37.342898Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664989867",
  "device_ref": "sandbox-8879"
}
```

```json
{
  "challenge_id": "de5d41ea-d277-4bb1-a140-4427379acedc",
  "expires_at": "2026-10-28T13:48:44.267886026Z",
  "resend_available_at": "2026-10-28T13:43:45.267886026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664989867` → **200**

```json
{
  "phone": "+380664989867",
  "audience": "CLIENT",
  "code": "157092",
  "sent_at": "2026-10-28T13:43:44.269606461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de5d41ea-d277-4bb1-a140-4427379acedc",
  "code": "157092",
  "device_ref": "sandbox-8879"
}
```

```json
{
  "session_id": "79fd8f1f-c280-4b72-b08e-86cb58ab14f2",
  "subject": {
    "type": "CLIENT",
    "id": "872ce71c-e6d6-4b05-be2e-cb513b694fff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzJjZTcxYy1lNmQ2LTRiMDUtYmUyZS1jYjUxM2I2OTRmZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTI0LCJpYXQiOjE3OTMxOTUwMjQsImp0aSI6IjlkOWZhOTkzLTAyNGMtNDBmNC1hNjViLWYzYmQ5YWU5YzdiMyIsInNpZCI6Ijc5ZmQ4ZjFmLWMyODAtNGI3Mi1iMDhlLTg2Y2I1OGFiMTRmMiJ9.9BykFqyg8olA7N_xPNlCAWZEA-8lYxFUYltK2T-D8O4",
  "access_expires_at": "2026-10-28T13:58:44.503166677Z",
  "refresh_token": "E2bFskyFafq4Ssii_y0JtPOKwiOA9Go-HfqfYWCCQdc",
  "refresh_expires_at": "2026-11-27T13:43:44.502771483Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "872ce71c-e6d6-4b05-be2e-cb513b694fff",
  "session_id": "79fd8f1f-c280-4b72-b08e-86cb58ab14f2",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

# Scenario: correlation-search

## A rider orders; the app sends its own correlation id with the request

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663527119",
  "device_ref": "sandbox-26395"
}
```

```json
{
  "challenge_id": "b5346517-0dbc-4389-b3f5-6531da688847",
  "expires_at": "2026-10-28T13:48:44.931780469Z",
  "resend_available_at": "2026-10-28T13:43:45.931780469Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663527119` → **200**

```json
{
  "phone": "+380663527119",
  "audience": "CLIENT",
  "code": "009358",
  "sent_at": "2026-10-28T13:43:44.933549457Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5346517-0dbc-4389-b3f5-6531da688847",
  "code": "009358",
  "device_ref": "sandbox-26395"
}
```

```json
{
  "session_id": "514670e0-eee4-4994-838c-da8f2880f55b",
  "subject": {
    "type": "CLIENT",
    "id": "8e2f8088-fbec-4839-a8bb-a67c766365f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTJmODA4OC1mYmVjLTQ4MzktYThiYi1hNjdjNzY2MzY1ZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTI1LCJpYXQiOjE3OTMxOTUwMjUsImp0aSI6ImExNzFkOTliLTExMjMtNGVhMS1iMDRmLTQ5OTNmZDc4NzIyMiIsInNpZCI6IjUxNDY3MGUwLWVlZTQtNDk5NC04MzhjLWRhOGYyODgwZjU1YiJ9.Wc1OA4GVF5ag2HJsh2PBJCOUg-p8SzX4Ob_j0sQpzdM",
  "access_expires_at": "2026-10-28T13:58:45.164472335Z",
  "refresh_token": "UoCF4VjR1-l66XhEgwQHi-oWL2Yy34F-Uc6F7O0Dauo",
  "refresh_expires_at": "2026-11-27T13:43:45.163990266Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a1fb0c02-082c-48fe-8498-528e669d12eb",
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
  "id": "c1d62c8e-e3e5-4787-8b23-72e066e4f8d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:45.379893Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 90694d7c-e2f0-453e-a965-582c8af16281) → **201**

## The operator sees the id on the order's history

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "f0072e4d-ac56-4ce9-8742-f29c9628f856",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MjUsImlhdCI6MTc5MzE5NTAyNSwianRpIjoiNDY4N2YxMmUtNGE4Yy00NGE0LTkwZTYtODdhNjJlMmE2ZGM0Iiwic2lkIjoiZjAwNzJlNGQtYWM1Ni00Y2U5LTg3NDItZjI5Yzk2MjhmODU2In0.dezZLVR1RxndzEv1sl7Rcs-tRw3pKtAHdLg9yTXsVDk",
  "access_expires_at": "2026-10-28T13:58:45.892679249Z",
  "refresh_token": "MA5tKB9OH2GF98K4X5z9yjlQ-i0vCg8OQQY7AWfsKLY",
  "refresh_expires_at": "2026-10-29T01:43:45.892263885Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "a35395c8-f69e-4bdf-a6c3-62800d4f602b",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MjYsImlhdCI6MTc5MzE5NTAyNiwianRpIjoiYjE4MGQ3OWItNDNmYS00ZGUzLWIzOWMtMjgzOGQ0ZWIyZTRlIiwic2lkIjoiYTM1Mzk1YzgtZjY5ZS00YmRmLWE2YzMtNjI4MDBkNGY2MDJiIn0.U-uyH8MEsVWNh8oepF3W3ykGzr2McYYZnhKQGBd4MN4",
  "access_expires_at": "2026-10-28T13:58:46.3617325Z",
  "refresh_token": "8DZgsmRgBLeIYya3gNkENSZvlTfYjkVCEtJTPEIeyWc",
  "refresh_expires_at": "2026-10-29T01:43:46.361240293Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bfed5249-4753-4b55-abc8-53fac1e4b01e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:43:45.604961Z",
      "actor": {
        "type": "CLIENT",
        "id": "8e2f8088-fbec-4839-a8bb-a67c766365f1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
        "quote_id": "c1d62c8e-e3e5-4787-8b23-72e066e4f8d5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "90694d7c-e2f0-453e-a965-582c8af16281"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:43:45.606178Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
        "attempt_id": "af1d59d1-ac29-480b-9866-5c59fa2f3543",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "90694d7c-e2f0-453e-a965-582c8af16281"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T13:43:45.613421Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
        "attempt_id": "af1d59d1-ac29-480b-9866-5c59fa2f3543"
      },
      "correlation_id": "90694d7c-e2f0-453e-a965-582c8af16281"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "af1d59d1-ac29-480b-9866-5c59fa2f3543",
        "generation": 1,
        "started_at": "2026-10-28T13:43:45.605477Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T13:43:45.613421Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T13:43:45.606826Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/90694d7c-e2f0-453e-a965-582c8af16281` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "bfed5249-4753-4b55-abc8-53fac1e4b01e:0",
      "order_id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
      "at": "2026-10-28T13:43:45.604961Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "bfed5249-4753-4b55-abc8-53fac1e4b01e:1",
      "order_id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
      "at": "2026-10-28T13:43:45.606178Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "bfed5249-4753-4b55-abc8-53fac1e4b01e:2",
      "order_id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
      "at": "2026-10-28T13:43:45.613421Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/76ef2ae0-3aaa-4a3b-9024-db56d88453e3` → **200**

```json
{
  "found": []
}
```

Done: request 90694d7c-e2f0-453e-a965-582c8af16281 — order bfed5249-4753-4b55-abc8-53fac1e4b01e found by its id.

`GET /api/rider/v1/orders/bfed5249-4753-4b55-abc8-53fac1e4b01e` → **200**

```json
{
  "id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8e2f8088-fbec-4839-a8bb-a67c766365f1",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:43:45.604535Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bfed5249-4753-4b55-abc8-53fac1e4b01e/cancel` → **200**

```json
{
  "command_id": "39c72da1-c1d5-45ed-979f-f8afc7d8d176",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bfed5249-4753-4b55-abc8-53fac1e4b01e",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8e2f8088-fbec-4839-a8bb-a67c766365f1",
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T13:43:45.604535Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639521841",
  "device_ref": "sandbox-9839"
}
```

```json
{
  "challenge_id": "423af0e0-e042-4050-9b1a-8964fa9dabeb",
  "expires_at": "2026-10-28T13:48:47.673972304Z",
  "resend_available_at": "2026-10-28T13:43:48.673972304Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639521841` → **200**

```json
{
  "phone": "+380639521841",
  "audience": "CLIENT",
  "code": "649056",
  "sent_at": "2026-10-28T13:43:47.676045444Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "423af0e0-e042-4050-9b1a-8964fa9dabeb",
  "code": "649056",
  "device_ref": "sandbox-9839"
}
```

```json
{
  "session_id": "86a6901c-afe8-4cc7-a788-f9e01d57a293",
  "subject": {
    "type": "CLIENT",
    "id": "7f0449d8-51c7-4006-9d88-3b0667cf2786"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZjA0NDlkOC01MWM3LTQwMDYtOWQ4OC0zYjA2NjdjZjI3ODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTI3LCJpYXQiOjE3OTMxOTUwMjcsImp0aSI6IjdjYTAxNDYyLTA5ZTYtNDBmNC05ZDE4LTkxMWRiOGI1OTJiOCIsInNpZCI6Ijg2YTY5MDFjLWFmZTgtNGNjNy1hNzg4LWY5ZTAxZDU3YTI5MyJ9.GEAmILDlHrI4jXVAJGJ785B9YYE-GDBnsvIIodn5glo",
  "access_expires_at": "2026-10-28T13:58:47.910747486Z",
  "refresh_token": "E14J8umHopfDtyGhTNN-NiDgaY5YirRoA0XUdR78smY",
  "refresh_expires_at": "2026-11-27T13:43:47.910204914Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b684af87-518f-45a1-8fd1-4e661bbb3b77",
  "expires_at": "2026-10-28T13:48:50.119858885Z",
  "resend_available_at": "2026-10-28T13:43:51.119858885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639521841` → **200**

```json
{
  "phone": "+380639521841",
  "audience": "CLIENT",
  "code": "939331",
  "sent_at": "2026-10-28T13:43:50.121481371Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "30fd1ac8-36db-4149-90ce-462512d5ca7c",
  "challenge_id": "b684af87-518f-45a1-8fd1-4e661bbb3b77",
  "otp_code": "939331"
}
```

```json
{
  "id": "50e58966-8fe8-4137-81eb-b79d4de72b4f",
  "state": "PENDING",
  "created_at": "2026-10-28T13:43:50.35612Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/50e58966-8fe8-4137-81eb-b79d4de72b4f` → **200**

```json
{
  "id": "50e58966-8fe8-4137-81eb-b79d4de72b4f",
  "state": "PENDING",
  "created_at": "2026-10-28T13:43:50.35612Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/50e58966-8fe8-4137-81eb-b79d4de72b4f` → **200**

```json
{
  "id": "50e58966-8fe8-4137-81eb-b79d4de72b4f",
  "state": "READY",
  "created_at": "2026-10-28T13:43:50.35612Z",
  "ready_at": "2026-10-28T13:43:50.761018Z",
  "expires_at": "2026-11-04T13:43:50.761018Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/50e58966-8fe8-4137-81eb-b79d4de72b4f/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637780072",
  "device_ref": "sandbox-22334"
}
```

```json
{
  "challenge_id": "dfb3ffc7-6abe-424d-9907-a1196b59364c",
  "expires_at": "2026-10-28T13:48:52.012306982Z",
  "resend_available_at": "2026-10-28T13:43:53.012306982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637780072` → **200**

```json
{
  "phone": "+380637780072",
  "audience": "CLIENT",
  "code": "172481",
  "sent_at": "2026-10-28T13:43:52.015190221Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfb3ffc7-6abe-424d-9907-a1196b59364c",
  "code": "172481",
  "device_ref": "sandbox-22334"
}
```

```json
{
  "session_id": "0b8cd157-0982-4715-9975-b52154cce34f",
  "subject": {
    "type": "CLIENT",
    "id": "1e7270fe-8995-4a65-8d83-7f4ed9eec277"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTcyNzBmZS04OTk1LTRhNjUtOGQ4My03ZjRlZDllZWMyNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTMyLCJpYXQiOjE3OTMxOTUwMzIsImp0aSI6Ijk1OWY0NGVmLTc1MWYtNGRhMy1iMzU0LTAxYTBlNDA0Nzg5ZSIsInNpZCI6IjBiOGNkMTU3LTA5ODItNDcxNS05OTc1LWI1MjE1NGNjZTM0ZiJ9.wqQGJQfJAqKvN-rMKL1s-t-1_U9nBnPVwnHnQcBRqGM",
  "access_expires_at": "2026-10-28T13:58:52.244194219Z",
  "refresh_token": "MH788paIabNhtAOq3fEJPWZJiModPhAZuDKBdY0Flik",
  "refresh_expires_at": "2026-11-27T13:43:52.243810243Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/50e58966-8fe8-4137-81eb-b79d4de72b4f/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/50e58966-8fe8-4137-81eb-b79d4de72b4f/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "82654c58-7cdb-422b-abcb-3357623d85fb"
}
```

## Support sees that it was asked for, not what is in it

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b079eb55-829f-4843-84bb-2a7ac3db0e83",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MzIsImlhdCI6MTc5MzE5NTAzMiwianRpIjoiMDU3ZDAwMzQtZTY0MC00ZmQ4LWJlYzEtOGRmZjkzNWFjMWJhIiwic2lkIjoiYjA3OWViNTUtODI5Zi00ODQzLTg0YmItMmE3YWMzZGIwZTgzIn0.xW5GzkYQE-s5D3SlxwFDBsfRah880rGCoizsEPhkimQ",
  "access_expires_at": "2026-10-28T13:58:52.924682596Z",
  "refresh_token": "YpKeIvkJwbm-iOVJewq5Dth_ynfl5NHnJ6f4NUkWslI",
  "refresh_expires_at": "2026-10-29T01:43:52.924233251Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7f0449d8-51c7-4006-9d88-3b0667cf2786",
  "session_id": "86a6901c-afe8-4cc7-a788-f9e01d57a293",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/7f0449d8-51c7-4006-9d88-3b0667cf2786/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "50e58966-8fe8-4137-81eb-b79d4de72b4f",
      "state": "READY",
      "created_at": "2026-10-28T13:43:50.35612Z",
      "ready_at": "2026-10-28T13:43:50.761018Z",
      "expires_at": "2026-11-04T13:43:50.761018Z",
      "size_bytes": 1031
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.

# Scenario: dispatch-journal

## Only the two drivers of this scenario are online

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20482"
}
```

```json
{
  "challenge_id": "58fec58b-103d-464c-8963-893bb90f99a9",
  "expires_at": "2026-10-28T13:48:53.560793515Z",
  "resend_available_at": "2026-10-28T13:43:54.560793515Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "508808",
  "sent_at": "2026-10-28T13:43:53.562678705Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58fec58b-103d-464c-8963-893bb90f99a9",
  "code": "508808",
  "device_ref": "sandbox-20482"
}
```

```json
{
  "session_id": "86150e1f-4f6d-468d-b8a2-826d7b135ea9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTkzMywiaWF0IjoxNzkzMTk1MDMzLCJqdGkiOiI5ODMyZWI2OS0yZTQwLTRlODItOTc2Zi01YjNhZDRmZGQ2MGMiLCJzaWQiOiI4NjE1MGUxZi00ZjZkLTQ2OGQtYjhhMi04MjZkN2IxMzVlYTkifQ.Cn4oFCoTQMbrmBWMSVHMP29cOgF8btxWF_-MqYcRNpg",
  "access_expires_at": "2026-10-28T13:58:53.793307489Z",
  "refresh_token": "deIyKdPwFctYCzYMpOg4iAYs-Y_MVkWkuWPkdmH8QFQ",
  "refresh_expires_at": "2026-11-27T13:43:53.79288243Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29795"
}
```

```json
{
  "challenge_id": "2d1d98bc-91d2-4c28-8ede-d83bbe6e3f86",
  "expires_at": "2026-10-28T13:48:54.205847431Z",
  "resend_available_at": "2026-10-28T13:43:55.205847431Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "821733",
  "sent_at": "2026-10-28T13:43:54.207733653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d1d98bc-91d2-4c28-8ede-d83bbe6e3f86",
  "code": "821733",
  "device_ref": "sandbox-29795"
}
```

```json
{
  "session_id": "a6a13c78-2cf5-49f5-aecb-a6c96edc2c31",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTkzNCwiaWF0IjoxNzkzMTk1MDM0LCJqdGkiOiI1Mjg5ZGMzOS1kZDU4LTQyZDktYTZjMS0zMjQxZmZmOGUxNjAiLCJzaWQiOiJhNmExM2M3OC0yY2Y1LTQ5ZjUtYWVjYi1hNmM5NmVkYzJjMzEifQ.D8AsuKB-2jqXIxYcmPiUlzIYZx4Bt1DteYL2uEY4f7I",
  "access_expires_at": "2026-10-28T13:58:54.439226468Z",
  "refresh_token": "aJHnT4lQnxyp5Me9OVb-2zqMGVEu9HYY8gRx6WKmAZ8",
  "refresh_expires_at": "2026-11-27T13:43:54.438805886Z",
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
  "command_id": "bca3fa37-8244-4f2e-a1af-e7be355d3165",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:43:54Z",
    "sequence": 1793195034851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "13a27452-3c01-4d76-aece-9ae1151c738f",
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
  "last_heartbeat_at": "2026-10-28T13:43:54.866793Z",
  "last_location_at": "2026-10-28T13:43:54.866793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-11913"
}
```

```json
{
  "challenge_id": "630c8551-e133-4d18-9bb4-2cbadc5472a2",
  "expires_at": "2026-10-28T13:48:55.078313317Z",
  "resend_available_at": "2026-10-28T13:43:56.078313317Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "263370",
  "sent_at": "2026-10-28T13:43:55.07997713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "630c8551-e133-4d18-9bb4-2cbadc5472a2",
  "code": "263370",
  "device_ref": "sandbox-11913"
}
```

```json
{
  "session_id": "654c52a7-b473-4d55-b2e4-01c79d63efdf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTkzNSwiaWF0IjoxNzkzMTk1MDM1LCJqdGkiOiI2ZWQ2OGI0Ny0xNGI3LTQ4MTUtODdkMy1lZDNiMWIyZGYzYjciLCJzaWQiOiI2NTRjNTJhNy1iNDczLTRkNTUtYjJlNC0wMWM3OWQ2M2VmZGYifQ.npuL6_-QIPOX5TcBi6TTpC4IPoN0sitwIBN_kgHtGl4",
  "access_expires_at": "2026-10-28T13:58:55.306754805Z",
  "refresh_token": "pTbttuZoW_RlPpovP4wRIHcUazSGNbjSMJKhZPWDsaY",
  "refresh_expires_at": "2026-11-27T13:43:55.306342486Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4af5a8e5-9da2-4cec-a410-b6c4e5564713",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:43:02.494028Z",
  "last_location_at": "2026-10-28T13:43:02.494028Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4af5a8e5-9da2-4cec-a410-b6c4e5564713/handover` → **200**

```json
{
  "command_id": "1f75c5e0-fcb2-4f2c-87ec-cec23a15082d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4af5a8e5-9da2-4cec-a410-b6c4e5564713",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:43:02.494028Z",
  "last_location_at": "2026-10-28T13:43:02.494028Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4af5a8e5-9da2-4cec-a410-b6c4e5564713/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:43:55Z",
    "sequence": 1793195035932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4af5a8e5-9da2-4cec-a410-b6c4e5564713",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:43:55.948531Z",
  "last_location_at": "2026-10-28T13:43:55.948531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "25fdfdec-d644-470f-a934-1c437115625b",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MzYsImlhdCI6MTc5MzE5NTAzNiwianRpIjoiM2Y4ODdlZmEtM2UyNy00ZDY4LWEwZjAtOTA2MTc2ZTY0ZGRiIiwic2lkIjoiMjVmZGZkZWMtZDY0NC00NzBmLWE5MzQtMWM0MzcxMTU2MjViIn0.iclEqs3qnQ47VMShNA8_9mz-KanHChody1K9AeV1DHs",
  "access_expires_at": "2026-10-28T13:58:56.412864926Z",
  "refresh_token": "xcojFRbiGGzl9nzs7D84YZAIs-uEZQ2IVBKOaX8mfTY",
  "refresh_expires_at": "2026-10-29T01:43:56.412466377Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "1e35626f-7bca-4a37-ad13-e9996db9e519",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5MzYsImlhdCI6MTc5MzE5NTAzNiwianRpIjoiNDI0Mzg2ODMtYWI2ZS00NTllLWI4YjEtNTNhYzIyMDVkNGViIiwic2lkIjoiMWUzNTYyNmYtN2JjYS00YTM3LWFkMTMtZTk5OTZkYjllNTE5In0.Wt1iY0Sh9WX3BbSp1wtswqNnN6AuoRirHvDmFTVMUc0",
  "access_expires_at": "2026-10-28T13:58:56.876442132Z",
  "refresh_token": "ZgjezXL1SYuQaye1wzPPUdobJI3TegAYmgcGwNsDUHY",
  "refresh_expires_at": "2026-10-29T01:43:56.876063644Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684745572",
  "device_ref": "sandbox-6136"
}
```

```json
{
  "challenge_id": "793f4d84-c749-4d18-9549-8dea38d895da",
  "expires_at": "2026-10-28T13:48:57.091820768Z",
  "resend_available_at": "2026-10-28T13:43:58.091820768Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684745572` → **200**

```json
{
  "phone": "+380684745572",
  "audience": "CLIENT",
  "code": "570117",
  "sent_at": "2026-10-28T13:43:57.093703986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "793f4d84-c749-4d18-9549-8dea38d895da",
  "code": "570117",
  "device_ref": "sandbox-6136"
}
```

```json
{
  "session_id": "0b290ba4-c7bd-444a-9e36-0256425a38c0",
  "subject": {
    "type": "CLIENT",
    "id": "71d2f903-86fe-4689-8f40-122d2eeaf039"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MWQyZjkwMy04NmZlLTQ2ODktOGY0MC0xMjJkMmVlYWYwMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTM3LCJpYXQiOjE3OTMxOTUwMzcsImp0aSI6ImZkOGI4MzIzLWU4NzAtNDQ5Ny1iMjkyLTNiYTc3ZDZmMjY1OCIsInNpZCI6IjBiMjkwYmE0LWM3YmQtNDQ0YS05ZTM2LTAyNTY0MjVhMzhjMCJ9.IswnLmFsW8I_CJcVDckzMgwZahIiLzyXe_3o7s-ath0",
  "access_expires_at": "2026-10-28T13:58:57.324480605Z",
  "refresh_token": "_BBFv9bzzDmpINlvGgU4nGpcrq2Ex5G1L--VlxB6n0k",
  "refresh_expires_at": "2026-11-27T13:43:57.324081265Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "948b378c-354c-465f-a7ca-d15915b35807",
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
  "id": "0ae5d4af-dc82-417d-83dd-c193e499f526",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:48:57.540191Z",
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
  "command_id": "d1c88495-d3d3-49f1-b314-9f0a8e9dede2",
  "quote_id": "0ae5d4af-dc82-417d-83dd-c193e499f526",
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
  "id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71d2f903-86fe-4689-8f40-122d2eeaf039",
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
  "created_at": "2026-10-28T13:43:57.760057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "65f003ce-6416-417f-b2b7-af2ff20c884e",
    "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
    "expires_at": "2026-10-28T13:44:12.762868Z",
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
    "distance_m": 200
  }
]
```

`POST /api/driver/v1/offers/65f003ce-6416-417f-b2b7-af2ff20c884e/reject` → **204**

```json
{
  "command_id": "56e030f8-a0ed-442c-970a-2fc505447390"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4082243f-e2f1-47b4-836e-5f15720ccbad",
    "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
    "expires_at": "2026-10-28T13:44:13.205116Z",
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
    "distance_m": 601
  }
]
```

`POST /api/driver/v1/offers/4082243f-e2f1-47b4-836e-5f15720ccbad/accept` → **200**

```json
{
  "command_id": "61c2d0de-640a-4cf7-859c-ccdeb0c23dcc"
}
```

```json
{
  "id": "42a4fe08-a410-464a-92c0-6b4f032b61a2",
  "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3c374bb-7d73-4dfa-a09b-daf52f754975",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/2896f0d1-4143-4efd-86cf-f4f35c0fcb11/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:43:57.760492Z",
      "actor": {
        "type": "CLIENT",
        "id": "71d2f903-86fe-4689-8f40-122d2eeaf039",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
        "quote_id": "0ae5d4af-dc82-417d-83dd-c193e499f526",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3268fb8a-abc4-4f51-a720-e7c7fdb7611f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:43:57.762172Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
        "attempt_id": "d01e58dc-fad7-49f9-8e66-b43762480cfa",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3268fb8a-abc4-4f51-a720-e7c7fdb7611f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:43:57.767821Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "65f003ce-6416-417f-b2b7-af2ff20c884e",
        "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "3268fb8a-abc4-4f51-a720-e7c7fdb7611f"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T13:43:58.204255Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "65f003ce-6416-417f-b2b7-af2ff20c884e",
        "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11"
      },
      "correlation_id": "bcd9355d-e9ff-4890-8d25-e01662c8d193"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 2896f0d1-4143-4efd-86cf-f4f35c0fcb11 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/2896f0d1-4143-4efd-86cf-f4f35c0fcb11` → **200**

```json
{
  "id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "71d2f903-86fe-4689-8f40-122d2eeaf039",
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
  "search_phase": "STOPPED",
  "assignment": {
    "id": "42a4fe08-a410-464a-92c0-6b4f032b61a2",
    "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b3c374bb-7d73-4dfa-a09b-daf52f754975",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:43:57.760057Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2896f0d1-4143-4efd-86cf-f4f35c0fcb11/cancel` → **200**

```json
{
  "command_id": "a1257328-1d15-453c-b012-94e8b8b93af8",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "71d2f903-86fe-4689-8f40-122d2eeaf039",
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
  "search_phase": "STOPPED",
  "assignment": {
    "id": "42a4fe08-a410-464a-92c0-6b4f032b61a2",
    "order_id": "2896f0d1-4143-4efd-86cf-f4f35c0fcb11",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b3c374bb-7d73-4dfa-a09b-daf52f754975",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:43:57.760057Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "13a27452-3c01-4d76-aece-9ae1151c738f",
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
  "last_heartbeat_at": "2026-10-28T13:43:54.866793Z",
  "last_location_at": "2026-10-28T13:43:54.866793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13a27452-3c01-4d76-aece-9ae1151c738f/close` → **200**

```json
{
  "command_id": "31ef8789-b9d1-43fa-a6e0-efc0b7e96d1b",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4af5a8e5-9da2-4cec-a410-b6c4e5564713",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:43:55.948531Z",
  "last_location_at": "2026-10-28T13:43:55.948531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4af5a8e5-9da2-4cec-a410-b6c4e5564713/close` → **200**

```json
{
  "command_id": "55713022-38bb-482a-9b1e-a7f384e568da",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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

# Scenario: full-ride

## Start-up data for the apps

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 0,
  "brand": {
    "service_name": "Blizz Taxi",
    "primary_color": "#111111",
    "on_primary_color": "#FFFFFF",
    "accent_color": null,
    "logo_url": null,
    "support_phone": null,
    "support_email": null,
    "support_telegram": null,
    "privacy_policy_url": null,
    "terms_url": null
  },
  "languages": {
    "default_language": "ru",
    "enabled": [
      "uk",
      "pl",
      "ru",
      "en"
    ]
  },
  "calls": {
    "mode": "DIRECT",
    "service_phone": null
  },
  "preorders": {
    "threshold_minutes": 60,
    "max_days_ahead": 7
  },
  "maps": {
    "provider": null,
    "android_key": null,
    "ios_key": null,
    "web_key": null
  },
  "cities": [
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

## Driver signs in and goes online 200 m from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2030"
}
```

```json
{
  "challenge_id": "80304db4-21a6-40a7-8c92-632a6ccf50ae",
  "expires_at": "2026-10-28T13:49:00.444390665Z",
  "resend_available_at": "2026-10-28T13:44:01.444390665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "526623",
  "sent_at": "2026-10-28T13:44:00.446244518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80304db4-21a6-40a7-8c92-632a6ccf50ae",
  "code": "526623",
  "device_ref": "sandbox-2030"
}
```

```json
{
  "session_id": "d08a942f-54ea-4ab8-9c04-6c75d9157944",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTk0MCwiaWF0IjoxNzkzMTk1MDQwLCJqdGkiOiIyMjI0ODZkYi01NjM0LTQxMDktODBiNy05MWFiNzA0MTJiNmUiLCJzaWQiOiJkMDhhOTQyZi01NGVhLTRhYjgtOWMwNC02Yzc1ZDkxNTc5NDQifQ.FuJ7LivDKlwcrif4i2jy8PICW2kpZDN_2xmnIcYE4y8",
  "access_expires_at": "2026-10-28T13:59:00.67977075Z",
  "refresh_token": "EKO1NnN70LLAQPir59Ntf35CL1HFx1q_aLyrKjT_qVU",
  "refresh_expires_at": "2026-11-27T13:44:00.679367845Z",
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
  "command_id": "415fc036-e025-4cb5-8c74-a5a3038a5780",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:01Z",
    "sequence": 1793195041905
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
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
  "last_heartbeat_at": "2026-10-28T13:44:01.105492Z",
  "last_location_at": "2026-10-28T13:44:01.105492Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679315798",
  "device_ref": "sandbox-1228"
}
```

```json
{
  "challenge_id": "e286ed97-b535-4eab-afb5-3f1a3b450ca9",
  "expires_at": "2026-10-28T13:49:01.315327014Z",
  "resend_available_at": "2026-10-28T13:44:02.315327014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679315798` → **200**

```json
{
  "phone": "+380679315798",
  "audience": "CLIENT",
  "code": "614188",
  "sent_at": "2026-10-28T13:44:01.317101849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e286ed97-b535-4eab-afb5-3f1a3b450ca9",
  "code": "614188",
  "device_ref": "sandbox-1228"
}
```

```json
{
  "session_id": "dda54bf3-021f-44c9-bfa2-47e44041e06c",
  "subject": {
    "type": "CLIENT",
    "id": "a7f7088c-0c1a-4333-8f44-d8bbb3c02b91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2Y3MDg4Yy0wYzFhLTQzMzMtOGY0NC1kOGJiYjNjMDJiOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTQxLCJpYXQiOjE3OTMxOTUwNDEsImp0aSI6IjljMWU3ODY2LWI4ZjEtNDAzNy04NWI2LTRjNDRmMDY2YzdlYiIsInNpZCI6ImRkYTU0YmYzLTAyMWYtNDRjOS1iZmEyLTQ3ZTQ0MDQxZTA2YyJ9.sPBAGPId4X8Dy5L4VuznKgpI4VpuJ8x_wI8Firtnx4c",
  "access_expires_at": "2026-10-28T13:59:01.54716343Z",
  "refresh_token": "LLFwz8i0X_V8CURrhUhtEALlybTnViw1_8YuiYMMSHI",
  "refresh_expires_at": "2026-11-27T13:44:01.546731286Z",
  "account_created": true
}
```

`GET /api/rider/v1/vehicle-classes?lat=50.4501&lon=30.5234` → **200**

```json
[
  {
    "code": "COMFORT",
    "name": "Комфорт"
  },
  {
    "code": "STANDARD",
    "name": "Стандарт"
  }
]
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "41e890ef-33a4-4970-9856-681bbd69a76c",
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
  "id": "77c3d0a9-b9a4-4b12-b93d-6eb69f644d7f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:01.957240Z",
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

## Both phones register for pushes (the sandbox only records them: /sandbox/v1/pushes)

`POST /api/driver/v1/push-devices` → **201**

```json
{
  "command_id": "bba1acf5-123f-43a5-859e-f89dba22ff71",
  "platform": "ANDROID",
  "token": "sandbox-driver-7a83270f-2d53-46a2-b5fc-c222bf76563e"
}
```

```json
{
  "id": "e1442944-6baa-4a64-b1fe-74d48f01b6ae",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:44:02.179363Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "13635bea-1879-428c-a847-194d0df63a75",
  "platform": "ANDROID",
  "token": "sandbox-rider-909068f6-623c-4af6-8da1-dd8dd1de961e"
}
```

```json
{
  "id": "27c0538c-0ed1-42cb-b69b-635e899b7e87",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:44:02.38871Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ad624e98-7060-48e8-b711-bffec6856753",
  "quote_id": "77c3d0a9-b9a4-4b12-b93d-6eb69f644d7f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH"
}
```

```json
{
  "id": "f821d263-31fc-4599-952c-19bd74532116",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7f7088c-0c1a-4333-8f44-d8bbb3c02b91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:44:02.611664Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b8277edf-9093-4f0c-8979-0658e25efbb5",
    "order_id": "f821d263-31fc-4599-952c-19bd74532116",
    "expires_at": "2026-10-28T13:44:17.614085Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 44
  }
]
```

`POST /api/driver/v1/offers/b8277edf-9093-4f0c-8979-0658e25efbb5/accept` → **200**

```json
{
  "command_id": "bd819632-058a-4229-b422-8cb541b73124"
}
```

```json
{
  "id": "c18cd957-51f4-4e40-92de-26929c27a7ac",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:44:02.591Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:44:02.591Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:44:04.080455428Z",
    "token_suffix": "76563e",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "a01d969f-6f4e-48e7-a0a8-6f77651407ca",
      "order_version": "2",
      "order_id": "f821d263-31fc-4599-952c-19bd74532116",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679315798&after=2026-10-28T13:44:02.591Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:44:04.082207895Z",
    "token_suffix": "de961e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "67d985e7-c3ec-4825-b5a5-730e9cf94bd9",
      "order_version": "3",
      "order_id": "f821d263-31fc-4599-952c-19bd74532116",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/f821d263-31fc-4599-952c-19bd74532116/messages` → **201**

```json
{
  "command_id": "9db2ef4b-61d3-4093-bed6-88d5dd7f9ab0",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8f32f00b-f80b-4ce1-8cbc-a65f8c6047a6",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T13:44:04.336693876Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "assignment_id": "c18cd957-51f4-4e40-92de-26929c27a7ac",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0f895a97-d702-43c0-bd5b-960f12a6b887/messages` → **201**

```json
{
  "command_id": "08ad6977-6c8b-4d94-9ea3-688b897e252b",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "5bfd34e7-c7c3-4d19-b6cd-a40234b5467c",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T13:44:04.752308353Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/f821d263-31fc-4599-952c-19bd74532116/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/0f895a97-d702-43c0-bd5b-960f12a6b887/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679315798"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/c7b1b3c0-127a-456b-98d4-ca73bce550d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:05Z",
    "sequence": 1793195045368
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
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
  "last_heartbeat_at": "2026-10-28T13:44:05.383909Z",
  "last_location_at": "2026-10-28T13:44:05.383909Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "assignment_id": "c18cd957-51f4-4e40-92de-26929c27a7ac",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0f895a97-d702-43c0-bd5b-960f12a6b887/arrive` → **200**

```json
{
  "command_id": "cae21126-6b73-4fb9-90e1-0b15dc3de7d2",
  "expected_version": 0
}
```

```json
{
  "id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "assignment_id": "c18cd957-51f4-4e40-92de-26929c27a7ac",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:05.800113Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0f895a97-d702-43c0-bd5b-960f12a6b887/start` → **200**

```json
{
  "command_id": "e1439573-3434-472c-85de-02c0d27b4b04",
  "expected_version": 1
}
```

```json
{
  "id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "assignment_id": "c18cd957-51f4-4e40-92de-26929c27a7ac",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:05.800113Z",
  "started_at": "2026-10-28T13:44:06.020726Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c7b1b3c0-127a-456b-98d4-ca73bce550d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:06Z",
    "sequence": 1793195046230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:44:06.246224Z",
  "last_location_at": "2026-10-28T13:44:06.246224Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/0f895a97-d702-43c0-bd5b-960f12a6b887/complete` → **200**

```json
{
  "command_id": "9fd37d9a-55d4-4b24-bdad-4737eaecf2a0",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:44:06Z",
  "cash_received": true
}
```

```json
{
  "id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "assignment_id": "c18cd957-51f4-4e40-92de-26929c27a7ac",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:05.800113Z",
  "started_at": "2026-10-28T13:44:06.020726Z",
  "completed_at": "2026-10-28T13:44:06.457911Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/f821d263-31fc-4599-952c-19bd74532116` → **200**

```json
{
  "id": "f821d263-31fc-4599-952c-19bd74532116",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a7f7088c-0c1a-4333-8f44-d8bbb3c02b91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан Незалежності",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Залізничний вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_REPORTED",
  "price_minor": 10517,
  "final_price_minor": 10517,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "c18cd957-51f4-4e40-92de-26929c27a7ac",
    "order_id": "f821d263-31fc-4599-952c-19bd74532116",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:44:02.611664Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "f821d263-31fc-4599-952c-19bd74532116",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:44:02.611664Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "vehicle_class": "STANDARD",
    "price_minor": 10517,
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": {
      "name": "Іван Петренко",
      "vehicle": {
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "registration_number": "AA0001TX"
      }
    },
    "chat_available": true,
    "cancellation": null,
    "pickup_at": null
  }
]
```

`GET /api/driver/v1/trips` → **200**

```json
[
  {
    "id": "0f895a97-d702-43c0-bd5b-960f12a6b887",
    "order_id": "f821d263-31fc-4599-952c-19bd74532116",
    "order_short_number": 9,
    "created_at": "2026-10-28T13:44:03.047516Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0316f9b8-bde2-4d32-8ae0-f638d12b7eef",
    "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
    "order_short_number": 2,
    "created_at": "2026-10-28T13:42:54.859551Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "aed61a22-a8bc-4dde-89cd-eeb4be7c53f5",
    "order_id": "fc81bba0-95b4-4af5-9450-4e0d92520c76",
    "order_short_number": 1,
    "created_at": "2026-10-28T13:42:42.320675Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  }
]
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": -1682,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "figures": {
        "trips": 3,
        "fare_minor": 31551,
        "commission_minor": 4734,
        "driver_share_minor": 26817,
        "cash_minor": 28499,
        "cashless_minor": 3052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -1682
      }
    }
  ],
  "total": {
    "trips": 3,
    "fare_minor": 31551,
    "commission_minor": 4734,
    "driver_share_minor": 26817,
    "cash_minor": 28499,
    "cashless_minor": 3052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -1682
  },
  "balance_minor": -1682
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/f821d263-31fc-4599-952c-19bd74532116/tip` → **200**

```json
{
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CASH",
  "available_until": "2026-10-29T13:44:06.457911Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f821d263-31fc-4599-952c-19bd74532116/tip` → **201**

```json
{
  "command_id": "f9ededfa-87a9-497d-8192-16bf96c8e5fa",
  "amount_minor": 1100
}
```

```json
{
  "id": "ce0f5ea1-55d2-45cc-ae71-11e6ef17a9e9",
  "order_id": "f821d263-31fc-4599-952c-19bd74532116",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T13:44:10.96369Z"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "5e519f54-5b59-4033-bb6d-c8853dc8da3c",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NTEsImlhdCI6MTc5MzE5NTA1MSwianRpIjoiOTRhNTk5ZTYtYjdhMS00MjZlLTg2YzctOWM1NDdkZjY1YzA3Iiwic2lkIjoiNWU1MTlmNTQtNWI1OS00MDMzLWJiNmQtYzg4NTNkYzhkYTNjIn0.qGOQaytyEvQjp6vDw9nj2iFNqOxxFBkqNWoDeAYIKGw",
  "access_expires_at": "2026-10-28T13:59:11.434456161Z",
  "refresh_token": "ZDecMPlsN7ODl8eGo9-_fMWIyEw6KYWb3tgnf-eNfh8",
  "refresh_expires_at": "2026-10-29T01:44:11.434061037Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "counts": {
        "created": 9,
        "fulfilled": 5,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 8
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 8
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 2,
          "STAFF": 1
        }
      }
    }
  ],
  "total": {
    "created": 9,
    "fulfilled": 5,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 8
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 8
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 2,
      "STAFF": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 1
    },
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 1
    },
    {
      "cancelled_by": "DRIVER",
      "code": "PASSENGER_ASKED",
      "count": 1
    },
    {
      "cancelled_by": "RIDER",
      "code": "WAIT_TOO_LONG",
      "count": 1
    }
  ],
  "generated_at": "2026-10-28T13:44:11.648299021Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "figures": {
        "trips": 5,
        "fares_minor": 64145,
        "service_rides_minor": 0,
        "commission_minor": 9624,
        "driver_share_minor": 54521,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 28499,
        "tips_minor": 5000,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 5,
    "fares_minor": 64145,
    "service_rides_minor": 0,
    "commission_minor": 9624,
    "driver_share_minor": 54521,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 28499,
    "tips_minor": 5000,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T13:44:11.858875552Z"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "9d90b4e2-2f14-4bf6-b7b6-94a80b2b7c8f",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NTIsImlhdCI6MTc5MzE5NTA1MiwianRpIjoiOGQyMjdlMzctNDQ1Mi00YmRlLWE5MmEtMTE1YzU0MjU1M2YwIiwic2lkIjoiOWQ5MGI0ZTItMmYxNC00YmY2LWI3YjYtOTRhODBiMmI3YzhmIn0.XTg7yPVo3N8zNDcNLOjTaA02l2Y9nWCAhoukTy38I6o",
  "access_expires_at": "2026-10-28T13:59:12.330339918Z",
  "refresh_token": "1Xosr6WYlfDHiH1aPLNCzqE-dr03diDLBaw1aKPGw2k",
  "refresh_expires_at": "2026-10-29T01:44:12.329936231Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f821d263-31fc-4599-952c-19bd74532116/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:44:02.612054Z",
      "actor": {
        "type": "CLIENT",
        "id": "a7f7088c-0c1a-4333-8f44-d8bbb3c02b91",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f821d263-31fc-4599-952c-19bd74532116",
        "quote_id": "77c3d0a9-b9a4-4b12-b93d-6eb69f644d7f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c7679f0e-0da4-4760-a5fb-1c0de5d186fd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:44:02.613466Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f821d263-31fc-4599-952c-19bd74532116",
        "attempt_id": "1c136992-df67-4782-ae65-6337a695284a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c7679f0e-0da4-4760-a5fb-1c0de5d186fd"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:44:02.616219Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b8277edf-9093-4f0c-8979-0658e25efbb5",
        "order_id": "f821d263-31fc-4599-952c-19bd74532116",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c7679f0e-0da4-4760-a5fb-1c0de5d186fd"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:44:03.048904Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b8277edf-9093-4f0c-8979-0658e25efbb5",
        "order_id": "f821d263-31fc-4599-952c-19bd74532116",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c18cd957-51f4-4e40-92de-26929c27a7ac"
      },
      "correlation_id": "2a9fa04a-cb36-4b08-baca-641b06f18f92"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T13:44:12.751523187Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "name": "Іван Петренко",
      "car": {
        "registration_number": "AA0001TX",
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "classes": [
          "STANDARD",
          "COMFORT"
        ]
      },
      "has_payment_terminal": false,
      "status": "FREE",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "FRESH",
      "location": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "last_location_at": "2026-10-28T13:44:06.246224Z",
      "order_id": null
    }
  ]
}
```

Done: order f821d263-31fc-4599-952c-19bd74532116.

# Scenario: incoming-call

## The admin says which city the service number belongs to

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "38c814b4-d1d1-4f27-b3af-a34d3b596070",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NTMsImlhdCI6MTc5MzE5NTA1MywianRpIjoiYjk1OTg4NzMtODYxOC00NzliLWE3MzYtNjE5ZjFmNWZiZWZlIiwic2lkIjoiMzhjODE0YjQtZDFkMS00ZjI3LWIzYWYtYTM0ZDNiNTk2MDcwIn0._2FL5rwjenCDd2D58p2x4jUb58QKqmzvqfEtlzs-cas",
  "access_expires_at": "2026-10-28T13:59:13.240380003Z",
  "refresh_token": "vGm-91c8LQYMqNnB1v1m2xZyHj7ZiYmviqoEgKTg0hE",
  "refresh_expires_at": "2026-10-29T01:44:13.239908574Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": [
    {
      "number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "label": "Kyiv call centre",
      "version": 1
    }
  ]
}
```

`POST /api/admin/v1/call-lines/%2B380441110064` → **200**

```json
{
  "command_id": "4fbc69e2-0dcc-45a8-982a-664541a23871",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox incoming-call scenario"
}
```

```json
{
  "number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
}
```

## A call comes in; Asterisk reports it twice — one call in the log

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-28T13:44:13.000+0000",
  "channel": {
    "id": "1730052000.762719287",
    "linkedid": "1730052000.762719287",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670838785"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-28T13:44:13.000+0000",
  "channel": {
    "id": "1730052000.762719287",
    "linkedid": "1730052000.762719287",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670838785"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
  }
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "5e98293f-9d24-4e97-9a53-e504342d90d2",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NTQsImlhdCI6MTc5MzE5NTA1NCwianRpIjoiN2ViNjQyZTYtODI2Ny00YmYxLTg0MmEtOWI2NzJkMTE0MWNjIiwic2lkIjoiNWU5ODI5M2YtOWQyNC00ZTk3LTlhNTMtZTUwNDM0MmQ5MGQyIn0.lviiqb2f4iA3peT5Rds1PXMbvuuWFGAca1LyLdT5jMM",
  "access_expires_at": "2026-10-28T13:59:14.172890078Z",
  "refresh_token": "DR4NgzUcMOxb6NEdVhmXpz_48_06ze8o0idueKHyMCA",
  "refresh_expires_at": "2026-10-29T01:44:14.172443517Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "be09a0b7-7e3b-4ad2-8639-89da99d1eaf0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670838785",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:44:13Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/be09a0b7-7e3b-4ad2-8639-89da99d1eaf0/answer` → **200**

```json
{
  "command_id": "6429f6f9-8f6a-45f1-aa22-ab02c43b8cd5"
}
```

```json
{
  "id": "be09a0b7-7e3b-4ad2-8639-89da99d1eaf0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670838785",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "order_ids": [],
  "started_at": "2026-10-28T13:44:13Z",
  "answered_at": "2026-10-28T13:44:14.596342Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.762719287",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f251f848-2333-470d-bc92-27570e9e3adf",
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
  "id": "0f4cff20-8aeb-4633-a15e-b5d9693904ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:14.832127Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "df5796e0-c676-4ceb-8564-5432473206b1",
  "quote_id": "0f4cff20-8aeb-4633-a15e-b5d9693904ac",
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
  "payment_method": "CASH",
  "caller": {
    "name": "Caller",
    "phone": "+380670838785"
  },
  "call_id": "be09a0b7-7e3b-4ad2-8639-89da99d1eaf0"
}
```

```json
{
  "id": "ec1d1874-545b-4cca-8d8b-6f4e0172c154",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "created_at": "2026-10-28T13:44:15.061695Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670838785"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The caller hangs up: the call is over, the order is not

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052000.762719287",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "be09a0b7-7e3b-4ad2-8639-89da99d1eaf0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670838785",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [
        "ec1d1874-545b-4cca-8d8b-6f4e0172c154"
      ],
      "started_at": "2026-10-28T13:44:13Z",
      "answered_at": "2026-10-28T13:44:14.596342Z",
      "ended_at": "2026-10-28T13:44:15.294292Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "5bf61521-9270-4e64-9335-cbf94113f15a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674449257",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [],
      "started_at": "2026-10-28T13:42:49.253308Z",
      "answered_at": "2026-10-28T13:42:49.496598Z",
      "ended_at": "2026-10-28T13:42:49.751231Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:42:50.748887Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ec1d1874-545b-4cca-8d8b-6f4e0172c154` → **200**

```json
{
  "id": "ec1d1874-545b-4cca-8d8b-6f4e0172c154",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "created_at": "2026-10-28T13:44:15.061695Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670838785"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ec1d1874-545b-4cca-8d8b-6f4e0172c154` → **200**

```json
{
  "id": "ec1d1874-545b-4cca-8d8b-6f4e0172c154",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "created_at": "2026-10-28T13:44:15.061695Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670838785"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ec1d1874-545b-4cca-8d8b-6f4e0172c154/cancel` → **200**

```json
{
  "command_id": "b3038fe3-8ef1-4e8a-b34a-9beae6da4fe6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ec1d1874-545b-4cca-8d8b-6f4e0172c154",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T13:44:15.061695Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670838785"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call be09a0b7-7e3b-4ad2-8639-89da99d1eaf0 with order ec1d1874-545b-4cca-8d8b-6f4e0172c154.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11893"
}
```

```json
{
  "challenge_id": "7290b3a7-94b4-4305-ac46-6d5930f7bfdc",
  "expires_at": "2026-10-28T13:49:16.2169841Z",
  "resend_available_at": "2026-10-28T13:44:17.2169841Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "727943",
  "sent_at": "2026-10-28T13:44:16.218869431Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7290b3a7-94b4-4305-ac46-6d5930f7bfdc",
  "code": "727943",
  "device_ref": "sandbox-11893"
}
```

```json
{
  "session_id": "f384d466-fc70-4f37-b5ed-94b9f59a27c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTk1NiwiaWF0IjoxNzkzMTk1MDU2LCJqdGkiOiIwYjU3Y2E3My0xZjkyLTQxZDItYTU2Zi02OTg2ZTMwMjE0YmEiLCJzaWQiOiJmMzg0ZDQ2Ni1mYzcwLTRmMzctYjVlZC05NGI5ZjU5YTI3YzQifQ.xRK7g4hQhvbyuCWZR8OBu_FEbbeU21iYUbeCQ2vIbrw",
  "access_expires_at": "2026-10-28T13:59:16.444119288Z",
  "refresh_token": "XWidbgctxwyJ1cWYFUHlS2J3PXnzVyYdvkF95rqk0GQ",
  "refresh_expires_at": "2026-11-27T13:44:16.443682037Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
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
  "last_heartbeat_at": "2026-10-28T13:44:06.246224Z",
  "last_location_at": "2026-10-28T13:44:06.246224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c7b1b3c0-127a-456b-98d4-ca73bce550d4/handover` → **200**

```json
{
  "command_id": "4a0bee90-efe2-4957-b372-2fe7e37f2ec0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:44:06.246224Z",
  "last_location_at": "2026-10-28T13:44:06.246224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c7b1b3c0-127a-456b-98d4-ca73bce550d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:17Z",
    "sequence": 1793195057730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:44:17.088378Z",
  "last_location_at": "2026-10-28T13:44:17.088378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665300046",
  "device_ref": "sandbox-6385"
}
```

```json
{
  "challenge_id": "f96305e0-71d4-4744-9975-ab229b5aa4f7",
  "expires_at": "2026-10-28T13:49:17.291140503Z",
  "resend_available_at": "2026-10-28T13:44:18.291140503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665300046` → **200**

```json
{
  "phone": "+380665300046",
  "audience": "CLIENT",
  "code": "072313",
  "sent_at": "2026-10-28T13:44:17.292947772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f96305e0-71d4-4744-9975-ab229b5aa4f7",
  "code": "072313",
  "device_ref": "sandbox-6385"
}
```

```json
{
  "session_id": "e82d7d45-5feb-4de4-9a4f-4eab5c2b88a4",
  "subject": {
    "type": "CLIENT",
    "id": "1f1bd20f-47ed-480b-8abe-1d183f7d2946"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjFiZDIwZi00N2VkLTQ4MGItOGFiZS0xZDE4M2Y3ZDI5NDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTU3LCJpYXQiOjE3OTMxOTUwNTcsImp0aSI6IjM3YjFhYTk1LWYyYTgtNGI3Zi1hZmFjLTIxYjAzMTZjMjAwNSIsInNpZCI6ImU4MmQ3ZDQ1LTVmZWItNGRlNC05YTRmLTRlYWI1YzJiODhhNCJ9.9C4AxJMBfjlR6nt5-L3rFtsGtGE5C8Q9JCwtU_5gc3A",
  "access_expires_at": "2026-10-28T13:59:17.520510497Z",
  "refresh_token": "WraIu5d-M9f8JrDMLjUeN-4wbCGndtchKPJjgaM5pig",
  "refresh_expires_at": "2026-11-27T13:44:17.520138729Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "23f32205-2a3d-4c66-9544-fc990b7edf7c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  }
}
```

```json
{
  "id": "6b2b0b82-ac7a-4d9a-bd11-20862128dc32",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:17.736593Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 21185,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ca05b944-e77b-406a-8e8a-99c52b1840a0",
  "quote_id": "6b2b0b82-ac7a-4d9a-bd11-20862128dc32",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH"
}
```

```json
{
  "id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f1bd20f-47ed-480b-8abe-1d183f7d2946",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21185,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:44:17.958892Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b732fd50-e746-4a3f-af2e-a30d39fabf56",
    "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
    "expires_at": "2026-10-28T13:44:32.961001Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4268,
      "lon": 30.5636
    },
    "pickup_label": "Палац спорту",
    "dropoff_label": "Голосіїв",
    "payment_method": "CASH",
    "price_minor": 21185,
    "currency": "UAH",
    "distance_m": 78
  }
]
```

`POST /api/driver/v1/offers/b732fd50-e746-4a3f-af2e-a30d39fabf56/accept` → **200**

```json
{
  "command_id": "591f990b-342d-4363-8def-f4c1a9f8c02f"
}
```

```json
{
  "id": "44ecbc8b-d62d-4fb4-a941-363492942648",
  "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8914a05d-5df6-4a0a-bc95-de51b9a0fd6b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8914a05d-5df6-4a0a-bc95-de51b9a0fd6b",
  "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
  "assignment_id": "44ecbc8b-d62d-4fb4-a941-363492942648",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c7b1b3c0-127a-456b-98d4-ca73bce550d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:18Z",
    "sequence": 1793195058812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:44:18.827866Z",
  "last_location_at": "2026-10-28T13:44:18.827866Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8914a05d-5df6-4a0a-bc95-de51b9a0fd6b/arrive` → **200**

```json
{
  "command_id": "520c4b85-6754-4013-99eb-1b5fc01789c1",
  "expected_version": 0
}
```

```json
{
  "id": "8914a05d-5df6-4a0a-bc95-de51b9a0fd6b",
  "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
  "assignment_id": "44ecbc8b-d62d-4fb4-a941-363492942648",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:19.048729Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8914a05d-5df6-4a0a-bc95-de51b9a0fd6b/start` → **200**

```json
{
  "command_id": "cbd4189e-84bf-481a-89cc-64651bb9cc2a",
  "expected_version": 1
}
```

```json
{
  "id": "8914a05d-5df6-4a0a-bc95-de51b9a0fd6b",
  "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
  "assignment_id": "44ecbc8b-d62d-4fb4-a941-363492942648",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "price_minor": 21185,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:19.048729Z",
  "started_at": "2026-10-28T13:44:19.266076Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/c7b1b3c0-127a-456b-98d4-ca73bce550d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:19Z",
    "sequence": 1793195059473
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:44:19.488808Z",
  "last_location_at": "2026-10-28T13:44:19.488808Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-4531"
}
```

```json
{
  "challenge_id": "c358bfd3-207a-4414-8f04-d5a18b8ba135",
  "expires_at": "2026-10-28T13:49:19.694023834Z",
  "resend_available_at": "2026-10-28T13:44:20.694023834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "428833",
  "sent_at": "2026-10-28T13:44:19.695665574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c358bfd3-207a-4414-8f04-d5a18b8ba135",
  "code": "428833",
  "device_ref": "sandbox-4531"
}
```

```json
{
  "session_id": "113766bc-4a74-4327-8838-1e967492200f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTk1OSwiaWF0IjoxNzkzMTk1MDU5LCJqdGkiOiI4YmMzYjUwYy1lYWNhLTQxYWQtYjJjOS1mZGZmZDcyOTE5MzAiLCJzaWQiOiIxMTM3NjZiYy00YTc0LTQzMjctODgzOC0xZTk2NzQ5MjIwMGYifQ.4UQdCsubsOKTzowwrAKpUhe1rqqvug-M19KMLB3xS00",
  "access_expires_at": "2026-10-28T13:59:19.920776655Z",
  "refresh_token": "XEFBQoj23tg0RvCq5wY4SSallpbcdB394f3yTfO1fdI",
  "refresh_expires_at": "2026-11-27T13:44:19.920304426Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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
  "command_id": "7f2c6ed4-914f-4d7a-9e00-cf29cc4669d7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:20Z",
    "sequence": 1793195060330
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "41103493-3a2f-4831-922f-fdd3a592700c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:44:20.346086Z",
  "last_location_at": "2026-10-28T13:44:20.346086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator interrupts: «Поломка автомобиля в пути», follow-up on the service

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "0a09cd84-4cf9-449a-8999-b23eddd95056",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NjAsImlhdCI6MTc5MzE5NTA2MCwianRpIjoiNmNlZDkwNTEtMjRiMi00MjFjLWI3OGMtZjQ3OWMwNDBjMzg3Iiwic2lkIjoiMGEwOWNkODQtNGNmOS00NDlhLTg5OTktYjIzZWRkZDk1MDU2In0.sWxjvqwIMAVIXm-Jyz4QvkYMVtKkRBQLrn4Y3OdvokU",
  "access_expires_at": "2026-10-28T13:59:20.814913937Z",
  "refresh_token": "fd2TjgeuzPB3Q5XK6ZchNi8ugv56n2OAMH95Z0HmSH8",
  "refresh_expires_at": "2026-10-29T01:44:20.814500727Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "51cde290-914b-4574-9e4c-f397cc07b163",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NjEsImlhdCI6MTc5MzE5NTA2MSwianRpIjoiMmVlZDMxYmUtZThlMi00YTg2LTlmYWMtYjdmNzRmYzgyMzRmIiwic2lkIjoiNTFjZGUyOTAtOTE0Yi00NTc0LTllNGMtZjM5N2NjMDdiMTYzIn0.2Y8DgcJcSfTuPK20zHgBiSwnsrBSujyJqDHhWqA9Gxo",
  "access_expires_at": "2026-10-28T13:59:21.283156462Z",
  "refresh_token": "62FOosZJ4MxLCdFiJ7ZfKi6UfMYEeqxRFdAbOyCnxFU",
  "refresh_expires_at": "2026-10-29T01:44:21.282733176Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e6b19826-16a4-401b-a262-b3bcc8869ccf` → **200**

```json
{
  "id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1f1bd20f-47ed-480b-8abe-1d183f7d2946",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4268,
    "lon": 30.5636
  },
  "pickup_label": "Палац спорту",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 21185,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "44ecbc8b-d62d-4fb4-a941-363492942648",
    "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8914a05d-5df6-4a0a-bc95-de51b9a0fd6b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T13:44:17.958892Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e6b19826-16a4-401b-a262-b3bcc8869ccf/interrupt` → **200**

```json
{
  "command_id": "eaa6c3d6-d179-4ba0-a7d5-8dc481584599",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1f1bd20f-47ed-480b-8abe-1d183f7d2946",
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4268,
      "lon": 30.5636
    },
    "pickup_label": "Палац спорту",
    "dropoff": {
      "lat": 50.3906,
      "lon": 30.4825
    },
    "dropoff_label": "Голосіїв",
    "payment_method": "CASH",
    "payment_state": "CASH_EXPECTED",
    "price_minor": 21185,
    "final_price_minor": null,
    "currency": "UAH",
    "search_phase": "STOPPED",
    "assignment": {
      "id": "44ecbc8b-d62d-4fb4-a941-363492942648",
      "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "8914a05d-5df6-4a0a-bc95-de51b9a0fd6b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T13:44:17.958892Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1f1bd20f-47ed-480b-8abe-1d183f7d2946",
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.41,
      "lon": 30.525
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff": {
      "lat": 50.3906,
      "lon": 30.4825
    },
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "payment_state": null,
    "price_minor": 13074,
    "final_price_minor": null,
    "currency": "UAH",
    "search_phase": "PERSONAL",
```

## Oleh takes the follow-up and finishes; the rider sees both orders

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6f72b5dc-ae29-41b1-a877-0cdb491fdb6e",
    "order_id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
    "expires_at": "2026-10-28T13:44:36.723396Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.41,
      "lon": 30.525
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "price_minor": 13074,
    "currency": "UAH",
    "distance_m": 56
  }
]
```

`POST /api/driver/v1/offers/6f72b5dc-ae29-41b1-a877-0cdb491fdb6e/accept` → **200**

```json
{
  "command_id": "346541e5-958b-4145-b8be-0e8e5434b2c8"
}
```

```json
{
  "id": "efd3666d-198a-45ee-b7b5-3d0053b66eb3",
  "order_id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c36bce2-e69f-4ac6-a57c-b02c2f65c272",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c36bce2-e69f-4ac6-a57c-b02c2f65c272",
  "order_id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
  "assignment_id": "efd3666d-198a-45ee-b7b5-3d0053b66eb3",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "41103493-3a2f-4831-922f-fdd3a592700c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:44:20.346086Z",
  "last_location_at": "2026-10-28T13:44:20.346086Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/41103493-3a2f-4831-922f-fdd3a592700c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:22Z",
    "sequence": 1793195062797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "41103493-3a2f-4831-922f-fdd3a592700c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:44:22.813166Z",
  "last_location_at": "2026-10-28T13:44:22.813166Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0c36bce2-e69f-4ac6-a57c-b02c2f65c272/arrive` → **200**

```json
{
  "command_id": "a516fedd-3161-42b1-9bc4-87d16abae551",
  "expected_version": 0
}
```

```json
{
  "id": "0c36bce2-e69f-4ac6-a57c-b02c2f65c272",
  "order_id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
  "assignment_id": "efd3666d-198a-45ee-b7b5-3d0053b66eb3",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:23.032437Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c36bce2-e69f-4ac6-a57c-b02c2f65c272/start` → **200**

```json
{
  "command_id": "c689a949-1264-46e0-ab50-685de22c4468",
  "expected_version": 1
}
```

```json
{
  "id": "0c36bce2-e69f-4ac6-a57c-b02c2f65c272",
  "order_id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
  "assignment_id": "efd3666d-198a-45ee-b7b5-3d0053b66eb3",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:23.032437Z",
  "started_at": "2026-10-28T13:44:23.250534Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c36bce2-e69f-4ac6-a57c-b02c2f65c272/complete` → **200**

```json
{
  "command_id": "b93350cc-b70a-43fd-94ef-abb0df284eed",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:44:23Z"
}
```

```json
{
  "id": "0c36bce2-e69f-4ac6-a57c-b02c2f65c272",
  "order_id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
  "assignment_id": "efd3666d-198a-45ee-b7b5-3d0053b66eb3",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.41,
    "lon": 30.525
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 13074,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:23.032437Z",
  "started_at": "2026-10-28T13:44:23.250534Z",
  "completed_at": "2026-10-28T13:44:23.47409Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:44:21.716156Z",
    "pickup_label": "Where the previous car stopped",
    "dropoff_label": "Голосіїв",
    "vehicle_class": "STANDARD",
    "price_minor": 13074,
    "final_price_minor": 13074,
    "currency": "UAH",
    "payment_method": "SERVICE",
    "driver": {
      "name": "Олег Коваль",
      "vehicle": {
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "registration_number": "AA0002TX"
      }
    },
    "chat_available": true,
    "cancellation": null,
    "pickup_at": null
  },
  {
    "id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:44:17.958892Z",
    "pickup_label": "Палац спорту",
    "dropoff_label": "Голосіїв",
    "vehicle_class": "STANDARD",
    "price_minor": 21185,
    "final_price_minor": null,
    "currency": "UAH",
    "payment_method": "CASH",
    "driver": {
      "name": "Іван Петренко",
      "vehicle": {
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "registration_number": "AA0001TX"
      }
    },
    "chat_available": true,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/e6b19826-16a4-401b-a262-b3bcc8869ccf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:44:17.959255Z",
      "actor": {
        "type": "CLIENT",
        "id": "1f1bd20f-47ed-480b-8abe-1d183f7d2946",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
        "quote_id": "6b2b0b82-ac7a-4d9a-bd11-20862128dc32",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "481f1c16-d041-4c35-9e08-2c0e80f6df2e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:44:17.96047Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
        "attempt_id": "3299bece-85fb-4ce6-9da5-4a41b82928c4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "481f1c16-d041-4c35-9e08-2c0e80f6df2e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:44:17.962418Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b732fd50-e746-4a3f-af2e-a30d39fabf56",
        "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "481f1c16-d041-4c35-9e08-2c0e80f6df2e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:44:18.396834Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b732fd50-e746-4a3f-af2e-a30d39fabf56",
        "order_id": "e6b19826-16a4-401b-a262-b3bcc8869ccf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "44ecbc8b-d62d-4fb4-a941-363492942648"
      },
      "correlation_id": "22a92d43-15a5-45d8-90f5-9ab773a406a4"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/d095ecfb-dd47-45b7-a2a0-1221eb77b4f5/tip` → **200**

```json
{
  "order_id": "d095ecfb-dd47-45b7-a2a0-1221eb77b4f5",
  "currency": "UAH",
  "trip_cost_minor": 13074,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1400
    },
    {
      "percent": 15,
      "amount_minor": 2000
    },
    {
      "percent": 20,
      "amount_minor": 2700
    },
    {
      "percent": 25,
      "amount_minor": 3300
    }
  ],
  "min_minor": 100,
  "max_minor": 13100,
  "method": null,
  "available_until": "2026-10-29T13:44:23.47409Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/d095ecfb-dd47-45b7-a2a0-1221eb77b4f5/tip` → **409**

```json
{
  "command_id": "3de4e2c1-d672-41b2-939b-cfabb5ccd438",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/d095ecfb-dd47-45b7-a2a0-1221eb77b4f5/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a44686b5-0c86-4c06-bdf7-d69a295a38cd"
}
```

Done: interrupted e6b19826-16a4-401b-a262-b3bcc8869ccf, follow-up d095ecfb-dd47-45b7-a2a0-1221eb77b4f5.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7b1b3c0-127a-456b-98d4-ca73bce550d4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:44:19.488808Z",
  "last_location_at": "2026-10-28T13:44:19.488808Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c7b1b3c0-127a-456b-98d4-ca73bce550d4/close` → **200**

```json
{
  "command_id": "a217d35c-155f-48b8-913a-4261aa624899",
  "expected_version": 1
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "41103493-3a2f-4831-922f-fdd3a592700c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:44:22.813166Z",
  "last_location_at": "2026-10-28T13:44:22.813166Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41103493-3a2f-4831-922f-fdd3a592700c/close` → **200**

```json
{
  "command_id": "20e1f0d1-3392-4ce3-9be3-66189137dcdd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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

# Scenario: legal-acceptance

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "0f7e031a-1344-4247-a790-55c1161eae1a",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NjgsImlhdCI6MTc5MzE5NTA2OCwianRpIjoiNTEwMTliYTgtNGYxMC00MDhkLTk1NTAtYWVmNGE3MjZhNWMzIiwic2lkIjoiMGY3ZTAzMWEtMTM0NC00MjQ3LWE3OTAtNTVjMTE2MWVhZTFhIn0.Xlmf31DCACu4e__eZklq3SHD3OekBxmpZBWrW5vcOZE",
  "access_expires_at": "2026-10-28T13:59:28.885025974Z",
  "refresh_token": "jZ_Y4VI3sGq7HOKOx6t4aMfSGPuUNSu-nOaFHVq4EyI",
  "refresh_expires_at": "2026-10-29T01:44:28.884632533Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "cc804006-7f2d-41fa-849d-9c3a573ea93b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:44:29Z"
}
```

```json
{
  "id": "4a730d75-cc66-4b32-a10e-183fee3ade3c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:44:29Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4a730d75-cc66-4b32-a10e-183fee3ade3c/publish` → **200**

```json
{
  "command_id": "5dee967b-142d-4f52-bdec-98cd5af65abf",
  "expected_version": 0
}
```

```json
{
  "id": "4a730d75-cc66-4b32-a10e-183fee3ade3c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:44:29.334233Z",
  "published_at": "2026-10-28T13:44:29.334233Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "4a730d75-cc66-4b32-a10e-183fee3ade3c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T13:44:29.334233Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635367451",
  "device_ref": "sandbox-19026"
}
```

```json
{
  "challenge_id": "28a02b81-f6b4-4841-b621-e51b33865cd1",
  "expires_at": "2026-10-28T13:49:29.759223032Z",
  "resend_available_at": "2026-10-28T13:44:30.759223032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635367451` → **200**

```json
{
  "phone": "+380635367451",
  "audience": "CLIENT",
  "code": "082694",
  "sent_at": "2026-10-28T13:44:29.761049139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28a02b81-f6b4-4841-b621-e51b33865cd1",
  "code": "082694",
  "device_ref": "sandbox-19026"
}
```

```json
{
  "session_id": "334e2cb1-801e-43ce-9a4d-ac6a5d50821e",
  "subject": {
    "type": "CLIENT",
    "id": "dc5aea6b-f944-4794-809d-86032e3caf8b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzVhZWE2Yi1mOTQ0LTQ3OTQtODA5ZC04NjAzMmUzY2FmOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTY5LCJpYXQiOjE3OTMxOTUwNjksImp0aSI6ImFhZDE1ZGI0LTUxMmEtNGFmMC1hNjFlLTc5Zjk4MjhiYWRkMCIsInNpZCI6IjMzNGUyY2IxLTgwMWUtNDNjZS05YTRkLWFjNmE1ZDUwODIxZSJ9.PvHDQaVoMFQ7bP6asfjtnnhK0xK1yv-19KSAFiEw-qc",
  "access_expires_at": "2026-10-28T13:59:29.991195154Z",
  "refresh_token": "9F-uN4NL7hJ-ei1mj621SHtIfpr6DdcvpTwDD1O8I2Y",
  "refresh_expires_at": "2026-11-27T13:44:29.990805054Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "4a730d75-cc66-4b32-a10e-183fee3ade3c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T13:44:29.334233Z",
      "languages": [
        "pl",
        "uk"
      ]
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7014d5bb-bae0-4a7f-a258-a52e80cf56b7",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "307aa184-b749-4aea-9b3b-fd54442829fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:30.416814Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "e2a0064f-bfc7-4c69-97a6-e8dac208eb96",
  "quote_id": "307aa184-b749-4aea-9b3b-fd54442829fe",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Acceptance required",
  "type": "https://errors.blizz.taxi/acceptance-required",
  "code": "ACCEPTANCE_REQUIRED",
  "correlation_id": "2ff61319-5ef0-4884-b8be-51549b7f478c"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "3a78aac2-7293-438b-b8a7-5bf603cf659a",
  "version_id": "4a730d75-cc66-4b32-a10e-183fee3ade3c",
  "language": "uk"
}
```

```json
{
  "version_id": "4a730d75-cc66-4b32-a10e-183fee3ade3c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T13:44:30.862288Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a259131d-b690-4261-bf1a-c03d0c9746de",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  }
}
```

```json
{
  "id": "e46a5407-0d64-4eac-9311-63da8c826d85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:31.075009Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "affb9969-0af7-4ec9-9ce3-fb5bffd02a5d",
  "quote_id": "e46a5407-0d64-4eac-9311-63da8c826d85",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6520
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH"
}
```

```json
{
  "id": "fb3883c6-0284-41bc-abeb-3511bdc64653",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc5aea6b-f944-4794-809d-86032e3caf8b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:44:31.293178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fb3883c6-0284-41bc-abeb-3511bdc64653` → **200**

```json
{
  "id": "fb3883c6-0284-41bc-abeb-3511bdc64653",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc5aea6b-f944-4794-809d-86032e3caf8b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:44:31.293178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fb3883c6-0284-41bc-abeb-3511bdc64653/cancel` → **200**

```json
{
  "command_id": "1259453a-b481-46f9-8d33-2fa227e11d7e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fb3883c6-0284-41bc-abeb-3511bdc64653",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dc5aea6b-f944-4794-809d-86032e3caf8b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4547,
    "lon": 30.5238
  },
  "pickup_label": "Хрещатик, 22",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.652
  },
  "dropoff_label": "Позняки",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 30533,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T13:44:31.293178Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/4a730d75-cc66-4b32-a10e-183fee3ade3c` → **409**

```json
{
  "command_id": "dfebd0d6-ccac-4a28-b2f5-e6f3b81afe1a",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:44:31Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/4a730d75-cc66-4b32-a10e-183fee3ade3c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a0b40e0b-c553-4e0d-8493-afd9d1ff8d30"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "927e6ff5-b02d-46e7-b546-0ac5df21031e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:44:32Z"
}
```

```json
{
  "id": "1cdbd3f4-5c0f-4acf-8ece-2c39472f7578",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:44:32Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1cdbd3f4-5c0f-4acf-8ece-2c39472f7578/publish` → **200**

```json
{
  "command_id": "a5464f76-033f-4c8f-85ca-a54ae9ed8862",
  "expected_version": 0
}
```

```json
{
  "id": "1cdbd3f4-5c0f-4acf-8ece-2c39472f7578",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:44:32.403663Z",
  "published_at": "2026-10-28T13:44:32.403663Z",
  "version": 1
}
```

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-387"
}
```

```json
{
  "challenge_id": "6c5739fa-ab70-4eb5-b884-96676ed3be58",
  "expires_at": "2026-10-28T13:49:32.618765334Z",
  "resend_available_at": "2026-10-28T13:44:33.618765334Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "607469",
  "sent_at": "2026-10-28T13:44:32.620412052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c5739fa-ab70-4eb5-b884-96676ed3be58",
  "code": "607469",
  "device_ref": "sandbox-387"
}
```

```json
{
  "session_id": "80649afe-cd16-4a5e-b590-a67d1eab11b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTk3MiwiaWF0IjoxNzkzMTk1MDcyLCJqdGkiOiJlYmY1OTgwYS02NTQ4LTQ2OTUtYTRlNS0zMzg5MTMzMmMxYmMiLCJzaWQiOiI4MDY0OWFmZS1jZDE2LTRhNWUtYjU5MC1hNjdkMWVhYjExYjUifQ.dJ6US33N248v2-vX0SbIgegxr9TCdcBYYDapzpAP9ek",
  "access_expires_at": "2026-10-28T13:59:32.842406475Z",
  "refresh_token": "sfBV6N4tqaP6SVaqGAWOSiiYWKrmgOSv0sU1kOuJL2I",
  "refresh_expires_at": "2026-11-27T13:44:32.842034166Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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
  "command_id": "2426af5d-d026-41ca-81cc-b7c5983ceea3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:33Z",
    "sequence": 1793195073255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "77b6d7fe-2e5c-486a-a959-acda2bac06d1",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:44:33.26985Z",
  "last_location_at": "2026-10-28T13:44:33.26985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670371535",
  "device_ref": "sandbox-4836"
}
```

```json
{
  "challenge_id": "2ee94d28-bc1c-445d-b047-66b5c5e0c008",
  "expires_at": "2026-10-28T13:49:33.480341903Z",
  "resend_available_at": "2026-10-28T13:44:34.480341903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670371535` → **200**

```json
{
  "phone": "+380670371535",
  "audience": "CLIENT",
  "code": "447324",
  "sent_at": "2026-10-28T13:44:33.482147249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ee94d28-bc1c-445d-b047-66b5c5e0c008",
  "code": "447324",
  "device_ref": "sandbox-4836"
}
```

```json
{
  "session_id": "b5cda30a-49e3-448a-81f3-40e660eadbdf",
  "subject": {
    "type": "CLIENT",
    "id": "5eb53066-c0ca-4e62-a5aa-00428735a807"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZWI1MzA2Ni1jMGNhLTRlNjItYTVhYS0wMDQyODczNWE4MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1OTczLCJpYXQiOjE3OTMxOTUwNzMsImp0aSI6IjY5MmVlYjRmLTVkY2ItNDhiZC1iMDIzLWRhOTFlN2Y3ZWM4MCIsInNpZCI6ImI1Y2RhMzBhLTQ5ZTMtNDQ4YS04MWYzLTQwZTY2MGVhZGJkZiJ9.qaJPfKdzOhAKxYEpa_qnrglbUt_t2UERC1q6KHD_Ds4",
  "access_expires_at": "2026-10-28T13:59:33.717518826Z",
  "refresh_token": "vbAPda91ruPeLvEGQvdWJFz0dtt2ezbOgMRFsfsBkfU",
  "refresh_expires_at": "2026-11-27T13:44:33.717109542Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "54332671-32c1-43f0-87af-bc5655fb795a",
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
  "id": "67bdb242-2dc7-40b6-86d3-ff29260c1195",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:33.928271Z",
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
  "command_id": "2ed10c6b-13be-4b5f-a3d4-99a74341d775",
  "quote_id": "67bdb242-2dc7-40b6-86d3-ff29260c1195",
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
  "payment_method": "CASH",
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380677949151"
  }
}
```

```json
{
  "id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "created_at": "2026-10-28T13:44:34.151443Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f8b3c961-2bcd-4080-95c7-012172d14df7",
    "order_id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
    "expires_at": "2026-10-28T13:44:49.154053Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/f8b3c961-2bcd-4080-95c7-012172d14df7/accept` → **200**

```json
{
  "command_id": "afd7d2a2-7dc1-4e08-a1fd-1e4cd2e2a2eb"
}
```

```json
{
  "id": "ce3b0b38-f5ca-4c85-9509-ddba024fae37",
  "order_id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e586ec78-5153-498d-b6e1-068f8ffe2dcf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e586ec78-5153-498d-b6e1-068f8ffe2dcf",
  "order_id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
  "assignment_id": "ce3b0b38-f5ca-4c85-9509-ddba024fae37",
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
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380677949151"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4adf3edd-1071-4038-8405-c996e5bfde07",
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
  "id": "e05969be-77e6-4e18-bb1d-e28109097a88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:35.023163Z",
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
  "command_id": "0f2c2456-9770-4d34-ab31-543fc4b4aa87",
  "quote_id": "e05969be-77e6-4e18-bb1d-e28109097a88",
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
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "id": "23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:44:35.24834Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "22d2c7d5-649c-4089-bbc0-81b039c2b11b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T16:44:35Z"
}
```

```json
{
  "id": "133b582a-f484-4f22-ba7d-fa27df416d11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:35.477232Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:44:35Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dc537fea-d9f6-44e3-8310-b22d8be0ec42",
  "quote_id": "133b582a-f484-4f22-ba7d-fa27df416d11",
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
  "payment_method": "CASH",
  "recipient": null,
  "pickup_at": "2026-10-28T16:44:35Z"
}
```

```json
{
  "id": "99ffd38a-ee98-4078-b838-b9248f72268a",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-28T13:44:35.69987Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:44:35Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efc54c60-8fa8-419c-bfbf-349737bd4aa6",
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
  "id": "389a1536-3e38-49d9-8998-803740b675b1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:35.933100Z",
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

`POST /api/rider/v1/orders` → **409**

```json
{
  "command_id": "39e3de76-d027-4ead-b918-22f5da8d0411",
  "quote_id": "389a1536-3e38-49d9-8998-803740b675b1",
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
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 409,
  "title": "Active order limit",
  "type": "https://errors.blizz.taxi/active-order-limit",
  "code": "ACTIVE_ORDER_LIMIT",
  "correlation_id": "cd5f5be3-ecb8-4673-99d2-0fb8479d853d"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "99ffd38a-ee98-4078-b838-b9248f72268a",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
      "price_minor": 13517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": null,
      "assignment": null,
      "created_at": "2026-10-28T13:44:35.69987Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T16:44:35Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T13:44:35.24834Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:44:35.24834Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/b69e93d6-07fe-4d43-883a-78fd42bb841a` → **200**

```json
{
  "id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "search_phase": "STOPPED",
  "assignment": {
    "id": "ce3b0b38-f5ca-4c85-9509-ddba024fae37",
    "order_id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e586ec78-5153-498d-b6e1-068f8ffe2dcf",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:44:34.151443Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": {
    "seconds": 40,
    "distance_metres": 275,
    "source": "STRAIGHT_LINE",
    "location_at": "2026-10-28T13:44:33.26985Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/b69e93d6-07fe-4d43-883a-78fd42bb841a/cancel` → **200**

```json
{
  "command_id": "763aee14-8022-4f6e-801e-9b3144fdcad7",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "search_phase": "STOPPED",
  "assignment": {
    "id": "ce3b0b38-f5ca-4c85-9509-ddba024fae37",
    "order_id": "b69e93d6-07fe-4d43-883a-78fd42bb841a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e586ec78-5153-498d-b6e1-068f8ffe2dcf",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:44:34.151443Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c` → **200**

```json
{
  "id": "23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:44:35.24834Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c/cancel` → **200**

```json
{
  "command_id": "c8d73b20-6b75-46eb-b7cc-8d1500ca63f2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T13:44:35.24834Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/99ffd38a-ee98-4078-b838-b9248f72268a` → **200**

```json
{
  "id": "99ffd38a-ee98-4078-b838-b9248f72268a",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-28T13:44:35.69987Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:44:35Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/99ffd38a-ee98-4078-b838-b9248f72268a/cancel` → **200**

```json
{
  "command_id": "7c4d6e45-0f3b-46a0-a47c-df6df75fc514",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "99ffd38a-ee98-4078-b838-b9248f72268a",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5eb53066-c0ca-4e62-a5aa-00428735a807",
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
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-28T13:44:35.69987Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-28T16:44:35Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "77b6d7fe-2e5c-486a-a959-acda2bac06d1",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T13:44:33.26985Z",
  "last_location_at": "2026-10-28T13:44:33.26985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/77b6d7fe-2e5c-486a-a959-acda2bac06d1/close` → **200**

```json
{
  "command_id": "3f2047d4-c0f8-4645-a0ec-f460b03ee477",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
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

Done: orders b69e93d6-07fe-4d43-883a-78fd42bb841a, 23f9fbbd-ba80-4d7d-8991-ba7bb8ccd94c, 99ffd38a-ee98-4078-b838-b9248f72268a.

# Scenario: operator-bonus

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "767db437-342c-4d7c-8cc5-5292bda030ec",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NzgsImlhdCI6MTc5MzE5NTA3OCwianRpIjoiZWU1NzBlYTYtZDY5OS00NDUzLWJhZWQtNWU3YmRkZjE3MTJjIiwic2lkIjoiNzY3ZGI0MzctMzQyYy00ZDdjLThjYzUtNTI5MmJkYTAzMGVjIn0.ctR3yIAT8_0Kr7hdViWLiz5_3fWkmylVMkf_c0lR9sk",
  "access_expires_at": "2026-10-28T13:59:38.838352789Z",
  "refresh_token": "AeCRWMENgv3fwmtdY0qMlqFwzQWtlpCFg1QYP4SMwQU",
  "refresh_expires_at": "2026-10-29T01:44:38.837954661Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d9fcb85a-1974-4c9d-b010-0bb5c14eac1f",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5NzksImlhdCI6MTc5MzE5NTA3OSwianRpIjoiYzgwMTEyMmQtNmQ2OC00YTAyLTk2YjItNWJjZTU3MWUyNTk1Iiwic2lkIjoiZDlmY2I4NWEtMTk3NC00YzlkLWIwMTAtMGJiNWMxNGVhYzFmIn0.do7cVMY3Ao6ab_zas-nQNCNgktWW1duZDx4NndDHLp8",
  "access_expires_at": "2026-10-28T13:59:39.299247689Z",
  "refresh_token": "UyIAyGMQjlC7Ppj_VDLwWUUL0gf3WzEgbtJhbI20XYE",
  "refresh_expires_at": "2026-10-29T01:44:39.298828264Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5974"
}
```

```json
{
  "challenge_id": "fad38cf9-f339-4c01-b748-a807fd055a08",
  "expires_at": "2026-10-28T13:49:39.501180462Z",
  "resend_available_at": "2026-10-28T13:44:40.501180462Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "278515",
  "sent_at": "2026-10-28T13:44:39.502932583Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fad38cf9-f339-4c01-b748-a807fd055a08",
  "code": "278515",
  "device_ref": "sandbox-5974"
}
```

```json
{
  "session_id": "f34d6394-ab85-424a-ac23-3d552342fa9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTk3OSwiaWF0IjoxNzkzMTk1MDc5LCJqdGkiOiJkMmEyYTg4Yi1iNDI5LTRiODUtYWQ1NS00MTcyZTgxNjIwY2MiLCJzaWQiOiJmMzRkNjM5NC1hYjg1LTQyNGEtYWMyMy0zZDU1MjM0MmZhOWEifQ.3KDOQBDqXwPtOdA3TR8ShlJudCN1OGKna30JOxGLdmE",
  "access_expires_at": "2026-10-28T13:59:39.731915576Z",
  "refresh_token": "ON_8wVpjJY2grw7iQkV1T28OUBbrSkPr0afzTzBaISA",
  "refresh_expires_at": "2026-11-27T13:44:39.731527474Z",
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
  "command_id": "c12add3a-e718-45db-aa66-e3d3edb90f6a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:40Z",
    "sequence": 1793195080150
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcf936d3-f005-4fd6-899d-eed1d85197ac",
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
  "last_heartbeat_at": "2026-10-28T13:44:40.165636Z",
  "last_location_at": "2026-10-28T13:44:40.165636Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Admin sets operator bonus m=2, g=3

`GET /api/admin/v1/settings/operator-bonuses` → **200**

```json
{
  "version": 0,
  "settings": {
    "m": 1,
    "g": 10,
    "count_cancellations": true,
    "reset_day": 1,
    "time_rules": []
  },
  "effective_at": "2000-01-01T00:00:00Z",
  "changed_by": null,
  "reason": "Initial operator bonus settings"
}
```

`POST /api/admin/v1/settings/operator-bonuses` → **200**

```json
{
  "command_id": "bc39b473-10a0-47b7-8dd6-ec28ea0d4b72",
  "expected_version": 0,
  "settings": {
    "m": 2,
    "g": 3,
    "count_cancellations": true,
    "reset_day": 28,
    "time_rules": []
  },
  "reason": "Sandbox operator bonus scenario"
}
```

```json
{
  "version": 1,
  "settings": {
    "m": 2,
    "g": 3,
    "count_cancellations": true,
    "reset_day": 28,
    "time_rules": []
  },
  "effective_at": "2026-10-28T13:44:40.601647Z",
  "changed_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T13:42:58.236653Z",
  "last_entries": [
    {
      "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:42:58.236653Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2160c4d9-6cdc-4b03-ab7b-336df8e3bd8b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "4b43b658-7ea1-41f4-95f6-5c03bdeca2bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:41.028502Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "e187b634-7bb0-4ef3-b80a-265904377745",
  "quote_id": "4b43b658-7ea1-41f4-95f6-5c03bdeca2bf",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114879"
  }
}
```

```json
{
  "id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:44:41.24791Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114879"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "29ed66b4-b111-42b3-b4a4-076c0d96ce4a",
    "order_id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
    "expires_at": "2026-10-28T13:44:56.250872Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Bonus pickup",
    "dropoff_label": "Bonus dropoff",
    "payment_method": "CASH",
    "price_minor": 29967,
    "currency": "UAH",
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/29ed66b4-b111-42b3-b4a4-076c0d96ce4a/accept` → **200**

```json
{
  "command_id": "1f4ed220-8c53-4501-a225-33a0e5d4da16"
}
```

```json
{
  "id": "4c8fbaf7-e495-4d1f-82ee-2130d06e26d9",
  "order_id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "56e659b5-c19b-4707-ac69-73eb61c697b5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56e659b5-c19b-4707-ac69-73eb61c697b5",
  "order_id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
  "assignment_id": "4c8fbaf7-e495-4d1f-82ee-2130d06e26d9",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114879"
  }
}
```

`POST /api/driver/v1/work-sessions/fcf936d3-f005-4fd6-899d-eed1d85197ac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:44:42Z",
    "sequence": 1793195082855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcf936d3-f005-4fd6-899d-eed1d85197ac",
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
  "last_heartbeat_at": "2026-10-28T13:44:42.100725Z",
  "last_location_at": "2026-10-28T13:44:42.100725Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/56e659b5-c19b-4707-ac69-73eb61c697b5/arrive` → **200**

```json
{
  "command_id": "82677396-259a-4b40-8f30-320ed4cde429",
  "expected_version": 0
}
```

```json
{
  "id": "56e659b5-c19b-4707-ac69-73eb61c697b5",
  "order_id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
  "assignment_id": "4c8fbaf7-e495-4d1f-82ee-2130d06e26d9",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:42.316893Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114879"
  }
}
```

`POST /api/driver/v1/trips/56e659b5-c19b-4707-ac69-73eb61c697b5/start` → **200**

```json
{
  "command_id": "5676886a-c110-4bca-a761-0c83d492d281",
  "expected_version": 1
}
```

```json
{
  "id": "56e659b5-c19b-4707-ac69-73eb61c697b5",
  "order_id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
  "assignment_id": "4c8fbaf7-e495-4d1f-82ee-2130d06e26d9",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:42.316893Z",
  "started_at": "2026-10-28T13:44:42.536362Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114879"
  }
}
```

`POST /api/driver/v1/trips/56e659b5-c19b-4707-ac69-73eb61c697b5/complete` → **200**

```json
{
  "command_id": "ab2c4d89-b720-45a9-b489-48ad3a59a971",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:44:42Z",
  "cash_received": true
}
```

```json
{
  "id": "56e659b5-c19b-4707-ac69-73eb61c697b5",
  "order_id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
  "assignment_id": "4c8fbaf7-e495-4d1f-82ee-2130d06e26d9",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:44:42.316893Z",
  "started_at": "2026-10-28T13:44:42.536362Z",
  "completed_at": "2026-10-28T13:44:42.758562Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d0300971-3df5-4956-8aa9-e699feffbb70",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "7b0de04e-ec06-456b-a8ac-684986381ca8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:42.980342Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "c2121eda-e0d2-4c44-8838-56b6de6e6a8a",
  "quote_id": "7b0de04e-ec06-456b-a8ac-684986381ca8",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118517"
  }
}
```

```json
{
  "id": "e404c490-3d91-48c3-b030-aefd8aaffb85",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:44:43.200133Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118517"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e404c490-3d91-48c3-b030-aefd8aaffb85` → **200**

```json
{
  "id": "e404c490-3d91-48c3-b030-aefd8aaffb85",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:44:43.200133Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118517"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e404c490-3d91-48c3-b030-aefd8aaffb85/cancel` → **200**

```json
{
  "command_id": "cb61e98a-d39f-4d34-8814-0e8552c75c7a",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "e404c490-3d91-48c3-b030-aefd8aaffb85",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "OPERATOR_ERROR",
  "version": 3,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Bonus pickup",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Bonus dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T13:44:43.200133Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118517"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Operator reads own bonus account

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T13:42:58.236653Z",
  "last_entries": [
    {
      "order_id": "e404c490-3d91-48c3-b030-aefd8aaffb85",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T13:44:43.662799Z"
    },
    {
      "order_id": "cb633d78-cb56-4240-8793-e926ba7b1c3f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T13:44:42.76193Z"
    },
    {
      "order_id": "f03b279b-76da-424e-b679-3f123cd551c2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:42:58.236653Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcf936d3-f005-4fd6-899d-eed1d85197ac",
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
  "last_heartbeat_at": "2026-10-28T13:44:42.100725Z",
  "last_location_at": "2026-10-28T13:44:42.100725Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fcf936d3-f005-4fd6-899d-eed1d85197ac/close` → **200**

```json
{
  "command_id": "734c97b9-d237-4eca-a040-62195a1e5dc6",
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

Done: operator bonus for fulfilled cb633d78-cb56-4240-8793-e926ba7b1c3f and operator-fault cancellation e404c490-3d91-48c3-b030-aefd8aaffb85.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675292523",
  "device_ref": "sandbox-5255"
}
```

```json
{
  "challenge_id": "796e88c2-d63d-4341-8374-195b4b2163a3",
  "expires_at": "2026-10-28T13:49:46.558492819Z",
  "resend_available_at": "2026-10-28T13:44:47.558492819Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675292523` → **200**

```json
{
  "phone": "+380675292523",
  "audience": "CLIENT",
  "code": "468167",
  "sent_at": "2026-10-28T13:44:46.560737281Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671815076",
  "device_ref": "sandbox-21143",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2d95f4a6-6181-41b9-906f-2428555336cd",
  "expires_at": "2026-10-28T13:49:46.788248602Z",
  "resend_available_at": "2026-10-28T13:44:47.788248602Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671815076` → **200**

```json
{
  "phone": "+380671815076",
  "audience": "CLIENT",
  "code": "569894",
  "sent_at": "2026-10-28T13:44:46.790015787Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678420000",
  "device_ref": "sandbox-4255"
}
```

```json
{
  "challenge_id": "0e113c59-9c9d-4a76-8ec3-6712888d0b58",
  "expires_at": "2026-10-28T13:49:47.01625089Z",
  "resend_available_at": "2026-10-28T13:44:48.01625089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678420000` → **200**

```json
{
  "phone": "+380678420000",
  "audience": "CLIENT",
  "code": "001463",
  "sent_at": "2026-10-28T13:44:47.018372542Z",
  "channel": "VOICE"
}
```

## What support sees: the attempts, never the code

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7500eb6e-316f-4ef9-b164-ea46788361ac",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5ODcsImlhdCI6MTc5MzE5NTA4NywianRpIjoiMTExOTAwZmItZTJkOC00M2RiLTljMDYtZGM0NmIzZjc5OGYyIiwic2lkIjoiNzUwMGViNmUtMzE2Zi00ZWY5LWIxNjQtZWE0Njc4ODM2MWFjIn0.uRbVrchcyuTA-QVRwfgwuICjp05INvlDWYZwObhijPE",
  "access_expires_at": "2026-10-28T13:59:47.504756561Z",
  "refresh_token": "z85ohmnEzsOo3pVy27g0pdiIwnMdGKfuUM-RhMl2i0w",
  "refresh_expires_at": "2026-10-29T01:44:47.504315779Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678420000` → **200**

```json
{
  "deliveries": [
    {
      "id": "9fff905b-9f92-4e73-af40-7315280a5be7",
      "challenge_id": "0e113c59-9c9d-4a76-8ec3-6712888d0b58",
      "phone": "+380678420000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d741570d-efc4-43a5-a5d3-46e53dc5a210",
      "error": null,
      "attempted_at": "2026-10-28T13:44:47.01859Z"
    },
    {
      "id": "7c83220e-ee4a-45a2-b450-e114c4e1274c",
      "challenge_id": "0e113c59-9c9d-4a76-8ec3-6712888d0b58",
      "phone": "+380678420000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T13:44:47.017982Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678420000` → **200**

```json
{
  "phone": "+380678420000",
  "audience": "CLIENT",
  "code": "001463",
  "sent_at": "2026-10-28T13:44:47.018372542Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671815076` → **200**

```json
{
  "deliveries": [
    {
      "id": "0c2ef8af-7a9a-4418-b386-9f78229f9c24",
      "challenge_id": "2d95f4a6-6181-41b9-906f-2428555336cd",
      "phone": "+380671815076",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4c50efc9-2259-4343-b352-25c6d7fb0a16",
      "error": null,
      "attempted_at": "2026-10-28T13:44:46.790221Z"
    }
  ]
}
```

Done: SMS to +380675292523, a call to +380671815076, SMS then a call to +380678420000.

# Scenario: outgoing-call

## The admin gives the operator an internal number

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ed60e2e2-b344-46c8-a066-4f70d1e46b41",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5ODgsImlhdCI6MTc5MzE5NTA4OCwianRpIjoiN2Y1NzRlNmUtYTk1NS00MGUyLWI4ZTYtMTg3YWQwMTViNTg1Iiwic2lkIjoiZWQ2MGUyZTItYjM0NC00NmM4LWEwNjYtNGY3MGQxZTQ2YjQxIn0.xhvQYpyJsVZHeZqkN8RdBa_ijlkfHf24pc46TqLiCc0",
  "access_expires_at": "2026-10-28T13:59:48.428636998Z",
  "refresh_token": "5D9W9aEaS_hkHGI6wubT2ofxtGBGjKcbtRRZgpvlNaI",
  "refresh_expires_at": "2026-10-29T01:44:48.42819874Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "c9d89830-c6b2-412b-9d23-affc7d661934",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU5ODgsImlhdCI6MTc5MzE5NTA4OCwianRpIjoiMmY5OWFhNGEtN2U2NS00OGZjLTg5MDktNjVkNDI1Yjc2ODk2Iiwic2lkIjoiYzlkODk4MzAtYzZiMi00MTJiLTlkMjMtYWZmYzdkNjYxOTM0In0.g8ziLuJDo8cgf-KcIo-oViweZ5X41kHTzhWRLmf9Znc",
  "access_expires_at": "2026-10-28T13:59:48.895512956Z",
  "refresh_token": "KLTkQHqXDEp6oElcy0RCkRviS8CWwg8LcmRHOPOXBp4",
  "refresh_expires_at": "2026-10-29T01:44:48.895110391Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
    "login": "admin",
    "profile": {
      "first_name": "Super",
      "last_name": "Admin",
      "contacts": {
        "phone": null,
        "email": null,
        "telegram": null
      },
      "role": "SUPER_ADMIN",
      "permissions": [],
      "all_cities": true,
      "city_ids": []
    },
    "state": "ACTIVE",
    "password_change_required": false,
    "version": 0
  },
  "effective_permissions": [
    "orders.create",
    "orders.cancel",
    "orders.reassign",
    "orders.interrupt",
    "orders.view",
    "calls.answer",
    "calls.listen",
    "calls.supervise",
    "driver.review",
    "drivers.risk",
    "geo.manage",
    "pricing.manage",
    "finance.manage",
    "wallets.manage",
    "payments.retry",
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "settings.manage",
    "integrations.manage",
    "audit.view",
    "reports.view",
    "legal.manage"
  ]
}
```

`GET /api/admin/v1/staff-extensions` → **200**

```json
{
  "extensions": []
}
```

`POST /api/admin/v1/staff-extensions/54476750-8d4c-4def-bcc5-b00c809a62c0` → **200**

```json
{
  "command_id": "5cd2efa5-82b7-47b7-8cc3-9c09037d5e04",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "93695046-2ce7-488a-b15e-6d71a8922c93",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:44:49.74813Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:44:49.74813Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f9ce8131-248b-4954-943e-57383bfb3dd7",
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
  "id": "9c163d18-b06e-4a45-ba56-d96606dff043",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:49:50.172716Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "e68e22b9-41ce-4696-8859-e4f03c3a1acd",
  "quote_id": "9c163d18-b06e-4a45-ba56-d96606dff043",
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
  "payment_method": "CASH",
  "caller": {
    "name": "Caller",
    "phone": "+380678169598"
  }
}
```

```json
{
  "id": "8e191be7-e878-4df6-a495-d27be56944ef",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:44:50.396075Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678169598"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/8e191be7-e878-4df6-a495-d27be56944ef/calls` → **201**

```json
{
  "command_id": "32fc7d15-2f60-4c9e-88f2-a0c070dd77d9",
  "to": "CALLER"
}
```

```json
{
  "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "order_ids": [
    "8e191be7-e878-4df6-a495-d27be56944ef"
  ],
  "started_at": "2026-10-28T13:44:50.641602Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/8e191be7-e878-4df6-a495-d27be56944ef/calls` → **201**

```json
{
  "command_id": "32fc7d15-2f60-4c9e-88f2-a0c070dd77d9",
  "to": "CALLER"
}
```

```json
{
  "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "order_ids": [
    "8e191be7-e878-4df6-a495-d27be56944ef"
  ],
  "started_at": "2026-10-28T13:44:50.641602Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678169598",
    "at": "2026-10-28T13:44:50.643300687Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.30555",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=8e191be7-e878-4df6-a495-d27be56944ef` → **200**

```json
{
  "calls": [
    {
      "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [
        "8e191be7-e878-4df6-a495-d27be56944ef"
      ],
      "started_at": "2026-10-28T13:44:50.641602Z",
      "answered_at": "2026-10-28T13:44:51.136841Z",
      "ended_at": "2026-10-28T13:44:51.15375Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8e191be7-e878-4df6-a495-d27be56944ef` → **200**

```json
{
  "calls": [
    {
      "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [
        "8e191be7-e878-4df6-a495-d27be56944ef"
      ],
      "started_at": "2026-10-28T13:44:50.641602Z",
      "answered_at": "2026-10-28T13:44:51.136841Z",
      "ended_at": "2026-10-28T13:44:51.15375Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8e191be7-e878-4df6-a495-d27be56944ef` → **200**

```json
{
  "calls": [
    {
      "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [
        "8e191be7-e878-4df6-a495-d27be56944ef"
      ],
      "started_at": "2026-10-28T13:44:50.641602Z",
      "answered_at": "2026-10-28T13:44:51.136841Z",
      "ended_at": "2026-10-28T13:44:51.15375Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8e191be7-e878-4df6-a495-d27be56944ef` → **200**

```json
{
  "calls": [
    {
      "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [
        "8e191be7-e878-4df6-a495-d27be56944ef"
      ],
      "started_at": "2026-10-28T13:44:50.641602Z",
      "answered_at": "2026-10-28T13:44:51.136841Z",
      "ended_at": "2026-10-28T13:44:51.15375Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8e191be7-e878-4df6-a495-d27be56944ef` → **200**

```json
{
  "calls": [
    {
      "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [
        "8e191be7-e878-4df6-a495-d27be56944ef"
      ],
      "started_at": "2026-10-28T13:44:50.641602Z",
      "answered_at": "2026-10-28T13:44:51.136841Z",
      "ended_at": "2026-10-28T13:44:51.15375Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8e191be7-e878-4df6-a495-d27be56944ef` → **200**

```json
{
  "calls": [
    {
      "id": "65a3e557-4a85-4f92-82b7-142e1e2d9e6b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "order_ids": [
        "8e191be7-e878-4df6-a495-d27be56944ef"
      ],
      "started_at": "2026-10-28T13:44:50.641602Z",
      "answered_at": "2026-10-28T13:44:51.136841Z",
      "ended_at": "2026-10-28T13:44:51.15375Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:45:00.778726Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/8e191be7-e878-4df6-a495-d27be56944ef` → **200**

```json
{
  "id": "8e191be7-e878-4df6-a495-d27be56944ef",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T13:44:50.396075Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678169598"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8e191be7-e878-4df6-a495-d27be56944ef/cancel` → **200**

```json
{
  "command_id": "7c99ca71-d53e-48c8-a285-ecbcdf02adcd",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8e191be7-e878-4df6-a495-d27be56944ef",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "PHONE",
  "payer_client_id": null,
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T13:44:50.396075Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678169598"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "6a2018f8-6948-4f47-8914-49ebcad594dd",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T13:45:02.947159Z",
  "extension": "101"
}
```

Done: outgoing call 65a3e557-4a85-4f92-82b7-142e1e2d9e6b from order 8e191be7-e878-4df6-a495-d27be56944ef, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638139521",
  "device_ref": "sandbox-1770"
}
```

```json
{
  "challenge_id": "ada2caa8-f912-4d68-b494-4850687be802",
  "expires_at": "2026-10-28T13:50:03.164350885Z",
  "resend_available_at": "2026-10-28T13:45:04.164350885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638139521` → **200**

```json
{
  "phone": "+380638139521",
  "audience": "CLIENT",
  "code": "609321",
  "sent_at": "2026-10-28T13:45:03.166971245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ada2caa8-f912-4d68-b494-4850687be802",
  "code": "609321",
  "device_ref": "sandbox-1770"
}
```

```json
{
  "session_id": "e56d33dc-2c56-4e8d-8cd5-7d850ade44fb",
  "subject": {
    "type": "CLIENT",
    "id": "cca8988e-ae03-413c-a279-06a1899200f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2E4OTg4ZS1hZTAzLTQxM2MtYTI3OS0wNmExODk5MjAwZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDAzLCJpYXQiOjE3OTMxOTUxMDMsImp0aSI6Ijc5ZWE5M2NiLTdiYzktNGIyNS05Njc1LTVmMjYxZDc1NWY4ZSIsInNpZCI6ImU1NmQzM2RjLTJjNTYtNGU4ZC04Y2Q1LTdkODUwYWRlNDRmYiJ9.oTFDmNSAnoUgIQBj5IxBdLvf8Yy7zZeB5X3tFeuOo1s",
  "access_expires_at": "2026-10-28T14:00:03.397276367Z",
  "refresh_token": "1O0Y2bmVjpTt4C3GjVrdRsJ9_J5wRxeARMXA11RFbT8",
  "refresh_expires_at": "2026-11-27T13:45:03.396598664Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cca8988e-ae03-413c-a279-06a1899200f5",
  "session_id": "e56d33dc-2c56-4e8d-8cd5-7d850ade44fb",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638139521",
  "device_ref": "sandbox-26751"
}
```

```json
{
  "challenge_id": "3e0d6ea9-d0c2-468e-9142-a6a28751b037",
  "expires_at": "2026-10-28T13:50:05.80151391Z",
  "resend_available_at": "2026-10-28T13:45:06.80151391Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638139521` → **200**

```json
{
  "phone": "+380638139521",
  "audience": "CLIENT",
  "code": "777675",
  "sent_at": "2026-10-28T13:45:05.803159636Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e0d6ea9-d0c2-468e-9142-a6a28751b037",
  "code": "777675",
  "device_ref": "sandbox-26751"
}
```

```json
{
  "session_id": "35123839-3b46-4679-8a5f-b102d2d16f0d",
  "subject": {
    "type": "CLIENT",
    "id": "cca8988e-ae03-413c-a279-06a1899200f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2E4OTg4ZS1hZTAzLTQxM2MtYTI3OS0wNmExODk5MjAwZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDA2LCJpYXQiOjE3OTMxOTUxMDYsImp0aSI6ImE3OThjOGQ2LWJlOWItNGJkNi05MGQ1LTQ2YmNhMzZiM2EwMCIsInNpZCI6IjM1MTIzODM5LTNiNDYtNDY3OS04YTVmLWIxMDJkMmQxNmYwZCJ9.eiY-uvL5psSqGTXG9JVDEyaGe7OABp4omgSImZevmw0",
  "access_expires_at": "2026-10-28T14:00:06.029257676Z",
  "refresh_token": "7X8VtZMFnT3fWEMSEMpCO9IQ6qznNF0esbOjstcA8Fk",
  "refresh_expires_at": "2026-11-27T13:45:06.028817224Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "94e0789f-cf6b-4502-a05b-c42b46916fc0",
  "expires_at": "2026-10-28T13:50:08.243219441Z",
  "resend_available_at": "2026-10-28T13:45:09.243219441Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638139521` → **200**

```json
{
  "phone": "+380638139521",
  "audience": "CLIENT",
  "code": "648404",
  "sent_at": "2026-10-28T13:45:08.244769615Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636744275"
}
```

```json
{
  "challenge_id": "9f40cb6f-a68b-4412-96d0-a8e236189368",
  "expires_at": "2026-10-28T13:50:08.461718448Z",
  "resend_available_at": "2026-10-28T13:45:09.461718448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636744275` → **200**

```json
{
  "phone": "+380636744275",
  "audience": "CLIENT",
  "code": "730660",
  "sent_at": "2026-10-28T13:45:08.463116248Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "435d2774-a873-4764-8098-64a50279b0c9",
  "current_challenge_id": "94e0789f-cf6b-4502-a05b-c42b46916fc0",
  "current_code": "000000",
  "new_challenge_id": "9f40cb6f-a68b-4412-96d0-a8e236189368",
  "new_code": "730660"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b118b534-4c80-4d85-8627-e0b759518aae"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "ddb39691-b0e5-4af8-9100-979a3b5be86d",
  "current_challenge_id": "94e0789f-cf6b-4502-a05b-c42b46916fc0",
  "current_code": "648404",
  "new_challenge_id": "9f40cb6f-a68b-4412-96d0-a8e236189368",
  "new_code": "730660"
}
```

```json
{
  "subject_id": "cca8988e-ae03-413c-a279-06a1899200f5",
  "phone": "+380636744275",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cca8988e-ae03-413c-a279-06a1899200f5",
  "session_id": "e56d33dc-2c56-4e8d-8cd5-7d850ade44fb",
  "account_state": "ACTIVE"
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "dcea71a7-0142-4bb2-8880-48c98d114631"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636744275",
  "device_ref": "sandbox-12320"
}
```

```json
{
  "challenge_id": "63a2d8ca-a37a-4224-af51-f5e44128555e",
  "expires_at": "2026-10-28T13:50:11.532330831Z",
  "resend_available_at": "2026-10-28T13:45:12.532330831Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636744275` → **200**

```json
{
  "phone": "+380636744275",
  "audience": "CLIENT",
  "code": "072243",
  "sent_at": "2026-10-28T13:45:11.534061351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63a2d8ca-a37a-4224-af51-f5e44128555e",
  "code": "072243",
  "device_ref": "sandbox-12320"
}
```

```json
{
  "session_id": "df87296b-7610-4ff0-ab4f-d2aa6dce2876",
  "subject": {
    "type": "CLIENT",
    "id": "cca8988e-ae03-413c-a279-06a1899200f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2E4OTg4ZS1hZTAzLTQxM2MtYTI3OS0wNmExODk5MjAwZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDExLCJpYXQiOjE3OTMxOTUxMTEsImp0aSI6IjAwNzRhOTliLWU5NDgtNDg5Ni1iYjMyLTEzMmIxYjljNTM2MiIsInNpZCI6ImRmODcyOTZiLTc2MTAtNGZmMC1hYjRmLWQyYWE2ZGNlMjg3NiJ9.l8YlqQPSP2bwYgrDCh78SE5Xc1sWlJ-3pan8Dcs6uLE",
  "access_expires_at": "2026-10-28T14:00:11.7590775Z",
  "refresh_token": "vSXeC1kjOZdHKgueP50sj5DkGGWLXkFk-fqA1xMuwTQ",
  "refresh_expires_at": "2026-11-27T13:45:11.758575766Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cca8988e-ae03-413c-a279-06a1899200f5",
  "session_id": "df87296b-7610-4ff0-ab4f-d2aa6dce2876",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support sets another after checking who it is

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "e40e225d-5221-4297-8a80-2bdd629cfdb3",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwMTIsImlhdCI6MTc5MzE5NTExMiwianRpIjoiMGMyNTBiYzctMjI3MC00Yzk4LThhMjUtNjdjNDJmYzNiY2U0Iiwic2lkIjoiZTQwZTIyNWQtNTIyMS00Mjk3LThhODAtMmJkZDYyOWNmZGIzIn0.S8XWrC5bHMo3fF1L6cw4wRbJ3bwdxcGM3Q0_Zsa3nb8",
  "access_expires_at": "2026-10-28T14:00:12.434584115Z",
  "refresh_token": "SA-pN4x9geEWNjB3gxJj1zdJa13GVOhkGG8ivCb67Gc",
  "refresh_expires_at": "2026-10-29T01:45:12.434128Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/cca8988e-ae03-413c-a279-06a1899200f5` → **200**

```json
{
  "client": {
    "id": "cca8988e-ae03-413c-a279-06a1899200f5",
    "phone": "+380636744275",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:45:03.394926Z",
    "version": 3,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/clients/cca8988e-ae03-413c-a279-06a1899200f5/phone` → **400**

```json
{
  "command_id": "8a735891-8427-479f-92fa-14d860cdb9b0",
  "expected_version": 3,
  "phone": "+380631788765",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/cca8988e-ae03-413c-a279-06a1899200f5/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "cc3acbdb-1127-478a-9a85-c91bc522ce9a",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/cca8988e-ae03-413c-a279-06a1899200f5/phone` → **200**

```json
{
  "command_id": "632300e4-1ddd-469e-a178-a76808f95c71",
  "expected_version": 3,
  "phone": "+380631788765",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "cca8988e-ae03-413c-a279-06a1899200f5",
  "phone": "+380631788765",
  "version": 4
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "7dd07df1-f0eb-4246-922d-982ac4dad9e1"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631788765",
  "device_ref": "sandbox-6289"
}
```

```json
{
  "challenge_id": "61eb7622-edd9-466d-a000-63d67766e5f8",
  "expires_at": "2026-10-28T13:50:13.523874177Z",
  "resend_available_at": "2026-10-28T13:45:14.523874177Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631788765` → **200**

```json
{
  "phone": "+380631788765",
  "audience": "CLIENT",
  "code": "016914",
  "sent_at": "2026-10-28T13:45:13.525763666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61eb7622-edd9-466d-a000-63d67766e5f8",
  "code": "016914",
  "device_ref": "sandbox-6289"
}
```

```json
{
  "session_id": "c36b2da9-5f79-4e3f-87dc-8a811779985a",
  "subject": {
    "type": "CLIENT",
    "id": "cca8988e-ae03-413c-a279-06a1899200f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2E4OTg4ZS1hZTAzLTQxM2MtYTI3OS0wNmExODk5MjAwZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDEzLCJpYXQiOjE3OTMxOTUxMTMsImp0aSI6IjM0NTI3MmQxLTAyMmQtNDVlNS05YThjLTc2OTQ5NjVhYTYwYSIsInNpZCI6ImMzNmIyZGE5LTVmNzktNGUzZi04N2RjLThhODExNzc5OTg1YSJ9.M1d820mAeV2sg2pjYzPyFag-CrIUtdfx0vQTwbABpDw",
  "access_expires_at": "2026-10-28T14:00:13.75397748Z",
  "refresh_token": "57tTEJaNCBkXgzSOwgYInJ6HLwy3cRXwcOw5uAE_tE8",
  "refresh_expires_at": "2026-11-27T13:45:13.753561004Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cca8988e-ae03-413c-a279-06a1899200f5",
  "session_id": "c36b2da9-5f79-4e3f-87dc-8a811779985a",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638954374",
  "device_ref": "sandbox-21046"
}
```

```json
{
  "challenge_id": "ddd72cfe-47b5-4bca-b3b1-41af1332a686",
  "expires_at": "2026-10-28T13:50:14.179550096Z",
  "resend_available_at": "2026-10-28T13:45:15.179550096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638954374` → **200**

```json
{
  "phone": "+380638954374",
  "audience": "CLIENT",
  "code": "447819",
  "sent_at": "2026-10-28T13:45:14.181199965Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddd72cfe-47b5-4bca-b3b1-41af1332a686",
  "code": "447819",
  "device_ref": "sandbox-21046"
}
```

```json
{
  "session_id": "93427b28-121b-4519-b486-18e366d9ccea",
  "subject": {
    "type": "CLIENT",
    "id": "27f5ac38-361d-47c0-9c83-43c680be84fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2Y1YWMzOC0zNjFkLTQ3YzAtOWM4My00M2M2ODBiZTg0ZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDE0LCJpYXQiOjE3OTMxOTUxMTQsImp0aSI6ImRlZDczMDJhLWY2OTktNDcyMy1iZGViLTY2NGE5NDNkODk3MyIsInNpZCI6IjkzNDI3YjI4LTEyMWItNDUxOS1iNDg2LTE4ZTM2NmQ5Y2NlYSJ9.9Q5yhH5_U6nPQ5gG32OrwxP96nEjU9-wun7qLC17Ap0",
  "access_expires_at": "2026-10-28T14:00:14.408254527Z",
  "refresh_token": "O8nIWnQTGTx5mg8Czai0L1KA59OaJzfeZXsMFsNurZo",
  "refresh_expires_at": "2026-11-27T13:45:14.407829559Z",
  "account_created": true
}
```

`GET /api/rider/v1/places?query=%D0%9C%D0%B0%D0%B9%D0%B4%D0%B0%D0%BD&lat=50.4501&lon=30.5234` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 1",
      "street": "Майдан",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 2",
      "street": "Майдан",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 3",
      "street": "Майдан",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## A point on the map gives an address

`GET /api/rider/v1/places/reverse?lat=50.4501&lon=30.5234` → **200**

```json
{
  "source": "FAKE",
  "address_id": null,
  "label": "Fake street 1",
  "street": "Fake street",
  "house": "1",
  "point": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "instructions": null
}
```

## The operator searches for a caller

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "74c0a4bc-2dc2-456b-b0f1-0f283cb9b108",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwMTUsImlhdCI6MTc5MzE5NTExNSwianRpIjoiYTYyNjQzNGItYmM5Yi00ZmQyLWI0MWMtYTgyNzZmYTNmZGVlIiwic2lkIjoiNzRjMGE0YmMtMmRjMi00NTZiLWIwZjEtMGYyODNjYjliMTA4In0.fiEasmMH_CFvyBFslPlOMnwJQwsYp8UwjbnTu4pG1eU",
  "access_expires_at": "2026-10-28T14:00:15.318218061Z",
  "refresh_token": "vxGHGpwnOKrqiD3sy2bOoD-ZxuLsX8fAVbGdwX1ePRs",
  "refresh_expires_at": "2026-10-29T01:45:15.317821816Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638954374` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 1",
      "street": "Вокзал",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 2",
      "street": "Вокзал",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 3",
      "street": "Вокзал",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## Outside the service area

`GET /api/rider/v1/places?query=x&lat=10&lon=10` → **422**

```json
{
  "instance": "/api/rider/v1/places",
  "status": 422,
  "title": "Outside service area",
  "type": "https://errors.blizz.taxi/outside-service-area",
  "code": "OUTSIDE_SERVICE_AREA",
  "correlation_id": "24d55256-5438-4717-bba4-7b74cde7f127"
}
```

Done: address search through FAKE.

# Scenario: preorders

## The admin switches pre-orders to reservations

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "37c1aec2-056a-45e0-bfe6-2085570d2f96",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwMTYsImlhdCI6MTc5MzE5NTExNiwianRpIjoiNzg0MWE0YjktYzhkMi00OWZkLWE2ODktOTk0ZDMyMjBmY2Q4Iiwic2lkIjoiMzdjMWFlYzItMDU2YS00NWUwLWJmZTYtMjA4NTU3MGQyZjk2In0.vgZo8h5Mk6A7SYefXN86qwKviAyvWrkH86BX2Sbe_LE",
  "access_expires_at": "2026-10-28T14:00:16.220829361Z",
  "refresh_token": "9k_M33Uzg0iCd6im8eUeMlUmOLtERJKtZtk14W_4HEo",
  "refresh_expires_at": "2026-10-29T01:45:16.220421729Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings` → **200**

```json
{
  "version": 0,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "BROADCAST_BEFORE",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    }
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "ea55c038-2d17-4d79-937a-787aa81bc8b1",
  "expected_version": 0,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "RESERVATION",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    }
  },
  "reason": "Sandbox: pre-orders by reservation"
}
```

```json
{
  "version": 1,
  "settings": {
    "brand": {
      "service_name": "Blizz Taxi",
      "primary_color": "#111111",
      "on_primary_color": "#FFFFFF",
      "accent_color": null,
      "logo_url": null,
      "support_phone": null,
      "support_email": null,
      "support_telegram": null,
      "privacy_policy_url": null,
      "terms_url": null
    },
    "languages": {
      "default_language": "ru",
      "enabled": [
        "uk",
        "pl",
        "ru",
        "en"
      ]
    },
    "calls": {
      "mode": "DIRECT",
      "service_phone": null
    },
    "preorders": {
      "threshold_minutes": 60,
      "max_days_ahead": 7,
      "dispatch": "RESERVATION",
      "release_minutes_before": 30,
      "confirm_minutes_before": 30,
      "confirm_window_minutes": 10,
      "driver_cancel_until_minutes_before": 60
    },
    "ratings": {
      "edit_window_hours": 24
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    }
  },
  "changed_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T13:45:16.666480119Z"
}
```

## The rider books the airport for 2026-10-28T16:45:15Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600995851",
  "device_ref": "sandbox-3722"
}
```

```json
{
  "challenge_id": "f5a014eb-1a0c-46e8-9a86-587c291da0a6",
  "expires_at": "2026-10-28T13:50:16.885820769Z",
  "resend_available_at": "2026-10-28T13:45:17.885820769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600995851` → **200**

```json
{
  "phone": "+48600995851",
  "audience": "CLIENT",
  "code": "887392",
  "sent_at": "2026-10-28T13:45:16.887610697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5a014eb-1a0c-46e8-9a86-587c291da0a6",
  "code": "887392",
  "device_ref": "sandbox-3722"
}
```

```json
{
  "session_id": "4cb61cbb-78e9-4786-95ce-6288876baba0",
  "subject": {
    "type": "CLIENT",
    "id": "5c9d298d-644d-4fbc-b8de-e2cb5bf98f6b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzlkMjk4ZC02NDRkLTRmYmMtYjhkZS1lMmNiNWJmOThmNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDE3LCJpYXQiOjE3OTMxOTUxMTcsImp0aSI6IjA5MmUzYmMyLTM0NDktNGVlZS1hNmFmLTZlNDg4Mjg5ODc2YyIsInNpZCI6IjRjYjYxY2JiLTc4ZTktNDc4Ni05NWNlLTYyODg4NzZiYWJhMCJ9.WdcOouX_hvDDz6SEllgAS6I-DOl_z28tOhAdKWfdlKY",
  "access_expires_at": "2026-10-28T14:00:17.11615341Z",
  "refresh_token": "bqlDVUvygLkZEk7f-0Yx-Hb_mDbUWaS3J8jM9ZuBVfg",
  "refresh_expires_at": "2026-11-27T13:45:17.115676103Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "456c1fd3-6e6a-4ea1-9e01-109554d2f694",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T16:45:15Z"
}
```

```json
{
  "id": "19e163c3-5c3a-4dfe-ab7f-a361be6b08be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:50:17.331557Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:45:15Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cc2689d1-3486-4068-9d90-b3770b4d1c0b",
  "quote_id": "19e163c3-5c3a-4dfe-ab7f-a361be6b08be",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "pickup_at": "2026-10-28T16:45:15Z"
}
```

```json
{
  "id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5c9d298d-644d-4fbc-b8de-e2cb5bf98f6b",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 5436,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-28T13:45:17.550008Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:45:15Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-13693"
}
```

```json
{
  "challenge_id": "3f84fbc5-1f25-434a-b084-9bf5ee0dcf3d",
  "expires_at": "2026-10-28T13:50:17.771182092Z",
  "resend_available_at": "2026-10-28T13:45:18.771182092Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "485627",
  "sent_at": "2026-10-28T13:45:17.773013317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f84fbc5-1f25-434a-b084-9bf5ee0dcf3d",
  "code": "485627",
  "device_ref": "sandbox-13693"
}
```

```json
{
  "session_id": "689caa1d-0856-40b2-bec2-a4004a45d4e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjAxOCwiaWF0IjoxNzkzMTk1MTE4LCJqdGkiOiI1OTMyMGVkZi1hMzRkLTQ0OTctOTU2Zi04ZDMzNTRlZTViYTciLCJzaWQiOiI2ODljYWExZC0wODU2LTQwYjItYmVjMi1hNDAwNGE0NWQ0ZTkifQ.lwaCh0jLrJ0MyrkMPHbqmWe4Cy_rT7eHKJw3mSnSHjU",
  "access_expires_at": "2026-10-28T14:00:18.008607637Z",
  "refresh_token": "p-xFA7HYF_P7tEN2mhDe9s1Ol3OXtYGWjmEWX0tNeh0",
  "refresh_expires_at": "2026-11-27T13:45:18.008100095Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
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
  "command_id": "49301543-1ec1-4dd9-8223-5296213b4689",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:18Z",
    "sequence": 1793195118415
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "72da9a03-b6a9-4e27-b8b0-cfcd21803abd",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T13:45:18.430246Z",
  "last_location_at": "2026-10-28T13:45:18.430246Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
      "short_number": 20,
      "pickup_at": "2026-10-28T16:45:15Z",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "pickup_label": "Pałac Kultury i Nauki",
      "dropoff_label": "Lotnisko Chopina",
      "price_minor": 5436,
      "currency": "PLN",
      "payment_method": "CASH"
    }
  ]
}
```

`POST /api/driver/v1/preorders/41b2f20c-2771-4a2b-a69d-523e1fe33312/reserve` → **200**

```json
{
  "command_id": "f60f269a-78fa-4296-a92f-d66d69d4e773"
}
```

```json
{
  "id": "0bbe8807-e738-48c5-a028-feb2d9479345",
  "state": "RESERVED",
  "order": {
    "order_id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
    "short_number": 20,
    "pickup_at": "2026-10-28T16:45:15Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 52.2297,
      "lon": 21.0122
    },
    "pickup_label": "Pałac Kultury i Nauki",
    "dropoff_label": "Lotnisko Chopina",
    "price_minor": 5436,
    "currency": "PLN",
    "payment_method": "CASH"
  },
  "reserved_at": "2026-10-28T13:45:18.85198Z",
  "confirm_from": "2026-10-28T16:15:15Z",
  "confirm_until": "2026-10-28T16:25:15Z",
  "drop_until": "2026-10-28T15:45:15Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "0bbe8807-e738-48c5-a028-feb2d9479345",
      "state": "RESERVED",
      "order": {
        "order_id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
        "short_number": 20,
        "pickup_at": "2026-10-28T16:45:15Z",
        "vehicle_class": "STANDARD",
        "pickup": {
          "lat": 52.2297,
          "lon": 21.0122
        },
        "pickup_label": "Pałac Kultury i Nauki",
        "dropoff_label": "Lotnisko Chopina",
        "price_minor": 5436,
        "currency": "PLN",
        "payment_method": "CASH"
      },
      "reserved_at": "2026-10-28T13:45:18.85198Z",
      "confirm_from": "2026-10-28T16:15:15Z",
      "confirm_until": "2026-10-28T16:25:15Z",
      "drop_until": "2026-10-28T15:45:15Z"
    }
  ]
}
```

## "On my way" is too early now; the operator sees who holds the order

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "0bbe8807-e738-48c5-a028-feb2d9479345",
      "state": "RESERVED",
      "order": {
        "order_id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
        "short_number": 20,
        "pickup_at": "2026-10-28T16:45:15Z",
        "vehicle_class": "STANDARD",
        "pickup": {
          "lat": 52.2297,
          "lon": 21.0122
        },
        "pickup_label": "Pałac Kultury i Nauki",
        "dropoff_label": "Lotnisko Chopina",
        "price_minor": 5436,
        "currency": "PLN",
        "payment_method": "CASH"
      },
      "reserved_at": "2026-10-28T13:45:18.85198Z",
      "confirm_from": "2026-10-28T16:15:15Z",
      "confirm_until": "2026-10-28T16:25:15Z",
      "drop_until": "2026-10-28T15:45:15Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/0bbe8807-e738-48c5-a028-feb2d9479345/confirm` → **409**

```json
{
  "command_id": "94a48d90-9e07-4836-88dc-0d348cd27c34"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/0bbe8807-e738-48c5-a028-feb2d9479345/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b3fe8f72-5ffc-460d-9d2a-37527320eed4"
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "1c67473e-ddea-440c-a289-31064bf76cf9",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwMTksImlhdCI6MTc5MzE5NTExOSwianRpIjoiZjg4MWQzYWYtOTY5Ni00ODhjLThlNmYtYjQ2ZmRhZTc1NjExIiwic2lkIjoiMWM2NzQ3M2UtZGRlYS00NDBjLWEyODktMzEwNjRiZjc2Y2Y5In0.KqdILx26w60QjgKrZ2BkmPggZQTNWZA_bKaTpHiGXSQ",
  "access_expires_at": "2026-10-28T14:00:19.962985352Z",
  "refresh_token": "rtWniZt1RKhQ7hazw9_fvqJnkSdroh3K71cgGAUWSVM",
  "refresh_expires_at": "2026-10-29T01:45:19.962590088Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/41b2f20c-2771-4a2b-a69d-523e1fe33312` → **200**

```json
{
  "id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5c9d298d-644d-4fbc-b8de-e2cb5bf98f6b",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury i Nauki",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko Chopina",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 5436,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-28T13:45:17.550008Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T16:45:15Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "0bbe8807-e738-48c5-a028-feb2d9479345",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T13:45:18.85198Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/41b2f20c-2771-4a2b-a69d-523e1fe33312/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T13:45:17.550924Z",
      "actor": {
        "type": "CLIENT",
        "id": "5c9d298d-644d-4fbc-b8de-e2cb5bf98f6b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
        "preorder": true,
        "quote_id": "19e163c3-5c3a-4dfe-ab7f-a361be6b08be",
        "pickup_at": "2026-10-28T16:45:15Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "1f4e233d-f576-4623-a095-09f636c3b5cc"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T13:45:18.852798Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "41b2f20c-2771-4a2b-a69d-523e1fe33312",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "0bbe8807-e738-48c5-a028-feb2d9479345"
      },
      "correlation_id": "587372f4-de7b-46bb-91db-d17d648bcf78"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 41b2f20c-2771-4a2b-a69d-523e1fe33312, reservation 0bbe8807-e738-48c5-a028-feb2d9479345.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32100"
}
```

```json
{
  "challenge_id": "388bee56-3f93-4ef2-90fa-de0f37d70b16",
  "expires_at": "2026-10-28T13:50:20.616445227Z",
  "resend_available_at": "2026-10-28T13:45:21.616445227Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "105473",
  "sent_at": "2026-10-28T13:45:20.618321986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "388bee56-3f93-4ef2-90fa-de0f37d70b16",
  "code": "105473",
  "device_ref": "sandbox-32100"
}
```

```json
{
  "session_id": "56652e18-512f-49e5-a810-5eed8ef703e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjAyMCwiaWF0IjoxNzkzMTk1MTIwLCJqdGkiOiJiYTk3ZTA2OS1kYjk4LTRhY2EtOTU3ZC04OWZmMzZjZDRlMTciLCJzaWQiOiI1NjY1MmUxOC01MTJmLTQ5ZTUtYTgxMC01ZWVkOGVmNzAzZTkifQ.077QpG9QMTkI2nycXni-sXYgWL6P5nQtmWceUYrLYkc",
  "access_expires_at": "2026-10-28T14:00:20.846965365Z",
  "refresh_token": "djN4Tvh1a_Wk8ud8Ig3vfut7Xnynr-t8EeTQs09HkZw",
  "refresh_expires_at": "2026-11-27T13:45:20.846531729Z",
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
  "command_id": "588f072a-e9eb-490e-be35-856a20cac2a6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:21Z",
    "sequence": 1793195121261
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24046080-c4d3-467e-b889-6900a33b5f58",
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
  "last_heartbeat_at": "2026-10-28T13:45:21.276344Z",
  "last_location_at": "2026-10-28T13:45:21.276344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677737153",
  "device_ref": "sandbox-21129"
}
```

```json
{
  "challenge_id": "28010b8f-1163-4537-a342-842db4c5fa58",
  "expires_at": "2026-10-28T13:50:21.480537451Z",
  "resend_available_at": "2026-10-28T13:45:22.480537451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677737153` → **200**

```json
{
  "phone": "+380677737153",
  "audience": "CLIENT",
  "code": "153954",
  "sent_at": "2026-10-28T13:45:21.482206803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28010b8f-1163-4537-a342-842db4c5fa58",
  "code": "153954",
  "device_ref": "sandbox-21129"
}
```

```json
{
  "session_id": "6b0cf673-d6e4-4e5d-931c-a70899cfd63b",
  "subject": {
    "type": "CLIENT",
    "id": "6272dd18-b557-42b3-b625-4a4f7b12ab03"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjcyZGQxOC1iNTU3LTQyYjMtYjYyNS00YTRmN2IxMmFiMDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDIxLCJpYXQiOjE3OTMxOTUxMjEsImp0aSI6ImY3YzU2MjI4LTMwNDAtNGViZS05YTFiLWQxNDQ1NTllODg1OCIsInNpZCI6IjZiMGNmNjczLWQ2ZTQtNGU1ZC05MzFjLWE3MDg5OWNmZDYzYiJ9.JETLjPGKsQ-itwa_As-Ke6LpjBPs-FPA5_XGAnoROdc",
  "access_expires_at": "2026-10-28T14:00:21.708183857Z",
  "refresh_token": "c3tadWs01bGzoubkiuP2gl7TTdhLR1THllRlvjGNMmU",
  "refresh_expires_at": "2026-11-27T13:45:21.707740616Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e32a0f0-c3c5-47d0-947c-312aa5d9f7fd",
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
  "id": "47066d9d-3548-4793-9424-0297bfd13c48",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:50:21.928071Z",
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
  "command_id": "af5bb3f5-d3b8-4b11-bb55-feb4e7d98a90",
  "quote_id": "47066d9d-3548-4793-9424-0297bfd13c48",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH"
}
```

```json
{
  "id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6272dd18-b557-42b3-b625-4a4f7b12ab03",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:45:22.155665Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f9034e0b-64fb-4335-9684-c3965ef5d8ca",
    "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
    "expires_at": "2026-10-28T13:45:37.157921Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Ratings pickup",
    "dropoff_label": "Ratings dropoff",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 22
  }
]
```

`POST /api/driver/v1/offers/f9034e0b-64fb-4335-9684-c3965ef5d8ca/accept` → **200**

```json
{
  "command_id": "aad8cb72-97a6-4314-b029-ea0778ea0234"
}
```

```json
{
  "id": "ae9487b7-4618-4ae4-8262-0395fd1826ae",
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0496c9ad-5dae-4252-91ca-3bab9af1b9b0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0496c9ad-5dae-4252-91ca-3bab9af1b9b0",
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "assignment_id": "ae9487b7-4618-4ae4-8262-0395fd1826ae",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/24046080-c4d3-467e-b889-6900a33b5f58/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:22Z",
    "sequence": 1793195123116
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24046080-c4d3-467e-b889-6900a33b5f58",
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
  "last_heartbeat_at": "2026-10-28T13:45:23.016291Z",
  "last_location_at": "2026-10-28T13:45:23.016291Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0496c9ad-5dae-4252-91ca-3bab9af1b9b0",
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "assignment_id": "ae9487b7-4618-4ae4-8262-0395fd1826ae",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0496c9ad-5dae-4252-91ca-3bab9af1b9b0/arrive` → **200**

```json
{
  "command_id": "6d2a773f-40c5-4155-9d75-b7a1437c39d8",
  "expected_version": 0
}
```

```json
{
  "id": "0496c9ad-5dae-4252-91ca-3bab9af1b9b0",
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "assignment_id": "ae9487b7-4618-4ae4-8262-0395fd1826ae",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:45:23.433272Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0496c9ad-5dae-4252-91ca-3bab9af1b9b0/start` → **200**

```json
{
  "command_id": "7e48a021-6d6d-489a-b9a8-fa4456283b46",
  "expected_version": 1
}
```

```json
{
  "id": "0496c9ad-5dae-4252-91ca-3bab9af1b9b0",
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "assignment_id": "ae9487b7-4618-4ae4-8262-0395fd1826ae",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:45:23.433272Z",
  "started_at": "2026-10-28T13:45:23.644681Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/24046080-c4d3-467e-b889-6900a33b5f58/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:23Z",
    "sequence": 1793195123855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24046080-c4d3-467e-b889-6900a33b5f58",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:45:23.870702Z",
  "last_location_at": "2026-10-28T13:45:23.870702Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/0496c9ad-5dae-4252-91ca-3bab9af1b9b0/complete` → **200**

```json
{
  "command_id": "16b8d134-5cb0-433d-afeb-ab6a13c67f92",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:45:24Z",
  "cash_received": true
}
```

```json
{
  "id": "0496c9ad-5dae-4252-91ca-3bab9af1b9b0",
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "assignment_id": "ae9487b7-4618-4ae4-8262-0395fd1826ae",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Ratings pickup",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Ratings dropoff",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:45:23.433272Z",
  "started_at": "2026-10-28T13:45:23.644681Z",
  "completed_at": "2026-10-28T13:45:24.079986Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/195afc4e-7af6-461b-bd29-f9af52282090/rating` → **200**

```json
{
  "command_id": "55223d45-1a68-4c9e-ae92-812aff9efc38",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "score": 5,
  "created_at": "2026-10-28T13:45:24.326113086Z"
}
```

`POST /api/driver/v1/orders/195afc4e-7af6-461b-bd29-f9af52282090/rating` → **200**

```json
{
  "command_id": "d50068a2-f327-44fd-8112-1ab92dedd0ce",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
  "score": 4,
  "created_at": "2026-10-28T13:45:24.54266105Z"
}
```

## Driver sees only aggregate score

`GET /api/driver/v1/me/rating` → **200**

```json
{
  "score_sum": 5,
  "count": 1,
  "average_hundredths": 500
}
```

## Operator sees both staff-only comments

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "548d2d3f-b65f-48c9-b3b8-9566138444a5",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwMjUsImlhdCI6MTc5MzE5NTEyNSwianRpIjoiYWQwMGQ4NDEtYTY0Zi00YWVhLWI3NDEtMWUzMGQ0NDJhOWE2Iiwic2lkIjoiNTQ4ZDJkM2YtYjY1Zi00OGM5LWIzYjgtOTU2NjEzODQ0NGE1In0.drIINPO9Wqb4UDU9426RW3lNhqGUgfyMrbK96ZdrpWc",
  "access_expires_at": "2026-10-28T14:00:25.213289317Z",
  "refresh_token": "LlwmL0IPLI6KNsC3KtBaatHtwLzj9cJKBkzx6waKewA",
  "refresh_expires_at": "2026-10-29T01:45:25.212874584Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "de1e6a1c-6eb6-44ac-8727-dbd4b3611b03",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwMjUsImlhdCI6MTc5MzE5NTEyNSwianRpIjoiY2YzYjY1NmEtNmRmNC00YTg2LWI5OGItOGFlOGY4ZTAxNGU2Iiwic2lkIjoiZGUxZTZhMWMtNmViNi00NGFjLTg3MjctZGJkNGIzNjExYjAzIn0.H37Qc4dSF5z9SggiVIe9WhQ0405X_0eOjdSkPLRzlWY",
  "access_expires_at": "2026-10-28T14:00:25.681702355Z",
  "refresh_token": "LjndG_tWGPc2aikefItSc2Neevafynrf-Y-wIyjgMjY",
  "refresh_expires_at": "2026-10-29T01:45:25.681289494Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/195afc4e-7af6-461b-bd29-f9af52282090/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
      "author_type": "RIDER",
      "author_id": "6272dd18-b557-42b3-b625-4a4f7b12ab03",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T13:45:24.326113Z"
    },
    {
      "order_id": "195afc4e-7af6-461b-bd29-f9af52282090",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "6272dd18-b557-42b3-b625-4a4f7b12ab03",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T13:45:24.542661Z"
    }
  ]
}
```

Done: ratings for order 195afc4e-7af6-461b-bd29-f9af52282090.

# Scenario: report-export

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "83a7e959-49f3-459b-83c2-3444662d9990",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwMjYsImlhdCI6MTc5MzE5NTEyNiwianRpIjoiMzM0YjgzOTctMjlkMi00NmU1LWEyOTItYTE4YzRlZDE4MjNjIiwic2lkIjoiODNhN2U5NTktNDlmMy00NTliLTgzYzItMzQ0NDY2MmQ5OTkwIn0.ReZwnAKFMytRWmii6IlMD-tkBvaV-6DlaSJwOQ5VtXA",
  "access_expires_at": "2026-10-28T14:00:26.373264299Z",
  "refresh_token": "STcPD0yTIYQZ4VPJYcQJieQ175TViss5CbR10619yGI",
  "refresh_expires_at": "2026-10-29T01:45:26.37285205Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "cc7d1c2b-cdfb-42c1-a43f-a31eaec790ed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "61800261-c52e-4641-be39-cb6eedc54f01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:26.588492Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/61800261-c52e-4641-be39-cb6eedc54f01` → **200**

```json
{
  "id": "61800261-c52e-4641-be39-cb6eedc54f01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:26.588492Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/61800261-c52e-4641-be39-cb6eedc54f01` → **200**

```json
{
  "id": "61800261-c52e-4641-be39-cb6eedc54f01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:26.588492Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/61800261-c52e-4641-be39-cb6eedc54f01` → **200**

```json
{
  "id": "61800261-c52e-4641-be39-cb6eedc54f01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:26.588492Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/61800261-c52e-4641-be39-cb6eedc54f01` → **200**

```json
{
  "id": "61800261-c52e-4641-be39-cb6eedc54f01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:26.588492Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/61800261-c52e-4641-be39-cb6eedc54f01` → **200**

```json
{
  "id": "61800261-c52e-4641-be39-cb6eedc54f01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:45:26.588492Z",
  "ready_at": "2026-10-28T13:45:30.797527Z",
  "expires_at": "2026-10-29T13:45:30.797527Z"
}
```

`GET /api/admin/v1/reports/exports/61800261-c52e-4641-be39-cb6eedc54f01/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d5a3e468-6684-41cf-8a5e-c985bb4e74e1",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "724288a6-365c-4e8c-9232-5d48c1987853",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:31.874062Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/724288a6-365c-4e8c-9232-5d48c1987853` → **200**

```json
{
  "id": "724288a6-365c-4e8c-9232-5d48c1987853",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:31.874062Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/724288a6-365c-4e8c-9232-5d48c1987853` → **200**

```json
{
  "id": "724288a6-365c-4e8c-9232-5d48c1987853",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:31.874062Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/724288a6-365c-4e8c-9232-5d48c1987853` → **200**

```json
{
  "id": "724288a6-365c-4e8c-9232-5d48c1987853",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:31.874062Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/724288a6-365c-4e8c-9232-5d48c1987853` → **200**

```json
{
  "id": "724288a6-365c-4e8c-9232-5d48c1987853",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:45:31.874062Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/724288a6-365c-4e8c-9232-5d48c1987853` → **200**

```json
{
  "id": "724288a6-365c-4e8c-9232-5d48c1987853",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:45:31.874062Z",
  "ready_at": "2026-10-28T13:45:35.804699Z",
  "expires_at": "2026-10-29T13:45:35.804699Z"
}
```

`GET /api/admin/v1/reports/exports/724288a6-365c-4e8c-9232-5d48c1987853/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/3cd386d9-9d8b-4608-840c-dd3f10d10fcc` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/3cd386d9-9d8b-4608-840c-dd3f10d10fcc",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a0a84459-882a-458b-a435-37f68e1b02f4"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2130"
}
```

```json
{
  "challenge_id": "36705803-9817-459b-9647-66c04eecc739",
  "expires_at": "2026-10-28T13:50:37.413843962Z",
  "resend_available_at": "2026-10-28T13:45:38.413843962Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "108353",
  "sent_at": "2026-10-28T13:45:37.415758753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36705803-9817-459b-9647-66c04eecc739",
  "code": "108353",
  "device_ref": "sandbox-2130"
}
```

```json
{
  "session_id": "5d4de656-e8f3-4acf-a5f9-648ce45e0a39",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjAzNywiaWF0IjoxNzkzMTk1MTM3LCJqdGkiOiIyZjRkZDU0My1kN2UyLTRiMDgtYTgwNi1jNmJlNWMxZjQ5Y2UiLCJzaWQiOiI1ZDRkZTY1Ni1lOGYzLTRhY2YtYTVmOS02NDhjZTQ1ZTBhMzkifQ.Q3Fd_-rFoSYM-NS7G30JHZvCevbWMElfxjtHYcy6B3Y",
  "access_expires_at": "2026-10-28T14:00:37.640028251Z",
  "refresh_token": "HQK7zIigMICMICFf8Z1yCci9Dyp1XlGYRN-WeIRjQ_8",
  "refresh_expires_at": "2026-11-27T13:45:37.639646878Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "2965688a-ef41-4cdc-85fb-27e1b8caed2f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:38Z",
    "sequence": 1793195138254
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "83d6d7ee-fd5a-44da-8512-8ee00da25e43",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:45:38.269701Z",
  "last_location_at": "2026-10-28T13:45:38.269701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "e1541ca6-9af2-4878-8cb1-9ca290730c48",
  "points": [
    {
      "sequence": 1793195140479,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:44:40Z"
    },
    {
      "sequence": 1793195140485,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:45:40Z"
    }
  ]
}
```

```json
{
  "accepted": 2,
  "duplicates": 0,
  "flagged": 1
}
```

## Support finds one open flag — the driver is still approved

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "25e9cb8e-a096-44c4-9226-aa7146337990",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwNDAsImlhdCI6MTc5MzE5NTE0MCwianRpIjoiMjI2ZTE1MjktN2RkZi00ZjBiLThlZDUtZDU5M2U4YjE0MzJmIiwic2lkIjoiMjVlOWNiOGUtYTA5Ni00NGM0LTkyMjYtYWE3MTQ2MzM3OTkwIn0.EtRZDC1WRUaVhIODNgwYYFHCa1qCE7k4aniYEacjvVM",
  "access_expires_at": "2026-10-28T14:00:40.990507174Z",
  "refresh_token": "gRLEMyDUwltKEBcUb02iz1BT0xw_z1PqqV-c9GiLZDw",
  "refresh_expires_at": "2026-10-29T01:45:40.990094975Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "c3b0f7d9-afd5-473f-834e-d6eacb7f2001",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T13:45:40Z",
        "track_point_id": "76fe1610-2e7b-475a-a1fe-ee39bc2f9bf4",
        "work_session_id": "83d6d7ee-fd5a-44da-8512-8ee00da25e43"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T13:45:40Z",
      "reason": null,
      "reviewed_by": null,
      "reviewed_at": null,
      "review_reason": null,
      "version": 1
    }
  ]
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 4,
    "has_payment_terminal": false,
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/c3b0f7d9-afd5-473f-834e-d6eacb7f2001/confirm` → **200**

```json
{
  "command_id": "692d33d0-4992-4555-bdde-01a1f2cc488d",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "c3b0f7d9-afd5-473f-834e-d6eacb7f2001",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T13:45:40Z",
    "track_point_id": "76fe1610-2e7b-475a-a1fe-ee39bc2f9bf4",
    "work_session_id": "83d6d7ee-fd5a-44da-8512-8ee00da25e43"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T13:45:40Z",
  "reason": null,
  "reviewed_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "reviewed_at": "2026-10-28T13:45:41.661533Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/c3b0f7d9-afd5-473f-834e-d6eacb7f2001/dismiss` → **409**

```json
{
  "command_id": "6e139bf8-18d1-4d10-bcf9-e6584a0a708c",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/c3b0f7d9-afd5-473f-834e-d6eacb7f2001/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "109ae955-bb1e-4fcb-b875-54fa06b1618d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "8239673a-1074-4b35-8452-3ccbcdc77dd5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "2f99990c-d7dd-4e92-b922-c2ed7b061cbc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "raised_at": "2026-10-28T13:45:42.103436Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/2f99990c-d7dd-4e92-b922-c2ed7b061cbc/dismiss` → **200**

```json
{
  "command_id": "72352a59-819e-44b0-a38f-566e4389c222",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "2f99990c-d7dd-4e92-b922-c2ed7b061cbc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "raised_at": "2026-10-28T13:45:42.103436Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "reviewed_at": "2026-10-28T13:45:42.319394Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "031500ca-ab1b-49b4-b848-b1fd9097ff67",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "c3b0f7d9-afd5-473f-834e-d6eacb7f2001"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
  "version": 5,
  "has_payment_terminal": false,
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
    "version": 5,
    "has_payment_terminal": false,
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:45:42.545561Z"
    }
  ]
}
```

Done: flag c3b0f7d9-afd5-473f-834e-d6eacb7f2001 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "f27d9e27-c139-4522-bee2-0f084bdf235e",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwNDMsImlhdCI6MTc5MzE5NTE0MywianRpIjoiNDZlZDRiMjQtNzBiNi00YTA1LWIzZDAtZmFhOGFhNTZhNjk2Iiwic2lkIjoiZjI3ZDllMjctYzEzOS00NTIyLWJlZTItMGYwODRiZGYyMzVlIn0._2leAcq32Zx0pV1-DPA_hBDnn_j77e19v7CsrZusLes",
  "access_expires_at": "2026-10-28T14:00:43.225451551Z",
  "refresh_token": "kKneOkN8pDpnGxakUwTkq1QkUCer3WT-1QzOsu_d3jA",
  "refresh_expires_at": "2026-10-29T01:45:43.225050919Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
    "version": 5,
    "has_payment_terminal": false,
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:45:42.545561Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "37e3b3e7-9c9f-4733-8adc-f6c804a794f2",
  "expected_version": 5,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 6,
  "has_payment_terminal": false,
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "83d6d7ee-fd5a-44da-8512-8ee00da25e43",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:45:38.269701Z",
  "last_location_at": "2026-10-28T13:45:38.269701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/83d6d7ee-fd5a-44da-8512-8ee00da25e43/close` → **200**

```json
{
  "command_id": "55556e83-61da-40e4-8fad-942abb8cbc8c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

# Scenario: safety-contacts

## The admin reads the city's contacts and replaces them

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "dc15519d-5859-4639-b0cc-3891fd27b7ed",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwNDQsImlhdCI6MTc5MzE5NTE0NCwianRpIjoiODYzY2QxNWYtOTE4My00NzIwLWIzMjMtYzA1NjEzNzg0NTg2Iiwic2lkIjoiZGMxNTUxOWQtNTg1OS00NjM5LWIwY2MtMzg5MWZkMjdiN2VkIn0.6uJFZl70B4rbTl3xp0szNwh87mkXLKfQzkZz-uyXfVU",
  "access_expires_at": "2026-10-28T14:00:44.559168309Z",
  "refresh_token": "sL7t1NRaG-RiEwKHo84X0K3NBcOTiDl7oVPtDZuMzvQ",
  "refresh_expires_at": "2026-10-29T01:45:44.558763721Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 0,
  "emergency_number": "112",
  "support_phone": null,
  "extra": [],
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "2d2cf854-11e5-443e-b5a4-bc715d7df08d",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:45:44.993635Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "2d2cf854-11e5-443e-b5a4-bc715d7df08d",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "54476750-8d4c-4def-bcc5-b00c809a62c0",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:45:44.993635Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48138971076",
  "device_ref": "sandbox-6794"
}
```

```json
{
  "challenge_id": "2583b5ce-8f7d-4458-ad4b-38682b5e0c09",
  "expires_at": "2026-10-28T13:50:45.42318908Z",
  "resend_available_at": "2026-10-28T13:45:46.42318908Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48138971076` → **200**

```json
{
  "phone": "+48138971076",
  "audience": "CLIENT",
  "code": "276122",
  "sent_at": "2026-10-28T13:45:45.425042205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2583b5ce-8f7d-4458-ad4b-38682b5e0c09",
  "code": "276122",
  "device_ref": "sandbox-6794"
}
```

```json
{
  "session_id": "31bebdd4-889c-4561-8c6e-7b1f7d732c16",
  "subject": {
    "type": "CLIENT",
    "id": "aeda3355-b293-4dbe-bf23-99a85f7374fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWRhMzM1NS1iMjkzLTRkYmUtYmYyMy05OWE4NWY3Mzc0ZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDQ1LCJpYXQiOjE3OTMxOTUxNDUsImp0aSI6IjgzYWJjMDNmLTAwZGMtNDhhYy05MTM3LTJmMmU5NmQxYTZmYSIsInNpZCI6IjMxYmViZGQ0LTg4OWMtNDU2MS04YzZlLTdiMWY3ZDczMmMxNiJ9.6zy-_BlDm2DBkZEvrxYi6lHIW5HeG0k5h65ieiOYVWI",
  "access_expires_at": "2026-10-28T14:00:45.655033873Z",
  "refresh_token": "gr3JozXqg9cDN7wWDNj3R-e_uE5VGRK60OT0xDUJkDc",
  "refresh_expires_at": "2026-11-27T13:45:45.654637603Z",
  "account_created": true
}
```

`GET /api/rider/v1/safety-contacts` → **400**

```json
{
  "instance": "/api/rider/v1/safety-contacts",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "112c3bd8-00d7-4c73-8f34-f11875a16c46"
}
```

`GET /api/rider/v1/safety-contacts?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Горячая линия",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver on line in Warszawa opens it (the city of his session)

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-958"
}
```

```json
{
  "challenge_id": "fefa5291-9e4e-4792-bd2c-f36cb1b28c95",
  "expires_at": "2026-10-28T13:50:46.27899308Z",
  "resend_available_at": "2026-10-28T13:45:47.27899308Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "339154",
  "sent_at": "2026-10-28T13:45:46.28056038Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fefa5291-9e4e-4792-bd2c-f36cb1b28c95",
  "code": "339154",
  "device_ref": "sandbox-958"
}
```

```json
{
  "session_id": "1b6bba88-cdbf-4ad5-909d-774bfac545f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjA0NiwiaWF0IjoxNzkzMTk1MTQ2LCJqdGkiOiJkZGU4MWE1Yi05Njk4LTRjYTMtYTg4NC00NzkzZWEzODI4MmEiLCJzaWQiOiIxYjZiYmE4OC1jZGJmLTRhZDUtOTA5ZC03NzRiZmFjNTQ1ZjUifQ.AuVUtm2k2hmCJFmSiSTOOtLtQUsB_YgQwBklvES_A6E",
  "access_expires_at": "2026-10-28T14:00:46.510298742Z",
  "refresh_token": "fKtxXie9gdyMmX0TFR3mWrivJ3U4hF8ftZnuwdc_Ye4",
  "refresh_expires_at": "2026-11-27T13:45:46.509920163Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "72da9a03-b6a9-4e27-b8b0-cfcd21803abd",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T13:45:18.430246Z",
  "last_location_at": "2026-10-28T13:45:18.430246Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/72da9a03-b6a9-4e27-b8b0-cfcd21803abd/handover` → **200**

```json
{
  "command_id": "49fd9ad4-fa0f-47f2-807b-9f25d03ab3db",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "72da9a03-b6a9-4e27-b8b0-cfcd21803abd",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T13:45:18.430246Z",
  "last_location_at": "2026-10-28T13:45:18.430246Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/72da9a03-b6a9-4e27-b8b0-cfcd21803abd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:47Z",
    "sequence": 1793195147151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "72da9a03-b6a9-4e27-b8b0-cfcd21803abd",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T13:45:47.166472Z",
  "last_location_at": "2026-10-28T13:45:47.166472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/safety-contacts` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Infolinia",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver goes off line; without a session there is no city

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "72da9a03-b6a9-4e27-b8b0-cfcd21803abd",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T13:45:47.166472Z",
  "last_location_at": "2026-10-28T13:45:47.166472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/72da9a03-b6a9-4e27-b8b0-cfcd21803abd/close` → **200**

```json
{
  "command_id": "8218847d-5de6-425c-9f34-152629771292",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
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

`GET /api/driver/v1/safety-contacts` → **409**

```json
{
  "instance": "/api/driver/v1/safety-contacts",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dfd32190-8f32-4c35-99ed-0827cabb4d7c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670102114",
  "device_ref": "sandbox-11883"
}
```

```json
{
  "challenge_id": "c7cffc07-45dd-44a2-82cb-b9ac63849500",
  "expires_at": "2026-10-28T13:50:48.217746154Z",
  "resend_available_at": "2026-10-28T13:45:49.217746154Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670102114` → **200**

```json
{
  "phone": "+380670102114",
  "audience": "CLIENT",
  "code": "924520",
  "sent_at": "2026-10-28T13:45:48.21951285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7cffc07-45dd-44a2-82cb-b9ac63849500",
  "code": "924520",
  "device_ref": "sandbox-11883"
}
```

```json
{
  "session_id": "1e7837af-75b3-4a2f-a8c0-d12b55e026c0",
  "subject": {
    "type": "CLIENT",
    "id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjcxMDFlZS1kMzI1LTRmNmUtYmRlNi00MGIyYmE5ZThmOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2MDQ4LCJpYXQiOjE3OTMxOTUxNDgsImp0aSI6ImEzNWVkZTJhLTMzYzgtNDY0MS1hMmZkLTUxYjE5ZGI4NDFmMCIsInNpZCI6IjFlNzgzN2FmLTc1YjMtNGEyZi1hOGMwLWQxMmI1NWUwMjZjMCJ9.Vbf23jLuuIBmESDilYpl8n4d5vYmLoba0DsuQ3yIHkY",
  "access_expires_at": "2026-10-28T14:00:48.446996456Z",
  "refresh_token": "O3yaHrMwXtw7Y9xF9_I7tO3ubDCe-SjlL_t7HiPuiDs",
  "refresh_expires_at": "2026-11-27T13:45:48.446597236Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "cebd9063-cd74-42a0-9a32-7668686f76ef",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad",
  "upload_path": "/api/rider/v1/uploads/a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad",
  "expires_at": "2026-10-28T14:00:48.661182092Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad` → **200**

```json
{
  "file_id": "a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "c3a631e9-b57e-465f-9258-2335fb14a022",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad"
  ]
}
```

```json
{
  "id": "e49ab4bb-ada4-44ec-b2a1-287efc95f74c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:45:48.900334Z",
  "updated_at": "2026-10-28T13:45:48.900334Z",
  "messages": [
    {
      "id": "dbfbaab5-6590-45ce-b0a8-83c5296f4d0f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:45:48.901623Z",
      "attachments": [
        {
          "file_id": "a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

## Operator downloads the rider photo and replies with another file

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "a2ff11de-d7cf-449d-b9a2-b2e45763f4b0",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwNDksImlhdCI6MTc5MzE5NTE0OSwianRpIjoiNTllZmM2MWEtMTZjMC00NmYyLThkMTctMjE0YmNhYjU2MDFhIiwic2lkIjoiYTJmZjExZGUtZDdjZi00NDlkLWI5YTItYjJlNDU3NjNmNGIwIn0.c9s285RbhFMJ5kuumMYYCpsRCr3KXiGvQkzFDnLRLiw",
  "access_expires_at": "2026-10-28T14:00:49.399026184Z",
  "refresh_token": "9ix5KJKGmaNU7YS6dvb4Cd_yc9SKj1nTqVHzXec8LTU",
  "refresh_expires_at": "2026-10-29T01:45:49.398402837Z",
  "password_change_required": false
}
```

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ace2ef68-0924-4129-a629-2a94ec2009e8",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwNDksImlhdCI6MTc5MzE5NTE0OSwianRpIjoiOTlhYTYxZjUtZTQwYi00MGEwLTkwN2EtZGU1NDA0MDBlMjVmIiwic2lkIjoiYWNlMmVmNjgtMDkyNC00MTI5LWE2MjktMmE5NGVjMjAwOWU4In0.0YJ8JCfb9StuxDxKaKQsT6Nm9lqqo0l2XDegSAQcZsM",
  "access_expires_at": "2026-10-28T14:00:49.878155287Z",
  "refresh_token": "mqRGZ4IeEO2sX80oI25cU-2SwzVUzZsTFadMeIAt7DI",
  "refresh_expires_at": "2026-10-29T01:45:49.877730969Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/e49ab4bb-ada4-44ec-b2a1-287efc95f74c/attachments/a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "94dd916c-0533-4441-8c32-70877e94e30e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a",
  "upload_path": "/api/operator/v1/uploads/5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a",
  "expires_at": "2026-10-28T14:00:50.106071318Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a` → **200**

```json
{
  "file_id": "5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/e49ab4bb-ada4-44ec-b2a1-287efc95f74c` → **200**

```json
{
  "id": "e49ab4bb-ada4-44ec-b2a1-287efc95f74c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:45:48.900334Z",
  "updated_at": "2026-10-28T13:45:48.900334Z",
  "messages": [
    {
      "id": "dbfbaab5-6590-45ce-b0a8-83c5296f4d0f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:45:48.901623Z",
      "attachments": [
        {
          "file_id": "a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/e49ab4bb-ada4-44ec-b2a1-287efc95f74c/comments` → **200**

```json
{
  "command_id": "87121c7e-9081-486e-bbc7-1f731be8df79",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a"
  ]
}
```

```json
{
  "id": "e49ab4bb-ada4-44ec-b2a1-287efc95f74c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:45:48.900334Z",
  "updated_at": "2026-10-28T13:45:50.551337Z",
  "messages": [
    {
      "id": "dbfbaab5-6590-45ce-b0a8-83c5296f4d0f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:45:48.901623Z",
      "attachments": [
        {
          "file_id": "a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e501618e-bb0b-4039-8cb3-ced8fce0c27d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:45:50.551056Z",
      "attachments": [
        {
          "file_id": "5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

## Rider sees the public reply and downloads its attachment

`GET /api/rider/v1/support/cases/e49ab4bb-ada4-44ec-b2a1-287efc95f74c` → **200**

```json
{
  "id": "e49ab4bb-ada4-44ec-b2a1-287efc95f74c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:45:48.900334Z",
  "updated_at": "2026-10-28T13:45:50.551337Z",
  "messages": [
    {
      "id": "dbfbaab5-6590-45ce-b0a8-83c5296f4d0f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f67101ee-d325-4f6e-bde6-40b2ba9e8f9b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:45:48.901623Z",
      "attachments": [
        {
          "file_id": "a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e501618e-bb0b-4039-8cb3-ced8fce0c27d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:45:50.551056Z",
      "attachments": [
        {
          "file_id": "5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/e49ab4bb-ada4-44ec-b2a1-287efc95f74c/attachments/5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a` → **200**

Done: support case e49ab4bb-ada4-44ec-b2a1-287efc95f74c, rider attachment a65b9cbd-4a5d-4d3e-9c03-3b73af2036ad, operator attachment 5de4d7a9-f5b4-4f65-99fe-0b70ea453f6a.

# Scenario: terminal-ride

## The admin marks that Andrii has an own card terminal

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "18add83e-af2a-41c8-9223-d43764697106",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwNTEsImlhdCI6MTc5MzE5NTE1MSwianRpIjoiYzcwYjFjYTgtODI2ZC00ZTEzLTgwNGEtNjlkYjJlY2E4NWI3Iiwic2lkIjoiMThhZGQ4M2UtYWYyYS00MWM4LTkyMjMtZDQzNzY0Njk3MTA2In0.g6JUCzDlQd_qB9w0afXkfOrG4y4xcT67wz1pbbMBQWk",
  "access_expires_at": "2026-10-28T14:00:51.274064519Z",
  "refresh_token": "hq-SS3I0hDhCOygfgGNWE8CZnr-I6qCyX9o0BsGOZYA",
  "refresh_expires_at": "2026-10-29T01:45:51.273648404Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5214"
}
```

```json
{
  "challenge_id": "b7e34b9c-8e1f-4fdd-ae2f-62cb0f709d20",
  "expires_at": "2026-10-28T13:50:51.482089039Z",
  "resend_available_at": "2026-10-28T13:45:52.482089039Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "670516",
  "sent_at": "2026-10-28T13:45:51.483955124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7e34b9c-8e1f-4fdd-ae2f-62cb0f709d20",
  "code": "670516",
  "device_ref": "sandbox-5214"
}
```

```json
{
  "session_id": "780a342b-f50b-4b00-8bf0-82973dfe2820",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjA1MSwiaWF0IjoxNzkzMTk1MTUxLCJqdGkiOiJkMjFjYmQ5Mi0yMzI0LTRmYzgtOTFkYy02NjQ0NGY2MTdiNmUiLCJzaWQiOiI3ODBhMzQyYi1mNTBiLTRiMDAtOGJmMC04Mjk3M2RmZTI4MjAifQ.s4dYBAsuyhLMkN_hBbroEupkh1tfMmbebSL-K5Ilmnw",
  "access_expires_at": "2026-10-28T14:00:51.714890739Z",
  "refresh_token": "-U3VudxIzlQhT0oQNxnujYcbuHgAwQ6K3bvkiDPwFu4",
  "refresh_expires_at": "2026-11-27T13:45:51.714472731Z",
  "account_created": false
}
```

`GET /api/driver/v1/profile` → **200**

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 7,
  "has_payment_terminal": false,
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 7,
    "has_payment_terminal": false,
    "vehicles": [
      {
        "id": "5a000000-0000-4000-8000-000000000503",
        "registration_number": "AA0003TX",
        "make": "Hyundai",
        "model": "Sonata",
        "color": "black",
        "production_year": 2022,
        "state": "APPROVED",
        "class_approvals": [
          "STANDARD",
          "COMFORT"
        ]
      }
    ],
    "documents": []
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:45:42.545561Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "54476750-8d4c-4def-bcc5-b00c809a62c0",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T13:45:43.654452Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "698b47a9-d3f4-4a36-b05e-0e816c9ec1c6",
  "expected_version": 7,
  "has_terminal": true,
  "reason": "ФОП, власний POS-термінал"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 8,
  "has_payment_terminal": true,
  "vehicles": [
    {
      "id": "5a000000-0000-4000-8000-000000000503",
      "registration_number": "AA0003TX",
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "production_year": 2022,
      "state": "APPROVED",
      "class_approvals": [
        "STANDARD",
        "COMFORT"
      ]
    }
  ],
  "documents": []
}
```

## Ivan (no terminal) is nearer than Andrii

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6809"
}
```

```json
{
  "challenge_id": "3aa436f0-1a72-461a-9f26-0d6bede6e2ee",
  "expires_at": "2026-10-28T13:50:52.559956591Z",
  "resend_available_at": "2026-10-28T13:45:53.559956591Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "851260",
  "sent_at": "2026-10-28T13:45:52.56168595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3aa436f0-1a72-461a-9f26-0d6bede6e2ee",
  "code": "851260",
  "device_ref": "sandbox-6809"
}
```

```json
{
  "session_id": "0434f228-cd25-438d-ac0b-7028c93da2e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjA1MiwiaWF0IjoxNzkzMTk1MTUyLCJqdGkiOiIxMTIyNzUxMS00NDBlLTQyZDgtODQ1NC1kZWE5NzIzNjc3ZjkiLCJzaWQiOiIwNDM0ZjIyOC1jZDI1LTQzOGQtYWMwYi03MDI4YzkzZGEyZTMifQ.W89LyQGFL45hS4utxvUNKnsf8yp2JauFQWuV-IFVQWg",
  "access_expires_at": "2026-10-28T14:00:52.785395758Z",
  "refresh_token": "UpUZfPygphNr0ixlQLuKZKkA4VtBD6008_PjR3qkYnA",
  "refresh_expires_at": "2026-11-27T13:45:52.784997169Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24046080-c4d3-467e-b889-6900a33b5f58",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:45:23.870702Z",
  "last_location_at": "2026-10-28T13:45:23.870702Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/24046080-c4d3-467e-b889-6900a33b5f58/handover` → **200**

```json
{
  "command_id": "d393a04b-8c29-4d6d-aaf3-ade2a91cc147",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24046080-c4d3-467e-b889-6900a33b5f58",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:45:23.870702Z",
  "last_location_at": "2026-10-28T13:45:23.870702Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/24046080-c4d3-467e-b889-6900a33b5f58/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:53Z",
    "sequence": 1793195153410
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24046080-c4d3-467e-b889-6900a33b5f58",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:45:53.425307Z",
  "last_location_at": "2026-10-28T13:45:53.425307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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
  "command_id": "17930450-d278-4fde-9e6e-d33569f3e463",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:53Z",
    "sequence": 1793195153835
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6323ce6a-c306-438b-a13f-90af2c5bbaf2",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:45:53.849479Z",
  "last_location_at": "2026-10-28T13:45:53.849479Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator takes a phone order paid at the terminal

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "OPERATOR",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "8cd8b46a-15ad-493f-ad37-1c5cac07590f",
  "subject": {
    "type": "STAFF",
    "id": "54476750-8d4c-4def-bcc5-b00c809a62c0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDQ3Njc1MC04ZDRjLTRkZWYtYmNjNS1iMDBjODA5YTYyYzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTYwNTQsImlhdCI6MTc5MzE5NTE1NCwianRpIjoiYTBjZDVhZTEtMTAyZS00ZTBhLWFlMDEtZTcyNjEzZWMzY2RlIiwic2lkIjoiOGNkOGI0NmEtMTVhZC00OTNmLWFkMzctMWM1Y2FjMDc1OTBmIn0.A6X7-tllb7BqG35hVg01pcTfCzXXo8MquxxYS1j2TcM",
  "access_expires_at": "2026-10-28T14:00:54.321031412Z",
  "refresh_token": "brsP1GZrFecWBALL4Xir7tisULZKTAB0N8LhhPenFUk",
  "refresh_expires_at": "2026-10-29T01:45:54.320626964Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "640eaae6-86b3-4151-911c-5070060ed7bc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  }
}
```

```json
{
  "id": "02965314-bb06-46fb-83a4-ba7fea92bc4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:50:54.531447Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "633acdb9-f672-4b01-9caa-b58f0cfb8795",
  "quote_id": "02965314-bb06-46fb-83a4-ba7fea92bc4d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

```json
{
  "id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "payment_state": "TERMINAL_EXPECTED",
  "price_minor": 29967,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T13:45:54.765734Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[]
```

## Andrii accepts, drives and reports the card payment went through

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3bcd875e-0fe1-4173-a313-0c73e2dac399",
    "order_id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
    "expires_at": "2026-10-28T13:46:09.76886Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Позняки",
    "payment_method": "TERMINAL",
    "price_minor": 29967,
    "currency": "UAH",
    "distance_m": 656
  }
]
```

`POST /api/driver/v1/offers/3bcd875e-0fe1-4173-a313-0c73e2dac399/accept` → **200**

```json
{
  "command_id": "748b0764-fa18-4924-ab2d-f97fe625d714"
}
```

```json
{
  "id": "513a8df6-793b-4237-80b8-d03d8af5ff35",
  "order_id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00969875-03cb-48f0-b00d-74fa90bc25ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00969875-03cb-48f0-b00d-74fa90bc25ed",
  "order_id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
  "assignment_id": "513a8df6-793b-4237-80b8-d03d8af5ff35",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/work-sessions/6323ce6a-c306-438b-a13f-90af2c5bbaf2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:45:55Z",
    "sequence": 1793195155829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6323ce6a-c306-438b-a13f-90af2c5bbaf2",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:45:55.844586Z",
  "last_location_at": "2026-10-28T13:45:55.844586Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/00969875-03cb-48f0-b00d-74fa90bc25ed/arrive` → **200**

```json
{
  "command_id": "bd2a69bf-9df1-4c6e-a0a8-401146a7035b",
  "expected_version": 0
}
```

```json
{
  "id": "00969875-03cb-48f0-b00d-74fa90bc25ed",
  "order_id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
  "assignment_id": "513a8df6-793b-4237-80b8-d03d8af5ff35",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:45:56.067001Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/00969875-03cb-48f0-b00d-74fa90bc25ed/start` → **200**

```json
{
  "command_id": "6574fb6c-82f3-4888-94b4-1bcea9c74798",
  "expected_version": 1
}
```

```json
{
  "id": "00969875-03cb-48f0-b00d-74fa90bc25ed",
  "order_id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
  "assignment_id": "513a8df6-793b-4237-80b8-d03d8af5ff35",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:45:56.067001Z",
  "started_at": "2026-10-28T13:45:56.283506Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/00969875-03cb-48f0-b00d-74fa90bc25ed/complete` → **200**

```json
{
  "command_id": "7615f937-58e1-4776-bab3-6ce58a36b3ad",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:45:56Z",
  "cash_received": true
}
```

```json
{
  "id": "00969875-03cb-48f0-b00d-74fa90bc25ed",
  "order_id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
  "assignment_id": "513a8df6-793b-4237-80b8-d03d8af5ff35",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "price_minor": 29967,
  "currency": "UAH",
  "arrived_at": "2026-10-28T13:45:56.067001Z",
  "started_at": "2026-10-28T13:45:56.283506Z",
  "completed_at": "2026-10-28T13:45:56.508225Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/e7f737cd-a52e-4ee9-9415-e6a447cc9efa` → **200**

```json
{
  "id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
  "short_number": 22,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "PHONE",
  "payer_client_id": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4016,
    "lon": 30.6522
  },
  "dropoff_label": "Позняки",
  "payment_method": "TERMINAL",
  "payment_state": "TERMINAL_REPORTED",
  "price_minor": 29967,
  "final_price_minor": 29967,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "513a8df6-793b-4237-80b8-d03d8af5ff35",
    "order_id": "e7f737cd-a52e-4ee9-9415-e6a447cc9efa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "00969875-03cb-48f0-b00d-74fa90bc25ed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:45:54.765734Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671112233"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 28209,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "24046080-c4d3-467e-b889-6900a33b5f58",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:45:53.425307Z",
  "last_location_at": "2026-10-28T13:45:53.425307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/24046080-c4d3-467e-b889-6900a33b5f58/close` → **200**

```json
{
  "command_id": "df233aab-454b-41b3-8a3d-136a74476590",
  "expected_version": 1
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6323ce6a-c306-438b-a13f-90af2c5bbaf2",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:45:55.844586Z",
  "last_location_at": "2026-10-28T13:45:55.844586Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6323ce6a-c306-438b-a13f-90af2c5bbaf2/close` → **200**

```json
{
  "command_id": "a88a218d-06b4-44cb-ac7b-f98f6058d881",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
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

Done: terminal order e7f737cd-a52e-4ee9-9415-e6a447cc9efa by Andrii (5a000000-0000-4000-8000-000000000403).
