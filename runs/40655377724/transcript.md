# Sandbox transcript (2026-10-28T08:16:03Z, 2380ff5)

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
  "correlation_id": "0e8e84bb-8ddd-4c2d-996d-e2db4e5efabb"
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
  "session_id": "76f40144-820c-49c4-9c6f-725210610f0b",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyNjQsImlhdCI6MTc5MzE3NTM2NCwianRpIjoiMDUyNDkwNTYtZjM5My00ZGIwLWFkMTItOWE4ZDgyMzMwNjkxIiwic2lkIjoiNzZmNDAxNDQtODIwYy00OWM0LTljNmYtNzI1MjEwNjEwZjBiIn0.a3J-WUV_dhitR4x-I-lCgZaUoM4ixp1WLyWA0eWNAn4",
  "access_expires_at": "2026-10-28T08:31:04.242460075Z",
  "refresh_token": "Np0sp3bQn7snM07Q7NKo3A4qoRCJIOB4HhD7tgrxP6M",
  "refresh_expires_at": "2026-10-28T20:16:04.240195789Z",
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
  "session_id": "0c05b394-a117-49ee-83a5-3153a4a872dd",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyNjUsImlhdCI6MTc5MzE3NTM2NSwianRpIjoiYTc4ZGEyNzAtMTcxYi00NTZkLWIzNjItMWVmNDM4YWNmOTFkIiwic2lkIjoiMGMwNWIzOTQtYTExNy00OWVlLTgzYTUtMzE1M2E0YTg3MmRkIn0.Chf5EHSLF1s5mf7o_idCpnTvA-Se07hUKrbyZLPII2A",
  "access_expires_at": "2026-10-28T08:31:05.548704115Z",
  "refresh_token": "Ka0j3GUcgbQvPzTWhCQNMGbFn6YoraR0lD1lvI4_QAk",
  "refresh_expires_at": "2026-10-28T20:16:05.5477318Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "fd0c2a01-337a-4835-b0ff-ad8d62da4b21",
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
  "id": "fb6a550f-fd3d-4f10-a865-e8e4a3a8e4a2",
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
  "created_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "created_at": "2026-10-28T08:16:05.618055Z",
  "updated_at": "2026-10-28T08:16:05.618055Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631449014",
  "device_ref": "sandbox-28773"
}
```

```json
{
  "challenge_id": "075db89a-9143-47c0-9247-c494be842d49",
  "expires_at": "2026-10-28T08:21:05.670788514Z",
  "resend_available_at": "2026-10-28T08:16:06.670788514Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631449014` → **200**

```json
{
  "phone": "+380631449014",
  "audience": "CLIENT",
  "code": "432567",
  "sent_at": "2026-10-28T08:16:05.680793321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "075db89a-9143-47c0-9247-c494be842d49",
  "code": "432567",
  "device_ref": "sandbox-28773"
}
```

```json
{
  "session_id": "42f6d4a7-ce9b-4b13-8343-729a5e1ab737",
  "subject": {
    "type": "CLIENT",
    "id": "1159d92b-44a2-4824-a103-a17d0749a331"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTU5ZDkyYi00NGEyLTQ4MjQtYTEwMy1hMTdkMDc0OWEzMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MjY1LCJpYXQiOjE3OTMxNzUzNjUsImp0aSI6ImViYjI5YmM5LTE4MTAtNDk2ZC1hMTlkLTA3NWY0MzhmOTM1OCIsInNpZCI6IjQyZjZkNGE3LWNlOWItNGIxMy04MzQzLTcyOWE1ZTFhYjczNyJ9.vUksntlDgcG1oIrbt6BJoeFh6tEA8G9M7noPyG3lcWk",
  "access_expires_at": "2026-10-28T08:31:05.767388709Z",
  "refresh_token": "lWu1i0eBScG5gn3rNox9c470Xpjvg7SzTe8eQi-PqCU",
  "refresh_expires_at": "2026-11-27T08:16:05.766205082Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631449014` → **200**

```json
{
  "client_id": "1159d92b-44a2-4824-a103-a17d0749a331"
}
```

`POST /api/admin/v1/rider-wallets/1159d92b-44a2-4824-a103-a17d0749a331/top-ups` → **201**

```json
{
  "command_id": "c22e2408-d5d5-4280-9cd7-6d0a52efe1db",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1159d92b-44a2-4824-a103-a17d0749a331",
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
      "id": "b6e9225b-e0a4-4d6f-8937-5326ded68fa1",
      "at": "2026-10-28T08:16:05.852119Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "56a41d3f-3eec-4ba0-81ff-a11b45f877a7",
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
  "id": "9e446906-68c9-491d-b00f-7a489a0e8311",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:06.012794Z",
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
      "id": "fb6a550f-fd3d-4f10-a865-e8e4a3a8e4a2",
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
  "device_ref": "sandbox-2057"
}
```

```json
{
  "challenge_id": "acf6e83d-dc8e-431d-9cdd-8c2cf0f945f4",
  "expires_at": "2026-10-28T08:21:06.076759769Z",
  "resend_available_at": "2026-10-28T08:16:07.076759769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "661528",
  "sent_at": "2026-10-28T08:16:06.080726242Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "acf6e83d-dc8e-431d-9cdd-8c2cf0f945f4",
  "code": "661528",
  "device_ref": "sandbox-2057"
}
```

```json
{
  "session_id": "d8d9c6cc-b0f3-4899-bed8-d7153f470ae7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjI2NiwiaWF0IjoxNzkzMTc1MzY2LCJqdGkiOiI5Mzc5ZTBlMS05ZjU2LTQxMWItOWJiMy1jMzY0YmIxMzNhYzMiLCJzaWQiOiJkOGQ5YzZjYy1iMGYzLTQ4OTktYmVkOC1kNzE1M2Y0NzBhZTcifQ.rsO9Ti9W4ILa-DcFXq5rCjq2V5AlSQHBEr8eh4O9KOo",
  "access_expires_at": "2026-10-28T08:31:06.142308926Z",
  "refresh_token": "Rwuo7VjXLCfwiOciiDbepJaXCHQmV9TGaiLCwNW7_JI",
  "refresh_expires_at": "2026-11-27T08:16:06.141161557Z",
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
  "command_id": "fb99d914-7238-454f-b2be-29cca686330f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:06Z",
    "sequence": 1793175366223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "637c8908-dcfb-4800-904f-2b532107546b",
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
  "last_heartbeat_at": "2026-10-28T08:16:06.273537Z",
  "last_location_at": "2026-10-28T08:16:06.273537Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9f1f57d1-8a7b-467a-947d-b01182325351",
  "quote_id": "9e446906-68c9-491d-b00f-7a489a0e8311",
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
  "id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1159d92b-44a2-4824-a103-a17d0749a331",
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
  "created_at": "2026-10-28T08:16:06.3656Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1159d92b-44a2-4824-a103-a17d0749a331",
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
      "id": "b6e9225b-e0a4-4d6f-8937-5326ded68fa1",
      "at": "2026-10-28T08:16:05.852119Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
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
    "id": "97f35acf-4159-4822-a4bb-525611ac9ddf",
    "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
    "expires_at": "2026-10-28T08:16:21.380761Z",
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

`POST /api/driver/v1/offers/97f35acf-4159-4822-a4bb-525611ac9ddf/accept` → **200**

```json
{
  "command_id": "5dbef03c-3afd-4f89-8b08-67271ced8420"
}
```

```json
{
  "id": "61ea5eca-f97f-47f1-ab67-e9b5e230b360",
  "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "169e4e66-0327-49cf-9b36-6de57383d403",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "169e4e66-0327-49cf-9b36-6de57383d403",
  "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
  "assignment_id": "61ea5eca-f97f-47f1-ab67-e9b5e230b360",
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

`POST /api/driver/v1/work-sessions/637c8908-dcfb-4800-904f-2b532107546b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:06Z",
    "sequence": 1793175366576
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "637c8908-dcfb-4800-904f-2b532107546b",
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
  "last_heartbeat_at": "2026-10-28T08:16:06.60235Z",
  "last_location_at": "2026-10-28T08:16:06.60235Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/169e4e66-0327-49cf-9b36-6de57383d403/arrive` → **200**

```json
{
  "command_id": "27268af6-ad0e-4e2a-aba7-41d5eb8822ce",
  "expected_version": 0
}
```

```json
{
  "id": "169e4e66-0327-49cf-9b36-6de57383d403",
  "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
  "assignment_id": "61ea5eca-f97f-47f1-ab67-e9b5e230b360",
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
  "arrived_at": "2026-10-28T08:16:06.653485Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/169e4e66-0327-49cf-9b36-6de57383d403/start` → **200**

```json
{
  "command_id": "f1987db9-1179-455e-99e1-1fcd2369cecd",
  "expected_version": 1
}
```

```json
{
  "id": "169e4e66-0327-49cf-9b36-6de57383d403",
  "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
  "assignment_id": "61ea5eca-f97f-47f1-ab67-e9b5e230b360",
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
  "arrived_at": "2026-10-28T08:16:06.653485Z",
  "started_at": "2026-10-28T08:16:06.701777Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/169e4e66-0327-49cf-9b36-6de57383d403/complete` → **200**

```json
{
  "command_id": "9d54e737-67e1-4168-8584-f8ae0274bea0",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:16:06Z",
  "cash_received": true
}
```

```json
{
  "id": "169e4e66-0327-49cf-9b36-6de57383d403",
  "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
  "assignment_id": "61ea5eca-f97f-47f1-ab67-e9b5e230b360",
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
  "arrived_at": "2026-10-28T08:16:06.653485Z",
  "started_at": "2026-10-28T08:16:06.701777Z",
  "completed_at": "2026-10-28T08:16:06.77351Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1159d92b-44a2-4824-a103-a17d0749a331",
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
      "id": "0cee127e-6285-4553-8033-73e37668213d",
      "at": "2026-10-28T08:16:07.211455Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada"
    },
    {
      "id": "b6e9225b-e0a4-4d6f-8937-5326ded68fa1",
      "at": "2026-10-28T08:16:05.852119Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/fb6a550f-fd3d-4f10-a865-e8e4a3a8e4a2/archive` → **200**

```json
{
  "command_id": "e6e47509-64f7-4bb7-b464-ba00b2fdc136",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "fb6a550f-fd3d-4f10-a865-e8e4a3a8e4a2",
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
  "created_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "created_at": "2026-10-28T08:16:05.618055Z",
  "updated_at": "2026-10-28T08:16:09.870102Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "637c8908-dcfb-4800-904f-2b532107546b",
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
  "last_heartbeat_at": "2026-10-28T08:16:06.60235Z",
  "last_location_at": "2026-10-28T08:16:06.60235Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/637c8908-dcfb-4800-904f-2b532107546b/close` → **200**

```json
{
  "command_id": "8dc9dbc0-3686-42aa-b2ab-91f86902f6bf",
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

Done: order ff17ebe7-0aa5-4f07-87be-d4a5439c7ada.

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
  "session_id": "92f56381-b99d-4454-9729-b191f35f3cdc",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyNzAsImlhdCI6MTc5MzE3NTM3MCwianRpIjoiZWNhYjRmMzctNTNkNC00N2I3LWIyZTItN2M3OGFmMzEyZDdjIiwic2lkIjoiOTJmNTYzODEtYjk5ZC00NDU0LTk3MjktYjE5MWYzNWYzY2RjIn0.ZlIQjT76QlIEIUcZ63gh4vCdYajrFlS9IxzYNZjfHzY",
  "access_expires_at": "2026-10-28T08:31:10.312576944Z",
  "refresh_token": "vArQgJKJvxFUWCGobPDAaAphH_-A7jtaYtJkCiU8gPo",
  "refresh_expires_at": "2026-10-28T20:16:10.311583781Z",
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
  "command_id": "70afff55-15ba-47a3-b245-f977a7806d78",
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
  "session_id": "0b57b0d0-417b-4a11-a345-84b6972b9953",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyNzAsImlhdCI6MTc5MzE3NTM3MCwianRpIjoiMzlmNzVhZGItYmI1YS00NDVmLTkxYTEtNDE3NmI3YzhmMzY4Iiwic2lkIjoiMGI1N2IwZDAtNDE3Yi00YTExLWEzNDUtODRiNjk3MmI5OTUzIn0.kIonHtklNRh7rPpFrmF13ynusiO3FsnAo1e0fWp0YAo",
  "access_expires_at": "2026-10-28T08:31:10.720291987Z",
  "refresh_token": "Ij6bldyKXpwSsGSq5PLmHphWuYCAoSeVziH1dNhqNg4",
  "refresh_expires_at": "2026-10-28T20:16:10.719340561Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.28962146",
    "linkedid": "1730052700.28962146",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679147147"
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
    "id": "1730052700.28962146",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "cfb84fa8-f755-4a41-8280-39502c3b0e89",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679147147",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:16:10.752366Z",
      "answered_at": null,
      "ended_at": "2026-10-28T08:16:10.780287Z",
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
    "id": "1730052600.1970325773",
    "linkedid": "1730052600.1970325773",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679147147"
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
      "id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679147147",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:16:10.856017Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ec7f5e9e-d266-46ef-ac3c-4d117b2c804c/answer` → **200**

```json
{
  "command_id": "a5ea85e5-7cb2-4097-a270-9b443104f650"
}
```

```json
{
  "id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679147147",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "order_ids": [],
  "started_at": "2026-10-28T08:16:10.856017Z",
  "answered_at": "2026-10-28T08:16:10.92581Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1970325773",
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
    "id": "1730052600.1970325773",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679147147",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [],
      "started_at": "2026-10-28T08:16:10.856017Z",
      "answered_at": "2026-10-28T08:16:10.92581Z",
      "ended_at": "2026-10-28T08:16:10.983097Z",
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
      "id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679147147",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [],
      "started_at": "2026-10-28T08:16:10.856017Z",
      "answered_at": "2026-10-28T08:16:10.92581Z",
      "ended_at": "2026-10-28T08:16:10.983097Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:16:12.0442Z"
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
      "id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679147147",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [],
      "started_at": "2026-10-28T08:16:10.856017Z",
      "answered_at": "2026-10-28T08:16:10.92581Z",
      "ended_at": "2026-10-28T08:16:10.983097Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:16:12.0442Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ec7f5e9e-d266-46ef-ac3c-4d117b2c804c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ec7f5e9e-d266-46ef-ac3c-4d117b2c804c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ec7f5e9e-d266-46ef-ac3c-4d117b2c804c` → **200**

```json
{
  "changes": [
    {
      "id": "1ca59328-13de-4d01-99e6-ee5e7f1672bb",
      "occurred_at": "2026-10-28T08:16:13.155215Z",
      "actor_type": "STAFF",
      "actor_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b79660f2-b32e-4695-b8e3-504f6951c709\", \"order_ids\": []}",
      "correlation_id": "3fbceb9e-12cd-4b44-938e-ea554d617dd2"
    },
    {
      "id": "22589770-667b-4998-958d-0cae87467bde",
      "occurred_at": "2026-10-28T08:16:13.118023Z",
      "actor_type": "STAFF",
      "actor_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b79660f2-b32e-4695-b8e3-504f6951c709\", \"order_ids\": []}",
      "correlation_id": "846d567f-346f-429d-b16f-7e47c1118183"
    }
  ]
}
```

Done: call ec7f5e9e-d266-46ef-ac3c-4d117b2c804c recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635993549",
  "device_ref": "sandbox-9078"
}
```

```json
{
  "challenge_id": "77e27088-1e20-4d6e-874d-fc04c8137ac8",
  "expires_at": "2026-10-28T08:21:13.242299956Z",
  "resend_available_at": "2026-10-28T08:16:14.242299956Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635993549` → **200**

```json
{
  "phone": "+380635993549",
  "audience": "CLIENT",
  "code": "543482",
  "sent_at": "2026-10-28T08:16:13.246195305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77e27088-1e20-4d6e-874d-fc04c8137ac8",
  "code": "543482",
  "device_ref": "sandbox-9078"
}
```

```json
{
  "session_id": "ac4f51f7-0b8e-4e7f-8aef-4b3b581fa709",
  "subject": {
    "type": "CLIENT",
    "id": "1752e549-8942-4733-bdf4-84002ccbc9ec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzUyZTU0OS04OTQyLTQ3MzMtYmRmNC04NDAwMmNjYmM5ZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MjczLCJpYXQiOjE3OTMxNzUzNzMsImp0aSI6IjZlODk5Mjk2LWM5NTgtNGRlZC04OTdhLWJiNTVlOTkzY2IyOCIsInNpZCI6ImFjNGY1MWY3LTBiOGUtNGU3Zi04YWVmLTRiM2I1ODFmYTcwOSJ9.w7ra3yzteu9YAlUoSX9CokdZ6RnJOwqHz8rjNbQqL4A",
  "access_expires_at": "2026-10-28T08:31:13.314690263Z",
  "refresh_token": "oZuWxrv9qwxWcoO3JNnbbpbCRk1X_uoCxJ_b-TIdaVY",
  "refresh_expires_at": "2026-11-27T08:16:13.313536615Z",
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
  "device_ref": "sandbox-18351"
}
```

```json
{
  "challenge_id": "1eaa1ac0-d927-4750-9045-5ac72430d44d",
  "expires_at": "2026-10-28T08:21:13.376181239Z",
  "resend_available_at": "2026-10-28T08:16:14.376181239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "165263",
  "sent_at": "2026-10-28T08:16:13.379423621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1eaa1ac0-d927-4750-9045-5ac72430d44d",
  "code": "165263",
  "device_ref": "sandbox-18351"
}
```

```json
{
  "session_id": "809cafd9-1eb1-44a8-8082-dbf1b769892c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjI3MywiaWF0IjoxNzkzMTc1MzczLCJqdGkiOiJlYmQ3NTE3Yi1hZWUwLTQ1YjItOTBiZi04MGNiYzZjYmVhODEiLCJzaWQiOiI4MDljYWZkOS0xZWIxLTQ0YTgtODA4Mi1kYmYxYjc2OTg5MmMifQ.LAx6gRLSJfIHBM6n6sldT5ldURnFyK76_L5aXLozVyc",
  "access_expires_at": "2026-10-28T08:31:13.442124477Z",
  "refresh_token": "uQeBE0Xi6l8SYcd7ShYhZoLdG_8URo5-XO-RqJJ_F4g",
  "refresh_expires_at": "2026-11-27T08:16:13.44137592Z",
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
  "session_id": "33714b87-5e76-4d70-9550-80fec0d91d21",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyNzMsImlhdCI6MTc5MzE3NTM3MywianRpIjoiM2ZhMjAyNGQtMjFhOC00NTRiLTk0OGUtOTJlYzY1M2Q5NzU0Iiwic2lkIjoiMzM3MTRiODctNWU3Ni00ZDcwLTk1NTAtODBmZWMwZDkxZDIxIn0.ODj22CWHq4kX8P4TpEqio-34WraE1qI9GW7K4S6dA8A",
  "access_expires_at": "2026-10-28T08:31:13.789175504Z",
  "refresh_token": "-8Rah2d8ZWE2z-wYmOnWY_Hv9B1XtwHkfg4JnDDsKXs",
  "refresh_expires_at": "2026-10-28T20:16:13.788361835Z",
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
  "session_id": "7bad1d1d-5218-458e-8adb-7c8ff6e54318",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyNzQsImlhdCI6MTc5MzE3NTM3NCwianRpIjoiYmRlYzhhZWMtNDEwZS00NGRhLTg1YTUtNGU1YmY4ZmFmNGViIiwic2lkIjoiN2JhZDFkMWQtNTIxOC00NThlLThhZGItN2M4ZmY2ZTU0MzE4In0.obaZTbd-OJ7mYKyWLH1_01Rxq80YpoGigRrwdt5QMQo",
  "access_expires_at": "2026-10-28T08:31:14.111319974Z",
  "refresh_token": "O7Fqce588StKY7odKduC38dW16rIRxneF5ucSnJ8K3o",
  "refresh_expires_at": "2026-10-28T20:16:14.11052453Z",
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
  "command_id": "42e13c66-0d46-448c-89b1-12bdecde9345",
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
  "id": "4746321e-b5f3-49e3-800a-d221bacbe554",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:21:14.186752Z",
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
  "command_id": "02bebbf8-9794-4f29-af5e-84b23bbf3b66",
  "quote_id": "4746321e-b5f3-49e3-800a-d221bacbe554",
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
  "id": "814fc065-b1aa-4182-834f-8083b4d80aef",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1752e549-8942-4733-bdf4-84002ccbc9ec",
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
  "created_at": "2026-10-28T08:16:14.23441Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/814fc065-b1aa-4182-834f-8083b4d80aef` → **200**

```json
{
  "id": "814fc065-b1aa-4182-834f-8083b4d80aef",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1752e549-8942-4733-bdf4-84002ccbc9ec",
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
  "created_at": "2026-10-28T08:16:14.23441Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/814fc065-b1aa-4182-834f-8083b4d80aef/cancel` → **200**

```json
{
  "command_id": "1548017f-e71f-4426-83dc-4312638d1d89",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "814fc065-b1aa-4182-834f-8083b4d80aef",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1752e549-8942-4733-bdf4-84002ccbc9ec",
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
  "created_at": "2026-10-28T08:16:14.23441Z",
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
  "discount_minor": 0
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
  "command_id": "0590f215-a7a4-461c-bb80-521927c2d020",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:14Z",
    "sequence": 1793175374389
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cee39274-bd1f-43c8-8eb5-71915218e7ae",
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
  "last_heartbeat_at": "2026-10-28T08:16:14.411047Z",
  "last_location_at": "2026-10-28T08:16:14.411047Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-602"
}
```

```json
{
  "challenge_id": "069c7a1f-4725-4090-8e8b-483e487707c0",
  "expires_at": "2026-10-28T08:21:14.443992621Z",
  "resend_available_at": "2026-10-28T08:16:15.443992621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "841648",
  "sent_at": "2026-10-28T08:16:14.447419053Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "069c7a1f-4725-4090-8e8b-483e487707c0",
  "code": "841648",
  "device_ref": "sandbox-602"
}
```

```json
{
  "session_id": "0770b912-e8ae-41f0-8eb0-8359e5be2b4c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjI3NCwiaWF0IjoxNzkzMTc1Mzc0LCJqdGkiOiJhZGEwMDU3NS1mM2RhLTRmNjQtYWU4Mi05OGUzZjk3YWU0NWMiLCJzaWQiOiIwNzcwYjkxMi1lOGFlLTQxZjAtOGViMC04MzU5ZTViZTJiNGMifQ.OH9lZk3NVhPITXYvMKoEUih7azSagE99k1jVs_ZPThk",
  "access_expires_at": "2026-10-28T08:31:14.51061779Z",
  "refresh_token": "Ad1N6hrUdT4bP0IYtn_qAeM5J-gx7ZrtCMX74zeMaGA",
  "refresh_expires_at": "2026-11-27T08:16:14.509857031Z",
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
  "command_id": "1a7354d1-1610-4588-9da6-91fc4f98bd4d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:14Z",
    "sequence": 1793175374566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1350945a-922c-46a1-9cd1-9f4a13577eb2",
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
  "last_heartbeat_at": "2026-10-28T08:16:14.587346Z",
  "last_location_at": "2026-10-28T08:16:14.587346Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "760ecdd9-e4f1-47e4-8bcb-aa19e527e4fe",
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
  "id": "d07c5a41-1f60-41ed-b245-4b446c5ac6e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:21:14.631694Z",
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
  "command_id": "36b56100-3017-4655-8ea9-244f7c2cee8b",
  "quote_id": "d07c5a41-1f60-41ed-b245-4b446c5ac6e7",
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
  "id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1752e549-8942-4733-bdf4-84002ccbc9ec",
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
  "created_at": "2026-10-28T08:16:14.67761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "59b751d6-66f4-41ee-9c6b-65cb6c0dedf9",
    "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
    "expires_at": "2026-10-28T08:16:29.685033Z",
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

`POST /api/driver/v1/offers/59b751d6-66f4-41ee-9c6b-65cb6c0dedf9/accept` → **200**

```json
{
  "command_id": "40a4f6d6-37dd-4eaa-99ee-6a98dbf0abbc"
}
```

```json
{
  "id": "d6271bda-c4a2-4c41-be11-78747feb0c64",
  "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f9441abd-1f06-4e22-b11a-10f832912d62",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f9441abd-1f06-4e22-b11a-10f832912d62",
  "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "assignment_id": "d6271bda-c4a2-4c41-be11-78747feb0c64",
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

`POST /api/driver/v1/trips/f9441abd-1f06-4e22-b11a-10f832912d62/cancel` → **200**

```json
{
  "command_id": "682f87ec-b497-42f7-819b-a8d025be5154",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "f9441abd-1f06-4e22-b11a-10f832912d62",
  "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "assignment_id": "d6271bda-c4a2-4c41-be11-78747feb0c64",
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

`GET /api/rider/v1/orders/dc5de50c-eb4e-404a-88a1-20fe908d4d71` → **200**

```json
{
  "id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1752e549-8942-4733-bdf4-84002ccbc9ec",
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
    "id": "d6271bda-c4a2-4c41-be11-78747feb0c64",
    "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f9441abd-1f06-4e22-b11a-10f832912d62",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:16:14.67761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d126d313-de13-4514-8769-07f48ccf2c76",
    "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
    "expires_at": "2026-10-28T08:16:29.861835Z",
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

`POST /api/driver/v1/offers/d126d313-de13-4514-8769-07f48ccf2c76/accept` → **200**

```json
{
  "command_id": "c91581f7-e248-4600-a194-399e8bef4c86"
}
```

```json
{
  "id": "b0f3a5d3-d1fe-4cfc-a72e-f51edc8e2300",
  "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5232620d-42dd-4aae-8b27-cb15b0527be2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5232620d-42dd-4aae-8b27-cb15b0527be2",
  "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "assignment_id": "b0f3a5d3-d1fe-4cfc-a72e-f51edc8e2300",
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

`POST /api/driver/v1/trips/5232620d-42dd-4aae-8b27-cb15b0527be2/cancel` → **200**

```json
{
  "command_id": "e758c835-ba4f-4f61-b910-eba332756707",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "5232620d-42dd-4aae-8b27-cb15b0527be2",
  "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
  "assignment_id": "b0f3a5d3-d1fe-4cfc-a72e-f51edc8e2300",
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
    "id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:16:14.67761Z",
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
    "id": "814fc065-b1aa-4182-834f-8083b4d80aef",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:16:14.23441Z",
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

`GET /api/operator/v1/orders/dc5de50c-eb4e-404a-88a1-20fe908d4d71/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:16:14.679029Z",
      "actor": {
        "type": "CLIENT",
        "id": "1752e549-8942-4733-bdf4-84002ccbc9ec",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
        "quote_id": "d07c5a41-1f60-41ed-b245-4b446c5ac6e7",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:16:14.683121Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
        "attempt_id": "5b92d8a3-222b-4841-b041-12f656e8f589",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:16:14.696739Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "59b751d6-66f4-41ee-9c6b-65cb6c0dedf9",
        "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:16:14.773744Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "59b751d6-66f4-41ee-9c6b-65cb6c0dedf9",
        "order_id": "dc5de50c-eb4e-404a-88a1-20fe908d4d71",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d6271bda-c4a2-4c41-be11-78747feb0c64"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 814fc065-b1aa-4182-834f-8083b4d80aef, dc5de50c-eb4e-404a-88a1-20fe908d4d71.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734557381",
  "device_ref": "sandbox-21966"
}
```

```json
{
  "challenge_id": "b14536ce-6f1c-42f5-b2d4-53c8b9b928c1",
  "expires_at": "2026-10-28T08:21:15.180893435Z",
  "resend_available_at": "2026-10-28T08:16:16.180893435Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734557381` → **200**

```json
{
  "phone": "+380734557381",
  "audience": "CLIENT",
  "code": "478392",
  "sent_at": "2026-10-28T08:16:15.184188864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b14536ce-6f1c-42f5-b2d4-53c8b9b928c1",
  "code": "478392",
  "device_ref": "sandbox-21966"
}
```

```json
{
  "session_id": "6164591b-f571-4fb9-9ed1-ea6f6db718c2",
  "subject": {
    "type": "CLIENT",
    "id": "487713aa-14ad-4c56-9434-1e26688bfed9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODc3MTNhYS0xNGFkLTRjNTYtOTQzNC0xZTI2Njg4YmZlZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2Mjc1LCJpYXQiOjE3OTMxNzUzNzUsImp0aSI6ImU5NDAzZGEwLTgxYWUtNGM2MC05MmEyLTlkZWVhMzI0ZGE0NCIsInNpZCI6IjYxNjQ1OTFiLWY1NzEtNGZiOS05ZWQxLWVhNmY2ZGI3MThjMiJ9.hl39B_i02eMctYhz9_Z8gAQPZwG08qxFyMGT_V5edMM",
  "access_expires_at": "2026-10-28T08:31:15.257750816Z",
  "refresh_token": "dmwKqOVb3BaNhNI01FrM-_3yxRQHqYpakkSRn9ZxHtY",
  "refresh_expires_at": "2026-11-27T08:16:15.256519819Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2facf90e-a6be-44da-b121-cc586cf42ec9",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6357c761-7343-4aa2-a227-84c4340b962c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6357c761-7343-4aa2-a227-84c4340b962c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "11b9b8a8220d7f01e3ac50cd221ab2dc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6357c761-7343-4aa2-a227-84c4340b962c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734557381"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6357c761-7343-4aa2-a227-84c4340b962c",
  "expires_at": "2026-10-28T08:46:15.325739Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/6357c761-7343-4aa2-a227-84c4340b962c` → **200**

```json
{
  "id": "6357c761-7343-4aa2-a227-84c4340b962c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:46:15.325739Z",
  "card": {
    "id": "7fe3ff06-4b75-412e-be79-e7a89d4b2432",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7430",
    "card_type": "Visa",
    "created_at": "2026-10-28T08:16:15.407906Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "7fe3ff06-4b75-412e-be79-e7a89d4b2432",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7430",
      "card_type": "Visa",
      "created_at": "2026-10-28T08:16:15.407906Z"
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
  "device_ref": "sandbox-14496"
}
```

```json
{
  "challenge_id": "022ad480-1047-4a46-bb06-85187d70f7f1",
  "expires_at": "2026-10-28T08:21:15.507475087Z",
  "resend_available_at": "2026-10-28T08:16:16.507475087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "651290",
  "sent_at": "2026-10-28T08:16:15.510375389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "022ad480-1047-4a46-bb06-85187d70f7f1",
  "code": "651290",
  "device_ref": "sandbox-14496"
}
```

```json
{
  "session_id": "69fe90f0-2e11-4af2-99ea-84e688a83764",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjI3NSwiaWF0IjoxNzkzMTc1Mzc1LCJqdGkiOiJhYzQzYzIyYi05NWE2LTRjNjMtODhlOS0wNmM1MDU2M2Q4ODAiLCJzaWQiOiI2OWZlOTBmMC0yZTExLTRhZjItOTllYS04NGU2ODhhODM3NjQifQ.wBdYZXsToJ7zMIZFEbaJsHsEJGdDOEjci4j2ewHGul0",
  "access_expires_at": "2026-10-28T08:31:15.570298359Z",
  "refresh_token": "6Mzo7gKc6pplPPLm1zjSkdAwHA93qNlB3yyiLaz6IKU",
  "refresh_expires_at": "2026-11-27T08:16:15.569571598Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1350945a-922c-46a1-9cd1-9f4a13577eb2",
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
  "last_heartbeat_at": "2026-10-28T08:16:14.587346Z",
  "last_location_at": "2026-10-28T08:16:14.587346Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1350945a-922c-46a1-9cd1-9f4a13577eb2/handover` → **200**

```json
{
  "command_id": "4ab7d8e9-d187-49ac-956d-301d5c75848f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1350945a-922c-46a1-9cd1-9f4a13577eb2",
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
  "last_heartbeat_at": "2026-10-28T08:16:14.587346Z",
  "last_location_at": "2026-10-28T08:16:14.587346Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1350945a-922c-46a1-9cd1-9f4a13577eb2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:15Z",
    "sequence": 1793175375671
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1350945a-922c-46a1-9cd1-9f4a13577eb2",
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
  "last_heartbeat_at": "2026-10-28T08:16:15.69216Z",
  "last_location_at": "2026-10-28T08:16:15.69216Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2863ec0d-979c-4e22-b569-8b97360b4084",
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
  "id": "0aa9b227-48bc-4bb1-82ae-f2381b1d1dca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T08:21:15.734758Z",
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
  "command_id": "3513419a-f817-4ab4-bbc1-10d2211702af",
  "quote_id": "0aa9b227-48bc-4bb1-82ae-f2381b1d1dca",
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
  "payment_method": "CARD"
}
```

```json
{
  "id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "487713aa-14ad-4c56-9434-1e26688bfed9",
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
  "created_at": "2026-10-28T08:16:15.778528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4` → **200**

```json
{
  "id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "487713aa-14ad-4c56-9434-1e26688bfed9",
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
  "created_at": "2026-10-28T08:16:15.778528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4` → **200**

```json
{
  "id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "487713aa-14ad-4c56-9434-1e26688bfed9",
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
  "created_at": "2026-10-28T08:16:15.778528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "8955368f-43a5-4570-bf5d-d2b1c3d3a371",
    "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
    "expires_at": "2026-10-28T08:16:31.391383Z",
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

`POST /api/driver/v1/offers/8955368f-43a5-4570-bf5d-d2b1c3d3a371/accept` → **200**

```json
{
  "command_id": "ae686787-869e-4fd9-8124-9e70b1035585"
}
```

```json
{
  "id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "assignment_id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
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

`POST /api/driver/v1/work-sessions/1350945a-922c-46a1-9cd1-9f4a13577eb2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:16Z",
    "sequence": 1793175376975
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1350945a-922c-46a1-9cd1-9f4a13577eb2",
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
  "last_heartbeat_at": "2026-10-28T08:16:16.997723Z",
  "last_location_at": "2026-10-28T08:16:16.997723Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc/arrive` → **200**

```json
{
  "command_id": "d3591535-0e37-4c3d-ac69-525279859a39",
  "expected_version": 0
}
```

```json
{
  "id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "assignment_id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
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
  "arrived_at": "2026-10-28T08:16:17.04035Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc/start` → **200**

```json
{
  "command_id": "68fdfe73-a945-4f0c-a4b0-9035a613cabc",
  "expected_version": 1
}
```

```json
{
  "id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "assignment_id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
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
  "arrived_at": "2026-10-28T08:16:17.04035Z",
  "started_at": "2026-10-28T08:16:17.086222Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc/complete` → **200**

```json
{
  "command_id": "bc23dca2-5c42-4ccb-bf54-ce554e005413",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:16:17Z"
}
```

```json
{
  "id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "assignment_id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
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
  "arrived_at": "2026-10-28T08:16:17.04035Z",
  "started_at": "2026-10-28T08:16:17.086222Z",
  "completed_at": "2026-10-28T08:16:17.134022Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4` → **200**

```json
{
  "id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "487713aa-14ad-4c56-9434-1e26688bfed9",
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
    "id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
    "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:16:15.778528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4` → **200**

```json
{
  "id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "487713aa-14ad-4c56-9434-1e26688bfed9",
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
    "id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
    "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:16:15.778528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4` → **200**

```json
{
  "id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "487713aa-14ad-4c56-9434-1e26688bfed9",
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
    "id": "6000bbe7-917d-4de9-90b8-d5d5860c17b9",
    "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cb4b9327-83b7-4f49-bd20-7a9ab2bac6cc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:16:15.778528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
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
      "id": "259f3118-1c02-4abf-a5a9-7ad26a08d3d1",
      "at": "2026-10-28T08:16:17.416726Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4/tip` → **200**

```json
{
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
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
  "available_until": "2026-10-29T08:16:17.134022Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4/tip` → **201**

```json
{
  "command_id": "05f81f19-af2d-4bc4-8221-a72de444e782",
  "amount_minor": 2500
}
```

```json
{
  "id": "7991ac51-193c-4dbb-965f-059caaca23c8",
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T08:16:19.378781Z"
}
```

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4/tip` → **200**

```json
{
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
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
  "available_until": "2026-10-29T08:16:17.134022Z",
  "open": false,
  "tip": {
    "id": "7991ac51-193c-4dbb-965f-059caaca23c8",
    "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T08:16:19.378781Z"
  }
}
```

`GET /api/rider/v1/orders/86d02fd4-5bd4-402a-82f3-f84db44eb5a4/tip` → **200**

```json
{
  "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
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
  "available_until": "2026-10-29T08:16:17.134022Z",
  "open": false,
  "tip": {
    "id": "7991ac51-193c-4dbb-965f-059caaca23c8",
    "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T08:16:19.378781Z"
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
      "id": "259f3118-1c02-4abf-a5a9-7ad26a08d3d1",
      "at": "2026-10-28T08:16:17.416726Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
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
      "id": "10bffca6-79bb-4054-bc58-4507b0814092",
      "at": "2026-10-28T08:16:20.512625Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
      "counterpart_id": null
    },
    {
      "id": "259f3118-1c02-4abf-a5a9-7ad26a08d3d1",
      "at": "2026-10-28T08:16:17.416726Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "86d02fd4-5bd4-402a-82f3-f84db44eb5a4",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1350945a-922c-46a1-9cd1-9f4a13577eb2",
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
  "last_heartbeat_at": "2026-10-28T08:16:16.997723Z",
  "last_location_at": "2026-10-28T08:16:16.997723Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1350945a-922c-46a1-9cd1-9f4a13577eb2/close` → **200**

```json
{
  "command_id": "cb3b2e16-21e6-479b-b2fe-6e5212d96c84",
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

Done: card order 86d02fd4-5bd4-402a-82f3-f84db44eb5a4.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730002473",
  "device_ref": "sandbox-24571"
}
```

```json
{
  "challenge_id": "67eb41fa-cbba-4ef0-93a5-7473b9c5242b",
  "expires_at": "2026-10-28T08:21:21.633703393Z",
  "resend_available_at": "2026-10-28T08:16:22.633703393Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730002473` → **200**

```json
{
  "phone": "+380730002473",
  "audience": "CLIENT",
  "code": "316832",
  "sent_at": "2026-10-28T08:16:21.637029508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67eb41fa-cbba-4ef0-93a5-7473b9c5242b",
  "code": "316832",
  "device_ref": "sandbox-24571"
}
```

```json
{
  "session_id": "bfc9b1f1-3441-4110-b6ea-6fb7d27791aa",
  "subject": {
    "type": "CLIENT",
    "id": "9cf38cd4-6687-4ce3-b300-e8e6257b9777"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Y2YzOGNkNC02Njg3LTRjZTMtYjMwMC1lOGU2MjU3Yjk3NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MjgxLCJpYXQiOjE3OTMxNzUzODEsImp0aSI6IjY3ZTQxNmQ5LTVmNjEtNDk0MC1iMTBiLWRhYzc0YTE2YjNjOSIsInNpZCI6ImJmYzliMWYxLTM0NDEtNDExMC1iNmVhLTZmYjdkMjc3OTFhYSJ9.4LnAoOPJZ2iI2FskSKZjfQynpYJ8bCdFi6quAk6FV7E",
  "access_expires_at": "2026-10-28T08:31:21.701331826Z",
  "refresh_token": "iAsgEwdBMl7Py-ndLNZ6a2pA8gK3O8yLHhbiu7lMwyc",
  "refresh_expires_at": "2026-11-27T08:16:21.700591843Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "028c6e45-34ea-47d1-891a-8a071b0be1b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "db20a787-411d-49f1-99c8-04e4bbc46666",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-db20a787-411d-49f1-99c8-04e4bbc46666",
    "orderDate": "1793175381",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "d16004a5a30d3282ab2801292b4e3313",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=db20a787-411d-49f1-99c8-04e4bbc46666",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730002473"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=db20a787-411d-49f1-99c8-04e4bbc46666",
  "created_at": "2026-10-28T08:16:21.742913Z",
  "expires_at": "2026-10-28T08:46:21.742913Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/db20a787-411d-49f1-99c8-04e4bbc46666` → **200**

```json
{
  "id": "db20a787-411d-49f1-99c8-04e4bbc46666",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:16:21.742913Z",
  "expires_at": "2026-10-28T08:46:21.742913Z",
  "completed_at": "2026-10-28T08:16:21.786383Z",
  "masked_pan": "41****7725",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9cf38cd4-6687-4ce3-b300-e8e6257b9777",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9cf38cd4-6687-4ce3-b300-e8e6257b9777",
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
      "id": "3d1be174-28f8-4a9d-a476-3c3fc5a7081e",
      "at": "2026-10-28T08:16:22.527145Z",
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
  "client_id": "9cf38cd4-6687-4ce3-b300-e8e6257b9777",
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
      "id": "3d1be174-28f8-4a9d-a476-3c3fc5a7081e",
      "at": "2026-10-28T08:16:22.527145Z",
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
  "device_ref": "sandbox-4421"
}
```

```json
{
  "challenge_id": "a095c0f0-7dd3-4712-8a7a-05720105b3f2",
  "expires_at": "2026-10-28T08:21:22.944174275Z",
  "resend_available_at": "2026-10-28T08:16:23.944174275Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "545701",
  "sent_at": "2026-10-28T08:16:22.947838219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a095c0f0-7dd3-4712-8a7a-05720105b3f2",
  "code": "545701",
  "device_ref": "sandbox-4421"
}
```

```json
{
  "session_id": "216103eb-2fb6-4cb0-81c4-f68fb5a8410e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjI4MywiaWF0IjoxNzkzMTc1MzgzLCJqdGkiOiJlMzY0ZDhhNy1mNDEzLTQwN2MtYTVkNS0xMzJjMWIzZjNkYjciLCJzaWQiOiIyMTYxMDNlYi0yZmI2LTRjYjAtODFjNC1mNjhmYjVhODQxMGUifQ.dx6JjY4-GcBSzo29cTCWMS7w2jxHE0pebb3WVDQcgRc",
  "access_expires_at": "2026-10-28T08:31:23.013817393Z",
  "refresh_token": "eo5LKsBhzhK3yOukYkO00xElYFsfe2ovQ5WKgLTiZIE",
  "refresh_expires_at": "2026-11-27T08:16:23.013143966Z",
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
  "command_id": "fd8de633-da6f-41fb-92aa-98fc079d6fc7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "64fb3edd-e6ab-4d2f-bdde-381464659771",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-64fb3edd-e6ab-4d2f-bdde-381464659771",
    "orderDate": "1793175383",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "389beac35a6b3c230063edef4f4b753b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=64fb3edd-e6ab-4d2f-bdde-381464659771",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=64fb3edd-e6ab-4d2f-bdde-381464659771",
  "created_at": "2026-10-28T08:16:23.078191Z",
  "expires_at": "2026-10-28T08:46:23.078191Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/64fb3edd-e6ab-4d2f-bdde-381464659771` → **200**

```json
{
  "id": "64fb3edd-e6ab-4d2f-bdde-381464659771",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:16:23.078191Z",
  "expires_at": "2026-10-28T08:46:23.078191Z",
  "completed_at": "2026-10-28T08:16:23.114119Z",
  "masked_pan": "41****7893",
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
      "id": "396e94f3-82bf-48c0-b756-6911f6619336",
      "at": "2026-10-28T08:16:23.539139Z",
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
  "command_id": "779d95c9-1850-4037-9a56-ba4bbe2524c4",
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
  "correlation_id": "d1be8ea1-1c3f-42df-89ff-c2636a418995"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677439504",
  "device_ref": "sandbox-8270"
}
```

```json
{
  "challenge_id": "892493aa-bcab-4c8d-8c04-2be2ddb17ae0",
  "expires_at": "2026-10-28T08:21:24.273447179Z",
  "resend_available_at": "2026-10-28T08:16:25.273447179Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677439504` → **200**

```json
{
  "phone": "+380677439504",
  "audience": "CLIENT",
  "code": "202273",
  "sent_at": "2026-10-28T08:16:24.276286897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "892493aa-bcab-4c8d-8c04-2be2ddb17ae0",
  "code": "202273",
  "device_ref": "sandbox-8270"
}
```

```json
{
  "session_id": "4736ec6d-f405-4897-b321-c9430cf90bc3",
  "subject": {
    "type": "CLIENT",
    "id": "afe5e1a0-880c-4300-bb1f-fb568427a3c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmU1ZTFhMC04ODBjLTQzMDAtYmIxZi1mYjU2ODQyN2EzYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2Mjg0LCJpYXQiOjE3OTMxNzUzODQsImp0aSI6IjY4ZDAzMDg0LTY1NDgtNDgxOC04ZjI0LTY0Mzc4MzliZDM0ZCIsInNpZCI6IjQ3MzZlYzZkLWY0MDUtNDg5Ny1iMzIxLWM5NDMwY2Y5MGJjMyJ9.2GgDTdG78HRaeQacebxC6mndGhbmc8-muX3S40hvk2U",
  "access_expires_at": "2026-10-28T08:31:24.338893952Z",
  "refresh_token": "fN1STaQeMhNmCRda6Y51V55N2_IuRQkLYcTq_uRtFRE",
  "refresh_expires_at": "2026-11-27T08:16:24.338356228Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "afe5e1a0-880c-4300-bb1f-fb568427a3c3",
  "session_id": "4736ec6d-f405-4897-b321-c9430cf90bc3",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f5e4c6cb-ed07-4cd1-90cf-52a9d34bb6c0",
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
  "id": "53d65f25-0bf9-4bf6-8069-9388ce10b631",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:24.403691Z",
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
  "challenge_id": "797c624b-dfa1-4d11-8404-d606cedc93b9",
  "expires_at": "2026-10-28T08:21:26.443721443Z",
  "resend_available_at": "2026-10-28T08:16:27.443721443Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677439504` → **200**

```json
{
  "phone": "+380677439504",
  "audience": "CLIENT",
  "code": "790240",
  "sent_at": "2026-10-28T08:16:26.446287772Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "43f030a2-b27d-4b77-a193-9b5c78f24f96",
  "challenge_id": "797c624b-dfa1-4d11-8404-d606cedc93b9",
  "otp_code": "790240"
}
```

```json
{
  "client_id": "afe5e1a0-880c-4300-bb1f-fb568427a3c3",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T08:16:26.516481064Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f24a97d9-0d41-4068-9a6d-52680abab471",
  "quote_id": "53d65f25-0bf9-4bf6-8069-9388ce10b631",
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
  "correlation_id": "bb5f6adc-ab90-4f9f-b16a-7666b8cc2b29"
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
  "session_id": "1d133556-819e-470c-87e4-106415e7bc94",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyODYsImlhdCI6MTc5MzE3NTM4NiwianRpIjoiZGYyNjQxZmEtMzRmNS00ZTI4LWI3NzUtZWFhOTEzNzdjZmQzIiwic2lkIjoiMWQxMzM1NTYtODE5ZS00NzBjLTg3ZTQtMTA2NDE1ZTdiYzk0In0.oLC-qUvfdnCO_RO19UFok5XA1eQTqCBI94ryzdKq5GI",
  "access_expires_at": "2026-10-28T08:31:26.910558807Z",
  "refresh_token": "NoZsapPnHO0q6rr0nqYrxNLL_zOJQgK2qgRUv6Q2Eto",
  "refresh_expires_at": "2026-10-28T20:16:26.90992782Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "afe5e1a0-880c-4300-bb1f-fb568427a3c3",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T08:16:26.516481Z",
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

`POST /api/admin/v1/client-deletions/afe5e1a0-880c-4300-bb1f-fb568427a3c3/complete` → **200**

```json
{
  "command_id": "3e25b069-b86f-41cf-b84d-bd4b1c28100d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "afe5e1a0-880c-4300-bb1f-fb568427a3c3",
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
  "correlation_id": "b38a48da-8eb1-4b7f-8633-02c70a7da4b5"
}
```

Done: client afe5e1a0-880c-4300-bb1f-fb568427a3c3 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664783842",
  "device_ref": "sandbox-8648"
}
```

```json
{
  "challenge_id": "d3adb920-cc44-4578-ac66-1c6d73055184",
  "expires_at": "2026-10-28T08:21:27.063700202Z",
  "resend_available_at": "2026-10-28T08:16:28.063700202Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664783842` → **200**

```json
{
  "phone": "+380664783842",
  "audience": "CLIENT",
  "code": "452097",
  "sent_at": "2026-10-28T08:16:27.066329109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3adb920-cc44-4578-ac66-1c6d73055184",
  "code": "452097",
  "device_ref": "sandbox-8648"
}
```

```json
{
  "session_id": "a200f2db-ac3a-4e78-b044-461a35a57c65",
  "subject": {
    "type": "CLIENT",
    "id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDJiZjU3ZC1lZDQxLTQ2YTQtOTZkNy1lYWIwMWM0YmM1YzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2Mjg3LCJpYXQiOjE3OTMxNzUzODcsImp0aSI6ImI1NTQ4YTY3LTZhOWQtNDEzZC05M2E3LTI1MDVmYjkyYTQyOSIsInNpZCI6ImEyMDBmMmRiLWFjM2EtNGU3OC1iMDQ0LTQ2MWEzNWE1N2M2NSJ9.ak3v1IvI-vQsqfuHevkoD8vmV_RpaqGZrD3m8pVTkhs",
  "access_expires_at": "2026-10-28T08:31:27.124143819Z",
  "refresh_token": "DFANjt2vr-VyFnXx57ZCUD0J9lhrdg2_kw4PcpFq0ao",
  "refresh_expires_at": "2026-11-27T08:16:27.123540723Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5",
  "session_id": "a200f2db-ac3a-4e78-b044-461a35a57c65",
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
  "session_id": "a9634781-e629-48c8-a45e-006b59160882",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyODcsImlhdCI6MTc5MzE3NTM4NywianRpIjoiMzdiYjk2ZTktY2Y2My00YTQwLThkNGQtNTA4NGUzOGFlZjNhIiwic2lkIjoiYTk2MzQ3ODEtZTYyOS00OGM4LWE0NWUtMDA2YjU5MTYwODgyIn0.__TqYKbDm2eFZrb8tfG0vTsXrRHON9nRoKGXXyp_EM8",
  "access_expires_at": "2026-10-28T08:31:27.488742075Z",
  "refresh_token": "OlrmFldy4gkrhd352qfE1oxBTOxVgFeAPH_-0vth3_I",
  "refresh_expires_at": "2026-10-28T20:16:27.488056205Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4783842&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5",
      "phone": "+380664783842",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T08:16:27.121381Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/302bf57d-ed41-46a4-96d7-eab01c4bc5c5` → **200**

```json
{
  "client": {
    "id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5",
    "phone": "+380664783842",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T08:16:27.121381Z",
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

`POST /api/admin/v1/clients/302bf57d-ed41-46a4-96d7-eab01c4bc5c5/block` → **400**

```json
{
  "command_id": "54cc4bbd-17cf-4dec-8ea6-bc8b256ffa9c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/302bf57d-ed41-46a4-96d7-eab01c4bc5c5/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "da29b70e-6601-4f91-aad3-1a8c0fd01272",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/302bf57d-ed41-46a4-96d7-eab01c4bc5c5/block` → **200**

```json
{
  "command_id": "cab0db7a-17ab-4fff-8fd2-62340d449cd1",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5",
  "phone": "+380664783842",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T08:16:27.121381Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T08:16:27.675781Z",
    "by": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
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
  "correlation_id": "bc11fb63-7daf-4bdf-9630-628bf628a718"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664783842",
  "device_ref": "sandbox-1162"
}
```

```json
{
  "challenge_id": "49b1083f-7256-4782-93ba-1d28a4fa7531",
  "expires_at": "2026-10-28T08:21:29.738567095Z",
  "resend_available_at": "2026-10-28T08:16:30.738567095Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664783842` → **200**

```json
{
  "phone": "+380664783842",
  "audience": "CLIENT",
  "code": "530394",
  "sent_at": "2026-10-28T08:16:29.742099537Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "49b1083f-7256-4782-93ba-1d28a4fa7531",
  "code": "530394",
  "device_ref": "sandbox-1162"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "4f6c4008-54a5-4ddc-b8a8-452f663f72d5"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/302bf57d-ed41-46a4-96d7-eab01c4bc5c5` → **200**

```json
{
  "client": {
    "id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5",
    "phone": "+380664783842",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T08:16:27.121381Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T08:16:27.675781Z",
      "by": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
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

`POST /api/admin/v1/clients/302bf57d-ed41-46a4-96d7-eab01c4bc5c5/unblock` → **200**

```json
{
  "command_id": "ae0ef30f-2bb6-4c11-b335-f4fa854b3b8e",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5",
  "phone": "+380664783842",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T08:16:27.121381Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664783842",
  "device_ref": "sandbox-2120"
}
```

```json
{
  "challenge_id": "f5452b52-57b2-4eef-b30e-7c508b84ece4",
  "expires_at": "2026-10-28T08:21:31.906304909Z",
  "resend_available_at": "2026-10-28T08:16:32.906304909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664783842` → **200**

```json
{
  "phone": "+380664783842",
  "audience": "CLIENT",
  "code": "115781",
  "sent_at": "2026-10-28T08:16:31.908936871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5452b52-57b2-4eef-b30e-7c508b84ece4",
  "code": "115781",
  "device_ref": "sandbox-2120"
}
```

```json
{
  "session_id": "dfdc346d-778a-4027-b901-90fe55e3241b",
  "subject": {
    "type": "CLIENT",
    "id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDJiZjU3ZC1lZDQxLTQ2YTQtOTZkNy1lYWIwMWM0YmM1YzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MjkxLCJpYXQiOjE3OTMxNzUzOTEsImp0aSI6ImViNTFmMmYyLTY2ZWMtNDU2OC1hNzZkLTc1NTE0ZTUyYzRiOCIsInNpZCI6ImRmZGMzNDZkLTc3OGEtNDAyNy1iOTAxLTkwZmU1NWUzMjQxYiJ9.C6YotBoe4tEl8cpKgdRbislciEchiZc4StlAe9gz0Rc",
  "access_expires_at": "2026-10-28T08:31:31.971133866Z",
  "refresh_token": "5m3reYBaUsxvgUehH_H_ltRlWuvyyJo4P1SPC8Eghb4",
  "refresh_expires_at": "2026-11-27T08:16:31.970387752Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "302bf57d-ed41-46a4-96d7-eab01c4bc5c5",
  "session_id": "dfdc346d-778a-4027-b901-90fe55e3241b",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636579718",
  "device_ref": "sandbox-12786"
}
```

```json
{
  "challenge_id": "3537c987-8fde-484c-a55d-62ee1f19dbd3",
  "expires_at": "2026-10-28T08:21:32.043912501Z",
  "resend_available_at": "2026-10-28T08:16:33.043912501Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636579718` → **200**

```json
{
  "phone": "+380636579718",
  "audience": "CLIENT",
  "code": "622530",
  "sent_at": "2026-10-28T08:16:32.046839503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3537c987-8fde-484c-a55d-62ee1f19dbd3",
  "code": "622530",
  "device_ref": "sandbox-12786"
}
```

```json
{
  "session_id": "a531bfa8-8bcc-4d9b-81f6-13d59b7e5329",
  "subject": {
    "type": "CLIENT",
    "id": "1b295ca8-08b4-4d6b-8fc6-d9d10ab4c3be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjI5NWNhOC0wOGI0LTRkNmItOGZjNi1kOWQxMGFiNGMzYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MjkyLCJpYXQiOjE3OTMxNzUzOTIsImp0aSI6IjA4NGJlOGUwLTkyYjYtNGZiYi05ODA0LWZkZThmNGEyZWEyOSIsInNpZCI6ImE1MzFiZmE4LThiY2MtNGQ5Yi04MWY2LTEzZDU5YjdlNTMyOSJ9.9nPstUjAjCoF1vje8EUtQWUPAx6CTi9fMCRbOeXwNl4",
  "access_expires_at": "2026-10-28T08:31:32.109288943Z",
  "refresh_token": "FGDRY8406hhDbVSkhjR56JjmHFqs_uL8uBXjG7H5HPw",
  "refresh_expires_at": "2026-11-27T08:16:32.108586102Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "6da3ff64-5ce3-4c8b-b740-ada763984e8e",
  "expires_at": "2026-10-28T08:21:34.141373631Z",
  "resend_available_at": "2026-10-28T08:16:35.141373631Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636579718` → **200**

```json
{
  "phone": "+380636579718",
  "audience": "CLIENT",
  "code": "913522",
  "sent_at": "2026-10-28T08:16:34.143627061Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "73024b9a-5c9a-40b4-9782-a1bd5a9f426e",
  "challenge_id": "6da3ff64-5ce3-4c8b-b740-ada763984e8e",
  "otp_code": "913522"
}
```

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "PENDING",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07` → **200**

```json
{
  "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
  "state": "READY",
  "created_at": "2026-10-28T08:16:34.210196Z",
  "ready_at": "2026-10-28T08:16:42.046403Z",
  "expires_at": "2026-11-04T08:16:42.046403Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630699052",
  "device_ref": "sandbox-2650"
}
```

```json
{
  "challenge_id": "18ff5fd4-cf41-4b95-ad45-78db3fde5a85",
  "expires_at": "2026-10-28T08:21:42.508195726Z",
  "resend_available_at": "2026-10-28T08:16:43.508195726Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630699052` → **200**

```json
{
  "phone": "+380630699052",
  "audience": "CLIENT",
  "code": "343744",
  "sent_at": "2026-10-28T08:16:42.511427915Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18ff5fd4-cf41-4b95-ad45-78db3fde5a85",
  "code": "343744",
  "device_ref": "sandbox-2650"
}
```

```json
{
  "session_id": "230867be-4b90-41e8-a485-96024f550347",
  "subject": {
    "type": "CLIENT",
    "id": "11595b56-1bb1-4a55-a9ab-6f6ae2a61fbe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTU5NWI1Ni0xYmIxLTRhNTUtYTlhYi02ZjZhZTJhNjFmYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzAyLCJpYXQiOjE3OTMxNzU0MDIsImp0aSI6ImU0ZWJkMjFmLTkwYjctNGU4ZS05ODRkLTAwYmU2ZTcxOTMxZSIsInNpZCI6IjIzMDg2N2JlLTRiOTAtNDFlOC1hNDg1LTk2MDI0ZjU1MDM0NyJ9.0hMOZjxJ6xkf6DTXF2p6QUe_t7XY8wES390IK7SvAcc",
  "access_expires_at": "2026-10-28T08:31:42.570894227Z",
  "refresh_token": "kptiA-doVOH2r1ojwbeRXDqB5ALNI1YGONxd3v1Ooe4",
  "refresh_expires_at": "2026-11-27T08:16:42.570265334Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/e01a6bc7-e398-4100-8fed-c738f1cded07/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "279065cf-0a27-4c01-b06d-395cbf2b11a2"
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
  "session_id": "7e0fcc49-6e5a-4a3e-b3fc-d941255c30e5",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMDIsImlhdCI6MTc5MzE3NTQwMiwianRpIjoiOTIyNjk4YTItYjY1Ny00ZGIzLWI4NmMtMWQyMzllZjNjODMwIiwic2lkIjoiN2UwZmNjNDktNmU1YS00YTNlLWIzZmMtZDk0MTI1NWMzMGU1In0.hMuoidM0vpIFQ6tXv99hnG2qeoefdTDf-EJ3eIo_1KQ",
  "access_expires_at": "2026-10-28T08:31:42.919168411Z",
  "refresh_token": "sBY8Zjcmhv-LpqFmzddVGOLXaYmh-9OVQHmdt497LhI",
  "refresh_expires_at": "2026-10-28T20:16:42.918597256Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1b295ca8-08b4-4d6b-8fc6-d9d10ab4c3be",
  "session_id": "a531bfa8-8bcc-4d9b-81f6-13d59b7e5329",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/1b295ca8-08b4-4d6b-8fc6-d9d10ab4c3be/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "e01a6bc7-e398-4100-8fed-c738f1cded07",
      "state": "READY",
      "created_at": "2026-10-28T08:16:34.210196Z",
      "ready_at": "2026-10-28T08:16:42.046403Z",
      "expires_at": "2026-11-04T08:16:42.046403Z",
      "size_bytes": 1029
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
  "device_ref": "sandbox-10935"
}
```

```json
{
  "challenge_id": "aeddbe9e-2dda-4415-907e-0f3c5adc2709",
  "expires_at": "2026-10-28T08:21:43.013941073Z",
  "resend_available_at": "2026-10-28T08:16:44.013941073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "242853",
  "sent_at": "2026-10-28T08:16:43.017200473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aeddbe9e-2dda-4415-907e-0f3c5adc2709",
  "code": "242853",
  "device_ref": "sandbox-10935"
}
```

```json
{
  "session_id": "32a6984d-48fd-4aa0-a311-a9671080e9a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMwMywiaWF0IjoxNzkzMTc1NDAzLCJqdGkiOiIxYTdmN2UyYi04MWI3LTRkMjctOGZjZi01ZjAzOTA1NzZlNTUiLCJzaWQiOiIzMmE2OTg0ZC00OGZkLTRhYTAtYTMxMS1hOTY3MTA4MGU5YTUifQ.l6n4M1Ygmdalkwhkh6tWq1340K6t1fXwnZ3QcdUQfnc",
  "access_expires_at": "2026-10-28T08:31:43.077906668Z",
  "refresh_token": "h7wFcQXO1nOPTTwrt-9b8nJInlKdxqolyHKkZy6V6GY",
  "refresh_expires_at": "2026-11-27T08:16:43.077285812Z",
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
  "device_ref": "sandbox-31369"
}
```

```json
{
  "challenge_id": "9284268f-596c-402a-8170-7b0ce4745ca6",
  "expires_at": "2026-10-28T08:21:43.132679437Z",
  "resend_available_at": "2026-10-28T08:16:44.132679437Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "567730",
  "sent_at": "2026-10-28T08:16:43.135027751Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9284268f-596c-402a-8170-7b0ce4745ca6",
  "code": "567730",
  "device_ref": "sandbox-31369"
}
```

```json
{
  "session_id": "34ec1a8a-5b5c-4b42-8398-49be8ae94b40",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMwMywiaWF0IjoxNzkzMTc1NDAzLCJqdGkiOiJlZDg1ODExMC01Mzg5LTQ0MDItOTZiYS00YzRlMjZlN2M1YmEiLCJzaWQiOiIzNGVjMWE4YS01YjVjLTRiNDItODM5OC00OWJlOGFlOTRiNDAifQ.GDolKwGhkpGmhZbIxwN6OXaE1BjolsGhUdnWMnvvCFE",
  "access_expires_at": "2026-10-28T08:31:43.193502296Z",
  "refresh_token": "UHQILx-5tR6R1WnQ6o_S-mczbXaTmNOd5jMw6jHEBAE",
  "refresh_expires_at": "2026-11-27T08:16:43.192855507Z",
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
  "command_id": "87f71d66-1349-4548-9eea-229c19674b34",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:43Z",
    "sequence": 1793175403246
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "069d0217-0f9c-43b6-af42-28ce381169df",
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
  "last_heartbeat_at": "2026-10-28T08:16:43.266007Z",
  "last_location_at": "2026-10-28T08:16:43.266007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-28538"
}
```

```json
{
  "challenge_id": "53034168-31d1-4261-98a6-b5e8f68c657b",
  "expires_at": "2026-10-28T08:21:43.296508311Z",
  "resend_available_at": "2026-10-28T08:16:44.296508311Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "588341",
  "sent_at": "2026-10-28T08:16:43.298776153Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53034168-31d1-4261-98a6-b5e8f68c657b",
  "code": "588341",
  "device_ref": "sandbox-28538"
}
```

```json
{
  "session_id": "1a633f18-5e02-4e8a-a3b3-a2ae192fe6ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMwMywiaWF0IjoxNzkzMTc1NDAzLCJqdGkiOiIzMGZmNDk2Yi1lYjhlLTRlNTQtYmUxNy02YzYxYWJmZWNhZTgiLCJzaWQiOiIxYTYzM2YxOC01ZTAyLTRlOGEtYTNiMy1hMmFlMTkyZmU2YmEifQ.GH1I6nOmcPZo5WOXZtIUjthW9jWM4hDW_zjm0a_n3Q0",
  "access_expires_at": "2026-10-28T08:31:43.359005653Z",
  "refresh_token": "NtQ1d45Di6zM5_r3BjdOEOrNp6IcHtWkkZQWcb4FcPA",
  "refresh_expires_at": "2026-11-27T08:16:43.358414701Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cee39274-bd1f-43c8-8eb5-71915218e7ae",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:16:14.411047Z",
  "last_location_at": "2026-10-28T08:16:14.411047Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cee39274-bd1f-43c8-8eb5-71915218e7ae/handover` → **200**

```json
{
  "command_id": "979be5d3-9ebe-4780-ba0f-3ce272d17862",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cee39274-bd1f-43c8-8eb5-71915218e7ae",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T08:16:14.411047Z",
  "last_location_at": "2026-10-28T08:16:14.411047Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cee39274-bd1f-43c8-8eb5-71915218e7ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:43Z",
    "sequence": 1793175403449
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cee39274-bd1f-43c8-8eb5-71915218e7ae",
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
  "last_heartbeat_at": "2026-10-28T08:16:43.468885Z",
  "last_location_at": "2026-10-28T08:16:43.468885Z",
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
  "session_id": "f559d3ef-14cc-41f1-b5b8-1bcb4bfb0fa6",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMDMsImlhdCI6MTc5MzE3NTQwMywianRpIjoiMzEyNmRjYWMtMjA0ZC00ZjFlLWE0ZTEtMmIxZjA4ZWIzYWZjIiwic2lkIjoiZjU1OWQzZWYtMTRjYy00MWYxLWI1YjgtMWJjYjRiZmIwZmE2In0.lTQg6pHIJbMul0M21q7Xxw679VeH9daUgBkjNRNfnXU",
  "access_expires_at": "2026-10-28T08:31:43.787355545Z",
  "refresh_token": "_jhTAJ-az3u8btHKIlKFa5WnYuJCLOB7Th0fQVXglhQ",
  "refresh_expires_at": "2026-10-28T20:16:43.786720169Z",
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
  "session_id": "628b8f89-4d01-4274-82eb-5df4cae1c691",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMDQsImlhdCI6MTc5MzE3NTQwNCwianRpIjoiYmY0MmIwMjUtMjdmMi00N2EzLTljZDEtZTkwMmM5Njg2ODM5Iiwic2lkIjoiNjI4YjhmODktNGQwMS00Mjc0LTgyZWItNWRmNGNhZTFjNjkxIn0.hPFF8f6Fd5xSlyft7_KWWeBqAQwz1xvrO5telvcGZhU",
  "access_expires_at": "2026-10-28T08:31:44.107788764Z",
  "refresh_token": "i4GKNxnv8H49waecvpp4tZLarcFUPFOFlSMdT69eLjc",
  "refresh_expires_at": "2026-10-28T20:16:44.107139423Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681661725",
  "device_ref": "sandbox-4506"
}
```

```json
{
  "challenge_id": "50f7827f-5df5-4ba5-a7d1-72a0321098dd",
  "expires_at": "2026-10-28T08:21:44.136277999Z",
  "resend_available_at": "2026-10-28T08:16:45.136277999Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681661725` → **200**

```json
{
  "phone": "+380681661725",
  "audience": "CLIENT",
  "code": "210394",
  "sent_at": "2026-10-28T08:16:44.138548441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50f7827f-5df5-4ba5-a7d1-72a0321098dd",
  "code": "210394",
  "device_ref": "sandbox-4506"
}
```

```json
{
  "session_id": "7ad07c37-a6c9-4791-8908-ca55a4c9ff16",
  "subject": {
    "type": "CLIENT",
    "id": "f658fe7b-87a4-41d1-9a32-85ee24751450"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjU4ZmU3Yi04N2E0LTQxZDEtOWEzMi04NWVlMjQ3NTE0NTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzA0LCJpYXQiOjE3OTMxNzU0MDQsImp0aSI6ImFmZDE2NjFhLWU1MDEtNGFiZC1iM2I2LTYwMjk0MzU2YTFkYSIsInNpZCI6IjdhZDA3YzM3LWE2YzktNDc5MS04OTA4LWNhNTVhNGM5ZmYxNiJ9.J4zq-Sa0Y5NgLxXDrwwZ1NGOhA0gcydA0_pTHAWzDzA",
  "access_expires_at": "2026-10-28T08:31:44.197364773Z",
  "refresh_token": "EseHof0oAC1YiFtnW_qAxPYMw9CRk0CoW65xpIp-umE",
  "refresh_expires_at": "2026-11-27T08:16:44.196806802Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0d0c8806-bdbd-449a-a9cd-2dbc5c3f9598",
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
  "id": "dac2d42c-357b-4ef7-bbbd-661adf4cba41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:44.238099Z",
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
  "command_id": "474fb399-0b04-4715-b31e-715925abde5a",
  "quote_id": "dac2d42c-357b-4ef7-bbbd-661adf4cba41",
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
  "id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f658fe7b-87a4-41d1-9a32-85ee24751450",
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
  "created_at": "2026-10-28T08:16:44.281517Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c4a3cc2a-5287-4a34-83c8-a63a3265470d",
    "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
    "expires_at": "2026-10-28T08:16:59.285811Z",
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

`POST /api/driver/v1/offers/c4a3cc2a-5287-4a34-83c8-a63a3265470d/reject` → **204**

```json
{
  "command_id": "f48e6546-d73f-43ec-a883-6330e0f80fb9"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "aa4e6b98-84e5-4e49-bd4a-4eac58bdb1c2",
    "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
    "expires_at": "2026-10-28T08:16:59.360685Z",
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

`POST /api/driver/v1/offers/aa4e6b98-84e5-4e49-bd4a-4eac58bdb1c2/accept` → **200**

```json
{
  "command_id": "a686a20a-9363-4e1b-9360-4a82d151f423"
}
```

```json
{
  "id": "2faf10d2-da22-42f0-9b21-58ac7b47209d",
  "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ff5f12b7-239b-4354-b33d-c4002bb2d34d",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/131a461d-39a0-4f67-984a-db6b5ae371f1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:16:44.282327Z",
      "actor": {
        "type": "CLIENT",
        "id": "f658fe7b-87a4-41d1-9a32-85ee24751450",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
        "quote_id": "dac2d42c-357b-4ef7-bbbd-661adf4cba41",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:16:44.284629Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
        "attempt_id": "c5ae6c2a-9077-42aa-bdcd-4aa9b6c55eac",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:16:44.292643Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c4a3cc2a-5287-4a34-83c8-a63a3265470d",
        "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      }
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T08:16:44.359342Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c4a3cc2a-5287-4a34-83c8-a63a3265470d",
        "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1"
      }
    },
    {
      "sequence": 4,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:16:44.367576Z",
      "actor": {
        "type": "SYSTEM",
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 131a461d-39a0-4f67-984a-db6b5ae371f1 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/131a461d-39a0-4f67-984a-db6b5ae371f1` → **200**

```json
{
  "id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
  "short_number": 5,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f658fe7b-87a4-41d1-9a32-85ee24751450",
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
    "id": "2faf10d2-da22-42f0-9b21-58ac7b47209d",
    "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ff5f12b7-239b-4354-b33d-c4002bb2d34d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T08:16:44.281517Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/131a461d-39a0-4f67-984a-db6b5ae371f1/cancel` → **200**

```json
{
  "command_id": "da068313-d9b6-4db6-9ca8-07f44344b276",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f658fe7b-87a4-41d1-9a32-85ee24751450",
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
    "id": "2faf10d2-da22-42f0-9b21-58ac7b47209d",
    "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ff5f12b7-239b-4354-b33d-c4002bb2d34d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:16:44.281517Z",
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
  "session_id": "069d0217-0f9c-43b6-af42-28ce381169df",
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
  "last_heartbeat_at": "2026-10-28T08:16:43.266007Z",
  "last_location_at": "2026-10-28T08:16:43.266007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/069d0217-0f9c-43b6-af42-28ce381169df/close` → **200**

```json
{
  "command_id": "a872ab33-6815-4780-b777-1eb0e1b15e20",
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
  "session_id": "cee39274-bd1f-43c8-8eb5-71915218e7ae",
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
  "last_heartbeat_at": "2026-10-28T08:16:43.468885Z",
  "last_location_at": "2026-10-28T08:16:43.468885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cee39274-bd1f-43c8-8eb5-71915218e7ae/close` → **200**

```json
{
  "command_id": "8e661c88-7d9a-4e96-81c6-475a5801998c",
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
      "timezone": "Europe/Warsaw"
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv"
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
  "device_ref": "sandbox-17223"
}
```

```json
{
  "challenge_id": "63636bb0-98e9-46ce-94d8-464b65d03eea",
  "expires_at": "2026-10-28T08:21:44.817387064Z",
  "resend_available_at": "2026-10-28T08:16:45.817387064Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "349962",
  "sent_at": "2026-10-28T08:16:44.820431146Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63636bb0-98e9-46ce-94d8-464b65d03eea",
  "code": "349962",
  "device_ref": "sandbox-17223"
}
```

```json
{
  "session_id": "0af9bd64-8ecb-4fc8-9781-d0f8ccbb0c7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMwNCwiaWF0IjoxNzkzMTc1NDA0LCJqdGkiOiI4MzhkOTUzYy01YTJlLTQyZWItODk1Zi0xNTE2Yzc0MDk2OGEiLCJzaWQiOiIwYWY5YmQ2NC04ZWNiLTRmYzgtOTc4MS1kMGY4Y2NiYjBjN2QifQ.TWMNjY4AZcGlxiOpenUYu7sQEZA54PsXSc6f-EPWRr0",
  "access_expires_at": "2026-10-28T08:31:44.87979129Z",
  "refresh_token": "aBlFX9NtXWUphVRaxgxoSEsZq-0ifjpWihXVXwn2R8Q",
  "refresh_expires_at": "2026-11-27T08:16:44.878938669Z",
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
  "command_id": "62f4531e-45ef-4501-81e9-9f59e605dc25",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:44Z",
    "sequence": 1793175404933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:44.952573Z",
  "last_location_at": "2026-10-28T08:16:44.952573Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675976933",
  "device_ref": "sandbox-32445"
}
```

```json
{
  "challenge_id": "e652dfac-f758-4652-ba11-025cd1464b11",
  "expires_at": "2026-10-28T08:21:44.98607199Z",
  "resend_available_at": "2026-10-28T08:16:45.98607199Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675976933` → **200**

```json
{
  "phone": "+380675976933",
  "audience": "CLIENT",
  "code": "227526",
  "sent_at": "2026-10-28T08:16:44.988340692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e652dfac-f758-4652-ba11-025cd1464b11",
  "code": "227526",
  "device_ref": "sandbox-32445"
}
```

```json
{
  "session_id": "37ed5fdb-52fb-429a-887c-56c6484627f8",
  "subject": {
    "type": "CLIENT",
    "id": "fe9b9a1a-5642-4ab4-b454-f84173b8af34"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTliOWExYS01NjQyLTRhYjQtYjQ1NC1mODQxNzNiOGFmMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzA1LCJpYXQiOjE3OTMxNzU0MDUsImp0aSI6IjZmMDI1NmZjLWQzNTctNDM4MS04Njk2LTAyZGFkNjM4OTFmYiIsInNpZCI6IjM3ZWQ1ZmRiLTUyZmItNDI5YS04ODdjLTU2YzY0ODQ2MjdmOCJ9.0fZ5ZBzJRhYsLZf2fOnfX8Ra0-7Kdayfp8BAQMzbxqw",
  "access_expires_at": "2026-10-28T08:31:45.047032249Z",
  "refresh_token": "1bKBb5lL8LLi8pXh585bKCV6DiAIL3pxH-sBB57GzHE",
  "refresh_expires_at": "2026-11-27T08:16:45.04634708Z",
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
  "command_id": "92b92cbc-7c19-4a0c-b4a1-8daeca2aa707",
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
  "id": "be501ba2-da9c-4309-a471-175c8b158f49",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:45.112706Z",
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
  "command_id": "bb55b09b-124e-48fa-863d-0254f205fea7",
  "platform": "ANDROID",
  "token": "sandbox-driver-73241d93-cebb-4bb3-98de-a130d523ab6d"
}
```

```json
{
  "id": "ed72203f-2a20-4cb8-bb18-e6f116399ab4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:16:45.157304Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "95a6e6f4-ae08-46b8-8141-43ea277ed979",
  "platform": "ANDROID",
  "token": "sandbox-rider-a454defc-3acf-4031-aff5-161ef365ba88"
}
```

```json
{
  "id": "f62376b3-1e12-436d-b6af-d6f920117475",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:16:45.194743Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6d61f6cd-d7e2-429e-be4c-0b2da57a7d5d",
  "quote_id": "be501ba2-da9c-4309-a471-175c8b158f49",
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
  "id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe9b9a1a-5642-4ab4-b454-f84173b8af34",
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
  "created_at": "2026-10-28T08:16:45.241921Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "fc654c7d-0dda-4d47-af39-69af2de09334",
    "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
    "expires_at": "2026-10-28T08:17:00.245815Z",
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

`POST /api/driver/v1/offers/fc654c7d-0dda-4d47-af39-69af2de09334/accept` → **200**

```json
{
  "command_id": "b1bf545c-5bbf-4027-8935-5a4691ab2fb5"
}
```

```json
{
  "id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "60b93884-b32a-45aa-8487-d0d608b63839",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:16:45.214Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:16:45.225975766Z",
    "token_suffix": "23ab6d",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "ddfd649c-ed8d-4815-9c9c-fe49b1ff04a7",
      "order_version": "2",
      "order_id": "131a461d-39a0-4f67-984a-db6b5ae371f1",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675976933&after=2026-10-28T08:16:45.214Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380675976933&after=2026-10-28T08:16:45.214Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:16:46.230553823Z",
    "token_suffix": "65ba88",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "5de13197-6efb-441d-b20e-4c52da40a24b",
      "order_version": "3",
      "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/5b847a08-b761-42d8-9cc3-7bd156f0fb4e/messages` → **201**

```json
{
  "command_id": "b0563552-a9d8-456a-b119-3628fc37a56e",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "e7cb8a31-0666-4537-83af-0db530bc953c",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T08:16:46.449063845Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "60b93884-b32a-45aa-8487-d0d608b63839",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "assignment_id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d",
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

`POST /api/driver/v1/trips/60b93884-b32a-45aa-8487-d0d608b63839/messages` → **201**

```json
{
  "command_id": "322a9611-8c03-4dfe-b711-646ce173a760",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "c3d92a57-446f-441b-97a9-927f4847af3b",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T08:16:46.50907878Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/5b847a08-b761-42d8-9cc3-7bd156f0fb4e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/60b93884-b32a-45aa-8487-d0d608b63839/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675976933"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:46Z",
    "sequence": 1793175406595
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:46.615493Z",
  "last_location_at": "2026-10-28T08:16:46.615493Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "60b93884-b32a-45aa-8487-d0d608b63839",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "assignment_id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d",
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

`POST /api/driver/v1/trips/60b93884-b32a-45aa-8487-d0d608b63839/arrive` → **200**

```json
{
  "command_id": "603b875c-6b2b-4864-9eb4-4f1d82b9214a",
  "expected_version": 0
}
```

```json
{
  "id": "60b93884-b32a-45aa-8487-d0d608b63839",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "assignment_id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d",
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
  "arrived_at": "2026-10-28T08:16:46.670324Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/60b93884-b32a-45aa-8487-d0d608b63839/start` → **200**

```json
{
  "command_id": "d87314ae-b66f-4619-add6-ce87327499fb",
  "expected_version": 1
}
```

```json
{
  "id": "60b93884-b32a-45aa-8487-d0d608b63839",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "assignment_id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d",
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
  "arrived_at": "2026-10-28T08:16:46.670324Z",
  "started_at": "2026-10-28T08:16:46.706533Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:46Z",
    "sequence": 1793175406732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:46.753013Z",
  "last_location_at": "2026-10-28T08:16:46.753013Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/60b93884-b32a-45aa-8487-d0d608b63839/complete` → **200**

```json
{
  "command_id": "c6186fea-44ca-48ed-8870-db1d85ad8bf3",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:16:46Z",
  "cash_received": true
}
```

```json
{
  "id": "60b93884-b32a-45aa-8487-d0d608b63839",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "assignment_id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d",
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
  "arrived_at": "2026-10-28T08:16:46.670324Z",
  "started_at": "2026-10-28T08:16:46.706533Z",
  "completed_at": "2026-10-28T08:16:46.791033Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/5b847a08-b761-42d8-9cc3-7bd156f0fb4e` → **200**

```json
{
  "id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fe9b9a1a-5642-4ab4-b454-f84173b8af34",
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
    "id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d",
    "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "60b93884-b32a-45aa-8487-d0d608b63839",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:16:45.241921Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:16:45.241921Z",
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
    "id": "60b93884-b32a-45aa-8487-d0d608b63839",
    "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
    "order_short_number": 6,
    "created_at": "2026-10-28T08:16:45.318728Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "169e4e66-0327-49cf-9b36-6de57383d403",
    "order_id": "ff17ebe7-0aa5-4f07-87be-d4a5439c7ada",
    "order_short_number": 1,
    "created_at": "2026-10-28T08:16:06.521335Z",
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
      "balance_minor": -104,
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
        "trips": 2,
        "fare_minor": 21034,
        "commission_minor": 3156,
        "driver_share_minor": 17878,
        "cash_minor": 17982,
        "cashless_minor": 3052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -104
      }
    }
  ],
  "total": {
    "trips": 2,
    "fare_minor": 21034,
    "commission_minor": 3156,
    "driver_share_minor": 17878,
    "cash_minor": 17982,
    "cashless_minor": 3052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -104
  },
  "balance_minor": -104
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/5b847a08-b761-42d8-9cc3-7bd156f0fb4e/tip` → **200**

```json
{
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
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
  "available_until": "2026-10-29T08:16:46.791033Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5b847a08-b761-42d8-9cc3-7bd156f0fb4e/tip` → **201**

```json
{
  "command_id": "f1179069-38cb-4f37-bf56-3857a95d7b82",
  "amount_minor": 1100
}
```

```json
{
  "id": "110ef246-23bb-4fe7-a346-7514df422732",
  "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T08:16:50.01179Z"
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
  "session_id": "4ae40e14-08e5-4b8b-93ca-3f30fdeaff35",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTAsImlhdCI6MTc5MzE3NTQxMCwianRpIjoiMTg0YjQzODItNmU4Ni00M2M4LWFiYjMtMDhmZTdkMjNjODM0Iiwic2lkIjoiNGFlNDBlMTQtMDhlNS00YjhiLTkzY2EtM2YzMGZkZWFmZjM1In0.uhuOM0_W-SulM3FDqNXr_ldor94I7IYkyr4xsu3n8Mo",
  "access_expires_at": "2026-10-28T08:31:50.338884465Z",
  "refresh_token": "aY_9NSV8ViKVECYrxjdmu5078iAO06nsrsGRUAeRfHU",
  "refresh_expires_at": "2026-10-28T20:16:50.338285968Z",
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
        "created": 6,
        "fulfilled": 3,
        "cancelled": 3,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 6
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 5
        },
        "cancelled_by": {
          "RIDER": 1,
          "STAFF": 1,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 6,
    "fulfilled": 3,
    "cancelled": 3,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 6
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 5
    },
    "cancelled_by": {
      "RIDER": 1,
      "STAFF": 1,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
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
  "generated_at": "2026-10-28T08:16:50.373558422Z"
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
        "trips": 3,
        "fares_minor": 37331,
        "service_rides_minor": 0,
        "commission_minor": 5601,
        "driver_share_minor": 31730,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 2000,
        "collected_by_drivers_minor": 17982,
        "tips_minor": 2500,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 3,
    "fares_minor": 37331,
    "service_rides_minor": 0,
    "commission_minor": 5601,
    "driver_share_minor": 31730,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 2000,
    "collected_by_drivers_minor": 17982,
    "tips_minor": 2500,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T08:16:50.406835007Z"
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
  "session_id": "7dbd6a81-d147-48ab-b45b-c67daad55047",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTAsImlhdCI6MTc5MzE3NTQxMCwianRpIjoiODVjYjQ1NTItOWI0Mi00OGQ1LWE4ZjktZmE5ZjdlOTAzYTRkIiwic2lkIjoiN2RiZDZhODEtZDE0Ny00OGFiLWI0NWItYzY3ZGFhZDU1MDQ3In0.kKW1nINv0HX1SYK1toRsTT3rAvftWU8OL0k89kH9Lwc",
  "access_expires_at": "2026-10-28T08:31:50.728801217Z",
  "refresh_token": "VNIqSXkFOyrcOsxtk6bDkArWtsSPJgPrS_EDTGjomDw",
  "refresh_expires_at": "2026-10-28T20:16:50.728131387Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5b847a08-b761-42d8-9cc3-7bd156f0fb4e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:16:45.24258Z",
      "actor": {
        "type": "CLIENT",
        "id": "fe9b9a1a-5642-4ab4-b454-f84173b8af34",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
        "quote_id": "be501ba2-da9c-4309-a471-175c8b158f49",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:16:45.244847Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
        "attempt_id": "be182712-1976-43cd-b6da-75da14fa2fb7",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:16:45.252791Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fc654c7d-0dda-4d47-af39-69af2de09334",
        "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:16:45.32103Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fc654c7d-0dda-4d47-af39-69af2de09334",
        "order_id": "5b847a08-b761-42d8-9cc3-7bd156f0fb4e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a19c1379-fe36-49e3-8d0d-ccdd5dad4b4d"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T08:16:50.794786602Z",
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
      "last_location_at": "2026-10-28T08:16:46.753013Z",
      "order_id": null
    }
  ]
}
```

Done: order 5b847a08-b761-42d8-9cc3-7bd156f0fb4e.

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
  "session_id": "1985fbdc-d4eb-4a81-a948-2c2e9f108695",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTEsImlhdCI6MTc5MzE3NTQxMSwianRpIjoiNWNlYTA0YTItNTU2NC00YmQ2LWFlNjQtOGI1OGU1MWQyOGU3Iiwic2lkIjoiMTk4NWZiZGMtZDRlYi00YTgxLWE5NDgtMmMyZTlmMTA4Njk1In0.BEMjir2Iw_YMHplWCSPj9QRntHFgLU3qkdGUoEfsOKo",
  "access_expires_at": "2026-10-28T08:31:51.146222172Z",
  "refresh_token": "F8pPgXJtWhZOJWYboBlWmXxz9ohQYkndm7zjLiNW078",
  "refresh_expires_at": "2026-10-28T20:16:51.145527706Z",
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
  "command_id": "a69a1dfd-cbee-4cf6-870f-6d27a80b5ce5",
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
  "timestamp": "2026-10-28T08:16:51.000+0000",
  "channel": {
    "id": "1730052000.3126531579",
    "linkedid": "1730052000.3126531579",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672490807"
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
  "timestamp": "2026-10-28T08:16:51.000+0000",
  "channel": {
    "id": "1730052000.3126531579",
    "linkedid": "1730052000.3126531579",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672490807"
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
  "session_id": "55d6385f-5592-495a-a222-0fde0bea8456",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTEsImlhdCI6MTc5MzE3NTQxMSwianRpIjoiMjgyMWUxYWYtNDdlMi00ODJjLTk1NzMtMjNjMWE2OWVkNjcyIiwic2lkIjoiNTVkNjM4NWYtNTU5Mi00OTVhLWEyMjItMGZkZTBiZWE4NDU2In0.KL7eh6nSc2b11vW8Wvew3XZBrUSjiTooovSDYEckfdw",
  "access_expires_at": "2026-10-28T08:31:51.586632292Z",
  "refresh_token": "-z3s8sNrZU4izeJGvVNdSedPh0z7K1qwlb7rFd2GagQ",
  "refresh_expires_at": "2026-10-28T20:16:51.585893092Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "7220afe1-0063-4be9-8c31-710edea7acfd",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672490807",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:16:51Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/7220afe1-0063-4be9-8c31-710edea7acfd/answer` → **200**

```json
{
  "command_id": "69300494-9cff-4897-bbb3-5e0a21411a39"
}
```

```json
{
  "id": "7220afe1-0063-4be9-8c31-710edea7acfd",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672490807",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "order_ids": [],
  "started_at": "2026-10-28T08:16:51Z",
  "answered_at": "2026-10-28T08:16:51.657809Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3126531579",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b17fa740-3798-4f41-a261-569594f9783f",
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
  "id": "a247fc1e-4a1a-4e57-8955-3f6f4a4a0d9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:51.725610Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "bc8b105b-44ec-4817-847d-6123e54c0928",
  "quote_id": "a247fc1e-4a1a-4e57-8955-3f6f4a4a0d9a",
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
    "phone": "+380672490807"
  },
  "call_id": "7220afe1-0063-4be9-8c31-710edea7acfd"
}
```

```json
{
  "id": "0d3f951e-8bcb-477f-a9b5-6f2ad63205fc",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:16:51.800882Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672490807"
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
    "id": "1730052000.3126531579",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7220afe1-0063-4be9-8c31-710edea7acfd",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672490807",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [
        "0d3f951e-8bcb-477f-a9b5-6f2ad63205fc"
      ],
      "started_at": "2026-10-28T08:16:51Z",
      "answered_at": "2026-10-28T08:16:51.657809Z",
      "ended_at": "2026-10-28T08:16:51.865058Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "ec7f5e9e-d266-46ef-ac3c-4d117b2c804c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679147147",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [],
      "started_at": "2026-10-28T08:16:10.856017Z",
      "answered_at": "2026-10-28T08:16:10.92581Z",
      "ended_at": "2026-10-28T08:16:10.983097Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:16:12.0442Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/0d3f951e-8bcb-477f-a9b5-6f2ad63205fc` → **200**

```json
{
  "id": "0d3f951e-8bcb-477f-a9b5-6f2ad63205fc",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:16:51.800882Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672490807"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/0d3f951e-8bcb-477f-a9b5-6f2ad63205fc` → **200**

```json
{
  "id": "0d3f951e-8bcb-477f-a9b5-6f2ad63205fc",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:16:51.800882Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672490807"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0d3f951e-8bcb-477f-a9b5-6f2ad63205fc/cancel` → **200**

```json
{
  "command_id": "8e6276fa-4b31-4c0d-bedd-98b11e187ae8",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0d3f951e-8bcb-477f-a9b5-6f2ad63205fc",
  "short_number": 7,
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
  "created_at": "2026-10-28T08:16:51.800882Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672490807"
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

Done: call 7220afe1-0063-4be9-8c31-710edea7acfd with order 0d3f951e-8bcb-477f-a9b5-6f2ad63205fc.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12634"
}
```

```json
{
  "challenge_id": "1f5cf493-97ea-4a1a-84f2-ff9ee1dbe47f",
  "expires_at": "2026-10-28T08:21:52.030755903Z",
  "resend_available_at": "2026-10-28T08:16:53.030755903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "116693",
  "sent_at": "2026-10-28T08:16:52.033250289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f5cf493-97ea-4a1a-84f2-ff9ee1dbe47f",
  "code": "116693",
  "device_ref": "sandbox-12634"
}
```

```json
{
  "session_id": "74685e28-f703-4940-a11f-417f2b6b37b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMxMiwiaWF0IjoxNzkzMTc1NDEyLCJqdGkiOiJhY2FiZTk2NS1hMmQyLTQ2OWMtYTBhNS1iMDExN2U3NjUyYzEiLCJzaWQiOiI3NDY4NWUyOC1mNzAzLTQ5NDAtYTExZi00MTdmMmI2YjM3YjQifQ.C54cZUge2X0w6KEatIRkjS5tVTseMjvn9XZtwvnDNPE",
  "access_expires_at": "2026-10-28T08:31:52.09420654Z",
  "refresh_token": "axlUtihUyVRazH7-QQ3h7CMsPZb3uVBq6sptQqrB38A",
  "refresh_expires_at": "2026-11-27T08:16:52.093626898Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:46.753013Z",
  "last_location_at": "2026-10-28T08:16:46.753013Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/handover` → **200**

```json
{
  "command_id": "3377387f-9680-452f-9fd0-390d4057416d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:46.753013Z",
  "last_location_at": "2026-10-28T08:16:46.753013Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:52Z",
    "sequence": 1793175412182
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:52.202672Z",
  "last_location_at": "2026-10-28T08:16:52.202672Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668286279",
  "device_ref": "sandbox-10956"
}
```

```json
{
  "challenge_id": "c9a56aa0-d1c3-4438-b8ae-a665339ed751",
  "expires_at": "2026-10-28T08:21:52.230006746Z",
  "resend_available_at": "2026-10-28T08:16:53.230006746Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668286279` → **200**

```json
{
  "phone": "+380668286279",
  "audience": "CLIENT",
  "code": "410693",
  "sent_at": "2026-10-28T08:16:52.232463424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9a56aa0-d1c3-4438-b8ae-a665339ed751",
  "code": "410693",
  "device_ref": "sandbox-10956"
}
```

```json
{
  "session_id": "14531fa7-853f-4a9e-ac07-cbc691b00fbe",
  "subject": {
    "type": "CLIENT",
    "id": "e0629861-edae-4ffc-9d7b-d1d19bda4ad4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyOTg2MS1lZGFlLTRmZmMtOWQ3Yi1kMWQxOWJkYTRhZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzEyLCJpYXQiOjE3OTMxNzU0MTIsImp0aSI6Ijg5YzBiMGY4LWJlODgtNGIzZS1hYjcwLTE2M2NiOGI0YThjZCIsInNpZCI6IjE0NTMxZmE3LTg1M2YtNGE5ZS1hYzA3LWNiYzY5MWIwMGZiZSJ9.9TG-MFRNugPoyy1QVQGZgasiLwLQaURsY766bPUBwFw",
  "access_expires_at": "2026-10-28T08:31:52.29416849Z",
  "refresh_token": "BJn7sIw3amlZPDsTXP8PMVsHSo1WU90bHGBCiRO6UXY",
  "refresh_expires_at": "2026-11-27T08:16:52.293602132Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cd632f59-e21a-4593-a175-8808dd3a3c2c",
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
  "id": "801342d9-cc5d-48c7-8304-3b77d0483b67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T08:21:52.331429Z",
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
  "command_id": "71f60ba3-9b8c-4298-afe6-d3bb311328d2",
  "quote_id": "801342d9-cc5d-48c7-8304-3b77d0483b67",
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
  "id": "739de610-b388-4aed-800a-e1fdd263b779",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0629861-edae-4ffc-9d7b-d1d19bda4ad4",
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
  "created_at": "2026-10-28T08:16:52.371094Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d760bc17-a4e4-41a7-8a10-cf8f924f4d34",
    "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
    "expires_at": "2026-10-28T08:17:07.374629Z",
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

`POST /api/driver/v1/offers/d760bc17-a4e4-41a7-8a10-cf8f924f4d34/accept` → **200**

```json
{
  "command_id": "de636f22-ffc6-4c6b-9d9f-e957569b6970"
}
```

```json
{
  "id": "3c9aec04-0b00-4b5a-82e9-4f809a739dea",
  "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "28a70d20-8dc9-4eb4-8991-ec040249cf2c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "28a70d20-8dc9-4eb4-8991-ec040249cf2c",
  "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
  "assignment_id": "3c9aec04-0b00-4b5a-82e9-4f809a739dea",
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

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:52Z",
    "sequence": 1793175412485
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:52.504699Z",
  "last_location_at": "2026-10-28T08:16:52.504699Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/28a70d20-8dc9-4eb4-8991-ec040249cf2c/arrive` → **200**

```json
{
  "command_id": "840502b9-73ff-428d-9e40-166cdcf97c17",
  "expected_version": 0
}
```

```json
{
  "id": "28a70d20-8dc9-4eb4-8991-ec040249cf2c",
  "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
  "assignment_id": "3c9aec04-0b00-4b5a-82e9-4f809a739dea",
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
  "arrived_at": "2026-10-28T08:16:52.542532Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/28a70d20-8dc9-4eb4-8991-ec040249cf2c/start` → **200**

```json
{
  "command_id": "e58a1a9c-cac5-4ba4-8b9a-f124ff76c177",
  "expected_version": 1
}
```

```json
{
  "id": "28a70d20-8dc9-4eb4-8991-ec040249cf2c",
  "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
  "assignment_id": "3c9aec04-0b00-4b5a-82e9-4f809a739dea",
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
  "arrived_at": "2026-10-28T08:16:52.542532Z",
  "started_at": "2026-10-28T08:16:52.583604Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:52Z",
    "sequence": 1793175412611
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:52.631289Z",
  "last_location_at": "2026-10-28T08:16:52.631289Z",
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
  "device_ref": "sandbox-30816"
}
```

```json
{
  "challenge_id": "4552f1a3-2057-4961-a87f-36f98b87fa98",
  "expires_at": "2026-10-28T08:21:52.656574972Z",
  "resend_available_at": "2026-10-28T08:16:53.656574972Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "648682",
  "sent_at": "2026-10-28T08:16:52.65893669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4552f1a3-2057-4961-a87f-36f98b87fa98",
  "code": "648682",
  "device_ref": "sandbox-30816"
}
```

```json
{
  "session_id": "ca1d3775-a7d6-4eab-bbf2-7836e11c75ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMxMiwiaWF0IjoxNzkzMTc1NDEyLCJqdGkiOiI5NzcxYjJhMi00MDg4LTRlMDctYWQ4Yi1hOTI5OTJjZGE2ZmEiLCJzaWQiOiJjYTFkMzc3NS1hN2Q2LTRlYWItYmJmMi03ODM2ZTExYzc1YWMifQ.hiuxjEDZ7PHLb3l4FQ_NCpI_ZjaWfyoAuIjvkfwITf4",
  "access_expires_at": "2026-10-28T08:31:52.718990271Z",
  "refresh_token": "9jFOX30K1jliFNjbgf-2QrrAgwoVV4mevBLJPOFE6Iw",
  "refresh_expires_at": "2026-11-27T08:16:52.718303822Z",
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
  "command_id": "f6557280-17a7-4c07-9269-c04a74631608",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:52Z",
    "sequence": 1793175412788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6c1a136c-acee-49d3-86d7-9ce4682c691d",
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
  "last_heartbeat_at": "2026-10-28T08:16:52.807569Z",
  "last_location_at": "2026-10-28T08:16:52.807569Z",
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
  "session_id": "0aec52e7-18fd-4616-b35a-33e9bc26a805",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTMsImlhdCI6MTc5MzE3NTQxMywianRpIjoiNDYxZjYyNDAtOTE3Yy00ZDY5LWJjODUtNDE0ZjNhYWRhZjhiIiwic2lkIjoiMGFlYzUyZTctMThmZC00NjE2LWIzNWEtMzNlOWJjMjZhODA1In0.LJeBYSQ4JqWdhIinQHPP3E_tltOCSk1QobP8hEVgPJs",
  "access_expires_at": "2026-10-28T08:31:53.131899491Z",
  "refresh_token": "zMhVgMtk5CMGQXbIPoQhX4AbCOs1Qd6yIC3p2Mq-wLs",
  "refresh_expires_at": "2026-10-28T20:16:53.131297868Z",
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
  "session_id": "0074fce5-ba49-497c-a9fe-fdff93151328",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTMsImlhdCI6MTc5MzE3NTQxMywianRpIjoiZDc0OWM4MzgtNGEzYS00NDAyLWJhN2EtMjA5YTg2NGUwM2QwIiwic2lkIjoiMDA3NGZjZTUtYmE0OS00OTdjLWE5ZmUtZmRmZjkzMTUxMzI4In0.6VgtwgVCVBx5znrkaxTnsUdefmqDr0pxEO-G9v6hilk",
  "access_expires_at": "2026-10-28T08:31:53.451542342Z",
  "refresh_token": "WhSA58XZlDS-aqUlrIcezFoXEz0HsVzLsgRlK3Gp_j8",
  "refresh_expires_at": "2026-10-28T20:16:53.450920181Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/739de610-b388-4aed-800a-e1fdd263b779` → **200**

```json
{
  "id": "739de610-b388-4aed-800a-e1fdd263b779",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e0629861-edae-4ffc-9d7b-d1d19bda4ad4",
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
    "id": "3c9aec04-0b00-4b5a-82e9-4f809a739dea",
    "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "28a70d20-8dc9-4eb4-8991-ec040249cf2c",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T08:16:52.371094Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/739de610-b388-4aed-800a-e1fdd263b779/interrupt` → **200**

```json
{
  "command_id": "ff5cec1d-af80-48a7-9f3c-580a32750747",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "739de610-b388-4aed-800a-e1fdd263b779",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "e0629861-edae-4ffc-9d7b-d1d19bda4ad4",
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
      "id": "3c9aec04-0b00-4b5a-82e9-4f809a739dea",
      "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "28a70d20-8dc9-4eb4-8991-ec040249cf2c",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T08:16:52.371094Z",
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
    "id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "e0629861-edae-4ffc-9d7b-d1d19bda4ad4",
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
    "id": "307d1929-d429-4af7-b1ba-6bc80b1fbb85",
    "order_id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
    "expires_at": "2026-10-28T08:17:08.538281Z",
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

`POST /api/driver/v1/offers/307d1929-d429-4af7-b1ba-6bc80b1fbb85/accept` → **200**

```json
{
  "command_id": "194ce632-7ee4-4d3e-afe7-df190537c535"
}
```

```json
{
  "id": "9d375001-5b40-4942-9f65-9705ee88264e",
  "order_id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7855890c-9325-439e-9482-aae8e76d8d97",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7855890c-9325-439e-9482-aae8e76d8d97",
  "order_id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
  "assignment_id": "9d375001-5b40-4942-9f65-9705ee88264e",
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
  "session_id": "6c1a136c-acee-49d3-86d7-9ce4682c691d",
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
  "last_heartbeat_at": "2026-10-28T08:16:52.807569Z",
  "last_location_at": "2026-10-28T08:16:52.807569Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/6c1a136c-acee-49d3-86d7-9ce4682c691d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:53Z",
    "sequence": 1793175413686
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6c1a136c-acee-49d3-86d7-9ce4682c691d",
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
  "last_heartbeat_at": "2026-10-28T08:16:53.705278Z",
  "last_location_at": "2026-10-28T08:16:53.705278Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7855890c-9325-439e-9482-aae8e76d8d97/arrive` → **200**

```json
{
  "command_id": "7e585d04-11f0-4456-8faf-80abb3f3d0ff",
  "expected_version": 0
}
```

```json
{
  "id": "7855890c-9325-439e-9482-aae8e76d8d97",
  "order_id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
  "assignment_id": "9d375001-5b40-4942-9f65-9705ee88264e",
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
  "arrived_at": "2026-10-28T08:16:53.742368Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7855890c-9325-439e-9482-aae8e76d8d97/start` → **200**

```json
{
  "command_id": "f3413670-7812-454c-9572-f842c7fcf51e",
  "expected_version": 1
}
```

```json
{
  "id": "7855890c-9325-439e-9482-aae8e76d8d97",
  "order_id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
  "assignment_id": "9d375001-5b40-4942-9f65-9705ee88264e",
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
  "arrived_at": "2026-10-28T08:16:53.742368Z",
  "started_at": "2026-10-28T08:16:53.78879Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7855890c-9325-439e-9482-aae8e76d8d97/complete` → **200**

```json
{
  "command_id": "4c0c865c-e698-4dd9-bffa-583045672efc",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:16:53Z"
}
```

```json
{
  "id": "7855890c-9325-439e-9482-aae8e76d8d97",
  "order_id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
  "assignment_id": "9d375001-5b40-4942-9f65-9705ee88264e",
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
  "arrived_at": "2026-10-28T08:16:53.742368Z",
  "started_at": "2026-10-28T08:16:53.78879Z",
  "completed_at": "2026-10-28T08:16:53.832828Z",
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
    "id": "ea625aa4-0507-45a8-8fe1-d5b7e384a69a",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:16:53.527939Z",
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
    "id": "739de610-b388-4aed-800a-e1fdd263b779",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:16:52.371094Z",
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

`GET /api/operator/v1/orders/739de610-b388-4aed-800a-e1fdd263b779/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:16:52.371734Z",
      "actor": {
        "type": "CLIENT",
        "id": "e0629861-edae-4ffc-9d7b-d1d19bda4ad4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
        "quote_id": "801342d9-cc5d-48c7-8304-3b77d0483b67",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:16:52.37372Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
        "attempt_id": "3979879b-6cd5-4337-b35a-1f9effd965ba",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:16:52.380497Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d760bc17-a4e4-41a7-8a10-cf8f924f4d34",
        "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:16:52.441784Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d760bc17-a4e4-41a7-8a10-cf8f924f4d34",
        "order_id": "739de610-b388-4aed-800a-e1fdd263b779",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3c9aec04-0b00-4b5a-82e9-4f809a739dea"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 739de610-b388-4aed-800a-e1fdd263b779, follow-up ea625aa4-0507-45a8-8fe1-d5b7e384a69a.

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
  "session_id": "9613a804-9724-4627-be7e-c288f71ff272",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTcsImlhdCI6MTc5MzE3NTQxNywianRpIjoiZmVmMWUzYjgtZDQzZC00OGJkLThiNGQtMWEyMTI4NmY3YzcxIiwic2lkIjoiOTYxM2E4MDQtOTcyNC00NjI3LWJlN2UtYzI4OGY3MWZmMjcyIn0.A2lCKfP4iP3oZaep_4VZUAMGgHK2yQ-hTsb0sCz8qSk",
  "access_expires_at": "2026-10-28T08:31:57.254993243Z",
  "refresh_token": "FQYEMUsYeX1jaBMyl8sD1VaeG2u_hb_RFgOv5JQTgXA",
  "refresh_expires_at": "2026-10-28T20:16:57.254409333Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e8a5aea0-bb75-421d-a5ee-3bdd8b5ad0b3",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:16:57Z"
}
```

```json
{
  "id": "682ec4dd-4535-4a9d-bc13-0927b1f9b084",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:16:57Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/682ec4dd-4535-4a9d-bc13-0927b1f9b084/publish` → **200**

```json
{
  "command_id": "a35076c1-d1de-4388-9fd6-35d486a6aefb",
  "expected_version": 0
}
```

```json
{
  "id": "682ec4dd-4535-4a9d-bc13-0927b1f9b084",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:16:57.34733Z",
  "published_at": "2026-10-28T08:16:57.34733Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "682ec4dd-4535-4a9d-bc13-0927b1f9b084",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T08:16:57.34733Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635452101",
  "device_ref": "sandbox-20460"
}
```

```json
{
  "challenge_id": "657d8824-b695-424a-8f8e-9e024d188fb6",
  "expires_at": "2026-10-28T08:21:57.408606545Z",
  "resend_available_at": "2026-10-28T08:16:58.408606545Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635452101` → **200**

```json
{
  "phone": "+380635452101",
  "audience": "CLIENT",
  "code": "135839",
  "sent_at": "2026-10-28T08:16:57.411339495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "657d8824-b695-424a-8f8e-9e024d188fb6",
  "code": "135839",
  "device_ref": "sandbox-20460"
}
```

```json
{
  "session_id": "ba70bc4e-f0a1-41f9-9840-a21670b9f7e9",
  "subject": {
    "type": "CLIENT",
    "id": "2d83c8f0-ba8a-4d80-81bb-89d6cb648a97"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDgzYzhmMC1iYThhLTRkODAtODFiYi04OWQ2Y2I2NDhhOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzE3LCJpYXQiOjE3OTMxNzU0MTcsImp0aSI6IjRlNTg4YTUxLTAyOWItNDhkZi1iNTdmLTk0ZWM3MzA2NGIxZSIsInNpZCI6ImJhNzBiYzRlLWYwYTEtNDFmOS05ODQwLWEyMTY3MGI5ZjdlOSJ9.ZlpeNGIArYF0i7hDpCrTq3emkBVkoWKc3UJgQHYOoJ8",
  "access_expires_at": "2026-10-28T08:31:57.467976035Z",
  "refresh_token": "dqfOr6Bl2avpSsacMoykzecFVohz0tuj_tMafHnf6VI",
  "refresh_expires_at": "2026-11-27T08:16:57.467364444Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "682ec4dd-4535-4a9d-bc13-0927b1f9b084",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T08:16:57.34733Z",
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
  "command_id": "b9ed820c-92a1-4acb-94c4-63869edec9f3",
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
  "id": "36ce93c9-bf08-4b30-9d94-4b33eb4b1a65",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:21:57.530864Z",
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
  "command_id": "46166b37-aa29-4658-baf9-e03a3b341f48",
  "quote_id": "36ce93c9-bf08-4b30-9d94-4b33eb4b1a65",
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
  "correlation_id": "2c1fd008-1fb9-4367-9372-6a21525fb588"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "abb5d142-b33a-443d-8769-44a9f95735e6",
  "version_id": "682ec4dd-4535-4a9d-bc13-0927b1f9b084",
  "language": "uk"
}
```

```json
{
  "version_id": "682ec4dd-4535-4a9d-bc13-0927b1f9b084",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T08:16:57.608594Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6577aa67-d9d1-4e6a-b74e-4eb0d722eb67",
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
  "id": "372372af-a6a7-4ea5-b520-52b5b556ca4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:21:57.649886Z",
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
  "command_id": "8ff80d69-8fd5-4f13-8162-2f3a91267db2",
  "quote_id": "372372af-a6a7-4ea5-b520-52b5b556ca4d",
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
  "id": "2ae9ad35-dd9e-45df-9bb2-150081406ff5",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d83c8f0-ba8a-4d80-81bb-89d6cb648a97",
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
  "created_at": "2026-10-28T08:16:57.689092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/2ae9ad35-dd9e-45df-9bb2-150081406ff5` → **200**

```json
{
  "id": "2ae9ad35-dd9e-45df-9bb2-150081406ff5",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d83c8f0-ba8a-4d80-81bb-89d6cb648a97",
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
  "created_at": "2026-10-28T08:16:57.689092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2ae9ad35-dd9e-45df-9bb2-150081406ff5/cancel` → **200**

```json
{
  "command_id": "937755a7-29fb-4cb8-a4cb-68b6c8962c1f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2ae9ad35-dd9e-45df-9bb2-150081406ff5",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2d83c8f0-ba8a-4d80-81bb-89d6cb648a97",
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
  "created_at": "2026-10-28T08:16:57.689092Z",
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
  "discount_minor": 0
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/682ec4dd-4535-4a9d-bc13-0927b1f9b084` → **409**

```json
{
  "command_id": "085bbf87-906e-45e9-861d-2f1c174b93e9",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:16:57Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/682ec4dd-4535-4a9d-bc13-0927b1f9b084",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "67e8e025-cfe3-4362-aad2-e6d4ab094014"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "3582e264-64e2-4e0e-bdca-570ce979f281",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:16:57Z"
}
```

```json
{
  "id": "b5d0dbec-0436-49db-8a03-25cf362443f3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:16:57Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b5d0dbec-0436-49db-8a03-25cf362443f3/publish` → **200**

```json
{
  "command_id": "f191e13f-99ea-44a0-af2e-173f397e00ba",
  "expected_version": 0
}
```

```json
{
  "id": "b5d0dbec-0436-49db-8a03-25cf362443f3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:16:57.88748Z",
  "published_at": "2026-10-28T08:16:57.88748Z",
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
  "device_ref": "sandbox-8524"
}
```

```json
{
  "challenge_id": "a669ee2f-caca-41ef-accd-b9b978159280",
  "expires_at": "2026-10-28T08:21:57.925143973Z",
  "resend_available_at": "2026-10-28T08:16:58.925143973Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "440967",
  "sent_at": "2026-10-28T08:16:57.927301157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a669ee2f-caca-41ef-accd-b9b978159280",
  "code": "440967",
  "device_ref": "sandbox-8524"
}
```

```json
{
  "session_id": "f487a665-3cd2-4632-9982-66d3f0f909b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMxNywiaWF0IjoxNzkzMTc1NDE3LCJqdGkiOiI3MzFiYjc1My1kOWRkLTRhNWEtYThmZi0wMGIzODVjM2YwZjkiLCJzaWQiOiJmNDg3YTY2NS0zY2QyLTQ2MzItOTk4Mi02NmQzZjBmOTA5YjEifQ.UT1cemkhh5E-GkXFC8ShdQf9tU5br_xoYbj2NbscYtI",
  "access_expires_at": "2026-10-28T08:31:57.982426329Z",
  "refresh_token": "xqIdUBM2926tW863Q2CI-0kKBk730UyuWiW8wt36ANo",
  "refresh_expires_at": "2026-11-27T08:16:57.981808525Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6c1a136c-acee-49d3-86d7-9ce4682c691d",
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
  "last_heartbeat_at": "2026-10-28T08:16:53.705278Z",
  "last_location_at": "2026-10-28T08:16:53.705278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c1a136c-acee-49d3-86d7-9ce4682c691d/handover` → **200**

```json
{
  "command_id": "b6a9ff31-10f0-49b6-ba0b-f0268d904684",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6c1a136c-acee-49d3-86d7-9ce4682c691d",
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
  "last_heartbeat_at": "2026-10-28T08:16:53.705278Z",
  "last_location_at": "2026-10-28T08:16:53.705278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c1a136c-acee-49d3-86d7-9ce4682c691d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:58Z",
    "sequence": 1793175418704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6c1a136c-acee-49d3-86d7-9ce4682c691d",
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
  "last_heartbeat_at": "2026-10-28T08:16:58.08911Z",
  "last_location_at": "2026-10-28T08:16:58.08911Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673822367",
  "device_ref": "sandbox-3563"
}
```

```json
{
  "challenge_id": "d7fb6352-8a5e-44ce-a813-01ab983d46a6",
  "expires_at": "2026-10-28T08:21:58.117496738Z",
  "resend_available_at": "2026-10-28T08:16:59.117496738Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673822367` → **200**

```json
{
  "phone": "+380673822367",
  "audience": "CLIENT",
  "code": "364883",
  "sent_at": "2026-10-28T08:16:58.119929343Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7fb6352-8a5e-44ce-a813-01ab983d46a6",
  "code": "364883",
  "device_ref": "sandbox-3563"
}
```

```json
{
  "session_id": "a12473f3-85fa-4e80-b15e-300eb4efd0f1",
  "subject": {
    "type": "CLIENT",
    "id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZWE2N2RkNy02NjM5LTRhZTgtYjFkNC0yMjljZDFhYWY0ZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzE4LCJpYXQiOjE3OTMxNzU0MTgsImp0aSI6IjEwOTM0YWUzLWU2ODUtNDEzZS1hM2M1LTllZjk2MzRlYTU1YiIsInNpZCI6ImExMjQ3M2YzLTg1ZmEtNGU4MC1iMTVlLTMwMGViNGVmZDBmMSJ9.g2PhFNnAJ6Mt1oSWaCvj4F7vFTQ-JPyJT1HpjOltyMg",
  "access_expires_at": "2026-10-28T08:31:58.177655939Z",
  "refresh_token": "RsxMB4Y4-LLK-8J97DkgFZJJeUSEEV72_nRJXcfG5yU",
  "refresh_expires_at": "2026-11-27T08:16:58.177137121Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8c17bf66-58f8-41ff-9cb8-d67a091a47de",
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
  "id": "f66f4a75-4efd-43c0-8012-cc290234946a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:58.213667Z",
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
  "command_id": "80280308-8ee5-4853-8ff6-2075b5709f6a",
  "quote_id": "f66f4a75-4efd-43c0-8012-cc290234946a",
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
    "phone": "+380676898152"
  }
}
```

```json
{
  "id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.254867Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5ac4e6d8-85ec-4e49-8ded-bc1287e12315",
    "order_id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
    "expires_at": "2026-10-28T08:17:13.258592Z",
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

`POST /api/driver/v1/offers/5ac4e6d8-85ec-4e49-8ded-bc1287e12315/accept` → **200**

```json
{
  "command_id": "99b07d0e-327b-40d3-834d-c966ffa8e158"
}
```

```json
{
  "id": "c1ffa26a-e0ca-40e8-af06-c466fbbd9d92",
  "order_id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9612087-14db-40a5-9a2f-e322b20356ae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9612087-14db-40a5-9a2f-e322b20356ae",
  "order_id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
  "assignment_id": "c1ffa26a-e0ca-40e8-af06-c466fbbd9d92",
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
    "phone": "+380676898152"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "861e9661-e1cd-4805-a4f1-94bad726298c",
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
  "id": "04343117-17c3-4ca6-a9a3-3a58afa04b67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:58.403422Z",
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
  "command_id": "955e7edc-7c52-43ee-aefb-7174e9984845",
  "quote_id": "04343117-17c3-4ca6-a9a3-3a58afa04b67",
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
  "id": "a8a3fe1f-210d-4842-adea-232f08bbaacb",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.441894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aede27c3-a7e7-40ed-8e35-30ad81cc424f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T11:16:58Z"
}
```

```json
{
  "id": "06d5feb7-756a-4f2f-8b68-48514a62c967",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:58.494586Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:16:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ef16b953-3628-428e-ab29-a1feefc69080",
  "quote_id": "06d5feb7-756a-4f2f-8b68-48514a62c967",
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
  "pickup_at": "2026-10-28T11:16:58Z"
}
```

```json
{
  "id": "8325544e-6894-4175-9569-df20fa69c9df",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.53614Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:16:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c032298a-a993-42a8-85f1-6b92d7cdc1f1",
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
  "id": "01e77414-f94b-46f2-8efa-043f132ff6de",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:21:58.579535Z",
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
  "command_id": "aa5c9238-4516-487b-ac3f-9f3ff5bbb095",
  "quote_id": "01e77414-f94b-46f2-8efa-043f132ff6de",
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
  "correlation_id": "35c37ff5-93b4-4903-a8b1-b056d22c324f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "8325544e-6894-4175-9569-df20fa69c9df",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
      "created_at": "2026-10-28T08:16:58.53614Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T11:16:58Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "a8a3fe1f-210d-4842-adea-232f08bbaacb",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
      "created_at": "2026-10-28T08:16:58.441894Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "a8a3fe1f-210d-4842-adea-232f08bbaacb",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.441894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/9b78db97-d1b5-41f6-a1da-3b80807ee1fd` → **200**

```json
{
  "id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
    "id": "c1ffa26a-e0ca-40e8-af06-c466fbbd9d92",
    "order_id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e9612087-14db-40a5-9a2f-e322b20356ae",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T08:16:58.254867Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9b78db97-d1b5-41f6-a1da-3b80807ee1fd/cancel` → **200**

```json
{
  "command_id": "23877701-05ae-4d93-b853-ae0816fd6a94",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
    "id": "c1ffa26a-e0ca-40e8-af06-c466fbbd9d92",
    "order_id": "9b78db97-d1b5-41f6-a1da-3b80807ee1fd",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e9612087-14db-40a5-9a2f-e322b20356ae",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:16:58.254867Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a8a3fe1f-210d-4842-adea-232f08bbaacb` → **200**

```json
{
  "id": "a8a3fe1f-210d-4842-adea-232f08bbaacb",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.441894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/a8a3fe1f-210d-4842-adea-232f08bbaacb/cancel` → **200**

```json
{
  "command_id": "9ce6baf1-18c6-4064-a0be-8373066e681f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a8a3fe1f-210d-4842-adea-232f08bbaacb",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.441894Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8325544e-6894-4175-9569-df20fa69c9df` → **200**

```json
{
  "id": "8325544e-6894-4175-9569-df20fa69c9df",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.53614Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:16:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/8325544e-6894-4175-9569-df20fa69c9df/cancel` → **200**

```json
{
  "command_id": "ca3d76d1-aed8-45ce-b8dd-cef795595909",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8325544e-6894-4175-9569-df20fa69c9df",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1ea67dd7-6639-4ae8-b1d4-229cd1aaf4d4",
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
  "created_at": "2026-10-28T08:16:58.53614Z",
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
  "pickup_at": "2026-10-28T11:16:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6c1a136c-acee-49d3-86d7-9ce4682c691d",
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
  "last_heartbeat_at": "2026-10-28T08:16:58.08911Z",
  "last_location_at": "2026-10-28T08:16:58.08911Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c1a136c-acee-49d3-86d7-9ce4682c691d/close` → **200**

```json
{
  "command_id": "452f4c7b-def7-4060-a5c5-85a9af514143",
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

Done: orders 9b78db97-d1b5-41f6-a1da-3b80807ee1fd, a8a3fe1f-210d-4842-adea-232f08bbaacb, 8325544e-6894-4175-9569-df20fa69c9df.

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
  "session_id": "12e46944-6e27-4d1e-b2f0-c1e60d26800b",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTksImlhdCI6MTc5MzE3NTQxOSwianRpIjoiYWUyYjBkZjctNzg0MS00ZDRkLWFhMjEtOGIxNTA3YmZjOGI2Iiwic2lkIjoiMTJlNDY5NDQtNmUyNy00ZDFlLWIyZjAtYzFlNjBkMjY4MDBiIn0.SXJRfLxt4PGsZgXjGOdg0vc_ZI97Cssx12pIWW5uLFU",
  "access_expires_at": "2026-10-28T08:31:59.256316243Z",
  "refresh_token": "z9KAbTLsJ8GDRopEkthCJyEgqEjHBSO_TgKrj4EnjrA",
  "refresh_expires_at": "2026-10-28T20:16:59.255702245Z",
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
  "session_id": "3b90a4f8-71d0-4d22-a2ff-0c1a0e313918",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMTksImlhdCI6MTc5MzE3NTQxOSwianRpIjoiM2EwZTk2MTQtYjAyYy00ZjJmLWIzNDEtNmYwMzY3ODk2ZTFlIiwic2lkIjoiM2I5MGE0ZjgtNzFkMC00ZDIyLWEyZmYtMGMxYTBlMzEzOTE4In0.B_SGoj6uxN8dkqV6mpd0rmmqA3BGJ5AUNczcvbzO_iM",
  "access_expires_at": "2026-10-28T08:31:59.575909112Z",
  "refresh_token": "WY6AtsflOctNmpTagAwH4K06dIPsCh8qGyb8hioNv50",
  "refresh_expires_at": "2026-10-28T20:16:59.575387088Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1852"
}
```

```json
{
  "challenge_id": "38a0a276-7d4c-4c77-9496-326c78f18f51",
  "expires_at": "2026-10-28T08:21:59.600332815Z",
  "resend_available_at": "2026-10-28T08:17:00.600332815Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "542197",
  "sent_at": "2026-10-28T08:16:59.604269313Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38a0a276-7d4c-4c77-9496-326c78f18f51",
  "code": "542197",
  "device_ref": "sandbox-1852"
}
```

```json
{
  "session_id": "6d740a8f-396d-4b78-b876-768794e9c891",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMxOSwiaWF0IjoxNzkzMTc1NDE5LCJqdGkiOiIwNjI1ODU1OC02MTg0LTQ1MDktODNhYy0yODNkMmRkOTRmMDIiLCJzaWQiOiI2ZDc0MGE4Zi0zOTZkLTRiNzgtYjg3Ni03Njg3OTRlOWM4OTEifQ.P_tP1BGhPEWNO1qRDNMMFeManQIOYk4zBdd3pNhZOCU",
  "access_expires_at": "2026-10-28T08:31:59.663651668Z",
  "refresh_token": "NgIUcf5RCVZ1B3haELCc2uIZ1_l3AD2aCTKCcBgFB0Q",
  "refresh_expires_at": "2026-11-27T08:16:59.663137338Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
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
  "last_heartbeat_at": "2026-10-28T08:16:52.631289Z",
  "last_location_at": "2026-10-28T08:16:52.631289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/handover` → **200**

```json
{
  "command_id": "68ca5fa8-2195-4c7e-89a5-adca4c8f1c4a",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:16:52.631289Z",
  "last_location_at": "2026-10-28T08:16:52.631289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:16:59Z",
    "sequence": 1793175419752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:16:59.770352Z",
  "last_location_at": "2026-10-28T08:16:59.770352Z",
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
  "command_id": "d4975b42-3fd2-4283-8f14-f497b13360ff",
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
  "effective_at": "2026-10-28T08:16:59.842301Z",
  "changed_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T08:16:59.872296593Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "47121c1b-caa5-41d6-93ea-6ca00ca63c39",
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
  "id": "2d6915f4-7db1-4ff2-80fa-69056a052cbc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:21:59.910822Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "0476c51a-53d2-4fbb-93ec-59e59f386551",
  "quote_id": "2d6915f4-7db1-4ff2-80fa-69056a052cbc",
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
    "phone": "+3806711121600"
  }
}
```

```json
{
  "id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
  "short_number": 14,
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
  "created_at": "2026-10-28T08:16:59.949312Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121600"
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
    "id": "564a7705-77f0-4cd8-97f9-cde6388bb214",
    "order_id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
    "expires_at": "2026-10-28T08:17:14.95395Z",
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

`POST /api/driver/v1/offers/564a7705-77f0-4cd8-97f9-cde6388bb214/accept` → **200**

```json
{
  "command_id": "127e56c2-3e15-4b2c-b3e6-6680474a5ddf"
}
```

```json
{
  "id": "e95f044e-8eb8-499c-a994-0b1773d02118",
  "order_id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8b774a2e-2158-4031-b13a-16f7a4aec50a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8b774a2e-2158-4031-b13a-16f7a4aec50a",
  "order_id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
  "assignment_id": "e95f044e-8eb8-499c-a994-0b1773d02118",
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
    "phone": "+3806711121600"
  }
}
```

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:00Z",
    "sequence": 1793175420583
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:17:00.076394Z",
  "last_location_at": "2026-10-28T08:17:00.076394Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8b774a2e-2158-4031-b13a-16f7a4aec50a/arrive` → **200**

```json
{
  "command_id": "933eabda-bb6a-42c2-b7b6-88ca1fff9c7a",
  "expected_version": 0
}
```

```json
{
  "id": "8b774a2e-2158-4031-b13a-16f7a4aec50a",
  "order_id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
  "assignment_id": "e95f044e-8eb8-499c-a994-0b1773d02118",
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
  "arrived_at": "2026-10-28T08:17:00.113718Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121600"
  }
}
```

`POST /api/driver/v1/trips/8b774a2e-2158-4031-b13a-16f7a4aec50a/start` → **200**

```json
{
  "command_id": "575acfbf-f477-4a4f-99f5-ff630c3aa660",
  "expected_version": 1
}
```

```json
{
  "id": "8b774a2e-2158-4031-b13a-16f7a4aec50a",
  "order_id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
  "assignment_id": "e95f044e-8eb8-499c-a994-0b1773d02118",
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
  "arrived_at": "2026-10-28T08:17:00.113718Z",
  "started_at": "2026-10-28T08:17:00.15283Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121600"
  }
}
```

`POST /api/driver/v1/trips/8b774a2e-2158-4031-b13a-16f7a4aec50a/complete` → **200**

```json
{
  "command_id": "828e0fe0-24ab-4b17-b6a8-041467ca1d3e",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:17:00Z",
  "cash_received": true
}
```

```json
{
  "id": "8b774a2e-2158-4031-b13a-16f7a4aec50a",
  "order_id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
  "assignment_id": "e95f044e-8eb8-499c-a994-0b1773d02118",
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
  "arrived_at": "2026-10-28T08:17:00.113718Z",
  "started_at": "2026-10-28T08:17:00.15283Z",
  "completed_at": "2026-10-28T08:17:00.195181Z",
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
  "command_id": "076080cb-911d-463b-9a3a-40336044dfcf",
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
  "id": "4db2f7dd-84f0-44db-a24c-5a95b8796336",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:22:00.240909Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "0d421fcb-5538-4f28-b4fc-04b40efae376",
  "quote_id": "4db2f7dd-84f0-44db-a24c-5a95b8796336",
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
    "phone": "+3806711119364"
  }
}
```

```json
{
  "id": "77b232f6-dd7c-4ecd-a44e-58dab0f4176a",
  "short_number": 15,
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
  "created_at": "2026-10-28T08:17:00.279106Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119364"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/77b232f6-dd7c-4ecd-a44e-58dab0f4176a` → **200**

```json
{
  "id": "77b232f6-dd7c-4ecd-a44e-58dab0f4176a",
  "short_number": 15,
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
  "created_at": "2026-10-28T08:17:00.279106Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119364"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/77b232f6-dd7c-4ecd-a44e-58dab0f4176a/cancel` → **200**

```json
{
  "command_id": "52b2c23e-e448-4d1e-9f7c-02c7ad2ed3d3",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "77b232f6-dd7c-4ecd-a44e-58dab0f4176a",
  "short_number": 15,
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
  "created_at": "2026-10-28T08:17:00.279106Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119364"
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
  "staff_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T08:17:00.35254Z",
  "last_entries": [
    {
      "order_id": "77b232f6-dd7c-4ecd-a44e-58dab0f4176a",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T08:17:00.35254Z"
    },
    {
      "order_id": "a5d616e1-438a-4ab8-8468-d34b0e2eb57b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T08:17:00.201071Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b3290db-5657-4f10-88c1-59bf1aa44106",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T08:17:00.076394Z",
  "last_location_at": "2026-10-28T08:17:00.076394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b3290db-5657-4f10-88c1-59bf1aa44106/close` → **200**

```json
{
  "command_id": "db8a8709-3673-4e03-b077-363fc66e92a5",
  "expected_version": 2
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

Done: operator bonus for fulfilled a5d616e1-438a-4ab8-8468-d34b0e2eb57b and operator-fault cancellation 77b232f6-dd7c-4ecd-a44e-58dab0f4176a.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677932483",
  "device_ref": "sandbox-20831"
}
```

```json
{
  "challenge_id": "f9192952-e332-4427-9ab9-dd63d4f5abc9",
  "expires_at": "2026-10-28T08:22:02.516589958Z",
  "resend_available_at": "2026-10-28T08:17:03.516589958Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677932483` → **200**

```json
{
  "phone": "+380677932483",
  "audience": "CLIENT",
  "code": "969721",
  "sent_at": "2026-10-28T08:17:02.519000236Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674103851",
  "device_ref": "sandbox-19937",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "30d12e58-bec2-4b13-8822-dade354bab29",
  "expires_at": "2026-10-28T08:22:02.577133188Z",
  "resend_available_at": "2026-10-28T08:17:03.577133188Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674103851` → **200**

```json
{
  "phone": "+380674103851",
  "audience": "CLIENT",
  "code": "818354",
  "sent_at": "2026-10-28T08:17:02.579387157Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677270000",
  "device_ref": "sandbox-1155"
}
```

```json
{
  "challenge_id": "6108a70e-8854-4722-b11a-df84cbc364a9",
  "expires_at": "2026-10-28T08:22:02.635450635Z",
  "resend_available_at": "2026-10-28T08:17:03.635450635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677270000` → **200**

```json
{
  "phone": "+380677270000",
  "audience": "CLIENT",
  "code": "329304",
  "sent_at": "2026-10-28T08:17:02.638362662Z",
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
  "session_id": "a7065b75-5994-4f93-8734-cbcc9f061ba4",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMjIsImlhdCI6MTc5MzE3NTQyMiwianRpIjoiNjU2MDk2YjctOGE1My00NzczLTg1NWUtNTViNWI2YjEyNWI3Iiwic2lkIjoiYTcwNjViNzUtNTk5NC00ZjkzLTg3MzQtY2JjYzlmMDYxYmE0In0.CY6Y5mACdUneVZG818eZKkBFdYaVH6JIpZ18lkA8xeg",
  "access_expires_at": "2026-10-28T08:32:02.985929549Z",
  "refresh_token": "WHv7Ot8nsYfjZdgiHmjfmyjaDwuKRb97oR3EEPJ2Dtk",
  "refresh_expires_at": "2026-10-28T20:17:02.985327586Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677270000` → **200**

```json
{
  "deliveries": [
    {
      "id": "4ddf565e-977d-46cb-b098-0500f858b33a",
      "challenge_id": "6108a70e-8854-4722-b11a-df84cbc364a9",
      "phone": "+380677270000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ac696887-8dfa-40d0-a45c-f48751ad5339",
      "error": null,
      "attempted_at": "2026-10-28T08:17:02.638604Z"
    },
    {
      "id": "e04c411d-07bd-4a33-863b-ee8cd9ceaa58",
      "challenge_id": "6108a70e-8854-4722-b11a-df84cbc364a9",
      "phone": "+380677270000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T08:17:02.637846Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677270000` → **200**

```json
{
  "phone": "+380677270000",
  "audience": "CLIENT",
  "code": "329304",
  "sent_at": "2026-10-28T08:17:02.638362662Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674103851` → **200**

```json
{
  "deliveries": [
    {
      "id": "3066fe21-b2ec-40df-881e-ffb5ac22470f",
      "challenge_id": "30d12e58-bec2-4b13-8822-dade354bab29",
      "phone": "+380674103851",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-19494d85-ba1d-4d71-8959-88d1e5c3fd75",
      "error": null,
      "attempted_at": "2026-10-28T08:17:02.579603Z"
    }
  ]
}
```

Done: SMS to +380677932483, a call to +380674103851, SMS then a call to +380677270000.

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
  "session_id": "6f47e401-0328-48f3-b9b2-f962bec2e3b7",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMjMsImlhdCI6MTc5MzE3NTQyMywianRpIjoiYjUxOGQ2YzAtMmU5Yy00NTc0LWI1MGItMzc0ODI1NWUyY2Q1Iiwic2lkIjoiNmY0N2U0MDEtMDMyOC00OGYzLWI5YjItZjk2MmJlYzJlM2I3In0.PHp9BD9kf7-Qdm6-0N4X7F7e_NJ4XCpFBuzZvlAx2ss",
  "access_expires_at": "2026-10-28T08:32:03.416283329Z",
  "refresh_token": "6JISyM4N0DEqURNEROi0Na-FP50ZIV44YP3asqORbuw",
  "refresh_expires_at": "2026-10-28T20:17:03.415706192Z",
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
  "session_id": "1ad8576b-29a8-455b-8357-b35cdf2c3176",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMjMsImlhdCI6MTc5MzE3NTQyMywianRpIjoiY2VjODZlMTAtZWM4ZS00MWU3LWE1YTYtNDUzMzViYzg5NmI2Iiwic2lkIjoiMWFkODU3NmItMjlhOC00NTViLTgzNTctYjM1Y2RmMmMzMTc2In0.U_UWugP-tgk0Mx3f3PoQq9-eYSqDNvERolFFNqGOMik",
  "access_expires_at": "2026-10-28T08:32:03.742841293Z",
  "refresh_token": "gziuCDjX0o2dhdDdZRssFAzAlT8O8iLxjanF7wNK1MQ",
  "refresh_expires_at": "2026-10-28T20:17:03.742316294Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
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

`POST /api/admin/v1/staff-extensions/eef2d91e-7690-427b-8001-c8b4a40c20e5` → **200**

```json
{
  "command_id": "5f0f6668-1690-4d7d-aeb4-5353fa9c45fa",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "97fded9f-630d-468c-be87-d0e49d83cdad",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:17:03.881367Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:17:03.881367Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1dee0b7b-f1f7-4fd7-b7a5-7f200a255e9c",
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
  "id": "67d6bb7d-7e92-4e20-9d66-9ac3f9b18879",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:22:03.948941Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "6777f742-c20d-45a6-ab35-66abfa18ce0b",
  "quote_id": "67d6bb7d-7e92-4e20-9d66-9ac3f9b18879",
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
    "phone": "+380670408618"
  }
}
```

```json
{
  "id": "80b440e8-137f-4bb1-b37d-08f60ffebf3a",
  "short_number": 16,
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
  "created_at": "2026-10-28T08:17:03.990836Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670408618"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/80b440e8-137f-4bb1-b37d-08f60ffebf3a/calls` → **201**

```json
{
  "command_id": "6c97a7a0-00ea-4bf3-88b0-eaadd03caa60",
  "to": "CALLER"
}
```

```json
{
  "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "order_ids": [
    "80b440e8-137f-4bb1-b37d-08f60ffebf3a"
  ],
  "started_at": "2026-10-28T08:17:04.041723Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/80b440e8-137f-4bb1-b37d-08f60ffebf3a/calls` → **201**

```json
{
  "command_id": "6c97a7a0-00ea-4bf3-88b0-eaadd03caa60",
  "to": "CALLER"
}
```

```json
{
  "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "order_ids": [
    "80b440e8-137f-4bb1-b37d-08f60ffebf3a"
  ],
  "started_at": "2026-10-28T08:17:04.041723Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380670408618",
    "at": "2026-10-28T08:17:04.044810337Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.23257",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "4bb78633-ce7f-4827-b04c-a2f9a0086c15"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=80b440e8-137f-4bb1-b37d-08f60ffebf3a` → **200**

```json
{
  "calls": [
    {
      "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [
        "80b440e8-137f-4bb1-b37d-08f60ffebf3a"
      ],
      "started_at": "2026-10-28T08:17:04.041723Z",
      "answered_at": "2026-10-28T08:17:04.197104Z",
      "ended_at": "2026-10-28T08:17:04.220905Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80b440e8-137f-4bb1-b37d-08f60ffebf3a` → **200**

```json
{
  "calls": [
    {
      "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [
        "80b440e8-137f-4bb1-b37d-08f60ffebf3a"
      ],
      "started_at": "2026-10-28T08:17:04.041723Z",
      "answered_at": "2026-10-28T08:17:04.197104Z",
      "ended_at": "2026-10-28T08:17:04.220905Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80b440e8-137f-4bb1-b37d-08f60ffebf3a` → **200**

```json
{
  "calls": [
    {
      "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [
        "80b440e8-137f-4bb1-b37d-08f60ffebf3a"
      ],
      "started_at": "2026-10-28T08:17:04.041723Z",
      "answered_at": "2026-10-28T08:17:04.197104Z",
      "ended_at": "2026-10-28T08:17:04.220905Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80b440e8-137f-4bb1-b37d-08f60ffebf3a` → **200**

```json
{
  "calls": [
    {
      "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [
        "80b440e8-137f-4bb1-b37d-08f60ffebf3a"
      ],
      "started_at": "2026-10-28T08:17:04.041723Z",
      "answered_at": "2026-10-28T08:17:04.197104Z",
      "ended_at": "2026-10-28T08:17:04.220905Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=80b440e8-137f-4bb1-b37d-08f60ffebf3a` → **200**

```json
{
  "calls": [
    {
      "id": "4bb78633-ce7f-4827-b04c-a2f9a0086c15",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "order_ids": [
        "80b440e8-137f-4bb1-b37d-08f60ffebf3a"
      ],
      "started_at": "2026-10-28T08:17:04.041723Z",
      "answered_at": "2026-10-28T08:17:04.197104Z",
      "ended_at": "2026-10-28T08:17:04.220905Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:17:12.066667Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/80b440e8-137f-4bb1-b37d-08f60ffebf3a` → **200**

```json
{
  "id": "80b440e8-137f-4bb1-b37d-08f60ffebf3a",
  "short_number": 16,
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
  "created_at": "2026-10-28T08:17:03.990836Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670408618"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/80b440e8-137f-4bb1-b37d-08f60ffebf3a/cancel` → **200**

```json
{
  "command_id": "8edfa093-3aa2-4b7d-a771-abfa46af17e3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "80b440e8-137f-4bb1-b37d-08f60ffebf3a",
  "short_number": 16,
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
  "created_at": "2026-10-28T08:17:03.990836Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670408618"
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
  "command_id": "84837214-df2b-4c59-bf11-dfa27979c2ce",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T08:17:12.504685Z",
  "extension": "101"
}
```

Done: outgoing call 4bb78633-ce7f-4827-b04c-a2f9a0086c15 from order 80b440e8-137f-4bb1-b37d-08f60ffebf3a, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638194045",
  "device_ref": "sandbox-29067"
}
```

```json
{
  "challenge_id": "4fec121e-0b19-4376-8cae-a30cd9bd60f2",
  "expires_at": "2026-10-28T08:22:12.546298412Z",
  "resend_available_at": "2026-10-28T08:17:13.546298412Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638194045` → **200**

```json
{
  "phone": "+380638194045",
  "audience": "CLIENT",
  "code": "755833",
  "sent_at": "2026-10-28T08:17:12.549679819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fec121e-0b19-4376-8cae-a30cd9bd60f2",
  "code": "755833",
  "device_ref": "sandbox-29067"
}
```

```json
{
  "session_id": "99279f7a-b9d3-4d9d-a455-1fe03b039fc4",
  "subject": {
    "type": "CLIENT",
    "id": "b6188d95-b6c4-4884-b45b-516416219a97"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjE4OGQ5NS1iNmM0LTQ4ODQtYjQ1Yi01MTY0MTYyMTlhOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzMyLCJpYXQiOjE3OTMxNzU0MzIsImp0aSI6ImM1YmFhMDFmLTMwMjEtNDVlZS05MTY0LTg4N2ZhYjVmMmM1ZSIsInNpZCI6Ijk5Mjc5ZjdhLWI5ZDMtNGQ5ZC1hNDU1LTFmZTAzYjAzOWZjNCJ9.YVdfiWkImOY8vUzhNxKSDFp09122bgt1czxf2bM6_DI",
  "access_expires_at": "2026-10-28T08:32:12.606067622Z",
  "refresh_token": "GdM_JZKVpMtRYhZTNrUB6VgRJjNzIGlCYLmhIXf9h38",
  "refresh_expires_at": "2026-11-27T08:17:12.605396951Z",
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
  "session_id": "e48f90d5-6cdf-48e2-a830-fa8c91ee06e7",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMzMsImlhdCI6MTc5MzE3NTQzMywianRpIjoiODY3NjgwYzAtOGQ0Yy00YzA1LTgxN2YtNzcxYWY0NTI4YmY2Iiwic2lkIjoiZTQ4ZjkwZDUtNmNkZi00OGUyLWE4MzAtZmE4YzkxZWUwNmU3In0.BeptMNWN-haEoHAzvjZn_-YmGWmhqt-epdY4_e0pYZ8",
  "access_expires_at": "2026-10-28T08:32:13.010972557Z",
  "refresh_token": "UcaJV4y9SAu9f-hy1oPiv6A_POmgnaIHXJQU65DBEx8",
  "refresh_expires_at": "2026-10-28T20:17:13.010376355Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638194045` → **200**

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
  "correlation_id": "c2b7d2df-3961-489d-a432-65addb29f5a4"
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
  "session_id": "105bfac1-a9ed-49d3-9c0f-c7d06b476c8a",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMzMsImlhdCI6MTc5MzE3NTQzMywianRpIjoiMmY4YjM3ZGMtZDllOC00ODQ5LThlMTgtMDIxYjczYjA4MzIyIiwic2lkIjoiMTA1YmZhYzEtYTllZC00OWQzLTljMGYtYzdkMDZiNDc2YzhhIn0.G_Il6rjaH2__NpKZ-FwnwWIQxWuVPHCClYIxp74KNn8",
  "access_expires_at": "2026-10-28T08:32:13.416053332Z",
  "refresh_token": "Eamh4kOShiLJPifPQuACwQLgJ9jYlSOiHG-riIP-EHw",
  "refresh_expires_at": "2026-10-28T20:17:13.415393642Z",
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
  "command_id": "2d023e3d-a4b4-4048-bfe4-c23b3b0b4b91",
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
  "changed_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T08:17:13.490511706Z"
}
```

## The rider books the airport for 2026-10-28T11:17:13Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600626551",
  "device_ref": "sandbox-22115"
}
```

```json
{
  "challenge_id": "9c704a0b-58a2-4890-a35c-75e9c532656a",
  "expires_at": "2026-10-28T08:22:13.522553916Z",
  "resend_available_at": "2026-10-28T08:17:14.522553916Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600626551` → **200**

```json
{
  "phone": "+48600626551",
  "audience": "CLIENT",
  "code": "531689",
  "sent_at": "2026-10-28T08:17:13.52469652Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c704a0b-58a2-4890-a35c-75e9c532656a",
  "code": "531689",
  "device_ref": "sandbox-22115"
}
```

```json
{
  "session_id": "fe9262ff-62a1-40ab-af79-76ef13227b33",
  "subject": {
    "type": "CLIENT",
    "id": "e93f8716-aebb-417d-9b25-dbf1be592eff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTNmODcxNi1hZWJiLTQxN2QtOWIyNS1kYmYxYmU1OTJlZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzMzLCJpYXQiOjE3OTMxNzU0MzMsImp0aSI6ImM3NGU4ZGQ0LWI5NzYtNDUwNi05ZGYwLTZmZjJkYjQ1NzJjNiIsInNpZCI6ImZlOTI2MmZmLTYyYTEtNDBhYi1hZjc5LTc2ZWYxMzIyN2IzMyJ9.-zFoeaU8oCaQncceWBMr-PRRbkG3V6rVQ5aTHthKCGQ",
  "access_expires_at": "2026-10-28T08:32:13.58104831Z",
  "refresh_token": "JZxfS88q5Jv8Ef5As-9s-wJ4WJO5FpcwVz9_TBXw19k",
  "refresh_expires_at": "2026-11-27T08:17:13.580431801Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "051ddc53-f188-4064-8f63-688f3fec8e34",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T11:17:13Z"
}
```

```json
{
  "id": "ba831f31-b9ad-412c-a793-185187e53314",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T08:22:13.617466Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:17:13Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a4de2ac9-2377-46be-b0b9-d918704b6d5c",
  "quote_id": "ba831f31-b9ad-412c-a793-185187e53314",
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
  "pickup_at": "2026-10-28T11:17:13Z"
}
```

```json
{
  "id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e93f8716-aebb-417d-9b25-dbf1be592eff",
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
  "created_at": "2026-10-28T08:17:13.658551Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:17:13Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-14761"
}
```

```json
{
  "challenge_id": "567e0010-8943-4e50-b08c-a380d16d7ece",
  "expires_at": "2026-10-28T08:22:13.692166753Z",
  "resend_available_at": "2026-10-28T08:17:14.692166753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "909970",
  "sent_at": "2026-10-28T08:17:13.694297164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "567e0010-8943-4e50-b08c-a380d16d7ece",
  "code": "909970",
  "device_ref": "sandbox-14761"
}
```

```json
{
  "session_id": "dda17046-7509-4af2-9c20-316070d3aef2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMzMywiaWF0IjoxNzkzMTc1NDMzLCJqdGkiOiJkN2FkYjExMy1iZWNkLTQ5NDktYTBhNy0yM2YxZGMxODAyNGIiLCJzaWQiOiJkZGExNzA0Ni03NTA5LTRhZjItOWMyMC0zMTYwNzBkM2FlZjIifQ.7et43Qwj2_ZUnx_auZAC26-JVHJWoCoTZ4CNZvfi8xs",
  "access_expires_at": "2026-10-28T08:32:13.753468062Z",
  "refresh_token": "1R0cduwORmTUnHtZC82Q0UgVLrezH4RM2kv3ha9evjY",
  "refresh_expires_at": "2026-11-27T08:17:13.752853466Z",
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
  "command_id": "7c5917b0-7d86-407c-bb72-337ad7d3e463",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:13Z",
    "sequence": 1793175433805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8bfb872-b3b2-4b1e-b569-6b5d94c0537d",
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
  "last_heartbeat_at": "2026-10-28T08:17:13.823864Z",
  "last_location_at": "2026-10-28T08:17:13.823864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
      "short_number": 17,
      "pickup_at": "2026-10-28T11:17:13Z",
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

`POST /api/driver/v1/preorders/64ff86b2-5cd3-4de5-8000-a0b49b431e3d/reserve` → **200**

```json
{
  "command_id": "e049418e-16b6-423b-96ad-32a6baf8dcf1"
}
```

```json
{
  "id": "d1fca3d5-4d9e-4574-b672-6473bc613c86",
  "state": "RESERVED",
  "order": {
    "order_id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
    "short_number": 17,
    "pickup_at": "2026-10-28T11:17:13Z",
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
  "reserved_at": "2026-10-28T08:17:13.890736Z",
  "confirm_from": "2026-10-28T10:47:13Z",
  "confirm_until": "2026-10-28T10:57:13Z",
  "drop_until": "2026-10-28T10:17:13Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d1fca3d5-4d9e-4574-b672-6473bc613c86",
      "state": "RESERVED",
      "order": {
        "order_id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
        "short_number": 17,
        "pickup_at": "2026-10-28T11:17:13Z",
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
      "reserved_at": "2026-10-28T08:17:13.890736Z",
      "confirm_from": "2026-10-28T10:47:13Z",
      "confirm_until": "2026-10-28T10:57:13Z",
      "drop_until": "2026-10-28T10:17:13Z"
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
      "id": "d1fca3d5-4d9e-4574-b672-6473bc613c86",
      "state": "RESERVED",
      "order": {
        "order_id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
        "short_number": 17,
        "pickup_at": "2026-10-28T11:17:13Z",
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
      "reserved_at": "2026-10-28T08:17:13.890736Z",
      "confirm_from": "2026-10-28T10:47:13Z",
      "confirm_until": "2026-10-28T10:57:13Z",
      "drop_until": "2026-10-28T10:17:13Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d1fca3d5-4d9e-4574-b672-6473bc613c86/confirm` → **409**

```json
{
  "command_id": "442a4787-0e85-44e9-a8a0-953560cf08f9"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d1fca3d5-4d9e-4574-b672-6473bc613c86/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9f301d20-951a-4ece-b93d-4bbf6f3948ea"
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
  "session_id": "6188a236-4a36-4657-b670-8c67e2487010",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMzQsImlhdCI6MTc5MzE3NTQzNCwianRpIjoiMTE4N2ExMjYtOGVlZS00NDkwLTgxOTctMDk4NmFjMDA5NzczIiwic2lkIjoiNjE4OGEyMzYtNGEzNi00NjU3LWI2NzAtOGM2N2UyNDg3MDEwIn0.XtvbQUH553P06oE2fpIlfenyFHITLH-M9qM7A5tuBZM",
  "access_expires_at": "2026-10-28T08:32:14.295914518Z",
  "refresh_token": "-UykyvsAWuaAyjxaKbXprJ0-Tw8Bpp8hvrsmVc4xryk",
  "refresh_expires_at": "2026-10-28T20:17:14.295376845Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/64ff86b2-5cd3-4de5-8000-a0b49b431e3d` → **200**

```json
{
  "id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e93f8716-aebb-417d-9b25-dbf1be592eff",
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
  "created_at": "2026-10-28T08:17:13.658551Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T11:17:13Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d1fca3d5-4d9e-4574-b672-6473bc613c86",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T08:17:13.890736Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/64ff86b2-5cd3-4de5-8000-a0b49b431e3d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T08:17:13.659721Z",
      "actor": {
        "type": "CLIENT",
        "id": "e93f8716-aebb-417d-9b25-dbf1be592eff",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
        "preorder": true,
        "quote_id": "ba831f31-b9ad-412c-a793-185187e53314",
        "pickup_at": "2026-10-28T11:17:13Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T08:17:13.891925Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "64ff86b2-5cd3-4de5-8000-a0b49b431e3d",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d1fca3d5-4d9e-4574-b672-6473bc613c86"
      }
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 64ff86b2-5cd3-4de5-8000-a0b49b431e3d, reservation d1fca3d5-4d9e-4574-b672-6473bc613c86.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30816"
}
```

```json
{
  "challenge_id": "b118c3a9-f091-4693-90c0-cc810468a1d7",
  "expires_at": "2026-10-28T08:22:14.387671858Z",
  "resend_available_at": "2026-10-28T08:17:15.387671858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "649569",
  "sent_at": "2026-10-28T08:17:14.390149706Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b118c3a9-f091-4693-90c0-cc810468a1d7",
  "code": "649569",
  "device_ref": "sandbox-30816"
}
```

```json
{
  "session_id": "1d79dc0b-c647-45b2-bf95-f52ce1c25eca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjMzNCwiaWF0IjoxNzkzMTc1NDM0LCJqdGkiOiI4MjE2NWJjNi0wMjUxLTQ2YWItYjJmNi0yMDcwZWE3Nzk4NWIiLCJzaWQiOiIxZDc5ZGMwYi1jNjQ3LTQ1YjItYmY5NS1mNTJjZTFjMjVlY2EifQ.QCbudpao2rxlXG8cQjvEDeWsKolKrII14A_heQDsAJE",
  "access_expires_at": "2026-10-28T08:32:14.449300147Z",
  "refresh_token": "WPoAANZSnACxc0dxVyUo6iXBsdkDvX10JyGv2UDYM8E",
  "refresh_expires_at": "2026-11-27T08:17:14.448607737Z",
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
  "command_id": "58698b8c-bee6-46f7-88a1-e59e811dc3ac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:14Z",
    "sequence": 1793175434502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce5a6338-6ed0-4a38-accb-1f363e8b5445",
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
  "last_heartbeat_at": "2026-10-28T08:17:14.521433Z",
  "last_location_at": "2026-10-28T08:17:14.521433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679754190",
  "device_ref": "sandbox-13297"
}
```

```json
{
  "challenge_id": "0a08bc29-a053-4220-bd54-b158de4aa6c6",
  "expires_at": "2026-10-28T08:22:14.551487053Z",
  "resend_available_at": "2026-10-28T08:17:15.551487053Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679754190` → **200**

```json
{
  "phone": "+380679754190",
  "audience": "CLIENT",
  "code": "523508",
  "sent_at": "2026-10-28T08:17:14.553812097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a08bc29-a053-4220-bd54-b158de4aa6c6",
  "code": "523508",
  "device_ref": "sandbox-13297"
}
```

```json
{
  "session_id": "821412d1-4365-41d7-a20a-6031aa5c7609",
  "subject": {
    "type": "CLIENT",
    "id": "60c8e100-dc3e-43f8-bde5-ab64ebfba625"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MGM4ZTEwMC1kYzNlLTQzZjgtYmRlNS1hYjY0ZWJmYmE2MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzM0LCJpYXQiOjE3OTMxNzU0MzQsImp0aSI6ImQ5MzQ1ZDI5LThiN2ItNGNlYy1iNjdkLWZkZDczMjM5MzMxNSIsInNpZCI6IjgyMTQxMmQxLTQzNjUtNDFkNy1hMjBhLTYwMzFhYTVjNzYwOSJ9.SSan1n0wAX9V7SH8YJlzm-KwmNsdbmjxK1myf_Pg9CM",
  "access_expires_at": "2026-10-28T08:32:14.611591561Z",
  "refresh_token": "rFS7w31FTY_kroGSKHYwLQKTKXV-8YQ1b4lzZ8VR4EA",
  "refresh_expires_at": "2026-11-27T08:17:14.610793543Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f2a121b2-90f5-4c66-b285-49bd7462b667",
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
  "id": "69015ad0-a530-4df2-8c9d-1ec7f2dc0a1d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:22:14.650762Z",
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
  "command_id": "004de5fc-d893-4b2a-bb7a-7a7849d89457",
  "quote_id": "69015ad0-a530-4df2-8c9d-1ec7f2dc0a1d",
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
  "id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "60c8e100-dc3e-43f8-bde5-ab64ebfba625",
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
  "created_at": "2026-10-28T08:17:14.689889Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6c4a30c5-bce2-4942-8e10-335787ae6598",
    "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
    "expires_at": "2026-10-28T08:17:29.693085Z",
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

`POST /api/driver/v1/offers/6c4a30c5-bce2-4942-8e10-335787ae6598/accept` → **200**

```json
{
  "command_id": "cda6c816-9424-46ed-9103-de74adf0b023"
}
```

```json
{
  "id": "353f7e94-79c9-4ff3-82f1-d89e1db211ac",
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d9c6059d-e925-4b4d-bc74-57dcb8414166",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d9c6059d-e925-4b4d-bc74-57dcb8414166",
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "assignment_id": "353f7e94-79c9-4ff3-82f1-d89e1db211ac",
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

`POST /api/driver/v1/work-sessions/ce5a6338-6ed0-4a38-accb-1f363e8b5445/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:14Z",
    "sequence": 1793175434806
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce5a6338-6ed0-4a38-accb-1f363e8b5445",
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
  "last_heartbeat_at": "2026-10-28T08:17:14.824382Z",
  "last_location_at": "2026-10-28T08:17:14.824382Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d9c6059d-e925-4b4d-bc74-57dcb8414166",
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "assignment_id": "353f7e94-79c9-4ff3-82f1-d89e1db211ac",
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

`POST /api/driver/v1/trips/d9c6059d-e925-4b4d-bc74-57dcb8414166/arrive` → **200**

```json
{
  "command_id": "8d37bf09-69aa-4cd4-a101-f009e022c00b",
  "expected_version": 0
}
```

```json
{
  "id": "d9c6059d-e925-4b4d-bc74-57dcb8414166",
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "assignment_id": "353f7e94-79c9-4ff3-82f1-d89e1db211ac",
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
  "arrived_at": "2026-10-28T08:17:14.88408Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d9c6059d-e925-4b4d-bc74-57dcb8414166/start` → **200**

```json
{
  "command_id": "35d93f00-fe0c-423d-9c03-860bca118d48",
  "expected_version": 1
}
```

```json
{
  "id": "d9c6059d-e925-4b4d-bc74-57dcb8414166",
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "assignment_id": "353f7e94-79c9-4ff3-82f1-d89e1db211ac",
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
  "arrived_at": "2026-10-28T08:17:14.88408Z",
  "started_at": "2026-10-28T08:17:14.918116Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ce5a6338-6ed0-4a38-accb-1f363e8b5445/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:14Z",
    "sequence": 1793175434941
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce5a6338-6ed0-4a38-accb-1f363e8b5445",
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
  "last_heartbeat_at": "2026-10-28T08:17:14.960303Z",
  "last_location_at": "2026-10-28T08:17:14.960303Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d9c6059d-e925-4b4d-bc74-57dcb8414166/complete` → **200**

```json
{
  "command_id": "af24865a-fe64-4333-a170-58e3a4ba5de7",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:17:14Z",
  "cash_received": true
}
```

```json
{
  "id": "d9c6059d-e925-4b4d-bc74-57dcb8414166",
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "assignment_id": "353f7e94-79c9-4ff3-82f1-d89e1db211ac",
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
  "arrived_at": "2026-10-28T08:17:14.88408Z",
  "started_at": "2026-10-28T08:17:14.918116Z",
  "completed_at": "2026-10-28T08:17:14.999372Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f1ccd7cc-d72d-414c-8fd7-bb370c60d125/rating` → **200**

```json
{
  "command_id": "f14fe7dc-cf7c-4abb-b78f-017fed7cb822",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "score": 5,
  "created_at": "2026-10-28T08:17:15.04880907Z"
}
```

`POST /api/driver/v1/orders/f1ccd7cc-d72d-414c-8fd7-bb370c60d125/rating` → **200**

```json
{
  "command_id": "c0c001f4-d152-4ed1-9ca2-30b896ec6dd6",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
  "score": 4,
  "created_at": "2026-10-28T08:17:15.085913649Z"
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
  "session_id": "dde8eeaf-7b49-4c84-9efe-40819e015a0d",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMzUsImlhdCI6MTc5MzE3NTQzNSwianRpIjoiNmI3NGUwODUtM2E3ZS00OGIyLWIyYTEtMDUwZWZhNzk5ZmU2Iiwic2lkIjoiZGRlOGVlYWYtN2I0OS00Yzg0LTllZmUtNDA4MTllMDE1YTBkIn0.nNprNKo2Rp8HmfrazVyiCAN1Eqs6hKM7i0FcZIA-VuQ",
  "access_expires_at": "2026-10-28T08:32:15.446768355Z",
  "refresh_token": "g05N2wgqS8Jhpt1bGzOcLY55seFpdGPYAgJadynzDJo",
  "refresh_expires_at": "2026-10-28T20:17:15.446155453Z",
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
  "session_id": "8de494e4-d8f6-4e82-81d1-44dbd3c83bfb",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMzUsImlhdCI6MTc5MzE3NTQzNSwianRpIjoiYjNlMjZlZDctZjRhNC00ZWU1LTlkN2EtN2UwYjljZGEwYzFkIiwic2lkIjoiOGRlNDk0ZTQtZDhmNi00ZTgyLTgxZDEtNDRkYmQzYzgzYmZiIn0.ry3aB6uRoDeVoy8ICHXsAfmck3lLVrDeerEhH5sTYJE",
  "access_expires_at": "2026-10-28T08:32:15.765854981Z",
  "refresh_token": "Vq8ksk2XqPmlV5RfO_3AiUqCTkCc_2FvXkvw7fGudO8",
  "refresh_expires_at": "2026-10-28T20:17:15.765300889Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f1ccd7cc-d72d-414c-8fd7-bb370c60d125/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
      "author_type": "RIDER",
      "author_id": "60c8e100-dc3e-43f8-bde5-ab64ebfba625",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T08:17:15.048809Z"
    },
    {
      "order_id": "f1ccd7cc-d72d-414c-8fd7-bb370c60d125",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "60c8e100-dc3e-43f8-bde5-ab64ebfba625",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T08:17:15.085914Z"
    }
  ]
}
```

Done: ratings for order f1ccd7cc-d72d-414c-8fd7-bb370c60d125.

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
  "session_id": "9b15a7e5-6d06-4af7-8592-12855015742c",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzMzYsImlhdCI6MTc5MzE3NTQzNiwianRpIjoiYTI4ZmNhZTQtYjAzMS00OWRmLTgxYmMtYTcwYmJjZmNiZTE3Iiwic2lkIjoiOWIxNWE3ZTUtNmQwNi00YWY3LTg1OTItMTI4NTUwMTU3NDJjIn0.g-0wqWKPsIX6Gu8UH-Vyo81fF6OChzxJZNKjbVmeSwg",
  "access_expires_at": "2026-10-28T08:32:16.137615008Z",
  "refresh_token": "_nnOA_zKRekJmBWfQOjLXQHzkKDRVvUR2o63fK2ywmM",
  "refresh_expires_at": "2026-10-28T20:17:16.13703102Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c5bbc980-3808-4c63-bb3a-8b0e17c9c62f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "b0a80df7-1419-48a6-af25-2400f9e19242",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:16.180375Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0a80df7-1419-48a6-af25-2400f9e19242` → **200**

```json
{
  "id": "b0a80df7-1419-48a6-af25-2400f9e19242",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:16.180375Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0a80df7-1419-48a6-af25-2400f9e19242` → **200**

```json
{
  "id": "b0a80df7-1419-48a6-af25-2400f9e19242",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:17:16.180375Z",
  "ready_at": "2026-10-28T08:17:17.078148Z",
  "expires_at": "2026-10-29T08:17:17.078148Z"
}
```

`GET /api/admin/v1/reports/exports/b0a80df7-1419-48a6-af25-2400f9e19242/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
total,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "adda4517-5848-4eff-b492-83d7d4e8c0a4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "aa087398-12d8-4402-9e1c-6c3fbaecdc38",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:17.310176Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aa087398-12d8-4402-9e1c-6c3fbaecdc38` → **200**

```json
{
  "id": "aa087398-12d8-4402-9e1c-6c3fbaecdc38",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:17.310176Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aa087398-12d8-4402-9e1c-6c3fbaecdc38` → **200**

```json
{
  "id": "aa087398-12d8-4402-9e1c-6c3fbaecdc38",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:17.310176Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aa087398-12d8-4402-9e1c-6c3fbaecdc38` → **200**

```json
{
  "id": "aa087398-12d8-4402-9e1c-6c3fbaecdc38",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:17.310176Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aa087398-12d8-4402-9e1c-6c3fbaecdc38` → **200**

```json
{
  "id": "aa087398-12d8-4402-9e1c-6c3fbaecdc38",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:17.310176Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aa087398-12d8-4402-9e1c-6c3fbaecdc38` → **200**

```json
{
  "id": "aa087398-12d8-4402-9e1c-6c3fbaecdc38",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:17:17.310176Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aa087398-12d8-4402-9e1c-6c3fbaecdc38` → **200**

```json
{
  "id": "aa087398-12d8-4402-9e1c-6c3fbaecdc38",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:17:17.310176Z",
  "ready_at": "2026-10-28T08:17:22.086314Z",
  "expires_at": "2026-10-29T08:17:22.086314Z"
}
```

`GET /api/admin/v1/reports/exports/aa087398-12d8-4402-9e1c-6c3fbaecdc38/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/3120f9af-d7bd-4a13-a458-755cca0fab39` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/3120f9af-d7bd-4a13-a458-755cca0fab39",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e5e9a254-acee-467a-8406-224ecd765b06"
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
  "device_ref": "sandbox-9897"
}
```

```json
{
  "challenge_id": "08ddb940-624a-467d-a873-d56524b1222d",
  "expires_at": "2026-10-28T08:22:22.574026277Z",
  "resend_available_at": "2026-10-28T08:17:23.574026277Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "145713",
  "sent_at": "2026-10-28T08:17:22.576702619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08ddb940-624a-467d-a873-d56524b1222d",
  "code": "145713",
  "device_ref": "sandbox-9897"
}
```

```json
{
  "session_id": "957f7bb2-39ba-4e92-a836-6498585bef2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjM0MiwiaWF0IjoxNzkzMTc1NDQyLCJqdGkiOiJjNmIxMTEyMy1hZDFmLTQwMDktYTdhNS0xZmQ5NTEzMTExNmUiLCJzaWQiOiI5NTdmN2JiMi0zOWJhLTRlOTItYTgzNi02NDk4NTg1YmVmMmYifQ.V3FxIUbVdrtIrnAPgGdfRfehwlAGjFwXmq3BgQ8tleY",
  "access_expires_at": "2026-10-28T08:32:22.633699499Z",
  "refresh_token": "n70jThPANofZvIs1ZwW_gnFM6IMvCa92RKxIPLw2a6k",
  "refresh_expires_at": "2026-11-27T08:17:22.633136298Z",
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
  "command_id": "ad6bf6fd-9e30-49a3-b610-956496807bbc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:22Z",
    "sequence": 1793175442709
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0245e17f-1f3f-46a1-af63-91c1561bf800",
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
  "last_heartbeat_at": "2026-10-28T08:17:22.728311Z",
  "last_location_at": "2026-10-28T08:17:22.728311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "d29de8ab-0082-4fea-9c6c-837b2b6c2b38",
  "points": [
    {
      "sequence": 1793175444762,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:16:24Z"
    },
    {
      "sequence": 1793175444769,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:17:24Z"
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
  "session_id": "d20b5dcb-9fe9-4c1c-a8cf-9b9deaa0ae85",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzNDUsImlhdCI6MTc5MzE3NTQ0NSwianRpIjoiMDU1NDdhODAtOWM3OC00OTJhLWEzYzktYjA2MDhiODAxN2RiIiwic2lkIjoiZDIwYjVkY2ItOWZlOS00YzFjLWE4Y2YtOWI5ZGVhYTBhZTg1In0.AUrcSrnyknvLb_1NslDI6TfHasLO2sa1egZBUkH0vZ0",
  "access_expires_at": "2026-10-28T08:32:25.149125728Z",
  "refresh_token": "qJojdSEkxCvU6nDGub2-RAtSHPzN4dg1sUBKEEPLWeo",
  "refresh_expires_at": "2026-10-28T20:17:25.148528043Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "32abc872-9f78-4f11-8771-5caa64fecc07",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T08:17:24Z",
        "track_point_id": "63dc9a63-b08c-4abc-8ca7-f4582524c35e",
        "work_session_id": "0245e17f-1f3f-46a1-af63-91c1561bf800"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T08:17:24Z",
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

`POST /api/admin/v1/driver-risk-flags/32abc872-9f78-4f11-8771-5caa64fecc07/confirm` → **200**

```json
{
  "command_id": "1d5ebdc8-8959-4c65-8588-2224dc0b5866",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "32abc872-9f78-4f11-8771-5caa64fecc07",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T08:17:24Z",
    "track_point_id": "63dc9a63-b08c-4abc-8ca7-f4582524c35e",
    "work_session_id": "0245e17f-1f3f-46a1-af63-91c1561bf800"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T08:17:24Z",
  "reason": null,
  "reviewed_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "reviewed_at": "2026-10-28T08:17:25.27359Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/32abc872-9f78-4f11-8771-5caa64fecc07/dismiss` → **409**

```json
{
  "command_id": "648b59a0-c65a-4fba-8539-e1ec9491bc97",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/32abc872-9f78-4f11-8771-5caa64fecc07/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "52c5df2a-1748-4967-b5ee-3ee2556507f3"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c5238999-7556-4d99-88ec-6f6ff3c3db2a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "85654fe0-2c17-4f40-ac2d-2b6ea15ba591",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "raised_at": "2026-10-28T08:17:25.351048Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/85654fe0-2c17-4f40-ac2d-2b6ea15ba591/dismiss` → **200**

```json
{
  "command_id": "30d8eae6-63b3-46ac-9d03-c4d96478d52b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "85654fe0-2c17-4f40-ac2d-2b6ea15ba591",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "raised_at": "2026-10-28T08:17:25.351048Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "reviewed_at": "2026-10-28T08:17:25.391698Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c3df6878-61aa-434d-9234-795010d00fca",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "32abc872-9f78-4f11-8771-5caa64fecc07"
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
      "actor_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T08:17:25.437081Z"
    }
  ]
}
```

Done: flag 32abc872-9f78-4f11-8771-5caa64fecc07 confirmed, suspension named it, driver reinstated.

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
  "session_id": "f341f794-4439-4ff8-9cb0-a7b37ff015b9",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzNDUsImlhdCI6MTc5MzE3NTQ0NSwianRpIjoiOGY4MzQ2N2UtODZmOS00ODYwLTgyMzMtMWYyNzY2MWIyMGFiIiwic2lkIjoiZjM0MWY3OTQtNDQzOS00ZmY4LTljYjAtYTdiMzdmZjAxNWI5In0.9Yf6ARCilYkml_e9wVHWqL0br-yYYa0HWCy4TG3zMUE",
  "access_expires_at": "2026-10-28T08:32:25.789334005Z",
  "refresh_token": "WRLxtH7aEZYJMumPsHCR_NVt7-BBRCxAIsxa9m9vaUk",
  "refresh_expires_at": "2026-10-28T20:17:25.788763731Z",
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
      "actor_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T08:17:25.437081Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "9bb84fa7-90bc-4d62-aed8-8599525de2a2",
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
  "session_id": "0245e17f-1f3f-46a1-af63-91c1561bf800",
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
  "last_heartbeat_at": "2026-10-28T08:17:22.728311Z",
  "last_location_at": "2026-10-28T08:17:22.728311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0245e17f-1f3f-46a1-af63-91c1561bf800/close` → **200**

```json
{
  "command_id": "a0e506fc-c916-4653-a05f-1d34f92e33b8",
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
  "session_id": "1f65580d-96fe-45c8-9a11-61af9a2f89de",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzNDYsImlhdCI6MTc5MzE3NTQ0NiwianRpIjoiYzVkNGM5MjAtNjc4YS00NzViLWE4ZmQtMzhkM2Y4ZmJhZDc2Iiwic2lkIjoiMWY2NTU4MGQtOTZmZS00NWM4LTlhMTEtNjFhZjlhMmY4OWRlIn0.1AarNqI9r4ng4vkcZnz95BCLL2xyPLminQJyXx6-6lA",
  "access_expires_at": "2026-10-28T08:32:26.265803365Z",
  "refresh_token": "2JKIjX1BZmupXxNECT-WCgqeX04OSBgth4XI8HLFiLI",
  "refresh_expires_at": "2026-10-28T20:17:26.265142222Z",
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
  "command_id": "468f3cc5-07f9-42a5-b1e9-d7578ffcdf78",
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
  "changed_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:17:26.349833Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "468f3cc5-07f9-42a5-b1e9-d7578ffcdf78",
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
  "changed_by": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:17:26.349833Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48072065124",
  "device_ref": "sandbox-8146"
}
```

```json
{
  "challenge_id": "594ec4cf-094f-4769-9a5c-992e8ea04585",
  "expires_at": "2026-10-28T08:22:26.427819294Z",
  "resend_available_at": "2026-10-28T08:17:27.427819294Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48072065124` → **200**

```json
{
  "phone": "+48072065124",
  "audience": "CLIENT",
  "code": "391156",
  "sent_at": "2026-10-28T08:17:26.430174588Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "594ec4cf-094f-4769-9a5c-992e8ea04585",
  "code": "391156",
  "device_ref": "sandbox-8146"
}
```

```json
{
  "session_id": "8c45351b-3fb5-459a-bee2-9ae071888bbc",
  "subject": {
    "type": "CLIENT",
    "id": "fa9706df-9e9d-4d9d-a9b8-35289308d48d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTk3MDZkZi05ZTlkLTRkOWQtYTliOC0zNTI4OTMwOGQ0OGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzQ2LCJpYXQiOjE3OTMxNzU0NDYsImp0aSI6ImMxZjlhMWIzLTRjZDUtNGFjNS05NzhjLTM5ODU0ZDM4Mjc3NiIsInNpZCI6IjhjNDUzNTFiLTNmYjUtNDU5YS1iZWUyLTlhZTA3MTg4OGJiYyJ9.ntUKTDkIiekgdjlZXISQfCheGKoQtiq5qj18n2BAL5o",
  "access_expires_at": "2026-10-28T08:32:26.490275237Z",
  "refresh_token": "cEuSYVfQdnJx-lsAXeqfS1tvlocsWCxpDEz5Y1SIp5o",
  "refresh_expires_at": "2026-11-27T08:17:26.489692981Z",
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
  "correlation_id": "b13fbf43-da9e-4e12-8fba-69df04583d3a"
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
  "device_ref": "sandbox-9282"
}
```

```json
{
  "challenge_id": "bb312766-3a8b-4be0-9d3b-a3e2024a17b2",
  "expires_at": "2026-10-28T08:22:26.576059414Z",
  "resend_available_at": "2026-10-28T08:17:27.576059414Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "639511",
  "sent_at": "2026-10-28T08:17:26.578714267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb312766-3a8b-4be0-9d3b-a3e2024a17b2",
  "code": "639511",
  "device_ref": "sandbox-9282"
}
```

```json
{
  "session_id": "625970d4-e85b-475c-8bbd-028034484878",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjM0NiwiaWF0IjoxNzkzMTc1NDQ2LCJqdGkiOiJkZDcwYmQyNi01MzQ0LTQ2YTMtYWViYy05MWU1NTEwOGVjM2IiLCJzaWQiOiI2MjU5NzBkNC1lODViLTQ3NWMtOGJiZC0wMjgwMzQ0ODQ4NzgifQ.lv92sSHiTa6dTbbvWn1Zts2qS0KPHDCcNS7Yn0aGWl0",
  "access_expires_at": "2026-10-28T08:32:26.63723005Z",
  "refresh_token": "KUrFC_w3PSNpgwM_gT5nLS_dAYY4boYnXox9iRwwiUg",
  "refresh_expires_at": "2026-11-27T08:17:26.636503494Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8bfb872-b3b2-4b1e-b569-6b5d94c0537d",
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
  "last_heartbeat_at": "2026-10-28T08:17:13.823864Z",
  "last_location_at": "2026-10-28T08:17:13.823864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8bfb872-b3b2-4b1e-b569-6b5d94c0537d/handover` → **200**

```json
{
  "command_id": "4151aa83-ef9c-4b27-9aaf-e3080be32796",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8bfb872-b3b2-4b1e-b569-6b5d94c0537d",
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
  "last_heartbeat_at": "2026-10-28T08:17:13.823864Z",
  "last_location_at": "2026-10-28T08:17:13.823864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8bfb872-b3b2-4b1e-b569-6b5d94c0537d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:26Z",
    "sequence": 1793175446732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8bfb872-b3b2-4b1e-b569-6b5d94c0537d",
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
  "last_heartbeat_at": "2026-10-28T08:17:26.751832Z",
  "last_location_at": "2026-10-28T08:17:26.751832Z",
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
  "session_id": "c8bfb872-b3b2-4b1e-b569-6b5d94c0537d",
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
  "last_heartbeat_at": "2026-10-28T08:17:26.751832Z",
  "last_location_at": "2026-10-28T08:17:26.751832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8bfb872-b3b2-4b1e-b569-6b5d94c0537d/close` → **200**

```json
{
  "command_id": "f0f6cb0a-7779-44a8-94fd-ea5b7246bc73",
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
  "correlation_id": "c72e1425-925f-4174-bcc4-32b51bcd5a33"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673551455",
  "device_ref": "sandbox-10078"
}
```

```json
{
  "challenge_id": "cb9d7701-47a3-49af-b0db-41b825b721cc",
  "expires_at": "2026-10-28T08:22:26.924254869Z",
  "resend_available_at": "2026-10-28T08:17:27.924254869Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673551455` → **200**

```json
{
  "phone": "+380673551455",
  "audience": "CLIENT",
  "code": "624727",
  "sent_at": "2026-10-28T08:17:26.926431527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb9d7701-47a3-49af-b0db-41b825b721cc",
  "code": "624727",
  "device_ref": "sandbox-10078"
}
```

```json
{
  "session_id": "378562ac-a74f-430c-bf83-b8c37b1f030f",
  "subject": {
    "type": "CLIENT",
    "id": "39350d2c-c318-4477-92af-1c379bbb6908"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTM1MGQyYy1jMzE4LTQ0NzctOTJhZi0xYzM3OWJiYjY5MDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MzQ2LCJpYXQiOjE3OTMxNzU0NDYsImp0aSI6IjJlYTY0NDkyLTkxOGItNGRmNS1hMjE2LWY1NTJjZjEyZjUwNSIsInNpZCI6IjM3ODU2MmFjLWE3NGYtNDMwYy1iZjgzLWI4YzM3YjFmMDMwZiJ9.c1tdMvyP5ap0iT1RYBR7q92GEWXjfqBOQtSHbIESZn4",
  "access_expires_at": "2026-10-28T08:32:26.981719298Z",
  "refresh_token": "gDPpM9aTSIIVkVfg2C_21Zn1HT1BLN6697pGVowLk2k",
  "refresh_expires_at": "2026-11-27T08:17:26.980951494Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "3ab7ea6f-45c7-445b-9f42-634aa603d463",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "29286450-7258-488d-8682-2634faca30ff",
  "upload_path": "/api/rider/v1/uploads/29286450-7258-488d-8682-2634faca30ff",
  "expires_at": "2026-10-28T08:32:27.019435075Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/29286450-7258-488d-8682-2634faca30ff` → **200**

```json
{
  "file_id": "29286450-7258-488d-8682-2634faca30ff",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "ff40d072-17e0-40bb-b2a0-e2d235fb7513",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "29286450-7258-488d-8682-2634faca30ff"
  ]
}
```

```json
{
  "id": "e16406ac-a4ed-4e67-8a0d-8d5516662c69",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39350d2c-c318-4477-92af-1c379bbb6908",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:17:27.089245Z",
  "updated_at": "2026-10-28T08:17:27.089245Z",
  "messages": [
    {
      "id": "17bb7d9c-75f4-4e82-928b-ed83a1d8ec67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39350d2c-c318-4477-92af-1c379bbb6908",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:17:27.090684Z",
      "attachments": [
        {
          "file_id": "29286450-7258-488d-8682-2634faca30ff",
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
  "session_id": "643b781a-8a10-4ed6-a6b6-aed55675da92",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzNDcsImlhdCI6MTc5MzE3NTQ0NywianRpIjoiMTkzZDBhMmUtNDQzNC00M2FmLTg5M2EtYzUyYmQ4ZTM1NzMwIiwic2lkIjoiNjQzYjc4MWEtOGExMC00ZWQ2LWE2YjYtYWVkNTU2NzVkYTkyIn0.pMBsXlrC4qZt94kRGfF35gcmoRdWoNL-Pg4q42U2Fgc",
  "access_expires_at": "2026-10-28T08:32:27.42799492Z",
  "refresh_token": "6GzR5ZwtGqAl1cA_ACFYm1TDK89wr2HAoUlH0H6tlM4",
  "refresh_expires_at": "2026-10-28T20:17:27.427445024Z",
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
  "session_id": "edbf8012-4228-4ca6-a6cc-69b1f1cb5000",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzNDcsImlhdCI6MTc5MzE3NTQ0NywianRpIjoiZTM2YTQ3M2YtOGVkMC00MzgxLTllOWYtNTUwOGU3Yjc0ODlkIiwic2lkIjoiZWRiZjgwMTItNDIyOC00Y2E2LWE2Y2MtNjliMWYxY2I1MDAwIn0.Env95Nu1epyYVbQmpdnBiciaXjtb_Y59FXaEcha4wWs",
  "access_expires_at": "2026-10-28T08:32:27.748354517Z",
  "refresh_token": "LXSpsjY0yYbeEngWK-ngvKT3C3nVngwUXBBNP2DlDbA",
  "refresh_expires_at": "2026-10-28T20:17:27.747809872Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/e16406ac-a4ed-4e67-8a0d-8d5516662c69/attachments/29286450-7258-488d-8682-2634faca30ff` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "910cec92-720a-4ff3-a84d-7a67f3462dd4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "017d82ea-8774-47c8-a89e-6d56c9a530fb",
  "upload_path": "/api/operator/v1/uploads/017d82ea-8774-47c8-a89e-6d56c9a530fb",
  "expires_at": "2026-10-28T08:32:27.796636968Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/017d82ea-8774-47c8-a89e-6d56c9a530fb` → **200**

```json
{
  "file_id": "017d82ea-8774-47c8-a89e-6d56c9a530fb",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/e16406ac-a4ed-4e67-8a0d-8d5516662c69` → **200**

```json
{
  "id": "e16406ac-a4ed-4e67-8a0d-8d5516662c69",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39350d2c-c318-4477-92af-1c379bbb6908",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:17:27.089245Z",
  "updated_at": "2026-10-28T08:17:27.089245Z",
  "messages": [
    {
      "id": "17bb7d9c-75f4-4e82-928b-ed83a1d8ec67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39350d2c-c318-4477-92af-1c379bbb6908",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:17:27.090684Z",
      "attachments": [
        {
          "file_id": "29286450-7258-488d-8682-2634faca30ff",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/e16406ac-a4ed-4e67-8a0d-8d5516662c69/comments` → **200**

```json
{
  "command_id": "cdebbac1-1f7f-4d05-ad65-3b4b9c4cba8c",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "017d82ea-8774-47c8-a89e-6d56c9a530fb"
  ]
}
```

```json
{
  "id": "e16406ac-a4ed-4e67-8a0d-8d5516662c69",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39350d2c-c318-4477-92af-1c379bbb6908",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:17:27.089245Z",
  "updated_at": "2026-10-28T08:17:27.890339Z",
  "messages": [
    {
      "id": "17bb7d9c-75f4-4e82-928b-ed83a1d8ec67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39350d2c-c318-4477-92af-1c379bbb6908",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:17:27.090684Z",
      "attachments": [
        {
          "file_id": "29286450-7258-488d-8682-2634faca30ff",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f40a8161-afb2-4ee6-8ba4-18fe1de4665a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:17:27.890008Z",
      "attachments": [
        {
          "file_id": "017d82ea-8774-47c8-a89e-6d56c9a530fb",
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

`GET /api/rider/v1/support/cases/e16406ac-a4ed-4e67-8a0d-8d5516662c69` → **200**

```json
{
  "id": "e16406ac-a4ed-4e67-8a0d-8d5516662c69",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39350d2c-c318-4477-92af-1c379bbb6908",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:17:27.089245Z",
  "updated_at": "2026-10-28T08:17:27.890339Z",
  "messages": [
    {
      "id": "17bb7d9c-75f4-4e82-928b-ed83a1d8ec67",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39350d2c-c318-4477-92af-1c379bbb6908",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:17:27.090684Z",
      "attachments": [
        {
          "file_id": "29286450-7258-488d-8682-2634faca30ff",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f40a8161-afb2-4ee6-8ba4-18fe1de4665a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:17:27.890008Z",
      "attachments": [
        {
          "file_id": "017d82ea-8774-47c8-a89e-6d56c9a530fb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/e16406ac-a4ed-4e67-8a0d-8d5516662c69/attachments/017d82ea-8774-47c8-a89e-6d56c9a530fb` → **200**

Done: support case e16406ac-a4ed-4e67-8a0d-8d5516662c69, rider attachment 29286450-7258-488d-8682-2634faca30ff, operator attachment 017d82ea-8774-47c8-a89e-6d56c9a530fb.

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
  "session_id": "a9920be6-8f14-4d9d-83a4-cd8552b2cd4f",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzNDgsImlhdCI6MTc5MzE3NTQ0OCwianRpIjoiZmU4MmYwZGQtMmU2MS00OTRiLTkyZmItMTQyYzk5NTI4YWM3Iiwic2lkIjoiYTk5MjBiZTYtOGYxNC00ZDlkLTgzYTQtY2Q4NTUyYjJjZDRmIn0.9RxkuWUnenwnHqHIiwm-FEQRmtgjTE0u0XsP2xYIzn4",
  "access_expires_at": "2026-10-28T08:32:28.276643635Z",
  "refresh_token": "TamXeHgnR48o5oXe2mQ5KWjGfyTxAvBXaLsDpit7c1E",
  "refresh_expires_at": "2026-10-28T20:17:28.27602976Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8665"
}
```

```json
{
  "challenge_id": "71e410dc-ec29-4906-bb71-5a54ca237798",
  "expires_at": "2026-10-28T08:22:28.30440957Z",
  "resend_available_at": "2026-10-28T08:17:29.30440957Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "443817",
  "sent_at": "2026-10-28T08:17:28.306741673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71e410dc-ec29-4906-bb71-5a54ca237798",
  "code": "443817",
  "device_ref": "sandbox-8665"
}
```

```json
{
  "session_id": "4cddb71c-abe5-4d96-a28e-4961b5bf5394",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjM0OCwiaWF0IjoxNzkzMTc1NDQ4LCJqdGkiOiJmMDhjNjI4Mi02YTA4LTQ3Y2QtYTg5MC1kMTBmM2VkNDliNmUiLCJzaWQiOiI0Y2RkYjcxYy1hYmU1LTRkOTYtYTI4ZS00OTYxYjViZjUzOTQifQ.42PdCdjMQZc7GekhZhlnZVHRF2WThY3Bk-Rj9GHl8Lc",
  "access_expires_at": "2026-10-28T08:32:28.362363372Z",
  "refresh_token": "G1gnA4RLuf9JVU_yWma9kb4-GeVUir3qqK-R5sbcVqI",
  "refresh_expires_at": "2026-11-27T08:17:28.361797408Z",
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
      "actor_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T08:17:25.437081Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "eef2d91e-7690-427b-8001-c8b4a40c20e5",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T08:17:25.868688Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b834afee-1d11-4f75-ab2a-35f31acf9383",
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
  "device_ref": "sandbox-29178"
}
```

```json
{
  "challenge_id": "73230131-6a1b-4305-bfd7-013e9e6814a7",
  "expires_at": "2026-10-28T08:22:28.478715297Z",
  "resend_available_at": "2026-10-28T08:17:29.478715297Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "391524",
  "sent_at": "2026-10-28T08:17:28.480876677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73230131-6a1b-4305-bfd7-013e9e6814a7",
  "code": "391524",
  "device_ref": "sandbox-29178"
}
```

```json
{
  "session_id": "a525a9fa-ca35-42bf-aeca-c9d587e07403",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjM0OCwiaWF0IjoxNzkzMTc1NDQ4LCJqdGkiOiJlOTE5ZDM5Ny01ZGQ2LTQyNjYtOTIwMC0xODBlMmNhMjgxODQiLCJzaWQiOiJhNTI1YTlmYS1jYTM1LTQyYmYtYWVjYS1jOWQ1ODdlMDc0MDMifQ.QLX1J9DR0_TiVmPKqRz8JY0ws6YYiFgbJfO2vcsgD0I",
  "access_expires_at": "2026-10-28T08:32:28.535022979Z",
  "refresh_token": "WTlW7pgm1QYbuCbjFR-43IE6bxX9dKI-8N6hj18XAt0",
  "refresh_expires_at": "2026-11-27T08:17:28.534465349Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce5a6338-6ed0-4a38-accb-1f363e8b5445",
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
  "last_heartbeat_at": "2026-10-28T08:17:14.960303Z",
  "last_location_at": "2026-10-28T08:17:14.960303Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ce5a6338-6ed0-4a38-accb-1f363e8b5445/handover` → **200**

```json
{
  "command_id": "f5744399-eea9-4a8b-bc7a-c971459697c0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce5a6338-6ed0-4a38-accb-1f363e8b5445",
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
  "last_heartbeat_at": "2026-10-28T08:17:14.960303Z",
  "last_location_at": "2026-10-28T08:17:14.960303Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ce5a6338-6ed0-4a38-accb-1f363e8b5445/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:28Z",
    "sequence": 1793175448618
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce5a6338-6ed0-4a38-accb-1f363e8b5445",
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
  "last_heartbeat_at": "2026-10-28T08:17:28.636278Z",
  "last_location_at": "2026-10-28T08:17:28.636278Z",
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
  "command_id": "36efd1ba-79f0-46cc-b3ce-bebef16ce80b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:28Z",
    "sequence": 1793175448684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5d0fcf76-59ca-4674-afa9-1c923d5f25e2",
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
  "last_heartbeat_at": "2026-10-28T08:17:28.70151Z",
  "last_location_at": "2026-10-28T08:17:28.70151Z",
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
  "session_id": "f3fa21cb-cd30-4971-80f7-3bd6679447ae",
  "subject": {
    "type": "STAFF",
    "id": "eef2d91e-7690-427b-8001-c8b4a40c20e5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWYyZDkxZS03NjkwLTQyN2ItODAwMS1jOGI0YTQwYzIwZTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYzNDksImlhdCI6MTc5MzE3NTQ0OSwianRpIjoiMjIzYzY4NTMtMzU1Ni00YmQzLThhODUtZDdmZDUzNjZlYzAxIiwic2lkIjoiZjNmYTIxY2ItY2QzMC00OTcxLTgwZjctM2JkNjY3OTQ0N2FlIn0.8zomqgeMCPOwdZnfPQTyqcXmZFSn-CEc330ov7r5fMs",
  "access_expires_at": "2026-10-28T08:32:29.024329054Z",
  "refresh_token": "2eOqbQxKPAXVHiU3tJJtY8bqVftlueJTLr1sl9vWMM0",
  "refresh_expires_at": "2026-10-28T20:17:29.023740325Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "01d88fb2-dc54-4821-88b9-7d03be562a1a",
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
  "id": "855859dc-3b64-4d71-bbb2-ee58ed43ee41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:22:29.055949Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "8f1bc4f4-659c-4542-a617-066ea699ad85",
  "quote_id": "855859dc-3b64-4d71-bbb2-ee58ed43ee41",
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
  "id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
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
  "created_at": "2026-10-28T08:17:29.093852Z",
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
    "id": "d6f56c9c-f174-4198-8796-8c303ea04c6d",
    "order_id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
    "expires_at": "2026-10-28T08:17:44.097286Z",
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

`POST /api/driver/v1/offers/d6f56c9c-f174-4198-8796-8c303ea04c6d/accept` → **200**

```json
{
  "command_id": "5f939f01-ae94-495c-a234-c71588676e6a"
}
```

```json
{
  "id": "bed81594-5cf9-47fa-ad53-8519cde0351b",
  "order_id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dadd5146-fdf9-4e21-9efb-32d0aecccf4b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dadd5146-fdf9-4e21-9efb-32d0aecccf4b",
  "order_id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
  "assignment_id": "bed81594-5cf9-47fa-ad53-8519cde0351b",
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

`POST /api/driver/v1/work-sessions/5d0fcf76-59ca-4674-afa9-1c923d5f25e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:17:29Z",
    "sequence": 1793175449227
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5d0fcf76-59ca-4674-afa9-1c923d5f25e2",
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
  "last_heartbeat_at": "2026-10-28T08:17:29.245327Z",
  "last_location_at": "2026-10-28T08:17:29.245327Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dadd5146-fdf9-4e21-9efb-32d0aecccf4b/arrive` → **200**

```json
{
  "command_id": "480fb96d-4425-4c26-af57-ce79a3f5da50",
  "expected_version": 0
}
```

```json
{
  "id": "dadd5146-fdf9-4e21-9efb-32d0aecccf4b",
  "order_id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
  "assignment_id": "bed81594-5cf9-47fa-ad53-8519cde0351b",
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
  "arrived_at": "2026-10-28T08:17:29.280932Z",
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

`POST /api/driver/v1/trips/dadd5146-fdf9-4e21-9efb-32d0aecccf4b/start` → **200**

```json
{
  "command_id": "917d7aae-a47f-49cd-85f7-b0f9a140f620",
  "expected_version": 1
}
```

```json
{
  "id": "dadd5146-fdf9-4e21-9efb-32d0aecccf4b",
  "order_id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
  "assignment_id": "bed81594-5cf9-47fa-ad53-8519cde0351b",
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
  "arrived_at": "2026-10-28T08:17:29.280932Z",
  "started_at": "2026-10-28T08:17:29.320142Z",
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

`POST /api/driver/v1/trips/dadd5146-fdf9-4e21-9efb-32d0aecccf4b/complete` → **200**

```json
{
  "command_id": "049d2976-c17a-4f04-bbcb-47ae0eed9fda",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:17:29Z",
  "cash_received": true
}
```

```json
{
  "id": "dadd5146-fdf9-4e21-9efb-32d0aecccf4b",
  "order_id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
  "assignment_id": "bed81594-5cf9-47fa-ad53-8519cde0351b",
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
  "arrived_at": "2026-10-28T08:17:29.280932Z",
  "started_at": "2026-10-28T08:17:29.320142Z",
  "completed_at": "2026-10-28T08:17:29.361376Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/e21bbd27-4090-4a8b-a5e5-4d43f3e62b00` → **200**

```json
{
  "id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
  "short_number": 19,
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
    "id": "bed81594-5cf9-47fa-ad53-8519cde0351b",
    "order_id": "e21bbd27-4090-4a8b-a5e5-4d43f3e62b00",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dadd5146-fdf9-4e21-9efb-32d0aecccf4b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:17:29.093852Z",
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
      "balance_minor": 11857,
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
  "session_id": "ce5a6338-6ed0-4a38-accb-1f363e8b5445",
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
  "last_heartbeat_at": "2026-10-28T08:17:28.636278Z",
  "last_location_at": "2026-10-28T08:17:28.636278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ce5a6338-6ed0-4a38-accb-1f363e8b5445/close` → **200**

```json
{
  "command_id": "1cad657e-4c27-41b6-97d0-3308a3a8d631",
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
  "session_id": "5d0fcf76-59ca-4674-afa9-1c923d5f25e2",
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
  "last_heartbeat_at": "2026-10-28T08:17:29.245327Z",
  "last_location_at": "2026-10-28T08:17:29.245327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5d0fcf76-59ca-4674-afa9-1c923d5f25e2/close` → **200**

```json
{
  "command_id": "bee6ff92-a3f9-49f0-bc7c-8f496c3488d8",
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

Done: terminal order e21bbd27-4090-4a8b-a5e5-4d43f3e62b00 by Andrii (5a000000-0000-4000-8000-000000000403).
