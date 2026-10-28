# Sandbox transcript (2026-10-28T08:11:33Z, 743a115)

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
  "correlation_id": "ca80620b-41b0-460f-ac67-130af5809cd2"
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
  "session_id": "45fe9199-7422-4739-9b66-5c94cce11833",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU5OTQsImlhdCI6MTc5MzE3NTA5NCwianRpIjoiOGMyZDI5ZjAtOThlYy00NDRlLTgxZTYtOWEzZDg0NGRkYWE2Iiwic2lkIjoiNDVmZTkxOTktNzQyMi00NzM5LTliNjYtNWM5NGNjZTExODMzIn0.o2hfAKJKxKKzwmx8zm0-g7P9d0viHq0bFIBpKxc23U4",
  "access_expires_at": "2026-10-28T08:26:34.240306676Z",
  "refresh_token": "H4E9lrHdHI2KgqDIU9zn8inRbsa9Xg770vN_eiYxznQ",
  "refresh_expires_at": "2026-10-28T20:11:34.238404968Z",
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
  "session_id": "b9838a66-843b-4f72-8d64-b3b93e9da41e",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU5OTUsImlhdCI6MTc5MzE3NTA5NSwianRpIjoiMTFkOTU3NTMtYWY5Yy00YTUyLTgwYzAtZmI2NTRiNjZkOTMyIiwic2lkIjoiYjk4MzhhNjYtODQzYi00ZjcyLThkNjQtYjNiOTNlOWRhNDFlIn0.9Nkq9LoLcfdA_DUfSzaPeX5fcJBhnSuTTUrhk6aFiCQ",
  "access_expires_at": "2026-10-28T08:26:35.320807053Z",
  "refresh_token": "PZ3LreppstM1TFhap6ZHeEN7oisQ7mNTSybs6EiHKlk",
  "refresh_expires_at": "2026-10-28T20:11:35.319852873Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "dff61c4f-9251-49dc-ac87-8547ca8fb749",
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
  "id": "736e4632-fd11-47b0-bc1c-2311d8d5038f",
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
  "created_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "created_at": "2026-10-28T08:11:35.39494Z",
  "updated_at": "2026-10-28T08:11:35.39494Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634551580",
  "device_ref": "sandbox-9815"
}
```

```json
{
  "challenge_id": "2b85681f-d850-418e-a986-99e3c4d4d53e",
  "expires_at": "2026-10-28T08:16:35.632016301Z",
  "resend_available_at": "2026-10-28T08:11:36.632016301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634551580` → **200**

```json
{
  "phone": "+380634551580",
  "audience": "CLIENT",
  "code": "118899",
  "sent_at": "2026-10-28T08:11:35.63897409Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b85681f-d850-418e-a986-99e3c4d4d53e",
  "code": "118899",
  "device_ref": "sandbox-9815"
}
```

```json
{
  "session_id": "fa162189-5374-4368-b8ac-c76957e2c4dd",
  "subject": {
    "type": "CLIENT",
    "id": "b5218c0b-3c9f-4fef-9798-44dd128057fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTIxOGMwYi0zYzlmLTRmZWYtOTc5OC00NGRkMTI4MDU3ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1OTk1LCJpYXQiOjE3OTMxNzUwOTUsImp0aSI6ImE5MjllODllLTlkNDQtNDUyOC1iOGNlLTlkODdhZDdkZjFlNSIsInNpZCI6ImZhMTYyMTg5LTUzNzQtNDM2OC1iOGFjLWM3Njk1N2UyYzRkZCJ9.sfrQE_eoZY33dawJ1qSGaWMso5WhX4OUOYjtJGCaxRg",
  "access_expires_at": "2026-10-28T08:26:35.723267019Z",
  "refresh_token": "IToU2e-Dfw5wlZCYZ7X3j3ViUMq0aMS6vTPKOjPQPIY",
  "refresh_expires_at": "2026-11-27T08:11:35.722055231Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634551580` → **200**

```json
{
  "client_id": "b5218c0b-3c9f-4fef-9798-44dd128057fe"
}
```

`POST /api/admin/v1/rider-wallets/b5218c0b-3c9f-4fef-9798-44dd128057fe/top-ups` → **201**

```json
{
  "command_id": "33ed89ea-2ea9-4ff0-b1a7-e1327a6beaf5",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b5218c0b-3c9f-4fef-9798-44dd128057fe",
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
      "id": "5ca150dc-9cc7-45ae-a93b-6fd312585cc8",
      "at": "2026-10-28T08:11:35.803163Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c5adeca-1899-4754-9fea-54b336d6c482",
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
  "id": "0f7501ce-3c16-4468-ba87-77b27fa0e80c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:16:35.932156Z",
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
      "id": "736e4632-fd11-47b0-bc1c-2311d8d5038f",
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
  "device_ref": "sandbox-30530"
}
```

```json
{
  "challenge_id": "644c5359-bc49-49f4-992a-aaac07e8eeb7",
  "expires_at": "2026-10-28T08:16:35.985225342Z",
  "resend_available_at": "2026-10-28T08:11:36.985225342Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "112202",
  "sent_at": "2026-10-28T08:11:35.988844912Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "644c5359-bc49-49f4-992a-aaac07e8eeb7",
  "code": "112202",
  "device_ref": "sandbox-30530"
}
```

```json
{
  "session_id": "467ac24d-aec6-49cd-a1f2-5ffa656f3b0f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTk5NiwiaWF0IjoxNzkzMTc1MDk2LCJqdGkiOiI3NDQ0YzBlZi0wMTMyLTRmYWMtODBmZC1lY2E5Njc0NjA4ZjEiLCJzaWQiOiI0NjdhYzI0ZC1hZWM2LTQ5Y2QtYTFmMi01ZmZhNjU2ZjNiMGYifQ.wgRzZ5MY3HNhHCr0Ra0BRUpyqSG6s5acjxf7vONkHcg",
  "access_expires_at": "2026-10-28T08:26:36.04417324Z",
  "refresh_token": "lfBEmqfxi_g-eN3cv_y8-XuRwOpWf1YU781gNx4hmOA",
  "refresh_expires_at": "2026-11-27T08:11:36.043356785Z",
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
  "command_id": "d35becd5-cc5c-44df-b098-a8d4f52a68c3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:11:36Z",
    "sequence": 1793175096102
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f817e1ae-1ea9-48a5-808a-af684002bb75",
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
  "last_heartbeat_at": "2026-10-28T08:11:36.139684Z",
  "last_location_at": "2026-10-28T08:11:36.139684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "09e7646e-d016-4f5d-9eed-3c1a5923e821",
  "quote_id": "0f7501ce-3c16-4468-ba87-77b27fa0e80c",
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
  "id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b5218c0b-3c9f-4fef-9798-44dd128057fe",
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
  "created_at": "2026-10-28T08:11:36.216628Z",
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
  "client_id": "b5218c0b-3c9f-4fef-9798-44dd128057fe",
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
      "id": "5ca150dc-9cc7-45ae-a93b-6fd312585cc8",
      "at": "2026-10-28T08:11:35.803163Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
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
    "id": "e00093a0-8241-4984-b2e7-089847b037fa",
    "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
    "expires_at": "2026-10-28T08:11:51.228069Z",
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

`POST /api/driver/v1/offers/e00093a0-8241-4984-b2e7-089847b037fa/accept` → **200**

```json
{
  "command_id": "1ff13fba-2efe-4677-a7b6-abb4f81f7955"
}
```

```json
{
  "id": "1e905327-065d-47cc-8f71-7754f2ffc069",
  "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7",
  "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
  "assignment_id": "1e905327-065d-47cc-8f71-7754f2ffc069",
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

`POST /api/driver/v1/work-sessions/f817e1ae-1ea9-48a5-808a-af684002bb75/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:11:36Z",
    "sequence": 1793175096389
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f817e1ae-1ea9-48a5-808a-af684002bb75",
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
  "last_heartbeat_at": "2026-10-28T08:11:36.411524Z",
  "last_location_at": "2026-10-28T08:11:36.411524Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7/arrive` → **200**

```json
{
  "command_id": "4a12e4b0-dca8-45ec-aeee-c8daa9d50a79",
  "expected_version": 0
}
```

```json
{
  "id": "82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7",
  "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
  "assignment_id": "1e905327-065d-47cc-8f71-7754f2ffc069",
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
  "arrived_at": "2026-10-28T08:11:36.454156Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7/start` → **200**

```json
{
  "command_id": "92fa6078-cfaf-4f03-bc3c-0101e6a1510d",
  "expected_version": 1
}
```

```json
{
  "id": "82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7",
  "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
  "assignment_id": "1e905327-065d-47cc-8f71-7754f2ffc069",
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
  "arrived_at": "2026-10-28T08:11:36.454156Z",
  "started_at": "2026-10-28T08:11:36.494834Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7/complete` → **200**

```json
{
  "command_id": "1d036f44-747d-458b-9f6f-0f8998fd4330",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:11:36Z",
  "cash_received": true
}
```

```json
{
  "id": "82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7",
  "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
  "assignment_id": "1e905327-065d-47cc-8f71-7754f2ffc069",
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
  "arrived_at": "2026-10-28T08:11:36.454156Z",
  "started_at": "2026-10-28T08:11:36.494834Z",
  "completed_at": "2026-10-28T08:11:36.55339Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b5218c0b-3c9f-4fef-9798-44dd128057fe",
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
      "id": "3deb7393-6ee0-4bc0-b04e-c02ee1994db5",
      "at": "2026-10-28T08:11:37.191362Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f"
    },
    {
      "id": "5ca150dc-9cc7-45ae-a93b-6fd312585cc8",
      "at": "2026-10-28T08:11:35.803163Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/736e4632-fd11-47b0-bc1c-2311d8d5038f/archive` → **200**

```json
{
  "command_id": "035946e3-3de5-4901-8196-671e462aa81f",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "736e4632-fd11-47b0-bc1c-2311d8d5038f",
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
  "created_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "created_at": "2026-10-28T08:11:35.39494Z",
  "updated_at": "2026-10-28T08:11:39.637059Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f817e1ae-1ea9-48a5-808a-af684002bb75",
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
  "last_heartbeat_at": "2026-10-28T08:11:36.411524Z",
  "last_location_at": "2026-10-28T08:11:36.411524Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f817e1ae-1ea9-48a5-808a-af684002bb75/close` → **200**

```json
{
  "command_id": "b8ddea69-7a65-487c-9981-ebecfea21656",
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

Done: order f968a2c0-7b56-4666-8795-5c8338e4a78f.

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
  "session_id": "ff360cb5-142c-4b2a-8a36-8e9a28c76c13",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU5OTksImlhdCI6MTc5MzE3NTA5OSwianRpIjoiNmYzMWUwOTgtZDQ2My00MDVmLWExZWItMTlhYTU2NDg5YjdmIiwic2lkIjoiZmYzNjBjYjUtMTQyYy00YjJhLThhMzYtOGU5YTI4Yzc2YzEzIn0.Tk0CThJRxAk9yc4jOFzzEI7UqAzAqc0BGnSfp_KJmRk",
  "access_expires_at": "2026-10-28T08:26:39.960606993Z",
  "refresh_token": "rvAjwStovKQC26kDcHIqLFvDJ99XxPrPWmvthZJzEHU",
  "refresh_expires_at": "2026-10-28T20:11:39.959977625Z",
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
  "command_id": "03f6c361-c4a2-4279-929c-9e42c242a8d3",
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
  "session_id": "4d0fdb8e-c9e2-4d7d-9f25-4094a58b0418",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMDAsImlhdCI6MTc5MzE3NTEwMCwianRpIjoiODg2MzkzMjAtYzhiNy00MWEwLWFmNTQtYTQwMmQ3ZWJhZjBjIiwic2lkIjoiNGQwZmRiOGUtYzllMi00ZDdkLTlmMjUtNDA5NGE1OGIwNDE4In0.auFU5zZNHlP8-y4emTRl1aFj8itDSlsO1QuHM_il5Qw",
  "access_expires_at": "2026-10-28T08:26:40.282480655Z",
  "refresh_token": "1aMf_VD5M32XhW5GzhKgGqhtbG0VsA7b4DuyUO2cu44",
  "refresh_expires_at": "2026-10-28T20:11:40.281918949Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.123222885",
    "linkedid": "1730052700.123222885",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675393801"
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
    "id": "1730052700.123222885",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "438e9e75-5c5e-43e3-b7c9-3fd3a05aae45",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675393801",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:11:40.320483Z",
      "answered_at": null,
      "ended_at": "2026-10-28T08:11:40.342911Z",
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
    "id": "1730052600.1847416531",
    "linkedid": "1730052600.1847416531",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675393801"
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
      "id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675393801",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:11:40.402993Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/00cd80c0-56e6-4072-8485-61239135ebc6/answer` → **200**

```json
{
  "command_id": "481647c7-3886-4c85-9bcc-4ce2c524894a"
}
```

```json
{
  "id": "00cd80c0-56e6-4072-8485-61239135ebc6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675393801",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "order_ids": [],
  "started_at": "2026-10-28T08:11:40.402993Z",
  "answered_at": "2026-10-28T08:11:40.460974Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1847416531",
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
    "id": "1730052600.1847416531",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675393801",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [],
      "started_at": "2026-10-28T08:11:40.402993Z",
      "answered_at": "2026-10-28T08:11:40.460974Z",
      "ended_at": "2026-10-28T08:11:40.506364Z",
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
      "id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675393801",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [],
      "started_at": "2026-10-28T08:11:40.402993Z",
      "answered_at": "2026-10-28T08:11:40.460974Z",
      "ended_at": "2026-10-28T08:11:40.506364Z",
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
      "id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675393801",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [],
      "started_at": "2026-10-28T08:11:40.402993Z",
      "answered_at": "2026-10-28T08:11:40.460974Z",
      "ended_at": "2026-10-28T08:11:40.506364Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:11:43.032798Z"
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
      "id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675393801",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [],
      "started_at": "2026-10-28T08:11:40.402993Z",
      "answered_at": "2026-10-28T08:11:40.460974Z",
      "ended_at": "2026-10-28T08:11:40.506364Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:11:43.032798Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/00cd80c0-56e6-4072-8485-61239135ebc6/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/00cd80c0-56e6-4072-8485-61239135ebc6/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=00cd80c0-56e6-4072-8485-61239135ebc6` → **200**

```json
{
  "changes": [
    {
      "id": "b9d68ffe-76bd-44cc-a6e4-f8681c92435b",
      "occurred_at": "2026-10-28T08:11:44.674512Z",
      "actor_type": "STAFF",
      "actor_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"473078e0-3d61-4043-a2b3-0d77e5c35736\", \"order_ids\": []}",
      "correlation_id": "204080f4-eafe-405a-abee-fc4693102b43"
    },
    {
      "id": "52e6af66-b2e7-4d21-bdd6-b91f260cd1ba",
      "occurred_at": "2026-10-28T08:11:44.644797Z",
      "actor_type": "STAFF",
      "actor_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"473078e0-3d61-4043-a2b3-0d77e5c35736\", \"order_ids\": []}",
      "correlation_id": "8b32dd8c-34c9-4043-8387-d2262af6a6c6"
    }
  ]
}
```

Done: call 00cd80c0-56e6-4072-8485-61239135ebc6 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630708825",
  "device_ref": "sandbox-23007"
}
```

```json
{
  "challenge_id": "0969344f-e8d1-49d7-b8f7-8016801275bc",
  "expires_at": "2026-10-28T08:16:44.741119084Z",
  "resend_available_at": "2026-10-28T08:11:45.741119084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630708825` → **200**

```json
{
  "phone": "+380630708825",
  "audience": "CLIENT",
  "code": "776475",
  "sent_at": "2026-10-28T08:11:44.743657561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0969344f-e8d1-49d7-b8f7-8016801275bc",
  "code": "776475",
  "device_ref": "sandbox-23007"
}
```

```json
{
  "session_id": "0db53bc7-d0e2-430d-872f-95eeaabb3fe7",
  "subject": {
    "type": "CLIENT",
    "id": "9ebac318-3ba2-4568-93cc-776611892917"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWJhYzMxOC0zYmEyLTQ1NjgtOTNjYy03NzY2MTE4OTI5MTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDA0LCJpYXQiOjE3OTMxNzUxMDQsImp0aSI6IjM2ODAxYTNiLTk3ZGEtNDgxYi1iY2Q5LTY1YTNlODJkMjI1OSIsInNpZCI6IjBkYjUzYmM3LWQwZTItNDMwZC04NzJmLTk1ZWVhYWJiM2ZlNyJ9.qPph-VIbgth9s-oKLU8ZLb-xEyIV9efnbRk41Yiwd5A",
  "access_expires_at": "2026-10-28T08:26:44.794141341Z",
  "refresh_token": "Jq8fyH9bwuduyaWkN14FjZJ2ey6HuVYuq4FCvTiEzoE",
  "refresh_expires_at": "2026-11-27T08:11:44.793623464Z",
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
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport"
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
  "device_ref": "sandbox-11053"
}
```

```json
{
  "challenge_id": "fd6ad75f-d6da-4827-a7d7-ee204db14fd7",
  "expires_at": "2026-10-28T08:16:44.844410898Z",
  "resend_available_at": "2026-10-28T08:11:45.844410898Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "020452",
  "sent_at": "2026-10-28T08:11:44.847472365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd6ad75f-d6da-4827-a7d7-ee204db14fd7",
  "code": "020452",
  "device_ref": "sandbox-11053"
}
```

```json
{
  "session_id": "3abf3151-d03d-41a4-bd81-f34dc240240d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAwNCwiaWF0IjoxNzkzMTc1MTA0LCJqdGkiOiI3YjRhNjUyYy1iNTdiLTRiZDAtODQxZC1mMDJkMjc5M2M4YmYiLCJzaWQiOiIzYWJmMzE1MS1kMDNkLTQxYTQtYmQ4MS1mMzRkYzI0MDI0MGQifQ.0_f--0EbCVIUWeRcDNUk_JXkbN1MbAUTeXNYSgE2-cY",
  "access_expires_at": "2026-10-28T08:26:44.899490324Z",
  "refresh_token": "FchgV2gm4L_gECt7C1NqjpZlDJbZ6VBVD7MgUwf00Lw",
  "refresh_expires_at": "2026-11-27T08:11:44.898943518Z",
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
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup"
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
  "session_id": "c0083dd3-e079-44a7-8d58-7b1541816b1d",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMDUsImlhdCI6MTc5MzE3NTEwNSwianRpIjoiYWM1ZGRkZDgtNGYwZC00OGQyLTgzNzQtYzg5ZWY0NzI4YjBmIiwic2lkIjoiYzAwODNkZDMtZTA3OS00NGE3LThkNTgtN2IxNTQxODE2YjFkIn0.Sm17VjIKRCOfn3Fi9N11rUe5V1P5dMGy4_UViZhoNno",
  "access_expires_at": "2026-10-28T08:26:45.151569799Z",
  "refresh_token": "c6Bxc7xSfkVixCzfJ_x9g01KSQyY9EVA8HolwxEYpfE",
  "refresh_expires_at": "2026-10-28T20:11:45.151085447Z",
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
  "session_id": "d628b158-9afd-4f91-bef0-b759017a99ac",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMDUsImlhdCI6MTc5MzE3NTEwNSwianRpIjoiZmMyMDkxMjItNGQ4ZS00MDlkLTlkYzktMjg3M2ZmNjQ4ZjJhIiwic2lkIjoiZDYyOGIxNTgtOWFmZC00ZjkxLWJlZjAtYjc1OTAxN2E5OWFjIn0.5x7CM4UcfofWCfrgKFdAU0ETr9WSWXJS2_LfPbhbmfU",
  "access_expires_at": "2026-10-28T08:26:45.381280627Z",
  "refresh_token": "_HWizjmeE1bwSIWYl9DUmm-EkkI7S8kntXC5iQi31K4",
  "refresh_expires_at": "2026-10-28T20:11:45.380705452Z",
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
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident"
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
  "command_id": "8e94b26c-73ca-47be-8cd3-cdedee3f65b9",
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
  "id": "363cfdfb-6143-45e2-85a4-e3c7461f21cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:16:45.435750Z",
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
  "command_id": "49059090-6d99-4354-9845-e84204cba00f",
  "quote_id": "363cfdfb-6143-45e2-85a4-e3c7461f21cf",
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
  "id": "9e9a0380-06b7-4d16-a040-3f3b6b8d5d82",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ebac318-3ba2-4568-93cc-776611892917",
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
  "created_at": "2026-10-28T08:11:45.47117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/9e9a0380-06b7-4d16-a040-3f3b6b8d5d82` → **200**

```json
{
  "id": "9e9a0380-06b7-4d16-a040-3f3b6b8d5d82",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ebac318-3ba2-4568-93cc-776611892917",
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
  "created_at": "2026-10-28T08:11:45.47117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9e9a0380-06b7-4d16-a040-3f3b6b8d5d82/cancel` → **200**

```json
{
  "command_id": "7302af05-44de-4ef9-9891-5a1f8c00fe75",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9e9a0380-06b7-4d16-a040-3f3b6b8d5d82",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9ebac318-3ba2-4568-93cc-776611892917",
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
  "created_at": "2026-10-28T08:11:45.47117Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long"
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
  "command_id": "e3bb1a3c-8734-4d98-a2fe-d1fbaf825d07",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:11:45Z",
    "sequence": 1793175105593
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0795ca0-26a8-4b53-90b9-77c900c025ef",
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
  "last_heartbeat_at": "2026-10-28T08:11:45.611174Z",
  "last_location_at": "2026-10-28T08:11:45.611174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12880"
}
```

```json
{
  "challenge_id": "4fd366c7-5619-49d8-8774-e6c30a84a6d8",
  "expires_at": "2026-10-28T08:16:45.639325913Z",
  "resend_available_at": "2026-10-28T08:11:46.639325913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "273848",
  "sent_at": "2026-10-28T08:11:45.64222847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fd366c7-5619-49d8-8774-e6c30a84a6d8",
  "code": "273848",
  "device_ref": "sandbox-12880"
}
```

```json
{
  "session_id": "8ec8cc42-6adb-446d-b6bd-5333dd1f3557",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAwNSwiaWF0IjoxNzkzMTc1MTA1LCJqdGkiOiI5YzdjYjBiYS0xYjgwLTRlYTktOTA4My1kNzFhZTgxZTA0YzMiLCJzaWQiOiI4ZWM4Y2M0Mi02YWRiLTQ0NmQtYjZiZC01MzMzZGQxZjM1NTcifQ.fwauFkfC7cmtZeJVfj98VE_QaIR3KvBekp7bjkTAxJQ",
  "access_expires_at": "2026-10-28T08:26:45.692811721Z",
  "refresh_token": "ll35xomkqcSpOiAZ5qGXH2YwEzWmPiHi5EBowYc5d5I",
  "refresh_expires_at": "2026-11-27T08:11:45.692328891Z",
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
  "command_id": "c977b086-ec26-404d-a6fb-acb93880659e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:11:45Z",
    "sequence": 1793175105737
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c91c0a78-044f-4680-b806-61e65f471d9d",
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
  "last_heartbeat_at": "2026-10-28T08:11:45.754863Z",
  "last_location_at": "2026-10-28T08:11:45.754863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "37afcc14-4190-43d4-9c10-703df9ff284c",
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
  "id": "a07a60aa-37d6-4d44-b8a5-42c7b766a169",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:16:45.789695Z",
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
  "command_id": "f26bd194-7708-45a9-9dd4-c1f8e49ee800",
  "quote_id": "a07a60aa-37d6-4d44-b8a5-42c7b766a169",
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
  "id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ebac318-3ba2-4568-93cc-776611892917",
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
  "created_at": "2026-10-28T08:11:45.825044Z",
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
    "id": "1d91d917-0bdb-45ae-8e58-7b969a971d6a",
    "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
    "expires_at": "2026-10-28T08:12:00.82806Z",
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

`POST /api/driver/v1/offers/1d91d917-0bdb-45ae-8e58-7b969a971d6a/accept` → **200**

```json
{
  "command_id": "2b74f705-4b05-40c1-b3e2-d5fa82c90589"
}
```

```json
{
  "id": "c155f45d-895e-42d5-a196-bebf33844b0b",
  "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2088349b-d330-4321-992d-09fe7a18b4b6",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2088349b-d330-4321-992d-09fe7a18b4b6",
  "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "assignment_id": "c155f45d-895e-42d5-a196-bebf33844b0b",
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

`POST /api/driver/v1/trips/2088349b-d330-4321-992d-09fe7a18b4b6/cancel` → **200**

```json
{
  "command_id": "4f33c44e-eb09-4fd6-aeb8-1c48c6cdefdc",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "2088349b-d330-4321-992d-09fe7a18b4b6",
  "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "assignment_id": "c155f45d-895e-42d5-a196-bebf33844b0b",
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

`GET /api/rider/v1/orders/005eda0f-9548-47d6-ae0d-11b9b81cc9d4` → **200**

```json
{
  "id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9ebac318-3ba2-4568-93cc-776611892917",
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
    "id": "c155f45d-895e-42d5-a196-bebf33844b0b",
    "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2088349b-d330-4321-992d-09fe7a18b4b6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:11:45.825044Z",
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
    "id": "14598c04-c475-4be6-a1ea-f64615d0c90e",
    "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
    "expires_at": "2026-10-28T08:12:00.956929Z",
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

`POST /api/driver/v1/offers/14598c04-c475-4be6-a1ea-f64615d0c90e/accept` → **200**

```json
{
  "command_id": "5ed31b0d-9bcf-4607-841f-37e7544d96c9"
}
```

```json
{
  "id": "18313c4f-30aa-4884-8283-f326c8f5ebb3",
  "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eb398c98-e331-451c-b86f-d6733a2d7d0a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eb398c98-e331-451c-b86f-d6733a2d7d0a",
  "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "assignment_id": "18313c4f-30aa-4884-8283-f326c8f5ebb3",
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

`POST /api/driver/v1/trips/eb398c98-e331-451c-b86f-d6733a2d7d0a/cancel` → **200**

```json
{
  "command_id": "8ff2f58e-c296-40dc-997a-69ae236b7fa7",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "eb398c98-e331-451c-b86f-d6733a2d7d0a",
  "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
  "assignment_id": "18313c4f-30aa-4884-8283-f326c8f5ebb3",
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
    "id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:11:45.825044Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "9e9a0380-06b7-4d16-a040-3f3b6b8d5d82",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:11:45.47117Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/005eda0f-9548-47d6-ae0d-11b9b81cc9d4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:11:45.82556Z",
      "actor": {
        "type": "CLIENT",
        "id": "9ebac318-3ba2-4568-93cc-776611892917",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
        "quote_id": "a07a60aa-37d6-4d44-b8a5-42c7b766a169",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:11:45.827174Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
        "attempt_id": "c9a09bc2-afb8-41a6-9c7e-026d342eb935",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:11:45.832574Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1d91d917-0bdb-45ae-8e58-7b969a971d6a",
        "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:11:45.893033Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1d91d917-0bdb-45ae-8e58-7b969a971d6a",
        "order_id": "005eda0f-9548-47d6-ae0d-11b9b81cc9d4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c155f45d-895e-42d5-a196-bebf33844b0b"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 9e9a0380-06b7-4d16-a040-3f3b6b8d5d82, 005eda0f-9548-47d6-ae0d-11b9b81cc9d4.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731996401",
  "device_ref": "sandbox-21958"
}
```

```json
{
  "challenge_id": "644225e1-2a3f-45c0-9a95-1631972f5f28",
  "expires_at": "2026-10-28T08:16:46.199531821Z",
  "resend_available_at": "2026-10-28T08:11:47.199531821Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731996401` → **200**

```json
{
  "phone": "+380731996401",
  "audience": "CLIENT",
  "code": "431672",
  "sent_at": "2026-10-28T08:11:46.201820386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "644225e1-2a3f-45c0-9a95-1631972f5f28",
  "code": "431672",
  "device_ref": "sandbox-21958"
}
```

```json
{
  "session_id": "933d1280-9bf7-4ad3-8bbf-3037211f5619",
  "subject": {
    "type": "CLIENT",
    "id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmFkMzIyMS1jZGRmLTRlNzEtOTdlMi1hNGRjNTQyYmUyYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDA2LCJpYXQiOjE3OTMxNzUxMDYsImp0aSI6IjZjZWMxYTg3LTQxMjktNDVmZC05MGJlLTRlODY5NTZmNWU3YSIsInNpZCI6IjkzM2QxMjgwLTliZjctNGFkMy04YmJmLTMwMzcyMTFmNTYxOSJ9.UYaDedYfQW_Mnm8_wkIK9fK-Rku6DNP3W08XPVlTeaA",
  "access_expires_at": "2026-10-28T08:26:46.253064289Z",
  "refresh_token": "t5MI9EY0YZNJJLAXiOLW7JqdbT26ir6blh1umV8Mp-A",
  "refresh_expires_at": "2026-11-27T08:11:46.252514672Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bb74d898-0417-432d-8143-1e1f6e528b9f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "632ec84a-79b8-453b-a53d-6b70bfaf5eb3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-632ec84a-79b8-453b-a53d-6b70bfaf5eb3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c03e6f8452693561e7bdb7df73df3c48",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=632ec84a-79b8-453b-a53d-6b70bfaf5eb3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731996401"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=632ec84a-79b8-453b-a53d-6b70bfaf5eb3",
  "expires_at": "2026-10-28T08:41:46.293466Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/632ec84a-79b8-453b-a53d-6b70bfaf5eb3` → **200**

```json
{
  "id": "632ec84a-79b8-453b-a53d-6b70bfaf5eb3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:41:46.293466Z",
  "card": {
    "id": "c4e364b5-073b-4ba6-b061-c8eaf0c887e6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6545",
    "card_type": "Visa",
    "created_at": "2026-10-28T08:11:46.33876Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c4e364b5-073b-4ba6-b061-c8eaf0c887e6",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6545",
      "card_type": "Visa",
      "created_at": "2026-10-28T08:11:46.33876Z"
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
  "device_ref": "sandbox-24325"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "cf79de74-850e-4cfe-859f-14ee78842d8f",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24325"
}
```

```json
{
  "challenge_id": "6c954859-4e83-46e8-8a2a-a96d738d9af8",
  "expires_at": "2026-10-28T08:16:47.443781815Z",
  "resend_available_at": "2026-10-28T08:11:48.443781815Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "699233",
  "sent_at": "2026-10-28T08:11:47.446014266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c954859-4e83-46e8-8a2a-a96d738d9af8",
  "code": "699233",
  "device_ref": "sandbox-24325"
}
```

```json
{
  "session_id": "15e184c8-101f-4e77-be76-92c9d63fb3dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAwNywiaWF0IjoxNzkzMTc1MTA3LCJqdGkiOiI5ODI3MmQ4ZC0xM2UyLTQ2NmEtYjdlMC01MTEyYTg0ODUzMDAiLCJzaWQiOiIxNWUxODRjOC0xMDFmLTRlNzctYmU3Ni05MmM5ZDYzZmIzZGMifQ.cuxn79QDM4xX2_zMRrssuqwOpiw-sbsdwvdNtuOoTGA",
  "access_expires_at": "2026-10-28T08:26:47.493364676Z",
  "refresh_token": "9maIKVDFrLh2y0QjStll03V2CIvea0_vDBjlJBSe7fI",
  "refresh_expires_at": "2026-11-27T08:11:47.492953237Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c91c0a78-044f-4680-b806-61e65f471d9d",
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
  "last_heartbeat_at": "2026-10-28T08:11:45.754863Z",
  "last_location_at": "2026-10-28T08:11:45.754863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c91c0a78-044f-4680-b806-61e65f471d9d/handover` → **200**

```json
{
  "command_id": "b97bf0bd-861e-41b2-8260-8b0499c18a06",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c91c0a78-044f-4680-b806-61e65f471d9d",
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
  "last_heartbeat_at": "2026-10-28T08:11:45.754863Z",
  "last_location_at": "2026-10-28T08:11:45.754863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c91c0a78-044f-4680-b806-61e65f471d9d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:11:47Z",
    "sequence": 1793175107572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c91c0a78-044f-4680-b806-61e65f471d9d",
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
  "last_heartbeat_at": "2026-10-28T08:11:47.588807Z",
  "last_location_at": "2026-10-28T08:11:47.588807Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ed9b96b-a2aa-4618-8244-3d2c4942362d",
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
  "id": "56dc8d59-66ab-471d-a728-c2f18cffaf67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T08:16:47.620495Z",
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
  "command_id": "9bd8a829-e4af-4841-8051-f6563e6d46a1",
  "quote_id": "56dc8d59-66ab-471d-a728-c2f18cffaf67",
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
  "id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3",
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
  "created_at": "2026-10-28T08:11:47.654235Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c` → **200**

```json
{
  "id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3",
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
  "created_at": "2026-10-28T08:11:47.654235Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c` → **200**

```json
{
  "id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3",
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
  "created_at": "2026-10-28T08:11:47.654235Z",
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
    "id": "277a392b-bdc7-4cb8-bea5-ef973a11c22b",
    "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
    "expires_at": "2026-10-28T08:12:03.313716Z",
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

`POST /api/driver/v1/offers/277a392b-bdc7-4cb8-bea5-ef973a11c22b/accept` → **200**

```json
{
  "command_id": "4b0dc220-20dc-43ab-ad19-8e788faa8834"
}
```

```json
{
  "id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c58e494b-24f0-4d36-9592-e3bde684685b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c58e494b-24f0-4d36-9592-e3bde684685b",
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "assignment_id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
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

`POST /api/driver/v1/work-sessions/c91c0a78-044f-4680-b806-61e65f471d9d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:11:48Z",
    "sequence": 1793175108812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c91c0a78-044f-4680-b806-61e65f471d9d",
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
  "last_heartbeat_at": "2026-10-28T08:11:48.834205Z",
  "last_location_at": "2026-10-28T08:11:48.834205Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c58e494b-24f0-4d36-9592-e3bde684685b/arrive` → **200**

```json
{
  "command_id": "9cf7ebbb-f87f-4316-a448-cc635ffd3295",
  "expected_version": 0
}
```

```json
{
  "id": "c58e494b-24f0-4d36-9592-e3bde684685b",
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "assignment_id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
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
  "arrived_at": "2026-10-28T08:11:48.871431Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c58e494b-24f0-4d36-9592-e3bde684685b/start` → **200**

```json
{
  "command_id": "0c5e91d3-5b00-4000-b487-69cc39697ac7",
  "expected_version": 1
}
```

```json
{
  "id": "c58e494b-24f0-4d36-9592-e3bde684685b",
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "assignment_id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
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
  "arrived_at": "2026-10-28T08:11:48.871431Z",
  "started_at": "2026-10-28T08:11:48.908008Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c58e494b-24f0-4d36-9592-e3bde684685b/complete` → **200**

```json
{
  "command_id": "52161d9c-6599-41a2-8337-9c0c8ae8cd24",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:11:48Z"
}
```

```json
{
  "id": "c58e494b-24f0-4d36-9592-e3bde684685b",
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "assignment_id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
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
  "arrived_at": "2026-10-28T08:11:48.871431Z",
  "started_at": "2026-10-28T08:11:48.908008Z",
  "completed_at": "2026-10-28T08:11:48.947527Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c` → **200**

```json
{
  "id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3",
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
    "id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
    "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c58e494b-24f0-4d36-9592-e3bde684685b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:11:47.654235Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c` → **200**

```json
{
  "id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3",
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
    "id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
    "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c58e494b-24f0-4d36-9592-e3bde684685b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:11:47.654235Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c` → **200**

```json
{
  "id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3",
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
    "id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
    "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c58e494b-24f0-4d36-9592-e3bde684685b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:11:47.654235Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c` → **200**

```json
{
  "id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c2ad3221-cddf-4e71-97e2-a4dc542be2a3",
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
    "id": "5f1fa1cd-c890-4d48-b620-ce9b04827fd1",
    "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c58e494b-24f0-4d36-9592-e3bde684685b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:11:47.654235Z",
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
      "id": "d314f723-4995-4042-aaa0-595ccc9c8a69",
      "at": "2026-10-28T08:11:49.341105Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c/tip` → **200**

```json
{
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
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
  "available_until": "2026-10-29T08:11:48.947527Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c/tip` → **201**

```json
{
  "command_id": "9444d582-3941-47c4-8a9d-44fe4d3c3548",
  "amount_minor": 2500
}
```

```json
{
  "id": "539a0031-82e8-4f2b-b09c-efe506965ee2",
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T08:11:52.161172Z"
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c/tip` → **200**

```json
{
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
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
  "available_until": "2026-10-29T08:11:48.947527Z",
  "open": false,
  "tip": {
    "id": "539a0031-82e8-4f2b-b09c-efe506965ee2",
    "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T08:11:52.161172Z"
  }
}
```

`GET /api/rider/v1/orders/f3505332-3752-4114-9fba-c9ed42782b0c/tip` → **200**

```json
{
  "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
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
  "available_until": "2026-10-29T08:11:48.947527Z",
  "open": false,
  "tip": {
    "id": "539a0031-82e8-4f2b-b09c-efe506965ee2",
    "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T08:11:52.161172Z"
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
      "id": "d314f723-4995-4042-aaa0-595ccc9c8a69",
      "at": "2026-10-28T08:11:49.341105Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
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
      "id": "314ead57-0492-4800-bf65-343d8b96bce3",
      "at": "2026-10-28T08:11:53.391991Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
      "counterpart_id": null
    },
    {
      "id": "d314f723-4995-4042-aaa0-595ccc9c8a69",
      "at": "2026-10-28T08:11:49.341105Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f3505332-3752-4114-9fba-c9ed42782b0c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c91c0a78-044f-4680-b806-61e65f471d9d",
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
  "last_heartbeat_at": "2026-10-28T08:11:48.834205Z",
  "last_location_at": "2026-10-28T08:11:48.834205Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c91c0a78-044f-4680-b806-61e65f471d9d/close` → **200**

```json
{
  "command_id": "79ee141c-ab32-4dc4-9bc0-0cc07311aff1",
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

Done: card order f3505332-3752-4114-9fba-c9ed42782b0c.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736891641",
  "device_ref": "sandbox-19999"
}
```

```json
{
  "challenge_id": "9c00a4b9-2c23-4031-89d1-5376251c445c",
  "expires_at": "2026-10-28T08:16:54.361262976Z",
  "resend_available_at": "2026-10-28T08:11:55.361262976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736891641` → **200**

```json
{
  "phone": "+380736891641",
  "audience": "CLIENT",
  "code": "290432",
  "sent_at": "2026-10-28T08:11:54.363922653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c00a4b9-2c23-4031-89d1-5376251c445c",
  "code": "290432",
  "device_ref": "sandbox-19999"
}
```

```json
{
  "session_id": "52845d8e-a5d2-4d63-a755-35a6eb707944",
  "subject": {
    "type": "CLIENT",
    "id": "bd44ce69-91db-4a4b-a662-ce5a807ae037"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDQ0Y2U2OS05MWRiLTRhNGItYTY2Mi1jZTVhODA3YWUwMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDE0LCJpYXQiOjE3OTMxNzUxMTQsImp0aSI6ImI3Y2E2MjYwLTQyMzYtNDA2Ny04MDI5LTczNWQzMTgyNzE3YiIsInNpZCI6IjUyODQ1ZDhlLWE1ZDItNGQ2My1hNzU1LTM1YTZlYjcwNzk0NCJ9.WVrfuMBm4IIjiC1d3JKw-4HlfITaVcQZfJvmUpbfbK0",
  "access_expires_at": "2026-10-28T08:26:54.418895766Z",
  "refresh_token": "nQ6tJSxfkQfWlDe5CkRkb1MFCtkVLnGfRBdlhVDbdeM",
  "refresh_expires_at": "2026-11-27T08:11:54.418266892Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "096113ed-ea47-45a2-85ab-e41ab745e774",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "cdca9058-2829-4951-839a-c74db0810826",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-cdca9058-2829-4951-839a-c74db0810826",
    "orderDate": "1793175114",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "42961ef900efd4c612531ef683df95b7",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=cdca9058-2829-4951-839a-c74db0810826",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736891641"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=cdca9058-2829-4951-839a-c74db0810826",
  "created_at": "2026-10-28T08:11:54.453622Z",
  "expires_at": "2026-10-28T08:41:54.453622Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/cdca9058-2829-4951-839a-c74db0810826` → **200**

```json
{
  "id": "cdca9058-2829-4951-839a-c74db0810826",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:11:54.453622Z",
  "expires_at": "2026-10-28T08:41:54.453622Z",
  "completed_at": "2026-10-28T08:11:54.488904Z",
  "masked_pan": "41****6638",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "bd44ce69-91db-4a4b-a662-ce5a807ae037",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "bd44ce69-91db-4a4b-a662-ce5a807ae037",
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
      "id": "44f965db-88ab-4b0c-8089-6ec94df3ee22",
      "at": "2026-10-28T08:11:55.407123Z",
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
  "client_id": "bd44ce69-91db-4a4b-a662-ce5a807ae037",
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
      "id": "44f965db-88ab-4b0c-8089-6ec94df3ee22",
      "at": "2026-10-28T08:11:55.407123Z",
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
  "device_ref": "sandbox-19364"
}
```

```json
{
  "challenge_id": "aa75795f-06c1-4c01-997d-c3aa976ff905",
  "expires_at": "2026-10-28T08:16:55.617015864Z",
  "resend_available_at": "2026-10-28T08:11:56.617015864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "580353",
  "sent_at": "2026-10-28T08:11:55.619798061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa75795f-06c1-4c01-997d-c3aa976ff905",
  "code": "580353",
  "device_ref": "sandbox-19364"
}
```

```json
{
  "session_id": "53e73bc9-0983-4788-8e8a-49e2140d0b7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAxNSwiaWF0IjoxNzkzMTc1MTE1LCJqdGkiOiI4OTlkNmU5MS05NWRjLTQ2ZDAtYjE1ZS0wM2RlYWFiOTA4YjciLCJzaWQiOiI1M2U3M2JjOS0wOTgzLTQ3ODgtOGU4YS00OWUyMTQwZDBiN2EifQ.uZ6w7aeFLFS2iJ25EnsFB5IBrr2yQ6ER83eZu1INVV8",
  "access_expires_at": "2026-10-28T08:26:55.671617601Z",
  "refresh_token": "M8LiH1eF27aktt1QZ7Tt2a1aa-WqrmGoYaVXF0Xp4wQ",
  "refresh_expires_at": "2026-11-27T08:11:55.671233272Z",
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
  "command_id": "41f0e3d4-56ae-4ad9-a54b-aae2182075cc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "cf9cb6c2-8c34-4d2f-9717-1a3eaad71775",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-cf9cb6c2-8c34-4d2f-9717-1a3eaad71775",
    "orderDate": "1793175115",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "8c7569097eb395e2518515aaff1c5a56",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=cf9cb6c2-8c34-4d2f-9717-1a3eaad71775",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=cf9cb6c2-8c34-4d2f-9717-1a3eaad71775",
  "created_at": "2026-10-28T08:11:55.723496Z",
  "expires_at": "2026-10-28T08:41:55.723496Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/cf9cb6c2-8c34-4d2f-9717-1a3eaad71775` → **200**

```json
{
  "id": "cf9cb6c2-8c34-4d2f-9717-1a3eaad71775",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:11:55.723496Z",
  "expires_at": "2026-10-28T08:41:55.723496Z",
  "completed_at": "2026-10-28T08:11:55.752172Z",
  "masked_pan": "41****8010",
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
      "id": "413c3b76-782d-4985-ba58-60c7294bcf97",
      "at": "2026-10-28T08:11:56.413611Z",
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
  "command_id": "d5ccdbe9-a189-45a0-9f31-e3b1eb800ece",
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
  "correlation_id": "5d69061f-564a-4b29-9258-a496aa082d5f"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672672362",
  "device_ref": "sandbox-29220"
}
```

```json
{
  "challenge_id": "95fd1a33-90aa-4597-a5fb-1134bf566ce3",
  "expires_at": "2026-10-28T08:16:56.881653472Z",
  "resend_available_at": "2026-10-28T08:11:57.881653472Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672672362` → **200**

```json
{
  "phone": "+380672672362",
  "audience": "CLIENT",
  "code": "233388",
  "sent_at": "2026-10-28T08:11:56.884035055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95fd1a33-90aa-4597-a5fb-1134bf566ce3",
  "code": "233388",
  "device_ref": "sandbox-29220"
}
```

```json
{
  "session_id": "ca5c8a54-43cf-4d3a-964b-4506c4d90230",
  "subject": {
    "type": "CLIENT",
    "id": "119bb3c6-9584-40e2-9fd0-378953cca105"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTliYjNjNi05NTg0LTQwZTItOWZkMC0zNzg5NTNjY2ExMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDE2LCJpYXQiOjE3OTMxNzUxMTYsImp0aSI6ImIyNGYxMjlhLTllNjYtNDZmOS05Y2M0LWFjYTk5NDEwNDQwZSIsInNpZCI6ImNhNWM4YTU0LTQzY2YtNGQzYS05NjRiLTQ1MDZjNGQ5MDIzMCJ9.s9pHVb8_qLBFAhSD_MeLzI76NSc41WVd7TwaM_qMxLk",
  "access_expires_at": "2026-10-28T08:26:56.932762185Z",
  "refresh_token": "rGE7PkLE2zCI0-1ajZFLCGbRMx0Nf6PrK0XBH73m6Cc",
  "refresh_expires_at": "2026-11-27T08:11:56.93232331Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "119bb3c6-9584-40e2-9fd0-378953cca105",
  "session_id": "ca5c8a54-43cf-4d3a-964b-4506c4d90230",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6d6d25b-c74b-4795-9313-801b6746dbda",
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
  "id": "88a539a4-21b8-45d6-a887-b3d18b4b51b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:16:56.984900Z",
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
  "challenge_id": "8e7a6e8b-00bc-42f7-aedb-b45c7952e81d",
  "expires_at": "2026-10-28T08:16:59.017989066Z",
  "resend_available_at": "2026-10-28T08:12:00.017989066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672672362` → **200**

```json
{
  "phone": "+380672672362",
  "audience": "CLIENT",
  "code": "703217",
  "sent_at": "2026-10-28T08:11:59.019515808Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "86e6408f-9649-446b-b60d-4c435d29042d",
  "challenge_id": "8e7a6e8b-00bc-42f7-aedb-b45c7952e81d",
  "otp_code": "703217"
}
```

```json
{
  "client_id": "119bb3c6-9584-40e2-9fd0-378953cca105",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T08:11:59.079935126Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0394edda-e9c6-455d-acb5-194963a64c12",
  "quote_id": "88a539a4-21b8-45d6-a887-b3d18b4b51b3",
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
  "correlation_id": "cef32327-5c1c-4cd1-9c6a-5b1775a9a682"
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
  "session_id": "12c5f063-5833-4dc8-b847-e5c27e5e15b1",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMTksImlhdCI6MTc5MzE3NTExOSwianRpIjoiMDUxYTQ4YzItYTAyZi00N2E5LTg1MWItYmQ3Y2FlODc2OTM3Iiwic2lkIjoiMTJjNWYwNjMtNTgzMy00ZGM4LWI4NDctZTVjMjdlNWUxNWIxIn0.B3OBSJwh_d0hCMbKsL4eRyio0hSi6rX2kD4cZrEKJV8",
  "access_expires_at": "2026-10-28T08:26:59.349062241Z",
  "refresh_token": "4ZaT1kW3OPlf5DYhIPBgdMkf0k9GDnyar6OI-eGGgeM",
  "refresh_expires_at": "2026-10-28T20:11:59.34871694Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "119bb3c6-9584-40e2-9fd0-378953cca105",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T08:11:59.079935Z",
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

`POST /api/admin/v1/client-deletions/119bb3c6-9584-40e2-9fd0-378953cca105/complete` → **200**

```json
{
  "command_id": "cc5c280d-e4ac-4832-b3a8-9430b9026296",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "119bb3c6-9584-40e2-9fd0-378953cca105",
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
  "correlation_id": "0eac778c-e8f7-4385-9b46-f8cea0d5e50e"
}
```

Done: client 119bb3c6-9584-40e2-9fd0-378953cca105 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669535313",
  "device_ref": "sandbox-16936"
}
```

```json
{
  "challenge_id": "2da4af4e-fadc-4a2a-a7da-8536c0ff77f3",
  "expires_at": "2026-10-28T08:16:59.473864342Z",
  "resend_available_at": "2026-10-28T08:12:00.473864342Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669535313` → **200**

```json
{
  "phone": "+380669535313",
  "audience": "CLIENT",
  "code": "401484",
  "sent_at": "2026-10-28T08:11:59.475864134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2da4af4e-fadc-4a2a-a7da-8536c0ff77f3",
  "code": "401484",
  "device_ref": "sandbox-16936"
}
```

```json
{
  "session_id": "6eaf7738-7473-4e0f-88e0-7c3666770b75",
  "subject": {
    "type": "CLIENT",
    "id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2IyNGQ3Yy1iZjM2LTQzMmItYWM0MC05NDYwNWNhYmQ1ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDE5LCJpYXQiOjE3OTMxNzUxMTksImp0aSI6ImQzODFlMGFkLTcxNmEtNGMxZi05YWNhLWE0ODMxM2FiNTA2MiIsInNpZCI6IjZlYWY3NzM4LTc0NzMtNGUwZi04OGUwLTdjMzY2Njc3MGI3NSJ9.IAiTPhOrPUGmbV1Rp9fh33L8jAmQn8ioEf5jZuluqMc",
  "access_expires_at": "2026-10-28T08:26:59.524426903Z",
  "refresh_token": "Sn62Mf_1hcEP-W3qErIF6o8ySGPJ5lHtLZY13zaaABU",
  "refresh_expires_at": "2026-11-27T08:11:59.524091197Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8",
  "session_id": "6eaf7738-7473-4e0f-88e0-7c3666770b75",
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
  "session_id": "35788c08-66e9-40a1-9032-6746a87db773",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMTksImlhdCI6MTc5MzE3NTExOSwianRpIjoiNjA0OWVmOTEtMTY3Zi00YjBlLWI0NWMtZDJhY2VhMTYxZWE5Iiwic2lkIjoiMzU3ODhjMDgtNjZlOS00MGExLTkwMzItNjc0NmE4N2RiNzczIn0.8KGvfz3K93RZZwll6duxYUMsVVmJXyyoaJrDM59senI",
  "access_expires_at": "2026-10-28T08:26:59.77611524Z",
  "refresh_token": "U8rTwSDoPkJRAlffFvl4Sl6WvytqEXdD1fG3sxCS4yk",
  "refresh_expires_at": "2026-10-28T20:11:59.775775017Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9535313&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8",
      "phone": "+380669535313",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T08:11:59.522345Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/dcb24d7c-bf36-432b-ac40-94605cabd5e8` → **200**

```json
{
  "client": {
    "id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8",
    "phone": "+380669535313",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T08:11:59.522345Z",
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

`POST /api/admin/v1/clients/dcb24d7c-bf36-432b-ac40-94605cabd5e8/block` → **400**

```json
{
  "command_id": "d0b210d2-aabe-4b1a-aedd-441ca771bc97",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/dcb24d7c-bf36-432b-ac40-94605cabd5e8/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b4c775c4-4b12-4e83-8d27-997bca71d7b0",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/dcb24d7c-bf36-432b-ac40-94605cabd5e8/block` → **200**

```json
{
  "command_id": "905f0a0f-aa53-4dc5-b5ee-23cffe9a77bd",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8",
  "phone": "+380669535313",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T08:11:59.522345Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T08:11:59.915804Z",
    "by": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
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
  "correlation_id": "0fd444e5-f1c5-4806-9b5c-3d06a3bbae94"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669535313",
  "device_ref": "sandbox-27026"
}
```

```json
{
  "challenge_id": "7fa717c2-a7b2-4f0b-bd0d-d8d13d2c3618",
  "expires_at": "2026-10-28T08:17:01.969008546Z",
  "resend_available_at": "2026-10-28T08:12:02.969008546Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669535313` → **200**

```json
{
  "phone": "+380669535313",
  "audience": "CLIENT",
  "code": "965154",
  "sent_at": "2026-10-28T08:12:01.971029921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "7fa717c2-a7b2-4f0b-bd0d-d8d13d2c3618",
  "code": "965154",
  "device_ref": "sandbox-27026"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "6624c81a-2749-4fda-a93d-40f92fa504e0"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/dcb24d7c-bf36-432b-ac40-94605cabd5e8` → **200**

```json
{
  "client": {
    "id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8",
    "phone": "+380669535313",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T08:11:59.522345Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T08:11:59.915804Z",
      "by": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
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

`POST /api/admin/v1/clients/dcb24d7c-bf36-432b-ac40-94605cabd5e8/unblock` → **200**

```json
{
  "command_id": "1da69e4b-d55f-455a-81e2-6c059b69ad2d",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8",
  "phone": "+380669535313",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T08:11:59.522345Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669535313",
  "device_ref": "sandbox-15239"
}
```

```json
{
  "challenge_id": "d70a0271-7031-4733-9159-ee7816e20ff2",
  "expires_at": "2026-10-28T08:17:04.105651784Z",
  "resend_available_at": "2026-10-28T08:12:05.105651784Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669535313` → **200**

```json
{
  "phone": "+380669535313",
  "audience": "CLIENT",
  "code": "893546",
  "sent_at": "2026-10-28T08:12:04.107472043Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d70a0271-7031-4733-9159-ee7816e20ff2",
  "code": "893546",
  "device_ref": "sandbox-15239"
}
```

```json
{
  "session_id": "da6f3502-1bd2-4386-a55b-c04ea11a336b",
  "subject": {
    "type": "CLIENT",
    "id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2IyNGQ3Yy1iZjM2LTQzMmItYWM0MC05NDYwNWNhYmQ1ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDI0LCJpYXQiOjE3OTMxNzUxMjQsImp0aSI6ImE5YjRhY2VkLWZmZDQtNGVkNC1hZjg4LWRhYWYwNzkxNzE3NyIsInNpZCI6ImRhNmYzNTAyLTFiZDItNDM4Ni1hNTViLWMwNGVhMTFhMzM2YiJ9.Hy5B1FlnmmY72t6B5zGMHb1eh1uLgICOfKnJRZM6RMc",
  "access_expires_at": "2026-10-28T08:27:04.156566903Z",
  "refresh_token": "h7E0gZQV58xVd-4OnZ2o7ICfLj_9pK5IA9GmlEUKK6M",
  "refresh_expires_at": "2026-11-27T08:12:04.156078676Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "dcb24d7c-bf36-432b-ac40-94605cabd5e8",
  "session_id": "da6f3502-1bd2-4386-a55b-c04ea11a336b",
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
  "phone": "+380638353437",
  "device_ref": "sandbox-14667"
}
```

```json
{
  "challenge_id": "f240952f-6144-4720-88f0-ae93f4d4e315",
  "expires_at": "2026-10-28T08:17:04.211258711Z",
  "resend_available_at": "2026-10-28T08:12:05.211258711Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638353437` → **200**

```json
{
  "phone": "+380638353437",
  "audience": "CLIENT",
  "code": "903415",
  "sent_at": "2026-10-28T08:12:04.213127708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f240952f-6144-4720-88f0-ae93f4d4e315",
  "code": "903415",
  "device_ref": "sandbox-14667"
}
```

```json
{
  "session_id": "ceaf4fb7-5424-40ea-a40b-b2a2b4963176",
  "subject": {
    "type": "CLIENT",
    "id": "d7df2ed1-6b0a-4248-81e0-3eb322e8e744"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkN2RmMmVkMS02YjBhLTQyNDgtODFlMC0zZWIzMjJlOGU3NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDI0LCJpYXQiOjE3OTMxNzUxMjQsImp0aSI6ImM5ZTRlYjA5LTM0OGEtNGQxOS04ZDEzLWZhZTQxYjJhZDUzZSIsInNpZCI6ImNlYWY0ZmI3LTU0MjQtNDBlYS1hNDBiLWIyYTJiNDk2MzE3NiJ9.WQINJkZRGOgqKXzvPgTv2uqyWkR8X60gUeeo3pKrAdM",
  "access_expires_at": "2026-10-28T08:27:04.261531376Z",
  "refresh_token": "PgFuddwpc5VvczPeBEG1CCAjbEdn_J_32mI1JZMGqUU",
  "refresh_expires_at": "2026-11-27T08:12:04.261131319Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "a31589d9-880b-4289-8408-fff785f8128d",
  "expires_at": "2026-10-28T08:17:06.288339545Z",
  "resend_available_at": "2026-10-28T08:12:07.288339545Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638353437` → **200**

```json
{
  "phone": "+380638353437",
  "audience": "CLIENT",
  "code": "061818",
  "sent_at": "2026-10-28T08:12:06.290037375Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "25f59488-9e73-4d96-bce4-7ad4da86c2bd",
  "challenge_id": "a31589d9-880b-4289-8408-fff785f8128d",
  "otp_code": "061818"
}
```

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "PENDING",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328` → **200**

```json
{
  "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
  "state": "READY",
  "created_at": "2026-10-28T08:12:06.342788Z",
  "ready_at": "2026-10-28T08:12:13.036679Z",
  "expires_at": "2026-11-04T08:12:13.036679Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632778710",
  "device_ref": "sandbox-9157"
}
```

```json
{
  "challenge_id": "41aa3147-ee2f-4cf6-acd6-89eb5e9580ad",
  "expires_at": "2026-10-28T08:17:13.574893898Z",
  "resend_available_at": "2026-10-28T08:12:14.574893898Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632778710` → **200**

```json
{
  "phone": "+380632778710",
  "audience": "CLIENT",
  "code": "288447",
  "sent_at": "2026-10-28T08:12:13.577368137Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41aa3147-ee2f-4cf6-acd6-89eb5e9580ad",
  "code": "288447",
  "device_ref": "sandbox-9157"
}
```

```json
{
  "session_id": "fe3c40d4-6cfd-4a0d-962e-a233abc8d422",
  "subject": {
    "type": "CLIENT",
    "id": "80628aa0-38d8-4cf5-b602-2b9a02bb3ead"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MDYyOGFhMC0zOGQ4LTRjZjUtYjYwMi0yYjlhMDJiYjNlYWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDMzLCJpYXQiOjE3OTMxNzUxMzMsImp0aSI6ImE0ODRjYmRkLTI2MWQtNDdhYS1hYjk2LTg1MDJlM2RjMDQ2ZiIsInNpZCI6ImZlM2M0MGQ0LTZjZmQtNGEwZC05NjJlLWEyMzNhYmM4ZDQyMiJ9.gkmftOrtoJYtY6nhysZMVnrhfAgjHPuewGN6Al5GRUs",
  "access_expires_at": "2026-10-28T08:27:13.625851115Z",
  "refresh_token": "Cu9k_MEHH35kZ8CtW1rB5xtWnfUqywf4axDFnSj2MVk",
  "refresh_expires_at": "2026-11-27T08:12:13.625492555Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/0e1a231f-8a38-4a53-b3cb-b2d572132328/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7c3a34a3-b7f8-4d44-a7f4-83aaea203740"
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
  "session_id": "0705332c-a439-4188-a920-533c00737254",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMzMsImlhdCI6MTc5MzE3NTEzMywianRpIjoiYzk3NDlkNjctYjdlOC00OWJiLWI2NjktMzc3NjcxZGY3YTVjIiwic2lkIjoiMDcwNTMzMmMtYTQzOS00MTg4LWE5MjAtNTMzYzAwNzM3MjU0In0.uxxXeusx7O7mBw0hPG4yDtye2BJ1SsCBzqFy3_0Y_WY",
  "access_expires_at": "2026-10-28T08:27:13.885212227Z",
  "refresh_token": "NbWmD_t39O1yjGeeU6eOmqo51VMDAe7PPp6yDwIG6KY",
  "refresh_expires_at": "2026-10-28T20:12:13.88484924Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d7df2ed1-6b0a-4248-81e0-3eb322e8e744",
  "session_id": "ceaf4fb7-5424-40ea-a40b-b2a2b4963176",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d7df2ed1-6b0a-4248-81e0-3eb322e8e744/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "0e1a231f-8a38-4a53-b3cb-b2d572132328",
      "state": "READY",
      "created_at": "2026-10-28T08:12:06.342788Z",
      "ready_at": "2026-10-28T08:12:13.036679Z",
      "expires_at": "2026-11-04T08:12:13.036679Z",
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
  "device_ref": "sandbox-4994"
}
```

```json
{
  "challenge_id": "cf5bce28-2a15-45c7-8dd0-2665e38b2eca",
  "expires_at": "2026-10-28T08:17:13.998540327Z",
  "resend_available_at": "2026-10-28T08:12:14.998540327Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "911904",
  "sent_at": "2026-10-28T08:12:14.000684935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf5bce28-2a15-45c7-8dd0-2665e38b2eca",
  "code": "911904",
  "device_ref": "sandbox-4994"
}
```

```json
{
  "session_id": "6e4fee4d-a328-4593-9e5b-881a460f28a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAzNCwiaWF0IjoxNzkzMTc1MTM0LCJqdGkiOiI3NDdhNTgwMC04ZTY3LTQzNzMtYTdhNS1hNjY3NDYzNzYyMDciLCJzaWQiOiI2ZTRmZWU0ZC1hMzI4LTQ1OTMtOWU1Yi04ODFhNDYwZjI4YTkifQ.BDNjRYBrrYaKWoQFNX5MxfgCc_BPfWKdPHwPYRIlI0Y",
  "access_expires_at": "2026-10-28T08:27:14.04836891Z",
  "refresh_token": "J7lL_7CdN47zoQI8AuI3HbOCtYa_piEh0WvtFoiMIKU",
  "refresh_expires_at": "2026-11-27T08:12:14.048011942Z",
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
  "device_ref": "sandbox-31055"
}
```

```json
{
  "challenge_id": "c1b45ab4-4c1b-452e-a9aa-03f37fe7b183",
  "expires_at": "2026-10-28T08:17:14.108530479Z",
  "resend_available_at": "2026-10-28T08:12:15.108530479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "007004",
  "sent_at": "2026-10-28T08:12:14.110649716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1b45ab4-4c1b-452e-a9aa-03f37fe7b183",
  "code": "007004",
  "device_ref": "sandbox-31055"
}
```

```json
{
  "session_id": "b1e2599e-11e3-4796-bef4-95221863ea55",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAzNCwiaWF0IjoxNzkzMTc1MTM0LCJqdGkiOiJjZDE1MjY5Ny0wMjVmLTRjNWYtODQ0OS1iNjlhOGI2YTEwNzUiLCJzaWQiOiJiMWUyNTk5ZS0xMWUzLTQ3OTYtYmVmNC05NTIyMTg2M2VhNTUifQ.SKMMaCIdr33SM3jzh9TIBItU0_ZefzDQwvL0h2Xlutc",
  "access_expires_at": "2026-10-28T08:27:14.161001452Z",
  "refresh_token": "x77X-M1rJrSc9beir4YZEc9TNoY9ddmX6MLFC5WqZas",
  "refresh_expires_at": "2026-11-27T08:12:14.160629491Z",
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
  "command_id": "2497b37b-44c4-4f5a-b50e-b7886b9d7bd8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:14Z",
    "sequence": 1793175134207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5cbd4dfb-bb49-4587-baa2-81fb6dc0be89",
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
  "last_heartbeat_at": "2026-10-28T08:12:14.222754Z",
  "last_location_at": "2026-10-28T08:12:14.222754Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-7085"
}
```

```json
{
  "challenge_id": "a81c6e25-0886-4da3-af31-86939a033d11",
  "expires_at": "2026-10-28T08:17:14.248072408Z",
  "resend_available_at": "2026-10-28T08:12:15.248072408Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "382101",
  "sent_at": "2026-10-28T08:12:14.249967338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a81c6e25-0886-4da3-af31-86939a033d11",
  "code": "382101",
  "device_ref": "sandbox-7085"
}
```

```json
{
  "session_id": "4976243e-f938-435c-95c1-9394c61ea75b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAzNCwiaWF0IjoxNzkzMTc1MTM0LCJqdGkiOiIxZWUyZThhMy1iMzViLTQ3M2MtOGY1Ny03MGIyNzM0YTUxZDEiLCJzaWQiOiI0OTc2MjQzZS1mOTM4LTQzNWMtOTVjMS05Mzk0YzYxZWE3NWIifQ.btQb2CE5I9LR3nCpgOaOpIJ80phLzsMxOeRzQ9Ma48g",
  "access_expires_at": "2026-10-28T08:27:14.299238686Z",
  "refresh_token": "fIdMI8fGSmjjlm-LJGatHVQISwlu2L6_MmslP78V7No",
  "refresh_expires_at": "2026-11-27T08:12:14.298877601Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0795ca0-26a8-4b53-90b9-77c900c025ef",
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
  "last_heartbeat_at": "2026-10-28T08:11:45.611174Z",
  "last_location_at": "2026-10-28T08:11:45.611174Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e0795ca0-26a8-4b53-90b9-77c900c025ef/handover` → **200**

```json
{
  "command_id": "969290ce-b040-4906-b6d5-1440f13c1d77",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0795ca0-26a8-4b53-90b9-77c900c025ef",
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
  "last_heartbeat_at": "2026-10-28T08:11:45.611174Z",
  "last_location_at": "2026-10-28T08:11:45.611174Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e0795ca0-26a8-4b53-90b9-77c900c025ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:14Z",
    "sequence": 1793175134373
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e0795ca0-26a8-4b53-90b9-77c900c025ef",
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
  "last_heartbeat_at": "2026-10-28T08:12:14.390238Z",
  "last_location_at": "2026-10-28T08:12:14.390238Z",
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
  "session_id": "cbbd51bf-dc93-4870-b5de-a7cec288e8af",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMzQsImlhdCI6MTc5MzE3NTEzNCwianRpIjoiM2Q0NWQ4MGEtZDExOS00ODIwLTg0NTEtZTU5OWU5Y2I0MTA2Iiwic2lkIjoiY2JiZDUxYmYtZGM5My00ODcwLWI1ZGUtYTdjZWMyODhlOGFmIn0.NW7E8YnmZVvmZEko9KQvs0aqpx2vmowoOuixmQjbM-o",
  "access_expires_at": "2026-10-28T08:27:14.616335825Z",
  "refresh_token": "xfzNmXTjfOZrzpVWBMLwuL2L4A84Xu8mU7MP0rKJ_1g",
  "refresh_expires_at": "2026-10-28T20:12:14.615813704Z",
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
  "session_id": "10220906-f0ca-4582-b141-19e8a7e78932",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwMzQsImlhdCI6MTc5MzE3NTEzNCwianRpIjoiZmFiNDI4MzItN2ExNy00MjZmLThjN2EtOWI1NjhiMjhjNzkxIiwic2lkIjoiMTAyMjA5MDYtZjBjYS00NTgyLWIxNDEtMTllOGE3ZTc4OTMyIn0.ITZd5CopdR4QlXBY7Eh0DBts0FsgboAIo_0oSf2_1LA",
  "access_expires_at": "2026-10-28T08:27:14.844912901Z",
  "refresh_token": "1mG32Uk5b4bnJdPjN_hkfl_CHYfHIa4B166M5r_-7I8",
  "refresh_expires_at": "2026-10-28T20:12:14.844522293Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683933319",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "challenge_id": "3433c2cc-daca-4166-af97-579bafdd2606",
  "expires_at": "2026-10-28T08:17:14.869053662Z",
  "resend_available_at": "2026-10-28T08:12:15.869053662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683933319` → **200**

```json
{
  "phone": "+380683933319",
  "audience": "CLIENT",
  "code": "784238",
  "sent_at": "2026-10-28T08:12:14.870886028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3433c2cc-daca-4166-af97-579bafdd2606",
  "code": "784238",
  "device_ref": "sandbox-23207"
}
```

```json
{
  "session_id": "51ef3970-6d52-4115-b6f0-8e70cef55ef4",
  "subject": {
    "type": "CLIENT",
    "id": "a9a4f930-180e-4deb-b777-d049d855fd73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWE0ZjkzMC0xODBlLTRkZWItYjc3Ny1kMDQ5ZDg1NWZkNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDM0LCJpYXQiOjE3OTMxNzUxMzQsImp0aSI6ImUwZTA5MDIwLWJhZGYtNDM2ZS05ZTE4LWE3YTVjOWFjOTIyYSIsInNpZCI6IjUxZWYzOTcwLTZkNTItNDExNS1iNmYwLThlNzBjZWY1NWVmNCJ9.AFDJEd91dWmVnjIOZjo4B-nluYxnu6tHJQ6Sa_Xks3U",
  "access_expires_at": "2026-10-28T08:27:14.920241998Z",
  "refresh_token": "LEsZUduZsPBLwG4QkFmlZrV64nmyPPXbyVdirRpAVRE",
  "refresh_expires_at": "2026-11-27T08:12:14.919912762Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "888aa481-cf76-48bb-8987-cd0e501f3fff",
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
  "id": "a865bdc6-d145-4b84-a28e-b709c5612d43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:14.950056Z",
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
  "command_id": "5a23ce00-b87c-4385-aad7-4e3bccb3322c",
  "quote_id": "a865bdc6-d145-4b84-a28e-b709c5612d43",
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
  "id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9a4f930-180e-4deb-b777-d049d855fd73",
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
  "created_at": "2026-10-28T08:12:14.983552Z",
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
    "id": "9e914eb1-9a09-43f0-bcaa-41235385e096",
    "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
    "expires_at": "2026-10-28T08:12:29.98613Z",
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

`POST /api/driver/v1/offers/9e914eb1-9a09-43f0-bcaa-41235385e096/reject` → **204**

```json
{
  "command_id": "476bda7b-72a1-4871-8a93-68001af85abf"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a78beaa2-d8bd-4308-9061-326823b2f8d0",
    "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
    "expires_at": "2026-10-28T08:12:30.047616Z",
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

`POST /api/driver/v1/offers/a78beaa2-d8bd-4308-9061-326823b2f8d0/accept` → **200**

```json
{
  "command_id": "1d2321af-cf1b-43b4-a1c1-d5b02e412642"
}
```

```json
{
  "id": "37c0df5e-927b-411b-8007-8b4182353528",
  "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5337893e-4fce-4b1d-b060-47047b95d2d2",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/9cd76468-fe9c-4da0-beca-8e3cb9f1d69f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:12:14.984122Z",
      "actor": {
        "type": "CLIENT",
        "id": "a9a4f930-180e-4deb-b777-d049d855fd73",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
        "quote_id": "a865bdc6-d145-4b84-a28e-b709c5612d43",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:12:14.985377Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
        "attempt_id": "cb318047-a6d1-4cd1-8f6a-e927521fd615",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:12:14.990549Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9e914eb1-9a09-43f0-bcaa-41235385e096",
        "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      }
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T08:12:15.046773Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9e914eb1-9a09-43f0-bcaa-41235385e096",
        "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f"
      }
    },
    {
      "sequence": 4,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:12:15.051731Z",
      "actor": {
        "type": "SYSTEM",
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 9cd76468-fe9c-4da0-beca-8e3cb9f1d69f — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/9cd76468-fe9c-4da0-beca-8e3cb9f1d69f` → **200**

```json
{
  "id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
  "short_number": 5,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a9a4f930-180e-4deb-b777-d049d855fd73",
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
    "id": "37c0df5e-927b-411b-8007-8b4182353528",
    "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5337893e-4fce-4b1d-b060-47047b95d2d2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T08:12:14.983552Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9cd76468-fe9c-4da0-beca-8e3cb9f1d69f/cancel` → **200**

```json
{
  "command_id": "ffbe1d53-43fb-4faa-a56e-dba0009842b9",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a9a4f930-180e-4deb-b777-d049d855fd73",
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
    "id": "37c0df5e-927b-411b-8007-8b4182353528",
    "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5337893e-4fce-4b1d-b060-47047b95d2d2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:12:14.983552Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "session_id": "5cbd4dfb-bb49-4587-baa2-81fb6dc0be89",
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
  "last_heartbeat_at": "2026-10-28T08:12:14.222754Z",
  "last_location_at": "2026-10-28T08:12:14.222754Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5cbd4dfb-bb49-4587-baa2-81fb6dc0be89/close` → **200**

```json
{
  "command_id": "44da452f-aedb-4a97-b20b-4ac6e606df9e",
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
  "session_id": "e0795ca0-26a8-4b53-90b9-77c900c025ef",
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
  "last_heartbeat_at": "2026-10-28T08:12:14.390238Z",
  "last_location_at": "2026-10-28T08:12:14.390238Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0795ca0-26a8-4b53-90b9-77c900c025ef/close` → **200**

```json
{
  "command_id": "bfc2f77f-a7ac-457e-b3d5-2673d5cb6ec4",
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
  "device_ref": "sandbox-20642"
}
```

```json
{
  "challenge_id": "f9b181db-5c69-4771-a9cd-fddbcf647180",
  "expires_at": "2026-10-28T08:17:15.404906943Z",
  "resend_available_at": "2026-10-28T08:12:16.404906943Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "266427",
  "sent_at": "2026-10-28T08:12:15.406786616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9b181db-5c69-4771-a9cd-fddbcf647180",
  "code": "266427",
  "device_ref": "sandbox-20642"
}
```

```json
{
  "session_id": "a654905d-2121-4c07-8b5d-c31a4025ac8c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjAzNSwiaWF0IjoxNzkzMTc1MTM1LCJqdGkiOiJjYmFmZWZlMi01OWViLTQzZTEtYjNiOS05M2ZmZmQ0YThjMjYiLCJzaWQiOiJhNjU0OTA1ZC0yMTIxLTRjMDctOGI1ZC1jMzFhNDAyNWFjOGMifQ.eeRGm4Pg38v4LV0puDBPcHKrHg5PDfbGj06m4bE768Y",
  "access_expires_at": "2026-10-28T08:27:15.458429302Z",
  "refresh_token": "nbGx_tqVm1MPClwVSA1jKVZlyRS_fiRD9g2RzzP90l8",
  "refresh_expires_at": "2026-11-27T08:12:15.457882784Z",
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
  "command_id": "394f4464-2971-489a-8e51-52013909c444",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:15Z",
    "sequence": 1793175135510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:15.528447Z",
  "last_location_at": "2026-10-28T08:12:15.528447Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676185615",
  "device_ref": "sandbox-3967"
}
```

```json
{
  "challenge_id": "d2f05724-e239-4be2-b64f-f750dcdc1a0d",
  "expires_at": "2026-10-28T08:17:15.55719439Z",
  "resend_available_at": "2026-10-28T08:12:16.55719439Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676185615` → **200**

```json
{
  "phone": "+380676185615",
  "audience": "CLIENT",
  "code": "300228",
  "sent_at": "2026-10-28T08:12:15.559161961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2f05724-e239-4be2-b64f-f750dcdc1a0d",
  "code": "300228",
  "device_ref": "sandbox-3967"
}
```

```json
{
  "session_id": "374b5467-5dd3-4905-b668-f621e1d0b910",
  "subject": {
    "type": "CLIENT",
    "id": "65e77c7a-307a-434e-9b96-61858b501b46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWU3N2M3YS0zMDdhLTQzNGUtOWI5Ni02MTg1OGI1MDFiNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDM1LCJpYXQiOjE3OTMxNzUxMzUsImp0aSI6IjI5NmFkMTZkLWE5MWEtNGU2NS05MTQwLWVmMGYzY2M2YjQxYSIsInNpZCI6IjM3NGI1NDY3LTVkZDMtNDkwNS1iNjY4LWY2MjFlMWQwYjkxMCJ9.fqBQSk3nwwhEQP2xyf0TNO3V1mFXfyr6nwcB1gykobY",
  "access_expires_at": "2026-10-28T08:27:15.608091058Z",
  "refresh_token": "5fdPrx2OJY-r2tYqfcnZjRhw3hCdQBPUtE1yKUuJki4",
  "refresh_expires_at": "2026-11-27T08:12:15.607568103Z",
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
  "command_id": "ee93bade-afcd-47c0-a0c9-1a95f217699c",
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
  "id": "8e471671-b8cc-481e-b1ea-67c156d0a68a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:15.663753Z",
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
  "command_id": "490e477e-a65a-417d-bcde-b2378bd7b852",
  "platform": "ANDROID",
  "token": "sandbox-driver-6df2d222-634a-43c4-94ab-d6184ac9e096"
}
```

```json
{
  "id": "5c1ab71b-b1ab-4883-b2ef-64956f9b6492",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:12:15.701484Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "f919704c-4e5e-4c2e-93f7-193a5ba728ea",
  "platform": "ANDROID",
  "token": "sandbox-rider-55aa0cc5-b920-4ddd-9f82-e3a43523db14"
}
```

```json
{
  "id": "7dc93f4f-a4c2-4403-9f79-82bafad449cb",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:12:15.732752Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a0160481-96ed-4904-9069-d7250eea70ed",
  "quote_id": "8e471671-b8cc-481e-b1ea-67c156d0a68a",
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
  "id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65e77c7a-307a-434e-9b96-61858b501b46",
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
  "created_at": "2026-10-28T08:12:15.769212Z",
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
    "id": "9fd7715f-98eb-40c1-a651-4aa22efd24cc",
    "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
    "expires_at": "2026-10-28T08:12:30.772149Z",
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

`POST /api/driver/v1/offers/9fd7715f-98eb-40c1-a651-4aa22efd24cc/accept` → **200**

```json
{
  "command_id": "71d30024-c264-4cef-bdf9-6b3a5c7d6c50"
}
```

```json
{
  "id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cf93077d-ed78-4eb2-b564-0661420bf792",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:12:15.749Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:12:15.749Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:12:16.174614168Z",
    "token_suffix": "c9e096",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "c6283009-ebf1-4091-965b-208aef84f1b5",
      "order_version": "2",
      "order_id": "9cd76468-fe9c-4da0-beca-8e3cb9f1d69f",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676185615&after=2026-10-28T08:12:15.749Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380676185615&after=2026-10-28T08:12:15.749Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:12:17.180147677Z",
    "token_suffix": "23db14",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "4b0b7701-e514-42bb-9db0-82ae24db1afe",
      "order_version": "3",
      "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a7ee4551-22cc-4528-ad61-4fd12d28aaae/messages` → **201**

```json
{
  "command_id": "1ec19048-5b87-422d-af1d-cc2de22d9444",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "de908f4e-99e4-4b62-8963-b47d90b1afb0",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T08:12:17.957202868Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cf93077d-ed78-4eb2-b564-0661420bf792",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "assignment_id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a",
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

`POST /api/driver/v1/trips/cf93077d-ed78-4eb2-b564-0661420bf792/messages` → **201**

```json
{
  "command_id": "66087191-f8db-4dc2-aa1e-9b5ded0d11ba",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f2c55fee-b41a-4137-a5fa-1ad6f05fcaa5",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T08:12:18.005585916Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a7ee4551-22cc-4528-ad61-4fd12d28aaae/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/cf93077d-ed78-4eb2-b564-0661420bf792/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676185615"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:18Z",
    "sequence": 1793175138828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:18.099751Z",
  "last_location_at": "2026-10-28T08:12:18.099751Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cf93077d-ed78-4eb2-b564-0661420bf792",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "assignment_id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a",
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

`POST /api/driver/v1/trips/cf93077d-ed78-4eb2-b564-0661420bf792/arrive` → **200**

```json
{
  "command_id": "52d87002-f278-419c-9651-45847c9fd2b1",
  "expected_version": 0
}
```

```json
{
  "id": "cf93077d-ed78-4eb2-b564-0661420bf792",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "assignment_id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a",
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
  "arrived_at": "2026-10-28T08:12:18.150906Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cf93077d-ed78-4eb2-b564-0661420bf792/start` → **200**

```json
{
  "command_id": "b75acaed-1bb2-4443-ac74-8c551abea7cb",
  "expected_version": 1
}
```

```json
{
  "id": "cf93077d-ed78-4eb2-b564-0661420bf792",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "assignment_id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a",
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
  "arrived_at": "2026-10-28T08:12:18.150906Z",
  "started_at": "2026-10-28T08:12:18.181332Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:18Z",
    "sequence": 1793175138829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:18.219131Z",
  "last_location_at": "2026-10-28T08:12:18.219131Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/cf93077d-ed78-4eb2-b564-0661420bf792/complete` → **200**

```json
{
  "command_id": "e0199df2-7aad-4049-8c67-d457eb8c6203",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:12:18Z",
  "cash_received": true
}
```

```json
{
  "id": "cf93077d-ed78-4eb2-b564-0661420bf792",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "assignment_id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a",
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
  "arrived_at": "2026-10-28T08:12:18.150906Z",
  "started_at": "2026-10-28T08:12:18.181332Z",
  "completed_at": "2026-10-28T08:12:18.249729Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a7ee4551-22cc-4528-ad61-4fd12d28aaae` → **200**

```json
{
  "id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "65e77c7a-307a-434e-9b96-61858b501b46",
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
    "id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a",
    "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cf93077d-ed78-4eb2-b564-0661420bf792",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:12:15.769212Z",
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
    "id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:12:15.769212Z",
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
    "id": "cf93077d-ed78-4eb2-b564-0661420bf792",
    "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
    "order_short_number": 6,
    "created_at": "2026-10-28T08:12:15.829607Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "82ebbcd4-c8ea-45bd-9ace-9edffb50c2d7",
    "order_id": "f968a2c0-7b56-4666-8795-5c8338e4a78f",
    "order_short_number": 1,
    "created_at": "2026-10-28T08:11:36.341357Z",
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

`GET /api/rider/v1/orders/a7ee4551-22cc-4528-ad61-4fd12d28aaae/tip` → **200**

```json
{
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
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
  "available_until": "2026-10-29T08:12:18.249729Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a7ee4551-22cc-4528-ad61-4fd12d28aaae/tip` → **201**

```json
{
  "command_id": "c5d5bf4a-7f93-40b7-a5d5-b05bab0f1d9f",
  "amount_minor": 1100
}
```

```json
{
  "id": "c3c02b58-2bc8-48d8-8051-911a18e8b913",
  "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T08:12:21.435985Z"
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
  "session_id": "9c05bb29-f2bd-45bb-85c8-dca8d93f2926",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDEsImlhdCI6MTc5MzE3NTE0MSwianRpIjoiYzIyZTAwNTAtOTExNS00NzRjLTliZDItZmRhYTg1YjA1ZDQ2Iiwic2lkIjoiOWMwNWJiMjktZjJiZC00NWJiLTg1YzgtZGNhOGQ5M2YyOTI2In0.g3I1XTA_BKVYfvPC2WiFnwn8KOq6Uyw-UPJ3kKi2R1c",
  "access_expires_at": "2026-10-28T08:27:21.67337713Z",
  "refresh_token": "msJp2w1r5RZUaoOL25ls2RBEba9tIifot3MQbUNYzTc",
  "refresh_expires_at": "2026-10-28T20:12:21.672829101Z",
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
          "DRIVER": 1,
          "RIDER": 1,
          "STAFF": 1
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
      "DRIVER": 1,
      "RIDER": 1,
      "STAFF": 1
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
  "generated_at": "2026-10-28T08:12:21.704290754Z"
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
  "generated_at": "2026-10-28T08:12:21.732115187Z"
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
  "session_id": "943338e8-5704-4482-b0fb-187e6aafe1cc",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDEsImlhdCI6MTc5MzE3NTE0MSwianRpIjoiOTlmMjE0ZjAtOTcxOS00ZThkLWI2ZGItNzdjN2RmNGY3ZmYyIiwic2lkIjoiOTQzMzM4ZTgtNTcwNC00NDgyLWIwZmItMTg3ZTZhYWZlMWNjIn0.AYtiG73ZHbTbK-t5_hcsZ8g5JQ55fGQU80_QD6xIt_Y",
  "access_expires_at": "2026-10-28T08:27:21.962691596Z",
  "refresh_token": "zYpD5aerdxOGotkn8CG6p6bJxaKeFvieFQIhHeKUgi0",
  "refresh_expires_at": "2026-10-28T20:12:21.962334608Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a7ee4551-22cc-4528-ad61-4fd12d28aaae/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:12:15.769782Z",
      "actor": {
        "type": "CLIENT",
        "id": "65e77c7a-307a-434e-9b96-61858b501b46",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
        "quote_id": "8e471671-b8cc-481e-b1ea-67c156d0a68a",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:12:15.771446Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
        "attempt_id": "2a8e9c1d-7526-4254-8ba4-d6f861f0b778",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:12:15.777331Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9fd7715f-98eb-40c1-a651-4aa22efd24cc",
        "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:12:15.830845Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9fd7715f-98eb-40c1-a651-4aa22efd24cc",
        "order_id": "a7ee4551-22cc-4528-ad61-4fd12d28aaae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a16e31f4-b92f-4c9c-9a0d-16d780f8e40a"
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
  "at": "2026-10-28T08:12:22.020003963Z",
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
      "last_location_at": "2026-10-28T08:12:18.219131Z",
      "order_id": null
    }
  ]
}
```

Done: order a7ee4551-22cc-4528-ad61-4fd12d28aaae.

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
  "session_id": "7614d527-367c-4b3d-9c94-c9aa381e05c8",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDIsImlhdCI6MTc5MzE3NTE0MiwianRpIjoiNjQwODgxMzQtNWJmNi00Y2Y4LWFmYzMtMzQ2Mzg0Y2IxMDQ0Iiwic2lkIjoiNzYxNGQ1MjctMzY3Yy00YjNkLTljOTQtYzlhYTM4MWUwNWM4In0.tRQZgCOC4-bJNCIjo-fMn5kZv3KjNwQXTqnFuJiLLqQ",
  "access_expires_at": "2026-10-28T08:27:22.275963677Z",
  "refresh_token": "hBEAv8WeX9FP2eHlVVyuHFGIukzBiJIUyctR4vTQhv4",
  "refresh_expires_at": "2026-10-28T20:12:22.275464776Z",
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
  "command_id": "e1e4f572-aaf8-4d63-bbbc-655ad6c76b75",
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
  "timestamp": "2026-10-28T08:12:22.000+0000",
  "channel": {
    "id": "1730052000.197782768",
    "linkedid": "1730052000.197782768",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675710937"
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
  "timestamp": "2026-10-28T08:12:22.000+0000",
  "channel": {
    "id": "1730052000.197782768",
    "linkedid": "1730052000.197782768",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675710937"
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
  "session_id": "aeb8aa8f-f519-4754-9bf1-1c666c58d5e3",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDIsImlhdCI6MTc5MzE3NTE0MiwianRpIjoiODEzNGU4ZTctYjJkZS00MzJkLTlhZGEtNDY3MWZjYjdiYjg0Iiwic2lkIjoiYWViOGFhOGYtZjUxOS00NzU0LTliZjEtMWM2NjZjNThkNWUzIn0.E5W44CYgbGou9kVbKVW6l3GSwdBKJ6K1ahL_d5HDne0",
  "access_expires_at": "2026-10-28T08:27:22.611699638Z",
  "refresh_token": "o7i3WsMblKGgcpXL9n5JvBEnxsQ0ZWMoslTb6knTbsc",
  "refresh_expires_at": "2026-10-28T20:12:22.611149144Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "3372b047-fb19-4a18-bab9-ade2638b403d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675710937",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:12:22Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/3372b047-fb19-4a18-bab9-ade2638b403d/answer` → **200**

```json
{
  "command_id": "f98cde59-9233-4eb6-b7b4-83af073a9c56"
}
```

```json
{
  "id": "3372b047-fb19-4a18-bab9-ade2638b403d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675710937",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "order_ids": [],
  "started_at": "2026-10-28T08:12:22Z",
  "answered_at": "2026-10-28T08:12:22.683373Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.197782768",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "59f6627a-baa9-48d3-be49-2c71e87c6ca5",
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
  "id": "716583f3-6c84-43f3-9538-f650ea2643ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:22.782785Z",
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
  "command_id": "18e9b830-4d31-4535-812e-b7d1cd69948b",
  "quote_id": "716583f3-6c84-43f3-9538-f650ea2643ef",
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
    "phone": "+380675710937"
  },
  "call_id": "3372b047-fb19-4a18-bab9-ade2638b403d"
}
```

```json
{
  "id": "d6d8fad2-77ba-4bee-8b5e-905b73cde691",
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
  "created_at": "2026-10-28T08:12:22.833924Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675710937"
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
    "id": "1730052000.197782768",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3372b047-fb19-4a18-bab9-ade2638b403d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675710937",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [
        "d6d8fad2-77ba-4bee-8b5e-905b73cde691"
      ],
      "started_at": "2026-10-28T08:12:22Z",
      "answered_at": "2026-10-28T08:12:22.683373Z",
      "ended_at": "2026-10-28T08:12:22.875593Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "00cd80c0-56e6-4072-8485-61239135ebc6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675393801",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [],
      "started_at": "2026-10-28T08:11:40.402993Z",
      "answered_at": "2026-10-28T08:11:40.460974Z",
      "ended_at": "2026-10-28T08:11:40.506364Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:11:43.032798Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d6d8fad2-77ba-4bee-8b5e-905b73cde691` → **200**

```json
{
  "id": "d6d8fad2-77ba-4bee-8b5e-905b73cde691",
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
  "created_at": "2026-10-28T08:12:22.833924Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675710937"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d6d8fad2-77ba-4bee-8b5e-905b73cde691` → **200**

```json
{
  "id": "d6d8fad2-77ba-4bee-8b5e-905b73cde691",
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
  "created_at": "2026-10-28T08:12:22.833924Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675710937"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d6d8fad2-77ba-4bee-8b5e-905b73cde691/cancel` → **200**

```json
{
  "command_id": "044adcc4-7199-4cdb-b550-82d43e3b3ada",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d6d8fad2-77ba-4bee-8b5e-905b73cde691",
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
  "created_at": "2026-10-28T08:12:22.833924Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675710937"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 3372b047-fb19-4a18-bab9-ade2638b403d with order d6d8fad2-77ba-4bee-8b5e-905b73cde691.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23219"
}
```

```json
{
  "challenge_id": "1a70f871-f273-4f5f-a87d-994c53be9657",
  "expires_at": "2026-10-28T08:17:23.021220741Z",
  "resend_available_at": "2026-10-28T08:12:24.021220741Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "865162",
  "sent_at": "2026-10-28T08:12:23.02291349Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a70f871-f273-4f5f-a87d-994c53be9657",
  "code": "865162",
  "device_ref": "sandbox-23219"
}
```

```json
{
  "session_id": "1c3f1e83-a5e2-4683-8f40-2e0ff855b309",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA0MywiaWF0IjoxNzkzMTc1MTQzLCJqdGkiOiIzZTQ2OTU5OC02MGVhLTRkNmItYTBiYy0yMTE0ODkxZjY1MDkiLCJzaWQiOiIxYzNmMWU4My1hNWUyLTQ2ODMtOGY0MC0yZTBmZjg1NWIzMDkifQ.uB3KBbtdvK0wySnIE8yYwd63l-sGNhx92Sd4A_xu4uk",
  "access_expires_at": "2026-10-28T08:27:23.075327983Z",
  "refresh_token": "xzreOa0A655MUVxXHDk_bOfG28fhyIVSwbeMwpgrH8w",
  "refresh_expires_at": "2026-11-27T08:12:23.074971005Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:18.219131Z",
  "last_location_at": "2026-10-28T08:12:18.219131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/handover` → **200**

```json
{
  "command_id": "f506c910-d4ab-42bb-8002-629f52137560",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:18.219131Z",
  "last_location_at": "2026-10-28T08:12:18.219131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:23Z",
    "sequence": 1793175143152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:23.169149Z",
  "last_location_at": "2026-10-28T08:12:23.169149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667563540",
  "device_ref": "sandbox-3613"
}
```

```json
{
  "challenge_id": "56a8ff16-2b10-47c6-8026-3e6aac0d36b7",
  "expires_at": "2026-10-28T08:17:23.191242887Z",
  "resend_available_at": "2026-10-28T08:12:24.191242887Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667563540` → **200**

```json
{
  "phone": "+380667563540",
  "audience": "CLIENT",
  "code": "652413",
  "sent_at": "2026-10-28T08:12:23.193112629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56a8ff16-2b10-47c6-8026-3e6aac0d36b7",
  "code": "652413",
  "device_ref": "sandbox-3613"
}
```

```json
{
  "session_id": "49386590-caf7-43b0-8a1c-67d3b5744957",
  "subject": {
    "type": "CLIENT",
    "id": "1770df39-447b-4791-986c-db0c414caf87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzcwZGYzOS00NDdiLTQ3OTEtOTg2Yy1kYjBjNDE0Y2FmODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDQzLCJpYXQiOjE3OTMxNzUxNDMsImp0aSI6IjMyZTg4ODFkLWFhZmYtNDhkNy04NTM3LTExODI5ODBjNWZhYiIsInNpZCI6IjQ5Mzg2NTkwLWNhZjctNDNiMC04YTFjLTY3ZDNiNTc0NDk1NyJ9.JecMs2DXy0Djeu6k46bnVBolM3t0nDUa_Qh4kYwoGyk",
  "access_expires_at": "2026-10-28T08:27:23.241315373Z",
  "refresh_token": "O-4B8vQuDq5Ryd_HRsV8b_ZeRGUsSTRRxph131fA0vA",
  "refresh_expires_at": "2026-11-27T08:12:23.240876678Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76d33a18-0e3f-4fc9-bee0-05e7a4200517",
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
  "id": "ece477b6-194c-4344-998a-771ec9b1b74d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T08:17:23.270606Z",
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
  "command_id": "ed35b535-c646-469e-93c4-e1c9d4f75c99",
  "quote_id": "ece477b6-194c-4344-998a-771ec9b1b74d",
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
  "id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1770df39-447b-4791-986c-db0c414caf87",
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
  "created_at": "2026-10-28T08:12:23.302522Z",
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
    "id": "eebccb86-4119-432a-b7fa-936953cbcc5a",
    "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
    "expires_at": "2026-10-28T08:12:38.304494Z",
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

`POST /api/driver/v1/offers/eebccb86-4119-432a-b7fa-936953cbcc5a/accept` → **200**

```json
{
  "command_id": "f834b885-4567-42a8-a772-ae98159d60db"
}
```

```json
{
  "id": "c3003fa9-ded0-47e3-8f09-7f4d025ba46d",
  "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6dc4ced1-ced4-4a8b-9821-919cc40f06ec",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6dc4ced1-ced4-4a8b-9821-919cc40f06ec",
  "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
  "assignment_id": "c3003fa9-ded0-47e3-8f09-7f4d025ba46d",
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

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:23Z",
    "sequence": 1793175143398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:23.414794Z",
  "last_location_at": "2026-10-28T08:12:23.414794Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6dc4ced1-ced4-4a8b-9821-919cc40f06ec/arrive` → **200**

```json
{
  "command_id": "b355611a-e943-403e-bc52-2e0cc9cccd33",
  "expected_version": 0
}
```

```json
{
  "id": "6dc4ced1-ced4-4a8b-9821-919cc40f06ec",
  "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
  "assignment_id": "c3003fa9-ded0-47e3-8f09-7f4d025ba46d",
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
  "arrived_at": "2026-10-28T08:12:23.445881Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6dc4ced1-ced4-4a8b-9821-919cc40f06ec/start` → **200**

```json
{
  "command_id": "a8b1734f-a1a6-4944-b74f-e38f8b996fc3",
  "expected_version": 1
}
```

```json
{
  "id": "6dc4ced1-ced4-4a8b-9821-919cc40f06ec",
  "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
  "assignment_id": "c3003fa9-ded0-47e3-8f09-7f4d025ba46d",
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
  "arrived_at": "2026-10-28T08:12:23.445881Z",
  "started_at": "2026-10-28T08:12:23.485277Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:23Z",
    "sequence": 1793175143507
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:23.523913Z",
  "last_location_at": "2026-10-28T08:12:23.523913Z",
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
  "device_ref": "sandbox-21478"
}
```

```json
{
  "challenge_id": "1362195f-a0de-41bd-980c-56ebbf113b22",
  "expires_at": "2026-10-28T08:17:23.545039322Z",
  "resend_available_at": "2026-10-28T08:12:24.545039322Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "750133",
  "sent_at": "2026-10-28T08:12:23.546717414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1362195f-a0de-41bd-980c-56ebbf113b22",
  "code": "750133",
  "device_ref": "sandbox-21478"
}
```

```json
{
  "session_id": "e425805f-00d2-47e1-9948-b09cdd9c811d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA0MywiaWF0IjoxNzkzMTc1MTQzLCJqdGkiOiJmZThlNTczZC1mMDFjLTQ0MGYtYmRjOS1jZDhiN2E5NGZjNTkiLCJzaWQiOiJlNDI1ODA1Zi0wMGQyLTQ3ZTEtOTk0OC1iMDljZGQ5YzgxMWQifQ.FXJCqbczk3lJtokM7-G5WgiWj-KioLTJitMvwvmyesU",
  "access_expires_at": "2026-10-28T08:27:23.601867978Z",
  "refresh_token": "o67O895Lgo0tb8RNQI4j7obZqAagwMwlK1Y446I50EQ",
  "refresh_expires_at": "2026-11-27T08:12:23.601476127Z",
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
  "command_id": "a29dc109-754c-4255-81fb-503fe2ca948b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:23Z",
    "sequence": 1793175143648
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "550f02c2-0e9f-44d3-ad09-ed38b71f8419",
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
  "last_heartbeat_at": "2026-10-28T08:12:23.663682Z",
  "last_location_at": "2026-10-28T08:12:23.663682Z",
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
  "session_id": "d08f09b7-5ab1-409e-9e0c-93318170c199",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDMsImlhdCI6MTc5MzE3NTE0MywianRpIjoiM2VjZThjYmEtNzAxYy00M2UxLTgwNDctODM4N2Q3ZDUxMTFmIiwic2lkIjoiZDA4ZjA5YjctNWFiMS00MDllLTllMGMtOTMzMTgxNzBjMTk5In0.uyLtM3xkM4qLqY0iGC_9QYBpacR1OkMstLWj6tqMvY8",
  "access_expires_at": "2026-10-28T08:27:23.907838342Z",
  "refresh_token": "RhlnleixNyhhRZNcucU-igQAy-dvVP_kDkwkb9U15x8",
  "refresh_expires_at": "2026-10-28T20:12:23.907482466Z",
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
  "session_id": "08ffc497-7735-4a97-b6f3-55059c654730",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDQsImlhdCI6MTc5MzE3NTE0NCwianRpIjoiODhhMzVlODEtOWE0Mi00ZjE0LWI4N2ItZGI4MzcwNjcxNzI0Iiwic2lkIjoiMDhmZmM0OTctNzczNS00YTk3LWI2ZjMtNTUwNTljNjU0NzMwIn0.nO6cyH0e8iJF_IlpOWecmH07IKvJ4ck0VOaxJeFqT3k",
  "access_expires_at": "2026-10-28T08:27:24.138389198Z",
  "refresh_token": "6gE-Eyc6_6fti8_lI_vGnTo7gf8UqDNp9GUm6qbongw",
  "refresh_expires_at": "2026-10-28T20:12:24.138001123Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ffd61938-98ee-4e32-a8f9-bf363332cd74` → **200**

```json
{
  "id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1770df39-447b-4791-986c-db0c414caf87",
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
    "id": "c3003fa9-ded0-47e3-8f09-7f4d025ba46d",
    "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6dc4ced1-ced4-4a8b-9821-919cc40f06ec",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T08:12:23.302522Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ffd61938-98ee-4e32-a8f9-bf363332cd74/interrupt` → **200**

```json
{
  "command_id": "78cdb5a7-ab60-46cf-a5b4-32fec957bbda",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1770df39-447b-4791-986c-db0c414caf87",
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
      "id": "c3003fa9-ded0-47e3-8f09-7f4d025ba46d",
      "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "6dc4ced1-ced4-4a8b-9821-919cc40f06ec",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T08:12:23.302522Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1770df39-447b-4791-986c-db0c414caf87",
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
    "id": "c3f090e8-fc0e-4505-ab99-2c9c32f32011",
    "order_id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
    "expires_at": "2026-10-28T08:12:39.238091Z",
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

`POST /api/driver/v1/offers/c3f090e8-fc0e-4505-ab99-2c9c32f32011/accept` → **200**

```json
{
  "command_id": "2bbb5459-c276-4402-918d-f583fc7c0414"
}
```

```json
{
  "id": "8b7437c5-dcf0-494d-a210-d61288eb4bc3",
  "order_id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1ce2dcb0-b22c-41d0-bad7-741c8ba521f9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1ce2dcb0-b22c-41d0-bad7-741c8ba521f9",
  "order_id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
  "assignment_id": "8b7437c5-dcf0-494d-a210-d61288eb4bc3",
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
  "session_id": "550f02c2-0e9f-44d3-ad09-ed38b71f8419",
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
  "last_heartbeat_at": "2026-10-28T08:12:23.663682Z",
  "last_location_at": "2026-10-28T08:12:23.663682Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/550f02c2-0e9f-44d3-ad09-ed38b71f8419/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:24Z",
    "sequence": 1793175144356
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "550f02c2-0e9f-44d3-ad09-ed38b71f8419",
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
  "last_heartbeat_at": "2026-10-28T08:12:24.373447Z",
  "last_location_at": "2026-10-28T08:12:24.373447Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1ce2dcb0-b22c-41d0-bad7-741c8ba521f9/arrive` → **200**

```json
{
  "command_id": "9eacfb8e-7cb8-4772-b4ba-8ff955ed5eaf",
  "expected_version": 0
}
```

```json
{
  "id": "1ce2dcb0-b22c-41d0-bad7-741c8ba521f9",
  "order_id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
  "assignment_id": "8b7437c5-dcf0-494d-a210-d61288eb4bc3",
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
  "arrived_at": "2026-10-28T08:12:24.405295Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1ce2dcb0-b22c-41d0-bad7-741c8ba521f9/start` → **200**

```json
{
  "command_id": "28f24028-8327-404f-9eee-fbe40e199a30",
  "expected_version": 1
}
```

```json
{
  "id": "1ce2dcb0-b22c-41d0-bad7-741c8ba521f9",
  "order_id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
  "assignment_id": "8b7437c5-dcf0-494d-a210-d61288eb4bc3",
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
  "arrived_at": "2026-10-28T08:12:24.405295Z",
  "started_at": "2026-10-28T08:12:24.439703Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1ce2dcb0-b22c-41d0-bad7-741c8ba521f9/complete` → **200**

```json
{
  "command_id": "349e8004-d219-49ff-925b-78c20798b9d0",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:12:24Z"
}
```

```json
{
  "id": "1ce2dcb0-b22c-41d0-bad7-741c8ba521f9",
  "order_id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
  "assignment_id": "8b7437c5-dcf0-494d-a210-d61288eb4bc3",
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
  "arrived_at": "2026-10-28T08:12:24.405295Z",
  "started_at": "2026-10-28T08:12:24.439703Z",
  "completed_at": "2026-10-28T08:12:24.481031Z",
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
    "id": "bcd28db0-b8e9-4838-9486-c12f16abf389",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:12:24.229011Z",
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
    "id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:12:23.302522Z",
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
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
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

`GET /api/operator/v1/orders/ffd61938-98ee-4e32-a8f9-bf363332cd74/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:12:23.302887Z",
      "actor": {
        "type": "CLIENT",
        "id": "1770df39-447b-4791-986c-db0c414caf87",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
        "quote_id": "ece477b6-194c-4344-998a-771ec9b1b74d",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:12:23.304034Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
        "attempt_id": "2dfb3372-e2a7-4720-8022-c5089140e723",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:12:23.306255Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "eebccb86-4119-432a-b7fa-936953cbcc5a",
        "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:12:23.355718Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "eebccb86-4119-432a-b7fa-936953cbcc5a",
        "order_id": "ffd61938-98ee-4e32-a8f9-bf363332cd74",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c3003fa9-ded0-47e3-8f09-7f4d025ba46d"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted ffd61938-98ee-4e32-a8f9-bf363332cd74, follow-up bcd28db0-b8e9-4838-9486-c12f16abf389.

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
  "session_id": "45e34ae7-bc4f-4b4e-a686-3d1622937f30",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDcsImlhdCI6MTc5MzE3NTE0NywianRpIjoiNWZiMzk5M2EtZjJiZS00ZjAyLWFhMGUtYjQzYjJjMjRhYTMxIiwic2lkIjoiNDVlMzRhZTctYmM0Zi00YjRlLWE2ODYtM2QxNjIyOTM3ZjMwIn0.a4E80cUjJ-LEY3OViPP3ERk82IB_Ndi79Mfeq7KfDq0",
  "access_expires_at": "2026-10-28T08:27:27.796647873Z",
  "refresh_token": "wPopUBBsTP97kVNRle3G7U_ITvS2cRPuWbK8FSYdNvc",
  "refresh_expires_at": "2026-10-28T20:12:27.796219901Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e81251dc-8248-4698-b969-d926311536fb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:12:27Z"
}
```

```json
{
  "id": "9cc1fbca-4b75-4d84-8929-5163f947fdfe",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:12:27Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9cc1fbca-4b75-4d84-8929-5163f947fdfe/publish` → **200**

```json
{
  "command_id": "c505881c-423f-4802-9518-52774f4af166",
  "expected_version": 0
}
```

```json
{
  "id": "9cc1fbca-4b75-4d84-8929-5163f947fdfe",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:12:27.878766Z",
  "published_at": "2026-10-28T08:12:27.878766Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "9cc1fbca-4b75-4d84-8929-5163f947fdfe",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T08:12:27.878766Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638505212",
  "device_ref": "sandbox-14756"
}
```

```json
{
  "challenge_id": "1a1d014c-e979-4ca4-956e-3fdb8fc43dff",
  "expires_at": "2026-10-28T08:17:27.938691186Z",
  "resend_available_at": "2026-10-28T08:12:28.938691186Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638505212` → **200**

```json
{
  "phone": "+380638505212",
  "audience": "CLIENT",
  "code": "559000",
  "sent_at": "2026-10-28T08:12:27.940580266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a1d014c-e979-4ca4-956e-3fdb8fc43dff",
  "code": "559000",
  "device_ref": "sandbox-14756"
}
```

```json
{
  "session_id": "c053b3b3-4df2-4f08-823d-946afffcc49b",
  "subject": {
    "type": "CLIENT",
    "id": "85546e7b-6bd7-4206-91df-3b143a797f6b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTU0NmU3Yi02YmQ3LTQyMDYtOTFkZi0zYjE0M2E3OTdmNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDQ3LCJpYXQiOjE3OTMxNzUxNDcsImp0aSI6ImQxODg2ZjI3LTdlM2MtNDI2Yi04N2Q5LTMzY2RkNGFhNDYyZSIsInNpZCI6ImMwNTNiM2IzLTRkZjItNGYwOC04MjNkLTk0NmFmZmZjYzQ5YiJ9.JWHc2ZsrlUsjqByshN_u8hHF3IVOpuSvPrvOcp5bTrk",
  "access_expires_at": "2026-10-28T08:27:27.989067835Z",
  "refresh_token": "ptqNt1b687dilc4evm62p-uh_nDa71vuedCLlcGCC1I",
  "refresh_expires_at": "2026-11-27T08:12:27.988507677Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "9cc1fbca-4b75-4d84-8929-5163f947fdfe",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T08:12:27.878766Z",
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
  "command_id": "b5ff166f-16af-4dd3-8dab-c63e691e15fe",
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
  "id": "948e9b83-6d79-4060-a7fb-4b40b158ff60",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:17:28.041740Z",
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
  "command_id": "bd118794-64ed-49a3-84a1-3a843b9f9827",
  "quote_id": "948e9b83-6d79-4060-a7fb-4b40b158ff60",
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
  "correlation_id": "c758581c-eabc-4a52-aedb-bea90f3c8a02"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "b97050ae-6e68-4ef4-a6c5-0dce20b3b139",
  "version_id": "9cc1fbca-4b75-4d84-8929-5163f947fdfe",
  "language": "uk"
}
```

```json
{
  "version_id": "9cc1fbca-4b75-4d84-8929-5163f947fdfe",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T08:12:28.105768Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e79d4dca-ca36-4438-8031-0efb218c13be",
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
  "id": "bf69b6de-e998-4808-9292-97c719aeb6e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:17:28.136863Z",
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
  "command_id": "f6289e9a-d826-43a7-9d8a-8f4ca48273fa",
  "quote_id": "bf69b6de-e998-4808-9292-97c719aeb6e2",
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
  "id": "65b6258a-0543-41b4-abd9-052f17b3ba0b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85546e7b-6bd7-4206-91df-3b143a797f6b",
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
  "created_at": "2026-10-28T08:12:28.16604Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/65b6258a-0543-41b4-abd9-052f17b3ba0b` → **200**

```json
{
  "id": "65b6258a-0543-41b4-abd9-052f17b3ba0b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85546e7b-6bd7-4206-91df-3b143a797f6b",
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
  "created_at": "2026-10-28T08:12:28.16604Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/65b6258a-0543-41b4-abd9-052f17b3ba0b/cancel` → **200**

```json
{
  "command_id": "a61c4912-dba5-45d1-afd7-a65308820929",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "65b6258a-0543-41b4-abd9-052f17b3ba0b",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85546e7b-6bd7-4206-91df-3b143a797f6b",
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
  "created_at": "2026-10-28T08:12:28.16604Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
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

`POST /api/admin/v1/legal-documents/9cc1fbca-4b75-4d84-8929-5163f947fdfe` → **409**

```json
{
  "command_id": "2e1fbcf3-c94c-4e97-8498-6b477693edbf",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:12:28Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/9cc1fbca-4b75-4d84-8929-5163f947fdfe",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fdb959a7-e7c3-436f-8af2-82c23f51d416"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d6aec115-8b24-4db2-8044-760f5313f9ba",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:12:28Z"
}
```

```json
{
  "id": "4bcb6912-c5d4-49a0-b149-26c33aa80e7d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:12:28Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4bcb6912-c5d4-49a0-b149-26c33aa80e7d/publish` → **200**

```json
{
  "command_id": "a4388cb8-0be4-4c9b-9b2e-e8fdce5be446",
  "expected_version": 0
}
```

```json
{
  "id": "4bcb6912-c5d4-49a0-b149-26c33aa80e7d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:12:28.324482Z",
  "published_at": "2026-10-28T08:12:28.324482Z",
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
  "device_ref": "sandbox-13426"
}
```

```json
{
  "challenge_id": "13b883c7-45eb-41e7-bd38-14f398811190",
  "expires_at": "2026-10-28T08:17:28.356295695Z",
  "resend_available_at": "2026-10-28T08:12:29.356295695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "760228",
  "sent_at": "2026-10-28T08:12:28.358024921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13b883c7-45eb-41e7-bd38-14f398811190",
  "code": "760228",
  "device_ref": "sandbox-13426"
}
```

```json
{
  "session_id": "8f79487e-58e9-484d-9675-2ae15d55459b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA0OCwiaWF0IjoxNzkzMTc1MTQ4LCJqdGkiOiJiMDQ0YmRhNS1kNjEyLTQ5YWUtYmM4YS0wZmQ0Y2YxYzMxN2MiLCJzaWQiOiI4Zjc5NDg3ZS01OGU5LTQ4NGQtOTY3NS0yYWUxNWQ1NTQ1OWIifQ.-UVKQnRYRyY-y78DKErAxvg-JRTTIHzOkyjUVJU2QsM",
  "access_expires_at": "2026-10-28T08:27:28.404378861Z",
  "refresh_token": "xcIvbTJNcAWt252W-G5f089yeN913sXjXRYM-AhhIb4",
  "refresh_expires_at": "2026-11-27T08:12:28.404010428Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "550f02c2-0e9f-44d3-ad09-ed38b71f8419",
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
  "last_heartbeat_at": "2026-10-28T08:12:24.373447Z",
  "last_location_at": "2026-10-28T08:12:24.373447Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/550f02c2-0e9f-44d3-ad09-ed38b71f8419/handover` → **200**

```json
{
  "command_id": "4137d76c-a824-4716-b016-8c92f11b6e07",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "550f02c2-0e9f-44d3-ad09-ed38b71f8419",
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
  "last_heartbeat_at": "2026-10-28T08:12:24.373447Z",
  "last_location_at": "2026-10-28T08:12:24.373447Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/550f02c2-0e9f-44d3-ad09-ed38b71f8419/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:28Z",
    "sequence": 1793175148475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "550f02c2-0e9f-44d3-ad09-ed38b71f8419",
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
  "last_heartbeat_at": "2026-10-28T08:12:28.49104Z",
  "last_location_at": "2026-10-28T08:12:28.49104Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673556187",
  "device_ref": "sandbox-16428"
}
```

```json
{
  "challenge_id": "b28320a7-b04d-4163-b0f4-67796432643f",
  "expires_at": "2026-10-28T08:17:28.514478241Z",
  "resend_available_at": "2026-10-28T08:12:29.514478241Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673556187` → **200**

```json
{
  "phone": "+380673556187",
  "audience": "CLIENT",
  "code": "730611",
  "sent_at": "2026-10-28T08:12:28.516216124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b28320a7-b04d-4163-b0f4-67796432643f",
  "code": "730611",
  "device_ref": "sandbox-16428"
}
```

```json
{
  "session_id": "f441d162-130e-4b3a-ab98-dfe2849af287",
  "subject": {
    "type": "CLIENT",
    "id": "dda4a373-6a77-4450-99bd-690a7d82594b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGE0YTM3My02YTc3LTQ0NTAtOTliZC02OTBhN2Q4MjU5NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDQ4LCJpYXQiOjE3OTMxNzUxNDgsImp0aSI6IjgxNTBiNTdmLTQ1MTQtNDIwMi05YzE2LWZkMzAxOTA0MDA1NiIsInNpZCI6ImY0NDFkMTYyLTEzMGUtNGIzYS1hYjk4LWRmZTI4NDlhZjI4NyJ9.p_aYGf2pb6TC2Ku9_lduYCuvSpoWHROFrPadOEL7roc",
  "access_expires_at": "2026-10-28T08:27:28.564497023Z",
  "refresh_token": "GZKnujvrCmZLW6JLcjLn-GIzLWFp1mf9g_amIHsLRy0",
  "refresh_expires_at": "2026-11-27T08:12:28.564143527Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb857ad8-7f4f-4517-820e-d87406043472",
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
  "id": "ecb00a32-2537-4f67-8168-2e22ea07f91b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:28.594582Z",
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
  "command_id": "e34988cf-1ab3-4e0c-8755-115952f6b130",
  "quote_id": "ecb00a32-2537-4f67-8168-2e22ea07f91b",
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
    "phone": "+380673202012"
  }
}
```

```json
{
  "id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.628036Z",
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
    "id": "d712132d-2163-4801-92f4-3ee8054ab015",
    "order_id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
    "expires_at": "2026-10-28T08:12:43.630484Z",
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

`POST /api/driver/v1/offers/d712132d-2163-4801-92f4-3ee8054ab015/accept` → **200**

```json
{
  "command_id": "7d592d3f-a7e2-4587-bb5f-8054adc52dbd"
}
```

```json
{
  "id": "23538d59-aefd-415b-b038-86d1bddb5a16",
  "order_id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ee66b6c2-e17a-4635-b09a-28b0961c36cb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ee66b6c2-e17a-4635-b09a-28b0961c36cb",
  "order_id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
  "assignment_id": "23538d59-aefd-415b-b038-86d1bddb5a16",
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
    "phone": "+380673202012"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc8484ee-412b-47b2-a9ac-0c096a0f03ac",
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
  "id": "4b539142-dc95-4c55-a95d-1aaf086ffc5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:28.752186Z",
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
  "command_id": "e6a6ed0c-30c1-46cb-bce2-297583eef610",
  "quote_id": "4b539142-dc95-4c55-a95d-1aaf086ffc5a",
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
  "id": "b626a466-ba7b-4ede-851f-77f0683b668f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.783913Z",
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
  "command_id": "b31eb04c-26e9-469f-9758-65afe5c0e6ee",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T11:12:28Z"
}
```

```json
{
  "id": "6e279b56-ebe0-4bad-8ac3-7b7a3809b530",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:28.820899Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:12:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4ebfd36b-7a31-4cf8-815b-da111bcce302",
  "quote_id": "6e279b56-ebe0-4bad-8ac3-7b7a3809b530",
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
  "pickup_at": "2026-10-28T11:12:28Z"
}
```

```json
{
  "id": "b24c3df9-faa5-4d99-a2dd-bb23121dc48c",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.853257Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:12:28Z",
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
  "command_id": "cb51ef91-6054-4662-89c1-292bdb44d7f8",
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
  "id": "d5cfc7d2-20f1-4daa-9fb2-18dabd5187d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:28.894103Z",
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
  "command_id": "f67d1f8b-92de-46b1-832a-a92287bc7d66",
  "quote_id": "d5cfc7d2-20f1-4daa-9fb2-18dabd5187d5",
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
  "correlation_id": "d46ab55b-7c39-4a0d-8301-7b0586af56c2"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b24c3df9-faa5-4d99-a2dd-bb23121dc48c",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
      "created_at": "2026-10-28T08:12:28.853257Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T11:12:28Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "b626a466-ba7b-4ede-851f-77f0683b668f",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
      "created_at": "2026-10-28T08:12:28.783913Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "b626a466-ba7b-4ede-851f-77f0683b668f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.783913Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/2e61f1b2-285d-42de-85b8-20b10fb9715c` → **200**

```json
{
  "id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
    "id": "23538d59-aefd-415b-b038-86d1bddb5a16",
    "order_id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ee66b6c2-e17a-4635-b09a-28b0961c36cb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T08:12:28.628036Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2e61f1b2-285d-42de-85b8-20b10fb9715c/cancel` → **200**

```json
{
  "command_id": "66866ea2-1087-4e3a-bda1-507538f0a111",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
    "id": "23538d59-aefd-415b-b038-86d1bddb5a16",
    "order_id": "2e61f1b2-285d-42de-85b8-20b10fb9715c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ee66b6c2-e17a-4635-b09a-28b0961c36cb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:12:28.628036Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b626a466-ba7b-4ede-851f-77f0683b668f` → **200**

```json
{
  "id": "b626a466-ba7b-4ede-851f-77f0683b668f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.783913Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b626a466-ba7b-4ede-851f-77f0683b668f/cancel` → **200**

```json
{
  "command_id": "c318d5f3-e0eb-408a-8a19-d08817dcf857",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b626a466-ba7b-4ede-851f-77f0683b668f",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.783913Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b24c3df9-faa5-4d99-a2dd-bb23121dc48c` → **200**

```json
{
  "id": "b24c3df9-faa5-4d99-a2dd-bb23121dc48c",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.853257Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:12:28Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b24c3df9-faa5-4d99-a2dd-bb23121dc48c/cancel` → **200**

```json
{
  "command_id": "178e35d6-70db-481a-9526-6c9a68143a54",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b24c3df9-faa5-4d99-a2dd-bb23121dc48c",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "dda4a373-6a77-4450-99bd-690a7d82594b",
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
  "created_at": "2026-10-28T08:12:28.853257Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-28T11:12:28Z",
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
  "session_id": "550f02c2-0e9f-44d3-ad09-ed38b71f8419",
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
  "last_heartbeat_at": "2026-10-28T08:12:28.49104Z",
  "last_location_at": "2026-10-28T08:12:28.49104Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/550f02c2-0e9f-44d3-ad09-ed38b71f8419/close` → **200**

```json
{
  "command_id": "d5966c1e-213b-485f-9d9a-761007a5709f",
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

Done: orders 2e61f1b2-285d-42de-85b8-20b10fb9715c, b626a466-ba7b-4ede-851f-77f0683b668f, b24c3df9-faa5-4d99-a2dd-bb23121dc48c.

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
  "session_id": "a9312553-ab01-425f-94af-7d00b060b767",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDksImlhdCI6MTc5MzE3NTE0OSwianRpIjoiYjQ5MmE5YjYtNTA3Yi00MGU0LThhYzQtMTUzZTAxNWI1MDQ4Iiwic2lkIjoiYTkzMTI1NTMtYWIwMS00MjVmLTk0YWYtN2QwMGIwNjBiNzY3In0.ZYPRSgMm0tejBORPCrCZN0hdEvcQABDxSr4tBxl1Rrk",
  "access_expires_at": "2026-10-28T08:27:29.426844099Z",
  "refresh_token": "nlYIEaqeNWeS70mkc2QeUSwQm-3tv0idDleK-ZlKYs8",
  "refresh_expires_at": "2026-10-28T20:12:29.426428014Z",
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
  "session_id": "65116fc8-fea0-4ed4-9043-c093c42275d8",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNDksImlhdCI6MTc5MzE3NTE0OSwianRpIjoiNWUxMDQ4MjctYjc2Ny00YmFjLTgyZjEtNGVjMDliYmZlNmE1Iiwic2lkIjoiNjUxMTZmYzgtZmVhMC00ZWQ0LTkwNDMtYzA5M2M0MjI3NWQ4In0.r6U-iUiDV5CoyVIUA-1aXQTWrfosgXfKcj8dQVrfn2Q",
  "access_expires_at": "2026-10-28T08:27:29.672494492Z",
  "refresh_token": "p7wUGtx5sg6BQEMPhzQ6g0SnMiD8pBTpRfpifCMH-So",
  "refresh_expires_at": "2026-10-28T20:12:29.671014139Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28129"
}
```

```json
{
  "challenge_id": "eae8866e-b53b-439a-b87f-747d088e96b8",
  "expires_at": "2026-10-28T08:17:29.743042733Z",
  "resend_available_at": "2026-10-28T08:12:30.743042733Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "159458",
  "sent_at": "2026-10-28T08:12:29.749304008Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eae8866e-b53b-439a-b87f-747d088e96b8",
  "code": "159458",
  "device_ref": "sandbox-28129"
}
```

```json
{
  "session_id": "3fa2b04a-3367-4692-b92b-bd2b5fe81093",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA0OSwiaWF0IjoxNzkzMTc1MTQ5LCJqdGkiOiJlZmEyOWExYi03ZDY2LTQwYjUtOGRmNC0wNjVmZTE5OTZiZTgiLCJzaWQiOiIzZmEyYjA0YS0zMzY3LTQ2OTItYjkyYi1iZDJiNWZlODEwOTMifQ.kNTJ7eqm4Dhr_nUVXYG51n7L7-6MCm4fvF7YlpZ3pJU",
  "access_expires_at": "2026-10-28T08:27:29.804683981Z",
  "refresh_token": "92DnPn04JNOSS4UA6IytjseDbE9VVoBFHXqBwNfi6_4",
  "refresh_expires_at": "2026-11-27T08:12:29.804282977Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:23.523913Z",
  "last_location_at": "2026-10-28T08:12:23.523913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/handover` → **200**

```json
{
  "command_id": "07056776-4f07-4513-a37e-70d7e5b1bf1e",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:23.523913Z",
  "last_location_at": "2026-10-28T08:12:23.523913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:29Z",
    "sequence": 1793175149977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:29.993703Z",
  "last_location_at": "2026-10-28T08:12:29.993703Z",
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
  "command_id": "0cfd3287-8ebb-4e5a-83db-903badabd9d7",
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
  "effective_at": "2026-10-28T08:12:30.060468Z",
  "changed_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T08:12:30.088261517Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7702f799-d0d5-43ef-b928-cc2c75184da5",
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
  "id": "32e2dd76-5b3b-4834-883e-b7c20acfc42b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:17:30.121777Z",
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
  "command_id": "7c0f347e-a3ec-4a8a-85fd-5e5d4ffb2a7f",
  "quote_id": "32e2dd76-5b3b-4834-883e-b7c20acfc42b",
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
    "phone": "+380671115632"
  }
}
```

```json
{
  "id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
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
  "created_at": "2026-10-28T08:12:30.156069Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115632"
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
    "id": "2aba4473-3403-4248-a2cb-53a465b521b4",
    "order_id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
    "expires_at": "2026-10-28T08:12:45.159439Z",
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

`POST /api/driver/v1/offers/2aba4473-3403-4248-a2cb-53a465b521b4/accept` → **200**

```json
{
  "command_id": "31e130cc-e966-4c4f-b726-4ceba201a494"
}
```

```json
{
  "id": "385f2c20-fb8e-45b0-be7d-547e0bf6d4a9",
  "order_id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0608b0d3-f714-44a1-829b-13468658ef6f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0608b0d3-f714-44a1-829b-13468658ef6f",
  "order_id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
  "assignment_id": "385f2c20-fb8e-45b0-be7d-547e0bf6d4a9",
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
    "phone": "+380671115632"
  }
}
```

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:30Z",
    "sequence": 1793175150251
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:30.268421Z",
  "last_location_at": "2026-10-28T08:12:30.268421Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0608b0d3-f714-44a1-829b-13468658ef6f/arrive` → **200**

```json
{
  "command_id": "652a3f78-7fa1-4de7-bd34-53bb2757a39c",
  "expected_version": 0
}
```

```json
{
  "id": "0608b0d3-f714-44a1-829b-13468658ef6f",
  "order_id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
  "assignment_id": "385f2c20-fb8e-45b0-be7d-547e0bf6d4a9",
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
  "arrived_at": "2026-10-28T08:12:30.300207Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115632"
  }
}
```

`POST /api/driver/v1/trips/0608b0d3-f714-44a1-829b-13468658ef6f/start` → **200**

```json
{
  "command_id": "7cdce443-7318-4ec4-8ae2-0ba714b954a4",
  "expected_version": 1
}
```

```json
{
  "id": "0608b0d3-f714-44a1-829b-13468658ef6f",
  "order_id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
  "assignment_id": "385f2c20-fb8e-45b0-be7d-547e0bf6d4a9",
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
  "arrived_at": "2026-10-28T08:12:30.300207Z",
  "started_at": "2026-10-28T08:12:30.338315Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115632"
  }
}
```

`POST /api/driver/v1/trips/0608b0d3-f714-44a1-829b-13468658ef6f/complete` → **200**

```json
{
  "command_id": "397bcc86-33c9-4843-b497-fe3952dc1ee9",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:12:30Z",
  "cash_received": true
}
```

```json
{
  "id": "0608b0d3-f714-44a1-829b-13468658ef6f",
  "order_id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
  "assignment_id": "385f2c20-fb8e-45b0-be7d-547e0bf6d4a9",
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
  "arrived_at": "2026-10-28T08:12:30.300207Z",
  "started_at": "2026-10-28T08:12:30.338315Z",
  "completed_at": "2026-10-28T08:12:30.376255Z",
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
  "command_id": "f728a9f6-18d2-45b9-9d95-4ec6ceee20f8",
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
  "id": "b8da1027-9f84-44e6-8c9b-81d48443b748",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:17:30.413940Z",
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
  "command_id": "9734c13f-8eaa-4479-bb48-840ec60f71a8",
  "quote_id": "b8da1027-9f84-44e6-8c9b-81d48443b748",
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
    "phone": "+3806711128474"
  }
}
```

```json
{
  "id": "5f8e67e6-217d-44f3-937e-f3cb2e0f5a7a",
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
  "created_at": "2026-10-28T08:12:30.448668Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128474"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5f8e67e6-217d-44f3-937e-f3cb2e0f5a7a` → **200**

```json
{
  "id": "5f8e67e6-217d-44f3-937e-f3cb2e0f5a7a",
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
  "created_at": "2026-10-28T08:12:30.448668Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128474"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5f8e67e6-217d-44f3-937e-f3cb2e0f5a7a/cancel` → **200**

```json
{
  "command_id": "5f6fa5d3-468f-412b-b882-d1160fec4f7b",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5f8e67e6-217d-44f3-937e-f3cb2e0f5a7a",
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
  "created_at": "2026-10-28T08:12:30.448668Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128474"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error"
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
  "staff_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T08:12:30.380021Z",
  "last_entries": [
    {
      "order_id": "5f8e67e6-217d-44f3-937e-f3cb2e0f5a7a",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T08:12:30.532255Z"
    },
    {
      "order_id": "63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T08:12:30.380021Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fde5bda3-b735-48c9-b29f-1c4f1601847c",
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
  "last_heartbeat_at": "2026-10-28T08:12:30.268421Z",
  "last_location_at": "2026-10-28T08:12:30.268421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fde5bda3-b735-48c9-b29f-1c4f1601847c/close` → **200**

```json
{
  "command_id": "1ef92e2c-6a40-4c76-8dd4-9bacd6ba1b9c",
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

Done: operator bonus for fulfilled 63c599d3-b9d3-4ebb-ac91-d8ab7ab4114a and operator-fault cancellation 5f8e67e6-217d-44f3-937e-f3cb2e0f5a7a.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678168995",
  "device_ref": "sandbox-24165"
}
```

```json
{
  "challenge_id": "8ba20262-6886-43a0-9ca3-938c9182280b",
  "expires_at": "2026-10-28T08:17:32.663271931Z",
  "resend_available_at": "2026-10-28T08:12:33.663271931Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678168995` → **200**

```json
{
  "phone": "+380678168995",
  "audience": "CLIENT",
  "code": "072193",
  "sent_at": "2026-10-28T08:12:32.665096241Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676854290",
  "device_ref": "sandbox-9139",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "46fb66bb-8c6d-480f-92af-d91f49e5944c",
  "expires_at": "2026-10-28T08:17:32.71079134Z",
  "resend_available_at": "2026-10-28T08:12:33.71079134Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676854290` → **200**

```json
{
  "phone": "+380676854290",
  "audience": "CLIENT",
  "code": "021954",
  "sent_at": "2026-10-28T08:12:32.712459512Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672400000",
  "device_ref": "sandbox-8567"
}
```

```json
{
  "challenge_id": "674a8905-b75c-4c2e-9838-80bb51223eac",
  "expires_at": "2026-10-28T08:17:32.759851752Z",
  "resend_available_at": "2026-10-28T08:12:33.759851752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672400000` → **200**

```json
{
  "phone": "+380672400000",
  "audience": "CLIENT",
  "code": "027914",
  "sent_at": "2026-10-28T08:12:32.762203685Z",
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
  "session_id": "cc210347-667d-4a2a-8cab-d1aeca7abd05",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNTMsImlhdCI6MTc5MzE3NTE1MywianRpIjoiN2ZiM2QxOWItMWE2MC00NjMwLWFmMzMtZWIxYWUyMDUxNzdlIiwic2lkIjoiY2MyMTAzNDctNjY3ZC00YTJhLThjYWItZDFhZWNhN2FiZDA1In0.KHEOEiikX4a09KwSorr9HZaPPrrCqTOEGI0kHXabSIk",
  "access_expires_at": "2026-10-28T08:27:33.023344647Z",
  "refresh_token": "9DZPHLRqpfRlKneQjBJiFX3heGglS6LkSjcGkBXbwTs",
  "refresh_expires_at": "2026-10-28T20:12:33.022844955Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672400000` → **200**

```json
{
  "deliveries": [
    {
      "id": "27a7ae79-dc21-4ea1-a9d7-8a57706e0379",
      "challenge_id": "674a8905-b75c-4c2e-9838-80bb51223eac",
      "phone": "+380672400000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b4cc4f8d-ce9d-4997-9e83-d7964b523254",
      "error": null,
      "attempted_at": "2026-10-28T08:12:32.762446Z"
    },
    {
      "id": "5c32e727-6591-4105-a97b-a1f01fa11ef2",
      "challenge_id": "674a8905-b75c-4c2e-9838-80bb51223eac",
      "phone": "+380672400000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T08:12:32.761713Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672400000` → **200**

```json
{
  "phone": "+380672400000",
  "audience": "CLIENT",
  "code": "027914",
  "sent_at": "2026-10-28T08:12:32.762203685Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676854290` → **200**

```json
{
  "deliveries": [
    {
      "id": "b6ad585e-f0df-4fcc-9b8e-bc3dc916239b",
      "challenge_id": "46fb66bb-8c6d-480f-92af-d91f49e5944c",
      "phone": "+380676854290",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8f7239d5-4f48-4d9c-803d-e0ecfaa9a482",
      "error": null,
      "attempted_at": "2026-10-28T08:12:32.712776Z"
    }
  ]
}
```

Done: SMS to +380678168995, a call to +380676854290, SMS then a call to +380672400000.

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
  "session_id": "f9c35a11-72f8-4719-996f-ebf15be4baeb",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNTMsImlhdCI6MTc5MzE3NTE1MywianRpIjoiYzEwYjM5OTgtZTAwMC00ODdiLTkyMmMtN2NkY2JhZjEwNTYxIiwic2lkIjoiZjljMzVhMTEtNzJmOC00NzE5LTk5NmYtZWJmMTViZTRiYWViIn0.BaLBruLWFzjdo78GWKijtjypNZsjHCPT7MQxdPZb8EE",
  "access_expires_at": "2026-10-28T08:27:33.345165557Z",
  "refresh_token": "_mtytV5mZG_EjGv9Lj3ro85Y1_D3ocVIGoq2Dk_5yGI",
  "refresh_expires_at": "2026-10-28T20:12:33.344807037Z",
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
  "session_id": "6740fd58-0a0e-4f53-b5c8-54bca114b64f",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNTMsImlhdCI6MTc5MzE3NTE1MywianRpIjoiNDA4YzQyMWQtMDYzNC00NjYwLWJlYjMtZWJiZmU1NzJlYzEzIiwic2lkIjoiNjc0MGZkNTgtMGEwZS00ZjUzLWI1YzgtNTRiY2ExMTRiNjRmIn0.pWYB62qRZJZApI4wgNYU9sTMMfOZQaxdKCNeKrqQea0",
  "access_expires_at": "2026-10-28T08:27:33.59331432Z",
  "refresh_token": "nJiQ7Ee3k-hWgNHdSX93PCnL_0qjUv2czNt95RPWwkw",
  "refresh_expires_at": "2026-10-28T20:12:33.592988078Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
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

`POST /api/admin/v1/staff-extensions/b53b6cec-f440-4bb2-b44a-c6654bb41997` → **200**

```json
{
  "command_id": "c1ae83f7-1075-429f-8312-bbac72002be0",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ccbb386a-9c89-4b4c-84f5-b4e37b094634",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:12:33.713472Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:12:33.713472Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9d880ef1-80cb-4c22-8f5e-73182410539c",
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
  "id": "75a25381-dbb1-47bd-bea2-5defd3e1f6c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:33.768088Z",
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
  "command_id": "9e612ed7-75bc-44ff-bc5a-4b02098371e1",
  "quote_id": "75a25381-dbb1-47bd-bea2-5defd3e1f6c9",
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
    "phone": "+380674484825"
  }
}
```

```json
{
  "id": "11cefd8e-425b-46ee-b23a-cfc55090412c",
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
  "created_at": "2026-10-28T08:12:33.800687Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674484825"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/11cefd8e-425b-46ee-b23a-cfc55090412c/calls` → **201**

```json
{
  "command_id": "094ff038-2430-425e-b916-aaf681ec4e07",
  "to": "CALLER"
}
```

```json
{
  "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "order_ids": [
    "11cefd8e-425b-46ee-b23a-cfc55090412c"
  ],
  "started_at": "2026-10-28T08:12:33.841985Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/11cefd8e-425b-46ee-b23a-cfc55090412c/calls` → **201**

```json
{
  "command_id": "094ff038-2430-425e-b916-aaf681ec4e07",
  "to": "CALLER"
}
```

```json
{
  "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "order_ids": [
    "11cefd8e-425b-46ee-b23a-cfc55090412c"
  ],
  "started_at": "2026-10-28T08:12:33.841985Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674484825",
    "at": "2026-10-28T08:12:33.843752976Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.19251",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "e9c86736-560a-49e0-a8cd-3e1d33046441"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=11cefd8e-425b-46ee-b23a-cfc55090412c` → **200**

```json
{
  "calls": [
    {
      "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [
        "11cefd8e-425b-46ee-b23a-cfc55090412c"
      ],
      "started_at": "2026-10-28T08:12:33.841985Z",
      "answered_at": "2026-10-28T08:12:33.964908Z",
      "ended_at": "2026-10-28T08:12:33.983791Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=11cefd8e-425b-46ee-b23a-cfc55090412c` → **200**

```json
{
  "calls": [
    {
      "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [
        "11cefd8e-425b-46ee-b23a-cfc55090412c"
      ],
      "started_at": "2026-10-28T08:12:33.841985Z",
      "answered_at": "2026-10-28T08:12:33.964908Z",
      "ended_at": "2026-10-28T08:12:33.983791Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=11cefd8e-425b-46ee-b23a-cfc55090412c` → **200**

```json
{
  "calls": [
    {
      "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [
        "11cefd8e-425b-46ee-b23a-cfc55090412c"
      ],
      "started_at": "2026-10-28T08:12:33.841985Z",
      "answered_at": "2026-10-28T08:12:33.964908Z",
      "ended_at": "2026-10-28T08:12:33.983791Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=11cefd8e-425b-46ee-b23a-cfc55090412c` → **200**

```json
{
  "calls": [
    {
      "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [
        "11cefd8e-425b-46ee-b23a-cfc55090412c"
      ],
      "started_at": "2026-10-28T08:12:33.841985Z",
      "answered_at": "2026-10-28T08:12:33.964908Z",
      "ended_at": "2026-10-28T08:12:33.983791Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=11cefd8e-425b-46ee-b23a-cfc55090412c` → **200**

```json
{
  "calls": [
    {
      "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [
        "11cefd8e-425b-46ee-b23a-cfc55090412c"
      ],
      "started_at": "2026-10-28T08:12:33.841985Z",
      "answered_at": "2026-10-28T08:12:33.964908Z",
      "ended_at": "2026-10-28T08:12:33.983791Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=11cefd8e-425b-46ee-b23a-cfc55090412c` → **200**

```json
{
  "calls": [
    {
      "id": "e9c86736-560a-49e0-a8cd-3e1d33046441",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "order_ids": [
        "11cefd8e-425b-46ee-b23a-cfc55090412c"
      ],
      "started_at": "2026-10-28T08:12:33.841985Z",
      "answered_at": "2026-10-28T08:12:33.964908Z",
      "ended_at": "2026-10-28T08:12:33.983791Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:12:43.068228Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/11cefd8e-425b-46ee-b23a-cfc55090412c` → **200**

```json
{
  "id": "11cefd8e-425b-46ee-b23a-cfc55090412c",
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
  "created_at": "2026-10-28T08:12:33.800687Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674484825"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/11cefd8e-425b-46ee-b23a-cfc55090412c/cancel` → **200**

```json
{
  "command_id": "f6e37b26-65e7-406c-bd3a-3e669a9cddf9",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "11cefd8e-425b-46ee-b23a-cfc55090412c",
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
  "created_at": "2026-10-28T08:12:33.800687Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674484825"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
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
  "command_id": "23b3bcfd-2f03-41a7-82aa-8d2c5aae43d6",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T08:12:44.254019Z",
  "extension": "101"
}
```

Done: outgoing call e9c86736-560a-49e0-a8cd-3e1d33046441 from order 11cefd8e-425b-46ee-b23a-cfc55090412c, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631661463",
  "device_ref": "sandbox-18286"
}
```

```json
{
  "challenge_id": "644acb9c-382d-4224-8815-c6da7e084f0d",
  "expires_at": "2026-10-28T08:17:44.294443252Z",
  "resend_available_at": "2026-10-28T08:12:45.294443252Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631661463` → **200**

```json
{
  "phone": "+380631661463",
  "audience": "CLIENT",
  "code": "011944",
  "sent_at": "2026-10-28T08:12:44.296593996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "644acb9c-382d-4224-8815-c6da7e084f0d",
  "code": "011944",
  "device_ref": "sandbox-18286"
}
```

```json
{
  "session_id": "ee9fbe6c-337e-471b-9dfa-2e5d92c9dcde",
  "subject": {
    "type": "CLIENT",
    "id": "d7da6649-e392-46d6-9c51-2e3edef43ff6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkN2RhNjY0OS1lMzkyLTQ2ZDYtOWM1MS0yZTNlZGVmNDNmZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDY0LCJpYXQiOjE3OTMxNzUxNjQsImp0aSI6IjI1MTNlNWYxLTI2NjktNDFlZS1hYWE1LTU2NTJkZjE3MDVmYyIsInNpZCI6ImVlOWZiZTZjLTMzN2UtNDcxYi05ZGZhLTJlNWQ5MmM5ZGNkZSJ9.iYcImcx8JoJ030Zh_AYLK-cGvtL8EHsD4jby-7FJU6k",
  "access_expires_at": "2026-10-28T08:27:44.348717355Z",
  "refresh_token": "9kwWub_0ahFe6ZlCPiQnL88HtYIaKjtLjeVLCji11wM",
  "refresh_expires_at": "2026-11-27T08:12:44.348289095Z",
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
  "session_id": "4a057f77-6904-43d9-8948-2a06ede1ee05",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNjQsImlhdCI6MTc5MzE3NTE2NCwianRpIjoiZWI5ODZlMDYtODE4Yy00MmU1LWE3YjYtMGY1NmZmMGYwNTUwIiwic2lkIjoiNGEwNTdmNzctNjkwNC00M2Q5LTg5NDgtMmEwNmVkZTFlZTA1In0.dnF4JAAf_YX0-CILpXp0-Wxwd8yRK_6YhEmQXS622zY",
  "access_expires_at": "2026-10-28T08:27:44.667625156Z",
  "refresh_token": "9YeawGLOhvliF9mcFWgkWrSnJXRxTXtUV0l-HarCSyw",
  "refresh_expires_at": "2026-10-28T20:12:44.667275409Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631661463` → **200**

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
  "correlation_id": "124f5885-8fe7-46b1-a752-f703d1569b3e"
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
  "session_id": "df214c3e-4a96-4ba7-b137-b44e03f8318a",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNjQsImlhdCI6MTc5MzE3NTE2NCwianRpIjoiYTlhNGJjNWUtMGE3Ny00ODg5LWI4ODQtM2QxM2RlNGZjMGE3Iiwic2lkIjoiZGYyMTRjM2UtNGE5Ni00YmE3LWIxMzctYjQ0ZTAzZjgzMThhIn0.W4Ja91Bo4p8So2QbunUxSZ5zbCaFbfXvsRIxeS5cElg",
  "access_expires_at": "2026-10-28T08:27:44.95517397Z",
  "refresh_token": "BLyJkYgRD96kdiPvMWyqcFwq1e_HNYUT1afvbpff2Ew",
  "refresh_expires_at": "2026-10-28T20:12:44.954821764Z",
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
  "command_id": "1b0af130-4194-4f0b-9191-1147536e3000",
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
  "changed_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T08:12:45.026789284Z"
}
```

## The rider books the airport for 2026-10-28T11:12:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600355314",
  "device_ref": "sandbox-23169"
}
```

```json
{
  "challenge_id": "c1f84d31-d498-47ec-9af3-1f16168af1cb",
  "expires_at": "2026-10-28T08:17:45.053841919Z",
  "resend_available_at": "2026-10-28T08:12:46.053841919Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600355314` → **200**

```json
{
  "phone": "+48600355314",
  "audience": "CLIENT",
  "code": "980328",
  "sent_at": "2026-10-28T08:12:45.055501288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1f84d31-d498-47ec-9af3-1f16168af1cb",
  "code": "980328",
  "device_ref": "sandbox-23169"
}
```

```json
{
  "session_id": "2e222944-939c-4a2d-9904-bba78a464b9b",
  "subject": {
    "type": "CLIENT",
    "id": "c4d4ded7-0e47-47e2-b84e-4aa92d77dc26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGQ0ZGVkNy0wZTQ3LTQ3ZTItYjg0ZS00YWE5MmQ3N2RjMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDY1LCJpYXQiOjE3OTMxNzUxNjUsImp0aSI6IjlkY2UxYmFjLWVlYjQtNDBhNi04ZmQ2LWNlYWEzY2Y4ZDQxOSIsInNpZCI6IjJlMjIyOTQ0LTkzOWMtNGEyZC05OTA0LWJiYTc4YTQ2NGI5YiJ9.YEj2udy9x2tgh1VwyYRFsds8jj64VQKWMJ6fA-DBEZI",
  "access_expires_at": "2026-10-28T08:27:45.106755323Z",
  "refresh_token": "GlcjM09Gy5nKNKiJCqZyZOum0x2lZPWE7pDeQsZDW_Y",
  "refresh_expires_at": "2026-11-27T08:12:45.106293828Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5cab7700-1bda-4cf7-b0ab-debb8c5ec945",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T11:12:44Z"
}
```

```json
{
  "id": "7f862b6d-2d1c-4d68-8a44-954fc2023269",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T08:17:45.139424Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:12:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c0f41766-c275-4b63-bafc-704dec84575e",
  "quote_id": "7f862b6d-2d1c-4d68-8a44-954fc2023269",
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
  "pickup_at": "2026-10-28T11:12:44Z"
}
```

```json
{
  "id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c4d4ded7-0e47-47e2-b84e-4aa92d77dc26",
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
  "created_at": "2026-10-28T08:12:45.173955Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:12:44Z",
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
  "device_ref": "sandbox-24558"
}
```

```json
{
  "challenge_id": "4a264f99-def3-43db-a520-b82740581a61",
  "expires_at": "2026-10-28T08:17:45.203800849Z",
  "resend_available_at": "2026-10-28T08:12:46.203800849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "825904",
  "sent_at": "2026-10-28T08:12:45.205769854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a264f99-def3-43db-a520-b82740581a61",
  "code": "825904",
  "device_ref": "sandbox-24558"
}
```

```json
{
  "session_id": "e77d28df-22c2-4767-831c-f2bd8e898620",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA2NSwiaWF0IjoxNzkzMTc1MTY1LCJqdGkiOiIzOGJkNTI5MC0yZGRiLTQ0ZWQtODNjNC1iMzljYTFlMDA2N2UiLCJzaWQiOiJlNzdkMjhkZi0yMmMyLTQ3NjctODMxYy1mMmJkOGU4OTg2MjAifQ.9fP-Njq1MF8Eu6LSydiFL8bGZlL3rAaGOOa3av3veSY",
  "access_expires_at": "2026-10-28T08:27:45.253194164Z",
  "refresh_token": "IW67jY7glOTGrQMT-oPvdELqFknAuVGuOhWTva3xSv0",
  "refresh_expires_at": "2026-11-27T08:12:45.252818018Z",
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
  "command_id": "585b2e56-5c6a-4cb6-ad3d-cda17f2d9d3c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:45Z",
    "sequence": 1793175165296
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71",
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
  "last_heartbeat_at": "2026-10-28T08:12:45.31188Z",
  "last_location_at": "2026-10-28T08:12:45.31188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
      "short_number": 17,
      "pickup_at": "2026-10-28T11:12:44Z",
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

`POST /api/driver/v1/preorders/c3aeb354-f711-446a-bc5b-2e32bf517992/reserve` → **200**

```json
{
  "command_id": "90f1e7e9-dba9-4b8e-8346-86df7198fb42"
}
```

```json
{
  "id": "0d0bc9e7-e876-429c-8d6e-8708fe98a77c",
  "state": "RESERVED",
  "order": {
    "order_id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
    "short_number": 17,
    "pickup_at": "2026-10-28T11:12:44Z",
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
  "reserved_at": "2026-10-28T08:12:45.371673Z",
  "confirm_from": "2026-10-28T10:42:44Z",
  "confirm_until": "2026-10-28T10:52:44Z",
  "drop_until": "2026-10-28T10:12:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "0d0bc9e7-e876-429c-8d6e-8708fe98a77c",
      "state": "RESERVED",
      "order": {
        "order_id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
        "short_number": 17,
        "pickup_at": "2026-10-28T11:12:44Z",
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
      "reserved_at": "2026-10-28T08:12:45.371673Z",
      "confirm_from": "2026-10-28T10:42:44Z",
      "confirm_until": "2026-10-28T10:52:44Z",
      "drop_until": "2026-10-28T10:12:44Z"
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
      "id": "0d0bc9e7-e876-429c-8d6e-8708fe98a77c",
      "state": "RESERVED",
      "order": {
        "order_id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
        "short_number": 17,
        "pickup_at": "2026-10-28T11:12:44Z",
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
      "reserved_at": "2026-10-28T08:12:45.371673Z",
      "confirm_from": "2026-10-28T10:42:44Z",
      "confirm_until": "2026-10-28T10:52:44Z",
      "drop_until": "2026-10-28T10:12:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/0d0bc9e7-e876-429c-8d6e-8708fe98a77c/confirm` → **409**

```json
{
  "command_id": "f6e8cfa8-fb94-42f9-9d6a-846b35b06f1d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/0d0bc9e7-e876-429c-8d6e-8708fe98a77c/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "155cabe8-198a-489f-86d2-3aec11f23746"
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
  "session_id": "1b9d9af6-dbe9-41da-8369-e658ef70511e",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNjUsImlhdCI6MTc5MzE3NTE2NSwianRpIjoiMjRhOGM4YzUtNGFkOC00N2UwLWEyNDctNzQyODJjNTA0ZmQ2Iiwic2lkIjoiMWI5ZDlhZjYtZGJlOS00MWRhLTgzNjktZTY1OGVmNzA1MTFlIn0.16vmmwHh2IsXP9XlBvwBE_05FWJf5MjUW4eNpLo6SxM",
  "access_expires_at": "2026-10-28T08:27:45.676526431Z",
  "refresh_token": "XhWtX1XZY-jcFhYV_Mp5HD2ypLoJRD9oINoawTRu3a4",
  "refresh_expires_at": "2026-10-28T20:12:45.676179589Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c3aeb354-f711-446a-bc5b-2e32bf517992` → **200**

```json
{
  "id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c4d4ded7-0e47-47e2-b84e-4aa92d77dc26",
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
  "created_at": "2026-10-28T08:12:45.173955Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T11:12:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "0d0bc9e7-e876-429c-8d6e-8708fe98a77c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T08:12:45.371673Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c3aeb354-f711-446a-bc5b-2e32bf517992/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T08:12:45.175128Z",
      "actor": {
        "type": "CLIENT",
        "id": "c4d4ded7-0e47-47e2-b84e-4aa92d77dc26",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
        "preorder": true,
        "quote_id": "7f862b6d-2d1c-4d68-8a44-954fc2023269",
        "pickup_at": "2026-10-28T11:12:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T08:12:45.372512Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c3aeb354-f711-446a-bc5b-2e32bf517992",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "0d0bc9e7-e876-429c-8d6e-8708fe98a77c"
      }
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order c3aeb354-f711-446a-bc5b-2e32bf517992, reservation 0d0bc9e7-e876-429c-8d6e-8708fe98a77c.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5949"
}
```

```json
{
  "challenge_id": "be181949-d478-4b64-9721-2d036f580d63",
  "expires_at": "2026-10-28T08:17:45.756090302Z",
  "resend_available_at": "2026-10-28T08:12:46.756090302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "874465",
  "sent_at": "2026-10-28T08:12:45.757743601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be181949-d478-4b64-9721-2d036f580d63",
  "code": "874465",
  "device_ref": "sandbox-5949"
}
```

```json
{
  "session_id": "4637f2b7-fd6f-4e71-9b2c-f727ecb361fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA2NSwiaWF0IjoxNzkzMTc1MTY1LCJqdGkiOiJiYTJkYzM0YS1jMmY4LTRmZDgtODlkMi02ZDA5Y2E3ZjQ5ZTgiLCJzaWQiOiI0NjM3ZjJiNy1mZDZmLTRlNzEtOWIyYy1mNzI3ZWNiMzYxZmUifQ.1KjmtNO2G_qYs7BdLB2vNx7EtSoO5IwTOfyDR89AWrI",
  "access_expires_at": "2026-10-28T08:27:45.806396997Z",
  "refresh_token": "ixBMeHzm7gUNfoXMCc5vrtZWL-OGgNvdqQwGG8S0JPA",
  "refresh_expires_at": "2026-11-27T08:12:45.805995462Z",
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
  "command_id": "144c555e-cbc7-4a8e-91f7-f14f31c79146",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:45Z",
    "sequence": 1793175165851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97532f5-4ca2-4785-a8ed-6d31669135d2",
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
  "last_heartbeat_at": "2026-10-28T08:12:45.867189Z",
  "last_location_at": "2026-10-28T08:12:45.867189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672500174",
  "device_ref": "sandbox-10110"
}
```

```json
{
  "challenge_id": "9de174d6-4537-428f-aa3f-dddc6ebd7d9e",
  "expires_at": "2026-10-28T08:17:45.89188925Z",
  "resend_available_at": "2026-10-28T08:12:46.89188925Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672500174` → **200**

```json
{
  "phone": "+380672500174",
  "audience": "CLIENT",
  "code": "555312",
  "sent_at": "2026-10-28T08:12:45.893575739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9de174d6-4537-428f-aa3f-dddc6ebd7d9e",
  "code": "555312",
  "device_ref": "sandbox-10110"
}
```

```json
{
  "session_id": "0c2294ec-b5ab-41c6-be70-9eab7f8596cb",
  "subject": {
    "type": "CLIENT",
    "id": "35db6a4e-e5ab-4ef7-8fd8-1ba116d739e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWRiNmE0ZS1lNWFiLTRlZjctOGZkOC0xYmExMTZkNzM5ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDY1LCJpYXQiOjE3OTMxNzUxNjUsImp0aSI6IjdiZTQ0MzBiLWE4ZmMtNGQ1Ni05ZTZhLWQzZDAxYTE3N2M3NSIsInNpZCI6IjBjMjI5NGVjLWI1YWItNDFjNi1iZTcwLTllYWI3Zjg1OTZjYiJ9.nAjgK7klsyARwYwjj_UfD32ozx6VhuWBXF4T8738FLg",
  "access_expires_at": "2026-10-28T08:27:45.941328492Z",
  "refresh_token": "0HUFJTM5LGYuu3HqJACGa0csJU_ZpEYLt3OkUHZ2zKo",
  "refresh_expires_at": "2026-11-27T08:12:45.940860322Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "78e7d870-3840-4f67-b92f-c608f9c1bcbc",
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
  "id": "62ffc35a-4016-43c9-b0c3-b80c1c9d8077",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:17:45.974907Z",
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
  "command_id": "3e1d21c8-72cb-4207-88e6-dbc90c950d3a",
  "quote_id": "62ffc35a-4016-43c9-b0c3-b80c1c9d8077",
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
  "id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "35db6a4e-e5ab-4ef7-8fd8-1ba116d739e4",
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
  "created_at": "2026-10-28T08:12:46.006473Z",
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
    "id": "0f340317-3a40-4e58-87e6-181847905489",
    "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
    "expires_at": "2026-10-28T08:13:01.008416Z",
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

`POST /api/driver/v1/offers/0f340317-3a40-4e58-87e6-181847905489/accept` → **200**

```json
{
  "command_id": "c544fbcf-ac6b-4bb0-8039-bac5ae1ba96f"
}
```

```json
{
  "id": "d8dee1f9-28e3-489d-b110-7b0e20bb22c9",
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9353d1f8-a3b0-444f-a0e0-4185c75c8bdd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9353d1f8-a3b0-444f-a0e0-4185c75c8bdd",
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "assignment_id": "d8dee1f9-28e3-489d-b110-7b0e20bb22c9",
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

`POST /api/driver/v1/work-sessions/e97532f5-4ca2-4785-a8ed-6d31669135d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:46Z",
    "sequence": 1793175166100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97532f5-4ca2-4785-a8ed-6d31669135d2",
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
  "last_heartbeat_at": "2026-10-28T08:12:46.116674Z",
  "last_location_at": "2026-10-28T08:12:46.116674Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9353d1f8-a3b0-444f-a0e0-4185c75c8bdd",
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "assignment_id": "d8dee1f9-28e3-489d-b110-7b0e20bb22c9",
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

`POST /api/driver/v1/trips/9353d1f8-a3b0-444f-a0e0-4185c75c8bdd/arrive` → **200**

```json
{
  "command_id": "a2b24d4e-1cea-4290-a308-0fdcd6433370",
  "expected_version": 0
}
```

```json
{
  "id": "9353d1f8-a3b0-444f-a0e0-4185c75c8bdd",
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "assignment_id": "d8dee1f9-28e3-489d-b110-7b0e20bb22c9",
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
  "arrived_at": "2026-10-28T08:12:46.1602Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9353d1f8-a3b0-444f-a0e0-4185c75c8bdd/start` → **200**

```json
{
  "command_id": "14fcf253-a580-477a-8225-1ebafd12a913",
  "expected_version": 1
}
```

```json
{
  "id": "9353d1f8-a3b0-444f-a0e0-4185c75c8bdd",
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "assignment_id": "d8dee1f9-28e3-489d-b110-7b0e20bb22c9",
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
  "arrived_at": "2026-10-28T08:12:46.1602Z",
  "started_at": "2026-10-28T08:12:46.188498Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e97532f5-4ca2-4785-a8ed-6d31669135d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:46Z",
    "sequence": 1793175166208
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97532f5-4ca2-4785-a8ed-6d31669135d2",
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
  "last_heartbeat_at": "2026-10-28T08:12:46.224405Z",
  "last_location_at": "2026-10-28T08:12:46.224405Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/9353d1f8-a3b0-444f-a0e0-4185c75c8bdd/complete` → **200**

```json
{
  "command_id": "39e4a55c-9c2f-4c73-8fb7-40d55506deff",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:12:46Z",
  "cash_received": true
}
```

```json
{
  "id": "9353d1f8-a3b0-444f-a0e0-4185c75c8bdd",
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "assignment_id": "d8dee1f9-28e3-489d-b110-7b0e20bb22c9",
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
  "arrived_at": "2026-10-28T08:12:46.1602Z",
  "started_at": "2026-10-28T08:12:46.188498Z",
  "completed_at": "2026-10-28T08:12:46.258049Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/859ca411-6253-4dcc-a556-b985f17f5545/rating` → **200**

```json
{
  "command_id": "71563295-f48d-4115-b7d6-51f3ebc971a5",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "score": 5,
  "created_at": "2026-10-28T08:12:46.298384026Z"
}
```

`POST /api/driver/v1/orders/859ca411-6253-4dcc-a556-b985f17f5545/rating` → **200**

```json
{
  "command_id": "658a1600-e83f-43f0-8d87-881c27afd806",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
  "score": 4,
  "created_at": "2026-10-28T08:12:46.329868813Z"
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
  "session_id": "b36ab5dd-16b7-49cd-af26-bd63230fcba5",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNjYsImlhdCI6MTc5MzE3NTE2NiwianRpIjoiZDVkMjY1ODgtMjQwMi00OWI4LThhNzYtMmZhZThhYzZhY2JjIiwic2lkIjoiYjM2YWI1ZGQtMTZiNy00OWNkLWFmMjYtYmQ2MzIzMGZjYmE1In0.ob85ukHJP6afQmK0k_IUOMA2XRh2O39v_GAFsbdDbbE",
  "access_expires_at": "2026-10-28T08:27:46.592581885Z",
  "refresh_token": "eIw5yiotB3O3-ZUs7DizT7or97AylpUAPU-yR80isB0",
  "refresh_expires_at": "2026-10-28T20:12:46.592229925Z",
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
  "session_id": "b7070648-343f-46a7-909d-bd7650a6ed26",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNjYsImlhdCI6MTc5MzE3NTE2NiwianRpIjoiNWVjZDcxZmEtYjk0NC00NTY5LThhMzMtODg4YTcxZjU4ZTcwIiwic2lkIjoiYjcwNzA2NDgtMzQzZi00NmE3LTkwOWQtYmQ3NjUwYTZlZDI2In0.y8JYn-SZRFtHW6KPLChpMMYiivcfF70tYPVT5HJqAsg",
  "access_expires_at": "2026-10-28T08:27:46.820085323Z",
  "refresh_token": "PKgCnB7r8vU0apta7pe2H0fk1aBeA6drOjimW0xJkHk",
  "refresh_expires_at": "2026-10-28T20:12:46.819756008Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/859ca411-6253-4dcc-a556-b985f17f5545/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
      "author_type": "RIDER",
      "author_id": "35db6a4e-e5ab-4ef7-8fd8-1ba116d739e4",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T08:12:46.298384Z"
    },
    {
      "order_id": "859ca411-6253-4dcc-a556-b985f17f5545",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "35db6a4e-e5ab-4ef7-8fd8-1ba116d739e4",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T08:12:46.329869Z"
    }
  ]
}
```

Done: ratings for order 859ca411-6253-4dcc-a556-b985f17f5545.

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
  "session_id": "72916650-8802-44b1-b3ab-c9f78b4f7d73",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNjcsImlhdCI6MTc5MzE3NTE2NywianRpIjoiZGFhY2FiYjgtOWUzNS00NWI1LWI2ODAtMDQwYzM1ZmUyMjU4Iiwic2lkIjoiNzI5MTY2NTAtODgwMi00NGIxLWIzYWItYzlmNzhiNGY3ZDczIn0.sElqmND1H0ts1VjiRg7z-WCxhaV7I0r7rAJnVSh2oCo",
  "access_expires_at": "2026-10-28T08:27:47.095359401Z",
  "refresh_token": "uA12xalIClgFC7FPASePsYLzo_CrJDxLZhLvWX8uDT0",
  "refresh_expires_at": "2026-10-28T20:12:47.095031267Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "31fc3ff8-a1fa-4458-baca-770a155d0ead",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "97a8393c-7386-4e23-991b-8c08911a3078",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:47.129111Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/97a8393c-7386-4e23-991b-8c08911a3078` → **200**

```json
{
  "id": "97a8393c-7386-4e23-991b-8c08911a3078",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:47.129111Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/97a8393c-7386-4e23-991b-8c08911a3078` → **200**

```json
{
  "id": "97a8393c-7386-4e23-991b-8c08911a3078",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:12:47.129111Z",
  "ready_at": "2026-10-28T08:12:48.085616Z",
  "expires_at": "2026-10-29T08:12:48.085616Z"
}
```

`GET /api/admin/v1/reports/exports/97a8393c-7386-4e23-991b-8c08911a3078/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
total,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b77d1174-fb0f-4bd9-aa54-852845542dd6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "15018918-9494-4cbf-8e3b-8b07eeaad8d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:48.238229Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/15018918-9494-4cbf-8e3b-8b07eeaad8d0` → **200**

```json
{
  "id": "15018918-9494-4cbf-8e3b-8b07eeaad8d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:48.238229Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/15018918-9494-4cbf-8e3b-8b07eeaad8d0` → **200**

```json
{
  "id": "15018918-9494-4cbf-8e3b-8b07eeaad8d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:48.238229Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/15018918-9494-4cbf-8e3b-8b07eeaad8d0` → **200**

```json
{
  "id": "15018918-9494-4cbf-8e3b-8b07eeaad8d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:48.238229Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/15018918-9494-4cbf-8e3b-8b07eeaad8d0` → **200**

```json
{
  "id": "15018918-9494-4cbf-8e3b-8b07eeaad8d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:48.238229Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/15018918-9494-4cbf-8e3b-8b07eeaad8d0` → **200**

```json
{
  "id": "15018918-9494-4cbf-8e3b-8b07eeaad8d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:12:48.238229Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/15018918-9494-4cbf-8e3b-8b07eeaad8d0` → **200**

```json
{
  "id": "15018918-9494-4cbf-8e3b-8b07eeaad8d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:12:48.238229Z",
  "ready_at": "2026-10-28T08:12:53.098017Z",
  "expires_at": "2026-10-29T08:12:53.098017Z"
}
```

`GET /api/admin/v1/reports/exports/15018918-9494-4cbf-8e3b-8b07eeaad8d0/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/bfaf169b-ca4d-4f38-a873-5bf8af5540c1` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/bfaf169b-ca4d-4f38-a873-5bf8af5540c1",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "54b85204-6cd6-43f3-8d41-946866346552"
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
  "device_ref": "sandbox-7623"
}
```

```json
{
  "challenge_id": "b0629dff-4085-46d4-b7ec-4bd14ea84560",
  "expires_at": "2026-10-28T08:17:53.470530152Z",
  "resend_available_at": "2026-10-28T08:12:54.470530152Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "410136",
  "sent_at": "2026-10-28T08:12:53.472911391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0629dff-4085-46d4-b7ec-4bd14ea84560",
  "code": "410136",
  "device_ref": "sandbox-7623"
}
```

```json
{
  "session_id": "62403434-6bbd-404b-a67c-92329282f617",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA3MywiaWF0IjoxNzkzMTc1MTczLCJqdGkiOiIwMWFkYmVmMi04MDJkLTRjMWEtYjQwMi00OTk0ODlkNzkzYjMiLCJzaWQiOiI2MjQwMzQzNC02YmJkLTQwNGItYTY3Yy05MjMyOTI4MmY2MTcifQ.XheVv2-ppUEg9mJu4vKRAyY5ra2Uci82RdQv8lpjRiw",
  "access_expires_at": "2026-10-28T08:27:53.521051105Z",
  "refresh_token": "n5Eqvsn5EHwbYrm9ozgv0S_oqsys2ZPDdzVcSU_GsTc",
  "refresh_expires_at": "2026-11-27T08:12:53.520436916Z",
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
  "command_id": "4c8f2a3e-3d15-4674-bb5c-a86a1c649d20",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:53Z",
    "sequence": 1793175173585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "65391f35-f546-42a6-8994-b2c6812ea447",
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
  "last_heartbeat_at": "2026-10-28T08:12:53.600515Z",
  "last_location_at": "2026-10-28T08:12:53.600515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "cc880eac-1379-4400-a2af-4dc705d57e55",
  "points": [
    {
      "sequence": 1793175175636,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:11:55Z"
    },
    {
      "sequence": 1793175175642,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:12:55Z"
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
  "session_id": "363d62c5-e182-4165-a9b0-38fa21712937",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNzUsImlhdCI6MTc5MzE3NTE3NSwianRpIjoiZDc0NmE3NzAtMWZhYi00Mzc3LTljYTgtNmQ0NzZjYWNmNzdmIiwic2lkIjoiMzYzZDYyYzUtZTE4Mi00MTY1LWE5YjAtMzhmYTIxNzEyOTM3In0.evCy-Zn1Q7rUvKRl3jxZulwbfAMsPmOC9DwQpxlnho4",
  "access_expires_at": "2026-10-28T08:27:55.909206245Z",
  "refresh_token": "7Ox9hOSrc5rlWlGjf-lhNJaYjGt7DGUOThzLAJ3fjMU",
  "refresh_expires_at": "2026-10-28T20:12:55.908816088Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": []
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "8be0efad-0533-421d-bb70-8cd7ddd58eeb",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T08:12:55Z",
        "track_point_id": "bc8852ab-82fb-418d-9ea4-7824b078df17",
        "work_session_id": "65391f35-f546-42a6-8994-b2c6812ea447"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T08:12:55Z",
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
  "session_id": "3ea71ed9-8cab-4a81-a6df-d62faf8d1d90",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNzcsImlhdCI6MTc5MzE3NTE3NywianRpIjoiNTVjOTM5OTEtOWYxNy00OGZjLWFlMjctMDNhYzg2MjRmMjIwIiwic2lkIjoiM2VhNzFlZDktOGNhYi00YTgxLWE2ZGYtZDYyZmFmOGQxZDkwIn0.WTR_xZvPbLZZmH2aAuru2KPbST0pjjHiLRx8HZU06ZE",
  "access_expires_at": "2026-10-28T08:27:57.235142711Z",
  "refresh_token": "hTqrlEsMIMkknMj1YXK4fyXkwwvMiFrrOVpNVI-dlE4",
  "refresh_expires_at": "2026-10-28T20:12:57.234780746Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "65391f35-f546-42a6-8994-b2c6812ea447",
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
  "last_heartbeat_at": "2026-10-28T08:12:53.600515Z",
  "last_location_at": "2026-10-28T08:12:53.600515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65391f35-f546-42a6-8994-b2c6812ea447/close` → **200**

```json
{
  "command_id": "d41f9bb7-cd05-4b68-98f8-b8ed20bc9f57",
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
  "session_id": "6d657f48-bded-4dd1-8ed6-b9ce2169ebc8",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNzcsImlhdCI6MTc5MzE3NTE3NywianRpIjoiYzEzMzAwNzYtYmQ2Mi00OWZiLWI3YmMtOTdjODI5MTlkNTRiIiwic2lkIjoiNmQ2NTdmNDgtYmRlZC00ZGQxLThlZDYtYjljZTIxNjllYmM4In0.aWPRltmMOf9QI3aulQhGEsCLrJai0Ne6S24Kjo9zP-Q",
  "access_expires_at": "2026-10-28T08:27:57.551399751Z",
  "refresh_token": "HejPui3WwlOlYsYB5PLkCEt7qcrPa5bu_G7aP4DboTM",
  "refresh_expires_at": "2026-10-28T20:12:57.550926759Z",
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
  "command_id": "5e811094-3410-467a-9ec8-cfb273724e44",
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
  "changed_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:12:57.612129Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "5e811094-3410-467a-9ec8-cfb273724e44",
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
  "changed_by": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:12:57.612129Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48429176196",
  "device_ref": "sandbox-13679"
}
```

```json
{
  "challenge_id": "99130e86-a080-463c-bcc2-fdbae047650f",
  "expires_at": "2026-10-28T08:17:57.677821402Z",
  "resend_available_at": "2026-10-28T08:12:58.677821402Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48429176196` → **200**

```json
{
  "phone": "+48429176196",
  "audience": "CLIENT",
  "code": "549913",
  "sent_at": "2026-10-28T08:12:57.679513525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99130e86-a080-463c-bcc2-fdbae047650f",
  "code": "549913",
  "device_ref": "sandbox-13679"
}
```

```json
{
  "session_id": "568b1b2b-a5ed-416b-bc82-60d6f9e87bf7",
  "subject": {
    "type": "CLIENT",
    "id": "d79c9ac6-ffaa-40a4-b68a-574cf7da3246"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzljOWFjNi1mZmFhLTQwYTQtYjY4YS01NzRjZjdkYTMyNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDc3LCJpYXQiOjE3OTMxNzUxNzcsImp0aSI6ImVmNzA1YjUyLTYyYWUtNDdhZC05Y2Q2LWIxNDNiYTRkYWI5YyIsInNpZCI6IjU2OGIxYjJiLWE1ZWQtNDE2Yi1iYzgyLTYwZDZmOWU4N2JmNyJ9.S49NLOjtTdyeKsJOJAPRBvrG2ZibZDxjI2Jir96L_kc",
  "access_expires_at": "2026-10-28T08:27:57.728093788Z",
  "refresh_token": "a4xX6ZgtqW09n2RgC_nDLIiKx-MSB08rUpHh0fKvxEk",
  "refresh_expires_at": "2026-11-27T08:12:57.727631552Z",
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
  "correlation_id": "977b4020-0aae-4295-8f06-b1c6a4a82b83"
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
  "device_ref": "sandbox-16404"
}
```

```json
{
  "challenge_id": "2da7b56a-597e-4154-82c8-3f5e664c64d2",
  "expires_at": "2026-10-28T08:17:57.798888022Z",
  "resend_available_at": "2026-10-28T08:12:58.798888022Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "653082",
  "sent_at": "2026-10-28T08:12:57.800536412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2da7b56a-597e-4154-82c8-3f5e664c64d2",
  "code": "653082",
  "device_ref": "sandbox-16404"
}
```

```json
{
  "session_id": "338a97c1-e7d8-4fdd-b276-d81e6acccad4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA3NywiaWF0IjoxNzkzMTc1MTc3LCJqdGkiOiJjYmFlZjRjOC0xM2Q3LTQwY2UtYWRjOC0xYWUzMzNjM2RhYTEiLCJzaWQiOiIzMzhhOTdjMS1lN2Q4LTRmZGQtYjI3Ni1kODFlNmFjY2NhZDQifQ.eD7y2i5wxNNqzILPhJA6UlQUKr2iH3QR7xbCwpuRDJg",
  "access_expires_at": "2026-10-28T08:27:57.847982381Z",
  "refresh_token": "81kPRwSyo-qqRK7iB_I0O1EVprVz-QD5N3-72Xah0oM",
  "refresh_expires_at": "2026-11-27T08:12:57.847520532Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71",
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
  "last_heartbeat_at": "2026-10-28T08:12:45.31188Z",
  "last_location_at": "2026-10-28T08:12:45.31188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71/handover` → **200**

```json
{
  "command_id": "d14be147-8461-46d9-a9ab-4f82139e653b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71",
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
  "last_heartbeat_at": "2026-10-28T08:12:45.31188Z",
  "last_location_at": "2026-10-28T08:12:45.31188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:57Z",
    "sequence": 1793175177918
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71",
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
  "last_heartbeat_at": "2026-10-28T08:12:57.934288Z",
  "last_location_at": "2026-10-28T08:12:57.934288Z",
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
  "session_id": "14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71",
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
  "last_heartbeat_at": "2026-10-28T08:12:57.934288Z",
  "last_location_at": "2026-10-28T08:12:57.934288Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/14dc8542-1cd8-4893-a2bc-b5b9d6ac6b71/close` → **200**

```json
{
  "command_id": "abaf7f64-0881-4742-bc16-87f3f3786288",
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
  "correlation_id": "9d7ee993-46cd-490d-9876-a8e438ccb353"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671257353",
  "device_ref": "sandbox-32745"
}
```

```json
{
  "challenge_id": "7fe64c05-4b5f-4d0a-b8c6-9e6076b20b5e",
  "expires_at": "2026-10-28T08:17:58.071923293Z",
  "resend_available_at": "2026-10-28T08:12:59.071923293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671257353` → **200**

```json
{
  "phone": "+380671257353",
  "audience": "CLIENT",
  "code": "605649",
  "sent_at": "2026-10-28T08:12:58.073697733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fe64c05-4b5f-4d0a-b8c6-9e6076b20b5e",
  "code": "605649",
  "device_ref": "sandbox-32745"
}
```

```json
{
  "session_id": "b25f869f-1155-4510-b429-157a3f512440",
  "subject": {
    "type": "CLIENT",
    "id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTBiMWE1Zi05YmU2LTQ3MjYtYjlmZi1hYTFjNDBmNmI0MjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MDc4LCJpYXQiOjE3OTMxNzUxNzgsImp0aSI6IjlmYWQxNmQ4LTkyMGUtNDQ0MC05NTE3LTZkNjJlNjIwYTI3NCIsInNpZCI6ImIyNWY4NjlmLTExNTUtNDUxMC1iNDI5LTE1N2EzZjUxMjQ0MCJ9.-QSdCsHPEgBsI2hQC1JS8vl465DOXOnlGchlxouixGU",
  "access_expires_at": "2026-10-28T08:27:58.121352489Z",
  "refresh_token": "du2Ko-LCZgX1Ys881l-Zu4I3Vk_7j9GUx3RhrrtalDs",
  "refresh_expires_at": "2026-11-27T08:12:58.120860528Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "7a174cdf-dcbd-45e4-8a67-057a7e3b1612",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e37567de-4bed-4de5-a2a8-399de44ecd1d",
  "upload_path": "/api/rider/v1/uploads/e37567de-4bed-4de5-a2a8-399de44ecd1d",
  "expires_at": "2026-10-28T08:27:58.151973701Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/e37567de-4bed-4de5-a2a8-399de44ecd1d` → **200**

```json
{
  "file_id": "e37567de-4bed-4de5-a2a8-399de44ecd1d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "23ecb934-d801-4550-9814-b7f68f30265f",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "e37567de-4bed-4de5-a2a8-399de44ecd1d"
  ]
}
```

```json
{
  "id": "24a2858a-35ae-4d1a-a015-cab2f6e2b50d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:12:58.212795Z",
  "updated_at": "2026-10-28T08:12:58.212795Z",
  "messages": [
    {
      "id": "0a0d301c-53e6-4080-b619-31d5eb5a8d36",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:12:58.213984Z",
      "attachments": [
        {
          "file_id": "e37567de-4bed-4de5-a2a8-399de44ecd1d",
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
  "session_id": "2d208311-bfad-4c82-b1a3-450b3f1c1099",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNzgsImlhdCI6MTc5MzE3NTE3OCwianRpIjoiZDgwYmMyMjktNjFhMC00ZTIyLTk1Y2EtMDVmZDAwYzk0ZTczIiwic2lkIjoiMmQyMDgzMTEtYmZhZC00YzgyLWIxYTMtNDUwYjNmMWMxMDk5In0.h-mI3rpBmyFiPgCRYQaCgpR-jdY16Skuxcv85SOxl3w",
  "access_expires_at": "2026-10-28T08:27:58.489646952Z",
  "refresh_token": "f3Lfo263G7rx14jD7HksQqAUp8GKHNF16j9UwmAh09I",
  "refresh_expires_at": "2026-10-28T20:12:58.487954652Z",
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
  "session_id": "8c701e66-246b-47c3-9213-02fc165fa5e8",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNzgsImlhdCI6MTc5MzE3NTE3OCwianRpIjoiMWZjZjBiMjQtYWE3Ni00NDllLTkxNjAtNDg2NzZlN2M5MWU1Iiwic2lkIjoiOGM3MDFlNjYtMjQ2Yi00N2MzLTkyMTMtMDJmYzE2NWZhNWU4In0.Iwd64TdaTBEMNneQbeWF6Fx-ABkrJTSh39QpdFxxyqY",
  "access_expires_at": "2026-10-28T08:27:58.774151148Z",
  "refresh_token": "QSdB0IASC_-Cs27g3pKukAJn1zuzmpW_yMN7d1VOxWY",
  "refresh_expires_at": "2026-10-28T20:12:58.773085011Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/24a2858a-35ae-4d1a-a015-cab2f6e2b50d/attachments/e37567de-4bed-4de5-a2a8-399de44ecd1d` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "6e9e1265-4291-4af6-86ed-f9a47a198571",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "615cd547-e532-4974-be5f-8f278a8383fa",
  "upload_path": "/api/operator/v1/uploads/615cd547-e532-4974-be5f-8f278a8383fa",
  "expires_at": "2026-10-28T08:27:58.822965021Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/615cd547-e532-4974-be5f-8f278a8383fa` → **200**

```json
{
  "file_id": "615cd547-e532-4974-be5f-8f278a8383fa",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/24a2858a-35ae-4d1a-a015-cab2f6e2b50d` → **200**

```json
{
  "id": "24a2858a-35ae-4d1a-a015-cab2f6e2b50d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:12:58.212795Z",
  "updated_at": "2026-10-28T08:12:58.212795Z",
  "messages": [
    {
      "id": "0a0d301c-53e6-4080-b619-31d5eb5a8d36",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:12:58.213984Z",
      "attachments": [
        {
          "file_id": "e37567de-4bed-4de5-a2a8-399de44ecd1d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/24a2858a-35ae-4d1a-a015-cab2f6e2b50d/comments` → **200**

```json
{
  "command_id": "304a290a-4146-4f6a-8f2c-16bde11424de",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "615cd547-e532-4974-be5f-8f278a8383fa"
  ]
}
```

```json
{
  "id": "24a2858a-35ae-4d1a-a015-cab2f6e2b50d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:12:58.212795Z",
  "updated_at": "2026-10-28T08:12:58.912305Z",
  "messages": [
    {
      "id": "0a0d301c-53e6-4080-b619-31d5eb5a8d36",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:12:58.213984Z",
      "attachments": [
        {
          "file_id": "e37567de-4bed-4de5-a2a8-399de44ecd1d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "03270e54-4a17-4a68-b23f-ddbbcd8443b9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b53b6cec-f440-4bb2-b44a-c6654bb41997",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:12:58.912033Z",
      "attachments": [
        {
          "file_id": "615cd547-e532-4974-be5f-8f278a8383fa",
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

`GET /api/rider/v1/support/cases/24a2858a-35ae-4d1a-a015-cab2f6e2b50d` → **200**

```json
{
  "id": "24a2858a-35ae-4d1a-a015-cab2f6e2b50d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:12:58.212795Z",
  "updated_at": "2026-10-28T08:12:58.912305Z",
  "messages": [
    {
      "id": "0a0d301c-53e6-4080-b619-31d5eb5a8d36",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "150b1a5f-9be6-4726-b9ff-aa1c40f6b428",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:12:58.213984Z",
      "attachments": [
        {
          "file_id": "e37567de-4bed-4de5-a2a8-399de44ecd1d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "03270e54-4a17-4a68-b23f-ddbbcd8443b9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:12:58.912033Z",
      "attachments": [
        {
          "file_id": "615cd547-e532-4974-be5f-8f278a8383fa",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/24a2858a-35ae-4d1a-a015-cab2f6e2b50d/attachments/615cd547-e532-4974-be5f-8f278a8383fa` → **200**

Done: support case 24a2858a-35ae-4d1a-a015-cab2f6e2b50d, rider attachment e37567de-4bed-4de5-a2a8-399de44ecd1d, operator attachment 615cd547-e532-4974-be5f-8f278a8383fa.

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
  "session_id": "01db90ab-6998-4448-9a01-5216ee64980b",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNzksImlhdCI6MTc5MzE3NTE3OSwianRpIjoiOTYwN2E1NDctNjJhOS00YWI2LWE0M2QtYzFkNWJmYWU2NmQwIiwic2lkIjoiMDFkYjkwYWItNjk5OC00NDQ4LTlhMDEtNTIxNmVlNjQ5ODBiIn0.TO48KMefk8J8_110kue5lDEVjHWVotW3xj9b9q6555w",
  "access_expires_at": "2026-10-28T08:27:59.202130904Z",
  "refresh_token": "8R8mGowBFxtAO8xT3XAijMuu0Saf-7sms7YO6dRETsA",
  "refresh_expires_at": "2026-10-28T20:12:59.201697801Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31191"
}
```

```json
{
  "challenge_id": "909295ed-d940-459c-91c2-314e146b6ec0",
  "expires_at": "2026-10-28T08:17:59.225845217Z",
  "resend_available_at": "2026-10-28T08:13:00.225845217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "103306",
  "sent_at": "2026-10-28T08:12:59.227712385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "909295ed-d940-459c-91c2-314e146b6ec0",
  "code": "103306",
  "device_ref": "sandbox-31191"
}
```

```json
{
  "session_id": "4eda40bd-1cf1-4910-bf12-d829e61f1501",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA3OSwiaWF0IjoxNzkzMTc1MTc5LCJqdGkiOiI0NWI2MTgxOS04YjBlLTQ0MTItYmRjNS05ZDcyMWRhZjAzMmYiLCJzaWQiOiI0ZWRhNDBiZC0xY2YxLTQ5MTAtYmYxMi1kODI5ZTYxZjE1MDEifQ.YBL58w1l3Vfy_xf91UpnuFE_H4OC0IkcwDWfcNvQTP4",
  "access_expires_at": "2026-10-28T08:27:59.27629438Z",
  "refresh_token": "sg2q6kEMuw1QDqeFzELHdfAZByBBX5WINVyYu0TJgu0",
  "refresh_expires_at": "2026-11-27T08:12:59.275890511Z",
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
    "review_status": "APPROVED",
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
  "history": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "14a8df05-c5f5-4b15-af5b-a7d584a1ddb3",
  "expected_version": 5,
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
  "version": 6,
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
  "device_ref": "sandbox-3161"
}
```

```json
{
  "challenge_id": "9df18191-3e7f-4a2b-a616-db70fb1940c2",
  "expires_at": "2026-10-28T08:17:59.383757399Z",
  "resend_available_at": "2026-10-28T08:13:00.383757399Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "093716",
  "sent_at": "2026-10-28T08:12:59.385417386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9df18191-3e7f-4a2b-a616-db70fb1940c2",
  "code": "093716",
  "device_ref": "sandbox-3161"
}
```

```json
{
  "session_id": "6fd1326f-e33e-41f0-8f89-1dc284f040d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjA3OSwiaWF0IjoxNzkzMTc1MTc5LCJqdGkiOiI4NWJiMDBkMS02MTM2LTQ5ZjgtOTkxZC0xNGZjY2ZkMGE0ZmEiLCJzaWQiOiI2ZmQxMzI2Zi1lMzNlLTQxZjAtOGY4OS0xZGMyODRmMDQwZDIifQ.nK6MpF09IEsPDuOZWzADEpGXeQ46SLBp6KyVk5n1sAM",
  "access_expires_at": "2026-10-28T08:27:59.434755183Z",
  "refresh_token": "C_JDFE9yXmtEynmApS6Zthw_d9uVhEW0OT9y5qLQWF8",
  "refresh_expires_at": "2026-11-27T08:12:59.434359197Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97532f5-4ca2-4785-a8ed-6d31669135d2",
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
  "last_heartbeat_at": "2026-10-28T08:12:46.224405Z",
  "last_location_at": "2026-10-28T08:12:46.224405Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e97532f5-4ca2-4785-a8ed-6d31669135d2/handover` → **200**

```json
{
  "command_id": "e2e3fce4-ec14-469b-a13a-4e51fb9bfe52",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97532f5-4ca2-4785-a8ed-6d31669135d2",
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
  "last_heartbeat_at": "2026-10-28T08:12:46.224405Z",
  "last_location_at": "2026-10-28T08:12:46.224405Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e97532f5-4ca2-4785-a8ed-6d31669135d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:59Z",
    "sequence": 1793175179509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97532f5-4ca2-4785-a8ed-6d31669135d2",
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
  "last_heartbeat_at": "2026-10-28T08:12:59.526094Z",
  "last_location_at": "2026-10-28T08:12:59.526094Z",
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
  "command_id": "533bc602-fefb-4db1-bbc7-28437b78f686",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:12:59Z",
    "sequence": 1793175179573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "342c8a34-4931-4724-870e-1fbee93e590d",
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
  "last_heartbeat_at": "2026-10-28T08:12:59.588526Z",
  "last_location_at": "2026-10-28T08:12:59.588526Z",
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
  "session_id": "c398ce8a-58da-4c70-9554-7678daa1d892",
  "subject": {
    "type": "STAFF",
    "id": "b53b6cec-f440-4bb2-b44a-c6654bb41997"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTNiNmNlYy1mNDQwLTRiYjItYjQ0YS1jNjY1NGJiNDE5OTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYwNzksImlhdCI6MTc5MzE3NTE3OSwianRpIjoiMzc1NGE3MzMtYTY4MS00MDhhLTk0ODktNzliMWFiZTAzYzAyIiwic2lkIjoiYzM5OGNlOGEtNThkYS00YzcwLTk1NTQtNzY3OGRhYTFkODkyIn0.SR3qWhhJRQxxOxsHON57T6LXAPRV0i2SU5gDYCsxZss",
  "access_expires_at": "2026-10-28T08:27:59.822207044Z",
  "refresh_token": "2N_CtbGrm1JJqtGMFu1qHkdiYHvQNH2v8RGjI26AN2I",
  "refresh_expires_at": "2026-10-28T20:12:59.821828333Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "345bc663-7c89-4c70-8112-5a6d8465fb40",
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
  "id": "e86e5ab1-b18c-4c40-b28b-05f8ce951066",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:17:59.850370Z",
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
  "command_id": "28e5a56b-5e89-44bf-a70a-c9d7180da2d8",
  "quote_id": "e86e5ab1-b18c-4c40-b28b-05f8ce951066",
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
  "id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
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
  "created_at": "2026-10-28T08:12:59.883865Z",
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
    "id": "f7b76565-ac1c-464e-a095-3dfa92bd8117",
    "order_id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
    "expires_at": "2026-10-28T08:13:14.887181Z",
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

`POST /api/driver/v1/offers/f7b76565-ac1c-464e-a095-3dfa92bd8117/accept` → **200**

```json
{
  "command_id": "b686e50e-1fc3-4532-818b-f7b3c7f34f3b"
}
```

```json
{
  "id": "671f1108-42ee-4865-8168-4c1fd29bda55",
  "order_id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "16117a4b-6a5a-408f-b021-53a15bb3b7ef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16117a4b-6a5a-408f-b021-53a15bb3b7ef",
  "order_id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
  "assignment_id": "671f1108-42ee-4865-8168-4c1fd29bda55",
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

`POST /api/driver/v1/work-sessions/342c8a34-4931-4724-870e-1fbee93e590d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:13:00Z",
    "sequence": 1793175180444
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "342c8a34-4931-4724-870e-1fbee93e590d",
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
  "last_heartbeat_at": "2026-10-28T08:13:00.019866Z",
  "last_location_at": "2026-10-28T08:13:00.019866Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/16117a4b-6a5a-408f-b021-53a15bb3b7ef/arrive` → **200**

```json
{
  "command_id": "f02129e6-ba24-4882-8997-5b56f7759d0b",
  "expected_version": 0
}
```

```json
{
  "id": "16117a4b-6a5a-408f-b021-53a15bb3b7ef",
  "order_id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
  "assignment_id": "671f1108-42ee-4865-8168-4c1fd29bda55",
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
  "arrived_at": "2026-10-28T08:13:00.049764Z",
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

`POST /api/driver/v1/trips/16117a4b-6a5a-408f-b021-53a15bb3b7ef/start` → **200**

```json
{
  "command_id": "8b68a537-3ecd-4361-960d-ccef6c5d5efc",
  "expected_version": 1
}
```

```json
{
  "id": "16117a4b-6a5a-408f-b021-53a15bb3b7ef",
  "order_id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
  "assignment_id": "671f1108-42ee-4865-8168-4c1fd29bda55",
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
  "arrived_at": "2026-10-28T08:13:00.049764Z",
  "started_at": "2026-10-28T08:13:00.082918Z",
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

`POST /api/driver/v1/trips/16117a4b-6a5a-408f-b021-53a15bb3b7ef/complete` → **200**

```json
{
  "command_id": "85b824c5-5e62-4dc8-adbb-9694af4a0452",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:13:00Z",
  "cash_received": true
}
```

```json
{
  "id": "16117a4b-6a5a-408f-b021-53a15bb3b7ef",
  "order_id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
  "assignment_id": "671f1108-42ee-4865-8168-4c1fd29bda55",
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
  "arrived_at": "2026-10-28T08:13:00.049764Z",
  "started_at": "2026-10-28T08:13:00.082918Z",
  "completed_at": "2026-10-28T08:13:00.119614Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/8522dbd3-dfeb-4396-86ca-2df53fb045e7` → **200**

```json
{
  "id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
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
    "id": "671f1108-42ee-4865-8168-4c1fd29bda55",
    "order_id": "8522dbd3-dfeb-4396-86ca-2df53fb045e7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "16117a4b-6a5a-408f-b021-53a15bb3b7ef",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:12:59.883865Z",
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
  "session_id": "e97532f5-4ca2-4785-a8ed-6d31669135d2",
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
  "last_heartbeat_at": "2026-10-28T08:12:59.526094Z",
  "last_location_at": "2026-10-28T08:12:59.526094Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e97532f5-4ca2-4785-a8ed-6d31669135d2/close` → **200**

```json
{
  "command_id": "84fb7f55-2961-4ccd-bec6-810ed778092c",
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
  "session_id": "342c8a34-4931-4724-870e-1fbee93e590d",
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
  "last_heartbeat_at": "2026-10-28T08:13:00.019866Z",
  "last_location_at": "2026-10-28T08:13:00.019866Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/342c8a34-4931-4724-870e-1fbee93e590d/close` → **200**

```json
{
  "command_id": "958ba10e-3700-40d4-9c7d-70b80c759a60",
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

Done: terminal order 8522dbd3-dfeb-4396-86ca-2df53fb045e7 by Andrii (5a000000-0000-4000-8000-000000000403).
