# Sandbox transcript (2026-10-27T16:16:04Z, 8c34e4c)

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
  "correlation_id": "28fa888d-7c07-4c5e-a74d-c41de12cbc05"
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
  "session_id": "eb29262d-1fbc-4da1-9934-65c07dade92f",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2NjUsImlhdCI6MTc5MzExNzc2NSwianRpIjoiZjRhOWY1YTMtOTk3OC00YzNhLTg4ZmYtOGNiMGFiZDhhM2U2Iiwic2lkIjoiZWIyOTI2MmQtMWZiYy00ZGExLTk5MzQtNjVjMDdkYWRlOTJmIn0.NT09eYEAkQEKUfEvlsPCUkHJNydHts6oUeQhEsIV1qA",
  "access_expires_at": "2026-10-27T16:31:05.72636465Z",
  "refresh_token": "VpP45F5Xl97MiZEv76w7NLUJpFARps4ZgKJ7ujEd5DE",
  "refresh_expires_at": "2026-10-28T04:16:05.723930119Z",
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
  "session_id": "22a3f1e6-d6f8-4b3a-8fbe-a933ea701147",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2NjcsImlhdCI6MTc5MzExNzc2NywianRpIjoiYzhiMmQwNjktYmUwNC00MDFmLTkyZTQtZjc5NzJmZmZkODBiIiwic2lkIjoiMjJhM2YxZTYtZDZmOC00YjNhLThmYmUtYTkzM2VhNzAxMTQ3In0.qUzZZfEg2c7UzY6rfLfJYxKPoUvqgBwPGRP2e0g70DA",
  "access_expires_at": "2026-10-27T16:31:07.01048311Z",
  "refresh_token": "tmbGhFbLHY0SV5eFfn1V1MXsW6BLTdTjuDn4iqFXLTg",
  "refresh_expires_at": "2026-10-28T04:16:07.009398181Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "b0ff0176-5738-4694-aba1-c2d344bc052e",
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
  "id": "a1d4dfca-7ee4-4423-91e8-35e1248437e8",
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
  "created_by": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "created_at": "2026-10-27T16:16:07.078039Z",
  "updated_at": "2026-10-27T16:16:07.078039Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634439732",
  "device_ref": "sandbox-11205"
}
```

```json
{
  "challenge_id": "2798dee9-20e8-420a-ad42-7d540cd423ea",
  "expires_at": "2026-10-27T16:21:07.138144399Z",
  "resend_available_at": "2026-10-27T16:16:08.138144399Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634439732` → **200**

```json
{
  "phone": "+380634439732",
  "audience": "CLIENT",
  "code": "136067",
  "sent_at": "2026-10-27T16:16:07.145186508Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2798dee9-20e8-420a-ad42-7d540cd423ea",
  "code": "136067",
  "device_ref": "sandbox-11205"
}
```

```json
{
  "session_id": "b42f0d4e-cc15-4e9c-bc12-8e47ba55b6a9",
  "subject": {
    "type": "CLIENT",
    "id": "3cc1e8e3-0ebd-473b-a83a-316810681d53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzY2MxZThlMy0wZWJkLTQ3M2ItYTgzYS0zMTY4MTA2ODFkNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NjY3LCJpYXQiOjE3OTMxMTc3NjcsImp0aSI6ImY0MjI3OTgzLWQ5MzktNDcyOS1hZDVkLWU5NDBjNWI2YjA4NCIsInNpZCI6ImI0MmYwZDRlLWNjMTUtNGU5Yy1iYzEyLThlNDdiYTU1YjZhOSJ9.0LybJqA8Y76TKqqU5V43vBMyrwrRkFIo7ssjgbHEC_Q",
  "access_expires_at": "2026-10-27T16:31:07.229833926Z",
  "refresh_token": "qQ1pxeNgSsNSRksU6Fu86pxzIN9NdS8Oli2sX91STwI",
  "refresh_expires_at": "2026-11-26T16:16:07.228745261Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634439732` → **200**

```json
{
  "client_id": "3cc1e8e3-0ebd-473b-a83a-316810681d53"
}
```

`POST /api/admin/v1/rider-wallets/3cc1e8e3-0ebd-473b-a83a-316810681d53/top-ups` → **201**

```json
{
  "command_id": "3366ac2b-22f4-4fff-8181-adbf4421eeaa",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "3cc1e8e3-0ebd-473b-a83a-316810681d53",
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
      "id": "91e4d5c8-a8aa-4636-87c7-f1da694bffc9",
      "at": "2026-10-27T16:16:07.317605Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c91b574c-33bf-45ef-b4f2-aa76333de7ed",
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
  "id": "47c63569-5391-486b-80c9-88409ac9722a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:07.481661Z",
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
      "id": "a1d4dfca-7ee4-4423-91e8-35e1248437e8",
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
  "device_ref": "sandbox-1923"
}
```

```json
{
  "challenge_id": "9de6c112-27bf-4c1f-ac1c-569b28583298",
  "expires_at": "2026-10-27T16:21:07.56725744Z",
  "resend_available_at": "2026-10-27T16:16:08.56725744Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "323347",
  "sent_at": "2026-10-27T16:16:07.572562115Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9de6c112-27bf-4c1f-ac1c-569b28583298",
  "code": "323347",
  "device_ref": "sandbox-1923"
}
```

```json
{
  "session_id": "c00ce8db-6df0-42a8-b0a1-2e5e45bc3069",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY2NywiaWF0IjoxNzkzMTE3NzY3LCJqdGkiOiI1NzNhMTYwNS03OGQwLTQ4YjQtYTIyNS02Njg5MThlZGUwYTYiLCJzaWQiOiJjMDBjZThkYi02ZGYwLTQyYTgtYjBhMS0yZTVlNDViYzMwNjkifQ.MY2NnlSfOykSDBwBV-aUwfQD7baQ0WKHrCrNgMIEItM",
  "access_expires_at": "2026-10-27T16:31:07.639595556Z",
  "refresh_token": "5uKgVaJO3Duv8A3CBhO5NuP5cItPUwk_wsf9QT4f92c",
  "refresh_expires_at": "2026-11-26T16:16:07.638519509Z",
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
  "command_id": "7c649f7d-655d-4156-8e56-af04e38600af",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:07Z",
    "sequence": 1793117767708
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa1a5f2c-4d39-4fce-bf32-d15b3c2d453f",
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
  "last_heartbeat_at": "2026-10-27T16:16:07.753671Z",
  "last_location_at": "2026-10-27T16:16:07.753671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ac6a4f28-7377-400f-9b50-72eb8fec2b9e",
  "quote_id": "47c63569-5391-486b-80c9-88409ac9722a",
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
  "id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3cc1e8e3-0ebd-473b-a83a-316810681d53",
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
  "created_at": "2026-10-27T16:16:07.847125Z",
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
  "client_id": "3cc1e8e3-0ebd-473b-a83a-316810681d53",
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
      "id": "91e4d5c8-a8aa-4636-87c7-f1da694bffc9",
      "at": "2026-10-27T16:16:07.317605Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
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
    "id": "38ce3152-48b0-4ca6-bb1d-f2d063563571",
    "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
    "expires_at": "2026-10-27T16:16:22.862772Z",
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

`POST /api/driver/v1/offers/38ce3152-48b0-4ca6-bb1d-f2d063563571/accept` → **200**

```json
{
  "command_id": "2b39c26a-fcd3-4ef3-a61c-54a1f71be584"
}
```

```json
{
  "id": "41c49b34-fdd3-4e58-8d14-e7ec77018e3b",
  "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "798d7e18-0cec-4d06-9120-8a19032b613a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "798d7e18-0cec-4d06-9120-8a19032b613a",
  "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
  "assignment_id": "41c49b34-fdd3-4e58-8d14-e7ec77018e3b",
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

`POST /api/driver/v1/work-sessions/fa1a5f2c-4d39-4fce-bf32-d15b3c2d453f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:08Z",
    "sequence": 1793117768643
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa1a5f2c-4d39-4fce-bf32-d15b3c2d453f",
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
  "last_heartbeat_at": "2026-10-27T16:16:08.091738Z",
  "last_location_at": "2026-10-27T16:16:08.091738Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/798d7e18-0cec-4d06-9120-8a19032b613a/arrive` → **200**

```json
{
  "command_id": "19263d50-38e7-4d38-8eaa-c91ff7ad3e3c",
  "expected_version": 0
}
```

```json
{
  "id": "798d7e18-0cec-4d06-9120-8a19032b613a",
  "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
  "assignment_id": "41c49b34-fdd3-4e58-8d14-e7ec77018e3b",
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
  "arrived_at": "2026-10-27T16:16:08.145689Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/798d7e18-0cec-4d06-9120-8a19032b613a/start` → **200**

```json
{
  "command_id": "c884cb99-76ef-4754-8cbc-d51ee91b7903",
  "expected_version": 1
}
```

```json
{
  "id": "798d7e18-0cec-4d06-9120-8a19032b613a",
  "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
  "assignment_id": "41c49b34-fdd3-4e58-8d14-e7ec77018e3b",
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
  "arrived_at": "2026-10-27T16:16:08.145689Z",
  "started_at": "2026-10-27T16:16:08.199474Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/798d7e18-0cec-4d06-9120-8a19032b613a/complete` → **200**

```json
{
  "command_id": "e1b9b6f4-ee58-4725-b1a0-b8b2e1172c09",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:16:08Z",
  "cash_received": true
}
```

```json
{
  "id": "798d7e18-0cec-4d06-9120-8a19032b613a",
  "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
  "assignment_id": "41c49b34-fdd3-4e58-8d14-e7ec77018e3b",
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
  "arrived_at": "2026-10-27T16:16:08.145689Z",
  "started_at": "2026-10-27T16:16:08.199474Z",
  "completed_at": "2026-10-27T16:16:08.266062Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3cc1e8e3-0ebd-473b-a83a-316810681d53",
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
      "id": "08791348-f6cb-42c8-a93a-ce2a282ad207",
      "at": "2026-10-27T16:16:08.55815Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9"
    },
    {
      "id": "91e4d5c8-a8aa-4636-87c7-f1da694bffc9",
      "at": "2026-10-27T16:16:07.317605Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/a1d4dfca-7ee4-4423-91e8-35e1248437e8/archive` → **200**

```json
{
  "command_id": "f31e9f74-ac66-4e38-93fb-6adf401a89b6",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "a1d4dfca-7ee4-4423-91e8-35e1248437e8",
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
  "created_by": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "created_at": "2026-10-27T16:16:07.078039Z",
  "updated_at": "2026-10-27T16:16:11.364314Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa1a5f2c-4d39-4fce-bf32-d15b3c2d453f",
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
  "last_heartbeat_at": "2026-10-27T16:16:08.091738Z",
  "last_location_at": "2026-10-27T16:16:08.091738Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa1a5f2c-4d39-4fce-bf32-d15b3c2d453f/close` → **200**

```json
{
  "command_id": "d323fb47-680e-4dfb-98f6-90ebf1e51331",
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

Done: order 964f6e4f-b7ed-4102-a142-4c013142c7d9.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635808706",
  "device_ref": "sandbox-7733"
}
```

```json
{
  "challenge_id": "5c95dab0-6898-4fab-882c-124b3bd41b98",
  "expires_at": "2026-10-27T16:21:11.482143304Z",
  "resend_available_at": "2026-10-27T16:16:12.482143304Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635808706` → **200**

```json
{
  "phone": "+380635808706",
  "audience": "CLIENT",
  "code": "810669",
  "sent_at": "2026-10-27T16:16:11.485527165Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c95dab0-6898-4fab-882c-124b3bd41b98",
  "code": "810669",
  "device_ref": "sandbox-7733"
}
```

```json
{
  "session_id": "cfab6494-4424-4d3e-9564-213c2ad3916d",
  "subject": {
    "type": "CLIENT",
    "id": "e917bf79-94f8-49aa-9489-9c3f03e46746"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTE3YmY3OS05NGY4LTQ5YWEtOTQ4OS05YzNmMDNlNDY3NDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NjcxLCJpYXQiOjE3OTMxMTc3NzEsImp0aSI6IjA3NjkwMzQzLTI0YWMtNDM0MC1hZDA4LTE4YWU0ZGUxOGNjYiIsInNpZCI6ImNmYWI2NDk0LTQ0MjQtNGQzZS05NTY0LTIxM2MyYWQzOTE2ZCJ9.O8C7vSCnnBIc8Koj7xsRsjesT_l_EM0SEweHnhm7oEM",
  "access_expires_at": "2026-10-27T16:31:11.542904812Z",
  "refresh_token": "E0WRAD8A1Q96vrVB2LeXcUGC_gZ7P4S6eU6CBRWvvzg",
  "refresh_expires_at": "2026-11-26T16:16:11.542098128Z",
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
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport"
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
  "device_ref": "sandbox-14914"
}
```

```json
{
  "challenge_id": "1e86c9b4-c35f-4571-85c0-cd7e961389b6",
  "expires_at": "2026-10-27T16:21:11.597565936Z",
  "resend_available_at": "2026-10-27T16:16:12.597565936Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "831637",
  "sent_at": "2026-10-27T16:16:11.600835578Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e86c9b4-c35f-4571-85c0-cd7e961389b6",
  "code": "831637",
  "device_ref": "sandbox-14914"
}
```

```json
{
  "session_id": "fdd01299-0c2f-4bc3-a723-0386de370454",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY3MSwiaWF0IjoxNzkzMTE3NzcxLCJqdGkiOiI5OGE4M2MzNS01NTE1LTQyOWQtYTQzYi1mYjdhMTZlYTY0NmYiLCJzaWQiOiJmZGQwMTI5OS0wYzJmLTRiYzMtYTcyMy0wMzg2ZGUzNzA0NTQifQ.g9DGqeIgUOg6sm7LUO4tIAKqYDxjQoZpRhbx-A564xI",
  "access_expires_at": "2026-10-27T16:31:11.661243929Z",
  "refresh_token": "6rjgRXgWGyA1z5Yvlv6wKkj8eUR4Zu8qsWbLWM50lPc",
  "refresh_expires_at": "2026-11-26T16:16:11.66048012Z",
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
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać"
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
  "session_id": "99fd696b-1b11-4101-8d88-64f0d8ee7fbd",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2NzIsImlhdCI6MTc5MzExNzc3MiwianRpIjoiYmM2OGE2OWUtZjg5OS00YTE0LTllMjgtNWQ5NTQ4OGI5YTcxIiwic2lkIjoiOTlmZDY5NmItMWIxMS00MTAxLThkODgtNjRmMGQ4ZWU3ZmJkIn0.YjRBjNFJLQNDjICi2B5y6A5Ybcf_MIw2Ivv0tAPylaU",
  "access_expires_at": "2026-10-27T16:31:12.00781771Z",
  "refresh_token": "bm5LpTKGZwbXX1Qn_Lugyz4U3aYKhNU-LVQQpWj0j2Q",
  "refresh_expires_at": "2026-10-28T04:16:12.007087489Z",
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
  "session_id": "79bf7799-71aa-4274-9d88-8efd572e8471",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2NzIsImlhdCI6MTc5MzExNzc3MiwianRpIjoiMzkyNzZiZDItZGU5Zi00M2RmLWExNGUtODEwNTAwYWZjNjM1Iiwic2lkIjoiNzliZjc3OTktNzFhYS00Mjc0LTlkODgtOGVmZDU3MmU4NDcxIn0.BxS5MkTZT_G_RNjMVUi1vO9dQYW4mfyBBI8EMnTapoA",
  "access_expires_at": "2026-10-27T16:31:12.328890335Z",
  "refresh_token": "Mt4u8T7M2pm7IKviJ8ZmsMLQMs-slbXO5BX3vmONLNg",
  "refresh_expires_at": "2026-10-28T04:16:12.328119414Z",
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
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek"
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
  "command_id": "c82e0cc4-b21c-4f18-b000-042a6d8f09cd",
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
  "id": "893a2f02-ebda-4ce8-a617-044123ac4ca4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:21:12.393532Z",
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
  "command_id": "42cdcead-f788-4461-bcdc-40cbc1a680fd",
  "quote_id": "893a2f02-ebda-4ce8-a617-044123ac4ca4",
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
  "id": "ede2f709-1aa3-49e0-a96c-0802c26adf69",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e917bf79-94f8-49aa-9489-9c3f03e46746",
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
  "created_at": "2026-10-27T16:16:12.433819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ede2f709-1aa3-49e0-a96c-0802c26adf69` → **200**

```json
{
  "id": "ede2f709-1aa3-49e0-a96c-0802c26adf69",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e917bf79-94f8-49aa-9489-9c3f03e46746",
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
  "created_at": "2026-10-27T16:16:12.433819Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ede2f709-1aa3-49e0-a96c-0802c26adf69/cancel` → **200**

```json
{
  "command_id": "6bdefe81-6daf-44a0-bf1d-6ec14326c6ca",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ede2f709-1aa3-49e0-a96c-0802c26adf69",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e917bf79-94f8-49aa-9489-9c3f03e46746",
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
  "created_at": "2026-10-27T16:16:12.433819Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie"
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
  "command_id": "e50f9a95-f858-4e0c-a465-922871f2caac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:12Z",
    "sequence": 1793117772570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
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
  "last_heartbeat_at": "2026-10-27T16:16:12.589314Z",
  "last_location_at": "2026-10-27T16:16:12.589314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23894"
}
```

```json
{
  "challenge_id": "cebb1369-e75a-43dc-b649-7f6e8b283b8f",
  "expires_at": "2026-10-27T16:21:12.619715168Z",
  "resend_available_at": "2026-10-27T16:16:13.619715168Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "262615",
  "sent_at": "2026-10-27T16:16:12.623546907Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cebb1369-e75a-43dc-b649-7f6e8b283b8f",
  "code": "262615",
  "device_ref": "sandbox-23894"
}
```

```json
{
  "session_id": "2794aa85-4e48-482b-9866-06c6324fc7ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY3MiwiaWF0IjoxNzkzMTE3NzcyLCJqdGkiOiIyODg4ZjhkOS0yMDUxLTQ2NjItYTJkNy0yOGM0MDU5YjVmY2MiLCJzaWQiOiIyNzk0YWE4NS00ZTQ4LTQ4MmItOTg2Ni0wNmM2MzI0ZmM3ZmYifQ.6Zd8tXcaL59atEdWD8fw43M0YHJXTBY3KSUuIGiohS4",
  "access_expires_at": "2026-10-27T16:31:12.685864538Z",
  "refresh_token": "ECTTGucVWqD_rNvi7D6G6dZZ8aDRo0CZ6OwdIS6VAec",
  "refresh_expires_at": "2026-11-26T16:16:12.68511375Z",
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
  "command_id": "05f0cd35-cedc-4607-9f0b-4b68e9cf41c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:12Z",
    "sequence": 1793117772737
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af8c3255-af61-40d8-9e4d-8f2f6fc50b9d",
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
  "last_heartbeat_at": "2026-10-27T16:16:12.756881Z",
  "last_location_at": "2026-10-27T16:16:12.756881Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3a2816c0-9844-4a18-a35f-7154deeb112f",
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
  "id": "e554b103-54cc-49a7-b91b-46df721b15ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:21:12.797038Z",
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
  "command_id": "33afe4e5-082a-4bc9-ba76-bdae6e698d8d",
  "quote_id": "e554b103-54cc-49a7-b91b-46df721b15ea",
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
  "id": "6d0db419-fdd0-4711-baa7-472348773109",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e917bf79-94f8-49aa-9489-9c3f03e46746",
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
  "created_at": "2026-10-27T16:16:12.836701Z",
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
    "id": "63f7a341-b331-4f84-a283-1865140263c1",
    "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
    "expires_at": "2026-10-27T16:16:27.841751Z",
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

`POST /api/driver/v1/offers/63f7a341-b331-4f84-a283-1865140263c1/accept` → **200**

```json
{
  "command_id": "4e8b3c2d-96db-480a-9514-8a6d3d017227"
}
```

```json
{
  "id": "eb76f29e-b943-443c-8058-047c5b797ae4",
  "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "702527a2-7931-420a-bc41-630df5b53884",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "702527a2-7931-420a-bc41-630df5b53884",
  "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
  "assignment_id": "eb76f29e-b943-443c-8058-047c5b797ae4",
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

`POST /api/driver/v1/trips/702527a2-7931-420a-bc41-630df5b53884/cancel` → **200**

```json
{
  "command_id": "9c9db9e4-0d0b-4259-bde3-ad8147e34089",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "702527a2-7931-420a-bc41-630df5b53884",
  "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
  "assignment_id": "eb76f29e-b943-443c-8058-047c5b797ae4",
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

`GET /api/rider/v1/orders/6d0db419-fdd0-4711-baa7-472348773109` → **200**

```json
{
  "id": "6d0db419-fdd0-4711-baa7-472348773109",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e917bf79-94f8-49aa-9489-9c3f03e46746",
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
    "id": "eb76f29e-b943-443c-8058-047c5b797ae4",
    "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "702527a2-7931-420a-bc41-630df5b53884",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T16:16:12.836701Z",
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
    "id": "da7b9554-c8ac-44b2-80d3-0c290928f657",
    "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
    "expires_at": "2026-10-27T16:16:27.982852Z",
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

`POST /api/driver/v1/offers/da7b9554-c8ac-44b2-80d3-0c290928f657/accept` → **200**

```json
{
  "command_id": "b97e331a-db69-415c-ad18-7f6ff817803c"
}
```

```json
{
  "id": "2335c086-1bda-4583-9246-94ac69e2e2ec",
  "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37cbcbcc-391a-49fd-93e6-3fa4beafd71a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37cbcbcc-391a-49fd-93e6-3fa4beafd71a",
  "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
  "assignment_id": "2335c086-1bda-4583-9246-94ac69e2e2ec",
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

`POST /api/driver/v1/trips/37cbcbcc-391a-49fd-93e6-3fa4beafd71a/cancel` → **200**

```json
{
  "command_id": "8cda4b07-7fff-4147-98ec-a53e933e418c",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "37cbcbcc-391a-49fd-93e6-3fa4beafd71a",
  "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
  "assignment_id": "2335c086-1bda-4583-9246-94ac69e2e2ec",
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
    "id": "6d0db419-fdd0-4711-baa7-472348773109",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:16:12.836701Z",
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
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "ede2f709-1aa3-49e0-a96c-0802c26adf69",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:16:12.433819Z",
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
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/6d0db419-fdd0-4711-baa7-472348773109/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:16:12.837547Z",
      "actor": {
        "type": "CLIENT",
        "id": "e917bf79-94f8-49aa-9489-9c3f03e46746",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
        "quote_id": "e554b103-54cc-49a7-b91b-46df721b15ea",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:16:12.84035Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
        "attempt_id": "e8202318-e10c-4994-901b-3cff3a56e6fe",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:16:12.847137Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "63f7a341-b331-4f84-a283-1865140263c1",
        "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:16:12.907531Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "63f7a341-b331-4f84-a283-1865140263c1",
        "order_id": "6d0db419-fdd0-4711-baa7-472348773109",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "eb76f29e-b943-443c-8058-047c5b797ae4"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders ede2f709-1aa3-49e0-a96c-0802c26adf69, 6d0db419-fdd0-4711-baa7-472348773109.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736451532",
  "device_ref": "sandbox-12643"
}
```

```json
{
  "challenge_id": "2af75925-9f5b-4f67-8618-ff1ffd2a2112",
  "expires_at": "2026-10-27T16:21:13.242626983Z",
  "resend_available_at": "2026-10-27T16:16:14.242626983Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736451532` → **200**

```json
{
  "phone": "+380736451532",
  "audience": "CLIENT",
  "code": "521953",
  "sent_at": "2026-10-27T16:16:13.245169645Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2af75925-9f5b-4f67-8618-ff1ffd2a2112",
  "code": "521953",
  "device_ref": "sandbox-12643"
}
```

```json
{
  "session_id": "760c2ada-8a0b-425b-93c9-853b700055be",
  "subject": {
    "type": "CLIENT",
    "id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTkxYzJmZi0wODQ0LTQ0N2UtOWQ1ZS02ZmJmOWNlMTk2OTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NjczLCJpYXQiOjE3OTMxMTc3NzMsImp0aSI6ImZiY2VmODJmLWQxNTgtNDYzZS04YzAzLTg0YmI1MjU2ZGFjZSIsInNpZCI6Ijc2MGMyYWRhLThhMGItNDI1Yi05M2M5LTg1M2I3MDAwNTViZSJ9.dI-TRL3YQfp6q5hBAmGHbyFlafDkMZJGF-_QCrNuMhA",
  "access_expires_at": "2026-10-27T16:31:13.300519975Z",
  "refresh_token": "GNO5kosF2Y8jix_TDxaLu_UIY8bmFFiZxo2HsdOe1Jw",
  "refresh_expires_at": "2026-11-26T16:16:13.299760075Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "32b59ae4-783a-4d75-93cf-06a9e4fe604b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9988bd3f-8557-40ed-816a-4c74bc23d401",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9988bd3f-8557-40ed-816a-4c74bc23d401",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "38156bf58ed96c6fa643df539f8695e6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9988bd3f-8557-40ed-816a-4c74bc23d401",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736451532"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9988bd3f-8557-40ed-816a-4c74bc23d401",
  "expires_at": "2026-10-27T16:46:13.33564Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9988bd3f-8557-40ed-816a-4c74bc23d401` → **200**

```json
{
  "id": "9988bd3f-8557-40ed-816a-4c74bc23d401",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T16:46:13.33564Z",
  "card": {
    "id": "80bfcba3-529e-432d-8323-ec3112b68132",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3497",
    "card_type": "Visa",
    "created_at": "2026-10-27T16:16:13.38224Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "80bfcba3-529e-432d-8323-ec3112b68132",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3497",
      "card_type": "Visa",
      "created_at": "2026-10-27T16:16:13.38224Z"
    }
  ]
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19333"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "5dff71e0-3d93-4cba-8eb8-d81c8b730e4c",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19333"
}
```

```json
{
  "challenge_id": "9b060e9d-3138-49b2-87a3-fc43b015be93",
  "expires_at": "2026-10-27T16:21:14.491642615Z",
  "resend_available_at": "2026-10-27T16:16:15.491642615Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "983137",
  "sent_at": "2026-10-27T16:16:14.494195097Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b060e9d-3138-49b2-87a3-fc43b015be93",
  "code": "983137",
  "device_ref": "sandbox-19333"
}
```

```json
{
  "session_id": "fef850a7-17a3-4f70-bb0e-e9761be7637e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY3NCwiaWF0IjoxNzkzMTE3Nzc0LCJqdGkiOiJiNWY1ZWJmNy05NTI5LTRkZTQtYjRhNC0zYmJiOGRhM2VhYTQiLCJzaWQiOiJmZWY4NTBhNy0xN2EzLTRmNzAtYmIwZS1lOTc2MWJlNzYzN2UifQ.WTCsiqE0UeY2X0zX_6xCEz5LYmH3iD0DnMkyuefJx6Q",
  "access_expires_at": "2026-10-27T16:31:14.550120804Z",
  "refresh_token": "BOeJb3qxI628kv_2GjFEUokl-FKVQWGOZQ-YiQRYpYU",
  "refresh_expires_at": "2026-11-26T16:16:14.549534307Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af8c3255-af61-40d8-9e4d-8f2f6fc50b9d",
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
  "last_heartbeat_at": "2026-10-27T16:16:12.756881Z",
  "last_location_at": "2026-10-27T16:16:12.756881Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af8c3255-af61-40d8-9e4d-8f2f6fc50b9d/handover` → **200**

```json
{
  "command_id": "539a43e3-87b7-4e92-9d78-4caef8205d30",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af8c3255-af61-40d8-9e4d-8f2f6fc50b9d",
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
  "last_heartbeat_at": "2026-10-27T16:16:12.756881Z",
  "last_location_at": "2026-10-27T16:16:12.756881Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af8c3255-af61-40d8-9e4d-8f2f6fc50b9d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:14Z",
    "sequence": 1793117774646
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af8c3255-af61-40d8-9e4d-8f2f6fc50b9d",
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
  "last_heartbeat_at": "2026-10-27T16:16:14.665828Z",
  "last_location_at": "2026-10-27T16:16:14.665828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f79cb39-6fa4-4d45-aa13-b9de14b4f4cf",
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
  "id": "7852a20c-c0db-4844-8f81-34b675ff401f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T16:21:14.704733Z",
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
  "command_id": "201df1a7-7494-4d51-927c-295f4c743bab",
  "quote_id": "7852a20c-c0db-4844-8f81-34b675ff401f",
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
  "id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698",
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
  "created_at": "2026-10-27T16:16:14.746232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4` → **200**

```json
{
  "id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698",
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
  "created_at": "2026-10-27T16:16:14.746232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4` → **200**

```json
{
  "id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698",
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
  "created_at": "2026-10-27T16:16:14.746232Z",
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
    "id": "aa34fa9e-b6a3-43f3-b776-8e197103bd9e",
    "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
    "expires_at": "2026-10-27T16:16:30.691779Z",
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

`POST /api/driver/v1/offers/aa34fa9e-b6a3-43f3-b776-8e197103bd9e/accept` → **200**

```json
{
  "command_id": "e3f1a904-f9a6-494b-b2c2-2b6874022355"
}
```

```json
{
  "id": "f3059a5b-5916-4151-830d-a699d873489e",
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "assignment_id": "f3059a5b-5916-4151-830d-a699d873489e",
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

`POST /api/driver/v1/work-sessions/af8c3255-af61-40d8-9e4d-8f2f6fc50b9d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:15Z",
    "sequence": 1793117775917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af8c3255-af61-40d8-9e4d-8f2f6fc50b9d",
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
  "last_heartbeat_at": "2026-10-27T16:16:15.93697Z",
  "last_location_at": "2026-10-27T16:16:15.93697Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6/arrive` → **200**

```json
{
  "command_id": "fa66419f-1112-4f45-8fa9-993439295092",
  "expected_version": 0
}
```

```json
{
  "id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "assignment_id": "f3059a5b-5916-4151-830d-a699d873489e",
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
  "arrived_at": "2026-10-27T16:16:15.974069Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6/start` → **200**

```json
{
  "command_id": "dcd87328-6080-47b2-ba13-e86fe7826e2e",
  "expected_version": 1
}
```

```json
{
  "id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "assignment_id": "f3059a5b-5916-4151-830d-a699d873489e",
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
  "arrived_at": "2026-10-27T16:16:15.974069Z",
  "started_at": "2026-10-27T16:16:16.014238Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6/complete` → **200**

```json
{
  "command_id": "ef69e25f-4403-4487-a9be-f1109471c051",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:16:16Z"
}
```

```json
{
  "id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "assignment_id": "f3059a5b-5916-4151-830d-a699d873489e",
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
  "arrived_at": "2026-10-27T16:16:15.974069Z",
  "started_at": "2026-10-27T16:16:16.014238Z",
  "completed_at": "2026-10-27T16:16:16.061254Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4` → **200**

```json
{
  "id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698",
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
    "id": "f3059a5b-5916-4151-830d-a699d873489e",
    "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:16:14.746232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4` → **200**

```json
{
  "id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698",
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
    "id": "f3059a5b-5916-4151-830d-a699d873489e",
    "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:16:14.746232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4` → **200**

```json
{
  "id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698",
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
    "id": "f3059a5b-5916-4151-830d-a699d873489e",
    "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:16:14.746232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4` → **200**

```json
{
  "id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9591c2ff-0844-447e-9d5e-6fbf9ce19698",
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
    "id": "f3059a5b-5916-4151-830d-a699d873489e",
    "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0ccbc796-f79c-4b7f-b0ca-23e318e2d8a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:16:14.746232Z",
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
      "id": "90aae011-b164-42e8-9827-e6c6ac4bee16",
      "at": "2026-10-27T16:16:16.713673Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4/tip` → **200**

```json
{
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
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
  "available_until": "2026-10-28T16:16:16.061254Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4/tip` → **201**

```json
{
  "command_id": "126f75ce-d6d4-4b59-ac47-f36791b1c7dc",
  "amount_minor": 2500
}
```

```json
{
  "id": "986783a4-facd-41ab-af33-7e5a03d3165f",
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T16:16:19.305052Z"
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4/tip` → **200**

```json
{
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
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
  "available_until": "2026-10-28T16:16:16.061254Z",
  "open": false,
  "tip": {
    "id": "986783a4-facd-41ab-af33-7e5a03d3165f",
    "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T16:16:19.305052Z"
  }
}
```

`GET /api/rider/v1/orders/ff4cbd6f-507f-477a-b841-cb87634b44d4/tip` → **200**

```json
{
  "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
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
  "available_until": "2026-10-28T16:16:16.061254Z",
  "open": false,
  "tip": {
    "id": "986783a4-facd-41ab-af33-7e5a03d3165f",
    "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T16:16:19.305052Z"
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
      "id": "90aae011-b164-42e8-9827-e6c6ac4bee16",
      "at": "2026-10-27T16:16:16.713673Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
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
      "id": "b671ac32-e541-43d3-8c2f-7da2f6b4475a",
      "at": "2026-10-27T16:16:20.782052Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
      "counterpart_id": null
    },
    {
      "id": "90aae011-b164-42e8-9827-e6c6ac4bee16",
      "at": "2026-10-27T16:16:16.713673Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ff4cbd6f-507f-477a-b841-cb87634b44d4",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af8c3255-af61-40d8-9e4d-8f2f6fc50b9d",
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
  "last_heartbeat_at": "2026-10-27T16:16:15.93697Z",
  "last_location_at": "2026-10-27T16:16:15.93697Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af8c3255-af61-40d8-9e4d-8f2f6fc50b9d/close` → **200**

```json
{
  "command_id": "1553b610-0611-4a33-ac5f-2bf82073c69a",
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

Done: card order ff4cbd6f-507f-477a-b841-cb87634b44d4.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733158980",
  "device_ref": "sandbox-30644"
}
```

```json
{
  "challenge_id": "6e9f3d5e-f824-4d75-bd81-07a2a176ebd1",
  "expires_at": "2026-10-27T16:21:21.5193136Z",
  "resend_available_at": "2026-10-27T16:16:22.5193136Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733158980` → **200**

```json
{
  "phone": "+380733158980",
  "audience": "CLIENT",
  "code": "703401",
  "sent_at": "2026-10-27T16:16:21.522221877Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e9f3d5e-f824-4d75-bd81-07a2a176ebd1",
  "code": "703401",
  "device_ref": "sandbox-30644"
}
```

```json
{
  "session_id": "f29d70f8-0e37-448a-8e5d-9b8f18d6d3d6",
  "subject": {
    "type": "CLIENT",
    "id": "a36740c6-84bd-411c-a68d-6d7d16e2805f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzY3NDBjNi04NGJkLTQxMWMtYTY4ZC02ZDdkMTZlMjgwNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NjgxLCJpYXQiOjE3OTMxMTc3ODEsImp0aSI6IjlkZmNiNTExLTMwZTgtNGMyNS1hNzc3LWUwZWVhN2ZjOWRmZCIsInNpZCI6ImYyOWQ3MGY4LTBlMzctNDQ4YS04ZTVkLTliOGYxOGQ2ZDNkNiJ9.FOtPBsGiVBnfIMHsx2YWKTJHDXLTZy7BCs2XnxR_lCE",
  "access_expires_at": "2026-10-27T16:31:21.577870024Z",
  "refresh_token": "aXBK3VBYjcKolREcKNgbk_KGRaF_n5aDFa7dkH0dMo4",
  "refresh_expires_at": "2026-11-26T16:16:21.57722026Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "d9c88ff7-ea3e-47f4-b13d-658055157c56",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "f13f69ce-f41c-410e-b4ec-38f2f11cc1a2",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f13f69ce-f41c-410e-b4ec-38f2f11cc1a2",
    "orderDate": "1793117781",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "29bdeab029b289454b64e0fbd09f5a0c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f13f69ce-f41c-410e-b4ec-38f2f11cc1a2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733158980"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f13f69ce-f41c-410e-b4ec-38f2f11cc1a2",
  "created_at": "2026-10-27T16:16:21.612842Z",
  "expires_at": "2026-10-27T16:46:21.612842Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/f13f69ce-f41c-410e-b4ec-38f2f11cc1a2` → **200**

```json
{
  "id": "f13f69ce-f41c-410e-b4ec-38f2f11cc1a2",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:16:21.612842Z",
  "expires_at": "2026-10-27T16:46:21.612842Z",
  "completed_at": "2026-10-27T16:16:21.650092Z",
  "masked_pan": "41****9583",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a36740c6-84bd-411c-a68d-6d7d16e2805f",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a36740c6-84bd-411c-a68d-6d7d16e2805f",
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
      "id": "6f3cdf81-c7d9-4a1c-a1da-6ce7dc53782f",
      "at": "2026-10-27T16:16:21.791746Z",
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
  "client_id": "a36740c6-84bd-411c-a68d-6d7d16e2805f",
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
      "id": "6f3cdf81-c7d9-4a1c-a1da-6ce7dc53782f",
      "at": "2026-10-27T16:16:21.791746Z",
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
  "device_ref": "sandbox-23908"
}
```

```json
{
  "challenge_id": "a6717fd8-9091-4ef3-b7a3-828cf8302751",
  "expires_at": "2026-10-27T16:21:22.782779784Z",
  "resend_available_at": "2026-10-27T16:16:23.782779784Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "223447",
  "sent_at": "2026-10-27T16:16:22.78527422Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6717fd8-9091-4ef3-b7a3-828cf8302751",
  "code": "223447",
  "device_ref": "sandbox-23908"
}
```

```json
{
  "session_id": "ca6316f5-b175-4315-aef9-824ccc859017",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY4MiwiaWF0IjoxNzkzMTE3NzgyLCJqdGkiOiI5N2IyNTFiMi0xNDZkLTRjNzUtOTgxMy1kYjgzNTMxMjlkNDUiLCJzaWQiOiJjYTYzMTZmNS1iMTc1LTQzMTUtYWVmOS04MjRjY2M4NTkwMTcifQ.eNygTmXFIDLinXIt8iNWJ4Nr3tPS4MfK5PLttMx0icU",
  "access_expires_at": "2026-10-27T16:31:22.840829725Z",
  "refresh_token": "LkbzZQp2rZzse8ZKQEJNts9xyXh1rdmPAKrWJ00W5iM",
  "refresh_expires_at": "2026-11-26T16:16:22.84008075Z",
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
  "command_id": "db2812a2-fdee-47eb-a9a6-728762607e00",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "cda93112-0c38-43d9-b9a5-7ef90dbdf4fa",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-cda93112-0c38-43d9-b9a5-7ef90dbdf4fa",
    "orderDate": "1793117782",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "f96ce85612761cbbf8cc3be26b350ada",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=cda93112-0c38-43d9-b9a5-7ef90dbdf4fa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=cda93112-0c38-43d9-b9a5-7ef90dbdf4fa",
  "created_at": "2026-10-27T16:16:22.898415Z",
  "expires_at": "2026-10-27T16:46:22.898415Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/cda93112-0c38-43d9-b9a5-7ef90dbdf4fa` → **200**

```json
{
  "id": "cda93112-0c38-43d9-b9a5-7ef90dbdf4fa",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:16:22.898415Z",
  "expires_at": "2026-10-27T16:46:22.898415Z",
  "completed_at": "2026-10-27T16:16:22.92943Z",
  "masked_pan": "41****0278",
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
      "id": "9ca4e163-e9f5-44ee-99b3-44e284e6a361",
      "at": "2026-10-27T16:16:23.802407Z",
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
  "command_id": "356f66ae-9a73-48ab-a275-b37c14a525c2",
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
  "correlation_id": "7ee5a21d-2643-4c89-993e-b2adfb6101c1"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679315767",
  "device_ref": "sandbox-8432"
}
```

```json
{
  "challenge_id": "5bd910fd-fd1f-446c-b53e-f5ede74aa978",
  "expires_at": "2026-10-27T16:21:24.069985154Z",
  "resend_available_at": "2026-10-27T16:16:25.069985154Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679315767` → **200**

```json
{
  "phone": "+380679315767",
  "audience": "CLIENT",
  "code": "772070",
  "sent_at": "2026-10-27T16:16:24.072747724Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5bd910fd-fd1f-446c-b53e-f5ede74aa978",
  "code": "772070",
  "device_ref": "sandbox-8432"
}
```

```json
{
  "session_id": "3e7fcd10-117c-496d-bd63-05395ebf3db1",
  "subject": {
    "type": "CLIENT",
    "id": "3bd3c13d-9155-493f-8ff8-cabee5d8fa9a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYmQzYzEzZC05MTU1LTQ5M2YtOGZmOC1jYWJlZTVkOGZhOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4Njg0LCJpYXQiOjE3OTMxMTc3ODQsImp0aSI6IjQzNTBmOGZmLWQ0OTktNGViMi04ZDZiLWI4YzQ0ZWI5MzVjOCIsInNpZCI6IjNlN2ZjZDEwLTExN2MtNDk2ZC1iZDYzLTA1Mzk1ZWJmM2RiMSJ9.vPQUPIn_y4fclz5xHqIRaTSRwEt04R_Z62HUfcaj6tI",
  "access_expires_at": "2026-10-27T16:31:24.127293018Z",
  "refresh_token": "KgT47EKic_QCvzLs4_SylWQjGu3uVlBzNZnJvFxYAwc",
  "refresh_expires_at": "2026-11-26T16:16:24.126767407Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3bd3c13d-9155-493f-8ff8-cabee5d8fa9a",
  "session_id": "3e7fcd10-117c-496d-bd63-05395ebf3db1",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96bf2dca-8a13-4d66-9687-4538740fb344",
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
  "id": "d0f69b33-9874-404e-8889-7ab2e9111200",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:24.186587Z",
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
  "challenge_id": "27128a32-d833-40b7-ab96-74ee0283abdc",
  "expires_at": "2026-10-27T16:21:26.225634694Z",
  "resend_available_at": "2026-10-27T16:16:27.225634694Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679315767` → **200**

```json
{
  "phone": "+380679315767",
  "audience": "CLIENT",
  "code": "529496",
  "sent_at": "2026-10-27T16:16:26.228270625Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "358cabde-243b-4592-be94-4886aa16fda1",
  "challenge_id": "27128a32-d833-40b7-ab96-74ee0283abdc",
  "otp_code": "529496"
}
```

```json
{
  "client_id": "3bd3c13d-9155-493f-8ff8-cabee5d8fa9a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T16:16:26.295029174Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c9eb66a6-37c5-44f8-9fda-0051ba03db1f",
  "quote_id": "d0f69b33-9874-404e-8889-7ab2e9111200",
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
  "correlation_id": "a0faa2d8-d361-4be4-a3e7-a162047a1614"
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
  "session_id": "95fb063e-4f75-483b-8512-0e918ccc3d55",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2ODYsImlhdCI6MTc5MzExNzc4NiwianRpIjoiY2QxNGYwYWUtMzNlNC00Nzc1LTkzMTgtY2NhOGFhNTk1MGNmIiwic2lkIjoiOTVmYjA2M2UtNGY3NS00ODNiLTg1MTItMGU5MThjY2MzZDU1In0.9_U1a93bPY1Q8UuvQC-S3MsgYSb5fEvwwcY5ox-nRbo",
  "access_expires_at": "2026-10-27T16:31:26.664627367Z",
  "refresh_token": "xxXQXOLIMmiv32wgFymMrS4GvPGFphAGdTiOYsWIBCM",
  "refresh_expires_at": "2026-10-28T04:16:26.664068072Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "3bd3c13d-9155-493f-8ff8-cabee5d8fa9a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T16:16:26.295029Z",
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

`POST /api/admin/v1/client-deletions/3bd3c13d-9155-493f-8ff8-cabee5d8fa9a/complete` → **200**

```json
{
  "command_id": "7ee654b5-e40a-4571-842f-d23223620c65",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "3bd3c13d-9155-493f-8ff8-cabee5d8fa9a",
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
  "correlation_id": "8adecfab-1324-4156-b3e2-7061ea2030a5"
}
```

Done: client 3bd3c13d-9155-493f-8ff8-cabee5d8fa9a anonymized.

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
  "device_ref": "sandbox-7039"
}
```

```json
{
  "challenge_id": "f20e9ae7-616e-4547-ad12-eeada02a07be",
  "expires_at": "2026-10-27T16:21:26.845887444Z",
  "resend_available_at": "2026-10-27T16:16:27.845887444Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "136043",
  "sent_at": "2026-10-27T16:16:26.848127363Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f20e9ae7-616e-4547-ad12-eeada02a07be",
  "code": "136043",
  "device_ref": "sandbox-7039"
}
```

```json
{
  "session_id": "e230f0b7-e1c5-403f-bc02-b37c8eac7a37",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY4NiwiaWF0IjoxNzkzMTE3Nzg2LCJqdGkiOiIyNjdkMjk1Yy00OWU4LTRiOTQtOGE0OS01MjgyMGJmNjEzZDAiLCJzaWQiOiJlMjMwZjBiNy1lMWM1LTQwM2YtYmMwMi1iMzdjOGVhYzdhMzcifQ.zv2WdRQO9IEyxwaC0niRYSKqxdVsd-5dv0bu_wR1Lqw",
  "access_expires_at": "2026-10-27T16:31:26.901936026Z",
  "refresh_token": "uioFljnCnTHpbxtcH0PTtAlFrHxKL1PotVXoJM4gN0A",
  "refresh_expires_at": "2026-11-26T16:16:26.901354029Z",
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
  "command_id": "07523b53-7c65-4120-b0dd-6f2c31fe5227",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:26Z",
    "sequence": 1793117786951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:26.969502Z",
  "last_location_at": "2026-10-27T16:16:26.969502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675353006",
  "device_ref": "sandbox-32260"
}
```

```json
{
  "challenge_id": "d7d39f19-8a2f-4e14-bdcb-3662ddc4f0fa",
  "expires_at": "2026-10-27T16:21:27.000922156Z",
  "resend_available_at": "2026-10-27T16:16:28.000922156Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675353006` → **200**

```json
{
  "phone": "+380675353006",
  "audience": "CLIENT",
  "code": "513215",
  "sent_at": "2026-10-27T16:16:27.00325272Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7d39f19-8a2f-4e14-bdcb-3662ddc4f0fa",
  "code": "513215",
  "device_ref": "sandbox-32260"
}
```

```json
{
  "session_id": "b96a37da-33bd-4d38-b260-e2db92cbacdf",
  "subject": {
    "type": "CLIENT",
    "id": "0ffe1aac-4d8a-43cc-84c4-b1e24949f260"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmZlMWFhYy00ZDhhLTQzY2MtODRjNC1iMWUyNDk0OWYyNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4Njg3LCJpYXQiOjE3OTMxMTc3ODcsImp0aSI6IjZiYTExMjJlLTAxZmMtNDRlOC04NjBlLTI2Yzk5YTMzYzFlZCIsInNpZCI6ImI5NmEzN2RhLTMzYmQtNGQzOC1iMjYwLWUyZGI5MmNiYWNkZiJ9.XTe7KuvGkf8dMsBPtxQGdnpPz6p0CZGEAND27pllbk0",
  "access_expires_at": "2026-10-27T16:31:27.058227747Z",
  "refresh_token": "SpKQNkRBjPfLVKMeEOuHx6ShP3uM18rahKUGqHTKypg",
  "refresh_expires_at": "2026-11-26T16:16:27.057642503Z",
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
  "command_id": "1136ba1a-4b83-4280-ae04-85f36c647611",
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
  "id": "25ba8925-296f-4627-906d-99c514f36cbb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:27.119493Z",
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
  "command_id": "276695d1-4e1c-44a4-b420-055cd59e898b",
  "platform": "ANDROID",
  "token": "sandbox-driver-8c84d00d-f92d-4f70-a6c6-6e562cdfe0c4"
}
```

```json
{
  "id": "a990bb7a-8655-4298-abeb-63e15f7f6a54",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:16:27.162587Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "805b4c0e-0d2e-4ee6-9f3a-ed91c6546231",
  "platform": "ANDROID",
  "token": "sandbox-rider-48378279-38b6-4f42-89b9-42c56e5bb1ff"
}
```

```json
{
  "id": "8bba4bc4-996b-4257-9c08-d2c203da0433",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:16:27.197842Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5d18bd60-7782-4226-bdd0-59c5c7a586ae",
  "quote_id": "25ba8925-296f-4627-906d-99c514f36cbb",
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
  "id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0ffe1aac-4d8a-43cc-84c4-b1e24949f260",
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
  "created_at": "2026-10-27T16:16:27.239365Z",
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
    "id": "625b4194-be02-49c2-ae80-355117bff9d9",
    "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
    "expires_at": "2026-10-27T16:16:42.243068Z",
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

`POST /api/driver/v1/offers/625b4194-be02-49c2-ae80-355117bff9d9/accept` → **200**

```json
{
  "command_id": "ce8f6aa0-9b08-4b74-badd-debf64e46e8e"
}
```

```json
{
  "id": "3cfc447d-0c30-4897-89d9-385ec0465bac",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:16:27.216Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:16:27.216Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:16:27.216Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:16:28.544545346Z",
    "token_suffix": "dfe0c4",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
      "order_version": "2",
      "event_id": "d8c376f1-1a51-4b4e-b6dc-3b94a6786fa3"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675353006&after=2026-10-27T16:16:27.216Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:16:28.546076717Z",
    "token_suffix": "5bb1ff",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
      "order_version": "3",
      "event_id": "91d12428-5696-49dd-baf8-84c8e1b9d7d9"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/fc5c1290-82c6-4a56-9e09-d47609151c08/messages` → **201**

```json
{
  "command_id": "cf977eba-89a0-42fa-ac1f-7895a8718d77",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "64355e80-a712-4804-8c94-5f366ac9290e",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T16:16:29.460533006Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "assignment_id": "3cfc447d-0c30-4897-89d9-385ec0465bac",
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

`POST /api/driver/v1/trips/42c6df2d-ac23-4ef0-a830-62bda5c3532d/messages` → **201**

```json
{
  "command_id": "ad3e446d-1a5b-43b9-886c-03e3dac13e51",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d753ddfc-85b4-45bd-92b3-d1da84276da0",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T16:16:29.511809823Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/fc5c1290-82c6-4a56-9e09-d47609151c08/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/42c6df2d-ac23-4ef0-a830-62bda5c3532d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675353006"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:29Z",
    "sequence": 1793117789589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:29.607664Z",
  "last_location_at": "2026-10-27T16:16:29.607664Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "assignment_id": "3cfc447d-0c30-4897-89d9-385ec0465bac",
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

`POST /api/driver/v1/trips/42c6df2d-ac23-4ef0-a830-62bda5c3532d/arrive` → **200**

```json
{
  "command_id": "baf05889-755c-4f88-a9ea-a9566501602d",
  "expected_version": 0
}
```

```json
{
  "id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "assignment_id": "3cfc447d-0c30-4897-89d9-385ec0465bac",
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
  "arrived_at": "2026-10-27T16:16:29.661306Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/42c6df2d-ac23-4ef0-a830-62bda5c3532d/start` → **200**

```json
{
  "command_id": "45faa74b-f363-4a7c-8f99-46171269d22b",
  "expected_version": 1
}
```

```json
{
  "id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "assignment_id": "3cfc447d-0c30-4897-89d9-385ec0465bac",
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
  "arrived_at": "2026-10-27T16:16:29.661306Z",
  "started_at": "2026-10-27T16:16:29.695476Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:29Z",
    "sequence": 1793117789719
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:29.737703Z",
  "last_location_at": "2026-10-27T16:16:29.737703Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/42c6df2d-ac23-4ef0-a830-62bda5c3532d/complete` → **200**

```json
{
  "command_id": "5040d896-fe00-4b68-9f43-76d8dce607ac",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:16:29Z",
  "cash_received": true
}
```

```json
{
  "id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "assignment_id": "3cfc447d-0c30-4897-89d9-385ec0465bac",
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
  "arrived_at": "2026-10-27T16:16:29.661306Z",
  "started_at": "2026-10-27T16:16:29.695476Z",
  "completed_at": "2026-10-27T16:16:29.772442Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/fc5c1290-82c6-4a56-9e09-d47609151c08` → **200**

```json
{
  "id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0ffe1aac-4d8a-43cc-84c4-b1e24949f260",
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
    "id": "3cfc447d-0c30-4897-89d9-385ec0465bac",
    "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:16:27.239365Z",
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
    "id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:16:27.239365Z",
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
    "id": "42c6df2d-ac23-4ef0-a830-62bda5c3532d",
    "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
    "order_short_number": 5,
    "created_at": "2026-10-27T16:16:27.314243Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "798d7e18-0cec-4d06-9120-8a19032b613a",
    "order_id": "964f6e4f-b7ed-4102-a142-4c013142c7d9",
    "order_short_number": 1,
    "created_at": "2026-10-27T16:16:08.003623Z",
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

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/fc5c1290-82c6-4a56-9e09-d47609151c08/tip` → **200**

```json
{
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
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
  "available_until": "2026-10-28T16:16:29.772442Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fc5c1290-82c6-4a56-9e09-d47609151c08/tip` → **201**

```json
{
  "command_id": "fa161a4c-cf82-4dfb-9848-1629b60678c4",
  "amount_minor": 1100
}
```

```json
{
  "id": "3b9d6d54-3109-4bcf-be0d-339dc98ab880",
  "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T16:16:32.947182Z"
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
  "session_id": "6f111f68-b772-4e80-ace4-093bade3b66f",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2OTMsImlhdCI6MTc5MzExNzc5MywianRpIjoiOTQ5MjgwMGEtOGI5OS00ZjQwLWE3YzYtOTBjYWI3ZDkwMjMzIiwic2lkIjoiNmYxMTFmNjgtYjc3Mi00ZTgwLWFjZTQtMDkzYmFkZTNiNjZmIn0.hXrlXrrVzbf2WbVg1Goc4E-73yYq90wm9LJ6LLfkqAM",
  "access_expires_at": "2026-10-27T16:31:33.272142948Z",
  "refresh_token": "3rK_EyncTA2ahtxgf9g1sUJRjeHzTan1w6b-3z5S4rM",
  "refresh_expires_at": "2026-10-28T04:16:33.271424874Z",
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
  "session_id": "b2676c91-be96-441f-b02c-1454f550c4aa",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2OTMsImlhdCI6MTc5MzExNzc5MywianRpIjoiYTQzZjk5NTctOTRmNy00NWY4LWFiNTAtM2M4YWY3NjE0NjllIiwic2lkIjoiYjI2NzZjOTEtYmU5Ni00NDFmLWIwMmMtMTQ1NGY1NTBjNGFhIn0.53g8unoEFW70asZMnfa_-2F2K723UMpU0hH7E2U6UXs",
  "access_expires_at": "2026-10-27T16:31:33.589871723Z",
  "refresh_token": "lE0AsDOQQHdNSpuFlP8TLWZ1eMtmY0Oll-Q29NFGGNk",
  "refresh_expires_at": "2026-10-28T04:16:33.589290627Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fc5c1290-82c6-4a56-9e09-d47609151c08/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:16:27.24007Z",
      "actor": {
        "type": "CLIENT",
        "id": "0ffe1aac-4d8a-43cc-84c4-b1e24949f260",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
        "quote_id": "25ba8925-296f-4627-906d-99c514f36cbb",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:16:27.24207Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
        "attempt_id": "2be40aea-6824-476f-8c2f-05495921011c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:16:27.248032Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "625b4194-be02-49c2-ae80-355117bff9d9",
        "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:16:27.316707Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "625b4194-be02-49c2-ae80-355117bff9d9",
        "order_id": "fc5c1290-82c6-4a56-9e09-d47609151c08",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3cfc447d-0c30-4897-89d9-385ec0465bac"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order fc5c1290-82c6-4a56-9e09-d47609151c08.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16846"
}
```

```json
{
  "challenge_id": "6c5b59d6-561e-4dc8-9527-5808528b2ede",
  "expires_at": "2026-10-27T16:21:33.652732496Z",
  "resend_available_at": "2026-10-27T16:16:34.652732496Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "116491",
  "sent_at": "2026-10-27T16:16:33.654877236Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c5b59d6-561e-4dc8-9527-5808528b2ede",
  "code": "116491",
  "device_ref": "sandbox-16846"
}
```

```json
{
  "session_id": "166f650c-3432-487b-a7db-37ca79f1d68e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY5MywiaWF0IjoxNzkzMTE3NzkzLCJqdGkiOiI3ZTQwMGVhNi1mNDMyLTRkNjMtOTgyNC00N2ZiYjdmMjJkZDgiLCJzaWQiOiIxNjZmNjUwYy0zNDMyLTQ4N2ItYTdkYi0zN2NhNzlmMWQ2OGUifQ.GtIlqcb1XyVPfiZDt21iZNwreMXqng9Aa1N0m1r-JbU",
  "access_expires_at": "2026-10-27T16:31:33.71188807Z",
  "refresh_token": "s2N4saaqSxMUNTUyWXBLpebT4vkVMrp4CE57fKoAy_8",
  "refresh_expires_at": "2026-11-26T16:16:33.711231282Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:29.737703Z",
  "last_location_at": "2026-10-27T16:16:29.737703Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/handover` → **200**

```json
{
  "command_id": "49a96701-561b-4689-afb4-c9a197dd869d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:29.737703Z",
  "last_location_at": "2026-10-27T16:16:29.737703Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:33Z",
    "sequence": 1793117793802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:33.821231Z",
  "last_location_at": "2026-10-27T16:16:33.821231Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666135194",
  "device_ref": "sandbox-28618"
}
```

```json
{
  "challenge_id": "333aed29-984f-4cbe-b095-787de4118f43",
  "expires_at": "2026-10-27T16:21:33.845360164Z",
  "resend_available_at": "2026-10-27T16:16:34.845360164Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666135194` → **200**

```json
{
  "phone": "+380666135194",
  "audience": "CLIENT",
  "code": "175945",
  "sent_at": "2026-10-27T16:16:33.847459077Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "333aed29-984f-4cbe-b095-787de4118f43",
  "code": "175945",
  "device_ref": "sandbox-28618"
}
```

```json
{
  "session_id": "568ae40b-1970-45aa-966b-176379fc7885",
  "subject": {
    "type": "CLIENT",
    "id": "30723110-747d-4e32-8d40-bb54c586d00d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDcyMzExMC03NDdkLTRlMzItOGQ0MC1iYjU0YzU4NmQwMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NjkzLCJpYXQiOjE3OTMxMTc3OTMsImp0aSI6IjI2YzA1YWQ3LTNjOGQtNDYzMy1hN2UxLTZlY2ExZDg1NTQ3NyIsInNpZCI6IjU2OGFlNDBiLTE5NzAtNDVhYS05NjZiLTE3NjM3OWZjNzg4NSJ9.Zx2S-eWdj1A864FvE7XLzbInmZsLy9hEFAvIWMRG9q8",
  "access_expires_at": "2026-10-27T16:31:33.901726899Z",
  "refresh_token": "zJhncMRsozR3lx5bR2J05lwe93pWd7d0A1CmpkSfABQ",
  "refresh_expires_at": "2026-11-26T16:16:33.901119862Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "70aa99e1-89d6-49ce-8193-00ee5d149dbe",
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
  "id": "5a7a06ea-7e0a-4be4-a9da-5cfef6363fc3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T16:21:33.936638Z",
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
  "command_id": "7208a082-d5c7-4f17-9166-0c58446e524f",
  "quote_id": "5a7a06ea-7e0a-4be4-a9da-5cfef6363fc3",
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
  "id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "30723110-747d-4e32-8d40-bb54c586d00d",
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
  "created_at": "2026-10-27T16:16:33.973746Z",
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
    "id": "54de4752-02a1-4c0c-a482-ff47c4639e5b",
    "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
    "expires_at": "2026-10-27T16:16:48.976756Z",
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

`POST /api/driver/v1/offers/54de4752-02a1-4c0c-a482-ff47c4639e5b/accept` → **200**

```json
{
  "command_id": "1c9e419d-8087-4719-a1b3-482c7a578f21"
}
```

```json
{
  "id": "1ad0d60b-339e-41a9-80d5-6505b8fa9531",
  "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0808aafa-8ac5-4fc2-a6b0-34239bdedc0c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0808aafa-8ac5-4fc2-a6b0-34239bdedc0c",
  "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
  "assignment_id": "1ad0d60b-339e-41a9-80d5-6505b8fa9531",
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

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:34Z",
    "sequence": 1793117794792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:34.097135Z",
  "last_location_at": "2026-10-27T16:16:34.097135Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0808aafa-8ac5-4fc2-a6b0-34239bdedc0c/arrive` → **200**

```json
{
  "command_id": "0f933677-9133-4779-9ba7-abfda6ab1bf1",
  "expected_version": 0
}
```

```json
{
  "id": "0808aafa-8ac5-4fc2-a6b0-34239bdedc0c",
  "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
  "assignment_id": "1ad0d60b-339e-41a9-80d5-6505b8fa9531",
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
  "arrived_at": "2026-10-27T16:16:34.133439Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0808aafa-8ac5-4fc2-a6b0-34239bdedc0c/start` → **200**

```json
{
  "command_id": "276f7b11-79fc-4b74-bf01-5e23790ada7c",
  "expected_version": 1
}
```

```json
{
  "id": "0808aafa-8ac5-4fc2-a6b0-34239bdedc0c",
  "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
  "assignment_id": "1ad0d60b-339e-41a9-80d5-6505b8fa9531",
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
  "arrived_at": "2026-10-27T16:16:34.133439Z",
  "started_at": "2026-10-27T16:16:34.171912Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:34Z",
    "sequence": 1793117794793
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:34.21618Z",
  "last_location_at": "2026-10-27T16:16:34.21618Z",
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
  "device_ref": "sandbox-22562"
}
```

```json
{
  "challenge_id": "23bfb1fb-f3a3-4386-992e-147986aaf336",
  "expires_at": "2026-10-27T16:21:34.240632957Z",
  "resend_available_at": "2026-10-27T16:16:35.240632957Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "589364",
  "sent_at": "2026-10-27T16:16:34.242943465Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23bfb1fb-f3a3-4386-992e-147986aaf336",
  "code": "589364",
  "device_ref": "sandbox-22562"
}
```

```json
{
  "session_id": "803ec2da-3d73-49dc-968e-18540059a5de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY5NCwiaWF0IjoxNzkzMTE3Nzk0LCJqdGkiOiI3NDRjOGEzMi1mNTk0LTQ5ODYtYWQ5OS03MTFlNDFkOThkMjQiLCJzaWQiOiI4MDNlYzJkYS0zZDczLTQ5ZGMtOTY4ZS0xODU0MDA1OWE1ZGUifQ.pF4Qzzd32zpJIeb3qX9GZ4uA3gbYE-VUO9mubBlVm9s",
  "access_expires_at": "2026-10-27T16:31:34.29725331Z",
  "refresh_token": "uR0gsp23xhRhRTUTSCvF9jF9pmURkl45WwODx9NCcXE",
  "refresh_expires_at": "2026-11-26T16:16:34.296674828Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
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
  "last_heartbeat_at": "2026-10-27T16:16:12.589314Z",
  "last_location_at": "2026-10-27T16:16:12.589314Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c79a55a1-416b-450b-9aa3-9e429492b1b2/handover` → **200**

```json
{
  "command_id": "ae7e50ec-82e6-438d-bc56-277effea8fde",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
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
  "last_heartbeat_at": "2026-10-27T16:16:12.589314Z",
  "last_location_at": "2026-10-27T16:16:12.589314Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c79a55a1-416b-450b-9aa3-9e429492b1b2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:34Z",
    "sequence": 1793117794794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
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
  "last_heartbeat_at": "2026-10-27T16:16:34.401017Z",
  "last_location_at": "2026-10-27T16:16:34.401017Z",
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
  "session_id": "9bc47015-2e91-4d5c-b252-9f17810968b5",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2OTQsImlhdCI6MTc5MzExNzc5NCwianRpIjoiNDE5NGIzMWUtMzgzNC00YzgzLTg1Y2MtMGZkZjVlMzY0MTYyIiwic2lkIjoiOWJjNDcwMTUtMmU5MS00ZDVjLWIyNTItOWYxNzgxMDk2OGI1In0.ma7EOlMVyd0c7WKJmsF9j2IJD-W5hVi2cpgrWnfpwOA",
  "access_expires_at": "2026-10-27T16:31:34.721261496Z",
  "refresh_token": "GlXsyu-PZuF8uhVXf6hpvxoWCj5f2QDlRc66VAcLqFM",
  "refresh_expires_at": "2026-10-28T04:16:34.720750431Z",
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
  "session_id": "d85a029c-de1b-456f-9a31-82e5b92d0794",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2OTUsImlhdCI6MTc5MzExNzc5NSwianRpIjoiMGUyNzIxMDYtNzZlYy00Y2U2LThhNmYtNjNhNmU3M2YzYzgzIiwic2lkIjoiZDg1YTAyOWMtZGUxYi00NTZmLTlhMzEtODJlNWI5MmQwNzk0In0.0bf-XUU6_oTuVEOHpF2XunT6i5Ew-RmPmTluTvjqPxs",
  "access_expires_at": "2026-10-27T16:31:35.04022274Z",
  "refresh_token": "lAw1sLq0KI5bPffzSJdkT_dbUYUk2tfXDgdQD_dZk0I",
  "refresh_expires_at": "2026-10-28T04:16:35.039641956Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9f90b6cb-85ae-4231-9817-5a5ecef7fe8a` → **200**

```json
{
  "id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "30723110-747d-4e32-8d40-bb54c586d00d",
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
    "id": "1ad0d60b-339e-41a9-80d5-6505b8fa9531",
    "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0808aafa-8ac5-4fc2-a6b0-34239bdedc0c",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T16:16:33.973746Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9f90b6cb-85ae-4231-9817-5a5ecef7fe8a/interrupt` → **200**

```json
{
  "command_id": "c3375888-8d55-4691-9337-a431fdb16ea4",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "30723110-747d-4e32-8d40-bb54c586d00d",
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
      "id": "1ad0d60b-339e-41a9-80d5-6505b8fa9531",
      "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "0808aafa-8ac5-4fc2-a6b0-34239bdedc0c",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T16:16:33.973746Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "30723110-747d-4e32-8d40-bb54c586d00d",
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
    "id": "7eb19e2f-a19e-4d03-9607-8a0630f89bbc",
    "order_id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
    "expires_at": "2026-10-27T16:16:50.125775Z",
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

`POST /api/driver/v1/offers/7eb19e2f-a19e-4d03-9607-8a0630f89bbc/accept` → **200**

```json
{
  "command_id": "3c89c911-d9b4-4a3d-ac42-30954cce5e91"
}
```

```json
{
  "id": "ca4fc51c-ab0e-4e30-85bd-6eaa423f0432",
  "order_id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ad522a56-3128-4152-8009-df6d0d59d1cd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ad522a56-3128-4152-8009-df6d0d59d1cd",
  "order_id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
  "assignment_id": "ca4fc51c-ab0e-4e30-85bd-6eaa423f0432",
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
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:16:34.401017Z",
  "last_location_at": "2026-10-27T16:16:34.401017Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/c79a55a1-416b-450b-9aa3-9e429492b1b2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:35Z",
    "sequence": 1793117795282
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:16:35.30169Z",
  "last_location_at": "2026-10-27T16:16:35.30169Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ad522a56-3128-4152-8009-df6d0d59d1cd/arrive` → **200**

```json
{
  "command_id": "6343dca1-ff58-4d48-afd9-5b84cd2b845b",
  "expected_version": 0
}
```

```json
{
  "id": "ad522a56-3128-4152-8009-df6d0d59d1cd",
  "order_id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
  "assignment_id": "ca4fc51c-ab0e-4e30-85bd-6eaa423f0432",
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
  "arrived_at": "2026-10-27T16:16:35.34147Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ad522a56-3128-4152-8009-df6d0d59d1cd/start` → **200**

```json
{
  "command_id": "264d7b19-1268-48a3-a05f-ad030801bd73",
  "expected_version": 1
}
```

```json
{
  "id": "ad522a56-3128-4152-8009-df6d0d59d1cd",
  "order_id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
  "assignment_id": "ca4fc51c-ab0e-4e30-85bd-6eaa423f0432",
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
  "arrived_at": "2026-10-27T16:16:35.34147Z",
  "started_at": "2026-10-27T16:16:35.383112Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ad522a56-3128-4152-8009-df6d0d59d1cd/complete` → **200**

```json
{
  "command_id": "81885e76-32ce-4eee-b380-e3993401e1a8",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:16:35Z"
}
```

```json
{
  "id": "ad522a56-3128-4152-8009-df6d0d59d1cd",
  "order_id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
  "assignment_id": "ca4fc51c-ab0e-4e30-85bd-6eaa423f0432",
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
  "arrived_at": "2026-10-27T16:16:35.34147Z",
  "started_at": "2026-10-27T16:16:35.383112Z",
  "completed_at": "2026-10-27T16:16:35.427663Z",
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
    "id": "4ea044b2-beac-40d7-9f3a-887bf52d6f59",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:16:35.116243Z",
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
    "id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:16:33.973746Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
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

`GET /api/operator/v1/orders/9f90b6cb-85ae-4231-9817-5a5ecef7fe8a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:16:33.974279Z",
      "actor": {
        "type": "CLIENT",
        "id": "30723110-747d-4e32-8d40-bb54c586d00d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
        "quote_id": "5a7a06ea-7e0a-4be4-a9da-5cfef6363fc3",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:16:33.975931Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
        "attempt_id": "0205c668-2045-467d-a28f-f0e1b115a5c6",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:16:33.981537Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "54de4752-02a1-4c0c-a482-ff47c4639e5b",
        "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:16:34.038022Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "54de4752-02a1-4c0c-a482-ff47c4639e5b",
        "order_id": "9f90b6cb-85ae-4231-9817-5a5ecef7fe8a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "1ad0d60b-339e-41a9-80d5-6505b8fa9531"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 9f90b6cb-85ae-4231-9817-5a5ecef7fe8a, follow-up 4ea044b2-beac-40d7-9f3a-887bf52d6f59.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-7856"
}
```

```json
{
  "challenge_id": "e3a38f32-4fcc-4d07-ac57-b4ca5cf79ebf",
  "expires_at": "2026-10-27T16:21:38.557499089Z",
  "resend_available_at": "2026-10-27T16:16:39.557499089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "447377",
  "sent_at": "2026-10-27T16:16:38.560103964Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3a38f32-4fcc-4d07-ac57-b4ca5cf79ebf",
  "code": "447377",
  "device_ref": "sandbox-7856"
}
```

```json
{
  "session_id": "20d9664b-81e8-4a99-a798-707de4f27a1e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODY5OCwiaWF0IjoxNzkzMTE3Nzk4LCJqdGkiOiI2ZmYzYzBlNC0zMWM5LTRmMDYtYmYwNS1iMzFhYjY5NmVhMzYiLCJzaWQiOiIyMGQ5NjY0Yi04MWU4LTRhOTktYTc5OC03MDdkZTRmMjdhMWUifQ.2sIHVfM7rw20SxiMRN6SnJvzyYvuqphBwRnojI2X4rU",
  "access_expires_at": "2026-10-27T16:31:38.617233329Z",
  "refresh_token": "OIYU16fkzL5Bo42a5Ng7nEJJjx4SSqNwzinKN8VKAIA",
  "refresh_expires_at": "2026-11-26T16:16:38.616710282Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
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
  "last_heartbeat_at": "2026-10-27T16:16:35.30169Z",
  "last_location_at": "2026-10-27T16:16:35.30169Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c79a55a1-416b-450b-9aa3-9e429492b1b2/handover` → **200**

```json
{
  "command_id": "bc1099ab-f789-42ed-819b-229b892d8793",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:16:35.30169Z",
  "last_location_at": "2026-10-27T16:16:35.30169Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c79a55a1-416b-450b-9aa3-9e429492b1b2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:38Z",
    "sequence": 1793117798699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:16:38.717901Z",
  "last_location_at": "2026-10-27T16:16:38.717901Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671576014",
  "device_ref": "sandbox-18151"
}
```

```json
{
  "challenge_id": "0cfc183d-7650-45a8-9c4a-89ca571d20c1",
  "expires_at": "2026-10-27T16:21:38.746775781Z",
  "resend_available_at": "2026-10-27T16:16:39.746775781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671576014` → **200**

```json
{
  "phone": "+380671576014",
  "audience": "CLIENT",
  "code": "479715",
  "sent_at": "2026-10-27T16:16:38.749261598Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0cfc183d-7650-45a8-9c4a-89ca571d20c1",
  "code": "479715",
  "device_ref": "sandbox-18151"
}
```

```json
{
  "session_id": "dd2634ce-9972-4474-9e67-cd7d318d45c3",
  "subject": {
    "type": "CLIENT",
    "id": "027b34d6-198b-43d7-a209-afc5398be1f3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjdiMzRkNi0xOThiLTQzZDctYTIwOS1hZmM1Mzk4YmUxZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4Njk4LCJpYXQiOjE3OTMxMTc3OTgsImp0aSI6IjFjODZjNWFiLWRiNGUtNGQ2My1hNzhhLWRiNGUxMWUyMzVkMyIsInNpZCI6ImRkMjYzNGNlLTk5NzItNDQ3NC05ZTY3LWNkN2QzMThkNDVjMyJ9.0UyoRFwLRnZf1AuN8V6NU43QK_o7YqigdDJ_R-TRdA8",
  "access_expires_at": "2026-10-27T16:31:38.803545174Z",
  "refresh_token": "XdZHcdn3Kilw7_W2eLRMG33ZW22CVNxUHAs_cpVe53o",
  "refresh_expires_at": "2026-11-26T16:16:38.802937952Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f31c104c-49ff-4491-8d08-1bbbe484bca7",
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
  "id": "fadb2637-979d-440f-8e22-e1e9ada205a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:38.837218Z",
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
  "command_id": "4533dd76-3c77-4d48-bd58-dba0695d28fe",
  "quote_id": "fadb2637-979d-440f-8e22-e1e9ada205a2",
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
    "phone": "+380675306122"
  }
}
```

```json
{
  "id": "48be5d47-562d-437b-8187-1f53a37b4484",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:38.874649Z",
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
    "id": "e3d135a1-9e3a-46d2-9feb-bfd8c34b8e5b",
    "order_id": "48be5d47-562d-437b-8187-1f53a37b4484",
    "expires_at": "2026-10-27T16:16:53.87818Z",
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

`POST /api/driver/v1/offers/e3d135a1-9e3a-46d2-9feb-bfd8c34b8e5b/accept` → **200**

```json
{
  "command_id": "25094638-f276-41f6-aeb8-8b78d731cb34"
}
```

```json
{
  "id": "7db9cea7-c6e3-4e9d-b0a6-7d8f02e8b388",
  "order_id": "48be5d47-562d-437b-8187-1f53a37b4484",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8754f1da-4630-48e6-bdb1-aad6ca1b3eb9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8754f1da-4630-48e6-bdb1-aad6ca1b3eb9",
  "order_id": "48be5d47-562d-437b-8187-1f53a37b4484",
  "assignment_id": "7db9cea7-c6e3-4e9d-b0a6-7d8f02e8b388",
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
    "phone": "+380675306122"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0b3ef2c7-1660-44b1-9f40-a69592b9e71f",
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
  "id": "e6791752-497d-4d5f-895f-3f72ca92609b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:39.017008Z",
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
  "command_id": "dfbab245-9fe5-45ba-a374-c266d98d6c54",
  "quote_id": "e6791752-497d-4d5f-895f-3f72ca92609b",
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
  "id": "81ac33bf-779c-4869-8935-cb01a74e692a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:39.052818Z",
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
  "command_id": "688d0712-9197-411a-9e6c-953e42895f84",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T19:16:39Z"
}
```

```json
{
  "id": "c7820698-ebaf-4c6a-91e2-7b3e27ce999b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:39.100393Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T19:16:39Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "884e7d23-a350-4b43-875a-88f3cf097ba1",
  "quote_id": "c7820698-ebaf-4c6a-91e2-7b3e27ce999b",
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
  "pickup_at": "2026-10-27T19:16:39Z"
}
```

```json
{
  "id": "d8da7934-e385-4264-a682-98120beca87e",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:39.141662Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:16:39Z",
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
  "command_id": "f4cc4113-9f3e-4160-b352-764dd5db4ffa",
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
  "id": "6584881c-3e07-410f-bb49-5ee8f6c93ed5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:39.181859Z",
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
  "command_id": "be3d2d11-8d95-4dc8-a235-d89a1d4f759b",
  "quote_id": "6584881c-3e07-410f-bb49-5ee8f6c93ed5",
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
  "correlation_id": "9a29667f-f4cb-4ffd-928d-d20f63ba7446"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "d8da7934-e385-4264-a682-98120beca87e",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
      "created_at": "2026-10-27T16:16:39.141662Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T19:16:39Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "81ac33bf-779c-4869-8935-cb01a74e692a",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
      "created_at": "2026-10-27T16:16:39.052818Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "48be5d47-562d-437b-8187-1f53a37b4484",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "81ac33bf-779c-4869-8935-cb01a74e692a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:39.052818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/48be5d47-562d-437b-8187-1f53a37b4484` → **200**

```json
{
  "id": "48be5d47-562d-437b-8187-1f53a37b4484",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
    "id": "7db9cea7-c6e3-4e9d-b0a6-7d8f02e8b388",
    "order_id": "48be5d47-562d-437b-8187-1f53a37b4484",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8754f1da-4630-48e6-bdb1-aad6ca1b3eb9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T16:16:38.874649Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/48be5d47-562d-437b-8187-1f53a37b4484/cancel` → **200**

```json
{
  "command_id": "d93526e1-7adc-4659-b8ae-dca8f48ae508",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "48be5d47-562d-437b-8187-1f53a37b4484",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
    "id": "7db9cea7-c6e3-4e9d-b0a6-7d8f02e8b388",
    "order_id": "48be5d47-562d-437b-8187-1f53a37b4484",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8754f1da-4630-48e6-bdb1-aad6ca1b3eb9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T16:16:38.874649Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/81ac33bf-779c-4869-8935-cb01a74e692a` → **200**

```json
{
  "id": "81ac33bf-779c-4869-8935-cb01a74e692a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:39.052818Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/81ac33bf-779c-4869-8935-cb01a74e692a/cancel` → **200**

```json
{
  "command_id": "f83d7c9b-143a-4a2a-9606-1b86c731a7ce",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "81ac33bf-779c-4869-8935-cb01a74e692a",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:39.052818Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d8da7934-e385-4264-a682-98120beca87e` → **200**

```json
{
  "id": "d8da7934-e385-4264-a682-98120beca87e",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:39.141662Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:16:39Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d8da7934-e385-4264-a682-98120beca87e/cancel` → **200**

```json
{
  "command_id": "74e75999-566b-4e45-9adf-0fbebec55d8d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d8da7934-e385-4264-a682-98120beca87e",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "027b34d6-198b-43d7-a209-afc5398be1f3",
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
  "created_at": "2026-10-27T16:16:39.141662Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-27T19:16:39Z",
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
  "session_id": "c79a55a1-416b-450b-9aa3-9e429492b1b2",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T16:16:38.717901Z",
  "last_location_at": "2026-10-27T16:16:38.717901Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c79a55a1-416b-450b-9aa3-9e429492b1b2/close` → **200**

```json
{
  "command_id": "e85b9975-cf07-4993-97a1-5f62d2b018cb",
  "expected_version": 2
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

Done: orders 48be5d47-562d-437b-8187-1f53a37b4484, 81ac33bf-779c-4869-8935-cb01a74e692a, d8da7934-e385-4264-a682-98120beca87e.

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
  "session_id": "8c8acf82-e02c-4f7d-b90d-7b4406b0168d",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg2OTksImlhdCI6MTc5MzExNzc5OSwianRpIjoiODQ5NDJiNmYtNDk5OS00ODllLThmYTItNDZkMDNhMjE5YjgyIiwic2lkIjoiOGM4YWNmODItZTAyYy00ZjdkLWI5MGQtN2I0NDA2YjAxNjhkIn0.CJOAlOwYViaDwwt9vOxRaFN07lRvn4sJz0n5B55znf8",
  "access_expires_at": "2026-10-27T16:31:39.849899982Z",
  "refresh_token": "3esBaiLmsw9vSd_Dhl-csbPwdXO5sRLcq34dQA11KIg",
  "refresh_expires_at": "2026-10-28T04:16:39.849323541Z",
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
  "session_id": "90a56672-b016-4490-a8bd-10517e9264e5",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDAsImlhdCI6MTc5MzExNzgwMCwianRpIjoiMzFmZTExNGUtMjY5MC00ODZhLTk5YzItNTNiNGNjYWVkYjdjIiwic2lkIjoiOTBhNTY2NzItYjAxNi00NDkwLWE4YmQtMTA1MTdlOTI2NGU1In0.erEE83UYAjMLMLGza7n54eF17IklBYeq6iDF7naSEIY",
  "access_expires_at": "2026-10-27T16:31:40.169990049Z",
  "refresh_token": "YbI_X9c6yUwyUcZgYBUThmuGLRAsfiek2xcev9JsNls",
  "refresh_expires_at": "2026-10-28T04:16:40.169415406Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20448"
}
```

```json
{
  "challenge_id": "8e5b3670-28c2-4e64-a26d-262ec56c865c",
  "expires_at": "2026-10-27T16:21:40.19515444Z",
  "resend_available_at": "2026-10-27T16:16:41.19515444Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "797764",
  "sent_at": "2026-10-27T16:16:40.197181222Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e5b3670-28c2-4e64-a26d-262ec56c865c",
  "code": "797764",
  "device_ref": "sandbox-20448"
}
```

```json
{
  "session_id": "39155731-5178-47ce-beb0-83fffe7c215b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODcwMCwiaWF0IjoxNzkzMTE3ODAwLCJqdGkiOiIwOWEwNmRkNS0wMGU5LTRkOTctODllYy0xNzM1M2E0MmFiNWYiLCJzaWQiOiIzOTE1NTczMS01MTc4LTQ3Y2UtYmViMC04M2ZmZmU3YzIxNWIifQ.bFTfZp_7aszG2LNR9HcNcNtCP70y91fXRJGKtNHclwY",
  "access_expires_at": "2026-10-27T16:31:40.252655068Z",
  "refresh_token": "1nLnIr7PXcfL98CHzoF0wSyIRFANFOcYrekrSmXQKh8",
  "refresh_expires_at": "2026-11-26T16:16:40.25200579Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:34.21618Z",
  "last_location_at": "2026-10-27T16:16:34.21618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/handover` → **200**

```json
{
  "command_id": "616bdc63-b096-42d6-87a7-6202444df6da",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:34.21618Z",
  "last_location_at": "2026-10-27T16:16:34.21618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:40Z",
    "sequence": 1793117800347
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:40.365705Z",
  "last_location_at": "2026-10-27T16:16:40.365705Z",
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
  "command_id": "17612df0-c5cf-46ae-ab4e-4ec2c7e0368c",
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
  "effective_at": "2026-10-27T16:16:40.439556Z",
  "changed_by": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T16:16:40.469420231Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e116bdbd-5205-4c55-ab13-19de1aa4bd9f",
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
  "id": "3b7a7079-adc6-475d-a06b-e6d53e2aeb49",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:21:40.511007Z",
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
  "command_id": "bcf7065c-d853-4b75-8bbf-53935f43bd10",
  "quote_id": "3b7a7079-adc6-475d-a06b-e6d53e2aeb49",
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
    "phone": "+380671114226"
  }
}
```

```json
{
  "id": "515954ba-3532-4f48-b6b8-78db31670bda",
  "short_number": 11,
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
  "created_at": "2026-10-27T16:16:40.562722Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114226"
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
    "id": "060f585b-082b-40a7-a6bc-cc831d43acac",
    "order_id": "515954ba-3532-4f48-b6b8-78db31670bda",
    "expires_at": "2026-10-27T16:16:55.566962Z",
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

`POST /api/driver/v1/offers/060f585b-082b-40a7-a6bc-cc831d43acac/accept` → **200**

```json
{
  "command_id": "b30cad70-da15-4bf0-a222-fa68e2a5ca1f"
}
```

```json
{
  "id": "cd81d65e-39a0-4cb3-96fc-9df162184166",
  "order_id": "515954ba-3532-4f48-b6b8-78db31670bda",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1b0359a0-bc63-43ce-9338-b17fc3b5e94b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1b0359a0-bc63-43ce-9338-b17fc3b5e94b",
  "order_id": "515954ba-3532-4f48-b6b8-78db31670bda",
  "assignment_id": "cd81d65e-39a0-4cb3-96fc-9df162184166",
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
    "phone": "+380671114226"
  }
}
```

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:40Z",
    "sequence": 1793117800676
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:40.695017Z",
  "last_location_at": "2026-10-27T16:16:40.695017Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1b0359a0-bc63-43ce-9338-b17fc3b5e94b/arrive` → **200**

```json
{
  "command_id": "b42e50ad-9eda-4209-a99f-4a52602af2f8",
  "expected_version": 0
}
```

```json
{
  "id": "1b0359a0-bc63-43ce-9338-b17fc3b5e94b",
  "order_id": "515954ba-3532-4f48-b6b8-78db31670bda",
  "assignment_id": "cd81d65e-39a0-4cb3-96fc-9df162184166",
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
  "arrived_at": "2026-10-27T16:16:40.732183Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114226"
  }
}
```

`POST /api/driver/v1/trips/1b0359a0-bc63-43ce-9338-b17fc3b5e94b/start` → **200**

```json
{
  "command_id": "ac10dd2e-d3bc-4648-86ed-c0222d6a3fce",
  "expected_version": 1
}
```

```json
{
  "id": "1b0359a0-bc63-43ce-9338-b17fc3b5e94b",
  "order_id": "515954ba-3532-4f48-b6b8-78db31670bda",
  "assignment_id": "cd81d65e-39a0-4cb3-96fc-9df162184166",
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
  "arrived_at": "2026-10-27T16:16:40.732183Z",
  "started_at": "2026-10-27T16:16:40.77314Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114226"
  }
}
```

`POST /api/driver/v1/trips/1b0359a0-bc63-43ce-9338-b17fc3b5e94b/complete` → **200**

```json
{
  "command_id": "e0c2d835-0f04-475f-926f-2c65e03bc5a3",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:16:40Z",
  "cash_received": true
}
```

```json
{
  "id": "1b0359a0-bc63-43ce-9338-b17fc3b5e94b",
  "order_id": "515954ba-3532-4f48-b6b8-78db31670bda",
  "assignment_id": "cd81d65e-39a0-4cb3-96fc-9df162184166",
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
  "arrived_at": "2026-10-27T16:16:40.732183Z",
  "started_at": "2026-10-27T16:16:40.77314Z",
  "completed_at": "2026-10-27T16:16:40.817579Z",
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
  "command_id": "05e7ab70-43ff-4b28-9a95-c63b9602eb5c",
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
  "id": "b2d3b716-8847-42b7-82ab-00bd3d8e7179",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:21:40.863364Z",
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
  "command_id": "3207cacf-517c-40e3-9c37-67c1c665c123",
  "quote_id": "b2d3b716-8847-42b7-82ab-00bd3d8e7179",
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
    "phone": "+3806711128838"
  }
}
```

```json
{
  "id": "a43095ff-f536-4ee6-86a4-c83d28157cfd",
  "short_number": 12,
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
  "created_at": "2026-10-27T16:16:40.903004Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128838"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a43095ff-f536-4ee6-86a4-c83d28157cfd` → **200**

```json
{
  "id": "a43095ff-f536-4ee6-86a4-c83d28157cfd",
  "short_number": 12,
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
  "created_at": "2026-10-27T16:16:40.903004Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128838"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a43095ff-f536-4ee6-86a4-c83d28157cfd/cancel` → **200**

```json
{
  "command_id": "ca1dd8a8-bda4-4947-a02f-508d0a543d17",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "a43095ff-f536-4ee6-86a4-c83d28157cfd",
  "short_number": 12,
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
  "created_at": "2026-10-27T16:16:40.903004Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128838"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora"
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
  "staff_id": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T16:16:40.823867Z",
  "last_entries": [
    {
      "order_id": "a43095ff-f536-4ee6-86a4-c83d28157cfd",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T16:16:40.980055Z"
    },
    {
      "order_id": "515954ba-3532-4f48-b6b8-78db31670bda",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T16:16:40.823867Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f9f970-3b74-4389-9989-17915bf21d88",
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
  "last_heartbeat_at": "2026-10-27T16:16:40.695017Z",
  "last_location_at": "2026-10-27T16:16:40.695017Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99f9f970-3b74-4389-9989-17915bf21d88/close` → **200**

```json
{
  "command_id": "ff2ab994-5a0f-4536-906d-b9c483200bc5",
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

Done: operator bonus for fulfilled 515954ba-3532-4f48-b6b8-78db31670bda and operator-fault cancellation a43095ff-f536-4ee6-86a4-c83d28157cfd.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635543110",
  "device_ref": "sandbox-24289"
}
```

```json
{
  "challenge_id": "ab48d943-07a3-4f09-af36-988e307858a5",
  "expires_at": "2026-10-27T16:21:43.14001948Z",
  "resend_available_at": "2026-10-27T16:16:44.14001948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635543110` → **200**

```json
{
  "phone": "+380635543110",
  "audience": "CLIENT",
  "code": "434164",
  "sent_at": "2026-10-27T16:16:43.142111069Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab48d943-07a3-4f09-af36-988e307858a5",
  "code": "434164",
  "device_ref": "sandbox-24289"
}
```

```json
{
  "session_id": "028ce459-3656-4abe-af84-b3a05e9a67ee",
  "subject": {
    "type": "CLIENT",
    "id": "ee285648-e4ee-4be1-8a0d-18ca06fce5c1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTI4NTY0OC1lNGVlLTRiZTEtOGEwZC0xOGNhMDZmY2U1YzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NzAzLCJpYXQiOjE3OTMxMTc4MDMsImp0aSI6ImJkMWI2NjZjLWE1NzAtNGUzMC05OGMxLTM4ZmIxODI4N2JhOCIsInNpZCI6IjAyOGNlNDU5LTM2NTYtNGFiZS1hZjg0LWIzYTA1ZTlhNjdlZSJ9.q4NxXAeTqLnsO2fUTBYA2Y4gqLPF3aeL8Zy0_uxT7O8",
  "access_expires_at": "2026-10-27T16:31:43.195834249Z",
  "refresh_token": "yDeTeojVSe6NqxxVlSLOWroVfRdS-p6mPUD1zDO4Eig",
  "refresh_expires_at": "2026-11-26T16:16:43.195272192Z",
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
  "session_id": "797b7d32-6a0f-4c74-8e93-63fa54905336",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDMsImlhdCI6MTc5MzExNzgwMywianRpIjoiMWI4NWI4YjQtNTNiNS00YjEzLTk4Y2YtYTQ4NDdhOWZmMWU1Iiwic2lkIjoiNzk3YjdkMzItNmEwZi00Yzc0LThlOTMtNjNmYTU0OTA1MzM2In0.sfeQO7Wt37uNY5_ke_KuHBQBBMY0gON826D2Ht8zjw0",
  "access_expires_at": "2026-10-27T16:31:43.596482791Z",
  "refresh_token": "-f-EOaRCr5XOgzvS-0uJCikq8ifeqa6-Pcrsz5jS2xY",
  "refresh_expires_at": "2026-10-28T04:16:43.595942982Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635543110` → **200**

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
  "correlation_id": "c5702596-d6ed-41cc-abbd-5ef175134114"
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
  "session_id": "8c127b5a-fc40-48f8-b972-369e734c2bcd",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDMsImlhdCI6MTc5MzExNzgwMywianRpIjoiODUyMDM3YTItZWE0NC00MWE2LWFkZjMtNDU4NjI2MjU4OGZlIiwic2lkIjoiOGMxMjdiNWEtZmM0MC00OGY4LWI5NzItMzY5ZTczNGMyYmNkIn0.hfvBPspa2PkatMAXGBjM76xTl3KSxmVK24QpAcqqrm0",
  "access_expires_at": "2026-10-27T16:31:43.983636052Z",
  "refresh_token": "Zm1V8rMRsllDIRyE0NNseYYu2_bGQWyCPgzV-_eW4Eo",
  "refresh_expires_at": "2026-10-28T04:16:43.982930503Z",
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
  "command_id": "80bc1fba-b3f6-4018-bc2f-f0bd9928f755",
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
  "changed_by": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T16:16:44.057924627Z"
}
```

## The rider books the airport for 2026-10-27T19:16:43Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600256776",
  "device_ref": "sandbox-2044"
}
```

```json
{
  "challenge_id": "7f9df8a8-7781-4e5c-8436-2d5a2a181034",
  "expires_at": "2026-10-27T16:21:44.090924206Z",
  "resend_available_at": "2026-10-27T16:16:45.090924206Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600256776` → **200**

```json
{
  "phone": "+48600256776",
  "audience": "CLIENT",
  "code": "056485",
  "sent_at": "2026-10-27T16:16:44.092895561Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f9df8a8-7781-4e5c-8436-2d5a2a181034",
  "code": "056485",
  "device_ref": "sandbox-2044"
}
```

```json
{
  "session_id": "29513350-16b3-4a85-a8c4-336a5d2e6278",
  "subject": {
    "type": "CLIENT",
    "id": "d1d274d6-c38c-40b3-85b1-3f8327d1e722"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWQyNzRkNi1jMzhjLTQwYjMtODViMS0zZjgzMjdkMWU3MjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NzA0LCJpYXQiOjE3OTMxMTc4MDQsImp0aSI6IjZiNTg4ZWVlLWJiOWQtNDFiYy05NjU4LTkyYjQwNmM3ZDliNCIsInNpZCI6IjI5NTEzMzUwLTE2YjMtNGE4NS1hOGM0LTMzNmE1ZDJlNjI3OCJ9.Fq5HNFSWu4IjzRmzb5n3Syr2RRxUkamJuF4IuMRNVFc",
  "access_expires_at": "2026-10-27T16:31:44.145974918Z",
  "refresh_token": "Tt_urgRCtLAXOblgJ5GRX8RN7NtOaxFZo1qciOnJCZo",
  "refresh_expires_at": "2026-11-26T16:16:44.145483419Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7f70805-32f7-4574-908d-123167c4fe83",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T19:16:43Z"
}
```

```json
{
  "id": "58284f1b-51fe-4eae-8766-73104dadeb1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T16:21:44.180235Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T19:16:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1ebc89cb-01b3-41f1-aa67-60cbe9b56a5f",
  "quote_id": "58284f1b-51fe-4eae-8766-73104dadeb1e",
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
  "pickup_at": "2026-10-27T19:16:43Z"
}
```

```json
{
  "id": "5f59401f-6915-4faf-b830-e4d2780fc032",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d1d274d6-c38c-40b3-85b1-3f8327d1e722",
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
  "created_at": "2026-10-27T16:16:44.216489Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:16:43Z",
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
  "device_ref": "sandbox-3329"
}
```

```json
{
  "challenge_id": "c4bec9d8-3980-4976-8e16-deae9e8862cc",
  "expires_at": "2026-10-27T16:21:44.249150672Z",
  "resend_available_at": "2026-10-27T16:16:45.249150672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "864397",
  "sent_at": "2026-10-27T16:16:44.251227895Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4bec9d8-3980-4976-8e16-deae9e8862cc",
  "code": "864397",
  "device_ref": "sandbox-3329"
}
```

```json
{
  "session_id": "4a8b0eb1-8932-42be-a04c-d4d9341aac97",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODcwNCwiaWF0IjoxNzkzMTE3ODA0LCJqdGkiOiIwMzY5YTVkNy0xOTVjLTQwM2MtYjQzYy0xY2M0OGU1YzAxZDciLCJzaWQiOiI0YThiMGViMS04OTMyLTQyYmUtYTA0Yy1kNGQ5MzQxYWFjOTcifQ.gSgwrlcdA0ch-5Topd9UYIQ9TXh5A8ybvu9YD6IEVe0",
  "access_expires_at": "2026-10-27T16:31:44.30426541Z",
  "refresh_token": "1DuDDAOaux8ZIE2z6_rgijnR-C6E2rvmCCS3zvve3DA",
  "refresh_expires_at": "2026-11-26T16:16:44.303761074Z",
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
  "command_id": "961a7ea0-8721-411f-aae0-f9f5a45e10cd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:44Z",
    "sequence": 1793117804352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3eba91c3-a40e-4012-a8eb-945d03a46b26",
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
  "last_heartbeat_at": "2026-10-27T16:16:44.369415Z",
  "last_location_at": "2026-10-27T16:16:44.369415Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5f59401f-6915-4faf-b830-e4d2780fc032",
      "short_number": 13,
      "pickup_at": "2026-10-27T19:16:43Z",
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

`POST /api/driver/v1/preorders/5f59401f-6915-4faf-b830-e4d2780fc032/reserve` → **200**

```json
{
  "command_id": "e007d877-0ff7-4480-b730-ef361655acc8"
}
```

```json
{
  "id": "d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5",
  "state": "RESERVED",
  "order": {
    "order_id": "5f59401f-6915-4faf-b830-e4d2780fc032",
    "short_number": 13,
    "pickup_at": "2026-10-27T19:16:43Z",
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
  "reserved_at": "2026-10-27T16:16:44.437111Z",
  "confirm_from": "2026-10-27T18:46:43Z",
  "confirm_until": "2026-10-27T18:56:43Z",
  "drop_until": "2026-10-27T18:16:43Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5",
      "state": "RESERVED",
      "order": {
        "order_id": "5f59401f-6915-4faf-b830-e4d2780fc032",
        "short_number": 13,
        "pickup_at": "2026-10-27T19:16:43Z",
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
      "reserved_at": "2026-10-27T16:16:44.437111Z",
      "confirm_from": "2026-10-27T18:46:43Z",
      "confirm_until": "2026-10-27T18:56:43Z",
      "drop_until": "2026-10-27T18:16:43Z"
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
      "id": "d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5",
      "state": "RESERVED",
      "order": {
        "order_id": "5f59401f-6915-4faf-b830-e4d2780fc032",
        "short_number": 13,
        "pickup_at": "2026-10-27T19:16:43Z",
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
      "reserved_at": "2026-10-27T16:16:44.437111Z",
      "confirm_from": "2026-10-27T18:46:43Z",
      "confirm_until": "2026-10-27T18:56:43Z",
      "drop_until": "2026-10-27T18:16:43Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5/confirm` → **409**

```json
{
  "command_id": "ed34d4a1-1ab6-4902-b211-34eb74af25c4"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "33e62224-c6fd-4ddf-ac93-b46b37e0a174"
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
  "session_id": "fdfe323b-b514-49ee-9e4c-ebd76d44dfd5",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDQsImlhdCI6MTc5MzExNzgwNCwianRpIjoiNjc2OTJjNjYtN2NjNi00OWU3LWIzZjUtMzM0YWEyZGIwMGQ1Iiwic2lkIjoiZmRmZTMyM2ItYjUxNC00OWVlLTllNGMtZWJkNzZkNDRkZmQ1In0.RtFLx53eDKggVPuYBy_z7fngA-IhWcSd-5Fw-369Vaw",
  "access_expires_at": "2026-10-27T16:31:44.840764745Z",
  "refresh_token": "8c_e3cBdFp_KkfZ4-jYZHK6SxtEEdeOg5bSvpQUK3Fg",
  "refresh_expires_at": "2026-10-28T04:16:44.840241758Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5f59401f-6915-4faf-b830-e4d2780fc032` → **200**

```json
{
  "id": "5f59401f-6915-4faf-b830-e4d2780fc032",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d1d274d6-c38c-40b3-85b1-3f8327d1e722",
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
  "created_at": "2026-10-27T16:16:44.216489Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T19:16:43Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T16:16:44.437111Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5f59401f-6915-4faf-b830-e4d2780fc032/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T16:16:44.217954Z",
      "actor": {
        "type": "CLIENT",
        "id": "d1d274d6-c38c-40b3-85b1-3f8327d1e722",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5f59401f-6915-4faf-b830-e4d2780fc032",
        "preorder": true,
        "quote_id": "58284f1b-51fe-4eae-8766-73104dadeb1e",
        "pickup_at": "2026-10-27T19:16:43Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T16:16:44.438206Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5f59401f-6915-4faf-b830-e4d2780fc032",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5"
      }
    }
  ]
}
```

Done: pre-order 5f59401f-6915-4faf-b830-e4d2780fc032, reservation d3c6d963-ab4b-4f90-bf9b-71c4a4b719e5.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1746"
}
```

```json
{
  "challenge_id": "664f4cc9-ed33-4bd2-ae64-5069981dcf53",
  "expires_at": "2026-10-27T16:21:44.929919864Z",
  "resend_available_at": "2026-10-27T16:16:45.929919864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "866200",
  "sent_at": "2026-10-27T16:16:44.931898903Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "664f4cc9-ed33-4bd2-ae64-5069981dcf53",
  "code": "866200",
  "device_ref": "sandbox-1746"
}
```

```json
{
  "session_id": "0ec58097-3ae1-42bf-b1a2-2fd5e22cb4db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODcwNCwiaWF0IjoxNzkzMTE3ODA0LCJqdGkiOiI4YmM3ODY5NC00OGI0LTQ1MjctYmY0Yi0yNWY3MDM3MGFiNDMiLCJzaWQiOiIwZWM1ODA5Ny0zYWUxLTQyYmYtYjFhMi0yZmQ1ZTIyY2I0ZGIifQ.l8azSrj4M-Dev450zHqA156SDE2I-QS3qjUM5eE9ocI",
  "access_expires_at": "2026-10-27T16:31:44.984236076Z",
  "refresh_token": "6b1eJDpZfVPPsDIqQW9hXrj1CurGG5k5YOMphH_zvRQ",
  "refresh_expires_at": "2026-11-26T16:16:44.983757722Z",
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
  "command_id": "14c9d66d-5d25-4342-82a7-4108943bb82d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:45Z",
    "sequence": 1793117805330
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a",
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
  "last_heartbeat_at": "2026-10-27T16:16:45.050419Z",
  "last_location_at": "2026-10-27T16:16:45.050419Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672926529",
  "device_ref": "sandbox-21379"
}
```

```json
{
  "challenge_id": "cfb713b4-6f93-4fdc-94a4-90b31016cd18",
  "expires_at": "2026-10-27T16:21:45.083606829Z",
  "resend_available_at": "2026-10-27T16:16:46.083606829Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672926529` → **200**

```json
{
  "phone": "+380672926529",
  "audience": "CLIENT",
  "code": "767910",
  "sent_at": "2026-10-27T16:16:45.085586179Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfb713b4-6f93-4fdc-94a4-90b31016cd18",
  "code": "767910",
  "device_ref": "sandbox-21379"
}
```

```json
{
  "session_id": "65eee815-279f-4b53-8d39-29213caefdef",
  "subject": {
    "type": "CLIENT",
    "id": "53b270ca-0843-42de-95a0-d89ec2cb2742"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2IyNzBjYS0wODQzLTQyZGUtOTVhMC1kODllYzJjYjI3NDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NzA1LCJpYXQiOjE3OTMxMTc4MDUsImp0aSI6ImNmYWVjYTk1LWZlZTQtNGYzMi1hOTFiLTZmNzQxNTliNzFkYyIsInNpZCI6IjY1ZWVlODE1LTI3OWYtNGI1My04ZDM5LTI5MjEzY2FlZmRlZiJ9.dbwVH26T6NfnSVQnf0g0TFGxAn5g367uljoM-BpGZyM",
  "access_expires_at": "2026-10-27T16:31:45.138471546Z",
  "refresh_token": "12Zp3zjsa32-zeuZqquZbXWjvDzsoU7_KZm17DJ83nY",
  "refresh_expires_at": "2026-11-26T16:16:45.137917938Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "05f2053c-219c-464c-8532-3636bbc9fec8",
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
  "id": "9383f110-c9e6-417c-ba96-d06edce07104",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:21:45.173885Z",
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
  "command_id": "2727f761-19c7-4c7f-8ad1-4c768c18d89e",
  "quote_id": "9383f110-c9e6-417c-ba96-d06edce07104",
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
  "id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53b270ca-0843-42de-95a0-d89ec2cb2742",
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
  "created_at": "2026-10-27T16:16:45.208818Z",
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
    "id": "703ed0ce-609d-42b6-bdeb-c8f6f43f7908",
    "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
    "expires_at": "2026-10-27T16:17:00.21169Z",
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

`POST /api/driver/v1/offers/703ed0ce-609d-42b6-bdeb-c8f6f43f7908/accept` → **200**

```json
{
  "command_id": "f29accc9-1620-4eed-a534-6398f041d839"
}
```

```json
{
  "id": "02177dc9-4c5d-4d66-8f9f-6f735e682fa4",
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dbd50865-dfef-41a3-8853-15e7f16f1c2c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dbd50865-dfef-41a3-8853-15e7f16f1c2c",
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "assignment_id": "02177dc9-4c5d-4d66-8f9f-6f735e682fa4",
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

`POST /api/driver/v1/work-sessions/eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:45Z",
    "sequence": 1793117805331
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a",
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
  "last_heartbeat_at": "2026-10-27T16:16:45.330962Z",
  "last_location_at": "2026-10-27T16:16:45.330962Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dbd50865-dfef-41a3-8853-15e7f16f1c2c",
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "assignment_id": "02177dc9-4c5d-4d66-8f9f-6f735e682fa4",
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

`POST /api/driver/v1/trips/dbd50865-dfef-41a3-8853-15e7f16f1c2c/arrive` → **200**

```json
{
  "command_id": "85e91b3a-280d-4317-924e-59066882884c",
  "expected_version": 0
}
```

```json
{
  "id": "dbd50865-dfef-41a3-8853-15e7f16f1c2c",
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "assignment_id": "02177dc9-4c5d-4d66-8f9f-6f735e682fa4",
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
  "arrived_at": "2026-10-27T16:16:45.394551Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dbd50865-dfef-41a3-8853-15e7f16f1c2c/start` → **200**

```json
{
  "command_id": "de9e059d-19c4-4a1b-afdc-4689d179d4e1",
  "expected_version": 1
}
```

```json
{
  "id": "dbd50865-dfef-41a3-8853-15e7f16f1c2c",
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "assignment_id": "02177dc9-4c5d-4d66-8f9f-6f735e682fa4",
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
  "arrived_at": "2026-10-27T16:16:45.394551Z",
  "started_at": "2026-10-27T16:16:45.431691Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:45Z",
    "sequence": 1793117805454
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a",
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
  "last_heartbeat_at": "2026-10-27T16:16:45.472337Z",
  "last_location_at": "2026-10-27T16:16:45.472337Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/dbd50865-dfef-41a3-8853-15e7f16f1c2c/complete` → **200**

```json
{
  "command_id": "1784261d-3770-48b2-a620-d36d740d82b4",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:16:45Z",
  "cash_received": true
}
```

```json
{
  "id": "dbd50865-dfef-41a3-8853-15e7f16f1c2c",
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "assignment_id": "02177dc9-4c5d-4d66-8f9f-6f735e682fa4",
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
  "arrived_at": "2026-10-27T16:16:45.394551Z",
  "started_at": "2026-10-27T16:16:45.431691Z",
  "completed_at": "2026-10-27T16:16:45.503529Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/a1b2a10f-bc64-4d41-b34d-990b77ce4ddd/rating` → **200**

```json
{
  "command_id": "51b7228b-017f-4a14-a3f2-00475227fd06",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "score": 5,
  "created_at": "2026-10-27T16:16:45.55154296Z"
}
```

`POST /api/driver/v1/orders/a1b2a10f-bc64-4d41-b34d-990b77ce4ddd/rating` → **200**

```json
{
  "command_id": "1808dec4-3874-40be-903b-e1dea5864335",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
  "score": 4,
  "created_at": "2026-10-27T16:16:45.584995721Z"
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
  "session_id": "ff42aff4-0126-44e8-8186-2804ac53503e",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDUsImlhdCI6MTc5MzExNzgwNSwianRpIjoiZjIzODJkOGQtMzA5Zi00MzUzLThmZmUtMDg4OWE1NzNjYzhmIiwic2lkIjoiZmY0MmFmZjQtMDEyNi00NGU4LTgxODYtMjgwNGFjNTM1MDNlIn0.dMqN7wUM8yH4C-nFnTcSj2MM3XG0MDMhF1jTtP4677E",
  "access_expires_at": "2026-10-27T16:31:45.94068709Z",
  "refresh_token": "NmX8ItyfXEJ7HpJsLVDa4-00Tv4GmpFfW2KZdui5wDU",
  "refresh_expires_at": "2026-10-28T04:16:45.940086868Z",
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
  "session_id": "b7eb8745-53af-441c-bdbf-51d17348f267",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDYsImlhdCI6MTc5MzExNzgwNiwianRpIjoiZGVmNzU0ZTktYmY5NS00ZGFiLTljM2UtNDMwNjM5Y2QwNTQ1Iiwic2lkIjoiYjdlYjg3NDUtNTNhZi00NDFjLWJkYmYtNTFkMTczNDhmMjY3In0.YBVHXu-VWbFB5BZ7PCHcSs0pkE2PDHrqNeZm5rD57nU",
  "access_expires_at": "2026-10-27T16:31:46.262710526Z",
  "refresh_token": "lmlys0E3Tbq-b9jeN9Q9Kgz27zPL8yzx2-kT0RXGRZE",
  "refresh_expires_at": "2026-10-28T04:16:46.262190314Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a1b2a10f-bc64-4d41-b34d-990b77ce4ddd/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
      "author_type": "RIDER",
      "author_id": "53b270ca-0843-42de-95a0-d89ec2cb2742",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T16:16:45.551543Z"
    },
    {
      "order_id": "a1b2a10f-bc64-4d41-b34d-990b77ce4ddd",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "53b270ca-0843-42de-95a0-d89ec2cb2742",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T16:16:45.584996Z"
    }
  ]
}
```

Done: ratings for order a1b2a10f-bc64-4d41-b34d-990b77ce4ddd.

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
  "session_id": "b3371bda-4b04-4f98-a7c5-499adc47edea",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDYsImlhdCI6MTc5MzExNzgwNiwianRpIjoiM2EyZjg3NDctMjM5Zi00NzEyLWI1NmUtYmY0MTE5YmZkMzk1Iiwic2lkIjoiYjMzNzFiZGEtNGIwNC00Zjk4LWE3YzUtNDk5YWRjNDdlZGVhIn0.VK-DqRhJY-3EHS_36ZnkZWqfnGLCnjEqi6RKF0LojB4",
  "access_expires_at": "2026-10-27T16:31:46.627535051Z",
  "refresh_token": "L0iTYkxVS5GGXxhTHPBMzuYkDek-VRkVI0LXPUD8VNI",
  "refresh_expires_at": "2026-10-28T04:16:46.627022302Z",
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
  "command_id": "c360af0b-a001-4006-90e6-58307b7daf6f",
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
  "changed_by": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:16:46.69967Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "c360af0b-a001-4006-90e6-58307b7daf6f",
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
  "changed_by": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:16:46.69967Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48748360811",
  "device_ref": "sandbox-11155"
}
```

```json
{
  "challenge_id": "6f2be9e7-aa8b-4c17-8c9b-781ca7b6a5d5",
  "expires_at": "2026-10-27T16:21:46.775504394Z",
  "resend_available_at": "2026-10-27T16:16:47.775504394Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48748360811` → **200**

```json
{
  "phone": "+48748360811",
  "audience": "CLIENT",
  "code": "014246",
  "sent_at": "2026-10-27T16:16:46.777513955Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f2be9e7-aa8b-4c17-8c9b-781ca7b6a5d5",
  "code": "014246",
  "device_ref": "sandbox-11155"
}
```

```json
{
  "session_id": "e393b49a-1351-4281-bf4a-891bb5aab833",
  "subject": {
    "type": "CLIENT",
    "id": "937fdc01-2d23-4d85-923e-b150178ce9dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzdmZGMwMS0yZDIzLTRkODUtOTIzZS1iMTUwMTc4Y2U5ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NzA2LCJpYXQiOjE3OTMxMTc4MDYsImp0aSI6Ijc1OGExOWU5LTgzZWEtNDk3NS04OTA1LTcwN2IyODVmNTM0NCIsInNpZCI6ImUzOTNiNDlhLTEzNTEtNDI4MS1iZjRhLTg5MWJiNWFhYjgzMyJ9.a3rrQZFMdZOhFNBC2TwpjIaYAJqniW_Leuqo-9gAgGQ",
  "access_expires_at": "2026-10-27T16:31:46.830014182Z",
  "refresh_token": "FFoGzf_R27pVksN-Bwn99AUq067NDCodh_JX-r0Yg-0",
  "refresh_expires_at": "2026-11-26T16:16:46.829513657Z",
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
  "correlation_id": "d7bbc4c3-17ec-4848-9667-a07bc0c3c5a9"
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
  "device_ref": "sandbox-26312"
}
```

```json
{
  "challenge_id": "78a64009-a3b7-4e07-9364-96d4169247d2",
  "expires_at": "2026-10-27T16:21:46.90853346Z",
  "resend_available_at": "2026-10-27T16:16:47.90853346Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "366792",
  "sent_at": "2026-10-27T16:16:46.910530343Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78a64009-a3b7-4e07-9364-96d4169247d2",
  "code": "366792",
  "device_ref": "sandbox-26312"
}
```

```json
{
  "session_id": "6a1a12dc-ea0c-491c-801f-c3d4cb020db2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODcwNiwiaWF0IjoxNzkzMTE3ODA2LCJqdGkiOiIyYTNmMDI2ZC1jNmI3LTQ0OWUtODY2My0zODA0Y2U4MjdmZmUiLCJzaWQiOiI2YTFhMTJkYy1lYTBjLTQ5MWMtODAxZi1jM2Q0Y2IwMjBkYjIifQ.ILH4mGshIU5m1YIRbivCKL-IWCsQ2wnx1lD2GCj66VI",
  "access_expires_at": "2026-10-27T16:31:46.963659838Z",
  "refresh_token": "x3bcAH9DQIE-2NVZWYoNguhl77ONcaETKlw1Cy1XqqE",
  "refresh_expires_at": "2026-11-26T16:16:46.9630837Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3eba91c3-a40e-4012-a8eb-945d03a46b26",
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
  "last_heartbeat_at": "2026-10-27T16:16:44.369415Z",
  "last_location_at": "2026-10-27T16:16:44.369415Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3eba91c3-a40e-4012-a8eb-945d03a46b26/handover` → **200**

```json
{
  "command_id": "96b40e9e-438b-455d-9685-8cf90dd87202",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3eba91c3-a40e-4012-a8eb-945d03a46b26",
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
  "last_heartbeat_at": "2026-10-27T16:16:44.369415Z",
  "last_location_at": "2026-10-27T16:16:44.369415Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3eba91c3-a40e-4012-a8eb-945d03a46b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:47Z",
    "sequence": 1793117807469
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3eba91c3-a40e-4012-a8eb-945d03a46b26",
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
  "last_heartbeat_at": "2026-10-27T16:16:47.064833Z",
  "last_location_at": "2026-10-27T16:16:47.064833Z",
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
  "session_id": "3eba91c3-a40e-4012-a8eb-945d03a46b26",
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
  "last_heartbeat_at": "2026-10-27T16:16:47.064833Z",
  "last_location_at": "2026-10-27T16:16:47.064833Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3eba91c3-a40e-4012-a8eb-945d03a46b26/close` → **200**

```json
{
  "command_id": "10f8c296-574a-40cd-b996-c6a8dbd313bb",
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
  "correlation_id": "c6d11f97-4eb3-4cdb-9c38-e4b5716e41d4"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674404278",
  "device_ref": "sandbox-19733"
}
```

```json
{
  "challenge_id": "8c3ca49c-483b-4419-9d92-11d8f67d85b8",
  "expires_at": "2026-10-27T16:21:47.22198Z",
  "resend_available_at": "2026-10-27T16:16:48.22198Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674404278` → **200**

```json
{
  "phone": "+380674404278",
  "audience": "CLIENT",
  "code": "282316",
  "sent_at": "2026-10-27T16:16:47.224362964Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c3ca49c-483b-4419-9d92-11d8f67d85b8",
  "code": "282316",
  "device_ref": "sandbox-19733"
}
```

```json
{
  "session_id": "8bbadd45-58bf-4a23-98a7-d6d840f15268",
  "subject": {
    "type": "CLIENT",
    "id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDBlMWQwMC01NmQzLTQ3ZmUtOTg2Mi03MWIyYjI0ZjFmZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4NzA3LCJpYXQiOjE3OTMxMTc4MDcsImp0aSI6IjMyMWJkZmQxLWFhN2ItNGY2NS1hYmI0LWFhN2Q5MTBiNzRjMSIsInNpZCI6IjhiYmFkZDQ1LTU4YmYtNGEyMy05OGE3LWQ2ZDg0MGYxNTI2OCJ9.dX8UGUkxvdP9VzpbytYwFPCZ8GcJN5nVuXOLua5-ak8",
  "access_expires_at": "2026-10-27T16:31:47.276851396Z",
  "refresh_token": "unQPNoasSMNZCqdfNche40uF9kNZpH362YsVIsCez9Y",
  "refresh_expires_at": "2026-11-26T16:16:47.276303857Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "18784440-0bd2-4e8a-b830-847f209422c3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ed79763f-4f83-4bdd-8762-4d2918ea0a09",
  "upload_path": "/api/rider/v1/uploads/ed79763f-4f83-4bdd-8762-4d2918ea0a09",
  "expires_at": "2026-10-27T16:31:47.310989988Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/ed79763f-4f83-4bdd-8762-4d2918ea0a09` → **200**

```json
{
  "file_id": "ed79763f-4f83-4bdd-8762-4d2918ea0a09",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "7f9859b4-7616-4c79-a92d-23649421ed2a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "ed79763f-4f83-4bdd-8762-4d2918ea0a09"
  ]
}
```

```json
{
  "id": "7f916836-af63-4e45-97e7-d158eee7cc4f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:16:47.379513Z",
  "updated_at": "2026-10-27T16:16:47.379513Z",
  "messages": [
    {
      "id": "a1ca6e35-cf3a-4c0f-9947-20cbf5238642",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:16:47.380794Z",
      "attachments": [
        {
          "file_id": "ed79763f-4f83-4bdd-8762-4d2918ea0a09",
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
  "session_id": "764ef1b5-dcc5-4529-95ec-f4b40d3372cf",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDcsImlhdCI6MTc5MzExNzgwNywianRpIjoiOTc4NmZiYjEtNTAwMS00YmJkLWJkMmEtYjJhODE2Y2VhZWVmIiwic2lkIjoiNzY0ZWYxYjUtZGNjNS00NTI5LTk1ZWMtZjRiNDBkMzM3MmNmIn0.y62tj5L2b7642BLMant0guBB7UtTJfhocNmgVZd9PnQ",
  "access_expires_at": "2026-10-27T16:31:47.715596255Z",
  "refresh_token": "HQcORCgRK-ecMouL-1PFinA7ESzwJJhhnaatPKvK6_4",
  "refresh_expires_at": "2026-10-28T04:16:47.715037961Z",
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
  "session_id": "f90dcaf2-5a16-4d09-8ec6-f9e67a226822",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDgsImlhdCI6MTc5MzExNzgwOCwianRpIjoiZTNjYWUxMjktMzQzZS00OTNkLThjYmMtMmYwMTk2NmY4ZmE3Iiwic2lkIjoiZjkwZGNhZjItNWExNi00ZDA5LThlYzYtZjllNjdhMjI2ODIyIn0.0Azpys7kEJJ7aQf1eTOsTGdnX9Ye838vHZh8O48vEoc",
  "access_expires_at": "2026-10-27T16:31:48.041410773Z",
  "refresh_token": "UaAKp0QC_ewghReTlu9LRxXxwDDqKKjvmUW2hb_0yqU",
  "refresh_expires_at": "2026-10-28T04:16:48.040862458Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/7f916836-af63-4e45-97e7-d158eee7cc4f/attachments/ed79763f-4f83-4bdd-8762-4d2918ea0a09` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "4f3c6e51-388b-4f31-9ee2-f513849d5cfc",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e2eeae06-cca0-4928-84cd-6346a61fcae4",
  "upload_path": "/api/operator/v1/uploads/e2eeae06-cca0-4928-84cd-6346a61fcae4",
  "expires_at": "2026-10-27T16:31:48.092409436Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/e2eeae06-cca0-4928-84cd-6346a61fcae4` → **200**

```json
{
  "file_id": "e2eeae06-cca0-4928-84cd-6346a61fcae4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/7f916836-af63-4e45-97e7-d158eee7cc4f` → **200**

```json
{
  "id": "7f916836-af63-4e45-97e7-d158eee7cc4f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:16:47.379513Z",
  "updated_at": "2026-10-27T16:16:47.379513Z",
  "messages": [
    {
      "id": "a1ca6e35-cf3a-4c0f-9947-20cbf5238642",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:16:47.380794Z",
      "attachments": [
        {
          "file_id": "ed79763f-4f83-4bdd-8762-4d2918ea0a09",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/7f916836-af63-4e45-97e7-d158eee7cc4f/comments` → **200**

```json
{
  "command_id": "8651ed93-0c85-42c2-afca-9be5901f080c",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "e2eeae06-cca0-4928-84cd-6346a61fcae4"
  ]
}
```

```json
{
  "id": "7f916836-af63-4e45-97e7-d158eee7cc4f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:16:47.379513Z",
  "updated_at": "2026-10-27T16:16:48.187937Z",
  "messages": [
    {
      "id": "a1ca6e35-cf3a-4c0f-9947-20cbf5238642",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:16:47.380794Z",
      "attachments": [
        {
          "file_id": "ed79763f-4f83-4bdd-8762-4d2918ea0a09",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3b2fed12-c160-4e58-a991-8b50a1696615",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e711b497-416a-4dd7-ab4f-3164e27a2e14",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:16:48.187623Z",
      "attachments": [
        {
          "file_id": "e2eeae06-cca0-4928-84cd-6346a61fcae4",
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

`GET /api/rider/v1/support/cases/7f916836-af63-4e45-97e7-d158eee7cc4f` → **200**

```json
{
  "id": "7f916836-af63-4e45-97e7-d158eee7cc4f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:16:47.379513Z",
  "updated_at": "2026-10-27T16:16:48.187937Z",
  "messages": [
    {
      "id": "a1ca6e35-cf3a-4c0f-9947-20cbf5238642",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "300e1d00-56d3-47fe-9862-71b2b24f1fe6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:16:47.380794Z",
      "attachments": [
        {
          "file_id": "ed79763f-4f83-4bdd-8762-4d2918ea0a09",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3b2fed12-c160-4e58-a991-8b50a1696615",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:16:48.187623Z",
      "attachments": [
        {
          "file_id": "e2eeae06-cca0-4928-84cd-6346a61fcae4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/7f916836-af63-4e45-97e7-d158eee7cc4f/attachments/e2eeae06-cca0-4928-84cd-6346a61fcae4` → **200**

Done: support case 7f916836-af63-4e45-97e7-d158eee7cc4f, rider attachment ed79763f-4f83-4bdd-8762-4d2918ea0a09, operator attachment e2eeae06-cca0-4928-84cd-6346a61fcae4.

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
  "session_id": "4230d3ac-c2f7-44e0-808f-0127e5e12907",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDgsImlhdCI6MTc5MzExNzgwOCwianRpIjoiZjkwZGM5ODctOTFjYy00YmY2LTk1NDEtMWM1YTY3NTVjOWRiIiwic2lkIjoiNDIzMGQzYWMtYzJmNy00NGUwLTgwOGYtMDEyN2U1ZTEyOTA3In0.BZbnT8iTOqR9vBnKdpKUVEc5WYtddM_C5mZjtEgLWGs",
  "access_expires_at": "2026-10-27T16:31:48.570994245Z",
  "refresh_token": "vvgdRSglI1Yn31Q_kTNL0gyW4KhRgGJ6vu1YcmedZMw",
  "refresh_expires_at": "2026-10-28T04:16:48.570484703Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17989"
}
```

```json
{
  "challenge_id": "844ca7c7-8dcf-46a3-9235-e96204649d41",
  "expires_at": "2026-10-27T16:21:48.597603311Z",
  "resend_available_at": "2026-10-27T16:16:49.597603311Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "885322",
  "sent_at": "2026-10-27T16:16:48.599443033Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "844ca7c7-8dcf-46a3-9235-e96204649d41",
  "code": "885322",
  "device_ref": "sandbox-17989"
}
```

```json
{
  "session_id": "bc0de5bc-0d65-405d-aad4-2dcca0e1624d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODcwOCwiaWF0IjoxNzkzMTE3ODA4LCJqdGkiOiIwMjQ1YjNkNC00MWNlLTQxZmItYWYzMy03NGZjOTViZGYwMDIiLCJzaWQiOiJiYzBkZTViYy0wZDY1LTQwNWQtYWFkNC0yZGNjYTBlMTYyNGQifQ.gXkHNVlM-lfLdTni7i3kD0P_ZsKdd-KGjKZBUGQFIgg",
  "access_expires_at": "2026-10-27T16:31:48.652354806Z",
  "refresh_token": "MLCb8z3pzTaWi5cAsJTf45jdgF7DI5YDzFrVC7W2rvY",
  "refresh_expires_at": "2026-11-26T16:16:48.651750409Z",
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
  "version": 3,
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
    "version": 3,
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

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "8437fa0a-bdd1-47fb-8a09-389d763918c7",
  "expected_version": 3,
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
  "version": 4,
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
  "device_ref": "sandbox-22705"
}
```

```json
{
  "challenge_id": "d0fcbe9d-4608-4ed2-903e-553aee301a4d",
  "expires_at": "2026-10-27T16:21:48.778618459Z",
  "resend_available_at": "2026-10-27T16:16:49.778618459Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "084446",
  "sent_at": "2026-10-27T16:16:48.780516677Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0fcbe9d-4608-4ed2-903e-553aee301a4d",
  "code": "084446",
  "device_ref": "sandbox-22705"
}
```

```json
{
  "session_id": "586377e0-6f9e-45b1-9cc4-2cf822ab387b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODcwOCwiaWF0IjoxNzkzMTE3ODA4LCJqdGkiOiIyNDgyMTY4ZC1jYmI0LTRlYmMtODA1Yy1lYjJmZTA0MDgyNGEiLCJzaWQiOiI1ODYzNzdlMC02ZjllLTQ1YjEtOWNjNC0yY2Y4MjJhYjM4N2IifQ.sRwd9JXKN-igREurfXHwRD9BcUYafWhpWE9yeOFNyKw",
  "access_expires_at": "2026-10-27T16:31:48.833671296Z",
  "refresh_token": "297UhCSQiHJZ6lRhKtK8ve4RtBzxT0PS9PY3RAvBGy4",
  "refresh_expires_at": "2026-11-26T16:16:48.833125727Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a",
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
  "last_heartbeat_at": "2026-10-27T16:16:45.472337Z",
  "last_location_at": "2026-10-27T16:16:45.472337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a/handover` → **200**

```json
{
  "command_id": "2df86fb5-109b-48fc-ae86-df2f3b587f38",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a",
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
  "last_heartbeat_at": "2026-10-27T16:16:45.472337Z",
  "last_location_at": "2026-10-27T16:16:45.472337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:48Z",
    "sequence": 1793117808914
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a",
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
  "last_heartbeat_at": "2026-10-27T16:16:48.932601Z",
  "last_location_at": "2026-10-27T16:16:48.932601Z",
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
  "command_id": "c04bd308-3aa5-4d18-bd59-47fba20753a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:48Z",
    "sequence": 1793117808983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e9f9db44-3a13-4d4f-a3fb-d4be5381f12a",
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
  "last_heartbeat_at": "2026-10-27T16:16:49.000978Z",
  "last_location_at": "2026-10-27T16:16:49.000978Z",
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
  "session_id": "282f8c4f-c535-4e94-a60e-2933565c6b03",
  "subject": {
    "type": "STAFF",
    "id": "e711b497-416a-4dd7-ab4f-3164e27a2e14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzExYjQ5Ny00MTZhLTRkZDctYWI0Zi0zMTY0ZTI3YTJlMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTg3MDksImlhdCI6MTc5MzExNzgwOSwianRpIjoiYjM1OTM1ODAtZGZiMi00ZjQxLWI4ZTAtMjlkMDg4ODVlZmE5Iiwic2lkIjoiMjgyZjhjNGYtYzUzNS00ZTk0LWE2MGUtMjkzMzU2NWM2YjAzIn0.4uvPi_ef28s3CqmP67S1ZKxQkk93TYjSWSZAefmsv9U",
  "access_expires_at": "2026-10-27T16:31:49.322717441Z",
  "refresh_token": "Kef7_PzW3KGq-6aGJXzBPiUnz7jjUBdTXDJQIwSIXyg",
  "refresh_expires_at": "2026-10-28T04:16:49.322110155Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8076da48-6071-4e8b-a392-b574771ada1d",
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
  "id": "429ebe82-643f-4ddc-806b-25fbae0741e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:21:49.353811Z",
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
  "command_id": "3bbe214e-b5f8-42c8-a4bf-8613ca97ddf8",
  "quote_id": "429ebe82-643f-4ddc-806b-25fbae0741e1",
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
  "id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
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
  "created_at": "2026-10-27T16:16:49.390353Z",
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
    "id": "5f05028c-79a3-4f44-bd41-a9ee55067d8a",
    "order_id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
    "expires_at": "2026-10-27T16:17:04.39369Z",
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

`POST /api/driver/v1/offers/5f05028c-79a3-4f44-bd41-a9ee55067d8a/accept` → **200**

```json
{
  "command_id": "7d76fc39-ea5c-4b0f-bf29-9a3dda5973c9"
}
```

```json
{
  "id": "2763a053-8457-40ef-a711-a0cb0e8a8141",
  "order_id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f1aac704-1297-48c8-b92c-e33d9100ce25",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f1aac704-1297-48c8-b92c-e33d9100ce25",
  "order_id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
  "assignment_id": "2763a053-8457-40ef-a711-a0cb0e8a8141",
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

`POST /api/driver/v1/work-sessions/e9f9db44-3a13-4d4f-a3fb-d4be5381f12a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:16:49Z",
    "sequence": 1793117809519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e9f9db44-3a13-4d4f-a3fb-d4be5381f12a",
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
  "last_heartbeat_at": "2026-10-27T16:16:49.537204Z",
  "last_location_at": "2026-10-27T16:16:49.537204Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f1aac704-1297-48c8-b92c-e33d9100ce25/arrive` → **200**

```json
{
  "command_id": "504ce33f-c532-493e-9118-3a736aa1cea7",
  "expected_version": 0
}
```

```json
{
  "id": "f1aac704-1297-48c8-b92c-e33d9100ce25",
  "order_id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
  "assignment_id": "2763a053-8457-40ef-a711-a0cb0e8a8141",
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
  "arrived_at": "2026-10-27T16:16:49.57179Z",
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

`POST /api/driver/v1/trips/f1aac704-1297-48c8-b92c-e33d9100ce25/start` → **200**

```json
{
  "command_id": "b5f3a281-a673-4c25-904c-0ac5b8f02ec2",
  "expected_version": 1
}
```

```json
{
  "id": "f1aac704-1297-48c8-b92c-e33d9100ce25",
  "order_id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
  "assignment_id": "2763a053-8457-40ef-a711-a0cb0e8a8141",
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
  "arrived_at": "2026-10-27T16:16:49.57179Z",
  "started_at": "2026-10-27T16:16:49.610226Z",
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

`POST /api/driver/v1/trips/f1aac704-1297-48c8-b92c-e33d9100ce25/complete` → **200**

```json
{
  "command_id": "469ca623-661b-4c6c-967d-11c78f704904",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:16:49Z",
  "cash_received": true
}
```

```json
{
  "id": "f1aac704-1297-48c8-b92c-e33d9100ce25",
  "order_id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
  "assignment_id": "2763a053-8457-40ef-a711-a0cb0e8a8141",
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
  "arrived_at": "2026-10-27T16:16:49.57179Z",
  "started_at": "2026-10-27T16:16:49.610226Z",
  "completed_at": "2026-10-27T16:16:49.6519Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/cbd93e37-6a88-41be-89ee-e4f01d4fec70` → **200**

```json
{
  "id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
  "short_number": 15,
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
    "id": "2763a053-8457-40ef-a711-a0cb0e8a8141",
    "order_id": "cbd93e37-6a88-41be-89ee-e4f01d4fec70",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f1aac704-1297-48c8-b92c-e33d9100ce25",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:16:49.390353Z",
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
  "session_id": "eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a",
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
  "last_heartbeat_at": "2026-10-27T16:16:48.932601Z",
  "last_location_at": "2026-10-27T16:16:48.932601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eccc5a5f-bef7-4602-9dc6-e7ee149a4a4a/close` → **200**

```json
{
  "command_id": "4fe7334c-c8b2-47db-9527-89674cfd8cfa",
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
  "session_id": "e9f9db44-3a13-4d4f-a3fb-d4be5381f12a",
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
  "last_heartbeat_at": "2026-10-27T16:16:49.537204Z",
  "last_location_at": "2026-10-27T16:16:49.537204Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9f9db44-3a13-4d4f-a3fb-d4be5381f12a/close` → **200**

```json
{
  "command_id": "99c12a0b-4542-4dbf-92a5-1ef63fcb9618",
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

Done: terminal order cbd93e37-6a88-41be-89ee-e4f01d4fec70 by Andrii (5a000000-0000-4000-8000-000000000403).
