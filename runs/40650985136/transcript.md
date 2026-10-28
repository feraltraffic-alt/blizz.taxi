# Sandbox transcript (2026-10-28T07:35:37Z, 5d43a6e)

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
  "correlation_id": "63ae6a13-f908-4590-b385-77bb6c22de5e"
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
  "session_id": "cb8f02a8-9ced-43a7-9fb6-5d8fadcfdc54",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4MzgsImlhdCI6MTc5MzE3MjkzOCwianRpIjoiM2E1ZjI0MDUtYzI1YS00NGFmLWE2ODctOWY4YzljOTAxZTlhIiwic2lkIjoiY2I4ZjAyYTgtOWNlZC00M2E3LTlmYjYtNWQ4ZmFkY2ZkYzU0In0.8Swer58DvINrQyq6no2lzr3MY_xOxb8O1Q7A-U0h7jk",
  "access_expires_at": "2026-10-28T07:50:38.119789601Z",
  "refresh_token": "BczYPCi3WcQpvu9QsG6JEApj9idWJrSukIt0__6yzdQ",
  "refresh_expires_at": "2026-10-28T19:35:38.117975727Z",
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
  "session_id": "b5b1155b-cf21-43bf-84d6-e555098ce207",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4MzksImlhdCI6MTc5MzE3MjkzOSwianRpIjoiYmFhYmVkZjMtYjZlMC00ZDkzLTk3YmEtYzE2MGIwYzM0Y2U0Iiwic2lkIjoiYjViMTE1NWItY2YyMS00M2JmLTg0ZDYtZTU1NTA5OGNlMjA3In0.Mdb0natw3fAImsajeBTSbNtkTKykhefmO7K5Nfh-JG4",
  "access_expires_at": "2026-10-28T07:50:39.249963046Z",
  "refresh_token": "PdKabxpFiip65sZQi4AwRrhUEqibythJv83YccYbnoM",
  "refresh_expires_at": "2026-10-28T19:35:39.249082074Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "39a79e6c-4efe-4cef-8867-4e800402be2c",
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
  "id": "2efe2f0f-f3d4-4ca3-b4eb-f4d51f8192fc",
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
  "created_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "created_at": "2026-10-28T07:35:39.301635Z",
  "updated_at": "2026-10-28T07:35:39.301635Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633929372",
  "device_ref": "sandbox-6071"
}
```

```json
{
  "challenge_id": "5e7f8a1f-5e2b-4a37-9cde-74f82dc35605",
  "expires_at": "2026-10-28T07:40:39.342515733Z",
  "resend_available_at": "2026-10-28T07:35:40.342515733Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633929372` → **200**

```json
{
  "phone": "+380633929372",
  "audience": "CLIENT",
  "code": "429689",
  "sent_at": "2026-10-28T07:35:39.349781282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e7f8a1f-5e2b-4a37-9cde-74f82dc35605",
  "code": "429689",
  "device_ref": "sandbox-6071"
}
```

```json
{
  "session_id": "5473e782-d091-4bfa-a53c-9a1fbdfc9176",
  "subject": {
    "type": "CLIENT",
    "id": "eea0d2e2-c2a6-4ffc-9ea1-fd9659c14fef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWEwZDJlMi1jMmE2LTRmZmMtOWVhMS1mZDk2NTljMTRmZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODM5LCJpYXQiOjE3OTMxNzI5MzksImp0aSI6IjIwNzBhOWE2LWM3ZTQtNDMzZi04ZWQ5LTg4MDQ1Mjg2YzBlNyIsInNpZCI6IjU0NzNlNzgyLWQwOTEtNGJmYS1hNTNjLTlhMWZiZGZjOTE3NiJ9.jJIvOor4NiEyG8EXxIo4RSyaIz687JRbJnWak9dXFQQ",
  "access_expires_at": "2026-10-28T07:50:39.420864222Z",
  "refresh_token": "sD68OovadRKi8IQuBhNq0h_pQmAtkh6f4Sti4IO5isc",
  "refresh_expires_at": "2026-11-27T07:35:39.419905753Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633929372` → **200**

```json
{
  "client_id": "eea0d2e2-c2a6-4ffc-9ea1-fd9659c14fef"
}
```

`POST /api/admin/v1/rider-wallets/eea0d2e2-c2a6-4ffc-9ea1-fd9659c14fef/top-ups` → **201**

```json
{
  "command_id": "2ea51e4a-fcd3-4aef-bd1e-02ee345d8d25",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "eea0d2e2-c2a6-4ffc-9ea1-fd9659c14fef",
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
      "id": "5ca075dc-8b46-4119-86e0-3744ecfd3ac7",
      "at": "2026-10-28T07:35:39.491577Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d373a6d-246f-433e-9945-935c70fd7780",
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
  "id": "c526905c-285f-4a13-b117-d8a7b9d12d6b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:40:39.611551Z",
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
      "id": "2efe2f0f-f3d4-4ca3-b4eb-f4d51f8192fc",
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
  "device_ref": "sandbox-20088"
}
```

```json
{
  "challenge_id": "14c99ef8-c27b-4036-a5cf-b0457f627a70",
  "expires_at": "2026-10-28T07:40:39.664452545Z",
  "resend_available_at": "2026-10-28T07:35:40.664452545Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "607117",
  "sent_at": "2026-10-28T07:35:39.667650527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14c99ef8-c27b-4036-a5cf-b0457f627a70",
  "code": "607117",
  "device_ref": "sandbox-20088"
}
```

```json
{
  "session_id": "de9f582b-3fea-458e-b8ff-3ddc6f7eef68",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzgzOSwiaWF0IjoxNzkzMTcyOTM5LCJqdGkiOiI2NDJmOGNlMi1kMWM5LTQ4OTYtODE2Ni0zYTU3MGUwNGQ4YzUiLCJzaWQiOiJkZTlmNTgyYi0zZmVhLTQ1OGUtYjhmZi0zZGRjNmY3ZWVmNjgifQ.TTjbhRO6B-BjhQwvISmAenjCwZbsX8XpJ-0_EcywrJo",
  "access_expires_at": "2026-10-28T07:50:39.72000733Z",
  "refresh_token": "lZhOO_4Y4bpV2LunlZF6QdQSxf3q8fnaEDQoZ3jJJo0",
  "refresh_expires_at": "2026-11-27T07:35:39.719197054Z",
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
  "command_id": "cab450c3-4d70-419e-95f6-948a53ebadb6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:35:39Z",
    "sequence": 1793172939778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29f1dd70-74eb-4a4a-81af-dd7d7d434b6f",
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
  "last_heartbeat_at": "2026-10-28T07:35:39.819864Z",
  "last_location_at": "2026-10-28T07:35:39.819864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aca00543-cd90-4759-b903-533b52c4f968",
  "quote_id": "c526905c-285f-4a13-b117-d8a7b9d12d6b",
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
  "id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eea0d2e2-c2a6-4ffc-9ea1-fd9659c14fef",
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
  "created_at": "2026-10-28T07:35:39.907982Z",
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
  "client_id": "eea0d2e2-c2a6-4ffc-9ea1-fd9659c14fef",
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
      "id": "5ca075dc-8b46-4119-86e0-3744ecfd3ac7",
      "at": "2026-10-28T07:35:39.491577Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
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
    "id": "c8d10983-ff98-46c2-8c2f-e09521cba3c0",
    "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
    "expires_at": "2026-10-28T07:35:54.923687Z",
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

`POST /api/driver/v1/offers/c8d10983-ff98-46c2-8c2f-e09521cba3c0/accept` → **200**

```json
{
  "command_id": "56604308-4566-4aaf-9c04-8157cfbc15f6"
}
```

```json
{
  "id": "4982fc3e-8090-45a6-a4f0-b979fabb3ef9",
  "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1d7cde44-ce1c-4450-8f8c-79ceb3b45c82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1d7cde44-ce1c-4450-8f8c-79ceb3b45c82",
  "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
  "assignment_id": "4982fc3e-8090-45a6-a4f0-b979fabb3ef9",
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

`POST /api/driver/v1/work-sessions/29f1dd70-74eb-4a4a-81af-dd7d7d434b6f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:35:40Z",
    "sequence": 1793172940936
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29f1dd70-74eb-4a4a-81af-dd7d7d434b6f",
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
  "last_heartbeat_at": "2026-10-28T07:35:40.115879Z",
  "last_location_at": "2026-10-28T07:35:40.115879Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1d7cde44-ce1c-4450-8f8c-79ceb3b45c82/arrive` → **200**

```json
{
  "command_id": "b0bf1061-12a7-4528-be5d-38160aaebe50",
  "expected_version": 0
}
```

```json
{
  "id": "1d7cde44-ce1c-4450-8f8c-79ceb3b45c82",
  "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
  "assignment_id": "4982fc3e-8090-45a6-a4f0-b979fabb3ef9",
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
  "arrived_at": "2026-10-28T07:35:40.16285Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1d7cde44-ce1c-4450-8f8c-79ceb3b45c82/start` → **200**

```json
{
  "command_id": "a004c282-ca1e-4850-b48f-c3baf147ecdd",
  "expected_version": 1
}
```

```json
{
  "id": "1d7cde44-ce1c-4450-8f8c-79ceb3b45c82",
  "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
  "assignment_id": "4982fc3e-8090-45a6-a4f0-b979fabb3ef9",
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
  "arrived_at": "2026-10-28T07:35:40.16285Z",
  "started_at": "2026-10-28T07:35:40.206493Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1d7cde44-ce1c-4450-8f8c-79ceb3b45c82/complete` → **200**

```json
{
  "command_id": "5e84435d-50ea-4337-a89f-d5cd77d6e92d",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:35:40Z",
  "cash_received": true
}
```

```json
{
  "id": "1d7cde44-ce1c-4450-8f8c-79ceb3b45c82",
  "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
  "assignment_id": "4982fc3e-8090-45a6-a4f0-b979fabb3ef9",
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
  "arrived_at": "2026-10-28T07:35:40.16285Z",
  "started_at": "2026-10-28T07:35:40.206493Z",
  "completed_at": "2026-10-28T07:35:40.264466Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "eea0d2e2-c2a6-4ffc-9ea1-fd9659c14fef",
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
      "id": "00d5c76e-1297-4bdc-b710-9d536298a787",
      "at": "2026-10-28T07:35:41.206033Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf"
    },
    {
      "id": "5ca075dc-8b46-4119-86e0-3744ecfd3ac7",
      "at": "2026-10-28T07:35:39.491577Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2efe2f0f-f3d4-4ca3-b4eb-f4d51f8192fc/archive` → **200**

```json
{
  "command_id": "5ffdc64d-f760-4088-a5ae-05bc20d24fa6",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2efe2f0f-f3d4-4ca3-b4eb-f4d51f8192fc",
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
  "created_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "created_at": "2026-10-28T07:35:39.301635Z",
  "updated_at": "2026-10-28T07:35:43.345102Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29f1dd70-74eb-4a4a-81af-dd7d7d434b6f",
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
  "last_heartbeat_at": "2026-10-28T07:35:40.115879Z",
  "last_location_at": "2026-10-28T07:35:40.115879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29f1dd70-74eb-4a4a-81af-dd7d7d434b6f/close` → **200**

```json
{
  "command_id": "006ccbe2-a4e6-48e4-87be-5575ae5ded1f",
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

Done: order 0168dfa1-eba9-412c-b162-f8e9fa1f0abf.

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
  "session_id": "80f4eb3d-3ef3-4a44-9ecb-6288900e9aea",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4NDMsImlhdCI6MTc5MzE3Mjk0MywianRpIjoiMTI4MTUwNDEtNjQ0Zi00ODM4LTkwNGYtZDQzZTlkZTdiZTE2Iiwic2lkIjoiODBmNGViM2QtM2VmMy00YTQ0LTllY2ItNjI4ODkwMGU5YWVhIn0.Fn7NSiWY31e7CLczu0eMGYYdI7FslwwWcXjFom9CaM8",
  "access_expires_at": "2026-10-28T07:50:43.71076734Z",
  "refresh_token": "sUsSMNqueVtPMdv_RATc0zAH0QbWJA6LEs_cP9x93w8",
  "refresh_expires_at": "2026-10-28T19:35:43.710130003Z",
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
  "command_id": "4428b753-7c03-4b71-b706-11603e43273f",
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
  "session_id": "b51f010a-811b-4a1c-be4b-49fec2ed1427",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4NDQsImlhdCI6MTc5MzE3Mjk0NCwianRpIjoiMWVjYjYzNzgtNWRjZC00NWU4LThiNjgtOTczYTYwMDQ4NjQ4Iiwic2lkIjoiYjUxZjAxMGEtODExYi00YTFjLWJlNGItNDlmZWMyZWQxNDI3In0.Bfo8nEVOekBuSFNam5S39OqzBZBHi3RtPkr3zvIi0cs",
  "access_expires_at": "2026-10-28T07:50:44.083237129Z",
  "refresh_token": "xHSSpiamha9RIlmMmlnR5nyiMcLtgPYPUHnzlPkjyyA",
  "refresh_expires_at": "2026-10-28T19:35:44.082554934Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1754818982",
    "linkedid": "1730052700.1754818982",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678288899"
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
    "id": "1730052700.1754818982",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "caea76b6-b970-48f1-8fde-952ffc048f28",
      "state": "MISSED",
      "caller_phone": "+380678288899",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:35:44.109313Z",
      "answered_at": null,
      "ended_at": "2026-10-28T07:35:44.130725Z",
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
    "id": "1730052600.170987659",
    "linkedid": "1730052600.170987659",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678288899"
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
      "id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
      "state": "RINGING",
      "caller_phone": "+380678288899",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:35:44.188236Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b093aac8-6cbb-47e2-b75e-379d1b380a9c/answer` → **200**

```json
{
  "command_id": "8b65a8c8-4d52-466f-bc7f-a44d559134df"
}
```

```json
{
  "id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
  "state": "ANSWERED",
  "caller_phone": "+380678288899",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "order_ids": [],
  "started_at": "2026-10-28T07:35:44.188236Z",
  "answered_at": "2026-10-28T07:35:44.245672Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.170987659",
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
    "id": "1730052600.170987659",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
      "state": "ENDED",
      "caller_phone": "+380678288899",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "order_ids": [],
      "started_at": "2026-10-28T07:35:44.188236Z",
      "answered_at": "2026-10-28T07:35:44.245672Z",
      "ended_at": "2026-10-28T07:35:44.28991Z",
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
      "id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
      "state": "ENDED",
      "caller_phone": "+380678288899",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "order_ids": [],
      "started_at": "2026-10-28T07:35:44.188236Z",
      "answered_at": "2026-10-28T07:35:44.245672Z",
      "ended_at": "2026-10-28T07:35:44.28991Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:35:46.149921Z"
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
      "id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
      "state": "ENDED",
      "caller_phone": "+380678288899",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "order_ids": [],
      "started_at": "2026-10-28T07:35:44.188236Z",
      "answered_at": "2026-10-28T07:35:44.245672Z",
      "ended_at": "2026-10-28T07:35:44.28991Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:35:46.149921Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b093aac8-6cbb-47e2-b75e-379d1b380a9c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b093aac8-6cbb-47e2-b75e-379d1b380a9c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b093aac8-6cbb-47e2-b75e-379d1b380a9c` → **200**

```json
{
  "changes": [
    {
      "id": "ad18d046-96d2-4d44-a4df-705ccd9295ea",
      "occurred_at": "2026-10-28T07:35:46.425801Z",
      "actor_type": "STAFF",
      "actor_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4e846e9e-5ce4-4b5e-b2d3-30ffa0ad95f7\", \"order_ids\": []}",
      "correlation_id": "f6fd3792-8acd-49cb-a45e-95633b9064a8"
    },
    {
      "id": "68c977d5-1793-4897-b685-43ba21354705",
      "occurred_at": "2026-10-28T07:35:46.396977Z",
      "actor_type": "STAFF",
      "actor_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4e846e9e-5ce4-4b5e-b2d3-30ffa0ad95f7\", \"order_ids\": []}",
      "correlation_id": "cf734130-3468-415d-bb86-f9fbf3ed099b"
    }
  ]
}
```

Done: call b093aac8-6cbb-47e2-b75e-379d1b380a9c recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635788563",
  "device_ref": "sandbox-11277"
}
```

```json
{
  "challenge_id": "34fdf1e6-d63d-4894-9d72-26d414b388ef",
  "expires_at": "2026-10-28T07:40:46.498389795Z",
  "resend_available_at": "2026-10-28T07:35:47.498389795Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635788563` → **200**

```json
{
  "phone": "+380635788563",
  "audience": "CLIENT",
  "code": "049562",
  "sent_at": "2026-10-28T07:35:46.501832966Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34fdf1e6-d63d-4894-9d72-26d414b388ef",
  "code": "049562",
  "device_ref": "sandbox-11277"
}
```

```json
{
  "session_id": "74811e10-bb42-493d-ba55-c2c8a9acb327",
  "subject": {
    "type": "CLIENT",
    "id": "69d1160e-fa53-414e-a146-08eb73f127d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWQxMTYwZS1mYTUzLTQxNGUtYTE0Ni0wOGViNzNmMTI3ZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODQ2LCJpYXQiOjE3OTMxNzI5NDYsImp0aSI6IjY2MDVhODE0LTQzZGQtNDM3MC1hMmZjLTUwMDgwY2NhNjkxYSIsInNpZCI6Ijc0ODExZTEwLWJiNDItNDkzZC1iYTU1LWMyYzhhOWFjYjMyNyJ9.FqcFQ2ZviOvEKvnLg60-aNlu6wO1h7p1-ULjgZyVFGU",
  "access_expires_at": "2026-10-28T07:50:46.554137603Z",
  "refresh_token": "OPUWiuLi-AsE2qwLX-M2RQUnfjthRdbBbeTvyLKliSA",
  "refresh_expires_at": "2026-11-27T07:35:46.553501803Z",
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
  "device_ref": "sandbox-9300"
}
```

```json
{
  "challenge_id": "4776247a-0f8b-450f-a71c-ae83e2de05a7",
  "expires_at": "2026-10-28T07:40:46.602449074Z",
  "resend_available_at": "2026-10-28T07:35:47.602449074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "216560",
  "sent_at": "2026-10-28T07:35:46.605111873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4776247a-0f8b-450f-a71c-ae83e2de05a7",
  "code": "216560",
  "device_ref": "sandbox-9300"
}
```

```json
{
  "session_id": "2ca28e55-062c-40c7-8b07-a249d8b3d4c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg0NiwiaWF0IjoxNzkzMTcyOTQ2LCJqdGkiOiJlOTgyYjA5OC1jYjQ1LTQxMWMtYmE2Ni1hZTc2YmNlYWI5MDkiLCJzaWQiOiIyY2EyOGU1NS0wNjJjLTQwYzctOGIwNy1hMjQ5ZDhiM2Q0YzIifQ.Yg3rLGPKvgZ8ibzYjATsY8MV_q59XiOI8Py_RV9sNDY",
  "access_expires_at": "2026-10-28T07:50:46.691588819Z",
  "refresh_token": "5Qb3-4CQWUpwF1xiNvcde9xmThKEddOJ7N2tV9XR6xU",
  "refresh_expires_at": "2026-11-27T07:35:46.690592383Z",
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
  "session_id": "37a120a5-ee86-4140-90f8-32527ad1aa32",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4NDYsImlhdCI6MTc5MzE3Mjk0NiwianRpIjoiYzc0OTM2M2ItZjExNi00ZmE4LTkwOTgtYTJkMTNlMTMwNDk4Iiwic2lkIjoiMzdhMTIwYTUtZWU4Ni00MTQwLTkwZjgtMzI1MjdhZDFhYTMyIn0.2fA_s9wLULb0qtJzMyariBwnDzNmPUgriIDDtruUR80",
  "access_expires_at": "2026-10-28T07:50:46.997386175Z",
  "refresh_token": "H9dHbNPneqkBtfIxq2dSr8dXfUtJ2Mo80aDDti2QFWQ",
  "refresh_expires_at": "2026-10-28T19:35:46.996733125Z",
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
  "session_id": "e0158f9e-939a-4337-be9d-719ae224be55",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4NDcsImlhdCI6MTc5MzE3Mjk0NywianRpIjoiNTAxZTFkZmEtZWZmOC00M2M1LWIxYmUtYTdjODYwMDQxNmVjIiwic2lkIjoiZTAxNThmOWUtOTM5YS00MzM3LWJlOWQtNzE5YWUyMjRiZTU1In0.D_ipO9f6MZnOgV9D6YeXt7tAQ3DiLji-pgqnVwZtOnw",
  "access_expires_at": "2026-10-28T07:50:47.28010824Z",
  "refresh_token": "Sp1SCL1XisGAw0Ccb_RgjsPIDlbjUCIoPWGLeqE-bfg",
  "refresh_expires_at": "2026-10-28T19:35:47.279623031Z",
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
  "command_id": "e06a64b6-ec39-4b2c-8beb-a4702cb98542",
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
  "id": "3c62306e-150b-4639-9e9b-c80c4e5b7967",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:40:47.337258Z",
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
  "command_id": "ece34a88-6254-42e7-a05c-7994b69d0704",
  "quote_id": "3c62306e-150b-4639-9e9b-c80c4e5b7967",
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
  "id": "926352eb-42c2-41db-9128-bbe4d03e2ef9",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69d1160e-fa53-414e-a146-08eb73f127d2",
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
  "created_at": "2026-10-28T07:35:47.374243Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/926352eb-42c2-41db-9128-bbe4d03e2ef9` → **200**

```json
{
  "id": "926352eb-42c2-41db-9128-bbe4d03e2ef9",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69d1160e-fa53-414e-a146-08eb73f127d2",
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
  "created_at": "2026-10-28T07:35:47.374243Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/926352eb-42c2-41db-9128-bbe4d03e2ef9/cancel` → **200**

```json
{
  "command_id": "8e13f9f6-e00c-421f-976c-0a2b1df7ebe1",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "926352eb-42c2-41db-9128-bbe4d03e2ef9",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69d1160e-fa53-414e-a146-08eb73f127d2",
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
  "created_at": "2026-10-28T07:35:47.374243Z",
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
  "command_id": "380c2aca-603d-4341-bd86-f89dad0fd261",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:35:47Z",
    "sequence": 1793172947514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:35:47.532368Z",
  "last_location_at": "2026-10-28T07:35:47.532368Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4848"
}
```

```json
{
  "challenge_id": "82abf760-189b-4c4a-b2b6-9c4974e8bd78",
  "expires_at": "2026-10-28T07:40:47.559146914Z",
  "resend_available_at": "2026-10-28T07:35:48.559146914Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "174160",
  "sent_at": "2026-10-28T07:35:47.561685406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82abf760-189b-4c4a-b2b6-9c4974e8bd78",
  "code": "174160",
  "device_ref": "sandbox-4848"
}
```

```json
{
  "session_id": "c5818949-1584-4890-9827-5eb5cf3aa08c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg0NywiaWF0IjoxNzkzMTcyOTQ3LCJqdGkiOiI1ZGI4NjM5My0wYTBhLTQ2MjYtYWFlMC02NTQ3NGU4NWNhOTEiLCJzaWQiOiJjNTgxODk0OS0xNTg0LTQ4OTAtOTgyNy01ZWI1Y2YzYWEwOGMifQ.7WCIB0qdwKSqUENkiV8eTyvtO7MF2Z9VXG9DNV40m_I",
  "access_expires_at": "2026-10-28T07:50:47.612644478Z",
  "refresh_token": "GsO0yPctimZn37-iemYumDuXqVbgi1cg-cqfKn4UDSs",
  "refresh_expires_at": "2026-11-27T07:35:47.612156886Z",
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
  "command_id": "99232071-8bc5-48ea-a825-7f7298a36ad7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:35:47Z",
    "sequence": 1793172947657
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "785be06a-8a3f-49bd-91ff-cfb8314f2e83",
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
  "last_heartbeat_at": "2026-10-28T07:35:47.674552Z",
  "last_location_at": "2026-10-28T07:35:47.674552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67c9598a-f0b8-48ed-9b7d-e8e54da627e2",
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
  "id": "ddf26dd9-506b-4847-8a45-ef0f12f6d300",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:40:47.709701Z",
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
  "command_id": "0c75552b-6867-4a26-855a-19d35573aad2",
  "quote_id": "ddf26dd9-506b-4847-8a45-ef0f12f6d300",
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
  "id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69d1160e-fa53-414e-a146-08eb73f127d2",
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
  "created_at": "2026-10-28T07:35:47.745757Z",
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
    "id": "43c64065-94de-4022-9686-16497434c79e",
    "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
    "expires_at": "2026-10-28T07:36:02.749031Z",
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

`POST /api/driver/v1/offers/43c64065-94de-4022-9686-16497434c79e/accept` → **200**

```json
{
  "command_id": "3ff0f013-20db-43a6-b6aa-a0df0f02dd6e"
}
```

```json
{
  "id": "315926bf-4a5e-4ec5-9a41-8e16c8a8e996",
  "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "042e100e-3eb3-4c8d-b1eb-bcff9ba46952",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "042e100e-3eb3-4c8d-b1eb-bcff9ba46952",
  "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "assignment_id": "315926bf-4a5e-4ec5-9a41-8e16c8a8e996",
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

`POST /api/driver/v1/trips/042e100e-3eb3-4c8d-b1eb-bcff9ba46952/cancel` → **200**

```json
{
  "command_id": "3c884da4-7ed5-47e8-b65a-e1c47f7ee475",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "042e100e-3eb3-4c8d-b1eb-bcff9ba46952",
  "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "assignment_id": "315926bf-4a5e-4ec5-9a41-8e16c8a8e996",
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

`GET /api/rider/v1/orders/e058aeb8-f9e2-457f-946b-e8fa9234a0f6` → **200**

```json
{
  "id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "69d1160e-fa53-414e-a146-08eb73f127d2",
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
    "id": "315926bf-4a5e-4ec5-9a41-8e16c8a8e996",
    "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "042e100e-3eb3-4c8d-b1eb-bcff9ba46952",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:35:47.745757Z",
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
    "id": "4d6f0231-14ea-415a-b6d4-cf76351665c8",
    "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
    "expires_at": "2026-10-28T07:36:02.875912Z",
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

`POST /api/driver/v1/offers/4d6f0231-14ea-415a-b6d4-cf76351665c8/accept` → **200**

```json
{
  "command_id": "46aaecc5-7754-4ef3-83a7-271c840cd28c"
}
```

```json
{
  "id": "822a016a-4e27-4cfc-9aa9-a09b7484e31f",
  "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8e3d4acd-343e-4a64-876a-a7bf4ff50df9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8e3d4acd-343e-4a64-876a-a7bf4ff50df9",
  "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "assignment_id": "822a016a-4e27-4cfc-9aa9-a09b7484e31f",
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

`POST /api/driver/v1/trips/8e3d4acd-343e-4a64-876a-a7bf4ff50df9/cancel` → **200**

```json
{
  "command_id": "f4b97bde-fa7f-492b-bdd2-0d08d9641243",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "8e3d4acd-343e-4a64-876a-a7bf4ff50df9",
  "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
  "assignment_id": "822a016a-4e27-4cfc-9aa9-a09b7484e31f",
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
    "id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:35:47.745757Z",
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
    "id": "926352eb-42c2-41db-9128-bbe4d03e2ef9",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:35:47.374243Z",
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

`GET /api/operator/v1/orders/e058aeb8-f9e2-457f-946b-e8fa9234a0f6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:35:47.746336Z",
      "actor": {
        "type": "CLIENT",
        "id": "69d1160e-fa53-414e-a146-08eb73f127d2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
        "quote_id": "ddf26dd9-506b-4847-8a45-ef0f12f6d300",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:35:47.748191Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
        "attempt_id": "7d12efb2-bd9c-49f3-a5cc-6dcc2da84d28",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:35:47.753445Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "43c64065-94de-4022-9686-16497434c79e",
        "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:35:47.80765Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "43c64065-94de-4022-9686-16497434c79e",
        "order_id": "e058aeb8-f9e2-457f-946b-e8fa9234a0f6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "315926bf-4a5e-4ec5-9a41-8e16c8a8e996"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 926352eb-42c2-41db-9128-bbe4d03e2ef9, e058aeb8-f9e2-457f-946b-e8fa9234a0f6.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732627535",
  "device_ref": "sandbox-26583"
}
```

```json
{
  "challenge_id": "a50c82b3-cf60-42bd-9643-f5cd3dfd0fe3",
  "expires_at": "2026-10-28T07:40:48.207743898Z",
  "resend_available_at": "2026-10-28T07:35:49.207743898Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732627535` → **200**

```json
{
  "phone": "+380732627535",
  "audience": "CLIENT",
  "code": "479307",
  "sent_at": "2026-10-28T07:35:48.210277673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a50c82b3-cf60-42bd-9643-f5cd3dfd0fe3",
  "code": "479307",
  "device_ref": "sandbox-26583"
}
```

```json
{
  "session_id": "dc557864-a512-49bb-98b5-469e65a8f578",
  "subject": {
    "type": "CLIENT",
    "id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODkwN2VlMS0zMGE5LTRiY2QtOGJlZi1hMmE4OWEwODk2YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODQ4LCJpYXQiOjE3OTMxNzI5NDgsImp0aSI6ImYyNDdiNDA4LWM2NTUtNDhiZC04MGFlLWQzOTZhYTQ3YzMyMyIsInNpZCI6ImRjNTU3ODY0LWE1MTItNDliYi05OGI1LTQ2OWU2NWE4ZjU3OCJ9.ekib0RZIHRlZqsDPwqUKFJ7lrniiMpvPgeQiK5RE4PM",
  "access_expires_at": "2026-10-28T07:50:48.259378914Z",
  "refresh_token": "POSIdNWDUjrFutNTlgUyqff26XydQQlP-7UZDwUbUmI",
  "refresh_expires_at": "2026-11-27T07:35:48.258827161Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "01441c4f-e6ac-4a23-8522-6793322136dd",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b468a7cd-ab81-4d4e-8384-995b154358d6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b468a7cd-ab81-4d4e-8384-995b154358d6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1b62347ed5acbe0b6bf1ab420fad54dc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b468a7cd-ab81-4d4e-8384-995b154358d6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732627535"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b468a7cd-ab81-4d4e-8384-995b154358d6",
  "expires_at": "2026-10-28T08:05:48.391767Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b468a7cd-ab81-4d4e-8384-995b154358d6` → **200**

```json
{
  "id": "b468a7cd-ab81-4d4e-8384-995b154358d6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:05:48.391767Z",
  "card": {
    "id": "01f4cf69-f522-4e97-8fe7-3a66669505f9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5709",
    "card_type": "Visa",
    "created_at": "2026-10-28T07:35:48.626166Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "01f4cf69-f522-4e97-8fe7-3a66669505f9",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5709",
      "card_type": "Visa",
      "created_at": "2026-10-28T07:35:48.626166Z"
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
  "device_ref": "sandbox-16037"
}
```

```json
{
  "challenge_id": "b2196fcf-3ff5-410d-a682-8c5064eaf51f",
  "expires_at": "2026-10-28T07:40:48.702681359Z",
  "resend_available_at": "2026-10-28T07:35:49.702681359Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "278868",
  "sent_at": "2026-10-28T07:35:48.705048423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2196fcf-3ff5-410d-a682-8c5064eaf51f",
  "code": "278868",
  "device_ref": "sandbox-16037"
}
```

```json
{
  "session_id": "6e465ded-0969-46c4-a84a-ce61d522d302",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg0OCwiaWF0IjoxNzkzMTcyOTQ4LCJqdGkiOiI2ZmIwNDQ5Mi04M2IwLTQ5NWQtOGFlMy1kZGNkOGFhM2U5OGYiLCJzaWQiOiI2ZTQ2NWRlZC0wOTY5LTQ2YzQtYTg0YS1jZTYxZDUyMmQzMDIifQ.XxBfmlMbVqIOrQMJnjKKJIRxh1jjInsvjteRIzTqT4U",
  "access_expires_at": "2026-10-28T07:50:48.754791924Z",
  "refresh_token": "Rqogpap6PRl8y2w984QkXPe3SO5OACyi0DtUqxiVuR0",
  "refresh_expires_at": "2026-11-27T07:35:48.75426281Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "785be06a-8a3f-49bd-91ff-cfb8314f2e83",
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
  "last_heartbeat_at": "2026-10-28T07:35:47.674552Z",
  "last_location_at": "2026-10-28T07:35:47.674552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/785be06a-8a3f-49bd-91ff-cfb8314f2e83/handover` → **200**

```json
{
  "command_id": "50ce81ed-e144-4abc-b3d3-15cd749908d5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "785be06a-8a3f-49bd-91ff-cfb8314f2e83",
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
  "last_heartbeat_at": "2026-10-28T07:35:47.674552Z",
  "last_location_at": "2026-10-28T07:35:47.674552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/785be06a-8a3f-49bd-91ff-cfb8314f2e83/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:35:48Z",
    "sequence": 1793172948836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "785be06a-8a3f-49bd-91ff-cfb8314f2e83",
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
  "last_heartbeat_at": "2026-10-28T07:35:48.854585Z",
  "last_location_at": "2026-10-28T07:35:48.854585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "865ab50c-b350-4c09-8c2d-5a60295f795e",
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
  "id": "02eff4c0-7e0b-456b-a6a3-3c43dc12d49e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T07:40:48.887592Z",
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
  "command_id": "5cdc4ae1-6ed9-40d0-89b2-80facf5c8f25",
  "quote_id": "02eff4c0-7e0b-456b-a6a3-3c43dc12d49e",
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
  "id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2",
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
  "created_at": "2026-10-28T07:35:48.924637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d` → **200**

```json
{
  "id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2",
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
  "created_at": "2026-10-28T07:35:48.924637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d` → **200**

```json
{
  "id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2",
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
  "created_at": "2026-10-28T07:35:48.924637Z",
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
    "id": "9f5fe002-39f9-4996-818f-1f117bf7629c",
    "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
    "expires_at": "2026-10-28T07:36:04.754462Z",
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

`POST /api/driver/v1/offers/9f5fe002-39f9-4996-818f-1f117bf7629c/accept` → **200**

```json
{
  "command_id": "13c41409-8de8-4fb8-ad3c-febdb35da757"
}
```

```json
{
  "id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "assignment_id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
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

`POST /api/driver/v1/work-sessions/785be06a-8a3f-49bd-91ff-cfb8314f2e83/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:35:50Z",
    "sequence": 1793172950282
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "785be06a-8a3f-49bd-91ff-cfb8314f2e83",
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
  "last_heartbeat_at": "2026-10-28T07:35:50.300213Z",
  "last_location_at": "2026-10-28T07:35:50.300213Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c/arrive` → **200**

```json
{
  "command_id": "9c19f2b8-b236-4bfe-90e2-9bc0910a864a",
  "expected_version": 0
}
```

```json
{
  "id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "assignment_id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
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
  "arrived_at": "2026-10-28T07:35:50.517333Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c/start` → **200**

```json
{
  "command_id": "a658e228-f9f6-49ca-ab38-5c6488d36509",
  "expected_version": 1
}
```

```json
{
  "id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "assignment_id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
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
  "arrived_at": "2026-10-28T07:35:50.517333Z",
  "started_at": "2026-10-28T07:35:50.556232Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c/complete` → **200**

```json
{
  "command_id": "b351ba06-c886-410e-8253-a76395d6a8e8",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:35:50Z"
}
```

```json
{
  "id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "assignment_id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
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
  "arrived_at": "2026-10-28T07:35:50.517333Z",
  "started_at": "2026-10-28T07:35:50.556232Z",
  "completed_at": "2026-10-28T07:35:50.598426Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d` → **200**

```json
{
  "id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2",
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
    "id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
    "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:35:48.924637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d` → **200**

```json
{
  "id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2",
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
    "id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
    "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:35:48.924637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d` → **200**

```json
{
  "id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2",
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
    "id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
    "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:35:48.924637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d` → **200**

```json
{
  "id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a8907ee1-30a9-4bcd-8bef-a2a89a0896c2",
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
    "id": "9dd085d7-9929-4bc6-83d4-861d7b36869b",
    "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2f26b21c-1a17-4cbd-bb13-1dc115bf3d4c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:35:48.924637Z",
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
      "id": "4e7ed2b0-9222-4559-aec6-f600182dc3cf",
      "at": "2026-10-28T07:35:50.775905Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d/tip` → **200**

```json
{
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
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
  "available_until": "2026-10-29T07:35:50.598426Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d/tip` → **201**

```json
{
  "command_id": "0360231f-3646-4558-9400-fe0d16d06ca1",
  "amount_minor": 2500
}
```

```json
{
  "id": "ea794fc5-d21d-487e-a798-b484afe02271",
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T07:35:53.812695Z"
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d/tip` → **200**

```json
{
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
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
  "available_until": "2026-10-29T07:35:50.598426Z",
  "open": false,
  "tip": {
    "id": "ea794fc5-d21d-487e-a798-b484afe02271",
    "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T07:35:53.812695Z"
  }
}
```

`GET /api/rider/v1/orders/03152f1f-7279-40b2-8b8b-697c9b58b27d/tip` → **200**

```json
{
  "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
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
  "available_until": "2026-10-29T07:35:50.598426Z",
  "open": false,
  "tip": {
    "id": "ea794fc5-d21d-487e-a798-b484afe02271",
    "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T07:35:53.812695Z"
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
      "id": "4e7ed2b0-9222-4559-aec6-f600182dc3cf",
      "at": "2026-10-28T07:35:50.775905Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
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
      "id": "0a63f32a-9ae1-4b26-a589-e4843706b952",
      "at": "2026-10-28T07:35:55.829896Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
      "counterpart_id": null
    },
    {
      "id": "4e7ed2b0-9222-4559-aec6-f600182dc3cf",
      "at": "2026-10-28T07:35:50.775905Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "03152f1f-7279-40b2-8b8b-697c9b58b27d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "785be06a-8a3f-49bd-91ff-cfb8314f2e83",
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
  "last_heartbeat_at": "2026-10-28T07:35:50.300213Z",
  "last_location_at": "2026-10-28T07:35:50.300213Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/785be06a-8a3f-49bd-91ff-cfb8314f2e83/close` → **200**

```json
{
  "command_id": "31bab1cb-89f9-462d-8f69-1baed69143b9",
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

Done: card order 03152f1f-7279-40b2-8b8b-697c9b58b27d.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730837699",
  "device_ref": "sandbox-21399"
}
```

```json
{
  "challenge_id": "c04160ad-67b4-4934-87a9-c3e91dc593a3",
  "expires_at": "2026-10-28T07:40:56.009159262Z",
  "resend_available_at": "2026-10-28T07:35:57.009159262Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730837699` → **200**

```json
{
  "phone": "+380730837699",
  "audience": "CLIENT",
  "code": "003445",
  "sent_at": "2026-10-28T07:35:56.011430272Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c04160ad-67b4-4934-87a9-c3e91dc593a3",
  "code": "003445",
  "device_ref": "sandbox-21399"
}
```

```json
{
  "session_id": "ec0c0941-1ffd-4311-91d1-edece6b11bba",
  "subject": {
    "type": "CLIENT",
    "id": "7b2ae76b-638f-4958-b643-9dd1d9b3da91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjJhZTc2Yi02MzhmLTQ5NTgtYjY0My05ZGQxZDliM2RhOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODU2LCJpYXQiOjE3OTMxNzI5NTYsImp0aSI6ImE5NDczNTQyLWY3YWQtNDI4NS04NWRkLTkxMjY5MGM3MjBjNyIsInNpZCI6ImVjMGMwOTQxLTFmZmQtNDMxMS05MWQxLWVkZWNlNmIxMWJiYSJ9.vceSagOronT6c2mkX4m8KN1TGi-MZtCE0acGgwNPUpA",
  "access_expires_at": "2026-10-28T07:50:56.060565546Z",
  "refresh_token": "aC00e6swGKHSDgQ9YDl-FHgcCLHcrbbQ8S3KBT4T0ho",
  "refresh_expires_at": "2026-11-27T07:35:56.060031359Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "6dbd1683-56bd-4840-a476-8a73f1bf2e36",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "009f1e76-d8dd-43b8-b0d5-edc4c9bdf322",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-009f1e76-d8dd-43b8-b0d5-edc4c9bdf322",
    "orderDate": "1793172956",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "43fd67dd0a343f439429ba43aa1d619b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=009f1e76-d8dd-43b8-b0d5-edc4c9bdf322",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730837699"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=009f1e76-d8dd-43b8-b0d5-edc4c9bdf322",
  "created_at": "2026-10-28T07:35:56.091731Z",
  "expires_at": "2026-10-28T08:05:56.091731Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/009f1e76-d8dd-43b8-b0d5-edc4c9bdf322` → **200**

```json
{
  "id": "009f1e76-d8dd-43b8-b0d5-edc4c9bdf322",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:35:56.091731Z",
  "expires_at": "2026-10-28T08:05:56.091731Z",
  "completed_at": "2026-10-28T07:35:56.126052Z",
  "masked_pan": "41****2180",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7b2ae76b-638f-4958-b643-9dd1d9b3da91",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7b2ae76b-638f-4958-b643-9dd1d9b3da91",
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
      "id": "468bc7c6-ff10-46ae-8343-d0327f5b953b",
      "at": "2026-10-28T07:35:56.841245Z",
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
  "client_id": "7b2ae76b-638f-4958-b643-9dd1d9b3da91",
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
      "id": "468bc7c6-ff10-46ae-8343-d0327f5b953b",
      "at": "2026-10-28T07:35:56.841245Z",
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
  "device_ref": "sandbox-17572"
}
```

```json
{
  "challenge_id": "b3d17f9f-d6a3-4e80-81b4-9585d2536eaa",
  "expires_at": "2026-10-28T07:40:57.240866466Z",
  "resend_available_at": "2026-10-28T07:35:58.240866466Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "224693",
  "sent_at": "2026-10-28T07:35:57.243758764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3d17f9f-d6a3-4e80-81b4-9585d2536eaa",
  "code": "224693",
  "device_ref": "sandbox-17572"
}
```

```json
{
  "session_id": "e6fe9ba2-0be9-48ba-8288-ec714d0ec9f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg1NywiaWF0IjoxNzkzMTcyOTU3LCJqdGkiOiIzMDQ4MzA2Ni02ZDNjLTRiYWEtYTQwZS1kMjZhOGE3YTE5NTciLCJzaWQiOiJlNmZlOWJhMi0wYmU5LTQ4YmEtODI4OC1lYzcxNGQwZWM5ZjMifQ.gYH_eeTHCSzjDd7mSDC8kFD4CKT1QWOev1PzbnwD_3o",
  "access_expires_at": "2026-10-28T07:50:57.296651049Z",
  "refresh_token": "DvjpkYpO_ZdLdlpW8rI13TuoEk7wdOicJ601LEYw0tI",
  "refresh_expires_at": "2026-11-27T07:35:57.296085835Z",
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
  "command_id": "bcf5c9e5-0bed-48d0-a8f7-b8e4f6529b5f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "253a1d05-129a-4e4b-88f3-295f596f582a",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-253a1d05-129a-4e4b-88f3-295f596f582a",
    "orderDate": "1793172957",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "600fa628bd6660a649f491ca343c13cb",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=253a1d05-129a-4e4b-88f3-295f596f582a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=253a1d05-129a-4e4b-88f3-295f596f582a",
  "created_at": "2026-10-28T07:35:57.349522Z",
  "expires_at": "2026-10-28T08:05:57.349522Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/253a1d05-129a-4e4b-88f3-295f596f582a` → **200**

```json
{
  "id": "253a1d05-129a-4e4b-88f3-295f596f582a",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:35:57.349522Z",
  "expires_at": "2026-10-28T08:05:57.349522Z",
  "completed_at": "2026-10-28T07:35:57.378598Z",
  "masked_pan": "41****4925",
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
      "id": "83143074-5b93-4b91-a145-d569720610ac",
      "at": "2026-10-28T07:35:57.845946Z",
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
  "command_id": "5d75c46e-a45a-47e3-8f64-1bc6a4e84aef",
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
  "correlation_id": "6a41e192-b5ce-4501-a8f5-38b164d41038"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677599937",
  "device_ref": "sandbox-32568"
}
```

```json
{
  "challenge_id": "f9e18ece-8ad0-4377-91ff-7b017db13440",
  "expires_at": "2026-10-28T07:40:58.504562917Z",
  "resend_available_at": "2026-10-28T07:35:59.504562917Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677599937` → **200**

```json
{
  "phone": "+380677599937",
  "audience": "CLIENT",
  "code": "929815",
  "sent_at": "2026-10-28T07:35:58.506926416Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9e18ece-8ad0-4377-91ff-7b017db13440",
  "code": "929815",
  "device_ref": "sandbox-32568"
}
```

```json
{
  "session_id": "67909cb0-cde3-42d9-8715-5d50ed8bc412",
  "subject": {
    "type": "CLIENT",
    "id": "d315cf61-05a8-4766-b4d7-53e5b44d76d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzE1Y2Y2MS0wNWE4LTQ3NjYtYjRkNy01M2U1YjQ0ZDc2ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODU4LCJpYXQiOjE3OTMxNzI5NTgsImp0aSI6IjhlODk2YjU4LWY4YTktNGZlZi04Nzk4LTlmMmY4MTVlYzQ4MSIsInNpZCI6IjY3OTA5Y2IwLWNkZTMtNDJkOS04NzE1LTVkNTBlZDhiYzQxMiJ9.6ICcCSZVxs8D8upymTuK7rvUsIc9G7iAnKU0KO_AgHg",
  "access_expires_at": "2026-10-28T07:50:58.558718574Z",
  "refresh_token": "fsDwxtT5vUl8fwTbBsM-Hgo_m6I0rCCPzqmQ-qQE5RU",
  "refresh_expires_at": "2026-11-27T07:35:58.558195623Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d315cf61-05a8-4766-b4d7-53e5b44d76d8",
  "session_id": "67909cb0-cde3-42d9-8715-5d50ed8bc412",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1b8d2483-efb6-41fb-8073-f67ddce16bcb",
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
  "id": "d5019aa7-4266-45f2-8f53-ba04d2bf43c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:40:58.612195Z",
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
  "challenge_id": "80fd305f-c889-4257-b90c-41f57ae06e56",
  "expires_at": "2026-10-28T07:41:00.645883424Z",
  "resend_available_at": "2026-10-28T07:36:01.645883424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677599937` → **200**

```json
{
  "phone": "+380677599937",
  "audience": "CLIENT",
  "code": "906274",
  "sent_at": "2026-10-28T07:36:00.648114254Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "983c0d5e-6cd8-40de-b205-c8552b681928",
  "challenge_id": "80fd305f-c889-4257-b90c-41f57ae06e56",
  "otp_code": "906274"
}
```

```json
{
  "client_id": "d315cf61-05a8-4766-b4d7-53e5b44d76d8",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T07:36:00.707420205Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "92778d9a-c77e-437e-b7d4-42af6636dcc8",
  "quote_id": "d5019aa7-4266-45f2-8f53-ba04d2bf43c5",
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
  "correlation_id": "e30f9191-3f3f-4dbe-bbf8-cd383f52d8b0"
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
  "session_id": "e7767393-4aa9-460a-981a-2eb5ec53670d",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4NjEsImlhdCI6MTc5MzE3Mjk2MSwianRpIjoiZmY2Nzk0NDEtMDM3YS00MTg2LWE2YjctZDMzYTM1YmFkMTQzIiwic2lkIjoiZTc3NjczOTMtNGFhOS00NjBhLTk4MWEtMmViNWVjNTM2NzBkIn0.zuevWiLZqInWap2f_RoxM9nwQedFo3s1ZLw1mErEtAk",
  "access_expires_at": "2026-10-28T07:51:01.02883604Z",
  "refresh_token": "Ysu6aydE2Id5uDZbnemyiHS-JlEiU7XUKElFgewG1gA",
  "refresh_expires_at": "2026-10-28T19:36:01.028349549Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d315cf61-05a8-4766-b4d7-53e5b44d76d8",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T07:36:00.70742Z",
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

`POST /api/admin/v1/client-deletions/d315cf61-05a8-4766-b4d7-53e5b44d76d8/complete` → **200**

```json
{
  "command_id": "1797b63b-2349-48fb-80b7-ee22d438fd0d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d315cf61-05a8-4766-b4d7-53e5b44d76d8",
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
  "correlation_id": "72204c3c-d887-41dc-82f1-006427201206"
}
```

Done: client d315cf61-05a8-4766-b4d7-53e5b44d76d8 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663027952",
  "device_ref": "sandbox-6460"
}
```

```json
{
  "challenge_id": "cadb0c50-0888-432c-a188-670d0eaebb50",
  "expires_at": "2026-10-28T07:41:01.154458472Z",
  "resend_available_at": "2026-10-28T07:36:02.154458472Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663027952` → **200**

```json
{
  "phone": "+380663027952",
  "audience": "CLIENT",
  "code": "901371",
  "sent_at": "2026-10-28T07:36:01.156676963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cadb0c50-0888-432c-a188-670d0eaebb50",
  "code": "901371",
  "device_ref": "sandbox-6460"
}
```

```json
{
  "session_id": "3f4c47f2-364a-466c-93ce-7b4c71e1b388",
  "subject": {
    "type": "CLIENT",
    "id": "65f32213-8c3e-47a2-8b40-0e0decfd0923"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWYzMjIxMy04YzNlLTQ3YTItOGI0MC0wZTBkZWNmZDA5MjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODYxLCJpYXQiOjE3OTMxNzI5NjEsImp0aSI6ImZhMWUyMTI5LTA2NTgtNDE5Zi1hOTdhLWFiNmM4NDBmYTZkNyIsInNpZCI6IjNmNGM0N2YyLTM2NGEtNDY2Yy05M2NlLTdiNGM3MWUxYjM4OCJ9.JqJ9ssLNxyUUiORnYwhbEfqjgnztQuu6TnnDahCqooE",
  "access_expires_at": "2026-10-28T07:51:01.207228273Z",
  "refresh_token": "Av4m45O0ivB6C1nup-x4Mj40iUMg1F3aLs3Bc7TOEvA",
  "refresh_expires_at": "2026-11-27T07:36:01.206794512Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "65f32213-8c3e-47a2-8b40-0e0decfd0923",
  "session_id": "3f4c47f2-364a-466c-93ce-7b4c71e1b388",
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
  "session_id": "855999de-7b77-424f-ac3f-4af4fa8b7d79",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4NjEsImlhdCI6MTc5MzE3Mjk2MSwianRpIjoiMzk3YWQ2NjktMjQ1Mi00OGY5LWJkMGEtMzBhODA1MDllNjgyIiwic2lkIjoiODU1OTk5ZGUtN2I3Ny00MjRmLWFjM2YtNGFmNGZhOGI3ZDc5In0.23q5Tb_MQt_gj_EoItdSMhm6Uq9F2nFymp9nMBp64g4",
  "access_expires_at": "2026-10-28T07:51:01.516947661Z",
  "refresh_token": "ztKjWk2ZkOgKoLfEsrVexdKpn5ww5IryoLlnFGP4ikY",
  "refresh_expires_at": "2026-10-28T19:36:01.516517184Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3027952&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "65f32213-8c3e-47a2-8b40-0e0decfd0923",
      "phone": "+380663027952",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T07:36:01.20509Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/65f32213-8c3e-47a2-8b40-0e0decfd0923` → **200**

```json
{
  "client": {
    "id": "65f32213-8c3e-47a2-8b40-0e0decfd0923",
    "phone": "+380663027952",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T07:36:01.20509Z",
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

`POST /api/admin/v1/clients/65f32213-8c3e-47a2-8b40-0e0decfd0923/block` → **400**

```json
{
  "command_id": "2e968dcc-1edd-4d86-8f1a-8445a4bafb0c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/65f32213-8c3e-47a2-8b40-0e0decfd0923/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f5339bff-555e-4bd7-8751-f4b564381f1c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/65f32213-8c3e-47a2-8b40-0e0decfd0923/block` → **200**

```json
{
  "command_id": "0106b9d1-2678-48cf-9364-933f18bb45ce",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "65f32213-8c3e-47a2-8b40-0e0decfd0923",
  "phone": "+380663027952",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T07:36:01.20509Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T07:36:01.658706Z",
    "by": "a7e57a74-5563-4e24-bb4b-067014acf110"
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
  "correlation_id": "16ab041f-e4fa-4296-b22f-3bfe738e4607"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663027952",
  "device_ref": "sandbox-25322"
}
```

```json
{
  "challenge_id": "58363bb9-0988-4e2c-aa2b-eef603799c29",
  "expires_at": "2026-10-28T07:41:03.710803163Z",
  "resend_available_at": "2026-10-28T07:36:04.710803163Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663027952` → **200**

```json
{
  "phone": "+380663027952",
  "audience": "CLIENT",
  "code": "844334",
  "sent_at": "2026-10-28T07:36:03.712803116Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "58363bb9-0988-4e2c-aa2b-eef603799c29",
  "code": "844334",
  "device_ref": "sandbox-25322"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8b158074-6d9b-40c4-ad1e-496201f9e1dc"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/65f32213-8c3e-47a2-8b40-0e0decfd0923` → **200**

```json
{
  "client": {
    "id": "65f32213-8c3e-47a2-8b40-0e0decfd0923",
    "phone": "+380663027952",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T07:36:01.20509Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T07:36:01.658706Z",
      "by": "a7e57a74-5563-4e24-bb4b-067014acf110"
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

`POST /api/admin/v1/clients/65f32213-8c3e-47a2-8b40-0e0decfd0923/unblock` → **200**

```json
{
  "command_id": "0d07392b-0406-43c1-a3df-6f1d0c52b335",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "65f32213-8c3e-47a2-8b40-0e0decfd0923",
  "phone": "+380663027952",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T07:36:01.20509Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663027952",
  "device_ref": "sandbox-14142"
}
```

```json
{
  "challenge_id": "91121b52-909b-4864-89e4-7e4ca9ef9078",
  "expires_at": "2026-10-28T07:41:05.851952731Z",
  "resend_available_at": "2026-10-28T07:36:06.851952731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663027952` → **200**

```json
{
  "phone": "+380663027952",
  "audience": "CLIENT",
  "code": "119998",
  "sent_at": "2026-10-28T07:36:05.853974307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91121b52-909b-4864-89e4-7e4ca9ef9078",
  "code": "119998",
  "device_ref": "sandbox-14142"
}
```

```json
{
  "session_id": "3d515e99-a19d-44d6-ae55-f74dd5a03444",
  "subject": {
    "type": "CLIENT",
    "id": "65f32213-8c3e-47a2-8b40-0e0decfd0923"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWYzMjIxMy04YzNlLTQ3YTItOGI0MC0wZTBkZWNmZDA5MjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODY1LCJpYXQiOjE3OTMxNzI5NjUsImp0aSI6ImQ1MDI2MWZlLTlkNjItNDQ1Zi1iZDU0LTUyZjljNmU5YzI5NyIsInNpZCI6IjNkNTE1ZTk5LWExOWQtNDRkNi1hZTU1LWY3NGRkNWEwMzQ0NCJ9.RVJ9Ivi8lGQDU_FWhYzeMxzmVjii6ZL5HA0tJSLJaDc",
  "access_expires_at": "2026-10-28T07:51:05.903080942Z",
  "refresh_token": "Q5qK1FGHcZq22Y5RSQ4FbIOdzLhrP3gUnAnAjhg1xTs",
  "refresh_expires_at": "2026-11-27T07:36:05.902650085Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "65f32213-8c3e-47a2-8b40-0e0decfd0923",
  "session_id": "3d515e99-a19d-44d6-ae55-f74dd5a03444",
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
  "phone": "+380638053702",
  "device_ref": "sandbox-1279"
}
```

```json
{
  "challenge_id": "3a2f8d8e-c7f9-4a76-a269-a01324bb0dab",
  "expires_at": "2026-10-28T07:41:05.958073725Z",
  "resend_available_at": "2026-10-28T07:36:06.958073725Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638053702` → **200**

```json
{
  "phone": "+380638053702",
  "audience": "CLIENT",
  "code": "846859",
  "sent_at": "2026-10-28T07:36:05.960284495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a2f8d8e-c7f9-4a76-a269-a01324bb0dab",
  "code": "846859",
  "device_ref": "sandbox-1279"
}
```

```json
{
  "session_id": "bbe5046e-105e-40c3-9039-39a32eb87c1d",
  "subject": {
    "type": "CLIENT",
    "id": "403ca1ab-1e7c-4e00-80d5-9d06f60f2833"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDNjYTFhYi0xZTdjLTRlMDAtODBkNS05ZDA2ZjYwZjI4MzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODY2LCJpYXQiOjE3OTMxNzI5NjYsImp0aSI6IjgwY2E5YTY5LWRjNjEtNDYyZC05NWU1LTU3ZGE3M2M4OGRjZSIsInNpZCI6ImJiZTUwNDZlLTEwNWUtNDBjMy05MDM5LTM5YTMyZWI4N2MxZCJ9.BzA_rlpsjbL2i3kp5EeR1jppExJ-wPGjA41Q42pEQsA",
  "access_expires_at": "2026-10-28T07:51:06.008930889Z",
  "refresh_token": "XLuDgB8uCrowDSVrhRaacX3kNYQSWAoiBAVe3JZKLPw",
  "refresh_expires_at": "2026-11-27T07:36:06.008375835Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "4da02e0a-1e3a-4986-9850-626e296ab5f6",
  "expires_at": "2026-10-28T07:41:08.037181609Z",
  "resend_available_at": "2026-10-28T07:36:09.037181609Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638053702` → **200**

```json
{
  "phone": "+380638053702",
  "audience": "CLIENT",
  "code": "816190",
  "sent_at": "2026-10-28T07:36:08.039103705Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "b1dbe6a5-c9c7-42a5-8b4b-a99fdf0e1c2d",
  "challenge_id": "4da02e0a-1e3a-4986-9850-626e296ab5f6",
  "otp_code": "816190"
}
```

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "PENDING",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1` → **200**

```json
{
  "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
  "state": "READY",
  "created_at": "2026-10-28T07:36:08.093409Z",
  "ready_at": "2026-10-28T07:36:16.082494Z",
  "expires_at": "2026-11-04T07:36:16.082494Z",
  "size_bytes": 1006
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630398771",
  "device_ref": "sandbox-25572"
}
```

```json
{
  "challenge_id": "2f689c4b-cc2c-41ab-b262-c5db3d5d7dbf",
  "expires_at": "2026-10-28T07:41:16.357258705Z",
  "resend_available_at": "2026-10-28T07:36:17.357258705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630398771` → **200**

```json
{
  "phone": "+380630398771",
  "audience": "CLIENT",
  "code": "381794",
  "sent_at": "2026-10-28T07:36:16.359419279Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f689c4b-cc2c-41ab-b262-c5db3d5d7dbf",
  "code": "381794",
  "device_ref": "sandbox-25572"
}
```

```json
{
  "session_id": "a12ebf04-eca2-4478-9009-3d5717d9acb4",
  "subject": {
    "type": "CLIENT",
    "id": "02dc1676-ef6b-4465-838a-40136744826e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmRjMTY3Ni1lZjZiLTQ0NjUtODM4YS00MDEzNjc0NDgyNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODc2LCJpYXQiOjE3OTMxNzI5NzYsImp0aSI6IjJkZDQ5NDIyLTNkY2UtNGMxOC1hNTU1LWFkZjI4MzYzMjM4MSIsInNpZCI6ImExMmViZjA0LWVjYTItNDQ3OC05MDA5LTNkNTcxN2Q5YWNiNCJ9.Bs8i69t6CLoNpxpGXtExfWrhXJMYeGNnSlGVa1NHiTE",
  "access_expires_at": "2026-10-28T07:51:16.408370944Z",
  "refresh_token": "i7h60KaJbgBBdaqCKJYkaLdWqsTFAYWGBrPUhgXiErI",
  "refresh_expires_at": "2026-11-27T07:36:16.407936101Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/073e438c-9e55-4fa1-ab86-0f8dd4751ae1/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bc2bd378-7c22-4ab8-b3b9-bec69ee7cba6"
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
  "session_id": "5fe09257-7d4e-45a6-be9a-b4f31ecde6fd",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4NzYsImlhdCI6MTc5MzE3Mjk3NiwianRpIjoiMDM4M2I5MGItYTVmZi00ZTExLWJjZDgtY2EzM2Y4N2JlNzlmIiwic2lkIjoiNWZlMDkyNTctN2Q0ZS00NWE2LWJlOWEtYjRmMzFlY2RlNmZkIn0.B-Vpo-fGyC040RtiEuOgGGvQ7m0d1C2Fp12G-Pjx-jI",
  "access_expires_at": "2026-10-28T07:51:16.714208409Z",
  "refresh_token": "4n2m0hWzyXX5wcL1zwUCrx--fTnddzYn4mwZ8zoadqk",
  "refresh_expires_at": "2026-10-28T19:36:16.713718974Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "403ca1ab-1e7c-4e00-80d5-9d06f60f2833",
  "session_id": "bbe5046e-105e-40c3-9039-39a32eb87c1d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/403ca1ab-1e7c-4e00-80d5-9d06f60f2833/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "073e438c-9e55-4fa1-ab86-0f8dd4751ae1",
      "state": "READY",
      "created_at": "2026-10-28T07:36:08.093409Z",
      "ready_at": "2026-10-28T07:36:16.082494Z",
      "expires_at": "2026-11-04T07:36:16.082494Z",
      "size_bytes": 1006
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.

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
  "device_ref": "sandbox-17604"
}
```

```json
{
  "challenge_id": "52d631c7-0ce4-4312-8055-c0c350ce785c",
  "expires_at": "2026-10-28T07:41:16.821643687Z",
  "resend_available_at": "2026-10-28T07:36:17.821643687Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "676709",
  "sent_at": "2026-10-28T07:36:16.823811937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52d631c7-0ce4-4312-8055-c0c350ce785c",
  "code": "676709",
  "device_ref": "sandbox-17604"
}
```

```json
{
  "session_id": "8a999e24-87eb-4c50-9406-24ebf98299b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg3NiwiaWF0IjoxNzkzMTcyOTc2LCJqdGkiOiJhMTMzMGQ1ZS1lYTJmLTRlNzQtOGU3My0yNDNhZjU5ZTkyZWQiLCJzaWQiOiI4YTk5OWUyNC04N2ViLTRjNTAtOTQwNi0yNGViZjk4Mjk5YjEifQ.SrF0ZjhAnIvgEl0Vp2PlE-dk66gGV82OkKPi0wHFN9w",
  "access_expires_at": "2026-10-28T07:51:16.873640249Z",
  "refresh_token": "1rgSMDljHI7NZHEMMd1ZwcKRepe_QUoTgDG8Qm1pKO4",
  "refresh_expires_at": "2026-11-27T07:36:16.873179827Z",
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
  "command_id": "d7bad175-a819-478b-9cce-bd234b2bb9f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:16Z",
    "sequence": 1793172976917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:16.9336Z",
  "last_location_at": "2026-10-28T07:36:16.9336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670373882",
  "device_ref": "sandbox-28973"
}
```

```json
{
  "challenge_id": "57a72fae-bc10-4f92-acb6-023a4881865d",
  "expires_at": "2026-10-28T07:41:16.96145731Z",
  "resend_available_at": "2026-10-28T07:36:17.96145731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670373882` → **200**

```json
{
  "phone": "+380670373882",
  "audience": "CLIENT",
  "code": "832185",
  "sent_at": "2026-10-28T07:36:16.963309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57a72fae-bc10-4f92-acb6-023a4881865d",
  "code": "832185",
  "device_ref": "sandbox-28973"
}
```

```json
{
  "session_id": "488d7fac-6f75-4aed-b721-d64c963c5c8e",
  "subject": {
    "type": "CLIENT",
    "id": "bb0ca169-71ff-44b4-bc79-b8858ce4e83e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjBjYTE2OS03MWZmLTQ0YjQtYmM3OS1iODg1OGNlNGU4M2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODc3LCJpYXQiOjE3OTMxNzI5NzcsImp0aSI6ImE1ZTg2ZWY2LWUzOTYtNDJjOS05ZDJjLTY0NWYxMjZkNjA3NSIsInNpZCI6IjQ4OGQ3ZmFjLTZmNzUtNGFlZC1iNzIxLWQ2NGM5NjNjNWM4ZSJ9.mVite7UNiQhDMrbZ6pCSSPev4VzQKpjXAafrJs4KdKk",
  "access_expires_at": "2026-10-28T07:51:17.011323148Z",
  "refresh_token": "Ca3MVtTVn4P9Dsf7qEleXbcAyu874c4zcTbwxBxLp5Q",
  "refresh_expires_at": "2026-11-27T07:36:17.010851429Z",
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
  "command_id": "9e574fc6-49bd-4895-a2ed-08a089d7be36",
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
  "id": "484494e5-46a4-4053-99ff-f9db1c19b81d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:41:17.067643Z",
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
  "command_id": "6b3e9abd-f2ab-48ef-b4be-e4e1df14146a",
  "platform": "ANDROID",
  "token": "sandbox-driver-e7856b02-eab6-4f22-8579-9f14211b5dff"
}
```

```json
{
  "id": "b1b51771-65d1-4bc8-bebe-1d9809533fb4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:36:17.105415Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1e02315f-8a00-4471-8e25-fffeb0487339",
  "platform": "ANDROID",
  "token": "sandbox-rider-3c2e3346-c1c4-4176-a3ba-739d0ac875ec"
}
```

```json
{
  "id": "8de47699-fb3e-441a-bca0-f7d155669e32",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:36:17.136711Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0999f825-e4c7-4293-b0a8-029476afd519",
  "quote_id": "484494e5-46a4-4053-99ff-f9db1c19b81d",
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
  "id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bb0ca169-71ff-44b4-bc79-b8858ce4e83e",
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
  "created_at": "2026-10-28T07:36:17.174146Z",
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
    "id": "aa46eaae-6807-4f4c-8b92-621784cafa3b",
    "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
    "expires_at": "2026-10-28T07:36:32.177165Z",
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

`POST /api/driver/v1/offers/aa46eaae-6807-4f4c-8b92-621784cafa3b/accept` → **200**

```json
{
  "command_id": "0fa38e2c-402f-4c67-864f-56ba5b8956c1"
}
```

```json
{
  "id": "14916771-9825-4413-8121-37377fbbd277",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:36:17.153Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:36:17.153Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:36:17.153Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:36:18.346294116Z",
    "token_suffix": "1b5dff",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "8105eed9-c443-4370-9779-52568a98f3fd",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670373882&after=2026-10-28T07:36:17.153Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:36:18.347611834Z",
    "token_suffix": "c875ec",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "a1d3d35d-9778-4c50-aeb5-7935b6d8a8ce",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a935e193-bf13-4cbf-8e6f-9455745c9b24/messages` → **201**

```json
{
  "command_id": "500fa21f-5248-45d9-a072-83f05d30c92c",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "82fe745c-5bae-4d2f-a5c8-5780a43d1970",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T07:36:19.373088303Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "assignment_id": "14916771-9825-4413-8121-37377fbbd277",
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

`POST /api/driver/v1/trips/8ed739b2-b601-41c8-a2f7-965dcc55af20/messages` → **201**

```json
{
  "command_id": "ab317458-161c-4768-8afc-340cd499214a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "5f7525c4-493f-4c58-af26-ea0bc611803a",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T07:36:19.419460861Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a935e193-bf13-4cbf-8e6f-9455745c9b24/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/8ed739b2-b601-41c8-a2f7-965dcc55af20/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670373882"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:19Z",
    "sequence": 1793172979484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:19.500923Z",
  "last_location_at": "2026-10-28T07:36:19.500923Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "assignment_id": "14916771-9825-4413-8121-37377fbbd277",
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

`POST /api/driver/v1/trips/8ed739b2-b601-41c8-a2f7-965dcc55af20/arrive` → **200**

```json
{
  "command_id": "2aecf7ef-867e-4f1b-ac85-32069aa8cf5b",
  "expected_version": 0
}
```

```json
{
  "id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "assignment_id": "14916771-9825-4413-8121-37377fbbd277",
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
  "arrived_at": "2026-10-28T07:36:19.546062Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8ed739b2-b601-41c8-a2f7-965dcc55af20/start` → **200**

```json
{
  "command_id": "b4c8112a-6db9-494f-a786-0026f18a1c53",
  "expected_version": 1
}
```

```json
{
  "id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "assignment_id": "14916771-9825-4413-8121-37377fbbd277",
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
  "arrived_at": "2026-10-28T07:36:19.546062Z",
  "started_at": "2026-10-28T07:36:19.578297Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:19Z",
    "sequence": 1793172979598
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:19.615345Z",
  "last_location_at": "2026-10-28T07:36:19.615345Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/8ed739b2-b601-41c8-a2f7-965dcc55af20/complete` → **200**

```json
{
  "command_id": "3aabbfc1-57b9-4e52-8e71-46e401439a8e",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:36:19Z",
  "cash_received": true
}
```

```json
{
  "id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "assignment_id": "14916771-9825-4413-8121-37377fbbd277",
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
  "arrived_at": "2026-10-28T07:36:19.546062Z",
  "started_at": "2026-10-28T07:36:19.578297Z",
  "completed_at": "2026-10-28T07:36:19.646901Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a935e193-bf13-4cbf-8e6f-9455745c9b24` → **200**

```json
{
  "id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bb0ca169-71ff-44b4-bc79-b8858ce4e83e",
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
    "id": "14916771-9825-4413-8121-37377fbbd277",
    "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:36:17.174146Z",
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
    "id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:36:17.174146Z",
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
    "id": "8ed739b2-b601-41c8-a2f7-965dcc55af20",
    "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
    "order_short_number": 5,
    "created_at": "2026-10-28T07:36:17.233832Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1d7cde44-ce1c-4450-8f8c-79ceb3b45c82",
    "order_id": "0168dfa1-eba9-412c-b162-f8e9fa1f0abf",
    "order_short_number": 1,
    "created_at": "2026-10-28T07:35:40.04097Z",
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

`GET /api/rider/v1/orders/a935e193-bf13-4cbf-8e6f-9455745c9b24/tip` → **200**

```json
{
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
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
  "available_until": "2026-10-29T07:36:19.646901Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a935e193-bf13-4cbf-8e6f-9455745c9b24/tip` → **201**

```json
{
  "command_id": "6c1704d6-fe56-46c9-8fe5-bb5ed0230bd2",
  "amount_minor": 1100
}
```

```json
{
  "id": "8619da45-abf3-49ea-87c3-50a038105efc",
  "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T07:36:22.827528Z"
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
  "session_id": "60578ccb-a506-4e6f-9465-528f5115ca68",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4ODMsImlhdCI6MTc5MzE3Mjk4MywianRpIjoiOTdiMWFjZmYtMDE0Zi00NDcxLWJkODctYTQ5MzY5ODMwOWM4Iiwic2lkIjoiNjA1NzhjY2ItYTUwNi00ZTZmLTk0NjUtNTI4ZjUxMTVjYTY4In0.-0fuAzXPiw7sBKXNS1kEy0EbY6HreLh8jC8Yz3_6Omc",
  "access_expires_at": "2026-10-28T07:51:23.114378962Z",
  "refresh_token": "MNCv9V5Ukc16lebCYNZtNwxJJHkFR5JomD-vZEN-JAk",
  "refresh_expires_at": "2026-10-28T19:36:23.113840313Z",
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
  "generated_at": "2026-10-28T07:36:23.142496902Z"
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
  "generated_at": "2026-10-28T07:36:23.170547722Z"
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
  "session_id": "843a205d-915e-488d-8876-4e7fba1bbb66",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4ODMsImlhdCI6MTc5MzE3Mjk4MywianRpIjoiYWNlYzBiYWYtNDk0Yi00ZDllLThiZTktNzVkYTFhNDBmYmVlIiwic2lkIjoiODQzYTIwNWQtOTE1ZS00ODhkLTg4NzYtNGU3ZmJhMWJiYjY2In0.Ju3IHl2hkmXQGCMrp5hzbAtvm6xlvI4skI8lZG24pjk",
  "access_expires_at": "2026-10-28T07:51:23.454912747Z",
  "refresh_token": "Sy1_d7L8iHABndumpr36vegfo17MV6Yr5ll_8AVln2A",
  "refresh_expires_at": "2026-10-28T19:36:23.454425685Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a935e193-bf13-4cbf-8e6f-9455745c9b24/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:36:17.17474Z",
      "actor": {
        "type": "CLIENT",
        "id": "bb0ca169-71ff-44b4-bc79-b8858ce4e83e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
        "quote_id": "484494e5-46a4-4053-99ff-f9db1c19b81d",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:36:17.176382Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
        "attempt_id": "8971e10e-ec53-4a78-8799-bed4d8f5397d",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:36:17.18132Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "aa46eaae-6807-4f4c-8b92-621784cafa3b",
        "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:36:17.235303Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "aa46eaae-6807-4f4c-8b92-621784cafa3b",
        "order_id": "a935e193-bf13-4cbf-8e6f-9455745c9b24",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "14916771-9825-4413-8121-37377fbbd277"
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
  "at": "2026-10-28T07:36:23.50110073Z",
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
      "last_location_at": "2026-10-28T07:36:19.615345Z",
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
      "connection": "DISCONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 50.459,
        "lon": 30.5238
      },
      "last_location_at": "2026-10-28T07:35:47.532368Z",
      "order_id": null
    }
  ]
}
```

Done: order a935e193-bf13-4cbf-8e6f-9455745c9b24.

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
  "session_id": "ef01c93a-6603-4a8f-8035-a2a473677883",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4ODMsImlhdCI6MTc5MzE3Mjk4MywianRpIjoiMWQyYzgyZDEtMGRkOC00NjE1LWFmNDUtZWU3ZGU3YmJlZTdkIiwic2lkIjoiZWYwMWM5M2EtNjYwMy00YThmLTgwMzUtYTJhNDczNjc3ODgzIn0.enlxLk67a4glHoeVwWyDZhPBh3zNMhrx7EFV7fEsNxM",
  "access_expires_at": "2026-10-28T07:51:23.798286386Z",
  "refresh_token": "Bruzbd5znMSsAVe2xGaobR2u1XGw_cSQ7SarPDgY5VI",
  "refresh_expires_at": "2026-10-28T19:36:23.797798924Z",
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
  "command_id": "cddac157-3e42-4382-85fa-781c101427d0",
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
  "timestamp": "2026-10-28T07:36:23.000+0000",
  "channel": {
    "id": "1730052000.337310452",
    "linkedid": "1730052000.337310452",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677890121"
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
  "timestamp": "2026-10-28T07:36:23.000+0000",
  "channel": {
    "id": "1730052000.337310452",
    "linkedid": "1730052000.337310452",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677890121"
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
  "session_id": "19f652b5-b476-421f-880d-59ca55155f17",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4ODQsImlhdCI6MTc5MzE3Mjk4NCwianRpIjoiYzkzYjY1YjUtNmRiZC00ZTMzLTg2YWEtM2MyM2EzMmUwZTU3Iiwic2lkIjoiMTlmNjUyYjUtYjQ3Ni00MjFmLTg4MGQtNTljYTU1MTU1ZjE3In0.56pQcCjHSkbLXV0qPAtTMu9Z-UVrmZCvEa5TgZa__gY",
  "access_expires_at": "2026-10-28T07:51:24.181690483Z",
  "refresh_token": "p1dZp-7iYEJJFmvFCp4DiLhnCTbIn1yhew2IWfIwCTg",
  "refresh_expires_at": "2026-10-28T19:36:24.181207317Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "611dd44d-e120-44fb-aa8a-8f9558935b73",
      "state": "RINGING",
      "caller_phone": "+380677890121",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:36:23Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/611dd44d-e120-44fb-aa8a-8f9558935b73/answer` → **200**

```json
{
  "command_id": "9d488cbb-ec9a-41ad-9e2d-425b8592de46"
}
```

```json
{
  "id": "611dd44d-e120-44fb-aa8a-8f9558935b73",
  "state": "ANSWERED",
  "caller_phone": "+380677890121",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "order_ids": [],
  "started_at": "2026-10-28T07:36:23Z",
  "answered_at": "2026-10-28T07:36:24.2423Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.337310452",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ce293559-ce31-4420-a4a0-73fe3da21bf5",
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
  "id": "fa9341a9-fa19-484b-8299-0d250d0c1688",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:41:24.301941Z",
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
  "command_id": "415b7f61-ddd1-4f5a-be2e-29d6ecc4ed5b",
  "quote_id": "fa9341a9-fa19-484b-8299-0d250d0c1688",
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
    "phone": "+380677890121"
  },
  "call_id": "611dd44d-e120-44fb-aa8a-8f9558935b73"
}
```

```json
{
  "id": "a1b70add-8b0f-47da-8642-ed3fb8658733",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:36:24.346453Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677890121"
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
    "id": "1730052000.337310452",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "611dd44d-e120-44fb-aa8a-8f9558935b73",
      "state": "ENDED",
      "caller_phone": "+380677890121",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "order_ids": [
        "a1b70add-8b0f-47da-8642-ed3fb8658733"
      ],
      "started_at": "2026-10-28T07:36:23Z",
      "answered_at": "2026-10-28T07:36:24.2423Z",
      "ended_at": "2026-10-28T07:36:24.388209Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b093aac8-6cbb-47e2-b75e-379d1b380a9c",
      "state": "ENDED",
      "caller_phone": "+380678288899",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "order_ids": [],
      "started_at": "2026-10-28T07:35:44.188236Z",
      "answered_at": "2026-10-28T07:35:44.245672Z",
      "ended_at": "2026-10-28T07:35:44.28991Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:35:46.149921Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/a1b70add-8b0f-47da-8642-ed3fb8658733` → **200**

```json
{
  "id": "a1b70add-8b0f-47da-8642-ed3fb8658733",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:36:24.346453Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677890121"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/a1b70add-8b0f-47da-8642-ed3fb8658733` → **200**

```json
{
  "id": "a1b70add-8b0f-47da-8642-ed3fb8658733",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:36:24.346453Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677890121"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a1b70add-8b0f-47da-8642-ed3fb8658733/cancel` → **200**

```json
{
  "command_id": "64a64998-c8f6-475a-9c56-26aafc376ca5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a1b70add-8b0f-47da-8642-ed3fb8658733",
  "short_number": 6,
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
  "created_at": "2026-10-28T07:36:24.346453Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677890121"
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

Done: call 611dd44d-e120-44fb-aa8a-8f9558935b73 with order a1b70add-8b0f-47da-8642-ed3fb8658733.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12825"
}
```

```json
{
  "challenge_id": "e7e0193c-61eb-4aa5-96c5-fb024bb129a6",
  "expires_at": "2026-10-28T07:41:24.526740809Z",
  "resend_available_at": "2026-10-28T07:36:25.526740809Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "008180",
  "sent_at": "2026-10-28T07:36:24.528775835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7e0193c-61eb-4aa5-96c5-fb024bb129a6",
  "code": "008180",
  "device_ref": "sandbox-12825"
}
```

```json
{
  "session_id": "64eb066e-7a0a-4ca3-b4de-f4c2eb18fa3c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg4NCwiaWF0IjoxNzkzMTcyOTg0LCJqdGkiOiIxYzYzNWRiZC05YTAzLTQ3ZjAtYjFhOS0wMDNlMGE1YWU5NjIiLCJzaWQiOiI2NGViMDY2ZS03YTBhLTRjYTMtYjRkZS1mNGMyZWIxOGZhM2MifQ.xkudBqnLHvS5-MD-ffLjvUbh7Rc-q-eDjPGil1-7-HM",
  "access_expires_at": "2026-10-28T07:51:24.577723006Z",
  "refresh_token": "U9WLWQZjf6rjMQfAvPlGJDxlqCTdYlx0fnH0HBKqjHo",
  "refresh_expires_at": "2026-11-27T07:36:24.5772996Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:19.615345Z",
  "last_location_at": "2026-10-28T07:36:19.615345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/handover` → **200**

```json
{
  "command_id": "b8087840-36f5-4859-ad91-0b0814606da4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:19.615345Z",
  "last_location_at": "2026-10-28T07:36:19.615345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:24Z",
    "sequence": 1793172984649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:24.665819Z",
  "last_location_at": "2026-10-28T07:36:24.665819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665348002",
  "device_ref": "sandbox-9184"
}
```

```json
{
  "challenge_id": "50337a3f-f5be-46a7-9d70-c8f9b02b6913",
  "expires_at": "2026-10-28T07:41:24.686808758Z",
  "resend_available_at": "2026-10-28T07:36:25.686808758Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665348002` → **200**

```json
{
  "phone": "+380665348002",
  "audience": "CLIENT",
  "code": "174983",
  "sent_at": "2026-10-28T07:36:24.688827609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50337a3f-f5be-46a7-9d70-c8f9b02b6913",
  "code": "174983",
  "device_ref": "sandbox-9184"
}
```

```json
{
  "session_id": "14d00cac-13b5-4c0e-92c3-3bff5e378187",
  "subject": {
    "type": "CLIENT",
    "id": "2c0719c1-1a1f-44cb-8d0e-f8f396447f54"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzA3MTljMS0xYTFmLTQ0Y2ItOGQwZS1mOGYzOTY0NDdmNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODg0LCJpYXQiOjE3OTMxNzI5ODQsImp0aSI6IjcwYzExODg2LTcyZmQtNGQxNC1iZjBhLTRjNWI5ZjI4YTU1MiIsInNpZCI6IjE0ZDAwY2FjLTEzYjUtNGMwZS05MmMzLTNiZmY1ZTM3ODE4NyJ9.Bo_Y1ShbC1NuefZZWbDXW-4yOV4O33LnPDcvvLOjaYE",
  "access_expires_at": "2026-10-28T07:51:24.736672785Z",
  "refresh_token": "W9xJbK4FWBrGFI2sVqxfU0EJ-4xRkFi-a8jAsXvz_Gw",
  "refresh_expires_at": "2026-11-27T07:36:24.736222089Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9c6afa67-c644-417d-8945-85e49e26e145",
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
  "id": "6ac2c800-1de9-49ad-ad5c-87e4e9da0aee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T07:41:24.766007Z",
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
  "command_id": "c0ad3f77-fd82-4f35-a2f2-0be8355fd530",
  "quote_id": "6ac2c800-1de9-49ad-ad5c-87e4e9da0aee",
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
  "id": "be753f36-70c2-4264-92fe-b31cba5687ff",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0719c1-1a1f-44cb-8d0e-f8f396447f54",
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
  "created_at": "2026-10-28T07:36:24.800654Z",
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
    "id": "23c33e7d-036e-450b-bdc8-f525d20543e9",
    "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
    "expires_at": "2026-10-28T07:36:39.804011Z",
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

`POST /api/driver/v1/offers/23c33e7d-036e-450b-bdc8-f525d20543e9/accept` → **200**

```json
{
  "command_id": "443b38ff-ca5b-4c2c-99c0-f8786eb7607c"
}
```

```json
{
  "id": "02d08057-d9f2-46b8-adc3-be5247b63e2f",
  "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "627b35b8-d999-431e-8c60-b47f15cc909a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "627b35b8-d999-431e-8c60-b47f15cc909a",
  "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
  "assignment_id": "02d08057-d9f2-46b8-adc3-be5247b63e2f",
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

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:24Z",
    "sequence": 1793172984900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:24.916746Z",
  "last_location_at": "2026-10-28T07:36:24.916746Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/627b35b8-d999-431e-8c60-b47f15cc909a/arrive` → **200**

```json
{
  "command_id": "c5094649-de83-45c8-a0db-75f6f76341b9",
  "expected_version": 0
}
```

```json
{
  "id": "627b35b8-d999-431e-8c60-b47f15cc909a",
  "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
  "assignment_id": "02d08057-d9f2-46b8-adc3-be5247b63e2f",
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
  "arrived_at": "2026-10-28T07:36:24.94987Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/627b35b8-d999-431e-8c60-b47f15cc909a/start` → **200**

```json
{
  "command_id": "c37c136c-9710-4657-8a6f-13e6f8e1e901",
  "expected_version": 1
}
```

```json
{
  "id": "627b35b8-d999-431e-8c60-b47f15cc909a",
  "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
  "assignment_id": "02d08057-d9f2-46b8-adc3-be5247b63e2f",
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
  "arrived_at": "2026-10-28T07:36:24.94987Z",
  "started_at": "2026-10-28T07:36:24.990301Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:25Z",
    "sequence": 1793172985144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.031052Z",
  "last_location_at": "2026-10-28T07:36:25.031052Z",
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
  "device_ref": "sandbox-20509"
}
```

```json
{
  "challenge_id": "4775d6ca-c21d-4f26-95f5-ffdbb31654a2",
  "expires_at": "2026-10-28T07:41:25.05410316Z",
  "resend_available_at": "2026-10-28T07:36:26.05410316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "886405",
  "sent_at": "2026-10-28T07:36:25.056157354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4775d6ca-c21d-4f26-95f5-ffdbb31654a2",
  "code": "886405",
  "device_ref": "sandbox-20509"
}
```

```json
{
  "session_id": "334dc39c-5660-4d22-be03-902311301551",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg4NSwiaWF0IjoxNzkzMTcyOTg1LCJqdGkiOiI5YjM2ZmEyYS0xZjU1LTQzNjItYWJkNS0wNjczMjk3Yzk2YzMiLCJzaWQiOiIzMzRkYzM5Yy01NjYwLTRkMjItYmUwMy05MDIzMTEzMDE1NTEifQ.e9UvGZTRoNtS81I3aqVBFKCjAaGCTNN42BFR52QPtnY",
  "access_expires_at": "2026-10-28T07:51:25.108783329Z",
  "refresh_token": "TPs76HStoIASuTvKGwevm4ZboElLIQRp7fhCxZurtWE",
  "refresh_expires_at": "2026-11-27T07:36:25.108269868Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:35:47.532368Z",
  "last_location_at": "2026-10-28T07:35:47.532368Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7101c6e9-7510-4272-99b2-374f69439a2f/handover` → **200**

```json
{
  "command_id": "9abca11c-e57d-4052-b4a2-434da5096cb4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:35:47.532368Z",
  "last_location_at": "2026-10-28T07:35:47.532368Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7101c6e9-7510-4272-99b2-374f69439a2f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:25Z",
    "sequence": 1793172985196
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.212486Z",
  "last_location_at": "2026-10-28T07:36:25.212486Z",
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
  "session_id": "3a8211bd-2c8b-4dd4-9aea-93d6329b3924",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4ODUsImlhdCI6MTc5MzE3Mjk4NSwianRpIjoiZmYwMGEwYjMtNmZkYi00MWY2LTkxYTItZjVlNTdiMzVhNDkzIiwic2lkIjoiM2E4MjExYmQtMmM4Yi00ZGQ0LTlhZWEtOTNkNjMyOWIzOTI0In0.z8IGh08pFP6cYhAi8An5EL4uUcUy6kHhv8mic_V_COQ",
  "access_expires_at": "2026-10-28T07:51:25.493874324Z",
  "refresh_token": "h5oaEp0eJvGK-OgyNHcwLlsOyfAo-JyGTdn9Si2xOkk",
  "refresh_expires_at": "2026-10-28T19:36:25.49336892Z",
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
  "session_id": "981892bf-284e-4057-86f1-57e97b9dc3f5",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4ODUsImlhdCI6MTc5MzE3Mjk4NSwianRpIjoiYjk0YmY0YjItNTkzZC00ZGVlLWI0YzAtM2YwMTExMDNjNGM4Iiwic2lkIjoiOTgxODkyYmYtMjg0ZS00MDU3LTg2ZjEtNTdlOTdiOWRjM2Y1In0.wG16JZFYbUQ6D86_oTkIzLGtSH-AJSHuIkTQb1bEMA4",
  "access_expires_at": "2026-10-28T07:51:25.783582537Z",
  "refresh_token": "v_WaneNNQCNcjIdE9AXXGsy37wnTdJ9KTqcy76IC8zk",
  "refresh_expires_at": "2026-10-28T19:36:25.783172491Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/be753f36-70c2-4264-92fe-b31cba5687ff` → **200**

```json
{
  "id": "be753f36-70c2-4264-92fe-b31cba5687ff",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2c0719c1-1a1f-44cb-8d0e-f8f396447f54",
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
    "id": "02d08057-d9f2-46b8-adc3-be5247b63e2f",
    "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "627b35b8-d999-431e-8c60-b47f15cc909a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T07:36:24.800654Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/be753f36-70c2-4264-92fe-b31cba5687ff/interrupt` → **200**

```json
{
  "command_id": "98f90e16-6ba5-4a4b-9ebe-316ade1ee43b",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "be753f36-70c2-4264-92fe-b31cba5687ff",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "2c0719c1-1a1f-44cb-8d0e-f8f396447f54",
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
      "id": "02d08057-d9f2-46b8-adc3-be5247b63e2f",
      "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "627b35b8-d999-431e-8c60-b47f15cc909a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T07:36:24.800654Z",
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
    "id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "2c0719c1-1a1f-44cb-8d0e-f8f396447f54",
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
    "id": "5506059a-a0ce-47eb-be32-d8d371860d20",
    "order_id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
    "expires_at": "2026-10-28T07:36:40.849584Z",
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

`POST /api/driver/v1/offers/5506059a-a0ce-47eb-be32-d8d371860d20/accept` → **200**

```json
{
  "command_id": "6a2bc98a-1639-488d-b59f-722f09302d67"
}
```

```json
{
  "id": "48b7e627-e17a-44c9-9342-7d28e27be064",
  "order_id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ce552540-1fab-4bad-b66c-a4f9c9739f27",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ce552540-1fab-4bad-b66c-a4f9c9739f27",
  "order_id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
  "assignment_id": "48b7e627-e17a-44c9-9342-7d28e27be064",
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
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.212486Z",
  "last_location_at": "2026-10-28T07:36:25.212486Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7101c6e9-7510-4272-99b2-374f69439a2f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:25Z",
    "sequence": 1793172985962
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.979094Z",
  "last_location_at": "2026-10-28T07:36:25.979094Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ce552540-1fab-4bad-b66c-a4f9c9739f27/arrive` → **200**

```json
{
  "command_id": "dbbaba16-912d-4ed5-b297-2da0732509c8",
  "expected_version": 0
}
```

```json
{
  "id": "ce552540-1fab-4bad-b66c-a4f9c9739f27",
  "order_id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
  "assignment_id": "48b7e627-e17a-44c9-9342-7d28e27be064",
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
  "arrived_at": "2026-10-28T07:36:26.011942Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ce552540-1fab-4bad-b66c-a4f9c9739f27/start` → **200**

```json
{
  "command_id": "c0ece606-7dab-4a10-bb9b-13f9e906bf47",
  "expected_version": 1
}
```

```json
{
  "id": "ce552540-1fab-4bad-b66c-a4f9c9739f27",
  "order_id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
  "assignment_id": "48b7e627-e17a-44c9-9342-7d28e27be064",
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
  "arrived_at": "2026-10-28T07:36:26.011942Z",
  "started_at": "2026-10-28T07:36:26.044483Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ce552540-1fab-4bad-b66c-a4f9c9739f27/complete` → **200**

```json
{
  "command_id": "d304e0e7-19f8-4299-9c9b-a3e4a20072fd",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:36:26Z"
}
```

```json
{
  "id": "ce552540-1fab-4bad-b66c-a4f9c9739f27",
  "order_id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
  "assignment_id": "48b7e627-e17a-44c9-9342-7d28e27be064",
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
  "arrived_at": "2026-10-28T07:36:26.011942Z",
  "started_at": "2026-10-28T07:36:26.044483Z",
  "completed_at": "2026-10-28T07:36:26.080512Z",
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
    "id": "bfebb652-a37e-46d3-bce2-7904cfc8e54b",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:36:25.842072Z",
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
    "id": "be753f36-70c2-4264-92fe-b31cba5687ff",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:36:24.800654Z",
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

`GET /api/operator/v1/orders/be753f36-70c2-4264-92fe-b31cba5687ff/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:36:24.801095Z",
      "actor": {
        "type": "CLIENT",
        "id": "2c0719c1-1a1f-44cb-8d0e-f8f396447f54",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
        "quote_id": "6ac2c800-1de9-49ad-ad5c-87e4e9da0aee",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:36:24.803161Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
        "attempt_id": "1ce31ee6-48c1-49ca-a962-828632a0fa0b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:36:24.808194Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "23c33e7d-036e-450b-bdc8-f525d20543e9",
        "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:36:24.862065Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "23c33e7d-036e-450b-bdc8-f525d20543e9",
        "order_id": "be753f36-70c2-4264-92fe-b31cba5687ff",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "02d08057-d9f2-46b8-adc3-be5247b63e2f"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted be753f36-70c2-4264-92fe-b31cba5687ff, follow-up bfebb652-a37e-46d3-bce2-7904cfc8e54b.

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
  "session_id": "9a6a5c1a-b638-4520-98b2-f23521b94ca2",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4ODksImlhdCI6MTc5MzE3Mjk4OSwianRpIjoiMjg2ZGJjM2EtZWZmMi00ZWIwLTk4NmUtNWQ0YjgxNTRlYTg3Iiwic2lkIjoiOWE2YTVjMWEtYjYzOC00NTIwLTk4YjItZjIzNTIxYjk0Y2EyIn0.FCPN0z2FVirylvwhFi18tAoNMGkAV-5yZXLyGz6ZX2I",
  "access_expires_at": "2026-10-28T07:51:29.444110657Z",
  "refresh_token": "WcGv39LoASYSqzUR5g__1JrBNztqD1oMAGvsMXl7pOY",
  "refresh_expires_at": "2026-10-28T19:36:29.443682624Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c250c704-2060-4402-91e5-d4d7a8f7b3d5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:36:29Z"
}
```

```json
{
  "id": "1d56bc5e-2996-4a87-b8c8-b6cdc5753418",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:36:29Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1d56bc5e-2996-4a87-b8c8-b6cdc5753418/publish` → **200**

```json
{
  "command_id": "4a26d8ac-2967-40e6-85c7-9172198929fb",
  "expected_version": 0
}
```

```json
{
  "id": "1d56bc5e-2996-4a87-b8c8-b6cdc5753418",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:36:29.523193Z",
  "published_at": "2026-10-28T07:36:29.523193Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "1d56bc5e-2996-4a87-b8c8-b6cdc5753418",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T07:36:29.523193Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639664787",
  "device_ref": "sandbox-9369"
}
```

```json
{
  "challenge_id": "72f25191-e2de-4533-bd1e-a92015ff2bef",
  "expires_at": "2026-10-28T07:41:29.577108854Z",
  "resend_available_at": "2026-10-28T07:36:30.577108854Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639664787` → **200**

```json
{
  "phone": "+380639664787",
  "audience": "CLIENT",
  "code": "301414",
  "sent_at": "2026-10-28T07:36:29.57899441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72f25191-e2de-4533-bd1e-a92015ff2bef",
  "code": "301414",
  "device_ref": "sandbox-9369"
}
```

```json
{
  "session_id": "565b2e22-4ce3-44be-8b94-ed4668d02f96",
  "subject": {
    "type": "CLIENT",
    "id": "81e0264d-175b-4d41-b903-07739bffad38"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MWUwMjY0ZC0xNzViLTRkNDEtYjkwMy0wNzczOWJmZmFkMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODg5LCJpYXQiOjE3OTMxNzI5ODksImp0aSI6ImVkMzMwNTJiLWY2MmMtNDM5Mi1hZjBmLTMwYWUzOGQyM2JiZiIsInNpZCI6IjU2NWIyZTIyLTRjZTMtNDRiZS04Yjk0LWVkNDY2OGQwMmY5NiJ9.kv9kWx43E4zGKZT8O5NTYAsmARyravvJvnzvRNMMH24",
  "access_expires_at": "2026-10-28T07:51:29.626425748Z",
  "refresh_token": "Rk1rSWu41t-MxI2_vhpGUvNeVEJUERXPcYJEC8ViXSE",
  "refresh_expires_at": "2026-11-27T07:36:29.626019358Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "1d56bc5e-2996-4a87-b8c8-b6cdc5753418",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T07:36:29.523193Z",
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
  "command_id": "7bf3d461-2b73-42ae-a200-f028e5238524",
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
  "id": "d38a09d2-51ed-47c3-a08f-8488140f9151",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:41:29.677603Z",
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
  "command_id": "ac5c2313-7a22-44a3-b227-79bc2ad31ff3",
  "quote_id": "d38a09d2-51ed-47c3-a08f-8488140f9151",
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
  "correlation_id": "6c55675f-ee73-41b8-81cd-4a4869c419c2"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "b0d6869a-e99f-47bb-8862-67673bc0e2cc",
  "version_id": "1d56bc5e-2996-4a87-b8c8-b6cdc5753418",
  "language": "uk"
}
```

```json
{
  "version_id": "1d56bc5e-2996-4a87-b8c8-b6cdc5753418",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T07:36:29.739718Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6edc0465-5d89-41d7-9d46-3f050a83ed65",
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
  "id": "58e5bf79-fecd-4b9c-8099-544e7088d212",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:41:29.771566Z",
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
  "command_id": "d021c2fc-fe96-4fb5-9510-4d2b93cee494",
  "quote_id": "58e5bf79-fecd-4b9c-8099-544e7088d212",
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
  "id": "fe550f82-1a9d-44a9-aa67-24e8b18b64cd",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "81e0264d-175b-4d41-b903-07739bffad38",
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
  "created_at": "2026-10-28T07:36:29.858581Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fe550f82-1a9d-44a9-aa67-24e8b18b64cd` → **200**

```json
{
  "id": "fe550f82-1a9d-44a9-aa67-24e8b18b64cd",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "81e0264d-175b-4d41-b903-07739bffad38",
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
  "created_at": "2026-10-28T07:36:29.858581Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/fe550f82-1a9d-44a9-aa67-24e8b18b64cd/cancel` → **200**

```json
{
  "command_id": "b91a33d4-01dc-45da-93c5-bef731932a66",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fe550f82-1a9d-44a9-aa67-24e8b18b64cd",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "81e0264d-175b-4d41-b903-07739bffad38",
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
  "created_at": "2026-10-28T07:36:29.858581Z",
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

`POST /api/admin/v1/legal-documents/1d56bc5e-2996-4a87-b8c8-b6cdc5753418` → **409**

```json
{
  "command_id": "68bda904-8526-4bd3-82ca-170b8127af03",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:36:29Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/1d56bc5e-2996-4a87-b8c8-b6cdc5753418",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3da03535-df44-4692-8736-07b5da5210b9"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b963bc3d-474c-441a-ae1a-98c57355b41b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T07:36:29Z"
}
```

```json
{
  "id": "683ad683-64c1-4757-9101-99cd095f8749",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T07:36:29Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/683ad683-64c1-4757-9101-99cd095f8749/publish` → **200**

```json
{
  "command_id": "1f4d0dca-e3e0-4a95-83b8-4879e8eb8de2",
  "expected_version": 0
}
```

```json
{
  "id": "683ad683-64c1-4757-9101-99cd095f8749",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T07:36:30.021374Z",
  "published_at": "2026-10-28T07:36:30.021374Z",
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
  "device_ref": "sandbox-19647"
}
```

```json
{
  "challenge_id": "0d6546f6-f852-48e3-8f6f-5c62afff5837",
  "expires_at": "2026-10-28T07:41:30.162911866Z",
  "resend_available_at": "2026-10-28T07:36:31.162911866Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "561900",
  "sent_at": "2026-10-28T07:36:30.16468942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d6546f6-f852-48e3-8f6f-5c62afff5837",
  "code": "561900",
  "device_ref": "sandbox-19647"
}
```

```json
{
  "session_id": "a8fd71bd-89f0-4b2a-afc2-23392ed04c07",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg5MCwiaWF0IjoxNzkzMTcyOTkwLCJqdGkiOiJiYzBmOTEzYS1mODVkLTQyYzQtYTNkMS0wNzEzMGJhOTI3YzEiLCJzaWQiOiJhOGZkNzFiZC04OWYwLTRiMmEtYWZjMi0yMzM5MmVkMDRjMDcifQ.1bOUUXuJQRR7f0pqYSyyXO3eieNuxFOnJt1ImqNLYKQ",
  "access_expires_at": "2026-10-28T07:51:30.21256147Z",
  "refresh_token": "HQNRyVwxJU0Nl0hyeT_DBN2YVnto-mPx3IE_85yMaxY",
  "refresh_expires_at": "2026-11-27T07:36:30.212121029Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.979094Z",
  "last_location_at": "2026-10-28T07:36:25.979094Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7101c6e9-7510-4272-99b2-374f69439a2f/handover` → **200**

```json
{
  "command_id": "73b38b98-a9ab-4d21-994e-b75904ec1f15",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.979094Z",
  "last_location_at": "2026-10-28T07:36:25.979094Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7101c6e9-7510-4272-99b2-374f69439a2f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:30Z",
    "sequence": 1793172990423
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:36:30.439086Z",
  "last_location_at": "2026-10-28T07:36:30.439086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675712075",
  "device_ref": "sandbox-10949"
}
```

```json
{
  "challenge_id": "45bb2568-2a11-45aa-8686-aad137332695",
  "expires_at": "2026-10-28T07:41:30.462409827Z",
  "resend_available_at": "2026-10-28T07:36:31.462409827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675712075` → **200**

```json
{
  "phone": "+380675712075",
  "audience": "CLIENT",
  "code": "019516",
  "sent_at": "2026-10-28T07:36:30.46412351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45bb2568-2a11-45aa-8686-aad137332695",
  "code": "019516",
  "device_ref": "sandbox-10949"
}
```

```json
{
  "session_id": "c25659a7-37b9-488c-b32a-0b954f07fa90",
  "subject": {
    "type": "CLIENT",
    "id": "8194eba3-71de-4e9e-a4e0-291bad83455c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTk0ZWJhMy03MWRlLTRlOWUtYTRlMC0yOTFiYWQ4MzQ1NWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODkwLCJpYXQiOjE3OTMxNzI5OTAsImp0aSI6ImNiNWVjYjQ5LWJkODMtNDRmMy1iMjQzLTdlMzRhMzUwNmY0NCIsInNpZCI6ImMyNTY1OWE3LTM3YjktNDg4Yy1iMzJhLTBiOTU0ZjA3ZmE5MCJ9.hF9qiNxtvk3Tv51k7Gvp8gm--nkf1sVZxN6Qnk4f0pw",
  "access_expires_at": "2026-10-28T07:51:30.511646957Z",
  "refresh_token": "hysorEs3O4E3BXt4Yxfuu3XZL0VnFPniFkP4vrARVM4",
  "refresh_expires_at": "2026-11-27T07:36:30.511224192Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5a04cb84-da95-4141-bdb0-83aae35293d0",
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
  "id": "259420ae-3314-4129-9cbe-b9f2ff124cad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:41:30.541116Z",
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
  "command_id": "5b36dac8-175e-4029-ae29-57514acf45f2",
  "quote_id": "259420ae-3314-4129-9cbe-b9f2ff124cad",
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
    "phone": "+380679760876"
  }
}
```

```json
{
  "id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.574352Z",
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
    "id": "1f4d95d5-17a3-4021-a8e2-254981d817e4",
    "order_id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
    "expires_at": "2026-10-28T07:36:45.57699Z",
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

`POST /api/driver/v1/offers/1f4d95d5-17a3-4021-a8e2-254981d817e4/accept` → **200**

```json
{
  "command_id": "12617f71-71de-4776-bf2c-5f8cd1bc57ff"
}
```

```json
{
  "id": "6530e12e-c986-4577-b982-b8547feca7ab",
  "order_id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e9932b7-b382-4395-850c-43a9db3fa642",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e9932b7-b382-4395-850c-43a9db3fa642",
  "order_id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
  "assignment_id": "6530e12e-c986-4577-b982-b8547feca7ab",
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
    "phone": "+380679760876"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6945d5be-db79-4a2e-aacd-930e8a8866ad",
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
  "id": "0a750ca5-0c70-4c68-b613-5716e4875945",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:41:30.689630Z",
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
  "command_id": "176a4ed5-6cd5-4c17-bd55-8d7c08a1cb57",
  "quote_id": "0a750ca5-0c70-4c68-b613-5716e4875945",
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
  "id": "35316825-66a9-4fd4-bb40-5805925f8f5b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.721557Z",
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
  "command_id": "87a0456e-2073-404b-865f-baf032911f80",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T10:36:30Z"
}
```

```json
{
  "id": "3bf8a01f-78fe-4e5e-b7b3-bc58dd708a66",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:41:30.928118Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:36:30Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "580a27b0-dc46-45b1-ab51-bfdeeec9222d",
  "quote_id": "3bf8a01f-78fe-4e5e-b7b3-bc58dd708a66",
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
  "pickup_at": "2026-10-28T10:36:30Z"
}
```

```json
{
  "id": "f7eff803-8fe6-4de3-bca6-1534b74d157e",
  "short_number": 12,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.961217Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:36:30Z",
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
  "command_id": "8489937e-86b9-40db-b563-a731858ee755",
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
  "id": "3d12acc6-681b-4a60-ae53-76b93b34f95c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:41:31.165820Z",
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
  "command_id": "4c24b97a-395a-4ff8-9900-092b7c4a7090",
  "quote_id": "3d12acc6-681b-4a60-ae53-76b93b34f95c",
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
  "correlation_id": "b1fd4416-c4f4-41f7-9aee-13c439f820ae"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f7eff803-8fe6-4de3-bca6-1534b74d157e",
      "short_number": 12,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
      "created_at": "2026-10-28T07:36:30.961217Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T10:36:30Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "35316825-66a9-4fd4-bb40-5805925f8f5b",
      "short_number": 11,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
      "created_at": "2026-10-28T07:36:30.721557Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
      "short_number": 10,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "35316825-66a9-4fd4-bb40-5805925f8f5b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.721557Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/4841994d-b2ec-41fa-92f0-83bc38625ab4` → **200**

```json
{
  "id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
    "id": "6530e12e-c986-4577-b982-b8547feca7ab",
    "order_id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0e9932b7-b382-4395-850c-43a9db3fa642",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T07:36:30.574352Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4841994d-b2ec-41fa-92f0-83bc38625ab4/cancel` → **200**

```json
{
  "command_id": "1c1fae0d-ce12-4af4-b38d-1a0464eca72e",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
    "id": "6530e12e-c986-4577-b982-b8547feca7ab",
    "order_id": "4841994d-b2ec-41fa-92f0-83bc38625ab4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0e9932b7-b382-4395-850c-43a9db3fa642",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:36:30.574352Z",
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

`GET /api/rider/v1/orders/35316825-66a9-4fd4-bb40-5805925f8f5b` → **200**

```json
{
  "id": "35316825-66a9-4fd4-bb40-5805925f8f5b",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.721557Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/35316825-66a9-4fd4-bb40-5805925f8f5b/cancel` → **200**

```json
{
  "command_id": "a5cd2f09-c065-48eb-91fb-e3846b62146c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "35316825-66a9-4fd4-bb40-5805925f8f5b",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.721557Z",
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

`GET /api/rider/v1/orders/f7eff803-8fe6-4de3-bca6-1534b74d157e` → **200**

```json
{
  "id": "f7eff803-8fe6-4de3-bca6-1534b74d157e",
  "short_number": 12,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.961217Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:36:30Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f7eff803-8fe6-4de3-bca6-1534b74d157e/cancel` → **200**

```json
{
  "command_id": "d4a9b8aa-850f-4c8a-9c5e-0dd9b9ce6182",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f7eff803-8fe6-4de3-bca6-1534b74d157e",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8194eba3-71de-4e9e-a4e0-291bad83455c",
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
  "created_at": "2026-10-28T07:36:30.961217Z",
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
  "pickup_at": "2026-10-28T10:36:30Z",
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
  "session_id": "7101c6e9-7510-4272-99b2-374f69439a2f",
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
  "last_heartbeat_at": "2026-10-28T07:36:30.439086Z",
  "last_location_at": "2026-10-28T07:36:30.439086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7101c6e9-7510-4272-99b2-374f69439a2f/close` → **200**

```json
{
  "command_id": "c8eeb69d-9840-45bf-8f42-e5721249c279",
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

Done: orders 4841994d-b2ec-41fa-92f0-83bc38625ab4, 35316825-66a9-4fd4-bb40-5805925f8f5b, f7eff803-8fe6-4de3-bca6-1534b74d157e.

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
  "session_id": "f05aa10b-d691-40fb-96be-c65faef2a28d",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTEsImlhdCI6MTc5MzE3Mjk5MSwianRpIjoiNjI4YTczNzUtNzU2YS00ZmQxLWE0NjItMDg0Y2VhNGJlOTE0Iiwic2lkIjoiZjA1YWExMGItZDY5MS00MGZiLTk2YmUtYzY1ZmFlZjJhMjhkIn0.BSK67iZYqPT41HHXYPxh-L7rUKAagnpTjqeAtwlXlKM",
  "access_expires_at": "2026-10-28T07:51:31.912590527Z",
  "refresh_token": "6nFwLMTTNNT3AT0JWZPLXR0Y4XMKQeA91QqhqPj6R48",
  "refresh_expires_at": "2026-10-28T19:36:31.912183105Z",
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
  "session_id": "606e1bf5-c37e-406b-a293-d7f85cee3a4c",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTIsImlhdCI6MTc5MzE3Mjk5MiwianRpIjoiY2QyOTQ2MzYtMDMwMi00MDdkLWIzYTktMjYzMTJjODJlODhiIiwic2lkIjoiNjA2ZTFiZjUtYzM3ZS00MDZiLWEyOTMtZDdmODVjZWUzYTRjIn0.110zsgD2nj891eVFz9cBDmNCMbPW4BKc72T8pM2X3F8",
  "access_expires_at": "2026-10-28T07:51:32.199772345Z",
  "refresh_token": "WcLjDSR4EqJbTXDwArQm78hcfKcaB90tcEwwkX53BWY",
  "refresh_expires_at": "2026-10-28T19:36:32.199281709Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8557"
}
```

```json
{
  "challenge_id": "f90aab75-cc0d-48e5-889e-cf5a2ef36713",
  "expires_at": "2026-10-28T07:41:32.221931552Z",
  "resend_available_at": "2026-10-28T07:36:33.221931552Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "423238",
  "sent_at": "2026-10-28T07:36:32.313437997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f90aab75-cc0d-48e5-889e-cf5a2ef36713",
  "code": "423238",
  "device_ref": "sandbox-8557"
}
```

```json
{
  "session_id": "6c4828b0-19c0-4e18-b89f-b5a56120c5cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg5MiwiaWF0IjoxNzkzMTcyOTkyLCJqdGkiOiI5Y2E1ODMwNC1iOWExLTQ1MjEtYTJkNS05MGQ3NmFmYjE0OTkiLCJzaWQiOiI2YzQ4MjhiMC0xOWMwLTRlMTgtYjg5Zi1iNWE1NjEyMGM1Y2MifQ.dzjY1opPmtqQsPKEHKGU26ZNarWXfAPfZuMRfuL8XEc",
  "access_expires_at": "2026-10-28T07:51:32.376411789Z",
  "refresh_token": "zEAy6tqzuXMsikJYhE_xWrjxVgD3477xRfbK7t30xNs",
  "refresh_expires_at": "2026-11-27T07:36:32.375761242Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.031052Z",
  "last_location_at": "2026-10-28T07:36:25.031052Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/handover` → **200**

```json
{
  "command_id": "13f48946-aa15-43ae-bd51-dbd2ff8647dc",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:25.031052Z",
  "last_location_at": "2026-10-28T07:36:25.031052Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:32Z",
    "sequence": 1793172992593
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:32.608815Z",
  "last_location_at": "2026-10-28T07:36:32.608815Z",
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
  "command_id": "77baaf44-0fc4-43a2-ad87-743cd8c6a47c",
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
  "effective_at": "2026-10-28T07:36:32.669406Z",
  "changed_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T07:36:32.696104047Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7234a172-0e90-4091-98f7-e5e19a1857eb",
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
  "id": "e5ce4c42-5c70-4f5e-8f25-50e88d49cb97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:41:32.727965Z",
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
  "command_id": "4ab3fac4-a500-4385-8810-a1c2ad9e3cf1",
  "quote_id": "e5ce4c42-5c70-4f5e-8f25-50e88d49cb97",
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
    "phone": "+380671118001"
  }
}
```

```json
{
  "id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:36:32.762006Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118001"
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
    "id": "c42e4fc0-3797-4236-a48e-f0a869dba1e4",
    "order_id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
    "expires_at": "2026-10-28T07:36:47.765237Z",
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

`POST /api/driver/v1/offers/c42e4fc0-3797-4236-a48e-f0a869dba1e4/accept` → **200**

```json
{
  "command_id": "8d556d43-e510-4ef5-a435-509d18aea6ec"
}
```

```json
{
  "id": "a5d847dc-6b85-4afc-9281-cf4511307761",
  "order_id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "928150b7-404b-450d-8720-b789acf35ba9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "928150b7-404b-450d-8720-b789acf35ba9",
  "order_id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
  "assignment_id": "a5d847dc-6b85-4afc-9281-cf4511307761",
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
    "phone": "+380671118001"
  }
}
```

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:32Z",
    "sequence": 1793172992856
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:32.872527Z",
  "last_location_at": "2026-10-28T07:36:32.872527Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/928150b7-404b-450d-8720-b789acf35ba9/arrive` → **200**

```json
{
  "command_id": "59972579-de20-4867-85cd-ad49f270c62e",
  "expected_version": 0
}
```

```json
{
  "id": "928150b7-404b-450d-8720-b789acf35ba9",
  "order_id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
  "assignment_id": "a5d847dc-6b85-4afc-9281-cf4511307761",
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
  "arrived_at": "2026-10-28T07:36:33.078581Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118001"
  }
}
```

`POST /api/driver/v1/trips/928150b7-404b-450d-8720-b789acf35ba9/start` → **200**

```json
{
  "command_id": "ae0e9151-60be-450f-a40d-eb8413247efa",
  "expected_version": 1
}
```

```json
{
  "id": "928150b7-404b-450d-8720-b789acf35ba9",
  "order_id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
  "assignment_id": "a5d847dc-6b85-4afc-9281-cf4511307761",
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
  "arrived_at": "2026-10-28T07:36:33.078581Z",
  "started_at": "2026-10-28T07:36:33.111243Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118001"
  }
}
```

`POST /api/driver/v1/trips/928150b7-404b-450d-8720-b789acf35ba9/complete` → **200**

```json
{
  "command_id": "cae1a8f3-9c86-42b5-960f-d410c2beb42a",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:36:33Z",
  "cash_received": true
}
```

```json
{
  "id": "928150b7-404b-450d-8720-b789acf35ba9",
  "order_id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
  "assignment_id": "a5d847dc-6b85-4afc-9281-cf4511307761",
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
  "arrived_at": "2026-10-28T07:36:33.078581Z",
  "started_at": "2026-10-28T07:36:33.111243Z",
  "completed_at": "2026-10-28T07:36:33.298151Z",
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
  "command_id": "cb07831d-0621-4e19-88f2-3c6af8071629",
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
  "id": "9635e2c9-b10d-45ff-9fea-baf02178e66a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:41:33.333506Z",
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
  "command_id": "a58e0d11-0293-48c0-a7bc-c28fe101a8d4",
  "quote_id": "9635e2c9-b10d-45ff-9fea-baf02178e66a",
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
    "phone": "+380671117037"
  }
}
```

```json
{
  "id": "d5cccf0a-ab48-4144-9bb7-c480d5a77a15",
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
  "created_at": "2026-10-28T07:36:33.534331Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117037"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d5cccf0a-ab48-4144-9bb7-c480d5a77a15` → **200**

```json
{
  "id": "d5cccf0a-ab48-4144-9bb7-c480d5a77a15",
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
  "created_at": "2026-10-28T07:36:33.534331Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117037"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d5cccf0a-ab48-4144-9bb7-c480d5a77a15/cancel` → **200**

```json
{
  "command_id": "00847a50-1771-421e-9c33-557a09e1768d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d5cccf0a-ab48-4144-9bb7-c480d5a77a15",
  "short_number": 14,
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
  "created_at": "2026-10-28T07:36:33.534331Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117037"
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
  "staff_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T07:36:33.302073Z",
  "last_entries": [
    {
      "order_id": "d5cccf0a-ab48-4144-9bb7-c480d5a77a15",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T07:36:33.598255Z"
    },
    {
      "order_id": "5f9583b4-6581-4483-9bbf-ee321c268bfc",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T07:36:33.302073Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0c5bf6-b8d0-4c03-9750-620fda0c837c",
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
  "last_heartbeat_at": "2026-10-28T07:36:32.872527Z",
  "last_location_at": "2026-10-28T07:36:32.872527Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa0c5bf6-b8d0-4c03-9750-620fda0c837c/close` → **200**

```json
{
  "command_id": "aec105bc-7966-444f-87e0-e0e57aa780a1",
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

Done: operator bonus for fulfilled 5f9583b4-6581-4483-9bbf-ee321c268bfc and operator-fault cancellation d5cccf0a-ab48-4144-9bb7-c480d5a77a15.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674281247",
  "device_ref": "sandbox-25310"
}
```

```json
{
  "challenge_id": "f7cbbb73-7e94-48ba-b649-ab39e5c215e6",
  "expires_at": "2026-10-28T07:41:35.73211847Z",
  "resend_available_at": "2026-10-28T07:36:36.73211847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674281247` → **200**

```json
{
  "phone": "+380674281247",
  "audience": "CLIENT",
  "code": "728528",
  "sent_at": "2026-10-28T07:36:35.733844712Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678209660",
  "device_ref": "sandbox-30097",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6caf0e2a-eaa0-4551-a082-e8cf6009863c",
  "expires_at": "2026-10-28T07:41:35.77974084Z",
  "resend_available_at": "2026-10-28T07:36:36.77974084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678209660` → **200**

```json
{
  "phone": "+380678209660",
  "audience": "CLIENT",
  "code": "879836",
  "sent_at": "2026-10-28T07:36:35.781437022Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677920000",
  "device_ref": "sandbox-14567"
}
```

```json
{
  "challenge_id": "7163b596-6e9a-4054-b7ba-c7f939a1064a",
  "expires_at": "2026-10-28T07:41:35.825521324Z",
  "resend_available_at": "2026-10-28T07:36:36.825521324Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677920000` → **200**

```json
{
  "phone": "+380677920000",
  "audience": "CLIENT",
  "code": "271419",
  "sent_at": "2026-10-28T07:36:35.827634958Z",
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
  "session_id": "34517615-08f2-4bcc-ad98-04b2002312ef",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTYsImlhdCI6MTc5MzE3Mjk5NiwianRpIjoiMWE5YTdlZjQtNTQ2MS00MTAyLWIyYjMtNmNmODIwYzUyYTgzIiwic2lkIjoiMzQ1MTc2MTUtMDhmMi00YmNjLWFkOTgtMDRiMjAwMjMxMmVmIn0.wJ4L_eTJ4pi8L-lnxpP0TKVnqUXPMGyP2_AMKV_nC70",
  "access_expires_at": "2026-10-28T07:51:36.129432019Z",
  "refresh_token": "BCoYKClalJCnVu-5W0rtmTDzcPbEVNSJS86jlJvui_g",
  "refresh_expires_at": "2026-10-28T19:36:36.128998858Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677920000` → **200**

```json
{
  "deliveries": [
    {
      "id": "c3e2ad50-7e09-42fe-bfd6-898d2dd4ac10",
      "challenge_id": "7163b596-6e9a-4054-b7ba-c7f939a1064a",
      "phone": "+380677920000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-580d4047-f5ab-49f4-9f92-a572d4606a9e",
      "error": null,
      "attempted_at": "2026-10-28T07:36:35.827796Z"
    },
    {
      "id": "39e05233-e0d5-42ea-870b-9e83bf2803b3",
      "challenge_id": "7163b596-6e9a-4054-b7ba-c7f939a1064a",
      "phone": "+380677920000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T07:36:35.827236Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677920000` → **200**

```json
{
  "phone": "+380677920000",
  "audience": "CLIENT",
  "code": "271419",
  "sent_at": "2026-10-28T07:36:35.827634958Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678209660` → **200**

```json
{
  "deliveries": [
    {
      "id": "f04996fe-d6f5-4945-8b86-01358f0b2196",
      "challenge_id": "6caf0e2a-eaa0-4551-a082-e8cf6009863c",
      "phone": "+380678209660",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4df853e7-e94a-447d-901a-c0984fea824a",
      "error": null,
      "attempted_at": "2026-10-28T07:36:35.781595Z"
    }
  ]
}
```

Done: SMS to +380674281247, a call to +380678209660, SMS then a call to +380677920000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639093661",
  "device_ref": "sandbox-6206"
}
```

```json
{
  "challenge_id": "942b0869-3ae8-48d0-bd2a-594f0cddba65",
  "expires_at": "2026-10-28T07:41:36.240294212Z",
  "resend_available_at": "2026-10-28T07:36:37.240294212Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639093661` → **200**

```json
{
  "phone": "+380639093661",
  "audience": "CLIENT",
  "code": "943436",
  "sent_at": "2026-10-28T07:36:36.241981275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "942b0869-3ae8-48d0-bd2a-594f0cddba65",
  "code": "943436",
  "device_ref": "sandbox-6206"
}
```

```json
{
  "session_id": "53c21410-c138-45f9-8f35-bb46eadf6208",
  "subject": {
    "type": "CLIENT",
    "id": "726c9331-61db-4524-9b5b-ea79976d273b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjZjOTMzMS02MWRiLTQ1MjQtOWI1Yi1lYTc5OTc2ZDI3M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODk2LCJpYXQiOjE3OTMxNzI5OTYsImp0aSI6IjlhYWIxYjExLTBiODYtNDZkNC1hZjgzLWIyNjhjYjVkZTAwMCIsInNpZCI6IjUzYzIxNDEwLWMxMzgtNDVmOS04ZjM1LWJiNDZlYWRmNjIwOCJ9.rWjQv0mRhli-SpZsdMZCE0jG9DKtILNEDVi-HxjT6UU",
  "access_expires_at": "2026-10-28T07:51:36.463416608Z",
  "refresh_token": "cYYICmRmenvBJp4L5Lufn90vEG0OHYFKVFpRRx2zp34",
  "refresh_expires_at": "2026-11-27T07:36:36.462785431Z",
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
  "session_id": "6322cc40-c786-44bf-899a-5173f529d611",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTYsImlhdCI6MTc5MzE3Mjk5NiwianRpIjoiNTc3MTdkNzQtMTFiZi00OWJmLTk3NDktMGQ4NmFhYzE3ODhiIiwic2lkIjoiNjMyMmNjNDAtYzc4Ni00NGJmLTg5OWEtNTE3M2Y1MjlkNjExIn0.UgYm9cYoIBNoy_SdjGp54ZS-3lf9tpAceER8Aks4nBw",
  "access_expires_at": "2026-10-28T07:51:36.817973182Z",
  "refresh_token": "7_opslBzqjmmGIK3d_WTrzSDcM96UqEdUei29JOU-hY",
  "refresh_expires_at": "2026-10-28T19:36:36.817575405Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639093661` → **200**

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
  "correlation_id": "a0846104-f455-4f00-9fdd-7dd59217e6ae"
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
  "session_id": "c5c3fbad-9467-4978-bfac-c6b6789bd610",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTcsImlhdCI6MTc5MzE3Mjk5NywianRpIjoiMTU1NmZiNDgtZjYyZi00ZjZjLTljYTYtZTA4MmYyZjcwNzRkIiwic2lkIjoiYzVjM2ZiYWQtOTQ2Ny00OTc4LWJmYWMtYzZiNjc4OWJkNjEwIn0.OMrz2nzSBsStP3RIdub2veBJczm89bNDBDoEYKQRMIM",
  "access_expires_at": "2026-10-28T07:51:37.158923906Z",
  "refresh_token": "TtXE3qxRHVCpObFC5ivZEh6zfri99xixcQdVFlggemY",
  "refresh_expires_at": "2026-10-28T19:36:37.158519008Z",
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
  "command_id": "52c218f8-538e-4500-838d-af4d2f334594",
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
  "changed_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T07:36:37.22114504Z"
}
```

## The rider books the airport for 2026-10-28T10:36:36Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600445584",
  "device_ref": "sandbox-3113"
}
```

```json
{
  "challenge_id": "491325cc-516d-481a-ad1a-b4d3c2c9d5df",
  "expires_at": "2026-10-28T07:41:37.248379302Z",
  "resend_available_at": "2026-10-28T07:36:38.248379302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600445584` → **200**

```json
{
  "phone": "+48600445584",
  "audience": "CLIENT",
  "code": "258574",
  "sent_at": "2026-10-28T07:36:37.250305004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "491325cc-516d-481a-ad1a-b4d3c2c9d5df",
  "code": "258574",
  "device_ref": "sandbox-3113"
}
```

```json
{
  "session_id": "c8ed1443-a3cc-4076-9516-5fd14fe6342d",
  "subject": {
    "type": "CLIENT",
    "id": "95f2fb58-f468-4e3a-b2fe-06cac2517c81"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NWYyZmI1OC1mNDY4LTRlM2EtYjJmZS0wNmNhYzI1MTdjODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODk3LCJpYXQiOjE3OTMxNzI5OTcsImp0aSI6IjZjYmJkOWZkLWZiOTAtNDVhYS1hMzk3LTY5NGExYjI5MGYxZCIsInNpZCI6ImM4ZWQxNDQzLWEzY2MtNDA3Ni05NTE2LTVmZDE0ZmU2MzQyZCJ9.4s2fJzMmI4LWKcegLzw2AM82kRsDtqVxVBhOR_9CU0E",
  "access_expires_at": "2026-10-28T07:51:37.299089843Z",
  "refresh_token": "qIokv1e71PEAIzEP7SGli0Yq7CcLQg6cY3Uej0bseO4",
  "refresh_expires_at": "2026-11-27T07:36:37.2985883Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4e7a16dc-1883-4c4e-b308-14d40ebc6e9f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T10:36:36Z"
}
```

```json
{
  "id": "5754b020-811b-4cb2-9470-c4bda55384d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T07:41:37.440351Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:36:36Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "31f78832-7156-4736-8593-02246cca6a2c",
  "quote_id": "5754b020-811b-4cb2-9470-c4bda55384d8",
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
  "pickup_at": "2026-10-28T10:36:36Z"
}
```

```json
{
  "id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "95f2fb58-f468-4e3a-b2fe-06cac2517c81",
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
  "created_at": "2026-10-28T07:36:37.47477Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:36:36Z",
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
  "device_ref": "sandbox-13088"
}
```

```json
{
  "challenge_id": "2937859f-6297-43f4-873a-66eaa304a02b",
  "expires_at": "2026-10-28T07:41:37.506951976Z",
  "resend_available_at": "2026-10-28T07:36:38.506951976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "752191",
  "sent_at": "2026-10-28T07:36:37.508803116Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2937859f-6297-43f4-873a-66eaa304a02b",
  "code": "752191",
  "device_ref": "sandbox-13088"
}
```

```json
{
  "session_id": "716bbdda-587c-4c42-84d6-ea616253536e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg5NywiaWF0IjoxNzkzMTcyOTk3LCJqdGkiOiI0ZTY1ZTBmMi1mYmM4LTQzMTAtOTA3ZC1jMzdjMTIxOWZmNzkiLCJzaWQiOiI3MTZiYmRkYS01ODdjLTRjNDItODRkNi1lYTYxNjI1MzUzNmUifQ.jZtEuezveP2dnHxPCOqBTyGTFtP70faHPR5D8dGop7I",
  "access_expires_at": "2026-10-28T07:51:37.55861975Z",
  "refresh_token": "ekw-hKF4cy-FYtVw6DvTm6eidpodpTID6jn-zH1qjg8",
  "refresh_expires_at": "2026-11-27T07:36:37.55818367Z",
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
  "command_id": "b012381f-dec0-4656-a6d9-5ecdcd15d6ec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:37Z",
    "sequence": 1793172997600
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f8e9bf41-cc2f-4739-92e8-0511bdf2922d",
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
  "last_heartbeat_at": "2026-10-28T07:36:37.616089Z",
  "last_location_at": "2026-10-28T07:36:37.616089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
      "short_number": 15,
      "pickup_at": "2026-10-28T10:36:36Z",
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

`POST /api/driver/v1/preorders/6b9caf0c-2204-442a-8242-ea3e9f093ee4/reserve` → **200**

```json
{
  "command_id": "abaa329a-1a87-4bdc-92a3-29676040da36"
}
```

```json
{
  "id": "2238127e-8630-4f33-aeda-ccb9999a39f6",
  "state": "RESERVED",
  "order": {
    "order_id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
    "short_number": 15,
    "pickup_at": "2026-10-28T10:36:36Z",
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
  "reserved_at": "2026-10-28T07:36:37.67005Z",
  "confirm_from": "2026-10-28T10:06:36Z",
  "confirm_until": "2026-10-28T10:16:36Z",
  "drop_until": "2026-10-28T09:36:36Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2238127e-8630-4f33-aeda-ccb9999a39f6",
      "state": "RESERVED",
      "order": {
        "order_id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
        "short_number": 15,
        "pickup_at": "2026-10-28T10:36:36Z",
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
      "reserved_at": "2026-10-28T07:36:37.67005Z",
      "confirm_from": "2026-10-28T10:06:36Z",
      "confirm_until": "2026-10-28T10:16:36Z",
      "drop_until": "2026-10-28T09:36:36Z"
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
      "id": "2238127e-8630-4f33-aeda-ccb9999a39f6",
      "state": "RESERVED",
      "order": {
        "order_id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
        "short_number": 15,
        "pickup_at": "2026-10-28T10:36:36Z",
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
      "reserved_at": "2026-10-28T07:36:37.67005Z",
      "confirm_from": "2026-10-28T10:06:36Z",
      "confirm_until": "2026-10-28T10:16:36Z",
      "drop_until": "2026-10-28T09:36:36Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2238127e-8630-4f33-aeda-ccb9999a39f6/confirm` → **409**

```json
{
  "command_id": "d3adbc8f-42bd-4883-b42c-a61c9db7ed30"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2238127e-8630-4f33-aeda-ccb9999a39f6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b80773da-27eb-4116-b1e3-53d7866ba97d"
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
  "session_id": "5ae7d5ce-2484-42af-a8f9-61acc5bca88a",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTgsImlhdCI6MTc5MzE3Mjk5OCwianRpIjoiZjdhZjcxODEtMWZmYi00NWE3LWJkZmMtNDU0OGU2NjdjZDc1Iiwic2lkIjoiNWFlN2Q1Y2UtMjQ4NC00MmFmLWE4ZjktNjFhY2M1YmNhODhhIn0.K6A-nDWXE6GaYjYx7CaZBjnNDaiHAh8c_9aTY4kSwEc",
  "access_expires_at": "2026-10-28T07:51:38.024032427Z",
  "refresh_token": "BXLDu9r1wn7goey8FsCN43r5TSs5FFoi1hfDjGUuW5I",
  "refresh_expires_at": "2026-10-28T19:36:38.023596192Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6b9caf0c-2204-442a-8242-ea3e9f093ee4` → **200**

```json
{
  "id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "95f2fb58-f468-4e3a-b2fe-06cac2517c81",
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
  "created_at": "2026-10-28T07:36:37.47477Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T10:36:36Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2238127e-8630-4f33-aeda-ccb9999a39f6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T07:36:37.67005Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6b9caf0c-2204-442a-8242-ea3e9f093ee4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T07:36:37.476093Z",
      "actor": {
        "type": "CLIENT",
        "id": "95f2fb58-f468-4e3a-b2fe-06cac2517c81",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
        "preorder": true,
        "quote_id": "5754b020-811b-4cb2-9470-c4bda55384d8",
        "pickup_at": "2026-10-28T10:36:36Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T07:36:37.670844Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6b9caf0c-2204-442a-8242-ea3e9f093ee4",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2238127e-8630-4f33-aeda-ccb9999a39f6"
      }
    }
  ]
}
```

Done: pre-order 6b9caf0c-2204-442a-8242-ea3e9f093ee4, reservation 2238127e-8630-4f33-aeda-ccb9999a39f6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24572"
}
```

```json
{
  "challenge_id": "4f616e40-f38b-4cad-ad79-2453deb8b67a",
  "expires_at": "2026-10-28T07:41:38.102154677Z",
  "resend_available_at": "2026-10-28T07:36:39.102154677Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "981171",
  "sent_at": "2026-10-28T07:36:38.104023648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f616e40-f38b-4cad-ad79-2453deb8b67a",
  "code": "981171",
  "device_ref": "sandbox-24572"
}
```

```json
{
  "session_id": "1c3233f7-ecd0-4119-8046-0b7f3062a86a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3Mzg5OCwiaWF0IjoxNzkzMTcyOTk4LCJqdGkiOiIxZWVkMTVjNy1iYjk5LTRjNTgtYWE5Yy0xOWE1MDZiMGQ1ZWYiLCJzaWQiOiIxYzMyMzNmNy1lY2QwLTQxMTktODA0Ni0wYjdmMzA2MmE4NmEifQ.nuUGQjt5gm745Q-gF6XK5-FHTyrF61NkSKjmvs3Zrgc",
  "access_expires_at": "2026-10-28T07:51:38.150973828Z",
  "refresh_token": "k9_KXyQ_hM9ulgxtO4S2GTZiwCAUTCHpHiTjIGfMXu0",
  "refresh_expires_at": "2026-11-27T07:36:38.150562411Z",
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
  "command_id": "067bebb5-d31b-4d09-b6b3-55b5b09f46e5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:38Z",
    "sequence": 1793172998193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "150d1024-bd65-4868-b58f-80f031357366",
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
  "last_heartbeat_at": "2026-10-28T07:36:38.208069Z",
  "last_location_at": "2026-10-28T07:36:38.208069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677421416",
  "device_ref": "sandbox-18271"
}
```

```json
{
  "challenge_id": "4fecda72-d42d-4e81-b692-9b4f21a20235",
  "expires_at": "2026-10-28T07:41:38.231889738Z",
  "resend_available_at": "2026-10-28T07:36:39.231889738Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677421416` → **200**

```json
{
  "phone": "+380677421416",
  "audience": "CLIENT",
  "code": "174627",
  "sent_at": "2026-10-28T07:36:38.233461458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fecda72-d42d-4e81-b692-9b4f21a20235",
  "code": "174627",
  "device_ref": "sandbox-18271"
}
```

```json
{
  "session_id": "f822c004-cc6b-4fc9-ad25-ebe5eff2d64d",
  "subject": {
    "type": "CLIENT",
    "id": "d3564dc4-1261-4472-a523-b7d898517cb9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzU2NGRjNC0xMjYxLTQ0NzItYTUyMy1iN2Q4OTg1MTdjYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczODk4LCJpYXQiOjE3OTMxNzI5OTgsImp0aSI6IjYxOGU0MGVjLWY5NWEtNGMzYi05ODYyLWI4NzBlOGIwMjQxZSIsInNpZCI6ImY4MjJjMDA0LWNjNmItNGZjOS1hZDI1LWViZTVlZmYyZDY0ZCJ9.ZITInQfD_bpQrh4QjwWa_LZieJgT8RPDnA91Bk5Gxak",
  "access_expires_at": "2026-10-28T07:51:38.279670114Z",
  "refresh_token": "oAsWYuxj9N2RQyhVzel1_opE7DvwR7VAv1qqp0EFWG0",
  "refresh_expires_at": "2026-11-27T07:36:38.279217425Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "913ca8f5-c978-4b36-bf96-bfe49dabe3e5",
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
  "id": "1cf0750b-4ea6-4ece-91f7-33c3422a6ccd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:41:38.310889Z",
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
  "command_id": "15457b60-4a57-4694-9cda-518616d5a1d2",
  "quote_id": "1cf0750b-4ea6-4ece-91f7-33c3422a6ccd",
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
  "id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d3564dc4-1261-4472-a523-b7d898517cb9",
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
  "created_at": "2026-10-28T07:36:38.34178Z",
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
    "id": "bafa5525-1b1d-420c-8569-5ee194eed079",
    "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
    "expires_at": "2026-10-28T07:36:53.344083Z",
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

`POST /api/driver/v1/offers/bafa5525-1b1d-420c-8569-5ee194eed079/accept` → **200**

```json
{
  "command_id": "688bccd6-d959-4361-a01d-8d5c12205d3e"
}
```

```json
{
  "id": "9b37718f-33bc-429f-866c-ef36b2021d14",
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "36e89147-7ce1-484e-8679-0b879558e29c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "36e89147-7ce1-484e-8679-0b879558e29c",
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "assignment_id": "9b37718f-33bc-429f-866c-ef36b2021d14",
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

`POST /api/driver/v1/work-sessions/150d1024-bd65-4868-b58f-80f031357366/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:38Z",
    "sequence": 1793172998431
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "150d1024-bd65-4868-b58f-80f031357366",
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
  "last_heartbeat_at": "2026-10-28T07:36:38.446952Z",
  "last_location_at": "2026-10-28T07:36:38.446952Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "36e89147-7ce1-484e-8679-0b879558e29c",
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "assignment_id": "9b37718f-33bc-429f-866c-ef36b2021d14",
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

`POST /api/driver/v1/trips/36e89147-7ce1-484e-8679-0b879558e29c/arrive` → **200**

```json
{
  "command_id": "4bacb6f9-d13c-4d41-843d-0dc5f0d2882a",
  "expected_version": 0
}
```

```json
{
  "id": "36e89147-7ce1-484e-8679-0b879558e29c",
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "assignment_id": "9b37718f-33bc-429f-866c-ef36b2021d14",
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
  "arrived_at": "2026-10-28T07:36:38.489974Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/36e89147-7ce1-484e-8679-0b879558e29c/start` → **200**

```json
{
  "command_id": "bca8c154-3198-45de-bd0e-3b72e69a8929",
  "expected_version": 1
}
```

```json
{
  "id": "36e89147-7ce1-484e-8679-0b879558e29c",
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "assignment_id": "9b37718f-33bc-429f-866c-ef36b2021d14",
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
  "arrived_at": "2026-10-28T07:36:38.489974Z",
  "started_at": "2026-10-28T07:36:38.51835Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/150d1024-bd65-4868-b58f-80f031357366/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:38Z",
    "sequence": 1793172998538
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "150d1024-bd65-4868-b58f-80f031357366",
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
  "last_heartbeat_at": "2026-10-28T07:36:38.555088Z",
  "last_location_at": "2026-10-28T07:36:38.555088Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/36e89147-7ce1-484e-8679-0b879558e29c/complete` → **200**

```json
{
  "command_id": "6e93e812-5698-4fa5-809d-c8bd8981ff0d",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:36:38Z",
  "cash_received": true
}
```

```json
{
  "id": "36e89147-7ce1-484e-8679-0b879558e29c",
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "assignment_id": "9b37718f-33bc-429f-866c-ef36b2021d14",
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
  "arrived_at": "2026-10-28T07:36:38.489974Z",
  "started_at": "2026-10-28T07:36:38.51835Z",
  "completed_at": "2026-10-28T07:36:38.582874Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/fc5e14ce-d870-46e0-b961-da1dcbfdac45/rating` → **200**

```json
{
  "command_id": "29d8c668-b7e9-4855-ab37-c4d3f37e3593",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "score": 5,
  "created_at": "2026-10-28T07:36:38.623118564Z"
}
```

`POST /api/driver/v1/orders/fc5e14ce-d870-46e0-b961-da1dcbfdac45/rating` → **200**

```json
{
  "command_id": "244522df-a565-4b42-85b6-14d6c6216fb4",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
  "score": 4,
  "created_at": "2026-10-28T07:36:38.65242331Z"
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
  "session_id": "bc0cd848-4497-49fc-b53a-8b1ac04a763d",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTgsImlhdCI6MTc5MzE3Mjk5OCwianRpIjoiMjk1NDY5NjUtNjQxYS00MDBkLWI1YjctOWFjZWI0NjMzNzA1Iiwic2lkIjoiYmMwY2Q4NDgtNDQ5Ny00OWZjLWI1M2EtOGIxYWMwNGE3NjNkIn0.BBjGWcpZYCBJrAW9d7q2eHCG-xZWYjQOSjI9IhjlEqw",
  "access_expires_at": "2026-10-28T07:51:38.96933176Z",
  "refresh_token": "sb7VQElYQETKOLYGcQXdYf8ZXbLUqc3MFpB-SMXmUWg",
  "refresh_expires_at": "2026-10-28T19:36:38.968905034Z",
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
  "session_id": "3dafa157-537d-47aa-bc03-818b5a22e14a",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTksImlhdCI6MTc5MzE3Mjk5OSwianRpIjoiMThiOWEwZjMtOTA3Zi00N2NiLWEyNDYtMWZkZGNjNGNlZmRlIiwic2lkIjoiM2RhZmExNTctNTM3ZC00N2FhLWJjMDMtODE4YjVhMjJlMTRhIn0.ZB3b_P4m6bdN5t1iOakUMIwH_s1WlnYrcDi58w0ZaBo",
  "access_expires_at": "2026-10-28T07:51:39.249867631Z",
  "refresh_token": "IkjYduy-N5PGll3CpZ6q8L98nf2QHvK4qY64nqns9ZI",
  "refresh_expires_at": "2026-10-28T19:36:39.249459699Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fc5e14ce-d870-46e0-b961-da1dcbfdac45/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
      "author_type": "RIDER",
      "author_id": "d3564dc4-1261-4472-a523-b7d898517cb9",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T07:36:38.623119Z"
    },
    {
      "order_id": "fc5e14ce-d870-46e0-b961-da1dcbfdac45",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "d3564dc4-1261-4472-a523-b7d898517cb9",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T07:36:38.652423Z"
    }
  ]
}
```

Done: ratings for order fc5e14ce-d870-46e0-b961-da1dcbfdac45.

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
  "session_id": "f360bc43-f990-4f89-855c-642fc626493e",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM4OTksImlhdCI6MTc5MzE3Mjk5OSwianRpIjoiMThjNzdjMjktN2I3Ni00MDU0LTlkODAtM2NlNTU5MjBmOTcwIiwic2lkIjoiZjM2MGJjNDMtZjk5MC00Zjg5LTg1NWMtNjQyZmM2MjY0OTNlIn0.Mf4M95ENiZtlh90efwyPUL_PthZqjJA1EdOWhZMeZX8",
  "access_expires_at": "2026-10-28T07:51:39.572240626Z",
  "refresh_token": "0BMdc_lLMj-Xf9iNjaTsjKDS5Q7PiVWOdUVCc_6QY-I",
  "refresh_expires_at": "2026-10-28T19:36:39.57175053Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "0201d0f1-9f9e-447d-989d-083c38daf313",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "0f7fbf5f-2851-4769-a171-c722a3146f9a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:39.606436Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0f7fbf5f-2851-4769-a171-c722a3146f9a` → **200**

```json
{
  "id": "0f7fbf5f-2851-4769-a171-c722a3146f9a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:39.606436Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0f7fbf5f-2851-4769-a171-c722a3146f9a` → **200**

```json
{
  "id": "0f7fbf5f-2851-4769-a171-c722a3146f9a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:39.606436Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0f7fbf5f-2851-4769-a171-c722a3146f9a` → **200**

```json
{
  "id": "0f7fbf5f-2851-4769-a171-c722a3146f9a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:36:39.606436Z",
  "ready_at": "2026-10-28T07:36:41.174493Z",
  "expires_at": "2026-10-29T07:36:41.174493Z"
}
```

`GET /api/admin/v1/reports/exports/0f7fbf5f-2851-4769-a171-c722a3146f9a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,15,6,9,0,0,12,3,0,13,1,0,1,5,1,3
total,15,6,9,0,0,12,3,0,13,1,0,1,5,1,3
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "26279628-83ec-4399-bae2-abfc629c8857",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "25f37ab9-3e4b-4f79-91ce-31d47f621c95",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:41.737378Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/25f37ab9-3e4b-4f79-91ce-31d47f621c95` → **200**

```json
{
  "id": "25f37ab9-3e4b-4f79-91ce-31d47f621c95",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:41.737378Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/25f37ab9-3e4b-4f79-91ce-31d47f621c95` → **200**

```json
{
  "id": "25f37ab9-3e4b-4f79-91ce-31d47f621c95",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:41.737378Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/25f37ab9-3e4b-4f79-91ce-31d47f621c95` → **200**

```json
{
  "id": "25f37ab9-3e4b-4f79-91ce-31d47f621c95",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:41.737378Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/25f37ab9-3e4b-4f79-91ce-31d47f621c95` → **200**

```json
{
  "id": "25f37ab9-3e4b-4f79-91ce-31d47f621c95",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:41.737378Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/25f37ab9-3e4b-4f79-91ce-31d47f621c95` → **200**

```json
{
  "id": "25f37ab9-3e4b-4f79-91ce-31d47f621c95",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:36:41.737378Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/25f37ab9-3e4b-4f79-91ce-31d47f621c95` → **200**

```json
{
  "id": "25f37ab9-3e4b-4f79-91ce-31d47f621c95",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:36:41.737378Z",
  "ready_at": "2026-10-28T07:36:46.180593Z",
  "expires_at": "2026-10-29T07:36:46.180593Z"
}
```

`GET /api/admin/v1/reports/exports/25f37ab9-3e4b-4f79-91ce-31d47f621c95/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4af096cb-106c-4ce4-be24-4d0a1d18c550` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4af096cb-106c-4ce4-be24-4d0a1d18c550",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2cae8516-2e1a-4acc-abd9-b8610e7e6312"
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
  "session_id": "14da2d34-17e0-4d08-8460-cdb5562e5159",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM5MDcsImlhdCI6MTc5MzE3MzAwNywianRpIjoiMzNkN2FlYTAtYjgxMi00ZjNkLTgyMWYtZTVmMTYyOTdhYmY3Iiwic2lkIjoiMTRkYTJkMzQtMTdlMC00ZDA4LTg0NjAtY2RiNTU2MmU1MTU5In0.4GT-8LiR4hoeeyix373FU8ubSEY5tA0wKHmBzUVVieM",
  "access_expires_at": "2026-10-28T07:51:47.219563457Z",
  "refresh_token": "0qSki0OELaviRLv8krZfQlGHYesNcAZ2Lwk1MsAi8Cw",
  "refresh_expires_at": "2026-10-28T19:36:47.219071979Z",
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
  "command_id": "9cf603d6-9737-42b1-8da9-2f2bf0c5c313",
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
  "changed_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:36:47.280718Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "9cf603d6-9737-42b1-8da9-2f2bf0c5c313",
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
  "changed_by": "a7e57a74-5563-4e24-bb4b-067014acf110",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:36:47.280718Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48263780767",
  "device_ref": "sandbox-26366"
}
```

```json
{
  "challenge_id": "adeae0fb-647f-480e-b6e5-c2cb7471d815",
  "expires_at": "2026-10-28T07:41:47.345657696Z",
  "resend_available_at": "2026-10-28T07:36:48.345657696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48263780767` → **200**

```json
{
  "phone": "+48263780767",
  "audience": "CLIENT",
  "code": "790974",
  "sent_at": "2026-10-28T07:36:47.347546973Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adeae0fb-647f-480e-b6e5-c2cb7471d815",
  "code": "790974",
  "device_ref": "sandbox-26366"
}
```

```json
{
  "session_id": "260f46a4-0bbc-4d97-a575-60ea4af811fe",
  "subject": {
    "type": "CLIENT",
    "id": "9f83feea-b284-4300-baf2-6e576bfd4b78"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjgzZmVlYS1iMjg0LTQzMDAtYmFmMi02ZTU3NmJmZDRiNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczOTA3LCJpYXQiOjE3OTMxNzMwMDcsImp0aSI6IjRmMDkyYTFhLTdjMTItNDE2Ny1hMTBiLWM3MGI3MzYzMjllNCIsInNpZCI6IjI2MGY0NmE0LTBiYmMtNGQ5Ny1hNTc1LTYwZWE0YWY4MTFmZSJ9.d0s47aAnLzNOhh8t7_m4KfFgZCyuZO-Q4NapwMvaAUY",
  "access_expires_at": "2026-10-28T07:51:47.393290297Z",
  "refresh_token": "pwlWdEOFYECGospxfkTRwHRs-1qMzCCEcvXeu-HOmyY",
  "refresh_expires_at": "2026-11-27T07:36:47.392870536Z",
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
  "correlation_id": "7223d5a3-df4c-4a56-bda9-a4823629bb86"
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
  "device_ref": "sandbox-10750"
}
```

```json
{
  "challenge_id": "b23359e6-19f4-4ab1-86f2-8fcd1d99a816",
  "expires_at": "2026-10-28T07:41:47.460357377Z",
  "resend_available_at": "2026-10-28T07:36:48.460357377Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "699198",
  "sent_at": "2026-10-28T07:36:47.462020864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b23359e6-19f4-4ab1-86f2-8fcd1d99a816",
  "code": "699198",
  "device_ref": "sandbox-10750"
}
```

```json
{
  "session_id": "06a8a39a-4d3b-4505-a2b0-f1c5b31a6165",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzkwNywiaWF0IjoxNzkzMTczMDA3LCJqdGkiOiJiZWM1MzJiMS0zYTI5LTRhMmMtYWU5ZS01YzE0NGFkNTIxOWMiLCJzaWQiOiIwNmE4YTM5YS00ZDNiLTQ1MDUtYTJiMC1mMWM1YjMxYTYxNjUifQ.V1pilxjsBtDp5_Bp87ScUQBkHmeUDB9LNFbNnSaGij8",
  "access_expires_at": "2026-10-28T07:51:47.507198639Z",
  "refresh_token": "xs9wvVGodDZaAet6JTcNi3w4lhq4dsUYkEql9vkY0E4",
  "refresh_expires_at": "2026-11-27T07:36:47.506768112Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f8e9bf41-cc2f-4739-92e8-0511bdf2922d",
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
  "last_heartbeat_at": "2026-10-28T07:36:37.616089Z",
  "last_location_at": "2026-10-28T07:36:37.616089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f8e9bf41-cc2f-4739-92e8-0511bdf2922d/handover` → **200**

```json
{
  "command_id": "1b3a3075-9f07-4766-bc5e-86c798af1f32",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f8e9bf41-cc2f-4739-92e8-0511bdf2922d",
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
  "last_heartbeat_at": "2026-10-28T07:36:37.616089Z",
  "last_location_at": "2026-10-28T07:36:37.616089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f8e9bf41-cc2f-4739-92e8-0511bdf2922d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:47Z",
    "sequence": 1793173007575
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f8e9bf41-cc2f-4739-92e8-0511bdf2922d",
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
  "last_heartbeat_at": "2026-10-28T07:36:47.594561Z",
  "last_location_at": "2026-10-28T07:36:47.594561Z",
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
  "session_id": "f8e9bf41-cc2f-4739-92e8-0511bdf2922d",
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
  "last_heartbeat_at": "2026-10-28T07:36:47.594561Z",
  "last_location_at": "2026-10-28T07:36:47.594561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f8e9bf41-cc2f-4739-92e8-0511bdf2922d/close` → **200**

```json
{
  "command_id": "f9dacef5-4bcd-40d6-bf77-72e3b604160e",
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
  "correlation_id": "442c7a38-2b9f-45a4-b8d7-2d1944245b3b"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676274524",
  "device_ref": "sandbox-2116"
}
```

```json
{
  "challenge_id": "bd0bf641-3108-44c0-a272-4c8ff109a24c",
  "expires_at": "2026-10-28T07:41:47.736950709Z",
  "resend_available_at": "2026-10-28T07:36:48.736950709Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676274524` → **200**

```json
{
  "phone": "+380676274524",
  "audience": "CLIENT",
  "code": "811439",
  "sent_at": "2026-10-28T07:36:47.738818865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd0bf641-3108-44c0-a272-4c8ff109a24c",
  "code": "811439",
  "device_ref": "sandbox-2116"
}
```

```json
{
  "session_id": "fe7abcad-ff8c-451f-8c95-a32cf95a3b0a",
  "subject": {
    "type": "CLIENT",
    "id": "22274a1d-479f-4e39-be2e-7e72c706bb66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMjI3NGExZC00NzlmLTRlMzktYmUyZS03ZTcyYzcwNmJiNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczOTA3LCJpYXQiOjE3OTMxNzMwMDcsImp0aSI6ImJjOGFhYzlmLThjOWItNDY3OC04NDlmLWExMzRjMjM2ZTM5MiIsInNpZCI6ImZlN2FiY2FkLWZmOGMtNDUxZi04Yzk1LWEzMmNmOTVhM2IwYSJ9.prA_-DXJizGxtQVIGAYtCPMUeGeZTYd-PfDr2Jop9b0",
  "access_expires_at": "2026-10-28T07:51:47.784934161Z",
  "refresh_token": "crWm1sDKgrVuaWwQyAMcyi3FqIjNresszSO0RAe9vpY",
  "refresh_expires_at": "2026-11-27T07:36:47.784523003Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "bff9c3e0-2291-4e23-9d39-f8e67317705a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "06a35276-4f32-4985-82dd-784372f6cec1",
  "upload_path": "/api/rider/v1/uploads/06a35276-4f32-4985-82dd-784372f6cec1",
  "expires_at": "2026-10-28T07:51:47.814142963Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/06a35276-4f32-4985-82dd-784372f6cec1` → **200**

```json
{
  "file_id": "06a35276-4f32-4985-82dd-784372f6cec1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "71fc3d95-54b7-4a46-b0d8-57a90d0350db",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "06a35276-4f32-4985-82dd-784372f6cec1"
  ]
}
```

```json
{
  "id": "4dedaaa3-6b42-49f0-a622-77f88c56f64f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:36:47.873423Z",
  "updated_at": "2026-10-28T07:36:47.873423Z",
  "messages": [
    {
      "id": "17b89123-403c-45d2-8da7-ccd6294ad3a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:36:47.874866Z",
      "attachments": [
        {
          "file_id": "06a35276-4f32-4985-82dd-784372f6cec1",
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
  "session_id": "dacbcc00-81fb-412c-a3a8-03413965c69e",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM5MDgsImlhdCI6MTc5MzE3MzAwOCwianRpIjoiNjdkZjUwMTktOTk4Yy00MzA2LThkZGEtYjlkZDExNzdmYzRlIiwic2lkIjoiZGFjYmNjMDAtODFmYi00MTJjLWEzYTgtMDM0MTM5NjVjNjllIn0.dMK8C2VKlNlEihZGpDzZ-5jkocuQ33ZeYKqGjImsv-A",
  "access_expires_at": "2026-10-28T07:51:48.172225725Z",
  "refresh_token": "igSOyXSoLi-bRNarkfP3nt2tIRLsTncNEx34KnE27WA",
  "refresh_expires_at": "2026-10-28T19:36:48.171779876Z",
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
  "session_id": "b70f6202-9704-4e84-8731-ea2822f24726",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM5MDgsImlhdCI6MTc5MzE3MzAwOCwianRpIjoiN2E2NDhlYjctMzc5YS00NzZlLWExNmYtNDdjODg3NjNkNjA3Iiwic2lkIjoiYjcwZjYyMDItOTcwNC00ZTg0LTg3MzEtZWEyODIyZjI0NzI2In0.wnB0sPrMms5vCvv_Ym-t3zkzudP7yYRS6eOtSSgUdZE",
  "access_expires_at": "2026-10-28T07:51:48.453152004Z",
  "refresh_token": "SLimBENScgK7N5GpyvHpWWbfl7J9n_diiNAlO3BzirE",
  "refresh_expires_at": "2026-10-28T19:36:48.452664672Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/4dedaaa3-6b42-49f0-a622-77f88c56f64f/attachments/06a35276-4f32-4985-82dd-784372f6cec1` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "0adb9549-95aa-42d7-9672-2e03bc8e2f37",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e0a6682a-9bf0-4a19-8d4e-22b99cb083b8",
  "upload_path": "/api/operator/v1/uploads/e0a6682a-9bf0-4a19-8d4e-22b99cb083b8",
  "expires_at": "2026-10-28T07:51:48.496417151Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/e0a6682a-9bf0-4a19-8d4e-22b99cb083b8` → **200**

```json
{
  "file_id": "e0a6682a-9bf0-4a19-8d4e-22b99cb083b8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/4dedaaa3-6b42-49f0-a622-77f88c56f64f` → **200**

```json
{
  "id": "4dedaaa3-6b42-49f0-a622-77f88c56f64f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:36:47.873423Z",
  "updated_at": "2026-10-28T07:36:47.873423Z",
  "messages": [
    {
      "id": "17b89123-403c-45d2-8da7-ccd6294ad3a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:36:47.874866Z",
      "attachments": [
        {
          "file_id": "06a35276-4f32-4985-82dd-784372f6cec1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/4dedaaa3-6b42-49f0-a622-77f88c56f64f/comments` → **200**

```json
{
  "command_id": "147bccf7-3017-467c-8ca4-24412c26dfc2",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "e0a6682a-9bf0-4a19-8d4e-22b99cb083b8"
  ]
}
```

```json
{
  "id": "4dedaaa3-6b42-49f0-a622-77f88c56f64f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:36:47.873423Z",
  "updated_at": "2026-10-28T07:36:48.582428Z",
  "messages": [
    {
      "id": "17b89123-403c-45d2-8da7-ccd6294ad3a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:36:47.874866Z",
      "attachments": [
        {
          "file_id": "06a35276-4f32-4985-82dd-784372f6cec1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a25e51dc-7771-40cc-9f88-41b7403a653f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a7e57a74-5563-4e24-bb4b-067014acf110",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:36:48.58215Z",
      "attachments": [
        {
          "file_id": "e0a6682a-9bf0-4a19-8d4e-22b99cb083b8",
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

`GET /api/rider/v1/support/cases/4dedaaa3-6b42-49f0-a622-77f88c56f64f` → **200**

```json
{
  "id": "4dedaaa3-6b42-49f0-a622-77f88c56f64f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:36:47.873423Z",
  "updated_at": "2026-10-28T07:36:48.582428Z",
  "messages": [
    {
      "id": "17b89123-403c-45d2-8da7-ccd6294ad3a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "22274a1d-479f-4e39-be2e-7e72c706bb66",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:36:47.874866Z",
      "attachments": [
        {
          "file_id": "06a35276-4f32-4985-82dd-784372f6cec1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a25e51dc-7771-40cc-9f88-41b7403a653f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:36:48.58215Z",
      "attachments": [
        {
          "file_id": "e0a6682a-9bf0-4a19-8d4e-22b99cb083b8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/4dedaaa3-6b42-49f0-a622-77f88c56f64f/attachments/e0a6682a-9bf0-4a19-8d4e-22b99cb083b8` → **200**

Done: support case 4dedaaa3-6b42-49f0-a622-77f88c56f64f, rider attachment 06a35276-4f32-4985-82dd-784372f6cec1, operator attachment e0a6682a-9bf0-4a19-8d4e-22b99cb083b8.

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
  "session_id": "1503b485-d954-4051-863d-48932c748443",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM5MDgsImlhdCI6MTc5MzE3MzAwOCwianRpIjoiYjZiZmJiNDQtYjM4Mi00ZGMwLWE2ODEtMGFlMGRiOGU0NjE3Iiwic2lkIjoiMTUwM2I0ODUtZDk1NC00MDUxLTg2M2QtNDg5MzJjNzQ4NDQzIn0.Hwen5UtN_a2MelpyNZYNaaifWO8Hkyj0vOZ8I61Cjng",
  "access_expires_at": "2026-10-28T07:51:48.9234388Z",
  "refresh_token": "vMxzFD0JTJYEveI7EFpxJ6RnFGiqWzCuAmWIR5Xwkb0",
  "refresh_expires_at": "2026-10-28T19:36:48.923025219Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13140"
}
```

```json
{
  "challenge_id": "4c35e941-7162-4f69-9dc0-a60453e4033f",
  "expires_at": "2026-10-28T07:41:48.946797518Z",
  "resend_available_at": "2026-10-28T07:36:49.946797518Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "589066",
  "sent_at": "2026-10-28T07:36:48.948500024Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c35e941-7162-4f69-9dc0-a60453e4033f",
  "code": "589066",
  "device_ref": "sandbox-13140"
}
```

```json
{
  "session_id": "a13397e9-5a11-40d9-b6b0-bb2abb9ed876",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzkwOCwiaWF0IjoxNzkzMTczMDA4LCJqdGkiOiJhYmVjYWEzNy05OGJkLTQ5ZWUtODYxNC0yNzg0NTQ3ZjczNWIiLCJzaWQiOiJhMTMzOTdlOS01YTExLTQwZDktYjZiMC1iYjJhYmI5ZWQ4NzYifQ.NGz4ucTXsHIfhGejb0RqrH6fSmNh2j9rRZ6PFLrHCJ4",
  "access_expires_at": "2026-10-28T07:51:48.995186584Z",
  "refresh_token": "je2bIhT_UJtt8jMpeg8vXs_ifmfMTvlVGe1y9YTHEVU",
  "refresh_expires_at": "2026-11-27T07:36:48.994762156Z",
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
  "command_id": "53883710-b7ef-48ab-99a7-a253c154eefa",
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
  "device_ref": "sandbox-19220"
}
```

```json
{
  "challenge_id": "81da9202-41fe-4226-9fc6-a0766b4e03d2",
  "expires_at": "2026-10-28T07:41:49.102181075Z",
  "resend_available_at": "2026-10-28T07:36:50.102181075Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "025841",
  "sent_at": "2026-10-28T07:36:49.103775754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81da9202-41fe-4226-9fc6-a0766b4e03d2",
  "code": "025841",
  "device_ref": "sandbox-19220"
}
```

```json
{
  "session_id": "f0a3c40d-4a42-4ed0-aa90-fde2cea60a25",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzkwOSwiaWF0IjoxNzkzMTczMDA5LCJqdGkiOiIwZjdhYjQwZi0yNTc2LTQxZGMtYTQxZi1kM2NmNmFhMzY0ZDgiLCJzaWQiOiJmMGEzYzQwZC00YTQyLTRlZDAtYWE5MC1mZGUyY2VhNjBhMjUifQ.Af2qnP0gtA1cM22UTjZjmrfmhnLhZ9KayIIz3UR_77g",
  "access_expires_at": "2026-10-28T07:51:49.149911937Z",
  "refresh_token": "fYy_Gos3ObNZZ4DewVqaELN3M5VbCGxeP9NAXg__VZ4",
  "refresh_expires_at": "2026-11-27T07:36:49.149406378Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "150d1024-bd65-4868-b58f-80f031357366",
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
  "last_heartbeat_at": "2026-10-28T07:36:38.555088Z",
  "last_location_at": "2026-10-28T07:36:38.555088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/150d1024-bd65-4868-b58f-80f031357366/handover` → **200**

```json
{
  "command_id": "f9bccba5-c1fc-46bf-98a7-e1dcb3a25fbb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "150d1024-bd65-4868-b58f-80f031357366",
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
  "last_heartbeat_at": "2026-10-28T07:36:38.555088Z",
  "last_location_at": "2026-10-28T07:36:38.555088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/150d1024-bd65-4868-b58f-80f031357366/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:49Z",
    "sequence": 1793173009220
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "150d1024-bd65-4868-b58f-80f031357366",
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
  "last_heartbeat_at": "2026-10-28T07:36:49.235629Z",
  "last_location_at": "2026-10-28T07:36:49.235629Z",
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
  "command_id": "3755ded0-4674-4d45-a95f-600e50112b06",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:49Z",
    "sequence": 1793173009275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8a81abc-dbe4-43af-85c1-43f53a8b582a",
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
  "last_heartbeat_at": "2026-10-28T07:36:49.290228Z",
  "last_location_at": "2026-10-28T07:36:49.290228Z",
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
  "session_id": "95ad889e-44f5-4b9f-a4eb-2065f1536f7c",
  "subject": {
    "type": "STAFF",
    "id": "a7e57a74-5563-4e24-bb4b-067014acf110"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhN2U1N2E3NC01NTYzLTRlMjQtYmI0Yi0wNjcwMTRhY2YxMTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzM5MDksImlhdCI6MTc5MzE3MzAwOSwianRpIjoiNTMxNjViZDYtOWM1Yy00ZmVmLTgzOWYtM2MzMDM1NmFkMjFhIiwic2lkIjoiOTVhZDg4OWUtNDRmNS00YjlmLWE0ZWItMjA2NWYxNTM2ZjdjIn0.OYrnass9qfPV0wYhaC5mZl49_VWTDwv3A9a8udLIJoc",
  "access_expires_at": "2026-10-28T07:51:49.57521073Z",
  "refresh_token": "MI6SJMLsqJ_4sxPT4T3BNtHo4JRW5O37pyIEH39nT2A",
  "refresh_expires_at": "2026-10-28T19:36:49.574503608Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cb81437f-af40-4ed3-94c8-2cb3f40a9062",
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
  "id": "7b377640-f581-4c1a-8629-b156ffb4370c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:41:49.602147Z",
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
  "command_id": "1d196e45-b824-490c-953e-2dfe2b686b63",
  "quote_id": "7b377640-f581-4c1a-8629-b156ffb4370c",
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
  "id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
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
  "created_at": "2026-10-28T07:36:49.633369Z",
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
    "id": "87a019aa-cf56-449d-9b2f-1fa034da76b3",
    "order_id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
    "expires_at": "2026-10-28T07:37:04.637203Z",
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

`POST /api/driver/v1/offers/87a019aa-cf56-449d-9b2f-1fa034da76b3/accept` → **200**

```json
{
  "command_id": "395c9b77-73ad-4f64-8e30-ab397c6f2006"
}
```

```json
{
  "id": "348e8b2e-f6a8-48fe-871f-259d046abc85",
  "order_id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6",
  "order_id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
  "assignment_id": "348e8b2e-f6a8-48fe-871f-259d046abc85",
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

`POST /api/driver/v1/work-sessions/a8a81abc-dbe4-43af-85c1-43f53a8b582a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:36:49Z",
    "sequence": 1793173009750
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8a81abc-dbe4-43af-85c1-43f53a8b582a",
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
  "last_heartbeat_at": "2026-10-28T07:36:49.766132Z",
  "last_location_at": "2026-10-28T07:36:49.766132Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6/arrive` → **200**

```json
{
  "command_id": "32a753e2-b292-450b-9cb5-e887b9a36ae8",
  "expected_version": 0
}
```

```json
{
  "id": "f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6",
  "order_id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
  "assignment_id": "348e8b2e-f6a8-48fe-871f-259d046abc85",
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
  "arrived_at": "2026-10-28T07:36:49.795883Z",
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

`POST /api/driver/v1/trips/f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6/start` → **200**

```json
{
  "command_id": "e7f39a68-ce76-40f9-ae28-4328ce5695b6",
  "expected_version": 1
}
```

```json
{
  "id": "f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6",
  "order_id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
  "assignment_id": "348e8b2e-f6a8-48fe-871f-259d046abc85",
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
  "arrived_at": "2026-10-28T07:36:49.795883Z",
  "started_at": "2026-10-28T07:36:49.828247Z",
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

`POST /api/driver/v1/trips/f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6/complete` → **200**

```json
{
  "command_id": "401b9931-9464-4490-ad8e-18c29f88df9f",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:36:49Z",
  "cash_received": true
}
```

```json
{
  "id": "f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6",
  "order_id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
  "assignment_id": "348e8b2e-f6a8-48fe-871f-259d046abc85",
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
  "arrived_at": "2026-10-28T07:36:49.795883Z",
  "started_at": "2026-10-28T07:36:49.828247Z",
  "completed_at": "2026-10-28T07:36:49.86362Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/6ec98ca7-bdf3-4255-9409-b65ef97961c8` → **200**

```json
{
  "id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
  "short_number": 17,
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
    "id": "348e8b2e-f6a8-48fe-871f-259d046abc85",
    "order_id": "6ec98ca7-bdf3-4255-9409-b65ef97961c8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f59c3fd7-9e00-41b5-9aee-4cc7bf28f3c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:36:49.633369Z",
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
  "session_id": "150d1024-bd65-4868-b58f-80f031357366",
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
  "last_heartbeat_at": "2026-10-28T07:36:49.235629Z",
  "last_location_at": "2026-10-28T07:36:49.235629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/150d1024-bd65-4868-b58f-80f031357366/close` → **200**

```json
{
  "command_id": "b490df1c-f1cb-4db6-83ed-790e5432722b",
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
  "session_id": "a8a81abc-dbe4-43af-85c1-43f53a8b582a",
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
  "last_heartbeat_at": "2026-10-28T07:36:49.766132Z",
  "last_location_at": "2026-10-28T07:36:49.766132Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8a81abc-dbe4-43af-85c1-43f53a8b582a/close` → **200**

```json
{
  "command_id": "f7f988f6-a5a4-444a-b82d-68e7597fc4b6",
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

Done: terminal order 6ec98ca7-bdf3-4255-9409-b65ef97961c8 by Andrii (5a000000-0000-4000-8000-000000000403).
