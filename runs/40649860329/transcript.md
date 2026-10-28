# Sandbox transcript (2026-10-28T07:25:20Z, 88bf203)

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
  "correlation_id": "e30b3cca-d0a8-4530-9b74-99ea09711b4b"
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
  "session_id": "784ee9b8-c8dd-4047-835c-88d000e807d1",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyMjAsImlhdCI6MTc5MzE3MjMyMCwianRpIjoiN2E0OWM5OGUtOTY2My00MDgwLWE1OTMtMjZiNGJkOGViZGI0Iiwic2lkIjoiNzg0ZWU5YjgtYzhkZC00MDQ3LTgzNWMtODhkMDAwZTgwN2QxIn0.dcR-2i65pSOT3BwTwsLxAhScAVI7UkXHIc09m66p-wM",
  "access_expires_at": "2026-10-28T07:40:20.767556384Z",
  "refresh_token": "YJnT0rtwfEmjqQvLIrE_WfbRbk1HVbYib47Je4YS40Y",
  "refresh_expires_at": "2026-10-28T19:25:20.765813496Z",
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
  "session_id": "fd7ca400-f1e1-4a95-b204-2fd312eb1d90",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyMjEsImlhdCI6MTc5MzE3MjMyMSwianRpIjoiZWI4M2U4NjgtMzJhMi00YTY5LWJkNWQtNjU0ZDI4N2ZhN2FiIiwic2lkIjoiZmQ3Y2E0MDAtZjFlMS00YTk1LWIyMDQtMmZkMzEyZWIxZDkwIn0.9_Vwuj16_ePRRRJR18onoUEE3oiAmHcMcQdaRFKCma8",
  "access_expires_at": "2026-10-28T07:40:21.906692772Z",
  "refresh_token": "he_xJ40Ck9dxIJMXmeuj150tRcljLMlQJPLq1ll03WA",
  "refresh_expires_at": "2026-10-28T19:25:21.905663745Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "24be6c3d-443f-464f-a543-5e5e2d13cc9f",
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
  "id": "9724145b-168e-4190-8414-2e12678cf35f",
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
  "created_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "created_at": "2026-10-28T07:25:21.96247Z",
  "updated_at": "2026-10-28T07:25:21.96247Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633040745",
  "device_ref": "sandbox-30858"
}
```

```json
{
  "challenge_id": "9905cb12-beef-4fda-8754-16d518f76604",
  "expires_at": "2026-10-28T07:30:22.002522502Z",
  "resend_available_at": "2026-10-28T07:25:23.002522502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633040745` → **200**

```json
{
  "phone": "+380633040745",
  "audience": "CLIENT",
  "code": "640027",
  "sent_at": "2026-10-28T07:25:22.008901136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9905cb12-beef-4fda-8754-16d518f76604",
  "code": "640027",
  "device_ref": "sandbox-30858"
}
```

```json
{
  "session_id": "b263ece3-7d44-439a-9fc0-9e60b2532b3f",
  "subject": {
    "type": "CLIENT",
    "id": "e409dd92-0a17-4259-bcd4-510917628147"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDA5ZGQ5Mi0wYTE3LTQyNTktYmNkNC01MTA5MTc2MjgxNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjIyLCJpYXQiOjE3OTMxNzIzMjIsImp0aSI6IjYxYjhjMjExLWVjOGMtNDMyNy04YTkzLWFiMzFlNzgzY2NiZiIsInNpZCI6ImIyNjNlY2UzLTdkNDQtNDM5YS05ZmMwLTllNjBiMjUzMmIzZiJ9.istyZCAxxvXBbSU05pnp2EFI38S5FMArYgdzQc0EB24",
  "access_expires_at": "2026-10-28T07:40:22.078783294Z",
  "refresh_token": "ncHwWTozXxo6FZ7Ff4vNnlIet173FT5q40_gJkYVLEI",
  "refresh_expires_at": "2026-11-27T07:25:22.077670822Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633040745` → **200**

```json
{
  "client_id": "e409dd92-0a17-4259-bcd4-510917628147"
}
```

`POST /api/admin/v1/rider-wallets/e409dd92-0a17-4259-bcd4-510917628147/top-ups` → **201**

```json
{
  "command_id": "9d2dc261-9ed1-45e0-8f3f-74a15005eaf4",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e409dd92-0a17-4259-bcd4-510917628147",
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
      "id": "cc6e02d7-5e01-4d49-8f73-28c42719f5c0",
      "at": "2026-10-28T07:25:22.15216Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0314532f-e4ea-4bff-b4b2-c5657e81a406",
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
  "id": "db4a11bc-0a46-418e-b125-db8fa876ce9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:30:22.278436Z",
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
      "id": "9724145b-168e-4190-8414-2e12678cf35f",
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
  "device_ref": "sandbox-8743"
}
```

```json
{
  "challenge_id": "d7d9882e-9e95-4822-9b56-ad8f5e1d7729",
  "expires_at": "2026-10-28T07:30:22.338620431Z",
  "resend_available_at": "2026-10-28T07:25:23.338620431Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "060017",
  "sent_at": "2026-10-28T07:25:22.341784626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7d9882e-9e95-4822-9b56-ad8f5e1d7729",
  "code": "060017",
  "device_ref": "sandbox-8743"
}
```

```json
{
  "session_id": "bf3caf05-c439-44f3-9726-42c77f258fb2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzIyMiwiaWF0IjoxNzkzMTcyMzIyLCJqdGkiOiJhMWVjNTY0YS0zODBjLTQ5NTMtYjJiMi1kMDdkNzgzYzE3MDYiLCJzaWQiOiJiZjNjYWYwNS1jNDM5LTQ0ZjMtOTcyNi00MmM3N2YyNThmYjIifQ.LajooPEsS11ciU9BeV9QQpZC27iNtVfDCI5feG_xMtM",
  "access_expires_at": "2026-10-28T07:40:22.393358339Z",
  "refresh_token": "1bk1Hu2wUPmAIxZJq5QxDkvx5iu9sN0fRc0SeViFFvU",
  "refresh_expires_at": "2026-11-27T07:25:22.392502944Z",
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
  "command_id": "aad1f7dc-0c57-40c2-8d93-b855de3cdc8f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:25:22Z",
    "sequence": 1793172322447
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69888903-a494-4570-9a33-c68f4de35d74",
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
  "last_heartbeat_at": "2026-10-28T07:25:22.485952Z",
  "last_location_at": "2026-10-28T07:25:22.485952Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3602d767-e4aa-4fd0-8edb-cecf8acba697",
  "quote_id": "db4a11bc-0a46-418e-b125-db8fa876ce9c",
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
  "id": "57787a84-374b-4a3c-99a7-016819e5c369",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e409dd92-0a17-4259-bcd4-510917628147",
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
  "created_at": "2026-10-28T07:25:22.562159Z",
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
  "client_id": "e409dd92-0a17-4259-bcd4-510917628147",
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
      "id": "cc6e02d7-5e01-4d49-8f73-28c42719f5c0",
      "at": "2026-10-28T07:25:22.15216Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
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
    "id": "d9eae981-dfd3-46e9-9196-d5412bf1b392",
    "order_id": "57787a84-374b-4a3c-99a7-016819e5c369",
    "expires_at": "2026-10-28T07:25:37.57379Z",
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

`POST /api/driver/v1/offers/d9eae981-dfd3-46e9-9196-d5412bf1b392/accept` → **200**

```json
{
  "command_id": "0bf35d16-54b8-4f12-beee-1c7bfd1521b3"
}
```

```json
{
  "id": "f7ba8f2a-473d-4a89-93a7-a4221f56b803",
  "order_id": "57787a84-374b-4a3c-99a7-016819e5c369",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9f2b78e3-7f68-4411-80b5-f73052ac66a8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9f2b78e3-7f68-4411-80b5-f73052ac66a8",
  "order_id": "57787a84-374b-4a3c-99a7-016819e5c369",
  "assignment_id": "f7ba8f2a-473d-4a89-93a7-a4221f56b803",
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

`POST /api/driver/v1/work-sessions/69888903-a494-4570-9a33-c68f4de35d74/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:25:22Z",
    "sequence": 1793172322721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69888903-a494-4570-9a33-c68f4de35d74",
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
  "last_heartbeat_at": "2026-10-28T07:25:22.744121Z",
  "last_location_at": "2026-10-28T07:25:22.744121Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9f2b78e3-7f68-4411-80b5-f73052ac66a8/arrive` → **200**

```json
{
  "command_id": "d318ed23-69ed-423c-9ade-0a68ef1485d4",
  "expected_version": 0
}
```

```json
{
  "id": "9f2b78e3-7f68-4411-80b5-f73052ac66a8",
  "order_id": "57787a84-374b-4a3c-99a7-016819e5c369",
  "assignment_id": "f7ba8f2a-473d-4a89-93a7-a4221f56b803",
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
  "arrived_at": "2026-10-28T07:25:22.78771Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9f2b78e3-7f68-4411-80b5-f73052ac66a8/start` → **200**

```json
{
  "command_id": "e48f38a9-3413-4927-8619-32145be914b5",
  "expected_version": 1
}
```

```json
{
  "id": "9f2b78e3-7f68-4411-80b5-f73052ac66a8",
  "order_id": "57787a84-374b-4a3c-99a7-016819e5c369",
  "assignment_id": "f7ba8f2a-473d-4a89-93a7-a4221f56b803",
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
  "arrived_at": "2026-10-28T07:25:22.78771Z",
  "started_at": "2026-10-28T07:25:22.826522Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9f2b78e3-7f68-4411-80b5-f73052ac66a8/complete` → **200**

```json
{
  "command_id": "a8efd288-c6f2-45bc-aedf-894e5677332f",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:25:22Z",
  "cash_received": true
}
```

```json
{
  "id": "9f2b78e3-7f68-4411-80b5-f73052ac66a8",
  "order_id": "57787a84-374b-4a3c-99a7-016819e5c369",
  "assignment_id": "f7ba8f2a-473d-4a89-93a7-a4221f56b803",
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
  "arrived_at": "2026-10-28T07:25:22.78771Z",
  "started_at": "2026-10-28T07:25:22.826522Z",
  "completed_at": "2026-10-28T07:25:22.884643Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e409dd92-0a17-4259-bcd4-510917628147",
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
      "id": "ca914cbb-aa75-4925-9031-2c70a8abb5a6",
      "at": "2026-10-28T07:25:23.200311Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "57787a84-374b-4a3c-99a7-016819e5c369"
    },
    {
      "id": "cc6e02d7-5e01-4d49-8f73-28c42719f5c0",
      "at": "2026-10-28T07:25:22.15216Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/9724145b-168e-4190-8414-2e12678cf35f/archive` → **200**

```json
{
  "command_id": "f878a674-9304-410a-9d0d-db4a8fa2b01c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "9724145b-168e-4190-8414-2e12678cf35f",
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
  "created_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "created_at": "2026-10-28T07:25:21.96247Z",
  "updated_at": "2026-10-28T07:25:25.973717Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69888903-a494-4570-9a33-c68f4de35d74",
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
  "last_heartbeat_at": "2026-10-28T07:25:22.744121Z",
  "last_location_at": "2026-10-28T07:25:22.744121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69888903-a494-4570-9a33-c68f4de35d74/close` → **200**

```json
{
  "command_id": "d172d86c-6fba-4176-a1e5-9085155e1d7a",
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

Done: order 57787a84-374b-4a3c-99a7-016819e5c369.

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
  "session_id": "4a928203-f3ed-4fd5-a484-113269618bbd",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyMjYsImlhdCI6MTc5MzE3MjMyNiwianRpIjoiMzcyOWI3NDItYjVhYi00OTk4LWI4NmEtNzYyODIyYWI5MmMzIiwic2lkIjoiNGE5MjgyMDMtZjNlZC00ZmQ1LWE0ODQtMTEzMjY5NjE4YmJkIn0.TlgzWJEzPVIHTBFl0VN4IGV1ccNswDSAu3kaUlnfMdw",
  "access_expires_at": "2026-10-28T07:40:26.345824619Z",
  "refresh_token": "dDiweAt9YHx_eM1b1giu2tLXr-kecdkVGxeuH-dRGmI",
  "refresh_expires_at": "2026-10-28T19:25:26.345077787Z",
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
  "command_id": "5a89e580-35ed-49b8-bb3d-c96a65de4a9c",
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
  "session_id": "3abaf526-9e42-44f6-85da-3d9477738e1d",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyMjYsImlhdCI6MTc5MzE3MjMyNiwianRpIjoiMjE0NTU1NDEtYTI5Ny00NjI3LTkzZDktMWJiYjE0MmZhZDgyIiwic2lkIjoiM2FiYWY1MjYtOWU0Mi00NGY2LTg1ZGEtM2Q5NDc3NzM4ZTFkIn0.d3R9gzYOBp8WxTzGUlzJuE-zj8ioKCWxRAaoqxb85hE",
  "access_expires_at": "2026-10-28T07:40:26.706293568Z",
  "refresh_token": "T3TAwxqHLDw0RfSigZHEqwKw2LhmD0e2QVk3j7waOjM",
  "refresh_expires_at": "2026-10-28T19:25:26.705620637Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2834922986",
    "linkedid": "1730052700.2834922986",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672016263"
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
    "id": "1730052700.2834922986",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "42782cd1-36f4-420a-af4c-9edec41a3ae0",
      "state": "MISSED",
      "caller_phone": "+380672016263",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:25:26.732358Z",
      "answered_at": null,
      "ended_at": "2026-10-28T07:25:26.754209Z",
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
    "id": "1730052600.1941114316",
    "linkedid": "1730052600.1941114316",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672016263"
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
      "id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "state": "RINGING",
      "caller_phone": "+380672016263",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:25:26.810318Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd/answer` → **200**

```json
{
  "command_id": "8dc89b59-72f7-482a-b66f-1f51ca8ab91c"
}
```

```json
{
  "id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
  "state": "ANSWERED",
  "caller_phone": "+380672016263",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "order_ids": [],
  "started_at": "2026-10-28T07:25:26.810318Z",
  "answered_at": "2026-10-28T07:25:26.865582Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1941114316",
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
    "id": "1730052600.1941114316",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "state": "ENDED",
      "caller_phone": "+380672016263",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_ids": [],
      "started_at": "2026-10-28T07:25:26.810318Z",
      "answered_at": "2026-10-28T07:25:26.865582Z",
      "ended_at": "2026-10-28T07:25:26.909606Z",
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
      "id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "state": "ENDED",
      "caller_phone": "+380672016263",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_ids": [],
      "started_at": "2026-10-28T07:25:26.810318Z",
      "answered_at": "2026-10-28T07:25:26.865582Z",
      "ended_at": "2026-10-28T07:25:26.909606Z",
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
      "id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "state": "ENDED",
      "caller_phone": "+380672016263",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_ids": [],
      "started_at": "2026-10-28T07:25:26.810318Z",
      "answered_at": "2026-10-28T07:25:26.865582Z",
      "ended_at": "2026-10-28T07:25:26.909606Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:25:29.087402Z"
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
      "id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "state": "ENDED",
      "caller_phone": "+380672016263",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_ids": [],
      "started_at": "2026-10-28T07:25:26.810318Z",
      "answered_at": "2026-10-28T07:25:26.865582Z",
      "ended_at": "2026-10-28T07:25:26.909606Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:25:29.087402Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd` → **200**

```json
{
  "changes": [
    {
      "id": "1515e98e-45ce-4bb7-a764-1f9c65f7076e",
      "occurred_at": "2026-10-28T07:25:31.075722Z",
      "actor_type": "STAFF",
      "actor_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"96e23a6a-496d-4dbc-bdc1-2596cd1bce83\", \"order_ids\": []}",
      "correlation_id": "5c3db75e-c2a4-4ed3-8ef8-a1300c1d1a26"
    },
    {
      "id": "e3add652-e96b-435e-875d-2ffe4a9fc612",
      "occurred_at": "2026-10-28T07:25:31.047757Z",
      "actor_type": "STAFF",
      "actor_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"96e23a6a-496d-4dbc-bdc1-2596cd1bce83\", \"order_ids\": []}",
      "correlation_id": "94930ba0-da59-45ba-b10a-9e49e4ebd0c1"
    }
  ]
}
```

Done: call 29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633787802",
  "device_ref": "sandbox-9707"
}
```

```json
{
  "challenge_id": "2eb8fa88-45c7-4858-b2d9-11318e4bcbec",
  "expires_at": "2026-10-28T07:30:31.154115457Z",
  "resend_available_at": "2026-10-28T07:25:32.154115457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633787802` → **200**

```json
{
  "phone": "+380633787802",
  "audience": "CLIENT",
  "code": "856165",
  "sent_at": "2026-10-28T07:25:31.157026581Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2eb8fa88-45c7-4858-b2d9-11318e4bcbec",
  "code": "856165",
  "device_ref": "sandbox-9707"
}
```

```json
{
  "session_id": "881e3b83-ea4e-466d-b40e-754e5d503887",
  "subject": {
    "type": "CLIENT",
    "id": "0bb8f427-ee31-4dd1-8b0f-7f1d560bfaca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmI4ZjQyNy1lZTMxLTRkZDEtOGIwZi03ZjFkNTYwYmZhY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjMxLCJpYXQiOjE3OTMxNzIzMzEsImp0aSI6ImViNGQwYWI2LTUzYjYtNGMyOS1iOTdlLWVhODhlYmRmMjc0OSIsInNpZCI6Ijg4MWUzYjgzLWVhNGUtNDY2ZC1iNDBlLTc1NGU1ZDUwMzg4NyJ9.BQ9UodrJq8uJxpNOXi8l88UeBewSIqACwga7vRQATzU",
  "access_expires_at": "2026-10-28T07:40:31.207185473Z",
  "refresh_token": "mjSliiPDJo3irfpfpiPgVkLe-OpdgF-WkkP_0trffgg",
  "refresh_expires_at": "2026-11-27T07:25:31.206527099Z",
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
  "device_ref": "sandbox-15060"
}
```

```json
{
  "challenge_id": "40b6ced7-3e5b-4219-914c-da14c9c293a4",
  "expires_at": "2026-10-28T07:30:31.255992454Z",
  "resend_available_at": "2026-10-28T07:25:32.255992454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "373092",
  "sent_at": "2026-10-28T07:25:31.259131866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40b6ced7-3e5b-4219-914c-da14c9c293a4",
  "code": "373092",
  "device_ref": "sandbox-15060"
}
```

```json
{
  "session_id": "da64e074-6851-4d73-aa37-73136e320a40",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzIzMSwiaWF0IjoxNzkzMTcyMzMxLCJqdGkiOiIyOGEyMjZjZS04YThkLTQxZjAtYmVhYS1lMmM3OWUxMDhiNDAiLCJzaWQiOiJkYTY0ZTA3NC02ODUxLTRkNzMtYWEzNy03MzEzNmUzMjBhNDAifQ.PwF6O7YaY28AfCkzJKBSIXNhsmjKaoikULwZ9Di23iU",
  "access_expires_at": "2026-10-28T07:40:31.30940542Z",
  "refresh_token": "-35HUSt2kJSErsGlRAyBrs78sxBwX5Xz9zM13kknbO8",
  "refresh_expires_at": "2026-11-27T07:25:31.308863266Z",
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
  "session_id": "80fac312-4546-4372-8709-5cc0449db99f",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyMzEsImlhdCI6MTc5MzE3MjMzMSwianRpIjoiZjczMjljMTktNmJjMi00YTliLTkwNDItMGRjYmQxNGEzYTRiIiwic2lkIjoiODBmYWMzMTItNDU0Ni00MzcyLTg3MDktNWNjMDQ0OWRiOTlmIn0.5LbFuS914xUCfRS6PmFeAYzoqSFLJSFh0KXZE5uGOC4",
  "access_expires_at": "2026-10-28T07:40:31.614020621Z",
  "refresh_token": "61uzpeTdTuVTd8HPuV89t5bc42TrZYWFQ9PYPz4cwNU",
  "refresh_expires_at": "2026-10-28T19:25:31.613506819Z",
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
  "session_id": "fbab4b79-367e-4fcb-9891-d6031c2115ed",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyMzEsImlhdCI6MTc5MzE3MjMzMSwianRpIjoiYTg3OWEyNWMtM2QwNi00MmUyLWEzMmYtMmNkZjk3YTZkNzA1Iiwic2lkIjoiZmJhYjRiNzktMzY3ZS00ZmNiLTk4OTEtZDYwMzFjMjExNWVkIn0.92wTv5Ic87VjKHVvfXIJ4SVfD6B0JBMbRTJLHE3jMMg",
  "access_expires_at": "2026-10-28T07:40:31.897875394Z",
  "refresh_token": "bZOA948hVdwu0Sa6oIOAHiwdEpqujV75HGIXeWD-_fc",
  "refresh_expires_at": "2026-10-28T19:25:31.897313225Z",
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
  "command_id": "1c2ccd76-2ec7-4c27-a351-24250b55f4b5",
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
  "id": "ef96b3d2-d3dc-4580-8141-40739adc1fea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:30:31.954492Z",
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
  "command_id": "e12b502e-7ee4-4ff9-8b36-00f31e05801c",
  "quote_id": "ef96b3d2-d3dc-4580-8141-40739adc1fea",
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
  "id": "b0407901-6a14-4387-8136-ab9fd54b55f3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0bb8f427-ee31-4dd1-8b0f-7f1d560bfaca",
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
  "created_at": "2026-10-28T07:25:31.9894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b0407901-6a14-4387-8136-ab9fd54b55f3` → **200**

```json
{
  "id": "b0407901-6a14-4387-8136-ab9fd54b55f3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0bb8f427-ee31-4dd1-8b0f-7f1d560bfaca",
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
  "created_at": "2026-10-28T07:25:31.9894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b0407901-6a14-4387-8136-ab9fd54b55f3/cancel` → **200**

```json
{
  "command_id": "1de084cf-d44d-4f6d-bced-440f321faae0",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "b0407901-6a14-4387-8136-ab9fd54b55f3",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0bb8f427-ee31-4dd1-8b0f-7f1d560bfaca",
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
  "created_at": "2026-10-28T07:25:31.9894Z",
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
  "command_id": "af6911f0-e274-46cd-a886-36e93773a52f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:25:32Z",
    "sequence": 1793172332111
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:25:32.127884Z",
  "last_location_at": "2026-10-28T07:25:32.127884Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28928"
}
```

```json
{
  "challenge_id": "efa0badd-6d20-49f0-bd0b-7b3063737cec",
  "expires_at": "2026-10-28T07:30:32.162957032Z",
  "resend_available_at": "2026-10-28T07:25:33.162957032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "246156",
  "sent_at": "2026-10-28T07:25:32.165645992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efa0badd-6d20-49f0-bd0b-7b3063737cec",
  "code": "246156",
  "device_ref": "sandbox-28928"
}
```

```json
{
  "session_id": "dc876dbd-7f6c-4ae3-8db8-71f88d3ca6ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzIzMiwiaWF0IjoxNzkzMTcyMzMyLCJqdGkiOiI4ZWY5MTc2Ni01YzRhLTQ0MTAtYTZkNC1kNGE2Yzg5MGIzMDQiLCJzaWQiOiJkYzg3NmRiZC03ZjZjLTRhZTMtOGRiOC03MWY4OGQzY2E2Y2EifQ.16ncpx8oSYNYz_tfkEMaq1AYdfcrGH9Mv-3EFld6O5I",
  "access_expires_at": "2026-10-28T07:40:32.215591063Z",
  "refresh_token": "i7rKTBvHddPabn1nSRBXWFJ1oEmrKndGuBEgfeUniy4",
  "refresh_expires_at": "2026-11-27T07:25:32.215017271Z",
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
  "command_id": "41e9e91a-d0f0-43a7-92f2-58c8d1763b80",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:25:32Z",
    "sequence": 1793172332264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d96ae33d-6f5b-4600-b07a-0bf48c4423fe",
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
  "last_heartbeat_at": "2026-10-28T07:25:32.280427Z",
  "last_location_at": "2026-10-28T07:25:32.280427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e0563ab0-88bb-45a6-8856-340d9ed74924",
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
  "id": "9f420086-0c43-4812-8333-733a617c47b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:30:32.314360Z",
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
  "command_id": "9687593b-b119-4869-8f76-b497e853227f",
  "quote_id": "9f420086-0c43-4812-8333-733a617c47b8",
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
  "id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0bb8f427-ee31-4dd1-8b0f-7f1d560bfaca",
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
  "created_at": "2026-10-28T07:25:32.348188Z",
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
    "id": "a6813ff9-4422-4576-92e9-cff25479e02b",
    "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
    "expires_at": "2026-10-28T07:25:47.351729Z",
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

`POST /api/driver/v1/offers/a6813ff9-4422-4576-92e9-cff25479e02b/accept` → **200**

```json
{
  "command_id": "81d19f94-7de5-4109-adb0-68b2025cddbd"
}
```

```json
{
  "id": "e352d2aa-6645-49ea-b6d7-e97b790901a9",
  "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30c2ff42-6651-4632-b4f8-606e910b46f5",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30c2ff42-6651-4632-b4f8-606e910b46f5",
  "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "assignment_id": "e352d2aa-6645-49ea-b6d7-e97b790901a9",
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

`POST /api/driver/v1/trips/30c2ff42-6651-4632-b4f8-606e910b46f5/cancel` → **200**

```json
{
  "command_id": "b4d5f3fd-06b7-40ec-b4d2-148e21943985",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "30c2ff42-6651-4632-b4f8-606e910b46f5",
  "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "assignment_id": "e352d2aa-6645-49ea-b6d7-e97b790901a9",
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

`GET /api/rider/v1/orders/8a35540f-c515-44e1-89b6-8a772dd34b99` → **200**

```json
{
  "id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0bb8f427-ee31-4dd1-8b0f-7f1d560bfaca",
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
    "id": "e352d2aa-6645-49ea-b6d7-e97b790901a9",
    "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "30c2ff42-6651-4632-b4f8-606e910b46f5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:25:32.348188Z",
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
    "id": "5458c77c-7928-44f8-a841-bd5acb53f2dd",
    "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
    "expires_at": "2026-10-28T07:25:47.473486Z",
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

`POST /api/driver/v1/offers/5458c77c-7928-44f8-a841-bd5acb53f2dd/accept` → **200**

```json
{
  "command_id": "9f001de9-1ed7-4ffb-bbde-cc022d669f89"
}
```

```json
{
  "id": "51ff6d38-77fa-429c-8af1-e3bc8f64dd56",
  "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8d7ac055-3eee-4caf-a914-aab998ada9a6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8d7ac055-3eee-4caf-a914-aab998ada9a6",
  "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "assignment_id": "51ff6d38-77fa-429c-8af1-e3bc8f64dd56",
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

`POST /api/driver/v1/trips/8d7ac055-3eee-4caf-a914-aab998ada9a6/cancel` → **200**

```json
{
  "command_id": "a768a032-a9fc-4e34-bef1-99496c85dbd6",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "8d7ac055-3eee-4caf-a914-aab998ada9a6",
  "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
  "assignment_id": "51ff6d38-77fa-429c-8af1-e3bc8f64dd56",
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
    "id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:25:32.348188Z",
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
    "id": "b0407901-6a14-4387-8136-ab9fd54b55f3",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:25:31.9894Z",
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

`GET /api/operator/v1/orders/8a35540f-c515-44e1-89b6-8a772dd34b99/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:25:32.348753Z",
      "actor": {
        "type": "CLIENT",
        "id": "0bb8f427-ee31-4dd1-8b0f-7f1d560bfaca",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
        "quote_id": "9f420086-0c43-4812-8333-733a617c47b8",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:25:32.350725Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
        "attempt_id": "9057280e-423b-4140-957b-fcf1d3b47615",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:25:32.356284Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a6813ff9-4422-4576-92e9-cff25479e02b",
        "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:25:32.408717Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a6813ff9-4422-4576-92e9-cff25479e02b",
        "order_id": "8a35540f-c515-44e1-89b6-8a772dd34b99",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "e352d2aa-6645-49ea-b6d7-e97b790901a9"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders b0407901-6a14-4387-8136-ab9fd54b55f3, 8a35540f-c515-44e1-89b6-8a772dd34b99.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731280564",
  "device_ref": "sandbox-1680"
}
```

```json
{
  "challenge_id": "0dd40357-3fae-4020-9708-c831847d5451",
  "expires_at": "2026-10-28T07:30:32.706186904Z",
  "resend_available_at": "2026-10-28T07:25:33.706186904Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731280564` → **200**

```json
{
  "phone": "+380731280564",
  "audience": "CLIENT",
  "code": "565948",
  "sent_at": "2026-10-28T07:25:32.708631361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dd40357-3fae-4020-9708-c831847d5451",
  "code": "565948",
  "device_ref": "sandbox-1680"
}
```

```json
{
  "session_id": "01ecb2dc-2eb7-42d1-bcee-5f835a776e14",
  "subject": {
    "type": "CLIENT",
    "id": "9fea2ba7-abe8-4cb7-b58a-10bfc130315e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmVhMmJhNy1hYmU4LTRjYjctYjU4YS0xMGJmYzEzMDMxNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjMyLCJpYXQiOjE3OTMxNzIzMzIsImp0aSI6ImY4YmQ3MTI1LTI3YjQtNDVkNC04MTg5LTVkYjlhOGIyNWE0ZCIsInNpZCI6IjAxZWNiMmRjLTJlYjctNDJkMS1iY2VlLTVmODM1YTc3NmUxNCJ9.hkgZVibpc-6zCNWIh2z9PQ1L9f9ay3thYpASZ8l_eEI",
  "access_expires_at": "2026-10-28T07:40:32.768352325Z",
  "refresh_token": "VUSSgCWb66DVGN-JBsJRUttr19tFujj-CJQ0ndplWWQ",
  "refresh_expires_at": "2026-11-27T07:25:32.767809796Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "17d23971-31ed-4cb2-bd04-d3554b4f39a7",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b43d397e-91d9-4fcf-9624-a23485774c56",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b43d397e-91d9-4fcf-9624-a23485774c56",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "2b267697aa9076d526ab5f801a8b3127",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b43d397e-91d9-4fcf-9624-a23485774c56",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731280564"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b43d397e-91d9-4fcf-9624-a23485774c56",
  "expires_at": "2026-10-28T07:55:32.800264Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b43d397e-91d9-4fcf-9624-a23485774c56` → **200**

```json
{
  "id": "b43d397e-91d9-4fcf-9624-a23485774c56",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T07:55:32.800264Z",
  "card": {
    "id": "6a6c9541-9ba3-49e4-a7d5-6dc0aa8b70b7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7036",
    "card_type": "Visa",
    "created_at": "2026-10-28T07:25:32.840427Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6a6c9541-9ba3-49e4-a7d5-6dc0aa8b70b7",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7036",
      "card_type": "Visa",
      "created_at": "2026-10-28T07:25:32.840427Z"
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
  "device_ref": "sandbox-2238"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "c73858a9-7f04-441d-867d-47787a53bc23",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2238"
}
```

```json
{
  "challenge_id": "0fb5f9c2-e9fc-4e1b-a59c-68e42ca1b9d0",
  "expires_at": "2026-10-28T07:30:33.939192163Z",
  "resend_available_at": "2026-10-28T07:25:34.939192163Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "168207",
  "sent_at": "2026-10-28T07:25:33.943575329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fb5f9c2-e9fc-4e1b-a59c-68e42ca1b9d0",
  "code": "168207",
  "device_ref": "sandbox-2238"
}
```

```json
{
  "session_id": "67bad9e2-c461-4484-8d9b-b6457de8b272",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzIzMywiaWF0IjoxNzkzMTcyMzMzLCJqdGkiOiIzMmJhNmE1Mi1lNTk0LTQ5YjYtYTAwNS04MmRjMjM4MWY3NzkiLCJzaWQiOiI2N2JhZDllMi1jNDYxLTQ0ODQtOGQ5Yi1iNjQ1N2RlOGIyNzIifQ.FTzbyUwu5F7V6G9dnyIHGCLekjaC-HsHiyr7rg7asEI",
  "access_expires_at": "2026-10-28T07:40:33.991389788Z",
  "refresh_token": "MYYE55gSa8YVw5lhh47S0ApzTl94vjAHDhuFuvkgLpI",
  "refresh_expires_at": "2026-11-27T07:25:33.99089487Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d96ae33d-6f5b-4600-b07a-0bf48c4423fe",
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
  "last_heartbeat_at": "2026-10-28T07:25:32.280427Z",
  "last_location_at": "2026-10-28T07:25:32.280427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d96ae33d-6f5b-4600-b07a-0bf48c4423fe/handover` → **200**

```json
{
  "command_id": "eac4a9e9-bfcc-4649-b5a2-89248ab3f504",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d96ae33d-6f5b-4600-b07a-0bf48c4423fe",
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
  "last_heartbeat_at": "2026-10-28T07:25:32.280427Z",
  "last_location_at": "2026-10-28T07:25:32.280427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d96ae33d-6f5b-4600-b07a-0bf48c4423fe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:25:34Z",
    "sequence": 1793172334845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d96ae33d-6f5b-4600-b07a-0bf48c4423fe",
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
  "last_heartbeat_at": "2026-10-28T07:25:34.106154Z",
  "last_location_at": "2026-10-28T07:25:34.106154Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "376579d4-139a-4bab-912e-6e1a32a88f18",
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
  "id": "9b45707c-911c-4ae2-83c7-cd02adb9ed85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T07:30:34.148881Z",
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
  "command_id": "63cb8810-de4d-4e74-9e40-20948ec463f0",
  "quote_id": "9b45707c-911c-4ae2-83c7-cd02adb9ed85",
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
  "id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9fea2ba7-abe8-4cb7-b58a-10bfc130315e",
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
  "created_at": "2026-10-28T07:25:34.1939Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e` → **200**

```json
{
  "id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9fea2ba7-abe8-4cb7-b58a-10bfc130315e",
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
  "created_at": "2026-10-28T07:25:34.1939Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e` → **200**

```json
{
  "id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fea2ba7-abe8-4cb7-b58a-10bfc130315e",
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
  "created_at": "2026-10-28T07:25:34.1939Z",
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
    "id": "4537fce9-e30e-4ede-b647-850e87d5dd0f",
    "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
    "expires_at": "2026-10-28T07:25:49.307854Z",
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

`POST /api/driver/v1/offers/4537fce9-e30e-4ede-b647-850e87d5dd0f/accept` → **200**

```json
{
  "command_id": "f2b32afa-7a56-46fa-a9b1-357e95d6a8ee"
}
```

```json
{
  "id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "assignment_id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
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

`POST /api/driver/v1/work-sessions/d96ae33d-6f5b-4600-b07a-0bf48c4423fe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:25:35Z",
    "sequence": 1793172335354
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d96ae33d-6f5b-4600-b07a-0bf48c4423fe",
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
  "last_heartbeat_at": "2026-10-28T07:25:35.370807Z",
  "last_location_at": "2026-10-28T07:25:35.370807Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5599f5ee-49c0-4d11-8f62-90e2964b0a7c/arrive` → **200**

```json
{
  "command_id": "3d07ab4b-3e9e-4558-9300-a4e0016f6cb0",
  "expected_version": 0
}
```

```json
{
  "id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "assignment_id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
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
  "arrived_at": "2026-10-28T07:25:35.403064Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5599f5ee-49c0-4d11-8f62-90e2964b0a7c/start` → **200**

```json
{
  "command_id": "3bd842e8-415f-402f-b9cd-7c81b02d6ebd",
  "expected_version": 1
}
```

```json
{
  "id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "assignment_id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
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
  "arrived_at": "2026-10-28T07:25:35.403064Z",
  "started_at": "2026-10-28T07:25:35.440066Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5599f5ee-49c0-4d11-8f62-90e2964b0a7c/complete` → **200**

```json
{
  "command_id": "1188a88f-3580-4770-a9db-d9c4a5783063",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:25:35Z"
}
```

```json
{
  "id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "assignment_id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
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
  "arrived_at": "2026-10-28T07:25:35.403064Z",
  "started_at": "2026-10-28T07:25:35.440066Z",
  "completed_at": "2026-10-28T07:25:35.478013Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e` → **200**

```json
{
  "id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9fea2ba7-abe8-4cb7-b58a-10bfc130315e",
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
    "id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
    "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:25:34.1939Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e` → **200**

```json
{
  "id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9fea2ba7-abe8-4cb7-b58a-10bfc130315e",
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
    "id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
    "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:25:34.1939Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e` → **200**

```json
{
  "id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9fea2ba7-abe8-4cb7-b58a-10bfc130315e",
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
    "id": "d13231fa-cb3e-41eb-8dc4-3b8824d552e6",
    "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5599f5ee-49c0-4d11-8f62-90e2964b0a7c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:25:34.1939Z",
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
      "id": "3c0424d9-b586-4375-91bc-89828b2040a7",
      "at": "2026-10-28T07:25:36.346377Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e/tip` → **200**

```json
{
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
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
  "available_until": "2026-10-29T07:25:35.478013Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e/tip` → **201**

```json
{
  "command_id": "784b03c3-3322-47a9-9502-0f1804e2405c",
  "amount_minor": 2500
}
```

```json
{
  "id": "9309fa2a-b81f-4dcc-8329-a3f8e7eb5f5e",
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T07:25:37.676985Z"
}
```

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e/tip` → **200**

```json
{
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
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
  "available_until": "2026-10-29T07:25:35.478013Z",
  "open": false,
  "tip": {
    "id": "9309fa2a-b81f-4dcc-8329-a3f8e7eb5f5e",
    "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T07:25:37.676985Z"
  }
}
```

`GET /api/rider/v1/orders/d9fad0e3-1569-4c2a-9172-8d149e6bf15e/tip` → **200**

```json
{
  "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
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
  "available_until": "2026-10-29T07:25:35.478013Z",
  "open": false,
  "tip": {
    "id": "9309fa2a-b81f-4dcc-8329-a3f8e7eb5f5e",
    "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T07:25:37.676985Z"
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
      "id": "3c0424d9-b586-4375-91bc-89828b2040a7",
      "at": "2026-10-28T07:25:36.346377Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
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
      "id": "211de115-752b-46fe-a9fd-5c1196add8cd",
      "at": "2026-10-28T07:25:39.40774Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
      "counterpart_id": null
    },
    {
      "id": "3c0424d9-b586-4375-91bc-89828b2040a7",
      "at": "2026-10-28T07:25:36.346377Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d9fad0e3-1569-4c2a-9172-8d149e6bf15e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d96ae33d-6f5b-4600-b07a-0bf48c4423fe",
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
  "last_heartbeat_at": "2026-10-28T07:25:35.370807Z",
  "last_location_at": "2026-10-28T07:25:35.370807Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d96ae33d-6f5b-4600-b07a-0bf48c4423fe/close` → **200**

```json
{
  "command_id": "23469e2a-5d38-4c63-ab36-3c684bb82179",
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

Done: card order d9fad0e3-1569-4c2a-9172-8d149e6bf15e.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737593817",
  "device_ref": "sandbox-17938"
}
```

```json
{
  "challenge_id": "9dd239c9-2a60-417b-b5c5-861de289f91a",
  "expires_at": "2026-10-28T07:30:39.867409857Z",
  "resend_available_at": "2026-10-28T07:25:40.867409857Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737593817` → **200**

```json
{
  "phone": "+380737593817",
  "audience": "CLIENT",
  "code": "456363",
  "sent_at": "2026-10-28T07:25:39.869649232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9dd239c9-2a60-417b-b5c5-861de289f91a",
  "code": "456363",
  "device_ref": "sandbox-17938"
}
```

```json
{
  "session_id": "9f3ddf14-849e-484c-9715-3f8be44529c9",
  "subject": {
    "type": "CLIENT",
    "id": "19080bcd-2d28-4bbf-8792-eaf42c573e9a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOTA4MGJjZC0yZDI4LTRiYmYtODc5Mi1lYWY0MmM1NzNlOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjM5LCJpYXQiOjE3OTMxNzIzMzksImp0aSI6ImQxZWJmMDZmLWJlZmYtNGU5Ny1iNzZkLTI4OTM4YzdjYjE0MSIsInNpZCI6IjlmM2RkZjE0LTg0OWUtNDg0Yy05NzE1LTNmOGJlNDQ1MjljOSJ9.DAyNMqqSxgejkeaVLbIjMOszlNUUDnh8T2y2RdGa-eI",
  "access_expires_at": "2026-10-28T07:40:39.918737177Z",
  "refresh_token": "WXbWx2sD8tqpZ_ThYctSWsIcArW-BXNheN9qzJbv51o",
  "refresh_expires_at": "2026-11-27T07:25:39.918165277Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "0852cdf4-7bfc-4e58-af62-fd0dd2e4f3ce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "4a678c8c-db63-4f4a-a894-02f507cbcf95",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4a678c8c-db63-4f4a-a894-02f507cbcf95",
    "orderDate": "1793172339",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "2540cc698e9fc251f8156a5af525b973",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4a678c8c-db63-4f4a-a894-02f507cbcf95",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737593817"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4a678c8c-db63-4f4a-a894-02f507cbcf95",
  "created_at": "2026-10-28T07:25:39.950427Z",
  "expires_at": "2026-10-28T07:55:39.950427Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/4a678c8c-db63-4f4a-a894-02f507cbcf95` → **200**

```json
{
  "id": "4a678c8c-db63-4f4a-a894-02f507cbcf95",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:25:39.950427Z",
  "expires_at": "2026-10-28T07:55:39.950427Z",
  "completed_at": "2026-10-28T07:25:39.985786Z",
  "masked_pan": "41****3945",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "19080bcd-2d28-4bbf-8792-eaf42c573e9a",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "19080bcd-2d28-4bbf-8792-eaf42c573e9a",
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
      "id": "46fda8c5-1fe1-4327-a0ce-54a1ae49a382",
      "at": "2026-10-28T07:25:40.418128Z",
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
  "client_id": "19080bcd-2d28-4bbf-8792-eaf42c573e9a",
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
      "id": "46fda8c5-1fe1-4327-a0ce-54a1ae49a382",
      "at": "2026-10-28T07:25:40.418128Z",
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
  "device_ref": "sandbox-17866"
}
```

```json
{
  "challenge_id": "f834c377-6151-4f25-a2cc-0834a5db90d8",
  "expires_at": "2026-10-28T07:30:41.104976388Z",
  "resend_available_at": "2026-10-28T07:25:42.104976388Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "458081",
  "sent_at": "2026-10-28T07:25:41.107509274Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f834c377-6151-4f25-a2cc-0834a5db90d8",
  "code": "458081",
  "device_ref": "sandbox-17866"
}
```

```json
{
  "session_id": "881aa702-a128-4027-a293-f4c6cf44652d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI0MSwiaWF0IjoxNzkzMTcyMzQxLCJqdGkiOiI3YWVmNDZmMy0zOTYxLTRiNjYtYTMzNi1mY2JhNGU1Mzk0ZDciLCJzaWQiOiI4ODFhYTcwMi1hMTI4LTQwMjctYTI5My1mNGM2Y2Y0NDY1MmQifQ.a05MZavwrdUoc2fxWkR9mCxXxCGqEgHAz-GHVezdEto",
  "access_expires_at": "2026-10-28T07:40:41.157054264Z",
  "refresh_token": "FHgaVVH99PhCTjr0bF0w6vpmBSRdgwVdk92okysuwRI",
  "refresh_expires_at": "2026-11-27T07:25:41.156527112Z",
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
  "command_id": "d5d840a4-9ec2-48a8-b85a-0881414d9b9f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "325754b6-b89c-4352-bc14-3b19dfd0a122",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-325754b6-b89c-4352-bc14-3b19dfd0a122",
    "orderDate": "1793172341",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "bb1d8d278298b7a2c714e2c75b05992b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=325754b6-b89c-4352-bc14-3b19dfd0a122",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=325754b6-b89c-4352-bc14-3b19dfd0a122",
  "created_at": "2026-10-28T07:25:41.206489Z",
  "expires_at": "2026-10-28T07:55:41.206489Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/325754b6-b89c-4352-bc14-3b19dfd0a122` → **200**

```json
{
  "id": "325754b6-b89c-4352-bc14-3b19dfd0a122",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:25:41.206489Z",
  "expires_at": "2026-10-28T07:55:41.206489Z",
  "completed_at": "2026-10-28T07:25:41.234507Z",
  "masked_pan": "41****2494",
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
      "id": "35052bb0-571f-4442-97ef-3e2f147dd30e",
      "at": "2026-10-28T07:25:41.615389Z",
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
  "command_id": "15c8d12e-bff0-49ea-89b2-30e1080f0e6a",
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
  "correlation_id": "0a3332e5-42e6-4693-a336-b327bb6a0102"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672910920",
  "device_ref": "sandbox-919"
}
```

```json
{
  "challenge_id": "92cf5c2e-637b-473d-871a-fe55236ae366",
  "expires_at": "2026-10-28T07:30:42.358872853Z",
  "resend_available_at": "2026-10-28T07:25:43.358872853Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672910920` → **200**

```json
{
  "phone": "+380672910920",
  "audience": "CLIENT",
  "code": "015872",
  "sent_at": "2026-10-28T07:25:42.370236927Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92cf5c2e-637b-473d-871a-fe55236ae366",
  "code": "015872",
  "device_ref": "sandbox-919"
}
```

```json
{
  "session_id": "707fc8ba-dac3-4988-9db5-d7083f00216d",
  "subject": {
    "type": "CLIENT",
    "id": "0e3fc940-e7c6-4ea5-ba1b-03c38f2105fd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTNmYzk0MC1lN2M2LTRlYTUtYmExYi0wM2MzOGYyMTA1ZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjQyLCJpYXQiOjE3OTMxNzIzNDIsImp0aSI6IjFiNmIwOGI3LWI2NjktNDI3NS1iZmExLTIzNzQ4N2UxNzczNCIsInNpZCI6IjcwN2ZjOGJhLWRhYzMtNDk4OC05ZGI1LWQ3MDgzZjAwMjE2ZCJ9.cAODpAk76SfoXiYYNpiExWAal-5PjC8OgEwGHUsZQpg",
  "access_expires_at": "2026-10-28T07:40:42.42045508Z",
  "refresh_token": "KG5lGvHEKNuYZOISOyHWVckXQ6f8qZZb8GieYUjzOO0",
  "refresh_expires_at": "2026-11-27T07:25:42.420042169Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0e3fc940-e7c6-4ea5-ba1b-03c38f2105fd",
  "session_id": "707fc8ba-dac3-4988-9db5-d7083f00216d",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "edca11de-78af-4ae4-b343-b5c9d72ffd38",
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
  "id": "5f9681c0-ac2c-48df-872f-d29fa9d4aeca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:30:42.472068Z",
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
  "challenge_id": "63e288ed-bcfb-46fa-8809-d0424ba1fe45",
  "expires_at": "2026-10-28T07:30:44.506437614Z",
  "resend_available_at": "2026-10-28T07:25:45.506437614Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672910920` → **200**

```json
{
  "phone": "+380672910920",
  "audience": "CLIENT",
  "code": "255293",
  "sent_at": "2026-10-28T07:25:44.508307123Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "36abe22a-3aa2-44d1-8c1a-02d1590079bc",
  "challenge_id": "63e288ed-bcfb-46fa-8809-d0424ba1fe45",
  "otp_code": "255293"
}
```

```json
{
  "client_id": "0e3fc940-e7c6-4ea5-ba1b-03c38f2105fd",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T07:25:44.56702758Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "31cc5cc9-d2f5-4922-9e81-bf8559eefb18",
  "quote_id": "5f9681c0-ac2c-48df-872f-d29fa9d4aeca",
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
  "correlation_id": "0ffa4a0b-4f13-4c5d-a861-84d2ac6a16d4"
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
  "session_id": "20ea28e3-45ee-4ec6-985f-0af2db22c4e0",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNDQsImlhdCI6MTc5MzE3MjM0NCwianRpIjoiYTkwYTNiNjgtZDM1MC00MTY0LWIyMjAtYTY2OWNhNDhhNWRhIiwic2lkIjoiMjBlYTI4ZTMtNDVlZS00ZWM2LTk4NWYtMGFmMmRiMjJjNGUwIn0.oihiGcMBPbdyZvsvhgm-JketUu87qXBXaRJ-vwyT_Ok",
  "access_expires_at": "2026-10-28T07:40:44.890155368Z",
  "refresh_token": "5GsdCP9RrbwxhzgizJR6cRy1Pwf7k2nDvnkewW525jA",
  "refresh_expires_at": "2026-10-28T19:25:44.889672393Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "0e3fc940-e7c6-4ea5-ba1b-03c38f2105fd",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T07:25:44.567028Z",
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

`POST /api/admin/v1/client-deletions/0e3fc940-e7c6-4ea5-ba1b-03c38f2105fd/complete` → **200**

```json
{
  "command_id": "115262a3-1e66-4039-a1a0-b66beabfcbed",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "0e3fc940-e7c6-4ea5-ba1b-03c38f2105fd",
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
  "correlation_id": "f5ce4a8c-46cd-4d4f-9622-a12bc1ab4d7a"
}
```

Done: client 0e3fc940-e7c6-4ea5-ba1b-03c38f2105fd anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669762415",
  "device_ref": "sandbox-20739"
}
```

```json
{
  "challenge_id": "0992185d-402d-4877-bfa8-055cd20d6c7f",
  "expires_at": "2026-10-28T07:30:45.013282462Z",
  "resend_available_at": "2026-10-28T07:25:46.013282462Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669762415` → **200**

```json
{
  "phone": "+380669762415",
  "audience": "CLIENT",
  "code": "610434",
  "sent_at": "2026-10-28T07:25:45.01543471Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0992185d-402d-4877-bfa8-055cd20d6c7f",
  "code": "610434",
  "device_ref": "sandbox-20739"
}
```

```json
{
  "session_id": "9f259fe0-ff2d-408f-add2-8a95aff2c4e9",
  "subject": {
    "type": "CLIENT",
    "id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODA3YzA4Ni1jZmJkLTRiNmItYWVhYi05NjI4ZmIxZThlNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjQ1LCJpYXQiOjE3OTMxNzIzNDUsImp0aSI6IjE4MWJjYTQwLTU1MmItNDNiMy05N2RkLWNiOTE1NTJhMGY0ZiIsInNpZCI6IjlmMjU5ZmUwLWZmMmQtNDA4Zi1hZGQyLThhOTVhZmYyYzRlOSJ9.EpFvGAuDoSkN1ScSUqxqcueyYhBMGYkuJZ-u0Y4G70s",
  "access_expires_at": "2026-10-28T07:40:45.063643281Z",
  "refresh_token": "jFnU02PigH8dglrQ3byxcm-2_Y5Do7yuM6-GhAY5glA",
  "refresh_expires_at": "2026-11-27T07:25:45.063127185Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60",
  "session_id": "9f259fe0-ff2d-408f-add2-8a95aff2c4e9",
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
  "session_id": "82a50864-01c8-4c06-9544-aa452d0ededa",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNDUsImlhdCI6MTc5MzE3MjM0NSwianRpIjoiOWJhNTI4MmItNDRmMS00NDQ1LTk4N2YtMjhhMDk4M2JlNGI5Iiwic2lkIjoiODJhNTA4NjQtMDFjOC00YzA2LTk1NDQtYWE0NTJkMGVkZWRhIn0.4iaD37_Ebh_5j8Z2ECAoQGvWTOofKu_rOoYZR7v3SVs",
  "access_expires_at": "2026-10-28T07:40:45.367476666Z",
  "refresh_token": "4YjJJvPbPHqw1r0iZsxwuPWxTyWSjspzRloxj4sAlo0",
  "refresh_expires_at": "2026-10-28T19:25:45.367023535Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9762415&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60",
      "phone": "+380669762415",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T07:25:45.061447Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/b807c086-cfbd-4b6b-aeab-9628fb1e8e60` → **200**

```json
{
  "client": {
    "id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60",
    "phone": "+380669762415",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T07:25:45.061447Z",
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

`POST /api/admin/v1/clients/b807c086-cfbd-4b6b-aeab-9628fb1e8e60/block` → **400**

```json
{
  "command_id": "1dcfd4a1-a672-4b46-8bd8-6ad92438c59b",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b807c086-cfbd-4b6b-aeab-9628fb1e8e60/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "76c5ebfa-7498-4c00-8ebc-8a2cde792594",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/b807c086-cfbd-4b6b-aeab-9628fb1e8e60/block` → **200**

```json
{
  "command_id": "b5bf93bd-d21d-468d-a369-5c379262a0f8",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60",
  "phone": "+380669762415",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T07:25:45.061447Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T07:25:45.50588Z",
    "by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
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
  "correlation_id": "0cd209fd-e3da-4353-b154-e022020c8eba"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669762415",
  "device_ref": "sandbox-22761"
}
```

```json
{
  "challenge_id": "297dc4c3-aeca-4429-a29c-1db349402d07",
  "expires_at": "2026-10-28T07:30:47.565688331Z",
  "resend_available_at": "2026-10-28T07:25:48.565688331Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669762415` → **200**

```json
{
  "phone": "+380669762415",
  "audience": "CLIENT",
  "code": "160819",
  "sent_at": "2026-10-28T07:25:47.568033483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "297dc4c3-aeca-4429-a29c-1db349402d07",
  "code": "160819",
  "device_ref": "sandbox-22761"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "0904127b-da04-4ecf-9649-9a9c1cafc4be"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/b807c086-cfbd-4b6b-aeab-9628fb1e8e60` → **200**

```json
{
  "client": {
    "id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60",
    "phone": "+380669762415",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T07:25:45.061447Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T07:25:45.50588Z",
      "by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
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

`POST /api/admin/v1/clients/b807c086-cfbd-4b6b-aeab-9628fb1e8e60/unblock` → **200**

```json
{
  "command_id": "eb04d2d3-9780-4634-8147-b48ecf1d2d4a",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60",
  "phone": "+380669762415",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T07:25:45.061447Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669762415",
  "device_ref": "sandbox-3375"
}
```

```json
{
  "challenge_id": "cc460cc5-77d3-43c4-8286-eec2cbc5b757",
  "expires_at": "2026-10-28T07:30:49.699585084Z",
  "resend_available_at": "2026-10-28T07:25:50.699585084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669762415` → **200**

```json
{
  "phone": "+380669762415",
  "audience": "CLIENT",
  "code": "077645",
  "sent_at": "2026-10-28T07:25:49.701471017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc460cc5-77d3-43c4-8286-eec2cbc5b757",
  "code": "077645",
  "device_ref": "sandbox-3375"
}
```

```json
{
  "session_id": "93bda27c-eac2-4f69-99b6-d760bb8522c4",
  "subject": {
    "type": "CLIENT",
    "id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODA3YzA4Ni1jZmJkLTRiNmItYWVhYi05NjI4ZmIxZThlNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjQ5LCJpYXQiOjE3OTMxNzIzNDksImp0aSI6IjA4Y2Q0OTgwLWM4YWQtNGZjMC1hMjAzLWEzYjhmM2RiYTI3MCIsInNpZCI6IjkzYmRhMjdjLWVhYzItNGY2OS05OWI2LWQ3NjBiYjg1MjJjNCJ9.JWVYOYxWEPQqbeFUsbQsD5CzPj3GVrOtJTSrtGPJ9-E",
  "access_expires_at": "2026-10-28T07:40:49.752195976Z",
  "refresh_token": "kGTUyl4dh1NM5l7--bwo4qFJ8kMN2q1lUJEKexjnfPo",
  "refresh_expires_at": "2026-11-27T07:25:49.751726801Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b807c086-cfbd-4b6b-aeab-9628fb1e8e60",
  "session_id": "93bda27c-eac2-4f69-99b6-d760bb8522c4",
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
  "phone": "+380634206696",
  "device_ref": "sandbox-28499"
}
```

```json
{
  "challenge_id": "16abe12a-c3c3-4d6f-8972-526d2d8c4604",
  "expires_at": "2026-10-28T07:30:49.806642195Z",
  "resend_available_at": "2026-10-28T07:25:50.806642195Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634206696` → **200**

```json
{
  "phone": "+380634206696",
  "audience": "CLIENT",
  "code": "151760",
  "sent_at": "2026-10-28T07:25:49.808724162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16abe12a-c3c3-4d6f-8972-526d2d8c4604",
  "code": "151760",
  "device_ref": "sandbox-28499"
}
```

```json
{
  "session_id": "2ec5162a-4983-4ee4-b52c-ee5a322fee94",
  "subject": {
    "type": "CLIENT",
    "id": "52ec0ad7-b594-4575-a4a3-3ae515bea436"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmVjMGFkNy1iNTk0LTQ1NzUtYTRhMy0zYWU1MTViZWE0MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjQ5LCJpYXQiOjE3OTMxNzIzNDksImp0aSI6IjFiNjYxOTI1LTUyYjMtNDE0Yy04NTIzLTU3MWY0ZWI4OGZmNyIsInNpZCI6IjJlYzUxNjJhLTQ5ODMtNGVlNC1iNTJjLWVlNWEzMjJmZWU5NCJ9.V89ewjhTm2UttxSTQjN63w6rYEpHNw7gk3hUFDmfuQs",
  "access_expires_at": "2026-10-28T07:40:49.857298122Z",
  "refresh_token": "MO8EJrCjZP6tPPI-xty8ISOM5vx4VugXZ-tGYLqc_MA",
  "refresh_expires_at": "2026-11-27T07:25:49.856700294Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ab3b4f3f-c696-4c3f-bad6-98e2ba777901",
  "expires_at": "2026-10-28T07:30:51.88420289Z",
  "resend_available_at": "2026-10-28T07:25:52.88420289Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634206696` → **200**

```json
{
  "phone": "+380634206696",
  "audience": "CLIENT",
  "code": "974960",
  "sent_at": "2026-10-28T07:25:51.885857125Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "f41036b4-40b8-4583-89eb-7dcce50e49a2",
  "challenge_id": "ab3b4f3f-c696-4c3f-bad6-98e2ba777901",
  "otp_code": "974960"
}
```

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "PENDING",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3` → **200**

```json
{
  "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
  "state": "READY",
  "created_at": "2026-10-28T07:25:51.94148Z",
  "ready_at": "2026-10-28T07:25:59.075104Z",
  "expires_at": "2026-11-04T07:25:59.075104Z",
  "size_bytes": 979
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3/file` → **200**, sections: ["calls","card_payments","codes_sent","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639324401",
  "device_ref": "sandbox-7692"
}
```

```json
{
  "challenge_id": "ca2ebf04-80ce-4933-87df-1754ef222cfc",
  "expires_at": "2026-10-28T07:30:59.177983367Z",
  "resend_available_at": "2026-10-28T07:26:00.177983367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639324401` → **200**

```json
{
  "phone": "+380639324401",
  "audience": "CLIENT",
  "code": "367997",
  "sent_at": "2026-10-28T07:25:59.179993548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca2ebf04-80ce-4933-87df-1754ef222cfc",
  "code": "367997",
  "device_ref": "sandbox-7692"
}
```

```json
{
  "session_id": "2a90007e-5b4c-4019-b512-79c3e31306a2",
  "subject": {
    "type": "CLIENT",
    "id": "326179e0-1dc7-4328-a639-4b29d13776dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjYxNzllMC0xZGM3LTQzMjgtYTYzOS00YjI5ZDEzNzc2ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjU5LCJpYXQiOjE3OTMxNzIzNTksImp0aSI6IjM1N2ZkNzMyLWEyOGQtNDQ2Zi05MTFmLTNiYzcxNTE4YzQ0YSIsInNpZCI6IjJhOTAwMDdlLTViNGMtNDAxOS1iNTEyLTc5YzNlMzEzMDZhMiJ9.Gvmaj8kmbbhUiFSx1dbcEf7lyyDVc7Z6S2QlUMlHhbM",
  "access_expires_at": "2026-10-28T07:40:59.228306816Z",
  "refresh_token": "CdWPoyzECe5vIbrF3o28KbCbVFM3MUWDVtTxpTnTqqg",
  "refresh_expires_at": "2026-11-27T07:25:59.227804456Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/d9e34493-ba5d-4006-829f-50babe140ba3/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d6a9d8ce-d12b-4ce4-af03-89a58af488d9"
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
  "session_id": "dfc53501-1058-4429-848b-d928f0441111",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNTksImlhdCI6MTc5MzE3MjM1OSwianRpIjoiYzg4ZDIxNWEtN2U2Yy00YjQ1LWFkNzItNjM5MDA1NTc2ZDlkIiwic2lkIjoiZGZjNTM1MDEtMTA1OC00NDI5LTg0OGItZDkyOGYwNDQxMTExIn0.0i9QmjfPJV2UlRR6Y5OBBw_KPjQJS2JbdTaKglJz4i0",
  "access_expires_at": "2026-10-28T07:40:59.533094878Z",
  "refresh_token": "R4HNHUU0KYskANahc5C9chjiQ7DJx1a4dgwRW1HaDeE",
  "refresh_expires_at": "2026-10-28T19:25:59.532663549Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "52ec0ad7-b594-4575-a4a3-3ae515bea436",
  "session_id": "2ec5162a-4983-4ee4-b52c-ee5a322fee94",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/52ec0ad7-b594-4575-a4a3-3ae515bea436/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "d9e34493-ba5d-4006-829f-50babe140ba3",
      "state": "READY",
      "created_at": "2026-10-28T07:25:51.94148Z",
      "ready_at": "2026-10-28T07:25:59.075104Z",
      "expires_at": "2026-11-04T07:25:59.075104Z",
      "size_bytes": 979
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
  "device_ref": "sandbox-4785"
}
```

```json
{
  "challenge_id": "1e7adbdc-64ee-4d2d-9e63-5f2ed4b0b00b",
  "expires_at": "2026-10-28T07:30:59.639758002Z",
  "resend_available_at": "2026-10-28T07:26:00.639758002Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "804920",
  "sent_at": "2026-10-28T07:25:59.641911909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e7adbdc-64ee-4d2d-9e63-5f2ed4b0b00b",
  "code": "804920",
  "device_ref": "sandbox-4785"
}
```

```json
{
  "session_id": "faef9afd-e048-4638-88fd-54ba0ac73faa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI1OSwiaWF0IjoxNzkzMTcyMzU5LCJqdGkiOiIwOGJhNGQ3Mi1mOGEzLTQ5OTEtYWUzZC0zZThhNGQzYjg2NWYiLCJzaWQiOiJmYWVmOWFmZC1lMDQ4LTQ2MzgtODhmZC01NGJhMGFjNzNmYWEifQ.QSfwCjeVM_FcjgHpKRGJKfoEgJey9fKJcjDscDNxQhk",
  "access_expires_at": "2026-10-28T07:40:59.690542578Z",
  "refresh_token": "c_TLCNmHUPwoPqplewsh_ZfnRz7NYgp9VNdOqXwyJLw",
  "refresh_expires_at": "2026-11-27T07:25:59.690037359Z",
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
  "command_id": "717dd197-6bef-459f-9030-73b6d2f04e13",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:25:59Z",
    "sequence": 1793172359733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:25:59.748944Z",
  "last_location_at": "2026-10-28T07:25:59.748944Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673174550",
  "device_ref": "sandbox-29181"
}
```

```json
{
  "challenge_id": "e56e6a7c-1da0-47f6-960a-5317dc27f0e6",
  "expires_at": "2026-10-28T07:30:59.776238562Z",
  "resend_available_at": "2026-10-28T07:26:00.776238562Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673174550` → **200**

```json
{
  "phone": "+380673174550",
  "audience": "CLIENT",
  "code": "876781",
  "sent_at": "2026-10-28T07:25:59.779612813Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e56e6a7c-1da0-47f6-960a-5317dc27f0e6",
  "code": "876781",
  "device_ref": "sandbox-29181"
}
```

```json
{
  "session_id": "539d4a20-a566-4f2c-813d-b2ac7290d382",
  "subject": {
    "type": "CLIENT",
    "id": "e3269d3e-71e0-4cc7-a9f3-0c554573ffa4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzI2OWQzZS03MWUwLTRjYzctYTlmMy0wYzU1NDU3M2ZmYTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjU5LCJpYXQiOjE3OTMxNzIzNTksImp0aSI6IjBlOGM0MDk5LTZmMWMtNGQ5Ni04NTA0LWFlMzU2MmZhN2YyMSIsInNpZCI6IjUzOWQ0YTIwLWE1NjYtNGYyYy04MTNkLWIyYWM3MjkwZDM4MiJ9.uXfSnJU6FNuSt8tVjyiHjit0_M8HHX1RrtKA-1-6u7w",
  "access_expires_at": "2026-10-28T07:40:59.833036105Z",
  "refresh_token": "TmG-6ClPs0qmp5207sTdzso1Vo5Bo9lrguZBvuMFySI",
  "refresh_expires_at": "2026-11-27T07:25:59.832515583Z",
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
  "command_id": "37ba1e20-fc48-48ab-bc8b-c8ae395d53d3",
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
  "id": "151b7ffe-d7ff-455a-be82-6f8e987c7eed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:30:59.887127Z",
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
  "command_id": "9f9c2b56-4927-4500-8a9a-d56cf932c982",
  "platform": "ANDROID",
  "token": "sandbox-driver-49486494-d4c6-4416-8319-538c1d883a59"
}
```

```json
{
  "id": "f5b2850d-64bf-47c8-ae11-f720e9402684",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:25:59.925173Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ed4a6b57-ab83-4edb-bffb-d0fa497aa28e",
  "platform": "ANDROID",
  "token": "sandbox-rider-9d853cdd-e2a6-490b-8848-2f068cdcf0bf"
}
```

```json
{
  "id": "7e8c3e89-4298-4cd6-acbc-341df5d2fd63",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:25:59.955852Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ecd5897f-4d6c-4a05-861b-19613840327d",
  "quote_id": "151b7ffe-d7ff-455a-be82-6f8e987c7eed",
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
  "id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e3269d3e-71e0-4cc7-a9f3-0c554573ffa4",
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
  "created_at": "2026-10-28T07:25:59.991918Z",
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
    "id": "f2ff4b0a-1cb1-42fb-a8dd-1c09a602c787",
    "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
    "expires_at": "2026-10-28T07:26:14.994898Z",
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

`POST /api/driver/v1/offers/f2ff4b0a-1cb1-42fb-a8dd-1c09a602c787/accept` → **200**

```json
{
  "command_id": "1b589a4a-1dc3-47a5-8cdc-69e06ad46b8f"
}
```

```json
{
  "id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:25:59.972Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:25:59.972Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:25:59.972Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:26:01.197598951Z",
    "token_suffix": "883a59",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "d44687a6-375c-481d-a40e-2a42c0e9f326",
      "order_version": "2",
      "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673174550&after=2026-10-28T07:25:59.972Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:26:01.196204065Z",
    "token_suffix": "dcf0bf",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "7b3b25f0-b748-44a3-a16a-b2432ec1dc11",
      "order_version": "3",
      "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/25bdc614-c4f5-49f5-81f2-439d98c71181/messages` → **201**

```json
{
  "command_id": "e7a067ac-5b8c-4ca0-959e-31a3de0bdc62",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "229ee463-34c9-4e86-b442-8e5f17591198",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T07:26:02.183221738Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "assignment_id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198",
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

`POST /api/driver/v1/trips/c27f83b3-a5e0-414b-b825-0b44555dc658/messages` → **201**

```json
{
  "command_id": "f2fb326f-ffd5-4caf-b9c9-c54f449dee89",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1fa6f0b5-6391-42b6-a8b0-ba106df257b8",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T07:26:02.234939254Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/25bdc614-c4f5-49f5-81f2-439d98c71181/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c27f83b3-a5e0-414b-b825-0b44555dc658/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673174550"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:02Z",
    "sequence": 1793172362304
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:02.321807Z",
  "last_location_at": "2026-10-28T07:26:02.321807Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "assignment_id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198",
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

`POST /api/driver/v1/trips/c27f83b3-a5e0-414b-b825-0b44555dc658/arrive` → **200**

```json
{
  "command_id": "61966a0b-6f5e-4d0a-8947-8297fb14705a",
  "expected_version": 0
}
```

```json
{
  "id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "assignment_id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198",
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
  "arrived_at": "2026-10-28T07:26:02.371008Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c27f83b3-a5e0-414b-b825-0b44555dc658/start` → **200**

```json
{
  "command_id": "b6f70571-e805-4637-99be-a441ce88b3cc",
  "expected_version": 1
}
```

```json
{
  "id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "assignment_id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198",
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
  "arrived_at": "2026-10-28T07:26:02.371008Z",
  "started_at": "2026-10-28T07:26:02.401538Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:02Z",
    "sequence": 1793172362421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:02.438349Z",
  "last_location_at": "2026-10-28T07:26:02.438349Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c27f83b3-a5e0-414b-b825-0b44555dc658/complete` → **200**

```json
{
  "command_id": "af7654cd-43f2-49c6-84ff-2a3d8b7614b7",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:26:02Z",
  "cash_received": true
}
```

```json
{
  "id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "assignment_id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198",
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
  "arrived_at": "2026-10-28T07:26:02.371008Z",
  "started_at": "2026-10-28T07:26:02.401538Z",
  "completed_at": "2026-10-28T07:26:02.469118Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/25bdc614-c4f5-49f5-81f2-439d98c71181` → **200**

```json
{
  "id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e3269d3e-71e0-4cc7-a9f3-0c554573ffa4",
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
    "id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198",
    "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:25:59.991918Z",
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
    "id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:25:59.991918Z",
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
    "id": "c27f83b3-a5e0-414b-b825-0b44555dc658",
    "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
    "order_short_number": 5,
    "created_at": "2026-10-28T07:26:00.053835Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9f2b78e3-7f68-4411-80b5-f73052ac66a8",
    "order_id": "57787a84-374b-4a3c-99a7-016819e5c369",
    "order_short_number": 1,
    "created_at": "2026-10-28T07:25:22.675345Z",
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

`GET /api/rider/v1/orders/25bdc614-c4f5-49f5-81f2-439d98c71181/tip` → **200**

```json
{
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
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
  "available_until": "2026-10-29T07:26:02.469118Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/25bdc614-c4f5-49f5-81f2-439d98c71181/tip` → **201**

```json
{
  "command_id": "e8bb5003-8e02-407e-ba62-be76c154e698",
  "amount_minor": 1100
}
```

```json
{
  "id": "96ad25cc-1b63-4987-91c0-6d78e2dfa6ca",
  "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T07:26:05.648302Z"
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
  "session_id": "aa2ff347-b814-4a1f-be9d-cfa3b340770a",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNjUsImlhdCI6MTc5MzE3MjM2NSwianRpIjoiNmQ5MmUzYWEtZWZiMS00MmU1LTljZjctYjMzM2ZlYTMxOGJjIiwic2lkIjoiYWEyZmYzNDctYjgxNC00YTFmLWJlOWQtY2ZhM2IzNDA3NzBhIn0.mdutzsNAWPZUqM9dIDT0zl9cslz7QFWGWIsYJ9SNWsY",
  "access_expires_at": "2026-10-28T07:41:05.935520853Z",
  "refresh_token": "gQxlX5Zxlmq6KRzelqwB2IAHcASXzWOJk-IT6eZcuZY",
  "refresh_expires_at": "2026-10-28T19:26:05.935090467Z",
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
  "generated_at": "2026-10-28T07:26:05.963808288Z"
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
  "generated_at": "2026-10-28T07:26:05.990374322Z"
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
  "session_id": "7b73f0c2-7853-45ac-8ca6-70c6517bce65",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNjYsImlhdCI6MTc5MzE3MjM2NiwianRpIjoiYWIxYTAyZTYtMTI4Yy00ODg0LWFiYWUtMWY5ZDA3NDIzOGIyIiwic2lkIjoiN2I3M2YwYzItNzg1My00NWFjLThjYTYtNzBjNjUxN2JjZTY1In0.MlIS_dWcW6ECZpdQtpNtDspYvkZeW6aqb8wOnK8NxEg",
  "access_expires_at": "2026-10-28T07:41:06.275081681Z",
  "refresh_token": "lksu8GnthYT7QmX7o3_Vn9KdVRPVpgnpl_yHR8q3e1Y",
  "refresh_expires_at": "2026-10-28T19:26:06.27464823Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/25bdc614-c4f5-49f5-81f2-439d98c71181/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:25:59.992508Z",
      "actor": {
        "type": "CLIENT",
        "id": "e3269d3e-71e0-4cc7-a9f3-0c554573ffa4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
        "quote_id": "151b7ffe-d7ff-455a-be82-6f8e987c7eed",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:25:59.994122Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
        "attempt_id": "b5e3d0d6-f0c4-4204-921f-00f9eac20a76",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:25:59.99898Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f2ff4b0a-1cb1-42fb-a8dd-1c09a602c787",
        "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:26:00.055424Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f2ff4b0a-1cb1-42fb-a8dd-1c09a602c787",
        "order_id": "25bdc614-c4f5-49f5-81f2-439d98c71181",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3be57676-7d32-4bbc-ae7d-b7d547cd8198"
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
  "at": "2026-10-28T07:26:06.319746555Z",
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
      "last_location_at": "2026-10-28T07:26:02.438349Z",
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
      "last_location_at": "2026-10-28T07:25:32.127884Z",
      "order_id": null
    }
  ]
}
```

Done: order 25bdc614-c4f5-49f5-81f2-439d98c71181.

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
  "session_id": "c98c6de3-14ed-4514-97bd-a961b2e343a1",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNjYsImlhdCI6MTc5MzE3MjM2NiwianRpIjoiNGRjZmYxZWQtOGFhMC00MGJmLWEzMDAtNmU5MDExMGJlNzJmIiwic2lkIjoiYzk4YzZkZTMtMTRlZC00NTE0LTk3YmQtYTk2MWIyZTM0M2ExIn0.henymfvu6dLZpYJPrVAgbqrHrnLo-SrgIlwT7-GZfDY",
  "access_expires_at": "2026-10-28T07:41:06.617919988Z",
  "refresh_token": "5VYvVWfBu5j1yPOu3B6KrkcdfYAjPBKosCUuvkEEwCU",
  "refresh_expires_at": "2026-10-28T19:26:06.617491655Z",
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
  "command_id": "0ace2ff5-74e6-4c0e-8f17-9aab6b1afd71",
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
  "timestamp": "2026-10-28T07:26:06.000+0000",
  "channel": {
    "id": "1730052000.113637847",
    "linkedid": "1730052000.113637847",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678990065"
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
  "timestamp": "2026-10-28T07:26:06.000+0000",
  "channel": {
    "id": "1730052000.113637847",
    "linkedid": "1730052000.113637847",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678990065"
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
  "session_id": "1adabd12-3930-4d48-a62b-6ba0ac52266a",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNjcsImlhdCI6MTc5MzE3MjM2NywianRpIjoiNTBiNjhhMWUtNjU5ZC00MTZhLTg3Y2YtZDdiNzZhYmVlOTYwIiwic2lkIjoiMWFkYWJkMTItMzkzMC00ZDQ4LWE2MmItNmJhMGFjNTIyNjZhIn0.ySS-HlGg1gVGeHqABuAqLbbgEcP_wBQE371TjbGH-UQ",
  "access_expires_at": "2026-10-28T07:41:07.016289238Z",
  "refresh_token": "GWwyCiuAZgfkNFrCGY-xivvy2T_bs25X-E78fAYESqU",
  "refresh_expires_at": "2026-10-28T19:26:07.015875055Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "c77de6ef-d7e2-4bfb-9136-ec714bf1de50",
      "state": "RINGING",
      "caller_phone": "+380678990065",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:26:06Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/c77de6ef-d7e2-4bfb-9136-ec714bf1de50/answer` → **200**

```json
{
  "command_id": "0f5a834b-9310-44b6-8656-3ad9f32aeaf3"
}
```

```json
{
  "id": "c77de6ef-d7e2-4bfb-9136-ec714bf1de50",
  "state": "ANSWERED",
  "caller_phone": "+380678990065",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "order_ids": [],
  "started_at": "2026-10-28T07:26:06Z",
  "answered_at": "2026-10-28T07:26:07.076438Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.113637847",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cf867485-e3ae-414c-bf45-6344da811916",
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
  "id": "8fdb0c50-433c-4d2b-849b-67d414e7f5ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:31:07.131993Z",
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
  "command_id": "be45bf9e-9f4d-4e49-b208-40bbba6df2a1",
  "quote_id": "8fdb0c50-433c-4d2b-849b-67d414e7f5ef",
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
    "phone": "+380678990065"
  },
  "call_id": "c77de6ef-d7e2-4bfb-9136-ec714bf1de50"
}
```

```json
{
  "id": "1b47885d-7677-4a82-99bf-120d122493f4",
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
  "created_at": "2026-10-28T07:26:07.178137Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678990065"
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
    "id": "1730052000.113637847",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c77de6ef-d7e2-4bfb-9136-ec714bf1de50",
      "state": "ENDED",
      "caller_phone": "+380678990065",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_ids": [
        "1b47885d-7677-4a82-99bf-120d122493f4"
      ],
      "started_at": "2026-10-28T07:26:06Z",
      "answered_at": "2026-10-28T07:26:07.076438Z",
      "ended_at": "2026-10-28T07:26:07.219752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "29e6ac6b-4b2f-4f73-a0de-c7845ef6e0cd",
      "state": "ENDED",
      "caller_phone": "+380672016263",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "order_ids": [],
      "started_at": "2026-10-28T07:25:26.810318Z",
      "answered_at": "2026-10-28T07:25:26.865582Z",
      "ended_at": "2026-10-28T07:25:26.909606Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:25:29.087402Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/1b47885d-7677-4a82-99bf-120d122493f4` → **200**

```json
{
  "id": "1b47885d-7677-4a82-99bf-120d122493f4",
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
  "created_at": "2026-10-28T07:26:07.178137Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678990065"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/1b47885d-7677-4a82-99bf-120d122493f4` → **200**

```json
{
  "id": "1b47885d-7677-4a82-99bf-120d122493f4",
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
  "created_at": "2026-10-28T07:26:07.178137Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678990065"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1b47885d-7677-4a82-99bf-120d122493f4/cancel` → **200**

```json
{
  "command_id": "215813bf-a8f2-430d-bb6e-c0edfbc95692",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1b47885d-7677-4a82-99bf-120d122493f4",
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
  "created_at": "2026-10-28T07:26:07.178137Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678990065"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call c77de6ef-d7e2-4bfb-9136-ec714bf1de50 with order 1b47885d-7677-4a82-99bf-120d122493f4.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28744"
}
```

```json
{
  "challenge_id": "b8a99d4a-f9a3-48bd-8cea-7ba51d34042b",
  "expires_at": "2026-10-28T07:31:07.371012859Z",
  "resend_available_at": "2026-10-28T07:26:08.371012859Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "506858",
  "sent_at": "2026-10-28T07:26:07.373185153Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8a99d4a-f9a3-48bd-8cea-7ba51d34042b",
  "code": "506858",
  "device_ref": "sandbox-28744"
}
```

```json
{
  "session_id": "ea906f7f-2b09-460f-908e-133c2456711e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI2NywiaWF0IjoxNzkzMTcyMzY3LCJqdGkiOiJmNDRlZmRjMy1iZDUyLTQxMmQtOThkOS02NTljNzRlMGYxOWUiLCJzaWQiOiJlYTkwNmY3Zi0yYjA5LTQ2MGYtOTA4ZS0xMzNjMjQ1NjcxMWUifQ.3ccV6GiZJt7_PxYnDHRGfVsY2Ns_cb6drv_2YhKRva4",
  "access_expires_at": "2026-10-28T07:41:07.421892942Z",
  "refresh_token": "Qpa9qc16L7UyW1zfEcWm-bavBAj2zmdh7SWS8ZnL0f4",
  "refresh_expires_at": "2026-11-27T07:26:07.421435084Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:02.438349Z",
  "last_location_at": "2026-10-28T07:26:02.438349Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/handover` → **200**

```json
{
  "command_id": "c3c61385-0a3c-4a6f-8214-fd849acd841e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:02.438349Z",
  "last_location_at": "2026-10-28T07:26:02.438349Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:07Z",
    "sequence": 1793172367495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:07.511431Z",
  "last_location_at": "2026-10-28T07:26:07.511431Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669803379",
  "device_ref": "sandbox-20182"
}
```

```json
{
  "challenge_id": "aa1727a9-37e5-4040-af06-43fb2c0a3d05",
  "expires_at": "2026-10-28T07:31:07.532237387Z",
  "resend_available_at": "2026-10-28T07:26:08.532237387Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669803379` → **200**

```json
{
  "phone": "+380669803379",
  "audience": "CLIENT",
  "code": "554775",
  "sent_at": "2026-10-28T07:26:07.534131763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa1727a9-37e5-4040-af06-43fb2c0a3d05",
  "code": "554775",
  "device_ref": "sandbox-20182"
}
```

```json
{
  "session_id": "ae56477d-2294-4045-b4fe-be182b86d015",
  "subject": {
    "type": "CLIENT",
    "id": "1030c684-e8cf-4034-a15f-60ac593f33ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDMwYzY4NC1lOGNmLTQwMzQtYTE1Zi02MGFjNTkzZjMzYWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjY3LCJpYXQiOjE3OTMxNzIzNjcsImp0aSI6IjA3YTBhODRhLWY4NDYtNGM1NC1iNDU0LWU2N2U0OGIyNmFiOCIsInNpZCI6ImFlNTY0NzdkLTIyOTQtNDA0NS1iNGZlLWJlMTgyYjg2ZDAxNSJ9.GBNp36od0N3Mdxa0QOr9p9V16pHpCiLxdFHG5GbHIJ8",
  "access_expires_at": "2026-10-28T07:41:07.581135832Z",
  "refresh_token": "u-aK2PX4XcvyhvV812kAgXtYuwDKVl46NtvHOQNgNNo",
  "refresh_expires_at": "2026-11-27T07:26:07.58073503Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "021057c4-9dcf-49c9-930d-12d74e856ebf",
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
  "id": "1e0067c3-02a8-4a21-8a83-68a969c6c1d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T07:31:07.610451Z",
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
  "command_id": "af9367ea-3b7d-40c4-8f48-fc42d53ca52b",
  "quote_id": "1e0067c3-02a8-4a21-8a83-68a969c6c1d5",
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
  "id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1030c684-e8cf-4034-a15f-60ac593f33ab",
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
  "created_at": "2026-10-28T07:26:07.641783Z",
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
    "id": "c30be187-82cb-4acc-b35a-7332f4de662e",
    "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
    "expires_at": "2026-10-28T07:26:22.644544Z",
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

`POST /api/driver/v1/offers/c30be187-82cb-4acc-b35a-7332f4de662e/accept` → **200**

```json
{
  "command_id": "43c2b215-8fef-42bc-87f6-5e0a1adfb980"
}
```

```json
{
  "id": "d8e325ca-4f9b-40d8-a895-28ed7379b504",
  "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b8244ec2-47b3-499f-b2a1-ebe4c5f02533",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8244ec2-47b3-499f-b2a1-ebe4c5f02533",
  "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
  "assignment_id": "d8e325ca-4f9b-40d8-a895-28ed7379b504",
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

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:07Z",
    "sequence": 1793172367744
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:07.760878Z",
  "last_location_at": "2026-10-28T07:26:07.760878Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b8244ec2-47b3-499f-b2a1-ebe4c5f02533/arrive` → **200**

```json
{
  "command_id": "0c0e2705-501f-4c9f-a5fa-610d33322a03",
  "expected_version": 0
}
```

```json
{
  "id": "b8244ec2-47b3-499f-b2a1-ebe4c5f02533",
  "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
  "assignment_id": "d8e325ca-4f9b-40d8-a895-28ed7379b504",
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
  "arrived_at": "2026-10-28T07:26:07.790846Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b8244ec2-47b3-499f-b2a1-ebe4c5f02533/start` → **200**

```json
{
  "command_id": "2324641c-d470-49c8-92ef-7b4c85b2120b",
  "expected_version": 1
}
```

```json
{
  "id": "b8244ec2-47b3-499f-b2a1-ebe4c5f02533",
  "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
  "assignment_id": "d8e325ca-4f9b-40d8-a895-28ed7379b504",
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
  "arrived_at": "2026-10-28T07:26:07.790846Z",
  "started_at": "2026-10-28T07:26:07.825088Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:07Z",
    "sequence": 1793172367847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:07.862809Z",
  "last_location_at": "2026-10-28T07:26:07.862809Z",
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
  "device_ref": "sandbox-12905"
}
```

```json
{
  "challenge_id": "baba494b-3b87-4f6b-b593-6ae585b3150a",
  "expires_at": "2026-10-28T07:31:07.884922159Z",
  "resend_available_at": "2026-10-28T07:26:08.884922159Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "657914",
  "sent_at": "2026-10-28T07:26:07.88690911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "baba494b-3b87-4f6b-b593-6ae585b3150a",
  "code": "657914",
  "device_ref": "sandbox-12905"
}
```

```json
{
  "session_id": "a378e0ef-a031-480b-9720-53cbb10d08df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI2NywiaWF0IjoxNzkzMTcyMzY3LCJqdGkiOiI3YmViMWJmYS1kNjFjLTQwMzMtOWVjOS02M2M3Yjk4Y2RiZDQiLCJzaWQiOiJhMzc4ZTBlZi1hMDMxLTQ4MGItOTcyMC01M2NiYjEwZDA4ZGYifQ.b4PRbIR1CskV2IrJaAwXKAlsEz3GC7QiXLsa4bkzOzQ",
  "access_expires_at": "2026-10-28T07:41:07.933902372Z",
  "refresh_token": "FSQoP54u0VZAtlbMrVNgy7eIJZU-FlzKkews1kdCf1U",
  "refresh_expires_at": "2026-11-27T07:26:07.933443924Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:25:32.127884Z",
  "last_location_at": "2026-10-28T07:25:32.127884Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6/handover` → **200**

```json
{
  "command_id": "c1d9edb4-12eb-4b70-b7ea-e5a2cfdf3453",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:25:32.127884Z",
  "last_location_at": "2026-10-28T07:25:32.127884Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:08Z",
    "sequence": 1793172368504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:26:08.020623Z",
  "last_location_at": "2026-10-28T07:26:08.020623Z",
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
  "session_id": "3824b088-701b-4521-8552-3389bd7a181f",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNjgsImlhdCI6MTc5MzE3MjM2OCwianRpIjoiYTcxMzY2YTAtMmU2Yy00YTE4LWJhMWItZjc3YmE5ZDIyMzdiIiwic2lkIjoiMzgyNGIwODgtNzAxYi00NTIxLTg1NTItMzM4OWJkN2ExODFmIn0.NUaeDV-zmr_axpdsDkxN12dPwqe10FVuM7c19j-Lee0",
  "access_expires_at": "2026-10-28T07:41:08.302361047Z",
  "refresh_token": "4YOjkRdFLTUdNw89KIe3VP04fpGT9MyEnDFp1EQybfk",
  "refresh_expires_at": "2026-10-28T19:26:08.301881707Z",
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
  "session_id": "4d81e7a7-c52d-450f-8b4c-0be0842995a3",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNjgsImlhdCI6MTc5MzE3MjM2OCwianRpIjoiYzA1Zjk2OTItZDQxZC00Njk3LTgxOWEtZDg1MjI1MzQ4YjNjIiwic2lkIjoiNGQ4MWU3YTctYzUyZC00NTBmLThiNGMtMGJlMDg0Mjk5NWEzIn0.TehHpqpsHeFh3I0C5b3JYRilTd1_jT9jdP_sxfnHFDc",
  "access_expires_at": "2026-10-28T07:41:08.585616415Z",
  "refresh_token": "btfkVT9Z7-kX-k0EUTA7ZgMoVBFy_cpPrVZoVIfhsEA",
  "refresh_expires_at": "2026-10-28T19:26:08.585191637Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9c529cff-35d5-4101-8cc8-722171f45ae6` → **200**

```json
{
  "id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1030c684-e8cf-4034-a15f-60ac593f33ab",
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
    "id": "d8e325ca-4f9b-40d8-a895-28ed7379b504",
    "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b8244ec2-47b3-499f-b2a1-ebe4c5f02533",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T07:26:07.641783Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9c529cff-35d5-4101-8cc8-722171f45ae6/interrupt` → **200**

```json
{
  "command_id": "13622a98-e2f1-4fde-bda4-33a5240165f8",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1030c684-e8cf-4034-a15f-60ac593f33ab",
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
      "id": "d8e325ca-4f9b-40d8-a895-28ed7379b504",
      "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b8244ec2-47b3-499f-b2a1-ebe4c5f02533",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T07:26:07.641783Z",
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
    "id": "0f34e91d-452a-4740-8f78-a337544e4650",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1030c684-e8cf-4034-a15f-60ac593f33ab",
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
    "id": "e3cc4b6a-10fb-43c4-8eae-c35c9dca4016",
    "order_id": "0f34e91d-452a-4740-8f78-a337544e4650",
    "expires_at": "2026-10-28T07:26:23.652095Z",
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

`POST /api/driver/v1/offers/e3cc4b6a-10fb-43c4-8eae-c35c9dca4016/accept` → **200**

```json
{
  "command_id": "9981b66a-70a7-47f4-bd79-17eba2e27293"
}
```

```json
{
  "id": "4cb904cc-85a4-42b4-9d3a-778dca69261a",
  "order_id": "0f34e91d-452a-4740-8f78-a337544e4650",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a5e326d-54e8-4821-8133-02019f18a7d4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a5e326d-54e8-4821-8133-02019f18a7d4",
  "order_id": "0f34e91d-452a-4740-8f78-a337544e4650",
  "assignment_id": "4cb904cc-85a4-42b4-9d3a-778dca69261a",
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
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:26:08.020623Z",
  "last_location_at": "2026-10-28T07:26:08.020623Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:08Z",
    "sequence": 1793172368772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:26:08.790123Z",
  "last_location_at": "2026-10-28T07:26:08.790123Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9a5e326d-54e8-4821-8133-02019f18a7d4/arrive` → **200**

```json
{
  "command_id": "039939d1-4aa3-42fe-8bae-029d8d2d0da2",
  "expected_version": 0
}
```

```json
{
  "id": "9a5e326d-54e8-4821-8133-02019f18a7d4",
  "order_id": "0f34e91d-452a-4740-8f78-a337544e4650",
  "assignment_id": "4cb904cc-85a4-42b4-9d3a-778dca69261a",
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
  "arrived_at": "2026-10-28T07:26:08.820801Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9a5e326d-54e8-4821-8133-02019f18a7d4/start` → **200**

```json
{
  "command_id": "1463a1f3-1fc2-429c-89e2-303dd0589523",
  "expected_version": 1
}
```

```json
{
  "id": "9a5e326d-54e8-4821-8133-02019f18a7d4",
  "order_id": "0f34e91d-452a-4740-8f78-a337544e4650",
  "assignment_id": "4cb904cc-85a4-42b4-9d3a-778dca69261a",
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
  "arrived_at": "2026-10-28T07:26:08.820801Z",
  "started_at": "2026-10-28T07:26:08.853599Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9a5e326d-54e8-4821-8133-02019f18a7d4/complete` → **200**

```json
{
  "command_id": "6915fd10-5470-4155-b4d7-ed7480eef3e3",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:26:08Z"
}
```

```json
{
  "id": "9a5e326d-54e8-4821-8133-02019f18a7d4",
  "order_id": "0f34e91d-452a-4740-8f78-a337544e4650",
  "assignment_id": "4cb904cc-85a4-42b4-9d3a-778dca69261a",
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
  "arrived_at": "2026-10-28T07:26:08.820801Z",
  "started_at": "2026-10-28T07:26:08.853599Z",
  "completed_at": "2026-10-28T07:26:08.888756Z",
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
    "id": "0f34e91d-452a-4740-8f78-a337544e4650",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:26:08.642953Z",
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
    "id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:26:07.641783Z",
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
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/9c529cff-35d5-4101-8cc8-722171f45ae6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:26:07.642193Z",
      "actor": {
        "type": "CLIENT",
        "id": "1030c684-e8cf-4034-a15f-60ac593f33ab",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
        "quote_id": "1e0067c3-02a8-4a21-8a83-68a969c6c1d5",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:26:07.64385Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
        "attempt_id": "4da597fb-89b5-444d-8cb4-c64f955ca26d",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:26:07.64837Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c30be187-82cb-4acc-b35a-7332f4de662e",
        "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:26:07.699795Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c30be187-82cb-4acc-b35a-7332f4de662e",
        "order_id": "9c529cff-35d5-4101-8cc8-722171f45ae6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d8e325ca-4f9b-40d8-a895-28ed7379b504"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 9c529cff-35d5-4101-8cc8-722171f45ae6, follow-up 0f34e91d-452a-4740-8f78-a337544e4650.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12959"
}
```

```json
{
  "challenge_id": "bb488d6b-2c2a-4621-ab20-c805af8bd55e",
  "expires_at": "2026-10-28T07:31:11.999701666Z",
  "resend_available_at": "2026-10-28T07:26:12.999701666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "476572",
  "sent_at": "2026-10-28T07:26:12.0015807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb488d6b-2c2a-4621-ab20-c805af8bd55e",
  "code": "476572",
  "device_ref": "sandbox-12959"
}
```

```json
{
  "session_id": "4ab8401b-d80a-40dd-88cb-6d0a3d94d818",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI3MiwiaWF0IjoxNzkzMTcyMzcyLCJqdGkiOiIxODlhOTRkNy02MmJmLTRiNjEtOGU0Ny01MWQ0NGI0MThmNzciLCJzaWQiOiI0YWI4NDAxYi1kODBhLTQwZGQtODhjYi02ZDBhM2Q5NGQ4MTgifQ.3KqBRKxWCkXT7OBDayGLMEBkqw3WUjfgI3A3dG-uh_c",
  "access_expires_at": "2026-10-28T07:41:12.054184009Z",
  "refresh_token": "rcfLur_oUOTpyVf3f01RqI241KTYyZkcPmtvyq5Gfx8",
  "refresh_expires_at": "2026-11-27T07:26:12.053703151Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:26:08.790123Z",
  "last_location_at": "2026-10-28T07:26:08.790123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6/handover` → **200**

```json
{
  "command_id": "730b15f8-d494-4613-a522-a1ed00edd8cd",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:26:08.790123Z",
  "last_location_at": "2026-10-28T07:26:08.790123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:12Z",
    "sequence": 1793172372127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:26:12.143065Z",
  "last_location_at": "2026-10-28T07:26:12.143065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678366229",
  "device_ref": "sandbox-5707"
}
```

```json
{
  "challenge_id": "1d63ce3e-c7e5-4a9d-8222-59e74a5e9d0a",
  "expires_at": "2026-10-28T07:31:12.166080161Z",
  "resend_available_at": "2026-10-28T07:26:13.166080161Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678366229` → **200**

```json
{
  "phone": "+380678366229",
  "audience": "CLIENT",
  "code": "016837",
  "sent_at": "2026-10-28T07:26:12.169754374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d63ce3e-c7e5-4a9d-8222-59e74a5e9d0a",
  "code": "016837",
  "device_ref": "sandbox-5707"
}
```

```json
{
  "session_id": "97e2ad01-387e-4e81-a2f2-74fee0430ddd",
  "subject": {
    "type": "CLIENT",
    "id": "09f5b9aa-a233-423c-a02c-a5572447edc5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWY1YjlhYS1hMjMzLTQyM2MtYTAyYy1hNTU3MjQ0N2VkYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjcyLCJpYXQiOjE3OTMxNzIzNzIsImp0aSI6Ijc1NTU0OTY4LWMxNGQtNGY3Mi1hODljLTQzZWRiMjM2MDFjMSIsInNpZCI6Ijk3ZTJhZDAxLTM4N2UtNGU4MS1hMmYyLTc0ZmVlMDQzMGRkZCJ9.VLD2D6Dp2YZJ5DzVMDpvII1Fy26Zo7_EtGslZ7_3tTc",
  "access_expires_at": "2026-10-28T07:41:12.21779477Z",
  "refresh_token": "cAavP-ddlVN5JxT_bX6wf8qcbGA52-JNd6JqPqzatp4",
  "refresh_expires_at": "2026-11-27T07:26:12.217347738Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5cf3bab0-9247-4cab-8034-751b321aa769",
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
  "id": "1b119642-00d4-4f29-9f39-ca053663431b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:31:12.248475Z",
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
  "command_id": "7fb10f9f-7bd3-4a63-844b-49dc3a4d759a",
  "quote_id": "1b119642-00d4-4f29-9f39-ca053663431b",
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
    "phone": "+380675501495"
  }
}
```

```json
{
  "id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.281592Z",
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
    "id": "5e95ba22-8410-4b7d-9c03-aaf8afe2af16",
    "order_id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
    "expires_at": "2026-10-28T07:26:27.284466Z",
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

`POST /api/driver/v1/offers/5e95ba22-8410-4b7d-9c03-aaf8afe2af16/accept` → **200**

```json
{
  "command_id": "537bed20-af46-4782-86c4-f7c6ddf85afb"
}
```

```json
{
  "id": "80eb99e0-d65e-4cb6-9141-addc3b39c1d4",
  "order_id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8ae71fe-3bfb-499b-8b96-a1ff4ae1cce1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c8ae71fe-3bfb-499b-8b96-a1ff4ae1cce1",
  "order_id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
  "assignment_id": "80eb99e0-d65e-4cb6-9141-addc3b39c1d4",
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
    "phone": "+380675501495"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "833ab57d-66e1-4c22-8d7e-740a12285f60",
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
  "id": "9f8bab28-3bd4-4051-b1d6-298893b317f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:31:12.396207Z",
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
  "command_id": "65f061c3-7aed-44f3-8d34-8d6fcd2239a6",
  "quote_id": "9f8bab28-3bd4-4051-b1d6-298893b317f0",
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
  "id": "e703ad67-8958-415b-9555-0ef2b7ee1879",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.427844Z",
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
  "command_id": "68ce662e-901c-40ea-8ab9-e830856e8315",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T10:26:12Z"
}
```

```json
{
  "id": "cb5c0efe-40e7-4089-92a9-89beeca505cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:31:12.466163Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:26:12Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c311abe2-87b7-48d8-af98-285edcc4b138",
  "quote_id": "cb5c0efe-40e7-4089-92a9-89beeca505cd",
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
  "pickup_at": "2026-10-28T10:26:12Z"
}
```

```json
{
  "id": "47cfa5a8-9ab2-41c7-ae83-ec7f997e3951",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.498329Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:26:12Z",
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
  "command_id": "8e9f94da-ce9e-4b6f-902d-f15e72a64803",
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
  "id": "9158d4c0-640f-4612-8b45-813ec1a20393",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:31:12.532239Z",
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
  "command_id": "c50a51ab-20ec-4481-8343-6553481fa0bc",
  "quote_id": "9158d4c0-640f-4612-8b45-813ec1a20393",
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
  "correlation_id": "41f76fb9-e4db-4fc6-9eef-f916432ed8c6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "47cfa5a8-9ab2-41c7-ae83-ec7f997e3951",
      "short_number": 11,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
      "created_at": "2026-10-28T07:26:12.498329Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T10:26:12Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "e703ad67-8958-415b-9555-0ef2b7ee1879",
      "short_number": 10,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
      "created_at": "2026-10-28T07:26:12.427844Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
      "short_number": 9,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "e703ad67-8958-415b-9555-0ef2b7ee1879",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.427844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/9c8ab229-b514-42a8-9951-280b1a2bbb9c` → **200**

```json
{
  "id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
    "id": "80eb99e0-d65e-4cb6-9141-addc3b39c1d4",
    "order_id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c8ae71fe-3bfb-499b-8b96-a1ff4ae1cce1",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T07:26:12.281592Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9c8ab229-b514-42a8-9951-280b1a2bbb9c/cancel` → **200**

```json
{
  "command_id": "9e70119b-7202-4fec-8d57-a6999dc416e9",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
    "id": "80eb99e0-d65e-4cb6-9141-addc3b39c1d4",
    "order_id": "9c8ab229-b514-42a8-9951-280b1a2bbb9c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c8ae71fe-3bfb-499b-8b96-a1ff4ae1cce1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:26:12.281592Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/e703ad67-8958-415b-9555-0ef2b7ee1879` → **200**

```json
{
  "id": "e703ad67-8958-415b-9555-0ef2b7ee1879",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.427844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e703ad67-8958-415b-9555-0ef2b7ee1879/cancel` → **200**

```json
{
  "command_id": "9590e4e8-0dee-4144-984a-b2f5b4b4a7e5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e703ad67-8958-415b-9555-0ef2b7ee1879",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.427844Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/47cfa5a8-9ab2-41c7-ae83-ec7f997e3951` → **200**

```json
{
  "id": "47cfa5a8-9ab2-41c7-ae83-ec7f997e3951",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.498329Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:26:12Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/47cfa5a8-9ab2-41c7-ae83-ec7f997e3951/cancel` → **200**

```json
{
  "command_id": "0ee4bb6e-3925-44b9-95ed-8f3b7e4f42b1",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "47cfa5a8-9ab2-41c7-ae83-ec7f997e3951",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "09f5b9aa-a233-423c-a02c-a5572447edc5",
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
  "created_at": "2026-10-28T07:26:12.498329Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-28T10:26:12Z",
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
  "session_id": "0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6",
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
  "last_heartbeat_at": "2026-10-28T07:26:12.143065Z",
  "last_location_at": "2026-10-28T07:26:12.143065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bd2d1a5-527b-45c9-8b5a-ec81e080c3c6/close` → **200**

```json
{
  "command_id": "dee53425-a1a2-46b1-af78-b9d5c347215e",
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

Done: orders 9c8ab229-b514-42a8-9951-280b1a2bbb9c, e703ad67-8958-415b-9555-0ef2b7ee1879, 47cfa5a8-9ab2-41c7-ae83-ec7f997e3951.

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
  "session_id": "a0f6afbc-5dfe-4227-88fc-438631e0a9c5",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzMsImlhdCI6MTc5MzE3MjM3MywianRpIjoiOTBlZjUzYWYtNzU5ZC00ODY5LWFlMGEtNThhZjMzYmQxNzkzIiwic2lkIjoiYTBmNmFmYmMtNWRmZS00MjI3LTg4ZmMtNDM4NjMxZTBhOWM1In0.L-gttnsU6Z70XxM7yGw3nFNmnZ_BXtoCHVbWExrcohE",
  "access_expires_at": "2026-10-28T07:41:13.101687868Z",
  "refresh_token": "YXxUKa3CPjMBJkNGItq131YlDKLq5cZQwJcrLR8M8pE",
  "refresh_expires_at": "2026-10-28T19:26:13.101252304Z",
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
  "session_id": "5a29228e-8d11-4eff-8077-23dfe8f1f923",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzMsImlhdCI6MTc5MzE3MjM3MywianRpIjoiNDVhNTg1OWEtZWQ1Yi00MjVhLWIwYzAtNjRhMmUwZGE2NDkxIiwic2lkIjoiNWEyOTIyOGUtOGQxMS00ZWZmLTgwNzctMjNkZmU4ZjFmOTIzIn0.NL1RTdpFdO5ETJwAfvjIB_gN5qJl9-JHER53_TVC7sE",
  "access_expires_at": "2026-10-28T07:41:13.383289062Z",
  "refresh_token": "MydCWBE0ooFJd9XHuvIhILvVBL97vcYmxNMj4tdFu_M",
  "refresh_expires_at": "2026-10-28T19:26:13.382884895Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8131"
}
```

```json
{
  "challenge_id": "0dac71f1-f06d-4b5f-954e-283e4462a5b6",
  "expires_at": "2026-10-28T07:31:13.403851989Z",
  "resend_available_at": "2026-10-28T07:26:14.403851989Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "315205",
  "sent_at": "2026-10-28T07:26:13.417654514Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dac71f1-f06d-4b5f-954e-283e4462a5b6",
  "code": "315205",
  "device_ref": "sandbox-8131"
}
```

```json
{
  "session_id": "2e6f1a1d-860e-4c92-b848-8ba6cff30346",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI3MywiaWF0IjoxNzkzMTcyMzczLCJqdGkiOiI5M2VmMWZmMC0xMWMyLTQxN2ItYTUxZi01OTkyYTE2ZGZhZWYiLCJzaWQiOiIyZTZmMWExZC04NjBlLTRjOTItYjg0OC04YmE2Y2ZmMzAzNDYifQ.UzHnLOSPKKIXplGI_yPy5Nlc2FCD1jGFktFY0U_iK5o",
  "access_expires_at": "2026-10-28T07:41:13.464638548Z",
  "refresh_token": "76w3UaXmal_3_Ga4T4WzzV0g8UHHgEXZTRkgSFXNSUY",
  "refresh_expires_at": "2026-11-27T07:26:13.464192938Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:07.862809Z",
  "last_location_at": "2026-10-28T07:26:07.862809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/handover` → **200**

```json
{
  "command_id": "396b4faf-846d-4d79-983f-f934673c7465",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:07.862809Z",
  "last_location_at": "2026-10-28T07:26:07.862809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:13Z",
    "sequence": 1793172373537
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:13.552822Z",
  "last_location_at": "2026-10-28T07:26:13.552822Z",
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
  "command_id": "e10a776f-3b28-4c30-ade2-c16d3687559c",
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
  "effective_at": "2026-10-28T07:26:13.610762Z",
  "changed_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T07:26:13.650673683Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fd89b2f2-9a6e-47f6-a480-ffc0e8594511",
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
  "id": "0a667c80-f6b0-4147-9765-9a1942d28d0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:31:13.681211Z",
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
  "command_id": "e6a56fc8-f0dc-4a5c-857e-ebc2cc2bd7d6",
  "quote_id": "0a667c80-f6b0-4147-9765-9a1942d28d0c",
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
    "phone": "+3806711118393"
  }
}
```

```json
{
  "id": "6b250700-96e3-4338-905c-9279f5859ad7",
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
  "created_at": "2026-10-28T07:26:13.71362Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118393"
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
    "id": "5e75ed43-60c2-4e95-83e8-c5a57a347fa4",
    "order_id": "6b250700-96e3-4338-905c-9279f5859ad7",
    "expires_at": "2026-10-28T07:26:28.717383Z",
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

`POST /api/driver/v1/offers/5e75ed43-60c2-4e95-83e8-c5a57a347fa4/accept` → **200**

```json
{
  "command_id": "0f6c7ce2-c687-4793-87d0-0c3502c56d03"
}
```

```json
{
  "id": "fefd1aca-25e0-41ba-89f1-f723c0a38b0b",
  "order_id": "6b250700-96e3-4338-905c-9279f5859ad7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "95ff5955-93b9-4ec5-aa25-b428998644c2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "95ff5955-93b9-4ec5-aa25-b428998644c2",
  "order_id": "6b250700-96e3-4338-905c-9279f5859ad7",
  "assignment_id": "fefd1aca-25e0-41ba-89f1-f723c0a38b0b",
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
    "phone": "+3806711118393"
  }
}
```

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:13Z",
    "sequence": 1793172373804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:13.819757Z",
  "last_location_at": "2026-10-28T07:26:13.819757Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/95ff5955-93b9-4ec5-aa25-b428998644c2/arrive` → **200**

```json
{
  "command_id": "21775c4b-ffc9-4e54-93d8-d48ded61aab8",
  "expected_version": 0
}
```

```json
{
  "id": "95ff5955-93b9-4ec5-aa25-b428998644c2",
  "order_id": "6b250700-96e3-4338-905c-9279f5859ad7",
  "assignment_id": "fefd1aca-25e0-41ba-89f1-f723c0a38b0b",
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
  "arrived_at": "2026-10-28T07:26:13.860406Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118393"
  }
}
```

`POST /api/driver/v1/trips/95ff5955-93b9-4ec5-aa25-b428998644c2/start` → **200**

```json
{
  "command_id": "5418ad08-2dd7-4be2-9edf-a2b122771184",
  "expected_version": 1
}
```

```json
{
  "id": "95ff5955-93b9-4ec5-aa25-b428998644c2",
  "order_id": "6b250700-96e3-4338-905c-9279f5859ad7",
  "assignment_id": "fefd1aca-25e0-41ba-89f1-f723c0a38b0b",
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
  "arrived_at": "2026-10-28T07:26:13.860406Z",
  "started_at": "2026-10-28T07:26:13.895153Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118393"
  }
}
```

`POST /api/driver/v1/trips/95ff5955-93b9-4ec5-aa25-b428998644c2/complete` → **200**

```json
{
  "command_id": "88f91338-bea0-4ecf-921b-66ec9f4af9ca",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:26:13Z",
  "cash_received": true
}
```

```json
{
  "id": "95ff5955-93b9-4ec5-aa25-b428998644c2",
  "order_id": "6b250700-96e3-4338-905c-9279f5859ad7",
  "assignment_id": "fefd1aca-25e0-41ba-89f1-f723c0a38b0b",
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
  "arrived_at": "2026-10-28T07:26:13.860406Z",
  "started_at": "2026-10-28T07:26:13.895153Z",
  "completed_at": "2026-10-28T07:26:13.934535Z",
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
  "command_id": "68070e03-3d5c-43b7-a5ed-6c4d2d0aec1c",
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
  "id": "8228aefe-67d7-4852-9d9c-cec9d11819b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:31:13.971677Z",
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
  "command_id": "283e17f7-7bb4-4da8-8a18-d9e4c5962b8e",
  "quote_id": "8228aefe-67d7-4852-9d9c-cec9d11819b9",
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
    "phone": "+380671110671"
  }
}
```

```json
{
  "id": "0eefba19-3a7c-4f44-a449-3606a2ec9d83",
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
  "created_at": "2026-10-28T07:26:14.002893Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110671"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0eefba19-3a7c-4f44-a449-3606a2ec9d83` → **200**

```json
{
  "id": "0eefba19-3a7c-4f44-a449-3606a2ec9d83",
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
  "created_at": "2026-10-28T07:26:14.002893Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110671"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0eefba19-3a7c-4f44-a449-3606a2ec9d83/cancel` → **200**

```json
{
  "command_id": "ffc649f0-d8c0-4d51-ae1c-d4cee9c4f2dd",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0eefba19-3a7c-4f44-a449-3606a2ec9d83",
  "short_number": 13,
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
  "created_at": "2026-10-28T07:26:14.002893Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110671"
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
  "staff_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T07:26:14.062937Z",
  "last_entries": [
    {
      "order_id": "0eefba19-3a7c-4f44-a449-3606a2ec9d83",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T07:26:14.062937Z"
    },
    {
      "order_id": "6b250700-96e3-4338-905c-9279f5859ad7",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T07:26:13.939084Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c",
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
  "last_heartbeat_at": "2026-10-28T07:26:13.819757Z",
  "last_location_at": "2026-10-28T07:26:13.819757Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0b7c0f5-26f4-4ad6-b7d7-604f0416f69c/close` → **200**

```json
{
  "command_id": "75c219b8-4027-4b7a-93f5-ed55b79e3332",
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

Done: operator bonus for fulfilled 6b250700-96e3-4338-905c-9279f5859ad7 and operator-fault cancellation 0eefba19-3a7c-4f44-a449-3606a2ec9d83.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671351331",
  "device_ref": "sandbox-16362"
}
```

```json
{
  "challenge_id": "d6fcc097-4f9a-4e9f-b206-269136a25c82",
  "expires_at": "2026-10-28T07:31:16.196987381Z",
  "resend_available_at": "2026-10-28T07:26:17.196987381Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671351331` → **200**

```json
{
  "phone": "+380671351331",
  "audience": "CLIENT",
  "code": "153407",
  "sent_at": "2026-10-28T07:26:16.198807157Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674028822",
  "device_ref": "sandbox-30802",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "036ae415-ac78-4edd-a4e2-68987e2382ad",
  "expires_at": "2026-10-28T07:31:16.24451396Z",
  "resend_available_at": "2026-10-28T07:26:17.24451396Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674028822` → **200**

```json
{
  "phone": "+380674028822",
  "audience": "CLIENT",
  "code": "474541",
  "sent_at": "2026-10-28T07:26:16.246257666Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676060000",
  "device_ref": "sandbox-27640"
}
```

```json
{
  "challenge_id": "6e7c6b00-5ded-48fb-b973-4aa17e5e83cd",
  "expires_at": "2026-10-28T07:31:16.291639356Z",
  "resend_available_at": "2026-10-28T07:26:17.291639356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676060000` → **200**

```json
{
  "phone": "+380676060000",
  "audience": "CLIENT",
  "code": "068824",
  "sent_at": "2026-10-28T07:26:16.293813403Z",
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
  "session_id": "7a4c9f13-a530-4590-a644-db9d132eb673",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzYsImlhdCI6MTc5MzE3MjM3NiwianRpIjoiZDQzOTRkNTMtYjcyYy00MmRmLTk3YmYtZmM4MjY3MDJkYzEzIiwic2lkIjoiN2E0YzlmMTMtYTUzMC00NTkwLWE2NDQtZGI5ZDEzMmViNjczIn0.jS2GX-d_Si0tBpPi4Kkdwoo7mQr9worSAg9PqGQ1NOY",
  "access_expires_at": "2026-10-28T07:41:16.597798751Z",
  "refresh_token": "Ex3PnHW8PuhwdEexUR1rGkSKMzpg4YxfAF9AHgVs7Iw",
  "refresh_expires_at": "2026-10-28T19:26:16.597364088Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676060000` → **200**

```json
{
  "deliveries": [
    {
      "id": "6295d7e0-2808-4be1-aad5-3191d82522d5",
      "challenge_id": "6e7c6b00-5ded-48fb-b973-4aa17e5e83cd",
      "phone": "+380676060000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2312f2c3-975d-4cf2-af3b-c04f8758c250",
      "error": null,
      "attempted_at": "2026-10-28T07:26:16.294006Z"
    },
    {
      "id": "ad6028ae-15c2-43e2-bc0a-b28b754352cb",
      "challenge_id": "6e7c6b00-5ded-48fb-b973-4aa17e5e83cd",
      "phone": "+380676060000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T07:26:16.293382Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676060000` → **200**

```json
{
  "phone": "+380676060000",
  "audience": "CLIENT",
  "code": "068824",
  "sent_at": "2026-10-28T07:26:16.293813403Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674028822` → **200**

```json
{
  "deliveries": [
    {
      "id": "db4a8a15-1483-41ce-bdec-dc30eca2dff4",
      "challenge_id": "036ae415-ac78-4edd-a4e2-68987e2382ad",
      "phone": "+380674028822",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f37c3b92-08d1-4105-a837-736c8f13b23e",
      "error": null,
      "attempted_at": "2026-10-28T07:26:16.246441Z"
    }
  ]
}
```

Done: SMS to +380671351331, a call to +380674028822, SMS then a call to +380676060000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634294304",
  "device_ref": "sandbox-6013"
}
```

```json
{
  "challenge_id": "27e3b1aa-de18-4843-9c3f-d047ade39e3b",
  "expires_at": "2026-10-28T07:31:16.705857127Z",
  "resend_available_at": "2026-10-28T07:26:17.705857127Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634294304` → **200**

```json
{
  "phone": "+380634294304",
  "audience": "CLIENT",
  "code": "134573",
  "sent_at": "2026-10-28T07:26:16.707616512Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27e3b1aa-de18-4843-9c3f-d047ade39e3b",
  "code": "134573",
  "device_ref": "sandbox-6013"
}
```

```json
{
  "session_id": "eabf8ee7-fdc5-47b1-8667-e49fd133aebc",
  "subject": {
    "type": "CLIENT",
    "id": "c2be649b-81f5-4c02-ab43-64523b33dfa6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmJlNjQ5Yi04MWY1LTRjMDItYWI0My02NDUyM2IzM2RmYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjc2LCJpYXQiOjE3OTMxNzIzNzYsImp0aSI6Ijc5OGI4ZjdhLTg2YmMtNDhlYS04ZWUwLWMzZDZiMGUxMDU5ZiIsInNpZCI6ImVhYmY4ZWU3LWZkYzUtNDdiMS04NjY3LWU0OWZkMTMzYWViYyJ9.45aRqvrCGSIatLfIuIwwg6qx8QMIRxiQgP7L7wvq6b4",
  "access_expires_at": "2026-10-28T07:41:16.762187485Z",
  "refresh_token": "9zpdF2ri9ris4SPx9anJhWaqo5ttKkoG3Y8zafvM8X4",
  "refresh_expires_at": "2026-11-27T07:26:16.761770168Z",
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
  "session_id": "1f46d5d4-3f8d-49ae-83b6-ca869a2e257e",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzcsImlhdCI6MTc5MzE3MjM3NywianRpIjoiNDQ4MDBhOGUtYjMwYS00ZGM1LWExMWItZDJkZmM2ZTU4NzYzIiwic2lkIjoiMWY0NmQ1ZDQtM2Y4ZC00OWFlLTgzYjYtY2E4NjlhMmUyNTdlIn0.xzs3EzPMqY2waFyfMbVrQHqbg52qUJNUO0ZPfVJ9Jlg",
  "access_expires_at": "2026-10-28T07:41:17.126747998Z",
  "refresh_token": "rQjKqSqaI0_ikOsuaqyv6Bf-h0Aa60zObjUOssvSVg8",
  "refresh_expires_at": "2026-10-28T19:26:17.126285603Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634294304` → **200**

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
  "correlation_id": "74913329-b0ba-423f-9dd3-f06affdfff52"
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
  "session_id": "1b5a8954-b2b0-4c6e-accc-f85b0e136396",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzcsImlhdCI6MTc5MzE3MjM3NywianRpIjoiNTZmYzEzNWUtNjRjOS00ZjY5LThkNTUtODZhNDM1YzFjNWFhIiwic2lkIjoiMWI1YTg5NTQtYjJiMC00YzZlLWFjY2MtZjg1YjBlMTM2Mzk2In0.BUEWMPNeqyFJBNU9udPuNOJUekgKngpxZUXvAWPLJqA",
  "access_expires_at": "2026-10-28T07:41:17.470641001Z",
  "refresh_token": "9U1QVvXsiViyjYw3zx92xk51MlOH_RHAfKaX7fdajXI",
  "refresh_expires_at": "2026-10-28T19:26:17.470213698Z",
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
  "command_id": "01edebc4-017e-4313-a4b6-49520240a7ff",
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
  "changed_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T07:26:17.529745177Z"
}
```

## The rider books the airport for 2026-10-28T10:26:17Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600266051",
  "device_ref": "sandbox-28693"
}
```

```json
{
  "challenge_id": "66dbb530-57b0-453c-8ae8-014433b2e5c9",
  "expires_at": "2026-10-28T07:31:17.556523011Z",
  "resend_available_at": "2026-10-28T07:26:18.556523011Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600266051` → **200**

```json
{
  "phone": "+48600266051",
  "audience": "CLIENT",
  "code": "702032",
  "sent_at": "2026-10-28T07:26:17.559226534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66dbb530-57b0-453c-8ae8-014433b2e5c9",
  "code": "702032",
  "device_ref": "sandbox-28693"
}
```

```json
{
  "session_id": "f088dd02-764c-4b0f-b947-08f6a8c849dc",
  "subject": {
    "type": "CLIENT",
    "id": "d374c108-1ab2-46a5-b0b8-9c27f42a6eb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzc0YzEwOC0xYWIyLTQ2YTUtYjBiOC05YzI3ZjQyYTZlYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjc3LCJpYXQiOjE3OTMxNzIzNzcsImp0aSI6Ijc0YjM5ZTk3LWI3MjctNGNhNy05YjYyLTNjNmRlYjJjNGVmNiIsInNpZCI6ImYwODhkZDAyLTc2NGMtNGIwZi1iOTQ3LTA4ZjZhOGM4NDlkYyJ9.tc7d1qNsyA169DfmXKm1pMGoK6zqNXnU8suATut-BhM",
  "access_expires_at": "2026-10-28T07:41:17.608942851Z",
  "refresh_token": "CqeA9a0HyMEItYILosCyy-rpZEPQ_27g5J3mJ9N8NSk",
  "refresh_expires_at": "2026-11-27T07:26:17.608515308Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "564fd94a-3e79-45a2-8630-4cc261f16040",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T10:26:17Z"
}
```

```json
{
  "id": "d29aa244-0a5a-45f2-93cf-f711b1ca902b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T07:31:17.640513Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:26:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7cf45350-a359-49ab-844c-f50e3c9c5a56",
  "quote_id": "d29aa244-0a5a-45f2-93cf-f711b1ca902b",
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
  "pickup_at": "2026-10-28T10:26:17Z"
}
```

```json
{
  "id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d374c108-1ab2-46a5-b0b8-9c27f42a6eb0",
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
  "created_at": "2026-10-28T07:26:17.671956Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:26:17Z",
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
  "device_ref": "sandbox-27192"
}
```

```json
{
  "challenge_id": "11c6f002-47cd-4ba3-b20e-f390523cecd1",
  "expires_at": "2026-10-28T07:31:17.698789284Z",
  "resend_available_at": "2026-10-28T07:26:18.698789284Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "435604",
  "sent_at": "2026-10-28T07:26:17.700556851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11c6f002-47cd-4ba3-b20e-f390523cecd1",
  "code": "435604",
  "device_ref": "sandbox-27192"
}
```

```json
{
  "session_id": "8f476a9f-0f7c-49da-adc1-b370a03d3c8c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI3NywiaWF0IjoxNzkzMTcyMzc3LCJqdGkiOiJhYTBiMDFkZi00ODUxLTQxNGMtYTMyZi0xNzE3MWM1OWY2Y2IiLCJzaWQiOiI4ZjQ3NmE5Zi0wZjdjLTQ5ZGEtYWRjMS1iMzcwYTAzZDNjOGMifQ.XmOHIuMZMSq_H4zcBAgaOGD5Av2Zwkqae8bxKAAOCBA",
  "access_expires_at": "2026-10-28T07:41:17.746605559Z",
  "refresh_token": "Jgod6l5fYSTDiojAb9pyLf8dK9Pb2LDdQm2zbM-jOTg",
  "refresh_expires_at": "2026-11-27T07:26:17.74616078Z",
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
  "command_id": "bcea8a36-1a68-4238-8a75-6c645786cd3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:17Z",
    "sequence": 1793172377788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "17aa4c6d-0b23-45e5-9089-c9024a360976",
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
  "last_heartbeat_at": "2026-10-28T07:26:17.803018Z",
  "last_location_at": "2026-10-28T07:26:17.803018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
      "short_number": 14,
      "pickup_at": "2026-10-28T10:26:17Z",
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

`POST /api/driver/v1/preorders/b3deb10e-ed67-4d16-b706-f6264ae589d1/reserve` → **200**

```json
{
  "command_id": "143eed71-b8c0-46cf-bd7b-fc59c79432dc"
}
```

```json
{
  "id": "da417309-d884-4a2e-994c-3bd5addf2cb7",
  "state": "RESERVED",
  "order": {
    "order_id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
    "short_number": 14,
    "pickup_at": "2026-10-28T10:26:17Z",
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
  "reserved_at": "2026-10-28T07:26:17.860799Z",
  "confirm_from": "2026-10-28T09:56:17Z",
  "confirm_until": "2026-10-28T10:06:17Z",
  "drop_until": "2026-10-28T09:26:17Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "da417309-d884-4a2e-994c-3bd5addf2cb7",
      "state": "RESERVED",
      "order": {
        "order_id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
        "short_number": 14,
        "pickup_at": "2026-10-28T10:26:17Z",
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
      "reserved_at": "2026-10-28T07:26:17.860799Z",
      "confirm_from": "2026-10-28T09:56:17Z",
      "confirm_until": "2026-10-28T10:06:17Z",
      "drop_until": "2026-10-28T09:26:17Z"
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
      "id": "da417309-d884-4a2e-994c-3bd5addf2cb7",
      "state": "RESERVED",
      "order": {
        "order_id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
        "short_number": 14,
        "pickup_at": "2026-10-28T10:26:17Z",
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
      "reserved_at": "2026-10-28T07:26:17.860799Z",
      "confirm_from": "2026-10-28T09:56:17Z",
      "confirm_until": "2026-10-28T10:06:17Z",
      "drop_until": "2026-10-28T09:26:17Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/da417309-d884-4a2e-994c-3bd5addf2cb7/confirm` → **409**

```json
{
  "command_id": "8fad198d-dca0-4f87-aaa9-f1e6e2a525db"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/da417309-d884-4a2e-994c-3bd5addf2cb7/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0f2acd7e-517e-498a-be18-05a88b579b2c"
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
  "session_id": "b60453ea-21d1-4ab1-8885-f9dff9b93195",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzgsImlhdCI6MTc5MzE3MjM3OCwianRpIjoiODI4ZTIyYTYtMGE2My00YjhlLTgwMjItNzBiMTBhOTdhNzE4Iiwic2lkIjoiYjYwNDUzZWEtMjFkMS00YWIxLTg4ODUtZjlkZmY5YjkzMTk1In0.I10AWrYfW5iIc9NEpFFM9cLI2J0dYNeDIvpP8iAyIn0",
  "access_expires_at": "2026-10-28T07:41:18.228093154Z",
  "refresh_token": "1c4OUnU7kBAUaefAdY8LvjeeqRZCgQYqBgKYVSeXXEs",
  "refresh_expires_at": "2026-10-28T19:26:18.227648926Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b3deb10e-ed67-4d16-b706-f6264ae589d1` → **200**

```json
{
  "id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d374c108-1ab2-46a5-b0b8-9c27f42a6eb0",
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
  "created_at": "2026-10-28T07:26:17.671956Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T10:26:17Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "da417309-d884-4a2e-994c-3bd5addf2cb7",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T07:26:17.860799Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b3deb10e-ed67-4d16-b706-f6264ae589d1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T07:26:17.672863Z",
      "actor": {
        "type": "CLIENT",
        "id": "d374c108-1ab2-46a5-b0b8-9c27f42a6eb0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
        "preorder": true,
        "quote_id": "d29aa244-0a5a-45f2-93cf-f711b1ca902b",
        "pickup_at": "2026-10-28T10:26:17Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T07:26:17.861684Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b3deb10e-ed67-4d16-b706-f6264ae589d1",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "da417309-d884-4a2e-994c-3bd5addf2cb7"
      }
    }
  ]
}
```

Done: pre-order b3deb10e-ed67-4d16-b706-f6264ae589d1, reservation da417309-d884-4a2e-994c-3bd5addf2cb7.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10354"
}
```

```json
{
  "challenge_id": "3a9b7a4e-d16a-417c-a349-430bbd7b0648",
  "expires_at": "2026-10-28T07:31:18.30530061Z",
  "resend_available_at": "2026-10-28T07:26:19.30530061Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "312103",
  "sent_at": "2026-10-28T07:26:18.306967741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a9b7a4e-d16a-417c-a349-430bbd7b0648",
  "code": "312103",
  "device_ref": "sandbox-10354"
}
```

```json
{
  "session_id": "82285092-fae0-4b0b-8e7e-ea7ab5b8bddf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI3OCwiaWF0IjoxNzkzMTcyMzc4LCJqdGkiOiJjOWQzNTY0ZS0wNjRiLTRmZjktYjBiZC1kZWQyMzAyOTg3MGEiLCJzaWQiOiI4MjI4NTA5Mi1mYWUwLTRiMGItOGU3ZS1lYTdhYjViOGJkZGYifQ.B34N8oS9Ypdm7rWcfZqkD-OZtZZpkeF_saOCfDfE8EU",
  "access_expires_at": "2026-10-28T07:41:18.353426541Z",
  "refresh_token": "V5KbIa4_yWQ92nlvjFL5g2LFrC1efNXmwuW98pukjoM",
  "refresh_expires_at": "2026-11-27T07:26:18.353044377Z",
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
  "command_id": "ec6c5f4a-1aeb-4577-abda-8cff78cc3f84",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:18Z",
    "sequence": 1793172378395
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fba8025a-9f2e-454d-8c3d-6a1f85bbc61c",
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
  "last_heartbeat_at": "2026-10-28T07:26:18.410166Z",
  "last_location_at": "2026-10-28T07:26:18.410166Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675372787",
  "device_ref": "sandbox-19628"
}
```

```json
{
  "challenge_id": "b7ab591c-a1d1-4790-b674-6083c7f0947d",
  "expires_at": "2026-10-28T07:31:18.434543294Z",
  "resend_available_at": "2026-10-28T07:26:19.434543294Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675372787` → **200**

```json
{
  "phone": "+380675372787",
  "audience": "CLIENT",
  "code": "675624",
  "sent_at": "2026-10-28T07:26:18.436278086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7ab591c-a1d1-4790-b674-6083c7f0947d",
  "code": "675624",
  "device_ref": "sandbox-19628"
}
```

```json
{
  "session_id": "d686998d-f70c-4308-96b4-7d5f46a5bb4d",
  "subject": {
    "type": "CLIENT",
    "id": "16461153-c152-4bfa-a8ac-02470b5caeee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjQ2MTE1My1jMTUyLTRiZmEtYThhYy0wMjQ3MGI1Y2FlZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjc4LCJpYXQiOjE3OTMxNzIzNzgsImp0aSI6IjI3OGNiZjE5LTFmMzMtNGE4Yy1iZWIwLTRkMTViMDI1ZjE3ZSIsInNpZCI6ImQ2ODY5OThkLWY3MGMtNDMwOC05NmI0LTdkNWY0NmE1YmI0ZCJ9.pQvWMiZXMqEVFjWQ6kv_Ch0AScVYf0d1J9hA61ONAKA",
  "access_expires_at": "2026-10-28T07:41:18.484800112Z",
  "refresh_token": "8le7twa5SD7W7OuIHMmJbBt7JlNhy_StSYg0l881tAg",
  "refresh_expires_at": "2026-11-27T07:26:18.48432627Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa133b3a-876e-4a42-9e59-dde0e236ce44",
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
  "id": "a46a2803-a686-400b-9dbf-b96713b7efff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:31:18.517011Z",
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
  "command_id": "5ae3d0d6-2d14-413b-a487-fb7510cd54c5",
  "quote_id": "a46a2803-a686-400b-9dbf-b96713b7efff",
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
  "id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "16461153-c152-4bfa-a8ac-02470b5caeee",
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
  "created_at": "2026-10-28T07:26:18.547181Z",
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
    "id": "26d368ef-b38d-4388-b7e9-9c46b5829cce",
    "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
    "expires_at": "2026-10-28T07:26:33.549384Z",
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

`POST /api/driver/v1/offers/26d368ef-b38d-4388-b7e9-9c46b5829cce/accept` → **200**

```json
{
  "command_id": "43e0de85-b6db-4f99-96f5-47f3034c2508"
}
```

```json
{
  "id": "6caa33e5-bf86-437b-bb86-6ff09697b36a",
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8761e3ce-6d55-41f8-b976-56a521a21a99",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8761e3ce-6d55-41f8-b976-56a521a21a99",
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "assignment_id": "6caa33e5-bf86-437b-bb86-6ff09697b36a",
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

`POST /api/driver/v1/work-sessions/fba8025a-9f2e-454d-8c3d-6a1f85bbc61c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:18Z",
    "sequence": 1793172378635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fba8025a-9f2e-454d-8c3d-6a1f85bbc61c",
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
  "last_heartbeat_at": "2026-10-28T07:26:18.650734Z",
  "last_location_at": "2026-10-28T07:26:18.650734Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8761e3ce-6d55-41f8-b976-56a521a21a99",
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "assignment_id": "6caa33e5-bf86-437b-bb86-6ff09697b36a",
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

`POST /api/driver/v1/trips/8761e3ce-6d55-41f8-b976-56a521a21a99/arrive` → **200**

```json
{
  "command_id": "f3686b27-5ea7-498a-9aa5-79005ebb5491",
  "expected_version": 0
}
```

```json
{
  "id": "8761e3ce-6d55-41f8-b976-56a521a21a99",
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "assignment_id": "6caa33e5-bf86-437b-bb86-6ff09697b36a",
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
  "arrived_at": "2026-10-28T07:26:18.692377Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8761e3ce-6d55-41f8-b976-56a521a21a99/start` → **200**

```json
{
  "command_id": "f9284515-08b7-4c4d-aff3-5a1781d19d88",
  "expected_version": 1
}
```

```json
{
  "id": "8761e3ce-6d55-41f8-b976-56a521a21a99",
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "assignment_id": "6caa33e5-bf86-437b-bb86-6ff09697b36a",
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
  "arrived_at": "2026-10-28T07:26:18.692377Z",
  "started_at": "2026-10-28T07:26:18.720088Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fba8025a-9f2e-454d-8c3d-6a1f85bbc61c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:18Z",
    "sequence": 1793172378739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fba8025a-9f2e-454d-8c3d-6a1f85bbc61c",
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
  "last_heartbeat_at": "2026-10-28T07:26:18.754753Z",
  "last_location_at": "2026-10-28T07:26:18.754753Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/8761e3ce-6d55-41f8-b976-56a521a21a99/complete` → **200**

```json
{
  "command_id": "a0ba8933-0fcc-4a3a-a5d5-9c259d69a784",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:26:18Z",
  "cash_received": true
}
```

```json
{
  "id": "8761e3ce-6d55-41f8-b976-56a521a21a99",
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "assignment_id": "6caa33e5-bf86-437b-bb86-6ff09697b36a",
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
  "arrived_at": "2026-10-28T07:26:18.692377Z",
  "started_at": "2026-10-28T07:26:18.720088Z",
  "completed_at": "2026-10-28T07:26:18.78177Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa/rating` → **200**

```json
{
  "command_id": "1a821b35-ceee-4936-bbf5-cb15adbc5a4c",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "score": 5,
  "created_at": "2026-10-28T07:26:18.82508334Z"
}
```

`POST /api/driver/v1/orders/f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa/rating` → **200**

```json
{
  "command_id": "5df1779f-de06-458b-928b-96856504ccd9",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
  "score": 4,
  "created_at": "2026-10-28T07:26:18.855476828Z"
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
  "session_id": "80d756a6-4eef-4e35-9de9-9ead23d58b04",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzksImlhdCI6MTc5MzE3MjM3OSwianRpIjoiZmM3ZGI2YjgtOGZlMS00MjY3LTlhNGMtOTgxOTZmM2E5MDQyIiwic2lkIjoiODBkNzU2YTYtNGVlZi00ZTM1LTlkZTktOWVhZDIzZDU4YjA0In0.tDpUpgAT2QoX5oEUG8PIGLrCF6aX0Zuf_prObpCHyaw",
  "access_expires_at": "2026-10-28T07:41:19.168893614Z",
  "refresh_token": "JlH9YDltN8fUyVh9MZYMujWkVgLfjs7Vtzi9jpHBWs0",
  "refresh_expires_at": "2026-10-28T19:26:19.168455065Z",
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
  "session_id": "c2b36168-66e5-4090-bc69-c3da52d56c34",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzksImlhdCI6MTc5MzE3MjM3OSwianRpIjoiMGE4ZmQ5YmEtMTllZi00ODU3LWJmOTEtYjAzODBhZTgwMTM3Iiwic2lkIjoiYzJiMzYxNjgtNjZlNS00MDkwLWJjNjktYzNkYTUyZDU2YzM0In0.Lj-e36CEoQNRW4pK5G1IWtN81rMZFXAnfzCvwfwJALE",
  "access_expires_at": "2026-10-28T07:41:19.450368575Z",
  "refresh_token": "9aqhHbi4-vLi5pWkCYjC6mqTDhRRQe4Nm3ihg34HLjs",
  "refresh_expires_at": "2026-10-28T19:26:19.449936601Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
      "author_type": "RIDER",
      "author_id": "16461153-c152-4bfa-a8ac-02470b5caeee",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T07:26:18.825083Z"
    },
    {
      "order_id": "f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "16461153-c152-4bfa-a8ac-02470b5caeee",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T07:26:18.855477Z"
    }
  ]
}
```

Done: ratings for order f8dca390-b2cd-4c4b-9069-cf6eb7f59ffa.

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
  "session_id": "02e5b70f-2f7b-4c9a-87bc-619b525812b2",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyNzksImlhdCI6MTc5MzE3MjM3OSwianRpIjoiN2YxZDQ2NzEtOTUyZi00NjM0LTllMzYtZDMyY2FiMzYzYWY2Iiwic2lkIjoiMDJlNWI3MGYtMmY3Yi00YzlhLTg3YmMtNjE5YjUyNTgxMmIyIn0.Jiqrn92jfnUET99ysUT0HS31S6qw3o5cnqetofonGg4",
  "access_expires_at": "2026-10-28T07:41:19.77606631Z",
  "refresh_token": "_7yFBBB1ZkuAYFQqh2XSPr6D2J5uyuAJhOE1ERg0Tck",
  "refresh_expires_at": "2026-10-28T19:26:19.775638166Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "9ba1e675-8291-4cc5-95b1-6bfb92b05312",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "41caf70f-ba19-403e-aa30-6a2a25f4de5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:19.810174Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/41caf70f-ba19-403e-aa30-6a2a25f4de5c` → **200**

```json
{
  "id": "41caf70f-ba19-403e-aa30-6a2a25f4de5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:19.810174Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/41caf70f-ba19-403e-aa30-6a2a25f4de5c` → **200**

```json
{
  "id": "41caf70f-ba19-403e-aa30-6a2a25f4de5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:19.810174Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/41caf70f-ba19-403e-aa30-6a2a25f4de5c` → **200**

```json
{
  "id": "41caf70f-ba19-403e-aa30-6a2a25f4de5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:19.810174Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/41caf70f-ba19-403e-aa30-6a2a25f4de5c` → **200**

```json
{
  "id": "41caf70f-ba19-403e-aa30-6a2a25f4de5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:19.810174Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/41caf70f-ba19-403e-aa30-6a2a25f4de5c` → **200**

```json
{
  "id": "41caf70f-ba19-403e-aa30-6a2a25f4de5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:19.810174Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/41caf70f-ba19-403e-aa30-6a2a25f4de5c` → **200**

```json
{
  "id": "41caf70f-ba19-403e-aa30-6a2a25f4de5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:26:19.810174Z",
  "ready_at": "2026-10-28T07:26:24.111767Z",
  "expires_at": "2026-10-29T07:26:24.111767Z"
}
```

`GET /api/admin/v1/reports/exports/41caf70f-ba19-403e-aa30-6a2a25f4de5c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,14,6,8,0,0,11,3,0,12,1,0,1,4,1,3
total,14,6,8,0,0,11,3,0,12,1,0,1,4,1,3
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3a2dcf47-dbb8-4a53-bf05-aa50c151d414",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "04f9d863-403f-4f15-adf3-538be1829e09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:25.004287Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/04f9d863-403f-4f15-adf3-538be1829e09` → **200**

```json
{
  "id": "04f9d863-403f-4f15-adf3-538be1829e09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:25.004287Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/04f9d863-403f-4f15-adf3-538be1829e09` → **200**

```json
{
  "id": "04f9d863-403f-4f15-adf3-538be1829e09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:25.004287Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/04f9d863-403f-4f15-adf3-538be1829e09` → **200**

```json
{
  "id": "04f9d863-403f-4f15-adf3-538be1829e09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:25.004287Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/04f9d863-403f-4f15-adf3-538be1829e09` → **200**

```json
{
  "id": "04f9d863-403f-4f15-adf3-538be1829e09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:25.004287Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/04f9d863-403f-4f15-adf3-538be1829e09` → **200**

```json
{
  "id": "04f9d863-403f-4f15-adf3-538be1829e09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "RUNNING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:26:25.004287Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/04f9d863-403f-4f15-adf3-538be1829e09` → **200**

```json
{
  "id": "04f9d863-403f-4f15-adf3-538be1829e09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:26:25.004287Z",
  "ready_at": "2026-10-28T07:26:29.118502Z",
  "expires_at": "2026-10-29T07:26:29.118502Z"
}
```

`GET /api/admin/v1/reports/exports/04f9d863-403f-4f15-adf3-538be1829e09/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/b2200d8a-b1f8-4c93-a3c6-38914af15acd` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/b2200d8a-b1f8-4c93-a3c6-38914af15acd",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b7f6ce5d-6118-406a-a6d3-650b4a9ae407"
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
  "session_id": "28e7c4a0-8b49-4099-8995-a3827cb9c3e6",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyOTAsImlhdCI6MTc5MzE3MjM5MCwianRpIjoiZTU1NzM1ZWQtYTlkZC00OTVlLWFjYWItOWUwMTA2MjJkZGExIiwic2lkIjoiMjhlN2M0YTAtOGI0OS00MDk5LTg5OTUtYTM4MjdjYjljM2U2In0.oUwiAGJtLu-CGMm8m7_INfhQc4_xlkmdiUMJ_tMu1XA",
  "access_expires_at": "2026-10-28T07:41:30.481026479Z",
  "refresh_token": "8hlQCbeJpVP1wE57SUAMh0vw9r2QzdUa13WvmJp94Go",
  "refresh_expires_at": "2026-10-28T19:26:30.480618245Z",
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
  "command_id": "42725458-81e7-4857-9362-63c46ff3177a",
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
  "changed_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:26:30.539193Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "42725458-81e7-4857-9362-63c46ff3177a",
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
  "changed_by": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:26:30.539193Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48871313026",
  "device_ref": "sandbox-28882"
}
```

```json
{
  "challenge_id": "d8afcd33-6e9b-4f86-b74e-60844632de9c",
  "expires_at": "2026-10-28T07:31:30.605019998Z",
  "resend_available_at": "2026-10-28T07:26:31.605019998Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48871313026` → **200**

```json
{
  "phone": "+48871313026",
  "audience": "CLIENT",
  "code": "838810",
  "sent_at": "2026-10-28T07:26:30.606834294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8afcd33-6e9b-4f86-b74e-60844632de9c",
  "code": "838810",
  "device_ref": "sandbox-28882"
}
```

```json
{
  "session_id": "3314794d-4148-4858-88a0-2d0537ecd613",
  "subject": {
    "type": "CLIENT",
    "id": "e3fbc92f-059c-4368-8f95-1d97396734fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlM2ZiYzkyZi0wNTljLTQzNjgtOGY5NS0xZDk3Mzk2NzM0ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjkwLCJpYXQiOjE3OTMxNzIzOTAsImp0aSI6IjUyZjJiMTA5LTk2MTctNDRhZS1iOTljLTQyY2FmN2ZjYzY2MCIsInNpZCI6IjMzMTQ3OTRkLTQxNDgtNDg1OC04OGEwLTJkMDUzN2VjZDYxMyJ9.Mcz7HrEVfWMCeSwObyrs6ohtzfY_6h28dJH4mQsNMlQ",
  "access_expires_at": "2026-10-28T07:41:30.652801646Z",
  "refresh_token": "v7aYEaeTNifzpawORX3iDnUmkEimQy1eK1erfy9zflo",
  "refresh_expires_at": "2026-11-27T07:26:30.652362927Z",
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
  "correlation_id": "d8617d1d-1d7f-4d1c-9b99-896bccb967d4"
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
  "device_ref": "sandbox-28664"
}
```

```json
{
  "challenge_id": "7b7c6396-82fb-465d-ad19-13e13b4825e2",
  "expires_at": "2026-10-28T07:31:30.721139595Z",
  "resend_available_at": "2026-10-28T07:26:31.721139595Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "505454",
  "sent_at": "2026-10-28T07:26:30.722905779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b7c6396-82fb-465d-ad19-13e13b4825e2",
  "code": "505454",
  "device_ref": "sandbox-28664"
}
```

```json
{
  "session_id": "66e77f4c-85c0-43cf-89cc-e55aa6df1272",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI5MCwiaWF0IjoxNzkzMTcyMzkwLCJqdGkiOiJjYTg0OTliNi03YjU5LTRiYzYtYjlhZC0wNjE2YTk1MGYxYWIiLCJzaWQiOiI2NmU3N2Y0Yy04NWMwLTQzY2YtODljYy1lNTVhYTZkZjEyNzIifQ.Nx3U3g4l86VG6yB6hA7NkQmd3_asIfLqagGJ5ncwj6I",
  "access_expires_at": "2026-10-28T07:41:30.769045305Z",
  "refresh_token": "6FlGEP11In6D0kGwq1rVfPEmWM4nartIcg62eKi2xn0",
  "refresh_expires_at": "2026-11-27T07:26:30.76863623Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "17aa4c6d-0b23-45e5-9089-c9024a360976",
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
  "last_heartbeat_at": "2026-10-28T07:26:17.803018Z",
  "last_location_at": "2026-10-28T07:26:17.803018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17aa4c6d-0b23-45e5-9089-c9024a360976/handover` → **200**

```json
{
  "command_id": "dd24ca9c-d483-41d9-9795-92069e5a8405",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "17aa4c6d-0b23-45e5-9089-c9024a360976",
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
  "last_heartbeat_at": "2026-10-28T07:26:17.803018Z",
  "last_location_at": "2026-10-28T07:26:17.803018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17aa4c6d-0b23-45e5-9089-c9024a360976/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:30Z",
    "sequence": 1793172390838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "17aa4c6d-0b23-45e5-9089-c9024a360976",
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
  "last_heartbeat_at": "2026-10-28T07:26:30.854588Z",
  "last_location_at": "2026-10-28T07:26:30.854588Z",
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
  "session_id": "17aa4c6d-0b23-45e5-9089-c9024a360976",
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
  "last_heartbeat_at": "2026-10-28T07:26:30.854588Z",
  "last_location_at": "2026-10-28T07:26:30.854588Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17aa4c6d-0b23-45e5-9089-c9024a360976/close` → **200**

```json
{
  "command_id": "d2d87b51-e2a0-4aa1-b4b6-8a50751d5fac",
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
  "correlation_id": "68d5c324-fad6-48a4-9331-52b221028849"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677454309",
  "device_ref": "sandbox-15292"
}
```

```json
{
  "challenge_id": "94bafa8f-84f7-435c-86b8-ded412bca0f3",
  "expires_at": "2026-10-28T07:31:30.988610452Z",
  "resend_available_at": "2026-10-28T07:26:31.988610452Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677454309` → **200**

```json
{
  "phone": "+380677454309",
  "audience": "CLIENT",
  "code": "933170",
  "sent_at": "2026-10-28T07:26:30.990304443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94bafa8f-84f7-435c-86b8-ded412bca0f3",
  "code": "933170",
  "device_ref": "sandbox-15292"
}
```

```json
{
  "session_id": "9d9daffb-310e-4ae2-8008-103154ddf308",
  "subject": {
    "type": "CLIENT",
    "id": "1b8dd055-52f1-4bfb-a74a-88e87de55560"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjhkZDA1NS01MmYxLTRiZmItYTc0YS04OGU4N2RlNTU1NjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTczMjkxLCJpYXQiOjE3OTMxNzIzOTEsImp0aSI6IjcyZDlkYTViLWQwOGYtNDAxZC05NzM4LWFlYWNmZDFlODcxZCIsInNpZCI6IjlkOWRhZmZiLTMxMGUtNGFlMi04MDA4LTEwMzE1NGRkZjMwOCJ9.glc7JkR6K8P4hEEDGnZq2OGedkdS_tI9Tm_LWnYIxGI",
  "access_expires_at": "2026-10-28T07:41:31.03701381Z",
  "refresh_token": "_aM7rmmOFuIGXn-Yc5N4BB3y4yyQdI8vHhldhBeWQis",
  "refresh_expires_at": "2026-11-27T07:26:31.036590344Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "656342d8-49d3-4937-9b68-2038ba92ab8f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "fcda0493-4145-4e74-9b62-407b5855354e",
  "upload_path": "/api/rider/v1/uploads/fcda0493-4145-4e74-9b62-407b5855354e",
  "expires_at": "2026-10-28T07:41:31.068462649Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/fcda0493-4145-4e74-9b62-407b5855354e` → **200**

```json
{
  "file_id": "fcda0493-4145-4e74-9b62-407b5855354e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "8ef5b768-95ca-455f-9b49-e4cb96963575",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "fcda0493-4145-4e74-9b62-407b5855354e"
  ]
}
```

```json
{
  "id": "809f2305-ff3b-4098-af0b-680373479085",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:26:31.124154Z",
  "updated_at": "2026-10-28T07:26:31.124154Z",
  "messages": [
    {
      "id": "b31fb496-441d-415e-b381-520e4f9969d5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:26:31.125283Z",
      "attachments": [
        {
          "file_id": "fcda0493-4145-4e74-9b62-407b5855354e",
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
  "session_id": "536599c3-2cd2-469d-b2e6-fc06607dd971",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyOTEsImlhdCI6MTc5MzE3MjM5MSwianRpIjoiN2E0M2Y1N2YtNjVmNS00NTc3LTk3M2EtZGZjZDRiMTlmNzcxIiwic2lkIjoiNTM2NTk5YzMtMmNkMi00NjlkLWIyZTYtZmMwNjYwN2RkOTcxIn0.0_2pnWAwBShPBxlMc_T3kW8CPxOYS_mcawio_COGw6U",
  "access_expires_at": "2026-10-28T07:41:31.421172503Z",
  "refresh_token": "FkAtAK5308O3vJIsUF9GTunoPBlskmRzqlJy7Q9AswU",
  "refresh_expires_at": "2026-10-28T19:26:31.420679707Z",
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
  "session_id": "e3ddf326-f3fa-43d5-ba3f-f0b905dc4eb1",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyOTEsImlhdCI6MTc5MzE3MjM5MSwianRpIjoiNjVhN2UwYzAtMGI2NS00YmE3LWJhNzEtOGQ2NmI5MTM1ZWNhIiwic2lkIjoiZTNkZGYzMjYtZjNmYS00M2Q1LWJhM2YtZjBiOTA1ZGM0ZWIxIn0.anm-NoxJAZ9xQSBZT75NkOXx4yZJsSlJX9_PCUwElCw",
  "access_expires_at": "2026-10-28T07:41:31.702817696Z",
  "refresh_token": "0Sur9yBb3mbQKLlJdaTgPr9V2REKWu9fOiUiSXP3lxA",
  "refresh_expires_at": "2026-10-28T19:26:31.702380879Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/809f2305-ff3b-4098-af0b-680373479085/attachments/fcda0493-4145-4e74-9b62-407b5855354e` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "9ba07551-3782-4463-ac68-ab0121b5b4ba",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7a98db79-3d70-49d3-87a9-0eba6750cca3",
  "upload_path": "/api/operator/v1/uploads/7a98db79-3d70-49d3-87a9-0eba6750cca3",
  "expires_at": "2026-10-28T07:41:31.745263731Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/7a98db79-3d70-49d3-87a9-0eba6750cca3` → **200**

```json
{
  "file_id": "7a98db79-3d70-49d3-87a9-0eba6750cca3",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/809f2305-ff3b-4098-af0b-680373479085` → **200**

```json
{
  "id": "809f2305-ff3b-4098-af0b-680373479085",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:26:31.124154Z",
  "updated_at": "2026-10-28T07:26:31.124154Z",
  "messages": [
    {
      "id": "b31fb496-441d-415e-b381-520e4f9969d5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:26:31.125283Z",
      "attachments": [
        {
          "file_id": "fcda0493-4145-4e74-9b62-407b5855354e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/809f2305-ff3b-4098-af0b-680373479085/comments` → **200**

```json
{
  "command_id": "86a397c1-47ad-4efb-9478-9c9670dd09b1",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "7a98db79-3d70-49d3-87a9-0eba6750cca3"
  ]
}
```

```json
{
  "id": "809f2305-ff3b-4098-af0b-680373479085",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:26:31.124154Z",
  "updated_at": "2026-10-28T07:26:31.826896Z",
  "messages": [
    {
      "id": "b31fb496-441d-415e-b381-520e4f9969d5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:26:31.125283Z",
      "attachments": [
        {
          "file_id": "fcda0493-4145-4e74-9b62-407b5855354e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "491a236b-d1a1-4b1e-85ac-609df328ef54",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:26:31.826561Z",
      "attachments": [
        {
          "file_id": "7a98db79-3d70-49d3-87a9-0eba6750cca3",
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

`GET /api/rider/v1/support/cases/809f2305-ff3b-4098-af0b-680373479085` → **200**

```json
{
  "id": "809f2305-ff3b-4098-af0b-680373479085",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:26:31.124154Z",
  "updated_at": "2026-10-28T07:26:31.826896Z",
  "messages": [
    {
      "id": "b31fb496-441d-415e-b381-520e4f9969d5",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b8dd055-52f1-4bfb-a74a-88e87de55560",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:26:31.125283Z",
      "attachments": [
        {
          "file_id": "fcda0493-4145-4e74-9b62-407b5855354e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "491a236b-d1a1-4b1e-85ac-609df328ef54",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:26:31.826561Z",
      "attachments": [
        {
          "file_id": "7a98db79-3d70-49d3-87a9-0eba6750cca3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/809f2305-ff3b-4098-af0b-680373479085/attachments/7a98db79-3d70-49d3-87a9-0eba6750cca3` → **200**

Done: support case 809f2305-ff3b-4098-af0b-680373479085, rider attachment fcda0493-4145-4e74-9b62-407b5855354e, operator attachment 7a98db79-3d70-49d3-87a9-0eba6750cca3.

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
  "session_id": "868b1c3d-c925-450d-bd6e-c486a768ce85",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyOTIsImlhdCI6MTc5MzE3MjM5MiwianRpIjoiZmM2OTRiOTUtNzhlMy00Y2ZmLTg5MmEtMDkxMzhmOWFiM2MzIiwic2lkIjoiODY4YjFjM2QtYzkyNS00NTBkLWJkNmUtYzQ4NmE3NjhjZTg1In0.Xj9FHF5pZCG4Wuqe62LwY1e1NB05ENoGrCsB5SCr9g4",
  "access_expires_at": "2026-10-28T07:41:32.164335644Z",
  "refresh_token": "JLzVEqnP0rNq4nB25SWBQnBz35v0J9hcs1ZrTWbLyUc",
  "refresh_expires_at": "2026-10-28T19:26:32.163942183Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7049"
}
```

```json
{
  "challenge_id": "060e1500-33c6-491d-afeb-c5f82752aaee",
  "expires_at": "2026-10-28T07:31:32.187337601Z",
  "resend_available_at": "2026-10-28T07:26:33.187337601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "347683",
  "sent_at": "2026-10-28T07:26:32.188985427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "060e1500-33c6-491d-afeb-c5f82752aaee",
  "code": "347683",
  "device_ref": "sandbox-7049"
}
```

```json
{
  "session_id": "6fffa371-6c65-4352-85a8-dbaa792f6d91",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI5MiwiaWF0IjoxNzkzMTcyMzkyLCJqdGkiOiI0NTA5YWE3Yy0yMDc3LTRkYjktYTU3OS00NTQ1MDEyNTMxMGIiLCJzaWQiOiI2ZmZmYTM3MS02YzY1LTQzNTItODVhOC1kYmFhNzkyZjZkOTEifQ.d0N__TyqN8f_owmgUWPYhaUVMdzEb7aN4ni5f1getDw",
  "access_expires_at": "2026-10-28T07:41:32.241255279Z",
  "refresh_token": "aLF-jBREriPR7GGuyjxF48Odn7yVCItR25OBLVro060",
  "refresh_expires_at": "2026-11-27T07:26:32.240762789Z",
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
  "command_id": "512ea186-533f-4960-a9d7-77cce291cabb",
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
  "device_ref": "sandbox-7153"
}
```

```json
{
  "challenge_id": "c00da0fb-ce64-4cc3-aece-13bde0692ad2",
  "expires_at": "2026-10-28T07:31:32.352888624Z",
  "resend_available_at": "2026-10-28T07:26:33.352888624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "320709",
  "sent_at": "2026-10-28T07:26:32.354596291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c00da0fb-ce64-4cc3-aece-13bde0692ad2",
  "code": "320709",
  "device_ref": "sandbox-7153"
}
```

```json
{
  "session_id": "7c95e9cf-c7e4-4d9f-b816-9fd0001c22f2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3MzI5MiwiaWF0IjoxNzkzMTcyMzkyLCJqdGkiOiI0YzBjMjVlMi0xNWRiLTRiNjAtYWQ4NS0yOTdjMDA2Y2YzZjQiLCJzaWQiOiI3Yzk1ZTljZi1jN2U0LTRkOWYtYjgxNi05ZmQwMDAxYzIyZjIifQ.yOHbYm3NbfGuIDmo4xmLAaY24w_WKsNkizdv_7s2C6o",
  "access_expires_at": "2026-10-28T07:41:32.400930113Z",
  "refresh_token": "dE-Cu9_DWzL3O6SJzMGIPrXjmen1XOn0m0DaAq_X-wY",
  "refresh_expires_at": "2026-11-27T07:26:32.400513817Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fba8025a-9f2e-454d-8c3d-6a1f85bbc61c",
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
  "last_heartbeat_at": "2026-10-28T07:26:18.754753Z",
  "last_location_at": "2026-10-28T07:26:18.754753Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fba8025a-9f2e-454d-8c3d-6a1f85bbc61c/handover` → **200**

```json
{
  "command_id": "ec7d266c-5230-4f62-9cce-8febbefec336",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fba8025a-9f2e-454d-8c3d-6a1f85bbc61c",
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
  "last_heartbeat_at": "2026-10-28T07:26:18.754753Z",
  "last_location_at": "2026-10-28T07:26:18.754753Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fba8025a-9f2e-454d-8c3d-6a1f85bbc61c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:32Z",
    "sequence": 1793172392472
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fba8025a-9f2e-454d-8c3d-6a1f85bbc61c",
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
  "last_heartbeat_at": "2026-10-28T07:26:32.488075Z",
  "last_location_at": "2026-10-28T07:26:32.488075Z",
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
  "command_id": "62396943-3f8a-44e7-b167-c444385a60ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:32Z",
    "sequence": 1793172392532
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601fb2bc-ca6b-49aa-a49d-866e29c014c5",
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
  "last_heartbeat_at": "2026-10-28T07:26:32.547844Z",
  "last_location_at": "2026-10-28T07:26:32.547844Z",
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
  "session_id": "1594680e-4fa7-4736-981e-d07dbe0876e2",
  "subject": {
    "type": "STAFF",
    "id": "ce95096d-2c1e-48f2-98ec-cea814f4ce6c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTk1MDk2ZC0yYzFlLTQ4ZjItOThlYy1jZWE4MTRmNGNlNmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzMyOTIsImlhdCI6MTc5MzE3MjM5MiwianRpIjoiMjVkNmY0OGItY2Y3Ni00OTk3LWIyOTYtMDc0OTE1MDZiM2U1Iiwic2lkIjoiMTU5NDY4MGUtNGZhNy00NzM2LTk4MWUtZDA3ZGJlMDg3NmUyIn0.sBG1lMFUP2cQaKon7CXDC8oVCA_RZ_Ejc11zR26R1xw",
  "access_expires_at": "2026-10-28T07:41:32.83608915Z",
  "refresh_token": "aNwLRbB-M03Lw_j4x9gHxE7w8Pnek4Z473QQj83XEnw",
  "refresh_expires_at": "2026-10-28T19:26:32.835688808Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "29533d94-8006-4ef2-9aaa-7b85060e2681",
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
  "id": "19aabaca-f167-4f40-a931-c9e82393549d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:31:32.863273Z",
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
  "command_id": "fd93f88b-8f56-467f-8a3c-0c927cf29d96",
  "quote_id": "19aabaca-f167-4f40-a931-c9e82393549d",
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
  "id": "60346005-b47e-431e-be09-47dba4170224",
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
  "created_at": "2026-10-28T07:26:32.893688Z",
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
    "id": "d132dc25-5e49-4803-90d1-555abebd223b",
    "order_id": "60346005-b47e-431e-be09-47dba4170224",
    "expires_at": "2026-10-28T07:26:47.896057Z",
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

`POST /api/driver/v1/offers/d132dc25-5e49-4803-90d1-555abebd223b/accept` → **200**

```json
{
  "command_id": "a1d97b0e-5c89-4368-b7b8-e8edd09d0f3c"
}
```

```json
{
  "id": "20c94d34-54a6-4597-aeaa-1144fa97dae8",
  "order_id": "60346005-b47e-431e-be09-47dba4170224",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b2671046-6c10-4e80-8f44-54d27de06712",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2671046-6c10-4e80-8f44-54d27de06712",
  "order_id": "60346005-b47e-431e-be09-47dba4170224",
  "assignment_id": "20c94d34-54a6-4597-aeaa-1144fa97dae8",
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

`POST /api/driver/v1/work-sessions/601fb2bc-ca6b-49aa-a49d-866e29c014c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:26:33Z",
    "sequence": 1793172393519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601fb2bc-ca6b-49aa-a49d-866e29c014c5",
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
  "last_heartbeat_at": "2026-10-28T07:26:33.022128Z",
  "last_location_at": "2026-10-28T07:26:33.022128Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b2671046-6c10-4e80-8f44-54d27de06712/arrive` → **200**

```json
{
  "command_id": "b32d5540-a1d4-4398-a9ef-030ebd261776",
  "expected_version": 0
}
```

```json
{
  "id": "b2671046-6c10-4e80-8f44-54d27de06712",
  "order_id": "60346005-b47e-431e-be09-47dba4170224",
  "assignment_id": "20c94d34-54a6-4597-aeaa-1144fa97dae8",
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
  "arrived_at": "2026-10-28T07:26:33.051779Z",
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

`POST /api/driver/v1/trips/b2671046-6c10-4e80-8f44-54d27de06712/start` → **200**

```json
{
  "command_id": "d2fca3ff-0dae-4c63-b0d4-e8b3dfc6a16d",
  "expected_version": 1
}
```

```json
{
  "id": "b2671046-6c10-4e80-8f44-54d27de06712",
  "order_id": "60346005-b47e-431e-be09-47dba4170224",
  "assignment_id": "20c94d34-54a6-4597-aeaa-1144fa97dae8",
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
  "arrived_at": "2026-10-28T07:26:33.051779Z",
  "started_at": "2026-10-28T07:26:33.084239Z",
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

`POST /api/driver/v1/trips/b2671046-6c10-4e80-8f44-54d27de06712/complete` → **200**

```json
{
  "command_id": "5368a571-e017-4fc0-a858-14d71d7bd97b",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:26:33Z",
  "cash_received": true
}
```

```json
{
  "id": "b2671046-6c10-4e80-8f44-54d27de06712",
  "order_id": "60346005-b47e-431e-be09-47dba4170224",
  "assignment_id": "20c94d34-54a6-4597-aeaa-1144fa97dae8",
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
  "arrived_at": "2026-10-28T07:26:33.051779Z",
  "started_at": "2026-10-28T07:26:33.084239Z",
  "completed_at": "2026-10-28T07:26:33.119217Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/60346005-b47e-431e-be09-47dba4170224` → **200**

```json
{
  "id": "60346005-b47e-431e-be09-47dba4170224",
  "short_number": 16,
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
    "id": "20c94d34-54a6-4597-aeaa-1144fa97dae8",
    "order_id": "60346005-b47e-431e-be09-47dba4170224",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b2671046-6c10-4e80-8f44-54d27de06712",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:26:32.893688Z",
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
  "session_id": "fba8025a-9f2e-454d-8c3d-6a1f85bbc61c",
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
  "last_heartbeat_at": "2026-10-28T07:26:32.488075Z",
  "last_location_at": "2026-10-28T07:26:32.488075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fba8025a-9f2e-454d-8c3d-6a1f85bbc61c/close` → **200**

```json
{
  "command_id": "0b3e5c08-26b2-4da4-be92-67ec82000362",
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
  "session_id": "601fb2bc-ca6b-49aa-a49d-866e29c014c5",
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
  "last_heartbeat_at": "2026-10-28T07:26:33.022128Z",
  "last_location_at": "2026-10-28T07:26:33.022128Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/601fb2bc-ca6b-49aa-a49d-866e29c014c5/close` → **200**

```json
{
  "command_id": "bf02809c-16d0-4481-82af-9f8a446f6eca",
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

Done: terminal order 60346005-b47e-431e-be09-47dba4170224 by Andrii (5a000000-0000-4000-8000-000000000403).
