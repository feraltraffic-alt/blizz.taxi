# Sandbox transcript (2026-10-27T17:38:55Z, aeff345)

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
  "correlation_id": "878c0495-06b0-4b84-a094-f99d6d4dad17"
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
  "session_id": "143bc734-fed6-446e-8543-882966df19a0",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2MzYsImlhdCI6MTc5MzEyMjczNiwianRpIjoiODc3ZTFmNDQtMzkyNS00OGJlLWFkOTYtNDMyZmQxZjFkOTg5Iiwic2lkIjoiMTQzYmM3MzQtZmVkNi00NDZlLTg1NDMtODgyOTY2ZGYxOWEwIn0.5Hmf7ljw3sM0KG5Vk6NVHi67UO9gLlAS2sCJKtNJ-uw",
  "access_expires_at": "2026-10-27T17:53:56.412293059Z",
  "refresh_token": "VCAaGogZUuvAstr3RII87UXtsmQbnUNCu9eyC9yNboo",
  "refresh_expires_at": "2026-10-28T05:38:56.410261475Z",
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
  "session_id": "af62a9ba-4e4d-4228-8ca8-5633a28d4083",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2MzcsImlhdCI6MTc5MzEyMjczNywianRpIjoiZDMxMjcwNmYtNjAwYS00MjVkLWI1YjEtZGQ0ODQ4NDk2OThlIiwic2lkIjoiYWY2MmE5YmEtNGU0ZC00MjI4LThjYTgtNTYzM2EyOGQ0MDgzIn0.W_Z5-mI7dF9EUMy9S42oZuPhVAwXQMUNN2lIWI1VTgw",
  "access_expires_at": "2026-10-27T17:53:57.702535721Z",
  "refresh_token": "dpKzyzisCt_A6dDzIIGuemtXjTt8lxHDFRCOpGY4Gdc",
  "refresh_expires_at": "2026-10-28T05:38:57.701439138Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "cce49632-2a91-4c30-a754-e64a38f8c615",
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
  "id": "30f6f2f2-5836-473b-b9d4-ff5eb2ef3068",
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
  "created_by": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "created_at": "2026-10-27T17:38:57.777168Z",
  "updated_at": "2026-10-27T17:38:57.777168Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632294091",
  "device_ref": "sandbox-21046"
}
```

```json
{
  "challenge_id": "4048e614-82e1-4774-a06c-46adf518708b",
  "expires_at": "2026-10-27T17:43:57.827951436Z",
  "resend_available_at": "2026-10-27T17:38:58.827951436Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632294091` → **200**

```json
{
  "phone": "+380632294091",
  "audience": "CLIENT",
  "code": "529592",
  "sent_at": "2026-10-27T17:38:57.835654453Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4048e614-82e1-4774-a06c-46adf518708b",
  "code": "529592",
  "device_ref": "sandbox-21046"
}
```

```json
{
  "session_id": "5a0928ec-a535-4eb8-bfd1-deedce83d53d",
  "subject": {
    "type": "CLIENT",
    "id": "dfe70e22-c650-4171-8128-12bcfdca2403"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZmU3MGUyMi1jNjUwLTQxNzEtODEyOC0xMmJjZmRjYTI0MDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjM3LCJpYXQiOjE3OTMxMjI3MzcsImp0aSI6IjBkOGM2YzQyLTgxYjgtNDhhNC04NjE5LTBkZWNkNjk0MTkyMSIsInNpZCI6IjVhMDkyOGVjLWE1MzUtNGViOC1iZmQxLWRlZWRjZTgzZDUzZCJ9.fuKAySByMoj_RE8SjF9lXWsquVTjoatAe9VCvioxqI8",
  "access_expires_at": "2026-10-27T17:53:57.926443942Z",
  "refresh_token": "V2Cl3IqgZUivKY4Gh8XIicyjwVZk0zmLkMNH3ThvL_Q",
  "refresh_expires_at": "2026-11-26T17:38:57.924478733Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632294091` → **200**

```json
{
  "client_id": "dfe70e22-c650-4171-8128-12bcfdca2403"
}
```

`POST /api/admin/v1/rider-wallets/dfe70e22-c650-4171-8128-12bcfdca2403/top-ups` → **201**

```json
{
  "command_id": "c1c472f5-528a-4e40-a69c-c672cf5597e9",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "dfe70e22-c650-4171-8128-12bcfdca2403",
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
      "id": "5586f621-e7f2-450a-9c66-cbe34846f130",
      "at": "2026-10-27T17:38:58.021092Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b18031f9-e424-4d50-990d-4cbbd9eac012",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f0af87c9-bbb4-4244-a3da-8c65475f91a9",
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
  "id": "56f29e0f-b5fa-43e1-ab28-0902b2739740",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:43:58.165874Z",
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
      "id": "30f6f2f2-5836-473b-b9d4-ff5eb2ef3068",
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
  "device_ref": "sandbox-17055"
}
```

```json
{
  "challenge_id": "f6e9830e-969e-4b9d-bb5e-c9623a28b6d4",
  "expires_at": "2026-10-27T17:43:58.235983032Z",
  "resend_available_at": "2026-10-27T17:38:59.235983032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "751524",
  "sent_at": "2026-10-27T17:38:58.23970522Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6e9830e-969e-4b9d-bb5e-c9623a28b6d4",
  "code": "751524",
  "device_ref": "sandbox-17055"
}
```

```json
{
  "session_id": "3cb77732-2ca9-47f9-b13a-1a02ac655d9b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzYzOCwiaWF0IjoxNzkzMTIyNzM4LCJqdGkiOiJmNjA5MTdiNy0wZGE3LTQwOGYtOTU0MS1jYzRmODRhYWRhMzYiLCJzaWQiOiIzY2I3NzczMi0yY2E5LTQ3ZjktYjEzYS0xYTAyYWM2NTVkOWIifQ.1r-FbXudgrHMRzJgQSSmTsqgriyq6yJOwajHiUS5RQk",
  "access_expires_at": "2026-10-27T17:53:58.301396537Z",
  "refresh_token": "vgXR1ElSpxcRrmHC-PjNrPWbvABqCwN4RAD2nrMyobQ",
  "refresh_expires_at": "2026-11-26T17:38:58.300076717Z",
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
  "command_id": "59a96b3a-1556-40b3-a8db-60c3a372f5a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:38:58Z",
    "sequence": 1793122738386
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a41a85ae-577d-4985-8fae-d72b2d504138",
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
  "last_heartbeat_at": "2026-10-27T17:38:58.436299Z",
  "last_location_at": "2026-10-27T17:38:58.436299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cf000bb6-2dbf-4faf-8242-5e661f841665",
  "quote_id": "56f29e0f-b5fa-43e1-ab28-0902b2739740",
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
  "id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dfe70e22-c650-4171-8128-12bcfdca2403",
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
  "created_at": "2026-10-27T17:38:58.537019Z",
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
  "client_id": "dfe70e22-c650-4171-8128-12bcfdca2403",
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
      "id": "5586f621-e7f2-450a-9c66-cbe34846f130",
      "at": "2026-10-27T17:38:58.021092Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b18031f9-e424-4d50-990d-4cbbd9eac012",
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
    "id": "46a8263e-5fc8-48bd-bfba-43156c9ca862",
    "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
    "expires_at": "2026-10-27T17:39:13.551466Z",
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

`POST /api/driver/v1/offers/46a8263e-5fc8-48bd-bfba-43156c9ca862/accept` → **200**

```json
{
  "command_id": "f082f8d1-30e8-4711-9d19-ccf09192ec06"
}
```

```json
{
  "id": "99bccec9-e1b5-468a-ada1-3493274d9e7f",
  "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4b4d5064-a21f-45b7-86a1-7baca1ef75c5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4b4d5064-a21f-45b7-86a1-7baca1ef75c5",
  "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
  "assignment_id": "99bccec9-e1b5-468a-ada1-3493274d9e7f",
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

`POST /api/driver/v1/work-sessions/a41a85ae-577d-4985-8fae-d72b2d504138/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:38:58Z",
    "sequence": 1793122738759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a41a85ae-577d-4985-8fae-d72b2d504138",
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
  "last_heartbeat_at": "2026-10-27T17:38:58.787065Z",
  "last_location_at": "2026-10-27T17:38:58.787065Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4b4d5064-a21f-45b7-86a1-7baca1ef75c5/arrive` → **200**

```json
{
  "command_id": "8d3af05a-0907-4b8a-ba83-ae351a8b23bb",
  "expected_version": 0
}
```

```json
{
  "id": "4b4d5064-a21f-45b7-86a1-7baca1ef75c5",
  "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
  "assignment_id": "99bccec9-e1b5-468a-ada1-3493274d9e7f",
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
  "arrived_at": "2026-10-27T17:38:58.837559Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4b4d5064-a21f-45b7-86a1-7baca1ef75c5/start` → **200**

```json
{
  "command_id": "935e1fdc-385f-4620-a265-e809093e44f5",
  "expected_version": 1
}
```

```json
{
  "id": "4b4d5064-a21f-45b7-86a1-7baca1ef75c5",
  "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
  "assignment_id": "99bccec9-e1b5-468a-ada1-3493274d9e7f",
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
  "arrived_at": "2026-10-27T17:38:58.837559Z",
  "started_at": "2026-10-27T17:38:58.886534Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/4b4d5064-a21f-45b7-86a1-7baca1ef75c5/complete` → **200**

```json
{
  "command_id": "c7f8c8f8-4278-4168-ae14-cdb480e0e0c7",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:38:58Z",
  "cash_received": true
}
```

```json
{
  "id": "4b4d5064-a21f-45b7-86a1-7baca1ef75c5",
  "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
  "assignment_id": "99bccec9-e1b5-468a-ada1-3493274d9e7f",
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
  "arrived_at": "2026-10-27T17:38:58.837559Z",
  "started_at": "2026-10-27T17:38:58.886534Z",
  "completed_at": "2026-10-27T17:38:58.96013Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "dfe70e22-c650-4171-8128-12bcfdca2403",
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
      "id": "ecf617a0-ddf1-459c-baa2-6b952d6ea5c2",
      "at": "2026-10-27T17:38:59.557185Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3"
    },
    {
      "id": "5586f621-e7f2-450a-9c66-cbe34846f130",
      "at": "2026-10-27T17:38:58.021092Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b18031f9-e424-4d50-990d-4cbbd9eac012",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/30f6f2f2-5836-473b-b9d4-ff5eb2ef3068/archive` → **200**

```json
{
  "command_id": "82935f21-e823-475d-8436-85bc23886f2b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "30f6f2f2-5836-473b-b9d4-ff5eb2ef3068",
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
  "created_by": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "created_at": "2026-10-27T17:38:57.777168Z",
  "updated_at": "2026-10-27T17:39:02.08196Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a41a85ae-577d-4985-8fae-d72b2d504138",
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
  "last_heartbeat_at": "2026-10-27T17:38:58.787065Z",
  "last_location_at": "2026-10-27T17:38:58.787065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a41a85ae-577d-4985-8fae-d72b2d504138/close` → **200**

```json
{
  "command_id": "a9416395-2a41-40cf-b76b-4f4be22e9c42",
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

Done: order 0ffa14f0-4e78-4ebb-a967-f9caa74db9b3.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634194552",
  "device_ref": "sandbox-9148"
}
```

```json
{
  "challenge_id": "1cb20051-80de-47e2-a21a-e46a4fb37b41",
  "expires_at": "2026-10-27T17:44:02.210831354Z",
  "resend_available_at": "2026-10-27T17:39:03.210831354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634194552` → **200**

```json
{
  "phone": "+380634194552",
  "audience": "CLIENT",
  "code": "525092",
  "sent_at": "2026-10-27T17:39:02.214460876Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cb20051-80de-47e2-a21a-e46a4fb37b41",
  "code": "525092",
  "device_ref": "sandbox-9148"
}
```

```json
{
  "session_id": "855875ae-80ba-4fc2-9287-4a80ae220b1b",
  "subject": {
    "type": "CLIENT",
    "id": "1217dca0-248f-42de-9531-31c28064baa8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjE3ZGNhMC0yNDhmLTQyZGUtOTUzMS0zMWMyODA2NGJhYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjQyLCJpYXQiOjE3OTMxMjI3NDIsImp0aSI6IjllYzAxZTFjLWY5MDItNDU5Zi1iMmFkLWYwNDkyNWZmNTYzOSIsInNpZCI6Ijg1NTg3NWFlLTgwYmEtNGZjMi05Mjg3LTRhODBhZTIyMGIxYiJ9.GT8L0Ijt22Wyo4yHnVHMPnXjCTC1JPqcaPXoJPcvngg",
  "access_expires_at": "2026-10-27T17:54:02.273090108Z",
  "refresh_token": "kEVJOk0JDPllboF8iJdjn62VasjvBlndASVUBqjNEhA",
  "refresh_expires_at": "2026-11-26T17:39:02.272312184Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
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
  "device_ref": "sandbox-5111"
}
```

```json
{
  "challenge_id": "641c4a0c-ca72-4679-898c-2bc622f90d36",
  "expires_at": "2026-10-27T17:44:02.330383904Z",
  "resend_available_at": "2026-10-27T17:39:03.330383904Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "158532",
  "sent_at": "2026-10-27T17:39:02.333823527Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "641c4a0c-ca72-4679-898c-2bc622f90d36",
  "code": "158532",
  "device_ref": "sandbox-5111"
}
```

```json
{
  "session_id": "b734a5fa-eb9e-4124-93a7-175f234a3e89",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY0MiwiaWF0IjoxNzkzMTIyNzQyLCJqdGkiOiI0YjgyY2MzMS1kMWJiLTRhZjEtOTA4OC1mNzVkOWY4ZWNiZDUiLCJzaWQiOiJiNzM0YTVmYS1lYjllLTQxMjQtOTNhNy0xNzVmMjM0YTNlODkifQ.IBH-tZOU4US-p1kIFxT1e38CUECQx1hzdVvRtPtdr2g",
  "access_expires_at": "2026-10-27T17:54:02.392064631Z",
  "refresh_token": "Pwt_2xFh9neI0H1nnwaogFBpy5BCr2Q75eDPRlmbg_0",
  "refresh_expires_at": "2026-11-26T17:39:02.391188836Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
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
  "session_id": "7d8857cd-fd46-4209-b742-e9822705df36",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NDIsImlhdCI6MTc5MzEyMjc0MiwianRpIjoiYzMyZjI0M2MtYjM3ZC00ZGIxLThlODQtODk4NmU3NDYzMDZmIiwic2lkIjoiN2Q4ODU3Y2QtZmQ0Ni00MjA5LWI3NDItZTk4MjI3MDVkZjM2In0.lp0_pOzyKvg_Y56frN655vFU0k52pe1anPm0dnCEaE0",
  "access_expires_at": "2026-10-27T17:54:02.74146102Z",
  "refresh_token": "9VoRcHgFTPlmRKMJJeWkhSgIckdvPU-VVtFhciulwyc",
  "refresh_expires_at": "2026-10-28T05:39:02.74058353Z",
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
  "session_id": "4a8ce01d-01ec-4934-9323-dd4e4b9f27f1",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NDMsImlhdCI6MTc5MzEyMjc0MywianRpIjoiNjkwZTgzNGItMDlkZS00YjQ2LWE5NGMtOTk4NmEzN2UyMzQwIiwic2lkIjoiNGE4Y2UwMWQtMDFlYy00OTM0LTkzMjMtZGQ0ZTRiOWYyN2YxIn0._B51rq6Fd0PTk35d9k9BN9T7lPOKM5Hl9ex4kC1z7Og",
  "access_expires_at": "2026-10-27T17:54:03.06329356Z",
  "refresh_token": "nnA2Ya4l8UdJoHw_9Bg3l9Xv1UvHlZvT87C9aUWxWzg",
  "refresh_expires_at": "2026-10-28T05:39:03.062318958Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "13d45a82-d5b6-4a4f-89f2-efb5ba3df46c",
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
  "id": "2d35f30f-5520-471f-b65f-9821331ba284",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T17:44:03.131702Z",
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
  "command_id": "9d5d39b7-0a4c-43d2-b615-8efc32c6f3d5",
  "quote_id": "2d35f30f-5520-471f-b65f-9821331ba284",
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
  "id": "399ab3e1-bc43-472e-bc16-4e251ae50dc1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1217dca0-248f-42de-9531-31c28064baa8",
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
  "created_at": "2026-10-27T17:39:03.176928Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/399ab3e1-bc43-472e-bc16-4e251ae50dc1` → **200**

```json
{
  "id": "399ab3e1-bc43-472e-bc16-4e251ae50dc1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1217dca0-248f-42de-9531-31c28064baa8",
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
  "created_at": "2026-10-27T17:39:03.176928Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/399ab3e1-bc43-472e-bc16-4e251ae50dc1/cancel` → **200**

```json
{
  "command_id": "422dffd9-a8fc-498f-8758-fa5c39ac3bbe",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "399ab3e1-bc43-472e-bc16-4e251ae50dc1",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1217dca0-248f-42de-9531-31c28064baa8",
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
  "created_at": "2026-10-27T17:39:03.176928Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
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
  "command_id": "4031fc6c-37f3-4465-86cd-2e034c6eaa32",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:03Z",
    "sequence": 1793122743322
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:03.343046Z",
  "last_location_at": "2026-10-27T17:39:03.343046Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2657"
}
```

```json
{
  "challenge_id": "367a0143-4c75-426e-9d12-5fe616dc976e",
  "expires_at": "2026-10-27T17:44:03.375029196Z",
  "resend_available_at": "2026-10-27T17:39:04.375029196Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "563141",
  "sent_at": "2026-10-27T17:39:03.378554084Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "367a0143-4c75-426e-9d12-5fe616dc976e",
  "code": "563141",
  "device_ref": "sandbox-2657"
}
```

```json
{
  "session_id": "a3f66be2-ee09-4c50-91ee-7743f28df7c8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY0MywiaWF0IjoxNzkzMTIyNzQzLCJqdGkiOiI5NGJkOGZjNi01ZjhmLTRiZTEtOGEwMi0yY2FiM2EyYWQ1YTIiLCJzaWQiOiJhM2Y2NmJlMi1lZTA5LTRjNTAtOTFlZS03NzQzZjI4ZGY3YzgifQ.6DlI8iX5TuFK8kiNZTHt9ZXyVjvvPMOY6b36Kk79-Co",
  "access_expires_at": "2026-10-27T17:54:03.438515791Z",
  "refresh_token": "y5aU8VVY8ecHlKHbtbDC9uq9uZSHTzzM1yL1Rrwt7WE",
  "refresh_expires_at": "2026-11-26T17:39:03.437522552Z",
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
  "command_id": "32f089c0-cd9a-4ed8-93a7-9b82297c2aa5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:03Z",
    "sequence": 1793122743496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db29e6-98e7-42ec-a3aa-5ec29edc6b2d",
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
  "last_heartbeat_at": "2026-10-27T17:39:03.51678Z",
  "last_location_at": "2026-10-27T17:39:03.51678Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b69134b9-9db4-433d-b83c-ed00b84cb62a",
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
  "id": "6a239e32-c7ff-428c-8e74-37e59d07c241",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T17:44:03.559488Z",
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
  "command_id": "3723ff02-4299-4954-8da8-2f9dad723e1a",
  "quote_id": "6a239e32-c7ff-428c-8e74-37e59d07c241",
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
  "id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1217dca0-248f-42de-9531-31c28064baa8",
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
  "created_at": "2026-10-27T17:39:03.601791Z",
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
    "id": "3cd34460-d1f3-4128-a0b0-40a84c95f599",
    "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
    "expires_at": "2026-10-27T17:39:18.606304Z",
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

`POST /api/driver/v1/offers/3cd34460-d1f3-4128-a0b0-40a84c95f599/accept` → **200**

```json
{
  "command_id": "2286671e-9a95-4ed9-861b-785b317f1b58"
}
```

```json
{
  "id": "b556c6fb-5006-4795-aa58-795b3bcd54c2",
  "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fccc98b9-4880-4375-b5ee-af833134bd86",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fccc98b9-4880-4375-b5ee-af833134bd86",
  "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "assignment_id": "b556c6fb-5006-4795-aa58-795b3bcd54c2",
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

`POST /api/driver/v1/trips/fccc98b9-4880-4375-b5ee-af833134bd86/cancel` → **200**

```json
{
  "command_id": "ee45547f-5a6e-47a9-8ca1-b40ce48f49f9",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "fccc98b9-4880-4375-b5ee-af833134bd86",
  "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "assignment_id": "b556c6fb-5006-4795-aa58-795b3bcd54c2",
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

`GET /api/rider/v1/orders/f0585709-4b83-4286-85c8-bf0676ddf2c9` → **200**

```json
{
  "id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1217dca0-248f-42de-9531-31c28064baa8",
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
    "id": "b556c6fb-5006-4795-aa58-795b3bcd54c2",
    "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "fccc98b9-4880-4375-b5ee-af833134bd86",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T17:39:03.601791Z",
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
    "id": "1d003a81-2f58-45bd-8240-be3229ce349c",
    "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
    "expires_at": "2026-10-27T17:39:18.760153Z",
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

`POST /api/driver/v1/offers/1d003a81-2f58-45bd-8240-be3229ce349c/accept` → **200**

```json
{
  "command_id": "6cec48d3-a3ed-43f0-a9d9-232ead9297f4"
}
```

```json
{
  "id": "02ccb162-f809-4120-90b0-6f483471bedb",
  "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8ab1036-a6cb-4f62-89ea-3631549149ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8ab1036-a6cb-4f62-89ea-3631549149ed",
  "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "assignment_id": "02ccb162-f809-4120-90b0-6f483471bedb",
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

`POST /api/driver/v1/trips/a8ab1036-a6cb-4f62-89ea-3631549149ed/cancel` → **200**

```json
{
  "command_id": "c048de7d-61c6-4711-9f1d-b5eb28ac71a4",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a8ab1036-a6cb-4f62-89ea-3631549149ed",
  "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
  "assignment_id": "02ccb162-f809-4120-90b0-6f483471bedb",
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
    "id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:39:03.601791Z",
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
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "399ab3e1-bc43-472e-bc16-4e251ae50dc1",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:39:03.176928Z",
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
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/f0585709-4b83-4286-85c8-bf0676ddf2c9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:39:03.602483Z",
      "actor": {
        "type": "CLIENT",
        "id": "1217dca0-248f-42de-9531-31c28064baa8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
        "quote_id": "6a239e32-c7ff-428c-8e74-37e59d07c241",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:39:03.604997Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
        "attempt_id": "1325cf91-66e4-44ac-ad4e-8f9110702e4b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:39:03.613226Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3cd34460-d1f3-4128-a0b0-40a84c95f599",
        "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:39:03.679167Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3cd34460-d1f3-4128-a0b0-40a84c95f599",
        "order_id": "f0585709-4b83-4286-85c8-bf0676ddf2c9",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "b556c6fb-5006-4795-aa58-795b3bcd54c2"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 399ab3e1-bc43-472e-bc16-4e251ae50dc1, f0585709-4b83-4286-85c8-bf0676ddf2c9.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734753097",
  "device_ref": "sandbox-29118"
}
```

```json
{
  "challenge_id": "ad7efca7-be8f-432f-b2b9-ae6f7a8290ad",
  "expires_at": "2026-10-27T17:44:04.041719599Z",
  "resend_available_at": "2026-10-27T17:39:05.041719599Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734753097` → **200**

```json
{
  "phone": "+380734753097",
  "audience": "CLIENT",
  "code": "282323",
  "sent_at": "2026-10-27T17:39:04.046907377Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad7efca7-be8f-432f-b2b9-ae6f7a8290ad",
  "code": "282323",
  "device_ref": "sandbox-29118"
}
```

```json
{
  "session_id": "0b5b432c-3640-408a-9e62-7823f6144722",
  "subject": {
    "type": "CLIENT",
    "id": "22981ebe-e440-4337-bfe4-5ede43f7fbe4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMjk4MWViZS1lNDQwLTQzMzctYmZlNC01ZWRlNDNmN2ZiZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjQ0LCJpYXQiOjE3OTMxMjI3NDQsImp0aSI6Ijc0MDk0NzNlLWY5ZGEtNGYzNy05NWYzLTY5MWMwNDNhYjg2NiIsInNpZCI6IjBiNWI0MzJjLTM2NDAtNDA4YS05ZTYyLTc4MjNmNjE0NDcyMiJ9.BJ3XeedOb55YQ6U6jlPOTxcfusrFWVkU6rhp2gqWr2s",
  "access_expires_at": "2026-10-27T17:54:04.117820202Z",
  "refresh_token": "nDiTp9z_4vpE6lDCBZsga5bZmHyBgvJ_n6Aklx9YavE",
  "refresh_expires_at": "2026-11-26T17:39:04.117049519Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "38ec76ef-387a-4054-8a3c-54bb2bdc1b9d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "24c0eb18-166f-4994-b988-06a4d2aa786f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-24c0eb18-166f-4994-b988-06a4d2aa786f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "48bc283beaa2b3fbbd47f224af7296e4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=24c0eb18-166f-4994-b988-06a4d2aa786f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734753097"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=24c0eb18-166f-4994-b988-06a4d2aa786f",
  "expires_at": "2026-10-27T18:09:04.15752Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/24c0eb18-166f-4994-b988-06a4d2aa786f` → **200**

```json
{
  "id": "24c0eb18-166f-4994-b988-06a4d2aa786f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T18:09:04.15752Z",
  "card": {
    "id": "fb0b9166-da77-4f22-a239-1b66b113c5a8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5836",
    "card_type": "Visa",
    "created_at": "2026-10-27T17:39:04.206846Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "fb0b9166-da77-4f22-a239-1b66b113c5a8",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5836",
      "card_type": "Visa",
      "created_at": "2026-10-27T17:39:04.206846Z"
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
  "device_ref": "sandbox-17164"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "4018f429-b226-45d1-b89b-010346ea0c24",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17164"
}
```

```json
{
  "challenge_id": "331edca5-5982-4269-99ee-a71c0960f12b",
  "expires_at": "2026-10-27T17:44:05.323326398Z",
  "resend_available_at": "2026-10-27T17:39:06.323326398Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "963982",
  "sent_at": "2026-10-27T17:39:05.32624724Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "331edca5-5982-4269-99ee-a71c0960f12b",
  "code": "963982",
  "device_ref": "sandbox-17164"
}
```

```json
{
  "session_id": "24ac5a7b-fb06-4f4d-b54e-938ac7986c2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY0NSwiaWF0IjoxNzkzMTIyNzQ1LCJqdGkiOiJlZDUwNjZhNi01ZjU5LTQ1OWUtODQ5Yi1lOGZiNWNlYWUxYzAiLCJzaWQiOiIyNGFjNWE3Yi1mYjA2LTRmNGQtYjU0ZS05MzhhYzc5ODZjMmEifQ.nI2w8XXxtc8r0HnAEcM-bS24f83N9exXcT6xe7D10SM",
  "access_expires_at": "2026-10-27T17:54:05.381000386Z",
  "refresh_token": "e9FloUeSQddMeTWoZwDz4Sg4oEEUTYsBxf3ONTVS-AU",
  "refresh_expires_at": "2026-11-26T17:39:05.380277623Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db29e6-98e7-42ec-a3aa-5ec29edc6b2d",
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
  "last_heartbeat_at": "2026-10-27T17:39:03.51678Z",
  "last_location_at": "2026-10-27T17:39:03.51678Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71db29e6-98e7-42ec-a3aa-5ec29edc6b2d/handover` → **200**

```json
{
  "command_id": "fa0d0724-9619-406f-9acf-30449cbc8478",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db29e6-98e7-42ec-a3aa-5ec29edc6b2d",
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
  "last_heartbeat_at": "2026-10-27T17:39:03.51678Z",
  "last_location_at": "2026-10-27T17:39:03.51678Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71db29e6-98e7-42ec-a3aa-5ec29edc6b2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:05Z",
    "sequence": 1793122745474
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db29e6-98e7-42ec-a3aa-5ec29edc6b2d",
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
  "last_heartbeat_at": "2026-10-27T17:39:05.495766Z",
  "last_location_at": "2026-10-27T17:39:05.495766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f8ae7e35-64ca-442c-98b9-2f918333faa1",
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
  "id": "0e67f7dc-e6ac-4f38-b947-d2920f307813",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T17:44:05.536043Z",
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
  "command_id": "a7b83032-e7f2-4703-b73f-376f634dfd94",
  "quote_id": "0e67f7dc-e6ac-4f38-b947-d2920f307813",
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
  "id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "22981ebe-e440-4337-bfe4-5ede43f7fbe4",
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
  "created_at": "2026-10-27T17:39:05.578475Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541` → **200**

```json
{
  "id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "22981ebe-e440-4337-bfe4-5ede43f7fbe4",
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
  "created_at": "2026-10-27T17:39:05.578475Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541` → **200**

```json
{
  "id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "22981ebe-e440-4337-bfe4-5ede43f7fbe4",
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
  "created_at": "2026-10-27T17:39:05.578475Z",
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
    "id": "e69f7e66-76af-46ce-9d01-f9b6df513014",
    "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
    "expires_at": "2026-10-27T17:39:20.674109Z",
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

`POST /api/driver/v1/offers/e69f7e66-76af-46ce-9d01-f9b6df513014/accept` → **200**

```json
{
  "command_id": "a117d2c0-5c24-43a8-b7d5-abc5f0536d18"
}
```

```json
{
  "id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0d979308-d090-44dd-ae01-74f5625c8574",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0d979308-d090-44dd-ae01-74f5625c8574",
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "assignment_id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
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

`POST /api/driver/v1/work-sessions/71db29e6-98e7-42ec-a3aa-5ec29edc6b2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:06Z",
    "sequence": 1793122746768
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db29e6-98e7-42ec-a3aa-5ec29edc6b2d",
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
  "last_heartbeat_at": "2026-10-27T17:39:06.790232Z",
  "last_location_at": "2026-10-27T17:39:06.790232Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0d979308-d090-44dd-ae01-74f5625c8574/arrive` → **200**

```json
{
  "command_id": "454bd9c8-fe31-45ec-a0f1-1951dc9866fc",
  "expected_version": 0
}
```

```json
{
  "id": "0d979308-d090-44dd-ae01-74f5625c8574",
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "assignment_id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
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
  "arrived_at": "2026-10-27T17:39:06.829133Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d979308-d090-44dd-ae01-74f5625c8574/start` → **200**

```json
{
  "command_id": "36c92065-2f02-473a-b0e9-91623c08dc1b",
  "expected_version": 1
}
```

```json
{
  "id": "0d979308-d090-44dd-ae01-74f5625c8574",
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "assignment_id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
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
  "arrived_at": "2026-10-27T17:39:06.829133Z",
  "started_at": "2026-10-27T17:39:06.870946Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d979308-d090-44dd-ae01-74f5625c8574/complete` → **200**

```json
{
  "command_id": "08b46e75-3832-4366-84e6-155adf711301",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:39:06Z"
}
```

```json
{
  "id": "0d979308-d090-44dd-ae01-74f5625c8574",
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "assignment_id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
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
  "arrived_at": "2026-10-27T17:39:06.829133Z",
  "started_at": "2026-10-27T17:39:06.870946Z",
  "completed_at": "2026-10-27T17:39:06.917597Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541` → **200**

```json
{
  "id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "22981ebe-e440-4337-bfe4-5ede43f7fbe4",
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
    "id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
    "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d979308-d090-44dd-ae01-74f5625c8574",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:39:05.578475Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541` → **200**

```json
{
  "id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "22981ebe-e440-4337-bfe4-5ede43f7fbe4",
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
    "id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
    "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d979308-d090-44dd-ae01-74f5625c8574",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:39:05.578475Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541` → **200**

```json
{
  "id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "22981ebe-e440-4337-bfe4-5ede43f7fbe4",
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
    "id": "8a527e85-4e76-4fd1-b7d4-260ac09de28b",
    "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0d979308-d090-44dd-ae01-74f5625c8574",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:39:05.578475Z",
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
      "id": "eb4756bf-cf90-4cac-a1e2-eaee173fa82a",
      "at": "2026-10-27T17:39:07.726105Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541/tip` → **200**

```json
{
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
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
  "available_until": "2026-10-28T17:39:06.917597Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541/tip` → **201**

```json
{
  "command_id": "68d9f51e-a585-4c14-a404-bcb998bb72eb",
  "amount_minor": 2500
}
```

```json
{
  "id": "66077170-a4f3-4d45-83cd-3efb44051b29",
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T17:39:09.153961Z"
}
```

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541/tip` → **200**

```json
{
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
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
  "available_until": "2026-10-28T17:39:06.917597Z",
  "open": false,
  "tip": {
    "id": "66077170-a4f3-4d45-83cd-3efb44051b29",
    "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T17:39:09.153961Z"
  }
}
```

`GET /api/rider/v1/orders/c0c4d83b-6026-4fc9-96b9-b084289ba541/tip` → **200**

```json
{
  "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
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
  "available_until": "2026-10-28T17:39:06.917597Z",
  "open": false,
  "tip": {
    "id": "66077170-a4f3-4d45-83cd-3efb44051b29",
    "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T17:39:09.153961Z"
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
      "id": "eb4756bf-cf90-4cac-a1e2-eaee173fa82a",
      "at": "2026-10-27T17:39:07.726105Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
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
      "id": "4cd7d195-6345-45ab-ba73-9daff019ff6b",
      "at": "2026-10-27T17:39:10.775847Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
      "counterpart_id": null
    },
    {
      "id": "eb4756bf-cf90-4cac-a1e2-eaee173fa82a",
      "at": "2026-10-27T17:39:07.726105Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c0c4d83b-6026-4fc9-96b9-b084289ba541",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71db29e6-98e7-42ec-a3aa-5ec29edc6b2d",
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
  "last_heartbeat_at": "2026-10-27T17:39:06.790232Z",
  "last_location_at": "2026-10-27T17:39:06.790232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71db29e6-98e7-42ec-a3aa-5ec29edc6b2d/close` → **200**

```json
{
  "command_id": "993e4a3d-8937-45a4-b8ef-d27a2c7e913d",
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

Done: card order c0c4d83b-6026-4fc9-96b9-b084289ba541.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735089826",
  "device_ref": "sandbox-10512"
}
```

```json
{
  "challenge_id": "0244bf7f-1154-458d-81f5-eda282fea422",
  "expires_at": "2026-10-27T17:44:11.389455094Z",
  "resend_available_at": "2026-10-27T17:39:12.389455094Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735089826` → **200**

```json
{
  "phone": "+380735089826",
  "audience": "CLIENT",
  "code": "244099",
  "sent_at": "2026-10-27T17:39:11.392798339Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0244bf7f-1154-458d-81f5-eda282fea422",
  "code": "244099",
  "device_ref": "sandbox-10512"
}
```

```json
{
  "session_id": "d6d56b14-da20-454a-a83d-131799c0f0cb",
  "subject": {
    "type": "CLIENT",
    "id": "0cd90e05-a245-416b-8a36-0a512be167f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwY2Q5MGUwNS1hMjQ1LTQxNmItOGEzNi0wYTUxMmJlMTY3ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjUxLCJpYXQiOjE3OTMxMjI3NTEsImp0aSI6ImU1OGZhNGNlLTQyZmQtNGEyZi1hMDRjLWVmYjUzNDg4ZjcyMSIsInNpZCI6ImQ2ZDU2YjE0LWRhMjAtNDU0YS1hODNkLTEzMTc5OWMwZjBjYiJ9.4QFvebOT2iRZaMLpek-32SagZV6zpOTl0H2J133TbEA",
  "access_expires_at": "2026-10-27T17:54:11.451689379Z",
  "refresh_token": "Yss1xZ1-EeTj2KGiYGzb-OAHJ_EkaU_KOvLf1AxYcps",
  "refresh_expires_at": "2026-11-26T17:39:11.44968219Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "45d4ad52-0f41-455e-9c12-8ea4c4a50b75",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "6e79bc37-5523-4139-a741-235519786da0",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6e79bc37-5523-4139-a741-235519786da0",
    "orderDate": "1793122751",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "75293139009a846977f77744580df1d2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6e79bc37-5523-4139-a741-235519786da0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735089826"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6e79bc37-5523-4139-a741-235519786da0",
  "created_at": "2026-10-27T17:39:11.489871Z",
  "expires_at": "2026-10-27T18:09:11.489871Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/6e79bc37-5523-4139-a741-235519786da0` → **200**

```json
{
  "id": "6e79bc37-5523-4139-a741-235519786da0",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T17:39:11.489871Z",
  "expires_at": "2026-10-27T18:09:11.489871Z",
  "completed_at": "2026-10-27T17:39:11.532109Z",
  "masked_pan": "41****7209",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0cd90e05-a245-416b-8a36-0a512be167f9",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0cd90e05-a245-416b-8a36-0a512be167f9",
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
      "id": "b1b07be7-96cd-4a6c-a3c0-bd1acbde3005",
      "at": "2026-10-27T17:39:11.787833Z",
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
  "client_id": "0cd90e05-a245-416b-8a36-0a512be167f9",
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
      "id": "b1b07be7-96cd-4a6c-a3c0-bd1acbde3005",
      "at": "2026-10-27T17:39:11.787833Z",
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
  "device_ref": "sandbox-13917"
}
```

```json
{
  "challenge_id": "795807e3-f1bc-4efc-9d24-5085ec8f783c",
  "expires_at": "2026-10-27T17:44:12.668196305Z",
  "resend_available_at": "2026-10-27T17:39:13.668196305Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "412797",
  "sent_at": "2026-10-27T17:39:12.671232542Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "795807e3-f1bc-4efc-9d24-5085ec8f783c",
  "code": "412797",
  "device_ref": "sandbox-13917"
}
```

```json
{
  "session_id": "e06b5919-41fa-492f-b47d-47db0b0c1b54",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY1MiwiaWF0IjoxNzkzMTIyNzUyLCJqdGkiOiIxNzlkMDI4ZC1hNzcwLTRhZjUtODI0ZC1hNWNmNDM1Y2M4NDciLCJzaWQiOiJlMDZiNTkxOS00MWZhLTQ5MmYtYjQ3ZC00N2RiMGIwYzFiNTQifQ.h5-vMaDagGaOPbFXzCFwYGzU57EGa_dH8E08-fEu0ek",
  "access_expires_at": "2026-10-27T17:54:12.729657799Z",
  "refresh_token": "PT_xmxmW_REx6jIhH4DVd7up5DvzQnX8zMXg9iiLdWA",
  "refresh_expires_at": "2026-11-26T17:39:12.728967207Z",
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
  "command_id": "9c9d2bba-298a-4adb-ace0-533fe7191c0b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "47c7cef7-4e67-407b-ab13-09627e84e755",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-47c7cef7-4e67-407b-ab13-09627e84e755",
    "orderDate": "1793122752",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "d4b6ab54e1264fccaf0ff3eeaf03b618",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=47c7cef7-4e67-407b-ab13-09627e84e755",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=47c7cef7-4e67-407b-ab13-09627e84e755",
  "created_at": "2026-10-27T17:39:12.787675Z",
  "expires_at": "2026-10-27T18:09:12.787675Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/47c7cef7-4e67-407b-ab13-09627e84e755` → **200**

```json
{
  "id": "47c7cef7-4e67-407b-ab13-09627e84e755",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T17:39:12.787675Z",
  "expires_at": "2026-10-27T18:09:12.787675Z",
  "completed_at": "2026-10-27T17:39:12.821612Z",
  "masked_pan": "41****1626",
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
      "id": "5f263901-920f-4d36-9f8e-e66fcdcfa191",
      "at": "2026-10-27T17:39:13.797452Z",
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
  "command_id": "dd3de1a9-4c0c-4a56-be33-3fa82a0d4c59",
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
  "correlation_id": "9319a5f7-fcc3-4cb6-a8d7-1f903151b5aa"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670672825",
  "device_ref": "sandbox-23777"
}
```

```json
{
  "challenge_id": "3458ff8e-cc0e-4927-9311-17850b7a4334",
  "expires_at": "2026-10-27T17:44:13.969395296Z",
  "resend_available_at": "2026-10-27T17:39:14.969395296Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670672825` → **200**

```json
{
  "phone": "+380670672825",
  "audience": "CLIENT",
  "code": "696477",
  "sent_at": "2026-10-27T17:39:13.972197701Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3458ff8e-cc0e-4927-9311-17850b7a4334",
  "code": "696477",
  "device_ref": "sandbox-23777"
}
```

```json
{
  "session_id": "d4701af2-3202-405f-bf4c-062c006e3f1c",
  "subject": {
    "type": "CLIENT",
    "id": "fe395eb0-ade6-4543-b54a-5fad4a9c9e88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTM5NWViMC1hZGU2LTQ1NDMtYjU0YS01ZmFkNGE5YzllODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjU0LCJpYXQiOjE3OTMxMjI3NTQsImp0aSI6IjRiZTQzYWYyLTgxZWEtNDVkMy05OGM4LTJhMDUzNWY0MmM2YiIsInNpZCI6ImQ0NzAxYWYyLTMyMDItNDA1Zi1iZjRjLTA2MmMwMDZlM2YxYyJ9.dSrUBE21XEv2FBqCWDvTKUctvihfLDaw9FZtbzf5fFE",
  "access_expires_at": "2026-10-27T17:54:14.029544366Z",
  "refresh_token": "eeV_u5VYOUHV-llQ9FmKUFi3nfTE5BTtsTMnsqHzezc",
  "refresh_expires_at": "2026-11-26T17:39:14.02886243Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fe395eb0-ade6-4543-b54a-5fad4a9c9e88",
  "session_id": "d4701af2-3202-405f-bf4c-062c006e3f1c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ef7dee91-4be9-46e4-be8f-aa33fdf382d1",
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
  "id": "7f065de6-2328-42e7-8e50-018b46372382",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:44:14.093015Z",
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
  "challenge_id": "e9e77363-9981-4c47-b347-122fd77de202",
  "expires_at": "2026-10-27T17:44:16.134858629Z",
  "resend_available_at": "2026-10-27T17:39:17.134858629Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670672825` → **200**

```json
{
  "phone": "+380670672825",
  "audience": "CLIENT",
  "code": "019457",
  "sent_at": "2026-10-27T17:39:16.137397955Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "11badbaf-b1e7-4304-bda0-ce304dd9b8f7",
  "challenge_id": "e9e77363-9981-4c47-b347-122fd77de202",
  "otp_code": "019457"
}
```

```json
{
  "client_id": "fe395eb0-ade6-4543-b54a-5fad4a9c9e88",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T17:39:16.207870822Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a91238c7-eb62-4c44-b5f4-a2ac46e4ff5d",
  "quote_id": "7f065de6-2328-42e7-8e50-018b46372382",
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
  "correlation_id": "4b4c0b03-b997-4780-a318-877222a1c9f9"
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
  "session_id": "1a067a0a-2293-45c2-8383-c1c13bd4ff0a",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NTYsImlhdCI6MTc5MzEyMjc1NiwianRpIjoiMzJiNGY0YzYtMTlkMC00NmVmLTgxZGYtOGI4ZTJiMzUyNDBkIiwic2lkIjoiMWEwNjdhMGEtMjI5My00NWMyLTgzODMtYzFjMTNiZDRmZjBhIn0.14jqVgs392dnhdYAY30wMvqQu2DR1f4BD6lftNKjTt0",
  "access_expires_at": "2026-10-27T17:54:16.579343012Z",
  "refresh_token": "1VYKBmHKZ8mwN08JLbcopayrXmX3kxqudI_6N8mATmQ",
  "refresh_expires_at": "2026-10-28T05:39:16.578660314Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "fe395eb0-ade6-4543-b54a-5fad4a9c9e88",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T17:39:16.207871Z",
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

`POST /api/admin/v1/client-deletions/fe395eb0-ade6-4543-b54a-5fad4a9c9e88/complete` → **200**

```json
{
  "command_id": "2e8269fa-4229-43ef-b8c7-cafbe7f7f260",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "fe395eb0-ade6-4543-b54a-5fad4a9c9e88",
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
  "correlation_id": "34ee925c-beae-49cd-aae2-e9a50845aa13"
}
```

Done: client fe395eb0-ade6-4543-b54a-5fad4a9c9e88 anonymized.

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
  "device_ref": "sandbox-7820"
}
```

```json
{
  "challenge_id": "41ae7ea3-d946-468c-886d-37f4187031e3",
  "expires_at": "2026-10-27T17:44:16.760134834Z",
  "resend_available_at": "2026-10-27T17:39:17.760134834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "648983",
  "sent_at": "2026-10-27T17:39:16.763098258Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41ae7ea3-d946-468c-886d-37f4187031e3",
  "code": "648983",
  "device_ref": "sandbox-7820"
}
```

```json
{
  "session_id": "e2d42de9-8daa-4e68-8771-fce96c460f4e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY1NiwiaWF0IjoxNzkzMTIyNzU2LCJqdGkiOiJjMmRiYjk1ZS1hNDU4LTQwNmYtODM2YS1kMzE2ZmU0ZDEyZjUiLCJzaWQiOiJlMmQ0MmRlOS04ZGFhLTRlNjgtODc3MS1mY2U5NmM0NjBmNGUifQ.QfTXCNuwjyjT5qgT7O-knglcwVZm3Uw6_DShnX74XvM",
  "access_expires_at": "2026-10-27T17:54:16.834536186Z",
  "refresh_token": "IIAXdFjt11c_MDKyWn28LMLYEoD-bP1rLdEs5N0GD-M",
  "refresh_expires_at": "2026-11-26T17:39:16.833854685Z",
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
  "command_id": "1151478e-b36b-4633-a791-0f9d6710782d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:16Z",
    "sequence": 1793122756887
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:16.907267Z",
  "last_location_at": "2026-10-27T17:39:16.907267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675614468",
  "device_ref": "sandbox-18916"
}
```

```json
{
  "challenge_id": "1a8c2c60-00ae-4dec-8f5b-d30642ad7626",
  "expires_at": "2026-10-27T17:44:16.941649873Z",
  "resend_available_at": "2026-10-27T17:39:17.941649873Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675614468` → **200**

```json
{
  "phone": "+380675614468",
  "audience": "CLIENT",
  "code": "519465",
  "sent_at": "2026-10-27T17:39:16.9440794Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a8c2c60-00ae-4dec-8f5b-d30642ad7626",
  "code": "519465",
  "device_ref": "sandbox-18916"
}
```

```json
{
  "session_id": "3c90c76e-78b4-4e33-a148-81c6d8e76905",
  "subject": {
    "type": "CLIENT",
    "id": "2012d8e0-38a3-4015-852f-59be90da454d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDEyZDhlMC0zOGEzLTQwMTUtODUyZi01OWJlOTBkYTQ1NGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjU3LCJpYXQiOjE3OTMxMjI3NTcsImp0aSI6Ijk0OGM4N2JjLWQ1YmUtNDRlMS05MzM2LTI1N2FiOTA2YmU2MSIsInNpZCI6IjNjOTBjNzZlLTc4YjQtNGUzMy1hMTQ4LTgxYzZkOGU3NjkwNSJ9.dXBlcLOxHkH91h0FnZj3KfYxCIBsmyLikmzO53HKz-w",
  "access_expires_at": "2026-10-27T17:54:17.001878792Z",
  "refresh_token": "gEMcVmZVI0CSEmlGDXatnOA4wRC95tuJ1HLS9PhVRks",
  "refresh_expires_at": "2026-11-26T17:39:17.001242551Z",
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
  "command_id": "7c92fc68-89d2-4a1f-ba9a-9e30483b2106",
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
  "id": "77d6f320-e662-4f86-a9cb-5c76f4193f12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:44:17.065634Z",
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
  "command_id": "70389a75-7e9c-4715-95c6-6bb701d6c5dd",
  "platform": "ANDROID",
  "token": "sandbox-driver-1b6b7db4-356d-42b1-83f2-584b8fd96649"
}
```

```json
{
  "id": "d8daa100-a566-4c95-a250-a82c7119d9d8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T17:39:17.109616Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b316dc73-bbe8-46c0-a57d-f8daee156947",
  "platform": "ANDROID",
  "token": "sandbox-rider-0054e7ff-1816-4038-aa77-66e1a24f4e75"
}
```

```json
{
  "id": "d6057996-6b18-4350-9d08-3af5f3725cad",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T17:39:17.148468Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8914e23c-67de-4966-9d70-01980fea5ced",
  "quote_id": "77d6f320-e662-4f86-a9cb-5c76f4193f12",
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
  "id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2012d8e0-38a3-4015-852f-59be90da454d",
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
  "created_at": "2026-10-27T17:39:17.192567Z",
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
    "id": "46d1171a-2706-4d56-91c3-b9b1a17c4f0b",
    "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
    "expires_at": "2026-10-27T17:39:32.196628Z",
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

`POST /api/driver/v1/offers/46d1171a-2706-4d56-91c3-b9b1a17c4f0b/accept` → **200**

```json
{
  "command_id": "f1d22d1a-9bc4-4db7-baf5-efbbc668381b"
}
```

```json
{
  "id": "a25dbf67-5133-4543-a048-29079ab36416",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T17:39:17.168Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T17:39:17.168Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T17:39:17.168Z` → **200**

```json
[
  {
    "at": "2026-10-27T17:39:18.527455345Z",
    "token_suffix": "d96649",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
      "order_version": "2",
      "event_id": "46d62fa8-46f9-4164-843f-761cd9c9602d",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675614468&after=2026-10-27T17:39:17.168Z` → **200**

```json
[
  {
    "at": "2026-10-27T17:39:18.530012141Z",
    "token_suffix": "4f4e75",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
      "order_version": "3",
      "event_id": "23613697-20cc-48ed-a8d6-a31378c7df20",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/08a10e6c-3fcc-4efc-95c1-c184c024d5f8/messages` → **201**

```json
{
  "command_id": "7b71822b-3ada-44f3-9636-dd56b5b8f083",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "e8c5980a-953a-4a10-8bfc-360c95bfd5f3",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T17:39:19.422424298Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "assignment_id": "a25dbf67-5133-4543-a048-29079ab36416",
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

`POST /api/driver/v1/trips/edf4bd78-7ef1-41ed-a4b2-9355251e0e3a/messages` → **201**

```json
{
  "command_id": "94d493bc-db4f-4b7c-8aa0-fbf8be5410a2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8a47de7d-b65d-4140-88a8-6aa2f50e8533",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T17:39:19.4772176Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/08a10e6c-3fcc-4efc-95c1-c184c024d5f8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/edf4bd78-7ef1-41ed-a4b2-9355251e0e3a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675614468"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:19Z",
    "sequence": 1793122759556
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:19.575801Z",
  "last_location_at": "2026-10-27T17:39:19.575801Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "assignment_id": "a25dbf67-5133-4543-a048-29079ab36416",
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

`POST /api/driver/v1/trips/edf4bd78-7ef1-41ed-a4b2-9355251e0e3a/arrive` → **200**

```json
{
  "command_id": "44f5ef0b-c455-4cfc-9d33-fed9910000d5",
  "expected_version": 0
}
```

```json
{
  "id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "assignment_id": "a25dbf67-5133-4543-a048-29079ab36416",
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
  "arrived_at": "2026-10-27T17:39:19.628778Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/edf4bd78-7ef1-41ed-a4b2-9355251e0e3a/start` → **200**

```json
{
  "command_id": "07c20d78-8066-4a9c-945e-743acbe62721",
  "expected_version": 1
}
```

```json
{
  "id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "assignment_id": "a25dbf67-5133-4543-a048-29079ab36416",
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
  "arrived_at": "2026-10-27T17:39:19.628778Z",
  "started_at": "2026-10-27T17:39:19.664108Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:19Z",
    "sequence": 1793122759688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:19.707327Z",
  "last_location_at": "2026-10-27T17:39:19.707327Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/edf4bd78-7ef1-41ed-a4b2-9355251e0e3a/complete` → **200**

```json
{
  "command_id": "d491debc-c284-4ffd-b948-2ff5349dfbed",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:39:19Z",
  "cash_received": true
}
```

```json
{
  "id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "assignment_id": "a25dbf67-5133-4543-a048-29079ab36416",
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
  "arrived_at": "2026-10-27T17:39:19.628778Z",
  "started_at": "2026-10-27T17:39:19.664108Z",
  "completed_at": "2026-10-27T17:39:19.747023Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/08a10e6c-3fcc-4efc-95c1-c184c024d5f8` → **200**

```json
{
  "id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2012d8e0-38a3-4015-852f-59be90da454d",
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
    "id": "a25dbf67-5133-4543-a048-29079ab36416",
    "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:39:17.192567Z",
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
    "id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T17:39:17.192567Z",
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
    "id": "edf4bd78-7ef1-41ed-a4b2-9355251e0e3a",
    "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
    "order_short_number": 5,
    "created_at": "2026-10-27T17:39:17.270309Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4b4d5064-a21f-45b7-86a1-7baca1ef75c5",
    "order_id": "0ffa14f0-4e78-4ebb-a967-f9caa74db9b3",
    "order_short_number": 1,
    "created_at": "2026-10-27T17:38:58.697821Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
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

`GET /api/rider/v1/orders/08a10e6c-3fcc-4efc-95c1-c184c024d5f8/tip` → **200**

```json
{
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
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
  "available_until": "2026-10-28T17:39:19.747023Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/08a10e6c-3fcc-4efc-95c1-c184c024d5f8/tip` → **201**

```json
{
  "command_id": "3715ddf3-4a9a-41a1-8d29-d8c9359e0f76",
  "amount_minor": 1100
}
```

```json
{
  "id": "f95b0fa7-9f6c-4db1-aefd-152637b04b96",
  "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T17:39:22.96247Z"
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
  "session_id": "ed297a85-26f4-45ab-93db-3cd7ad379f6a",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NjMsImlhdCI6MTc5MzEyMjc2MywianRpIjoiNWYyNDM2ZDYtY2U5Yi00NTFhLWE5MTQtYmYzOWJkMWJkMTVhIiwic2lkIjoiZWQyOTdhODUtMjZmNC00NWFiLTkzZGItM2NkN2FkMzc5ZjZhIn0.pdF5UdmHE7IUvuHgA8cqLy8IG8Kl14qvPHVouVBS1pA",
  "access_expires_at": "2026-10-27T17:54:23.289142826Z",
  "refresh_token": "eDIGqKCclZbV6LB2TKeGg3ULWeZZa05zkTa7xNzhA7I",
  "refresh_expires_at": "2026-10-28T05:39:23.288551459Z",
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
  "session_id": "e051bea1-3541-416f-8177-abafd50c188c",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NjMsImlhdCI6MTc5MzEyMjc2MywianRpIjoiM2FmY2VjOTgtZTdiYS00NmVkLWE2OGQtZTI4MjZkZDEwMmZjIiwic2lkIjoiZTA1MWJlYTEtMzU0MS00MTZmLTgxNzctYWJhZmQ1MGMxODhjIn0.gztwpAsBZ2MUdR5O-3gkxRxTF9M3yxbMDh9ofmSYwo4",
  "access_expires_at": "2026-10-27T17:54:23.608965981Z",
  "refresh_token": "5dCXab8l57Chg8lP50X3ZPmbaUy6-hGmuCvHmIXatQU",
  "refresh_expires_at": "2026-10-28T05:39:23.60835138Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/08a10e6c-3fcc-4efc-95c1-c184c024d5f8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:39:17.193297Z",
      "actor": {
        "type": "CLIENT",
        "id": "2012d8e0-38a3-4015-852f-59be90da454d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
        "quote_id": "77d6f320-e662-4f86-a9cb-5c76f4193f12",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:39:17.195524Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
        "attempt_id": "dc29aa16-13d1-4c8a-8b93-4be45103627b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:39:17.20222Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "46d1171a-2706-4d56-91c3-b9b1a17c4f0b",
        "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:39:17.272989Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "46d1171a-2706-4d56-91c3-b9b1a17c4f0b",
        "order_id": "08a10e6c-3fcc-4efc-95c1-c184c024d5f8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a25dbf67-5133-4543-a048-29079ab36416"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 08a10e6c-3fcc-4efc-95c1-c184c024d5f8.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21285"
}
```

```json
{
  "challenge_id": "7f044f18-6c14-4f5f-9ecb-d331783f4df2",
  "expires_at": "2026-10-27T17:44:23.673725981Z",
  "resend_available_at": "2026-10-27T17:39:24.673725981Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "428733",
  "sent_at": "2026-10-27T17:39:23.676192498Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f044f18-6c14-4f5f-9ecb-d331783f4df2",
  "code": "428733",
  "device_ref": "sandbox-21285"
}
```

```json
{
  "session_id": "def51d2b-d77e-4530-9006-343f8c4a629e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY2MywiaWF0IjoxNzkzMTIyNzYzLCJqdGkiOiI3NDg3MzMwYi04OGJmLTRlMTktOTM5Yy1lNDY2M2UwYTY2MDYiLCJzaWQiOiJkZWY1MWQyYi1kNzdlLTQ1MzAtOTAwNi0zNDNmOGM0YTYyOWUifQ.8gAh3r31X3bQhT4pD9_fW9FV865WQ3MG-9RRjPRAM90",
  "access_expires_at": "2026-10-27T17:54:23.732031304Z",
  "refresh_token": "T8HLdVzTlyFU0rOFsqBZA43wozTnvVkb9yYaq3Zy74Q",
  "refresh_expires_at": "2026-11-26T17:39:23.731222533Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:19.707327Z",
  "last_location_at": "2026-10-27T17:39:19.707327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/handover` → **200**

```json
{
  "command_id": "246a7f53-1545-4d5c-981a-fa096dc22c70",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:19.707327Z",
  "last_location_at": "2026-10-27T17:39:19.707327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:23Z",
    "sequence": 1793122763820
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:23.839721Z",
  "last_location_at": "2026-10-27T17:39:23.839721Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668790175",
  "device_ref": "sandbox-17002"
}
```

```json
{
  "challenge_id": "43e95ee7-7923-4a8d-b32d-337875317267",
  "expires_at": "2026-10-27T17:44:23.865560287Z",
  "resend_available_at": "2026-10-27T17:39:24.865560287Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668790175` → **200**

```json
{
  "phone": "+380668790175",
  "audience": "CLIENT",
  "code": "634641",
  "sent_at": "2026-10-27T17:39:23.868115567Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43e95ee7-7923-4a8d-b32d-337875317267",
  "code": "634641",
  "device_ref": "sandbox-17002"
}
```

```json
{
  "session_id": "824cb3dc-1200-4601-8044-9dec858a04f0",
  "subject": {
    "type": "CLIENT",
    "id": "163bd31b-465a-41dc-8b34-20572891a5e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjNiZDMxYi00NjVhLTQxZGMtOGIzNC0yMDU3Mjg5MWE1ZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjYzLCJpYXQiOjE3OTMxMjI3NjMsImp0aSI6Ijk1Mjg5MmM0LWIzNDYtNGU0Zi1hOTIyLTYyYzBkZWQxZTc1NSIsInNpZCI6IjgyNGNiM2RjLTEyMDAtNDYwMS04MDQ0LTlkZWM4NThhMDRmMCJ9.IbIARmuYYFJKp8K9Gis5v23c0AQzgwLDmqCOoH7M0EQ",
  "access_expires_at": "2026-10-27T17:54:23.925713701Z",
  "refresh_token": "FssAva0plq2KAUhPp4ssGJ5DaJlLs6qQgo3VXqdu_d4",
  "refresh_expires_at": "2026-11-26T17:39:23.924955733Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "63646e6a-bfbb-480a-8f1f-3f4a5b40c1b5",
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
  "id": "4ca5a6ae-f9c4-4d17-a9ce-ae87ed9dd3c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T17:44:23.963297Z",
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
  "command_id": "4c8a34f7-cfb7-4400-853f-28de8c08c7b0",
  "quote_id": "4ca5a6ae-f9c4-4d17-a9ce-ae87ed9dd3c9",
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
  "id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "163bd31b-465a-41dc-8b34-20572891a5e0",
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
  "created_at": "2026-10-27T17:39:24.002615Z",
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
    "id": "aa1c0dd3-2f8a-41bb-85eb-6159b0c54b5b",
    "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
    "expires_at": "2026-10-27T17:39:39.005929Z",
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

`POST /api/driver/v1/offers/aa1c0dd3-2f8a-41bb-85eb-6159b0c54b5b/accept` → **200**

```json
{
  "command_id": "f21775d5-349f-48a7-9f6f-b914ac1d60c6"
}
```

```json
{
  "id": "9af497d0-8549-43d4-b7b1-a3c933052dea",
  "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "01b8b084-2bd7-4b31-8000-71da560080a4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "01b8b084-2bd7-4b31-8000-71da560080a4",
  "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
  "assignment_id": "9af497d0-8549-43d4-b7b1-a3c933052dea",
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

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:24Z",
    "sequence": 1793122764121
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:24.140581Z",
  "last_location_at": "2026-10-27T17:39:24.140581Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/01b8b084-2bd7-4b31-8000-71da560080a4/arrive` → **200**

```json
{
  "command_id": "c96f17ec-2c34-4b88-9a88-8e096476fb6a",
  "expected_version": 0
}
```

```json
{
  "id": "01b8b084-2bd7-4b31-8000-71da560080a4",
  "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
  "assignment_id": "9af497d0-8549-43d4-b7b1-a3c933052dea",
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
  "arrived_at": "2026-10-27T17:39:24.178817Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/01b8b084-2bd7-4b31-8000-71da560080a4/start` → **200**

```json
{
  "command_id": "273440c0-f95f-474e-9783-c5c181bf643f",
  "expected_version": 1
}
```

```json
{
  "id": "01b8b084-2bd7-4b31-8000-71da560080a4",
  "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
  "assignment_id": "9af497d0-8549-43d4-b7b1-a3c933052dea",
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
  "arrived_at": "2026-10-27T17:39:24.178817Z",
  "started_at": "2026-10-27T17:39:24.221399Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:24Z",
    "sequence": 1793122764248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:24.267043Z",
  "last_location_at": "2026-10-27T17:39:24.267043Z",
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
  "device_ref": "sandbox-11250"
}
```

```json
{
  "challenge_id": "ac321cd9-3340-4a45-9da5-60c7ee56b4ca",
  "expires_at": "2026-10-27T17:44:24.292340561Z",
  "resend_available_at": "2026-10-27T17:39:25.292340561Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "861455",
  "sent_at": "2026-10-27T17:39:24.295112828Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac321cd9-3340-4a45-9da5-60c7ee56b4ca",
  "code": "861455",
  "device_ref": "sandbox-11250"
}
```

```json
{
  "session_id": "f26633a6-8d75-45ae-95e5-e08b20393261",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY2NCwiaWF0IjoxNzkzMTIyNzY0LCJqdGkiOiIxNzk4YWMyNi01ZDE0LTQ5YTItYWExYy02ZWVlMWExODIxOTQiLCJzaWQiOiJmMjY2MzNhNi04ZDc1LTQ1YWUtOTVlNS1lMDhiMjAzOTMyNjEifQ.q_pfuiGtOWYIB309c_Wk9l2hnjo46GDoTnxE2LxC-7E",
  "access_expires_at": "2026-10-27T17:54:24.358094417Z",
  "refresh_token": "eHsKQIKN062Y0tKzTyZooQZWcNhKhs0vQQDEdPbDJHM",
  "refresh_expires_at": "2026-11-26T17:39:24.357381824Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:03.343046Z",
  "last_location_at": "2026-10-27T17:39:03.343046Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cae650f0-26d5-432b-90d8-3deb67365826/handover` → **200**

```json
{
  "command_id": "bdf5fe36-a1d6-4042-a2ac-a2602a8ef817",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:03.343046Z",
  "last_location_at": "2026-10-27T17:39:03.343046Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cae650f0-26d5-432b-90d8-3deb67365826/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:24Z",
    "sequence": 1793122764453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:24.474806Z",
  "last_location_at": "2026-10-27T17:39:24.474806Z",
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
  "session_id": "07d8e7d4-eee0-4d05-b235-bcea56eb39a5",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NjQsImlhdCI6MTc5MzEyMjc2NCwianRpIjoiZGE4MGViOTYtOTIzNi00Njc1LWJhNWQtOWRmM2Q3YjE4ZTg1Iiwic2lkIjoiMDdkOGU3ZDQtZWVlMC00ZDA1LWIyMzUtYmNlYTU2ZWIzOWE1In0.0Arpkwjc-TIv_LfH6dxCIcNkTlgztc72feU1fDnB16g",
  "access_expires_at": "2026-10-27T17:54:24.796580995Z",
  "refresh_token": "_F1S67u9Lo5LdOzLdpKrcV2P-JZOsxCNufd5xcG2dFI",
  "refresh_expires_at": "2026-10-28T05:39:24.795956457Z",
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
  "session_id": "cc8e6eb2-77f6-46ca-a5ad-cce0d3146afc",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NjUsImlhdCI6MTc5MzEyMjc2NSwianRpIjoiMWJiODc2NDEtODhhZS00YWRjLWIzNWYtNDkxMWE0YzZlODcxIiwic2lkIjoiY2M4ZTZlYjItNzdmNi00NmNhLWE1YWQtY2NlMGQzMTQ2YWZjIn0.U27TyUa2Qt7RJvBk8hiWaRSS462B8_PtXUXaMuW9l1Y",
  "access_expires_at": "2026-10-27T17:54:25.117868904Z",
  "refresh_token": "LZFZ-h4e0WOv79Semq2wUjFK0OV786h3rWDLl2fMMZg",
  "refresh_expires_at": "2026-10-28T05:39:25.11718767Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/776ad658-4fc3-407f-9fbd-f7ed77136230` → **200**

```json
{
  "id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "163bd31b-465a-41dc-8b34-20572891a5e0",
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
    "id": "9af497d0-8549-43d4-b7b1-a3c933052dea",
    "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "01b8b084-2bd7-4b31-8000-71da560080a4",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T17:39:24.002615Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/776ad658-4fc3-407f-9fbd-f7ed77136230/interrupt` → **200**

```json
{
  "command_id": "85a89e6c-4926-4748-8298-f6d8ef314979",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "163bd31b-465a-41dc-8b34-20572891a5e0",
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
      "id": "9af497d0-8549-43d4-b7b1-a3c933052dea",
      "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "01b8b084-2bd7-4b31-8000-71da560080a4",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T17:39:24.002615Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "62913333-606a-443a-920b-bd6ae36da8ee",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "163bd31b-465a-41dc-8b34-20572891a5e0",
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
    "id": "61b4aa57-1a14-4f7b-a92d-f7f2dcf9bb2c",
    "order_id": "62913333-606a-443a-920b-bd6ae36da8ee",
    "expires_at": "2026-10-27T17:39:40.211957Z",
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

`POST /api/driver/v1/offers/61b4aa57-1a14-4f7b-a92d-f7f2dcf9bb2c/accept` → **200**

```json
{
  "command_id": "a67cf146-8229-4b25-bb7a-2a00f4b5c5fc"
}
```

```json
{
  "id": "56188097-4597-4089-8c8c-8cdb83021c9e",
  "order_id": "62913333-606a-443a-920b-bd6ae36da8ee",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8d8ac48-ca4d-470e-b48c-9c492eaae01c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8d8ac48-ca4d-470e-b48c-9c492eaae01c",
  "order_id": "62913333-606a-443a-920b-bd6ae36da8ee",
  "assignment_id": "56188097-4597-4089-8c8c-8cdb83021c9e",
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
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:24.474806Z",
  "last_location_at": "2026-10-27T17:39:24.474806Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/cae650f0-26d5-432b-90d8-3deb67365826/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:25Z",
    "sequence": 1793122765364
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:25.384674Z",
  "last_location_at": "2026-10-27T17:39:25.384674Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a8d8ac48-ca4d-470e-b48c-9c492eaae01c/arrive` → **200**

```json
{
  "command_id": "f2c0a25a-dd18-45e8-a206-b2aaf9838f54",
  "expected_version": 0
}
```

```json
{
  "id": "a8d8ac48-ca4d-470e-b48c-9c492eaae01c",
  "order_id": "62913333-606a-443a-920b-bd6ae36da8ee",
  "assignment_id": "56188097-4597-4089-8c8c-8cdb83021c9e",
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
  "arrived_at": "2026-10-27T17:39:25.424999Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8d8ac48-ca4d-470e-b48c-9c492eaae01c/start` → **200**

```json
{
  "command_id": "754b6913-d40a-4458-81cd-4f2c6115dfd1",
  "expected_version": 1
}
```

```json
{
  "id": "a8d8ac48-ca4d-470e-b48c-9c492eaae01c",
  "order_id": "62913333-606a-443a-920b-bd6ae36da8ee",
  "assignment_id": "56188097-4597-4089-8c8c-8cdb83021c9e",
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
  "arrived_at": "2026-10-27T17:39:25.424999Z",
  "started_at": "2026-10-27T17:39:25.467651Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8d8ac48-ca4d-470e-b48c-9c492eaae01c/complete` → **200**

```json
{
  "command_id": "fe9eab34-5a99-417b-a25d-72ef1e28ee2e",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:39:25Z"
}
```

```json
{
  "id": "a8d8ac48-ca4d-470e-b48c-9c492eaae01c",
  "order_id": "62913333-606a-443a-920b-bd6ae36da8ee",
  "assignment_id": "56188097-4597-4089-8c8c-8cdb83021c9e",
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
  "arrived_at": "2026-10-27T17:39:25.424999Z",
  "started_at": "2026-10-27T17:39:25.467651Z",
  "completed_at": "2026-10-27T17:39:25.510285Z",
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
    "id": "62913333-606a-443a-920b-bd6ae36da8ee",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T17:39:25.200063Z",
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
    "id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T17:39:24.002615Z",
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
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
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

`GET /api/operator/v1/orders/776ad658-4fc3-407f-9fbd-f7ed77136230/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T17:39:24.003165Z",
      "actor": {
        "type": "CLIENT",
        "id": "163bd31b-465a-41dc-8b34-20572891a5e0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
        "quote_id": "4ca5a6ae-f9c4-4d17-a9ce-ae87ed9dd3c9",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T17:39:24.005032Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
        "attempt_id": "62563eea-312a-4eef-a9de-35fe345950cf",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T17:39:24.011026Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "aa1c0dd3-2f8a-41bb-85eb-6159b0c54b5b",
        "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T17:39:24.077179Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "aa1c0dd3-2f8a-41bb-85eb-6159b0c54b5b",
        "order_id": "776ad658-4fc3-407f-9fbd-f7ed77136230",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9af497d0-8549-43d4-b7b1-a3c933052dea"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 776ad658-4fc3-407f-9fbd-f7ed77136230, follow-up 62913333-606a-443a-920b-bd6ae36da8ee.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-19309"
}
```

```json
{
  "challenge_id": "72d95d24-84b0-4223-a3b3-41dfea96e25f",
  "expires_at": "2026-10-27T17:44:28.64256202Z",
  "resend_available_at": "2026-10-27T17:39:29.64256202Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "417986",
  "sent_at": "2026-10-27T17:39:28.644896927Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72d95d24-84b0-4223-a3b3-41dfea96e25f",
  "code": "417986",
  "device_ref": "sandbox-19309"
}
```

```json
{
  "session_id": "6d4cce92-b135-4f08-9975-19c850de78dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY2OCwiaWF0IjoxNzkzMTIyNzY4LCJqdGkiOiJiMjBjM2I1YS1iNzA4LTQwNGEtODlkNC04MDY1ZmQxNWMxNTIiLCJzaWQiOiI2ZDRjY2U5Mi1iMTM1LTRmMDgtOTk3NS0xOWM4NTBkZTc4ZGMifQ.0xSI4i-BsWoD_IUPIz5EvNG-tFgwODGF1eNjpbCCY4I",
  "access_expires_at": "2026-10-27T17:54:28.700656304Z",
  "refresh_token": "3i90glYXh-WLzY_yDYRJTQrKFiJpkqoms5GqO7XlmZ0",
  "refresh_expires_at": "2026-11-26T17:39:28.700102538Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:25.384674Z",
  "last_location_at": "2026-10-27T17:39:25.384674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cae650f0-26d5-432b-90d8-3deb67365826/handover` → **200**

```json
{
  "command_id": "e30b0c23-9c4a-4f4e-88ad-61935e672b21",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:25.384674Z",
  "last_location_at": "2026-10-27T17:39:25.384674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cae650f0-26d5-432b-90d8-3deb67365826/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:28Z",
    "sequence": 1793122768785
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:28.804289Z",
  "last_location_at": "2026-10-27T17:39:28.804289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672314594",
  "device_ref": "sandbox-4948"
}
```

```json
{
  "challenge_id": "8b4556da-2d75-4b04-9753-87f4a926b75c",
  "expires_at": "2026-10-27T17:44:28.83258316Z",
  "resend_available_at": "2026-10-27T17:39:29.83258316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672314594` → **200**

```json
{
  "phone": "+380672314594",
  "audience": "CLIENT",
  "code": "603933",
  "sent_at": "2026-10-27T17:39:28.834830305Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b4556da-2d75-4b04-9753-87f4a926b75c",
  "code": "603933",
  "device_ref": "sandbox-4948"
}
```

```json
{
  "session_id": "86d6919a-e4cb-4ed9-86c1-c1dc2a13a1fd",
  "subject": {
    "type": "CLIENT",
    "id": "9374cc5f-00d3-4341-862d-3ddd4668c286"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Mzc0Y2M1Zi0wMGQzLTQzNDEtODYyZC0zZGRkNDY2OGMyODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjY4LCJpYXQiOjE3OTMxMjI3NjgsImp0aSI6IjZiYzg4YzM2LTZkOGEtNDZhOC04ZmUwLTNiZWY4ZDY5NDI1ZiIsInNpZCI6Ijg2ZDY5MTlhLWU0Y2ItNGVkOS04NmMxLWMxZGMyYTEzYTFmZCJ9.q4sagnTy4ZX067KSvlHNZlCN5GmA1vLz5PV57HRfMc8",
  "access_expires_at": "2026-10-27T17:54:28.891064858Z",
  "refresh_token": "lffBPJx-SSn6avjQWct8N9Hon4mk3BdGqD3NkkD_VaY",
  "refresh_expires_at": "2026-11-26T17:39:28.890436094Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c141e961-d940-462f-b12a-f48c0b7a8629",
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
  "id": "f1f67b79-7e66-4e8e-959f-cfa6372cce61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:44:28.926276Z",
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
  "command_id": "da003fe0-3ede-4c47-bec3-1d148719577c",
  "quote_id": "f1f67b79-7e66-4e8e-959f-cfa6372cce61",
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
    "phone": "+380675056562"
  }
}
```

```json
{
  "id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:28.967139Z",
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
    "id": "0eb618e4-2d50-4238-8175-55c867882f13",
    "order_id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
    "expires_at": "2026-10-27T17:39:43.972175Z",
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

`POST /api/driver/v1/offers/0eb618e4-2d50-4238-8175-55c867882f13/accept` → **200**

```json
{
  "command_id": "7694e557-b5c9-4410-8dea-0c06da11c4af"
}
```

```json
{
  "id": "18c46cf7-9a2f-43d7-ad58-ad651750e557",
  "order_id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea4fc0c2-6e5a-46ce-bc4b-f0f9421e13be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea4fc0c2-6e5a-46ce-bc4b-f0f9421e13be",
  "order_id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
  "assignment_id": "18c46cf7-9a2f-43d7-ad58-ad651750e557",
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
    "phone": "+380675056562"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "79755067-92bc-4a4a-ad83-39c156955d56",
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
  "id": "d1d4033b-0234-4c74-b0ba-8ea021c8d482",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:44:29.117780Z",
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
  "command_id": "2ec27ec4-9ced-449e-a59a-29c977ac0c98",
  "quote_id": "d1d4033b-0234-4c74-b0ba-8ea021c8d482",
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
  "id": "334c5127-3423-4320-8ff4-2c3cfeaf880a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:29.156229Z",
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
  "command_id": "00222da3-ed22-4355-926e-7084eb5fef8c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T20:39:29Z"
}
```

```json
{
  "id": "9ad370d4-caa3-4bad-a767-9cd0ac3d61c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:44:29.207111Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T20:39:29Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "55918eea-b128-4315-b8c5-5960ec53c4ca",
  "quote_id": "9ad370d4-caa3-4bad-a767-9cd0ac3d61c0",
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
  "pickup_at": "2026-10-27T20:39:29Z"
}
```

```json
{
  "id": "41ac7c1e-8aa9-4a32-a207-da5ecbb0b541",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:29.249428Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:39:29Z",
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
  "command_id": "b753815a-c6b4-49e9-ab59-2d7e6f16085c",
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
  "id": "a87c3649-bb90-4b0c-bead-fa9163dd960f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:44:29.292029Z",
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
  "command_id": "b71bb5c0-6478-4283-a8af-3e60d0eaeb83",
  "quote_id": "a87c3649-bb90-4b0c-bead-fa9163dd960f",
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
  "correlation_id": "4a94bf98-b300-4506-ad53-2292d4c3b7cc"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "41ac7c1e-8aa9-4a32-a207-da5ecbb0b541",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
      "created_at": "2026-10-27T17:39:29.249428Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T20:39:29Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "334c5127-3423-4320-8ff4-2c3cfeaf880a",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
      "created_at": "2026-10-27T17:39:29.156229Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "334c5127-3423-4320-8ff4-2c3cfeaf880a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:29.156229Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/7dc83bf0-9aed-42c4-abc6-41da9a17a424` → **200**

```json
{
  "id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
    "id": "18c46cf7-9a2f-43d7-ad58-ad651750e557",
    "order_id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ea4fc0c2-6e5a-46ce-bc4b-f0f9421e13be",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T17:39:28.967139Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7dc83bf0-9aed-42c4-abc6-41da9a17a424/cancel` → **200**

```json
{
  "command_id": "bc0051f6-61cc-4939-b01e-7b70fc805792",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
    "id": "18c46cf7-9a2f-43d7-ad58-ad651750e557",
    "order_id": "7dc83bf0-9aed-42c4-abc6-41da9a17a424",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ea4fc0c2-6e5a-46ce-bc4b-f0f9421e13be",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T17:39:28.967139Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/334c5127-3423-4320-8ff4-2c3cfeaf880a` → **200**

```json
{
  "id": "334c5127-3423-4320-8ff4-2c3cfeaf880a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:29.156229Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/334c5127-3423-4320-8ff4-2c3cfeaf880a/cancel` → **200**

```json
{
  "command_id": "551bf150-a15a-4042-b9c1-49663745a75a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "334c5127-3423-4320-8ff4-2c3cfeaf880a",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:29.156229Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/41ac7c1e-8aa9-4a32-a207-da5ecbb0b541` → **200**

```json
{
  "id": "41ac7c1e-8aa9-4a32-a207-da5ecbb0b541",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:29.249428Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:39:29Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/41ac7c1e-8aa9-4a32-a207-da5ecbb0b541/cancel` → **200**

```json
{
  "command_id": "b78eb016-2e91-4bcc-96c8-10f95013dee2",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "41ac7c1e-8aa9-4a32-a207-da5ecbb0b541",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9374cc5f-00d3-4341-862d-3ddd4668c286",
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
  "created_at": "2026-10-27T17:39:29.249428Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-27T20:39:29Z",
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
  "session_id": "cae650f0-26d5-432b-90d8-3deb67365826",
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
  "last_heartbeat_at": "2026-10-27T17:39:28.804289Z",
  "last_location_at": "2026-10-27T17:39:28.804289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cae650f0-26d5-432b-90d8-3deb67365826/close` → **200**

```json
{
  "command_id": "0c2b985a-b501-4191-a443-21a3ae4a2f4a",
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

Done: orders 7dc83bf0-9aed-42c4-abc6-41da9a17a424, 334c5127-3423-4320-8ff4-2c3cfeaf880a, 41ac7c1e-8aa9-4a32-a207-da5ecbb0b541.

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
  "session_id": "97d7d9dc-e74d-43dd-bae5-c157735e5706",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NjksImlhdCI6MTc5MzEyMjc2OSwianRpIjoiYTI1YjEyNWYtZGM5Yy00OGFlLWE2NWMtMTFhN2Q5ZThjOWE5Iiwic2lkIjoiOTdkN2Q5ZGMtZTc0ZC00M2RkLWJhZTUtYzE1NzczNWU1NzA2In0.lXjJUChQ5_PFZ09UDkiDvC_l1oC0S9EWYWCDNPptfdA",
  "access_expires_at": "2026-10-27T17:54:29.979912887Z",
  "refresh_token": "04DtwVah-oZnMgrU6oEAPtdkzgDeEvW80o7kkwSOM5s",
  "refresh_expires_at": "2026-10-28T05:39:29.979170387Z",
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
  "session_id": "7b3499c1-e488-4029-9d3a-f80af87ad4e5",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzAsImlhdCI6MTc5MzEyMjc3MCwianRpIjoiNmJlYjM0YzMtYzc4NS00YTdhLTg2OTMtMzNjMTM5MGVjZWRhIiwic2lkIjoiN2IzNDk5YzEtZTQ4OC00MDI5LTlkM2EtZjgwYWY4N2FkNGU1In0.m6rXU5gyVeGdQ-ysZJ4eMbVZ-x_CQ5al2zeWRym9dFY",
  "access_expires_at": "2026-10-27T17:54:30.302670922Z",
  "refresh_token": "YTRAfKLHLTwSYJ-1UKT-DJUm_6ucrXrt93pGHnU4E38",
  "refresh_expires_at": "2026-10-28T05:39:30.302133276Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6837"
}
```

```json
{
  "challenge_id": "d9238f0e-90ae-443a-aa3b-7706aae1aaed",
  "expires_at": "2026-10-27T17:44:30.327986309Z",
  "resend_available_at": "2026-10-27T17:39:31.327986309Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "976706",
  "sent_at": "2026-10-27T17:39:30.330164997Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9238f0e-90ae-443a-aa3b-7706aae1aaed",
  "code": "976706",
  "device_ref": "sandbox-6837"
}
```

```json
{
  "session_id": "32746ee7-17ab-4dae-b900-a56f6629205d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY3MCwiaWF0IjoxNzkzMTIyNzcwLCJqdGkiOiJiMTA3NjIyOS04OTk3LTQxNjEtYmY4MS04YzZjNjFhNjZlMTciLCJzaWQiOiIzMjc0NmVlNy0xN2FiLTRkYWUtYjkwMC1hNTZmNjYyOTIwNWQifQ.XxixvoT9UJvjeVIfHcbiufKr1EkGV29m9fQ2YPIPnNo",
  "access_expires_at": "2026-10-27T17:54:30.387153711Z",
  "refresh_token": "GRqosRv4TgW1o1RLH1ug7NRYlcV6t9zVeKXrEycCYNs",
  "refresh_expires_at": "2026-11-26T17:39:30.386594524Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:24.267043Z",
  "last_location_at": "2026-10-27T17:39:24.267043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/handover` → **200**

```json
{
  "command_id": "a327948a-4745-4caf-8995-fe319945f049",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:24.267043Z",
  "last_location_at": "2026-10-27T17:39:24.267043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:30Z",
    "sequence": 1793122770474
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:30.493255Z",
  "last_location_at": "2026-10-27T17:39:30.493255Z",
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
  "command_id": "2011595b-de31-4759-9152-8781fbce66e8",
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
  "effective_at": "2026-10-27T17:39:30.580868Z",
  "changed_by": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T17:39:30.619290572Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ceef9fc8-db06-4cbe-b25a-25b5a407f416",
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
  "id": "541649e1-b41c-4ac5-bacd-daed20b49dee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T17:44:30.689495Z",
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
  "command_id": "90508d8e-8fe1-4075-8b53-75b8cba3cd21",
  "quote_id": "541649e1-b41c-4ac5-bacd-daed20b49dee",
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
    "phone": "+380671116813"
  }
}
```

```json
{
  "id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
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
  "created_at": "2026-10-27T17:39:30.746457Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116813"
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
    "id": "e08a300b-eea5-4850-b689-3b397b530429",
    "order_id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
    "expires_at": "2026-10-27T17:39:45.751691Z",
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

`POST /api/driver/v1/offers/e08a300b-eea5-4850-b689-3b397b530429/accept` → **200**

```json
{
  "command_id": "9cf46119-5e70-4ab8-ad5f-d9508b62c9bc"
}
```

```json
{
  "id": "801b7b74-4016-4663-8605-fd29c6692ddd",
  "order_id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "73a08ffe-d2a4-4fad-ac09-24d44b14c985",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "73a08ffe-d2a4-4fad-ac09-24d44b14c985",
  "order_id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
  "assignment_id": "801b7b74-4016-4663-8605-fd29c6692ddd",
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
    "phone": "+380671116813"
  }
}
```

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:30Z",
    "sequence": 1793122770863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:30.883155Z",
  "last_location_at": "2026-10-27T17:39:30.883155Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/73a08ffe-d2a4-4fad-ac09-24d44b14c985/arrive` → **200**

```json
{
  "command_id": "ca5fc169-1076-454c-8cf4-3f1fa7a486cd",
  "expected_version": 0
}
```

```json
{
  "id": "73a08ffe-d2a4-4fad-ac09-24d44b14c985",
  "order_id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
  "assignment_id": "801b7b74-4016-4663-8605-fd29c6692ddd",
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
  "arrived_at": "2026-10-27T17:39:30.923471Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671116813"
  }
}
```

`POST /api/driver/v1/trips/73a08ffe-d2a4-4fad-ac09-24d44b14c985/start` → **200**

```json
{
  "command_id": "614e24c2-d0b7-44f3-b24d-746518689e66",
  "expected_version": 1
}
```

```json
{
  "id": "73a08ffe-d2a4-4fad-ac09-24d44b14c985",
  "order_id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
  "assignment_id": "801b7b74-4016-4663-8605-fd29c6692ddd",
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
  "arrived_at": "2026-10-27T17:39:30.923471Z",
  "started_at": "2026-10-27T17:39:30.966708Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671116813"
  }
}
```

`POST /api/driver/v1/trips/73a08ffe-d2a4-4fad-ac09-24d44b14c985/complete` → **200**

```json
{
  "command_id": "143aecf8-5d7f-4019-a313-dda31cf6f85a",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:39:31Z",
  "cash_received": true
}
```

```json
{
  "id": "73a08ffe-d2a4-4fad-ac09-24d44b14c985",
  "order_id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
  "assignment_id": "801b7b74-4016-4663-8605-fd29c6692ddd",
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
  "arrived_at": "2026-10-27T17:39:30.923471Z",
  "started_at": "2026-10-27T17:39:30.966708Z",
  "completed_at": "2026-10-27T17:39:31.021264Z",
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
  "command_id": "88972d47-49a8-41f3-a9ac-f97fb84d1508",
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
  "id": "91155c26-7c95-4485-84c1-61221e7d6741",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T17:44:31.070087Z",
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
  "command_id": "d0ce4dd0-9bce-4438-b90d-6bc7a50b40fa",
  "quote_id": "91155c26-7c95-4485-84c1-61221e7d6741",
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
    "phone": "+3806711127018"
  }
}
```

```json
{
  "id": "bed256c4-0e9d-4bd4-bb13-88b5cdac6390",
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
  "created_at": "2026-10-27T17:39:31.109363Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127018"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/bed256c4-0e9d-4bd4-bb13-88b5cdac6390` → **200**

```json
{
  "id": "bed256c4-0e9d-4bd4-bb13-88b5cdac6390",
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
  "created_at": "2026-10-27T17:39:31.109363Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127018"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bed256c4-0e9d-4bd4-bb13-88b5cdac6390/cancel` → **200**

```json
{
  "command_id": "b6d0ce8e-d140-4925-ac20-f508a4cf6ef8",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "bed256c4-0e9d-4bd4-bb13-88b5cdac6390",
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
  "created_at": "2026-10-27T17:39:31.109363Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127018"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
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
  "staff_id": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T17:39:31.028504Z",
  "last_entries": [
    {
      "order_id": "bed256c4-0e9d-4bd4-bb13-88b5cdac6390",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T17:39:31.183792Z"
    },
    {
      "order_id": "4030e7bf-6777-459d-9628-d2b5ea9ca82c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T17:39:31.028504Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1260cde-af69-446a-9f46-f41c4cfd9e43",
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
  "last_heartbeat_at": "2026-10-27T17:39:30.883155Z",
  "last_location_at": "2026-10-27T17:39:30.883155Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1260cde-af69-446a-9f46-f41c4cfd9e43/close` → **200**

```json
{
  "command_id": "42f1f1cd-5a8b-4531-b5ff-a7702a3cc01f",
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

Done: operator bonus for fulfilled 4030e7bf-6777-459d-9628-d2b5ea9ca82c and operator-fault cancellation bed256c4-0e9d-4bd4-bb13-88b5cdac6390.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638663442",
  "device_ref": "sandbox-1895"
}
```

```json
{
  "challenge_id": "ba51e9b1-e0b5-465a-87b0-fc365be74a74",
  "expires_at": "2026-10-27T17:44:33.341029966Z",
  "resend_available_at": "2026-10-27T17:39:34.341029966Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638663442` → **200**

```json
{
  "phone": "+380638663442",
  "audience": "CLIENT",
  "code": "921329",
  "sent_at": "2026-10-27T17:39:33.343240303Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba51e9b1-e0b5-465a-87b0-fc365be74a74",
  "code": "921329",
  "device_ref": "sandbox-1895"
}
```

```json
{
  "session_id": "b0cf753b-bb88-413d-a8c1-49c82eeea3a1",
  "subject": {
    "type": "CLIENT",
    "id": "259089d2-dd2b-42f1-8fce-689cbb5eac70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTkwODlkMi1kZDJiLTQyZjEtOGZjZS02ODljYmI1ZWFjNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjczLCJpYXQiOjE3OTMxMjI3NzMsImp0aSI6ImJjMDc3NTY4LTEwOTUtNDI5YS1iNTI4LTRmMDUzODQzOGJiYiIsInNpZCI6ImIwY2Y3NTNiLWJiODgtNDEzZC1hOGMxLTQ5YzgyZWVlYTNhMSJ9.HCnV7dkxiZTiw9VLj7tkdWjjwSkCXDqMwyTMQ3UwvN8",
  "access_expires_at": "2026-10-27T17:54:33.399449734Z",
  "refresh_token": "59iD2djZY07r_Lr2EsD0FbAcNgyTXGQpGtbbbtmGNek",
  "refresh_expires_at": "2026-11-26T17:39:33.398928338Z",
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
  "session_id": "4dc8b2cd-5cee-42be-ac41-ab493e831a75",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzMsImlhdCI6MTc5MzEyMjc3MywianRpIjoiOTc1NDE5NzctYjM1My00MWU1LWI2NzItMjk2YWNjZjY4ZTFhIiwic2lkIjoiNGRjOGIyY2QtNWNlZS00MmJlLWFjNDEtYWI0OTNlODMxYTc1In0.OzmscEuHFRLjOhy0dIQ-oGRIbPXVr3KLNi6Gm4ediys",
  "access_expires_at": "2026-10-27T17:54:33.801387405Z",
  "refresh_token": "q3Q8Pl2oOhmfti2UfWAXc9sa1WlkSbZm-RA_OvbbHpI",
  "refresh_expires_at": "2026-10-28T05:39:33.800838669Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638663442` → **200**

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
  "correlation_id": "a9edea6e-1405-4bc3-a215-bd38aac2c7f6"
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
  "session_id": "c033426b-28e4-497b-b386-843431d8bef7",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzQsImlhdCI6MTc5MzEyMjc3NCwianRpIjoiZGM5NjJjMzQtOTVkNC00N2UxLThhMjktMzkzNzJiOWQ3ZTQyIiwic2lkIjoiYzAzMzQyNmItMjhlNC00OTdiLWIzODYtODQzNDMxZDhiZWY3In0.TOdc-qaQODKOb1IEhdBzJMFdK86SGeKlW1QiKDPUO0g",
  "access_expires_at": "2026-10-27T17:54:34.197167536Z",
  "refresh_token": "Z0b3YQ2B80-KZTUipYKw_fQv2A96qNm4AkMUEABLLgM",
  "refresh_expires_at": "2026-10-28T05:39:34.196443215Z",
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
  "command_id": "2029c463-45bf-4711-b224-f12733cfb4a6",
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
  "changed_by": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T17:39:34.271201207Z"
}
```

## The rider books the airport for 2026-10-27T20:39:33Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600261053",
  "device_ref": "sandbox-17292"
}
```

```json
{
  "challenge_id": "0b3e19da-ea6c-4fe4-bff7-5e24ab77e532",
  "expires_at": "2026-10-27T17:44:34.30458268Z",
  "resend_available_at": "2026-10-27T17:39:35.30458268Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600261053` → **200**

```json
{
  "phone": "+48600261053",
  "audience": "CLIENT",
  "code": "619954",
  "sent_at": "2026-10-27T17:39:34.306873936Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b3e19da-ea6c-4fe4-bff7-5e24ab77e532",
  "code": "619954",
  "device_ref": "sandbox-17292"
}
```

```json
{
  "session_id": "50c4f322-eaff-4bac-8421-a58821828400",
  "subject": {
    "type": "CLIENT",
    "id": "044ffc73-27ab-4774-ad6a-e1555677a2d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDRmZmM3My0yN2FiLTQ3NzQtYWQ2YS1lMTU1NTY3N2EyZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjc0LCJpYXQiOjE3OTMxMjI3NzQsImp0aSI6Ijc0Yjc3MTgzLWQ4YjItNGMwZi1iYjBiLThmMzZkMWJlMTVlNiIsInNpZCI6IjUwYzRmMzIyLWVhZmYtNGJhYy04NDIxLWE1ODgyMTgyODQwMCJ9.X43AoVZ5_L1w4ukK5tdn8Vv8kydK3Ft1uoufa5RQyq4",
  "access_expires_at": "2026-10-27T17:54:34.362419545Z",
  "refresh_token": "Tnte54Y--2YPWci5799TY7brc--b0xUkQGO69tYXxl0",
  "refresh_expires_at": "2026-11-26T17:39:34.361815825Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d5b44c19-e6d2-46d2-b05a-ddafd39e6ed2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T20:39:33Z"
}
```

```json
{
  "id": "28b16db9-e3e3-4570-95c1-73f012f164c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T17:44:34.397888Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T20:39:33Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e1382256-cebd-4906-8bc7-f93268bfa63b",
  "quote_id": "28b16db9-e3e3-4570-95c1-73f012f164c0",
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
  "pickup_at": "2026-10-27T20:39:33Z"
}
```

```json
{
  "id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "044ffc73-27ab-4774-ad6a-e1555677a2d3",
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
  "created_at": "2026-10-27T17:39:34.436405Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T20:39:33Z",
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
  "device_ref": "sandbox-24498"
}
```

```json
{
  "challenge_id": "44257640-1900-43cf-9e50-d0a5ea77771e",
  "expires_at": "2026-10-27T17:44:34.4703013Z",
  "resend_available_at": "2026-10-27T17:39:35.4703013Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "586599",
  "sent_at": "2026-10-27T17:39:34.472529932Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44257640-1900-43cf-9e50-d0a5ea77771e",
  "code": "586599",
  "device_ref": "sandbox-24498"
}
```

```json
{
  "session_id": "db18b885-2d49-48f9-89fb-93243a08f500",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY3NCwiaWF0IjoxNzkzMTIyNzc0LCJqdGkiOiI1MTJhOGJkYS02MWRiLTQ2MzgtYjQ1ZS1jNGM4MjZlMzNhMjkiLCJzaWQiOiJkYjE4Yjg4NS0yZDQ5LTQ4ZjktODlmYi05MzI0M2EwOGY1MDAifQ.wRTSMaZLXzCCcJvGKBAVJ-VMyNdjrbokk0EKV0eAtqI",
  "access_expires_at": "2026-10-27T17:54:34.536021923Z",
  "refresh_token": "9Z-oosJDRPFiF4rV7F48bh4FEuIrClYGYwvvAOneyqU",
  "refresh_expires_at": "2026-11-26T17:39:34.535314958Z",
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
  "command_id": "b33bd5a3-6a20-474f-8956-981223f31c4b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:34Z",
    "sequence": 1793122774593
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5",
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
  "last_heartbeat_at": "2026-10-27T17:39:34.611393Z",
  "last_location_at": "2026-10-27T17:39:34.611393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
      "short_number": 13,
      "pickup_at": "2026-10-27T20:39:33Z",
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

`POST /api/driver/v1/preorders/d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7/reserve` → **200**

```json
{
  "command_id": "4cd6524a-b1e9-4aab-ba75-3ca5a3ac6039"
}
```

```json
{
  "id": "02a75d5b-4469-4cf4-8dd3-fe6a17d33455",
  "state": "RESERVED",
  "order": {
    "order_id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
    "short_number": 13,
    "pickup_at": "2026-10-27T20:39:33Z",
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
  "reserved_at": "2026-10-27T17:39:34.683603Z",
  "confirm_from": "2026-10-27T20:09:33Z",
  "confirm_until": "2026-10-27T20:19:33Z",
  "drop_until": "2026-10-27T19:39:33Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "02a75d5b-4469-4cf4-8dd3-fe6a17d33455",
      "state": "RESERVED",
      "order": {
        "order_id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
        "short_number": 13,
        "pickup_at": "2026-10-27T20:39:33Z",
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
      "reserved_at": "2026-10-27T17:39:34.683603Z",
      "confirm_from": "2026-10-27T20:09:33Z",
      "confirm_until": "2026-10-27T20:19:33Z",
      "drop_until": "2026-10-27T19:39:33Z"
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
      "id": "02a75d5b-4469-4cf4-8dd3-fe6a17d33455",
      "state": "RESERVED",
      "order": {
        "order_id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
        "short_number": 13,
        "pickup_at": "2026-10-27T20:39:33Z",
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
      "reserved_at": "2026-10-27T17:39:34.683603Z",
      "confirm_from": "2026-10-27T20:09:33Z",
      "confirm_until": "2026-10-27T20:19:33Z",
      "drop_until": "2026-10-27T19:39:33Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/02a75d5b-4469-4cf4-8dd3-fe6a17d33455/confirm` → **409**

```json
{
  "command_id": "3cf0fe6b-4269-43c2-accf-4e38de5709d7"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/02a75d5b-4469-4cf4-8dd3-fe6a17d33455/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0573c799-8ecc-4e37-a546-0c59ae52db78"
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
  "session_id": "2bbfea54-1ecc-4bcc-8e26-7193c46149ec",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzUsImlhdCI6MTc5MzEyMjc3NSwianRpIjoiZDU1MWU3YzgtODRiOC00Mzg0LWIxMmUtZWU3ZTZjN2YyOTc4Iiwic2lkIjoiMmJiZmVhNTQtMWVjYy00YmNjLThlMjYtNzE5M2M0NjE0OWVjIn0.yyAYv4hzsQA2lH3DCs3wKnimDl4pf38xs7hSsj7vR_4",
  "access_expires_at": "2026-10-27T17:54:35.091319213Z",
  "refresh_token": "znYSfFsesX8tvf-J6ijAqfKMZurk_bHK5DRP1crZImk",
  "refresh_expires_at": "2026-10-28T05:39:35.090697139Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7` → **200**

```json
{
  "id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "044ffc73-27ab-4774-ad6a-e1555677a2d3",
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
  "created_at": "2026-10-27T17:39:34.436405Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T20:39:33Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "02a75d5b-4469-4cf4-8dd3-fe6a17d33455",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T17:39:34.683603Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T17:39:34.437825Z",
      "actor": {
        "type": "CLIENT",
        "id": "044ffc73-27ab-4774-ad6a-e1555677a2d3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
        "preorder": true,
        "quote_id": "28b16db9-e3e3-4570-95c1-73f012f164c0",
        "pickup_at": "2026-10-27T20:39:33Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T17:39:34.684773Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "02a75d5b-4469-4cf4-8dd3-fe6a17d33455"
      }
    }
  ]
}
```

Done: pre-order d1febb3a-d8b6-4d8a-a62b-afa04a4ac6a7, reservation 02a75d5b-4469-4cf4-8dd3-fe6a17d33455.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22928"
}
```

```json
{
  "challenge_id": "68b1cb40-6a40-43a3-af6d-4874b386db69",
  "expires_at": "2026-10-27T17:44:35.183893023Z",
  "resend_available_at": "2026-10-27T17:39:36.183893023Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "199470",
  "sent_at": "2026-10-27T17:39:35.18621483Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68b1cb40-6a40-43a3-af6d-4874b386db69",
  "code": "199470",
  "device_ref": "sandbox-22928"
}
```

```json
{
  "session_id": "6ba23984-d5d1-4c75-9e0d-9d92f79b9029",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY3NSwiaWF0IjoxNzkzMTIyNzc1LCJqdGkiOiI0ZTRhOWNmZi1iYzUxLTRmOWUtYTJiNC1kNDVkZWZlOGJlOTgiLCJzaWQiOiI2YmEyMzk4NC1kNWQxLTRjNzUtOWUwZC05ZDkyZjc5YjkwMjkifQ.X2UujMzJaPzTHqwWpXsPdZ4rhaKIaqx69Kwgev4AILk",
  "access_expires_at": "2026-10-27T17:54:35.243126724Z",
  "refresh_token": "haPRxnRHM3GY9Rlx4ZsTtu_bm6UOcNwnUlIj5tK-BNk",
  "refresh_expires_at": "2026-11-26T17:39:35.242546859Z",
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
  "command_id": "3ebbdab2-3251-4582-8ef5-5df12fa115b7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:35Z",
    "sequence": 1793122775294
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c53754c9-eef5-49b3-b635-dd91ffd14010",
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
  "last_heartbeat_at": "2026-10-27T17:39:35.312598Z",
  "last_location_at": "2026-10-27T17:39:35.312598Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677606947",
  "device_ref": "sandbox-4708"
}
```

```json
{
  "challenge_id": "59ee438b-b86f-4b81-9f6e-872cf2cc3ac9",
  "expires_at": "2026-10-27T17:44:35.343049167Z",
  "resend_available_at": "2026-10-27T17:39:36.343049167Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677606947` → **200**

```json
{
  "phone": "+380677606947",
  "audience": "CLIENT",
  "code": "421208",
  "sent_at": "2026-10-27T17:39:35.345330385Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59ee438b-b86f-4b81-9f6e-872cf2cc3ac9",
  "code": "421208",
  "device_ref": "sandbox-4708"
}
```

```json
{
  "session_id": "c2cd8c01-3d8a-4cd8-a387-abd18dd84b52",
  "subject": {
    "type": "CLIENT",
    "id": "0ef80c08-571b-4814-81af-c19f6ec1937c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZWY4MGMwOC01NzFiLTQ4MTQtODFhZi1jMTlmNmVjMTkzN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjc1LCJpYXQiOjE3OTMxMjI3NzUsImp0aSI6IjFkMDhlYmMyLTMzOTItNGQ2Yy04MTE3LTU5YmMxNmI2ZjU4MyIsInNpZCI6ImMyY2Q4YzAxLTNkOGEtNGNkOC1hMzg3LWFiZDE4ZGQ4NGI1MiJ9.HUJVfqGgblcUGDtr_BtQG0EuciwcexV9JUKqCVXZ7F0",
  "access_expires_at": "2026-10-27T17:54:35.400679498Z",
  "refresh_token": "Gb4Wg9qiPUV-m6a-wW5OTjLz2tmGcy-RLjNPQq-EJvg",
  "refresh_expires_at": "2026-11-26T17:39:35.400015794Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db6422f0-cd6e-4058-bd4c-b4f852081a47",
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
  "id": "3cd2ea09-69c1-48ca-99cb-18e37c1e050e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T17:44:35.437983Z",
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
  "command_id": "32158dca-5cd3-4b43-ac84-58c54ca3635d",
  "quote_id": "3cd2ea09-69c1-48ca-99cb-18e37c1e050e",
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
  "id": "38757c31-e242-4faa-a298-c112820dc74a",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0ef80c08-571b-4814-81af-c19f6ec1937c",
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
  "created_at": "2026-10-27T17:39:35.475019Z",
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
    "id": "24f90242-9a7f-4e4d-96fc-a61b82a87cca",
    "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
    "expires_at": "2026-10-27T17:39:50.478222Z",
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

`POST /api/driver/v1/offers/24f90242-9a7f-4e4d-96fc-a61b82a87cca/accept` → **200**

```json
{
  "command_id": "08ed0819-d8d2-4c60-bbe6-678093c27edb"
}
```

```json
{
  "id": "d5262d55-b90d-4f83-900c-77d1d090b7d4",
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c687e814-7ee8-4351-8376-1895c8209c60",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c687e814-7ee8-4351-8376-1895c8209c60",
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "assignment_id": "d5262d55-b90d-4f83-900c-77d1d090b7d4",
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

`POST /api/driver/v1/work-sessions/c53754c9-eef5-49b3-b635-dd91ffd14010/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:35Z",
    "sequence": 1793122775582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c53754c9-eef5-49b3-b635-dd91ffd14010",
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
  "last_heartbeat_at": "2026-10-27T17:39:35.602201Z",
  "last_location_at": "2026-10-27T17:39:35.602201Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c687e814-7ee8-4351-8376-1895c8209c60",
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "assignment_id": "d5262d55-b90d-4f83-900c-77d1d090b7d4",
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

`POST /api/driver/v1/trips/c687e814-7ee8-4351-8376-1895c8209c60/arrive` → **200**

```json
{
  "command_id": "3f5a2d55-5a46-436c-ac5b-24ead83ce9ff",
  "expected_version": 0
}
```

```json
{
  "id": "c687e814-7ee8-4351-8376-1895c8209c60",
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "assignment_id": "d5262d55-b90d-4f83-900c-77d1d090b7d4",
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
  "arrived_at": "2026-10-27T17:39:35.655512Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c687e814-7ee8-4351-8376-1895c8209c60/start` → **200**

```json
{
  "command_id": "ef060293-1e08-4f90-9f4a-991b5e1afcc7",
  "expected_version": 1
}
```

```json
{
  "id": "c687e814-7ee8-4351-8376-1895c8209c60",
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "assignment_id": "d5262d55-b90d-4f83-900c-77d1d090b7d4",
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
  "arrived_at": "2026-10-27T17:39:35.655512Z",
  "started_at": "2026-10-27T17:39:35.690276Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c53754c9-eef5-49b3-b635-dd91ffd14010/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:35Z",
    "sequence": 1793122775714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c53754c9-eef5-49b3-b635-dd91ffd14010",
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
  "last_heartbeat_at": "2026-10-27T17:39:35.733229Z",
  "last_location_at": "2026-10-27T17:39:35.733229Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/c687e814-7ee8-4351-8376-1895c8209c60/complete` → **200**

```json
{
  "command_id": "76d8d25a-2d35-4c12-9560-fcb4fc1e4e97",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:39:35Z",
  "cash_received": true
}
```

```json
{
  "id": "c687e814-7ee8-4351-8376-1895c8209c60",
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "assignment_id": "d5262d55-b90d-4f83-900c-77d1d090b7d4",
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
  "arrived_at": "2026-10-27T17:39:35.655512Z",
  "started_at": "2026-10-27T17:39:35.690276Z",
  "completed_at": "2026-10-27T17:39:35.767343Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/38757c31-e242-4faa-a298-c112820dc74a/rating` → **200**

```json
{
  "command_id": "37d051cb-7f0d-454d-91a9-b48fad57f87f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "score": 5,
  "created_at": "2026-10-27T17:39:35.816673031Z"
}
```

`POST /api/driver/v1/orders/38757c31-e242-4faa-a298-c112820dc74a/rating` → **200**

```json
{
  "command_id": "39add85c-0d79-4af1-ac69-9647e929aa68",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
  "score": 4,
  "created_at": "2026-10-27T17:39:35.852122015Z"
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
  "session_id": "9ff75502-8502-459a-9d31-f84e3254e675",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzYsImlhdCI6MTc5MzEyMjc3NiwianRpIjoiZWNjYWI1YzktNmEwZi00OGM3LTk0YzUtOWZiNjIxZmE5ZjRiIiwic2lkIjoiOWZmNzU1MDItODUwMi00NTlhLTlkMzEtZjg0ZTMyNTRlNjc1In0.AOpo5mX5vh7H-EIiGTF9SjvYRzp3Pewz8vmIeimVw7U",
  "access_expires_at": "2026-10-27T17:54:36.212546216Z",
  "refresh_token": "bhXKERoQ4wW94Xp03aZUP2pevu-xnnO-wT9MNm3ka0M",
  "refresh_expires_at": "2026-10-28T05:39:36.211909825Z",
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
  "session_id": "ef127006-b824-42b5-a9f5-a9bc603a20b3",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzYsImlhdCI6MTc5MzEyMjc3NiwianRpIjoiODA2N2VmYjQtMDA2NS00MjUxLThmMzYtNTg5N2Q4MjFmZTNmIiwic2lkIjoiZWYxMjcwMDYtYjgyNC00MmI1LWE5ZjUtYTliYzYwM2EyMGIzIn0.WYy4TgB6DCoU_iKaOE0DaHlQ8j7x_bo0JGKpFASxQKs",
  "access_expires_at": "2026-10-27T17:54:36.532019851Z",
  "refresh_token": "dQA8cOruoqeiR0l9vZCZTfgN3_sYKSgfUMHbIOu7O-4",
  "refresh_expires_at": "2026-10-28T05:39:36.531392244Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/38757c31-e242-4faa-a298-c112820dc74a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
      "author_type": "RIDER",
      "author_id": "0ef80c08-571b-4814-81af-c19f6ec1937c",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T17:39:35.816673Z"
    },
    {
      "order_id": "38757c31-e242-4faa-a298-c112820dc74a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "0ef80c08-571b-4814-81af-c19f6ec1937c",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T17:39:35.852122Z"
    }
  ]
}
```

Done: ratings for order 38757c31-e242-4faa-a298-c112820dc74a.

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
  "session_id": "9e867dfc-8e41-4a0c-af65-4bcf612394b0",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzYsImlhdCI6MTc5MzEyMjc3NiwianRpIjoiODlhYTliMGMtOGU2Ni00ODUzLTk4OWUtZWI3MmQ0NjE4Y2E2Iiwic2lkIjoiOWU4NjdkZmMtOGU0MS00YTBjLWFmNjUtNGJjZjYxMjM5NGIwIn0.Gbz-bSglCDtNWfPoiIRHxZLTPKpFchSVOnfJC2VNipM",
  "access_expires_at": "2026-10-27T17:54:36.903210532Z",
  "refresh_token": "yyKqb3d9JOcJOpA5cuL37jSRqs56vMOO_rl0POyd6BY",
  "refresh_expires_at": "2026-10-28T05:39:36.902633913Z",
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
  "command_id": "4e524a76-4e07-4122-a848-8a6eebf4ab49",
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
  "changed_by": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T17:39:36.976022Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "4e524a76-4e07-4122-a848-8a6eebf4ab49",
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
  "changed_by": "b18031f9-e424-4d50-990d-4cbbd9eac012",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T17:39:36.976022Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48217110455",
  "device_ref": "sandbox-23690"
}
```

```json
{
  "challenge_id": "0ffde24f-9113-4752-a49f-4280ec0d0a00",
  "expires_at": "2026-10-27T17:44:37.054204248Z",
  "resend_available_at": "2026-10-27T17:39:38.054204248Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48217110455` → **200**

```json
{
  "phone": "+48217110455",
  "audience": "CLIENT",
  "code": "321451",
  "sent_at": "2026-10-27T17:39:37.056697385Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ffde24f-9113-4752-a49f-4280ec0d0a00",
  "code": "321451",
  "device_ref": "sandbox-23690"
}
```

```json
{
  "session_id": "4ecf4553-3407-408a-bf0c-f426d1e4f954",
  "subject": {
    "type": "CLIENT",
    "id": "0c8cd34e-00c9-419b-9ef2-e5330ad51397"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzhjZDM0ZS0wMGM5LTQxOWItOWVmMi1lNTMzMGFkNTEzOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjc3LCJpYXQiOjE3OTMxMjI3NzcsImp0aSI6IjAxZjBkMzEyLWYyZTAtNDdhZC1hY2UxLTQ3NjQyZTI3OTQzZSIsInNpZCI6IjRlY2Y0NTUzLTM0MDctNDA4YS1iZjBjLWY0MjZkMWU0Zjk1NCJ9.fTIi2zcw1nhKKDxki_-81bfu4hNF6Y029Q-6IF-Z08U",
  "access_expires_at": "2026-10-27T17:54:37.113415148Z",
  "refresh_token": "GRMwNVg9NzDf1XHTg22k0Su6-I08qQaP2lH2hDp2FWw",
  "refresh_expires_at": "2026-11-26T17:39:37.112807937Z",
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
  "correlation_id": "c826d83e-00e5-4858-a44a-32d60fb50326"
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
  "device_ref": "sandbox-29438"
}
```

```json
{
  "challenge_id": "14c38ff4-89c4-4036-b730-9eb08bb96436",
  "expires_at": "2026-10-27T17:44:37.193677632Z",
  "resend_available_at": "2026-10-27T17:39:38.193677632Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "869950",
  "sent_at": "2026-10-27T17:39:37.195833935Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14c38ff4-89c4-4036-b730-9eb08bb96436",
  "code": "869950",
  "device_ref": "sandbox-29438"
}
```

```json
{
  "session_id": "6937e4c0-5790-46ca-aa77-46a693b35e08",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY3NywiaWF0IjoxNzkzMTIyNzc3LCJqdGkiOiJhY2I1NGRmMC03ODI3LTRiOTMtYWYzNS03ZGIyOTY5NjAyNmUiLCJzaWQiOiI2OTM3ZTRjMC01NzkwLTQ2Y2EtYWE3Ny00NmE2OTNiMzVlMDgifQ.RfxO7jM4BCkJjll-Fvfw9pF-8G2nehTXzbzt-TZ-IwY",
  "access_expires_at": "2026-10-27T17:54:37.250854501Z",
  "refresh_token": "lNV-5SPEeiVkbtOfqaJ0COt3vsRjy_NbMMhzqxUbIng",
  "refresh_expires_at": "2026-11-26T17:39:37.25006284Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5",
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
  "last_heartbeat_at": "2026-10-27T17:39:34.611393Z",
  "last_location_at": "2026-10-27T17:39:34.611393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5/handover` → **200**

```json
{
  "command_id": "58113695-7324-4374-bddb-97d52cdafa0f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5",
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
  "last_heartbeat_at": "2026-10-27T17:39:34.611393Z",
  "last_location_at": "2026-10-27T17:39:34.611393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:37Z",
    "sequence": 1793122777340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5",
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
  "last_heartbeat_at": "2026-10-27T17:39:37.359548Z",
  "last_location_at": "2026-10-27T17:39:37.359548Z",
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
  "session_id": "6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5",
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
  "last_heartbeat_at": "2026-10-27T17:39:37.359548Z",
  "last_location_at": "2026-10-27T17:39:37.359548Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c2fc8c8-4d02-40a8-be50-b1f2007a4eb5/close` → **200**

```json
{
  "command_id": "b167ae71-065a-4d33-9fc9-8da8d3411312",
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
  "correlation_id": "e9fe3832-a54c-45a9-9526-d2fc043a69d3"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678164215",
  "device_ref": "sandbox-24762"
}
```

```json
{
  "challenge_id": "cfd1a1d0-c634-435c-a9f4-b31cb2c24aa3",
  "expires_at": "2026-10-27T17:44:37.528361109Z",
  "resend_available_at": "2026-10-27T17:39:38.528361109Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678164215` → **200**

```json
{
  "phone": "+380678164215",
  "audience": "CLIENT",
  "code": "549416",
  "sent_at": "2026-10-27T17:39:37.530543281Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfd1a1d0-c634-435c-a9f4-b31cb2c24aa3",
  "code": "549416",
  "device_ref": "sandbox-24762"
}
```

```json
{
  "session_id": "5003ab95-0cfe-4e7b-9ae3-3d21aae4ab49",
  "subject": {
    "type": "CLIENT",
    "id": "04b6ca36-fcca-41d8-bf95-4d89182cee89"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGI2Y2EzNi1mY2NhLTQxZDgtYmY5NS00ZDg5MTgyY2VlODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIzNjc3LCJpYXQiOjE3OTMxMjI3NzcsImp0aSI6IjZlNjA4Yzc3LWYyZGItNDY5Yi04MTFmLTU3ZGFhZDA5ZGM0ZSIsInNpZCI6IjUwMDNhYjk1LTBjZmUtNGU3Yi05YWUzLTNkMjFhYWU0YWI0OSJ9.LnxU2gjOhPPLXDYcrJhOnY-DSYC66PG81os35ZUVfi8",
  "access_expires_at": "2026-10-27T17:54:37.587696384Z",
  "refresh_token": "b-5jWe6Y-9meLg9V7wuMUOjiF05CdCGRhM0rQOsxilc",
  "refresh_expires_at": "2026-11-26T17:39:37.58710339Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "42a13cf1-e4b3-467c-b088-bde4ca2cc85f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b2e86efe-9c76-480a-a675-827c6f8b2163",
  "upload_path": "/api/rider/v1/uploads/b2e86efe-9c76-480a-a675-827c6f8b2163",
  "expires_at": "2026-10-27T17:54:37.624578659Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b2e86efe-9c76-480a-a675-827c6f8b2163` → **200**

```json
{
  "file_id": "b2e86efe-9c76-480a-a675-827c6f8b2163",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "385f5537-4d2d-4571-97f9-2012723aec10",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b2e86efe-9c76-480a-a675-827c6f8b2163"
  ]
}
```

```json
{
  "id": "f871cc02-0630-4d16-9aa4-eaa3422a61c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T17:39:37.697073Z",
  "updated_at": "2026-10-27T17:39:37.697073Z",
  "messages": [
    {
      "id": "964a31e4-7f26-4d74-a205-fd0bec50e84c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:39:37.698445Z",
      "attachments": [
        {
          "file_id": "b2e86efe-9c76-480a-a675-827c6f8b2163",
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
  "session_id": "3cad7368-382c-4a2d-be05-bcb3cf3c4896",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzgsImlhdCI6MTc5MzEyMjc3OCwianRpIjoiNzUyZWFhNWQtZDJlYy00YTQ4LWEzZTAtMGQ5ZTQ1YTExMWUxIiwic2lkIjoiM2NhZDczNjgtMzgyYy00YTJkLWJlMDUtYmNiM2NmM2M0ODk2In0.-66oOH-dnJMBnT-J5d6CAJRtD0gMU1K_ZaCnd4FgEyw",
  "access_expires_at": "2026-10-27T17:54:38.043687455Z",
  "refresh_token": "Pc8kcYleyEfuUacBoAK_pOiS8YFJ5zdJb1Agw9mE80o",
  "refresh_expires_at": "2026-10-28T05:39:38.043045532Z",
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
  "session_id": "c59cbed5-f577-491f-a337-12d755b3a143",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzgsImlhdCI6MTc5MzEyMjc3OCwianRpIjoiNTIyNmZjMjYtODI5OS00MWMxLWE0ODItYjU0N2JhMGNiNjFmIiwic2lkIjoiYzU5Y2JlZDUtZjU3Ny00OTFmLWEzMzctMTJkNzU1YjNhMTQzIn0.UinUNfiQfyodMeP4uGGYL2M17CbqNiVqfkjpanx-TuA",
  "access_expires_at": "2026-10-27T17:54:38.363627069Z",
  "refresh_token": "jezVRSb6EBxO4WTG4lsTEA7ZZw_LG6wJs1Wu0tLJtjs",
  "refresh_expires_at": "2026-10-28T05:39:38.363099562Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f871cc02-0630-4d16-9aa4-eaa3422a61c5/attachments/b2e86efe-9c76-480a-a675-827c6f8b2163` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "306f56f2-3d4f-42a3-98c6-4d27c368e136",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0d479aec-a837-4265-aef3-289ecdca9f99",
  "upload_path": "/api/operator/v1/uploads/0d479aec-a837-4265-aef3-289ecdca9f99",
  "expires_at": "2026-10-27T17:54:38.412943121Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/0d479aec-a837-4265-aef3-289ecdca9f99` → **200**

```json
{
  "file_id": "0d479aec-a837-4265-aef3-289ecdca9f99",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f871cc02-0630-4d16-9aa4-eaa3422a61c5` → **200**

```json
{
  "id": "f871cc02-0630-4d16-9aa4-eaa3422a61c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T17:39:37.697073Z",
  "updated_at": "2026-10-27T17:39:37.697073Z",
  "messages": [
    {
      "id": "964a31e4-7f26-4d74-a205-fd0bec50e84c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:39:37.698445Z",
      "attachments": [
        {
          "file_id": "b2e86efe-9c76-480a-a675-827c6f8b2163",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f871cc02-0630-4d16-9aa4-eaa3422a61c5/comments` → **200**

```json
{
  "command_id": "70b6bf6a-91df-44b9-8a3e-41d2903de711",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "0d479aec-a837-4265-aef3-289ecdca9f99"
  ]
}
```

```json
{
  "id": "f871cc02-0630-4d16-9aa4-eaa3422a61c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T17:39:37.697073Z",
  "updated_at": "2026-10-27T17:39:38.516689Z",
  "messages": [
    {
      "id": "964a31e4-7f26-4d74-a205-fd0bec50e84c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:39:37.698445Z",
      "attachments": [
        {
          "file_id": "b2e86efe-9c76-480a-a675-827c6f8b2163",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "626b6c3a-c0f8-490c-a766-6597fa0f43d3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b18031f9-e424-4d50-990d-4cbbd9eac012",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T17:39:38.516246Z",
      "attachments": [
        {
          "file_id": "0d479aec-a837-4265-aef3-289ecdca9f99",
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

`GET /api/rider/v1/support/cases/f871cc02-0630-4d16-9aa4-eaa3422a61c5` → **200**

```json
{
  "id": "f871cc02-0630-4d16-9aa4-eaa3422a61c5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T17:39:37.697073Z",
  "updated_at": "2026-10-27T17:39:38.516689Z",
  "messages": [
    {
      "id": "964a31e4-7f26-4d74-a205-fd0bec50e84c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "04b6ca36-fcca-41d8-bf95-4d89182cee89",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T17:39:37.698445Z",
      "attachments": [
        {
          "file_id": "b2e86efe-9c76-480a-a675-827c6f8b2163",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "626b6c3a-c0f8-490c-a766-6597fa0f43d3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T17:39:38.516246Z",
      "attachments": [
        {
          "file_id": "0d479aec-a837-4265-aef3-289ecdca9f99",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f871cc02-0630-4d16-9aa4-eaa3422a61c5/attachments/0d479aec-a837-4265-aef3-289ecdca9f99` → **200**

Done: support case f871cc02-0630-4d16-9aa4-eaa3422a61c5, rider attachment b2e86efe-9c76-480a-a675-827c6f8b2163, operator attachment 0d479aec-a837-4265-aef3-289ecdca9f99.

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
  "session_id": "44cd20ac-7ca7-44df-aaeb-8b92e46c8b6c",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzgsImlhdCI6MTc5MzEyMjc3OCwianRpIjoiOGJjNmU2MTYtNzM3OC00YWU3LWE4NzMtZGFkNzQzZGM0NTUwIiwic2lkIjoiNDRjZDIwYWMtN2NhNy00NGRmLWFhZWItOGI5MmU0NmM4YjZjIn0.e3TYWetnDLQC89Lrj4Tqbz3BQcXVE7WQnomM60TlAfo",
  "access_expires_at": "2026-10-27T17:54:38.910794106Z",
  "refresh_token": "eIyheX-aTVnNaYoLoHuNVz5_c53e_B0qzVmeDgTg0vs",
  "refresh_expires_at": "2026-10-28T05:39:38.910178225Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27538"
}
```

```json
{
  "challenge_id": "32cde650-46d9-46fa-8141-a12b7c2753c1",
  "expires_at": "2026-10-27T17:44:38.93799456Z",
  "resend_available_at": "2026-10-27T17:39:39.93799456Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "472531",
  "sent_at": "2026-10-27T17:39:38.940184016Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32cde650-46d9-46fa-8141-a12b7c2753c1",
  "code": "472531",
  "device_ref": "sandbox-27538"
}
```

```json
{
  "session_id": "3bb07c21-6470-4add-8cae-ec861b642c5e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY3OCwiaWF0IjoxNzkzMTIyNzc4LCJqdGkiOiJlMjFiNDQ1Yy0xMzY4LTQwYWItYTYzMS1lN2JlNmNiZGFhYTYiLCJzaWQiOiIzYmIwN2MyMS02NDcwLTRhZGQtOGNhZS1lYzg2MWI2NDJjNWUifQ.hv6vb5LXdecvrYlCUTJCa1oeP-LSBqH-IKyLtiV1ht8",
  "access_expires_at": "2026-10-27T17:54:38.994227467Z",
  "refresh_token": "jZ_U5M9yXs0m4w72ETAjSQlCOMCjDwAEmADeXllBOV8",
  "refresh_expires_at": "2026-11-26T17:39:38.993613859Z",
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
  "command_id": "c0705a79-1996-4a2a-adad-9827cad4ba81",
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
  "device_ref": "sandbox-27830"
}
```

```json
{
  "challenge_id": "3622897d-5014-4e6a-8ea4-3227210b4d5e",
  "expires_at": "2026-10-27T17:44:39.129903975Z",
  "resend_available_at": "2026-10-27T17:39:40.129903975Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "989771",
  "sent_at": "2026-10-27T17:39:39.132028396Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3622897d-5014-4e6a-8ea4-3227210b4d5e",
  "code": "989771",
  "device_ref": "sandbox-27830"
}
```

```json
{
  "session_id": "96c9acb5-2f86-451f-96b9-ddff56fac13c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMzY3OSwiaWF0IjoxNzkzMTIyNzc5LCJqdGkiOiI2ZWFhYzM4OS05OWM4LTQ3MjEtYTI2Mi03MDczMjdiYThhYTQiLCJzaWQiOiI5NmM5YWNiNS0yZjg2LTQ1MWYtOTZiOS1kZGZmNTZmYWMxM2MifQ.IKf5HzYlQdhYS5ZLrW0AbLym3r1NHYHwPWpoRJrGNNk",
  "access_expires_at": "2026-10-27T17:54:39.187863446Z",
  "refresh_token": "Qyu9gt3ugwcb5bmgIktlWOxN7svkk7Nxp99LsjJ_LLQ",
  "refresh_expires_at": "2026-11-26T17:39:39.187312045Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c53754c9-eef5-49b3-b635-dd91ffd14010",
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
  "last_heartbeat_at": "2026-10-27T17:39:35.733229Z",
  "last_location_at": "2026-10-27T17:39:35.733229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c53754c9-eef5-49b3-b635-dd91ffd14010/handover` → **200**

```json
{
  "command_id": "9f1ca04b-e4f4-4cdb-b8e9-d3fafe106934",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c53754c9-eef5-49b3-b635-dd91ffd14010",
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
  "last_heartbeat_at": "2026-10-27T17:39:35.733229Z",
  "last_location_at": "2026-10-27T17:39:35.733229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c53754c9-eef5-49b3-b635-dd91ffd14010/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:39Z",
    "sequence": 1793122779274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c53754c9-eef5-49b3-b635-dd91ffd14010",
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
  "last_heartbeat_at": "2026-10-27T17:39:39.295151Z",
  "last_location_at": "2026-10-27T17:39:39.295151Z",
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
  "command_id": "35fa13c3-6bed-4da9-ab74-cc3958e85570",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:39Z",
    "sequence": 1793122779346
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fcef096-68b5-48d6-8717-9ed0cdc15986",
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
  "last_heartbeat_at": "2026-10-27T17:39:39.364309Z",
  "last_location_at": "2026-10-27T17:39:39.364309Z",
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
  "session_id": "91b42c91-be36-47ea-8c5e-a5e92c1486ca",
  "subject": {
    "type": "STAFF",
    "id": "b18031f9-e424-4d50-990d-4cbbd9eac012"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwMzFmOS1lNDI0LTRkNTAtOTkwZC00Y2JiZDllYWMwMTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjM2NzksImlhdCI6MTc5MzEyMjc3OSwianRpIjoiMzdjZGNhOWYtMWM0My00OTYzLTk3OGItYjdmMzMzNzhlMzBkIiwic2lkIjoiOTFiNDJjOTEtYmUzNi00N2VhLThjNWUtYTVlOTJjMTQ4NmNhIn0._RRMO8toqpAtLgHzRKpBmitt3FuzS-fZ_Q3NP33i6f4",
  "access_expires_at": "2026-10-27T17:54:39.692481541Z",
  "refresh_token": "fcQYN8NzcswZh_qRdroyJJaIzIuzAWgFSBlnGrD-9fI",
  "refresh_expires_at": "2026-10-28T05:39:39.691902207Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "38423097-6d8f-4dad-8ea7-823ad432d8ee",
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
  "id": "0919ff95-1b75-4bec-9d36-0448f09d432d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T17:44:39.725017Z",
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
  "command_id": "51ab6234-9759-449d-814b-1a8a571b2d2f",
  "quote_id": "0919ff95-1b75-4bec-9d36-0448f09d432d",
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
  "id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
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
  "created_at": "2026-10-27T17:39:39.763713Z",
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
    "id": "18619691-203f-4c6f-8c4d-58c496fb9011",
    "order_id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
    "expires_at": "2026-10-27T17:39:54.767428Z",
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

`POST /api/driver/v1/offers/18619691-203f-4c6f-8c4d-58c496fb9011/accept` → **200**

```json
{
  "command_id": "7bda2e59-1ad9-46fd-a3d8-f53eaef1ad1c"
}
```

```json
{
  "id": "8b64e24b-f252-41db-adab-535946ac1b61",
  "order_id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea05a838-1ef1-4d62-afdc-74cec9153dbd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea05a838-1ef1-4d62-afdc-74cec9153dbd",
  "order_id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
  "assignment_id": "8b64e24b-f252-41db-adab-535946ac1b61",
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

`POST /api/driver/v1/work-sessions/5fcef096-68b5-48d6-8717-9ed0cdc15986/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T17:39:39Z",
    "sequence": 1793122779906
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fcef096-68b5-48d6-8717-9ed0cdc15986",
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
  "last_heartbeat_at": "2026-10-27T17:39:39.925249Z",
  "last_location_at": "2026-10-27T17:39:39.925249Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ea05a838-1ef1-4d62-afdc-74cec9153dbd/arrive` → **200**

```json
{
  "command_id": "cf2bf04f-c36b-4b32-a2ca-92725ebffde1",
  "expected_version": 0
}
```

```json
{
  "id": "ea05a838-1ef1-4d62-afdc-74cec9153dbd",
  "order_id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
  "assignment_id": "8b64e24b-f252-41db-adab-535946ac1b61",
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
  "arrived_at": "2026-10-27T17:39:39.961198Z",
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

`POST /api/driver/v1/trips/ea05a838-1ef1-4d62-afdc-74cec9153dbd/start` → **200**

```json
{
  "command_id": "7cd04864-1ef7-4177-8e16-fa4a702915a0",
  "expected_version": 1
}
```

```json
{
  "id": "ea05a838-1ef1-4d62-afdc-74cec9153dbd",
  "order_id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
  "assignment_id": "8b64e24b-f252-41db-adab-535946ac1b61",
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
  "arrived_at": "2026-10-27T17:39:39.961198Z",
  "started_at": "2026-10-27T17:39:40.001224Z",
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

`POST /api/driver/v1/trips/ea05a838-1ef1-4d62-afdc-74cec9153dbd/complete` → **200**

```json
{
  "command_id": "c09b9864-7fe8-40b5-a70f-fc7d743d506d",
  "expected_version": 2,
  "reported_at": "2026-10-27T17:39:40Z",
  "cash_received": true
}
```

```json
{
  "id": "ea05a838-1ef1-4d62-afdc-74cec9153dbd",
  "order_id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
  "assignment_id": "8b64e24b-f252-41db-adab-535946ac1b61",
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
  "arrived_at": "2026-10-27T17:39:39.961198Z",
  "started_at": "2026-10-27T17:39:40.001224Z",
  "completed_at": "2026-10-27T17:39:40.04559Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/5eacfe06-0a89-41bb-907e-bf543f1c441b` → **200**

```json
{
  "id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
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
    "id": "8b64e24b-f252-41db-adab-535946ac1b61",
    "order_id": "5eacfe06-0a89-41bb-907e-bf543f1c441b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ea05a838-1ef1-4d62-afdc-74cec9153dbd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T17:39:39.763713Z",
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
  "session_id": "c53754c9-eef5-49b3-b635-dd91ffd14010",
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
  "last_heartbeat_at": "2026-10-27T17:39:39.295151Z",
  "last_location_at": "2026-10-27T17:39:39.295151Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c53754c9-eef5-49b3-b635-dd91ffd14010/close` → **200**

```json
{
  "command_id": "4e839b22-caf7-49ae-b27d-64bfc277f03f",
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
  "session_id": "5fcef096-68b5-48d6-8717-9ed0cdc15986",
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
  "last_heartbeat_at": "2026-10-27T17:39:39.925249Z",
  "last_location_at": "2026-10-27T17:39:39.925249Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5fcef096-68b5-48d6-8717-9ed0cdc15986/close` → **200**

```json
{
  "command_id": "7c4a8988-e059-41bf-9230-b6623bc15f1c",
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

Done: terminal order 5eacfe06-0a89-41bb-907e-bf543f1c441b by Andrii (5a000000-0000-4000-8000-000000000403).
