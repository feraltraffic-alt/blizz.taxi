# Sandbox transcript (2026-10-27T15:02:03Z, 118802f)

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
  "correlation_id": "a7fc62c3-3d96-41e3-97bc-86afdcda17c7"
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
  "session_id": "82002268-df4a-41cb-a032-3f7b6fac20b2",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyMjQsImlhdCI6MTc5MzExMzMyNCwianRpIjoiOWIzZWU3MDItZTc0My00NzE5LTk3MWYtODRjYzI2NGI5NmIwIiwic2lkIjoiODIwMDIyNjgtZGY0YS00MWNiLWEwMzItM2Y3YjZmYWMyMGIyIn0.mOzjF0F-LCIw3_Rl1fi9BiEdyAVB73LyORtmo4ESQpk",
  "access_expires_at": "2026-10-27T15:17:04.058252378Z",
  "refresh_token": "HE29l26kEG_Ym68hPZjJcfN2BnJtfm0tA6v8zXAuo9w",
  "refresh_expires_at": "2026-10-28T03:02:04.056141643Z",
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
  "session_id": "506a3d06-54f2-4de0-bc46-ca1590d0345c",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyMjUsImlhdCI6MTc5MzExMzMyNSwianRpIjoiM2NlZDJmNzQtOWEzZi00YTI0LWFiOTgtYzc5Yzk1MTkxN2E2Iiwic2lkIjoiNTA2YTNkMDYtNTRmMi00ZGUwLWJjNDYtY2ExNTkwZDAzNDVjIn0.mZk5ZmGVS7Yxp74ZeP11ZiDJMqpsZHI2t_KQffvXXtI",
  "access_expires_at": "2026-10-27T15:17:05.303146948Z",
  "refresh_token": "PxsOJgMS4jNK16kwctMz5E0QZpXaKVv1E8k5TOGTeiQ",
  "refresh_expires_at": "2026-10-28T03:02:05.302278636Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "61823209-9515-433a-bf7e-3f95bb7de53d",
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
  "id": "0f4ad6c5-6018-411f-87f4-a2038eccdc5b",
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
  "created_by": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "created_at": "2026-10-27T15:02:05.357288Z",
  "updated_at": "2026-10-27T15:02:05.357288Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635914464",
  "device_ref": "sandbox-16920"
}
```

```json
{
  "challenge_id": "7b0d208f-d9b3-4bf7-9d5e-7842e0630401",
  "expires_at": "2026-10-27T15:07:05.398332772Z",
  "resend_available_at": "2026-10-27T15:02:06.398332772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635914464` → **200**

```json
{
  "phone": "+380635914464",
  "audience": "CLIENT",
  "code": "893511",
  "sent_at": "2026-10-27T15:02:05.405442449Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b0d208f-d9b3-4bf7-9d5e-7842e0630401",
  "code": "893511",
  "device_ref": "sandbox-16920"
}
```

```json
{
  "session_id": "ea0d68e4-ee42-427b-983e-72a66fa53a67",
  "subject": {
    "type": "CLIENT",
    "id": "68b90b34-6a8b-4e9d-a717-3bbfd2101fb3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGI5MGIzNC02YThiLTRlOWQtYTcxNy0zYmJmZDIxMDFmYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjI1LCJpYXQiOjE3OTMxMTMzMjUsImp0aSI6IjE1N2U2NDM2LThiNDAtNGY5MC05OGIwLTFkZDIwMDI5ODk5YyIsInNpZCI6ImVhMGQ2OGU0LWVlNDItNDI3Yi05ODNlLTcyYTY2ZmE1M2E2NyJ9.bl2rmTDKZUC6Pq3E9kXYIyIgxZ96KIuIzig0MHr6vh4",
  "access_expires_at": "2026-10-27T15:17:05.473608972Z",
  "refresh_token": "kyd9HSC_zQK73ztteGWFToOQr0cwZyi5D7IcfhAMk3A",
  "refresh_expires_at": "2026-11-26T15:02:05.472524455Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635914464` → **200**

```json
{
  "client_id": "68b90b34-6a8b-4e9d-a717-3bbfd2101fb3"
}
```

`POST /api/admin/v1/rider-wallets/68b90b34-6a8b-4e9d-a717-3bbfd2101fb3/top-ups` → **201**

```json
{
  "command_id": "b09648c4-6e5b-4e14-8980-039dc1fccd8c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "68b90b34-6a8b-4e9d-a717-3bbfd2101fb3",
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
      "id": "66e83ab2-42c2-470f-9ba8-744554fc694b",
      "at": "2026-10-27T15:02:05.549806Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "724c730b-245c-4a30-a20f-00e27e85cee6",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e559829b-0095-4d45-bc46-db9e939ee814",
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
  "id": "e9173d23-31c2-473f-aec0-da1c81ae0560",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:07:05.692521Z",
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
      "id": "0f4ad6c5-6018-411f-87f4-a2038eccdc5b",
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
  "device_ref": "sandbox-10871"
}
```

```json
{
  "challenge_id": "c26ea5b9-e279-4c75-9496-82fc89ac5e70",
  "expires_at": "2026-10-27T15:07:05.760117639Z",
  "resend_available_at": "2026-10-27T15:02:06.760117639Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "418372",
  "sent_at": "2026-10-27T15:02:05.763776998Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c26ea5b9-e279-4c75-9496-82fc89ac5e70",
  "code": "418372",
  "device_ref": "sandbox-10871"
}
```

```json
{
  "session_id": "3cec675e-66d4-4241-a52b-de446fa93af7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDIyNSwiaWF0IjoxNzkzMTEzMzI1LCJqdGkiOiJlYmY2ODQ0ZS05YjdkLTQ4MTItYjZmNC02N2FjOWEyYmU3YmEiLCJzaWQiOiIzY2VjNjc1ZS02NmQ0LTQyNDEtYTUyYi1kZTQ0NmZhOTNhZjcifQ.n0sjxATn_UNWmb81xiLxX1Lb6Pb59Tk3yVgSXny9juw",
  "access_expires_at": "2026-10-27T15:17:05.817295666Z",
  "refresh_token": "vaXRzo0AztSOcGGB7rSkdQpqVZSvuRMFV7cJArNRIZY",
  "refresh_expires_at": "2026-11-26T15:02:05.816200143Z",
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
  "command_id": "b3954f41-7b02-4fb2-9a00-d987bba3f00b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:05Z",
    "sequence": 1793113325878
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22785bbe-ea6d-41f1-9cbc-e663ac06b7b5",
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
  "last_heartbeat_at": "2026-10-27T15:02:05.925444Z",
  "last_location_at": "2026-10-27T15:02:05.925444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b191bda8-ad8e-42eb-980e-2cefa4921618",
  "quote_id": "e9173d23-31c2-473f-aec0-da1c81ae0560",
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
  "id": "43c59558-47df-49c2-ad24-d5384ba00891",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68b90b34-6a8b-4e9d-a717-3bbfd2101fb3",
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
  "created_at": "2026-10-27T15:02:06.021303Z",
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
  "client_id": "68b90b34-6a8b-4e9d-a717-3bbfd2101fb3",
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
      "id": "66e83ab2-42c2-470f-9ba8-744554fc694b",
      "at": "2026-10-27T15:02:05.549806Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "724c730b-245c-4a30-a20f-00e27e85cee6",
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
    "id": "fa02a988-27d6-4704-a59c-af957b3a983f",
    "order_id": "43c59558-47df-49c2-ad24-d5384ba00891",
    "expires_at": "2026-10-27T15:02:21.038308Z",
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

`POST /api/driver/v1/offers/fa02a988-27d6-4704-a59c-af957b3a983f/accept` → **200**

```json
{
  "command_id": "be0bf4fc-661f-4bbe-96b0-37f1d6bdd645"
}
```

```json
{
  "id": "26b9f35e-ccc5-4513-ae2e-61aa8d944500",
  "order_id": "43c59558-47df-49c2-ad24-d5384ba00891",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "79507cc6-81b8-4647-946e-581d6ace7178",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "79507cc6-81b8-4647-946e-581d6ace7178",
  "order_id": "43c59558-47df-49c2-ad24-d5384ba00891",
  "assignment_id": "26b9f35e-ccc5-4513-ae2e-61aa8d944500",
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
  "discount_minor": 1052
}
```

`POST /api/driver/v1/work-sessions/22785bbe-ea6d-41f1-9cbc-e663ac06b7b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:06Z",
    "sequence": 1793113326257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22785bbe-ea6d-41f1-9cbc-e663ac06b7b5",
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
  "last_heartbeat_at": "2026-10-27T15:02:06.281052Z",
  "last_location_at": "2026-10-27T15:02:06.281052Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/79507cc6-81b8-4647-946e-581d6ace7178/arrive` → **200**

```json
{
  "command_id": "7c1c8c77-8426-47e1-a30d-8dde064db5dd",
  "expected_version": 0
}
```

```json
{
  "id": "79507cc6-81b8-4647-946e-581d6ace7178",
  "order_id": "43c59558-47df-49c2-ad24-d5384ba00891",
  "assignment_id": "26b9f35e-ccc5-4513-ae2e-61aa8d944500",
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
  "arrived_at": "2026-10-27T15:02:06.325979Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/79507cc6-81b8-4647-946e-581d6ace7178/start` → **200**

```json
{
  "command_id": "bbc68894-0911-4959-b9df-4c844f3aaf63",
  "expected_version": 1
}
```

```json
{
  "id": "79507cc6-81b8-4647-946e-581d6ace7178",
  "order_id": "43c59558-47df-49c2-ad24-d5384ba00891",
  "assignment_id": "26b9f35e-ccc5-4513-ae2e-61aa8d944500",
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
  "arrived_at": "2026-10-27T15:02:06.325979Z",
  "started_at": "2026-10-27T15:02:06.363737Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/79507cc6-81b8-4647-946e-581d6ace7178/complete` → **200**

```json
{
  "command_id": "25a2227f-26ab-43a6-9bc6-f658ff7ffd57",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:02:06Z",
  "cash_received": true
}
```

```json
{
  "id": "79507cc6-81b8-4647-946e-581d6ace7178",
  "order_id": "43c59558-47df-49c2-ad24-d5384ba00891",
  "assignment_id": "26b9f35e-ccc5-4513-ae2e-61aa8d944500",
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
  "arrived_at": "2026-10-27T15:02:06.325979Z",
  "started_at": "2026-10-27T15:02:06.363737Z",
  "completed_at": "2026-10-27T15:02:06.418161Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "68b90b34-6a8b-4e9d-a717-3bbfd2101fb3",
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
      "id": "9b9162df-dcf2-444c-b9b7-9c56f2ce0557",
      "at": "2026-10-27T15:02:07.168159Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "43c59558-47df-49c2-ad24-d5384ba00891"
    },
    {
      "id": "66e83ab2-42c2-470f-9ba8-744554fc694b",
      "at": "2026-10-27T15:02:05.549806Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "724c730b-245c-4a30-a20f-00e27e85cee6",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/0f4ad6c5-6018-411f-87f4-a2038eccdc5b/archive` → **200**

```json
{
  "command_id": "02580c82-c8ff-4bc0-8d2b-2f96e14c77c3",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "0f4ad6c5-6018-411f-87f4-a2038eccdc5b",
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
  "created_by": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "created_at": "2026-10-27T15:02:05.357288Z",
  "updated_at": "2026-10-27T15:02:09.499171Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22785bbe-ea6d-41f1-9cbc-e663ac06b7b5",
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
  "last_heartbeat_at": "2026-10-27T15:02:06.281052Z",
  "last_location_at": "2026-10-27T15:02:06.281052Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22785bbe-ea6d-41f1-9cbc-e663ac06b7b5/close` → **200**

```json
{
  "command_id": "e2359c14-a4e4-451c-8104-d1ffa7822a82",
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

Done: order 43c59558-47df-49c2-ad24-d5384ba00891.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635394446",
  "device_ref": "sandbox-1424"
}
```

```json
{
  "challenge_id": "3447dac9-2224-4062-845b-700185dad422",
  "expires_at": "2026-10-27T15:07:09.602945998Z",
  "resend_available_at": "2026-10-27T15:02:10.602945998Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635394446` → **200**

```json
{
  "phone": "+380635394446",
  "audience": "CLIENT",
  "code": "877205",
  "sent_at": "2026-10-27T15:02:09.606399928Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3447dac9-2224-4062-845b-700185dad422",
  "code": "877205",
  "device_ref": "sandbox-1424"
}
```

```json
{
  "session_id": "0b3585a3-e3ef-4b5a-b8ed-d751dde1dfa1",
  "subject": {
    "type": "CLIENT",
    "id": "543986b5-8e9e-4a2d-a405-28f8913f2dbf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDM5ODZiNS04ZTllLTRhMmQtYTQwNS0yOGY4OTEzZjJkYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjI5LCJpYXQiOjE3OTMxMTMzMjksImp0aSI6ImUxZjQ3MGJkLWY2YWEtNDFhZi1hZDhkLWJkYmE1MmI1ODk2MyIsInNpZCI6IjBiMzU4NWEzLWUzZWYtNGI1YS1iOGVkLWQ3NTFkZGUxZGZhMSJ9.36hwalbNiTcJb7JpybqxjoGs1TifGSmhK_XLdoxF8tU",
  "access_expires_at": "2026-10-27T15:17:09.652232657Z",
  "refresh_token": "6Ga3HqPBnXkQBuHTJktE9PZhFlkx4tqIkVVmjL3k2ZM",
  "refresh_expires_at": "2026-11-26T15:02:09.651460377Z",
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
  "device_ref": "sandbox-12750"
}
```

```json
{
  "challenge_id": "62dce5fa-ea5d-47af-958b-25b5db8b83f8",
  "expires_at": "2026-10-27T15:07:09.69712332Z",
  "resend_available_at": "2026-10-27T15:02:10.69712332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "795742",
  "sent_at": "2026-10-27T15:02:09.700353417Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62dce5fa-ea5d-47af-958b-25b5db8b83f8",
  "code": "795742",
  "device_ref": "sandbox-12750"
}
```

```json
{
  "session_id": "b2ccff92-e516-4363-8f97-23ff7e3a709e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDIyOSwiaWF0IjoxNzkzMTEzMzI5LCJqdGkiOiIzMTM4NjkxYS03Mjc1LTRjNTQtOTE4ZS0yYjE5MWU5N2U0ZjQiLCJzaWQiOiJiMmNjZmY5Mi1lNTE2LTQzNjMtOGY5Ny0yM2ZmN2UzYTcwOWUifQ.ZCLl6iqOIUFiu8xDX3nR5cGkLDZOT4vM7JBRDYBqpzk",
  "access_expires_at": "2026-10-27T15:17:09.747247323Z",
  "refresh_token": "lJFUmo2gjR9Ku680DSzKNC2G8COgKM1Z0kEO_1ujRlg",
  "refresh_expires_at": "2026-11-26T15:02:09.746466346Z",
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
  "session_id": "83695b43-4b29-4d0e-863c-50dce2094d71",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyMzAsImlhdCI6MTc5MzExMzMzMCwianRpIjoiMTA2YjZkMDItMmMwZS00YTdmLTkyNjctNDE1MWM0M2I2M2QwIiwic2lkIjoiODM2OTViNDMtNGIyOS00ZDBlLTg2M2MtNTBkY2UyMDk0ZDcxIn0.8NI02JLNIkuTdSkz2fAgU42wQ0Z8lXiQouq2y9flhxU",
  "access_expires_at": "2026-10-27T15:17:10.074521367Z",
  "refresh_token": "5fif_kjjQrHzPKCGNn3iarZNExo9jxLcORxdBTDn9gs",
  "refresh_expires_at": "2026-10-28T03:02:10.073893866Z",
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
  "session_id": "4395f39d-29ed-4845-aa7e-b3b303a20a0f",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyMzAsImlhdCI6MTc5MzExMzMzMCwianRpIjoiN2NkYjJlMDYtNWFjZC00ODFlLWJmNzMtNzQ1MmJjZTI1NTA1Iiwic2lkIjoiNDM5NWYzOWQtMjllZC00ODQ1LWFhN2UtYjNiMzAzYTIwYTBmIn0.W3nqoORMm2lFjmtf9P4osO7KwOn2b7YozFPihr5r-JQ",
  "access_expires_at": "2026-10-27T15:17:10.385751612Z",
  "refresh_token": "uEEs7ERJSTRl3Gp9JxllxC8Q3Cti78BPAQFLNJP8Py4",
  "refresh_expires_at": "2026-10-28T03:02:10.384975047Z",
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
  "command_id": "28910e74-1c4d-4a7e-abf2-b9c2a57e7c53",
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
  "id": "689da3a0-84a7-48c4-b879-9fe8857ea10e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:07:10.442524Z",
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
  "command_id": "bc8a3f78-6dd3-46dc-bfc7-2a94fedc2499",
  "quote_id": "689da3a0-84a7-48c4-b879-9fe8857ea10e",
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
  "id": "02579342-565c-4993-90c7-f67cc14307d8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "543986b5-8e9e-4a2d-a405-28f8913f2dbf",
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
  "created_at": "2026-10-27T15:02:10.476576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/02579342-565c-4993-90c7-f67cc14307d8` → **200**

```json
{
  "id": "02579342-565c-4993-90c7-f67cc14307d8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "543986b5-8e9e-4a2d-a405-28f8913f2dbf",
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
  "created_at": "2026-10-27T15:02:10.476576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/02579342-565c-4993-90c7-f67cc14307d8/cancel` → **200**

```json
{
  "command_id": "a28f358d-5644-401a-8f3c-4ecd02335e15",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "02579342-565c-4993-90c7-f67cc14307d8",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "543986b5-8e9e-4a2d-a405-28f8913f2dbf",
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
  "created_at": "2026-10-27T15:02:10.476576Z",
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
  "command_id": "3c5139a0-ccd2-448b-bfe5-656ad7e99624",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:10Z",
    "sequence": 1793113330596
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9276868f-dc22-4937-97d8-ca06dcdd67a1",
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
  "last_heartbeat_at": "2026-10-27T15:02:10.613342Z",
  "last_location_at": "2026-10-27T15:02:10.613342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18653"
}
```

```json
{
  "challenge_id": "5d1dffd6-c014-4f45-af2f-966944c02d85",
  "expires_at": "2026-10-27T15:07:10.640064203Z",
  "resend_available_at": "2026-10-27T15:02:11.640064203Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "942490",
  "sent_at": "2026-10-27T15:02:10.642848776Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d1dffd6-c014-4f45-af2f-966944c02d85",
  "code": "942490",
  "device_ref": "sandbox-18653"
}
```

```json
{
  "session_id": "85521b52-7df7-4082-8e6d-b9b1d4bf7030",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDIzMCwiaWF0IjoxNzkzMTEzMzMwLCJqdGkiOiJhOWU3MGQ1ZS1jY2E3LTRkMjktYTA1Zi03NjYxZWMxNzZkMGUiLCJzaWQiOiI4NTUyMWI1Mi03ZGY3LTQwODItOGU2ZC1iOWIxZDRiZjcwMzAifQ.rrwhSbM1T3GZcHP4dJWm7lt6cnNsat2A6n-rXSNHxf0",
  "access_expires_at": "2026-10-27T15:17:10.688035285Z",
  "refresh_token": "9VTGuhGW5Lpa55tJhldFaKsPNBIB64mcgF462BDyd6I",
  "refresh_expires_at": "2026-11-26T15:02:10.687428947Z",
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
  "command_id": "8c6140dc-763f-43eb-a1b9-fbbefb071551",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:10Z",
    "sequence": 1793113330730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
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
  "last_heartbeat_at": "2026-10-27T15:02:10.746195Z",
  "last_location_at": "2026-10-27T15:02:10.746195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eee95f88-adcf-40b3-843b-1ec1a7244fc5",
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
  "id": "8c1c9cd1-1e52-4d67-b637-0c568e1ff472",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:07:10.781986Z",
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
  "command_id": "806e93d1-6368-484b-abe5-e8bfb98a6cec",
  "quote_id": "8c1c9cd1-1e52-4d67-b637-0c568e1ff472",
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
  "id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "543986b5-8e9e-4a2d-a405-28f8913f2dbf",
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
  "created_at": "2026-10-27T15:02:10.814979Z",
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
    "id": "739e078a-85d4-41f4-b80c-cfbb06eedaab",
    "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
    "expires_at": "2026-10-27T15:02:25.81927Z",
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

`POST /api/driver/v1/offers/739e078a-85d4-41f4-b80c-cfbb06eedaab/accept` → **200**

```json
{
  "command_id": "ccea0053-0c9f-4421-91b7-0051afeb14bb"
}
```

```json
{
  "id": "f62c4199-308b-4e4e-884f-798280f98ec1",
  "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "33107e19-d480-4d7b-9faa-2754cdf68ca1",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "33107e19-d480-4d7b-9faa-2754cdf68ca1",
  "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "assignment_id": "f62c4199-308b-4e4e-884f-798280f98ec1",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/33107e19-d480-4d7b-9faa-2754cdf68ca1/cancel` → **200**

```json
{
  "command_id": "2185d3f9-7d3c-4430-80a3-df32f602f13f",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "33107e19-d480-4d7b-9faa-2754cdf68ca1",
  "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "assignment_id": "f62c4199-308b-4e4e-884f-798280f98ec1",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/2704d13c-ee78-459f-85ff-1c1567cb90f3` → **200**

```json
{
  "id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "543986b5-8e9e-4a2d-a405-28f8913f2dbf",
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
    "id": "f62c4199-308b-4e4e-884f-798280f98ec1",
    "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "33107e19-d480-4d7b-9faa-2754cdf68ca1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T15:02:10.814979Z",
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
    "id": "9ec411d4-a833-49dc-b58c-7febef8152d1",
    "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
    "expires_at": "2026-10-27T15:02:25.943422Z",
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

`POST /api/driver/v1/offers/9ec411d4-a833-49dc-b58c-7febef8152d1/accept` → **200**

```json
{
  "command_id": "02c3373c-a65e-4d0e-a491-a47451bc39e2"
}
```

```json
{
  "id": "45b0d82e-f7ea-45e3-bf12-dae86abf3752",
  "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "53a80d83-32a5-43f0-86c0-efff596ae73b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "53a80d83-32a5-43f0-86c0-efff596ae73b",
  "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "assignment_id": "45b0d82e-f7ea-45e3-bf12-dae86abf3752",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/53a80d83-32a5-43f0-86c0-efff596ae73b/cancel` → **200**

```json
{
  "command_id": "c2499dab-b0ec-424e-9790-fe3327440563",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "53a80d83-32a5-43f0-86c0-efff596ae73b",
  "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
  "assignment_id": "45b0d82e-f7ea-45e3-bf12-dae86abf3752",
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
  "discount_minor": 0
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:02:10.814979Z",
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
    "id": "02579342-565c-4993-90c7-f67cc14307d8",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:02:10.476576Z",
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

`GET /api/operator/v1/orders/2704d13c-ee78-459f-85ff-1c1567cb90f3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:02:10.815737Z",
      "actor": {
        "type": "CLIENT",
        "id": "543986b5-8e9e-4a2d-a405-28f8913f2dbf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
        "quote_id": "8c1c9cd1-1e52-4d67-b637-0c568e1ff472",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:02:10.818188Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
        "attempt_id": "6273e6c8-1317-4243-8009-1a43cdf1cd0b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:02:10.823989Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "739e078a-85d4-41f4-b80c-cfbb06eedaab",
        "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:02:10.87696Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "739e078a-85d4-41f4-b80c-cfbb06eedaab",
        "order_id": "2704d13c-ee78-459f-85ff-1c1567cb90f3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f62c4199-308b-4e4e-884f-798280f98ec1"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 02579342-565c-4993-90c7-f67cc14307d8, 2704d13c-ee78-459f-85ff-1c1567cb90f3.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735715161",
  "device_ref": "sandbox-32591"
}
```

```json
{
  "challenge_id": "1f22592e-5828-44e2-899b-7692b1f25bd9",
  "expires_at": "2026-10-27T15:07:11.170838713Z",
  "resend_available_at": "2026-10-27T15:02:12.170838713Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735715161` → **200**

```json
{
  "phone": "+380735715161",
  "audience": "CLIENT",
  "code": "062760",
  "sent_at": "2026-10-27T15:02:11.173667041Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f22592e-5828-44e2-899b-7692b1f25bd9",
  "code": "062760",
  "device_ref": "sandbox-32591"
}
```

```json
{
  "session_id": "f5c96944-373a-46cb-bc1e-efdf3461df86",
  "subject": {
    "type": "CLIENT",
    "id": "3fc55516-55a2-4fe7-a547-29ccda3fc100"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmM1NTUxNi01NWEyLTRmZTctYTU0Ny0yOWNjZGEzZmMxMDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjMxLCJpYXQiOjE3OTMxMTMzMzEsImp0aSI6ImY5ZWYyYzVlLWM3MjctNGUzMi04NzBjLTAwNzIwZDJkOTA2OCIsInNpZCI6ImY1Yzk2OTQ0LTM3M2EtNDZjYi1iYzFlLWVmZGYzNDYxZGY4NiJ9.iNwJNUtqFCxPDj61DHD8yRaz6XfIWIoZgfKNn9f-Zvs",
  "access_expires_at": "2026-10-27T15:17:11.222530109Z",
  "refresh_token": "5-lRePu1xnmaFSHai_05F32gg-7ksY-0zNFr2D0V4Lw",
  "refresh_expires_at": "2026-11-26T15:02:11.221621895Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bef436bc-fc41-45b7-b6be-306b9100fce2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4cfb48e3-9412-46e4-90aa-4ae10daf4863",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4cfb48e3-9412-46e4-90aa-4ae10daf4863",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1a12d863e11ec0cd3b48cc4ffa77ed6b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4cfb48e3-9412-46e4-90aa-4ae10daf4863",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735715161"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4cfb48e3-9412-46e4-90aa-4ae10daf4863",
  "expires_at": "2026-10-27T15:32:11.264305Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4cfb48e3-9412-46e4-90aa-4ae10daf4863` → **200**

```json
{
  "id": "4cfb48e3-9412-46e4-90aa-4ae10daf4863",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:32:11.264305Z",
  "card": {
    "id": "9807bba0-ff30-4fa6-9b22-68350fb5233f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7499",
    "card_type": "Visa",
    "created_at": "2026-10-27T15:02:11.302836Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "9807bba0-ff30-4fa6-9b22-68350fb5233f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7499",
      "card_type": "Visa",
      "created_at": "2026-10-27T15:02:11.302836Z"
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
  "device_ref": "sandbox-26967"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "5c5803be-97bd-4f9f-b189-fe65a6bfdee8",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26967"
}
```

```json
{
  "challenge_id": "82aab0a3-4b37-417c-ad46-ca8b674015a5",
  "expires_at": "2026-10-27T15:07:12.396001965Z",
  "resend_available_at": "2026-10-27T15:02:13.396001965Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "030147",
  "sent_at": "2026-10-27T15:02:12.398800438Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82aab0a3-4b37-417c-ad46-ca8b674015a5",
  "code": "030147",
  "device_ref": "sandbox-26967"
}
```

```json
{
  "session_id": "478449da-4e9d-43e9-9e5d-b30b88ec4970",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDIzMiwiaWF0IjoxNzkzMTEzMzMyLCJqdGkiOiJkZjAwYTk0MC00NTljLTQ5N2MtYjgzOC04NTVkYWUwMjY1NDciLCJzaWQiOiI0Nzg0NDlkYS00ZTlkLTQzZTktOWU1ZC1iMzBiODhlYzQ5NzAifQ.B0KOPHlLn2rBePkR7Sh-6k_mvaOIcMG5XaCrdwDqbZ4",
  "access_expires_at": "2026-10-27T15:17:12.444121054Z",
  "refresh_token": "YfGdzf_K0hM1LXGNRoFzIyhPgqfmgTG584CLeO2ZGMc",
  "refresh_expires_at": "2026-11-26T15:02:12.443585576Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
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
  "last_heartbeat_at": "2026-10-27T15:02:10.746195Z",
  "last_location_at": "2026-10-27T15:02:10.746195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98facb84-db65-46f1-b456-617628171e7b/handover` → **200**

```json
{
  "command_id": "55f86c64-6262-47f8-940b-5d1aa8dde59d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
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
  "last_heartbeat_at": "2026-10-27T15:02:10.746195Z",
  "last_location_at": "2026-10-27T15:02:10.746195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98facb84-db65-46f1-b456-617628171e7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:12Z",
    "sequence": 1793113332518
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
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
  "last_heartbeat_at": "2026-10-27T15:02:12.535709Z",
  "last_location_at": "2026-10-27T15:02:12.535709Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "700b4a95-3bcb-442d-b6d5-5897979a7078",
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
  "id": "42aa5bd2-a352-4374-ac14-43d4a03174b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T15:07:12.569394Z",
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
  "command_id": "b6acc119-b536-404d-ad9f-85f4c4d141ee",
  "quote_id": "42aa5bd2-a352-4374-ac14-43d4a03174b7",
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
  "id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3fc55516-55a2-4fe7-a547-29ccda3fc100",
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
  "created_at": "2026-10-27T15:02:12.603152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2` → **200**

```json
{
  "id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3fc55516-55a2-4fe7-a547-29ccda3fc100",
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
  "created_at": "2026-10-27T15:02:12.603152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2` → **200**

```json
{
  "id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3fc55516-55a2-4fe7-a547-29ccda3fc100",
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
  "created_at": "2026-10-27T15:02:12.603152Z",
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
    "id": "479fd84e-7dd6-4f21-9a46-60ac0c6509b7",
    "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
    "expires_at": "2026-10-27T15:02:28.278731Z",
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

`POST /api/driver/v1/offers/479fd84e-7dd6-4f21-9a46-60ac0c6509b7/accept` → **200**

```json
{
  "command_id": "538e9fa7-1453-4abd-85e7-e5e39eb92b82"
}
```

```json
{
  "id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
  "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
  "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "assignment_id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/98facb84-db65-46f1-b456-617628171e7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:13Z",
    "sequence": 1793113333774
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
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
  "last_heartbeat_at": "2026-10-27T15:02:13.791943Z",
  "last_location_at": "2026-10-27T15:02:13.791943Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2acf0ffc-5694-4233-84ec-f1dcbb87e87e/arrive` → **200**

```json
{
  "command_id": "9de0d33a-0cee-44e1-95f1-90798e57e5f9",
  "expected_version": 0
}
```

```json
{
  "id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
  "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "assignment_id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
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
  "arrived_at": "2026-10-27T15:02:13.823756Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/2acf0ffc-5694-4233-84ec-f1dcbb87e87e/start` → **200**

```json
{
  "command_id": "364c2666-c8fe-4df8-a6b8-e6626ebc271a",
  "expected_version": 1
}
```

```json
{
  "id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
  "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "assignment_id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
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
  "arrived_at": "2026-10-27T15:02:13.823756Z",
  "started_at": "2026-10-27T15:02:13.858458Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/2acf0ffc-5694-4233-84ec-f1dcbb87e87e/complete` → **200**

```json
{
  "command_id": "de9c1808-38e2-474a-b589-77471e1aeb2a",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:02:13Z"
}
```

```json
{
  "id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
  "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "assignment_id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
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
  "arrived_at": "2026-10-27T15:02:13.823756Z",
  "started_at": "2026-10-27T15:02:13.858458Z",
  "completed_at": "2026-10-27T15:02:13.895112Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2` → **200**

```json
{
  "id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3fc55516-55a2-4fe7-a547-29ccda3fc100",
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
    "id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
    "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:02:12.603152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2` → **200**

```json
{
  "id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3fc55516-55a2-4fe7-a547-29ccda3fc100",
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
    "id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
    "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:02:12.603152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2` → **200**

```json
{
  "id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3fc55516-55a2-4fe7-a547-29ccda3fc100",
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
    "id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
    "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:02:12.603152Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2` → **200**

```json
{
  "id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "3fc55516-55a2-4fe7-a547-29ccda3fc100",
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
    "id": "cc2e38d8-301c-4b12-8c6b-bc99d7b87897",
    "order_id": "a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2acf0ffc-5694-4233-84ec-f1dcbb87e87e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:02:12.603152Z",
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

Done: card order a1b3f1a0-8458-4b9c-8f00-6ef26b4f09e2.

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
  "device_ref": "sandbox-9688"
}
```

```json
{
  "challenge_id": "e9419db2-ac63-4488-99a8-a1d8954b9b78",
  "expires_at": "2026-10-27T15:07:17.081640872Z",
  "resend_available_at": "2026-10-27T15:02:18.081640872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "107003",
  "sent_at": "2026-10-27T15:02:17.084757389Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9419db2-ac63-4488-99a8-a1d8954b9b78",
  "code": "107003",
  "device_ref": "sandbox-9688"
}
```

```json
{
  "session_id": "07712c5a-8a35-41a1-bce6-87fff6a376ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDIzNywiaWF0IjoxNzkzMTEzMzM3LCJqdGkiOiJlOGM2OTI5YS0yMDc2LTQ0MmEtYTRlNy0xM2U1NTljYmUyYTAiLCJzaWQiOiIwNzcxMmM1YS04YTM1LTQxYTEtYmNlNi04N2ZmZjZhMzc2YWMifQ.lBMHxhHffZiC9fadZYf8g0y6PTQAt0UTW1gT4ZN9ZKY",
  "access_expires_at": "2026-10-27T15:17:17.131440015Z",
  "refresh_token": "ouAPtQD6N_THjwgO3dL06Ets4XJnh4ukC7U50fFeEbY",
  "refresh_expires_at": "2026-11-26T15:02:17.130911035Z",
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
  "command_id": "6aa9a611-ceb5-4159-8074-39547c108fd8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:17Z",
    "sequence": 1793113337176
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:17.191273Z",
  "last_location_at": "2026-10-27T15:02:17.191273Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679638764",
  "device_ref": "sandbox-3159"
}
```

```json
{
  "challenge_id": "9dae4194-1d51-4192-b595-ba7adb9a5dff",
  "expires_at": "2026-10-27T15:07:17.218830612Z",
  "resend_available_at": "2026-10-27T15:02:18.218830612Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679638764` → **200**

```json
{
  "phone": "+380679638764",
  "audience": "CLIENT",
  "code": "929058",
  "sent_at": "2026-10-27T15:02:17.221679394Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9dae4194-1d51-4192-b595-ba7adb9a5dff",
  "code": "929058",
  "device_ref": "sandbox-3159"
}
```

```json
{
  "session_id": "124d1cd2-d262-4355-a926-0942ef752c64",
  "subject": {
    "type": "CLIENT",
    "id": "c0d1a775-6838-4ce5-ad5c-05073a582078"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMGQxYTc3NS02ODM4LTRjZTUtYWQ1Yy0wNTA3M2E1ODIwNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjM3LCJpYXQiOjE3OTMxMTMzMzcsImp0aSI6ImQwMDZkYjIwLWRhZjctNGJlNy05ZDdjLWFmNTk5OGQ4NzkzNyIsInNpZCI6IjEyNGQxY2QyLWQyNjItNDM1NS1hOTI2LTA5NDJlZjc1MmM2NCJ9.d0wIueqHvJZxaZa85-IVTYDWwbRdmfCJUvWFYclFUwY",
  "access_expires_at": "2026-10-27T15:17:17.269914517Z",
  "refresh_token": "pbKHSFw3aGhmlQ-MRf0C845G3Dvj9yiLIhRwM6DzqBs",
  "refresh_expires_at": "2026-11-26T15:02:17.269255948Z",
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
  "command_id": "01539dde-65ae-4ab5-a650-9cbcae06389a",
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
  "id": "6cf244fc-9585-4ada-b4dd-061d0a10b24c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:07:17.328722Z",
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
  "command_id": "f6b0e469-9ee0-4e88-a957-29cca13160d5",
  "platform": "ANDROID",
  "token": "sandbox-driver-14314f49-6af9-48bd-b6c5-09d1471d9d01"
}
```

```json
{
  "id": "a7c285b5-0abc-4cbc-9087-60d675ad28b8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:02:17.369478Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "64578e92-b455-4369-b525-245c5f4803e5",
  "platform": "ANDROID",
  "token": "sandbox-rider-389e0fbf-2d58-476a-800b-0cdde95d838e"
}
```

```json
{
  "id": "5991e11b-a3bf-4fb0-b6bc-17b28e28755f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:02:17.401493Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8747154c-6a87-40b0-a76f-a261e52c93fb",
  "quote_id": "6cf244fc-9585-4ada-b4dd-061d0a10b24c",
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
  "id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0d1a775-6838-4ce5-ad5c-05073a582078",
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
  "created_at": "2026-10-27T15:02:17.437392Z",
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
    "id": "dd9837b2-5262-4b41-aa71-59926516ba9a",
    "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
    "expires_at": "2026-10-27T15:02:32.441241Z",
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

`POST /api/driver/v1/offers/dd9837b2-5262-4b41-aa71-59926516ba9a/accept` → **200**

```json
{
  "command_id": "f5eaab1c-bf83-4f0c-ab5f-ed54cde62c84"
}
```

```json
{
  "id": "275157cd-4fa0-4cd7-976d-434a23b8f87d",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "611ea714-5282-4b01-affa-5b1224184bdc",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:02:17.418Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:02:17.418Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:02:17.418Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:02:19.114253498Z",
    "token_suffix": "1d9d01",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "dd78eae0-87c7-44e7-beb7-d80d445d7047",
      "order_version": "2",
      "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679638764&after=2026-10-27T15:02:17.418Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:02:19.116188012Z",
    "token_suffix": "5d838e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "886628ad-2281-4a1f-8f0c-d3aef00c9b77",
      "order_version": "3",
      "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/5e35d192-a0eb-4037-a70d-2f04c7a8b19a/messages` → **201**

```json
{
  "command_id": "68fe3b91-c5ab-4ad6-bfdc-7b16b88df346",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "4556d7bc-da30-46a9-9ce8-601cc25cec63",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T15:02:19.622919145Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "611ea714-5282-4b01-affa-5b1224184bdc",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "assignment_id": "275157cd-4fa0-4cd7-976d-434a23b8f87d",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/611ea714-5282-4b01-affa-5b1224184bdc/messages` → **201**

```json
{
  "command_id": "54bd38a8-30af-4a24-b30d-60520d44dae1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a1098e1c-40e3-4212-9f5c-41de28c4da3b",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T15:02:19.668794416Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/5e35d192-a0eb-4037-a70d-2f04c7a8b19a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/611ea714-5282-4b01-affa-5b1224184bdc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679638764"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:19Z",
    "sequence": 1793113339730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:19.746205Z",
  "last_location_at": "2026-10-27T15:02:19.746205Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "611ea714-5282-4b01-affa-5b1224184bdc",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "assignment_id": "275157cd-4fa0-4cd7-976d-434a23b8f87d",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/611ea714-5282-4b01-affa-5b1224184bdc/arrive` → **200**

```json
{
  "command_id": "ce98a2e1-a66c-48fe-ba20-54753588890c",
  "expected_version": 0
}
```

```json
{
  "id": "611ea714-5282-4b01-affa-5b1224184bdc",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "assignment_id": "275157cd-4fa0-4cd7-976d-434a23b8f87d",
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
  "arrived_at": "2026-10-27T15:02:19.788537Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/611ea714-5282-4b01-affa-5b1224184bdc/start` → **200**

```json
{
  "command_id": "8157b4ff-f677-42dd-91ad-da216ce3e186",
  "expected_version": 1
}
```

```json
{
  "id": "611ea714-5282-4b01-affa-5b1224184bdc",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "assignment_id": "275157cd-4fa0-4cd7-976d-434a23b8f87d",
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
  "arrived_at": "2026-10-27T15:02:19.788537Z",
  "started_at": "2026-10-27T15:02:19.816124Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:19Z",
    "sequence": 1793113339834
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:19.850857Z",
  "last_location_at": "2026-10-27T15:02:19.850857Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/611ea714-5282-4b01-affa-5b1224184bdc/complete` → **200**

```json
{
  "command_id": "1306388f-3e0d-4498-8d64-913a3acdce59",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:02:19Z",
  "cash_received": true
}
```

```json
{
  "id": "611ea714-5282-4b01-affa-5b1224184bdc",
  "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "assignment_id": "275157cd-4fa0-4cd7-976d-434a23b8f87d",
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
  "arrived_at": "2026-10-27T15:02:19.788537Z",
  "started_at": "2026-10-27T15:02:19.816124Z",
  "completed_at": "2026-10-27T15:02:19.881432Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/5e35d192-a0eb-4037-a70d-2f04c7a8b19a` → **200**

```json
{
  "id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c0d1a775-6838-4ce5-ad5c-05073a582078",
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
    "id": "275157cd-4fa0-4cd7-976d-434a23b8f87d",
    "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "611ea714-5282-4b01-affa-5b1224184bdc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:02:17.437392Z",
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
    "id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:02:17.437392Z",
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
    "id": "611ea714-5282-4b01-affa-5b1224184bdc",
    "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
    "order_short_number": 5,
    "created_at": "2026-10-27T15:02:17.496517Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "79507cc6-81b8-4647-946e-581d6ace7178",
    "order_id": "43c59558-47df-49c2-ad24-d5384ba00891",
    "order_short_number": 1,
    "created_at": "2026-10-27T15:02:06.200755Z",
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
  "session_id": "bb8d428a-5d8a-460b-91ac-c8c620cfb44f",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNDMsImlhdCI6MTc5MzExMzM0MywianRpIjoiZGQ2MzA1OGUtMjIzMi00NDhlLWE2NTUtMDBkOGU0YjBiMzU1Iiwic2lkIjoiYmI4ZDQyOGEtNWQ4YS00NjBiLTkxYWMtYzhjNjIwY2ZiNDRmIn0.2QcpPtiE41Ldy7D9nO5-cm_OI4OQtp0C3qTZTKm4hyU",
  "access_expires_at": "2026-10-27T15:17:23.279835151Z",
  "refresh_token": "mHe0iUxlv-wWHqh-akWzyGu8AsclbsJu855IggwWAuA",
  "refresh_expires_at": "2026-10-28T03:02:23.279179044Z",
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
  "session_id": "623c8866-d7af-4dd9-8469-01ec184f325b",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNDMsImlhdCI6MTc5MzExMzM0MywianRpIjoiNTQzMGM2MTItN2JmMC00Yjg4LWE4MjUtMTg0MDlmYWIzNGY5Iiwic2lkIjoiNjIzYzg4NjYtZDdhZi00ZGQ5LTg0NjktMDFlYzE4NGYzMjViIn0.g8p5tKeQ6gUhbc4fnjylihAh6MOugum6sqhy5erlEcg",
  "access_expires_at": "2026-10-27T15:17:23.585584455Z",
  "refresh_token": "hRQ_zX4vdl6z_VVzpj33_NlygX0VnBj1Q_A5mDnGh8o",
  "refresh_expires_at": "2026-10-28T03:02:23.585015488Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5e35d192-a0eb-4037-a70d-2f04c7a8b19a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:02:17.438062Z",
      "actor": {
        "type": "CLIENT",
        "id": "c0d1a775-6838-4ce5-ad5c-05073a582078",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
        "quote_id": "6cf244fc-9585-4ada-b4dd-061d0a10b24c",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:02:17.440214Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
        "attempt_id": "189db629-3611-4f6d-9ec0-1146955866e0",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:02:17.44582Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dd9837b2-5262-4b41-aa71-59926516ba9a",
        "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:02:17.49857Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "dd9837b2-5262-4b41-aa71-59926516ba9a",
        "order_id": "5e35d192-a0eb-4037-a70d-2f04c7a8b19a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "275157cd-4fa0-4cd7-976d-434a23b8f87d"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 5e35d192-a0eb-4037-a70d-2f04c7a8b19a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6445"
}
```

```json
{
  "challenge_id": "601e4d14-6349-48da-9a0c-bb6d49e3b614",
  "expires_at": "2026-10-27T15:07:23.639050759Z",
  "resend_available_at": "2026-10-27T15:02:24.639050759Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "171269",
  "sent_at": "2026-10-27T15:02:23.641968196Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "601e4d14-6349-48da-9a0c-bb6d49e3b614",
  "code": "171269",
  "device_ref": "sandbox-6445"
}
```

```json
{
  "session_id": "aa90fb3e-aa91-4a1d-a491-56ac1749fbad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI0MywiaWF0IjoxNzkzMTEzMzQzLCJqdGkiOiJjMjQ0ZWVmMC0zNTRlLTQ5ZGQtOTZhYi1kZWYzNDlkNTJmMGMiLCJzaWQiOiJhYTkwZmIzZS1hYTkxLTRhMWQtYTQ5MS01NmFjMTc0OWZiYWQifQ.OkVq2m_3MglcFQNtX71Ymg2d84n2CFtjMRxRh-p02dc",
  "access_expires_at": "2026-10-27T15:17:23.686479109Z",
  "refresh_token": "UOcbOuAZbd-ouCt-QcOHJyaMlGwN9_beOrTjAfUdP1k",
  "refresh_expires_at": "2026-11-26T15:02:23.685717039Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:19.850857Z",
  "last_location_at": "2026-10-27T15:02:19.850857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/handover` → **200**

```json
{
  "command_id": "1c4eb339-f73f-4b7c-8f5c-2b1020ac82a2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:19.850857Z",
  "last_location_at": "2026-10-27T15:02:19.850857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:23Z",
    "sequence": 1793113343760
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:23.776565Z",
  "last_location_at": "2026-10-27T15:02:23.776565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664158838",
  "device_ref": "sandbox-4207"
}
```

```json
{
  "challenge_id": "a7619435-b522-44b0-bb18-ee43efc552c4",
  "expires_at": "2026-10-27T15:07:23.797758469Z",
  "resend_available_at": "2026-10-27T15:02:24.797758469Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664158838` → **200**

```json
{
  "phone": "+380664158838",
  "audience": "CLIENT",
  "code": "495053",
  "sent_at": "2026-10-27T15:02:23.799995334Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7619435-b522-44b0-bb18-ee43efc552c4",
  "code": "495053",
  "device_ref": "sandbox-4207"
}
```

```json
{
  "session_id": "dcc16d34-0693-4453-9ff0-36b93bcc097e",
  "subject": {
    "type": "CLIENT",
    "id": "15cb178e-b0ed-4547-b99c-29b31f9ec315"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWNiMTc4ZS1iMGVkLTQ1NDctYjk5Yy0yOWIzMWY5ZWMzMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjQzLCJpYXQiOjE3OTMxMTMzNDMsImp0aSI6IjdlMDI3NjU3LTA0NGItNGRlOS05NTkxLTA5ZTRhM2IwNTEwNSIsInNpZCI6ImRjYzE2ZDM0LTA2OTMtNDQ1My05ZmYwLTM2YjkzYmNjMDk3ZSJ9.5kbZeVPNQEQwprg8zVFAcagl8pOAfWXWIPEkgpHJGZg",
  "access_expires_at": "2026-10-27T15:17:23.845106546Z",
  "refresh_token": "ipDx5t6JckWpn88J1VOinCvWCnNImiL-U4yaeJWo44c",
  "refresh_expires_at": "2026-11-26T15:02:23.844594534Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e831d295-f931-44ad-9d11-b1fe639e5a41",
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
  "id": "00c019d0-9433-451f-b979-b4cd2870964c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T15:07:23.874984Z",
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
  "command_id": "e0a8c2a2-c48f-4fc8-afdb-e21bbde0c00a",
  "quote_id": "00c019d0-9433-451f-b979-b4cd2870964c",
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
  "id": "000a7425-4d66-403e-822a-23793ba90da4",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15cb178e-b0ed-4547-b99c-29b31f9ec315",
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
  "created_at": "2026-10-27T15:02:23.906038Z",
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
    "id": "ea6c5fb3-ee92-4408-9f6c-f8a9e22d9b97",
    "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
    "expires_at": "2026-10-27T15:02:38.9092Z",
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

`POST /api/driver/v1/offers/ea6c5fb3-ee92-4408-9f6c-f8a9e22d9b97/accept` → **200**

```json
{
  "command_id": "71c73577-cc9a-40aa-9a6e-fa55eee82460"
}
```

```json
{
  "id": "4c42b0db-cd81-4395-965c-de6ead5e86f0",
  "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af294598-de4e-4ce9-b5b9-b169645cb808",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af294598-de4e-4ce9-b5b9-b169645cb808",
  "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
  "assignment_id": "4c42b0db-cd81-4395-965c-de6ead5e86f0",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:23Z",
    "sequence": 1793113343994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:24.01042Z",
  "last_location_at": "2026-10-27T15:02:24.01042Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/af294598-de4e-4ce9-b5b9-b169645cb808/arrive` → **200**

```json
{
  "command_id": "0c551ace-e456-4bf0-ad1c-df7857892783",
  "expected_version": 0
}
```

```json
{
  "id": "af294598-de4e-4ce9-b5b9-b169645cb808",
  "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
  "assignment_id": "4c42b0db-cd81-4395-965c-de6ead5e86f0",
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
  "arrived_at": "2026-10-27T15:02:24.039535Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/af294598-de4e-4ce9-b5b9-b169645cb808/start` → **200**

```json
{
  "command_id": "e0428374-fab7-4f2b-8435-5ec2f346d784",
  "expected_version": 1
}
```

```json
{
  "id": "af294598-de4e-4ce9-b5b9-b169645cb808",
  "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
  "assignment_id": "4c42b0db-cd81-4395-965c-de6ead5e86f0",
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
  "arrived_at": "2026-10-27T15:02:24.039535Z",
  "started_at": "2026-10-27T15:02:24.070816Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:24Z",
    "sequence": 1793113344923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:24.107488Z",
  "last_location_at": "2026-10-27T15:02:24.107488Z",
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
  "device_ref": "sandbox-4178"
}
```

```json
{
  "challenge_id": "8725f556-121d-496e-82d3-3d373e9e10c9",
  "expires_at": "2026-10-27T15:07:24.12754527Z",
  "resend_available_at": "2026-10-27T15:02:25.12754527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "172487",
  "sent_at": "2026-10-27T15:02:24.129788595Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8725f556-121d-496e-82d3-3d373e9e10c9",
  "code": "172487",
  "device_ref": "sandbox-4178"
}
```

```json
{
  "session_id": "547460b5-3dac-4150-81d0-d4f5daea2632",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI0NCwiaWF0IjoxNzkzMTEzMzQ0LCJqdGkiOiJlMzY0MzdlMi04MGE0LTQ3MWEtOWUwNy1kNDU4ODgwZjAxN2IiLCJzaWQiOiI1NDc0NjBiNS0zZGFjLTQxNTAtODFkMC1kNGY1ZGFlYTI2MzIifQ.kKEUh1CW06QpjLpfmSwq3Ex_cIt6Kbh5J6FlDVeuMXs",
  "access_expires_at": "2026-10-27T15:17:24.173416302Z",
  "refresh_token": "nPHByBtz-vPD_QiXSMGgP3Wp54_eIMWZFTkhTYrD6oc",
  "refresh_expires_at": "2026-11-26T15:02:24.172876007Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9276868f-dc22-4937-97d8-ca06dcdd67a1",
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
  "last_heartbeat_at": "2026-10-27T15:02:10.613342Z",
  "last_location_at": "2026-10-27T15:02:10.613342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9276868f-dc22-4937-97d8-ca06dcdd67a1/handover` → **200**

```json
{
  "command_id": "0ce2cf87-0fac-4fbf-908e-a6ca7169a339",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9276868f-dc22-4937-97d8-ca06dcdd67a1",
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
  "last_heartbeat_at": "2026-10-27T15:02:10.613342Z",
  "last_location_at": "2026-10-27T15:02:10.613342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9276868f-dc22-4937-97d8-ca06dcdd67a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:24Z",
    "sequence": 1793113344924
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9276868f-dc22-4937-97d8-ca06dcdd67a1",
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
  "last_heartbeat_at": "2026-10-27T15:02:24.254685Z",
  "last_location_at": "2026-10-27T15:02:24.254685Z",
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
  "session_id": "696fe60f-4424-4ee3-b2d9-9167bcdada32",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNDQsImlhdCI6MTc5MzExMzM0NCwianRpIjoiNGFjMTgyZjItY2QwZi00OWI5LWExZTYtZWUyNzgyNmQ5ZWM1Iiwic2lkIjoiNjk2ZmU2MGYtNDQyNC00ZWUzLWIyZDktOTE2N2JjZGFkYTMyIn0.qrBszqx70gIek6ZO6VMYQZcwI0Yo5nOIuHH6oRUmzF0",
  "access_expires_at": "2026-10-27T15:17:24.561100578Z",
  "refresh_token": "eLGjlbapLSxikXzvFTIis7App8iQrjDByaf9KQ4Lia0",
  "refresh_expires_at": "2026-10-28T03:02:24.560527855Z",
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
  "session_id": "85f8b6d6-381c-4734-bf26-23b8e7878bde",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNDQsImlhdCI6MTc5MzExMzM0NCwianRpIjoiYjFjNjY3NTAtYTE1Mi00NDk4LTlkMTgtNjQxMDYwZjZiNGMzIiwic2lkIjoiODVmOGI2ZDYtMzgxYy00NzM0LWJmMjYtMjNiOGU3ODc4YmRlIn0.popxnzYQfAhkyQa0Vgk3OQW1ckVFXJTm18XD2r9Omjk",
  "access_expires_at": "2026-10-27T15:17:24.867250894Z",
  "refresh_token": "TgK3iWEFzxqAXVUu0QW7DBfRVKE0OGm1_Ezl2qrJoNc",
  "refresh_expires_at": "2026-10-28T03:02:24.866669109Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/000a7425-4d66-403e-822a-23793ba90da4` → **200**

```json
{
  "id": "000a7425-4d66-403e-822a-23793ba90da4",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "15cb178e-b0ed-4547-b99c-29b31f9ec315",
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
    "id": "4c42b0db-cd81-4395-965c-de6ead5e86f0",
    "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "af294598-de4e-4ce9-b5b9-b169645cb808",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T15:02:23.906038Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/000a7425-4d66-403e-822a-23793ba90da4/interrupt` → **200**

```json
{
  "command_id": "da590302-1ce6-4ce3-88fe-37bb0ff4fb2d",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "000a7425-4d66-403e-822a-23793ba90da4",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "15cb178e-b0ed-4547-b99c-29b31f9ec315",
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
      "id": "4c42b0db-cd81-4395-965c-de6ead5e86f0",
      "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "af294598-de4e-4ce9-b5b9-b169645cb808",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T15:02:23.906038Z",
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
    "id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "15cb178e-b0ed-4547-b99c-29b31f9ec315",
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
    "id": "ca08ba54-5c25-4038-b842-d6d625774caf",
    "order_id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
    "expires_at": "2026-10-27T15:02:39.943053Z",
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

`POST /api/driver/v1/offers/ca08ba54-5c25-4038-b842-d6d625774caf/accept` → **200**

```json
{
  "command_id": "d53c9698-a3bc-4b0f-a577-7d761c486239"
}
```

```json
{
  "id": "974b84fb-809c-44e5-aac7-398b2b8370f6",
  "order_id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d79d6c56-8337-41e4-8643-c59947b617df",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d79d6c56-8337-41e4-8643-c59947b617df",
  "order_id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
  "assignment_id": "974b84fb-809c-44e5-aac7-398b2b8370f6",
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
  "discount_minor": 0
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9276868f-dc22-4937-97d8-ca06dcdd67a1",
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
  "last_heartbeat_at": "2026-10-27T15:02:24.254685Z",
  "last_location_at": "2026-10-27T15:02:24.254685Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9276868f-dc22-4937-97d8-ca06dcdd67a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:25Z",
    "sequence": 1793113345558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9276868f-dc22-4937-97d8-ca06dcdd67a1",
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
  "last_heartbeat_at": "2026-10-27T15:02:25.07085Z",
  "last_location_at": "2026-10-27T15:02:25.07085Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d79d6c56-8337-41e4-8643-c59947b617df/arrive` → **200**

```json
{
  "command_id": "73e3c6b1-e5e2-4b0e-8d44-db8f69b9c286",
  "expected_version": 0
}
```

```json
{
  "id": "d79d6c56-8337-41e4-8643-c59947b617df",
  "order_id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
  "assignment_id": "974b84fb-809c-44e5-aac7-398b2b8370f6",
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
  "arrived_at": "2026-10-27T15:02:25.099746Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/d79d6c56-8337-41e4-8643-c59947b617df/start` → **200**

```json
{
  "command_id": "f23a7711-e3e2-4234-9b94-6932f4192884",
  "expected_version": 1
}
```

```json
{
  "id": "d79d6c56-8337-41e4-8643-c59947b617df",
  "order_id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
  "assignment_id": "974b84fb-809c-44e5-aac7-398b2b8370f6",
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
  "arrived_at": "2026-10-27T15:02:25.099746Z",
  "started_at": "2026-10-27T15:02:25.134908Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/d79d6c56-8337-41e4-8643-c59947b617df/complete` → **200**

```json
{
  "command_id": "a48bccb4-5adf-4b92-a171-29b8d62c7004",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:02:25Z"
}
```

```json
{
  "id": "d79d6c56-8337-41e4-8643-c59947b617df",
  "order_id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
  "assignment_id": "974b84fb-809c-44e5-aac7-398b2b8370f6",
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
  "arrived_at": "2026-10-27T15:02:25.099746Z",
  "started_at": "2026-10-27T15:02:25.134908Z",
  "completed_at": "2026-10-27T15:02:25.171774Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "e9f27155-4d6b-47eb-b60c-78f4d2f643a1",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:02:24.93202Z",
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
    "id": "000a7425-4d66-403e-822a-23793ba90da4",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:02:23.906038Z",
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
      "balance_minor": 11113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/000a7425-4d66-403e-822a-23793ba90da4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:02:23.906616Z",
      "actor": {
        "type": "CLIENT",
        "id": "15cb178e-b0ed-4547-b99c-29b31f9ec315",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
        "quote_id": "00c019d0-9433-451f-b979-b4cd2870964c",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:02:23.908341Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
        "attempt_id": "74d0295b-7ae8-4b87-8834-cfa9efc31e53",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:02:23.913895Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ea6c5fb3-ee92-4408-9f6c-f8a9e22d9b97",
        "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:02:23.961646Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ea6c5fb3-ee92-4408-9f6c-f8a9e22d9b97",
        "order_id": "000a7425-4d66-403e-822a-23793ba90da4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4c42b0db-cd81-4395-965c-de6ead5e86f0"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 000a7425-4d66-403e-822a-23793ba90da4, follow-up e9f27155-4d6b-47eb-b60c-78f4d2f643a1.

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
  "session_id": "abfb132f-daaf-4fdd-924d-427032ba5e31",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNDgsImlhdCI6MTc5MzExMzM0OCwianRpIjoiZjcyZGJlMzAtNmRiYy00N2E5LTk1YzQtOTEwY2Q1M2FiNzBjIiwic2lkIjoiYWJmYjEzMmYtZGFhZi00ZmRkLTkyNGQtNDI3MDMyYmE1ZTMxIn0.3IUVRO_3kvlOvuRV-da1cf5FEI0djiwRl2HTp7f7gNY",
  "access_expires_at": "2026-10-27T15:17:28.558792452Z",
  "refresh_token": "lzWeifniZYvM8Uwlqk7mJiDLbPTXQNVeClDAr3pcg1U",
  "refresh_expires_at": "2026-10-28T03:02:28.558250914Z",
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
  "session_id": "8dae75e9-d95b-43fa-ba9c-5de842d44379",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNDgsImlhdCI6MTc5MzExMzM0OCwianRpIjoiYzM3NDZkMzEtM2QwMS00YzE1LWI2MzYtN2JhMTBlOWY5MDU5Iiwic2lkIjoiOGRhZTc1ZTktZDk1Yi00M2ZhLWJhOWMtNWRlODQyZDQ0Mzc5In0.7E_AewgGpqgjJuAYetdKqFJmNoDrwINZQWW9nXbrk_A",
  "access_expires_at": "2026-10-27T15:17:28.863790641Z",
  "refresh_token": "4aIeP6cAh4xwkxeNg2qLeeyVz1hGe8NYiqqxyAWfYbU",
  "refresh_expires_at": "2026-10-28T03:02:28.863160572Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23226"
}
```

```json
{
  "challenge_id": "a120a443-2aca-4698-b4e7-e688be4fa7cc",
  "expires_at": "2026-10-27T15:07:28.884780842Z",
  "resend_available_at": "2026-10-27T15:02:29.884780842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "885934",
  "sent_at": "2026-10-27T15:02:28.886918465Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a120a443-2aca-4698-b4e7-e688be4fa7cc",
  "code": "885934",
  "device_ref": "sandbox-23226"
}
```

```json
{
  "session_id": "7a8994d8-98e6-4d91-aa55-09cfc9abe78c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI0OCwiaWF0IjoxNzkzMTEzMzQ4LCJqdGkiOiJmMTQwNGExZC0wY2YzLTRmNzItYTQyYy00NWE4N2ZiYWYyOTgiLCJzaWQiOiI3YTg5OTRkOC05OGU2LTRkOTEtYWE1NS0wOWNmYzlhYmU3OGMifQ.B2NYO2y187Wgsle-cXLiMXHwoe7xbs1ceCLZ1g8kiHw",
  "access_expires_at": "2026-10-27T15:17:28.930727629Z",
  "refresh_token": "ey30I2dI5FcsENLJ6dZrGbp94I2v8jG6z8ympklIK-c",
  "refresh_expires_at": "2026-11-26T15:02:28.930083602Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:24.107488Z",
  "last_location_at": "2026-10-27T15:02:24.107488Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/handover` → **200**

```json
{
  "command_id": "14074412-3e35-47d6-b006-fe293ebea477",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:24.107488Z",
  "last_location_at": "2026-10-27T15:02:24.107488Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:28Z",
    "sequence": 1793113349159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:29.016688Z",
  "last_location_at": "2026-10-27T15:02:29.016688Z",
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
  "command_id": "4e8a1299-6b4c-4a56-8a52-6668e2e9e3a1",
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
  "effective_at": "2026-10-27T15:02:29.079756Z",
  "changed_by": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T15:02:29.104798414Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "34e85f38-d03e-482c-b8da-876de7cae33d",
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
  "id": "95b81a9f-6f44-4ef7-9410-c694dc8d786f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:07:29.140569Z",
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
  "command_id": "f3376d22-7a44-4b7a-a05d-97ca395c1bc8",
  "quote_id": "95b81a9f-6f44-4ef7-9410-c694dc8d786f",
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
    "phone": "+380671114847"
  }
}
```

```json
{
  "id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
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
  "created_at": "2026-10-27T15:02:29.187004Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114847"
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
    "id": "6ce2c114-1d23-41d1-953b-4ac01150c5e7",
    "order_id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
    "expires_at": "2026-10-27T15:02:44.191478Z",
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

`POST /api/driver/v1/offers/6ce2c114-1d23-41d1-953b-4ac01150c5e7/accept` → **200**

```json
{
  "command_id": "999206f3-c0f6-4ad1-9180-44d406d2311d"
}
```

```json
{
  "id": "64df4087-7c15-4270-b47f-7dc881bf9ab0",
  "order_id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3597670e-1e80-4b5e-8794-caf08cc256ea",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3597670e-1e80-4b5e-8794-caf08cc256ea",
  "order_id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
  "assignment_id": "64df4087-7c15-4270-b47f-7dc881bf9ab0",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:29Z",
    "sequence": 1793113349278
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:29.293804Z",
  "last_location_at": "2026-10-27T15:02:29.293804Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3597670e-1e80-4b5e-8794-caf08cc256ea/arrive` → **200**

```json
{
  "command_id": "e24ec70a-5f0d-4bf2-9c08-ffeccdf2b92c",
  "expected_version": 0
}
```

```json
{
  "id": "3597670e-1e80-4b5e-8794-caf08cc256ea",
  "order_id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
  "assignment_id": "64df4087-7c15-4270-b47f-7dc881bf9ab0",
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
  "arrived_at": "2026-10-27T15:02:29.323787Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3597670e-1e80-4b5e-8794-caf08cc256ea/start` → **200**

```json
{
  "command_id": "eefe9314-0797-4256-bc29-ce99aaf69e31",
  "expected_version": 1
}
```

```json
{
  "id": "3597670e-1e80-4b5e-8794-caf08cc256ea",
  "order_id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
  "assignment_id": "64df4087-7c15-4270-b47f-7dc881bf9ab0",
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
  "arrived_at": "2026-10-27T15:02:29.323787Z",
  "started_at": "2026-10-27T15:02:29.356085Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3597670e-1e80-4b5e-8794-caf08cc256ea/complete` → **200**

```json
{
  "command_id": "8a32afcb-5c7b-41f7-abb5-210f4daf2ca1",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:02:29Z",
  "cash_received": true
}
```

```json
{
  "id": "3597670e-1e80-4b5e-8794-caf08cc256ea",
  "order_id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
  "assignment_id": "64df4087-7c15-4270-b47f-7dc881bf9ab0",
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
  "arrived_at": "2026-10-27T15:02:29.323787Z",
  "started_at": "2026-10-27T15:02:29.356085Z",
  "completed_at": "2026-10-27T15:02:29.390762Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b50e7860-e7cb-4cd7-9d1c-809f1530bcbc",
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
  "id": "fbc6c771-0328-488c-be36-a1c965b1af95",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:07:29.428958Z",
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
  "command_id": "efa2d6c4-d984-4ceb-be0c-1aa7a68f0d4f",
  "quote_id": "fbc6c771-0328-488c-be36-a1c965b1af95",
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
    "phone": "+3806711114190"
  }
}
```

```json
{
  "id": "d6700ddf-4016-455d-9d00-81f20e09df96",
  "short_number": 9,
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
  "created_at": "2026-10-27T15:02:29.461033Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114190"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d6700ddf-4016-455d-9d00-81f20e09df96` → **200**

```json
{
  "id": "d6700ddf-4016-455d-9d00-81f20e09df96",
  "short_number": 9,
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
  "created_at": "2026-10-27T15:02:29.461033Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114190"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d6700ddf-4016-455d-9d00-81f20e09df96/cancel` → **200**

```json
{
  "command_id": "d71a0f57-50c0-462d-bec7-da87cc59f25c",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d6700ddf-4016-455d-9d00-81f20e09df96",
  "short_number": 9,
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
  "created_at": "2026-10-27T15:02:29.461033Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114190"
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
  "staff_id": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T15:02:29.396671Z",
  "last_entries": [
    {
      "order_id": "d6700ddf-4016-455d-9d00-81f20e09df96",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T15:02:29.536916Z"
    },
    {
      "order_id": "f415b0c6-6b4a-469a-894b-95fe87d237bc",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T15:02:29.396671Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "519e8351-c108-4ec2-91c8-f148936300d4",
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
  "last_heartbeat_at": "2026-10-27T15:02:29.293804Z",
  "last_location_at": "2026-10-27T15:02:29.293804Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/519e8351-c108-4ec2-91c8-f148936300d4/close` → **200**

```json
{
  "command_id": "b20ebde9-e353-4527-85b8-7209a1ad37c3",
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

Done: operator bonus for fulfilled f415b0c6-6b4a-469a-894b-95fe87d237bc and operator-fault cancellation d6700ddf-4016-455d-9d00-81f20e09df96.

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
  "session_id": "8bdd41ef-6833-443d-af1d-24053b4df4d4",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTEsImlhdCI6MTc5MzExMzM1MSwianRpIjoiZTlmYTY0MzAtMDUzZS00ZTk0LWE5ZDAtNWZkZTFiZTI1NzUzIiwic2lkIjoiOGJkZDQxZWYtNjgzMy00NDNkLWFmMWQtMjQwNTNiNGRmNGQ0In0.AZSAndSuQf0QrcdcDAfUO3R7wZ0UBOldDbg56YHKNfM",
  "access_expires_at": "2026-10-27T15:17:31.954864773Z",
  "refresh_token": "DSj6rkJmmchDGh0xvu1qFDUZbTNOMgwQ6XKQY9lsXAI",
  "refresh_expires_at": "2026-10-28T03:02:31.954312448Z",
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
  "command_id": "c5a20388-558d-417f-a666-eef7a788a423",
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
    }
  },
  "changed_by": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T15:02:32.017337583Z"
}
```

## The rider books the airport for 2026-10-27T18:02:31Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600297818",
  "device_ref": "sandbox-19329"
}
```

```json
{
  "challenge_id": "7ac9ee9b-a554-4faa-a19b-f4aabfe270a9",
  "expires_at": "2026-10-27T15:07:32.044523117Z",
  "resend_available_at": "2026-10-27T15:02:33.044523117Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600297818` → **200**

```json
{
  "phone": "+48600297818",
  "audience": "CLIENT",
  "code": "792883",
  "sent_at": "2026-10-27T15:02:32.04686531Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ac9ee9b-a554-4faa-a19b-f4aabfe270a9",
  "code": "792883",
  "device_ref": "sandbox-19329"
}
```

```json
{
  "session_id": "5aa9641f-9b83-48d5-a235-624b7fef5f77",
  "subject": {
    "type": "CLIENT",
    "id": "e46acdbe-add7-4013-bd07-870dd3aa0580"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDZhY2RiZS1hZGQ3LTQwMTMtYmQwNy04NzBkZDNhYTA1ODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjUyLCJpYXQiOjE3OTMxMTMzNTIsImp0aSI6IjBkODhlYjRjLTI5NzQtNGQxMC04MzgwLWI0YjY1NjM3NzhkYyIsInNpZCI6IjVhYTk2NDFmLTliODMtNDhkNS1hMjM1LTYyNGI3ZmVmNWY3NyJ9.zbIfidc9fUimtB_Qe_8M4t5rRUv8hIap337_Oul7O-Y",
  "access_expires_at": "2026-10-27T15:17:32.089693685Z",
  "refresh_token": "-jBabU7RCXL9LlkoiaCALbJ41KToo7mRpZ4Yg4EXMR0",
  "refresh_expires_at": "2026-11-26T15:02:32.089107206Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3e3d353-0f8a-4537-9944-b0f1d6f8582e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T18:02:31Z"
}
```

```json
{
  "id": "a08fe6d7-0dc3-40f2-9872-f46dfd965697",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T15:07:32.120654Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T18:02:31Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d3e8b878-f54e-4f01-b543-e6d87b42514a",
  "quote_id": "a08fe6d7-0dc3-40f2-9872-f46dfd965697",
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
  "pickup_at": "2026-10-27T18:02:31Z"
}
```

```json
{
  "id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e46acdbe-add7-4013-bd07-870dd3aa0580",
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
  "created_at": "2026-10-27T15:02:32.153765Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T18:02:31Z",
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
  "device_ref": "sandbox-8603"
}
```

```json
{
  "challenge_id": "f00c9cd4-24c0-4c70-b775-3082005963c2",
  "expires_at": "2026-10-27T15:07:32.180738627Z",
  "resend_available_at": "2026-10-27T15:02:33.180738627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "734863",
  "sent_at": "2026-10-27T15:02:32.182829765Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f00c9cd4-24c0-4c70-b775-3082005963c2",
  "code": "734863",
  "device_ref": "sandbox-8603"
}
```

```json
{
  "session_id": "db033c46-d6d4-45c8-b2e8-f8d0bf29e270",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI1MiwiaWF0IjoxNzkzMTEzMzUyLCJqdGkiOiJmMDE5NGM3OC00Y2M3LTQyYjctOTI3My04OGM0N2MwNTU5MWUiLCJzaWQiOiJkYjAzM2M0Ni1kNmQ0LTQ1YzgtYjJlOC1mOGQwYmYyOWUyNzAifQ.Lrl5uOXVJdaR3wt1BBey8FUmi7TDoml98--SmTmIXq0",
  "access_expires_at": "2026-10-27T15:17:32.227833645Z",
  "refresh_token": "67xPLHSpul-WjrmUyyZV9VPThVw4eTuv-o9zK80bLHE",
  "refresh_expires_at": "2026-11-26T15:02:32.227304092Z",
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
  "command_id": "8d764d5a-d95c-4314-ac2b-17206e915977",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:32Z",
    "sequence": 1793113352267
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0dd2da7a-e0d3-4275-9d1e-a6989fdeabed",
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
  "last_heartbeat_at": "2026-10-27T15:02:32.282906Z",
  "last_location_at": "2026-10-27T15:02:32.282906Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
      "short_number": 10,
      "pickup_at": "2026-10-27T18:02:31Z",
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

`POST /api/driver/v1/preorders/a19d0186-0553-4cfd-b50b-64cbe189a90e/reserve` → **200**

```json
{
  "command_id": "6c0896d7-ce0a-4d4d-ad0f-e83874596c27"
}
```

```json
{
  "id": "61400bc7-d01c-4060-bbbe-b8b9ec3497f4",
  "state": "RESERVED",
  "order": {
    "order_id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
    "short_number": 10,
    "pickup_at": "2026-10-27T18:02:31Z",
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
  "reserved_at": "2026-10-27T15:02:32.340155Z",
  "confirm_from": "2026-10-27T17:32:31Z",
  "confirm_until": "2026-10-27T17:42:31Z",
  "drop_until": "2026-10-27T17:02:31Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "61400bc7-d01c-4060-bbbe-b8b9ec3497f4",
      "state": "RESERVED",
      "order": {
        "order_id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:02:31Z",
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
      "reserved_at": "2026-10-27T15:02:32.340155Z",
      "confirm_from": "2026-10-27T17:32:31Z",
      "confirm_until": "2026-10-27T17:42:31Z",
      "drop_until": "2026-10-27T17:02:31Z"
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
      "id": "61400bc7-d01c-4060-bbbe-b8b9ec3497f4",
      "state": "RESERVED",
      "order": {
        "order_id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:02:31Z",
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
      "reserved_at": "2026-10-27T15:02:32.340155Z",
      "confirm_from": "2026-10-27T17:32:31Z",
      "confirm_until": "2026-10-27T17:42:31Z",
      "drop_until": "2026-10-27T17:02:31Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/61400bc7-d01c-4060-bbbe-b8b9ec3497f4/confirm` → **409**

```json
{
  "command_id": "eca5f097-5a4d-47de-a103-9079e47fc495"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/61400bc7-d01c-4060-bbbe-b8b9ec3497f4/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "87c3eaaa-826d-4813-95b0-a0c944e3a0dd"
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
  "session_id": "a464845d-ba05-4412-83a8-b32adc4ff5de",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTIsImlhdCI6MTc5MzExMzM1MiwianRpIjoiNTBlYWNkMzAtMmJhNy00YjdlLWEwNWItOTVhNzlhOTdhYmIzIiwic2lkIjoiYTQ2NDg0NWQtYmEwNS00NDEyLTgzYTgtYjMyYWRjNGZmNWRlIn0.SL-sGwFTp6d5nksywXI8VgvldYCQlmaBL-ALDSdmQ_0",
  "access_expires_at": "2026-10-27T15:17:32.71893796Z",
  "refresh_token": "5JSdbf8vNGM7h0TtsRNPGu7qYcMOEzIK_OSoRpkxXms",
  "refresh_expires_at": "2026-10-28T03:02:32.718331591Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a19d0186-0553-4cfd-b50b-64cbe189a90e` → **200**

```json
{
  "id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e46acdbe-add7-4013-bd07-870dd3aa0580",
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
  "created_at": "2026-10-27T15:02:32.153765Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T18:02:31Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "61400bc7-d01c-4060-bbbe-b8b9ec3497f4",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T15:02:32.340155Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a19d0186-0553-4cfd-b50b-64cbe189a90e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T15:02:32.155371Z",
      "actor": {
        "type": "CLIENT",
        "id": "e46acdbe-add7-4013-bd07-870dd3aa0580",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
        "preorder": true,
        "quote_id": "a08fe6d7-0dc3-40f2-9872-f46dfd965697",
        "pickup_at": "2026-10-27T18:02:31Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T15:02:32.341246Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a19d0186-0553-4cfd-b50b-64cbe189a90e",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "61400bc7-d01c-4060-bbbe-b8b9ec3497f4"
      }
    }
  ]
}
```

Done: pre-order a19d0186-0553-4cfd-b50b-64cbe189a90e, reservation 61400bc7-d01c-4060-bbbe-b8b9ec3497f4.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26482"
}
```

```json
{
  "challenge_id": "cc5e8baf-8ddd-476a-8866-3d86f9eae833",
  "expires_at": "2026-10-27T15:07:32.794934512Z",
  "resend_available_at": "2026-10-27T15:02:33.794934512Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "805787",
  "sent_at": "2026-10-27T15:02:32.796948651Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc5e8baf-8ddd-476a-8866-3d86f9eae833",
  "code": "805787",
  "device_ref": "sandbox-26482"
}
```

```json
{
  "session_id": "38d7fd27-1f4c-47fb-a0f8-d8e9e219a9d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI1MiwiaWF0IjoxNzkzMTEzMzUyLCJqdGkiOiJmZTlmNGI4OS1jMmYyLTRiZWMtYWQ5Mi01MzllYWZmYjdiNDgiLCJzaWQiOiIzOGQ3ZmQyNy0xZjRjLTQ3ZmItYTBmOC1kOGU5ZTIxOWE5ZDYifQ.arWAhdt3bhfB50ObDca0OXTuq4xY-UIwBs_muHiZQ-g",
  "access_expires_at": "2026-10-27T15:17:32.840601871Z",
  "refresh_token": "cm56B4im_4LL38YJ6BCxunCZ9zm9jD4FBywBrMUen9c",
  "refresh_expires_at": "2026-11-26T15:02:32.839899196Z",
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
  "command_id": "8595b4c9-5235-4774-95f1-e736a735e328",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:32Z",
    "sequence": 1793113352881
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "581c641f-8ac0-4587-96a2-27ca66867488",
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
  "last_heartbeat_at": "2026-10-27T15:02:32.896068Z",
  "last_location_at": "2026-10-27T15:02:32.896068Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678421205",
  "device_ref": "sandbox-23133"
}
```

```json
{
  "challenge_id": "01ffd3bf-f190-4744-a742-c8aeecd09dab",
  "expires_at": "2026-10-27T15:07:32.919494039Z",
  "resend_available_at": "2026-10-27T15:02:33.919494039Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678421205` → **200**

```json
{
  "phone": "+380678421205",
  "audience": "CLIENT",
  "code": "309688",
  "sent_at": "2026-10-27T15:02:32.921358172Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01ffd3bf-f190-4744-a742-c8aeecd09dab",
  "code": "309688",
  "device_ref": "sandbox-23133"
}
```

```json
{
  "session_id": "8abedaea-8a69-457c-91ac-ad40092d7b7e",
  "subject": {
    "type": "CLIENT",
    "id": "af872c5c-6344-4641-809f-3e2c6afd1f90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjg3MmM1Yy02MzQ0LTQ2NDEtODA5Zi0zZTJjNmFmZDFmOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjUyLCJpYXQiOjE3OTMxMTMzNTIsImp0aSI6IjBiMGZhMWMzLTE0NmUtNDg2MS05N2UyLTFhYzg0OTM1OGNlNCIsInNpZCI6IjhhYmVkYWVhLThhNjktNDU3Yy05MWFjLWFkNDAwOTJkN2I3ZSJ9.3-u0TjS1xy5xn5ayzil6p_ZhZ6WuYD688HwLKFOcXxE",
  "access_expires_at": "2026-10-27T15:17:32.966182916Z",
  "refresh_token": "cQafqN-UTVELAgzyxsWL9uRxqfLmrQcZZzFdflNxCUg",
  "refresh_expires_at": "2026-11-26T15:02:32.965672674Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "72216b79-f531-4112-b525-99dbd0a82fd3",
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
  "id": "64de978c-d15d-4447-a7eb-f1d3dd4863a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:07:32.996602Z",
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
  "command_id": "5364f013-752f-44c6-96b9-05091a5fe98f",
  "quote_id": "64de978c-d15d-4447-a7eb-f1d3dd4863a7",
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
  "id": "412bb125-8270-415c-943c-3c2dea361e81",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "af872c5c-6344-4641-809f-3e2c6afd1f90",
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
  "created_at": "2026-10-27T15:02:33.036519Z",
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
    "id": "91b360c1-fc4f-425d-abf0-681de59ce88f",
    "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
    "expires_at": "2026-10-27T15:02:48.039772Z",
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

`POST /api/driver/v1/offers/91b360c1-fc4f-425d-abf0-681de59ce88f/accept` → **200**

```json
{
  "command_id": "ced35f1b-11f8-4dd1-8cf2-1d5028ad443a"
}
```

```json
{
  "id": "7c52e96a-efcd-4b16-9f1b-c1af0e20e587",
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2860aad2-52e0-43a1-9618-c95a4a4c5afb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2860aad2-52e0-43a1-9618-c95a4a4c5afb",
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "assignment_id": "7c52e96a-efcd-4b16-9f1b-c1af0e20e587",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/581c641f-8ac0-4587-96a2-27ca66867488/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:33Z",
    "sequence": 1793113353127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "581c641f-8ac0-4587-96a2-27ca66867488",
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
  "last_heartbeat_at": "2026-10-27T15:02:33.142015Z",
  "last_location_at": "2026-10-27T15:02:33.142015Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2860aad2-52e0-43a1-9618-c95a4a4c5afb",
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "assignment_id": "7c52e96a-efcd-4b16-9f1b-c1af0e20e587",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/2860aad2-52e0-43a1-9618-c95a4a4c5afb/arrive` → **200**

```json
{
  "command_id": "e0486f1d-0513-4ac8-b8d3-bddcf77d1ee2",
  "expected_version": 0
}
```

```json
{
  "id": "2860aad2-52e0-43a1-9618-c95a4a4c5afb",
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "assignment_id": "7c52e96a-efcd-4b16-9f1b-c1af0e20e587",
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
  "arrived_at": "2026-10-27T15:02:33.182619Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/2860aad2-52e0-43a1-9618-c95a4a4c5afb/start` → **200**

```json
{
  "command_id": "2f4893e3-a3ff-46a7-97cd-f4f715af7f2b",
  "expected_version": 1
}
```

```json
{
  "id": "2860aad2-52e0-43a1-9618-c95a4a4c5afb",
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "assignment_id": "7c52e96a-efcd-4b16-9f1b-c1af0e20e587",
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
  "arrived_at": "2026-10-27T15:02:33.182619Z",
  "started_at": "2026-10-27T15:02:33.212224Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/581c641f-8ac0-4587-96a2-27ca66867488/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:33Z",
    "sequence": 1793113353232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "581c641f-8ac0-4587-96a2-27ca66867488",
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
  "last_heartbeat_at": "2026-10-27T15:02:33.248107Z",
  "last_location_at": "2026-10-27T15:02:33.248107Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/2860aad2-52e0-43a1-9618-c95a4a4c5afb/complete` → **200**

```json
{
  "command_id": "5d254360-9539-4f34-be15-b5b1c60dad3d",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:02:33Z",
  "cash_received": true
}
```

```json
{
  "id": "2860aad2-52e0-43a1-9618-c95a4a4c5afb",
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "assignment_id": "7c52e96a-efcd-4b16-9f1b-c1af0e20e587",
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
  "arrived_at": "2026-10-27T15:02:33.182619Z",
  "started_at": "2026-10-27T15:02:33.212224Z",
  "completed_at": "2026-10-27T15:02:33.275288Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/412bb125-8270-415c-943c-3c2dea361e81/rating` → **200**

```json
{
  "command_id": "20f429ae-a437-4538-b29d-a462a05edd4b",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "score": 5,
  "created_at": "2026-10-27T15:02:33.314513529Z"
}
```

`POST /api/driver/v1/orders/412bb125-8270-415c-943c-3c2dea361e81/rating` → **200**

```json
{
  "command_id": "6010e18a-18f8-4de7-a785-238e8f5517d2",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
  "score": 4,
  "created_at": "2026-10-27T15:02:33.345102233Z"
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
  "session_id": "491f0e26-a0b1-4f4e-a4f4-d2b513891097",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTMsImlhdCI6MTc5MzExMzM1MywianRpIjoiYWQyYzgzZDMtNDczYy00NWE5LTlhYTctN2UyZjZiMDdjZDYwIiwic2lkIjoiNDkxZjBlMjYtYTBiMS00ZjRlLWE0ZjQtZDJiNTEzODkxMDk3In0.zBxJ5dSRzDtxTfwLu6-csun19RklKKTr_h09LVen7tc",
  "access_expires_at": "2026-10-27T15:17:33.682617191Z",
  "refresh_token": "asF_ORg1EyMxWP4mhEVuo9O-vUkF_zDh7mFaSZGEprk",
  "refresh_expires_at": "2026-10-28T03:02:33.682030293Z",
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
  "session_id": "cc14e011-57d8-44a5-ae19-f2d4268da8e1",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTMsImlhdCI6MTc5MzExMzM1MywianRpIjoiZjg3ZjBhZTEtOTRmNS00M2QyLWEyMWMtM2RjNTZkYWRkYzk0Iiwic2lkIjoiY2MxNGUwMTEtNTdkOC00NGE1LWFlMTktZjJkNDI2OGRhOGUxIn0.gw-DgTUGREqQrAZCUQ91WTcmySjI-iCsKvjkmijzqNY",
  "access_expires_at": "2026-10-27T15:17:33.98791203Z",
  "refresh_token": "YR6v5wIbFZdx5GRmPfHPUhlCFzElIsWD8QwrwjGQOIs",
  "refresh_expires_at": "2026-10-28T03:02:33.987395452Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/412bb125-8270-415c-943c-3c2dea361e81/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
      "author_type": "RIDER",
      "author_id": "af872c5c-6344-4641-809f-3e2c6afd1f90",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T15:02:33.314514Z"
    },
    {
      "order_id": "412bb125-8270-415c-943c-3c2dea361e81",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "af872c5c-6344-4641-809f-3e2c6afd1f90",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T15:02:33.345102Z"
    }
  ]
}
```

Done: ratings for order 412bb125-8270-415c-943c-3c2dea361e81.

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
  "session_id": "bf57581a-5e70-47c1-971d-c8749310639a",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTQsImlhdCI6MTc5MzExMzM1NCwianRpIjoiNWQ3NTA2YTctM2RjNS00NzNkLTk3NDEtY2FmYTMxMTVmY2I4Iiwic2lkIjoiYmY1NzU4MWEtNWU3MC00N2MxLTk3MWQtYzg3NDkzMTA2MzlhIn0.vwZCuPbQmknpJWkG8cNOhqHNDaD1XHI3M6WO42d-5Kk",
  "access_expires_at": "2026-10-27T15:17:34.330934131Z",
  "refresh_token": "rKPXTm6VrfB04ILOW-IBFReqUjxw_gIShdGKeaxYRjI",
  "refresh_expires_at": "2026-10-28T03:02:34.330275446Z",
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
  "command_id": "c0ea9406-5b24-444c-92fc-6fe836cd0a05",
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
  "changed_by": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:02:34.395001Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "c0ea9406-5b24-444c-92fc-6fe836cd0a05",
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
  "changed_by": "724c730b-245c-4a30-a20f-00e27e85cee6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:02:34.395001Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48936703599",
  "device_ref": "sandbox-18601"
}
```

```json
{
  "challenge_id": "575de74a-1751-4131-a022-8d70aa1f32fb",
  "expires_at": "2026-10-27T15:07:34.460983742Z",
  "resend_available_at": "2026-10-27T15:02:35.460983742Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48936703599` → **200**

```json
{
  "phone": "+48936703599",
  "audience": "CLIENT",
  "code": "948518",
  "sent_at": "2026-10-27T15:02:34.463150515Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "575de74a-1751-4131-a022-8d70aa1f32fb",
  "code": "948518",
  "device_ref": "sandbox-18601"
}
```

```json
{
  "session_id": "a0e70a4b-5ae9-451b-89a2-e5d41f7a7d0f",
  "subject": {
    "type": "CLIENT",
    "id": "d8e0182f-707f-4f04-bb23-58c375acd757"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOGUwMTgyZi03MDdmLTRmMDQtYmIyMy01OGMzNzVhY2Q3NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjU0LCJpYXQiOjE3OTMxMTMzNTQsImp0aSI6IjA0NDAzN2U5LTdiZjEtNGU4NC1iMmYxLTU3NTJkNzQ2Yjg5NiIsInNpZCI6ImEwZTcwYTRiLTVhZTktNDUxYi04OWEyLWU1ZDQxZjdhN2QwZiJ9.2d1Rb9vrCIIBSpuoXaIF6lSyQcCElPzUy-aAvqyKxVk",
  "access_expires_at": "2026-10-27T15:17:34.507489703Z",
  "refresh_token": "WOT4A0t-xki_fMAJcJfAEKB93lC-C5yhJetwznKdvWo",
  "refresh_expires_at": "2026-11-26T15:02:34.506943741Z",
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
  "correlation_id": "e691eabc-64ac-4962-a70b-ecbb34a49655"
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
  "device_ref": "sandbox-29019"
}
```

```json
{
  "challenge_id": "a23c6c90-03bd-4ebf-833f-94c61efddfc0",
  "expires_at": "2026-10-27T15:07:34.575753033Z",
  "resend_available_at": "2026-10-27T15:02:35.575753033Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "367443",
  "sent_at": "2026-10-27T15:02:34.578363536Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a23c6c90-03bd-4ebf-833f-94c61efddfc0",
  "code": "367443",
  "device_ref": "sandbox-29019"
}
```

```json
{
  "session_id": "db32c9bb-13b7-4858-b1d4-114a331e691c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI1NCwiaWF0IjoxNzkzMTEzMzU0LCJqdGkiOiIwMWQ0MDJkYS02Nzk4LTRiYzgtYjUzOS05NDhjZDdiMTFhYjQiLCJzaWQiOiJkYjMyYzliYi0xM2I3LTQ4NTgtYjFkNC0xMTRhMzMxZTY5MWMifQ.Jy_wun_fM2IhXBVCBEW3CJFtyhYoMYgJSB1I-EbPVV4",
  "access_expires_at": "2026-10-27T15:17:34.623627442Z",
  "refresh_token": "fQ_mK1oYvoVfcZAMyteX3SycuJ1D5vVHH4MAfjMIp3g",
  "refresh_expires_at": "2026-11-26T15:02:34.622972197Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0dd2da7a-e0d3-4275-9d1e-a6989fdeabed",
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
  "last_heartbeat_at": "2026-10-27T15:02:32.282906Z",
  "last_location_at": "2026-10-27T15:02:32.282906Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0dd2da7a-e0d3-4275-9d1e-a6989fdeabed/handover` → **200**

```json
{
  "command_id": "c348930e-3c15-4037-926f-663d15cce120",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0dd2da7a-e0d3-4275-9d1e-a6989fdeabed",
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
  "last_heartbeat_at": "2026-10-27T15:02:32.282906Z",
  "last_location_at": "2026-10-27T15:02:32.282906Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0dd2da7a-e0d3-4275-9d1e-a6989fdeabed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:34Z",
    "sequence": 1793113354695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0dd2da7a-e0d3-4275-9d1e-a6989fdeabed",
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
  "last_heartbeat_at": "2026-10-27T15:02:34.710932Z",
  "last_location_at": "2026-10-27T15:02:34.710932Z",
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
  "session_id": "0dd2da7a-e0d3-4275-9d1e-a6989fdeabed",
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
  "last_heartbeat_at": "2026-10-27T15:02:34.710932Z",
  "last_location_at": "2026-10-27T15:02:34.710932Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0dd2da7a-e0d3-4275-9d1e-a6989fdeabed/close` → **200**

```json
{
  "command_id": "14c298ec-b6ee-4b5d-900d-802f52cad93c",
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
  "correlation_id": "75aa6ad0-d9d8-479d-8a64-fd80bcc87688"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674884693",
  "device_ref": "sandbox-2947"
}
```

```json
{
  "challenge_id": "9faaf3d8-085b-4529-9613-6e93a3594717",
  "expires_at": "2026-10-27T15:07:34.853521224Z",
  "resend_available_at": "2026-10-27T15:02:35.853521224Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674884693` → **200**

```json
{
  "phone": "+380674884693",
  "audience": "CLIENT",
  "code": "065143",
  "sent_at": "2026-10-27T15:02:34.855853036Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9faaf3d8-085b-4529-9613-6e93a3594717",
  "code": "065143",
  "device_ref": "sandbox-2947"
}
```

```json
{
  "session_id": "31f577b4-18a3-4bac-aef6-d34f553c09f5",
  "subject": {
    "type": "CLIENT",
    "id": "2689f315-da7f-4b6a-b18c-4f666b99a116"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjg5ZjMxNS1kYTdmLTRiNmEtYjE4Yy00ZjY2NmI5OWExMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0MjU0LCJpYXQiOjE3OTMxMTMzNTQsImp0aSI6IjhjZTQ3NzFjLWZlNmEtNDhkZi1iYTFlLTRiYmJjYmRlMTQ3MSIsInNpZCI6IjMxZjU3N2I0LTE4YTMtNGJhYy1hZWY2LWQzNGY1NTNjMDlmNSJ9.lrvtpENN4wP8liFKclF_HiCT8uIZJ3s8r3cO1vYwgzg",
  "access_expires_at": "2026-10-27T15:17:34.900261348Z",
  "refresh_token": "HOKPeuIA9kaMTDs-iJPzFgHUWzLMOxt-Dx3NCb9x088",
  "refresh_expires_at": "2026-11-26T15:02:34.899726719Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "c5238654-8fa7-40b0-bbaa-dd306b32bb31",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "274c4852-095b-46af-a771-511e719f75b7",
  "upload_path": "/api/rider/v1/uploads/274c4852-095b-46af-a771-511e719f75b7",
  "expires_at": "2026-10-27T15:17:34.931242997Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/274c4852-095b-46af-a771-511e719f75b7` → **200**

```json
{
  "file_id": "274c4852-095b-46af-a771-511e719f75b7",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "a8498be9-9f5d-44d4-8358-044ca93c1143",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "274c4852-095b-46af-a771-511e719f75b7"
  ]
}
```

```json
{
  "id": "b9096adc-25e6-4e3e-8946-00327d1bf51a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:02:34.991659Z",
  "updated_at": "2026-10-27T15:02:34.991659Z",
  "messages": [
    {
      "id": "d8620aa4-927f-4352-a6d7-73bccf605982",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:02:34.99316Z",
      "attachments": [
        {
          "file_id": "274c4852-095b-46af-a771-511e719f75b7",
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
  "session_id": "c08df01e-0911-4636-9d87-4d64eeb0f19f",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTUsImlhdCI6MTc5MzExMzM1NSwianRpIjoiNWYxZTdmMWYtMzMwZi00M2FlLThjMGQtNzczZmE5M2NiNDRiIiwic2lkIjoiYzA4ZGYwMWUtMDkxMS00NjM2LTlkODctNGQ2NGVlYjBmMTlmIn0.pNzhd9PycHbwTmOxuQHr5d9cRnB03shDeqAux888qQI",
  "access_expires_at": "2026-10-27T15:17:35.315565574Z",
  "refresh_token": "he-MIHrJzmlMiLN49P4G9UYbogNX8ddXfhY4PTsFEI0",
  "refresh_expires_at": "2026-10-28T03:02:35.315039655Z",
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
  "session_id": "583d934d-69e3-40b1-a40d-0f9b8baa824a",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTUsImlhdCI6MTc5MzExMzM1NSwianRpIjoiNjg3MDk3YjQtNzllMC00NTBmLWJiOTUtYzNkMDg2MjdhY2M5Iiwic2lkIjoiNTgzZDkzNGQtNjllMy00MGIxLWE0MGQtMGY5YjhiYWE4MjRhIn0.YVoVVFnYI50VYdZRc10O1QwFkjcNNr91zPIWyzltf1M",
  "access_expires_at": "2026-10-27T15:17:35.621769261Z",
  "refresh_token": "raMUs2a-2wEEPMgQ9MuoPw2924kiPHde_EIF8-4gzH4",
  "refresh_expires_at": "2026-10-28T03:02:35.620993589Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b9096adc-25e6-4e3e-8946-00327d1bf51a/attachments/274c4852-095b-46af-a771-511e719f75b7` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "614725d5-ea8d-4491-9ec8-4c4e700d9864",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3c34b09a-2b4e-4804-9285-3a486776af13",
  "upload_path": "/api/operator/v1/uploads/3c34b09a-2b4e-4804-9285-3a486776af13",
  "expires_at": "2026-10-27T15:17:35.664200908Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/3c34b09a-2b4e-4804-9285-3a486776af13` → **200**

```json
{
  "file_id": "3c34b09a-2b4e-4804-9285-3a486776af13",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b9096adc-25e6-4e3e-8946-00327d1bf51a` → **200**

```json
{
  "id": "b9096adc-25e6-4e3e-8946-00327d1bf51a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:02:34.991659Z",
  "updated_at": "2026-10-27T15:02:34.991659Z",
  "messages": [
    {
      "id": "d8620aa4-927f-4352-a6d7-73bccf605982",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:02:34.99316Z",
      "attachments": [
        {
          "file_id": "274c4852-095b-46af-a771-511e719f75b7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b9096adc-25e6-4e3e-8946-00327d1bf51a/comments` → **200**

```json
{
  "command_id": "866739e3-faa3-4806-a3cb-c4bbb2d38510",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "3c34b09a-2b4e-4804-9285-3a486776af13"
  ]
}
```

```json
{
  "id": "b9096adc-25e6-4e3e-8946-00327d1bf51a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:02:34.991659Z",
  "updated_at": "2026-10-27T15:02:35.74818Z",
  "messages": [
    {
      "id": "d8620aa4-927f-4352-a6d7-73bccf605982",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:02:34.99316Z",
      "attachments": [
        {
          "file_id": "274c4852-095b-46af-a771-511e719f75b7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5d66e559-6061-401a-8fdb-d8d43d88846d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "724c730b-245c-4a30-a20f-00e27e85cee6",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:02:35.747784Z",
      "attachments": [
        {
          "file_id": "3c34b09a-2b4e-4804-9285-3a486776af13",
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

`GET /api/rider/v1/support/cases/b9096adc-25e6-4e3e-8946-00327d1bf51a` → **200**

```json
{
  "id": "b9096adc-25e6-4e3e-8946-00327d1bf51a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:02:34.991659Z",
  "updated_at": "2026-10-27T15:02:35.74818Z",
  "messages": [
    {
      "id": "d8620aa4-927f-4352-a6d7-73bccf605982",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2689f315-da7f-4b6a-b18c-4f666b99a116",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:02:34.99316Z",
      "attachments": [
        {
          "file_id": "274c4852-095b-46af-a771-511e719f75b7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5d66e559-6061-401a-8fdb-d8d43d88846d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:02:35.747784Z",
      "attachments": [
        {
          "file_id": "3c34b09a-2b4e-4804-9285-3a486776af13",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b9096adc-25e6-4e3e-8946-00327d1bf51a/attachments/3c34b09a-2b4e-4804-9285-3a486776af13` → **200**

Done: support case b9096adc-25e6-4e3e-8946-00327d1bf51a, rider attachment 274c4852-095b-46af-a771-511e719f75b7, operator attachment 3c34b09a-2b4e-4804-9285-3a486776af13.

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
  "session_id": "9eeeaf79-1aac-4a2f-88ec-2f261c0e4f7c",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTYsImlhdCI6MTc5MzExMzM1NiwianRpIjoiODJiYzY4OTEtNTllZi00ZGQyLThlMzYtNWM1YmQxMjc4MGJmIiwic2lkIjoiOWVlZWFmNzktMWFhYy00YTJmLTg4ZWMtMmYyNjFjMGU0ZjdjIn0.b7b5IkiakBFXiqq2dgrKCnmDFKflYNg4RWpYqwRxfSk",
  "access_expires_at": "2026-10-27T15:17:36.108724426Z",
  "refresh_token": "8XCwxHIyCvAZSy9MkYgP23Cm956bRDa0xuKe-KM3Ooo",
  "refresh_expires_at": "2026-10-28T03:02:36.108141896Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4906"
}
```

```json
{
  "challenge_id": "a257556c-607d-4b5b-9b49-fc7231dd3e51",
  "expires_at": "2026-10-27T15:07:36.131194721Z",
  "resend_available_at": "2026-10-27T15:02:37.131194721Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "940198",
  "sent_at": "2026-10-27T15:02:36.133288148Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a257556c-607d-4b5b-9b49-fc7231dd3e51",
  "code": "940198",
  "device_ref": "sandbox-4906"
}
```

```json
{
  "session_id": "c5c31336-ace9-4654-9029-80561cbc33df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI1NiwiaWF0IjoxNzkzMTEzMzU2LCJqdGkiOiIwM2FmZWRjNC1mODE5LTRkYTgtYWUyZS05NzMyZjIyMmY4MDMiLCJzaWQiOiJjNWMzMTMzNi1hY2U5LTQ2NTQtOTAyOS04MDU2MWNiYzMzZGYifQ.VbLUof_KMtzUrqWvqAXXKvegUQv2-JSDZBYwnL0DkqU",
  "access_expires_at": "2026-10-27T15:17:36.178433503Z",
  "refresh_token": "TbeX2LPw_SZZdJwKjESp2vhKtX9-GyedikMiVWr7XzU",
  "refresh_expires_at": "2026-11-26T15:02:36.177936548Z",
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
  "command_id": "1108d693-85da-4449-9c24-4617b46a8094",
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
  "device_ref": "sandbox-31609"
}
```

```json
{
  "challenge_id": "dfe60441-b6f5-4580-848f-5ea9e67cd8e8",
  "expires_at": "2026-10-27T15:07:36.286853556Z",
  "resend_available_at": "2026-10-27T15:02:37.286853556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "946304",
  "sent_at": "2026-10-27T15:02:36.288777558Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfe60441-b6f5-4580-848f-5ea9e67cd8e8",
  "code": "946304",
  "device_ref": "sandbox-31609"
}
```

```json
{
  "session_id": "40ea0508-7750-4cce-9377-19b8f7b2e445",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDI1NiwiaWF0IjoxNzkzMTEzMzU2LCJqdGkiOiIyOTQ2ODQ3ZS1hNTdjLTRiOTAtOTVhYi02ZTE3NDhjNWJmZWQiLCJzaWQiOiI0MGVhMDUwOC03NzUwLTRjY2UtOTM3Ny0xOWI4ZjdiMmU0NDUifQ.PgflYVa9KynvVjYCUHhkR39y0app3swlIiN8eGacvD4",
  "access_expires_at": "2026-10-27T15:17:36.331677942Z",
  "refresh_token": "cFCoMT9hDxMZGobnvwyUvS1hj_KaAY_UzMlfbWXwHpM",
  "refresh_expires_at": "2026-11-26T15:02:36.331144775Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "581c641f-8ac0-4587-96a2-27ca66867488",
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
  "last_heartbeat_at": "2026-10-27T15:02:33.248107Z",
  "last_location_at": "2026-10-27T15:02:33.248107Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/581c641f-8ac0-4587-96a2-27ca66867488/handover` → **200**

```json
{
  "command_id": "ccd7171d-9c65-41ca-8bd8-ee1bc58d2401",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "581c641f-8ac0-4587-96a2-27ca66867488",
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
  "last_heartbeat_at": "2026-10-27T15:02:33.248107Z",
  "last_location_at": "2026-10-27T15:02:33.248107Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/581c641f-8ac0-4587-96a2-27ca66867488/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:36Z",
    "sequence": 1793113356395
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "581c641f-8ac0-4587-96a2-27ca66867488",
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
  "last_heartbeat_at": "2026-10-27T15:02:36.410446Z",
  "last_location_at": "2026-10-27T15:02:36.410446Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:02:13.791943Z",
  "last_location_at": "2026-10-27T15:02:13.791943Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/98facb84-db65-46f1-b456-617628171e7b/handover` → **200**

```json
{
  "command_id": "b500645d-f8f5-444c-8711-34e5ef49e741",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:02:13.791943Z",
  "last_location_at": "2026-10-27T15:02:13.791943Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/98facb84-db65-46f1-b456-617628171e7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:36Z",
    "sequence": 1793113356480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:02:36.495278Z",
  "last_location_at": "2026-10-27T15:02:36.495278Z",
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
  "session_id": "3226cc14-5a54-4ca8-8700-cf05aa507a6d",
  "subject": {
    "type": "STAFF",
    "id": "724c730b-245c-4a30-a20f-00e27e85cee6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjRjNzMwYi0yNDVjLTRhMzAtYTIwZi0wMGUyN2U4NWNlZTYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQyNTYsImlhdCI6MTc5MzExMzM1NiwianRpIjoiODgyY2VkNjMtMDFhYy00ZTUwLWE2MDktYTAxZWIyMGNlNjIwIiwic2lkIjoiMzIyNmNjMTQtNWE1NC00Y2E4LTg3MDAtY2YwNWFhNTA3YTZkIn0.yRE0sFSJDfPGzoAbq5LFwloIjBaAPae9g-8ujWlQZfU",
  "access_expires_at": "2026-10-27T15:17:36.800193311Z",
  "refresh_token": "aoBT9Z3cK9-sB2RtpilkXimAxE6hCsm-EVSXhBq0LiQ",
  "refresh_expires_at": "2026-10-28T03:02:36.799613108Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "62a75864-38a6-4d00-83ea-c8cef0fcf4ac",
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
  "id": "ef786631-854f-48ac-b56e-4bf38cf5cb99",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:07:36.827808Z",
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
  "command_id": "7af9f627-778b-461d-b876-3e9d01295331",
  "quote_id": "ef786631-854f-48ac-b56e-4bf38cf5cb99",
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
  "id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
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
  "created_at": "2026-10-27T15:02:36.858908Z",
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
    "id": "8b91b467-366d-458a-8726-486aa44cb2d6",
    "order_id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
    "expires_at": "2026-10-27T15:02:51.862556Z",
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

`POST /api/driver/v1/offers/8b91b467-366d-458a-8726-486aa44cb2d6/accept` → **200**

```json
{
  "command_id": "236f23a3-8e1e-4d92-87d2-9ec82788f87c"
}
```

```json
{
  "id": "41e642ac-2ec7-4877-b7c3-16bbd994f9c4",
  "order_id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e7ce6ffd-f757-400e-9887-204b1f7eeede",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e7ce6ffd-f757-400e-9887-204b1f7eeede",
  "order_id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
  "assignment_id": "41e642ac-2ec7-4877-b7c3-16bbd994f9c4",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/98facb84-db65-46f1-b456-617628171e7b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:02:36Z",
    "sequence": 1793113356973
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:02:36.988629Z",
  "last_location_at": "2026-10-27T15:02:36.988629Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e7ce6ffd-f757-400e-9887-204b1f7eeede/arrive` → **200**

```json
{
  "command_id": "6fbc9df4-35db-45c5-9537-70202715a130",
  "expected_version": 0
}
```

```json
{
  "id": "e7ce6ffd-f757-400e-9887-204b1f7eeede",
  "order_id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
  "assignment_id": "41e642ac-2ec7-4877-b7c3-16bbd994f9c4",
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
  "arrived_at": "2026-10-27T15:02:37.018484Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/e7ce6ffd-f757-400e-9887-204b1f7eeede/start` → **200**

```json
{
  "command_id": "6ee6cbcd-c4e6-4196-a300-37ac8349280f",
  "expected_version": 1
}
```

```json
{
  "id": "e7ce6ffd-f757-400e-9887-204b1f7eeede",
  "order_id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
  "assignment_id": "41e642ac-2ec7-4877-b7c3-16bbd994f9c4",
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
  "arrived_at": "2026-10-27T15:02:37.018484Z",
  "started_at": "2026-10-27T15:02:37.051066Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/e7ce6ffd-f757-400e-9887-204b1f7eeede/complete` → **200**

```json
{
  "command_id": "fd657289-cca8-4913-b68d-9bdf9a3ca292",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:02:37Z",
  "cash_received": true
}
```

```json
{
  "id": "e7ce6ffd-f757-400e-9887-204b1f7eeede",
  "order_id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
  "assignment_id": "41e642ac-2ec7-4877-b7c3-16bbd994f9c4",
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
  "arrived_at": "2026-10-27T15:02:37.018484Z",
  "started_at": "2026-10-27T15:02:37.051066Z",
  "completed_at": "2026-10-27T15:02:37.088288Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/aba0bb39-ce0c-41d8-baac-21fe6d413de3` → **200**

```json
{
  "id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
  "short_number": 12,
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
    "id": "41e642ac-2ec7-4877-b7c3-16bbd994f9c4",
    "order_id": "aba0bb39-ce0c-41d8-baac-21fe6d413de3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e7ce6ffd-f757-400e-9887-204b1f7eeede",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:02:36.858908Z",
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
      "balance_minor": 9357,
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
  "session_id": "581c641f-8ac0-4587-96a2-27ca66867488",
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
  "last_heartbeat_at": "2026-10-27T15:02:36.410446Z",
  "last_location_at": "2026-10-27T15:02:36.410446Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/581c641f-8ac0-4587-96a2-27ca66867488/close` → **200**

```json
{
  "command_id": "9507e52a-9ed9-4f3d-89cf-84ce91905f23",
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
  "session_id": "98facb84-db65-46f1-b456-617628171e7b",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:02:36.988629Z",
  "last_location_at": "2026-10-27T15:02:36.988629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98facb84-db65-46f1-b456-617628171e7b/close` → **200**

```json
{
  "command_id": "24ed33fb-67cf-4833-8187-a24944073378",
  "expected_version": 2
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

Done: terminal order aba0bb39-ce0c-41d8-baac-21fe6d413de3 by Andrii (5a000000-0000-4000-8000-000000000403).
