# Sandbox transcript (2026-10-27T19:29:01Z, caac412)

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
  "correlation_id": "7827a1a0-b01d-4589-8d90-bdea97f119f9"
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
  "session_id": "82829024-dac9-4e01-9656-cecc1b346475",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNDIsImlhdCI6MTc5MzEyOTM0MiwianRpIjoiZTViY2ZjOTAtZWQ5ZC00NWQyLWE1ODktNGYzMzI5ZTAwOWM1Iiwic2lkIjoiODI4MjkwMjQtZGFjOS00ZTAxLTk2NTYtY2VjYzFiMzQ2NDc1In0.a8Aa3I4vMsDnCkrUlfcBtUp-KUgDb0K4jIWm6YhPkJQ",
  "access_expires_at": "2026-10-27T19:44:02.218467342Z",
  "refresh_token": "tRh287eiX39GtU1_yrJ5ruDnI8rARTNEnRqMal-XuKw",
  "refresh_expires_at": "2026-10-28T07:29:02.216337467Z",
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
  "session_id": "9f713f9c-ee95-42c8-b290-260fbd9d900d",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNDMsImlhdCI6MTc5MzEyOTM0MywianRpIjoiMDllYWM2NTktODU0Yi00M2Q3LWI2M2UtMWVkN2UyNDBlMWUyIiwic2lkIjoiOWY3MTNmOWMtZWU5NS00MmM4LWIyOTAtMjYwZmJkOWQ5MDBkIn0.6Xz5m_I_GBX3lAI2U3pO79epup210aa4S7Ej7TUvz_4",
  "access_expires_at": "2026-10-27T19:44:03.129399167Z",
  "refresh_token": "qqB_PmaVK7qFXOWYpbNN9BjgGIoRHd_z_12ANM5hnT4",
  "refresh_expires_at": "2026-10-28T07:29:03.128244224Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "46523c52-4d2c-46fb-b797-58eb7557b2f7",
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
  "id": "16d46e2d-5229-43df-be0c-d468f3671e5b",
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
  "created_by": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "created_at": "2026-10-27T19:29:03.186235Z",
  "updated_at": "2026-10-27T19:29:03.186235Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632459484",
  "device_ref": "sandbox-30136"
}
```

```json
{
  "challenge_id": "3d88d719-a1c3-4d9a-83cf-5d81ab40db71",
  "expires_at": "2026-10-27T19:34:03.228275598Z",
  "resend_available_at": "2026-10-27T19:29:04.228275598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632459484` → **200**

```json
{
  "phone": "+380632459484",
  "audience": "CLIENT",
  "code": "404939",
  "sent_at": "2026-10-27T19:29:03.235615944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d88d719-a1c3-4d9a-83cf-5d81ab40db71",
  "code": "404939",
  "device_ref": "sandbox-30136"
}
```

```json
{
  "session_id": "06a273a2-5b12-4af7-98ce-2fe3940ffba7",
  "subject": {
    "type": "CLIENT",
    "id": "97172110-fa2a-43d0-9ec0-c8d20765c7c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzE3MjExMC1mYTJhLTQzZDAtOWVjMC1jOGQyMDc2NWM3YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjQzLCJpYXQiOjE3OTMxMjkzNDMsImp0aSI6ImJhMTAxNTk5LTIxY2YtNDlhNC1iZTc0LTljZDExYzgxMTBjYSIsInNpZCI6IjA2YTI3M2EyLTViMTItNGFmNy05OGNlLTJmZTM5NDBmZmJhNyJ9.jSMiXojMCeRc2vMdtrd6DLC4JY0SZGSJC1JzFcnbsr0",
  "access_expires_at": "2026-10-27T19:44:03.3086752Z",
  "refresh_token": "EHdJ_CQDUXxcMoOcMpuCwV87y95wu9k2Vkpq0snct0I",
  "refresh_expires_at": "2026-11-26T19:29:03.307803295Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632459484` → **200**

```json
{
  "client_id": "97172110-fa2a-43d0-9ec0-c8d20765c7c8"
}
```

`POST /api/admin/v1/rider-wallets/97172110-fa2a-43d0-9ec0-c8d20765c7c8/top-ups` → **201**

```json
{
  "command_id": "dbef7428-fac2-4a48-a1f1-87dcfd8e6ed5",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "97172110-fa2a-43d0-9ec0-c8d20765c7c8",
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
      "id": "1db6c69a-1870-4fc6-9545-12cacfd63f47",
      "at": "2026-10-27T19:29:03.380734Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9bcea283-7d9f-45b2-9752-cc609904ae72",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93e3093a-8f9c-4a57-ae76-8b79f42f3e42",
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
  "id": "341b4e50-106f-4c68-873a-0234e9480b71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:03.482560Z",
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
      "id": "16d46e2d-5229-43df-be0c-d468f3671e5b",
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
  "device_ref": "sandbox-8444"
}
```

```json
{
  "challenge_id": "21cbef23-5bf4-4891-bed8-68312cdda9ae",
  "expires_at": "2026-10-27T19:34:03.536452281Z",
  "resend_available_at": "2026-10-27T19:29:04.536452281Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "695475",
  "sent_at": "2026-10-27T19:29:03.539569206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21cbef23-5bf4-4891-bed8-68312cdda9ae",
  "code": "695475",
  "device_ref": "sandbox-8444"
}
```

```json
{
  "session_id": "106b2080-2267-4932-a9b1-06b2cfa221e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI0MywiaWF0IjoxNzkzMTI5MzQzLCJqdGkiOiI2ZmFjYWFkNS02ZTI4LTRhYmMtYjUwNi02NTU5NDk2ZmI2ZjMiLCJzaWQiOiIxMDZiMjA4MC0yMjY3LTQ5MzItYTliMS0wNmIyY2ZhMjIxZTkifQ.lNpVPir5MMzF3MxdU5rs5viMsj9neKR2ruyuwxzY6xw",
  "access_expires_at": "2026-10-27T19:44:03.591759551Z",
  "refresh_token": "8QwScwDOd2ZwPE5kEHKAIgczlEooOaK1TrN3mbzvS20",
  "refresh_expires_at": "2026-11-26T19:29:03.591017586Z",
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
  "command_id": "9932a812-26d6-42ca-808f-08e1d9eed03b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:03Z",
    "sequence": 1793129343645
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df8a7f12-066d-4f79-93a1-242f5728c92f",
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
  "last_heartbeat_at": "2026-10-27T19:29:03.682101Z",
  "last_location_at": "2026-10-27T19:29:03.682101Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4ff74da6-2427-4685-aa5a-39c0ad73cc59",
  "quote_id": "341b4e50-106f-4c68-873a-0234e9480b71",
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
  "id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "97172110-fa2a-43d0-9ec0-c8d20765c7c8",
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
  "created_at": "2026-10-27T19:29:03.7683Z",
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
  "client_id": "97172110-fa2a-43d0-9ec0-c8d20765c7c8",
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
      "id": "1db6c69a-1870-4fc6-9545-12cacfd63f47",
      "at": "2026-10-27T19:29:03.380734Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9bcea283-7d9f-45b2-9752-cc609904ae72",
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
    "id": "78b78f15-dd7f-4d95-b987-9c7c585a6b0d",
    "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
    "expires_at": "2026-10-27T19:29:18.781756Z",
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

`POST /api/driver/v1/offers/78b78f15-dd7f-4d95-b987-9c7c585a6b0d/accept` → **200**

```json
{
  "command_id": "976da0fd-57e5-4cc8-8050-86a9217d2a13"
}
```

```json
{
  "id": "6acdee37-8001-4dd6-b4d5-67d67feacbd5",
  "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78efeeb4-2f5a-48d5-b6cd-c14d011fba16",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78efeeb4-2f5a-48d5-b6cd-c14d011fba16",
  "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
  "assignment_id": "6acdee37-8001-4dd6-b4d5-67d67feacbd5",
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

`POST /api/driver/v1/work-sessions/df8a7f12-066d-4f79-93a1-242f5728c92f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:03Z",
    "sequence": 1793129343957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df8a7f12-066d-4f79-93a1-242f5728c92f",
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
  "last_heartbeat_at": "2026-10-27T19:29:03.980211Z",
  "last_location_at": "2026-10-27T19:29:03.980211Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/78efeeb4-2f5a-48d5-b6cd-c14d011fba16/arrive` → **200**

```json
{
  "command_id": "124da14c-7dbe-40d0-b15b-a8088423f315",
  "expected_version": 0
}
```

```json
{
  "id": "78efeeb4-2f5a-48d5-b6cd-c14d011fba16",
  "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
  "assignment_id": "6acdee37-8001-4dd6-b4d5-67d67feacbd5",
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
  "arrived_at": "2026-10-27T19:29:04.021854Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/78efeeb4-2f5a-48d5-b6cd-c14d011fba16/start` → **200**

```json
{
  "command_id": "6fddaa18-e6cb-4af0-8697-6982cb378e07",
  "expected_version": 1
}
```

```json
{
  "id": "78efeeb4-2f5a-48d5-b6cd-c14d011fba16",
  "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
  "assignment_id": "6acdee37-8001-4dd6-b4d5-67d67feacbd5",
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
  "arrived_at": "2026-10-27T19:29:04.021854Z",
  "started_at": "2026-10-27T19:29:04.05892Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/78efeeb4-2f5a-48d5-b6cd-c14d011fba16/complete` → **200**

```json
{
  "command_id": "01bda6f4-2dca-4aa4-98a8-a2874ee08927",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:29:04Z",
  "cash_received": true
}
```

```json
{
  "id": "78efeeb4-2f5a-48d5-b6cd-c14d011fba16",
  "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
  "assignment_id": "6acdee37-8001-4dd6-b4d5-67d67feacbd5",
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
  "arrived_at": "2026-10-27T19:29:04.021854Z",
  "started_at": "2026-10-27T19:29:04.05892Z",
  "completed_at": "2026-10-27T19:29:04.11359Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "97172110-fa2a-43d0-9ec0-c8d20765c7c8",
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
      "id": "ae69c33a-642b-4c91-8198-01d5238dae60",
      "at": "2026-10-27T19:29:04.252568Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2"
    },
    {
      "id": "1db6c69a-1870-4fc6-9545-12cacfd63f47",
      "at": "2026-10-27T19:29:03.380734Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9bcea283-7d9f-45b2-9752-cc609904ae72",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/16d46e2d-5229-43df-be0c-d468f3671e5b/archive` → **200**

```json
{
  "command_id": "b0ff0761-86c3-461a-bc78-c595750818ec",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "16d46e2d-5229-43df-be0c-d468f3671e5b",
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
  "created_by": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "created_at": "2026-10-27T19:29:03.186235Z",
  "updated_at": "2026-10-27T19:29:07.195133Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df8a7f12-066d-4f79-93a1-242f5728c92f",
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
  "last_heartbeat_at": "2026-10-27T19:29:03.980211Z",
  "last_location_at": "2026-10-27T19:29:03.980211Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df8a7f12-066d-4f79-93a1-242f5728c92f/close` → **200**

```json
{
  "command_id": "5bd42b37-f04c-4ca3-9c44-3d259ca7eb9c",
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

Done: order 5ef1c473-41c8-40b4-9d8d-e621e6bee8e2.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634976793",
  "device_ref": "sandbox-20606"
}
```

```json
{
  "challenge_id": "ab9535d7-3a7a-40b2-96c7-891b348cedaf",
  "expires_at": "2026-10-27T19:34:07.304295621Z",
  "resend_available_at": "2026-10-27T19:29:08.304295621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634976793` → **200**

```json
{
  "phone": "+380634976793",
  "audience": "CLIENT",
  "code": "377220",
  "sent_at": "2026-10-27T19:29:07.30724269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab9535d7-3a7a-40b2-96c7-891b348cedaf",
  "code": "377220",
  "device_ref": "sandbox-20606"
}
```

```json
{
  "session_id": "15cc3637-1042-409f-9b0f-4890dfa39483",
  "subject": {
    "type": "CLIENT",
    "id": "86ae6624-c81e-43b6-a1bd-7c49e1bb86fa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmFlNjYyNC1jODFlLTQzYjYtYTFiZC03YzQ5ZTFiYjg2ZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjQ3LCJpYXQiOjE3OTMxMjkzNDcsImp0aSI6ImJiMjQ1YmNhLTc2MDQtNGIwNy1hNWY3LWM0YjhlNjFjOTM4YSIsInNpZCI6IjE1Y2MzNjM3LTEwNDItNDA5Zi05YjBmLTQ4OTBkZmEzOTQ4MyJ9._S_cMQsqs1FJ--VO4lBOzS26oDANRd84_rG0PSwbnyw",
  "access_expires_at": "2026-10-27T19:44:07.358530822Z",
  "refresh_token": "xBuWjOJ3qhpzyjyBWQCj9Va7EGmlW16Fl_7KqtiiODE",
  "refresh_expires_at": "2026-11-26T19:29:07.357932163Z",
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
  "device_ref": "sandbox-15255"
}
```

```json
{
  "challenge_id": "fc6b2f0f-f6c3-4375-9216-b726755044b5",
  "expires_at": "2026-10-27T19:34:07.40788138Z",
  "resend_available_at": "2026-10-27T19:29:08.40788138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "266978",
  "sent_at": "2026-10-27T19:29:07.410566393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc6b2f0f-f6c3-4375-9216-b726755044b5",
  "code": "266978",
  "device_ref": "sandbox-15255"
}
```

```json
{
  "session_id": "cdcb30c8-4d42-4cab-8b51-2368528e62d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI0NywiaWF0IjoxNzkzMTI5MzQ3LCJqdGkiOiI0ZWJmODkxMS1mYjgyLTRkYzYtODhmZC02ZjQwZWI3Mzk3NmYiLCJzaWQiOiJjZGNiMzBjOC00ZDQyLTRjYWItOGI1MS0yMzY4NTI4ZTYyZDAifQ.GjHZ-Ix9PS-wrNCJ94lzOM1FY5CuA08_61gjXloh52k",
  "access_expires_at": "2026-10-27T19:44:07.460727941Z",
  "refresh_token": "otGM_0OzcWSQs_WFocKym4_ZLcOcN_JGc16L8BIDY8k",
  "refresh_expires_at": "2026-11-26T19:29:07.460153715Z",
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
  "session_id": "674a170b-1905-4c88-baf7-050289618471",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNDcsImlhdCI6MTc5MzEyOTM0NywianRpIjoiMjhiZWQ5MDEtMTYxMS00NTIyLThjMTEtNzhiNTBmYzdhZWIyIiwic2lkIjoiNjc0YTE3MGItMTkwNS00Yzg4LWJhZjctMDUwMjg5NjE4NDcxIn0.QaQ34tZAp2dK5UElqFVnAZoZKH4_IpnDh8HJ7zRQ_Pg",
  "access_expires_at": "2026-10-27T19:44:07.709440705Z",
  "refresh_token": "JcIrChqf_SsMtlNGU5lzlyFRs-TMHXzX9GorG8CyEjg",
  "refresh_expires_at": "2026-10-28T07:29:07.7088706Z",
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
  "session_id": "d4561e76-fa9c-4f40-9d1a-d7842805b04d",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNDcsImlhdCI6MTc5MzEyOTM0NywianRpIjoiMzg2NzY5NjktMWEyYy00ODNjLTllOTEtM2YzNmNlNzgyNzk3Iiwic2lkIjoiZDQ1NjFlNzYtZmE5Yy00ZjQwLTlkMWEtZDc4NDI4MDViMDRkIn0.XsAjzhl3lGeciGC2ITEHPV9Vgqe7uTWf--xyNN37blY",
  "access_expires_at": "2026-10-27T19:44:07.935949949Z",
  "refresh_token": "pEoEdeI03fKxEoZvYChNSV_vkhLsYDxyZm2cP3IUljs",
  "refresh_expires_at": "2026-10-28T07:29:07.935303574Z",
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
  "command_id": "17f05982-c107-42e3-9c31-b806ffa3d465",
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
  "id": "a2cbf862-df60-48de-901d-beb2e71657c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:34:07.992484Z",
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
  "command_id": "65475778-3346-43fe-ac0b-5411b7e16d72",
  "quote_id": "a2cbf862-df60-48de-901d-beb2e71657c4",
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
  "id": "cf444e15-d021-4d0c-9b3d-13389495d473",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86ae6624-c81e-43b6-a1bd-7c49e1bb86fa",
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
  "created_at": "2026-10-27T19:29:08.027949Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/cf444e15-d021-4d0c-9b3d-13389495d473` → **200**

```json
{
  "id": "cf444e15-d021-4d0c-9b3d-13389495d473",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86ae6624-c81e-43b6-a1bd-7c49e1bb86fa",
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
  "created_at": "2026-10-27T19:29:08.027949Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/cf444e15-d021-4d0c-9b3d-13389495d473/cancel` → **200**

```json
{
  "command_id": "24a48df9-9d91-497c-8269-dd0e847a8ac3",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "cf444e15-d021-4d0c-9b3d-13389495d473",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "86ae6624-c81e-43b6-a1bd-7c49e1bb86fa",
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
  "created_at": "2026-10-27T19:29:08.027949Z",
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
  "command_id": "3f20d400-a516-498b-aa90-f80dd67bf38b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:08Z",
    "sequence": 1793129348145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:08.162201Z",
  "last_location_at": "2026-10-27T19:29:08.162201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11376"
}
```

```json
{
  "challenge_id": "4fc0383f-bf24-48e8-ae64-8498c0719503",
  "expires_at": "2026-10-27T19:34:08.191283937Z",
  "resend_available_at": "2026-10-27T19:29:09.191283937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "855240",
  "sent_at": "2026-10-27T19:29:08.193983172Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fc0383f-bf24-48e8-ae64-8498c0719503",
  "code": "855240",
  "device_ref": "sandbox-11376"
}
```

```json
{
  "session_id": "5354e8c8-5a51-48b7-9289-c5d701b2892a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI0OCwiaWF0IjoxNzkzMTI5MzQ4LCJqdGkiOiJkZDNjMGRhZS02MDQzLTRhMGItYjdjMC0xYWQyNzJhNDQ2ZjQiLCJzaWQiOiI1MzU0ZThjOC01YTUxLTQ4YjctOTI4OS1jNWQ3MDFiMjg5MmEifQ.wY0XxegqUZElx6BfRaozM8hLPj9am2gZtXiiiPtLdo0",
  "access_expires_at": "2026-10-27T19:44:08.245957446Z",
  "refresh_token": "5C8mC8SOAR50SoulXpC99egqVuQ5AoL5wUDMP0ewRZc",
  "refresh_expires_at": "2026-11-26T19:29:08.245474497Z",
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
  "command_id": "c978a4ae-737f-4ebf-ba10-e4ec31cc630e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:08Z",
    "sequence": 1793129348292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5a608a0-a9f9-44d7-9e8c-2f1ade89829b",
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
  "last_heartbeat_at": "2026-10-27T19:29:08.308775Z",
  "last_location_at": "2026-10-27T19:29:08.308775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "23639774-14a7-44af-8028-a90a344374b1",
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
  "id": "be21ec86-0324-4b14-89ba-271ec61cd573",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:34:08.348457Z",
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
  "command_id": "3aa38f4a-7f61-4a4f-9fd6-a9b4ebf5403e",
  "quote_id": "be21ec86-0324-4b14-89ba-271ec61cd573",
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
  "id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86ae6624-c81e-43b6-a1bd-7c49e1bb86fa",
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
  "created_at": "2026-10-27T19:29:08.384422Z",
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
    "id": "b5a06f48-0d2b-4fa7-8231-75a10c6174ce",
    "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
    "expires_at": "2026-10-27T19:29:23.387284Z",
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

`POST /api/driver/v1/offers/b5a06f48-0d2b-4fa7-8231-75a10c6174ce/accept` → **200**

```json
{
  "command_id": "2f1d33fb-84d2-4ded-b6b4-83c90f58d033"
}
```

```json
{
  "id": "9934522c-c73a-422e-bf58-c820c8e00125",
  "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d3c344f1-aac0-461f-93be-bd562104c927",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d3c344f1-aac0-461f-93be-bd562104c927",
  "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "assignment_id": "9934522c-c73a-422e-bf58-c820c8e00125",
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

`POST /api/driver/v1/trips/d3c344f1-aac0-461f-93be-bd562104c927/cancel` → **200**

```json
{
  "command_id": "7e4a8f4f-40ff-47e8-98a6-1ad384254a79",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "d3c344f1-aac0-461f-93be-bd562104c927",
  "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "assignment_id": "9934522c-c73a-422e-bf58-c820c8e00125",
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

`GET /api/rider/v1/orders/fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4` → **200**

```json
{
  "id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "86ae6624-c81e-43b6-a1bd-7c49e1bb86fa",
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
    "id": "9934522c-c73a-422e-bf58-c820c8e00125",
    "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d3c344f1-aac0-461f-93be-bd562104c927",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:29:08.384422Z",
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
    "id": "095c201b-0096-4726-8efe-6fed1d7ae4b5",
    "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
    "expires_at": "2026-10-27T19:29:23.510075Z",
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

`POST /api/driver/v1/offers/095c201b-0096-4726-8efe-6fed1d7ae4b5/accept` → **200**

```json
{
  "command_id": "143cec86-c702-42ac-addf-cd61b9dd7d92"
}
```

```json
{
  "id": "0ce76c5b-2b4a-45f1-926d-ba89e56f46b9",
  "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "970f77c5-f296-4550-87ac-5943ff3448a2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "970f77c5-f296-4550-87ac-5943ff3448a2",
  "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "assignment_id": "0ce76c5b-2b4a-45f1-926d-ba89e56f46b9",
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

`POST /api/driver/v1/trips/970f77c5-f296-4550-87ac-5943ff3448a2/cancel` → **200**

```json
{
  "command_id": "ea01e542-858a-4843-aeb8-9021d7f14ea9",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "970f77c5-f296-4550-87ac-5943ff3448a2",
  "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
  "assignment_id": "0ce76c5b-2b4a-45f1-926d-ba89e56f46b9",
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
    "id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:29:08.384422Z",
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
    "id": "cf444e15-d021-4d0c-9b3d-13389495d473",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:29:08.027949Z",
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

`GET /api/operator/v1/orders/fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:29:08.384952Z",
      "actor": {
        "type": "CLIENT",
        "id": "86ae6624-c81e-43b6-a1bd-7c49e1bb86fa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
        "quote_id": "be21ec86-0324-4b14-89ba-271ec61cd573",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:29:08.386503Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
        "attempt_id": "54348a5c-7ec4-4e10-afe9-4f97cddb4c76",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:29:08.391004Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b5a06f48-0d2b-4fa7-8231-75a10c6174ce",
        "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:29:08.445308Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b5a06f48-0d2b-4fa7-8231-75a10c6174ce",
        "order_id": "fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "9934522c-c73a-422e-bf58-c820c8e00125"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders cf444e15-d021-4d0c-9b3d-13389495d473, fe04a6f0-e1e0-41f7-b17e-1b5359ec9cd4.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730806861",
  "device_ref": "sandbox-11784"
}
```

```json
{
  "challenge_id": "1dcc6d0d-842c-46f0-bdc3-1551fc6a2f92",
  "expires_at": "2026-10-27T19:34:08.751597749Z",
  "resend_available_at": "2026-10-27T19:29:09.751597749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730806861` → **200**

```json
{
  "phone": "+380730806861",
  "audience": "CLIENT",
  "code": "332267",
  "sent_at": "2026-10-27T19:29:08.753702923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1dcc6d0d-842c-46f0-bdc3-1551fc6a2f92",
  "code": "332267",
  "device_ref": "sandbox-11784"
}
```

```json
{
  "session_id": "a15dac9c-405a-4577-b639-7520b87c36dc",
  "subject": {
    "type": "CLIENT",
    "id": "242e9271-f159-4e1b-9991-5146615a6ece"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDJlOTI3MS1mMTU5LTRlMWItOTk5MS01MTQ2NjE1YTZlY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjQ4LCJpYXQiOjE3OTMxMjkzNDgsImp0aSI6ImVlOWRjZTk2LTdkZGEtNDM2NC04YmNjLTcwMGY4ZmQ3ZjU2ZCIsInNpZCI6ImExNWRhYzljLTQwNWEtNDU3Ny1iNjM5LTc1MjBiODdjMzZkYyJ9.VdjrTWoSxnz75RwR3MViJ8WriqlT-X5COGfl_3giigk",
  "access_expires_at": "2026-10-27T19:44:08.801568446Z",
  "refresh_token": "4HXjAYivAhUS7lLo_MQbTVeCK6kJhRs-AzzPyLKMyNg",
  "refresh_expires_at": "2026-11-26T19:29:08.801192478Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ca45d27a-0441-466a-bbc5-4192250ac464",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7dff923d-94fc-4b04-949e-91a6a0a20c43",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7dff923d-94fc-4b04-949e-91a6a0a20c43",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "56ae8797f8f8e85f60fe0df3b20ea7bc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7dff923d-94fc-4b04-949e-91a6a0a20c43",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730806861"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7dff923d-94fc-4b04-949e-91a6a0a20c43",
  "expires_at": "2026-10-27T19:59:08.834215Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/7dff923d-94fc-4b04-949e-91a6a0a20c43` → **200**

```json
{
  "id": "7dff923d-94fc-4b04-949e-91a6a0a20c43",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T19:59:08.834215Z",
  "card": {
    "id": "4a4e20c0-a7e6-4818-ab61-ff4a27ea2260",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3014",
    "card_type": "Visa",
    "created_at": "2026-10-27T19:29:08.874924Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "4a4e20c0-a7e6-4818-ab61-ff4a27ea2260",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3014",
      "card_type": "Visa",
      "created_at": "2026-10-27T19:29:08.874924Z"
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
  "device_ref": "sandbox-22402"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "720b685e-07a1-47bc-a84e-3f66fc384a79",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22402"
}
```

```json
{
  "challenge_id": "a82529be-a3ed-4278-9b52-93be7876b857",
  "expires_at": "2026-10-27T19:34:09.974029777Z",
  "resend_available_at": "2026-10-27T19:29:10.974029777Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "523444",
  "sent_at": "2026-10-27T19:29:09.975979278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a82529be-a3ed-4278-9b52-93be7876b857",
  "code": "523444",
  "device_ref": "sandbox-22402"
}
```

```json
{
  "session_id": "4ea407b9-2b8a-4b00-afd6-a5520448f607",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI1MCwiaWF0IjoxNzkzMTI5MzUwLCJqdGkiOiIwOTY3OGUyNy05MDVmLTQ0MzMtOTcwOC05Zjc1NmIzYmU2ZjUiLCJzaWQiOiI0ZWE0MDdiOS0yYjhhLTRiMDAtYWZkNi1hNTUyMDQ0OGY2MDcifQ.k8nyj6IB2xs2sAfZSksYIBAFqQaXvPDRiY8c_HMwJ4M",
  "access_expires_at": "2026-10-27T19:44:10.021208001Z",
  "refresh_token": "PfnS84VTKPmtRBOsVs2Qe4en4LVTCgFm7VJ7ktKbiFY",
  "refresh_expires_at": "2026-11-26T19:29:10.020699835Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5a608a0-a9f9-44d7-9e8c-2f1ade89829b",
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
  "last_heartbeat_at": "2026-10-27T19:29:08.308775Z",
  "last_location_at": "2026-10-27T19:29:08.308775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d5a608a0-a9f9-44d7-9e8c-2f1ade89829b/handover` → **200**

```json
{
  "command_id": "b76e6ac1-f548-47e6-898b-cb24ebb65716",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5a608a0-a9f9-44d7-9e8c-2f1ade89829b",
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
  "last_heartbeat_at": "2026-10-27T19:29:08.308775Z",
  "last_location_at": "2026-10-27T19:29:08.308775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d5a608a0-a9f9-44d7-9e8c-2f1ade89829b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:10Z",
    "sequence": 1793129350976
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5a608a0-a9f9-44d7-9e8c-2f1ade89829b",
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
  "last_heartbeat_at": "2026-10-27T19:29:10.11452Z",
  "last_location_at": "2026-10-27T19:29:10.11452Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1b310686-f5ef-41c7-ba1a-c8af26046220",
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
  "id": "282eb4f2-d509-48ec-9c63-7c000dd8abeb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T19:34:10.147016Z",
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
  "command_id": "f790ea81-80b3-449d-86f6-3d838687c00a",
  "quote_id": "282eb4f2-d509-48ec-9c63-7c000dd8abeb",
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
  "id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "242e9271-f159-4e1b-9991-5146615a6ece",
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
  "created_at": "2026-10-27T19:29:10.181525Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb` → **200**

```json
{
  "id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "242e9271-f159-4e1b-9991-5146615a6ece",
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
  "created_at": "2026-10-27T19:29:10.181525Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb` → **200**

```json
{
  "id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "242e9271-f159-4e1b-9991-5146615a6ece",
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
  "created_at": "2026-10-27T19:29:10.181525Z",
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
    "id": "1c0899d4-bcd1-4b49-9089-e6870ce66ded",
    "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
    "expires_at": "2026-10-27T19:29:25.365987Z",
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

`POST /api/driver/v1/offers/1c0899d4-bcd1-4b49-9089-e6870ce66ded/accept` → **200**

```json
{
  "command_id": "6e425af3-0ff4-4fbb-bf5c-5dbe77f7a94a"
}
```

```json
{
  "id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "assignment_id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
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

`POST /api/driver/v1/work-sessions/d5a608a0-a9f9-44d7-9e8c-2f1ade89829b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:11Z",
    "sequence": 1793129351344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5a608a0-a9f9-44d7-9e8c-2f1ade89829b",
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
  "last_heartbeat_at": "2026-10-27T19:29:11.361257Z",
  "last_location_at": "2026-10-27T19:29:11.361257Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7961d40b-dd45-44b9-b804-19f3f2a4c1c3/arrive` → **200**

```json
{
  "command_id": "9dceeb98-ed41-4096-a6a4-5622e1bd9a51",
  "expected_version": 0
}
```

```json
{
  "id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "assignment_id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
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
  "arrived_at": "2026-10-27T19:29:11.39596Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7961d40b-dd45-44b9-b804-19f3f2a4c1c3/start` → **200**

```json
{
  "command_id": "5c7d445d-6938-4f28-bb1f-7b8a55083fd1",
  "expected_version": 1
}
```

```json
{
  "id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "assignment_id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
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
  "arrived_at": "2026-10-27T19:29:11.39596Z",
  "started_at": "2026-10-27T19:29:11.432279Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7961d40b-dd45-44b9-b804-19f3f2a4c1c3/complete` → **200**

```json
{
  "command_id": "84415810-d0c6-4dee-afac-d05fc6285514",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:29:11Z"
}
```

```json
{
  "id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "assignment_id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
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
  "arrived_at": "2026-10-27T19:29:11.39596Z",
  "started_at": "2026-10-27T19:29:11.432279Z",
  "completed_at": "2026-10-27T19:29:11.47631Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb` → **200**

```json
{
  "id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "242e9271-f159-4e1b-9991-5146615a6ece",
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
    "id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
    "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:29:10.181525Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb` → **200**

```json
{
  "id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "242e9271-f159-4e1b-9991-5146615a6ece",
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
    "id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
    "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:29:10.181525Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb` → **200**

```json
{
  "id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "242e9271-f159-4e1b-9991-5146615a6ece",
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
    "id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
    "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:29:10.181525Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb` → **200**

```json
{
  "id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "242e9271-f159-4e1b-9991-5146615a6ece",
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
    "id": "d3be9bbd-4715-41c7-95b8-f9f937f18829",
    "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7961d40b-dd45-44b9-b804-19f3f2a4c1c3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:29:10.181525Z",
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
      "id": "2e1f5740-5872-4d5f-928d-32235c28de7f",
      "at": "2026-10-27T19:29:12.396807Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb/tip` → **200**

```json
{
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
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
  "available_until": "2026-10-28T19:29:11.47631Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb/tip` → **201**

```json
{
  "command_id": "af3986e8-0bdc-43b1-934c-4d0f0044cd4c",
  "amount_minor": 2500
}
```

```json
{
  "id": "26fda5e8-050c-4e42-98c8-d9d81e9ab203",
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T19:29:14.697533Z"
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb/tip` → **200**

```json
{
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
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
  "available_until": "2026-10-28T19:29:11.47631Z",
  "open": false,
  "tip": {
    "id": "26fda5e8-050c-4e42-98c8-d9d81e9ab203",
    "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T19:29:14.697533Z"
  }
}
```

`GET /api/rider/v1/orders/27ab9280-a805-4859-87fc-0069c3429ecb/tip` → **200**

```json
{
  "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
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
  "available_until": "2026-10-28T19:29:11.47631Z",
  "open": false,
  "tip": {
    "id": "26fda5e8-050c-4e42-98c8-d9d81e9ab203",
    "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T19:29:14.697533Z"
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
      "id": "2e1f5740-5872-4d5f-928d-32235c28de7f",
      "at": "2026-10-27T19:29:12.396807Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
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
      "id": "95f0414f-b4e7-438f-a23e-9e94c0ce2590",
      "at": "2026-10-27T19:29:16.444707Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
      "counterpart_id": null
    },
    {
      "id": "2e1f5740-5872-4d5f-928d-32235c28de7f",
      "at": "2026-10-27T19:29:12.396807Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27ab9280-a805-4859-87fc-0069c3429ecb",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d5a608a0-a9f9-44d7-9e8c-2f1ade89829b",
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
  "last_heartbeat_at": "2026-10-27T19:29:11.361257Z",
  "last_location_at": "2026-10-27T19:29:11.361257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d5a608a0-a9f9-44d7-9e8c-2f1ade89829b/close` → **200**

```json
{
  "command_id": "de12e7c0-0f9d-4355-ac68-8ac60677ae6b",
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

Done: card order 27ab9280-a805-4859-87fc-0069c3429ecb.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737076843",
  "device_ref": "sandbox-7272"
}
```

```json
{
  "challenge_id": "2fd43449-6f4e-45c8-892c-7c2536632757",
  "expires_at": "2026-10-27T19:34:16.916658368Z",
  "resend_available_at": "2026-10-27T19:29:17.916658368Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737076843` → **200**

```json
{
  "phone": "+380737076843",
  "audience": "CLIENT",
  "code": "935372",
  "sent_at": "2026-10-27T19:29:16.920306666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fd43449-6f4e-45c8-892c-7c2536632757",
  "code": "935372",
  "device_ref": "sandbox-7272"
}
```

```json
{
  "session_id": "2b5abd04-5182-4de0-804d-3f9e87d48e12",
  "subject": {
    "type": "CLIENT",
    "id": "15da96c3-5922-44f7-9876-132cfe83b3fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWRhOTZjMy01OTIyLTQ0ZjctOTg3Ni0xMzJjZmU4M2IzZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjU2LCJpYXQiOjE3OTMxMjkzNTYsImp0aSI6ImI4NTU5YWE1LTdkM2YtNGZmZS1hYWYyLTI0MjQ4Y2ZiY2Q1ZSIsInNpZCI6IjJiNWFiZDA0LTUxODItNGRlMC04MDRkLTNmOWU4N2Q0OGUxMiJ9.5xRprgZAc2q6fHGz3NEfpK-PKgg3cf5TNQ_I9A-5AXM",
  "access_expires_at": "2026-10-27T19:44:16.973103994Z",
  "refresh_token": "fGdqApNLbeyz9_ThxBLt0nKVq0JC085SqhiUM1yv65I",
  "refresh_expires_at": "2026-11-26T19:29:16.972253495Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "fb7e3332-38d0-4c49-b7a5-2322500d725f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "dc9ded90-ad6a-4d5d-a89e-e38ef8034678",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-dc9ded90-ad6a-4d5d-a89e-e38ef8034678",
    "orderDate": "1793129357",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "5415a96bdb3dd4ee5609dc4714c43a55",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=dc9ded90-ad6a-4d5d-a89e-e38ef8034678",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737076843"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=dc9ded90-ad6a-4d5d-a89e-e38ef8034678",
  "created_at": "2026-10-27T19:29:17.006753Z",
  "expires_at": "2026-10-27T19:59:17.006753Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/dc9ded90-ad6a-4d5d-a89e-e38ef8034678` → **200**

```json
{
  "id": "dc9ded90-ad6a-4d5d-a89e-e38ef8034678",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:29:17.006753Z",
  "expires_at": "2026-10-27T19:59:17.006753Z",
  "completed_at": "2026-10-27T19:29:17.039501Z",
  "masked_pan": "41****8014",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "15da96c3-5922-44f7-9876-132cfe83b3fc",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "15da96c3-5922-44f7-9876-132cfe83b3fc",
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
      "id": "04766148-575e-4382-b843-edc45992776e",
      "at": "2026-10-27T19:29:17.45369Z",
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
  "client_id": "15da96c3-5922-44f7-9876-132cfe83b3fc",
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
      "id": "04766148-575e-4382-b843-edc45992776e",
      "at": "2026-10-27T19:29:17.45369Z",
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
  "device_ref": "sandbox-29932"
}
```

```json
{
  "challenge_id": "0bd1be2a-e97c-4bd1-847f-07bd30c78063",
  "expires_at": "2026-10-27T19:34:18.158191217Z",
  "resend_available_at": "2026-10-27T19:29:19.158191217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "648209",
  "sent_at": "2026-10-27T19:29:18.160529324Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bd1be2a-e97c-4bd1-847f-07bd30c78063",
  "code": "648209",
  "device_ref": "sandbox-29932"
}
```

```json
{
  "session_id": "bac39089-f85e-442f-8c7b-e2c46fa92270",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI1OCwiaWF0IjoxNzkzMTI5MzU4LCJqdGkiOiI1OWRiN2FkNS05ZjhhLTRhODktYmU5Mi05M2Y0ZmQ5MDliNTkiLCJzaWQiOiJiYWMzOTA4OS1mODVlLTQ0MmYtOGM3Yi1lMmM0NmZhOTIyNzAifQ.oy-VMPD8fWyKPYbsUkpcN-znpEw9IDKsHhqMez9eQv8",
  "access_expires_at": "2026-10-27T19:44:18.212341459Z",
  "refresh_token": "xjvWvXJF7orj3ycBtW-2NXHp8QHSlUdEzynrQdsnCEA",
  "refresh_expires_at": "2026-11-26T19:29:18.211795786Z",
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
  "command_id": "e91e6370-2c7d-4f03-b9fa-37ae6349f701",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "14b62547-5ef6-48c2-a521-463a1f66f74f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-14b62547-5ef6-48c2-a521-463a1f66f74f",
    "orderDate": "1793129358",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "dbbdfb84468bda2bd5dcd6986d111a01",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=14b62547-5ef6-48c2-a521-463a1f66f74f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=14b62547-5ef6-48c2-a521-463a1f66f74f",
  "created_at": "2026-10-27T19:29:18.264481Z",
  "expires_at": "2026-10-27T19:59:18.264481Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/14b62547-5ef6-48c2-a521-463a1f66f74f` → **200**

```json
{
  "id": "14b62547-5ef6-48c2-a521-463a1f66f74f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:29:18.264481Z",
  "expires_at": "2026-10-27T19:59:18.264481Z",
  "completed_at": "2026-10-27T19:29:18.292953Z",
  "masked_pan": "41****3890",
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
      "id": "3795ffeb-462f-4a63-8c53-0f9a955ea34d",
      "at": "2026-10-27T19:29:18.461274Z",
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
  "command_id": "583476ca-e0d3-4857-aab2-c45190dd8734",
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
  "correlation_id": "9678b188-1265-4f71-bda9-f1eeda69d57c"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673477395",
  "device_ref": "sandbox-27519"
}
```

```json
{
  "challenge_id": "6b242155-5fb9-4777-8e52-bcd35e36ec5b",
  "expires_at": "2026-10-27T19:34:19.419967501Z",
  "resend_available_at": "2026-10-27T19:29:20.419967501Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673477395` → **200**

```json
{
  "phone": "+380673477395",
  "audience": "CLIENT",
  "code": "039396",
  "sent_at": "2026-10-27T19:29:19.422380384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b242155-5fb9-4777-8e52-bcd35e36ec5b",
  "code": "039396",
  "device_ref": "sandbox-27519"
}
```

```json
{
  "session_id": "a5de6c36-bac7-40ef-a887-5ea6eaca85dd",
  "subject": {
    "type": "CLIENT",
    "id": "f589feab-6e36-46d4-8c6b-e828aa14b1fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTg5ZmVhYi02ZTM2LTQ2ZDQtOGM2Yi1lODI4YWExNGIxZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjU5LCJpYXQiOjE3OTMxMjkzNTksImp0aSI6IjFhZTk2M2M5LTNhNDAtNGUwYS04Y2Y0LTg4YjVkNGYxMzAyMyIsInNpZCI6ImE1ZGU2YzM2LWJhYzctNDBlZi1hODg3LTVlYTZlYWNhODVkZCJ9.ESA4cHdQSncRRocZX0Iydh9LTtOmUvpLsmjmriGZeZc",
  "access_expires_at": "2026-10-27T19:44:19.471478562Z",
  "refresh_token": "rhxO5MetX2PA2qteT_GPXhwCr6isG4Dbug6FEPyzSgM",
  "refresh_expires_at": "2026-11-26T19:29:19.470921757Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f589feab-6e36-46d4-8c6b-e828aa14b1fe",
  "session_id": "a5de6c36-bac7-40ef-a887-5ea6eaca85dd",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c8899fa6-1cf5-44fb-b027-3be360f04a61",
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
  "id": "52272b70-f364-425f-a209-89adb954bbd4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:19.526385Z",
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
  "challenge_id": "ff90c71a-cb1d-4304-830a-ac5e7baf774c",
  "expires_at": "2026-10-27T19:34:21.565729179Z",
  "resend_available_at": "2026-10-27T19:29:22.565729179Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673477395` → **200**

```json
{
  "phone": "+380673477395",
  "audience": "CLIENT",
  "code": "478163",
  "sent_at": "2026-10-27T19:29:21.567768839Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "9ad1195b-b502-4b92-b30a-706bbfae4ab2",
  "challenge_id": "ff90c71a-cb1d-4304-830a-ac5e7baf774c",
  "otp_code": "478163"
}
```

```json
{
  "client_id": "f589feab-6e36-46d4-8c6b-e828aa14b1fe",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T19:29:21.62850563Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a4e58bec-907b-4eb8-acea-84382bdc0abe",
  "quote_id": "52272b70-f364-425f-a209-89adb954bbd4",
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
  "correlation_id": "c98d93ca-6054-4f2b-9618-216aa5dee1de"
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
  "session_id": "9774da3c-3c60-4b2d-bb9a-7f426264f1ed",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNjEsImlhdCI6MTc5MzEyOTM2MSwianRpIjoiNGE1YmU4MzktYjEwYS00MzRlLTllODktODY2M2Q5ZDViMDBkIiwic2lkIjoiOTc3NGRhM2MtM2M2MC00YjJkLWJiOWEtN2Y0MjYyNjRmMWVkIn0.0eOmetkIAEFkU7Gm5OmAoPQ8qiN2x9MJ4K0E00qx9_k",
  "access_expires_at": "2026-10-27T19:44:21.889549603Z",
  "refresh_token": "745XWAzcfuOY83x1GMSj77Qzpk6pQJekj2qaNzUALek",
  "refresh_expires_at": "2026-10-28T07:29:21.889127216Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "f589feab-6e36-46d4-8c6b-e828aa14b1fe",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T19:29:21.628506Z",
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

`POST /api/admin/v1/client-deletions/f589feab-6e36-46d4-8c6b-e828aa14b1fe/complete` → **200**

```json
{
  "command_id": "2e027cb2-3f7d-4026-9ee2-b2d49660c498",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "f589feab-6e36-46d4-8c6b-e828aa14b1fe",
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
  "correlation_id": "ac4fa110-385f-41f3-aa4f-abdbb29e9e03"
}
```

Done: client f589feab-6e36-46d4-8c6b-e828aa14b1fe anonymized.

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
  "device_ref": "sandbox-3728"
}
```

```json
{
  "challenge_id": "d8b24a1e-cd86-46a4-a014-af170fe0e901",
  "expires_at": "2026-10-27T19:34:22.050342979Z",
  "resend_available_at": "2026-10-27T19:29:23.050342979Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "377758",
  "sent_at": "2026-10-27T19:29:22.052648186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8b24a1e-cd86-46a4-a014-af170fe0e901",
  "code": "377758",
  "device_ref": "sandbox-3728"
}
```

```json
{
  "session_id": "b5103bff-8bb1-4e1e-ac39-84379569443c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI2MiwiaWF0IjoxNzkzMTI5MzYyLCJqdGkiOiIzYWFmZGM0Zi05YTI3LTQyOTEtOGVkMS02Y2I5OTlkMzJmOWUiLCJzaWQiOiJiNTEwM2JmZi04YmIxLTRlMWUtYWMzOS04NDM3OTU2OTQ0M2MifQ.TLnthIHuLieXJULNaF25DtJwgzxw2CdX8A0B8ULpW_8",
  "access_expires_at": "2026-10-27T19:44:22.10854866Z",
  "refresh_token": "lRoVEgw76pOUXPlF5leax3H2wotFKvCCC0A0rkR7T80",
  "refresh_expires_at": "2026-11-26T19:29:22.107769074Z",
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
  "command_id": "6bc4fa5f-386f-450e-9b4c-ee5d633d967c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:22Z",
    "sequence": 1793129362155
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:22.171555Z",
  "last_location_at": "2026-10-27T19:29:22.171555Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673037736",
  "device_ref": "sandbox-28421"
}
```

```json
{
  "challenge_id": "e6e2a107-bd5d-40a0-98ae-6d1295454926",
  "expires_at": "2026-10-27T19:34:22.201104872Z",
  "resend_available_at": "2026-10-27T19:29:23.201104872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673037736` → **200**

```json
{
  "phone": "+380673037736",
  "audience": "CLIENT",
  "code": "468552",
  "sent_at": "2026-10-27T19:29:22.202992591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6e2a107-bd5d-40a0-98ae-6d1295454926",
  "code": "468552",
  "device_ref": "sandbox-28421"
}
```

```json
{
  "session_id": "ba57f75d-8b8e-403b-8ae3-71855d8b9d19",
  "subject": {
    "type": "CLIENT",
    "id": "1686d658-544a-4232-b8b6-231a63c6be11"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjg2ZDY1OC01NDRhLTQyMzItYjhiNi0yMzFhNjNjNmJlMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjYyLCJpYXQiOjE3OTMxMjkzNjIsImp0aSI6ImQxNWVmOGI3LTcwYmEtNGQzNi05YWU3LWYwMTYwYjAwNTQ5ZCIsInNpZCI6ImJhNTdmNzVkLThiOGUtNDAzYi04YWUzLTcxODU1ZDhiOWQxOSJ9.J6yzbjsf_coavkyfA-l1z_woBIywaXrnHFzjxX6FmqE",
  "access_expires_at": "2026-10-27T19:44:22.251925787Z",
  "refresh_token": "uW2IVaJFZsfLFyhhXE9rTy150WcEQkW2nqsV6FN5t14",
  "refresh_expires_at": "2026-11-26T19:29:22.251481647Z",
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
  "command_id": "aac01d76-32ad-4f93-8d27-526bab541142",
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
  "id": "4b41b4b4-d6eb-42ac-aaff-e8ea311e4d3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:22.309825Z",
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
  "command_id": "5dcab933-5803-4faf-8d5e-7a05f596376c",
  "platform": "ANDROID",
  "token": "sandbox-driver-6c80988f-c00c-4676-8572-632630050fcd"
}
```

```json
{
  "id": "6bea8f8d-39c7-4370-97d0-7f645765c1b5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:29:22.351413Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "e069bd3c-da1d-4840-bc4d-61341a2ed0b1",
  "platform": "ANDROID",
  "token": "sandbox-rider-d7ea7d18-35c2-4883-b70f-76f47985afc4"
}
```

```json
{
  "id": "c728c721-5fcc-4c5e-9345-d9dc7a09d51b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:29:22.386379Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3158210c-c5b3-4c83-88e3-3948f50b8227",
  "quote_id": "4b41b4b4-d6eb-42ac-aaff-e8ea311e4d3a",
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
  "id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1686d658-544a-4232-b8b6-231a63c6be11",
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
  "created_at": "2026-10-27T19:29:22.421875Z",
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
    "id": "5dee648e-7bb4-4380-a6ce-62773ea91fae",
    "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
    "expires_at": "2026-10-27T19:29:37.425059Z",
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

`POST /api/driver/v1/offers/5dee648e-7bb4-4380-a6ce-62773ea91fae/accept` → **200**

```json
{
  "command_id": "03b2f149-09a3-43eb-8ce9-6a5b0db8d759"
}
```

```json
{
  "id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:29:22.402Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:29:22.402Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:29:23.268290453Z",
    "token_suffix": "050fcd",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "dee75d82-41a5-4669-a4bd-46bdc82d3092",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673037736&after=2026-10-27T19:29:22.402Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380673037736&after=2026-10-27T19:29:22.402Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:29:24.271737336Z",
    "token_suffix": "85afc4",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "ebaad5c6-ea0c-4baa-8acb-9348ffdc550a",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b627cae2-c48b-4c72-a80e-f36410b54b44/messages` → **201**

```json
{
  "command_id": "c8e72ee9-3f8b-4507-baf3-3a6a406c5daa",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "86661f96-762e-49bb-a02e-9e965b445dcb",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T19:29:24.626045942Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "assignment_id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61",
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

`POST /api/driver/v1/trips/16ce65c0-a0e1-4c12-9586-034f91d8e281/messages` → **201**

```json
{
  "command_id": "8e178752-03bc-486d-b981-ac40d214191d",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "192fc8c9-5f60-4724-ab42-76267348196c",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T19:29:24.678027861Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b627cae2-c48b-4c72-a80e-f36410b54b44/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/16ce65c0-a0e1-4c12-9586-034f91d8e281/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673037736"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:24Z",
    "sequence": 1793129364748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:24.766823Z",
  "last_location_at": "2026-10-27T19:29:24.766823Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "assignment_id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61",
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

`POST /api/driver/v1/trips/16ce65c0-a0e1-4c12-9586-034f91d8e281/arrive` → **200**

```json
{
  "command_id": "e37f1eb7-d8a8-4027-a8ab-6ce2486638f3",
  "expected_version": 0
}
```

```json
{
  "id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "assignment_id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61",
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
  "arrived_at": "2026-10-27T19:29:24.81594Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/16ce65c0-a0e1-4c12-9586-034f91d8e281/start` → **200**

```json
{
  "command_id": "610dc65d-e115-45a6-ac3b-a90c66eacd38",
  "expected_version": 1
}
```

```json
{
  "id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "assignment_id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61",
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
  "arrived_at": "2026-10-27T19:29:24.81594Z",
  "started_at": "2026-10-27T19:29:24.847173Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:24Z",
    "sequence": 1793129364868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:24.885083Z",
  "last_location_at": "2026-10-27T19:29:24.885083Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/16ce65c0-a0e1-4c12-9586-034f91d8e281/complete` → **200**

```json
{
  "command_id": "989dd2bc-ebce-4965-a641-c9739f2a2712",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:29:24Z",
  "cash_received": true
}
```

```json
{
  "id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "assignment_id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61",
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
  "arrived_at": "2026-10-27T19:29:24.81594Z",
  "started_at": "2026-10-27T19:29:24.847173Z",
  "completed_at": "2026-10-27T19:29:24.917043Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b627cae2-c48b-4c72-a80e-f36410b54b44` → **200**

```json
{
  "id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1686d658-544a-4232-b8b6-231a63c6be11",
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
    "id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61",
    "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:29:22.421875Z",
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
    "id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:29:22.421875Z",
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
    "id": "16ce65c0-a0e1-4c12-9586-034f91d8e281",
    "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
    "order_short_number": 5,
    "created_at": "2026-10-27T19:29:22.482754Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "78efeeb4-2f5a-48d5-b6cd-c14d011fba16",
    "order_id": "5ef1c473-41c8-40b4-9d8d-e621e6bee8e2",
    "order_short_number": 1,
    "created_at": "2026-10-27T19:29:03.912614Z",
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

`GET /api/rider/v1/orders/b627cae2-c48b-4c72-a80e-f36410b54b44/tip` → **200**

```json
{
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
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
  "available_until": "2026-10-28T19:29:24.917043Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b627cae2-c48b-4c72-a80e-f36410b54b44/tip` → **201**

```json
{
  "command_id": "689984c0-5bf6-479a-971c-3057f14f7a86",
  "amount_minor": 1100
}
```

```json
{
  "id": "48609340-b623-4280-bfe3-c18750de355c",
  "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T19:29:28.099765Z"
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
  "session_id": "be73e501-b1f3-4622-9353-e51aa0785972",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNjgsImlhdCI6MTc5MzEyOTM2OCwianRpIjoiYzhmMjJmZTMtM2Q0Ni00MGE5LTgzNjUtZWMzMzg4Zjg0NTg4Iiwic2lkIjoiYmU3M2U1MDEtYjFmMy00NjIyLTkzNTMtZTUxYWEwNzg1OTcyIn0.G31r8hgl7ENDXoOkupRSENH5ULn1cZcbkD3zquwJhMI",
  "access_expires_at": "2026-10-27T19:44:28.337125436Z",
  "refresh_token": "vrDSsH7HjU29JhBvUNBhG8Y7BihKkOTifR6aBPqzG7E",
  "refresh_expires_at": "2026-10-28T07:29:28.336661446Z",
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
          "RIDER": 1,
          "DRIVER": 1
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
      "RIDER": 1,
      "DRIVER": 1
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
  "generated_at": "2026-10-27T19:29:28.373665579Z"
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
  "generated_at": "2026-10-27T19:29:28.401674143Z"
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
  "session_id": "bc2f776b-3b04-4b19-8b1e-6252490682e0",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNjgsImlhdCI6MTc5MzEyOTM2OCwianRpIjoiMTM5NDAzOGEtMWVhMC00ZDAwLWE2YjYtY2U3ZDIzZGIwOGY1Iiwic2lkIjoiYmMyZjc3NmItM2IwNC00YjE5LThiMWUtNjI1MjQ5MDY4MmUwIn0.UfEaesgYQ0gYX_RFt__Vdu9XWbYUXIMyl-tzbu5UOAY",
  "access_expires_at": "2026-10-27T19:44:28.630240493Z",
  "refresh_token": "3SdddkTO97ckErXorGXXWRWxTbso0_JhXtvcYZ2flFw",
  "refresh_expires_at": "2026-10-28T07:29:28.629796589Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b627cae2-c48b-4c72-a80e-f36410b54b44/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:29:22.422471Z",
      "actor": {
        "type": "CLIENT",
        "id": "1686d658-544a-4232-b8b6-231a63c6be11",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
        "quote_id": "4b41b4b4-d6eb-42ac-aaff-e8ea311e4d3a",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:29:22.424199Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
        "attempt_id": "0daa147b-3206-47f4-b1ae-3e7a3bc89b88",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:29:22.429469Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5dee648e-7bb4-4380-a6ce-62773ea91fae",
        "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:29:22.484328Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5dee648e-7bb4-4380-a6ce-62773ea91fae",
        "order_id": "b627cae2-c48b-4c72-a80e-f36410b54b44",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "2759aa7c-f8ef-491d-9c82-9509dcc73e61"
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
  "at": "2026-10-27T19:29:28.673955669Z",
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
      "last_location_at": "2026-10-27T19:29:24.885083Z",
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
      "last_location_at": "2026-10-27T19:29:08.162201Z",
      "order_id": null
    }
  ]
}
```

Done: order b627cae2-c48b-4c72-a80e-f36410b54b44.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18565"
}
```

```json
{
  "challenge_id": "701bfbc4-9c9e-42f9-ae22-6df3cb270e1a",
  "expires_at": "2026-10-27T19:34:28.70993483Z",
  "resend_available_at": "2026-10-27T19:29:29.70993483Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "607923",
  "sent_at": "2026-10-27T19:29:28.711851611Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "701bfbc4-9c9e-42f9-ae22-6df3cb270e1a",
  "code": "607923",
  "device_ref": "sandbox-18565"
}
```

```json
{
  "session_id": "86247a39-4263-4088-b62f-2bd69bc769ce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI2OCwiaWF0IjoxNzkzMTI5MzY4LCJqdGkiOiJkYzUwMTNhNS0xM2I5LTQ3ZGEtODYzNS1hYjg5NWU1NTgzNzIiLCJzaWQiOiI4NjI0N2EzOS00MjYzLTQwODgtYjYyZi0yYmQ2OWJjNzY5Y2UifQ.IlhpASZjjZUQQmdpQicKhwGCWxD4e7Ea0_U43UTT2ac",
  "access_expires_at": "2026-10-27T19:44:28.758931006Z",
  "refresh_token": "FqN0DAa9ipGU2pLKXNdaihMMjEoegw7fUOxHrNUdfSE",
  "refresh_expires_at": "2026-11-26T19:29:28.758563011Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:24.885083Z",
  "last_location_at": "2026-10-27T19:29:24.885083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/handover` → **200**

```json
{
  "command_id": "fa50ce62-4e14-4ac3-8824-dea2944e91c3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:24.885083Z",
  "last_location_at": "2026-10-27T19:29:24.885083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:28Z",
    "sequence": 1793129368832
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:28.848029Z",
  "last_location_at": "2026-10-27T19:29:28.848029Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663716130",
  "device_ref": "sandbox-9379"
}
```

```json
{
  "challenge_id": "184d8cb2-0cad-4856-9c5c-1b2584f9dd31",
  "expires_at": "2026-10-27T19:34:28.868085188Z",
  "resend_available_at": "2026-10-27T19:29:29.868085188Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663716130` → **200**

```json
{
  "phone": "+380663716130",
  "audience": "CLIENT",
  "code": "570228",
  "sent_at": "2026-10-27T19:29:28.870224094Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "184d8cb2-0cad-4856-9c5c-1b2584f9dd31",
  "code": "570228",
  "device_ref": "sandbox-9379"
}
```

```json
{
  "session_id": "f16f1844-e250-400a-8b2d-13e3939802ab",
  "subject": {
    "type": "CLIENT",
    "id": "4a800db1-013c-4f5f-9f9f-b2c43de8aa22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTgwMGRiMS0wMTNjLTRmNWYtOWY5Zi1iMmM0M2RlOGFhMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjY4LCJpYXQiOjE3OTMxMjkzNjgsImp0aSI6ImY0ZjY4YTZmLWZkZDItNGJkYy1iMDU0LWZiZjliNmJkNWQ4NSIsInNpZCI6ImYxNmYxODQ0LWUyNTAtNDAwYS04YjJkLTEzZTM5Mzk4MDJhYiJ9.DqbOyAD1i21o_ufCOmSgKUBlSbyuMcXARRgAYF5FJBY",
  "access_expires_at": "2026-10-27T19:44:28.916529285Z",
  "refresh_token": "7ZDM9gNb_CosqUDn2XNvVvIJwzXrNzkjcw4DYzWi4fQ",
  "refresh_expires_at": "2026-11-26T19:29:28.915946591Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5ca7eda0-50e5-411c-9d63-78615f35518b",
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
  "id": "72179b03-35ac-4242-a05a-68c59103691f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T19:34:28.945567Z",
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
  "command_id": "46170985-fec7-46ae-9bce-d409c5653458",
  "quote_id": "72179b03-35ac-4242-a05a-68c59103691f",
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
  "id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4a800db1-013c-4f5f-9f9f-b2c43de8aa22",
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
  "created_at": "2026-10-27T19:29:28.977371Z",
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
    "id": "4024f48c-2fb3-4e77-a1f3-156c74e9dde3",
    "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
    "expires_at": "2026-10-27T19:29:43.979492Z",
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

`POST /api/driver/v1/offers/4024f48c-2fb3-4e77-a1f3-156c74e9dde3/accept` → **200**

```json
{
  "command_id": "51636116-ff96-4fed-9295-bc7dcbc8b84b"
}
```

```json
{
  "id": "13906d53-6ff7-401d-815c-ce44ec7ba08d",
  "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "67b8b028-fac5-453d-9809-3675df4ee09a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "67b8b028-fac5-453d-9809-3675df4ee09a",
  "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
  "assignment_id": "13906d53-6ff7-401d-815c-ce44ec7ba08d",
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

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:29Z",
    "sequence": 1793129369660
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.082313Z",
  "last_location_at": "2026-10-27T19:29:29.082313Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/67b8b028-fac5-453d-9809-3675df4ee09a/arrive` → **200**

```json
{
  "command_id": "a5cc436c-b295-4150-a0ef-8cfd0bb3d86a",
  "expected_version": 0
}
```

```json
{
  "id": "67b8b028-fac5-453d-9809-3675df4ee09a",
  "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
  "assignment_id": "13906d53-6ff7-401d-815c-ce44ec7ba08d",
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
  "arrived_at": "2026-10-27T19:29:29.11163Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/67b8b028-fac5-453d-9809-3675df4ee09a/start` → **200**

```json
{
  "command_id": "12d1833b-8078-493f-8c94-ed952d568cec",
  "expected_version": 1
}
```

```json
{
  "id": "67b8b028-fac5-453d-9809-3675df4ee09a",
  "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
  "assignment_id": "13906d53-6ff7-401d-815c-ce44ec7ba08d",
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
  "arrived_at": "2026-10-27T19:29:29.11163Z",
  "started_at": "2026-10-27T19:29:29.14499Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:29Z",
    "sequence": 1793129369661
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.186538Z",
  "last_location_at": "2026-10-27T19:29:29.186538Z",
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
  "device_ref": "sandbox-23621"
}
```

```json
{
  "challenge_id": "28c1e88f-8688-4993-be1a-ff68c3b0daee",
  "expires_at": "2026-10-27T19:34:29.206550813Z",
  "resend_available_at": "2026-10-27T19:29:30.206550813Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "294189",
  "sent_at": "2026-10-27T19:29:29.208666694Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28c1e88f-8688-4993-be1a-ff68c3b0daee",
  "code": "294189",
  "device_ref": "sandbox-23621"
}
```

```json
{
  "session_id": "3266133a-0bc0-4406-8f77-6680d64bb689",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI2OSwiaWF0IjoxNzkzMTI5MzY5LCJqdGkiOiJjOGZlOTgxNi03YTFjLTQ5YTUtYTg1ZS04OTg5YmZjMWY4NDIiLCJzaWQiOiIzMjY2MTMzYS0wYmMwLTQ0MDYtOGY3Ny02NjgwZDY0YmI2ODkifQ.UAgoqAKrWRUAe7zRrkC18qxVNBFCbtp94mONV19aPtE",
  "access_expires_at": "2026-10-27T19:44:29.25516777Z",
  "refresh_token": "bFhd-S5QjZVxfy-lhIhJpv0oD9G1rg-rzL0H-SXmLZc",
  "refresh_expires_at": "2026-11-26T19:29:29.254678448Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:08.162201Z",
  "last_location_at": "2026-10-27T19:29:08.162201Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/35810045-3727-4da5-a7ea-195682489758/handover` → **200**

```json
{
  "command_id": "571f1e53-eca1-4d22-890f-6a32edcade6f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:08.162201Z",
  "last_location_at": "2026-10-27T19:29:08.162201Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/35810045-3727-4da5-a7ea-195682489758/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:29Z",
    "sequence": 1793129369662
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.343661Z",
  "last_location_at": "2026-10-27T19:29:29.343661Z",
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
  "session_id": "67a76468-5ea1-4c69-98ea-6bcf5eff3ea7",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNjksImlhdCI6MTc5MzEyOTM2OSwianRpIjoiMmEzYTAyYjQtOWZhNi00NWNjLWEwZDUtNjEzZWM3NzE2YjdmIiwic2lkIjoiNjdhNzY0NjgtNWVhMS00YzY5LTk4ZWEtNmJjZjVlZmYzZWE3In0.wbRzx4anH_eZFo-mYTP6KSKPJ3i30O6GhmzwZlUMmfA",
  "access_expires_at": "2026-10-27T19:44:29.576482573Z",
  "refresh_token": "zpyJhylJ8oIb5xgEUFP8doDihyaN_KHO4UuPW-wrveQ",
  "refresh_expires_at": "2026-10-28T07:29:29.576075038Z",
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
  "session_id": "b7899bb8-b7d5-4907-8a8f-2c135ddc0ef0",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNjksImlhdCI6MTc5MzEyOTM2OSwianRpIjoiNTY0ZWViNWUtNTZkNy00MDBmLWE2MGEtYTI2ZTFkYTk1MjA3Iiwic2lkIjoiYjc4OTliYjgtYjdkNS00OTA3LThhOGYtMmMxMzVkZGMwZWYwIn0.7Tc5FAKpUiT_B23eQ2gz2xoAomaYX3Ua8flD-UyK9m8",
  "access_expires_at": "2026-10-27T19:44:29.800545538Z",
  "refresh_token": "reRB_BSjaokPr22SD74lPCjntjaiQUjJsXIsFmmVrs4",
  "refresh_expires_at": "2026-10-28T07:29:29.800136415Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2d53de82-d243-4f53-92e3-c2bc611b5bec` → **200**

```json
{
  "id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4a800db1-013c-4f5f-9f9f-b2c43de8aa22",
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
    "id": "13906d53-6ff7-401d-815c-ce44ec7ba08d",
    "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "67b8b028-fac5-453d-9809-3675df4ee09a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T19:29:28.977371Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2d53de82-d243-4f53-92e3-c2bc611b5bec/interrupt` → **200**

```json
{
  "command_id": "17e57027-e445-49cc-8398-91c867751412",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "4a800db1-013c-4f5f-9f9f-b2c43de8aa22",
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
      "id": "13906d53-6ff7-401d-815c-ce44ec7ba08d",
      "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "67b8b028-fac5-453d-9809-3675df4ee09a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T19:29:28.977371Z",
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
    "id": "33eb4f8f-879d-4756-a547-0633a599366b",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "4a800db1-013c-4f5f-9f9f-b2c43de8aa22",
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
    "id": "989c18e9-be45-47d7-95e3-ffb8bb4d86d4",
    "order_id": "33eb4f8f-879d-4756-a547-0633a599366b",
    "expires_at": "2026-10-27T19:29:44.869017Z",
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

`POST /api/driver/v1/offers/989c18e9-be45-47d7-95e3-ffb8bb4d86d4/accept` → **200**

```json
{
  "command_id": "d4a831aa-5825-42d8-9359-402429f7c203"
}
```

```json
{
  "id": "7e6dee75-6bd9-4b6f-806d-6bcb66a5fbeb",
  "order_id": "33eb4f8f-879d-4756-a547-0633a599366b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b0bc95ba-e648-4cfb-bc89-8ce43614cb26",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b0bc95ba-e648-4cfb-bc89-8ce43614cb26",
  "order_id": "33eb4f8f-879d-4756-a547-0633a599366b",
  "assignment_id": "7e6dee75-6bd9-4b6f-806d-6bcb66a5fbeb",
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
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.343661Z",
  "last_location_at": "2026-10-27T19:29:29.343661Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/35810045-3727-4da5-a7ea-195682489758/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:29Z",
    "sequence": 1793129369979
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.995095Z",
  "last_location_at": "2026-10-27T19:29:29.995095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b0bc95ba-e648-4cfb-bc89-8ce43614cb26/arrive` → **200**

```json
{
  "command_id": "a2c24ce1-f9b1-4f41-bb5a-945155d98bb7",
  "expected_version": 0
}
```

```json
{
  "id": "b0bc95ba-e648-4cfb-bc89-8ce43614cb26",
  "order_id": "33eb4f8f-879d-4756-a547-0633a599366b",
  "assignment_id": "7e6dee75-6bd9-4b6f-806d-6bcb66a5fbeb",
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
  "arrived_at": "2026-10-27T19:29:30.025353Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b0bc95ba-e648-4cfb-bc89-8ce43614cb26/start` → **200**

```json
{
  "command_id": "965f4bd2-747c-4b73-9020-1b4afdefbf52",
  "expected_version": 1
}
```

```json
{
  "id": "b0bc95ba-e648-4cfb-bc89-8ce43614cb26",
  "order_id": "33eb4f8f-879d-4756-a547-0633a599366b",
  "assignment_id": "7e6dee75-6bd9-4b6f-806d-6bcb66a5fbeb",
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
  "arrived_at": "2026-10-27T19:29:30.025353Z",
  "started_at": "2026-10-27T19:29:30.057495Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b0bc95ba-e648-4cfb-bc89-8ce43614cb26/complete` → **200**

```json
{
  "command_id": "5615a6ed-fa64-461e-9518-6780eea551e5",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:29:30Z"
}
```

```json
{
  "id": "b0bc95ba-e648-4cfb-bc89-8ce43614cb26",
  "order_id": "33eb4f8f-879d-4756-a547-0633a599366b",
  "assignment_id": "7e6dee75-6bd9-4b6f-806d-6bcb66a5fbeb",
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
  "arrived_at": "2026-10-27T19:29:30.025353Z",
  "started_at": "2026-10-27T19:29:30.057495Z",
  "completed_at": "2026-10-27T19:29:30.092909Z",
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
    "id": "33eb4f8f-879d-4756-a547-0633a599366b",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:29:29.862232Z",
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
    "id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:29:28.977371Z",
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

`GET /api/operator/v1/orders/2d53de82-d243-4f53-92e3-c2bc611b5bec/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:29:28.977803Z",
      "actor": {
        "type": "CLIENT",
        "id": "4a800db1-013c-4f5f-9f9f-b2c43de8aa22",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
        "quote_id": "72179b03-35ac-4242-a05a-68c59103691f",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:29:28.978956Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
        "attempt_id": "ef43eb75-4ae6-4022-9931-607f87bf2a42",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:29:28.98271Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4024f48c-2fb3-4e77-a1f3-156c74e9dde3",
        "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:29:29.031179Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4024f48c-2fb3-4e77-a1f3-156c74e9dde3",
        "order_id": "2d53de82-d243-4f53-92e3-c2bc611b5bec",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "13906d53-6ff7-401d-815c-ce44ec7ba08d"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 2d53de82-d243-4f53-92e3-c2bc611b5bec, follow-up 33eb4f8f-879d-4756-a547-0633a599366b.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3810"
}
```

```json
{
  "challenge_id": "558c69d0-d4dd-40c2-aa7c-bc00c77e4a9e",
  "expires_at": "2026-10-27T19:34:33.202140896Z",
  "resend_available_at": "2026-10-27T19:29:34.202140896Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "413509",
  "sent_at": "2026-10-27T19:29:33.203915322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "558c69d0-d4dd-40c2-aa7c-bc00c77e4a9e",
  "code": "413509",
  "device_ref": "sandbox-3810"
}
```

```json
{
  "session_id": "bbba2620-9da2-48be-9752-a2bbd6e68725",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI3MywiaWF0IjoxNzkzMTI5MzczLCJqdGkiOiJlN2I5ZGU3YS02ODcxLTQ3Y2QtYjRkNS0wM2E1NDdmMTAyYzciLCJzaWQiOiJiYmJhMjYyMC05ZGEyLTQ4YmUtOTc1Mi1hMmJiZDZlNjg3MjUifQ.tBgj3F9b78C2fJNTpTDrI7r1hVpNiEiwIA_KL0c4l9c",
  "access_expires_at": "2026-10-27T19:44:33.251399306Z",
  "refresh_token": "e5C61XY4_jkgpqJGmIFbSuErJSOBAl5kpdQnxAw1x5Y",
  "refresh_expires_at": "2026-11-26T19:29:33.250994075Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.995095Z",
  "last_location_at": "2026-10-27T19:29:29.995095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/35810045-3727-4da5-a7ea-195682489758/handover` → **200**

```json
{
  "command_id": "458a392c-d346-4fde-9738-36968897e234",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.995095Z",
  "last_location_at": "2026-10-27T19:29:29.995095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/35810045-3727-4da5-a7ea-195682489758/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:33Z",
    "sequence": 1793129373320
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:33.336812Z",
  "last_location_at": "2026-10-27T19:29:33.336812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671285732",
  "device_ref": "sandbox-24158"
}
```

```json
{
  "challenge_id": "8f298f54-57d0-41f4-a9fa-d8d0cd35e269",
  "expires_at": "2026-10-27T19:34:33.360091074Z",
  "resend_available_at": "2026-10-27T19:29:34.360091074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671285732` → **200**

```json
{
  "phone": "+380671285732",
  "audience": "CLIENT",
  "code": "959852",
  "sent_at": "2026-10-27T19:29:33.361834175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f298f54-57d0-41f4-a9fa-d8d0cd35e269",
  "code": "959852",
  "device_ref": "sandbox-24158"
}
```

```json
{
  "session_id": "62dd48d8-79d5-4a6f-b1a7-1666f9dbb442",
  "subject": {
    "type": "CLIENT",
    "id": "749ea058-796f-4842-8edc-54ec68316d77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDllYTA1OC03OTZmLTQ4NDItOGVkYy01NGVjNjgzMTZkNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjczLCJpYXQiOjE3OTMxMjkzNzMsImp0aSI6Ijc4OGM5Mjc1LWZlYjYtNDI1OC04OWZiLWRlMGQ4YzZiN2IzZCIsInNpZCI6IjYyZGQ0OGQ4LTc5ZDUtNGE2Zi1iMWE3LTE2NjZmOWRiYjQ0MiJ9.U-oE9bcgUo7Es6xvOWEcpfUWZMnJ98nZ-pbXYVXbS5k",
  "access_expires_at": "2026-10-27T19:44:33.410646957Z",
  "refresh_token": "nLduNAeqoPRA7JvIV5z9W0iyveSifb0s9NRb25PQi0g",
  "refresh_expires_at": "2026-11-26T19:29:33.410279233Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "79228cd3-8c99-4abc-aea5-a498cf89c0be",
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
  "id": "0be84d45-9108-48f8-a72c-f6dc2c6e45f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:33.439458Z",
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
  "command_id": "d0a75791-86d4-4691-b54d-09c422f40485",
  "quote_id": "0be84d45-9108-48f8-a72c-f6dc2c6e45f8",
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
    "phone": "+380676246440"
  }
}
```

```json
{
  "id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.471854Z",
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
    "id": "86be6c8f-0eac-4307-99f1-4e76ba4e7122",
    "order_id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
    "expires_at": "2026-10-27T19:29:48.47494Z",
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

`POST /api/driver/v1/offers/86be6c8f-0eac-4307-99f1-4e76ba4e7122/accept` → **200**

```json
{
  "command_id": "ccf3a223-5305-4b25-8dec-5ea2c8c9b201"
}
```

```json
{
  "id": "57f9478b-afaf-41ae-b5ee-528fa4f17055",
  "order_id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e4a4a12-d87e-481b-b6f3-6feec790fbe0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e4a4a12-d87e-481b-b6f3-6feec790fbe0",
  "order_id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
  "assignment_id": "57f9478b-afaf-41ae-b5ee-528fa4f17055",
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
    "phone": "+380676246440"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f80612be-32a0-4cfb-a589-dcdfbd423e1e",
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
  "id": "a8f28cce-538a-4a85-a57e-bf19609db12a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:33.591419Z",
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
  "command_id": "61507558-de54-4318-8773-5d2c74af79e2",
  "quote_id": "a8f28cce-538a-4a85-a57e-bf19609db12a",
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
  "id": "598698cf-8bd5-4d2b-9fed-1128370e6f3f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.627328Z",
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
  "command_id": "02194024-1d40-4dc7-bc1e-17c2ef4a4189",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T22:29:33Z"
}
```

```json
{
  "id": "3675fb39-050b-4574-a0dc-4eb7e4173c66",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:33.668987Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:29:33Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "83458a0b-5aec-49a9-86a9-2a8bb1e2e4db",
  "quote_id": "3675fb39-050b-4574-a0dc-4eb7e4173c66",
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
  "pickup_at": "2026-10-27T22:29:33Z"
}
```

```json
{
  "id": "61bca15e-bfb9-4988-b2b5-db17b9777abf",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.702813Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:29:33Z",
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
  "command_id": "8bca6104-c1e5-4636-ba0b-ba1864ab0274",
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
  "id": "622cffcf-2b53-4b06-affc-885521f40efe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:33.735863Z",
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
  "command_id": "97f7b2f8-e49f-422f-b34f-b030f8b56e56",
  "quote_id": "622cffcf-2b53-4b06-affc-885521f40efe",
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
  "correlation_id": "642237c5-bc49-4bad-a7e7-7405139235c1"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "61bca15e-bfb9-4988-b2b5-db17b9777abf",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
      "created_at": "2026-10-27T19:29:33.702813Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T22:29:33Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "598698cf-8bd5-4d2b-9fed-1128370e6f3f",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
      "created_at": "2026-10-27T19:29:33.627328Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "598698cf-8bd5-4d2b-9fed-1128370e6f3f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.627328Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/0e4164ba-f61c-4d3d-989a-6e02acb61b39` → **200**

```json
{
  "id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
    "id": "57f9478b-afaf-41ae-b5ee-528fa4f17055",
    "order_id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3e4a4a12-d87e-481b-b6f3-6feec790fbe0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T19:29:33.471854Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0e4164ba-f61c-4d3d-989a-6e02acb61b39/cancel` → **200**

```json
{
  "command_id": "905f538f-9dd7-4eb9-836f-2475c7310533",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
    "id": "57f9478b-afaf-41ae-b5ee-528fa4f17055",
    "order_id": "0e4164ba-f61c-4d3d-989a-6e02acb61b39",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3e4a4a12-d87e-481b-b6f3-6feec790fbe0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:29:33.471854Z",
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

`GET /api/rider/v1/orders/598698cf-8bd5-4d2b-9fed-1128370e6f3f` → **200**

```json
{
  "id": "598698cf-8bd5-4d2b-9fed-1128370e6f3f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.627328Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/598698cf-8bd5-4d2b-9fed-1128370e6f3f/cancel` → **200**

```json
{
  "command_id": "bfd0b2ee-6272-4b10-b27d-cd2dc48fc55b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "598698cf-8bd5-4d2b-9fed-1128370e6f3f",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.627328Z",
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

`GET /api/rider/v1/orders/61bca15e-bfb9-4988-b2b5-db17b9777abf` → **200**

```json
{
  "id": "61bca15e-bfb9-4988-b2b5-db17b9777abf",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.702813Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:29:33Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/61bca15e-bfb9-4988-b2b5-db17b9777abf/cancel` → **200**

```json
{
  "command_id": "8cf8266e-48b3-4798-8bc2-5d7524c79c17",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "61bca15e-bfb9-4988-b2b5-db17b9777abf",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "749ea058-796f-4842-8edc-54ec68316d77",
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
  "created_at": "2026-10-27T19:29:33.702813Z",
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
  "pickup_at": "2026-10-27T22:29:33Z",
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
  "session_id": "35810045-3727-4da5-a7ea-195682489758",
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
  "last_heartbeat_at": "2026-10-27T19:29:33.336812Z",
  "last_location_at": "2026-10-27T19:29:33.336812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/35810045-3727-4da5-a7ea-195682489758/close` → **200**

```json
{
  "command_id": "4e4323e9-37c3-4f87-ac68-cb68dd4ecbe3",
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

Done: orders 0e4164ba-f61c-4d3d-989a-6e02acb61b39, 598698cf-8bd5-4d2b-9fed-1128370e6f3f, 61bca15e-bfb9-4988-b2b5-db17b9777abf.

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
  "session_id": "0daa833a-c93f-4ff1-8d3c-32d3ad5febf6",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNzQsImlhdCI6MTc5MzEyOTM3NCwianRpIjoiMWMyZWI3ZjctMGQ2Yi00MjY4LWFiZTktMWU4M2ExNzNjMGY1Iiwic2lkIjoiMGRhYTgzM2EtYzkzZi00ZmYxLThkM2MtMzJkM2FkNWZlYmY2In0.vKYLy7T-DjoSdLa4POXU47w0VuYCRH33sZ-olNryJIg",
  "access_expires_at": "2026-10-27T19:44:34.235727497Z",
  "refresh_token": "sDbWZExRkFldqjgXjAHJJqbf2jHMdHhFZX0jmzANPSY",
  "refresh_expires_at": "2026-10-28T07:29:34.235391951Z",
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
  "session_id": "7c554ea5-b82f-45e7-9034-74421144f1f7",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNzQsImlhdCI6MTc5MzEyOTM3NCwianRpIjoiMGEyOTU4OTctZmMwNy00YzFkLThiOTQtYTU0ZmIxMzExM2RlIiwic2lkIjoiN2M1NTRlYTUtYjgyZi00NWU3LTkwMzQtNzQ0MjExNDRmMWY3In0.70ebKiYDIAyq6XFx8C56smDzMjSqthe0y5ZIbHsERTo",
  "access_expires_at": "2026-10-27T19:44:34.459347034Z",
  "refresh_token": "3b5AfFbb9fjY-8bPFEk0_d8ZZZCbfApO0pDhoEL32yo",
  "refresh_expires_at": "2026-10-28T07:29:34.458877336Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26381"
}
```

```json
{
  "challenge_id": "6fa256d4-0218-4272-95d8-d4ca55e6182a",
  "expires_at": "2026-10-27T19:34:34.479453492Z",
  "resend_available_at": "2026-10-27T19:29:35.479453492Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "391784",
  "sent_at": "2026-10-27T19:29:34.481039518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6fa256d4-0218-4272-95d8-d4ca55e6182a",
  "code": "391784",
  "device_ref": "sandbox-26381"
}
```

```json
{
  "session_id": "1da67b43-7e61-448f-a0e9-a7b948aa0bef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI3NCwiaWF0IjoxNzkzMTI5Mzc0LCJqdGkiOiJiYjM5MmIyNS1kOWY5LTRlMWQtYmQzMy0yNGMyYTZjZWU3MjQiLCJzaWQiOiIxZGE2N2I0My03ZTYxLTQ0OGYtYTBlOS1hN2I5NDhhYTBiZWYifQ.xaRvdxIEsCU34GJ-WriTi45ydGFbYq6N8WR7usUt-qo",
  "access_expires_at": "2026-10-27T19:44:34.525766008Z",
  "refresh_token": "JEznt-ep8rqbCu8xFqFyHr3dRRimTqoBIfryV0zJSEQ",
  "refresh_expires_at": "2026-11-26T19:29:34.525431984Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.186538Z",
  "last_location_at": "2026-10-27T19:29:29.186538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/handover` → **200**

```json
{
  "command_id": "f35f34e3-ba66-456d-a000-bcf031a213a0",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:29.186538Z",
  "last_location_at": "2026-10-27T19:29:29.186538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:34Z",
    "sequence": 1793129374595
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:34.609861Z",
  "last_location_at": "2026-10-27T19:29:34.609861Z",
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
  "command_id": "a296796e-646b-4351-959e-1a33e8d3f8f1",
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
  "effective_at": "2026-10-27T19:29:34.673722Z",
  "changed_by": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T19:29:34.700085267Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8424e513-2755-471f-8542-9a45ea92d59e",
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
  "id": "18ebeffe-92c7-435a-9c3c-4ce14a025f84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:34:34.734143Z",
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
  "command_id": "49b0e71d-76b6-4982-a2c2-2c0896a6adf0",
  "quote_id": "18ebeffe-92c7-435a-9c3c-4ce14a025f84",
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
    "phone": "+3806711120809"
  }
}
```

```json
{
  "id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
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
  "created_at": "2026-10-27T19:29:34.773474Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120809"
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
    "id": "60979ca4-c1c3-4446-a4c0-97b1478482f9",
    "order_id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
    "expires_at": "2026-10-27T19:29:49.776376Z",
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

`POST /api/driver/v1/offers/60979ca4-c1c3-4446-a4c0-97b1478482f9/accept` → **200**

```json
{
  "command_id": "0f130f2a-7c41-4dc8-ae89-f8a96b022e9c"
}
```

```json
{
  "id": "03b12c5a-326e-494d-be72-0b7362356c64",
  "order_id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "304925e9-9228-41ef-8ee0-72feff61a90d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "304925e9-9228-41ef-8ee0-72feff61a90d",
  "order_id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
  "assignment_id": "03b12c5a-326e-494d-be72-0b7362356c64",
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
    "phone": "+3806711120809"
  }
}
```

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:34Z",
    "sequence": 1793129374857
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:34.872245Z",
  "last_location_at": "2026-10-27T19:29:34.872245Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/304925e9-9228-41ef-8ee0-72feff61a90d/arrive` → **200**

```json
{
  "command_id": "4c8a1ca2-f60a-4b74-b595-57503d07c90b",
  "expected_version": 0
}
```

```json
{
  "id": "304925e9-9228-41ef-8ee0-72feff61a90d",
  "order_id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
  "assignment_id": "03b12c5a-326e-494d-be72-0b7362356c64",
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
  "arrived_at": "2026-10-27T19:29:34.905894Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120809"
  }
}
```

`POST /api/driver/v1/trips/304925e9-9228-41ef-8ee0-72feff61a90d/start` → **200**

```json
{
  "command_id": "f962d901-0c57-4c92-89de-8b9ec1b0f2fb",
  "expected_version": 1
}
```

```json
{
  "id": "304925e9-9228-41ef-8ee0-72feff61a90d",
  "order_id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
  "assignment_id": "03b12c5a-326e-494d-be72-0b7362356c64",
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
  "arrived_at": "2026-10-27T19:29:34.905894Z",
  "started_at": "2026-10-27T19:29:34.943217Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120809"
  }
}
```

`POST /api/driver/v1/trips/304925e9-9228-41ef-8ee0-72feff61a90d/complete` → **200**

```json
{
  "command_id": "ad28e2dc-b82c-4af4-9ad9-0537c3edeee2",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:29:34Z",
  "cash_received": true
}
```

```json
{
  "id": "304925e9-9228-41ef-8ee0-72feff61a90d",
  "order_id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
  "assignment_id": "03b12c5a-326e-494d-be72-0b7362356c64",
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
  "arrived_at": "2026-10-27T19:29:34.905894Z",
  "started_at": "2026-10-27T19:29:34.943217Z",
  "completed_at": "2026-10-27T19:29:35.00153Z",
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
  "command_id": "7e54d459-ae6a-48fc-b31c-4efaa1498b4d",
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
  "id": "ef62c4aa-7dce-48a0-8370-f34af551f83c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:34:35.056913Z",
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
  "command_id": "fc31800a-1afd-4107-a062-9b2af09277e8",
  "quote_id": "ef62c4aa-7dce-48a0-8370-f34af551f83c",
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
    "phone": "+3806711126804"
  }
}
```

```json
{
  "id": "9bc2913e-4342-4247-a65a-f1f2df2ba35c",
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
  "created_at": "2026-10-27T19:29:35.087539Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126804"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9bc2913e-4342-4247-a65a-f1f2df2ba35c` → **200**

```json
{
  "id": "9bc2913e-4342-4247-a65a-f1f2df2ba35c",
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
  "created_at": "2026-10-27T19:29:35.087539Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126804"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9bc2913e-4342-4247-a65a-f1f2df2ba35c/cancel` → **200**

```json
{
  "command_id": "6c8f6907-deee-4c13-b887-4b3666906065",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "9bc2913e-4342-4247-a65a-f1f2df2ba35c",
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
  "created_at": "2026-10-27T19:29:35.087539Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126804"
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
  "staff_id": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T19:29:35.012915Z",
  "last_entries": [
    {
      "order_id": "9bc2913e-4342-4247-a65a-f1f2df2ba35c",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T19:29:35.148414Z"
    },
    {
      "order_id": "ed683f48-fdc0-44b4-9cec-1d6db814792e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T19:29:35.012915Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "07540fc8-3655-4541-9325-4c934036e63b",
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
  "last_heartbeat_at": "2026-10-27T19:29:34.872245Z",
  "last_location_at": "2026-10-27T19:29:34.872245Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/07540fc8-3655-4541-9325-4c934036e63b/close` → **200**

```json
{
  "command_id": "924a6d1f-7696-42f2-bec7-e56f6f798d45",
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

Done: operator bonus for fulfilled ed683f48-fdc0-44b4-9cec-1d6db814792e and operator-fault cancellation 9bc2913e-4342-4247-a65a-f1f2df2ba35c.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676787174",
  "device_ref": "sandbox-13016"
}
```

```json
{
  "challenge_id": "7cd9c2bb-9833-4587-b0b5-e0ad90fd3557",
  "expires_at": "2026-10-27T19:34:37.268798838Z",
  "resend_available_at": "2026-10-27T19:29:38.268798838Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676787174` → **200**

```json
{
  "phone": "+380676787174",
  "audience": "CLIENT",
  "code": "467688",
  "sent_at": "2026-10-27T19:29:37.270506533Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671325016",
  "device_ref": "sandbox-4601",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a9572091-aeba-4d3b-a048-de5431841d67",
  "expires_at": "2026-10-27T19:34:37.312335778Z",
  "resend_available_at": "2026-10-27T19:29:38.312335778Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671325016` → **200**

```json
{
  "phone": "+380671325016",
  "audience": "CLIENT",
  "code": "053073",
  "sent_at": "2026-10-27T19:29:37.314271678Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672530000",
  "device_ref": "sandbox-6626"
}
```

```json
{
  "challenge_id": "618903d4-d093-4033-9d8e-f5be4e813d3a",
  "expires_at": "2026-10-27T19:34:37.354234095Z",
  "resend_available_at": "2026-10-27T19:29:38.354234095Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672530000` → **200**

```json
{
  "phone": "+380672530000",
  "audience": "CLIENT",
  "code": "175022",
  "sent_at": "2026-10-27T19:29:37.35640958Z",
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
  "session_id": "d5468acc-0fdf-4a3d-a895-b84b9d030896",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNzcsImlhdCI6MTc5MzEyOTM3NywianRpIjoiZjczNWRiYWItMDg1Mi00Yjg2LWJiYjAtNmNlZGI3YmQ5MTRhIiwic2lkIjoiZDU0NjhhY2MtMGZkZi00YTNkLWE4OTUtYjg0YjlkMDMwODk2In0.PsQvA2829YfPrzlLMb-dX5Fu8UyKUWSWVRvVURwaEQ0",
  "access_expires_at": "2026-10-27T19:44:37.60172182Z",
  "refresh_token": "giTkG2YKoAUKgUh_5nK65X9tIO-ruVgQim9LhhdpNe4",
  "refresh_expires_at": "2026-10-28T07:29:37.601268977Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672530000` → **200**

```json
{
  "deliveries": [
    {
      "id": "82f00d8f-46bb-4aa0-8cf6-607107e27ed3",
      "challenge_id": "618903d4-d093-4033-9d8e-f5be4e813d3a",
      "phone": "+380672530000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bbee78e4-c2f4-4b73-a0e3-a420ccb76134",
      "error": null,
      "attempted_at": "2026-10-27T19:29:37.356591Z"
    },
    {
      "id": "f76fdb22-0670-41a0-a43b-6c9dd66ba7b3",
      "challenge_id": "618903d4-d093-4033-9d8e-f5be4e813d3a",
      "phone": "+380672530000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-27T19:29:37.355939Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672530000` → **200**

```json
{
  "phone": "+380672530000",
  "audience": "CLIENT",
  "code": "175022",
  "sent_at": "2026-10-27T19:29:37.35640958Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671325016` → **200**

```json
{
  "deliveries": [
    {
      "id": "4f3963fb-329f-475e-880f-a4708b84e5c0",
      "challenge_id": "a9572091-aeba-4d3b-a048-de5431841d67",
      "phone": "+380671325016",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3586975e-acd2-4d6c-9528-1be84d1b62ac",
      "error": null,
      "attempted_at": "2026-10-27T19:29:37.314462Z"
    }
  ]
}
```

Done: SMS to +380676787174, a call to +380671325016, SMS then a call to +380672530000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633906381",
  "device_ref": "sandbox-9348"
}
```

```json
{
  "challenge_id": "addb9ce7-fd4f-4705-b288-be725d61bdff",
  "expires_at": "2026-10-27T19:34:37.705803702Z",
  "resend_available_at": "2026-10-27T19:29:38.705803702Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633906381` → **200**

```json
{
  "phone": "+380633906381",
  "audience": "CLIENT",
  "code": "265277",
  "sent_at": "2026-10-27T19:29:37.707101759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "addb9ce7-fd4f-4705-b288-be725d61bdff",
  "code": "265277",
  "device_ref": "sandbox-9348"
}
```

```json
{
  "session_id": "4d0acdd5-f0ce-430e-af75-e1cb0d5997a6",
  "subject": {
    "type": "CLIENT",
    "id": "b29c8bd0-722b-4973-a659-4f24b8c5bfcf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjljOGJkMC03MjJiLTQ5NzMtYTY1OS00ZjI0YjhjNWJmY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjc3LCJpYXQiOjE3OTMxMjkzNzcsImp0aSI6ImJjMWZkZjdiLTA4NWQtNDc4Ni1iZWZmLTAzNWQ5NTZjZDY0NSIsInNpZCI6IjRkMGFjZGQ1LWYwY2UtNDMwZS1hZjc1LWUxY2IwZDU5OTdhNiJ9.zSgT3mTyfmgvnkSfyVMsydDiDVC0wEqse2I5GswFgpU",
  "access_expires_at": "2026-10-27T19:44:37.750066755Z",
  "refresh_token": "mVFbyMndTNGIJ_-VMcNPygTXPFyCk8yxCuKmElZ-__Y",
  "refresh_expires_at": "2026-11-26T19:29:37.749597245Z",
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
  "session_id": "f65764d9-17fc-4cf3-ad59-febb0fb54eac",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNzgsImlhdCI6MTc5MzEyOTM3OCwianRpIjoiY2M0OGY0MDQtYzkyMi00MWRhLTg0MWEtMTQ3ZmFlNmIyNjAzIiwic2lkIjoiZjY1NzY0ZDktMTdmYy00Y2YzLWFkNTktZmViYjBmYjU0ZWFjIn0.xmeTGsVHZOWQlc5H9I_9_cf2FU1bo98EObHXDIaXEec",
  "access_expires_at": "2026-10-27T19:44:38.043568133Z",
  "refresh_token": "RsM8mRkrTzD2kYcJjQ2THN94tX7ytMNEHYpHcufSKMc",
  "refresh_expires_at": "2026-10-28T07:29:38.043175931Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633906381` → **200**

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
  "correlation_id": "bcb97431-ed0b-49b8-aaeb-79f2708eb171"
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
  "session_id": "3c9d4cf6-3d6c-4083-89ed-38e93ffd9d9f",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNzgsImlhdCI6MTc5MzEyOTM3OCwianRpIjoiZjg0NWEzY2QtYzMwNi00YjhjLWE5NTAtYmVkOWZmZDE1ZTcwIiwic2lkIjoiM2M5ZDRjZjYtM2Q2Yy00MDgzLTg5ZWQtMzhlOTNmZmQ5ZDlmIn0.-rYYpyU2LUoVtrt4nd3TPTkVLpMGDjFrBbke0obE-kM",
  "access_expires_at": "2026-10-27T19:44:38.329523899Z",
  "refresh_token": "OW4XYxEV9oKvqAiSabE1PfeI9qdlecQOtXj_fKY_BPc",
  "refresh_expires_at": "2026-10-28T07:29:38.329139159Z",
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
  "command_id": "e030e642-6bb4-44df-a907-2ab7d75916fb",
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
  "changed_by": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T19:29:38.388395413Z"
}
```

## The rider books the airport for 2026-10-27T22:29:38Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600566910",
  "device_ref": "sandbox-29741"
}
```

```json
{
  "challenge_id": "456aaf38-9bf1-4189-926c-88bfda6d5b39",
  "expires_at": "2026-10-27T19:34:38.414140317Z",
  "resend_available_at": "2026-10-27T19:29:39.414140317Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600566910` → **200**

```json
{
  "phone": "+48600566910",
  "audience": "CLIENT",
  "code": "024617",
  "sent_at": "2026-10-27T19:29:38.4156943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "456aaf38-9bf1-4189-926c-88bfda6d5b39",
  "code": "024617",
  "device_ref": "sandbox-29741"
}
```

```json
{
  "session_id": "fb7ebe9f-c06e-4d5e-8995-b41560b7d7e6",
  "subject": {
    "type": "CLIENT",
    "id": "35abc72e-d4f5-41d0-b50d-22b56ef14530"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWFiYzcyZS1kNGY1LTQxZDAtYjUwZC0yMmI1NmVmMTQ1MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjc4LCJpYXQiOjE3OTMxMjkzNzgsImp0aSI6ImFkMjAxY2ExLWJlMTYtNDFlYS1iMjRiLTIyMTRmZjBiNWYyNCIsInNpZCI6ImZiN2ViZTlmLWMwNmUtNGQ1ZS04OTk1LWI0MTU2MGI3ZDdlNiJ9.XNwtNYFtA3pdklVMcnSX9uIrvjnZ2J0cBG7VX1UtNac",
  "access_expires_at": "2026-10-27T19:44:38.45872944Z",
  "refresh_token": "SBrmH7pN_ZmWLDHAQEAA6DSQuv69VJnf5CBgxGsvlsc",
  "refresh_expires_at": "2026-11-26T19:29:38.458281449Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "769dd215-aeba-40ac-972b-aeee853116ab",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T22:29:38Z"
}
```

```json
{
  "id": "028c5c8b-d7e5-4006-9bf0-b7f7d1e50c33",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T19:34:38.486061Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:29:38Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "733c423e-32da-4519-98eb-43e47676525e",
  "quote_id": "028c5c8b-d7e5-4006-9bf0-b7f7d1e50c33",
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
  "pickup_at": "2026-10-27T22:29:38Z"
}
```

```json
{
  "id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "35abc72e-d4f5-41d0-b50d-22b56ef14530",
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
  "created_at": "2026-10-27T19:29:38.514477Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:29:38Z",
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
  "device_ref": "sandbox-8267"
}
```

```json
{
  "challenge_id": "3be2d763-1ddb-46c7-907c-04b9e14521a6",
  "expires_at": "2026-10-27T19:34:38.55189625Z",
  "resend_available_at": "2026-10-27T19:29:39.55189625Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "117156",
  "sent_at": "2026-10-27T19:29:38.553866101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3be2d763-1ddb-46c7-907c-04b9e14521a6",
  "code": "117156",
  "device_ref": "sandbox-8267"
}
```

```json
{
  "session_id": "f7837d34-6f7f-443a-9091-d54fc170d292",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI3OCwiaWF0IjoxNzkzMTI5Mzc4LCJqdGkiOiIwY2Y1MGJkMC1lY2EyLTQ2ODQtYmEwZC00MmQyMmMzYzhhZTgiLCJzaWQiOiJmNzgzN2QzNC02ZjdmLTQ0M2EtOTA5MS1kNTRmYzE3MGQyOTIifQ.lopZTDJ0j8Ui6ExwSsZCYVVY7nfVkJHDJNHSgiuhleM",
  "access_expires_at": "2026-10-27T19:44:38.599638223Z",
  "refresh_token": "5tjU_YWikoy38mAjaOy9kn4PmwXn3XeNjDJUs33VaIE",
  "refresh_expires_at": "2026-11-26T19:29:38.599235696Z",
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
  "command_id": "7f033bbd-7e30-4437-8b6c-a3d338fdc014",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:38Z",
    "sequence": 1793129378638
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a1c1a319-91d5-4bdc-a403-b61bd3f6beb2",
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
  "last_heartbeat_at": "2026-10-27T19:29:38.654044Z",
  "last_location_at": "2026-10-27T19:29:38.654044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
      "short_number": 13,
      "pickup_at": "2026-10-27T22:29:38Z",
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

`POST /api/driver/v1/preorders/9379fafa-6d2a-4f13-8ff8-8ca7268f706d/reserve` → **200**

```json
{
  "command_id": "96af7581-21db-48bb-ab98-30e2a87de5c6"
}
```

```json
{
  "id": "da59dcd2-e27b-4ac4-adb3-16dc7ae303c6",
  "state": "RESERVED",
  "order": {
    "order_id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
    "short_number": 13,
    "pickup_at": "2026-10-27T22:29:38Z",
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
  "reserved_at": "2026-10-27T19:29:38.70666Z",
  "confirm_from": "2026-10-27T21:59:38Z",
  "confirm_until": "2026-10-27T22:09:38Z",
  "drop_until": "2026-10-27T21:29:38Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "da59dcd2-e27b-4ac4-adb3-16dc7ae303c6",
      "state": "RESERVED",
      "order": {
        "order_id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:29:38Z",
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
      "reserved_at": "2026-10-27T19:29:38.70666Z",
      "confirm_from": "2026-10-27T21:59:38Z",
      "confirm_until": "2026-10-27T22:09:38Z",
      "drop_until": "2026-10-27T21:29:38Z"
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
      "id": "da59dcd2-e27b-4ac4-adb3-16dc7ae303c6",
      "state": "RESERVED",
      "order": {
        "order_id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:29:38Z",
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
      "reserved_at": "2026-10-27T19:29:38.70666Z",
      "confirm_from": "2026-10-27T21:59:38Z",
      "confirm_until": "2026-10-27T22:09:38Z",
      "drop_until": "2026-10-27T21:29:38Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/da59dcd2-e27b-4ac4-adb3-16dc7ae303c6/confirm` → **409**

```json
{
  "command_id": "4bcb597a-a975-407e-aec1-53d442266693"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/da59dcd2-e27b-4ac4-adb3-16dc7ae303c6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b50cba63-1834-4621-9168-dbf89d0554e6"
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
  "session_id": "bb240072-83b0-4d95-a7b7-c90512794683",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNzksImlhdCI6MTc5MzEyOTM3OSwianRpIjoiOGFkYWU3NzAtOTkzMS00MTMwLWIyZTYtNTE1ODA1NzM0M2U1Iiwic2lkIjoiYmIyNDAwNzItODNiMC00ZDk1LWE3YjctYzkwNTEyNzk0NjgzIn0.CoS0Z5P0MKTwOvqwKmru8nuvZgvY_f1WeYU_76HUo6g",
  "access_expires_at": "2026-10-27T19:44:39.005708677Z",
  "refresh_token": "yNQhfoRwHdErmfclgCyT9-K6qEwH4-DZFa8vBcGnlCo",
  "refresh_expires_at": "2026-10-28T07:29:39.005307442Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9379fafa-6d2a-4f13-8ff8-8ca7268f706d` → **200**

```json
{
  "id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "35abc72e-d4f5-41d0-b50d-22b56ef14530",
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
  "created_at": "2026-10-27T19:29:38.514477Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T22:29:38Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "da59dcd2-e27b-4ac4-adb3-16dc7ae303c6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T19:29:38.70666Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9379fafa-6d2a-4f13-8ff8-8ca7268f706d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T19:29:38.515498Z",
      "actor": {
        "type": "CLIENT",
        "id": "35abc72e-d4f5-41d0-b50d-22b56ef14530",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
        "preorder": true,
        "quote_id": "028c5c8b-d7e5-4006-9bf0-b7f7d1e50c33",
        "pickup_at": "2026-10-27T22:29:38Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T19:29:38.707497Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9379fafa-6d2a-4f13-8ff8-8ca7268f706d",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "da59dcd2-e27b-4ac4-adb3-16dc7ae303c6"
      }
    }
  ]
}
```

Done: pre-order 9379fafa-6d2a-4f13-8ff8-8ca7268f706d, reservation da59dcd2-e27b-4ac4-adb3-16dc7ae303c6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15313"
}
```

```json
{
  "challenge_id": "7d69cf6c-28d3-4ddf-ab05-966d146bf9cc",
  "expires_at": "2026-10-27T19:34:39.074408442Z",
  "resend_available_at": "2026-10-27T19:29:40.074408442Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "019937",
  "sent_at": "2026-10-27T19:29:39.076394393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d69cf6c-28d3-4ddf-ab05-966d146bf9cc",
  "code": "019937",
  "device_ref": "sandbox-15313"
}
```

```json
{
  "session_id": "b4ebdd69-ea2e-469e-bf07-84a8cf5a9740",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI3OSwiaWF0IjoxNzkzMTI5Mzc5LCJqdGkiOiI0YmQzNzM0Ni1jOTM1LTQwZDktYTNiNS00ZWFkMDNiM2Y5NjEiLCJzaWQiOiJiNGViZGQ2OS1lYTJlLTQ2OWUtYmYwNy04NGE4Y2Y1YTk3NDAifQ.JnAh-w7flNh3_cdry2KUkisKuAvvrgBrvaBUi5BNB9g",
  "access_expires_at": "2026-10-27T19:44:39.120195332Z",
  "refresh_token": "fgA92gz6dltYhX_4Ea8-JK6I_3NhYhNqT7HtnihwUlY",
  "refresh_expires_at": "2026-11-26T19:29:39.11966611Z",
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
  "command_id": "5605ca1d-3a41-407f-96e9-5a3100f9e437",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:39Z",
    "sequence": 1793129379159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90fbb1ed-ddde-463a-ac90-d064510c9e31",
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
  "last_heartbeat_at": "2026-10-27T19:29:39.172692Z",
  "last_location_at": "2026-10-27T19:29:39.172692Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677093406",
  "device_ref": "sandbox-15681"
}
```

```json
{
  "challenge_id": "044c64ab-46a2-46e7-bc56-6722bbea35ce",
  "expires_at": "2026-10-27T19:34:39.194861224Z",
  "resend_available_at": "2026-10-27T19:29:40.194861224Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677093406` → **200**

```json
{
  "phone": "+380677093406",
  "audience": "CLIENT",
  "code": "080062",
  "sent_at": "2026-10-27T19:29:39.196807416Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "044c64ab-46a2-46e7-bc56-6722bbea35ce",
  "code": "080062",
  "device_ref": "sandbox-15681"
}
```

```json
{
  "session_id": "67ee2eb4-ef5e-417e-8812-98b007542ef5",
  "subject": {
    "type": "CLIENT",
    "id": "b0072678-7937-407f-b228-256e80d0329b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDA3MjY3OC03OTM3LTQwN2YtYjIyOC0yNTZlODBkMDMyOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjc5LCJpYXQiOjE3OTMxMjkzNzksImp0aSI6IjViZWViYTdkLTQ2NmMtNGZkOS1iY2Q4LWI0Y2E5MTkzYTY3ZiIsInNpZCI6IjY3ZWUyZWI0LWVmNWUtNDE3ZS04ODEyLTk4YjAwNzU0MmVmNSJ9.PaT8wB-rLSMkAqKt2mYf_VYQU7YLSLCtZsFA6Rt-MuA",
  "access_expires_at": "2026-10-27T19:44:39.238937628Z",
  "refresh_token": "uZ0bhMXy6jDJKyoa8zMQNYkrBByE5ArRMPLdOVLFtdc",
  "refresh_expires_at": "2026-11-26T19:29:39.238578677Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e642f2c8-d409-4e8a-9a92-4d71daf90be5",
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
  "id": "aa68e26a-dfde-460e-a413-f95be756838d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:34:39.266281Z",
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
  "command_id": "69c367d8-5e05-4a4c-b6b3-a7945d7fb424",
  "quote_id": "aa68e26a-dfde-460e-a413-f95be756838d",
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
  "id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0072678-7937-407f-b228-256e80d0329b",
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
  "created_at": "2026-10-27T19:29:39.293676Z",
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
    "id": "75bf41ee-e036-4e22-8bbb-a9f2c28ae79a",
    "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
    "expires_at": "2026-10-27T19:29:54.296153Z",
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

`POST /api/driver/v1/offers/75bf41ee-e036-4e22-8bbb-a9f2c28ae79a/accept` → **200**

```json
{
  "command_id": "0c46fb2a-2170-4055-bf66-c7b24196d0d5"
}
```

```json
{
  "id": "f2555df4-0af6-4f6e-a22e-c55f2efb68d9",
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a538a48e-2eea-4b70-afdf-0043f474d09f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a538a48e-2eea-4b70-afdf-0043f474d09f",
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "assignment_id": "f2555df4-0af6-4f6e-a22e-c55f2efb68d9",
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

`POST /api/driver/v1/work-sessions/90fbb1ed-ddde-463a-ac90-d064510c9e31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:39Z",
    "sequence": 1793129379382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90fbb1ed-ddde-463a-ac90-d064510c9e31",
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
  "last_heartbeat_at": "2026-10-27T19:29:39.396249Z",
  "last_location_at": "2026-10-27T19:29:39.396249Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a538a48e-2eea-4b70-afdf-0043f474d09f",
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "assignment_id": "f2555df4-0af6-4f6e-a22e-c55f2efb68d9",
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

`POST /api/driver/v1/trips/a538a48e-2eea-4b70-afdf-0043f474d09f/arrive` → **200**

```json
{
  "command_id": "ca548cc8-6697-4801-97c2-2c331c19e0c7",
  "expected_version": 0
}
```

```json
{
  "id": "a538a48e-2eea-4b70-afdf-0043f474d09f",
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "assignment_id": "f2555df4-0af6-4f6e-a22e-c55f2efb68d9",
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
  "arrived_at": "2026-10-27T19:29:39.434869Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a538a48e-2eea-4b70-afdf-0043f474d09f/start` → **200**

```json
{
  "command_id": "c48278be-eee2-4688-b7dc-5e5d2e5fe5f9",
  "expected_version": 1
}
```

```json
{
  "id": "a538a48e-2eea-4b70-afdf-0043f474d09f",
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "assignment_id": "f2555df4-0af6-4f6e-a22e-c55f2efb68d9",
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
  "arrived_at": "2026-10-27T19:29:39.434869Z",
  "started_at": "2026-10-27T19:29:39.460981Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/90fbb1ed-ddde-463a-ac90-d064510c9e31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:39Z",
    "sequence": 1793129379479
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90fbb1ed-ddde-463a-ac90-d064510c9e31",
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
  "last_heartbeat_at": "2026-10-27T19:29:39.49319Z",
  "last_location_at": "2026-10-27T19:29:39.49319Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a538a48e-2eea-4b70-afdf-0043f474d09f/complete` → **200**

```json
{
  "command_id": "f3dbe40b-d79d-44a2-8b0e-b33d5defa874",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:29:39Z",
  "cash_received": true
}
```

```json
{
  "id": "a538a48e-2eea-4b70-afdf-0043f474d09f",
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "assignment_id": "f2555df4-0af6-4f6e-a22e-c55f2efb68d9",
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
  "arrived_at": "2026-10-27T19:29:39.434869Z",
  "started_at": "2026-10-27T19:29:39.460981Z",
  "completed_at": "2026-10-27T19:29:39.520377Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f4c8a93a-d25c-435a-a685-b4d885d63dcd/rating` → **200**

```json
{
  "command_id": "03b84415-f2a2-4040-8d75-77ddb6e99db3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "score": 5,
  "created_at": "2026-10-27T19:29:39.562190016Z"
}
```

`POST /api/driver/v1/orders/f4c8a93a-d25c-435a-a685-b4d885d63dcd/rating` → **200**

```json
{
  "command_id": "c284482b-61f1-4de4-b8a2-8d6aec40ac23",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
  "score": 4,
  "created_at": "2026-10-27T19:29:39.589719727Z"
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
  "session_id": "7875c911-4539-4c13-abb9-22bedecdc9a8",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyNzksImlhdCI6MTc5MzEyOTM3OSwianRpIjoiYWI1NTIxOGEtOWY1YS00Mzc4LThjMTYtMDhiMDUyYzViNzdmIiwic2lkIjoiNzg3NWM5MTEtNDUzOS00YzEzLWFiYjktMjJiZWRlY2RjOWE4In0._ktVKozGnHPDOD6wbMRJV2ynS4aTD8fw7ECQPwJ4uKE",
  "access_expires_at": "2026-10-27T19:44:39.845878332Z",
  "refresh_token": "vlTTHZYg01DhxK4k731eQUuqZZI83Uh0m2a-2apgfJE",
  "refresh_expires_at": "2026-10-28T07:29:39.845529946Z",
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
  "session_id": "42d05097-6c4b-4fa0-bb0a-f949d105d330",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyODAsImlhdCI6MTc5MzEyOTM4MCwianRpIjoiODgyZWFhNmEtZGEwNi00NDc3LWFjNWQtYWMxZmRhNTVhZjUxIiwic2lkIjoiNDJkMDUwOTctNmM0Yi00ZmEwLWJiMGEtZjk0OWQxMDVkMzMwIn0.QzaHdBJHvxBA7DmKacH1QrCNtAt2EP5Ts7AkZt5hgHs",
  "access_expires_at": "2026-10-27T19:44:40.078506815Z",
  "refresh_token": "Sq49hP4pkM9ex72LrJKXgArArdhiExiybYel30ZIhfk",
  "refresh_expires_at": "2026-10-28T07:29:40.0781387Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f4c8a93a-d25c-435a-a685-b4d885d63dcd/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
      "author_type": "RIDER",
      "author_id": "b0072678-7937-407f-b228-256e80d0329b",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T19:29:39.56219Z"
    },
    {
      "order_id": "f4c8a93a-d25c-435a-a685-b4d885d63dcd",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "b0072678-7937-407f-b228-256e80d0329b",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T19:29:39.58972Z"
    }
  ]
}
```

Done: ratings for order f4c8a93a-d25c-435a-a685-b4d885d63dcd.

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
  "session_id": "e158c2bd-7d52-442f-85bf-7bfc8802be84",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyODAsImlhdCI6MTc5MzEyOTM4MCwianRpIjoiMjIwZDE0YmQtNjg2MC00ZTUxLWIyMmYtNDc1YmVkZjgyOWU1Iiwic2lkIjoiZTE1OGMyYmQtN2Q1Mi00NDJmLTg1YmYtN2JmYzg4MDJiZTg0In0.mU86VenLL4CHSFnQU_3los2XdiPA16QjZFYRn-uZnUo",
  "access_expires_at": "2026-10-27T19:44:40.354490049Z",
  "refresh_token": "9ic6VZD0XqytFAf5fUaoAqY5wishVarASBHvf5hA7P0",
  "refresh_expires_at": "2026-10-28T07:29:40.354171248Z",
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
  "command_id": "28b572db-f070-455b-8647-7071fbd24a5f",
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
  "changed_by": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:29:40.415327Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "28b572db-f070-455b-8647-7071fbd24a5f",
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
  "changed_by": "9bcea283-7d9f-45b2-9752-cc609904ae72",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:29:40.415327Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48950231106",
  "device_ref": "sandbox-21077"
}
```

```json
{
  "challenge_id": "8643246b-92d3-4462-89da-aea516829cc0",
  "expires_at": "2026-10-27T19:34:40.49461829Z",
  "resend_available_at": "2026-10-27T19:29:41.49461829Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48950231106` → **200**

```json
{
  "phone": "+48950231106",
  "audience": "CLIENT",
  "code": "701552",
  "sent_at": "2026-10-27T19:29:40.49947311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8643246b-92d3-4462-89da-aea516829cc0",
  "code": "701552",
  "device_ref": "sandbox-21077"
}
```

```json
{
  "session_id": "cc7fbae0-7b61-47a0-a7b5-7e2a77581935",
  "subject": {
    "type": "CLIENT",
    "id": "21cc78bb-a9f7-4446-b17f-1eedbdfea8a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMWNjNzhiYi1hOWY3LTQ0NDYtYjE3Zi0xZWVkYmRmZWE4YTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjgwLCJpYXQiOjE3OTMxMjkzODAsImp0aSI6IjUwYjNhMmRjLWU5OTktNDllOC1iNmMwLTYxMjk3NjQzYjVjNCIsInNpZCI6ImNjN2ZiYWUwLTdiNjEtNDdhMC1hN2I1LTdlMmE3NzU4MTkzNSJ9.FfzfK9fN1-fjyHiGsmRnzg7xz5lFS7DiqOkNT7hPdBs",
  "access_expires_at": "2026-10-27T19:44:40.552966894Z",
  "refresh_token": "ioQIn3brofG74fAF3O_ACsRgWDmHlVJWoHruW49R55A",
  "refresh_expires_at": "2026-11-26T19:29:40.552627132Z",
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
  "correlation_id": "e8cd4490-d488-4258-96bb-b61336625379"
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
  "device_ref": "sandbox-10732"
}
```

```json
{
  "challenge_id": "52fa8796-83c2-4fc8-a1e3-b39ab7961648",
  "expires_at": "2026-10-27T19:34:40.651131274Z",
  "resend_available_at": "2026-10-27T19:29:41.651131274Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "194829",
  "sent_at": "2026-10-27T19:29:40.653573901Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52fa8796-83c2-4fc8-a1e3-b39ab7961648",
  "code": "194829",
  "device_ref": "sandbox-10732"
}
```

```json
{
  "session_id": "4499f26b-e1b5-4492-8c59-b2f105b3eadc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI4MCwiaWF0IjoxNzkzMTI5MzgwLCJqdGkiOiJlOGZkYzYxNS03MjBjLTQ3MTctYjE0Yi0xNTYwZDA0YmFkN2MiLCJzaWQiOiI0NDk5ZjI2Yi1lMWI1LTQ0OTItOGM1OS1iMmYxMDViM2VhZGMifQ.rzhANePWAxZubJi597k5UdvVmnKC8YiuF-f84XcXevI",
  "access_expires_at": "2026-10-27T19:44:40.700782514Z",
  "refresh_token": "BxHkcNs1glIgTUXTBjqPmbG3o0vb7nnuIgGgpTorGUk",
  "refresh_expires_at": "2026-11-26T19:29:40.700305665Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a1c1a319-91d5-4bdc-a403-b61bd3f6beb2",
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
  "last_heartbeat_at": "2026-10-27T19:29:38.654044Z",
  "last_location_at": "2026-10-27T19:29:38.654044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1c1a319-91d5-4bdc-a403-b61bd3f6beb2/handover` → **200**

```json
{
  "command_id": "3d044bda-db3e-430c-b818-e19b7817eed4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a1c1a319-91d5-4bdc-a403-b61bd3f6beb2",
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
  "last_heartbeat_at": "2026-10-27T19:29:38.654044Z",
  "last_location_at": "2026-10-27T19:29:38.654044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1c1a319-91d5-4bdc-a403-b61bd3f6beb2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:40Z",
    "sequence": 1793129380771
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a1c1a319-91d5-4bdc-a403-b61bd3f6beb2",
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
  "last_heartbeat_at": "2026-10-27T19:29:40.787297Z",
  "last_location_at": "2026-10-27T19:29:40.787297Z",
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
  "session_id": "a1c1a319-91d5-4bdc-a403-b61bd3f6beb2",
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
  "last_heartbeat_at": "2026-10-27T19:29:40.787297Z",
  "last_location_at": "2026-10-27T19:29:40.787297Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1c1a319-91d5-4bdc-a403-b61bd3f6beb2/close` → **200**

```json
{
  "command_id": "7c661e97-d325-4f27-b758-82c57631fb79",
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
  "correlation_id": "c8437b83-5ac2-4045-a605-d8fe9e9662d4"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675316303",
  "device_ref": "sandbox-22505"
}
```

```json
{
  "challenge_id": "4b0b775d-80ef-4dee-b8b3-392c4cb668d6",
  "expires_at": "2026-10-27T19:34:40.924146511Z",
  "resend_available_at": "2026-10-27T19:29:41.924146511Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675316303` → **200**

```json
{
  "phone": "+380675316303",
  "audience": "CLIENT",
  "code": "648535",
  "sent_at": "2026-10-27T19:29:40.925740977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b0b775d-80ef-4dee-b8b3-392c4cb668d6",
  "code": "648535",
  "device_ref": "sandbox-22505"
}
```

```json
{
  "session_id": "289ba6da-32a1-44ce-a88a-e603ff564a28",
  "subject": {
    "type": "CLIENT",
    "id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5M2EyYTI1Yi02ZmMwLTQ5ZDQtYWFkNy05NWFlYmJiODEwY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMwMjgwLCJpYXQiOjE3OTMxMjkzODAsImp0aSI6ImIzYTMxZTNiLTgxYTktNDcwNC1iZmVkLTRmZGVhYTkzMGY3YiIsInNpZCI6IjI4OWJhNmRhLTMyYTEtNDRjZS1hODhhLWU2MDNmZjU2NGEyOCJ9.eXWcRj_JYUgr53GCDdXBjOVnOe0e7GPHMi7e-_XDvfs",
  "access_expires_at": "2026-10-27T19:44:40.969566536Z",
  "refresh_token": "aH4X380ZkKvLAi6iHGAT4vcXrFjhE0qpZG4m-xRptTY",
  "refresh_expires_at": "2026-11-26T19:29:40.969206623Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f27b22dd-4cf7-4a79-a4da-868a346101c1",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "18ec296c-763e-4a50-8bae-77d17f019b9b",
  "upload_path": "/api/rider/v1/uploads/18ec296c-763e-4a50-8bae-77d17f019b9b",
  "expires_at": "2026-10-27T19:44:40.998200766Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/18ec296c-763e-4a50-8bae-77d17f019b9b` → **200**

```json
{
  "file_id": "18ec296c-763e-4a50-8bae-77d17f019b9b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "70097027-caf9-4109-b84f-2c33de73d869",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "18ec296c-763e-4a50-8bae-77d17f019b9b"
  ]
}
```

```json
{
  "id": "726ec030-4313-482e-b1dd-6e9c2d07215f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:29:41.05284Z",
  "updated_at": "2026-10-27T19:29:41.05284Z",
  "messages": [
    {
      "id": "3e0468e8-ac5c-4765-8f34-94b86956a00c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:29:41.053936Z",
      "attachments": [
        {
          "file_id": "18ec296c-763e-4a50-8bae-77d17f019b9b",
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
  "session_id": "6bf19ff2-e0c1-4a6b-bc1b-650180a1dbcd",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyODEsImlhdCI6MTc5MzEyOTM4MSwianRpIjoiMTY4YjE4MzItNjc3ZS00MGYzLTgzNDQtMTMyNGY4YmE0ZTA3Iiwic2lkIjoiNmJmMTlmZjItZTBjMS00YTZiLWJjMWItNjUwMTgwYTFkYmNkIn0.DVi6pAoFc1uDk_0SWhUJj-j4BxZz37aC5e2qpJUsfNU",
  "access_expires_at": "2026-10-27T19:44:41.301881741Z",
  "refresh_token": "VpUFPD9TFv9OdQeSQNWMRZF0DSG4cPcHuLmUAUfhSYA",
  "refresh_expires_at": "2026-10-28T07:29:41.301428962Z",
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
  "session_id": "fc4ec337-7522-4db0-a0fb-efec03a9f791",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyODEsImlhdCI6MTc5MzEyOTM4MSwianRpIjoiNDE4ODVhMjUtMjk2MS00ZjgzLWIzNjgtYjExZjkzOGJhYTExIiwic2lkIjoiZmM0ZWMzMzctNzUyMi00ZGIwLWEwZmItZWZlYzAzYTlmNzkxIn0.JdSGx9ib4Gv-fL-AhCi2wS9fjXopKgR88O6TOn7eWDk",
  "access_expires_at": "2026-10-27T19:44:41.529364979Z",
  "refresh_token": "O_J3EsqPv7ZbCcQt0SSNADSnTHu-irgO84XDwrxilqg",
  "refresh_expires_at": "2026-10-28T07:29:41.529032978Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/726ec030-4313-482e-b1dd-6e9c2d07215f/attachments/18ec296c-763e-4a50-8bae-77d17f019b9b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ca15410e-f039-499b-ae91-82e0e6d4e867",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c50d40d6-5025-4c26-b151-77ee1675059e",
  "upload_path": "/api/operator/v1/uploads/c50d40d6-5025-4c26-b151-77ee1675059e",
  "expires_at": "2026-10-27T19:44:41.56844695Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c50d40d6-5025-4c26-b151-77ee1675059e` → **200**

```json
{
  "file_id": "c50d40d6-5025-4c26-b151-77ee1675059e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/726ec030-4313-482e-b1dd-6e9c2d07215f` → **200**

```json
{
  "id": "726ec030-4313-482e-b1dd-6e9c2d07215f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:29:41.05284Z",
  "updated_at": "2026-10-27T19:29:41.05284Z",
  "messages": [
    {
      "id": "3e0468e8-ac5c-4765-8f34-94b86956a00c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:29:41.053936Z",
      "attachments": [
        {
          "file_id": "18ec296c-763e-4a50-8bae-77d17f019b9b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/726ec030-4313-482e-b1dd-6e9c2d07215f/comments` → **200**

```json
{
  "command_id": "4d828237-6b6c-4a82-be9b-4e35db8b53a3",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c50d40d6-5025-4c26-b151-77ee1675059e"
  ]
}
```

```json
{
  "id": "726ec030-4313-482e-b1dd-6e9c2d07215f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:29:41.05284Z",
  "updated_at": "2026-10-27T19:29:41.642973Z",
  "messages": [
    {
      "id": "3e0468e8-ac5c-4765-8f34-94b86956a00c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:29:41.053936Z",
      "attachments": [
        {
          "file_id": "18ec296c-763e-4a50-8bae-77d17f019b9b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e63dd93c-d08a-4612-a979-cbf1cc83a4c8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "9bcea283-7d9f-45b2-9752-cc609904ae72",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:29:41.642729Z",
      "attachments": [
        {
          "file_id": "c50d40d6-5025-4c26-b151-77ee1675059e",
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

`GET /api/rider/v1/support/cases/726ec030-4313-482e-b1dd-6e9c2d07215f` → **200**

```json
{
  "id": "726ec030-4313-482e-b1dd-6e9c2d07215f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:29:41.05284Z",
  "updated_at": "2026-10-27T19:29:41.642973Z",
  "messages": [
    {
      "id": "3e0468e8-ac5c-4765-8f34-94b86956a00c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "93a2a25b-6fc0-49d4-aad7-95aebbb810cb",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:29:41.053936Z",
      "attachments": [
        {
          "file_id": "18ec296c-763e-4a50-8bae-77d17f019b9b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e63dd93c-d08a-4612-a979-cbf1cc83a4c8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:29:41.642729Z",
      "attachments": [
        {
          "file_id": "c50d40d6-5025-4c26-b151-77ee1675059e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/726ec030-4313-482e-b1dd-6e9c2d07215f/attachments/c50d40d6-5025-4c26-b151-77ee1675059e` → **200**

Done: support case 726ec030-4313-482e-b1dd-6e9c2d07215f, rider attachment 18ec296c-763e-4a50-8bae-77d17f019b9b, operator attachment c50d40d6-5025-4c26-b151-77ee1675059e.

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
  "session_id": "fda6fe47-3cc3-4c3d-b2fd-11d57651fd5d",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyODEsImlhdCI6MTc5MzEyOTM4MSwianRpIjoiMGRhYzA0NGQtMTg3ZS00YmQzLWI4YTMtMTRkYzExYmU3NjdjIiwic2lkIjoiZmRhNmZlNDctM2NjMy00YzNkLWIyZmQtMTFkNTc2NTFmZDVkIn0.ULy4xScHFV86b5djPTxNbg_608PxNiXHmZHeNyuV3-k",
  "access_expires_at": "2026-10-27T19:44:41.928006025Z",
  "refresh_token": "XIX3gSh6Y2qpwW3LOfILaIZKHwT-1sRo853Jdc813Oc",
  "refresh_expires_at": "2026-10-28T07:29:41.927685361Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31589"
}
```

```json
{
  "challenge_id": "ce3bba52-d9a2-43a6-bc62-08507411b07f",
  "expires_at": "2026-10-27T19:34:41.950690349Z",
  "resend_available_at": "2026-10-27T19:29:42.950690349Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "360009",
  "sent_at": "2026-10-27T19:29:41.952033173Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce3bba52-d9a2-43a6-bc62-08507411b07f",
  "code": "360009",
  "device_ref": "sandbox-31589"
}
```

```json
{
  "session_id": "3c912da9-157c-44f9-8f53-a4d4b036cdab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI4MSwiaWF0IjoxNzkzMTI5MzgxLCJqdGkiOiIxODkyZGIxMC0wZTIxLTQzYmQtYmFmNS1iNzBjZjY5MThlNTAiLCJzaWQiOiIzYzkxMmRhOS0xNTdjLTQ0ZjktOGY1My1hNGQ0YjAzNmNkYWIifQ.Ir5FP468NKTCXb9SkTTIY3_G3Z6bAtHe0KP5fFw7rNU",
  "access_expires_at": "2026-10-27T19:44:41.997403849Z",
  "refresh_token": "YFKP8v0t5WoxTllDYHOS8EPe2dUrWPo6-59KeC9wais",
  "refresh_expires_at": "2026-11-26T19:29:41.997046079Z",
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
  "command_id": "87088794-c6a1-47dd-a042-492b9a15fba4",
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
  "device_ref": "sandbox-6837"
}
```

```json
{
  "challenge_id": "508bd524-1fad-411d-9686-36fee82d5c80",
  "expires_at": "2026-10-27T19:34:42.109954288Z",
  "resend_available_at": "2026-10-27T19:29:43.109954288Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "992790",
  "sent_at": "2026-10-27T19:29:42.115463389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "508bd524-1fad-411d-9686-36fee82d5c80",
  "code": "992790",
  "device_ref": "sandbox-6837"
}
```

```json
{
  "session_id": "501ed5cc-547e-495b-8f7e-a847849b0ef6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMDI4MiwiaWF0IjoxNzkzMTI5MzgyLCJqdGkiOiI3YzIyYzQ1Zi1lNTNmLTRjZTQtYWRiNi1jNTUzNTExZWRkN2YiLCJzaWQiOiI1MDFlZDVjYy01NDdlLTQ5NWItOGY3ZS1hODQ3ODQ5YjBlZjYifQ.XqTb1mjJPlCeNRHOl59e9mn7NuScAy6_jcaHheaX5UI",
  "access_expires_at": "2026-10-27T19:44:42.168357331Z",
  "refresh_token": "_TN7eMj9xPdNCBsSV6KtANZhSggN0_50azXGIy9Tyck",
  "refresh_expires_at": "2026-11-26T19:29:42.167977719Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90fbb1ed-ddde-463a-ac90-d064510c9e31",
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
  "last_heartbeat_at": "2026-10-27T19:29:39.49319Z",
  "last_location_at": "2026-10-27T19:29:39.49319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90fbb1ed-ddde-463a-ac90-d064510c9e31/handover` → **200**

```json
{
  "command_id": "d8145c24-f829-4a08-aa47-6a29da598751",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90fbb1ed-ddde-463a-ac90-d064510c9e31",
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
  "last_heartbeat_at": "2026-10-27T19:29:39.49319Z",
  "last_location_at": "2026-10-27T19:29:39.49319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90fbb1ed-ddde-463a-ac90-d064510c9e31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:42Z",
    "sequence": 1793129382234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90fbb1ed-ddde-463a-ac90-d064510c9e31",
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
  "last_heartbeat_at": "2026-10-27T19:29:42.248905Z",
  "last_location_at": "2026-10-27T19:29:42.248905Z",
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
  "command_id": "98a06dfd-0b7f-438c-bad8-f76160df0f97",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:42Z",
    "sequence": 1793129382285
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7393b9a1-480d-4a19-8c83-6b5b0da3f052",
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
  "last_heartbeat_at": "2026-10-27T19:29:42.299165Z",
  "last_location_at": "2026-10-27T19:29:42.299165Z",
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
  "session_id": "d8d54c53-d087-4169-9052-86c4dc55e523",
  "subject": {
    "type": "STAFF",
    "id": "9bcea283-7d9f-45b2-9752-cc609904ae72"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YmNlYTI4My03ZDlmLTQ1YjItOTc1Mi1jYzYwOTkwNGFlNzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzAyODIsImlhdCI6MTc5MzEyOTM4MiwianRpIjoiMTkzZjhmYjMtODU4My00MTIzLTkzZDEtZWMwNGI3OTQ5ODRhIiwic2lkIjoiZDhkNTRjNTMtZDA4Ny00MTY5LTkwNTItODZjNGRjNTVlNTIzIn0.hqa7zAcYTfkP7a_ICkKKrFW5M-9aZoOMRsMJ_XTyH8w",
  "access_expires_at": "2026-10-27T19:44:42.536849106Z",
  "refresh_token": "581z0GaNsdwQjHLqyheZNCmJg1BuvUAkYpJhve_k63Q",
  "refresh_expires_at": "2026-10-28T07:29:42.536281864Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bd24575b-1a06-4c09-bf25-4cb12e77ad1b",
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
  "id": "4538a1c9-f79d-41ab-8e4b-a72760563a76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:34:42.564304Z",
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
  "command_id": "a3ffac56-e8ec-485d-9879-277f6d00549b",
  "quote_id": "4538a1c9-f79d-41ab-8e4b-a72760563a76",
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
  "id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
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
  "created_at": "2026-10-27T19:29:42.593584Z",
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
    "id": "07e1b69f-e812-4ae4-be59-0d0f33cd1409",
    "order_id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
    "expires_at": "2026-10-27T19:29:57.595973Z",
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

`POST /api/driver/v1/offers/07e1b69f-e812-4ae4-be59-0d0f33cd1409/accept` → **200**

```json
{
  "command_id": "5fad0ab7-fb1d-45fe-a792-9463283ed747"
}
```

```json
{
  "id": "ebf39c89-9b27-450f-8a87-ebb812020e25",
  "order_id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a409d61-2a3d-4b60-bd91-965557eb3a8f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a409d61-2a3d-4b60-bd91-965557eb3a8f",
  "order_id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
  "assignment_id": "ebf39c89-9b27-450f-8a87-ebb812020e25",
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

`POST /api/driver/v1/work-sessions/7393b9a1-480d-4a19-8c83-6b5b0da3f052/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:29:42Z",
    "sequence": 1793129382695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7393b9a1-480d-4a19-8c83-6b5b0da3f052",
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
  "last_heartbeat_at": "2026-10-27T19:29:42.709329Z",
  "last_location_at": "2026-10-27T19:29:42.709329Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4a409d61-2a3d-4b60-bd91-965557eb3a8f/arrive` → **200**

```json
{
  "command_id": "6d5add37-1987-407a-af31-2e901c9e4188",
  "expected_version": 0
}
```

```json
{
  "id": "4a409d61-2a3d-4b60-bd91-965557eb3a8f",
  "order_id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
  "assignment_id": "ebf39c89-9b27-450f-8a87-ebb812020e25",
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
  "arrived_at": "2026-10-27T19:29:42.735858Z",
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

`POST /api/driver/v1/trips/4a409d61-2a3d-4b60-bd91-965557eb3a8f/start` → **200**

```json
{
  "command_id": "0d22cbe3-d482-4b23-8f34-e49c849522a9",
  "expected_version": 1
}
```

```json
{
  "id": "4a409d61-2a3d-4b60-bd91-965557eb3a8f",
  "order_id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
  "assignment_id": "ebf39c89-9b27-450f-8a87-ebb812020e25",
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
  "arrived_at": "2026-10-27T19:29:42.735858Z",
  "started_at": "2026-10-27T19:29:42.767697Z",
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

`POST /api/driver/v1/trips/4a409d61-2a3d-4b60-bd91-965557eb3a8f/complete` → **200**

```json
{
  "command_id": "cac6f877-71dc-4fca-a5b1-fbe0160de604",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:29:42Z",
  "cash_received": true
}
```

```json
{
  "id": "4a409d61-2a3d-4b60-bd91-965557eb3a8f",
  "order_id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
  "assignment_id": "ebf39c89-9b27-450f-8a87-ebb812020e25",
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
  "arrived_at": "2026-10-27T19:29:42.735858Z",
  "started_at": "2026-10-27T19:29:42.767697Z",
  "completed_at": "2026-10-27T19:29:42.800068Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/513e2b5f-c743-40cf-8b77-811db11a4c76` → **200**

```json
{
  "id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
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
    "id": "ebf39c89-9b27-450f-8a87-ebb812020e25",
    "order_id": "513e2b5f-c743-40cf-8b77-811db11a4c76",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4a409d61-2a3d-4b60-bd91-965557eb3a8f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:29:42.593584Z",
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
  "session_id": "90fbb1ed-ddde-463a-ac90-d064510c9e31",
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
  "last_heartbeat_at": "2026-10-27T19:29:42.248905Z",
  "last_location_at": "2026-10-27T19:29:42.248905Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90fbb1ed-ddde-463a-ac90-d064510c9e31/close` → **200**

```json
{
  "command_id": "be190158-05d1-4312-b93f-b05f2b587426",
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
  "session_id": "7393b9a1-480d-4a19-8c83-6b5b0da3f052",
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
  "last_heartbeat_at": "2026-10-27T19:29:42.709329Z",
  "last_location_at": "2026-10-27T19:29:42.709329Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7393b9a1-480d-4a19-8c83-6b5b0da3f052/close` → **200**

```json
{
  "command_id": "ee41423b-d141-4f15-9d81-1221663e8bb5",
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

Done: terminal order 513e2b5f-c743-40cf-8b77-811db11a4c76 by Andrii (5a000000-0000-4000-8000-000000000403).
