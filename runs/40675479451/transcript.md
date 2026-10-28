# Sandbox transcript (2026-10-28T10:52:45Z, a2ff2a3)

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
  "correlation_id": "fdc2984b-f1d7-4c6a-8bad-098850c31d40"
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
  "session_id": "34f7cd88-9d37-47c2-9f9f-798f821034b1",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU2NzAsImlhdCI6MTc5MzE4NDc3MCwianRpIjoiZTRmNjQ0NmYtNjM1OS00YTNlLThhNGMtNzgzZjFmYjcyYjEyIiwic2lkIjoiMzRmN2NkODgtOWQzNy00N2MyLTlmOWYtNzk4ZjgyMTAzNGIxIn0.Yu0nEca-_S-jlIT08GfWqtjX5NYxebwD-V0-Uz0Br1E",
  "access_expires_at": "2026-10-28T11:07:50.249912588Z",
  "refresh_token": "pYrddjkKEMvmECJJYBROcMovj7e7Ibl7tK4T03BPN74",
  "refresh_expires_at": "2026-10-28T22:52:50.248302253Z",
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
  "session_id": "c48de407-44b9-4084-91ed-e59b577e9abb",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU2NzEsImlhdCI6MTc5MzE4NDc3MSwianRpIjoiZmQyYzI4ODYtZTQ4OC00MTQ5LThkYmEtYWE1NTIyZTNlNWJjIiwic2lkIjoiYzQ4ZGU0MDctNDRiOS00MDg0LTkxZWQtZTU5YjU3N2U5YWJiIn0.-ZyDuhTYZbQY_9mtZ1shWbqEQRch-a5t-4UsGNIk2w4",
  "access_expires_at": "2026-10-28T11:07:51.322145315Z",
  "refresh_token": "tVxvGYP6u6ydzk29u6FYTtojsBTahpdnrhhw1I86rbg",
  "refresh_expires_at": "2026-10-28T22:52:51.321525462Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "63628be1-aea5-4373-9a0f-d148dbc1a830",
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
  "id": "a70f89fb-ebe3-432e-979a-daafe5191c21",
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
  "created_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "created_at": "2026-10-28T10:52:51.520078Z",
  "updated_at": "2026-10-28T10:52:51.520078Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635780702",
  "device_ref": "sandbox-25308"
}
```

```json
{
  "challenge_id": "d36aa212-dbb9-493e-9e3e-42f424e18422",
  "expires_at": "2026-10-28T10:57:51.711204442Z",
  "resend_available_at": "2026-10-28T10:52:52.711204442Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635780702` → **200**

```json
{
  "phone": "+380635780702",
  "audience": "CLIENT",
  "code": "151647",
  "sent_at": "2026-10-28T10:52:51.717781396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d36aa212-dbb9-493e-9e3e-42f424e18422",
  "code": "151647",
  "device_ref": "sandbox-25308"
}
```

```json
{
  "session_id": "edd4e05d-9f5e-49a7-9d4d-b111cba40898",
  "subject": {
    "type": "CLIENT",
    "id": "a6e5a529-eb21-477d-9d3f-6c570ee9ff55"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmU1YTUyOS1lYjIxLTQ3N2QtOWQzZi02YzU3MGVlOWZmNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NjcxLCJpYXQiOjE3OTMxODQ3NzEsImp0aSI6IjQ3NTAwNGMyLTYzZjgtNDkyNy04NjdiLTIxNmI5NTkzNjBkYSIsInNpZCI6ImVkZDRlMDVkLTlmNWUtNDlhNy05ZDRkLWIxMTFjYmE0MDg5OCJ9.scNULo9SQerhYCrf6gxlV1AN6gtg8MwI_AHf5w1JB5M",
  "access_expires_at": "2026-10-28T11:07:51.930107505Z",
  "refresh_token": "bJ_M9ISYagxA7gHm_Zt58JXs8HhEec9JMHeOdAAnKxM",
  "refresh_expires_at": "2026-11-27T10:52:51.928873818Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635780702` → **200**

```json
{
  "client_id": "a6e5a529-eb21-477d-9d3f-6c570ee9ff55"
}
```

`POST /api/admin/v1/rider-wallets/a6e5a529-eb21-477d-9d3f-6c570ee9ff55/top-ups` → **201**

```json
{
  "command_id": "2ae29427-c598-4467-9abe-57639a9ae4d5",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "a6e5a529-eb21-477d-9d3f-6c570ee9ff55",
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
      "id": "fc84c414-18b2-436d-9897-0e2569e5cfe3",
      "at": "2026-10-28T10:52:52.294498Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "22392369-0027-4ef6-840d-4c2f63d43bf0",
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
  "id": "d5cf7312-bcfb-4df4-a028-401161f09337",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:57:52.544257Z",
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
      "id": "a70f89fb-ebe3-432e-979a-daafe5191c21",
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
  "device_ref": "sandbox-20048"
}
```

```json
{
  "challenge_id": "dba630aa-9701-4a1b-958f-5b32ebedb732",
  "expires_at": "2026-10-28T10:57:52.744008172Z",
  "resend_available_at": "2026-10-28T10:52:53.744008172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "510553",
  "sent_at": "2026-10-28T10:52:52.747138463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dba630aa-9701-4a1b-958f-5b32ebedb732",
  "code": "510553",
  "device_ref": "sandbox-20048"
}
```

```json
{
  "session_id": "b0ac1039-da54-449c-8841-11f88abb4e7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTY3MiwiaWF0IjoxNzkzMTg0NzcyLCJqdGkiOiIzMzhhMGM4Yy00ODUyLTQyNzktODQyNy0xNDBlMjFmMmNlOTkiLCJzaWQiOiJiMGFjMTAzOS1kYTU0LTQ0OWMtODg0MS0xMWY4OGFiYjRlN2EifQ.8kcdusR8MV6WMwwe7IDHRBYZHRySW4snrPt2MeOqpbE",
  "access_expires_at": "2026-10-28T11:07:52.935094154Z",
  "refresh_token": "QlEphr2La4_lK3LvlakmWB8PFibl1zpYGww2DCAsl10",
  "refresh_expires_at": "2026-11-27T10:52:52.934240275Z",
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
  "command_id": "1c713f8f-3052-4483-9cfa-1d1710823506",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:52:53Z",
    "sequence": 1793184773280
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f98e7cf9-18a1-4055-b538-b4fde3c97cfc",
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
  "last_heartbeat_at": "2026-10-28T10:52:53.319977Z",
  "last_location_at": "2026-10-28T10:52:53.319977Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "506d8033-434d-4a3c-9fc7-0d4f7b5d2429",
  "quote_id": "d5cf7312-bcfb-4df4-a028-401161f09337",
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
  "id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6e5a529-eb21-477d-9d3f-6c570ee9ff55",
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
  "created_at": "2026-10-28T10:52:53.545064Z",
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
  "client_id": "a6e5a529-eb21-477d-9d3f-6c570ee9ff55",
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
      "id": "fc84c414-18b2-436d-9897-0e2569e5cfe3",
      "at": "2026-10-28T10:52:52.294498Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
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
    "id": "b056fae0-7d18-4c0a-aebd-3a1bbdce9688",
    "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
    "expires_at": "2026-10-28T10:53:08.596248Z",
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

`POST /api/driver/v1/offers/b056fae0-7d18-4c0a-aebd-3a1bbdce9688/accept` → **200**

```json
{
  "command_id": "31860512-d2f7-426f-9e53-9aaa9ce8588d"
}
```

```json
{
  "id": "d5fea4a9-b26a-4048-a187-8c7b6fb8ed49",
  "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1cbbb5bf-2da1-40ea-8e1f-7312dcd78477",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1cbbb5bf-2da1-40ea-8e1f-7312dcd78477",
  "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
  "assignment_id": "d5fea4a9-b26a-4048-a187-8c7b6fb8ed49",
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

`POST /api/driver/v1/work-sessions/f98e7cf9-18a1-4055-b538-b4fde3c97cfc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:52:54Z",
    "sequence": 1793184774499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f98e7cf9-18a1-4055-b538-b4fde3c97cfc",
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
  "last_heartbeat_at": "2026-10-28T10:52:54.520833Z",
  "last_location_at": "2026-10-28T10:52:54.520833Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1cbbb5bf-2da1-40ea-8e1f-7312dcd78477/arrive` → **200**

```json
{
  "command_id": "39518728-8801-41a7-b5de-0edba58df992",
  "expected_version": 0
}
```

```json
{
  "id": "1cbbb5bf-2da1-40ea-8e1f-7312dcd78477",
  "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
  "assignment_id": "d5fea4a9-b26a-4048-a187-8c7b6fb8ed49",
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
  "arrived_at": "2026-10-28T10:52:54.706466Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1cbbb5bf-2da1-40ea-8e1f-7312dcd78477/start` → **200**

```json
{
  "command_id": "8a7803f8-4d8d-4d3d-982a-350e13a9469f",
  "expected_version": 1
}
```

```json
{
  "id": "1cbbb5bf-2da1-40ea-8e1f-7312dcd78477",
  "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
  "assignment_id": "d5fea4a9-b26a-4048-a187-8c7b6fb8ed49",
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
  "arrived_at": "2026-10-28T10:52:54.706466Z",
  "started_at": "2026-10-28T10:52:54.891599Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1cbbb5bf-2da1-40ea-8e1f-7312dcd78477/complete` → **200**

```json
{
  "command_id": "ae3afbe3-834d-4684-87f3-262fec147ac3",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:52:55Z",
  "cash_received": true
}
```

```json
{
  "id": "1cbbb5bf-2da1-40ea-8e1f-7312dcd78477",
  "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
  "assignment_id": "d5fea4a9-b26a-4048-a187-8c7b6fb8ed49",
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
  "arrived_at": "2026-10-28T10:52:54.706466Z",
  "started_at": "2026-10-28T10:52:54.891599Z",
  "completed_at": "2026-10-28T10:52:55.09878Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a6e5a529-eb21-477d-9d3f-6c570ee9ff55",
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
      "id": "4b51e37c-b9cf-471a-a1df-b70481883917",
      "at": "2026-10-28T10:52:56.043201Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac"
    },
    {
      "id": "fc84c414-18b2-436d-9897-0e2569e5cfe3",
      "at": "2026-10-28T10:52:52.294498Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/a70f89fb-ebe3-432e-979a-daafe5191c21/archive` → **200**

```json
{
  "command_id": "aa48a1a8-4dde-45dc-9ab9-44d39573ce93",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "a70f89fb-ebe3-432e-979a-daafe5191c21",
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
  "created_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "created_at": "2026-10-28T10:52:51.520078Z",
  "updated_at": "2026-10-28T10:52:58.47078Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f98e7cf9-18a1-4055-b538-b4fde3c97cfc",
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
  "last_heartbeat_at": "2026-10-28T10:52:54.520833Z",
  "last_location_at": "2026-10-28T10:52:54.520833Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f98e7cf9-18a1-4055-b538-b4fde3c97cfc/close` → **200**

```json
{
  "command_id": "33261aaf-9402-4751-8b6a-4e44680186f3",
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

Done: order 5bfe27e4-6038-4486-8cc6-094eb8e734ac.

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
  "session_id": "2ca0c980-9806-409e-905e-2356d4aa38d3",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU2NzksImlhdCI6MTc5MzE4NDc3OSwianRpIjoiOGMzZDY3MjItYmZjOS00Mzg2LWE1MDUtYjFhYmZmODNiMjcwIiwic2lkIjoiMmNhMGM5ODAtOTgwNi00MDllLTkwNWUtMjM1NmQ0YWEzOGQzIn0.AJeNWe4rtqj1VIT91OYVhPVcRBe8iCaUR3X4iWqpqzM",
  "access_expires_at": "2026-10-28T11:07:59.239151194Z",
  "refresh_token": "tTyGJU7VVCmPXY5BTHkW7IiHA2RU_4SNXu8Gdbun-XU",
  "refresh_expires_at": "2026-10-28T22:52:59.238639414Z",
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
  "command_id": "86ef0c60-599e-42ad-a231-90370dbcde44",
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
  "session_id": "de2831f4-6468-49fd-a6bd-d81892cdae19",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU2NzksImlhdCI6MTc5MzE4NDc3OSwianRpIjoiNDgyMGZhODktNjdhMy00OTc2LWEzMmUtYWRmZjIxYWJiYTJiIiwic2lkIjoiZGUyODMxZjQtNjQ2OC00OWZkLWE2YmQtZDgxODkyY2RhZTE5In0.7em0h4EmsmvnUJWF6P79en641oqqFq-QRAHV6T-zSKg",
  "access_expires_at": "2026-10-28T11:07:59.989482722Z",
  "refresh_token": "0crdf6mQqmU9p6oVQ6H2jalhFFEVIX8b_C2XkmaawMU",
  "refresh_expires_at": "2026-10-28T22:52:59.988846615Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1122829963",
    "linkedid": "1730052700.1122829963",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675047401"
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
    "id": "1730052700.1122829963",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "dfae6a49-bef7-41f2-b216-0573a80d899f",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675047401",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:53:00.158837Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:53:00.180833Z",
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
    "id": "1730052600.288014774",
    "linkedid": "1730052600.288014774",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675047401"
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
      "id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675047401",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:53:00.392618Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/07d28e37-29ec-47f6-a0dd-1421167e611e/answer` → **200**

```json
{
  "command_id": "5d6798ad-44ef-4223-b18f-ad76650d1610"
}
```

```json
{
  "id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675047401",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "order_ids": [],
  "started_at": "2026-10-28T10:53:00.392618Z",
  "answered_at": "2026-10-28T10:53:00.601033Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.288014774",
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
    "id": "1730052600.288014774",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675047401",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [],
      "started_at": "2026-10-28T10:53:00.392618Z",
      "answered_at": "2026-10-28T10:53:00.601033Z",
      "ended_at": "2026-10-28T10:53:00.797904Z",
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
      "id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675047401",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [],
      "started_at": "2026-10-28T10:53:00.392618Z",
      "answered_at": "2026-10-28T10:53:00.601033Z",
      "ended_at": "2026-10-28T10:53:00.797904Z",
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
      "id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675047401",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [],
      "started_at": "2026-10-28T10:53:00.392618Z",
      "answered_at": "2026-10-28T10:53:00.601033Z",
      "ended_at": "2026-10-28T10:53:00.797904Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:53:03.905596Z"
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
      "id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675047401",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [],
      "started_at": "2026-10-28T10:53:00.392618Z",
      "answered_at": "2026-10-28T10:53:00.601033Z",
      "ended_at": "2026-10-28T10:53:00.797904Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:53:03.905596Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/07d28e37-29ec-47f6-a0dd-1421167e611e/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/07d28e37-29ec-47f6-a0dd-1421167e611e/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=07d28e37-29ec-47f6-a0dd-1421167e611e` → **200**

```json
{
  "changes": [
    {
      "id": "dadc6abd-f0bc-4f9d-a662-5235ef875860",
      "occurred_at": "2026-10-28T10:53:05.567682Z",
      "actor_type": "STAFF",
      "actor_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"3df7e825-818e-4905-87b3-2e966439f3e6\", \"order_ids\": []}",
      "correlation_id": "7d7c9c27-095d-4d93-a985-4d98ac415778"
    },
    {
      "id": "f0be84a8-e8fa-4466-bfd8-961118698421",
      "occurred_at": "2026-10-28T10:53:05.539825Z",
      "actor_type": "STAFF",
      "actor_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"3df7e825-818e-4905-87b3-2e966439f3e6\", \"order_ids\": []}",
      "correlation_id": "5e6129ef-12e7-42d6-bd59-009578a50ff7"
    }
  ]
}
```

Done: call 07d28e37-29ec-47f6-a0dd-1421167e611e recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632403910",
  "device_ref": "sandbox-14694"
}
```

```json
{
  "challenge_id": "2d476f54-9b6e-4b41-b1c5-7477036e0a20",
  "expires_at": "2026-10-28T10:58:05.789358526Z",
  "resend_available_at": "2026-10-28T10:53:06.789358526Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632403910` → **200**

```json
{
  "phone": "+380632403910",
  "audience": "CLIENT",
  "code": "201205",
  "sent_at": "2026-10-28T10:53:05.792323208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d476f54-9b6e-4b41-b1c5-7477036e0a20",
  "code": "201205",
  "device_ref": "sandbox-14694"
}
```

```json
{
  "session_id": "d9aaf90e-2125-426d-96e6-33a202cc2ba7",
  "subject": {
    "type": "CLIENT",
    "id": "bbd457ae-82e4-4693-a60f-984515dfa9aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYmQ0NTdhZS04MmU0LTQ2OTMtYTYwZi05ODQ1MTVkZmE5YWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1Njg2LCJpYXQiOjE3OTMxODQ3ODYsImp0aSI6IjM5Nzg4OTk1LWMzYTEtNDRmMC04NmU2LTY0ZDgyNDYwYmUzYiIsInNpZCI6ImQ5YWFmOTBlLTIxMjUtNDI2ZC05NmU2LTMzYTIwMmNjMmJhNyJ9.HLAafHfd7dCwNOVRxDTiixPReE-xqlMtpdRDyO59_VY",
  "access_expires_at": "2026-10-28T11:08:06.003779989Z",
  "refresh_token": "IZ8qSfLO3DBSz4cB5uylrFwe5u66j-UpQYEprHPYckA",
  "refresh_expires_at": "2026-11-27T10:53:06.00318906Z",
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
  "device_ref": "sandbox-31648"
}
```

```json
{
  "challenge_id": "3c7243c8-618a-43e1-b69b-e60fec1b5026",
  "expires_at": "2026-10-28T10:58:06.354260175Z",
  "resend_available_at": "2026-10-28T10:53:07.354260175Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "503832",
  "sent_at": "2026-10-28T10:53:06.356986458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c7243c8-618a-43e1-b69b-e60fec1b5026",
  "code": "503832",
  "device_ref": "sandbox-31648"
}
```

```json
{
  "session_id": "fe687455-642d-427a-b934-4a1d9ba9536e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTY4NiwiaWF0IjoxNzkzMTg0Nzg2LCJqdGkiOiI4ZWI0ZWZlNC00ODdiLTRjMzItYWJmYS0yNjBhOGQ5Njk3NDMiLCJzaWQiOiJmZTY4NzQ1NS02NDJkLTQyN2EtYjkzNC00YTFkOWJhOTUzNmUifQ.XbMW6BTbwP0VMflSKWlDLKg-i8BIKDpzL0Cym2c0QGU",
  "access_expires_at": "2026-10-28T11:08:06.553556328Z",
  "refresh_token": "7guAY2AWmXpGfi__5DF9-lWdxkcOL-v7Uz1iyQ5udXs",
  "refresh_expires_at": "2026-11-27T10:53:06.553003201Z",
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
  "session_id": "1f0e3e28-404d-4d49-aab2-2341db4b25e6",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU2ODcsImlhdCI6MTc5MzE4NDc4NywianRpIjoiMjExOWZhMzYtMjQ4MC00ODU4LTgwYjItNDA5YWUzNzZlYzM1Iiwic2lkIjoiMWYwZTNlMjgtNDA0ZC00ZDQ5LWFhYjItMjM0MWRiNGIyNWU2In0.alqTKI5aNJUI9q7iBfD9qI7iLDPQWmTC9oGa7XM8lD4",
  "access_expires_at": "2026-10-28T11:08:07.094384128Z",
  "refresh_token": "95kPhxMcsAAX4rIHGadv4ek4P9pABBblpjTLtQ-w1i8",
  "refresh_expires_at": "2026-10-28T22:53:07.093749503Z",
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
  "session_id": "47094d39-f732-487e-9a44-15d13d6cd3f8",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU2ODcsImlhdCI6MTc5MzE4NDc4NywianRpIjoiMjM0ODNhMTgtZjRhMS00ZTBmLWE0ZGItY2IwYmVlYzJhNDkyIiwic2lkIjoiNDcwOTRkMzktZjczMi00ODdlLTlhNDQtMTVkMTNkNmNkM2Y4In0.h0qcyZCeYxFTmlF869vUMIR0TxJpzZR9oFaHFkARRKw",
  "access_expires_at": "2026-10-28T11:08:07.472047586Z",
  "refresh_token": "ixweMVCqk2zXS0qvVLtMWbFFvMW3SRkfsVaOAmZV-oA",
  "refresh_expires_at": "2026-10-28T22:53:07.471400713Z",
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
  "command_id": "bbcc65a3-dcb5-49c0-b126-14ef4cbf0bfc",
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
  "id": "3ac1be81-37b3-49ba-98fa-858abdc17639",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:58:07.818914Z",
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
  "command_id": "4b2de89e-8c0e-461b-b256-a3df375680a6",
  "quote_id": "3ac1be81-37b3-49ba-98fa-858abdc17639",
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
  "id": "9a305ed4-72dc-4064-8e19-9c3bdfed1496",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bbd457ae-82e4-4693-a60f-984515dfa9aa",
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
  "created_at": "2026-10-28T10:53:08.002096Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/9a305ed4-72dc-4064-8e19-9c3bdfed1496` → **200**

```json
{
  "id": "9a305ed4-72dc-4064-8e19-9c3bdfed1496",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bbd457ae-82e4-4693-a60f-984515dfa9aa",
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
  "created_at": "2026-10-28T10:53:08.002096Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9a305ed4-72dc-4064-8e19-9c3bdfed1496/cancel` → **200**

```json
{
  "command_id": "4dc0181b-16b8-4192-962d-d03cdfa71195",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9a305ed4-72dc-4064-8e19-9c3bdfed1496",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bbd457ae-82e4-4693-a60f-984515dfa9aa",
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
  "created_at": "2026-10-28T10:53:08.002096Z",
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
  "command_id": "005608c8-0a3b-48f9-9b58-995efe24609b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:08Z",
    "sequence": 1793184788730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b6303a70-3b1a-4059-a667-f9dd07f54111",
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
  "last_heartbeat_at": "2026-10-28T10:53:08.747425Z",
  "last_location_at": "2026-10-28T10:53:08.747425Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19096"
}
```

```json
{
  "challenge_id": "dce06cd3-75ef-4a20-9157-3dfa438dcce4",
  "expires_at": "2026-10-28T10:58:08.922689488Z",
  "resend_available_at": "2026-10-28T10:53:09.922689488Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "180914",
  "sent_at": "2026-10-28T10:53:08.992804081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dce06cd3-75ef-4a20-9157-3dfa438dcce4",
  "code": "180914",
  "device_ref": "sandbox-19096"
}
```

```json
{
  "session_id": "1e30f2e1-62e6-4516-9b34-91a5afdc16a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTY4OSwiaWF0IjoxNzkzMTg0Nzg5LCJqdGkiOiIzZjRmYzVkZC03MTI2LTRlZmQtOTExYy0zY2RiZmI2NmYyMGYiLCJzaWQiOiIxZTMwZjJlMS02MmU2LTQ1MTYtOWIzNC05MWE1YWZkYzE2YTEifQ.Hz70C9SkIG9NCiD3flywAL184Az20Dz9ImIC7pb0khE",
  "access_expires_at": "2026-10-28T11:08:09.224477572Z",
  "refresh_token": "JhaGavijCorGse7CrX4yX1-f3BDdQ5meDNEnJWNltgQ",
  "refresh_expires_at": "2026-11-27T10:53:09.223669766Z",
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
  "command_id": "ac78c327-5cfb-4ae0-b7df-28c9c171371e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:09Z",
    "sequence": 1793184789564
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b1aea4e-9f8f-47a5-917d-a11496196e18",
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
  "last_heartbeat_at": "2026-10-28T10:53:09.581125Z",
  "last_location_at": "2026-10-28T10:53:09.581125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d4a8b18-f346-4dfa-8aba-eb17d9e472f9",
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
  "id": "b05eac46-6a11-4d10-9382-d912478bc773",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:58:09.766173Z",
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
  "command_id": "e12535db-d0c1-4971-b790-2c8a01882968",
  "quote_id": "b05eac46-6a11-4d10-9382-d912478bc773",
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
  "id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bbd457ae-82e4-4693-a60f-984515dfa9aa",
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
  "created_at": "2026-10-28T10:53:09.947955Z",
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
    "id": "dfd34a96-58e6-4548-96b3-5df013f5c60e",
    "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
    "expires_at": "2026-10-28T10:53:24.951414Z",
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

`POST /api/driver/v1/offers/dfd34a96-58e6-4548-96b3-5df013f5c60e/accept` → **200**

```json
{
  "command_id": "f0f94a3f-7e85-458f-a616-200338a82ece"
}
```

```json
{
  "id": "f888fe55-03d1-4fb8-8cd5-a35fa2a7e77e",
  "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c5ab9e12-6c1c-4ae9-9d17-57916a045992",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c5ab9e12-6c1c-4ae9-9d17-57916a045992",
  "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "assignment_id": "f888fe55-03d1-4fb8-8cd5-a35fa2a7e77e",
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

`POST /api/driver/v1/trips/c5ab9e12-6c1c-4ae9-9d17-57916a045992/cancel` → **200**

```json
{
  "command_id": "f2c5bc78-9520-4f91-aaf3-876e8e70a40a",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "c5ab9e12-6c1c-4ae9-9d17-57916a045992",
  "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "assignment_id": "f888fe55-03d1-4fb8-8cd5-a35fa2a7e77e",
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

`GET /api/rider/v1/orders/45c4b484-1a28-487f-9c94-d9cd69e70031` → **200**

```json
{
  "id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bbd457ae-82e4-4693-a60f-984515dfa9aa",
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
    "id": "f888fe55-03d1-4fb8-8cd5-a35fa2a7e77e",
    "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c5ab9e12-6c1c-4ae9-9d17-57916a045992",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:53:09.947955Z",
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
    "id": "203ea33b-2b0e-4917-9566-0163f8414c5e",
    "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
    "expires_at": "2026-10-28T10:53:25.673892Z",
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

`POST /api/driver/v1/offers/203ea33b-2b0e-4917-9566-0163f8414c5e/accept` → **200**

```json
{
  "command_id": "0ae980bf-fa4b-4a41-99bf-072e7cb54901"
}
```

```json
{
  "id": "c6ee42f4-2792-434b-9504-de65e91bac38",
  "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00972492-83b2-44fd-b192-bfa27b8194f0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00972492-83b2-44fd-b192-bfa27b8194f0",
  "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "assignment_id": "c6ee42f4-2792-434b-9504-de65e91bac38",
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

`POST /api/driver/v1/trips/00972492-83b2-44fd-b192-bfa27b8194f0/cancel` → **200**

```json
{
  "command_id": "99ef8d1e-2a5b-4d8c-9ccd-d84d05a078e6",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "00972492-83b2-44fd-b192-bfa27b8194f0",
  "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
  "assignment_id": "c6ee42f4-2792-434b-9504-de65e91bac38",
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
    "id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:53:09.947955Z",
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
    "id": "9a305ed4-72dc-4064-8e19-9c3bdfed1496",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:53:08.002096Z",
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

`GET /api/operator/v1/orders/45c4b484-1a28-487f-9c94-d9cd69e70031/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:53:09.948631Z",
      "actor": {
        "type": "CLIENT",
        "id": "bbd457ae-82e4-4693-a60f-984515dfa9aa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
        "quote_id": "b05eac46-6a11-4d10-9382-d912478bc773",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "17e8d58a-31bc-4e68-8ce9-a9a23ed1c31a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:53:09.950538Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
        "attempt_id": "bb68775a-f641-4908-b0ca-0534a95eb9a7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "17e8d58a-31bc-4e68-8ce9-a9a23ed1c31a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:53:09.955957Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dfd34a96-58e6-4548-96b3-5df013f5c60e",
        "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "17e8d58a-31bc-4e68-8ce9-a9a23ed1c31a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:53:10.31131Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "dfd34a96-58e6-4548-96b3-5df013f5c60e",
        "order_id": "45c4b484-1a28-487f-9c94-d9cd69e70031",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f888fe55-03d1-4fb8-8cd5-a35fa2a7e77e"
      },
      "correlation_id": "d322ce58-a5ae-443c-ac4a-c0cb8c8daf29"
```

Done: orders 9a305ed4-72dc-4064-8e19-9c3bdfed1496, 45c4b484-1a28-487f-9c94-d9cd69e70031.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731951418",
  "device_ref": "sandbox-32173"
}
```

```json
{
  "challenge_id": "d953b75f-7650-4a06-97e4-0e9af2999468",
  "expires_at": "2026-10-28T10:58:12.117066699Z",
  "resend_available_at": "2026-10-28T10:53:13.117066699Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731951418` → **200**

```json
{
  "phone": "+380731951418",
  "audience": "CLIENT",
  "code": "055456",
  "sent_at": "2026-10-28T10:53:12.121260171Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d953b75f-7650-4a06-97e4-0e9af2999468",
  "code": "055456",
  "device_ref": "sandbox-32173"
}
```

```json
{
  "session_id": "1786f5c2-40e3-4b09-a192-e9613e02849d",
  "subject": {
    "type": "CLIENT",
    "id": "7a704abd-fd33-4b2b-b6e8-ecc4b8a1d6cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTcwNGFiZC1mZDMzLTRiMmItYjZlOC1lY2M0YjhhMWQ2Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NjkyLCJpYXQiOjE3OTMxODQ3OTIsImp0aSI6IjZmMjQ0MmY4LWRhNTUtNDUwMS1iM2Y4LTFkMDAyMGZlMDg3OCIsInNpZCI6IjE3ODZmNWMyLTQwZTMtNGIwOS1hMTkyLWU5NjEzZTAyODQ5ZCJ9.5E17B69KiX0zC5GxFo6UnnZ_2JayNZ4U9vQAz9q4oDU",
  "access_expires_at": "2026-10-28T11:08:12.3235314Z",
  "refresh_token": "vT-cQnSDmzE2_Pb1v4JJsUymbUGddj823CEci8xvBIM",
  "refresh_expires_at": "2026-11-27T10:53:12.323090311Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "0df38776-79ec-4bde-a12a-801c6f847b39",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "81ef9c7f-e944-4e53-ae7e-72f4f10dab06",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-81ef9c7f-e944-4e53-ae7e-72f4f10dab06",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c159e3c9f44e01a90759725a0e6259cc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=81ef9c7f-e944-4e53-ae7e-72f4f10dab06",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731951418"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=81ef9c7f-e944-4e53-ae7e-72f4f10dab06",
  "expires_at": "2026-10-28T11:23:12.499446Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/81ef9c7f-e944-4e53-ae7e-72f4f10dab06` → **200**

```json
{
  "id": "81ef9c7f-e944-4e53-ae7e-72f4f10dab06",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T11:23:12.499446Z",
  "card": {
    "id": "bc50160b-33d7-40c9-83f6-449e475aa5d4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3032",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:53:12.685285Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "bc50160b-33d7-40c9-83f6-449e475aa5d4",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3032",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:53:12.685285Z"
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
  "device_ref": "sandbox-4828"
}
```

```json
{
  "challenge_id": "5b62e7c9-5852-499f-b752-8ded2ccabde5",
  "expires_at": "2026-10-28T10:58:13.059232796Z",
  "resend_available_at": "2026-10-28T10:53:14.059232796Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "080722",
  "sent_at": "2026-10-28T10:53:13.062030217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b62e7c9-5852-499f-b752-8ded2ccabde5",
  "code": "080722",
  "device_ref": "sandbox-4828"
}
```

```json
{
  "session_id": "f83e221e-17e7-42e5-b568-db4091792587",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTY5MywiaWF0IjoxNzkzMTg0NzkzLCJqdGkiOiJkMDJhNjRlOS0wMDE3LTQ0MTMtYTc1Ny1mMGRiMmVkZmI3NzciLCJzaWQiOiJmODNlMjIxZS0xN2U3LTQyZTUtYjU2OC1kYjQwOTE3OTI1ODcifQ.BnbcVGJlMBONvi2ERQqalYcrXSP8eT-uBdepoQ-mxdE",
  "access_expires_at": "2026-10-28T11:08:13.262051885Z",
  "refresh_token": "c244y61X9iGs1vxa9IevbpsFFrmfcCWdfZ7VgbEc384",
  "refresh_expires_at": "2026-11-27T10:53:13.261665945Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b1aea4e-9f8f-47a5-917d-a11496196e18",
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
  "last_heartbeat_at": "2026-10-28T10:53:09.581125Z",
  "last_location_at": "2026-10-28T10:53:09.581125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b1aea4e-9f8f-47a5-917d-a11496196e18/handover` → **200**

```json
{
  "command_id": "bc88e9e8-023e-4ab6-9d90-cc79d8de63df",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b1aea4e-9f8f-47a5-917d-a11496196e18",
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
  "last_heartbeat_at": "2026-10-28T10:53:09.581125Z",
  "last_location_at": "2026-10-28T10:53:09.581125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b1aea4e-9f8f-47a5-917d-a11496196e18/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:13Z",
    "sequence": 1793184793783
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b1aea4e-9f8f-47a5-917d-a11496196e18",
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
  "last_heartbeat_at": "2026-10-28T10:53:13.800796Z",
  "last_location_at": "2026-10-28T10:53:13.800796Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "02974eb5-4362-41d2-8a99-b065a4e12ea2",
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
  "id": "c017978a-6492-4a8b-a110-b74786eac7df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:58:14.006382Z",
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
  "command_id": "2f166401-66c5-4f90-a24b-552fee9600bc",
  "quote_id": "c017978a-6492-4a8b-a110-b74786eac7df",
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
  "id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7a704abd-fd33-4b2b-b6e8-ecc4b8a1d6cf",
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
  "created_at": "2026-10-28T10:53:14.189791Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd` → **200**

```json
{
  "id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7a704abd-fd33-4b2b-b6e8-ecc4b8a1d6cf",
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
  "created_at": "2026-10-28T10:53:14.189791Z",
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
    "id": "47288109-7b4c-46f1-86ba-96617b5b856a",
    "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
    "expires_at": "2026-10-28T10:53:29.293587Z",
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

`POST /api/driver/v1/offers/47288109-7b4c-46f1-86ba-96617b5b856a/accept` → **200**

```json
{
  "command_id": "68865ccd-988c-405f-9dca-5d749c351f86"
}
```

```json
{
  "id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "assignment_id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
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

`POST /api/driver/v1/work-sessions/9b1aea4e-9f8f-47a5-917d-a11496196e18/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:15Z",
    "sequence": 1793184795948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b1aea4e-9f8f-47a5-917d-a11496196e18",
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
  "last_heartbeat_at": "2026-10-28T10:53:15.115294Z",
  "last_location_at": "2026-10-28T10:53:15.115294Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9d15ae3d-aef0-419f-a82a-c1b9c5df6e94/arrive` → **200**

```json
{
  "command_id": "9aa0dc8e-9e26-421d-956e-b1bdb748ad8b",
  "expected_version": 0
}
```

```json
{
  "id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "assignment_id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
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
  "arrived_at": "2026-10-28T10:53:15.310455Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d15ae3d-aef0-419f-a82a-c1b9c5df6e94/start` → **200**

```json
{
  "command_id": "3e3d4cbe-ac7e-4919-a303-22fa93f2706c",
  "expected_version": 1
}
```

```json
{
  "id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "assignment_id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
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
  "arrived_at": "2026-10-28T10:53:15.310455Z",
  "started_at": "2026-10-28T10:53:15.519545Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d15ae3d-aef0-419f-a82a-c1b9c5df6e94/complete` → **200**

```json
{
  "command_id": "f765ce5a-74d5-4af8-a3d8-ed7bfdd45f71",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:53:15Z"
}
```

```json
{
  "id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "assignment_id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
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
  "arrived_at": "2026-10-28T10:53:15.310455Z",
  "started_at": "2026-10-28T10:53:15.519545Z",
  "completed_at": "2026-10-28T10:53:15.705663Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd` → **200**

```json
{
  "id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7a704abd-fd33-4b2b-b6e8-ecc4b8a1d6cf",
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
    "id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
    "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:53:14.189791Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd` → **200**

```json
{
  "id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7a704abd-fd33-4b2b-b6e8-ecc4b8a1d6cf",
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
    "id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
    "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:53:14.189791Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd` → **200**

```json
{
  "id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7a704abd-fd33-4b2b-b6e8-ecc4b8a1d6cf",
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
    "id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
    "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:53:14.189791Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd` → **200**

```json
{
  "id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7a704abd-fd33-4b2b-b6e8-ecc4b8a1d6cf",
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
    "id": "e75557c3-7d4a-4bce-b3f8-69effe273176",
    "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d15ae3d-aef0-419f-a82a-c1b9c5df6e94",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:53:14.189791Z",
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
      "id": "25d12bd4-ae09-47ae-8199-597e752940d2",
      "at": "2026-10-28T10:53:16.360187Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd/tip` → **200**

```json
{
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
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
  "available_until": "2026-10-29T10:53:15.705663Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd/tip` → **201**

```json
{
  "command_id": "07ddb5a8-583d-4b2f-b44c-57d38ffc6c5c",
  "amount_minor": 2500
}
```

```json
{
  "id": "bdc4b3e3-21b7-44c0-a83c-93b78c96f1c7",
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:53:20.156956Z"
}
```

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd/tip` → **200**

```json
{
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
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
  "available_until": "2026-10-29T10:53:15.705663Z",
  "open": false,
  "tip": {
    "id": "bdc4b3e3-21b7-44c0-a83c-93b78c96f1c7",
    "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T10:53:20.156956Z"
  }
}
```

`GET /api/rider/v1/orders/6a408c4d-f467-43c2-94a7-44253404e2dd/tip` → **200**

```json
{
  "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
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
  "available_until": "2026-10-29T10:53:15.705663Z",
  "open": false,
  "tip": {
    "id": "bdc4b3e3-21b7-44c0-a83c-93b78c96f1c7",
    "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:53:20.156956Z"
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
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "bf4e7f6f-67c7-42ea-a622-a6e1217458ce",
      "at": "2026-10-28T10:53:21.410361Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
      "counterpart_id": null
    },
    {
      "id": "25d12bd4-ae09-47ae-8199-597e752940d2",
      "at": "2026-10-28T10:53:16.360187Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6a408c4d-f467-43c2-94a7-44253404e2dd",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9b1aea4e-9f8f-47a5-917d-a11496196e18",
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
  "last_heartbeat_at": "2026-10-28T10:53:15.115294Z",
  "last_location_at": "2026-10-28T10:53:15.115294Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b1aea4e-9f8f-47a5-917d-a11496196e18/close` → **200**

```json
{
  "command_id": "fd86aca2-c600-4ff6-afe9-5ad1a42b9646",
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

Done: card order 6a408c4d-f467-43c2-94a7-44253404e2dd.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733839405",
  "device_ref": "sandbox-5253"
}
```

```json
{
  "challenge_id": "f37cf231-8050-4eca-98b3-e63eb4f3985f",
  "expires_at": "2026-10-28T10:58:22.261276009Z",
  "resend_available_at": "2026-10-28T10:53:23.261276009Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733839405` → **200**

```json
{
  "phone": "+380733839405",
  "audience": "CLIENT",
  "code": "353066",
  "sent_at": "2026-10-28T10:53:22.265572554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f37cf231-8050-4eca-98b3-e63eb4f3985f",
  "code": "353066",
  "device_ref": "sandbox-5253"
}
```

```json
{
  "session_id": "d5b17759-25ff-44ef-88c1-406dc395226d",
  "subject": {
    "type": "CLIENT",
    "id": "9c07e03a-f667-4bbe-b6f1-8b951691a34c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzA3ZTAzYS1mNjY3LTRiYmUtYjZmMS04Yjk1MTY5MWEzNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzAyLCJpYXQiOjE3OTMxODQ4MDIsImp0aSI6ImViNGVkZWJlLTZlODctNDk0Ni04Njg1LTYyZGUyMjI1OGI0YyIsInNpZCI6ImQ1YjE3NzU5LTI1ZmYtNDRlZi04OGMxLTQwNmRjMzk1MjI2ZCJ9.QWKLaA30Y2P19kixxur2FJwEmT9-QBkAs2T_0t-p_9k",
  "access_expires_at": "2026-10-28T11:08:22.48291143Z",
  "refresh_token": "nbQYIQq-c4k4LfinK8SKid47cYG8JPOP9eK7OD3J2Ko",
  "refresh_expires_at": "2026-11-27T10:53:22.482541343Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "a52f2b6c-008e-4484-9a33-d587a9781d08",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "11db5f71-cf86-432c-b068-7ec8e8275947",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-11db5f71-cf86-432c-b068-7ec8e8275947",
    "orderDate": "1793184802",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "5c2a8301d6d6ffe1fe854ad003fe9019",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=11db5f71-cf86-432c-b068-7ec8e8275947",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733839405"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=11db5f71-cf86-432c-b068-7ec8e8275947",
  "created_at": "2026-10-28T10:53:22.661884Z",
  "expires_at": "2026-10-28T11:23:22.661884Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/11db5f71-cf86-432c-b068-7ec8e8275947` → **200**

```json
{
  "id": "11db5f71-cf86-432c-b068-7ec8e8275947",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:53:22.661884Z",
  "expires_at": "2026-10-28T11:23:22.661884Z",
  "completed_at": "2026-10-28T10:53:22.843903Z",
  "masked_pan": "41****0599",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9c07e03a-f667-4bbe-b6f1-8b951691a34c",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9c07e03a-f667-4bbe-b6f1-8b951691a34c",
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
      "id": "7adddab3-d2b6-4930-a9f2-4884de500f27",
      "at": "2026-10-28T10:53:23.426885Z",
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
  "client_id": "9c07e03a-f667-4bbe-b6f1-8b951691a34c",
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
      "id": "7adddab3-d2b6-4930-a9f2-4884de500f27",
      "at": "2026-10-28T10:53:23.426885Z",
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
  "device_ref": "sandbox-27476"
}
```

```json
{
  "challenge_id": "4551feff-8344-416d-b898-5ffeab1bb001",
  "expires_at": "2026-10-28T10:58:24.609432289Z",
  "resend_available_at": "2026-10-28T10:53:25.609432289Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "418193",
  "sent_at": "2026-10-28T10:53:24.6119113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4551feff-8344-416d-b898-5ffeab1bb001",
  "code": "418193",
  "device_ref": "sandbox-27476"
}
```

```json
{
  "session_id": "d7a6f474-7319-4304-8578-1d7eb4d22f23",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTcwNCwiaWF0IjoxNzkzMTg0ODA0LCJqdGkiOiJmYmYwMDQ4NS1hZDk4LTQyZDUtOGQ4Mi0wNjdmYmFmMjVjOWIiLCJzaWQiOiJkN2E2ZjQ3NC03MzE5LTQzMDQtODU3OC0xZDdlYjRkMjJmMjMifQ.SRm7eAKgOmNUMR2iDdruUPvTStQL2Q4ncm0kG38Qxi0",
  "access_expires_at": "2026-10-28T11:08:24.811163286Z",
  "refresh_token": "6_VtJhhqhu5o56sKi0f7aJyz85jLFGVi_p46tpBelSM",
  "refresh_expires_at": "2026-11-27T10:53:24.810790925Z",
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
  "command_id": "f18245df-7632-406b-a17b-b32f82923c9e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "1f8850f0-129d-4dca-b37f-563bfd89a396",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1f8850f0-129d-4dca-b37f-563bfd89a396",
    "orderDate": "1793184805",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "97e6b60f1137d8c7356eec48f020f8dc",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1f8850f0-129d-4dca-b37f-563bfd89a396",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1f8850f0-129d-4dca-b37f-563bfd89a396",
  "created_at": "2026-10-28T10:53:25.156788Z",
  "expires_at": "2026-10-28T11:23:25.156788Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/1f8850f0-129d-4dca-b37f-563bfd89a396` → **200**

```json
{
  "id": "1f8850f0-129d-4dca-b37f-563bfd89a396",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:53:25.156788Z",
  "expires_at": "2026-10-28T11:23:25.156788Z",
  "completed_at": "2026-10-28T10:53:25.34217Z",
  "masked_pan": "41****9431",
  "failure_reason": null
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
      "id": "aa89ac36-0a43-4837-a925-b9c2bc6d7d3a",
      "at": "2026-10-28T10:53:25.432922Z",
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
  "command_id": "13a7e0dc-a813-401f-85b8-aa7b3bd9d138",
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
  "correlation_id": "5f0c2a7f-adf6-40fc-88c6-f0eb26214146"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676931413",
  "device_ref": "sandbox-17856"
}
```

```json
{
  "challenge_id": "4229a15c-016c-4668-9526-b35138db8c4d",
  "expires_at": "2026-10-28T10:58:25.893151232Z",
  "resend_available_at": "2026-10-28T10:53:26.893151232Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676931413` → **200**

```json
{
  "phone": "+380676931413",
  "audience": "CLIENT",
  "code": "632299",
  "sent_at": "2026-10-28T10:53:25.895197582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4229a15c-016c-4668-9526-b35138db8c4d",
  "code": "632299",
  "device_ref": "sandbox-17856"
}
```

```json
{
  "session_id": "5744948d-e42f-464e-b985-d6f77bbb2180",
  "subject": {
    "type": "CLIENT",
    "id": "75ec042e-827c-42a9-a49b-fc8ff26ba70f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NWVjMDQyZS04MjdjLTQyYTktYTQ5Yi1mYzhmZjI2YmE3MGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzA2LCJpYXQiOjE3OTMxODQ4MDYsImp0aSI6ImU4NmIwM2U5LTBjNzUtNDE2MS05NzU1LTAyMDZmMzA4NmFlNiIsInNpZCI6IjU3NDQ5NDhkLWU0MmYtNDY0ZS1iOTg1LWQ2Zjc3YmJiMjE4MCJ9.fBn0GPSUaezEFO-HVckVvu19xiWcZ8SQdgK85O_Nnag",
  "access_expires_at": "2026-10-28T11:08:26.092552091Z",
  "refresh_token": "w08MaAJFULpq443hW9jPbTpTDSYCKhVQp6YrLfwBEa8",
  "refresh_expires_at": "2026-11-27T10:53:26.092191218Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "75ec042e-827c-42a9-a49b-fc8ff26ba70f",
  "session_id": "5744948d-e42f-464e-b985-d6f77bbb2180",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a3c02bb-32c7-4e4a-b37d-1a232471e0bf",
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
  "id": "6259e49e-79c0-4b7c-9632-e6f09fa0341b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:58:26.433984Z",
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
  "challenge_id": "cba33ee7-f7a0-4d00-80c3-6c39a13960a3",
  "expires_at": "2026-10-28T10:58:28.612488906Z",
  "resend_available_at": "2026-10-28T10:53:29.612488906Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676931413` → **200**

```json
{
  "phone": "+380676931413",
  "audience": "CLIENT",
  "code": "772652",
  "sent_at": "2026-10-28T10:53:28.614146791Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "cab30656-c1aa-47d0-ac79-78ee15a33e97",
  "challenge_id": "cba33ee7-f7a0-4d00-80c3-6c39a13960a3",
  "otp_code": "772652"
}
```

```json
{
  "client_id": "75ec042e-827c-42a9-a49b-fc8ff26ba70f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:53:28.819249393Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "68b12a6c-a6fc-44ab-8912-6e578ee51e99",
  "quote_id": "6259e49e-79c0-4b7c-9632-e6f09fa0341b",
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
  "correlation_id": "4edc809d-393c-499b-b6e6-08ab1faa0aa8"
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
  "session_id": "2f85018d-1bc2-4792-bc79-c9f68de6e27d",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3MDksImlhdCI6MTc5MzE4NDgwOSwianRpIjoiMzRlYWRhMmEtYjNiYS00ZmJjLTlhNDUtMzNjM2Q1ZjkyOGQyIiwic2lkIjoiMmY4NTAxOGQtMWJjMi00NzkyLWJjNzktYzlmNjhkZTZlMjdkIn0.9HNT94qdgdu16CkMSSu3mNNH_TXZa_8pA2B_RM_deek",
  "access_expires_at": "2026-10-28T11:08:29.423158491Z",
  "refresh_token": "S7ErPua8zUZiayLgDnco3lrUxj_bBf-LTqzh3G7T0YA",
  "refresh_expires_at": "2026-10-28T22:53:29.422730667Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "75ec042e-827c-42a9-a49b-fc8ff26ba70f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:53:28.819249Z",
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

`POST /api/admin/v1/client-deletions/75ec042e-827c-42a9-a49b-fc8ff26ba70f/complete` → **200**

```json
{
  "command_id": "8373acd5-69e8-4cfe-909e-8e798703bc7f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "75ec042e-827c-42a9-a49b-fc8ff26ba70f",
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
  "correlation_id": "9d46f278-e038-4813-b279-fe16aa710bfd"
}
```

Done: client 75ec042e-827c-42a9-a49b-fc8ff26ba70f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666437489",
  "device_ref": "sandbox-18105"
}
```

```json
{
  "challenge_id": "ce617af0-dbeb-4534-a695-d393e82552eb",
  "expires_at": "2026-10-28T10:58:30.148919393Z",
  "resend_available_at": "2026-10-28T10:53:31.148919393Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666437489` → **200**

```json
{
  "phone": "+380666437489",
  "audience": "CLIENT",
  "code": "614604",
  "sent_at": "2026-10-28T10:53:30.150955808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce617af0-dbeb-4534-a695-d393e82552eb",
  "code": "614604",
  "device_ref": "sandbox-18105"
}
```

```json
{
  "session_id": "b2ddaf3c-08a1-42e1-af3b-6296cd0a5aba",
  "subject": {
    "type": "CLIENT",
    "id": "a2e5c318-a776-4971-8940-d864539fbab7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMmU1YzMxOC1hNzc2LTQ5NzEtODk0MC1kODY0NTM5ZmJhYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzEwLCJpYXQiOjE3OTMxODQ4MTAsImp0aSI6ImFhMGU4ZTZlLTc2ZDUtNDAyMC1hNTgyLWEwNWIwZTYyN2Q3OCIsInNpZCI6ImIyZGRhZjNjLTA4YTEtNDJlMS1hZjNiLTYyOTZjZDBhNWFiYSJ9.r63WtArKF4CjE5bKBTRagXydQo9yiA8DNCtMJVTWNR0",
  "access_expires_at": "2026-10-28T11:08:30.346228736Z",
  "refresh_token": "NwJ86rFZ1um5nIAmYQX7nyb6LelKJuL5oKaA8DmvM-0",
  "refresh_expires_at": "2026-11-27T10:53:30.345747021Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a2e5c318-a776-4971-8940-d864539fbab7",
  "session_id": "b2ddaf3c-08a1-42e1-af3b-6296cd0a5aba",
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
  "session_id": "4975c404-e7e1-4236-ae55-1bfddadefd1e",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3MTAsImlhdCI6MTc5MzE4NDgxMCwianRpIjoiNzQyYjNhNGMtZmI1MC00ODlmLTg2N2EtMzFjOTcwMDdkOTA5Iiwic2lkIjoiNDk3NWM0MDQtZTdlMS00MjM2LWFlNTUtMWJmZGRhZGVmZDFlIn0.W4Iof5ip4pNj1dKKK0atp8QF58wRTPnomj26wscuUgk",
  "access_expires_at": "2026-10-28T11:08:30.933985695Z",
  "refresh_token": "LPlcMvC-s1DpaHRENH9PQyqcDi8AuiaRZKp0CK_ksZ0",
  "refresh_expires_at": "2026-10-28T22:53:30.933598712Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6437489&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a2e5c318-a776-4971-8940-d864539fbab7",
      "phone": "+380666437489",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:53:30.343659Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a2e5c318-a776-4971-8940-d864539fbab7` → **200**

```json
{
  "client": {
    "id": "a2e5c318-a776-4971-8940-d864539fbab7",
    "phone": "+380666437489",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:53:30.343659Z",
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

`POST /api/admin/v1/clients/a2e5c318-a776-4971-8940-d864539fbab7/block` → **400**

```json
{
  "command_id": "81528998-54c9-4dca-876d-b62a65653e06",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a2e5c318-a776-4971-8940-d864539fbab7/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0f235393-4de9-4824-bb39-322835b3d336",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a2e5c318-a776-4971-8940-d864539fbab7/block` → **200**

```json
{
  "command_id": "7dad61db-fb76-403a-ae6a-941fd1c7017d",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a2e5c318-a776-4971-8940-d864539fbab7",
  "phone": "+380666437489",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:53:30.343659Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:53:31.680562Z",
    "by": "fcb6deba-62d9-420e-bda0-4a37509298a1"
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
  "correlation_id": "f5754672-7e33-4a46-a550-28816a1ba4f7"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666437489",
  "device_ref": "sandbox-18131"
}
```

```json
{
  "challenge_id": "5dcac88a-f6bf-46a6-afa3-228d3fe9f7be",
  "expires_at": "2026-10-28T10:58:34.034924847Z",
  "resend_available_at": "2026-10-28T10:53:35.034924847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666437489` → **200**

```json
{
  "phone": "+380666437489",
  "audience": "CLIENT",
  "code": "970549",
  "sent_at": "2026-10-28T10:53:34.036730124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "5dcac88a-f6bf-46a6-afa3-228d3fe9f7be",
  "code": "970549",
  "device_ref": "sandbox-18131"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "c366175a-9b95-4971-aec1-a6c92cae1d1c"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a2e5c318-a776-4971-8940-d864539fbab7` → **200**

```json
{
  "client": {
    "id": "a2e5c318-a776-4971-8940-d864539fbab7",
    "phone": "+380666437489",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:53:30.343659Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:53:31.680562Z",
      "by": "fcb6deba-62d9-420e-bda0-4a37509298a1"
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

`POST /api/admin/v1/clients/a2e5c318-a776-4971-8940-d864539fbab7/unblock` → **200**

```json
{
  "command_id": "6daa4426-109a-44c1-8ac8-5612ee3c96dd",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a2e5c318-a776-4971-8940-d864539fbab7",
  "phone": "+380666437489",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:53:30.343659Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666437489",
  "device_ref": "sandbox-29742"
}
```

```json
{
  "challenge_id": "debf0ad0-4552-40b4-9e65-769ecf79ed94",
  "expires_at": "2026-10-28T10:58:36.809053776Z",
  "resend_available_at": "2026-10-28T10:53:37.809053776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666437489` → **200**

```json
{
  "phone": "+380666437489",
  "audience": "CLIENT",
  "code": "440735",
  "sent_at": "2026-10-28T10:53:36.811030962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "debf0ad0-4552-40b4-9e65-769ecf79ed94",
  "code": "440735",
  "device_ref": "sandbox-29742"
}
```

```json
{
  "session_id": "96825cbe-7a15-48dd-a95c-98269c9deb40",
  "subject": {
    "type": "CLIENT",
    "id": "a2e5c318-a776-4971-8940-d864539fbab7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMmU1YzMxOC1hNzc2LTQ5NzEtODk0MC1kODY0NTM5ZmJhYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzE3LCJpYXQiOjE3OTMxODQ4MTcsImp0aSI6IjA4MTNlZTNhLTlhMjktNGM2Zi1iMGQzLTk1NDNmNDUyNzhlMyIsInNpZCI6Ijk2ODI1Y2JlLTdhMTUtNDhkZC1hOTVjLTk4MjY5YzlkZWI0MCJ9.rtVihauw_TCsHyABa6UvNnVxaPUjnqNCEWrwKfLXCmI",
  "access_expires_at": "2026-10-28T11:08:37.001852458Z",
  "refresh_token": "HBRR4f1--wAjHCrKKzh1IT5N97wrvhYFnprWKpvDnXY",
  "refresh_expires_at": "2026-11-27T10:53:37.001420087Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a2e5c318-a776-4971-8940-d864539fbab7",
  "session_id": "96825cbe-7a15-48dd-a95c-98269c9deb40",
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
  "phone": "+380665271250",
  "device_ref": "sandbox-27095"
}
```

```json
{
  "challenge_id": "dc69bf7e-4c0b-45c4-a71e-54710dad479b",
  "expires_at": "2026-10-28T10:58:37.360364169Z",
  "resend_available_at": "2026-10-28T10:53:38.360364169Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665271250` → **200**

```json
{
  "phone": "+380665271250",
  "audience": "CLIENT",
  "code": "124498",
  "sent_at": "2026-10-28T10:53:37.362495806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc69bf7e-4c0b-45c4-a71e-54710dad479b",
  "code": "124498",
  "device_ref": "sandbox-27095"
}
```

```json
{
  "session_id": "ad4a9893-2fb2-4f62-a559-c518fbbd3549",
  "subject": {
    "type": "CLIENT",
    "id": "e9400201-e658-463c-8e55-a49865de92d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTQwMDIwMS1lNjU4LTQ2M2MtOGU1NS1hNDk4NjVkZTkyZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzE3LCJpYXQiOjE3OTMxODQ4MTcsImp0aSI6ImQ3MjAzMzdjLWMxMWQtNDViOC1iZjI1LWE0YTFmNTczZGNiYSIsInNpZCI6ImFkNGE5ODkzLTJmYjItNGY2Mi1hNTU5LWM1MThmYmJkMzU0OSJ9.u9SqGtAkK7WrPkkYDP8W3FGvRBWi4t92prUVno30D4A",
  "access_expires_at": "2026-10-28T11:08:37.563664635Z",
  "refresh_token": "lYCBXgjkR-ajylVE1fN3pf4oGwy4fO0gBfuYPZ9sAJ8",
  "refresh_expires_at": "2026-11-27T10:53:37.56323316Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c4823f5-665f-4b1a-8437-509822cf9c43",
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
  "id": "7c86711f-1c1f-4ee5-81f9-633731d8aa59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:58:37.747105Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: d30f85b4-52c7-4fec-bc63-dec44137c150) → **201**

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
  "session_id": "a7bc0945-0ed4-4415-91fa-b6a6377db82a",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3MTgsImlhdCI6MTc5MzE4NDgxOCwianRpIjoiOGI2ZmE3ZmEtZmUyZi00N2FjLThjOTQtZmNkYTFiNTUzMWMzIiwic2lkIjoiYTdiYzA5NDUtMGVkNC00NDE1LTkxZmEtYjZhNjM3N2RiODJhIn0.z5vL369TRURwMiXVlomZE6Lapiuulx31jkssxjaEqZ4",
  "access_expires_at": "2026-10-28T11:08:38.177046082Z",
  "refresh_token": "5J1tu6SwLK1arMWFrHk00M2vjFhlSnWGoPrULyjNAms",
  "refresh_expires_at": "2026-10-28T22:53:38.176675756Z",
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
  "session_id": "5436fa7a-2c69-4476-b384-94484c4e7e35",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3MTgsImlhdCI6MTc5MzE4NDgxOCwianRpIjoiNmNiZWJhZDctOWNiMC00NmE4LWFiNDUtMDVjMTAwNTY2M2EzIiwic2lkIjoiNTQzNmZhN2EtMmM2OS00NDc2LWIzODQtOTQ0ODRjNGU3ZTM1In0.50LFJ8q7RXFz7AVbTo5KjtaipiQH3cwPRtGq-YgjPB4",
  "access_expires_at": "2026-10-28T11:08:38.56041838Z",
  "refresh_token": "PyGqR5gGarc8EXXOsZ5DvcXe2bPS49uvyGZo_hpnMVI",
  "refresh_expires_at": "2026-10-28T22:53:38.559942464Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6fd80977-43ec-42d7-b916-303b4a1db99c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:53:37.932442Z",
      "actor": {
        "type": "CLIENT",
        "id": "e9400201-e658-463c-8e55-a49865de92d5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
        "quote_id": "7c86711f-1c1f-4ee5-81f9-633731d8aa59",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d30f85b4-52c7-4fec-bc63-dec44137c150"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:53:37.933783Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
        "attempt_id": "fbbcb8bc-b2f4-448b-82cf-994235b56265",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d30f85b4-52c7-4fec-bc63-dec44137c150"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:53:37.940979Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
        "attempt_id": "fbbcb8bc-b2f4-448b-82cf-994235b56265"
      },
      "correlation_id": "d30f85b4-52c7-4fec-bc63-dec44137c150"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "fbbcb8bc-b2f4-448b-82cf-994235b56265",
        "generation": 1,
        "started_at": "2026-10-28T10:53:37.933005Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:53:37.940979Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:53:37.934553Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/d30f85b4-52c7-4fec-bc63-dec44137c150` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "6fd80977-43ec-42d7-b916-303b4a1db99c:0",
      "order_id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
      "at": "2026-10-28T10:53:37.932442Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6fd80977-43ec-42d7-b916-303b4a1db99c:1",
      "order_id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
      "at": "2026-10-28T10:53:37.933783Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6fd80977-43ec-42d7-b916-303b4a1db99c:2",
      "order_id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
      "at": "2026-10-28T10:53:37.940979Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/bcef91d7-0b38-465d-8feb-6257885bf7f9` → **200**

```json
{
  "found": []
}
```

Done: request d30f85b4-52c7-4fec-bc63-dec44137c150 — order 6fd80977-43ec-42d7-b916-303b4a1db99c found by its id.

`GET /api/rider/v1/orders/6fd80977-43ec-42d7-b916-303b4a1db99c` → **200**

```json
{
  "id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9400201-e658-463c-8e55-a49865de92d5",
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
  "created_at": "2026-10-28T10:53:37.931907Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/6fd80977-43ec-42d7-b916-303b4a1db99c/cancel` → **200**

```json
{
  "command_id": "76a2c2a1-43ea-4141-8531-f76185ece585",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6fd80977-43ec-42d7-b916-303b4a1db99c",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9400201-e658-463c-8e55-a49865de92d5",
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
  "created_at": "2026-10-28T10:53:37.931907Z",
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
  "phone": "+380633570305",
  "device_ref": "sandbox-29905"
}
```

```json
{
  "challenge_id": "5cab31ac-f0f4-48f0-bef1-52e9c41bbe9e",
  "expires_at": "2026-10-28T10:58:39.663980379Z",
  "resend_available_at": "2026-10-28T10:53:40.663980379Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633570305` → **200**

```json
{
  "phone": "+380633570305",
  "audience": "CLIENT",
  "code": "766711",
  "sent_at": "2026-10-28T10:53:39.666001175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cab31ac-f0f4-48f0-bef1-52e9c41bbe9e",
  "code": "766711",
  "device_ref": "sandbox-29905"
}
```

```json
{
  "session_id": "e425ce15-2c1c-4fe0-a4e9-0e9b48c5b5ab",
  "subject": {
    "type": "CLIENT",
    "id": "e80c2d15-fd94-410d-ba76-aa3b6576b4a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlODBjMmQxNS1mZDk0LTQxMGQtYmE3Ni1hYTNiNjU3NmI0YTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzE5LCJpYXQiOjE3OTMxODQ4MTksImp0aSI6Ijk2ZDlhZjRkLWZhMDYtNDU0Yi1iYmY0LTdkYTE0Y2JjMmZmNSIsInNpZCI6ImU0MjVjZTE1LTJjMWMtNGZlMC1hNGU5LTBlOWI0OGM1YjVhYiJ9.oZsmxDST8H8tzxdMKOxiAEuppJOqeH3mIiSqCe4XKhI",
  "access_expires_at": "2026-10-28T11:08:39.874889671Z",
  "refresh_token": "FKdhHcqElrV5v0HzhYNxvIUMsSHxgCfE-1e0FVSmKRc",
  "refresh_expires_at": "2026-11-27T10:53:39.874460499Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "0f2f7210-8fbc-4e29-aa7d-7a7b45b2b653",
  "expires_at": "2026-10-28T10:58:42.057049086Z",
  "resend_available_at": "2026-10-28T10:53:43.057049086Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633570305` → **200**

```json
{
  "phone": "+380633570305",
  "audience": "CLIENT",
  "code": "588060",
  "sent_at": "2026-10-28T10:53:42.058750636Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "dff44965-5f01-4028-8c89-65daf05d83c0",
  "challenge_id": "0f2f7210-8fbc-4e29-aa7d-7a7b45b2b653",
  "otp_code": "588060"
}
```

```json
{
  "id": "e0ff7dba-da4a-4c62-946e-42e1b750afb7",
  "state": "PENDING",
  "created_at": "2026-10-28T10:53:42.262653Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/e0ff7dba-da4a-4c62-946e-42e1b750afb7` → **200**

```json
{
  "id": "e0ff7dba-da4a-4c62-946e-42e1b750afb7",
  "state": "PENDING",
  "created_at": "2026-10-28T10:53:42.262653Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e0ff7dba-da4a-4c62-946e-42e1b750afb7` → **200**

```json
{
  "id": "e0ff7dba-da4a-4c62-946e-42e1b750afb7",
  "state": "PENDING",
  "created_at": "2026-10-28T10:53:42.262653Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/e0ff7dba-da4a-4c62-946e-42e1b750afb7` → **200**

```json
{
  "id": "e0ff7dba-da4a-4c62-946e-42e1b750afb7",
  "state": "READY",
  "created_at": "2026-10-28T10:53:42.262653Z",
  "ready_at": "2026-10-28T10:53:43.922263Z",
  "expires_at": "2026-11-04T10:53:43.922263Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/e0ff7dba-da4a-4c62-946e-42e1b750afb7/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636032446",
  "device_ref": "sandbox-19164"
}
```

```json
{
  "challenge_id": "2a7e17e7-2f36-4293-b4cd-f9b4587a5164",
  "expires_at": "2026-10-28T10:58:45.011725365Z",
  "resend_available_at": "2026-10-28T10:53:46.011725365Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636032446` → **200**

```json
{
  "phone": "+380636032446",
  "audience": "CLIENT",
  "code": "347218",
  "sent_at": "2026-10-28T10:53:45.013633979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a7e17e7-2f36-4293-b4cd-f9b4587a5164",
  "code": "347218",
  "device_ref": "sandbox-19164"
}
```

```json
{
  "session_id": "a9d52ef7-598c-4704-ba80-57a78f68c59f",
  "subject": {
    "type": "CLIENT",
    "id": "a6ec0d9e-3ce2-429f-8de6-5007c6bdce3c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmVjMGQ5ZS0zY2UyLTQyOWYtOGRlNi01MDA3YzZiZGNlM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzI1LCJpYXQiOjE3OTMxODQ4MjUsImp0aSI6IjRhNGQwNjQxLTVlOTgtNDM5ZS1hMWJmLTk5YmM2ZDBmMzdmNSIsInNpZCI6ImE5ZDUyZWY3LTU5OGMtNDcwNC1iYTgwLTU3YTc4ZjY4YzU5ZiJ9.79HbckMoXkiagMhtA2EYGEzNObLjXFDcSONGA7eLjNE",
  "access_expires_at": "2026-10-28T11:08:45.223622985Z",
  "refresh_token": "cRK7lAVDOUZDNPE2HuE2oxzq-UZkhgE8opdDwg41_5Q",
  "refresh_expires_at": "2026-11-27T10:53:45.223185076Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/e0ff7dba-da4a-4c62-946e-42e1b750afb7/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/e0ff7dba-da4a-4c62-946e-42e1b750afb7/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "86270cb6-550c-439c-b174-261a41594477"
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
  "session_id": "d7f610b2-ac55-453c-b3f6-55e16c27f6a7",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3MjUsImlhdCI6MTc5MzE4NDgyNSwianRpIjoiNmQ2MmQ1NjctY2JhMy00YzM0LWJlMjMtNGU5Yzk0YmVmNjc5Iiwic2lkIjoiZDdmNjEwYjItYWM1NS00NTNjLWIzZjYtNTVlMTZjMjdmNmE3In0.fO4WtpJYNfA6mJ1s0dbefs3sKFeFRKABNcv8LI6A5A4",
  "access_expires_at": "2026-10-28T11:08:45.784888278Z",
  "refresh_token": "KLzCgQ6o8HaMHyJfMVREHJ-5IewMxJCqX5Zrk_4WjJM",
  "refresh_expires_at": "2026-10-28T22:53:45.784439858Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e80c2d15-fd94-410d-ba76-aa3b6576b4a6",
  "session_id": "e425ce15-2c1c-4fe0-a4e9-0e9b48c5b5ab",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e80c2d15-fd94-410d-ba76-aa3b6576b4a6/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "e0ff7dba-da4a-4c62-946e-42e1b750afb7",
      "state": "READY",
      "created_at": "2026-10-28T10:53:42.262653Z",
      "ready_at": "2026-10-28T10:53:43.922263Z",
      "expires_at": "2026-11-04T10:53:43.922263Z",
      "size_bytes": 1029
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
  "device_ref": "sandbox-16150"
}
```

```json
{
  "challenge_id": "eb4b180b-0543-4bef-aa22-f8cdc88fc9e0",
  "expires_at": "2026-10-28T10:58:46.30932367Z",
  "resend_available_at": "2026-10-28T10:53:47.30932367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "654628",
  "sent_at": "2026-10-28T10:53:46.311430771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb4b180b-0543-4bef-aa22-f8cdc88fc9e0",
  "code": "654628",
  "device_ref": "sandbox-16150"
}
```

```json
{
  "session_id": "7a0bf00e-81ab-451e-94a9-051ee46e9bf3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTcyNiwiaWF0IjoxNzkzMTg0ODI2LCJqdGkiOiJlNDY4MDI5Zi1jZGNkLTQ3NjgtYTdhOS1lZWJlMDE0OTI1ZDUiLCJzaWQiOiI3YTBiZjAwZS04MWFiLTQ1MWUtOTRhOS0wNTFlZTQ2ZTliZjMifQ.tESKtrkHHhsYjLxu5KGLbRUgXtf8VAkFUBdSSIv4hB8",
  "access_expires_at": "2026-10-28T11:08:46.509674691Z",
  "refresh_token": "jsBVes3aKJqyKhtxKRUPoVJFfRIDwiac4PQ7E61zAwM",
  "refresh_expires_at": "2026-11-27T10:53:46.509257263Z",
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
  "device_ref": "sandbox-11008"
}
```

```json
{
  "challenge_id": "42bf7b5e-a5f1-42fd-80b5-31b0d8b0210a",
  "expires_at": "2026-10-28T10:58:46.885523099Z",
  "resend_available_at": "2026-10-28T10:53:47.885523099Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "677822",
  "sent_at": "2026-10-28T10:53:46.887398842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42bf7b5e-a5f1-42fd-80b5-31b0d8b0210a",
  "code": "677822",
  "device_ref": "sandbox-11008"
}
```

```json
{
  "session_id": "7c936081-11ee-4495-ad17-c3f6c27064f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTcyNywiaWF0IjoxNzkzMTg0ODI3LCJqdGkiOiIxNmRiMmU1MS00YjNmLTQyZWYtOWQyNi0wOTc2MDMxNDVlODgiLCJzaWQiOiI3YzkzNjA4MS0xMWVlLTQ0OTUtYWQxNy1jM2Y2YzI3MDY0ZjEifQ.gsKamMjRkbPzXYn89Ok5Z_jRl9x2iJ0zThyQcYEUfaI",
  "access_expires_at": "2026-10-28T11:08:47.083121989Z",
  "refresh_token": "p4SDNbQuGMQnacj8QlRWQyDfgu_2ZgMUJjaKEIhhfKk",
  "refresh_expires_at": "2026-11-27T10:53:47.082687946Z",
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
  "command_id": "7530f1dc-0d47-4919-b671-a9a7d3e8f41f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:47Z",
    "sequence": 1793184827426
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "de051f27-05f6-4cc5-b76a-9fb449c3936f",
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
  "last_heartbeat_at": "2026-10-28T10:53:47.442679Z",
  "last_location_at": "2026-10-28T10:53:47.442679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26499"
}
```

```json
{
  "challenge_id": "8eaa368f-77db-498f-94e7-0718a4148290",
  "expires_at": "2026-10-28T10:58:47.626107039Z",
  "resend_available_at": "2026-10-28T10:53:48.626107039Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "579203",
  "sent_at": "2026-10-28T10:53:47.628119137Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8eaa368f-77db-498f-94e7-0718a4148290",
  "code": "579203",
  "device_ref": "sandbox-26499"
}
```

```json
{
  "session_id": "b17adbc0-4052-4f5e-9025-b19892518741",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTcyNywiaWF0IjoxNzkzMTg0ODI3LCJqdGkiOiIyODI3ZjcwOS03NmIyLTRiY2MtYjkwNi00OGQ3YjI3ZDg3MzUiLCJzaWQiOiJiMTdhZGJjMC00MDUyLTRmNWUtOTAyNS1iMTk4OTI1MTg3NDEifQ.ivNDONQdujdZTvylKtmR9W7XmNemqHRyQ4azNdRKUjE",
  "access_expires_at": "2026-10-28T11:08:47.823094073Z",
  "refresh_token": "DM_Rkxe5RwONsdaEOYpcakY57oJEKYQ6VZUOAOnMQGY",
  "refresh_expires_at": "2026-11-27T10:53:47.82272695Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b6303a70-3b1a-4059-a667-f9dd07f54111",
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
  "last_heartbeat_at": "2026-10-28T10:53:08.747425Z",
  "last_location_at": "2026-10-28T10:53:08.747425Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b6303a70-3b1a-4059-a667-f9dd07f54111/handover` → **200**

```json
{
  "command_id": "9990742b-f76b-4d9d-9225-1036678aeaf9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b6303a70-3b1a-4059-a667-f9dd07f54111",
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
  "last_heartbeat_at": "2026-10-28T10:53:08.747425Z",
  "last_location_at": "2026-10-28T10:53:08.747425Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b6303a70-3b1a-4059-a667-f9dd07f54111/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:48Z",
    "sequence": 1793184828343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b6303a70-3b1a-4059-a667-f9dd07f54111",
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
  "last_heartbeat_at": "2026-10-28T10:53:48.360098Z",
  "last_location_at": "2026-10-28T10:53:48.360098Z",
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
  "session_id": "14842848-2e82-4072-9b94-d967a6591195",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3MjgsImlhdCI6MTc5MzE4NDgyOCwianRpIjoiMTJiMjk4NmYtMmFkOS00NWFhLWExYzctNjdiZGU2NjM5OTMzIiwic2lkIjoiMTQ4NDI4NDgtMmU4Mi00MDcyLTliOTQtZDk2N2E2NTkxMTk1In0.Hcr8Il9FSzIGeBUBQIHcThI7M7bpfZ-Upq5VlVKcgbo",
  "access_expires_at": "2026-10-28T11:08:48.751118359Z",
  "refresh_token": "yfSEm2ctHfXDOi279uXGJRKq4tF26FKgjXgetGnqyec",
  "refresh_expires_at": "2026-10-28T22:53:48.750547265Z",
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
  "session_id": "cf975a72-18a7-4758-9283-a91b17ced419",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3MjksImlhdCI6MTc5MzE4NDgyOSwianRpIjoiNjU0N2UwYjMtNGI5ZC00NjdhLWE2ODctZjBiZjdkNDZkN2M2Iiwic2lkIjoiY2Y5NzVhNzItMThhNy00NzU4LTkyODMtYTkxYjE3Y2VkNDE5In0.j18W_t6CkSh0eBGQMI9BkxT7GJDHNezPrZZIpbqog_4",
  "access_expires_at": "2026-10-28T11:08:49.128749849Z",
  "refresh_token": "9Neu6LhLGehi-u5O0-JN6VdC_eU60VzSUp5qdvgF-3A",
  "refresh_expires_at": "2026-10-28T22:53:49.128330478Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680946282",
  "device_ref": "sandbox-7881"
}
```

```json
{
  "challenge_id": "301bfb2f-e08a-4c0f-a006-6376527c9fac",
  "expires_at": "2026-10-28T10:58:49.30342336Z",
  "resend_available_at": "2026-10-28T10:53:50.30342336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380680946282` → **200**

```json
{
  "phone": "+380680946282",
  "audience": "CLIENT",
  "code": "994413",
  "sent_at": "2026-10-28T10:53:49.305295828Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "301bfb2f-e08a-4c0f-a006-6376527c9fac",
  "code": "994413",
  "device_ref": "sandbox-7881"
}
```

```json
{
  "session_id": "6da3c938-b2c9-4dc0-9f03-18889d7c12cd",
  "subject": {
    "type": "CLIENT",
    "id": "678f4b0b-fa74-4734-bb9b-5096d74098e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NzhmNGIwYi1mYTc0LTQ3MzQtYmI5Yi01MDk2ZDc0MDk4ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzI5LCJpYXQiOjE3OTMxODQ4MjksImp0aSI6IjZlYTZiMmQ1LTljZjYtNGMxZi05ZWE0LWE3YWI1Y2NkYWUzYiIsInNpZCI6IjZkYTNjOTM4LWIyYzktNGRjMC05ZjAzLTE4ODg5ZDdjMTJjZCJ9.e6lRewK3wt3SQdxdWkapqWbHuSDDH-9UbPFsy0kXSMg",
  "access_expires_at": "2026-10-28T11:08:49.50164816Z",
  "refresh_token": "W0cy9clEUq_19qFqpRtdm0d3aYCpTOFt8qIznKGgqH4",
  "refresh_expires_at": "2026-11-27T10:53:49.501215023Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "20cf5d8d-bf7a-4161-aed2-a7df0c353017",
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
  "id": "4a024512-d45f-40b2-853d-273953ef2945",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:58:49.681083Z",
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
  "command_id": "825a1767-adcb-45bb-83f7-df4ae8ff1453",
  "quote_id": "4a024512-d45f-40b2-853d-273953ef2945",
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
  "id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "678f4b0b-fa74-4734-bb9b-5096d74098e9",
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
  "created_at": "2026-10-28T10:53:49.867007Z",
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
    "id": "33bce50d-39c8-4125-bb0a-5be7c8535db1",
    "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
    "expires_at": "2026-10-28T10:54:04.870006Z",
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

`POST /api/driver/v1/offers/33bce50d-39c8-4125-bb0a-5be7c8535db1/reject` → **204**

```json
{
  "command_id": "2e83be92-dbc9-494c-adff-1bd18c04aa4e"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c75f563d-8b70-485c-93e0-8edcf3a38fde",
    "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
    "expires_at": "2026-10-28T10:54:05.236057Z",
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

`POST /api/driver/v1/offers/c75f563d-8b70-485c-93e0-8edcf3a38fde/accept` → **200**

```json
{
  "command_id": "402218ec-e813-4a91-b9ae-a69a09095f1b"
}
```

```json
{
  "id": "519635c6-277c-41b9-bc02-c7d85386edc3",
  "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "60e6341c-729f-4347-808f-458150b8ca1b",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/b4308151-646d-4ad8-9ca5-daf0e2a8835e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:53:49.867534Z",
      "actor": {
        "type": "CLIENT",
        "id": "678f4b0b-fa74-4734-bb9b-5096d74098e9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
        "quote_id": "4a024512-d45f-40b2-853d-273953ef2945",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3011dc65-3dea-4b6e-b0a8-023692773ac3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:53:49.869191Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
        "attempt_id": "0144c29c-5896-4282-b106-f597eaa7fce4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3011dc65-3dea-4b6e-b0a8-023692773ac3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:53:49.874863Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "33bce50d-39c8-4125-bb0a-5be7c8535db1",
        "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "3011dc65-3dea-4b6e-b0a8-023692773ac3"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:53:50.235222Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "33bce50d-39c8-4125-bb0a-5be7c8535db1",
        "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e"
      },
      "correlation_id": "ee0341f1-78f3-4908-ab2f-6f846aadf470"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order b4308151-646d-4ad8-9ca5-daf0e2a8835e — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/b4308151-646d-4ad8-9ca5-daf0e2a8835e` → **200**

```json
{
  "id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "678f4b0b-fa74-4734-bb9b-5096d74098e9",
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
    "id": "519635c6-277c-41b9-bc02-c7d85386edc3",
    "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "60e6341c-729f-4347-808f-458150b8ca1b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:53:49.867007Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b4308151-646d-4ad8-9ca5-daf0e2a8835e/cancel` → **200**

```json
{
  "command_id": "0ae0253d-6a5e-4d6a-ac9b-e489e467b234",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "678f4b0b-fa74-4734-bb9b-5096d74098e9",
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
    "id": "519635c6-277c-41b9-bc02-c7d85386edc3",
    "order_id": "b4308151-646d-4ad8-9ca5-daf0e2a8835e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "60e6341c-729f-4347-808f-458150b8ca1b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:53:49.867007Z",
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
  "session_id": "de051f27-05f6-4cc5-b76a-9fb449c3936f",
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
  "last_heartbeat_at": "2026-10-28T10:53:47.442679Z",
  "last_location_at": "2026-10-28T10:53:47.442679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/de051f27-05f6-4cc5-b76a-9fb449c3936f/close` → **200**

```json
{
  "command_id": "4f231124-e0bd-45a1-b218-1d2cf6e3e548",
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
  "session_id": "b6303a70-3b1a-4059-a667-f9dd07f54111",
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
  "last_heartbeat_at": "2026-10-28T10:53:48.360098Z",
  "last_location_at": "2026-10-28T10:53:48.360098Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6303a70-3b1a-4059-a667-f9dd07f54111/close` → **200**

```json
{
  "command_id": "21120f78-7dd1-4f72-92e3-80e201242758",
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
  "device_ref": "sandbox-29122"
}
```

```json
{
  "challenge_id": "c146233e-770a-4d90-b7b5-df583ab1b1f4",
  "expires_at": "2026-10-28T10:58:52.142676826Z",
  "resend_available_at": "2026-10-28T10:53:53.142676826Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "308631",
  "sent_at": "2026-10-28T10:53:52.144553811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c146233e-770a-4d90-b7b5-df583ab1b1f4",
  "code": "308631",
  "device_ref": "sandbox-29122"
}
```

```json
{
  "session_id": "751e1935-518a-44f6-826e-2f51d8ca919b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTczMiwiaWF0IjoxNzkzMTg0ODMyLCJqdGkiOiI4OTBmNmQ5Yi01ODQ3LTRiNjktOWUyZi1mNTQ2MGVmMGIyMTUiLCJzaWQiOiI3NTFlMTkzNS01MThhLTQ0ZjYtODI2ZS0yZjUxZDhjYTkxOWIifQ.zsfs-_voRbyHJBxi6PL-28iPgVsyCTCa4Xk-nnWuN10",
  "access_expires_at": "2026-10-28T11:08:52.357570577Z",
  "refresh_token": "4eA_GIeuLXwNn04nGO36aMEFdZNcmFF8DOEB_bxiYD0",
  "refresh_expires_at": "2026-11-27T10:53:52.357139208Z",
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
  "command_id": "959d97a1-0a8a-4eb6-a078-a6d67be91a52",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:52Z",
    "sequence": 1793184832700
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:53:52.715649Z",
  "last_location_at": "2026-10-28T10:53:52.715649Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677852780",
  "device_ref": "sandbox-19046"
}
```

```json
{
  "challenge_id": "6e25ed7c-787e-4e83-9463-e0ce3db3ec41",
  "expires_at": "2026-10-28T10:58:52.891709298Z",
  "resend_available_at": "2026-10-28T10:53:53.891709298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677852780` → **200**

```json
{
  "phone": "+380677852780",
  "audience": "CLIENT",
  "code": "550390",
  "sent_at": "2026-10-28T10:53:52.893579773Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e25ed7c-787e-4e83-9463-e0ce3db3ec41",
  "code": "550390",
  "device_ref": "sandbox-19046"
}
```

```json
{
  "session_id": "59e160c2-b54f-4b21-b3c3-94d71b0719bb",
  "subject": {
    "type": "CLIENT",
    "id": "bce8e14e-667d-4c0b-a272-a900c552c0b1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiY2U4ZTE0ZS02NjdkLTRjMGItYTI3Mi1hOTAwYzU1MmMwYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzMzLCJpYXQiOjE3OTMxODQ4MzMsImp0aSI6ImIxODdlN2VjLTU4ZjAtNDdiNy1iZTEyLTdiOGM3MWJhMDRmMiIsInNpZCI6IjU5ZTE2MGMyLWI1NGYtNGIyMS1iM2MzLTk0ZDcxYjA3MTliYiJ9.Rit0NOB5sLg1jCmKdMDTbWnSBc2j05poXT41j8MWRVc",
  "access_expires_at": "2026-10-28T11:08:53.084262603Z",
  "refresh_token": "115PpNMYiMqii3tkgQqqDZN58xAtwvxhOjqEdpWujs0",
  "refresh_expires_at": "2026-11-27T10:53:53.083773546Z",
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
  "command_id": "1841c6b1-9fe4-4a5e-af05-4088cc7279d7",
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
  "id": "9a16cfd1-889f-4b69-b939-967b6c09d234",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:58:53.434935Z",
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
  "command_id": "cfbf76f7-cb4b-46e9-98fb-6b5cc849aa49",
  "platform": "ANDROID",
  "token": "sandbox-driver-5fb2ba94-8326-419a-a9a2-35ce5e4ff4ee"
}
```

```json
{
  "id": "07d5124d-1634-4cf1-91ea-4798cb1cf38d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:53:53.633851Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "3014e895-a017-40a5-a0a0-e15b6d6e7109",
  "platform": "ANDROID",
  "token": "sandbox-rider-7e3a51d9-d7e7-49d2-9baf-b2b8a7bcfcbb"
}
```

```json
{
  "id": "0fac96b8-ec35-46aa-ab40-967092f67998",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:53:53.83271Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b05f9310-8563-4097-992c-c9382e5a686a",
  "quote_id": "9a16cfd1-889f-4b69-b939-967b6c09d234",
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
  "id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bce8e14e-667d-4c0b-a272-a900c552c0b1",
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
  "created_at": "2026-10-28T10:53:54.021601Z",
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
    "id": "bb15b408-bc6e-485e-aca2-43d893effbe6",
    "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
    "expires_at": "2026-10-28T10:54:09.024001Z",
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

`POST /api/driver/v1/offers/bb15b408-bc6e-485e-aca2-43d893effbe6/accept` → **200**

```json
{
  "command_id": "338ddd09-8041-457d-a4fd-30f5b9de11da"
}
```

```json
{
  "id": "f312f388-58bf-4434-9372-9f6f16345e3b",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:53:54.711Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:53:54.711Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:53:55.089130339Z",
    "token_suffix": "4ff4ee",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
      "order_version": "2",
      "event_id": "0a73cd5a-88ea-4041-a403-ae68f8cff1a4"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677852780&after=2026-10-28T10:53:54.711Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:53:55.087103338Z",
    "token_suffix": "bcfcbb",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
      "order_version": "3",
      "event_id": "8b977640-2ddf-453b-91de-0250be7515b1"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/74448da8-752b-4036-b7f9-7b06bf802334/messages` → **201**

```json
{
  "command_id": "7d856253-7244-4dfa-8d52-36f2d776353b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "5efc432f-741e-4f40-b2fc-74850689adbf",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:53:55.633875802Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "assignment_id": "f312f388-58bf-4434-9372-9f6f16345e3b",
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

`POST /api/driver/v1/trips/b2b2abce-af19-46b9-aade-c554ccfe7fa7/messages` → **201**

```json
{
  "command_id": "97cee43e-6bc8-421d-9c25-62fde6a9a20a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1a50a55f-1003-44af-92a6-4d666aa74daa",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:53:55.98288373Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/74448da8-752b-4036-b7f9-7b06bf802334/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b2b2abce-af19-46b9-aade-c554ccfe7fa7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677852780"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:56Z",
    "sequence": 1793184836505
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:53:56.522049Z",
  "last_location_at": "2026-10-28T10:53:56.522049Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "assignment_id": "f312f388-58bf-4434-9372-9f6f16345e3b",
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

`POST /api/driver/v1/trips/b2b2abce-af19-46b9-aade-c554ccfe7fa7/arrive` → **200**

```json
{
  "command_id": "09743046-aa1a-4626-b111-06f3d3ac7c20",
  "expected_version": 0
}
```

```json
{
  "id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "assignment_id": "f312f388-58bf-4434-9372-9f6f16345e3b",
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
  "arrived_at": "2026-10-28T10:53:56.87095Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b2b2abce-af19-46b9-aade-c554ccfe7fa7/start` → **200**

```json
{
  "command_id": "e9d7ec5f-aa6a-4ded-abfe-587ec4bcc14e",
  "expected_version": 1
}
```

```json
{
  "id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "assignment_id": "f312f388-58bf-4434-9372-9f6f16345e3b",
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
  "arrived_at": "2026-10-28T10:53:56.87095Z",
  "started_at": "2026-10-28T10:53:57.056946Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:53:57Z",
    "sequence": 1793184837231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:53:57.247544Z",
  "last_location_at": "2026-10-28T10:53:57.247544Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b2b2abce-af19-46b9-aade-c554ccfe7fa7/complete` → **200**

```json
{
  "command_id": "c7e61fc9-ac90-4fae-a176-0ffa6b060539",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:53:57Z",
  "cash_received": true
}
```

```json
{
  "id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "assignment_id": "f312f388-58bf-4434-9372-9f6f16345e3b",
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
  "arrived_at": "2026-10-28T10:53:56.87095Z",
  "started_at": "2026-10-28T10:53:57.056946Z",
  "completed_at": "2026-10-28T10:53:57.432772Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/74448da8-752b-4036-b7f9-7b06bf802334` → **200**

```json
{
  "id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bce8e14e-667d-4c0b-a272-a900c552c0b1",
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
    "id": "f312f388-58bf-4434-9372-9f6f16345e3b",
    "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:53:54.021601Z",
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
    "id": "74448da8-752b-4036-b7f9-7b06bf802334",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:53:54.021601Z",
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
    "id": "b2b2abce-af19-46b9-aade-c554ccfe7fa7",
    "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:53:54.37804Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1cbbb5bf-2da1-40ea-8e1f-7312dcd78477",
    "order_id": "5bfe27e4-6038-4486-8cc6-094eb8e734ac",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:52:54.162625Z",
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

`GET /api/rider/v1/orders/74448da8-752b-4036-b7f9-7b06bf802334/tip` → **200**

```json
{
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
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
  "available_until": "2026-10-29T10:53:57.432772Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/74448da8-752b-4036-b7f9-7b06bf802334/tip` → **201**

```json
{
  "command_id": "56453acd-00f7-4f1b-8641-41283f079228",
  "amount_minor": 1100
}
```

```json
{
  "id": "b4335a72-3d66-4b79-a0f8-958940a08f0e",
  "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:54:01.728577Z"
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
  "session_id": "1fc1526e-e653-4854-9367-0d70116ad064",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NDIsImlhdCI6MTc5MzE4NDg0MiwianRpIjoiYjVkOThiODgtMWZhNS00MTJlLThjZmEtNWNhOTIyN2RjN2NiIiwic2lkIjoiMWZjMTUyNmUtZTY1My00ODU0LTkzNjctMGQ3MDExNmFkMDY0In0.L2-_oIXHH3iJtKDIM8pLkJYclGrwglxDw2y46xCthQM",
  "access_expires_at": "2026-10-28T11:09:02.119322032Z",
  "refresh_token": "_CVHO9rWHeqDHwY287uXtPIE8TN9T09Vjd87T9D-Y8Q",
  "refresh_expires_at": "2026-10-28T22:54:02.118979757Z",
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
  "generated_at": "2026-10-28T10:54:02.302559325Z"
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
  "generated_at": "2026-10-28T10:54:02.491004535Z"
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
  "session_id": "6b962269-857b-4ab9-959b-9fb7d5f6cd02",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NDIsImlhdCI6MTc5MzE4NDg0MiwianRpIjoiMjQ4NWYxMzQtYmMwMy00Nzg2LTkxZTMtZjQwYzNjYTgyMTE1Iiwic2lkIjoiNmI5NjIyNjktODU3Yi00YWI5LTk1OWItOWZiN2Q1ZjZjZDAyIn0.A-73HcdcvaCmNFYaVmrbOd2BKzcoAEHYes23ONW6q3o",
  "access_expires_at": "2026-10-28T11:09:02.890275833Z",
  "refresh_token": "YeuXZicIH9glG5Vybd4nBpkjV9XgFV--VIKbEoWccUg",
  "refresh_expires_at": "2026-10-28T22:54:02.889884705Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/74448da8-752b-4036-b7f9-7b06bf802334/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:53:54.022047Z",
      "actor": {
        "type": "CLIENT",
        "id": "bce8e14e-667d-4c0b-a272-a900c552c0b1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
        "quote_id": "9a16cfd1-889f-4b69-b939-967b6c09d234",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7837ced8-565c-4d5e-b55f-9d4daf5958e3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:53:54.023434Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
        "attempt_id": "f8984db1-da56-4612-ab56-0c43e5a8a48c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7837ced8-565c-4d5e-b55f-9d4daf5958e3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:53:54.027834Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bb15b408-bc6e-485e-aca2-43d893effbe6",
        "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "7837ced8-565c-4d5e-b55f-9d4daf5958e3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:53:54.379493Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bb15b408-bc6e-485e-aca2-43d893effbe6",
        "order_id": "74448da8-752b-4036-b7f9-7b06bf802334",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f312f388-58bf-4434-9372-9f6f16345e3b"
      },
      "correlation_id": "c75c4c60-a536-4c98-8851-d61a2694d2c6"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:54:03.254974933Z",
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
      "last_location_at": "2026-10-28T10:53:57.247544Z",
      "order_id": null
    }
  ]
}
```

Done: order 74448da8-752b-4036-b7f9-7b06bf802334.

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
  "session_id": "9ad8b2e6-c4a9-4378-b81b-747ef00074d4",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NDMsImlhdCI6MTc5MzE4NDg0MywianRpIjoiZjgwMDJmZmQtNmIwZi00NTZiLTljMDgtMDI4YmE4NTM5MjM3Iiwic2lkIjoiOWFkOGIyZTYtYzRhOS00Mzc4LWI4MWItNzQ3ZWYwMDA3NGQ0In0.Eory3FFaGHJHfXQdeFW6JXMYSxCupEH60vcsHfGLS4w",
  "access_expires_at": "2026-10-28T11:09:03.66493438Z",
  "refresh_token": "i0zP0EfiuRfxBFwRvVH1MjPjdE2ptHsJNYkzr9KUxEc",
  "refresh_expires_at": "2026-10-28T22:54:03.664508544Z",
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
  "command_id": "e5e39199-13ab-46ee-b48d-7042d5fbab10",
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
  "timestamp": "2026-10-28T10:54:04.000+0000",
  "channel": {
    "id": "1730052000.1024311125",
    "linkedid": "1730052000.1024311125",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677209614"
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
  "timestamp": "2026-10-28T10:54:04.000+0000",
  "channel": {
    "id": "1730052000.1024311125",
    "linkedid": "1730052000.1024311125",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677209614"
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
  "session_id": "d53da685-2fe9-43b7-a650-51172167d45f",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NDQsImlhdCI6MTc5MzE4NDg0NCwianRpIjoiOGJmOTQzZjctZmQ4Mi00NjhjLTgyZDUtMTQ0YWIyNjg5MzFjIiwic2lkIjoiZDUzZGE2ODUtMmZlOS00M2I3LWE2NTAtNTExNzIxNjdkNDVmIn0.Z69JLfqLd5lZTN8VtZ5xLyCDEiHknBAgShATl8dQyRM",
  "access_expires_at": "2026-10-28T11:09:04.469813793Z",
  "refresh_token": "Dq05Wk14NPZGZA8A4u52iVDdKeGywevQoZ75INBtRBo",
  "refresh_expires_at": "2026-10-28T22:54:04.46930684Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a77a0f15-f322-4242-aba4-45678c4088d6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677209614",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:54:04Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a77a0f15-f322-4242-aba4-45678c4088d6/answer` → **200**

```json
{
  "command_id": "88a46359-12af-42f5-b92c-b82a7d691279"
}
```

```json
{
  "id": "a77a0f15-f322-4242-aba4-45678c4088d6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677209614",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "order_ids": [],
  "started_at": "2026-10-28T10:54:04Z",
  "answered_at": "2026-10-28T10:54:04.844313Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1024311125",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d2a2e804-e298-4699-8040-06dbdea3cfc8",
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
  "id": "592ceb20-062b-4e09-a13c-4292ed24e55b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:05.062890Z",
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
  "command_id": "965fe4d1-ff9d-4f81-8504-e7bd42c30e6e",
  "quote_id": "592ceb20-062b-4e09-a13c-4292ed24e55b",
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
    "phone": "+380677209614"
  },
  "call_id": "a77a0f15-f322-4242-aba4-45678c4088d6"
}
```

```json
{
  "id": "634ee37a-430f-4de9-a1bb-d0a1d01b6589",
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
  "created_at": "2026-10-28T10:54:05.28147Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677209614"
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
    "id": "1730052000.1024311125",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a77a0f15-f322-4242-aba4-45678c4088d6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677209614",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [
        "634ee37a-430f-4de9-a1bb-d0a1d01b6589"
      ],
      "started_at": "2026-10-28T10:54:04Z",
      "answered_at": "2026-10-28T10:54:04.844313Z",
      "ended_at": "2026-10-28T10:54:05.522913Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "07d28e37-29ec-47f6-a0dd-1421167e611e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675047401",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [],
      "started_at": "2026-10-28T10:53:00.392618Z",
      "answered_at": "2026-10-28T10:53:00.601033Z",
      "ended_at": "2026-10-28T10:53:00.797904Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:53:03.905596Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/634ee37a-430f-4de9-a1bb-d0a1d01b6589` → **200**

```json
{
  "id": "634ee37a-430f-4de9-a1bb-d0a1d01b6589",
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
  "created_at": "2026-10-28T10:54:05.28147Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677209614"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/634ee37a-430f-4de9-a1bb-d0a1d01b6589` → **200**

```json
{
  "id": "634ee37a-430f-4de9-a1bb-d0a1d01b6589",
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
  "created_at": "2026-10-28T10:54:05.28147Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677209614"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/634ee37a-430f-4de9-a1bb-d0a1d01b6589/cancel` → **200**

```json
{
  "command_id": "e3b88b9b-5985-4892-a32c-e8800a912965",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "634ee37a-430f-4de9-a1bb-d0a1d01b6589",
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
  "created_at": "2026-10-28T10:54:05.28147Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677209614"
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

Done: call a77a0f15-f322-4242-aba4-45678c4088d6 with order 634ee37a-430f-4de9-a1bb-d0a1d01b6589.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29591"
}
```

```json
{
  "challenge_id": "81922f8d-ee2f-489f-b890-d0f37053fd5e",
  "expires_at": "2026-10-28T10:59:06.316306564Z",
  "resend_available_at": "2026-10-28T10:54:07.316306564Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "882656",
  "sent_at": "2026-10-28T10:54:06.318026502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81922f8d-ee2f-489f-b890-d0f37053fd5e",
  "code": "882656",
  "device_ref": "sandbox-29591"
}
```

```json
{
  "session_id": "8816c610-fe2d-4449-9bb9-bc0ce5e0cdd8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTc0NiwiaWF0IjoxNzkzMTg0ODQ2LCJqdGkiOiIxODY5NTlkMi02MGViLTRlMGEtODA2Mi04Mzg4YzhlMTg2MDYiLCJzaWQiOiI4ODE2YzYxMC1mZTJkLTQ0NDktOWJiOS1iYzBjZTVlMGNkZDgifQ.mlX0UokQ6_mRLyKnjajkCTWs3OVKmGZXA7pBzo49fMs",
  "access_expires_at": "2026-10-28T11:09:06.515383055Z",
  "refresh_token": "u5YUjNAtoFLQT3FATBQKygrFvwFtsjsZDrBSPmJPSOA",
  "refresh_expires_at": "2026-11-27T10:54:06.514916613Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:53:57.247544Z",
  "last_location_at": "2026-10-28T10:53:57.247544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/handover` → **200**

```json
{
  "command_id": "8cac3097-e6ab-4207-8767-88ada53284f6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:53:57.247544Z",
  "last_location_at": "2026-10-28T10:53:57.247544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:07Z",
    "sequence": 1793184847518
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:07.068838Z",
  "last_location_at": "2026-10-28T10:54:07.068838Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664986643",
  "device_ref": "sandbox-849"
}
```

```json
{
  "challenge_id": "7ea3e669-4b74-41b9-a6ac-78e28aa7ce01",
  "expires_at": "2026-10-28T10:59:07.240193308Z",
  "resend_available_at": "2026-10-28T10:54:08.240193308Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664986643` → **200**

```json
{
  "phone": "+380664986643",
  "audience": "CLIENT",
  "code": "137264",
  "sent_at": "2026-10-28T10:54:07.241959256Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ea3e669-4b74-41b9-a6ac-78e28aa7ce01",
  "code": "137264",
  "device_ref": "sandbox-849"
}
```

```json
{
  "session_id": "06cec791-0229-4fd6-9695-7056558e108b",
  "subject": {
    "type": "CLIENT",
    "id": "5c513ae7-d8e7-4075-9c53-b67358374649"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzUxM2FlNy1kOGU3LTQwNzUtOWM1My1iNjczNTgzNzQ2NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzQ3LCJpYXQiOjE3OTMxODQ4NDcsImp0aSI6ImIyYmJhNDkwLWFkZjctNGE2Ni05NDgzLWFmMmNiYzYwNmMzYiIsInNpZCI6IjA2Y2VjNzkxLTAyMjktNGZkNi05Njk1LTcwNTY1NThlMTA4YiJ9.jSdc7JZf1WfL-JnELBEZ47-tE838bQog1o-qdGjK3mQ",
  "access_expires_at": "2026-10-28T11:09:07.432034384Z",
  "refresh_token": "9czmRIFPcGUPic5qv29iHiEt010puj2HS-qW8DFmVzw",
  "refresh_expires_at": "2026-11-27T10:54:07.431582584Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de04ca74-8f79-4f73-9cba-f89b07e1e283",
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
  "id": "05a8b2d1-b589-4ef1-9b95-52cb7229ef3f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:07.604361Z",
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
  "command_id": "26a3216d-4d36-46a7-8028-39601b31b003",
  "quote_id": "05a8b2d1-b589-4ef1-9b95-52cb7229ef3f",
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
  "id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5c513ae7-d8e7-4075-9c53-b67358374649",
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
  "created_at": "2026-10-28T10:54:07.802476Z",
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
    "id": "64782e30-e016-42cd-882a-2c47ba0fb879",
    "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
    "expires_at": "2026-10-28T10:54:22.80469Z",
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

`POST /api/driver/v1/offers/64782e30-e016-42cd-882a-2c47ba0fb879/accept` → **200**

```json
{
  "command_id": "4fd80e58-34c9-48de-ab01-9fc9337b3c82"
}
```

```json
{
  "id": "ff817b78-c6fe-46ba-ad4c-ce423f43bfd3",
  "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c1048f5d-938d-44f0-b3f2-720850ce1cc3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c1048f5d-938d-44f0-b3f2-720850ce1cc3",
  "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
  "assignment_id": "ff817b78-c6fe-46ba-ad4c-ce423f43bfd3",
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

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:08Z",
    "sequence": 1793184848555
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:08.571241Z",
  "last_location_at": "2026-10-28T10:54:08.571241Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c1048f5d-938d-44f0-b3f2-720850ce1cc3/arrive` → **200**

```json
{
  "command_id": "7a3a434d-a47c-47cc-bfc7-242f5d5fc286",
  "expected_version": 0
}
```

```json
{
  "id": "c1048f5d-938d-44f0-b3f2-720850ce1cc3",
  "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
  "assignment_id": "ff817b78-c6fe-46ba-ad4c-ce423f43bfd3",
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
  "arrived_at": "2026-10-28T10:54:08.762239Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c1048f5d-938d-44f0-b3f2-720850ce1cc3/start` → **200**

```json
{
  "command_id": "bc02a3e2-69c6-4e78-b679-a51c6d90bbbd",
  "expected_version": 1
}
```

```json
{
  "id": "c1048f5d-938d-44f0-b3f2-720850ce1cc3",
  "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
  "assignment_id": "ff817b78-c6fe-46ba-ad4c-ce423f43bfd3",
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
  "arrived_at": "2026-10-28T10:54:08.762239Z",
  "started_at": "2026-10-28T10:54:08.952216Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:09Z",
    "sequence": 1793184849131
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:09.148289Z",
  "last_location_at": "2026-10-28T10:54:09.148289Z",
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
  "device_ref": "sandbox-20817"
}
```

```json
{
  "challenge_id": "d66bf0ed-b32f-4e6e-8ffc-4eff385ce54a",
  "expires_at": "2026-10-28T10:59:09.323498488Z",
  "resend_available_at": "2026-10-28T10:54:10.323498488Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "003678",
  "sent_at": "2026-10-28T10:54:09.325275568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d66bf0ed-b32f-4e6e-8ffc-4eff385ce54a",
  "code": "003678",
  "device_ref": "sandbox-20817"
}
```

```json
{
  "session_id": "75010ff6-0960-423a-9763-b23b5f28d751",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTc0OSwiaWF0IjoxNzkzMTg0ODQ5LCJqdGkiOiI0OGU4ZTc1Mi03NzI2LTQ5ZDctOWFiNy03YzBhYjdhMjEyYTIiLCJzaWQiOiI3NTAxMGZmNi0wOTYwLTQyM2EtOTc2My1iMjNiNWYyOGQ3NTEifQ.fxGKkKV06MntvQClr0DKBEv37hbNr_x2g1kvEzw4Fik",
  "access_expires_at": "2026-10-28T11:09:09.534119999Z",
  "refresh_token": "HWTDKFnoGhVt_TwFDL3HHEGP-MTYajbA6AxBDluLznk",
  "refresh_expires_at": "2026-11-27T10:54:09.533678801Z",
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
  "command_id": "3bacd517-3a85-45ea-876f-c9e6950bdde8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:09Z",
    "sequence": 1793184849903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e71a69-bd28-42ba-ab1e-ea09f93c787f",
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
  "last_heartbeat_at": "2026-10-28T10:54:09.918689Z",
  "last_location_at": "2026-10-28T10:54:09.918689Z",
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
  "session_id": "9435d45e-8be0-4706-ac71-2c095d3935db",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NTAsImlhdCI6MTc5MzE4NDg1MCwianRpIjoiNDMxYmNkOTAtMWQxNS00OGMzLWExM2UtYzVhZTU0OGUwNjQ4Iiwic2lkIjoiOTQzNWQ0NWUtOGJlMC00NzA2LWFjNzEtMmMwOTVkMzkzNWRiIn0.sftbmH79y3nycoocs2TAWI4ib6Bee9zaaOo1QXY1JaE",
  "access_expires_at": "2026-10-28T11:09:10.329908143Z",
  "refresh_token": "pVJi9OlEQm_s_AEgS_sar2ASZ4zOypyhT2z_Bv6XXq0",
  "refresh_expires_at": "2026-10-28T22:54:10.329506759Z",
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
  "session_id": "61ffc4ec-4f7c-4485-af7b-8c8d00eb5a18",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NTAsImlhdCI6MTc5MzE4NDg1MCwianRpIjoiYWE1MmI1YTMtY2YxNy00ZmE0LWIxNDUtMGY4NWI4MzQ2MWRkIiwic2lkIjoiNjFmZmM0ZWMtNGY3Yy00NDg1LWFmN2ItOGM4ZDAwZWI1YTE4In0.pMGNTlKBq_hfm-e0-3zYwOUzz2J9vS6iGNf3vjc981M",
  "access_expires_at": "2026-10-28T11:09:10.741437995Z",
  "refresh_token": "VO_548NAjEmD67ZV8gwGRMOV0ojtJOGn75YkPsD7WKU",
  "refresh_expires_at": "2026-10-28T22:54:10.740933777Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ed5052fb-0253-4c7d-87d8-ea5fc29cdb39` → **200**

```json
{
  "id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5c513ae7-d8e7-4075-9c53-b67358374649",
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
    "id": "ff817b78-c6fe-46ba-ad4c-ce423f43bfd3",
    "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c1048f5d-938d-44f0-b3f2-720850ce1cc3",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T10:54:07.802476Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ed5052fb-0253-4c7d-87d8-ea5fc29cdb39/interrupt` → **200**

```json
{
  "command_id": "3ce5162e-621d-4da3-b6ac-dbf6ad5605d4",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "5c513ae7-d8e7-4075-9c53-b67358374649",
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
      "id": "ff817b78-c6fe-46ba-ad4c-ce423f43bfd3",
      "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c1048f5d-938d-44f0-b3f2-720850ce1cc3",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T10:54:07.802476Z",
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
    "id": "0aaff973-3a9a-42f1-8665-da487d139486",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "5c513ae7-d8e7-4075-9c53-b67358374649",
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
    "id": "0aaa8dfb-d737-40dc-993f-e0ca0e46d375",
    "order_id": "0aaff973-3a9a-42f1-8665-da487d139486",
    "expires_at": "2026-10-28T10:54:26.117123Z",
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

`POST /api/driver/v1/offers/0aaa8dfb-d737-40dc-993f-e0ca0e46d375/accept` → **200**

```json
{
  "command_id": "276e422b-fcc5-4c0b-84b9-20450fa8e4e3"
}
```

```json
{
  "id": "d6c9dc8b-8283-48af-bd57-b3b20a3695f1",
  "order_id": "0aaff973-3a9a-42f1-8665-da487d139486",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dbc2c9bd-9675-4bfa-9ce0-9801259a471c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dbc2c9bd-9675-4bfa-9ce0-9801259a471c",
  "order_id": "0aaff973-3a9a-42f1-8665-da487d139486",
  "assignment_id": "d6c9dc8b-8283-48af-bd57-b3b20a3695f1",
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
  "session_id": "c6e71a69-bd28-42ba-ab1e-ea09f93c787f",
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
  "last_heartbeat_at": "2026-10-28T10:54:09.918689Z",
  "last_location_at": "2026-10-28T10:54:09.918689Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/c6e71a69-bd28-42ba-ab1e-ea09f93c787f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:12Z",
    "sequence": 1793184852898
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e71a69-bd28-42ba-ab1e-ea09f93c787f",
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
  "last_heartbeat_at": "2026-10-28T10:54:12.024569Z",
  "last_location_at": "2026-10-28T10:54:12.024569Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dbc2c9bd-9675-4bfa-9ce0-9801259a471c/arrive` → **200**

```json
{
  "command_id": "122a37ed-ead4-4a2e-b1c7-382c85390e72",
  "expected_version": 0
}
```

```json
{
  "id": "dbc2c9bd-9675-4bfa-9ce0-9801259a471c",
  "order_id": "0aaff973-3a9a-42f1-8665-da487d139486",
  "assignment_id": "d6c9dc8b-8283-48af-bd57-b3b20a3695f1",
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
  "arrived_at": "2026-10-28T10:54:12.23381Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dbc2c9bd-9675-4bfa-9ce0-9801259a471c/start` → **200**

```json
{
  "command_id": "caecdda1-e541-47cd-bdbe-b880e4e6990d",
  "expected_version": 1
}
```

```json
{
  "id": "dbc2c9bd-9675-4bfa-9ce0-9801259a471c",
  "order_id": "0aaff973-3a9a-42f1-8665-da487d139486",
  "assignment_id": "d6c9dc8b-8283-48af-bd57-b3b20a3695f1",
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
  "arrived_at": "2026-10-28T10:54:12.23381Z",
  "started_at": "2026-10-28T10:54:12.426551Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dbc2c9bd-9675-4bfa-9ce0-9801259a471c/complete` → **200**

```json
{
  "command_id": "19d87eb8-77b7-4646-867f-752f583b5a55",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:54:12Z"
}
```

```json
{
  "id": "dbc2c9bd-9675-4bfa-9ce0-9801259a471c",
  "order_id": "0aaff973-3a9a-42f1-8665-da487d139486",
  "assignment_id": "d6c9dc8b-8283-48af-bd57-b3b20a3695f1",
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
  "arrived_at": "2026-10-28T10:54:12.23381Z",
  "started_at": "2026-10-28T10:54:12.426551Z",
  "completed_at": "2026-10-28T10:54:12.618487Z",
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
    "id": "0aaff973-3a9a-42f1-8665-da487d139486",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:54:11.111107Z",
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
    "id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:54:07.802476Z",
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

`GET /api/operator/v1/orders/ed5052fb-0253-4c7d-87d8-ea5fc29cdb39/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:54:07.802828Z",
      "actor": {
        "type": "CLIENT",
        "id": "5c513ae7-d8e7-4075-9c53-b67358374649",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
        "quote_id": "05a8b2d1-b589-4ef1-9b95-52cb7229ef3f",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "7711f07f-fc7e-479c-b11b-a906f6360f06"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:54:07.804122Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
        "attempt_id": "dfbd05b9-d969-4c3d-bdc3-1f786b708362",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7711f07f-fc7e-479c-b11b-a906f6360f06"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:54:07.806601Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "64782e30-e016-42cd-882a-2c47ba0fb879",
        "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "7711f07f-fc7e-479c-b11b-a906f6360f06"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:54:08.20658Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "64782e30-e016-42cd-882a-2c47ba0fb879",
        "order_id": "ed5052fb-0253-4c7d-87d8-ea5fc29cdb39",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ff817b78-c6fe-46ba-ad4c-ce423f43bfd3"
      },
      "correlation_id": "a948c094-54cd-4d28-b34f-bf347306aef0"
```

Done: interrupted ed5052fb-0253-4c7d-87d8-ea5fc29cdb39, follow-up 0aaff973-3a9a-42f1-8665-da487d139486.

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
  "session_id": "1e2652fe-6a2d-43b8-8d92-6f206a084336",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NTYsImlhdCI6MTc5MzE4NDg1NiwianRpIjoiMmIxYTQzNjUtOTY3MC00NTk4LTk5M2EtYWQ5YzA5ZDA5ODVjIiwic2lkIjoiMWUyNjUyZmUtNmEyZC00M2I4LThkOTItNmYyMDZhMDg0MzM2In0.1fwi5_aLpCzXccH3LXCbEEl0AgSvPgauOzpA-zKM1RY",
  "access_expires_at": "2026-10-28T11:09:16.582049211Z",
  "refresh_token": "WhlkZgpCdjFoGeBqHffVfLvV0LHRw6OiD0dSrFeAawY",
  "refresh_expires_at": "2026-10-28T22:54:16.581642804Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a7307683-00cb-4045-bb6c-7c506ec89deb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:54:16Z"
}
```

```json
{
  "id": "c310052f-d29e-402b-a6f1-244799fc8be5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:54:16Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c310052f-d29e-402b-a6f1-244799fc8be5/publish` → **200**

```json
{
  "command_id": "ad2eb4f9-a794-4ecf-abab-9c5fb6b2029a",
  "expected_version": 0
}
```

```json
{
  "id": "c310052f-d29e-402b-a6f1-244799fc8be5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:54:16.96509Z",
  "published_at": "2026-10-28T10:54:16.96509Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "c310052f-d29e-402b-a6f1-244799fc8be5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:54:16.96509Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635511644",
  "device_ref": "sandbox-9702"
}
```

```json
{
  "challenge_id": "dccc3280-5931-450a-a8b3-8fb7ec63dda5",
  "expires_at": "2026-10-28T10:59:17.325866972Z",
  "resend_available_at": "2026-10-28T10:54:18.325866972Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635511644` → **200**

```json
{
  "phone": "+380635511644",
  "audience": "CLIENT",
  "code": "877512",
  "sent_at": "2026-10-28T10:54:17.32764977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dccc3280-5931-450a-a8b3-8fb7ec63dda5",
  "code": "877512",
  "device_ref": "sandbox-9702"
}
```

```json
{
  "session_id": "74b77626-ad24-4441-8598-9dd81a0b5a71",
  "subject": {
    "type": "CLIENT",
    "id": "1ee6a825-559b-4217-b9b2-66e981dda6a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZWU2YTgyNS01NTliLTQyMTctYjliMi02NmU5ODFkZGE2YTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzU3LCJpYXQiOjE3OTMxODQ4NTcsImp0aSI6IjNkMGIwZDFjLTNkZjktNGQ1ZC1hNzNhLTJiYzQ3NWZiNTgyZSIsInNpZCI6Ijc0Yjc3NjI2LWFkMjQtNDQ0MS04NTk4LTlkZDgxYTBiNWE3MSJ9.ugH4UZelqLhSbQcBNTxXYgN8_9kKXo_YlgkoK76hr8o",
  "access_expires_at": "2026-10-28T11:09:17.531019929Z",
  "refresh_token": "YQHT0EINPmS1xBq7hUzum2goX9mKfu_ZretT2m_qRW8",
  "refresh_expires_at": "2026-11-27T10:54:17.530688901Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "c310052f-d29e-402b-a6f1-244799fc8be5",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:54:16.96509Z",
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
  "command_id": "801679a6-127e-452d-bba3-58d8e53a72e8",
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
  "id": "555af057-f040-4f5a-ae44-299d678d0e9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:17.907638Z",
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
  "command_id": "f1c92164-1116-4a40-9d82-ccd336c2b8b8",
  "quote_id": "555af057-f040-4f5a-ae44-299d678d0e9b",
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
  "correlation_id": "16181db5-0550-42ea-9994-4a024a83abde"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "15240f24-7c91-4b9d-a961-d2a3269a6ac0",
  "version_id": "c310052f-d29e-402b-a6f1-244799fc8be5",
  "language": "uk"
}
```

```json
{
  "version_id": "c310052f-d29e-402b-a6f1-244799fc8be5",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:54:18.280117Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "468defd1-84e2-4b83-8f83-a4d36d86cffd",
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
  "id": "d66573d5-ff81-4907-bfe1-4f1c3bce520a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:18.468791Z",
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
  "command_id": "a9744619-f1a5-40aa-91c1-a87203e68b6f",
  "quote_id": "d66573d5-ff81-4907-bfe1-4f1c3bce520a",
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
  "id": "e91015a8-17dd-4544-91e7-1632f91e746b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ee6a825-559b-4217-b9b2-66e981dda6a8",
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
  "created_at": "2026-10-28T10:54:18.656127Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e91015a8-17dd-4544-91e7-1632f91e746b` → **200**

```json
{
  "id": "e91015a8-17dd-4544-91e7-1632f91e746b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ee6a825-559b-4217-b9b2-66e981dda6a8",
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
  "created_at": "2026-10-28T10:54:18.656127Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e91015a8-17dd-4544-91e7-1632f91e746b/cancel` → **200**

```json
{
  "command_id": "efe27c1a-c57b-44a6-9e1d-8896bebe881a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e91015a8-17dd-4544-91e7-1632f91e746b",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1ee6a825-559b-4217-b9b2-66e981dda6a8",
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
  "created_at": "2026-10-28T10:54:18.656127Z",
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

`POST /api/admin/v1/legal-documents/c310052f-d29e-402b-a6f1-244799fc8be5` → **409**

```json
{
  "command_id": "2f8a7cbc-5201-42e0-8bdf-7b46620f116d",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:54:19Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/c310052f-d29e-402b-a6f1-244799fc8be5",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "44f3d6b1-5fc7-45a0-a2e6-55c9b025d6ae"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c8ae20ed-3ec2-406b-a052-c4a00ca72696",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:54:19Z"
}
```

```json
{
  "id": "98297b62-f289-465a-bc7d-70b13c34ef1e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:54:19Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/98297b62-f289-465a-bc7d-70b13c34ef1e/publish` → **200**

```json
{
  "command_id": "ffde6adb-a329-4f31-8f36-a335f1f99fdc",
  "expected_version": 0
}
```

```json
{
  "id": "98297b62-f289-465a-bc7d-70b13c34ef1e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:54:19.629385Z",
  "published_at": "2026-10-28T10:54:19.629385Z",
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
  "device_ref": "sandbox-10466"
}
```

```json
{
  "challenge_id": "f764b368-3b48-4606-9fd3-06776330a770",
  "expires_at": "2026-10-28T10:59:19.83202482Z",
  "resend_available_at": "2026-10-28T10:54:20.83202482Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "708800",
  "sent_at": "2026-10-28T10:54:19.833755264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f764b368-3b48-4606-9fd3-06776330a770",
  "code": "708800",
  "device_ref": "sandbox-10466"
}
```

```json
{
  "session_id": "39f83eb6-e4e4-4e4d-b503-d5ab2c60e300",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTc2MCwiaWF0IjoxNzkzMTg0ODYwLCJqdGkiOiJkMGU3ZDg1Zi1jMDY5LTQ3Y2UtYWRlNC05ZTIzM2IwNGU1YzMiLCJzaWQiOiIzOWY4M2ViNi1lNGU0LTRlNGQtYjUwMy1kNWFiMmM2MGUzMDAifQ.Xdu4OiIAhXz0O93-8WopSWduV420Hmrfr5C-jm-8rEg",
  "access_expires_at": "2026-10-28T11:09:20.034440514Z",
  "refresh_token": "zgOEUePdLx6vl8Kqu7dt365An2dB4oKaG8-DbDtUbMs",
  "refresh_expires_at": "2026-11-27T10:54:20.033981474Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e71a69-bd28-42ba-ab1e-ea09f93c787f",
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
  "last_heartbeat_at": "2026-10-28T10:54:12.024569Z",
  "last_location_at": "2026-10-28T10:54:12.024569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6e71a69-bd28-42ba-ab1e-ea09f93c787f/handover` → **200**

```json
{
  "command_id": "6f60e9e9-6ea8-4076-ad0d-1b3f73d72805",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e71a69-bd28-42ba-ab1e-ea09f93c787f",
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
  "last_heartbeat_at": "2026-10-28T10:54:12.024569Z",
  "last_location_at": "2026-10-28T10:54:12.024569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6e71a69-bd28-42ba-ab1e-ea09f93c787f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:20Z",
    "sequence": 1793184860584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c6e71a69-bd28-42ba-ab1e-ea09f93c787f",
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
  "last_heartbeat_at": "2026-10-28T10:54:20.600984Z",
  "last_location_at": "2026-10-28T10:54:20.600984Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676109382",
  "device_ref": "sandbox-24835"
}
```

```json
{
  "challenge_id": "051e9518-f564-44a4-b576-7aca38ac7c02",
  "expires_at": "2026-10-28T10:59:20.781457263Z",
  "resend_available_at": "2026-10-28T10:54:21.781457263Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676109382` → **200**

```json
{
  "phone": "+380676109382",
  "audience": "CLIENT",
  "code": "566505",
  "sent_at": "2026-10-28T10:54:20.783163872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "051e9518-f564-44a4-b576-7aca38ac7c02",
  "code": "566505",
  "device_ref": "sandbox-24835"
}
```

```json
{
  "session_id": "0c44663f-a5a0-4e19-a8a2-ed777ca7417f",
  "subject": {
    "type": "CLIENT",
    "id": "054d11a5-551f-4e98-adf6-11698c2c5e16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTRkMTFhNS01NTFmLTRlOTgtYWRmNi0xMTY5OGMyYzVlMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzYwLCJpYXQiOjE3OTMxODQ4NjAsImp0aSI6ImIyNDVjMTRjLWIxZWEtNDNjZC04NzRiLWMzMDNlM2MwOTFkOSIsInNpZCI6IjBjNDQ2NjNmLWE1YTAtNGUxOS1hOGEyLWVkNzc3Y2E3NDE3ZiJ9.azlFR3UVgUJFAv8kp3cQZlmHH3UCpt_-ISxV7OaF6qA",
  "access_expires_at": "2026-10-28T11:09:20.977971099Z",
  "refresh_token": "TglYzMWiZukbJToQxGfTCvZXoERygSft1euBbOVezWc",
  "refresh_expires_at": "2026-11-27T10:54:20.977589685Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "425ec01c-1d01-440d-a443-72a4ce84fe7d",
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
  "id": "74c947ea-85af-40a5-bb40-474342234e00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:21.162737Z",
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
  "command_id": "ac52af6c-ea61-42aa-9a57-3ef05cac523e",
  "quote_id": "74c947ea-85af-40a5-bb40-474342234e00",
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
    "phone": "+380674406035"
  }
}
```

```json
{
  "id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:21.350137Z",
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
    "id": "97c52d0f-e54a-4822-8977-106728223974",
    "order_id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
    "expires_at": "2026-10-28T10:54:36.352367Z",
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

`POST /api/driver/v1/offers/97c52d0f-e54a-4822-8977-106728223974/accept` → **200**

```json
{
  "command_id": "9f63c624-92b1-4dc8-8d77-7d045a517d3c"
}
```

```json
{
  "id": "2b9ad47f-1563-4518-a52c-c718513a06f0",
  "order_id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "474709d6-49c2-47a7-ad1f-f0a538c43ab5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "474709d6-49c2-47a7-ad1f-f0a538c43ab5",
  "order_id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
  "assignment_id": "2b9ad47f-1563-4518-a52c-c718513a06f0",
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
    "phone": "+380674406035"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "18e78044-670c-4e27-95fd-316ba8e00805",
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
  "id": "d9df2810-f939-48ce-b420-8fba24c26d94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:22.088897Z",
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
  "command_id": "2ec50673-d3df-4c02-94e3-37c0b0b4efda",
  "quote_id": "d9df2810-f939-48ce-b420-8fba24c26d94",
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
  "id": "9b0a98cc-38f8-4c05-b670-d8c3b7c8c695",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:22.278606Z",
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
  "command_id": "fa504a39-d7ec-4563-a9e5-da143dab02b2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:54:22Z"
}
```

```json
{
  "id": "9c9f2399-034a-44fa-a781-a64e30f4697b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:22.473570Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:54:22Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5f4ec493-9439-40d6-aca7-6e449b0b9969",
  "quote_id": "9c9f2399-034a-44fa-a781-a64e30f4697b",
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
  "pickup_at": "2026-10-28T13:54:22Z"
}
```

```json
{
  "id": "9e3a4023-81ff-4927-b1b6-0d146d0906f9",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:22.660488Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:54:22Z",
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
  "command_id": "e88d61a1-cd86-4d01-ad25-44e5fef9a3fa",
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
  "id": "896372c9-15f3-4f2b-bb67-c89947b17b9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:22.887071Z",
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
  "command_id": "3cfacd3e-c421-46f1-9e45-e54c3c29384d",
  "quote_id": "896372c9-15f3-4f2b-bb67-c89947b17b9c",
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
  "correlation_id": "6a8d74de-2538-4b1b-aa4f-8f57000361d6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9e3a4023-81ff-4927-b1b6-0d146d0906f9",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
      "created_at": "2026-10-28T10:54:22.660488Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:54:22Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "9b0a98cc-38f8-4c05-b670-d8c3b7c8c695",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
      "created_at": "2026-10-28T10:54:22.278606Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "9b0a98cc-38f8-4c05-b670-d8c3b7c8c695",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:22.278606Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/0753eb7f-08de-4645-8e38-c14613e37ed0` → **200**

```json
{
  "id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
    "id": "2b9ad47f-1563-4518-a52c-c718513a06f0",
    "order_id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "474709d6-49c2-47a7-ad1f-f0a538c43ab5",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:54:21.350137Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0753eb7f-08de-4645-8e38-c14613e37ed0/cancel` → **200**

```json
{
  "command_id": "95a152d3-5da3-4b47-9357-5e65ac4efb25",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
    "id": "2b9ad47f-1563-4518-a52c-c718513a06f0",
    "order_id": "0753eb7f-08de-4645-8e38-c14613e37ed0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "474709d6-49c2-47a7-ad1f-f0a538c43ab5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:54:21.350137Z",
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

`GET /api/rider/v1/orders/9b0a98cc-38f8-4c05-b670-d8c3b7c8c695` → **200**

```json
{
  "id": "9b0a98cc-38f8-4c05-b670-d8c3b7c8c695",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:22.278606Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9b0a98cc-38f8-4c05-b670-d8c3b7c8c695/cancel` → **200**

```json
{
  "command_id": "9c628d83-ed62-4acf-8d8d-e76dfb533552",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9b0a98cc-38f8-4c05-b670-d8c3b7c8c695",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:22.278606Z",
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

`GET /api/rider/v1/orders/9e3a4023-81ff-4927-b1b6-0d146d0906f9` → **200**

```json
{
  "id": "9e3a4023-81ff-4927-b1b6-0d146d0906f9",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:22.660488Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:54:22Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9e3a4023-81ff-4927-b1b6-0d146d0906f9/cancel` → **200**

```json
{
  "command_id": "c6202fcd-7759-4354-a716-f771b94355ed",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9e3a4023-81ff-4927-b1b6-0d146d0906f9",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "054d11a5-551f-4e98-adf6-11698c2c5e16",
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
  "created_at": "2026-10-28T10:54:22.660488Z",
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
  "pickup_at": "2026-10-28T13:54:22Z",
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
  "session_id": "c6e71a69-bd28-42ba-ab1e-ea09f93c787f",
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
  "last_heartbeat_at": "2026-10-28T10:54:20.600984Z",
  "last_location_at": "2026-10-28T10:54:20.600984Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6e71a69-bd28-42ba-ab1e-ea09f93c787f/close` → **200**

```json
{
  "command_id": "86bf1d42-edf3-4db4-8dd0-292c26f09493",
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

Done: orders 0753eb7f-08de-4645-8e38-c14613e37ed0, 9b0a98cc-38f8-4c05-b670-d8c3b7c8c695, 9e3a4023-81ff-4927-b1b6-0d146d0906f9.

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
  "session_id": "4379ef31-d4c2-4e0b-95cb-4e792b40e3b8",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NjUsImlhdCI6MTc5MzE4NDg2NSwianRpIjoiYTNjMDgwYTAtYjJmYy00NDAzLWEyYTktMDNhOTczNzZlOThiIiwic2lkIjoiNDM3OWVmMzEtZDRjMi00ZTBiLTk1Y2ItNGU3OTJiNDBlM2I4In0.ZnOmNjWEmTRJo6CUw6YNISZPTTOfVinFFWA0xEeTQHY",
  "access_expires_at": "2026-10-28T11:09:25.217527361Z",
  "refresh_token": "WugsPSuIbrGqVNtKegbxpzKGoTYHwt1XbAOUog-bP5s",
  "refresh_expires_at": "2026-10-28T22:54:25.217199838Z",
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
  "session_id": "053ec8f8-cba5-4d46-bad5-0ae938849830",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NjUsImlhdCI6MTc5MzE4NDg2NSwianRpIjoiZTRkYTYzNjMtMjllZC00ZjY1LTgzYmMtMjVlYjdkZGI2YTdhIiwic2lkIjoiMDUzZWM4ZjgtY2JhNS00ZDQ2LWJhZDUtMGFlOTM4ODQ5ODMwIn0.jI92ar5jO8qLTSUDhZ8oxes6QaIS9_qLYejLicCXYWA",
  "access_expires_at": "2026-10-28T11:09:25.59228478Z",
  "refresh_token": "0Z1zDNuWtII4eg2oCD8ew1pKXEHLFr6PWLImHryMBP8",
  "refresh_expires_at": "2026-10-28T22:54:25.591942865Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29012"
}
```

```json
{
  "challenge_id": "507ce3ec-732b-4999-a341-d1eee920a3e1",
  "expires_at": "2026-10-28T10:59:25.784233445Z",
  "resend_available_at": "2026-10-28T10:54:26.784233445Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "472300",
  "sent_at": "2026-10-28T10:54:25.786075667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "507ce3ec-732b-4999-a341-d1eee920a3e1",
  "code": "472300",
  "device_ref": "sandbox-29012"
}
```

```json
{
  "session_id": "5cafedd7-0356-4397-b1a3-7c5b149aa370",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTc2NSwiaWF0IjoxNzkzMTg0ODY1LCJqdGkiOiIzYjI2MWY4Ny03MDM2LTQzMjctOWIwYy1mMzQ0Yzk2Mzg2YjEiLCJzaWQiOiI1Y2FmZWRkNy0wMzU2LTQzOTctYjFhMy03YzViMTQ5YWEzNzAifQ.oUS3pwInsNn5yt9ubKvOAzWE0CHwFEdtjQGBx6dVimE",
  "access_expires_at": "2026-10-28T11:09:25.976377321Z",
  "refresh_token": "Fq57w0uABh9hh_WR-H5tjUhds94GaIoQHfCGduUELYE",
  "refresh_expires_at": "2026-11-27T10:54:25.975948517Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:09.148289Z",
  "last_location_at": "2026-10-28T10:54:09.148289Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/handover` → **200**

```json
{
  "command_id": "adb2d118-fe42-4698-a01c-3b0ddc518cae",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:09.148289Z",
  "last_location_at": "2026-10-28T10:54:09.148289Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:26Z",
    "sequence": 1793184866493
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:26.508824Z",
  "last_location_at": "2026-10-28T10:54:26.508824Z",
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
  "command_id": "9bd4bc55-c342-4930-88ed-ed8cf6b3d92b",
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
  "effective_at": "2026-10-28T10:54:26.857062Z",
  "changed_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:54:27.029154842Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "79e9479e-f5d3-4e23-91f3-a088da53830d",
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
  "id": "501b1b7a-f804-4dc1-833f-31d7d7bfb688",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:27.211563Z",
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
  "command_id": "803ba469-ac59-4796-89a0-7c8e26165fba",
  "quote_id": "501b1b7a-f804-4dc1-833f-31d7d7bfb688",
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
    "phone": "+3806711129809"
  }
}
```

```json
{
  "id": "5964af34-6b98-43f1-89bc-2c09385eb084",
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
  "created_at": "2026-10-28T10:54:27.398108Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129809"
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
    "id": "0330b67b-9372-413c-b413-3781273b7735",
    "order_id": "5964af34-6b98-43f1-89bc-2c09385eb084",
    "expires_at": "2026-10-28T10:54:42.400152Z",
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

`POST /api/driver/v1/offers/0330b67b-9372-413c-b413-3781273b7735/accept` → **200**

```json
{
  "command_id": "25cbcfab-318c-4305-982d-e2ebb1bda0c9"
}
```

```json
{
  "id": "93f0c6ee-bbbc-467e-a158-e26850bfa071",
  "order_id": "5964af34-6b98-43f1-89bc-2c09385eb084",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bc293230-d20b-42f4-b418-33003ad972b6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bc293230-d20b-42f4-b418-33003ad972b6",
  "order_id": "5964af34-6b98-43f1-89bc-2c09385eb084",
  "assignment_id": "93f0c6ee-bbbc-467e-a158-e26850bfa071",
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
    "phone": "+3806711129809"
  }
}
```

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:28Z",
    "sequence": 1793184868757
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:28.091653Z",
  "last_location_at": "2026-10-28T10:54:28.091653Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bc293230-d20b-42f4-b418-33003ad972b6/arrive` → **200**

```json
{
  "command_id": "ffc59cf5-8230-4e28-883d-36bef92365ab",
  "expected_version": 0
}
```

```json
{
  "id": "bc293230-d20b-42f4-b418-33003ad972b6",
  "order_id": "5964af34-6b98-43f1-89bc-2c09385eb084",
  "assignment_id": "93f0c6ee-bbbc-467e-a158-e26850bfa071",
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
  "arrived_at": "2026-10-28T10:54:28.268424Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129809"
  }
}
```

`POST /api/driver/v1/trips/bc293230-d20b-42f4-b418-33003ad972b6/start` → **200**

```json
{
  "command_id": "c3b66820-8713-4a6f-8122-fe2a33267d15",
  "expected_version": 1
}
```

```json
{
  "id": "bc293230-d20b-42f4-b418-33003ad972b6",
  "order_id": "5964af34-6b98-43f1-89bc-2c09385eb084",
  "assignment_id": "93f0c6ee-bbbc-467e-a158-e26850bfa071",
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
  "arrived_at": "2026-10-28T10:54:28.268424Z",
  "started_at": "2026-10-28T10:54:28.445923Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129809"
  }
}
```

`POST /api/driver/v1/trips/bc293230-d20b-42f4-b418-33003ad972b6/complete` → **200**

```json
{
  "command_id": "33506fc1-0ec6-44f0-83be-bcc3eb94a6c1",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:54:28Z",
  "cash_received": true
}
```

```json
{
  "id": "bc293230-d20b-42f4-b418-33003ad972b6",
  "order_id": "5964af34-6b98-43f1-89bc-2c09385eb084",
  "assignment_id": "93f0c6ee-bbbc-467e-a158-e26850bfa071",
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
  "arrived_at": "2026-10-28T10:54:28.268424Z",
  "started_at": "2026-10-28T10:54:28.445923Z",
  "completed_at": "2026-10-28T10:54:28.628775Z",
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
  "command_id": "caa466dc-fd82-4a9a-903f-9bb57d85464f",
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
  "id": "1f9bddbe-589f-4ce5-aadd-016871ea752e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:28.809823Z",
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
  "command_id": "c53fc787-674f-4b67-ab61-98f76bc37f11",
  "quote_id": "1f9bddbe-589f-4ce5-aadd-016871ea752e",
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
    "phone": "+3806711130968"
  }
}
```

```json
{
  "id": "667ff134-99f4-4287-8df6-f2f3f4f2ad26",
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
  "created_at": "2026-10-28T10:54:29.001852Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130968"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/667ff134-99f4-4287-8df6-f2f3f4f2ad26` → **200**

```json
{
  "id": "667ff134-99f4-4287-8df6-f2f3f4f2ad26",
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
  "created_at": "2026-10-28T10:54:29.001852Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130968"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/667ff134-99f4-4287-8df6-f2f3f4f2ad26/cancel` → **200**

```json
{
  "command_id": "9cd89022-8a8c-45ca-acbe-3fc0140f1e58",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "667ff134-99f4-4287-8df6-f2f3f4f2ad26",
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
  "created_at": "2026-10-28T10:54:29.001852Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130968"
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
  "staff_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T10:54:28.632494Z",
  "last_entries": [
    {
      "order_id": "667ff134-99f4-4287-8df6-f2f3f4f2ad26",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T10:54:29.367503Z"
    },
    {
      "order_id": "5964af34-6b98-43f1-89bc-2c09385eb084",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T10:54:28.632494Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fce9646-7a4f-4057-a404-fa2687d5b12d",
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
  "last_heartbeat_at": "2026-10-28T10:54:28.091653Z",
  "last_location_at": "2026-10-28T10:54:28.091653Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fce9646-7a4f-4057-a404-fa2687d5b12d/close` → **200**

```json
{
  "command_id": "3571cb8d-0122-47df-af20-b2fd3c60c2ed",
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

Done: operator bonus for fulfilled 5964af34-6b98-43f1-89bc-2c09385eb084 and operator-fault cancellation 667ff134-99f4-4287-8df6-f2f3f4f2ad26.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673696376",
  "device_ref": "sandbox-9430"
}
```

```json
{
  "challenge_id": "c3e88241-f224-43cf-b596-0c08933f40d1",
  "expires_at": "2026-10-28T10:59:32.115295494Z",
  "resend_available_at": "2026-10-28T10:54:33.115295494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673696376` → **200**

```json
{
  "phone": "+380673696376",
  "audience": "CLIENT",
  "code": "878705",
  "sent_at": "2026-10-28T10:54:32.117195213Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679522653",
  "device_ref": "sandbox-29893",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ba1a20b3-4b94-41a4-8374-1ce99611bc86",
  "expires_at": "2026-10-28T10:59:32.313936145Z",
  "resend_available_at": "2026-10-28T10:54:33.313936145Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679522653` → **200**

```json
{
  "phone": "+380679522653",
  "audience": "CLIENT",
  "code": "201365",
  "sent_at": "2026-10-28T10:54:32.315564731Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679410000",
  "device_ref": "sandbox-18928"
}
```

```json
{
  "challenge_id": "871ca274-28f7-4bc7-8623-0279765995cc",
  "expires_at": "2026-10-28T10:59:32.538154288Z",
  "resend_available_at": "2026-10-28T10:54:33.538154288Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679410000` → **200**

```json
{
  "phone": "+380679410000",
  "audience": "CLIENT",
  "code": "817016",
  "sent_at": "2026-10-28T10:54:32.540761302Z",
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
  "session_id": "c1c27fc0-34e6-4906-8a22-8769b16da1ed",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NzIsImlhdCI6MTc5MzE4NDg3MiwianRpIjoiMzUyZmNjYmYtZDY2MS00ZDZiLWJmY2EtNGZkNTAxYmZkZjcyIiwic2lkIjoiYzFjMjdmYzAtMzRlNi00OTA2LThhMjItODc2OWIxNmRhMWVkIn0.QAol15Nm87uQEPsYEz1kbMGFNLI4vQ_Q-hV_lg0zM3s",
  "access_expires_at": "2026-10-28T11:09:32.952447721Z",
  "refresh_token": "-dmP32HaDSPXyh210ugKUd_Tpbj1Mt1ao6rRRwSwY3k",
  "refresh_expires_at": "2026-10-28T22:54:32.951958595Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679410000` → **200**

```json
{
  "deliveries": [
    {
      "id": "5f7fd491-9ac6-4e9c-85d9-d8448ebc670d",
      "challenge_id": "871ca274-28f7-4bc7-8623-0279765995cc",
      "phone": "+380679410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8da56a27-21d4-450c-a360-e5ea6ac26efd",
      "error": null,
      "attempted_at": "2026-10-28T10:54:32.54108Z"
    },
    {
      "id": "1d3824a5-5dc9-41c6-a820-fedfebae9776",
      "challenge_id": "871ca274-28f7-4bc7-8623-0279765995cc",
      "phone": "+380679410000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:54:32.54018Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679410000` → **200**

```json
{
  "phone": "+380679410000",
  "audience": "CLIENT",
  "code": "817016",
  "sent_at": "2026-10-28T10:54:32.540761302Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679522653` → **200**

```json
{
  "deliveries": [
    {
      "id": "22722395-8ceb-4f06-95fa-69d22f21cd4b",
      "challenge_id": "ba1a20b3-4b94-41a4-8374-1ce99611bc86",
      "phone": "+380679522653",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-74f72a7e-bde2-4e24-bf34-5319981594bc",
      "error": null,
      "attempted_at": "2026-10-28T10:54:32.315793Z"
    }
  ]
}
```

Done: SMS to +380673696376, a call to +380679522653, SMS then a call to +380679410000.

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
  "session_id": "4c7bc64d-ea8e-4117-9c3c-443f7280eb31",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NzMsImlhdCI6MTc5MzE4NDg3MywianRpIjoiNDNmY2EwZDAtZjBhMy00MDI4LWI1MDAtM2JiMzczNDkzYWVlIiwic2lkIjoiNGM3YmM2NGQtZWE4ZS00MTE3LTljM2MtNDQzZjcyODBlYjMxIn0.0a9vibdY5WtnsaODsSM25pndAtUTiVcef2mmFhMW4CQ",
  "access_expires_at": "2026-10-28T11:09:33.74552762Z",
  "refresh_token": "w3r0l4Fhm0jIbj2RQuCxuW-OB3f8gqi4xxhxUfbwORw",
  "refresh_expires_at": "2026-10-28T22:54:33.745145595Z",
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
  "session_id": "8a26cec4-ea2b-4c1a-ab3a-af0c51d958af",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3NzQsImlhdCI6MTc5MzE4NDg3NCwianRpIjoiNmEyMTdhMGMtMjY5ZC00MjZjLThlOWQtNTE4YTEyZWI1ZDQyIiwic2lkIjoiOGEyNmNlYzQtZWEyYi00YzFhLWFiM2EtYWYwYzUxZDk1OGFmIn0.7Ir0-dKg_7y5_moJ80qUMREvF1k0OiCQpkUOjIRSHYM",
  "access_expires_at": "2026-10-28T11:09:34.135032369Z",
  "refresh_token": "6b2O0HFlXmMOeer0hMFjDKeOqf5HFY0lzFywjLOqH4E",
  "refresh_expires_at": "2026-10-28T22:54:34.134695392Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
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

`POST /api/admin/v1/staff-extensions/fcb6deba-62d9-420e-bda0-4a37509298a1` → **200**

```json
{
  "command_id": "d56a3e35-ba82-4e48-9658-a51612e58a28",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "2b8baa4d-0cfc-4a06-b4e9-9c85c995ae1f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:54:34.860018Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:54:34.860018Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7ac6cee5-7128-4b8c-9dcc-f5eb8677c2d0",
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
  "id": "c8620281-17a9-4379-8a88-a418da389832",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:35.207684Z",
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
  "command_id": "851ac103-9956-4424-905e-1849954ac304",
  "quote_id": "c8620281-17a9-4379-8a88-a418da389832",
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
    "phone": "+380672237397"
  }
}
```

```json
{
  "id": "4cba893b-124f-421b-971b-ca65ab01609d",
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
  "created_at": "2026-10-28T10:54:35.38091Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672237397"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4cba893b-124f-421b-971b-ca65ab01609d/calls` → **201**

```json
{
  "command_id": "f8edd0b0-22a1-4ca7-80e9-504f7ba7026e",
  "to": "CALLER"
}
```

```json
{
  "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "order_ids": [
    "4cba893b-124f-421b-971b-ca65ab01609d"
  ],
  "started_at": "2026-10-28T10:54:35.572779Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4cba893b-124f-421b-971b-ca65ab01609d/calls` → **201**

```json
{
  "command_id": "f8edd0b0-22a1-4ca7-80e9-504f7ba7026e",
  "to": "CALLER"
}
```

```json
{
  "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "order_ids": [
    "4cba893b-124f-421b-971b-ca65ab01609d"
  ],
  "started_at": "2026-10-28T10:54:35.572779Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672237397",
    "at": "2026-10-28T10:54:35.574562973Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16843",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4cba893b-124f-421b-971b-ca65ab01609d` → **200**

```json
{
  "calls": [
    {
      "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [
        "4cba893b-124f-421b-971b-ca65ab01609d"
      ],
      "started_at": "2026-10-28T10:54:35.572779Z",
      "answered_at": "2026-10-28T10:54:35.968173Z",
      "ended_at": "2026-10-28T10:54:35.983786Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4cba893b-124f-421b-971b-ca65ab01609d` → **200**

```json
{
  "calls": [
    {
      "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [
        "4cba893b-124f-421b-971b-ca65ab01609d"
      ],
      "started_at": "2026-10-28T10:54:35.572779Z",
      "answered_at": "2026-10-28T10:54:35.968173Z",
      "ended_at": "2026-10-28T10:54:35.983786Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4cba893b-124f-421b-971b-ca65ab01609d` → **200**

```json
{
  "calls": [
    {
      "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [
        "4cba893b-124f-421b-971b-ca65ab01609d"
      ],
      "started_at": "2026-10-28T10:54:35.572779Z",
      "answered_at": "2026-10-28T10:54:35.968173Z",
      "ended_at": "2026-10-28T10:54:35.983786Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4cba893b-124f-421b-971b-ca65ab01609d` → **200**

```json
{
  "calls": [
    {
      "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [
        "4cba893b-124f-421b-971b-ca65ab01609d"
      ],
      "started_at": "2026-10-28T10:54:35.572779Z",
      "answered_at": "2026-10-28T10:54:35.968173Z",
      "ended_at": "2026-10-28T10:54:35.983786Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4cba893b-124f-421b-971b-ca65ab01609d` → **200**

```json
{
  "calls": [
    {
      "id": "6d10e1f1-6e66-4ef9-a517-c55a4cc817bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "order_ids": [
        "4cba893b-124f-421b-971b-ca65ab01609d"
      ],
      "started_at": "2026-10-28T10:54:35.572779Z",
      "answered_at": "2026-10-28T10:54:35.968173Z",
      "ended_at": "2026-10-28T10:54:35.983786Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:54:43.941786Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/4cba893b-124f-421b-971b-ca65ab01609d` → **200**

```json
{
  "id": "4cba893b-124f-421b-971b-ca65ab01609d",
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
  "created_at": "2026-10-28T10:54:35.38091Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672237397"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4cba893b-124f-421b-971b-ca65ab01609d/cancel` → **200**

```json
{
  "command_id": "bb4d16cd-28df-40df-af27-30e1fcedc150",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4cba893b-124f-421b-971b-ca65ab01609d",
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
  "created_at": "2026-10-28T10:54:35.38091Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672237397"
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
  "command_id": "9c82f0b6-0151-4dc5-863f-f6d38354801b",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T10:54:45.299119Z",
  "extension": "101"
}
```

Done: outgoing call 6d10e1f1-6e66-4ef9-a517-c55a4cc817bd from order 4cba893b-124f-421b-971b-ca65ab01609d, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630009158",
  "device_ref": "sandbox-12642"
}
```

```json
{
  "challenge_id": "7ee5baa8-cdde-4ede-9e3d-e4a9d43bd7e4",
  "expires_at": "2026-10-28T10:59:45.490134479Z",
  "resend_available_at": "2026-10-28T10:54:46.490134479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630009158` → **200**

```json
{
  "phone": "+380630009158",
  "audience": "CLIENT",
  "code": "024394",
  "sent_at": "2026-10-28T10:54:45.492111109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ee5baa8-cdde-4ede-9e3d-e4a9d43bd7e4",
  "code": "024394",
  "device_ref": "sandbox-12642"
}
```

```json
{
  "session_id": "f034f84b-8291-4182-8b5f-92b98823d23c",
  "subject": {
    "type": "CLIENT",
    "id": "b6ee8e08-38c3-493f-9652-0c2905121d2d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNmVlOGUwOC0zOGMzLTQ5M2YtOTY1Mi0wYzI5MDUxMjFkMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1Nzg1LCJpYXQiOjE3OTMxODQ4ODUsImp0aSI6IjU3YmQ3NzZmLTkwMzctNDBlOS04MTdlLTUzY2IyYzkxNzBmOCIsInNpZCI6ImYwMzRmODRiLTgyOTEtNDE4Mi04YjVmLTkyYjk4ODIzZDIzYyJ9.uLpLsoOlS0zejCdgPexADv0j5LSz9_OC2-7Y21hUbcs",
  "access_expires_at": "2026-10-28T11:09:45.689442394Z",
  "refresh_token": "aChCH-xw97bL_jZMz3CEQj5Zxr4BDpOWUi7dXjmnqHI",
  "refresh_expires_at": "2026-11-27T10:54:45.689051837Z",
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
  "session_id": "f6f593e5-f796-45f7-a3b8-f761a2e78f86",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3ODYsImlhdCI6MTc5MzE4NDg4NiwianRpIjoiZjdmM2EwMTAtYmIzYS00NjQ5LTkwNmYtNGViNjE4ZmFlMzU4Iiwic2lkIjoiZjZmNTkzZTUtZjc5Ni00NWY3LWEzYjgtZjc2MWEyZTc4Zjg2In0.Y1yXXrc4y0yd0cfYqnsJm78CG40SJaYMtoj1ODxA2f4",
  "access_expires_at": "2026-10-28T11:09:46.461322442Z",
  "refresh_token": "chkmL3TYFZwPUx-qnqVhyvMIZzUIP5SEz4MuGJxWHmE",
  "refresh_expires_at": "2026-10-28T22:54:46.460930282Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630009158` → **200**

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
  "correlation_id": "1849466c-2800-41f2-880c-ad02fdcf1134"
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
  "session_id": "2fada86b-209e-4aa6-bbab-007c8964ecd1",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3ODcsImlhdCI6MTc5MzE4NDg4NywianRpIjoiYjkyNzA0ZDktNmE0NC00NDdhLTk1MTItNDBkMTIwYWFiMzg3Iiwic2lkIjoiMmZhZGE4NmItMjA5ZS00YWE2LWJiYWItMDA3Yzg5NjRlY2QxIn0.40oMuVWD2VWPmJWS940FuT1snyzRYe_qIAaalVx028Q",
  "access_expires_at": "2026-10-28T11:09:47.249848858Z",
  "refresh_token": "ZOC7luGyh8hlnVsp6gHPelNk0Wov9dAh6ctXDo3GEig",
  "refresh_expires_at": "2026-10-28T22:54:47.249470749Z",
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
  "command_id": "926ef20c-b7bc-41af-909f-e74eea6c5607",
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
  "changed_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:54:47.616829545Z"
}
```

## The rider books the airport for 2026-10-28T13:54:47Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600128440",
  "device_ref": "sandbox-15086"
}
```

```json
{
  "challenge_id": "a4143d56-adf4-4fc4-b63c-080b0b023cb2",
  "expires_at": "2026-10-28T10:59:47.801442194Z",
  "resend_available_at": "2026-10-28T10:54:48.801442194Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600128440` → **200**

```json
{
  "phone": "+48600128440",
  "audience": "CLIENT",
  "code": "749541",
  "sent_at": "2026-10-28T10:54:47.803051566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4143d56-adf4-4fc4-b63c-080b0b023cb2",
  "code": "749541",
  "device_ref": "sandbox-15086"
}
```

```json
{
  "session_id": "f1430faa-90ba-4d49-9146-1ffa46586f84",
  "subject": {
    "type": "CLIENT",
    "id": "e3f92e9d-7cd3-4abe-969a-f119b831c8b7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlM2Y5MmU5ZC03Y2QzLTRhYmUtOTY5YS1mMTE5YjgzMWM4YjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1Nzg4LCJpYXQiOjE3OTMxODQ4ODgsImp0aSI6ImFhYjZmNmNhLWYzYjUtNDVmNi05ZWNjLWFlZTE5ZjQzZDVjMiIsInNpZCI6ImYxNDMwZmFhLTkwYmEtNGQ0OS05MTQ2LTFmZmE0NjU4NmY4NCJ9.vaMhGlb3_NC8o4upXGaNwZfGZUQRrUOTkZ9G3WJ247k",
  "access_expires_at": "2026-10-28T11:09:48.005548771Z",
  "refresh_token": "HwCwqeVLUrrIL1OA9hwDQrer9apQ7co8rDdKR5EfcMc",
  "refresh_expires_at": "2026-11-27T10:54:48.005161848Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2314ca1f-f944-46d3-b35c-c65e50ce2646",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:54:47Z"
}
```

```json
{
  "id": "7b9dc5c8-0ec0-4770-a9ac-49b3680c9811",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:48.208881Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:54:47Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "53a73177-d862-4049-9f2a-8f3dda557d4a",
  "quote_id": "7b9dc5c8-0ec0-4770-a9ac-49b3680c9811",
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
  "pickup_at": "2026-10-28T13:54:47Z"
}
```

```json
{
  "id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e3f92e9d-7cd3-4abe-969a-f119b831c8b7",
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
  "created_at": "2026-10-28T10:54:48.399333Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:54:47Z",
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
  "device_ref": "sandbox-14662"
}
```

```json
{
  "challenge_id": "73c13615-bef0-45ff-81a2-4f0f81799c88",
  "expires_at": "2026-10-28T10:59:48.583111103Z",
  "resend_available_at": "2026-10-28T10:54:49.583111103Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "801858",
  "sent_at": "2026-10-28T10:54:48.58479972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73c13615-bef0-45ff-81a2-4f0f81799c88",
  "code": "801858",
  "device_ref": "sandbox-14662"
}
```

```json
{
  "session_id": "c0ecfcd1-760a-4dc3-91c7-3f62f3eff981",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTc4OCwiaWF0IjoxNzkzMTg0ODg4LCJqdGkiOiI5NWU4ZGJjNS0yOTVkLTQ4ZDUtYjA2OS0wODk4NTY3NThhODIiLCJzaWQiOiJjMGVjZmNkMS03NjBhLTRkYzMtOTFjNy0zZjYyZjNlZmY5ODEifQ.oTTlnByVhhFPSTnOsD6BkOqzu_3iM7Bpl82X5h7TuVg",
  "access_expires_at": "2026-10-28T11:09:48.781986528Z",
  "refresh_token": "GDW5y6uh-U7qQ21_YELv-Pw6CxmjZ9KeGgBqpimLQlg",
  "refresh_expires_at": "2026-11-27T10:54:48.781577853Z",
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
  "command_id": "b53cd272-f2d2-4e2e-b6fc-4388326ae54b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:49Z",
    "sequence": 1793184889134
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5e79f157-7aec-448a-9ef1-6cd67082d79f",
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
  "last_heartbeat_at": "2026-10-28T10:54:49.14983Z",
  "last_location_at": "2026-10-28T10:54:49.14983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
      "short_number": 18,
      "pickup_at": "2026-10-28T13:54:47Z",
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

`POST /api/driver/v1/preorders/89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1/reserve` → **200**

```json
{
  "command_id": "8e8a79f4-7d73-4801-ba92-2fad638da249"
}
```

```json
{
  "id": "30b310a6-49d8-448c-b695-ab633392fb62",
  "state": "RESERVED",
  "order": {
    "order_id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
    "short_number": 18,
    "pickup_at": "2026-10-28T13:54:47Z",
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
  "reserved_at": "2026-10-28T10:54:49.51458Z",
  "confirm_from": "2026-10-28T13:24:47Z",
  "confirm_until": "2026-10-28T13:34:47Z",
  "drop_until": "2026-10-28T12:54:47Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "30b310a6-49d8-448c-b695-ab633392fb62",
      "state": "RESERVED",
      "order": {
        "order_id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:54:47Z",
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
      "reserved_at": "2026-10-28T10:54:49.51458Z",
      "confirm_from": "2026-10-28T13:24:47Z",
      "confirm_until": "2026-10-28T13:34:47Z",
      "drop_until": "2026-10-28T12:54:47Z"
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
      "id": "30b310a6-49d8-448c-b695-ab633392fb62",
      "state": "RESERVED",
      "order": {
        "order_id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:54:47Z",
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
      "reserved_at": "2026-10-28T10:54:49.51458Z",
      "confirm_from": "2026-10-28T13:24:47Z",
      "confirm_until": "2026-10-28T13:34:47Z",
      "drop_until": "2026-10-28T12:54:47Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/30b310a6-49d8-448c-b695-ab633392fb62/confirm` → **409**

```json
{
  "command_id": "f0fc4eab-84be-4f26-93ed-6544e1c43af5"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/30b310a6-49d8-448c-b695-ab633392fb62/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1da9a53a-06a1-4b27-b769-1afb27e6403b"
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
  "session_id": "5c34d9c1-d97f-4dd0-8708-9ba72602a98b",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3OTAsImlhdCI6MTc5MzE4NDg5MCwianRpIjoiYjA3MGFkNzAtY2Y2MC00NzM0LWI2MDItMGIxMDQ5ZGY5NzkyIiwic2lkIjoiNWMzNGQ5YzEtZDk3Zi00ZGQwLTg3MDgtOWJhNzI2MDJhOThiIn0.jE2mWpMx3N6lVYSR9AJl5Vahi8TIyEmAJzcyPK42H8k",
  "access_expires_at": "2026-10-28T11:09:50.481059189Z",
  "refresh_token": "bthNpW5UNdJ8gxazZ8psOCXexP07AGdRQ9jnvphYChM",
  "refresh_expires_at": "2026-10-28T22:54:50.480660379Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1` → **200**

```json
{
  "id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e3f92e9d-7cd3-4abe-969a-f119b831c8b7",
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
  "created_at": "2026-10-28T10:54:48.399333Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:54:47Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "30b310a6-49d8-448c-b695-ab633392fb62",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:54:49.51458Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:54:48.400218Z",
      "actor": {
        "type": "CLIENT",
        "id": "e3f92e9d-7cd3-4abe-969a-f119b831c8b7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
        "preorder": true,
        "quote_id": "7b9dc5c8-0ec0-4770-a9ac-49b3680c9811",
        "pickup_at": "2026-10-28T13:54:47Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4717633c-c6bd-4c8c-a68a-c231b94124ec"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:54:49.51549Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "30b310a6-49d8-448c-b695-ab633392fb62"
      },
      "correlation_id": "c43ee3db-32af-495d-8ee2-4ed3d983baf0"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 89a465ea-1ba6-4efa-b515-b8a3e7b0e3b1, reservation 30b310a6-49d8-448c-b695-ab633392fb62.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29291"
}
```

```json
{
  "challenge_id": "ec82731a-ac7d-47f1-95f6-7a138e5144b2",
  "expires_at": "2026-10-28T10:59:51.029648736Z",
  "resend_available_at": "2026-10-28T10:54:52.029648736Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "194514",
  "sent_at": "2026-10-28T10:54:51.031560613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec82731a-ac7d-47f1-95f6-7a138e5144b2",
  "code": "194514",
  "device_ref": "sandbox-29291"
}
```

```json
{
  "session_id": "785b2efc-3d8f-4919-9c0f-129e92fb6a83",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTc5MSwiaWF0IjoxNzkzMTg0ODkxLCJqdGkiOiI3NTVjMjBjMi0wMGM3LTRiN2EtODc1NS03NzYyM2M5NjVlMjYiLCJzaWQiOiI3ODViMmVmYy0zZDhmLTQ5MTktOWMwZi0xMjllOTJmYjZhODMifQ.VUZjk0aIeHbTE1nLpggTSvb1R9Ni84B8exE2lQ-or6s",
  "access_expires_at": "2026-10-28T11:09:51.233097182Z",
  "refresh_token": "INTCtJgO2ZkMP2V8PZIEOyFA1Uc4SAAQI8E9RH0WKxA",
  "refresh_expires_at": "2026-11-27T10:54:51.232713945Z",
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
  "command_id": "35ac486f-a051-4749-8324-90885d6d971b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:51Z",
    "sequence": 1793184891584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0933bffe-431b-42ae-a771-d95b45db4a13",
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
  "last_heartbeat_at": "2026-10-28T10:54:51.599996Z",
  "last_location_at": "2026-10-28T10:54:51.599996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671442330",
  "device_ref": "sandbox-11834"
}
```

```json
{
  "challenge_id": "e54c6562-135a-4d54-b344-7c4b00bb7162",
  "expires_at": "2026-10-28T10:59:51.778361133Z",
  "resend_available_at": "2026-10-28T10:54:52.778361133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671442330` → **200**

```json
{
  "phone": "+380671442330",
  "audience": "CLIENT",
  "code": "619981",
  "sent_at": "2026-10-28T10:54:51.780045137Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e54c6562-135a-4d54-b344-7c4b00bb7162",
  "code": "619981",
  "device_ref": "sandbox-11834"
}
```

```json
{
  "session_id": "84a5ab8c-881c-499e-892a-59417f89ff1e",
  "subject": {
    "type": "CLIENT",
    "id": "fc74a19e-bee4-4d11-85ed-751bad6b687d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzc0YTE5ZS1iZWU0LTRkMTEtODVlZC03NTFiYWQ2YjY4N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1NzkxLCJpYXQiOjE3OTMxODQ4OTEsImp0aSI6ImNkM2ViOTRiLWYxZjgtNDczMS05ZjgxLTJhZGNkMzhlM2YxNyIsInNpZCI6Ijg0YTVhYjhjLTg4MWMtNDk5ZS04OTJhLTU5NDE3Zjg5ZmYxZSJ9.qzdpz0xJlIPoRxZcu6LOEI1ef0hJq_Yeggz8Cfg2p1s",
  "access_expires_at": "2026-10-28T11:09:51.981547935Z",
  "refresh_token": "8-_Looo91-RXoQw3hryBXjUY2pTdPB7GwZm0jq1QsDI",
  "refresh_expires_at": "2026-11-27T10:54:51.981167503Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "964b8359-99b9-45ea-a888-43cb86e1244d",
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
  "id": "90ba6ec4-7ba0-466c-b929-b979e7501e9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:59:52.162006Z",
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
  "command_id": "7f1da400-b0a5-41b0-9713-4b1b1a37412b",
  "quote_id": "90ba6ec4-7ba0-466c-b929-b979e7501e9e",
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
  "id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc74a19e-bee4-4d11-85ed-751bad6b687d",
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
  "created_at": "2026-10-28T10:54:52.350516Z",
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
    "id": "f58f759d-5439-4c4f-8d61-946593802c49",
    "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
    "expires_at": "2026-10-28T10:55:07.355631Z",
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

`POST /api/driver/v1/offers/f58f759d-5439-4c4f-8d61-946593802c49/accept` → **200**

```json
{
  "command_id": "f06082b8-ed71-4426-b989-a33f92ab149f"
}
```

```json
{
  "id": "ba12a958-854f-4ff6-a235-badb015b0a3d",
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c",
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "assignment_id": "ba12a958-854f-4ff6-a235-badb015b0a3d",
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

`POST /api/driver/v1/work-sessions/0933bffe-431b-42ae-a771-d95b45db4a13/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:53Z",
    "sequence": 1793184893762
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0933bffe-431b-42ae-a771-d95b45db4a13",
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
  "last_heartbeat_at": "2026-10-28T10:54:53.092478Z",
  "last_location_at": "2026-10-28T10:54:53.092478Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c",
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "assignment_id": "ba12a958-854f-4ff6-a235-badb015b0a3d",
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

`POST /api/driver/v1/trips/bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c/arrive` → **200**

```json
{
  "command_id": "2d62f818-b3ab-44cf-a923-b81797f5e95e",
  "expected_version": 0
}
```

```json
{
  "id": "bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c",
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "assignment_id": "ba12a958-854f-4ff6-a235-badb015b0a3d",
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
  "arrived_at": "2026-10-28T10:54:53.453086Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c/start` → **200**

```json
{
  "command_id": "8f6ac505-2e92-46e0-af14-45bb05f648b7",
  "expected_version": 1
}
```

```json
{
  "id": "bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c",
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "assignment_id": "ba12a958-854f-4ff6-a235-badb015b0a3d",
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
  "arrived_at": "2026-10-28T10:54:53.453086Z",
  "started_at": "2026-10-28T10:54:53.637279Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0933bffe-431b-42ae-a771-d95b45db4a13/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:54:53Z",
    "sequence": 1793184893818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0933bffe-431b-42ae-a771-d95b45db4a13",
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
  "last_heartbeat_at": "2026-10-28T10:54:53.834401Z",
  "last_location_at": "2026-10-28T10:54:53.834401Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c/complete` → **200**

```json
{
  "command_id": "cee5c1c7-d4ca-402f-8900-f94fd014ca40",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:54:54Z",
  "cash_received": true
}
```

```json
{
  "id": "bd21d9b1-25fa-4214-9ab7-5bfcdba9e05c",
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "assignment_id": "ba12a958-854f-4ff6-a235-badb015b0a3d",
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
  "arrived_at": "2026-10-28T10:54:53.453086Z",
  "started_at": "2026-10-28T10:54:53.637279Z",
  "completed_at": "2026-10-28T10:54:54.022919Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f18efe21-f735-47d7-818a-44f49e205e54/rating` → **200**

```json
{
  "command_id": "0bcf515e-5c44-4486-b648-08926efe0292",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "score": 5,
  "created_at": "2026-10-28T10:54:54.261013808Z"
}
```

`POST /api/driver/v1/orders/f18efe21-f735-47d7-818a-44f49e205e54/rating` → **200**

```json
{
  "command_id": "ec3f5247-b979-4417-9dcb-fea0e7a687d1",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
  "score": 4,
  "created_at": "2026-10-28T10:54:54.451991496Z"
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
  "session_id": "6dc9fb87-c686-4e99-a2ee-96eeaa0be05a",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3OTUsImlhdCI6MTc5MzE4NDg5NSwianRpIjoiNGE4NjQzNGMtM2NhZC00Nzg1LTljNWEtNzRhMTI3ZDE4ODQ2Iiwic2lkIjoiNmRjOWZiODctYzY4Ni00ZTk5LWEyZWUtOTZlZWFhMGJlMDVhIn0.YAfF3h0gZrf7QpQODhKgL2SsJkQCm5vatDS305OzjdQ",
  "access_expires_at": "2026-10-28T11:09:55.070043808Z",
  "refresh_token": "JHG2Iik0djc6zkt7rgENTcdKdDCQGZ15NxGjfO0g0a4",
  "refresh_expires_at": "2026-10-28T22:54:55.069601698Z",
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
  "session_id": "08f8537e-9623-46ce-8a68-b8a99cf09517",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3OTUsImlhdCI6MTc5MzE4NDg5NSwianRpIjoiMWYzZTliODUtNTFiYy00MzNhLTgxNzYtNWJmNzQ0MTkzZjlkIiwic2lkIjoiMDhmODUzN2UtOTYyMy00NmNlLThhNjgtYjhhOTljZjA5NTE3In0.iVM8Vw3al8N-ehCpjMMv7dS6fTRO-qR1KcmSCDvk-aY",
  "access_expires_at": "2026-10-28T11:09:55.461762044Z",
  "refresh_token": "OYYpHXCZ9VBWEC8T_8u045v2NytvsZ6H2VWiioMjouk",
  "refresh_expires_at": "2026-10-28T22:54:55.461365417Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f18efe21-f735-47d7-818a-44f49e205e54/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
      "author_type": "RIDER",
      "author_id": "fc74a19e-bee4-4d11-85ed-751bad6b687d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T10:54:54.261014Z"
    },
    {
      "order_id": "f18efe21-f735-47d7-818a-44f49e205e54",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "fc74a19e-bee4-4d11-85ed-751bad6b687d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T10:54:54.451991Z"
    }
  ]
}
```

Done: ratings for order f18efe21-f735-47d7-818a-44f49e205e54.

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
  "session_id": "6d68d6b5-e80b-4bb8-ac6f-4a3318b5b977",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU3OTYsImlhdCI6MTc5MzE4NDg5NiwianRpIjoiMWM0YWQ4NTMtZjVjNC00MjMzLThmYjMtZjQ3YjQ4MTIxNDc2Iiwic2lkIjoiNmQ2OGQ2YjUtZTgwYi00YmI4LWFjNmYtNGEzMzE4YjViOTc3In0.ykqkopTpBVYBLCUEnu3K-Ji0RzC_-lvtrnzUOJwBH5Y",
  "access_expires_at": "2026-10-28T11:09:56.045760789Z",
  "refresh_token": "4Kutr1lyT8etbmRG_IQVCcIHzhqaP9wpnx5O89uDH0s",
  "refresh_expires_at": "2026-10-28T22:54:56.045406836Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8cf82533-e8ec-4c53-9cc8-6aab8e8a5f32",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "98842448-3a13-4e19-b8ba-4292feee421a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:54:56.234781Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/98842448-3a13-4e19-b8ba-4292feee421a` → **200**

```json
{
  "id": "98842448-3a13-4e19-b8ba-4292feee421a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:54:56.234781Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/98842448-3a13-4e19-b8ba-4292feee421a` → **200**

```json
{
  "id": "98842448-3a13-4e19-b8ba-4292feee421a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:54:56.234781Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/98842448-3a13-4e19-b8ba-4292feee421a` → **200**

```json
{
  "id": "98842448-3a13-4e19-b8ba-4292feee421a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:54:56.234781Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/98842448-3a13-4e19-b8ba-4292feee421a` → **200**

```json
{
  "id": "98842448-3a13-4e19-b8ba-4292feee421a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:54:56.234781Z",
  "ready_at": "2026-10-28T10:54:58.967598Z",
  "expires_at": "2026-10-29T10:54:58.967598Z"
}
```

`GET /api/admin/v1/reports/exports/98842448-3a13-4e19-b8ba-4292feee421a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "bd6eb4c2-175f-4961-8c22-0a046ccf4c4a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "8df29083-a568-4d38-b4dc-7650150d20f8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:55:00.193539Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8df29083-a568-4d38-b4dc-7650150d20f8` → **200**

```json
{
  "id": "8df29083-a568-4d38-b4dc-7650150d20f8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:55:00.193539Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8df29083-a568-4d38-b4dc-7650150d20f8` → **200**

```json
{
  "id": "8df29083-a568-4d38-b4dc-7650150d20f8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:55:00.193539Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8df29083-a568-4d38-b4dc-7650150d20f8` → **200**

```json
{
  "id": "8df29083-a568-4d38-b4dc-7650150d20f8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:55:00.193539Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8df29083-a568-4d38-b4dc-7650150d20f8` → **200**

```json
{
  "id": "8df29083-a568-4d38-b4dc-7650150d20f8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:55:00.193539Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8df29083-a568-4d38-b4dc-7650150d20f8` → **200**

```json
{
  "id": "8df29083-a568-4d38-b4dc-7650150d20f8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:55:00.193539Z",
  "ready_at": "2026-10-28T10:55:03.975111Z",
  "expires_at": "2026-10-29T10:55:03.975111Z"
}
```

`GET /api/admin/v1/reports/exports/8df29083-a568-4d38-b4dc-7650150d20f8/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/1b8a61ca-5a92-4a64-aa54-7f10f3b27ae2` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/1b8a61ca-5a92-4a64-aa54-7f10f3b27ae2",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f41131d9-69ff-4dd2-a99d-6405c761e45f"
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
  "device_ref": "sandbox-6241"
}
```

```json
{
  "challenge_id": "f95008a2-b6c2-411f-ad78-e1d82afc785a",
  "expires_at": "2026-10-28T11:00:05.455798449Z",
  "resend_available_at": "2026-10-28T10:55:06.455798449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "553987",
  "sent_at": "2026-10-28T10:55:05.458236142Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f95008a2-b6c2-411f-ad78-e1d82afc785a",
  "code": "553987",
  "device_ref": "sandbox-6241"
}
```

```json
{
  "session_id": "915837db-2187-4206-ba9b-f5f3f262c7aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTgwNSwiaWF0IjoxNzkzMTg0OTA1LCJqdGkiOiIyNmJkZGRhOC0wZjk3LTQ5OGYtYjIzMy1jYzY5NmI5MjFmMGEiLCJzaWQiOiI5MTU4MzdkYi0yMTg3LTQyMDYtYmE5Yi1mNWYzZjI2MmM3YWEifQ.zeKt-gyM5eesREUdR1UUYgrGSwxMXDQcel6k7GwUrsM",
  "access_expires_at": "2026-10-28T11:10:05.65001773Z",
  "refresh_token": "DYiBGnsDPzaqHChFIlejYeIjEeBP2U8pIdk567B0MS4",
  "refresh_expires_at": "2026-11-27T10:55:05.649424447Z",
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
  "command_id": "ead426db-a1f4-48e7-b06b-df18bb9031c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:55:06Z",
    "sequence": 1793184906162
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c2b73be-c233-4ae8-a1f8-b8bdf9469ccf",
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
  "last_heartbeat_at": "2026-10-28T10:55:06.177486Z",
  "last_location_at": "2026-10-28T10:55:06.177486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "1be99f92-a50c-4e25-ada5-85895af725fc",
  "points": [
    {
      "sequence": 1793184908353,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:54:08Z"
    },
    {
      "sequence": 1793184908360,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:55:08Z"
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
  "session_id": "db216d8a-cfb8-4108-92d6-fa801de6bf3d",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU4MDgsImlhdCI6MTc5MzE4NDkwOCwianRpIjoiNjMzMmUwNzAtMzdhNi00NDYwLTk5N2YtNjJkOTg0Y2ZiNDhhIiwic2lkIjoiZGIyMTZkOGEtY2ZiOC00MTA4LTkyZDYtZmE4MDFkZTZiZjNkIn0.E4CL8xkYXHyle3J_-_YaB8RykR8Iz0aGj03PLvQSVb0",
  "access_expires_at": "2026-10-28T11:10:08.767175753Z",
  "refresh_token": "wffN2CeHYkj7vzIzsNjar_Xh7bwciTsds5Qo8IkRHQ0",
  "refresh_expires_at": "2026-10-28T22:55:08.76678872Z",
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
      "id": "24e285d3-6bb1-4beb-b1ab-d65a6c6abfb9",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:55:08Z",
        "track_point_id": "970dceb9-01c8-4fae-aaf9-7a639043f645",
        "work_session_id": "0c2b73be-c233-4ae8-a1f8-b8bdf9469ccf"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:55:08Z",
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

`POST /api/admin/v1/driver-risk-flags/24e285d3-6bb1-4beb-b1ab-d65a6c6abfb9/confirm` → **200**

```json
{
  "command_id": "2b73fdff-9b05-4825-9443-aa799957e300",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "24e285d3-6bb1-4beb-b1ab-d65a6c6abfb9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:55:08Z",
    "track_point_id": "970dceb9-01c8-4fae-aaf9-7a639043f645",
    "work_session_id": "0c2b73be-c233-4ae8-a1f8-b8bdf9469ccf"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:55:08Z",
  "reason": null,
  "reviewed_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "reviewed_at": "2026-10-28T10:55:10.470802Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/24e285d3-6bb1-4beb-b1ab-d65a6c6abfb9/dismiss` → **409**

```json
{
  "command_id": "c0dd627c-d975-4f43-a19d-0cb815f4a9cb",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/24e285d3-6bb1-4beb-b1ab-d65a6c6abfb9/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0f5187b2-6335-476b-b671-18fc530afb82"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "14b8608a-05c9-4bae-b405-fb459435e0ea",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "38fd3bc8-b2ea-48a7-8a35-003da1555a70",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "raised_at": "2026-10-28T10:55:10.831895Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/38fd3bc8-b2ea-48a7-8a35-003da1555a70/dismiss` → **200**

```json
{
  "command_id": "01bb3c42-b9b4-44d8-b7a7-5be9669daaae",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "38fd3bc8-b2ea-48a7-8a35-003da1555a70",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "raised_at": "2026-10-28T10:55:10.831895Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "reviewed_at": "2026-10-28T10:55:11.007333Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "e53ce15b-9593-472a-be72-6e20475bdd40",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "24e285d3-6bb1-4beb-b1ab-d65a6c6abfb9"
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
      "actor_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:55:11.1915Z"
    }
  ]
}
```

Done: flag 24e285d3-6bb1-4beb-b1ab-d65a6c6abfb9 confirmed, suspension named it, driver reinstated.

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
  "session_id": "749511fb-443a-40e7-a18a-d0c85a5c2437",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU4MTEsImlhdCI6MTc5MzE4NDkxMSwianRpIjoiNTMwNDgxNDktMjU4OC00ZDM1LWFhYmMtMDEzMmIxOWRlODU2Iiwic2lkIjoiNzQ5NTExZmItNDQzYS00MGU3LWExOGEtZDBjODVhNWMyNDM3In0.z_DLHt5n-9vVu4HKIY6YmvQAwewn5r0rFLRmvsZWjUM",
  "access_expires_at": "2026-10-28T11:10:11.737666545Z",
  "refresh_token": "pBQpCERROhWv25cOKHtB48aIryw-rS5X1PdHyVD6pWI",
  "refresh_expires_at": "2026-10-28T22:55:11.737118836Z",
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
      "actor_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:55:11.1915Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5a087b84-619c-4b8d-9d13-4e5080cf3892",
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
  "session_id": "0c2b73be-c233-4ae8-a1f8-b8bdf9469ccf",
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
  "last_heartbeat_at": "2026-10-28T10:55:06.177486Z",
  "last_location_at": "2026-10-28T10:55:06.177486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0c2b73be-c233-4ae8-a1f8-b8bdf9469ccf/close` → **200**

```json
{
  "command_id": "5343f945-4a38-4b62-ab4b-f0677ecb84a8",
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
  "session_id": "b1356fb3-18c3-4935-8382-b0d34868bc4a",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU4MTIsImlhdCI6MTc5MzE4NDkxMiwianRpIjoiOWIxYTA1NWItYTk0OS00OTU0LWFlMTUtNTczNzc3ZDA4OTU1Iiwic2lkIjoiYjEzNTZmYjMtMThjMy00OTM1LTgzODItYjBkMzQ4NjhiYzRhIn0.NHLaaNg_h1HZWXp4o4OHfGQCApMD0VYXp0eIcsYcaM8",
  "access_expires_at": "2026-10-28T11:10:12.831311007Z",
  "refresh_token": "m9CqedYX6WeBTxPi9VrGaUgd-jTa1M8UGw9gEw0vAHQ",
  "refresh_expires_at": "2026-10-28T22:55:12.830721219Z",
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
  "command_id": "b7b5ebf7-a9e5-4609-8960-246bc00f9bc4",
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
  "changed_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:55:13.180935Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "b7b5ebf7-a9e5-4609-8960-246bc00f9bc4",
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
  "changed_by": "fcb6deba-62d9-420e-bda0-4a37509298a1",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:55:13.180935Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48722704330",
  "device_ref": "sandbox-26950"
}
```

```json
{
  "challenge_id": "269f071b-db52-42d4-a560-a5275b3e7fe1",
  "expires_at": "2026-10-28T11:00:13.54586557Z",
  "resend_available_at": "2026-10-28T10:55:14.54586557Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48722704330` → **200**

```json
{
  "phone": "+48722704330",
  "audience": "CLIENT",
  "code": "588762",
  "sent_at": "2026-10-28T10:55:13.548129608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "269f071b-db52-42d4-a560-a5275b3e7fe1",
  "code": "588762",
  "device_ref": "sandbox-26950"
}
```

```json
{
  "session_id": "8a36706c-b009-4b39-aca9-555052dd5a25",
  "subject": {
    "type": "CLIENT",
    "id": "50435f3f-ddca-4763-8569-047e5d623d0f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDQzNWYzZi1kZGNhLTQ3NjMtODU2OS0wNDdlNWQ2MjNkMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1ODEzLCJpYXQiOjE3OTMxODQ5MTMsImp0aSI6Ijk0ZmQ4ZjVlLWRhNTgtNDUwMC05ZTJlLWU4OGNkODM0ZmI2MSIsInNpZCI6IjhhMzY3MDZjLWIwMDktNGIzOS1hY2E5LTU1NTA1MmRkNWEyNSJ9.HBUtfWs-RHqfcKPsTiysN10JlJjJpRjfMdni-3ZB13M",
  "access_expires_at": "2026-10-28T11:10:13.734871558Z",
  "refresh_token": "Oro8w-3k6IRomjvF_pV9QudVeiS8JBM-zwjPdFsSYkg",
  "refresh_expires_at": "2026-11-27T10:55:13.73438418Z",
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
  "correlation_id": "e59627d7-3f1e-4b3a-9517-8c4568ec76f4"
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
  "device_ref": "sandbox-5364"
}
```

```json
{
  "challenge_id": "1a3b05ac-73ee-4982-a532-5a19ff80e6c2",
  "expires_at": "2026-10-28T11:00:14.23993354Z",
  "resend_available_at": "2026-10-28T10:55:15.23993354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "559463",
  "sent_at": "2026-10-28T10:55:14.241403632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a3b05ac-73ee-4982-a532-5a19ff80e6c2",
  "code": "559463",
  "device_ref": "sandbox-5364"
}
```

```json
{
  "session_id": "38d6474b-5e1c-475c-8192-8a8f00206984",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTgxNCwiaWF0IjoxNzkzMTg0OTE0LCJqdGkiOiJjZDAyZjg3YS0wMTZjLTRmNTYtYmEwNy00YmY2ZjM5ZDJmMzMiLCJzaWQiOiIzOGQ2NDc0Yi01ZTFjLTQ3NWMtODE5Mi04YThmMDAyMDY5ODQifQ.9WxuXZUPdzuSWM4CWQaVI-m5QUcRqpDNkPLJFcGyA0U",
  "access_expires_at": "2026-10-28T11:10:14.434756122Z",
  "refresh_token": "kARzZ1UXNRwe4dHaSQtkkf7VDuGs8VqxDJkOsZIPAGk",
  "refresh_expires_at": "2026-11-27T10:55:14.434281277Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5e79f157-7aec-448a-9ef1-6cd67082d79f",
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
  "last_heartbeat_at": "2026-10-28T10:54:49.14983Z",
  "last_location_at": "2026-10-28T10:54:49.14983Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5e79f157-7aec-448a-9ef1-6cd67082d79f/handover` → **200**

```json
{
  "command_id": "13e4d427-e83c-42dd-a2c1-d47f866e9ed6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5e79f157-7aec-448a-9ef1-6cd67082d79f",
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
  "last_heartbeat_at": "2026-10-28T10:54:49.14983Z",
  "last_location_at": "2026-10-28T10:54:49.14983Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5e79f157-7aec-448a-9ef1-6cd67082d79f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:55:14Z",
    "sequence": 1793184914950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5e79f157-7aec-448a-9ef1-6cd67082d79f",
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
  "last_heartbeat_at": "2026-10-28T10:55:14.965121Z",
  "last_location_at": "2026-10-28T10:55:14.965121Z",
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
  "session_id": "5e79f157-7aec-448a-9ef1-6cd67082d79f",
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
  "last_heartbeat_at": "2026-10-28T10:55:14.965121Z",
  "last_location_at": "2026-10-28T10:55:14.965121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5e79f157-7aec-448a-9ef1-6cd67082d79f/close` → **200**

```json
{
  "command_id": "d8935cc7-82c4-418b-8ab1-2526139ebb82",
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
  "correlation_id": "5872d3be-c705-4dcd-af7c-e01f4d3b65fa"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673712100",
  "device_ref": "sandbox-24687"
}
```

```json
{
  "challenge_id": "43366860-4dfd-4795-af5a-b46936bee317",
  "expires_at": "2026-10-28T11:00:15.82018073Z",
  "resend_available_at": "2026-10-28T10:55:16.82018073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673712100` → **200**

```json
{
  "phone": "+380673712100",
  "audience": "CLIENT",
  "code": "757318",
  "sent_at": "2026-10-28T10:55:15.8219815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43366860-4dfd-4795-af5a-b46936bee317",
  "code": "757318",
  "device_ref": "sandbox-24687"
}
```

```json
{
  "session_id": "2862890f-823e-4559-99a3-515ee947bbaf",
  "subject": {
    "type": "CLIENT",
    "id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTA4YWE4MS1kYWI3LTQ4YzctOWVhOS1hNjgzYTcyYjBkNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg1ODE2LCJpYXQiOjE3OTMxODQ5MTYsImp0aSI6ImZhOGQ4MmQyLTU3YzQtNGIwMy1iOTcyLTU5OTM3MjFkYjI3ZSIsInNpZCI6IjI4NjI4OTBmLTgyM2UtNDU1OS05OWEzLTUxNWVlOTQ3YmJhZiJ9.dv31uPaCFa1925Jt-TwJLfbNBz7XbbINJY13nqqlApg",
  "access_expires_at": "2026-10-28T11:10:16.012527727Z",
  "refresh_token": "BUFjVuKicue-eUmyyo82wxTl7tE50SRov3yctLs-ORQ",
  "refresh_expires_at": "2026-11-27T10:55:16.012148947Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "90a55119-53f9-4ab1-8dd4-118af48ada79",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "206d208c-d57e-47d3-b8ea-af1c0a2040c7",
  "upload_path": "/api/rider/v1/uploads/206d208c-d57e-47d3-b8ea-af1c0a2040c7",
  "expires_at": "2026-10-28T11:10:16.189145853Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/206d208c-d57e-47d3-b8ea-af1c0a2040c7` → **200**

```json
{
  "file_id": "206d208c-d57e-47d3-b8ea-af1c0a2040c7",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "71173fa2-8191-42d8-a48d-e7677d6500d2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "206d208c-d57e-47d3-b8ea-af1c0a2040c7"
  ]
}
```

```json
{
  "id": "38db8386-02f7-4c60-83a9-9009f1a9b945",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:55:16.385122Z",
  "updated_at": "2026-10-28T10:55:16.385122Z",
  "messages": [
    {
      "id": "5960127a-bcd3-40cf-81d6-d101ca317a5d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:55:16.386237Z",
      "attachments": [
        {
          "file_id": "206d208c-d57e-47d3-b8ea-af1c0a2040c7",
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
  "session_id": "25847166-1caf-4454-aac9-2237e20a94ba",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU4MTYsImlhdCI6MTc5MzE4NDkxNiwianRpIjoiNTk4YTIwNWItYmI3NS00YTMwLTlkMzEtMzg5MGM0MDJhN2U3Iiwic2lkIjoiMjU4NDcxNjYtMWNhZi00NDU0LWFhYzktMjIzN2UyMGE5NGJhIn0.sacS_MRNFx3XNNw_X-78oxQhnOjuBxfFuZXrPGCStp4",
  "access_expires_at": "2026-10-28T11:10:16.777027492Z",
  "refresh_token": "hYWLbu2YdUUskRgrB-n8-PftQ_GJn6hNLyaRYtVLebM",
  "refresh_expires_at": "2026-10-28T22:55:16.776627304Z",
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
  "session_id": "2e27a2ac-680b-45da-8e80-2dbaf3fbdcc3",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU4MTcsImlhdCI6MTc5MzE4NDkxNywianRpIjoiNTAxNWFiMDgtZGU2OC00MWMyLTkzYTktYWE1ZGIyY2FlZDIyIiwic2lkIjoiMmUyN2EyYWMtNjgwYi00NWRhLThlODAtMmRiYWYzZmJkY2MzIn0.aCMwGNNfuy2JbqBGcnwHdvWViquSCnAx2fIIxfDvIEI",
  "access_expires_at": "2026-10-28T11:10:17.1485879Z",
  "refresh_token": "5TUeNWp6sQFzjrrnwAH0jHR0TOHGCidm9QoP7og6UCo",
  "refresh_expires_at": "2026-10-28T22:55:17.148253507Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/38db8386-02f7-4c60-83a9-9009f1a9b945/attachments/206d208c-d57e-47d3-b8ea-af1c0a2040c7` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "5e9d5850-6f46-4de6-bc34-24503ba63a20",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "58d542ea-4c43-4bf5-97c5-edc4a6dffa57",
  "upload_path": "/api/operator/v1/uploads/58d542ea-4c43-4bf5-97c5-edc4a6dffa57",
  "expires_at": "2026-10-28T11:10:17.333677225Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/58d542ea-4c43-4bf5-97c5-edc4a6dffa57` → **200**

```json
{
  "file_id": "58d542ea-4c43-4bf5-97c5-edc4a6dffa57",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/38db8386-02f7-4c60-83a9-9009f1a9b945` → **200**

```json
{
  "id": "38db8386-02f7-4c60-83a9-9009f1a9b945",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:55:16.385122Z",
  "updated_at": "2026-10-28T10:55:16.385122Z",
  "messages": [
    {
      "id": "5960127a-bcd3-40cf-81d6-d101ca317a5d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:55:16.386237Z",
      "attachments": [
        {
          "file_id": "206d208c-d57e-47d3-b8ea-af1c0a2040c7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/38db8386-02f7-4c60-83a9-9009f1a9b945/comments` → **200**

```json
{
  "command_id": "ea8cbe9d-3dc6-4cac-9573-ba935fb65410",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "58d542ea-4c43-4bf5-97c5-edc4a6dffa57"
  ]
}
```

```json
{
  "id": "38db8386-02f7-4c60-83a9-9009f1a9b945",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:55:16.385122Z",
  "updated_at": "2026-10-28T10:55:17.703693Z",
  "messages": [
    {
      "id": "5960127a-bcd3-40cf-81d6-d101ca317a5d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:55:16.386237Z",
      "attachments": [
        {
          "file_id": "206d208c-d57e-47d3-b8ea-af1c0a2040c7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6797887f-9784-4e80-b40c-e2f7311dcac2",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:55:17.703324Z",
      "attachments": [
        {
          "file_id": "58d542ea-4c43-4bf5-97c5-edc4a6dffa57",
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

`GET /api/rider/v1/support/cases/38db8386-02f7-4c60-83a9-9009f1a9b945` → **200**

```json
{
  "id": "38db8386-02f7-4c60-83a9-9009f1a9b945",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:55:16.385122Z",
  "updated_at": "2026-10-28T10:55:17.703693Z",
  "messages": [
    {
      "id": "5960127a-bcd3-40cf-81d6-d101ca317a5d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6e08aa81-dab7-48c7-9ea9-a683a72b0d5f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:55:16.386237Z",
      "attachments": [
        {
          "file_id": "206d208c-d57e-47d3-b8ea-af1c0a2040c7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6797887f-9784-4e80-b40c-e2f7311dcac2",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:55:17.703324Z",
      "attachments": [
        {
          "file_id": "58d542ea-4c43-4bf5-97c5-edc4a6dffa57",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/38db8386-02f7-4c60-83a9-9009f1a9b945/attachments/58d542ea-4c43-4bf5-97c5-edc4a6dffa57` → **200**

Done: support case 38db8386-02f7-4c60-83a9-9009f1a9b945, rider attachment 206d208c-d57e-47d3-b8ea-af1c0a2040c7, operator attachment 58d542ea-4c43-4bf5-97c5-edc4a6dffa57.

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
  "session_id": "0b3ecdc0-e3c8-43b0-8bc5-1ea9de2ef146",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU4MTgsImlhdCI6MTc5MzE4NDkxOCwianRpIjoiZWJkOTg2MzMtZjc3NS00MDhjLTg2ODUtOGYxZWZjZjlmODg0Iiwic2lkIjoiMGIzZWNkYzAtZTNjOC00M2IwLThiYzUtMWVhOWRlMmVmMTQ2In0.lyZOVcC3tRGn8pqjX9VcRnWc7vInCUQ6iYgCsKN-v6Q",
  "access_expires_at": "2026-10-28T11:10:18.286696266Z",
  "refresh_token": "r66b1u5btYWUFpp9VbKQ6waayjlooUOz_NnE1YrfxzY",
  "refresh_expires_at": "2026-10-28T22:55:18.286312424Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23757"
}
```

```json
{
  "challenge_id": "592819aa-ce1c-4fc5-9858-81e68955520c",
  "expires_at": "2026-10-28T11:00:18.457727163Z",
  "resend_available_at": "2026-10-28T10:55:19.457727163Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "155940",
  "sent_at": "2026-10-28T10:55:18.459897349Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "592819aa-ce1c-4fc5-9858-81e68955520c",
  "code": "155940",
  "device_ref": "sandbox-23757"
}
```

```json
{
  "session_id": "5324a99b-24ca-44c9-8c82-28abcf553202",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTgxOCwiaWF0IjoxNzkzMTg0OTE4LCJqdGkiOiJhZWY2MThkYi01YjY2LTQyNjctYmMyZS0zOGFkNWY2MjFmNDYiLCJzaWQiOiI1MzI0YTk5Yi0yNGNhLTQ0YzktOGM4Mi0yOGFiY2Y1NTMyMDIifQ.2cz9DxFaZl1we07I4d0ZdJ4UxxNe5nuvBOiuwhTbfnw",
  "access_expires_at": "2026-10-28T11:10:18.659447658Z",
  "refresh_token": "bpDBNfHKlvNJ9hPEHtE-opWcYgwz5CGoKee-q6sJ7-w",
  "refresh_expires_at": "2026-11-27T10:55:18.659025162Z",
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
      "actor_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:55:11.1915Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "fcb6deba-62d9-420e-bda0-4a37509298a1",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:55:12.100246Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d83d1393-082a-4270-9d83-23f2e28d126a",
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
  "device_ref": "sandbox-17587"
}
```

```json
{
  "challenge_id": "0b05dbdf-bbb1-44bb-8516-dba16be94f45",
  "expires_at": "2026-10-28T11:00:19.340123455Z",
  "resend_available_at": "2026-10-28T10:55:20.340123455Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "733466",
  "sent_at": "2026-10-28T10:55:19.341770163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b05dbdf-bbb1-44bb-8516-dba16be94f45",
  "code": "733466",
  "device_ref": "sandbox-17587"
}
```

```json
{
  "session_id": "76b66f60-4437-4402-bb59-7c239a0b38cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NTgxOSwiaWF0IjoxNzkzMTg0OTE5LCJqdGkiOiIyODEzNWZiMC00Y2E5LTRmMmYtYjM2NC0yYjc3ZjcyZTFjZjAiLCJzaWQiOiI3NmI2NmY2MC00NDM3LTQ0MDItYmI1OS03YzIzOWEwYjM4Y2MifQ.vOPT9GmtNB0qnJtOR7sSbvKqoPy_cnNyUPCFbQmQptQ",
  "access_expires_at": "2026-10-28T11:10:19.528765336Z",
  "refresh_token": "Sc3ip1mCTUEMcYYhpQs6CCEZNAkcTddOtrUwWOHgc4Q",
  "refresh_expires_at": "2026-11-27T10:55:19.528385434Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0933bffe-431b-42ae-a771-d95b45db4a13",
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
  "last_heartbeat_at": "2026-10-28T10:54:53.834401Z",
  "last_location_at": "2026-10-28T10:54:53.834401Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0933bffe-431b-42ae-a771-d95b45db4a13/handover` → **200**

```json
{
  "command_id": "348487f3-7552-4f5b-9278-931d5c88ab40",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0933bffe-431b-42ae-a771-d95b45db4a13",
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
  "last_heartbeat_at": "2026-10-28T10:54:53.834401Z",
  "last_location_at": "2026-10-28T10:54:53.834401Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0933bffe-431b-42ae-a771-d95b45db4a13/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:55:20Z",
    "sequence": 1793184920330
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0933bffe-431b-42ae-a771-d95b45db4a13",
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
  "last_heartbeat_at": "2026-10-28T10:55:20.048145Z",
  "last_location_at": "2026-10-28T10:55:20.048145Z",
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
  "command_id": "ae44113f-f5f7-48c1-a361-b4dbdef6d5c1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:55:20Z",
    "sequence": 1793184920403
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39754c7-4f46-4b75-a1a4-529c01a407fd",
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
  "last_heartbeat_at": "2026-10-28T10:55:20.41769Z",
  "last_location_at": "2026-10-28T10:55:20.41769Z",
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
  "session_id": "1e29e43e-913b-4895-b8df-4e7c51462175",
  "subject": {
    "type": "STAFF",
    "id": "fcb6deba-62d9-420e-bda0-4a37509298a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2I2ZGViYS02MmQ5LTQyMGUtYmRhMC00YTM3NTA5Mjk4YTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODU4MjAsImlhdCI6MTc5MzE4NDkyMCwianRpIjoiNmVhYzNhMWMtOGM3ZS00OTIxLTkyNTYtNDYzOWYyOGM5MTM5Iiwic2lkIjoiMWUyOWU0M2UtOTEzYi00ODk1LWI4ZGYtNGU3YzUxNDYyMTc1In0.rW_BixRpbav9pV_zRB9d6j4Z0P5a0nrmk_MT4TREYxQ",
  "access_expires_at": "2026-10-28T11:10:20.794377829Z",
  "refresh_token": "ksrf7rueuLHPPg7R4MwZKlpe3yP2kFTYKYHF4-iF9g0",
  "refresh_expires_at": "2026-10-28T22:55:20.793995524Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4273f8f1-4083-4e9a-8507-6593e1e616dd",
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
  "id": "8b871f98-0b2d-4514-9158-509673c8775f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T11:00:20.965134Z",
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
  "command_id": "5e92794d-5eb9-4b5f-8a64-2a00801e5df9",
  "quote_id": "8b871f98-0b2d-4514-9158-509673c8775f",
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
  "id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
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
  "created_at": "2026-10-28T10:55:21.144854Z",
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
    "id": "e3365b65-e771-47ea-bd20-0a62d3b4b4b2",
    "order_id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
    "expires_at": "2026-10-28T10:55:36.147894Z",
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

`POST /api/driver/v1/offers/e3365b65-e771-47ea-bd20-0a62d3b4b4b2/accept` → **200**

```json
{
  "command_id": "45779a89-8209-42c9-ac92-02ee923affb9"
}
```

```json
{
  "id": "5a305d60-cf3f-4f50-a12c-58fc0598e7ea",
  "order_id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "be5968df-d089-4da0-8185-df10bdba733b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "be5968df-d089-4da0-8185-df10bdba733b",
  "order_id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
  "assignment_id": "5a305d60-cf3f-4f50-a12c-58fc0598e7ea",
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

`POST /api/driver/v1/work-sessions/c39754c7-4f46-4b75-a1a4-529c01a407fd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:55:21Z",
    "sequence": 1793184921984
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39754c7-4f46-4b75-a1a4-529c01a407fd",
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
  "last_heartbeat_at": "2026-10-28T10:55:22.00041Z",
  "last_location_at": "2026-10-28T10:55:22.00041Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/be5968df-d089-4da0-8185-df10bdba733b/arrive` → **200**

```json
{
  "command_id": "80d156a3-49cd-4b81-a062-67461243845c",
  "expected_version": 0
}
```

```json
{
  "id": "be5968df-d089-4da0-8185-df10bdba733b",
  "order_id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
  "assignment_id": "5a305d60-cf3f-4f50-a12c-58fc0598e7ea",
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
  "arrived_at": "2026-10-28T10:55:22.175366Z",
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

`POST /api/driver/v1/trips/be5968df-d089-4da0-8185-df10bdba733b/start` → **200**

```json
{
  "command_id": "4ef67605-b200-4bbb-a2d9-bb149dfe484b",
  "expected_version": 1
}
```

```json
{
  "id": "be5968df-d089-4da0-8185-df10bdba733b",
  "order_id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
  "assignment_id": "5a305d60-cf3f-4f50-a12c-58fc0598e7ea",
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
  "arrived_at": "2026-10-28T10:55:22.175366Z",
  "started_at": "2026-10-28T10:55:22.355014Z",
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

`POST /api/driver/v1/trips/be5968df-d089-4da0-8185-df10bdba733b/complete` → **200**

```json
{
  "command_id": "2392f309-10ba-4d12-a259-b0ec1ebdc98f",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:55:22Z",
  "cash_received": true
}
```

```json
{
  "id": "be5968df-d089-4da0-8185-df10bdba733b",
  "order_id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
  "assignment_id": "5a305d60-cf3f-4f50-a12c-58fc0598e7ea",
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
  "arrived_at": "2026-10-28T10:55:22.175366Z",
  "started_at": "2026-10-28T10:55:22.355014Z",
  "completed_at": "2026-10-28T10:55:22.53767Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/99090206-fb27-462b-a4b6-ae21c2d2296a` → **200**

```json
{
  "id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
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
    "id": "5a305d60-cf3f-4f50-a12c-58fc0598e7ea",
    "order_id": "99090206-fb27-462b-a4b6-ae21c2d2296a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "be5968df-d089-4da0-8185-df10bdba733b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:55:21.144854Z",
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
  "session_id": "0933bffe-431b-42ae-a771-d95b45db4a13",
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
  "last_heartbeat_at": "2026-10-28T10:55:20.048145Z",
  "last_location_at": "2026-10-28T10:55:20.048145Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0933bffe-431b-42ae-a771-d95b45db4a13/close` → **200**

```json
{
  "command_id": "df410b83-67d6-4188-a174-e31e1459aa6a",
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
  "session_id": "c39754c7-4f46-4b75-a1a4-529c01a407fd",
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
  "last_heartbeat_at": "2026-10-28T10:55:22.00041Z",
  "last_location_at": "2026-10-28T10:55:22.00041Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c39754c7-4f46-4b75-a1a4-529c01a407fd/close` → **200**

```json
{
  "command_id": "94aa2d15-f27e-409e-be62-57333fab0d76",
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

Done: terminal order 99090206-fb27-462b-a4b6-ae21c2d2296a by Andrii (5a000000-0000-4000-8000-000000000403).
