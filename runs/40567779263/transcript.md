# Sandbox transcript (2026-10-27T19:18:18Z, 6aecaca)

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
  "correlation_id": "0fcf3c0e-58c3-4ea7-a278-550e9c187be7"
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
  "session_id": "4e306fda-e22e-4b85-aa5e-aa9ca4a0a87a",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk1OTksImlhdCI6MTc5MzEyODY5OSwianRpIjoiZjM4MDM3NjAtYWExYi00MDM3LWI0YzgtNDJhYzY2NmJjY2U4Iiwic2lkIjoiNGUzMDZmZGEtZTIyZS00Yjg1LWFhNWUtYWE5Y2E0YTBhODdhIn0.Kb3zWrdnFwDiitsRLfWLE3VD9u6k4CQWPBN9epB9OsQ",
  "access_expires_at": "2026-10-27T19:33:19.250490721Z",
  "refresh_token": "yANbl6DT_MB3Oxx0KqN5ah-L4zfjhCkWW5asEo4lwBI",
  "refresh_expires_at": "2026-10-28T07:18:19.248809684Z",
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
  "session_id": "575fd9ae-cb2d-4cfc-aef3-4fd5f06e0c6e",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MDAsImlhdCI6MTc5MzEyODcwMCwianRpIjoiNDY1YjJlMDEtM2ZmZS00ZTkzLWFhZjItNjcyMDIyMzA1NjkzIiwic2lkIjoiNTc1ZmQ5YWUtY2IyZC00Y2ZjLWFlZjMtNGZkNWYwNmUwYzZlIn0.G_5jlY6IZg60yuQBUNyKgPqtBa8T0tcYxt-GYRIodao",
  "access_expires_at": "2026-10-27T19:33:20.390381725Z",
  "refresh_token": "7gv7ZLkImcCsUIImbdibBxrae3sGnK3i_-vSnMo2qVg",
  "refresh_expires_at": "2026-10-28T07:18:20.389433584Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c9bcb6c2-3465-4a1d-9f5f-0d456cfde174",
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
  "id": "cf762a6f-1217-4fd1-8645-24efd1dea6dd",
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
  "created_by": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "created_at": "2026-10-27T19:18:20.445971Z",
  "updated_at": "2026-10-27T19:18:20.445971Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631662941",
  "device_ref": "sandbox-11165"
}
```

```json
{
  "challenge_id": "0c7648f9-41fb-4f04-937b-a952d360bbed",
  "expires_at": "2026-10-27T19:23:20.489772836Z",
  "resend_available_at": "2026-10-27T19:18:21.489772836Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631662941` → **200**

```json
{
  "phone": "+380631662941",
  "audience": "CLIENT",
  "code": "879818",
  "sent_at": "2026-10-27T19:18:20.498146732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c7648f9-41fb-4f04-937b-a952d360bbed",
  "code": "879818",
  "device_ref": "sandbox-11165"
}
```

```json
{
  "session_id": "5403aec5-beae-467a-a613-f46ae38a8160",
  "subject": {
    "type": "CLIENT",
    "id": "d4f28c0b-5362-4df0-aca1-66ee9a7ed75d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGYyOGMwYi01MzYyLTRkZjAtYWNhMS02NmVlOWE3ZWQ3NWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjAwLCJpYXQiOjE3OTMxMjg3MDAsImp0aSI6IjY3NGJlNGJkLTFjODgtNDVjNy1hYmU2LWNmNDg1YjBkZWFlYSIsInNpZCI6IjU0MDNhZWM1LWJlYWUtNDY3YS1hNjEzLWY0NmFlMzhhODE2MCJ9.E1am6to2cUj0xAJzQXc9a-68f2YSbkpRQeTAf9l-dck",
  "access_expires_at": "2026-10-27T19:33:20.584749745Z",
  "refresh_token": "k2WoZzT88fpSqPkaxESDN5_w4eAqNfsuIh-PGSUQzlk",
  "refresh_expires_at": "2026-11-26T19:18:20.583796416Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631662941` → **200**

```json
{
  "client_id": "d4f28c0b-5362-4df0-aca1-66ee9a7ed75d"
}
```

`POST /api/admin/v1/rider-wallets/d4f28c0b-5362-4df0-aca1-66ee9a7ed75d/top-ups` → **201**

```json
{
  "command_id": "5d7387c3-1e00-448c-aebc-35a30d7b6503",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d4f28c0b-5362-4df0-aca1-66ee9a7ed75d",
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
      "id": "fe894f96-bae9-4e90-9f4d-07f0de07ee3f",
      "at": "2026-10-27T19:18:20.678803Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a562d117-e4be-44f6-880c-e4162f81fabf",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df411a4d-9d9f-4a0f-b605-f6bffa656f00",
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
  "id": "534f8493-33a9-4f48-b541-92f520bbe841",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:20.785476Z",
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
      "id": "cf762a6f-1217-4fd1-8645-24efd1dea6dd",
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
  "device_ref": "sandbox-27642"
}
```

```json
{
  "challenge_id": "cd026be7-9a6a-4436-8162-f4bf4da9a77c",
  "expires_at": "2026-10-27T19:23:20.84364331Z",
  "resend_available_at": "2026-10-27T19:18:21.84364331Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "628807",
  "sent_at": "2026-10-27T19:18:20.846909699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd026be7-9a6a-4436-8162-f4bf4da9a77c",
  "code": "628807",
  "device_ref": "sandbox-27642"
}
```

```json
{
  "session_id": "170b3974-ebff-44ea-ba89-d7e59e6286e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYwMCwiaWF0IjoxNzkzMTI4NzAwLCJqdGkiOiIwN2NhZjg2OC02ZGE4LTRjMjYtYTE3NS05MzdhMjA5NWQ2NjAiLCJzaWQiOiIxNzBiMzk3NC1lYmZmLTQ0ZWEtYmE4OS1kN2U1OWU2Mjg2ZTMifQ.6lSJTDzycfgBSonXOOZXczKaOQiJmuFWtHOhyN_wjjI",
  "access_expires_at": "2026-10-27T19:33:20.899167812Z",
  "refresh_token": "3-jz2vtNe7PhoiwLhsFDBAdxPYxV0__e-7gaQQpzx_w",
  "refresh_expires_at": "2026-11-26T19:18:20.898312431Z",
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
  "command_id": "4499aef7-bf5a-4658-a341-c820ff9f4b07",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:20Z",
    "sequence": 1793128700955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c77be9e-2775-45d6-9707-49968ec3d734",
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
  "last_heartbeat_at": "2026-10-27T19:18:20.98898Z",
  "last_location_at": "2026-10-27T19:18:20.98898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ad22a863-8ab2-4797-989b-7f438792475f",
  "quote_id": "534f8493-33a9-4f48-b541-92f520bbe841",
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
  "id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4f28c0b-5362-4df0-aca1-66ee9a7ed75d",
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
  "created_at": "2026-10-27T19:18:21.065312Z",
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
  "client_id": "d4f28c0b-5362-4df0-aca1-66ee9a7ed75d",
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
      "id": "fe894f96-bae9-4e90-9f4d-07f0de07ee3f",
      "at": "2026-10-27T19:18:20.678803Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a562d117-e4be-44f6-880c-e4162f81fabf",
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
    "id": "3b178809-4387-4fcc-b178-1f6c6b1fcb05",
    "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
    "expires_at": "2026-10-27T19:18:36.077232Z",
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

`POST /api/driver/v1/offers/3b178809-4387-4fcc-b178-1f6c6b1fcb05/accept` → **200**

```json
{
  "command_id": "d1867a05-1582-490e-93ef-4dd063afb458"
}
```

```json
{
  "id": "544fd25b-5bcc-4f08-b551-ff0a5f04fc20",
  "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c78e12c8-783d-45e1-923b-b29dc282b304",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c78e12c8-783d-45e1-923b-b29dc282b304",
  "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
  "assignment_id": "544fd25b-5bcc-4f08-b551-ff0a5f04fc20",
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

`POST /api/driver/v1/work-sessions/4c77be9e-2775-45d6-9707-49968ec3d734/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:21Z",
    "sequence": 1793128701239
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c77be9e-2775-45d6-9707-49968ec3d734",
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
  "last_heartbeat_at": "2026-10-27T19:18:21.262457Z",
  "last_location_at": "2026-10-27T19:18:21.262457Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c78e12c8-783d-45e1-923b-b29dc282b304/arrive` → **200**

```json
{
  "command_id": "a25d45b7-a8c9-43a6-8238-15f7b319ca8d",
  "expected_version": 0
}
```

```json
{
  "id": "c78e12c8-783d-45e1-923b-b29dc282b304",
  "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
  "assignment_id": "544fd25b-5bcc-4f08-b551-ff0a5f04fc20",
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
  "arrived_at": "2026-10-27T19:18:21.307208Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c78e12c8-783d-45e1-923b-b29dc282b304/start` → **200**

```json
{
  "command_id": "819d0813-be93-47e7-a4c0-5b95ecfb74f9",
  "expected_version": 1
}
```

```json
{
  "id": "c78e12c8-783d-45e1-923b-b29dc282b304",
  "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
  "assignment_id": "544fd25b-5bcc-4f08-b551-ff0a5f04fc20",
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
  "arrived_at": "2026-10-27T19:18:21.307208Z",
  "started_at": "2026-10-27T19:18:21.347259Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/c78e12c8-783d-45e1-923b-b29dc282b304/complete` → **200**

```json
{
  "command_id": "b791b567-2816-43ba-b42e-e3424e052e79",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:18:21Z",
  "cash_received": true
}
```

```json
{
  "id": "c78e12c8-783d-45e1-923b-b29dc282b304",
  "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
  "assignment_id": "544fd25b-5bcc-4f08-b551-ff0a5f04fc20",
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
  "arrived_at": "2026-10-27T19:18:21.307208Z",
  "started_at": "2026-10-27T19:18:21.347259Z",
  "completed_at": "2026-10-27T19:18:21.405381Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d4f28c0b-5362-4df0-aca1-66ee9a7ed75d",
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
      "id": "23120a52-4d3f-4e7e-a9c7-bb1bac1139eb",
      "at": "2026-10-27T19:18:22.467801Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72"
    },
    {
      "id": "fe894f96-bae9-4e90-9f4d-07f0de07ee3f",
      "at": "2026-10-27T19:18:20.678803Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a562d117-e4be-44f6-880c-e4162f81fabf",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cf762a6f-1217-4fd1-8645-24efd1dea6dd/archive` → **200**

```json
{
  "command_id": "20164b7e-483f-4778-ada2-42ef6305fab9",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cf762a6f-1217-4fd1-8645-24efd1dea6dd",
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
  "created_by": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "created_at": "2026-10-27T19:18:20.445971Z",
  "updated_at": "2026-10-27T19:18:24.501195Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c77be9e-2775-45d6-9707-49968ec3d734",
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
  "last_heartbeat_at": "2026-10-27T19:18:21.262457Z",
  "last_location_at": "2026-10-27T19:18:21.262457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4c77be9e-2775-45d6-9707-49968ec3d734/close` → **200**

```json
{
  "command_id": "24ad4a61-f71f-4227-bfe6-1fc32dd1d5fc",
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

Done: order 782beb1f-b55f-4f73-adc3-7d9a8ea80e72.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630972781",
  "device_ref": "sandbox-14923"
}
```

```json
{
  "challenge_id": "461af670-e66a-441e-b57a-60b47b40a64e",
  "expires_at": "2026-10-27T19:23:24.61091358Z",
  "resend_available_at": "2026-10-27T19:18:25.61091358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630972781` → **200**

```json
{
  "phone": "+380630972781",
  "audience": "CLIENT",
  "code": "776650",
  "sent_at": "2026-10-27T19:18:24.614224746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "461af670-e66a-441e-b57a-60b47b40a64e",
  "code": "776650",
  "device_ref": "sandbox-14923"
}
```

```json
{
  "session_id": "6667331c-e941-40f9-a00a-de659757e725",
  "subject": {
    "type": "CLIENT",
    "id": "e99fce29-d3a0-43e2-85e7-24796003d1e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTlmY2UyOS1kM2EwLTQzZTItODVlNy0yNDc5NjAwM2QxZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjA0LCJpYXQiOjE3OTMxMjg3MDQsImp0aSI6ImE0YjNlNTM3LTBiZjgtNDk4Yi1iOTExLTk2NjY2ZWYyOTExNiIsInNpZCI6IjY2NjczMzFjLWU5NDEtNDBmOS1hMDBhLWRlNjU5NzU3ZTcyNSJ9.ZFuUXQvvXbxCQUmdcbQjLz4KN6rsBEVy87IyeZsg-Rw",
  "access_expires_at": "2026-10-27T19:33:24.666555789Z",
  "refresh_token": "GYG4DHq9L3Y1WhcU3_bm4LEk50i7AnHLPFRyxfI6t5c",
  "refresh_expires_at": "2026-11-26T19:18:24.665824605Z",
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
  "device_ref": "sandbox-26569"
}
```

```json
{
  "challenge_id": "51f62e08-97e8-4f42-a5bf-970028cd6582",
  "expires_at": "2026-10-27T19:23:24.715489715Z",
  "resend_available_at": "2026-10-27T19:18:25.715489715Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "904697",
  "sent_at": "2026-10-27T19:18:24.719048475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51f62e08-97e8-4f42-a5bf-970028cd6582",
  "code": "904697",
  "device_ref": "sandbox-26569"
}
```

```json
{
  "session_id": "3ee4994f-f4d9-4531-b6d6-dd235bc09e54",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYwNCwiaWF0IjoxNzkzMTI4NzA0LCJqdGkiOiIwODcxMWM0YS0wMDAyLTRiMWQtOGE5Mi0xNTg4MmU5NDFjMTQiLCJzaWQiOiIzZWU0OTk0Zi1mNGQ5LTQ1MzEtYjZkNi1kZDIzNWJjMDllNTQifQ.LD5XTbyxH4H2pPV5ytj4R1m-jFrTr0CfmwtX4g6Uhxg",
  "access_expires_at": "2026-10-27T19:33:24.770310284Z",
  "refresh_token": "Z-a3DvQ3z4uqArKVMghv__gV8lfBrGAfdDJpL3HEeOE",
  "refresh_expires_at": "2026-11-26T19:18:24.769659732Z",
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
  "session_id": "1cb481ab-e354-4eee-ac51-3ed088d122a2",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MDUsImlhdCI6MTc5MzEyODcwNSwianRpIjoiZGZjMTlkZjEtOWE1Yi00NDU4LWJlMmEtNjI3ZWY4YTY5ZmU3Iiwic2lkIjoiMWNiNDgxYWItZTM1NC00ZWVlLWFjNTEtM2VkMDg4ZDEyMmEyIn0.0RAxZru8_VDRQhD2Vt7jngtWX8aBUTFEC4a8N3L2Uco",
  "access_expires_at": "2026-10-27T19:33:25.074856103Z",
  "refresh_token": "_K7m3xwosoBQ8oXfURmLFkqp395Mfq_IIjmQ9cphPqk",
  "refresh_expires_at": "2026-10-28T07:18:25.074064819Z",
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
  "session_id": "a3118867-e383-48cc-9bf2-ac7544ab22c5",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MDUsImlhdCI6MTc5MzEyODcwNSwianRpIjoiYTZjZTlhODMtNmZlNi00ODhmLTlkOTMtYjkyYjQ5OTVlZGIxIiwic2lkIjoiYTMxMTg4NjctZTM4My00OGNjLTliZjItYWM3NTQ0YWIyMmM1In0.M7CP1sFfplvingWysGGj9VaLIZst4Sg6-eBuxzlcDGU",
  "access_expires_at": "2026-10-27T19:33:25.359292435Z",
  "refresh_token": "s-8XBZt6cQnoWXG67TR9pLs3UmwOGHQ0PtkfOuHRWoE",
  "refresh_expires_at": "2026-10-28T07:18:25.358558507Z",
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
  "command_id": "fa8e491f-70e0-4978-b6e5-1a606290b947",
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
  "id": "6a007bf3-65ce-478d-9683-0d16c31892a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:23:25.417598Z",
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
  "command_id": "867d18d3-e6a4-40ca-a9fb-5bb2cc7b1f47",
  "quote_id": "6a007bf3-65ce-478d-9683-0d16c31892a5",
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
  "id": "0818379c-3aa6-4962-80ae-20e42c445b71",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e99fce29-d3a0-43e2-85e7-24796003d1e6",
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
  "created_at": "2026-10-27T19:18:25.455144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/0818379c-3aa6-4962-80ae-20e42c445b71` → **200**

```json
{
  "id": "0818379c-3aa6-4962-80ae-20e42c445b71",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e99fce29-d3a0-43e2-85e7-24796003d1e6",
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
  "created_at": "2026-10-27T19:18:25.455144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0818379c-3aa6-4962-80ae-20e42c445b71/cancel` → **200**

```json
{
  "command_id": "1da51a23-aa42-4eda-ae59-e88552c7d437",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "0818379c-3aa6-4962-80ae-20e42c445b71",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e99fce29-d3a0-43e2-85e7-24796003d1e6",
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
  "created_at": "2026-10-27T19:18:25.455144Z",
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
  "command_id": "5c8a3011-f2c3-4996-bc97-ff587ba2b4c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:25Z",
    "sequence": 1793128705575
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:25.592266Z",
  "last_location_at": "2026-10-27T19:18:25.592266Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6043"
}
```

```json
{
  "challenge_id": "c574b12f-f344-4cf0-845b-7621e35cffa0",
  "expires_at": "2026-10-27T19:23:25.619471429Z",
  "resend_available_at": "2026-10-27T19:18:26.619471429Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "508980",
  "sent_at": "2026-10-27T19:18:25.62258655Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c574b12f-f344-4cf0-845b-7621e35cffa0",
  "code": "508980",
  "device_ref": "sandbox-6043"
}
```

```json
{
  "session_id": "5c03d138-2fd9-4553-b07e-9df6c2658403",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYwNSwiaWF0IjoxNzkzMTI4NzA1LCJqdGkiOiI2YmJkMGE5MS1jYWU0LTRhMzEtODdhYS0zZGU1MTg5OTJiNTAiLCJzaWQiOiI1YzAzZDEzOC0yZmQ5LTQ1NTMtYjA3ZS05ZGY2YzI2NTg0MDMifQ.K8iDXv3kGprbrkVWDCtmHwXRdq5VWOIoMLsfEahVWDo",
  "access_expires_at": "2026-10-27T19:33:25.677925392Z",
  "refresh_token": "G6riNWWf_Gmbt9ZjdEovArBadEuxaJIck_oJWzTWppI",
  "refresh_expires_at": "2026-11-26T19:18:25.675786414Z",
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
  "command_id": "7d3794e3-105a-4432-abf6-4df13823adbe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:25Z",
    "sequence": 1793128705729
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "95a11f19-2b2c-4cd7-8c58-76721775a1f1",
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
  "last_heartbeat_at": "2026-10-27T19:18:25.746443Z",
  "last_location_at": "2026-10-27T19:18:25.746443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "563dde84-369d-43d8-945e-4c51a4a61b0d",
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
  "id": "085347fa-8db6-4bd4-8865-32c8e3baad16",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:23:25.781299Z",
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
  "command_id": "74fd635c-68d6-4df7-a4f5-b146e3677568",
  "quote_id": "085347fa-8db6-4bd4-8865-32c8e3baad16",
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
  "id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e99fce29-d3a0-43e2-85e7-24796003d1e6",
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
  "created_at": "2026-10-27T19:18:25.816199Z",
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
    "id": "efed69d1-d2a6-45ce-9057-85806c731303",
    "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
    "expires_at": "2026-10-27T19:18:40.819893Z",
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

`POST /api/driver/v1/offers/efed69d1-d2a6-45ce-9057-85806c731303/accept` → **200**

```json
{
  "command_id": "29ceef77-d748-424d-9e6e-ecf9eba7e4ba"
}
```

```json
{
  "id": "7367c8e4-d174-468a-b56c-5af166a49592",
  "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ec5c97b7-37a5-4f11-a06e-83e836aad791",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ec5c97b7-37a5-4f11-a06e-83e836aad791",
  "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "assignment_id": "7367c8e4-d174-468a-b56c-5af166a49592",
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

`POST /api/driver/v1/trips/ec5c97b7-37a5-4f11-a06e-83e836aad791/cancel` → **200**

```json
{
  "command_id": "c1d42691-f738-4a8a-b7ec-e54bb143f0ab",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "ec5c97b7-37a5-4f11-a06e-83e836aad791",
  "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "assignment_id": "7367c8e4-d174-468a-b56c-5af166a49592",
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

`GET /api/rider/v1/orders/788ca4e9-b517-4448-8833-1ef7e0a54f59` → **200**

```json
{
  "id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e99fce29-d3a0-43e2-85e7-24796003d1e6",
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
    "id": "7367c8e4-d174-468a-b56c-5af166a49592",
    "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ec5c97b7-37a5-4f11-a06e-83e836aad791",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:18:25.816199Z",
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
    "id": "8107dc1f-4625-4540-a7d6-476e7a9b1e19",
    "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
    "expires_at": "2026-10-27T19:18:40.942491Z",
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

`POST /api/driver/v1/offers/8107dc1f-4625-4540-a7d6-476e7a9b1e19/accept` → **200**

```json
{
  "command_id": "12d0b872-c374-407d-ad4c-d4a40ca156c1"
}
```

```json
{
  "id": "9e493e8f-d408-4a0e-8a4f-c713d7c09f07",
  "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8eae023d-ab04-4980-8c57-9758191b8929",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8eae023d-ab04-4980-8c57-9758191b8929",
  "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "assignment_id": "9e493e8f-d408-4a0e-8a4f-c713d7c09f07",
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

`POST /api/driver/v1/trips/8eae023d-ab04-4980-8c57-9758191b8929/cancel` → **200**

```json
{
  "command_id": "5a5f9485-b418-4ddc-b579-42d5859c508d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "8eae023d-ab04-4980-8c57-9758191b8929",
  "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
  "assignment_id": "9e493e8f-d408-4a0e-8a4f-c713d7c09f07",
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
    "id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:18:25.816199Z",
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
    "id": "0818379c-3aa6-4962-80ae-20e42c445b71",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:18:25.455144Z",
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

`GET /api/operator/v1/orders/788ca4e9-b517-4448-8833-1ef7e0a54f59/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:18:25.816742Z",
      "actor": {
        "type": "CLIENT",
        "id": "e99fce29-d3a0-43e2-85e7-24796003d1e6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
        "quote_id": "085347fa-8db6-4bd4-8865-32c8e3baad16",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:18:25.818897Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
        "attempt_id": "4e02020c-11c2-44de-ac7c-ce0dc4b81ca1",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:18:25.823846Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "efed69d1-d2a6-45ce-9057-85806c731303",
        "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:18:25.876953Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "efed69d1-d2a6-45ce-9057-85806c731303",
        "order_id": "788ca4e9-b517-4448-8833-1ef7e0a54f59",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "7367c8e4-d174-468a-b56c-5af166a49592"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 0818379c-3aa6-4962-80ae-20e42c445b71, 788ca4e9-b517-4448-8833-1ef7e0a54f59.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738159666",
  "device_ref": "sandbox-14299"
}
```

```json
{
  "challenge_id": "a733de09-9ce4-4709-9477-90ffc3dcc5b2",
  "expires_at": "2026-10-27T19:23:26.173736858Z",
  "resend_available_at": "2026-10-27T19:18:27.173736858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738159666` → **200**

```json
{
  "phone": "+380738159666",
  "audience": "CLIENT",
  "code": "988070",
  "sent_at": "2026-10-27T19:18:26.176106334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a733de09-9ce4-4709-9477-90ffc3dcc5b2",
  "code": "988070",
  "device_ref": "sandbox-14299"
}
```

```json
{
  "session_id": "bb10cbc2-be2b-4fa5-872a-af6edd868b19",
  "subject": {
    "type": "CLIENT",
    "id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOWNhZWNjZi0zNmI5LTQzYTEtOTFlZS1jZTQyMmQxNmZjMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjA2LCJpYXQiOjE3OTMxMjg3MDYsImp0aSI6ImVjZGQyNTQ3LWViYTYtNGVjZi05NjMwLWFkMGY0Mzg0ZDI4YiIsInNpZCI6ImJiMTBjYmMyLWJlMmItNGZhNS04NzJhLWFmNmVkZDg2OGIxOSJ9._OMHfqV5ZfiNa2ObaLG7b2HQTcIrysa-bnSi8FTWCII",
  "access_expires_at": "2026-10-27T19:33:26.227312305Z",
  "refresh_token": "IPZDuj-4snOLpDwuYIpya8yLuK5qmIAEvDZxjfDJR_w",
  "refresh_expires_at": "2026-11-26T19:18:26.226693411Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "199f1cc2-51f2-4fa5-a18d-54d4a74cb08e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "65235d56-137d-42ce-8839-8a49903458ff",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-65235d56-137d-42ce-8839-8a49903458ff",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "92e53c7bd49c5bc6e56388b67f586bad",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=65235d56-137d-42ce-8839-8a49903458ff",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738159666"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=65235d56-137d-42ce-8839-8a49903458ff",
  "expires_at": "2026-10-27T19:48:26.259485Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/65235d56-137d-42ce-8839-8a49903458ff` → **200**

```json
{
  "id": "65235d56-137d-42ce-8839-8a49903458ff",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T19:48:26.259485Z",
  "card": {
    "id": "065f45be-b222-4b15-a717-ad92507da2ff",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6289",
    "card_type": "Visa",
    "created_at": "2026-10-27T19:18:26.299361Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "065f45be-b222-4b15-a717-ad92507da2ff",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6289",
      "card_type": "Visa",
      "created_at": "2026-10-27T19:18:26.299361Z"
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
  "device_ref": "sandbox-22349"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "3f89522e-b2b4-452c-bc0b-2e260b5b2bba",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22349"
}
```

```json
{
  "challenge_id": "02e0a06b-ae08-4f68-acbc-c8cf97edaa6f",
  "expires_at": "2026-10-27T19:23:27.398054684Z",
  "resend_available_at": "2026-10-27T19:18:28.398054684Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "790283",
  "sent_at": "2026-10-27T19:18:27.400517391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02e0a06b-ae08-4f68-acbc-c8cf97edaa6f",
  "code": "790283",
  "device_ref": "sandbox-22349"
}
```

```json
{
  "session_id": "181b3e19-b424-463e-adc4-a4abaab89a67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYwNywiaWF0IjoxNzkzMTI4NzA3LCJqdGkiOiJhNmU2ZTA0Yi1mZDYxLTRmODUtYjVhMC1kYTZmOTNmYmU4MGYiLCJzaWQiOiIxODFiM2UxOS1iNDI0LTQ2M2UtYWRjNC1hNGFiYWFiODlhNjcifQ.HzOz50ianjIf7Bu1nmtSDEZbfq9VYA6TQPe4Tv5AhpA",
  "access_expires_at": "2026-10-27T19:33:27.450832097Z",
  "refresh_token": "dGehHePr8XAoSu18HevHIabVBZI1JZDit7tURZFnA-I",
  "refresh_expires_at": "2026-11-26T19:18:27.450321677Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "95a11f19-2b2c-4cd7-8c58-76721775a1f1",
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
  "last_heartbeat_at": "2026-10-27T19:18:25.746443Z",
  "last_location_at": "2026-10-27T19:18:25.746443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/95a11f19-2b2c-4cd7-8c58-76721775a1f1/handover` → **200**

```json
{
  "command_id": "9d9508fe-e0d0-4750-a10a-9e7694f8de10",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "95a11f19-2b2c-4cd7-8c58-76721775a1f1",
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
  "last_heartbeat_at": "2026-10-27T19:18:25.746443Z",
  "last_location_at": "2026-10-27T19:18:25.746443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/95a11f19-2b2c-4cd7-8c58-76721775a1f1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:27Z",
    "sequence": 1793128707530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "95a11f19-2b2c-4cd7-8c58-76721775a1f1",
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
  "last_heartbeat_at": "2026-10-27T19:18:27.547926Z",
  "last_location_at": "2026-10-27T19:18:27.547926Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c8a8fc2-bd43-41a9-ab97-1b3684f4ee48",
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
  "id": "4c9defb6-9e40-40d4-be17-fd1ef4ebfb98",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T19:23:27.580386Z",
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
  "command_id": "6bd99fc0-02c1-427a-9a48-b891e1572085",
  "quote_id": "4c9defb6-9e40-40d4-be17-fd1ef4ebfb98",
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
  "id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b",
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
  "created_at": "2026-10-27T19:18:27.615667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7` → **200**

```json
{
  "id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b",
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
  "created_at": "2026-10-27T19:18:27.615667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7` → **200**

```json
{
  "id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b",
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
  "created_at": "2026-10-27T19:18:27.615667Z",
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
    "id": "e15396f9-66fa-4dfa-8b4d-fc697e3d7bbf",
    "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
    "expires_at": "2026-10-27T19:18:43.545958Z",
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

`POST /api/driver/v1/offers/e15396f9-66fa-4dfa-8b4d-fc697e3d7bbf/accept` → **200**

```json
{
  "command_id": "ca4ea338-387c-433a-8d86-742133d96a2c"
}
```

```json
{
  "id": "954e2c68-6f74-4c35-9fe0-efc778702601",
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "236fab73-973e-423f-9f65-399feb601a85",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "236fab73-973e-423f-9f65-399feb601a85",
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "assignment_id": "954e2c68-6f74-4c35-9fe0-efc778702601",
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

`POST /api/driver/v1/work-sessions/95a11f19-2b2c-4cd7-8c58-76721775a1f1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:28Z",
    "sequence": 1793128708766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "95a11f19-2b2c-4cd7-8c58-76721775a1f1",
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
  "last_heartbeat_at": "2026-10-27T19:18:28.784035Z",
  "last_location_at": "2026-10-27T19:18:28.784035Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/236fab73-973e-423f-9f65-399feb601a85/arrive` → **200**

```json
{
  "command_id": "c166668b-efe2-44c0-8a86-1ba078a0dbab",
  "expected_version": 0
}
```

```json
{
  "id": "236fab73-973e-423f-9f65-399feb601a85",
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "assignment_id": "954e2c68-6f74-4c35-9fe0-efc778702601",
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
  "arrived_at": "2026-10-27T19:18:28.816363Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/236fab73-973e-423f-9f65-399feb601a85/start` → **200**

```json
{
  "command_id": "3de3aebf-aaf8-4078-9ddc-d2afe4c5f094",
  "expected_version": 1
}
```

```json
{
  "id": "236fab73-973e-423f-9f65-399feb601a85",
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "assignment_id": "954e2c68-6f74-4c35-9fe0-efc778702601",
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
  "arrived_at": "2026-10-27T19:18:28.816363Z",
  "started_at": "2026-10-27T19:18:28.852011Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/236fab73-973e-423f-9f65-399feb601a85/complete` → **200**

```json
{
  "command_id": "ca97284d-5efb-4662-8387-be34fbb5f7cf",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:18:28Z"
}
```

```json
{
  "id": "236fab73-973e-423f-9f65-399feb601a85",
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "assignment_id": "954e2c68-6f74-4c35-9fe0-efc778702601",
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
  "arrived_at": "2026-10-27T19:18:28.816363Z",
  "started_at": "2026-10-27T19:18:28.852011Z",
  "completed_at": "2026-10-27T19:18:28.893423Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7` → **200**

```json
{
  "id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b",
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
    "id": "954e2c68-6f74-4c35-9fe0-efc778702601",
    "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "236fab73-973e-423f-9f65-399feb601a85",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:18:27.615667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7` → **200**

```json
{
  "id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b",
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
    "id": "954e2c68-6f74-4c35-9fe0-efc778702601",
    "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "236fab73-973e-423f-9f65-399feb601a85",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:18:27.615667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7` → **200**

```json
{
  "id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b",
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
    "id": "954e2c68-6f74-4c35-9fe0-efc778702601",
    "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "236fab73-973e-423f-9f65-399feb601a85",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:18:27.615667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7` → **200**

```json
{
  "id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e9caeccf-36b9-43a1-91ee-ce422d16fc0b",
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
    "id": "954e2c68-6f74-4c35-9fe0-efc778702601",
    "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "236fab73-973e-423f-9f65-399feb601a85",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:18:27.615667Z",
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
      "id": "055850a9-aceb-475b-845a-84ca2836481e",
      "at": "2026-10-27T19:18:29.568064Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7/tip` → **200**

```json
{
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
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
  "available_until": "2026-10-28T19:18:28.893423Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7/tip` → **201**

```json
{
  "command_id": "7c105394-a27c-4e07-ac72-e0ee6ff4b8e7",
  "amount_minor": 2500
}
```

```json
{
  "id": "5d563a67-0df2-47d6-8a2f-25fe1a204d3e",
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T19:18:32.107515Z"
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7/tip` → **200**

```json
{
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
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
  "available_until": "2026-10-28T19:18:28.893423Z",
  "open": false,
  "tip": {
    "id": "5d563a67-0df2-47d6-8a2f-25fe1a204d3e",
    "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T19:18:32.107515Z"
  }
}
```

`GET /api/rider/v1/orders/1230d1ba-8fda-45dd-88d6-72f092002db7/tip` → **200**

```json
{
  "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
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
  "available_until": "2026-10-28T19:18:28.893423Z",
  "open": false,
  "tip": {
    "id": "5d563a67-0df2-47d6-8a2f-25fe1a204d3e",
    "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T19:18:32.107515Z"
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
      "id": "055850a9-aceb-475b-845a-84ca2836481e",
      "at": "2026-10-27T19:18:29.568064Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
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
      "id": "1cb26ab8-7c33-4f9c-b8bd-b2d15f0d86ab",
      "at": "2026-10-27T19:18:33.616602Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
      "counterpart_id": null
    },
    {
      "id": "055850a9-aceb-475b-845a-84ca2836481e",
      "at": "2026-10-27T19:18:29.568064Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1230d1ba-8fda-45dd-88d6-72f092002db7",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "95a11f19-2b2c-4cd7-8c58-76721775a1f1",
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
  "last_heartbeat_at": "2026-10-27T19:18:28.784035Z",
  "last_location_at": "2026-10-27T19:18:28.784035Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/95a11f19-2b2c-4cd7-8c58-76721775a1f1/close` → **200**

```json
{
  "command_id": "42c15f5d-2994-428e-b9d8-0ce761899af0",
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

Done: card order 1230d1ba-8fda-45dd-88d6-72f092002db7.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733676667",
  "device_ref": "sandbox-31559"
}
```

```json
{
  "challenge_id": "ce428664-8710-420f-889f-b5df7819bf99",
  "expires_at": "2026-10-27T19:23:34.295564859Z",
  "resend_available_at": "2026-10-27T19:18:35.295564859Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733676667` → **200**

```json
{
  "phone": "+380733676667",
  "audience": "CLIENT",
  "code": "605598",
  "sent_at": "2026-10-27T19:18:34.327984826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce428664-8710-420f-889f-b5df7819bf99",
  "code": "605598",
  "device_ref": "sandbox-31559"
}
```

```json
{
  "session_id": "c6e726cd-bb5b-4beb-84ac-59fb046d09af",
  "subject": {
    "type": "CLIENT",
    "id": "40bf659f-0b68-480a-b816-29d1b6b97d3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGJmNjU5Zi0wYjY4LTQ4MGEtYjgxNi0yOWQxYjZiOTdkM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjE0LCJpYXQiOjE3OTMxMjg3MTQsImp0aSI6IjU5ZTI2M2U2LTBhNzctNDYyNC1hNTUxLWRjMDc1Zjg2ZGJmZiIsInNpZCI6ImM2ZTcyNmNkLWJiNWItNGJlYi04NGFjLTU5ZmIwNDZkMDlhZiJ9.33gYLQW_ikqtms9ASDvodw3rcbCzMFZxeF2oPIiXXTg",
  "access_expires_at": "2026-10-27T19:33:34.377422127Z",
  "refresh_token": "b_jnsX_zTx1tB5GjB1g3BMRGGCQFDEJFDvwv8CMQmAg",
  "refresh_expires_at": "2026-11-26T19:18:34.37694688Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "198a3b1e-4441-499e-8034-463f7388b551",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "d53bec7d-9894-4281-ba44-0953e0ea0234",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d53bec7d-9894-4281-ba44-0953e0ea0234",
    "orderDate": "1793128714",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "0cad03225fb41faaf8a7e48a1e85e094",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d53bec7d-9894-4281-ba44-0953e0ea0234",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733676667"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d53bec7d-9894-4281-ba44-0953e0ea0234",
  "created_at": "2026-10-27T19:18:34.409253Z",
  "expires_at": "2026-10-27T19:48:34.409253Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/d53bec7d-9894-4281-ba44-0953e0ea0234` → **200**

```json
{
  "id": "d53bec7d-9894-4281-ba44-0953e0ea0234",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:18:34.409253Z",
  "expires_at": "2026-10-27T19:48:34.409253Z",
  "completed_at": "2026-10-27T19:18:34.442678Z",
  "masked_pan": "41****8311",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "40bf659f-0b68-480a-b816-29d1b6b97d3c",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "40bf659f-0b68-480a-b816-29d1b6b97d3c",
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
      "id": "ec0ef590-eded-48ff-bda2-9aa6bb953312",
      "at": "2026-10-27T19:18:34.626439Z",
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
  "client_id": "40bf659f-0b68-480a-b816-29d1b6b97d3c",
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
      "id": "ec0ef590-eded-48ff-bda2-9aa6bb953312",
      "at": "2026-10-27T19:18:34.626439Z",
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
  "device_ref": "sandbox-9599"
}
```

```json
{
  "challenge_id": "96fd6dbb-7fca-408b-98f6-ceb59b73244b",
  "expires_at": "2026-10-27T19:23:35.558238389Z",
  "resend_available_at": "2026-10-27T19:18:36.558238389Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "677063",
  "sent_at": "2026-10-27T19:18:35.560633072Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96fd6dbb-7fca-408b-98f6-ceb59b73244b",
  "code": "677063",
  "device_ref": "sandbox-9599"
}
```

```json
{
  "session_id": "955f1c99-4b77-41d0-81eb-4edb27b44f14",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYxNSwiaWF0IjoxNzkzMTI4NzE1LCJqdGkiOiJlZDQ4NDZiMC01NGVkLTQzODgtYjY3ZC1kNWE1MGNlZjA1ZDgiLCJzaWQiOiI5NTVmMWM5OS00Yjc3LTQxZDAtODFlYi00ZWRiMjdiNDRmMTQifQ.gry1Uyw-70wOKCNhFiec7uChMRgbjb8maXBZxyrYLZ4",
  "access_expires_at": "2026-10-27T19:33:35.61098945Z",
  "refresh_token": "Pu5jpBvc-P93luN4eKN1KOICJ98mE1JCMuMkEJ60OgM",
  "refresh_expires_at": "2026-11-26T19:18:35.610509576Z",
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
  "command_id": "7aed3965-83dd-4290-a2c4-362e3ed04adc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "d69da8e2-8414-49e6-a51e-5dc47e0d3b7f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d69da8e2-8414-49e6-a51e-5dc47e0d3b7f",
    "orderDate": "1793128715",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "b909a9b67f2df1db4b454e69dbd97504",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d69da8e2-8414-49e6-a51e-5dc47e0d3b7f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d69da8e2-8414-49e6-a51e-5dc47e0d3b7f",
  "created_at": "2026-10-27T19:18:35.660161Z",
  "expires_at": "2026-10-27T19:48:35.660161Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/d69da8e2-8414-49e6-a51e-5dc47e0d3b7f` → **200**

```json
{
  "id": "d69da8e2-8414-49e6-a51e-5dc47e0d3b7f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:18:35.660161Z",
  "expires_at": "2026-10-27T19:48:35.660161Z",
  "completed_at": "2026-10-27T19:18:35.688465Z",
  "masked_pan": "41****6381",
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
      "id": "33b9a492-6fd6-4aa3-a3ce-85c040afe323",
      "at": "2026-10-27T19:18:36.636505Z",
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
  "command_id": "40af170c-8acd-4b8e-bdac-11b36cc9c9f9",
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
  "correlation_id": "565897e5-75eb-4c48-9752-f88293d192b4"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672467412",
  "device_ref": "sandbox-1690"
}
```

```json
{
  "challenge_id": "573ba013-bb30-47d4-a93f-217499576908",
  "expires_at": "2026-10-27T19:23:36.815032498Z",
  "resend_available_at": "2026-10-27T19:18:37.815032498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672467412` → **200**

```json
{
  "phone": "+380672467412",
  "audience": "CLIENT",
  "code": "317241",
  "sent_at": "2026-10-27T19:18:36.817386199Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "573ba013-bb30-47d4-a93f-217499576908",
  "code": "317241",
  "device_ref": "sandbox-1690"
}
```

```json
{
  "session_id": "b429c754-181f-4c99-b499-685c8f1e8e28",
  "subject": {
    "type": "CLIENT",
    "id": "be1a1ff0-46fa-475c-bb2f-b53a21163c22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTFhMWZmMC00NmZhLTQ3NWMtYmIyZi1iNTNhMjExNjNjMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjE2LCJpYXQiOjE3OTMxMjg3MTYsImp0aSI6ImJhYzc4ZDlmLWY1NzAtNGM3OC1iMmExLWQwYmFmMzkwNzNjNiIsInNpZCI6ImI0MjljNzU0LTE4MWYtNGM5OS1iNDk5LTY4NWM4ZjFlOGUyOCJ9.06mKC2MLRpA8_WdH8MXxxHq8cA49hFbquRNxwcJYeJg",
  "access_expires_at": "2026-10-27T19:33:36.866400261Z",
  "refresh_token": "fDb-Qo3w9RZt2r7WIEvlUdUKTf-wwZNDQpA_OXM_v8g",
  "refresh_expires_at": "2026-11-26T19:18:36.865888229Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "be1a1ff0-46fa-475c-bb2f-b53a21163c22",
  "session_id": "b429c754-181f-4c99-b499-685c8f1e8e28",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4bad36c1-0210-4413-8a8f-049162e2321a",
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
  "id": "1a18b2cc-d80d-4d67-90f6-0ab5797da6b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:36.918931Z",
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
  "challenge_id": "0101b680-7f02-4d36-8a00-881aaee7a6f8",
  "expires_at": "2026-10-27T19:23:38.961933044Z",
  "resend_available_at": "2026-10-27T19:18:39.961933044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672467412` → **200**

```json
{
  "phone": "+380672467412",
  "audience": "CLIENT",
  "code": "532190",
  "sent_at": "2026-10-27T19:18:38.964152514Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "6f6ad659-d39e-4c3b-8a21-f331571a0700",
  "challenge_id": "0101b680-7f02-4d36-8a00-881aaee7a6f8",
  "otp_code": "532190"
}
```

```json
{
  "client_id": "be1a1ff0-46fa-475c-bb2f-b53a21163c22",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T19:18:39.025646826Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ebf72810-f909-4bf3-af39-d1957d2826b0",
  "quote_id": "1a18b2cc-d80d-4d67-90f6-0ab5797da6b7",
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
  "correlation_id": "2e1ec949-ac07-45bc-9416-31500b2334e4"
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
  "session_id": "1d639d60-c476-4e7b-9f44-30de8c86d6ea",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MTksImlhdCI6MTc5MzEyODcxOSwianRpIjoiMGFiMzYyZjgtZTBjYS00MzhjLTg0YzQtZmQ5NDlkMDUzM2U4Iiwic2lkIjoiMWQ2MzlkNjAtYzQ3Ni00ZTdiLTlmNDQtMzBkZThjODZkNmVhIn0.OSHdtakrOInMycMgyoTXuixQv70WoR89XXHCWymcOuk",
  "access_expires_at": "2026-10-27T19:33:39.346577448Z",
  "refresh_token": "H2QF3oLzndQRpDsSnj4w80xpiSn_VqlQYLfWrrxzb0c",
  "refresh_expires_at": "2026-10-28T07:18:39.346152066Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "be1a1ff0-46fa-475c-bb2f-b53a21163c22",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T19:18:39.025647Z",
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

`POST /api/admin/v1/client-deletions/be1a1ff0-46fa-475c-bb2f-b53a21163c22/complete` → **200**

```json
{
  "command_id": "e5417c79-9a21-420e-b007-deb8c9b6ed41",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "be1a1ff0-46fa-475c-bb2f-b53a21163c22",
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
  "correlation_id": "e52a53fd-4aca-48d2-945d-f75b9caedeb2"
}
```

Done: client be1a1ff0-46fa-475c-bb2f-b53a21163c22 anonymized.

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
  "device_ref": "sandbox-19574"
}
```

```json
{
  "challenge_id": "a35ca817-9e99-4d32-8b92-207bbcade40a",
  "expires_at": "2026-10-27T19:23:39.502846168Z",
  "resend_available_at": "2026-10-27T19:18:40.502846168Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "537944",
  "sent_at": "2026-10-27T19:18:39.504977273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a35ca817-9e99-4d32-8b92-207bbcade40a",
  "code": "537944",
  "device_ref": "sandbox-19574"
}
```

```json
{
  "session_id": "7802d9f6-41b2-437b-83e7-11176151eb01",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYxOSwiaWF0IjoxNzkzMTI4NzE5LCJqdGkiOiJmNzEwNzExZi03MGVjLTRiYWMtOGNhNS0zOTY4ZmQ4MDk0NmQiLCJzaWQiOiI3ODAyZDlmNi00MWIyLTQzN2ItODNlNy0xMTE3NjE1MWViMDEifQ.FjpG8Vpm1FLHTdwJN0hz1ZNmr_WcqXNNSxVeWSWDKVg",
  "access_expires_at": "2026-10-27T19:33:39.554444069Z",
  "refresh_token": "DASr_ooNhbq4fAWjCXO_yp7jnxvklKgZlchgPc7CDFk",
  "refresh_expires_at": "2026-11-26T19:18:39.553854389Z",
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
  "command_id": "745f38b3-4ba9-44b1-8bed-30a931200b74",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:39Z",
    "sequence": 1793128719599
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:39.614599Z",
  "last_location_at": "2026-10-27T19:18:39.614599Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673688399",
  "device_ref": "sandbox-14748"
}
```

```json
{
  "challenge_id": "3b0e991a-ee29-442f-aaaa-b4e937e7779b",
  "expires_at": "2026-10-27T19:23:39.642239916Z",
  "resend_available_at": "2026-10-27T19:18:40.642239916Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673688399` → **200**

```json
{
  "phone": "+380673688399",
  "audience": "CLIENT",
  "code": "425532",
  "sent_at": "2026-10-27T19:18:39.644169407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b0e991a-ee29-442f-aaaa-b4e937e7779b",
  "code": "425532",
  "device_ref": "sandbox-14748"
}
```

```json
{
  "session_id": "d4ca5e4d-a4f9-457f-badc-9b29b5ea13cd",
  "subject": {
    "type": "CLIENT",
    "id": "53d67e14-f1f2-4e77-b0e1-f341ce99824c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2Q2N2UxNC1mMWYyLTRlNzctYjBlMS1mMzQxY2U5OTgyNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjE5LCJpYXQiOjE3OTMxMjg3MTksImp0aSI6ImZjYTFmN2ZiLWRlNzItNDBmYS1iMjZjLThiMDEyMjMyMThlNSIsInNpZCI6ImQ0Y2E1ZTRkLWE0ZjktNDU3Zi1iYWRjLTliMjliNWVhMTNjZCJ9.8AnUQqxMDavnhi9ENnysTN1LKywYFFPeF1BXgqJtIgM",
  "access_expires_at": "2026-10-27T19:33:39.695846297Z",
  "refresh_token": "V_Y6xy7KScUN6MiCR88JGZwloiU0mA0tPj-N57Rmdeo",
  "refresh_expires_at": "2026-11-26T19:18:39.695360935Z",
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
  "command_id": "11d21f7d-8b32-45ca-bb03-f59460f6793b",
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
  "id": "3f9f1fcd-3af9-4262-bdd3-94cf45a5f4d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:39.752289Z",
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
  "command_id": "a52af607-9bcb-4900-8a34-fca1a4e61ac9",
  "platform": "ANDROID",
  "token": "sandbox-driver-e7893da4-43bc-4ae4-a9dc-4d2dd12a86b1"
}
```

```json
{
  "id": "0898269c-2acd-4116-a886-19dc7a423b51",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:18:39.79017Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "a403004f-7795-4072-bdc0-8dabe3ea696c",
  "platform": "ANDROID",
  "token": "sandbox-rider-d2dfa35d-65e0-41a3-860c-9cce945526ef"
}
```

```json
{
  "id": "68080db2-4693-49e5-9d64-4472bcadb4d9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:18:39.821439Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "63706270-6bd9-421b-822f-b1de9d1504df",
  "quote_id": "3f9f1fcd-3af9-4262-bdd3-94cf45a5f4d4",
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
  "id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53d67e14-f1f2-4e77-b0e1-f341ce99824c",
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
  "created_at": "2026-10-27T19:18:39.859265Z",
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
    "id": "2ef9f3ab-9c77-450e-9378-78e8733d662a",
    "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
    "expires_at": "2026-10-27T19:18:54.862935Z",
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

`POST /api/driver/v1/offers/2ef9f3ab-9c77-450e-9378-78e8733d662a/accept` → **200**

```json
{
  "command_id": "d2671307-e7e3-4802-ba6d-19a0772c0713"
}
```

```json
{
  "id": "62977377-e33b-4877-86ea-823fea0de0eb",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fca49f12-eb86-413a-bfa0-04cc96791898",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:18:39.838Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:18:39.838Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:18:39.838Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:18:41.441496575Z",
    "token_suffix": "2a86b1",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
      "order_version": "2",
      "event_id": "a4c78573-6e17-417c-a758-ec921165396d",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673688399&after=2026-10-27T19:18:39.838Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:18:41.442929858Z",
    "token_suffix": "5526ef",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
      "order_version": "3",
      "event_id": "06b3a80a-dc52-48e8-bedc-562b27336cda",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a964e1e2-4061-4d2e-bce6-006abcc159e4/messages` → **201**

```json
{
  "command_id": "875ba184-3c23-4f5d-8af8-f94d4034fcda",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "594b1d41-bb8c-43d4-bcdc-4eba54dbbba5",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T19:18:42.051424758Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fca49f12-eb86-413a-bfa0-04cc96791898",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "assignment_id": "62977377-e33b-4877-86ea-823fea0de0eb",
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

`POST /api/driver/v1/trips/fca49f12-eb86-413a-bfa0-04cc96791898/messages` → **201**

```json
{
  "command_id": "19f6bd8c-8b22-4065-a35d-d8a36ca9be23",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "b9f2e912-e935-44ab-9364-1a2c4b2e0886",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T19:18:42.097279478Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a964e1e2-4061-4d2e-bce6-006abcc159e4/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/fca49f12-eb86-413a-bfa0-04cc96791898/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673688399"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:42Z",
    "sequence": 1793128722164
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:42.181269Z",
  "last_location_at": "2026-10-27T19:18:42.181269Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fca49f12-eb86-413a-bfa0-04cc96791898",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "assignment_id": "62977377-e33b-4877-86ea-823fea0de0eb",
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

`POST /api/driver/v1/trips/fca49f12-eb86-413a-bfa0-04cc96791898/arrive` → **200**

```json
{
  "command_id": "45106469-4361-40a8-addb-7554093a019a",
  "expected_version": 0
}
```

```json
{
  "id": "fca49f12-eb86-413a-bfa0-04cc96791898",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "assignment_id": "62977377-e33b-4877-86ea-823fea0de0eb",
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
  "arrived_at": "2026-10-27T19:18:42.226945Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fca49f12-eb86-413a-bfa0-04cc96791898/start` → **200**

```json
{
  "command_id": "ea84bf9a-a77e-4fc7-8b52-0f0f051769cc",
  "expected_version": 1
}
```

```json
{
  "id": "fca49f12-eb86-413a-bfa0-04cc96791898",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "assignment_id": "62977377-e33b-4877-86ea-823fea0de0eb",
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
  "arrived_at": "2026-10-27T19:18:42.226945Z",
  "started_at": "2026-10-27T19:18:42.25687Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:42Z",
    "sequence": 1793128722277
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:42.293164Z",
  "last_location_at": "2026-10-27T19:18:42.293164Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/fca49f12-eb86-413a-bfa0-04cc96791898/complete` → **200**

```json
{
  "command_id": "5bb9f930-b238-46c1-b2cc-5a946013df02",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:18:42Z",
  "cash_received": true
}
```

```json
{
  "id": "fca49f12-eb86-413a-bfa0-04cc96791898",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "assignment_id": "62977377-e33b-4877-86ea-823fea0de0eb",
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
  "arrived_at": "2026-10-27T19:18:42.226945Z",
  "started_at": "2026-10-27T19:18:42.25687Z",
  "completed_at": "2026-10-27T19:18:42.324116Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a964e1e2-4061-4d2e-bce6-006abcc159e4` → **200**

```json
{
  "id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "53d67e14-f1f2-4e77-b0e1-f341ce99824c",
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
    "id": "62977377-e33b-4877-86ea-823fea0de0eb",
    "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fca49f12-eb86-413a-bfa0-04cc96791898",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:18:39.859265Z",
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
    "id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:18:39.859265Z",
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
    "id": "fca49f12-eb86-413a-bfa0-04cc96791898",
    "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
    "order_short_number": 5,
    "created_at": "2026-10-27T19:18:39.92122Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c78e12c8-783d-45e1-923b-b29dc282b304",
    "order_id": "782beb1f-b55f-4f73-adc3-7d9a8ea80e72",
    "order_short_number": 1,
    "created_at": "2026-10-27T19:18:21.192658Z",
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

`GET /api/rider/v1/orders/a964e1e2-4061-4d2e-bce6-006abcc159e4/tip` → **200**

```json
{
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
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
  "available_until": "2026-10-28T19:18:42.324116Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a964e1e2-4061-4d2e-bce6-006abcc159e4/tip` → **201**

```json
{
  "command_id": "28ef6af6-10dd-4019-8149-682f6a66ff3c",
  "amount_minor": 1100
}
```

```json
{
  "id": "16d4fbad-404e-40a3-80a0-60332734dee9",
  "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T19:18:45.512816Z"
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
  "session_id": "3f9cc3b7-966c-4844-bb86-69df6aba83e6",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MjUsImlhdCI6MTc5MzEyODcyNSwianRpIjoiOTk2ZGE4MDEtZGRhNi00MGJkLWEwZmEtMDk0NjU5ODEzNDhhIiwic2lkIjoiM2Y5Y2MzYjctOTY2Yy00ODQ0LWJiODYtNjlkZjZhYmE4M2U2In0.m_6hXpBknJHQAwmHOJJ_InQlChnSc2lBXFJzvt4g7h0",
  "access_expires_at": "2026-10-27T19:33:45.802171297Z",
  "refresh_token": "zxo7tiNSmvytfJ8Q9Z8841Ek4C2u1BtJrjNjc9ww4TY",
  "refresh_expires_at": "2026-10-28T07:18:45.801749831Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "counts": {
        "created": 5,
        "fulfilled": 3,
        "cancelled": 2,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 5
        },
        "by_payment": {
          "CASH": 4,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 1
        }
      }
    }
  ],
  "total": {
    "created": 5,
    "fulfilled": 3,
    "cancelled": 2,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 5
    },
    "by_payment": {
      "CASH": 4,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 1
    }
  },
  "cancellation_reasons": [
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
  ]
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
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
  "session_id": "6e792300-2eb0-4d95-99c0-8b5bbd2c4283",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MjYsImlhdCI6MTc5MzEyODcyNiwianRpIjoiZTVjNjc0YmQtY2I0My00YzRmLTlhZDQtYzE3ZmM0MDA1ZTkyIiwic2lkIjoiNmU3OTIzMDAtMmViMC00ZDk1LTk5YzAtOGI1YmJkMmM0MjgzIn0.KU4unLVoBgYTP3tlBd2ubF15AOKMHkWk3G6_3wHj8i4",
  "access_expires_at": "2026-10-27T19:33:46.146014988Z",
  "refresh_token": "9nkr7bGmR1q-nkgKwNci9byGGrF2L-T58avpNBLe9HA",
  "refresh_expires_at": "2026-10-28T07:18:46.145570247Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a964e1e2-4061-4d2e-bce6-006abcc159e4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:18:39.85994Z",
      "actor": {
        "type": "CLIENT",
        "id": "53d67e14-f1f2-4e77-b0e1-f341ce99824c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
        "quote_id": "3f9f1fcd-3af9-4262-bdd3-94cf45a5f4d4",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:18:39.861959Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
        "attempt_id": "0c21f275-563a-4103-9667-6c21b2f2892a",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:18:39.868346Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2ef9f3ab-9c77-450e-9378-78e8733d662a",
        "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:18:39.92285Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2ef9f3ab-9c77-450e-9378-78e8733d662a",
        "order_id": "a964e1e2-4061-4d2e-bce6-006abcc159e4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "62977377-e33b-4877-86ea-823fea0de0eb"
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
  "at": "2026-10-27T19:18:46.192197001Z",
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
      "last_location_at": "2026-10-27T19:18:42.293164Z",
      "order_id": null
    },
    {
      "driver_id": "5a000000-0000-4000-8000-000000000402",
      "name": "Олег Коваль",
      "car": {
        "registration_number": "AA0002TX",
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "STALE",
      "geolocation": "STALE",
      "location": {
        "lat": 50.459,
        "lon": 30.5238
      },
      "last_location_at": "2026-10-27T19:18:25.592266Z",
      "order_id": null
    }
  ]
}
```

Done: order a964e1e2-4061-4d2e-bce6-006abcc159e4.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22252"
}
```

```json
{
  "challenge_id": "34aa13fa-95f8-49da-97b3-be5715031a41",
  "expires_at": "2026-10-27T19:23:46.231196034Z",
  "resend_available_at": "2026-10-27T19:18:47.231196034Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "763346",
  "sent_at": "2026-10-27T19:18:46.233377345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34aa13fa-95f8-49da-97b3-be5715031a41",
  "code": "763346",
  "device_ref": "sandbox-22252"
}
```

```json
{
  "session_id": "7cd0c44f-00d8-4e71-82f0-9dc1f1b53843",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYyNiwiaWF0IjoxNzkzMTI4NzI2LCJqdGkiOiIzYTZiNDc3MC03N2JjLTQ2NTctOTBkYi0yMTYzYzAyOTE0OGMiLCJzaWQiOiI3Y2QwYzQ0Zi0wMGQ4LTRlNzEtODJmMC05ZGMxZjFiNTM4NDMifQ.SlEQo_1GnNmNMm8zIwH55R7jyZ0sbEcZ3j4iEsL2Yj8",
  "access_expires_at": "2026-10-27T19:33:46.280906101Z",
  "refresh_token": "HElk7n3Y35q8pX9k95UcNgqopNx3Mb7LTEtcZyL-bUE",
  "refresh_expires_at": "2026-11-26T19:18:46.28045484Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:42.293164Z",
  "last_location_at": "2026-10-27T19:18:42.293164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/handover` → **200**

```json
{
  "command_id": "e13c0615-b8d0-41eb-a745-ca15c33f45b1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:42.293164Z",
  "last_location_at": "2026-10-27T19:18:42.293164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:46Z",
    "sequence": 1793128726354
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:46.370847Z",
  "last_location_at": "2026-10-27T19:18:46.370847Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664088908",
  "device_ref": "sandbox-8598"
}
```

```json
{
  "challenge_id": "d480a021-75f1-4bcf-89df-0a0f1c9c4703",
  "expires_at": "2026-10-27T19:23:46.393836393Z",
  "resend_available_at": "2026-10-27T19:18:47.393836393Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664088908` → **200**

```json
{
  "phone": "+380664088908",
  "audience": "CLIENT",
  "code": "225382",
  "sent_at": "2026-10-27T19:18:46.395922011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d480a021-75f1-4bcf-89df-0a0f1c9c4703",
  "code": "225382",
  "device_ref": "sandbox-8598"
}
```

```json
{
  "session_id": "3299cdad-7498-4b2a-9025-cbbc6dbe0528",
  "subject": {
    "type": "CLIENT",
    "id": "3a32b473-080d-4a66-8f9d-8dfe7454757a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTMyYjQ3My0wODBkLTRhNjYtOGY5ZC04ZGZlNzQ1NDc1N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjI2LCJpYXQiOjE3OTMxMjg3MjYsImp0aSI6Ijk2Mzk2NmQ1LTJkYzAtNDBmNC1iYzI5LWJjMjBiNDIwZDFiZSIsInNpZCI6IjMyOTljZGFkLTc0OTgtNGIyYS05MDI1LWNiYmM2ZGJlMDUyOCJ9.A4uwUnTvxDX55wfAZRhtgvX7nUXQJOv1C-ilbFeazPg",
  "access_expires_at": "2026-10-27T19:33:46.446424864Z",
  "refresh_token": "8oNXNfWYNw3h3PghWq2luD9-ZeO-UZTL0oI7v2lMXvk",
  "refresh_expires_at": "2026-11-26T19:18:46.445887593Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28d856cc-382b-4f5d-94df-1ff3a064437e",
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
  "id": "3a7d709a-d623-4d9c-a05a-90a45dc6cc7a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T19:23:46.480647Z",
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
  "command_id": "872e4b33-9e8c-42ec-8455-74a486d2d4e2",
  "quote_id": "3a7d709a-d623-4d9c-a05a-90a45dc6cc7a",
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
  "id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a32b473-080d-4a66-8f9d-8dfe7454757a",
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
  "created_at": "2026-10-27T19:18:46.513417Z",
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
    "id": "3463f600-9f2d-4cde-962a-6846927b884d",
    "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
    "expires_at": "2026-10-27T19:19:01.515799Z",
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

`POST /api/driver/v1/offers/3463f600-9f2d-4cde-962a-6846927b884d/accept` → **200**

```json
{
  "command_id": "939a2aec-2e20-4877-aae3-55a663d22490"
}
```

```json
{
  "id": "ee924474-ff6e-4a3f-9e4a-20de284d3464",
  "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "248e4e47-e483-4e0e-abc3-0bb1c2a941be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "248e4e47-e483-4e0e-abc3-0bb1c2a941be",
  "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
  "assignment_id": "ee924474-ff6e-4a3f-9e4a-20de284d3464",
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

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:46Z",
    "sequence": 1793128726606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:46.622357Z",
  "last_location_at": "2026-10-27T19:18:46.622357Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/248e4e47-e483-4e0e-abc3-0bb1c2a941be/arrive` → **200**

```json
{
  "command_id": "4d33774b-1d7b-4b28-8387-5df435fe1a2b",
  "expected_version": 0
}
```

```json
{
  "id": "248e4e47-e483-4e0e-abc3-0bb1c2a941be",
  "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
  "assignment_id": "ee924474-ff6e-4a3f-9e4a-20de284d3464",
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
  "arrived_at": "2026-10-27T19:18:46.65328Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/248e4e47-e483-4e0e-abc3-0bb1c2a941be/start` → **200**

```json
{
  "command_id": "4202d246-e212-4e71-b8d2-7b31510dfe89",
  "expected_version": 1
}
```

```json
{
  "id": "248e4e47-e483-4e0e-abc3-0bb1c2a941be",
  "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
  "assignment_id": "ee924474-ff6e-4a3f-9e4a-20de284d3464",
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
  "arrived_at": "2026-10-27T19:18:46.65328Z",
  "started_at": "2026-10-27T19:18:46.686455Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:46Z",
    "sequence": 1793128726710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:46.728995Z",
  "last_location_at": "2026-10-27T19:18:46.728995Z",
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
  "device_ref": "sandbox-17831"
}
```

```json
{
  "challenge_id": "bc1a7095-d59e-4d49-a764-7e2ff1c7126b",
  "expires_at": "2026-10-27T19:23:46.750588364Z",
  "resend_available_at": "2026-10-27T19:18:47.750588364Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "019772",
  "sent_at": "2026-10-27T19:18:46.752982497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc1a7095-d59e-4d49-a764-7e2ff1c7126b",
  "code": "019772",
  "device_ref": "sandbox-17831"
}
```

```json
{
  "session_id": "92cf183a-56cd-43b5-ba01-4cccfcfefaa8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYyNiwiaWF0IjoxNzkzMTI4NzI2LCJqdGkiOiI5YmM2MzI3Zi04MTA5LTQxNGItYmEzNy02OTg0NzZkNGYyODciLCJzaWQiOiI5MmNmMTgzYS01NmNkLTQzYjUtYmEwMS00Y2NjZmNmZWZhYTgifQ.ua6d0rmgqLQpfZ1Yd-0wsjYiUmyyKtWxhwJFp-Grslk",
  "access_expires_at": "2026-10-27T19:33:46.801345721Z",
  "refresh_token": "Z-8BncleEZ0tDUsMR_i48ftf37G845uxWPnESFknk3o",
  "refresh_expires_at": "2026-11-26T19:18:46.800858707Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:25.592266Z",
  "last_location_at": "2026-10-27T19:18:25.592266Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8882c5ee-820a-4cb5-baae-eb1390426c64/handover` → **200**

```json
{
  "command_id": "506d3773-3849-4e89-bf0c-20abe6c57d57",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:25.592266Z",
  "last_location_at": "2026-10-27T19:18:25.592266Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8882c5ee-820a-4cb5-baae-eb1390426c64/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:46Z",
    "sequence": 1793128726874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:46.89148Z",
  "last_location_at": "2026-10-27T19:18:46.89148Z",
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
  "session_id": "4263f782-3fff-4dfa-9aa0-731fea45c607",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MjcsImlhdCI6MTc5MzEyODcyNywianRpIjoiN2FkNTUyNTYtODBlNy00NzUwLTg0MmMtNWY0Zjk0ZGJhY2NhIiwic2lkIjoiNDI2M2Y3ODItM2ZmZi00ZGZhLTlhYTAtNzMxZmVhNDVjNjA3In0.B4QsjaQ1U9LLa_9Iasp5fLLCZ2sFbK0D5WhnBB8eMyY",
  "access_expires_at": "2026-10-27T19:33:47.174387266Z",
  "refresh_token": "QtPw8PYRMDcPLGeFWXHiu-KXw0qYHXG8SOC55-gQ7hU",
  "refresh_expires_at": "2026-10-28T07:18:47.173973571Z",
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
  "session_id": "58575c1b-3580-4548-990c-288b11751eb9",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MjcsImlhdCI6MTc5MzEyODcyNywianRpIjoiMDk5YTU4OWYtM2JlNS00ZDhmLWI0MmEtYzNhZTZkMzFhNTFmIiwic2lkIjoiNTg1NzVjMWItMzU4MC00NTQ4LTk5MGMtMjg4YjExNzUxZWI5In0.cXj32S9PQDdO_Tre8yXHcPFYeIibklWwHxQ2McI_HFY",
  "access_expires_at": "2026-10-27T19:33:47.457596464Z",
  "refresh_token": "AS-2B1xqDhuwHKaTbQi_pZVtiVycuW8UWYzRgzlBRqI",
  "refresh_expires_at": "2026-10-28T07:18:47.457137762Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d60d7d7d-06da-48f8-9a9d-a8f9807d4732` → **200**

```json
{
  "id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3a32b473-080d-4a66-8f9d-8dfe7454757a",
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
    "id": "ee924474-ff6e-4a3f-9e4a-20de284d3464",
    "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "248e4e47-e483-4e0e-abc3-0bb1c2a941be",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T19:18:46.513417Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d60d7d7d-06da-48f8-9a9d-a8f9807d4732/interrupt` → **200**

```json
{
  "command_id": "41fe5fae-067f-48af-98f1-7e2404f945bf",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "3a32b473-080d-4a66-8f9d-8dfe7454757a",
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
      "id": "ee924474-ff6e-4a3f-9e4a-20de284d3464",
      "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "248e4e47-e483-4e0e-abc3-0bb1c2a941be",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T19:18:46.513417Z",
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
    "id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "3a32b473-080d-4a66-8f9d-8dfe7454757a",
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
    "id": "c705c404-50e8-46a9-a227-8b9e637350c3",
    "order_id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
    "expires_at": "2026-10-27T19:19:02.533254Z",
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

`POST /api/driver/v1/offers/c705c404-50e8-46a9-a227-8b9e637350c3/accept` → **200**

```json
{
  "command_id": "80623a82-06f8-439f-a3e6-396ef7fb1f44"
}
```

```json
{
  "id": "ae011f2a-bf79-4c23-bb02-e7b8d151fea9",
  "order_id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "22abb149-840c-4f43-8feb-f201c84b05cf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "22abb149-840c-4f43-8feb-f201c84b05cf",
  "order_id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
  "assignment_id": "ae011f2a-bf79-4c23-bb02-e7b8d151fea9",
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
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:46.89148Z",
  "last_location_at": "2026-10-27T19:18:46.89148Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8882c5ee-820a-4cb5-baae-eb1390426c64/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:47Z",
    "sequence": 1793128727656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:47.672982Z",
  "last_location_at": "2026-10-27T19:18:47.672982Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/22abb149-840c-4f43-8feb-f201c84b05cf/arrive` → **200**

```json
{
  "command_id": "147732e9-b28a-413c-8ed1-7125f0cfd2eb",
  "expected_version": 0
}
```

```json
{
  "id": "22abb149-840c-4f43-8feb-f201c84b05cf",
  "order_id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
  "assignment_id": "ae011f2a-bf79-4c23-bb02-e7b8d151fea9",
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
  "arrived_at": "2026-10-27T19:18:47.706593Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/22abb149-840c-4f43-8feb-f201c84b05cf/start` → **200**

```json
{
  "command_id": "67cb1374-cf82-49b3-9ea6-71761fcad006",
  "expected_version": 1
}
```

```json
{
  "id": "22abb149-840c-4f43-8feb-f201c84b05cf",
  "order_id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
  "assignment_id": "ae011f2a-bf79-4c23-bb02-e7b8d151fea9",
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
  "arrived_at": "2026-10-27T19:18:47.706593Z",
  "started_at": "2026-10-27T19:18:47.748216Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/22abb149-840c-4f43-8feb-f201c84b05cf/complete` → **200**

```json
{
  "command_id": "76436f96-f79e-4f08-b659-68e0013bb91c",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:18:47Z"
}
```

```json
{
  "id": "22abb149-840c-4f43-8feb-f201c84b05cf",
  "order_id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
  "assignment_id": "ae011f2a-bf79-4c23-bb02-e7b8d151fea9",
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
  "arrived_at": "2026-10-27T19:18:47.706593Z",
  "started_at": "2026-10-27T19:18:47.748216Z",
  "completed_at": "2026-10-27T19:18:47.787436Z",
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
    "id": "5df1dc39-6ec0-47e1-a989-a8dbae06514b",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:18:47.525309Z",
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
    "id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:18:46.513417Z",
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

`GET /api/operator/v1/orders/d60d7d7d-06da-48f8-9a9d-a8f9807d4732/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:18:46.513838Z",
      "actor": {
        "type": "CLIENT",
        "id": "3a32b473-080d-4a66-8f9d-8dfe7454757a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
        "quote_id": "3a7d709a-d623-4d9c-a05a-90a45dc6cc7a",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:18:46.515229Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
        "attempt_id": "3a75daad-7637-4b24-acf9-1ba5ec59b48a",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:18:46.51944Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3463f600-9f2d-4cde-962a-6846927b884d",
        "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:18:46.57005Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3463f600-9f2d-4cde-962a-6846927b884d",
        "order_id": "d60d7d7d-06da-48f8-9a9d-a8f9807d4732",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ee924474-ff6e-4a3f-9e4a-20de284d3464"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted d60d7d7d-06da-48f8-9a9d-a8f9807d4732, follow-up 5df1dc39-6ec0-47e1-a989-a8dbae06514b.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8887"
}
```

```json
{
  "challenge_id": "62c8435e-6704-413a-b98c-094a1f2d2b04",
  "expires_at": "2026-10-27T19:23:50.900081634Z",
  "resend_available_at": "2026-10-27T19:18:51.900081634Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "894118",
  "sent_at": "2026-10-27T19:18:50.901882712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62c8435e-6704-413a-b98c-094a1f2d2b04",
  "code": "894118",
  "device_ref": "sandbox-8887"
}
```

```json
{
  "session_id": "58a5e6b0-f45b-49b9-af8d-9c2a1a8b0736",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYzMCwiaWF0IjoxNzkzMTI4NzMwLCJqdGkiOiJkNjBmNjc3ZS02YTU3LTRhZTAtOWEyZi1jMTJjNzBhZDlkMzUiLCJzaWQiOiI1OGE1ZTZiMC1mNDViLTQ5YjktYWY4ZC05YzJhMWE4YjA3MzYifQ.VIXwAYIO1fjUq4ChK8ny75W2TB29jgT-8KVLmcN0jQA",
  "access_expires_at": "2026-10-27T19:33:50.952817175Z",
  "refresh_token": "EZOQfiXnTM6Cqz7i_OhPlwSjZilsHHNHhZukH89Vp2A",
  "refresh_expires_at": "2026-11-26T19:18:50.952299634Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:47.672982Z",
  "last_location_at": "2026-10-27T19:18:47.672982Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8882c5ee-820a-4cb5-baae-eb1390426c64/handover` → **200**

```json
{
  "command_id": "e45716a7-4fd3-43eb-996e-b31d4582a485",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:47.672982Z",
  "last_location_at": "2026-10-27T19:18:47.672982Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8882c5ee-820a-4cb5-baae-eb1390426c64/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:51Z",
    "sequence": 1793128731293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:51.045223Z",
  "last_location_at": "2026-10-27T19:18:51.045223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678752363",
  "device_ref": "sandbox-30343"
}
```

```json
{
  "challenge_id": "cd3e3938-b3b7-48b9-9451-384e83aee447",
  "expires_at": "2026-10-27T19:23:51.068626187Z",
  "resend_available_at": "2026-10-27T19:18:52.068626187Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678752363` → **200**

```json
{
  "phone": "+380678752363",
  "audience": "CLIENT",
  "code": "783034",
  "sent_at": "2026-10-27T19:18:51.070351741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd3e3938-b3b7-48b9-9451-384e83aee447",
  "code": "783034",
  "device_ref": "sandbox-30343"
}
```

```json
{
  "session_id": "7d04a4e4-5f3c-4b20-8f7d-3495036d540b",
  "subject": {
    "type": "CLIENT",
    "id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTZiMy0xNGEzLTQwYzMtYWM5Ni1hYmJkZDYyMWY4OGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjMxLCJpYXQiOjE3OTMxMjg3MzEsImp0aSI6IjhiYWI4ZDZkLTVlNTgtNDQ4YS04NTkyLWQ4M2VlOWFhMTk0ZCIsInNpZCI6IjdkMDRhNGU0LTVmM2MtNGIyMC04ZjdkLTM0OTUwMzZkNTQwYiJ9.YtR3p0yplQXRXIwvSAxKDGQjM6TU5VGiouI3xCVeaV8",
  "access_expires_at": "2026-10-27T19:33:51.119502462Z",
  "refresh_token": "rCUdP1bjMEaTUTjkq33yw15Nb3tVxT505A_mHlj6YkU",
  "refresh_expires_at": "2026-11-26T19:18:51.1190639Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "06fa5a8d-0347-406e-b0ab-e4c92f2795e0",
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
  "id": "8ac6f1a4-20d1-4df3-93a2-8b3923fdc8bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:51.149483Z",
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
  "command_id": "016321fc-0b7c-4a58-b0f1-02f14f832719",
  "quote_id": "8ac6f1a4-20d1-4df3-93a2-8b3923fdc8bf",
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
    "phone": "+380670692927"
  }
}
```

```json
{
  "id": "2097924c-4f4a-4514-8e13-56a5908c998f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.185414Z",
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
    "id": "6835aa1e-8f2f-46e2-93b9-97344c881258",
    "order_id": "2097924c-4f4a-4514-8e13-56a5908c998f",
    "expires_at": "2026-10-27T19:19:06.188709Z",
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

`POST /api/driver/v1/offers/6835aa1e-8f2f-46e2-93b9-97344c881258/accept` → **200**

```json
{
  "command_id": "7151ea31-e9c9-41bc-95d1-a0169a0e201d"
}
```

```json
{
  "id": "125ba40c-b4df-412b-97ce-696f8a215a18",
  "order_id": "2097924c-4f4a-4514-8e13-56a5908c998f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8c8b2d0c-7daf-45e6-bf7e-57a8ffcd8862",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8c8b2d0c-7daf-45e6-bf7e-57a8ffcd8862",
  "order_id": "2097924c-4f4a-4514-8e13-56a5908c998f",
  "assignment_id": "125ba40c-b4df-412b-97ce-696f8a215a18",
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
    "phone": "+380670692927"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f4f7dfd4-0116-4494-b554-352cb1ae6f01",
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
  "id": "301fd8c7-703d-47ae-a9c1-20838f5ef611",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:51.304665Z",
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
  "command_id": "53f57b21-98de-4eaa-bb3c-80b7c4458f31",
  "quote_id": "301fd8c7-703d-47ae-a9c1-20838f5ef611",
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
  "id": "80b7a11b-26b4-4c7d-8b22-a42e8150c1d4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.33631Z",
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
  "command_id": "ed6b7e40-545d-4858-91ba-43fec9180273",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T22:18:51Z"
}
```

```json
{
  "id": "4a5340bb-0a5d-42b4-adc7-ecd0d41cbdbd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:51.376681Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:18:51Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d72f4faf-73cc-4ab5-afb7-a3cb9d473e10",
  "quote_id": "4a5340bb-0a5d-42b4-adc7-ecd0d41cbdbd",
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
  "pickup_at": "2026-10-27T22:18:51Z"
}
```

```json
{
  "id": "bf15cefc-3894-4057-a9ee-49f3a21787a1",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.41092Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:18:51Z",
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
  "command_id": "1bc91b63-85a4-4dc6-999b-9687b3f1f904",
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
  "id": "d860f56e-6288-4437-be0f-d93cd7b235a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:51.445376Z",
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
  "command_id": "5028695e-5b62-4f15-8b3d-0d5d935fb8bd",
  "quote_id": "d860f56e-6288-4437-be0f-d93cd7b235a2",
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
  "correlation_id": "f4111101-c27c-4545-9b18-8288a0310d6c"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "bf15cefc-3894-4057-a9ee-49f3a21787a1",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
      "created_at": "2026-10-27T19:18:51.41092Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T22:18:51Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "80b7a11b-26b4-4c7d-8b22-a42e8150c1d4",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
      "created_at": "2026-10-27T19:18:51.33631Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "2097924c-4f4a-4514-8e13-56a5908c998f",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "80b7a11b-26b4-4c7d-8b22-a42e8150c1d4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.33631Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/2097924c-4f4a-4514-8e13-56a5908c998f` → **200**

```json
{
  "id": "2097924c-4f4a-4514-8e13-56a5908c998f",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
    "id": "125ba40c-b4df-412b-97ce-696f8a215a18",
    "order_id": "2097924c-4f4a-4514-8e13-56a5908c998f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8c8b2d0c-7daf-45e6-bf7e-57a8ffcd8862",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T19:18:51.185414Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2097924c-4f4a-4514-8e13-56a5908c998f/cancel` → **200**

```json
{
  "command_id": "a43b527a-4795-4165-aa83-27e2d009c438",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2097924c-4f4a-4514-8e13-56a5908c998f",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
    "id": "125ba40c-b4df-412b-97ce-696f8a215a18",
    "order_id": "2097924c-4f4a-4514-8e13-56a5908c998f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8c8b2d0c-7daf-45e6-bf7e-57a8ffcd8862",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:18:51.185414Z",
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

`GET /api/rider/v1/orders/80b7a11b-26b4-4c7d-8b22-a42e8150c1d4` → **200**

```json
{
  "id": "80b7a11b-26b4-4c7d-8b22-a42e8150c1d4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.33631Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/80b7a11b-26b4-4c7d-8b22-a42e8150c1d4/cancel` → **200**

```json
{
  "command_id": "c64df472-88e4-47ae-8914-535b26125fa5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "80b7a11b-26b4-4c7d-8b22-a42e8150c1d4",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.33631Z",
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

`GET /api/rider/v1/orders/bf15cefc-3894-4057-a9ee-49f3a21787a1` → **200**

```json
{
  "id": "bf15cefc-3894-4057-a9ee-49f3a21787a1",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.41092Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:18:51Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/bf15cefc-3894-4057-a9ee-49f3a21787a1/cancel` → **200**

```json
{
  "command_id": "5a3930ba-b9ae-43f7-9f48-95dad0787b37",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bf15cefc-3894-4057-a9ee-49f3a21787a1",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a9faa6b3-14a3-40c3-ac96-abbdd621f88f",
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
  "created_at": "2026-10-27T19:18:51.41092Z",
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
  "pickup_at": "2026-10-27T22:18:51Z",
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
  "session_id": "8882c5ee-820a-4cb5-baae-eb1390426c64",
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
  "last_heartbeat_at": "2026-10-27T19:18:51.045223Z",
  "last_location_at": "2026-10-27T19:18:51.045223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8882c5ee-820a-4cb5-baae-eb1390426c64/close` → **200**

```json
{
  "command_id": "b0ad8163-fe63-4f40-a1e7-768fddb1a7a8",
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

Done: orders 2097924c-4f4a-4514-8e13-56a5908c998f, 80b7a11b-26b4-4c7d-8b22-a42e8150c1d4, bf15cefc-3894-4057-a9ee-49f3a21787a1.

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
  "session_id": "3cf1767e-a0d2-447f-8239-8bfd8af09d74",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzIsImlhdCI6MTc5MzEyODczMiwianRpIjoiMTNjZGRhNzMtNGM1MC00ZmQ3LTllNWUtYTUzMzhkZDVmMGEyIiwic2lkIjoiM2NmMTc2N2UtYTBkMi00NDdmLTgyMzktOGJmZDhhZjA5ZDc0In0.uTNKQ2RP9b6Gt74gDmLOlczTGTQwU0zDSthS_vnv8rQ",
  "access_expires_at": "2026-10-27T19:33:52.023892706Z",
  "refresh_token": "hNKJh3hTgX9plORpN-HbqQ16h2KmHxsDjwnrr98x6kE",
  "refresh_expires_at": "2026-10-28T07:18:52.02340495Z",
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
  "session_id": "ee17f9dd-93cf-4e7d-bce6-3e7dbed9d52d",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzIsImlhdCI6MTc5MzEyODczMiwianRpIjoiZDEwNWNlNjQtZDM0NS00NWI5LThmZWYtZDAzOWYxNTFlYzExIiwic2lkIjoiZWUxN2Y5ZGQtOTNjZi00ZTdkLWJjZTYtM2U3ZGJlZDlkNTJkIn0.Sk4HwIYwjWgT6jl4ZbkAfspH7QfShLvL-M5W1smSn6M",
  "access_expires_at": "2026-10-27T19:33:52.306020473Z",
  "refresh_token": "dK6kvD7VOovvWOqXLNIQfQs1ALTMIAEzNysd0JrxG4Q",
  "refresh_expires_at": "2026-10-28T07:18:52.305573798Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9408"
}
```

```json
{
  "challenge_id": "90aa346b-2c69-4e42-8f13-eaf1e557d25a",
  "expires_at": "2026-10-27T19:23:52.327287025Z",
  "resend_available_at": "2026-10-27T19:18:53.327287025Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "821875",
  "sent_at": "2026-10-27T19:18:52.329473985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90aa346b-2c69-4e42-8f13-eaf1e557d25a",
  "code": "821875",
  "device_ref": "sandbox-9408"
}
```

```json
{
  "session_id": "bd64795e-50a5-4da3-9a55-0766c107b9f6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYzMiwiaWF0IjoxNzkzMTI4NzMyLCJqdGkiOiJjYzlmNDM0NC0zNzExLTQ1MjItYTA2Ni1kZmY1MjFkYmU0NTgiLCJzaWQiOiJiZDY0Nzk1ZS01MGE1LTRkYTMtOWE1NS0wNzY2YzEwN2I5ZjYifQ.4M2eIna0pMVJK9UKQ8ZnHN4ryOetnojjcQSGCOF7JZU",
  "access_expires_at": "2026-10-27T19:33:52.376925602Z",
  "refresh_token": "BikdHjj96g7rA8f5FhuYN0l_OGZpmxiL8yDMeHhpCHk",
  "refresh_expires_at": "2026-11-26T19:18:52.376522384Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:46.728995Z",
  "last_location_at": "2026-10-27T19:18:46.728995Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/handover` → **200**

```json
{
  "command_id": "1b2a4878-ae00-4702-a4c2-0a97d91f65d0",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:46.728995Z",
  "last_location_at": "2026-10-27T19:18:46.728995Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:52Z",
    "sequence": 1793128732450
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:52.466117Z",
  "last_location_at": "2026-10-27T19:18:52.466117Z",
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
  "command_id": "f1105ee8-5036-4ad7-9889-210edb098ce4",
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
  "effective_at": "2026-10-27T19:18:52.526683Z",
  "changed_by": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T19:18:52.552473093Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "04700b2d-350c-4f40-87c8-7b7c15dd5572",
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
  "id": "56bac32d-d413-4f56-bb0b-b1fb8e93e9f5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:23:52.587339Z",
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
  "command_id": "e867789b-0c8e-4106-a151-a9ddfd6f17fe",
  "quote_id": "56bac32d-d413-4f56-bb0b-b1fb8e93e9f5",
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
    "phone": "+3806711112360"
  }
}
```

```json
{
  "id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
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
  "created_at": "2026-10-27T19:18:52.629354Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112360"
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
    "id": "1553ae1e-231f-4037-b822-9609660d9f9f",
    "order_id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
    "expires_at": "2026-10-27T19:19:07.632864Z",
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

`POST /api/driver/v1/offers/1553ae1e-231f-4037-b822-9609660d9f9f/accept` → **200**

```json
{
  "command_id": "8df7ad45-0002-477b-a467-1f5f6f441398"
}
```

```json
{
  "id": "cc678aa9-20f4-4770-9e0d-dc97d5818a32",
  "order_id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "815e326a-f992-4eb3-83ab-bc614ff92deb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "815e326a-f992-4eb3-83ab-bc614ff92deb",
  "order_id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
  "assignment_id": "cc678aa9-20f4-4770-9e0d-dc97d5818a32",
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
    "phone": "+3806711112360"
  }
}
```

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:52Z",
    "sequence": 1793128732721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:52.737936Z",
  "last_location_at": "2026-10-27T19:18:52.737936Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/815e326a-f992-4eb3-83ab-bc614ff92deb/arrive` → **200**

```json
{
  "command_id": "3be5f5d5-30e6-4758-9694-fdb004a4ed4e",
  "expected_version": 0
}
```

```json
{
  "id": "815e326a-f992-4eb3-83ab-bc614ff92deb",
  "order_id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
  "assignment_id": "cc678aa9-20f4-4770-9e0d-dc97d5818a32",
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
  "arrived_at": "2026-10-27T19:18:52.770118Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112360"
  }
}
```

`POST /api/driver/v1/trips/815e326a-f992-4eb3-83ab-bc614ff92deb/start` → **200**

```json
{
  "command_id": "d67def36-0638-4326-a4bd-1e4799ce2aca",
  "expected_version": 1
}
```

```json
{
  "id": "815e326a-f992-4eb3-83ab-bc614ff92deb",
  "order_id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
  "assignment_id": "cc678aa9-20f4-4770-9e0d-dc97d5818a32",
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
  "arrived_at": "2026-10-27T19:18:52.770118Z",
  "started_at": "2026-10-27T19:18:52.804114Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112360"
  }
}
```

`POST /api/driver/v1/trips/815e326a-f992-4eb3-83ab-bc614ff92deb/complete` → **200**

```json
{
  "command_id": "07597389-10f5-447b-af80-721f011e0732",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:18:52Z",
  "cash_received": true
}
```

```json
{
  "id": "815e326a-f992-4eb3-83ab-bc614ff92deb",
  "order_id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
  "assignment_id": "cc678aa9-20f4-4770-9e0d-dc97d5818a32",
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
  "arrived_at": "2026-10-27T19:18:52.770118Z",
  "started_at": "2026-10-27T19:18:52.804114Z",
  "completed_at": "2026-10-27T19:18:52.840424Z",
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
  "command_id": "b5f35a4a-ed51-4680-a0c4-1c1a2f9a3194",
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
  "id": "32c43a06-d36c-4ebe-b1f3-fb7f3c999c8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:23:52.877213Z",
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
  "command_id": "e7ea4111-8706-469b-af4d-8f131cc2a031",
  "quote_id": "32c43a06-d36c-4ebe-b1f3-fb7f3c999c8b",
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
    "phone": "+3806711111336"
  }
}
```

```json
{
  "id": "8dd5bc77-dad8-4200-80fa-8ffa91797dc0",
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
  "created_at": "2026-10-27T19:18:52.909253Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111336"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8dd5bc77-dad8-4200-80fa-8ffa91797dc0` → **200**

```json
{
  "id": "8dd5bc77-dad8-4200-80fa-8ffa91797dc0",
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
  "created_at": "2026-10-27T19:18:52.909253Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111336"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8dd5bc77-dad8-4200-80fa-8ffa91797dc0/cancel` → **200**

```json
{
  "command_id": "e751d649-3e26-47cf-9d24-5578ca43d6c0",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8dd5bc77-dad8-4200-80fa-8ffa91797dc0",
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
  "created_at": "2026-10-27T19:18:52.909253Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111336"
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
  "staff_id": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T19:18:52.844898Z",
  "last_entries": [
    {
      "order_id": "8dd5bc77-dad8-4200-80fa-8ffa91797dc0",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T19:18:52.972692Z"
    },
    {
      "order_id": "88ff8951-c0f7-413d-9833-38c752f44c8d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T19:18:52.844898Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22d79ead-e793-42c5-bca3-2fff5c75cef7",
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
  "last_heartbeat_at": "2026-10-27T19:18:52.737936Z",
  "last_location_at": "2026-10-27T19:18:52.737936Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22d79ead-e793-42c5-bca3-2fff5c75cef7/close` → **200**

```json
{
  "command_id": "6bb0613d-291e-45e8-a8af-5fcfced656ae",
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

Done: operator bonus for fulfilled 88ff8951-c0f7-413d-9833-38c752f44c8d and operator-fault cancellation 8dd5bc77-dad8-4200-80fa-8ffa91797dc0.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676417775",
  "device_ref": "sandbox-11073"
}
```

```json
{
  "challenge_id": "67d345fb-fb2b-4b2d-8c06-efe8e86a924f",
  "expires_at": "2026-10-27T19:23:55.117869645Z",
  "resend_available_at": "2026-10-27T19:18:56.117869645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676417775` → **200**

```json
{
  "phone": "+380676417775",
  "audience": "CLIENT",
  "code": "235086",
  "sent_at": "2026-10-27T19:18:55.119666757Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673837715",
  "device_ref": "sandbox-20126",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "276dc88c-d6cd-4da2-83b3-0c3d220371f1",
  "expires_at": "2026-10-27T19:23:55.165098185Z",
  "resend_available_at": "2026-10-27T19:18:56.165098185Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673837715` → **200**

```json
{
  "phone": "+380673837715",
  "audience": "CLIENT",
  "code": "611502",
  "sent_at": "2026-10-27T19:18:55.166898893Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672850000",
  "device_ref": "sandbox-29412"
}
```

```json
{
  "challenge_id": "82f175d8-9907-4912-930f-8b48e18db470",
  "expires_at": "2026-10-27T19:23:55.211218113Z",
  "resend_available_at": "2026-10-27T19:18:56.211218113Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672850000` → **200**

```json
{
  "phone": "+380672850000",
  "audience": "CLIENT",
  "code": "284818",
  "sent_at": "2026-10-27T19:18:55.213686268Z",
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
  "session_id": "46cecde5-3c77-4077-8682-13df215d0fe5",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzUsImlhdCI6MTc5MzEyODczNSwianRpIjoiMTJlMDA1NzktZjk3ZC00Mzc5LTk2N2MtNTM0YTk5MmYzMDFhIiwic2lkIjoiNDZjZWNkZTUtM2M3Ny00MDc3LTg2ODItMTNkZjIxNWQwZmU1In0.3AZ9Wsk-wC9q_e-js43WfzsNN3kacVdpotTbxRZue-A",
  "access_expires_at": "2026-10-27T19:33:55.516952353Z",
  "refresh_token": "_lzLudfJ4kQxIkUA3JKo2OWGuJpKEt46td54qK1Jbj8",
  "refresh_expires_at": "2026-10-28T07:18:55.516490476Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672850000` → **200**

```json
{
  "deliveries": [
    {
      "id": "03d6625d-c03d-4726-96c9-fc72d7c800c4",
      "challenge_id": "82f175d8-9907-4912-930f-8b48e18db470",
      "phone": "+380672850000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-64b5d17f-d440-4559-a83b-1d726b6bc843",
      "error": null,
      "attempted_at": "2026-10-27T19:18:55.213871Z"
    },
    {
      "id": "e17b8403-e10e-457f-a3cf-4c7a12e2fdc6",
      "challenge_id": "82f175d8-9907-4912-930f-8b48e18db470",
      "phone": "+380672850000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-27T19:18:55.213267Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672850000` → **200**

```json
{
  "phone": "+380672850000",
  "audience": "CLIENT",
  "code": "284818",
  "sent_at": "2026-10-27T19:18:55.213686268Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673837715` → **200**

```json
{
  "deliveries": [
    {
      "id": "44fada92-ec32-4f3a-a971-58398aadcede",
      "challenge_id": "276dc88c-d6cd-4da2-83b3-0c3d220371f1",
      "phone": "+380673837715",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4f45ec29-5877-4716-8761-aa4f610babbb",
      "error": null,
      "attempted_at": "2026-10-27T19:18:55.167072Z"
    }
  ]
}
```

Done: SMS to +380676417775, a call to +380673837715, SMS then a call to +380672850000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635355052",
  "device_ref": "sandbox-12433"
}
```

```json
{
  "challenge_id": "d69d54d9-a251-40bb-89a0-52929fb17961",
  "expires_at": "2026-10-27T19:23:55.629902921Z",
  "resend_available_at": "2026-10-27T19:18:56.629902921Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635355052` → **200**

```json
{
  "phone": "+380635355052",
  "audience": "CLIENT",
  "code": "597260",
  "sent_at": "2026-10-27T19:18:55.631608024Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d69d54d9-a251-40bb-89a0-52929fb17961",
  "code": "597260",
  "device_ref": "sandbox-12433"
}
```

```json
{
  "session_id": "b3270060-f1ae-4972-a664-a737047f6887",
  "subject": {
    "type": "CLIENT",
    "id": "2a80f3c7-e558-4fbb-9447-0eec856b43d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTgwZjNjNy1lNTU4LTRmYmItOTQ0Ny0wZWVjODU2YjQzZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjM1LCJpYXQiOjE3OTMxMjg3MzUsImp0aSI6IjExZTRhNzQ4LTBiMTQtNGY3OC1hYmUxLTg3NjY4MjYwMGI5NSIsInNpZCI6ImIzMjcwMDYwLWYxYWUtNDk3Mi1hNjY0LWE3MzcwNDdmNjg4NyJ9.Abuxxal26LsMHXKU2QOnUcuP7KljruQAhkrKQk-EoXg",
  "access_expires_at": "2026-10-27T19:33:55.67944301Z",
  "refresh_token": "IPHmtbjslh16ycZDZlbMvuWIZ02ytQjiBSjG9rwlMMI",
  "refresh_expires_at": "2026-11-26T19:18:55.679053542Z",
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
  "session_id": "922fb845-e83b-4338-8377-d65b12feceac",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzYsImlhdCI6MTc5MzEyODczNiwianRpIjoiMzZjNDFiMDgtZDJmZS00NDcxLTliMDQtZTYxNzBjMDUxNjJjIiwic2lkIjoiOTIyZmI4NDUtZTgzYi00MzM4LTgzNzctZDY1YjEyZmVjZWFjIn0._ivUXZ8xh43waG9tB3HR2C3i0zTCWbvgBYTBvw60Lxg",
  "access_expires_at": "2026-10-27T19:33:56.036361229Z",
  "refresh_token": "aaAIx_nc5Uzy-WUGIOqDjQI3DOk-VnSL_ZVSp4Sq6tQ",
  "refresh_expires_at": "2026-10-28T07:18:56.035793983Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635355052` → **200**

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
  "correlation_id": "43e6c258-cc3e-4ad1-835b-01ad1e8eca37"
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
  "session_id": "9c7bda07-ff3b-4768-a816-6e017ec9f653",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzYsImlhdCI6MTc5MzEyODczNiwianRpIjoiZTc0OGFjZDUtMDc5ZS00MDA1LTlkODQtNjVjMTZmMjI2MGY3Iiwic2lkIjoiOWM3YmRhMDctZmYzYi00NzY4LWE4MTYtNmUwMTdlYzlmNjUzIn0.CJzmtYP4ZwvkZU-Xl7IhmI6OO6hxhtfGxEBI8TTostE",
  "access_expires_at": "2026-10-27T19:33:56.399352332Z",
  "refresh_token": "iqcEP1ySln7XeAHoXkxDLkW7OWl5Khtgqwx9AC2nPe4",
  "refresh_expires_at": "2026-10-28T07:18:56.398873189Z",
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
  "command_id": "ed11c1c1-bae2-4a1a-a5fe-16dccefe0f85",
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
  "changed_by": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T19:18:56.467988047Z"
}
```

## The rider books the airport for 2026-10-27T22:18:56Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600628399",
  "device_ref": "sandbox-17676"
}
```

```json
{
  "challenge_id": "8ec75fb8-a289-4dd2-a10f-733dddacd0d8",
  "expires_at": "2026-10-27T19:23:56.499779753Z",
  "resend_available_at": "2026-10-27T19:18:57.499779753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600628399` → **200**

```json
{
  "phone": "+48600628399",
  "audience": "CLIENT",
  "code": "928053",
  "sent_at": "2026-10-27T19:18:56.502063309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ec75fb8-a289-4dd2-a10f-733dddacd0d8",
  "code": "928053",
  "device_ref": "sandbox-17676"
}
```

```json
{
  "session_id": "aacbcdf8-9858-4dff-9cb6-40f6a6fc2b9a",
  "subject": {
    "type": "CLIENT",
    "id": "42b1ebc6-6b3e-4e35-9f38-ee059d24bbe4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmIxZWJjNi02YjNlLTRlMzUtOWYzOC1lZTA1OWQyNGJiZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjM2LCJpYXQiOjE3OTMxMjg3MzYsImp0aSI6ImI4NWI5ODExLTcwM2EtNDIzZS1iOGMwLTIxYzNmMzE4ZGYwOSIsInNpZCI6ImFhY2JjZGY4LTk4NTgtNGRmZi05Y2I2LTQwZjZhNmZjMmI5YSJ9.gFXF0bsMII0wKr0p_jCaaNOSXaaDNdve5PwlkFX49GE",
  "access_expires_at": "2026-10-27T19:33:56.55444793Z",
  "refresh_token": "uiuVO2sDzr_PPtV9Jyt06AXG7Th9r55UM8aPoVLWkJ4",
  "refresh_expires_at": "2026-11-26T19:18:56.553954225Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0c0c74bd-d7c5-42bd-b37c-d4b96fb08b79",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T22:18:56Z"
}
```

```json
{
  "id": "58e2169c-5fab-4b97-bd4e-08250df2d514",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T19:23:56.585188Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:18:56Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "55e6a17c-15ab-4f7c-8161-2150442926d3",
  "quote_id": "58e2169c-5fab-4b97-bd4e-08250df2d514",
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
  "pickup_at": "2026-10-27T22:18:56Z"
}
```

```json
{
  "id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "42b1ebc6-6b3e-4e35-9f38-ee059d24bbe4",
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
  "created_at": "2026-10-27T19:18:56.617848Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:18:56Z",
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
  "device_ref": "sandbox-19357"
}
```

```json
{
  "challenge_id": "16b055e6-6df3-49de-895e-af7380c74643",
  "expires_at": "2026-10-27T19:23:56.645967358Z",
  "resend_available_at": "2026-10-27T19:18:57.645967358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "097459",
  "sent_at": "2026-10-27T19:18:56.648153347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16b055e6-6df3-49de-895e-af7380c74643",
  "code": "097459",
  "device_ref": "sandbox-19357"
}
```

```json
{
  "session_id": "9374a07d-7d31-459c-aa15-772d30b730d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYzNiwiaWF0IjoxNzkzMTI4NzM2LCJqdGkiOiJjYzRmMTg1Mi0wODgzLTQ2ZjMtODVhZS0zMzhmYjJiNGQxZjUiLCJzaWQiOiI5Mzc0YTA3ZC03ZDMxLTQ1OWMtYWExNS03NzJkMzBiNzMwZDkifQ.HkrppgP_IeszL0oQFKo_dITw3V_L5nAoaL5sQD7MODg",
  "access_expires_at": "2026-10-27T19:33:56.69526491Z",
  "refresh_token": "OGq9dvfdHil3BlxIEAYM_oQpVeoXL1VkK-W82v5lPEE",
  "refresh_expires_at": "2026-11-26T19:18:56.694812538Z",
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
  "command_id": "77bd5d92-288c-4878-b8b4-82f70bd74307",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:56Z",
    "sequence": 1793128736737
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6fea26cc-3a55-4934-951d-aee651d06f48",
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
  "last_heartbeat_at": "2026-10-27T19:18:56.752708Z",
  "last_location_at": "2026-10-27T19:18:56.752708Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
      "short_number": 13,
      "pickup_at": "2026-10-27T22:18:56Z",
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

`POST /api/driver/v1/preorders/6e857d9f-e6c6-4f5b-82ba-5fcff444d945/reserve` → **200**

```json
{
  "command_id": "e32cfaac-388b-4331-8370-a604913fbb86"
}
```

```json
{
  "id": "bbb48f93-38e0-4f9a-bac4-6e6157994742",
  "state": "RESERVED",
  "order": {
    "order_id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
    "short_number": 13,
    "pickup_at": "2026-10-27T22:18:56Z",
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
  "reserved_at": "2026-10-27T19:18:56.809002Z",
  "confirm_from": "2026-10-27T21:48:56Z",
  "confirm_until": "2026-10-27T21:58:56Z",
  "drop_until": "2026-10-27T21:18:56Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "bbb48f93-38e0-4f9a-bac4-6e6157994742",
      "state": "RESERVED",
      "order": {
        "order_id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:18:56Z",
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
      "reserved_at": "2026-10-27T19:18:56.809002Z",
      "confirm_from": "2026-10-27T21:48:56Z",
      "confirm_until": "2026-10-27T21:58:56Z",
      "drop_until": "2026-10-27T21:18:56Z"
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
      "id": "bbb48f93-38e0-4f9a-bac4-6e6157994742",
      "state": "RESERVED",
      "order": {
        "order_id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:18:56Z",
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
      "reserved_at": "2026-10-27T19:18:56.809002Z",
      "confirm_from": "2026-10-27T21:48:56Z",
      "confirm_until": "2026-10-27T21:58:56Z",
      "drop_until": "2026-10-27T21:18:56Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/bbb48f93-38e0-4f9a-bac4-6e6157994742/confirm` → **409**

```json
{
  "command_id": "7ff164de-3d2c-4230-b072-8fbb1fd527fd"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/bbb48f93-38e0-4f9a-bac4-6e6157994742/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1205f0f7-56f4-4baa-b6cd-a9cdd6e6279c"
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
  "session_id": "f28f2721-3b79-4f42-b124-1e395102a05f",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzcsImlhdCI6MTc5MzEyODczNywianRpIjoiZTkyM2I2OTktZDc3ZS00YmJmLTg5NmEtMTllOGYwMWIxZjMyIiwic2lkIjoiZjI4ZjI3MjEtM2I3OS00ZjQyLWIxMjQtMWUzOTUxMDJhMDVmIn0.YoCb8kYAzbyxJLtdL0iLESgvi-vrKDkf5ZOXtRbahDM",
  "access_expires_at": "2026-10-27T19:33:57.166559861Z",
  "refresh_token": "Gr6FKRWRzfwzSgOA5OkUuoHlDKQFhElGeq2Hlv_Ylc0",
  "refresh_expires_at": "2026-10-28T07:18:57.166150813Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6e857d9f-e6c6-4f5b-82ba-5fcff444d945` → **200**

```json
{
  "id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "42b1ebc6-6b3e-4e35-9f38-ee059d24bbe4",
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
  "created_at": "2026-10-27T19:18:56.617848Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T22:18:56Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "bbb48f93-38e0-4f9a-bac4-6e6157994742",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T19:18:56.809002Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6e857d9f-e6c6-4f5b-82ba-5fcff444d945/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T19:18:56.618787Z",
      "actor": {
        "type": "CLIENT",
        "id": "42b1ebc6-6b3e-4e35-9f38-ee059d24bbe4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
        "preorder": true,
        "quote_id": "58e2169c-5fab-4b97-bd4e-08250df2d514",
        "pickup_at": "2026-10-27T22:18:56Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T19:18:56.809977Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6e857d9f-e6c6-4f5b-82ba-5fcff444d945",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "bbb48f93-38e0-4f9a-bac4-6e6157994742"
      }
    }
  ]
}
```

Done: pre-order 6e857d9f-e6c6-4f5b-82ba-5fcff444d945, reservation bbb48f93-38e0-4f9a-bac4-6e6157994742.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18591"
}
```

```json
{
  "challenge_id": "a769ee6e-933a-40ac-83a8-31e2d8b6883a",
  "expires_at": "2026-10-27T19:23:57.245360335Z",
  "resend_available_at": "2026-10-27T19:18:58.245360335Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "267662",
  "sent_at": "2026-10-27T19:18:57.24728581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a769ee6e-933a-40ac-83a8-31e2d8b6883a",
  "code": "267662",
  "device_ref": "sandbox-18591"
}
```

```json
{
  "session_id": "14093205-5e4f-4ec3-949b-94e88eb70779",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYzNywiaWF0IjoxNzkzMTI4NzM3LCJqdGkiOiIyOTE4NTkyOS1jYWE1LTQ0ZWYtOGY5My05OGExNjU0OTY2NzYiLCJzaWQiOiIxNDA5MzIwNS01ZTRmLTRlYzMtOTQ5Yi05NGU4OGViNzA3NzkifQ.H7mTTKUHj0EDr8EfnnMsxvow1r0QAEH9ZxjMUHmWN44",
  "access_expires_at": "2026-10-27T19:33:57.294153947Z",
  "refresh_token": "Tev92eyEPwoy3vNJdyy5b0wJgWfwNJq4ZMvuLIu0LBU",
  "refresh_expires_at": "2026-11-26T19:18:57.293643727Z",
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
  "command_id": "d76f00cb-971a-4029-b67d-898685b7f31f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:57Z",
    "sequence": 1793128737337
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75",
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
  "last_heartbeat_at": "2026-10-27T19:18:57.352158Z",
  "last_location_at": "2026-10-27T19:18:57.352158Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678072805",
  "device_ref": "sandbox-68"
}
```

```json
{
  "challenge_id": "76fabe85-0a03-4a75-91f7-0cdafd20e124",
  "expires_at": "2026-10-27T19:23:57.376841266Z",
  "resend_available_at": "2026-10-27T19:18:58.376841266Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678072805` → **200**

```json
{
  "phone": "+380678072805",
  "audience": "CLIENT",
  "code": "805049",
  "sent_at": "2026-10-27T19:18:57.378536415Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76fabe85-0a03-4a75-91f7-0cdafd20e124",
  "code": "805049",
  "device_ref": "sandbox-68"
}
```

```json
{
  "session_id": "e95dc178-16eb-4a3c-a0d6-d3d1d3032d0a",
  "subject": {
    "type": "CLIENT",
    "id": "a6b6874a-4ed0-4d9c-9f73-ac4556fc4ff3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmI2ODc0YS00ZWQwLTRkOWMtOWY3My1hYzQ1NTZmYzRmZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjM3LCJpYXQiOjE3OTMxMjg3MzcsImp0aSI6IjZiY2FiMTgxLWEyMDUtNDg1ZS05YzQ5LTVmM2FmMDA3ODNiNyIsInNpZCI6ImU5NWRjMTc4LTE2ZWItNGEzYy1hMGQ2LWQzZDFkMzAzMmQwYSJ9.NXtSrGxn4BFU09TlyJ4BK5qTD2j2f8hjwltU6WpPQJo",
  "access_expires_at": "2026-10-27T19:33:57.42515864Z",
  "refresh_token": "qMlTmnYpg1_CqJ-2FBNEWGYkXtGLGy6zB98Q0-9Y21k",
  "refresh_expires_at": "2026-11-26T19:18:57.424758697Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "37dd960a-a61a-4fbb-aab0-c34b090bc345",
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
  "id": "afe83f5f-c1e9-4ec6-9331-c587b2154845",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:23:57.455540Z",
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
  "command_id": "838c02c4-6182-46b6-bef8-6b3521693216",
  "quote_id": "afe83f5f-c1e9-4ec6-9331-c587b2154845",
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
  "id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6b6874a-4ed0-4d9c-9f73-ac4556fc4ff3",
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
  "created_at": "2026-10-27T19:18:57.486272Z",
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
    "id": "0028a7c2-2bd7-4c0b-a57c-a7515d6afac9",
    "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
    "expires_at": "2026-10-27T19:19:12.488569Z",
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

`POST /api/driver/v1/offers/0028a7c2-2bd7-4c0b-a57c-a7515d6afac9/accept` → **200**

```json
{
  "command_id": "92997af4-0d86-4290-8dd5-fc0511b5173e"
}
```

```json
{
  "id": "f5c3b1a8-42c5-492d-944e-4817e60a6b4e",
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "32da4197-2b97-4684-bc28-16c853d88323",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "32da4197-2b97-4684-bc28-16c853d88323",
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "assignment_id": "f5c3b1a8-42c5-492d-944e-4817e60a6b4e",
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

`POST /api/driver/v1/work-sessions/011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:57Z",
    "sequence": 1793128737576
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75",
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
  "last_heartbeat_at": "2026-10-27T19:18:57.59258Z",
  "last_location_at": "2026-10-27T19:18:57.59258Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "32da4197-2b97-4684-bc28-16c853d88323",
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "assignment_id": "f5c3b1a8-42c5-492d-944e-4817e60a6b4e",
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

`POST /api/driver/v1/trips/32da4197-2b97-4684-bc28-16c853d88323/arrive` → **200**

```json
{
  "command_id": "722e37bd-45d8-431e-bda1-f95f4a68961f",
  "expected_version": 0
}
```

```json
{
  "id": "32da4197-2b97-4684-bc28-16c853d88323",
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "assignment_id": "f5c3b1a8-42c5-492d-944e-4817e60a6b4e",
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
  "arrived_at": "2026-10-27T19:18:57.638456Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/32da4197-2b97-4684-bc28-16c853d88323/start` → **200**

```json
{
  "command_id": "bf96f62e-83c6-4a18-9e50-059a8c6ea980",
  "expected_version": 1
}
```

```json
{
  "id": "32da4197-2b97-4684-bc28-16c853d88323",
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "assignment_id": "f5c3b1a8-42c5-492d-944e-4817e60a6b4e",
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
  "arrived_at": "2026-10-27T19:18:57.638456Z",
  "started_at": "2026-10-27T19:18:57.66832Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:57Z",
    "sequence": 1793128737688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75",
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
  "last_heartbeat_at": "2026-10-27T19:18:57.703568Z",
  "last_location_at": "2026-10-27T19:18:57.703568Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/32da4197-2b97-4684-bc28-16c853d88323/complete` → **200**

```json
{
  "command_id": "2d5cc8b0-5a3f-4ffa-8948-2c2b213c421b",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:18:57Z",
  "cash_received": true
}
```

```json
{
  "id": "32da4197-2b97-4684-bc28-16c853d88323",
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "assignment_id": "f5c3b1a8-42c5-492d-944e-4817e60a6b4e",
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
  "arrived_at": "2026-10-27T19:18:57.638456Z",
  "started_at": "2026-10-27T19:18:57.66832Z",
  "completed_at": "2026-10-27T19:18:57.73168Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/64ea6a37-5fb8-45cb-9702-b376829af341/rating` → **200**

```json
{
  "command_id": "58a3594e-e4f6-4ab2-aa3e-7e8a580bc4bf",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "score": 5,
  "created_at": "2026-10-27T19:18:57.774094464Z"
}
```

`POST /api/driver/v1/orders/64ea6a37-5fb8-45cb-9702-b376829af341/rating` → **200**

```json
{
  "command_id": "b3800805-0822-4163-9842-daebad9f9da1",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
  "score": 4,
  "created_at": "2026-10-27T19:18:57.803915416Z"
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
  "session_id": "c52b34c8-bcd6-413d-bca0-022308b7dfc1",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzgsImlhdCI6MTc5MzEyODczOCwianRpIjoiM2Q4NDM4MDQtMDAwZS00YzJiLTliNjktODUwYWJhNWRiZTQ4Iiwic2lkIjoiYzUyYjM0YzgtYmNkNi00MTNkLWJjYTAtMDIyMzA4YjdkZmMxIn0.sDIkzZ4oUj2VXPTd4vvc2W4tmF5oMkRSLOM3I__jb2E",
  "access_expires_at": "2026-10-27T19:33:58.117535712Z",
  "refresh_token": "BlHmAd46Q6Gu86HHx7sz1uTM-NUwqUlwDNJZMGq6ni4",
  "refresh_expires_at": "2026-10-28T07:18:58.11707703Z",
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
  "session_id": "cd302ae4-4115-47a8-a6ec-2df2d23c13fc",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzgsImlhdCI6MTc5MzEyODczOCwianRpIjoiMjdhZTZiZmMtNDY5Zi00YTM4LWExNDQtODg0NmExZWU0NmQwIiwic2lkIjoiY2QzMDJhZTQtNDExNS00N2E4LWE2ZWMtMmRmMmQyM2MxM2ZjIn0.R6MHU1slUo9sPrqQcydIoYRTEpuQgsMijqY3A1RytSE",
  "access_expires_at": "2026-10-27T19:33:58.399444162Z",
  "refresh_token": "ou8MNYR9qFcuqSoCdxL_9-svWBhR_Vb07-WVnD4YNOc",
  "refresh_expires_at": "2026-10-28T07:18:58.398988445Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/64ea6a37-5fb8-45cb-9702-b376829af341/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
      "author_type": "RIDER",
      "author_id": "a6b6874a-4ed0-4d9c-9f73-ac4556fc4ff3",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T19:18:57.774094Z"
    },
    {
      "order_id": "64ea6a37-5fb8-45cb-9702-b376829af341",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a6b6874a-4ed0-4d9c-9f73-ac4556fc4ff3",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T19:18:57.803915Z"
    }
  ]
}
```

Done: ratings for order 64ea6a37-5fb8-45cb-9702-b376829af341.

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
  "session_id": "399727ee-f591-4167-85b7-17790fecbd3c",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzgsImlhdCI6MTc5MzEyODczOCwianRpIjoiZWZlYzE5NjMtMDVmNi00NTljLWI5MGQtNWIwYTMyYzdjMzQzIiwic2lkIjoiMzk5NzI3ZWUtZjU5MS00MTY3LTg1YjctMTc3OTBmZWNiZDNjIn0.v7CpVOXc33MISQ2fvs0X5sznpVch0Im6_aLXrubfvks",
  "access_expires_at": "2026-10-27T19:33:58.723984157Z",
  "refresh_token": "cm-gAyYnraUJlvAT5UgE8SL5rTqp6IfdYSYA1TjzqxA",
  "refresh_expires_at": "2026-10-28T07:18:58.723548249Z",
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
  "command_id": "ace9cea0-ab46-4fed-b484-efa755e25733",
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
  "changed_by": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:18:58.786382Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "ace9cea0-ab46-4fed-b484-efa755e25733",
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
  "changed_by": "a562d117-e4be-44f6-880c-e4162f81fabf",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:18:58.786382Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48731058100",
  "device_ref": "sandbox-25223"
}
```

```json
{
  "challenge_id": "d89e63eb-0942-499e-b55f-fd7929f4ec05",
  "expires_at": "2026-10-27T19:23:58.854403409Z",
  "resend_available_at": "2026-10-27T19:18:59.854403409Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48731058100` → **200**

```json
{
  "phone": "+48731058100",
  "audience": "CLIENT",
  "code": "703484",
  "sent_at": "2026-10-27T19:18:58.856152579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d89e63eb-0942-499e-b55f-fd7929f4ec05",
  "code": "703484",
  "device_ref": "sandbox-25223"
}
```

```json
{
  "session_id": "02f8e0e5-3865-499f-b6d5-9a88728abb06",
  "subject": {
    "type": "CLIENT",
    "id": "4ac13be5-7960-45e2-8f59-fd0d3fa1d361"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWMxM2JlNS03OTYwLTQ1ZTItOGY1OS1mZDBkM2ZhMWQzNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjM4LCJpYXQiOjE3OTMxMjg3MzgsImp0aSI6IjI0YmFhMmM4LWU4ZTYtNGYzOC04NGNmLWJhZjM4YTkwZmRkNSIsInNpZCI6IjAyZjhlMGU1LTM4NjUtNDk5Zi1iNmQ1LTlhODg3MjhhYmIwNiJ9.T1DJUOmynLSpz2zQ9zgfZ5bLDByKfTtH6Vs6SSZvSAM",
  "access_expires_at": "2026-10-27T19:33:58.902826312Z",
  "refresh_token": "sUGjqBPIq_mhnSg-H9PV-ps1x1dizSEpzeCnupYXAoc",
  "refresh_expires_at": "2026-11-26T19:18:58.902408682Z",
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
  "correlation_id": "7ce5dd99-f937-4508-a84a-daaa65d82491"
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
  "device_ref": "sandbox-12925"
}
```

```json
{
  "challenge_id": "ab356d3b-86fc-45b5-a120-a1ee4408c1cb",
  "expires_at": "2026-10-27T19:23:58.971355088Z",
  "resend_available_at": "2026-10-27T19:18:59.971355088Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "636991",
  "sent_at": "2026-10-27T19:18:58.973193632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab356d3b-86fc-45b5-a120-a1ee4408c1cb",
  "code": "636991",
  "device_ref": "sandbox-12925"
}
```

```json
{
  "session_id": "73bb0080-867d-4f46-909d-19f31d7a3d86",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTYzOSwiaWF0IjoxNzkzMTI4NzM5LCJqdGkiOiI0ZDUyMjhiNC0zYWFkLTQzMzAtODI2Zi1kM2U0MTUyNjU3ZTkiLCJzaWQiOiI3M2JiMDA4MC04NjdkLTRmNDYtOTA5ZC0xOWYzMWQ3YTNkODYifQ.YWIL04MSvNSQDFSycHC0p5SZRHm9enXJXFA8TrLNXYk",
  "access_expires_at": "2026-10-27T19:33:59.020179056Z",
  "refresh_token": "1qjO0UNeYK5SbPgiFG4Rx8DWnDvMan8eEvCA4QfKoTk",
  "refresh_expires_at": "2026-11-26T19:18:59.019734686Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6fea26cc-3a55-4934-951d-aee651d06f48",
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
  "last_heartbeat_at": "2026-10-27T19:18:56.752708Z",
  "last_location_at": "2026-10-27T19:18:56.752708Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fea26cc-3a55-4934-951d-aee651d06f48/handover` → **200**

```json
{
  "command_id": "8b17e461-6047-4754-81f3-8bf668bc7992",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6fea26cc-3a55-4934-951d-aee651d06f48",
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
  "last_heartbeat_at": "2026-10-27T19:18:56.752708Z",
  "last_location_at": "2026-10-27T19:18:56.752708Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fea26cc-3a55-4934-951d-aee651d06f48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:18:59Z",
    "sequence": 1793128739910
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6fea26cc-3a55-4934-951d-aee651d06f48",
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
  "last_heartbeat_at": "2026-10-27T19:18:59.10741Z",
  "last_location_at": "2026-10-27T19:18:59.10741Z",
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
  "session_id": "6fea26cc-3a55-4934-951d-aee651d06f48",
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
  "last_heartbeat_at": "2026-10-27T19:18:59.10741Z",
  "last_location_at": "2026-10-27T19:18:59.10741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fea26cc-3a55-4934-951d-aee651d06f48/close` → **200**

```json
{
  "command_id": "b9a82205-0496-40e4-893e-0e48135209dc",
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
  "correlation_id": "e0912606-66c3-4247-90c9-98f3f3c8d65e"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679328151",
  "device_ref": "sandbox-23210"
}
```

```json
{
  "challenge_id": "e659beb4-d020-4f68-a5a3-7a36e8cb8fdf",
  "expires_at": "2026-10-27T19:23:59.251086963Z",
  "resend_available_at": "2026-10-27T19:19:00.251086963Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679328151` → **200**

```json
{
  "phone": "+380679328151",
  "audience": "CLIENT",
  "code": "295721",
  "sent_at": "2026-10-27T19:18:59.252795702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e659beb4-d020-4f68-a5a3-7a36e8cb8fdf",
  "code": "295721",
  "device_ref": "sandbox-23210"
}
```

```json
{
  "session_id": "de8e7ca6-6d91-458e-a33c-84b2ea11f057",
  "subject": {
    "type": "CLIENT",
    "id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWVlZjc1Yi1iOGFhLTQ5NjktYmJkNy1iMjRjZTJhNWNjN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5NjM5LCJpYXQiOjE3OTMxMjg3MzksImp0aSI6ImE5YjcwNWY4LTkzMDAtNGFkYy1iOGY5LTdiNjA3NjBiMThjNyIsInNpZCI6ImRlOGU3Y2E2LTZkOTEtNDU4ZS1hMzNjLTg0YjJlYTExZjA1NyJ9.fNjxKXsPIdFGd1ZlEcGcfL_xGX5ni6bSko50hJqFI9Q",
  "access_expires_at": "2026-10-27T19:33:59.299715297Z",
  "refresh_token": "dqEnj6KoW_Wq_xWZL0tuUcA1H40JpKPX6AdavsdcO8g",
  "refresh_expires_at": "2026-11-26T19:18:59.299330105Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "7209d766-5c5b-44e2-8fee-25ae75b2b956",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "fb048ff2-7e95-40b5-b6ee-f6092f035013",
  "upload_path": "/api/rider/v1/uploads/fb048ff2-7e95-40b5-b6ee-f6092f035013",
  "expires_at": "2026-10-27T19:33:59.330413653Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/fb048ff2-7e95-40b5-b6ee-f6092f035013` → **200**

```json
{
  "file_id": "fb048ff2-7e95-40b5-b6ee-f6092f035013",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3388ebe2-323c-40c8-93c6-2c22682bc13b",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "fb048ff2-7e95-40b5-b6ee-f6092f035013"
  ]
}
```

```json
{
  "id": "98eabf1e-7b77-4801-8a03-9907feb79856",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:18:59.390696Z",
  "updated_at": "2026-10-27T19:18:59.390696Z",
  "messages": [
    {
      "id": "e03568a4-23e9-4182-a259-10e842ca37f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:18:59.392089Z",
      "attachments": [
        {
          "file_id": "fb048ff2-7e95-40b5-b6ee-f6092f035013",
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
  "session_id": "3c865a25-e090-4c28-9968-75fa6189325b",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzksImlhdCI6MTc5MzEyODczOSwianRpIjoiNzc3ZGZhNTAtNDZjMi00YjFlLTg3YmEtYTZlMTczNDQ0NTRjIiwic2lkIjoiM2M4NjVhMjUtZTA5MC00YzI4LTk5NjgtNzVmYTYxODkzMjViIn0.Ck3NARTNqx8XPnu3lSfoyPKNYTpwgJHu-FZPuhpF8Ko",
  "access_expires_at": "2026-10-27T19:33:59.690496134Z",
  "refresh_token": "pTHNyvX8Amo6BsdzMOid3tEhhpoEDrfkbtha5kfOkrs",
  "refresh_expires_at": "2026-10-28T07:18:59.690088238Z",
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
  "session_id": "5e94c1f7-4925-4e0e-b5f7-2c9ba373f5a2",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2MzksImlhdCI6MTc5MzEyODczOSwianRpIjoiM2EwZGMxODItNTc3Yi00MTIwLWEzODgtYWUxNmJjYTE3YjEzIiwic2lkIjoiNWU5NGMxZjctNDkyNS00ZTBlLWI1ZjctMmM5YmEzNzNmNWEyIn0.OsDEfCS_2TLZQksvAKebEPWSS7xPvw7N8MatoJ9bDSc",
  "access_expires_at": "2026-10-27T19:33:59.972129188Z",
  "refresh_token": "QOhDSuqAMypMC8Fhlzed6rFeIp6vqOKua3vp1nkeScc",
  "refresh_expires_at": "2026-10-28T07:18:59.971712009Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/98eabf1e-7b77-4801-8a03-9907feb79856/attachments/fb048ff2-7e95-40b5-b6ee-f6092f035013` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "796b6764-8af9-4019-be43-aa0a74ff9b40",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "dcec6f9a-175f-4734-aba3-2b4d2b9aed9a",
  "upload_path": "/api/operator/v1/uploads/dcec6f9a-175f-4734-aba3-2b4d2b9aed9a",
  "expires_at": "2026-10-27T19:34:00.015677015Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/dcec6f9a-175f-4734-aba3-2b4d2b9aed9a` → **200**

```json
{
  "file_id": "dcec6f9a-175f-4734-aba3-2b4d2b9aed9a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/98eabf1e-7b77-4801-8a03-9907feb79856` → **200**

```json
{
  "id": "98eabf1e-7b77-4801-8a03-9907feb79856",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:18:59.390696Z",
  "updated_at": "2026-10-27T19:18:59.390696Z",
  "messages": [
    {
      "id": "e03568a4-23e9-4182-a259-10e842ca37f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:18:59.392089Z",
      "attachments": [
        {
          "file_id": "fb048ff2-7e95-40b5-b6ee-f6092f035013",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/98eabf1e-7b77-4801-8a03-9907feb79856/comments` → **200**

```json
{
  "command_id": "fd2fd012-840e-4157-b409-1318996ecefb",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "dcec6f9a-175f-4734-aba3-2b4d2b9aed9a"
  ]
}
```

```json
{
  "id": "98eabf1e-7b77-4801-8a03-9907feb79856",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:18:59.390696Z",
  "updated_at": "2026-10-27T19:19:00.099999Z",
  "messages": [
    {
      "id": "e03568a4-23e9-4182-a259-10e842ca37f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:18:59.392089Z",
      "attachments": [
        {
          "file_id": "fb048ff2-7e95-40b5-b6ee-f6092f035013",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cde0315d-0c1c-4b4b-9214-043114d5d7e9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a562d117-e4be-44f6-880c-e4162f81fabf",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:19:00.099711Z",
      "attachments": [
        {
          "file_id": "dcec6f9a-175f-4734-aba3-2b4d2b9aed9a",
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

`GET /api/rider/v1/support/cases/98eabf1e-7b77-4801-8a03-9907feb79856` → **200**

```json
{
  "id": "98eabf1e-7b77-4801-8a03-9907feb79856",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:18:59.390696Z",
  "updated_at": "2026-10-27T19:19:00.099999Z",
  "messages": [
    {
      "id": "e03568a4-23e9-4182-a259-10e842ca37f2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9eeef75b-b8aa-4969-bbd7-b24ce2a5cc7b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:18:59.392089Z",
      "attachments": [
        {
          "file_id": "fb048ff2-7e95-40b5-b6ee-f6092f035013",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cde0315d-0c1c-4b4b-9214-043114d5d7e9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:19:00.099711Z",
      "attachments": [
        {
          "file_id": "dcec6f9a-175f-4734-aba3-2b4d2b9aed9a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/98eabf1e-7b77-4801-8a03-9907feb79856/attachments/dcec6f9a-175f-4734-aba3-2b4d2b9aed9a` → **200**

Done: support case 98eabf1e-7b77-4801-8a03-9907feb79856, rider attachment fb048ff2-7e95-40b5-b6ee-f6092f035013, operator attachment dcec6f9a-175f-4734-aba3-2b4d2b9aed9a.

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
  "session_id": "fccc20ef-b836-42ed-a63f-35b40400dc1b",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2NDAsImlhdCI6MTc5MzEyODc0MCwianRpIjoiNzA2NGQ2MmUtZTRmMi00Mjc3LWFkY2MtMThhMTlkOTNhOGZhIiwic2lkIjoiZmNjYzIwZWYtYjgzNi00MmVkLWE2M2YtMzViNDA0MDBkYzFiIn0.KaZgk1gIsWgEW8aVKDqObLcvSEFDQlG9x0nxBeThXsE",
  "access_expires_at": "2026-10-27T19:34:00.43864178Z",
  "refresh_token": "hh2TSoMeoFjwBOoHlse1goJgbtUQKGd1JVSFzOefbgg",
  "refresh_expires_at": "2026-10-28T07:19:00.438239913Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29305"
}
```

```json
{
  "challenge_id": "c5854365-63f4-4940-9afc-11e01afd8493",
  "expires_at": "2026-10-27T19:24:00.462091447Z",
  "resend_available_at": "2026-10-27T19:19:01.462091447Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "853277",
  "sent_at": "2026-10-27T19:19:00.463741767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5854365-63f4-4940-9afc-11e01afd8493",
  "code": "853277",
  "device_ref": "sandbox-29305"
}
```

```json
{
  "session_id": "39177835-4664-44d9-a0fd-8497d287d41d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTY0MCwiaWF0IjoxNzkzMTI4NzQwLCJqdGkiOiIwZjlmYWE2Ny1iZjJlLTQ3MTQtYTkzZi0zZWE5ZmNiYWM1ODkiLCJzaWQiOiIzOTE3NzgzNS00NjY0LTQ0ZDktYTBmZC04NDk3ZDI4N2Q0MWQifQ.bJi-2LcKbH7akotm38eElIjbOfohuIx47UC6EEQra2I",
  "access_expires_at": "2026-10-27T19:34:00.511031802Z",
  "refresh_token": "3sBhlzeNkI-lcKexZhBGUGgoLrbviE-OAmZaUfd_FZY",
  "refresh_expires_at": "2026-11-26T19:19:00.510529924Z",
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
  "command_id": "7ac80d61-fa85-40af-9b63-9ae2afd95cb8",
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
  "device_ref": "sandbox-28611"
}
```

```json
{
  "challenge_id": "5d9e073c-6a1f-40d9-af0f-695e4bec5da4",
  "expires_at": "2026-10-27T19:24:00.626825773Z",
  "resend_available_at": "2026-10-27T19:19:01.626825773Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "366927",
  "sent_at": "2026-10-27T19:19:00.628697818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d9e073c-6a1f-40d9-af0f-695e4bec5da4",
  "code": "366927",
  "device_ref": "sandbox-28611"
}
```

```json
{
  "session_id": "ddd15e42-beee-4151-ac41-afbf96abe043",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTY0MCwiaWF0IjoxNzkzMTI4NzQwLCJqdGkiOiI0MmMwNzMyMi1kMDFjLTRlNjgtYmFhZC0zNzEyYjAxOGE3ODAiLCJzaWQiOiJkZGQxNWU0Mi1iZWVlLTQxNTEtYWM0MS1hZmJmOTZhYmUwNDMifQ.yJOMiSop4iChwcvd9wQs0xTzb43Wu7ehv1B0Z2Jqejo",
  "access_expires_at": "2026-10-27T19:34:00.675935553Z",
  "refresh_token": "k_U4wgGHFpYk6cODmXLCgYgqopMNVfdkuv7Dx-FnNXg",
  "refresh_expires_at": "2026-11-26T19:19:00.675463991Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75",
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
  "last_heartbeat_at": "2026-10-27T19:18:57.703568Z",
  "last_location_at": "2026-10-27T19:18:57.703568Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75/handover` → **200**

```json
{
  "command_id": "0ea254e8-266b-49a3-813b-bea2a2904775",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75",
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
  "last_heartbeat_at": "2026-10-27T19:18:57.703568Z",
  "last_location_at": "2026-10-27T19:18:57.703568Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:19:00Z",
    "sequence": 1793128740749
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75",
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
  "last_heartbeat_at": "2026-10-27T19:19:00.76532Z",
  "last_location_at": "2026-10-27T19:19:00.76532Z",
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
  "command_id": "3487ee06-eb33-4cdf-ba79-40d902af7d1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:19:00Z",
    "sequence": 1793128740806
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa1db6c5-42c1-42a1-be4f-42c562c7d4c2",
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
  "last_heartbeat_at": "2026-10-27T19:19:00.821555Z",
  "last_location_at": "2026-10-27T19:19:00.821555Z",
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
  "session_id": "904a4337-3014-418b-a94e-109651babb55",
  "subject": {
    "type": "STAFF",
    "id": "a562d117-e4be-44f6-880c-e4162f81fabf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTYyZDExNy1lNGJlLTQ0ZjYtODgwYy1lNDE2MmY4MWZhYmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk2NDEsImlhdCI6MTc5MzEyODc0MSwianRpIjoiYjhmODUyODAtMTgyMC00NzJhLWFiMGItZGZkMDg5ZWRiZDNjIiwic2lkIjoiOTA0YTQzMzctMzAxNC00MThiLWE5NGUtMTA5NjUxYmFiYjU1In0.T1AcISqOf-74B7FuNr-ZO21gCIxbYI5CLJja3bKdkL4",
  "access_expires_at": "2026-10-27T19:34:01.109165679Z",
  "refresh_token": "BxiF1RxZXUrGb6O26YKRgZ3nr65P-362kOWMJRf98xA",
  "refresh_expires_at": "2026-10-28T07:19:01.108733857Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "17e4ad0d-7fe8-4790-97a1-a074a6364d15",
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
  "id": "6bc02e5b-b5f4-46b6-811c-bd5d230bb395",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:24:01.136639Z",
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
  "command_id": "4e8d5ad2-dbf0-4827-8dfc-17f99ae6b8de",
  "quote_id": "6bc02e5b-b5f4-46b6-811c-bd5d230bb395",
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
  "id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
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
  "created_at": "2026-10-27T19:19:01.169276Z",
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
    "id": "afa3a507-7fad-40e9-8b6a-d003b05f6199",
    "order_id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
    "expires_at": "2026-10-27T19:19:16.172366Z",
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

`POST /api/driver/v1/offers/afa3a507-7fad-40e9-8b6a-d003b05f6199/accept` → **200**

```json
{
  "command_id": "88fb08ee-4a68-4237-a0c5-fcf9a54ed750"
}
```

```json
{
  "id": "4d49ec17-3bd2-4f5c-9bf7-a48cf9221e23",
  "order_id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "55fd1ae9-864b-49b4-bbfe-2a5b8f703115",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "55fd1ae9-864b-49b4-bbfe-2a5b8f703115",
  "order_id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
  "assignment_id": "4d49ec17-3bd2-4f5c-9bf7-a48cf9221e23",
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

`POST /api/driver/v1/work-sessions/fa1db6c5-42c1-42a1-be4f-42c562c7d4c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:19:01Z",
    "sequence": 1793128741282
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fa1db6c5-42c1-42a1-be4f-42c562c7d4c2",
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
  "last_heartbeat_at": "2026-10-27T19:19:01.298516Z",
  "last_location_at": "2026-10-27T19:19:01.298516Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/55fd1ae9-864b-49b4-bbfe-2a5b8f703115/arrive` → **200**

```json
{
  "command_id": "c825962d-4058-450c-94a8-632edbc3b6d9",
  "expected_version": 0
}
```

```json
{
  "id": "55fd1ae9-864b-49b4-bbfe-2a5b8f703115",
  "order_id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
  "assignment_id": "4d49ec17-3bd2-4f5c-9bf7-a48cf9221e23",
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
  "arrived_at": "2026-10-27T19:19:01.328446Z",
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

`POST /api/driver/v1/trips/55fd1ae9-864b-49b4-bbfe-2a5b8f703115/start` → **200**

```json
{
  "command_id": "0b87d2e9-c81c-43fd-a064-deb8b56930df",
  "expected_version": 1
}
```

```json
{
  "id": "55fd1ae9-864b-49b4-bbfe-2a5b8f703115",
  "order_id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
  "assignment_id": "4d49ec17-3bd2-4f5c-9bf7-a48cf9221e23",
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
  "arrived_at": "2026-10-27T19:19:01.328446Z",
  "started_at": "2026-10-27T19:19:01.361144Z",
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

`POST /api/driver/v1/trips/55fd1ae9-864b-49b4-bbfe-2a5b8f703115/complete` → **200**

```json
{
  "command_id": "76664603-3378-4185-bf5e-0d249cb30513",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:19:01Z",
  "cash_received": true
}
```

```json
{
  "id": "55fd1ae9-864b-49b4-bbfe-2a5b8f703115",
  "order_id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
  "assignment_id": "4d49ec17-3bd2-4f5c-9bf7-a48cf9221e23",
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
  "arrived_at": "2026-10-27T19:19:01.328446Z",
  "started_at": "2026-10-27T19:19:01.361144Z",
  "completed_at": "2026-10-27T19:19:01.396282Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/67fafb7f-8cba-463c-a902-62a9bc3c7624` → **200**

```json
{
  "id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
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
    "id": "4d49ec17-3bd2-4f5c-9bf7-a48cf9221e23",
    "order_id": "67fafb7f-8cba-463c-a902-62a9bc3c7624",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "55fd1ae9-864b-49b4-bbfe-2a5b8f703115",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:19:01.169276Z",
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
  "session_id": "011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75",
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
  "last_heartbeat_at": "2026-10-27T19:19:00.76532Z",
  "last_location_at": "2026-10-27T19:19:00.76532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/011cb4a7-c2f5-4bf4-8cb0-5b276bbd4a75/close` → **200**

```json
{
  "command_id": "bd3be4d4-68ad-4fb1-a8d5-c8de6ff21983",
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
  "session_id": "fa1db6c5-42c1-42a1-be4f-42c562c7d4c2",
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
  "last_heartbeat_at": "2026-10-27T19:19:01.298516Z",
  "last_location_at": "2026-10-27T19:19:01.298516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa1db6c5-42c1-42a1-be4f-42c562c7d4c2/close` → **200**

```json
{
  "command_id": "bd37f76f-959a-4911-9914-58466ff7a197",
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

Done: terminal order 67fafb7f-8cba-463c-a902-62a9bc3c7624 by Andrii (5a000000-0000-4000-8000-000000000403).
