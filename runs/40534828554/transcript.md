# Sandbox transcript (2026-10-27T15:50:34Z, 5fa4d0b)

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
  "correlation_id": "ec64089f-385d-4381-bad1-4493a6965fa7"
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
  "session_id": "b3d3a8a4-a356-4c79-adae-e90c28d5c516",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxMzUsImlhdCI6MTc5MzExNjIzNSwianRpIjoiOTBlN2FjMjAtOWM4NS00Zjc2LTliN2UtZmI3NmI1OGMyYzVjIiwic2lkIjoiYjNkM2E4YTQtYTM1Ni00Yzc5LWFkYWUtZTkwYzI4ZDVjNTE2In0.XnJoSYf0CShbEph_z3Zf-7g6mZz-YhCa_TSOCrBY0WQ",
  "access_expires_at": "2026-10-27T16:05:35.456353106Z",
  "refresh_token": "sP83Lk0JGXV0TdNgLG8gsWGnG6evyh8Y7GEhoOu-V04",
  "refresh_expires_at": "2026-10-28T03:50:35.453047256Z",
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
  "session_id": "ce654804-907d-452b-8986-e2c36bbe09a4",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxMzYsImlhdCI6MTc5MzExNjIzNiwianRpIjoiNjVjNDk0OTItYjIwZC00OWQ2LTk2N2ItN2Y2ODUxYzRiZmQ1Iiwic2lkIjoiY2U2NTQ4MDQtOTA3ZC00NTJiLTg5ODYtZTJjMzZiYmUwOWE0In0.wAEN3JfajHVttGuxer_6FFqlo0KV5bdLsrhaIES0C3U",
  "access_expires_at": "2026-10-27T16:05:36.880353947Z",
  "refresh_token": "G2O1CL3cla-iJzzBq52P6wG04tmtQcMZoLvVhzVegPo",
  "refresh_expires_at": "2026-10-28T03:50:36.878850316Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "ac58a7df-db42-4926-9bca-321de76bb308",
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
  "id": "da640f42-d00b-4e14-802d-3ccdf39dde63",
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
  "created_by": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "created_at": "2026-10-27T15:50:36.960183Z",
  "updated_at": "2026-10-27T15:50:36.960183Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631826330",
  "device_ref": "sandbox-18471"
}
```

```json
{
  "challenge_id": "a622fa73-ee0d-4069-bd6b-5e5c8f03788d",
  "expires_at": "2026-10-27T15:55:37.015653279Z",
  "resend_available_at": "2026-10-27T15:50:38.015653279Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631826330` → **200**

```json
{
  "phone": "+380631826330",
  "audience": "CLIENT",
  "code": "516825",
  "sent_at": "2026-10-27T15:50:37.026205252Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a622fa73-ee0d-4069-bd6b-5e5c8f03788d",
  "code": "516825",
  "device_ref": "sandbox-18471"
}
```

```json
{
  "session_id": "306681cf-4ca7-4475-b351-f88fd7d99d4d",
  "subject": {
    "type": "CLIENT",
    "id": "0c0f12bc-eb76-4816-9d29-b72c9293aaf9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzBmMTJiYy1lYjc2LTQ4MTYtOWQyOS1iNzJjOTI5M2FhZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTM3LCJpYXQiOjE3OTMxMTYyMzcsImp0aSI6ImJjMmM4ODA4LTRkYWItNDJjNi1hODZiLWVkNTlmM2MwMDY5MiIsInNpZCI6IjMwNjY4MWNmLTRjYTctNDQ3NS1iMzUxLWY4OGZkN2Q5OWQ0ZCJ9.7PtyNvzbXS0KeCQG-KPonV6Z-vFbICVtqdFoxpmP14Q",
  "access_expires_at": "2026-10-27T16:05:37.14181103Z",
  "refresh_token": "RhWopneNB_nt07KnRCRPTQ0BWRkr8SDD_CntcNpnZlk",
  "refresh_expires_at": "2026-11-26T15:50:37.14026303Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631826330` → **200**

```json
{
  "client_id": "0c0f12bc-eb76-4816-9d29-b72c9293aaf9"
}
```

`POST /api/admin/v1/rider-wallets/0c0f12bc-eb76-4816-9d29-b72c9293aaf9/top-ups` → **201**

```json
{
  "command_id": "930101f0-4f0e-4b54-9a18-dfd9e798e8a7",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "0c0f12bc-eb76-4816-9d29-b72c9293aaf9",
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
      "id": "6fabb315-5245-49a9-8a40-70d47471a5a2",
      "at": "2026-10-27T15:50:37.245081Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8ef7d313-34a2-427f-90df-5fcddec69a41",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "253c085e-bd60-4337-a41c-beade2c4c76a",
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
  "id": "4a01ca84-bdf5-4e96-b95d-a1214319982c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:55:37.498993Z",
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
      "id": "da640f42-d00b-4e14-802d-3ccdf39dde63",
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
  "device_ref": "sandbox-4874"
}
```

```json
{
  "challenge_id": "f959a614-a275-4ef0-87ff-ff0cecf8ffae",
  "expires_at": "2026-10-27T15:55:37.599262445Z",
  "resend_available_at": "2026-10-27T15:50:38.599262445Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "363638",
  "sent_at": "2026-10-27T15:50:37.605272479Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f959a614-a275-4ef0-87ff-ff0cecf8ffae",
  "code": "363638",
  "device_ref": "sandbox-4874"
}
```

```json
{
  "session_id": "4edd8980-f913-4c16-a8b3-0305cb859407",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzEzNywiaWF0IjoxNzkzMTE2MjM3LCJqdGkiOiI2ZjFiMjg1Zi1iYjFhLTRkOGYtYTBiZi02OGQ1YzhmNWE3ODgiLCJzaWQiOiI0ZWRkODk4MC1mOTEzLTRjMTYtYThiMy0wMzA1Y2I4NTk0MDcifQ.ODD483aZFn2S3kO44Nsta7UO6yAj4ahDPU8B2o-Axmo",
  "access_expires_at": "2026-10-27T16:05:37.678381483Z",
  "refresh_token": "P_ujSMfI8Q468w3kvwO5iFvU40K-VtBz1Sy-IsrZrAw",
  "refresh_expires_at": "2026-11-26T15:50:37.677195527Z",
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
  "command_id": "3a37db13-0183-4ff3-85e5-2cdc70ec6fa1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:37Z",
    "sequence": 1793116237755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90ea052e-c046-4d81-bfff-1779802056cb",
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
  "last_heartbeat_at": "2026-10-27T15:50:37.813545Z",
  "last_location_at": "2026-10-27T15:50:37.813545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0e67e7e0-be30-4aad-9bb9-fb45900baca7",
  "quote_id": "4a01ca84-bdf5-4e96-b95d-a1214319982c",
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
  "id": "f9539c97-3945-4f50-88be-3c2a27282a98",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c0f12bc-eb76-4816-9d29-b72c9293aaf9",
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
  "created_at": "2026-10-27T15:50:37.919645Z",
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
  "client_id": "0c0f12bc-eb76-4816-9d29-b72c9293aaf9",
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
      "id": "6fabb315-5245-49a9-8a40-70d47471a5a2",
      "at": "2026-10-27T15:50:37.245081Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8ef7d313-34a2-427f-90df-5fcddec69a41",
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
    "id": "8c756b06-9a28-41c5-ab87-39f57ecb6914",
    "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98",
    "expires_at": "2026-10-27T15:50:52.939577Z",
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

`POST /api/driver/v1/offers/8c756b06-9a28-41c5-ab87-39f57ecb6914/accept` → **200**

```json
{
  "command_id": "bf52b737-ea5a-4ef6-bf63-6c08203d4b78"
}
```

```json
{
  "id": "859ed079-f1ca-4cfa-bbda-823973acf0d1",
  "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7",
  "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98",
  "assignment_id": "859ed079-f1ca-4cfa-bbda-823973acf0d1",
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

`POST /api/driver/v1/work-sessions/90ea052e-c046-4d81-bfff-1779802056cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:38Z",
    "sequence": 1793116238165
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90ea052e-c046-4d81-bfff-1779802056cb",
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
  "last_heartbeat_at": "2026-10-27T15:50:38.195129Z",
  "last_location_at": "2026-10-27T15:50:38.195129Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7/arrive` → **200**

```json
{
  "command_id": "f5fc4e16-729a-4c7c-9d33-d9242cb99417",
  "expected_version": 0
}
```

```json
{
  "id": "00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7",
  "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98",
  "assignment_id": "859ed079-f1ca-4cfa-bbda-823973acf0d1",
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
  "arrived_at": "2026-10-27T15:50:38.266517Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7/start` → **200**

```json
{
  "command_id": "a9e88404-8f87-46e4-8ad5-b5c1f9c276f7",
  "expected_version": 1
}
```

```json
{
  "id": "00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7",
  "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98",
  "assignment_id": "859ed079-f1ca-4cfa-bbda-823973acf0d1",
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
  "arrived_at": "2026-10-27T15:50:38.266517Z",
  "started_at": "2026-10-27T15:50:38.324258Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7/complete` → **200**

```json
{
  "command_id": "d8bf9cbc-d4c1-46ef-bdda-fab5f5248cc1",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:50:38Z",
  "cash_received": true
}
```

```json
{
  "id": "00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7",
  "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98",
  "assignment_id": "859ed079-f1ca-4cfa-bbda-823973acf0d1",
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
  "arrived_at": "2026-10-27T15:50:38.266517Z",
  "started_at": "2026-10-27T15:50:38.324258Z",
  "completed_at": "2026-10-27T15:50:38.408017Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0c0f12bc-eb76-4816-9d29-b72c9293aaf9",
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
      "id": "148e4826-6ec4-461a-a071-78f5c11e6fd3",
      "at": "2026-10-27T15:50:38.521148Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98"
    },
    {
      "id": "6fabb315-5245-49a9-8a40-70d47471a5a2",
      "at": "2026-10-27T15:50:37.245081Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8ef7d313-34a2-427f-90df-5fcddec69a41",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/da640f42-d00b-4e14-802d-3ccdf39dde63/archive` → **200**

```json
{
  "command_id": "aa957796-2380-429a-b74f-8d35ed8093d1",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "da640f42-d00b-4e14-802d-3ccdf39dde63",
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
  "created_by": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "created_at": "2026-10-27T15:50:36.960183Z",
  "updated_at": "2026-10-27T15:50:41.526795Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90ea052e-c046-4d81-bfff-1779802056cb",
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
  "last_heartbeat_at": "2026-10-27T15:50:38.195129Z",
  "last_location_at": "2026-10-27T15:50:38.195129Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90ea052e-c046-4d81-bfff-1779802056cb/close` → **200**

```json
{
  "command_id": "ad812c37-59d0-40e8-892e-07310c68f096",
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

Done: order f9539c97-3945-4f50-88be-3c2a27282a98.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639559896",
  "device_ref": "sandbox-29142"
}
```

```json
{
  "challenge_id": "6f21ee0a-d2cf-46d8-8198-b134d9d2b525",
  "expires_at": "2026-10-27T15:55:41.686204993Z",
  "resend_available_at": "2026-10-27T15:50:42.686204993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639559896` → **200**

```json
{
  "phone": "+380639559896",
  "audience": "CLIENT",
  "code": "208939",
  "sent_at": "2026-10-27T15:50:41.691041281Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f21ee0a-d2cf-46d8-8198-b134d9d2b525",
  "code": "208939",
  "device_ref": "sandbox-29142"
}
```

```json
{
  "session_id": "154783d6-110d-41da-9a58-17c64bb015a7",
  "subject": {
    "type": "CLIENT",
    "id": "e21b0f85-6fad-4f8c-8db6-e4b2f6dc3fdc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMjFiMGY4NS02ZmFkLTRmOGMtOGRiNi1lNGIyZjZkYzNmZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTQxLCJpYXQiOjE3OTMxMTYyNDEsImp0aSI6IjQ4ZWMyOGM2LTBjYjYtNGMyYi1hMzc5LWY0YmRhZjUwNDU5ZSIsInNpZCI6IjE1NDc4M2Q2LTExMGQtNDFkYS05YTU4LTE3YzY0YmIwMTVhNyJ9.iOMLHUyk_L7MZALfv28SiUpJ7r64zRbxSoRDU0c32e4",
  "access_expires_at": "2026-10-27T16:05:41.764329817Z",
  "refresh_token": "jgQfdW0vEakqOPFoG7wtFh-9ZpqgGaBdDNj3eJGB5HY",
  "refresh_expires_at": "2026-11-26T15:50:41.762948894Z",
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
  "device_ref": "sandbox-18272"
}
```

```json
{
  "challenge_id": "f6f41150-326f-4f56-841c-747bbdfba393",
  "expires_at": "2026-10-27T15:55:41.84489216Z",
  "resend_available_at": "2026-10-27T15:50:42.84489216Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "224212",
  "sent_at": "2026-10-27T15:50:41.849559937Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6f41150-326f-4f56-841c-747bbdfba393",
  "code": "224212",
  "device_ref": "sandbox-18272"
}
```

```json
{
  "session_id": "95532f1a-24f2-4e03-a48b-634ce77116b6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE0MSwiaWF0IjoxNzkzMTE2MjQxLCJqdGkiOiJmNzQzZGFjOC1kZDZmLTQwNWQtYmZkNy1lMDA4YWQxN2NlMjIiLCJzaWQiOiI5NTUzMmYxYS0yNGYyLTRlMDMtYTQ4Yi02MzRjZTc3MTE2YjYifQ.GPbmy82GDp0I7lvTun3Ww-_WZh4CMHRptVaizRJdSgs",
  "access_expires_at": "2026-10-27T16:05:41.923540021Z",
  "refresh_token": "J2iKq3_UtaWE_DN_nKqIGOfS5wT0PIy7xtbNegDwrds",
  "refresh_expires_at": "2026-11-26T15:50:41.921792757Z",
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
  "session_id": "07d674d9-cf1a-4a43-912e-a6efb7ea15e0",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNDIsImlhdCI6MTc5MzExNjI0MiwianRpIjoiMTUxZTNiOTItNzU2Ni00NWUyLWE1MDgtMWIwNjAxZjUxOTI5Iiwic2lkIjoiMDdkNjc0ZDktY2YxYS00YTQzLTkxMmUtYTZlZmI3ZWExNWUwIn0.ok55Jz075y7eWo8WS74GimyPzBTasJHrVrM9NdfN33U",
  "access_expires_at": "2026-10-27T16:05:42.32292532Z",
  "refresh_token": "yGymbUISxO2z7AfFQBd2MUm7XR8ko6ZOZd8-TGVLc1Y",
  "refresh_expires_at": "2026-10-28T03:50:42.321933539Z",
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
  "session_id": "f973a1e3-20a0-462f-b906-dfc62135a950",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNDIsImlhdCI6MTc5MzExNjI0MiwianRpIjoiZmZlZjE1MzYtNDRlZC00YTFjLWI0MjEtNTBjY2I3ZjJlYTQ3Iiwic2lkIjoiZjk3M2ExZTMtMjBhMC00NjJmLWI5MDYtZGZjNjIxMzVhOTUwIn0.iFdpKvj8-asOf7feaVm-W8b3vgXS-z8HqwwNcoPVlcg",
  "access_expires_at": "2026-10-27T16:05:42.682360994Z",
  "refresh_token": "I33-7Z7YpBgZEpPq7rJAYMezwOkYJoYHkmO-HU-IrFg",
  "refresh_expires_at": "2026-10-28T03:50:42.681546773Z",
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
  "command_id": "91d1b742-77f3-42a4-9bbb-7df0813c748c",
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
  "id": "760b94ed-197a-479d-bbc2-1d97253b1a8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:55:42.766980Z",
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
  "command_id": "45631b8c-a2fa-4629-996a-32a5fa585039",
  "quote_id": "760b94ed-197a-479d-bbc2-1d97253b1a8b",
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
  "id": "7a23d314-ea1a-4bb1-a5db-3c0d44f99904",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e21b0f85-6fad-4f8c-8db6-e4b2f6dc3fdc",
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
  "created_at": "2026-10-27T15:50:42.830435Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7a23d314-ea1a-4bb1-a5db-3c0d44f99904` → **200**

```json
{
  "id": "7a23d314-ea1a-4bb1-a5db-3c0d44f99904",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e21b0f85-6fad-4f8c-8db6-e4b2f6dc3fdc",
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
  "created_at": "2026-10-27T15:50:42.830435Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7a23d314-ea1a-4bb1-a5db-3c0d44f99904/cancel` → **200**

```json
{
  "command_id": "f01660c2-535c-43a6-8e79-832c0b9efab1",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "7a23d314-ea1a-4bb1-a5db-3c0d44f99904",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e21b0f85-6fad-4f8c-8db6-e4b2f6dc3fdc",
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
  "created_at": "2026-10-27T15:50:42.830435Z",
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
  "command_id": "48d67989-709f-4e78-b471-9faa8da12468",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:43Z",
    "sequence": 1793116243846
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d64da8e8-2cdc-4132-8cc4-60db9eb5a057",
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
  "last_heartbeat_at": "2026-10-27T15:50:43.034876Z",
  "last_location_at": "2026-10-27T15:50:43.034876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20016"
}
```

```json
{
  "challenge_id": "2534b495-5fd4-43f4-9f31-7de81f267e1a",
  "expires_at": "2026-10-27T15:55:43.07384Z",
  "resend_available_at": "2026-10-27T15:50:44.07384Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "850107",
  "sent_at": "2026-10-27T15:50:43.078455012Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2534b495-5fd4-43f4-9f31-7de81f267e1a",
  "code": "850107",
  "device_ref": "sandbox-20016"
}
```

```json
{
  "session_id": "54f80c0f-4a06-49bf-bce8-d4ba23a1b4b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE0MywiaWF0IjoxNzkzMTE2MjQzLCJqdGkiOiI4NzA4Yjg4NC1jZTZkLTQxZGQtODc1Mi0zNjRmOTJlNGZlMWIiLCJzaWQiOiI1NGY4MGMwZi00YTA2LTQ5YmYtYmNlOC1kNGJhMjNhMWI0YjMifQ.DwQ9QmgpLuGL587Gj4PDCmm8b2kZRI_o4_IKgT0GW04",
  "access_expires_at": "2026-10-27T16:05:43.153051149Z",
  "refresh_token": "HrhvpZHlsdeUWpHeLI_W21kH8SmDHUnzhNIsQPJkhTY",
  "refresh_expires_at": "2026-11-26T15:50:43.151916371Z",
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
  "command_id": "432d6945-9e96-4225-ba1d-6f38dfb160b4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:43Z",
    "sequence": 1793116243847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "57e5469d-2c40-44f4-b4c6-b9cbab433f19",
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
  "last_heartbeat_at": "2026-10-27T15:50:43.243384Z",
  "last_location_at": "2026-10-27T15:50:43.243384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e810dd38-9f8d-4a1e-acbb-215dfa4a9e0f",
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
  "id": "9ddc1fc8-5093-4092-b3af-bf602532c175",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:55:43.297775Z",
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
  "command_id": "1d051794-8d33-4384-9ab9-82cda3c7174c",
  "quote_id": "9ddc1fc8-5093-4092-b3af-bf602532c175",
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
  "id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e21b0f85-6fad-4f8c-8db6-e4b2f6dc3fdc",
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
  "created_at": "2026-10-27T15:50:43.354621Z",
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
    "id": "92050fdf-fa81-4eb1-9d10-14a3b2652aa1",
    "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
    "expires_at": "2026-10-27T15:50:58.360415Z",
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

`POST /api/driver/v1/offers/92050fdf-fa81-4eb1-9d10-14a3b2652aa1/accept` → **200**

```json
{
  "command_id": "6f417577-b547-46b8-a182-742dff4421fc"
}
```

```json
{
  "id": "fe2d2416-5d29-4d06-aae1-96438345573f",
  "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f75a59d5-2dbb-4ffc-9e02-e86c777bac08",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f75a59d5-2dbb-4ffc-9e02-e86c777bac08",
  "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "assignment_id": "fe2d2416-5d29-4d06-aae1-96438345573f",
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

`POST /api/driver/v1/trips/f75a59d5-2dbb-4ffc-9e02-e86c777bac08/cancel` → **200**

```json
{
  "command_id": "83ff2992-cdb6-4f23-9d78-2ecfde7909f1",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "f75a59d5-2dbb-4ffc-9e02-e86c777bac08",
  "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "assignment_id": "fe2d2416-5d29-4d06-aae1-96438345573f",
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

`GET /api/rider/v1/orders/6bf8468e-7860-4667-921c-85dad2603d66` → **200**

```json
{
  "id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e21b0f85-6fad-4f8c-8db6-e4b2f6dc3fdc",
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
    "id": "fe2d2416-5d29-4d06-aae1-96438345573f",
    "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f75a59d5-2dbb-4ffc-9e02-e86c777bac08",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T15:50:43.354621Z",
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
    "id": "c2bffd2b-9e2b-46f9-a7e5-97837fe8dbd8",
    "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
    "expires_at": "2026-10-27T15:50:58.54796Z",
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

`POST /api/driver/v1/offers/c2bffd2b-9e2b-46f9-a7e5-97837fe8dbd8/accept` → **200**

```json
{
  "command_id": "02fbe8f9-8837-45ba-890f-6881759f220a"
}
```

```json
{
  "id": "0171b159-424d-4a7c-857f-7595dff65878",
  "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0491de50-efb1-4596-8574-aa0d0adc08cd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0491de50-efb1-4596-8574-aa0d0adc08cd",
  "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "assignment_id": "0171b159-424d-4a7c-857f-7595dff65878",
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

`POST /api/driver/v1/trips/0491de50-efb1-4596-8574-aa0d0adc08cd/cancel` → **200**

```json
{
  "command_id": "cb7e00dd-0003-4f08-ae0e-4f116a58e927",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0491de50-efb1-4596-8574-aa0d0adc08cd",
  "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
  "assignment_id": "0171b159-424d-4a7c-857f-7595dff65878",
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
    "id": "6bf8468e-7860-4667-921c-85dad2603d66",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:50:43.354621Z",
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
    "id": "7a23d314-ea1a-4bb1-a5db-3c0d44f99904",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:50:42.830435Z",
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

`GET /api/operator/v1/orders/6bf8468e-7860-4667-921c-85dad2603d66/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:50:43.355563Z",
      "actor": {
        "type": "CLIENT",
        "id": "e21b0f85-6fad-4f8c-8db6-e4b2f6dc3fdc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
        "quote_id": "9ddc1fc8-5093-4092-b3af-bf602532c175",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:50:43.358891Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
        "attempt_id": "02f70ab3-dfaf-415f-aa1e-b61f2d1477d2",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:50:43.367219Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "92050fdf-fa81-4eb1-9d10-14a3b2652aa1",
        "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:50:43.447232Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "92050fdf-fa81-4eb1-9d10-14a3b2652aa1",
        "order_id": "6bf8468e-7860-4667-921c-85dad2603d66",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "fe2d2416-5d29-4d06-aae1-96438345573f"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 7a23d314-ea1a-4bb1-a5db-3c0d44f99904, 6bf8468e-7860-4667-921c-85dad2603d66.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732392924",
  "device_ref": "sandbox-606"
}
```

```json
{
  "challenge_id": "a814a13a-b457-451d-9e8c-551cbbd9eb9f",
  "expires_at": "2026-10-27T15:55:43.903948651Z",
  "resend_available_at": "2026-10-27T15:50:44.903948651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732392924` → **200**

```json
{
  "phone": "+380732392924",
  "audience": "CLIENT",
  "code": "604164",
  "sent_at": "2026-10-27T15:50:43.907969059Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a814a13a-b457-451d-9e8c-551cbbd9eb9f",
  "code": "604164",
  "device_ref": "sandbox-606"
}
```

```json
{
  "session_id": "af8df04c-6c1f-4f17-b5b1-0f7d82c4f4ed",
  "subject": {
    "type": "CLIENT",
    "id": "0eb7b187-c2f0-4808-ac9b-f396e5cd97c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZWI3YjE4Ny1jMmYwLTQ4MDgtYWM5Yi1mMzk2ZTVjZDk3YzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTQzLCJpYXQiOjE3OTMxMTYyNDMsImp0aSI6ImI2ZGVmZmYwLWI5MTMtNDliNy1iNGE0LTJlZGFiNjNjMDVhMyIsInNpZCI6ImFmOGRmMDRjLTZjMWYtNGYxNy1iNWIxLTBmN2Q4MmM0ZjRlZCJ9.2n-65WUWpHJUahhNDNmGRSzOX2KBnV_sxRZAGOo_Q70",
  "access_expires_at": "2026-10-27T16:05:43.986275494Z",
  "refresh_token": "-xn3efUtArk3htbIk0dHZKY7tk7pFps7HGB0zifLyX8",
  "refresh_expires_at": "2026-11-26T15:50:43.985222776Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e9c4778b-c45b-4c06-b6e1-3cd0af502540",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "15f3541d-d010-4a27-93d7-2d596a295f73",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-15f3541d-d010-4a27-93d7-2d596a295f73",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ac18247148a17b55e64f6dd6f30c477e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=15f3541d-d010-4a27-93d7-2d596a295f73",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732392924"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=15f3541d-d010-4a27-93d7-2d596a295f73",
  "expires_at": "2026-10-27T16:20:44.043412Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/15f3541d-d010-4a27-93d7-2d596a295f73` → **200**

```json
{
  "id": "15f3541d-d010-4a27-93d7-2d596a295f73",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T16:20:44.043412Z",
  "card": {
    "id": "0dcabf62-bf5a-4109-b0b9-127bdb91c3d2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9279",
    "card_type": "Visa",
    "created_at": "2026-10-27T15:50:44.108224Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "0dcabf62-bf5a-4109-b0b9-127bdb91c3d2",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9279",
      "card_type": "Visa",
      "created_at": "2026-10-27T15:50:44.108224Z"
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
  "device_ref": "sandbox-22915"
}
```

```json
{
  "challenge_id": "4ecc49e5-125c-4e0a-8c6c-51aa9c9eddf6",
  "expires_at": "2026-10-27T15:55:44.207548834Z",
  "resend_available_at": "2026-10-27T15:50:45.207548834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "217031",
  "sent_at": "2026-10-27T15:50:44.210938596Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ecc49e5-125c-4e0a-8c6c-51aa9c9eddf6",
  "code": "217031",
  "device_ref": "sandbox-22915"
}
```

```json
{
  "session_id": "245c3294-8553-4237-8e66-bdb804a6ddca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE0NCwiaWF0IjoxNzkzMTE2MjQ0LCJqdGkiOiI5Zjg3YzhmNS1lNTY5LTQ5YTgtOGVlNi02YzBkMDBjZTM5MjciLCJzaWQiOiIyNDVjMzI5NC04NTUzLTQyMzctOGU2Ni1iZGI4MDRhNmRkY2EifQ.P5mXWuNwQzT-_dmciev-36_HcsPW6Z_ILM8iDweChkQ",
  "access_expires_at": "2026-10-27T16:05:44.278012699Z",
  "refresh_token": "3c3ciW6a6-2HrrNtLtS0gpUSCM-ou0YN9O4oQIi7WdU",
  "refresh_expires_at": "2026-11-26T15:50:44.27733626Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "57e5469d-2c40-44f4-b4c6-b9cbab433f19",
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
  "last_heartbeat_at": "2026-10-27T15:50:43.243384Z",
  "last_location_at": "2026-10-27T15:50:43.243384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/57e5469d-2c40-44f4-b4c6-b9cbab433f19/handover` → **200**

```json
{
  "command_id": "063792c6-e586-4b4b-b2d9-41ae6c35906d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "57e5469d-2c40-44f4-b4c6-b9cbab433f19",
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
  "last_heartbeat_at": "2026-10-27T15:50:43.243384Z",
  "last_location_at": "2026-10-27T15:50:43.243384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/57e5469d-2c40-44f4-b4c6-b9cbab433f19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:44Z",
    "sequence": 1793116244388
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "57e5469d-2c40-44f4-b4c6-b9cbab433f19",
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
  "last_heartbeat_at": "2026-10-27T15:50:44.412116Z",
  "last_location_at": "2026-10-27T15:50:44.412116Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ebd00eb-3b33-4ba8-bc96-f43850f9a052",
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
  "id": "96a0053b-7000-4e38-9004-b9da026f4836",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T15:55:44.462092Z",
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
  "command_id": "cd336728-aca8-49c6-b8d7-8aea54ff806e",
  "quote_id": "96a0053b-7000-4e38-9004-b9da026f4836",
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
  "id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0eb7b187-c2f0-4808-ac9b-f396e5cd97c4",
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
  "created_at": "2026-10-27T15:50:44.525217Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032` → **200**

```json
{
  "id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0eb7b187-c2f0-4808-ac9b-f396e5cd97c4",
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
  "created_at": "2026-10-27T15:50:44.525217Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032` → **200**

```json
{
  "id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0eb7b187-c2f0-4808-ac9b-f396e5cd97c4",
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
  "created_at": "2026-10-27T15:50:44.525217Z",
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
    "id": "d463cc9d-1042-4c40-864e-2dfa1b75580b",
    "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
    "expires_at": "2026-10-27T15:50:59.709545Z",
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

`POST /api/driver/v1/offers/d463cc9d-1042-4c40-864e-2dfa1b75580b/accept` → **200**

```json
{
  "command_id": "3a765054-e603-4494-98c0-1470d5622ffc"
}
```

```json
{
  "id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "assignment_id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
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

`POST /api/driver/v1/work-sessions/57e5469d-2c40-44f4-b4c6-b9cbab433f19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:45Z",
    "sequence": 1793116245759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "57e5469d-2c40-44f4-b4c6-b9cbab433f19",
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
  "last_heartbeat_at": "2026-10-27T15:50:45.784516Z",
  "last_location_at": "2026-10-27T15:50:45.784516Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/076f6a9f-956b-481f-bbc9-c30ce49a1c8b/arrive` → **200**

```json
{
  "command_id": "f91d25af-b706-4907-8c2c-30d3b72a9d13",
  "expected_version": 0
}
```

```json
{
  "id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "assignment_id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
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
  "arrived_at": "2026-10-27T15:50:45.834564Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/076f6a9f-956b-481f-bbc9-c30ce49a1c8b/start` → **200**

```json
{
  "command_id": "d7bf6d18-3241-4310-ac48-e2b2a4e2fc61",
  "expected_version": 1
}
```

```json
{
  "id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "assignment_id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
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
  "arrived_at": "2026-10-27T15:50:45.834564Z",
  "started_at": "2026-10-27T15:50:45.885517Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/076f6a9f-956b-481f-bbc9-c30ce49a1c8b/complete` → **200**

```json
{
  "command_id": "afd7404f-3a79-412e-a97d-1818db593950",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:50:45Z"
}
```

```json
{
  "id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "assignment_id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
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
  "arrived_at": "2026-10-27T15:50:45.834564Z",
  "started_at": "2026-10-27T15:50:45.885517Z",
  "completed_at": "2026-10-27T15:50:45.94199Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032` → **200**

```json
{
  "id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0eb7b187-c2f0-4808-ac9b-f396e5cd97c4",
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
    "id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
    "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:50:44.525217Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032` → **200**

```json
{
  "id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0eb7b187-c2f0-4808-ac9b-f396e5cd97c4",
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
    "id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
    "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:50:44.525217Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032` → **200**

```json
{
  "id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0eb7b187-c2f0-4808-ac9b-f396e5cd97c4",
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
    "id": "be7d8877-201c-4ee0-a9d8-7b33cbb744fa",
    "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "076f6a9f-956b-481f-bbc9-c30ce49a1c8b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:50:44.525217Z",
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
      "id": "8795c4f1-4224-4621-82d6-b4eaf79371d9",
      "at": "2026-10-27T15:50:46.777188Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032/tip` → **200**

```json
{
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
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
  "available_until": "2026-10-28T15:50:45.94199Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032/tip` → **201**

```json
{
  "command_id": "8ea65d69-cae8-4bcb-af55-8f80a2f63605",
  "amount_minor": 2500
}
```

```json
{
  "id": "b893262b-bb73-4820-91d4-b9e25df2e99b",
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T15:50:48.251795Z"
}
```

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032/tip` → **200**

```json
{
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
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
  "available_until": "2026-10-28T15:50:45.94199Z",
  "open": false,
  "tip": {
    "id": "b893262b-bb73-4820-91d4-b9e25df2e99b",
    "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T15:50:48.251795Z"
  }
}
```

`GET /api/rider/v1/orders/c6eba45c-1823-466e-90d8-cddb0a256032/tip` → **200**

```json
{
  "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
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
  "available_until": "2026-10-28T15:50:45.94199Z",
  "open": false,
  "tip": {
    "id": "b893262b-bb73-4820-91d4-b9e25df2e99b",
    "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T15:50:48.251795Z"
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
      "id": "8795c4f1-4224-4621-82d6-b4eaf79371d9",
      "at": "2026-10-27T15:50:46.777188Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
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
      "id": "2a898b1b-d631-4ffd-9ef2-4dfafff456a4",
      "at": "2026-10-27T15:50:49.853147Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
      "counterpart_id": null
    },
    {
      "id": "8795c4f1-4224-4621-82d6-b4eaf79371d9",
      "at": "2026-10-27T15:50:46.777188Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c6eba45c-1823-466e-90d8-cddb0a256032",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "57e5469d-2c40-44f4-b4c6-b9cbab433f19",
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
  "last_heartbeat_at": "2026-10-27T15:50:45.784516Z",
  "last_location_at": "2026-10-27T15:50:45.784516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/57e5469d-2c40-44f4-b4c6-b9cbab433f19/close` → **200**

```json
{
  "command_id": "34d9080d-3e38-437e-b7a0-fdf05f66f71b",
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

Done: card order c6eba45c-1823-466e-90d8-cddb0a256032.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739702895",
  "device_ref": "sandbox-32013"
}
```

```json
{
  "challenge_id": "73695294-f09d-4ec9-9132-d6e5227f8cb6",
  "expires_at": "2026-10-27T15:55:50.509703167Z",
  "resend_available_at": "2026-10-27T15:50:51.509703167Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739702895` → **200**

```json
{
  "phone": "+380739702895",
  "audience": "CLIENT",
  "code": "162276",
  "sent_at": "2026-10-27T15:50:50.512844739Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73695294-f09d-4ec9-9132-d6e5227f8cb6",
  "code": "162276",
  "device_ref": "sandbox-32013"
}
```

```json
{
  "session_id": "c7212007-abf2-4d5a-b4e1-9ddb0b25e6c1",
  "subject": {
    "type": "CLIENT",
    "id": "bfe39612-53b2-4d8d-887c-3b8ee5f53b3d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZmUzOTYxMi01M2IyLTRkOGQtODg3Yy0zYjhlZTVmNTNiM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTUwLCJpYXQiOjE3OTMxMTYyNTAsImp0aSI6ImRmZTFlZGQzLWViMWQtNDU5Yy1iMTQwLTQzMDczNGIxNTBkZCIsInNpZCI6ImM3MjEyMDA3LWFiZjItNGQ1YS1iNGUxLTlkZGIwYjI1ZTZjMSJ9.Jgt-BVKMl63W9OhsxVwZUk0Y-4YdRir7US9NuhRKhfQ",
  "access_expires_at": "2026-10-27T16:05:50.569799302Z",
  "refresh_token": "L9c4BdNxGS2T3IYP6womObAv_L-O4Y2WwVI0ZfWsymY",
  "refresh_expires_at": "2026-11-26T15:50:50.568974713Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "984d0c13-710f-41dd-884b-e8b28d972935",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "fb276b70-3c6b-4834-941f-a9a00de01181",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-fb276b70-3c6b-4834-941f-a9a00de01181",
    "orderDate": "1793116250",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "b19e1484768f3b053cb57a53b0446baa",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=fb276b70-3c6b-4834-941f-a9a00de01181",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739702895"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=fb276b70-3c6b-4834-941f-a9a00de01181",
  "created_at": "2026-10-27T15:50:50.608253Z",
  "expires_at": "2026-10-27T16:20:50.608253Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/fb276b70-3c6b-4834-941f-a9a00de01181` → **200**

```json
{
  "id": "fb276b70-3c6b-4834-941f-a9a00de01181",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:50:50.608253Z",
  "expires_at": "2026-10-27T16:20:50.608253Z",
  "completed_at": "2026-10-27T15:50:50.650096Z",
  "masked_pan": "41****8011",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "bfe39612-53b2-4d8d-887c-3b8ee5f53b3d",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "bfe39612-53b2-4d8d-887c-3b8ee5f53b3d",
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
      "id": "a318e3d2-e223-49b6-9d0a-30f4f7eccdd1",
      "at": "2026-10-27T15:50:50.87315Z",
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
  "client_id": "bfe39612-53b2-4d8d-887c-3b8ee5f53b3d",
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
      "id": "a318e3d2-e223-49b6-9d0a-30f4f7eccdd1",
      "at": "2026-10-27T15:50:50.87315Z",
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
  "device_ref": "sandbox-10718"
}
```

```json
{
  "challenge_id": "0a1cfbed-77d1-4cb4-8821-798070fa37f8",
  "expires_at": "2026-10-27T15:55:51.783066796Z",
  "resend_available_at": "2026-10-27T15:50:52.783066796Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "753996",
  "sent_at": "2026-10-27T15:50:51.785935809Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a1cfbed-77d1-4cb4-8821-798070fa37f8",
  "code": "753996",
  "device_ref": "sandbox-10718"
}
```

```json
{
  "session_id": "b4f2d6bd-17d6-4528-a2c3-236c1bd00b8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE1MSwiaWF0IjoxNzkzMTE2MjUxLCJqdGkiOiI1OTdmODI1Zi01ZjBjLTQwYjctYjYxZS1kNDY3YjczNDAxODMiLCJzaWQiOiJiNGYyZDZiZC0xN2Q2LTQ1MjgtYTJjMy0yMzZjMWJkMDBiOGQifQ.Bq2qj3ixZ7lGjsrG8dUJZxYcYw1gfzEjJk54BSeDTSI",
  "access_expires_at": "2026-10-27T16:05:51.840386369Z",
  "refresh_token": "PNXjfvLlb-9uGwcRSahPqW1dLT7HawqOUdCG1Txw_dE",
  "refresh_expires_at": "2026-11-26T15:50:51.839719808Z",
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
  "command_id": "e39d0aa2-1f87-4a2b-a0c8-e03a10f2f22a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "6d9bb0a8-f170-4d18-b333-34acada31b48",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6d9bb0a8-f170-4d18-b333-34acada31b48",
    "orderDate": "1793116251",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "147ac8fd3738ac987a12a8429e12a4ca",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6d9bb0a8-f170-4d18-b333-34acada31b48",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6d9bb0a8-f170-4d18-b333-34acada31b48",
  "created_at": "2026-10-27T15:50:51.902037Z",
  "expires_at": "2026-10-27T16:20:51.902037Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/6d9bb0a8-f170-4d18-b333-34acada31b48` → **200**

```json
{
  "id": "6d9bb0a8-f170-4d18-b333-34acada31b48",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:50:51.902037Z",
  "expires_at": "2026-10-27T16:20:51.902037Z",
  "completed_at": "2026-10-27T15:50:51.939301Z",
  "masked_pan": "41****2888",
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
      "id": "7040a31c-dbc9-430a-80ab-07e1b34081ee",
      "at": "2026-10-27T15:50:52.886683Z",
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
  "command_id": "7f506afa-2b55-4e9a-879d-2a89c4131bde",
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
  "correlation_id": "d5df7dfe-9380-4f38-a3e1-26e1b82726f6"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679644059",
  "device_ref": "sandbox-5185"
}
```

```json
{
  "challenge_id": "1f2d9ab6-b8e7-4b17-bff2-f86de79cadc1",
  "expires_at": "2026-10-27T15:55:53.096118907Z",
  "resend_available_at": "2026-10-27T15:50:54.096118907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679644059` → **200**

```json
{
  "phone": "+380679644059",
  "audience": "CLIENT",
  "code": "365900",
  "sent_at": "2026-10-27T15:50:53.099163102Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f2d9ab6-b8e7-4b17-bff2-f86de79cadc1",
  "code": "365900",
  "device_ref": "sandbox-5185"
}
```

```json
{
  "session_id": "1960a603-21d0-43c6-ae5e-980d98ebd08e",
  "subject": {
    "type": "CLIENT",
    "id": "f88b4ef0-0761-40d9-b502-039a74e9bdbc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODhiNGVmMC0wNzYxLTQwZDktYjUwMi0wMzlhNzRlOWJkYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTUzLCJpYXQiOjE3OTMxMTYyNTMsImp0aSI6ImJhNDBiNGZkLTlkMGEtNGQyZS1hZDQzLTVjODRlOGRlNTEyNCIsInNpZCI6IjE5NjBhNjAzLTIxZDAtNDNjNi1hZTVlLTk4MGQ5OGViZDA4ZSJ9.fAFyZFTWKab59lLoIYkFgsp8w3o-dQqQPbkk-tKfF4Y",
  "access_expires_at": "2026-10-27T16:05:53.158826997Z",
  "refresh_token": "n1XOlIHHY6jVmm8D0Aa1LJj2ksP8gazh_miLZ-hiYCk",
  "refresh_expires_at": "2026-11-26T15:50:53.158127091Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f88b4ef0-0761-40d9-b502-039a74e9bdbc",
  "session_id": "1960a603-21d0-43c6-ae5e-980d98ebd08e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa9fe1c9-8746-4d85-812e-90a11da07cad",
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
  "id": "93883bbf-bfde-4232-8034-77f272bb1f34",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:55:53.222651Z",
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
  "challenge_id": "6f9e933c-9741-48ec-b044-66b3c0b1ab22",
  "expires_at": "2026-10-27T15:55:55.264954541Z",
  "resend_available_at": "2026-10-27T15:50:56.264954541Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679644059` → **200**

```json
{
  "phone": "+380679644059",
  "audience": "CLIENT",
  "code": "596094",
  "sent_at": "2026-10-27T15:50:55.267903876Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "b733e8bc-7d29-4ac0-89b1-6e8aadb174b6",
  "challenge_id": "6f9e933c-9741-48ec-b044-66b3c0b1ab22",
  "otp_code": "596094"
}
```

```json
{
  "client_id": "f88b4ef0-0761-40d9-b502-039a74e9bdbc",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T15:50:55.348308631Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "7326aefd-216e-4f69-9463-5fddada2042c",
  "quote_id": "93883bbf-bfde-4232-8034-77f272bb1f34",
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
  "correlation_id": "a8ec4e20-5956-45be-b124-7664f8323b32"
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
  "session_id": "cb4adb09-e1aa-43db-8994-518dd600c442",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNTUsImlhdCI6MTc5MzExNjI1NSwianRpIjoiZjU3Zjg1NTUtNzM5Yy00Zjc5LWE2NDgtNjkyNDJiM2MwNWIxIiwic2lkIjoiY2I0YWRiMDktZTFhYS00M2RiLTg5OTQtNTE4ZGQ2MDBjNDQyIn0.tQhpVR52i-gyTpbPrYVK03I9PtsZ2s93KqqspO0w4Mc",
  "access_expires_at": "2026-10-27T16:05:55.752905881Z",
  "refresh_token": "S07LMtt0dXHMCRrMynofgBV33TBLRZpVViDyFXk4oEs",
  "refresh_expires_at": "2026-10-28T03:50:55.752092151Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "f88b4ef0-0761-40d9-b502-039a74e9bdbc",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T15:50:55.348309Z",
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

`POST /api/admin/v1/client-deletions/f88b4ef0-0761-40d9-b502-039a74e9bdbc/complete` → **200**

```json
{
  "command_id": "36bef3c2-af19-4c3e-9582-7ce297044289",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "f88b4ef0-0761-40d9-b502-039a74e9bdbc",
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
  "correlation_id": "a19891d6-6583-42cf-8d59-9397959d9fb2"
}
```

Done: client f88b4ef0-0761-40d9-b502-039a74e9bdbc anonymized.

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
  "device_ref": "sandbox-9172"
}
```

```json
{
  "challenge_id": "28850f68-cd4f-4ab3-8c88-4f5a5d1a9612",
  "expires_at": "2026-10-27T15:55:55.976773233Z",
  "resend_available_at": "2026-10-27T15:50:56.976773233Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "007950",
  "sent_at": "2026-10-27T15:50:55.981019353Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28850f68-cd4f-4ab3-8c88-4f5a5d1a9612",
  "code": "007950",
  "device_ref": "sandbox-9172"
}
```

```json
{
  "session_id": "439db49c-b0b1-4542-9a28-dab500dd29cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE1NiwiaWF0IjoxNzkzMTE2MjU2LCJqdGkiOiI3YWMyODI5ZC02YTg0LTQxYTctYWE4Yy1kODI3OTVjZGQ3ZGQiLCJzaWQiOiI0MzlkYjQ5Yy1iMGIxLTQ1NDItOWEyOC1kYWI1MDBkZDI5Y2YifQ.70ECNAhOCpxYdnYq9S6Sy6sBy9UMxVZ_l2FZTYYeC18",
  "access_expires_at": "2026-10-27T16:05:56.055199705Z",
  "refresh_token": "lePQnCr8g_UkJ9EmEuwVgbXNNifiYIaWmzb9hGStva8",
  "refresh_expires_at": "2026-11-26T15:50:56.054440126Z",
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
  "command_id": "7546a602-fbe6-48a5-8663-8c41f9112eac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:56Z",
    "sequence": 1793116256120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:50:56.140565Z",
  "last_location_at": "2026-10-27T15:50:56.140565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672563866",
  "device_ref": "sandbox-25593"
}
```

```json
{
  "challenge_id": "dc5700eb-3cd7-42f5-8118-ae550b553253",
  "expires_at": "2026-10-27T15:55:56.178196733Z",
  "resend_available_at": "2026-10-27T15:50:57.178196733Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672563866` → **200**

```json
{
  "phone": "+380672563866",
  "audience": "CLIENT",
  "code": "747359",
  "sent_at": "2026-10-27T15:50:56.181411223Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc5700eb-3cd7-42f5-8118-ae550b553253",
  "code": "747359",
  "device_ref": "sandbox-25593"
}
```

```json
{
  "session_id": "04ec3e41-bbef-4807-839f-f002879a35ae",
  "subject": {
    "type": "CLIENT",
    "id": "ebab561b-15ef-4874-834c-9f96d7c67a48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmFiNTYxYi0xNWVmLTQ4NzQtODM0Yy05Zjk2ZDdjNjdhNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTU2LCJpYXQiOjE3OTMxMTYyNTYsImp0aSI6ImM5YjQ2YjBiLWM1MTAtNDU2MS1hOTIzLTllMDNlMjY2MWJiZSIsInNpZCI6IjA0ZWMzZTQxLWJiZWYtNDgwNy04MzlmLWYwMDI4NzlhMzVhZSJ9.mhthh-pUMikZnhgAW8hTOjCW40zUPIt9luC95jwNS_E",
  "access_expires_at": "2026-10-27T16:05:56.245302903Z",
  "refresh_token": "IqfdoNxtYbiZimWzNLFLLajfNIKfcCmw8Z71jm05or0",
  "refresh_expires_at": "2026-11-26T15:50:56.244422145Z",
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
  "command_id": "37710c8e-8256-4ad6-adbd-72e5001684a4",
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
  "id": "4bc4e4ce-b8be-4aa7-a6a7-1502c57e44cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:55:56.323297Z",
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
  "command_id": "f0f06358-daf3-4a33-b852-6a6c24e270df",
  "platform": "ANDROID",
  "token": "sandbox-driver-4ced362e-d02b-4403-9272-ea83024f20c1"
}
```

```json
{
  "id": "fca27aaf-51dc-4a85-a122-fcbb26dce97f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:50:56.375095Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "8f4aeecf-7dcb-4a20-8e51-da9891d17731",
  "platform": "ANDROID",
  "token": "sandbox-rider-733a4d65-b6b9-4f19-a940-e92b085fae35"
}
```

```json
{
  "id": "a093ba3b-e322-4420-91da-727bfcfbc54b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:50:56.417053Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a669d45c-1024-456d-a92e-2e2ac0a2bc23",
  "quote_id": "4bc4e4ce-b8be-4aa7-a6a7-1502c57e44cd",
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
  "id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ebab561b-15ef-4874-834c-9f96d7c67a48",
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
  "created_at": "2026-10-27T15:50:56.463443Z",
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
    "id": "602c6f4e-5f21-4ae9-a9d8-388466783835",
    "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
    "expires_at": "2026-10-27T15:51:11.468645Z",
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

`POST /api/driver/v1/offers/602c6f4e-5f21-4ae9-a9d8-388466783835/accept` → **200**

```json
{
  "command_id": "915557c9-507b-4178-b019-994d9375cada"
}
```

```json
{
  "id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "782055af-1307-48b3-87f4-196df1ce2e9a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:50:56.437Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:50:56.437Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:50:57.501472233Z",
    "token_suffix": "4f20c1",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
      "order_version": "2",
      "event_id": "5878cb43-5244-40c0-861f-4d0cf40aa67d",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672563866&after=2026-10-27T15:50:56.437Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:50:57.504119718Z",
    "token_suffix": "5fae35",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
      "order_version": "3",
      "event_id": "a5b868e7-e64b-4cb4-90fd-133a55e1a7e8",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b391b1ae-8517-4d98-a877-3c445cf6a004/messages` → **201**

```json
{
  "command_id": "7cf7ee1f-740c-412d-ab23-817a419e8e8b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "580ecc2d-d3a7-4717-84fd-b1fd05a5edb0",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T15:50:57.696543833Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "782055af-1307-48b3-87f4-196df1ce2e9a",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "assignment_id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3",
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

`POST /api/driver/v1/trips/782055af-1307-48b3-87f4-196df1ce2e9a/messages` → **201**

```json
{
  "command_id": "307c9bf5-a95d-4f64-b89d-bbf6c7db17d0",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ad0be3cf-e49b-405f-9f09-d20be477ca65",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T15:50:57.753047651Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b391b1ae-8517-4d98-a877-3c445cf6a004/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/782055af-1307-48b3-87f4-196df1ce2e9a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672563866"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:57Z",
    "sequence": 1793116257829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:50:57.849863Z",
  "last_location_at": "2026-10-27T15:50:57.849863Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "782055af-1307-48b3-87f4-196df1ce2e9a",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "assignment_id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3",
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

`POST /api/driver/v1/trips/782055af-1307-48b3-87f4-196df1ce2e9a/arrive` → **200**

```json
{
  "command_id": "b45d3bc8-4cc2-4df9-8a7c-13d5a76af6df",
  "expected_version": 0
}
```

```json
{
  "id": "782055af-1307-48b3-87f4-196df1ce2e9a",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "assignment_id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3",
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
  "arrived_at": "2026-10-27T15:50:57.906131Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/782055af-1307-48b3-87f4-196df1ce2e9a/start` → **200**

```json
{
  "command_id": "3f37602f-6174-4445-b2a9-984efa18e433",
  "expected_version": 1
}
```

```json
{
  "id": "782055af-1307-48b3-87f4-196df1ce2e9a",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "assignment_id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3",
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
  "arrived_at": "2026-10-27T15:50:57.906131Z",
  "started_at": "2026-10-27T15:50:57.942566Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:50:57Z",
    "sequence": 1793116257966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:50:57.989336Z",
  "last_location_at": "2026-10-27T15:50:57.989336Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/782055af-1307-48b3-87f4-196df1ce2e9a/complete` → **200**

```json
{
  "command_id": "eca98545-670c-432f-aeca-83ae519227a9",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:50:58Z",
  "cash_received": true
}
```

```json
{
  "id": "782055af-1307-48b3-87f4-196df1ce2e9a",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "assignment_id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3",
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
  "arrived_at": "2026-10-27T15:50:57.906131Z",
  "started_at": "2026-10-27T15:50:57.942566Z",
  "completed_at": "2026-10-27T15:50:58.028758Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b391b1ae-8517-4d98-a877-3c445cf6a004` → **200**

```json
{
  "id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ebab561b-15ef-4874-834c-9f96d7c67a48",
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
    "id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3",
    "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "782055af-1307-48b3-87f4-196df1ce2e9a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:50:56.463443Z",
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
    "id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:50:56.463443Z",
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
    "id": "782055af-1307-48b3-87f4-196df1ce2e9a",
    "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
    "order_short_number": 5,
    "created_at": "2026-10-27T15:50:56.551749Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "00e226bd-cc2a-43a7-b7d5-ef9e6dd013d7",
    "order_id": "f9539c97-3945-4f50-88be-3c2a27282a98",
    "order_short_number": 1,
    "created_at": "2026-10-27T15:50:38.103837Z",
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

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/b391b1ae-8517-4d98-a877-3c445cf6a004/tip` → **200**

```json
{
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
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
  "available_until": "2026-10-28T15:50:58.028758Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b391b1ae-8517-4d98-a877-3c445cf6a004/tip` → **201**

```json
{
  "command_id": "3d61ba45-644b-41ee-a7f4-3f09587e289d",
  "amount_minor": 1100
}
```

```json
{
  "id": "6119157a-1440-4efc-bdcd-529daaedcb26",
  "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T15:51:01.217934Z"
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
  "session_id": "a7e2861b-de36-4cce-a96a-ff57f274adc2",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNjEsImlhdCI6MTc5MzExNjI2MSwianRpIjoiZGQ3ZDZiOGItM2NjMC00MDI1LTkwYTctZGMxMTIxMDM1ZmEyIiwic2lkIjoiYTdlMjg2MWItZGUzNi00Y2NlLWE5NmEtZmY1N2YyNzRhZGMyIn0.fR5Tyz_kK-n-Sewfif7A6gRVshqJ85-anvizqqu64Os",
  "access_expires_at": "2026-10-27T16:06:01.578419537Z",
  "refresh_token": "vmrvlIr7uzO7x4DfXIigOCxX6Q9OeW_Psp1sx35qJd8",
  "refresh_expires_at": "2026-10-28T03:51:01.577702137Z",
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
  "session_id": "15a807a9-f2e9-4c3d-815a-a1be04adc76b",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNjEsImlhdCI6MTc5MzExNjI2MSwianRpIjoiNGI4N2UzYzktNjQ5OC00NDYwLThlY2YtMmFlYTZkNDEwYTYxIiwic2lkIjoiMTVhODA3YTktZjJlOS00YzNkLTgxNWEtYTFiZTA0YWRjNzZiIn0.5688R6rrAJHEDlUusJX-imWUTaEwUgVNNQdHqgDuVEo",
  "access_expires_at": "2026-10-27T16:06:01.933006915Z",
  "refresh_token": "Q71nKoG_lJaYROMTbLmiXUOo10Y6UYyLob82KPBudo0",
  "refresh_expires_at": "2026-10-28T03:51:01.932017686Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b391b1ae-8517-4d98-a877-3c445cf6a004/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:50:56.464509Z",
      "actor": {
        "type": "CLIENT",
        "id": "ebab561b-15ef-4874-834c-9f96d7c67a48",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
        "quote_id": "4bc4e4ce-b8be-4aa7-a6a7-1502c57e44cd",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:50:56.467328Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
        "attempt_id": "6dab92eb-0eba-4dcd-84ee-176575268070",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:50:56.475283Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "602c6f4e-5f21-4ae9-a9d8-388466783835",
        "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:50:56.554561Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "602c6f4e-5f21-4ae9-a9d8-388466783835",
        "order_id": "b391b1ae-8517-4d98-a877-3c445cf6a004",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "fd5e7099-37e5-47d8-9c0e-e1e8f52427f3"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order b391b1ae-8517-4d98-a877-3c445cf6a004.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27991"
}
```

```json
{
  "challenge_id": "8f11def6-9097-4938-acf3-bf825f8d6889",
  "expires_at": "2026-10-27T15:56:02.017403713Z",
  "resend_available_at": "2026-10-27T15:51:03.017403713Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "530293",
  "sent_at": "2026-10-27T15:51:02.021390478Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f11def6-9097-4938-acf3-bf825f8d6889",
  "code": "530293",
  "device_ref": "sandbox-27991"
}
```

```json
{
  "session_id": "3d50f647-d618-49c8-8895-d2b4f9ceb6a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE2MiwiaWF0IjoxNzkzMTE2MjYyLCJqdGkiOiI0MGQyYWY1ZS1hODMyLTQ0MzQtYjJkNi1lZTZkMTY0YjJmMWUiLCJzaWQiOiIzZDUwZjY0Ny1kNjE4LTQ5YzgtODg5NS1kMmI0ZjljZWI2YTUifQ.pwbzYogio0r2FRVgStUYhqzaQp8LF4cRe7nzgM-AgFA",
  "access_expires_at": "2026-10-27T16:06:02.097418609Z",
  "refresh_token": "tzZR0TuyF-wnwjYVW_U3VE1mLoewd5KkCmZqjCDLthc",
  "refresh_expires_at": "2026-11-26T15:51:02.096304675Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:50:57.989336Z",
  "last_location_at": "2026-10-27T15:50:57.989336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/handover` → **200**

```json
{
  "command_id": "509a7014-dd01-4148-9d72-8406c04cda6f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:50:57.989336Z",
  "last_location_at": "2026-10-27T15:50:57.989336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:02Z",
    "sequence": 1793116262196
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:02.218764Z",
  "last_location_at": "2026-10-27T15:51:02.218764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669142364",
  "device_ref": "sandbox-8423"
}
```

```json
{
  "challenge_id": "ceffbafd-53d0-4319-be70-7dacf08bc538",
  "expires_at": "2026-10-27T15:56:02.251001776Z",
  "resend_available_at": "2026-10-27T15:51:03.251001776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669142364` → **200**

```json
{
  "phone": "+380669142364",
  "audience": "CLIENT",
  "code": "670255",
  "sent_at": "2026-10-27T15:51:02.25433797Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ceffbafd-53d0-4319-be70-7dacf08bc538",
  "code": "670255",
  "device_ref": "sandbox-8423"
}
```

```json
{
  "session_id": "cfde01e7-fc06-4507-81ec-4693ed3533e4",
  "subject": {
    "type": "CLIENT",
    "id": "4cf0d1e7-c669-4709-8313-56885381d9ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Y2YwZDFlNy1jNjY5LTQ3MDktODMxMy01Njg4NTM4MWQ5ZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTYyLCJpYXQiOjE3OTMxMTYyNjIsImp0aSI6IjA1MjE0YTRlLTlmZTgtNDBhNi1hYjQ0LWRkYmVkZjc3N2RjMyIsInNpZCI6ImNmZGUwMWU3LWZjMDYtNDUwNy04MWVjLTQ2OTNlZDM1MzNlNCJ9.ZtjUUii0_UrFKUQRiHFdAXU87RDky_aSc3X33AAMGJM",
  "access_expires_at": "2026-10-27T16:06:02.321307414Z",
  "refresh_token": "2YWeN6FkJG2_6lzxy5nkyvxeZ9StZwNQwZ3rLS8GWo0",
  "refresh_expires_at": "2026-11-26T15:51:02.320442192Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ef948d0-e746-4a74-912f-b379324e0f0e",
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
  "id": "2598b2fc-8af4-4628-928b-47510d933078",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T15:56:02.365788Z",
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
  "command_id": "286873a5-542b-4925-b74d-8374f1226a2e",
  "quote_id": "2598b2fc-8af4-4628-928b-47510d933078",
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
  "id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4cf0d1e7-c669-4709-8313-56885381d9ee",
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
  "created_at": "2026-10-27T15:51:02.414322Z",
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
    "id": "c51c95d2-ea76-41b3-a835-18b1085e20a0",
    "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
    "expires_at": "2026-10-27T15:51:17.418061Z",
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

`POST /api/driver/v1/offers/c51c95d2-ea76-41b3-a835-18b1085e20a0/accept` → **200**

```json
{
  "command_id": "5f5344fc-011b-43bd-a7cc-e31c89c29496"
}
```

```json
{
  "id": "fcf5dad3-cdb3-48bb-aa7e-2c90248a5712",
  "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "71b46ca9-4662-4813-9491-5132acec9d48",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71b46ca9-4662-4813-9491-5132acec9d48",
  "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
  "assignment_id": "fcf5dad3-cdb3-48bb-aa7e-2c90248a5712",
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

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:02Z",
    "sequence": 1793116262563
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:02.588574Z",
  "last_location_at": "2026-10-27T15:51:02.588574Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/71b46ca9-4662-4813-9491-5132acec9d48/arrive` → **200**

```json
{
  "command_id": "ba308403-cc53-4076-b928-a755c9bfecf0",
  "expected_version": 0
}
```

```json
{
  "id": "71b46ca9-4662-4813-9491-5132acec9d48",
  "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
  "assignment_id": "fcf5dad3-cdb3-48bb-aa7e-2c90248a5712",
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
  "arrived_at": "2026-10-27T15:51:02.637725Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/71b46ca9-4662-4813-9491-5132acec9d48/start` → **200**

```json
{
  "command_id": "df3608aa-f6be-4d67-8f8d-76d61fcad01b",
  "expected_version": 1
}
```

```json
{
  "id": "71b46ca9-4662-4813-9491-5132acec9d48",
  "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
  "assignment_id": "fcf5dad3-cdb3-48bb-aa7e-2c90248a5712",
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
  "arrived_at": "2026-10-27T15:51:02.637725Z",
  "started_at": "2026-10-27T15:51:02.684302Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:02Z",
    "sequence": 1793116262715
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:02.737809Z",
  "last_location_at": "2026-10-27T15:51:02.737809Z",
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
  "device_ref": "sandbox-20655"
}
```

```json
{
  "challenge_id": "31691782-20ee-4882-8e69-b880768a3d59",
  "expires_at": "2026-10-27T15:56:02.766496187Z",
  "resend_available_at": "2026-10-27T15:51:03.766496187Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "737968",
  "sent_at": "2026-10-27T15:51:02.769767852Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31691782-20ee-4882-8e69-b880768a3d59",
  "code": "737968",
  "device_ref": "sandbox-20655"
}
```

```json
{
  "session_id": "8615fef2-7a22-49da-ab83-17f3095911a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE2MiwiaWF0IjoxNzkzMTE2MjYyLCJqdGkiOiI2N2IwNzY3Zi0yOGRhLTRkOGUtODllZi05YTdmNjQ1MmYzMzgiLCJzaWQiOiI4NjE1ZmVmMi03YTIyLTQ5ZGEtYWI4My0xN2YzMDk1OTExYTcifQ.tHhfY3jonUOCsBBxh_vHTBhka3y-aRRG5qIFX42rESg",
  "access_expires_at": "2026-10-27T16:06:02.832944395Z",
  "refresh_token": "zQjmNk2RWEVig5PZG44O0fw-WbZq7ZxFjmp7YNAXvmA",
  "refresh_expires_at": "2026-11-26T15:51:02.83226426Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d64da8e8-2cdc-4132-8cc4-60db9eb5a057",
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
  "last_heartbeat_at": "2026-10-27T15:50:43.034876Z",
  "last_location_at": "2026-10-27T15:50:43.034876Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d64da8e8-2cdc-4132-8cc4-60db9eb5a057/handover` → **200**

```json
{
  "command_id": "488c13c5-6233-42b8-a780-f713b15ce223",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d64da8e8-2cdc-4132-8cc4-60db9eb5a057",
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
  "last_heartbeat_at": "2026-10-27T15:50:43.034876Z",
  "last_location_at": "2026-10-27T15:50:43.034876Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d64da8e8-2cdc-4132-8cc4-60db9eb5a057/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:02Z",
    "sequence": 1793116262935
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d64da8e8-2cdc-4132-8cc4-60db9eb5a057",
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
  "last_heartbeat_at": "2026-10-27T15:51:02.958711Z",
  "last_location_at": "2026-10-27T15:51:02.958711Z",
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
  "session_id": "606924de-ed9a-467a-a383-9002c4fcaaf1",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNjMsImlhdCI6MTc5MzExNjI2MywianRpIjoiNjFkNzcxOTQtODMzOS00ODgzLWE4Y2ItMWE2MGMxNDg1ZTFhIiwic2lkIjoiNjA2OTI0ZGUtZWQ5YS00NjdhLWEzODMtOTAwMmM0ZmNhYWYxIn0.MbCfhHSeBX8W96rpyrGamvQaLZ2kNn1w-V_9Y9X849Y",
  "access_expires_at": "2026-10-27T16:06:03.315331789Z",
  "refresh_token": "dXlg3_26KE6DDwEG6OAoL7XTqHsDCKvwLUI64sOcTJo",
  "refresh_expires_at": "2026-10-28T03:51:03.314611759Z",
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
  "session_id": "e45f6904-34ba-4ce9-800e-e27fd94b4d8c",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNjMsImlhdCI6MTc5MzExNjI2MywianRpIjoiMmQxMDQ3MDUtZjc2My00YjJlLThjZDUtMWQyYzMxYTA5MDcxIiwic2lkIjoiZTQ1ZjY5MDQtMzRiYS00Y2U5LTgwMGUtZTI3ZmQ5NGI0ZDhjIn0.V7y5K8IfPSb8LAJYwDN-BxGjIQaTvpRuSzbYbLeCEMY",
  "access_expires_at": "2026-10-27T16:06:03.673277488Z",
  "refresh_token": "5rwQ5pkOIJ2tQB90KH70hAA43LiQCMeNlXgW5kSon0Q",
  "refresh_expires_at": "2026-10-28T03:51:03.672428072Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1ac2cc0c-efbb-4b18-8005-c0bbcb51c484` → **200**

```json
{
  "id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4cf0d1e7-c669-4709-8313-56885381d9ee",
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
    "id": "fcf5dad3-cdb3-48bb-aa7e-2c90248a5712",
    "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "71b46ca9-4662-4813-9491-5132acec9d48",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T15:51:02.414322Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1ac2cc0c-efbb-4b18-8005-c0bbcb51c484/interrupt` → **200**

```json
{
  "command_id": "927d02ca-b0a2-4863-b6a3-bd0476edf135",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "4cf0d1e7-c669-4709-8313-56885381d9ee",
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
      "id": "fcf5dad3-cdb3-48bb-aa7e-2c90248a5712",
      "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "71b46ca9-4662-4813-9491-5132acec9d48",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T15:51:02.414322Z",
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
    "id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "4cf0d1e7-c669-4709-8313-56885381d9ee",
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
    "id": "19503bcb-d170-49e2-a8dd-7e3f425017dd",
    "order_id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
    "expires_at": "2026-10-27T15:51:18.817519Z",
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

`POST /api/driver/v1/offers/19503bcb-d170-49e2-a8dd-7e3f425017dd/accept` → **200**

```json
{
  "command_id": "42eb7cc1-09bf-49bb-b9ac-919ee1376350"
}
```

```json
{
  "id": "c72b03c1-39b5-4769-b97d-fa19f649f26f",
  "order_id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f",
  "order_id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
  "assignment_id": "c72b03c1-39b5-4769-b97d-fa19f649f26f",
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
  "session_id": "d64da8e8-2cdc-4132-8cc4-60db9eb5a057",
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
  "last_heartbeat_at": "2026-10-27T15:51:02.958711Z",
  "last_location_at": "2026-10-27T15:51:02.958711Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d64da8e8-2cdc-4132-8cc4-60db9eb5a057/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:03Z",
    "sequence": 1793116263986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d64da8e8-2cdc-4132-8cc4-60db9eb5a057",
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
  "last_heartbeat_at": "2026-10-27T15:51:04.012227Z",
  "last_location_at": "2026-10-27T15:51:04.012227Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f/arrive` → **200**

```json
{
  "command_id": "73c87b4e-96d4-4ac3-b592-d3afcf7713ed",
  "expected_version": 0
}
```

```json
{
  "id": "1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f",
  "order_id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
  "assignment_id": "c72b03c1-39b5-4769-b97d-fa19f649f26f",
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
  "arrived_at": "2026-10-27T15:51:04.065035Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f/start` → **200**

```json
{
  "command_id": "7605d06e-74fc-495d-ad64-8f9ca96a2e7c",
  "expected_version": 1
}
```

```json
{
  "id": "1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f",
  "order_id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
  "assignment_id": "c72b03c1-39b5-4769-b97d-fa19f649f26f",
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
  "arrived_at": "2026-10-27T15:51:04.065035Z",
  "started_at": "2026-10-27T15:51:04.120968Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f/complete` → **200**

```json
{
  "command_id": "e5e73842-899e-4c3f-bc35-45417a061926",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:51:04Z"
}
```

```json
{
  "id": "1ecb0e3c-ba86-44de-8f0b-7989be6b7a6f",
  "order_id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
  "assignment_id": "c72b03c1-39b5-4769-b97d-fa19f649f26f",
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
  "arrived_at": "2026-10-27T15:51:04.065035Z",
  "started_at": "2026-10-27T15:51:04.120968Z",
  "completed_at": "2026-10-27T15:51:04.173409Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "5a38baf9-e6c5-4bc6-8482-2925e1b59e90",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:51:03.805804Z",
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
    "id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:51:02.414322Z",
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

`GET /api/operator/v1/orders/1ac2cc0c-efbb-4b18-8005-c0bbcb51c484/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:51:02.414999Z",
      "actor": {
        "type": "CLIENT",
        "id": "4cf0d1e7-c669-4709-8313-56885381d9ee",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
        "quote_id": "2598b2fc-8af4-4628-928b-47510d933078",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:51:02.417133Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
        "attempt_id": "9ef50654-90c3-4dc4-a8ab-ac021b1b31a4",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:51:02.423361Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c51c95d2-ea76-41b3-a835-18b1085e20a0",
        "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:51:02.505567Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c51c95d2-ea76-41b3-a835-18b1085e20a0",
        "order_id": "1ac2cc0c-efbb-4b18-8005-c0bbcb51c484",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "fcf5dad3-cdb3-48bb-aa7e-2c90248a5712"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 1ac2cc0c-efbb-4b18-8005-c0bbcb51c484, follow-up 5a38baf9-e6c5-4bc6-8482-2925e1b59e90.

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
  "session_id": "ba662e0e-4c58-4dc9-8d5c-3f90644aef84",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNjcsImlhdCI6MTc5MzExNjI2NywianRpIjoiNDVkM2FjMjctOWJlZi00NWQ5LWI2MjMtMTgyMWFmZDQyOTlhIiwic2lkIjoiYmE2NjJlMGUtNGM1OC00ZGM5LThkNWMtM2Y5MDY0NGFlZjg0In0.1bCBZx46QAfBhc17UwCscDQos-93H26UnvJXYLOquuo",
  "access_expires_at": "2026-10-27T16:06:07.628634944Z",
  "refresh_token": "LI77_nCWUlQN1DML7UpMLK4Ho_np58teMfAFAPhP6XQ",
  "refresh_expires_at": "2026-10-28T03:51:07.628115958Z",
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
  "session_id": "0c76d143-ed02-4b20-90d2-f41cec3f267a",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNjcsImlhdCI6MTc5MzExNjI2NywianRpIjoiODViYzc0OTEtZjRiZS00YzNmLTg2ZDYtZjYwMTdiMzZhYTE3Iiwic2lkIjoiMGM3NmQxNDMtZWQwMi00YjIwLTkwZDItZjQxY2VjM2YyNjdhIn0.Ch4IEDlzC-Bvl23fsJxcxUXxtbHEicxSvxZVj8yXpQQ",
  "access_expires_at": "2026-10-27T16:06:07.973445555Z",
  "refresh_token": "MWFm8ESfkd1uHU1wkiZPp_bCHPJqCcQeopHGS0j66uY",
  "refresh_expires_at": "2026-10-28T03:51:07.972990991Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26472"
}
```

```json
{
  "challenge_id": "905a7537-2873-428a-ab92-00a51d20f587",
  "expires_at": "2026-10-27T15:56:07.997578816Z",
  "resend_available_at": "2026-10-27T15:51:08.997578816Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "590842",
  "sent_at": "2026-10-27T15:51:07.999881352Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "905a7537-2873-428a-ab92-00a51d20f587",
  "code": "590842",
  "device_ref": "sandbox-26472"
}
```

```json
{
  "session_id": "a0915fb7-d8dc-41ab-a90a-4759d246c152",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE2OCwiaWF0IjoxNzkzMTE2MjY4LCJqdGkiOiJkMmYyMTdmMy01NTg0LTQyNmEtYTY1OC00ODVkYzAxZmI2MmQiLCJzaWQiOiJhMDkxNWZiNy1kOGRjLTQxYWItYTkwYS00NzU5ZDI0NmMxNTIifQ.hMLK8VEtK6zAkKVTdi_VPDdP_KjkEqhM-kJY4ZW3bEw",
  "access_expires_at": "2026-10-27T16:06:08.051459634Z",
  "refresh_token": "lxSy7MWxJegNMPFoRg6H4DZBScUgj9z95UQvcljapB0",
  "refresh_expires_at": "2026-11-26T15:51:08.050888254Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:02.737809Z",
  "last_location_at": "2026-10-27T15:51:02.737809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/handover` → **200**

```json
{
  "command_id": "358f9a93-8c9f-4b96-9f0e-ca8074824691",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:02.737809Z",
  "last_location_at": "2026-10-27T15:51:02.737809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:08Z",
    "sequence": 1793116268132
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:08.150286Z",
  "last_location_at": "2026-10-27T15:51:08.150286Z",
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
  "command_id": "85c0cfe1-8329-48c2-834b-db26b1a258b1",
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
  "effective_at": "2026-10-27T15:51:08.219495Z",
  "changed_by": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T15:51:08.248795755Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ef032d43-45ba-4c2f-961d-f270a135ab10",
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
  "id": "4552587d-734c-4153-b85e-6cede064ffe3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:56:08.289271Z",
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
  "command_id": "61625a6a-073d-4438-abce-983803fb7dcb",
  "quote_id": "4552587d-734c-4153-b85e-6cede064ffe3",
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
    "phone": "+380671119673"
  }
}
```

```json
{
  "id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
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
  "created_at": "2026-10-27T15:51:08.336699Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119673"
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
    "id": "1eb27a84-f09a-4889-b234-3252d5fcc55b",
    "order_id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
    "expires_at": "2026-10-27T15:51:23.342027Z",
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

`POST /api/driver/v1/offers/1eb27a84-f09a-4889-b234-3252d5fcc55b/accept` → **200**

```json
{
  "command_id": "e29d1dfd-0c1a-42ca-b98e-88df235eccb4"
}
```

```json
{
  "id": "725637fb-6de3-471e-8bd2-1a889bae9e47",
  "order_id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cb84fc85-a3a7-46ef-9daf-718b7f4d30a4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cb84fc85-a3a7-46ef-9daf-718b7f4d30a4",
  "order_id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
  "assignment_id": "725637fb-6de3-471e-8bd2-1a889bae9e47",
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

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:08Z",
    "sequence": 1793116268435
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:08.451099Z",
  "last_location_at": "2026-10-27T15:51:08.451099Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cb84fc85-a3a7-46ef-9daf-718b7f4d30a4/arrive` → **200**

```json
{
  "command_id": "d8f60ae4-2d68-4f31-a2b3-dec077ba31e0",
  "expected_version": 0
}
```

```json
{
  "id": "cb84fc85-a3a7-46ef-9daf-718b7f4d30a4",
  "order_id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
  "assignment_id": "725637fb-6de3-471e-8bd2-1a889bae9e47",
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
  "arrived_at": "2026-10-27T15:51:08.482982Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/cb84fc85-a3a7-46ef-9daf-718b7f4d30a4/start` → **200**

```json
{
  "command_id": "aeb58e98-aaca-4501-bc9c-5402e411e2c5",
  "expected_version": 1
}
```

```json
{
  "id": "cb84fc85-a3a7-46ef-9daf-718b7f4d30a4",
  "order_id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
  "assignment_id": "725637fb-6de3-471e-8bd2-1a889bae9e47",
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
  "arrived_at": "2026-10-27T15:51:08.482982Z",
  "started_at": "2026-10-27T15:51:08.519959Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/cb84fc85-a3a7-46ef-9daf-718b7f4d30a4/complete` → **200**

```json
{
  "command_id": "7498b469-5c36-4d9e-b330-c6fc0791a2ba",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:51:08Z",
  "cash_received": true
}
```

```json
{
  "id": "cb84fc85-a3a7-46ef-9daf-718b7f4d30a4",
  "order_id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
  "assignment_id": "725637fb-6de3-471e-8bd2-1a889bae9e47",
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
  "arrived_at": "2026-10-27T15:51:08.482982Z",
  "started_at": "2026-10-27T15:51:08.519959Z",
  "completed_at": "2026-10-27T15:51:08.561703Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1f959c87-2d61-4964-9b1a-872fb3685039",
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
  "id": "57c6d8ea-90ff-4d38-8f33-7be884b9ee5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:56:08.609986Z",
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
  "command_id": "304c8c81-3392-4f3f-9922-5a366f88f1a8",
  "quote_id": "57c6d8ea-90ff-4d38-8f33-7be884b9ee5d",
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
    "phone": "+380671117584"
  }
}
```

```json
{
  "id": "2644f3d0-996f-41ee-9c07-bfcee014e217",
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
  "created_at": "2026-10-27T15:51:08.648276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117584"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2644f3d0-996f-41ee-9c07-bfcee014e217` → **200**

```json
{
  "id": "2644f3d0-996f-41ee-9c07-bfcee014e217",
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
  "created_at": "2026-10-27T15:51:08.648276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117584"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2644f3d0-996f-41ee-9c07-bfcee014e217/cancel` → **200**

```json
{
  "command_id": "867c2dd9-6a88-496b-b7f1-dd9cbd0d7633",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "2644f3d0-996f-41ee-9c07-bfcee014e217",
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
  "created_at": "2026-10-27T15:51:08.648276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117584"
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
  "staff_id": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T15:51:08.726462Z",
  "last_entries": [
    {
      "order_id": "2644f3d0-996f-41ee-9c07-bfcee014e217",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T15:51:08.726462Z"
    },
    {
      "order_id": "245df27f-c0cd-423d-99d0-441f0b78b6aa",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T15:51:08.568305Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ed8d349-65b8-446d-8357-0439b2bdd869",
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
  "last_heartbeat_at": "2026-10-27T15:51:08.451099Z",
  "last_location_at": "2026-10-27T15:51:08.451099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ed8d349-65b8-446d-8357-0439b2bdd869/close` → **200**

```json
{
  "command_id": "aea382aa-fc17-456d-889d-ae18b392ea84",
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

Done: operator bonus for fulfilled 245df27f-c0cd-423d-99d0-441f0b78b6aa and operator-fault cancellation 2644f3d0-996f-41ee-9c07-bfcee014e217.

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
  "session_id": "22de2652-c40e-40af-8ab1-a4e2b410d8b1",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzEsImlhdCI6MTc5MzExNjI3MSwianRpIjoiNmU3NjNjM2MtODNhNi00YWI5LTg1MDYtMDEwMTU0MDJkZWNlIiwic2lkIjoiMjJkZTI2NTItYzQwZS00MGFmLThhYjEtYTRlMmI0MTBkOGIxIn0.f862Ufdqrki_I7uIuRFLrkhHkrakFsZw36tcobXuUYo",
  "access_expires_at": "2026-10-27T16:06:11.219224617Z",
  "refresh_token": "WaVdFYwXpSd3nKKJqfxzPtOUTg8CIlrkS62l3cSCVEc",
  "refresh_expires_at": "2026-10-28T03:51:11.218685902Z",
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
  "command_id": "6e9f4334-3983-4d0a-90b7-3774abf49c48",
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
    }
  },
  "changed_by": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T15:51:11.304008123Z"
}
```

## The rider books the airport for 2026-10-27T18:51:10Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600026880",
  "device_ref": "sandbox-13256"
}
```

```json
{
  "challenge_id": "81b955cb-6b71-4861-bec2-8b3731457505",
  "expires_at": "2026-10-27T15:56:11.34328781Z",
  "resend_available_at": "2026-10-27T15:51:12.34328781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600026880` → **200**

```json
{
  "phone": "+48600026880",
  "audience": "CLIENT",
  "code": "598531",
  "sent_at": "2026-10-27T15:51:11.345826938Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81b955cb-6b71-4861-bec2-8b3731457505",
  "code": "598531",
  "device_ref": "sandbox-13256"
}
```

```json
{
  "session_id": "cc966713-592c-4f4d-ace7-552f4c1c77d4",
  "subject": {
    "type": "CLIENT",
    "id": "b27ead67-0946-49ec-8e27-9c18b53d7c64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjdlYWQ2Ny0wOTQ2LTQ5ZWMtOGUyNy05YzE4YjUzZDdjNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTcxLCJpYXQiOjE3OTMxMTYyNzEsImp0aSI6IjZhNmU4NWIzLWM4ZTQtNDgzNy05MzcyLWE5ODYwYjEzZTY0OSIsInNpZCI6ImNjOTY2NzEzLTU5MmMtNGY0ZC1hY2U3LTU1MmY0YzFjNzdkNCJ9.3n1hmxtY7d3PavWLOgbmyaCHQXxFo8-RUPUqqmcVBww",
  "access_expires_at": "2026-10-27T16:06:11.409900821Z",
  "refresh_token": "qdmxHW1toI-nzby7LHPzsUyBMKaG_abxQ3ggTG_jlds",
  "refresh_expires_at": "2026-11-26T15:51:11.409279977Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c27dfdd8-f4ff-4102-ad7c-9ceee650f5d6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T18:51:10Z"
}
```

```json
{
  "id": "c7394d3f-368c-42a1-86e7-cd93ad03f96c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T15:56:11.453863Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T18:51:10Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "414120c4-cac8-4b49-9aa4-518cc76bc37e",
  "quote_id": "c7394d3f-368c-42a1-86e7-cd93ad03f96c",
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
  "pickup_at": "2026-10-27T18:51:10Z"
}
```

```json
{
  "id": "9c5cd846-f226-4950-b239-ce2823651e2c",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b27ead67-0946-49ec-8e27-9c18b53d7c64",
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
  "created_at": "2026-10-27T15:51:11.503222Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T18:51:10Z",
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
  "device_ref": "sandbox-31786"
}
```

```json
{
  "challenge_id": "98385fc4-5dc6-41aa-aecd-22ab79dc3693",
  "expires_at": "2026-10-27T15:56:11.542789432Z",
  "resend_available_at": "2026-10-27T15:51:12.542789432Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "527861",
  "sent_at": "2026-10-27T15:51:11.546065149Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98385fc4-5dc6-41aa-aecd-22ab79dc3693",
  "code": "527861",
  "device_ref": "sandbox-31786"
}
```

```json
{
  "session_id": "0a4a0825-b2ba-4f78-ba9b-d92c20737ab3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE3MSwiaWF0IjoxNzkzMTE2MjcxLCJqdGkiOiI3ZDg4NGVmNi01N2E4LTQwMTMtODRlOS1lNTc0YjZjYTZlNzkiLCJzaWQiOiIwYTRhMDgyNS1iMmJhLTRmNzgtYmE5Yi1kOTJjMjA3MzdhYjMifQ.FSUryVZYWT99jnVKP5tQYczMpTGXs_JsQT0b2jLxtCA",
  "access_expires_at": "2026-10-27T16:06:11.612459002Z",
  "refresh_token": "NVHSMoPS4HTvGupjJoq5aoWE_mQ8FsMurHT05LBrNmg",
  "refresh_expires_at": "2026-11-26T15:51:11.611721911Z",
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
  "command_id": "38806261-412f-4f85-a76f-ad81610978bb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:11Z",
    "sequence": 1793116271670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13bde723-fa42-4008-90df-ce7c31eff105",
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
  "last_heartbeat_at": "2026-10-27T15:51:11.688973Z",
  "last_location_at": "2026-10-27T15:51:11.688973Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9c5cd846-f226-4950-b239-ce2823651e2c",
      "short_number": 10,
      "pickup_at": "2026-10-27T18:51:10Z",
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

`POST /api/driver/v1/preorders/9c5cd846-f226-4950-b239-ce2823651e2c/reserve` → **200**

```json
{
  "command_id": "7f1a11d9-a12f-4420-ad11-208c4e4b526f"
}
```

```json
{
  "id": "3a9443cf-3a13-4265-ae6f-052e4935f399",
  "state": "RESERVED",
  "order": {
    "order_id": "9c5cd846-f226-4950-b239-ce2823651e2c",
    "short_number": 10,
    "pickup_at": "2026-10-27T18:51:10Z",
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
  "reserved_at": "2026-10-27T15:51:11.77146Z",
  "confirm_from": "2026-10-27T18:21:10Z",
  "confirm_until": "2026-10-27T18:31:10Z",
  "drop_until": "2026-10-27T17:51:10Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "3a9443cf-3a13-4265-ae6f-052e4935f399",
      "state": "RESERVED",
      "order": {
        "order_id": "9c5cd846-f226-4950-b239-ce2823651e2c",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:51:10Z",
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
      "reserved_at": "2026-10-27T15:51:11.77146Z",
      "confirm_from": "2026-10-27T18:21:10Z",
      "confirm_until": "2026-10-27T18:31:10Z",
      "drop_until": "2026-10-27T17:51:10Z"
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
      "id": "3a9443cf-3a13-4265-ae6f-052e4935f399",
      "state": "RESERVED",
      "order": {
        "order_id": "9c5cd846-f226-4950-b239-ce2823651e2c",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:51:10Z",
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
      "reserved_at": "2026-10-27T15:51:11.77146Z",
      "confirm_from": "2026-10-27T18:21:10Z",
      "confirm_until": "2026-10-27T18:31:10Z",
      "drop_until": "2026-10-27T17:51:10Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/3a9443cf-3a13-4265-ae6f-052e4935f399/confirm` → **409**

```json
{
  "command_id": "2af4681a-2ae4-4fe3-b1e4-08defb51c4f5"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/3a9443cf-3a13-4265-ae6f-052e4935f399/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "36d75a6a-6e2b-42e3-a06e-d36a52819654"
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
  "session_id": "445dfffa-2e95-40e5-a9b3-03244f07785b",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzIsImlhdCI6MTc5MzExNjI3MiwianRpIjoiNjFhNGZjOTUtNzQxOS00OGVmLWIxZDItZTQ3NWYxMTVmYWE1Iiwic2lkIjoiNDQ1ZGZmZmEtMmU5NS00MGU1LWE5YjMtMDMyNDRmMDc3ODViIn0.z9UP6gKdwYn0Xeb1IA5Hi-FLkTiIIAOdkjnVIJXc8pA",
  "access_expires_at": "2026-10-27T16:06:12.242657654Z",
  "refresh_token": "xOh-WUf52L-wlHnbLJx7z95k75ANKrhUdqlQSOHmdMs",
  "refresh_expires_at": "2026-10-28T03:51:12.241883103Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9c5cd846-f226-4950-b239-ce2823651e2c` → **200**

```json
{
  "id": "9c5cd846-f226-4950-b239-ce2823651e2c",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b27ead67-0946-49ec-8e27-9c18b53d7c64",
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
  "created_at": "2026-10-27T15:51:11.503222Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T18:51:10Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "3a9443cf-3a13-4265-ae6f-052e4935f399",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T15:51:11.77146Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9c5cd846-f226-4950-b239-ce2823651e2c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T15:51:11.505081Z",
      "actor": {
        "type": "CLIENT",
        "id": "b27ead67-0946-49ec-8e27-9c18b53d7c64",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9c5cd846-f226-4950-b239-ce2823651e2c",
        "preorder": true,
        "quote_id": "c7394d3f-368c-42a1-86e7-cd93ad03f96c",
        "pickup_at": "2026-10-27T18:51:10Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T15:51:11.773034Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9c5cd846-f226-4950-b239-ce2823651e2c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "3a9443cf-3a13-4265-ae6f-052e4935f399"
      }
    }
  ]
}
```

Done: pre-order 9c5cd846-f226-4950-b239-ce2823651e2c, reservation 3a9443cf-3a13-4265-ae6f-052e4935f399.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9661"
}
```

```json
{
  "challenge_id": "9f0dfbe8-0c2b-48e5-a594-82d1128c4e0b",
  "expires_at": "2026-10-27T15:56:12.343634724Z",
  "resend_available_at": "2026-10-27T15:51:13.343634724Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "724675",
  "sent_at": "2026-10-27T15:51:12.346130464Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f0dfbe8-0c2b-48e5-a594-82d1128c4e0b",
  "code": "724675",
  "device_ref": "sandbox-9661"
}
```

```json
{
  "session_id": "78554383-60b9-43b2-95e9-009c2eadfac4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE3MiwiaWF0IjoxNzkzMTE2MjcyLCJqdGkiOiI1YTJhNTY3Yy05ZTY3LTRhMDgtYjlmZi0xMmZiZmU3NjQwZmUiLCJzaWQiOiI3ODU1NDM4My02MGI5LTQzYjItOTVlOS0wMDljMmVhZGZhYzQifQ.rHUzn33VHbkZShUJEihy5qt-vIwHfjNe-gyee7pGsbY",
  "access_expires_at": "2026-10-27T16:06:12.406461278Z",
  "refresh_token": "76prnfGddXc_RClsOvx5zPri1Kac1795hEQA1ZG0iq4",
  "refresh_expires_at": "2026-11-26T15:51:12.405737766Z",
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
  "command_id": "0e1c2c21-84b6-472a-a57c-8f2836491b78",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:12Z",
    "sequence": 1793116272462
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68c93057-07e1-487a-9050-2c8d1356087a",
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
  "last_heartbeat_at": "2026-10-27T15:51:12.480394Z",
  "last_location_at": "2026-10-27T15:51:12.480394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674162555",
  "device_ref": "sandbox-31543"
}
```

```json
{
  "challenge_id": "75e818ae-3dfc-4251-86dd-e3eef6a201ae",
  "expires_at": "2026-10-27T15:56:12.51173008Z",
  "resend_available_at": "2026-10-27T15:51:13.51173008Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674162555` → **200**

```json
{
  "phone": "+380674162555",
  "audience": "CLIENT",
  "code": "305210",
  "sent_at": "2026-10-27T15:51:12.514295382Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75e818ae-3dfc-4251-86dd-e3eef6a201ae",
  "code": "305210",
  "device_ref": "sandbox-31543"
}
```

```json
{
  "session_id": "55122bee-745f-43a7-b4c0-41268d8769c4",
  "subject": {
    "type": "CLIENT",
    "id": "1f87f1f8-edd5-4ae5-8620-228ff4f88cae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjg3ZjFmOC1lZGQ1LTRhZTUtODYyMC0yMjhmZjRmODhjYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTcyLCJpYXQiOjE3OTMxMTYyNzIsImp0aSI6IjAzMjM0YTBhLTdlZTEtNDk0Yi1hMWNmLTYwZjc0ZjYwODI1MCIsInNpZCI6IjU1MTIyYmVlLTc0NWYtNDNhNy1iNGMwLTQxMjY4ZDg3NjljNCJ9._n9lMX8qYh-k_-jVIi031BIoFcRCGzH071DrRzn174Q",
  "access_expires_at": "2026-10-27T16:06:12.572196006Z",
  "refresh_token": "jdpcwMV-Nneu89xmWSmbn5RCqOGqZJm5AOuCkNsD7aA",
  "refresh_expires_at": "2026-11-26T15:51:12.571713913Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eabcdb45-08a1-48f7-88a8-7a41bb0eaff6",
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
  "id": "d6b3b8cf-3827-4c4d-af83-770e3198bcf9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:56:12.614995Z",
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
  "command_id": "23be9776-1dd0-4db3-8d51-18ab583a50a7",
  "quote_id": "d6b3b8cf-3827-4c4d-af83-770e3198bcf9",
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
  "id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f87f1f8-edd5-4ae5-8620-228ff4f88cae",
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
  "created_at": "2026-10-27T15:51:12.656831Z",
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
    "id": "6562f74b-461b-40d8-8e2a-45cdfb9ffbde",
    "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
    "expires_at": "2026-10-27T15:51:27.660189Z",
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

`POST /api/driver/v1/offers/6562f74b-461b-40d8-8e2a-45cdfb9ffbde/accept` → **200**

```json
{
  "command_id": "d23e6c8c-cc9a-44f3-b9ea-ccc180d799a7"
}
```

```json
{
  "id": "2f2915ff-eb71-40b8-9aa1-192e579756ce",
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "236b88b8-73e8-4f69-b239-2ce369ab1cfb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "236b88b8-73e8-4f69-b239-2ce369ab1cfb",
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "assignment_id": "2f2915ff-eb71-40b8-9aa1-192e579756ce",
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

`POST /api/driver/v1/work-sessions/68c93057-07e1-487a-9050-2c8d1356087a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:12Z",
    "sequence": 1793116272781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68c93057-07e1-487a-9050-2c8d1356087a",
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
  "last_heartbeat_at": "2026-10-27T15:51:12.800862Z",
  "last_location_at": "2026-10-27T15:51:12.800862Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "236b88b8-73e8-4f69-b239-2ce369ab1cfb",
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "assignment_id": "2f2915ff-eb71-40b8-9aa1-192e579756ce",
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

`POST /api/driver/v1/trips/236b88b8-73e8-4f69-b239-2ce369ab1cfb/arrive` → **200**

```json
{
  "command_id": "e711bd5e-bbef-4bba-93ed-1757fa6c0238",
  "expected_version": 0
}
```

```json
{
  "id": "236b88b8-73e8-4f69-b239-2ce369ab1cfb",
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "assignment_id": "2f2915ff-eb71-40b8-9aa1-192e579756ce",
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
  "arrived_at": "2026-10-27T15:51:12.858956Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/236b88b8-73e8-4f69-b239-2ce369ab1cfb/start` → **200**

```json
{
  "command_id": "e6220bc4-b4f6-4651-b634-be3444b377df",
  "expected_version": 1
}
```

```json
{
  "id": "236b88b8-73e8-4f69-b239-2ce369ab1cfb",
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "assignment_id": "2f2915ff-eb71-40b8-9aa1-192e579756ce",
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
  "arrived_at": "2026-10-27T15:51:12.858956Z",
  "started_at": "2026-10-27T15:51:12.897707Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/68c93057-07e1-487a-9050-2c8d1356087a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:12Z",
    "sequence": 1793116272921
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68c93057-07e1-487a-9050-2c8d1356087a",
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
  "last_heartbeat_at": "2026-10-27T15:51:12.940747Z",
  "last_location_at": "2026-10-27T15:51:12.940747Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/236b88b8-73e8-4f69-b239-2ce369ab1cfb/complete` → **200**

```json
{
  "command_id": "2d7c7a4c-b61e-41f5-b20f-f0b84853bb7d",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:51:12Z",
  "cash_received": true
}
```

```json
{
  "id": "236b88b8-73e8-4f69-b239-2ce369ab1cfb",
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "assignment_id": "2f2915ff-eb71-40b8-9aa1-192e579756ce",
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
  "arrived_at": "2026-10-27T15:51:12.858956Z",
  "started_at": "2026-10-27T15:51:12.897707Z",
  "completed_at": "2026-10-27T15:51:12.974606Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3b81bd6c-d550-42a1-b557-5e229100194d/rating` → **200**

```json
{
  "command_id": "1a80d8cc-c7cf-4685-9c17-2e0501376354",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "score": 5,
  "created_at": "2026-10-27T15:51:13.027632727Z"
}
```

`POST /api/driver/v1/orders/3b81bd6c-d550-42a1-b557-5e229100194d/rating` → **200**

```json
{
  "command_id": "1dca98e0-b191-4f8a-b480-cb068ebd11ba",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
  "score": 4,
  "created_at": "2026-10-27T15:51:13.069650367Z"
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
  "session_id": "b07007f2-1156-4ab0-92b0-c7f0dadc4646",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzMsImlhdCI6MTc5MzExNjI3MywianRpIjoiNWU1MzJmM2YtM2YwZS00NDgxLThlOTItNWE4ZGFjNzU1NTAyIiwic2lkIjoiYjA3MDA3ZjItMTE1Ni00YWIwLTkyYjAtYzdmMGRhZGM0NjQ2In0.BSZDBEj_rdsVcY_OEL474-8kGXq6Mat546OkX3BwFzA",
  "access_expires_at": "2026-10-27T16:06:13.462620104Z",
  "refresh_token": "6B7EIelGSNeYgLz7gbCk_0f9gJ8NxMw1Ymyl17tg-YU",
  "refresh_expires_at": "2026-10-28T03:51:13.461982409Z",
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
  "session_id": "19c4f987-8843-46d7-864b-f8310457b1fa",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzMsImlhdCI6MTc5MzExNjI3MywianRpIjoiMDJhYTBjYWQtODMyZi00YzY4LTk4MmYtNzQxMDY2MjdiOTZiIiwic2lkIjoiMTljNGY5ODctODg0My00NmQ3LTg2NGItZjgzMTA0NTdiMWZhIn0.aH-Fl4whwOyqyaLwbp9fGrDhc-j8FTWbEveqgRutMeE",
  "access_expires_at": "2026-10-27T16:06:13.813971334Z",
  "refresh_token": "EKWZ0TMqifRgHeqisyPYgt14juYniLk2WRXeySD7tiw",
  "refresh_expires_at": "2026-10-28T03:51:13.813467479Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3b81bd6c-d550-42a1-b557-5e229100194d/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
      "author_type": "RIDER",
      "author_id": "1f87f1f8-edd5-4ae5-8620-228ff4f88cae",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T15:51:13.027633Z"
    },
    {
      "order_id": "3b81bd6c-d550-42a1-b557-5e229100194d",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "1f87f1f8-edd5-4ae5-8620-228ff4f88cae",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T15:51:13.06965Z"
    }
  ]
}
```

Done: ratings for order 3b81bd6c-d550-42a1-b557-5e229100194d.

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
  "session_id": "82b7f0db-a9ce-449a-87f4-dc5eb59d1e7f",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzQsImlhdCI6MTc5MzExNjI3NCwianRpIjoiMzNiNDAwYTgtODdmMi00MmQxLWI2OTQtODM2NWViYjAzNjcyIiwic2lkIjoiODJiN2YwZGItYTljZS00NDlhLTg3ZjQtZGM1ZWI1OWQxZTdmIn0.6EsLaTpRAUlU4mgRgftemy1lPUDyz_rXvzV06awxZPI",
  "access_expires_at": "2026-10-27T16:06:14.22636202Z",
  "refresh_token": "oluDl8K_nxE4uPDS8OCn3Q6DziwT9kImU9hmE9pSrkI",
  "refresh_expires_at": "2026-10-28T03:51:14.225672782Z",
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
  "command_id": "aded6677-7397-4751-bce7-498b46e90c8f",
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
  "changed_by": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:51:14.342677Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "aded6677-7397-4751-bce7-498b46e90c8f",
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
  "changed_by": "8ef7d313-34a2-427f-90df-5fcddec69a41",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:51:14.342677Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48358606013",
  "device_ref": "sandbox-16186"
}
```

```json
{
  "challenge_id": "fb8edfa8-1f1c-4d3e-a502-6db794e1b0ff",
  "expires_at": "2026-10-27T15:56:14.440629068Z",
  "resend_available_at": "2026-10-27T15:51:15.440629068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48358606013` → **200**

```json
{
  "phone": "+48358606013",
  "audience": "CLIENT",
  "code": "515301",
  "sent_at": "2026-10-27T15:51:14.443505398Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb8edfa8-1f1c-4d3e-a502-6db794e1b0ff",
  "code": "515301",
  "device_ref": "sandbox-16186"
}
```

```json
{
  "session_id": "a347f5bf-e77c-4bd9-8afe-ae1cbd95ff7a",
  "subject": {
    "type": "CLIENT",
    "id": "d12cb80a-02bc-4606-babd-90d9ce465a84"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTJjYjgwYS0wMmJjLTQ2MDYtYmFiZC05MGQ5Y2U0NjVhODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTc0LCJpYXQiOjE3OTMxMTYyNzQsImp0aSI6ImQwNTBkN2MxLTZlMmYtNDIzYS1iZWYzLTUwMWM5NjJmNDkzMSIsInNpZCI6ImEzNDdmNWJmLWU3N2MtNGJkOS04YWZlLWFlMWNiZDk1ZmY3YSJ9.1CZxc3Dm-MQaYHsYeaTAkPE0yRzFtCZY8HwNw8wZ4zM",
  "access_expires_at": "2026-10-27T16:06:14.507314947Z",
  "refresh_token": "B8gcW5PbE8QpEKnmXR0T0AI1dQvKY-fKwXbmlxIArug",
  "refresh_expires_at": "2026-11-26T15:51:14.506709699Z",
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
  "correlation_id": "3e61ca5c-8d13-4d38-81c3-6381b652c779"
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
  "device_ref": "sandbox-3026"
}
```

```json
{
  "challenge_id": "172483a8-981c-4103-b566-aae0ce486be8",
  "expires_at": "2026-10-27T15:56:14.606780823Z",
  "resend_available_at": "2026-10-27T15:51:15.606780823Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "773945",
  "sent_at": "2026-10-27T15:51:14.610096073Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "172483a8-981c-4103-b566-aae0ce486be8",
  "code": "773945",
  "device_ref": "sandbox-3026"
}
```

```json
{
  "session_id": "99833b5c-7ecf-4b47-8eea-5ea0574f430a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE3NCwiaWF0IjoxNzkzMTE2Mjc0LCJqdGkiOiJlYzJiZTJjYi0wOTAzLTQ2ODItOTMzMi1iYTY4Y2E1ZDAzNGMiLCJzaWQiOiI5OTgzM2I1Yy03ZWNmLTRiNDctOGVlYS01ZWEwNTc0ZjQzMGEifQ.JdaetFmRp-9QOC4fyq2F6sh_XCnrF_NrieodXTsx92w",
  "access_expires_at": "2026-10-27T16:06:14.679687261Z",
  "refresh_token": "A6qyBb_LxvHe7-jU-FndCVE5tcqWEz0SpyG0y1Kl7xM",
  "refresh_expires_at": "2026-11-26T15:51:14.67895813Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13bde723-fa42-4008-90df-ce7c31eff105",
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
  "last_heartbeat_at": "2026-10-27T15:51:11.688973Z",
  "last_location_at": "2026-10-27T15:51:11.688973Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13bde723-fa42-4008-90df-ce7c31eff105/handover` → **200**

```json
{
  "command_id": "be4cebb2-41d6-46df-ae63-af81437e5eb6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13bde723-fa42-4008-90df-ce7c31eff105",
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
  "last_heartbeat_at": "2026-10-27T15:51:11.688973Z",
  "last_location_at": "2026-10-27T15:51:11.688973Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13bde723-fa42-4008-90df-ce7c31eff105/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:14Z",
    "sequence": 1793116274786
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "13bde723-fa42-4008-90df-ce7c31eff105",
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
  "last_heartbeat_at": "2026-10-27T15:51:14.807621Z",
  "last_location_at": "2026-10-27T15:51:14.807621Z",
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
  "session_id": "13bde723-fa42-4008-90df-ce7c31eff105",
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
  "last_heartbeat_at": "2026-10-27T15:51:14.807621Z",
  "last_location_at": "2026-10-27T15:51:14.807621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13bde723-fa42-4008-90df-ce7c31eff105/close` → **200**

```json
{
  "command_id": "186a6fe8-b911-492f-9480-0e0665c222c9",
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
  "correlation_id": "903900d6-e33d-4a33-b5a6-49ef7718f8dc"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672543612",
  "device_ref": "sandbox-31549"
}
```

```json
{
  "challenge_id": "75df350c-53e5-4b51-8be6-802b54b97517",
  "expires_at": "2026-10-27T15:56:15.012404425Z",
  "resend_available_at": "2026-10-27T15:51:16.012404425Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672543612` → **200**

```json
{
  "phone": "+380672543612",
  "audience": "CLIENT",
  "code": "041859",
  "sent_at": "2026-10-27T15:51:15.01555808Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75df350c-53e5-4b51-8be6-802b54b97517",
  "code": "041859",
  "device_ref": "sandbox-31549"
}
```

```json
{
  "session_id": "8ec82e60-3dc3-4085-b4e3-aad8ea636b5d",
  "subject": {
    "type": "CLIENT",
    "id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU3YWMwZS0wZTc0LTRmNjctOGJjOC1lZWU0Y2M1MGQ0YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MTc1LCJpYXQiOjE3OTMxMTYyNzUsImp0aSI6ImNjMTg4NDZiLTdiMGUtNDMwOC1iZTljLWQ2Yzk1ZDM0NjBmNiIsInNpZCI6IjhlYzgyZTYwLTNkYzMtNDA4NS1iNGUzLWFhZDhlYTYzNmI1ZCJ9.RDnExES78oGQn1Rgb-cUdal5fu5oiHzQ7ADllt8Wfgo",
  "access_expires_at": "2026-10-27T16:06:15.091087731Z",
  "refresh_token": "qnUK9aoo1jDS-1FUMKRQGLdP37WrGhe6IDJgubSYANw",
  "refresh_expires_at": "2026-11-26T15:51:15.090158499Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "31373442-eea0-41e1-b934-91d3daacc8da",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ad456a7b-0341-49bb-84ea-3b70e769e8d8",
  "upload_path": "/api/rider/v1/uploads/ad456a7b-0341-49bb-84ea-3b70e769e8d8",
  "expires_at": "2026-10-27T16:06:15.139497834Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/ad456a7b-0341-49bb-84ea-3b70e769e8d8` → **200**

```json
{
  "file_id": "ad456a7b-0341-49bb-84ea-3b70e769e8d8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "8860be2b-1465-451f-9bdb-81764caf20d9",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "ad456a7b-0341-49bb-84ea-3b70e769e8d8"
  ]
}
```

```json
{
  "id": "0ea00254-6e0f-4656-93fb-52c3224ee5e1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:51:15.229078Z",
  "updated_at": "2026-10-27T15:51:15.229078Z",
  "messages": [
    {
      "id": "9254e23c-516c-4eae-aedf-2d4164735f44",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:51:15.230874Z",
      "attachments": [
        {
          "file_id": "ad456a7b-0341-49bb-84ea-3b70e769e8d8",
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
  "session_id": "b5107681-5e4e-4b22-9a4a-ff2a18f687ad",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzUsImlhdCI6MTc5MzExNjI3NSwianRpIjoiMzk3MGVlYjUtNTNiZS00YWQwLTk4Y2YtMTE5NmI3YjM2MDRmIiwic2lkIjoiYjUxMDc2ODEtNWU0ZS00YjIyLTlhNGEtZmYyYTE4ZjY4N2FkIn0.XkQEPHUOFJBLWebqOwyEPg59EOBgjlGtEWvIikkHJeQ",
  "access_expires_at": "2026-10-27T16:06:15.609511479Z",
  "refresh_token": "6MDjduLDlfiHL3GmpQDqBpfxPo4zTNXws-E5Bf4qXGc",
  "refresh_expires_at": "2026-10-28T03:51:15.60866774Z",
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
  "session_id": "0861512b-0659-4a37-a690-c53b6a44ee36",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzUsImlhdCI6MTc5MzExNjI3NSwianRpIjoiMzMwMDE1ODMtOGIwNi00ZWVjLWJkYWEtODM3NjUwZDVkZDg5Iiwic2lkIjoiMDg2MTUxMmItMDY1OS00YTM3LWE2OTAtYzUzYjZhNDRlZTM2In0.30udfosKPf-SQjWm_he-8AkAB6ye0U8BIrz4rt40XP8",
  "access_expires_at": "2026-10-27T16:06:15.959916326Z",
  "refresh_token": "QSroMHWcgT_PiaH5eieY4_G7FBn9Cnzm4ZgGKERf288",
  "refresh_expires_at": "2026-10-28T03:51:15.95925588Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/0ea00254-6e0f-4656-93fb-52c3224ee5e1/attachments/ad456a7b-0341-49bb-84ea-3b70e769e8d8` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "cfdfd15b-ab3b-4169-b99d-f3eba9728ea4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "754c5fdd-fc99-4374-8577-20a8bd1c0f54",
  "upload_path": "/api/operator/v1/uploads/754c5fdd-fc99-4374-8577-20a8bd1c0f54",
  "expires_at": "2026-10-27T16:06:16.021280264Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/754c5fdd-fc99-4374-8577-20a8bd1c0f54` → **200**

```json
{
  "file_id": "754c5fdd-fc99-4374-8577-20a8bd1c0f54",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/0ea00254-6e0f-4656-93fb-52c3224ee5e1` → **200**

```json
{
  "id": "0ea00254-6e0f-4656-93fb-52c3224ee5e1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:51:15.229078Z",
  "updated_at": "2026-10-27T15:51:15.229078Z",
  "messages": [
    {
      "id": "9254e23c-516c-4eae-aedf-2d4164735f44",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:51:15.230874Z",
      "attachments": [
        {
          "file_id": "ad456a7b-0341-49bb-84ea-3b70e769e8d8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/0ea00254-6e0f-4656-93fb-52c3224ee5e1/comments` → **200**

```json
{
  "command_id": "31eda168-2c46-400e-a0f8-013da067f3fd",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "754c5fdd-fc99-4374-8577-20a8bd1c0f54"
  ]
}
```

```json
{
  "id": "0ea00254-6e0f-4656-93fb-52c3224ee5e1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:51:15.229078Z",
  "updated_at": "2026-10-27T15:51:16.132749Z",
  "messages": [
    {
      "id": "9254e23c-516c-4eae-aedf-2d4164735f44",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:51:15.230874Z",
      "attachments": [
        {
          "file_id": "ad456a7b-0341-49bb-84ea-3b70e769e8d8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bb84e6ae-6aec-485f-8aa8-99fe7a7360c1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "8ef7d313-34a2-427f-90df-5fcddec69a41",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:51:16.132228Z",
      "attachments": [
        {
          "file_id": "754c5fdd-fc99-4374-8577-20a8bd1c0f54",
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

`GET /api/rider/v1/support/cases/0ea00254-6e0f-4656-93fb-52c3224ee5e1` → **200**

```json
{
  "id": "0ea00254-6e0f-4656-93fb-52c3224ee5e1",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:51:15.229078Z",
  "updated_at": "2026-10-27T15:51:16.132749Z",
  "messages": [
    {
      "id": "9254e23c-516c-4eae-aedf-2d4164735f44",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2157ac0e-0e74-4f67-8bc8-eee4cc50d4b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:51:15.230874Z",
      "attachments": [
        {
          "file_id": "ad456a7b-0341-49bb-84ea-3b70e769e8d8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bb84e6ae-6aec-485f-8aa8-99fe7a7360c1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:51:16.132228Z",
      "attachments": [
        {
          "file_id": "754c5fdd-fc99-4374-8577-20a8bd1c0f54",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/0ea00254-6e0f-4656-93fb-52c3224ee5e1/attachments/754c5fdd-fc99-4374-8577-20a8bd1c0f54` → **200**

Done: support case 0ea00254-6e0f-4656-93fb-52c3224ee5e1, rider attachment ad456a7b-0341-49bb-84ea-3b70e769e8d8, operator attachment 754c5fdd-fc99-4374-8577-20a8bd1c0f54.

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
  "session_id": "6e8e2f53-f898-4b28-9969-532cf3ab1dd3",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzYsImlhdCI6MTc5MzExNjI3NiwianRpIjoiNjA3NDVhZjEtYzAyOS00ZmM3LTg3OGUtYjk3NTJmOGQ1OWJhIiwic2lkIjoiNmU4ZTJmNTMtZjg5OC00YjI4LTk5NjktNTMyY2YzYWIxZGQzIn0._RASTBY7BsgxJMNNzYoagqY9e2JI1V_W9hp4NOikVls",
  "access_expires_at": "2026-10-27T16:06:16.555070096Z",
  "refresh_token": "iEA5iDcB1gRVhHP4Olh6pQKa7ayR3KUR-1Tgzp1Rlxg",
  "refresh_expires_at": "2026-10-28T03:51:16.554333666Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26326"
}
```

```json
{
  "challenge_id": "f545f133-9820-4482-b8e8-f8546aa91047",
  "expires_at": "2026-10-27T15:56:16.58798024Z",
  "resend_available_at": "2026-10-27T15:51:17.58798024Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "929370",
  "sent_at": "2026-10-27T15:51:16.590976824Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f545f133-9820-4482-b8e8-f8546aa91047",
  "code": "929370",
  "device_ref": "sandbox-26326"
}
```

```json
{
  "session_id": "674bcab5-3e87-4000-9820-e84dd1c4a143",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE3NiwiaWF0IjoxNzkzMTE2Mjc2LCJqdGkiOiI3MWFkYmNhNi0wZmY5LTQzMjEtOGMzMy1jZTczZmIwMGNmOGEiLCJzaWQiOiI2NzRiY2FiNS0zZTg3LTQwMDAtOTgyMC1lODRkZDFjNGExNDMifQ.vTX2nkt1skPNOiYS6fWOd-mTo1EOt6zTHS4fzG21KIU",
  "access_expires_at": "2026-10-27T16:06:16.651871764Z",
  "refresh_token": "O7SiqyWpqtSB84_pImakcTq4p4TE8bsEEY_W5ZvYYb4",
  "refresh_expires_at": "2026-11-26T15:51:16.65124076Z",
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
  "command_id": "27b28070-04bc-4eb3-8ea1-190cd277386f",
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
  "device_ref": "sandbox-11425"
}
```

```json
{
  "challenge_id": "5fa4f15c-2a50-4535-a3c5-383dd425d3a9",
  "expires_at": "2026-10-27T15:56:16.803939293Z",
  "resend_available_at": "2026-10-27T15:51:17.803939293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "289065",
  "sent_at": "2026-10-27T15:51:16.806671872Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fa4f15c-2a50-4535-a3c5-383dd425d3a9",
  "code": "289065",
  "device_ref": "sandbox-11425"
}
```

```json
{
  "session_id": "49230190-7484-41ea-9d1e-1daa07745f56",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzE3NiwiaWF0IjoxNzkzMTE2Mjc2LCJqdGkiOiI4NTBjYmI4YS0yOWI0LTQ0NDAtYTI4My05YWRmNDBhOGYwOTQiLCJzaWQiOiI0OTIzMDE5MC03NDg0LTQxZWEtOWQxZS0xZGFhMDc3NDVmNTYifQ.iK3HKjuupbvPkQsn2a-Zrewpm9g-GtrOKNLtqCC47mg",
  "access_expires_at": "2026-10-27T16:06:16.865260257Z",
  "refresh_token": "YU-2Mn7m1oyMayhKs2q2-6sSVgt4KO4IlfRARrO8szQ",
  "refresh_expires_at": "2026-11-26T15:51:16.864576126Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68c93057-07e1-487a-9050-2c8d1356087a",
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
  "last_heartbeat_at": "2026-10-27T15:51:12.940747Z",
  "last_location_at": "2026-10-27T15:51:12.940747Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/68c93057-07e1-487a-9050-2c8d1356087a/handover` → **200**

```json
{
  "command_id": "da0e73cd-5921-4a8c-918b-f44092bf8518",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68c93057-07e1-487a-9050-2c8d1356087a",
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
  "last_heartbeat_at": "2026-10-27T15:51:12.940747Z",
  "last_location_at": "2026-10-27T15:51:12.940747Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/68c93057-07e1-487a-9050-2c8d1356087a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:16Z",
    "sequence": 1793116276956
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68c93057-07e1-487a-9050-2c8d1356087a",
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
  "last_heartbeat_at": "2026-10-27T15:51:16.975949Z",
  "last_location_at": "2026-10-27T15:51:16.975949Z",
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
  "command_id": "7c897ee1-ee52-4aaa-ba6f-7cfe65654f79",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:17Z",
    "sequence": 1793116277327
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "de39d5fb-6b06-4222-849a-62c7a82e43bd",
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
  "last_heartbeat_at": "2026-10-27T15:51:17.052262Z",
  "last_location_at": "2026-10-27T15:51:17.052262Z",
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
  "session_id": "a8b6dd72-6e74-4708-853a-e1668ee9ba50",
  "subject": {
    "type": "STAFF",
    "id": "8ef7d313-34a2-427f-90df-5fcddec69a41"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWY3ZDMxMy0zNGEyLTQyN2YtOTBkZi01ZmNkZGVjNjlhNDEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcxNzcsImlhdCI6MTc5MzExNjI3NywianRpIjoiNDAxZjdkODEtNTYzNi00ZDE3LWFjYjUtNDJhYWEyMDQxZDM5Iiwic2lkIjoiYThiNmRkNzItNmU3NC00NzA4LTg1M2EtZTE2NjhlZTliYTUwIn0.5VUV5sdTyL_GX93JJpRCUo_9YAq4-h7KHnF60a6K2P0",
  "access_expires_at": "2026-10-27T16:06:17.412078247Z",
  "refresh_token": "ffyA0BYCABjtajk3fI1xGU5RjqDixgM1uoPLFoGGgaQ",
  "refresh_expires_at": "2026-10-28T03:51:17.41150648Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "49368a8e-7e98-4da0-a4dd-771341c82dee",
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
  "id": "c532ebcf-36bb-4989-b6e3-f7d384f2ce5c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:56:17.453073Z",
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
  "command_id": "01f6e663-b021-4256-8213-274503ed61ff",
  "quote_id": "c532ebcf-36bb-4989-b6e3-f7d384f2ce5c",
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
  "id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
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
  "created_at": "2026-10-27T15:51:17.498601Z",
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
    "id": "6646bad3-03c3-48c4-859b-dd17c3b18786",
    "order_id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
    "expires_at": "2026-10-27T15:51:32.502725Z",
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

`POST /api/driver/v1/offers/6646bad3-03c3-48c4-859b-dd17c3b18786/accept` → **200**

```json
{
  "command_id": "71b30903-1d2f-4f08-b523-8113a24d796e"
}
```

```json
{
  "id": "52da4264-f573-4b96-8294-d45859773e01",
  "order_id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "887b0aaf-bee0-4414-8938-1c921f43f033",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "887b0aaf-bee0-4414-8938-1c921f43f033",
  "order_id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
  "assignment_id": "52da4264-f573-4b96-8294-d45859773e01",
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

`POST /api/driver/v1/work-sessions/de39d5fb-6b06-4222-849a-62c7a82e43bd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:51:17Z",
    "sequence": 1793116277663
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "de39d5fb-6b06-4222-849a-62c7a82e43bd",
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
  "last_heartbeat_at": "2026-10-27T15:51:17.688344Z",
  "last_location_at": "2026-10-27T15:51:17.688344Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/887b0aaf-bee0-4414-8938-1c921f43f033/arrive` → **200**

```json
{
  "command_id": "832da7c7-99b1-4bf8-a4e1-4d0132a939bf",
  "expected_version": 0
}
```

```json
{
  "id": "887b0aaf-bee0-4414-8938-1c921f43f033",
  "order_id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
  "assignment_id": "52da4264-f573-4b96-8294-d45859773e01",
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
  "arrived_at": "2026-10-27T15:51:17.73481Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/887b0aaf-bee0-4414-8938-1c921f43f033/start` → **200**

```json
{
  "command_id": "88f40c1e-9ca5-43fd-a17e-45e31dac2d52",
  "expected_version": 1
}
```

```json
{
  "id": "887b0aaf-bee0-4414-8938-1c921f43f033",
  "order_id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
  "assignment_id": "52da4264-f573-4b96-8294-d45859773e01",
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
  "arrived_at": "2026-10-27T15:51:17.73481Z",
  "started_at": "2026-10-27T15:51:17.784545Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/887b0aaf-bee0-4414-8938-1c921f43f033/complete` → **200**

```json
{
  "command_id": "53f1acf4-99f8-43e4-8bd5-206b60f97b6b",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:51:17Z",
  "cash_received": true
}
```

```json
{
  "id": "887b0aaf-bee0-4414-8938-1c921f43f033",
  "order_id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
  "assignment_id": "52da4264-f573-4b96-8294-d45859773e01",
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
  "arrived_at": "2026-10-27T15:51:17.73481Z",
  "started_at": "2026-10-27T15:51:17.784545Z",
  "completed_at": "2026-10-27T15:51:17.834836Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/d346fef9-faed-4c7f-a803-ff91d7dde9f2` → **200**

```json
{
  "id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
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
    "id": "52da4264-f573-4b96-8294-d45859773e01",
    "order_id": "d346fef9-faed-4c7f-a803-ff91d7dde9f2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "887b0aaf-bee0-4414-8938-1c921f43f033",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:51:17.498601Z",
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
  "session_id": "68c93057-07e1-487a-9050-2c8d1356087a",
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
  "last_heartbeat_at": "2026-10-27T15:51:16.975949Z",
  "last_location_at": "2026-10-27T15:51:16.975949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/68c93057-07e1-487a-9050-2c8d1356087a/close` → **200**

```json
{
  "command_id": "3eec61f5-31f9-4019-8173-ed285c2a7caa",
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
  "session_id": "de39d5fb-6b06-4222-849a-62c7a82e43bd",
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
  "last_heartbeat_at": "2026-10-27T15:51:17.688344Z",
  "last_location_at": "2026-10-27T15:51:17.688344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/de39d5fb-6b06-4222-849a-62c7a82e43bd/close` → **200**

```json
{
  "command_id": "5ffee179-c008-4e70-9194-02c2b5b8fa00",
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

Done: terminal order d346fef9-faed-4c7f-a803-ff91d7dde9f2 by Andrii (5a000000-0000-4000-8000-000000000403).
