# Sandbox transcript (2026-10-28T08:22:32Z, c8eef91)

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
  "correlation_id": "a97f3322-8cba-4adb-bc5f-674814f5dbff"
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
  "session_id": "799938e9-a8e8-4a00-950e-308ffe25e0bf",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NTMsImlhdCI6MTc5MzE3NTc1MywianRpIjoiYTYyNDc3NTItOTM2YS00MzhjLWJkMjktMTc4NGZhYTIyNWYyIiwic2lkIjoiNzk5OTM4ZTktYThlOC00YTAwLTk1MGUtMzA4ZmZlMjVlMGJmIn0.iZMyXhwC-cegjprrtboLQh3fvtoYHpkbrJl6SmXZJv4",
  "access_expires_at": "2026-10-28T08:37:33.262135655Z",
  "refresh_token": "FuN7sXDtpUZaMRkkjl8DlcwGc10pnKCjd5rcafxZPuU",
  "refresh_expires_at": "2026-10-28T20:22:33.259910307Z",
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
  "session_id": "09e1cea9-8c6c-4f19-b406-51dfdd30e29b",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NTQsImlhdCI6MTc5MzE3NTc1NCwianRpIjoiNDcxNWIwODctZTY2OC00MWMzLWJhZWQtNjA3ZDI5NDY0NzhiIiwic2lkIjoiMDllMWNlYTktOGM2Yy00ZjE5LWI0MDYtNTFkZmRkMzBlMjliIn0.B2d-kkXMISVDLfWF7VVAIgvzxvMBDA_h6hmMlPmvd3g",
  "access_expires_at": "2026-10-28T08:37:34.555792638Z",
  "refresh_token": "htzanz0fwzkKRS2lfGsl5gDXXaloYox6ZZ-3zVJU1IM",
  "refresh_expires_at": "2026-10-28T20:22:34.554640655Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "02134924-4b13-4b62-9f49-71be7df9a485",
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
  "id": "e3ddf67b-2892-4922-8bb7-a6c7d1cc2a12",
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
  "created_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "created_at": "2026-10-28T08:22:34.630839Z",
  "updated_at": "2026-10-28T08:22:34.630839Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634953041",
  "device_ref": "sandbox-13133"
}
```

```json
{
  "challenge_id": "72f6e8c6-c238-4943-b5fb-3d56a0c21159",
  "expires_at": "2026-10-28T08:27:34.682100691Z",
  "resend_available_at": "2026-10-28T08:22:35.682100691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634953041` → **200**

```json
{
  "phone": "+380634953041",
  "audience": "CLIENT",
  "code": "423221",
  "sent_at": "2026-10-28T08:22:34.690525644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72f6e8c6-c238-4943-b5fb-3d56a0c21159",
  "code": "423221",
  "device_ref": "sandbox-13133"
}
```

```json
{
  "session_id": "67a3b3f8-b429-4422-ad3f-41aeff41ff6f",
  "subject": {
    "type": "CLIENT",
    "id": "a9bd5016-5321-4bdb-a651-47781fc814a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWJkNTAxNi01MzIxLTRiZGItYTY1MS00Nzc4MWZjODE0YTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjU0LCJpYXQiOjE3OTMxNzU3NTQsImp0aSI6ImRmOWQ1OWQ3LWIyZGYtNGFhYS1hNGJlLTQwMTkyMGQ2Yzg2ZiIsInNpZCI6IjY3YTNiM2Y4LWI0MjktNDQyMi1hZDNmLTQxYWVmZjQxZmY2ZiJ9.EslWGfyyMaIkDUCVp3THb_JOiDv34O4Ee6ZahIvU4HE",
  "access_expires_at": "2026-10-28T08:37:34.782246183Z",
  "refresh_token": "iezarFIn8cDV-nYP3gGRYViYNDtMg4vBSWyTA4MYufk",
  "refresh_expires_at": "2026-11-27T08:22:34.780919851Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634953041` → **200**

```json
{
  "client_id": "a9bd5016-5321-4bdb-a651-47781fc814a8"
}
```

`POST /api/admin/v1/rider-wallets/a9bd5016-5321-4bdb-a651-47781fc814a8/top-ups` → **201**

```json
{
  "command_id": "ac14aad9-5a06-4c7a-b719-ffd30867a5ba",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "a9bd5016-5321-4bdb-a651-47781fc814a8",
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
      "id": "a3a5fdfd-7e30-41d6-b7c9-ccbaf76d2eb1",
      "at": "2026-10-28T08:22:34.870863Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ee236a2a-e2c1-46e8-be78-ac5c514f9d9b",
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
  "id": "4f9da9d2-3ebf-4397-8cbe-69b41a4bcb01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:27:35.032446Z",
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
      "id": "e3ddf67b-2892-4922-8bb7-a6c7d1cc2a12",
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
  "device_ref": "sandbox-4895"
}
```

```json
{
  "challenge_id": "30a12661-6b4a-4748-ba8b-8cebba54d125",
  "expires_at": "2026-10-28T08:27:35.107925499Z",
  "resend_available_at": "2026-10-28T08:22:36.107925499Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "079140",
  "sent_at": "2026-10-28T08:22:35.111523716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30a12661-6b4a-4748-ba8b-8cebba54d125",
  "code": "079140",
  "device_ref": "sandbox-4895"
}
```

```json
{
  "session_id": "162a1ca3-d513-4924-b53e-6cc635bbc7ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY1NSwiaWF0IjoxNzkzMTc1NzU1LCJqdGkiOiJmMTBlZTY3NS1lMzhlLTQwMmItYmQ1ZS1jZDY3NjZjMWQwNzEiLCJzaWQiOiIxNjJhMWNhMy1kNTEzLTQ5MjQtYjUzZS02Y2M2MzViYmM3YmEifQ.eX4T0CfDb5IV5dnKoBNxMh3BJLPZMUwETDsoZ6txUbI",
  "access_expires_at": "2026-10-28T08:37:35.171150657Z",
  "refresh_token": "T5evaItWqbu-KB4bpSRa7PeKMLblNeHNsoI0UxaOBYM",
  "refresh_expires_at": "2026-11-27T08:22:35.170109646Z",
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
  "command_id": "aaf41291-6f58-4190-9e92-61d4e8598c74",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:22:35Z",
    "sequence": 1793175755239
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4d0f077-52c4-42b1-b081-dc2234fb0a52",
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
  "last_heartbeat_at": "2026-10-28T08:22:35.287815Z",
  "last_location_at": "2026-10-28T08:22:35.287815Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c9470101-d0ec-4aaa-a184-06b005b57ba0",
  "quote_id": "4f9da9d2-3ebf-4397-8cbe-69b41a4bcb01",
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
  "id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9bd5016-5321-4bdb-a651-47781fc814a8",
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
  "created_at": "2026-10-28T08:22:35.38951Z",
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
  "client_id": "a9bd5016-5321-4bdb-a651-47781fc814a8",
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
      "id": "a3a5fdfd-7e30-41d6-b7c9-ccbaf76d2eb1",
      "at": "2026-10-28T08:22:34.870863Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
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
    "id": "6a9f7d16-8f8a-4624-b737-b5f641348eab",
    "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
    "expires_at": "2026-10-28T08:22:50.404307Z",
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

`POST /api/driver/v1/offers/6a9f7d16-8f8a-4624-b737-b5f641348eab/accept` → **200**

```json
{
  "command_id": "028d65f1-b7c3-43d5-9806-d2219a9512a2"
}
```

```json
{
  "id": "149f45df-0d1c-444e-a961-751e19f8b190",
  "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "33e8513c-f001-429a-88c3-476aefdafba9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "33e8513c-f001-429a-88c3-476aefdafba9",
  "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
  "assignment_id": "149f45df-0d1c-444e-a961-751e19f8b190",
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

`POST /api/driver/v1/work-sessions/f4d0f077-52c4-42b1-b081-dc2234fb0a52/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:22:35Z",
    "sequence": 1793175755596
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4d0f077-52c4-42b1-b081-dc2234fb0a52",
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
  "last_heartbeat_at": "2026-10-28T08:22:35.62085Z",
  "last_location_at": "2026-10-28T08:22:35.62085Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/33e8513c-f001-429a-88c3-476aefdafba9/arrive` → **200**

```json
{
  "command_id": "14349d39-9414-4cd5-a46d-e12e92b6837e",
  "expected_version": 0
}
```

```json
{
  "id": "33e8513c-f001-429a-88c3-476aefdafba9",
  "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
  "assignment_id": "149f45df-0d1c-444e-a961-751e19f8b190",
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
  "arrived_at": "2026-10-28T08:22:35.672321Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/33e8513c-f001-429a-88c3-476aefdafba9/start` → **200**

```json
{
  "command_id": "1eca09e0-0619-46d8-b473-59cb49b5971a",
  "expected_version": 1
}
```

```json
{
  "id": "33e8513c-f001-429a-88c3-476aefdafba9",
  "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
  "assignment_id": "149f45df-0d1c-444e-a961-751e19f8b190",
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
  "arrived_at": "2026-10-28T08:22:35.672321Z",
  "started_at": "2026-10-28T08:22:35.71874Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/33e8513c-f001-429a-88c3-476aefdafba9/complete` → **200**

```json
{
  "command_id": "3b3f67eb-3ee0-49e6-bf3d-28939903a322",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:22:35Z",
  "cash_received": true
}
```

```json
{
  "id": "33e8513c-f001-429a-88c3-476aefdafba9",
  "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
  "assignment_id": "149f45df-0d1c-444e-a961-751e19f8b190",
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
  "arrived_at": "2026-10-28T08:22:35.672321Z",
  "started_at": "2026-10-28T08:22:35.71874Z",
  "completed_at": "2026-10-28T08:22:35.79561Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a9bd5016-5321-4bdb-a651-47781fc814a8",
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
      "id": "8ae242a2-f366-448c-affc-6061191a7def",
      "at": "2026-10-28T08:22:36.851912Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a"
    },
    {
      "id": "a3a5fdfd-7e30-41d6-b7c9-ccbaf76d2eb1",
      "at": "2026-10-28T08:22:34.870863Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/e3ddf67b-2892-4922-8bb7-a6c7d1cc2a12/archive` → **200**

```json
{
  "command_id": "cff3d562-f57b-429e-ae4c-7c181bfddafc",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "e3ddf67b-2892-4922-8bb7-a6c7d1cc2a12",
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
  "created_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "created_at": "2026-10-28T08:22:34.630839Z",
  "updated_at": "2026-10-28T08:22:38.896093Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4d0f077-52c4-42b1-b081-dc2234fb0a52",
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
  "last_heartbeat_at": "2026-10-28T08:22:35.62085Z",
  "last_location_at": "2026-10-28T08:22:35.62085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f4d0f077-52c4-42b1-b081-dc2234fb0a52/close` → **200**

```json
{
  "command_id": "50fde5b8-b23d-423a-b510-aa646923ad80",
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

Done: order f793e799-7c2c-4967-af41-38f9d8ff6d0a.

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
  "session_id": "aed07e4e-9f7c-4760-9fc5-a11d9ec36c47",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NTksImlhdCI6MTc5MzE3NTc1OSwianRpIjoiZGEzNzUzOGEtZTE4Zi00YThlLWFhYWUtODdlYTI0Y2FmZjc1Iiwic2lkIjoiYWVkMDdlNGUtOWY3Yy00NzYwLTlmYzUtYTExZDllYzM2YzQ3In0.dp1U6Qe4RaAFhUYLvtM9gfyhYft0qrPW8y_QSknJ40g",
  "access_expires_at": "2026-10-28T08:37:39.316596559Z",
  "refresh_token": "ByPdhXuhPmWzszINbiZBpM1B-o8fYSHUBvj1rFUqVew",
  "refresh_expires_at": "2026-10-28T20:22:39.315738142Z",
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
  "command_id": "3aaf5679-70ec-494d-bde8-bf358d593337",
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
  "session_id": "fe670c90-9990-4fa5-8ff7-207868bdf231",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NTksImlhdCI6MTc5MzE3NTc1OSwianRpIjoiNjZlZjkwMGYtZDkxNy00YzBmLWFhZDctMDgzMWQ4MzU3NmQwIiwic2lkIjoiZmU2NzBjOTAtOTk5MC00ZmE1LThmZjctMjA3ODY4YmRmMjMxIn0.kBjPO74dVsQg-vF0TDzwEOn_IlU3cB_osAmZJ6q49Jk",
  "access_expires_at": "2026-10-28T08:37:39.718864657Z",
  "refresh_token": "oPQXmxa0Uw83HWi1VAolk1z-NnshjZNsGWshibYqsnY",
  "refresh_expires_at": "2026-10-28T20:22:39.718019093Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.442818740",
    "linkedid": "1730052700.442818740",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675755388"
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
    "id": "1730052700.442818740",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "6efe6dff-9b84-401c-949a-8ef2e19ff3e0",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675755388",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:22:39.748854Z",
      "answered_at": null,
      "ended_at": "2026-10-28T08:22:39.777495Z",
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
    "id": "1730052600.960027647",
    "linkedid": "1730052600.960027647",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675755388"
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
      "id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675755388",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:22:39.848376Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/be40f13a-9d4b-4a78-9763-22dedd8f2fd3/answer` → **200**

```json
{
  "command_id": "fc43171e-ef87-4603-94bf-959d10a95f82"
}
```

```json
{
  "id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675755388",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "order_ids": [],
  "started_at": "2026-10-28T08:22:39.848376Z",
  "answered_at": "2026-10-28T08:22:39.921879Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.960027647",
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
    "id": "1730052600.960027647",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675755388",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [],
      "started_at": "2026-10-28T08:22:39.848376Z",
      "answered_at": "2026-10-28T08:22:39.921879Z",
      "ended_at": "2026-10-28T08:22:39.976322Z",
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
      "id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675755388",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [],
      "started_at": "2026-10-28T08:22:39.848376Z",
      "answered_at": "2026-10-28T08:22:39.921879Z",
      "ended_at": "2026-10-28T08:22:39.976322Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:22:41.689168Z"
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
      "id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675755388",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [],
      "started_at": "2026-10-28T08:22:39.848376Z",
      "answered_at": "2026-10-28T08:22:39.921879Z",
      "ended_at": "2026-10-28T08:22:39.976322Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:22:41.689168Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/be40f13a-9d4b-4a78-9763-22dedd8f2fd3/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/be40f13a-9d4b-4a78-9763-22dedd8f2fd3/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=be40f13a-9d4b-4a78-9763-22dedd8f2fd3` → **200**

```json
{
  "changes": [
    {
      "id": "5cd82e21-c67f-42ef-9f03-ce517e26b478",
      "occurred_at": "2026-10-28T08:22:42.140381Z",
      "actor_type": "STAFF",
      "actor_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ef1bbc4e-d5e9-4090-a72e-0b28426054a7\", \"order_ids\": []}",
      "correlation_id": "ae275e94-8683-4f47-9dec-fe5c12206eb8"
    },
    {
      "id": "7059cc3a-9636-4aba-a16c-093d90b2ef51",
      "occurred_at": "2026-10-28T08:22:42.106025Z",
      "actor_type": "STAFF",
      "actor_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ef1bbc4e-d5e9-4090-a72e-0b28426054a7\", \"order_ids\": []}",
      "correlation_id": "72be751b-67f9-46ef-8fca-cc62a0cf67ae"
    }
  ]
}
```

Done: call be40f13a-9d4b-4a78-9763-22dedd8f2fd3 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639637467",
  "device_ref": "sandbox-31285"
}
```

```json
{
  "challenge_id": "02834246-bbee-44a5-ba41-208a2ba2b122",
  "expires_at": "2026-10-28T08:27:42.218063364Z",
  "resend_available_at": "2026-10-28T08:22:43.218063364Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639637467` → **200**

```json
{
  "phone": "+380639637467",
  "audience": "CLIENT",
  "code": "210900",
  "sent_at": "2026-10-28T08:22:42.221480895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02834246-bbee-44a5-ba41-208a2ba2b122",
  "code": "210900",
  "device_ref": "sandbox-31285"
}
```

```json
{
  "session_id": "e8df75a6-01d3-40fd-8bae-113c636147cd",
  "subject": {
    "type": "CLIENT",
    "id": "c954ee45-1a67-4a13-96e1-42ec66b5dfd4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTU0ZWU0NS0xYTY3LTRhMTMtOTZlMS00MmVjNjZiNWRmZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjYyLCJpYXQiOjE3OTMxNzU3NjIsImp0aSI6ImE1M2ZhNTBjLWU0ODctNDU0MC1iNDBiLWQyMjFkOTAwODRkYyIsInNpZCI6ImU4ZGY3NWE2LTAxZDMtNDBmZC04YmFlLTExM2M2MzYxNDdjZCJ9.TAuyRBulpqDL8m5CoKQbPhGi6z2kSZc7WthyvXqxsVE",
  "access_expires_at": "2026-10-28T08:37:42.28021733Z",
  "refresh_token": "eFOdmmYbj5a5X4t5o6oO_G4ae1E859xSeyFKOkGGN5Q",
  "refresh_expires_at": "2026-11-27T08:22:42.279486964Z",
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
  "device_ref": "sandbox-6671"
}
```

```json
{
  "challenge_id": "aea677ac-0204-4417-b796-0f350c980914",
  "expires_at": "2026-10-28T08:27:42.337802468Z",
  "resend_available_at": "2026-10-28T08:22:43.337802468Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "740895",
  "sent_at": "2026-10-28T08:22:42.341721905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aea677ac-0204-4417-b796-0f350c980914",
  "code": "740895",
  "device_ref": "sandbox-6671"
}
```

```json
{
  "session_id": "91b79536-4e3b-4cbf-b367-a90e1b1dab51",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY2MiwiaWF0IjoxNzkzMTc1NzYyLCJqdGkiOiIzNTAyMGE1Ni03MDUxLTRhOWItOWYwNS1jMGQ5OWNiODE5NjUiLCJzaWQiOiI5MWI3OTUzNi00ZTNiLTRjYmYtYjM2Ny1hOTBlMWIxZGFiNTEifQ.spTbZpMAMl85KmMfM9h5MK9ZYCYkDm8e7uDMlWcAdOQ",
  "access_expires_at": "2026-10-28T08:37:42.40046259Z",
  "refresh_token": "PJGGb5bnda-VMNa_frMF_HMoB14tKCdJ4cJFHrDmp80",
  "refresh_expires_at": "2026-11-27T08:22:42.399786837Z",
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
  "session_id": "ac59a7c8-144e-4782-9d50-7935a4261899",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NjIsImlhdCI6MTc5MzE3NTc2MiwianRpIjoiMmExNjVjYzQtNWQzOC00YjNjLWJlOGItYjY3MWUwMGJhZDQyIiwic2lkIjoiYWM1OWE3YzgtMTQ0ZS00NzgyLTlkNTAtNzkzNWE0MjYxODk5In0.DTDimy6Wa3FbIeqc2-DADas2SqnAeSq_xJGDjzGbIY0",
  "access_expires_at": "2026-10-28T08:37:42.746327316Z",
  "refresh_token": "L1buArAPfdr6Hr0roNPbSR5IgRB3utS_-QIQXaZlubU",
  "refresh_expires_at": "2026-10-28T20:22:42.745514765Z",
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
  "session_id": "e313b511-386f-4caa-8ec2-13fba9d50ad8",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NjMsImlhdCI6MTc5MzE3NTc2MywianRpIjoiMzBkMTQ0NzAtOGE0Ni00OWJjLTliYzYtZTgzMzBjN2VjZWVlIiwic2lkIjoiZTMxM2I1MTEtMzg2Zi00Y2FhLThlYzItMTNmYmE5ZDUwYWQ4In0.wzKtEWsApkNG6_hzgqqNk1acadk5G5dH3lG8CR8iL_4",
  "access_expires_at": "2026-10-28T08:37:43.067268634Z",
  "refresh_token": "1TGBpqgspAY-IrkSY3nROchAZFYBAKemv7AC5eLzvyA",
  "refresh_expires_at": "2026-10-28T20:22:43.066532988Z",
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
  "command_id": "66dfe1e4-c4c5-45ec-a0ac-d070df861e1f",
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
  "id": "3e7e8ecd-46d2-45e7-96ac-e8c3be0d9ecd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:27:43.134841Z",
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
  "command_id": "83d3f45b-cdf7-4e16-8081-5f013c33f8de",
  "quote_id": "3e7e8ecd-46d2-45e7-96ac-e8c3be0d9ecd",
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
  "id": "a6ac036b-320a-4b52-90d9-feb9306af18c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c954ee45-1a67-4a13-96e1-42ec66b5dfd4",
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
  "created_at": "2026-10-28T08:22:43.180006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a6ac036b-320a-4b52-90d9-feb9306af18c` → **200**

```json
{
  "id": "a6ac036b-320a-4b52-90d9-feb9306af18c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c954ee45-1a67-4a13-96e1-42ec66b5dfd4",
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
  "created_at": "2026-10-28T08:22:43.180006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/a6ac036b-320a-4b52-90d9-feb9306af18c/cancel` → **200**

```json
{
  "command_id": "b7e06931-ffd1-4b9e-96eb-a405ad1b5542",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "a6ac036b-320a-4b52-90d9-feb9306af18c",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c954ee45-1a67-4a13-96e1-42ec66b5dfd4",
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
  "created_at": "2026-10-28T08:22:43.180006Z",
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
  "command_id": "3a8304f8-ae63-489e-969f-1bca368f2452",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:22:43Z",
    "sequence": 1793175763325
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a0b3846b-abf4-4ba3-b11c-5758d3731724",
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
  "last_heartbeat_at": "2026-10-28T08:22:43.346394Z",
  "last_location_at": "2026-10-28T08:22:43.346394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29711"
}
```

```json
{
  "challenge_id": "9b881dda-323e-47e3-9f74-b05a96ab7777",
  "expires_at": "2026-10-28T08:27:43.377863853Z",
  "resend_available_at": "2026-10-28T08:22:44.377863853Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "564881",
  "sent_at": "2026-10-28T08:22:43.38111502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b881dda-323e-47e3-9f74-b05a96ab7777",
  "code": "564881",
  "device_ref": "sandbox-29711"
}
```

```json
{
  "session_id": "66af3d51-d5b8-4cbe-8e5d-2c7c17ff75b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY2MywiaWF0IjoxNzkzMTc1NzYzLCJqdGkiOiJlZDQ0ZmIyYi1kZmYyLTQ1MzMtYjhkMy1kZTYzMzVmODhlOTkiLCJzaWQiOiI2NmFmM2Q1MS1kNWI4LTRjYmUtOGU1ZC0yYzdjMTdmZjc1YjgifQ.ViBLjCq49vn-PFnpujVhBocxqGvsD9Jvmhnb4mtgLYw",
  "access_expires_at": "2026-10-28T08:37:43.439031234Z",
  "refresh_token": "6UV5jrGKXKRaAavqHjNgNO1yvtaNpTUJH5K1tT_kR7M",
  "refresh_expires_at": "2026-11-27T08:22:43.438373342Z",
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
  "command_id": "efd84efc-302f-4fcf-8506-290efdfa1c61",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:22:43Z",
    "sequence": 1793175763490
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a451b53-7d7b-4854-b5b7-82853c150cef",
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
  "last_heartbeat_at": "2026-10-28T08:22:43.509788Z",
  "last_location_at": "2026-10-28T08:22:43.509788Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "64ec32ab-1742-4900-9760-66c55e6064ab",
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
  "id": "858e5c7d-faa9-43fe-a15a-9b1b65425669",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:27:43.555379Z",
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
  "command_id": "f8148fdb-451c-4007-9403-d514030c56ba",
  "quote_id": "858e5c7d-faa9-43fe-a15a-9b1b65425669",
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
  "id": "96103a4c-f305-435c-8b07-99889736d70e",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c954ee45-1a67-4a13-96e1-42ec66b5dfd4",
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
  "created_at": "2026-10-28T08:22:43.598372Z",
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
    "id": "7f8ae377-2709-4827-825a-31c5fb4d2121",
    "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
    "expires_at": "2026-10-28T08:22:58.602729Z",
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

`POST /api/driver/v1/offers/7f8ae377-2709-4827-825a-31c5fb4d2121/accept` → **200**

```json
{
  "command_id": "4f9fee13-8bd5-4244-b939-5608fc96c7c2"
}
```

```json
{
  "id": "a0e66b34-6561-4e68-80bd-b8bb418f7059",
  "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cfa6a143-66cf-4956-8f31-9ccfd1bd09c5",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cfa6a143-66cf-4956-8f31-9ccfd1bd09c5",
  "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
  "assignment_id": "a0e66b34-6561-4e68-80bd-b8bb418f7059",
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

`POST /api/driver/v1/trips/cfa6a143-66cf-4956-8f31-9ccfd1bd09c5/cancel` → **200**

```json
{
  "command_id": "bec9679f-a335-4d9b-bfdf-063930efae8c",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "cfa6a143-66cf-4956-8f31-9ccfd1bd09c5",
  "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
  "assignment_id": "a0e66b34-6561-4e68-80bd-b8bb418f7059",
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

`GET /api/rider/v1/orders/96103a4c-f305-435c-8b07-99889736d70e` → **200**

```json
{
  "id": "96103a4c-f305-435c-8b07-99889736d70e",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c954ee45-1a67-4a13-96e1-42ec66b5dfd4",
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
    "id": "a0e66b34-6561-4e68-80bd-b8bb418f7059",
    "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cfa6a143-66cf-4956-8f31-9ccfd1bd09c5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:22:43.598372Z",
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
    "id": "005007c4-9fe3-4851-b806-bd532abdfa11",
    "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
    "expires_at": "2026-10-28T08:22:58.751289Z",
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

`POST /api/driver/v1/offers/005007c4-9fe3-4851-b806-bd532abdfa11/accept` → **200**

```json
{
  "command_id": "2592b46b-2d4b-40e6-8eaf-b7cfa93dcd30"
}
```

```json
{
  "id": "0934d0a7-6fa5-48c9-8e7f-026ddb6a9b24",
  "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "04e8c1dd-48a1-4a9e-be7c-66a0c556c12e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "04e8c1dd-48a1-4a9e-be7c-66a0c556c12e",
  "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
  "assignment_id": "0934d0a7-6fa5-48c9-8e7f-026ddb6a9b24",
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

`POST /api/driver/v1/trips/04e8c1dd-48a1-4a9e-be7c-66a0c556c12e/cancel` → **200**

```json
{
  "command_id": "67c7dad0-31b1-4f0d-a20b-90ca929105f8",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "04e8c1dd-48a1-4a9e-be7c-66a0c556c12e",
  "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
  "assignment_id": "0934d0a7-6fa5-48c9-8e7f-026ddb6a9b24",
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
    "id": "96103a4c-f305-435c-8b07-99889736d70e",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:22:43.598372Z",
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
    "id": "a6ac036b-320a-4b52-90d9-feb9306af18c",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:22:43.180006Z",
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

`GET /api/operator/v1/orders/96103a4c-f305-435c-8b07-99889736d70e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:22:43.599083Z",
      "actor": {
        "type": "CLIENT",
        "id": "c954ee45-1a67-4a13-96e1-42ec66b5dfd4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
        "quote_id": "858e5c7d-faa9-43fe-a15a-9b1b65425669",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:22:43.601629Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
        "attempt_id": "5d6d23db-b8ad-4563-9af4-b547bd7bfb92",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:22:43.609413Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7f8ae377-2709-4827-825a-31c5fb4d2121",
        "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:22:43.675347Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7f8ae377-2709-4827-825a-31c5fb4d2121",
        "order_id": "96103a4c-f305-435c-8b07-99889736d70e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "a0e66b34-6561-4e68-80bd-b8bb418f7059"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders a6ac036b-320a-4b52-90d9-feb9306af18c, 96103a4c-f305-435c-8b07-99889736d70e.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730616356",
  "device_ref": "sandbox-16323"
}
```

```json
{
  "challenge_id": "239eed48-5fa9-4eaf-8916-e679528cd26f",
  "expires_at": "2026-10-28T08:27:44.06317985Z",
  "resend_available_at": "2026-10-28T08:22:45.06317985Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730616356` → **200**

```json
{
  "phone": "+380730616356",
  "audience": "CLIENT",
  "code": "641929",
  "sent_at": "2026-10-28T08:22:44.067114954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "239eed48-5fa9-4eaf-8916-e679528cd26f",
  "code": "641929",
  "device_ref": "sandbox-16323"
}
```

```json
{
  "session_id": "79bd85ed-7096-448d-9397-5ea4386c3bf1",
  "subject": {
    "type": "CLIENT",
    "id": "b5b8f832-fba5-4797-97a9-85d8dd68f011"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNWI4ZjgzMi1mYmE1LTQ3OTctOTdhOS04NWQ4ZGQ2OGYwMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjY0LCJpYXQiOjE3OTMxNzU3NjQsImp0aSI6IjQxMmY2MDk3LWFhNzYtNGVjYi05YjVmLWY4ZDJjZWQ2ZDRiMCIsInNpZCI6Ijc5YmQ4NWVkLTcwOTYtNDQ4ZC05Mzk3LTVlYTQzODZjM2JmMSJ9.XnUI-rrmGQvr0dMzswVHU6TX__jNMqjPFWxYWK-UYKk",
  "access_expires_at": "2026-10-28T08:37:44.128934975Z",
  "refresh_token": "23V8xK35R-0L2FPcR5mK7iCN7Q6h6TErm6hS5vD9NQ4",
  "refresh_expires_at": "2026-11-27T08:22:44.128270901Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b1c9b0a5-15d1-47f4-bb8d-f86b3f3f3c6b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e5588726-2f0d-41e9-b176-809f6266a8b1",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e5588726-2f0d-41e9-b176-809f6266a8b1",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c3cf8b028fa9eb9e6ba9e3bd0d71c89a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e5588726-2f0d-41e9-b176-809f6266a8b1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730616356"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e5588726-2f0d-41e9-b176-809f6266a8b1",
  "expires_at": "2026-10-28T08:52:44.165786Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e5588726-2f0d-41e9-b176-809f6266a8b1` → **200**

```json
{
  "id": "e5588726-2f0d-41e9-b176-809f6266a8b1",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:52:44.165786Z",
  "card": {
    "id": "ab662b06-b9be-4533-9cc2-93b6f7520e03",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0709",
    "card_type": "Visa",
    "created_at": "2026-10-28T08:22:44.212467Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "ab662b06-b9be-4533-9cc2-93b6f7520e03",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0709",
      "card_type": "Visa",
      "created_at": "2026-10-28T08:22:44.212467Z"
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
  "device_ref": "sandbox-11567"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "dd5ea8a2-361f-467c-b34b-c61e45d9c0c0",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11567"
}
```

```json
{
  "challenge_id": "fb26e07f-34a1-4de0-a77b-4acfe0e1e373",
  "expires_at": "2026-10-28T08:27:45.33230457Z",
  "resend_available_at": "2026-10-28T08:22:46.33230457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "028398",
  "sent_at": "2026-10-28T08:22:45.33502686Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb26e07f-34a1-4de0-a77b-4acfe0e1e373",
  "code": "028398",
  "device_ref": "sandbox-11567"
}
```

```json
{
  "session_id": "dfdc1701-0180-471e-aa98-b4b95f299dff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY2NSwiaWF0IjoxNzkzMTc1NzY1LCJqdGkiOiIzNjQxYmRhYy04ZTdiLTQ5NjEtYWNmYi02MjdiNTYzNTA2OTQiLCJzaWQiOiJkZmRjMTcwMS0wMTgwLTQ3MWUtYWE5OC1iNGI5NWYyOTlkZmYifQ.JLax8K1PVuNst77J_aJgVS18kQanlFygNgTCopYrKHk",
  "access_expires_at": "2026-10-28T08:37:45.391126802Z",
  "refresh_token": "-8u3cNJEHyCFiQZ3oP0uThJbSCJsL21ukcocux6Th9s",
  "refresh_expires_at": "2026-11-27T08:22:45.390429678Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a451b53-7d7b-4854-b5b7-82853c150cef",
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
  "last_heartbeat_at": "2026-10-28T08:22:43.509788Z",
  "last_location_at": "2026-10-28T08:22:43.509788Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1a451b53-7d7b-4854-b5b7-82853c150cef/handover` → **200**

```json
{
  "command_id": "7f2f3154-3600-4eda-a959-5503903422c9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a451b53-7d7b-4854-b5b7-82853c150cef",
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
  "last_heartbeat_at": "2026-10-28T08:22:43.509788Z",
  "last_location_at": "2026-10-28T08:22:43.509788Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1a451b53-7d7b-4854-b5b7-82853c150cef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:22:45Z",
    "sequence": 1793175765486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a451b53-7d7b-4854-b5b7-82853c150cef",
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
  "last_heartbeat_at": "2026-10-28T08:22:45.507439Z",
  "last_location_at": "2026-10-28T08:22:45.507439Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "852713a1-586e-48a6-90b6-f57f93f6bef7",
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
  "id": "25dd9833-6e5a-417f-818c-5270a9e62a92",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T08:27:45.547108Z",
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
  "command_id": "41b286dd-39ab-463e-a951-3ab5737f975f",
  "quote_id": "25dd9833-6e5a-417f-818c-5270a9e62a92",
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
  "id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b5b8f832-fba5-4797-97a9-85d8dd68f011",
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
  "created_at": "2026-10-28T08:22:45.588841Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0` → **200**

```json
{
  "id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b5b8f832-fba5-4797-97a9-85d8dd68f011",
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
  "created_at": "2026-10-28T08:22:45.588841Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0` → **200**

```json
{
  "id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b5b8f832-fba5-4797-97a9-85d8dd68f011",
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
  "created_at": "2026-10-28T08:22:45.588841Z",
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
    "id": "ea48a0ca-3a73-4e81-b867-6f9fe9353617",
    "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
    "expires_at": "2026-10-28T08:23:00.993163Z",
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

`POST /api/driver/v1/offers/ea48a0ca-3a73-4e81-b867-6f9fe9353617/accept` → **200**

```json
{
  "command_id": "ecd1c255-6f0a-4232-a11e-57606802b876"
}
```

```json
{
  "id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "assignment_id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
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

`POST /api/driver/v1/work-sessions/1a451b53-7d7b-4854-b5b7-82853c150cef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:22:46Z",
    "sequence": 1793175766768
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a451b53-7d7b-4854-b5b7-82853c150cef",
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
  "last_heartbeat_at": "2026-10-28T08:22:46.788445Z",
  "last_location_at": "2026-10-28T08:22:46.788445Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b526c9e8-6f3d-4118-96e3-f33ee59a6f1a/arrive` → **200**

```json
{
  "command_id": "5c913d80-a804-4862-b677-230dbc381463",
  "expected_version": 0
}
```

```json
{
  "id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "assignment_id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
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
  "arrived_at": "2026-10-28T08:22:46.827385Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b526c9e8-6f3d-4118-96e3-f33ee59a6f1a/start` → **200**

```json
{
  "command_id": "def9a83a-9d09-497d-84ba-dedffbb60c42",
  "expected_version": 1
}
```

```json
{
  "id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "assignment_id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
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
  "arrived_at": "2026-10-28T08:22:46.827385Z",
  "started_at": "2026-10-28T08:22:46.871118Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b526c9e8-6f3d-4118-96e3-f33ee59a6f1a/complete` → **200**

```json
{
  "command_id": "361269ee-37a3-4bba-a7d5-13b39d89c639",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:22:46Z"
}
```

```json
{
  "id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "assignment_id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
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
  "arrived_at": "2026-10-28T08:22:46.827385Z",
  "started_at": "2026-10-28T08:22:46.871118Z",
  "completed_at": "2026-10-28T08:22:46.918611Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0` → **200**

```json
{
  "id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b5b8f832-fba5-4797-97a9-85d8dd68f011",
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
    "id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
    "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:22:45.588841Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0` → **200**

```json
{
  "id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b5b8f832-fba5-4797-97a9-85d8dd68f011",
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
    "id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
    "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:22:45.588841Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0` → **200**

```json
{
  "id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b5b8f832-fba5-4797-97a9-85d8dd68f011",
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
    "id": "669bbcdc-2c85-49ec-b7b1-ef463144607c",
    "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b526c9e8-6f3d-4118-96e3-f33ee59a6f1a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:22:45.588841Z",
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
      "id": "8dc178da-1636-4b6b-8324-43ebb7ec80ac",
      "at": "2026-10-28T08:22:47.028131Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0/tip` → **200**

```json
{
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
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
  "available_until": "2026-10-29T08:22:46.918611Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0/tip` → **201**

```json
{
  "command_id": "d522e190-ba71-4523-8210-00e17908907d",
  "amount_minor": 2500
}
```

```json
{
  "id": "9720aaee-f67a-4c1d-aa15-062f2b5193b6",
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T08:22:49.144314Z"
}
```

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0/tip` → **200**

```json
{
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
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
  "available_until": "2026-10-29T08:22:46.918611Z",
  "open": false,
  "tip": {
    "id": "9720aaee-f67a-4c1d-aa15-062f2b5193b6",
    "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T08:22:49.144314Z"
  }
}
```

`GET /api/rider/v1/orders/8b7c1591-268f-4ec1-acb7-86fa0d9d09a0/tip` → **200**

```json
{
  "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
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
  "available_until": "2026-10-29T08:22:46.918611Z",
  "open": false,
  "tip": {
    "id": "9720aaee-f67a-4c1d-aa15-062f2b5193b6",
    "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T08:22:49.144314Z"
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
      "id": "8dc178da-1636-4b6b-8324-43ebb7ec80ac",
      "at": "2026-10-28T08:22:47.028131Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
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
      "id": "c953f835-d8da-4cee-b1d6-e6ed585b48b1",
      "at": "2026-10-28T08:22:51.097186Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
      "counterpart_id": null
    },
    {
      "id": "8dc178da-1636-4b6b-8324-43ebb7ec80ac",
      "at": "2026-10-28T08:22:47.028131Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "8b7c1591-268f-4ec1-acb7-86fa0d9d09a0",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a451b53-7d7b-4854-b5b7-82853c150cef",
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
  "last_heartbeat_at": "2026-10-28T08:22:46.788445Z",
  "last_location_at": "2026-10-28T08:22:46.788445Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1a451b53-7d7b-4854-b5b7-82853c150cef/close` → **200**

```json
{
  "command_id": "f1139185-e918-4df3-a615-8199af84a217",
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

Done: card order 8b7c1591-268f-4ec1-acb7-86fa0d9d09a0.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738808091",
  "device_ref": "sandbox-22691"
}
```

```json
{
  "challenge_id": "4802ffc5-95de-4d3d-94a1-edf1709450b3",
  "expires_at": "2026-10-28T08:27:51.364400264Z",
  "resend_available_at": "2026-10-28T08:22:52.364400264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738808091` → **200**

```json
{
  "phone": "+380738808091",
  "audience": "CLIENT",
  "code": "771292",
  "sent_at": "2026-10-28T08:22:51.367389825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4802ffc5-95de-4d3d-94a1-edf1709450b3",
  "code": "771292",
  "device_ref": "sandbox-22691"
}
```

```json
{
  "session_id": "3b5c039b-fa92-4118-8f2e-b0f6f0a2d606",
  "subject": {
    "type": "CLIENT",
    "id": "626daec1-814d-41f4-8b21-d9bfe96bda74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjZkYWVjMS04MTRkLTQxZjQtOGIyMS1kOWJmZTk2YmRhNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjcxLCJpYXQiOjE3OTMxNzU3NzEsImp0aSI6IjdlOTgzZWY5LTdhYjItNDUzOC1hYzhhLTE1YzBjOWYyNWU1MSIsInNpZCI6IjNiNWMwMzliLWZhOTItNDExOC04ZjJlLWIwZjZmMGEyZDYwNiJ9.G1Xh86VYebciszpGZHUf_9CzwSpEBstDUVNbbhhD1DQ",
  "access_expires_at": "2026-10-28T08:37:51.423945358Z",
  "refresh_token": "JZxeJH3V7-cxbSYd5WJVfVArBZuh0zlGgna4lRXglSU",
  "refresh_expires_at": "2026-11-27T08:22:51.423164818Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e085a160-e0c5-4e89-9ec9-e56c1583130c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9c4fbb27-e1b3-4f61-931b-380db67f816b",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9c4fbb27-e1b3-4f61-931b-380db67f816b",
    "orderDate": "1793175771",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "ae176bab920c640c9da29c232ae51097",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9c4fbb27-e1b3-4f61-931b-380db67f816b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738808091"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9c4fbb27-e1b3-4f61-931b-380db67f816b",
  "created_at": "2026-10-28T08:22:51.460514Z",
  "expires_at": "2026-10-28T08:52:51.460514Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9c4fbb27-e1b3-4f61-931b-380db67f816b` → **200**

```json
{
  "id": "9c4fbb27-e1b3-4f61-931b-380db67f816b",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:22:51.460514Z",
  "expires_at": "2026-10-28T08:52:51.460514Z",
  "completed_at": "2026-10-28T08:22:51.500887Z",
  "masked_pan": "41****5988",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "626daec1-814d-41f4-8b21-d9bfe96bda74",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "626daec1-814d-41f4-8b21-d9bfe96bda74",
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
      "id": "c4e3660d-b1ae-4660-a005-c2ccffd1288e",
      "at": "2026-10-28T08:22:52.112073Z",
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
  "client_id": "626daec1-814d-41f4-8b21-d9bfe96bda74",
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
      "id": "c4e3660d-b1ae-4660-a005-c2ccffd1288e",
      "at": "2026-10-28T08:22:52.112073Z",
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
  "device_ref": "sandbox-20144"
}
```

```json
{
  "challenge_id": "09eb1afd-d240-4493-8ef4-be60fdcc51a5",
  "expires_at": "2026-10-28T08:27:52.633605233Z",
  "resend_available_at": "2026-10-28T08:22:53.633605233Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "068759",
  "sent_at": "2026-10-28T08:22:52.636488477Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09eb1afd-d240-4493-8ef4-be60fdcc51a5",
  "code": "068759",
  "device_ref": "sandbox-20144"
}
```

```json
{
  "session_id": "58ac61f3-8000-4b65-b2b1-c6298e03559c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY3MiwiaWF0IjoxNzkzMTc1NzcyLCJqdGkiOiI5MzI3Y2U5ZC1lN2JjLTRlNjktOTFiMS03Y2U4MjA1ZjNjZjIiLCJzaWQiOiI1OGFjNjFmMy04MDAwLTRiNjUtYjJiMS1jNjI5OGUwMzU1OWMifQ.nJrc_OJ13wSRYZcMFXYbtH_3fugHUouVGf6ftgcAOMs",
  "access_expires_at": "2026-10-28T08:37:52.693489Z",
  "refresh_token": "XJaGdxIOE14swTyW6CdsK_sYEKWUQFRCL5N64kgK0mc",
  "refresh_expires_at": "2026-11-27T08:22:52.692933133Z",
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
  "command_id": "19ca5e0a-0dc7-463b-8880-cda4cca70cd7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "e404b2e7-6e93-472a-a672-3153c93b2d9e",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e404b2e7-6e93-472a-a672-3153c93b2d9e",
    "orderDate": "1793175772",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "3bc087abecd3e51bc41b687665a3aa09",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e404b2e7-6e93-472a-a672-3153c93b2d9e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e404b2e7-6e93-472a-a672-3153c93b2d9e",
  "created_at": "2026-10-28T08:22:52.749419Z",
  "expires_at": "2026-10-28T08:52:52.749419Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/e404b2e7-6e93-472a-a672-3153c93b2d9e` → **200**

```json
{
  "id": "e404b2e7-6e93-472a-a672-3153c93b2d9e",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:22:52.749419Z",
  "expires_at": "2026-10-28T08:52:52.749419Z",
  "completed_at": "2026-10-28T08:22:52.782269Z",
  "masked_pan": "41****2298",
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
      "id": "1dde26c7-aa85-4011-b04c-94d4d9a57987",
      "at": "2026-10-28T08:22:53.119701Z",
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
  "command_id": "0b0583f3-c168-4880-a008-45f873a3a708",
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
  "correlation_id": "1f8629fd-655a-48aa-afaf-5c867fc95899"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675203703",
  "device_ref": "sandbox-23486"
}
```

```json
{
  "challenge_id": "9359b049-0bec-4943-bb44-88a5f32537f9",
  "expires_at": "2026-10-28T08:27:53.929271057Z",
  "resend_available_at": "2026-10-28T08:22:54.929271057Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675203703` → **200**

```json
{
  "phone": "+380675203703",
  "audience": "CLIENT",
  "code": "053415",
  "sent_at": "2026-10-28T08:22:53.932178933Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9359b049-0bec-4943-bb44-88a5f32537f9",
  "code": "053415",
  "device_ref": "sandbox-23486"
}
```

```json
{
  "session_id": "f8e4efa2-35d7-4523-be29-492facabeeba",
  "subject": {
    "type": "CLIENT",
    "id": "abd37c29-990b-4abc-ada2-47c1240e8b6b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmQzN2MyOS05OTBiLTRhYmMtYWRhMi00N2MxMjQwZThiNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjczLCJpYXQiOjE3OTMxNzU3NzMsImp0aSI6IjM4YjliOWNiLWUyNDQtNGE1MS04MTNkLWFkZTYxYmUwMTY2OSIsInNpZCI6ImY4ZTRlZmEyLTM1ZDctNDUyMy1iZTI5LTQ5MmZhY2FiZWViYSJ9.SurZmtHBebqPr3BAbouKVKivjxplxGmZ5wkjquoAZv0",
  "access_expires_at": "2026-10-28T08:37:53.990265408Z",
  "refresh_token": "239Gajl7_oXwQiUPMqWuxOXSlJhdVZKSV_TsQKojiCI",
  "refresh_expires_at": "2026-11-27T08:22:53.989677643Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "abd37c29-990b-4abc-ada2-47c1240e8b6b",
  "session_id": "f8e4efa2-35d7-4523-be29-492facabeeba",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3133115e-ef4d-45a2-833e-e897faf1e26f",
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
  "id": "c1371589-f9d5-4c97-b6d2-7b1724d67584",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:27:54.052439Z",
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
  "challenge_id": "7b561210-25e0-4834-a2a0-35a0b5da57d6",
  "expires_at": "2026-10-28T08:27:56.089776841Z",
  "resend_available_at": "2026-10-28T08:22:57.089776841Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675203703` → **200**

```json
{
  "phone": "+380675203703",
  "audience": "CLIENT",
  "code": "934116",
  "sent_at": "2026-10-28T08:22:56.091850508Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "93f3ec57-7ba8-4fed-9602-f6bc1911a79d",
  "challenge_id": "7b561210-25e0-4834-a2a0-35a0b5da57d6",
  "otp_code": "934116"
}
```

```json
{
  "client_id": "abd37c29-990b-4abc-ada2-47c1240e8b6b",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T08:22:56.159127871Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2efa248a-2075-4af0-8b0b-c98bf4f93e40",
  "quote_id": "c1371589-f9d5-4c97-b6d2-7b1724d67584",
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
  "correlation_id": "f886fa0b-471b-4438-adff-7dcc755d0bcb"
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
  "session_id": "3821c8fd-2785-43b7-9fa0-fc846e4db4de",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NzYsImlhdCI6MTc5MzE3NTc3NiwianRpIjoiNjA0YmRjMTEtZjk3Mi00NGZkLWFjYWQtYTBlYTJiMzNkZGM2Iiwic2lkIjoiMzgyMWM4ZmQtMjc4NS00M2I3LTlmYTAtZmM4NDZlNGRiNGRlIn0.cTKPFYl2oJPQd9EHAIVtVSfQPeql4D31iyjlfNVWFpU",
  "access_expires_at": "2026-10-28T08:37:56.523326145Z",
  "refresh_token": "FNnjmuHQ68yOyFSiggfslxoIWlHxz9LxPOG0NUjH16E",
  "refresh_expires_at": "2026-10-28T20:22:56.522715755Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "abd37c29-990b-4abc-ada2-47c1240e8b6b",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T08:22:56.159128Z",
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

`POST /api/admin/v1/client-deletions/abd37c29-990b-4abc-ada2-47c1240e8b6b/complete` → **200**

```json
{
  "command_id": "ae3336b7-7776-4651-9659-7388bf09ee3c",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "abd37c29-990b-4abc-ada2-47c1240e8b6b",
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
  "correlation_id": "c8a2e317-a259-4851-b464-084a8092b6db"
}
```

Done: client abd37c29-990b-4abc-ada2-47c1240e8b6b anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660422280",
  "device_ref": "sandbox-10171"
}
```

```json
{
  "challenge_id": "77531baa-4095-4d0a-a058-4b30d3ccd195",
  "expires_at": "2026-10-28T08:27:56.669933301Z",
  "resend_available_at": "2026-10-28T08:22:57.669933301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660422280` → **200**

```json
{
  "phone": "+380660422280",
  "audience": "CLIENT",
  "code": "550842",
  "sent_at": "2026-10-28T08:22:56.672423321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77531baa-4095-4d0a-a058-4b30d3ccd195",
  "code": "550842",
  "device_ref": "sandbox-10171"
}
```

```json
{
  "session_id": "965e113f-67d2-4fe6-89c3-0a37321dd017",
  "subject": {
    "type": "CLIENT",
    "id": "a7d4728d-b2dc-4297-a746-4768cbd511d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2Q0NzI4ZC1iMmRjLTQyOTctYTc0Ni00NzY4Y2JkNTExZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2Njc2LCJpYXQiOjE3OTMxNzU3NzYsImp0aSI6IjQ3NWNiMjg4LWVkOTktNDIwZS1iZGZkLTNiYTcyMGI2NDVjMiIsInNpZCI6Ijk2NWUxMTNmLTY3ZDItNGZlNi04OWMzLTBhMzczMjFkZDAxNyJ9.B10eriqJ5EKmaiBSbes4IrjAlnWRnFqN6qmBO_NtxJA",
  "access_expires_at": "2026-10-28T08:37:56.741583169Z",
  "refresh_token": "u5cxYqTEwZtrguD5Pj1_clw4QY-3nMugcn5n8KcG7Tc",
  "refresh_expires_at": "2026-11-27T08:22:56.740939955Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a7d4728d-b2dc-4297-a746-4768cbd511d8",
  "session_id": "965e113f-67d2-4fe6-89c3-0a37321dd017",
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
  "session_id": "c72a7828-44db-4d25-a504-7897401738f9",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2NzcsImlhdCI6MTc5MzE3NTc3NywianRpIjoiNzZiZjM3M2YtZjVlMi00Mzc2LWJmMGYtOWNiNjE5M2IyY2I1Iiwic2lkIjoiYzcyYTc4MjgtNDRkYi00ZDI1LWE1MDQtNzg5NzQwMTczOGY5In0.8Dv7B5ly-vC8csR2SvNQOlsGHEUYWtVTwUktJGnpaOY",
  "access_expires_at": "2026-10-28T08:37:57.093092759Z",
  "refresh_token": "icrDUyIUXaqKEnKqh3rMq8sOj_oRnmoN3h9SScwLkMg",
  "refresh_expires_at": "2026-10-28T20:22:57.092474694Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0422280&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a7d4728d-b2dc-4297-a746-4768cbd511d8",
      "phone": "+380660422280",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T08:22:56.738811Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a7d4728d-b2dc-4297-a746-4768cbd511d8` → **200**

```json
{
  "client": {
    "id": "a7d4728d-b2dc-4297-a746-4768cbd511d8",
    "phone": "+380660422280",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T08:22:56.738811Z",
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

`POST /api/admin/v1/clients/a7d4728d-b2dc-4297-a746-4768cbd511d8/block` → **400**

```json
{
  "command_id": "3f7cdaeb-6bc1-4855-a0a0-7147dce514fb",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a7d4728d-b2dc-4297-a746-4768cbd511d8/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2f80eb11-12ba-4730-8d84-0437084f7dfb",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a7d4728d-b2dc-4297-a746-4768cbd511d8/block` → **200**

```json
{
  "command_id": "1f217a70-f2c0-4e45-977f-dcca99ef89e9",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a7d4728d-b2dc-4297-a746-4768cbd511d8",
  "phone": "+380660422280",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T08:22:56.738811Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T08:22:57.260086Z",
    "by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
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
  "correlation_id": "73a4e025-0276-4203-a84c-1a51911612dd"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660422280",
  "device_ref": "sandbox-8796"
}
```

```json
{
  "challenge_id": "cdd9591a-38dd-43b2-afe6-9995364e46a8",
  "expires_at": "2026-10-28T08:27:59.323331259Z",
  "resend_available_at": "2026-10-28T08:23:00.323331259Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660422280` → **200**

```json
{
  "phone": "+380660422280",
  "audience": "CLIENT",
  "code": "932206",
  "sent_at": "2026-10-28T08:22:59.326314454Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "cdd9591a-38dd-43b2-afe6-9995364e46a8",
  "code": "932206",
  "device_ref": "sandbox-8796"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "9f0204b5-55ee-4059-a63a-7e01d30b25cc"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a7d4728d-b2dc-4297-a746-4768cbd511d8` → **200**

```json
{
  "client": {
    "id": "a7d4728d-b2dc-4297-a746-4768cbd511d8",
    "phone": "+380660422280",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T08:22:56.738811Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T08:22:57.260086Z",
      "by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
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

`POST /api/admin/v1/clients/a7d4728d-b2dc-4297-a746-4768cbd511d8/unblock` → **200**

```json
{
  "command_id": "e3d3583b-a091-49ca-bd1b-66ec2086f003",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a7d4728d-b2dc-4297-a746-4768cbd511d8",
  "phone": "+380660422280",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T08:22:56.738811Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660422280",
  "device_ref": "sandbox-10372"
}
```

```json
{
  "challenge_id": "cab3b002-32b5-4b63-bcf5-d3d5c3df4188",
  "expires_at": "2026-10-28T08:28:01.479283043Z",
  "resend_available_at": "2026-10-28T08:23:02.479283043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660422280` → **200**

```json
{
  "phone": "+380660422280",
  "audience": "CLIENT",
  "code": "329740",
  "sent_at": "2026-10-28T08:23:01.48164333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cab3b002-32b5-4b63-bcf5-d3d5c3df4188",
  "code": "329740",
  "device_ref": "sandbox-10372"
}
```

```json
{
  "session_id": "a5a638da-2747-4b70-bae6-cd04b77f0e5e",
  "subject": {
    "type": "CLIENT",
    "id": "a7d4728d-b2dc-4297-a746-4768cbd511d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2Q0NzI4ZC1iMmRjLTQyOTctYTc0Ni00NzY4Y2JkNTExZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjgxLCJpYXQiOjE3OTMxNzU3ODEsImp0aSI6IjU1MTRlMGE4LWVjNzUtNDgzYi05Yzc1LWE5ZDRiYTlkMWVlYyIsInNpZCI6ImE1YTYzOGRhLTI3NDctNGI3MC1iYWU2LWNkMDRiNzdmMGU1ZSJ9.hEbi76G_qsBjx0ra6787kg9O6iWQXfHKRvTO5gGWJY8",
  "access_expires_at": "2026-10-28T08:38:01.538159784Z",
  "refresh_token": "kQiWm4S6mjOncon98LIvkDrOY1JStfIvCQsSqfEmnV8",
  "refresh_expires_at": "2026-11-27T08:23:01.537500141Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a7d4728d-b2dc-4297-a746-4768cbd511d8",
  "session_id": "a5a638da-2747-4b70-bae6-cd04b77f0e5e",
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
  "phone": "+380638680531",
  "device_ref": "sandbox-28852"
}
```

```json
{
  "challenge_id": "e7030522-5fa6-4c45-8df1-6390740eec31",
  "expires_at": "2026-10-28T08:28:01.599885404Z",
  "resend_available_at": "2026-10-28T08:23:02.599885404Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638680531` → **200**

```json
{
  "phone": "+380638680531",
  "audience": "CLIENT",
  "code": "915147",
  "sent_at": "2026-10-28T08:23:01.602413084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7030522-5fa6-4c45-8df1-6390740eec31",
  "code": "915147",
  "device_ref": "sandbox-28852"
}
```

```json
{
  "session_id": "c029911e-6a45-4c97-9d9e-423f17be69f3",
  "subject": {
    "type": "CLIENT",
    "id": "e3bdd38d-8c7a-4942-a613-adedfb136ec3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlM2JkZDM4ZC04YzdhLTQ5NDItYTYxMy1hZGVkZmIxMzZlYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjgxLCJpYXQiOjE3OTMxNzU3ODEsImp0aSI6IjZiYWU4M2IwLWRhY2YtNGMwNi1hYjg5LTIxYzk4Y2UwOWIzNyIsInNpZCI6ImMwMjk5MTFlLTZhNDUtNGM5Ny05ZDllLTQyM2YxN2JlNjlmMyJ9.CJ3dcRqVfK9JC7h4yiJcbd_GI6LI4nxu9oGcPGTgklQ",
  "access_expires_at": "2026-10-28T08:38:01.660307327Z",
  "refresh_token": "xXYctdfUpfM5BA73jN3auabxoHH9jJJFYA4d9_S1KPU",
  "refresh_expires_at": "2026-11-27T08:23:01.659188999Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ae4f11f9-778c-45ac-9d31-6eafbefe4c60",
  "expires_at": "2026-10-28T08:28:03.695484338Z",
  "resend_available_at": "2026-10-28T08:23:04.695484338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638680531` → **200**

```json
{
  "phone": "+380638680531",
  "audience": "CLIENT",
  "code": "437517",
  "sent_at": "2026-10-28T08:23:03.698201679Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a56dbd46-41f9-4691-9856-2233da9d8db8",
  "challenge_id": "ae4f11f9-778c-45ac-9d31-6eafbefe4c60",
  "otp_code": "437517"
}
```

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "PENDING",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d` → **200**

```json
{
  "id": "12588105-6c30-4156-be85-d6aa586b243d",
  "state": "READY",
  "created_at": "2026-10-28T08:23:03.765973Z",
  "ready_at": "2026-10-28T08:23:11.692177Z",
  "expires_at": "2026-11-04T08:23:11.692177Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639528798",
  "device_ref": "sandbox-30534"
}
```

```json
{
  "challenge_id": "433ec339-61db-471a-8e17-9ab53b51e3d6",
  "expires_at": "2026-10-28T08:28:12.058577683Z",
  "resend_available_at": "2026-10-28T08:23:13.058577683Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639528798` → **200**

```json
{
  "phone": "+380639528798",
  "audience": "CLIENT",
  "code": "849796",
  "sent_at": "2026-10-28T08:23:12.061319287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "433ec339-61db-471a-8e17-9ab53b51e3d6",
  "code": "849796",
  "device_ref": "sandbox-30534"
}
```

```json
{
  "session_id": "f5a0503d-4aff-4fa0-9811-6762ba00d19b",
  "subject": {
    "type": "CLIENT",
    "id": "7a565499-771b-4675-8842-f5e18c30f608"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTU2NTQ5OS03NzFiLTQ2NzUtODg0Mi1mNWUxOGMzMGY2MDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjkyLCJpYXQiOjE3OTMxNzU3OTIsImp0aSI6ImEwMGM5ZDFhLTM3YzEtNDJiMC1iN2VmLThhZDQwOWI4NDExYiIsInNpZCI6ImY1YTA1MDNkLTRhZmYtNGZhMC05ODExLTY3NjJiYTAwZDE5YiJ9.ORZJYbG8WaZUe1THfdCoFDfiiy5TxLTRfKm8P6Y5p38",
  "access_expires_at": "2026-10-28T08:38:12.117759033Z",
  "refresh_token": "gC24ydAZCVkPb1N_Zr2DDZZrIzNKEzBTEW1aEebnEQ4",
  "refresh_expires_at": "2026-11-27T08:23:12.117108399Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/12588105-6c30-4156-be85-d6aa586b243d/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3301e277-66af-42df-8dcb-af1dbf179a36"
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
  "session_id": "069ad01a-ec3b-4c3b-9093-fb90c64463d8",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2OTIsImlhdCI6MTc5MzE3NTc5MiwianRpIjoiNWU3MjA5NmEtZGY3OC00NzRlLWE4MzgtYTYxYzZmN2NhY2RkIiwic2lkIjoiMDY5YWQwMWEtZWMzYi00YzNiLTkwOTMtZmI5MGM2NDQ2M2Q4In0.wf_QG7tfpubgf6TnSEeapbATesXfno9zM8xd3_4-BH0",
  "access_expires_at": "2026-10-28T08:38:12.464340323Z",
  "refresh_token": "ke_zwiHEq2-Nlx-KjRoxBTAF4TRtcReulGnAvDzbYYg",
  "refresh_expires_at": "2026-10-28T20:23:12.463793422Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e3bdd38d-8c7a-4942-a613-adedfb136ec3",
  "session_id": "c029911e-6a45-4c97-9d9e-423f17be69f3",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e3bdd38d-8c7a-4942-a613-adedfb136ec3/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "12588105-6c30-4156-be85-d6aa586b243d",
      "state": "READY",
      "created_at": "2026-10-28T08:23:03.765973Z",
      "ready_at": "2026-10-28T08:23:11.692177Z",
      "expires_at": "2026-11-04T08:23:11.692177Z",
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
  "device_ref": "sandbox-7744"
}
```

```json
{
  "challenge_id": "94b52f86-efe5-4ccc-a11a-4dd3d7274f9e",
  "expires_at": "2026-10-28T08:28:12.55494729Z",
  "resend_available_at": "2026-10-28T08:23:13.55494729Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "204163",
  "sent_at": "2026-10-28T08:23:12.557419659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94b52f86-efe5-4ccc-a11a-4dd3d7274f9e",
  "code": "204163",
  "device_ref": "sandbox-7744"
}
```

```json
{
  "session_id": "61a76f18-fd07-49fd-80b4-9633520a637a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY5MiwiaWF0IjoxNzkzMTc1NzkyLCJqdGkiOiI0NWUxMjg4OS00MzRjLTQ3ZmMtYjZjYi04ZTMxMWQ4MGI4Y2MiLCJzaWQiOiI2MWE3NmYxOC1mZDA3LTQ5ZmQtODBiNC05NjMzNTIwYTYzN2EifQ.jROR5BKfI__wNHoyETadXxuMHhwkjbSogYFSrHdGjmY",
  "access_expires_at": "2026-10-28T08:38:12.615514566Z",
  "refresh_token": "CotER3hpcosi70z67y4q4gJB43LIaezshOocBGValDs",
  "refresh_expires_at": "2026-11-27T08:23:12.614858061Z",
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
  "device_ref": "sandbox-7505"
}
```

```json
{
  "challenge_id": "35a0f9e7-bd36-4424-9703-5edc1b253e9c",
  "expires_at": "2026-10-28T08:28:12.667071378Z",
  "resend_available_at": "2026-10-28T08:23:13.667071378Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "918179",
  "sent_at": "2026-10-28T08:23:12.670349425Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35a0f9e7-bd36-4424-9703-5edc1b253e9c",
  "code": "918179",
  "device_ref": "sandbox-7505"
}
```

```json
{
  "session_id": "3651e26b-561c-47b5-959a-a1e9a03ba1b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY5MiwiaWF0IjoxNzkzMTc1NzkyLCJqdGkiOiJmNTk3OTY5ZC04MTNkLTRiY2YtOTNiMy01ZDAwMjc1MGY1MTEiLCJzaWQiOiIzNjUxZTI2Yi01NjFjLTQ3YjUtOTU5YS1hMWU5YTAzYmExYjIifQ.8pK0CdxOrMH255ShNymsJ_-fn0RrAI7EUArCBeDCEQw",
  "access_expires_at": "2026-10-28T08:38:12.727665292Z",
  "refresh_token": "M0KlsTxOXu-x3vq78u-hXUnM46ZG2izEIWMuiVddYoY",
  "refresh_expires_at": "2026-11-27T08:23:12.727099045Z",
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
  "command_id": "e11dc49c-b51c-401b-9b5a-aae7b97caeb7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:12Z",
    "sequence": 1793175792777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a103547e-b427-4fc5-a7b1-8c95fdfb60be",
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
  "last_heartbeat_at": "2026-10-28T08:23:12.795939Z",
  "last_location_at": "2026-10-28T08:23:12.795939Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-21931"
}
```

```json
{
  "challenge_id": "6ff4f2b5-504c-4ceb-b275-85e7b170cf3e",
  "expires_at": "2026-10-28T08:28:12.825185718Z",
  "resend_available_at": "2026-10-28T08:23:13.825185718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "418530",
  "sent_at": "2026-10-28T08:23:12.82762371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ff4f2b5-504c-4ceb-b275-85e7b170cf3e",
  "code": "418530",
  "device_ref": "sandbox-21931"
}
```

```json
{
  "session_id": "5c95d502-7d09-42f3-8d9b-eb3ea1c0e36b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY5MiwiaWF0IjoxNzkzMTc1NzkyLCJqdGkiOiIyNjMwNzE1Zi03ZDNhLTQxYjQtOTMyYy1lMDU4M2RhMmRkZGYiLCJzaWQiOiI1Yzk1ZDUwMi03ZDA5LTQyZjMtOGQ5Yi1lYjNlYTFjMGUzNmIifQ.ziKNnchSkpkaQ7NRTGSwAU_vXOSxR6tdndAoc9CrNSQ",
  "access_expires_at": "2026-10-28T08:38:12.883929188Z",
  "refresh_token": "J0CMCQHhcaimrRn5YRMGFXjZVp0UsweovD2ZBYl-TY8",
  "refresh_expires_at": "2026-11-27T08:23:12.883296768Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a0b3846b-abf4-4ba3-b11c-5758d3731724",
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
  "last_heartbeat_at": "2026-10-28T08:22:43.346394Z",
  "last_location_at": "2026-10-28T08:22:43.346394Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a0b3846b-abf4-4ba3-b11c-5758d3731724/handover` → **200**

```json
{
  "command_id": "cb5b3783-8a45-4bf4-837e-1d9bfcdccf20",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a0b3846b-abf4-4ba3-b11c-5758d3731724",
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
  "last_heartbeat_at": "2026-10-28T08:22:43.346394Z",
  "last_location_at": "2026-10-28T08:22:43.346394Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a0b3846b-abf4-4ba3-b11c-5758d3731724/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:12Z",
    "sequence": 1793175792970
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a0b3846b-abf4-4ba3-b11c-5758d3731724",
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
  "last_heartbeat_at": "2026-10-28T08:23:12.989163Z",
  "last_location_at": "2026-10-28T08:23:12.989163Z",
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
  "session_id": "ac646962-96e0-4796-94df-0d42a53aa251",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2OTMsImlhdCI6MTc5MzE3NTc5MywianRpIjoiOWJmOTdiYTAtZmU0YS00YjI0LWJhMGMtMDgxNDAyNWFjMTYzIiwic2lkIjoiYWM2NDY5NjItOTZlMC00Nzk2LTk0ZGYtMGQ0MmE1M2FhMjUxIn0.oFSweHZH9KjDz87X7UVypZOzmxvM4Wh6tFjPIMb9prQ",
  "access_expires_at": "2026-10-28T08:38:13.305925208Z",
  "refresh_token": "MYz7bdJasxgprEXenuG1oEwWq4Bnj46q2u5eE2N8oo8",
  "refresh_expires_at": "2026-10-28T20:23:13.305257339Z",
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
  "session_id": "5f1be26f-3f9e-402c-ad57-9614c7928195",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2OTMsImlhdCI6MTc5MzE3NTc5MywianRpIjoiMjFkNzI0OTItNTEwMi00NjgyLWE1MGYtNzFhYzI4MWFhYzNhIiwic2lkIjoiNWYxYmUyNmYtM2Y5ZS00MDJjLWFkNTctOTYxNGM3OTI4MTk1In0.i7r8akgisSSVt9zpH4cJHEKD-RZvMWny2SuQfgN8Ua4",
  "access_expires_at": "2026-10-28T08:38:13.625008844Z",
  "refresh_token": "UZIE9jWkmtx91W9sVb9zYWxU9chunLMfe-DYFRLVd5s",
  "refresh_expires_at": "2026-10-28T20:23:13.624431446Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681877159",
  "device_ref": "sandbox-7043"
}
```

```json
{
  "challenge_id": "5e6a4a69-80ad-4758-955e-d619091a8fbe",
  "expires_at": "2026-10-28T08:28:13.652108037Z",
  "resend_available_at": "2026-10-28T08:23:14.652108037Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681877159` → **200**

```json
{
  "phone": "+380681877159",
  "audience": "CLIENT",
  "code": "388770",
  "sent_at": "2026-10-28T08:23:13.654391319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e6a4a69-80ad-4758-955e-d619091a8fbe",
  "code": "388770",
  "device_ref": "sandbox-7043"
}
```

```json
{
  "session_id": "e564181e-2b73-4e71-82a5-a985e4b9f984",
  "subject": {
    "type": "CLIENT",
    "id": "da886b17-b008-4a89-868f-4feea8db789d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTg4NmIxNy1iMDA4LTRhODktODY4Zi00ZmVlYThkYjc4OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NjkzLCJpYXQiOjE3OTMxNzU3OTMsImp0aSI6ImZkZTUxNGVkLWU0NjAtNDcxMi05ZTRiLTMyZTU2OGQ3Nzc0ZSIsInNpZCI6ImU1NjQxODFlLTJiNzMtNGU3MS04MmE1LWE5ODVlNGI5Zjk4NCJ9.SqcxaNldyyCeKs7oyvd1Z-Ot2cyGazCxLsVl0vyERbQ",
  "access_expires_at": "2026-10-28T08:38:13.711583094Z",
  "refresh_token": "BhDBmw-IJoLAQ6_5DAxPupnZxKI2zN2PlYu_6yXS_oE",
  "refresh_expires_at": "2026-11-27T08:23:13.710964549Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7270cc00-dc11-4483-bebb-9244b55395f6",
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
  "id": "13460d23-ba04-4c0c-87e5-b78da2ca98c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:13.748740Z",
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
  "command_id": "6e2631b7-dc46-4026-a62a-d1d6aa686cef",
  "quote_id": "13460d23-ba04-4c0c-87e5-b78da2ca98c0",
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
  "id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "da886b17-b008-4a89-868f-4feea8db789d",
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
  "created_at": "2026-10-28T08:23:13.792871Z",
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
    "id": "8bd77d3e-9764-4bac-8abd-9ab0c4ca3bdb",
    "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
    "expires_at": "2026-10-28T08:23:28.79654Z",
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

`POST /api/driver/v1/offers/8bd77d3e-9764-4bac-8abd-9ab0c4ca3bdb/reject` → **204**

```json
{
  "command_id": "e4f408df-9c82-487f-97cc-f26ddcd3ec7d"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5e5c3268-32d5-4af5-88c5-a33cf487b046",
    "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
    "expires_at": "2026-10-28T08:23:28.869722Z",
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

`POST /api/driver/v1/offers/5e5c3268-32d5-4af5-88c5-a33cf487b046/accept` → **200**

```json
{
  "command_id": "89fe7707-2380-495b-9e61-29ce593bc21e"
}
```

```json
{
  "id": "12388e61-85c0-4458-8c42-4ee41ee1842e",
  "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ef1a3dd8-1a47-4d0d-9e5c-66181a0a89ab",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/989d6eb7-66ca-4052-94ef-cb5d25a4ba6a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:23:13.793447Z",
      "actor": {
        "type": "CLIENT",
        "id": "da886b17-b008-4a89-868f-4feea8db789d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
        "quote_id": "13460d23-ba04-4c0c-87e5-b78da2ca98c0",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:23:13.795488Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
        "attempt_id": "61dcb9f6-1b76-43f4-9963-982be2e4fe71",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:23:13.803032Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8bd77d3e-9764-4bac-8abd-9ab0c4ca3bdb",
        "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      }
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T08:23:13.868351Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8bd77d3e-9764-4bac-8abd-9ab0c4ca3bdb",
        "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a"
      }
    },
    {
      "sequence": 4,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:23:13.879007Z",
      "actor": {
        "type": "SYSTEM",
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 989d6eb7-66ca-4052-94ef-cb5d25a4ba6a — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/989d6eb7-66ca-4052-94ef-cb5d25a4ba6a` → **200**

```json
{
  "id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
  "short_number": 5,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "da886b17-b008-4a89-868f-4feea8db789d",
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
    "id": "12388e61-85c0-4458-8c42-4ee41ee1842e",
    "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ef1a3dd8-1a47-4d0d-9e5c-66181a0a89ab",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T08:23:13.792871Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/989d6eb7-66ca-4052-94ef-cb5d25a4ba6a/cancel` → **200**

```json
{
  "command_id": "f17e28c0-512b-4797-a657-63f9be716de2",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "da886b17-b008-4a89-868f-4feea8db789d",
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
    "id": "12388e61-85c0-4458-8c42-4ee41ee1842e",
    "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ef1a3dd8-1a47-4d0d-9e5c-66181a0a89ab",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:23:13.792871Z",
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
  "session_id": "a103547e-b427-4fc5-a7b1-8c95fdfb60be",
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
  "last_heartbeat_at": "2026-10-28T08:23:12.795939Z",
  "last_location_at": "2026-10-28T08:23:12.795939Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a103547e-b427-4fc5-a7b1-8c95fdfb60be/close` → **200**

```json
{
  "command_id": "15bae9d2-1cf3-4e69-b6c9-7311c29b0890",
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
  "session_id": "a0b3846b-abf4-4ba3-b11c-5758d3731724",
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
  "last_heartbeat_at": "2026-10-28T08:23:12.989163Z",
  "last_location_at": "2026-10-28T08:23:12.989163Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a0b3846b-abf4-4ba3-b11c-5758d3731724/close` → **200**

```json
{
  "command_id": "7100d649-61f8-4bdb-a2cd-28804468c6a9",
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
  "device_ref": "sandbox-22441"
}
```

```json
{
  "challenge_id": "03c7b381-de16-4c7e-b8a4-7d54223615d6",
  "expires_at": "2026-10-28T08:28:14.300315922Z",
  "resend_available_at": "2026-10-28T08:23:15.300315922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "193412",
  "sent_at": "2026-10-28T08:23:14.303001362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03c7b381-de16-4c7e-b8a4-7d54223615d6",
  "code": "193412",
  "device_ref": "sandbox-22441"
}
```

```json
{
  "session_id": "00220665-9feb-4ba2-8cfd-f8e74b82d4eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjY5NCwiaWF0IjoxNzkzMTc1Nzk0LCJqdGkiOiIwNjNlNjYxNy04OWFmLTQzNjctYTVkZS02YTViODA4MDhiNjEiLCJzaWQiOiIwMDIyMDY2NS05ZmViLTRiYTItOGNmZC1mOGU3NGI4MmQ0ZWIifQ.id4bJ7OesxQTvM0bGsGpU-tP2KrkrBMwZw_UsKgBd18",
  "access_expires_at": "2026-10-28T08:38:14.359827952Z",
  "refresh_token": "pqJxEdmW5z6xjt8NYy4tfMTzes6bSAu8rns8rETigis",
  "refresh_expires_at": "2026-11-27T08:23:14.359189737Z",
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
  "command_id": "a43d74c5-575d-4a5b-9f8c-4ff840bfc9c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:14Z",
    "sequence": 1793175794410
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:14.428603Z",
  "last_location_at": "2026-10-28T08:23:14.428603Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673979388",
  "device_ref": "sandbox-19601"
}
```

```json
{
  "challenge_id": "cc317794-6842-4f8a-97b6-9c5b3e6b4366",
  "expires_at": "2026-10-28T08:28:14.460711072Z",
  "resend_available_at": "2026-10-28T08:23:15.460711072Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673979388` → **200**

```json
{
  "phone": "+380673979388",
  "audience": "CLIENT",
  "code": "726188",
  "sent_at": "2026-10-28T08:23:14.462900007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc317794-6842-4f8a-97b6-9c5b3e6b4366",
  "code": "726188",
  "device_ref": "sandbox-19601"
}
```

```json
{
  "session_id": "ac9fd83d-2219-4c14-96b2-56f021d512e0",
  "subject": {
    "type": "CLIENT",
    "id": "cca38aed-d231-482a-9692-b6c23e095b9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2EzOGFlZC1kMjMxLTQ4MmEtOTY5Mi1iNmMyM2UwOTViOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2Njk0LCJpYXQiOjE3OTMxNzU3OTQsImp0aSI6ImVjMTNkNGY1LWE1MWMtNDAwMy05NTYyLTY2YTY3Y2ZmMzA2ZCIsInNpZCI6ImFjOWZkODNkLTIyMTktNGMxNC05NmIyLTU2ZjAyMWQ1MTJlMCJ9.YZiGtteBarwP0ZBtg0v71XviEzzFxz__RD-eAOBHUfE",
  "access_expires_at": "2026-10-28T08:38:14.517296816Z",
  "refresh_token": "OT85T2AriZH0-C9pQZRp_fg0Vxmhoj8tPO3l6PFcaMw",
  "refresh_expires_at": "2026-11-27T08:23:14.516720951Z",
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
  "command_id": "569fe544-7071-4c0b-9a6e-f902dd384083",
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
  "id": "655e596f-d3f7-409d-a3be-71a2bcadf3df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:14.581325Z",
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
  "command_id": "96a8423c-b266-47fc-acf6-186655939c8d",
  "platform": "ANDROID",
  "token": "sandbox-driver-2be072ba-9222-4710-89d2-f0bd801c5aa9"
}
```

```json
{
  "id": "8e653d25-415a-4aa4-a12b-03087f49b1a3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:23:14.624713Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "f10babc3-a7db-481f-ae00-b415d9d0f539",
  "platform": "ANDROID",
  "token": "sandbox-rider-cac22208-d13d-4c79-b2d7-d97e904d477d"
}
```

```json
{
  "id": "3eefa9d2-d219-4ac6-af81-88cf65c872dc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:23:14.661019Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ebc850a3-00ed-4dd3-881f-9507e8731909",
  "quote_id": "655e596f-d3f7-409d-a3be-71a2bcadf3df",
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
  "id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cca38aed-d231-482a-9692-b6c23e095b9d",
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
  "created_at": "2026-10-28T08:23:14.705027Z",
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
    "id": "6e513018-8f4a-4085-a10b-986e237dde9c",
    "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
    "expires_at": "2026-10-28T08:23:29.708835Z",
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

`POST /api/driver/v1/offers/6e513018-8f4a-4085-a10b-986e237dde9c/accept` → **200**

```json
{
  "command_id": "285b7b01-ae8a-41e0-b29d-65faa08e7754"
}
```

```json
{
  "id": "1964213e-b2a1-4a82-9ca7-506cafb5905f",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:23:14.680Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:23:14.680Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:23:14.832491963Z",
    "token_suffix": "1c5aa9",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "989d6eb7-66ca-4052-94ef-cb5d25a4ba6a",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "2c38036c-0ef8-431e-96a0-f376b5560861",
      "order_version": "2"
    }
  },
  {
    "at": "2026-10-28T08:23:15.838632495Z",
    "token_suffix": "1c5aa9",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "d25b8833-7c22-405b-b501-7166062c6d19",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673979388&after=2026-10-28T08:23:14.680Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:23:15.840309828Z",
    "token_suffix": "4d477d",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "de024a43-49be-4c1c-9bb2-64ccfbefb982",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/235af1ae-6cae-44a5-9054-01395b9e839a/messages` → **201**

```json
{
  "command_id": "69e83f07-7935-49b0-bb8c-068698dec1b1",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "08fefc86-4522-49f9-9b64-25b4e19f7ad7",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T08:23:15.905140177Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "assignment_id": "1964213e-b2a1-4a82-9ca7-506cafb5905f",
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

`POST /api/driver/v1/trips/86047ed7-847c-44c2-ad53-ef87a4fcf228/messages` → **201**

```json
{
  "command_id": "efe35ef6-5355-472f-8871-c016e8cbad91",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "be1f8385-5341-490d-be8a-0c4cd0fb1956",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T08:23:15.958495554Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/235af1ae-6cae-44a5-9054-01395b9e839a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/86047ed7-847c-44c2-ad53-ef87a4fcf228/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673979388"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:16Z",
    "sequence": 1793175796360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:16.055184Z",
  "last_location_at": "2026-10-28T08:23:16.055184Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "assignment_id": "1964213e-b2a1-4a82-9ca7-506cafb5905f",
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

`POST /api/driver/v1/trips/86047ed7-847c-44c2-ad53-ef87a4fcf228/arrive` → **200**

```json
{
  "command_id": "8b205a35-6647-4aa7-8466-be2e63cd371a",
  "expected_version": 0
}
```

```json
{
  "id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "assignment_id": "1964213e-b2a1-4a82-9ca7-506cafb5905f",
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
  "arrived_at": "2026-10-28T08:23:16.107599Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/86047ed7-847c-44c2-ad53-ef87a4fcf228/start` → **200**

```json
{
  "command_id": "778d0ecf-e99c-405f-9c16-731b71d6af8c",
  "expected_version": 1
}
```

```json
{
  "id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "assignment_id": "1964213e-b2a1-4a82-9ca7-506cafb5905f",
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
  "arrived_at": "2026-10-28T08:23:16.107599Z",
  "started_at": "2026-10-28T08:23:16.142543Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:16Z",
    "sequence": 1793175796361
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:16.186007Z",
  "last_location_at": "2026-10-28T08:23:16.186007Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/86047ed7-847c-44c2-ad53-ef87a4fcf228/complete` → **200**

```json
{
  "command_id": "56901cdd-0557-4883-ae02-a9bed1be4988",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:23:16Z",
  "cash_received": true
}
```

```json
{
  "id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "assignment_id": "1964213e-b2a1-4a82-9ca7-506cafb5905f",
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
  "arrived_at": "2026-10-28T08:23:16.107599Z",
  "started_at": "2026-10-28T08:23:16.142543Z",
  "completed_at": "2026-10-28T08:23:16.222437Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/235af1ae-6cae-44a5-9054-01395b9e839a` → **200**

```json
{
  "id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cca38aed-d231-482a-9692-b6c23e095b9d",
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
    "id": "1964213e-b2a1-4a82-9ca7-506cafb5905f",
    "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:23:14.705027Z",
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
    "id": "235af1ae-6cae-44a5-9054-01395b9e839a",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:23:14.705027Z",
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
    "id": "86047ed7-847c-44c2-ad53-ef87a4fcf228",
    "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
    "order_short_number": 6,
    "created_at": "2026-10-28T08:23:14.776218Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "33e8513c-f001-429a-88c3-476aefdafba9",
    "order_id": "f793e799-7c2c-4967-af41-38f9d8ff6d0a",
    "order_short_number": 1,
    "created_at": "2026-10-28T08:22:35.540411Z",
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

`GET /api/rider/v1/orders/235af1ae-6cae-44a5-9054-01395b9e839a/tip` → **200**

```json
{
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
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
  "available_until": "2026-10-29T08:23:16.222437Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/235af1ae-6cae-44a5-9054-01395b9e839a/tip` → **201**

```json
{
  "command_id": "1d1fb436-dc9a-46c0-ad4c-0567ebd3d79d",
  "amount_minor": 1100
}
```

```json
{
  "id": "9bddad3c-c004-4d1e-b0b8-2eee0ff6a905",
  "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T08:23:19.454437Z"
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
  "session_id": "fc8d2794-d984-4fbd-8f66-3f5ff56e5950",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY2OTksImlhdCI6MTc5MzE3NTc5OSwianRpIjoiOGU5N2ZjYjgtZWQ1My00ZDFlLWI1YjAtMDYwZGEyZTNiNGY5Iiwic2lkIjoiZmM4ZDI3OTQtZDk4NC00ZmJkLThmNjYtM2Y1ZmY1NmU1OTUwIn0.8Ygi1L97w4BduMuyKmzNVQOkHwLRYT9E9dzge6m_HIc",
  "access_expires_at": "2026-10-28T08:38:19.782273484Z",
  "refresh_token": "suuzqdSuZjcyEYkudZaGNDWIVpC4ddbxiV1npq6e8Iw",
  "refresh_expires_at": "2026-10-28T20:23:19.781712877Z",
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
          "STAFF": 1,
          "DRIVER": 1,
          "RIDER": 1
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
      "STAFF": 1,
      "DRIVER": 1,
      "RIDER": 1
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
  "generated_at": "2026-10-28T08:23:19.814989081Z"
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
  "generated_at": "2026-10-28T08:23:19.846345954Z"
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
  "session_id": "0244c2c6-31fc-4fb8-a5db-46a67cd2e51a",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDAsImlhdCI6MTc5MzE3NTgwMCwianRpIjoiOTFkMDkyMjQtY2ZjMi00ODU3LTg2ZTctMTM4ZDAwMDczZjYyIiwic2lkIjoiMDI0NGMyYzYtMzFmYy00ZmI4LWE1ZGItNDZhNjdjZDJlNTFhIn0.0J7HhCJZmrZoe8hf__F2HLHuJxyZRKQmlH2D8mTsyrY",
  "access_expires_at": "2026-10-28T08:38:20.166781212Z",
  "refresh_token": "pLZO7fhLFznAXkJLzQ9HPIIySTTw8RmMif28LkVqDG8",
  "refresh_expires_at": "2026-10-28T20:23:20.166132991Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/235af1ae-6cae-44a5-9054-01395b9e839a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:23:14.705793Z",
      "actor": {
        "type": "CLIENT",
        "id": "cca38aed-d231-482a-9692-b6c23e095b9d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
        "quote_id": "655e596f-d3f7-409d-a3be-71a2bcadf3df",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:23:14.707901Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
        "attempt_id": "26d78872-cc09-4550-90f9-625712403561",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:23:14.714617Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6e513018-8f4a-4085-a10b-986e237dde9c",
        "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:23:14.778178Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6e513018-8f4a-4085-a10b-986e237dde9c",
        "order_id": "235af1ae-6cae-44a5-9054-01395b9e839a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "1964213e-b2a1-4a82-9ca7-506cafb5905f"
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
  "at": "2026-10-28T08:23:20.221865591Z",
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
      "last_location_at": "2026-10-28T08:23:16.186007Z",
      "order_id": null
    }
  ]
}
```

Done: order 235af1ae-6cae-44a5-9054-01395b9e839a.

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
  "session_id": "d15b0d3b-83ac-478b-a2ba-4b51088f7da4",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDAsImlhdCI6MTc5MzE3NTgwMCwianRpIjoiY2QwMzdiZDItYjA0ZC00ZTAzLWFlODMtYjM1NGZmZWUxODNhIiwic2lkIjoiZDE1YjBkM2ItODNhYy00NzhiLWEyYmEtNGI1MTA4OGY3ZGE0In0.nay1l62SKmbzQnhR_WB0dx1pIqNlF4R--kF9ElV6d8w",
  "access_expires_at": "2026-10-28T08:38:20.56229294Z",
  "refresh_token": "CxawYTCkJtdemvthqtusrTxaNT52-7Y825tZcc3oVSs",
  "refresh_expires_at": "2026-10-28T20:23:20.561742813Z",
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
  "command_id": "a0d1bdca-d55f-446b-ae51-1d7ef5937dc9",
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
  "timestamp": "2026-10-28T08:23:20.000+0000",
  "channel": {
    "id": "1730052000.694131205",
    "linkedid": "1730052000.694131205",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675904875"
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
  "timestamp": "2026-10-28T08:23:20.000+0000",
  "channel": {
    "id": "1730052000.694131205",
    "linkedid": "1730052000.694131205",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675904875"
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
  "session_id": "15020bbf-7f83-43a6-829c-e0b854e8cdc7",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDAsImlhdCI6MTc5MzE3NTgwMCwianRpIjoiY2Q5Yzg3NzQtYTQ2NC00NjdmLWE3OWMtODc3YzkyZDgwMjUzIiwic2lkIjoiMTUwMjBiYmYtN2Y4My00M2E2LTgyOWMtZTBiODU0ZThjZGM3In0.YpcCL11Ot_76CrmxD7ZnMS3AtkNuT7IXxoPzJN4-i84",
  "access_expires_at": "2026-10-28T08:38:20.992446027Z",
  "refresh_token": "tf5LnGJTPWd0T3cDX-J93mx-sUBvG0PKoXUh2M-tOfA",
  "refresh_expires_at": "2026-10-28T20:23:20.991876284Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a83b9ee2-8ea5-4bb9-a94a-9be53260de54",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675904875",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:23:20Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a83b9ee2-8ea5-4bb9-a94a-9be53260de54/answer` → **200**

```json
{
  "command_id": "060f96a8-02c7-4d9d-acc5-6a8091d9df12"
}
```

```json
{
  "id": "a83b9ee2-8ea5-4bb9-a94a-9be53260de54",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675904875",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "order_ids": [],
  "started_at": "2026-10-28T08:23:20Z",
  "answered_at": "2026-10-28T08:23:21.060666Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.694131205",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bab195cb-2eb4-435c-839f-b3115acb12ee",
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
  "id": "ef984276-c77e-4513-8cf5-307d49352d6f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:21.124323Z",
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
  "command_id": "9019dd9b-6aaa-4d8c-b2cf-09e09f9b9849",
  "quote_id": "ef984276-c77e-4513-8cf5-307d49352d6f",
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
    "phone": "+380675904875"
  },
  "call_id": "a83b9ee2-8ea5-4bb9-a94a-9be53260de54"
}
```

```json
{
  "id": "fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf",
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
  "created_at": "2026-10-28T08:23:21.180712Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675904875"
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
    "id": "1730052000.694131205",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a83b9ee2-8ea5-4bb9-a94a-9be53260de54",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675904875",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [
        "fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf"
      ],
      "started_at": "2026-10-28T08:23:20Z",
      "answered_at": "2026-10-28T08:23:21.060666Z",
      "ended_at": "2026-10-28T08:23:21.229185Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "be40f13a-9d4b-4a78-9763-22dedd8f2fd3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675755388",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [],
      "started_at": "2026-10-28T08:22:39.848376Z",
      "answered_at": "2026-10-28T08:22:39.921879Z",
      "ended_at": "2026-10-28T08:22:39.976322Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:22:41.689168Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf` → **200**

```json
{
  "id": "fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf",
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
  "created_at": "2026-10-28T08:23:21.180712Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675904875"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf` → **200**

```json
{
  "id": "fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf",
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
  "created_at": "2026-10-28T08:23:21.180712Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675904875"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf/cancel` → **200**

```json
{
  "command_id": "643ce786-ac67-400b-9efa-2cb4c8cab58f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf",
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
  "created_at": "2026-10-28T08:23:21.180712Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675904875"
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

Done: call a83b9ee2-8ea5-4bb9-a94a-9be53260de54 with order fb3f1f21-d8a7-4db1-b11c-b59dd6ff3cdf.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24899"
}
```

```json
{
  "challenge_id": "4bceb46d-2128-428b-8ccc-9aae07186514",
  "expires_at": "2026-10-28T08:28:21.387231536Z",
  "resend_available_at": "2026-10-28T08:23:22.387231536Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "986037",
  "sent_at": "2026-10-28T08:23:21.389434467Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bceb46d-2128-428b-8ccc-9aae07186514",
  "code": "986037",
  "device_ref": "sandbox-24899"
}
```

```json
{
  "session_id": "ba3a61bd-9cdc-4aad-bd1e-61c7883191f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjcwMSwiaWF0IjoxNzkzMTc1ODAxLCJqdGkiOiJhMzQ2YTgzMC1mYWVkLTQ0ODctYTgyYS0wNGM3YjRjOWRmNDUiLCJzaWQiOiJiYTNhNjFiZC05Y2RjLTRhYWQtYmQxZS02MWM3ODgzMTkxZjUifQ.pZi0AbhyrJjnYpy0iL6QJWkJlqma97nCzOKSg6jkDfw",
  "access_expires_at": "2026-10-28T08:38:21.444670069Z",
  "refresh_token": "DPPMfF1Ls9ZRmjW9do2j-fZNsQqCymqjvcD4jlJtQig",
  "refresh_expires_at": "2026-11-27T08:23:21.444069655Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:16.186007Z",
  "last_location_at": "2026-10-28T08:23:16.186007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/handover` → **200**

```json
{
  "command_id": "b395d925-2172-4a37-b3d0-e67f4866db27",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:16.186007Z",
  "last_location_at": "2026-10-28T08:23:16.186007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:21Z",
    "sequence": 1793175801530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:21.54922Z",
  "last_location_at": "2026-10-28T08:23:21.54922Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669186504",
  "device_ref": "sandbox-17698"
}
```

```json
{
  "challenge_id": "0e0ddcb6-6629-45a7-b6c3-9517ed12473a",
  "expires_at": "2026-10-28T08:28:21.574382123Z",
  "resend_available_at": "2026-10-28T08:23:22.574382123Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669186504` → **200**

```json
{
  "phone": "+380669186504",
  "audience": "CLIENT",
  "code": "324511",
  "sent_at": "2026-10-28T08:23:21.576522576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e0ddcb6-6629-45a7-b6c3-9517ed12473a",
  "code": "324511",
  "device_ref": "sandbox-17698"
}
```

```json
{
  "session_id": "3577047e-e3d1-4de9-91c4-ab4a29e21183",
  "subject": {
    "type": "CLIENT",
    "id": "72be3e1d-a29a-4cca-9646-0995b0a08ad6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmJlM2UxZC1hMjlhLTRjY2EtOTY0Ni0wOTk1YjBhMDhhZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzAxLCJpYXQiOjE3OTMxNzU4MDEsImp0aSI6IjM2YjA0ZmM5LWNmYzQtNGMyMS04NTE4LTRhYzY0ZDMwYmNiNSIsInNpZCI6IjM1NzcwNDdlLWUzZDEtNGRlOS05MWM0LWFiNGEyOWUyMTE4MyJ9.YLoaVK8YNe7MwHKR8BP_ytc_2od4lqNauDlTrZvnZ8A",
  "access_expires_at": "2026-10-28T08:38:21.632354326Z",
  "refresh_token": "dMMXzBPIQX_qDfwoB8BXFI68IiebCxe7mvlCoatZBf8",
  "refresh_expires_at": "2026-11-27T08:23:21.631791156Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9d5748b4-dd65-469e-b82c-d5ad22958588",
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
  "id": "8b081e6f-227a-4e7e-9354-992350f2fc18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T08:28:21.667794Z",
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
  "command_id": "00052273-c3d6-4d1c-882f-ead0064f7d9f",
  "quote_id": "8b081e6f-227a-4e7e-9354-992350f2fc18",
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
  "id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72be3e1d-a29a-4cca-9646-0995b0a08ad6",
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
  "created_at": "2026-10-28T08:23:21.706987Z",
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
    "id": "4eb64f77-b80e-4274-a5f1-df7a0297208c",
    "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
    "expires_at": "2026-10-28T08:23:36.710786Z",
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

`POST /api/driver/v1/offers/4eb64f77-b80e-4274-a5f1-df7a0297208c/accept` → **200**

```json
{
  "command_id": "a1e736a0-644a-40a3-9de1-bdf662391855"
}
```

```json
{
  "id": "9491f453-0cc3-43ef-912d-be9b2e52f712",
  "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "170d66ac-c486-4db8-80eb-708764d660e8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "170d66ac-c486-4db8-80eb-708764d660e8",
  "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
  "assignment_id": "9491f453-0cc3-43ef-912d-be9b2e52f712",
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

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:21Z",
    "sequence": 1793175801813
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:21.83325Z",
  "last_location_at": "2026-10-28T08:23:21.83325Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/170d66ac-c486-4db8-80eb-708764d660e8/arrive` → **200**

```json
{
  "command_id": "b7b3c486-0e30-45a5-bf18-e1b2514a46af",
  "expected_version": 0
}
```

```json
{
  "id": "170d66ac-c486-4db8-80eb-708764d660e8",
  "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
  "assignment_id": "9491f453-0cc3-43ef-912d-be9b2e52f712",
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
  "arrived_at": "2026-10-28T08:23:21.872583Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/170d66ac-c486-4db8-80eb-708764d660e8/start` → **200**

```json
{
  "command_id": "d02d351b-35e0-417f-b8cf-d87679909a12",
  "expected_version": 1
}
```

```json
{
  "id": "170d66ac-c486-4db8-80eb-708764d660e8",
  "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
  "assignment_id": "9491f453-0cc3-43ef-912d-be9b2e52f712",
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
  "arrived_at": "2026-10-28T08:23:21.872583Z",
  "started_at": "2026-10-28T08:23:21.910533Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:21Z",
    "sequence": 1793175801937
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:21.955763Z",
  "last_location_at": "2026-10-28T08:23:21.955763Z",
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
  "device_ref": "sandbox-12860"
}
```

```json
{
  "challenge_id": "8e0197be-e914-462a-841f-5ed51fcd072b",
  "expires_at": "2026-10-28T08:28:21.981687298Z",
  "resend_available_at": "2026-10-28T08:23:22.981687298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "067861",
  "sent_at": "2026-10-28T08:23:21.984100686Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e0197be-e914-462a-841f-5ed51fcd072b",
  "code": "067861",
  "device_ref": "sandbox-12860"
}
```

```json
{
  "session_id": "cb6fdc53-2449-4b18-bd87-387e86b8ba8e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjcwMiwiaWF0IjoxNzkzMTc1ODAyLCJqdGkiOiJlODY3MTQwNi04MDY0LTRiYzEtYWRjZC1lZGJmYmU0MWNkYzciLCJzaWQiOiJjYjZmZGM1My0yNDQ5LTRiMTgtYmQ4Ny0zODdlODZiOGJhOGUifQ.2UB9QfVPpv8yua4KLnCEQCojmKromOrad7y46mULY2k",
  "access_expires_at": "2026-10-28T08:38:22.040510638Z",
  "refresh_token": "4vY6K3N0sUQfNorzsKO3pDrR3J8AkRiGXq1aZH_wkB0",
  "refresh_expires_at": "2026-11-27T08:23:22.039764981Z",
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
  "command_id": "6d9d3991-c288-4027-a312-4e91bb3299b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:22Z",
    "sequence": 1793175802999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5e744b95-cc27-43ad-ae59-ddbb97739e29",
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
  "last_heartbeat_at": "2026-10-28T08:23:22.118908Z",
  "last_location_at": "2026-10-28T08:23:22.118908Z",
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
  "session_id": "657b5097-698c-49a4-a732-4c60b9f6c604",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDIsImlhdCI6MTc5MzE3NTgwMiwianRpIjoiNDAzM2Q2ZDUtZGQ2OS00ZTU4LTgyMWUtZjM1N2M3N2FjMDZmIiwic2lkIjoiNjU3YjUwOTctNjk4Yy00OWE0LWE3MzItNGM2MGI5ZjZjNjA0In0.AoL4XCPw1262DcTXGUXzR6ACZVvN51N3M_VZ_RPHQrI",
  "access_expires_at": "2026-10-28T08:38:22.445616521Z",
  "refresh_token": "L8tyH7xqFAONdTWAUD2AYhzmrKAPf_DfRXA3Z0HNfvg",
  "refresh_expires_at": "2026-10-28T20:23:22.445104777Z",
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
  "session_id": "059c1f9e-c577-48df-8387-8c1d94fb777d",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDIsImlhdCI6MTc5MzE3NTgwMiwianRpIjoiM2E1NmZkN2EtYTliMS00YmY3LTk2YzItNmQ1NWM0ZjQyZWVmIiwic2lkIjoiMDU5YzFmOWUtYzU3Ny00OGRmLTgzODctOGMxZDk0ZmI3NzdkIn0.iw1apvzfLTKWkuV3-INjCG2G1_LqEFwJPlzB9--EV68",
  "access_expires_at": "2026-10-28T08:38:22.763096553Z",
  "refresh_token": "NazJb1rmfjdILjUYepuysfTD-j0ZDe7x3VNY-TUvc50",
  "refresh_expires_at": "2026-10-28T20:23:22.762407967Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d89a7d1f-38e6-4c4c-a906-5e6c31cd8542` → **200**

```json
{
  "id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "72be3e1d-a29a-4cca-9646-0995b0a08ad6",
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
    "id": "9491f453-0cc3-43ef-912d-be9b2e52f712",
    "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "170d66ac-c486-4db8-80eb-708764d660e8",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T08:23:21.706987Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d89a7d1f-38e6-4c4c-a906-5e6c31cd8542/interrupt` → **200**

```json
{
  "command_id": "c9b8f198-db46-4de7-9e3b-0130eac3c10d",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "72be3e1d-a29a-4cca-9646-0995b0a08ad6",
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
      "id": "9491f453-0cc3-43ef-912d-be9b2e52f712",
      "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "170d66ac-c486-4db8-80eb-708764d660e8",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T08:23:21.706987Z",
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
    "id": "b8522d77-eba2-4da4-a651-69d6a0904406",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "72be3e1d-a29a-4cca-9646-0995b0a08ad6",
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
    "id": "d06b2d2e-b0bd-4a69-847f-ca15565d0618",
    "order_id": "b8522d77-eba2-4da4-a651-69d6a0904406",
    "expires_at": "2026-10-28T08:23:37.843698Z",
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

`POST /api/driver/v1/offers/d06b2d2e-b0bd-4a69-847f-ca15565d0618/accept` → **200**

```json
{
  "command_id": "b46e4fcb-f7c4-49ec-ac38-b00b9fbfbbcd"
}
```

```json
{
  "id": "4b1d4b7d-b807-4604-b638-3364e7899d73",
  "order_id": "b8522d77-eba2-4da4-a651-69d6a0904406",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "511be21b-6c0c-415e-beeb-e3b2084dd055",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "511be21b-6c0c-415e-beeb-e3b2084dd055",
  "order_id": "b8522d77-eba2-4da4-a651-69d6a0904406",
  "assignment_id": "4b1d4b7d-b807-4604-b638-3364e7899d73",
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
  "session_id": "5e744b95-cc27-43ad-ae59-ddbb97739e29",
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
  "last_heartbeat_at": "2026-10-28T08:23:22.118908Z",
  "last_location_at": "2026-10-28T08:23:22.118908Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/5e744b95-cc27-43ad-ae59-ddbb97739e29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:22Z",
    "sequence": 1793175803000
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5e744b95-cc27-43ad-ae59-ddbb97739e29",
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
  "last_heartbeat_at": "2026-10-28T08:23:22.99654Z",
  "last_location_at": "2026-10-28T08:23:22.99654Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/511be21b-6c0c-415e-beeb-e3b2084dd055/arrive` → **200**

```json
{
  "command_id": "9281ec35-0365-4890-b035-05bbe0e1b6c6",
  "expected_version": 0
}
```

```json
{
  "id": "511be21b-6c0c-415e-beeb-e3b2084dd055",
  "order_id": "b8522d77-eba2-4da4-a651-69d6a0904406",
  "assignment_id": "4b1d4b7d-b807-4604-b638-3364e7899d73",
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
  "arrived_at": "2026-10-28T08:23:23.031778Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/511be21b-6c0c-415e-beeb-e3b2084dd055/start` → **200**

```json
{
  "command_id": "dd17e4b7-4d5b-4bee-981c-63cd21cffc77",
  "expected_version": 1
}
```

```json
{
  "id": "511be21b-6c0c-415e-beeb-e3b2084dd055",
  "order_id": "b8522d77-eba2-4da4-a651-69d6a0904406",
  "assignment_id": "4b1d4b7d-b807-4604-b638-3364e7899d73",
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
  "arrived_at": "2026-10-28T08:23:23.031778Z",
  "started_at": "2026-10-28T08:23:23.070558Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/511be21b-6c0c-415e-beeb-e3b2084dd055/complete` → **200**

```json
{
  "command_id": "7649eeea-0e67-4f05-9a69-8f2e766a901b",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:23:23Z"
}
```

```json
{
  "id": "511be21b-6c0c-415e-beeb-e3b2084dd055",
  "order_id": "b8522d77-eba2-4da4-a651-69d6a0904406",
  "assignment_id": "4b1d4b7d-b807-4604-b638-3364e7899d73",
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
  "arrived_at": "2026-10-28T08:23:23.031778Z",
  "started_at": "2026-10-28T08:23:23.070558Z",
  "completed_at": "2026-10-28T08:23:23.113869Z",
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
    "id": "b8522d77-eba2-4da4-a651-69d6a0904406",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:23:22.834176Z",
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
    "id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:23:21.706987Z",
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

`GET /api/operator/v1/orders/d89a7d1f-38e6-4c4c-a906-5e6c31cd8542/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:23:21.707865Z",
      "actor": {
        "type": "CLIENT",
        "id": "72be3e1d-a29a-4cca-9646-0995b0a08ad6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
        "quote_id": "8b081e6f-227a-4e7e-9354-992350f2fc18",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:23:21.709921Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
        "attempt_id": "44ec363a-37d0-41ff-b04c-407c5d6f451f",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:23:21.714266Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4eb64f77-b80e-4274-a5f1-df7a0297208c",
        "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:23:21.772001Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4eb64f77-b80e-4274-a5f1-df7a0297208c",
        "order_id": "d89a7d1f-38e6-4c4c-a906-5e6c31cd8542",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9491f453-0cc3-43ef-912d-be9b2e52f712"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted d89a7d1f-38e6-4c4c-a906-5e6c31cd8542, follow-up b8522d77-eba2-4da4-a651-69d6a0904406.

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
  "session_id": "bb99d888-f0d9-4642-95c7-b6e61ff9af5f",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDYsImlhdCI6MTc5MzE3NTgwNiwianRpIjoiZDNjYjFlMjMtMGNiZi00MTVlLTk1NTItNjJmMDMxNzRlMzE1Iiwic2lkIjoiYmI5OWQ4ODgtZjBkOS00NjQyLTk1YzctYjZlNjFmZjlhZjVmIn0.-Vv_ZlBDl_yxL37WLZHQO7PXCIYIoZ2bsLwl5ZaGkNM",
  "access_expires_at": "2026-10-28T08:38:26.528708272Z",
  "refresh_token": "xTy-0hY-ijZFYpW4SkEf0KJO-E4Yl5zOEBX3391VN4E",
  "refresh_expires_at": "2026-10-28T20:23:26.528065341Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "95fcbe0f-d2a9-48ec-80b5-2b866aa544d5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:23:26Z"
}
```

```json
{
  "id": "1cc6d6ff-c8c6-497b-8ec2-9a805278a910",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:23:26Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1cc6d6ff-c8c6-497b-8ec2-9a805278a910/publish` → **200**

```json
{
  "command_id": "890c66b0-aa9b-41f6-9456-606cbf86d3ca",
  "expected_version": 0
}
```

```json
{
  "id": "1cc6d6ff-c8c6-497b-8ec2-9a805278a910",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:23:26.618888Z",
  "published_at": "2026-10-28T08:23:26.618888Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "1cc6d6ff-c8c6-497b-8ec2-9a805278a910",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T08:23:26.618888Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632771604",
  "device_ref": "sandbox-27129"
}
```

```json
{
  "challenge_id": "b1904ae3-e86d-4e08-a638-59826eb8984c",
  "expires_at": "2026-10-28T08:28:26.682089665Z",
  "resend_available_at": "2026-10-28T08:23:27.682089665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632771604` → **200**

```json
{
  "phone": "+380632771604",
  "audience": "CLIENT",
  "code": "181594",
  "sent_at": "2026-10-28T08:23:26.684452788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1904ae3-e86d-4e08-a638-59826eb8984c",
  "code": "181594",
  "device_ref": "sandbox-27129"
}
```

```json
{
  "session_id": "a0922d94-e172-48f7-a635-f7de2bcee1b2",
  "subject": {
    "type": "CLIENT",
    "id": "7597a9ea-14fa-419e-a21f-4ec737c7d0f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NTk3YTllYS0xNGZhLTQxOWUtYTIxZi00ZWM3MzdjN2QwZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzA2LCJpYXQiOjE3OTMxNzU4MDYsImp0aSI6ImZiNDMxMTNhLTE4OGYtNGU1ZS05OWNmLTFiZWM0YmE0ZTQ3MyIsInNpZCI6ImEwOTIyZDk0LWUxNzItNDhmNy1hNjM1LWY3ZGUyYmNlZTFiMiJ9.yYP6GGooo_I53U94yLS-McwyoqfBPUnMlh_tQISDLRU",
  "access_expires_at": "2026-10-28T08:38:26.739708121Z",
  "refresh_token": "hZDsGhB2bzte-A6YZ6utkntgtfmP6XhJOwwnm6aA9Gc",
  "refresh_expires_at": "2026-11-27T08:23:26.739139793Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "1cc6d6ff-c8c6-497b-8ec2-9a805278a910",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T08:23:26.618888Z",
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
  "command_id": "c2c258b8-cb38-401b-b7bd-1379a48799c0",
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
  "id": "d9f46fdb-b95d-49ce-80c4-a22fd8f0abc1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:28:26.800616Z",
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
  "command_id": "a5ba878a-d6ec-4e87-96f1-e1633f8494b0",
  "quote_id": "d9f46fdb-b95d-49ce-80c4-a22fd8f0abc1",
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
  "correlation_id": "2d3d9891-0323-477f-956e-1f88781b9dd6"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f0dc26c2-e3d0-42d4-9894-6a4909db5fa5",
  "version_id": "1cc6d6ff-c8c6-497b-8ec2-9a805278a910",
  "language": "uk"
}
```

```json
{
  "version_id": "1cc6d6ff-c8c6-497b-8ec2-9a805278a910",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T08:23:26.871808Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7344df6e-8e5d-4c02-bee8-c3657031286a",
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
  "id": "deb88d0c-a517-4459-8e31-90b50700ddda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:28:26.911003Z",
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
  "command_id": "27629783-a76a-477e-9955-5776960a6b9d",
  "quote_id": "deb88d0c-a517-4459-8e31-90b50700ddda",
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
  "id": "2847f5bf-384d-41be-9c41-ebd4bfad0e63",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7597a9ea-14fa-419e-a21f-4ec737c7d0f7",
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
  "created_at": "2026-10-28T08:23:26.94878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/2847f5bf-384d-41be-9c41-ebd4bfad0e63` → **200**

```json
{
  "id": "2847f5bf-384d-41be-9c41-ebd4bfad0e63",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7597a9ea-14fa-419e-a21f-4ec737c7d0f7",
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
  "created_at": "2026-10-28T08:23:26.94878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2847f5bf-384d-41be-9c41-ebd4bfad0e63/cancel` → **200**

```json
{
  "command_id": "949849d2-b094-4c3e-a66f-22dc059f7eaa",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2847f5bf-384d-41be-9c41-ebd4bfad0e63",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7597a9ea-14fa-419e-a21f-4ec737c7d0f7",
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
  "created_at": "2026-10-28T08:23:26.94878Z",
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

`POST /api/admin/v1/legal-documents/1cc6d6ff-c8c6-497b-8ec2-9a805278a910` → **409**

```json
{
  "command_id": "46d6479e-6b4f-4474-a11b-8a89caf6e98f",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:23:27Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/1cc6d6ff-c8c6-497b-8ec2-9a805278a910",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "efc9fef9-7bf9-475e-85a4-7dec0c60bc3a"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "8f4db8d6-4895-4647-98d1-54c9a38bcde5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:23:27Z"
}
```

```json
{
  "id": "1feca949-0e20-4aa2-bdf9-1418591dd437",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:23:27Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1feca949-0e20-4aa2-bdf9-1418591dd437/publish` → **200**

```json
{
  "command_id": "1bc3301d-a6dc-428a-8f67-ecc3e0a564a2",
  "expected_version": 0
}
```

```json
{
  "id": "1feca949-0e20-4aa2-bdf9-1418591dd437",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:23:27.136563Z",
  "published_at": "2026-10-28T08:23:27.136563Z",
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
  "device_ref": "sandbox-32111"
}
```

```json
{
  "challenge_id": "90e881af-dea0-48f2-8439-819e8ee5b55c",
  "expires_at": "2026-10-28T08:28:27.180230837Z",
  "resend_available_at": "2026-10-28T08:23:28.180230837Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "694565",
  "sent_at": "2026-10-28T08:23:27.183711766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90e881af-dea0-48f2-8439-819e8ee5b55c",
  "code": "694565",
  "device_ref": "sandbox-32111"
}
```

```json
{
  "session_id": "37ae7b33-f64d-4e53-8187-e8a42301453e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjcwNywiaWF0IjoxNzkzMTc1ODA3LCJqdGkiOiIzMmZmM2E4OC1jNWQyLTQ2Y2MtOGE1YS0wNGU4YTIyYzdlODgiLCJzaWQiOiIzN2FlN2IzMy1mNjRkLTRlNTMtODE4Ny1lOGE0MjMwMTQ1M2UifQ.NZZzbwwnqt58O-O6Y087-htRHAnitHU4B6KTVFV9C00",
  "access_expires_at": "2026-10-28T08:38:27.238581102Z",
  "refresh_token": "h290u5d4EjW1Nb7-9UTmrI6WMVt9CkT89Kw91YcXhuE",
  "refresh_expires_at": "2026-11-27T08:23:27.237971048Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5e744b95-cc27-43ad-ae59-ddbb97739e29",
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
  "last_heartbeat_at": "2026-10-28T08:23:22.99654Z",
  "last_location_at": "2026-10-28T08:23:22.99654Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5e744b95-cc27-43ad-ae59-ddbb97739e29/handover` → **200**

```json
{
  "command_id": "f41d122b-9937-42da-a05a-a0230d012010",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5e744b95-cc27-43ad-ae59-ddbb97739e29",
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
  "last_heartbeat_at": "2026-10-28T08:23:22.99654Z",
  "last_location_at": "2026-10-28T08:23:22.99654Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5e744b95-cc27-43ad-ae59-ddbb97739e29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:27Z",
    "sequence": 1793175807327
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5e744b95-cc27-43ad-ae59-ddbb97739e29",
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
  "last_heartbeat_at": "2026-10-28T08:23:27.345442Z",
  "last_location_at": "2026-10-28T08:23:27.345442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671610280",
  "device_ref": "sandbox-25985"
}
```

```json
{
  "challenge_id": "1daad29c-9f43-4959-b314-3e0a11c8513e",
  "expires_at": "2026-10-28T08:28:27.372427516Z",
  "resend_available_at": "2026-10-28T08:23:28.372427516Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671610280` → **200**

```json
{
  "phone": "+380671610280",
  "audience": "CLIENT",
  "code": "540863",
  "sent_at": "2026-10-28T08:23:27.37461591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1daad29c-9f43-4959-b314-3e0a11c8513e",
  "code": "540863",
  "device_ref": "sandbox-25985"
}
```

```json
{
  "session_id": "ad7483a6-1cd6-4df9-9eda-28992b292326",
  "subject": {
    "type": "CLIENT",
    "id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDVjNWQ3NC02OTJhLTRiYzQtOGU3OC01YTBmYmIxN2M4NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzA3LCJpYXQiOjE3OTMxNzU4MDcsImp0aSI6IjFjMzEwOGRmLWE3NjQtNDM5Mi1hZTg5LTBjNzZiNzY2MTJmYyIsInNpZCI6ImFkNzQ4M2E2LTFjZDYtNGRmOS05ZWRhLTI4OTkyYjI5MjMyNiJ9.cCRHxnc9hbPvAmDzvXyHjxrbfZMjofL4DfL9jftvZc8",
  "access_expires_at": "2026-10-28T08:38:27.434509853Z",
  "refresh_token": "4D8an0lgFzkDgDntqfOc8uEQT3UiBY_UnEDPJxY_1HE",
  "refresh_expires_at": "2026-11-27T08:23:27.434002507Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2ccce9c-4952-4372-a271-e0de68b930ea",
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
  "id": "8e3573c7-33aa-4fc4-a70c-76e81958ca3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:27.468676Z",
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
  "command_id": "2d906310-6be8-4533-896b-6e58e8ca64cc",
  "quote_id": "8e3573c7-33aa-4fc4-a70c-76e81958ca3d",
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
    "phone": "+380679271601"
  }
}
```

```json
{
  "id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.507822Z",
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
    "id": "36ab6c5c-da72-434e-aded-9e7824574faf",
    "order_id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
    "expires_at": "2026-10-28T08:23:42.511213Z",
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

`POST /api/driver/v1/offers/36ab6c5c-da72-434e-aded-9e7824574faf/accept` → **200**

```json
{
  "command_id": "e3375a5d-bcb6-454d-af5b-b4f2baad0b3f"
}
```

```json
{
  "id": "63ed8806-093a-42ad-b706-ea2f0069b5e9",
  "order_id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e8f23f73-2959-4db9-b09a-608ad4950404",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e8f23f73-2959-4db9-b09a-608ad4950404",
  "order_id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
  "assignment_id": "63ed8806-093a-42ad-b706-ea2f0069b5e9",
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
    "phone": "+380679271601"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c228d8f-4e47-4824-a627-5d58294bd6d5",
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
  "id": "e6ab6940-e08c-4637-89cb-51f93aa1be52",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:27.647960Z",
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
  "command_id": "2419199e-df32-4cc4-8629-9aacb5e671d0",
  "quote_id": "e6ab6940-e08c-4637-89cb-51f93aa1be52",
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
  "id": "3bad5f51-64b9-45fa-acbd-2edf9c962f3e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.685098Z",
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
  "command_id": "2069ece6-8d17-49fe-ba1c-d767c11cc5f7",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T11:23:27Z"
}
```

```json
{
  "id": "176fd06f-f2d9-493b-a0d0-e2e056870c55",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:27.731046Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:23:27Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fbb97d91-7a9f-49da-ba38-3874afc8ccbc",
  "quote_id": "176fd06f-f2d9-493b-a0d0-e2e056870c55",
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
  "pickup_at": "2026-10-28T11:23:27Z"
}
```

```json
{
  "id": "a0a97e26-3069-4448-ab5f-b258444ca7a9",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.770944Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:23:27Z",
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
  "command_id": "e7758b8a-e360-4006-8963-d311b3fe0b83",
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
  "id": "7f5f2fb0-c268-46cc-bc05-c4e6186b66b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:27.814081Z",
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
  "command_id": "519854db-2cb3-4eb3-ba0d-c9275ba20bab",
  "quote_id": "7f5f2fb0-c268-46cc-bc05-c4e6186b66b9",
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
  "correlation_id": "853feff3-8710-4870-be3a-b7ff2e49287c"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "a0a97e26-3069-4448-ab5f-b258444ca7a9",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
      "created_at": "2026-10-28T08:23:27.770944Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T11:23:27Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "3bad5f51-64b9-45fa-acbd-2edf9c962f3e",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
      "created_at": "2026-10-28T08:23:27.685098Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "3bad5f51-64b9-45fa-acbd-2edf9c962f3e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.685098Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/ea98c68d-abfc-4660-b821-4772a9d86c41` → **200**

```json
{
  "id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
    "id": "63ed8806-093a-42ad-b706-ea2f0069b5e9",
    "order_id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e8f23f73-2959-4db9-b09a-608ad4950404",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T08:23:27.507822Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ea98c68d-abfc-4660-b821-4772a9d86c41/cancel` → **200**

```json
{
  "command_id": "79d4673b-338a-457f-b5f7-c97291a69a5b",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
    "id": "63ed8806-093a-42ad-b706-ea2f0069b5e9",
    "order_id": "ea98c68d-abfc-4660-b821-4772a9d86c41",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e8f23f73-2959-4db9-b09a-608ad4950404",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:23:27.507822Z",
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

`GET /api/rider/v1/orders/3bad5f51-64b9-45fa-acbd-2edf9c962f3e` → **200**

```json
{
  "id": "3bad5f51-64b9-45fa-acbd-2edf9c962f3e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.685098Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/3bad5f51-64b9-45fa-acbd-2edf9c962f3e/cancel` → **200**

```json
{
  "command_id": "7c0459ed-5042-4d68-93e8-d50d85d0962f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3bad5f51-64b9-45fa-acbd-2edf9c962f3e",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.685098Z",
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

`GET /api/rider/v1/orders/a0a97e26-3069-4448-ab5f-b258444ca7a9` → **200**

```json
{
  "id": "a0a97e26-3069-4448-ab5f-b258444ca7a9",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.770944Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:23:27Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/a0a97e26-3069-4448-ab5f-b258444ca7a9/cancel` → **200**

```json
{
  "command_id": "8fbf7a00-105f-4a09-ad07-c6fef3a8085b",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a0a97e26-3069-4448-ab5f-b258444ca7a9",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "cd5c5d74-692a-4bc4-8e78-5a0fbb17c877",
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
  "created_at": "2026-10-28T08:23:27.770944Z",
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
  "pickup_at": "2026-10-28T11:23:27Z",
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
  "session_id": "5e744b95-cc27-43ad-ae59-ddbb97739e29",
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
  "last_heartbeat_at": "2026-10-28T08:23:27.345442Z",
  "last_location_at": "2026-10-28T08:23:27.345442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5e744b95-cc27-43ad-ae59-ddbb97739e29/close` → **200**

```json
{
  "command_id": "ac7164b2-444f-4a86-a153-d9a0637ff710",
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

Done: orders ea98c68d-abfc-4660-b821-4772a9d86c41, 3bad5f51-64b9-45fa-acbd-2edf9c962f3e, a0a97e26-3069-4448-ab5f-b258444ca7a9.

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
  "session_id": "2d75ae59-d0ce-41ef-ae54-05ff339a1d41",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDgsImlhdCI6MTc5MzE3NTgwOCwianRpIjoiZGMwZGQyNzgtN2IxNS00MzcwLWFlNDEtZGMzMzg0YjViY2M5Iiwic2lkIjoiMmQ3NWFlNTktZDBjZS00MWVmLWFlNTQtMDVmZjMzOWExZDQxIn0.qZrrInmjWWa7aWAw6XaEXTQTijnEX0tU6DAf4qNpkxw",
  "access_expires_at": "2026-10-28T08:38:28.485704219Z",
  "refresh_token": "PC3cm0zl5jVtIRKIjvfhRE4EVFV7k991ziRTe2GtO8s",
  "refresh_expires_at": "2026-10-28T20:23:28.485065405Z",
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
  "session_id": "ec0c2aeb-8721-405b-b325-b54014c7697a",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MDgsImlhdCI6MTc5MzE3NTgwOCwianRpIjoiMTFjMWUzZjUtMGVlNy00YjlmLTkyNTAtY2YzMGIwNjY4YjQxIiwic2lkIjoiZWMwYzJhZWItODcyMS00MDViLWIzMjUtYjU0MDE0Yzc2OTdhIn0.6NHdo9LyN4cT1ol2NiMkYQJ6fURg2sUh4M8X0HxuObo",
  "access_expires_at": "2026-10-28T08:38:28.808448642Z",
  "refresh_token": "yP5-9Jqaz3c9-YGNUDcJAp_WK4Hrc9RSmNVUs0HL7bU",
  "refresh_expires_at": "2026-10-28T20:23:28.807944652Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20712"
}
```

```json
{
  "challenge_id": "7e7b7a76-7b10-4c57-83f4-e115d9212e1f",
  "expires_at": "2026-10-28T08:28:28.831874148Z",
  "resend_available_at": "2026-10-28T08:23:29.831874148Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "668504",
  "sent_at": "2026-10-28T08:23:28.834031285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e7b7a76-7b10-4c57-83f4-e115d9212e1f",
  "code": "668504",
  "device_ref": "sandbox-20712"
}
```

```json
{
  "session_id": "564fff07-d378-442f-95c9-ed4a949eca9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjcwOCwiaWF0IjoxNzkzMTc1ODA4LCJqdGkiOiIxMGMzZWVlNC1kMTdhLTQ1ZTMtYTcwYy04N2NjZWU2MWQ2ZjIiLCJzaWQiOiI1NjRmZmYwNy1kMzc4LTQ0MmYtOTVjOS1lZDRhOTQ5ZWNhOWUifQ.l5ZiOzTPEmdAhM36SMRV5JC1Skva0I-YrvMtKSR1s24",
  "access_expires_at": "2026-10-28T08:38:28.888961075Z",
  "refresh_token": "PNbsSOjil2BlHVwloaQqQ6cOy81nj0NSboL6v724fRc",
  "refresh_expires_at": "2026-11-27T08:23:28.888435555Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:21.955763Z",
  "last_location_at": "2026-10-28T08:23:21.955763Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/handover` → **200**

```json
{
  "command_id": "382b01ac-44b8-4583-8348-bafb79b94554",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:21.955763Z",
  "last_location_at": "2026-10-28T08:23:21.955763Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:28Z",
    "sequence": 1793175808972
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:28.990969Z",
  "last_location_at": "2026-10-28T08:23:28.990969Z",
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
  "command_id": "ef438d00-c8b6-4420-b17f-1b3724264366",
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
  "effective_at": "2026-10-28T08:23:29.061882Z",
  "changed_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T08:23:29.09184281Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "41985caa-2183-4bce-b1d9-69b96186bc2b",
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
  "id": "f1f77320-4f31-48ba-bdc9-73b7ea100e48",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:28:29.128834Z",
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
  "command_id": "8bc59372-2d71-4ed1-a735-1554381f566e",
  "quote_id": "f1f77320-4f31-48ba-bdc9-73b7ea100e48",
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
    "phone": "+3806711130796"
  }
}
```

```json
{
  "id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
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
  "created_at": "2026-10-28T08:23:29.165842Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130796"
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
    "id": "a73a205d-9d6d-4554-940e-c8b4e24f19c4",
    "order_id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
    "expires_at": "2026-10-28T08:23:44.169439Z",
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

`POST /api/driver/v1/offers/a73a205d-9d6d-4554-940e-c8b4e24f19c4/accept` → **200**

```json
{
  "command_id": "afd3df3b-3c9e-4d0b-936a-8e66e7b38381"
}
```

```json
{
  "id": "8a9857fb-19dd-4188-aed6-7aff2d3ca64c",
  "order_id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2",
  "order_id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
  "assignment_id": "8a9857fb-19dd-4188-aed6-7aff2d3ca64c",
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
    "phone": "+3806711130796"
  }
}
```

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:29Z",
    "sequence": 1793175809273
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:29.291998Z",
  "last_location_at": "2026-10-28T08:23:29.291998Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2/arrive` → **200**

```json
{
  "command_id": "14cd66dd-bdf3-48e8-be58-7c0a41a11800",
  "expected_version": 0
}
```

```json
{
  "id": "e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2",
  "order_id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
  "assignment_id": "8a9857fb-19dd-4188-aed6-7aff2d3ca64c",
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
  "arrived_at": "2026-10-28T08:23:29.327088Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130796"
  }
}
```

`POST /api/driver/v1/trips/e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2/start` → **200**

```json
{
  "command_id": "efecb952-918f-45f0-af9b-691c986e760e",
  "expected_version": 1
}
```

```json
{
  "id": "e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2",
  "order_id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
  "assignment_id": "8a9857fb-19dd-4188-aed6-7aff2d3ca64c",
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
  "arrived_at": "2026-10-28T08:23:29.327088Z",
  "started_at": "2026-10-28T08:23:29.365089Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130796"
  }
}
```

`POST /api/driver/v1/trips/e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2/complete` → **200**

```json
{
  "command_id": "5808f473-4e83-46d3-b783-246f43e86c9e",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:23:29Z",
  "cash_received": true
}
```

```json
{
  "id": "e7ef27d2-bcdc-4d64-a53c-ba0f7f5842b2",
  "order_id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
  "assignment_id": "8a9857fb-19dd-4188-aed6-7aff2d3ca64c",
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
  "arrived_at": "2026-10-28T08:23:29.327088Z",
  "started_at": "2026-10-28T08:23:29.365089Z",
  "completed_at": "2026-10-28T08:23:29.40626Z",
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
  "command_id": "befadd88-dbee-4a13-bff5-c575d9a4d499",
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
  "id": "d0c4965d-5675-46f2-94e3-d493ca000a89",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:28:29.451526Z",
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
  "command_id": "4b85af6f-cef7-4bc9-9a40-c7c0d0eccbe6",
  "quote_id": "d0c4965d-5675-46f2-94e3-d493ca000a89",
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
    "phone": "+380671116604"
  }
}
```

```json
{
  "id": "91495a96-96b6-4864-be7d-ff5cebed8700",
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
  "created_at": "2026-10-28T08:23:29.498881Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116604"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/91495a96-96b6-4864-be7d-ff5cebed8700` → **200**

```json
{
  "id": "91495a96-96b6-4864-be7d-ff5cebed8700",
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
  "created_at": "2026-10-28T08:23:29.498881Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116604"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/91495a96-96b6-4864-be7d-ff5cebed8700/cancel` → **200**

```json
{
  "command_id": "3f4409d4-57cc-407e-9bea-ec1bc313853a",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "91495a96-96b6-4864-be7d-ff5cebed8700",
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
  "created_at": "2026-10-28T08:23:29.498881Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116604"
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
  "staff_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T08:23:29.411441Z",
  "last_entries": [
    {
      "order_id": "91495a96-96b6-4864-be7d-ff5cebed8700",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T08:23:29.567379Z"
    },
    {
      "order_id": "227f056a-fd6e-4d45-be44-94d2f5f5ca9f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T08:23:29.411441Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "19b8ca30-3e54-4fa0-ac95-bd97f58e2632",
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
  "last_heartbeat_at": "2026-10-28T08:23:29.291998Z",
  "last_location_at": "2026-10-28T08:23:29.291998Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19b8ca30-3e54-4fa0-ac95-bd97f58e2632/close` → **200**

```json
{
  "command_id": "b90da88e-1533-471b-9f21-aff45fe04b69",
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

Done: operator bonus for fulfilled 227f056a-fd6e-4d45-be44-94d2f5f5ca9f and operator-fault cancellation 91495a96-96b6-4864-be7d-ff5cebed8700.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676894230",
  "device_ref": "sandbox-7800"
}
```

```json
{
  "challenge_id": "fef1112f-6324-4104-b87c-275370420dbc",
  "expires_at": "2026-10-28T08:28:31.719958381Z",
  "resend_available_at": "2026-10-28T08:23:32.719958381Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676894230` → **200**

```json
{
  "phone": "+380676894230",
  "audience": "CLIENT",
  "code": "746850",
  "sent_at": "2026-10-28T08:23:31.722118557Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676487970",
  "device_ref": "sandbox-18663",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1dc71a47-df01-4b61-8844-dd1df48be428",
  "expires_at": "2026-10-28T08:28:31.774106195Z",
  "resend_available_at": "2026-10-28T08:23:32.774106195Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676487970` → **200**

```json
{
  "phone": "+380676487970",
  "audience": "CLIENT",
  "code": "614790",
  "sent_at": "2026-10-28T08:23:31.776185513Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675660000",
  "device_ref": "sandbox-1628"
}
```

```json
{
  "challenge_id": "20d2bc16-c325-4179-bec6-3c9577278cdd",
  "expires_at": "2026-10-28T08:28:31.827712752Z",
  "resend_available_at": "2026-10-28T08:23:32.827712752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675660000` → **200**

```json
{
  "phone": "+380675660000",
  "audience": "CLIENT",
  "code": "225072",
  "sent_at": "2026-10-28T08:23:31.830453586Z",
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
  "session_id": "ff910d4d-6ea9-47ea-aeeb-fd6afdda8598",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MTIsImlhdCI6MTc5MzE3NTgxMiwianRpIjoiMWYwMDczZGItNjAwNS00ZDljLWI4OWEtNmMzMzNmMmU1N2RjIiwic2lkIjoiZmY5MTBkNGQtNmVhOS00N2VhLWFlZWItZmQ2YWZkZGE4NTk4In0.m8_1w0Xdw0ea9p5IzePBE6rZLrh_p1Ael7IHdtVP-V0",
  "access_expires_at": "2026-10-28T08:38:32.174519102Z",
  "refresh_token": "jp5395p2EqGVfuT-mOOBFy_88YQlw1aPuZkTBSR46zc",
  "refresh_expires_at": "2026-10-28T20:23:32.173961344Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675660000` → **200**

```json
{
  "deliveries": [
    {
      "id": "e25f930e-1257-4ea2-aeb3-344108ee96dc",
      "challenge_id": "20d2bc16-c325-4179-bec6-3c9577278cdd",
      "phone": "+380675660000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1a5d5236-f33c-4bd2-a333-9aaa697a6270",
      "error": null,
      "attempted_at": "2026-10-28T08:23:31.830714Z"
    },
    {
      "id": "da2680f7-7e17-472b-9d38-8742e0a78172",
      "challenge_id": "20d2bc16-c325-4179-bec6-3c9577278cdd",
      "phone": "+380675660000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T08:23:31.82998Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675660000` → **200**

```json
{
  "phone": "+380675660000",
  "audience": "CLIENT",
  "code": "225072",
  "sent_at": "2026-10-28T08:23:31.830453586Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676487970` → **200**

```json
{
  "deliveries": [
    {
      "id": "6bec2326-2a14-4e27-8294-0c83c3e83744",
      "challenge_id": "1dc71a47-df01-4b61-8844-dd1df48be428",
      "phone": "+380676487970",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1dd07921-7aba-4ef8-b395-3ac3635ab6d4",
      "error": null,
      "attempted_at": "2026-10-28T08:23:31.776405Z"
    }
  ]
}
```

Done: SMS to +380676894230, a call to +380676487970, SMS then a call to +380675660000.

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
  "session_id": "74570e8e-1d9a-4925-886e-83e88b09e634",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MTIsImlhdCI6MTc5MzE3NTgxMiwianRpIjoiOWJmNDYwMWItZGNlNy00ODNmLTkwMmItNTc3MmMzOTU2YzI0Iiwic2lkIjoiNzQ1NzBlOGUtMWQ5YS00OTI1LTg4NmUtODNlODhiMDllNjM0In0.0feXk6L3rE_65aIdvSGOr5oblNVycr5bZVaGfy1xqB0",
  "access_expires_at": "2026-10-28T08:38:32.607566093Z",
  "refresh_token": "0NEwlAx2aSXKmN76aWq8f8OaPYjqNnTTb6jMbCeqZRI",
  "refresh_expires_at": "2026-10-28T20:23:32.607042736Z",
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
  "session_id": "bd998701-47e8-4e84-927f-19b36beaace7",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MTIsImlhdCI6MTc5MzE3NTgxMiwianRpIjoiOWUyMzBkODUtZGY5ZC00YmQ4LTk2MGUtNDQwOWY5NzU1Njg1Iiwic2lkIjoiYmQ5OTg3MDEtNDdlOC00ZTg0LTkyN2YtMTliMzZiZWFhY2U3In0.gYdw4Z9bxjJpnXA6kg7D9Bzp9Cs6Yl6-HrPm44lrHTY",
  "access_expires_at": "2026-10-28T08:38:32.926890477Z",
  "refresh_token": "RJDHu3j5k_mES-901TKPhXa71dIYNowpaQwW5Ddy5R4",
  "refresh_expires_at": "2026-10-28T20:23:32.926328528Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
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

`POST /api/admin/v1/staff-extensions/201ac7f2-2e74-44d5-b67a-e9693f891f4a` → **200**

```json
{
  "command_id": "d7d63669-7b5a-4400-bed8-f9b159595d34",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "7a3d1e21-698b-4497-a5ea-92cb273502cf",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:23:33.059402Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:23:33.059402Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ccfb60b7-5ea2-4be9-aba2-762f2db374e1",
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
  "id": "89db2aa3-1869-4ef8-8ab4-9a00a77db85d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:33.124145Z",
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
  "command_id": "f0d38996-f9ff-4879-827a-a9163597565d",
  "quote_id": "89db2aa3-1869-4ef8-8ab4-9a00a77db85d",
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
    "phone": "+380675747673"
  }
}
```

```json
{
  "id": "ee04398d-1936-4502-a0e3-e34f723590f8",
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
  "created_at": "2026-10-28T08:23:33.159931Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675747673"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/ee04398d-1936-4502-a0e3-e34f723590f8/calls` → **201**

```json
{
  "command_id": "b95aeb16-6def-4c62-9d48-f9a297bbbadf",
  "to": "CALLER"
}
```

```json
{
  "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "order_ids": [
    "ee04398d-1936-4502-a0e3-e34f723590f8"
  ],
  "started_at": "2026-10-28T08:23:33.209384Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/ee04398d-1936-4502-a0e3-e34f723590f8/calls` → **201**

```json
{
  "command_id": "b95aeb16-6def-4c62-9d48-f9a297bbbadf",
  "to": "CALLER"
}
```

```json
{
  "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "order_ids": [
    "ee04398d-1936-4502-a0e3-e34f723590f8"
  ],
  "started_at": "2026-10-28T08:23:33.209384Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675747673",
    "at": "2026-10-28T08:23:33.211427823Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.32767",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "5aec212d-08fd-4329-aa22-9d0fe9242765"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=ee04398d-1936-4502-a0e3-e34f723590f8` → **200**

```json
{
  "calls": [
    {
      "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [
        "ee04398d-1936-4502-a0e3-e34f723590f8"
      ],
      "started_at": "2026-10-28T08:23:33.209384Z",
      "answered_at": "2026-10-28T08:23:33.346922Z",
      "ended_at": "2026-10-28T08:23:33.367349Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ee04398d-1936-4502-a0e3-e34f723590f8` → **200**

```json
{
  "calls": [
    {
      "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [
        "ee04398d-1936-4502-a0e3-e34f723590f8"
      ],
      "started_at": "2026-10-28T08:23:33.209384Z",
      "answered_at": "2026-10-28T08:23:33.346922Z",
      "ended_at": "2026-10-28T08:23:33.367349Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ee04398d-1936-4502-a0e3-e34f723590f8` → **200**

```json
{
  "calls": [
    {
      "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [
        "ee04398d-1936-4502-a0e3-e34f723590f8"
      ],
      "started_at": "2026-10-28T08:23:33.209384Z",
      "answered_at": "2026-10-28T08:23:33.346922Z",
      "ended_at": "2026-10-28T08:23:33.367349Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ee04398d-1936-4502-a0e3-e34f723590f8` → **200**

```json
{
  "calls": [
    {
      "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [
        "ee04398d-1936-4502-a0e3-e34f723590f8"
      ],
      "started_at": "2026-10-28T08:23:33.209384Z",
      "answered_at": "2026-10-28T08:23:33.346922Z",
      "ended_at": "2026-10-28T08:23:33.367349Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ee04398d-1936-4502-a0e3-e34f723590f8` → **200**

```json
{
  "calls": [
    {
      "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [
        "ee04398d-1936-4502-a0e3-e34f723590f8"
      ],
      "started_at": "2026-10-28T08:23:33.209384Z",
      "answered_at": "2026-10-28T08:23:33.346922Z",
      "ended_at": "2026-10-28T08:23:33.367349Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ee04398d-1936-4502-a0e3-e34f723590f8` → **200**

```json
{
  "calls": [
    {
      "id": "5aec212d-08fd-4329-aa22-9d0fe9242765",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "order_ids": [
        "ee04398d-1936-4502-a0e3-e34f723590f8"
      ],
      "started_at": "2026-10-28T08:23:33.209384Z",
      "answered_at": "2026-10-28T08:23:33.346922Z",
      "ended_at": "2026-10-28T08:23:33.367349Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:23:41.710122Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/ee04398d-1936-4502-a0e3-e34f723590f8` → **200**

```json
{
  "id": "ee04398d-1936-4502-a0e3-e34f723590f8",
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
  "created_at": "2026-10-28T08:23:33.159931Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675747673"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ee04398d-1936-4502-a0e3-e34f723590f8/cancel` → **200**

```json
{
  "command_id": "d1c45ef4-069f-440c-93fb-db1af7210775",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ee04398d-1936-4502-a0e3-e34f723590f8",
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
  "created_at": "2026-10-28T08:23:33.159931Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675747673"
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
  "command_id": "5fb10b1c-5561-428e-a9e2-58b7ea47520d",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T08:23:43.667597Z",
  "extension": "101"
}
```

Done: outgoing call 5aec212d-08fd-4329-aa22-9d0fe9242765 from order ee04398d-1936-4502-a0e3-e34f723590f8, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639815435",
  "device_ref": "sandbox-29022"
}
```

```json
{
  "challenge_id": "0bb20cfc-c9e0-4a62-8786-dfe7c128ae9e",
  "expires_at": "2026-10-28T08:28:43.709126888Z",
  "resend_available_at": "2026-10-28T08:23:44.709126888Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639815435` → **200**

```json
{
  "phone": "+380639815435",
  "audience": "CLIENT",
  "code": "064421",
  "sent_at": "2026-10-28T08:23:43.712736696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bb20cfc-c9e0-4a62-8786-dfe7c128ae9e",
  "code": "064421",
  "device_ref": "sandbox-29022"
}
```

```json
{
  "session_id": "a1ee1951-56e8-4da4-aa90-cd511121f1d1",
  "subject": {
    "type": "CLIENT",
    "id": "5a65e1d8-4b25-4217-b49d-3eb17d138d8f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTY1ZTFkOC00YjI1LTQyMTctYjQ5ZC0zZWIxN2QxMzhkOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzIzLCJpYXQiOjE3OTMxNzU4MjMsImp0aSI6IjU3MWM0NDE1LTM5ZmMtNDYwMy05YmE0LWYwNmQ2MTc2NzJmMiIsInNpZCI6ImExZWUxOTUxLTU2ZTgtNGRhNC1hYTkwLWNkNTExMTIxZjFkMSJ9.18ax3zSNM2jaPGywk6d_V3psYfwPsFHT7GcpjSJsa2I",
  "access_expires_at": "2026-10-28T08:38:43.769332328Z",
  "refresh_token": "YrXFDhZ29PZLIpyByx0wSFPMIrajqulH7oYosl0qrLk",
  "refresh_expires_at": "2026-11-27T08:23:43.768610841Z",
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
  "session_id": "b4c54667-6cb0-4360-9493-71e0b10e67a3",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MjQsImlhdCI6MTc5MzE3NTgyNCwianRpIjoiZTE0MjUxOWQtMjcwMC00Y2U4LWFhMGUtMDZiOTk1MTM0ZjUyIiwic2lkIjoiYjRjNTQ2NjctNmNiMC00MzYwLTk0OTMtNzFlMGIxMGU2N2EzIn0.ataVroQ5wVLjvgAe4sq-vay_GHpDYWFQ5jRTe7rgdVI",
  "access_expires_at": "2026-10-28T08:38:44.170812862Z",
  "refresh_token": "OqdOUhfql3ZZPnK-ifU5TYSIY7nhy03QWF-kv3dRixI",
  "refresh_expires_at": "2026-10-28T20:23:44.170201468Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639815435` → **200**

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
  "correlation_id": "d6e6123a-50e4-4c8d-8150-3d82bd5d0087"
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
  "session_id": "ab408bf7-ee4c-45e8-9679-f1cf856ae59e",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MjQsImlhdCI6MTc5MzE3NTgyNCwianRpIjoiM2ZlNmEyZTYtMjEyOC00YzYzLWFkNTYtMDEyZjJiYjFjOTQwIiwic2lkIjoiYWI0MDhiZjctZWU0Yy00NWU4LTk2NzktZjFjZjg1NmFlNTllIn0.4WTYs9vaMmkPQGGkqqkFm8lpg172aPxUsxKOTM_OOT0",
  "access_expires_at": "2026-10-28T08:38:44.556825638Z",
  "refresh_token": "slGxWoBoUfKk0biaUXDshhh9Hyhb-QeAmEqhbiz0e0k",
  "refresh_expires_at": "2026-10-28T20:23:44.556197449Z",
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
  "command_id": "4e3f2709-4f3e-4742-bb85-dab937d05fe0",
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
  "changed_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T08:23:44.631579549Z"
}
```

## The rider books the airport for 2026-10-28T11:23:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600493946",
  "device_ref": "sandbox-27359"
}
```

```json
{
  "challenge_id": "4abcafde-35ed-41c1-a788-9582bbb7bf15",
  "expires_at": "2026-10-28T08:28:44.662994926Z",
  "resend_available_at": "2026-10-28T08:23:45.662994926Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600493946` → **200**

```json
{
  "phone": "+48600493946",
  "audience": "CLIENT",
  "code": "817146",
  "sent_at": "2026-10-28T08:23:44.665086096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4abcafde-35ed-41c1-a788-9582bbb7bf15",
  "code": "817146",
  "device_ref": "sandbox-27359"
}
```

```json
{
  "session_id": "5cf8b03d-c8cd-4558-a0ca-42bfb7c923ea",
  "subject": {
    "type": "CLIENT",
    "id": "fb2b7ccc-9596-4e87-9032-8cadb799b355"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjJiN2NjYy05NTk2LTRlODctOTAzMi04Y2FkYjc5OWIzNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzI0LCJpYXQiOjE3OTMxNzU4MjQsImp0aSI6ImMxNjYzZmQ0LTMwYjgtNDI5OC1hMjVkLTY4YTQ4YjVjMDlkZSIsInNpZCI6IjVjZjhiMDNkLWM4Y2QtNDU1OC1hMGNhLTQyYmZiN2M5MjNlYSJ9.c4VarYu80qXg3tgAKNnwQSx-NvT7c54aYlbZnZcJaX4",
  "access_expires_at": "2026-10-28T08:38:44.719067144Z",
  "refresh_token": "zBiGkT3Ev7cclLBXr3LCq2zzJvr8S81irfKLMNpmc3k",
  "refresh_expires_at": "2026-11-27T08:23:44.718305006Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9fba799e-bf45-4ffd-8061-eb6b0178b229",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T11:23:44Z"
}
```

```json
{
  "id": "175c5bf4-011f-4c56-8fc9-73024531103b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T08:28:44.756117Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:23:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "641f2ff5-9554-4d7a-8019-5282f53fd4d4",
  "quote_id": "175c5bf4-011f-4c56-8fc9-73024531103b",
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
  "pickup_at": "2026-10-28T11:23:44Z"
}
```

```json
{
  "id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fb2b7ccc-9596-4e87-9032-8cadb799b355",
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
  "created_at": "2026-10-28T08:23:44.797464Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:23:44Z",
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
  "device_ref": "sandbox-11165"
}
```

```json
{
  "challenge_id": "4e1c631d-2dc9-44b0-82cb-8090505b81b6",
  "expires_at": "2026-10-28T08:28:44.830064695Z",
  "resend_available_at": "2026-10-28T08:23:45.830064695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "502889",
  "sent_at": "2026-10-28T08:23:44.832331544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e1c631d-2dc9-44b0-82cb-8090505b81b6",
  "code": "502889",
  "device_ref": "sandbox-11165"
}
```

```json
{
  "session_id": "3a0657b3-979d-43c4-8cb4-107b469efeac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjcyNCwiaWF0IjoxNzkzMTc1ODI0LCJqdGkiOiI2ZjcxYTQwYi0wZTBkLTQzNGEtODMyMC0xNGIyYWZiNTVjOGQiLCJzaWQiOiIzYTA2NTdiMy05NzlkLTQzYzQtOGNiNC0xMDdiNDY5ZWZlYWMifQ.VPpJTHXpZnz7c2NmFoceGY2UTU08-LWbqtYalLvCo_I",
  "access_expires_at": "2026-10-28T08:38:44.888147946Z",
  "refresh_token": "Xfho63jLGJZ6X-Bj7HLcPk6XZ_26zLVQR2MjjI6wT5M",
  "refresh_expires_at": "2026-11-27T08:23:44.887566971Z",
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
  "command_id": "c123d249-9d85-4fb4-95b3-275215219d07",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:44Z",
    "sequence": 1793175824939
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c6f526e4-faea-454f-95bc-45d312f25193",
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
  "last_heartbeat_at": "2026-10-28T08:23:44.9565Z",
  "last_location_at": "2026-10-28T08:23:44.9565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
      "short_number": 17,
      "pickup_at": "2026-10-28T11:23:44Z",
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

`POST /api/driver/v1/preorders/fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc/reserve` → **200**

```json
{
  "command_id": "032b258b-1f9c-4247-bf01-94dbefc0b5d7"
}
```

```json
{
  "id": "ba4b3e15-2207-4d0e-b12d-251a6f145e93",
  "state": "RESERVED",
  "order": {
    "order_id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
    "short_number": 17,
    "pickup_at": "2026-10-28T11:23:44Z",
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
  "reserved_at": "2026-10-28T08:23:45.025161Z",
  "confirm_from": "2026-10-28T10:53:44Z",
  "confirm_until": "2026-10-28T11:03:44Z",
  "drop_until": "2026-10-28T10:23:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ba4b3e15-2207-4d0e-b12d-251a6f145e93",
      "state": "RESERVED",
      "order": {
        "order_id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
        "short_number": 17,
        "pickup_at": "2026-10-28T11:23:44Z",
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
      "reserved_at": "2026-10-28T08:23:45.025161Z",
      "confirm_from": "2026-10-28T10:53:44Z",
      "confirm_until": "2026-10-28T11:03:44Z",
      "drop_until": "2026-10-28T10:23:44Z"
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
      "id": "ba4b3e15-2207-4d0e-b12d-251a6f145e93",
      "state": "RESERVED",
      "order": {
        "order_id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
        "short_number": 17,
        "pickup_at": "2026-10-28T11:23:44Z",
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
      "reserved_at": "2026-10-28T08:23:45.025161Z",
      "confirm_from": "2026-10-28T10:53:44Z",
      "confirm_until": "2026-10-28T11:03:44Z",
      "drop_until": "2026-10-28T10:23:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ba4b3e15-2207-4d0e-b12d-251a6f145e93/confirm` → **409**

```json
{
  "command_id": "2f6c9a26-2e73-4ec6-8e7b-d627f0de6328"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ba4b3e15-2207-4d0e-b12d-251a6f145e93/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5d840060-9634-433c-bb49-149ab16aafba"
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
  "session_id": "cb1efc09-131a-45f4-9493-950be5c95b2d",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MjUsImlhdCI6MTc5MzE3NTgyNSwianRpIjoiMTI1MGRjMDctODc5NC00MDY4LTg5ZGItNWE3OWFlNWQ3NWJjIiwic2lkIjoiY2IxZWZjMDktMTMxYS00NWY0LTk0OTMtOTUwYmU1Yzk1YjJkIn0.pQxGjAYgsS2KQzPgHFdXwVUbjZuw5tyh4BBlUFrumbE",
  "access_expires_at": "2026-10-28T08:38:45.43332743Z",
  "refresh_token": "UHB4ZnzxEoHLax36HnqlJ37KUG0M_8eujuN4_UR6H_s",
  "refresh_expires_at": "2026-10-28T20:23:45.432730105Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc` → **200**

```json
{
  "id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "fb2b7ccc-9596-4e87-9032-8cadb799b355",
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
  "created_at": "2026-10-28T08:23:44.797464Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T11:23:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ba4b3e15-2207-4d0e-b12d-251a6f145e93",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T08:23:45.025161Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T08:23:44.798722Z",
      "actor": {
        "type": "CLIENT",
        "id": "fb2b7ccc-9596-4e87-9032-8cadb799b355",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
        "preorder": true,
        "quote_id": "175c5bf4-011f-4c56-8fc9-73024531103b",
        "pickup_at": "2026-10-28T11:23:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T08:23:45.026323Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ba4b3e15-2207-4d0e-b12d-251a6f145e93"
      }
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order fe8d00dc-93c8-4799-bf8a-8ac9fbcf19cc, reservation ba4b3e15-2207-4d0e-b12d-251a6f145e93.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6540"
}
```

```json
{
  "challenge_id": "e74ddd11-a6bb-4e00-b348-a0616d5aed97",
  "expires_at": "2026-10-28T08:28:45.520401847Z",
  "resend_available_at": "2026-10-28T08:23:46.520401847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "055904",
  "sent_at": "2026-10-28T08:23:45.523325351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e74ddd11-a6bb-4e00-b348-a0616d5aed97",
  "code": "055904",
  "device_ref": "sandbox-6540"
}
```

```json
{
  "session_id": "bcdcf26f-26e9-48e8-b686-c3c83ffafcc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjcyNSwiaWF0IjoxNzkzMTc1ODI1LCJqdGkiOiJjMDk1ZDllNi02ZGUzLTQyOTQtYmQxYy04NjJjNDlkYTljYzUiLCJzaWQiOiJiY2RjZjI2Zi0yNmU5LTQ4ZTgtYjY4Ni1jM2M4M2ZmYWZjYzEifQ.IvjuDLNUT3YkvriW4uUWqudB195dy8TcjyoH0-6WB1A",
  "access_expires_at": "2026-10-28T08:38:45.581443943Z",
  "refresh_token": "AJq2BBT6UfSTYCcqRyOs7MIMF22xwCKYB8WRLbESnkg",
  "refresh_expires_at": "2026-11-27T08:23:45.580914786Z",
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
  "command_id": "03c3c45c-8508-4670-a340-02bc409f09cb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:45Z",
    "sequence": 1793175825630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b411a8d7-6592-4435-b39e-c38772911b42",
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
  "last_heartbeat_at": "2026-10-28T08:23:45.647315Z",
  "last_location_at": "2026-10-28T08:23:45.647315Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670898826",
  "device_ref": "sandbox-19306"
}
```

```json
{
  "challenge_id": "5f250270-a5ea-4748-983c-dfa3f20820f0",
  "expires_at": "2026-10-28T08:28:45.675590613Z",
  "resend_available_at": "2026-10-28T08:23:46.675590613Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670898826` → **200**

```json
{
  "phone": "+380670898826",
  "audience": "CLIENT",
  "code": "422498",
  "sent_at": "2026-10-28T08:23:45.677796668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f250270-a5ea-4748-983c-dfa3f20820f0",
  "code": "422498",
  "device_ref": "sandbox-19306"
}
```

```json
{
  "session_id": "7195942c-6cdc-40ec-af38-4fd86fb6780b",
  "subject": {
    "type": "CLIENT",
    "id": "f23f3af6-163f-4f2d-a904-ae94de36b9a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjNmM2FmNi0xNjNmLTRmMmQtYTkwNC1hZTk0ZGUzNmI5YTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzI1LCJpYXQiOjE3OTMxNzU4MjUsImp0aSI6ImYxMGIwZjhmLWIzNTMtNDc4ZC05OGFkLTc0NTk5ZDQ1MTg0YiIsInNpZCI6IjcxOTU5NDJjLTZjZGMtNDBlYy1hZjM4LTRmZDg2ZmI2NzgwYiJ9.Z_69mv7O-Vis9cNzniENjlrrYTXJKzhJHHk5LnnMUMA",
  "access_expires_at": "2026-10-28T08:38:45.731094901Z",
  "refresh_token": "3ev37CxPBm74dhTZGRAY1HIUMNjP2PszlznzFb46Syc",
  "refresh_expires_at": "2026-11-27T08:23:45.730540417Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "58b48f84-e450-49f6-956d-30b91c0e1439",
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
  "id": "88f8b1c5-3378-44ff-a9d5-4ebcbd74a503",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:28:45.768236Z",
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
  "command_id": "485e03ca-9bbb-4d53-8426-c24bed3ab976",
  "quote_id": "88f8b1c5-3378-44ff-a9d5-4ebcbd74a503",
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
  "id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f23f3af6-163f-4f2d-a904-ae94de36b9a8",
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
  "created_at": "2026-10-28T08:23:45.805029Z",
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
    "id": "7e4fa03f-2918-4a9d-bf2a-561e2ea9e72f",
    "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
    "expires_at": "2026-10-28T08:24:00.808297Z",
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

`POST /api/driver/v1/offers/7e4fa03f-2918-4a9d-bf2a-561e2ea9e72f/accept` → **200**

```json
{
  "command_id": "6fa3b916-b4a0-4376-b6f4-d305dde7e460"
}
```

```json
{
  "id": "78e30ced-1ef3-43a1-a255-093d618a50b0",
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "22871e6f-2bee-45d1-8151-50bfa9fd3514",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "22871e6f-2bee-45d1-8151-50bfa9fd3514",
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "assignment_id": "78e30ced-1ef3-43a1-a255-093d618a50b0",
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

`POST /api/driver/v1/work-sessions/b411a8d7-6592-4435-b39e-c38772911b42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:45Z",
    "sequence": 1793175825916
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b411a8d7-6592-4435-b39e-c38772911b42",
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
  "last_heartbeat_at": "2026-10-28T08:23:45.934004Z",
  "last_location_at": "2026-10-28T08:23:45.934004Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "22871e6f-2bee-45d1-8151-50bfa9fd3514",
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "assignment_id": "78e30ced-1ef3-43a1-a255-093d618a50b0",
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

`POST /api/driver/v1/trips/22871e6f-2bee-45d1-8151-50bfa9fd3514/arrive` → **200**

```json
{
  "command_id": "30a386f9-e399-4d47-bae3-dd67fce9d026",
  "expected_version": 0
}
```

```json
{
  "id": "22871e6f-2bee-45d1-8151-50bfa9fd3514",
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "assignment_id": "78e30ced-1ef3-43a1-a255-093d618a50b0",
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
  "arrived_at": "2026-10-28T08:23:45.983532Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/22871e6f-2bee-45d1-8151-50bfa9fd3514/start` → **200**

```json
{
  "command_id": "e63cb1b4-0496-45bb-bb7c-f2f0f8264f78",
  "expected_version": 1
}
```

```json
{
  "id": "22871e6f-2bee-45d1-8151-50bfa9fd3514",
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "assignment_id": "78e30ced-1ef3-43a1-a255-093d618a50b0",
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
  "arrived_at": "2026-10-28T08:23:45.983532Z",
  "started_at": "2026-10-28T08:23:46.017717Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b411a8d7-6592-4435-b39e-c38772911b42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:46Z",
    "sequence": 1793175826408
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b411a8d7-6592-4435-b39e-c38772911b42",
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
  "last_heartbeat_at": "2026-10-28T08:23:46.058365Z",
  "last_location_at": "2026-10-28T08:23:46.058365Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/22871e6f-2bee-45d1-8151-50bfa9fd3514/complete` → **200**

```json
{
  "command_id": "b7c048a1-5f23-4c6f-819d-769a9ec62fdc",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:23:46Z",
  "cash_received": true
}
```

```json
{
  "id": "22871e6f-2bee-45d1-8151-50bfa9fd3514",
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "assignment_id": "78e30ced-1ef3-43a1-a255-093d618a50b0",
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
  "arrived_at": "2026-10-28T08:23:45.983532Z",
  "started_at": "2026-10-28T08:23:46.017717Z",
  "completed_at": "2026-10-28T08:23:46.089547Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/a97e9087-ba76-43f1-868c-b5d89609c920/rating` → **200**

```json
{
  "command_id": "a55dfc53-7fe6-4a93-9c65-6f0d3e51079b",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "score": 5,
  "created_at": "2026-10-28T08:23:46.135633505Z"
}
```

`POST /api/driver/v1/orders/a97e9087-ba76-43f1-868c-b5d89609c920/rating` → **200**

```json
{
  "command_id": "ea521f9e-ca47-4fc9-bed6-44410ec21398",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
  "score": 4,
  "created_at": "2026-10-28T08:23:46.171304435Z"
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
  "session_id": "4d104d97-63aa-48ee-906f-6223ae941bf3",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MjYsImlhdCI6MTc5MzE3NTgyNiwianRpIjoiYzgyZmVmMTMtYWU3Ny00OWEzLTgwMmItNWEzMTIzNGYwOTg5Iiwic2lkIjoiNGQxMDRkOTctNjNhYS00OGVlLTkwNmYtNjIyM2FlOTQxYmYzIn0.HttEeQJQhSHkGMsmOv8IwWjbb492aa8Na-OqLZXbI6c",
  "access_expires_at": "2026-10-28T08:38:46.53251818Z",
  "refresh_token": "gQjpYniwXjwntcDKlk8sdLRxRMJk79emxSVNn7yQSAQ",
  "refresh_expires_at": "2026-10-28T20:23:46.532012116Z",
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
  "session_id": "80be1716-b160-47a4-8031-164cff7820a9",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MjYsImlhdCI6MTc5MzE3NTgyNiwianRpIjoiMWJmMzU1MjctNzkyYy00MmRjLWJiYWMtN2FjNzcyM2FiYzBmIiwic2lkIjoiODBiZTE3MTYtYjE2MC00N2E0LTgwMzEtMTY0Y2ZmNzgyMGE5In0.oAq-x6mXVWg4AXGCmDXTi-eNTlXm0YoGOg002nLaH4A",
  "access_expires_at": "2026-10-28T08:38:46.85670075Z",
  "refresh_token": "xLVx3o6oENz9DaW59iva6pm4sM2-c_ak2UEJLXVtvUQ",
  "refresh_expires_at": "2026-10-28T20:23:46.856168728Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a97e9087-ba76-43f1-868c-b5d89609c920/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
      "author_type": "RIDER",
      "author_id": "f23f3af6-163f-4f2d-a904-ae94de36b9a8",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T08:23:46.135634Z"
    },
    {
      "order_id": "a97e9087-ba76-43f1-868c-b5d89609c920",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "f23f3af6-163f-4f2d-a904-ae94de36b9a8",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T08:23:46.171304Z"
    }
  ]
}
```

Done: ratings for order a97e9087-ba76-43f1-868c-b5d89609c920.

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
  "session_id": "fe01f231-3b77-448f-ae1c-693db8820560",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3MjcsImlhdCI6MTc5MzE3NTgyNywianRpIjoiMzMzMjkzMmItNTljNS00YTIwLWEwMzItZDdhYjkzOWE4YTg4Iiwic2lkIjoiZmUwMWYyMzEtM2I3Ny00NDhmLWFlMWMtNjkzZGI4ODIwNTYwIn0.P-Q2ImwjqkBypNRVqX24--tMfRYDSLR0R7AbQUklbbU",
  "access_expires_at": "2026-10-28T08:38:47.22393864Z",
  "refresh_token": "sH7Z9a5Piy_-rsFWPn4B6YEQVVgPxDWZX-OG6ObjbCo",
  "refresh_expires_at": "2026-10-28T20:23:47.223350432Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5c87dadd-3bcd-4dfa-8f29-6b476b5c17e2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "6b572a8f-a660-4361-9a74-e17ab08a09bd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:47.262659Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6b572a8f-a660-4361-9a74-e17ab08a09bd` → **200**

```json
{
  "id": "6b572a8f-a660-4361-9a74-e17ab08a09bd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:47.262659Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6b572a8f-a660-4361-9a74-e17ab08a09bd` → **200**

```json
{
  "id": "6b572a8f-a660-4361-9a74-e17ab08a09bd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:47.262659Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6b572a8f-a660-4361-9a74-e17ab08a09bd` → **200**

```json
{
  "id": "6b572a8f-a660-4361-9a74-e17ab08a09bd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:47.262659Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6b572a8f-a660-4361-9a74-e17ab08a09bd` → **200**

```json
{
  "id": "6b572a8f-a660-4361-9a74-e17ab08a09bd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:47.262659Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6b572a8f-a660-4361-9a74-e17ab08a09bd` → **200**

```json
{
  "id": "6b572a8f-a660-4361-9a74-e17ab08a09bd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:47.262659Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6b572a8f-a660-4361-9a74-e17ab08a09bd` → **200**

```json
{
  "id": "6b572a8f-a660-4361-9a74-e17ab08a09bd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:23:47.262659Z",
  "ready_at": "2026-10-28T08:23:51.726135Z",
  "expires_at": "2026-10-29T08:23:51.726135Z"
}
```

`GET /api/admin/v1/reports/exports/6b572a8f-a660-4361-9a74-e17ab08a09bd/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
total,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "05eac65b-3257-494d-99f7-d301748317b4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "6772a536-d7d9-475d-945e-32a0cc3bb0c5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:52.493741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6772a536-d7d9-475d-945e-32a0cc3bb0c5` → **200**

```json
{
  "id": "6772a536-d7d9-475d-945e-32a0cc3bb0c5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:52.493741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6772a536-d7d9-475d-945e-32a0cc3bb0c5` → **200**

```json
{
  "id": "6772a536-d7d9-475d-945e-32a0cc3bb0c5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:52.493741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6772a536-d7d9-475d-945e-32a0cc3bb0c5` → **200**

```json
{
  "id": "6772a536-d7d9-475d-945e-32a0cc3bb0c5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:52.493741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6772a536-d7d9-475d-945e-32a0cc3bb0c5` → **200**

```json
{
  "id": "6772a536-d7d9-475d-945e-32a0cc3bb0c5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:52.493741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6772a536-d7d9-475d-945e-32a0cc3bb0c5` → **200**

```json
{
  "id": "6772a536-d7d9-475d-945e-32a0cc3bb0c5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:23:52.493741Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6772a536-d7d9-475d-945e-32a0cc3bb0c5` → **200**

```json
{
  "id": "6772a536-d7d9-475d-945e-32a0cc3bb0c5",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:23:52.493741Z",
  "ready_at": "2026-10-28T08:23:56.734005Z",
  "expires_at": "2026-10-29T08:23:56.734005Z"
}
```

`GET /api/admin/v1/reports/exports/6772a536-d7d9-475d-945e-32a0cc3bb0c5/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/48107fea-9ad1-42f8-9f01-39623a0463c3` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/48107fea-9ad1-42f8-9f01-39623a0463c3",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b6947725-f77f-4773-b11b-5ef1d3fe6762"
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
  "device_ref": "sandbox-4304"
}
```

```json
{
  "challenge_id": "6e1eaadc-faf0-41f3-9a4d-25b30dd214ef",
  "expires_at": "2026-10-28T08:28:57.753051791Z",
  "resend_available_at": "2026-10-28T08:23:58.753051791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "003494",
  "sent_at": "2026-10-28T08:23:57.755353197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e1eaadc-faf0-41f3-9a4d-25b30dd214ef",
  "code": "003494",
  "device_ref": "sandbox-4304"
}
```

```json
{
  "session_id": "6985b50c-fc09-46f5-ae0b-8edd5aa4ff50",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjczNywiaWF0IjoxNzkzMTc1ODM3LCJqdGkiOiIxMmM4ZTg0Mi1jMDBmLTRiZWEtYTg0MS0wNmUwYWZmYTNmYmQiLCJzaWQiOiI2OTg1YjUwYy1mYzA5LTQ2ZjUtYWUwYi04ZWRkNWFhNGZmNTAifQ.zB_DJ7SxLnpeJMgyWXBHtEcVcDR6T9PhIULY-Xkx4d0",
  "access_expires_at": "2026-10-28T08:38:57.808725331Z",
  "refresh_token": "OMFYpAwrIFfIpA7TYUhjjx8hDl6AWap57koqrDiEadA",
  "refresh_expires_at": "2026-11-27T08:23:57.808185123Z",
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
  "command_id": "2294f338-533c-49cb-a635-b55a5c3dd8ab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:23:57Z",
    "sequence": 1793175837879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "323f4597-6d23-444b-95b7-d231aaad325f",
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
  "last_heartbeat_at": "2026-10-28T08:23:57.898469Z",
  "last_location_at": "2026-10-28T08:23:57.898469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "20370cfb-d9dc-402b-976c-48f8fe169691",
  "points": [
    {
      "sequence": 1793175839933,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:22:59Z"
    },
    {
      "sequence": 1793175839941,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T08:23:59Z"
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
  "session_id": "d49baa8b-745b-4e27-a2bb-72881e281920",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3NDAsImlhdCI6MTc5MzE3NTg0MCwianRpIjoiYjAxOWE2ZGMtZWYzYi00ZTZjLTg0NmQtZjdmOTg1MWZiYzk5Iiwic2lkIjoiZDQ5YmFhOGItNzQ1Yi00ZTI3LWEyYmItNzI4ODFlMjgxOTIwIn0.gp33aqgPnCucpBxZKCXgwO0QS9rwJvvdidY4i6oASVE",
  "access_expires_at": "2026-10-28T08:39:00.314596315Z",
  "refresh_token": "jjrl8iDqG68PNPnEJdmZQzQ8SVnxPfDZw6SZ9b-u4v8",
  "refresh_expires_at": "2026-10-28T20:24:00.314052691Z",
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
      "id": "73a83af3-3d1b-4b6e-bf7d-89ccb8e3c26e",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T08:23:59Z",
        "track_point_id": "b5d0a472-4440-4656-a353-cddea73ccec4",
        "work_session_id": "323f4597-6d23-444b-95b7-d231aaad325f"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T08:23:59Z",
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

`POST /api/admin/v1/driver-risk-flags/73a83af3-3d1b-4b6e-bf7d-89ccb8e3c26e/confirm` → **200**

```json
{
  "command_id": "db44536a-25c8-437c-b7dd-709c65a21bfb",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "73a83af3-3d1b-4b6e-bf7d-89ccb8e3c26e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T08:23:59Z",
    "track_point_id": "b5d0a472-4440-4656-a353-cddea73ccec4",
    "work_session_id": "323f4597-6d23-444b-95b7-d231aaad325f"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T08:23:59Z",
  "reason": null,
  "reviewed_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "reviewed_at": "2026-10-28T08:24:01.470543Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/73a83af3-3d1b-4b6e-bf7d-89ccb8e3c26e/dismiss` → **409**

```json
{
  "command_id": "e33e273f-a079-4da0-b018-06a18d6f9577",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/73a83af3-3d1b-4b6e-bf7d-89ccb8e3c26e/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e48dcd8d-582c-4c37-bebe-c0dcafbfc33a"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a723a4bc-f099-4394-8f12-7efc82a5219c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "4c48f08c-05bf-4099-8ccb-e9780901f050",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "raised_at": "2026-10-28T08:24:01.548386Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/4c48f08c-05bf-4099-8ccb-e9780901f050/dismiss` → **200**

```json
{
  "command_id": "77781fd3-1fa9-46b7-929a-cdfb6598b40f",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "4c48f08c-05bf-4099-8ccb-e9780901f050",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "raised_at": "2026-10-28T08:24:01.548386Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "reviewed_at": "2026-10-28T08:24:01.588403Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "3f604610-a259-4dce-aba8-86006393e76e",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "73a83af3-3d1b-4b6e-bf7d-89ccb8e3c26e"
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
      "actor_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T08:24:01.634182Z"
    }
  ]
}
```

Done: flag 73a83af3-3d1b-4b6e-bf7d-89ccb8e3c26e confirmed, suspension named it, driver reinstated.

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
  "session_id": "3c9f17c2-31a8-4141-a8e6-3af943b94ec8",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3NDEsImlhdCI6MTc5MzE3NTg0MSwianRpIjoiNzY4NWJlMmItMWZlNC00NjQ0LTk4ZWYtZjI2YWRiZjRlOGJhIiwic2lkIjoiM2M5ZjE3YzItMzFhOC00MTQxLWE4ZTYtM2FmOTQzYjk0ZWM4In0.oGTbhR-6QN_q5lyoavjDnsyNktGGk3CTpAGYk712Phk",
  "access_expires_at": "2026-10-28T08:39:01.987449995Z",
  "refresh_token": "yaE18jXjWKlwzJHMH0ZL0rlBwJG1uZnz6DUqMUxFAU0",
  "refresh_expires_at": "2026-10-28T20:24:01.986843292Z",
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
      "actor_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T08:24:01.634182Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "d2fd7f37-a458-4892-bba2-fb6d7769193b",
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
  "session_id": "323f4597-6d23-444b-95b7-d231aaad325f",
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
  "last_heartbeat_at": "2026-10-28T08:23:57.898469Z",
  "last_location_at": "2026-10-28T08:23:57.898469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/323f4597-6d23-444b-95b7-d231aaad325f/close` → **200**

```json
{
  "command_id": "197bd4a7-db36-42d7-b740-fc362deb2e17",
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
  "session_id": "9c3a978c-970c-4c25-9a57-7f1e49b409a8",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3NDIsImlhdCI6MTc5MzE3NTg0MiwianRpIjoiNTNmMjUyN2ItZmI0YS00OGMyLThiNWUtNzY3ZDZkNDA0ZDRiIiwic2lkIjoiOWMzYTk3OGMtOTcwYy00YzI1LTlhNTctN2YxZTQ5YjQwOWE4In0.CT2hJkm9g4n-CV4OX1FsPZ5DnsW_qjSY8OyuzF57ing",
  "access_expires_at": "2026-10-28T08:39:02.442577273Z",
  "refresh_token": "MUpdOlhsRAoi-ix5ZJBZvH1Z8PVx6L5sngGxeTi65_c",
  "refresh_expires_at": "2026-10-28T20:24:02.441837008Z",
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
  "command_id": "fae911b8-8980-40a7-8092-7b00bc8affe2",
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
  "changed_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:24:02.513185Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "fae911b8-8980-40a7-8092-7b00bc8affe2",
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
  "changed_by": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:24:02.513185Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48897061599",
  "device_ref": "sandbox-28293"
}
```

```json
{
  "challenge_id": "36ac890e-228c-43e0-8369-885323e911ec",
  "expires_at": "2026-10-28T08:29:02.588497194Z",
  "resend_available_at": "2026-10-28T08:24:03.588497194Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48897061599` → **200**

```json
{
  "phone": "+48897061599",
  "audience": "CLIENT",
  "code": "617650",
  "sent_at": "2026-10-28T08:24:02.590625631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36ac890e-228c-43e0-8369-885323e911ec",
  "code": "617650",
  "device_ref": "sandbox-28293"
}
```

```json
{
  "session_id": "7b007e4e-0b49-4046-bf17-2996b4f187ba",
  "subject": {
    "type": "CLIENT",
    "id": "0acd8da2-6e8e-4bf9-b610-f0ec2a915964"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYWNkOGRhMi02ZThlLTRiZjktYjYxMC1mMGVjMmE5MTU5NjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzQyLCJpYXQiOjE3OTMxNzU4NDIsImp0aSI6ImI5NDMyNzZjLTFhNWItNDNlNC04ZDQ5LTlmNWZlMjY4YTZkMiIsInNpZCI6IjdiMDA3ZTRlLTBiNDktNDA0Ni1iZjE3LTI5OTZiNGYxODdiYSJ9.fXGohymBNKBw58bIC49YMayg6s1dy7LkE8uHp6-csPc",
  "access_expires_at": "2026-10-28T08:39:02.656502553Z",
  "refresh_token": "iC2Bann_m3uk7V5d-H9mfg6xLBkZUDzW4XPsqwVRTtQ",
  "refresh_expires_at": "2026-11-27T08:24:02.655841986Z",
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
  "correlation_id": "eea82cf9-81e1-45a6-8e20-0790d8bb50e6"
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
  "device_ref": "sandbox-15817"
}
```

```json
{
  "challenge_id": "2356e3e6-01e5-4a71-b7f3-b9fe21dfb0b1",
  "expires_at": "2026-10-28T08:29:02.739782819Z",
  "resend_available_at": "2026-10-28T08:24:03.739782819Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "609652",
  "sent_at": "2026-10-28T08:24:02.741993354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2356e3e6-01e5-4a71-b7f3-b9fe21dfb0b1",
  "code": "609652",
  "device_ref": "sandbox-15817"
}
```

```json
{
  "session_id": "a4c53bb6-014f-40cb-8d50-c304c3b34f39",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Njc0MiwiaWF0IjoxNzkzMTc1ODQyLCJqdGkiOiI5YTM1YzY4OS0wZjc1LTRmYzYtOWE1OC05ZjkzNGQzMDY5Y2YiLCJzaWQiOiJhNGM1M2JiNi0wMTRmLTQwY2ItOGQ1MC1jMzA0YzNiMzRmMzkifQ.Grl20hO8ux3C_BZbYvM7dbqUXxn8okNIYO0iEN_93tY",
  "access_expires_at": "2026-10-28T08:39:02.796126659Z",
  "refresh_token": "D_7W4iGgG3-1hopZQCx7IkYX06yJDmYA3hyTQTefT0o",
  "refresh_expires_at": "2026-11-27T08:24:02.795531055Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c6f526e4-faea-454f-95bc-45d312f25193",
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
  "last_heartbeat_at": "2026-10-28T08:23:44.9565Z",
  "last_location_at": "2026-10-28T08:23:44.9565Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6f526e4-faea-454f-95bc-45d312f25193/handover` → **200**

```json
{
  "command_id": "acd98ddc-8b6a-48bb-8073-c24e16162bbf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c6f526e4-faea-454f-95bc-45d312f25193",
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
  "last_heartbeat_at": "2026-10-28T08:23:44.9565Z",
  "last_location_at": "2026-10-28T08:23:44.9565Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6f526e4-faea-454f-95bc-45d312f25193/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:24:02Z",
    "sequence": 1793175842880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c6f526e4-faea-454f-95bc-45d312f25193",
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
  "last_heartbeat_at": "2026-10-28T08:24:02.898399Z",
  "last_location_at": "2026-10-28T08:24:02.898399Z",
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
  "session_id": "c6f526e4-faea-454f-95bc-45d312f25193",
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
  "last_heartbeat_at": "2026-10-28T08:24:02.898399Z",
  "last_location_at": "2026-10-28T08:24:02.898399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6f526e4-faea-454f-95bc-45d312f25193/close` → **200**

```json
{
  "command_id": "56d448f6-e709-4f1b-852e-4a229598a3a2",
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
  "correlation_id": "301c3934-f52e-4084-9324-c78519f22583"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677518791",
  "device_ref": "sandbox-3501"
}
```

```json
{
  "challenge_id": "b1076668-3986-4641-a451-7c8516d36e29",
  "expires_at": "2026-10-28T08:29:03.057639547Z",
  "resend_available_at": "2026-10-28T08:24:04.057639547Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677518791` → **200**

```json
{
  "phone": "+380677518791",
  "audience": "CLIENT",
  "code": "455416",
  "sent_at": "2026-10-28T08:24:03.059956542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1076668-3986-4641-a451-7c8516d36e29",
  "code": "455416",
  "device_ref": "sandbox-3501"
}
```

```json
{
  "session_id": "8eac60e7-5e9a-46c6-a35a-32795e3d36f1",
  "subject": {
    "type": "CLIENT",
    "id": "668b4aba-9768-4268-b925-5c4bbef183e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjhiNGFiYS05NzY4LTQyNjgtYjkyNS01YzRiYmVmMTgzZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2NzQzLCJpYXQiOjE3OTMxNzU4NDMsImp0aSI6ImM1YzNmZmNkLTIxM2ItNDlkMi1iNDZkLTQzNmUzMjg2ZTU0OCIsInNpZCI6IjhlYWM2MGU3LTVlOWEtNDZjNi1hMzVhLTMyNzk1ZTNkMzZmMSJ9.2CPHqvjULfCZcJl_AVM3QFDFSCdjN0Ma31X6GIA76-o",
  "access_expires_at": "2026-10-28T08:39:03.115162005Z",
  "refresh_token": "nylVRfDFbmCiWNTDMoRaeg2zPrEVDgnc58_v5cB0UsY",
  "refresh_expires_at": "2026-11-27T08:24:03.114460624Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "5c929899-0c8a-40cb-afc9-4736500d2591",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b",
  "upload_path": "/api/rider/v1/uploads/ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b",
  "expires_at": "2026-10-28T08:39:03.15206799Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b` → **200**

```json
{
  "file_id": "ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "ad3891dc-d6c0-4f79-95a7-896980ec606b",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b"
  ]
}
```

```json
{
  "id": "29213bf8-f6a7-4791-8c4e-0204fbe60e79",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:24:03.216868Z",
  "updated_at": "2026-10-28T08:24:03.216868Z",
  "messages": [
    {
      "id": "e9fd32ab-bd7c-4aac-b29d-a4995cb5b86f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:24:03.218186Z",
      "attachments": [
        {
          "file_id": "ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b",
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
  "session_id": "fa638295-0baa-4ef4-99a8-422fda1011a3",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3NDMsImlhdCI6MTc5MzE3NTg0MywianRpIjoiZDIzY2UxM2ItMzAyMy00MmYxLTgwYjQtMGRkZmQ2OTAyYmRhIiwic2lkIjoiZmE2MzgyOTUtMGJhYS00ZWY0LTk5YTgtNDIyZmRhMTAxMWEzIn0._1OEp431okD15006CCC0N75VqjqLygwN7mwjsqES3Kg",
  "access_expires_at": "2026-10-28T08:39:03.563549206Z",
  "refresh_token": "OPlnSQ8O6CTw9uTqpxclSMYXtsqa916i-WAdiSK9tvE",
  "refresh_expires_at": "2026-10-28T20:24:03.563025108Z",
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
  "session_id": "f3cad309-878a-4439-a28a-cb0fc3d4524a",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3NDMsImlhdCI6MTc5MzE3NTg0MywianRpIjoiMGMyNjIxMGUtNzQyMS00MThmLWFhYTItNWRkYzcyODlmZDEzIiwic2lkIjoiZjNjYWQzMDktODc4YS00NDM5LWEyOGEtY2IwZmMzZDQ1MjRhIn0.5DTagCMzIviN4ubJahfIxkiRav-h03gpCB5NvdsCvOQ",
  "access_expires_at": "2026-10-28T08:39:03.897258359Z",
  "refresh_token": "1vQd8Pgzd4sA1qISIdeqckqaDTbdBJxAiQ5rbWVeUuQ",
  "refresh_expires_at": "2026-10-28T20:24:03.896669728Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/29213bf8-f6a7-4791-8c4e-0204fbe60e79/attachments/ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ad85250d-61d1-4d57-b486-b71ca6b2d476",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a0489eb3-cd83-4977-82f9-959e1e040d54",
  "upload_path": "/api/operator/v1/uploads/a0489eb3-cd83-4977-82f9-959e1e040d54",
  "expires_at": "2026-10-28T08:39:03.948428968Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/a0489eb3-cd83-4977-82f9-959e1e040d54` → **200**

```json
{
  "file_id": "a0489eb3-cd83-4977-82f9-959e1e040d54",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/29213bf8-f6a7-4791-8c4e-0204fbe60e79` → **200**

```json
{
  "id": "29213bf8-f6a7-4791-8c4e-0204fbe60e79",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:24:03.216868Z",
  "updated_at": "2026-10-28T08:24:03.216868Z",
  "messages": [
    {
      "id": "e9fd32ab-bd7c-4aac-b29d-a4995cb5b86f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:24:03.218186Z",
      "attachments": [
        {
          "file_id": "ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/29213bf8-f6a7-4791-8c4e-0204fbe60e79/comments` → **200**

```json
{
  "command_id": "15cb2083-6067-4eff-8fce-8d8ae111d485",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "a0489eb3-cd83-4977-82f9-959e1e040d54"
  ]
}
```

```json
{
  "id": "29213bf8-f6a7-4791-8c4e-0204fbe60e79",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:24:03.216868Z",
  "updated_at": "2026-10-28T08:24:04.052379Z",
  "messages": [
    {
      "id": "e9fd32ab-bd7c-4aac-b29d-a4995cb5b86f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:24:03.218186Z",
      "attachments": [
        {
          "file_id": "ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2d3fa354-e03b-497d-a9f4-d825b25e1e6d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:24:04.051853Z",
      "attachments": [
        {
          "file_id": "a0489eb3-cd83-4977-82f9-959e1e040d54",
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

`GET /api/rider/v1/support/cases/29213bf8-f6a7-4791-8c4e-0204fbe60e79` → **200**

```json
{
  "id": "29213bf8-f6a7-4791-8c4e-0204fbe60e79",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:24:03.216868Z",
  "updated_at": "2026-10-28T08:24:04.052379Z",
  "messages": [
    {
      "id": "e9fd32ab-bd7c-4aac-b29d-a4995cb5b86f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "668b4aba-9768-4268-b925-5c4bbef183e5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:24:03.218186Z",
      "attachments": [
        {
          "file_id": "ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2d3fa354-e03b-497d-a9f4-d825b25e1e6d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:24:04.051853Z",
      "attachments": [
        {
          "file_id": "a0489eb3-cd83-4977-82f9-959e1e040d54",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/29213bf8-f6a7-4791-8c4e-0204fbe60e79/attachments/a0489eb3-cd83-4977-82f9-959e1e040d54` → **200**

Done: support case 29213bf8-f6a7-4791-8c4e-0204fbe60e79, rider attachment ef5b8b2b-74d8-4d9f-9b64-6ffab99c0a8b, operator attachment a0489eb3-cd83-4977-82f9-959e1e040d54.

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
  "session_id": "e5accaae-5a85-4818-9952-3ff1e3cbf606",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3NDQsImlhdCI6MTc5MzE3NTg0NCwianRpIjoiMjVmYjkzMzEtYTIwYi00Yjc4LWE5NGEtNGNlZTc0ZDg5YTZmIiwic2lkIjoiZTVhY2NhYWUtNWE4NS00ODE4LTk5NTItM2ZmMWUzY2JmNjA2In0.byqj3DTi7CXeDOiJF9B8KDo1ybbj6rC8rq0Ut_PiFq4",
  "access_expires_at": "2026-10-28T08:39:04.457256702Z",
  "refresh_token": "T0pE2A3FUqceFC0Vmm_Omg84K1JUGuROjE85zgSKn0M",
  "refresh_expires_at": "2026-10-28T20:24:04.456632316Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2884"
}
```

```json
{
  "challenge_id": "8c5e3a69-d20b-4582-86c9-df2e3fe16fc1",
  "expires_at": "2026-10-28T08:29:04.487729496Z",
  "resend_available_at": "2026-10-28T08:24:05.487729496Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "255054",
  "sent_at": "2026-10-28T08:24:04.489957144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c5e3a69-d20b-4582-86c9-df2e3fe16fc1",
  "code": "255054",
  "device_ref": "sandbox-2884"
}
```

```json
{
  "session_id": "1568fa66-8a0a-49a8-95d0-ed592b106f87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Njc0NCwiaWF0IjoxNzkzMTc1ODQ0LCJqdGkiOiIzOWY1ODkzZi0xODg3LTRiYzQtYjQ3MS1iZDQyZDFmNGZhY2QiLCJzaWQiOiIxNTY4ZmE2Ni04YTBhLTQ5YTgtOTVkMC1lZDU5MmIxMDZmODcifQ.Ze1k0OeWaiw3YyVSFSmjR-q8GpviLSFjlfi6TKSaQsg",
  "access_expires_at": "2026-10-28T08:39:04.55168861Z",
  "refresh_token": "AR490FawnKbzVezJHxWCNZcRYkZzHr5PLVLV4tm3oKk",
  "refresh_expires_at": "2026-11-27T08:24:04.550994843Z",
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
      "actor_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T08:24:01.634182Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T08:24:02.052962Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "7d9904ea-639b-472e-999a-f83fd001e720",
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
  "device_ref": "sandbox-23194"
}
```

```json
{
  "challenge_id": "e261c70a-7104-4339-98ce-8b95685015ab",
  "expires_at": "2026-10-28T08:29:04.68285952Z",
  "resend_available_at": "2026-10-28T08:24:05.68285952Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "455507",
  "sent_at": "2026-10-28T08:24:04.685458527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e261c70a-7104-4339-98ce-8b95685015ab",
  "code": "455507",
  "device_ref": "sandbox-23194"
}
```

```json
{
  "session_id": "e5b50a81-4041-444f-a6fc-7bcb4364e282",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Njc0NCwiaWF0IjoxNzkzMTc1ODQ0LCJqdGkiOiI3MWI0NjI1MC0yNmI4LTQzMmItOTI0YS1iODY4MmI0NzkwMTQiLCJzaWQiOiJlNWI1MGE4MS00MDQxLTQ0NGYtYTZmYy03YmNiNDM2NGUyODIifQ.aMdZQpDA5sNMoiNAhchE53LdxCdgWvWDzC96J93kXlM",
  "access_expires_at": "2026-10-28T08:39:04.744790025Z",
  "refresh_token": "UQ0QuZPN_iR9fe3BwKyoYyCkBO12Pl9mBTwsrj8Ti_M",
  "refresh_expires_at": "2026-11-27T08:24:04.744132917Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b411a8d7-6592-4435-b39e-c38772911b42",
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
  "last_heartbeat_at": "2026-10-28T08:23:46.058365Z",
  "last_location_at": "2026-10-28T08:23:46.058365Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b411a8d7-6592-4435-b39e-c38772911b42/handover` → **200**

```json
{
  "command_id": "f487b9bf-1887-4dd8-8dd4-38a23f67a69f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b411a8d7-6592-4435-b39e-c38772911b42",
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
  "last_heartbeat_at": "2026-10-28T08:23:46.058365Z",
  "last_location_at": "2026-10-28T08:23:46.058365Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b411a8d7-6592-4435-b39e-c38772911b42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:24:04Z",
    "sequence": 1793175844829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b411a8d7-6592-4435-b39e-c38772911b42",
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
  "last_heartbeat_at": "2026-10-28T08:24:04.846798Z",
  "last_location_at": "2026-10-28T08:24:04.846798Z",
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
  "command_id": "1b68121f-5c04-42de-a1ec-104b1bb3b9c3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:24:04Z",
    "sequence": 1793175844893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a6bfe35-79dc-4610-ad50-5ce7efacb20a",
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
  "last_heartbeat_at": "2026-10-28T08:24:04.911297Z",
  "last_location_at": "2026-10-28T08:24:04.911297Z",
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
  "session_id": "d84ddcdc-a33b-4639-b98b-90671043563a",
  "subject": {
    "type": "STAFF",
    "id": "201ac7f2-2e74-44d5-b67a-e9693f891f4a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDFhYzdmMi0yZTc0LTQ0ZDUtYjY3YS1lOTY5M2Y4OTFmNGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzY3NDUsImlhdCI6MTc5MzE3NTg0NSwianRpIjoiZDZkZjQ0MzAtOWM4Ni00M2IzLTkwZWUtZjY0YzQ4NDc3MWM3Iiwic2lkIjoiZDg0ZGRjZGMtYTMzYi00NjM5LWI5OGItOTA2NzEwNDM1NjNhIn0.CzAWBXXegBY6xPcDE12d-Xvkgf-UGQ7Y3_8cLwnVuC4",
  "access_expires_at": "2026-10-28T08:39:05.234841394Z",
  "refresh_token": "NNLZCEo8eLTv9KozMwzWGGOaPSoCuVZz9Vl2pDda8T4",
  "refresh_expires_at": "2026-10-28T20:24:05.23427701Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "11d5b019-afba-4fe8-be64-6223a9ded75c",
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
  "id": "ad6e3249-ac4b-462c-a351-bb1aabb9f340",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:29:05.265737Z",
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
  "command_id": "7135724b-fbfe-41b3-b826-36fa8a07158d",
  "quote_id": "ad6e3249-ac4b-462c-a351-bb1aabb9f340",
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
  "id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
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
  "created_at": "2026-10-28T08:24:05.30491Z",
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
    "id": "b12c6fc9-68da-42ed-ba35-05be2a5a8678",
    "order_id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
    "expires_at": "2026-10-28T08:24:20.308302Z",
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

`POST /api/driver/v1/offers/b12c6fc9-68da-42ed-ba35-05be2a5a8678/accept` → **200**

```json
{
  "command_id": "52da5ff8-da1a-4976-b86d-6e4300334654"
}
```

```json
{
  "id": "61656aef-966f-4e68-abcb-ffeb79dfb0f2",
  "order_id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b5c74cd-025c-4c3b-9ebd-35062ae55826",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b5c74cd-025c-4c3b-9ebd-35062ae55826",
  "order_id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
  "assignment_id": "61656aef-966f-4e68-abcb-ffeb79dfb0f2",
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

`POST /api/driver/v1/work-sessions/2a6bfe35-79dc-4610-ad50-5ce7efacb20a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:24:05Z",
    "sequence": 1793175845439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a6bfe35-79dc-4610-ad50-5ce7efacb20a",
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
  "last_heartbeat_at": "2026-10-28T08:24:05.457481Z",
  "last_location_at": "2026-10-28T08:24:05.457481Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3b5c74cd-025c-4c3b-9ebd-35062ae55826/arrive` → **200**

```json
{
  "command_id": "d7c4db1e-cf24-4c57-9346-a9a9a868aa3b",
  "expected_version": 0
}
```

```json
{
  "id": "3b5c74cd-025c-4c3b-9ebd-35062ae55826",
  "order_id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
  "assignment_id": "61656aef-966f-4e68-abcb-ffeb79dfb0f2",
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
  "arrived_at": "2026-10-28T08:24:05.492981Z",
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

`POST /api/driver/v1/trips/3b5c74cd-025c-4c3b-9ebd-35062ae55826/start` → **200**

```json
{
  "command_id": "116e4853-b73e-4c0c-b38b-f5a604532368",
  "expected_version": 1
}
```

```json
{
  "id": "3b5c74cd-025c-4c3b-9ebd-35062ae55826",
  "order_id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
  "assignment_id": "61656aef-966f-4e68-abcb-ffeb79dfb0f2",
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
  "arrived_at": "2026-10-28T08:24:05.492981Z",
  "started_at": "2026-10-28T08:24:05.532113Z",
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

`POST /api/driver/v1/trips/3b5c74cd-025c-4c3b-9ebd-35062ae55826/complete` → **200**

```json
{
  "command_id": "40660f75-5b1c-4124-852f-6d80ba5fb42b",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:24:05Z",
  "cash_received": true
}
```

```json
{
  "id": "3b5c74cd-025c-4c3b-9ebd-35062ae55826",
  "order_id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
  "assignment_id": "61656aef-966f-4e68-abcb-ffeb79dfb0f2",
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
  "arrived_at": "2026-10-28T08:24:05.492981Z",
  "started_at": "2026-10-28T08:24:05.532113Z",
  "completed_at": "2026-10-28T08:24:05.574238Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/8ad15065-b5a9-42f4-b87a-08d91776c172` → **200**

```json
{
  "id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
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
    "id": "61656aef-966f-4e68-abcb-ffeb79dfb0f2",
    "order_id": "8ad15065-b5a9-42f4-b87a-08d91776c172",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b5c74cd-025c-4c3b-9ebd-35062ae55826",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:24:05.30491Z",
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
  "session_id": "b411a8d7-6592-4435-b39e-c38772911b42",
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
  "last_heartbeat_at": "2026-10-28T08:24:04.846798Z",
  "last_location_at": "2026-10-28T08:24:04.846798Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b411a8d7-6592-4435-b39e-c38772911b42/close` → **200**

```json
{
  "command_id": "15e20a5a-b624-4b6e-99bf-e9c22b31d35e",
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
  "session_id": "2a6bfe35-79dc-4610-ad50-5ce7efacb20a",
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
  "last_heartbeat_at": "2026-10-28T08:24:05.457481Z",
  "last_location_at": "2026-10-28T08:24:05.457481Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a6bfe35-79dc-4610-ad50-5ce7efacb20a/close` → **200**

```json
{
  "command_id": "46406a65-64d3-4f05-a4d2-43b4b391f05e",
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

Done: terminal order 8ad15065-b5a9-42f4-b87a-08d91776c172 by Andrii (5a000000-0000-4000-8000-000000000403).
