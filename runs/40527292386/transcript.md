# Sandbox transcript (2026-10-27T15:04:59Z, 6531c11)

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
  "correlation_id": "245ca1fb-b4cd-471d-89c5-6001471e568e"
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
  "session_id": "c3a88bf9-fd52-45f7-b725-7b71b8e74f1e",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MDAsImlhdCI6MTc5MzExMzUwMCwianRpIjoiMjVkNzcyNTYtYjZjOC00OTVhLTk4ODktODk2MzE2MmM3MmRiIiwic2lkIjoiYzNhODhiZjktZmQ1Mi00NWY3LWI3MjUtN2I3MWI4ZTc0ZjFlIn0._V6ur8IPjKgjTSFDSJCkO3O-J2oTcLXwdw3F-1x4N5o",
  "access_expires_at": "2026-10-27T15:20:00.59624102Z",
  "refresh_token": "kJDBlAfLCwasasbGxZbdYY11MVIM6w0c5GMgX2x3L6o",
  "refresh_expires_at": "2026-10-28T03:05:00.593281833Z",
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
  "session_id": "b572c351-cf5b-4689-93fb-bf103fcd4acd",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MDEsImlhdCI6MTc5MzExMzUwMSwianRpIjoiYWQ2ZTg5MzItYWViMy00OTNhLThlODEtZDNjNWYzZDNlN2Q5Iiwic2lkIjoiYjU3MmMzNTEtY2Y1Yi00Njg5LTkzZmItYmYxMDNmY2Q0YWNkIn0.0fsEOSJmBocFJVW5htrsdgr-afUpf_SU1Lp3T4OYXYQ",
  "access_expires_at": "2026-10-27T15:20:01.889970988Z",
  "refresh_token": "_OC1gw_0z0K8ff6DoCRZPH0ZWOYz7S4qfBpH7-8u_yg",
  "refresh_expires_at": "2026-10-28T03:05:01.888967166Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0ba43e3a-0977-426e-a174-d01975a9f6c8",
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
  "id": "25573ac9-ba5c-43a7-b02e-511c6a19033a",
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
  "created_by": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "created_at": "2026-10-27T15:05:01.959536Z",
  "updated_at": "2026-10-27T15:05:01.959536Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638632108",
  "device_ref": "sandbox-28570"
}
```

```json
{
  "challenge_id": "5f3b1c16-102c-46d9-aba4-4f12f9376496",
  "expires_at": "2026-10-27T15:10:02.007674005Z",
  "resend_available_at": "2026-10-27T15:05:03.007674005Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638632108` → **200**

```json
{
  "phone": "+380638632108",
  "audience": "CLIENT",
  "code": "837488",
  "sent_at": "2026-10-27T15:05:02.014510825Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f3b1c16-102c-46d9-aba4-4f12f9376496",
  "code": "837488",
  "device_ref": "sandbox-28570"
}
```

```json
{
  "session_id": "1e45ce6f-8844-4d0d-ad3c-beb9cdf76bbe",
  "subject": {
    "type": "CLIENT",
    "id": "b18095e4-07a3-4b93-ba35-48a060ba9d20"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTgwOTVlNC0wN2EzLTRiOTMtYmEzNS00OGEwNjBiYTlkMjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDAyLCJpYXQiOjE3OTMxMTM1MDIsImp0aSI6IjMyMTIzNjdmLWFiNWMtNDliNC1hODE3LWRjMTU4ZTc4ZmU4YyIsInNpZCI6IjFlNDVjZTZmLTg4NDQtNGQwZC1hZDNjLWJlYjljZGY3NmJiZSJ9.Lga50El5CIjAPnBAwseKqlav_We1DBXiHIQJ4xqFYSY",
  "access_expires_at": "2026-10-27T15:20:02.09202893Z",
  "refresh_token": "-3NwtgF-NStrM2SLl1v4DPRg2GxQ1PDJvc6fk4Kg8Cw",
  "refresh_expires_at": "2026-11-26T15:05:02.090921225Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638632108` → **200**

```json
{
  "client_id": "b18095e4-07a3-4b93-ba35-48a060ba9d20"
}
```

`POST /api/admin/v1/rider-wallets/b18095e4-07a3-4b93-ba35-48a060ba9d20/top-ups` → **201**

```json
{
  "command_id": "fe5c2fe1-452a-41c7-8dfe-c61990efd3c9",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b18095e4-07a3-4b93-ba35-48a060ba9d20",
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
      "id": "21578dae-a0dc-42cd-aeb5-d93d265e7d3f",
      "at": "2026-10-27T15:05:02.179165Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3adeb530-a241-44a1-802a-6577eb77c08d",
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
  "id": "3857956c-f645-48c6-84d5-9084f865ad38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:10:02.384644Z",
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
      "id": "25573ac9-ba5c-43a7-b02e-511c6a19033a",
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
  "device_ref": "sandbox-13172"
}
```

```json
{
  "challenge_id": "46d249a9-f22b-4521-aa5e-4ed0c8ecfe10",
  "expires_at": "2026-10-27T15:10:02.453274894Z",
  "resend_available_at": "2026-10-27T15:05:03.453274894Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "840964",
  "sent_at": "2026-10-27T15:05:02.457679166Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46d249a9-f22b-4521-aa5e-4ed0c8ecfe10",
  "code": "840964",
  "device_ref": "sandbox-13172"
}
```

```json
{
  "session_id": "3e19036a-bc81-4221-8226-6d10acb832bc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQwMiwiaWF0IjoxNzkzMTEzNTAyLCJqdGkiOiIyNTdkNzQ4ZC03MDczLTRjMGUtYjAyMS1jMWY4ZDdjZTcxMmEiLCJzaWQiOiIzZTE5MDM2YS1iYzgxLTQyMjEtODIyNi02ZDEwYWNiODMyYmMifQ.D8ALd9lYsJqFSI1UunozxixjB5xRGjfb9XsA3LBmKZY",
  "access_expires_at": "2026-10-27T15:20:02.520183534Z",
  "refresh_token": "ld5pIu5abn4AjJD61hvNQvSkLyZRM8bYeRqeD7oS04c",
  "refresh_expires_at": "2026-11-26T15:05:02.51922125Z",
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
  "command_id": "7df88735-b649-416d-9e11-c60e63bf89b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:02Z",
    "sequence": 1793113502584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5e8ea8-7b19-4932-a066-3cb75dafc476",
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
  "last_heartbeat_at": "2026-10-27T15:05:02.626739Z",
  "last_location_at": "2026-10-27T15:05:02.626739Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ca0f496f-b4ce-4030-a302-528e1fe1bb9e",
  "quote_id": "3857956c-f645-48c6-84d5-9084f865ad38",
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
  "id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b18095e4-07a3-4b93-ba35-48a060ba9d20",
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
  "created_at": "2026-10-27T15:05:02.715715Z",
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
  "client_id": "b18095e4-07a3-4b93-ba35-48a060ba9d20",
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
      "id": "21578dae-a0dc-42cd-aeb5-d93d265e7d3f",
      "at": "2026-10-27T15:05:02.179165Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
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
    "id": "4841d645-9ffe-4186-8426-6dcf74f5a5f1",
    "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
    "expires_at": "2026-10-27T15:05:17.731816Z",
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

`POST /api/driver/v1/offers/4841d645-9ffe-4186-8426-6dcf74f5a5f1/accept` → **200**

```json
{
  "command_id": "ab9f1182-4502-4a6a-afd4-41b0c4038f2c"
}
```

```json
{
  "id": "1425af3b-38fa-43d2-9239-ba1a11304735",
  "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0",
  "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
  "assignment_id": "1425af3b-38fa-43d2-9239-ba1a11304735",
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

`POST /api/driver/v1/work-sessions/8f5e8ea8-7b19-4932-a066-3cb75dafc476/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:02Z",
    "sequence": 1793113502956
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5e8ea8-7b19-4932-a066-3cb75dafc476",
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
  "last_heartbeat_at": "2026-10-27T15:05:02.988002Z",
  "last_location_at": "2026-10-27T15:05:02.988002Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0/arrive` → **200**

```json
{
  "command_id": "34829ac0-64d3-435e-8d10-a17fef325cb2",
  "expected_version": 0
}
```

```json
{
  "id": "5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0",
  "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
  "assignment_id": "1425af3b-38fa-43d2-9239-ba1a11304735",
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
  "arrived_at": "2026-10-27T15:05:03.050662Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0/start` → **200**

```json
{
  "command_id": "20e63f55-2f18-4fe1-853a-4c8dab8cab69",
  "expected_version": 1
}
```

```json
{
  "id": "5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0",
  "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
  "assignment_id": "1425af3b-38fa-43d2-9239-ba1a11304735",
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
  "arrived_at": "2026-10-27T15:05:03.050662Z",
  "started_at": "2026-10-27T15:05:03.112099Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0/complete` → **200**

```json
{
  "command_id": "bd8e5e4f-9607-46eb-9cbe-3d8f2aa798cc",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:05:03Z",
  "cash_received": true
}
```

```json
{
  "id": "5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0",
  "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
  "assignment_id": "1425af3b-38fa-43d2-9239-ba1a11304735",
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
  "arrived_at": "2026-10-27T15:05:03.050662Z",
  "started_at": "2026-10-27T15:05:03.112099Z",
  "completed_at": "2026-10-27T15:05:03.183242Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b18095e4-07a3-4b93-ba35-48a060ba9d20",
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
      "id": "ae2dbfef-a2a0-4cf6-a18f-2e68070f5ffe",
      "at": "2026-10-27T15:05:03.528995Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820"
    },
    {
      "id": "21578dae-a0dc-42cd-aeb5-d93d265e7d3f",
      "at": "2026-10-27T15:05:02.179165Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/25573ac9-ba5c-43a7-b02e-511c6a19033a/archive` → **200**

```json
{
  "command_id": "2478f4bf-9f93-4262-864f-e933cfebf4cd",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "25573ac9-ba5c-43a7-b02e-511c6a19033a",
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
  "created_by": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "created_at": "2026-10-27T15:05:01.959536Z",
  "updated_at": "2026-10-27T15:05:06.277085Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5e8ea8-7b19-4932-a066-3cb75dafc476",
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
  "last_heartbeat_at": "2026-10-27T15:05:02.988002Z",
  "last_location_at": "2026-10-27T15:05:02.988002Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8f5e8ea8-7b19-4932-a066-3cb75dafc476/close` → **200**

```json
{
  "command_id": "4a8760c0-90fe-4a95-b57e-576bb7586bd1",
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

Done: order 562c6b90-3049-40c3-b3c8-5f4bfec9a820.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639863403",
  "device_ref": "sandbox-7485"
}
```

```json
{
  "challenge_id": "86f28d42-b97e-4ab8-8197-d59fca7e70b8",
  "expires_at": "2026-10-27T15:10:06.398459749Z",
  "resend_available_at": "2026-10-27T15:05:07.398459749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639863403` → **200**

```json
{
  "phone": "+380639863403",
  "audience": "CLIENT",
  "code": "654822",
  "sent_at": "2026-10-27T15:05:06.401804268Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86f28d42-b97e-4ab8-8197-d59fca7e70b8",
  "code": "654822",
  "device_ref": "sandbox-7485"
}
```

```json
{
  "session_id": "33e7ae41-db3e-4059-bf9e-80e49f0654b0",
  "subject": {
    "type": "CLIENT",
    "id": "85f9dcf4-0811-42fc-b0d1-2107210086e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NWY5ZGNmNC0wODExLTQyZmMtYjBkMS0yMTA3MjEwMDg2ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDA2LCJpYXQiOjE3OTMxMTM1MDYsImp0aSI6IjY3ZGYyOTVkLTljZjItNGU3Mi1hNjdkLTFhMzU3MWJiZDY4MSIsInNpZCI6IjMzZTdhZTQxLWRiM2UtNDA1OS1iZjllLTgwZTQ5ZjA2NTRiMCJ9.piAo3_JZ9JYmzl8yRhYW7txRkbQUHOWM6yHuGyXnBpI",
  "access_expires_at": "2026-10-27T15:20:06.458490439Z",
  "refresh_token": "XS_Y5mIY3Aqu74_tDn1Bdb5QVHgwqFD1ILCCnN0EuqM",
  "refresh_expires_at": "2026-11-26T15:05:06.457635445Z",
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
  "device_ref": "sandbox-32561"
}
```

```json
{
  "challenge_id": "91bc2231-e463-402c-b689-bb9e6d0fcb03",
  "expires_at": "2026-10-27T15:10:06.516665448Z",
  "resend_available_at": "2026-10-27T15:05:07.516665448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "349206",
  "sent_at": "2026-10-27T15:05:06.520079456Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91bc2231-e463-402c-b689-bb9e6d0fcb03",
  "code": "349206",
  "device_ref": "sandbox-32561"
}
```

```json
{
  "session_id": "3762ca93-3f89-4aa7-90d0-e0141918209d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQwNiwiaWF0IjoxNzkzMTEzNTA2LCJqdGkiOiI2YjAyMGQxYS0wMTI4LTQ4MzMtODExMi1kZDJkMTQ2N2Y3OGIiLCJzaWQiOiIzNzYyY2E5My0zZjg5LTRhYTctOTBkMC1lMDE0MTkxODIwOWQifQ.fyiIici0iYh5zLzPhozBMMOWXcotTjg36oEghnglYyA",
  "access_expires_at": "2026-10-27T15:20:06.578477822Z",
  "refresh_token": "ndJck2U6nmb8jUBQqFm397Wx9Tb_z6p6aiUopx-UBl4",
  "refresh_expires_at": "2026-11-26T15:05:06.577454624Z",
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
  "session_id": "1929c68a-4147-455c-96f8-380b2e2210da",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MDYsImlhdCI6MTc5MzExMzUwNiwianRpIjoiOTA3YTI2ODItNzcyMC00MWVhLWFmY2YtZDAyZmIxZWQ0YWYyIiwic2lkIjoiMTkyOWM2OGEtNDE0Ny00NTVjLTk2ZjgtMzgwYjJlMjIxMGRhIn0.f-hfQ3COl13bOJuZ9znmpnUcKrO_on2Z-eAuMT6o92E",
  "access_expires_at": "2026-10-27T15:20:06.9229589Z",
  "refresh_token": "bXmqPJ11E2pcF28MQ6c1455noSZ1_Y8fBIPPsIZUjes",
  "refresh_expires_at": "2026-10-28T03:05:06.92211726Z",
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
  "session_id": "995addb7-77db-4e40-86a2-b0a80c577e67",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MDcsImlhdCI6MTc5MzExMzUwNywianRpIjoiNTQ0MzRiNzEtZmFmYy00NmUzLTkyZTUtZDNlOTQ0NGYyMDE4Iiwic2lkIjoiOTk1YWRkYjctNzdkYi00ZTQwLTg2YTItYjBhODBjNTc3ZTY3In0.IDTi6Zi38aPf_MKBV4kkapvJ5jry68pzT902x5PVR4g",
  "access_expires_at": "2026-10-27T15:20:07.243074095Z",
  "refresh_token": "7MfDvk9q9G9_HZWXc2ZQKXvVYQpgMRp60zld_B8eUuA",
  "refresh_expires_at": "2026-10-28T03:05:07.242171058Z",
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
  "command_id": "b14ab326-fe65-44a1-886d-1a4a183476d9",
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
  "id": "94ac5952-089c-46bd-95a8-2bcda3bc245b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:10:07.307537Z",
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
  "command_id": "0cb06e54-1b7b-4e9e-a218-16a83d89ddf8",
  "quote_id": "94ac5952-089c-46bd-95a8-2bcda3bc245b",
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
  "id": "547b5bd4-ef5d-46e1-8c5d-733da9079e2d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85f9dcf4-0811-42fc-b0d1-2107210086e7",
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
  "created_at": "2026-10-27T15:05:07.346278Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/547b5bd4-ef5d-46e1-8c5d-733da9079e2d` → **200**

```json
{
  "id": "547b5bd4-ef5d-46e1-8c5d-733da9079e2d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85f9dcf4-0811-42fc-b0d1-2107210086e7",
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
  "created_at": "2026-10-27T15:05:07.346278Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/547b5bd4-ef5d-46e1-8c5d-733da9079e2d/cancel` → **200**

```json
{
  "command_id": "556b738d-ba9d-4640-ac51-725818683398",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "547b5bd4-ef5d-46e1-8c5d-733da9079e2d",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85f9dcf4-0811-42fc-b0d1-2107210086e7",
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
  "created_at": "2026-10-27T15:05:07.346278Z",
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
  "command_id": "351d598d-54a6-4ad1-85e6-482d5aa99a6d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:07Z",
    "sequence": 1793113507487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb0920da-ef5c-45e0-9750-bbfbf62d1139",
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
  "last_heartbeat_at": "2026-10-27T15:05:07.50609Z",
  "last_location_at": "2026-10-27T15:05:07.50609Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15301"
}
```

```json
{
  "challenge_id": "23a659a1-36d0-4f33-a351-a6e4fab3f18a",
  "expires_at": "2026-10-27T15:10:07.536496891Z",
  "resend_available_at": "2026-10-27T15:05:08.536496891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "418456",
  "sent_at": "2026-10-27T15:05:07.539836187Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23a659a1-36d0-4f33-a351-a6e4fab3f18a",
  "code": "418456",
  "device_ref": "sandbox-15301"
}
```

```json
{
  "session_id": "09bd9125-cbd3-4f6f-8053-8b17ba66253d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQwNywiaWF0IjoxNzkzMTEzNTA3LCJqdGkiOiI3M2VmM2ViMy1hOGZiLTQ0NmQtYTJlNS1iNzAzYmE4YzEwZTciLCJzaWQiOiIwOWJkOTEyNS1jYmQzLTRmNmYtODA1My04YjE3YmE2NjI1M2QifQ.wkV93UkJNbFbcXQT84kjWATVOJU6DiA8WXhSRtNb7qo",
  "access_expires_at": "2026-10-27T15:20:07.606843155Z",
  "refresh_token": "QzPaP2WaPF_YwC9ZQwr8ACfR4MRN80268omOtA9Ivzs",
  "refresh_expires_at": "2026-11-26T15:05:07.606115406Z",
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
  "command_id": "c170b9ea-0967-41f9-9d94-3f12182a6476",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:07Z",
    "sequence": 1793113507659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:07.678088Z",
  "last_location_at": "2026-10-27T15:05:07.678088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e59d7d61-2d11-4151-900b-6cc7aa64a6df",
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
  "id": "637e72fe-7335-4b76-82b7-34ee74d218e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:10:07.719928Z",
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
  "command_id": "22e7c3c8-ee21-40d6-b3d9-7027d6287d0f",
  "quote_id": "637e72fe-7335-4b76-82b7-34ee74d218e9",
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
  "id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85f9dcf4-0811-42fc-b0d1-2107210086e7",
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
  "created_at": "2026-10-27T15:05:07.759274Z",
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
    "id": "26cc2588-0ab4-42c6-9e94-21e7c4603f5e",
    "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
    "expires_at": "2026-10-27T15:05:22.763921Z",
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

`POST /api/driver/v1/offers/26cc2588-0ab4-42c6-9e94-21e7c4603f5e/accept` → **200**

```json
{
  "command_id": "64ccb8a6-35fa-48dd-acd7-e3277f3a33d2"
}
```

```json
{
  "id": "2a46aea7-e57f-4a62-9e3e-dc2d9bd0e214",
  "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4bf35622-5a4e-48d5-881f-0326139d2937",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4bf35622-5a4e-48d5-881f-0326139d2937",
  "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "assignment_id": "2a46aea7-e57f-4a62-9e3e-dc2d9bd0e214",
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

`POST /api/driver/v1/trips/4bf35622-5a4e-48d5-881f-0326139d2937/cancel` → **200**

```json
{
  "command_id": "1a403a59-dd95-416c-a79a-4066bdf49ece",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "4bf35622-5a4e-48d5-881f-0326139d2937",
  "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "assignment_id": "2a46aea7-e57f-4a62-9e3e-dc2d9bd0e214",
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

`GET /api/rider/v1/orders/3cf1936c-2a78-40e2-8e37-f3dcdc14ef94` → **200**

```json
{
  "id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "85f9dcf4-0811-42fc-b0d1-2107210086e7",
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
    "id": "2a46aea7-e57f-4a62-9e3e-dc2d9bd0e214",
    "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4bf35622-5a4e-48d5-881f-0326139d2937",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T15:05:07.759274Z",
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
    "id": "47c90c64-2a10-4dd1-8530-a98dbff96fda",
    "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
    "expires_at": "2026-10-27T15:05:22.912049Z",
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

`POST /api/driver/v1/offers/47c90c64-2a10-4dd1-8530-a98dbff96fda/accept` → **200**

```json
{
  "command_id": "0d7f6e0d-6d24-4d74-9afb-44b097225eaf"
}
```

```json
{
  "id": "e17f7fea-cb73-4e6a-93f6-0bc9ebfbd7bf",
  "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0947a567-d089-45b6-9ccc-954a26413a6f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0947a567-d089-45b6-9ccc-954a26413a6f",
  "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "assignment_id": "e17f7fea-cb73-4e6a-93f6-0bc9ebfbd7bf",
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

`POST /api/driver/v1/trips/0947a567-d089-45b6-9ccc-954a26413a6f/cancel` → **200**

```json
{
  "command_id": "6ff32a88-953c-429d-8289-e0c93472e406",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0947a567-d089-45b6-9ccc-954a26413a6f",
  "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
  "assignment_id": "e17f7fea-cb73-4e6a-93f6-0bc9ebfbd7bf",
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
    "id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:05:07.759274Z",
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
    "id": "547b5bd4-ef5d-46e1-8c5d-733da9079e2d",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:05:07.346278Z",
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

`GET /api/operator/v1/orders/3cf1936c-2a78-40e2-8e37-f3dcdc14ef94/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:05:07.75997Z",
      "actor": {
        "type": "CLIENT",
        "id": "85f9dcf4-0811-42fc-b0d1-2107210086e7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
        "quote_id": "637e72fe-7335-4b76-82b7-34ee74d218e9",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:05:07.762767Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
        "attempt_id": "5d73d8e0-f659-45c1-af1f-44e29178b820",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:05:07.769527Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "26cc2588-0ab4-42c6-9e94-21e7c4603f5e",
        "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:05:07.835561Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "26cc2588-0ab4-42c6-9e94-21e7c4603f5e",
        "order_id": "3cf1936c-2a78-40e2-8e37-f3dcdc14ef94",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "2a46aea7-e57f-4a62-9e3e-dc2d9bd0e214"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 547b5bd4-ef5d-46e1-8c5d-733da9079e2d, 3cf1936c-2a78-40e2-8e37-f3dcdc14ef94.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739681792",
  "device_ref": "sandbox-2527"
}
```

```json
{
  "challenge_id": "77a06184-c0cc-4a36-b2b1-f191a39adfff",
  "expires_at": "2026-10-27T15:10:08.178097913Z",
  "resend_available_at": "2026-10-27T15:05:09.178097913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739681792` → **200**

```json
{
  "phone": "+380739681792",
  "audience": "CLIENT",
  "code": "725576",
  "sent_at": "2026-10-27T15:05:08.181551842Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77a06184-c0cc-4a36-b2b1-f191a39adfff",
  "code": "725576",
  "device_ref": "sandbox-2527"
}
```

```json
{
  "session_id": "c3b51ab9-a346-4805-a180-d615d8cf2cd8",
  "subject": {
    "type": "CLIENT",
    "id": "cf7b7e0e-ba9d-4797-a308-8773769bb28b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjdiN2UwZS1iYTlkLTQ3OTctYTMwOC04NzczNzY5YmIyOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDA4LCJpYXQiOjE3OTMxMTM1MDgsImp0aSI6ImNkNzI5ZTI1LTFiNWMtNDMwZS1iODNhLTMzNjU4NThlNmZiOCIsInNpZCI6ImMzYjUxYWI5LWEzNDYtNDgwNS1hMTgwLWQ2MTVkOGNmMmNkOCJ9.zay6NIFEBpJVXo3dCHod1MMlrpCq2mH12OFhWyOXizc",
  "access_expires_at": "2026-10-27T15:20:08.237965761Z",
  "refresh_token": "YwCFy9sPaXd_3QiSK4XzmZtJlW4NiVpVGM0BiCE5zHQ",
  "refresh_expires_at": "2026-11-26T15:05:08.237170759Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "373e98bc-ddf1-4ed7-8937-2d04ac5ea070",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7c554deb-41e5-4fb7-99a4-f363811608c4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7c554deb-41e5-4fb7-99a4-f363811608c4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6f53dc68063f1ee763d977005f9021bd",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7c554deb-41e5-4fb7-99a4-f363811608c4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739681792"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7c554deb-41e5-4fb7-99a4-f363811608c4",
  "expires_at": "2026-10-27T15:35:08.275231Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/7c554deb-41e5-4fb7-99a4-f363811608c4` → **200**

```json
{
  "id": "7c554deb-41e5-4fb7-99a4-f363811608c4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:35:08.275231Z",
  "card": {
    "id": "648cdf28-9d9a-4f01-9700-13993cca8d65",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6702",
    "card_type": "Visa",
    "created_at": "2026-10-27T15:05:08.324766Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "648cdf28-9d9a-4f01-9700-13993cca8d65",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6702",
      "card_type": "Visa",
      "created_at": "2026-10-27T15:05:08.324766Z"
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
  "device_ref": "sandbox-28206"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "e0e6dad6-3b86-41db-82a2-49d57e95da08",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28206"
}
```

```json
{
  "challenge_id": "fa5ad77a-1f31-4a6e-8703-64cba63503d6",
  "expires_at": "2026-10-27T15:10:09.436886052Z",
  "resend_available_at": "2026-10-27T15:05:10.436886052Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "969184",
  "sent_at": "2026-10-27T15:05:09.439771411Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa5ad77a-1f31-4a6e-8703-64cba63503d6",
  "code": "969184",
  "device_ref": "sandbox-28206"
}
```

```json
{
  "session_id": "65db0f51-affc-4f21-87c4-43c0c0383bf5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQwOSwiaWF0IjoxNzkzMTEzNTA5LCJqdGkiOiJiYjMwYmE1OC05Zjg3LTQxNjctOGZhYi1iNzA1ZGYwMjNjNzkiLCJzaWQiOiI2NWRiMGY1MS1hZmZjLTRmMjEtODdjNC00M2MwYzAzODNiZjUifQ.o074S1-CBXP12ildgdSQZfnjxJgj1Wdiikijk7TQXPY",
  "access_expires_at": "2026-10-27T15:20:09.498188883Z",
  "refresh_token": "zuSqQVN2NVfxrbIo1wKotHCE3Y2qaNx-KbFebD1KWjo",
  "refresh_expires_at": "2026-11-26T15:05:09.497395784Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:07.678088Z",
  "last_location_at": "2026-10-27T15:05:07.678088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29698f55-f328-4685-b90b-549d0c231476/handover` → **200**

```json
{
  "command_id": "7e9566d7-7951-42b8-b137-8422ae804183",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:07.678088Z",
  "last_location_at": "2026-10-27T15:05:07.678088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29698f55-f328-4685-b90b-549d0c231476/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:09Z",
    "sequence": 1793113509589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:09.609193Z",
  "last_location_at": "2026-10-27T15:05:09.609193Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f9e53978-ad5f-4410-a5c8-951e7685f3be",
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
  "id": "fd417989-84bc-4e71-af0f-bbd068be3d2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T15:10:09.647202Z",
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
  "command_id": "e386ff56-16d4-431a-b132-825e925f11e1",
  "quote_id": "fd417989-84bc-4e71-af0f-bbd068be3d2e",
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
  "id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cf7b7e0e-ba9d-4797-a308-8773769bb28b",
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
  "created_at": "2026-10-27T15:05:09.68494Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/69efa9a7-3478-4ee4-9f99-e3cea6cf6680` → **200**

```json
{
  "id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cf7b7e0e-ba9d-4797-a308-8773769bb28b",
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
  "created_at": "2026-10-27T15:05:09.68494Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/69efa9a7-3478-4ee4-9f99-e3cea6cf6680` → **200**

```json
{
  "id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cf7b7e0e-ba9d-4797-a308-8773769bb28b",
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
  "created_at": "2026-10-27T15:05:09.68494Z",
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
    "id": "5f787c15-c3cb-44f5-9b65-cfe5cc9fb52a",
    "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
    "expires_at": "2026-10-27T15:05:25.657548Z",
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

`POST /api/driver/v1/offers/5f787c15-c3cb-44f5-9b65-cfe5cc9fb52a/accept` → **200**

```json
{
  "command_id": "79990d63-7ca6-489b-8b9d-ddb10241e530"
}
```

```json
{
  "id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
  "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a996f799-67e3-4417-91d5-26213e91d15a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a996f799-67e3-4417-91d5-26213e91d15a",
  "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "assignment_id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
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

`POST /api/driver/v1/work-sessions/29698f55-f328-4685-b90b-549d0c231476/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:10Z",
    "sequence": 1793113510868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:10.887817Z",
  "last_location_at": "2026-10-27T15:05:10.887817Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a996f799-67e3-4417-91d5-26213e91d15a/arrive` → **200**

```json
{
  "command_id": "694b8680-288c-4946-8dfd-95a450a1605e",
  "expected_version": 0
}
```

```json
{
  "id": "a996f799-67e3-4417-91d5-26213e91d15a",
  "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "assignment_id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
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
  "arrived_at": "2026-10-27T15:05:10.92552Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/a996f799-67e3-4417-91d5-26213e91d15a/start` → **200**

```json
{
  "command_id": "5e037e7c-c9d3-4316-8135-a5f1e0389bed",
  "expected_version": 1
}
```

```json
{
  "id": "a996f799-67e3-4417-91d5-26213e91d15a",
  "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "assignment_id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
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
  "arrived_at": "2026-10-27T15:05:10.92552Z",
  "started_at": "2026-10-27T15:05:10.966619Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/a996f799-67e3-4417-91d5-26213e91d15a/complete` → **200**

```json
{
  "command_id": "6ca47e8e-fe0b-41c4-a10e-91c406c10081",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:05:10Z"
}
```

```json
{
  "id": "a996f799-67e3-4417-91d5-26213e91d15a",
  "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "assignment_id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
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
  "arrived_at": "2026-10-27T15:05:10.92552Z",
  "started_at": "2026-10-27T15:05:10.966619Z",
  "completed_at": "2026-10-27T15:05:11.01144Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/69efa9a7-3478-4ee4-9f99-e3cea6cf6680` → **200**

```json
{
  "id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "cf7b7e0e-ba9d-4797-a308-8773769bb28b",
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
    "id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
    "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a996f799-67e3-4417-91d5-26213e91d15a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:05:09.68494Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/69efa9a7-3478-4ee4-9f99-e3cea6cf6680` → **200**

```json
{
  "id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "cf7b7e0e-ba9d-4797-a308-8773769bb28b",
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
    "id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
    "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a996f799-67e3-4417-91d5-26213e91d15a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:05:09.68494Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/69efa9a7-3478-4ee4-9f99-e3cea6cf6680` → **200**

```json
{
  "id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "cf7b7e0e-ba9d-4797-a308-8773769bb28b",
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
    "id": "a3795e24-0416-447c-b7ec-e2a2b54241c2",
    "order_id": "69efa9a7-3478-4ee4-9f99-e3cea6cf6680",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a996f799-67e3-4417-91d5-26213e91d15a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:05:09.68494Z",
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

Done: card order 69efa9a7-3478-4ee4-9f99-e3cea6cf6680.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733705418",
  "device_ref": "sandbox-18030"
}
```

```json
{
  "challenge_id": "2b411c09-845a-45a0-b6fa-4a136ae62891",
  "expires_at": "2026-10-27T15:10:13.171430158Z",
  "resend_available_at": "2026-10-27T15:05:14.171430158Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733705418` → **200**

```json
{
  "phone": "+380733705418",
  "audience": "CLIENT",
  "code": "701951",
  "sent_at": "2026-10-27T15:05:13.174435319Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b411c09-845a-45a0-b6fa-4a136ae62891",
  "code": "701951",
  "device_ref": "sandbox-18030"
}
```

```json
{
  "session_id": "93bbd1aa-b528-49cb-883f-6f4d4fdce570",
  "subject": {
    "type": "CLIENT",
    "id": "fb70814d-3f22-4ea0-a991-7064a99011e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjcwODE0ZC0zZjIyLTRlYTAtYTk5MS03MDY0YTk5MDExZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDEzLCJpYXQiOjE3OTMxMTM1MTMsImp0aSI6ImNjZmIzN2FjLTMzY2QtNDFjNS1hYWM4LTkwNmYzZTZlNjMzZCIsInNpZCI6IjkzYmJkMWFhLWI1MjgtNDljYi04ODNmLTZmNGQ0ZmRjZTU3MCJ9.y-qKsbrTxXyffrV8Q-56AxuqebbYLQ0RjC0dTdOLXGA",
  "access_expires_at": "2026-10-27T15:20:13.228824383Z",
  "refresh_token": "Gh_lD1QK4LgminXBQUnmE4FPvZewlXSfEdkSCTg9zW0",
  "refresh_expires_at": "2026-11-26T15:05:13.228252828Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "296d724e-643e-4056-a3a3-d69ae659a9cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "fe9b1db7-6594-4140-83c7-669d77560e21",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-fe9b1db7-6594-4140-83c7-669d77560e21",
    "orderDate": "1793113513",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "04874929f64a9fc537fe8381b8a911b7",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=fe9b1db7-6594-4140-83c7-669d77560e21",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733705418"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=fe9b1db7-6594-4140-83c7-669d77560e21",
  "created_at": "2026-10-27T15:05:13.266473Z",
  "expires_at": "2026-10-27T15:35:13.266473Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/fe9b1db7-6594-4140-83c7-669d77560e21` → **200**

```json
{
  "id": "fe9b1db7-6594-4140-83c7-669d77560e21",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:05:13.266473Z",
  "expires_at": "2026-10-27T15:35:13.266473Z",
  "completed_at": "2026-10-27T15:05:13.30684Z",
  "masked_pan": "41****4445",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fb70814d-3f22-4ea0-a991-7064a99011e3",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fb70814d-3f22-4ea0-a991-7064a99011e3",
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
      "id": "1c43ad45-e05a-4518-b195-961715fd7cd9",
      "at": "2026-10-27T15:05:13.736833Z",
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
  "client_id": "fb70814d-3f22-4ea0-a991-7064a99011e3",
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
      "id": "1c43ad45-e05a-4518-b195-961715fd7cd9",
      "at": "2026-10-27T15:05:13.736833Z",
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
  "device_ref": "sandbox-12098"
}
```

```json
{
  "challenge_id": "7243699b-c211-4bb2-9c05-82dcf456bb03",
  "expires_at": "2026-10-27T15:10:14.436002581Z",
  "resend_available_at": "2026-10-27T15:05:15.436002581Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "120647",
  "sent_at": "2026-10-27T15:05:14.439037969Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7243699b-c211-4bb2-9c05-82dcf456bb03",
  "code": "120647",
  "device_ref": "sandbox-12098"
}
```

```json
{
  "session_id": "cfd6c284-3558-43e8-b4d9-bb65f2907404",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQxNCwiaWF0IjoxNzkzMTEzNTE0LCJqdGkiOiIwZDMxOWY1YS0wYzQ5LTRhMDItYjg0Zi1mMTIxYTAwZjQzMWQiLCJzaWQiOiJjZmQ2YzI4NC0zNTU4LTQzZTgtYjRkOS1iYjY1ZjI5MDc0MDQifQ.Yny70HIAN-RmlOUoqEjcn5omqCegJBiCjBYf4CFZrPA",
  "access_expires_at": "2026-10-27T15:20:14.495393826Z",
  "refresh_token": "6Z2h2QCiROnTbk_vhcI9cbH-_IyVb0oUHuTxsdjaHXs",
  "refresh_expires_at": "2026-11-26T15:05:14.494636831Z",
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
  "command_id": "6d42ea08-e05f-4fd7-9c6b-413262fdf7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "789f9feb-aba2-44f5-bfde-d378f18715e7",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-789f9feb-aba2-44f5-bfde-d378f18715e7",
    "orderDate": "1793113514",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "c363a0a71c8134f1cf136d7d6c14086a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=789f9feb-aba2-44f5-bfde-d378f18715e7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=789f9feb-aba2-44f5-bfde-d378f18715e7",
  "created_at": "2026-10-27T15:05:14.556969Z",
  "expires_at": "2026-10-27T15:35:14.556969Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/789f9feb-aba2-44f5-bfde-d378f18715e7` → **200**

```json
{
  "id": "789f9feb-aba2-44f5-bfde-d378f18715e7",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:05:14.556969Z",
  "expires_at": "2026-10-27T15:35:14.556969Z",
  "completed_at": "2026-10-27T15:05:14.589632Z",
  "masked_pan": "41****0125",
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
      "id": "69ffd7d9-c7b1-4371-bbaa-0ef8819008b3",
      "at": "2026-10-27T15:05:14.748899Z",
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

## A rider cannot use the driver's path

`POST /api/driver/v1/balance/card-top-ups` → **401**

```json
{
  "command_id": "bc2cd26d-300d-4749-8055-3813dadce798",
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
  "correlation_id": "822915f1-fc42-4da4-b0f6-04ba9110e43b"
}
```

**Expected 403, got 401 — scenario stopped.**

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
  "device_ref": "sandbox-14119"
}
```

```json
{
  "challenge_id": "c4906163-7210-48d1-b066-1e4ef29d0a0f",
  "expires_at": "2026-10-27T15:10:15.769626459Z",
  "resend_available_at": "2026-10-27T15:05:16.769626459Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "494991",
  "sent_at": "2026-10-27T15:05:15.772463265Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4906163-7210-48d1-b066-1e4ef29d0a0f",
  "code": "494991",
  "device_ref": "sandbox-14119"
}
```

```json
{
  "session_id": "22b89240-35d2-4761-8d69-3c49a5f1c6d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQxNSwiaWF0IjoxNzkzMTEzNTE1LCJqdGkiOiI2YWFhMTU5NS1kNDAwLTRlOWMtOTc0MC1hY2U3MjEwZjc3NzIiLCJzaWQiOiIyMmI4OTI0MC0zNWQyLTQ3NjEtOGQ2OS0zYzQ5YTVmMWM2ZDUifQ.gly_sp6RXAAPjPl7MEGoHhGaNCM05BvJJqYNdXWXCyE",
  "access_expires_at": "2026-10-27T15:20:15.833059616Z",
  "refresh_token": "WrAZA9_3oDK9kuf0a58jasj8AHSG-D1bBwlWAQv8D7I",
  "refresh_expires_at": "2026-11-26T15:05:15.832260185Z",
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
  "command_id": "c05ae38a-fb3e-4275-a0bb-28cbc9a845d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:15Z",
    "sequence": 1793113515896
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:15.915335Z",
  "last_location_at": "2026-10-27T15:05:15.915335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678574570",
  "device_ref": "sandbox-9220"
}
```

```json
{
  "challenge_id": "462aeb0c-faed-4f39-8d4f-36ae0bf940fe",
  "expires_at": "2026-10-27T15:10:15.94950572Z",
  "resend_available_at": "2026-10-27T15:05:16.94950572Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678574570` → **200**

```json
{
  "phone": "+380678574570",
  "audience": "CLIENT",
  "code": "887199",
  "sent_at": "2026-10-27T15:05:15.952028122Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "462aeb0c-faed-4f39-8d4f-36ae0bf940fe",
  "code": "887199",
  "device_ref": "sandbox-9220"
}
```

```json
{
  "session_id": "2e27238c-7c20-49cc-9739-3a05735068b8",
  "subject": {
    "type": "CLIENT",
    "id": "e8dc96a9-4fff-4ddc-ace0-e98afb6dd985"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOGRjOTZhOS00ZmZmLTRkZGMtYWNlMC1lOThhZmI2ZGQ5ODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDE2LCJpYXQiOjE3OTMxMTM1MTYsImp0aSI6IjViZjBjNzNlLWU1ZDItNDJmZC1iYjBlLWQ2MTQyOGY1OTdiNCIsInNpZCI6IjJlMjcyMzhjLTdjMjAtNDljYy05NzM5LTNhMDU3MzUwNjhiOCJ9.jdR8z7OBUhcDskbjnxtgmZR8p52yLprbpnGbqmLhYAE",
  "access_expires_at": "2026-10-27T15:20:16.007043109Z",
  "refresh_token": "qSrJoYMM6QtQ8bjgu7BqC6vqW7Y_srYkWFJBxHfezOg",
  "refresh_expires_at": "2026-11-26T15:05:16.006353754Z",
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
  "command_id": "813c3622-b176-4761-b265-5bf0bca5d49a",
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
  "id": "c9b0bb54-3c14-4661-bc97-0aa8a77eaa97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:10:16.070546Z",
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
  "command_id": "a3f23514-22d6-4e58-b5c3-04a76a0db4b7",
  "platform": "ANDROID",
  "token": "sandbox-driver-588c23a2-7de6-47cb-9a23-d3ef19ae0222"
}
```

```json
{
  "id": "d983df32-277c-4155-a6fe-8c18b8608bfe",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:05:16.114365Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b20d4fec-d272-4061-a069-cc2b0ffbe90d",
  "platform": "ANDROID",
  "token": "sandbox-rider-b4d6c883-429f-408f-abed-5b98ceb39fdb"
}
```

```json
{
  "id": "21f6d894-1d8f-4f54-99d4-7406d699b643",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:05:16.15126Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "35681795-7698-4b3a-852f-b2e0737c2c98",
  "quote_id": "c9b0bb54-3c14-4661-bc97-0aa8a77eaa97",
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
  "id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e8dc96a9-4fff-4ddc-ace0-e98afb6dd985",
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
  "created_at": "2026-10-27T15:05:16.191705Z",
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
    "id": "19e8cd4e-b08a-4f2d-8ca5-2971a157386b",
    "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
    "expires_at": "2026-10-27T15:05:31.195524Z",
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

`POST /api/driver/v1/offers/19e8cd4e-b08a-4f2d-8ca5-2971a157386b/accept` → **200**

```json
{
  "command_id": "715428f6-03bf-4a42-98a0-877147417456"
}
```

```json
{
  "id": "65fe4520-0ee4-4de6-bab2-231600b2f180",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "69b85749-541f-4638-9cde-0d6903e65e6c",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:05:16.169Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:05:16.169Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:05:16.169Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:05:17.500036734Z",
    "token_suffix": "ae0222",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
      "order_version": "2",
      "event_id": "1abcdce5-95d0-4853-8c02-b8b678ea6c73",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678574570&after=2026-10-27T15:05:16.169Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:05:17.501644451Z",
    "token_suffix": "b39fdb",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
      "order_version": "3",
      "event_id": "9a1f5ec0-0c02-4c1d-a367-92d659b6ea77",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/c919c601-c72f-4f2c-939b-dc75c83e52cf/messages` → **201**

```json
{
  "command_id": "3e506fff-cfcc-4011-89ce-6e03814fd062",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "99d04a6f-b001-472f-8ac5-0de8c515305d",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T15:05:18.417389256Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "69b85749-541f-4638-9cde-0d6903e65e6c",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "assignment_id": "65fe4520-0ee4-4de6-bab2-231600b2f180",
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

`POST /api/driver/v1/trips/69b85749-541f-4638-9cde-0d6903e65e6c/messages` → **201**

```json
{
  "command_id": "971b34e2-0031-45a0-b3c6-7a0ccefe647e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "2f7d3970-3f58-450a-8f7c-aa122c5fb204",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T15:05:18.469923375Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/c919c601-c72f-4f2c-939b-dc75c83e52cf/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/69b85749-541f-4638-9cde-0d6903e65e6c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678574570"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:18Z",
    "sequence": 1793113518547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:18.566177Z",
  "last_location_at": "2026-10-27T15:05:18.566177Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "69b85749-541f-4638-9cde-0d6903e65e6c",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "assignment_id": "65fe4520-0ee4-4de6-bab2-231600b2f180",
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

`POST /api/driver/v1/trips/69b85749-541f-4638-9cde-0d6903e65e6c/arrive` → **200**

```json
{
  "command_id": "69cf58c7-6e08-49eb-8714-02f2ab15fe2c",
  "expected_version": 0
}
```

```json
{
  "id": "69b85749-541f-4638-9cde-0d6903e65e6c",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "assignment_id": "65fe4520-0ee4-4de6-bab2-231600b2f180",
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
  "arrived_at": "2026-10-27T15:05:18.618809Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/69b85749-541f-4638-9cde-0d6903e65e6c/start` → **200**

```json
{
  "command_id": "9dc38f98-9169-4557-b427-66e347606677",
  "expected_version": 1
}
```

```json
{
  "id": "69b85749-541f-4638-9cde-0d6903e65e6c",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "assignment_id": "65fe4520-0ee4-4de6-bab2-231600b2f180",
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
  "arrived_at": "2026-10-27T15:05:18.618809Z",
  "started_at": "2026-10-27T15:05:18.655056Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:18Z",
    "sequence": 1793113518679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:18.697913Z",
  "last_location_at": "2026-10-27T15:05:18.697913Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/69b85749-541f-4638-9cde-0d6903e65e6c/complete` → **200**

```json
{
  "command_id": "23f9adfb-5c5b-4c91-8d92-a86b45849d70",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:05:18Z",
  "cash_received": true
}
```

```json
{
  "id": "69b85749-541f-4638-9cde-0d6903e65e6c",
  "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "assignment_id": "65fe4520-0ee4-4de6-bab2-231600b2f180",
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
  "arrived_at": "2026-10-27T15:05:18.618809Z",
  "started_at": "2026-10-27T15:05:18.655056Z",
  "completed_at": "2026-10-27T15:05:18.734341Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/c919c601-c72f-4f2c-939b-dc75c83e52cf` → **200**

```json
{
  "id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e8dc96a9-4fff-4ddc-ace0-e98afb6dd985",
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
    "id": "65fe4520-0ee4-4de6-bab2-231600b2f180",
    "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "69b85749-541f-4638-9cde-0d6903e65e6c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:05:16.191705Z",
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
    "id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:05:16.191705Z",
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
    "id": "69b85749-541f-4638-9cde-0d6903e65e6c",
    "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
    "order_short_number": 5,
    "created_at": "2026-10-27T15:05:16.264158Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5ad382b8-2aa1-46f9-9faa-f2733dfa3ec0",
    "order_id": "562c6b90-3049-40c3-b3c8-5f4bfec9a820",
    "order_short_number": 1,
    "created_at": "2026-10-27T15:05:02.887786Z",
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
  "session_id": "81dbefff-2772-4fae-bc65-9fffc99d6714",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MjIsImlhdCI6MTc5MzExMzUyMiwianRpIjoiMmI2YmE2MmYtMmM3Zi00MDZhLTgyMmQtY2MxN2U3MmUxY2RjIiwic2lkIjoiODFkYmVmZmYtMjc3Mi00ZmFlLWJjNjUtOWZmZmM5OWQ2NzE0In0.SWDSdiNZ2hRonP2klabd38CUX2lDu8-JYou9MvORFfM",
  "access_expires_at": "2026-10-27T15:20:22.183422238Z",
  "refresh_token": "l_uSyjNYYcDgvvmCINctNMJSZwOlgMQJMhfEcYXYFJM",
  "refresh_expires_at": "2026-10-28T03:05:22.182736978Z",
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
  "session_id": "98b1157f-4ff4-4588-883c-84a263043370",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MjIsImlhdCI6MTc5MzExMzUyMiwianRpIjoiYjczZDQxNzYtZTc1NC00ODViLWExZTUtNWUxY2YwMGVjNDJmIiwic2lkIjoiOThiMTE1N2YtNGZmNC00NTg4LTg4M2MtODRhMjYzMDQzMzcwIn0.CeoBKDuF_osLopmBmcwtZb2TkQr0lJHX99tfbfSmxzc",
  "access_expires_at": "2026-10-27T15:20:22.503730122Z",
  "refresh_token": "PLi7lKNFbEkdnzJ5cWaT-CtyBGa4x02ZbphrYUUmd8o",
  "refresh_expires_at": "2026-10-28T03:05:22.503083808Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c919c601-c72f-4f2c-939b-dc75c83e52cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:05:16.192592Z",
      "actor": {
        "type": "CLIENT",
        "id": "e8dc96a9-4fff-4ddc-ace0-e98afb6dd985",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
        "quote_id": "c9b0bb54-3c14-4661-bc97-0aa8a77eaa97",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:05:16.194551Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
        "attempt_id": "c6bd574a-06ee-4a5e-b0fb-e8bbfcd88bfe",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:05:16.200552Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "19e8cd4e-b08a-4f2d-8ca5-2971a157386b",
        "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:05:16.266356Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "19e8cd4e-b08a-4f2d-8ca5-2971a157386b",
        "order_id": "c919c601-c72f-4f2c-939b-dc75c83e52cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "65fe4520-0ee4-4de6-bab2-231600b2f180"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order c919c601-c72f-4f2c-939b-dc75c83e52cf.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9335"
}
```

```json
{
  "challenge_id": "cc92cc21-22db-47f0-9f42-19586569e2f7",
  "expires_at": "2026-10-27T15:10:22.569616658Z",
  "resend_available_at": "2026-10-27T15:05:23.569616658Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "423282",
  "sent_at": "2026-10-27T15:05:22.572183832Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc92cc21-22db-47f0-9f42-19586569e2f7",
  "code": "423282",
  "device_ref": "sandbox-9335"
}
```

```json
{
  "session_id": "e494d662-866f-4834-a1e5-d4436f95bef9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQyMiwiaWF0IjoxNzkzMTEzNTIyLCJqdGkiOiI3MGNiNDUzNS1mODJkLTRjYzQtYjAwMS1jNThkN2EyMTgxZWYiLCJzaWQiOiJlNDk0ZDY2Mi04NjZmLTQ4MzQtYTFlNS1kNDQzNmY5NWJlZjkifQ.VQb2ZEuYf-Sda7ZN8aZw-vswc_HDA5SGRceJxk84lEA",
  "access_expires_at": "2026-10-27T15:20:22.626856974Z",
  "refresh_token": "NtBrHMbELph6cdX3kvJ2uGdwgmCr9KE3v66rYv7UX6o",
  "refresh_expires_at": "2026-11-26T15:05:22.626235568Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:18.697913Z",
  "last_location_at": "2026-10-27T15:05:18.697913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/handover` → **200**

```json
{
  "command_id": "819425d9-f85b-4c72-8322-9fda4465d99b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:18.697913Z",
  "last_location_at": "2026-10-27T15:05:18.697913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:22Z",
    "sequence": 1793113522713
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:22.732603Z",
  "last_location_at": "2026-10-27T15:05:22.732603Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666564546",
  "device_ref": "sandbox-18621"
}
```

```json
{
  "challenge_id": "63844fe7-d81b-4a0b-8bb7-2f0a91801186",
  "expires_at": "2026-10-27T15:10:22.757701908Z",
  "resend_available_at": "2026-10-27T15:05:23.757701908Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666564546` → **200**

```json
{
  "phone": "+380666564546",
  "audience": "CLIENT",
  "code": "805876",
  "sent_at": "2026-10-27T15:05:22.759998869Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63844fe7-d81b-4a0b-8bb7-2f0a91801186",
  "code": "805876",
  "device_ref": "sandbox-18621"
}
```

```json
{
  "session_id": "3eade67c-a913-49ba-a53a-f5ba44890938",
  "subject": {
    "type": "CLIENT",
    "id": "9d573f44-2c83-4dd9-960c-18be62ec8019"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDU3M2Y0NC0yYzgzLTRkZDktOTYwYy0xOGJlNjJlYzgwMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDIyLCJpYXQiOjE3OTMxMTM1MjIsImp0aSI6IjRiMjU4YmU1LTg0MTMtNGQ3Ni05MjIxLWI5ZWUwMTA1Y2NiYiIsInNpZCI6IjNlYWRlNjdjLWE5MTMtNDliYS1hNTNhLWY1YmE0NDg5MDkzOCJ9.MUDam018Q2xShWNnpZ2r7UOosYUqWQEtdELxK0QBv9g",
  "access_expires_at": "2026-10-27T15:20:22.813217726Z",
  "refresh_token": "_IroyfSG8nm1_MeSWCKjeetHcYENZYm9UOge6W8gmCg",
  "refresh_expires_at": "2026-11-26T15:05:22.812579396Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b842f63-8b43-4398-a2f0-910aadd73d2b",
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
  "id": "e13ab9ea-33f1-4b1b-ab4e-f5c228f84dcb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T15:10:22.848158Z",
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
  "command_id": "7c7b3fdf-57bf-4786-b4b9-34b490b903b1",
  "quote_id": "e13ab9ea-33f1-4b1b-ab4e-f5c228f84dcb",
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
  "id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d573f44-2c83-4dd9-960c-18be62ec8019",
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
  "created_at": "2026-10-27T15:05:22.88734Z",
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
    "id": "51823413-8f24-4ddd-8af9-f58c2d7a10c4",
    "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
    "expires_at": "2026-10-27T15:05:37.890658Z",
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

`POST /api/driver/v1/offers/51823413-8f24-4ddd-8af9-f58c2d7a10c4/accept` → **200**

```json
{
  "command_id": "c06212f2-c3f9-4736-a416-afdac4e6b824"
}
```

```json
{
  "id": "2b83dd32-76ac-4c1f-a943-54aefc6856fc",
  "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "da3e601c-ebce-4935-bbcd-134372c17010",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "da3e601c-ebce-4935-bbcd-134372c17010",
  "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
  "assignment_id": "2b83dd32-76ac-4c1f-a943-54aefc6856fc",
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

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:22Z",
    "sequence": 1793113522997
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:23.016524Z",
  "last_location_at": "2026-10-27T15:05:23.016524Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/da3e601c-ebce-4935-bbcd-134372c17010/arrive` → **200**

```json
{
  "command_id": "477e391d-ed2f-493b-b1e2-7f1be7ffbe71",
  "expected_version": 0
}
```

```json
{
  "id": "da3e601c-ebce-4935-bbcd-134372c17010",
  "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
  "assignment_id": "2b83dd32-76ac-4c1f-a943-54aefc6856fc",
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
  "arrived_at": "2026-10-27T15:05:23.053152Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/da3e601c-ebce-4935-bbcd-134372c17010/start` → **200**

```json
{
  "command_id": "1013ae06-ec1b-4bd0-8f37-a36047e1cc3b",
  "expected_version": 1
}
```

```json
{
  "id": "da3e601c-ebce-4935-bbcd-134372c17010",
  "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
  "assignment_id": "2b83dd32-76ac-4c1f-a943-54aefc6856fc",
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
  "arrived_at": "2026-10-27T15:05:23.053152Z",
  "started_at": "2026-10-27T15:05:23.095095Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:23Z",
    "sequence": 1793113523122
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:23.142737Z",
  "last_location_at": "2026-10-27T15:05:23.142737Z",
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
  "device_ref": "sandbox-15621"
}
```

```json
{
  "challenge_id": "5016ae21-fa5e-464a-855f-5fe93f8caabd",
  "expires_at": "2026-10-27T15:10:23.168180008Z",
  "resend_available_at": "2026-10-27T15:05:24.168180008Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "546810",
  "sent_at": "2026-10-27T15:05:23.17086934Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5016ae21-fa5e-464a-855f-5fe93f8caabd",
  "code": "546810",
  "device_ref": "sandbox-15621"
}
```

```json
{
  "session_id": "2ad3a7f3-2511-431d-9025-f91e1d3252ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQyMywiaWF0IjoxNzkzMTEzNTIzLCJqdGkiOiJkOTAyYjEyNi1mYjQwLTQ2MjMtYWY4OC0yZDNhYmFkMGVmN2QiLCJzaWQiOiIyYWQzYTdmMy0yNTExLTQzMWQtOTAyNS1mOTFlMWQzMjUyY2EifQ.1lXznqAZYg1N9LN3ne2qKrrjF8mb-be_hGpW4bP_XjY",
  "access_expires_at": "2026-10-27T15:20:23.226115142Z",
  "refresh_token": "cFa5AP7FiGBUhe4MPxicgzkWyTooVMQ9xQBTiSplvg0",
  "refresh_expires_at": "2026-11-26T15:05:23.22548115Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb0920da-ef5c-45e0-9750-bbfbf62d1139",
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
  "last_heartbeat_at": "2026-10-27T15:05:07.50609Z",
  "last_location_at": "2026-10-27T15:05:07.50609Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cb0920da-ef5c-45e0-9750-bbfbf62d1139/handover` → **200**

```json
{
  "command_id": "38e76aed-7205-4af6-af50-d8cfbd4f5bd4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb0920da-ef5c-45e0-9750-bbfbf62d1139",
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
  "last_heartbeat_at": "2026-10-27T15:05:07.50609Z",
  "last_location_at": "2026-10-27T15:05:07.50609Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cb0920da-ef5c-45e0-9750-bbfbf62d1139/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:23Z",
    "sequence": 1793113523312
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb0920da-ef5c-45e0-9750-bbfbf62d1139",
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
  "last_heartbeat_at": "2026-10-27T15:05:23.330836Z",
  "last_location_at": "2026-10-27T15:05:23.330836Z",
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
  "session_id": "de5b2797-5cda-4cb3-b7d6-afecee016f25",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MjMsImlhdCI6MTc5MzExMzUyMywianRpIjoiMzY5MzhlY2QtMjgwOS00MzA2LWFiNjctY2NkNGIzMzljMDU4Iiwic2lkIjoiZGU1YjI3OTctNWNkYS00Y2IzLWI3ZDYtYWZlY2VlMDE2ZjI1In0.-QM5M5IsmRRR1PNh15bM8fGXi1G2_ktyA1fsDs_XlDA",
  "access_expires_at": "2026-10-27T15:20:23.650278821Z",
  "refresh_token": "ZBvLkpEVIudSdeBartbEKcKlMLrlVUU6l6uqxDNHhs4",
  "refresh_expires_at": "2026-10-28T03:05:23.649684514Z",
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
  "session_id": "7d42dd85-8548-4a13-940e-ece2d52b9a28",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MjMsImlhdCI6MTc5MzExMzUyMywianRpIjoiYjUyODAwZWEtNTNiYS00NWRiLWEwNDAtYWZjNDVjODFhODA4Iiwic2lkIjoiN2Q0MmRkODUtODU0OC00YTEzLTk0MGUtZWNlMmQ1MmI5YTI4In0._2xXA8M_3146bJ-Ycx4PSE5Kwl-18yncEBZ8jp-3FpE",
  "access_expires_at": "2026-10-27T15:20:23.970806457Z",
  "refresh_token": "2NId3_qi438ICPxpqueBn9dzsLqugbalHptxVJAPD3w",
  "refresh_expires_at": "2026-10-28T03:05:23.97024465Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e3ed64ae-c74c-4907-8cf4-9e78b1e790b7` → **200**

```json
{
  "id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9d573f44-2c83-4dd9-960c-18be62ec8019",
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
    "id": "2b83dd32-76ac-4c1f-a943-54aefc6856fc",
    "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "da3e601c-ebce-4935-bbcd-134372c17010",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T15:05:22.88734Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e3ed64ae-c74c-4907-8cf4-9e78b1e790b7/interrupt` → **200**

```json
{
  "command_id": "e02e7c9d-9dc0-4b80-8e4e-0267a1d34e54",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "9d573f44-2c83-4dd9-960c-18be62ec8019",
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
      "id": "2b83dd32-76ac-4c1f-a943-54aefc6856fc",
      "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "da3e601c-ebce-4935-bbcd-134372c17010",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T15:05:22.88734Z",
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
    "id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "9d573f44-2c83-4dd9-960c-18be62ec8019",
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
    "id": "d4e3cd87-cefe-4d68-b14d-31a98722c61b",
    "order_id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
    "expires_at": "2026-10-27T15:05:39.059409Z",
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

`POST /api/driver/v1/offers/d4e3cd87-cefe-4d68-b14d-31a98722c61b/accept` → **200**

```json
{
  "command_id": "d8d8c554-e680-484c-89bb-cd47b0904ec7"
}
```

```json
{
  "id": "cf7ffe11-beb5-48fd-806c-26886546d865",
  "order_id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc34da4e-4ed8-4610-9af6-9eeddc5260fa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc34da4e-4ed8-4610-9af6-9eeddc5260fa",
  "order_id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
  "assignment_id": "cf7ffe11-beb5-48fd-806c-26886546d865",
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
  "session_id": "cb0920da-ef5c-45e0-9750-bbfbf62d1139",
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
  "last_heartbeat_at": "2026-10-27T15:05:23.330836Z",
  "last_location_at": "2026-10-27T15:05:23.330836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/cb0920da-ef5c-45e0-9750-bbfbf62d1139/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:24Z",
    "sequence": 1793113524201
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb0920da-ef5c-45e0-9750-bbfbf62d1139",
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
  "last_heartbeat_at": "2026-10-27T15:05:24.222902Z",
  "last_location_at": "2026-10-27T15:05:24.222902Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dc34da4e-4ed8-4610-9af6-9eeddc5260fa/arrive` → **200**

```json
{
  "command_id": "ccdf4e89-fca0-4d34-bda6-46d84ae4ef5a",
  "expected_version": 0
}
```

```json
{
  "id": "dc34da4e-4ed8-4610-9af6-9eeddc5260fa",
  "order_id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
  "assignment_id": "cf7ffe11-beb5-48fd-806c-26886546d865",
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
  "arrived_at": "2026-10-27T15:05:24.262055Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/dc34da4e-4ed8-4610-9af6-9eeddc5260fa/start` → **200**

```json
{
  "command_id": "656d7d3c-f5a9-4e74-8dc2-126bdac4c9e9",
  "expected_version": 1
}
```

```json
{
  "id": "dc34da4e-4ed8-4610-9af6-9eeddc5260fa",
  "order_id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
  "assignment_id": "cf7ffe11-beb5-48fd-806c-26886546d865",
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
  "arrived_at": "2026-10-27T15:05:24.262055Z",
  "started_at": "2026-10-27T15:05:24.304155Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/dc34da4e-4ed8-4610-9af6-9eeddc5260fa/complete` → **200**

```json
{
  "command_id": "c602e734-0029-4e19-b8c9-0582a2b3801d",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:05:24Z"
}
```

```json
{
  "id": "dc34da4e-4ed8-4610-9af6-9eeddc5260fa",
  "order_id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
  "assignment_id": "cf7ffe11-beb5-48fd-806c-26886546d865",
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
  "arrived_at": "2026-10-27T15:05:24.262055Z",
  "started_at": "2026-10-27T15:05:24.304155Z",
  "completed_at": "2026-10-27T15:05:24.349408Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "18a9081f-ec10-45fe-9053-2d4db9c651ff",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:05:24.048673Z",
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
    "id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:05:22.88734Z",
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

`GET /api/operator/v1/orders/e3ed64ae-c74c-4907-8cf4-9e78b1e790b7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:05:22.887925Z",
      "actor": {
        "type": "CLIENT",
        "id": "9d573f44-2c83-4dd9-960c-18be62ec8019",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
        "quote_id": "e13ab9ea-33f1-4b1b-ab4e-f5c228f84dcb",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:05:22.889784Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
        "attempt_id": "7346244f-b139-47da-b65c-aca9b0e35b1d",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:05:22.895603Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "51823413-8f24-4ddd-8af9-f58c2d7a10c4",
        "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:05:22.954463Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "51823413-8f24-4ddd-8af9-f58c2d7a10c4",
        "order_id": "e3ed64ae-c74c-4907-8cf4-9e78b1e790b7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "2b83dd32-76ac-4c1f-a943-54aefc6856fc"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted e3ed64ae-c74c-4907-8cf4-9e78b1e790b7, follow-up 18a9081f-ec10-45fe-9053-2d4db9c651ff.

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
  "session_id": "5d86d285-0561-458c-992c-d2d7f29eda78",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MjcsImlhdCI6MTc5MzExMzUyNywianRpIjoiYWRmZTYxOWItODM0NS00YjEwLTg4YmItZjI2ZGEwZmJiNGExIiwic2lkIjoiNWQ4NmQyODUtMDU2MS00NThjLTk5MmMtZDJkN2YyOWVkYTc4In0.ohEKITI1EgultfdBmkx9G74a-xXj9eSYqKJNtFrkFFI",
  "access_expires_at": "2026-10-27T15:20:27.764125621Z",
  "refresh_token": "ZJX4Prz3UtEsHoqaleEMqZfDmlsBeElplmGBtiCfB5I",
  "refresh_expires_at": "2026-10-28T03:05:27.763491712Z",
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
  "session_id": "ff3b6c88-8dfd-4564-a189-384437b2c262",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MjgsImlhdCI6MTc5MzExMzUyOCwianRpIjoiOGJiNzM3OGEtMmYwZC00OTI3LTgzMTEtZmQ2ZWRlMGE3YTYzIiwic2lkIjoiZmYzYjZjODgtOGRmZC00NTY0LWExODktMzg0NDM3YjJjMjYyIn0.Zdh66khRvVjsojQjquapUzLajCiLdADEK5y2QVl-W5E",
  "access_expires_at": "2026-10-27T15:20:28.081986484Z",
  "refresh_token": "QXppP9JgTMp7bQ9dcouFVt6efigmX5vi0YXIqDLcZuY",
  "refresh_expires_at": "2026-10-28T03:05:28.081401483Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15433"
}
```

```json
{
  "challenge_id": "7f79b690-40f9-48e5-b221-3881de79a45d",
  "expires_at": "2026-10-27T15:10:28.106113116Z",
  "resend_available_at": "2026-10-27T15:05:29.106113116Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "578431",
  "sent_at": "2026-10-27T15:05:28.108353813Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f79b690-40f9-48e5-b221-3881de79a45d",
  "code": "578431",
  "device_ref": "sandbox-15433"
}
```

```json
{
  "session_id": "4605bc4a-7056-45c6-93a9-4656238b4f9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQyOCwiaWF0IjoxNzkzMTEzNTI4LCJqdGkiOiIzY2Q1ODAzYy1iZTM0LTRjNTQtYTMxZC1iYzQ0Y2RkZWY0MDAiLCJzaWQiOiI0NjA1YmM0YS03MDU2LTQ1YzYtOTNhOS00NjU2MjM4YjRmOWQifQ.Sa06bRBYXqNPh4lGAF6HYLtRjJrv1bUJnKbmZ7iYQWw",
  "access_expires_at": "2026-10-27T15:20:28.161729096Z",
  "refresh_token": "XyQFPo0_J1KIAJC_seduWyrWHHAyEUM9qDZumW6NNTs",
  "refresh_expires_at": "2026-11-26T15:05:28.161155316Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:23.142737Z",
  "last_location_at": "2026-10-27T15:05:23.142737Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/handover` → **200**

```json
{
  "command_id": "fe4909dc-447b-48cd-ae94-219e40cd8633",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:23.142737Z",
  "last_location_at": "2026-10-27T15:05:23.142737Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:28Z",
    "sequence": 1793113528244
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:28.263334Z",
  "last_location_at": "2026-10-27T15:05:28.263334Z",
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
  "command_id": "ab10defd-dd6a-4fef-a10a-08c909b58a95",
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
  "effective_at": "2026-10-27T15:05:28.339611Z",
  "changed_by": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T15:05:28.370671957Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0a4b8e83-5861-4aa8-b206-4ef89f0a8ff0",
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
  "id": "85389e95-095e-4f3b-af7b-4b1a33b3c2e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:10:28.412617Z",
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
  "command_id": "bd7a27b0-ea6e-4b16-aefa-fbae0d758b15",
  "quote_id": "85389e95-095e-4f3b-af7b-4b1a33b3c2e4",
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
    "phone": "+3806711121506"
  }
}
```

```json
{
  "id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
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
  "created_at": "2026-10-27T15:05:28.464458Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121506"
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
    "id": "d54bf804-2004-4f0e-9333-5c8d6eeed6dd",
    "order_id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
    "expires_at": "2026-10-27T15:05:43.469172Z",
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

`POST /api/driver/v1/offers/d54bf804-2004-4f0e-9333-5c8d6eeed6dd/accept` → **200**

```json
{
  "command_id": "c7b1d223-2750-4faf-898b-ef45e11fba54"
}
```

```json
{
  "id": "bad685f2-c42b-40cf-b8d1-0ce685fc2d22",
  "order_id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "94e45db4-085f-44f0-8873-bc57a5e9d618",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94e45db4-085f-44f0-8873-bc57a5e9d618",
  "order_id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
  "assignment_id": "bad685f2-c42b-40cf-b8d1-0ce685fc2d22",
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

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:28Z",
    "sequence": 1793113528577
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:28.597449Z",
  "last_location_at": "2026-10-27T15:05:28.597449Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/94e45db4-085f-44f0-8873-bc57a5e9d618/arrive` → **200**

```json
{
  "command_id": "63026b6c-181d-4815-a8ab-4e9c6a4a3d64",
  "expected_version": 0
}
```

```json
{
  "id": "94e45db4-085f-44f0-8873-bc57a5e9d618",
  "order_id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
  "assignment_id": "bad685f2-c42b-40cf-b8d1-0ce685fc2d22",
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
  "arrived_at": "2026-10-27T15:05:28.634509Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/94e45db4-085f-44f0-8873-bc57a5e9d618/start` → **200**

```json
{
  "command_id": "05806358-f817-4be2-872f-1209ec6f3158",
  "expected_version": 1
}
```

```json
{
  "id": "94e45db4-085f-44f0-8873-bc57a5e9d618",
  "order_id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
  "assignment_id": "bad685f2-c42b-40cf-b8d1-0ce685fc2d22",
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
  "arrived_at": "2026-10-27T15:05:28.634509Z",
  "started_at": "2026-10-27T15:05:28.672974Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/94e45db4-085f-44f0-8873-bc57a5e9d618/complete` → **200**

```json
{
  "command_id": "dbb90f78-1644-4ccd-80fc-a3cb42159c6d",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:05:28Z",
  "cash_received": true
}
```

```json
{
  "id": "94e45db4-085f-44f0-8873-bc57a5e9d618",
  "order_id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
  "assignment_id": "bad685f2-c42b-40cf-b8d1-0ce685fc2d22",
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
  "arrived_at": "2026-10-27T15:05:28.634509Z",
  "started_at": "2026-10-27T15:05:28.672974Z",
  "completed_at": "2026-10-27T15:05:28.717212Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0d6d5a27-2560-463b-8a28-f9cb587032f8",
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
  "id": "fea6b348-63b5-41eb-9fee-d8cef1561896",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:10:28.761268Z",
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
  "command_id": "55d98089-4a0c-48c9-a022-833295cd95a6",
  "quote_id": "fea6b348-63b5-41eb-9fee-d8cef1561896",
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
    "phone": "+3806711111493"
  }
}
```

```json
{
  "id": "47dea6b7-63b6-4606-901f-4875ea5d8b7e",
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
  "created_at": "2026-10-27T15:05:28.798553Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111493"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/47dea6b7-63b6-4606-901f-4875ea5d8b7e` → **200**

```json
{
  "id": "47dea6b7-63b6-4606-901f-4875ea5d8b7e",
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
  "created_at": "2026-10-27T15:05:28.798553Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111493"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/47dea6b7-63b6-4606-901f-4875ea5d8b7e/cancel` → **200**

```json
{
  "command_id": "307b1cd4-ef41-4253-9f78-aeccb641e6fb",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "47dea6b7-63b6-4606-901f-4875ea5d8b7e",
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
  "created_at": "2026-10-27T15:05:28.798553Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111493"
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
  "staff_id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T15:05:28.723588Z",
  "last_entries": [
    {
      "order_id": "47dea6b7-63b6-4606-901f-4875ea5d8b7e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T15:05:28.875469Z"
    },
    {
      "order_id": "ce05baf1-8431-4668-9ceb-c2a00dd2766b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T15:05:28.723588Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e9dc6107-aed6-434d-b918-df97d5c07b26",
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
  "last_heartbeat_at": "2026-10-27T15:05:28.597449Z",
  "last_location_at": "2026-10-27T15:05:28.597449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9dc6107-aed6-434d-b918-df97d5c07b26/close` → **200**

```json
{
  "command_id": "69a703d4-c415-46f5-85a2-1eb1a53d075c",
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

Done: operator bonus for fulfilled ce05baf1-8431-4668-9ceb-c2a00dd2766b and operator-fault cancellation 47dea6b7-63b6-4606-901f-4875ea5d8b7e.

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
  "session_id": "2580c231-2302-46f4-9699-6d51224fbf43",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzEsImlhdCI6MTc5MzExMzUzMSwianRpIjoiNzQ1Nzk4YzYtOGRmYi00ZDdjLWI5ZDktYzgzYTRkZDNmMjFjIiwic2lkIjoiMjU4MGMyMzEtMjMwMi00NmY0LTk2OTktNmQ1MTIyNGZiZjQzIn0.UWr3Sca-4uHIiCgEa4-NFqV-nRbICtd-Y0sUj_twQsU",
  "access_expires_at": "2026-10-27T15:20:31.336313929Z",
  "refresh_token": "zAlQrythr0cGmrnE1E_NmCT4mu4A6bVAwZuKzjv4U8M",
  "refresh_expires_at": "2026-10-28T03:05:31.335691669Z",
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
  "command_id": "fd7dcf7d-897a-4cee-b494-828ce3d050c9",
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
  "changed_by": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T15:05:31.405317013Z"
}
```

## The rider books the airport for 2026-10-27T18:05:31Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600157466",
  "device_ref": "sandbox-21158"
}
```

```json
{
  "challenge_id": "edec02b9-566e-428f-8ac0-f18e3165ca09",
  "expires_at": "2026-10-27T15:10:31.437457614Z",
  "resend_available_at": "2026-10-27T15:05:32.437457614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600157466` → **200**

```json
{
  "phone": "+48600157466",
  "audience": "CLIENT",
  "code": "999519",
  "sent_at": "2026-10-27T15:05:31.439661843Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edec02b9-566e-428f-8ac0-f18e3165ca09",
  "code": "999519",
  "device_ref": "sandbox-21158"
}
```

```json
{
  "session_id": "e8ab783f-89c2-43b5-9f6d-1faebe2e2075",
  "subject": {
    "type": "CLIENT",
    "id": "ce06984a-07e4-445e-bd4c-15bc9d764c7a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTA2OTg0YS0wN2U0LTQ0NWUtYmQ0Yy0xNWJjOWQ3NjRjN2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDMxLCJpYXQiOjE3OTMxMTM1MzEsImp0aSI6ImQ5MTk3NGY1LTU0NDAtNGNjZC1iZTBmLWNmM2QyNWI4MzQ1YSIsInNpZCI6ImU4YWI3ODNmLTg5YzItNDNiNS05ZjZkLTFmYWViZTJlMjA3NSJ9.Pv2iTv7XUQNA3MVCp7TtFGXUNzvQBuB8AIt4_CaehzE",
  "access_expires_at": "2026-10-27T15:20:31.493595128Z",
  "refresh_token": "7zA7CPIZt2xadM-5lkuPjvbqIOlYlv3-ckEyuLIYz5M",
  "refresh_expires_at": "2026-11-26T15:05:31.492942662Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "15757d3a-1bb1-475e-beb5-55088f5fbabc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T18:05:31Z"
}
```

```json
{
  "id": "3ba2eb2b-b6da-4ecf-80c3-b1780a1ae3a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T15:10:31.529639Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T18:05:31Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6af6362a-aead-4154-ab7c-1256a2fb69c9",
  "quote_id": "3ba2eb2b-b6da-4ecf-80c3-b1780a1ae3a2",
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
  "pickup_at": "2026-10-27T18:05:31Z"
}
```

```json
{
  "id": "43835b06-2582-42ce-8643-2ae378e144c0",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ce06984a-07e4-445e-bd4c-15bc9d764c7a",
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
  "created_at": "2026-10-27T15:05:31.569684Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T18:05:31Z",
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
  "device_ref": "sandbox-13021"
}
```

```json
{
  "challenge_id": "6354cd4e-39a8-4271-ac49-479d90a5f0b3",
  "expires_at": "2026-10-27T15:10:31.604347029Z",
  "resend_available_at": "2026-10-27T15:05:32.604347029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "508861",
  "sent_at": "2026-10-27T15:05:31.606913974Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6354cd4e-39a8-4271-ac49-479d90a5f0b3",
  "code": "508861",
  "device_ref": "sandbox-13021"
}
```

```json
{
  "session_id": "46309e02-d0c7-443f-994c-71e59e4df6c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQzMSwiaWF0IjoxNzkzMTEzNTMxLCJqdGkiOiJjOTNiZjBjNS0zNjE0LTQzNTktODZhYi1iZDZmM2JmYTAzNGYiLCJzaWQiOiI0NjMwOWUwMi1kMGM3LTQ0M2YtOTk0Yy03MWU1OWU0ZGY2YzQifQ.kjPoa2DWVbX9WUNIZsqIZJ0wM2r0emPfVeMgj9RijEs",
  "access_expires_at": "2026-10-27T15:20:31.661504114Z",
  "refresh_token": "wE8j6XEB75N6foMOIOaFXLyGCv91umOnPaZhYB3qBIw",
  "refresh_expires_at": "2026-11-26T15:05:31.660926267Z",
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
  "command_id": "0c12f17c-eab2-4f8c-a1fd-37f1eb898ad6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:31Z",
    "sequence": 1793113531710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b2f5a026-e075-41cc-b979-72abcf277056",
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
  "last_heartbeat_at": "2026-10-27T15:05:31.728947Z",
  "last_location_at": "2026-10-27T15:05:31.728947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "43835b06-2582-42ce-8643-2ae378e144c0",
      "short_number": 10,
      "pickup_at": "2026-10-27T18:05:31Z",
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

`POST /api/driver/v1/preorders/43835b06-2582-42ce-8643-2ae378e144c0/reserve` → **200**

```json
{
  "command_id": "98355ccf-f0bc-4f66-be20-c4058b3c66c6"
}
```

```json
{
  "id": "ecd9c02b-ad06-46b5-8ce0-364ab712c278",
  "state": "RESERVED",
  "order": {
    "order_id": "43835b06-2582-42ce-8643-2ae378e144c0",
    "short_number": 10,
    "pickup_at": "2026-10-27T18:05:31Z",
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
  "reserved_at": "2026-10-27T15:05:31.796159Z",
  "confirm_from": "2026-10-27T17:35:31Z",
  "confirm_until": "2026-10-27T17:45:31Z",
  "drop_until": "2026-10-27T17:05:31Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ecd9c02b-ad06-46b5-8ce0-364ab712c278",
      "state": "RESERVED",
      "order": {
        "order_id": "43835b06-2582-42ce-8643-2ae378e144c0",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:05:31Z",
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
      "reserved_at": "2026-10-27T15:05:31.796159Z",
      "confirm_from": "2026-10-27T17:35:31Z",
      "confirm_until": "2026-10-27T17:45:31Z",
      "drop_until": "2026-10-27T17:05:31Z"
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
      "id": "ecd9c02b-ad06-46b5-8ce0-364ab712c278",
      "state": "RESERVED",
      "order": {
        "order_id": "43835b06-2582-42ce-8643-2ae378e144c0",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:05:31Z",
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
      "reserved_at": "2026-10-27T15:05:31.796159Z",
      "confirm_from": "2026-10-27T17:35:31Z",
      "confirm_until": "2026-10-27T17:45:31Z",
      "drop_until": "2026-10-27T17:05:31Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ecd9c02b-ad06-46b5-8ce0-364ab712c278/confirm` → **409**

```json
{
  "command_id": "979bc725-5d5c-48d3-939b-6606090ccf93"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ecd9c02b-ad06-46b5-8ce0-364ab712c278/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a2beb798-499f-40d7-a5ee-9fb073c4100a"
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
  "session_id": "d2085bc4-3ff6-4a21-8c6e-034280bf9adc",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzIsImlhdCI6MTc5MzExMzUzMiwianRpIjoiNTUxZDRmYjMtNjZhMS00NDYzLWI1OGEtM2RlNjk5NjIzZTc4Iiwic2lkIjoiZDIwODViYzQtM2ZmNi00YTIxLThjNmUtMDM0MjgwYmY5YWRjIn0.7f2N2iilNvCZ2Ju4UQBMGyVwkyQ4AtB8ICNzjvadXHY",
  "access_expires_at": "2026-10-27T15:20:32.19934016Z",
  "refresh_token": "W55sKH6uVbsZ4Xw3g3T1Mqmuoc6WWsQivIBcMFKLdz4",
  "refresh_expires_at": "2026-10-28T03:05:32.198612854Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/43835b06-2582-42ce-8643-2ae378e144c0` → **200**

```json
{
  "id": "43835b06-2582-42ce-8643-2ae378e144c0",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ce06984a-07e4-445e-bd4c-15bc9d764c7a",
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
  "created_at": "2026-10-27T15:05:31.569684Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T18:05:31Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ecd9c02b-ad06-46b5-8ce0-364ab712c278",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T15:05:31.796159Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/43835b06-2582-42ce-8643-2ae378e144c0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T15:05:31.571377Z",
      "actor": {
        "type": "CLIENT",
        "id": "ce06984a-07e4-445e-bd4c-15bc9d764c7a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "43835b06-2582-42ce-8643-2ae378e144c0",
        "preorder": true,
        "quote_id": "3ba2eb2b-b6da-4ecf-80c3-b1780a1ae3a2",
        "pickup_at": "2026-10-27T18:05:31Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T15:05:31.797331Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "43835b06-2582-42ce-8643-2ae378e144c0",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ecd9c02b-ad06-46b5-8ce0-364ab712c278"
      }
    }
  ]
}
```

Done: pre-order 43835b06-2582-42ce-8643-2ae378e144c0, reservation ecd9c02b-ad06-46b5-8ce0-364ab712c278.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8239"
}
```

```json
{
  "challenge_id": "70019dfa-ee2f-4dfa-bae9-8b19d7707238",
  "expires_at": "2026-10-27T15:10:32.286813234Z",
  "resend_available_at": "2026-10-27T15:05:33.286813234Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "711705",
  "sent_at": "2026-10-27T15:05:32.289082855Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70019dfa-ee2f-4dfa-bae9-8b19d7707238",
  "code": "711705",
  "device_ref": "sandbox-8239"
}
```

```json
{
  "session_id": "5121864f-4fae-4425-86fe-8afcc2318649",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQzMiwiaWF0IjoxNzkzMTEzNTMyLCJqdGkiOiIxN2UwNWFmYy00M2VjLTQwOWQtODczNi1jNDE4ZDk5ZmQ1NTgiLCJzaWQiOiI1MTIxODY0Zi00ZmFlLTQ0MjUtODZmZS04YWZjYzIzMTg2NDkifQ.5wjFlD68O8X3l8kmIpfDe4CzWO38QXEYO9V2iO6njbM",
  "access_expires_at": "2026-10-27T15:20:32.343691607Z",
  "refresh_token": "TN155QhEiDTywxa0GkD-aKsrMKJz79FVEaHw93rt4Bw",
  "refresh_expires_at": "2026-11-26T15:05:32.343101607Z",
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
  "command_id": "1ede2b5d-6a2d-4243-9d46-0fd56f875c0c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:32Z",
    "sequence": 1793113532393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06031785-c224-4261-b41e-fcc92b7300a3",
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
  "last_heartbeat_at": "2026-10-27T15:05:32.411385Z",
  "last_location_at": "2026-10-27T15:05:32.411385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671456979",
  "device_ref": "sandbox-30639"
}
```

```json
{
  "challenge_id": "01b867df-cfc4-44d1-b39e-85294ca2eb94",
  "expires_at": "2026-10-27T15:10:32.442178028Z",
  "resend_available_at": "2026-10-27T15:05:33.442178028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671456979` → **200**

```json
{
  "phone": "+380671456979",
  "audience": "CLIENT",
  "code": "186892",
  "sent_at": "2026-10-27T15:05:32.444494666Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01b867df-cfc4-44d1-b39e-85294ca2eb94",
  "code": "186892",
  "device_ref": "sandbox-30639"
}
```

```json
{
  "session_id": "e2c7d5c3-564f-4d00-ab1a-4967d503998b",
  "subject": {
    "type": "CLIENT",
    "id": "18e1b6bc-91e4-49a6-8683-9367cba9cab3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGUxYjZiYy05MWU0LTQ5YTYtODY4My05MzY3Y2JhOWNhYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDMyLCJpYXQiOjE3OTMxMTM1MzIsImp0aSI6IjliMWZhYWI2LTNmOTYtNDVkMi04Y2QyLTA1OTQxMTg0ODY3MSIsInNpZCI6ImUyYzdkNWMzLTU2NGYtNGQwMC1hYjFhLTQ5NjdkNTAzOTk4YiJ9.ToFbZFc1UrxILrO-4bZqDkn48p76nSPGRRXez6jcAS4",
  "access_expires_at": "2026-10-27T15:20:32.502871372Z",
  "refresh_token": "vGTU9lfEgIDFgj3HJhXCin-vd3tGFeuwQcj_ZdB12Gc",
  "refresh_expires_at": "2026-11-26T15:05:32.50219465Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "07cf2d81-abbe-4ee6-a007-8db3bd036356",
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
  "id": "40e180be-71ad-4587-b30b-36c040f21a8f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:10:32.540611Z",
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
  "command_id": "04eac1d1-79f8-4d3f-a7f2-469eba9cf8b3",
  "quote_id": "40e180be-71ad-4587-b30b-36c040f21a8f",
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
  "id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "18e1b6bc-91e4-49a6-8683-9367cba9cab3",
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
  "created_at": "2026-10-27T15:05:32.574717Z",
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
    "id": "f7f59848-2a9c-4077-99d5-9d1eed80b11c",
    "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
    "expires_at": "2026-10-27T15:05:47.577835Z",
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

`POST /api/driver/v1/offers/f7f59848-2a9c-4077-99d5-9d1eed80b11c/accept` → **200**

```json
{
  "command_id": "0ba333b0-ce25-4b5c-b2fe-c59b40137c68"
}
```

```json
{
  "id": "5ceeb3a8-4413-4fd3-b229-fd4ea689f0f8",
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "737e0e03-b610-4feb-b914-f7589d2ab9ec",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "737e0e03-b610-4feb-b914-f7589d2ab9ec",
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "assignment_id": "5ceeb3a8-4413-4fd3-b229-fd4ea689f0f8",
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

`POST /api/driver/v1/work-sessions/06031785-c224-4261-b41e-fcc92b7300a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:32Z",
    "sequence": 1793113532680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06031785-c224-4261-b41e-fcc92b7300a3",
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
  "last_heartbeat_at": "2026-10-27T15:05:32.698694Z",
  "last_location_at": "2026-10-27T15:05:32.698694Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "737e0e03-b610-4feb-b914-f7589d2ab9ec",
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "assignment_id": "5ceeb3a8-4413-4fd3-b229-fd4ea689f0f8",
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

`POST /api/driver/v1/trips/737e0e03-b610-4feb-b914-f7589d2ab9ec/arrive` → **200**

```json
{
  "command_id": "5bb069d0-8396-4a06-b33e-4439f060d95b",
  "expected_version": 0
}
```

```json
{
  "id": "737e0e03-b610-4feb-b914-f7589d2ab9ec",
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "assignment_id": "5ceeb3a8-4413-4fd3-b229-fd4ea689f0f8",
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
  "arrived_at": "2026-10-27T15:05:32.749872Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/737e0e03-b610-4feb-b914-f7589d2ab9ec/start` → **200**

```json
{
  "command_id": "fc1c71fd-1966-4f4b-a22c-7df31baa9bc0",
  "expected_version": 1
}
```

```json
{
  "id": "737e0e03-b610-4feb-b914-f7589d2ab9ec",
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "assignment_id": "5ceeb3a8-4413-4fd3-b229-fd4ea689f0f8",
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
  "arrived_at": "2026-10-27T15:05:32.749872Z",
  "started_at": "2026-10-27T15:05:32.784471Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/06031785-c224-4261-b41e-fcc92b7300a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:32Z",
    "sequence": 1793113532810
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06031785-c224-4261-b41e-fcc92b7300a3",
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
  "last_heartbeat_at": "2026-10-27T15:05:32.829398Z",
  "last_location_at": "2026-10-27T15:05:32.829398Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/737e0e03-b610-4feb-b914-f7589d2ab9ec/complete` → **200**

```json
{
  "command_id": "a7f0e837-f80c-467a-a56e-c93ef1035813",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:05:32Z",
  "cash_received": true
}
```

```json
{
  "id": "737e0e03-b610-4feb-b914-f7589d2ab9ec",
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "assignment_id": "5ceeb3a8-4413-4fd3-b229-fd4ea689f0f8",
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
  "arrived_at": "2026-10-27T15:05:32.749872Z",
  "started_at": "2026-10-27T15:05:32.784471Z",
  "completed_at": "2026-10-27T15:05:32.862708Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3/rating` → **200**

```json
{
  "command_id": "3b8e02e4-5db2-49fd-88da-c381f54af959",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "score": 5,
  "created_at": "2026-10-27T15:05:32.909961296Z"
}
```

`POST /api/driver/v1/orders/2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3/rating` → **200**

```json
{
  "command_id": "86a366b4-e506-44e4-9b5b-d5685cf12405",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
  "score": 4,
  "created_at": "2026-10-27T15:05:32.946188492Z"
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
  "session_id": "d5cf81d6-d934-4cc6-98c5-7e41e0bf0f47",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzMsImlhdCI6MTc5MzExMzUzMywianRpIjoiNzQ4ZWViMjktMjVlNC00NDVkLThkZDMtNGE1NjYzOWQ4MDEzIiwic2lkIjoiZDVjZjgxZDYtZDkzNC00Y2M2LTk4YzUtN2U0MWUwYmYwZjQ3In0.WCp_WPOAIFOVZBqCX8k4rQTkU5zuWBFfmHeXkuQMVKs",
  "access_expires_at": "2026-10-27T15:20:33.364693287Z",
  "refresh_token": "sHtpW443zPQ-qPt6RLxanDg3Nr_PALwRDyaVTicqcyk",
  "refresh_expires_at": "2026-10-28T03:05:33.36413697Z",
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
  "session_id": "031a7483-2e73-4d81-b0d6-6d88da01ea2f",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzMsImlhdCI6MTc5MzExMzUzMywianRpIjoiZDM5NmYyOTktMDNlOS00ZGFkLTkyZmUtZDc2MmRjOTdlOTVhIiwic2lkIjoiMDMxYTc0ODMtMmU3My00ZDgxLWIwZDYtNmQ4OGRhMDFlYTJmIn0.APigL1iymWk6oHSdAIZLVgyuVmZi39fM0tM5hTC_FT4",
  "access_expires_at": "2026-10-27T15:20:33.682766811Z",
  "refresh_token": "ID5toSXRTr-62h_9y2q61b_7S5z6zKZFLuW0tal4uGg",
  "refresh_expires_at": "2026-10-28T03:05:33.682238877Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
      "author_type": "RIDER",
      "author_id": "18e1b6bc-91e4-49a6-8683-9367cba9cab3",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T15:05:32.909961Z"
    },
    {
      "order_id": "2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "18e1b6bc-91e4-49a6-8683-9367cba9cab3",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T15:05:32.946188Z"
    }
  ]
}
```

Done: ratings for order 2e1e1fb7-53ee-49a5-bb68-1bb61fb040a3.

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
  "session_id": "478fbe43-c004-4004-ba74-54d0e0f782f2",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzQsImlhdCI6MTc5MzExMzUzNCwianRpIjoiNTIzMzg1ZWQtNWRhYi00ODdhLWI0ZjItOGZhZmIwYjg0YjE1Iiwic2lkIjoiNDc4ZmJlNDMtYzAwNC00MDA0LWJhNzQtNTRkMGUwZjc4MmYyIn0.vu3kUCdUGQzT98_NkDBULakcyL_dELiuxNmWb-CIQAk",
  "access_expires_at": "2026-10-27T15:20:34.051613218Z",
  "refresh_token": "rZzQaJi2DFu8hAXv3kiv2Uut4CmHw2ptiXwDnyjFJcg",
  "refresh_expires_at": "2026-10-28T03:05:34.051068012Z",
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
  "command_id": "db3cf5cd-f3c6-42aa-bb9e-475894576365",
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
  "changed_by": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:05:34.128059Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "db3cf5cd-f3c6-42aa-bb9e-475894576365",
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
  "changed_by": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:05:34.128059Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48293841647",
  "device_ref": "sandbox-32072"
}
```

```json
{
  "challenge_id": "eeeb6e0a-b2fd-4895-884e-1d849d726769",
  "expires_at": "2026-10-27T15:10:34.2030662Z",
  "resend_available_at": "2026-10-27T15:05:35.2030662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48293841647` → **200**

```json
{
  "phone": "+48293841647",
  "audience": "CLIENT",
  "code": "513151",
  "sent_at": "2026-10-27T15:05:34.205184612Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eeeb6e0a-b2fd-4895-884e-1d849d726769",
  "code": "513151",
  "device_ref": "sandbox-32072"
}
```

```json
{
  "session_id": "9b125327-695f-4821-9d78-7f1404f4c61c",
  "subject": {
    "type": "CLIENT",
    "id": "e3c4b3b5-8dc6-4be2-90bc-0aa5840e1058"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlM2M0YjNiNS04ZGM2LTRiZTItOTBiYy0wYWE1ODQwZTEwNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDM0LCJpYXQiOjE3OTMxMTM1MzQsImp0aSI6Ijk3NmU4NWIyLTliOTctNGQ1MC04OTFmLTkxMTI5NmE3NGNjNCIsInNpZCI6IjliMTI1MzI3LTY5NWYtNDgyMS05ZDc4LTdmMTQwNGY0YzYxYyJ9.jJWo5AMMVj4aq02JJOdSiX17HXOkag-1SyS-M_SlC2g",
  "access_expires_at": "2026-10-27T15:20:34.257692047Z",
  "refresh_token": "9wOKUGIv-iBZv_9W_ABoPhXQAvdjiTfZoqAIMwNz-RA",
  "refresh_expires_at": "2026-11-26T15:05:34.257146149Z",
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
  "correlation_id": "55c8bbfb-deb7-4416-bc14-4f13df482e62"
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
  "device_ref": "sandbox-625"
}
```

```json
{
  "challenge_id": "dbfcc340-7961-4c4b-9a37-74c3c5ecec18",
  "expires_at": "2026-10-27T15:10:34.339463909Z",
  "resend_available_at": "2026-10-27T15:05:35.339463909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "282471",
  "sent_at": "2026-10-27T15:05:34.34178212Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbfcc340-7961-4c4b-9a37-74c3c5ecec18",
  "code": "282471",
  "device_ref": "sandbox-625"
}
```

```json
{
  "session_id": "2404a43e-9683-4bbb-9ab7-29c6e0660065",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQzNCwiaWF0IjoxNzkzMTEzNTM0LCJqdGkiOiJmNzg5NjQ1My1lODJhLTQwMTYtYTVjYi1lNmEzMjEyMmQwZmMiLCJzaWQiOiIyNDA0YTQzZS05NjgzLTRiYmItOWFiNy0yOWM2ZTA2NjAwNjUifQ.sDCy1pvsnfYow816FwqgsYtsVzNDT3957Lr3moCAJ5M",
  "access_expires_at": "2026-10-27T15:20:34.394132322Z",
  "refresh_token": "F9fV620yZr5LeO3WSsvFvAevoUQrwvoS2wkyl-qumrQ",
  "refresh_expires_at": "2026-11-26T15:05:34.393566257Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b2f5a026-e075-41cc-b979-72abcf277056",
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
  "last_heartbeat_at": "2026-10-27T15:05:31.728947Z",
  "last_location_at": "2026-10-27T15:05:31.728947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2f5a026-e075-41cc-b979-72abcf277056/handover` → **200**

```json
{
  "command_id": "258f7583-bf5b-47f6-bf4b-8e4ecfa12736",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b2f5a026-e075-41cc-b979-72abcf277056",
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
  "last_heartbeat_at": "2026-10-27T15:05:31.728947Z",
  "last_location_at": "2026-10-27T15:05:31.728947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2f5a026-e075-41cc-b979-72abcf277056/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:34Z",
    "sequence": 1793113534476
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b2f5a026-e075-41cc-b979-72abcf277056",
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
  "last_heartbeat_at": "2026-10-27T15:05:34.494642Z",
  "last_location_at": "2026-10-27T15:05:34.494642Z",
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
  "session_id": "b2f5a026-e075-41cc-b979-72abcf277056",
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
  "last_heartbeat_at": "2026-10-27T15:05:34.494642Z",
  "last_location_at": "2026-10-27T15:05:34.494642Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2f5a026-e075-41cc-b979-72abcf277056/close` → **200**

```json
{
  "command_id": "b48609df-99b6-46a3-8aa3-690e1139a19d",
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
  "correlation_id": "d8a935af-bb96-4468-a289-d0caad8c9f9d"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674214564",
  "device_ref": "sandbox-19552"
}
```

```json
{
  "challenge_id": "83687d25-deee-483c-91ba-952a6baaf893",
  "expires_at": "2026-10-27T15:10:34.652478885Z",
  "resend_available_at": "2026-10-27T15:05:35.652478885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674214564` → **200**

```json
{
  "phone": "+380674214564",
  "audience": "CLIENT",
  "code": "690510",
  "sent_at": "2026-10-27T15:05:34.654911031Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83687d25-deee-483c-91ba-952a6baaf893",
  "code": "690510",
  "device_ref": "sandbox-19552"
}
```

```json
{
  "session_id": "90239f76-cb37-4d66-90fe-e255de6aea40",
  "subject": {
    "type": "CLIENT",
    "id": "f80fb569-e2da-40d3-9f05-7b19b69d216c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODBmYjU2OS1lMmRhLTQwZDMtOWYwNS03YjE5YjY5ZDIxNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NDM0LCJpYXQiOjE3OTMxMTM1MzQsImp0aSI6IjhjYjFkYWQyLWZlM2YtNDA4YS1iZjQ5LTc1MWJiYTQ4ZGJiYyIsInNpZCI6IjkwMjM5Zjc2LWNiMzctNGQ2Ni05MGZlLWUyNTVkZTZhZWE0MCJ9.d95vkRFntP_5R3ChdBGQ_-BUf4mYX8m2_UUGghSnlYs",
  "access_expires_at": "2026-10-27T15:20:34.709825344Z",
  "refresh_token": "7KM3undSpV6oxjO-HS4bO55p_Om92fxFaE2TDXHZtCE",
  "refresh_expires_at": "2026-11-26T15:05:34.709266653Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "980f8218-c3d0-497a-a56c-1c21e7e00d28",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "25f65434-7c4d-4002-b29c-06cf8ecaf99b",
  "upload_path": "/api/rider/v1/uploads/25f65434-7c4d-4002-b29c-06cf8ecaf99b",
  "expires_at": "2026-10-27T15:20:34.744738044Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/25f65434-7c4d-4002-b29c-06cf8ecaf99b` → **200**

```json
{
  "file_id": "25f65434-7c4d-4002-b29c-06cf8ecaf99b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "32376c62-406e-418f-bfa3-d1d79535ac6d",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "25f65434-7c4d-4002-b29c-06cf8ecaf99b"
  ]
}
```

```json
{
  "id": "b036c418-1c47-47c2-9564-f18a41c1ca1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:05:34.816133Z",
  "updated_at": "2026-10-27T15:05:34.816133Z",
  "messages": [
    {
      "id": "49c95200-3db1-4902-93ae-222ff5911bb3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:05:34.81783Z",
      "attachments": [
        {
          "file_id": "25f65434-7c4d-4002-b29c-06cf8ecaf99b",
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
  "session_id": "d817a103-9bfd-49e0-8851-b26636f888c2",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzUsImlhdCI6MTc5MzExMzUzNSwianRpIjoiN2U5NGZmY2QtN2E1My00MTVjLWIwZWMtNGUyOTI0NGVmYTE2Iiwic2lkIjoiZDgxN2ExMDMtOWJmZC00OWUwLTg4NTEtYjI2NjM2Zjg4OGMyIn0.nA2bAI4I0_UZ9Pqo3M-eId0AM-IzQ8i2TTKIzKd3kHw",
  "access_expires_at": "2026-10-27T15:20:35.154066012Z",
  "refresh_token": "tlXg3qD6kjvbjcLWREg7ipjyd07fL_LAPNgXFUS1CR8",
  "refresh_expires_at": "2026-10-28T03:05:35.153519103Z",
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
  "session_id": "d980cf90-cd4f-479d-b49c-178f75de2f2d",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzUsImlhdCI6MTc5MzExMzUzNSwianRpIjoiNGJiNGM1NDYtNTJkNi00NGZiLWFmMmUtNTMwYWRkODRmYTcwIiwic2lkIjoiZDk4MGNmOTAtY2Q0Zi00NzlkLWI0OWMtMTc4Zjc1ZGUyZjJkIn0.pUMMj8ohifj2CsPoNC82HjioLvy53_WZ7J8ptKLbgB4",
  "access_expires_at": "2026-10-27T15:20:35.470931826Z",
  "refresh_token": "Cjtgx__MwNTg3asGU3KPwhKYoA1orDPBcNDmzxsJMLU",
  "refresh_expires_at": "2026-10-28T03:05:35.470318797Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b036c418-1c47-47c2-9564-f18a41c1ca1e/attachments/25f65434-7c4d-4002-b29c-06cf8ecaf99b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "1bf70263-fdb0-42c1-b2c4-47b211e25c9b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "59345760-ac4c-4ef5-94e1-1fc483816903",
  "upload_path": "/api/operator/v1/uploads/59345760-ac4c-4ef5-94e1-1fc483816903",
  "expires_at": "2026-10-27T15:20:35.520144823Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/59345760-ac4c-4ef5-94e1-1fc483816903` → **200**

```json
{
  "file_id": "59345760-ac4c-4ef5-94e1-1fc483816903",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b036c418-1c47-47c2-9564-f18a41c1ca1e` → **200**

```json
{
  "id": "b036c418-1c47-47c2-9564-f18a41c1ca1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:05:34.816133Z",
  "updated_at": "2026-10-27T15:05:34.816133Z",
  "messages": [
    {
      "id": "49c95200-3db1-4902-93ae-222ff5911bb3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:05:34.81783Z",
      "attachments": [
        {
          "file_id": "25f65434-7c4d-4002-b29c-06cf8ecaf99b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b036c418-1c47-47c2-9564-f18a41c1ca1e/comments` → **200**

```json
{
  "command_id": "7750ef55-f44f-4e3f-84f3-8c8b6bae0418",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "59345760-ac4c-4ef5-94e1-1fc483816903"
  ]
}
```

```json
{
  "id": "b036c418-1c47-47c2-9564-f18a41c1ca1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:05:34.816133Z",
  "updated_at": "2026-10-27T15:05:35.628744Z",
  "messages": [
    {
      "id": "49c95200-3db1-4902-93ae-222ff5911bb3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:05:34.81783Z",
      "attachments": [
        {
          "file_id": "25f65434-7c4d-4002-b29c-06cf8ecaf99b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d6373428-ac34-4e31-98c9-b256d16087c6",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:05:35.628331Z",
      "attachments": [
        {
          "file_id": "59345760-ac4c-4ef5-94e1-1fc483816903",
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

`GET /api/rider/v1/support/cases/b036c418-1c47-47c2-9564-f18a41c1ca1e` → **200**

```json
{
  "id": "b036c418-1c47-47c2-9564-f18a41c1ca1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:05:34.816133Z",
  "updated_at": "2026-10-27T15:05:35.628744Z",
  "messages": [
    {
      "id": "49c95200-3db1-4902-93ae-222ff5911bb3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f80fb569-e2da-40d3-9f05-7b19b69d216c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:05:34.81783Z",
      "attachments": [
        {
          "file_id": "25f65434-7c4d-4002-b29c-06cf8ecaf99b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d6373428-ac34-4e31-98c9-b256d16087c6",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:05:35.628331Z",
      "attachments": [
        {
          "file_id": "59345760-ac4c-4ef5-94e1-1fc483816903",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b036c418-1c47-47c2-9564-f18a41c1ca1e/attachments/59345760-ac4c-4ef5-94e1-1fc483816903` → **200**

Done: support case b036c418-1c47-47c2-9564-f18a41c1ca1e, rider attachment 25f65434-7c4d-4002-b29c-06cf8ecaf99b, operator attachment 59345760-ac4c-4ef5-94e1-1fc483816903.

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
  "session_id": "1bd8aca9-65a7-42a5-8d32-dea9b04a12b7",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzYsImlhdCI6MTc5MzExMzUzNiwianRpIjoiMGRiZTMxOGYtY2YyMy00NmRlLWExOGUtNjMxMGYyNTUwYjYwIiwic2lkIjoiMWJkOGFjYTktNjVhNy00MmE1LThkMzItZGVhOWIwNGExMmI3In0.1Leyer-qG13YLbB5_MBu8dK6nyXl9o-EAwHOE1O5k5Q",
  "access_expires_at": "2026-10-27T15:20:36.01238523Z",
  "refresh_token": "If4dZfh2T0sNYVVFuAdQS3sMvzh0dxaylIG3BLyteyQ",
  "refresh_expires_at": "2026-10-28T03:05:36.011641994Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27241"
}
```

```json
{
  "challenge_id": "513c60aa-beef-47f4-80cc-6957dc06ae06",
  "expires_at": "2026-10-27T15:10:36.039458791Z",
  "resend_available_at": "2026-10-27T15:05:37.039458791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "092287",
  "sent_at": "2026-10-27T15:05:36.041702944Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "513c60aa-beef-47f4-80cc-6957dc06ae06",
  "code": "092287",
  "device_ref": "sandbox-27241"
}
```

```json
{
  "session_id": "a2e81ceb-770a-4e87-bfeb-ea181d30a752",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQzNiwiaWF0IjoxNzkzMTEzNTM2LCJqdGkiOiJlNGMzNDdlZS1kNDYyLTQ4ZDAtYWZiMi04YTI0NWI4NmYzN2MiLCJzaWQiOiJhMmU4MWNlYi03NzBhLTRlODctYmZlYi1lYTE4MWQzMGE3NTIifQ.sGfR65L8wR8TKU_CTEcDpIH8H1euXN0ejzUbuE6FmsU",
  "access_expires_at": "2026-10-27T15:20:36.097441804Z",
  "refresh_token": "5xyckhwH1g1QF8mXaScUXYvxLgWdb_Kxj_WO_41SZpY",
  "refresh_expires_at": "2026-11-26T15:05:36.096699421Z",
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
  "command_id": "54f08576-da32-4b1e-998f-8e64d44b6cfc",
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
  "device_ref": "sandbox-30869"
}
```

```json
{
  "challenge_id": "edb2a67d-fe58-496c-9a9e-71f5d449340d",
  "expires_at": "2026-10-27T15:10:36.231128236Z",
  "resend_available_at": "2026-10-27T15:05:37.231128236Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "770944",
  "sent_at": "2026-10-27T15:05:36.23316917Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edb2a67d-fe58-496c-9a9e-71f5d449340d",
  "code": "770944",
  "device_ref": "sandbox-30869"
}
```

```json
{
  "session_id": "3def9688-0f87-49a6-bd40-d0eef9ca1936",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDQzNiwiaWF0IjoxNzkzMTEzNTM2LCJqdGkiOiI1NjU2OGY2YS1lNGI0LTQ0NGItYWE1ZS1hNmNlZmU0ZWE5MDgiLCJzaWQiOiIzZGVmOTY4OC0wZjg3LTQ5YTYtYmQ0MC1kMGVlZjljYTE5MzYifQ.8bZHiLn9MmFVFV_0342u-BBiZL7JhTAgfHnPtJjWNA0",
  "access_expires_at": "2026-10-27T15:20:36.285797101Z",
  "refresh_token": "svAElh4oRGxFQY0jLnx1gnIwdNe8QYuzQYLXsX8zKic",
  "refresh_expires_at": "2026-11-26T15:05:36.285289435Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06031785-c224-4261-b41e-fcc92b7300a3",
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
  "last_heartbeat_at": "2026-10-27T15:05:32.829398Z",
  "last_location_at": "2026-10-27T15:05:32.829398Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06031785-c224-4261-b41e-fcc92b7300a3/handover` → **200**

```json
{
  "command_id": "e15df1f8-2524-491c-b64e-ab49367ea0ba",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06031785-c224-4261-b41e-fcc92b7300a3",
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
  "last_heartbeat_at": "2026-10-27T15:05:32.829398Z",
  "last_location_at": "2026-10-27T15:05:32.829398Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06031785-c224-4261-b41e-fcc92b7300a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:36Z",
    "sequence": 1793113536366
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06031785-c224-4261-b41e-fcc92b7300a3",
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
  "last_heartbeat_at": "2026-10-27T15:05:36.384392Z",
  "last_location_at": "2026-10-27T15:05:36.384392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:10.887817Z",
  "last_location_at": "2026-10-27T15:05:10.887817Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/29698f55-f328-4685-b90b-549d0c231476/handover` → **200**

```json
{
  "command_id": "520ed803-5c81-4fdb-9f53-a3e671e51c4c",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:10.887817Z",
  "last_location_at": "2026-10-27T15:05:10.887817Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/29698f55-f328-4685-b90b-549d0c231476/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:36Z",
    "sequence": 1793113536467
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:36.485192Z",
  "last_location_at": "2026-10-27T15:05:36.485192Z",
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
  "session_id": "46cf6d6c-5aaa-413b-a063-14dcab2d63ec",
  "subject": {
    "type": "STAFF",
    "id": "0dcfaede-07ea-4318-bb1d-4e1b90fdb636"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNmYWVkZS0wN2VhLTQzMTgtYmIxZC00ZTFiOTBmZGI2MzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ0MzYsImlhdCI6MTc5MzExMzUzNiwianRpIjoiZDQ4ZjZmZjUtN2YxNi00NWE3LThlOTItYTBmNmIzYTZlNGUwIiwic2lkIjoiNDZjZjZkNmMtNWFhYS00MTNiLWEwNjMtMTRkY2FiMmQ2M2VjIn0.N5JJ0PQcaTkWohB-tRqBhqIadBHpNP8VRhN9BrQAGO8",
  "access_expires_at": "2026-10-27T15:20:36.803333206Z",
  "refresh_token": "tEF1sY3heFzLO9RldsHR0LG4ZpaJYtUyJzMAX31F6Sc",
  "refresh_expires_at": "2026-10-28T03:05:36.80276664Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7a009e4e-26b0-4b50-9f40-32160b3c1e4b",
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
  "id": "5480448b-5bf7-4d3d-a8c7-15424666babe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:10:36.834918Z",
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
  "command_id": "3e3662cc-f80c-492b-9e71-f4a8cef12f5f",
  "quote_id": "5480448b-5bf7-4d3d-a8c7-15424666babe",
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
  "id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
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
  "created_at": "2026-10-27T15:05:36.86912Z",
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
    "id": "001e23c2-eddd-421d-bb86-b6dcf3bcaca4",
    "order_id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
    "expires_at": "2026-10-27T15:05:51.872617Z",
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

`POST /api/driver/v1/offers/001e23c2-eddd-421d-bb86-b6dcf3bcaca4/accept` → **200**

```json
{
  "command_id": "34ebc177-55f5-414a-aabb-abbe4f1987b6"
}
```

```json
{
  "id": "e1aa999a-00d3-4b42-862c-7b56e3c904a5",
  "order_id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8d739778-9627-4041-a127-419cf3da1bc9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8d739778-9627-4041-a127-419cf3da1bc9",
  "order_id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
  "assignment_id": "e1aa999a-00d3-4b42-862c-7b56e3c904a5",
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

`POST /api/driver/v1/work-sessions/29698f55-f328-4685-b90b-549d0c231476/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:05:36Z",
    "sequence": 1793113537293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:37.020465Z",
  "last_location_at": "2026-10-27T15:05:37.020465Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8d739778-9627-4041-a127-419cf3da1bc9/arrive` → **200**

```json
{
  "command_id": "40716bb2-1394-4db2-8764-213bf6b16017",
  "expected_version": 0
}
```

```json
{
  "id": "8d739778-9627-4041-a127-419cf3da1bc9",
  "order_id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
  "assignment_id": "e1aa999a-00d3-4b42-862c-7b56e3c904a5",
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
  "arrived_at": "2026-10-27T15:05:37.061974Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/8d739778-9627-4041-a127-419cf3da1bc9/start` → **200**

```json
{
  "command_id": "d276d7fe-11b4-4e2b-8164-1e4f9b7c329d",
  "expected_version": 1
}
```

```json
{
  "id": "8d739778-9627-4041-a127-419cf3da1bc9",
  "order_id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
  "assignment_id": "e1aa999a-00d3-4b42-862c-7b56e3c904a5",
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
  "arrived_at": "2026-10-27T15:05:37.061974Z",
  "started_at": "2026-10-27T15:05:37.100358Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/8d739778-9627-4041-a127-419cf3da1bc9/complete` → **200**

```json
{
  "command_id": "47e64777-62f1-43f9-a5af-b23287cc42e4",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:05:37Z",
  "cash_received": true
}
```

```json
{
  "id": "8d739778-9627-4041-a127-419cf3da1bc9",
  "order_id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
  "assignment_id": "e1aa999a-00d3-4b42-862c-7b56e3c904a5",
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
  "arrived_at": "2026-10-27T15:05:37.061974Z",
  "started_at": "2026-10-27T15:05:37.100358Z",
  "completed_at": "2026-10-27T15:05:37.140382Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/9df8b4d9-4c2a-4303-a84e-14f80a232e4a` → **200**

```json
{
  "id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
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
    "id": "e1aa999a-00d3-4b42-862c-7b56e3c904a5",
    "order_id": "9df8b4d9-4c2a-4303-a84e-14f80a232e4a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8d739778-9627-4041-a127-419cf3da1bc9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:05:36.86912Z",
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
  "session_id": "06031785-c224-4261-b41e-fcc92b7300a3",
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
  "last_heartbeat_at": "2026-10-27T15:05:36.384392Z",
  "last_location_at": "2026-10-27T15:05:36.384392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06031785-c224-4261-b41e-fcc92b7300a3/close` → **200**

```json
{
  "command_id": "ed642574-6ef9-4a64-bdc1-4ca77bd524dd",
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
  "session_id": "29698f55-f328-4685-b90b-549d0c231476",
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
  "last_heartbeat_at": "2026-10-27T15:05:37.020465Z",
  "last_location_at": "2026-10-27T15:05:37.020465Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29698f55-f328-4685-b90b-549d0c231476/close` → **200**

```json
{
  "command_id": "9651049f-ccaa-4d6e-a32a-b8452aa35357",
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

Done: terminal order 9df8b4d9-4c2a-4303-a84e-14f80a232e4a by Andrii (5a000000-0000-4000-8000-000000000403).
