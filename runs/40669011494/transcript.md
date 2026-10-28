# Sandbox transcript (2026-10-28T10:03:54Z, 5d96419)

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
  "correlation_id": "02acbbfe-c0a0-4320-afc8-21e7910cbe2a"
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
  "session_id": "1dfc24f5-4cb0-43da-a11d-0e622066cab0",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NDEsImlhdCI6MTc5MzE4MTg0MSwianRpIjoiMjc1MWU4MGQtYWEwMS00YzgyLTlhYjgtNjQxYTI5MmM4OTJlIiwic2lkIjoiMWRmYzI0ZjUtNGNiMC00M2RhLWExMWQtMGU2MjIwNjZjYWIwIn0.6XpymzxjNGqCifGPh-I_rBE2SWs5IRNCSNRQ6P8dAgQ",
  "access_expires_at": "2026-10-28T10:19:01.86390587Z",
  "refresh_token": "uGjPVqqGtGUNjstAHbvmN4VLLw7T6xPXuIy3869VEIQ",
  "refresh_expires_at": "2026-10-28T22:04:01.861328877Z",
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
  "session_id": "ad6707ce-732a-437d-909d-c88aa199673e",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NDMsImlhdCI6MTc5MzE4MTg0MywianRpIjoiZGJiNjcyZDQtYzI5ZS00ZjgyLWI3ZjQtZDk2ZjA5YjUzM2UwIiwic2lkIjoiYWQ2NzA3Y2UtNzMyYS00MzdkLTkwOWQtYzg4YWExOTk2NzNlIn0.xWNGJ9ESnJ9mEaA_-Mzgd6vRzoGBH5ERzfiNlrrlAHY",
  "access_expires_at": "2026-10-28T10:19:03.358867396Z",
  "refresh_token": "EGI9h8k2uDFfiMoDIEpDEoWqABSiZiLzTZOlKfsopNs",
  "refresh_expires_at": "2026-10-28T22:04:03.357944104Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "84af1c14-7847-49c8-980b-d0d09c3561c4",
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
  "id": "f4ef62d1-8873-4c80-aa2b-5ae8bffbb195",
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
  "created_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "created_at": "2026-10-28T10:04:03.611315Z",
  "updated_at": "2026-10-28T10:04:03.611315Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633564092",
  "device_ref": "sandbox-27301"
}
```

```json
{
  "challenge_id": "441a9fcf-c3df-4b8d-9df8-3266ae298af9",
  "expires_at": "2026-10-28T10:09:03.864617882Z",
  "resend_available_at": "2026-10-28T10:04:04.864617882Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633564092` → **200**

```json
{
  "phone": "+380633564092",
  "audience": "CLIENT",
  "code": "209988",
  "sent_at": "2026-10-28T10:04:03.875262472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "441a9fcf-c3df-4b8d-9df8-3266ae298af9",
  "code": "209988",
  "device_ref": "sandbox-27301"
}
```

```json
{
  "session_id": "75bd6a15-5e31-4a9a-afae-2c1c93222100",
  "subject": {
    "type": "CLIENT",
    "id": "a6fb251a-d204-4fd2-b96f-f59b7adf150e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmZiMjUxYS1kMjA0LTRmZDItYjk2Zi1mNTliN2FkZjE1MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzQ0LCJpYXQiOjE3OTMxODE4NDQsImp0aSI6IjYwN2YwNWNiLWM5MjItNDUxYS1hZjgwLTAwNjQ3MTJiMTI1YyIsInNpZCI6Ijc1YmQ2YTE1LTVlMzEtNGE5YS1hZmFlLTJjMWM5MzIyMjEwMCJ9.7hezM63pf-SmPnT0bD6aq0j4Lh0avcmLKPR4Dd_i2z0",
  "access_expires_at": "2026-10-28T10:19:04.148360251Z",
  "refresh_token": "Rl7IYVYRcH7Evmd7sZYOaVge3fweDa7uAi0tSmg8a-s",
  "refresh_expires_at": "2026-11-27T10:04:04.146853355Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633564092` → **200**

```json
{
  "client_id": "a6fb251a-d204-4fd2-b96f-f59b7adf150e"
}
```

`POST /api/admin/v1/rider-wallets/a6fb251a-d204-4fd2-b96f-f59b7adf150e/top-ups` → **201**

```json
{
  "command_id": "9bbdd9b2-cbdf-43b7-ac8e-0033260bc3d7",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "a6fb251a-d204-4fd2-b96f-f59b7adf150e",
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
      "id": "b498b296-fcc9-4aff-bd2d-8e4912604803",
      "at": "2026-10-28T10:04:04.597734Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f4c24c51-92d8-453d-aa17-d221d9768593",
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
  "id": "e9c31b36-b74e-4ed1-a088-dee39a0b1e80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:04.953126Z",
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
      "id": "f4ef62d1-8873-4c80-aa2b-5ae8bffbb195",
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
  "device_ref": "sandbox-26037"
}
```

```json
{
  "challenge_id": "fc7f0ca4-e4d4-4787-aa09-ad3323c472ec",
  "expires_at": "2026-10-28T10:09:05.21493731Z",
  "resend_available_at": "2026-10-28T10:04:06.21493731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "772006",
  "sent_at": "2026-10-28T10:04:05.218385517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc7f0ca4-e4d4-4787-aa09-ad3323c472ec",
  "code": "772006",
  "device_ref": "sandbox-26037"
}
```

```json
{
  "session_id": "0bc94345-81d4-4c7a-960c-4673dd6caaa5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc0NSwiaWF0IjoxNzkzMTgxODQ1LCJqdGkiOiJiZTFlZTMwYi1mNjRhLTQzYzUtYWE2ZS0yNmQ1MTBkNWQ3ZTkiLCJzaWQiOiIwYmM5NDM0NS04MWQ0LTRjN2EtOTYwYy00NjczZGQ2Y2FhYTUifQ.txM_ZtjHPYfHcCbqrw-jdi9_JvBGs5_Wpx1niontuxo",
  "access_expires_at": "2026-10-28T10:19:05.464107173Z",
  "refresh_token": "LjSBGnaN9keyPlG4nOiAZAmMZtrKi8qP5yFgn7S81Os",
  "refresh_expires_at": "2026-11-27T10:04:05.462961635Z",
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
  "command_id": "e6b578b8-4583-4c40-8c64-796828b32d01",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:05Z",
    "sequence": 1793181845909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c9c19ea-b38c-42f0-9d60-ea89f90a9e6c",
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
  "last_heartbeat_at": "2026-10-28T10:04:05.951686Z",
  "last_location_at": "2026-10-28T10:04:05.951686Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "55b97c6c-237a-4855-a496-062dfc8b46ef",
  "quote_id": "e9c31b36-b74e-4ed1-a088-dee39a0b1e80",
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
  "id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6fb251a-d204-4fd2-b96f-f59b7adf150e",
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
  "created_at": "2026-10-28T10:04:06.238076Z",
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
  "client_id": "a6fb251a-d204-4fd2-b96f-f59b7adf150e",
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
      "id": "b498b296-fcc9-4aff-bd2d-8e4912604803",
      "at": "2026-10-28T10:04:04.597734Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
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
    "id": "4194eb1d-bad2-4842-97f4-9daf53019e6a",
    "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
    "expires_at": "2026-10-28T10:04:21.252504Z",
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

`POST /api/driver/v1/offers/4194eb1d-bad2-4842-97f4-9daf53019e6a/accept` → **200**

```json
{
  "command_id": "bce09a9d-3823-4949-8e8a-ad0d844cf5eb"
}
```

```json
{
  "id": "b9f5a06a-7148-45d5-afe2-1d0d10f56868",
  "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2808482b-5a52-4f52-aa44-4711721c5eb5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2808482b-5a52-4f52-aa44-4711721c5eb5",
  "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
  "assignment_id": "b9f5a06a-7148-45d5-afe2-1d0d10f56868",
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

`POST /api/driver/v1/work-sessions/1c9c19ea-b38c-42f0-9d60-ea89f90a9e6c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:07Z",
    "sequence": 1793181847425
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c9c19ea-b38c-42f0-9d60-ea89f90a9e6c",
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
  "last_heartbeat_at": "2026-10-28T10:04:07.451113Z",
  "last_location_at": "2026-10-28T10:04:07.451113Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2808482b-5a52-4f52-aa44-4711721c5eb5/arrive` → **200**

```json
{
  "command_id": "29298065-792f-4ada-9e0d-d26d2c44e701",
  "expected_version": 0
}
```

```json
{
  "id": "2808482b-5a52-4f52-aa44-4711721c5eb5",
  "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
  "assignment_id": "b9f5a06a-7148-45d5-afe2-1d0d10f56868",
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
  "arrived_at": "2026-10-28T10:04:07.686695Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2808482b-5a52-4f52-aa44-4711721c5eb5/start` → **200**

```json
{
  "command_id": "2a31a286-8bdb-416a-b146-f832a04a022c",
  "expected_version": 1
}
```

```json
{
  "id": "2808482b-5a52-4f52-aa44-4711721c5eb5",
  "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
  "assignment_id": "b9f5a06a-7148-45d5-afe2-1d0d10f56868",
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
  "arrived_at": "2026-10-28T10:04:07.686695Z",
  "started_at": "2026-10-28T10:04:07.943297Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/2808482b-5a52-4f52-aa44-4711721c5eb5/complete` → **200**

```json
{
  "command_id": "dbf6474b-43e9-4ab9-9949-1bd4cf180a23",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:04:08Z",
  "cash_received": true
}
```

```json
{
  "id": "2808482b-5a52-4f52-aa44-4711721c5eb5",
  "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
  "assignment_id": "b9f5a06a-7148-45d5-afe2-1d0d10f56868",
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
  "arrived_at": "2026-10-28T10:04:07.686695Z",
  "started_at": "2026-10-28T10:04:07.943297Z",
  "completed_at": "2026-10-28T10:04:08.217975Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a6fb251a-d204-4fd2-b96f-f59b7adf150e",
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
      "id": "1131c478-1932-4d1d-969c-7f2e1ea7b9b5",
      "at": "2026-10-28T10:04:08.974681Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2"
    },
    {
      "id": "b498b296-fcc9-4aff-bd2d-8e4912604803",
      "at": "2026-10-28T10:04:04.597734Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/f4ef62d1-8873-4c80-aa2b-5ae8bffbb195/archive` → **200**

```json
{
  "command_id": "4b3420e3-f5c4-4acc-bcd7-4458cd344572",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "f4ef62d1-8873-4c80-aa2b-5ae8bffbb195",
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
  "created_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "created_at": "2026-10-28T10:04:03.611315Z",
  "updated_at": "2026-10-28T10:04:11.703907Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c9c19ea-b38c-42f0-9d60-ea89f90a9e6c",
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
  "last_heartbeat_at": "2026-10-28T10:04:07.451113Z",
  "last_location_at": "2026-10-28T10:04:07.451113Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1c9c19ea-b38c-42f0-9d60-ea89f90a9e6c/close` → **200**

```json
{
  "command_id": "848ef281-382b-42d6-96fd-852bb5b62718",
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

Done: order 81b258e7-d877-44ab-a977-dd2677a1e9b2.

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
  "session_id": "d5273b59-51aa-4980-90b0-a158a2e68173",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NTIsImlhdCI6MTc5MzE4MTg1MiwianRpIjoiZGE1OTAzZTItZDBkMi00NTQ4LTg2NjItYThhNTM5MjlhZTJlIiwic2lkIjoiZDUyNzNiNTktNTFhYS00OTgwLTkwYjAtYTE1OGEyZTY4MTczIn0.CgfsSuvcN-NmJQfA90W3u3T1BHnkdyc61Ox1Ean6d9c",
  "access_expires_at": "2026-10-28T10:19:12.702892796Z",
  "refresh_token": "AsfJpvPTS6T6YxrKLWW9ABqaSdCo8IPHQ-rJxwasNRc",
  "refresh_expires_at": "2026-10-28T22:04:12.702003938Z",
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
  "command_id": "96349999-8eec-436e-93f9-679b546ef83d",
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
  "session_id": "43f12fcb-2165-4205-9f86-0d2682b084eb",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NTMsImlhdCI6MTc5MzE4MTg1MywianRpIjoiMzY4OGRjYmEtYzBhMi00ZGYxLThlMjQtODIzODFhM2I4M2ZmIiwic2lkIjoiNDNmMTJmY2ItMjE2NS00MjA1LTlmODYtMGQyNjgyYjA4NGViIn0.kzt6PGcseA9XSxB_gbT8-LLBYMrkxfSDukSX8udSCU4",
  "access_expires_at": "2026-10-28T10:19:13.65459503Z",
  "refresh_token": "6am2KASYfOFLoEuLnJ0_8fvasbOdvthky9WGjrcze08",
  "refresh_expires_at": "2026-10-28T22:04:13.653829492Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1723212591",
    "linkedid": "1730052700.1723212591",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678351103"
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
    "id": "1730052700.1723212591",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "4b9bb4fb-f07e-4d52-a950-9443932807cc",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:04:13.868666Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:04:13.893995Z",
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
    "id": "1730052600.76458006",
    "linkedid": "1730052600.76458006",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678351103"
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
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/186daef1-b5af-466d-92b9-5eec7bcd1bc5/answer` → **200**

```json
{
  "command_id": "bae429d5-fc02-41db-8782-af13c3540351"
}
```

```json
{
  "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678351103",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "order_ids": [],
  "started_at": "2026-10-28T10:04:14.155249Z",
  "answered_at": "2026-10-28T10:04:14.411384Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.76458006",
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
    "id": "1730052600.76458006",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
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
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
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
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
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
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
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
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
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
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:04:23.806344Z"
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
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:04:23.806344Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/186daef1-b5af-466d-92b9-5eec7bcd1bc5/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/186daef1-b5af-466d-92b9-5eec7bcd1bc5/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=186daef1-b5af-466d-92b9-5eec7bcd1bc5` → **200**

```json
{
  "changes": [
    {
      "id": "f98d49a6-e262-40b8-aa41-262b96cdbbd9",
      "occurred_at": "2026-10-28T10:04:26.316122Z",
      "actor_type": "STAFF",
      "actor_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b3fb3035-c34b-4a9c-9ea2-8491aa10d1d0\", \"order_ids\": []}",
      "correlation_id": "14a8a19c-8cb6-4a19-ac25-0d817df3ca2b"
    },
    {
      "id": "af148dc9-c0ca-43d1-aa72-d83c3f996974",
      "occurred_at": "2026-10-28T10:04:26.28137Z",
      "actor_type": "STAFF",
      "actor_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b3fb3035-c34b-4a9c-9ea2-8491aa10d1d0\", \"order_ids\": []}",
      "correlation_id": "61c4ddcf-a6f6-4fab-b1b2-a52c4326c59b"
    }
  ]
}
```

Done: call 186daef1-b5af-466d-92b9-5eec7bcd1bc5 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636769481",
  "device_ref": "sandbox-1896"
}
```

```json
{
  "challenge_id": "e9db5fad-94c5-48c7-b19c-aa4d5c460136",
  "expires_at": "2026-10-28T10:09:26.583323987Z",
  "resend_available_at": "2026-10-28T10:04:27.583323987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636769481` → **200**

```json
{
  "phone": "+380636769481",
  "audience": "CLIENT",
  "code": "440266",
  "sent_at": "2026-10-28T10:04:26.586938449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9db5fad-94c5-48c7-b19c-aa4d5c460136",
  "code": "440266",
  "device_ref": "sandbox-1896"
}
```

```json
{
  "session_id": "53c64445-436a-4650-889e-51fda0651255",
  "subject": {
    "type": "CLIENT",
    "id": "fe1e8340-3c06-4078-b742-f1d25a739bb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTFlODM0MC0zYzA2LTQwNzgtYjc0Mi1mMWQyNWE3MzliYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzY2LCJpYXQiOjE3OTMxODE4NjYsImp0aSI6ImU3OGIxNmExLWMyMTgtNDczNy1hNWEzLWY5NDdiODNhY2JlNiIsInNpZCI6IjUzYzY0NDQ1LTQzNmEtNDY1MC04ODllLTUxZmRhMDY1MTI1NSJ9.g7LlWO3Mn3YAMlEA-d0Vq0KVnoLmxtBVROUnxDxNVBc",
  "access_expires_at": "2026-10-28T10:19:26.831973896Z",
  "refresh_token": "S2X_kof-orheya2Q1OA1HxDZvZRyz2UQBx06mMvwFq0",
  "refresh_expires_at": "2026-11-27T10:04:26.831267078Z",
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
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
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
  "device_ref": "sandbox-32574"
}
```

```json
{
  "challenge_id": "c17dcdf0-523d-4042-8b77-1556f0385b85",
  "expires_at": "2026-10-28T10:09:27.275782478Z",
  "resend_available_at": "2026-10-28T10:04:28.275782478Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "387924",
  "sent_at": "2026-10-28T10:04:27.278694619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c17dcdf0-523d-4042-8b77-1556f0385b85",
  "code": "387924",
  "device_ref": "sandbox-32574"
}
```

```json
{
  "session_id": "3d95d021-b3b4-4aa3-b4fa-501c8f76da7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc2NywiaWF0IjoxNzkzMTgxODY3LCJqdGkiOiIyZjQ1Mjk3OC0wY2I2LTRmMWYtYmY0MC1iMmQzN2RjZTMyNjYiLCJzaWQiOiIzZDk1ZDAyMS1iM2I0LTRhYTMtYjRmYS01MDFjOGY3NmRhN2EifQ.6r2RESXWbEv0eMU9MyvL5PhO-yqbh-L_HgrL47-UgM8",
  "access_expires_at": "2026-10-28T10:19:27.51867255Z",
  "refresh_token": "Opl05R_f0S3TjJ7mFsUFSvJOIft25y7QFzyyuWcSJD4",
  "refresh_expires_at": "2026-11-27T10:04:27.517934065Z",
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
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
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
  "session_id": "6ffc1b9d-e024-46a9-85ac-07e6f14a491b",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjgsImlhdCI6MTc5MzE4MTg2OCwianRpIjoiMTEyOWE0NjMtNmNmNS00MDAxLWI5MjEtMjQ0NDNmNmQ5YWJkIiwic2lkIjoiNmZmYzFiOWQtZTAyNC00NmE5LTg1YWMtMDdlNmYxNGE0OTFiIn0.IefI63nF8ZJOrzN0uZ17ae0rA31g6x629T0MZnwHFZI",
  "access_expires_at": "2026-10-28T10:19:28.229021174Z",
  "refresh_token": "80-lLaIde_5DUD-f5zR61tOupx_ezgbIFoPEsx3WxxM",
  "refresh_expires_at": "2026-10-28T22:04:28.228356347Z",
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
  "session_id": "3d092d4e-6a8b-4682-bf81-ec7fea3271aa",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjgsImlhdCI6MTc5MzE4MTg2OCwianRpIjoiMjljY2I1MjUtNDEyMy00MjJmLWFmZjQtZDk4ODQ0Y2EwMWMzIiwic2lkIjoiM2QwOTJkNGUtNmE4Yi00NjgyLWJmODEtZWM3ZmVhMzI3MWFhIn0.F43BI8vIUrrBGTKu2FhrnOByWQbqqSm6F1r2zvuBitM",
  "access_expires_at": "2026-10-28T10:19:28.729808637Z",
  "refresh_token": "5c7U07wRJdOpJ6FKAKDdTLP_9pZmMJ8KYomsinitaqA",
  "refresh_expires_at": "2026-10-28T22:04:28.728985154Z",
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
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "uk": "ДТП",
        "en": "Accident",
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
  "command_id": "25a15d37-1af8-4bd8-a042-0134db8fe987",
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
  "id": "4eb31397-7d66-4fdc-bc49-82b54282b6eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:29.162727Z",
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
  "command_id": "deb93a66-828b-42bc-8ac1-8c56a72bd136",
  "quote_id": "4eb31397-7d66-4fdc-bc49-82b54282b6eb",
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
  "id": "4059e690-b846-4029-82a5-dd5c56f32c07",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe1e8340-3c06-4078-b742-f1d25a739bb1",
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
  "created_at": "2026-10-28T10:04:29.395837Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4059e690-b846-4029-82a5-dd5c56f32c07` → **200**

```json
{
  "id": "4059e690-b846-4029-82a5-dd5c56f32c07",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe1e8340-3c06-4078-b742-f1d25a739bb1",
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
  "created_at": "2026-10-28T10:04:29.395837Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4059e690-b846-4029-82a5-dd5c56f32c07/cancel` → **200**

```json
{
  "command_id": "b14e983c-75d8-44e6-9cc4-204a5a35534d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "4059e690-b846-4029-82a5-dd5c56f32c07",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fe1e8340-3c06-4078-b742-f1d25a739bb1",
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
  "created_at": "2026-10-28T10:04:29.395837Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
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
  "command_id": "6ffc8544-ca9e-4ab3-bd6e-bf293bca39bb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:30Z",
    "sequence": 1793181870307
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "974e85a3-5651-4b63-84ed-c8835a10ab81",
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
  "last_heartbeat_at": "2026-10-28T10:04:30.326154Z",
  "last_location_at": "2026-10-28T10:04:30.326154Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11078"
}
```

```json
{
  "challenge_id": "9f836c40-dc99-46b4-b829-2b33d24b999f",
  "expires_at": "2026-10-28T10:09:30.544665866Z",
  "resend_available_at": "2026-10-28T10:04:31.544665866Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "834604",
  "sent_at": "2026-10-28T10:04:30.54774428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f836c40-dc99-46b4-b829-2b33d24b999f",
  "code": "834604",
  "device_ref": "sandbox-11078"
}
```

```json
{
  "session_id": "36d3a342-8330-40f6-9539-19bcf943789a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc3MCwiaWF0IjoxNzkzMTgxODcwLCJqdGkiOiJjZTdhNzE3MS1lMmE4LTRkZTMtYTFmOS0yNTM1ODU5N2U3NmUiLCJzaWQiOiIzNmQzYTM0Mi04MzMwLTQwZjYtOTUzOS0xOWJjZjk0Mzc4OWEifQ.4IDVH7NZihhgKQHeGagY5oL_O9rTUc2iBcWoF0BP1Pc",
  "access_expires_at": "2026-10-28T10:19:30.78474494Z",
  "refresh_token": "nphQXGzTnEHhcnIXdxGu6_308IEFcyundcSUj1v8Q-g",
  "refresh_expires_at": "2026-11-27T10:04:30.784126941Z",
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
  "command_id": "a2073d0a-177a-43be-9199-5fc3e8874af5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:31Z",
    "sequence": 1793181871206
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed3af0be-bf19-48e3-a183-a693ec31b541",
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
  "last_heartbeat_at": "2026-10-28T10:04:31.225466Z",
  "last_location_at": "2026-10-28T10:04:31.225466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0318552c-aa2a-4836-88e7-b1f81f243501",
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
  "id": "cde63332-29ca-4e62-8acc-0e27b12aad66",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:31.454683Z",
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
  "command_id": "0e3a44a2-f759-49d5-b3c0-c5160cfd41f6",
  "quote_id": "cde63332-29ca-4e62-8acc-0e27b12aad66",
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
  "id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe1e8340-3c06-4078-b742-f1d25a739bb1",
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
  "created_at": "2026-10-28T10:04:31.693231Z",
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
    "id": "92f6750f-5458-451b-a73a-a8b0703ebf22",
    "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
    "expires_at": "2026-10-28T10:04:46.697602Z",
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

`POST /api/driver/v1/offers/92f6750f-5458-451b-a73a-a8b0703ebf22/accept` → **200**

```json
{
  "command_id": "b1da22cc-ffdc-4c0d-b018-ceae57466a4f"
}
```

```json
{
  "id": "bb13428e-2c90-4ae9-9938-cd6f428dd9bc",
  "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7fe221f5-0344-401b-b997-02709373f668",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7fe221f5-0344-401b-b997-02709373f668",
  "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "assignment_id": "bb13428e-2c90-4ae9-9938-cd6f428dd9bc",
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

`POST /api/driver/v1/trips/7fe221f5-0344-401b-b997-02709373f668/cancel` → **200**

```json
{
  "command_id": "3f400ec2-ceec-4250-af84-8c6505178f73",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "7fe221f5-0344-401b-b997-02709373f668",
  "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "assignment_id": "bb13428e-2c90-4ae9-9938-cd6f428dd9bc",
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

`GET /api/rider/v1/orders/300d4cf4-aa20-4233-b79f-15a87de1c91c` → **200**

```json
{
  "id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fe1e8340-3c06-4078-b742-f1d25a739bb1",
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
    "id": "bb13428e-2c90-4ae9-9938-cd6f428dd9bc",
    "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7fe221f5-0344-401b-b997-02709373f668",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:04:31.693231Z",
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
    "id": "1cc58233-be3e-4fd1-baa7-689958b1083c",
    "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
    "expires_at": "2026-10-28T10:04:47.612117Z",
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

`POST /api/driver/v1/offers/1cc58233-be3e-4fd1-baa7-689958b1083c/accept` → **200**

```json
{
  "command_id": "3d9ee3b3-4ff0-4a55-9f24-f2fe47558154"
}
```

```json
{
  "id": "06414802-1900-4b17-bb92-76e6094e483a",
  "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "573e6ce3-c12b-4451-930f-b1005f4285f4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "573e6ce3-c12b-4451-930f-b1005f4285f4",
  "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "assignment_id": "06414802-1900-4b17-bb92-76e6094e483a",
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

`POST /api/driver/v1/trips/573e6ce3-c12b-4451-930f-b1005f4285f4/cancel` → **200**

```json
{
  "command_id": "f5c41341-4e41-4c6c-aa53-51f90668042d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "573e6ce3-c12b-4451-930f-b1005f4285f4",
  "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
  "assignment_id": "06414802-1900-4b17-bb92-76e6094e483a",
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
    "id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:04:31.693231Z",
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
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "4059e690-b846-4029-82a5-dd5c56f32c07",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:04:29.395837Z",
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
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/300d4cf4-aa20-4233-b79f-15a87de1c91c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:04:31.693938Z",
      "actor": {
        "type": "CLIENT",
        "id": "fe1e8340-3c06-4078-b742-f1d25a739bb1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
        "quote_id": "cde63332-29ca-4e62-8acc-0e27b12aad66",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "de0ecdc3-60cc-4a83-a106-1472c8edf8e2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:04:31.696243Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
        "attempt_id": "7c0fd5fc-8837-47b9-90b1-fd32fb90150b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "de0ecdc3-60cc-4a83-a106-1472c8edf8e2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:04:31.704256Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "92f6750f-5458-451b-a73a-a8b0703ebf22",
        "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "de0ecdc3-60cc-4a83-a106-1472c8edf8e2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:04:32.166539Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "92f6750f-5458-451b-a73a-a8b0703ebf22",
        "order_id": "300d4cf4-aa20-4233-b79f-15a87de1c91c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "bb13428e-2c90-4ae9-9938-cd6f428dd9bc"
      },
      "correlation_id": "f97eec80-f010-40cc-865f-67ff11712dbc"
```

Done: orders 4059e690-b846-4029-82a5-dd5c56f32c07, 300d4cf4-aa20-4233-b79f-15a87de1c91c.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730086432",
  "device_ref": "sandbox-2089"
}
```

```json
{
  "challenge_id": "d97cc5d4-68ee-4c99-bcf0-09fc841c2c6c",
  "expires_at": "2026-10-28T10:09:34.433854736Z",
  "resend_available_at": "2026-10-28T10:04:35.433854736Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730086432` → **200**

```json
{
  "phone": "+380730086432",
  "audience": "CLIENT",
  "code": "781323",
  "sent_at": "2026-10-28T10:04:34.437277485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d97cc5d4-68ee-4c99-bcf0-09fc841c2c6c",
  "code": "781323",
  "device_ref": "sandbox-2089"
}
```

```json
{
  "session_id": "c2130c31-8721-45ef-ae68-2a355b6bae0e",
  "subject": {
    "type": "CLIENT",
    "id": "a5133830-5fe3-4926-82b7-fa7434f75a41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTEzMzgzMC01ZmUzLTQ5MjYtODJiNy1mYTc0MzRmNzVhNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzc0LCJpYXQiOjE3OTMxODE4NzQsImp0aSI6IjEzODU2YzFhLTg5NDQtNGIyNS05MmJmLWRlNzY3MzhlMmU0NCIsInNpZCI6ImMyMTMwYzMxLTg3MjEtNDVlZi1hZTY4LTJhMzU1YjZiYWUwZSJ9.FNm7xo3dNRmM_yumM4TeyZih8VLKshUYx9I3_8mdqBY",
  "access_expires_at": "2026-10-28T10:19:34.679765037Z",
  "refresh_token": "qi4lcmP9AcT4w_Nx3ByQRvsYTxQSKWu2xUr4C7WxOZ4",
  "refresh_expires_at": "2026-11-27T10:04:34.679128213Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f43e7dd3-bbb5-405f-aa5b-efe60a990bf9",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cba4fdea-f8b0-4604-917c-a273146bcab7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cba4fdea-f8b0-4604-917c-a273146bcab7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7c5da36b23a5d931c8b04286817927a6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cba4fdea-f8b0-4604-917c-a273146bcab7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730086432"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cba4fdea-f8b0-4604-917c-a273146bcab7",
  "expires_at": "2026-10-28T10:34:34.89972Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/cba4fdea-f8b0-4604-917c-a273146bcab7` → **200**

```json
{
  "id": "cba4fdea-f8b0-4604-917c-a273146bcab7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:34:34.89972Z",
  "card": {
    "id": "2bbed93a-98e9-4cb9-8fd5-0416aaedee71",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2314",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:04:35.137413Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "2bbed93a-98e9-4cb9-8fd5-0416aaedee71",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2314",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:04:35.137413Z"
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
  "device_ref": "sandbox-9094"
}
```

```json
{
  "challenge_id": "ba8ea5fa-3be3-4643-90f3-8693b07097cc",
  "expires_at": "2026-10-28T10:09:35.58961313Z",
  "resend_available_at": "2026-10-28T10:04:36.58961313Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "193545",
  "sent_at": "2026-10-28T10:04:35.59243781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba8ea5fa-3be3-4643-90f3-8693b07097cc",
  "code": "193545",
  "device_ref": "sandbox-9094"
}
```

```json
{
  "session_id": "992e7b71-7a8d-4b80-8dd9-ee1bccf76367",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc3NSwiaWF0IjoxNzkzMTgxODc1LCJqdGkiOiI2MzIxOTU0MS1iYTAxLTRmZTEtODM3OC1hMjcyMTk5ZTRmYmQiLCJzaWQiOiI5OTJlN2I3MS03YThkLTRiODAtOGRkOS1lZTFiY2NmNzYzNjcifQ.7rFR0vMaPzu5rgHVtZbVVxDJlM6dwXY9_IfXf-J4HMs",
  "access_expires_at": "2026-10-28T10:19:35.82954419Z",
  "refresh_token": "uERtMIFhJhq4TnXBqPse-C3A0l9hQ8Q3hKYNlhWt7MU",
  "refresh_expires_at": "2026-11-27T10:04:35.828889831Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed3af0be-bf19-48e3-a183-a693ec31b541",
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
  "last_heartbeat_at": "2026-10-28T10:04:31.225466Z",
  "last_location_at": "2026-10-28T10:04:31.225466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed3af0be-bf19-48e3-a183-a693ec31b541/handover` → **200**

```json
{
  "command_id": "49417eec-83be-4fbf-9179-d46e38edc5aa",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed3af0be-bf19-48e3-a183-a693ec31b541",
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
  "last_heartbeat_at": "2026-10-28T10:04:31.225466Z",
  "last_location_at": "2026-10-28T10:04:31.225466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed3af0be-bf19-48e3-a183-a693ec31b541/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:36Z",
    "sequence": 1793181876483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed3af0be-bf19-48e3-a183-a693ec31b541",
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
  "last_heartbeat_at": "2026-10-28T10:04:36.503433Z",
  "last_location_at": "2026-10-28T10:04:36.503433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8bb2edf0-1d03-4027-9e4e-b95358adc422",
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
  "id": "51ff7c93-4475-47f9-86c5-65402c0e5728",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:36.733340Z",
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
  "command_id": "ba95ddee-fe30-426d-a4b1-e0d9e0d1c477",
  "quote_id": "51ff7c93-4475-47f9-86c5-65402c0e5728",
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
  "id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a5133830-5fe3-4926-82b7-fa7434f75a41",
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
  "created_at": "2026-10-28T10:04:36.96892Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/9b749b8f-90bc-4c88-98b3-76a142b7d83e` → **200**

```json
{
  "id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a5133830-5fe3-4926-82b7-fa7434f75a41",
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
  "created_at": "2026-10-28T10:04:36.96892Z",
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
    "id": "92ce1fc2-d6bf-493c-b4bc-af2d4a093259",
    "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
    "expires_at": "2026-10-28T10:04:52.133168Z",
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

`POST /api/driver/v1/offers/92ce1fc2-d6bf-493c-b4bc-af2d4a093259/accept` → **200**

```json
{
  "command_id": "2b888610-80a6-4740-a3fe-99d111da0543"
}
```

```json
{
  "id": "852bf1ec-b2c3-44c2-a2e9-bcc17522fcd4",
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7acb472e-7731-46c6-8221-1f7fe040a192",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7acb472e-7731-46c6-8221-1f7fe040a192",
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "assignment_id": "852bf1ec-b2c3-44c2-a2e9-bcc17522fcd4",
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

`POST /api/driver/v1/work-sessions/ed3af0be-bf19-48e3-a183-a693ec31b541/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:38Z",
    "sequence": 1793181878133
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed3af0be-bf19-48e3-a183-a693ec31b541",
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
  "last_heartbeat_at": "2026-10-28T10:04:38.152568Z",
  "last_location_at": "2026-10-28T10:04:38.152568Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7acb472e-7731-46c6-8221-1f7fe040a192/arrive` → **200**

```json
{
  "command_id": "16fa2577-1032-4d47-b20a-64c50835f6ff",
  "expected_version": 0
}
```

```json
{
  "id": "7acb472e-7731-46c6-8221-1f7fe040a192",
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "assignment_id": "852bf1ec-b2c3-44c2-a2e9-bcc17522fcd4",
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
  "arrived_at": "2026-10-28T10:04:38.381055Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7acb472e-7731-46c6-8221-1f7fe040a192/start` → **200**

```json
{
  "command_id": "4804776b-5d1f-46a7-b0c1-df4bbdae6f93",
  "expected_version": 1
}
```

```json
{
  "id": "7acb472e-7731-46c6-8221-1f7fe040a192",
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "assignment_id": "852bf1ec-b2c3-44c2-a2e9-bcc17522fcd4",
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
  "arrived_at": "2026-10-28T10:04:38.381055Z",
  "started_at": "2026-10-28T10:04:38.614757Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7acb472e-7731-46c6-8221-1f7fe040a192/complete` → **200**

```json
{
  "command_id": "8008b096-b9c7-4b1f-a44c-b68b2018a0b6",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:04:38Z"
}
```

```json
{
  "id": "7acb472e-7731-46c6-8221-1f7fe040a192",
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "assignment_id": "852bf1ec-b2c3-44c2-a2e9-bcc17522fcd4",
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
  "arrived_at": "2026-10-28T10:04:38.381055Z",
  "started_at": "2026-10-28T10:04:38.614757Z",
  "completed_at": "2026-10-28T10:04:38.853597Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/9b749b8f-90bc-4c88-98b3-76a142b7d83e` → **200**

```json
{
  "id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a5133830-5fe3-4926-82b7-fa7434f75a41",
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
    "id": "852bf1ec-b2c3-44c2-a2e9-bcc17522fcd4",
    "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7acb472e-7731-46c6-8221-1f7fe040a192",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:04:36.96892Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/9b749b8f-90bc-4c88-98b3-76a142b7d83e` → **200**

```json
{
  "id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a5133830-5fe3-4926-82b7-fa7434f75a41",
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
    "id": "852bf1ec-b2c3-44c2-a2e9-bcc17522fcd4",
    "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7acb472e-7731-46c6-8221-1f7fe040a192",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:04:36.96892Z",
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
      "id": "e16f9db9-c4fd-4350-831d-569cfb7ce454",
      "at": "2026-10-28T10:04:39.215018Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/9b749b8f-90bc-4c88-98b3-76a142b7d83e/tip` → **200**

```json
{
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
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
  "available_until": "2026-10-29T10:04:38.853597Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9b749b8f-90bc-4c88-98b3-76a142b7d83e/tip` → **201**

```json
{
  "command_id": "06d7d9f1-490d-4d23-a3ca-c7d6844478a4",
  "amount_minor": 2500
}
```

```json
{
  "id": "c9858298-1cd8-4726-a52a-8688fd77e037",
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:04:41.203143Z"
}
```

`GET /api/rider/v1/orders/9b749b8f-90bc-4c88-98b3-76a142b7d83e/tip` → **200**

```json
{
  "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
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
  "available_until": "2026-10-29T10:04:38.853597Z",
  "open": false,
  "tip": {
    "id": "c9858298-1cd8-4726-a52a-8688fd77e037",
    "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:04:41.203143Z"
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
      "id": "e16f9db9-c4fd-4350-831d-569cfb7ce454",
      "at": "2026-10-28T10:04:39.215018Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
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
      "id": "41881072-8a27-49a0-be53-9c24667b0f8d",
      "at": "2026-10-28T10:04:42.281319Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
      "counterpart_id": null
    },
    {
      "id": "e16f9db9-c4fd-4350-831d-569cfb7ce454",
      "at": "2026-10-28T10:04:39.215018Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9b749b8f-90bc-4c88-98b3-76a142b7d83e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed3af0be-bf19-48e3-a183-a693ec31b541",
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
  "last_heartbeat_at": "2026-10-28T10:04:38.152568Z",
  "last_location_at": "2026-10-28T10:04:38.152568Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed3af0be-bf19-48e3-a183-a693ec31b541/close` → **200**

```json
{
  "command_id": "6da8e340-6e98-4c7b-87a3-8ccedf4aa668",
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

Done: card order 9b749b8f-90bc-4c88-98b3-76a142b7d83e.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736100573",
  "device_ref": "sandbox-31477"
}
```

```json
{
  "challenge_id": "e930aad9-6105-49a0-8ab3-c6aee58b83db",
  "expires_at": "2026-10-28T10:09:43.526963625Z",
  "resend_available_at": "2026-10-28T10:04:44.526963625Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736100573` → **200**

```json
{
  "phone": "+380736100573",
  "audience": "CLIENT",
  "code": "373087",
  "sent_at": "2026-10-28T10:04:43.529882867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e930aad9-6105-49a0-8ab3-c6aee58b83db",
  "code": "373087",
  "device_ref": "sandbox-31477"
}
```

```json
{
  "session_id": "792e922d-70ab-4f9e-9ec2-f766a2f608ea",
  "subject": {
    "type": "CLIENT",
    "id": "b0315130-31d5-4287-866e-84e3a223cd8b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDMxNTEzMC0zMWQ1LTQyODctODY2ZS04NGUzYTIyM2NkOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzgzLCJpYXQiOjE3OTMxODE4ODMsImp0aSI6IjQ0MjMwMWM5LTI1MDctNDk0OS05MWU3LTk4MzhmYjEyMWQwOCIsInNpZCI6Ijc5MmU5MjJkLTcwYWItNGY5ZS05ZWMyLWY3NjZhMmY2MDhlYSJ9.XXMs71DfATSyDkPxhqiWTXw--YPMCfZbTyyqpM63SlA",
  "access_expires_at": "2026-10-28T10:19:43.765353739Z",
  "refresh_token": "eIb8xIu9e7-SYpC95TUur1kSq5etxkfeyElSJCZ3j2E",
  "refresh_expires_at": "2026-11-27T10:04:43.764785403Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "157fc4e0-6342-4019-a64c-ca0ccda438d4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "08b325d6-2a5c-40d2-8ce9-b69e9f63f077",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-08b325d6-2a5c-40d2-8ce9-b69e9f63f077",
    "orderDate": "1793181883",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "e4529841fd4256a1e2636743fa3d80ae",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=08b325d6-2a5c-40d2-8ce9-b69e9f63f077",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736100573"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=08b325d6-2a5c-40d2-8ce9-b69e9f63f077",
  "created_at": "2026-10-28T10:04:43.991323Z",
  "expires_at": "2026-10-28T10:34:43.991323Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/08b325d6-2a5c-40d2-8ce9-b69e9f63f077` → **200**

```json
{
  "id": "08b325d6-2a5c-40d2-8ce9-b69e9f63f077",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:04:43.991323Z",
  "expires_at": "2026-10-28T10:34:43.991323Z",
  "completed_at": "2026-10-28T10:04:44.214409Z",
  "masked_pan": "41****4285",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b0315130-31d5-4287-866e-84e3a223cd8b",
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
      "id": "ea8f092d-fac4-48b9-843b-348ba12f719e",
      "at": "2026-10-28T10:04:44.293687Z",
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
  "client_id": "b0315130-31d5-4287-866e-84e3a223cd8b",
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
      "id": "ea8f092d-fac4-48b9-843b-348ba12f719e",
      "at": "2026-10-28T10:04:44.293687Z",
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
  "device_ref": "sandbox-26163"
}
```

```json
{
  "challenge_id": "df43f2bb-b3b2-4b3b-ad06-643da4a98447",
  "expires_at": "2026-10-28T10:09:44.886563307Z",
  "resend_available_at": "2026-10-28T10:04:45.886563307Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "794543",
  "sent_at": "2026-10-28T10:04:44.889173058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df43f2bb-b3b2-4b3b-ad06-643da4a98447",
  "code": "794543",
  "device_ref": "sandbox-26163"
}
```

```json
{
  "session_id": "d12842ec-0d70-4482-a2c0-21a7b73bc5f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc4NSwiaWF0IjoxNzkzMTgxODg1LCJqdGkiOiJlMjYzMTMwMi00MzJlLTQzNjgtYjlmYS0zNDkyM2JjZDRlNmYiLCJzaWQiOiJkMTI4NDJlYy0wZDcwLTQ0ODItYTJjMC0yMWE3YjczYmM1ZjUifQ.COhpHKqICZAo8kfimitYr1gWPcP9TXtVWHCV8Rb-lGw",
  "access_expires_at": "2026-10-28T10:19:45.128995048Z",
  "refresh_token": "lCVeVm1c03HpVIhwbPHu0NdAIskNnLGlSkt8eJGjZPg",
  "refresh_expires_at": "2026-11-27T10:04:45.128401183Z",
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
  "command_id": "580f9ceb-4a01-4e90-bf10-870a67f53be9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "d07da00d-e2c9-467f-97e0-4aefcfc32231",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d07da00d-e2c9-467f-97e0-4aefcfc32231",
    "orderDate": "1793181885",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "e240aa49b1af883a30f374a452221c4e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d07da00d-e2c9-467f-97e0-4aefcfc32231",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d07da00d-e2c9-467f-97e0-4aefcfc32231",
  "created_at": "2026-10-28T10:04:45.565932Z",
  "expires_at": "2026-10-28T10:34:45.565932Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/d07da00d-e2c9-467f-97e0-4aefcfc32231` → **200**

```json
{
  "id": "d07da00d-e2c9-467f-97e0-4aefcfc32231",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:04:45.565932Z",
  "expires_at": "2026-10-28T10:34:45.565932Z",
  "completed_at": "2026-10-28T10:04:45.791844Z",
  "masked_pan": "41****8797",
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
      "id": "46fb6d95-ae24-422c-8361-206f0069c509",
      "at": "2026-10-28T10:04:46.306206Z",
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
  "command_id": "6f9f131c-d01f-4c0a-9810-83df16bde6c6",
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
  "correlation_id": "adb61a86-e99a-4abf-8b5e-b54e0a7be717"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670602951",
  "device_ref": "sandbox-8153"
}
```

```json
{
  "challenge_id": "2e252bd4-c175-483c-81fb-2624e2a3fe58",
  "expires_at": "2026-10-28T10:09:47.707632491Z",
  "resend_available_at": "2026-10-28T10:04:48.707632491Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670602951` → **200**

```json
{
  "phone": "+380670602951",
  "audience": "CLIENT",
  "code": "191309",
  "sent_at": "2026-10-28T10:04:47.71026031Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e252bd4-c175-483c-81fb-2624e2a3fe58",
  "code": "191309",
  "device_ref": "sandbox-8153"
}
```

```json
{
  "session_id": "aee24026-c536-4517-bdd7-809d066e9125",
  "subject": {
    "type": "CLIENT",
    "id": "9975f5a3-6588-4863-baa9-82c118f5ea6f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTc1ZjVhMy02NTg4LTQ4NjMtYmFhOS04MmMxMThmNWVhNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzg3LCJpYXQiOjE3OTMxODE4ODcsImp0aSI6ImNkZmQzYzAzLTAwODEtNDNkYS1iMjY2LTZhODRkNjg0NTlkMiIsInNpZCI6ImFlZTI0MDI2LWM1MzYtNDUxNy1iZGQ3LTgwOWQwNjZlOTEyNSJ9.qx2rkW68PCaZTNdHC9AVrjfPzeuzyL3VQUGblke3QA0",
  "access_expires_at": "2026-10-28T10:19:47.953876832Z",
  "refresh_token": "vQUu4h3k3itD3ETanjax8lZpI_tYBVSiGtig1BMjVpo",
  "refresh_expires_at": "2026-11-27T10:04:47.953300661Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9975f5a3-6588-4863-baa9-82c118f5ea6f",
  "session_id": "aee24026-c536-4517-bdd7-809d066e9125",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f307ea36-82e6-4be7-a1a7-94e87d1f77ee",
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
  "id": "e18cbac2-2c98-443b-944f-1466757f605c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:48.388441Z",
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
  "challenge_id": "f3534390-af9a-4008-a81e-f4cbfead36ce",
  "expires_at": "2026-10-28T10:09:50.62254002Z",
  "resend_available_at": "2026-10-28T10:04:51.62254002Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670602951` → **200**

```json
{
  "phone": "+380670602951",
  "audience": "CLIENT",
  "code": "569563",
  "sent_at": "2026-10-28T10:04:50.625256996Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "371475d3-d1ae-4ef8-a57b-b3c80efeb6d3",
  "challenge_id": "f3534390-af9a-4008-a81e-f4cbfead36ce",
  "otp_code": "569563"
}
```

```json
{
  "client_id": "9975f5a3-6588-4863-baa9-82c118f5ea6f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:04:50.877530596Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "80a6f253-1d9e-49be-a051-39e7e1c1c53f",
  "quote_id": "e18cbac2-2c98-443b-944f-1466757f605c",
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
  "correlation_id": "f201e7c3-a240-4604-b1af-195f016a43f2"
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
  "session_id": "c1bf9159-d3e2-44e3-8202-8c80af312953",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3OTEsImlhdCI6MTc5MzE4MTg5MSwianRpIjoiZjc5NjQzNzAtNzAzMC00MmYwLTk4OWQtMDMzOGQ4NGJkODUyIiwic2lkIjoiYzFiZjkxNTktZDNlMi00NGUzLTgyMDItOGM4MGFmMzEyOTUzIn0._zoSkT07v1WP60gkwEBuDegyDuBm32aUsveR-DPIv68",
  "access_expires_at": "2026-10-28T10:19:51.618051142Z",
  "refresh_token": "cayMydAOUwG_wEsakexa5FaE5Xt53gOW-I7X1C08qq4",
  "refresh_expires_at": "2026-10-28T22:04:51.617448662Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9975f5a3-6588-4863-baa9-82c118f5ea6f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:04:50.877531Z",
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

`POST /api/admin/v1/client-deletions/9975f5a3-6588-4863-baa9-82c118f5ea6f/complete` → **200**

```json
{
  "command_id": "4035986a-e5db-42c5-a81c-1a493dd03be6",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9975f5a3-6588-4863-baa9-82c118f5ea6f",
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
  "correlation_id": "5e861be6-0d92-438d-b606-30e3c700b689"
}
```

Done: client 9975f5a3-6588-4863-baa9-82c118f5ea6f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667311530",
  "device_ref": "sandbox-7125"
}
```

```json
{
  "challenge_id": "4e74ae16-68f9-43ac-9697-db1b63ff5540",
  "expires_at": "2026-10-28T10:09:52.548424056Z",
  "resend_available_at": "2026-10-28T10:04:53.548424056Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667311530` → **200**

```json
{
  "phone": "+380667311530",
  "audience": "CLIENT",
  "code": "658685",
  "sent_at": "2026-10-28T10:04:52.550992379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e74ae16-68f9-43ac-9697-db1b63ff5540",
  "code": "658685",
  "device_ref": "sandbox-7125"
}
```

```json
{
  "session_id": "4bf91095-c6a5-476d-af75-81d6dec30779",
  "subject": {
    "type": "CLIENT",
    "id": "9512db0d-5e53-48a2-aa71-f66ffca357e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTEyZGIwZC01ZTUzLTQ4YTItYWE3MS1mNjZmZmNhMzU3ZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzkyLCJpYXQiOjE3OTMxODE4OTIsImp0aSI6IjY3ZTU5YjdlLTA0MTYtNDZiMS1iMjg2LWQ4YzBlYzUyOTNiNSIsInNpZCI6IjRiZjkxMDk1LWM2YTUtNDc2ZC1hZjc1LTgxZDZkZWMzMDc3OSJ9.Cv1eIBBsij9Fi-ENaCHNK9Q4dXkGRvHP6pITbI07DGM",
  "access_expires_at": "2026-10-28T10:19:52.790250919Z",
  "refresh_token": "u4pXFUNuCzPrMvkrSA-kBciL8f_fSoKBufQLm_LAG0U",
  "refresh_expires_at": "2026-11-27T10:04:52.789719863Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9512db0d-5e53-48a2-aa71-f66ffca357e6",
  "session_id": "4bf91095-c6a5-476d-af75-81d6dec30779",
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
  "session_id": "07b4bca9-b8c9-48d1-a6b2-5869a66b4f05",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3OTMsImlhdCI6MTc5MzE4MTg5MywianRpIjoiNWJiZGE4N2QtYzcyNy00NjI4LTgxYjgtM2ZjY2Y3NWZmOTY4Iiwic2lkIjoiMDdiNGJjYTktYjhjOS00OGQxLWE2YjItNTg2OWE2NmI0ZjA1In0.WvupUh35BMf7AqwP3wcPsrGgoUbo-rJDdejqzqzuVFk",
  "access_expires_at": "2026-10-28T10:19:53.509939058Z",
  "refresh_token": "O-MkWFUGuS-gKOmkRjOFZFRrCmq5igZChGgpZFZG448",
  "refresh_expires_at": "2026-10-28T22:04:53.509269232Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7311530&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "9512db0d-5e53-48a2-aa71-f66ffca357e6",
      "phone": "+380667311530",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:04:52.787848Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/9512db0d-5e53-48a2-aa71-f66ffca357e6` → **200**

```json
{
  "client": {
    "id": "9512db0d-5e53-48a2-aa71-f66ffca357e6",
    "phone": "+380667311530",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:04:52.787848Z",
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

`POST /api/admin/v1/clients/9512db0d-5e53-48a2-aa71-f66ffca357e6/block` → **400**

```json
{
  "command_id": "70adc627-fed2-4eed-8f24-d0563df17d0c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9512db0d-5e53-48a2-aa71-f66ffca357e6/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5120a319-249b-4740-9ae5-66c2dfaa955e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/9512db0d-5e53-48a2-aa71-f66ffca357e6/block` → **200**

```json
{
  "command_id": "710ef73b-7295-41bf-9d7a-ab575f71ef27",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "9512db0d-5e53-48a2-aa71-f66ffca357e6",
  "phone": "+380667311530",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:04:52.787848Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:04:54.459445Z",
    "by": "02955ed8-cc40-4648-a1c0-e2103485b51e"
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
  "correlation_id": "1df9e6dc-6bf6-4738-b839-0b4ac1843d3b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667311530",
  "device_ref": "sandbox-30427"
}
```

```json
{
  "challenge_id": "2a4a3c4e-f4b9-413b-8d37-f1cff964b2d8",
  "expires_at": "2026-10-28T10:09:56.897589596Z",
  "resend_available_at": "2026-10-28T10:04:57.897589596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667311530` → **200**

```json
{
  "phone": "+380667311530",
  "audience": "CLIENT",
  "code": "698961",
  "sent_at": "2026-10-28T10:04:56.900016801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "2a4a3c4e-f4b9-413b-8d37-f1cff964b2d8",
  "code": "698961",
  "device_ref": "sandbox-30427"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "32d4c626-a701-4c69-88b1-4c3bfa041741"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/9512db0d-5e53-48a2-aa71-f66ffca357e6` → **200**

```json
{
  "client": {
    "id": "9512db0d-5e53-48a2-aa71-f66ffca357e6",
    "phone": "+380667311530",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:04:52.787848Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:04:54.459445Z",
      "by": "02955ed8-cc40-4648-a1c0-e2103485b51e"
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

`POST /api/admin/v1/clients/9512db0d-5e53-48a2-aa71-f66ffca357e6/unblock` → **200**

```json
{
  "command_id": "4dccd15b-d58b-4fba-a5cb-39363f849761",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "9512db0d-5e53-48a2-aa71-f66ffca357e6",
  "phone": "+380667311530",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:04:52.787848Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667311530",
  "device_ref": "sandbox-18231"
}
```

```json
{
  "challenge_id": "58a79c7a-1be4-4917-a73c-a291d82cac72",
  "expires_at": "2026-10-28T10:09:59.854707221Z",
  "resend_available_at": "2026-10-28T10:05:00.854707221Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667311530` → **200**

```json
{
  "phone": "+380667311530",
  "audience": "CLIENT",
  "code": "951748",
  "sent_at": "2026-10-28T10:04:59.857321215Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58a79c7a-1be4-4917-a73c-a291d82cac72",
  "code": "951748",
  "device_ref": "sandbox-18231"
}
```

```json
{
  "session_id": "e9b5cfa9-def6-46cb-9436-e979407d8eac",
  "subject": {
    "type": "CLIENT",
    "id": "9512db0d-5e53-48a2-aa71-f66ffca357e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTEyZGIwZC01ZTUzLTQ4YTItYWE3MS1mNjZmZmNhMzU3ZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODAwLCJpYXQiOjE3OTMxODE5MDAsImp0aSI6IjBlOWE5ZGI1LTAyMTEtNGIwNS1iNTlkLTQ1MTA3NjQwNWRiYyIsInNpZCI6ImU5YjVjZmE5LWRlZjYtNDZjYi05NDM2LWU5Nzk0MDdkOGVhYyJ9.HCPK56qs-NGFSuoRxtuNbWX2VTPbkaUH8KaCCWg15MQ",
  "access_expires_at": "2026-10-28T10:20:00.099514071Z",
  "refresh_token": "pBm0A-BczKWQ28GZozUa-uztpQT04DXUnnjSXj2ka0Y",
  "refresh_expires_at": "2026-11-27T10:05:00.098919576Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9512db0d-5e53-48a2-aa71-f66ffca357e6",
  "session_id": "e9b5cfa9-def6-46cb-9436-e979407d8eac",
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
  "phone": "+380662447943",
  "device_ref": "sandbox-8714"
}
```

```json
{
  "challenge_id": "db19f073-2710-4874-8cf5-018f25f750c4",
  "expires_at": "2026-10-28T10:10:00.536001964Z",
  "resend_available_at": "2026-10-28T10:05:01.536001964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662447943` → **200**

```json
{
  "phone": "+380662447943",
  "audience": "CLIENT",
  "code": "290580",
  "sent_at": "2026-10-28T10:05:00.538440974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db19f073-2710-4874-8cf5-018f25f750c4",
  "code": "290580",
  "device_ref": "sandbox-8714"
}
```

```json
{
  "session_id": "39fe8f7c-3e0c-4513-a841-cc91bad6458d",
  "subject": {
    "type": "CLIENT",
    "id": "d8d33830-097f-4527-9a8f-68e2559ab75d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOGQzMzgzMC0wOTdmLTQ1MjctOWE4Zi02OGUyNTU5YWI3NWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODAwLCJpYXQiOjE3OTMxODE5MDAsImp0aSI6IjI4NmY5NjEzLWEwYmMtNDdjZC1hZTE4LTMxY2IwNzhkODZhMyIsInNpZCI6IjM5ZmU4ZjdjLTNlMGMtNDUxMy1hODQxLWNjOTFiYWQ2NDU4ZCJ9.IUlnjP55g1fSFAQGDSCW7WU6RpE4vZNFFB1Vps7UH_s",
  "access_expires_at": "2026-10-28T10:20:00.774405509Z",
  "refresh_token": "7JslzSdnygcysPC77wIocTf-OEJ3j_TkvoXhz4Qx1fo",
  "refresh_expires_at": "2026-11-27T10:05:00.773731424Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69e1709a-cc89-477b-8264-03f25e825f68",
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
  "id": "bf0a67ee-1da2-4b2b-9fe0-26983f7cfa90",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:00.997671Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 39011f6e-d4bd-41cc-a090-1354f02578c4) → **201**

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
  "session_id": "6d2dd2a8-c3f8-478f-a551-b1b9f9276ada",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MDEsImlhdCI6MTc5MzE4MTkwMSwianRpIjoiN2FhMjBhNTQtMDdiMC00M2VmLTgyMGMtZWJlNjJhODhiZTk2Iiwic2lkIjoiNmQyZGQyYTgtYzNmOC00NzhmLWE1NTEtYjFiOWY5Mjc2YWRhIn0.vyalSPFOxt-flm_Cfgoqnb8xceFFZ0qZzG0eOtUrNSU",
  "access_expires_at": "2026-10-28T10:20:01.553239171Z",
  "refresh_token": "ULzORm_rJgc6IJ9Ud-EgsdkgtSf7v6a9pBmJI1XCyS4",
  "refresh_expires_at": "2026-10-28T22:05:01.552633375Z",
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
  "session_id": "f42e1047-9b89-4ef1-ab71-1a7188d76db6",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MDIsImlhdCI6MTc5MzE4MTkwMiwianRpIjoiM2E3ZGYwN2QtMzJlYi00YjM4LWFmYWEtY2ZhYTBlMzczNGQ1Iiwic2lkIjoiZjQyZTEwNDctOWI4OS00ZWYxLWFiNzEtMWE3MTg4ZDc2ZGI2In0.0IbPqY4iy3xEKt_XHlbEW17lgcBcK7I0QusPj4qVG64",
  "access_expires_at": "2026-10-28T10:20:02.060393481Z",
  "refresh_token": "cO04kX3ywt8TU3MKPb3GF1L-5UbGV6JDuWRHmpuWGeU",
  "refresh_expires_at": "2026-10-28T22:05:02.05984343Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/838b755c-d470-4309-8474-123522b66fd2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:05:01.223593Z",
      "actor": {
        "type": "CLIENT",
        "id": "d8d33830-097f-4527-9a8f-68e2559ab75d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "838b755c-d470-4309-8474-123522b66fd2",
        "quote_id": "bf0a67ee-1da2-4b2b-9fe0-26983f7cfa90",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "39011f6e-d4bd-41cc-a090-1354f02578c4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:05:01.225562Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "838b755c-d470-4309-8474-123522b66fd2",
        "attempt_id": "a8819112-df9f-4809-a5e1-6044b9e171fe",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "39011f6e-d4bd-41cc-a090-1354f02578c4"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:05:01.23561Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "838b755c-d470-4309-8474-123522b66fd2",
        "attempt_id": "a8819112-df9f-4809-a5e1-6044b9e171fe"
      },
      "correlation_id": "39011f6e-d4bd-41cc-a090-1354f02578c4"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "a8819112-df9f-4809-a5e1-6044b9e171fe",
        "generation": 1,
        "started_at": "2026-10-28T10:05:01.224434Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:05:01.23561Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:05:01.226553Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/39011f6e-d4bd-41cc-a090-1354f02578c4` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "838b755c-d470-4309-8474-123522b66fd2:0",
      "order_id": "838b755c-d470-4309-8474-123522b66fd2",
      "at": "2026-10-28T10:05:01.223593Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "838b755c-d470-4309-8474-123522b66fd2:1",
      "order_id": "838b755c-d470-4309-8474-123522b66fd2",
      "at": "2026-10-28T10:05:01.225562Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "838b755c-d470-4309-8474-123522b66fd2:2",
      "order_id": "838b755c-d470-4309-8474-123522b66fd2",
      "at": "2026-10-28T10:05:01.23561Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/45f47977-144e-40cd-ba6b-bbc086b37b95` → **200**

```json
{
  "found": []
}
```

Done: request 39011f6e-d4bd-41cc-a090-1354f02578c4 — order 838b755c-d470-4309-8474-123522b66fd2 found by its id.

`GET /api/rider/v1/orders/838b755c-d470-4309-8474-123522b66fd2` → **200**

```json
{
  "id": "838b755c-d470-4309-8474-123522b66fd2",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d8d33830-097f-4527-9a8f-68e2559ab75d",
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
  "created_at": "2026-10-28T10:05:01.222973Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/838b755c-d470-4309-8474-123522b66fd2/cancel` → **200**

```json
{
  "command_id": "30ef08df-9b8a-4043-bb3e-cd2b08847267",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "838b755c-d470-4309-8474-123522b66fd2",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d8d33830-097f-4527-9a8f-68e2559ab75d",
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
  "created_at": "2026-10-28T10:05:01.222973Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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
  "phone": "+380639870058",
  "device_ref": "sandbox-9447"
}
```

```json
{
  "challenge_id": "678955a1-0b5c-4256-b1ee-528029ad5888",
  "expires_at": "2026-10-28T10:10:03.429267129Z",
  "resend_available_at": "2026-10-28T10:05:04.429267129Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639870058` → **200**

```json
{
  "phone": "+380639870058",
  "audience": "CLIENT",
  "code": "056182",
  "sent_at": "2026-10-28T10:05:03.432277061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "678955a1-0b5c-4256-b1ee-528029ad5888",
  "code": "056182",
  "device_ref": "sandbox-9447"
}
```

```json
{
  "session_id": "7bacd904-a902-4f5e-a5f8-e3aea3515536",
  "subject": {
    "type": "CLIENT",
    "id": "61afae41-c6f9-4cca-be0d-868ef97d90ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWFmYWU0MS1jNmY5LTRjY2EtYmUwZC04NjhlZjk3ZDkwZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODAzLCJpYXQiOjE3OTMxODE5MDMsImp0aSI6ImU5ODAxMmE3LWEzYTYtNDM0YS04NzRmLTc1NGYwMTJjMDhkYyIsInNpZCI6IjdiYWNkOTA0LWE5MDItNGY1ZS1hNWY4LWUzYWVhMzUxNTUzNiJ9.PVdIHN6rWjxug43qJhF_BfTEhb-bzP55Y4-_5onCZeI",
  "access_expires_at": "2026-10-28T10:20:03.677067445Z",
  "refresh_token": "2vUdeKCduDSt-mEzuFjcsa_H2Qxu0cyg-OnkgsyfyaE",
  "refresh_expires_at": "2026-11-27T10:05:03.676535547Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "0fe2590a-9dd9-4de8-9928-a8daccfb79b8",
  "expires_at": "2026-10-28T10:10:05.893609038Z",
  "resend_available_at": "2026-10-28T10:05:06.893609038Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639870058` → **200**

```json
{
  "phone": "+380639870058",
  "audience": "CLIENT",
  "code": "930367",
  "sent_at": "2026-10-28T10:05:05.895510664Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "6c0f77a0-402b-4ea0-8d86-65b6eb184286",
  "challenge_id": "0fe2590a-9dd9-4de8-9928-a8daccfb79b8",
  "otp_code": "930367"
}
```

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "PENDING",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672` → **200**

```json
{
  "id": "eb41a866-f899-49f9-bd29-0525835a3672",
  "state": "READY",
  "created_at": "2026-10-28T10:05:06.140414Z",
  "ready_at": "2026-10-28T10:05:13.813028Z",
  "expires_at": "2026-11-04T10:05:13.813028Z",
  "size_bytes": 1027
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638086288",
  "device_ref": "sandbox-27369"
}
```

```json
{
  "challenge_id": "5fde8797-484c-452f-b413-1e17f9c65db2",
  "expires_at": "2026-10-28T10:10:15.113928494Z",
  "resend_available_at": "2026-10-28T10:05:16.113928494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638086288` → **200**

```json
{
  "phone": "+380638086288",
  "audience": "CLIENT",
  "code": "851473",
  "sent_at": "2026-10-28T10:05:15.116329676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fde8797-484c-452f-b413-1e17f9c65db2",
  "code": "851473",
  "device_ref": "sandbox-27369"
}
```

```json
{
  "session_id": "3f54af0a-ec28-4c9e-98ed-9e2393768688",
  "subject": {
    "type": "CLIENT",
    "id": "45e9089c-ee5a-4211-983f-cfb9dc35bac4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NWU5MDg5Yy1lZTVhLTQyMTEtOTgzZi1jZmI5ZGMzNWJhYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODE1LCJpYXQiOjE3OTMxODE5MTUsImp0aSI6IjBiNDg3ODM5LWJlMjgtNDMwOC1iYmI3LTNhM2JmZGZjNTVmOSIsInNpZCI6IjNmNTRhZjBhLWVjMjgtNGM5ZS05OGVkLTllMjM5Mzc2ODY4OCJ9.dOvLs0ZM5f_-hAFs_uIzyENRmI8zjHIGeAbUbVIrP30",
  "access_expires_at": "2026-10-28T10:20:15.353560141Z",
  "refresh_token": "pThpDlDdrixtifDwAQSTTqXf6Bsd5boL-U6IP57CBII",
  "refresh_expires_at": "2026-11-27T10:05:15.353006225Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/eb41a866-f899-49f9-bd29-0525835a3672/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3533095c-5382-4f3f-9f68-4d9efead07b6"
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
  "session_id": "f9697d69-f812-4fc4-9d0a-396f8e2c7173",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MTYsImlhdCI6MTc5MzE4MTkxNiwianRpIjoiOThiYTZkNmYtZGI2Yy00N2FlLTkxODUtYjk2MDAyNzBhYWM4Iiwic2lkIjoiZjk2OTdkNjktZjgxMi00ZmM0LTlkMGEtMzk2ZjhlMmM3MTczIn0.5ecBAXKZdKelhRD1Pd4_e207Yw8YIolaQZjTfPXtFvQ",
  "access_expires_at": "2026-10-28T10:20:16.07886552Z",
  "refresh_token": "oOy51oIpbdro5I71QjTBiqYghXBLB5bSifuaCP7shJU",
  "refresh_expires_at": "2026-10-28T22:05:16.078269687Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "61afae41-c6f9-4cca-be0d-868ef97d90ef",
  "session_id": "7bacd904-a902-4f5e-a5f8-e3aea3515536",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/61afae41-c6f9-4cca-be0d-868ef97d90ef/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "eb41a866-f899-49f9-bd29-0525835a3672",
      "state": "READY",
      "created_at": "2026-10-28T10:05:06.140414Z",
      "ready_at": "2026-10-28T10:05:13.813028Z",
      "expires_at": "2026-11-04T10:05:13.813028Z",
      "size_bytes": 1027
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
  "device_ref": "sandbox-17738"
}
```

```json
{
  "challenge_id": "80ffca96-845c-4928-b9a4-0956b11fde17",
  "expires_at": "2026-10-28T10:10:16.725415351Z",
  "resend_available_at": "2026-10-28T10:05:17.725415351Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "601660",
  "sent_at": "2026-10-28T10:05:16.72764708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80ffca96-845c-4928-b9a4-0956b11fde17",
  "code": "601660",
  "device_ref": "sandbox-17738"
}
```

```json
{
  "session_id": "d09e46ba-f368-4ad4-a9c4-66e052eba17e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjgxNiwiaWF0IjoxNzkzMTgxOTE2LCJqdGkiOiI3NzAyNTJlZS00ZjM2LTRhOTAtOTQ1Zi00NTRjN2RlN2YwZTEiLCJzaWQiOiJkMDllNDZiYS1mMzY4LTRhZDQtYTljNC02NmUwNTJlYmExN2UifQ.2tLit2s84LyPY4tCaGI7Eft-NExThMWNX3fWzGcs9Ss",
  "access_expires_at": "2026-10-28T10:20:16.967282216Z",
  "refresh_token": "PdPt3V9GYhbf29k1iWvr2_vxlRRN73D6iqLjV0pjEyA",
  "refresh_expires_at": "2026-11-27T10:05:16.966705094Z",
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
  "device_ref": "sandbox-24451"
}
```

```json
{
  "challenge_id": "710581e9-1d39-423e-84d6-ac1c8c5682c7",
  "expires_at": "2026-10-28T10:10:17.391544635Z",
  "resend_available_at": "2026-10-28T10:05:18.391544635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "489931",
  "sent_at": "2026-10-28T10:05:17.393850755Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "710581e9-1d39-423e-84d6-ac1c8c5682c7",
  "code": "489931",
  "device_ref": "sandbox-24451"
}
```

```json
{
  "session_id": "f28b8f48-0b31-4b30-8b8c-31d766a46361",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjgxNywiaWF0IjoxNzkzMTgxOTE3LCJqdGkiOiJiNTk1ODgyZC1iMzhmLTQ0ZWEtODVjNi02ZWU1YTBjNTQxM2UiLCJzaWQiOiJmMjhiOGY0OC0wYjMxLTRiMzAtOGI4Yy0zMWQ3NjZhNDYzNjEifQ.oFbaayjo6bK3Y2xtiPFDrknPwriG7a_Dl14PD0q6eiM",
  "access_expires_at": "2026-10-28T10:20:17.631665873Z",
  "refresh_token": "PZIVjUybxYGWMPXJnYPY-IxCKKwfFGKylWibYLo2vDk",
  "refresh_expires_at": "2026-11-27T10:05:17.63108276Z",
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
  "command_id": "b567796e-a2e2-44c5-a796-785eadf60987",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:18Z",
    "sequence": 1793181918692
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99f66a5c-0b27-4484-9d5d-2e74247c2f0d",
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
  "last_heartbeat_at": "2026-10-28T10:05:18.087903Z",
  "last_location_at": "2026-10-28T10:05:18.087903Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9231"
}
```

```json
{
  "challenge_id": "ee859d16-0c1a-42fd-9f7d-01d1d1a44353",
  "expires_at": "2026-10-28T10:10:18.306008776Z",
  "resend_available_at": "2026-10-28T10:05:19.306008776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "918663",
  "sent_at": "2026-10-28T10:05:18.308272355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee859d16-0c1a-42fd-9f7d-01d1d1a44353",
  "code": "918663",
  "device_ref": "sandbox-9231"
}
```

```json
{
  "session_id": "1fb90b47-bba2-4399-ae4e-20ac192bd496",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjgxOCwiaWF0IjoxNzkzMTgxOTE4LCJqdGkiOiIyODJmYWE3Zi1iOGEwLTQ3NzgtOThkZC1mMTAwYTZlZDBhODkiLCJzaWQiOiIxZmI5MGI0Ny1iYmEyLTQzOTktYWU0ZS0yMGFjMTkyYmQ0OTYifQ.60PwXfPMRkBw7L6w52_wdQ1X6zSDtWwAucwCtTrGWgE",
  "access_expires_at": "2026-10-28T10:20:18.548672891Z",
  "refresh_token": "lt55IvOc2JCW2sM15PSfkk1b-Jr_EC5ggKDSIoTEw5c",
  "refresh_expires_at": "2026-11-27T10:05:18.548010348Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "974e85a3-5651-4b63-84ed-c8835a10ab81",
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
  "last_heartbeat_at": "2026-10-28T10:04:30.326154Z",
  "last_location_at": "2026-10-28T10:04:30.326154Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/974e85a3-5651-4b63-84ed-c8835a10ab81/handover` → **200**

```json
{
  "command_id": "489c6b33-92a1-4395-8a52-b48cd7ec7c9e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "974e85a3-5651-4b63-84ed-c8835a10ab81",
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
  "last_heartbeat_at": "2026-10-28T10:04:30.326154Z",
  "last_location_at": "2026-10-28T10:04:30.326154Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/974e85a3-5651-4b63-84ed-c8835a10ab81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:19Z",
    "sequence": 1793181919197
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "974e85a3-5651-4b63-84ed-c8835a10ab81",
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
  "last_heartbeat_at": "2026-10-28T10:05:19.21726Z",
  "last_location_at": "2026-10-28T10:05:19.21726Z",
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
  "session_id": "5518ac00-4259-46f3-9277-f90be00668dc",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MTksImlhdCI6MTc5MzE4MTkxOSwianRpIjoiZGI0YjAzNTEtMGQ4OC00MmQ2LWE0ZWUtYTVmYzZiNzVlN2E1Iiwic2lkIjoiNTUxOGFjMDAtNDI1OS00NmYzLTkyNzctZjkwYmUwMDY2OGRjIn0.b2LIk0YisjWctZFcpUr474bdiaoi8AEXIfGCZp2-eEI",
  "access_expires_at": "2026-10-28T10:20:19.722780518Z",
  "refresh_token": "rY_UmEcAXH_8mWzooLHULGsVoX26E-KHX8C0X8x9GRA",
  "refresh_expires_at": "2026-10-28T22:05:19.722079383Z",
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
  "session_id": "74dc4852-e0ec-46ab-9f2f-7ad09d8133ec",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MjAsImlhdCI6MTc5MzE4MTkyMCwianRpIjoiYTI5MGZlZTYtMTQyMS00NTEwLTk3NzUtZjZiNjA3NjRjOGIwIiwic2lkIjoiNzRkYzQ4NTItZTBlYy00NmFiLTlmMmYtN2FkMDlkODEzM2VjIn0.NXWlaw_7fbEm5hPGvfS8qV7TMFnvFlmEvSfYgbWFUWA",
  "access_expires_at": "2026-10-28T10:20:20.222822972Z",
  "refresh_token": "LQmwL3Bavd0eoq3uu8_IRfUmDNXXMqf18BrmpgMxbcY",
  "refresh_expires_at": "2026-10-28T22:05:20.222265596Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687674537",
  "device_ref": "sandbox-10396"
}
```

```json
{
  "challenge_id": "032bbcaf-ef50-4691-a66e-97de2a27da7e",
  "expires_at": "2026-10-28T10:10:20.433949278Z",
  "resend_available_at": "2026-10-28T10:05:21.433949278Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380687674537` → **200**

```json
{
  "phone": "+380687674537",
  "audience": "CLIENT",
  "code": "574934",
  "sent_at": "2026-10-28T10:05:20.436611924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "032bbcaf-ef50-4691-a66e-97de2a27da7e",
  "code": "574934",
  "device_ref": "sandbox-10396"
}
```

```json
{
  "session_id": "3cd2dd69-7f1f-46c6-8eca-63d14f9c93f3",
  "subject": {
    "type": "CLIENT",
    "id": "36370105-39be-46be-a186-770adec61e54"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNjM3MDEwNS0zOWJlLTQ2YmUtYTE4Ni03NzBhZGVjNjFlNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODIwLCJpYXQiOjE3OTMxODE5MjAsImp0aSI6IjIxYTEwNTJkLWVhMjYtNGQ5ZS04NmI1LTVmNGI3MGYyOGE0ZiIsInNpZCI6IjNjZDJkZDY5LTdmMWYtNDZjNi04ZWNhLTYzZDE0ZjljOTNmMyJ9.2Bc4e6XPbedzl_5Rp2oU7wvtMUISUyjQJ5W0BtYs1k4",
  "access_expires_at": "2026-10-28T10:20:20.676091741Z",
  "refresh_token": "wkd2RDjDe7RSX-tvJUzDVnU8PaLquyVx2We3SIqMBxA",
  "refresh_expires_at": "2026-11-27T10:05:20.675436366Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08a16512-d413-47b1-a277-f3644f3f252f",
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
  "id": "c74496be-f1b2-40f1-9e92-aa68ab86c9d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:20.900106Z",
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
  "command_id": "20d2c6de-bf86-4048-9f7b-042ae1737044",
  "quote_id": "c74496be-f1b2-40f1-9e92-aa68ab86c9d1",
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
  "id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "36370105-39be-46be-a186-770adec61e54",
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
  "created_at": "2026-10-28T10:05:21.133182Z",
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
    "id": "2f070cea-bdd9-4c59-9770-6447950f8ece",
    "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
    "expires_at": "2026-10-28T10:05:36.13662Z",
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

`POST /api/driver/v1/offers/2f070cea-bdd9-4c59-9770-6447950f8ece/reject` → **204**

```json
{
  "command_id": "a8d439d7-9ea4-47a4-aea4-3b6a46aa23a8"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f592dcca-7ea3-4cbd-8287-ba06ebd261da",
    "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
    "expires_at": "2026-10-28T10:05:36.595269Z",
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

`POST /api/driver/v1/offers/f592dcca-7ea3-4cbd-8287-ba06ebd261da/accept` → **200**

```json
{
  "command_id": "a29d3b71-ce95-4eed-b877-ee51cc282703"
}
```

```json
{
  "id": "694b3f8b-590f-4ca2-b283-eb97badeeed4",
  "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a5d55ec-3401-48c2-a59f-06a0fccb6cac",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:05:21.13376Z",
      "actor": {
        "type": "CLIENT",
        "id": "36370105-39be-46be-a186-770adec61e54",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
        "quote_id": "c74496be-f1b2-40f1-9e92-aa68ab86c9d1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cc811067-73cb-4590-8cda-4f4e2ce98f65"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:05:21.13572Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
        "attempt_id": "1667cbc1-4b8d-46ad-98d2-5c274076b4ae",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cc811067-73cb-4590-8cda-4f4e2ce98f65"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:05:21.142527Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2f070cea-bdd9-4c59-9770-6447950f8ece",
        "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "cc811067-73cb-4590-8cda-4f4e2ce98f65"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:05:21.594236Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2f070cea-bdd9-4c59-9770-6447950f8ece",
        "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c"
      },
      "correlation_id": "29cad6bd-65b0-4333-a7b6-cbee9d455e79"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c` → **200**

```json
{
  "id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "36370105-39be-46be-a186-770adec61e54",
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
    "id": "694b3f8b-590f-4ca2-b283-eb97badeeed4",
    "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4a5d55ec-3401-48c2-a59f-06a0fccb6cac",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:05:21.133182Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c/cancel` → **200**

```json
{
  "command_id": "9f6b2afe-0f92-4667-9bca-e823503ef876",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "36370105-39be-46be-a186-770adec61e54",
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
    "id": "694b3f8b-590f-4ca2-b283-eb97badeeed4",
    "order_id": "75cb7e0a-c4bd-4d3c-a5ef-dbeffa32396c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4a5d55ec-3401-48c2-a59f-06a0fccb6cac",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:05:21.133182Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
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
  "session_id": "99f66a5c-0b27-4484-9d5d-2e74247c2f0d",
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
  "last_heartbeat_at": "2026-10-28T10:05:18.087903Z",
  "last_location_at": "2026-10-28T10:05:18.087903Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99f66a5c-0b27-4484-9d5d-2e74247c2f0d/close` → **200**

```json
{
  "command_id": "5a0fa125-e55b-4e06-821a-f7969e15dbab",
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
  "session_id": "974e85a3-5651-4b63-84ed-c8835a10ab81",
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
  "last_heartbeat_at": "2026-10-28T10:05:19.21726Z",
  "last_location_at": "2026-10-28T10:05:19.21726Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/974e85a3-5651-4b63-84ed-c8835a10ab81/close` → **200**

```json
{
  "command_id": "0ef7b388-34cf-4fc3-9aeb-4dc2731cade8",
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
  "device_ref": "sandbox-15113"
}
```

```json
{
  "challenge_id": "bfb92a8f-5b0b-4142-9c8c-9641c8201b5b",
  "expires_at": "2026-10-28T10:10:23.930780704Z",
  "resend_available_at": "2026-10-28T10:05:24.930780704Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "073479",
  "sent_at": "2026-10-28T10:05:23.933123723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfb92a8f-5b0b-4142-9c8c-9641c8201b5b",
  "code": "073479",
  "device_ref": "sandbox-15113"
}
```

```json
{
  "session_id": "14f89692-726f-440e-b807-5f5828d7ed86",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjgyNCwiaWF0IjoxNzkzMTgxOTI0LCJqdGkiOiJmYTk1YzUxZS0wZGVlLTQ2ODMtYWZhNS0wMTQ4ZGUwMzlmZDIiLCJzaWQiOiIxNGY4OTY5Mi03MjZmLTQ0MGUtYjgwNy01ZjU4MjhkN2VkODYifQ.A7wLAHiiuHsqf4Zg49R70dUkb5tGZ7cTMEfmvkP06jk",
  "access_expires_at": "2026-10-28T10:20:24.177897452Z",
  "refresh_token": "-agKNirRvOjDgqe-nLBc86I0Z96amuy9NPs7oIOJKyQ",
  "refresh_expires_at": "2026-11-27T10:05:24.177223278Z",
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
  "command_id": "dc8bffac-27a5-4fe2-81a1-9b184b5c8d14",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:24Z",
    "sequence": 1793181924606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:24.624847Z",
  "last_location_at": "2026-10-28T10:05:24.624847Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672037311",
  "device_ref": "sandbox-16190"
}
```

```json
{
  "challenge_id": "c66db1b6-eaa9-4caa-b932-715a3a9fe172",
  "expires_at": "2026-10-28T10:10:24.850518731Z",
  "resend_available_at": "2026-10-28T10:05:25.850518731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672037311` → **200**

```json
{
  "phone": "+380672037311",
  "audience": "CLIENT",
  "code": "810417",
  "sent_at": "2026-10-28T10:05:24.852799629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c66db1b6-eaa9-4caa-b932-715a3a9fe172",
  "code": "810417",
  "device_ref": "sandbox-16190"
}
```

```json
{
  "session_id": "582abd2a-d8e3-442e-a2cc-aaf16abf93f3",
  "subject": {
    "type": "CLIENT",
    "id": "e8145d2e-2f61-4069-b220-392fbf9d9c64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlODE0NWQyZS0yZjYxLTQwNjktYjIyMC0zOTJmYmY5ZDljNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODI1LCJpYXQiOjE3OTMxODE5MjUsImp0aSI6ImEzNDlhYzI3LWRkYmEtNGE2NS05NWIzLWVmYzRmNDdkYWU3NiIsInNpZCI6IjU4MmFiZDJhLWQ4ZTMtNDQyZS1hMmNjLWFhZjE2YWJmOTNmMyJ9.YZbjVhxXuo37g1-XJ2lbXu8eePnO3jeR1FbSrQZPcGs",
  "access_expires_at": "2026-10-28T10:20:25.094295492Z",
  "refresh_token": "ei6maC4RGD0RLFUu2fmBrrsfTn5Sg4a0Ov3Op4YIINM",
  "refresh_expires_at": "2026-11-27T10:05:25.093768234Z",
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
  "command_id": "07b66fd8-66a9-4b5e-88b2-80662ea93070",
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
  "id": "8dcccb02-d4c2-4ce8-a796-6a324d79af50",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:25.538264Z",
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
  "command_id": "395f8626-8188-4bb9-bec5-4944af1c06b3",
  "platform": "ANDROID",
  "token": "sandbox-driver-e0ff5a55-0deb-4e53-b615-5d83b438a79f"
}
```

```json
{
  "id": "f6b89d35-cc7d-40c3-9616-f1514c59528f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:05:25.790568Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "137711b7-2c85-49da-96f6-154b568a3d22",
  "platform": "ANDROID",
  "token": "sandbox-rider-aac4784f-d2b0-4bd0-9180-5ffcb0cefcde"
}
```

```json
{
  "id": "710d5607-7549-44e2-9e79-9cbeb20358a6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:05:26.020669Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "637606a2-c6c5-4d63-a5ba-fe8a001b2f8c",
  "quote_id": "8dcccb02-d4c2-4ce8-a796-6a324d79af50",
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
  "id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8145d2e-2f61-4069-b220-392fbf9d9c64",
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
  "created_at": "2026-10-28T10:05:26.251735Z",
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
    "id": "997f1434-5ed3-4cfd-abf0-8c94c3a5df4e",
    "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
    "expires_at": "2026-10-28T10:05:41.255109Z",
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

`POST /api/driver/v1/offers/997f1434-5ed3-4cfd-abf0-8c94c3a5df4e/accept` → **200**

```json
{
  "command_id": "afe96bbb-c6b2-4bad-b2cb-25cac48e4f2b"
}
```

```json
{
  "id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:05:26.227Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:05:26.227Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:05:27.011764274Z",
    "token_suffix": "38a79f",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
      "order_version": "2",
      "event_id": "7977a180-1244-477f-ad18-ebd787e4250d"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672037311&after=2026-10-28T10:05:26.227Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672037311&after=2026-10-28T10:05:26.227Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:05:28.015323007Z",
    "token_suffix": "cefcde",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
      "order_version": "3",
      "event_id": "479e19ec-99a2-4986-a9cd-9db403982cd9"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/090e5aa8-7196-41cc-9581-c7d6e3d20ae2/messages` → **201**

```json
{
  "command_id": "a5decd4f-08e3-43f4-8323-6ba17e0a3c40",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "4f9143eb-45a5-4079-911a-0fd983920f4a",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:05:29.05168228Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "assignment_id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19",
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

`POST /api/driver/v1/trips/1a2e6587-04be-46b9-a2c3-e291737b3322/messages` → **201**

```json
{
  "command_id": "cc2a0308-ac47-4a37-aecb-cb80f722c659",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d649948f-d0e5-4fda-bdcb-208c278059d3",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:05:29.478908122Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/090e5aa8-7196-41cc-9581-c7d6e3d20ae2/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/1a2e6587-04be-46b9-a2c3-e291737b3322/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672037311"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:30Z",
    "sequence": 1793181930109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:30.127843Z",
  "last_location_at": "2026-10-28T10:05:30.127843Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "assignment_id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19",
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

`POST /api/driver/v1/trips/1a2e6587-04be-46b9-a2c3-e291737b3322/arrive` → **200**

```json
{
  "command_id": "7037f5d7-5fb1-481b-bfc7-3f850543eff4",
  "expected_version": 0
}
```

```json
{
  "id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "assignment_id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19",
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
  "arrived_at": "2026-10-28T10:05:30.572188Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1a2e6587-04be-46b9-a2c3-e291737b3322/start` → **200**

```json
{
  "command_id": "3ae5eff4-e65e-4a5d-b071-01d9a9580327",
  "expected_version": 1
}
```

```json
{
  "id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "assignment_id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19",
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
  "arrived_at": "2026-10-28T10:05:30.572188Z",
  "started_at": "2026-10-28T10:05:30.798905Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:31Z",
    "sequence": 1793181931112
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:31.029422Z",
  "last_location_at": "2026-10-28T10:05:31.029422Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/1a2e6587-04be-46b9-a2c3-e291737b3322/complete` → **200**

```json
{
  "command_id": "72fe8bfe-3774-495b-87eb-7ce5543c07fb",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:05:31Z",
  "cash_received": true
}
```

```json
{
  "id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "assignment_id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19",
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
  "arrived_at": "2026-10-28T10:05:30.572188Z",
  "started_at": "2026-10-28T10:05:30.798905Z",
  "completed_at": "2026-10-28T10:05:31.251744Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/090e5aa8-7196-41cc-9581-c7d6e3d20ae2` → **200**

```json
{
  "id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e8145d2e-2f61-4069-b220-392fbf9d9c64",
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
    "id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19",
    "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:05:26.251735Z",
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
    "id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:05:26.251735Z",
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
    "id": "1a2e6587-04be-46b9-a2c3-e291737b3322",
    "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:05:26.707773Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2808482b-5a52-4f52-aa44-4711721c5eb5",
    "order_id": "81b258e7-d877-44ab-a977-dd2677a1e9b2",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:04:06.999761Z",
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

`GET /api/rider/v1/orders/090e5aa8-7196-41cc-9581-c7d6e3d20ae2/tip` → **200**

```json
{
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
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
  "available_until": "2026-10-29T10:05:31.251744Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/090e5aa8-7196-41cc-9581-c7d6e3d20ae2/tip` → **201**

```json
{
  "command_id": "7d15c41c-b13d-43b6-a3da-8d5b0addd0c9",
  "amount_minor": 1100
}
```

```json
{
  "id": "9b87fb27-b720-4b23-bf92-2bb003cf5b49",
  "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:05:35.799638Z"
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
  "session_id": "ab746db5-de1a-4977-aeb5-a2911099e177",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MzYsImlhdCI6MTc5MzE4MTkzNiwianRpIjoiZTQ5Y2ViNjItMjIxOS00OTNiLTk5NDAtZDdhYzE1Y2ZkNGQ3Iiwic2lkIjoiYWI3NDZkYjUtZGUxYS00OTc3LWFlYjUtYTI5MTEwOTllMTc3In0.QruIquwr6rys--yWtgjAzy22a_Q529gUyn5AT-84l18",
  "access_expires_at": "2026-10-28T10:20:36.330941427Z",
  "refresh_token": "Cal2SDxI3TF0DEUZXEN_cPj_Ca3YfKbiRm6zOkji9eo",
  "refresh_expires_at": "2026-10-28T22:05:36.330227788Z",
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
          "CASH": 6,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 1,
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
      "CASH": 6,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "STAFF": 1,
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
  "generated_at": "2026-10-28T10:05:36.551717251Z"
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
  "generated_at": "2026-10-28T10:05:36.776274173Z"
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
  "session_id": "0853fd11-7832-4f3b-9cd8-261ec8557e98",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MzcsImlhdCI6MTc5MzE4MTkzNywianRpIjoiZTgzYTM2YWItMGUzNi00YzAzLWI5MmYtZWE1OTI4YjczNzc3Iiwic2lkIjoiMDg1M2ZkMTEtNzgzMi00ZjNiLTljZDgtMjYxZWM4NTU3ZTk4In0.iNAkvQYDNES0AoxupFJQcnoGLryP6gVnBJXPvHsyS20",
  "access_expires_at": "2026-10-28T10:20:37.288558604Z",
  "refresh_token": "wm9hnqPOgfBL66PObg1HDoVeJCoa2bX57Iu7mB5bkaE",
  "refresh_expires_at": "2026-10-28T22:05:37.287900813Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/090e5aa8-7196-41cc-9581-c7d6e3d20ae2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:05:26.252267Z",
      "actor": {
        "type": "CLIENT",
        "id": "e8145d2e-2f61-4069-b220-392fbf9d9c64",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
        "quote_id": "8dcccb02-d4c2-4ce8-a796-6a324d79af50",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "90709853-7c07-415e-a179-8219c22fabdb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:05:26.254202Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
        "attempt_id": "3348da09-02f7-45f0-9a42-29adf0dab770",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "90709853-7c07-415e-a179-8219c22fabdb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:05:26.260841Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "997f1434-5ed3-4cfd-abf0-8c94c3a5df4e",
        "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "90709853-7c07-415e-a179-8219c22fabdb"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:05:26.709822Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "997f1434-5ed3-4cfd-abf0-8c94c3a5df4e",
        "order_id": "090e5aa8-7196-41cc-9581-c7d6e3d20ae2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9a0e4ede-7ff4-4975-b4eb-bf7e74381e19"
      },
      "correlation_id": "e30e7a2f-6926-4706-ba54-2ff450dd19ac"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:05:37.724976374Z",
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
      "last_location_at": "2026-10-28T10:05:31.029422Z",
      "order_id": null
    }
  ]
}
```

Done: order 090e5aa8-7196-41cc-9581-c7d6e3d20ae2.

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
  "session_id": "9ad17110-9821-4066-b488-61eaddc91fc1",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MzgsImlhdCI6MTc5MzE4MTkzOCwianRpIjoiYjNlNzcxMmMtYThjNi00ZjZkLThmOTgtOWY1NDRkNmY5MjFiIiwic2lkIjoiOWFkMTcxMTAtOTgyMS00MDY2LWI0ODgtNjFlYWRkYzkxZmMxIn0.NU_9p5hc_SYZkCNB9DgpjgAXCy_S5LfOcrLK9ZxJ_Gc",
  "access_expires_at": "2026-10-28T10:20:38.255818354Z",
  "refresh_token": "5NsHlWYEb50I406XgXGuSuEb9a51nfkKhGcrqVxnkck",
  "refresh_expires_at": "2026-10-28T22:05:38.255190975Z",
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
  "command_id": "07597cb3-4d88-4e04-9258-0f6b882b7d9b",
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
  "timestamp": "2026-10-28T10:05:38.000+0000",
  "channel": {
    "id": "1730052000.1707327399",
    "linkedid": "1730052000.1707327399",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679160543"
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
  "timestamp": "2026-10-28T10:05:38.000+0000",
  "channel": {
    "id": "1730052000.1707327399",
    "linkedid": "1730052000.1707327399",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679160543"
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
  "session_id": "f911435f-1ea5-4093-8b4a-76c726c97ec6",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4MzksImlhdCI6MTc5MzE4MTkzOSwianRpIjoiNzE4ZmY2OTctM2QzNy00MjQ3LWJkYmEtNzMxOGE2ZDJlZWU1Iiwic2lkIjoiZjkxMTQzNWYtMWVhNS00MDkzLThiNGEtNzZjNzI2Yzk3ZWM2In0.Kjog2YfPf89wd8aqFka1R3hODKdCCds5MwFGmxLmwZI",
  "access_expires_at": "2026-10-28T10:20:39.235513352Z",
  "refresh_token": "s03X3h-xEWx7wqK5PLJY6NsSg_ZKaXvAC2MyQhTVOM0",
  "refresh_expires_at": "2026-10-28T22:05:39.234936169Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5b7d42c2-3e25-4109-9761-a3b2f137894f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679160543",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:05:38Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/5b7d42c2-3e25-4109-9761-a3b2f137894f/answer` → **200**

```json
{
  "command_id": "337d4b04-38c2-431f-b56a-c055050c9cbf"
}
```

```json
{
  "id": "5b7d42c2-3e25-4109-9761-a3b2f137894f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679160543",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "order_ids": [],
  "started_at": "2026-10-28T10:05:38Z",
  "answered_at": "2026-10-28T10:05:39.682061Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1707327399",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "94510cbf-4d31-49a3-a069-1a1e06ffbdbe",
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
  "id": "9bbe13b0-d34b-4110-a720-3a64b1df63ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:39.940647Z",
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
  "command_id": "9e251c6f-93f0-4922-bf32-5cbf2816829b",
  "quote_id": "9bbe13b0-d34b-4110-a720-3a64b1df63ca",
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
    "phone": "+380679160543"
  },
  "call_id": "5b7d42c2-3e25-4109-9761-a3b2f137894f"
}
```

```json
{
  "id": "ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40",
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
  "created_at": "2026-10-28T10:05:40.186912Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679160543"
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
    "id": "1730052000.1707327399",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5b7d42c2-3e25-4109-9761-a3b2f137894f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679160543",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [
        "ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40"
      ],
      "started_at": "2026-10-28T10:05:38Z",
      "answered_at": "2026-10-28T10:05:39.682061Z",
      "ended_at": "2026-10-28T10:05:40.430609Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "186daef1-b5af-466d-92b9-5eec7bcd1bc5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678351103",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [],
      "started_at": "2026-10-28T10:04:14.155249Z",
      "answered_at": "2026-10-28T10:04:14.411384Z",
      "ended_at": "2026-10-28T10:04:14.656286Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:04:23.806344Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40` → **200**

```json
{
  "id": "ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40",
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
  "created_at": "2026-10-28T10:05:40.186912Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679160543"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40` → **200**

```json
{
  "id": "ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40",
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
  "created_at": "2026-10-28T10:05:40.186912Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679160543"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40/cancel` → **200**

```json
{
  "command_id": "94032782-74e9-458b-af8a-061efb750a31",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40",
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
  "created_at": "2026-10-28T10:05:40.186912Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679160543"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 5b7d42c2-3e25-4109-9761-a3b2f137894f with order ae3dd62e-dbf6-47f0-84cd-2f591fbb9b40.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23"
}
```

```json
{
  "challenge_id": "20a296f4-decc-4648-b6cd-c4da413a4640",
  "expires_at": "2026-10-28T10:10:41.373939493Z",
  "resend_available_at": "2026-10-28T10:05:42.373939493Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "969692",
  "sent_at": "2026-10-28T10:05:41.376109513Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20a296f4-decc-4648-b6cd-c4da413a4640",
  "code": "969692",
  "device_ref": "sandbox-23"
}
```

```json
{
  "session_id": "a09c7121-36be-4db0-af7a-b543d5510383",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjg0MSwiaWF0IjoxNzkzMTgxOTQxLCJqdGkiOiI3YzAzYjVjZi00YTZmLTQzMzAtOTM1OC0yZWY2NjY0ZTYyODAiLCJzaWQiOiJhMDljNzEyMS0zNmJlLTRkYjAtYWY3YS1iNTQzZDU1MTAzODMifQ.e1T4YgWbxkLUKVOFhRHZwph7xOlUrdDmMIzwYS7P3cA",
  "access_expires_at": "2026-10-28T10:20:41.619432623Z",
  "refresh_token": "z6IOyAJoibCQUfYKaudF2BkAXRFkJdxcGYHLGtoWwRk",
  "refresh_expires_at": "2026-11-27T10:05:41.618868645Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:31.029422Z",
  "last_location_at": "2026-10-28T10:05:31.029422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/handover` → **200**

```json
{
  "command_id": "27f2e8a3-387d-418a-808b-2920365849b8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:31.029422Z",
  "last_location_at": "2026-10-28T10:05:31.029422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:42Z",
    "sequence": 1793181942268
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:42.28656Z",
  "last_location_at": "2026-10-28T10:05:42.28656Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662393112",
  "device_ref": "sandbox-24780"
}
```

```json
{
  "challenge_id": "f4eaa4bf-9d75-438a-b802-554b3969fb75",
  "expires_at": "2026-10-28T10:10:42.496070235Z",
  "resend_available_at": "2026-10-28T10:05:43.496070235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662393112` → **200**

```json
{
  "phone": "+380662393112",
  "audience": "CLIENT",
  "code": "659929",
  "sent_at": "2026-10-28T10:05:42.498226097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4eaa4bf-9d75-438a-b802-554b3969fb75",
  "code": "659929",
  "device_ref": "sandbox-24780"
}
```

```json
{
  "session_id": "b86858af-4a5c-4f46-9301-91efeb00145a",
  "subject": {
    "type": "CLIENT",
    "id": "8aada1c7-2a4d-4f46-9058-7567850ac9eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWFkYTFjNy0yYTRkLTRmNDYtOTA1OC03NTY3ODUwYWM5ZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODQyLCJpYXQiOjE3OTMxODE5NDIsImp0aSI6ImJmYzgzNGMwLWZmNGMtNDY2ZS1iYjBiLTc0ZjBlNzQ0NmJiYiIsInNpZCI6ImI4Njg1OGFmLTRhNWMtNGY0Ni05MzAxLTkxZWZlYjAwMTQ1YSJ9._wwZk16Kjzvg6kbn5SE4_c6AA7C1O0VQa9oNPsbenAU",
  "access_expires_at": "2026-10-28T10:20:42.734077824Z",
  "refresh_token": "095XnA-X1LnV1rnQLMq-UcvskgbK2rQ1W8l2PF9q1BQ",
  "refresh_expires_at": "2026-11-27T10:05:42.73344551Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d8123bee-ead7-4870-9b3e-51f4090b211b",
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
  "id": "276cf23e-72eb-4e83-ab97-a23d2bbc7e2a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:42.954074Z",
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
  "command_id": "5f371f3e-f489-4171-8687-74379e68a335",
  "quote_id": "276cf23e-72eb-4e83-ab97-a23d2bbc7e2a",
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
  "id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8aada1c7-2a4d-4f46-9058-7567850ac9eb",
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
  "created_at": "2026-10-28T10:05:43.199086Z",
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
    "id": "019a0e10-cfda-42e2-a15f-66f7bc93b22e",
    "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
    "expires_at": "2026-10-28T10:05:58.202713Z",
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

`POST /api/driver/v1/offers/019a0e10-cfda-42e2-a15f-66f7bc93b22e/accept` → **200**

```json
{
  "command_id": "1d9b57f1-b4dd-4842-92c8-10227b021016"
}
```

```json
{
  "id": "3c6b3419-110d-4ad4-93cd-895853a813c1",
  "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "379659fd-10ee-49b1-8831-77425bc39ef7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "379659fd-10ee-49b1-8831-77425bc39ef7",
  "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
  "assignment_id": "3c6b3419-110d-4ad4-93cd-895853a813c1",
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

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:44Z",
    "sequence": 1793181944794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:44.097987Z",
  "last_location_at": "2026-10-28T10:05:44.097987Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/379659fd-10ee-49b1-8831-77425bc39ef7/arrive` → **200**

```json
{
  "command_id": "9a62fa19-3a80-4398-8045-a280ff5dc6a1",
  "expected_version": 0
}
```

```json
{
  "id": "379659fd-10ee-49b1-8831-77425bc39ef7",
  "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
  "assignment_id": "3c6b3419-110d-4ad4-93cd-895853a813c1",
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
  "arrived_at": "2026-10-28T10:05:44.32376Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/379659fd-10ee-49b1-8831-77425bc39ef7/start` → **200**

```json
{
  "command_id": "245405e6-70d0-4c48-a88f-1802252a4543",
  "expected_version": 1
}
```

```json
{
  "id": "379659fd-10ee-49b1-8831-77425bc39ef7",
  "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
  "assignment_id": "3c6b3419-110d-4ad4-93cd-895853a813c1",
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
  "arrived_at": "2026-10-28T10:05:44.32376Z",
  "started_at": "2026-10-28T10:05:44.55414Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:44Z",
    "sequence": 1793181944795
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:44.796573Z",
  "last_location_at": "2026-10-28T10:05:44.796573Z",
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
  "device_ref": "sandbox-26939"
}
```

```json
{
  "challenge_id": "7afeeb8f-dfc8-4aec-9e24-ba5b4ed0632c",
  "expires_at": "2026-10-28T10:10:45.008995762Z",
  "resend_available_at": "2026-10-28T10:05:46.008995762Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "770972",
  "sent_at": "2026-10-28T10:05:45.011256683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7afeeb8f-dfc8-4aec-9e24-ba5b4ed0632c",
  "code": "770972",
  "device_ref": "sandbox-26939"
}
```

```json
{
  "session_id": "fe08cfff-6137-47d2-aaa1-b01861b1b19f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjg0NSwiaWF0IjoxNzkzMTgxOTQ1LCJqdGkiOiJlY2ZiMjgzNi1jNTVjLTQ3YTItOGFmMS1lYTk3Mjk3MGYwNTEiLCJzaWQiOiJmZTA4Y2ZmZi02MTM3LTQ3ZDItYWFhMS1iMDE4NjFiMWIxOWYifQ.-dj7eQgtUAOghNHDKS4KreyGUWNwd3863Sm_l2s_IAM",
  "access_expires_at": "2026-10-28T10:20:45.250607935Z",
  "refresh_token": "1lNGSzv29IhDJXbjirlFEJAIT_7BDXhwXR_yrPHheb8",
  "refresh_expires_at": "2026-11-27T10:05:45.249972451Z",
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
  "command_id": "984dbad1-0167-4e1f-8fb6-440eee1acd24",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:45Z",
    "sequence": 1793181945672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ebf6757f-c473-4aeb-b5c5-5e8431ea082b",
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
  "last_heartbeat_at": "2026-10-28T10:05:45.690863Z",
  "last_location_at": "2026-10-28T10:05:45.690863Z",
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
  "session_id": "1f43e2fc-0fd0-427b-a8e6-f54cf1c9688b",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NDYsImlhdCI6MTc5MzE4MTk0NiwianRpIjoiMTFiNzJkYzEtNDdkOS00MDQ3LThmZmQtNDcyMDU3OTkxOWU1Iiwic2lkIjoiMWY0M2UyZmMtMGZkMC00MjdiLWE4ZTYtZjU0Y2YxYzk2ODhiIn0.AdNz20_epvE_TWhtdfwAGVGcyotWyUU9EWroO3I7wVQ",
  "access_expires_at": "2026-10-28T10:20:46.19961522Z",
  "refresh_token": "W-xqV17-Nx9P1VQyNOORkIFHiNDikME3-wCPYIsXbMI",
  "refresh_expires_at": "2026-10-28T22:05:46.198964008Z",
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
  "session_id": "7765c40a-65fd-4ea7-94bd-fda78df373e1",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NDYsImlhdCI6MTc5MzE4MTk0NiwianRpIjoiMDdlNWM0N2UtZmE1Zi00YTMxLWE2Y2UtYjFkOGE3NTEzY2FiIiwic2lkIjoiNzc2NWM0MGEtNjVmZC00ZWE3LTk0YmQtZmRhNzhkZjM3M2UxIn0.Su-ox42bl3rsGv2uhFC95tg78Ds0GAPAh2BXsD-m3os",
  "access_expires_at": "2026-10-28T10:20:46.700988693Z",
  "refresh_token": "lDYid3sVUegL2I4ICv_D4NrjBdnDOC7aQXzurxuxN3M",
  "refresh_expires_at": "2026-10-28T22:05:46.7004272Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/38364956-a0c7-4e0c-b302-9fd827cb821e` → **200**

```json
{
  "id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8aada1c7-2a4d-4f46-9058-7567850ac9eb",
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
    "id": "3c6b3419-110d-4ad4-93cd-895853a813c1",
    "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "379659fd-10ee-49b1-8831-77425bc39ef7",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T10:05:43.199086Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/38364956-a0c7-4e0c-b302-9fd827cb821e/interrupt` → **200**

```json
{
  "command_id": "a44869c2-ac22-426c-8b52-2cc4bfa186d7",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "8aada1c7-2a4d-4f46-9058-7567850ac9eb",
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
      "id": "3c6b3419-110d-4ad4-93cd-895853a813c1",
      "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "379659fd-10ee-49b1-8831-77425bc39ef7",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T10:05:43.199086Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "8aada1c7-2a4d-4f46-9058-7567850ac9eb",
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
    "id": "dfb19198-f94a-4b26-8b6b-0ead08e4d611",
    "order_id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
    "expires_at": "2026-10-28T10:06:02.161026Z",
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

`POST /api/driver/v1/offers/dfb19198-f94a-4b26-8b6b-0ead08e4d611/accept` → **200**

```json
{
  "command_id": "2693fcbf-4ba2-49dd-97f1-787e45d6f783"
}
```

```json
{
  "id": "4aa6a9be-7887-48a4-b976-ddbe48df3edb",
  "order_id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8000f3b-b62b-4ce7-8e09-85a39bbce852",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8000f3b-b62b-4ce7-8e09-85a39bbce852",
  "order_id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
  "assignment_id": "4aa6a9be-7887-48a4-b976-ddbe48df3edb",
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
  "session_id": "ebf6757f-c473-4aeb-b5c5-5e8431ea082b",
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
  "last_heartbeat_at": "2026-10-28T10:05:45.690863Z",
  "last_location_at": "2026-10-28T10:05:45.690863Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ebf6757f-c473-4aeb-b5c5-5e8431ea082b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:48Z",
    "sequence": 1793181948275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ebf6757f-c473-4aeb-b5c5-5e8431ea082b",
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
  "last_heartbeat_at": "2026-10-28T10:05:48.294241Z",
  "last_location_at": "2026-10-28T10:05:48.294241Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a8000f3b-b62b-4ce7-8e09-85a39bbce852/arrive` → **200**

```json
{
  "command_id": "ef261d0c-2732-4027-b506-7409637399b7",
  "expected_version": 0
}
```

```json
{
  "id": "a8000f3b-b62b-4ce7-8e09-85a39bbce852",
  "order_id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
  "assignment_id": "4aa6a9be-7887-48a4-b976-ddbe48df3edb",
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
  "arrived_at": "2026-10-28T10:05:48.517175Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8000f3b-b62b-4ce7-8e09-85a39bbce852/start` → **200**

```json
{
  "command_id": "e12b37f3-5093-4a97-85f4-4b63a24c0819",
  "expected_version": 1
}
```

```json
{
  "id": "a8000f3b-b62b-4ce7-8e09-85a39bbce852",
  "order_id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
  "assignment_id": "4aa6a9be-7887-48a4-b976-ddbe48df3edb",
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
  "arrived_at": "2026-10-28T10:05:48.517175Z",
  "started_at": "2026-10-28T10:05:48.748926Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8000f3b-b62b-4ce7-8e09-85a39bbce852/complete` → **200**

```json
{
  "command_id": "cab3a773-ca2e-4440-915f-44c32a80d363",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:05:48Z"
}
```

```json
{
  "id": "a8000f3b-b62b-4ce7-8e09-85a39bbce852",
  "order_id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
  "assignment_id": "4aa6a9be-7887-48a4-b976-ddbe48df3edb",
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
  "arrived_at": "2026-10-28T10:05:48.517175Z",
  "started_at": "2026-10-28T10:05:48.748926Z",
  "completed_at": "2026-10-28T10:05:48.979807Z",
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
    "id": "553ff0bb-45a5-49de-a14e-8856f1aeda13",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:05:47.151911Z",
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
    "id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:05:43.199086Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
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

`GET /api/operator/v1/orders/38364956-a0c7-4e0c-b302-9fd827cb821e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:05:43.19966Z",
      "actor": {
        "type": "CLIENT",
        "id": "8aada1c7-2a4d-4f46-9058-7567850ac9eb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
        "quote_id": "276cf23e-72eb-4e83-ab97-a23d2bbc7e2a",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "8c9f2b33-a144-488e-b21b-f76bf0ca9962"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:05:43.201756Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
        "attempt_id": "eec3503f-b7de-4d84-9497-bb7bf135f007",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8c9f2b33-a144-488e-b21b-f76bf0ca9962"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:05:43.205895Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "019a0e10-cfda-42e2-a15f-66f7bc93b22e",
        "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "8c9f2b33-a144-488e-b21b-f76bf0ca9962"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:05:43.656243Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "019a0e10-cfda-42e2-a15f-66f7bc93b22e",
        "order_id": "38364956-a0c7-4e0c-b302-9fd827cb821e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3c6b3419-110d-4ad4-93cd-895853a813c1"
      },
      "correlation_id": "30bb9fb3-bb93-4eb1-bd5a-7be0d5660ca1"
```

Done: interrupted 38364956-a0c7-4e0c-b302-9fd827cb821e, follow-up 553ff0bb-45a5-49de-a14e-8856f1aeda13.

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
  "session_id": "2233208c-2226-45f8-83d7-2f97c25a66e3",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NTMsImlhdCI6MTc5MzE4MTk1MywianRpIjoiMDQzY2JjMzMtZTFiMy00NzYyLTkxMGYtNDNhY2U2MTcyN2M4Iiwic2lkIjoiMjIzMzIwOGMtMjIyNi00NWY4LTgzZDctMmY5N2MyNWE2NmUzIn0.lfAicimj9YUYvzzf3LmyTrJHP6ET-zV3No3a-m1FY10",
  "access_expires_at": "2026-10-28T10:20:53.168363141Z",
  "refresh_token": "NdAwLwA-FlKPBU9nwgfkP6yMgSAO7pxMwrh3MGhQHYg",
  "refresh_expires_at": "2026-10-28T22:05:53.167816115Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "df13dd39-3bce-45d7-8308-f8e88252dfa4",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:05:53Z"
}
```

```json
{
  "id": "eeeb668c-55df-46d1-a962-db2d9e8279dd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:05:53Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/eeeb668c-55df-46d1-a962-db2d9e8279dd/publish` → **200**

```json
{
  "command_id": "e03d908b-0ba8-41c6-a368-85c4ae9efe52",
  "expected_version": 0
}
```

```json
{
  "id": "eeeb668c-55df-46d1-a962-db2d9e8279dd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:05:53.635527Z",
  "published_at": "2026-10-28T10:05:53.635527Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "eeeb668c-55df-46d1-a962-db2d9e8279dd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:05:53.635527Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638268678",
  "device_ref": "sandbox-884"
}
```

```json
{
  "challenge_id": "30ce0625-8722-42e0-8102-c56f156b5db6",
  "expires_at": "2026-10-28T10:10:54.074028845Z",
  "resend_available_at": "2026-10-28T10:05:55.074028845Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638268678` → **200**

```json
{
  "phone": "+380638268678",
  "audience": "CLIENT",
  "code": "723449",
  "sent_at": "2026-10-28T10:05:54.076361865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30ce0625-8722-42e0-8102-c56f156b5db6",
  "code": "723449",
  "device_ref": "sandbox-884"
}
```

```json
{
  "session_id": "3b0dc5aa-ca7e-46c6-adee-8b62e8661fc6",
  "subject": {
    "type": "CLIENT",
    "id": "a42c18d3-6564-480a-a42a-bc1f841b1eef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDJjMThkMy02NTY0LTQ4MGEtYTQyYS1iYzFmODQxYjFlZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODU0LCJpYXQiOjE3OTMxODE5NTQsImp0aSI6IjY0NjY1ZDBlLTY3NjEtNDkxNC05ZjVkLTBhZTBhNmQ0MzI0NyIsInNpZCI6IjNiMGRjNWFhLWNhN2UtNDZjNi1hZGVlLThiNjJlODY2MWZjNiJ9._Whh17YJtPqkAqSQhzgV-an6UsiRf-7JUsldPyBt96Q",
  "access_expires_at": "2026-10-28T10:20:54.313901782Z",
  "refresh_token": "9vvLJ2nuHWQ7mfSrw7-qrrhQn7wy3EkyZogW4eE4JBM",
  "refresh_expires_at": "2026-11-27T10:05:54.313354097Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "eeeb668c-55df-46d1-a962-db2d9e8279dd",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:05:53.635527Z",
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
  "command_id": "0577d43a-c869-4b5e-b5c9-8e9db97d7d55",
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
  "id": "c96af747-fbf2-48eb-ac80-dc243724d6ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:54.743725Z",
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
  "command_id": "cd14f743-4ced-4b92-8d82-d4d61ce2684c",
  "quote_id": "c96af747-fbf2-48eb-ac80-dc243724d6ff",
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
  "correlation_id": "3b52cdb6-8afe-4664-bc4f-96b83863e9a2"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f9b01b0d-0ef9-44c3-a426-6a0df3667a73",
  "version_id": "eeeb668c-55df-46d1-a962-db2d9e8279dd",
  "language": "uk"
}
```

```json
{
  "version_id": "eeeb668c-55df-46d1-a962-db2d9e8279dd",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:05:55.202214Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9748a39f-36db-494b-a890-4795e781b838",
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
  "id": "16d09262-e779-44d5-8feb-f93797176674",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:55.425717Z",
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
  "command_id": "7d03bdbb-dd5d-4797-abaf-c8646a324171",
  "quote_id": "16d09262-e779-44d5-8feb-f93797176674",
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
  "id": "9d07a303-4a46-4f09-8d47-fcb1f9b1787a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a42c18d3-6564-480a-a42a-bc1f841b1eef",
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
  "created_at": "2026-10-28T10:05:55.650087Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/9d07a303-4a46-4f09-8d47-fcb1f9b1787a` → **200**

```json
{
  "id": "9d07a303-4a46-4f09-8d47-fcb1f9b1787a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a42c18d3-6564-480a-a42a-bc1f841b1eef",
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
  "created_at": "2026-10-28T10:05:55.650087Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9d07a303-4a46-4f09-8d47-fcb1f9b1787a/cancel` → **200**

```json
{
  "command_id": "3d0910aa-5290-4d68-be5c-972fe24056d7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9d07a303-4a46-4f09-8d47-fcb1f9b1787a",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a42c18d3-6564-480a-a42a-bc1f841b1eef",
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
  "created_at": "2026-10-28T10:05:55.650087Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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

`POST /api/admin/v1/legal-documents/eeeb668c-55df-46d1-a962-db2d9e8279dd` → **409**

```json
{
  "command_id": "dbce43c1-5427-46cc-a0ab-e49ae262340c",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:05:56Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/eeeb668c-55df-46d1-a962-db2d9e8279dd",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4456307c-eb6a-4365-b691-e9dec76b6f51"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c740a964-aa9a-496d-b9bd-a4fe3b553d11",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:05:56Z"
}
```

```json
{
  "id": "25edb9b5-8788-4475-9715-84a96ec1e6eb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:05:56Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/25edb9b5-8788-4475-9715-84a96ec1e6eb/publish` → **200**

```json
{
  "command_id": "9669a853-851f-4cc0-afcb-66d8886aa840",
  "expected_version": 0
}
```

```json
{
  "id": "25edb9b5-8788-4475-9715-84a96ec1e6eb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:05:56.794924Z",
  "published_at": "2026-10-28T10:05:56.794924Z",
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
  "device_ref": "sandbox-5148"
}
```

```json
{
  "challenge_id": "9ec34570-53e2-4fac-ba38-799aa9002cad",
  "expires_at": "2026-10-28T10:10:57.015712618Z",
  "resend_available_at": "2026-10-28T10:05:58.015712618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "044396",
  "sent_at": "2026-10-28T10:05:57.017818017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ec34570-53e2-4fac-ba38-799aa9002cad",
  "code": "044396",
  "device_ref": "sandbox-5148"
}
```

```json
{
  "session_id": "543afe3f-4703-4413-af5d-9b5602ae2157",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjg1NywiaWF0IjoxNzkzMTgxOTU3LCJqdGkiOiJmYjgzNDRkNS1lYTU1LTQyZmItODgxOC03N2VlZmZiMjM0ZDQiLCJzaWQiOiI1NDNhZmUzZi00NzAzLTQ0MTMtYWY1ZC05YjU2MDJhZTIxNTcifQ.1K78g95HkpbqxuZB0PZpcZmje5UNAGhff_QxdGg1Jwo",
  "access_expires_at": "2026-10-28T10:20:57.252549659Z",
  "refresh_token": "ghGx88TLulW8KmokW0Ozchr17jI8nlVZPqIWOutc6Wg",
  "refresh_expires_at": "2026-11-27T10:05:57.251913893Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ebf6757f-c473-4aeb-b5c5-5e8431ea082b",
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
  "last_heartbeat_at": "2026-10-28T10:05:48.294241Z",
  "last_location_at": "2026-10-28T10:05:48.294241Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ebf6757f-c473-4aeb-b5c5-5e8431ea082b/handover` → **200**

```json
{
  "command_id": "86a4496e-6e96-4a4b-843a-60c01554e9e5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ebf6757f-c473-4aeb-b5c5-5e8431ea082b",
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
  "last_heartbeat_at": "2026-10-28T10:05:48.294241Z",
  "last_location_at": "2026-10-28T10:05:48.294241Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ebf6757f-c473-4aeb-b5c5-5e8431ea082b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:05:57Z",
    "sequence": 1793181957917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ebf6757f-c473-4aeb-b5c5-5e8431ea082b",
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
  "last_heartbeat_at": "2026-10-28T10:05:57.935532Z",
  "last_location_at": "2026-10-28T10:05:57.935532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671585906",
  "device_ref": "sandbox-18787"
}
```

```json
{
  "challenge_id": "c66c9ace-6528-402d-bd76-22bd0b5a37ae",
  "expires_at": "2026-10-28T10:10:58.152407427Z",
  "resend_available_at": "2026-10-28T10:05:59.152407427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671585906` → **200**

```json
{
  "phone": "+380671585906",
  "audience": "CLIENT",
  "code": "831083",
  "sent_at": "2026-10-28T10:05:58.1547046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c66c9ace-6528-402d-bd76-22bd0b5a37ae",
  "code": "831083",
  "device_ref": "sandbox-18787"
}
```

```json
{
  "session_id": "26b5649f-cfe7-4ad9-8c48-2644967c037c",
  "subject": {
    "type": "CLIENT",
    "id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzFlNmNkMS01MmFhLTRmOTQtOGMzMy01ODEwN2Y3MjBjN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODU4LCJpYXQiOjE3OTMxODE5NTgsImp0aSI6IjUxMzliMjQ4LTA0NTctNGEyMC05MjY3LTI2NWQxNWI2OGNjYyIsInNpZCI6IjI2YjU2NDlmLWNmZTctNGFkOS04YzQ4LTI2NDQ5NjdjMDM3YyJ9.5UEUZCqjvk0NyRr_ZtNaVqLvycSqkCiC8hLUtMsonyA",
  "access_expires_at": "2026-10-28T10:20:58.40105681Z",
  "refresh_token": "sOnSrHcJ--Kv0VgXCAuDfzvtccbpqqt6Pur4JOxOh5Q",
  "refresh_expires_at": "2026-11-27T10:05:58.400453378Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "53544ebe-3821-4c46-9838-481a4cda3030",
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
  "id": "851596fe-bccc-48f8-9805-e03164d0874d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:58.634725Z",
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
  "command_id": "13d3b46b-24f7-41e1-882b-92c6e45b578a",
  "quote_id": "851596fe-bccc-48f8-9805-e03164d0874d",
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
    "phone": "+380678806942"
  }
}
```

```json
{
  "id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:05:58.867091Z",
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
    "id": "9622e22e-6d44-4cb7-81d9-4f596a1b4877",
    "order_id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
    "expires_at": "2026-10-28T10:06:13.870366Z",
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

`POST /api/driver/v1/offers/9622e22e-6d44-4cb7-81d9-4f596a1b4877/accept` → **200**

```json
{
  "command_id": "e471fa5d-8067-44e9-afd5-782f629c6647"
}
```

```json
{
  "id": "c66513eb-6780-4651-abfb-0f6bfc35d105",
  "order_id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "953a933c-c928-450b-8c34-6c7317f86eea",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "953a933c-c928-450b-8c34-6c7317f86eea",
  "order_id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
  "assignment_id": "c66513eb-6780-4651-abfb-0f6bfc35d105",
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
    "phone": "+380678806942"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d1e2318-957a-4402-b5ef-c196bfbfbb6a",
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
  "id": "88456298-96fb-4410-9cb6-3501870b7d4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:10:59.768819Z",
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
  "command_id": "2b95328a-2590-4f0d-9b36-55434f2a88e1",
  "quote_id": "88456298-96fb-4410-9cb6-3501870b7d4f",
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
  "id": "01405129-ea5d-4fb1-a5ee-048b719fd77b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:05:59.999437Z",
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
  "command_id": "e9df617c-242d-48d5-b94a-fb90502c31da",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:06:00Z"
}
```

```json
{
  "id": "0438cb2f-120c-46cb-849d-aea5cd67b05d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:11:00.242891Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:06:00Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "53eb5bb5-1ab9-4fb8-9ace-0e7dd398216d",
  "quote_id": "0438cb2f-120c-46cb-849d-aea5cd67b05d",
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
  "pickup_at": "2026-10-28T13:06:00Z"
}
```

```json
{
  "id": "e465046a-d337-4b52-9d09-44cffa1a7d53",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:06:00.465799Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:06:00Z",
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
  "command_id": "94837eda-1190-46a9-8913-6646758ef63b",
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
  "id": "46eaec0d-9d0d-4d9f-9814-10bf828a0af8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:11:00.698607Z",
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
  "command_id": "9d126576-97e3-456f-9768-bbaac7768412",
  "quote_id": "46eaec0d-9d0d-4d9f-9814-10bf828a0af8",
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
  "correlation_id": "8fb37549-cc54-4aa5-a42f-410c122458f8"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "e465046a-d337-4b52-9d09-44cffa1a7d53",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
      "created_at": "2026-10-28T10:06:00.465799Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:06:00Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "01405129-ea5d-4fb1-a5ee-048b719fd77b",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
      "created_at": "2026-10-28T10:05:59.999437Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "01405129-ea5d-4fb1-a5ee-048b719fd77b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:05:59.999437Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/26b60509-4a2b-42fc-aac7-3eac57f3576d` → **200**

```json
{
  "id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
    "id": "c66513eb-6780-4651-abfb-0f6bfc35d105",
    "order_id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "953a933c-c928-450b-8c34-6c7317f86eea",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:05:58.867091Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/26b60509-4a2b-42fc-aac7-3eac57f3576d/cancel` → **200**

```json
{
  "command_id": "94fad337-665f-4841-912d-e3014ffda0ab",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
    "id": "c66513eb-6780-4651-abfb-0f6bfc35d105",
    "order_id": "26b60509-4a2b-42fc-aac7-3eac57f3576d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "953a933c-c928-450b-8c34-6c7317f86eea",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:05:58.867091Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/01405129-ea5d-4fb1-a5ee-048b719fd77b` → **200**

```json
{
  "id": "01405129-ea5d-4fb1-a5ee-048b719fd77b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:05:59.999437Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/01405129-ea5d-4fb1-a5ee-048b719fd77b/cancel` → **200**

```json
{
  "command_id": "564afa5f-ae35-45f0-bee4-6b252e13b883",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "01405129-ea5d-4fb1-a5ee-048b719fd77b",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:05:59.999437Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/e465046a-d337-4b52-9d09-44cffa1a7d53` → **200**

```json
{
  "id": "e465046a-d337-4b52-9d09-44cffa1a7d53",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:06:00.465799Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:06:00Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e465046a-d337-4b52-9d09-44cffa1a7d53/cancel` → **200**

```json
{
  "command_id": "fb23ca7f-a8d3-441a-b873-aab849b80bde",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e465046a-d337-4b52-9d09-44cffa1a7d53",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c71e6cd1-52aa-4f94-8c33-58107f720c7f",
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
  "created_at": "2026-10-28T10:06:00.465799Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-28T13:06:00Z",
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
  "session_id": "ebf6757f-c473-4aeb-b5c5-5e8431ea082b",
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
  "last_heartbeat_at": "2026-10-28T10:05:57.935532Z",
  "last_location_at": "2026-10-28T10:05:57.935532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ebf6757f-c473-4aeb-b5c5-5e8431ea082b/close` → **200**

```json
{
  "command_id": "4f23d289-9a60-4842-afb8-818d122a1a6f",
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

Done: orders 26b60509-4a2b-42fc-aac7-3eac57f3576d, 01405129-ea5d-4fb1-a5ee-048b719fd77b, e465046a-d337-4b52-9d09-44cffa1a7d53.

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
  "session_id": "21e6a108-4ab9-45e4-956a-eb8920821fba",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NjMsImlhdCI6MTc5MzE4MTk2MywianRpIjoiMDI4ZDExY2ItOWJjNy00YWU3LWE0NDItYWUwNDUzY2ZjMWYzIiwic2lkIjoiMjFlNmExMDgtNGFiOS00NWU0LTk1NmEtZWI4OTIwODIxZmJhIn0.Ju0zsJNErQqx-0d-S0TralrcMv2enxm_i7fZOmAtzIQ",
  "access_expires_at": "2026-10-28T10:21:03.657147555Z",
  "refresh_token": "sqkott9WUUFu7blzfZ_bLnLUIfK6MJ7IAUSUP4znS3s",
  "refresh_expires_at": "2026-10-28T22:06:03.656650093Z",
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
  "session_id": "45913f01-4266-4085-8d7f-698ca4c9255c",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NjQsImlhdCI6MTc5MzE4MTk2NCwianRpIjoiZjU0NzEyMzEtYzNlZS00N2Q1LWI1ZjItNTVhOGIyNzViNjMzIiwic2lkIjoiNDU5MTNmMDEtNDI2Ni00MDg1LThkN2YtNjk4Y2E0YzkyNTVjIn0.D9iTgnkXK7fmFc6N8O9naNkGSVZYEY0ocxF4wT2BeQc",
  "access_expires_at": "2026-10-28T10:21:04.166843406Z",
  "refresh_token": "7W47nJEO4akczLFicn0bchlEiUtrJCTioNID585feI0",
  "refresh_expires_at": "2026-10-28T22:06:04.166210203Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29853"
}
```

```json
{
  "challenge_id": "cbea8d41-447e-42d9-b73b-e14a72aca82b",
  "expires_at": "2026-10-28T10:11:04.37571639Z",
  "resend_available_at": "2026-10-28T10:06:05.37571639Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "378446",
  "sent_at": "2026-10-28T10:06:04.378517216Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbea8d41-447e-42d9-b73b-e14a72aca82b",
  "code": "378446",
  "device_ref": "sandbox-29853"
}
```

```json
{
  "session_id": "543ba3ae-59ba-406e-80ff-91f54c6afecd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjg2NCwiaWF0IjoxNzkzMTgxOTY0LCJqdGkiOiI0ZTUxNmUzNC1jNDIzLTRmYzktYmM5Yy0xMWJiNWFhZmUzMWEiLCJzaWQiOiI1NDNiYTNhZS01OWJhLTQwNmUtODBmZi05MWY1NGM2YWZlY2QifQ.ve5dhT4OeP8cTW1qrZieGT7qm7C3u5kK-QUxCTutx0Q",
  "access_expires_at": "2026-10-28T10:21:04.61250544Z",
  "refresh_token": "Kn7xs3jw2CQW7FfX9FmTZwmBlx1EZLCMVGOKwoTLp2Y",
  "refresh_expires_at": "2026-11-27T10:06:04.611987008Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:44.796573Z",
  "last_location_at": "2026-10-28T10:05:44.796573Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/handover` → **200**

```json
{
  "command_id": "81a13ff0-f30b-4947-a841-b875751cb008",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:05:44.796573Z",
  "last_location_at": "2026-10-28T10:05:44.796573Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:06:05Z",
    "sequence": 1793181965252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:06:05.269765Z",
  "last_location_at": "2026-10-28T10:06:05.269765Z",
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
  "command_id": "047d14c7-ba51-49d9-bc8b-0348f248de65",
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
  "effective_at": "2026-10-28T10:06:05.713445Z",
  "changed_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:06:05.929963578Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "af7942f2-0e2a-4a69-b95a-889b3cb6ceef",
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
  "id": "f21174c1-6d19-4796-9a0b-4ecc4041016a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:11:06.161122Z",
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
  "command_id": "31bde6c7-0729-4163-b9ab-f464f606a0a8",
  "quote_id": "f21174c1-6d19-4796-9a0b-4ecc4041016a",
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
    "phone": "+3806711127827"
  }
}
```

```json
{
  "id": "056a854c-52bc-4561-9afc-cf2093082e92",
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
  "created_at": "2026-10-28T10:06:06.385266Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127827"
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
    "id": "12806f99-bb4a-45af-b6c6-aa167dadbbd3",
    "order_id": "056a854c-52bc-4561-9afc-cf2093082e92",
    "expires_at": "2026-10-28T10:06:21.389076Z",
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

`POST /api/driver/v1/offers/12806f99-bb4a-45af-b6c6-aa167dadbbd3/accept` → **200**

```json
{
  "command_id": "23fa3eda-34a4-44f2-a39d-282670104915"
}
```

```json
{
  "id": "b26132c5-418c-4d84-a312-ef402b2e4c9a",
  "order_id": "056a854c-52bc-4561-9afc-cf2093082e92",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c2cb908f-6ad3-4038-afa1-f2c0b8568e12",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c2cb908f-6ad3-4038-afa1-f2c0b8568e12",
  "order_id": "056a854c-52bc-4561-9afc-cf2093082e92",
  "assignment_id": "b26132c5-418c-4d84-a312-ef402b2e4c9a",
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
    "phone": "+3806711127827"
  }
}
```

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:06:07Z",
    "sequence": 1793181967258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:06:07.27676Z",
  "last_location_at": "2026-10-28T10:06:07.27676Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c2cb908f-6ad3-4038-afa1-f2c0b8568e12/arrive` → **200**

```json
{
  "command_id": "3051fd3a-858a-42e6-be45-2bdc6ac718a6",
  "expected_version": 0
}
```

```json
{
  "id": "c2cb908f-6ad3-4038-afa1-f2c0b8568e12",
  "order_id": "056a854c-52bc-4561-9afc-cf2093082e92",
  "assignment_id": "b26132c5-418c-4d84-a312-ef402b2e4c9a",
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
  "arrived_at": "2026-10-28T10:06:07.500381Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127827"
  }
}
```

`POST /api/driver/v1/trips/c2cb908f-6ad3-4038-afa1-f2c0b8568e12/start` → **200**

```json
{
  "command_id": "1a810fe8-d36c-4cb4-87c5-8b79677ce81c",
  "expected_version": 1
}
```

```json
{
  "id": "c2cb908f-6ad3-4038-afa1-f2c0b8568e12",
  "order_id": "056a854c-52bc-4561-9afc-cf2093082e92",
  "assignment_id": "b26132c5-418c-4d84-a312-ef402b2e4c9a",
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
  "arrived_at": "2026-10-28T10:06:07.500381Z",
  "started_at": "2026-10-28T10:06:07.728925Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127827"
  }
}
```

`POST /api/driver/v1/trips/c2cb908f-6ad3-4038-afa1-f2c0b8568e12/complete` → **200**

```json
{
  "command_id": "d30f7918-eda4-49e2-b6f5-81a73824986f",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:06:07Z",
  "cash_received": true
}
```

```json
{
  "id": "c2cb908f-6ad3-4038-afa1-f2c0b8568e12",
  "order_id": "056a854c-52bc-4561-9afc-cf2093082e92",
  "assignment_id": "b26132c5-418c-4d84-a312-ef402b2e4c9a",
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
  "arrived_at": "2026-10-28T10:06:07.500381Z",
  "started_at": "2026-10-28T10:06:07.728925Z",
  "completed_at": "2026-10-28T10:06:07.966377Z",
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
  "command_id": "0df79d33-ed39-42a9-8d5a-392f6f07f93e",
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
  "id": "71ce9a4c-13a3-4ee1-b866-99ddf11cbbc4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:11:08.223217Z",
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
  "command_id": "32f7d02c-13d0-4de1-ba63-c5534ae58e26",
  "quote_id": "71ce9a4c-13a3-4ee1-b866-99ddf11cbbc4",
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
    "phone": "+3806711112913"
  }
}
```

```json
{
  "id": "5bf47d1a-4965-48fe-a034-90c029f7f5cd",
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
  "created_at": "2026-10-28T10:06:08.48481Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112913"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5bf47d1a-4965-48fe-a034-90c029f7f5cd` → **200**

```json
{
  "id": "5bf47d1a-4965-48fe-a034-90c029f7f5cd",
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
  "created_at": "2026-10-28T10:06:08.48481Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112913"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5bf47d1a-4965-48fe-a034-90c029f7f5cd/cancel` → **200**

```json
{
  "command_id": "98941a31-a585-4c39-9950-8f6c7e0a8c7e",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5bf47d1a-4965-48fe-a034-90c029f7f5cd",
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
  "created_at": "2026-10-28T10:06:08.48481Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112913"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error",
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
  "staff_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T10:06:07.972434Z",
  "last_entries": [
    {
      "order_id": "5bf47d1a-4965-48fe-a034-90c029f7f5cd",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T10:06:09.073703Z"
    },
    {
      "order_id": "056a854c-52bc-4561-9afc-cf2093082e92",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T10:06:07.972434Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9e71257c-57ea-4cdf-bdbc-bc684569dc8d",
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
  "last_heartbeat_at": "2026-10-28T10:06:07.27676Z",
  "last_location_at": "2026-10-28T10:06:07.27676Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9e71257c-57ea-4cdf-bdbc-bc684569dc8d/close` → **200**

```json
{
  "command_id": "b990d023-304c-45ee-b7ff-0bc26c1e806d",
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

Done: operator bonus for fulfilled 056a854c-52bc-4561-9afc-cf2093082e92 and operator-fault cancellation 5bf47d1a-4965-48fe-a034-90c029f7f5cd.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675322276",
  "device_ref": "sandbox-26648"
}
```

```json
{
  "challenge_id": "8be24d06-3254-471f-a76b-21f09d53fa7a",
  "expires_at": "2026-10-28T10:11:11.97907535Z",
  "resend_available_at": "2026-10-28T10:06:12.97907535Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675322276` → **200**

```json
{
  "phone": "+380675322276",
  "audience": "CLIENT",
  "code": "706025",
  "sent_at": "2026-10-28T10:06:11.981292259Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675874017",
  "device_ref": "sandbox-29081",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2ff980d4-f40a-455a-bfe2-e8050c696a19",
  "expires_at": "2026-10-28T10:11:12.217585498Z",
  "resend_available_at": "2026-10-28T10:06:13.217585498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675874017` → **200**

```json
{
  "phone": "+380675874017",
  "audience": "CLIENT",
  "code": "368099",
  "sent_at": "2026-10-28T10:06:12.219631195Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679230000",
  "device_ref": "sandbox-25078"
}
```

```json
{
  "challenge_id": "9c7711fc-d15f-401d-8f5a-b5603ab18883",
  "expires_at": "2026-10-28T10:11:12.450865129Z",
  "resend_available_at": "2026-10-28T10:06:13.450865129Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679230000` → **200**

```json
{
  "phone": "+380679230000",
  "audience": "CLIENT",
  "code": "113595",
  "sent_at": "2026-10-28T10:06:12.453530065Z",
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
  "session_id": "b10ebe57-0a7c-43cb-ace6-0fa5a394ebbd",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NzIsImlhdCI6MTc5MzE4MTk3MiwianRpIjoiYjdjZDI1NzYtZTE2ZS00ODQ5LWE1MGEtZmRkZTk4YTFiMjY1Iiwic2lkIjoiYjEwZWJlNTctMGE3Yy00M2NiLWFjZTYtMGZhNWEzOTRlYmJkIn0.Ie4aUrA02pJN_nhdRdQXXi0mpY2Vi3OBdi9KkAUQj8k",
  "access_expires_at": "2026-10-28T10:21:12.975429805Z",
  "refresh_token": "iJueJ1Sc1s23F8KRaG5cYjlHaB2umwDI27v5MsAm5O8",
  "refresh_expires_at": "2026-10-28T22:06:12.974949404Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679230000` → **200**

```json
{
  "deliveries": [
    {
      "id": "c75127c1-68b5-47ed-ac90-5ba1bdcb476a",
      "challenge_id": "9c7711fc-d15f-401d-8f5a-b5603ab18883",
      "phone": "+380679230000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-00bed8e0-5c3b-4783-b321-c9fa478887d9",
      "error": null,
      "attempted_at": "2026-10-28T10:06:12.453762Z"
    },
    {
      "id": "78634dca-74c5-45f6-8f12-bfab6cd9cde6",
      "challenge_id": "9c7711fc-d15f-401d-8f5a-b5603ab18883",
      "phone": "+380679230000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:06:12.452998Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679230000` → **200**

```json
{
  "phone": "+380679230000",
  "audience": "CLIENT",
  "code": "113595",
  "sent_at": "2026-10-28T10:06:12.453530065Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675874017` → **200**

```json
{
  "deliveries": [
    {
      "id": "189a466d-2a9f-4740-8860-87890255f125",
      "challenge_id": "2ff980d4-f40a-455a-bfe2-e8050c696a19",
      "phone": "+380675874017",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-60893b69-f133-4bcc-b492-0f91937cf38f",
      "error": null,
      "attempted_at": "2026-10-28T10:06:12.219824Z"
    }
  ]
}
```

Done: SMS to +380675322276, a call to +380675874017, SMS then a call to +380679230000.

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
  "session_id": "085125f7-24df-472b-9543-00826413a9fd",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NzMsImlhdCI6MTc5MzE4MTk3MywianRpIjoiOTA3NGY3ZGItOTAyMS00ZmQ0LTg5MjgtNDM1ZjU3MDU5YzYyIiwic2lkIjoiMDg1MTI1ZjctMjRkZi00NzJiLTk1NDMtMDA4MjY0MTNhOWZkIn0.s6cf4VQMERmBBCC5x3QGybIYuwR26pRhOWMhQXqUK6s",
  "access_expires_at": "2026-10-28T10:21:13.951540952Z",
  "refresh_token": "xYvGXhqLXAJlnTIF8kQZ8QvkmVZVRVB3i0KdzPV7bFE",
  "refresh_expires_at": "2026-10-28T22:06:13.951032719Z",
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
  "session_id": "2d07256b-d265-4765-8169-cf2e6288757f",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4NzQsImlhdCI6MTc5MzE4MTk3NCwianRpIjoiNjBjODQwMWItN2I1MS00MzNjLWI5M2ItMDIzNTlhNmMzN2MwIiwic2lkIjoiMmQwNzI1NmItZDI2NS00NzY1LTgxNjktY2YyZTYyODg3NTdmIn0.sDikib4ycPBl0bVuI_zlAOEjmBcpKcCaG3nVylLEUtg",
  "access_expires_at": "2026-10-28T10:21:14.454248388Z",
  "refresh_token": "mr6JJhJXjZrIbVPz5f99wVNpphc1OQ1s52qOxBCs63w",
  "refresh_expires_at": "2026-10-28T22:06:14.453741588Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
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

`POST /api/admin/v1/staff-extensions/02955ed8-cc40-4648-a1c0-e2103485b51e` → **200**

```json
{
  "command_id": "1cb3d0a4-139a-49d4-b16c-1a928b22af3a",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "bef0ee9c-f64e-4aa5-b000-765669a256da",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:06:15.323436Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:06:15.323436Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f8c6a4b2-c887-47d9-b185-32dde2bc1435",
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
  "id": "0cef2094-9a3d-4670-b6a3-d0565726597b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:11:15.751191Z",
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
  "command_id": "f0141beb-d1b4-45c5-8dd5-3d58fb8cd81c",
  "quote_id": "0cef2094-9a3d-4670-b6a3-d0565726597b",
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
    "phone": "+380678670031"
  }
}
```

```json
{
  "id": "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2",
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
  "created_at": "2026-10-28T10:06:15.976305Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678670031"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/32b9472a-5ef5-48bb-b9b1-246bfb01d6f2/calls` → **201**

```json
{
  "command_id": "1c106a2f-b49e-4afd-9826-1d14348d3eec",
  "to": "CALLER"
}
```

```json
{
  "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "order_ids": [
    "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2"
  ],
  "started_at": "2026-10-28T10:06:16.222669Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/32b9472a-5ef5-48bb-b9b1-246bfb01d6f2/calls` → **201**

```json
{
  "command_id": "1c106a2f-b49e-4afd-9826-1d14348d3eec",
  "to": "CALLER"
}
```

```json
{
  "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "order_ids": [
    "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2"
  ],
  "started_at": "2026-10-28T10:06:16.222669Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678670031",
    "at": "2026-10-28T10:06:16.224672072Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.32588",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "23cb2e93-8bfd-4917-a469-1eef690e6ba4"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=32b9472a-5ef5-48bb-b9b1-246bfb01d6f2` → **200**

```json
{
  "calls": [
    {
      "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [
        "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2"
      ],
      "started_at": "2026-10-28T10:06:16.222669Z",
      "answered_at": "2026-10-28T10:06:16.739024Z",
      "ended_at": "2026-10-28T10:06:16.760252Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=32b9472a-5ef5-48bb-b9b1-246bfb01d6f2` → **200**

```json
{
  "calls": [
    {
      "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [
        "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2"
      ],
      "started_at": "2026-10-28T10:06:16.222669Z",
      "answered_at": "2026-10-28T10:06:16.739024Z",
      "ended_at": "2026-10-28T10:06:16.760252Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=32b9472a-5ef5-48bb-b9b1-246bfb01d6f2` → **200**

```json
{
  "calls": [
    {
      "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [
        "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2"
      ],
      "started_at": "2026-10-28T10:06:16.222669Z",
      "answered_at": "2026-10-28T10:06:16.739024Z",
      "ended_at": "2026-10-28T10:06:16.760252Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=32b9472a-5ef5-48bb-b9b1-246bfb01d6f2` → **200**

```json
{
  "calls": [
    {
      "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [
        "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2"
      ],
      "started_at": "2026-10-28T10:06:16.222669Z",
      "answered_at": "2026-10-28T10:06:16.739024Z",
      "ended_at": "2026-10-28T10:06:16.760252Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=32b9472a-5ef5-48bb-b9b1-246bfb01d6f2` → **200**

```json
{
  "calls": [
    {
      "id": "23cb2e93-8bfd-4917-a469-1eef690e6ba4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "order_ids": [
        "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2"
      ],
      "started_at": "2026-10-28T10:06:16.222669Z",
      "answered_at": "2026-10-28T10:06:16.739024Z",
      "ended_at": "2026-10-28T10:06:16.760252Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:06:23.835399Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/32b9472a-5ef5-48bb-b9b1-246bfb01d6f2` → **200**

```json
{
  "id": "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2",
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
  "created_at": "2026-10-28T10:06:15.976305Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678670031"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/32b9472a-5ef5-48bb-b9b1-246bfb01d6f2/cancel` → **200**

```json
{
  "command_id": "55ecf69f-1a9c-45a3-bdea-f649bc4aa461",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "32b9472a-5ef5-48bb-b9b1-246bfb01d6f2",
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
  "created_at": "2026-10-28T10:06:15.976305Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678670031"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
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
  "command_id": "6335e4c2-3955-4e65-aad1-b1333788c354",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T10:06:26.381229Z",
  "extension": "101"
}
```

Done: outgoing call 23cb2e93-8bfd-4917-a469-1eef690e6ba4 from order 32b9472a-5ef5-48bb-b9b1-246bfb01d6f2, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633248086",
  "device_ref": "sandbox-28767"
}
```

```json
{
  "challenge_id": "600e0382-1902-433a-b032-03613d34f3b4",
  "expires_at": "2026-10-28T10:11:26.603047395Z",
  "resend_available_at": "2026-10-28T10:06:27.603047395Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633248086` → **200**

```json
{
  "phone": "+380633248086",
  "audience": "CLIENT",
  "code": "216559",
  "sent_at": "2026-10-28T10:06:26.605354532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "600e0382-1902-433a-b032-03613d34f3b4",
  "code": "216559",
  "device_ref": "sandbox-28767"
}
```

```json
{
  "session_id": "5c4bdbc2-67f0-4827-a701-c1f806231d2f",
  "subject": {
    "type": "CLIENT",
    "id": "e1664cf8-d6b4-4723-b702-3ad22c25e308"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTY2NGNmOC1kNmI0LTQ3MjMtYjcwMi0zYWQyMmMyNWUzMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODg2LCJpYXQiOjE3OTMxODE5ODYsImp0aSI6ImE2ZDZkMjRlLTE5MGEtNGRmNC05NGIyLTQzYWRlY2MwNmMyZCIsInNpZCI6IjVjNGJkYmMyLTY3ZjAtNDgyNy1hNzAxLWMxZjgwNjIzMWQyZiJ9.UDy7D8BaThKcY3FS29o4T9XlJVek4I26xqvLllPHQcM",
  "access_expires_at": "2026-10-28T10:21:26.842067985Z",
  "refresh_token": "A5DeMRWbdUoa-FdF8Sr-f_xFzfKbtDmCP12KOBuzPqs",
  "refresh_expires_at": "2026-11-27T10:06:26.841588525Z",
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
  "session_id": "35cfc98d-bb6d-4b76-87c8-c05d74468ee4",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4ODcsImlhdCI6MTc5MzE4MTk4NywianRpIjoiNjVkNjNiNWYtOWNjOC00NGUzLTlkNTQtMjRlYzU0ZTY0ZTgyIiwic2lkIjoiMzVjZmM5OGQtYmI2ZC00Yjc2LTg3YzgtYzA1ZDc0NDY4ZWU0In0.7A9kgEOahxTuRe4R68HHvcNBfSNJDY2BOrZOem9zxUE",
  "access_expires_at": "2026-10-28T10:21:27.805616892Z",
  "refresh_token": "Fz3dAbOMV9DACjPagvMMCL7gxxBqZAIN43C4qg_XLk0",
  "refresh_expires_at": "2026-10-28T22:06:27.805062753Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633248086` → **200**

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
  "correlation_id": "ab616747-2926-44cc-a372-7ef2e55ba2ea"
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
  "session_id": "5bc8e314-b416-4c5c-8f93-4aaead5e579d",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4ODgsImlhdCI6MTc5MzE4MTk4OCwianRpIjoiMTBiOTBmMzEtNmQ3Mi00YzM0LTkyYzUtZTk1NzIyYjYxYjAxIiwic2lkIjoiNWJjOGUzMTQtYjQxNi00YzVjLThmOTMtNGFhZWFkNWU1NzlkIn0.htCMMJxsu-xi4H8jXaCNFAM-gtDQOaKvcL6Rck8OktQ",
  "access_expires_at": "2026-10-28T10:21:28.764628006Z",
  "refresh_token": "cE0gur2YE5n_qGdbYj6XaBZUWIDxnHUuvPgHOgGGhVc",
  "refresh_expires_at": "2026-10-28T22:06:28.764047487Z",
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
  "command_id": "b470bd98-0360-4a28-92b1-63212d6266f1",
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
  "changed_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:06:29.232750547Z"
}
```

## The rider books the airport for 2026-10-28T13:06:28Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600365214",
  "device_ref": "sandbox-24439"
}
```

```json
{
  "challenge_id": "9af55adc-04a1-44bb-8b78-9b97f4b6d47e",
  "expires_at": "2026-10-28T10:11:29.45742367Z",
  "resend_available_at": "2026-10-28T10:06:30.45742367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600365214` → **200**

```json
{
  "phone": "+48600365214",
  "audience": "CLIENT",
  "code": "893696",
  "sent_at": "2026-10-28T10:06:29.45940232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9af55adc-04a1-44bb-8b78-9b97f4b6d47e",
  "code": "893696",
  "device_ref": "sandbox-24439"
}
```

```json
{
  "session_id": "5387e0ba-3e38-4534-9be4-e7009ce4f60d",
  "subject": {
    "type": "CLIENT",
    "id": "bddbb302-0afc-436c-b09f-1f25e990d0fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZGRiYjMwMi0wYWZjLTQzNmMtYjA5Zi0xZjI1ZTk5MGQwZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODg5LCJpYXQiOjE3OTMxODE5ODksImp0aSI6ImQwM2RhYWMwLWIyZWEtNDY0MS04OGYzLTg3ODEyODI5YjMyMiIsInNpZCI6IjUzODdlMGJhLTNlMzgtNDUzNC05YmU0LWU3MDA5Y2U0ZjYwZCJ9.IQg-o2S3bRFGblNjEjsneoOTvv5YR42hWS2-HM_0Z0E",
  "access_expires_at": "2026-10-28T10:21:29.698150739Z",
  "refresh_token": "-0qEJHNmveTJ9utMXyL0eTxHZWWRCFD9Go57OoOiM9E",
  "refresh_expires_at": "2026-11-27T10:06:29.697584958Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2c6cdef3-4afa-420a-b254-ef904be2ce6b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:06:28Z"
}
```

```json
{
  "id": "f85a52c3-d931-480a-8018-54611fef4500",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:11:29.923205Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:06:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b2a2baf9-5efa-4cca-8416-a6f1bb69c53f",
  "quote_id": "f85a52c3-d931-480a-8018-54611fef4500",
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
  "pickup_at": "2026-10-28T13:06:28Z"
}
```

```json
{
  "id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bddbb302-0afc-436c-b09f-1f25e990d0fe",
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
  "created_at": "2026-10-28T10:06:30.151195Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:06:28Z",
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
  "device_ref": "sandbox-4097"
}
```

```json
{
  "challenge_id": "dd36f31c-200c-47df-8f36-b9fc67ddfa3e",
  "expires_at": "2026-10-28T10:11:30.385938159Z",
  "resend_available_at": "2026-10-28T10:06:31.385938159Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "309204",
  "sent_at": "2026-10-28T10:06:30.388001272Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd36f31c-200c-47df-8f36-b9fc67ddfa3e",
  "code": "309204",
  "device_ref": "sandbox-4097"
}
```

```json
{
  "session_id": "54b72c12-3795-41f5-8402-1d3960e2e1f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjg5MCwiaWF0IjoxNzkzMTgxOTkwLCJqdGkiOiI1OTZjYTgxOC03YTBlLTQ1ODItYTVmZC01ZGYwZTIyYWY2OTYiLCJzaWQiOiI1NGI3MmMxMi0zNzk1LTQxZjUtODQwMi0xZDM5NjBlMmUxZjQifQ.a_FDC7SkNvC2Z8L0jaKtyFAx0eKTEOoYbF6IRCGsANk",
  "access_expires_at": "2026-10-28T10:21:30.626333344Z",
  "refresh_token": "XuNpSk2hF0R4LaIP-G6d-MD-B9WTCNdQ2B9XrYVqDXw",
  "refresh_expires_at": "2026-11-27T10:06:30.625676295Z",
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
  "command_id": "fbfeee2e-dbc5-40f6-a466-f12f32eb85d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:06:31Z",
    "sequence": 1793181991488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "637805cf-4c95-4c15-96e9-a4bda69b9eb0",
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
  "last_heartbeat_at": "2026-10-28T10:06:31.066742Z",
  "last_location_at": "2026-10-28T10:06:31.066742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
      "short_number": 18,
      "pickup_at": "2026-10-28T13:06:28Z",
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

`POST /api/driver/v1/preorders/4b9a6a87-62d3-4f01-bd39-3c5448decef7/reserve` → **200**

```json
{
  "command_id": "9fee75af-0e29-4f03-bba1-be3ec8e0b918"
}
```

```json
{
  "id": "29fcff0d-b8a3-465f-ad2c-9011a2be68fd",
  "state": "RESERVED",
  "order": {
    "order_id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
    "short_number": 18,
    "pickup_at": "2026-10-28T13:06:28Z",
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
  "reserved_at": "2026-10-28T10:06:31.534682Z",
  "confirm_from": "2026-10-28T12:36:28Z",
  "confirm_until": "2026-10-28T12:46:28Z",
  "drop_until": "2026-10-28T12:06:28Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "29fcff0d-b8a3-465f-ad2c-9011a2be68fd",
      "state": "RESERVED",
      "order": {
        "order_id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:06:28Z",
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
      "reserved_at": "2026-10-28T10:06:31.534682Z",
      "confirm_from": "2026-10-28T12:36:28Z",
      "confirm_until": "2026-10-28T12:46:28Z",
      "drop_until": "2026-10-28T12:06:28Z"
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
      "id": "29fcff0d-b8a3-465f-ad2c-9011a2be68fd",
      "state": "RESERVED",
      "order": {
        "order_id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:06:28Z",
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
      "reserved_at": "2026-10-28T10:06:31.534682Z",
      "confirm_from": "2026-10-28T12:36:28Z",
      "confirm_until": "2026-10-28T12:46:28Z",
      "drop_until": "2026-10-28T12:06:28Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/29fcff0d-b8a3-465f-ad2c-9011a2be68fd/confirm` → **409**

```json
{
  "command_id": "3340473b-f91f-4809-8cc3-860a6addf9de"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/29fcff0d-b8a3-465f-ad2c-9011a2be68fd/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "987a5ec8-214a-4a6e-ae03-d064942e8fd9"
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
  "session_id": "432191dc-d162-4ee2-8df7-218299eefeab",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4OTIsImlhdCI6MTc5MzE4MTk5MiwianRpIjoiMjE4YWVmNzgtYWM5Ni00ZmFiLThiZmItZDYwZWFiZDk0NzQ0Iiwic2lkIjoiNDMyMTkxZGMtZDE2Mi00ZWUyLThkZjctMjE4Mjk5ZWVmZWFiIn0.szt-QZzKRGMlzFQUYRm1GTL4JgN1lbELJlfYocouLTw",
  "access_expires_at": "2026-10-28T10:21:32.693194524Z",
  "refresh_token": "uBjgM7QdFzUUibhkpnVBksZhZoQhz2rXoc3SdWGr-zA",
  "refresh_expires_at": "2026-10-28T22:06:32.692669019Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4b9a6a87-62d3-4f01-bd39-3c5448decef7` → **200**

```json
{
  "id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "bddbb302-0afc-436c-b09f-1f25e990d0fe",
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
  "created_at": "2026-10-28T10:06:30.151195Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:06:28Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "29fcff0d-b8a3-465f-ad2c-9011a2be68fd",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:06:31.534682Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4b9a6a87-62d3-4f01-bd39-3c5448decef7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:06:30.15228Z",
      "actor": {
        "type": "CLIENT",
        "id": "bddbb302-0afc-436c-b09f-1f25e990d0fe",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
        "preorder": true,
        "quote_id": "f85a52c3-d931-480a-8018-54611fef4500",
        "pickup_at": "2026-10-28T13:06:28Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "1974ee57-1855-45c3-8c21-0b6cbf441e9a"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:06:31.535746Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4b9a6a87-62d3-4f01-bd39-3c5448decef7",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "29fcff0d-b8a3-465f-ad2c-9011a2be68fd"
      },
      "correlation_id": "6930cd89-e084-4f3a-9b34-1689d456d4a9"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 4b9a6a87-62d3-4f01-bd39-3c5448decef7, reservation 29fcff0d-b8a3-465f-ad2c-9011a2be68fd.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-196"
}
```

```json
{
  "challenge_id": "078d5284-3378-4dcc-a00d-5cd812f31373",
  "expires_at": "2026-10-28T10:11:33.364706666Z",
  "resend_available_at": "2026-10-28T10:06:34.364706666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "142025",
  "sent_at": "2026-10-28T10:06:33.366919275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "078d5284-3378-4dcc-a00d-5cd812f31373",
  "code": "142025",
  "device_ref": "sandbox-196"
}
```

```json
{
  "session_id": "3d1dd1ae-65cc-46ec-8295-84049228d61a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjg5MywiaWF0IjoxNzkzMTgxOTkzLCJqdGkiOiJlYjZlYWQ0Yy1hMGYzLTRmZjQtOTVlYi0zOTNkYWQyMWUyY2UiLCJzaWQiOiIzZDFkZDFhZS02NWNjLTQ2ZWMtODI5NS04NDA0OTIyOGQ2MWEifQ.-jCRYCSNtgJ53U4XAxjdfDCu_T508iTVus9HMAUXdNw",
  "access_expires_at": "2026-10-28T10:21:33.600928696Z",
  "refresh_token": "LtcwJPSgkv_F39JsstV0WLJLbYqrfOOU9ZxFTXgr45Q",
  "refresh_expires_at": "2026-11-27T10:06:33.60029656Z",
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
  "command_id": "9e63b9f2-06b5-4f03-a0cc-95a412f62114",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:06:34Z",
    "sequence": 1793181994344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff0f571b-e289-4838-8e09-7bf73876ee34",
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
  "last_heartbeat_at": "2026-10-28T10:06:34.051405Z",
  "last_location_at": "2026-10-28T10:06:34.051405Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676342384",
  "device_ref": "sandbox-29701"
}
```

```json
{
  "challenge_id": "b8265c24-ad0a-4a3b-9154-60aba8a08ce9",
  "expires_at": "2026-10-28T10:11:34.265815969Z",
  "resend_available_at": "2026-10-28T10:06:35.265815969Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676342384` → **200**

```json
{
  "phone": "+380676342384",
  "audience": "CLIENT",
  "code": "308017",
  "sent_at": "2026-10-28T10:06:34.267841979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8265c24-ad0a-4a3b-9154-60aba8a08ce9",
  "code": "308017",
  "device_ref": "sandbox-29701"
}
```

```json
{
  "session_id": "ef4c9db4-dfb2-43a3-aa18-f995c11ec428",
  "subject": {
    "type": "CLIENT",
    "id": "d0037c7e-7e3d-4eda-a85b-6c6829a7e8b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDAzN2M3ZS03ZTNkLTRlZGEtYTg1Yi02YzY4MjlhN2U4YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyODk0LCJpYXQiOjE3OTMxODE5OTQsImp0aSI6ImRkYWNmMDYzLTQ1ZTMtNDYyYi1hNWQ5LTIyY2Q5MGY3ODlmMyIsInNpZCI6ImVmNGM5ZGI0LWRmYjItNDNhMy1hYTE4LWY5OTVjMTFlYzQyOCJ9.L7oVMjh4TfU4sykc3JWYAYr7Y3ueH4UP4z8fL_x76_s",
  "access_expires_at": "2026-10-28T10:21:34.498982208Z",
  "refresh_token": "gJ55TbOoVzSD0k3FwNru9TsP0NHD_BjJQ-RnF7YixHM",
  "refresh_expires_at": "2026-11-27T10:06:34.498467061Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7aab073e-4cef-4372-9e25-a5a421a82dcd",
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
  "id": "d7552a1d-65ee-42bd-9003-0c3dcbcd1c97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:11:34.717378Z",
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
  "command_id": "ccec1fe0-b788-4495-853a-8130b3776ba8",
  "quote_id": "d7552a1d-65ee-42bd-9003-0c3dcbcd1c97",
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
  "id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d0037c7e-7e3d-4eda-a85b-6c6829a7e8b8",
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
  "created_at": "2026-10-28T10:06:34.942192Z",
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
    "id": "ac70b21e-4c88-463c-abf0-623569e1fcd9",
    "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
    "expires_at": "2026-10-28T10:06:49.945553Z",
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

`POST /api/driver/v1/offers/ac70b21e-4c88-463c-abf0-623569e1fcd9/accept` → **200**

```json
{
  "command_id": "fc975044-375b-4865-8a3c-f6cb95d97a51"
}
```

```json
{
  "id": "ca7b819c-0468-49b9-8a61-24c636c12bcf",
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "db927c5f-5b7e-455c-af05-25d3596e4a66",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "db927c5f-5b7e-455c-af05-25d3596e4a66",
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "assignment_id": "ca7b819c-0468-49b9-8a61-24c636c12bcf",
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

`POST /api/driver/v1/work-sessions/ff0f571b-e289-4838-8e09-7bf73876ee34/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:06:35Z",
    "sequence": 1793181995796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff0f571b-e289-4838-8e09-7bf73876ee34",
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
  "last_heartbeat_at": "2026-10-28T10:06:35.813644Z",
  "last_location_at": "2026-10-28T10:06:35.813644Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "db927c5f-5b7e-455c-af05-25d3596e4a66",
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "assignment_id": "ca7b819c-0468-49b9-8a61-24c636c12bcf",
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

`POST /api/driver/v1/trips/db927c5f-5b7e-455c-af05-25d3596e4a66/arrive` → **200**

```json
{
  "command_id": "3b6a85ee-a6a5-4c34-b931-a251c5830966",
  "expected_version": 0
}
```

```json
{
  "id": "db927c5f-5b7e-455c-af05-25d3596e4a66",
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "assignment_id": "ca7b819c-0468-49b9-8a61-24c636c12bcf",
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
  "arrived_at": "2026-10-28T10:06:36.242569Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/db927c5f-5b7e-455c-af05-25d3596e4a66/start` → **200**

```json
{
  "command_id": "98a9a465-9e68-4710-89d4-bb29aa983f1c",
  "expected_version": 1
}
```

```json
{
  "id": "db927c5f-5b7e-455c-af05-25d3596e4a66",
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "assignment_id": "ca7b819c-0468-49b9-8a61-24c636c12bcf",
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
  "arrived_at": "2026-10-28T10:06:36.242569Z",
  "started_at": "2026-10-28T10:06:36.464997Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ff0f571b-e289-4838-8e09-7bf73876ee34/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:06:36Z",
    "sequence": 1793181996681
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff0f571b-e289-4838-8e09-7bf73876ee34",
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
  "last_heartbeat_at": "2026-10-28T10:06:36.699322Z",
  "last_location_at": "2026-10-28T10:06:36.699322Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/db927c5f-5b7e-455c-af05-25d3596e4a66/complete` → **200**

```json
{
  "command_id": "3cfb3044-cc4a-471a-858c-fe729afb83a2",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:06:36Z",
  "cash_received": true
}
```

```json
{
  "id": "db927c5f-5b7e-455c-af05-25d3596e4a66",
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "assignment_id": "ca7b819c-0468-49b9-8a61-24c636c12bcf",
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
  "arrived_at": "2026-10-28T10:06:36.242569Z",
  "started_at": "2026-10-28T10:06:36.464997Z",
  "completed_at": "2026-10-28T10:06:36.918427Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/87314803-24f8-4feb-871d-08fb7bacc99d/rating` → **200**

```json
{
  "command_id": "0d190811-cbde-46bb-96bd-0a02e05de922",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "score": 5,
  "created_at": "2026-10-28T10:06:37.157393534Z"
}
```

`POST /api/driver/v1/orders/87314803-24f8-4feb-871d-08fb7bacc99d/rating` → **200**

```json
{
  "command_id": "ff1fa7cb-2c2a-401f-9ce9-de7f759093b8",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
  "score": 4,
  "created_at": "2026-10-28T10:06:37.378262478Z"
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
  "session_id": "41281251-040b-495f-a0e1-2960376fce9d",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4OTgsImlhdCI6MTc5MzE4MTk5OCwianRpIjoiODhlMWMwNmYtZWNkNS00ZWYyLTllYTktZWUyN2NhNjZkZmI5Iiwic2lkIjoiNDEyODEyNTEtMDQwYi00OTVmLWEwZTEtMjk2MDM3NmZjZTlkIn0.nk_MRTdUqcJw6itN-8UVe9oyx4fjQCuEa4m84rbj_KQ",
  "access_expires_at": "2026-10-28T10:21:38.104035301Z",
  "refresh_token": "PkxJn05J6HJWwzirlmHPFBmYmurdVqfwAYGl0VF-ELQ",
  "refresh_expires_at": "2026-10-28T22:06:38.103521428Z",
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
  "session_id": "6956ae7a-10b5-42f5-bc52-fdc8b4c04651",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4OTgsImlhdCI6MTc5MzE4MTk5OCwianRpIjoiMjVjMTA1NWItYzZiZi00YzEwLWFjODctZTE5ZmExOGNlMDllIiwic2lkIjoiNjk1NmFlN2EtMTBiNS00MmY1LWJjNTItZmRjOGI0YzA0NjUxIn0.saTkaYFbEYhg0x0UZ1iTUNaWvoHmvFCvkZv29Ws7dek",
  "access_expires_at": "2026-10-28T10:21:38.603254127Z",
  "refresh_token": "4UDdBH2AZKNEOX3Y6BHJac_XtP4mMhRj8nwD1VQoGmA",
  "refresh_expires_at": "2026-10-28T22:06:38.602752285Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/87314803-24f8-4feb-871d-08fb7bacc99d/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
      "author_type": "RIDER",
      "author_id": "d0037c7e-7e3d-4eda-a85b-6c6829a7e8b8",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T10:06:37.157394Z"
    },
    {
      "order_id": "87314803-24f8-4feb-871d-08fb7bacc99d",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "d0037c7e-7e3d-4eda-a85b-6c6829a7e8b8",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T10:06:37.378262Z"
    }
  ]
}
```

Done: ratings for order 87314803-24f8-4feb-871d-08fb7bacc99d.

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
  "session_id": "06bba4ea-f166-43f6-bc74-a5a181e09293",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI4OTksImlhdCI6MTc5MzE4MTk5OSwianRpIjoiNjk2YWVkNmItMTU2ZS00ZjEwLThlMzMtZjc4MWEzNjc4YjE5Iiwic2lkIjoiMDZiYmE0ZWEtZjE2Ni00M2Y2LWJjNzQtYTVhMTgxZTA5MjkzIn0.-gSE8En1kDAyXMyVv6gPO_GkKIUFNhsw64UVjvMs098",
  "access_expires_at": "2026-10-28T10:21:39.353945245Z",
  "refresh_token": "oDcFvnXG5kZRYP80gTiPtW_-vlSNtOod4uZy7JVuQxM",
  "refresh_expires_at": "2026-10-28T22:06:39.353401505Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "01187473-4972-4134-ad38-a46ad698832d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "f2077008-aae6-403a-b1ea-bfddd8adf510",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:39.582784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2077008-aae6-403a-b1ea-bfddd8adf510` → **200**

```json
{
  "id": "f2077008-aae6-403a-b1ea-bfddd8adf510",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:39.582784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2077008-aae6-403a-b1ea-bfddd8adf510` → **200**

```json
{
  "id": "f2077008-aae6-403a-b1ea-bfddd8adf510",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:39.582784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2077008-aae6-403a-b1ea-bfddd8adf510` → **200**

```json
{
  "id": "f2077008-aae6-403a-b1ea-bfddd8adf510",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:39.582784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2077008-aae6-403a-b1ea-bfddd8adf510` → **200**

```json
{
  "id": "f2077008-aae6-403a-b1ea-bfddd8adf510",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:39.582784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f2077008-aae6-403a-b1ea-bfddd8adf510` → **200**

```json
{
  "id": "f2077008-aae6-403a-b1ea-bfddd8adf510",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:06:39.582784Z",
  "ready_at": "2026-10-28T10:06:43.861841Z",
  "expires_at": "2026-10-29T10:06:43.861841Z"
}
```

`GET /api/admin/v1/reports/exports/f2077008-aae6-403a-b1ea-bfddd8adf510/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "885e4910-9dfe-49c5-b867-0514f89f9860",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "2b19ddf2-3115-4b0d-bfbc-73ff131658e9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:44.895931Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2b19ddf2-3115-4b0d-bfbc-73ff131658e9` → **200**

```json
{
  "id": "2b19ddf2-3115-4b0d-bfbc-73ff131658e9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:44.895931Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2b19ddf2-3115-4b0d-bfbc-73ff131658e9` → **200**

```json
{
  "id": "2b19ddf2-3115-4b0d-bfbc-73ff131658e9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:44.895931Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2b19ddf2-3115-4b0d-bfbc-73ff131658e9` → **200**

```json
{
  "id": "2b19ddf2-3115-4b0d-bfbc-73ff131658e9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:44.895931Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2b19ddf2-3115-4b0d-bfbc-73ff131658e9` → **200**

```json
{
  "id": "2b19ddf2-3115-4b0d-bfbc-73ff131658e9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:06:44.895931Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2b19ddf2-3115-4b0d-bfbc-73ff131658e9` → **200**

```json
{
  "id": "2b19ddf2-3115-4b0d-bfbc-73ff131658e9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:06:44.895931Z",
  "ready_at": "2026-10-28T10:06:48.871135Z",
  "expires_at": "2026-10-29T10:06:48.871135Z"
}
```

`GET /api/admin/v1/reports/exports/2b19ddf2-3115-4b0d-bfbc-73ff131658e9/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/c2453291-cb67-495b-992a-030aa460fbf6` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/c2453291-cb67-495b-992a-030aa460fbf6",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9feed9ce-4062-4cf1-8cd5-fe4c594f5493"
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
  "device_ref": "sandbox-17516"
}
```

```json
{
  "challenge_id": "11167a33-38e0-4ad3-b90f-33e4d8471611",
  "expires_at": "2026-10-28T10:11:50.46314073Z",
  "resend_available_at": "2026-10-28T10:06:51.46314073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "519586",
  "sent_at": "2026-10-28T10:06:50.465562113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11167a33-38e0-4ad3-b90f-33e4d8471611",
  "code": "519586",
  "device_ref": "sandbox-17516"
}
```

```json
{
  "session_id": "ae28873c-5562-4dec-89a6-28c4d05050d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjkxMCwiaWF0IjoxNzkzMTgyMDEwLCJqdGkiOiJmMWQ3ZTc0My05MWJhLTQ2NzAtYWQ1Mi1hNGZmMDU5ZDVlOTgiLCJzaWQiOiJhZTI4ODczYy01NTYyLTRkZWMtODlhNi0yOGM0ZDA1MDUwZDgifQ.sDvPNtWntZ6LNGHTjPsgC2YY85WxlA1Jsf18wBIVOFE",
  "access_expires_at": "2026-10-28T10:21:50.70188924Z",
  "refresh_token": "v-CzBS8Pnf5u1t2IFLD1TPqozOS-Tz20KcoQ29smgfE",
  "refresh_expires_at": "2026-11-27T10:06:50.701323749Z",
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
  "command_id": "1d30b737-2dfa-47e7-84f8-9b0608a2296d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:06:51Z",
    "sequence": 1793182011332
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "af9354b1-b917-4f38-aab2-3005ccc51816",
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
  "last_heartbeat_at": "2026-10-28T10:06:51.349468Z",
  "last_location_at": "2026-10-28T10:06:51.349468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "db302f4a-4871-47ed-bfc4-ede3990f423b",
  "points": [
    {
      "sequence": 1793182013570,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:05:53Z"
    },
    {
      "sequence": 1793182013577,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:06:53Z"
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
  "session_id": "f0347314-4841-4278-a11e-a57f116155c1",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI5MTQsImlhdCI6MTc5MzE4MjAxNCwianRpIjoiZDYzNWQ0MTItZmUxNC00YzM4LThlODMtZTlhOTM1NzMwYzUxIiwic2lkIjoiZjAzNDczMTQtNDg0MS00Mjc4LWExMWUtYTU3ZjExNjE1NWMxIn0.0UG_QOwlztmYAq9vspb6g6Z4m-V8YdJjhANnfkQTa2g",
  "access_expires_at": "2026-10-28T10:21:54.129828768Z",
  "refresh_token": "z9Gj1cmbYXJd1FIBPFJzAKowK8LyiRnU425X0Fs7CyA",
  "refresh_expires_at": "2026-10-28T22:06:54.129281065Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "cae0d427-b14d-4343-9fc7-ab926c7fc5ec",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:06:53Z",
        "track_point_id": "d8aac11c-d0a7-4b3c-9290-26cf41861ec0",
        "work_session_id": "af9354b1-b917-4f38-aab2-3005ccc51816"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:06:53Z",
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

`POST /api/admin/v1/driver-risk-flags/cae0d427-b14d-4343-9fc7-ab926c7fc5ec/confirm` → **200**

```json
{
  "command_id": "dfee10d2-6f83-4787-a39b-b1fb4c5f001e",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "cae0d427-b14d-4343-9fc7-ab926c7fc5ec",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:06:53Z",
    "track_point_id": "d8aac11c-d0a7-4b3c-9290-26cf41861ec0",
    "work_session_id": "af9354b1-b917-4f38-aab2-3005ccc51816"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:06:53Z",
  "reason": null,
  "reviewed_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "reviewed_at": "2026-10-28T10:06:54.830786Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/cae0d427-b14d-4343-9fc7-ab926c7fc5ec/dismiss` → **409**

```json
{
  "command_id": "55b94bb1-32b4-48f6-a5bb-ed5dbe713242",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/cae0d427-b14d-4343-9fc7-ab926c7fc5ec/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8cbddf96-4107-49c9-8336-d663d3e79b7e"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "2fc7b22c-0b35-4a4c-bd5c-c93a9863ac21",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "b5e50715-d19f-4a3c-8735-ca902813ec1c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "raised_at": "2026-10-28T10:06:55.285874Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/b5e50715-d19f-4a3c-8735-ca902813ec1c/dismiss` → **200**

```json
{
  "command_id": "9da8cca7-117a-4670-be4d-ad2fbda11451",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "b5e50715-d19f-4a3c-8735-ca902813ec1c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "raised_at": "2026-10-28T10:06:55.285874Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "reviewed_at": "2026-10-28T10:06:55.512945Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "5ad9f212-9338-40d3-b768-9bf77e9ecdbd",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "cae0d427-b14d-4343-9fc7-ab926c7fc5ec"
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
      "actor_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:06:55.743308Z"
    }
  ]
}
```

Done: flag cae0d427-b14d-4343-9fc7-ab926c7fc5ec confirmed, suspension named it, driver reinstated.

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
  "session_id": "ac0877af-5982-4957-b674-a9d2de505b96",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI5MTYsImlhdCI6MTc5MzE4MjAxNiwianRpIjoiMDJjM2VkYzAtOWUxNy00NDg0LWJmODgtN2FkM2ZjZmZmZGEzIiwic2lkIjoiYWMwODc3YWYtNTk4Mi00OTU3LWI2NzQtYTlkMmRlNTA1Yjk2In0.6yUZNrXPsvMC3P3vhvthqHiGwC0RCcR8acVYHmhAofE",
  "access_expires_at": "2026-10-28T10:21:56.482799397Z",
  "refresh_token": "_5aH8PnH0OMK5_-z1TU7HKfRyVfL95PWetw7BEMP3m8",
  "refresh_expires_at": "2026-10-28T22:06:56.48223044Z",
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
      "actor_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:06:55.743308Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "414c4a4a-7d0d-48cf-b785-ae97556ea57d",
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
  "session_id": "af9354b1-b917-4f38-aab2-3005ccc51816",
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
  "last_heartbeat_at": "2026-10-28T10:06:51.349468Z",
  "last_location_at": "2026-10-28T10:06:51.349468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af9354b1-b917-4f38-aab2-3005ccc51816/close` → **200**

```json
{
  "command_id": "3e393243-6c7a-4b7d-9dbc-dbbab3914eb3",
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
  "session_id": "56a6ddaa-17af-47e4-9872-61d32307c55f",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI5MTcsImlhdCI6MTc5MzE4MjAxNywianRpIjoiOWE5NWU4MTEtMDk3Mi00OTc2LWIzNTgtZmY1YTMxNmMzODI2Iiwic2lkIjoiNTZhNmRkYWEtMTdhZi00N2U0LTk4NzItNjFkMzIzMDdjNTVmIn0.OPl1aQjbk5NxjQY_Oj26B9iJbt_RbYqkJ29PrSn92QE",
  "access_expires_at": "2026-10-28T10:21:57.910578621Z",
  "refresh_token": "FFkVlzBSmmgv4_UcbXrlH8aKfYdphqzmTiewhVbWMsk",
  "refresh_expires_at": "2026-10-28T22:06:57.909783934Z",
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
  "command_id": "bc5c9843-31fc-4edb-9f06-b16bfc37aa28",
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
  "changed_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:06:58.35558Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "bc5c9843-31fc-4edb-9f06-b16bfc37aa28",
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
  "changed_by": "02955ed8-cc40-4648-a1c0-e2103485b51e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:06:58.35558Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48573460920",
  "device_ref": "sandbox-1740"
}
```

```json
{
  "challenge_id": "c1ee5ca8-8588-43a8-a406-16d04aba014c",
  "expires_at": "2026-10-28T10:11:58.80777366Z",
  "resend_available_at": "2026-10-28T10:06:59.80777366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48573460920` → **200**

```json
{
  "phone": "+48573460920",
  "audience": "CLIENT",
  "code": "933094",
  "sent_at": "2026-10-28T10:06:58.810176507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1ee5ca8-8588-43a8-a406-16d04aba014c",
  "code": "933094",
  "device_ref": "sandbox-1740"
}
```

```json
{
  "session_id": "b632225b-1a51-4388-8b92-44e4cbc1115a",
  "subject": {
    "type": "CLIENT",
    "id": "18d0b1b0-c7a1-4d8e-956a-47d984199b74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGQwYjFiMC1jN2ExLTRkOGUtOTU2YS00N2Q5ODQxOTliNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyOTE5LCJpYXQiOjE3OTMxODIwMTksImp0aSI6IjVmMTg0OTQ1LThlYjEtNDk1Zi05ZGZlLTVkNDc2MGEzNjFhNCIsInNpZCI6ImI2MzIyMjViLTFhNTEtNDM4OC04YjkyLTQ0ZTRjYmMxMTE1YSJ9.MrWGVOyO9gnIxZ9skw2XORsswZFRNo3ZyDndRf_-vwE",
  "access_expires_at": "2026-10-28T10:21:59.049531706Z",
  "refresh_token": "hM5vQK8IrPcmWYuDwRooSS4HGfolkC4N4HzMjAteyLs",
  "refresh_expires_at": "2026-11-27T10:06:59.049006844Z",
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
  "correlation_id": "9a80776d-f2af-48b9-92b5-85ff5255a20f"
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
  "device_ref": "sandbox-30187"
}
```

```json
{
  "challenge_id": "88624835-4d51-45ef-9dfe-7ced63783657",
  "expires_at": "2026-10-28T10:11:59.713733049Z",
  "resend_available_at": "2026-10-28T10:07:00.713733049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "324317",
  "sent_at": "2026-10-28T10:06:59.715810711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88624835-4d51-45ef-9dfe-7ced63783657",
  "code": "324317",
  "device_ref": "sandbox-30187"
}
```

```json
{
  "session_id": "7fd3f01d-cd10-471b-8bb0-cbd7a8fbfd39",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjkxOSwiaWF0IjoxNzkzMTgyMDE5LCJqdGkiOiIxNmJmM2RkMC1lMGY1LTQxOWItYjM3Zi02NWZhOGRlZWJmY2EiLCJzaWQiOiI3ZmQzZjAxZC1jZDEwLTQ3MWItOGJiMC1jYmQ3YThmYmZkMzkifQ._WoLX9w3OuKgIr42iHxQbFIJbHvNfEZSdbGShGmxQKQ",
  "access_expires_at": "2026-10-28T10:21:59.952940466Z",
  "refresh_token": "ORnlcLEqoJ0Q0jUY8nOkxN17PsT49m5vGWy8DoqO08M",
  "refresh_expires_at": "2026-11-27T10:06:59.952406845Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "637805cf-4c95-4c15-96e9-a4bda69b9eb0",
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
  "last_heartbeat_at": "2026-10-28T10:06:31.066742Z",
  "last_location_at": "2026-10-28T10:06:31.066742Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/637805cf-4c95-4c15-96e9-a4bda69b9eb0/handover` → **200**

```json
{
  "command_id": "90046a14-fe08-4781-a2e4-1e442d1f8b50",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "637805cf-4c95-4c15-96e9-a4bda69b9eb0",
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
  "last_heartbeat_at": "2026-10-28T10:06:31.066742Z",
  "last_location_at": "2026-10-28T10:06:31.066742Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/637805cf-4c95-4c15-96e9-a4bda69b9eb0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:07:00Z",
    "sequence": 1793182020615
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "637805cf-4c95-4c15-96e9-a4bda69b9eb0",
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
  "last_heartbeat_at": "2026-10-28T10:07:00.633928Z",
  "last_location_at": "2026-10-28T10:07:00.633928Z",
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
  "session_id": "637805cf-4c95-4c15-96e9-a4bda69b9eb0",
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
  "last_heartbeat_at": "2026-10-28T10:07:00.633928Z",
  "last_location_at": "2026-10-28T10:07:00.633928Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/637805cf-4c95-4c15-96e9-a4bda69b9eb0/close` → **200**

```json
{
  "command_id": "513c3f4c-f3ac-4a92-a028-23c68276290b",
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
  "correlation_id": "0d6b40a6-2fe5-4c04-af3e-4de1093aea20"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675449447",
  "device_ref": "sandbox-29908"
}
```

```json
{
  "challenge_id": "679d5aa7-8ea2-46b0-becb-3950a266075c",
  "expires_at": "2026-10-28T10:12:01.741330481Z",
  "resend_available_at": "2026-10-28T10:07:02.741330481Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675449447` → **200**

```json
{
  "phone": "+380675449447",
  "audience": "CLIENT",
  "code": "158929",
  "sent_at": "2026-10-28T10:07:01.743316746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "679d5aa7-8ea2-46b0-becb-3950a266075c",
  "code": "158929",
  "device_ref": "sandbox-29908"
}
```

```json
{
  "session_id": "b7be1a41-4663-4828-92a9-7fd927faf1c3",
  "subject": {
    "type": "CLIENT",
    "id": "076f862c-6133-4df0-99c9-641117131030"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzZmODYyYy02MTMzLTRkZjAtOTljOS02NDExMTcxMzEwMzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyOTIxLCJpYXQiOjE3OTMxODIwMjEsImp0aSI6IjBhYTIzZWZkLWE3N2ItNGM5NS05ZGU3LTgxZWYyODllNTA1NSIsInNpZCI6ImI3YmUxYTQxLTQ2NjMtNDgyOC05MmE5LTdmZDkyN2ZhZjFjMyJ9.HKH6e4iswh65XMwxO9b_T0l6QXfjht9bQ9STURPf7DU",
  "access_expires_at": "2026-10-28T10:22:01.98260004Z",
  "refresh_token": "guQ_PH8gUOQzebP59zqZb9ao3dMnr3RNoskMaJZFbWU",
  "refresh_expires_at": "2026-11-27T10:07:01.982065107Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "652c1009-08ac-42bf-a5bb-91b3eea77b31",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "89853e02-094a-47a4-9112-a8d18f581986",
  "upload_path": "/api/rider/v1/uploads/89853e02-094a-47a4-9112-a8d18f581986",
  "expires_at": "2026-10-28T10:22:02.206665544Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/89853e02-094a-47a4-9112-a8d18f581986` → **200**

```json
{
  "file_id": "89853e02-094a-47a4-9112-a8d18f581986",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "d142e7ec-0824-448e-92ce-eebabcc80056",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "89853e02-094a-47a4-9112-a8d18f581986"
  ]
}
```

```json
{
  "id": "8c53ffb4-51ba-44b5-83fa-e983dc48ff09",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "076f862c-6133-4df0-99c9-641117131030",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:07:02.460764Z",
  "updated_at": "2026-10-28T10:07:02.460764Z",
  "messages": [
    {
      "id": "a265fc4b-bb73-4976-a63d-aa10c788c1e2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "076f862c-6133-4df0-99c9-641117131030",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:07:02.462164Z",
      "attachments": [
        {
          "file_id": "89853e02-094a-47a4-9112-a8d18f581986",
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
  "session_id": "376718d4-b53c-4ea3-a900-ad4e4548acc3",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI5MjIsImlhdCI6MTc5MzE4MjAyMiwianRpIjoiMTcxMzdkZmMtOWJhNC00YTAzLWI0YjgtZjRhNDU5M2I1YmJmIiwic2lkIjoiMzc2NzE4ZDQtYjUzYy00ZWEzLWE5MDAtYWQ0ZTQ1NDhhY2MzIn0.KA6tFHtIwewQv8xEMqiqzZSRGMZrzjcsXevgtzmfuvQ",
  "access_expires_at": "2026-10-28T10:22:02.989931547Z",
  "refresh_token": "EyP6yAGfQw-w6retbnjTwYdOLBKv9fIHYBXKepCDL-A",
  "refresh_expires_at": "2026-10-28T22:07:02.989385793Z",
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
  "session_id": "365139fd-fb7d-4854-8682-9ccae41bcf61",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI5MjMsImlhdCI6MTc5MzE4MjAyMywianRpIjoiZGFlZmU2NzAtZDliNC00MDM4LWEwNWItYTExMmM2MTM2ZGU3Iiwic2lkIjoiMzY1MTM5ZmQtZmI3ZC00ODU0LTg2ODItOWNjYWU0MWJjZjYxIn0.XEgtTn_89xTMAX22Z5ziGkonCx1-MbRKmVDACghwihM",
  "access_expires_at": "2026-10-28T10:22:03.492817403Z",
  "refresh_token": "jGCUmyPlL7DRoH_kYU4umnYPlAFfFgD7LlZZ8668AUE",
  "refresh_expires_at": "2026-10-28T22:07:03.491776181Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8c53ffb4-51ba-44b5-83fa-e983dc48ff09/attachments/89853e02-094a-47a4-9112-a8d18f581986` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "4356b1ea-cd49-48f5-b031-eb44aca05197",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c3f6d5fd-f78d-45ba-baed-b90c3388326d",
  "upload_path": "/api/operator/v1/uploads/c3f6d5fd-f78d-45ba-baed-b90c3388326d",
  "expires_at": "2026-10-28T10:22:03.727212757Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c3f6d5fd-f78d-45ba-baed-b90c3388326d` → **200**

```json
{
  "file_id": "c3f6d5fd-f78d-45ba-baed-b90c3388326d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8c53ffb4-51ba-44b5-83fa-e983dc48ff09` → **200**

```json
{
  "id": "8c53ffb4-51ba-44b5-83fa-e983dc48ff09",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "076f862c-6133-4df0-99c9-641117131030",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:07:02.460764Z",
  "updated_at": "2026-10-28T10:07:02.460764Z",
  "messages": [
    {
      "id": "a265fc4b-bb73-4976-a63d-aa10c788c1e2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "076f862c-6133-4df0-99c9-641117131030",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:07:02.462164Z",
      "attachments": [
        {
          "file_id": "89853e02-094a-47a4-9112-a8d18f581986",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8c53ffb4-51ba-44b5-83fa-e983dc48ff09/comments` → **200**

```json
{
  "command_id": "224c8c10-bb9e-44b5-bf20-9cc5f2195f78",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c3f6d5fd-f78d-45ba-baed-b90c3388326d"
  ]
}
```

```json
{
  "id": "8c53ffb4-51ba-44b5-83fa-e983dc48ff09",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "076f862c-6133-4df0-99c9-641117131030",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:07:02.460764Z",
  "updated_at": "2026-10-28T10:07:04.201464Z",
  "messages": [
    {
      "id": "a265fc4b-bb73-4976-a63d-aa10c788c1e2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "076f862c-6133-4df0-99c9-641117131030",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:07:02.462164Z",
      "attachments": [
        {
          "file_id": "89853e02-094a-47a4-9112-a8d18f581986",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ae99c791-0856-41f1-ae40-1e92907bbb5d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:07:04.201121Z",
      "attachments": [
        {
          "file_id": "c3f6d5fd-f78d-45ba-baed-b90c3388326d",
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

`GET /api/rider/v1/support/cases/8c53ffb4-51ba-44b5-83fa-e983dc48ff09` → **200**

```json
{
  "id": "8c53ffb4-51ba-44b5-83fa-e983dc48ff09",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "076f862c-6133-4df0-99c9-641117131030",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:07:02.460764Z",
  "updated_at": "2026-10-28T10:07:04.201464Z",
  "messages": [
    {
      "id": "a265fc4b-bb73-4976-a63d-aa10c788c1e2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "076f862c-6133-4df0-99c9-641117131030",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:07:02.462164Z",
      "attachments": [
        {
          "file_id": "89853e02-094a-47a4-9112-a8d18f581986",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ae99c791-0856-41f1-ae40-1e92907bbb5d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:07:04.201121Z",
      "attachments": [
        {
          "file_id": "c3f6d5fd-f78d-45ba-baed-b90c3388326d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8c53ffb4-51ba-44b5-83fa-e983dc48ff09/attachments/c3f6d5fd-f78d-45ba-baed-b90c3388326d` → **200**

Done: support case 8c53ffb4-51ba-44b5-83fa-e983dc48ff09, rider attachment 89853e02-094a-47a4-9112-a8d18f581986, operator attachment c3f6d5fd-f78d-45ba-baed-b90c3388326d.

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
  "session_id": "ea0ee98a-3a70-4a01-b2dc-0ebdac080db7",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI5MjQsImlhdCI6MTc5MzE4MjAyNCwianRpIjoiODc0NmEzZTQtMzU2Ni00OGJjLThjMWMtNDAwZmE2NTMyMzBmIiwic2lkIjoiZWEwZWU5OGEtM2E3MC00YTAxLWIyZGMtMGViZGFjMDgwZGI3In0.GBLJPLFe59BkBJgLTfEdqBFeWTXO2IGpnb1aQyFYnf4",
  "access_expires_at": "2026-10-28T10:22:04.986790652Z",
  "refresh_token": "_f17X7DveHDCRRCuzyQLJp-RfR-mx05VI96C16ioZLY",
  "refresh_expires_at": "2026-10-28T22:07:04.986177201Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24923"
}
```

```json
{
  "challenge_id": "2479a3bb-772f-4a90-9921-bcde3fdbb9c2",
  "expires_at": "2026-10-28T10:12:05.199363624Z",
  "resend_available_at": "2026-10-28T10:07:06.199363624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "602477",
  "sent_at": "2026-10-28T10:07:05.201724923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2479a3bb-772f-4a90-9921-bcde3fdbb9c2",
  "code": "602477",
  "device_ref": "sandbox-24923"
}
```

```json
{
  "session_id": "e8736c5b-e555-46c3-b332-c93b4c33965d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjkyNSwiaWF0IjoxNzkzMTgyMDI1LCJqdGkiOiJmMDUwODM3ZC0yMmUzLTRjNzItOTBhNC03MzY1NDc0Y2Q0OTIiLCJzaWQiOiJlODczNmM1Yi1lNTU1LTQ2YzMtYjMzMi1jOTNiNGMzMzk2NWQifQ.ZTGgB_zcZj-uMrsDJKvtVHEVRAVuMufsLHcAbcxAWyE",
  "access_expires_at": "2026-10-28T10:22:05.435865149Z",
  "refresh_token": "NYUPYGBlW2QfBZLPIlnOnmjYwkG56-ZM8JHYe7625JM",
  "refresh_expires_at": "2026-11-27T10:07:05.435256177Z",
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
      "actor_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:06:55.743308Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "02955ed8-cc40-4648-a1c0-e2103485b51e",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:06:56.926893Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "cb7c28a6-98f8-45cb-9efe-4d8f08a6f003",
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
  "device_ref": "sandbox-14199"
}
```

```json
{
  "challenge_id": "2b3f0140-30ee-421e-9659-e871b39e8761",
  "expires_at": "2026-10-28T10:12:06.324787071Z",
  "resend_available_at": "2026-10-28T10:07:07.324787071Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "229415",
  "sent_at": "2026-10-28T10:07:06.326887721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b3f0140-30ee-421e-9659-e871b39e8761",
  "code": "229415",
  "device_ref": "sandbox-14199"
}
```

```json
{
  "session_id": "43a0bdb9-85c4-4445-8cf1-727157b4429c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjkyNiwiaWF0IjoxNzkzMTgyMDI2LCJqdGkiOiI2YTczYmM3Zi1iMTkxLTQ1OGEtYjM1Ny0xN2RiOGRiZmNlMTkiLCJzaWQiOiI0M2EwYmRiOS04NWM0LTQ0NDUtOGNmMS03MjcxNTdiNDQyOWMifQ.cIoJgsXtkRsZTmRa5WBiRUyF0hUumeHsR44zmo0m1lk",
  "access_expires_at": "2026-10-28T10:22:06.56221285Z",
  "refresh_token": "hDr6ITUJiQ-nvJaFkNTm1qANHFEO9CmWd5hOXI2bqQc",
  "refresh_expires_at": "2026-11-27T10:07:06.561655124Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff0f571b-e289-4838-8e09-7bf73876ee34",
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
  "last_heartbeat_at": "2026-10-28T10:06:36.699322Z",
  "last_location_at": "2026-10-28T10:06:36.699322Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ff0f571b-e289-4838-8e09-7bf73876ee34/handover` → **200**

```json
{
  "command_id": "82e8ff5f-0273-4b4e-ad79-b288d49a1651",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff0f571b-e289-4838-8e09-7bf73876ee34",
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
  "last_heartbeat_at": "2026-10-28T10:06:36.699322Z",
  "last_location_at": "2026-10-28T10:06:36.699322Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ff0f571b-e289-4838-8e09-7bf73876ee34/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:07:07Z",
    "sequence": 1793182027196
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff0f571b-e289-4838-8e09-7bf73876ee34",
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
  "last_heartbeat_at": "2026-10-28T10:07:07.214081Z",
  "last_location_at": "2026-10-28T10:07:07.214081Z",
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
  "command_id": "547ee947-174c-4903-a14e-192454b0e83f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:07:07Z",
    "sequence": 1793182027637
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ecc5609f-1a81-48b9-bb9e-17a56c3d8843",
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
  "last_heartbeat_at": "2026-10-28T10:07:07.65689Z",
  "last_location_at": "2026-10-28T10:07:07.65689Z",
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
  "session_id": "4c6120c7-bce7-4ec4-83bc-e559a050f4b1",
  "subject": {
    "type": "STAFF",
    "id": "02955ed8-cc40-4648-a1c0-e2103485b51e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjk1NWVkOC1jYzQwLTQ2NDgtYTFjMC1lMjEwMzQ4NWI1MWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI5MjgsImlhdCI6MTc5MzE4MjAyOCwianRpIjoiOGFkZGVmNGUtOGI0OC00N2VjLWI2YTctZDdkM2M0ZDU3MzVjIiwic2lkIjoiNGM2MTIwYzctYmNlNy00ZWM0LTgzYmMtZTU1OWEwNTBmNGIxIn0.RbhWCSO1Q1PZF43MOkrJjm533pCCF5kCMK8ZGUHTN1Y",
  "access_expires_at": "2026-10-28T10:22:08.166552081Z",
  "refresh_token": "YjtqaqvCfrX2dwtPRlMJIgJciOnP7-F7opZ1PlJMb3U",
  "refresh_expires_at": "2026-10-28T22:07:08.165889561Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "889573e7-37a3-4b8a-a945-03ecf264e1fa",
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
  "id": "e2a51379-e2ba-417f-b04c-0754930e83db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:12:08.397073Z",
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
  "command_id": "19b59bd4-e107-4807-a0af-5fced4246b27",
  "quote_id": "e2a51379-e2ba-417f-b04c-0754930e83db",
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
  "id": "67d1809a-870b-49d2-a766-473c5ea3d492",
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
  "created_at": "2026-10-28T10:07:08.647388Z",
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
    "id": "e3df1ebe-6216-4433-a6f5-5f2460c844eb",
    "order_id": "67d1809a-870b-49d2-a766-473c5ea3d492",
    "expires_at": "2026-10-28T10:07:23.652276Z",
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

`POST /api/driver/v1/offers/e3df1ebe-6216-4433-a6f5-5f2460c844eb/accept` → **200**

```json
{
  "command_id": "c15c3bbc-ceca-41da-9ae1-44ea266018ed"
}
```

```json
{
  "id": "98b09008-93b3-4ea4-96ab-44ddd1dbdf28",
  "order_id": "67d1809a-870b-49d2-a766-473c5ea3d492",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a2be6bc-fdab-40b1-8dda-264444ef1c39",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a2be6bc-fdab-40b1-8dda-264444ef1c39",
  "order_id": "67d1809a-870b-49d2-a766-473c5ea3d492",
  "assignment_id": "98b09008-93b3-4ea4-96ab-44ddd1dbdf28",
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

`POST /api/driver/v1/work-sessions/ecc5609f-1a81-48b9-bb9e-17a56c3d8843/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:07:09Z",
    "sequence": 1793182029779
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ecc5609f-1a81-48b9-bb9e-17a56c3d8843",
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
  "last_heartbeat_at": "2026-10-28T10:07:09.797018Z",
  "last_location_at": "2026-10-28T10:07:09.797018Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4a2be6bc-fdab-40b1-8dda-264444ef1c39/arrive` → **200**

```json
{
  "command_id": "47b1dcc7-b13b-4c93-a2b7-e9f1a9729ebc",
  "expected_version": 0
}
```

```json
{
  "id": "4a2be6bc-fdab-40b1-8dda-264444ef1c39",
  "order_id": "67d1809a-870b-49d2-a766-473c5ea3d492",
  "assignment_id": "98b09008-93b3-4ea4-96ab-44ddd1dbdf28",
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
  "arrived_at": "2026-10-28T10:07:10.021162Z",
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

`POST /api/driver/v1/trips/4a2be6bc-fdab-40b1-8dda-264444ef1c39/start` → **200**

```json
{
  "command_id": "280e6372-f5bd-4670-a2fc-3e850803eeed",
  "expected_version": 1
}
```

```json
{
  "id": "4a2be6bc-fdab-40b1-8dda-264444ef1c39",
  "order_id": "67d1809a-870b-49d2-a766-473c5ea3d492",
  "assignment_id": "98b09008-93b3-4ea4-96ab-44ddd1dbdf28",
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
  "arrived_at": "2026-10-28T10:07:10.021162Z",
  "started_at": "2026-10-28T10:07:10.254202Z",
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

`POST /api/driver/v1/trips/4a2be6bc-fdab-40b1-8dda-264444ef1c39/complete` → **200**

```json
{
  "command_id": "3c3f0ffd-226a-4474-9856-2210b1e4fc80",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:07:10Z",
  "cash_received": true
}
```

```json
{
  "id": "4a2be6bc-fdab-40b1-8dda-264444ef1c39",
  "order_id": "67d1809a-870b-49d2-a766-473c5ea3d492",
  "assignment_id": "98b09008-93b3-4ea4-96ab-44ddd1dbdf28",
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
  "arrived_at": "2026-10-28T10:07:10.021162Z",
  "started_at": "2026-10-28T10:07:10.254202Z",
  "completed_at": "2026-10-28T10:07:10.48544Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/67d1809a-870b-49d2-a766-473c5ea3d492` → **200**

```json
{
  "id": "67d1809a-870b-49d2-a766-473c5ea3d492",
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
    "id": "98b09008-93b3-4ea4-96ab-44ddd1dbdf28",
    "order_id": "67d1809a-870b-49d2-a766-473c5ea3d492",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4a2be6bc-fdab-40b1-8dda-264444ef1c39",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:07:08.647388Z",
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
  "session_id": "ff0f571b-e289-4838-8e09-7bf73876ee34",
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
  "last_heartbeat_at": "2026-10-28T10:07:07.214081Z",
  "last_location_at": "2026-10-28T10:07:07.214081Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ff0f571b-e289-4838-8e09-7bf73876ee34/close` → **200**

```json
{
  "command_id": "77b501e8-b2b1-45d8-b85c-4e24dd3cca2f",
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
  "session_id": "ecc5609f-1a81-48b9-bb9e-17a56c3d8843",
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
  "last_heartbeat_at": "2026-10-28T10:07:09.797018Z",
  "last_location_at": "2026-10-28T10:07:09.797018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ecc5609f-1a81-48b9-bb9e-17a56c3d8843/close` → **200**

```json
{
  "command_id": "3407f41b-9ca6-4435-be48-0aff7f807614",
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

Done: terminal order 67d1809a-870b-49d2-a766-473c5ea3d492 by Andrii (5a000000-0000-4000-8000-000000000403).
