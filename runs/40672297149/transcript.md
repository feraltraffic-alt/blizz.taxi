# Sandbox transcript (2026-10-28T10:28:49Z, f74f1af)

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
  "correlation_id": "4548780f-623a-419b-a3e9-422099f58007"
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
  "session_id": "1c5ac5e6-15f6-44d4-8ba8-020b13c0a646",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyMzcsImlhdCI6MTc5MzE4MzMzNywianRpIjoiMDBiOGViMDgtMGVmOS00NGJmLTk1MzUtY2E2ZDcyOWVlZWRhIiwic2lkIjoiMWM1YWM1ZTYtMTVmNi00NGQ0LThiYTgtMDIwYjEzYzBhNjQ2In0.g7rClyCfd-m87csNltEtby8_zOE8_54kIZnymuHpFkU",
  "access_expires_at": "2026-10-28T10:43:57.773420132Z",
  "refresh_token": "Gk11_KLOJYCO5Dq01NH6o_buBsxwKGEBnj66QyO_588",
  "refresh_expires_at": "2026-10-28T22:28:57.771051035Z",
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
  "session_id": "a6af4ea6-52d7-4559-ac32-9844b51fa87e",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyMzksImlhdCI6MTc5MzE4MzMzOSwianRpIjoiNzcyOWYzNzQtY2E3My00NDk1LWE4NmUtYjBkZDA4ODkyNWM5Iiwic2lkIjoiYTZhZjRlYTYtNTJkNy00NTU5LWFjMzItOTg0NGI1MWZhODdlIn0.sQWxLPDiqYLHgAUIB1WFKq74GBc9SfSkDDepZrWJII0",
  "access_expires_at": "2026-10-28T10:43:59.471882238Z",
  "refresh_token": "FPppRN_UqG8mYEU086c5cI8YUBMCu8-VkD2UHX5kO-k",
  "refresh_expires_at": "2026-10-28T22:28:59.470762415Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "ade21788-be8c-4c65-a1d2-d9f1967e4aca",
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
  "id": "c1149c16-0538-4b71-97ff-6f51134bea0f",
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
  "created_by": "5e547375-1197-4965-80da-610da65befa6",
  "created_at": "2026-10-28T10:28:59.755505Z",
  "updated_at": "2026-10-28T10:28:59.755505Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633437596",
  "device_ref": "sandbox-26917"
}
```

```json
{
  "challenge_id": "05be516b-c847-4a5f-87e1-5e25b86aff90",
  "expires_at": "2026-10-28T10:34:00.013920934Z",
  "resend_available_at": "2026-10-28T10:29:01.013920934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633437596` → **200**

```json
{
  "phone": "+380633437596",
  "audience": "CLIENT",
  "code": "946744",
  "sent_at": "2026-10-28T10:29:00.021660148Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05be516b-c847-4a5f-87e1-5e25b86aff90",
  "code": "946744",
  "device_ref": "sandbox-26917"
}
```

```json
{
  "session_id": "531d25e7-76f0-4bfb-8f78-abd2948290af",
  "subject": {
    "type": "CLIENT",
    "id": "b05ecb2a-7659-49a2-8ab7-711323c968dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDVlY2IyYS03NjU5LTQ5YTItOGFiNy03MTEzMjNjOTY4ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MjQwLCJpYXQiOjE3OTMxODMzNDAsImp0aSI6ImVlNTZlZjA2LTdkYTYtNGJiMi04YWVhLWViYzdjMTc4YTU3NiIsInNpZCI6IjUzMWQyNWU3LTc2ZjAtNGJmYi04Zjc4LWFiZDI5NDgyOTBhZiJ9.eLtApBT4eYXU0ue2jaUQKTqivF6RbRKg9KE7BRJUQX4",
  "access_expires_at": "2026-10-28T10:44:00.307340949Z",
  "refresh_token": "9vM5ME4y8jm2IRp47cpBEJa44aBLswVBHRYkCEe29aA",
  "refresh_expires_at": "2026-11-27T10:29:00.306168719Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633437596` → **200**

```json
{
  "client_id": "b05ecb2a-7659-49a2-8ab7-711323c968dd"
}
```

`POST /api/admin/v1/rider-wallets/b05ecb2a-7659-49a2-8ab7-711323c968dd/top-ups` → **201**

```json
{
  "command_id": "90d237ae-6920-4e47-9df4-5a7109e41de4",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b05ecb2a-7659-49a2-8ab7-711323c968dd",
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
      "id": "2a7d156d-4478-4029-8db0-82d08c2a644a",
      "at": "2026-10-28T10:29:00.802239Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5e547375-1197-4965-80da-610da65befa6",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f31c6b3-9c43-4952-9af2-e55cfd28dae5",
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
  "id": "9b7e8e62-8d8e-4125-ab8f-8635b614010f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:34:01.221309Z",
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
      "id": "c1149c16-0538-4b71-97ff-6f51134bea0f",
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
  "device_ref": "sandbox-1094"
}
```

```json
{
  "challenge_id": "81610680-ea5e-4982-b2a1-da1f32c1b0ed",
  "expires_at": "2026-10-28T10:34:01.494172517Z",
  "resend_available_at": "2026-10-28T10:29:02.494172517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "930569",
  "sent_at": "2026-10-28T10:29:01.498363583Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81610680-ea5e-4982-b2a1-da1f32c1b0ed",
  "code": "930569",
  "device_ref": "sandbox-1094"
}
```

```json
{
  "session_id": "0eeb3ca9-57f8-4a4d-889d-9d039dae0ec9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDI0MSwiaWF0IjoxNzkzMTgzMzQxLCJqdGkiOiJjNjRhZTIzMy02OWY4LTQ1ZTItOTk4Ny04ZTBkN2M5YTQwZTQiLCJzaWQiOiIwZWViM2NhOS01N2Y4LTRhNGQtODg5ZC05ZDAzOWRhZTBlYzkifQ.CciYn0gWJq4_UzqNx1avqcABTNaDggnmh8VhcCQlcbQ",
  "access_expires_at": "2026-10-28T10:44:01.758542208Z",
  "refresh_token": "jCEyB9BDqEguTar_PALaMaMfSDGzgQ1_mDOrPvn_fSg",
  "refresh_expires_at": "2026-11-27T10:29:01.757591234Z",
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
  "command_id": "3a57d2dc-dd7b-4c44-ada5-b940300dbd5e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:29:02Z",
    "sequence": 1793183342236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c0721b61-065a-4913-8b3b-b282999917d5",
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
  "last_heartbeat_at": "2026-10-28T10:29:02.284637Z",
  "last_location_at": "2026-10-28T10:29:02.284637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "39f62250-b11e-4b07-b622-312b807f7487",
  "quote_id": "9b7e8e62-8d8e-4125-ab8f-8635b614010f",
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
  "id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b05ecb2a-7659-49a2-8ab7-711323c968dd",
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
  "created_at": "2026-10-28T10:29:02.581995Z",
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
  "client_id": "b05ecb2a-7659-49a2-8ab7-711323c968dd",
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
      "id": "2a7d156d-4478-4029-8db0-82d08c2a644a",
      "at": "2026-10-28T10:29:00.802239Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5e547375-1197-4965-80da-610da65befa6",
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
    "id": "287f35c9-bace-4297-bcd6-eb8da83b3795",
    "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
    "expires_at": "2026-10-28T10:29:17.595804Z",
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

`POST /api/driver/v1/offers/287f35c9-bace-4297-bcd6-eb8da83b3795/accept` → **200**

```json
{
  "command_id": "ac95c4af-1333-41f0-b555-4577308fd6fb"
}
```

```json
{
  "id": "d1d9f944-f502-4704-b425-80574c24eb3b",
  "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2efbb32b-9f51-46ec-ab75-c18ce755c736",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2efbb32b-9f51-46ec-ab75-c18ce755c736",
  "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
  "assignment_id": "d1d9f944-f502-4704-b425-80574c24eb3b",
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

`POST /api/driver/v1/work-sessions/c0721b61-065a-4913-8b3b-b282999917d5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:29:03Z",
    "sequence": 1793183343827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c0721b61-065a-4913-8b3b-b282999917d5",
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
  "last_heartbeat_at": "2026-10-28T10:29:03.853436Z",
  "last_location_at": "2026-10-28T10:29:03.853436Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2efbb32b-9f51-46ec-ab75-c18ce755c736/arrive` → **200**

```json
{
  "command_id": "cf2ba986-b88e-43b0-a61e-f764c0dde142",
  "expected_version": 0
}
```

```json
{
  "id": "2efbb32b-9f51-46ec-ab75-c18ce755c736",
  "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
  "assignment_id": "d1d9f944-f502-4704-b425-80574c24eb3b",
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
  "arrived_at": "2026-10-28T10:29:04.109119Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2efbb32b-9f51-46ec-ab75-c18ce755c736/start` → **200**

```json
{
  "command_id": "f5e9172f-dc1a-456e-a963-2c6ed0e8686d",
  "expected_version": 1
}
```

```json
{
  "id": "2efbb32b-9f51-46ec-ab75-c18ce755c736",
  "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
  "assignment_id": "d1d9f944-f502-4704-b425-80574c24eb3b",
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
  "arrived_at": "2026-10-28T10:29:04.109119Z",
  "started_at": "2026-10-28T10:29:04.363794Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/2efbb32b-9f51-46ec-ab75-c18ce755c736/complete` → **200**

```json
{
  "command_id": "38784b78-7c35-4fe1-a7c4-a443aa616bf7",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:29:04Z",
  "cash_received": true
}
```

```json
{
  "id": "2efbb32b-9f51-46ec-ab75-c18ce755c736",
  "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
  "assignment_id": "d1d9f944-f502-4704-b425-80574c24eb3b",
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
  "arrived_at": "2026-10-28T10:29:04.109119Z",
  "started_at": "2026-10-28T10:29:04.363794Z",
  "completed_at": "2026-10-28T10:29:04.655226Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b05ecb2a-7659-49a2-8ab7-711323c968dd",
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
      "id": "a09f9236-1b7e-432c-88d5-d43e829869fd",
      "at": "2026-10-28T10:29:05.523522Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8"
    },
    {
      "id": "2a7d156d-4478-4029-8db0-82d08c2a644a",
      "at": "2026-10-28T10:29:00.802239Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5e547375-1197-4965-80da-610da65befa6",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c1149c16-0538-4b71-97ff-6f51134bea0f/archive` → **200**

```json
{
  "command_id": "ed62edc2-2ca7-45b3-89f7-32083fdb7340",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c1149c16-0538-4b71-97ff-6f51134bea0f",
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
  "created_by": "5e547375-1197-4965-80da-610da65befa6",
  "created_at": "2026-10-28T10:28:59.755505Z",
  "updated_at": "2026-10-28T10:29:08.193456Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c0721b61-065a-4913-8b3b-b282999917d5",
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
  "last_heartbeat_at": "2026-10-28T10:29:03.853436Z",
  "last_location_at": "2026-10-28T10:29:03.853436Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c0721b61-065a-4913-8b3b-b282999917d5/close` → **200**

```json
{
  "command_id": "7f342553-9b56-4808-845b-ac883e6b63ad",
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

Done: order caee0e9f-4301-4f0e-8060-84fd981583c8.

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
  "session_id": "15cb8315-66fe-4413-809c-0fb63cc641f8",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyNDksImlhdCI6MTc5MzE4MzM0OSwianRpIjoiMDM1YmE0M2EtODk5Ny00MzY1LWEyMjEtNWMyNTVjNzA3NTFkIiwic2lkIjoiMTVjYjgzMTUtNjZmZS00NDEzLTgwOWMtMGZiNjNjYzY0MWY4In0.tOy_w6FiWX2SDnZzSklWwUpDXR1PDJsTOj_UjszRnG8",
  "access_expires_at": "2026-10-28T10:44:09.327647016Z",
  "refresh_token": "7vTCt1zCHQS8Rm-KkMSstDAgZ0qNLFrIXPsNje9wpcg",
  "refresh_expires_at": "2026-10-28T22:29:09.326931541Z",
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
  "command_id": "a8b46aab-e0e5-443f-837f-00d84f0360a5",
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
  "session_id": "dee2bc6b-26c6-43d9-bad0-20a06ce096d3",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyNTAsImlhdCI6MTc5MzE4MzM1MCwianRpIjoiNWMzODRkZDktNWFiZS00OTY1LWIyMWQtY2VmZjdkOTYwZDI0Iiwic2lkIjoiZGVlMmJjNmItMjZjNi00M2Q5LWJhZDAtMjBhMDZjZTA5NmQzIn0.WRw6BszBp6VCN_osNkt5DBCZiqIlgYQvsCsMWHrky-4",
  "access_expires_at": "2026-10-28T10:44:10.401870543Z",
  "refresh_token": "_UFbGE1lUR8U_uBYoF0z6CfRA1leJFGViotUT6C2JgY",
  "refresh_expires_at": "2026-10-28T22:29:10.401171231Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.115396024",
    "linkedid": "1730052700.115396024",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674943060"
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
    "id": "1730052700.115396024",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "bc1b5ec8-7321-4e68-9f00-740dfc374269",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.637538Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:29:10.663172Z",
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
    "id": "1730052600.2374232139",
    "linkedid": "1730052600.2374232139",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674943060"
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
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/8d795ef5-9ea0-49bd-8287-a2a722df5a00/answer` → **200**

```json
{
  "command_id": "e21ab6ce-ce83-41dd-85b1-2b6491045b2a"
}
```

```json
{
  "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674943060",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5e547375-1197-4965-80da-610da65befa6",
  "order_ids": [],
  "started_at": "2026-10-28T10:29:10.939737Z",
  "answered_at": "2026-10-28T10:29:11.217577Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2374232139",
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
    "id": "1730052600.2374232139",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": "2026-10-28T10:29:11.217577Z",
      "ended_at": "2026-10-28T10:29:11.482092Z",
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
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": "2026-10-28T10:29:11.217577Z",
      "ended_at": "2026-10-28T10:29:11.482092Z",
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
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": "2026-10-28T10:29:11.217577Z",
      "ended_at": "2026-10-28T10:29:11.482092Z",
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
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": "2026-10-28T10:29:11.217577Z",
      "ended_at": "2026-10-28T10:29:11.482092Z",
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
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": "2026-10-28T10:29:11.217577Z",
      "ended_at": "2026-10-28T10:29:11.482092Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:29:18.344349Z"
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
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": "2026-10-28T10:29:11.217577Z",
      "ended_at": "2026-10-28T10:29:11.482092Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:29:18.344349Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/8d795ef5-9ea0-49bd-8287-a2a722df5a00/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/8d795ef5-9ea0-49bd-8287-a2a722df5a00/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=8d795ef5-9ea0-49bd-8287-a2a722df5a00` → **200**

```json
{
  "changes": [
    {
      "id": "3c3084cb-82da-4e45-a4e6-a6fc3589b768",
      "occurred_at": "2026-10-28T10:29:21.029014Z",
      "actor_type": "STAFF",
      "actor_id": "5e547375-1197-4965-80da-610da65befa6",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0cc96cda-a3d8-4225-a64e-772f91d46484\", \"order_ids\": []}",
      "correlation_id": "951bd9a0-16c7-47fd-969c-257773dc6ac7"
    },
    {
      "id": "b0b2d30d-2c51-47dc-8d27-58d4b9f05f54",
      "occurred_at": "2026-10-28T10:29:20.993633Z",
      "actor_type": "STAFF",
      "actor_id": "5e547375-1197-4965-80da-610da65befa6",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0cc96cda-a3d8-4225-a64e-772f91d46484\", \"order_ids\": []}",
      "correlation_id": "03edb2dd-8b5b-4856-9e4e-3926161a1c76"
    }
  ]
}
```

Done: call 8d795ef5-9ea0-49bd-8287-a2a722df5a00 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630575927",
  "device_ref": "sandbox-7417"
}
```

```json
{
  "challenge_id": "c374ebfe-7184-4f3a-81af-07333694f605",
  "expires_at": "2026-10-28T10:34:21.310193827Z",
  "resend_available_at": "2026-10-28T10:29:22.310193827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630575927` → **200**

```json
{
  "phone": "+380630575927",
  "audience": "CLIENT",
  "code": "665819",
  "sent_at": "2026-10-28T10:29:21.313917944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c374ebfe-7184-4f3a-81af-07333694f605",
  "code": "665819",
  "device_ref": "sandbox-7417"
}
```

```json
{
  "session_id": "9fda0bbf-7822-4e49-894a-4b61804bf7cb",
  "subject": {
    "type": "CLIENT",
    "id": "9e6019fd-e5d2-450b-a12c-093ed2a841e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTYwMTlmZC1lNWQyLTQ1MGItYTEyYy0wOTNlZDJhODQxZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MjYxLCJpYXQiOjE3OTMxODMzNjEsImp0aSI6ImMzYzdkZjM5LTQxOGUtNDc0OC1hM2M1LTlmN2E5YjUzODAzMyIsInNpZCI6IjlmZGEwYmJmLTc4MjItNGU0OS04OTRhLTRiNjE4MDRiZjdjYiJ9.YKetsfOqX4lNVLuT7VC7rDjCzDNJvYX3Mxtv2lhR3D0",
  "access_expires_at": "2026-10-28T10:44:21.575518713Z",
  "refresh_token": "FYF3VTUNwdwA0isGeReK5sDNuEU073SgiVMQPbpZtU0",
  "refresh_expires_at": "2026-11-27T10:29:21.574876034Z",
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
        "en": "Changed my mind",
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте"
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
  "device_ref": "sandbox-30420"
}
```

```json
{
  "challenge_id": "9226201b-82ea-4596-877e-35fda0643861",
  "expires_at": "2026-10-28T10:34:22.037645616Z",
  "resend_available_at": "2026-10-28T10:29:23.037645616Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "644770",
  "sent_at": "2026-10-28T10:29:22.040873025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9226201b-82ea-4596-877e-35fda0643861",
  "code": "644770",
  "device_ref": "sandbox-30420"
}
```

```json
{
  "session_id": "af3b3bc3-4150-4ff6-805e-284cfb9b5206",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDI2MiwiaWF0IjoxNzkzMTgzMzYyLCJqdGkiOiI3OTZkZGJjNy0xMDczLTQ1MjUtOWZiOC0yZWI0OTAxODIxYWYiLCJzaWQiOiJhZjNiM2JjMy00MTUwLTRmZjYtODA1ZS0yODRjZmI5YjUyMDYifQ.lMAR8tuonoeoeeu1Ls64FosPgicWSAKk0_iVDR8CNJQ",
  "access_expires_at": "2026-10-28T10:44:22.301362699Z",
  "refresh_token": "4FsgmjVJLnMhWSshtRJR3cEqgYWyqJjJ2aIDP8gSzKA",
  "refresh_expires_at": "2026-11-27T10:29:22.300566764Z",
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
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать"
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
  "session_id": "361b0861-e2d7-4a46-b217-16da256a0a0f",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyNjMsImlhdCI6MTc5MzE4MzM2MywianRpIjoiYmE5ODA1Y2EtMTZjZC00NGM5LWJmNGUtMTBlZDU2OWUwZjVlIiwic2lkIjoiMzYxYjA4NjEtZTJkNy00YTQ2LWIyMTctMTZkYTI1NmEwYTBmIn0.zGh68l1S6WHEeLG2RYDGi3rdjNgbXQI-ZWfNvDPaOWE",
  "access_expires_at": "2026-10-28T10:44:23.098031224Z",
  "refresh_token": "fQ0PW6N331KcQBdUfxSIjuSZXmEs9UnN9b8P-TvqH-0",
  "refresh_expires_at": "2026-10-28T22:29:23.097273151Z",
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
  "session_id": "5d9ce7b4-c7a0-431c-a5c4-14de6c94ab54",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyNjMsImlhdCI6MTc5MzE4MzM2MywianRpIjoiYzFjNGQzNTMtZDRkZS00N2Q4LWIxOWQtNzQzNzVkMjI5YTgxIiwic2lkIjoiNWQ5Y2U3YjQtYzdhMC00MzFjLWE1YzQtMTRkZTZjOTRhYjU0In0.lZpkx9VHsqCwpZRRU8ffGp4tF37Er4Wvmu30HYuUqG8",
  "access_expires_at": "2026-10-28T10:44:23.669391358Z",
  "refresh_token": "o6_-856S8DDRCaVAxUjMupzTujrtBTr68zKjZmfeKS8",
  "refresh_expires_at": "2026-10-28T22:29:23.668788648Z",
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
        "en": "Passenger asked",
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП"
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
  "command_id": "47714812-d5a4-4b69-ac17-e99ab35608f2",
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
  "id": "e71747b6-af58-4ff5-b324-9004a18edbde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:34:24.148452Z",
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
  "command_id": "b1d9125e-154c-4e87-b8bb-fc46dd8aeac4",
  "quote_id": "e71747b6-af58-4ff5-b324-9004a18edbde",
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
  "id": "7b0398ce-97a7-4cdb-a4df-8e8c1c8d94fb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e6019fd-e5d2-450b-a12c-093ed2a841e4",
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
  "created_at": "2026-10-28T10:29:24.402695Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7b0398ce-97a7-4cdb-a4df-8e8c1c8d94fb` → **200**

```json
{
  "id": "7b0398ce-97a7-4cdb-a4df-8e8c1c8d94fb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e6019fd-e5d2-450b-a12c-093ed2a841e4",
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
  "created_at": "2026-10-28T10:29:24.402695Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7b0398ce-97a7-4cdb-a4df-8e8c1c8d94fb/cancel` → **200**

```json
{
  "command_id": "b5842182-39ba-4afe-b1dd-f95ea67944e2",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "7b0398ce-97a7-4cdb-a4df-8e8c1c8d94fb",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9e6019fd-e5d2-450b-a12c-093ed2a841e4",
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
  "created_at": "2026-10-28T10:29:24.402695Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину"
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
  "command_id": "c9ec4cd6-1f35-4ee4-a688-e6bc658a81d5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:29:25Z",
    "sequence": 1793183365416
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6d9cd477-5a80-4af1-a32f-f01f1048faba",
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
  "last_heartbeat_at": "2026-10-28T10:29:25.437577Z",
  "last_location_at": "2026-10-28T10:29:25.437577Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28652"
}
```

```json
{
  "challenge_id": "54904b7b-1272-47a8-8d44-aea93669d2e4",
  "expires_at": "2026-10-28T10:34:25.677002449Z",
  "resend_available_at": "2026-10-28T10:29:26.677002449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "023031",
  "sent_at": "2026-10-28T10:29:25.680264075Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54904b7b-1272-47a8-8d44-aea93669d2e4",
  "code": "023031",
  "device_ref": "sandbox-28652"
}
```

```json
{
  "session_id": "9a94fd1b-0096-45a8-b054-5354af5ec955",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDI2NSwiaWF0IjoxNzkzMTgzMzY1LCJqdGkiOiJjNGYwNjU0NS0xZjZjLTQ3YTItYTFmYS1lY2MyYWZmMjk2OGUiLCJzaWQiOiI5YTk0ZmQxYi0wMDk2LTQ1YTgtYjA1NC01MzU0YWY1ZWM5NTUifQ.QJY2wOgfVJdnuLH3iK3Pnh3NGSf6598tkjfu5rHrINU",
  "access_expires_at": "2026-10-28T10:44:25.949569223Z",
  "refresh_token": "XnjK15LD_ZwzkS3HTbHicim-ZfHsLSXL_OwqDYlj4PA",
  "refresh_expires_at": "2026-11-27T10:29:25.948804347Z",
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
  "command_id": "15938bfc-0026-4213-bd6d-79aba9f1cd5f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:29:26Z",
    "sequence": 1793183366414
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b3fb56f-d33e-47ae-a947-8e5c4bf5e089",
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
  "last_heartbeat_at": "2026-10-28T10:29:26.435645Z",
  "last_location_at": "2026-10-28T10:29:26.435645Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a0968f77-1d1b-48c9-8d40-9410f3ed8d24",
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
  "id": "9b369018-3e22-4c35-a6a6-382906b08ff9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:34:26.683549Z",
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
  "command_id": "d3689f03-9005-482c-8afc-e96c75895d4d",
  "quote_id": "9b369018-3e22-4c35-a6a6-382906b08ff9",
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
  "id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e6019fd-e5d2-450b-a12c-093ed2a841e4",
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
  "created_at": "2026-10-28T10:29:26.939211Z",
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
    "id": "a644e3a2-78b4-4aa8-bc94-847469ef7333",
    "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
    "expires_at": "2026-10-28T10:29:41.943457Z",
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

`POST /api/driver/v1/offers/a644e3a2-78b4-4aa8-bc94-847469ef7333/accept` → **200**

```json
{
  "command_id": "8b83363e-10f3-463f-a0f2-b7539ed45c2a"
}
```

```json
{
  "id": "d5563bfa-1e1e-4b4a-b5b6-716a743791a8",
  "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "13ebbde1-3808-412f-98a7-077a849f461a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "13ebbde1-3808-412f-98a7-077a849f461a",
  "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "assignment_id": "d5563bfa-1e1e-4b4a-b5b6-716a743791a8",
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

`POST /api/driver/v1/trips/13ebbde1-3808-412f-98a7-077a849f461a/cancel` → **200**

```json
{
  "command_id": "e0ab0dc5-88e2-4199-8743-d14a60f93127",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "13ebbde1-3808-412f-98a7-077a849f461a",
  "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "assignment_id": "d5563bfa-1e1e-4b4a-b5b6-716a743791a8",
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

`GET /api/rider/v1/orders/d6f0341d-3de0-47a3-bf53-36edafca4321` → **200**

```json
{
  "id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9e6019fd-e5d2-450b-a12c-093ed2a841e4",
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
    "id": "d5563bfa-1e1e-4b4a-b5b6-716a743791a8",
    "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "13ebbde1-3808-412f-98a7-077a849f461a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:29:26.939211Z",
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
    "id": "f1a1ad98-d737-489b-b65f-001138e78fc4",
    "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
    "expires_at": "2026-10-28T10:29:42.934206Z",
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

`POST /api/driver/v1/offers/f1a1ad98-d737-489b-b65f-001138e78fc4/accept` → **200**

```json
{
  "command_id": "fc90a21a-5235-4e1c-b10e-388a7694f65c"
}
```

```json
{
  "id": "bb0acb78-5e01-4f45-b31a-d79bcfa0153b",
  "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b07f4d00-534b-42c0-b2ea-5eb7814d5433",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b07f4d00-534b-42c0-b2ea-5eb7814d5433",
  "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "assignment_id": "bb0acb78-5e01-4f45-b31a-d79bcfa0153b",
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

`POST /api/driver/v1/trips/b07f4d00-534b-42c0-b2ea-5eb7814d5433/cancel` → **200**

```json
{
  "command_id": "f34c7445-d442-407b-8518-0838216319db",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b07f4d00-534b-42c0-b2ea-5eb7814d5433",
  "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
  "assignment_id": "bb0acb78-5e01-4f45-b31a-d79bcfa0153b",
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
    "id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:29:26.939211Z",
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
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "7b0398ce-97a7-4cdb-a4df-8e8c1c8d94fb",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:29:24.402695Z",
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
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/d6f0341d-3de0-47a3-bf53-36edafca4321/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:29:26.939944Z",
      "actor": {
        "type": "CLIENT",
        "id": "9e6019fd-e5d2-450b-a12c-093ed2a841e4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
        "quote_id": "9b369018-3e22-4c35-a6a6-382906b08ff9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "c1ba5377-09d0-4a32-9d93-3f5fafab9368"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:29:26.942311Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
        "attempt_id": "0c0e1e58-d505-4fb6-b973-5ce7edb7c5d1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c1ba5377-09d0-4a32-9d93-3f5fafab9368"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:29:26.950331Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a644e3a2-78b4-4aa8-bc94-847469ef7333",
        "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "c1ba5377-09d0-4a32-9d93-3f5fafab9368"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:29:27.443044Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a644e3a2-78b4-4aa8-bc94-847469ef7333",
        "order_id": "d6f0341d-3de0-47a3-bf53-36edafca4321",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d5563bfa-1e1e-4b4a-b5b6-716a743791a8"
      },
      "correlation_id": "95d10b51-f291-4317-bf49-0154a95059d2"
```

Done: orders 7b0398ce-97a7-4cdb-a4df-8e8c1c8d94fb, d6f0341d-3de0-47a3-bf53-36edafca4321.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733185984",
  "device_ref": "sandbox-3074"
}
```

```json
{
  "challenge_id": "867f14d6-cb71-4faa-aefc-b8e3ae35f8e5",
  "expires_at": "2026-10-28T10:34:29.912084446Z",
  "resend_available_at": "2026-10-28T10:29:30.912084446Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733185984` → **200**

```json
{
  "phone": "+380733185984",
  "audience": "CLIENT",
  "code": "537177",
  "sent_at": "2026-10-28T10:29:29.914932107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "867f14d6-cb71-4faa-aefc-b8e3ae35f8e5",
  "code": "537177",
  "device_ref": "sandbox-3074"
}
```

```json
{
  "session_id": "077812f2-86b6-4eb1-83fc-61abba17e880",
  "subject": {
    "type": "CLIENT",
    "id": "8e999748-c492-41e6-bf78-baa93dc964f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTk5OTc0OC1jNDkyLTQxZTYtYmY3OC1iYWE5M2RjOTY0ZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MjcwLCJpYXQiOjE3OTMxODMzNzAsImp0aSI6IjZmMDRkZTE3LTliODEtNGVmZS05MDZiLTcxOGU5ZjZjYzJlOCIsInNpZCI6IjA3NzgxMmYyLTg2YjYtNGViMS04M2ZjLTYxYWJiYTE3ZTg4MCJ9.XzUXrdhnVONeQZMon-KWfzeFLzOZU2todgxPXZZ62lE",
  "access_expires_at": "2026-10-28T10:44:30.192411476Z",
  "refresh_token": "4H58qLrkN4ce7Ah-BG4xB3wyHElckCOYwqszPlvHTdo",
  "refresh_expires_at": "2026-11-27T10:29:30.191705038Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "32e91201-0ff9-4ee7-963e-ba1f6d574cba",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "aa48c6c4-917b-4c90-89d2-d67425eb8d08",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-aa48c6c4-917b-4c90-89d2-d67425eb8d08",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "95b927feaa134e750f545aa786221b5d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=aa48c6c4-917b-4c90-89d2-d67425eb8d08",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733185984"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=aa48c6c4-917b-4c90-89d2-d67425eb8d08",
  "expires_at": "2026-10-28T10:59:30.43181Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/aa48c6c4-917b-4c90-89d2-d67425eb8d08` → **200**

```json
{
  "id": "aa48c6c4-917b-4c90-89d2-d67425eb8d08",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:59:30.43181Z",
  "card": {
    "id": "61c86cc1-d232-41a7-9e61-c4d289b784d2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6812",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:29:30.688521Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "61c86cc1-d232-41a7-9e61-c4d289b784d2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6812",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:29:30.688521Z"
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
  "device_ref": "sandbox-11883"
}
```

```json
{
  "challenge_id": "20b8be83-768f-4fca-9d23-d110c5752977",
  "expires_at": "2026-10-28T10:34:31.192857948Z",
  "resend_available_at": "2026-10-28T10:29:32.192857948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "488679",
  "sent_at": "2026-10-28T10:29:31.195955027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20b8be83-768f-4fca-9d23-d110c5752977",
  "code": "488679",
  "device_ref": "sandbox-11883"
}
```

```json
{
  "session_id": "e15eb360-45d5-427d-829f-9e4d24ae439b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDI3MSwiaWF0IjoxNzkzMTgzMzcxLCJqdGkiOiIwYzYwMTg0Ni1mZjBjLTRjNDQtOGM5OS1mOWYwNzM0MDEwOWYiLCJzaWQiOiJlMTVlYjM2MC00NWQ1LTQyN2QtODI5Zi05ZTRkMjRhZTQzOWIifQ.XgPuVYF_FO7g8PEBGo_lIl-zzSNqlLYy1QswkChqUlM",
  "access_expires_at": "2026-10-28T10:44:31.454545302Z",
  "refresh_token": "rwl5oNlE4rm6b1lzGf8z0IcIOFREuGVnrt6Nu0DUgu4",
  "refresh_expires_at": "2026-11-27T10:29:31.453868623Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b3fb56f-d33e-47ae-a947-8e5c4bf5e089",
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
  "last_heartbeat_at": "2026-10-28T10:29:26.435645Z",
  "last_location_at": "2026-10-28T10:29:26.435645Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b3fb56f-d33e-47ae-a947-8e5c4bf5e089/handover` → **200**

```json
{
  "command_id": "2090cd7d-3cf7-4080-b0a6-da563edea1db",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b3fb56f-d33e-47ae-a947-8e5c4bf5e089",
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
  "last_heartbeat_at": "2026-10-28T10:29:26.435645Z",
  "last_location_at": "2026-10-28T10:29:26.435645Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b3fb56f-d33e-47ae-a947-8e5c4bf5e089/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:29:32Z",
    "sequence": 1793183372162
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b3fb56f-d33e-47ae-a947-8e5c4bf5e089",
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
  "last_heartbeat_at": "2026-10-28T10:29:32.183575Z",
  "last_location_at": "2026-10-28T10:29:32.183575Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "35891050-1cbc-4d39-86c7-87f3c1d3091a",
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
  "id": "1a9af5a5-a61a-4432-9dbe-39fe8eb39116",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:34:32.433904Z",
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
  "command_id": "ceb97bc8-65ee-4182-9743-e76640f15410",
  "quote_id": "1a9af5a5-a61a-4432-9dbe-39fe8eb39116",
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
  "id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8e999748-c492-41e6-bf78-baa93dc964f1",
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
  "created_at": "2026-10-28T10:29:32.68807Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8` → **200**

```json
{
  "id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8e999748-c492-41e6-bf78-baa93dc964f1",
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
  "created_at": "2026-10-28T10:29:32.68807Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8` → **200**

```json
{
  "id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8e999748-c492-41e6-bf78-baa93dc964f1",
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
  "created_at": "2026-10-28T10:29:32.68807Z",
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
    "id": "c4d02aaa-8119-444b-9e17-4ba6ea475d85",
    "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
    "expires_at": "2026-10-28T10:29:48.671954Z",
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

`POST /api/driver/v1/offers/c4d02aaa-8119-444b-9e17-4ba6ea475d85/accept` → **200**

```json
{
  "command_id": "db94073f-f2f8-4377-bc8d-2da61c3a809a"
}
```

```json
{
  "id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "assignment_id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
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

`POST /api/driver/v1/work-sessions/9b3fb56f-d33e-47ae-a947-8e5c4bf5e089/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:29:35Z",
    "sequence": 1793183375141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b3fb56f-d33e-47ae-a947-8e5c4bf5e089",
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
  "last_heartbeat_at": "2026-10-28T10:29:35.162608Z",
  "last_location_at": "2026-10-28T10:29:35.162608Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c3032a99-dff5-446e-8b31-773a0a57b6eb/arrive` → **200**

```json
{
  "command_id": "152f73be-700f-4483-8928-8ee33b3bd8de",
  "expected_version": 0
}
```

```json
{
  "id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "assignment_id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
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
  "arrived_at": "2026-10-28T10:29:35.411093Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c3032a99-dff5-446e-8b31-773a0a57b6eb/start` → **200**

```json
{
  "command_id": "59f3846e-14e1-4574-a549-b18f36909869",
  "expected_version": 1
}
```

```json
{
  "id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "assignment_id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
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
  "arrived_at": "2026-10-28T10:29:35.411093Z",
  "started_at": "2026-10-28T10:29:35.663424Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c3032a99-dff5-446e-8b31-773a0a57b6eb/complete` → **200**

```json
{
  "command_id": "d5c54770-a4c6-4f1b-9e44-221d75aa0841",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:29:35Z"
}
```

```json
{
  "id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "assignment_id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
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
  "arrived_at": "2026-10-28T10:29:35.411093Z",
  "started_at": "2026-10-28T10:29:35.663424Z",
  "completed_at": "2026-10-28T10:29:35.922711Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8` → **200**

```json
{
  "id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e999748-c492-41e6-bf78-baa93dc964f1",
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
    "id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
    "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:29:32.68807Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8` → **200**

```json
{
  "id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e999748-c492-41e6-bf78-baa93dc964f1",
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
    "id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
    "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:29:32.68807Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8` → **200**

```json
{
  "id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e999748-c492-41e6-bf78-baa93dc964f1",
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
    "id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
    "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:29:32.68807Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8` → **200**

```json
{
  "id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8e999748-c492-41e6-bf78-baa93dc964f1",
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
    "id": "4d3c0fbf-3767-4512-9615-f6cd084e60ff",
    "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3032a99-dff5-446e-8b31-773a0a57b6eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:29:32.68807Z",
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
      "id": "ba1f6df2-1b2c-4b52-a70f-ee274df01375",
      "at": "2026-10-28T10:29:36.724482Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8/tip` → **200**

```json
{
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
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
  "available_until": "2026-10-29T10:29:35.922711Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8/tip` → **201**

```json
{
  "command_id": "bb761806-326a-4a4a-8c63-3681e4814396",
  "amount_minor": 2500
}
```

```json
{
  "id": "ed7e763d-1323-4fa4-97c2-fa1b06cdd212",
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:29:40.888159Z"
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8/tip` → **200**

```json
{
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
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
  "available_until": "2026-10-29T10:29:35.922711Z",
  "open": false,
  "tip": {
    "id": "ed7e763d-1323-4fa4-97c2-fa1b06cdd212",
    "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T10:29:40.888159Z"
  }
}
```

`GET /api/rider/v1/orders/8cd1fb02-f289-41c6-a473-c5517e20d3d8/tip` → **200**

```json
{
  "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
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
  "available_until": "2026-10-29T10:29:35.922711Z",
  "open": false,
  "tip": {
    "id": "ed7e763d-1323-4fa4-97c2-fa1b06cdd212",
    "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:29:40.888159Z"
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
      "id": "ba1f6df2-1b2c-4b52-a70f-ee274df01375",
      "at": "2026-10-28T10:29:36.724482Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
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
      "id": "133e49e3-b345-45d3-a3ac-d0ed01475ae6",
      "at": "2026-10-28T10:29:42.785957Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
      "counterpart_id": null
    },
    {
      "id": "ba1f6df2-1b2c-4b52-a70f-ee274df01375",
      "at": "2026-10-28T10:29:36.724482Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8cd1fb02-f289-41c6-a473-c5517e20d3d8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b3fb56f-d33e-47ae-a947-8e5c4bf5e089",
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
  "last_heartbeat_at": "2026-10-28T10:29:35.162608Z",
  "last_location_at": "2026-10-28T10:29:35.162608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b3fb56f-d33e-47ae-a947-8e5c4bf5e089/close` → **200**

```json
{
  "command_id": "1ae909b1-10b1-4625-a1fd-476a0e2520f6",
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

Done: card order 8cd1fb02-f289-41c6-a473-c5517e20d3d8.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737951516",
  "device_ref": "sandbox-31907"
}
```

```json
{
  "challenge_id": "eed6a507-51a5-4d68-ac0f-f733f5c5774a",
  "expires_at": "2026-10-28T10:34:44.574949672Z",
  "resend_available_at": "2026-10-28T10:29:45.574949672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737951516` → **200**

```json
{
  "phone": "+380737951516",
  "audience": "CLIENT",
  "code": "678238",
  "sent_at": "2026-10-28T10:29:44.578152043Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eed6a507-51a5-4d68-ac0f-f733f5c5774a",
  "code": "678238",
  "device_ref": "sandbox-31907"
}
```

```json
{
  "session_id": "d0769896-db26-49ab-9d10-58a75589a267",
  "subject": {
    "type": "CLIENT",
    "id": "b377c4bb-2bd0-4d7a-bd41-2e56dba033d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzc3YzRiYi0yYmQwLTRkN2EtYmQ0MS0yZTU2ZGJhMDMzZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Mjg0LCJpYXQiOjE3OTMxODMzODQsImp0aSI6ImVlODZiOTNlLWJhYmItNGE5OS1iODJlLTFhYTZkZWM3YzI0YSIsInNpZCI6ImQwNzY5ODk2LWRiMjYtNDlhYi05ZDEwLTU4YTc1NTg5YTI2NyJ9.iuhb37gL5utgexS1JzWnIYnYwVsPgQildxJiT0XsP3k",
  "access_expires_at": "2026-10-28T10:44:44.843316857Z",
  "refresh_token": "tbACInpnAETIIJ_BsB6HByQEiLAPE3TkGYiT-VpvHOU",
  "refresh_expires_at": "2026-11-27T10:29:44.842760796Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c56adfa2-00c7-42bc-a9d4-6da875284a81",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "1bf37d06-c120-4c45-ae2c-c594243484f7",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1bf37d06-c120-4c45-ae2c-c594243484f7",
    "orderDate": "1793183385",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "9775b85d9cea43af52539069799d2766",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1bf37d06-c120-4c45-ae2c-c594243484f7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737951516"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1bf37d06-c120-4c45-ae2c-c594243484f7",
  "created_at": "2026-10-28T10:29:45.086639Z",
  "expires_at": "2026-10-28T10:59:45.086639Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/1bf37d06-c120-4c45-ae2c-c594243484f7` → **200**

```json
{
  "id": "1bf37d06-c120-4c45-ae2c-c594243484f7",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:29:45.086639Z",
  "expires_at": "2026-10-28T10:59:45.086639Z",
  "completed_at": "2026-10-28T10:29:45.345918Z",
  "masked_pan": "41****3834",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b377c4bb-2bd0-4d7a-bd41-2e56dba033d5",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b377c4bb-2bd0-4d7a-bd41-2e56dba033d5",
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
      "id": "70a22ed2-9917-4c57-95fb-bf258af13044",
      "at": "2026-10-28T10:29:45.810607Z",
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
  "client_id": "b377c4bb-2bd0-4d7a-bd41-2e56dba033d5",
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
      "id": "70a22ed2-9917-4c57-95fb-bf258af13044",
      "at": "2026-10-28T10:29:45.810607Z",
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
  "device_ref": "sandbox-10024"
}
```

```json
{
  "challenge_id": "e2c0fac1-70ce-4c47-b4c0-aac4efcf6c1f",
  "expires_at": "2026-10-28T10:34:47.327594379Z",
  "resend_available_at": "2026-10-28T10:29:48.327594379Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "181666",
  "sent_at": "2026-10-28T10:29:47.330503492Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2c0fac1-70ce-4c47-b4c0-aac4efcf6c1f",
  "code": "181666",
  "device_ref": "sandbox-10024"
}
```

```json
{
  "session_id": "665c5074-78d9-4835-b06c-bf23113abdb6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDI4NywiaWF0IjoxNzkzMTgzMzg3LCJqdGkiOiJmYmZjNmIzMi04YmE3LTQwMzMtOWZhMy05MGU5ZWFhNGI1NWUiLCJzaWQiOiI2NjVjNTA3NC03OGQ5LTQ4MzUtYjA2Yy1iZjIzMTEzYWJkYjYifQ.lRhoWgHL5lnXzbCKBMBFUZRbo75DRsArYMPxEmXFXi0",
  "access_expires_at": "2026-10-28T10:44:47.5860487Z",
  "refresh_token": "PSxBnQe32-KwlSRSmvBHakr5eUQjt54wrU2rQSmDpig",
  "refresh_expires_at": "2026-11-27T10:29:47.585510736Z",
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
  "command_id": "a0c3b8f7-f6e5-476b-a8a9-fa3cb700eb0f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "03b9f2ec-e5a5-4717-a593-33ca9cb95bbb",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-03b9f2ec-e5a5-4717-a593-33ca9cb95bbb",
    "orderDate": "1793183388",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "e93096d5bee8f9c6032c4cb237c29b31",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=03b9f2ec-e5a5-4717-a593-33ca9cb95bbb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=03b9f2ec-e5a5-4717-a593-33ca9cb95bbb",
  "created_at": "2026-10-28T10:29:48.05243Z",
  "expires_at": "2026-10-28T10:59:48.05243Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/03b9f2ec-e5a5-4717-a593-33ca9cb95bbb` → **200**

```json
{
  "id": "03b9f2ec-e5a5-4717-a593-33ca9cb95bbb",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:29:48.05243Z",
  "expires_at": "2026-10-28T10:59:48.05243Z",
  "completed_at": "2026-10-28T10:29:48.289315Z",
  "masked_pan": "41****2900",
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
      "id": "6f9a9823-0270-41f4-8081-41faa305d937",
      "at": "2026-10-28T10:29:48.826002Z",
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
  "command_id": "2f5bce07-afa1-4916-bc66-4ceb88129bd6",
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
  "correlation_id": "054cec2c-fa66-4ae4-b60f-734add04dacc"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670500960",
  "device_ref": "sandbox-24979"
}
```

```json
{
  "challenge_id": "bdcfecf0-b7c3-44e3-a43e-497a32da1414",
  "expires_at": "2026-10-28T10:34:50.259770264Z",
  "resend_available_at": "2026-10-28T10:29:51.259770264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670500960` → **200**

```json
{
  "phone": "+380670500960",
  "audience": "CLIENT",
  "code": "273276",
  "sent_at": "2026-10-28T10:29:50.262609824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdcfecf0-b7c3-44e3-a43e-497a32da1414",
  "code": "273276",
  "device_ref": "sandbox-24979"
}
```

```json
{
  "session_id": "9232063a-e51d-459e-8aeb-ebf53324c044",
  "subject": {
    "type": "CLIENT",
    "id": "77408884-a88e-48b2-8e2e-0d71f6d218e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzQwODg4NC1hODhlLTQ4YjItOGUyZS0wZDcxZjZkMjE4ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MjkwLCJpYXQiOjE3OTMxODMzOTAsImp0aSI6Ijk4MTdiNWIwLTUyNTgtNDUzMi05NjcyLTY3NTY4Zjk1YmNkMCIsInNpZCI6IjkyMzIwNjNhLWU1MWQtNDU5ZS04YWViLWViZjUzMzI0YzA0NCJ9.QNKT-ChbUIJ1K7jOo91aP6MEj5WM0I0e0huCA4a3jWo",
  "access_expires_at": "2026-10-28T10:44:50.530478605Z",
  "refresh_token": "AMwCFvuidTafbj83a5n_70TTMLd8Rd1mumtkh1nsJdQ",
  "refresh_expires_at": "2026-11-27T10:29:50.529945729Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77408884-a88e-48b2-8e2e-0d71f6d218e8",
  "session_id": "9232063a-e51d-459e-8aeb-ebf53324c044",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c75d8afd-97cb-44bf-a16b-b76bb4d02f4e",
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
  "id": "292e443d-a3a5-476e-ad78-bf78fc5c7c72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:34:51.001236Z",
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
  "challenge_id": "8b6b35fb-3b83-455c-90f2-04187ec09ad8",
  "expires_at": "2026-10-28T10:34:53.249365938Z",
  "resend_available_at": "2026-10-28T10:29:54.249365938Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670500960` → **200**

```json
{
  "phone": "+380670500960",
  "audience": "CLIENT",
  "code": "716953",
  "sent_at": "2026-10-28T10:29:53.251687173Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2ca3b8bb-3fc3-448f-852d-64c88a332d8f",
  "challenge_id": "8b6b35fb-3b83-455c-90f2-04187ec09ad8",
  "otp_code": "716953"
}
```

```json
{
  "client_id": "77408884-a88e-48b2-8e2e-0d71f6d218e8",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:29:53.523643496Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ed1868f8-8299-4382-a399-d6e593134063",
  "quote_id": "292e443d-a3a5-476e-ad78-bf78fc5c7c72",
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
  "correlation_id": "a11a56c2-083e-46db-98d3-f95f60f1c22c"
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
  "session_id": "19595020-8416-4d35-b4b3-5be493cfd812",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyOTQsImlhdCI6MTc5MzE4MzM5NCwianRpIjoiMjA2ZGU5ODMtZmZmOC00NTJjLWEwOTQtYjk1YTk0NDkzMmQ5Iiwic2lkIjoiMTk1OTUwMjAtODQxNi00ZDM1LWI0YjMtNWJlNDkzY2ZkODEyIn0.78wNd14VRH4j6W0kjEq4Vd1fSj802Ju6YWFXuHm0oNM",
  "access_expires_at": "2026-10-28T10:44:54.343764462Z",
  "refresh_token": "DPq4hers24W9NAm4a-mm7IHlEqkynfTM4jwf6pRrlyQ",
  "refresh_expires_at": "2026-10-28T22:29:54.343220188Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "77408884-a88e-48b2-8e2e-0d71f6d218e8",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:29:53.523643Z",
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

`POST /api/admin/v1/client-deletions/77408884-a88e-48b2-8e2e-0d71f6d218e8/complete` → **200**

```json
{
  "command_id": "495c8bb8-9a8a-4794-9ec8-ebe910553c86",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "77408884-a88e-48b2-8e2e-0d71f6d218e8",
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
  "correlation_id": "55500569-1c37-4b5f-b3f9-fb2e4433e8f0"
}
```

Done: client 77408884-a88e-48b2-8e2e-0d71f6d218e8 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660450093",
  "device_ref": "sandbox-14534"
}
```

```json
{
  "challenge_id": "c7d6e929-36b0-4f00-a728-a82702d017ac",
  "expires_at": "2026-10-28T10:34:55.32653446Z",
  "resend_available_at": "2026-10-28T10:29:56.32653446Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660450093` → **200**

```json
{
  "phone": "+380660450093",
  "audience": "CLIENT",
  "code": "629791",
  "sent_at": "2026-10-28T10:29:55.329056045Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7d6e929-36b0-4f00-a728-a82702d017ac",
  "code": "629791",
  "device_ref": "sandbox-14534"
}
```

```json
{
  "session_id": "4b5f4025-8e88-462f-892b-bb17164e8cdd",
  "subject": {
    "type": "CLIENT",
    "id": "73754999-30e2-499a-a7b5-e0bd67f9d640"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Mzc1NDk5OS0zMGUyLTQ5OWEtYTdiNS1lMGJkNjdmOWQ2NDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Mjk1LCJpYXQiOjE3OTMxODMzOTUsImp0aSI6IjliOGIyYjZlLTcyYTItNGJmOS1hYTg2LTRkNDQ5ZjZjNmEwNSIsInNpZCI6IjRiNWY0MDI1LThlODgtNDYyZi04OTJiLWJiMTcxNjRlOGNkZCJ9.GpQ311q_K8Nd0DGZOADxgEKAEInTeLTRB8sc0nNO-YM",
  "access_expires_at": "2026-10-28T10:44:55.598953304Z",
  "refresh_token": "C9feVjf4MT9j8MarA0kxSwYFWFFGlB4efmrVQF8lujk",
  "refresh_expires_at": "2026-11-27T10:29:55.598342563Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73754999-30e2-499a-a7b5-e0bd67f9d640",
  "session_id": "4b5f4025-8e88-462f-892b-bb17164e8cdd",
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
  "session_id": "48c7c1ef-30c0-4dfd-82f7-3c4a507688a2",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQyOTYsImlhdCI6MTc5MzE4MzM5NiwianRpIjoiOWVkYWY1NGYtNzFhZi00NzA1LTliNzAtMDFiOGY1ZmNjM2M3Iiwic2lkIjoiNDhjN2MxZWYtMzBjMC00ZGZkLTgyZjctM2M0YTUwNzY4OGEyIn0.HF2U9j1yXgjKDvGWSANkaIfGo3vavj77WaG9TO1zHTw",
  "access_expires_at": "2026-10-28T10:44:56.409827783Z",
  "refresh_token": "MAKJV9ucjHJTRrK1v13yI5OGysP9h0gkIKaeTGDoX3U",
  "refresh_expires_at": "2026-10-28T22:29:56.409278122Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0450093&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "73754999-30e2-499a-a7b5-e0bd67f9d640",
      "phone": "+380660450093",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:29:55.596243Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/73754999-30e2-499a-a7b5-e0bd67f9d640` → **200**

```json
{
  "client": {
    "id": "73754999-30e2-499a-a7b5-e0bd67f9d640",
    "phone": "+380660450093",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:29:55.596243Z",
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

`POST /api/admin/v1/clients/73754999-30e2-499a-a7b5-e0bd67f9d640/block` → **400**

```json
{
  "command_id": "82e99dc7-3470-4b69-b042-c016b7015d31",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/73754999-30e2-499a-a7b5-e0bd67f9d640/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "26d6c47b-4854-4a2d-b748-77ee2a861fa4",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/73754999-30e2-499a-a7b5-e0bd67f9d640/block` → **200**

```json
{
  "command_id": "9671e0cf-5f22-469a-970c-302c98248fcd",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "73754999-30e2-499a-a7b5-e0bd67f9d640",
  "phone": "+380660450093",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:29:55.596243Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:29:57.442238Z",
    "by": "5e547375-1197-4965-80da-610da65befa6"
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
  "correlation_id": "29ae7407-5cf6-4126-b4a3-c75122b58943"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660450093",
  "device_ref": "sandbox-2301"
}
```

```json
{
  "challenge_id": "d8c9b957-6b37-4fbf-9007-4d304a6f3a09",
  "expires_at": "2026-10-28T10:34:59.93494262Z",
  "resend_available_at": "2026-10-28T10:30:00.93494262Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660450093` → **200**

```json
{
  "phone": "+380660450093",
  "audience": "CLIENT",
  "code": "988054",
  "sent_at": "2026-10-28T10:29:59.937147213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "d8c9b957-6b37-4fbf-9007-4d304a6f3a09",
  "code": "988054",
  "device_ref": "sandbox-2301"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e476d63e-3c2f-4abb-9abc-5427cbe59d93"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/73754999-30e2-499a-a7b5-e0bd67f9d640` → **200**

```json
{
  "client": {
    "id": "73754999-30e2-499a-a7b5-e0bd67f9d640",
    "phone": "+380660450093",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:29:55.596243Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:29:57.442238Z",
      "by": "5e547375-1197-4965-80da-610da65befa6"
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

`POST /api/admin/v1/clients/73754999-30e2-499a-a7b5-e0bd67f9d640/unblock` → **200**

```json
{
  "command_id": "af1f70c3-1256-41ac-8ad0-4c4d7b77a9b9",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "73754999-30e2-499a-a7b5-e0bd67f9d640",
  "phone": "+380660450093",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:29:55.596243Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660450093",
  "device_ref": "sandbox-20439"
}
```

```json
{
  "challenge_id": "f97a37c5-be41-469f-9d91-b293e6de7f3c",
  "expires_at": "2026-10-28T10:35:02.966682575Z",
  "resend_available_at": "2026-10-28T10:30:03.966682575Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660450093` → **200**

```json
{
  "phone": "+380660450093",
  "audience": "CLIENT",
  "code": "635807",
  "sent_at": "2026-10-28T10:30:02.969667961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f97a37c5-be41-469f-9d91-b293e6de7f3c",
  "code": "635807",
  "device_ref": "sandbox-20439"
}
```

```json
{
  "session_id": "08782108-1fde-4ea8-8766-c498170f6fa0",
  "subject": {
    "type": "CLIENT",
    "id": "73754999-30e2-499a-a7b5-e0bd67f9d640"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Mzc1NDk5OS0zMGUyLTQ5OWEtYTdiNS1lMGJkNjdmOWQ2NDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzAzLCJpYXQiOjE3OTMxODM0MDMsImp0aSI6IjRiMzY5OTNiLTljMDItNGU0NS1iZWQ4LTI3NmMxY2Y5NjcyNiIsInNpZCI6IjA4NzgyMTA4LTFmZGUtNGVhOC04NzY2LWM0OTgxNzBmNmZhMCJ9.8G2CsCr81E68dGi0_udL8T_OOpSMV--GVNvkVTrDuy0",
  "access_expires_at": "2026-10-28T10:45:03.231884276Z",
  "refresh_token": "kNIC5IqXmxchhtFYNmwa1vxzo23ebh8Ye_21QHZneY8",
  "refresh_expires_at": "2026-11-27T10:30:03.231237976Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73754999-30e2-499a-a7b5-e0bd67f9d640",
  "session_id": "08782108-1fde-4ea8-8766-c498170f6fa0",
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
  "phone": "+380661183417",
  "device_ref": "sandbox-30123"
}
```

```json
{
  "challenge_id": "af7a1910-32ee-4469-8568-658a8d607bb8",
  "expires_at": "2026-10-28T10:35:03.718159269Z",
  "resend_available_at": "2026-10-28T10:30:04.718159269Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661183417` → **200**

```json
{
  "phone": "+380661183417",
  "audience": "CLIENT",
  "code": "367389",
  "sent_at": "2026-10-28T10:30:03.720648653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af7a1910-32ee-4469-8568-658a8d607bb8",
  "code": "367389",
  "device_ref": "sandbox-30123"
}
```

```json
{
  "session_id": "d47a23ad-1028-441a-9860-d89312966555",
  "subject": {
    "type": "CLIENT",
    "id": "867f7eeb-6b86-49fc-9105-a624546317fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjdmN2VlYi02Yjg2LTQ5ZmMtOTEwNS1hNjI0NTQ2MzE3ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzAzLCJpYXQiOjE3OTMxODM0MDMsImp0aSI6ImMyNjJlMzE0LTc2ZjktNDQ1Ny1iZmFjLTUwYzMzOTFlNTk0MiIsInNpZCI6ImQ0N2EyM2FkLTEwMjgtNDQxYS05ODYwLWQ4OTMxMjk2NjU1NSJ9.Ebn1MFJ-vS6sUlN1-w69VMYvxtbYs2E2fHDgduecpwU",
  "access_expires_at": "2026-10-28T10:45:03.979545088Z",
  "refresh_token": "nVe5fiOKtpdXeBD3ilPGFgGgmPINgP-mhjQHJHQCi0k",
  "refresh_expires_at": "2026-11-27T10:30:03.978994361Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ce58c23f-2b4e-449f-a900-49df6ad37d38",
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
  "id": "b14d9360-c7c3-4a5c-b974-e74031668454",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:35:04.214984Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: ba80ad38-580d-4a11-ac50-6f6cf5810f51) → **201**

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
  "session_id": "f1598fad-d0af-4d0b-be09-05722389ebdf",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzMDQsImlhdCI6MTc5MzE4MzQwNCwianRpIjoiNGY1OTg3MzUtOWVkMC00YjJiLWJiYjAtMjc3MDFlZmYwYzZiIiwic2lkIjoiZjE1OThmYWQtZDBhZi00ZDBiLWJlMDktMDU3MjIzODllYmRmIn0.DtKvNdqDloDnoykGaP8SLSFnzneKSAciwUf9cygcs3g",
  "access_expires_at": "2026-10-28T10:45:04.841868576Z",
  "refresh_token": "r8f36Ha82qR3mzNdQv9mqCL8PQxMIBlVB7J5p-lJoAc",
  "refresh_expires_at": "2026-10-28T22:30:04.841296962Z",
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
  "session_id": "447681ff-aeaf-4210-b949-52c5a7bfb6ae",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzMDUsImlhdCI6MTc5MzE4MzQwNSwianRpIjoiMGFkOGQzZGQtYzBiYi00YmUwLTgxNmItNDgzOTY1MDc1MmJjIiwic2lkIjoiNDQ3NjgxZmYtYWVhZi00MjEwLWI5NDktNTJjNWE3YmZiNmFlIn0.bUX7kMrPsM40IdrGZ_UWS4v3QoS59xh0WiTj_EAO50E",
  "access_expires_at": "2026-10-28T10:45:05.407533483Z",
  "refresh_token": "v3g0pwKga6RwUhJW24tUNmNPOMU7OyIIJMr8o-k9wzY",
  "refresh_expires_at": "2026-10-28T22:30:05.406983992Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/801e1ad4-73c2-40ad-a301-539326ae4d64/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:30:04.469008Z",
      "actor": {
        "type": "CLIENT",
        "id": "867f7eeb-6b86-49fc-9105-a624546317fe",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
        "quote_id": "b14d9360-c7c3-4a5c-b974-e74031668454",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ba80ad38-580d-4a11-ac50-6f6cf5810f51"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:30:04.470914Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
        "attempt_id": "46b3aa24-cee7-497b-86d4-dfab6d2f7bf0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ba80ad38-580d-4a11-ac50-6f6cf5810f51"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:30:04.480988Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
        "attempt_id": "46b3aa24-cee7-497b-86d4-dfab6d2f7bf0"
      },
      "correlation_id": "ba80ad38-580d-4a11-ac50-6f6cf5810f51"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "46b3aa24-cee7-497b-86d4-dfab6d2f7bf0",
        "generation": 1,
        "started_at": "2026-10-28T10:30:04.469868Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:30:04.480988Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:30:04.471915Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/ba80ad38-580d-4a11-ac50-6f6cf5810f51` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "801e1ad4-73c2-40ad-a301-539326ae4d64:0",
      "order_id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
      "at": "2026-10-28T10:30:04.469008Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "801e1ad4-73c2-40ad-a301-539326ae4d64:1",
      "order_id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
      "at": "2026-10-28T10:30:04.470914Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "801e1ad4-73c2-40ad-a301-539326ae4d64:2",
      "order_id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
      "at": "2026-10-28T10:30:04.480988Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/ab40d00a-4796-43f7-8ba4-bf068c9ac485` → **200**

```json
{
  "found": []
}
```

Done: request ba80ad38-580d-4a11-ac50-6f6cf5810f51 — order 801e1ad4-73c2-40ad-a301-539326ae4d64 found by its id.

`GET /api/rider/v1/orders/801e1ad4-73c2-40ad-a301-539326ae4d64` → **200**

```json
{
  "id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "867f7eeb-6b86-49fc-9105-a624546317fe",
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
  "created_at": "2026-10-28T10:30:04.468331Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/801e1ad4-73c2-40ad-a301-539326ae4d64/cancel` → **200**

```json
{
  "command_id": "3aebaf2c-3e26-4300-8d21-36efc65fd217",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "801e1ad4-73c2-40ad-a301-539326ae4d64",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "867f7eeb-6b86-49fc-9105-a624546317fe",
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
  "created_at": "2026-10-28T10:30:04.468331Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633688538",
  "device_ref": "sandbox-30013"
}
```

```json
{
  "challenge_id": "94a723b3-c84e-455d-8dd8-80716ed8afb1",
  "expires_at": "2026-10-28T10:35:06.889964567Z",
  "resend_available_at": "2026-10-28T10:30:07.889964567Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633688538` → **200**

```json
{
  "phone": "+380633688538",
  "audience": "CLIENT",
  "code": "203477",
  "sent_at": "2026-10-28T10:30:06.89196749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94a723b3-c84e-455d-8dd8-80716ed8afb1",
  "code": "203477",
  "device_ref": "sandbox-30013"
}
```

```json
{
  "session_id": "2fe2b0cb-87ba-45b7-96fa-2b60971a3118",
  "subject": {
    "type": "CLIENT",
    "id": "1e2f36fc-a206-4008-a526-dfd5a7aa7bb5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTJmMzZmYy1hMjA2LTQwMDgtYTUyNi1kZmQ1YTdhYTdiYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzA3LCJpYXQiOjE3OTMxODM0MDcsImp0aSI6IjZiMGZhY2IxLWUxZWEtNGVlOS04ZDkxLTVhYWRhYTA5YmE4MiIsInNpZCI6IjJmZTJiMGNiLTg3YmEtNDViNy05NmZhLTJiNjA5NzFhMzExOCJ9.KZMJUqscrA0XoVmZvyg-AF7fCS6maOdcb10pzc0xsC4",
  "access_expires_at": "2026-10-28T10:45:07.151337358Z",
  "refresh_token": "8KN3nVZ4v4UWFKD3asFvYowiWqm7zBQwfNA48bHmckY",
  "refresh_expires_at": "2026-11-27T10:30:07.150817821Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "3a8852eb-a8f2-4207-abff-611ed1f1ba87",
  "expires_at": "2026-10-28T10:35:09.386762306Z",
  "resend_available_at": "2026-10-28T10:30:10.386762306Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633688538` → **200**

```json
{
  "phone": "+380633688538",
  "audience": "CLIENT",
  "code": "505233",
  "sent_at": "2026-10-28T10:30:09.38889125Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "eca70530-3157-4d42-860d-9aafc74819b3",
  "challenge_id": "3a8852eb-a8f2-4207-abff-611ed1f1ba87",
  "otp_code": "505233"
}
```

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "PENDING",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e` → **200**

```json
{
  "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
  "state": "READY",
  "created_at": "2026-10-28T10:30:09.655191Z",
  "ready_at": "2026-10-28T10:30:18.342283Z",
  "expires_at": "2026-11-04T10:30:18.342283Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636076110",
  "device_ref": "sandbox-1073"
}
```

```json
{
  "challenge_id": "7cd41fe9-0ae0-4015-be09-85edfcef52a3",
  "expires_at": "2026-10-28T10:35:18.771844446Z",
  "resend_available_at": "2026-10-28T10:30:19.771844446Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636076110` → **200**

```json
{
  "phone": "+380636076110",
  "audience": "CLIENT",
  "code": "525667",
  "sent_at": "2026-10-28T10:30:18.774204054Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cd41fe9-0ae0-4015-be09-85edfcef52a3",
  "code": "525667",
  "device_ref": "sandbox-1073"
}
```

```json
{
  "session_id": "74a2f1fb-0ea4-4c72-8e8c-3da337fea8ef",
  "subject": {
    "type": "CLIENT",
    "id": "60f41abe-b8d5-4f56-b1fc-c50bcebc9777"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MGY0MWFiZS1iOGQ1LTRmNTYtYjFmYy1jNTBiY2ViYzk3NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzE5LCJpYXQiOjE3OTMxODM0MTksImp0aSI6IjEwMjkxYzNjLWM4MWItNDgzMy1hMzRmLWU2Mzg4YWI3OTIxOCIsInNpZCI6Ijc0YTJmMWZiLTBlYTQtNGM3Mi04ZThjLTNkYTMzN2ZlYThlZiJ9.-W04KdXZmDRZFmDyy6ZzlFZrPWVCHl_Hrqh5rMIQDKQ",
  "access_expires_at": "2026-10-28T10:45:19.039162486Z",
  "refresh_token": "_KTsvVO849tFJEGE4bN8iaCBEPAMcJPpWyPkOnCjYAc",
  "refresh_expires_at": "2026-11-27T10:30:19.03864964Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/e6e1d974-b81b-445d-92ac-49da4ba2ce6e/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "67433599-803c-478c-be40-830d9f373fbc"
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
  "session_id": "8bebc07e-e68a-4495-9598-961f5f54fd2c",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzMTksImlhdCI6MTc5MzE4MzQxOSwianRpIjoiZTI1ZjdkNGQtYjg4NS00Zjk0LWE4MWMtYmQ4YzJkODM4MGYwIiwic2lkIjoiOGJlYmMwN2UtZTY4YS00NDk1LTk1OTgtOTYxZjVmNTRmZDJjIn0.XS9GpZKFGMKdyuslUSLzhstsLwmt75f9blwrmJyfyzE",
  "access_expires_at": "2026-10-28T10:45:19.836199475Z",
  "refresh_token": "VJ0MZ5Sm5VrLD3RkKMlsu3Qw9cbJOOI6j37YiI2Az1Q",
  "refresh_expires_at": "2026-10-28T22:30:19.835655242Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1e2f36fc-a206-4008-a526-dfd5a7aa7bb5",
  "session_id": "2fe2b0cb-87ba-45b7-96fa-2b60971a3118",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/1e2f36fc-a206-4008-a526-dfd5a7aa7bb5/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "e6e1d974-b81b-445d-92ac-49da4ba2ce6e",
      "state": "READY",
      "created_at": "2026-10-28T10:30:09.655191Z",
      "ready_at": "2026-10-28T10:30:18.342283Z",
      "expires_at": "2026-11-04T10:30:18.342283Z",
      "size_bytes": 1032
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
  "device_ref": "sandbox-20905"
}
```

```json
{
  "challenge_id": "1b526af5-c735-4f1f-837e-0ddb73baa8dc",
  "expires_at": "2026-10-28T10:35:20.534770407Z",
  "resend_available_at": "2026-10-28T10:30:21.534770407Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "256428",
  "sent_at": "2026-10-28T10:30:20.536949794Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b526af5-c735-4f1f-837e-0ddb73baa8dc",
  "code": "256428",
  "device_ref": "sandbox-20905"
}
```

```json
{
  "session_id": "05b50a28-1c92-43da-87c4-0dbc7f419cca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDMyMCwiaWF0IjoxNzkzMTgzNDIwLCJqdGkiOiJjODU2MGFlYy1lZTQ3LTQ5MmQtYmEwMi1mNTAxNGY0ZjZiYWEiLCJzaWQiOiIwNWI1MGEyOC0xYzkyLTQzZGEtODdjNC0wZGJjN2Y0MTljY2EifQ.0W575IU808NVnQq1UUGLCjFsOAQyH7kgUf2T9EYSzRc",
  "access_expires_at": "2026-10-28T10:45:20.801668565Z",
  "refresh_token": "zzMeplJJeVwwUI026cIU9mAn1yk4Z3uZO_GY2iwYWhI",
  "refresh_expires_at": "2026-11-27T10:30:20.800990144Z",
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
  "device_ref": "sandbox-13979"
}
```

```json
{
  "challenge_id": "9b389fc6-397d-467f-b3da-9f37a2dc9d9b",
  "expires_at": "2026-10-28T10:35:21.261350645Z",
  "resend_available_at": "2026-10-28T10:30:22.261350645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "931320",
  "sent_at": "2026-10-28T10:30:21.264115249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b389fc6-397d-467f-b3da-9f37a2dc9d9b",
  "code": "931320",
  "device_ref": "sandbox-13979"
}
```

```json
{
  "session_id": "4b9d3067-44d1-4527-b1f9-27ba87ad7fff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDMyMSwiaWF0IjoxNzkzMTgzNDIxLCJqdGkiOiIwZjVlNTExMC1mMGEyLTRhNzQtOWVjMC0xNTMzYmYxZDdmMTEiLCJzaWQiOiI0YjlkMzA2Ny00NGQxLTQ1MjctYjFmOS0yN2JhODdhZDdmZmYifQ.UzBbia0Vn6Vvir7sdufi_fOll7hfkX3cOHbQ9sbAJ1E",
  "access_expires_at": "2026-10-28T10:45:21.523718987Z",
  "refresh_token": "R1jjuKKV3ew29ygLxsTTKWz9nZN1w2Uqty4oW2FRc9k",
  "refresh_expires_at": "2026-11-27T10:30:21.523106369Z",
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
  "command_id": "e0a89e65-49b0-4e11-942a-555e2cf807b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:21Z",
    "sequence": 1793183421982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5019e9bd-2d1e-4591-b5d4-d5ed218c41bc",
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
  "last_heartbeat_at": "2026-10-28T10:30:22.002293Z",
  "last_location_at": "2026-10-28T10:30:22.002293Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-16989"
}
```

```json
{
  "challenge_id": "764d3adb-8268-471b-bedb-b1837d0e0406",
  "expires_at": "2026-10-28T10:35:22.235217138Z",
  "resend_available_at": "2026-10-28T10:30:23.235217138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "222240",
  "sent_at": "2026-10-28T10:30:22.237686267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "764d3adb-8268-471b-bedb-b1837d0e0406",
  "code": "222240",
  "device_ref": "sandbox-16989"
}
```

```json
{
  "session_id": "e0b13f00-dba8-4fe7-ba7e-44bfaf193e15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDMyMiwiaWF0IjoxNzkzMTgzNDIyLCJqdGkiOiJmYWI4NzI2MC0xOWFlLTQyYjQtOWIwNy1jM2Y3NTZlMzc4ZGYiLCJzaWQiOiJlMGIxM2YwMC1kYmE4LTRmZTctYmE3ZS00NGJmYWYxOTNlMTUifQ.B3SzFQ7DLqXTHo525q6Pobk-wwgrdtOzFzXa9imWFJw",
  "access_expires_at": "2026-10-28T10:45:22.498460242Z",
  "refresh_token": "81Wwb1mrAPgYR2mxXdS6-JnRznNZQWoc4NeU6DgeFnc",
  "refresh_expires_at": "2026-11-27T10:30:22.497922939Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6d9cd477-5a80-4af1-a32f-f01f1048faba",
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
  "last_heartbeat_at": "2026-10-28T10:29:25.437577Z",
  "last_location_at": "2026-10-28T10:29:25.437577Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6d9cd477-5a80-4af1-a32f-f01f1048faba/handover` → **200**

```json
{
  "command_id": "dcb558b8-d8d6-4dc4-b8d6-4055a7fa23b9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6d9cd477-5a80-4af1-a32f-f01f1048faba",
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
  "last_heartbeat_at": "2026-10-28T10:29:25.437577Z",
  "last_location_at": "2026-10-28T10:29:25.437577Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6d9cd477-5a80-4af1-a32f-f01f1048faba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:23Z",
    "sequence": 1793183423198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6d9cd477-5a80-4af1-a32f-f01f1048faba",
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
  "last_heartbeat_at": "2026-10-28T10:30:23.221651Z",
  "last_location_at": "2026-10-28T10:30:23.221651Z",
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
  "session_id": "941df107-caf9-4812-a773-4e367af4b988",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzMjMsImlhdCI6MTc5MzE4MzQyMywianRpIjoiMzAzOWMwYzItYzA3Yy00MzYyLWFhZjAtOWQyY2VjYTUwYTc1Iiwic2lkIjoiOTQxZGYxMDctY2FmOS00ODEyLWE3NzMtNGUzNjdhZjRiOTg4In0.2rgpkZuXE3l8zH8w--Nshnjxt-2hAPGIqvnIrQOV1hk",
  "access_expires_at": "2026-10-28T10:45:23.795941205Z",
  "refresh_token": "ve8zn8nx_RNZ-mvwYjg-Z6ssGSlSoJUYogw5ZbmKS-w",
  "refresh_expires_at": "2026-10-28T22:30:23.795337434Z",
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
  "session_id": "c53b982e-d66d-4124-b92e-591951f0337b",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzMjQsImlhdCI6MTc5MzE4MzQyNCwianRpIjoiYmVjZWQ1Y2EtMjA1OC00Y2FlLTg0YzMtNjQxMjQyYTAwNWMzIiwic2lkIjoiYzUzYjk4MmUtZDY2ZC00MTI0LWI5MmUtNTkxOTUxZjAzMzdiIn0.QwNzIEzbx70tBGCePsoZsPHY3kXpv82FFHfS6D6l4PY",
  "access_expires_at": "2026-10-28T10:45:24.362360342Z",
  "refresh_token": "f561dCQBGepqP8ot3zRRiP6ZCreULiuVM9yQn5Z1khc",
  "refresh_expires_at": "2026-10-28T22:30:24.361678696Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688207595",
  "device_ref": "sandbox-22963"
}
```

```json
{
  "challenge_id": "2ccdf512-19be-4b9f-806c-75900de01ca6",
  "expires_at": "2026-10-28T10:35:24.595767547Z",
  "resend_available_at": "2026-10-28T10:30:25.595767547Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688207595` → **200**

```json
{
  "phone": "+380688207595",
  "audience": "CLIENT",
  "code": "563647",
  "sent_at": "2026-10-28T10:30:24.598066194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ccdf512-19be-4b9f-806c-75900de01ca6",
  "code": "563647",
  "device_ref": "sandbox-22963"
}
```

```json
{
  "session_id": "dc38fe00-d667-4145-b4ee-a7d708fe9bd4",
  "subject": {
    "type": "CLIENT",
    "id": "053c5fb2-f38e-4c2e-9ee9-12cb0936d9f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTNjNWZiMi1mMzhlLTRjMmUtOWVlOS0xMmNiMDkzNmQ5ZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzI0LCJpYXQiOjE3OTMxODM0MjQsImp0aSI6ImU3NDNlNzZmLWU5ZjgtNDMxYS1iOTFiLTRlYTFiOGE1MTE5MSIsInNpZCI6ImRjMzhmZTAwLWQ2NjctNDE0NS1iNGVlLWE3ZDcwOGZlOWJkNCJ9.EODTt4FqT_ioVeR4gBeA9lfuSIIkeJ-yLq1RcyJHyig",
  "access_expires_at": "2026-10-28T10:45:24.856159514Z",
  "refresh_token": "Sda-zxno9LyIuPfG3x0wXljgPTTEi9kajrDxC8FUNao",
  "refresh_expires_at": "2026-11-27T10:30:24.855650843Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c6c1a901-4593-46d2-b8e2-411d32b7654c",
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
  "id": "1f204653-8252-471d-9cfc-19872249a2c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:35:25.095078Z",
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
  "command_id": "c6489a96-5721-4322-b6b2-9fd6d06abc81",
  "quote_id": "1f204653-8252-471d-9cfc-19872249a2c2",
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
  "id": "a18c9a88-5704-48eb-bee2-10332b467c84",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "053c5fb2-f38e-4c2e-9ee9-12cb0936d9f6",
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
  "created_at": "2026-10-28T10:30:25.345267Z",
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
    "id": "96cf0a6a-1356-4faf-ba32-2ce4c4220909",
    "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
    "expires_at": "2026-10-28T10:30:40.348402Z",
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

`POST /api/driver/v1/offers/96cf0a6a-1356-4faf-ba32-2ce4c4220909/reject` → **204**

```json
{
  "command_id": "73e0922d-55ca-408d-895f-e1a8a6be8466"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0a962333-a7b7-4a0b-85e5-6a650ee25435",
    "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
    "expires_at": "2026-10-28T10:30:40.843784Z",
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

`POST /api/driver/v1/offers/0a962333-a7b7-4a0b-85e5-6a650ee25435/accept` → **200**

```json
{
  "command_id": "b6921f09-c20b-408c-8eea-b1102d3b3997"
}
```

```json
{
  "id": "60434cb4-e40a-4365-8cf1-6268fac15e59",
  "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e4b08ac-4814-475d-8563-5b8cdc7ea8a3",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/a18c9a88-5704-48eb-bee2-10332b467c84/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:30:25.34577Z",
      "actor": {
        "type": "CLIENT",
        "id": "053c5fb2-f38e-4c2e-9ee9-12cb0936d9f6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
        "quote_id": "1f204653-8252-471d-9cfc-19872249a2c2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "54cc98cc-45f2-4af3-bc9f-ad38ec406973"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:30:25.347593Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
        "attempt_id": "54bad96a-fd40-4331-b76d-31cd60da9fbe",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "54cc98cc-45f2-4af3-bc9f-ad38ec406973"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:30:25.35415Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "96cf0a6a-1356-4faf-ba32-2ce4c4220909",
        "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "54cc98cc-45f2-4af3-bc9f-ad38ec406973"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:30:25.842588Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "96cf0a6a-1356-4faf-ba32-2ce4c4220909",
        "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84"
      },
      "correlation_id": "7c211b10-ee24-46ce-8578-9187dc22de4a"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order a18c9a88-5704-48eb-bee2-10332b467c84 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/a18c9a88-5704-48eb-bee2-10332b467c84` → **200**

```json
{
  "id": "a18c9a88-5704-48eb-bee2-10332b467c84",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "053c5fb2-f38e-4c2e-9ee9-12cb0936d9f6",
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
    "id": "60434cb4-e40a-4365-8cf1-6268fac15e59",
    "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3e4b08ac-4814-475d-8563-5b8cdc7ea8a3",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:30:25.345267Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a18c9a88-5704-48eb-bee2-10332b467c84/cancel` → **200**

```json
{
  "command_id": "49f346cb-e45f-4630-b7ca-272f69234096",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a18c9a88-5704-48eb-bee2-10332b467c84",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "053c5fb2-f38e-4c2e-9ee9-12cb0936d9f6",
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
    "id": "60434cb4-e40a-4365-8cf1-6268fac15e59",
    "order_id": "a18c9a88-5704-48eb-bee2-10332b467c84",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3e4b08ac-4814-475d-8563-5b8cdc7ea8a3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:30:25.345267Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
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
  "session_id": "5019e9bd-2d1e-4591-b5d4-d5ed218c41bc",
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
  "last_heartbeat_at": "2026-10-28T10:30:22.002293Z",
  "last_location_at": "2026-10-28T10:30:22.002293Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5019e9bd-2d1e-4591-b5d4-d5ed218c41bc/close` → **200**

```json
{
  "command_id": "f03a7b8a-be50-4795-a189-31183b4901cd",
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
  "session_id": "6d9cd477-5a80-4af1-a32f-f01f1048faba",
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
  "last_heartbeat_at": "2026-10-28T10:30:23.221651Z",
  "last_location_at": "2026-10-28T10:30:23.221651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6d9cd477-5a80-4af1-a32f-f01f1048faba/close` → **200**

```json
{
  "command_id": "e3af8cf7-4f90-4c97-8523-773dca4e315c",
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
  "device_ref": "sandbox-12651"
}
```

```json
{
  "challenge_id": "c193f01e-848b-42d6-8d72-fc6b3ad01801",
  "expires_at": "2026-10-28T10:35:28.37498317Z",
  "resend_available_at": "2026-10-28T10:30:29.37498317Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "275898",
  "sent_at": "2026-10-28T10:30:28.376955987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c193f01e-848b-42d6-8d72-fc6b3ad01801",
  "code": "275898",
  "device_ref": "sandbox-12651"
}
```

```json
{
  "session_id": "8bc7b992-71ff-4298-bbf7-639ea5d688ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDMyOCwiaWF0IjoxNzkzMTgzNDI4LCJqdGkiOiJiZDQyYWUzMy1hMmFjLTRkZjQtYmU3Zi02ZGQ3NWI1Mzk5MTIiLCJzaWQiOiI4YmM3Yjk5Mi03MWZmLTQyOTgtYmJmNy02MzllYTVkNjg4ZWEifQ.TFGrQ27Q2SSJ1ARmyIbYjyJ4QpBVc6FZLFk4KF0JBRo",
  "access_expires_at": "2026-10-28T10:45:28.639153139Z",
  "refresh_token": "t980L_9Y2lhu6PGxLscg_ttq0kRp2NEjB__MGKAn_qw",
  "refresh_expires_at": "2026-11-27T10:30:28.638639401Z",
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
  "command_id": "6c3ff18c-3887-40e0-a1b6-46370678e6f3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:29Z",
    "sequence": 1793183429969
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:29.116092Z",
  "last_location_at": "2026-10-28T10:30:29.116092Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677994826",
  "device_ref": "sandbox-21319"
}
```

```json
{
  "challenge_id": "a61c0a91-4e05-4340-828d-935ecbad883c",
  "expires_at": "2026-10-28T10:35:29.355892183Z",
  "resend_available_at": "2026-10-28T10:30:30.355892183Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677994826` → **200**

```json
{
  "phone": "+380677994826",
  "audience": "CLIENT",
  "code": "553246",
  "sent_at": "2026-10-28T10:30:29.358195733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a61c0a91-4e05-4340-828d-935ecbad883c",
  "code": "553246",
  "device_ref": "sandbox-21319"
}
```

```json
{
  "session_id": "603934cc-6e2b-4998-8f81-98ef4d98f93a",
  "subject": {
    "type": "CLIENT",
    "id": "bcd1d02a-633a-4a64-8db6-063d1139d035"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiY2QxZDAyYS02MzNhLTRhNjQtOGRiNi0wNjNkMTEzOWQwMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzI5LCJpYXQiOjE3OTMxODM0MjksImp0aSI6ImMzNmM1NzU5LTk2NjEtNGNlZi05YjhjLTIzMjk1NzQxMmY2OSIsInNpZCI6IjYwMzkzNGNjLTZlMmItNDk5OC04ZjgxLTk4ZWY0ZDk4ZjkzYSJ9.i5dwFeIwm4SnDI-H5tZiSBtIWCIOdKQw7kySu4kOq8g",
  "access_expires_at": "2026-10-28T10:45:29.619602679Z",
  "refresh_token": "dfLfhwuhAVjOVLfLMdMrfr_zwExiBd-yY5qJ1PtBeVY",
  "refresh_expires_at": "2026-11-27T10:30:29.619018432Z",
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
  "command_id": "51df3578-fb09-44a6-abb2-998dae221f6e",
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
  "id": "fe1809a5-a4c5-4ff8-8582-4808df23fd08",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:35:30.095438Z",
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
  "command_id": "70c89b0d-7f8f-4025-a9e3-64807e50cbc1",
  "platform": "ANDROID",
  "token": "sandbox-driver-632ff566-2353-40f8-91da-daee04ebbb2e"
}
```

```json
{
  "id": "522174c2-6d1e-43b5-94e1-0353a6a5f5b0",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:30:30.350864Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1ea2ca6e-2230-47c3-9355-f516359fb8cb",
  "platform": "ANDROID",
  "token": "sandbox-rider-9c992c22-8503-4e3f-9bd0-fc35b37773c3"
}
```

```json
{
  "id": "1e149f1e-f739-4681-837d-f32f453e58cd",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:30:30.590234Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ed2c4ec2-bb64-4dac-bf6f-66cadcdceefe",
  "quote_id": "fe1809a5-a4c5-4ff8-8582-4808df23fd08",
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
  "id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bcd1d02a-633a-4a64-8db6-063d1139d035",
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
  "created_at": "2026-10-28T10:30:30.839042Z",
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
    "id": "d764ee4a-095f-4867-ae98-f5eb97b282f7",
    "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
    "expires_at": "2026-10-28T10:30:45.842537Z",
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

`POST /api/driver/v1/offers/d764ee4a-095f-4867-ae98-f5eb97b282f7/accept` → **200**

```json
{
  "command_id": "132643b0-c69a-48a4-9e18-95a36fea6daf"
}
```

```json
{
  "id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:30:30.813Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:30:31.578090795Z",
    "token_suffix": "ebbb2e",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "196a2c19-0319-4cff-a18a-c389a9aae834"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677994826&after=2026-10-28T10:30:30.813Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677994826&after=2026-10-28T10:30:30.813Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:30:32.582345391Z",
    "token_suffix": "7773c3",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "f9917333-9c53-43e7-a619-3af38522a40c"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/7903c4c0-40bf-40aa-bc93-ebb5f67e0f95/messages` → **201**

```json
{
  "command_id": "f22328ae-898c-4f3e-91e9-245fe71c4a30",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8cf96add-cfba-4df2-b17b-ce139abe0b74",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:30:32.684634673Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "assignment_id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b",
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

`POST /api/driver/v1/trips/476e2dc7-dd6b-4963-b442-262b9a36405b/messages` → **201**

```json
{
  "command_id": "359b8a3b-1909-403a-be8f-69ae6ed63a0a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a5b3545c-77fe-4b8b-9ba1-b71da25c2d4b",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:30:33.150543777Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/7903c4c0-40bf-40aa-bc93-ebb5f67e0f95/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/476e2dc7-dd6b-4963-b442-262b9a36405b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677994826"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:33Z",
    "sequence": 1793183433844
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:33.86478Z",
  "last_location_at": "2026-10-28T10:30:33.86478Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "assignment_id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b",
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

`POST /api/driver/v1/trips/476e2dc7-dd6b-4963-b442-262b9a36405b/arrive` → **200**

```json
{
  "command_id": "b43e33bd-a0e2-4c42-9455-0bb83b56bf54",
  "expected_version": 0
}
```

```json
{
  "id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "assignment_id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b",
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
  "arrived_at": "2026-10-28T10:30:34.333071Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/476e2dc7-dd6b-4963-b442-262b9a36405b/start` → **200**

```json
{
  "command_id": "60410108-075c-4226-9037-098f1b4a88cb",
  "expected_version": 1
}
```

```json
{
  "id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "assignment_id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b",
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
  "arrived_at": "2026-10-28T10:30:34.333071Z",
  "started_at": "2026-10-28T10:30:34.580056Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:34Z",
    "sequence": 1793183434814
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:34.835313Z",
  "last_location_at": "2026-10-28T10:30:34.835313Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/476e2dc7-dd6b-4963-b442-262b9a36405b/complete` → **200**

```json
{
  "command_id": "c458a9c9-41ed-469f-8550-4dea3d86613a",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:30:35Z",
  "cash_received": true
}
```

```json
{
  "id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "assignment_id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b",
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
  "arrived_at": "2026-10-28T10:30:34.333071Z",
  "started_at": "2026-10-28T10:30:34.580056Z",
  "completed_at": "2026-10-28T10:30:35.081035Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/7903c4c0-40bf-40aa-bc93-ebb5f67e0f95` → **200**

```json
{
  "id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bcd1d02a-633a-4a64-8db6-063d1139d035",
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
    "id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b",
    "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:30:30.839042Z",
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
    "id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:30:30.839042Z",
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
    "id": "476e2dc7-dd6b-4963-b442-262b9a36405b",
    "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:30:31.351459Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2efbb32b-9f51-46ec-ab75-c18ce755c736",
    "order_id": "caee0e9f-4301-4f0e-8060-84fd981583c8",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:29:03.354703Z",
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

`GET /api/rider/v1/orders/7903c4c0-40bf-40aa-bc93-ebb5f67e0f95/tip` → **200**

```json
{
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
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
  "available_until": "2026-10-29T10:30:35.081035Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7903c4c0-40bf-40aa-bc93-ebb5f67e0f95/tip` → **201**

```json
{
  "command_id": "e9c510db-7ca7-45bd-a8bc-716686e17012",
  "amount_minor": 1100
}
```

```json
{
  "id": "6f58fb0c-13a1-44a3-8d70-382c77c36a7a",
  "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:30:39.7836Z"
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
  "session_id": "5c1208c4-afc2-428e-9bdf-9e5b82401c9b",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNDAsImlhdCI6MTc5MzE4MzQ0MCwianRpIjoiMGI1NTc5NjUtYWJkMC00MzdkLWI0OWMtZWE1MGRhNDYwYTU1Iiwic2lkIjoiNWMxMjA4YzQtYWZjMi00MjhlLTliZGYtOWU1YjgyNDAxYzliIn0.__hSeqOxhoPmZIDFtvmKhKQd6dPKHJpNG46YsNTgK-Y",
  "access_expires_at": "2026-10-28T10:45:40.352503883Z",
  "refresh_token": "3bl6yofTJ05Z9ZVkQ6FFew-4VhJcMIYvkFtZ1KdVTl4",
  "refresh_expires_at": "2026-10-28T22:30:40.351933782Z",
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
        "created": 7,
        "fulfilled": 3,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 7
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 6
        },
        "cancelled_by": {
          "STAFF": 1,
          "DRIVER": 1,
          "RIDER": 2
        }
      }
    }
  ],
  "total": {
    "created": 7,
    "fulfilled": 3,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 7
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 6
    },
    "cancelled_by": {
      "STAFF": 1,
      "DRIVER": 1,
      "RIDER": 2
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
  "generated_at": "2026-10-28T10:30:40.588123581Z"
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
  "generated_at": "2026-10-28T10:30:40.824833987Z"
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
  "session_id": "9d7e289b-e67e-4a6a-9b28-847ce9f63d1a",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNDEsImlhdCI6MTc5MzE4MzQ0MSwianRpIjoiZmE2M2VhZDQtNjE5ZC00N2Y5LWEwOTQtNTExYTIwN2U1OTY3Iiwic2lkIjoiOWQ3ZTI4OWItZTY3ZS00YTZhLTliMjgtODQ3Y2U5ZjYzZDFhIn0.wzHzKVVeRJN6TDUgAaWP1csa1yMoJbgMEknnjPBHPzU",
  "access_expires_at": "2026-10-28T10:45:41.400572812Z",
  "refresh_token": "uNOjvflPgnR18MrVlF_xCpmCZAvzOL6JxKbFDLqcbSU",
  "refresh_expires_at": "2026-10-28T22:30:41.399986446Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7903c4c0-40bf-40aa-bc93-ebb5f67e0f95/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:30:30.839625Z",
      "actor": {
        "type": "CLIENT",
        "id": "bcd1d02a-633a-4a64-8db6-063d1139d035",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
        "quote_id": "fe1809a5-a4c5-4ff8-8582-4808df23fd08",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "981b3d63-117c-4a54-a56e-115011b1d5ea"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:30:30.841583Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
        "attempt_id": "53f4bf16-9ad8-4518-84dd-b64b16a0ce36",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "981b3d63-117c-4a54-a56e-115011b1d5ea"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:30:30.848203Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d764ee4a-095f-4867-ae98-f5eb97b282f7",
        "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "981b3d63-117c-4a54-a56e-115011b1d5ea"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:30:31.353272Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d764ee4a-095f-4867-ae98-f5eb97b282f7",
        "order_id": "7903c4c0-40bf-40aa-bc93-ebb5f67e0f95",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ded76922-2ce0-4a0e-9b94-a9a4265a538b"
      },
      "correlation_id": "86fbfeec-37a9-4330-9992-ab92490d3def"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:30:41.874892983Z",
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
      "last_location_at": "2026-10-28T10:30:34.835313Z",
      "order_id": null
    }
  ]
}
```

Done: order 7903c4c0-40bf-40aa-bc93-ebb5f67e0f95.

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
  "session_id": "8fde70f3-878f-42a1-86c0-d5ff9531104e",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNDIsImlhdCI6MTc5MzE4MzQ0MiwianRpIjoiNWMzMTExNDAtOGU1NS00YjViLTk0NTgtNjllMzAzOGZiMWJlIiwic2lkIjoiOGZkZTcwZjMtODc4Zi00MmExLTg2YzAtZDVmZjk1MzExMDRlIn0.hQQ0IVS9qe3jADe2eUHmxBwrvOOwp8-K2FCsGMOpzbA",
  "access_expires_at": "2026-10-28T10:45:42.465569306Z",
  "refresh_token": "apSOZb3t4c2GICAF0xBrpB3hHUiPSAcyMjMQ8bNuE8I",
  "refresh_expires_at": "2026-10-28T22:30:42.464942009Z",
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
  "command_id": "08ff4ad4-0c1f-447d-841b-57386611f064",
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
  "timestamp": "2026-10-28T10:30:43.000+0000",
  "channel": {
    "id": "1730052000.2220121797",
    "linkedid": "1730052000.2220121797",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675511211"
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
  "timestamp": "2026-10-28T10:30:43.000+0000",
  "channel": {
    "id": "1730052000.2220121797",
    "linkedid": "1730052000.2220121797",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675511211"
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
  "session_id": "3b7e87ce-855d-4da6-a6a9-9c5f8cfc981d",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNDMsImlhdCI6MTc5MzE4MzQ0MywianRpIjoiNGVlMWM1YzUtZDIyYS00ZGNiLWE0ZWEtMjI3OGQ5ZjAwNzU3Iiwic2lkIjoiM2I3ZTg3Y2UtODU1ZC00ZGE2LWE2YTktOWM1ZjhjZmM5ODFkIn0.hIZ4CF2Myp7VtX8efzA_O_GJF_L05dzStJhyvDGvYNs",
  "access_expires_at": "2026-10-28T10:45:43.552842978Z",
  "refresh_token": "wxE37B2MKB87VTslVkl7Q2QOJ5mTS71EHTUoETZvOiE",
  "refresh_expires_at": "2026-10-28T22:30:43.552330191Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "02bffc50-851c-4355-ae7b-8e590bb63085",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675511211",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:30:43Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/02bffc50-851c-4355-ae7b-8e590bb63085/answer` → **200**

```json
{
  "command_id": "7391f696-4e66-447d-865d-6256c97b113c"
}
```

```json
{
  "id": "02bffc50-851c-4355-ae7b-8e590bb63085",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675511211",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5e547375-1197-4965-80da-610da65befa6",
  "order_ids": [],
  "started_at": "2026-10-28T10:30:43Z",
  "answered_at": "2026-10-28T10:30:44.042629Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2220121797",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f76b754c-6bf2-4046-b8df-023ebd0fe0c2",
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
  "id": "dd2b20cf-b87f-4b7c-beb0-fc9d585e637f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:35:44.324811Z",
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
  "command_id": "7dbdeefb-3781-4176-af68-6cc27fa5f9ba",
  "quote_id": "dd2b20cf-b87f-4b7c-beb0-fc9d585e637f",
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
    "phone": "+380675511211"
  },
  "call_id": "02bffc50-851c-4355-ae7b-8e590bb63085"
}
```

```json
{
  "id": "ef219ff0-36be-454a-aa24-0ebaa9d65745",
  "short_number": 8,
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
  "created_at": "2026-10-28T10:30:44.591978Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675511211"
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
    "id": "1730052000.2220121797",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "02bffc50-851c-4355-ae7b-8e590bb63085",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675511211",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [
        "ef219ff0-36be-454a-aa24-0ebaa9d65745"
      ],
      "started_at": "2026-10-28T10:30:43Z",
      "answered_at": "2026-10-28T10:30:44.042629Z",
      "ended_at": "2026-10-28T10:30:44.856308Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "8d795ef5-9ea0-49bd-8287-a2a722df5a00",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674943060",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [],
      "started_at": "2026-10-28T10:29:10.939737Z",
      "answered_at": "2026-10-28T10:29:11.217577Z",
      "ended_at": "2026-10-28T10:29:11.482092Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:29:18.344349Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ef219ff0-36be-454a-aa24-0ebaa9d65745` → **200**

```json
{
  "id": "ef219ff0-36be-454a-aa24-0ebaa9d65745",
  "short_number": 8,
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
  "created_at": "2026-10-28T10:30:44.591978Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675511211"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ef219ff0-36be-454a-aa24-0ebaa9d65745` → **200**

```json
{
  "id": "ef219ff0-36be-454a-aa24-0ebaa9d65745",
  "short_number": 8,
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
  "created_at": "2026-10-28T10:30:44.591978Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675511211"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ef219ff0-36be-454a-aa24-0ebaa9d65745/cancel` → **200**

```json
{
  "command_id": "223eab2e-92a5-4eca-bc39-3a8a71cd11db",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ef219ff0-36be-454a-aa24-0ebaa9d65745",
  "short_number": 8,
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
  "created_at": "2026-10-28T10:30:44.591978Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675511211"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 02bffc50-851c-4355-ae7b-8e590bb63085 with order ef219ff0-36be-454a-aa24-0ebaa9d65745.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15903"
}
```

```json
{
  "challenge_id": "29715be0-74b9-4ac0-ae4d-47387f6671e7",
  "expires_at": "2026-10-28T10:35:45.887754348Z",
  "resend_available_at": "2026-10-28T10:30:46.887754348Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "532825",
  "sent_at": "2026-10-28T10:30:45.889928308Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29715be0-74b9-4ac0-ae4d-47387f6671e7",
  "code": "532825",
  "device_ref": "sandbox-15903"
}
```

```json
{
  "session_id": "678d393c-4527-4f05-a0a7-bd5ddb321da6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDM0NiwiaWF0IjoxNzkzMTgzNDQ2LCJqdGkiOiJjOTA2ZTNmNC02OTRmLTRmMmUtOTM0MC01YjM2ZGYyMWJkOTUiLCJzaWQiOiI2NzhkMzkzYy00NTI3LTRmMDUtYTBhNy1iZDVkZGIzMjFkYTYifQ.qyi1Z-44gxJ-eXZdh_aGMt56I1RQhDLPloGZKL5hkds",
  "access_expires_at": "2026-10-28T10:45:46.163419783Z",
  "refresh_token": "mOyeHitwVaKhzxdmsM3AQGqiNcTSvjPP-E-SqzcZbyw",
  "refresh_expires_at": "2026-11-27T10:30:46.161438097Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:34.835313Z",
  "last_location_at": "2026-10-28T10:30:34.835313Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/handover` → **200**

```json
{
  "command_id": "5b0cd801-3611-4198-936b-deae6a08169d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:34.835313Z",
  "last_location_at": "2026-10-28T10:30:34.835313Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:46Z",
    "sequence": 1793183446875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:46.895693Z",
  "last_location_at": "2026-10-28T10:30:46.895693Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663977364",
  "device_ref": "sandbox-21659"
}
```

```json
{
  "challenge_id": "837f7e9d-a387-43db-990d-07509f830ca7",
  "expires_at": "2026-10-28T10:35:47.127049397Z",
  "resend_available_at": "2026-10-28T10:30:48.127049397Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663977364` → **200**

```json
{
  "phone": "+380663977364",
  "audience": "CLIENT",
  "code": "639498",
  "sent_at": "2026-10-28T10:30:47.129379427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "837f7e9d-a387-43db-990d-07509f830ca7",
  "code": "639498",
  "device_ref": "sandbox-21659"
}
```

```json
{
  "session_id": "24c30459-facc-4fb1-b112-34a3637eff5e",
  "subject": {
    "type": "CLIENT",
    "id": "d8b0d94d-ff8c-4a42-88e3-1e1dc19ae279"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOGIwZDk0ZC1mZjhjLTRhNDItODhlMy0xZTFkYzE5YWUyNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzQ3LCJpYXQiOjE3OTMxODM0NDcsImp0aSI6IjFiZjUwZWE2LTRmZTYtNDIwYi04YmUwLWM5M2U0MjcwMGRhMyIsInNpZCI6IjI0YzMwNDU5LWZhY2MtNGZiMS1iMTEyLTM0YTM2MzdlZmY1ZSJ9.DEjQD7OWP9A_4E0Eo28G289lVyFI__n5TgrQVIIPpUk",
  "access_expires_at": "2026-10-28T10:45:47.385504213Z",
  "refresh_token": "FRzVanVYCb1QJYP9MDarCi-3DpDIa2HX482SsPmhCCA",
  "refresh_expires_at": "2026-11-27T10:30:47.384992017Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a9c60ad2-3479-4f06-8822-0654a2b185bc",
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
  "id": "b1cc30ef-8075-40ce-920a-ff31c8db482e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:35:47.624422Z",
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
  "command_id": "663b3d70-1b6c-469d-b74d-b6b3a32e51e5",
  "quote_id": "b1cc30ef-8075-40ce-920a-ff31c8db482e",
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
  "id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d8b0d94d-ff8c-4a42-88e3-1e1dc19ae279",
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
  "created_at": "2026-10-28T10:30:47.875997Z",
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
    "id": "db0130e0-e452-48d6-9100-f555deb6155d",
    "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
    "expires_at": "2026-10-28T10:31:02.879752Z",
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

`POST /api/driver/v1/offers/db0130e0-e452-48d6-9100-f555deb6155d/accept` → **200**

```json
{
  "command_id": "86b50b4f-aa49-4f64-8f65-8431f06926e3"
}
```

```json
{
  "id": "e618f243-72e5-4c8c-9031-49a155219414",
  "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5b689ef5-0a88-4625-a68b-454734618ad1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5b689ef5-0a88-4625-a68b-454734618ad1",
  "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
  "assignment_id": "e618f243-72e5-4c8c-9031-49a155219414",
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

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:48Z",
    "sequence": 1793183448830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:48.849678Z",
  "last_location_at": "2026-10-28T10:30:48.849678Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5b689ef5-0a88-4625-a68b-454734618ad1/arrive` → **200**

```json
{
  "command_id": "e1893a5a-a240-442a-ad81-1eecb9af2548",
  "expected_version": 0
}
```

```json
{
  "id": "5b689ef5-0a88-4625-a68b-454734618ad1",
  "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
  "assignment_id": "e618f243-72e5-4c8c-9031-49a155219414",
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
  "arrived_at": "2026-10-28T10:30:49.097559Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5b689ef5-0a88-4625-a68b-454734618ad1/start` → **200**

```json
{
  "command_id": "909c9b30-1a6f-42db-a124-a682fbfafcaf",
  "expected_version": 1
}
```

```json
{
  "id": "5b689ef5-0a88-4625-a68b-454734618ad1",
  "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
  "assignment_id": "e618f243-72e5-4c8c-9031-49a155219414",
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
  "arrived_at": "2026-10-28T10:30:49.097559Z",
  "started_at": "2026-10-28T10:30:49.342971Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:49Z",
    "sequence": 1793183449580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:49.5995Z",
  "last_location_at": "2026-10-28T10:30:49.5995Z",
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
  "device_ref": "sandbox-32365"
}
```

```json
{
  "challenge_id": "b615c282-8c8f-4c03-b91e-42c6c15c57bc",
  "expires_at": "2026-10-28T10:35:49.832542989Z",
  "resend_available_at": "2026-10-28T10:30:50.832542989Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "134985",
  "sent_at": "2026-10-28T10:30:49.834788994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b615c282-8c8f-4c03-b91e-42c6c15c57bc",
  "code": "134985",
  "device_ref": "sandbox-32365"
}
```

```json
{
  "session_id": "25798c2a-7f16-44aa-882d-940d98cd774e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDM1MCwiaWF0IjoxNzkzMTgzNDUwLCJqdGkiOiJkOTJkZDY0Yi1mYjcwLTQzYTUtYTZhZS1iZmM5OGI5M2FiMzAiLCJzaWQiOiIyNTc5OGMyYS03ZjE2LTQ0YWEtODgyZC05NDBkOThjZDc3NGUifQ.NL-5g7GUG5Dnh6i9v3x4efKHY9b6bT-Wzh3MvD1RA88",
  "access_expires_at": "2026-10-28T10:45:50.092321894Z",
  "refresh_token": "bhbQxrJVcyebJeBh6mK96llzZkikxoJAmW5ZDDMuXvE",
  "refresh_expires_at": "2026-11-27T10:30:50.091806473Z",
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
  "command_id": "8d7c970d-ab15-478b-8f79-1f06281b095a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:50Z",
    "sequence": 1793183450557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a711d86c-8e3a-4354-96b7-bbd86437defd",
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
  "last_heartbeat_at": "2026-10-28T10:30:50.576015Z",
  "last_location_at": "2026-10-28T10:30:50.576015Z",
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
  "session_id": "db77f946-9f6c-451a-926c-7549054297ba",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNTEsImlhdCI6MTc5MzE4MzQ1MSwianRpIjoiYmFhZGE2ZjYtMWNlZi00MWIyLTlkNjYtYjVkNDhmNGRmYmMyIiwic2lkIjoiZGI3N2Y5NDYtOWY2Yy00NTFhLTkyNmMtNzU0OTA1NDI5N2JhIn0.Q-MK2uXyiGxuGjFI1c6HlGqtJwkPjZFSYuN4_0q_7sY",
  "access_expires_at": "2026-10-28T10:45:51.147799994Z",
  "refresh_token": "jJtLdytcsjpT_JfSRWeEcKSL6te6nHnh74_zlWdmEMM",
  "refresh_expires_at": "2026-10-28T22:30:51.147140871Z",
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
  "session_id": "acf09683-fbd9-45c4-bbe3-b2a5dfcb0dd5",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNTEsImlhdCI6MTc5MzE4MzQ1MSwianRpIjoiY2JlMzkyMzQtNmY2YS00MDA0LTgwOTMtZGM2OWIyNTY1ZWFjIiwic2lkIjoiYWNmMDk2ODMtZmJkOS00NWM0LWJiZTMtYjJhNWRmY2IwZGQ1In0.ihDs2bfEdSJ9EWXL0tU-1NUHhRmm7MvHJHFgYj14xHs",
  "access_expires_at": "2026-10-28T10:45:51.725125791Z",
  "refresh_token": "dLo5x18DcDPJeEGWECL-cO1E88TjGkee2Ox9IOZQToY",
  "refresh_expires_at": "2026-10-28T22:30:51.724603651Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b22ea052-cdb6-4453-a29c-f4052d39bd15` → **200**

```json
{
  "id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d8b0d94d-ff8c-4a42-88e3-1e1dc19ae279",
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
    "id": "e618f243-72e5-4c8c-9031-49a155219414",
    "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5b689ef5-0a88-4625-a68b-454734618ad1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T10:30:47.875997Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b22ea052-cdb6-4453-a29c-f4052d39bd15/interrupt` → **200**

```json
{
  "command_id": "1b5949a0-bc77-4bcf-bbc1-194bdcaf328c",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "d8b0d94d-ff8c-4a42-88e3-1e1dc19ae279",
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
      "id": "e618f243-72e5-4c8c-9031-49a155219414",
      "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "5b689ef5-0a88-4625-a68b-454734618ad1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T10:30:47.875997Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "d8b0d94d-ff8c-4a42-88e3-1e1dc19ae279",
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
    "id": "be6c9754-1f75-4182-9c06-efab44055ece",
    "order_id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
    "expires_at": "2026-10-28T10:31:07.231827Z",
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

`POST /api/driver/v1/offers/be6c9754-1f75-4182-9c06-efab44055ece/accept` → **200**

```json
{
  "command_id": "ad2a9b0a-c7ae-4634-ad5f-a72fdb990c8d"
}
```

```json
{
  "id": "fc8d2799-401a-4cc5-915c-c8aff0e5cf71",
  "order_id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34d84962-8a0b-4648-a175-ed5000fb2fd6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34d84962-8a0b-4648-a175-ed5000fb2fd6",
  "order_id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
  "assignment_id": "fc8d2799-401a-4cc5-915c-c8aff0e5cf71",
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
  "session_id": "a711d86c-8e3a-4354-96b7-bbd86437defd",
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
  "last_heartbeat_at": "2026-10-28T10:30:50.576015Z",
  "last_location_at": "2026-10-28T10:30:50.576015Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a711d86c-8e3a-4354-96b7-bbd86437defd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:30:53Z",
    "sequence": 1793183453442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a711d86c-8e3a-4354-96b7-bbd86437defd",
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
  "last_heartbeat_at": "2026-10-28T10:30:53.461493Z",
  "last_location_at": "2026-10-28T10:30:53.461493Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/34d84962-8a0b-4648-a175-ed5000fb2fd6/arrive` → **200**

```json
{
  "command_id": "c34328cb-ac5a-456a-9c05-cfc40d0789ce",
  "expected_version": 0
}
```

```json
{
  "id": "34d84962-8a0b-4648-a175-ed5000fb2fd6",
  "order_id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
  "assignment_id": "fc8d2799-401a-4cc5-915c-c8aff0e5cf71",
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
  "arrived_at": "2026-10-28T10:30:53.705949Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/34d84962-8a0b-4648-a175-ed5000fb2fd6/start` → **200**

```json
{
  "command_id": "0a67bc5e-e73d-4607-8177-b093f6267160",
  "expected_version": 1
}
```

```json
{
  "id": "34d84962-8a0b-4648-a175-ed5000fb2fd6",
  "order_id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
  "assignment_id": "fc8d2799-401a-4cc5-915c-c8aff0e5cf71",
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
  "arrived_at": "2026-10-28T10:30:53.705949Z",
  "started_at": "2026-10-28T10:30:53.953771Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/34d84962-8a0b-4648-a175-ed5000fb2fd6/complete` → **200**

```json
{
  "command_id": "854f18a3-bb5a-4896-a281-e340a611b412",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:30:54Z"
}
```

```json
{
  "id": "34d84962-8a0b-4648-a175-ed5000fb2fd6",
  "order_id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
  "assignment_id": "fc8d2799-401a-4cc5-915c-c8aff0e5cf71",
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
  "arrived_at": "2026-10-28T10:30:53.705949Z",
  "started_at": "2026-10-28T10:30:53.953771Z",
  "completed_at": "2026-10-28T10:30:54.207448Z",
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
    "id": "f02fcb66-e4c1-469f-b9dc-7228cae15268",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:30:52.22071Z",
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
    "id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:30:47.875997Z",
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
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
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

`GET /api/operator/v1/orders/b22ea052-cdb6-4453-a29c-f4052d39bd15/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:30:47.876561Z",
      "actor": {
        "type": "CLIENT",
        "id": "d8b0d94d-ff8c-4a42-88e3-1e1dc19ae279",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
        "quote_id": "b1cc30ef-8075-40ce-920a-ff31c8db482e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "e6639e69-c12b-4e1a-b1e9-4477c36fd7ca"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:30:47.878715Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
        "attempt_id": "181507df-861b-48e0-9775-3ece6d016926",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e6639e69-c12b-4e1a-b1e9-4477c36fd7ca"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:30:47.886561Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "db0130e0-e452-48d6-9100-f555deb6155d",
        "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "e6639e69-c12b-4e1a-b1e9-4477c36fd7ca"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:30:48.37587Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "db0130e0-e452-48d6-9100-f555deb6155d",
        "order_id": "b22ea052-cdb6-4453-a29c-f4052d39bd15",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e618f243-72e5-4c8c-9031-49a155219414"
      },
      "correlation_id": "af70908f-9a6e-4dd7-ade5-9d9ecae48ac9"
```

Done: interrupted b22ea052-cdb6-4453-a29c-f4052d39bd15, follow-up f02fcb66-e4c1-469f-b9dc-7228cae15268.

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
  "session_id": "3db30527-7420-4f9f-879a-fafe3250e473",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNTgsImlhdCI6MTc5MzE4MzQ1OCwianRpIjoiNjc3NmM2ZTktZGY4Mi00OTM3LTg1NzUtODY2NTQ5MTU2YmZiIiwic2lkIjoiM2RiMzA1MjctNzQyMC00ZjlmLTg3OWEtZmFmZTMyNTBlNDczIn0.iAAhYYgMKPBcxlJfD9Wlbj4oaSaQ9rH8X6n_pc-d_jU",
  "access_expires_at": "2026-10-28T10:45:58.5118506Z",
  "refresh_token": "vXrIQ8q3wRhYAJ60dDwCi6VmloFLWOcQ1Q8xMbniGig",
  "refresh_expires_at": "2026-10-28T22:30:58.511321179Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a810f32b-f6e5-400e-9105-71d17ecec059",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:30:58Z"
}
```

```json
{
  "id": "9aa08242-0893-4870-aa8f-6b0050eeff1c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:30:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9aa08242-0893-4870-aa8f-6b0050eeff1c/publish` → **200**

```json
{
  "command_id": "f074b280-9473-49c8-835f-4ae39ffa9960",
  "expected_version": 0
}
```

```json
{
  "id": "9aa08242-0893-4870-aa8f-6b0050eeff1c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:30:59.014703Z",
  "published_at": "2026-10-28T10:30:59.014703Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "9aa08242-0893-4870-aa8f-6b0050eeff1c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:30:59.014703Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633341424",
  "device_ref": "sandbox-15771"
}
```

```json
{
  "challenge_id": "3790b26f-b691-4985-a5b7-9df6f89452e6",
  "expires_at": "2026-10-28T10:35:59.485098417Z",
  "resend_available_at": "2026-10-28T10:31:00.485098417Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633341424` → **200**

```json
{
  "phone": "+380633341424",
  "audience": "CLIENT",
  "code": "707946",
  "sent_at": "2026-10-28T10:30:59.487362039Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3790b26f-b691-4985-a5b7-9df6f89452e6",
  "code": "707946",
  "device_ref": "sandbox-15771"
}
```

```json
{
  "session_id": "3b3b63bc-6c5c-4907-904f-a4f0938b0906",
  "subject": {
    "type": "CLIENT",
    "id": "a1681e76-2ae7-4600-baf3-09ca32e2bf20"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTY4MWU3Ni0yYWU3LTQ2MDAtYmFmMy0wOWNhMzJlMmJmMjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzU5LCJpYXQiOjE3OTMxODM0NTksImp0aSI6ImI2ZDg2MjAxLWJhNzEtNDhjZC04ZGM4LTQ4NjU1YmQyMzgwZiIsInNpZCI6IjNiM2I2M2JjLTZjNWMtNDkwNy05MDRmLWE0ZjA5MzhiMDkwNiJ9.IKaot2GMDDRg99xjUxBZglieY4NIcgbeJ1yChe8K6YA",
  "access_expires_at": "2026-10-28T10:45:59.746026435Z",
  "refresh_token": "X7hq3PWoeJi5sfw1AnkEVHANq3R15F29L0_H9xFZRF8",
  "refresh_expires_at": "2026-11-27T10:30:59.745436895Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "9aa08242-0893-4870-aa8f-6b0050eeff1c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:30:59.014703Z",
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
  "command_id": "3877c0c8-74db-45ab-8bb4-749f61a7984d",
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
  "id": "12ad6ef3-57fe-4809-9a75-3bb7ccffb234",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:00.217427Z",
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
  "command_id": "84c2de3f-b0bf-4900-a2ae-22a71fee0720",
  "quote_id": "12ad6ef3-57fe-4809-9a75-3bb7ccffb234",
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
  "correlation_id": "f2efd523-4baf-4cc5-9b01-b7cd945c9c61"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d615df63-2650-4033-8502-fbdfca9d0952",
  "version_id": "9aa08242-0893-4870-aa8f-6b0050eeff1c",
  "language": "uk"
}
```

```json
{
  "version_id": "9aa08242-0893-4870-aa8f-6b0050eeff1c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:31:00.721206Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b720d3e-263e-46b4-9695-4f3991bdf50f",
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
  "id": "c95e3508-3b2f-42e7-b7c0-9e3d1c144cd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:00.969591Z",
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
  "command_id": "6575b843-7594-4d67-ba2d-20e122d897fe",
  "quote_id": "c95e3508-3b2f-42e7-b7c0-9e3d1c144cd0",
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
  "id": "b7c362bd-5411-4d54-856f-9f5582726b03",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1681e76-2ae7-4600-baf3-09ca32e2bf20",
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
  "created_at": "2026-10-28T10:31:01.216472Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b7c362bd-5411-4d54-856f-9f5582726b03` → **200**

```json
{
  "id": "b7c362bd-5411-4d54-856f-9f5582726b03",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1681e76-2ae7-4600-baf3-09ca32e2bf20",
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
  "created_at": "2026-10-28T10:31:01.216472Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b7c362bd-5411-4d54-856f-9f5582726b03/cancel` → **200**

```json
{
  "command_id": "3ca02dd8-31b2-4726-a1c2-54eadb8755c1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b7c362bd-5411-4d54-856f-9f5582726b03",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a1681e76-2ae7-4600-baf3-09ca32e2bf20",
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
  "created_at": "2026-10-28T10:31:01.216472Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
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

`POST /api/admin/v1/legal-documents/9aa08242-0893-4870-aa8f-6b0050eeff1c` → **409**

```json
{
  "command_id": "b91fde75-2f4d-4ff7-aea0-b5ae7c18cae1",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:31:01Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/9aa08242-0893-4870-aa8f-6b0050eeff1c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3300d2c0-0a5e-4f52-91fa-b663c7b9ee12"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "57cb486f-d40b-462a-8e4a-a36d584e75ca",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:31:02Z"
}
```

```json
{
  "id": "83ca7838-e1d2-43e9-88f4-20c70af59ade",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:31:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/83ca7838-e1d2-43e9-88f4-20c70af59ade/publish` → **200**

```json
{
  "command_id": "d7e1d09e-4df5-436b-b23b-0dc9baab1d30",
  "expected_version": 0
}
```

```json
{
  "id": "83ca7838-e1d2-43e9-88f4-20c70af59ade",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:31:02.509213Z",
  "published_at": "2026-10-28T10:31:02.509213Z",
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
  "device_ref": "sandbox-15081"
}
```

```json
{
  "challenge_id": "87a5f279-c038-43cc-940c-2efa4e24cb86",
  "expires_at": "2026-10-28T10:36:02.753539411Z",
  "resend_available_at": "2026-10-28T10:31:03.753539411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "000938",
  "sent_at": "2026-10-28T10:31:02.755605374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87a5f279-c038-43cc-940c-2efa4e24cb86",
  "code": "000938",
  "device_ref": "sandbox-15081"
}
```

```json
{
  "session_id": "d2c23f00-371b-4859-abf9-7fc0e08c5c7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDM2MywiaWF0IjoxNzkzMTgzNDYzLCJqdGkiOiI1NDAxODk1Zi04MjVjLTQwYmUtYWQyMy03NTFjZWIyZjA5NDkiLCJzaWQiOiJkMmMyM2YwMC0zNzFiLTQ4NTktYWJmOS03ZmMwZTA4YzVjN2EifQ.Lz5QfyQxs9_nqgh9FBcJl4JWA_ePh1QV0wU8be3jAp0",
  "access_expires_at": "2026-10-28T10:46:03.012998426Z",
  "refresh_token": "tucQo0eMuPJJnQ-VLA-SaX_CgKIbJUChm4-Lv_aO6eY",
  "refresh_expires_at": "2026-11-27T10:31:03.012441012Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a711d86c-8e3a-4354-96b7-bbd86437defd",
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
  "last_heartbeat_at": "2026-10-28T10:30:53.461493Z",
  "last_location_at": "2026-10-28T10:30:53.461493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a711d86c-8e3a-4354-96b7-bbd86437defd/handover` → **200**

```json
{
  "command_id": "efe9f226-17a6-415d-84c6-d8bbbf23009c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a711d86c-8e3a-4354-96b7-bbd86437defd",
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
  "last_heartbeat_at": "2026-10-28T10:30:53.461493Z",
  "last_location_at": "2026-10-28T10:30:53.461493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a711d86c-8e3a-4354-96b7-bbd86437defd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:03Z",
    "sequence": 1793183463723
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a711d86c-8e3a-4354-96b7-bbd86437defd",
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
  "last_heartbeat_at": "2026-10-28T10:31:03.741731Z",
  "last_location_at": "2026-10-28T10:31:03.741731Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677512336",
  "device_ref": "sandbox-4634"
}
```

```json
{
  "challenge_id": "90b5ae07-2a90-4c64-9b4f-d9684bdedb67",
  "expires_at": "2026-10-28T10:36:03.97578896Z",
  "resend_available_at": "2026-10-28T10:31:04.97578896Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677512336` → **200**

```json
{
  "phone": "+380677512336",
  "audience": "CLIENT",
  "code": "715510",
  "sent_at": "2026-10-28T10:31:03.977716028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90b5ae07-2a90-4c64-9b4f-d9684bdedb67",
  "code": "715510",
  "device_ref": "sandbox-4634"
}
```

```json
{
  "session_id": "503e0650-0658-447e-86a9-b9b78add8f8b",
  "subject": {
    "type": "CLIENT",
    "id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmExYjBjMy1lNTBlLTQ4NWYtOWU3YS0xZWY2ZjNhM2YzMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzY0LCJpYXQiOjE3OTMxODM0NjQsImp0aSI6ImI4ZmQ0YzIwLWQwZmMtNDI1Zi1hZDAxLWY0ZjkyNTBmNjYyZCIsInNpZCI6IjUwM2UwNjUwLTA2NTgtNDQ3ZS04NmE5LWI5Yjc4YWRkOGY4YiJ9.kU7XLTg4tCzm_qJrfpEz_TiE3T-YPQCtx96STazc17k",
  "access_expires_at": "2026-10-28T10:46:04.235542771Z",
  "refresh_token": "VqsdEBJqLj437W_jG6x74PFx9w5u5UwZV2EO_4vk8Jw",
  "refresh_expires_at": "2026-11-27T10:31:04.234916389Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1a54b61-dde0-492e-9ed3-79b467b0b3e5",
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
  "id": "c94640d4-aaa4-42c9-b322-88727bd5d9b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:04.478815Z",
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
  "command_id": "681cea74-04f9-4e76-8dc6-f6979751a8b6",
  "quote_id": "c94640d4-aaa4-42c9-b322-88727bd5d9b6",
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
    "phone": "+380678312631"
  }
}
```

```json
{
  "id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:04.726613Z",
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
    "id": "09b15852-306e-4f42-9110-2effa66d2df9",
    "order_id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
    "expires_at": "2026-10-28T10:31:19.729664Z",
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

`POST /api/driver/v1/offers/09b15852-306e-4f42-9110-2effa66d2df9/accept` → **200**

```json
{
  "command_id": "4bb61c48-7790-4ca6-a469-6bc88b19bf61"
}
```

```json
{
  "id": "a57ad693-26f3-45d8-908d-c7b10ca8893e",
  "order_id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "94a39f0e-ce54-454a-8421-17d4539a90d1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94a39f0e-ce54-454a-8421-17d4539a90d1",
  "order_id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
  "assignment_id": "a57ad693-26f3-45d8-908d-c7b10ca8893e",
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
    "phone": "+380678312631"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "33541c0b-5ad0-45fa-b8a3-f04cd8bbe6de",
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
  "id": "c512dd7f-22ee-4b18-9ae8-ed3cf4bb4927",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:05.709760Z",
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
  "command_id": "cd92e801-3797-4f95-8325-81c46fb7067b",
  "quote_id": "c512dd7f-22ee-4b18-9ae8-ed3cf4bb4927",
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
  "id": "f2309ea7-0ec9-4209-831a-b9ba0d8028b9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:05.964031Z",
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
  "command_id": "66717e0a-3c74-4cbd-aa31-58ec10b06ff4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:31:06Z"
}
```

```json
{
  "id": "72c3693e-cdaf-40d8-8089-b7c201c1b483",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:06.228881Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:31:06Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2fd03ac1-59f3-4508-b8ec-417b2436b1c6",
  "quote_id": "72c3693e-cdaf-40d8-8089-b7c201c1b483",
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
  "pickup_at": "2026-10-28T13:31:06Z"
}
```

```json
{
  "id": "61b7eb08-45ce-46ae-aca9-f37848f2383a",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:06.485399Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:31:06Z",
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
  "command_id": "47987c1f-addd-48a5-98c8-4edc8c78e8d3",
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
  "id": "4b5fe0bb-aeed-4669-9092-c085f8a03aab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:06.747643Z",
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
  "command_id": "710f7ab0-8913-4017-9e13-cbc4b7e7c5af",
  "quote_id": "4b5fe0bb-aeed-4669-9092-c085f8a03aab",
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
  "correlation_id": "1798e950-191a-44af-96b0-3da8375f0ee2"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "61b7eb08-45ce-46ae-aca9-f37848f2383a",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
      "created_at": "2026-10-28T10:31:06.485399Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:31:06Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "f2309ea7-0ec9-4209-831a-b9ba0d8028b9",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
      "created_at": "2026-10-28T10:31:05.964031Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f2309ea7-0ec9-4209-831a-b9ba0d8028b9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:05.964031Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/84387f07-ee26-4c3d-b730-ffdbf0ba7fd0` → **200**

```json
{
  "id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
    "id": "a57ad693-26f3-45d8-908d-c7b10ca8893e",
    "order_id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "94a39f0e-ce54-454a-8421-17d4539a90d1",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:31:04.726613Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/84387f07-ee26-4c3d-b730-ffdbf0ba7fd0/cancel` → **200**

```json
{
  "command_id": "c05f0b09-8577-4541-923d-001cdd291846",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
    "id": "a57ad693-26f3-45d8-908d-c7b10ca8893e",
    "order_id": "84387f07-ee26-4c3d-b730-ffdbf0ba7fd0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "94a39f0e-ce54-454a-8421-17d4539a90d1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:31:04.726613Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f2309ea7-0ec9-4209-831a-b9ba0d8028b9` → **200**

```json
{
  "id": "f2309ea7-0ec9-4209-831a-b9ba0d8028b9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:05.964031Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f2309ea7-0ec9-4209-831a-b9ba0d8028b9/cancel` → **200**

```json
{
  "command_id": "2b4c4fcf-59ea-497f-81d7-f11b9490b19e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f2309ea7-0ec9-4209-831a-b9ba0d8028b9",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:05.964031Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/61b7eb08-45ce-46ae-aca9-f37848f2383a` → **200**

```json
{
  "id": "61b7eb08-45ce-46ae-aca9-f37848f2383a",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:06.485399Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:31:06Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/61b7eb08-45ce-46ae-aca9-f37848f2383a/cancel` → **200**

```json
{
  "command_id": "7043a21b-291c-474a-969d-d07e3f338638",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "61b7eb08-45ce-46ae-aca9-f37848f2383a",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3fa1b0c3-e50e-485f-9e7a-1ef6f3a3f331",
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
  "created_at": "2026-10-28T10:31:06.485399Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-28T13:31:06Z",
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
  "session_id": "a711d86c-8e3a-4354-96b7-bbd86437defd",
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
  "last_heartbeat_at": "2026-10-28T10:31:03.741731Z",
  "last_location_at": "2026-10-28T10:31:03.741731Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a711d86c-8e3a-4354-96b7-bbd86437defd/close` → **200**

```json
{
  "command_id": "661021f8-ff5f-45b9-9178-16d90560ecd0",
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

Done: orders 84387f07-ee26-4c3d-b730-ffdbf0ba7fd0, f2309ea7-0ec9-4209-831a-b9ba0d8028b9, 61b7eb08-45ce-46ae-aca9-f37848f2383a.

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
  "session_id": "ad419dcb-b139-443d-b616-5bc0aa1df07f",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNzAsImlhdCI6MTc5MzE4MzQ3MCwianRpIjoiYWE5MjQ5ODAtODE5Ni00NzE0LTkyZWYtZTVjNzQ5MWJlMDJhIiwic2lkIjoiYWQ0MTlkY2ItYjEzOS00NDNkLWI2MTYtNWJjMGFhMWRmMDdmIn0.grglflzr_rmmo0qeJreR-Vi_gqCXawTGS_C_lfR8W8c",
  "access_expires_at": "2026-10-28T10:46:10.019515926Z",
  "refresh_token": "5j6VcqmbDB92DCuCHbfE0YzJrisdIvKrPOM-smhqiQ4",
  "refresh_expires_at": "2026-10-28T22:31:10.018961799Z",
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
  "session_id": "9656b7a1-0ac6-4d35-8f31-cdf729006095",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNzAsImlhdCI6MTc5MzE4MzQ3MCwianRpIjoiOGUwZTRmYjktOWMxMy00ZTVmLTk4ZjMtODgyZDFjNTBkMjQxIiwic2lkIjoiOTY1NmI3YTEtMGFjNi00ZDM1LThmMzEtY2RmNzI5MDA2MDk1In0.nFZx4BvO0q4j8uBGBEd6byzLTRmzFnROA4wW9ysHKI8",
  "access_expires_at": "2026-10-28T10:46:10.580871185Z",
  "refresh_token": "9QuevzATZaAia_cXh2uIGqHofODG8AERvqWS64Rlipk",
  "refresh_expires_at": "2026-10-28T22:31:10.58035226Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22069"
}
```

```json
{
  "challenge_id": "520c37be-04d0-49af-aa78-6cef59618294",
  "expires_at": "2026-10-28T10:36:10.80966101Z",
  "resend_available_at": "2026-10-28T10:31:11.80966101Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "805977",
  "sent_at": "2026-10-28T10:31:10.811929134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "520c37be-04d0-49af-aa78-6cef59618294",
  "code": "805977",
  "device_ref": "sandbox-22069"
}
```

```json
{
  "session_id": "00f50cde-2470-4fc0-a8fc-61196410b79a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDM3MSwiaWF0IjoxNzkzMTgzNDcxLCJqdGkiOiJjMmU3MTc1My02YTg2LTRhYTUtYmI3ZS01N2I1ZTU4ODM0Y2EiLCJzaWQiOiIwMGY1MGNkZS0yNDcwLTRmYzAtYThmYy02MTE5NjQxMGI3OWEifQ.Wfy-pTyr8clsiiten9wYBs9zOK7d3n_-fFz6dQhnpHI",
  "access_expires_at": "2026-10-28T10:46:11.066400562Z",
  "refresh_token": "TWzWruWGUSJHuCZyLEUBm08CN90nJqm4sAhXiHsrK34",
  "refresh_expires_at": "2026-11-27T10:31:11.065870951Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:30:49.5995Z",
  "last_location_at": "2026-10-28T10:30:49.5995Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/handover` → **200**

```json
{
  "command_id": "a3839aa4-aff3-45d8-93b1-0c14c9ff2226",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:30:49.5995Z",
  "last_location_at": "2026-10-28T10:30:49.5995Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:11Z",
    "sequence": 1793183471789
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:31:11.809001Z",
  "last_location_at": "2026-10-28T10:31:11.809001Z",
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
  "command_id": "89dab302-614e-4008-ad03-d724b85c78dd",
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
  "effective_at": "2026-10-28T10:31:12.295946Z",
  "changed_by": "5e547375-1197-4965-80da-610da65befa6",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "5e547375-1197-4965-80da-610da65befa6",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:31:12.531412569Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7de7feaa-955e-423f-adf1-90c5f911a2f2",
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
  "id": "d8f92868-fcb0-4d54-998e-f2fc48a8c3f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:12.774531Z",
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
  "command_id": "2c48d245-2f4a-4706-963b-5f96212b8a53",
  "quote_id": "d8f92868-fcb0-4d54-998e-f2fc48a8c3f2",
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
    "phone": "+3806711113462"
  }
}
```

```json
{
  "id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
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
  "created_at": "2026-10-28T10:31:13.023708Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113462"
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
    "id": "745146f8-8c1b-4412-90b8-002c7eafeb5d",
    "order_id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
    "expires_at": "2026-10-28T10:31:28.026969Z",
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

`POST /api/driver/v1/offers/745146f8-8c1b-4412-90b8-002c7eafeb5d/accept` → **200**

```json
{
  "command_id": "fb73d39e-00c8-46ce-9c0f-c15a88b70032"
}
```

```json
{
  "id": "a0c74b13-b1da-4f8e-baf9-142ea2e5c187",
  "order_id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4",
  "order_id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
  "assignment_id": "a0c74b13-b1da-4f8e-baf9-142ea2e5c187",
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
    "phone": "+3806711113462"
  }
}
```

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:13Z",
    "sequence": 1793183473979
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:31:13.998713Z",
  "last_location_at": "2026-10-28T10:31:13.998713Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4/arrive` → **200**

```json
{
  "command_id": "98212c29-4a70-4809-a484-b38eab4ce143",
  "expected_version": 0
}
```

```json
{
  "id": "16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4",
  "order_id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
  "assignment_id": "a0c74b13-b1da-4f8e-baf9-142ea2e5c187",
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
  "arrived_at": "2026-10-28T10:31:14.240695Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113462"
  }
}
```

`POST /api/driver/v1/trips/16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4/start` → **200**

```json
{
  "command_id": "7df28843-aebf-4b49-8c05-19ec47a922f4",
  "expected_version": 1
}
```

```json
{
  "id": "16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4",
  "order_id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
  "assignment_id": "a0c74b13-b1da-4f8e-baf9-142ea2e5c187",
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
  "arrived_at": "2026-10-28T10:31:14.240695Z",
  "started_at": "2026-10-28T10:31:14.491359Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113462"
  }
}
```

`POST /api/driver/v1/trips/16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4/complete` → **200**

```json
{
  "command_id": "ac7a01bf-d519-43bb-af1f-b434d2a7e25a",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:31:14Z",
  "cash_received": true
}
```

```json
{
  "id": "16be2d79-ffc6-4b9e-806f-7ad6ce0b4ed4",
  "order_id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
  "assignment_id": "a0c74b13-b1da-4f8e-baf9-142ea2e5c187",
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
  "arrived_at": "2026-10-28T10:31:14.240695Z",
  "started_at": "2026-10-28T10:31:14.491359Z",
  "completed_at": "2026-10-28T10:31:14.744513Z",
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
  "command_id": "b63f5541-2732-4499-8687-a59f6d367566",
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
  "id": "f0855ac7-937a-4e10-be58-ae3c2581a030",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:14.998029Z",
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
  "command_id": "c8d501d0-f834-43f8-b426-70f69549d6c7",
  "quote_id": "f0855ac7-937a-4e10-be58-ae3c2581a030",
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
    "phone": "+3806711126575"
  }
}
```

```json
{
  "id": "c46645cd-cb4b-4ed6-899b-ecd985f492df",
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
  "created_at": "2026-10-28T10:31:15.245465Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126575"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c46645cd-cb4b-4ed6-899b-ecd985f492df` → **200**

```json
{
  "id": "c46645cd-cb4b-4ed6-899b-ecd985f492df",
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
  "created_at": "2026-10-28T10:31:15.245465Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126575"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c46645cd-cb4b-4ed6-899b-ecd985f492df/cancel` → **200**

```json
{
  "command_id": "95b0b44a-c21e-4eee-9ae5-794af04fad65",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "c46645cd-cb4b-4ed6-899b-ecd985f492df",
  "short_number": 16,
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
  "created_at": "2026-10-28T10:31:15.245465Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126575"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора"
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
  "staff_id": "5e547375-1197-4965-80da-610da65befa6",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T10:31:14.749437Z",
  "last_entries": [
    {
      "order_id": "c46645cd-cb4b-4ed6-899b-ecd985f492df",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T10:31:15.756019Z"
    },
    {
      "order_id": "f1a8a73a-dcc5-4638-83e2-bd05082c4ca8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T10:31:14.749437Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e7b28e-20af-4432-9a7b-a8e2227f54ef",
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
  "last_heartbeat_at": "2026-10-28T10:31:13.998713Z",
  "last_location_at": "2026-10-28T10:31:13.998713Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62e7b28e-20af-4432-9a7b-a8e2227f54ef/close` → **200**

```json
{
  "command_id": "20678d99-996b-410c-bb61-f4ce1b7b9079",
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

Done: operator bonus for fulfilled f1a8a73a-dcc5-4638-83e2-bd05082c4ca8 and operator-fault cancellation c46645cd-cb4b-4ed6-899b-ecd985f492df.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671446901",
  "device_ref": "sandbox-15665"
}
```

```json
{
  "challenge_id": "05ba7c89-0d06-4b3d-b966-39498d7cb4ed",
  "expires_at": "2026-10-28T10:36:18.759744772Z",
  "resend_available_at": "2026-10-28T10:31:19.759744772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671446901` → **200**

```json
{
  "phone": "+380671446901",
  "audience": "CLIENT",
  "code": "832792",
  "sent_at": "2026-10-28T10:31:18.762022988Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673651225",
  "device_ref": "sandbox-29348",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e1b918b6-3fd9-4f6a-8275-cc6df1936984",
  "expires_at": "2026-10-28T10:36:19.016849052Z",
  "resend_available_at": "2026-10-28T10:31:20.016849052Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673651225` → **200**

```json
{
  "phone": "+380673651225",
  "audience": "CLIENT",
  "code": "141168",
  "sent_at": "2026-10-28T10:31:19.018801213Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670650000",
  "device_ref": "sandbox-6348"
}
```

```json
{
  "challenge_id": "93ad9420-c97e-4400-98fa-1fd2696e56c0",
  "expires_at": "2026-10-28T10:36:19.270693217Z",
  "resend_available_at": "2026-10-28T10:31:20.270693217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670650000` → **200**

```json
{
  "phone": "+380670650000",
  "audience": "CLIENT",
  "code": "239232",
  "sent_at": "2026-10-28T10:31:19.273165229Z",
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
  "session_id": "d201a599-f26b-48b7-9341-cba576445d3e",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzNzksImlhdCI6MTc5MzE4MzQ3OSwianRpIjoiY2JlMmI5NjYtNTE2Ni00ZTNmLWExOTAtYjU3NDkxNjcyNTFhIiwic2lkIjoiZDIwMWE1OTktZjI2Yi00OGI3LTkzNDEtY2JhNTc2NDQ1ZDNlIn0.V0ZSkbkENjIsv6L2fiJ7hq29QdNwvX9WMX_2mdXCpe0",
  "access_expires_at": "2026-10-28T10:46:19.86043225Z",
  "refresh_token": "MlDFLpf5uIFvEAdrfJFAtE8eK6HO80_e8AElxPkvGF4",
  "refresh_expires_at": "2026-10-28T22:31:19.859893265Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670650000` → **200**

```json
{
  "deliveries": [
    {
      "id": "c535afa4-3935-4271-a473-0e6dc5222089",
      "challenge_id": "93ad9420-c97e-4400-98fa-1fd2696e56c0",
      "phone": "+380670650000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-78dd8875-63f9-45f6-b696-e042e7105de7",
      "error": null,
      "attempted_at": "2026-10-28T10:31:19.273424Z"
    },
    {
      "id": "a613f612-cf7f-4825-b3bb-da23fc904976",
      "challenge_id": "93ad9420-c97e-4400-98fa-1fd2696e56c0",
      "phone": "+380670650000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:31:19.272708Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670650000` → **200**

```json
{
  "phone": "+380670650000",
  "audience": "CLIENT",
  "code": "239232",
  "sent_at": "2026-10-28T10:31:19.273165229Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673651225` → **200**

```json
{
  "deliveries": [
    {
      "id": "60df8f7b-5933-48e1-99be-03cc10cd9c97",
      "challenge_id": "e1b918b6-3fd9-4f6a-8275-cc6df1936984",
      "phone": "+380673651225",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-35a1f8a8-4f6d-4ab7-955a-2ba64455fa68",
      "error": null,
      "attempted_at": "2026-10-28T10:31:19.01904Z"
    }
  ]
}
```

Done: SMS to +380671446901, a call to +380673651225, SMS then a call to +380670650000.

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
  "session_id": "4aeaf078-2d14-445c-b2d5-678369aa7ed2",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzODAsImlhdCI6MTc5MzE4MzQ4MCwianRpIjoiYjI2MjIxNjUtMmNhOS00Yzc0LThlMzktNDA5ZjY1MDE1NDhjIiwic2lkIjoiNGFlYWYwNzgtMmQxNC00NDVjLWIyZDUtNjc4MzY5YWE3ZWQyIn0.BDdWSihsL4ZQ5YXrXJwKlx4NTMNhanPwVaymNacAqiM",
  "access_expires_at": "2026-10-28T10:46:20.940029149Z",
  "refresh_token": "sOrl6gYJHU5QQfZNl5rjp8-dbouWHmcAkNl4D86mArU",
  "refresh_expires_at": "2026-10-28T22:31:20.939548349Z",
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
  "session_id": "441ced7f-ec5c-4dd7-83ef-e8fddc79fc0d",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzODEsImlhdCI6MTc5MzE4MzQ4MSwianRpIjoiY2Q1N2IxMjEtNjRlYi00NTY3LTk2ZjItYzMyNzY5ZDdkYWMxIiwic2lkIjoiNDQxY2VkN2YtZWM1Yy00ZGQ3LTgzZWYtZThmZGRjNzlmYzBkIn0.gRzBBSsAI_cbeQIQSaY21O7wlSUu6NW_QylL6qRfe1U",
  "access_expires_at": "2026-10-28T10:46:21.506947515Z",
  "refresh_token": "3Gd96ejiSYA6gC1Q72URwpUgzrWxsCtuG8gkR8MxAs4",
  "refresh_expires_at": "2026-10-28T22:31:21.506475949Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "5e547375-1197-4965-80da-610da65befa6",
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

`POST /api/admin/v1/staff-extensions/5e547375-1197-4965-80da-610da65befa6` → **200**

```json
{
  "command_id": "e93bf7ff-31f1-484d-96be-7450cd342f95",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "5e547375-1197-4965-80da-610da65befa6",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "676c5b86-28d2-4fdd-894b-0faf39111c7c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:31:22.482739Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:31:22.482739Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cecaff40-e989-489c-85f5-08530e4410c9",
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
  "id": "59144e1e-a124-4b6e-979b-a9c955f6c5fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:22.951039Z",
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
  "command_id": "422b3d32-2904-4ff4-9b55-639dc11f6433",
  "quote_id": "59144e1e-a124-4b6e-979b-a9c955f6c5fe",
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
    "phone": "+380676030208"
  }
}
```

```json
{
  "id": "3b11e0c7-52c9-4ad1-a764-5865f386e5c1",
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
  "created_at": "2026-10-28T10:31:23.199677Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676030208"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/3b11e0c7-52c9-4ad1-a764-5865f386e5c1/calls` → **201**

```json
{
  "command_id": "93124d58-9309-4fcc-a051-0eb4c89122ab",
  "to": "CALLER"
}
```

```json
{
  "id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5e547375-1197-4965-80da-610da65befa6",
  "order_ids": [
    "3b11e0c7-52c9-4ad1-a764-5865f386e5c1"
  ],
  "started_at": "2026-10-28T10:31:23.471536Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/3b11e0c7-52c9-4ad1-a764-5865f386e5c1/calls` → **201**

```json
{
  "command_id": "93124d58-9309-4fcc-a051-0eb4c89122ab",
  "to": "CALLER"
}
```

```json
{
  "id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5e547375-1197-4965-80da-610da65befa6",
  "order_ids": [
    "3b11e0c7-52c9-4ad1-a764-5865f386e5c1"
  ],
  "started_at": "2026-10-28T10:31:23.471536Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676030208",
    "at": "2026-10-28T10:31:23.473566647Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.29851",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=3b11e0c7-52c9-4ad1-a764-5865f386e5c1` → **200**

```json
{
  "calls": [
    {
      "id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [
        "3b11e0c7-52c9-4ad1-a764-5865f386e5c1"
      ],
      "started_at": "2026-10-28T10:31:23.471536Z",
      "answered_at": "2026-10-28T10:31:24.034225Z",
      "ended_at": "2026-10-28T10:31:24.055734Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3b11e0c7-52c9-4ad1-a764-5865f386e5c1` → **200**

```json
{
  "calls": [
    {
      "id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [
        "3b11e0c7-52c9-4ad1-a764-5865f386e5c1"
      ],
      "started_at": "2026-10-28T10:31:23.471536Z",
      "answered_at": "2026-10-28T10:31:24.034225Z",
      "ended_at": "2026-10-28T10:31:24.055734Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3b11e0c7-52c9-4ad1-a764-5865f386e5c1` → **200**

```json
{
  "calls": [
    {
      "id": "85a1c7c7-582b-4b9f-87e7-c6cb05a64681",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5e547375-1197-4965-80da-610da65befa6",
      "order_ids": [
        "3b11e0c7-52c9-4ad1-a764-5865f386e5c1"
      ],
      "started_at": "2026-10-28T10:31:23.471536Z",
      "answered_at": "2026-10-28T10:31:24.034225Z",
      "ended_at": "2026-10-28T10:31:24.055734Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:31:28.370976Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/3b11e0c7-52c9-4ad1-a764-5865f386e5c1` → **200**

```json
{
  "id": "3b11e0c7-52c9-4ad1-a764-5865f386e5c1",
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
  "created_at": "2026-10-28T10:31:23.199677Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676030208"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3b11e0c7-52c9-4ad1-a764-5865f386e5c1/cancel` → **200**

```json
{
  "command_id": "46d27d56-2b86-4963-9bbe-4bbdb56a3dee",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3b11e0c7-52c9-4ad1-a764-5865f386e5c1",
  "short_number": 17,
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
  "created_at": "2026-10-28T10:31:23.199677Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676030208"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
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
  "command_id": "e1cb920f-6fab-477d-93ce-544f45baa4c9",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T10:31:29.352989Z",
  "extension": "101"
}
```

Done: outgoing call 85a1c7c7-582b-4b9f-87e7-c6cb05a64681 from order 3b11e0c7-52c9-4ad1-a764-5865f386e5c1, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634499620",
  "device_ref": "sandbox-7051"
}
```

```json
{
  "challenge_id": "873972f1-cbcd-4113-9d01-2f5e840f8176",
  "expires_at": "2026-10-28T10:36:29.604320549Z",
  "resend_available_at": "2026-10-28T10:31:30.604320549Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634499620` → **200**

```json
{
  "phone": "+380634499620",
  "audience": "CLIENT",
  "code": "950241",
  "sent_at": "2026-10-28T10:31:29.60656642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "873972f1-cbcd-4113-9d01-2f5e840f8176",
  "code": "950241",
  "device_ref": "sandbox-7051"
}
```

```json
{
  "session_id": "70792a2b-533b-4911-875f-8df8e5145d7c",
  "subject": {
    "type": "CLIENT",
    "id": "9bac90f3-29b2-4b94-974b-f283afac719f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmFjOTBmMy0yOWIyLTRiOTQtOTc0Yi1mMjgzYWZhYzcxOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Mzg5LCJpYXQiOjE3OTMxODM0ODksImp0aSI6IjU0ZmU4MjRhLWMwYjctNDIzYi04MzU3LTY4M2M4MWVmZTZhZCIsInNpZCI6IjcwNzkyYTJiLTUzM2ItNDkxMS04NzVmLThkZjhlNTE0NWQ3YyJ9.nC8NpVUMVMyhga_jo5opYq46RfDGxYgnEd5HmJGnBFU",
  "access_expires_at": "2026-10-28T10:46:29.864802172Z",
  "refresh_token": "YylMQIzTWw_lox-81gjg_looGn3l1bpeLSjId1hUUro",
  "refresh_expires_at": "2026-11-27T10:31:29.864196969Z",
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
  "session_id": "98443327-8e8c-4f7c-bff4-00a1fdd42ac3",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzOTAsImlhdCI6MTc5MzE4MzQ5MCwianRpIjoiYzdkYmJlMGItZDk4MC00MTczLThlODktY2IzYzg2MDA5YzFmIiwic2lkIjoiOTg0NDMzMjctOGU4Yy00ZjdjLWJmZjQtMDBhMWZkZDQyYWMzIn0.SCb_149qJtG4ZXyuKVrqYs7G_dR55rvp6q9mzbekZOo",
  "access_expires_at": "2026-10-28T10:46:30.93542347Z",
  "refresh_token": "z2ULvroCKsWmk7dWxBIOupaEpCYvxYXCKjFV9jxna8I",
  "refresh_expires_at": "2026-10-28T22:31:30.934909832Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634499620` → **200**

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
  "correlation_id": "6b604c26-9db5-4bd5-999a-601294bbbbdf"
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
  "session_id": "6b176ed9-2937-44c6-a15d-677313712d06",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzOTEsImlhdCI6MTc5MzE4MzQ5MSwianRpIjoiOTgxYjE3MGMtYmVkMC00MTJjLWJhMWYtZjhlZDNiMzA4Y2JhIiwic2lkIjoiNmIxNzZlZDktMjkzNy00NGM2LWExNWQtNjc3MzEzNzEyZDA2In0.aBUrstf9k2kf50G8s7naSORE3upamWWHpgFZ9HEb9mE",
  "access_expires_at": "2026-10-28T10:46:31.987913488Z",
  "refresh_token": "FoKYHfWBEB32h5nGc6dohPaG1lD5lfh9owFP7KLHO1A",
  "refresh_expires_at": "2026-10-28T22:31:31.987420611Z",
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
  "command_id": "4ee584c2-53a7-4d98-aa2e-2f5dded54194",
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
  "changed_by": "5e547375-1197-4965-80da-610da65befa6",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:31:32.477461952Z"
}
```

## The rider books the airport for 2026-10-28T13:31:31Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600451903",
  "device_ref": "sandbox-11474"
}
```

```json
{
  "challenge_id": "a9392a26-14e9-45ed-b603-9db0f05949dd",
  "expires_at": "2026-10-28T10:36:32.721741401Z",
  "resend_available_at": "2026-10-28T10:31:33.721741401Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600451903` → **200**

```json
{
  "phone": "+48600451903",
  "audience": "CLIENT",
  "code": "753766",
  "sent_at": "2026-10-28T10:31:32.723768693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9392a26-14e9-45ed-b603-9db0f05949dd",
  "code": "753766",
  "device_ref": "sandbox-11474"
}
```

```json
{
  "session_id": "44b8c75a-72b4-4fbd-9f51-e1f5e253d3ce",
  "subject": {
    "type": "CLIENT",
    "id": "3a08e7ea-6271-4af5-94ba-28496931731c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTA4ZTdlYS02MjcxLTRhZjUtOTRiYS0yODQ5NjkzMTczMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MzkyLCJpYXQiOjE3OTMxODM0OTIsImp0aSI6ImQzYTUxOTIzLTc4NTEtNDlmNS04MzUzLTZjMGRiYTIyMWFhOSIsInNpZCI6IjQ0YjhjNzVhLTcyYjQtNGZiZC05ZjUxLWUxZjVlMjUzZDNjZSJ9.v8MCKFpGPsDr839JLoRNoT1ZpbfWtosTVY_75Z00K-0",
  "access_expires_at": "2026-10-28T10:46:32.982388735Z",
  "refresh_token": "Q3I27AQyy5O1pKLwme-TiSHrAQlS4BDt7YObxReMACo",
  "refresh_expires_at": "2026-11-27T10:31:32.981886494Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73eb2490-25b0-4f15-892b-3f3fc2bb6c3b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:31:31Z"
}
```

```json
{
  "id": "7c33cfe8-3fc3-4cff-b96a-934e728d20e3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:33.221451Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:31:31Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cc82f300-6070-4a8a-b7bb-2a888c1c70e9",
  "quote_id": "7c33cfe8-3fc3-4cff-b96a-934e728d20e3",
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
  "pickup_at": "2026-10-28T13:31:31Z"
}
```

```json
{
  "id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3a08e7ea-6271-4af5-94ba-28496931731c",
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
  "created_at": "2026-10-28T10:31:33.473838Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:31:31Z",
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
  "device_ref": "sandbox-15315"
}
```

```json
{
  "challenge_id": "97abd8a7-df03-4656-805d-d19de4fafa8d",
  "expires_at": "2026-10-28T10:36:33.723847894Z",
  "resend_available_at": "2026-10-28T10:31:34.723847894Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "916458",
  "sent_at": "2026-10-28T10:31:33.725913377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97abd8a7-df03-4656-805d-d19de4fafa8d",
  "code": "916458",
  "device_ref": "sandbox-15315"
}
```

```json
{
  "session_id": "134d9b1f-bf4a-4cf4-bbde-7b09e6bd3ea3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDM5MywiaWF0IjoxNzkzMTgzNDkzLCJqdGkiOiI4MmU1NTQ1Zi02NjQ1LTQ3ZGUtYWRhYS1jOGQwNzNiZDViOWMiLCJzaWQiOiIxMzRkOWIxZi1iZjRhLTRjZjQtYmJkZS03YjA5ZTZiZDNlYTMifQ.RXDPUXEjaEijpYC7wib8cHjrriYOFv1E5RvPj08Aj1M",
  "access_expires_at": "2026-10-28T10:46:33.985297006Z",
  "refresh_token": "NTto5-e6KZrWQ4zBaNMWqg_XMfX7UkHVjPFreJ3AoZM",
  "refresh_expires_at": "2026-11-27T10:31:33.984679084Z",
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
  "command_id": "0eeb1c4d-537a-4180-b072-21107d8892fd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:34Z",
    "sequence": 1793183494442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6d3f8f24-14d6-4629-b54b-12d855032ef1",
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
  "last_heartbeat_at": "2026-10-28T10:31:34.461245Z",
  "last_location_at": "2026-10-28T10:31:34.461245Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
      "short_number": 18,
      "pickup_at": "2026-10-28T13:31:31Z",
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

`POST /api/driver/v1/preorders/7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec/reserve` → **200**

```json
{
  "command_id": "324f60a4-cd61-42be-a3bd-ee6df024b399"
}
```

```json
{
  "id": "ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d",
  "state": "RESERVED",
  "order": {
    "order_id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
    "short_number": 18,
    "pickup_at": "2026-10-28T13:31:31Z",
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
  "reserved_at": "2026-10-28T10:31:34.959339Z",
  "confirm_from": "2026-10-28T13:01:31Z",
  "confirm_until": "2026-10-28T13:11:31Z",
  "drop_until": "2026-10-28T12:31:31Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d",
      "state": "RESERVED",
      "order": {
        "order_id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:31:31Z",
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
      "reserved_at": "2026-10-28T10:31:34.959339Z",
      "confirm_from": "2026-10-28T13:01:31Z",
      "confirm_until": "2026-10-28T13:11:31Z",
      "drop_until": "2026-10-28T12:31:31Z"
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
      "id": "ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d",
      "state": "RESERVED",
      "order": {
        "order_id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:31:31Z",
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
      "reserved_at": "2026-10-28T10:31:34.959339Z",
      "confirm_from": "2026-10-28T13:01:31Z",
      "confirm_until": "2026-10-28T13:11:31Z",
      "drop_until": "2026-10-28T12:31:31Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d/confirm` → **409**

```json
{
  "command_id": "8423e105-b269-49b8-a00d-075586d4aa07"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d61b2737-1746-4d8a-976b-07edd93925e8"
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
  "session_id": "ac9988eb-1578-4c94-9167-2da49168e99c",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQzOTYsImlhdCI6MTc5MzE4MzQ5NiwianRpIjoiYzg4ZGM4ODYtNGU3Ny00ZWM5LWIzNDEtZDIxMDQyYTYzY2ZjIiwic2lkIjoiYWM5OTg4ZWItMTU3OC00Yzk0LTkxNjctMmRhNDkxNjhlOTljIn0.IL9174H_1dC-Q1Ky0Xg1Xt7zR8bdbS5xhmM8cTgbZnY",
  "access_expires_at": "2026-10-28T10:46:36.236032187Z",
  "refresh_token": "-E8eZd9rTED14tmGWdml94XeHLU8E3QTfd6GFW6FjnU",
  "refresh_expires_at": "2026-10-28T22:31:36.235478004Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec` → **200**

```json
{
  "id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3a08e7ea-6271-4af5-94ba-28496931731c",
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
  "created_at": "2026-10-28T10:31:33.473838Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:31:31Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:31:34.959339Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:31:33.475284Z",
      "actor": {
        "type": "CLIENT",
        "id": "3a08e7ea-6271-4af5-94ba-28496931731c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
        "preorder": true,
        "quote_id": "7c33cfe8-3fc3-4cff-b96a-934e728d20e3",
        "pickup_at": "2026-10-28T13:31:31Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "8ee85746-ffca-4f40-8978-8a233421a37c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:31:34.960386Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d"
      },
      "correlation_id": "5e8b240f-adc8-40dd-8504-1825cb021884"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 7eff2178-a55e-40ad-b0dc-e92bdd0ce5ec, reservation ccf5ca81-9a67-4fa9-b2d1-bca28c567f5d.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31226"
}
```

```json
{
  "challenge_id": "98d1ec44-8aa8-442f-8c80-2f0d998dc793",
  "expires_at": "2026-10-28T10:36:36.974938057Z",
  "resend_available_at": "2026-10-28T10:31:37.974938057Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "418195",
  "sent_at": "2026-10-28T10:31:36.977030025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98d1ec44-8aa8-442f-8c80-2f0d998dc793",
  "code": "418195",
  "device_ref": "sandbox-31226"
}
```

```json
{
  "session_id": "af93928f-e1fb-4900-beae-151969e5db51",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDM5NywiaWF0IjoxNzkzMTgzNDk3LCJqdGkiOiI5YWVjMmYxNi03OGJhLTQ4ZWYtYTA0NS1mMDUyNmExYjI2YTciLCJzaWQiOiJhZjkzOTI4Zi1lMWZiLTQ5MDAtYmVhZS0xNTE5NjllNWRiNTEifQ.mq93rmn2KDpe1axdqrzXJj7lcmiwHQryjGN2qYmW7p4",
  "access_expires_at": "2026-10-28T10:46:37.232835597Z",
  "refresh_token": "pBod86xUw0huqlWCvqklDqhCEZXQK1xLZS0_qoiGicI",
  "refresh_expires_at": "2026-11-27T10:31:37.232289712Z",
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
  "command_id": "e03c7a9e-5a0a-472f-a99f-375f147bedbd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:37Z",
    "sequence": 1793183497693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb7e014-1229-4f02-92ff-f7e3f11cb749",
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
  "last_heartbeat_at": "2026-10-28T10:31:37.711469Z",
  "last_location_at": "2026-10-28T10:31:37.711469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671476034",
  "device_ref": "sandbox-19443"
}
```

```json
{
  "challenge_id": "a2804e6c-f42e-4471-9627-50cb55ccbce0",
  "expires_at": "2026-10-28T10:36:37.951105243Z",
  "resend_available_at": "2026-10-28T10:31:38.951105243Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671476034` → **200**

```json
{
  "phone": "+380671476034",
  "audience": "CLIENT",
  "code": "868838",
  "sent_at": "2026-10-28T10:31:37.953063444Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2804e6c-f42e-4471-9627-50cb55ccbce0",
  "code": "868838",
  "device_ref": "sandbox-19443"
}
```

```json
{
  "session_id": "fd0de24b-a870-4931-a4b5-e45b9fa2c858",
  "subject": {
    "type": "CLIENT",
    "id": "b7e03d3d-0804-494f-bed2-451d4b82acbd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiN2UwM2QzZC0wODA0LTQ5NGYtYmVkMi00NTFkNGI4MmFjYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Mzk4LCJpYXQiOjE3OTMxODM0OTgsImp0aSI6ImYwODVjNWUzLTM3NTAtNDI1ZS1hNTkxLTRlM2M5Y2MyMGYzYyIsInNpZCI6ImZkMGRlMjRiLWE4NzAtNDkzMS1hNGI1LWU0NWI5ZmEyYzg1OCJ9.aaaeoP8W9_ddaCL-FWGs8j8WQOErEk6PaF-tvq1wX28",
  "access_expires_at": "2026-10-28T10:46:38.208132549Z",
  "refresh_token": "iZY2IjiWgpTQTtcg7oWR_xosKidE3rN-O4lvdNFAaak",
  "refresh_expires_at": "2026-11-27T10:31:38.207646386Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b33e99f7-697a-40f8-a21d-74057abb87a1",
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
  "id": "291c351b-4fb3-4d17-a573-a36f43f4aec5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:36:38.452294Z",
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
  "command_id": "40634ed6-15b0-4b1a-986b-1b5d020cfef4",
  "quote_id": "291c351b-4fb3-4d17-a573-a36f43f4aec5",
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
  "id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b7e03d3d-0804-494f-bed2-451d4b82acbd",
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
  "created_at": "2026-10-28T10:31:38.705433Z",
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
    "id": "2fad9dc3-e9a7-4581-873d-d42fd36b91ec",
    "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
    "expires_at": "2026-10-28T10:31:53.708714Z",
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

`POST /api/driver/v1/offers/2fad9dc3-e9a7-4581-873d-d42fd36b91ec/accept` → **200**

```json
{
  "command_id": "af8b5481-c3c6-4712-ba00-af971c6c375b"
}
```

```json
{
  "id": "5c18d408-b49c-4cca-8a0d-e9184f120c55",
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "880260c6-859c-4929-98cf-3029bf12ef48",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "880260c6-859c-4929-98cf-3029bf12ef48",
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "assignment_id": "5c18d408-b49c-4cca-8a0d-e9184f120c55",
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

`POST /api/driver/v1/work-sessions/4fb7e014-1229-4f02-92ff-f7e3f11cb749/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:39Z",
    "sequence": 1793183499652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb7e014-1229-4f02-92ff-f7e3f11cb749",
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
  "last_heartbeat_at": "2026-10-28T10:31:39.67168Z",
  "last_location_at": "2026-10-28T10:31:39.67168Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "880260c6-859c-4929-98cf-3029bf12ef48",
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "assignment_id": "5c18d408-b49c-4cca-8a0d-e9184f120c55",
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

`POST /api/driver/v1/trips/880260c6-859c-4929-98cf-3029bf12ef48/arrive` → **200**

```json
{
  "command_id": "9e0f44ea-a050-4db7-bfbc-abf4673da4a7",
  "expected_version": 0
}
```

```json
{
  "id": "880260c6-859c-4929-98cf-3029bf12ef48",
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "assignment_id": "5c18d408-b49c-4cca-8a0d-e9184f120c55",
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
  "arrived_at": "2026-10-28T10:31:40.135619Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/880260c6-859c-4929-98cf-3029bf12ef48/start` → **200**

```json
{
  "command_id": "b1cc838d-9f7f-4cf0-85b8-aaadadbc061e",
  "expected_version": 1
}
```

```json
{
  "id": "880260c6-859c-4929-98cf-3029bf12ef48",
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "assignment_id": "5c18d408-b49c-4cca-8a0d-e9184f120c55",
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
  "arrived_at": "2026-10-28T10:31:40.135619Z",
  "started_at": "2026-10-28T10:31:40.377358Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4fb7e014-1229-4f02-92ff-f7e3f11cb749/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:40Z",
    "sequence": 1793183500610
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb7e014-1229-4f02-92ff-f7e3f11cb749",
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
  "last_heartbeat_at": "2026-10-28T10:31:40.62944Z",
  "last_location_at": "2026-10-28T10:31:40.62944Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/880260c6-859c-4929-98cf-3029bf12ef48/complete` → **200**

```json
{
  "command_id": "1788f582-4cd3-48b0-9308-f92fa4c96ec1",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:31:40Z",
  "cash_received": true
}
```

```json
{
  "id": "880260c6-859c-4929-98cf-3029bf12ef48",
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "assignment_id": "5c18d408-b49c-4cca-8a0d-e9184f120c55",
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
  "arrived_at": "2026-10-28T10:31:40.135619Z",
  "started_at": "2026-10-28T10:31:40.377358Z",
  "completed_at": "2026-10-28T10:31:40.868638Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/619905a6-e799-485b-b6ec-6c7a4e90add9/rating` → **200**

```json
{
  "command_id": "01859c20-b3b8-4f77-abc3-d074fbeb586c",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "score": 5,
  "created_at": "2026-10-28T10:31:41.126044545Z"
}
```

`POST /api/driver/v1/orders/619905a6-e799-485b-b6ec-6c7a4e90add9/rating` → **200**

```json
{
  "command_id": "2751dc6b-7e13-4a2a-8d12-49395979ec63",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
  "score": 4,
  "created_at": "2026-10-28T10:31:41.365549978Z"
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
  "session_id": "2414e921-2025-40d0-9c1b-b51c2eb247b9",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MDIsImlhdCI6MTc5MzE4MzUwMiwianRpIjoiOTRlZDljM2YtZGExMy00MDc1LThlZGEtY2JiYjQ1ZTZlYzkzIiwic2lkIjoiMjQxNGU5MjEtMjAyNS00MGQwLTljMWItYjUxYzJlYjI0N2I5In0.YHpiD84Wz6-tdyFDCEsihLVwtm1M0gqWSdreoeyjTvc",
  "access_expires_at": "2026-10-28T10:46:42.189829391Z",
  "refresh_token": "COaVh4jPiZYzNJSk2DZTLJIBSLQAygDAziPL1HvT394",
  "refresh_expires_at": "2026-10-28T22:31:42.189307831Z",
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
  "session_id": "21ac5bf7-bd13-46ba-801d-17b2daa3c532",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MDIsImlhdCI6MTc5MzE4MzUwMiwianRpIjoiZjU3NGY3ZjYtY2UyNS00MmM5LWJjN2EtZGIzMjQwOTFmNGY1Iiwic2lkIjoiMjFhYzViZjctYmQxMy00NmJhLTgwMWQtMTdiMmRhYTNjNTMyIn0.NJ1rRq5Y8eVOGjmjP06bNCsUKV1RpFDIxWUZt6utLz8",
  "access_expires_at": "2026-10-28T10:46:42.754145911Z",
  "refresh_token": "wkoKoVYqhm3mHfPoGkeRNyBmvl0lgXi06NbnZLXckwk",
  "refresh_expires_at": "2026-10-28T22:31:42.753674475Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/619905a6-e799-485b-b6ec-6c7a4e90add9/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
      "author_type": "RIDER",
      "author_id": "b7e03d3d-0804-494f-bed2-451d4b82acbd",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T10:31:41.126045Z"
    },
    {
      "order_id": "619905a6-e799-485b-b6ec-6c7a4e90add9",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "b7e03d3d-0804-494f-bed2-451d4b82acbd",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T10:31:41.36555Z"
    }
  ]
}
```

Done: ratings for order 619905a6-e799-485b-b6ec-6c7a4e90add9.

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
  "session_id": "c97305e6-0882-4e82-8745-01be0ade8e4d",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MDMsImlhdCI6MTc5MzE4MzUwMywianRpIjoiYzEyMGY3MTAtNTVjNS00ZDI2LWE5OGUtOWUyMzc5NzI3MDIwIiwic2lkIjoiYzk3MzA1ZTYtMDg4Mi00ZTgyLTg3NDUtMDFiZTBhZGU4ZTRkIn0.HQyy5oRsI9-Ewor-TuqTR3nakbpyDNAP_17ShTCKCkk",
  "access_expires_at": "2026-10-28T10:46:43.569619406Z",
  "refresh_token": "w4ASelpDfkYvbmVYRRygjsRTJL9ezL4g4v0L78WtFNI",
  "refresh_expires_at": "2026-10-28T22:31:43.569101441Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7335213c-9cac-4725-872a-8d6b0ae41e9e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "7aad8cd7-663c-432c-8276-f1aa14a7fdc8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:43.820915Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7aad8cd7-663c-432c-8276-f1aa14a7fdc8` → **200**

```json
{
  "id": "7aad8cd7-663c-432c-8276-f1aa14a7fdc8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:43.820915Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7aad8cd7-663c-432c-8276-f1aa14a7fdc8` → **200**

```json
{
  "id": "7aad8cd7-663c-432c-8276-f1aa14a7fdc8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:43.820915Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7aad8cd7-663c-432c-8276-f1aa14a7fdc8` → **200**

```json
{
  "id": "7aad8cd7-663c-432c-8276-f1aa14a7fdc8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:43.820915Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7aad8cd7-663c-432c-8276-f1aa14a7fdc8` → **200**

```json
{
  "id": "7aad8cd7-663c-432c-8276-f1aa14a7fdc8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:43.820915Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7aad8cd7-663c-432c-8276-f1aa14a7fdc8` → **200**

```json
{
  "id": "7aad8cd7-663c-432c-8276-f1aa14a7fdc8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:31:43.820915Z",
  "ready_at": "2026-10-28T10:31:48.401884Z",
  "expires_at": "2026-10-29T10:31:48.401884Z"
}
```

`GET /api/admin/v1/reports/exports/7aad8cd7-663c-432c-8276-f1aa14a7fdc8/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5c56cba9-2b7f-4b64-aaae-1fe1bf70b4c6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "315c4993-d4e2-49ac-aeaf-9c110f525a55",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:49.256368Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/315c4993-d4e2-49ac-aeaf-9c110f525a55` → **200**

```json
{
  "id": "315c4993-d4e2-49ac-aeaf-9c110f525a55",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:49.256368Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/315c4993-d4e2-49ac-aeaf-9c110f525a55` → **200**

```json
{
  "id": "315c4993-d4e2-49ac-aeaf-9c110f525a55",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:49.256368Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/315c4993-d4e2-49ac-aeaf-9c110f525a55` → **200**

```json
{
  "id": "315c4993-d4e2-49ac-aeaf-9c110f525a55",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:49.256368Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/315c4993-d4e2-49ac-aeaf-9c110f525a55` → **200**

```json
{
  "id": "315c4993-d4e2-49ac-aeaf-9c110f525a55",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:31:49.256368Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/315c4993-d4e2-49ac-aeaf-9c110f525a55` → **200**

```json
{
  "id": "315c4993-d4e2-49ac-aeaf-9c110f525a55",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:31:49.256368Z",
  "ready_at": "2026-10-28T10:31:53.411965Z",
  "expires_at": "2026-10-29T10:31:53.411965Z"
}
```

`GET /api/admin/v1/reports/exports/315c4993-d4e2-49ac-aeaf-9c110f525a55/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/3d81ea75-ace2-40b4-9199-e05cd240ab51` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/3d81ea75-ace2-40b4-9199-e05cd240ab51",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ea6b05e2-3dd4-4fe0-b884-07d210ef908e"
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
  "device_ref": "sandbox-7751"
}
```

```json
{
  "challenge_id": "f30e450a-a2a2-4ef2-b112-198641aef0f0",
  "expires_at": "2026-10-28T10:36:54.953666475Z",
  "resend_available_at": "2026-10-28T10:31:55.953666475Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "958625",
  "sent_at": "2026-10-28T10:31:54.9567257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f30e450a-a2a2-4ef2-b112-198641aef0f0",
  "code": "958625",
  "device_ref": "sandbox-7751"
}
```

```json
{
  "session_id": "1be63e53-aa42-4f80-b9e6-7e4fb88dd50d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDQxNSwiaWF0IjoxNzkzMTgzNTE1LCJqdGkiOiIzNDMxNWM1NS1hYzI0LTQwODgtYTlmNS0yYTdlYWIyNTVhMmYiLCJzaWQiOiIxYmU2M2U1My1hYTQyLTRmODAtYjllNi03ZTRmYjg4ZGQ1MGQifQ.Kr1EPm7aIezgsAhNIbW9EJI_keQYReYtSi0XW1ebmWE",
  "access_expires_at": "2026-10-28T10:46:55.217109478Z",
  "refresh_token": "WdzrurCYDsok5OSYWkVd7YIV3-eflafjWIZuxaCbtnM",
  "refresh_expires_at": "2026-11-27T10:31:55.216156361Z",
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
  "command_id": "0b7a6b81-19fb-48bd-8f8c-aa1face0b388",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:31:55Z",
    "sequence": 1793183515909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "58a5a9ad-e5bf-4567-96bd-a53f3cd21c1f",
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
  "last_heartbeat_at": "2026-10-28T10:31:55.928106Z",
  "last_location_at": "2026-10-28T10:31:55.928106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "6aeded19-9abb-40f4-8618-4454e6c390f9",
  "points": [
    {
      "sequence": 1793183518168,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:30:58Z"
    },
    {
      "sequence": 1793183518175,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:31:58Z"
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
  "session_id": "8b211a4e-0b2e-4934-bd19-cca1e9f6ea97",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MTgsImlhdCI6MTc5MzE4MzUxOCwianRpIjoiZTNhOTEyZTQtZGYyOC00OTFhLTkyMDgtZmE5NjgyYjQ3YmEwIiwic2lkIjoiOGIyMTFhNGUtMGIyZS00OTM0LWJkMTktY2NhMWU5ZjZlYTk3In0.HxPlH45yjHqaEdB29MT0EXs4bA0mttm9DUJTQMrOh68",
  "access_expires_at": "2026-10-28T10:46:58.790166669Z",
  "refresh_token": "0uWvOfnP5_xQOmwrP2mBQyCXNKmhHB6cNbrQOpG6lyg",
  "refresh_expires_at": "2026-10-28T22:31:58.789629546Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "f05b3b53-fd64-4baa-a929-76264b68302c",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:31:58Z",
        "track_point_id": "aee88e23-af9d-46e5-a276-6360275106f3",
        "work_session_id": "58a5a9ad-e5bf-4567-96bd-a53f3cd21c1f"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:31:58Z",
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

`POST /api/admin/v1/driver-risk-flags/f05b3b53-fd64-4baa-a929-76264b68302c/confirm` → **200**

```json
{
  "command_id": "91e21269-3d86-423c-ae57-47fd7d406968",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "f05b3b53-fd64-4baa-a929-76264b68302c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:31:58Z",
    "track_point_id": "aee88e23-af9d-46e5-a276-6360275106f3",
    "work_session_id": "58a5a9ad-e5bf-4567-96bd-a53f3cd21c1f"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:31:58Z",
  "reason": null,
  "reviewed_by": "5e547375-1197-4965-80da-610da65befa6",
  "reviewed_at": "2026-10-28T10:31:59.539834Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/f05b3b53-fd64-4baa-a929-76264b68302c/dismiss` → **409**

```json
{
  "command_id": "1aa0e326-5cf2-4563-ad7a-956fa61f066e",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/f05b3b53-fd64-4baa-a929-76264b68302c/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "efc767fd-bb11-41f4-8d8d-d34f823f8223"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "8daf347d-d676-4645-8330-a66ec96bea3b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "55a39f6e-289c-4811-86a2-474752cbe9a5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "5e547375-1197-4965-80da-610da65befa6",
  "raised_at": "2026-10-28T10:32:00.037074Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/55a39f6e-289c-4811-86a2-474752cbe9a5/dismiss` → **200**

```json
{
  "command_id": "fde7e74a-380f-409b-ae4d-d230e44da92b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "55a39f6e-289c-4811-86a2-474752cbe9a5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "5e547375-1197-4965-80da-610da65befa6",
  "raised_at": "2026-10-28T10:32:00.037074Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "5e547375-1197-4965-80da-610da65befa6",
  "reviewed_at": "2026-10-28T10:32:00.281003Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1107e0ad-f81f-4c1f-ae1e-8d95613d1080",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "f05b3b53-fd64-4baa-a929-76264b68302c"
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
      "actor_id": "5e547375-1197-4965-80da-610da65befa6",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:32:00.531875Z"
    }
  ]
}
```

Done: flag f05b3b53-fd64-4baa-a929-76264b68302c confirmed, suspension named it, driver reinstated.

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
  "session_id": "c42f8871-ea15-4a5b-b405-0e757517e01e",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MjEsImlhdCI6MTc5MzE4MzUyMSwianRpIjoiNGFhYWJmNTktYTIwNy00Y2EyLTkzYTUtYzcwNjcyYmM5MDllIiwic2lkIjoiYzQyZjg4NzEtZWExNS00YTViLWI0MDUtMGU3NTc1MTdlMDFlIn0.ZYztKDqAN2XFdF-qIAWRDl1JJDyUnskgPB38QZwruog",
  "access_expires_at": "2026-10-28T10:47:01.34577149Z",
  "refresh_token": "DN8mNj6cjwKVuCWOvmGFBt_k6fjWyPm_u4lIddgEl4o",
  "refresh_expires_at": "2026-10-28T22:32:01.34518877Z",
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
      "actor_id": "5e547375-1197-4965-80da-610da65befa6",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:32:00.531875Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "bbb0b1aa-3fb8-4d2f-8fe0-aaa7893627ae",
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
  "session_id": "58a5a9ad-e5bf-4567-96bd-a53f3cd21c1f",
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
  "last_heartbeat_at": "2026-10-28T10:31:55.928106Z",
  "last_location_at": "2026-10-28T10:31:55.928106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/58a5a9ad-e5bf-4567-96bd-a53f3cd21c1f/close` → **200**

```json
{
  "command_id": "9eaced45-3f91-442a-bac2-ed14d9117e42",
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
  "session_id": "116f1400-a9a5-4222-bb21-125ef937ac8c",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MjIsImlhdCI6MTc5MzE4MzUyMiwianRpIjoiYjgxNTE4OGUtZjM1OC00NmI1LTk1MjMtYzc4MmNkZmQ3Mjg2Iiwic2lkIjoiMTE2ZjE0MDAtYTlhNS00MjIyLWJiMjEtMTI1ZWY5MzdhYzhjIn0.ZPP31qavUhno1xKWECeUCmaLgrHXblogOD17YG0yHAE",
  "access_expires_at": "2026-10-28T10:47:02.892910719Z",
  "refresh_token": "ydwh1pQx8zjfVvgux9n0m6WgY6VMtOG432E4P00Kndg",
  "refresh_expires_at": "2026-10-28T22:32:02.892111269Z",
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
  "command_id": "1c22450f-4415-43df-8f17-86b437713b9d",
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
  "changed_by": "5e547375-1197-4965-80da-610da65befa6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:32:03.368556Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "1c22450f-4415-43df-8f17-86b437713b9d",
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
  "changed_by": "5e547375-1197-4965-80da-610da65befa6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:32:03.368556Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48375318625",
  "device_ref": "sandbox-1518"
}
```

```json
{
  "challenge_id": "c4f5676c-f5fb-435d-956d-69f4aacc567f",
  "expires_at": "2026-10-28T10:37:03.864352064Z",
  "resend_available_at": "2026-10-28T10:32:04.864352064Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48375318625` → **200**

```json
{
  "phone": "+48375318625",
  "audience": "CLIENT",
  "code": "989949",
  "sent_at": "2026-10-28T10:32:03.866418594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4f5676c-f5fb-435d-956d-69f4aacc567f",
  "code": "989949",
  "device_ref": "sandbox-1518"
}
```

```json
{
  "session_id": "257edbb1-85fa-40f5-903f-c86190de2f46",
  "subject": {
    "type": "CLIENT",
    "id": "36e314c7-1f29-4f81-8c54-eb2c232aa628"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNmUzMTRjNy0xZjI5LTRmODEtOGM1NC1lYjJjMjMyYWE2MjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NDI0LCJpYXQiOjE3OTMxODM1MjQsImp0aSI6IjMyMGUzM2QxLWU0ZTctNGJmMC1iYTk5LWNmMWM5ZGNjY2IxNiIsInNpZCI6IjI1N2VkYmIxLTg1ZmEtNDBmNS05MDNmLWM4NjE5MGRlMmY0NiJ9.3HA1QIel-KXnhhAr0Sna7KAllk8xK-J9AAIP7obG15U",
  "access_expires_at": "2026-10-28T10:47:04.125086496Z",
  "refresh_token": "y7vOZC1VBzjAlaCclQt1WHRi3HFQZVxuG-9tijp1i8c",
  "refresh_expires_at": "2026-11-27T10:32:04.124504176Z",
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
  "correlation_id": "a7294d9d-aa42-431e-8828-b521041d5363"
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
  "device_ref": "sandbox-20783"
}
```

```json
{
  "challenge_id": "51d89ac3-d07b-46ad-b0ee-bdac7cc2e50e",
  "expires_at": "2026-10-28T10:37:04.819642241Z",
  "resend_available_at": "2026-10-28T10:32:05.819642241Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "520649",
  "sent_at": "2026-10-28T10:32:04.821716722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51d89ac3-d07b-46ad-b0ee-bdac7cc2e50e",
  "code": "520649",
  "device_ref": "sandbox-20783"
}
```

```json
{
  "session_id": "7fcefcf2-9307-43e9-a976-44f697348541",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDQyNSwiaWF0IjoxNzkzMTgzNTI1LCJqdGkiOiIwNzIzN2MxZS1kZDZlLTQzYmUtOGRlYy1hZmU5NDYwNmM1MzYiLCJzaWQiOiI3ZmNlZmNmMi05MzA3LTQzZTktYTk3Ni00NGY2OTczNDg1NDEifQ.kNTCUFV7cGFA6v5x2DsfkIUd5oPJdDqbQ3fxTwt4XYQ",
  "access_expires_at": "2026-10-28T10:47:05.081526361Z",
  "refresh_token": "a8bD2mB7QAhDHhxQsbOcpRpVS7v3ro9UMiwRAe8qMvI",
  "refresh_expires_at": "2026-11-27T10:32:05.080787581Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6d3f8f24-14d6-4629-b54b-12d855032ef1",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T10:31:34.461245Z",
  "last_location_at": "2026-10-28T10:31:34.461245Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6d3f8f24-14d6-4629-b54b-12d855032ef1/handover` → **200**

```json
{
  "command_id": "aee2a78e-c3f1-4a4e-8111-db9507c5c5b2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6d3f8f24-14d6-4629-b54b-12d855032ef1",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T10:31:34.461245Z",
  "last_location_at": "2026-10-28T10:31:34.461245Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6d3f8f24-14d6-4629-b54b-12d855032ef1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:32:05Z",
    "sequence": 1793183525775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6d3f8f24-14d6-4629-b54b-12d855032ef1",
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
  "last_heartbeat_at": "2026-10-28T10:32:05.794678Z",
  "last_location_at": "2026-10-28T10:32:05.794678Z",
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
  "session_id": "6d3f8f24-14d6-4629-b54b-12d855032ef1",
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
  "last_heartbeat_at": "2026-10-28T10:32:05.794678Z",
  "last_location_at": "2026-10-28T10:32:05.794678Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6d3f8f24-14d6-4629-b54b-12d855032ef1/close` → **200**

```json
{
  "command_id": "c686850c-a17d-4ed7-9b24-b53854562588",
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
  "correlation_id": "36cb8b4f-24ba-46cc-871c-dbd2da13a9a9"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672746131",
  "device_ref": "sandbox-22381"
}
```

```json
{
  "challenge_id": "8a3deb73-d943-493a-b622-94766db7fe91",
  "expires_at": "2026-10-28T10:37:06.988019342Z",
  "resend_available_at": "2026-10-28T10:32:07.988019342Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672746131` → **200**

```json
{
  "phone": "+380672746131",
  "audience": "CLIENT",
  "code": "937658",
  "sent_at": "2026-10-28T10:32:06.990023831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a3deb73-d943-493a-b622-94766db7fe91",
  "code": "937658",
  "device_ref": "sandbox-22381"
}
```

```json
{
  "session_id": "5ef4858e-1dd5-474c-bbf9-603d06775b76",
  "subject": {
    "type": "CLIENT",
    "id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjAwNTdjOC1jMTU3LTRiYTktOGYzYS0wMmE3YTJhNjUyNWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NDI3LCJpYXQiOjE3OTMxODM1MjcsImp0aSI6ImE0NTk4ZDEzLWFmYTAtNDM3NC04ZTcyLTRmMTQ5NzdlNjIwMCIsInNpZCI6IjVlZjQ4NThlLTFkZDUtNDc0Yy1iYmY5LTYwM2QwNjc3NWI3NiJ9.VRrZyUOnjAcCdr3IzFaqMppV2V8tkTP6Vp2CZzsXBsE",
  "access_expires_at": "2026-10-28T10:47:07.248418732Z",
  "refresh_token": "hiQKbY2avi2T8yHbgaU1nZqLN-5IURlW5S5qEodPQak",
  "refresh_expires_at": "2026-11-27T10:32:07.247919325Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "0b090fb9-98c4-463f-8ce1-6f7537064ff1",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ef5cf801-da51-4c1f-9686-258379b47c7f",
  "upload_path": "/api/rider/v1/uploads/ef5cf801-da51-4c1f-9686-258379b47c7f",
  "expires_at": "2026-10-28T10:47:07.498840229Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/ef5cf801-da51-4c1f-9686-258379b47c7f` → **200**

```json
{
  "file_id": "ef5cf801-da51-4c1f-9686-258379b47c7f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "0126bfb9-fcc6-46fc-9f2b-e24d64cf0be1",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "ef5cf801-da51-4c1f-9686-258379b47c7f"
  ]
}
```

```json
{
  "id": "7e787663-ef1c-4067-aeb4-ffc98487490e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:32:07.771279Z",
  "updated_at": "2026-10-28T10:32:07.771279Z",
  "messages": [
    {
      "id": "6e22c111-0a7c-4b7d-a832-8619edb44b28",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:32:07.773046Z",
      "attachments": [
        {
          "file_id": "ef5cf801-da51-4c1f-9686-258379b47c7f",
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
  "session_id": "294a26ee-90f2-4467-bea4-e4dd052d1179",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MjgsImlhdCI6MTc5MzE4MzUyOCwianRpIjoiNGRiODUzMGItZjZmNi00MzQ4LWE4M2QtM2M0NTFmZGQyYWExIiwic2lkIjoiMjk0YTI2ZWUtOTBmMi00NDY3LWJlYTQtZTRkZDA1MmQxMTc5In0.4vnvZu1X1hci7U1EUkKgEe3oUjkRcZU4d0lo2Xkxqjo",
  "access_expires_at": "2026-10-28T10:47:08.362747899Z",
  "refresh_token": "s3fxvVKmXm2_3Oy7bkGUcgu1otE6n4WW3GT71OjFk9o",
  "refresh_expires_at": "2026-10-28T22:32:08.362181393Z",
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
  "session_id": "edf04d8c-4e2c-4b6d-8c99-d2d942f01ec4",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MjgsImlhdCI6MTc5MzE4MzUyOCwianRpIjoiY2IwNDI4NjktYjFjNi00N2NkLThlY2UtOGM5YTcxNDg0ZGE0Iiwic2lkIjoiZWRmMDRkOGMtNGUyYy00YjZkLThjOTktZDJkOTQyZjAxZWM0In0.ZsCW9h6UaRLig_N_jG6exzLlc0djSnKw7vcjfA2gtd8",
  "access_expires_at": "2026-10-28T10:47:08.930040716Z",
  "refresh_token": "CM6elu87k4njbzKgnQxsXwCvU-Fb92sw6E8mMBrnU9s",
  "refresh_expires_at": "2026-10-28T22:32:08.929524794Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/7e787663-ef1c-4067-aeb4-ffc98487490e/attachments/ef5cf801-da51-4c1f-9686-258379b47c7f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "33bb4666-078d-44a6-a662-3eca5723d7e3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b2ec7965-0510-4281-9621-dab670c54b2b",
  "upload_path": "/api/operator/v1/uploads/b2ec7965-0510-4281-9621-dab670c54b2b",
  "expires_at": "2026-10-28T10:47:09.178763039Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b2ec7965-0510-4281-9621-dab670c54b2b` → **200**

```json
{
  "file_id": "b2ec7965-0510-4281-9621-dab670c54b2b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/7e787663-ef1c-4067-aeb4-ffc98487490e` → **200**

```json
{
  "id": "7e787663-ef1c-4067-aeb4-ffc98487490e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:32:07.771279Z",
  "updated_at": "2026-10-28T10:32:07.771279Z",
  "messages": [
    {
      "id": "6e22c111-0a7c-4b7d-a832-8619edb44b28",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:32:07.773046Z",
      "attachments": [
        {
          "file_id": "ef5cf801-da51-4c1f-9686-258379b47c7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/7e787663-ef1c-4067-aeb4-ffc98487490e/comments` → **200**

```json
{
  "command_id": "1ebd8e46-0d15-4c6c-9845-944ee8bfc7f2",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b2ec7965-0510-4281-9621-dab670c54b2b"
  ]
}
```

```json
{
  "id": "7e787663-ef1c-4067-aeb4-ffc98487490e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:32:07.771279Z",
  "updated_at": "2026-10-28T10:32:09.69492Z",
  "messages": [
    {
      "id": "6e22c111-0a7c-4b7d-a832-8619edb44b28",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:32:07.773046Z",
      "attachments": [
        {
          "file_id": "ef5cf801-da51-4c1f-9686-258379b47c7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "abd62040-e63d-456e-8985-37d71714fd46",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "5e547375-1197-4965-80da-610da65befa6",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:32:09.694546Z",
      "attachments": [
        {
          "file_id": "b2ec7965-0510-4281-9621-dab670c54b2b",
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

`GET /api/rider/v1/support/cases/7e787663-ef1c-4067-aeb4-ffc98487490e` → **200**

```json
{
  "id": "7e787663-ef1c-4067-aeb4-ffc98487490e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:32:07.771279Z",
  "updated_at": "2026-10-28T10:32:09.69492Z",
  "messages": [
    {
      "id": "6e22c111-0a7c-4b7d-a832-8619edb44b28",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "660057c8-c157-4ba9-8f3a-02a7a2a6525c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:32:07.773046Z",
      "attachments": [
        {
          "file_id": "ef5cf801-da51-4c1f-9686-258379b47c7f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "abd62040-e63d-456e-8985-37d71714fd46",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:32:09.694546Z",
      "attachments": [
        {
          "file_id": "b2ec7965-0510-4281-9621-dab670c54b2b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/7e787663-ef1c-4067-aeb4-ffc98487490e/attachments/b2ec7965-0510-4281-9621-dab670c54b2b` → **200**

Done: support case 7e787663-ef1c-4067-aeb4-ffc98487490e, rider attachment ef5cf801-da51-4c1f-9686-258379b47c7f, operator attachment b2ec7965-0510-4281-9621-dab670c54b2b.

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
  "session_id": "097c5e6a-a3ad-44a1-b681-2510beb2f9a1",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MzAsImlhdCI6MTc5MzE4MzUzMCwianRpIjoiNWVkYmY1ZDktMjM2ZC00MWI1LWI5NjktNmM5ZmVmN2JhMzE0Iiwic2lkIjoiMDk3YzVlNmEtYTNhZC00NGExLWI2ODEtMjUxMGJlYjJmOWExIn0.WsGMO8IjlYcr7_YS1RbT6rrbMjxQ2pQc5px5_eFZs7U",
  "access_expires_at": "2026-10-28T10:47:10.546364686Z",
  "refresh_token": "QgixcmSeadQg6Nk4jpSmRu1DPint41RdjtLxgErXQr0",
  "refresh_expires_at": "2026-10-28T22:32:10.545736178Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6071"
}
```

```json
{
  "challenge_id": "b6ae0f8d-9cac-4eff-a639-e3dbf05221f4",
  "expires_at": "2026-10-28T10:37:10.776167189Z",
  "resend_available_at": "2026-10-28T10:32:11.776167189Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "734232",
  "sent_at": "2026-10-28T10:32:10.778427355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6ae0f8d-9cac-4eff-a639-e3dbf05221f4",
  "code": "734232",
  "device_ref": "sandbox-6071"
}
```

```json
{
  "session_id": "334af409-4f10-4859-8b30-cf5f96dae355",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDQzMSwiaWF0IjoxNzkzMTgzNTMxLCJqdGkiOiI5N2EzNDI0ZC1iMDAxLTRiYTYtYTU3OS00YmNhNjhlMjVjNTUiLCJzaWQiOiIzMzRhZjQwOS00ZjEwLTQ4NTktOGIzMC1jZjVmOTZkYWUzNTUifQ.dZ436Q_FlDbyoGSTh0y8aHgBD5UI7svrIjMeoJkutzk",
  "access_expires_at": "2026-10-28T10:47:11.034838167Z",
  "refresh_token": "HGnIjH5yqMxeWSqmGK5rGInjzyv9NK19LeRNleydjG0",
  "refresh_expires_at": "2026-11-27T10:32:11.034315796Z",
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
      "actor_id": "5e547375-1197-4965-80da-610da65befa6",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:32:00.531875Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "5e547375-1197-4965-80da-610da65befa6",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:32:01.822857Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d50ae01a-80d2-40f3-a68e-e8e79c69d112",
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
  "device_ref": "sandbox-23768"
}
```

```json
{
  "challenge_id": "04e454eb-0ab7-4a92-a628-8e080decded8",
  "expires_at": "2026-10-28T10:37:11.980487992Z",
  "resend_available_at": "2026-10-28T10:32:12.980487992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "397882",
  "sent_at": "2026-10-28T10:32:11.982460148Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04e454eb-0ab7-4a92-a628-8e080decded8",
  "code": "397882",
  "device_ref": "sandbox-23768"
}
```

```json
{
  "session_id": "07ae8ad4-58dc-407c-b31d-695fc6e657b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDQzMiwiaWF0IjoxNzkzMTgzNTMyLCJqdGkiOiI1N2I4YzM1Yy1lMzI1LTQ2OTQtYjU1OC04OTBlNDlmMzIzMGMiLCJzaWQiOiIwN2FlOGFkNC01OGRjLTQwN2MtYjMxZC02OTVmYzZlNjU3YjcifQ.vpRmpH4_rLiHCj26Wuuy85tuD2s_9zrxIhY-QeKHz-E",
  "access_expires_at": "2026-10-28T10:47:12.243428547Z",
  "refresh_token": "3t-dSA4ZDOojWCKk2z3jqxTEUrrWrpozsHi-UrwoLyo",
  "refresh_expires_at": "2026-11-27T10:32:12.242812067Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb7e014-1229-4f02-92ff-f7e3f11cb749",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:31:40.62944Z",
  "last_location_at": "2026-10-28T10:31:40.62944Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb7e014-1229-4f02-92ff-f7e3f11cb749/handover` → **200**

```json
{
  "command_id": "6e169f01-d6c0-4da7-9f10-655fc7b79721",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb7e014-1229-4f02-92ff-f7e3f11cb749",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:31:40.62944Z",
  "last_location_at": "2026-10-28T10:31:40.62944Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb7e014-1229-4f02-92ff-f7e3f11cb749/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:32:12Z",
    "sequence": 1793183532950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb7e014-1229-4f02-92ff-f7e3f11cb749",
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
  "last_heartbeat_at": "2026-10-28T10:32:12.968961Z",
  "last_location_at": "2026-10-28T10:32:12.968961Z",
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
  "command_id": "3cbfd894-07f3-475c-b323-448fb5b911db",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:32:13Z",
    "sequence": 1793183533430
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6dd08da8-af32-4dfa-b0b4-b6385ebb54bc",
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
  "last_heartbeat_at": "2026-10-28T10:32:13.449337Z",
  "last_location_at": "2026-10-28T10:32:13.449337Z",
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
  "session_id": "c15c042d-eaa5-4a88-a216-28b4b19291e2",
  "subject": {
    "type": "STAFF",
    "id": "5e547375-1197-4965-80da-610da65befa6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTU0NzM3NS0xMTk3LTQ5NjUtODBkYS02MTBkYTY1YmVmYTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ0MzQsImlhdCI6MTc5MzE4MzUzNCwianRpIjoiYmE3NmM5NTQtNmJiZi00MmEzLTg4NzktODhiYjJmMDMwMGQyIiwic2lkIjoiYzE1YzA0MmQtZWFhNS00YTg4LWEyMTYtMjhiNGIxOTI5MWUyIn0.1_c0Wv0jRtAUekd7qxQqhQ0pzRX3HhU_VGGKrHm-viQ",
  "access_expires_at": "2026-10-28T10:47:14.03322895Z",
  "refresh_token": "N11jU_UXMpLqMwS_etn5WXespZqFMlr2f-hfnrBXka8",
  "refresh_expires_at": "2026-10-28T22:32:14.032014818Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bebea6d2-b34b-4121-b047-65f7cf424e67",
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
  "id": "5d3e080c-bdba-489f-85af-9bc2f99cf155",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:37:14.281712Z",
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
  "command_id": "93fe3f03-48c1-467a-965b-35bad0a508ce",
  "quote_id": "5d3e080c-bdba-489f-85af-9bc2f99cf155",
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
  "id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
  "short_number": 20,
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
  "created_at": "2026-10-28T10:32:14.530012Z",
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
    "id": "8b77a151-2c6d-4e35-9c39-3b03e5e10315",
    "order_id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
    "expires_at": "2026-10-28T10:32:29.534539Z",
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

`POST /api/driver/v1/offers/8b77a151-2c6d-4e35-9c39-3b03e5e10315/accept` → **200**

```json
{
  "command_id": "a521912f-5578-40f5-a35e-2fa5211aad2e"
}
```

```json
{
  "id": "1c33bc89-2f6f-489e-bc15-a74710864f45",
  "order_id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f35a36a-def5-4ff7-a7c2-c2a8f7063508",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f35a36a-def5-4ff7-a7c2-c2a8f7063508",
  "order_id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
  "assignment_id": "1c33bc89-2f6f-489e-bc15-a74710864f45",
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

`POST /api/driver/v1/work-sessions/6dd08da8-af32-4dfa-b0b4-b6385ebb54bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:32:15Z",
    "sequence": 1793183535720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6dd08da8-af32-4dfa-b0b4-b6385ebb54bc",
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
  "last_heartbeat_at": "2026-10-28T10:32:15.73895Z",
  "last_location_at": "2026-10-28T10:32:15.73895Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f35a36a-def5-4ff7-a7c2-c2a8f7063508/arrive` → **200**

```json
{
  "command_id": "80f0dafb-e9fd-4d4c-9c57-38b1a7b43a5d",
  "expected_version": 0
}
```

```json
{
  "id": "1f35a36a-def5-4ff7-a7c2-c2a8f7063508",
  "order_id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
  "assignment_id": "1c33bc89-2f6f-489e-bc15-a74710864f45",
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
  "arrived_at": "2026-10-28T10:32:15.981142Z",
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

`POST /api/driver/v1/trips/1f35a36a-def5-4ff7-a7c2-c2a8f7063508/start` → **200**

```json
{
  "command_id": "78b09eb6-f9f7-49b2-ac73-8af9f3908b55",
  "expected_version": 1
}
```

```json
{
  "id": "1f35a36a-def5-4ff7-a7c2-c2a8f7063508",
  "order_id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
  "assignment_id": "1c33bc89-2f6f-489e-bc15-a74710864f45",
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
  "arrived_at": "2026-10-28T10:32:15.981142Z",
  "started_at": "2026-10-28T10:32:16.232842Z",
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

`POST /api/driver/v1/trips/1f35a36a-def5-4ff7-a7c2-c2a8f7063508/complete` → **200**

```json
{
  "command_id": "653a5334-2585-4dbc-be9f-e729aecd9ab0",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:32:16Z",
  "cash_received": true
}
```

```json
{
  "id": "1f35a36a-def5-4ff7-a7c2-c2a8f7063508",
  "order_id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
  "assignment_id": "1c33bc89-2f6f-489e-bc15-a74710864f45",
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
  "arrived_at": "2026-10-28T10:32:15.981142Z",
  "started_at": "2026-10-28T10:32:16.232842Z",
  "completed_at": "2026-10-28T10:32:16.487157Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50` → **200**

```json
{
  "id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
  "short_number": 20,
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
    "id": "1c33bc89-2f6f-489e-bc15-a74710864f45",
    "order_id": "c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f35a36a-def5-4ff7-a7c2-c2a8f7063508",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:32:14.530012Z",
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
  "session_id": "4fb7e014-1229-4f02-92ff-f7e3f11cb749",
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
  "last_heartbeat_at": "2026-10-28T10:32:12.968961Z",
  "last_location_at": "2026-10-28T10:32:12.968961Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4fb7e014-1229-4f02-92ff-f7e3f11cb749/close` → **200**

```json
{
  "command_id": "c4402883-6d50-4c82-b9f0-057e1f6c759a",
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
  "session_id": "6dd08da8-af32-4dfa-b0b4-b6385ebb54bc",
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
  "last_heartbeat_at": "2026-10-28T10:32:15.73895Z",
  "last_location_at": "2026-10-28T10:32:15.73895Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6dd08da8-af32-4dfa-b0b4-b6385ebb54bc/close` → **200**

```json
{
  "command_id": "438cd97a-6d17-4620-b079-2734ce44c9b4",
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

Done: terminal order c7fc5a3b-ec16-4060-99d2-93a9e4c6cb50 by Andrii (5a000000-0000-4000-8000-000000000403).
