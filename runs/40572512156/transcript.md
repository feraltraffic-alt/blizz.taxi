# Sandbox transcript (2026-10-27T19:50:02Z, 1c95df3)

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
  "correlation_id": "17d0c6eb-4737-4518-80ff-68b0617503dd"
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
  "session_id": "08da2c81-1030-43a0-bde4-f357861af229",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MDMsImlhdCI6MTc5MzEzMDYwMywianRpIjoiNDgyOTNmZjMtYTJjZS00N2QxLWI5ZTMtOTBmN2M4OTZiZDJhIiwic2lkIjoiMDhkYTJjODEtMTAzMC00M2EwLWJkZTQtZjM1Nzg2MWFmMjI5In0.ovD9m1vW-bqLJ3IfhfJ6woBCmsZohR4gYXZwQsIMJBM",
  "access_expires_at": "2026-10-27T20:05:03.62154365Z",
  "refresh_token": "mIyf7utP1Gy3kSvaujNSHa5ZCXDqPATiBCtZEJSy3Sc",
  "refresh_expires_at": "2026-10-28T07:50:03.618982976Z",
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
  "session_id": "5c410f51-859c-4724-b070-124b84d7a8bf",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MDQsImlhdCI6MTc5MzEzMDYwNCwianRpIjoiNTBiYjE4MmYtMTUwMy00NWVhLTk3Y2QtMmY1ZTA0MWI5ZTVkIiwic2lkIjoiNWM0MTBmNTEtODU5Yy00NzI0LWIwNzAtMTI0Yjg0ZDdhOGJmIn0.0viPDZzMhVBvebB9iObXPHShE2OuDcAT4Q2AB746c3A",
  "access_expires_at": "2026-10-27T20:05:04.899192922Z",
  "refresh_token": "625-f1HbnuEenpog8lEq1_wRhKMsxlvDROBl93uDZ9g",
  "refresh_expires_at": "2026-10-28T07:50:04.898143284Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "e0bf24ed-5256-4f4e-9c04-659a5a4cfe74",
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
  "id": "8feef11a-3c42-4c96-b3ae-6c38fda99d3b",
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
  "created_by": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "created_at": "2026-10-27T19:50:04.961509Z",
  "updated_at": "2026-10-27T19:50:04.961509Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638470985",
  "device_ref": "sandbox-25327"
}
```

```json
{
  "challenge_id": "90a15b30-1e30-4237-81a0-763a5a5b5d0a",
  "expires_at": "2026-10-27T19:55:05.010950746Z",
  "resend_available_at": "2026-10-27T19:50:06.010950746Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638470985` → **200**

```json
{
  "phone": "+380638470985",
  "audience": "CLIENT",
  "code": "130423",
  "sent_at": "2026-10-27T19:50:05.022946843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90a15b30-1e30-4237-81a0-763a5a5b5d0a",
  "code": "130423",
  "device_ref": "sandbox-25327"
}
```

```json
{
  "session_id": "89cb0c34-417b-4dc4-ae3c-5f190bd73373",
  "subject": {
    "type": "CLIENT",
    "id": "bcfbc197-0f7c-4443-b6e9-66f842e5a6e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiY2ZiYzE5Ny0wZjdjLTQ0NDMtYjZlOS02NmY4NDJlNWE2ZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTA1LCJpYXQiOjE3OTMxMzA2MDUsImp0aSI6Ijc2MjAzM2VjLWU3MjktNGNhNy04OTQ3LWY4NmIxNzFlNDY4MiIsInNpZCI6Ijg5Y2IwYzM0LTQxN2ItNGRjNC1hZTNjLTVmMTkwYmQ3MzM3MyJ9.1jHJSP_C62H2h-dvJVuKWE_gFfUpCFQ4UM334Nww3BQ",
  "access_expires_at": "2026-10-27T20:05:05.110382378Z",
  "refresh_token": "U66id8Jsm5fUV9jWtfvfXEV_E_4eGCsuo-q0U2qOPwY",
  "refresh_expires_at": "2026-11-26T19:50:05.109176404Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638470985` → **200**

```json
{
  "client_id": "bcfbc197-0f7c-4443-b6e9-66f842e5a6e5"
}
```

`POST /api/admin/v1/rider-wallets/bcfbc197-0f7c-4443-b6e9-66f842e5a6e5/top-ups` → **201**

```json
{
  "command_id": "2f262937-582d-4e2e-b408-319dbaf989db",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "bcfbc197-0f7c-4443-b6e9-66f842e5a6e5",
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
      "id": "2dde2dfc-c911-4754-b138-6a8e654e224e",
      "at": "2026-10-27T19:50:05.194639Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7704136f-7f15-479f-bc4f-28eec7865cdc",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7225bb18-5a50-4b68-96d1-23bc62f4c972",
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
  "id": "c252990b-d7cd-47ba-8955-4502085da513",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:05.346695Z",
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
      "id": "8feef11a-3c42-4c96-b3ae-6c38fda99d3b",
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
  "device_ref": "sandbox-15120"
}
```

```json
{
  "challenge_id": "d1a01b83-0b0d-4cf5-ae0b-d5f75dfc3a7f",
  "expires_at": "2026-10-27T19:55:05.4108487Z",
  "resend_available_at": "2026-10-27T19:50:06.4108487Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "817211",
  "sent_at": "2026-10-27T19:50:05.414712408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1a01b83-0b0d-4cf5-ae0b-d5f75dfc3a7f",
  "code": "817211",
  "device_ref": "sandbox-15120"
}
```

```json
{
  "session_id": "85c88300-d638-4597-8a0f-fb140928135e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUwNSwiaWF0IjoxNzkzMTMwNjA1LCJqdGkiOiJjOGM4ODM2Ny01MWM5LTQxODItOGMwOC00OGUzMGVhY2JhOTciLCJzaWQiOiI4NWM4ODMwMC1kNjM4LTQ1OTctOGEwZi1mYjE0MDkyODEzNWUifQ.LYGXM0AgFmU8HU3hGApzJvDuZrorkRE8fZ-lDwgER-M",
  "access_expires_at": "2026-10-27T20:05:05.472016818Z",
  "refresh_token": "S_emT9bhNd87IcBf3Z_1vdckF77Pia-KOvgAxL4jyWc",
  "refresh_expires_at": "2026-11-26T19:50:05.470859219Z",
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
  "command_id": "7c0b3cf3-719c-4982-9142-0bed17a6ee06",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:05Z",
    "sequence": 1793130605542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "812a640e-ae84-4c7d-91a0-d513ef28a118",
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
  "last_heartbeat_at": "2026-10-27T19:50:05.590895Z",
  "last_location_at": "2026-10-27T19:50:05.590895Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "825abf1d-d7ce-401f-b148-1ef9c8a78ec6",
  "quote_id": "c252990b-d7cd-47ba-8955-4502085da513",
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
  "id": "7ea19b87-4687-47d3-9995-06d6a867abab",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bcfbc197-0f7c-4443-b6e9-66f842e5a6e5",
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
  "created_at": "2026-10-27T19:50:05.678827Z",
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
  "client_id": "bcfbc197-0f7c-4443-b6e9-66f842e5a6e5",
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
      "id": "2dde2dfc-c911-4754-b138-6a8e654e224e",
      "at": "2026-10-27T19:50:05.194639Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7704136f-7f15-479f-bc4f-28eec7865cdc",
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
    "id": "0727f25c-d90d-4d61-b10b-5ad9ff914d87",
    "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab",
    "expires_at": "2026-10-27T19:50:20.693969Z",
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

`POST /api/driver/v1/offers/0727f25c-d90d-4d61-b10b-5ad9ff914d87/accept` → **200**

```json
{
  "command_id": "450e1f30-426d-4d43-a5fe-a57a5e74a79f"
}
```

```json
{
  "id": "a4d703a1-7a66-40bf-afc3-564a1419114c",
  "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d468b821-80bd-4f92-bb4c-3439aca9ba35",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d468b821-80bd-4f92-bb4c-3439aca9ba35",
  "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab",
  "assignment_id": "a4d703a1-7a66-40bf-afc3-564a1419114c",
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

`POST /api/driver/v1/work-sessions/812a640e-ae84-4c7d-91a0-d513ef28a118/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:05Z",
    "sequence": 1793130605866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "812a640e-ae84-4c7d-91a0-d513ef28a118",
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
  "last_heartbeat_at": "2026-10-27T19:50:05.891011Z",
  "last_location_at": "2026-10-27T19:50:05.891011Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d468b821-80bd-4f92-bb4c-3439aca9ba35/arrive` → **200**

```json
{
  "command_id": "cd0ad06f-cdd9-4e6c-b2c9-bbcecb73a6b0",
  "expected_version": 0
}
```

```json
{
  "id": "d468b821-80bd-4f92-bb4c-3439aca9ba35",
  "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab",
  "assignment_id": "a4d703a1-7a66-40bf-afc3-564a1419114c",
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
  "arrived_at": "2026-10-27T19:50:05.94198Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d468b821-80bd-4f92-bb4c-3439aca9ba35/start` → **200**

```json
{
  "command_id": "9f01b60a-bb77-403f-9306-e1290f229df8",
  "expected_version": 1
}
```

```json
{
  "id": "d468b821-80bd-4f92-bb4c-3439aca9ba35",
  "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab",
  "assignment_id": "a4d703a1-7a66-40bf-afc3-564a1419114c",
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
  "arrived_at": "2026-10-27T19:50:05.94198Z",
  "started_at": "2026-10-27T19:50:05.987726Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d468b821-80bd-4f92-bb4c-3439aca9ba35/complete` → **200**

```json
{
  "command_id": "16dfee14-4e17-4df4-abe9-7d3ec5cfc964",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:50:06Z",
  "cash_received": true
}
```

```json
{
  "id": "d468b821-80bd-4f92-bb4c-3439aca9ba35",
  "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab",
  "assignment_id": "a4d703a1-7a66-40bf-afc3-564a1419114c",
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
  "arrived_at": "2026-10-27T19:50:05.94198Z",
  "started_at": "2026-10-27T19:50:05.987726Z",
  "completed_at": "2026-10-27T19:50:06.054744Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "bcfbc197-0f7c-4443-b6e9-66f842e5a6e5",
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
      "id": "96110e2c-7a7c-47f7-93c3-72cbc3b762e8",
      "at": "2026-10-27T19:50:06.654484Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab"
    },
    {
      "id": "2dde2dfc-c911-4754-b138-6a8e654e224e",
      "at": "2026-10-27T19:50:05.194639Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7704136f-7f15-479f-bc4f-28eec7865cdc",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/8feef11a-3c42-4c96-b3ae-6c38fda99d3b/archive` → **200**

```json
{
  "command_id": "841da1b7-3471-4cd9-9f13-d07e3d7911ab",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "8feef11a-3c42-4c96-b3ae-6c38fda99d3b",
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
  "created_by": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "created_at": "2026-10-27T19:50:04.961509Z",
  "updated_at": "2026-10-27T19:50:09.151845Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "812a640e-ae84-4c7d-91a0-d513ef28a118",
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
  "last_heartbeat_at": "2026-10-27T19:50:05.891011Z",
  "last_location_at": "2026-10-27T19:50:05.891011Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/812a640e-ae84-4c7d-91a0-d513ef28a118/close` → **200**

```json
{
  "command_id": "45f3d07f-005b-46b9-8a4c-e4d561f07cf6",
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

Done: order 7ea19b87-4687-47d3-9995-06d6a867abab.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638631553",
  "device_ref": "sandbox-28322"
}
```

```json
{
  "challenge_id": "f0f06b89-33b1-4103-9a1e-60d567322a15",
  "expires_at": "2026-10-27T19:55:09.274348001Z",
  "resend_available_at": "2026-10-27T19:50:10.274348001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638631553` → **200**

```json
{
  "phone": "+380638631553",
  "audience": "CLIENT",
  "code": "192934",
  "sent_at": "2026-10-27T19:50:09.277766993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0f06b89-33b1-4103-9a1e-60d567322a15",
  "code": "192934",
  "device_ref": "sandbox-28322"
}
```

```json
{
  "session_id": "fd0998e3-e3d4-4ccc-9fc4-87e907118689",
  "subject": {
    "type": "CLIENT",
    "id": "6df5ef5b-1437-446d-a466-2ced2627cfc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZGY1ZWY1Yi0xNDM3LTQ0NmQtYTQ2Ni0yY2VkMjYyN2NmYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTA5LCJpYXQiOjE3OTMxMzA2MDksImp0aSI6ImJiYzM2YjkyLTJiZjEtNGZhNi1iMmM1LWFmZjA5YzdkYTIzZiIsInNpZCI6ImZkMDk5OGUzLWUzZDQtNGNjYy05ZmM0LTg3ZTkwNzExODY4OSJ9.bJ1qZjIE2wicluBTTTfX6bYt30G-7xYkhAphBo_zf2Y",
  "access_expires_at": "2026-10-27T20:05:09.33368297Z",
  "refresh_token": "YzOwvAYVYRxqibcNJ8af1JqNYS66Odud94UX5RakF_Q",
  "refresh_expires_at": "2026-11-26T19:50:09.332783415Z",
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
  "device_ref": "sandbox-9690"
}
```

```json
{
  "challenge_id": "943da762-9759-4d57-bbef-fb07dadf60bb",
  "expires_at": "2026-10-27T19:55:09.387697562Z",
  "resend_available_at": "2026-10-27T19:50:10.387697562Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "864058",
  "sent_at": "2026-10-27T19:50:09.392956909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "943da762-9759-4d57-bbef-fb07dadf60bb",
  "code": "864058",
  "device_ref": "sandbox-9690"
}
```

```json
{
  "session_id": "c9b765d8-caa2-4980-b232-c43f05a4483c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUwOSwiaWF0IjoxNzkzMTMwNjA5LCJqdGkiOiI4ZTBhOGMxZS1lNTllLTRmM2QtOGZkYi05NWZjNWExM2E0Y2IiLCJzaWQiOiJjOWI3NjVkOC1jYWEyLTQ5ODAtYjIzMi1jNDNmMDVhNDQ4M2MifQ.fMvwQ-K0PUjRTxCBRqZ3JkKLuoZ1WJYjSOejPHWy_rM",
  "access_expires_at": "2026-10-27T20:05:09.448572777Z",
  "refresh_token": "OhPe0c4dbAjXlw3eo-Yorr1hjoK_cAoP2DB7JkmhxIo",
  "refresh_expires_at": "2026-11-26T19:50:09.447755513Z",
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
  "session_id": "b52c0d2a-bd90-4dfe-a219-77c78cc5c323",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MDksImlhdCI6MTc5MzEzMDYwOSwianRpIjoiOTgyOGViYWItOTUwOC00OTZlLTlmNTYtNTIxNjJkZjgxM2I5Iiwic2lkIjoiYjUyYzBkMmEtYmQ5MC00ZGZlLWEyMTktNzdjNzhjYzVjMzIzIn0.0Il_caoKHMNbXABUd6wOcCZxamOimL9-1wNGkwTzIFw",
  "access_expires_at": "2026-10-27T20:05:09.783574688Z",
  "refresh_token": "BshKdV5hK90uvA612W8SELt8ArDTGLRWiFMhKRsrNzo",
  "refresh_expires_at": "2026-10-28T07:50:09.782864399Z",
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
  "session_id": "15682e77-4379-48ca-afa0-39381ca5056a",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MTAsImlhdCI6MTc5MzEzMDYxMCwianRpIjoiNzUyNDc2YjktZTExZC00MWUzLWJhMGUtNjg0OWE1M2ZiYTljIiwic2lkIjoiMTU2ODJlNzctNDM3OS00OGNhLWFmYTAtMzkzODFjYTUwNTZhIn0.wuNrznriUVgWDL08vzdkgCLxnnvxiyZ8MiOroxrNyJU",
  "access_expires_at": "2026-10-27T20:05:10.093829715Z",
  "refresh_token": "uw0Yx_MIx2EO_NoyOKnCGj0ERa5VvmlEdQwApoVJTp8",
  "refresh_expires_at": "2026-10-28T07:50:10.09303179Z",
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
  "command_id": "a37fa822-fb37-4030-ae1d-8e517cad7494",
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
  "id": "4d17b184-4ea7-4ee2-90be-9b8d5e981ee9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:55:10.158635Z",
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
  "command_id": "6bb558c4-88c4-4e8b-8abb-0c4c3eab3cb3",
  "quote_id": "4d17b184-4ea7-4ee2-90be-9b8d5e981ee9",
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
  "id": "19a74eca-316f-4b63-a418-bfe8370364f5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6df5ef5b-1437-446d-a466-2ced2627cfc9",
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
  "created_at": "2026-10-27T19:50:10.201311Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/19a74eca-316f-4b63-a418-bfe8370364f5` → **200**

```json
{
  "id": "19a74eca-316f-4b63-a418-bfe8370364f5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6df5ef5b-1437-446d-a466-2ced2627cfc9",
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
  "created_at": "2026-10-27T19:50:10.201311Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/19a74eca-316f-4b63-a418-bfe8370364f5/cancel` → **200**

```json
{
  "command_id": "2e6627be-eec4-41b7-8272-9d0db3a7ac70",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "19a74eca-316f-4b63-a418-bfe8370364f5",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6df5ef5b-1437-446d-a466-2ced2627cfc9",
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
  "created_at": "2026-10-27T19:50:10.201311Z",
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
  "command_id": "29acf711-8df6-4472-86bd-afb9d35de86d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:10Z",
    "sequence": 1793130610340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:10.35908Z",
  "last_location_at": "2026-10-27T19:50:10.35908Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14325"
}
```

```json
{
  "challenge_id": "3c52fba2-a99a-47e6-912b-456922b1b096",
  "expires_at": "2026-10-27T19:55:10.38856332Z",
  "resend_available_at": "2026-10-27T19:50:11.38856332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "855353",
  "sent_at": "2026-10-27T19:50:10.391755829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c52fba2-a99a-47e6-912b-456922b1b096",
  "code": "855353",
  "device_ref": "sandbox-14325"
}
```

```json
{
  "session_id": "02b7febb-ed69-4060-9435-b6553947442e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUxMCwiaWF0IjoxNzkzMTMwNjEwLCJqdGkiOiJjNzY0YTRlNC0wN2M2LTQ0NmItYjAwMS1lNDU0ZGFiM2FhN2EiLCJzaWQiOiIwMmI3ZmViYi1lZDY5LTQwNjAtOTQzNS1iNjU1Mzk0NzQ0MmUifQ.2nY7of1ngqF-xXZc2U8M1Y6m92o6iS9-vML_NUsN9dw",
  "access_expires_at": "2026-10-27T20:05:10.446135381Z",
  "refresh_token": "thc45azRiEgGtVpX0hjgrmQOekZM8UQvR9EOKqt87AE",
  "refresh_expires_at": "2026-11-26T19:50:10.445396128Z",
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
  "command_id": "b1232aa8-44fc-4c30-a864-1f107e5b25b4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:10Z",
    "sequence": 1793130610496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b07084be-09bb-44a1-ae02-b65f79f60043",
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
  "last_heartbeat_at": "2026-10-27T19:50:10.514099Z",
  "last_location_at": "2026-10-27T19:50:10.514099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f365277f-948e-42bc-be69-4840413fad01",
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
  "id": "32270869-f4d3-4335-94b6-dba5411126f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:55:10.553482Z",
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
  "command_id": "46a73210-234a-4b5e-910a-1c24445b77ce",
  "quote_id": "32270869-f4d3-4335-94b6-dba5411126f9",
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
  "id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6df5ef5b-1437-446d-a466-2ced2627cfc9",
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
  "created_at": "2026-10-27T19:50:10.594721Z",
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
    "id": "af06d955-9da1-4846-bcf7-eae06272f886",
    "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
    "expires_at": "2026-10-27T19:50:25.599063Z",
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

`POST /api/driver/v1/offers/af06d955-9da1-4846-bcf7-eae06272f886/accept` → **200**

```json
{
  "command_id": "b7904f2e-ce22-48d0-a293-aade469b3006"
}
```

```json
{
  "id": "74fa1010-e000-4052-8e57-adb0e2a93456",
  "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "69dcc0c6-a42f-4be6-8971-25f01e9b6d78",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "69dcc0c6-a42f-4be6-8971-25f01e9b6d78",
  "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "assignment_id": "74fa1010-e000-4052-8e57-adb0e2a93456",
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

`POST /api/driver/v1/trips/69dcc0c6-a42f-4be6-8971-25f01e9b6d78/cancel` → **200**

```json
{
  "command_id": "5f285b4a-ead9-4eae-9791-469dee48795e",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "69dcc0c6-a42f-4be6-8971-25f01e9b6d78",
  "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "assignment_id": "74fa1010-e000-4052-8e57-adb0e2a93456",
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

`GET /api/rider/v1/orders/c400e802-cb56-48ba-b52b-b2b212f93085` → **200**

```json
{
  "id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6df5ef5b-1437-446d-a466-2ced2627cfc9",
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
    "id": "74fa1010-e000-4052-8e57-adb0e2a93456",
    "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "69dcc0c6-a42f-4be6-8971-25f01e9b6d78",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:50:10.594721Z",
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
    "id": "38568c6f-c710-4524-87ed-2099f1d0bcda",
    "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
    "expires_at": "2026-10-27T19:50:25.765419Z",
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

`POST /api/driver/v1/offers/38568c6f-c710-4524-87ed-2099f1d0bcda/accept` → **200**

```json
{
  "command_id": "f956808b-6d1a-4d36-97ff-d8d3e43d8954"
}
```

```json
{
  "id": "f84c1586-9930-4577-8789-34705d2dd3f3",
  "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7b4b7c83-5cb8-4062-a966-d06941ab9035",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7b4b7c83-5cb8-4062-a966-d06941ab9035",
  "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "assignment_id": "f84c1586-9930-4577-8789-34705d2dd3f3",
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

`POST /api/driver/v1/trips/7b4b7c83-5cb8-4062-a966-d06941ab9035/cancel` → **200**

```json
{
  "command_id": "c6068448-0284-4a55-8c5c-802f4aef9f33",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7b4b7c83-5cb8-4062-a966-d06941ab9035",
  "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
  "assignment_id": "f84c1586-9930-4577-8789-34705d2dd3f3",
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
    "id": "c400e802-cb56-48ba-b52b-b2b212f93085",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:50:10.594721Z",
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
    "id": "19a74eca-316f-4b63-a418-bfe8370364f5",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:50:10.201311Z",
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

`GET /api/operator/v1/orders/c400e802-cb56-48ba-b52b-b2b212f93085/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:50:10.595516Z",
      "actor": {
        "type": "CLIENT",
        "id": "6df5ef5b-1437-446d-a466-2ced2627cfc9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
        "quote_id": "32270869-f4d3-4335-94b6-dba5411126f9",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:50:10.598016Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
        "attempt_id": "03372c8b-01c1-49ff-97e5-24b2ca9f731d",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:50:10.604608Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "af06d955-9da1-4846-bcf7-eae06272f886",
        "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:50:10.678891Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "af06d955-9da1-4846-bcf7-eae06272f886",
        "order_id": "c400e802-cb56-48ba-b52b-b2b212f93085",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "74fa1010-e000-4052-8e57-adb0e2a93456"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 19a74eca-316f-4b63-a418-bfe8370364f5, c400e802-cb56-48ba-b52b-b2b212f93085.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732031896",
  "device_ref": "sandbox-19660"
}
```

```json
{
  "challenge_id": "9f1a1872-8109-4d76-acd9-822b5384d393",
  "expires_at": "2026-10-27T19:55:11.02888403Z",
  "resend_available_at": "2026-10-27T19:50:12.02888403Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732031896` → **200**

```json
{
  "phone": "+380732031896",
  "audience": "CLIENT",
  "code": "650201",
  "sent_at": "2026-10-27T19:50:11.033736405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f1a1872-8109-4d76-acd9-822b5384d393",
  "code": "650201",
  "device_ref": "sandbox-19660"
}
```

```json
{
  "session_id": "d1a0633f-c069-4c34-9968-dd6e2330936d",
  "subject": {
    "type": "CLIENT",
    "id": "7ea0ec96-ee57-4952-80e3-de6cafb99f0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZWEwZWM5Ni1lZTU3LTQ5NTItODBlMy1kZTZjYWZiOTlmMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTExLCJpYXQiOjE3OTMxMzA2MTEsImp0aSI6IjFjZDExYmQ1LTZiMDItNDg0YS1hYjE1LTk1ZTFjNGE1MTBlZiIsInNpZCI6ImQxYTA2MzNmLWMwNjktNGMzNC05OTY4LWRkNmUyMzMwOTM2ZCJ9.lVzc0WU5Od3QyCjr0z8gAtXkX-H96Sg82jKT9Lwj0iw",
  "access_expires_at": "2026-10-27T20:05:11.093568416Z",
  "refresh_token": "3wRFWpR1OMkT8CshEG_cyQYzqcETfNcgd-r6TRh8YNs",
  "refresh_expires_at": "2026-11-26T19:50:11.090037005Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1ab5d44a-5fa1-4f09-abb8-a7c87fdd4baf",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "423e2a7a-1402-41b9-bc42-4556ada737f8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-423e2a7a-1402-41b9-bc42-4556ada737f8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a8fd58dec604a2a59c163c27c7baef66",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=423e2a7a-1402-41b9-bc42-4556ada737f8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732031896"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=423e2a7a-1402-41b9-bc42-4556ada737f8",
  "expires_at": "2026-10-27T20:20:11.133435Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/423e2a7a-1402-41b9-bc42-4556ada737f8` → **200**

```json
{
  "id": "423e2a7a-1402-41b9-bc42-4556ada737f8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T20:20:11.133435Z",
  "card": {
    "id": "aff3a07c-1806-4eaa-8154-8f7bed424f60",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3751",
    "card_type": "Visa",
    "created_at": "2026-10-27T19:50:11.181835Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "aff3a07c-1806-4eaa-8154-8f7bed424f60",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3751",
      "card_type": "Visa",
      "created_at": "2026-10-27T19:50:11.181835Z"
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
  "device_ref": "sandbox-2668"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "7204d7d1-1d44-48bf-a783-5a3f3f9a74b6",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2668"
}
```

```json
{
  "challenge_id": "6cbe2c27-b843-496e-a5ef-bea72dc38420",
  "expires_at": "2026-10-27T19:55:12.304377886Z",
  "resend_available_at": "2026-10-27T19:50:13.304377886Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "229688",
  "sent_at": "2026-10-27T19:50:12.307365394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cbe2c27-b843-496e-a5ef-bea72dc38420",
  "code": "229688",
  "device_ref": "sandbox-2668"
}
```

```json
{
  "session_id": "44d7152c-52fa-4559-989c-3d6d4f547a0b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUxMiwiaWF0IjoxNzkzMTMwNjEyLCJqdGkiOiJkNDc4M2VkNy0yMmJmLTRiMjAtYjc0NC0zODExNGFmNWI5MmUiLCJzaWQiOiI0NGQ3MTUyYy01MmZhLTQ1NTktOTg5Yy0zZDZkNGY1NDdhMGIifQ.A773t7TX3s9acnwws8nEt7tLaMDndpKPxij5Veg2B4U",
  "access_expires_at": "2026-10-27T20:05:12.361462383Z",
  "refresh_token": "53sIKIfvP0G2MtcQ8QPm6zJb08gdsCW4bi-BUDBLHbM",
  "refresh_expires_at": "2026-11-26T19:50:12.360704409Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b07084be-09bb-44a1-ae02-b65f79f60043",
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
  "last_heartbeat_at": "2026-10-27T19:50:10.514099Z",
  "last_location_at": "2026-10-27T19:50:10.514099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b07084be-09bb-44a1-ae02-b65f79f60043/handover` → **200**

```json
{
  "command_id": "112ed897-23a8-409a-a568-2e1966bbb321",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b07084be-09bb-44a1-ae02-b65f79f60043",
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
  "last_heartbeat_at": "2026-10-27T19:50:10.514099Z",
  "last_location_at": "2026-10-27T19:50:10.514099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b07084be-09bb-44a1-ae02-b65f79f60043/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:12Z",
    "sequence": 1793130612452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b07084be-09bb-44a1-ae02-b65f79f60043",
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
  "last_heartbeat_at": "2026-10-27T19:50:12.472284Z",
  "last_location_at": "2026-10-27T19:50:12.472284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3305b871-4025-4540-9842-ab2883e110ff",
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
  "id": "27775b32-c5c7-4d84-aa3a-d67c1cbe272a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T19:55:12.512124Z",
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
  "command_id": "becfa1d4-0625-4be2-8ad3-d2e16e46e071",
  "quote_id": "27775b32-c5c7-4d84-aa3a-d67c1cbe272a",
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
  "id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7ea0ec96-ee57-4952-80e3-de6cafb99f0e",
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
  "created_at": "2026-10-27T19:50:12.552521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548` → **200**

```json
{
  "id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7ea0ec96-ee57-4952-80e3-de6cafb99f0e",
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
  "created_at": "2026-10-27T19:50:12.552521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548` → **200**

```json
{
  "id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7ea0ec96-ee57-4952-80e3-de6cafb99f0e",
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
  "created_at": "2026-10-27T19:50:12.552521Z",
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
    "id": "6c33b653-0ebe-4eb6-a2d7-e61087f7397d",
    "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
    "expires_at": "2026-10-27T19:50:27.782187Z",
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

`POST /api/driver/v1/offers/6c33b653-0ebe-4eb6-a2d7-e61087f7397d/accept` → **200**

```json
{
  "command_id": "ccaaae23-cbb8-4a25-9d5f-6039d9671052"
}
```

```json
{
  "id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "assignment_id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
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

`POST /api/driver/v1/work-sessions/b07084be-09bb-44a1-ae02-b65f79f60043/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:13Z",
    "sequence": 1793130613727
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b07084be-09bb-44a1-ae02-b65f79f60043",
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
  "last_heartbeat_at": "2026-10-27T19:50:13.747664Z",
  "last_location_at": "2026-10-27T19:50:13.747664Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e9cd69d7-1455-4620-a44e-bda9eb639897/arrive` → **200**

```json
{
  "command_id": "73c559ec-cfec-4651-9a34-d522e3cee09b",
  "expected_version": 0
}
```

```json
{
  "id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "assignment_id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
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
  "arrived_at": "2026-10-27T19:50:13.786873Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9cd69d7-1455-4620-a44e-bda9eb639897/start` → **200**

```json
{
  "command_id": "bebb90dd-738b-40af-aa1a-22e3c13cde3e",
  "expected_version": 1
}
```

```json
{
  "id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "assignment_id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
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
  "arrived_at": "2026-10-27T19:50:13.786873Z",
  "started_at": "2026-10-27T19:50:13.833006Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9cd69d7-1455-4620-a44e-bda9eb639897/complete` → **200**

```json
{
  "command_id": "bb88e93a-825e-4aad-a8bd-c9997aaf556d",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:50:13Z"
}
```

```json
{
  "id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "assignment_id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
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
  "arrived_at": "2026-10-27T19:50:13.786873Z",
  "started_at": "2026-10-27T19:50:13.833006Z",
  "completed_at": "2026-10-27T19:50:13.875717Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548` → **200**

```json
{
  "id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7ea0ec96-ee57-4952-80e3-de6cafb99f0e",
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
    "id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
    "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:50:12.552521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548` → **200**

```json
{
  "id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7ea0ec96-ee57-4952-80e3-de6cafb99f0e",
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
    "id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
    "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:50:12.552521Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548` → **200**

```json
{
  "id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7ea0ec96-ee57-4952-80e3-de6cafb99f0e",
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
    "id": "a65589d2-d1db-4b04-8a8d-c753f65eb910",
    "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e9cd69d7-1455-4620-a44e-bda9eb639897",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:50:12.552521Z",
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
      "id": "6baad44b-6e55-410a-9e06-d322c1f2ee68",
      "at": "2026-10-27T19:50:14.837771Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548/tip` → **200**

```json
{
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
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
  "available_until": "2026-10-28T19:50:13.875717Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548/tip` → **201**

```json
{
  "command_id": "03282f32-16a8-42fb-a937-171da28dec67",
  "amount_minor": 2500
}
```

```json
{
  "id": "5a4398f6-1ced-40a2-8385-1b763c289998",
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T19:50:16.090463Z"
}
```

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548/tip` → **200**

```json
{
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
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
  "available_until": "2026-10-28T19:50:13.875717Z",
  "open": false,
  "tip": {
    "id": "5a4398f6-1ced-40a2-8385-1b763c289998",
    "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T19:50:16.090463Z"
  }
}
```

`GET /api/rider/v1/orders/023a3e74-b311-47ee-a572-1fd51b043548/tip` → **200**

```json
{
  "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
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
  "available_until": "2026-10-28T19:50:13.875717Z",
  "open": false,
  "tip": {
    "id": "5a4398f6-1ced-40a2-8385-1b763c289998",
    "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T19:50:16.090463Z"
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
      "id": "6baad44b-6e55-410a-9e06-d322c1f2ee68",
      "at": "2026-10-27T19:50:14.837771Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
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
      "id": "a14a86fb-f4d4-4aad-87fd-319c42d72de4",
      "at": "2026-10-27T19:50:17.892426Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
      "counterpart_id": null
    },
    {
      "id": "6baad44b-6e55-410a-9e06-d322c1f2ee68",
      "at": "2026-10-27T19:50:14.837771Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "023a3e74-b311-47ee-a572-1fd51b043548",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b07084be-09bb-44a1-ae02-b65f79f60043",
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
  "last_heartbeat_at": "2026-10-27T19:50:13.747664Z",
  "last_location_at": "2026-10-27T19:50:13.747664Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b07084be-09bb-44a1-ae02-b65f79f60043/close` → **200**

```json
{
  "command_id": "3dac516d-3846-4bd5-907f-54fdf4234682",
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

Done: card order 023a3e74-b311-47ee-a572-1fd51b043548.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731161779",
  "device_ref": "sandbox-292"
}
```

```json
{
  "challenge_id": "7ef12f4d-5503-4862-b60c-15c9bcaa697e",
  "expires_at": "2026-10-27T19:55:18.305055643Z",
  "resend_available_at": "2026-10-27T19:50:19.305055643Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731161779` → **200**

```json
{
  "phone": "+380731161779",
  "audience": "CLIENT",
  "code": "099389",
  "sent_at": "2026-10-27T19:50:18.308178857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ef12f4d-5503-4862-b60c-15c9bcaa697e",
  "code": "099389",
  "device_ref": "sandbox-292"
}
```

```json
{
  "session_id": "5dc254e1-20ef-4ba8-9345-85ba8445b9f8",
  "subject": {
    "type": "CLIENT",
    "id": "f8d35a1e-6ece-4d1e-89b2-b64123da8d64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOGQzNWExZS02ZWNlLTRkMWUtODliMi1iNjQxMjNkYThkNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTE4LCJpYXQiOjE3OTMxMzA2MTgsImp0aSI6IjNmOWY3M2UyLWVhMTgtNGM3Ni1iNGQ4LTVkZjZjZjdkNjZmMiIsInNpZCI6IjVkYzI1NGUxLTIwZWYtNGJhOC05MzQ1LTg1YmE4NDQ1YjlmOCJ9.WuLsd5ifa0HqFe9JNSJ3njQyEQ0BW_-zCJra-UjzLOw",
  "access_expires_at": "2026-10-27T20:05:18.3636007Z",
  "refresh_token": "VdPE_nCJVPEzKFlQQFkngpLlUJn4IsBq4l1fo4z0uEk",
  "refresh_expires_at": "2026-11-26T19:50:18.362916146Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "780a38e1-03ba-47be-8881-ceaebbf51434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "0cdf72f2-d4c7-4010-b6fa-d49c63ea2af8",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0cdf72f2-d4c7-4010-b6fa-d49c63ea2af8",
    "orderDate": "1793130618",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f624b1917e1a35d03ba5aa8e2f9582e6",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0cdf72f2-d4c7-4010-b6fa-d49c63ea2af8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731161779"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0cdf72f2-d4c7-4010-b6fa-d49c63ea2af8",
  "created_at": "2026-10-27T19:50:18.399586Z",
  "expires_at": "2026-10-27T20:20:18.399586Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/0cdf72f2-d4c7-4010-b6fa-d49c63ea2af8` → **200**

```json
{
  "id": "0cdf72f2-d4c7-4010-b6fa-d49c63ea2af8",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:50:18.399586Z",
  "expires_at": "2026-10-27T20:20:18.399586Z",
  "completed_at": "2026-10-27T19:50:18.435802Z",
  "masked_pan": "41****5557",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f8d35a1e-6ece-4d1e-89b2-b64123da8d64",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f8d35a1e-6ece-4d1e-89b2-b64123da8d64",
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
      "id": "ae987a2d-a110-4597-a26d-5a0a24c564dd",
      "at": "2026-10-27T19:50:18.90585Z",
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
  "client_id": "f8d35a1e-6ece-4d1e-89b2-b64123da8d64",
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
      "id": "ae987a2d-a110-4597-a26d-5a0a24c564dd",
      "at": "2026-10-27T19:50:18.90585Z",
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
  "device_ref": "sandbox-11875"
}
```

```json
{
  "challenge_id": "feb36dbf-07ae-494f-aed5-6e2109351fb3",
  "expires_at": "2026-10-27T19:55:19.564679143Z",
  "resend_available_at": "2026-10-27T19:50:20.564679143Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "453326",
  "sent_at": "2026-10-27T19:50:19.567749103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "feb36dbf-07ae-494f-aed5-6e2109351fb3",
  "code": "453326",
  "device_ref": "sandbox-11875"
}
```

```json
{
  "session_id": "f27a1de5-788d-4fda-8052-c684b9e944a6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUxOSwiaWF0IjoxNzkzMTMwNjE5LCJqdGkiOiIzYzY0NDRhZS05MDc4LTQ1MWItOTQwYy02ODQyY2QzYjVhZTciLCJzaWQiOiJmMjdhMWRlNS03ODhkLTRmZGEtODA1Mi1jNjg0YjllOTQ0YTYifQ.EP9BBnJHvV1pNF3tVHaWoXixkgrS3IuB3dTkE4-gYzU",
  "access_expires_at": "2026-10-27T20:05:19.624338719Z",
  "refresh_token": "OHCmu2zPQMur9mjRrQwGqXzrHF6m4_INPv6McMmP2cg",
  "refresh_expires_at": "2026-11-26T19:50:19.623648592Z",
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
  "command_id": "e71d8caa-8957-4e4b-be05-1afa56a03aed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2662ba07-4494-498c-b46c-b3dd3e2a60a1",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2662ba07-4494-498c-b46c-b3dd3e2a60a1",
    "orderDate": "1793130619",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "9241e59c3fc161a6b9cbd3e81d41f76c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2662ba07-4494-498c-b46c-b3dd3e2a60a1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2662ba07-4494-498c-b46c-b3dd3e2a60a1",
  "created_at": "2026-10-27T19:50:19.678829Z",
  "expires_at": "2026-10-27T20:20:19.678829Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2662ba07-4494-498c-b46c-b3dd3e2a60a1` → **200**

```json
{
  "id": "2662ba07-4494-498c-b46c-b3dd3e2a60a1",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:50:19.678829Z",
  "expires_at": "2026-10-27T20:20:19.678829Z",
  "completed_at": "2026-10-27T19:50:19.708904Z",
  "masked_pan": "41****4085",
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
      "id": "f7a6e831-2a31-4e0e-b6b0-3ab2bf4e729c",
      "at": "2026-10-27T19:50:19.913653Z",
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
  "command_id": "b4869d6d-ffd9-4402-a1f2-3f5a29a8b9a1",
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
  "correlation_id": "4e3421b9-7e19-4b82-bd1d-7aa7169fa9e6"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675801402",
  "device_ref": "sandbox-31457"
}
```

```json
{
  "challenge_id": "cf95027a-8483-47ca-91b5-bfcfd59cf885",
  "expires_at": "2026-10-27T19:55:20.843158471Z",
  "resend_available_at": "2026-10-27T19:50:21.843158471Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675801402` → **200**

```json
{
  "phone": "+380675801402",
  "audience": "CLIENT",
  "code": "195061",
  "sent_at": "2026-10-27T19:50:20.846214319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf95027a-8483-47ca-91b5-bfcfd59cf885",
  "code": "195061",
  "device_ref": "sandbox-31457"
}
```

```json
{
  "session_id": "5ed9894b-36d7-452d-940f-5e9dc32e1640",
  "subject": {
    "type": "CLIENT",
    "id": "730c30bf-d20b-44eb-9ee6-d06077a981d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzBjMzBiZi1kMjBiLTQ0ZWItOWVlNi1kMDYwNzdhOTgxZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTIwLCJpYXQiOjE3OTMxMzA2MjAsImp0aSI6Ijc0MDdmZDg0LTRjZWQtNGNmNS05ZjZmLTYwY2MxNDE4MTg4MyIsInNpZCI6IjVlZDk4OTRiLTM2ZDctNDUyZC05NDBmLTVlOWRjMzJlMTY0MCJ9.DT_LbhpPdhZ4g1GLMQE4PwDCeQkMoVoNkQMETsZVTQw",
  "access_expires_at": "2026-10-27T20:05:20.900877923Z",
  "refresh_token": "nCpmCCmoLGUh4PWW3txNbn8JBwiIICizj_Lr9X_UMkY",
  "refresh_expires_at": "2026-11-26T19:50:20.900240981Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "730c30bf-d20b-44eb-9ee6-d06077a981d2",
  "session_id": "5ed9894b-36d7-452d-940f-5e9dc32e1640",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb1858dc-4d26-44f5-930e-3803f394d85c",
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
  "id": "9d3cff59-9031-46d3-a9e6-d2edb79585dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:20.959494Z",
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
  "challenge_id": "46ad4747-723b-497b-abbb-8310e6a97b00",
  "expires_at": "2026-10-27T19:55:22.995953574Z",
  "resend_available_at": "2026-10-27T19:50:23.995953574Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675801402` → **200**

```json
{
  "phone": "+380675801402",
  "audience": "CLIENT",
  "code": "899382",
  "sent_at": "2026-10-27T19:50:22.998382865Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "e8ebbc09-1a21-40e4-b20f-d723f5d5f0cc",
  "challenge_id": "46ad4747-723b-497b-abbb-8310e6a97b00",
  "otp_code": "899382"
}
```

```json
{
  "client_id": "730c30bf-d20b-44eb-9ee6-d06077a981d2",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T19:50:23.063932454Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a50ebdbb-ad98-494f-8d2a-e9a48825e9a0",
  "quote_id": "9d3cff59-9031-46d3-a9e6-d2edb79585dd",
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
  "correlation_id": "d9072832-379e-4b1d-9c50-862ca09962f2"
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
  "session_id": "e88d7004-bbb1-4be4-aaaa-c008d4f55ffc",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MjMsImlhdCI6MTc5MzEzMDYyMywianRpIjoiNmJkYTQxYjAtY2JlNC00MDVkLTgxNTktNzZjMDZlYjY3YjI2Iiwic2lkIjoiZTg4ZDcwMDQtYmJiMS00YmU0LWFhYWEtYzAwOGQ0ZjU1ZmZjIn0.eVUf0x1uYj5u5yXliCqOFYxlE1l35X2fEg-zCSPBw1Q",
  "access_expires_at": "2026-10-27T20:05:23.417406916Z",
  "refresh_token": "nLof1dKns9EPvI-pDDm49hGIIaUi1W_xhpJDpUmDQDg",
  "refresh_expires_at": "2026-10-28T07:50:23.416697516Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "730c30bf-d20b-44eb-9ee6-d06077a981d2",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T19:50:23.063932Z",
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

`POST /api/admin/v1/client-deletions/730c30bf-d20b-44eb-9ee6-d06077a981d2/complete` → **200**

```json
{
  "command_id": "bcaaaab6-e12c-4a39-b29d-073f2a0fcce2",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "730c30bf-d20b-44eb-9ee6-d06077a981d2",
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
  "correlation_id": "fb4e9a85-e56d-4793-93df-91e57356a77d"
}
```

Done: client 730c30bf-d20b-44eb-9ee6-d06077a981d2 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660536015",
  "device_ref": "sandbox-27030"
}
```

```json
{
  "challenge_id": "80b1d743-8d67-449c-8b6f-23eae3aa5bb2",
  "expires_at": "2026-10-27T19:55:23.560597295Z",
  "resend_available_at": "2026-10-27T19:50:24.560597295Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660536015` → **200**

```json
{
  "phone": "+380660536015",
  "audience": "CLIENT",
  "code": "707502",
  "sent_at": "2026-10-27T19:50:23.563614545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80b1d743-8d67-449c-8b6f-23eae3aa5bb2",
  "code": "707502",
  "device_ref": "sandbox-27030"
}
```

```json
{
  "session_id": "7f850569-1c13-4160-930c-8a01525f3e9b",
  "subject": {
    "type": "CLIENT",
    "id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODViNDFlYS04YjIzLTQyN2ItYjlmNC05NGJmOGM3NmFiN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTIzLCJpYXQiOjE3OTMxMzA2MjMsImp0aSI6IjgyYTc3ZWRiLTFkZWUtNDZlZS1iZjM2LWQ3YzY0MWFmZjg3MCIsInNpZCI6IjdmODUwNTY5LTFjMTMtNDE2MC05MzBjLThhMDE1MjVmM2U5YiJ9.3PGCVz-Egp1vHnhXh-WV80Fh0lmAfeus8UMZVeHKcSE",
  "access_expires_at": "2026-10-27T20:05:23.619715852Z",
  "refresh_token": "a_-STSHzN2HGV1CxV4BYiSY3a8EXV5N9mrZFUwemw_U",
  "refresh_expires_at": "2026-11-26T19:50:23.61903926Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c",
  "session_id": "7f850569-1c13-4160-930c-8a01525f3e9b",
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
  "session_id": "45adee0d-bf51-4b32-b098-421ad39cfdb4",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MjMsImlhdCI6MTc5MzEzMDYyMywianRpIjoiZGUwMTFjYWUtOTRkYi00MzU4LWE0YmQtNjUzNDA0Y2Y4NWFiIiwic2lkIjoiNDVhZGVlMGQtYmY1MS00YjMyLWIwOTgtNDIxYWQzOWNmZGI0In0.vLyw0fjTNd_JSWNg6NfX-Tyj678Bh-vPYthqh060I7I",
  "access_expires_at": "2026-10-27T20:05:23.952698396Z",
  "refresh_token": "rXBw3WxWDCk8_-r8oWJa3VB1GpJ6nkN3IPoFsGi2fg0",
  "refresh_expires_at": "2026-10-28T07:50:23.952143523Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0536015&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c",
      "phone": "+380660536015",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-27T19:50:23.616306Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/985b41ea-8b23-427b-b9f4-94bf8c76ab7c` → **200**

```json
{
  "client": {
    "id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c",
    "phone": "+380660536015",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-27T19:50:23.616306Z",
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

`POST /api/admin/v1/clients/985b41ea-8b23-427b-b9f4-94bf8c76ab7c/block` → **400**

```json
{
  "command_id": "2b9c3c46-bf7c-40b2-ba48-465c932cf8b8",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/985b41ea-8b23-427b-b9f4-94bf8c76ab7c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8461793b-fdfe-4a1c-bac0-7d448e93d7ad",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/985b41ea-8b23-427b-b9f4-94bf8c76ab7c/block` → **200**

```json
{
  "command_id": "fbd5f70b-c10d-40c1-9d0a-1da838b53f2f",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c",
  "phone": "+380660536015",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-27T19:50:23.616306Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-27T19:50:24.114944Z",
    "by": "7704136f-7f15-479f-bc4f-28eec7865cdc"
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
  "correlation_id": "9af33c52-1e5d-4aef-ac39-973e77ce765d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660536015",
  "device_ref": "sandbox-6312"
}
```

```json
{
  "challenge_id": "4ea79e60-adf6-4fb2-a5d1-225c7b1fcfef",
  "expires_at": "2026-10-27T19:55:26.177755333Z",
  "resend_available_at": "2026-10-27T19:50:27.177755333Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660536015` → **200**

```json
{
  "phone": "+380660536015",
  "audience": "CLIENT",
  "code": "296993",
  "sent_at": "2026-10-27T19:50:26.180850911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "4ea79e60-adf6-4fb2-a5d1-225c7b1fcfef",
  "code": "296993",
  "device_ref": "sandbox-6312"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8bf0754d-03b2-47cc-af08-49a95303cf60"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/985b41ea-8b23-427b-b9f4-94bf8c76ab7c` → **200**

```json
{
  "client": {
    "id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c",
    "phone": "+380660536015",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-27T19:50:23.616306Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-27T19:50:24.114944Z",
      "by": "7704136f-7f15-479f-bc4f-28eec7865cdc"
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

`POST /api/admin/v1/clients/985b41ea-8b23-427b-b9f4-94bf8c76ab7c/unblock` → **200**

```json
{
  "command_id": "e8051e08-75f9-4212-8962-559455cf3a09",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c",
  "phone": "+380660536015",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-27T19:50:23.616306Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660536015",
  "device_ref": "sandbox-3057"
}
```

```json
{
  "challenge_id": "98c80c8d-3f0c-4d74-a343-d26a2517c441",
  "expires_at": "2026-10-27T19:55:28.329786888Z",
  "resend_available_at": "2026-10-27T19:50:29.329786888Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660536015` → **200**

```json
{
  "phone": "+380660536015",
  "audience": "CLIENT",
  "code": "576403",
  "sent_at": "2026-10-27T19:50:28.332507785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98c80c8d-3f0c-4d74-a343-d26a2517c441",
  "code": "576403",
  "device_ref": "sandbox-3057"
}
```

```json
{
  "session_id": "db40b5ac-ee89-4804-9bff-14f8728a86ec",
  "subject": {
    "type": "CLIENT",
    "id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODViNDFlYS04YjIzLTQyN2ItYjlmNC05NGJmOGM3NmFiN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTI4LCJpYXQiOjE3OTMxMzA2MjgsImp0aSI6IjRlMDRkNjQ2LTIwOGUtNGEwMC1hNDAyLTNjYmJkYjg2MGU3NCIsInNpZCI6ImRiNDBiNWFjLWVlODktNDgwNC05YmZmLTE0Zjg3MjhhODZlYyJ9.edeI3_pbLJdNc34cg-CBen9qfPvMcmlqAaOzrX_Gz5A",
  "access_expires_at": "2026-10-27T20:05:28.38703346Z",
  "refresh_token": "bbD8S6Al0H0li4hsG8ZKm6pae8Mv7xiP66u2ImoJwiI",
  "refresh_expires_at": "2026-11-26T19:50:28.386419656Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "985b41ea-8b23-427b-b9f4-94bf8c76ab7c",
  "session_id": "db40b5ac-ee89-4804-9bff-14f8728a86ec",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

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
  "device_ref": "sandbox-10725"
}
```

```json
{
  "challenge_id": "c136b125-b545-4098-8360-182f99f55844",
  "expires_at": "2026-10-27T19:55:28.473235343Z",
  "resend_available_at": "2026-10-27T19:50:29.473235343Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "167598",
  "sent_at": "2026-10-27T19:50:28.475903394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c136b125-b545-4098-8360-182f99f55844",
  "code": "167598",
  "device_ref": "sandbox-10725"
}
```

```json
{
  "session_id": "e81df92c-2930-48f6-b6a7-7eebbed37497",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUyOCwiaWF0IjoxNzkzMTMwNjI4LCJqdGkiOiIyMjU2NjM1NC1jODliLTQ1ZTgtODVjMS0xZWUzODUxZGRmYTQiLCJzaWQiOiJlODFkZjkyYy0yOTMwLTQ4ZjYtYjZhNy03ZWViYmVkMzc0OTcifQ.KdHmUtXo80JxIJ3KdcXeKQSukJVpD8XiIaEy-pFAEhs",
  "access_expires_at": "2026-10-27T20:05:28.528939861Z",
  "refresh_token": "3Dsfgc60UqZQcL4HsRaZSuAlSb30VWzDlct-SIR_CzU",
  "refresh_expires_at": "2026-11-26T19:50:28.528351639Z",
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
  "command_id": "a5fa0971-08b5-44b3-90bd-ab1c635f7d65",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:28Z",
    "sequence": 1793130628576
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:28.593343Z",
  "last_location_at": "2026-10-27T19:50:28.593343Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674864438",
  "device_ref": "sandbox-20137"
}
```

```json
{
  "challenge_id": "0422027c-5cd3-4c31-8f8f-6ff9ffc12843",
  "expires_at": "2026-10-27T19:55:28.62365354Z",
  "resend_available_at": "2026-10-27T19:50:29.62365354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674864438` → **200**

```json
{
  "phone": "+380674864438",
  "audience": "CLIENT",
  "code": "857897",
  "sent_at": "2026-10-27T19:50:28.626168528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0422027c-5cd3-4c31-8f8f-6ff9ffc12843",
  "code": "857897",
  "device_ref": "sandbox-20137"
}
```

```json
{
  "session_id": "7a4405fd-a407-45fd-93aa-ba387fe103a5",
  "subject": {
    "type": "CLIENT",
    "id": "25d362b8-01f5-4802-bca5-b704a0f7fbb7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWQzNjJiOC0wMWY1LTQ4MDItYmNhNS1iNzA0YTBmN2ZiYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTI4LCJpYXQiOjE3OTMxMzA2MjgsImp0aSI6IjE2Y2U3ZmJlLTRmNzUtNGE1Ni1iODA2LWRiNTNjZTFlM2I2NyIsInNpZCI6IjdhNDQwNWZkLWE0MDctNDVmZC05M2FhLWJhMzg3ZmUxMDNhNSJ9.Gkz7WUo9D7pvijKldjJ7QZMwpBexFNXCQ65jGct1vY0",
  "access_expires_at": "2026-10-27T20:05:28.678965545Z",
  "refresh_token": "yNKDLlDDPotoHD5g9sybWDsHewYMigQJp6E2SDnwGtU",
  "refresh_expires_at": "2026-11-26T19:50:28.678464719Z",
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
  "command_id": "2741b495-6e64-42db-af46-0740acb79909",
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
  "id": "4708d1e6-1c13-4eda-b0f2-a519b5fa04a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:28.738375Z",
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
  "command_id": "8326060a-7a0c-4672-902e-78fa6223756c",
  "platform": "ANDROID",
  "token": "sandbox-driver-2f7b2936-df1a-452a-bc07-56acc5db95f6"
}
```

```json
{
  "id": "4f8e4d25-b5b5-434d-bd09-e7f1ad39978f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:50:28.780935Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "3e9fe92d-56e0-45a7-89d2-9a3a4df381a8",
  "platform": "ANDROID",
  "token": "sandbox-rider-077868a5-d9b8-42e1-843b-d16a330c91da"
}
```

```json
{
  "id": "6b193c2c-2723-451e-83dc-973c6fd89492",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:50:28.816303Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "eb2b0cab-afa9-41f9-8e94-de721c40e952",
  "quote_id": "4708d1e6-1c13-4eda-b0f2-a519b5fa04a8",
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
  "id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "25d362b8-01f5-4802-bca5-b704a0f7fbb7",
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
  "created_at": "2026-10-27T19:50:28.857995Z",
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
    "id": "057d7948-f912-4252-96b4-a709f375e187",
    "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
    "expires_at": "2026-10-27T19:50:43.861651Z",
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

`POST /api/driver/v1/offers/057d7948-f912-4252-96b4-a709f375e187/accept` → **200**

```json
{
  "command_id": "80c2a8b2-0333-4730-9158-716bafbbb35f"
}
```

```json
{
  "id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "62285de9-c0b6-406e-ae93-4d38a6974546",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:50:28.835Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:50:28.835Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:50:29.619070491Z",
    "token_suffix": "db95f6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
      "order_version": "2",
      "event_id": "21fed78a-18e9-4744-a7cd-d80100fbafab",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674864438&after=2026-10-27T19:50:28.835Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:50:29.620973668Z",
    "token_suffix": "0c91da",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
      "order_version": "3",
      "event_id": "7fe0a2d2-0a44-483d-93c8-ae1764ef411f",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b599abc0-1cd5-49d5-b304-3d0bd63a5456/messages` → **201**

```json
{
  "command_id": "5c3b6998-cdc5-4cc5-9319-6bb6ec43625a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "7349811b-6007-4613-aee0-62ccb3e608be",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T19:50:30.050939712Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "62285de9-c0b6-406e-ae93-4d38a6974546",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "assignment_id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f",
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

`POST /api/driver/v1/trips/62285de9-c0b6-406e-ae93-4d38a6974546/messages` → **201**

```json
{
  "command_id": "820daab4-34c8-4cae-9912-aa24e3bed989",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "2849334a-7374-4acf-8f3a-65fff873f171",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T19:50:30.103188638Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b599abc0-1cd5-49d5-b304-3d0bd63a5456/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/62285de9-c0b6-406e-ae93-4d38a6974546/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674864438"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:30Z",
    "sequence": 1793130630176
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:30.194912Z",
  "last_location_at": "2026-10-27T19:50:30.194912Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "62285de9-c0b6-406e-ae93-4d38a6974546",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "assignment_id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f",
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

`POST /api/driver/v1/trips/62285de9-c0b6-406e-ae93-4d38a6974546/arrive` → **200**

```json
{
  "command_id": "f6e7df9f-9f58-4d93-8162-8751cc739caf",
  "expected_version": 0
}
```

```json
{
  "id": "62285de9-c0b6-406e-ae93-4d38a6974546",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "assignment_id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f",
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
  "arrived_at": "2026-10-27T19:50:30.244194Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/62285de9-c0b6-406e-ae93-4d38a6974546/start` → **200**

```json
{
  "command_id": "2025b12c-c376-43d5-be82-b71c1a1f7779",
  "expected_version": 1
}
```

```json
{
  "id": "62285de9-c0b6-406e-ae93-4d38a6974546",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "assignment_id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f",
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
  "arrived_at": "2026-10-27T19:50:30.244194Z",
  "started_at": "2026-10-27T19:50:30.277767Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:30Z",
    "sequence": 1793130630300
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:30.320288Z",
  "last_location_at": "2026-10-27T19:50:30.320288Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/62285de9-c0b6-406e-ae93-4d38a6974546/complete` → **200**

```json
{
  "command_id": "6b9b04d4-bd16-434c-95bd-b702178a0c53",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:50:30Z",
  "cash_received": true
}
```

```json
{
  "id": "62285de9-c0b6-406e-ae93-4d38a6974546",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "assignment_id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f",
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
  "arrived_at": "2026-10-27T19:50:30.244194Z",
  "started_at": "2026-10-27T19:50:30.277767Z",
  "completed_at": "2026-10-27T19:50:30.354486Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b599abc0-1cd5-49d5-b304-3d0bd63a5456` → **200**

```json
{
  "id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "25d362b8-01f5-4802-bca5-b704a0f7fbb7",
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
    "id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f",
    "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "62285de9-c0b6-406e-ae93-4d38a6974546",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:50:28.857995Z",
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
    "id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:50:28.857995Z",
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
    "id": "62285de9-c0b6-406e-ae93-4d38a6974546",
    "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
    "order_short_number": 5,
    "created_at": "2026-10-27T19:50:28.926941Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d468b821-80bd-4f92-bb4c-3439aca9ba35",
    "order_id": "7ea19b87-4687-47d3-9995-06d6a867abab",
    "order_short_number": 1,
    "created_at": "2026-10-27T19:50:05.813433Z",
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

`GET /api/rider/v1/orders/b599abc0-1cd5-49d5-b304-3d0bd63a5456/tip` → **200**

```json
{
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
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
  "available_until": "2026-10-28T19:50:30.354486Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b599abc0-1cd5-49d5-b304-3d0bd63a5456/tip` → **201**

```json
{
  "command_id": "23434d71-5294-4ddf-a0a5-7dcf2cc0bad9",
  "amount_minor": 1100
}
```

```json
{
  "id": "0fc2709d-50a8-479a-a388-ae7e9deb5e11",
  "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T19:50:33.558995Z"
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
  "session_id": "8e92e9be-ad0e-41c8-ade6-45583bee6342",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MzMsImlhdCI6MTc5MzEzMDYzMywianRpIjoiMzk4MjAzZTMtZmRlMy00YTc3LTk5NmYtYWNlMjFiMTA2MjQ4Iiwic2lkIjoiOGU5MmU5YmUtYWQwZS00MWM4LWFkZTYtNDU1ODNiZWU2MzQyIn0.e827D7e8NpxAX5t-fScs8V4YDnJwJBxJ5P-M7L4xYN4",
  "access_expires_at": "2026-10-27T20:05:33.875633057Z",
  "refresh_token": "pItxwXLIt_FPx9mLR5iOV2nLwrydnpvXt2Rx_8LoDGg",
  "refresh_expires_at": "2026-10-28T07:50:33.875086865Z",
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
          "CARD": 1,
          "CASH": 4
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
      "CARD": 1,
      "CASH": 4
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
  ],
  "generated_at": "2026-10-27T19:50:33.908737762Z"
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
  },
  "generated_at": "2026-10-27T19:50:33.9426967Z"
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
  "session_id": "5ebddd33-ab0c-4f1a-a32d-547695859f1c",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MzQsImlhdCI6MTc5MzEzMDYzNCwianRpIjoiMzg1NjFmODEtOWE4MC00YWM3LTlkZGUtZTgyNGU5NzljYjNhIiwic2lkIjoiNWViZGRkMzMtYWIwYy00ZjFhLWEzMmQtNTQ3Njk1ODU5ZjFjIn0.3deMjQ4EgkkVuX_vExcPLmbqEPIEkzu-d9FCZNwM4E8",
  "access_expires_at": "2026-10-27T20:05:34.25554694Z",
  "refresh_token": "EYqryVw5pwML7vgrsmBhyyhd9CJpb37UHwxEnpV2pug",
  "refresh_expires_at": "2026-10-28T07:50:34.254908635Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b599abc0-1cd5-49d5-b304-3d0bd63a5456/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:50:28.85872Z",
      "actor": {
        "type": "CLIENT",
        "id": "25d362b8-01f5-4802-bca5-b704a0f7fbb7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
        "quote_id": "4708d1e6-1c13-4eda-b0f2-a519b5fa04a8",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:50:28.860672Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
        "attempt_id": "f7b95722-6faf-40c8-8548-1a117b543e98",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:50:28.866626Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "057d7948-f912-4252-96b4-a709f375e187",
        "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:50:28.929105Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "057d7948-f912-4252-96b4-a709f375e187",
        "order_id": "b599abc0-1cd5-49d5-b304-3d0bd63a5456",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "602916f5-1eae-4a9f-b1ee-b6ee59797d0f"
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
  "at": "2026-10-27T19:50:34.304854612Z",
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
      "last_location_at": "2026-10-27T19:50:30.320288Z",
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
      "last_location_at": "2026-10-27T19:50:10.35908Z",
      "order_id": null
    }
  ]
}
```

Done: order b599abc0-1cd5-49d5-b304-3d0bd63a5456.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3513"
}
```

```json
{
  "challenge_id": "ea242f4d-b469-4b69-951b-4598feee228f",
  "expires_at": "2026-10-27T19:55:34.348013686Z",
  "resend_available_at": "2026-10-27T19:50:35.348013686Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "992225",
  "sent_at": "2026-10-27T19:50:34.350375871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea242f4d-b469-4b69-951b-4598feee228f",
  "code": "992225",
  "device_ref": "sandbox-3513"
}
```

```json
{
  "session_id": "2ee823df-9493-41ae-b5aa-f8c99b3d2a44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUzNCwiaWF0IjoxNzkzMTMwNjM0LCJqdGkiOiI2M2Y4NDJmMy00Y2MwLTRlOGQtYTIyYi05NzNiNTQ2NTk3ZDUiLCJzaWQiOiIyZWU4MjNkZi05NDkzLTQxYWUtYjVhYS1mOGM5OWIzZDJhNDQifQ.4EuOHWJvOuJY5tMug11UEAuExuTwSNA-w_fEsMaqUkE",
  "access_expires_at": "2026-10-27T20:05:34.404413249Z",
  "refresh_token": "Z6dNCQPOsXA33wwiGt1XF8AYYtjmaedLaZL23D-yUnc",
  "refresh_expires_at": "2026-11-26T19:50:34.403879761Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:30.320288Z",
  "last_location_at": "2026-10-27T19:50:30.320288Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/handover` → **200**

```json
{
  "command_id": "1b8e1afd-c734-4121-ba46-4f424f9eac51",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:30.320288Z",
  "last_location_at": "2026-10-27T19:50:30.320288Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:34Z",
    "sequence": 1793130634494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:34.513448Z",
  "last_location_at": "2026-10-27T19:50:34.513448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667488527",
  "device_ref": "sandbox-14094"
}
```

```json
{
  "challenge_id": "d1f05b27-10ec-4c8a-8e60-fe969d3b82c0",
  "expires_at": "2026-10-27T19:55:34.53766776Z",
  "resend_available_at": "2026-10-27T19:50:35.53766776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667488527` → **200**

```json
{
  "phone": "+380667488527",
  "audience": "CLIENT",
  "code": "190719",
  "sent_at": "2026-10-27T19:50:34.539870619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1f05b27-10ec-4c8a-8e60-fe969d3b82c0",
  "code": "190719",
  "device_ref": "sandbox-14094"
}
```

```json
{
  "session_id": "d00428b9-5bf7-41ff-8ba9-ffebe7f8008d",
  "subject": {
    "type": "CLIENT",
    "id": "c8d3b1eb-8687-4842-8c29-3e3ad1c9f40a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGQzYjFlYi04Njg3LTQ4NDItOGMyOS0zZTNhZDFjOWY0MGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTM0LCJpYXQiOjE3OTMxMzA2MzQsImp0aSI6ImUzNzNhNDI2LTM2NWMtNDMzYi1iMzBmLTIxMzFiNjY0MGFhNyIsInNpZCI6ImQwMDQyOGI5LTViZjctNDFmZi04YmE5LWZmZWJlN2Y4MDA4ZCJ9.S4FZFTjDLzSANDL8svaHqlx1rDMqApc9FtciUUqJb14",
  "access_expires_at": "2026-10-27T20:05:34.593633907Z",
  "refresh_token": "fMPOe921f2qB5XwAzjCaU0Dg9LxSOhqWh0DxkdnfbO0",
  "refresh_expires_at": "2026-11-26T19:50:34.593046354Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "035992e9-1964-4dc0-aaf7-c893fda91616",
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
  "id": "eb671688-2da4-4ddc-b638-f703e978a5cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T19:55:34.627302Z",
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
  "command_id": "d6926104-8aae-4723-afd4-6a55eff95ff8",
  "quote_id": "eb671688-2da4-4ddc-b638-f703e978a5cc",
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
  "id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c8d3b1eb-8687-4842-8c29-3e3ad1c9f40a",
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
  "created_at": "2026-10-27T19:50:34.665913Z",
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
    "id": "cd184fd3-9d89-41d4-9466-1429b9adc435",
    "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
    "expires_at": "2026-10-27T19:50:49.669568Z",
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

`POST /api/driver/v1/offers/cd184fd3-9d89-41d4-9466-1429b9adc435/accept` → **200**

```json
{
  "command_id": "74b1b177-b1cb-4f03-b876-b0c08e9a2a1b"
}
```

```json
{
  "id": "130f213f-96e4-4e1f-ae20-fb119445935b",
  "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c2f4fdb1-a897-4b9b-921a-1842287ca629",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c2f4fdb1-a897-4b9b-921a-1842287ca629",
  "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
  "assignment_id": "130f213f-96e4-4e1f-ae20-fb119445935b",
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

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:34Z",
    "sequence": 1793130634770
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:34.788683Z",
  "last_location_at": "2026-10-27T19:50:34.788683Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c2f4fdb1-a897-4b9b-921a-1842287ca629/arrive` → **200**

```json
{
  "command_id": "95896c7e-aacb-416a-abb4-9ff4b176bbaf",
  "expected_version": 0
}
```

```json
{
  "id": "c2f4fdb1-a897-4b9b-921a-1842287ca629",
  "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
  "assignment_id": "130f213f-96e4-4e1f-ae20-fb119445935b",
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
  "arrived_at": "2026-10-27T19:50:34.823167Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c2f4fdb1-a897-4b9b-921a-1842287ca629/start` → **200**

```json
{
  "command_id": "a28d7059-20fa-4437-87a7-702cdce1e26f",
  "expected_version": 1
}
```

```json
{
  "id": "c2f4fdb1-a897-4b9b-921a-1842287ca629",
  "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
  "assignment_id": "130f213f-96e4-4e1f-ae20-fb119445935b",
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
  "arrived_at": "2026-10-27T19:50:34.823167Z",
  "started_at": "2026-10-27T19:50:34.859446Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:34Z",
    "sequence": 1793130634883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:34.900195Z",
  "last_location_at": "2026-10-27T19:50:34.900195Z",
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
  "device_ref": "sandbox-20882"
}
```

```json
{
  "challenge_id": "25460c45-57dc-4728-8563-d1c9d6abd31d",
  "expires_at": "2026-10-27T19:55:34.922889865Z",
  "resend_available_at": "2026-10-27T19:50:35.922889865Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "883460",
  "sent_at": "2026-10-27T19:50:34.92535814Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25460c45-57dc-4728-8563-d1c9d6abd31d",
  "code": "883460",
  "device_ref": "sandbox-20882"
}
```

```json
{
  "session_id": "d3fa3ef3-5f35-4355-bfe2-935f677a0d31",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUzNCwiaWF0IjoxNzkzMTMwNjM0LCJqdGkiOiIyMzgzMDhiNy0yMTY0LTRlODMtYTY3OS0zMjljOGE4YTRmNTAiLCJzaWQiOiJkM2ZhM2VmMy01ZjM1LTQzNTUtYmZlMi05MzVmNjc3YTBkMzEifQ.5UaMSxYq_lPs4EbBCP12HRHzFMlMvtXTnppgsiELwTg",
  "access_expires_at": "2026-10-27T20:05:34.976554258Z",
  "refresh_token": "asSj6KuX3nNBNNokFNt9mfSIUpstewALcRCXPxjYUvo",
  "refresh_expires_at": "2026-11-26T19:50:34.975968872Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:10.35908Z",
  "last_location_at": "2026-10-27T19:50:10.35908Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/eb625ead-f664-4bf8-9c2d-6cea79f3912e/handover` → **200**

```json
{
  "command_id": "f63b3e70-b0ae-41a1-8527-0038a0cdf07e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:10.35908Z",
  "last_location_at": "2026-10-27T19:50:10.35908Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/eb625ead-f664-4bf8-9c2d-6cea79f3912e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:35Z",
    "sequence": 1793130635624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:35.080429Z",
  "last_location_at": "2026-10-27T19:50:35.080429Z",
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
  "session_id": "ad61a4db-8f26-4448-9390-d7e7ee386c25",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MzUsImlhdCI6MTc5MzEzMDYzNSwianRpIjoiODFkZGNiMTQtNjdkZC00NzVlLTllYTItNmJjMDdmZTFkNTYzIiwic2lkIjoiYWQ2MWE0ZGItOGYyNi00NDQ4LTkzOTAtZDdlN2VlMzg2YzI1In0.goPWqtodpR4exsiX7-2WQJ7Dn1ak6qqe1Fmuu91pQEU",
  "access_expires_at": "2026-10-27T20:05:35.39174049Z",
  "refresh_token": "mGf77QcCVRev6uJY_B2hQwLMOyKe8JtG9YVLjuXoHuY",
  "refresh_expires_at": "2026-10-28T07:50:35.391182215Z",
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
  "session_id": "b3fedced-42f8-4f24-a1df-c3484a964e7f",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1MzUsImlhdCI6MTc5MzEzMDYzNSwianRpIjoiZGYwNzliYTctM2UzYi00N2NkLWIzODYtNjRjMzM3ZGE2OTA1Iiwic2lkIjoiYjNmZWRjZWQtNDJmOC00ZjI0LWExZGYtYzM0ODRhOTY0ZTdmIn0.8IOPL77cVjQyLf86ZIBCy0YF9U0qk8MVST2H8TgZanc",
  "access_expires_at": "2026-10-27T20:05:35.700173502Z",
  "refresh_token": "xQq_Dm9c5utz5ejdtbZ9PbAQZNkPf05uwGWyynQdP_g",
  "refresh_expires_at": "2026-10-28T07:50:35.699661879Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5c9c1f61-56cb-476d-a1a5-28fbd19c75a6` → **200**

```json
{
  "id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c8d3b1eb-8687-4842-8c29-3e3ad1c9f40a",
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
    "id": "130f213f-96e4-4e1f-ae20-fb119445935b",
    "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c2f4fdb1-a897-4b9b-921a-1842287ca629",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T19:50:34.665913Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5c9c1f61-56cb-476d-a1a5-28fbd19c75a6/interrupt` → **200**

```json
{
  "command_id": "408ee4b6-84ea-4108-8b90-2542a2685a95",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "c8d3b1eb-8687-4842-8c29-3e3ad1c9f40a",
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
      "id": "130f213f-96e4-4e1f-ae20-fb119445935b",
      "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c2f4fdb1-a897-4b9b-921a-1842287ca629",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T19:50:34.665913Z",
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
    "id": "bc48741a-1262-4e27-a131-1db60207110c",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "c8d3b1eb-8687-4842-8c29-3e3ad1c9f40a",
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
    "id": "7bd98b13-5416-4582-9859-9f5a6200140b",
    "order_id": "bc48741a-1262-4e27-a131-1db60207110c",
    "expires_at": "2026-10-27T19:50:50.78489Z",
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

`POST /api/driver/v1/offers/7bd98b13-5416-4582-9859-9f5a6200140b/accept` → **200**

```json
{
  "command_id": "da69c9e2-687f-41a9-8f85-4a33ca301a1f"
}
```

```json
{
  "id": "5dbdd206-8898-4c10-8c41-e6af945205c3",
  "order_id": "bc48741a-1262-4e27-a131-1db60207110c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "653663c5-625b-43c8-b6d3-f4d395d02825",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "653663c5-625b-43c8-b6d3-f4d395d02825",
  "order_id": "bc48741a-1262-4e27-a131-1db60207110c",
  "assignment_id": "5dbdd206-8898-4c10-8c41-e6af945205c3",
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
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:35.080429Z",
  "last_location_at": "2026-10-27T19:50:35.080429Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/eb625ead-f664-4bf8-9c2d-6cea79f3912e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:35Z",
    "sequence": 1793130635913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:35.93016Z",
  "last_location_at": "2026-10-27T19:50:35.93016Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/653663c5-625b-43c8-b6d3-f4d395d02825/arrive` → **200**

```json
{
  "command_id": "177e9118-2242-4eec-a5a8-433786e45559",
  "expected_version": 0
}
```

```json
{
  "id": "653663c5-625b-43c8-b6d3-f4d395d02825",
  "order_id": "bc48741a-1262-4e27-a131-1db60207110c",
  "assignment_id": "5dbdd206-8898-4c10-8c41-e6af945205c3",
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
  "arrived_at": "2026-10-27T19:50:35.963936Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/653663c5-625b-43c8-b6d3-f4d395d02825/start` → **200**

```json
{
  "command_id": "ef631626-3a97-4232-b2eb-4dac47041e50",
  "expected_version": 1
}
```

```json
{
  "id": "653663c5-625b-43c8-b6d3-f4d395d02825",
  "order_id": "bc48741a-1262-4e27-a131-1db60207110c",
  "assignment_id": "5dbdd206-8898-4c10-8c41-e6af945205c3",
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
  "arrived_at": "2026-10-27T19:50:35.963936Z",
  "started_at": "2026-10-27T19:50:36.001137Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/653663c5-625b-43c8-b6d3-f4d395d02825/complete` → **200**

```json
{
  "command_id": "89681e29-22e7-4d5d-9003-a551fb2ee738",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:50:36Z"
}
```

```json
{
  "id": "653663c5-625b-43c8-b6d3-f4d395d02825",
  "order_id": "bc48741a-1262-4e27-a131-1db60207110c",
  "assignment_id": "5dbdd206-8898-4c10-8c41-e6af945205c3",
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
  "arrived_at": "2026-10-27T19:50:35.963936Z",
  "started_at": "2026-10-27T19:50:36.001137Z",
  "completed_at": "2026-10-27T19:50:36.041043Z",
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
    "id": "bc48741a-1262-4e27-a131-1db60207110c",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:50:35.773426Z",
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
    "id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:50:34.665913Z",
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

`GET /api/operator/v1/orders/5c9c1f61-56cb-476d-a1a5-28fbd19c75a6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:50:34.666731Z",
      "actor": {
        "type": "CLIENT",
        "id": "c8d3b1eb-8687-4842-8c29-3e3ad1c9f40a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
        "quote_id": "eb671688-2da4-4ddc-b638-f703e978a5cc",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:50:34.668645Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
        "attempt_id": "31f5fe63-e719-4b1c-b092-b6e77d7d8819",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:50:34.674429Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cd184fd3-9d89-41d4-9466-1429b9adc435",
        "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:50:34.730165Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cd184fd3-9d89-41d4-9466-1429b9adc435",
        "order_id": "5c9c1f61-56cb-476d-a1a5-28fbd19c75a6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "130f213f-96e4-4e1f-ae20-fb119445935b"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 5c9c1f61-56cb-476d-a1a5-28fbd19c75a6, follow-up bc48741a-1262-4e27-a131-1db60207110c.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-29748"
}
```

```json
{
  "challenge_id": "3162aeb7-26ad-4989-bc4b-6433daf842c1",
  "expires_at": "2026-10-27T19:55:39.166594688Z",
  "resend_available_at": "2026-10-27T19:50:40.166594688Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "361309",
  "sent_at": "2026-10-27T19:50:39.168696617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3162aeb7-26ad-4989-bc4b-6433daf842c1",
  "code": "361309",
  "device_ref": "sandbox-29748"
}
```

```json
{
  "session_id": "db5e5171-4989-467b-8905-30c0cd8f6fa3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTUzOSwiaWF0IjoxNzkzMTMwNjM5LCJqdGkiOiI0ZmVhNjAxMy00NTg5LTQxNzAtYTk1My02NTQ5NDI4YTQ4MzEiLCJzaWQiOiJkYjVlNTE3MS00OTg5LTQ2N2ItODkwNS0zMGMwY2Q4ZjZmYTMifQ.7kiiKbJPIthMMc-ISqP431QwwSvzleBAM5voDmOKoAs",
  "access_expires_at": "2026-10-27T20:05:39.221380136Z",
  "refresh_token": "7iZFU-5-HM6gmBgLXwkLM3OuW_1N2Hxx041__CqyuoE",
  "refresh_expires_at": "2026-11-26T19:50:39.220781491Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:35.93016Z",
  "last_location_at": "2026-10-27T19:50:35.93016Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb625ead-f664-4bf8-9c2d-6cea79f3912e/handover` → **200**

```json
{
  "command_id": "4807c596-b5a5-4dff-b3a7-b21e3fff67c6",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:35.93016Z",
  "last_location_at": "2026-10-27T19:50:35.93016Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb625ead-f664-4bf8-9c2d-6cea79f3912e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:39Z",
    "sequence": 1793130639298
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:39.315893Z",
  "last_location_at": "2026-10-27T19:50:39.315893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678234427",
  "device_ref": "sandbox-1310"
}
```

```json
{
  "challenge_id": "beece06d-554f-43cf-975a-e5a390c90bbf",
  "expires_at": "2026-10-27T19:55:39.341163887Z",
  "resend_available_at": "2026-10-27T19:50:40.341163887Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678234427` → **200**

```json
{
  "phone": "+380678234427",
  "audience": "CLIENT",
  "code": "596206",
  "sent_at": "2026-10-27T19:50:39.343148636Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "beece06d-554f-43cf-975a-e5a390c90bbf",
  "code": "596206",
  "device_ref": "sandbox-1310"
}
```

```json
{
  "session_id": "d64268e5-08eb-4092-9a78-08002762232d",
  "subject": {
    "type": "CLIENT",
    "id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmQ3YzBjMy00NDNiLTRmM2MtODU4Yi1iOTUxOWRiNTFjZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTM5LCJpYXQiOjE3OTMxMzA2MzksImp0aSI6ImQ4NTBiNjY4LTU4MTMtNDZkMi1hM2EyLTkyZDQwNjdkYTljMyIsInNpZCI6ImQ2NDI2OGU1LTA4ZWItNDA5Mi05YTc4LTA4MDAyNzYyMjMyZCJ9.Vv0WrcDh2u_4bUm3lk3tV4GvloCjCVLoMrtZnXOPMQo",
  "access_expires_at": "2026-10-27T20:05:39.39561634Z",
  "refresh_token": "1luCEuWqHVkNT-EmV6YpWGLIis8Zjva7c5Gu860iUco",
  "refresh_expires_at": "2026-11-26T19:50:39.395003442Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1398c492-5926-421c-b818-52c86a535201",
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
  "id": "34fab69d-8946-478b-8d3b-004e4765438f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:39.428421Z",
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
  "command_id": "a877d8ee-160e-4a06-91f7-d81a22aa00c2",
  "quote_id": "34fab69d-8946-478b-8d3b-004e4765438f",
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
    "phone": "+380673148683"
  }
}
```

```json
{
  "id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.464777Z",
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
    "id": "6aeff32b-002e-475c-accb-ce86ab4c643f",
    "order_id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
    "expires_at": "2026-10-27T19:50:54.468406Z",
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

`POST /api/driver/v1/offers/6aeff32b-002e-475c-accb-ce86ab4c643f/accept` → **200**

```json
{
  "command_id": "f0ea31d5-4349-4ab1-b305-9cbbf5e46743"
}
```

```json
{
  "id": "6ab29e6f-627e-4a55-9dd1-0230f3e65e84",
  "order_id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "67741262-cce0-4c54-8fdd-8d5c5054a744",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "67741262-cce0-4c54-8fdd-8d5c5054a744",
  "order_id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
  "assignment_id": "6ab29e6f-627e-4a55-9dd1-0230f3e65e84",
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
    "phone": "+380673148683"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3f045433-9a7d-4fd1-978e-3410b14b64b1",
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
  "id": "f33bec74-9288-4027-b796-8208bbbce116",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:39.631233Z",
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
  "command_id": "599a6f23-a88c-45a9-8873-988af354cac1",
  "quote_id": "f33bec74-9288-4027-b796-8208bbbce116",
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
  "id": "d704a328-0279-44ba-8a08-70cca78402ad",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.66921Z",
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
  "command_id": "dbcd658b-068d-467f-8036-db16f2050553",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T22:50:39Z"
}
```

```json
{
  "id": "1954f361-8053-40b6-b9c8-f1074a0c1b88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:39.715188Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:50:39Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7ad29b73-7f54-41c2-8afc-ef0bc445d851",
  "quote_id": "1954f361-8053-40b6-b9c8-f1074a0c1b88",
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
  "pickup_at": "2026-10-27T22:50:39Z"
}
```

```json
{
  "id": "af5a9282-de1c-4a66-bbab-fd74939ba818",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.753399Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:50:39Z",
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
  "command_id": "4d7b5ab7-e86a-4913-a9a9-728745bbe7f1",
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
  "id": "c465e388-52c8-4c79-a364-f8c6732110bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:39.792985Z",
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
  "command_id": "f20135bf-213e-429d-bf89-d031c0d1491c",
  "quote_id": "c465e388-52c8-4c79-a364-f8c6732110bb",
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
  "correlation_id": "5c274ba2-48b4-427b-99aa-124aaac2d6bf"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "af5a9282-de1c-4a66-bbab-fd74939ba818",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
      "created_at": "2026-10-27T19:50:39.753399Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T22:50:39Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "d704a328-0279-44ba-8a08-70cca78402ad",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
      "created_at": "2026-10-27T19:50:39.66921Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d704a328-0279-44ba-8a08-70cca78402ad",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.66921Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/f8f3cbca-0d28-4572-b3c7-92540f731043` → **200**

```json
{
  "id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
    "id": "6ab29e6f-627e-4a55-9dd1-0230f3e65e84",
    "order_id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "67741262-cce0-4c54-8fdd-8d5c5054a744",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T19:50:39.464777Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f8f3cbca-0d28-4572-b3c7-92540f731043/cancel` → **200**

```json
{
  "command_id": "51445646-3edb-4e63-b42e-057033be4f7f",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
    "id": "6ab29e6f-627e-4a55-9dd1-0230f3e65e84",
    "order_id": "f8f3cbca-0d28-4572-b3c7-92540f731043",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "67741262-cce0-4c54-8fdd-8d5c5054a744",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:50:39.464777Z",
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

`GET /api/rider/v1/orders/d704a328-0279-44ba-8a08-70cca78402ad` → **200**

```json
{
  "id": "d704a328-0279-44ba-8a08-70cca78402ad",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.66921Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d704a328-0279-44ba-8a08-70cca78402ad/cancel` → **200**

```json
{
  "command_id": "2a52bd02-44cc-4bc2-8a96-a08705cf8ed8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d704a328-0279-44ba-8a08-70cca78402ad",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.66921Z",
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

`GET /api/rider/v1/orders/af5a9282-de1c-4a66-bbab-fd74939ba818` → **200**

```json
{
  "id": "af5a9282-de1c-4a66-bbab-fd74939ba818",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.753399Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:50:39Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/af5a9282-de1c-4a66-bbab-fd74939ba818/cancel` → **200**

```json
{
  "command_id": "38f240ac-fdaf-4cc3-8fe3-5774fd1c0845",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "af5a9282-de1c-4a66-bbab-fd74939ba818",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0fd7c0c3-443b-4f3c-858b-b9519db51cea",
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
  "created_at": "2026-10-27T19:50:39.753399Z",
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
  "pickup_at": "2026-10-27T22:50:39Z",
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
  "session_id": "eb625ead-f664-4bf8-9c2d-6cea79f3912e",
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
  "last_heartbeat_at": "2026-10-27T19:50:39.315893Z",
  "last_location_at": "2026-10-27T19:50:39.315893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb625ead-f664-4bf8-9c2d-6cea79f3912e/close` → **200**

```json
{
  "command_id": "663260e7-dbfd-495c-afa1-5ccd742e2593",
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

Done: orders f8f3cbca-0d28-4572-b3c7-92540f731043, d704a328-0279-44ba-8a08-70cca78402ad, af5a9282-de1c-4a66-bbab-fd74939ba818.

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
  "session_id": "1afd0e3e-8e2c-48ef-9924-b60796548658",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDAsImlhdCI6MTc5MzEzMDY0MCwianRpIjoiOGEwZjJmNWMtYTMwYy00NGUzLWFmMzQtM2VkZDM1NzE5NjNjIiwic2lkIjoiMWFmZDBlM2UtOGUyYy00OGVmLTk5MjQtYjYwNzk2NTQ4NjU4In0.zIsf_LJgXKzRYphaxHnkl2YYxgoMeUQWtlCSYO4K1as",
  "access_expires_at": "2026-10-27T20:05:40.432718826Z",
  "refresh_token": "GcRPO_PQ-xAMHzOm1cDBMnJmHk9k_GX2WPcVQNbMKM4",
  "refresh_expires_at": "2026-10-28T07:50:40.432112598Z",
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
  "session_id": "1161f822-3cac-4536-8d37-996826661dac",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDAsImlhdCI6MTc5MzEzMDY0MCwianRpIjoiYWFhYjVkMjYtZDE3Zi00MzZhLWIwYjAtY2ZhMzdlZjk0MzFiIiwic2lkIjoiMTE2MWY4MjItM2NhYy00NTM2LThkMzctOTk2ODI2NjYxZGFjIn0.zn8JmBIRiwytxrhObcyjgMo82OiRmLBe-AZL9x9VnQ4",
  "access_expires_at": "2026-10-27T20:05:40.748718322Z",
  "refresh_token": "Rx88E4NhLsf_ywId_m1OmuYbwJLwSJA43ZCmgOomaiw",
  "refresh_expires_at": "2026-10-28T07:50:40.748050159Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17435"
}
```

```json
{
  "challenge_id": "fb364ddd-396e-42c2-b719-40a97c1b58e3",
  "expires_at": "2026-10-27T19:55:40.770178289Z",
  "resend_available_at": "2026-10-27T19:50:41.770178289Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "531382",
  "sent_at": "2026-10-27T19:50:40.772312949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb364ddd-396e-42c2-b719-40a97c1b58e3",
  "code": "531382",
  "device_ref": "sandbox-17435"
}
```

```json
{
  "session_id": "212aba51-2ea9-4a6f-b8a8-45ecf5ffc036",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTU0MCwiaWF0IjoxNzkzMTMwNjQwLCJqdGkiOiJhZWE5YTBjMC0yNzI5LTRhZmItODMyNS0zMmRmYjZjODY0NzgiLCJzaWQiOiIyMTJhYmE1MS0yZWE5LTRhNmYtYjhhOC00NWVjZjVmZmMwMzYifQ.artxqk88hm5StbhtFjQgv2z5k4DjXaW7mYfYm_grDUA",
  "access_expires_at": "2026-10-27T20:05:40.823654447Z",
  "refresh_token": "9YLSvHJ4_iYWYomIUA42orHRixjzCH1fzF5N8vGjVLk",
  "refresh_expires_at": "2026-11-26T19:50:40.823106854Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:34.900195Z",
  "last_location_at": "2026-10-27T19:50:34.900195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/handover` → **200**

```json
{
  "command_id": "ea67071f-f2b6-4074-8787-28014e7aa43e",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:34.900195Z",
  "last_location_at": "2026-10-27T19:50:34.900195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:40Z",
    "sequence": 1793130640903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:40.921546Z",
  "last_location_at": "2026-10-27T19:50:40.921546Z",
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
  "command_id": "d3d9f459-3996-4c3c-bf76-1096c4189ea4",
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
  "effective_at": "2026-10-27T19:50:40.993046Z",
  "changed_by": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T19:50:41.022026501Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6c348c49-00fd-45bf-b40d-0ba4042ecc51",
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
  "id": "26256b54-ff82-4f62-9388-d55431c42c28",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:55:41.060441Z",
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
  "command_id": "49e08fa3-3cc8-4869-89a1-cf2d7447f227",
  "quote_id": "26256b54-ff82-4f62-9388-d55431c42c28",
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
    "phone": "+3806711125609"
  }
}
```

```json
{
  "id": "74c43c83-6460-4746-8e12-619e9d37a145",
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
  "created_at": "2026-10-27T19:50:41.10959Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125609"
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
    "id": "e5938b6b-e420-4cfd-ae79-21e8ee6ce072",
    "order_id": "74c43c83-6460-4746-8e12-619e9d37a145",
    "expires_at": "2026-10-27T19:50:56.113157Z",
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

`POST /api/driver/v1/offers/e5938b6b-e420-4cfd-ae79-21e8ee6ce072/accept` → **200**

```json
{
  "command_id": "74623ba1-3e84-487a-a001-95925a90de45"
}
```

```json
{
  "id": "b476a710-c689-4038-92d3-3cd0b3666f1d",
  "order_id": "74c43c83-6460-4746-8e12-619e9d37a145",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "314b039c-aa28-4a1d-835b-183e3657094c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "314b039c-aa28-4a1d-835b-183e3657094c",
  "order_id": "74c43c83-6460-4746-8e12-619e9d37a145",
  "assignment_id": "b476a710-c689-4038-92d3-3cd0b3666f1d",
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
    "phone": "+3806711125609"
  }
}
```

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:41Z",
    "sequence": 1793130641207
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:41.225014Z",
  "last_location_at": "2026-10-27T19:50:41.225014Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/314b039c-aa28-4a1d-835b-183e3657094c/arrive` → **200**

```json
{
  "command_id": "1d3dcb86-1075-43b3-ab65-6b60085a9a8e",
  "expected_version": 0
}
```

```json
{
  "id": "314b039c-aa28-4a1d-835b-183e3657094c",
  "order_id": "74c43c83-6460-4746-8e12-619e9d37a145",
  "assignment_id": "b476a710-c689-4038-92d3-3cd0b3666f1d",
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
  "arrived_at": "2026-10-27T19:50:41.260668Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125609"
  }
}
```

`POST /api/driver/v1/trips/314b039c-aa28-4a1d-835b-183e3657094c/start` → **200**

```json
{
  "command_id": "9048748e-56af-4554-8a71-d57c2699335e",
  "expected_version": 1
}
```

```json
{
  "id": "314b039c-aa28-4a1d-835b-183e3657094c",
  "order_id": "74c43c83-6460-4746-8e12-619e9d37a145",
  "assignment_id": "b476a710-c689-4038-92d3-3cd0b3666f1d",
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
  "arrived_at": "2026-10-27T19:50:41.260668Z",
  "started_at": "2026-10-27T19:50:41.299497Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125609"
  }
}
```

`POST /api/driver/v1/trips/314b039c-aa28-4a1d-835b-183e3657094c/complete` → **200**

```json
{
  "command_id": "7e05503a-3d38-4dc6-b5ea-dfc801df5795",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:50:41Z",
  "cash_received": true
}
```

```json
{
  "id": "314b039c-aa28-4a1d-835b-183e3657094c",
  "order_id": "74c43c83-6460-4746-8e12-619e9d37a145",
  "assignment_id": "b476a710-c689-4038-92d3-3cd0b3666f1d",
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
  "arrived_at": "2026-10-27T19:50:41.260668Z",
  "started_at": "2026-10-27T19:50:41.299497Z",
  "completed_at": "2026-10-27T19:50:41.341198Z",
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
  "command_id": "67b93dc2-7b51-4c9f-a959-0c188512f635",
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
  "id": "d961e572-19ef-401b-bb49-71b65a6cc8bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:55:41.382478Z",
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
  "command_id": "afdd8881-f939-44cd-8e64-94e068b98d38",
  "quote_id": "d961e572-19ef-401b-bb49-71b65a6cc8bf",
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
    "phone": "+380671118730"
  }
}
```

```json
{
  "id": "b1675179-5d48-45bc-8dd6-c0b709eb5598",
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
  "created_at": "2026-10-27T19:50:41.419221Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118730"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b1675179-5d48-45bc-8dd6-c0b709eb5598` → **200**

```json
{
  "id": "b1675179-5d48-45bc-8dd6-c0b709eb5598",
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
  "created_at": "2026-10-27T19:50:41.419221Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118730"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b1675179-5d48-45bc-8dd6-c0b709eb5598/cancel` → **200**

```json
{
  "command_id": "a61b3273-ad18-415b-9557-14b24706e94c",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "b1675179-5d48-45bc-8dd6-c0b709eb5598",
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
  "created_at": "2026-10-27T19:50:41.419221Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118730"
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
  "staff_id": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T19:50:41.491165Z",
  "last_entries": [
    {
      "order_id": "b1675179-5d48-45bc-8dd6-c0b709eb5598",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T19:50:41.491165Z"
    },
    {
      "order_id": "74c43c83-6460-4746-8e12-619e9d37a145",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T19:50:41.346771Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f521c671-273e-4e4f-b16a-3d0bbacd1b1f",
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
  "last_heartbeat_at": "2026-10-27T19:50:41.225014Z",
  "last_location_at": "2026-10-27T19:50:41.225014Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f521c671-273e-4e4f-b16a-3d0bbacd1b1f/close` → **200**

```json
{
  "command_id": "9680a543-652f-4297-a942-89632440fcbd",
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

Done: operator bonus for fulfilled 74c43c83-6460-4746-8e12-619e9d37a145 and operator-fault cancellation b1675179-5d48-45bc-8dd6-c0b709eb5598.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677027300",
  "device_ref": "sandbox-2768"
}
```

```json
{
  "challenge_id": "c77ec64b-585d-4701-bb0a-4ecdaffca976",
  "expires_at": "2026-10-27T19:55:43.642909698Z",
  "resend_available_at": "2026-10-27T19:50:44.642909698Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677027300` → **200**

```json
{
  "phone": "+380677027300",
  "audience": "CLIENT",
  "code": "964926",
  "sent_at": "2026-10-27T19:50:43.645394925Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679199692",
  "device_ref": "sandbox-18",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d1fd8be3-f79e-4e2b-8ef8-afe5f146951a",
  "expires_at": "2026-10-27T19:55:43.696383896Z",
  "resend_available_at": "2026-10-27T19:50:44.696383896Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679199692` → **200**

```json
{
  "phone": "+380679199692",
  "audience": "CLIENT",
  "code": "872956",
  "sent_at": "2026-10-27T19:50:43.699267045Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675960000",
  "device_ref": "sandbox-24760"
}
```

```json
{
  "challenge_id": "8b2e1e8c-6581-4f77-a794-dfa6c1ab174b",
  "expires_at": "2026-10-27T19:55:43.748759936Z",
  "resend_available_at": "2026-10-27T19:50:44.748759936Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675960000` → **200**

```json
{
  "phone": "+380675960000",
  "audience": "CLIENT",
  "code": "115321",
  "sent_at": "2026-10-27T19:50:43.751947363Z",
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
  "session_id": "f59e16a7-80fe-489b-bd8e-6439f80cdaca",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDQsImlhdCI6MTc5MzEzMDY0NCwianRpIjoiMDdmNzZhOGQtMGVhNC00NDc2LWJmNGYtY2UyZDJmZTBjNTBhIiwic2lkIjoiZjU5ZTE2YTctODBmZS00ODliLWJkOGUtNjQzOWY4MGNkYWNhIn0.PVDolEbYDP8T22DobRsHbMmI8MMQXDDCwIAbLz6JZKw",
  "access_expires_at": "2026-10-27T20:05:44.085973286Z",
  "refresh_token": "g5FlMZkZjvQlpfm84FothwxJyqsVxmfqPjhJzlkJRcA",
  "refresh_expires_at": "2026-10-28T07:50:44.085340261Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675960000` → **200**

```json
{
  "deliveries": [
    {
      "id": "6ecc43d6-7f26-4edd-8c34-423e5cf6e44b",
      "challenge_id": "8b2e1e8c-6581-4f77-a794-dfa6c1ab174b",
      "phone": "+380675960000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2d1613dd-b09a-4385-98b9-40b04e370d4c",
      "error": null,
      "attempted_at": "2026-10-27T19:50:43.752121Z"
    },
    {
      "id": "972550ed-36bc-4161-943e-10abfdf8eb20",
      "challenge_id": "8b2e1e8c-6581-4f77-a794-dfa6c1ab174b",
      "phone": "+380675960000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-27T19:50:43.751085Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675960000` → **200**

```json
{
  "phone": "+380675960000",
  "audience": "CLIENT",
  "code": "115321",
  "sent_at": "2026-10-27T19:50:43.751947363Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679199692` → **200**

```json
{
  "deliveries": [
    {
      "id": "4db2e382-f2cc-422e-976c-ac2bc62f54b5",
      "challenge_id": "d1fd8be3-f79e-4e2b-8ef8-afe5f146951a",
      "phone": "+380679199692",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ac4d7990-4610-4734-8f94-180d50b17643",
      "error": null,
      "attempted_at": "2026-10-27T19:50:43.699454Z"
    }
  ]
}
```

Done: SMS to +380677027300, a call to +380679199692, SMS then a call to +380675960000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633264140",
  "device_ref": "sandbox-29356"
}
```

```json
{
  "challenge_id": "a3307368-9f70-4159-bb8c-f4cbff481233",
  "expires_at": "2026-10-27T19:55:44.20563231Z",
  "resend_available_at": "2026-10-27T19:50:45.20563231Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633264140` → **200**

```json
{
  "phone": "+380633264140",
  "audience": "CLIENT",
  "code": "754979",
  "sent_at": "2026-10-27T19:50:44.207650394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3307368-9f70-4159-bb8c-f4cbff481233",
  "code": "754979",
  "device_ref": "sandbox-29356"
}
```

```json
{
  "session_id": "c64e1535-e983-458a-80ba-147fadba889c",
  "subject": {
    "type": "CLIENT",
    "id": "3a631141-f317-4a94-8016-4f92f2fd5a27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTYzMTE0MS1mMzE3LTRhOTQtODAxNi00ZjkyZjJmZDVhMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTQ0LCJpYXQiOjE3OTMxMzA2NDQsImp0aSI6IjJmNjYxNjNhLWUyNDUtNDVkMi1hODUzLTA5MTY4MzNhNzRmMyIsInNpZCI6ImM2NGUxNTM1LWU5ODMtNDU4YS04MGJhLTE0N2ZhZGJhODg5YyJ9.wdiquz7dkGQCOxtfaTvR0hvfB3_-V_lDfkFcf_cncZU",
  "access_expires_at": "2026-10-27T20:05:44.261475354Z",
  "refresh_token": "K0z5if0gyDYFxccDEaE-NyeBfRs34RsAtqEV8Ve-Dmg",
  "refresh_expires_at": "2026-11-26T19:50:44.260909872Z",
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
  "session_id": "741b656c-905c-4976-8df0-a27a9d87cc57",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDQsImlhdCI6MTc5MzEzMDY0NCwianRpIjoiODI4NzYzNTQtOTE4YS00MmQyLWIzNTAtZjU0YzA0MGZkODk0Iiwic2lkIjoiNzQxYjY1NmMtOTA1Yy00OTc2LThkZjAtYTI3YTlkODdjYzU3In0.E1FumPeo0Y7HcW2DbpcIQ3YCo6Lu_Wr_YdQYdEfM_hU",
  "access_expires_at": "2026-10-27T20:05:44.655064551Z",
  "refresh_token": "1Hpb_yauq8lq2X9ih8f98GLZXYMWZ31KKuIsoT1vkeA",
  "refresh_expires_at": "2026-10-28T07:50:44.654372126Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633264140` → **200**

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
  "correlation_id": "a32c881f-f30f-4dea-9253-c7cf39a52865"
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
  "session_id": "714f31de-cfd2-425e-acf8-7c95045ec90e",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDUsImlhdCI6MTc5MzEzMDY0NSwianRpIjoiODU0NTM0MDctM2NhZC00Y2NiLWFiOGYtYjE0OTQ3NWQ4NWVjIiwic2lkIjoiNzE0ZjMxZGUtY2ZkMi00MjVlLWFjZjgtN2M5NTA0NWVjOTBlIn0.i56EG40kF8iZCW91AKXH5wKQjAHMkKT3lcUNnwgSjB4",
  "access_expires_at": "2026-10-27T20:05:45.032626813Z",
  "refresh_token": "icl3vRJg7IKe_6JDSS3IOPPpMI0xOL74DiY0HrmwXXM",
  "refresh_expires_at": "2026-10-28T07:50:45.032045712Z",
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
  "command_id": "e3d2addd-d6e2-4a1b-a1aa-965e486c5584",
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
  "changed_by": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T19:50:45.104119101Z"
}
```

## The rider books the airport for 2026-10-27T22:50:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600206974",
  "device_ref": "sandbox-31274"
}
```

```json
{
  "challenge_id": "f7a6a02f-c85e-499e-bcd7-fdbf651feb17",
  "expires_at": "2026-10-27T19:55:45.13628651Z",
  "resend_available_at": "2026-10-27T19:50:46.13628651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600206974` → **200**

```json
{
  "phone": "+48600206974",
  "audience": "CLIENT",
  "code": "715729",
  "sent_at": "2026-10-27T19:50:45.138520076Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7a6a02f-c85e-499e-bcd7-fdbf651feb17",
  "code": "715729",
  "device_ref": "sandbox-31274"
}
```

```json
{
  "session_id": "d347d235-dbd3-4943-9035-8acb7ac2437c",
  "subject": {
    "type": "CLIENT",
    "id": "f3be582c-e964-4341-ac1a-db8bcc116d07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmM2JlNTgyYy1lOTY0LTQzNDEtYWMxYS1kYjhiY2MxMTZkMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTQ1LCJpYXQiOjE3OTMxMzA2NDUsImp0aSI6ImJkZWIwMTYwLWI4NGYtNDRjMC04Njg3LTBiMGI4MGM1M2ZlYSIsInNpZCI6ImQzNDdkMjM1LWRiZDMtNDk0My05MDM1LThhY2I3YWMyNDM3YyJ9.I7kAlgajC5q-JC8xNECdX9L-escemtVnSkMYdjiUX0g",
  "access_expires_at": "2026-10-27T20:05:45.190830423Z",
  "refresh_token": "ulXPwXJS54WuqJJ1hwVVkPDhVN3bv0pidAr-oYquhw4",
  "refresh_expires_at": "2026-11-26T19:50:45.190181037Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "386e9010-8ba4-45bc-a148-8d2930e63a00",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T22:50:44Z"
}
```

```json
{
  "id": "745d27b1-7682-497b-b77f-45944638b539",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T19:55:45.224121Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:50:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a6855bac-911a-4375-bd98-e0c5c2824f12",
  "quote_id": "745d27b1-7682-497b-b77f-45944638b539",
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
  "pickup_at": "2026-10-27T22:50:44Z"
}
```

```json
{
  "id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f3be582c-e964-4341-ac1a-db8bcc116d07",
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
  "created_at": "2026-10-27T19:50:45.259063Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:50:44Z",
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
  "device_ref": "sandbox-11960"
}
```

```json
{
  "challenge_id": "8c7b311d-1e74-48e2-8418-d2033da2722d",
  "expires_at": "2026-10-27T19:55:45.292694977Z",
  "resend_available_at": "2026-10-27T19:50:46.292694977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "352676",
  "sent_at": "2026-10-27T19:50:45.295063578Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c7b311d-1e74-48e2-8418-d2033da2722d",
  "code": "352676",
  "device_ref": "sandbox-11960"
}
```

```json
{
  "session_id": "b9cdd070-3795-47cb-a87d-85b7e2816687",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTU0NSwiaWF0IjoxNzkzMTMwNjQ1LCJqdGkiOiJlMDUwZTkzMi0wNGM2LTRlYjMtODRhNy0xZjllYTdmZTFmZmMiLCJzaWQiOiJiOWNkZDA3MC0zNzk1LTQ3Y2ItYTg3ZC04NWI3ZTI4MTY2ODcifQ.HJg4XuGEl0mi7ju8X_PWjgBzU08xyDPlvS7fJg1PAko",
  "access_expires_at": "2026-10-27T20:05:45.346686955Z",
  "refresh_token": "0wAz5cDtqpzr8cyHwS-706cRlBSerG4Ro9_08fb0W_w",
  "refresh_expires_at": "2026-11-26T19:50:45.346107432Z",
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
  "command_id": "bd5b96e3-d166-4ea7-bc68-0f77aa4a4670",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:45Z",
    "sequence": 1793130645394
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6cb19066-1f16-4e51-a767-63e7dac4c81b",
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
  "last_heartbeat_at": "2026-10-27T19:50:45.411164Z",
  "last_location_at": "2026-10-27T19:50:45.411164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
      "short_number": 13,
      "pickup_at": "2026-10-27T22:50:44Z",
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

`POST /api/driver/v1/preorders/8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5/reserve` → **200**

```json
{
  "command_id": "a02fcd2b-c142-4255-8fd0-981aec9ee547"
}
```

```json
{
  "id": "2f8d65d5-1532-44e0-8bb8-3b609ee9abbc",
  "state": "RESERVED",
  "order": {
    "order_id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
    "short_number": 13,
    "pickup_at": "2026-10-27T22:50:44Z",
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
  "reserved_at": "2026-10-27T19:50:45.476169Z",
  "confirm_from": "2026-10-27T22:20:44Z",
  "confirm_until": "2026-10-27T22:30:44Z",
  "drop_until": "2026-10-27T21:50:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2f8d65d5-1532-44e0-8bb8-3b609ee9abbc",
      "state": "RESERVED",
      "order": {
        "order_id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:50:44Z",
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
      "reserved_at": "2026-10-27T19:50:45.476169Z",
      "confirm_from": "2026-10-27T22:20:44Z",
      "confirm_until": "2026-10-27T22:30:44Z",
      "drop_until": "2026-10-27T21:50:44Z"
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
      "id": "2f8d65d5-1532-44e0-8bb8-3b609ee9abbc",
      "state": "RESERVED",
      "order": {
        "order_id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:50:44Z",
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
      "reserved_at": "2026-10-27T19:50:45.476169Z",
      "confirm_from": "2026-10-27T22:20:44Z",
      "confirm_until": "2026-10-27T22:30:44Z",
      "drop_until": "2026-10-27T21:50:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2f8d65d5-1532-44e0-8bb8-3b609ee9abbc/confirm` → **409**

```json
{
  "command_id": "d86ca74b-3e15-44c2-ad4f-96ee64e3d4ba"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2f8d65d5-1532-44e0-8bb8-3b609ee9abbc/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b0f92b01-9b61-4531-bd25-e04e8baebed4"
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
  "session_id": "40a89bb8-7029-47ac-9d74-4fe3103fee07",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDUsImlhdCI6MTc5MzEzMDY0NSwianRpIjoiYzU0N2JmNjktMjdkYi00YmM0LTk0MDQtOGU4YWM0MGI1ZTUzIiwic2lkIjoiNDBhODliYjgtNzAyOS00N2FjLTlkNzQtNGZlMzEwM2ZlZTA3In0.vrR0U_pG-IyomCzlMAjVrajQ763Ftk3wL5FFui3M06E",
  "access_expires_at": "2026-10-27T20:05:45.867964872Z",
  "refresh_token": "i4zL1CeL6vvxhTTQUF45vhTyz9ZL1H17Dc_MlS_oD6A",
  "refresh_expires_at": "2026-10-28T07:50:45.867415699Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5` → **200**

```json
{
  "id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f3be582c-e964-4341-ac1a-db8bcc116d07",
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
  "created_at": "2026-10-27T19:50:45.259063Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T22:50:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2f8d65d5-1532-44e0-8bb8-3b609ee9abbc",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T19:50:45.476169Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T19:50:45.260735Z",
      "actor": {
        "type": "CLIENT",
        "id": "f3be582c-e964-4341-ac1a-db8bcc116d07",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
        "preorder": true,
        "quote_id": "745d27b1-7682-497b-b77f-45944638b539",
        "pickup_at": "2026-10-27T22:50:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T19:50:45.477325Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2f8d65d5-1532-44e0-8bb8-3b609ee9abbc"
      }
    }
  ]
}
```

Done: pre-order 8bbd5e75-a9a3-4a47-ba58-d23a8fdfa7e5, reservation 2f8d65d5-1532-44e0-8bb8-3b609ee9abbc.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7366"
}
```

```json
{
  "challenge_id": "da32763c-9ac1-4daf-a710-05b6dbf36856",
  "expires_at": "2026-10-27T19:55:45.949751549Z",
  "resend_available_at": "2026-10-27T19:50:46.949751549Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "495479",
  "sent_at": "2026-10-27T19:50:45.952303471Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da32763c-9ac1-4daf-a710-05b6dbf36856",
  "code": "495479",
  "device_ref": "sandbox-7366"
}
```

```json
{
  "session_id": "b77a264e-5482-4b62-8de1-d968f7978222",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTU0NiwiaWF0IjoxNzkzMTMwNjQ2LCJqdGkiOiI0MjVmMjU3MC0zYWFkLTQ2ZjMtYmUxNi03MDY2YzE3ZjM1ODIiLCJzaWQiOiJiNzdhMjY0ZS01NDgyLTRiNjItOGRlMS1kOTY4Zjc5NzgyMjIifQ.AQCp8KPqE9zoc4SkU5HMb07eHU55jBUcEcWmneusNuQ",
  "access_expires_at": "2026-10-27T20:05:46.005442772Z",
  "refresh_token": "AR08XYhbWaMyx14whyicOpGduzjGLqCI0tQN87o7ziQ",
  "refresh_expires_at": "2026-11-26T19:50:46.004929319Z",
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
  "command_id": "49775c8b-e243-48cf-a011-ce5d32fd8e82",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:46Z",
    "sequence": 1793130646542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4e1d437-eeed-4811-8e68-da568d7f1324",
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
  "last_heartbeat_at": "2026-10-27T19:50:46.071469Z",
  "last_location_at": "2026-10-27T19:50:46.071469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672328242",
  "device_ref": "sandbox-2569"
}
```

```json
{
  "challenge_id": "51057b56-64fd-48ba-8da8-f7fa528417ef",
  "expires_at": "2026-10-27T19:55:46.098761678Z",
  "resend_available_at": "2026-10-27T19:50:47.098761678Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672328242` → **200**

```json
{
  "phone": "+380672328242",
  "audience": "CLIENT",
  "code": "189632",
  "sent_at": "2026-10-27T19:50:46.101177602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51057b56-64fd-48ba-8da8-f7fa528417ef",
  "code": "189632",
  "device_ref": "sandbox-2569"
}
```

```json
{
  "session_id": "51542d5c-23af-43e1-9683-82e35f0ff85e",
  "subject": {
    "type": "CLIENT",
    "id": "53a75529-f0d6-4d96-ad4f-c2b8b64b3b61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2E3NTUyOS1mMGQ2LTRkOTYtYWQ0Zi1jMmI4YjY0YjNiNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTQ2LCJpYXQiOjE3OTMxMzA2NDYsImp0aSI6Ijk5NzlhNzY2LTVlYWMtNGM1NS05ZGZhLWUyMjcxZjgzYTFmMSIsInNpZCI6IjUxNTQyZDVjLTIzYWYtNDNlMS05NjgzLTgyZTM1ZjBmZjg1ZSJ9.3yeI2JaqXyI9GuakCr0id9LQHTbcMYSqc1aNMcU4-So",
  "access_expires_at": "2026-10-27T20:05:46.153312054Z",
  "refresh_token": "lhSNVS_DanPuuR5uOkgullM6crphB3V1BKCxxjHHry4",
  "refresh_expires_at": "2026-11-26T19:50:46.152802266Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "189e3a2b-dfe4-441e-a339-2af1c664ff02",
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
  "id": "6f4c2d0f-afb6-4d8f-9434-99c29572dc4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:55:46.189199Z",
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
  "command_id": "bea2620f-0a3b-41e0-a174-eae327a0dae8",
  "quote_id": "6f4c2d0f-afb6-4d8f-9434-99c29572dc4f",
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
  "id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53a75529-f0d6-4d96-ad4f-c2b8b64b3b61",
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
  "created_at": "2026-10-27T19:50:46.227009Z",
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
    "id": "2a941edc-6ff4-4d5e-9fe5-419a24c8f5c8",
    "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
    "expires_at": "2026-10-27T19:51:01.230242Z",
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

`POST /api/driver/v1/offers/2a941edc-6ff4-4d5e-9fe5-419a24c8f5c8/accept` → **200**

```json
{
  "command_id": "8b6a1a19-b21d-4f18-ac05-162dfe7da7a3"
}
```

```json
{
  "id": "9134c39c-6fac-4768-831a-907fe37310b2",
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f853b975-4367-4a7e-9f82-dc19e5ddd15f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f853b975-4367-4a7e-9f82-dc19e5ddd15f",
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "assignment_id": "9134c39c-6fac-4768-831a-907fe37310b2",
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

`POST /api/driver/v1/work-sessions/a4e1d437-eeed-4811-8e68-da568d7f1324/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:46Z",
    "sequence": 1793130646543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4e1d437-eeed-4811-8e68-da568d7f1324",
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
  "last_heartbeat_at": "2026-10-27T19:50:46.342755Z",
  "last_location_at": "2026-10-27T19:50:46.342755Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f853b975-4367-4a7e-9f82-dc19e5ddd15f",
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "assignment_id": "9134c39c-6fac-4768-831a-907fe37310b2",
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

`POST /api/driver/v1/trips/f853b975-4367-4a7e-9f82-dc19e5ddd15f/arrive` → **200**

```json
{
  "command_id": "ab36d3cf-324e-44f4-95f8-8af33fa25b13",
  "expected_version": 0
}
```

```json
{
  "id": "f853b975-4367-4a7e-9f82-dc19e5ddd15f",
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "assignment_id": "9134c39c-6fac-4768-831a-907fe37310b2",
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
  "arrived_at": "2026-10-27T19:50:46.390546Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f853b975-4367-4a7e-9f82-dc19e5ddd15f/start` → **200**

```json
{
  "command_id": "42cb2fdd-8d74-419d-8dac-4c0653b7f3a8",
  "expected_version": 1
}
```

```json
{
  "id": "f853b975-4367-4a7e-9f82-dc19e5ddd15f",
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "assignment_id": "9134c39c-6fac-4768-831a-907fe37310b2",
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
  "arrived_at": "2026-10-27T19:50:46.390546Z",
  "started_at": "2026-10-27T19:50:46.421797Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a4e1d437-eeed-4811-8e68-da568d7f1324/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:46Z",
    "sequence": 1793130646544
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4e1d437-eeed-4811-8e68-da568d7f1324",
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
  "last_heartbeat_at": "2026-10-27T19:50:46.461015Z",
  "last_location_at": "2026-10-27T19:50:46.461015Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f853b975-4367-4a7e-9f82-dc19e5ddd15f/complete` → **200**

```json
{
  "command_id": "14bc847d-82db-4c54-a010-1ad3a89b33a6",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:50:46Z",
  "cash_received": true
}
```

```json
{
  "id": "f853b975-4367-4a7e-9f82-dc19e5ddd15f",
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "assignment_id": "9134c39c-6fac-4768-831a-907fe37310b2",
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
  "arrived_at": "2026-10-27T19:50:46.390546Z",
  "started_at": "2026-10-27T19:50:46.421797Z",
  "completed_at": "2026-10-27T19:50:46.490518Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/c1de2c07-2851-4da3-818e-fe12627b622c/rating` → **200**

```json
{
  "command_id": "d0e92e88-33fc-4a57-91dd-b3955dc46092",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "score": 5,
  "created_at": "2026-10-27T19:50:46.536038092Z"
}
```

`POST /api/driver/v1/orders/c1de2c07-2851-4da3-818e-fe12627b622c/rating` → **200**

```json
{
  "command_id": "9003f5b1-0534-4829-bb3c-e58b2e518473",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
  "score": 4,
  "created_at": "2026-10-27T19:50:46.569138149Z"
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
  "session_id": "412ee934-59b8-4ad9-b8f9-9c1b0c2b0cab",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDYsImlhdCI6MTc5MzEzMDY0NiwianRpIjoiZjdiMWJlMTgtZGJlNC00YWNhLWE1Y2QtYmM4NDkwMzZkZTUxIiwic2lkIjoiNDEyZWU5MzQtNTliOC00YWQ5LWI4ZjktOWMxYjBjMmIwY2FiIn0.h9hR0-mnndGpaENHn0jgORuCqMf3UqeHPj_VuqCMBwI",
  "access_expires_at": "2026-10-27T20:05:46.913055793Z",
  "refresh_token": "ZKbL1GGd5dzuu6EPQ0p7wz9rq1ZpPyFvsWcfilOdULI",
  "refresh_expires_at": "2026-10-28T07:50:46.912502363Z",
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
  "session_id": "029bdbd4-34ec-4457-b8a7-e9b3f3a35a10",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDcsImlhdCI6MTc5MzEzMDY0NywianRpIjoiY2Y4YjYyNjAtOTc5Yy00NDgyLWEwN2ItMzY2N2UyZmI3ZTNjIiwic2lkIjoiMDI5YmRiZDQtMzRlYy00NDU3LWI4YTctZTliM2YzYTM1YTEwIn0.OG1GBCeYZrsfWCUmEi32wIJ0x64Q08b7HHMjevgiG6c",
  "access_expires_at": "2026-10-27T20:05:47.221304608Z",
  "refresh_token": "igGw7jEXPxFRuH-3UTWIGKsovLgCwL8WaSa7lmxuHUY",
  "refresh_expires_at": "2026-10-28T07:50:47.220665192Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c1de2c07-2851-4da3-818e-fe12627b622c/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
      "author_type": "RIDER",
      "author_id": "53a75529-f0d6-4d96-ad4f-c2b8b64b3b61",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T19:50:46.536038Z"
    },
    {
      "order_id": "c1de2c07-2851-4da3-818e-fe12627b622c",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "53a75529-f0d6-4d96-ad4f-c2b8b64b3b61",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T19:50:46.569138Z"
    }
  ]
}
```

Done: ratings for order c1de2c07-2851-4da3-818e-fe12627b622c.

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
  "session_id": "26482b7c-bdf8-4d1a-a3cf-f67558742c6d",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NDcsImlhdCI6MTc5MzEzMDY0NywianRpIjoiZThmNTBkOWQtYjRmZC00MzdlLWJhYTQtNjZlMGFiOTliYjdhIiwic2lkIjoiMjY0ODJiN2MtYmRmOC00ZDFhLWEzY2YtZjY3NTU4NzQyYzZkIn0.1ddn4nPiYUlKVvF-pk01V4Kh9m2ka0lBjHpmF9hJId4",
  "access_expires_at": "2026-10-27T20:05:47.588005248Z",
  "refresh_token": "DwnuTs5kFPPctb7e0aEZwVgUxhMENMtGhLLGKDXsSb8",
  "refresh_expires_at": "2026-10-28T07:50:47.587480566Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "41908871-5a53-477d-b29c-8c6ab60b118e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27"
}
```

```json
{
  "id": "5b3ec345-95a7-4093-b7bb-4872933832c8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:47.62642Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b3ec345-95a7-4093-b7bb-4872933832c8` → **200**

```json
{
  "id": "5b3ec345-95a7-4093-b7bb-4872933832c8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:47.62642Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b3ec345-95a7-4093-b7bb-4872933832c8` → **200**

```json
{
  "id": "5b3ec345-95a7-4093-b7bb-4872933832c8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:47.62642Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b3ec345-95a7-4093-b7bb-4872933832c8` → **200**

```json
{
  "id": "5b3ec345-95a7-4093-b7bb-4872933832c8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:47.62642Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b3ec345-95a7-4093-b7bb-4872933832c8` → **200**

```json
{
  "id": "5b3ec345-95a7-4093-b7bb-4872933832c8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:47.62642Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5b3ec345-95a7-4093-b7bb-4872933832c8` → **200**

```json
{
  "id": "5b3ec345-95a7-4093-b7bb-4872933832c8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-27.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-27T19:50:47.62642Z",
  "ready_at": "2026-10-27T19:50:51.487386Z",
  "expires_at": "2026-10-28T19:50:51.487386Z"
}
```

`GET /api/admin/v1/reports/exports/5b3ec345-95a7-4093-b7bb-4872933832c8/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-27,13,6,7,0,0,11,2,0,11,1,0,1,4,1,2
total,13,6,7,0,0,11,2,0,11,1,0,1,4,1,2
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "de71bd54-64e0-4248-908c-00b7a8f83287",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27"
}
```

```json
{
  "id": "869b4c48-a20b-4e16-9b89-2c3d67bca650",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:51.819661Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/869b4c48-a20b-4e16-9b89-2c3d67bca650` → **200**

```json
{
  "id": "869b4c48-a20b-4e16-9b89-2c3d67bca650",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:51.819661Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/869b4c48-a20b-4e16-9b89-2c3d67bca650` → **200**

```json
{
  "id": "869b4c48-a20b-4e16-9b89-2c3d67bca650",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:51.819661Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/869b4c48-a20b-4e16-9b89-2c3d67bca650` → **200**

```json
{
  "id": "869b4c48-a20b-4e16-9b89-2c3d67bca650",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:51.819661Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/869b4c48-a20b-4e16-9b89-2c3d67bca650` → **200**

```json
{
  "id": "869b4c48-a20b-4e16-9b89-2c3d67bca650",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:51.819661Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/869b4c48-a20b-4e16-9b89-2c3d67bca650` → **200**

```json
{
  "id": "869b4c48-a20b-4e16-9b89-2c3d67bca650",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T19:50:51.819661Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/869b4c48-a20b-4e16-9b89-2c3d67bca650` → **200**

```json
{
  "id": "869b4c48-a20b-4e16-9b89-2c3d67bca650",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-27.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-27T19:50:51.819661Z",
  "ready_at": "2026-10-27T19:50:56.496659Z",
  "expires_at": "2026-10-28T19:50:56.496659Z"
}
```

`GET /api/admin/v1/reports/exports/869b4c48-a20b-4e16-9b89-2c3d67bca650/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-27,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/11513c64-8c78-4e9e-8017-94297dcf11d3` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/11513c64-8c78-4e9e-8017-94297dcf11d3",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1532384f-be68-461b-9ca7-e66f4b82f460"
}
```

Done: both reports were built in the background and downloaded.

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
  "session_id": "1009b8c3-c4ac-4b4a-8ceb-9db9fe9e282f",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NTcsImlhdCI6MTc5MzEzMDY1NywianRpIjoiMWZkOTc5NTUtMmYyMC00ZTY3LTlkMTQtZDMzMGVmZmQ1OTkwIiwic2lkIjoiMTAwOWI4YzMtYzRhYy00YjRhLThjZWItOWRiOWZlOWUyODJmIn0.UiyYkJt9XG60Q_wE7SFHzAPxac1J5Qt_ukeAZtGlfjk",
  "access_expires_at": "2026-10-27T20:05:57.349017002Z",
  "refresh_token": "nllWIM_wPPOtGanfDkMErPj7hYIFuaGSzK0139XQS44",
  "refresh_expires_at": "2026-10-28T07:50:57.348494342Z",
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
  "command_id": "8fe7cace-ce5c-495a-aba6-61af92775296",
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
  "changed_by": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:50:57.417934Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "8fe7cace-ce5c-495a-aba6-61af92775296",
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
  "changed_by": "7704136f-7f15-479f-bc4f-28eec7865cdc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:50:57.417934Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48478072577",
  "device_ref": "sandbox-6835"
}
```

```json
{
  "challenge_id": "0869eb30-e0b3-4122-8335-97c92683a7ab",
  "expires_at": "2026-10-27T19:55:57.48896315Z",
  "resend_available_at": "2026-10-27T19:50:58.48896315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48478072577` → **200**

```json
{
  "phone": "+48478072577",
  "audience": "CLIENT",
  "code": "805062",
  "sent_at": "2026-10-27T19:50:57.491226684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0869eb30-e0b3-4122-8335-97c92683a7ab",
  "code": "805062",
  "device_ref": "sandbox-6835"
}
```

```json
{
  "session_id": "b34ae22a-0ebe-4f39-9124-36da23c72262",
  "subject": {
    "type": "CLIENT",
    "id": "96b80b23-9cc4-44cb-a0a6-244fcb8c39fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NmI4MGIyMy05Y2M0LTQ0Y2ItYTBhNi0yNDRmY2I4YzM5ZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTU3LCJpYXQiOjE3OTMxMzA2NTcsImp0aSI6IjQ2M2YyN2ZlLTViYmYtNDZjMC05NjQxLTI4MDYzMDlhY2ExZCIsInNpZCI6ImIzNGFlMjJhLTBlYmUtNGYzOS05MTI0LTM2ZGEyM2M3MjI2MiJ9.JIhH7qKxe4FtnwK2gJMmiDXwvnkKLHSX-dB8stgKgtU",
  "access_expires_at": "2026-10-27T20:05:57.555871704Z",
  "refresh_token": "rwxBLLHLD0UbyxCZbEfUN1ynpCZnn1GGTyUDgoTDnHk",
  "refresh_expires_at": "2026-11-26T19:50:57.55538916Z",
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
  "correlation_id": "2dc8b8bb-ea03-464a-9d1b-e674d61dab54"
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
  "device_ref": "sandbox-26526"
}
```

```json
{
  "challenge_id": "74a22064-4b50-48f5-ba9d-4f6a87248e84",
  "expires_at": "2026-10-27T19:55:57.631488899Z",
  "resend_available_at": "2026-10-27T19:50:58.631488899Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "098359",
  "sent_at": "2026-10-27T19:50:57.633912898Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74a22064-4b50-48f5-ba9d-4f6a87248e84",
  "code": "098359",
  "device_ref": "sandbox-26526"
}
```

```json
{
  "session_id": "c24b7798-bb80-4d09-a23c-ece83a717235",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTU1NywiaWF0IjoxNzkzMTMwNjU3LCJqdGkiOiIzMjBiOWMxZi1kYzI4LTQ5ODMtOTc2NS04MzliMTVlODBjYWMiLCJzaWQiOiJjMjRiNzc5OC1iYjgwLTRkMDktYTIzYy1lY2U4M2E3MTcyMzUifQ.0wZKXNB1lvJVdyqRPfWRyZV2HL8QhY0_FgE9JbeYGT0",
  "access_expires_at": "2026-10-27T20:05:57.685997541Z",
  "refresh_token": "zy13lIU-fudr6Jz7rUKk0BKS3Q3O2m_PVzxsFMuLfPA",
  "refresh_expires_at": "2026-11-26T19:50:57.685429221Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6cb19066-1f16-4e51-a767-63e7dac4c81b",
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
  "last_heartbeat_at": "2026-10-27T19:50:45.411164Z",
  "last_location_at": "2026-10-27T19:50:45.411164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6cb19066-1f16-4e51-a767-63e7dac4c81b/handover` → **200**

```json
{
  "command_id": "2461f849-10ce-4f14-92e5-ee77f7743907",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6cb19066-1f16-4e51-a767-63e7dac4c81b",
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
  "last_heartbeat_at": "2026-10-27T19:50:45.411164Z",
  "last_location_at": "2026-10-27T19:50:45.411164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6cb19066-1f16-4e51-a767-63e7dac4c81b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:57Z",
    "sequence": 1793130657768
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6cb19066-1f16-4e51-a767-63e7dac4c81b",
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
  "last_heartbeat_at": "2026-10-27T19:50:57.785372Z",
  "last_location_at": "2026-10-27T19:50:57.785372Z",
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
  "session_id": "6cb19066-1f16-4e51-a767-63e7dac4c81b",
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
  "last_heartbeat_at": "2026-10-27T19:50:57.785372Z",
  "last_location_at": "2026-10-27T19:50:57.785372Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6cb19066-1f16-4e51-a767-63e7dac4c81b/close` → **200**

```json
{
  "command_id": "b7e0e2a4-2e65-46c5-a09c-4bfa3cc64521",
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
  "correlation_id": "4854d0a2-a61f-48a2-ac09-e8f0fb429bb8"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675253282",
  "device_ref": "sandbox-3493"
}
```

```json
{
  "challenge_id": "50704bfe-729e-4468-985d-807a0386f8fa",
  "expires_at": "2026-10-27T19:55:57.937880651Z",
  "resend_available_at": "2026-10-27T19:50:58.937880651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675253282` → **200**

```json
{
  "phone": "+380675253282",
  "audience": "CLIENT",
  "code": "589981",
  "sent_at": "2026-10-27T19:50:57.93983044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50704bfe-729e-4468-985d-807a0386f8fa",
  "code": "589981",
  "device_ref": "sandbox-3493"
}
```

```json
{
  "session_id": "fb843068-43c5-45e3-87c2-d7cb0f42a461",
  "subject": {
    "type": "CLIENT",
    "id": "351dba28-66bf-40ac-b360-0f7b7244e213"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTFkYmEyOC02NmJmLTQwYWMtYjM2MC0wZjdiNzI0NGUyMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxNTU3LCJpYXQiOjE3OTMxMzA2NTcsImp0aSI6ImNmY2M4NjI2LThiYjItNDViZC1iYTVjLWVlNDhlOGViZjRmMSIsInNpZCI6ImZiODQzMDY4LTQzYzUtNDVlMy04N2MyLWQ3Y2IwZjQyYTQ2MSJ9.KM-11r6oQe5iG87lPUqmRTmvlhuMXYYBDIT_FZU2f4M",
  "access_expires_at": "2026-10-27T20:05:57.992735815Z",
  "refresh_token": "SaO3yuirIGs7xvSU3mmbGcCKI2S17F4fNd1qBAzYCfI",
  "refresh_expires_at": "2026-11-26T19:50:57.99224335Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "de9e9a4e-24d3-4443-9562-93a7d14d002d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "68ec25fe-f836-4c94-b2be-3abc677504fd",
  "upload_path": "/api/rider/v1/uploads/68ec25fe-f836-4c94-b2be-3abc677504fd",
  "expires_at": "2026-10-27T20:05:58.025509746Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/68ec25fe-f836-4c94-b2be-3abc677504fd` → **200**

```json
{
  "file_id": "68ec25fe-f836-4c94-b2be-3abc677504fd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f8f4f630-266f-46d6-9de1-4590365b4c93",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "68ec25fe-f836-4c94-b2be-3abc677504fd"
  ]
}
```

```json
{
  "id": "d7fd4e23-35ba-418c-bf9c-69d6f85e2add",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:50:58.093584Z",
  "updated_at": "2026-10-27T19:50:58.093584Z",
  "messages": [
    {
      "id": "892c8fd5-b81b-4cbc-8328-eb18b834c652",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:50:58.095099Z",
      "attachments": [
        {
          "file_id": "68ec25fe-f836-4c94-b2be-3abc677504fd",
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
  "session_id": "ea7c9069-45f4-4fb3-b01d-fdaa483b251d",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NTgsImlhdCI6MTc5MzEzMDY1OCwianRpIjoiODNhNDIzMDQtY2QzNS00MTllLWE4NmYtYWU2NzBiNzNmMjQwIiwic2lkIjoiZWE3YzkwNjktNDVmNC00ZmIzLWIwMWQtZmRhYTQ4M2IyNTFkIn0.-uO-m3wK-a3r1lyv19ywoHEy8x6xZYBjxa49FkM5TF0",
  "access_expires_at": "2026-10-27T20:05:58.42310649Z",
  "refresh_token": "mkdd-OKS8WUJ6w77f7M89upp809OJIlhrGxh42VExDc",
  "refresh_expires_at": "2026-10-28T07:50:58.42262197Z",
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
  "session_id": "c42697dd-068b-4921-9e2d-3d76cb908e9e",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NTgsImlhdCI6MTc5MzEzMDY1OCwianRpIjoiYjIxZmI4MmEtODcwMS00YjRiLWI1ZmMtYjY0ZmYzMWU0N2Q1Iiwic2lkIjoiYzQyNjk3ZGQtMDY4Yi00OTIxLTllMmQtM2Q3NmNiOTA4ZTllIn0.bSbiKAYxHFgMLUZHU_E0DlirTN7NwOd0-RzBjPimLv8",
  "access_expires_at": "2026-10-27T20:05:58.729668253Z",
  "refresh_token": "eQvJTgBAVpaabq206B5Dclf0toMk1KVwGT1b8zDNy6M",
  "refresh_expires_at": "2026-10-28T07:50:58.729099421Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d7fd4e23-35ba-418c-bf9c-69d6f85e2add/attachments/68ec25fe-f836-4c94-b2be-3abc677504fd` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ca91ce3f-adc8-4efc-a1dd-255b8406ea59",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b8a8fab5-e198-4ebb-b7bd-edc49365c9d1",
  "upload_path": "/api/operator/v1/uploads/b8a8fab5-e198-4ebb-b7bd-edc49365c9d1",
  "expires_at": "2026-10-27T20:05:58.774718479Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b8a8fab5-e198-4ebb-b7bd-edc49365c9d1` → **200**

```json
{
  "file_id": "b8a8fab5-e198-4ebb-b7bd-edc49365c9d1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d7fd4e23-35ba-418c-bf9c-69d6f85e2add` → **200**

```json
{
  "id": "d7fd4e23-35ba-418c-bf9c-69d6f85e2add",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:50:58.093584Z",
  "updated_at": "2026-10-27T19:50:58.093584Z",
  "messages": [
    {
      "id": "892c8fd5-b81b-4cbc-8328-eb18b834c652",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:50:58.095099Z",
      "attachments": [
        {
          "file_id": "68ec25fe-f836-4c94-b2be-3abc677504fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d7fd4e23-35ba-418c-bf9c-69d6f85e2add/comments` → **200**

```json
{
  "command_id": "fde99b52-ba93-4440-84fc-e1d7ca262031",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b8a8fab5-e198-4ebb-b7bd-edc49365c9d1"
  ]
}
```

```json
{
  "id": "d7fd4e23-35ba-418c-bf9c-69d6f85e2add",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:50:58.093584Z",
  "updated_at": "2026-10-27T19:50:58.86899Z",
  "messages": [
    {
      "id": "892c8fd5-b81b-4cbc-8328-eb18b834c652",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:50:58.095099Z",
      "attachments": [
        {
          "file_id": "68ec25fe-f836-4c94-b2be-3abc677504fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "002a9080-b4e1-4b06-813c-6911e168ec4b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "7704136f-7f15-479f-bc4f-28eec7865cdc",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:50:58.868639Z",
      "attachments": [
        {
          "file_id": "b8a8fab5-e198-4ebb-b7bd-edc49365c9d1",
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

`GET /api/rider/v1/support/cases/d7fd4e23-35ba-418c-bf9c-69d6f85e2add` → **200**

```json
{
  "id": "d7fd4e23-35ba-418c-bf9c-69d6f85e2add",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:50:58.093584Z",
  "updated_at": "2026-10-27T19:50:58.86899Z",
  "messages": [
    {
      "id": "892c8fd5-b81b-4cbc-8328-eb18b834c652",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "351dba28-66bf-40ac-b360-0f7b7244e213",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:50:58.095099Z",
      "attachments": [
        {
          "file_id": "68ec25fe-f836-4c94-b2be-3abc677504fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "002a9080-b4e1-4b06-813c-6911e168ec4b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:50:58.868639Z",
      "attachments": [
        {
          "file_id": "b8a8fab5-e198-4ebb-b7bd-edc49365c9d1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d7fd4e23-35ba-418c-bf9c-69d6f85e2add/attachments/b8a8fab5-e198-4ebb-b7bd-edc49365c9d1` → **200**

Done: support case d7fd4e23-35ba-418c-bf9c-69d6f85e2add, rider attachment 68ec25fe-f836-4c94-b2be-3abc677504fd, operator attachment b8a8fab5-e198-4ebb-b7bd-edc49365c9d1.

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
  "session_id": "a8d84dbd-a575-490c-b770-804d43a96342",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NTksImlhdCI6MTc5MzEzMDY1OSwianRpIjoiM2QzODNiYzYtNDFjZi00ODQ4LWE5OTAtZjNmOTIyZGNhYmFiIiwic2lkIjoiYThkODRkYmQtYTU3NS00OTBjLWI3NzAtODA0ZDQzYTk2MzQyIn0.1E3ZvtCdt8faXTRmXV6VfGGMyovRZbTH-0yz_10KWj8",
  "access_expires_at": "2026-10-27T20:05:59.239944503Z",
  "refresh_token": "FKAXqczJrD36l4dzPL8lOLyAm7klU2SfubMhHRLo9_w",
  "refresh_expires_at": "2026-10-28T07:50:59.239417919Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20277"
}
```

```json
{
  "challenge_id": "ab08bd24-9d70-49be-a2ed-be16c8be5834",
  "expires_at": "2026-10-27T19:55:59.264198475Z",
  "resend_available_at": "2026-10-27T19:51:00.264198475Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "061230",
  "sent_at": "2026-10-27T19:50:59.266594498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab08bd24-9d70-49be-a2ed-be16c8be5834",
  "code": "061230",
  "device_ref": "sandbox-20277"
}
```

```json
{
  "session_id": "24da2d92-9fbe-488b-9735-90b9e7fe0b8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTU1OSwiaWF0IjoxNzkzMTMwNjU5LCJqdGkiOiJiZDU1YTFhMi04Yjg2LTQwNGItYWNiMy03MWNhZmZiN2QwZTMiLCJzaWQiOiIyNGRhMmQ5Mi05ZmJlLTQ4OGItOTczNS05MGI5ZTdmZTBiOGQifQ.RkCI1AOblnQ4XIpmj8qmI7b9oL0tdCdtKdIi7sj0B4c",
  "access_expires_at": "2026-10-27T20:05:59.318063758Z",
  "refresh_token": "umOLjuzV9c0K8sRf0OtBn1NMFNmsuOGT0kC8URArGyI",
  "refresh_expires_at": "2026-11-26T19:50:59.317550794Z",
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
  "command_id": "c2d2d79a-2267-4f68-91b5-d77b8499faff",
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
  "device_ref": "sandbox-1821"
}
```

```json
{
  "challenge_id": "cba9b93d-7cd1-4abf-95cc-e6a337be9bab",
  "expires_at": "2026-10-27T19:55:59.439554875Z",
  "resend_available_at": "2026-10-27T19:51:00.439554875Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "720573",
  "sent_at": "2026-10-27T19:50:59.441533227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cba9b93d-7cd1-4abf-95cc-e6a337be9bab",
  "code": "720573",
  "device_ref": "sandbox-1821"
}
```

```json
{
  "session_id": "ee7199b7-8fdc-4649-8dc1-6ab97711787c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTU1OSwiaWF0IjoxNzkzMTMwNjU5LCJqdGkiOiIyOTdkMDE1Ni1lZjAzLTRkZjItYmZjNC05NTBkMDk2YmVmY2UiLCJzaWQiOiJlZTcxOTliNy04ZmRjLTQ2NDktOGRjMS02YWI5NzcxMTc4N2MifQ.B1MZ1mN5yyFijYhCYo9FagOfWeDeipKjK8yaDjtqYx4",
  "access_expires_at": "2026-10-27T20:05:59.491645854Z",
  "refresh_token": "9_v_0SCGo1nEPapvVUzF1fzr2mhywyctjK55ktscG6Q",
  "refresh_expires_at": "2026-11-26T19:50:59.491111812Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4e1d437-eeed-4811-8e68-da568d7f1324",
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
  "last_heartbeat_at": "2026-10-27T19:50:46.461015Z",
  "last_location_at": "2026-10-27T19:50:46.461015Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4e1d437-eeed-4811-8e68-da568d7f1324/handover` → **200**

```json
{
  "command_id": "b637db2b-2a92-4b33-ae48-85bc72ba3440",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4e1d437-eeed-4811-8e68-da568d7f1324",
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
  "last_heartbeat_at": "2026-10-27T19:50:46.461015Z",
  "last_location_at": "2026-10-27T19:50:46.461015Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4e1d437-eeed-4811-8e68-da568d7f1324/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:59Z",
    "sequence": 1793130659570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4e1d437-eeed-4811-8e68-da568d7f1324",
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
  "last_heartbeat_at": "2026-10-27T19:50:59.586901Z",
  "last_location_at": "2026-10-27T19:50:59.586901Z",
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
  "command_id": "d753fe7e-a967-4938-9126-92481bbed759",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:50:59Z",
    "sequence": 1793130659631
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b11e496c-c11b-416a-a526-37b4adef2b4e",
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
  "last_heartbeat_at": "2026-10-27T19:50:59.647955Z",
  "last_location_at": "2026-10-27T19:50:59.647955Z",
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
  "session_id": "941eaaec-81e2-4acf-9f26-8216c6fd1780",
  "subject": {
    "type": "STAFF",
    "id": "7704136f-7f15-479f-bc4f-28eec7865cdc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzA0MTM2Zi03ZjE1LTQ3OWYtYmM0Zi0yOGVlYzc4NjVjZGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzE1NTksImlhdCI6MTc5MzEzMDY1OSwianRpIjoiZTQ1NDI3OWEtOGFmNC00NzdkLWJhYTEtZWQwMzdiZWU1YWFjIiwic2lkIjoiOTQxZWFhZWMtODFlMi00YWNmLTlmMjYtODIxNmM2ZmQxNzgwIn0.fevHKsG6wQvVv5TVcsK9-0MabSo1z-pMYwoLtQW_J0Y",
  "access_expires_at": "2026-10-27T20:05:59.963170252Z",
  "refresh_token": "cSvIhsfb0VXoa-QMuOqMWHLB9u3wpdXHTDF7wr_NKYQ",
  "refresh_expires_at": "2026-10-28T07:50:59.962641851Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7ce66b32-4996-46a9-8c83-0c7348ec5211",
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
  "id": "533ac5db-23c6-4f87-b23f-399f0f2f1722",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:55:59.992472Z",
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
  "command_id": "c341f0cc-773f-4bf3-b540-7dd8d374d847",
  "quote_id": "533ac5db-23c6-4f87-b23f-399f0f2f1722",
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
  "id": "22698a2b-94ed-40fb-89a4-f5d363670324",
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
  "created_at": "2026-10-27T19:51:00.030869Z",
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
    "id": "2deca285-65d5-4b6b-b92d-483f57d09afa",
    "order_id": "22698a2b-94ed-40fb-89a4-f5d363670324",
    "expires_at": "2026-10-27T19:51:15.035305Z",
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

`POST /api/driver/v1/offers/2deca285-65d5-4b6b-b92d-483f57d09afa/accept` → **200**

```json
{
  "command_id": "bd7d8982-c650-4005-b39e-707a4c77ff29"
}
```

```json
{
  "id": "86140987-01e2-4c3a-ae91-e1ad0aa69b96",
  "order_id": "22698a2b-94ed-40fb-89a4-f5d363670324",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9be0806c-94af-4faa-a308-b73445afc788",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9be0806c-94af-4faa-a308-b73445afc788",
  "order_id": "22698a2b-94ed-40fb-89a4-f5d363670324",
  "assignment_id": "86140987-01e2-4c3a-ae91-e1ad0aa69b96",
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

`POST /api/driver/v1/work-sessions/b11e496c-c11b-416a-a526-37b4adef2b4e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:51:00Z",
    "sequence": 1793130660166
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b11e496c-c11b-416a-a526-37b4adef2b4e",
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
  "last_heartbeat_at": "2026-10-27T19:51:00.185553Z",
  "last_location_at": "2026-10-27T19:51:00.185553Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9be0806c-94af-4faa-a308-b73445afc788/arrive` → **200**

```json
{
  "command_id": "21802c64-a09d-4942-a2bc-6ff94969a1db",
  "expected_version": 0
}
```

```json
{
  "id": "9be0806c-94af-4faa-a308-b73445afc788",
  "order_id": "22698a2b-94ed-40fb-89a4-f5d363670324",
  "assignment_id": "86140987-01e2-4c3a-ae91-e1ad0aa69b96",
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
  "arrived_at": "2026-10-27T19:51:00.221743Z",
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

`POST /api/driver/v1/trips/9be0806c-94af-4faa-a308-b73445afc788/start` → **200**

```json
{
  "command_id": "2a73d3a7-4a0e-4f9f-aa61-53e4316d6fc6",
  "expected_version": 1
}
```

```json
{
  "id": "9be0806c-94af-4faa-a308-b73445afc788",
  "order_id": "22698a2b-94ed-40fb-89a4-f5d363670324",
  "assignment_id": "86140987-01e2-4c3a-ae91-e1ad0aa69b96",
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
  "arrived_at": "2026-10-27T19:51:00.221743Z",
  "started_at": "2026-10-27T19:51:00.263294Z",
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

`POST /api/driver/v1/trips/9be0806c-94af-4faa-a308-b73445afc788/complete` → **200**

```json
{
  "command_id": "9f74d163-5723-4245-8b98-ebe299f3c77c",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:51:00Z",
  "cash_received": true
}
```

```json
{
  "id": "9be0806c-94af-4faa-a308-b73445afc788",
  "order_id": "22698a2b-94ed-40fb-89a4-f5d363670324",
  "assignment_id": "86140987-01e2-4c3a-ae91-e1ad0aa69b96",
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
  "arrived_at": "2026-10-27T19:51:00.221743Z",
  "started_at": "2026-10-27T19:51:00.263294Z",
  "completed_at": "2026-10-27T19:51:00.315178Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/22698a2b-94ed-40fb-89a4-f5d363670324` → **200**

```json
{
  "id": "22698a2b-94ed-40fb-89a4-f5d363670324",
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
    "id": "86140987-01e2-4c3a-ae91-e1ad0aa69b96",
    "order_id": "22698a2b-94ed-40fb-89a4-f5d363670324",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9be0806c-94af-4faa-a308-b73445afc788",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:51:00.030869Z",
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
  "session_id": "a4e1d437-eeed-4811-8e68-da568d7f1324",
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
  "last_heartbeat_at": "2026-10-27T19:50:59.586901Z",
  "last_location_at": "2026-10-27T19:50:59.586901Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4e1d437-eeed-4811-8e68-da568d7f1324/close` → **200**

```json
{
  "command_id": "02d8d941-d012-4d75-80eb-b82b3db9fa97",
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
  "session_id": "b11e496c-c11b-416a-a526-37b4adef2b4e",
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
  "last_heartbeat_at": "2026-10-27T19:51:00.185553Z",
  "last_location_at": "2026-10-27T19:51:00.185553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b11e496c-c11b-416a-a526-37b4adef2b4e/close` → **200**

```json
{
  "command_id": "1f244827-7b71-4025-81cc-ba3c78d56257",
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

Done: terminal order 22698a2b-94ed-40fb-89a4-f5d363670324 by Andrii (5a000000-0000-4000-8000-000000000403).
