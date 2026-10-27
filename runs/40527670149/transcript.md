# Sandbox transcript (2026-10-27T15:07:09Z, 8edc34a)

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
  "correlation_id": "f3746978-466c-426b-88a6-d82b6fda7ae7"
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
  "session_id": "def7fa37-076a-4e28-8cb1-a382d88ac3d0",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1MjksImlhdCI6MTc5MzExMzYyOSwianRpIjoiZjUzMGMwMTYtMTdlYy00MzI0LTg5OTAtYjliNDYwNTllZTgxIiwic2lkIjoiZGVmN2ZhMzctMDc2YS00ZTI4LThjYjEtYTM4MmQ4OGFjM2QwIn0.otVvwna5LWfLxcOg4-FiX_HJqOuYDYMh1okdR-1mkmo",
  "access_expires_at": "2026-10-27T15:22:09.734552394Z",
  "refresh_token": "-5NIYc9tR-JObrbYDzqOwEbt_MPQcZt0HjD9ATqq4ZQ",
  "refresh_expires_at": "2026-10-28T03:07:09.732359734Z",
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
  "session_id": "307d4a5a-d72b-4bcf-a625-24af85813f14",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1MzAsImlhdCI6MTc5MzExMzYzMCwianRpIjoiNTJlZjNkM2YtZDkwMS00ODQzLWIxMDktMDA2YjQ0ZjQ2ZjA4Iiwic2lkIjoiMzA3ZDRhNWEtZDcyYi00YmNmLWE2MjUtMjRhZjg1ODEzZjE0In0.swWDg9XeIds1TxWQWnyMR-7aSuvSRr8ByzAu-OmxHXQ",
  "access_expires_at": "2026-10-27T15:22:10.90056697Z",
  "refresh_token": "7wwP1MFbHv29mF7cvhTGZ5kZney89eGYmwkUnj56DSY",
  "refresh_expires_at": "2026-10-28T03:07:10.89947695Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "47a90844-58ab-4b0c-a24a-49e9eeb06d23",
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
  "id": "ed0a2d26-1572-459e-8d0e-7df4d5fb5097",
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
  "created_by": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "created_at": "2026-10-27T15:07:10.953496Z",
  "updated_at": "2026-10-27T15:07:10.953496Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634596177",
  "device_ref": "sandbox-29182"
}
```

```json
{
  "challenge_id": "9c62893a-8f1c-4238-b633-736123b0ecd5",
  "expires_at": "2026-10-27T15:12:11.157762723Z",
  "resend_available_at": "2026-10-27T15:07:12.157762723Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634596177` → **200**

```json
{
  "phone": "+380634596177",
  "audience": "CLIENT",
  "code": "651962",
  "sent_at": "2026-10-27T15:07:11.165464751Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c62893a-8f1c-4238-b633-736123b0ecd5",
  "code": "651962",
  "device_ref": "sandbox-29182"
}
```

```json
{
  "session_id": "16dd9235-0923-48a9-bf4b-873f7c29dc17",
  "subject": {
    "type": "CLIENT",
    "id": "ba21f5c8-1583-4c71-97c3-7f19d8c36fa2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTIxZjVjOC0xNTgzLTRjNzEtOTdjMy03ZjE5ZDhjMzZmYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTMxLCJpYXQiOjE3OTMxMTM2MzEsImp0aSI6IjM0MDAyYTY1LTZjZjAtNDc5YS05MjZlLTQwMmIyYWY1NjczZCIsInNpZCI6IjE2ZGQ5MjM1LTA5MjMtNDhhOS1iZjRiLTg3M2Y3YzI5ZGMxNyJ9.RsL8zbYrjJNM_rsmlocRW2l609v5OTUJQIK0a_T6hJs",
  "access_expires_at": "2026-10-27T15:22:11.226768469Z",
  "refresh_token": "BOr4HhZJ5SDJTA2E49Y-CqsmMg03kNHCY0WTvBT2l8E",
  "refresh_expires_at": "2026-11-26T15:07:11.22571421Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634596177` → **200**

```json
{
  "client_id": "ba21f5c8-1583-4c71-97c3-7f19d8c36fa2"
}
```

`POST /api/admin/v1/rider-wallets/ba21f5c8-1583-4c71-97c3-7f19d8c36fa2/top-ups` → **201**

```json
{
  "command_id": "e25062af-c378-4be1-973c-d0b9cd5fefcd",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "ba21f5c8-1583-4c71-97c3-7f19d8c36fa2",
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
      "id": "7b45e670-ea0b-41ea-b0ef-e5d96e9a1469",
      "at": "2026-10-27T15:07:11.290087Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "49c54361-fcbe-470c-b0cd-c67671359eeb",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1f8d422-77a9-4c6c-a3aa-ec9d2a94bc7d",
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
  "id": "430f206d-6ffe-42cf-844c-6c7f87f5b653",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:12:11.426710Z",
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
      "id": "ed0a2d26-1572-459e-8d0e-7df4d5fb5097",
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
  "device_ref": "sandbox-18028"
}
```

```json
{
  "challenge_id": "e865ee2d-aa77-4879-a149-d5efe4d24dc9",
  "expires_at": "2026-10-27T15:12:11.480273426Z",
  "resend_available_at": "2026-10-27T15:07:12.480273426Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "359047",
  "sent_at": "2026-10-27T15:07:11.483819241Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e865ee2d-aa77-4879-a149-d5efe4d24dc9",
  "code": "359047",
  "device_ref": "sandbox-18028"
}
```

```json
{
  "session_id": "169dc6cc-ad2e-40a4-8d7e-fa30f4933d24",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDUzMSwiaWF0IjoxNzkzMTEzNjMxLCJqdGkiOiI2MTgyYzdmMS03MDBhLTRiNDktOWZiOC1hMGU5YzViOTlmMjQiLCJzaWQiOiIxNjlkYzZjYy1hZDJlLTQwYTQtOGQ3ZS1mYTMwZjQ5MzNkMjQifQ.rhr59-pqpRh4CrwV83eT2oS-hwqIdE_TAzCyFDseSTg",
  "access_expires_at": "2026-10-27T15:22:11.527152282Z",
  "refresh_token": "r29uTUFQ8bJZ87T3vPQ1smeAgXF1dbdStypHplp32BQ",
  "refresh_expires_at": "2026-11-26T15:07:11.526035282Z",
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
  "command_id": "e1b7078d-7d4f-4f37-9a3e-ba5382b95472",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:11Z",
    "sequence": 1793113631573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c33b18b-874e-4863-9b57-c7f9749e96ba",
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
  "last_heartbeat_at": "2026-10-27T15:07:11.605331Z",
  "last_location_at": "2026-10-27T15:07:11.605331Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "75583017-edab-4d4e-b0c7-d75a1956fdd0",
  "quote_id": "430f206d-6ffe-42cf-844c-6c7f87f5b653",
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
  "id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba21f5c8-1583-4c71-97c3-7f19d8c36fa2",
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
  "created_at": "2026-10-27T15:07:11.668364Z",
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
  "client_id": "ba21f5c8-1583-4c71-97c3-7f19d8c36fa2",
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
      "id": "7b45e670-ea0b-41ea-b0ef-e5d96e9a1469",
      "at": "2026-10-27T15:07:11.290087Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "49c54361-fcbe-470c-b0cd-c67671359eeb",
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
    "id": "882f5703-c850-4e30-8fcc-a70a7d4f7a53",
    "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
    "expires_at": "2026-10-27T15:07:26.67967Z",
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

`POST /api/driver/v1/offers/882f5703-c850-4e30-8fcc-a70a7d4f7a53/accept` → **200**

```json
{
  "command_id": "5235bb95-c1c7-4b4d-874a-8da46b54136a"
}
```

```json
{
  "id": "2831d510-803f-472e-b18c-b6f65f5798d8",
  "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "61de1c20-16f0-4b21-8b49-8aceb1ddf4d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "61de1c20-16f0-4b21-8b49-8aceb1ddf4d3",
  "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
  "assignment_id": "2831d510-803f-472e-b18c-b6f65f5798d8",
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

`POST /api/driver/v1/work-sessions/2c33b18b-874e-4863-9b57-c7f9749e96ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:11Z",
    "sequence": 1793113631805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c33b18b-874e-4863-9b57-c7f9749e96ba",
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
  "last_heartbeat_at": "2026-10-27T15:07:11.82632Z",
  "last_location_at": "2026-10-27T15:07:11.82632Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/61de1c20-16f0-4b21-8b49-8aceb1ddf4d3/arrive` → **200**

```json
{
  "command_id": "c6afba88-0b4f-4960-b473-fedf5f73b3fb",
  "expected_version": 0
}
```

```json
{
  "id": "61de1c20-16f0-4b21-8b49-8aceb1ddf4d3",
  "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
  "assignment_id": "2831d510-803f-472e-b18c-b6f65f5798d8",
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
  "arrived_at": "2026-10-27T15:07:11.871032Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/61de1c20-16f0-4b21-8b49-8aceb1ddf4d3/start` → **200**

```json
{
  "command_id": "de9c783b-d40e-47dc-82e7-9b9d66d8e3a9",
  "expected_version": 1
}
```

```json
{
  "id": "61de1c20-16f0-4b21-8b49-8aceb1ddf4d3",
  "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
  "assignment_id": "2831d510-803f-472e-b18c-b6f65f5798d8",
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
  "arrived_at": "2026-10-27T15:07:11.871032Z",
  "started_at": "2026-10-27T15:07:11.905637Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/61de1c20-16f0-4b21-8b49-8aceb1ddf4d3/complete` → **200**

```json
{
  "command_id": "b6d1bfb5-b3b8-48b9-ae13-8229060f6b3a",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:07:11Z",
  "cash_received": true
}
```

```json
{
  "id": "61de1c20-16f0-4b21-8b49-8aceb1ddf4d3",
  "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
  "assignment_id": "2831d510-803f-472e-b18c-b6f65f5798d8",
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
  "arrived_at": "2026-10-27T15:07:11.871032Z",
  "started_at": "2026-10-27T15:07:11.905637Z",
  "completed_at": "2026-10-27T15:07:11.951346Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ba21f5c8-1583-4c71-97c3-7f19d8c36fa2",
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
      "id": "5c8ac608-a7e0-41ff-8ddc-29d49ce108b2",
      "at": "2026-10-27T15:07:12.88325Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168"
    },
    {
      "id": "7b45e670-ea0b-41ea-b0ef-e5d96e9a1469",
      "at": "2026-10-27T15:07:11.290087Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "49c54361-fcbe-470c-b0cd-c67671359eeb",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/ed0a2d26-1572-459e-8d0e-7df4d5fb5097/archive` → **200**

```json
{
  "command_id": "a52d5d36-157e-4479-b518-47faead859a7",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "ed0a2d26-1572-459e-8d0e-7df4d5fb5097",
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
  "created_by": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "created_at": "2026-10-27T15:07:10.953496Z",
  "updated_at": "2026-10-27T15:07:15.027109Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c33b18b-874e-4863-9b57-c7f9749e96ba",
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
  "last_heartbeat_at": "2026-10-27T15:07:11.82632Z",
  "last_location_at": "2026-10-27T15:07:11.82632Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c33b18b-874e-4863-9b57-c7f9749e96ba/close` → **200**

```json
{
  "command_id": "d9b1643b-1fa5-4300-9fe9-5a9f3893d843",
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

Done: order 0ee82183-06cc-4ea2-9737-56a910cd7168.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631070481",
  "device_ref": "sandbox-3403"
}
```

```json
{
  "challenge_id": "7343ac4b-dfc5-48e9-96d1-62f15ca11c81",
  "expires_at": "2026-10-27T15:12:15.122084295Z",
  "resend_available_at": "2026-10-27T15:07:16.122084295Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631070481` → **200**

```json
{
  "phone": "+380631070481",
  "audience": "CLIENT",
  "code": "014108",
  "sent_at": "2026-10-27T15:07:15.125936359Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7343ac4b-dfc5-48e9-96d1-62f15ca11c81",
  "code": "014108",
  "device_ref": "sandbox-3403"
}
```

```json
{
  "session_id": "f70a96c1-4334-4914-a15e-0e72ac45eb06",
  "subject": {
    "type": "CLIENT",
    "id": "b2b1fc4d-8a0b-44dd-9ef4-d7d3dd882841"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMmIxZmM0ZC04YTBiLTQ0ZGQtOWVmNC1kN2QzZGQ4ODI4NDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTM1LCJpYXQiOjE3OTMxMTM2MzUsImp0aSI6IjJiMTNhOWEyLTExMTYtNDRkMy1iZGUzLTgzMjExYjZiODVhYiIsInNpZCI6ImY3MGE5NmMxLTQzMzQtNDkxNC1hMTVlLTBlNzJhYzQ1ZWIwNiJ9.Ysa8RDjxJMzykrhJXBCR8fiaGZp8OcX0m94GCBOfnCg",
  "access_expires_at": "2026-10-27T15:22:15.169600647Z",
  "refresh_token": "ptdAEYZFuXO7_rWYbAX4wn7VUAhxON40DzXcJ2ITmKM",
  "refresh_expires_at": "2026-11-26T15:07:15.168665666Z",
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
  "device_ref": "sandbox-12548"
}
```

```json
{
  "challenge_id": "220c06f0-60ee-4dcf-b4f1-479d50095825",
  "expires_at": "2026-10-27T15:12:15.212687899Z",
  "resend_available_at": "2026-10-27T15:07:16.212687899Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "500989",
  "sent_at": "2026-10-27T15:07:15.216150993Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "220c06f0-60ee-4dcf-b4f1-479d50095825",
  "code": "500989",
  "device_ref": "sandbox-12548"
}
```

```json
{
  "session_id": "9edd763d-b976-457f-b3aa-c4a837859eed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDUzNSwiaWF0IjoxNzkzMTEzNjM1LCJqdGkiOiJiZjdlYzJlMS1mYzMxLTRmMjMtOTRlYS05MTVlYjc0ZmFjNTAiLCJzaWQiOiI5ZWRkNzYzZC1iOTc2LTQ1N2YtYjNhYS1jNGE4Mzc4NTllZWQifQ.w2wCSLhJja6BYEu3FdJSx8s0rrG4NjZvqYznWUUUttc",
  "access_expires_at": "2026-10-27T15:22:15.258638668Z",
  "refresh_token": "xdGzLILK1YB4A75U0fSR2Ya8qsJPoDsW2k8aJiU05jg",
  "refresh_expires_at": "2026-11-26T15:07:15.257888444Z",
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
  "session_id": "55d51420-1d6a-4236-a303-83d7a362f620",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1MzUsImlhdCI6MTc5MzExMzYzNSwianRpIjoiYWI2YTA4ZGMtYTEzNC00YzA2LWE3MGMtNDcxNzU0NmJhOTQ2Iiwic2lkIjoiNTVkNTE0MjAtMWQ2YS00MjM2LWEzMDMtODNkN2EzNjJmNjIwIn0.nBQPMh5A-hPuj_VgYpIwsl4qmANgQCAUyxU0gfq7c74",
  "access_expires_at": "2026-10-27T15:22:15.538861598Z",
  "refresh_token": "kAq3Q5k1xZ1qdxK40lhrNt_jq3KfBu8SGXhrbTWS-L4",
  "refresh_expires_at": "2026-10-28T03:07:15.537678455Z",
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
  "session_id": "7a3a3094-c91f-4550-9465-b57373b4ccd9",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1MzUsImlhdCI6MTc5MzExMzYzNSwianRpIjoiODc1YmRiNjEtNzUwMi00OTdmLWE2OTYtZWEzNWIzMGJjMjJjIiwic2lkIjoiN2EzYTMwOTQtYzkxZi00NTUwLTk0NjUtYjU3MzczYjRjY2Q5In0.AdGOUNIBQXeE0nFMYE9A7zY-JsGoK92HoHRCw9K22oo",
  "access_expires_at": "2026-10-27T15:22:15.84802437Z",
  "refresh_token": "pL9aopXuniLBcKAqrEDQSPXS8TfKptc3L2nN54Ok5QQ",
  "refresh_expires_at": "2026-10-28T03:07:15.84709918Z",
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
  "command_id": "2b5c3f67-78ec-48c4-9ec8-0e8ac1af8e8e",
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
  "id": "6cf89416-804c-4ee2-862f-fef52881b519",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:12:15.908280Z",
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
  "command_id": "817a7644-048c-4ae1-9f7c-e4548d7a7425",
  "quote_id": "6cf89416-804c-4ee2-862f-fef52881b519",
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
  "id": "ce0e3dda-72d6-44af-8d1b-bedbd72d102c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b2b1fc4d-8a0b-44dd-9ef4-d7d3dd882841",
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
  "created_at": "2026-10-27T15:07:15.947303Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ce0e3dda-72d6-44af-8d1b-bedbd72d102c` → **200**

```json
{
  "id": "ce0e3dda-72d6-44af-8d1b-bedbd72d102c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b2b1fc4d-8a0b-44dd-9ef4-d7d3dd882841",
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
  "created_at": "2026-10-27T15:07:15.947303Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ce0e3dda-72d6-44af-8d1b-bedbd72d102c/cancel` → **200**

```json
{
  "command_id": "6a6c6c39-7935-44a0-86ee-10a9d91c4c02",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ce0e3dda-72d6-44af-8d1b-bedbd72d102c",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b2b1fc4d-8a0b-44dd-9ef4-d7d3dd882841",
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
  "created_at": "2026-10-27T15:07:15.947303Z",
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
  "command_id": "eb3ab3d8-4733-4b4d-94b3-c778e09fd19f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:16Z",
    "sequence": 1793113636824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1b6ec5ed-0299-4587-afe8-d131982a3d37",
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
  "last_heartbeat_at": "2026-10-27T15:07:16.098461Z",
  "last_location_at": "2026-10-27T15:07:16.098461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3468"
}
```

```json
{
  "challenge_id": "79153711-a5a2-4ef4-921e-afe4c76150fb",
  "expires_at": "2026-10-27T15:12:16.123093327Z",
  "resend_available_at": "2026-10-27T15:07:17.123093327Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "434397",
  "sent_at": "2026-10-27T15:07:16.126800122Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79153711-a5a2-4ef4-921e-afe4c76150fb",
  "code": "434397",
  "device_ref": "sandbox-3468"
}
```

```json
{
  "session_id": "dc8b4062-b413-427d-a870-61c2c4c2361a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDUzNiwiaWF0IjoxNzkzMTEzNjM2LCJqdGkiOiJjOGQyYTZiMy0yNTQ1LTQzOTItOTQxZi0yOWRlNWUyOTMzNGEiLCJzaWQiOiJkYzhiNDA2Mi1iNDEzLTQyN2QtYTg3MC02MWMyYzRjMjM2MWEifQ.3Bcq11kjK6w6xRSBHlayCE680UJEYrOwNKWOURzqH1E",
  "access_expires_at": "2026-10-27T15:22:16.168948947Z",
  "refresh_token": "wQiozokgCOr_EQG-xlBnlnWHGzuMB7yQMWO0BRN8FWU",
  "refresh_expires_at": "2026-11-26T15:07:16.168221191Z",
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
  "command_id": "fb6d8876-b5cf-4704-9d85-a89ff58ac566",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:16Z",
    "sequence": 1793113636825
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:16.224275Z",
  "last_location_at": "2026-10-27T15:07:16.224275Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "daa2aa38-f12e-4da1-ad30-8b918e7c7c85",
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
  "id": "74fc8dd3-7cb3-401e-8f20-636c83270b09",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:12:16.265580Z",
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
  "command_id": "c7bf7a18-a1b2-4b64-8115-72c6bd58f4cb",
  "quote_id": "74fc8dd3-7cb3-401e-8f20-636c83270b09",
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
  "id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b2b1fc4d-8a0b-44dd-9ef4-d7d3dd882841",
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
  "created_at": "2026-10-27T15:07:16.296314Z",
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
    "id": "afd3ebcc-2151-44db-a1db-2f20ca0f2b1e",
    "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
    "expires_at": "2026-10-27T15:07:31.300531Z",
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

`POST /api/driver/v1/offers/afd3ebcc-2151-44db-a1db-2f20ca0f2b1e/accept` → **200**

```json
{
  "command_id": "3728ab84-96aa-40a1-8f49-6612c698ac0e"
}
```

```json
{
  "id": "e25f6653-0fec-4176-93d1-25901e6b4b1a",
  "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "198791be-5fcd-481a-90f1-90c648a5edf9",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "198791be-5fcd-481a-90f1-90c648a5edf9",
  "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "assignment_id": "e25f6653-0fec-4176-93d1-25901e6b4b1a",
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

`POST /api/driver/v1/trips/198791be-5fcd-481a-90f1-90c648a5edf9/cancel` → **200**

```json
{
  "command_id": "e00cec3b-a8ba-4ab1-901e-c5c5c5e0a478",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "198791be-5fcd-481a-90f1-90c648a5edf9",
  "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "assignment_id": "e25f6653-0fec-4176-93d1-25901e6b4b1a",
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

`GET /api/rider/v1/orders/b155debe-d639-46ca-8c6c-ad9d7cbabdd7` → **200**

```json
{
  "id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b2b1fc4d-8a0b-44dd-9ef4-d7d3dd882841",
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
    "id": "e25f6653-0fec-4176-93d1-25901e6b4b1a",
    "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "198791be-5fcd-481a-90f1-90c648a5edf9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T15:07:16.296314Z",
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
    "id": "b638d9c4-40f1-4fab-b4f4-fb21bf377de5",
    "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
    "expires_at": "2026-10-27T15:07:31.421124Z",
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

`POST /api/driver/v1/offers/b638d9c4-40f1-4fab-b4f4-fb21bf377de5/accept` → **200**

```json
{
  "command_id": "fca667fe-16af-4ac4-a92a-78dc1c43d7c8"
}
```

```json
{
  "id": "82f581bf-aa50-4b35-af61-df5c15707038",
  "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e693a0bd-b46b-4542-8a1f-ca0c2a3b6267",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e693a0bd-b46b-4542-8a1f-ca0c2a3b6267",
  "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "assignment_id": "82f581bf-aa50-4b35-af61-df5c15707038",
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

`POST /api/driver/v1/trips/e693a0bd-b46b-4542-8a1f-ca0c2a3b6267/cancel` → **200**

```json
{
  "command_id": "2bc77bee-484b-41a2-9f16-e234d020ca2d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "e693a0bd-b46b-4542-8a1f-ca0c2a3b6267",
  "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
  "assignment_id": "82f581bf-aa50-4b35-af61-df5c15707038",
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
    "id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:07:16.296314Z",
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
    "id": "ce0e3dda-72d6-44af-8d1b-bedbd72d102c",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:07:15.947303Z",
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

`GET /api/operator/v1/orders/b155debe-d639-46ca-8c6c-ad9d7cbabdd7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:07:16.297016Z",
      "actor": {
        "type": "CLIENT",
        "id": "b2b1fc4d-8a0b-44dd-9ef4-d7d3dd882841",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
        "quote_id": "74fc8dd3-7cb3-401e-8f20-636c83270b09",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:07:16.299411Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
        "attempt_id": "8e808447-1048-4639-8c1a-8d4a17f66379",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:07:16.305253Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "afd3ebcc-2151-44db-a1db-2f20ca0f2b1e",
        "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:07:16.359979Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "afd3ebcc-2151-44db-a1db-2f20ca0f2b1e",
        "order_id": "b155debe-d639-46ca-8c6c-ad9d7cbabdd7",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "e25f6653-0fec-4176-93d1-25901e6b4b1a"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders ce0e3dda-72d6-44af-8d1b-bedbd72d102c, b155debe-d639-46ca-8c6c-ad9d7cbabdd7.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736139601",
  "device_ref": "sandbox-7656"
}
```

```json
{
  "challenge_id": "5f045599-fa69-4b25-8c62-f8e129339231",
  "expires_at": "2026-10-27T15:12:16.622276305Z",
  "resend_available_at": "2026-10-27T15:07:17.622276305Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736139601` → **200**

```json
{
  "phone": "+380736139601",
  "audience": "CLIENT",
  "code": "309095",
  "sent_at": "2026-10-27T15:07:16.624637746Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f045599-fa69-4b25-8c62-f8e129339231",
  "code": "309095",
  "device_ref": "sandbox-7656"
}
```

```json
{
  "session_id": "9a5066c4-7bf4-41ec-a922-50a98a5b8f3a",
  "subject": {
    "type": "CLIENT",
    "id": "1ee287ab-43d0-421b-83b9-2280e6c802cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZWUyODdhYi00M2QwLTQyMWItODNiOS0yMjgwZTZjODAyY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTM2LCJpYXQiOjE3OTMxMTM2MzYsImp0aSI6IjZiYTQwYWRjLTUwZjgtNGUzMC05MTI2LTM3Y2Q3NGY5Nzk2NSIsInNpZCI6IjlhNTA2NmM0LTdiZjQtNDFlYy1hOTIyLTUwYTk4YTViOGYzYSJ9.GpA_XPi6jbIoDwMb3TJ2yXuji7y1bPmzqSK69sXBzbY",
  "access_expires_at": "2026-10-27T15:22:16.665722382Z",
  "refresh_token": "CvaSUECD4_gHWVzdljZfe_iB32OI2R6FGcrphUdopcY",
  "refresh_expires_at": "2026-11-26T15:07:16.665048392Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3196844c-9a96-4dfc-be70-5903e07cc158",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0a79625b-3056-4ecd-86f4-eaaa3e53ff9b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0a79625b-3056-4ecd-86f4-eaaa3e53ff9b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0f8dfb5548298a2f8690faa8e8df3ab6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0a79625b-3056-4ecd-86f4-eaaa3e53ff9b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736139601"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0a79625b-3056-4ecd-86f4-eaaa3e53ff9b",
  "expires_at": "2026-10-27T15:37:16.694464Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/0a79625b-3056-4ecd-86f4-eaaa3e53ff9b` → **200**

```json
{
  "id": "0a79625b-3056-4ecd-86f4-eaaa3e53ff9b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:37:16.694464Z",
  "card": {
    "id": "2911908b-1cf8-4a50-930b-b0461bd8a35f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4406",
    "card_type": "Visa",
    "created_at": "2026-10-27T15:07:16.733491Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "2911908b-1cf8-4a50-930b-b0461bd8a35f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4406",
      "card_type": "Visa",
      "created_at": "2026-10-27T15:07:16.733491Z"
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
  "device_ref": "sandbox-23510"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "082096e3-7672-41b1-8292-44bd49296aeb",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23510"
}
```

```json
{
  "challenge_id": "fd7290c4-8c14-48ee-a260-315148df568f",
  "expires_at": "2026-10-27T15:12:17.822093014Z",
  "resend_available_at": "2026-10-27T15:07:18.822093014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "900890",
  "sent_at": "2026-10-27T15:07:17.824500647Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd7290c4-8c14-48ee-a260-315148df568f",
  "code": "900890",
  "device_ref": "sandbox-23510"
}
```

```json
{
  "session_id": "1c1e2249-2991-4ca7-aa9c-8856f405f40a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDUzNywiaWF0IjoxNzkzMTEzNjM3LCJqdGkiOiJhZThhNGE5ZC1mNTMyLTQ0ODYtYmFiOC1jOGM5ODEyN2Q2M2QiLCJzaWQiOiIxYzFlMjI0OS0yOTkxLTRjYTctYWE5Yy04ODU2ZjQwNWY0MGEifQ.rufhj19rcxijxQeXHV2gBDVxQ_bVknxeHUKuLnwGmpI",
  "access_expires_at": "2026-10-27T15:22:17.868757609Z",
  "refresh_token": "db3t4CYHlbwj3c7RfvINZOe8jdOWALyUgrkffEM0OZ8",
  "refresh_expires_at": "2026-11-26T15:07:17.868017668Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:16.224275Z",
  "last_location_at": "2026-10-27T15:07:16.224275Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9/handover` → **200**

```json
{
  "command_id": "f3213ceb-6548-43fa-80bc-6119d3b30df2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:16.224275Z",
  "last_location_at": "2026-10-27T15:07:16.224275Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:17Z",
    "sequence": 1793113637938
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:17.95521Z",
  "last_location_at": "2026-10-27T15:07:17.95521Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "54cf8a55-86dd-4add-8236-dd1c7d8f8810",
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
  "id": "b534353d-7a15-4620-a5f6-61daf3e01b2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T15:12:17.986446Z",
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
  "command_id": "402bb1ff-fc68-41b2-bbef-e523363ae376",
  "quote_id": "b534353d-7a15-4620-a5f6-61daf3e01b2c",
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
  "id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1ee287ab-43d0-421b-83b9-2280e6c802cd",
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
  "created_at": "2026-10-27T15:07:18.017633Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/aa45d1fc-ea48-480c-be68-120c16cf253c` → **200**

```json
{
  "id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1ee287ab-43d0-421b-83b9-2280e6c802cd",
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
  "created_at": "2026-10-27T15:07:18.017633Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/aa45d1fc-ea48-480c-be68-120c16cf253c` → **200**

```json
{
  "id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1ee287ab-43d0-421b-83b9-2280e6c802cd",
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
  "created_at": "2026-10-27T15:07:18.017633Z",
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
    "id": "e2f8c303-49a8-478d-a0db-8dc1d8ca6224",
    "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
    "expires_at": "2026-10-27T15:07:33.987208Z",
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

`POST /api/driver/v1/offers/e2f8c303-49a8-478d-a0db-8dc1d8ca6224/accept` → **200**

```json
{
  "command_id": "e0652c21-b808-4694-b530-bf95c877f7f7"
}
```

```json
{
  "id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
  "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
  "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "assignment_id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
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

`POST /api/driver/v1/work-sessions/a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:19Z",
    "sequence": 1793113639159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:19.175489Z",
  "last_location_at": "2026-10-27T15:07:19.175489Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f18f8c9-6e74-4cc8-af84-d2472056764c/arrive` → **200**

```json
{
  "command_id": "ef23d984-e207-40a3-a0aa-17012b6a39b9",
  "expected_version": 0
}
```

```json
{
  "id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
  "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "assignment_id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
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
  "arrived_at": "2026-10-27T15:07:19.205051Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/1f18f8c9-6e74-4cc8-af84-d2472056764c/start` → **200**

```json
{
  "command_id": "cdce606c-4b52-4eca-92f1-00d9bfeffc0a",
  "expected_version": 1
}
```

```json
{
  "id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
  "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "assignment_id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
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
  "arrived_at": "2026-10-27T15:07:19.205051Z",
  "started_at": "2026-10-27T15:07:19.236678Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/1f18f8c9-6e74-4cc8-af84-d2472056764c/complete` → **200**

```json
{
  "command_id": "fa262d40-55a6-44ab-8ebb-7ed2e0a12275",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:07:19Z"
}
```

```json
{
  "id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
  "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "assignment_id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
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
  "arrived_at": "2026-10-27T15:07:19.205051Z",
  "started_at": "2026-10-27T15:07:19.236678Z",
  "completed_at": "2026-10-27T15:07:19.271355Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/aa45d1fc-ea48-480c-be68-120c16cf253c` → **200**

```json
{
  "id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1ee287ab-43d0-421b-83b9-2280e6c802cd",
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
    "id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
    "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:07:18.017633Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/aa45d1fc-ea48-480c-be68-120c16cf253c` → **200**

```json
{
  "id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1ee287ab-43d0-421b-83b9-2280e6c802cd",
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
    "id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
    "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:07:18.017633Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/aa45d1fc-ea48-480c-be68-120c16cf253c` → **200**

```json
{
  "id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1ee287ab-43d0-421b-83b9-2280e6c802cd",
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
    "id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
    "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:07:18.017633Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/aa45d1fc-ea48-480c-be68-120c16cf253c` → **200**

```json
{
  "id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1ee287ab-43d0-421b-83b9-2280e6c802cd",
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
    "id": "b5c98182-77f9-4078-b757-a22c7d1808b2",
    "order_id": "aa45d1fc-ea48-480c-be68-120c16cf253c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f18f8c9-6e74-4cc8-af84-d2472056764c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:07:18.017633Z",
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

Done: card order aa45d1fc-ea48-480c-be68-120c16cf253c.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739252134",
  "device_ref": "sandbox-24817"
}
```

```json
{
  "challenge_id": "ee97c6e3-6304-448e-9d86-89342b75e7d8",
  "expires_at": "2026-10-27T15:12:22.426094043Z",
  "resend_available_at": "2026-10-27T15:07:23.426094043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739252134` → **200**

```json
{
  "phone": "+380739252134",
  "audience": "CLIENT",
  "code": "838218",
  "sent_at": "2026-10-27T15:07:22.42925672Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee97c6e3-6304-448e-9d86-89342b75e7d8",
  "code": "838218",
  "device_ref": "sandbox-24817"
}
```

```json
{
  "session_id": "d37b4919-9e28-44d8-b668-a4c789a2cb89",
  "subject": {
    "type": "CLIENT",
    "id": "3deb11cf-a034-48f3-9b32-add46f9130c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZGViMTFjZi1hMDM0LTQ4ZjMtOWIzMi1hZGQ0NmY5MTMwYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTQyLCJpYXQiOjE3OTMxMTM2NDIsImp0aSI6IjI4OWMzODUwLWE3M2ItNDM5MC1iZjZmLTIxOTJhMjFjNzk4ZSIsInNpZCI6ImQzN2I0OTE5LTllMjgtNDRkOC1iNjY4LWE0Yzc4OWEyY2I4OSJ9.AMtcOIfw8oEmmBwZl5xk9YaidWk5d9i7FmbM4wLxh0U",
  "access_expires_at": "2026-10-27T15:22:22.474279401Z",
  "refresh_token": "MwKZvnCbwEA-ky86LGlyTxqy8CsFfTXcGVCbkXyZyXI",
  "refresh_expires_at": "2026-11-26T15:07:22.473612772Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "85b3c031-38e8-4152-a490-9e069b461684",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "e69d63f4-c668-42cb-b9ee-e70a4412a478",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e69d63f4-c668-42cb-b9ee-e70a4412a478",
    "orderDate": "1793113642",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "cc0bd59b351236026ee369d9b53b9aed",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e69d63f4-c668-42cb-b9ee-e70a4412a478",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739252134"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e69d63f4-c668-42cb-b9ee-e70a4412a478",
  "created_at": "2026-10-27T15:07:22.503107Z",
  "expires_at": "2026-10-27T15:37:22.503107Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/e69d63f4-c668-42cb-b9ee-e70a4412a478` → **200**

```json
{
  "id": "e69d63f4-c668-42cb-b9ee-e70a4412a478",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:07:22.503107Z",
  "expires_at": "2026-10-27T15:37:22.503107Z",
  "completed_at": "2026-10-27T15:07:22.533204Z",
  "masked_pan": "41****5613",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3deb11cf-a034-48f3-9b32-add46f9130c9",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3deb11cf-a034-48f3-9b32-add46f9130c9",
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
      "id": "3632ac75-eae9-44b0-8921-c3c80ec9d913",
      "at": "2026-10-27T15:07:23.074893Z",
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
  "client_id": "3deb11cf-a034-48f3-9b32-add46f9130c9",
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
      "id": "3632ac75-eae9-44b0-8921-c3c80ec9d913",
      "at": "2026-10-27T15:07:23.074893Z",
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
  "device_ref": "sandbox-28964"
}
```

```json
{
  "challenge_id": "f2147163-58f7-4fca-96d2-5bacd36614b1",
  "expires_at": "2026-10-27T15:12:23.638009866Z",
  "resend_available_at": "2026-10-27T15:07:24.638009866Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "762691",
  "sent_at": "2026-10-27T15:07:23.640552872Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2147163-58f7-4fca-96d2-5bacd36614b1",
  "code": "762691",
  "device_ref": "sandbox-28964"
}
```

```json
{
  "session_id": "ca27df13-d2d3-4037-a7c5-8ef84777d7f6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU0MywiaWF0IjoxNzkzMTEzNjQzLCJqdGkiOiI5ZTc2ZTBiMy03YjMxLTQ3NWUtYjk0Ni03YTNlYmU2ODUxZTkiLCJzaWQiOiJjYTI3ZGYxMy1kMmQzLTQwMzctYTdjNS04ZWY4NDc3N2Q3ZjYifQ.vFJoE09b8SWAwHZfoewGHLQFsm4F5mhEfXRhPWNkYQ0",
  "access_expires_at": "2026-10-27T15:22:23.682594966Z",
  "refresh_token": "nda-7-mUzzjCVrbn_TIXwZl-YZKbMg-PBikDy_DAyGk",
  "refresh_expires_at": "2026-11-26T15:07:23.682054445Z",
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
  "command_id": "681ceb58-6fda-47d2-addf-55de126aa1e0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "862384fd-0018-4084-a2e6-101dcd1535a1",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-862384fd-0018-4084-a2e6-101dcd1535a1",
    "orderDate": "1793113643",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "86bcb9c944745e5774b2cb473b037b2b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=862384fd-0018-4084-a2e6-101dcd1535a1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=862384fd-0018-4084-a2e6-101dcd1535a1",
  "created_at": "2026-10-27T15:07:23.72825Z",
  "expires_at": "2026-10-27T15:37:23.72825Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/862384fd-0018-4084-a2e6-101dcd1535a1` → **200**

```json
{
  "id": "862384fd-0018-4084-a2e6-101dcd1535a1",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:07:23.72825Z",
  "expires_at": "2026-10-27T15:37:23.72825Z",
  "completed_at": "2026-10-27T15:07:23.752075Z",
  "masked_pan": "41****3006",
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
      "id": "e2c933fb-c3a0-4312-b3a1-8b3ec92edadf",
      "at": "2026-10-27T15:07:24.081221Z",
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
  "command_id": "137e91a2-7374-4734-bdc4-1eae2bc8b9fc",
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
  "correlation_id": "11a99ec4-fa42-4297-bc70-e91b9a82fc91"
}
```

Done: the rider's account and the driver's balance were topped up by card.

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
  "device_ref": "sandbox-18981"
}
```

```json
{
  "challenge_id": "b675f9b9-a9af-4113-a8fd-7ecc8402d52f",
  "expires_at": "2026-10-27T15:12:24.890336771Z",
  "resend_available_at": "2026-10-27T15:07:25.890336771Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "787702",
  "sent_at": "2026-10-27T15:07:24.892825849Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b675f9b9-a9af-4113-a8fd-7ecc8402d52f",
  "code": "787702",
  "device_ref": "sandbox-18981"
}
```

```json
{
  "session_id": "e1ee048b-9adb-403a-b3ff-bb2880fe6b77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU0NCwiaWF0IjoxNzkzMTEzNjQ0LCJqdGkiOiJkNjk5MDAwMC1hZjMzLTRhMDYtYTJhNC04NWZmYWFkNTQwMWEiLCJzaWQiOiJlMWVlMDQ4Yi05YWRiLTQwM2EtYjNmZi1iYjI4ODBmZTZiNzcifQ.oB-L2lMx-alNuBGqN_dnY1HA7G7GaSP_e7LRNJ7_utw",
  "access_expires_at": "2026-10-27T15:22:24.936520327Z",
  "refresh_token": "Y-suIuLiWQjKrhGwygyS1oXk0ZxdECu0mWxM4MVJOJs",
  "refresh_expires_at": "2026-11-26T15:07:24.935562711Z",
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
  "command_id": "2f52e84b-e40a-4a02-bf81-c070b61c1593",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:24Z",
    "sequence": 1793113644973
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:24.988133Z",
  "last_location_at": "2026-10-27T15:07:24.988133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670286428",
  "device_ref": "sandbox-21819"
}
```

```json
{
  "challenge_id": "9d3a1d0b-022e-4192-ad90-2df3fc9797a3",
  "expires_at": "2026-10-27T15:12:25.013188416Z",
  "resend_available_at": "2026-10-27T15:07:26.013188416Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670286428` → **200**

```json
{
  "phone": "+380670286428",
  "audience": "CLIENT",
  "code": "098427",
  "sent_at": "2026-10-27T15:07:25.015647306Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d3a1d0b-022e-4192-ad90-2df3fc9797a3",
  "code": "098427",
  "device_ref": "sandbox-21819"
}
```

```json
{
  "session_id": "699d634f-160b-4c2d-a82e-2d0b7b12caa8",
  "subject": {
    "type": "CLIENT",
    "id": "c54b909e-25aa-42db-9aae-2d6e6461e59f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTRiOTA5ZS0yNWFhLTQyZGItOWFhZS0yZDZlNjQ2MWU1OWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTQ1LCJpYXQiOjE3OTMxMTM2NDUsImp0aSI6IjliMjE4NWVkLTNkNTQtNDBlYS1iYzAxLTY3ZTA4MGQ4MDliNyIsInNpZCI6IjY5OWQ2MzRmLTE2MGItNGMyZC1hODJlLTJkMGI3YjEyY2FhOCJ9.JdGx_2L91Gx_NLpRwUGy4PJMCUF6-1ykd1BJtGf5Kd4",
  "access_expires_at": "2026-10-27T15:22:25.05724631Z",
  "refresh_token": "iPXPO9hG2LKTJdyDaNCEHqtXkvggNYXAbRj-AXIohzA",
  "refresh_expires_at": "2026-11-26T15:07:25.056590218Z",
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
  "command_id": "8e65e60b-607d-4f73-8774-d336099e6723",
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
  "id": "3ff527d2-aabb-4e21-9879-394bbe1d3e84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:12:25.109236Z",
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
  "command_id": "60e2867c-55f9-4eb4-a3aa-c9bc187ce816",
  "platform": "ANDROID",
  "token": "sandbox-driver-d2f76dc8-4e21-4e30-b94b-58c3f1775557"
}
```

```json
{
  "id": "59f78e08-5680-4fe7-b151-2d9fcdc8e908",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:07:25.143977Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1ccc3d0e-8cc3-4101-83d1-be84be2f2186",
  "platform": "ANDROID",
  "token": "sandbox-rider-922d74ec-66de-4436-9cda-765685580667"
}
```

```json
{
  "id": "a9b13a33-70da-4ebe-8094-344527279d97",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:07:25.174114Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "55335f9d-70de-46f3-bdff-049f327501a3",
  "quote_id": "3ff527d2-aabb-4e21-9879-394bbe1d3e84",
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
  "id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c54b909e-25aa-42db-9aae-2d6e6461e59f",
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
  "created_at": "2026-10-27T15:07:25.206048Z",
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
    "id": "17531be2-3969-44ae-a38e-d2341d8559d9",
    "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
    "expires_at": "2026-10-27T15:07:40.209546Z",
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

`POST /api/driver/v1/offers/17531be2-3969-44ae-a38e-d2341d8559d9/accept` → **200**

```json
{
  "command_id": "11fa6d81-c8a8-41d3-bc64-577bf224319a"
}
```

```json
{
  "id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1af2bc61-4686-4c0f-9e25-696462100768",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:07:25.188Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:07:25.188Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:07:25.188Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:07:26.851578044Z",
    "token_suffix": "775557",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
      "order_version": "2",
      "event_id": "967ba28c-ddb8-404a-a99b-1c3680eaa5a3",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670286428&after=2026-10-27T15:07:25.188Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:07:26.849103737Z",
    "token_suffix": "580667",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
      "order_version": "3",
      "event_id": "f223738f-3c6b-4123-a967-b544a02bab83",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/02aaa3bf-6251-4a48-844a-0a8423af1224/messages` → **201**

```json
{
  "command_id": "db14f71a-52c0-426e-a02b-d05fbd9fe269",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "6beebc19-3950-4429-8a35-dbdc8b6b144f",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T15:07:27.387436615Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1af2bc61-4686-4c0f-9e25-696462100768",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "assignment_id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0",
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

`POST /api/driver/v1/trips/1af2bc61-4686-4c0f-9e25-696462100768/messages` → **201**

```json
{
  "command_id": "f880d8e8-634e-4881-8509-850cdf26860e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "39827c05-df6a-44a9-a3f0-17a55a6a45da",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T15:07:27.428191868Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/02aaa3bf-6251-4a48-844a-0a8423af1224/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/1af2bc61-4686-4c0f-9e25-696462100768/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670286428"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:27Z",
    "sequence": 1793113647484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:27.499923Z",
  "last_location_at": "2026-10-27T15:07:27.499923Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1af2bc61-4686-4c0f-9e25-696462100768",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "assignment_id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0",
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

`POST /api/driver/v1/trips/1af2bc61-4686-4c0f-9e25-696462100768/arrive` → **200**

```json
{
  "command_id": "1efe8556-ec4c-4298-8a1e-02d532aa7bee",
  "expected_version": 0
}
```

```json
{
  "id": "1af2bc61-4686-4c0f-9e25-696462100768",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "assignment_id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0",
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
  "arrived_at": "2026-10-27T15:07:27.538892Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/1af2bc61-4686-4c0f-9e25-696462100768/start` → **200**

```json
{
  "command_id": "f93db818-d527-47cf-bd7b-213489f534a3",
  "expected_version": 1
}
```

```json
{
  "id": "1af2bc61-4686-4c0f-9e25-696462100768",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "assignment_id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0",
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
  "arrived_at": "2026-10-27T15:07:27.538892Z",
  "started_at": "2026-10-27T15:07:27.564666Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:27Z",
    "sequence": 1793113647583
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:27.598252Z",
  "last_location_at": "2026-10-27T15:07:27.598252Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/1af2bc61-4686-4c0f-9e25-696462100768/complete` → **200**

```json
{
  "command_id": "9fc1fb3f-06bb-40f3-bfb2-aa5959b1326f",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:07:27Z",
  "cash_received": true
}
```

```json
{
  "id": "1af2bc61-4686-4c0f-9e25-696462100768",
  "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "assignment_id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0",
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
  "arrived_at": "2026-10-27T15:07:27.538892Z",
  "started_at": "2026-10-27T15:07:27.564666Z",
  "completed_at": "2026-10-27T15:07:27.625333Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/02aaa3bf-6251-4a48-844a-0a8423af1224` → **200**

```json
{
  "id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c54b909e-25aa-42db-9aae-2d6e6461e59f",
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
    "id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0",
    "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1af2bc61-4686-4c0f-9e25-696462100768",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:07:25.206048Z",
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
    "id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:07:25.206048Z",
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
    "id": "1af2bc61-4686-4c0f-9e25-696462100768",
    "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
    "order_short_number": 5,
    "created_at": "2026-10-27T15:07:25.26297Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "61de1c20-16f0-4b21-8b49-8aceb1ddf4d3",
    "order_id": "0ee82183-06cc-4ea2-9737-56a910cd7168",
    "order_short_number": 1,
    "created_at": "2026-10-27T15:07:11.768505Z",
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
  "session_id": "0b3398c3-b543-47de-80f6-9cb9c979d6b3",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NTAsImlhdCI6MTc5MzExMzY1MCwianRpIjoiNjg4ZTY2MDctMTQ3Mi00YTNmLWIwYmEtZjIzODk4ODdjNjQ4Iiwic2lkIjoiMGIzMzk4YzMtYjU0My00N2RlLTgwZjYtOWNiOWM5NzlkNmIzIn0._zEH_oKWQeOPZUcHZlgi6srrqng4so120nAxKByb9eM",
  "access_expires_at": "2026-10-27T15:22:30.98927356Z",
  "refresh_token": "bQ6OId0NPQwJ5pxCUsvjBd7gmj4Z4trEI_zZZgMTOk0",
  "refresh_expires_at": "2026-10-28T03:07:30.98855438Z",
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
  "session_id": "74192f7b-db34-4d9a-ab53-de0cf8bc78ef",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NTEsImlhdCI6MTc5MzExMzY1MSwianRpIjoiMGI0MzU4ZDctODI4OS00MWI4LTkyNWEtNjU1YmVkZjA4MzAzIiwic2lkIjoiNzQxOTJmN2ItZGIzNC00ZDlhLWFiNTMtZGUwY2Y4YmM3OGVmIn0.B-Jb9ZJtpQlijA6VFfY6rs6moCe4B1Ys_sbOXKddegg",
  "access_expires_at": "2026-10-27T15:22:31.264023227Z",
  "refresh_token": "RRU4zZHMrnHEebcpnKWIVe7KmcCKgTOW3GRubiv0vbU",
  "refresh_expires_at": "2026-10-28T03:07:31.263305576Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/02aaa3bf-6251-4a48-844a-0a8423af1224/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:07:25.20664Z",
      "actor": {
        "type": "CLIENT",
        "id": "c54b909e-25aa-42db-9aae-2d6e6461e59f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
        "quote_id": "3ff527d2-aabb-4e21-9879-394bbe1d3e84",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:07:25.208543Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
        "attempt_id": "d319eb56-a861-49a2-bd7d-44e8990cd253",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:07:25.213678Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "17531be2-3969-44ae-a38e-d2341d8559d9",
        "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:07:25.264746Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "17531be2-3969-44ae-a38e-d2341d8559d9",
        "order_id": "02aaa3bf-6251-4a48-844a-0a8423af1224",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "30225c62-5791-4ee7-830d-3e92ecb9e7c0"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 02aaa3bf-6251-4a48-844a-0a8423af1224.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11731"
}
```

```json
{
  "challenge_id": "0e989aa6-f02a-4abe-825b-f352f43e19b6",
  "expires_at": "2026-10-27T15:12:31.314950212Z",
  "resend_available_at": "2026-10-27T15:07:32.314950212Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "523672",
  "sent_at": "2026-10-27T15:07:31.317116728Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e989aa6-f02a-4abe-825b-f352f43e19b6",
  "code": "523672",
  "device_ref": "sandbox-11731"
}
```

```json
{
  "session_id": "edb26cf5-67b4-484f-aa3d-d06696b7ffa4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU1MSwiaWF0IjoxNzkzMTEzNjUxLCJqdGkiOiIzOWYwOTY2NS02NWQxLTQzNzItOGE1YS0zOGRjMzU0Y2QzZjUiLCJzaWQiOiJlZGIyNmNmNS02N2I0LTQ4NGYtYWEzZC1kMDY2OTZiN2ZmYTQifQ.4AYDiauDJkB-3V89WLl2bNyxEu21TgOThyPMJTk_lfg",
  "access_expires_at": "2026-10-27T15:22:31.356422735Z",
  "refresh_token": "_PYHczi8vh7ycDq80tTq07ZTxHjovoj2AMnFk2Y_G0c",
  "refresh_expires_at": "2026-11-26T15:07:31.355988639Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:27.598252Z",
  "last_location_at": "2026-10-27T15:07:27.598252Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/handover` → **200**

```json
{
  "command_id": "4638c3d7-7671-4375-955b-ab1bd083c1b8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:27.598252Z",
  "last_location_at": "2026-10-27T15:07:27.598252Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:31Z",
    "sequence": 1793113651420
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:31.434673Z",
  "last_location_at": "2026-10-27T15:07:31.434673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663962333",
  "device_ref": "sandbox-26086"
}
```

```json
{
  "challenge_id": "2c28bf87-af39-42c2-b15d-602f95563c71",
  "expires_at": "2026-10-27T15:12:31.453585469Z",
  "resend_available_at": "2026-10-27T15:07:32.453585469Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663962333` → **200**

```json
{
  "phone": "+380663962333",
  "audience": "CLIENT",
  "code": "690002",
  "sent_at": "2026-10-27T15:07:31.455739563Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c28bf87-af39-42c2-b15d-602f95563c71",
  "code": "690002",
  "device_ref": "sandbox-26086"
}
```

```json
{
  "session_id": "a9dcbe7d-b02c-485e-93d0-868e629fe59d",
  "subject": {
    "type": "CLIENT",
    "id": "89107572-6314-4f1c-b3df-0f2a3b934a86"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTEwNzU3Mi02MzE0LTRmMWMtYjNkZi0wZjJhM2I5MzRhODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTUxLCJpYXQiOjE3OTMxMTM2NTEsImp0aSI6IjM5MDlhNTNkLTg4MWEtNGEyNi05ZWVhLWExYzFlNWNmODNjYSIsInNpZCI6ImE5ZGNiZTdkLWIwMmMtNDg1ZS05M2QwLTg2OGU2MjlmZTU5ZCJ9.TWgROj607Yua8q3D18UK3oO-QjKPghp1qu4IiHu8Q7g",
  "access_expires_at": "2026-10-27T15:22:31.496010566Z",
  "refresh_token": "xC4T0BpgT9U8ndmFt8nAa6bLPehyyZXn4jPH1-O31zU",
  "refresh_expires_at": "2026-11-26T15:07:31.495465471Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c33fff5-a2a4-4e3c-a12a-c1a6eba26ae1",
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
  "id": "f0ccc548-9ed5-4815-93e1-e9032165ea6b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T15:12:31.521570Z",
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
  "command_id": "efec0fb1-93f0-4efe-a730-946190a8b5d2",
  "quote_id": "f0ccc548-9ed5-4815-93e1-e9032165ea6b",
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
  "id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89107572-6314-4f1c-b3df-0f2a3b934a86",
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
  "created_at": "2026-10-27T15:07:31.549638Z",
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
    "id": "d21b1b37-93f6-4791-8536-cd65aea33c13",
    "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
    "expires_at": "2026-10-27T15:07:46.552328Z",
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

`POST /api/driver/v1/offers/d21b1b37-93f6-4791-8536-cd65aea33c13/accept` → **200**

```json
{
  "command_id": "6049ad0a-0480-42f9-a183-bfcdb6b62516"
}
```

```json
{
  "id": "f9c696fe-476d-4304-8632-3c1f5c8e28e1",
  "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c60f94c-a23b-4ca1-bb60-372c500d7616",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c60f94c-a23b-4ca1-bb60-372c500d7616",
  "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
  "assignment_id": "f9c696fe-476d-4304-8632-3c1f5c8e28e1",
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

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:31Z",
    "sequence": 1793113651631
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:31.646642Z",
  "last_location_at": "2026-10-27T15:07:31.646642Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9c60f94c-a23b-4ca1-bb60-372c500d7616/arrive` → **200**

```json
{
  "command_id": "ec9b1dde-3bee-4e72-a843-da6cd8032bae",
  "expected_version": 0
}
```

```json
{
  "id": "9c60f94c-a23b-4ca1-bb60-372c500d7616",
  "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
  "assignment_id": "f9c696fe-476d-4304-8632-3c1f5c8e28e1",
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
  "arrived_at": "2026-10-27T15:07:31.67464Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/9c60f94c-a23b-4ca1-bb60-372c500d7616/start` → **200**

```json
{
  "command_id": "187e797a-6f8b-4e8e-af0b-deb7a367bff9",
  "expected_version": 1
}
```

```json
{
  "id": "9c60f94c-a23b-4ca1-bb60-372c500d7616",
  "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
  "assignment_id": "f9c696fe-476d-4304-8632-3c1f5c8e28e1",
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
  "arrived_at": "2026-10-27T15:07:31.67464Z",
  "started_at": "2026-10-27T15:07:31.708548Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:31Z",
    "sequence": 1793113651727
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:31.743069Z",
  "last_location_at": "2026-10-27T15:07:31.743069Z",
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
  "device_ref": "sandbox-14892"
}
```

```json
{
  "challenge_id": "3980ff0e-78c0-4526-a78a-b65230c073ed",
  "expires_at": "2026-10-27T15:12:31.76173601Z",
  "resend_available_at": "2026-10-27T15:07:32.76173601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "997889",
  "sent_at": "2026-10-27T15:07:31.76406917Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3980ff0e-78c0-4526-a78a-b65230c073ed",
  "code": "997889",
  "device_ref": "sandbox-14892"
}
```

```json
{
  "session_id": "0d441931-20a9-47c0-b232-8ee22eadda1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU1MSwiaWF0IjoxNzkzMTEzNjUxLCJqdGkiOiIwYmM5NDAwOS03M2UxLTQ5ZTYtYWRiOS0xOGVkMDJlN2QxODciLCJzaWQiOiIwZDQ0MTkzMS0yMGE5LTQ3YzAtYjIzMi04ZWUyMmVhZGRhMWQifQ.N8Tpzfw_Px88y6Udk09g558EneNLQnikEvqSX4YgJKI",
  "access_expires_at": "2026-10-27T15:22:31.804613747Z",
  "refresh_token": "PnlUwTjanZ32UFuUBeEDnGqZqcRZXZFBzUgjDUGnJNk",
  "refresh_expires_at": "2026-11-26T15:07:31.803989278Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1b6ec5ed-0299-4587-afe8-d131982a3d37",
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
  "last_heartbeat_at": "2026-10-27T15:07:16.098461Z",
  "last_location_at": "2026-10-27T15:07:16.098461Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1b6ec5ed-0299-4587-afe8-d131982a3d37/handover` → **200**

```json
{
  "command_id": "36a89cb9-ab7a-4831-99ce-9abe62cca28d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1b6ec5ed-0299-4587-afe8-d131982a3d37",
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
  "last_heartbeat_at": "2026-10-27T15:07:16.098461Z",
  "last_location_at": "2026-10-27T15:07:16.098461Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1b6ec5ed-0299-4587-afe8-d131982a3d37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:31Z",
    "sequence": 1793113651869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1b6ec5ed-0299-4587-afe8-d131982a3d37",
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
  "last_heartbeat_at": "2026-10-27T15:07:31.884416Z",
  "last_location_at": "2026-10-27T15:07:31.884416Z",
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
  "session_id": "36ac318f-47c1-47ae-8d23-0cbf08365216",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NTIsImlhdCI6MTc5MzExMzY1MiwianRpIjoiOWY0YWY4YTAtNTg0Ni00OTI1LWEzMWUtOGVlZWQ4ZTJlNTU1Iiwic2lkIjoiMzZhYzMxOGYtNDdjMS00N2FlLThkMjMtMGNiZjA4MzY1MjE2In0.gFdD3ml7tALzEd-Gs4VxpdQCwk1v-WSOUK2iZratOF4",
  "access_expires_at": "2026-10-27T15:22:32.13360322Z",
  "refresh_token": "Vw8g_93eNnoQTpmKviDAqumfeury5lX1mz4munhyybA",
  "refresh_expires_at": "2026-10-28T03:07:32.1330918Z",
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
  "session_id": "41433cd7-c29f-4872-941c-7949b6f45a9e",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NTIsImlhdCI6MTc5MzExMzY1MiwianRpIjoiMWFmYzRhM2QtMTM0Ny00ODUyLWIwNTItZjk3NWFjODY3YzZlIiwic2lkIjoiNDE0MzNjZDctYzI5Zi00ODcyLTk0MWMtNzk0OWI2ZjQ1YTllIn0.YMgLIBWjBnr3Ap_AJwHnWEddbH6EzF5135YlCdn_RaA",
  "access_expires_at": "2026-10-27T15:22:32.385593558Z",
  "refresh_token": "XR0hig31v3MMuGYR417_JDmRt7QL_fN9mGDE5_XKCqc",
  "refresh_expires_at": "2026-10-28T03:07:32.385005139Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a8646b02-f0ca-4d1b-b901-cbfe226b11f8` → **200**

```json
{
  "id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "89107572-6314-4f1c-b3df-0f2a3b934a86",
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
    "id": "f9c696fe-476d-4304-8632-3c1f5c8e28e1",
    "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9c60f94c-a23b-4ca1-bb60-372c500d7616",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T15:07:31.549638Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a8646b02-f0ca-4d1b-b901-cbfe226b11f8/interrupt` → **200**

```json
{
  "command_id": "27e6fa11-d51f-4e1c-b66c-bf1a664f9d6e",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "89107572-6314-4f1c-b3df-0f2a3b934a86",
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
      "id": "f9c696fe-476d-4304-8632-3c1f5c8e28e1",
      "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9c60f94c-a23b-4ca1-bb60-372c500d7616",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T15:07:31.549638Z",
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
    "id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "89107572-6314-4f1c-b3df-0f2a3b934a86",
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
    "id": "2c93759d-c6d8-40e0-9720-a35ff4c9743f",
    "order_id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
    "expires_at": "2026-10-27T15:07:47.461847Z",
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

`POST /api/driver/v1/offers/2c93759d-c6d8-40e0-9720-a35ff4c9743f/accept` → **200**

```json
{
  "command_id": "38eaf1e6-30cb-4a68-99a2-f7e1de3787f1"
}
```

```json
{
  "id": "62502351-90e5-4902-b4d5-4a36c900c2ab",
  "order_id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3d21c1ff-d813-43bb-8993-f2eee833cda7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3d21c1ff-d813-43bb-8993-f2eee833cda7",
  "order_id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
  "assignment_id": "62502351-90e5-4902-b4d5-4a36c900c2ab",
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
  "session_id": "1b6ec5ed-0299-4587-afe8-d131982a3d37",
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
  "last_heartbeat_at": "2026-10-27T15:07:31.884416Z",
  "last_location_at": "2026-10-27T15:07:31.884416Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/1b6ec5ed-0299-4587-afe8-d131982a3d37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:32Z",
    "sequence": 1793113652567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1b6ec5ed-0299-4587-afe8-d131982a3d37",
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
  "last_heartbeat_at": "2026-10-27T15:07:32.582359Z",
  "last_location_at": "2026-10-27T15:07:32.582359Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3d21c1ff-d813-43bb-8993-f2eee833cda7/arrive` → **200**

```json
{
  "command_id": "dd0675ed-9c33-49fd-a5ba-640c533d5726",
  "expected_version": 0
}
```

```json
{
  "id": "3d21c1ff-d813-43bb-8993-f2eee833cda7",
  "order_id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
  "assignment_id": "62502351-90e5-4902-b4d5-4a36c900c2ab",
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
  "arrived_at": "2026-10-27T15:07:32.61045Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3d21c1ff-d813-43bb-8993-f2eee833cda7/start` → **200**

```json
{
  "command_id": "d470e655-6340-472b-9ac7-2703b8fe2c4e",
  "expected_version": 1
}
```

```json
{
  "id": "3d21c1ff-d813-43bb-8993-f2eee833cda7",
  "order_id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
  "assignment_id": "62502351-90e5-4902-b4d5-4a36c900c2ab",
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
  "arrived_at": "2026-10-27T15:07:32.61045Z",
  "started_at": "2026-10-27T15:07:32.643193Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3d21c1ff-d813-43bb-8993-f2eee833cda7/complete` → **200**

```json
{
  "command_id": "e84073be-08f0-4fad-b616-633eed0b8e7f",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:07:32Z"
}
```

```json
{
  "id": "3d21c1ff-d813-43bb-8993-f2eee833cda7",
  "order_id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
  "assignment_id": "62502351-90e5-4902-b4d5-4a36c900c2ab",
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
  "arrived_at": "2026-10-27T15:07:32.61045Z",
  "started_at": "2026-10-27T15:07:32.643193Z",
  "completed_at": "2026-10-27T15:07:32.677686Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "2bd11c03-91c7-4419-a92c-24f2e3e21975",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:07:32.451074Z",
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
    "id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:07:31.549638Z",
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

`GET /api/operator/v1/orders/a8646b02-f0ca-4d1b-b901-cbfe226b11f8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:07:31.5502Z",
      "actor": {
        "type": "CLIENT",
        "id": "89107572-6314-4f1c-b3df-0f2a3b934a86",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
        "quote_id": "f0ccc548-9ed5-4815-93e1-e9032165ea6b",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:07:31.551653Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
        "attempt_id": "1eb9caed-887a-4779-aecf-d72df68b7508",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:07:31.556198Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d21b1b37-93f6-4791-8536-cd65aea33c13",
        "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:07:31.601179Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d21b1b37-93f6-4791-8536-cd65aea33c13",
        "order_id": "a8646b02-f0ca-4d1b-b901-cbfe226b11f8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f9c696fe-476d-4304-8632-3c1f5c8e28e1"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted a8646b02-f0ca-4d1b-b901-cbfe226b11f8, follow-up 2bd11c03-91c7-4419-a92c-24f2e3e21975.

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
  "session_id": "b9ed8107-2cad-41d8-b181-02f7cc149001",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NTYsImlhdCI6MTc5MzExMzY1NiwianRpIjoiMWJhNzJmNTQtZDc3MS00MGIwLWI3OWEtODg0YmY0YzFhOWQ3Iiwic2lkIjoiYjllZDgxMDctMmNhZC00MWQ4LWIxODEtMDJmN2NjMTQ5MDAxIn0.p_RVWoy7-MBh2zE_coq1KnrNqtapiLyXWvpdgJlFD7E",
  "access_expires_at": "2026-10-27T15:22:36.017547155Z",
  "refresh_token": "1QrbUDVo64ifoOEgRQ6CkofI4avPDRsX4LU1uu_duzQ",
  "refresh_expires_at": "2026-10-28T03:07:36.016911041Z",
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
  "session_id": "dd255651-933e-4ba3-877a-e72459a260bf",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NTYsImlhdCI6MTc5MzExMzY1NiwianRpIjoiZjYwNTJkM2QtYTE4NS00N2Y1LTk5NzktNjE0YTNkZjA4ZWNhIiwic2lkIjoiZGQyNTU2NTEtOTMzZS00YmEzLTg3N2EtZTcyNDU5YTI2MGJmIn0.lZBWVon2SzptymyaT-lAdmeUMNRicA392iDM1rcb12Q",
  "access_expires_at": "2026-10-27T15:22:36.27823336Z",
  "refresh_token": "_lX_Jk9JcGLgam41VyQz1_iI3r-P0ifb2OeUa7giK0M",
  "refresh_expires_at": "2026-10-28T03:07:36.277699437Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19397"
}
```

```json
{
  "challenge_id": "7e8193d4-fe1e-4c77-a0e0-38ff973f7399",
  "expires_at": "2026-10-27T15:12:36.299520371Z",
  "resend_available_at": "2026-10-27T15:07:37.299520371Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "811571",
  "sent_at": "2026-10-27T15:07:36.301496925Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e8193d4-fe1e-4c77-a0e0-38ff973f7399",
  "code": "811571",
  "device_ref": "sandbox-19397"
}
```

```json
{
  "session_id": "68e12943-dc21-4294-ad3a-643013ce4ac6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU1NiwiaWF0IjoxNzkzMTEzNjU2LCJqdGkiOiI0ZDVmMDYyZC0yYzU5LTQ5YjAtYmJhMy00YTA2NzJmYzNmNTIiLCJzaWQiOiI2OGUxMjk0My1kYzIxLTQyOTQtYWQzYS02NDMwMTNjZTRhYzYifQ.lE_wg-6BHVVfb-V0LEOeYb7nWLk7lzVOy-MhfQ1mi94",
  "access_expires_at": "2026-10-27T15:22:36.341940701Z",
  "refresh_token": "wUFe0dRxAydyDOMCawd1AT7nr4UAPjM1-FJvDSG13FY",
  "refresh_expires_at": "2026-11-26T15:07:36.341501659Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:31.743069Z",
  "last_location_at": "2026-10-27T15:07:31.743069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/handover` → **200**

```json
{
  "command_id": "4e6ab979-cf82-4d2e-b9d3-b507fd8ffab6",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:31.743069Z",
  "last_location_at": "2026-10-27T15:07:31.743069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:36Z",
    "sequence": 1793113656404
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:36.418886Z",
  "last_location_at": "2026-10-27T15:07:36.418886Z",
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
  "command_id": "b61beb65-0743-44e0-b103-889dbe4ce882",
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
  "effective_at": "2026-10-27T15:07:36.479557Z",
  "changed_by": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T15:07:36.50395115Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "63456ac8-5b19-4505-b6ff-47317c4755a5",
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
  "id": "dd5c1946-18b1-46eb-99f2-642a2b7e08d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:12:36.539702Z",
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
  "command_id": "9acc9fb5-d3e4-4012-8b79-7ae133a70168",
  "quote_id": "dd5c1946-18b1-46eb-99f2-642a2b7e08d2",
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
    "phone": "+3806711124213"
  }
}
```

```json
{
  "id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
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
  "created_at": "2026-10-27T15:07:36.579558Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124213"
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
    "id": "7740577c-56bf-4341-a6e1-4723edabee5a",
    "order_id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
    "expires_at": "2026-10-27T15:07:51.583748Z",
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

`POST /api/driver/v1/offers/7740577c-56bf-4341-a6e1-4723edabee5a/accept` → **200**

```json
{
  "command_id": "3085c987-ff8c-4de5-a6d1-af2b1e620e2f"
}
```

```json
{
  "id": "e344a649-1854-446f-b467-217d5389d76a",
  "order_id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b4196308-09ee-4e21-9ba8-514ad417a537",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b4196308-09ee-4e21-9ba8-514ad417a537",
  "order_id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
  "assignment_id": "e344a649-1854-446f-b467-217d5389d76a",
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

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:36Z",
    "sequence": 1793113656663
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:36.677454Z",
  "last_location_at": "2026-10-27T15:07:36.677454Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b4196308-09ee-4e21-9ba8-514ad417a537/arrive` → **200**

```json
{
  "command_id": "79b5715c-d6a2-4c10-87f2-4d4332481aec",
  "expected_version": 0
}
```

```json
{
  "id": "b4196308-09ee-4e21-9ba8-514ad417a537",
  "order_id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
  "assignment_id": "e344a649-1854-446f-b467-217d5389d76a",
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
  "arrived_at": "2026-10-27T15:07:36.702634Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/b4196308-09ee-4e21-9ba8-514ad417a537/start` → **200**

```json
{
  "command_id": "f94dab5d-c706-41e2-9611-410e9b68b465",
  "expected_version": 1
}
```

```json
{
  "id": "b4196308-09ee-4e21-9ba8-514ad417a537",
  "order_id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
  "assignment_id": "e344a649-1854-446f-b467-217d5389d76a",
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
  "arrived_at": "2026-10-27T15:07:36.702634Z",
  "started_at": "2026-10-27T15:07:36.734037Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/b4196308-09ee-4e21-9ba8-514ad417a537/complete` → **200**

```json
{
  "command_id": "0385725a-a35b-4c38-a769-e1c880c56adf",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:07:36Z",
  "cash_received": true
}
```

```json
{
  "id": "b4196308-09ee-4e21-9ba8-514ad417a537",
  "order_id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
  "assignment_id": "e344a649-1854-446f-b467-217d5389d76a",
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
  "arrived_at": "2026-10-27T15:07:36.702634Z",
  "started_at": "2026-10-27T15:07:36.734037Z",
  "completed_at": "2026-10-27T15:07:36.766996Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "267f38b4-2451-4c0d-ac42-4e4317cb593f",
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
  "id": "d7890517-3923-4ffa-bb75-b832f62b47f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:12:36.811511Z",
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
  "command_id": "d62e4838-5c4f-4062-88a1-c16d1b158d2a",
  "quote_id": "d7890517-3923-4ffa-bb75-b832f62b47f2",
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
    "phone": "+3806711123581"
  }
}
```

```json
{
  "id": "74b08c52-cbb1-480c-bf70-7ae67452670f",
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
  "created_at": "2026-10-27T15:07:36.850805Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123581"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/74b08c52-cbb1-480c-bf70-7ae67452670f` → **200**

```json
{
  "id": "74b08c52-cbb1-480c-bf70-7ae67452670f",
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
  "created_at": "2026-10-27T15:07:36.850805Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123581"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/74b08c52-cbb1-480c-bf70-7ae67452670f/cancel` → **200**

```json
{
  "command_id": "e89f92c2-05bd-4bbc-801b-713522b8e80d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "74b08c52-cbb1-480c-bf70-7ae67452670f",
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
  "created_at": "2026-10-27T15:07:36.850805Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123581"
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
  "staff_id": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T15:07:36.772795Z",
  "last_entries": [
    {
      "order_id": "74b08c52-cbb1-480c-bf70-7ae67452670f",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T15:07:36.91715Z"
    },
    {
      "order_id": "9ab4bfe0-ace3-4da6-ab72-83291bf93349",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T15:07:36.772795Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c",
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
  "last_heartbeat_at": "2026-10-27T15:07:36.677454Z",
  "last_location_at": "2026-10-27T15:07:36.677454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4e9e0a1-c34a-44c6-aaa4-536380ca1a8c/close` → **200**

```json
{
  "command_id": "cf1a6948-8ae0-4473-889c-0892e3dfd666",
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

Done: operator bonus for fulfilled 9ab4bfe0-ace3-4da6-ab72-83291bf93349 and operator-fault cancellation 74b08c52-cbb1-480c-bf70-7ae67452670f.

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
  "session_id": "cef0e6bd-2dd7-4c6e-bfe1-89ac329f6aa6",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NTksImlhdCI6MTc5MzExMzY1OSwianRpIjoiOTRlMTA5MDYtOTA2Zi00ZWJiLWIyZTktMDFiMDhlY2Y4MGViIiwic2lkIjoiY2VmMGU2YmQtMmRkNy00YzZlLWJmZTEtODlhYzMyOWY2YWE2In0.NA66T9ufTb1OLQ3_SdadMQDohA5PU1Na1e1a4UxHiCs",
  "access_expires_at": "2026-10-27T15:22:39.312027163Z",
  "refresh_token": "YM6uEDpKn0kkXhn8jA153WxHqn19VR5mzI7NpvxHdfI",
  "refresh_expires_at": "2026-10-28T03:07:39.311579044Z",
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
  "command_id": "8966fa9b-40db-4484-a734-129e6eb3235a",
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
  "changed_by": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T15:07:39.377779004Z"
}
```

## The rider books the airport for 2026-10-27T18:07:39Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600224480",
  "device_ref": "sandbox-12187"
}
```

```json
{
  "challenge_id": "3ddf2208-c398-41aa-a9bd-0b6ca56adeab",
  "expires_at": "2026-10-27T15:12:39.405714159Z",
  "resend_available_at": "2026-10-27T15:07:40.405714159Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600224480` → **200**

```json
{
  "phone": "+48600224480",
  "audience": "CLIENT",
  "code": "264575",
  "sent_at": "2026-10-27T15:07:39.407663895Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ddf2208-c398-41aa-a9bd-0b6ca56adeab",
  "code": "264575",
  "device_ref": "sandbox-12187"
}
```

```json
{
  "session_id": "2ca5d393-61de-40be-b567-c6d2a92501fc",
  "subject": {
    "type": "CLIENT",
    "id": "be5bff81-4a18-4eb5-8e12-bd93a2d4a248"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTViZmY4MS00YTE4LTRlYjUtOGUxMi1iZDkzYTJkNGEyNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTU5LCJpYXQiOjE3OTMxMTM2NTksImp0aSI6ImUwOWViZWMwLWMxOWUtNDY4My1hNDQ0LWJlNmQwZmU1NTVhYSIsInNpZCI6IjJjYTVkMzkzLTYxZGUtNDBiZS1iNTY3LWM2ZDJhOTI1MDFmYyJ9.q226ejTPAO0VNK6R7dbOAAdAWdajDCQDdUkfUoeKUnc",
  "access_expires_at": "2026-10-27T15:22:39.450606206Z",
  "refresh_token": "67phC5KhQhqdYuULkiX2K6cEApa89Kc0btl93BWU0og",
  "refresh_expires_at": "2026-11-26T15:07:39.450086587Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "caf9a457-f735-44fd-8df7-a4288e86a4b5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T18:07:39Z"
}
```

```json
{
  "id": "c743c7ca-1c31-4dac-a658-8e6a0d1fab9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T15:12:39.479583Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T18:07:39Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c8836ee9-1c94-4994-a290-dd6d0a8f8fbb",
  "quote_id": "c743c7ca-1c31-4dac-a658-8e6a0d1fab9e",
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
  "pickup_at": "2026-10-27T18:07:39Z"
}
```

```json
{
  "id": "6fba0218-f8fa-455a-96ab-764231c38a33",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "be5bff81-4a18-4eb5-8e12-bd93a2d4a248",
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
  "created_at": "2026-10-27T15:07:39.511188Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T18:07:39Z",
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
  "device_ref": "sandbox-7950"
}
```

```json
{
  "challenge_id": "2e1bb13b-100a-45a3-83a8-0c5b00778f2e",
  "expires_at": "2026-10-27T15:12:39.536509616Z",
  "resend_available_at": "2026-10-27T15:07:40.536509616Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "974189",
  "sent_at": "2026-10-27T15:07:39.538495371Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e1bb13b-100a-45a3-83a8-0c5b00778f2e",
  "code": "974189",
  "device_ref": "sandbox-7950"
}
```

```json
{
  "session_id": "b10965a9-0f1d-4d30-8cf0-5efeed407a20",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU1OSwiaWF0IjoxNzkzMTEzNjU5LCJqdGkiOiJkN2Y2NmJjYS02ZDQ2LTRiNTEtOTBlNS04ZGFjMDEzY2NjMjUiLCJzaWQiOiJiMTA5NjVhOS0wZjFkLTRkMzAtOGNmMC01ZWZlZWQ0MDdhMjAifQ.Jrkrjo1Utplm4Lb2Ml3AwCv80sbIlAGX9DVqDAnndjA",
  "access_expires_at": "2026-10-27T15:22:39.581140313Z",
  "refresh_token": "DtRZOWV_7I0cSUcImEltiVNBnh7KNVs6CZAaWPQ8TUQ",
  "refresh_expires_at": "2026-11-26T15:07:39.580367764Z",
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
  "command_id": "2b173650-5c36-434e-9d0a-b893a2dc038a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:39Z",
    "sequence": 1793113659619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "07ce08a7-f317-413f-87e9-55d7abd9068c",
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
  "last_heartbeat_at": "2026-10-27T15:07:39.633991Z",
  "last_location_at": "2026-10-27T15:07:39.633991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6fba0218-f8fa-455a-96ab-764231c38a33",
      "short_number": 10,
      "pickup_at": "2026-10-27T18:07:39Z",
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

`POST /api/driver/v1/preorders/6fba0218-f8fa-455a-96ab-764231c38a33/reserve` → **200**

```json
{
  "command_id": "7625a14c-0a42-4808-8081-5c33c3e079a6"
}
```

```json
{
  "id": "c4998887-80ab-4c93-87d3-44f9df7dbc49",
  "state": "RESERVED",
  "order": {
    "order_id": "6fba0218-f8fa-455a-96ab-764231c38a33",
    "short_number": 10,
    "pickup_at": "2026-10-27T18:07:39Z",
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
  "reserved_at": "2026-10-27T15:07:39.689081Z",
  "confirm_from": "2026-10-27T17:37:39Z",
  "confirm_until": "2026-10-27T17:47:39Z",
  "drop_until": "2026-10-27T17:07:39Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c4998887-80ab-4c93-87d3-44f9df7dbc49",
      "state": "RESERVED",
      "order": {
        "order_id": "6fba0218-f8fa-455a-96ab-764231c38a33",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:07:39Z",
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
      "reserved_at": "2026-10-27T15:07:39.689081Z",
      "confirm_from": "2026-10-27T17:37:39Z",
      "confirm_until": "2026-10-27T17:47:39Z",
      "drop_until": "2026-10-27T17:07:39Z"
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
      "id": "c4998887-80ab-4c93-87d3-44f9df7dbc49",
      "state": "RESERVED",
      "order": {
        "order_id": "6fba0218-f8fa-455a-96ab-764231c38a33",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:07:39Z",
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
      "reserved_at": "2026-10-27T15:07:39.689081Z",
      "confirm_from": "2026-10-27T17:37:39Z",
      "confirm_until": "2026-10-27T17:47:39Z",
      "drop_until": "2026-10-27T17:07:39Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c4998887-80ab-4c93-87d3-44f9df7dbc49/confirm` → **409**

```json
{
  "command_id": "805597ad-94f4-4264-9b47-b3610c841300"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c4998887-80ab-4c93-87d3-44f9df7dbc49/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "278ca68a-dcd7-4c83-b946-b7bf26cfdecd"
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
  "session_id": "dedd6087-4060-43d9-acdd-b4a5ac560930",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjAsImlhdCI6MTc5MzExMzY2MCwianRpIjoiMGI1MDJmOGMtMDFlYi00NjVkLWI4NDktNWQ0MmU1YmZmZDNmIiwic2lkIjoiZGVkZDYwODctNDA2MC00M2Q5LWFjZGQtYjRhNWFjNTYwOTMwIn0.QIbpPJHjlBnDO90gpKdhVJoYdxD9zkLL0AEZ3Jy0jBQ",
  "access_expires_at": "2026-10-27T15:22:40.051430542Z",
  "refresh_token": "Pb8uuOdiQfEIInN6zRA_04hC-tdVdKs9Pui80CYfG8Y",
  "refresh_expires_at": "2026-10-28T03:07:40.050949591Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6fba0218-f8fa-455a-96ab-764231c38a33` → **200**

```json
{
  "id": "6fba0218-f8fa-455a-96ab-764231c38a33",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "be5bff81-4a18-4eb5-8e12-bd93a2d4a248",
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
  "created_at": "2026-10-27T15:07:39.511188Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T18:07:39Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c4998887-80ab-4c93-87d3-44f9df7dbc49",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T15:07:39.689081Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6fba0218-f8fa-455a-96ab-764231c38a33/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T15:07:39.512519Z",
      "actor": {
        "type": "CLIENT",
        "id": "be5bff81-4a18-4eb5-8e12-bd93a2d4a248",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6fba0218-f8fa-455a-96ab-764231c38a33",
        "preorder": true,
        "quote_id": "c743c7ca-1c31-4dac-a658-8e6a0d1fab9e",
        "pickup_at": "2026-10-27T18:07:39Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T15:07:39.690489Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6fba0218-f8fa-455a-96ab-764231c38a33",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c4998887-80ab-4c93-87d3-44f9df7dbc49"
      }
    }
  ]
}
```

Done: pre-order 6fba0218-f8fa-455a-96ab-764231c38a33, reservation c4998887-80ab-4c93-87d3-44f9df7dbc49.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32295"
}
```

```json
{
  "challenge_id": "5fe83d97-adf5-4b6e-931d-2c1a7df0b37b",
  "expires_at": "2026-10-27T15:12:40.125783087Z",
  "resend_available_at": "2026-10-27T15:07:41.125783087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "184986",
  "sent_at": "2026-10-27T15:07:40.127693241Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fe83d97-adf5-4b6e-931d-2c1a7df0b37b",
  "code": "184986",
  "device_ref": "sandbox-32295"
}
```

```json
{
  "session_id": "9e0534bb-9896-4f78-9017-6cac7a5a4c70",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU2MCwiaWF0IjoxNzkzMTEzNjYwLCJqdGkiOiIwNTA5NWRlOS1jNDFmLTQ0NWMtODhlYy0yOTM1NTRhMGFmYzciLCJzaWQiOiI5ZTA1MzRiYi05ODk2LTRmNzgtOTAxNy02Y2FjN2E1YTRjNzAifQ.CnfgBuQWqJH3k1oqVBh_sxv2gtuLdPpSXTbSO58D1WE",
  "access_expires_at": "2026-10-27T15:22:40.169753988Z",
  "refresh_token": "Zs9TFOyjdWC2GNhluVSZ_9Wqj-2LUK9ZHVd1_NkjhPE",
  "refresh_expires_at": "2026-11-26T15:07:40.169173779Z",
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
  "command_id": "b07aad1b-87ea-44a5-8c49-d45aa65b4f8b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:40Z",
    "sequence": 1793113660208
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "095e0ed6-877d-4465-8782-0e63f0c8689a",
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
  "last_heartbeat_at": "2026-10-27T15:07:40.222253Z",
  "last_location_at": "2026-10-27T15:07:40.222253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673956046",
  "device_ref": "sandbox-11877"
}
```

```json
{
  "challenge_id": "c0ea0986-3fb8-4581-9f4c-b4b0faa134e4",
  "expires_at": "2026-10-27T15:12:40.244152968Z",
  "resend_available_at": "2026-10-27T15:07:41.244152968Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673956046` → **200**

```json
{
  "phone": "+380673956046",
  "audience": "CLIENT",
  "code": "916482",
  "sent_at": "2026-10-27T15:07:40.245946475Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0ea0986-3fb8-4581-9f4c-b4b0faa134e4",
  "code": "916482",
  "device_ref": "sandbox-11877"
}
```

```json
{
  "session_id": "abd471ef-c847-4a48-a9b7-b027d814b271",
  "subject": {
    "type": "CLIENT",
    "id": "e607ae52-a226-4969-9de7-500fdc2adc46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjA3YWU1Mi1hMjI2LTQ5NjktOWRlNy01MDBmZGMyYWRjNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTYwLCJpYXQiOjE3OTMxMTM2NjAsImp0aSI6IjU5Nzc4MzZjLTg2ZjItNDcwNy1hODk4LTM4ZGE2ZTFjYzI3MCIsInNpZCI6ImFiZDQ3MWVmLWM4NDctNGE0OC1hOWI3LWIwMjdkODE0YjI3MSJ9.bzKwAHfKecfK8zxkByhgzFrE-PMcCCjAztuP_0m0yGI",
  "access_expires_at": "2026-10-27T15:22:40.287717496Z",
  "refresh_token": "PMqcfO1hdKykiBz2yhD2Hx_VqP3B3JNM82NAps02thA",
  "refresh_expires_at": "2026-11-26T15:07:40.287208643Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df4d4c2e-f496-456a-abc6-bba0474c13c7",
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
  "id": "7d6a1b69-963c-494c-9007-a94cd7c0db03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:12:40.317496Z",
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
  "command_id": "1c4d141a-987b-4586-9bcd-235718445209",
  "quote_id": "7d6a1b69-963c-494c-9007-a94cd7c0db03",
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
  "id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e607ae52-a226-4969-9de7-500fdc2adc46",
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
  "created_at": "2026-10-27T15:07:40.345754Z",
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
    "id": "0fbcba15-152b-408d-ae33-93b947dffb33",
    "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
    "expires_at": "2026-10-27T15:07:55.348596Z",
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

`POST /api/driver/v1/offers/0fbcba15-152b-408d-ae33-93b947dffb33/accept` → **200**

```json
{
  "command_id": "40b19a8f-a3ef-4a41-8b20-1dbfd14b9200"
}
```

```json
{
  "id": "f5c1ca91-4ad2-4da9-a186-f4a084bd186d",
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "da13531e-ff3a-4e14-a74f-6688b4e190ef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "da13531e-ff3a-4e14-a74f-6688b4e190ef",
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "assignment_id": "f5c1ca91-4ad2-4da9-a186-f4a084bd186d",
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

`POST /api/driver/v1/work-sessions/095e0ed6-877d-4465-8782-0e63f0c8689a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:40Z",
    "sequence": 1793113660431
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "095e0ed6-877d-4465-8782-0e63f0c8689a",
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
  "last_heartbeat_at": "2026-10-27T15:07:40.44593Z",
  "last_location_at": "2026-10-27T15:07:40.44593Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "da13531e-ff3a-4e14-a74f-6688b4e190ef",
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "assignment_id": "f5c1ca91-4ad2-4da9-a186-f4a084bd186d",
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

`POST /api/driver/v1/trips/da13531e-ff3a-4e14-a74f-6688b4e190ef/arrive` → **200**

```json
{
  "command_id": "07a76f5f-3c5e-4995-b7f7-ba1faf98a649",
  "expected_version": 0
}
```

```json
{
  "id": "da13531e-ff3a-4e14-a74f-6688b4e190ef",
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "assignment_id": "f5c1ca91-4ad2-4da9-a186-f4a084bd186d",
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
  "arrived_at": "2026-10-27T15:07:40.48576Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/da13531e-ff3a-4e14-a74f-6688b4e190ef/start` → **200**

```json
{
  "command_id": "b308e84c-4215-471e-a884-ea9f5788aaba",
  "expected_version": 1
}
```

```json
{
  "id": "da13531e-ff3a-4e14-a74f-6688b4e190ef",
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "assignment_id": "f5c1ca91-4ad2-4da9-a186-f4a084bd186d",
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
  "arrived_at": "2026-10-27T15:07:40.48576Z",
  "started_at": "2026-10-27T15:07:40.512301Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/095e0ed6-877d-4465-8782-0e63f0c8689a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:40Z",
    "sequence": 1793113660529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "095e0ed6-877d-4465-8782-0e63f0c8689a",
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
  "last_heartbeat_at": "2026-10-27T15:07:40.54431Z",
  "last_location_at": "2026-10-27T15:07:40.54431Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/da13531e-ff3a-4e14-a74f-6688b4e190ef/complete` → **200**

```json
{
  "command_id": "465f3bf3-8c6f-45de-bef4-c4df8a775862",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:07:40Z",
  "cash_received": true
}
```

```json
{
  "id": "da13531e-ff3a-4e14-a74f-6688b4e190ef",
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "assignment_id": "f5c1ca91-4ad2-4da9-a186-f4a084bd186d",
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
  "arrived_at": "2026-10-27T15:07:40.48576Z",
  "started_at": "2026-10-27T15:07:40.512301Z",
  "completed_at": "2026-10-27T15:07:40.568952Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/fcb68622-0fd1-4be0-82aa-c0c409a56f94/rating` → **200**

```json
{
  "command_id": "0f4cbbf3-727c-4b06-ad85-4b711cd302ab",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "score": 5,
  "created_at": "2026-10-27T15:07:40.61047162Z"
}
```

`POST /api/driver/v1/orders/fcb68622-0fd1-4be0-82aa-c0c409a56f94/rating` → **200**

```json
{
  "command_id": "d9725947-6a7b-4ccd-bc94-3bc7ad67203b",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
  "score": 4,
  "created_at": "2026-10-27T15:07:40.639293566Z"
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
  "session_id": "dffe8a06-f97e-486e-9eef-344a0169b30a",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjAsImlhdCI6MTc5MzExMzY2MCwianRpIjoiMjAxZDVhN2UtMTNjYi00ZTI3LWE4ZDYtYTQ5YzEyMWNkOTExIiwic2lkIjoiZGZmZThhMDYtZjk3ZS00ODZlLTllZWYtMzQ0YTAxNjliMzBhIn0.MBK3Whuaou6PCCOUloIFej8e8tXtRKPxC0Vy3zg04T8",
  "access_expires_at": "2026-10-27T15:22:40.943084396Z",
  "refresh_token": "WCH_WkkvStvcxgIKZvcfZ06JqLOM0NCVgpuXJ7TKh4M",
  "refresh_expires_at": "2026-10-28T03:07:40.942658516Z",
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
  "session_id": "c16110ce-3106-4661-900f-d0e966bbb3f8",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjEsImlhdCI6MTc5MzExMzY2MSwianRpIjoiOWZjZWMwMDQtZTMwMi00ZDg4LWE2YmItZTY5MTkyOWRlNWRkIiwic2lkIjoiYzE2MTEwY2UtMzEwNi00NjYxLTkwMGYtZDBlOTY2YmJiM2Y4In0.tiBYSdZIoINfb_Z1-ruu4Cely5CIDQSb3Xy47MYaR5o",
  "access_expires_at": "2026-10-27T15:22:41.192197922Z",
  "refresh_token": "ZMzLvkxHGQyA3hB9MToRK0nzJiLCjClVHs9DBBO5olQ",
  "refresh_expires_at": "2026-10-28T03:07:41.191570101Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fcb68622-0fd1-4be0-82aa-c0c409a56f94/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
      "author_type": "RIDER",
      "author_id": "e607ae52-a226-4969-9de7-500fdc2adc46",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T15:07:40.610472Z"
    },
    {
      "order_id": "fcb68622-0fd1-4be0-82aa-c0c409a56f94",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "e607ae52-a226-4969-9de7-500fdc2adc46",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T15:07:40.639294Z"
    }
  ]
}
```

Done: ratings for order fcb68622-0fd1-4be0-82aa-c0c409a56f94.

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
  "session_id": "049a8f04-e74a-4d6d-9b55-5144a5433c8d",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjEsImlhdCI6MTc5MzExMzY2MSwianRpIjoiNzI0M2VhYzMtOTE5Yi00ZDliLWJlNzYtZjBhNTBiMzUxN2NjIiwic2lkIjoiMDQ5YThmMDQtZTc0YS00ZDZkLTliNTUtNTE0NGE1NDMzYzhkIn0.513KaM1deQnmzzu7tQXo84R_V_FGYhOBOh1rBA1uS4Q",
  "access_expires_at": "2026-10-27T15:22:41.477744534Z",
  "refresh_token": "mAm-ndkoHDdhxxv2DCY2dV04PGLxk8ul1fzRAwDYSg8",
  "refresh_expires_at": "2026-10-28T03:07:41.47709707Z",
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
  "command_id": "0c063c06-34b2-4393-b444-8edee8b36be7",
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
  "changed_by": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:07:41.536217Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0c063c06-34b2-4393-b444-8edee8b36be7",
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
  "changed_by": "49c54361-fcbe-470c-b0cd-c67671359eeb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:07:41.536217Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48855248907",
  "device_ref": "sandbox-12166"
}
```

```json
{
  "challenge_id": "5054f9a1-d7f4-4f23-b6a2-d6576627f626",
  "expires_at": "2026-10-27T15:12:41.594774282Z",
  "resend_available_at": "2026-10-27T15:07:42.594774282Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48855248907` → **200**

```json
{
  "phone": "+48855248907",
  "audience": "CLIENT",
  "code": "875893",
  "sent_at": "2026-10-27T15:07:41.596503174Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5054f9a1-d7f4-4f23-b6a2-d6576627f626",
  "code": "875893",
  "device_ref": "sandbox-12166"
}
```

```json
{
  "session_id": "5554bb24-c78f-4ebf-8903-34bb9abe2c30",
  "subject": {
    "type": "CLIENT",
    "id": "93763f15-3ba6-4e11-9852-7fab7546f86e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Mzc2M2YxNS0zYmE2LTRlMTEtOTg1Mi03ZmFiNzU0NmY4NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTYxLCJpYXQiOjE3OTMxMTM2NjEsImp0aSI6IjZiOTQyOTczLTY5NzktNDhlMS1iYzkyLTQ5YzA4NTZkNjdjNSIsInNpZCI6IjU1NTRiYjI0LWM3OGYtNGViZi04OTAzLTM0YmI5YWJlMmMzMCJ9.Tuo7iY8q0AsbjSnCoHMj7RXf7rj6TvupiZR3yJFMfxE",
  "access_expires_at": "2026-10-27T15:22:41.635475939Z",
  "refresh_token": "xl_hOc0_JcNFnD1YSVajM7Ze670biE2pNrItn7o6IRk",
  "refresh_expires_at": "2026-11-26T15:07:41.635116282Z",
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
  "correlation_id": "1a954aca-deb8-4567-8fee-8cccd109d238"
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
  "device_ref": "sandbox-1350"
}
```

```json
{
  "challenge_id": "0c558b8c-4cfc-4482-9604-78a0503af648",
  "expires_at": "2026-10-27T15:12:41.694230427Z",
  "resend_available_at": "2026-10-27T15:07:42.694230427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "083649",
  "sent_at": "2026-10-27T15:07:41.696366197Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c558b8c-4cfc-4482-9604-78a0503af648",
  "code": "083649",
  "device_ref": "sandbox-1350"
}
```

```json
{
  "session_id": "0c7393ae-4e09-4269-a4ee-7f3e30449841",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU2MSwiaWF0IjoxNzkzMTEzNjYxLCJqdGkiOiIyYzdlNWQ5NC05YTdiLTQyOGQtYWJhMy04ODgwNzliMDlhMDQiLCJzaWQiOiIwYzczOTNhZS00ZTA5LTQyNjktYTRlZS03ZjNlMzA0NDk4NDEifQ.jgqcZtygaU6eAH65ycutwgu5RTQOjI1Ce9g28W1nT-8",
  "access_expires_at": "2026-10-27T15:22:41.734870921Z",
  "refresh_token": "QRr4gEtKaGy0F5Y4pgJ6tOkbqx48LhE_W4uFb6bCIqw",
  "refresh_expires_at": "2026-11-26T15:07:41.734268383Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "07ce08a7-f317-413f-87e9-55d7abd9068c",
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
  "last_heartbeat_at": "2026-10-27T15:07:39.633991Z",
  "last_location_at": "2026-10-27T15:07:39.633991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07ce08a7-f317-413f-87e9-55d7abd9068c/handover` → **200**

```json
{
  "command_id": "7fd7130b-0e00-4ea8-af0a-94defcfbbd39",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "07ce08a7-f317-413f-87e9-55d7abd9068c",
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
  "last_heartbeat_at": "2026-10-27T15:07:39.633991Z",
  "last_location_at": "2026-10-27T15:07:39.633991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07ce08a7-f317-413f-87e9-55d7abd9068c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:41Z",
    "sequence": 1793113661793
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "07ce08a7-f317-413f-87e9-55d7abd9068c",
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
  "last_heartbeat_at": "2026-10-27T15:07:41.806986Z",
  "last_location_at": "2026-10-27T15:07:41.806986Z",
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
  "session_id": "07ce08a7-f317-413f-87e9-55d7abd9068c",
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
  "last_heartbeat_at": "2026-10-27T15:07:41.806986Z",
  "last_location_at": "2026-10-27T15:07:41.806986Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07ce08a7-f317-413f-87e9-55d7abd9068c/close` → **200**

```json
{
  "command_id": "f0f94c89-dea3-40a5-ac32-08de81c21855",
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
  "correlation_id": "55434b6d-9f36-4daa-ac95-bcadf7476f57"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676425060",
  "device_ref": "sandbox-17057"
}
```

```json
{
  "challenge_id": "6125b7f8-8feb-4b21-b327-0f63743c30e5",
  "expires_at": "2026-10-27T15:12:41.923808261Z",
  "resend_available_at": "2026-10-27T15:07:42.923808261Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676425060` → **200**

```json
{
  "phone": "+380676425060",
  "audience": "CLIENT",
  "code": "836375",
  "sent_at": "2026-10-27T15:07:41.925652921Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6125b7f8-8feb-4b21-b327-0f63743c30e5",
  "code": "836375",
  "device_ref": "sandbox-17057"
}
```

```json
{
  "session_id": "141c25bb-2fd9-402e-bccc-914050023672",
  "subject": {
    "type": "CLIENT",
    "id": "b5278228-9382-44f5-ac22-308bb4a63e55"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTI3ODIyOC05MzgyLTQ0ZjUtYWMyMi0zMDhiYjRhNjNlNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE0NTYxLCJpYXQiOjE3OTMxMTM2NjEsImp0aSI6IjgxYWZiZDkzLTBjMGUtNGU2YS05MTRmLTMyYjg5Zjc0OGRhOCIsInNpZCI6IjE0MWMyNWJiLTJmZDktNDAyZS1iY2NjLTkxNDA1MDAyMzY3MiJ9.J3Y5cG1i92xxGCV_vA0B9NAGm8ji1el-WASJFvQP1Zg",
  "access_expires_at": "2026-10-27T15:22:41.964500109Z",
  "refresh_token": "hHCtUfWceoVy43160EX81lY-USwFFVaRxyXrRD3RcpE",
  "refresh_expires_at": "2026-11-26T15:07:41.964095845Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "3884ae38-d340-4dd8-ad43-067bf012a9db",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a729cef7-96a0-4f62-8d98-233c1554e4c2",
  "upload_path": "/api/rider/v1/uploads/a729cef7-96a0-4f62-8d98-233c1554e4c2",
  "expires_at": "2026-10-27T15:22:41.999127924Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/a729cef7-96a0-4f62-8d98-233c1554e4c2` → **200**

```json
{
  "file_id": "a729cef7-96a0-4f62-8d98-233c1554e4c2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "8efc3dd4-1654-4c96-b75d-c30ff59a5a00",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "a729cef7-96a0-4f62-8d98-233c1554e4c2"
  ]
}
```

```json
{
  "id": "d9d4fb05-a39d-45b8-9f1f-01cb095c9168",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:07:42.056697Z",
  "updated_at": "2026-10-27T15:07:42.056697Z",
  "messages": [
    {
      "id": "bb9bdca1-3df3-43b5-97af-a5f41bb7d049",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:07:42.058141Z",
      "attachments": [
        {
          "file_id": "a729cef7-96a0-4f62-8d98-233c1554e4c2",
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
  "session_id": "cf7936d2-3842-4d44-9194-c8ddda73224f",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjIsImlhdCI6MTc5MzExMzY2MiwianRpIjoiODNlZWM2Y2YtOTQwNy00NjQ0LWExMWQtMTVkMGRhMTRlZTkzIiwic2lkIjoiY2Y3OTM2ZDItMzg0Mi00ZDQ0LTkxOTQtYzhkZGRhNzMyMjRmIn0.dWxewJ8GLF3kpLalNGTuZ4-gqaAumSXrpsU-F00oEaU",
  "access_expires_at": "2026-10-27T15:22:42.409305774Z",
  "refresh_token": "1ohUj4BN_8pm1i51yC3c57ec2EuAz1qSCu3y1jR_mVM",
  "refresh_expires_at": "2026-10-28T03:07:42.40892565Z",
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
  "session_id": "cb63ee29-85b2-4882-8d8c-7f5dce66085d",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjIsImlhdCI6MTc5MzExMzY2MiwianRpIjoiMTg3YmYxYjctN2Q5MC00NGNiLThjMzMtMmQ4MmI1MWNiNzY5Iiwic2lkIjoiY2I2M2VlMjktODViMi00ODgyLThkOGMtN2Y1ZGNlNjYwODVkIn0.cQXoIuMKEoNHo_WpBQNhQ67tsPUbGje_ru8Z0tEHQMM",
  "access_expires_at": "2026-10-27T15:22:42.65302898Z",
  "refresh_token": "wH7MnJ2scW4w3sumkmiPl1X2YzqRn97L8QcvWomWqvY",
  "refresh_expires_at": "2026-10-28T03:07:42.652443973Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d9d4fb05-a39d-45b8-9f1f-01cb095c9168/attachments/a729cef7-96a0-4f62-8d98-233c1554e4c2` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a4fd959f-390f-4962-b5a9-ef050a0e2596",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "989a407a-0586-426a-bf27-5b0aebdf11ce",
  "upload_path": "/api/operator/v1/uploads/989a407a-0586-426a-bf27-5b0aebdf11ce",
  "expires_at": "2026-10-27T15:22:42.695698015Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/989a407a-0586-426a-bf27-5b0aebdf11ce` → **200**

```json
{
  "file_id": "989a407a-0586-426a-bf27-5b0aebdf11ce",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d9d4fb05-a39d-45b8-9f1f-01cb095c9168` → **200**

```json
{
  "id": "d9d4fb05-a39d-45b8-9f1f-01cb095c9168",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:07:42.056697Z",
  "updated_at": "2026-10-27T15:07:42.056697Z",
  "messages": [
    {
      "id": "bb9bdca1-3df3-43b5-97af-a5f41bb7d049",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:07:42.058141Z",
      "attachments": [
        {
          "file_id": "a729cef7-96a0-4f62-8d98-233c1554e4c2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d9d4fb05-a39d-45b8-9f1f-01cb095c9168/comments` → **200**

```json
{
  "command_id": "2c884caf-1c30-450d-bce9-1064158c801a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "989a407a-0586-426a-bf27-5b0aebdf11ce"
  ]
}
```

```json
{
  "id": "d9d4fb05-a39d-45b8-9f1f-01cb095c9168",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:07:42.056697Z",
  "updated_at": "2026-10-27T15:07:42.77201Z",
  "messages": [
    {
      "id": "bb9bdca1-3df3-43b5-97af-a5f41bb7d049",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:07:42.058141Z",
      "attachments": [
        {
          "file_id": "a729cef7-96a0-4f62-8d98-233c1554e4c2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "494c24a2-8eb3-4ae2-ae55-702dbd9d3a3f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "49c54361-fcbe-470c-b0cd-c67671359eeb",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:07:42.771654Z",
      "attachments": [
        {
          "file_id": "989a407a-0586-426a-bf27-5b0aebdf11ce",
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

`GET /api/rider/v1/support/cases/d9d4fb05-a39d-45b8-9f1f-01cb095c9168` → **200**

```json
{
  "id": "d9d4fb05-a39d-45b8-9f1f-01cb095c9168",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:07:42.056697Z",
  "updated_at": "2026-10-27T15:07:42.77201Z",
  "messages": [
    {
      "id": "bb9bdca1-3df3-43b5-97af-a5f41bb7d049",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b5278228-9382-44f5-ac22-308bb4a63e55",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:07:42.058141Z",
      "attachments": [
        {
          "file_id": "a729cef7-96a0-4f62-8d98-233c1554e4c2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "494c24a2-8eb3-4ae2-ae55-702dbd9d3a3f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:07:42.771654Z",
      "attachments": [
        {
          "file_id": "989a407a-0586-426a-bf27-5b0aebdf11ce",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d9d4fb05-a39d-45b8-9f1f-01cb095c9168/attachments/989a407a-0586-426a-bf27-5b0aebdf11ce` → **200**

Done: support case d9d4fb05-a39d-45b8-9f1f-01cb095c9168, rider attachment a729cef7-96a0-4f62-8d98-233c1554e4c2, operator attachment 989a407a-0586-426a-bf27-5b0aebdf11ce.

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
  "session_id": "7d936f8e-1fb8-479c-9bf9-4da5bd9655f2",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjMsImlhdCI6MTc5MzExMzY2MywianRpIjoiMjNjY2JiYzEtZGRiOS00YTRlLTkzOTItOWViZTk0OWQ3NzcxIiwic2lkIjoiN2Q5MzZmOGUtMWZiOC00NzljLTliZjktNGRhNWJkOTY1NWYyIn0.YoxIT6I7YbRZz9bvU-ibV3Blij6E3vvCCY9izKKK2L0",
  "access_expires_at": "2026-10-27T15:22:43.060146443Z",
  "refresh_token": "2UmQFmV9WXHbJefFngLiU5rHL6AA7GPC5NtnYvEzxDg",
  "refresh_expires_at": "2026-10-28T03:07:43.059736768Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30082"
}
```

```json
{
  "challenge_id": "46e6d6cd-0191-451c-bb40-4c62908e88b1",
  "expires_at": "2026-10-27T15:12:43.082400891Z",
  "resend_available_at": "2026-10-27T15:07:44.082400891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "926377",
  "sent_at": "2026-10-27T15:07:43.084498613Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46e6d6cd-0191-451c-bb40-4c62908e88b1",
  "code": "926377",
  "device_ref": "sandbox-30082"
}
```

```json
{
  "session_id": "b2d98357-eaeb-49b8-88f2-9819105df51f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU2MywiaWF0IjoxNzkzMTEzNjYzLCJqdGkiOiJmMmY5MTRjNS04ZTgwLTQyNTQtOGJhNi03NDgwNDJkNTMzMmIiLCJzaWQiOiJiMmQ5ODM1Ny1lYWViLTQ5YjgtODhmMi05ODE5MTA1ZGY1MWYifQ.JLpIWuHvk6D6QAf00eGh71Fqe3ayADwNiZxDl0SsaxA",
  "access_expires_at": "2026-10-27T15:22:43.123818328Z",
  "refresh_token": "tbHHcsJUnKkByKtue5yApOLZFGWdkbHAG0mahBqOWJs",
  "refresh_expires_at": "2026-11-26T15:07:43.123351251Z",
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
  "command_id": "dec6f9c7-8c48-4127-9568-85cbef7b1549",
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
  "device_ref": "sandbox-8888"
}
```

```json
{
  "challenge_id": "694737bb-1e30-48fc-9e78-bd3fea2c5cc0",
  "expires_at": "2026-10-27T15:12:43.21976891Z",
  "resend_available_at": "2026-10-27T15:07:44.21976891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "959186",
  "sent_at": "2026-10-27T15:07:43.221615111Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "694737bb-1e30-48fc-9e78-bd3fea2c5cc0",
  "code": "959186",
  "device_ref": "sandbox-8888"
}
```

```json
{
  "session_id": "d214309e-66ac-48ab-9cbc-b1b92ed526ad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNDU2MywiaWF0IjoxNzkzMTEzNjYzLCJqdGkiOiI1NTFhMmViOC03OWIzLTQ0MDctYmQ2NC1jZDgxY2Q1NGJmMWEiLCJzaWQiOiJkMjE0MzA5ZS02NmFjLTQ4YWItOWNiYy1iMWI5MmVkNTI2YWQifQ.AeC-HC4UEqoHUAtgIjj2IzP8gtn5rVAVa9xw6iUR8TY",
  "access_expires_at": "2026-10-27T15:22:43.259076374Z",
  "refresh_token": "dlVgRvTwU0GBytUHXqHeTyMs6gZmvZ49jfwc3etyWpY",
  "refresh_expires_at": "2026-11-26T15:07:43.258695767Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "095e0ed6-877d-4465-8782-0e63f0c8689a",
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
  "last_heartbeat_at": "2026-10-27T15:07:40.54431Z",
  "last_location_at": "2026-10-27T15:07:40.54431Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/095e0ed6-877d-4465-8782-0e63f0c8689a/handover` → **200**

```json
{
  "command_id": "170dcc37-c445-4973-a55e-d11ad8bf37ee",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "095e0ed6-877d-4465-8782-0e63f0c8689a",
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
  "last_heartbeat_at": "2026-10-27T15:07:40.54431Z",
  "last_location_at": "2026-10-27T15:07:40.54431Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/095e0ed6-877d-4465-8782-0e63f0c8689a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:43Z",
    "sequence": 1793113663315
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "095e0ed6-877d-4465-8782-0e63f0c8689a",
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
  "last_heartbeat_at": "2026-10-27T15:07:43.329029Z",
  "last_location_at": "2026-10-27T15:07:43.329029Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:19.175489Z",
  "last_location_at": "2026-10-27T15:07:19.175489Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9/handover` → **200**

```json
{
  "command_id": "dcd6a6a3-0e47-4dda-b2c2-7fe027bcf2c2",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:19.175489Z",
  "last_location_at": "2026-10-27T15:07:19.175489Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:43Z",
    "sequence": 1793113663385
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:43.398557Z",
  "last_location_at": "2026-10-27T15:07:43.398557Z",
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
  "session_id": "91276418-d17e-4b73-9fac-053eb0cfb587",
  "subject": {
    "type": "STAFF",
    "id": "49c54361-fcbe-470c-b0cd-c67671359eeb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWM1NDM2MS1mY2JlLTQ3MGMtYjBjZC1jNjc2NzEzNTllZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTQ1NjMsImlhdCI6MTc5MzExMzY2MywianRpIjoiNTVjMmQ0ZWQtNDAzMi00ODhiLTkwMDMtMGU2ODE5ZGIxMjY1Iiwic2lkIjoiOTEyNzY0MTgtZDE3ZS00YjczLTlmYWMtMDUzZWIwY2ZiNTg3In0.XOFo3GXnMzi8bRDbhK8qJooSGJKRJkD9B3kkBiXS_VU",
  "access_expires_at": "2026-10-27T15:22:43.642918343Z",
  "refresh_token": "39CoU_naWPc4RX3dmOgbflgBdJsLW1CzFn5z2PeSAi8",
  "refresh_expires_at": "2026-10-28T03:07:43.642500287Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "76b14eb6-6bc0-467a-a175-a6b20f374d8b",
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
  "id": "e99aebd1-db3c-4c36-a4ba-f23ea9698918",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:12:43.669515Z",
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
  "command_id": "27b0a812-c570-4f6b-acb1-04bcfa0dde41",
  "quote_id": "e99aebd1-db3c-4c36-a4ba-f23ea9698918",
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
  "id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
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
  "created_at": "2026-10-27T15:07:43.696668Z",
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
    "id": "6e137e32-5f31-4006-bcbd-30e9a8223637",
    "order_id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
    "expires_at": "2026-10-27T15:07:58.699872Z",
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

`POST /api/driver/v1/offers/6e137e32-5f31-4006-bcbd-30e9a8223637/accept` → **200**

```json
{
  "command_id": "f089cbb7-4638-4e84-a215-4a607756fb8d"
}
```

```json
{
  "id": "655976a5-95c3-4c46-8168-5bb01df8daf2",
  "order_id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e65672e-939c-46e5-a22d-541d0b9dc01a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e65672e-939c-46e5-a22d-541d0b9dc01a",
  "order_id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
  "assignment_id": "655976a5-95c3-4c46-8168-5bb01df8daf2",
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

`POST /api/driver/v1/work-sessions/a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:07:43Z",
    "sequence": 1793113663793
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:43.806621Z",
  "last_location_at": "2026-10-27T15:07:43.806621Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3e65672e-939c-46e5-a22d-541d0b9dc01a/arrive` → **200**

```json
{
  "command_id": "e2b1d3a2-2e99-4566-bf2b-83354489e7e7",
  "expected_version": 0
}
```

```json
{
  "id": "3e65672e-939c-46e5-a22d-541d0b9dc01a",
  "order_id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
  "assignment_id": "655976a5-95c3-4c46-8168-5bb01df8daf2",
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
  "arrived_at": "2026-10-27T15:07:43.831998Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3e65672e-939c-46e5-a22d-541d0b9dc01a/start` → **200**

```json
{
  "command_id": "2b3e4ba0-e2e7-4d4c-9e30-e00140b32d55",
  "expected_version": 1
}
```

```json
{
  "id": "3e65672e-939c-46e5-a22d-541d0b9dc01a",
  "order_id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
  "assignment_id": "655976a5-95c3-4c46-8168-5bb01df8daf2",
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
  "arrived_at": "2026-10-27T15:07:43.831998Z",
  "started_at": "2026-10-27T15:07:43.860095Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3e65672e-939c-46e5-a22d-541d0b9dc01a/complete` → **200**

```json
{
  "command_id": "1cbb467a-a8ac-456d-b84b-0f7caa241b3b",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:07:43Z",
  "cash_received": true
}
```

```json
{
  "id": "3e65672e-939c-46e5-a22d-541d0b9dc01a",
  "order_id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
  "assignment_id": "655976a5-95c3-4c46-8168-5bb01df8daf2",
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
  "arrived_at": "2026-10-27T15:07:43.831998Z",
  "started_at": "2026-10-27T15:07:43.860095Z",
  "completed_at": "2026-10-27T15:07:43.890264Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/05f0dd58-e88e-4a53-aca3-a9e694f84d0b` → **200**

```json
{
  "id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
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
    "id": "655976a5-95c3-4c46-8168-5bb01df8daf2",
    "order_id": "05f0dd58-e88e-4a53-aca3-a9e694f84d0b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3e65672e-939c-46e5-a22d-541d0b9dc01a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:07:43.696668Z",
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
  "session_id": "095e0ed6-877d-4465-8782-0e63f0c8689a",
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
  "last_heartbeat_at": "2026-10-27T15:07:43.329029Z",
  "last_location_at": "2026-10-27T15:07:43.329029Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/095e0ed6-877d-4465-8782-0e63f0c8689a/close` → **200**

```json
{
  "command_id": "c826cd4a-ddf2-4965-9565-50c317e9e39d",
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
  "session_id": "a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9",
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
  "last_heartbeat_at": "2026-10-27T15:07:43.806621Z",
  "last_location_at": "2026-10-27T15:07:43.806621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9c327a6-d3c7-4c2a-a72d-1e6713e9f4c9/close` → **200**

```json
{
  "command_id": "8c487fe7-8122-4871-a9e9-2511150694c7",
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

Done: terminal order 05f0dd58-e88e-4a53-aca3-a9e694f84d0b by Andrii (5a000000-0000-4000-8000-000000000403).
